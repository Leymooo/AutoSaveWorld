package autosaveworld.threads.restart;

public class RestartWaiter {

	public static void init() {
	}

	private static volatile int waittorestart = 0;

	public static boolean shouldWait() {
		return waittorestart != 0;
	}

	public static void incrementWait() {
		waittorestart++;
	}

	public static void decrementWait() {
		if (waittorestart > 0) {
			waittorestart--;
		}
	}

}
