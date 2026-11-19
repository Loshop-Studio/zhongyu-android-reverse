package com.tencent.liteav.audio;

import android.os.Handler;
import android.os.Looper;
import com.tencent.liteav.audio.TXAudioEffectManager;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.C6592e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class TXAudioEffectManagerImpl implements TXAudioEffectManager {
    private static final int EFFECT_PLAYER_ID_TYPE = 2;
    private static final int NEW_BGM_PLAYER_ID_TYPE = 1;
    private static final int OLD_BGM_PLAYER_ID_TYPE = 0;
    private static final String TAG = "AudioCenter:TXAudioEffectManager";
    private final int mIdType;
    private List<Long> mPlayingMusicIDList;
    private static HashMap<Long, TXAudioEffectManager.TXMusicPlayObserver> mMusicObserverMap = new HashMap<>();
    private static final Handler mMainHandler = new Handler(Looper.getMainLooper());

    public static class AudioEffectManagerAutoCacheHolder {
        private static TXAudioEffectManagerImpl INSTANCE = new TXAudioEffectManagerImpl(1);

        private AudioEffectManagerAutoCacheHolder() {
        }
    }

    public static class AudioEffectManagerCacheHolder {
        private static TXAudioEffectManagerImpl INSTANCE = new TXAudioEffectManagerImpl(2);

        private AudioEffectManagerCacheHolder() {
        }
    }

    public static class AudioEffectManagerHolder {
        private static TXAudioEffectManagerImpl INSTANCE = new TXAudioEffectManagerImpl(0);

        private AudioEffectManagerHolder() {
        }
    }

    static {
        C6592e.m5058f();
        nativeClassInit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long convertIdToInt64(int i10, int i11) {
        return i11 | (i10 << 32);
    }

    public static TXAudioEffectManagerImpl getAutoCacheHolder() {
        return AudioEffectManagerAutoCacheHolder.INSTANCE;
    }

    public static TXAudioEffectManagerImpl getCacheInstance() {
        return AudioEffectManagerCacheHolder.INSTANCE;
    }

    public static TXAudioEffectManagerImpl getInstance() {
        return AudioEffectManagerHolder.INSTANCE;
    }

    private static native void nativeClassInit();

    private native long nativeGetCurrentPositionInMs(long j10);

    private static native long nativeGetDurationMSByPath(String str);

    private native void nativePause(long j10);

    private native void nativeResume(long j10);

    private native void nativeSeekToPosition(long j10, long j11);

    private native void nativeSeekToTime(long j10, int i10);

    private native void nativeSetAllVolume(int i10);

    private native void nativeSetChangerType(long j10, int i10);

    private native void nativeSetMuteDataDurationToPublish(long j10, int i10);

    private native void nativeSetPitch(long j10, float f10);

    private native void nativeSetPlayoutSpeedRate(long j10, float f10);

    private native void nativeSetPlayoutVolume(long j10, int i10);

    private native void nativeSetPublishVolume(long j10, int i10);

    private native void nativeSetReverbType(long j10, int i10);

    private native void nativeSetSpeedRate(long j10, float f10);

    private native void nativeSetVolume(long j10, int i10);

    private native boolean nativeStartPlay(long j10, String str, int i10, boolean z10, boolean z11);

    private native void nativeStartPlayRange(long j10, long j11, long j12);

    private native void nativeStopPlay(long j10);

    public static void onEffectFinish(final long j10, final int i10) {
        mMainHandler.post(new Runnable() { // from class: com.tencent.liteav.audio.TXAudioEffectManagerImpl.3
            @Override // java.lang.Runnable
            public void run() {
                TXCLog.m4994i(TXAudioEffectManagerImpl.TAG, "onEffectFinish -> effect id = " + j10 + ", errCode = " + i10);
                if (TXAudioEffectManagerImpl.mMusicObserverMap.get(Long.valueOf(j10)) != null) {
                    ((TXAudioEffectManager.TXMusicPlayObserver) TXAudioEffectManagerImpl.mMusicObserverMap.get(Long.valueOf(j10))).onComplete((int) j10, i10);
                }
            }
        });
    }

    public static void onEffectProgress(final long j10, final long j11, final long j12) {
        mMainHandler.post(new Runnable() { // from class: com.tencent.liteav.audio.TXAudioEffectManagerImpl.5
            @Override // java.lang.Runnable
            public void run() {
                if (TXAudioEffectManagerImpl.mMusicObserverMap.get(Long.valueOf(j10)) != null) {
                    ((TXAudioEffectManager.TXMusicPlayObserver) TXAudioEffectManagerImpl.mMusicObserverMap.get(Long.valueOf(j10))).onPlayProgress((int) j10, j11, j12);
                }
            }
        });
    }

    public static void onEffectStart(final long j10, final int i10) {
        mMainHandler.post(new Runnable() { // from class: com.tencent.liteav.audio.TXAudioEffectManagerImpl.4
            @Override // java.lang.Runnable
            public void run() {
                TXCLog.m4994i(TXAudioEffectManagerImpl.TAG, "onEffectStart -> effect id = " + j10 + ", errCode = " + i10);
                if (TXAudioEffectManagerImpl.mMusicObserverMap.get(Long.valueOf(j10)) != null) {
                    ((TXAudioEffectManager.TXMusicPlayObserver) TXAudioEffectManagerImpl.mMusicObserverMap.get(Long.valueOf(j10))).onStart((int) j10, i10);
                }
            }
        });
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void enableVoiceEarMonitor(boolean z10) {
        TXCAudioEngine.getInstance();
        TXCAudioEngine.enableAudioEarMonitoring(z10);
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public long getMusicCurrentPosInMS(int i10) {
        return nativeGetCurrentPositionInMs(convertIdToInt64(this.mIdType, i10));
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public long getMusicDurationInMS(String str) {
        return nativeGetDurationMSByPath(str);
    }

    public void interruptAllMusics() {
        TXCLog.m4994i(TAG, "interruptAllMusics");
        Iterator<Long> it = this.mPlayingMusicIDList.iterator();
        while (it.hasNext()) {
            nativePause(it.next().longValue());
        }
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void pausePlayMusic(int i10) {
        long jConvertIdToInt64 = convertIdToInt64(this.mIdType, i10);
        this.mPlayingMusicIDList.remove(Long.valueOf(jConvertIdToInt64));
        nativePause(jConvertIdToInt64);
    }

    public void recoverAllMusics() {
        TXCLog.m4994i(TAG, "recoverAllMusics");
        Iterator<Long> it = this.mPlayingMusicIDList.iterator();
        while (it.hasNext()) {
            nativeResume(it.next().longValue());
        }
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void resumePlayMusic(int i10) {
        long jConvertIdToInt64 = convertIdToInt64(this.mIdType, i10);
        if (!this.mPlayingMusicIDList.contains(Long.valueOf(jConvertIdToInt64))) {
            this.mPlayingMusicIDList.add(Long.valueOf(jConvertIdToInt64));
        }
        nativeResume(jConvertIdToInt64);
    }

    public void seekMusicToPosInBytes(int i10, long j10) {
        nativeSeekToPosition(convertIdToInt64(this.mIdType, i10), j10);
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void seekMusicToPosInMS(int i10, int i11) {
        nativeSeekToTime(convertIdToInt64(this.mIdType, i10), i11);
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void setAllMusicVolume(int i10) {
        nativeSetAllVolume(i10);
    }

    public void setAudioPlayoutVolume(int i10) {
        TXCAudioEngine.getInstance().setMixingPlayoutVolume(i10 / 100.0f);
    }

    public void setMusicChangerType(int i10, int i11) {
        nativeSetChangerType(convertIdToInt64(this.mIdType, i10), i11);
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void setMusicObserver(final int i10, final TXAudioEffectManager.TXMusicPlayObserver tXMusicPlayObserver) {
        Runnable runnable = new Runnable() { // from class: com.tencent.liteav.audio.TXAudioEffectManagerImpl.1
            @Override // java.lang.Runnable
            public void run() {
                if (tXMusicPlayObserver == null) {
                    TXAudioEffectManagerImpl.mMusicObserverMap.remove(Long.valueOf(TXAudioEffectManagerImpl.convertIdToInt64(TXAudioEffectManagerImpl.this.mIdType, i10)));
                } else {
                    TXAudioEffectManagerImpl.mMusicObserverMap.put(Long.valueOf(TXAudioEffectManagerImpl.convertIdToInt64(TXAudioEffectManagerImpl.this.mIdType, i10)), tXMusicPlayObserver);
                }
                TXCLog.m4995i(TXAudioEffectManagerImpl.TAG, "setMusicObserver map count: %d", Integer.valueOf(TXAudioEffectManagerImpl.mMusicObserverMap.size()));
            }
        };
        Looper looperMyLooper = Looper.myLooper();
        Handler handler = mMainHandler;
        if (looperMyLooper == handler.getLooper()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void setMusicPitch(int i10, float f10) {
        nativeSetPitch(convertIdToInt64(this.mIdType, i10), f10);
    }

    public void setMusicPlayoutSpeedRate(int i10, float f10) {
        nativeSetPlayoutSpeedRate(convertIdToInt64(this.mIdType, i10), f10);
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void setMusicPlayoutVolume(int i10, int i11) {
        nativeSetPlayoutVolume(convertIdToInt64(this.mIdType, i10), i11);
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void setMusicPublishVolume(int i10, int i11) {
        nativeSetPublishVolume(convertIdToInt64(this.mIdType, i10), i11);
    }

    public void setMusicReverbType(int i10, int i11) {
        nativeSetReverbType(convertIdToInt64(this.mIdType, i10), i11);
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void setMusicSpeedRate(int i10, float f10) {
        nativeSetSpeedRate(convertIdToInt64(this.mIdType, i10), f10);
    }

    public void setMusicVolume(int i10, int i11) {
        TXCLog.m4994i(TAG, "setMusicVolume " + i11);
        nativeSetVolume(convertIdToInt64(this.mIdType, i10), i11);
    }

    public void setMuteDataDurationToPublish(int i10, int i11) {
        nativeSetMuteDataDurationToPublish(convertIdToInt64(this.mIdType, i10), i11);
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void setVoiceCaptureVolume(int i10) {
        TXCAudioEngine.getInstance().setSoftwareCaptureVolume(i10 / 100.0f);
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void setVoiceChangerType(TXAudioEffectManager.TXVoiceChangerType tXVoiceChangerType) {
        TXCAudioEngine.getInstance().setVoiceChangerType(tXVoiceChangerType);
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void setVoiceEarMonitorVolume(int i10) {
        TXCAudioEngine.getInstance();
        TXCAudioEngine.setAudioEarMonitoringVolume(i10);
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void setVoiceReverbType(TXAudioEffectManager.TXVoiceReverbType tXVoiceReverbType) {
        TXCAudioEngine.getInstance().setReverbType(tXVoiceReverbType);
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public boolean startPlayMusic(TXAudioEffectManager.AudioMusicParam audioMusicParam) {
        TXCLog.m4994i(TAG, "startPlay");
        long j10 = audioMusicParam.startTimeMS;
        long j11 = audioMusicParam.endTimeMS;
        long j12 = j10 < 0 ? 0L : j10;
        long j13 = j11 < 0 ? 0L : j11;
        long jConvertIdToInt64 = convertIdToInt64(this.mIdType, audioMusicParam.f5086id);
        if (!this.mPlayingMusicIDList.contains(Long.valueOf(jConvertIdToInt64))) {
            this.mPlayingMusicIDList.add(Long.valueOf(jConvertIdToInt64));
        }
        nativeStartPlayRange(jConvertIdToInt64, j12, j13);
        return nativeStartPlay(jConvertIdToInt64, audioMusicParam.path, audioMusicParam.loopCount, audioMusicParam.publish, audioMusicParam.isShortFile);
    }

    public void stopAllMusics() {
        TXCLog.m4994i(TAG, "stopAllMusics");
        Iterator<Long> it = this.mPlayingMusicIDList.iterator();
        while (it.hasNext()) {
            final long jLongValue = it.next().longValue();
            nativeStopPlay(jLongValue);
            mMainHandler.post(new Runnable() { // from class: com.tencent.liteav.audio.TXAudioEffectManagerImpl.2
                @Override // java.lang.Runnable
                public void run() {
                    TXAudioEffectManagerImpl.mMusicObserverMap.remove(Long.valueOf(jLongValue));
                }
            });
        }
        this.mPlayingMusicIDList.clear();
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void stopPlayMusic(int i10) {
        long jConvertIdToInt64 = convertIdToInt64(this.mIdType, i10);
        this.mPlayingMusicIDList.remove(Long.valueOf(jConvertIdToInt64));
        nativeStopPlay(jConvertIdToInt64);
    }

    private TXAudioEffectManagerImpl(int i10) {
        this.mPlayingMusicIDList = new ArrayList();
        this.mIdType = i10;
    }
}
