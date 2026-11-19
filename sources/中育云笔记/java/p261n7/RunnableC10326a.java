package p261n7;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;

/* renamed from: n7.a */
/* loaded from: classes5.dex */
public final class RunnableC10326a implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* renamed from: i */
    public static final int[] f24605i = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* renamed from: c */
    public final Handler f24606c;

    /* renamed from: d */
    public final int[] f24607d;

    /* renamed from: e */
    public EGLDisplay f24608e;

    /* renamed from: f */
    public EGLContext f24609f;

    /* renamed from: g */
    public EGLSurface f24610g;

    /* renamed from: h */
    public SurfaceTexture f24611h;

    /* renamed from: n7.a$a */
    public interface a {
    }

    public RunnableC10326a(Handler handler) {
        this(handler, null);
    }

    /* renamed from: a */
    public static EGLConfig m21553a(EGLDisplay eGLDisplay) {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        EGL14.eglChooseConfig(eGLDisplay, f24605i, 0, eGLConfigArr, 0, 1, new int[1], 0);
        return eGLConfigArr[0];
    }

    /* renamed from: b */
    public static EGLContext m21554b(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i10) {
        return EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, i10 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
    }

    /* renamed from: c */
    public static EGLSurface m21555c(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext, int i10) {
        EGLSurface eGLSurfaceEglCreatePbufferSurface;
        if (i10 == 1) {
            eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i10 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
        }
        EGL14.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContext);
        return eGLSurfaceEglCreatePbufferSurface;
    }

    /* renamed from: e */
    public static void m21556e(int[] iArr) {
        GLES20.glGenTextures(1, iArr, 0);
    }

    /* renamed from: f */
    public static EGLDisplay m21557f() {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        int[] iArr = new int[2];
        EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1);
        return eGLDisplayEglGetDisplay;
    }

    /* renamed from: g */
    public SurfaceTexture m21559g() {
        return this.f24611h;
    }

    /* renamed from: h */
    public void m21560h(int i10) {
        EGLDisplay eGLDisplayM21557f = m21557f();
        this.f24608e = eGLDisplayM21557f;
        EGLConfig eGLConfigM21553a = m21553a(eGLDisplayM21557f);
        EGLContext eGLContextM21554b = m21554b(this.f24608e, eGLConfigM21553a, i10);
        this.f24609f = eGLContextM21554b;
        this.f24610g = m21555c(this.f24608e, eGLConfigM21553a, eGLContextM21554b, i10);
        m21556e(this.f24607d);
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f24607d[0]);
        this.f24611h = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: i */
    public void m21561i() {
        this.f24606c.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.f24611h;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.f24607d, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = this.f24608e;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.f24608e;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.f24610g;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f24608e, this.f24610g);
            }
            EGLContext eGLContext = this.f24609f;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f24608e, eGLContext);
            }
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay3 = this.f24608e;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f24608e);
            }
            this.f24608e = null;
            this.f24609f = null;
            this.f24610g = null;
            this.f24611h = null;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f24606c.post(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        m21558d();
        SurfaceTexture surfaceTexture = this.f24611h;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }

    public RunnableC10326a(Handler handler, a aVar) {
        this.f24606c = handler;
        this.f24607d = new int[1];
    }

    /* renamed from: d */
    public final void m21558d() {
    }
}
