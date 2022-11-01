package 디자인패턴.템플릿메서드패턴;

public abstract class Authenticator {
	// 템플릿 메서드
	public Auth authenticate(String id, String pw) {
		if (!doAuthenticate(id, pw))
			throw createException();

		return createAuth(id);
	}

	protected abstract boolean doAuthenticate(String id, String pw);

	private RuntimeException createException() {
		throw new AuthException();
	}

	protected abstract Auth createAuth(String id);
}
