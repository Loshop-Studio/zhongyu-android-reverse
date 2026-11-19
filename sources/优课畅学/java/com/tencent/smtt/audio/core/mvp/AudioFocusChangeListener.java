package com.tencent.smtt.audio.core.mvp;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.AudioManager;
import com.tencent.mtt.ContextHolder;
import com.tencent.smtt.audio.export.AudioLog;
import com.tencent.smtt.audio.export.IAudioPresenter;

@TargetApi(8)
/* loaded from: libtbs.audio_base.jar.so:com/tencent/smtt/audio/core/mvp/AudioFocusChangeListener.class */
public class AudioFocusChangeListener implements AudioManager.OnAudioFocusChangeListener {
    private IAudioPresenter audioPlayer;
    private static AudioFocusChangeListener instance = null;
    private boolean isPausedByFocusChange = false;
    private Context mContext = ContextHolder.getAppContext();
    private AudioManager am = (AudioManager) this.mContext.getSystemService("audio");

    private AudioFocusChangeListener() {
    }

    public boolean isFocusChange(boolean isDefault) {
        int result = this.am.requestAudioFocus(this, 3, 1);
        if (result == 1) {
            return true;
        }
        return false;
    }

    public void setFouseUnChange() {
        AudioLog.i("setFouseUnChange");
        this.am.abandonAudioFocus(this);
        this.isPausedByFocusChange = false;
    }

    public static AudioFocusChangeListener getInstance() {
        synchronized (AudioFocusChangeListener.class) {
            if (instance == null) {
                instance = new AudioFocusChangeListener();
            }
        }
        return instance;
    }

    public void init(IAudioPresenter audioPlayer) {
        this.audioPlayer = audioPlayer;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public void onAudioFocusChange(int focusChange) {
        try {
            AudioLog.i("onAudioFocusChange focusChange is" + focusChange);
            if (focusChange == -2) {
                if (this.audioPlayer.isPlaying()) {
                    this.isPausedByFocusChange = true;
                    this.audioPlayer.pause();
                }
            } else if (focusChange == 1) {
                if (!this.audioPlayer.isPlaying() && this.isPausedByFocusChange) {
                    this.audioPlayer.start();
                    this.isPausedByFocusChange = false;
                }
            } else if (focusChange == -1) {
                if (this.audioPlayer.isPlaying()) {
                    this.isPausedByFocusChange = true;
                    this.audioPlayer.pause();
                }
                this.am.abandonAudioFocus(this);
            } else if (focusChange == 1) {
                if (this.audioPlayer.isPlaying()) {
                    this.isPausedByFocusChange = true;
                    this.audioPlayer.pause();
                }
            } else if (focusChange == 0) {
                if (this.audioPlayer.isPlaying()) {
                    this.isPausedByFocusChange = true;
                    this.audioPlayer.pause();
                }
            } else if (focusChange == -3 && this.audioPlayer.isPlaying()) {
                this.isPausedByFocusChange = true;
                this.audioPlayer.pause();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
