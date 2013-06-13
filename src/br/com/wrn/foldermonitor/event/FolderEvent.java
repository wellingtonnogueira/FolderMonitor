package br.com.wrn.foldermonitor.event;

import java.io.File;
import java.util.EventObject;
import java.util.Set;

import br.com.wrn.foldermonitor.observer.FolderAction;

public class FolderEvent<T extends FolderAction> extends EventObject {
	private static final long serialVersionUID = -779466653283279891L;

	public FolderEvent(T source) {
		super(source);
	}

	public FolderEvent(Set<File> files) {
		super(files);
	}

	public Set<File> getFiles() {
		return (Set<File>) getSource();
	}
}