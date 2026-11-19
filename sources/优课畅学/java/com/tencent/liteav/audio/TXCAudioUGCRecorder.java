package com.tencent.liteav.audio;

import android.content.Context;
import com.tencent.liteav.audio.impl.Record.InterfaceC6550c;
import com.tencent.liteav.audio.impl.Record.RunnableC6548a;
import com.tencent.liteav.audio.impl.Record.TXCAudioSysRecord;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.C6592e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public class TXCAudioUGCRecorder implements InterfaceC6550c {
    private static final TXCAudioUGCRecorder INSTANCE;
    private static final String TAG = "AudioCenter:TXCAudioUGCRecorder";
    protected Context mContext;
    private WeakReference<InterfaceC6545e> mWeakRecordListener;
    private final int AAC_SAMPLE_NUM = 1024;
    protected AtomicInteger mSampleRate = new AtomicInteger(48000);
    protected int mChannels = 1;
    protected int mBits = 16;
    protected int mAACFrameLength = (1024 * 16) / 8;
    protected int mReverbType = 0;
    protected int mVoiceChangerType = 0;
    protected int mAECType = 0;
    protected boolean mIsEarphoneOn = false;
    private long mLastPTS = 0;
    private float mVolume = 1.0f;
    private RunnableC6548a mBGMRecorder = null;
    private boolean mEnableBGMRecord = false;
    private int mShouldClearAACDataCnt = 0;
    private boolean mCurBGMRecordFlag = false;
    private AtomicReference<Float> mSpeedRate = new AtomicReference<>(Float.valueOf(1.0f));
    private boolean mIsRunning = false;
    private boolean mIsPause = false;
    private boolean mIsMute = false;
    private final List<byte[]> mEncodedAudioList = new ArrayList();

    static {
        C6592e.m5058f();
        INSTANCE = new TXCAudioUGCRecorder();
    }

    private TXCAudioUGCRecorder() {
        TXCAudioSysRecord.getInstance();
        nativeClassInit();
    }

    public static TXCAudioUGCRecorder getInstance() {
        return INSTANCE;
    }

    private native void nativeClassInit();

    private native void nativeEnableMixMode(boolean z10);

    private native void nativeSetChangerType(int i10);

    private native void nativeSetReverbType(int i10);

    private native void nativeSetSpeedRate(float f10);

    private native void nativeSetVolume(float f10);

    private native void nativeStartAudioRecord(int i10, int i11, int i12);

    private native void nativeStopAudioRecord();

    private synchronized void updateAudioEffector() {
        try {
            boolean z10 = true;
            if (!this.mEnableBGMRecord && this.mAECType != 1) {
                z10 = false;
            }
            if (!z10) {
                nativeSetReverbType(this.mReverbType);
                nativeSetChangerType(this.mVoiceChangerType);
                if (this.mIsMute) {
                    nativeSetVolume(0.0f);
                } else {
                    nativeSetVolume(this.mVolume);
                }
            }
            if (z10) {
                nativeSetVolume(0.0f);
            }
            nativeEnableMixMode(z10);
            nativeSetSpeedRate(this.mSpeedRate.get().floatValue());
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void clearCache() {
        TXCLog.m4994i(TAG, "clearCache");
        synchronized (this.mEncodedAudioList) {
            this.mEncodedAudioList.clear();
        }
    }

    public void enableBGMRecord(boolean z10) {
        TXCLog.m4994i(TAG, "enableBGMRecord: " + z10);
        if (this.mEnableBGMRecord != z10 && !z10) {
            this.mShouldClearAACDataCnt = 2;
        }
        this.mEnableBGMRecord = z10;
        updateAudioEffector();
    }

    public int getChannels() {
        return this.mChannels;
    }

    public InterfaceC6545e getListener() {
        WeakReference<InterfaceC6545e> weakReference = this.mWeakRecordListener;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public int getSampleRate() {
        return this.mSampleRate.get();
    }

    public boolean isPaused() {
        return this.mIsPause;
    }

    public boolean isRecording() {
        return this.mIsRunning;
    }

    @Override // com.tencent.liteav.audio.impl.Record.InterfaceC6550c
    public void onAudioRecordError(int i10, String str) {
        TXCLog.m4991e(TAG, "sys audio record error: " + i10 + ", " + str);
        InterfaceC6545e listener = getListener();
        if (listener != null) {
            listener.mo4712a(i10, str);
        }
    }

    @Override // com.tencent.liteav.audio.impl.Record.InterfaceC6550c
    public void onAudioRecordPCM(byte[] bArr, int i10, long j10) {
        byte[] bArr2;
        long j11 = this.mLastPTS;
        if (j11 >= j10) {
            j10 = 2 + j11;
        }
        long jFloatValue = j10;
        do {
            synchronized (this.mEncodedAudioList) {
                try {
                    if (this.mEncodedAudioList.isEmpty() || this.mIsPause) {
                        bArr2 = null;
                    } else {
                        byte[] bArr3 = this.mEncodedAudioList.get(0);
                        this.mEncodedAudioList.remove(0);
                        int i11 = this.mShouldClearAACDataCnt;
                        if (i11 > 0) {
                            this.mShouldClearAACDataCnt = i11 - 1;
                            bArr2 = null;
                        } else {
                            bArr2 = bArr3;
                        }
                    }
                    if (bArr2 != null) {
                        this.mLastPTS = jFloatValue;
                        InterfaceC6545e listener = getListener();
                        if (listener != null) {
                            listener.mo4721b(bArr2, jFloatValue, this.mSampleRate.get(), this.mChannels, this.mBits);
                        } else {
                            TXCLog.m4991e(TAG, "onAudioRecordPCM listener is null");
                        }
                        int i12 = this.mSampleRate.get();
                        if (i12 > 0) {
                            jFloatValue += (long) ((this.mSpeedRate.get().floatValue() * 1024000.0f) / i12);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (bArr2 != null);
    }

    @Override // com.tencent.liteav.audio.impl.Record.InterfaceC6550c
    public void onAudioRecordStart() {
        TXCLog.m4994i(TAG, "sys audio record start");
    }

    @Override // com.tencent.liteav.audio.impl.Record.InterfaceC6550c
    public void onAudioRecordStop() {
        TXCLog.m4994i(TAG, "sys audio record stop");
    }

    public void onEncodedData(byte[] bArr) {
        synchronized (this.mEncodedAudioList) {
            this.mEncodedAudioList.add(bArr);
        }
    }

    public void pause() {
        TXCLog.m4994i(TAG, "pause");
        TXCAudioEngine.getInstance().pauseLocalAudio();
        synchronized (this.mEncodedAudioList) {
            this.mIsPause = true;
        }
    }

    public void resume() {
        TXCLog.m4994i(TAG, "resume");
        TXCAudioEngine.getInstance().resumeLocalAudio();
        synchronized (this.mEncodedAudioList) {
            this.mIsPause = false;
        }
        nativeEnableMixMode(this.mEnableBGMRecord);
        if (this.mIsMute || this.mEnableBGMRecord) {
            nativeSetVolume(0.0f);
        } else {
            nativeSetVolume(this.mVolume);
        }
    }

    public void setAECType(int i10, Context context) {
        TXCLog.m4994i(TAG, "setAECType: 0");
        this.mAECType = 0;
        if (context != null) {
            this.mContext = context.getApplicationContext();
        }
    }

    public synchronized void setChangerType(int i10) {
        TXCLog.m4994i(TAG, "setChangerType: " + i10);
        this.mVoiceChangerType = i10;
        nativeSetChangerType(i10);
    }

    public void setChannels(int i10) {
        TXCLog.m4994i(TAG, "setChannels: " + i10);
        this.mChannels = i10;
    }

    public synchronized void setListener(InterfaceC6545e interfaceC6545e) {
        try {
            if (interfaceC6545e == null) {
                this.mWeakRecordListener = null;
            } else {
                this.mWeakRecordListener = new WeakReference<>(interfaceC6545e);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void setMute(boolean z10) {
        TXCLog.m4994i(TAG, "setMute: " + z10);
        this.mIsMute = z10;
        if (z10) {
            nativeSetVolume(0.0f);
        } else {
            nativeSetVolume(this.mVolume);
        }
    }

    public synchronized void setReverbType(int i10) {
        TXCLog.m4994i(TAG, "setReverbType: " + i10);
        this.mReverbType = i10;
        nativeSetReverbType(i10);
    }

    public void setSampleRate(int i10) {
        TXCLog.m4994i(TAG, "setSampleRate: " + i10);
        this.mSampleRate.set(i10);
    }

    public synchronized void setSpeedRate(float f10) {
        TXCLog.m4994i(TAG, "setSpeedRate: " + f10);
        this.mSpeedRate.set(Float.valueOf(f10));
        nativeSetSpeedRate(this.mSpeedRate.get().floatValue());
    }

    public synchronized void setVolume(float f10) {
        try {
            TXCLog.m4994i(TAG, "setVolume: " + f10);
            this.mVolume = f10;
            if (this.mIsMute) {
                nativeSetVolume(0.0f);
            } else {
                nativeSetVolume(f10);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public int startRecord(Context context) {
        TXCLog.m4994i(TAG, "startRecord");
        if (context != null) {
            this.mContext = context.getApplicationContext();
        }
        updateAudioEffector();
        TXCAudioSysRecord.getInstance().setAudioRecordListener(this);
        nativeStartAudioRecord(this.mSampleRate.get(), this.mChannels, this.mBits);
        this.mIsRunning = true;
        this.mLastPTS = 0L;
        return 0;
    }

    public int stopRecord() throws InterruptedException {
        TXCLog.m4994i(TAG, "stopRecord");
        TXCAudioSysRecord.getInstance().setAudioRecordListener(null);
        RunnableC6548a runnableC6548a = this.mBGMRecorder;
        if (runnableC6548a != null) {
            runnableC6548a.m4743a();
            this.mBGMRecorder = null;
        }
        nativeStopAudioRecord();
        nativeEnableMixMode(false);
        nativeSetVolume(1.0f);
        synchronized (this.mEncodedAudioList) {
            this.mEncodedAudioList.clear();
        }
        this.mIsRunning = false;
        this.mLastPTS = 0L;
        this.mIsPause = false;
        this.mIsMute = false;
        this.mShouldClearAACDataCnt = 0;
        return 0;
    }
}
