package com.tencent.liteav.renderer;

import android.content.Context;
import android.opengl.GLDebugHelper;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.tencent.liteav.basic.log.TXCLog;
import java.io.Writer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL;
import javax.microedition.khronos.opengles.GL10;

/* loaded from: classes4.dex */
public class TXCGLSurfaceViewBase extends SurfaceView implements SurfaceHolder.Callback {

    /* renamed from: a */
    private static final C6669j f5976a = new C6669j();

    /* renamed from: b */
    protected boolean f5977b;

    /* renamed from: c */
    protected boolean f5978c;

    /* renamed from: d */
    protected final WeakReference<TXCGLSurfaceViewBase> f5979d;

    /* renamed from: e */
    protected boolean f5980e;

    /* renamed from: f */
    protected boolean f5981f;

    /* renamed from: g */
    private C6668i f5982g;

    /* renamed from: h */
    private GLSurfaceView.Renderer f5983h;

    /* renamed from: i */
    private boolean f5984i;

    /* renamed from: j */
    private InterfaceC6664e f5985j;

    /* renamed from: k */
    private InterfaceC6665f f5986k;

    /* renamed from: l */
    private InterfaceC6666g f5987l;

    /* renamed from: m */
    private InterfaceC6670k f5988m;

    /* renamed from: n */
    private int f5989n;

    /* renamed from: o */
    private int f5990o;

    /* renamed from: p */
    private boolean f5991p;

    /* renamed from: com.tencent.liteav.renderer.TXCGLSurfaceViewBase$e */
    public interface InterfaceC6664e {
        /* renamed from: a */
        EGLConfig mo5378a(EGL10 egl10, EGLDisplay eGLDisplay);
    }

    /* renamed from: com.tencent.liteav.renderer.TXCGLSurfaceViewBase$f */
    public interface InterfaceC6665f {
        /* renamed from: a */
        EGLContext mo5381a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig);

        /* renamed from: a */
        void mo5382a(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext);
    }

    /* renamed from: com.tencent.liteav.renderer.TXCGLSurfaceViewBase$g */
    public interface InterfaceC6666g {
        /* renamed from: a */
        EGLSurface mo5383a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, Object obj);

        /* renamed from: a */
        void mo5384a(EGL10 egl10, EGLDisplay eGLDisplay, EGLSurface eGLSurface);
    }

    /* renamed from: com.tencent.liteav.renderer.TXCGLSurfaceViewBase$i */
    public static class C6668i extends Thread {

        /* renamed from: a */
        private boolean f6012a;

        /* renamed from: b */
        private boolean f6013b;

        /* renamed from: c */
        private boolean f6014c;

        /* renamed from: d */
        private boolean f6015d;

        /* renamed from: e */
        private boolean f6016e;

        /* renamed from: f */
        private boolean f6017f;

        /* renamed from: g */
        private boolean f6018g;

        /* renamed from: h */
        private boolean f6019h;

        /* renamed from: i */
        private boolean f6020i;

        /* renamed from: j */
        private boolean f6021j;

        /* renamed from: k */
        private boolean f6022k;

        /* renamed from: p */
        private boolean f6027p;

        /* renamed from: s */
        private C6667h f6030s;

        /* renamed from: t */
        private WeakReference<TXCGLSurfaceViewBase> f6031t;

        /* renamed from: q */
        private ArrayList<Runnable> f6028q = new ArrayList<>();

        /* renamed from: r */
        private boolean f6029r = true;

        /* renamed from: l */
        private int f6023l = 0;

        /* renamed from: m */
        private int f6024m = 0;

        /* renamed from: o */
        private boolean f6026o = true;

        /* renamed from: n */
        private int f6025n = 1;

        public C6668i(WeakReference<TXCGLSurfaceViewBase> weakReference) {
            this.f6031t = weakReference;
        }

        /* JADX WARN: Removed duplicated region for block: B:166:0x022e A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* renamed from: i */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void m5398i() {
            /*
                Method dump skipped, instructions count: 569
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.renderer.TXCGLSurfaceViewBase.C6668i.m5398i():void");
        }

        /* renamed from: j */
        private void m5399j() {
            if (this.f6020i) {
                this.f6020i = false;
                this.f6030s.m5395f();
            }
        }

        /* renamed from: k */
        private void m5400k() {
            if (this.f6019h) {
                this.f6030s.m5396g();
                this.f6019h = false;
                TXCGLSurfaceViewBase tXCGLSurfaceViewBase = this.f6031t.get();
                if (tXCGLSurfaceViewBase != null) {
                    tXCGLSurfaceViewBase.f5981f = false;
                }
                TXCGLSurfaceViewBase.f5976a.m5419c(this);
            }
        }

        /* renamed from: l */
        private boolean m5401l() {
            if (this.f6015d || !this.f6016e || this.f6017f || this.f6023l <= 0 || this.f6024m <= 0) {
                return false;
            }
            return this.f6026o || this.f6025n == 1;
        }

        /* renamed from: b */
        public C6667h m5406b() {
            return this.f6030s;
        }

        /* renamed from: c */
        public boolean m5407c() {
            return this.f6019h && this.f6020i && m5401l();
        }

        /* renamed from: d */
        public int m5408d() {
            int i10;
            synchronized (TXCGLSurfaceViewBase.f5976a) {
                i10 = this.f6025n;
            }
            return i10;
        }

        /* renamed from: e */
        public void m5409e() {
            synchronized (TXCGLSurfaceViewBase.f5976a) {
                this.f6016e = true;
                this.f6021j = false;
                TXCGLSurfaceViewBase.f5976a.notifyAll();
                while (this.f6018g && !this.f6021j && !this.f6013b) {
                    try {
                        TXCGLSurfaceViewBase.f5976a.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        /* renamed from: f */
        public void m5410f() {
            synchronized (TXCGLSurfaceViewBase.f5976a) {
                this.f6016e = false;
                TXCGLSurfaceViewBase.f5976a.notifyAll();
                while (!this.f6018g && !this.f6013b) {
                    try {
                        TXCGLSurfaceViewBase.f5976a.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        /* renamed from: g */
        public void m5411g() {
            synchronized (TXCGLSurfaceViewBase.f5976a) {
                this.f6012a = true;
                TXCGLSurfaceViewBase.f5976a.notifyAll();
                while (!this.f6013b) {
                    try {
                        TXCGLSurfaceViewBase.f5976a.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        /* renamed from: h */
        public void m5412h() {
            this.f6022k = true;
            TXCGLSurfaceViewBase.f5976a.notifyAll();
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            setName("GLThread " + getId());
            try {
                m5398i();
            } catch (InterruptedException unused) {
            } catch (Throwable th) {
                TXCGLSurfaceViewBase.f5976a.m5414a(this);
                throw th;
            }
            TXCGLSurfaceViewBase.f5976a.m5414a(this);
        }

        /* renamed from: a */
        public int m5402a() {
            return this.f6030s.m5392c();
        }

        /* renamed from: a */
        public void m5403a(int i10) {
            if (i10 >= 0 && i10 <= 1) {
                synchronized (TXCGLSurfaceViewBase.f5976a) {
                    this.f6025n = i10;
                    TXCGLSurfaceViewBase.f5976a.notifyAll();
                }
                return;
            }
            throw new IllegalArgumentException("renderMode");
        }

        /* renamed from: a */
        public void m5404a(int i10, int i11) {
            synchronized (TXCGLSurfaceViewBase.f5976a) {
                this.f6023l = i10;
                this.f6024m = i11;
                this.f6029r = true;
                this.f6026o = true;
                this.f6027p = false;
                TXCGLSurfaceViewBase.f5976a.notifyAll();
                while (!this.f6013b && !this.f6015d && !this.f6027p && m5407c()) {
                    try {
                        TXCGLSurfaceViewBase.f5976a.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        /* renamed from: a */
        public void m5405a(Runnable runnable) {
            if (runnable != null) {
                synchronized (TXCGLSurfaceViewBase.f5976a) {
                    this.f6028q.add(runnable);
                    TXCGLSurfaceViewBase.f5976a.notifyAll();
                }
                return;
            }
            throw new IllegalArgumentException("r must not be null");
        }
    }

    /* renamed from: com.tencent.liteav.renderer.TXCGLSurfaceViewBase$k */
    public interface InterfaceC6670k {
        /* renamed from: a */
        GL m5420a(GL gl);
    }

    /* renamed from: com.tencent.liteav.renderer.TXCGLSurfaceViewBase$l */
    public static class C6671l extends Writer {

        /* renamed from: a */
        private StringBuilder f6039a = new StringBuilder();

        /* renamed from: a */
        private void m5421a() {
            if (this.f6039a.length() > 0) {
                TXCLog.m4996v("TXCGLSurfaceViewBase", this.f6039a.toString());
                StringBuilder sb = this.f6039a;
                sb.delete(0, sb.length());
            }
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            m5421a();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
            m5421a();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i10, int i11) {
            for (int i12 = 0; i12 < i11; i12++) {
                char c10 = cArr[i10 + i12];
                if (c10 == '\n') {
                    m5421a();
                } else {
                    this.f6039a.append(c10);
                }
            }
        }
    }

    /* renamed from: com.tencent.liteav.renderer.TXCGLSurfaceViewBase$m */
    public class C6672m extends C6661b {
        public C6672m(boolean z10) {
            super(8, 8, 8, 0, z10 ? 16 : 0, 0);
        }
    }

    public TXCGLSurfaceViewBase(Context context) {
        super(context);
        this.f5977b = false;
        this.f5978c = false;
        this.f5979d = new WeakReference<>(this);
        m5370e();
    }

    /* renamed from: a */
    public void mo5361a() {
    }

    /* renamed from: b */
    public int mo5363b() {
        return 0;
    }

    public void finalize() throws Throwable {
        try {
            C6668i c6668i = this.f5982g;
            if (c6668i != null) {
                c6668i.m5411g();
            }
        } finally {
            super.finalize();
        }
    }

    public int getDebugFlags() {
        return this.f5989n;
    }

    public C6667h getEGLHelper() {
        return this.f5982g.m5406b();
    }

    public boolean getPreserveEGLContextOnPause() {
        return this.f5991p;
    }

    public int getRenderMode() {
        return this.f5982g.m5408d();
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f5984i && this.f5983h != null) {
            C6668i c6668i = this.f5982g;
            int iM5408d = c6668i != null ? c6668i.m5408d() : 1;
            C6668i c6668i2 = new C6668i(this.f5979d);
            this.f5982g = c6668i2;
            if (iM5408d != 1) {
                c6668i2.m5403a(iM5408d);
            }
            this.f5982g.start();
        }
        this.f5984i = false;
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onDetachedFromWindow() {
        if (this.f5977b && this.f5982g != null) {
            TXCLog.m4998w("TXCGLSurfaceViewBase", "background capture destroy surface when onDetachedFromWindow");
            this.f5982g.m5405a(new Runnable() { // from class: com.tencent.liteav.renderer.TXCGLSurfaceViewBase.2
                @Override // java.lang.Runnable
                public void run() {
                    TXCGLSurfaceViewBase.this.mo5361a();
                }
            });
            this.f5982g.m5410f();
        }
        C6668i c6668i = this.f5982g;
        if (c6668i != null) {
            c6668i.m5411g();
        }
        this.f5984i = true;
        super.onDetachedFromWindow();
    }

    public void setDebugFlags(int i10) {
        this.f5989n = i10;
    }

    public void setEGLConfigChooser(InterfaceC6664e interfaceC6664e) {
        m5372f();
        this.f5985j = interfaceC6664e;
    }

    public void setEGLContextClientVersion(int i10) {
        m5372f();
        this.f5990o = i10;
    }

    public void setEGLContextFactory(InterfaceC6665f interfaceC6665f) {
        m5372f();
        this.f5986k = interfaceC6665f;
    }

    public void setEGLWindowSurfaceFactory(InterfaceC6666g interfaceC6666g) {
        m5372f();
        this.f5987l = interfaceC6666g;
    }

    public void setGLWrapper(InterfaceC6670k interfaceC6670k) {
        this.f5988m = interfaceC6670k;
    }

    public void setPreserveEGLContextOnPause(boolean z10) {
        this.f5991p = z10;
    }

    public void setRenderMode(int i10) {
        this.f5982g.m5403a(i10);
    }

    public void setRenderer(GLSurfaceView.Renderer renderer) {
        m5372f();
        if (this.f5985j == null) {
            this.f5985j = new C6672m(true);
        }
        if (this.f5986k == null) {
            this.f5986k = new C6662c();
        }
        if (this.f5987l == null) {
            this.f5987l = new C6663d();
        }
        this.f5983h = renderer;
        C6668i c6668i = new C6668i(this.f5979d);
        this.f5982g = c6668i;
        c6668i.start();
        TXCLog.m4994i("TXCGLSurfaceViewBase", "setRenderer-->mGLThread.start");
    }

    public void setRunInBackground(boolean z10) {
        this.f5978c = z10;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        this.f5982g.m5404a(i11, i12);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.f5982g.m5409e();
        setRunInBackground(false);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        setRunInBackground(true);
        if (this.f5977b) {
            return;
        }
        this.f5982g.m5405a(new Runnable() { // from class: com.tencent.liteav.renderer.TXCGLSurfaceViewBase.1
            @Override // java.lang.Runnable
            public void run() {
                TXCGLSurfaceViewBase.this.mo5361a();
            }
        });
        this.f5982g.m5410f();
    }

    /* renamed from: e */
    private void m5370e() {
        getHolder().addCallback(this);
    }

    /* renamed from: f */
    private void m5372f() {
        if (this.f5982g != null) {
            throw new IllegalStateException("setRenderer has already been called for this instance.");
        }
    }

    /* renamed from: c */
    public int m5376c() {
        return this.f5982g.m5402a();
    }

    /* renamed from: com.tencent.liteav.renderer.TXCGLSurfaceViewBase$d */
    public static class C6663d implements InterfaceC6666g {
        private C6663d() {
        }

        @Override // com.tencent.liteav.renderer.TXCGLSurfaceViewBase.InterfaceC6666g
        /* renamed from: a */
        public EGLSurface mo5383a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, Object obj) {
            try {
                return egl10.eglCreateWindowSurface(eGLDisplay, eGLConfig, obj, null);
            } catch (IllegalArgumentException e10) {
                TXCLog.m4991e("TXCGLSurfaceViewBase", "eglCreateWindowSurface");
                TXCLog.m4991e("TXCGLSurfaceViewBase", e10.toString());
                return null;
            }
        }

        @Override // com.tencent.liteav.renderer.TXCGLSurfaceViewBase.InterfaceC6666g
        /* renamed from: a */
        public void mo5384a(EGL10 egl10, EGLDisplay eGLDisplay, EGLSurface eGLSurface) {
            egl10.eglDestroySurface(eGLDisplay, eGLSurface);
        }
    }

    /* renamed from: com.tencent.liteav.renderer.TXCGLSurfaceViewBase$j */
    public static class C6669j {

        /* renamed from: a */
        private static String f6032a = "GLThreadManager";

        /* renamed from: b */
        private boolean f6033b;

        /* renamed from: c */
        private int f6034c;

        /* renamed from: d */
        private boolean f6035d;

        /* renamed from: e */
        private boolean f6036e;

        /* renamed from: f */
        private boolean f6037f;

        /* renamed from: g */
        private C6668i f6038g;

        private C6669j() {
        }

        /* renamed from: a */
        public synchronized void m5414a(C6668i c6668i) {
            try {
                c6668i.f6013b = true;
                if (this.f6038g == c6668i) {
                    this.f6038g = null;
                }
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }

        /* renamed from: b */
        public boolean m5418b(C6668i c6668i) {
            C6668i c6668i2 = this.f6038g;
            if (c6668i2 == c6668i || c6668i2 == null) {
                this.f6038g = c6668i;
                notifyAll();
                return true;
            }
            m5413c();
            if (this.f6036e) {
                return true;
            }
            C6668i c6668i3 = this.f6038g;
            if (c6668i3 == null) {
                return false;
            }
            c6668i3.m5412h();
            return false;
        }

        /* renamed from: c */
        public void m5419c(C6668i c6668i) {
            if (this.f6038g == c6668i) {
                this.f6038g = null;
            }
            notifyAll();
        }

        /* renamed from: c */
        private void m5413c() {
            this.f6034c = 131072;
            this.f6036e = true;
            this.f6033b = true;
        }

        /* renamed from: a */
        public synchronized boolean m5416a() {
            return this.f6037f;
        }

        /* renamed from: a */
        public synchronized void m5415a(GL10 gl10) {
            try {
                if (!this.f6035d) {
                    m5413c();
                    String strGlGetString = gl10.glGetString(7937);
                    if (this.f6034c < 131072) {
                        this.f6036e = !strGlGetString.startsWith("Q3Dimension MSM7500 ");
                        notifyAll();
                    }
                    this.f6037f = !this.f6036e;
                    this.f6035d = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }

        /* renamed from: b */
        public synchronized boolean m5417b() {
            m5413c();
            return !this.f6036e;
        }
    }

    /* renamed from: a */
    public void m5375a(int i10, int i11, int i12, int i13, int i14, int i15) {
        setEGLConfigChooser(new C6661b(i10, i11, i12, i13, i14, i15));
    }

    public void setEGLConfigChooser(boolean z10) {
        setEGLConfigChooser(new C6672m(z10));
    }

    /* renamed from: com.tencent.liteav.renderer.TXCGLSurfaceViewBase$c */
    public class C6662c implements InterfaceC6665f {

        /* renamed from: b */
        private int f6005b;

        private C6662c() {
            this.f6005b = 12440;
        }

        @Override // com.tencent.liteav.renderer.TXCGLSurfaceViewBase.InterfaceC6665f
        /* renamed from: a */
        public EGLContext mo5381a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
            int[] iArr = {this.f6005b, TXCGLSurfaceViewBase.this.f5990o, 12344};
            if (TXCGLSurfaceViewBase.this.f5990o == 0) {
                iArr = null;
            }
            return egl10.eglCreateContext(eGLDisplay, eGLConfig, EGL10.EGL_NO_CONTEXT, iArr);
        }

        @Override // com.tencent.liteav.renderer.TXCGLSurfaceViewBase.InterfaceC6665f
        /* renamed from: a */
        public void mo5382a(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
            if (egl10.eglDestroyContext(eGLDisplay, eGLContext)) {
                return;
            }
            TXCLog.m4991e("DefaultContextFactory", "display:" + eGLDisplay + " context: " + eGLContext);
            C6667h.m5386a("eglDestroyContex", egl10.eglGetError());
        }
    }

    public TXCGLSurfaceViewBase(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5977b = false;
        this.f5978c = false;
        this.f5979d = new WeakReference<>(this);
        m5370e();
    }

    /* renamed from: com.tencent.liteav.renderer.TXCGLSurfaceViewBase$b */
    public class C6661b extends AbstractC6660a {

        /* renamed from: c */
        protected int f5996c;

        /* renamed from: d */
        protected int f5997d;

        /* renamed from: e */
        protected int f5998e;

        /* renamed from: f */
        protected int f5999f;

        /* renamed from: g */
        protected int f6000g;

        /* renamed from: h */
        protected int f6001h;

        /* renamed from: j */
        private int[] f6003j;

        public C6661b(int i10, int i11, int i12, int i13, int i14, int i15) {
            super(new int[]{12324, i10, 12323, i11, 12322, i12, 12321, i13, 12325, i14, 12326, i15, 12344});
            this.f6003j = new int[1];
            this.f5996c = i10;
            this.f5997d = i11;
            this.f5998e = i12;
            this.f5999f = i13;
            this.f6000g = i14;
            this.f6001h = i15;
        }

        @Override // com.tencent.liteav.renderer.TXCGLSurfaceViewBase.AbstractC6660a
        /* renamed from: a */
        public EGLConfig mo5379a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr) {
            int length = eGLConfigArr.length;
            int i10 = 0;
            while (i10 < length) {
                EGLConfig eGLConfig = eGLConfigArr[i10];
                EGL10 egl102 = egl10;
                EGLDisplay eGLDisplay2 = eGLDisplay;
                int iM5380a = m5380a(egl102, eGLDisplay2, eGLConfig, 12325, 0);
                int iM5380a2 = m5380a(egl102, eGLDisplay2, eGLConfig, 12326, 0);
                if (iM5380a >= this.f6000g && iM5380a2 >= this.f6001h) {
                    int iM5380a3 = m5380a(egl102, eGLDisplay2, eGLConfig, 12324, 0);
                    int iM5380a4 = m5380a(egl102, eGLDisplay2, eGLConfig, 12323, 0);
                    int iM5380a5 = m5380a(egl102, eGLDisplay2, eGLConfig, 12322, 0);
                    int iM5380a6 = m5380a(egl102, eGLDisplay2, eGLConfig, 12321, 0);
                    if (iM5380a3 == this.f5996c && iM5380a4 == this.f5997d && iM5380a5 == this.f5998e && iM5380a6 == this.f5999f) {
                        return eGLConfig;
                    }
                }
                i10++;
                egl10 = egl102;
                eGLDisplay = eGLDisplay2;
            }
            return null;
        }

        /* renamed from: a */
        private int m5380a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i10, int i11) {
            return egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i10, this.f6003j) ? this.f6003j[0] : i11;
        }
    }

    /* renamed from: com.tencent.liteav.renderer.TXCGLSurfaceViewBase$a */
    public abstract class AbstractC6660a implements InterfaceC6664e {

        /* renamed from: a */
        protected int[] f5994a;

        public AbstractC6660a(int[] iArr) {
            this.f5994a = m5377a(iArr);
        }

        @Override // com.tencent.liteav.renderer.TXCGLSurfaceViewBase.InterfaceC6664e
        /* renamed from: a */
        public EGLConfig mo5378a(EGL10 egl10, EGLDisplay eGLDisplay) {
            int[] iArr = new int[1];
            if (!egl10.eglChooseConfig(eGLDisplay, this.f5994a, null, 0, iArr)) {
                throw new IllegalArgumentException("eglChooseConfig failed");
            }
            int i10 = iArr[0];
            if (i10 <= 0) {
                throw new IllegalArgumentException("No configs match configSpec");
            }
            EGLConfig[] eGLConfigArr = new EGLConfig[i10];
            if (!egl10.eglChooseConfig(eGLDisplay, this.f5994a, eGLConfigArr, i10, iArr)) {
                throw new IllegalArgumentException("eglChooseConfig#2 failed");
            }
            EGLConfig eGLConfigMo5379a = mo5379a(egl10, eGLDisplay, eGLConfigArr);
            if (eGLConfigMo5379a != null) {
                return eGLConfigMo5379a;
            }
            throw new IllegalArgumentException("No config chosen");
        }

        /* renamed from: a */
        public abstract EGLConfig mo5379a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr);

        /* renamed from: a */
        private int[] m5377a(int[] iArr) {
            if (TXCGLSurfaceViewBase.this.f5990o != 2) {
                return iArr;
            }
            int length = iArr.length;
            int[] iArr2 = new int[length + 2];
            int i10 = length - 1;
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            iArr2[i10] = 12352;
            iArr2[length] = 4;
            iArr2[length + 1] = 12344;
            return iArr2;
        }
    }

    /* renamed from: com.tencent.liteav.renderer.TXCGLSurfaceViewBase$h */
    public static class C6667h {

        /* renamed from: a */
        EGL10 f6006a;

        /* renamed from: b */
        EGLDisplay f6007b;

        /* renamed from: c */
        EGLSurface f6008c;

        /* renamed from: d */
        EGLConfig f6009d;

        /* renamed from: e */
        EGLContext f6010e;

        /* renamed from: f */
        private WeakReference<TXCGLSurfaceViewBase> f6011f;

        public C6667h(WeakReference<TXCGLSurfaceViewBase> weakReference) {
            this.f6011f = weakReference;
        }

        /* renamed from: h */
        private void m5389h() {
            EGLSurface eGLSurface;
            EGLSurface eGLSurface2 = this.f6008c;
            if (eGLSurface2 == null || eGLSurface2 == (eGLSurface = EGL10.EGL_NO_SURFACE)) {
                return;
            }
            this.f6006a.eglMakeCurrent(this.f6007b, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            TXCGLSurfaceViewBase tXCGLSurfaceViewBase = this.f6011f.get();
            if (tXCGLSurfaceViewBase != null) {
                tXCGLSurfaceViewBase.f5987l.mo5384a(this.f6006a, this.f6007b, this.f6008c);
                tXCGLSurfaceViewBase.f5980e = false;
            }
            this.f6008c = null;
        }

        /* renamed from: a */
        public void m5390a() {
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            this.f6006a = egl10;
            EGLDisplay eGLDisplayEglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.f6007b = eGLDisplayEglGetDisplay;
            if (eGLDisplayEglGetDisplay == EGL10.EGL_NO_DISPLAY) {
                throw new RuntimeException("eglGetDisplay failed");
            }
            if (!this.f6006a.eglInitialize(eGLDisplayEglGetDisplay, new int[2])) {
                throw new RuntimeException("eglInitialize failed");
            }
            TXCGLSurfaceViewBase tXCGLSurfaceViewBase = this.f6011f.get();
            if (tXCGLSurfaceViewBase == null) {
                this.f6009d = null;
                this.f6010e = null;
                TXCLog.m4998w("TXCGLSurfaceViewBase", "start() error when view is null ");
            } else {
                this.f6009d = tXCGLSurfaceViewBase.f5985j.mo5378a(this.f6006a, this.f6007b);
                this.f6010e = tXCGLSurfaceViewBase.f5986k.mo5381a(this.f6006a, this.f6007b, this.f6009d);
            }
            EGLContext eGLContext = this.f6010e;
            if (eGLContext == null || eGLContext == EGL10.EGL_NO_CONTEXT) {
                this.f6010e = null;
                m5385a("createContext");
            }
            if (tXCGLSurfaceViewBase != null) {
                tXCGLSurfaceViewBase.f5981f = true;
            }
            this.f6008c = null;
        }

        /* renamed from: b */
        public boolean m5391b() {
            if (this.f6006a == null) {
                throw new RuntimeException("egl not initialized");
            }
            if (this.f6007b == null) {
                throw new RuntimeException("eglDisplay not initialized");
            }
            if (this.f6009d == null) {
                throw new RuntimeException("mEglConfig not initialized");
            }
            m5389h();
            TXCGLSurfaceViewBase tXCGLSurfaceViewBase = this.f6011f.get();
            if (tXCGLSurfaceViewBase != null) {
                this.f6008c = tXCGLSurfaceViewBase.f5987l.mo5383a(this.f6006a, this.f6007b, this.f6009d, tXCGLSurfaceViewBase.getHolder());
            } else {
                this.f6008c = null;
            }
            EGLSurface eGLSurface = this.f6008c;
            if (eGLSurface == null || eGLSurface == EGL10.EGL_NO_SURFACE) {
                if (this.f6006a.eglGetError() == 12299) {
                    TXCLog.m4991e("EglHelper", "createWindowSurface returned EGL_BAD_NATIVE_WINDOW.");
                }
                return false;
            }
            if (!this.f6006a.eglMakeCurrent(this.f6007b, eGLSurface, eGLSurface, this.f6010e)) {
                m5387a("EGLHelper", "eglMakeCurrent", this.f6006a.eglGetError());
                return false;
            }
            if (tXCGLSurfaceViewBase != null) {
                tXCGLSurfaceViewBase.f5980e = true;
            }
            return true;
        }

        /* renamed from: c */
        public int m5392c() {
            return m5394e();
        }

        /* renamed from: d */
        public GL m5393d() {
            GL gl = this.f6010e.getGL();
            TXCGLSurfaceViewBase tXCGLSurfaceViewBase = this.f6011f.get();
            if (tXCGLSurfaceViewBase == null) {
                return gl;
            }
            if (tXCGLSurfaceViewBase.f5988m != null) {
                gl = tXCGLSurfaceViewBase.f5988m.m5420a(gl);
            }
            if ((tXCGLSurfaceViewBase.f5989n & 3) != 0) {
                return GLDebugHelper.wrap(gl, (tXCGLSurfaceViewBase.f5989n & 1) == 0 ? 0 : 1, (tXCGLSurfaceViewBase.f5989n & 2) != 0 ? new C6671l() : null);
            }
            return gl;
        }

        /* renamed from: e */
        public int m5394e() {
            if (this.f6006a.eglSwapBuffers(this.f6007b, this.f6008c)) {
                return 12288;
            }
            return this.f6006a.eglGetError();
        }

        /* renamed from: f */
        public void m5395f() {
            m5389h();
        }

        /* renamed from: g */
        public void m5396g() {
            if (this.f6010e != null) {
                TXCGLSurfaceViewBase tXCGLSurfaceViewBase = this.f6011f.get();
                if (tXCGLSurfaceViewBase != null) {
                    tXCGLSurfaceViewBase.f5986k.mo5382a(this.f6006a, this.f6007b, this.f6010e);
                }
                this.f6010e = null;
            }
            EGLDisplay eGLDisplay = this.f6007b;
            if (eGLDisplay != null) {
                this.f6006a.eglTerminate(eGLDisplay);
                this.f6007b = null;
            }
        }

        /* renamed from: a */
        private void m5385a(String str) {
            m5386a(str, this.f6006a.eglGetError());
        }

        /* renamed from: b */
        public static String m5388b(String str, int i10) {
            return str + " failed: " + i10;
        }

        /* renamed from: a */
        public static void m5386a(String str, int i10) {
            throw new RuntimeException(m5388b(str, i10));
        }

        /* renamed from: a */
        public static void m5387a(String str, String str2, int i10) {
            TXCLog.m4998w(str, m5388b(str2, i10));
        }
    }
}
