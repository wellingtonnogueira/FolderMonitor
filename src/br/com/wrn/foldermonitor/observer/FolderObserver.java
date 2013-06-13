package br.com.wrn.foldermonitor.observer;

import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import br.com.wrn.foldermonitor.event.FolderEvent;

public abstract class FolderObserver {
	
	private final Map<FolderAction, Set<FolderHandler<FolderEvent>>> listeners = new HashMap<FolderAction, Set<FolderHandler<FolderEvent>>>();
	
	public synchronized final void addAction(FolderAction action, FolderHandler<FolderEvent> listener) {
		Set<FolderHandler<FolderEvent>> set = this.listeners.get(action);
		if(set == null) {
			set = new HashSet<FolderHandler<FolderEvent>>();
			this.listeners.put(action, set);
		}
		set.add(listener);
	}
	
	public synchronized final void removeAction(FolderAction action, FolderHandler<FolderEvent> listener) {
		Set<FolderHandler<FolderEvent>> set = this.listeners.get(action);
		if(set == null) {
			return;
		}
		set.remove(listener);
	}
	
	protected synchronized void clearListeners() {
		
		for (FolderAction key : this.listeners.keySet()) {
			this.listeners.get(key).clear();
		}
		this.listeners.clear();
	}
	
	protected final void fireFolderAction(FolderAction action, Set<File> files) {
		Set<FolderHandler<FolderEvent>> set = this.listeners.get(action);
		if(set == null) {
			return;
		}
		
		for (FolderHandler<FolderEvent> folderHandler : set) {
			FolderEvent<FolderAction> event = new FolderEvent<FolderAction>(files);
			folderHandler.action(event);
		}
	}
	
	
//	protected final void fireAddFilesListener(Set<File> files) {
//		Set list = (Set) this.listeners.get("ADD");
//		if (list == null)
//			return;
//		for (FilesListener listener : list) {
//			FolderEvent e = new FolderEvent(files);
//			listener.added(e);
//		}
//	}
//
//	protected final void fireUpdateFilesListener(Set<File> files) {
//		Set list = (Set) this.listeners.get("UPDATE");
//		if (list == null)
//			return;
//		for (FilesListener listener : list) {
//			FolderEvent e = new FolderEvent(files);
//			listener.updated(e);
//		}
//	}
//
//	protected final void fireRemoveFilesListener(Set<File> files) {
//		Set list = (Set) this.listeners.get("REMOVE");
//		if (list == null)
//			return;
//		for (FilesListener listener : list) {
//			FolderEvent e = new FolderEvent(files);
//			listener.removed(e);
//		}
//	}

}