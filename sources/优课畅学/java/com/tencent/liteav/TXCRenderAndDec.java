package com.tencent.liteav;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Bundle;
import android.view.Surface;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.module.C6584a;
import com.tencent.liteav.basic.module.TXCEventRecorderProxy;
import com.tencent.liteav.basic.module.TXCKeyPointReportProxy;
import com.tencent.liteav.basic.p046a.EnumC6557b;
import com.tencent.liteav.basic.p047b.InterfaceC6559b;
import com.tencent.liteav.basic.p048c.C6565f;
import com.tencent.liteav.basic.p049d.C6573c;
import com.tencent.liteav.basic.structs.TXSNALPacket;
import com.tencent.liteav.basic.structs.TXSVideoFrame;
import com.tencent.liteav.basic.util.C6592e;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.liteav.beauty.p050a.C6599a;
import com.tencent.liteav.renderer.C6673a;
import com.tencent.liteav.renderer.InterfaceC6678f;
import com.tencent.liteav.renderer.TextureViewSurfaceTextureListenerC6677e;
import com.tencent.liteav.videodecoder.InterfaceC6718f;
import com.tencent.liteav.videodecoder.TXCVideoDecoder;
import com.tencent.rtmp.TXLiveConstants;
import com.tencent.smtt.sdk.TbsReaderView;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public class TXCRenderAndDec extends C6584a implements InterfaceC6559b, C6673a.a, InterfaceC6678f, InterfaceC6718f {
    public static final String TAG = "TXCRenderAndDec";
    private Context mContext;
    private WeakReference<InterfaceC6559b> mNotifyListener;
    private WeakReference<InterfaceC6525b> mRenderAndDecDelegate;
    private InterfaceC6607j mVideoFrameListener;
    private C6601d mConfig = null;
    private boolean mEnableLimitHWDecCache = false;
    private TXCVideoDecoder mVideoDecoder = null;
    private boolean mEnableDecoderChange = false;
    private boolean mEnableRestartDecoder = false;
    private TextureViewSurfaceTextureListenerC6677e mVideoRender = null;
    private C6565f mVideoFrameFilter = null;
    private EnumC6557b mVideoFrameFormat = EnumC6557b.UNKNOWN;
    private boolean mRealTime = false;
    private boolean mIsRendering = false;
    private int mStreamType = 0;
    private long mFrameDecErrCnt = 0;
    private long mLastReqKeyFrameTS = 0;
    private boolean mFirstRender = false;
    private int mRenderMode = 0;
    private int mRenderRotation = 0;
    private long mLastRenderCalculateTS = 0;
    private long mRenderFrameCount = 0;
    private long mLastRenderFrameCount = 0;
    private InterfaceC6524a mDecListener = null;

    /* renamed from: com.tencent.liteav.TXCRenderAndDec$a */
    public interface InterfaceC6524a {
        /* renamed from: a */
        void mo4700a(SurfaceTexture surfaceTexture);
    }

    /* renamed from: com.tencent.liteav.TXCRenderAndDec$b */
    public interface InterfaceC6525b {
        /* renamed from: b */
        void mo4701b(String str, int i10);
    }

    public TXCRenderAndDec(Context context) {
        this.mContext = null;
        this.mContext = context;
        C6573c.m4883a().m4909a(this.mContext);
    }

    private void notifyEvent(int i10, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("EVT_USERID", getID());
        bundle.putInt("EVT_ID", i10);
        bundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
        if (str != null) {
            bundle.putCharSequence(TXLiveConstants.EVT_DESCRIPTION, str);
        }
        bundle.putInt("EVT_STREAM_TYPE", this.mStreamType);
        C6592e.m5040a(this.mNotifyListener, i10, bundle);
    }

    private void requestKeyFrame() {
        InterfaceC6525b interfaceC6525b;
        long timeTick = TXCTimeUtil.getTimeTick();
        if (timeTick > this.mLastReqKeyFrameTS + 3000) {
            this.mLastReqKeyFrameTS = timeTick;
            TXCLog.m4991e(TAG, "requestKeyFrame: " + getID());
            WeakReference<InterfaceC6525b> weakReference = this.mRenderAndDecDelegate;
            if (weakReference == null || (interfaceC6525b = weakReference.get()) == null) {
                return;
            }
            interfaceC6525b.mo4701b(getID(), this.mStreamType);
        }
    }

    private void startDecode(SurfaceTexture surfaceTexture) {
        TXCVideoDecoder tXCVideoDecoder = this.mVideoDecoder;
        if (tXCVideoDecoder != null) {
            tXCVideoDecoder.stop();
            tXCVideoDecoder.enableHWDec(this.mConfig.f5611h);
            tXCVideoDecoder.config(this.mConfig.f5628y);
            TXCLog.m4994i(TAG, "trtc_ start decode " + surfaceTexture + ", hw: " + this.mConfig.f5611h + ", id " + getID() + "_" + this.mStreamType);
            if (surfaceTexture != null) {
                tXCVideoDecoder.setup(surfaceTexture, (ByteBuffer) null, (ByteBuffer) null, !this.mRealTime);
                tXCVideoDecoder.setUserId(getID());
                tXCVideoDecoder.start();
            } else {
                if (this.mConfig.f5611h) {
                    return;
                }
                tXCVideoDecoder.setup((Surface) null, (ByteBuffer) null, (ByteBuffer) null, !this.mRealTime);
                tXCVideoDecoder.setUserId(getID());
                tXCVideoDecoder.start();
            }
        }
    }

    private void switchToSoftDecoder() {
        TXCVideoDecoder tXCVideoDecoder = this.mVideoDecoder;
        if (tXCVideoDecoder != null) {
            TXCLog.m4998w(TAG, "switch to soft decoder when hw error");
            tXCVideoDecoder.stop();
            this.mConfig.f5611h = false;
            tXCVideoDecoder.enableChange(false);
            startDecode();
        }
    }

    public void decVideo(TXSNALPacket tXSNALPacket) {
    }

    public void enableDecoderChange(boolean z10) {
        this.mEnableDecoderChange = z10;
    }

    public void enableLimitDecCache(boolean z10) {
        this.mEnableLimitHWDecCache = z10;
        TXCVideoDecoder tXCVideoDecoder = this.mVideoDecoder;
        if (tXCVideoDecoder != null) {
            tXCVideoDecoder.enableLimitDecCache(z10);
        }
    }

    public void enableRestartDecoder(boolean z10) {
        this.mEnableRestartDecoder = z10;
    }

    public long getAVNetRecvInterval() {
        return getLongValue(6014, 2);
    }

    public long getAVPlayInterval() {
        return getLongValue(6013, 2);
    }

    public C6601d getConfig() {
        return this.mConfig;
    }

    public int getStreamType() {
        return this.mStreamType;
    }

    public long getVideoCacheDuration() {
        return getIntValue(6010, 2);
    }

    public long getVideoCacheFrameCount() {
        return getIntValue(6011, 2);
    }

    public int getVideoDecCacheFrameCount() {
        return getIntValue(6012, 2);
    }

    public int getVideoGop() {
        return getIntValue(7120);
    }

    public TextureViewSurfaceTextureListenerC6677e getVideoRender() {
        return this.mVideoRender;
    }

    public boolean isRendering() {
        return this.mIsRendering;
    }

    public void muteVideo(boolean z10) {
        TextureViewSurfaceTextureListenerC6677e textureViewSurfaceTextureListenerC6677e;
        if (z10 || (textureViewSurfaceTextureListenerC6677e = this.mVideoRender) == null) {
            return;
        }
        textureViewSurfaceTextureListenerC6677e.m5510m();
    }

    @Override // com.tencent.liteav.videodecoder.InterfaceC6718f
    public void onDecodeFailed(int i10) {
        TXCLog.m4991e(TAG, "video decode failed " + i10);
        requestKeyFrame();
        int i11 = this.mStreamType;
        long j10 = this.mFrameDecErrCnt + 1;
        this.mFrameDecErrCnt = j10;
        setStatusValue(17014, i11, Long.valueOf(j10));
    }

    @Override // com.tencent.liteav.videodecoder.InterfaceC6718f
    public void onDecodeFrame(TXSVideoFrame tXSVideoFrame, int i10, int i11, long j10, long j11, int i12) {
        EnumC6557b enumC6557b;
        int i13 = i12;
        if (i13 == 0 || i13 == 1 || i13 == 2 || i13 == 3) {
            i13 = 360 - (i13 * 90);
        }
        InterfaceC6607j interfaceC6607j = this.mVideoFrameListener;
        if (interfaceC6607j != null && tXSVideoFrame != null && ((enumC6557b = this.mVideoFrameFormat) == EnumC6557b.I420 || enumC6557b == EnumC6557b.NV21)) {
            TXSVideoFrame tXSVideoFrameM27387clone = this.mVideoRender != null ? tXSVideoFrame.m27387clone() : tXSVideoFrame;
            tXSVideoFrameM27387clone.rotation = (this.mRenderRotation + i13) % 360;
            if (this.mVideoFrameFormat == EnumC6557b.NV21) {
                tXSVideoFrameM27387clone.loadNV21BufferFromI420Buffer();
            }
            interfaceC6607j.mo5189a(getID(), this.mStreamType, tXSVideoFrameM27387clone);
        }
        if (!this.mFirstRender) {
            this.mFirstRender = true;
            TXCEventRecorderProxy.m5002a(getID(), 5007, -1L, -1L, "", this.mStreamType);
            if (this.mVideoRender == null) {
                TXCKeyPointReportProxy.m5003a(getID(), 40022, 0L, this.mStreamType);
            }
            if (this.mVideoDecoder != null) {
                TXCKeyPointReportProxy.m5003a(getID(), 40029, this.mVideoDecoder.GetDecodeFirstFrameTS(), this.mStreamType);
            }
        }
        TextureViewSurfaceTextureListenerC6677e textureViewSurfaceTextureListenerC6677e = this.mVideoRender;
        if (textureViewSurfaceTextureListenerC6677e != null) {
            textureViewSurfaceTextureListenerC6677e.mo5429a(tXSVideoFrame, i10, i11, i13);
        } else {
            if (this.mLastRenderCalculateTS != 0) {
                this.mRenderFrameCount++;
                return;
            }
            this.mLastRenderCalculateTS = System.currentTimeMillis();
            this.mLastRenderFrameCount = 0L;
            this.mRenderFrameCount = 0L;
        }
    }

    @Override // com.tencent.liteav.basic.p047b.InterfaceC6559b
    public void onNotifyEvent(int i10, Bundle bundle) {
        if (i10 == 2106) {
            switchToSoftDecoder();
        } else if (i10 == 2020) {
            TXCLog.m4991e(TAG, "decoding too many frame(>40) without output! request key frame now.");
            requestKeyFrame();
            return;
        }
        bundle.putInt("EVT_STREAM_TYPE", this.mStreamType);
        C6592e.m5040a(this.mNotifyListener, i10, bundle);
    }

    @Override // com.tencent.liteav.renderer.InterfaceC6678f
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture) {
        TXCLog.m4998w(TAG, "play decode when surface texture create hw " + this.mConfig.f5611h);
        TXCVideoDecoder tXCVideoDecoder = this.mVideoDecoder;
        if (tXCVideoDecoder != null) {
            tXCVideoDecoder.setup(surfaceTexture, (ByteBuffer) null, (ByteBuffer) null, !this.mRealTime);
        }
        if (this.mConfig.f5611h) {
            startDecode(surfaceTexture);
        }
    }

    @Override // com.tencent.liteav.renderer.InterfaceC6678f
    public void onSurfaceTextureDestroy(SurfaceTexture surfaceTexture) {
        TXCVideoDecoder tXCVideoDecoder;
        try {
            TXCLog.m4998w(TAG, "play:stop decode when surface texture release");
            if (this.mConfig.f5611h && (tXCVideoDecoder = this.mVideoDecoder) != null) {
                tXCVideoDecoder.stop();
            }
            C6565f c6565f = this.mVideoFrameFilter;
            if (c6565f != null) {
                c6565f.m4847d();
                this.mVideoFrameFilter = null;
            }
            InterfaceC6524a interfaceC6524a = this.mDecListener;
            if (interfaceC6524a != null) {
                interfaceC6524a.mo4700a(surfaceTexture);
            }
        } catch (Exception e10) {
            TXCLog.m4992e(TAG, "onSurfaceTextureDestroy failed.", e10);
        }
    }

    @Override // com.tencent.liteav.renderer.C6673a.a
    public void onTextureProcess(int i10, int i11, int i12, final int i13) {
        InterfaceC6607j interfaceC6607j = this.mVideoFrameListener;
        if (interfaceC6607j != null) {
            if (this.mVideoFrameFormat == EnumC6557b.TEXTURE_2D) {
                TXSVideoFrame tXSVideoFrame = new TXSVideoFrame();
                tXSVideoFrame.width = i11;
                tXSVideoFrame.height = i12;
                tXSVideoFrame.pts = TXCTimeUtil.getTimeTick();
                tXSVideoFrame.rotation = (i13 + this.mRenderRotation) % 360;
                tXSVideoFrame.textureId = i10;
                TextureViewSurfaceTextureListenerC6677e textureViewSurfaceTextureListenerC6677e = this.mVideoRender;
                if (textureViewSurfaceTextureListenerC6677e instanceof C6673a) {
                    tXSVideoFrame.eglContext = ((C6673a) textureViewSurfaceTextureListenerC6677e).m5433b();
                }
                interfaceC6607j.mo5189a(getID(), this.mStreamType, tXSVideoFrame);
                return;
            }
            TXCVideoDecoder tXCVideoDecoder = this.mVideoDecoder;
            if (tXCVideoDecoder == null || tXCVideoDecoder.isHardwareDecode()) {
                if (this.mVideoFrameFilter == null) {
                    if (this.mVideoFrameFormat == EnumC6557b.NV21) {
                        this.mVideoFrameFilter = new C6599a(3);
                    } else {
                        this.mVideoFrameFilter = new C6599a(1);
                    }
                    this.mVideoFrameFilter.m4840a(true);
                    if (this.mVideoFrameFilter.mo4842a()) {
                        this.mVideoFrameFilter.mo4835a(i11, i12);
                        this.mVideoFrameFilter.m4838a(new C6565f.a() { // from class: com.tencent.liteav.TXCRenderAndDec.1
                            @Override // com.tencent.liteav.basic.p048c.C6565f.a
                            /* renamed from: a */
                            public void mo4699a(int i14) {
                                C6565f c6565f = TXCRenderAndDec.this.mVideoFrameFilter;
                                InterfaceC6607j interfaceC6607j2 = TXCRenderAndDec.this.mVideoFrameListener;
                                if (c6565f == null || interfaceC6607j2 == null) {
                                    return;
                                }
                                TXSVideoFrame tXSVideoFrame2 = new TXSVideoFrame();
                                tXSVideoFrame2.width = c6565f.m4856m();
                                tXSVideoFrame2.height = c6565f.m4857n();
                                tXSVideoFrame2.pts = TXCTimeUtil.getTimeTick();
                                tXSVideoFrame2.rotation = (i13 + TXCRenderAndDec.this.mRenderRotation) % 360;
                                interfaceC6607j2.mo5189a(TXCRenderAndDec.this.getID(), TXCRenderAndDec.this.mStreamType, tXSVideoFrame2);
                            }
                        });
                    } else {
                        TXCLog.m4994i(TAG, "throwVideoFrame->release mVideoFrameFilter");
                        this.mVideoFrameFilter = null;
                    }
                }
                if (this.mVideoFrameFilter != null) {
                    GLES20.glViewport(0, 0, i11, i12);
                    this.mVideoFrameFilter.mo4835a(i11, i12);
                    this.mVideoFrameFilter.m4843b(i10);
                }
            }
        }
    }

    @Override // com.tencent.liteav.videodecoder.InterfaceC6718f
    public void onVideoSizeChange(int i10, int i11) {
        TextureViewSurfaceTextureListenerC6677e textureViewSurfaceTextureListenerC6677e = this.mVideoRender;
        if (textureViewSurfaceTextureListenerC6677e != null) {
            textureViewSurfaceTextureListenerC6677e.m5498b(i10, i11);
        }
        Bundle bundle = new Bundle();
        bundle.putCharSequence(TXLiveConstants.EVT_DESCRIPTION, "Resolution changed to" + i10 + "x" + i11);
        bundle.putInt("EVT_PARAM1", i10);
        bundle.putInt("EVT_PARAM2", i11);
        bundle.putString("EVT_USERID", getID());
        bundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
        onNotifyEvent(2009, bundle);
        setStatusValue(TbsReaderView.ReaderCallback.COPY_SELECT_TEXT, this.mStreamType, Integer.valueOf((i10 << 16) | i11));
        long j10 = i10;
        long j11 = i11;
        TXCEventRecorderProxy.m5002a(getID(), 4003, j10, j11, "", this.mStreamType);
        TXCKeyPointReportProxy.m5003a(getID(), 40002, j10, this.mStreamType);
        TXCKeyPointReportProxy.m5003a(getID(), 40003, j11, this.mStreamType);
    }

    public void restartDecoder() {
        TXCVideoDecoder tXCVideoDecoder = this.mVideoDecoder;
        if (tXCVideoDecoder == null || !tXCVideoDecoder.isHevc()) {
            return;
        }
        tXCVideoDecoder.restart(true);
    }

    public void setBlockInterval(int i10) {
        TextureViewSurfaceTextureListenerC6677e textureViewSurfaceTextureListenerC6677e = this.mVideoRender;
        if (textureViewSurfaceTextureListenerC6677e != null) {
            textureViewSurfaceTextureListenerC6677e.m5502e(i10);
        }
    }

    public void setConfig(C6601d c6601d) {
        this.mConfig = c6601d;
        TextureViewSurfaceTextureListenerC6677e textureViewSurfaceTextureListenerC6677e = this.mVideoRender;
        if (textureViewSurfaceTextureListenerC6677e != null) {
            textureViewSurfaceTextureListenerC6677e.m5497b(c6601d.f5607d);
        }
    }

    public void setDecListener(InterfaceC6524a interfaceC6524a) {
        this.mDecListener = interfaceC6524a;
    }

    @Override // com.tencent.liteav.basic.module.C6584a
    public void setID(String str) {
        super.setID(str);
        TextureViewSurfaceTextureListenerC6677e textureViewSurfaceTextureListenerC6677e = this.mVideoRender;
        if (textureViewSurfaceTextureListenerC6677e != null) {
            textureViewSurfaceTextureListenerC6677e.setID(getID());
        }
        TXCVideoDecoder tXCVideoDecoder = this.mVideoDecoder;
        if (tXCVideoDecoder != null) {
            tXCVideoDecoder.setUserId(str);
        }
    }

    public void setNotifyListener(InterfaceC6559b interfaceC6559b) {
        this.mNotifyListener = new WeakReference<>(interfaceC6559b);
    }

    public void setRenderAndDecDelegate(InterfaceC6525b interfaceC6525b) {
        this.mRenderAndDecDelegate = new WeakReference<>(interfaceC6525b);
    }

    public void setRenderMode(int i10) {
        this.mRenderMode = i10;
        TextureViewSurfaceTextureListenerC6677e textureViewSurfaceTextureListenerC6677e = this.mVideoRender;
        if (textureViewSurfaceTextureListenerC6677e != null) {
            textureViewSurfaceTextureListenerC6677e.m5499c(i10);
        }
    }

    public void setRenderRotation(int i10) {
        TXCLog.m4994i(TAG, "vrotation setRenderRotation " + i10);
        this.mRenderRotation = i10;
        TextureViewSurfaceTextureListenerC6677e textureViewSurfaceTextureListenerC6677e = this.mVideoRender;
        if (textureViewSurfaceTextureListenerC6677e != null) {
            textureViewSurfaceTextureListenerC6677e.m5501d(i10);
        }
    }

    public void setStreamType(int i10) {
        this.mStreamType = i10;
        TextureViewSurfaceTextureListenerC6677e textureViewSurfaceTextureListenerC6677e = this.mVideoRender;
        if (textureViewSurfaceTextureListenerC6677e != null) {
            textureViewSurfaceTextureListenerC6677e.m5489a(i10);
        }
        TXCVideoDecoder tXCVideoDecoder = this.mVideoDecoder;
        if (tXCVideoDecoder != null) {
            tXCVideoDecoder.setStreamType(this.mStreamType);
        }
    }

    public void setVideoFrameListener(InterfaceC6607j interfaceC6607j, EnumC6557b enumC6557b) {
        this.mVideoFrameListener = interfaceC6607j;
        this.mVideoFrameFormat = enumC6557b;
        TXCLog.m4994i(TAG, "setVideoFrameListener->enter listener: " + interfaceC6607j + ", format: " + enumC6557b);
        TextureViewSurfaceTextureListenerC6677e textureViewSurfaceTextureListenerC6677e = this.mVideoRender;
        if (textureViewSurfaceTextureListenerC6677e == null || !(textureViewSurfaceTextureListenerC6677e instanceof C6673a)) {
            return;
        }
        if (interfaceC6607j == null) {
            TXCLog.m4994i(TAG, "setCustomRenderListener-> clean listener.");
            ((C6673a) this.mVideoRender).m5435b((C6673a.a) null);
        } else {
            TXCLog.m4994i(TAG, "setCustomRenderListener-> set listener.");
            ((C6673a) this.mVideoRender).m5435b((C6673a.a) this);
        }
    }

    public void setVideoRender(TextureViewSurfaceTextureListenerC6677e textureViewSurfaceTextureListenerC6677e) {
        TXCLog.m4994i(TAG, "set video render " + textureViewSurfaceTextureListenerC6677e + " id " + getID() + ", " + this.mStreamType);
        this.mVideoRender = textureViewSurfaceTextureListenerC6677e;
        if (textureViewSurfaceTextureListenerC6677e == null) {
            return;
        }
        textureViewSurfaceTextureListenerC6677e.setID(getID());
        this.mVideoRender.m5489a(this.mStreamType);
        this.mVideoRender.m5492a((InterfaceC6559b) this);
        this.mVideoRender.m5499c(this.mRenderMode);
        this.mVideoRender.m5501d(this.mRenderRotation);
        if (this.mVideoFrameListener != null) {
            TextureViewSurfaceTextureListenerC6677e textureViewSurfaceTextureListenerC6677e2 = this.mVideoRender;
            if (textureViewSurfaceTextureListenerC6677e2 instanceof C6673a) {
                ((C6673a) textureViewSurfaceTextureListenerC6677e2).m5435b((C6673a.a) this);
            }
        }
        C6601d c6601d = this.mConfig;
        if (c6601d != null) {
            this.mVideoRender.m5497b(c6601d.f5607d);
        }
    }

    public void start(boolean z10) {
        TXCLog.m4994i(TAG, "start render dec " + getID() + ", " + this.mStreamType);
        this.mRealTime = z10;
        this.mFrameDecErrCnt = 0L;
        this.mLastReqKeyFrameTS = 0L;
        TextureViewSurfaceTextureListenerC6677e textureViewSurfaceTextureListenerC6677e = this.mVideoRender;
        if (textureViewSurfaceTextureListenerC6677e != null) {
            textureViewSurfaceTextureListenerC6677e.m5494a((InterfaceC6678f) this);
            this.mVideoRender.m5503f();
            this.mVideoRender.setID(getID());
        }
        TXCVideoDecoder tXCVideoDecoder = new TXCVideoDecoder();
        this.mVideoDecoder = tXCVideoDecoder;
        tXCVideoDecoder.setUserId(getID());
        this.mVideoDecoder.setStreamType(this.mStreamType);
        this.mVideoDecoder.setListener(this);
        this.mVideoDecoder.setNotifyListener(this);
        this.mVideoDecoder.enableChange(this.mEnableDecoderChange);
        this.mVideoDecoder.enableLimitDecCache(this.mEnableLimitHWDecCache);
        this.mVideoDecoder.enableRestart(this.mEnableRestartDecoder);
        startDecode();
        this.mIsRendering = true;
    }

    public void startVideo() {
        stopVideo();
        this.mRealTime = true;
        this.mFrameDecErrCnt = 0L;
        this.mLastReqKeyFrameTS = 0L;
        TextureViewSurfaceTextureListenerC6677e textureViewSurfaceTextureListenerC6677e = this.mVideoRender;
        if (textureViewSurfaceTextureListenerC6677e != null) {
            textureViewSurfaceTextureListenerC6677e.m5494a((InterfaceC6678f) this);
            this.mVideoRender.m5503f();
            this.mVideoRender.setID(getID());
        }
        TXCLog.m4994i(TAG, "start video dec " + getID() + ", " + this.mStreamType);
        TXCVideoDecoder tXCVideoDecoder = new TXCVideoDecoder();
        this.mVideoDecoder = tXCVideoDecoder;
        tXCVideoDecoder.setUserId(getID());
        this.mVideoDecoder.setStreamType(this.mStreamType);
        this.mVideoDecoder.setListener(this);
        this.mVideoDecoder.setNotifyListener(this);
        this.mVideoDecoder.enableChange(this.mEnableDecoderChange);
        this.mVideoDecoder.enableRestart(this.mEnableRestartDecoder);
        this.mVideoDecoder.enableLimitDecCache(this.mEnableLimitHWDecCache);
        startDecode();
        this.mIsRendering = true;
    }

    public void stop() {
        TXCLog.m4994i(TAG, "stop video render dec " + getID() + ", " + this.mStreamType);
        this.mIsRendering = false;
        this.mRealTime = false;
        TXCVideoDecoder tXCVideoDecoder = this.mVideoDecoder;
        if (tXCVideoDecoder != null) {
            tXCVideoDecoder.setListener(null);
            this.mVideoDecoder.setNotifyListener(null);
            this.mVideoDecoder.stop();
        }
        TextureViewSurfaceTextureListenerC6677e textureViewSurfaceTextureListenerC6677e = this.mVideoRender;
        if (textureViewSurfaceTextureListenerC6677e != null) {
            textureViewSurfaceTextureListenerC6677e.m5496a(true);
            this.mVideoRender.m5494a((InterfaceC6678f) null);
        }
    }

    public void stopVideo() {
        this.mIsRendering = false;
        if (this.mVideoDecoder != null) {
            TXCLog.m4994i(TAG, "stop video dec " + getID() + ", " + this.mStreamType);
            this.mVideoDecoder.setListener(null);
            this.mVideoDecoder.setNotifyListener(null);
            this.mVideoDecoder.stop();
        }
        TextureViewSurfaceTextureListenerC6677e textureViewSurfaceTextureListenerC6677e = this.mVideoRender;
        if (textureViewSurfaceTextureListenerC6677e != null) {
            textureViewSurfaceTextureListenerC6677e.m5496a(false);
            this.mVideoRender.m5494a((InterfaceC6678f) null);
        }
    }

    public void updateLoadInfo() {
        TXCVideoDecoder tXCVideoDecoder = this.mVideoDecoder;
        if (tXCVideoDecoder != null) {
            setStatusValue(TbsReaderView.ReaderCallback.SHOW_BAR, this.mStreamType, Long.valueOf(tXCVideoDecoder.isHardwareDecode() ? 1L : 0L));
        }
        TextureViewSurfaceTextureListenerC6677e textureViewSurfaceTextureListenerC6677e = this.mVideoRender;
        if (textureViewSurfaceTextureListenerC6677e != null) {
            textureViewSurfaceTextureListenerC6677e.m5511n();
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j10 = jCurrentTimeMillis - this.mLastRenderCalculateTS;
        if (j10 >= 1000) {
            this.mLastRenderFrameCount = this.mRenderFrameCount;
            this.mLastRenderCalculateTS = jCurrentTimeMillis;
            setStatusValue(6002, this.mStreamType, Double.valueOf(((r4 - this.mLastRenderFrameCount) * 1000.0d) / j10));
        }
    }

    private void startDecode() {
        TextureViewSurfaceTextureListenerC6677e textureViewSurfaceTextureListenerC6677e = this.mVideoRender;
        startDecode(textureViewSurfaceTextureListenerC6677e != null ? textureViewSurfaceTextureListenerC6677e.mo5425a() : null);
    }
}
