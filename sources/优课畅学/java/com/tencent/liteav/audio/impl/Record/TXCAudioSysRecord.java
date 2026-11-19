package com.tencent.liteav.audio.impl.Record;

import android.content.Context;
import android.media.AudioRecord;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public class TXCAudioSysRecord implements Runnable {
    private static final String TAG = "AudioCenter:" + TXCAudioSysRecord.class.getSimpleName();
    private static TXCAudioSysRecord instance = null;
    private Context mContext;
    private AudioRecord mMic;
    private WeakReference<InterfaceC6550c> mWeakRefListener;
    private int mSampleRate = 48000;
    private int mChannels = 1;
    private int mBits = 16;
    private int mAECType = 0;
    private byte[] mRecordBuffer = null;
    private Thread mRecordThread = null;
    private boolean mIsRunning = false;
    private boolean mIsCapFirstFrame = false;
    private boolean mSendMuteData = false;
    private AtomicBoolean mPause = new AtomicBoolean(false);
    private Object threadMutex = new Object();

    private TXCAudioSysRecord() {
        nativeClassInit();
    }

    public static TXCAudioSysRecord getInstance() {
        if (instance == null) {
            synchronized (TXCAudioSysRecord.class) {
                try {
                    if (instance == null) {
                        instance = new TXCAudioSysRecord();
                    }
                } finally {
                }
            }
        }
        return instance;
    }

    private void init() throws IllegalStateException {
        int i10 = this.mSampleRate;
        int i11 = this.mChannels;
        int i12 = this.mBits;
        int i13 = this.mAECType;
        String str = TAG;
        TXCLog.m4994i(str, String.format("audio record sampleRate = %d, channels = %d, bits = %d, aectype = %d", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)));
        int i14 = i11 == 1 ? 16 : 12;
        int i15 = i12 == 8 ? 3 : 2;
        int minBufferSize = AudioRecord.getMinBufferSize(i10, i14, i15);
        try {
            TXCLog.m4994i(str, "audio record type: system normal");
            this.mMic = new AudioRecord(1, i10, i14, i15, minBufferSize * 2);
        } catch (IllegalArgumentException e10) {
            TXCLog.m4992e(TAG, "create AudioRecord failed.", e10);
        }
        AudioRecord audioRecord = this.mMic;
        if (audioRecord == null || audioRecord.getState() != 1) {
            TXCLog.m4991e(TAG, "audio record: initialize the mic failed.");
            uninit();
            onRecordError(-1, "microphone permission denied!");
            return;
        }
        int i16 = ((i11 * 1024) * i12) / 8;
        if (i16 > minBufferSize) {
            this.mRecordBuffer = new byte[minBufferSize];
        } else {
            this.mRecordBuffer = new byte[i16];
        }
        TXCLog.m4994i(TAG, String.format("audio record: mic open rate=%dHZ, channels=%d, bits=%d, buffer=%d/%d, state=%d", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(minBufferSize), Integer.valueOf(this.mRecordBuffer.length), Integer.valueOf(this.mMic.getState())));
        AudioRecord audioRecord2 = this.mMic;
        if (audioRecord2 != null) {
            try {
                audioRecord2.startRecording();
            } catch (Exception e11) {
                TXCLog.m4992e(TAG, "mic startRecording failed.", e11);
                onRecordError(-1, "start recording failed!");
            }
        }
    }

    private native void nativeClassInit();

    private native void nativeSendSysRecordAudioData(byte[] bArr, int i10, int i11, int i12, int i13);

    private void onRecordError(int i10, String str) {
        InterfaceC6550c interfaceC6550c;
        synchronized (this) {
            try {
                WeakReference<InterfaceC6550c> weakReference = this.mWeakRefListener;
                interfaceC6550c = weakReference != null ? weakReference.get() : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (interfaceC6550c != null) {
            interfaceC6550c.onAudioRecordError(i10, str);
        } else {
            TXCLog.m4991e(TAG, "onRecordError:no callback");
        }
    }

    private void onRecordPcmData(byte[] bArr, int i10, long j10) {
        WeakReference<InterfaceC6550c> weakReference = this.mWeakRefListener;
        InterfaceC6550c interfaceC6550c = weakReference != null ? weakReference.get() : null;
        if (interfaceC6550c != null) {
            interfaceC6550c.onAudioRecordPCM(bArr, i10, j10);
        } else {
            TXCLog.m4991e(TAG, "onRecordPcmData:no callback");
        }
    }

    private void onRecordStart() {
        InterfaceC6550c interfaceC6550c;
        synchronized (this) {
            try {
                WeakReference<InterfaceC6550c> weakReference = this.mWeakRefListener;
                interfaceC6550c = weakReference != null ? weakReference.get() : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (interfaceC6550c != null) {
            interfaceC6550c.onAudioRecordStart();
        } else {
            TXCLog.m4991e(TAG, "onRecordStart:no callback");
        }
    }

    private void onRecordStop() {
        InterfaceC6550c interfaceC6550c;
        synchronized (this) {
            try {
                WeakReference<InterfaceC6550c> weakReference = this.mWeakRefListener;
                interfaceC6550c = weakReference != null ? weakReference.get() : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (interfaceC6550c != null) {
            interfaceC6550c.onAudioRecordStop();
        } else {
            TXCLog.m4991e(TAG, "onRecordStop:no callback");
        }
    }

    private void uninit() throws IllegalStateException {
        if (this.mMic != null) {
            TXCLog.m4994i(TAG, "stop mic");
            try {
                this.mMic.setRecordPositionUpdateListener(null);
                this.mMic.stop();
                this.mMic.release();
            } catch (Exception e10) {
                TXCLog.m4992e(TAG, "stop AudioRecord failed.", e10);
            }
        }
        this.mMic = null;
        this.mRecordBuffer = null;
        this.mIsCapFirstFrame = false;
    }

    public synchronized boolean isRecording() {
        return this.mIsRunning;
    }

    public void pause(boolean z10) {
        TXCLog.m4994i(TAG, "system audio record pause");
        this.mPause.set(true);
        this.mSendMuteData = z10;
    }

    public void resume() {
        TXCLog.m4994i(TAG, "system audio record resume");
        this.mPause.set(false);
    }

    @Override // java.lang.Runnable
    public void run() throws IllegalStateException {
        int i10;
        if (!this.mIsRunning) {
            TXCLog.m4998w(TAG, "audio record: abandom start audio sys record thread!");
            return;
        }
        onRecordStart();
        TXCLog.m4994i(TAG, "start capture audio data ...,mIsRunning:" + this.mIsRunning + " Thread.interrupted:" + Thread.interrupted() + " mMic:" + this.mMic);
        init();
        loop0: while (true) {
            i10 = 0;
            int i11 = 0;
            while (this.mIsRunning && !Thread.interrupted() && this.mMic != null && i10 <= 5) {
                System.currentTimeMillis();
                AudioRecord audioRecord = this.mMic;
                byte[] bArr = this.mRecordBuffer;
                int i12 = audioRecord.read(bArr, i11, bArr.length - i11);
                if (i12 == this.mRecordBuffer.length - i11) {
                    if (!this.mIsCapFirstFrame) {
                        onRecordError(-6, "First frame captured#");
                        this.mIsCapFirstFrame = true;
                    }
                    if (this.mSendMuteData) {
                        Arrays.fill(this.mRecordBuffer, (byte) 0);
                    }
                    if (!this.mPause.get() || this.mSendMuteData) {
                        byte[] bArr2 = this.mRecordBuffer;
                        onRecordPcmData(bArr2, bArr2.length, TXCTimeUtil.getTimeTick());
                        byte[] bArr3 = this.mRecordBuffer;
                        nativeSendSysRecordAudioData(bArr3, bArr3.length, this.mSampleRate, this.mChannels, this.mBits);
                    }
                } else if (i12 <= 0) {
                    TXCLog.m4991e(TAG, "read pcm error, len =" + i12);
                    i10++;
                } else {
                    i11 += i12;
                }
            }
            break loop0;
        }
        TXCLog.m4989d(TAG, "stop capture audio data ...,mIsRunning:" + this.mIsRunning + " mMic:" + this.mMic + " nFailedCount:" + i10);
        uninit();
        if (i10 > 5) {
            onRecordError(-1, "read data failed!");
        } else {
            onRecordStop();
        }
    }

    public synchronized void setAudioRecordListener(InterfaceC6550c interfaceC6550c) {
        try {
            if (interfaceC6550c == null) {
                this.mWeakRefListener = null;
            } else {
                this.mWeakRefListener = new WeakReference<>(interfaceC6550c);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void start(int i10, int i11, int i12) {
        String str = TAG;
        TXCLog.m4994i(str, "start");
        synchronized (this.threadMutex) {
            stop();
            this.mSampleRate = i10;
            this.mChannels = i11;
            this.mBits = i12;
            this.mIsRunning = true;
            Thread thread = new Thread(this, "AudioSysRecord Thread");
            this.mRecordThread = thread;
            thread.start();
        }
        TXCLog.m4994i(str, "start ok");
    }

    public void stop() {
        String str;
        TXCLog.m4994i(TAG, "stop");
        synchronized (this.threadMutex) {
            this.mIsRunning = false;
            long jCurrentTimeMillis = System.currentTimeMillis();
            Thread thread = this.mRecordThread;
            if (thread == null || !thread.isAlive() || Thread.currentThread().getId() == this.mRecordThread.getId()) {
                str = TAG;
                TXCLog.m4994i(str, "stop ok,stop record cost time(MS): " + (System.currentTimeMillis() - jCurrentTimeMillis));
                this.mRecordThread = null;
            } else {
                try {
                    this.mRecordThread.join();
                } catch (Exception e10) {
                    TXCLog.m4991e(TAG, "record stop Exception: " + e10.getMessage());
                }
                str = TAG;
                TXCLog.m4994i(str, "stop ok,stop record cost time(MS): " + (System.currentTimeMillis() - jCurrentTimeMillis));
                this.mRecordThread = null;
            }
        }
        TXCLog.m4994i(str, "stop ok");
    }
}
