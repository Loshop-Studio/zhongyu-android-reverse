package com.tencent.liteav.videodecoder;

import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.Surface;
import com.tencent.liteav.TXLiteAVCode;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.module.TXCEventRecorderProxy;
import com.tencent.liteav.basic.module.TXCKeyPointReportProxy;
import com.tencent.liteav.basic.module.TXCStatus;
import com.tencent.liteav.basic.p047b.InterfaceC6559b;
import com.tencent.liteav.basic.structs.TXSNALPacket;
import com.tencent.liteav.basic.structs.TXSVideoFrame;
import com.tencent.liteav.basic.util.C6592e;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.rtmp.TXLiveConstants;
import com.tencent.smtt.sdk.TbsListener;
import com.tencent.smtt.sdk.TbsReaderView;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;

/* loaded from: classes4.dex */
public class TXCVideoDecoder implements InterfaceC6559b, InterfaceC6718f {
    private static final boolean NEW_DECODER = true;
    private static final String TAG = "TXCVideoDecoder";
    private static long mDecodeFirstFrameTS;
    private int mDecoderCacheNum;
    private HandlerC6712a mDecoderHandler;
    InterfaceC6718f mDecoderListener;
    private long mNativeContext;
    private WeakReference<InterfaceC6559b> mNotifyListener;
    private ByteBuffer mPps;
    private ByteBuffer mSps;
    Surface mSurface;
    private String mUserId;
    InterfaceC6714b mVideoDecoder;
    private boolean mRestarting = false;
    private int mStreamType = 0;
    private int mVideoWidth = 0;
    private int mVideoHeight = 0;
    private boolean mEnableDecoderChange = false;
    private boolean mEnableRestartDecoder = false;
    private boolean mEnableLimitDecCache = false;
    private JSONArray mDecFormat = null;
    private ArrayList<TXSNALPacket> mNALList = new ArrayList<>();
    boolean mHWDec = true;
    boolean mHevc = false;
    boolean mNeedSortFrame = true;
    boolean mRecvFirstFrame = false;

    static {
        C6592e.m5058f();
    }

    public TXCVideoDecoder() {
        mDecodeFirstFrameTS = 0L;
    }

    private void addOneNalToDecoder(TXSNALPacket tXSNALPacket) {
        boolean z10 = tXSNALPacket.nalType == 0;
        Bundle bundle = new Bundle();
        bundle.putBoolean("iframe", z10);
        bundle.putByteArray("nal", tXSNALPacket.nalData);
        bundle.putLong("pts", tXSNALPacket.pts);
        bundle.putLong("dts", tXSNALPacket.dts);
        bundle.putInt("codecId", tXSNALPacket.codecId);
        Message message = new Message();
        message.what = 101;
        message.setData(bundle);
        HandlerC6712a handlerC6712a = this.mDecoderHandler;
        if (handlerC6712a != null) {
            handlerC6712a.sendMessage(message);
        }
        this.mDecoderCacheNum++;
    }

    private void decNALByNewWay(TXSNALPacket tXSNALPacket) {
        if (this.mHWDec) {
            decodeFrame(tXSNALPacket.nalData, tXSNALPacket.pts, tXSNALPacket.dts, tXSNALPacket.rotation, tXSNALPacket.codecId, 0, 0, tXSNALPacket.nalType);
        } else {
            synchronized (this) {
                nativeDecodeFrame(this.mNativeContext, tXSNALPacket.nalData, tXSNALPacket.nalType, tXSNALPacket.pts, tXSNALPacket.dts, tXSNALPacket.rotation, tXSNALPacket.codecId);
            }
        }
    }

    private void decNALByOldWay(TXSNALPacket tXSNALPacket) {
        try {
            boolean z10 = tXSNALPacket.nalType == 0;
            boolean z11 = this.mRecvFirstFrame;
            if (!z11 && !z10) {
                TXCLog.m4994i(TAG, "play:decode: push nal ignore p frame when not got i frame");
                return;
            }
            if (!z11 && z10) {
                TXCLog.m4998w(TAG, "play:decode: push first i frame");
                this.mRecvFirstFrame = true;
            }
            if (!this.mRestarting && tXSNALPacket.codecId == 1 && !this.mHWDec) {
                TXCLog.m4998w(TAG, "play:decode: hevc decode error  ");
                C6592e.m5041a(this.mNotifyListener, -2304, "h265 Decoding failed");
                this.mRestarting = true;
            }
            if (this.mDecoderHandler != null) {
                if (!this.mNALList.isEmpty()) {
                    Iterator<TXSNALPacket> it = this.mNALList.iterator();
                    while (it.hasNext()) {
                        addOneNalToDecoder(it.next());
                    }
                }
                this.mNALList.clear();
                addOneNalToDecoder(tXSNALPacket);
                return;
            }
            if (z10 && !this.mNALList.isEmpty()) {
                this.mNALList.clear();
            }
            this.mNALList.add(tXSNALPacket);
            if (this.mRestarting) {
                return;
            }
            start();
        } catch (Exception e10) {
            TXCLog.m4992e(TAG, "decode NAL By Old way failed.", e10);
        }
    }

    private void decodeFrame(byte[] bArr, long j10, long j11, int i10, int i11, int i12, int i13, int i14) {
        TXSNALPacket tXSNALPacket = new TXSNALPacket();
        tXSNALPacket.nalData = bArr;
        tXSNALPacket.pts = j10;
        tXSNALPacket.dts = j11;
        tXSNALPacket.rotation = i10;
        tXSNALPacket.codecId = i11;
        tXSNALPacket.nalType = i14;
        synchronized (this) {
            try {
                if (this.mNativeContext != 0 && this.mVideoDecoder == null) {
                    C6717e c6717e = new C6717e();
                    c6717e.m5719a(i12, i13);
                    c6717e.setListener(this);
                    c6717e.setNotifyListener(this.mNotifyListener);
                    c6717e.m5720a(this.mDecFormat);
                    c6717e.config(this.mSurface);
                    c6717e.enableLimitDecCache(this.mEnableLimitDecCache);
                    c6717e.start(this.mSps, this.mPps, this.mNeedSortFrame, this.mHevc);
                    notifyDecoderStartEvent(true);
                    this.mVideoDecoder = c6717e;
                }
                InterfaceC6714b interfaceC6714b = this.mVideoDecoder;
                if (interfaceC6714b != null) {
                    interfaceC6714b.decode(tXSNALPacket);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private boolean hasSurface() {
        return this.mSurface != null;
    }

    private native long nativeCreateContext(boolean z10);

    private native void nativeDecCache(long j10);

    private native void nativeDecodeFrame(long j10, byte[] bArr, int i10, long j11, long j12, int i11, int i12);

    private native void nativeDestroyContext(long j10);

    private native void nativeEnableDecodeChange(long j10, boolean z10);

    private native void nativeEnableRestartDecoder(long j10, boolean z10);

    private native void nativeNotifyPts(long j10, long j11, int i10, int i11);

    private native void nativeSetID(long j10, String str);

    private native void nativeSetStreamType(long j10, int i10);

    private void notifyDecoderStartEvent(boolean z10) {
        TXCEventRecorderProxy.m5002a(this.mUserId, 4005, z10 ? 1L : 0L, -1L, "", this.mStreamType);
        Bundle bundle = new Bundle();
        bundle.putInt("EVT_ID", 2008);
        bundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
        bundle.putCharSequence(TXLiveConstants.EVT_DESCRIPTION, z10 ? "Enables hardware decoding" : "Enables software decoding");
        bundle.putInt("EVT_PARAM1", z10 ? 1 : 2);
        C6592e.m5042a(this.mNotifyListener, this.mUserId, 2008, bundle);
        TXCKeyPointReportProxy.m5003a(this.mUserId, 40026, z10 ? 1L : 2L, this.mStreamType);
    }

    private void onDecodeDone(TXSVideoFrame tXSVideoFrame, int i10, int i11, long j10, long j11, int i12, int i13) {
        if (mDecodeFirstFrameTS == 0) {
            mDecodeFirstFrameTS = TXCTimeUtil.getTimeTick();
            Log.i(TAG, "SoftDecode onDecodeFrame: decode first frame success:" + this.mUserId + "_" + this.mStreamType);
            TXCStatus.m5007a(this.mUserId, TbsReaderView.ReaderCallback.READER_TOAST, this.mStreamType, Long.valueOf(mDecodeFirstFrameTS));
            TXCStatus.m5007a(this.mUserId, TbsReaderView.ReaderCallback.SEARCH_SELECT_TEXT, this.mStreamType, Integer.valueOf(this.mHevc ? 2 : 0));
        }
        InterfaceC6718f interfaceC6718f = this.mDecoderListener;
        if (interfaceC6718f != null) {
            tXSVideoFrame.width = i10;
            tXSVideoFrame.height = i11;
            tXSVideoFrame.rotation = i12;
            tXSVideoFrame.pts = j10;
            tXSVideoFrame.frameType = i13;
            interfaceC6718f.onDecodeFrame(tXSVideoFrame, i10, i11, j10, j11, i12);
            if (this.mVideoWidth == i10 && this.mVideoHeight == i11) {
                return;
            }
            this.mVideoWidth = i10;
            this.mVideoHeight = i11;
            interfaceC6718f.onVideoSizeChange(i10, i11);
        }
    }

    private void onStartDecoder(boolean z10) {
        notifyDecoderStartEvent(z10);
    }

    private int startDecodeThread() throws Throwable {
        synchronized (this) {
            try {
                try {
                    if (this.mDecoderHandler != null) {
                        TXCLog.m4991e(TAG, "play:decode: start decoder error when decoder is started");
                        return -1;
                    }
                    this.mDecoderCacheNum = 0;
                    this.mRestarting = false;
                    HandlerThread handlerThread = new HandlerThread("VDecoder");
                    handlerThread.start();
                    if (this.mHWDec) {
                        handlerThread.setName("VideoWDec" + handlerThread.getId());
                    } else {
                        handlerThread.setName("VideoSWDec" + handlerThread.getId());
                    }
                    HandlerC6712a handlerC6712a = new HandlerC6712a(handlerThread.getLooper());
                    handlerC6712a.m5677a(this.mHevc, this.mHWDec, this.mSurface, this.mSps, this.mPps, this, this);
                    TXCLog.m4998w(TAG, "play:decode: start decode thread");
                    Message messageObtain = Message.obtain();
                    messageObtain.what = 100;
                    messageObtain.obj = Boolean.valueOf(this.mNeedSortFrame);
                    handlerC6712a.sendMessage(messageObtain);
                    this.mDecoderHandler = handlerC6712a;
                    return 0;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    private void stopDecodeThread() {
        synchronized (this) {
            try {
                HandlerC6712a handlerC6712a = this.mDecoderHandler;
                if (handlerC6712a != null) {
                    handlerC6712a.sendEmptyMessage(102);
                }
                this.mDecoderHandler = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private synchronized void stopHWDecoder() {
        InterfaceC6714b interfaceC6714b = this.mVideoDecoder;
        if (interfaceC6714b != null) {
            interfaceC6714b.stop();
            this.mVideoDecoder.setListener(null);
            this.mVideoDecoder.setNotifyListener(null);
            this.mVideoDecoder = null;
        }
    }

    public long GetDecodeFirstFrameTS() {
        return mDecodeFirstFrameTS;
    }

    public void config(JSONArray jSONArray) {
        this.mDecFormat = jSONArray;
    }

    public void enableChange(boolean z10) {
        this.mEnableDecoderChange = z10;
        synchronized (this) {
            nativeEnableDecodeChange(this.mNativeContext, this.mEnableDecoderChange);
        }
    }

    public void enableHWDec(boolean z10) {
        this.mHWDec = z10;
    }

    public void enableLimitDecCache(boolean z10) {
        this.mEnableLimitDecCache = z10;
        InterfaceC6714b interfaceC6714b = this.mVideoDecoder;
        if (interfaceC6714b != null) {
            interfaceC6714b.enableLimitDecCache(z10);
        }
    }

    public void enableRestart(boolean z10) {
        this.mEnableRestartDecoder = z10;
    }

    public int getDecoderCacheNum() {
        return this.mDecoderCacheNum + this.mNALList.size();
    }

    public boolean isHardwareDecode() {
        return this.mVideoDecoder != null;
    }

    public boolean isHevc() {
        HandlerC6712a handlerC6712a = this.mDecoderHandler;
        if (handlerC6712a != null) {
            return handlerC6712a.m5678a();
        }
        return false;
    }

    @Override // com.tencent.liteav.videodecoder.InterfaceC6718f
    public void onDecodeFailed(int i10) {
        InterfaceC6718f interfaceC6718f = this.mDecoderListener;
        if (interfaceC6718f != null) {
            interfaceC6718f.onDecodeFailed(i10);
        }
        synchronized (this) {
            nativeDecCache(this.mNativeContext);
        }
    }

    @Override // com.tencent.liteav.videodecoder.InterfaceC6718f
    public void onDecodeFrame(TXSVideoFrame tXSVideoFrame, int i10, int i11, long j10, long j11, int i12) {
        if (mDecodeFirstFrameTS == 0) {
            mDecodeFirstFrameTS = TXCTimeUtil.getTimeTick();
            Log.i(TAG, "MediaCodec onDecodeFrame: decode first frame success:" + this.mUserId + "_" + this.mStreamType);
            TXCStatus.m5007a(this.mUserId, TbsReaderView.ReaderCallback.READER_TOAST, this.mStreamType, Long.valueOf(mDecodeFirstFrameTS));
            TXCStatus.m5007a(this.mUserId, TbsReaderView.ReaderCallback.SEARCH_SELECT_TEXT, this.mStreamType, Integer.valueOf(this.mHevc ? 3 : 1));
        }
        InterfaceC6718f interfaceC6718f = this.mDecoderListener;
        if (interfaceC6718f != null) {
            interfaceC6718f.onDecodeFrame(tXSVideoFrame, i10, i11, j10, j11, i12);
        }
        int i13 = this.mDecoderCacheNum;
        if (i13 > 0) {
            this.mDecoderCacheNum = i13 - 1;
        }
        if (tXSVideoFrame == null) {
            synchronized (this) {
                nativeNotifyPts(this.mNativeContext, j10, i10, i11);
            }
        }
        int iGetDecodeCost = this.mVideoDecoder.GetDecodeCost();
        if (this.mHWDec) {
            TXCStatus.m5007a(this.mUserId, 8004, this.mStreamType, Integer.valueOf(iGetDecodeCost));
        } else {
            TXCStatus.m5007a(this.mUserId, TXLiteAVCode.EVT_ROOM_REQUEST_AVSEAT_SUCC, this.mStreamType, Integer.valueOf(iGetDecodeCost));
        }
    }

    @Override // com.tencent.liteav.basic.p047b.InterfaceC6559b
    public void onNotifyEvent(int i10, Bundle bundle) {
        C6592e.m5042a(this.mNotifyListener, this.mUserId, i10, bundle);
    }

    @Override // com.tencent.liteav.videodecoder.InterfaceC6718f
    public void onVideoSizeChange(int i10, int i11) {
        InterfaceC6718f interfaceC6718f = this.mDecoderListener;
        if (interfaceC6718f != null) {
            if (this.mVideoWidth == i10 && this.mVideoHeight == i11) {
                return;
            }
            this.mVideoWidth = i10;
            this.mVideoHeight = i11;
            interfaceC6718f.onVideoSizeChange(i10, i11);
        }
    }

    public void pushNAL(TXSNALPacket tXSNALPacket) {
        decNALByNewWay(tXSNALPacket);
    }

    public void restart(boolean z10) {
        synchronized (this) {
            try {
                this.mHWDec = z10;
                this.mNALList.clear();
                this.mRecvFirstFrame = false;
                this.mDecoderCacheNum = 0;
                mDecodeFirstFrameTS = 0L;
                Message messageObtain = Message.obtain();
                messageObtain.what = TbsListener.ErrorCode.READ_RESPONSE_ERROR;
                messageObtain.arg1 = this.mHWDec ? 1 : 0;
                messageObtain.arg2 = this.mNeedSortFrame ? 1 : 0;
                HandlerC6712a handlerC6712a = this.mDecoderHandler;
                if (handlerC6712a != null) {
                    handlerC6712a.sendMessage(messageObtain);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setListener(InterfaceC6718f interfaceC6718f) {
        this.mDecoderListener = interfaceC6718f;
    }

    public void setNotifyListener(InterfaceC6559b interfaceC6559b) {
        this.mNotifyListener = new WeakReference<>(interfaceC6559b);
    }

    public void setStreamType(int i10) {
        this.mStreamType = i10;
        synchronized (this) {
            nativeSetStreamType(this.mNativeContext, this.mStreamType);
        }
    }

    public void setUserId(String str) {
        this.mUserId = str;
        synchronized (this) {
            nativeSetID(this.mNativeContext, this.mUserId);
        }
    }

    public int setup(SurfaceTexture surfaceTexture, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, boolean z10) {
        Surface surface = this.mSurface;
        if (surface != null) {
            surface.release();
            this.mSurface = null;
        }
        return setup(new Surface(surfaceTexture), byteBuffer, byteBuffer2, z10);
    }

    public synchronized int start() {
        if (this.mHWDec && this.mSurface == null) {
            TXCLog.m4994i(TAG, "play:decode: start decoder error when not setup surface, id " + this.mUserId + "_" + this.mStreamType);
            return -1;
        }
        if (this.mNativeContext != 0) {
            TXCLog.m4998w(TAG, "play:decode: start decoder error when decoder is started, id " + this.mUserId + "_" + this.mStreamType);
            return -1;
        }
        TXCLog.m4998w(TAG, "play:decode: start decoder java id " + this.mUserId + "_" + this.mStreamType);
        long jNativeCreateContext = nativeCreateContext(this.mHWDec);
        this.mNativeContext = jNativeCreateContext;
        nativeSetID(jNativeCreateContext, this.mUserId);
        nativeSetStreamType(this.mNativeContext, this.mStreamType);
        nativeEnableDecodeChange(this.mNativeContext, this.mEnableDecoderChange);
        nativeEnableRestartDecoder(this.mNativeContext, this.mEnableRestartDecoder);
        return 0;
    }

    public synchronized void stop() {
        if (this.mNativeContext == 0) {
            TXCLog.m4998w(TAG, "play:decode: stop decoder ignore when decoder is stopped, id " + this.mUserId + "_" + this.mStreamType);
            return;
        }
        TXCLog.m4998w(TAG, "play:decode: stop decoder java id " + this.mUserId + "_" + this.mStreamType);
        nativeDestroyContext(this.mNativeContext);
        this.mNativeContext = 0L;
        this.mNALList.clear();
        this.mRecvFirstFrame = false;
        this.mDecoderCacheNum = 0;
        mDecodeFirstFrameTS = 0L;
        synchronized (this) {
            try {
                InterfaceC6714b interfaceC6714b = this.mVideoDecoder;
                if (interfaceC6714b != null) {
                    interfaceC6714b.stop();
                    this.mVideoDecoder.setListener(null);
                    this.mVideoDecoder.setNotifyListener(null);
                    this.mVideoDecoder = null;
                }
                Surface surface = this.mSurface;
                if (surface != null) {
                    surface.release();
                    this.mSurface = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int setup(Surface surface, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, boolean z10) {
        this.mSurface = surface;
        this.mSps = byteBuffer;
        this.mPps = byteBuffer2;
        this.mNeedSortFrame = z10;
        return 0;
    }

    /* renamed from: com.tencent.liteav.videodecoder.TXCVideoDecoder$a */
    public static class HandlerC6712a extends Handler {

        /* renamed from: a */
        InterfaceC6714b f6336a;

        /* renamed from: b */
        InterfaceC6718f f6337b;

        /* renamed from: c */
        WeakReference<InterfaceC6559b> f6338c;

        /* renamed from: d */
        boolean f6339d;

        /* renamed from: e */
        boolean f6340e;

        /* renamed from: f */
        Surface f6341f;

        /* renamed from: g */
        private ByteBuffer f6342g;

        /* renamed from: h */
        private ByteBuffer f6343h;

        public HandlerC6712a(Looper looper) {
            super(looper);
        }

        /* renamed from: b */
        private void m5676b() {
            InterfaceC6714b interfaceC6714b = this.f6336a;
            if (interfaceC6714b != null) {
                interfaceC6714b.stop();
                this.f6336a.setListener(null);
                this.f6336a.setNotifyListener(null);
                this.f6336a = null;
            }
            Looper.myLooper().quit();
            TXCLog.m4998w(TXCVideoDecoder.TAG, "play:decode: stop decode hwdec: " + this.f6339d);
        }

        /* renamed from: a */
        public void m5677a(boolean z10, boolean z11, Surface surface, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, InterfaceC6718f interfaceC6718f, InterfaceC6559b interfaceC6559b) {
            this.f6340e = z10;
            this.f6339d = z11;
            this.f6341f = surface;
            this.f6342g = byteBuffer;
            this.f6343h = byteBuffer2;
            this.f6337b = interfaceC6718f;
            this.f6338c = new WeakReference<>(interfaceC6559b);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Bundle data;
            switch (message.what) {
                case 100:
                    m5673a(((Boolean) message.obj).booleanValue());
                    break;
                case 101:
                    try {
                        data = message.getData();
                    } catch (Exception e10) {
                        e = e10;
                    }
                    try {
                        m5675a(data.getByteArray("nal"), data.getLong("pts"), data.getLong("dts"), data.getInt("codecId"));
                        break;
                    } catch (Exception e11) {
                        e = e11;
                        TXCLog.m4991e(TXCVideoDecoder.TAG, "decode frame failed." + e.getMessage());
                        return;
                    }
                case 102:
                    m5676b();
                    break;
                case TbsListener.ErrorCode.READ_RESPONSE_ERROR /* 103 */:
                    m5674a(message.arg1 == 1, message.arg2 == 1);
                    break;
            }
        }

        /* renamed from: a */
        public boolean m5678a() {
            InterfaceC6714b interfaceC6714b = this.f6336a;
            if (interfaceC6714b != null) {
                return interfaceC6714b.isHevc();
            }
            return false;
        }

        /* renamed from: a */
        private void m5675a(byte[] bArr, long j10, long j11, int i10) {
            TXSNALPacket tXSNALPacket = new TXSNALPacket();
            tXSNALPacket.nalData = bArr;
            tXSNALPacket.pts = j10;
            tXSNALPacket.dts = j11;
            tXSNALPacket.codecId = i10;
            InterfaceC6714b interfaceC6714b = this.f6336a;
            if (interfaceC6714b != null) {
                interfaceC6714b.decode(tXSNALPacket);
            }
        }

        /* renamed from: a */
        private void m5674a(boolean z10, boolean z11) {
            this.f6339d = z10;
            TXCLog.m4998w(TXCVideoDecoder.TAG, "play:decode: restart decode hwdec: " + this.f6339d);
            InterfaceC6714b interfaceC6714b = this.f6336a;
            if (interfaceC6714b != null) {
                interfaceC6714b.stop();
                this.f6336a.setListener(null);
                this.f6336a.setNotifyListener(null);
                this.f6336a = null;
            }
            m5673a(z11);
        }

        /* renamed from: a */
        private void m5673a(boolean z10) {
            if (this.f6336a != null) {
                TXCLog.m4994i(TXCVideoDecoder.TAG, "play:decode: start decode ignore hwdec: " + this.f6339d);
                return;
            }
            if (this.f6339d) {
                this.f6336a = new C6717e();
            } else {
                this.f6336a = new TXCVideoFfmpegDecoder();
            }
            this.f6336a.setListener(this.f6337b);
            this.f6336a.setNotifyListener(this.f6338c);
            this.f6336a.config(this.f6341f);
            this.f6336a.start(this.f6342g, this.f6343h, z10, this.f6340e);
            TXCLog.m4998w(TXCVideoDecoder.TAG, "play:decode: start decode hwdec: " + this.f6339d + ", hevc: " + this.f6340e);
        }
    }
}
