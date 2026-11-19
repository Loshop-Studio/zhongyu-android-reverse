package com.tencent.smtt.audio.core.impl;

import com.tencent.smtt.audio.export.interfaces.ITbsAudioPlayerControler;

/* loaded from: libtbs.audio_base.jar.so:com/tencent/smtt/audio/core/impl/AudioPlayerControlerImpl.class */
public class AudioPlayerControlerImpl implements ITbsAudioPlayerControler {
    public boolean shouldUseTbsMediaPlayer(String webUrl) {
        return true;
    }
}
