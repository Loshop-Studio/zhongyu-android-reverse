package com.tencent.liteav.basic.p048c;

import android.view.Surface;
import com.tencent.liteav.basic.log.TXCLog;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* renamed from: com.tencent.liteav.basic.c.a */
/* loaded from: classes4.dex */
public class C6560a {

    /* renamed from: a */
    public static final String f5170a = "a";

    /* renamed from: l */
    private static int[] f5171l = {12339, 1, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12352, 4, 12344};

    /* renamed from: m */
    private static int[] f5172m = {12339, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12352, 4, 12610, 1, 12344};

    /* renamed from: b */
    private EGL10 f5173b;

    /* renamed from: c */
    private EGLDisplay f5174c;

    /* renamed from: d */
    private EGLConfig f5175d;

    /* renamed from: e */
    private boolean f5176e;

    /* renamed from: f */
    private EGLContext f5177f;

    /* renamed from: g */
    private boolean f5178g;

    /* renamed from: h */
    private EGLSurface f5179h;

    /* renamed from: i */
    private int f5180i = 0;

    /* renamed from: j */
    private int f5181j = 0;

    /* renamed from: k */
    private int[] f5182k = new int[2];

    private C6560a() {
    }

    /* renamed from: a */
    public static C6560a m4788a(EGLConfig eGLConfig, EGLContext eGLContext, Surface surface, int i10, int i11) {
        C6560a c6560a = new C6560a();
        c6560a.f5180i = i10;
        c6560a.f5181j = i11;
        if (c6560a.m4790a(eGLConfig, eGLContext, surface)) {
            return c6560a;
        }
        return null;
    }

    /* renamed from: f */
    private void m4791f() throws C6562c {
        int iEglGetError = this.f5173b.eglGetError();
        if (iEglGetError != 12288) {
            throw new C6562c(iEglGetError);
        }
    }

    /* renamed from: b */
    public void m4793b() {
        EGL10 egl10 = this.f5173b;
        EGLDisplay eGLDisplay = this.f5174c;
        EGLSurface eGLSurface = this.f5179h;
        egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f5177f);
        m4796e();
    }

    /* renamed from: c */
    public void m4794c() {
        EGL10 egl10 = this.f5173b;
        EGLDisplay eGLDisplay = this.f5174c;
        EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
        egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
        EGLSurface eGLSurface2 = this.f5179h;
        if (eGLSurface2 != null) {
            this.f5173b.eglDestroySurface(this.f5174c, eGLSurface2);
        }
        EGLContext eGLContext = this.f5177f;
        if (eGLContext != null) {
            this.f5173b.eglDestroyContext(this.f5174c, eGLContext);
        }
        this.f5173b.eglTerminate(this.f5174c);
        m4796e();
        this.f5179h = null;
        this.f5174c = null;
    }

    /* renamed from: d */
    public EGLContext m4795d() {
        return this.f5177f;
    }

    /* renamed from: e */
    public void m4796e() {
        int iEglGetError = this.f5173b.eglGetError();
        if (iEglGetError != 12288) {
            TXCLog.m4991e(f5170a, "EGL error: 0x" + Integer.toHexString(iEglGetError));
        }
    }

    /* renamed from: a */
    public boolean m4792a() {
        boolean zEglSwapBuffers = this.f5173b.eglSwapBuffers(this.f5174c, this.f5179h);
        m4796e();
        return zEglSwapBuffers;
    }

    /* renamed from: a */
    private boolean m4790a(EGLConfig eGLConfig, EGLContext eGLContext, Surface surface) {
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.f5173b = egl10;
        EGLDisplay eGLDisplayEglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.f5174c = eGLDisplayEglGetDisplay;
        this.f5173b.eglInitialize(eGLDisplayEglGetDisplay, this.f5182k);
        if (eGLConfig == null) {
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            this.f5173b.eglChooseConfig(this.f5174c, surface == null ? f5171l : f5172m, eGLConfigArr, 1, new int[1]);
            this.f5175d = eGLConfigArr[0];
            this.f5176e = true;
        } else {
            this.f5175d = eGLConfig;
        }
        if (eGLContext != null) {
            this.f5178g = true;
        }
        try {
            this.f5177f = m4789a(this.f5174c, this.f5175d, 2, eGLContext);
        } catch (C6562c unused) {
            TXCLog.m4994i(f5170a, "failed to create EGLContext of OpenGL ES 2.0, try 3.0");
            try {
                this.f5177f = m4789a(this.f5174c, this.f5175d, 3, eGLContext);
            } catch (C6562c e10) {
                TXCLog.m4991e(f5170a, "failed to create EGLContext of 3.0. " + e10);
                return false;
            }
        }
        int[] iArr = {12375, this.f5180i, 12374, this.f5181j, 12344};
        if (surface == null) {
            this.f5179h = this.f5173b.eglCreatePbufferSurface(this.f5174c, this.f5175d, iArr);
        } else {
            this.f5179h = this.f5173b.eglCreateWindowSurface(this.f5174c, this.f5175d, surface, null);
        }
        EGLSurface eGLSurface = this.f5179h;
        if (eGLSurface == EGL10.EGL_NO_SURFACE) {
            m4796e();
            return false;
        }
        if (this.f5173b.eglMakeCurrent(this.f5174c, eGLSurface, eGLSurface, this.f5177f)) {
            return true;
        }
        m4796e();
        return false;
    }

    /* renamed from: a */
    private EGLContext m4789a(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i10, EGLContext eGLContext) throws C6562c {
        int[] iArr = {12440, i10, 12344};
        if (eGLContext == null) {
            eGLContext = EGL10.EGL_NO_CONTEXT;
        }
        EGLContext eGLContextEglCreateContext = this.f5173b.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, iArr);
        m4791f();
        return eGLContextEglCreateContext;
    }
}
