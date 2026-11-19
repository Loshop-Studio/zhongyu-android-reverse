package com.tencent.smtt.audio.core.mvp;

import com.tencent.smtt.audio.export.AudioLog;

/* loaded from: libtbs.audio_base.jar.so:com/tencent/smtt/audio/core/mvp/PlayListController.class */
public class PlayListController extends PlayListBaseImpl {
    private static PlayListController instance = null;

    private PlayListController() {
    }

    public static PlayListController getInstance() {
        synchronized (PlayListController.class) {
            if (instance == null) {
                instance = new PlayListController();
            }
            AudioLog.i("playlist init");
        }
        return instance;
    }
}
