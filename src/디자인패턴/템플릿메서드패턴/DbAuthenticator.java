package 디자인패턴.템플릿메서드패턴;

public class DbAuthenticator {

	@Override
	protected boolean doAuthenticate(String id, String pw) {
		User user = userDao.selectById(id);
		return user.equalPassword(pw);
	}

	@Override
	protected Auth createAuth(String id) {
		return new Auth(id, user.getName());
	}
}
