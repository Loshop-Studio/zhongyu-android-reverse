package com.tencent.liteav.audio.impl.Play;

import android.content.Context;
import android.media.AudioTrack;
import com.tencent.liteav.audio.TXCAudioEngine;
import com.tencent.liteav.basic.log.TXCLog;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* loaded from: classes4.dex */
public class TXCMultAudioTrackPlayer {
    private static final String TAG = "AudioCenter:" + TXCMultAudioTrackPlayer.class.getSimpleName();
    private int mAudioMode;
    private AudioTrackThread mAudioThread;
    private volatile boolean mAudioTrackStarted;
    private int mBits;
    private int mChannel;
    private Context mContext;
    private volatile boolean mIsStarted;
    private boolean mMute;
    private int mSampleRate;

    public class AudioTrackThread extends Thread {
        volatile boolean mIsLooping;

        public AudioTrackThread(String str) {
            super(str);
            this.mIsLooping = false;
        }

        public void startLoop() {
            this.mIsLooping = true;
        }

        public void stopLoop() {
            this.mIsLooping = false;
        }
    }

    public static class TXCMultAudioTrackPlayerHolder {
        private static TXCMultAudioTrackPlayer instance = new TXCMultAudioTrackPlayer();

        private TXCMultAudioTrackPlayerHolder() {
        }

        public static TXCMultAudioTrackPlayer getInstance() {
            return instance;
        }
    }

    public static TXCMultAudioTrackPlayer getInstance() {
        return TXCMultAudioTrackPlayerHolder.getInstance();
    }

    private native void nativeClassInit();

    /* JADX INFO: Access modifiers changed from: private */
    public native byte[] nativeGetMixedTracksDataToAudioTrack();

    public boolean isPlaying() {
        return this.mIsStarted;
    }

    public synchronized void setAudioMode(Context context, int i10) {
        try {
            this.mContext = context;
            this.mAudioMode = i10;
            if (this.mAudioTrackStarted) {
                TXCLog.m4998w(TAG, "mult-track-player setAudioRoute~");
            } else {
                TXCLog.m4998w(TAG, "mult-track-player do'not setAudioRoute~");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void setMute(boolean z10) {
        this.mMute = z10;
    }

    public void start() {
        String str = TAG;
        TXCLog.m4998w(str, "mult-track-player start!");
        if (this.mIsStarted) {
            TXCLog.m4991e(str, "mult-track-player can not start because of has started!");
            return;
        }
        if (this.mSampleRate == 0 || this.mChannel == 0) {
            TXCLog.m4991e(str, "strat mult-track-player failed with invalid audio info , samplerate:" + this.mSampleRate + ", channels:" + this.mChannel);
            return;
        }
        this.mIsStarted = true;
        if (this.mAudioThread == null) {
            AudioTrackThread audioTrackThread = new AudioTrackThread("AUDIO_TRACK") { // from class: com.tencent.liteav.audio.impl.Play.TXCMultAudioTrackPlayer.1
                @Override // java.lang.Thread, java.lang.Runnable
                public void run() throws IllegalStateException, InterruptedException {
                    try {
                        int i10 = TXCMultAudioTrackPlayer.this.mChannel == 1 ? 2 : 3;
                        int i11 = TXCMultAudioTrackPlayer.this.mBits == 8 ? 3 : 2;
                        int minBufferSize = AudioTrack.getMinBufferSize(TXCMultAudioTrackPlayer.this.mSampleRate, i10, i11);
                        AudioTrack audioTrack = new AudioTrack(3, TXCMultAudioTrackPlayer.this.mSampleRate, i10, i11, minBufferSize, 1);
                        TXCLog.m4994i(TXCMultAudioTrackPlayer.TAG, "create audio track, samplerate:" + TXCMultAudioTrackPlayer.this.mSampleRate + ", channels:" + TXCMultAudioTrackPlayer.this.mChannel + ", bits:" + TXCMultAudioTrackPlayer.this.mBits + " mMinBufferLength:" + minBufferSize);
                        try {
                            audioTrack.play();
                            TXCMultAudioTrackPlayer.this.mAudioTrackStarted = true;
                            TXCMultAudioTrackPlayer tXCMultAudioTrackPlayer = TXCMultAudioTrackPlayer.this;
                            tXCMultAudioTrackPlayer.setAudioMode(tXCMultAudioTrackPlayer.mContext, TXCMultAudioTrackPlayer.this.mAudioMode);
                            int i12 = 100;
                            int length = 0;
                            while (this.mIsLooping) {
                                byte[] bArrNativeGetMixedTracksDataToAudioTrack = TXCMultAudioTrackPlayer.this.nativeGetMixedTracksDataToAudioTrack();
                                if (bArrNativeGetMixedTracksDataToAudioTrack == null || bArrNativeGetMixedTracksDataToAudioTrack.length <= 0) {
                                    try {
                                        Thread.sleep(5L);
                                    } catch (InterruptedException unused) {
                                    }
                                } else {
                                    TXCAudioEngine.onCorePlayPcmData(bArrNativeGetMixedTracksDataToAudioTrack, 0L, TXCMultAudioTrackPlayer.this.mSampleRate, TXCMultAudioTrackPlayer.this.mChannel);
                                    if (TXCMultAudioTrackPlayer.this.mMute) {
                                        Arrays.fill(bArrNativeGetMixedTracksDataToAudioTrack, (byte) 0);
                                    }
                                    if (i12 != 0 && length < 800) {
                                        int length2 = bArrNativeGetMixedTracksDataToAudioTrack.length / 2;
                                        short[] sArr = new short[length2];
                                        ByteBuffer.wrap(bArrNativeGetMixedTracksDataToAudioTrack).order(ByteOrder.LITTLE_ENDIAN).asShortBuffer().get(sArr);
                                        for (int i13 = 0; i13 < length2; i13++) {
                                            sArr[i13] = (short) (sArr[i13] / i12);
                                        }
                                        ByteBuffer.wrap(bArrNativeGetMixedTracksDataToAudioTrack).order(ByteOrder.LITTLE_ENDIAN).asShortBuffer().put(sArr);
                                        length += bArrNativeGetMixedTracksDataToAudioTrack.length / ((TXCMultAudioTrackPlayer.this.mSampleRate * 2) / 1000);
                                        i12 = (i12 * (800 - length)) / 800;
                                    }
                                    audioTrack.write(bArrNativeGetMixedTracksDataToAudioTrack, 0, bArrNativeGetMixedTracksDataToAudioTrack.length);
                                }
                            }
                            try {
                                audioTrack.pause();
                                audioTrack.flush();
                                audioTrack.stop();
                                audioTrack.release();
                            } catch (Exception e10) {
                                TXCLog.m4992e(TXCMultAudioTrackPlayer.TAG, "stop AudioTrack failed.", e10);
                            }
                            TXCLog.m4991e(TXCMultAudioTrackPlayer.TAG, "mult-player thread stop finish!");
                        } catch (Exception e11) {
                            TXCLog.m4992e(TXCMultAudioTrackPlayer.TAG, "start play failed.", e11);
                        }
                    } catch (Exception e12) {
                        TXCLog.m4992e(TXCMultAudioTrackPlayer.TAG, "create AudioTrack failed.", e12);
                    }
                }
            };
            this.mAudioThread = audioTrackThread;
            audioTrackThread.startLoop();
            this.mAudioThread.start();
        }
        TXCLog.m4998w(str, "mult-track-player thread start finish!");
    }

    public void stop() {
        String str = TAG;
        TXCLog.m4998w(str, "mult-track-player stop!");
        if (!this.mIsStarted) {
            TXCLog.m4998w(str, "mult-track-player can not stop because of not started yet!");
            return;
        }
        AudioTrackThread audioTrackThread = this.mAudioThread;
        if (audioTrackThread != null) {
            audioTrackThread.stopLoop();
            this.mAudioThread = null;
        }
        this.mAudioMode = 0;
        this.mContext = null;
        this.mAudioTrackStarted = false;
        this.mIsStarted = false;
        TXCLog.m4998w(str, "mult-track-player stop finish!");
    }

    private TXCMultAudioTrackPlayer() {
        this.mAudioThread = null;
        this.mMute = false;
        this.mIsStarted = false;
        this.mAudioTrackStarted = false;
        this.mContext = null;
        this.mAudioMode = 0;
        this.mSampleRate = 48000;
        this.mChannel = 2;
        this.mBits = 16;
        nativeClassInit();
    }
}
