package com.tencent.liteav.audio;

import com.tencent.liteav.audio.TXAudioEffectManager;
import com.tencent.liteav.audio.impl.Play.TXCMultAudioTrackPlayer;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.C6592e;
import java.lang.ref.WeakReference;

/* loaded from: classes4.dex */
public class TXCUGCBGMPlayer implements TXAudioEffectManager.TXMusicPlayObserver {
    private static final int PLAY_ERR_OPEN = -1;
    private static final int PLAY_SUCCESS = 0;
    private static final String TAG = "AudioCenter:TXCUGCBGMPlayer";
    private int mBGMId;
    private long mEndTimeMS;
    private boolean mIsRunning;
    private long mSeekBytes;
    private float mSpeedRate;
    private long mStartTimeMS;
    private float mVolume;
    private WeakReference<InterfaceC6546f> mWeakListener;

    /* renamed from: com.tencent.liteav.audio.TXCUGCBGMPlayer$a */
    public static class C6540a {

        /* renamed from: a */
        private static TXCUGCBGMPlayer f5098a = new TXCUGCBGMPlayer();

        /* renamed from: a */
        public static TXCUGCBGMPlayer m4726a() {
            return f5098a;
        }
    }

    static {
        C6592e.m5058f();
    }

    public static TXCUGCBGMPlayer getInstance() {
        return C6540a.m4726a();
    }

    private void onPlayEnd(int i10) {
        InterfaceC6546f interfaceC6546f;
        synchronized (this) {
            try {
                WeakReference<InterfaceC6546f> weakReference = this.mWeakListener;
                interfaceC6546f = weakReference != null ? weakReference.get() : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (interfaceC6546f != null) {
            interfaceC6546f.m4738a(i10);
        }
    }

    private void onPlayProgress(long j10, long j11) {
        InterfaceC6546f interfaceC6546f;
        synchronized (this) {
            try {
                WeakReference<InterfaceC6546f> weakReference = this.mWeakListener;
                interfaceC6546f = weakReference != null ? weakReference.get() : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (interfaceC6546f != null) {
            interfaceC6546f.m4739a(j10, j11);
        }
    }

    private void onPlayStart() {
        InterfaceC6546f interfaceC6546f;
        synchronized (this) {
            try {
                WeakReference<InterfaceC6546f> weakReference = this.mWeakListener;
                interfaceC6546f = weakReference != null ? weakReference.get() : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (interfaceC6546f != null) {
            interfaceC6546f.m4737a();
        }
    }

    public long getDurationMS(String str) {
        return TXAudioEffectManagerImpl.getCacheInstance().getMusicDurationInMS(str);
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver
    public void onComplete(int i10, int i11) {
        onPlayEnd(i11);
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver
    public void onStart(int i10, int i11) {
        onPlayStart();
    }

    public void pause() {
        TXCLog.m4994i(TAG, "pause");
        TXAudioEffectManagerImpl.getCacheInstance().pausePlayMusic(this.mBGMId);
    }

    public void playFromTime(long j10, long j11) {
        TXCLog.m4994i(TAG, "startPlayRange:" + j10 + ", " + j11);
        this.mStartTimeMS = j10;
        this.mEndTimeMS = j11;
    }

    public void resume() {
        TXCLog.m4994i(TAG, "resume");
        TXAudioEffectManagerImpl.getCacheInstance().resumePlayMusic(this.mBGMId);
    }

    public void seekBytes(long j10) {
        TXCLog.m4994i(TAG, "seekBytes:" + j10);
        if (j10 < 0) {
            TXCLog.m4991e(TAG, "seek bytes can not be negative. change to 0");
            j10 = 0;
        }
        this.mSeekBytes = j10;
        TXAudioEffectManagerImpl.getCacheInstance().seekMusicToPosInBytes(this.mBGMId, j10);
    }

    public void setChangerType(int i10) {
        TXCLog.m4994i(TAG, "changerType:" + i10);
        TXAudioEffectManagerImpl.getCacheInstance().setMusicChangerType(this.mBGMId, i10);
    }

    public synchronized void setOnPlayListener(InterfaceC6546f interfaceC6546f) {
        if (interfaceC6546f == null) {
            try {
                this.mWeakListener = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.mWeakListener = new WeakReference<>(interfaceC6546f);
    }

    public void setReverbType(int i10) {
        TXCLog.m4994i(TAG, "int reverbType:" + i10);
        TXAudioEffectManagerImpl.getCacheInstance().setMusicReverbType(this.mBGMId, i10);
    }

    public void setSpeedRate(float f10) {
        TXCLog.m4994i(TAG, "setSpeedRate:" + f10);
        this.mSpeedRate = f10;
        TXAudioEffectManagerImpl.getCacheInstance().setMusicPlayoutSpeedRate(this.mBGMId, f10);
    }

    public void setVolume(float f10) {
        TXCLog.m4994i(TAG, "setVolume:" + f10);
        this.mVolume = f10;
        TXAudioEffectManagerImpl.getCacheInstance().setMusicVolume(this.mBGMId, (int) (f10 * 100.0f));
    }

    public void startPlay(String str, boolean z10) {
        TXCLog.m4994i(TAG, "startPlay:" + str + "record:" + z10);
        if (str == null || str.isEmpty()) {
            return;
        }
        if (this.mIsRunning) {
            TXCLog.m4998w(TAG, "BGM is playing, restarting...");
            stopPlay();
        }
        this.mSeekBytes = 0L;
        this.mIsRunning = true;
        TXAudioEffectManager.AudioMusicParam audioMusicParam = new TXAudioEffectManager.AudioMusicParam(this.mBGMId, str);
        audioMusicParam.publish = z10;
        audioMusicParam.loopCount = 0;
        audioMusicParam.startTimeMS = this.mStartTimeMS;
        audioMusicParam.endTimeMS = this.mEndTimeMS;
        audioMusicParam.isShortFile = true;
        TXCLog.m4994i(TAG, "start bgm play : filePath = " + str + " publish:" + z10 + " startTimeMS:" + this.mStartTimeMS + " endTimeMS:" + this.mEndTimeMS + " isShortFile:" + audioMusicParam.isShortFile + "mVolume:" + this.mVolume);
        TXAudioEffectManagerImpl.getCacheInstance().setMusicVolume(this.mBGMId, (int) (this.mVolume * 100.0f));
        TXAudioEffectManagerImpl.getCacheInstance().setMusicPlayoutSpeedRate(this.mBGMId, this.mSpeedRate);
        if (z10) {
            TXAudioEffectManagerImpl.getCacheInstance().setMuteDataDurationToPublish(this.mBGMId, 200);
        }
        boolean zStartPlayMusic = TXAudioEffectManagerImpl.getCacheInstance().startPlayMusic(audioMusicParam);
        TXAudioEffectManagerImpl.getCacheInstance().setMusicObserver(this.mBGMId, this);
        if (zStartPlayMusic) {
            onPlayStart();
        } else {
            onPlayEnd(-1);
        }
    }

    public void stopPlay() {
        TXCLog.m4994i(TAG, "stopPlay");
        this.mIsRunning = false;
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (this) {
            TXAudioEffectManagerImpl.getCacheInstance().setMusicObserver(this.mBGMId, null);
            TXAudioEffectManagerImpl.getCacheInstance().stopPlayMusic(this.mBGMId);
        }
        TXCLog.m4994i(TAG, "stopBGMPlay cost(MS): " + (System.currentTimeMillis() - jCurrentTimeMillis));
    }

    private TXCUGCBGMPlayer() {
        this.mWeakListener = null;
        this.mIsRunning = false;
        this.mVolume = 1.0f;
        this.mSpeedRate = 1.0f;
        this.mStartTimeMS = 0L;
        this.mEndTimeMS = 0L;
        this.mSeekBytes = 0L;
        this.mBGMId = Integer.MIN_VALUE;
        TXCMultAudioTrackPlayer.getInstance();
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver
    public void onPlayProgress(int i10, long j10, long j11) {
        onPlayProgress(j10, j11);
    }
}
