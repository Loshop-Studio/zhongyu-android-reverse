package com.tencent.smtt.audio.core.mvp;

import com.tencent.smtt.audio.export.IMediaPlayer;
import com.tencent.smtt.audio.export.interfaces.RemoteMediaPlayer;
import com.tencent.smtt.audio.export.interfaces.RemotePlayerListener;

/* loaded from: libtbs.audio_base.jar.so:com/tencent/smtt/audio/core/mvp/IAudioBusinessWrapper.class */
public interface IAudioBusinessWrapper extends RemoteMediaPlayer, RemotePlayerListener {
    void setMediaPlayer(IMediaPlayer iMediaPlayer);

    void resetStatus();

    void realRelease();

    String getX5AudioAuthor();

    String getX5AudioTitle();

    String getX5AudioCoverUrl();
}
