package 디자인패턴.템플릿메서드패턴;

import javax.naming.ldap.LdapContext;

public class LdapAuthenticator {
	public Auth authenticate(String id, String pw) {
		// 사용자 정보로 인증 확인
		boolean lauth = ldapClient.authenticate(id, pw);

		// 인증 실패시 익셉션 발생
		if (!lauth)
			throw createException();

		// 인증 성공시, 인증 정보 제공
		LdapContext ctx = ldapClient.find(id);
		return new Auth(id, ctx.getAttributes("name"));
	}

	private AuthException createException() {
		return new AuthException();
	}
}
