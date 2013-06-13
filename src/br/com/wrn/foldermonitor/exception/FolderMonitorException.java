package br.com.wrn.foldermonitor.exception;

public class FolderMonitorException extends Exception {

	private static final long serialVersionUID = 7709936071130375404L;

	public FolderMonitorException(String message) {
		super(message);
	}

	public FolderMonitorException(String message, Throwable cause) {
		super(message, cause);
	}
}