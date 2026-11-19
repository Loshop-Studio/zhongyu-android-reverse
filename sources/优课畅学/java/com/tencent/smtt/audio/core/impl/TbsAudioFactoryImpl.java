package com.tencent.smtt.audio.core.impl;

import com.tencent.smtt.audio.core.mvp.AudioPresenterImpl;
import com.tencent.smtt.audio.core.mvp.AudioStateController;
import com.tencent.smtt.audio.core.mvp.RemoteAudioBusinessPlayer;
import com.tencent.smtt.audio.core.mvp.RemotePlayerProxy;
import com.tencent.smtt.audio.export.AudioLog;
import com.tencent.smtt.audio.export.IAudioPresenter;
import com.tencent.smtt.audio.export.IMediaPlayer;
import com.tencent.smtt.audio.export.ITbsAudioFactory;
import com.tencent.smtt.audio.export.TbsAudioEngine;
import com.tencent.smtt.audio.export.interfaces.IMediaPlayerBusiness;
import com.tencent.smtt.audio.export.interfaces.RemoteMediaPlayer;

/* loaded from: libtbs.audio_base.jar.so:com/tencent/smtt/audio/core/impl/TbsAudioFactoryImpl.class */
public class TbsAudioFactoryImpl implements ITbsAudioFactory {
    private static final String TAG = "TbsAudioFactoryImpl";
    private static int mId = 0;
    private RemoteMediaPlayer mRemoteMediaPlayer;
    private IMediaPlayerBusiness business;
    private IMediaPlayer originMediaPlayer;

    public RemoteMediaPlayer getRemoteMediaPlayer() {
        AudioLog.i("getRemoteMediaPlayer");
        TbsAudioEngine.getsInstance().getAudioPresenter().setMode(0);
        AudioStateController.setCycleType(0);
        RemoteAudioBusinessPlayer.getInstance().resetForNextAudioPlayIfNeed();
        try {
            TbsAudioEngine.getsInstance().getAudioPresenter().getView().onAudioLoadStart(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new RemotePlayerProxy();
    }

    public IMediaPlayerBusiness getBusinessCore() {
        return this.business;
    }

    public boolean shouldUseTbsMediaPlayer(String url) {
        return true;
    }

    public IAudioPresenter getAudioPresenter() {
        return AudioPresenterImpl.getInstance();
    }
}
