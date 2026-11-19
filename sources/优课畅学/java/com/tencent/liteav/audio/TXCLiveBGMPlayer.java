package com.tencent.liteav.audio;

import android.os.Handler;
import android.os.Looper;
import com.tencent.liteav.audio.TXAudioEffectManager;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.C6592e;
import java.lang.ref.WeakReference;

/* loaded from: classes4.dex */
public class TXCLiveBGMPlayer implements TXAudioEffectManager.TXMusicPlayObserver {
    private static final int PLAY_ERR_OPEN = -1;
    private static final int PLAY_SUCCESS = 0;
    private static final String TAG = "AudioCenter:TXCLiveBGMPlayer";
    private int mBGMId;
    private final Handler mHandler;
    private boolean mIsPause;
    private boolean mIsRunning;
    private WeakReference<InterfaceC6546f> mWeakListener;

    /* renamed from: com.tencent.liteav.audio.TXCLiveBGMPlayer$a */
    public static class C6537a {

        /* renamed from: a */
        private static TXCLiveBGMPlayer f5096a = new TXCLiveBGMPlayer();

        /* renamed from: a */
        public static TXCLiveBGMPlayer m4724a() {
            return f5096a;
        }
    }

    static {
        C6592e.m5058f();
    }

    public static TXCLiveBGMPlayer getInstance() {
        return C6537a.m4724a();
    }

    private void onPlayEnd(final int i10) {
        final InterfaceC6546f interfaceC6546f;
        synchronized (this) {
            try {
                WeakReference<InterfaceC6546f> weakReference = this.mWeakListener;
                interfaceC6546f = weakReference != null ? weakReference.get() : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.mHandler.post(new Runnable() { // from class: com.tencent.liteav.audio.TXCLiveBGMPlayer.2
            @Override // java.lang.Runnable
            public void run() {
                InterfaceC6546f interfaceC6546f2 = interfaceC6546f;
                if (interfaceC6546f2 != null) {
                    interfaceC6546f2.m4738a(i10);
                }
            }
        });
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:18:0x0027
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1178)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    private void onPlayProgress(final long r9, final long r11) throws java.lang.Throwable {
        /*
            r8 = this;
            monitor-enter(r8)
            java.lang.ref.WeakReference<com.tencent.liteav.audio.f> r0 = r8.mWeakListener     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto L11
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> Ld
            com.tencent.liteav.audio.f r0 = (com.tencent.liteav.audio.InterfaceC6546f) r0     // Catch: java.lang.Throwable -> Ld
        Lb:
            r3 = r0
            goto L13
        Ld:
            r0 = move-exception
            r9 = r0
            r2 = r8
            goto L25
        L11:
            r0 = 0
            goto Lb
        L13:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L22
            android.os.Handler r0 = r8.mHandler
            com.tencent.liteav.audio.TXCLiveBGMPlayer$3 r1 = new com.tencent.liteav.audio.TXCLiveBGMPlayer$3
            r2 = r8
            r4 = r9
            r6 = r11
            r1.<init>()
            r0.post(r1)
            return
        L22:
            r0 = move-exception
            r2 = r8
        L24:
            r9 = r0
        L25:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L27
            throw r9
        L27:
            r0 = move-exception
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.audio.TXCLiveBGMPlayer.onPlayProgress(long, long):void");
    }

    private void onPlayStart(int i10) {
        final InterfaceC6546f interfaceC6546f;
        synchronized (this) {
            try {
                WeakReference<InterfaceC6546f> weakReference = this.mWeakListener;
                interfaceC6546f = weakReference != null ? weakReference.get() : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.mHandler.post(new Runnable() { // from class: com.tencent.liteav.audio.TXCLiveBGMPlayer.1
            @Override // java.lang.Runnable
            public void run() {
                InterfaceC6546f interfaceC6546f2 = interfaceC6546f;
                if (interfaceC6546f2 != null) {
                    interfaceC6546f2.m4737a();
                }
            }
        });
    }

    public int getBGMDuration(String str) {
        return (int) TXAudioEffectManagerImpl.getInstance().getMusicDurationInMS(str);
    }

    public long getBGMGetCurrentProgressInMs(String str) {
        if (str == null) {
            return TXAudioEffectManagerImpl.getInstance().getMusicCurrentPosInMS(this.mBGMId);
        }
        return 0L;
    }

    public boolean isPlaying() {
        return this.mIsRunning;
    }

    public boolean isRunning() {
        return this.mIsRunning && !this.mIsPause;
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver
    public void onComplete(int i10, int i11) {
        onPlayEnd(i11);
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver
    public void onStart(int i10, int i11) {
        onPlayStart(i11);
    }

    public boolean pause() {
        TXCLog.m4994i(TAG, "pause");
        this.mIsPause = true;
        TXAudioEffectManagerImpl.getInstance().pausePlayMusic(this.mBGMId);
        return true;
    }

    public boolean resume() {
        TXCLog.m4994i(TAG, "resume");
        this.mIsPause = false;
        TXAudioEffectManagerImpl.getInstance().resumePlayMusic(this.mBGMId);
        return true;
    }

    public void setBGMPosition(int i10) {
        TXAudioEffectManagerImpl.getInstance().seekMusicToPosInMS(this.mBGMId, i10);
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

    public void setPitch(float f10) {
        TXAudioEffectManagerImpl.getInstance().setMusicPitch(this.mBGMId, f10);
    }

    public boolean setPlayoutVolume(float f10) {
        TXCLog.m4994i(TAG, "setPlayoutVolume:" + f10);
        TXAudioEffectManagerImpl.getInstance().setMusicPlayoutVolume(this.mBGMId, (int) (f10 * 100.0f));
        return true;
    }

    public boolean setPublishVolume(float f10) {
        TXAudioEffectManagerImpl.getInstance().setMusicPublishVolume(this.mBGMId, (int) (f10 * 100.0f));
        return true;
    }

    public boolean setVolume(float f10) {
        TXCLog.m4994i(TAG, "setVolume");
        TXAudioEffectManagerImpl.getInstance().setMusicVolume(this.mBGMId, (int) (f10 * 100.0f));
        return true;
    }

    public boolean startPlay(String str) {
        if (str == null || str.isEmpty()) {
            TXCLog.m4991e(TAG, "start live bgm failed! invalid params!");
            return false;
        }
        this.mIsRunning = true;
        TXAudioEffectManager.AudioMusicParam audioMusicParam = new TXAudioEffectManager.AudioMusicParam(this.mBGMId, str);
        audioMusicParam.publish = true;
        audioMusicParam.loopCount = 0;
        boolean zStartPlayMusic = TXAudioEffectManagerImpl.getInstance().startPlayMusic(audioMusicParam);
        TXAudioEffectManagerImpl.getInstance().setMusicObserver(this.mBGMId, this);
        if (!zStartPlayMusic) {
            onPlayEnd(-1);
            return false;
        }
        TXCLog.m4994i(TAG, "start bgm play : filePath = " + str);
        return true;
    }

    public void stopAll() {
        TXAudioEffectManagerImpl.getInstance().stopAllMusics();
        TXAudioEffectManagerImpl.getAutoCacheHolder().stopAllMusics();
        TXAudioEffectManagerImpl.getCacheInstance().stopAllMusics();
    }

    public boolean stopPlay() {
        this.mIsRunning = false;
        long jCurrentTimeMillis = System.currentTimeMillis();
        TXAudioEffectManagerImpl.getInstance().setMusicObserver(this.mBGMId, null);
        TXAudioEffectManagerImpl.getInstance().stopPlayMusic(this.mBGMId);
        this.mIsPause = false;
        TXCLog.m4994i(TAG, "stopBGMPlay cost(MS): " + (System.currentTimeMillis() - jCurrentTimeMillis));
        return true;
    }

    private TXCLiveBGMPlayer() {
        this.mIsRunning = false;
        this.mIsPause = false;
        this.mWeakListener = null;
        this.mBGMId = Integer.MAX_VALUE;
        this.mHandler = new Handler(Looper.getMainLooper());
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver
    public void onPlayProgress(int i10, long j10, long j11) throws Throwable {
        onPlayProgress(j10, j11);
    }
}
