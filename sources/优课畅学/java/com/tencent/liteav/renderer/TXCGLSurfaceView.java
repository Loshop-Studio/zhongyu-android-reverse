package com.tencent.liteav.renderer;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.AttributeSet;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.p047b.InterfaceC6559b;
import com.tencent.liteav.basic.p048c.C6565f;
import com.tencent.liteav.basic.p048c.C6566g;
import com.tencent.liteav.basic.p048c.C6568i;
import com.tencent.liteav.basic.p048c.EnumC6567h;
import com.tencent.liteav.basic.p048c.InterfaceC6569j;
import com.tencent.liteav.basic.p048c.InterfaceC6570k;
import com.tencent.liteav.basic.util.C6592e;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.rtmp.TXLiveConstants;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.Queue;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.opengles.GL10;

/* loaded from: classes4.dex */
public class TXCGLSurfaceView extends TXCGLSurfaceViewBase implements SurfaceTexture.OnFrameAvailableListener, GLSurfaceView.Renderer {

    /* renamed from: A */
    private InterfaceC6570k f5936A;

    /* renamed from: B */
    private int f5937B;

    /* renamed from: C */
    private int f5938C;

    /* renamed from: D */
    private boolean f5939D;

    /* renamed from: E */
    private boolean f5940E;

    /* renamed from: F */
    private InterfaceC6569j f5941F;

    /* renamed from: G */
    private long f5942G;

    /* renamed from: H */
    private byte[] f5943H;

    /* renamed from: I */
    private long f5944I;

    /* renamed from: J */
    private int f5945J;

    /* renamed from: K */
    private int f5946K;

    /* renamed from: L */
    private final Queue<Runnable> f5947L;

    /* renamed from: a */
    WeakReference<InterfaceC6559b> f5948a;

    /* renamed from: g */
    private SurfaceTexture f5949g;

    /* renamed from: h */
    private EGLContext f5950h;

    /* renamed from: i */
    private C6565f f5951i;

    /* renamed from: j */
    private int[] f5952j;

    /* renamed from: k */
    private float[] f5953k;

    /* renamed from: l */
    private int f5954l;

    /* renamed from: m */
    private boolean f5955m;

    /* renamed from: n */
    private float f5956n;

    /* renamed from: o */
    private float f5957o;

    /* renamed from: p */
    private int f5958p;

    /* renamed from: q */
    private long f5959q;

    /* renamed from: r */
    private long f5960r;

    /* renamed from: s */
    private int f5961s;

    /* renamed from: t */
    private boolean f5962t;

    /* renamed from: u */
    private boolean f5963u;

    /* renamed from: v */
    private Object f5964v;

    /* renamed from: w */
    private Handler f5965w;

    /* renamed from: x */
    private int f5966x;

    /* renamed from: y */
    private int f5967y;

    /* renamed from: z */
    private boolean f5968z;

    public TXCGLSurfaceView(Context context) {
        super(context);
        this.f5953k = new float[16];
        this.f5954l = 0;
        this.f5955m = false;
        this.f5956n = 1.0f;
        this.f5957o = 1.0f;
        this.f5958p = 20;
        this.f5959q = 0L;
        this.f5960r = 0L;
        this.f5961s = 12288;
        this.f5962t = true;
        this.f5963u = false;
        this.f5964v = new Object();
        this.f5966x = 0;
        this.f5967y = 0;
        this.f5968z = true;
        this.f5936A = null;
        this.f5937B = 0;
        this.f5938C = 0;
        this.f5939D = true;
        this.f5940E = true;
        this.f5943H = null;
        this.f5944I = 0L;
        this.f5945J = 0;
        this.f5946K = 0;
        this.f5947L = new LinkedList();
        setEGLContextClientVersion(2);
        m5375a(8, 8, 8, 8, 16, 0);
        setRenderer(this);
    }

    /* renamed from: e */
    private void m5360e() {
        if (!this.f5940E) {
            SurfaceTexture surfaceTexture = this.f5949g;
            if (surfaceTexture != null) {
                surfaceTexture.setOnFrameAvailableListener(null);
                return;
            }
            return;
        }
        if (this.f5949g != null) {
            if (this.f5965w == null) {
                HandlerThread handlerThread = new HandlerThread("VideoCaptureThread");
                handlerThread.start();
                this.f5965w = new Handler(handlerThread.getLooper());
            }
            this.f5949g.setOnFrameAvailableListener(this, this.f5965w);
        }
    }

    public EGLContext getGLContext() {
        return this.f5950h;
    }

    public SurfaceTexture getSurfaceTexture() {
        return this.f5949g;
    }

    @Override // com.tencent.liteav.renderer.TXCGLSurfaceViewBase, android.view.SurfaceView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Handler handler = this.f5965w;
        if (handler != null) {
            handler.getLooper().quitSafely();
            this.f5965w = null;
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(GL10 gl10) throws InterruptedException {
        long jCurrentTimeMillis;
        long j10;
        boolean z10;
        byte[] bArr;
        boolean z11;
        boolean z12;
        int iM5376c;
        m5356a(this.f5947L);
        boolean z13 = true;
        while (true) {
            jCurrentTimeMillis = System.currentTimeMillis();
            long j11 = this.f5960r;
            if (j11 == 0 || jCurrentTimeMillis < j11) {
                this.f5960r = jCurrentTimeMillis;
            }
            j10 = this.f5960r;
            if (jCurrentTimeMillis - j10 >= (this.f5959q * 1000) / this.f5958p) {
                break;
            }
            m5355a(15L);
            z13 = false;
        }
        if (jCurrentTimeMillis - j10 > 1000) {
            this.f5959q = 1L;
            this.f5960r = System.currentTimeMillis();
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f5962t) {
            return;
        }
        try {
            synchronized (this) {
                try {
                    bArr = null;
                    if (this.f5963u) {
                        byte[] bArr2 = this.f5943H;
                        if (bArr2 != null) {
                            this.f5943H = null;
                            SurfaceTexture surfaceTexture = this.f5949g;
                            if (surfaceTexture != null) {
                                surfaceTexture.updateTexImage();
                                this.f5949g.getTransformMatrix(this.f5953k);
                            }
                            bArr = bArr2;
                        } else {
                            SurfaceTexture surfaceTexture2 = this.f5949g;
                            if (surfaceTexture2 != null) {
                                surfaceTexture2.updateTexImage();
                                this.f5949g.getTransformMatrix(this.f5953k);
                            }
                        }
                        if (z10) {
                            this.f5959q = 1L;
                        } else {
                            this.f5959q++;
                        }
                        this.f5963u = false;
                        z13 = false;
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                } finally {
                }
            }
            if (true == z11) {
                if (true == z13) {
                    m5355a(5L);
                    return;
                }
                return;
            }
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            if (jCurrentTimeMillis2 > this.f5944I + 1000.0d) {
                this.f5945J = ((int) ((this.f5946K * 1000.0d) / (jCurrentTimeMillis2 - r7))) + 1;
                this.f5944I = jCurrentTimeMillis2;
                this.f5946K = 0;
            }
            this.f5946K++;
            InterfaceC6569j interfaceC6569j = this.f5941F;
            if (interfaceC6569j != null) {
                if (bArr != null) {
                    interfaceC6569j.m4869a(bArr, this.f5953k);
                } else {
                    interfaceC6569j.m4867a(this.f5952j[0], this.f5953k);
                }
            }
            synchronized (this) {
                z12 = this.f5978c;
            }
            if (z12 || (iM5376c = m5376c()) == 12288 || System.currentTimeMillis() - this.f5942G <= 2000) {
                return;
            }
            TXCLog.m4998w("TXCGLSurfaceView", "background capture swapBuffer error : " + iM5376c);
            this.f5942G = System.currentTimeMillis();
            Bundle bundle = new Bundle();
            bundle.putInt("EVT_PARAM1", iM5376c);
            bundle.putInt("EVT_ID", 2110);
            bundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
            bundle.putCharSequence(TXLiveConstants.EVT_DESCRIPTION, "Failed to render video");
            C6592e.m5040a(this.f5948a, 2110, bundle);
        } catch (Exception e10) {
            TXCLog.m4992e("TXCGLSurfaceView", "onDrawFrame failed", e10);
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f5962t = false;
        synchronized (this) {
            this.f5963u = true;
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(GL10 gl10, int i10, int i11) {
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        this.f5950h = ((EGL10) EGLContext.getEGL()).eglGetCurrentContext();
        this.f5952j = new int[]{C6566g.m4858a()};
        if (this.f5952j[0] <= 0) {
            this.f5952j = null;
            TXCLog.m4991e("TXCGLSurfaceView", "create oes texture error!! at glsurfaceview");
            return;
        }
        this.f5949g = new SurfaceTexture(this.f5952j[0]);
        m5360e();
        C6565f c6565f = new C6565f();
        this.f5951i = c6565f;
        if (c6565f.mo4842a()) {
            this.f5951i.m4841a(C6568i.f5283e, C6568i.m4866a(EnumC6567h.NORMAL, false, false));
            InterfaceC6569j interfaceC6569j = this.f5941F;
            if (interfaceC6569j != null) {
                interfaceC6569j.m4868a(this.f5949g);
            }
        }
    }

    public void setFPS(final int i10) {
        m5362a(new Runnable() { // from class: com.tencent.liteav.renderer.TXCGLSurfaceView.1
            @Override // java.lang.Runnable
            public void run() {
                TXCGLSurfaceView.this.f5958p = i10;
                if (TXCGLSurfaceView.this.f5958p <= 0) {
                    TXCGLSurfaceView.this.f5958p = 1;
                } else if (TXCGLSurfaceView.this.f5958p > 60) {
                    TXCGLSurfaceView.this.f5958p = 60;
                }
                TXCGLSurfaceView.this.f5960r = 0L;
                TXCGLSurfaceView.this.f5959q = 0L;
            }
        });
    }

    public void setNotifyListener(InterfaceC6559b interfaceC6559b) {
        this.f5948a = new WeakReference<>(interfaceC6559b);
    }

    public void setRendMirror(final int i10) {
        m5362a(new Runnable() { // from class: com.tencent.liteav.renderer.TXCGLSurfaceView.3
            @Override // java.lang.Runnable
            public void run() {
                TXCGLSurfaceView.this.f5938C = i10;
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
                GLES20.glClear(16640);
            }
        });
    }

    public void setRendMode(final int i10) {
        m5362a(new Runnable() { // from class: com.tencent.liteav.renderer.TXCGLSurfaceView.2
            @Override // java.lang.Runnable
            public void run() {
                TXCGLSurfaceView.this.f5937B = i10;
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
                GLES20.glClear(16640);
            }
        });
    }

    @Override // com.tencent.liteav.renderer.TXCGLSurfaceViewBase
    public void setRunInBackground(boolean z10) {
        if (!z10) {
            m5362a(new Runnable() { // from class: com.tencent.liteav.renderer.TXCGLSurfaceView.4
                @Override // java.lang.Runnable
                public void run() {
                    synchronized (this) {
                        TXCLog.m4994i("TXCGLSurfaceView", "background capture exit background");
                        TXCGLSurfaceView.this.f5978c = false;
                    }
                }
            });
            return;
        }
        synchronized (this) {
            TXCLog.m4994i("TXCGLSurfaceView", "background capture enter background");
            this.f5978c = true;
        }
    }

    public void setSurfaceTextureListener(InterfaceC6569j interfaceC6569j) {
        this.f5941F = interfaceC6569j;
    }

    @Override // com.tencent.liteav.renderer.TXCGLSurfaceViewBase
    /* renamed from: b */
    public int mo5363b() {
        if (this.f5961s != 12288) {
            TXCLog.m4991e("TXCGLSurfaceView", "background capture swapbuffer error : " + this.f5961s);
        }
        return this.f5961s;
    }

    @Override // com.tencent.liteav.renderer.TXCGLSurfaceViewBase
    /* renamed from: a */
    public void mo5361a() {
        TXCLog.m4994i("TXCGLSurfaceView", "surfaceDestroyed-->enter with mSurfaceTextureListener:" + this.f5941F);
        InterfaceC6569j interfaceC6569j = this.f5941F;
        if (interfaceC6569j != null) {
            interfaceC6569j.m4870b(this.f5949g);
        }
        SurfaceTexture surfaceTexture = this.f5949g;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.f5949g = null;
        }
    }

    /* renamed from: a */
    public void m5362a(Runnable runnable) {
        synchronized (this.f5947L) {
            this.f5947L.add(runnable);
        }
    }

    /* renamed from: a */
    private boolean m5356a(Queue<Runnable> queue) {
        synchronized (queue) {
            try {
                if (queue.isEmpty()) {
                    return false;
                }
                Runnable runnablePoll = queue.poll();
                if (runnablePoll == null) {
                    return false;
                }
                runnablePoll.run();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    private void m5355a(long j10) throws InterruptedException {
        try {
            Thread.sleep(j10);
        } catch (Exception unused) {
        }
    }

    public TXCGLSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5953k = new float[16];
        this.f5954l = 0;
        this.f5955m = false;
        this.f5956n = 1.0f;
        this.f5957o = 1.0f;
        this.f5958p = 20;
        this.f5959q = 0L;
        this.f5960r = 0L;
        this.f5961s = 12288;
        this.f5962t = true;
        this.f5963u = false;
        this.f5964v = new Object();
        this.f5966x = 0;
        this.f5967y = 0;
        this.f5968z = true;
        this.f5936A = null;
        this.f5937B = 0;
        this.f5938C = 0;
        this.f5939D = true;
        this.f5940E = true;
        this.f5943H = null;
        this.f5944I = 0L;
        this.f5945J = 0;
        this.f5946K = 0;
        this.f5947L = new LinkedList();
        setEGLContextClientVersion(2);
        m5375a(8, 8, 8, 8, 16, 0);
        setRenderer(this);
    }
}
