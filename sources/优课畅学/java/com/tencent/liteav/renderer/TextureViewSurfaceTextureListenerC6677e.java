package com.tencent.liteav.renderer;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.Surface;
import android.view.TextureView;
import androidx.camera.video.AudioStats;
import com.tencent.liteav.TXLiteAVCode;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.module.C6584a;
import com.tencent.liteav.basic.module.Monitor;
import com.tencent.liteav.basic.module.TXCKeyPointReportProxy;
import com.tencent.liteav.basic.p047b.InterfaceC6559b;
import com.tencent.liteav.basic.p048c.C6563d;
import com.tencent.liteav.basic.p048c.InterfaceC6570k;
import com.tencent.liteav.basic.structs.TXSVideoFrame;
import com.tencent.liteav.basic.util.C6592e;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.rtmp.TXLiveConstants;
import com.tencent.smtt.sdk.TbsListener;
import java.lang.ref.WeakReference;
import org.slf4j.Marker;

/* renamed from: com.tencent.liteav.renderer.e */
/* loaded from: classes4.dex */
public class TextureViewSurfaceTextureListenerC6677e extends C6584a implements TextureView.SurfaceTextureListener {

    /* renamed from: a */
    private static final float[] f6104a = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f};

    /* renamed from: b */
    private SurfaceTexture f6111b;

    /* renamed from: d */
    protected TextureView f6113d;

    /* renamed from: e */
    protected C6676d f6114e;

    /* renamed from: o */
    protected InterfaceC6678f f6124o;

    /* renamed from: p */
    WeakReference<InterfaceC6559b> f6125p;

    /* renamed from: q */
    private C6563d f6126q;

    /* renamed from: r */
    private C6680h f6127r;

    /* renamed from: s */
    private Surface f6128s;

    /* renamed from: u */
    private int f6130u;

    /* renamed from: f */
    protected int f6115f = 0;

    /* renamed from: g */
    protected int f6116g = 0;

    /* renamed from: h */
    protected int f6117h = 0;

    /* renamed from: i */
    protected int f6118i = 0;

    /* renamed from: j */
    protected int f6119j = 0;

    /* renamed from: c */
    private int f6112c = 800;

    /* renamed from: t */
    private int f6129t = 0;

    /* renamed from: k */
    protected int f6120k = 0;

    /* renamed from: l */
    protected volatile int f6121l = -1;

    /* renamed from: m */
    protected int f6122m = 0;

    /* renamed from: n */
    protected int f6123n = 0;

    /* renamed from: v */
    private int[] f6131v = new int[5];

    /* renamed from: w */
    private int f6132w = TbsListener.ErrorCode.INFO_CODE_MINIQB;

    /* renamed from: x */
    private long f6133x = 0;

    /* renamed from: y */
    private long f6134y = 0;

    /* renamed from: z */
    private long f6135z = 0;

    /* renamed from: A */
    private long f6105A = 0;

    /* renamed from: B */
    private boolean f6106B = false;

    /* renamed from: C */
    private boolean f6107C = false;

    /* renamed from: E */
    private boolean f6109E = false;

    /* renamed from: F */
    private a f6110F = new a();

    /* renamed from: D */
    private boolean f6108D = false;

    /* renamed from: com.tencent.liteav.renderer.e$a */
    public static class a {

        /* renamed from: a */
        public long f6146a;

        /* renamed from: b */
        public long f6147b;

        /* renamed from: c */
        public long f6148c;

        /* renamed from: d */
        public long f6149d;

        /* renamed from: e */
        public long f6150e;

        /* renamed from: f */
        public long f6151f;

        /* renamed from: g */
        public long f6152g;

        /* renamed from: h */
        public long f6153h;

        /* renamed from: i */
        public long f6154i;

        /* renamed from: j */
        public int f6155j;

        /* renamed from: k */
        public int f6156k;
    }

    /* renamed from: a */
    public SurfaceTexture mo5425a() {
        return null;
    }

    /* renamed from: c */
    public void mo5437c(Object obj) {
    }

    /* renamed from: d */
    public void m5501d(int i10) {
        this.f6129t = i10;
        C6676d c6676d = this.f6114e;
        if (c6676d != null) {
            c6676d.m5477c((i10 + this.f6120k) % 360);
        }
    }

    /* renamed from: e */
    public void mo5440e() {
    }

    /* renamed from: f */
    public void m5503f() {
        Monitor.m5001a(2, String.format("Remote-VideoRender[%d]: Start [tinyID:%s] [streamType:%d]", Integer.valueOf(hashCode()), getID(), Integer.valueOf(this.f6119j)), "streamType: 2-big, 3-small, 7-sub", 0);
        this.f6107C = true;
        this.f6109E = true;
        this.f6108D = false;
        m5510m();
    }

    /* renamed from: g */
    public int m5504g() {
        TextureView textureView = this.f6113d;
        if (textureView != null) {
            return textureView.getWidth();
        }
        if (this.f6128s != null) {
            return this.f6122m;
        }
        return 0;
    }

    /* renamed from: h */
    public int m5505h() {
        TextureView textureView = this.f6113d;
        if (textureView != null) {
            return textureView.getHeight();
        }
        if (this.f6128s != null) {
            return this.f6123n;
        }
        return 0;
    }

    /* renamed from: i */
    public int m5506i() {
        return this.f6117h;
    }

    /* renamed from: j */
    public int m5507j() {
        return this.f6118i;
    }

    /* renamed from: k */
    public void m5508k() {
    }

    /* renamed from: l */
    public void m5509l() {
        synchronized (this) {
            try {
                if (this.f6126q != null) {
                    TXCLog.m4994i("TXCVideoRender", "surface-render: onRenderThreadEGLDestroy stop render thread " + this.f6126q);
                    this.f6126q.m4814a();
                    this.f6126q = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C6680h c6680h = this.f6127r;
        if (c6680h != null) {
            c6680h.m5526c();
            this.f6127r = null;
        }
    }

    /* renamed from: m */
    public void m5510m() {
        a aVar = this.f6110F;
        aVar.f6146a = 0L;
        aVar.f6147b = 0L;
        aVar.f6148c = 0L;
        aVar.f6149d = 0L;
        aVar.f6150e = 0L;
        aVar.f6151f = 0L;
        aVar.f6152g = 0L;
        aVar.f6153h = 0L;
        aVar.f6154i = 0L;
        aVar.f6155j = 0;
        aVar.f6156k = 0;
        setStatusValue(TXLiteAVCode.WARNING_IGNORE_UPSTREAM_FOR_AUDIENCE, this.f6119j, 0L);
        setStatusValue(6002, this.f6119j, Double.valueOf(AudioStats.AUDIO_AMPLITUDE_NONE));
        setStatusValue(6003, this.f6119j, 0L);
        setStatusValue(6005, this.f6119j, 0L);
        setStatusValue(6006, this.f6119j, 0L);
        setStatusValue(6004, this.f6119j, 0L);
    }

    /* renamed from: n */
    public void m5511n() {
        a aVar = this.f6110F;
        if (aVar.f6146a == 0) {
            aVar.f6146a = TXCTimeUtil.getTimeTick();
            return;
        }
        long timeTick = TXCTimeUtil.getTimeTick() - this.f6110F.f6146a;
        if (timeTick >= 1000) {
            setStatusValue(6002, this.f6119j, Double.valueOf(((r2.f6148c - r2.f6147b) * 1000.0d) / timeTick));
            TXCKeyPointReportProxy.m5003a(getID(), 40001, (int) r2, this.f6119j);
            a aVar2 = this.f6110F;
            aVar2.f6147b = aVar2.f6148c;
            aVar2.f6146a += timeTick;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        TXCLog.m4998w("TXCVideoRender", "play:vrender: texture available @" + surfaceTexture + "id " + getID() + "_" + this.f6119j);
        this.f6115f = i10;
        this.f6116g = i11;
        C6676d c6676d = this.f6114e;
        if (c6676d != null) {
            c6676d.m5474a(i10, i11);
        }
        if (this.f6111b != null) {
            SurfaceTexture surfaceTexture2 = this.f6113d.getSurfaceTexture();
            SurfaceTexture surfaceTexture3 = this.f6111b;
            if (surfaceTexture2 != surfaceTexture3) {
                this.f6113d.setSurfaceTexture(surfaceTexture3);
            }
            this.f6111b = null;
        } else {
            mo5428a(surfaceTexture);
        }
        this.f6106B = true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        try {
            this.f6106B = false;
            TXCLog.m4998w("TXCVideoRender", "play:vrender:  onSurfaceTextureDestroyed when need save texture : " + this.f6109E + "id " + getID() + "_" + this.f6119j);
            if (this.f6109E) {
                this.f6111b = surfaceTexture;
            } else {
                this.f6110F.f6146a = 0L;
                mo5434b(surfaceTexture);
                if (surfaceTexture == this.f6111b) {
                    this.f6111b = null;
                }
            }
        } catch (Exception e10) {
            TXCLog.m4992e("TXCVideoRender", "onSurfaceTextureDestroyed failed.", e10);
        }
        return this.f6111b == null;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        TXCLog.m4998w("TXCVideoRender", "play:vrender: texture size change new:" + i10 + "," + i11 + " old:" + this.f6115f + "," + this.f6116g);
        if (!this.f6106B) {
            TXCLog.m4998w("TXCVideoRender", "play:vrender: onSurfaceCreate on onSurfaceTextureSizeChanged when onSurfaceTextureAvailable is not trigger");
            this.f6106B = true;
            mo5428a(surfaceTexture);
        }
        this.f6115f = i10;
        this.f6116g = i11;
        C6676d c6676d = this.f6114e;
        if (c6676d != null) {
            c6676d.m5474a(i10, i11);
        }
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    /* renamed from: b */
    public void m5497b(int i10) {
        if (i10 > 0) {
            this.f6112c = i10;
        }
    }

    /* renamed from: c */
    public void m5499c(int i10) {
        this.f6130u = i10;
        C6676d c6676d = this.f6114e;
        if (c6676d != null) {
            c6676d.m5473a(i10);
        }
    }

    /* renamed from: e */
    public void m5502e(int i10) {
        this.f6132w = i10;
    }

    /* renamed from: b */
    public void m5498b(int i10, int i11) {
        mo5426a(i10, i11);
    }

    /* renamed from: a */
    public void m5489a(int i10) {
        this.f6119j = i10;
    }

    /* renamed from: b */
    public void mo5434b(SurfaceTexture surfaceTexture) {
        this.f6106B = false;
    }

    /* renamed from: a */
    private Bitmap m5480a(Bitmap bitmap, int i10, int i11) {
        float height;
        float f10 = i11;
        float f11 = i10;
        if (f10 / f11 > bitmap.getHeight() / bitmap.getWidth()) {
            height = f11 / bitmap.getWidth();
        } else {
            height = f10 / bitmap.getHeight();
        }
        Matrix matrix = new Matrix();
        matrix.preScale(height, height);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
        bitmap.recycle();
        return bitmapCreateBitmap;
    }

    /* renamed from: b */
    private void m5487b(TextureView textureView) {
        boolean z10 = false;
        if (textureView != null) {
            this.f6121l = 0;
        }
        TextureView textureView2 = this.f6113d;
        if ((textureView2 == null && textureView != null) || (textureView2 != null && !textureView2.equals(textureView))) {
            z10 = true;
        }
        TXCLog.m4998w("TXCVideoRender", "play:vrender: set video view @old=" + this.f6113d + ",new=" + textureView + "id " + getID() + "_" + this.f6119j);
        if (z10) {
            TextureView textureView3 = this.f6113d;
            if (textureView3 != null && this.f6111b == null) {
                mo5434b(textureView3.getSurfaceTexture());
                this.f6113d.setSurfaceTextureListener(null);
            }
            this.f6113d = textureView;
            if (textureView != null) {
                if (textureView.getWidth() != 0) {
                    this.f6115f = this.f6113d.getWidth();
                }
                if (this.f6113d.getHeight() != 0) {
                    this.f6116g = this.f6113d.getHeight();
                }
                C6676d c6676d = new C6676d(this.f6113d);
                this.f6114e = c6676d;
                c6676d.m5476b(this.f6117h, this.f6118i);
                this.f6114e.m5474a(this.f6115f, this.f6116g);
                this.f6114e.m5473a(this.f6130u);
                this.f6114e.m5477c((this.f6129t + this.f6120k) % 360);
                this.f6113d.setSurfaceTextureListener(this);
                if (this.f6111b != null) {
                    if (this.f6113d.getSurfaceTexture() != this.f6111b) {
                        TXCLog.m4998w("TXCVideoRender", "play:vrender: setSurfaceTexture " + this.f6113d + ", surfaceTexture " + this.f6111b);
                        this.f6113d.setSurfaceTexture(this.f6111b);
                        return;
                    }
                    TXCLog.m4998w("TXCVideoRender", "play:vrender: not setSurfaceTexture old surfaceTexture " + this.f6113d.getSurfaceTexture() + ", new surfaceTexture " + this.f6111b);
                    return;
                }
                if (this.f6113d.isAvailable()) {
                    mo5428a(this.f6113d.getSurfaceTexture());
                }
            }
        }
    }

    /* renamed from: c */
    public void m5500c(final int i10, final int i11) {
        TXCLog.m4994i("TXCVideoRender", "surface-render: set setSurfaceSize " + i10 + Marker.ANY_MARKER + i11);
        if (i10 == this.f6122m && i11 == this.f6123n) {
            return;
        }
        if (this.f6126q != null && this.f6121l == 1 && this.f6131v != null) {
            this.f6126q.m4818a(new Runnable() { // from class: com.tencent.liteav.renderer.e.3
                @Override // java.lang.Runnable
                public void run() {
                    TextureViewSurfaceTextureListenerC6677e textureViewSurfaceTextureListenerC6677e = TextureViewSurfaceTextureListenerC6677e.this;
                    textureViewSurfaceTextureListenerC6677e.f6122m = i10;
                    textureViewSurfaceTextureListenerC6677e.f6123n = i11;
                    if (textureViewSurfaceTextureListenerC6677e.f6126q != null) {
                        C6563d c6563d = TextureViewSurfaceTextureListenerC6677e.this.f6126q;
                        int i12 = TextureViewSurfaceTextureListenerC6677e.this.f6131v[0];
                        boolean z10 = TextureViewSurfaceTextureListenerC6677e.this.f6131v[3] == 1;
                        int i13 = TextureViewSurfaceTextureListenerC6677e.this.f6131v[4];
                        TextureViewSurfaceTextureListenerC6677e textureViewSurfaceTextureListenerC6677e2 = TextureViewSurfaceTextureListenerC6677e.this;
                        c6563d.m4815a(i12, z10, i13, textureViewSurfaceTextureListenerC6677e2.f6122m, textureViewSurfaceTextureListenerC6677e2.f6123n, textureViewSurfaceTextureListenerC6677e2.f6131v[1], TextureViewSurfaceTextureListenerC6677e.this.f6131v[2], true, false);
                    }
                }
            });
        } else {
            this.f6122m = i10;
            this.f6123n = i11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public Bitmap m5481a(Matrix matrix, Bitmap bitmap, int i10, int i11) {
        Bitmap bitmap2;
        int i12 = 360 - ((this.f6129t + this.f6120k) % 360);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        bitmap.recycle();
        if (i12 != 0) {
            Matrix matrix2 = new Matrix();
            matrix2.setRotate(i12);
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix2, false);
            bitmapCreateBitmap.recycle();
            bitmap2 = bitmapCreateBitmap2;
        } else {
            bitmap2 = bitmapCreateBitmap;
        }
        if (this.f6130u != 0) {
            return (i10 == bitmap2.getWidth() || i11 == bitmap2.getHeight()) ? bitmap2 : m5480a(bitmap2, i10, i11);
        }
        int width = bitmap2.getWidth();
        int height = bitmap2.getHeight();
        boolean z10 = i10 < i11;
        if (z10 == (width < height)) {
            return (i10 == bitmap2.getWidth() || i11 == bitmap2.getHeight()) ? bitmap2 : m5480a(bitmap2, i10, i11);
        }
        if (z10) {
            float f10 = i10;
            float f11 = (height * f10) / i11;
            Matrix matrix3 = new Matrix();
            float f12 = f10 / f11;
            matrix3.preScale(f12, f12);
            Bitmap bitmapCreateBitmap3 = Bitmap.createBitmap(bitmap2, (int) ((width - f11) * 0.5f), 0, (int) f11, height, matrix3, false);
            bitmap2.recycle();
            return bitmapCreateBitmap3;
        }
        float f13 = i11;
        float f14 = (width / i10) * f13;
        Matrix matrix4 = new Matrix();
        float f15 = f13 / f14;
        matrix4.preScale(f15, f15);
        Bitmap bitmapCreateBitmap4 = Bitmap.createBitmap(bitmap2, 0, (int) ((height - f14) * 0.5f), width, (int) f14, (Matrix) null, false);
        Bitmap bitmapCreateBitmap5 = Bitmap.createBitmap(bitmapCreateBitmap4, 0, 0, bitmapCreateBitmap4.getWidth(), bitmapCreateBitmap4.getHeight(), matrix4, false);
        bitmapCreateBitmap4.recycle();
        return bitmapCreateBitmap5;
    }

    /* renamed from: b */
    private void m5486b(Surface surface) {
        TXCLog.m4994i("TXCVideoRender", "surface-render: set surface " + surface);
        if (this.f6128s == surface) {
            TXCLog.m4994i("TXCVideoRender", "surface-render: set the same surface, ignore ");
            return;
        }
        this.f6128s = surface;
        this.f6121l = 1;
        if (surface != null) {
            TXCLog.m4994i("TXCVideoRender", "surface-render: set surface start render thread " + surface);
            mo5437c((Object) null);
            return;
        }
        synchronized (this) {
            try {
                if (this.f6126q != null) {
                    TXCLog.m4994i("TXCVideoRender", "surface-render: set surface stop render thread " + this.f6126q);
                    this.f6126q.m4814a();
                    this.f6126q = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    public void m5493a(final InterfaceC6570k interfaceC6570k) {
        final Bitmap bitmap;
        final TextureView textureView = this.f6113d;
        if (textureView != null) {
            try {
                bitmap = textureView.getBitmap();
            } catch (OutOfMemoryError unused) {
                bitmap = null;
            }
            if (bitmap != null) {
                final Matrix transform = textureView.getTransform(null);
                AsyncTask.execute(new Runnable() { // from class: com.tencent.liteav.renderer.e.1
                    @Override // java.lang.Runnable
                    public void run() {
                        Bitmap bitmapM5481a = null;
                        try {
                            bitmapM5481a = TextureViewSurfaceTextureListenerC6677e.this.m5481a(transform, bitmap, textureView.getWidth(), textureView.getHeight());
                        } catch (Error e10) {
                            TXCLog.m4998w("TXCVideoRender", "takePhoto error " + e10);
                        } catch (Exception e11) {
                            TXCLog.m4998w("TXCVideoRender", "takePhoto error " + e11);
                        }
                        InterfaceC6570k interfaceC6570k2 = interfaceC6570k;
                        if (interfaceC6570k2 != null) {
                            interfaceC6570k2.mo4871a(bitmapM5481a);
                        }
                    }
                });
                return;
            }
            return;
        }
        C6563d c6563d = this.f6126q;
        if (c6563d != null) {
            c6563d.m4818a(new Runnable() { // from class: com.tencent.liteav.renderer.e.2
                @Override // java.lang.Runnable
                public void run() {
                    if (TextureViewSurfaceTextureListenerC6677e.this.f6126q != null) {
                        TextureViewSurfaceTextureListenerC6677e.this.f6126q.m4816a(interfaceC6570k);
                    }
                }
            });
        } else if (interfaceC6570k != null) {
            interfaceC6570k.mo4871a(null);
        }
    }

    /* renamed from: b */
    private void m5485b() {
        if (!this.f6108D) {
            Bundle bundle = new Bundle();
            bundle.putString("EVT_USERID", getID());
            bundle.putInt("EVT_ID", 2003);
            bundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
            bundle.putCharSequence(TXLiveConstants.EVT_DESCRIPTION, "Render the first video frame(IDR)");
            bundle.putInt("EVT_PARAM1", this.f6117h);
            bundle.putInt("EVT_PARAM2", this.f6118i);
            C6592e.m5040a(this.f6125p, 2003, bundle);
            setStatusValue(TXLiteAVCode.WARNING_IGNORE_UPSTREAM_FOR_AUDIENCE, this.f6119j, Long.valueOf(TXCTimeUtil.getTimeTick()));
            setStatusValue(6015, this.f6119j, Integer.valueOf(this.f6117h));
            setStatusValue(6016, this.f6119j, Integer.valueOf(this.f6118i));
            TXCLog.m4994i("TXCVideoRender", "trtc_render render first frame " + getID() + ", " + this.f6119j);
            this.f6108D = true;
            Monitor.m5001a(2, String.format("Remote-VideoRender[%d]: Render first frame [tinyID:%s][streamType:%d]", Integer.valueOf(hashCode()), getID(), Integer.valueOf(this.f6119j)), "streamType: 2-big, 3-small, 7-sub", 0);
            TXCKeyPointReportProxy.m5003a(getID(), 40022, 0L, this.f6119j);
        }
        this.f6110F.f6148c++;
        m5511n();
        a aVar = this.f6110F;
        long j10 = aVar.f6149d;
        if (j10 != 0) {
            aVar.f6154i = m5479a(j10);
            a aVar2 = this.f6110F;
            if (aVar2.f6154i > this.f6132w) {
                long j11 = aVar2.f6150e + 1;
                aVar2.f6150e = j11;
                setStatusValue(6003, this.f6119j, Long.valueOf(j11));
                a aVar3 = this.f6110F;
                long j12 = aVar3.f6154i;
                if (j12 > aVar3.f6153h) {
                    aVar3.f6153h = j12;
                    setStatusValue(6005, this.f6119j, Long.valueOf(j12));
                }
                a aVar4 = this.f6110F;
                long j13 = aVar4.f6152g + aVar4.f6154i;
                aVar4.f6152g = j13;
                setStatusValue(6006, this.f6119j, Long.valueOf(j13));
                TXCLog.m4998w("TXCVideoRender", "render frame count:" + this.f6110F.f6148c + " block time:" + this.f6110F.f6154i + "> 500");
            }
            long j14 = this.f6110F.f6154i;
            if (j14 > this.f6112c) {
                this.f6133x++;
                this.f6135z += j14;
                TXCLog.m4998w("TXCVideoRender", "render frame count:" + this.f6110F.f6148c + " block time:" + this.f6110F.f6154i + "> " + this.f6112c);
                WeakReference<InterfaceC6559b> weakReference = this.f6125p;
                String id = getID();
                StringBuilder sb = new StringBuilder();
                sb.append("Current video playback stuck for ");
                sb.append(this.f6110F.f6154i);
                sb.append("ms");
                C6592e.m5043a(weakReference, id, 2105, sb.toString());
            }
            a aVar5 = this.f6110F;
            if (aVar5.f6154i > 1000) {
                long j15 = aVar5.f6151f + 1;
                aVar5.f6151f = j15;
                setStatusValue(6004, this.f6119j, Long.valueOf(j15));
                TXCLog.m4998w("TXCVideoRender", "render frame count:" + this.f6110F.f6148c + " block time:" + this.f6110F.f6154i + "> 1000");
            }
        }
        long timeTick = TXCTimeUtil.getTimeTick();
        long j16 = this.f6134y;
        if (j16 == 0) {
            this.f6134y = timeTick;
        } else if (timeTick - j16 >= 2000) {
            setStatusValue(17015, this.f6119j, Long.valueOf(this.f6133x));
            setStatusValue(17016, this.f6119j, Long.valueOf(this.f6135z));
            if (this.f6105A != 0) {
                TXCKeyPointReportProxy.m5003a(getID(), 40005, (int) this.f6135z, this.f6119j);
                TXCKeyPointReportProxy.m5003a(getID(), 40006, (int) (timeTick - this.f6134y), this.f6119j);
            }
            this.f6133x = 0L;
            this.f6134y = timeTick;
            this.f6135z = 0L;
        }
        this.f6110F.f6149d = TXCTimeUtil.getTimeTick();
        if (this.f6105A == 0) {
            this.f6105A = this.f6110F.f6149d;
        }
        a aVar6 = this.f6110F;
        aVar6.f6156k = this.f6118i;
        aVar6.f6155j = this.f6117h;
    }

    /* renamed from: a */
    public void m5494a(InterfaceC6678f interfaceC6678f) {
        this.f6124o = interfaceC6678f;
    }

    /* renamed from: a */
    public void m5492a(InterfaceC6559b interfaceC6559b) {
        this.f6125p = new WeakReference<>(interfaceC6559b);
    }

    /* renamed from: a */
    public void m5491a(TextureView textureView) {
        m5487b(textureView);
    }

    /* renamed from: a */
    public void m5490a(Surface surface) {
        m5486b(surface);
    }

    /* renamed from: a */
    public void mo5429a(TXSVideoFrame tXSVideoFrame, int i10, int i11, int i12) {
        if (i12 != this.f6120k) {
            this.f6120k = i12;
            m5501d(this.f6129t);
        }
        mo5426a(i10, i11);
        m5485b();
    }

    /* renamed from: a */
    public void mo5427a(int i10, int i11, int i12, boolean z10, int i13) {
        mo5426a(i11, i12);
    }

    /* renamed from: a */
    public void m5496a(boolean z10) {
        if (this.f6107C) {
            Monitor.m5001a(2, String.format("Remote-VideoRender[%d]: Stop [tinyID:%s][streamType:%d][stopRendThread:%s]", Integer.valueOf(hashCode()), getID(), Integer.valueOf(this.f6119j), z10 ? "true" : "false"), "streamType: 2-big, 3-small, 7-sub", 0);
        }
        this.f6107C = false;
        this.f6108D = false;
        this.f6109E = false;
        if (z10 && this.f6121l == 1) {
            this.f6121l = -1;
            TXCLog.m4998w("TXCVideoRender", "play:vrender: quit render thread when stop");
            mo5440e();
            synchronized (this) {
                try {
                    if (this.f6126q != null) {
                        TXCLog.m4994i("TXCVideoRender", "surface-render:stop render thread " + this.f6126q);
                        this.f6126q.m4814a();
                        this.f6126q = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* renamed from: a */
    public void mo5428a(SurfaceTexture surfaceTexture) {
        this.f6106B = true;
    }

    /* renamed from: a */
    public void mo5426a(int i10, int i11) {
        int i12 = this.f6117h;
        if (i12 == i10 && this.f6118i == i11) {
            return;
        }
        if (i12 == i10 && this.f6118i == i11) {
            return;
        }
        this.f6117h = i10;
        this.f6118i = i11;
        C6676d c6676d = this.f6114e;
        if (c6676d != null) {
            c6676d.m5476b(i10, i11);
        }
    }

    /* renamed from: a */
    public void m5495a(Object obj, int i10, float[] fArr, boolean z10) {
        Surface surfaceM4819b;
        if (this.f6121l == 1) {
            int[] iArrM5484a = m5484a(i10, this.f6117h, this.f6118i, fArr, z10);
            int i11 = iArrM5484a[0];
            int i12 = iArrM5484a[1];
            int i13 = iArrM5484a[2];
            System.arraycopy(iArrM5484a, 0, this.f6131v, 0, 3);
            if (z10) {
                int[] iArr = this.f6131v;
                iArr[3] = 1;
                iArr[4] = 180;
            } else {
                int[] iArr2 = this.f6131v;
                iArr2[3] = 0;
                iArr2[4] = 0;
            }
            synchronized (this) {
                try {
                    Surface surface = this.f6128s;
                    if (surface != null) {
                        C6563d c6563d = this.f6126q;
                        if (c6563d != null && ((surfaceM4819b = c6563d.m4819b()) != surface || (surfaceM4819b != null && !surfaceM4819b.isValid()))) {
                            TXCLog.m4994i("TXCVideoRender", "surface-render: onDrawTextureToSurface surface change stop render thread " + this.f6126q + ", " + surfaceM4819b + ", " + surface);
                            this.f6126q.m4814a();
                            this.f6126q = null;
                        }
                        if (this.f6126q == null && this.f6121l == 1 && surface.isValid()) {
                            this.f6126q = new C6563d();
                            TXCLog.m4994i("TXCVideoRender", "surface-render: onDrawTextureToSurface start render thread " + this.f6126q + "," + surface);
                            this.f6126q.m4817a(obj, surface);
                        }
                        if (this.f6126q != null && this.f6121l == 1) {
                            if (z10) {
                                this.f6126q.m4815a(i11, true, TXLiveConstants.RENDER_ROTATION_180, this.f6122m, this.f6123n, i12, i13, false, false);
                            } else {
                                this.f6126q.m4815a(i11, false, 0, this.f6122m, this.f6123n, i12, i13, false, false);
                            }
                        }
                    } else if (this.f6126q != null) {
                        TXCLog.m4994i("TXCVideoRender", "surface-render: onDrawTextureToSurface stop render thread " + this.f6126q);
                        this.f6126q.m4814a();
                        this.f6126q = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* renamed from: a */
    private int[] m5484a(int i10, int i11, int i12, float[] fArr, boolean z10) {
        C6680h c6680h = this.f6127r;
        if (c6680h != null && c6680h.m5522a() != z10) {
            this.f6127r.m5526c();
            this.f6127r = null;
        }
        if (this.f6127r == null) {
            C6680h c6680h2 = new C6680h(Boolean.valueOf(z10));
            this.f6127r = c6680h2;
            c6680h2.m5523b();
        }
        if (fArr != null) {
            this.f6127r.m5521a(fArr);
        } else {
            this.f6127r.m5521a(f6104a);
        }
        int i13 = this.f6122m;
        int i14 = this.f6123n;
        if (this.f6130u == 0) {
            this.f6127r.m5518a(C6680h.f6157a);
        } else {
            this.f6127r.m5518a(C6680h.f6158b);
        }
        int i15 = this.f6129t;
        int i16 = this.f6120k;
        int i17 = (i15 + i16) % 360;
        if (z10 && (i15 == 90 || i15 == 270)) {
            i17 = ((i15 + i16) + TXLiveConstants.RENDER_ROTATION_180) % 360;
        }
        this.f6127r.m5524b(i17);
        this.f6127r.m5525b(i11, i12);
        this.f6127r.m5519a(i13, i14);
        return new int[]{this.f6127r.m5528d(i10), i13, i14};
    }

    /* renamed from: a */
    private long m5479a(long j10) {
        long timeTick = TXCTimeUtil.getTimeTick();
        if (j10 > timeTick) {
            return 0L;
        }
        return timeTick - j10;
    }
}
