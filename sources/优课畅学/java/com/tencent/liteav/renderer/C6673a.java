package com.tencent.liteav.renderer;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.view.TextureView;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.structs.TXSVideoFrame;
import com.tencent.rtmp.TXLiveConstants;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.Queue;

/* renamed from: com.tencent.liteav.renderer.a */
/* loaded from: classes4.dex */
public class C6673a extends TextureViewSurfaceTextureListenerC6677e implements SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: A */
    private C6675c f6041A;

    /* renamed from: B */
    private TXSVideoFrame f6042B;

    /* renamed from: C */
    private TXCYuvTextureRender f6043C;

    /* renamed from: F */
    private C6680h f6046F;

    /* renamed from: G */
    private TXCYuvTextureRender f6047G;

    /* renamed from: a */
    InterfaceC6679g f6049a;

    /* renamed from: b */
    a f6050b;

    /* renamed from: c */
    a f6051c;

    /* renamed from: v */
    private C6674b f6057v;

    /* renamed from: w */
    private SurfaceTexture f6058w;

    /* renamed from: x */
    private C6675c f6059x;

    /* renamed from: y */
    private boolean f6060y;

    /* renamed from: q */
    private final int f6052q = 0;

    /* renamed from: r */
    private final int f6053r = 0;

    /* renamed from: s */
    private final int f6054s = 0;

    /* renamed from: t */
    private final int f6055t = 0;

    /* renamed from: u */
    private Object f6056u = new Object();

    /* renamed from: D */
    private Object f6044D = null;

    /* renamed from: E */
    private Object f6045E = new Object();

    /* renamed from: H */
    private final Queue<Runnable> f6048H = new LinkedList();

    /* renamed from: z */
    private float[] f6061z = new float[16];

    /* renamed from: com.tencent.liteav.renderer.a$a */
    public interface a {
        void onTextureProcess(int i10, int i11, int i12, int i13);
    }

    /* renamed from: o */
    private void m5423o() {
        this.f6059x = new C6675c(true);
        this.f6043C = new TXCYuvTextureRender();
        this.f6041A = new C6675c(false);
    }

    /* renamed from: p */
    private boolean m5424p() {
        TXSVideoFrame tXSVideoFrame;
        TXCYuvTextureRender tXCYuvTextureRender;
        int iDrawToTexture;
        C6675c c6675c;
        synchronized (this) {
            try {
                boolean z10 = this.f6060y;
                if (z10) {
                    this.f6060y = false;
                    tXSVideoFrame = null;
                } else {
                    TXSVideoFrame tXSVideoFrame2 = this.f6042B;
                    if (tXSVideoFrame2 == null) {
                        return false;
                    }
                    this.f6042B = null;
                    tXSVideoFrame = tXSVideoFrame2;
                    z10 = false;
                }
                GLES20.glViewport(0, 0, m5504g(), m5505h());
                Object objM5433b = this.f6121l == 1 ? m5433b() : null;
                a aVar = this.f6051c;
                if (z10) {
                    SurfaceTexture surfaceTexture = this.f6058w;
                    if (surfaceTexture != null) {
                        surfaceTexture.updateTexImage();
                        this.f6058w.getTransformMatrix(this.f6061z);
                    }
                    InterfaceC6679g interfaceC6679g = this.f6049a;
                    if (interfaceC6679g != null) {
                        C6675c c6675c2 = this.f6059x;
                        if (c6675c2 != null) {
                            interfaceC6679g.mo5095a(c6675c2.m5458a(), this.f6061z);
                        }
                    } else if (this.f6059x != null) {
                        GLES20.glBindFramebuffer(36160, 0);
                        this.f6059x.m5461a(this.f6058w);
                    }
                    if (aVar != null) {
                        int iM5458a = this.f6059x.m5458a();
                        if (this.f6046F == null) {
                            C6680h c6680h = new C6680h(Boolean.TRUE);
                            this.f6046F = c6680h;
                            c6680h.m5523b();
                            this.f6046F.m5520a(true);
                            this.f6046F.m5524b(TXLiveConstants.RENDER_ROTATION_180);
                            this.f6046F.m5518a(C6680h.f6157a);
                        }
                        this.f6046F.m5521a(this.f6061z);
                        this.f6046F.m5525b(this.f6117h, this.f6118i);
                        this.f6046F.m5519a(this.f6117h, this.f6118i);
                        aVar.onTextureProcess(this.f6046F.m5528d(iM5458a), m5506i(), m5507j(), this.f6120k);
                    }
                    if (this.f6121l == 1 && (c6675c = this.f6059x) != null) {
                        m5495a(objM5433b, c6675c.m5458a(), this.f6061z, true);
                    }
                } else if (tXSVideoFrame != null && (tXCYuvTextureRender = this.f6043C) != null) {
                    if (this.f6050b != null) {
                        tXCYuvTextureRender.setHasFrameBuffer(this.f6117h, this.f6118i);
                        iDrawToTexture = this.f6043C.drawToTexture(tXSVideoFrame);
                        this.f6050b.onTextureProcess(iDrawToTexture, m5506i(), m5507j(), this.f6120k);
                    } else {
                        if (this.f6121l == 0) {
                            GLES20.glBindFramebuffer(36160, 0);
                            this.f6043C.drawFrame(tXSVideoFrame);
                        }
                        iDrawToTexture = -1;
                    }
                    if (this.f6121l == 1) {
                        if (iDrawToTexture == -1) {
                            this.f6043C.setHasFrameBuffer(this.f6117h, this.f6118i);
                            iDrawToTexture = this.f6043C.drawToTexture(tXSVideoFrame);
                        }
                        m5495a(objM5433b, iDrawToTexture, (float[]) null, false);
                    }
                    if (aVar != null) {
                        if (this.f6047G == null) {
                            TXCYuvTextureRender tXCYuvTextureRender2 = new TXCYuvTextureRender();
                            this.f6047G = tXCYuvTextureRender2;
                            tXCYuvTextureRender2.createTexture();
                            this.f6047G.flipVertical(false);
                        }
                        this.f6047G.setHasFrameBuffer(this.f6117h, this.f6118i);
                        aVar.onTextureProcess(this.f6047G.drawToTexture(tXSVideoFrame), m5506i(), m5507j(), this.f6120k);
                    }
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    public void m5431a(InterfaceC6679g interfaceC6679g) {
        this.f6049a = interfaceC6679g;
    }

    /* renamed from: b */
    public void m5435b(a aVar) {
        TXCYuvTextureRender tXCYuvTextureRender;
        this.f6051c = aVar;
        if (aVar == null || (tXCYuvTextureRender = this.f6043C) == null) {
            return;
        }
        tXCYuvTextureRender.setHasFrameBuffer(this.f6117h, this.f6118i);
    }

    /* renamed from: c */
    public boolean m5438c() {
        while (m5422a(this.f6048H)) {
        }
        return m5424p();
    }

    /* renamed from: d */
    public SurfaceTexture m5439d() {
        TextureView textureView = this.f6113d;
        if (textureView != null) {
            return textureView.getSurfaceTexture();
        }
        return null;
    }

    @Override // com.tencent.liteav.renderer.TextureViewSurfaceTextureListenerC6677e
    /* renamed from: e */
    public void mo5440e() {
        synchronized (this.f6056u) {
            try {
                C6674b c6674b = this.f6057v;
                if (c6674b != null) {
                    c6674b.m5450b();
                    this.f6057v.m5451c();
                    this.f6057v = null;
                    TXCLog.m4998w("TXCVideoRender", "play:vrender: quit render thread id" + getID() + ", " + this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.tencent.liteav.basic.module.C6584a
    public void finalize() throws Throwable {
        super.finalize();
        TXCLog.m4998w("TXCVideoRender", "play:vrender: quit render thread when finalize");
        try {
            mo5440e();
        } catch (Exception e10) {
            TXCLog.m4992e("TXCVideoRender", "quit render thread failed.", e10);
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        synchronized (this) {
            this.f6060y = true;
        }
        synchronized (this.f6056u) {
            try {
                C6674b c6674b = this.f6057v;
                if (c6674b != null) {
                    c6674b.m5451c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.tencent.liteav.renderer.TextureViewSurfaceTextureListenerC6677e, android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    /* renamed from: a */
    public void m5430a(a aVar) {
        TXCYuvTextureRender tXCYuvTextureRender;
        this.f6050b = aVar;
        if (aVar == null || (tXCYuvTextureRender = this.f6043C) == null) {
            return;
        }
        tXCYuvTextureRender.setHasFrameBuffer(this.f6117h, this.f6118i);
    }

    @Override // com.tencent.liteav.renderer.TextureViewSurfaceTextureListenerC6677e
    /* renamed from: c */
    public void mo5437c(Object obj) {
        synchronized (this.f6056u) {
            try {
                if (this.f6057v == null) {
                    C6674b c6674b = new C6674b(new WeakReference(this));
                    this.f6057v = c6674b;
                    c6674b.m5449a(obj);
                    this.f6057v.start();
                    this.f6057v.m5451c();
                    TXCLog.m4998w("TXCVideoRender", "play:vrender: start render thread id " + getID() + ", glContext " + obj + ", " + this);
                } else {
                    TXCLog.m4998w("TXCVideoRender", "play:vrender: start render thread when running " + getID() + ", " + this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public Object m5433b() {
        Object objM5448a;
        synchronized (this.f6056u) {
            try {
                C6674b c6674b = this.f6057v;
                objM5448a = c6674b != null ? c6674b.m5448a() : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        return objM5448a;
    }

    @Override // com.tencent.liteav.renderer.TextureViewSurfaceTextureListenerC6677e
    /* renamed from: a */
    public void mo5429a(TXSVideoFrame tXSVideoFrame, int i10, int i11, int i12) {
        synchronized (this) {
            try {
                TXSVideoFrame tXSVideoFrame2 = this.f6042B;
                if (tXSVideoFrame2 != null) {
                    tXSVideoFrame2.release();
                }
                this.f6042B = tXSVideoFrame;
            } finally {
            }
        }
        super.mo5429a(tXSVideoFrame, i10, i11, i12);
        synchronized (this.f6056u) {
            try {
                C6674b c6674b = this.f6057v;
                if (c6674b != null) {
                    c6674b.m5451c();
                }
            } finally {
            }
        }
    }

    @Override // com.tencent.liteav.renderer.TextureViewSurfaceTextureListenerC6677e
    /* renamed from: b */
    public void mo5434b(SurfaceTexture surfaceTexture) {
        super.mo5434b(surfaceTexture);
        TXCLog.m4998w("TXCVideoRender", "play:vrender: quit render thread when onSurfaceRelease");
        mo5440e();
    }

    /* renamed from: b */
    public void m5436b(Object obj) {
        synchronized (this.f6045E) {
            try {
                if (this.f6044D != obj) {
                    TXCLog.m4998w("TXCVideoRender", "play:vrender: TXCGLRender destroyTextureRender ignore when not the same gl thread " + this);
                    return;
                }
                this.f6044D = null;
                TXCLog.m4998w("TXCVideoRender", "play:vrender: TXCGLRender destroyTextureRender " + this);
                try {
                    InterfaceC6678f interfaceC6678f = this.f6124o;
                    if (interfaceC6678f != null) {
                        interfaceC6678f.onSurfaceTextureDestroy(this.f6058w);
                    }
                } catch (Exception e10) {
                    TXCLog.m4992e("TXCVideoRender", "callback failed.", e10);
                }
                C6675c c6675c = this.f6059x;
                if (c6675c != null) {
                    c6675c.m5464c();
                    this.f6059x = null;
                }
                TXCYuvTextureRender tXCYuvTextureRender = this.f6043C;
                if (tXCYuvTextureRender != null) {
                    tXCYuvTextureRender.onSurfaceDestroy();
                    this.f6043C = null;
                }
                C6675c c6675c2 = this.f6041A;
                if (c6675c2 != null) {
                    c6675c2.m5464c();
                    this.f6041A = null;
                }
                this.f6058w = null;
                C6680h c6680h = this.f6046F;
                if (c6680h != null) {
                    c6680h.m5526c();
                    this.f6046F = null;
                }
                TXCYuvTextureRender tXCYuvTextureRender2 = this.f6047G;
                if (tXCYuvTextureRender2 != null) {
                    tXCYuvTextureRender2.onSurfaceDestroy();
                    this.f6047G = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.tencent.liteav.renderer.TextureViewSurfaceTextureListenerC6677e
    /* renamed from: a */
    public void mo5427a(int i10, int i11, int i12, boolean z10, int i13) {
        GLES20.glViewport(0, 0, m5504g(), m5505h());
        C6675c c6675c = this.f6041A;
        if (c6675c != null) {
            c6675c.m5460a(i10, z10, i13);
        }
        super.mo5427a(i10, i11, i12, z10, i13);
        synchronized (this.f6056u) {
            try {
                C6674b c6674b = this.f6057v;
                if (c6674b != null) {
                    c6674b.m5451c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.tencent.liteav.renderer.TextureViewSurfaceTextureListenerC6677e
    /* renamed from: a */
    public SurfaceTexture mo5425a() {
        return this.f6058w;
    }

    @Override // com.tencent.liteav.renderer.TextureViewSurfaceTextureListenerC6677e
    /* renamed from: a */
    public void mo5428a(SurfaceTexture surfaceTexture) {
        super.mo5428a(surfaceTexture);
        TXCLog.m4998w("TXCVideoRender", "play:vrender: create render thread when onSurfaceCreate");
        mo5437c((Object) null);
    }

    @Override // com.tencent.liteav.renderer.TextureViewSurfaceTextureListenerC6677e
    /* renamed from: a */
    public void mo5426a(int i10, int i11) {
        super.mo5426a(i10, i11);
        TXCYuvTextureRender tXCYuvTextureRender = this.f6043C;
        if (tXCYuvTextureRender != null) {
            tXCYuvTextureRender.setVideoSize(i10, i11);
        }
        C6675c c6675c = this.f6059x;
        if (c6675c != null) {
            c6675c.m5459a(i10, i11);
        }
    }

    /* renamed from: a */
    public void m5432a(Object obj) {
        TXCYuvTextureRender tXCYuvTextureRender;
        synchronized (this.f6045E) {
            try {
                this.f6044D = obj;
                TXCLog.m4998w("TXCVideoRender", "play:vrender: TXCGLRender initTextureRender " + this);
                m5423o();
                C6676d c6676d = this.f6114e;
                if (c6676d != null) {
                    c6676d.m5474a(this.f6115f, this.f6116g);
                    this.f6114e.m5476b(this.f6117h, this.f6118i);
                }
                C6675c c6675c = this.f6059x;
                if (c6675c != null) {
                    c6675c.m5463b();
                    SurfaceTexture surfaceTexture = new SurfaceTexture(this.f6059x.m5458a());
                    this.f6058w = surfaceTexture;
                    surfaceTexture.setOnFrameAvailableListener(this);
                }
                TXCYuvTextureRender tXCYuvTextureRender2 = this.f6043C;
                if (tXCYuvTextureRender2 != null) {
                    tXCYuvTextureRender2.createTexture();
                }
                if (this.f6050b != null && (tXCYuvTextureRender = this.f6043C) != null) {
                    tXCYuvTextureRender.setHasFrameBuffer(this.f6117h, this.f6118i);
                }
                C6675c c6675c2 = this.f6041A;
                if (c6675c2 != null) {
                    c6675c2.m5463b();
                }
                InterfaceC6678f interfaceC6678f = this.f6124o;
                if (interfaceC6678f != null) {
                    interfaceC6678f.onSurfaceTextureAvailable(this.f6058w);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    private boolean m5422a(Queue<Runnable> queue) {
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
}
