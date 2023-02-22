package singletons;

public class SingletonLazyHolder {
	private static class SingletonHolder {
		public static final SingletonLazyHolder instance = new SingletonLazyHolder();
	} 

	private SingletonLazyHolder() {
		super();
	}

	public static SingletonLazyHolder getInstance() {
		return SingletonHolder.instance;
	}
}
