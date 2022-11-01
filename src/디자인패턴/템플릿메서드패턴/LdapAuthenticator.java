package 디자인패턴.템플릿메서드패턴;

import javax.naming.ldap.LdapContext;

public class LdapAuthenticator extends Authenticator {

	@Override
	protected boolean doAuthenticate(String id, String pw) {
		return ldapClient.authenticate(id, pw);
	}

	@Override
	protected Auth createAuth(String id) {
		LdapContext ctx = ldapClient.find(id);
		return new Auth(id, ctx.getAttributes("name"));
	}
}
