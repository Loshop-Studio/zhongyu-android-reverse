package com.tencent.liteav.basic.p048c;

import android.annotation.TargetApi;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.view.Surface;
import com.tencent.liteav.basic.log.TXCLog;

@TargetApi(17)
/* renamed from: com.tencent.liteav.basic.c.b */
/* loaded from: classes4.dex */
public class C6561b {

    /* renamed from: a */
    private static int f5183a = 2;

    /* renamed from: b */
    private static final String f5184b = "b";

    /* renamed from: k */
    private static int[] f5185k;

    /* renamed from: l */
    private static int[] f5186l;

    /* renamed from: h */
    private boolean f5192h;

    /* renamed from: i */
    private EGLSurface f5193i;

    /* renamed from: c */
    private EGLDisplay f5187c = EGL14.EGL_NO_DISPLAY;

    /* renamed from: d */
    private EGLContext f5188d = EGL14.EGL_NO_CONTEXT;

    /* renamed from: e */
    private EGLConfig f5189e = null;

    /* renamed from: f */
    private int f5190f = 0;

    /* renamed from: g */
    private int f5191g = 0;

    /* renamed from: j */
    private int f5194j = -1;

    static {
        int i10 = f5183a;
        f5185k = new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12352, i10 == 2 ? 4 : 68, 12610, 1, 12344};
        f5186l = new int[]{12339, 1, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12352, i10 == 2 ? 4 : 68, 12610, 1, 12344};
    }

    /* renamed from: a */
    public static C6561b m4798a(EGLConfig eGLConfig, EGLContext eGLContext, Surface surface, int i10, int i11) {
        C6561b c6561b = new C6561b();
        c6561b.f5190f = i10;
        c6561b.f5191g = i11;
        if (c6561b.m4799a(eGLConfig, eGLContext, surface)) {
            return c6561b;
        }
        return null;
    }

    /* renamed from: f */
    private static void m4800f() throws C6562c {
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError != 12288) {
            throw new C6562c(iEglGetError);
        }
    }

    /* renamed from: b */
    public void m4803b() {
        EGLDisplay eGLDisplay = this.f5187c;
        EGLDisplay eGLDisplay2 = EGL14.EGL_NO_DISPLAY;
        String str = f5184b;
        EGLSurface eGLSurface = this.f5193i;
        if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f5188d)) {
            return;
        }
        TXCLog.m4991e(str, "eglMakeCurrent failed");
    }

    /* renamed from: c */
    public void m4804c() {
        EGLDisplay eGLDisplay = this.f5187c;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroySurface(this.f5187c, this.f5193i);
            EGL14.eglDestroyContext(this.f5187c, this.f5188d);
            this.f5188d = EGL14.EGL_NO_CONTEXT;
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f5187c);
        }
        this.f5187c = EGL14.EGL_NO_DISPLAY;
    }

    /* renamed from: d */
    public boolean m4805d() {
        return EGL14.eglSwapBuffers(this.f5187c, this.f5193i);
    }

    /* renamed from: e */
    public EGLContext m4806e() {
        return this.f5188d;
    }

    /* renamed from: a */
    public void m4801a() {
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError != 12288) {
            TXCLog.m4991e(f5184b, "EGL error:" + iEglGetError);
        }
    }

    /* renamed from: a */
    private boolean m4799a(EGLConfig eGLConfig, EGLContext eGLContext, Surface surface) {
        EGLContext eGLContext2;
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        this.f5187c = eGLDisplayEglGetDisplay;
        if (eGLDisplayEglGetDisplay == EGL14.EGL_NO_DISPLAY) {
            TXCLog.m4991e(f5184b, "unable to get EGL14 display");
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(this.f5187c, iArr, 0, iArr, 1)) {
            this.f5187c = null;
            TXCLog.m4991e(f5184b, "unable to initialize EGL14");
        }
        if (eGLConfig != null) {
            this.f5189e = eGLConfig;
        } else {
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (!EGL14.eglChooseConfig(this.f5187c, surface == null ? f5186l : f5185k, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                return false;
            }
            this.f5189e = eGLConfigArr[0];
        }
        if (eGLContext != null) {
            this.f5192h = true;
            eGLContext2 = eGLContext;
        } else {
            eGLContext2 = EGL14.EGL_NO_CONTEXT;
        }
        try {
            this.f5188d = m4797a(this.f5187c, this.f5189e, 2, eGLContext2);
        } catch (C6562c unused) {
            TXCLog.m4994i(f5184b, "failed to create EGLContext of OpenGL ES 2.0, try 3.0");
            try {
                this.f5188d = m4797a(this.f5187c, this.f5189e, 3, eGLContext2);
            } catch (C6562c e10) {
                TXCLog.m4991e(f5184b, "failed to create EGLContext of 3.0. " + e10);
                return false;
            }
        }
        int[] iArr2 = {12344};
        if (surface == null) {
            this.f5193i = EGL14.eglCreatePbufferSurface(this.f5187c, this.f5189e, new int[]{12375, this.f5190f, 12374, this.f5191g, 12344}, 0);
        } else {
            this.f5193i = EGL14.eglCreateWindowSurface(this.f5187c, this.f5189e, surface, iArr2, 0);
        }
        m4801a();
        EGLDisplay eGLDisplay = this.f5187c;
        EGLSurface eGLSurface = this.f5193i;
        if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f5188d)) {
            return true;
        }
        m4801a();
        return false;
    }

    /* renamed from: a */
    private static EGLContext m4797a(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i10, EGLContext eGLContext) throws C6562c {
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, new int[]{12440, i10, 12344}, 0);
        m4800f();
        return eGLContextEglCreateContext;
    }

    /* renamed from: a */
    public void m4802a(long j10) {
        EGLExt.eglPresentationTimeANDROID(this.f5187c, this.f5193i, j10);
    }
}
