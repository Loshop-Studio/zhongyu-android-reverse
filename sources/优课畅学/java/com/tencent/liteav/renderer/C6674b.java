package com.tencent.liteav.renderer;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.p048c.C6560a;
import com.tencent.liteav.basic.p048c.C6561b;
import java.lang.ref.WeakReference;
import javax.microedition.khronos.egl.EGLContext;

/* renamed from: com.tencent.liteav.renderer.b */
/* loaded from: classes4.dex */
class C6674b extends Thread {

    /* renamed from: a */
    private WeakReference<C6673a> f6062a;

    /* renamed from: b */
    private boolean f6063b = false;

    /* renamed from: c */
    private int f6064c = 1280;

    /* renamed from: d */
    private int f6065d = 720;

    /* renamed from: e */
    private Object f6066e = new Object();

    /* renamed from: f */
    private C6561b f6067f = null;

    /* renamed from: g */
    private C6560a f6068g = null;

    /* renamed from: h */
    private Object f6069h = null;

    public C6674b(WeakReference<C6673a> weakReference) {
        this.f6062a = weakReference;
    }

    /* renamed from: f */
    private void m5441f() {
        try {
            C6673a c6673a = this.f6062a.get();
            if (c6673a != null) {
                c6673a.m5432a(this);
            }
        } catch (Exception e10) {
            TXCLog.m4992e("TXCVideoRenderThread", "init texture render failed.", e10);
        }
    }

    /* renamed from: g */
    private void m5442g() {
        try {
            C6673a c6673a = this.f6062a.get();
            if (c6673a != null) {
                c6673a.m5436b(this);
            }
        } catch (Exception e10) {
            TXCLog.m4992e("TXCVideoRenderThread", "destroy texture render failed", e10);
        }
    }

    /* renamed from: h */
    private boolean m5443h() {
        C6673a c6673a;
        try {
            WeakReference<C6673a> weakReference = this.f6062a;
            if (weakReference == null || (c6673a = weakReference.get()) == null) {
                return false;
            }
            return c6673a.m5438c();
        } catch (Exception e10) {
            TXCLog.m4991e("TXCVideoRenderThread", "drawFrame failed." + e10.getMessage());
            return false;
        }
    }

    /* renamed from: i */
    private void m5444i() {
        C6673a c6673a;
        WeakReference<C6673a> weakReference = this.f6062a;
        if (weakReference == null || (c6673a = weakReference.get()) == null) {
            return;
        }
        c6673a.m5508k();
    }

    /* renamed from: j */
    private void m5445j() {
        C6673a c6673a;
        WeakReference<C6673a> weakReference = this.f6062a;
        if (weakReference == null || (c6673a = weakReference.get()) == null) {
            return;
        }
        c6673a.m5509l();
    }

    /* renamed from: k */
    private void m5446k() {
        C6673a c6673a = this.f6062a.get();
        if (c6673a == null) {
            return;
        }
        SurfaceTexture surfaceTextureM5439d = c6673a.m5439d();
        Surface surface = surfaceTextureM5439d != null ? new Surface(surfaceTextureM5439d) : null;
        Object obj = this.f6069h;
        if (obj == null || (obj instanceof EGLContext)) {
            this.f6068g = C6560a.m4788a(null, (EGLContext) obj, surface, this.f6064c, this.f6065d);
        } else {
            this.f6067f = C6561b.m4798a(null, (android.opengl.EGLContext) obj, surface, this.f6064c, this.f6065d);
        }
        TXCLog.m4998w("TXCVideoRenderThread", "vrender: init egl share context " + this.f6069h + ", create context" + m5448a());
        m5453e();
    }

    /* renamed from: l */
    private void m5447l() {
        TXCLog.m4998w("TXCVideoRenderThread", "vrender: uninit egl " + m5448a());
        C6560a c6560a = this.f6068g;
        if (c6560a != null) {
            c6560a.m4794c();
            this.f6068g = null;
        }
        C6561b c6561b = this.f6067f;
        if (c6561b != null) {
            c6561b.m4804c();
            this.f6067f = null;
        }
    }

    /* renamed from: a */
    public void m5449a(Object obj) {
        this.f6069h = obj;
    }

    /* renamed from: b */
    public void m5450b() {
        this.f6063b = false;
        m5451c();
    }

    /* renamed from: c */
    public void m5451c() {
        synchronized (this.f6066e) {
            this.f6066e.notifyAll();
        }
    }

    /* renamed from: d */
    public void m5452d() {
        C6560a c6560a = this.f6068g;
        if (c6560a != null) {
            c6560a.m4792a();
        }
        C6561b c6561b = this.f6067f;
        if (c6561b != null) {
            c6561b.m4805d();
        }
    }

    /* renamed from: e */
    public void m5453e() {
        C6560a c6560a = this.f6068g;
        if (c6560a != null) {
            c6560a.m4793b();
        }
        C6561b c6561b = this.f6067f;
        if (c6561b != null) {
            c6561b.m4803b();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        setName("VRender-" + getId());
        try {
            this.f6063b = true;
            m5446k();
            m5441f();
            m5444i();
            while (this.f6063b) {
                if (m5443h()) {
                    WeakReference<C6673a> weakReference = this.f6062a;
                    C6673a c6673a = weakReference == null ? null : weakReference.get();
                    if (c6673a != null && c6673a.m5439d() != null) {
                        m5452d();
                    }
                }
                synchronized (this.f6066e) {
                    try {
                        this.f6066e.wait();
                    } catch (InterruptedException unused) {
                    }
                }
            }
            m5445j();
            m5442g();
            m5447l();
        } catch (Exception e10) {
            TXCLog.m4992e("TXCVideoRenderThread", "render failed.", e10);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: a */
    public Object m5448a() {
        C6560a c6560a = this.f6068g;
        if (c6560a != null) {
            return c6560a.m4795d();
        }
        C6561b c6561b = this.f6067f;
        if (c6561b != null) {
            return c6561b.m4806e();
        }
        return null;
    }
}
