package registerSystem.core;

import registerSystem.GoogleManager.GoogleAuthSystemManager;

public class GoogleAuthSystemManagerAdapter implements AuthSystemService{

	public void login() {
		GoogleAuthSystemManager authSystemManager = new GoogleAuthSystemManager();
		authSystemManager.login();
	}
}
