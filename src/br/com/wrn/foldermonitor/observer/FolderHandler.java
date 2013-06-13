package br.com.wrn.foldermonitor.observer;

import java.util.EventListener;

import br.com.wrn.foldermonitor.event.FolderEvent;

public interface FolderHandler<T extends FolderEvent> extends EventListener {
	void action(T paramFileEvent);
}