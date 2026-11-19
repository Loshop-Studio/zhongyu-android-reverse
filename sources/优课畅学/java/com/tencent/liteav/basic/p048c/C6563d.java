package com.tencent.liteav.basic.p048c;

import android.opengl.GLES20;
import android.os.HandlerThread;
import android.view.Surface;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.p048c.HandlerC6564e;
import javax.microedition.khronos.egl.EGLContext;

/* renamed from: com.tencent.liteav.basic.c.d */
/* loaded from: classes4.dex */
public class C6563d implements HandlerC6564e.a {

    /* renamed from: a */
    private volatile HandlerThread f5195a = null;

    /* renamed from: b */
    private volatile HandlerC6564e f5196b = null;

    /* renamed from: c */
    private C6565f f5197c = null;

    /* renamed from: d */
    private int f5198d = 0;

    /* renamed from: e */
    private boolean f5199e = false;

    /* renamed from: f */
    private float f5200f = 1.0f;

    /* renamed from: g */
    private float f5201g = 1.0f;

    /* renamed from: h */
    private int f5202h = 0;

    /* renamed from: i */
    private int f5203i = 0;

    /* renamed from: j */
    private int f5204j = 0;

    /* renamed from: k */
    private int f5205k = 0;

    /* renamed from: l */
    private boolean f5206l = false;

    /* renamed from: m */
    private InterfaceC6570k f5207m = null;

    /* renamed from: n */
    private boolean f5208n = false;

    /* renamed from: f */
    private void m4813f() {
        synchronized (this) {
            try {
                if (this.f5196b != null) {
                    HandlerC6564e.m4823a(this.f5196b, this.f5195a);
                    TXCLog.m4998w("TXGLSurfaceRenderThread", "surface-render: destroy gl thread");
                }
                this.f5196b = null;
                this.f5195a = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public Surface m4819b() {
        Surface surfaceM4829a;
        synchronized (this) {
            try {
                surfaceM4829a = this.f5196b != null ? this.f5196b.m4829a() : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        return surfaceM4829a;
    }

    @Override // com.tencent.liteav.basic.p048c.HandlerC6564e.a
    /* renamed from: c */
    public void mo4820c() {
        C6565f c6565f = new C6565f();
        this.f5197c = c6565f;
        if (c6565f.mo4842a()) {
            this.f5197c.m4841a(C6568i.f5283e, C6568i.m4866a(EnumC6567h.NORMAL, false, false));
        }
    }

    @Override // com.tencent.liteav.basic.p048c.HandlerC6564e.a
    /* renamed from: d */
    public void mo4821d() {
    }

    @Override // com.tencent.liteav.basic.p048c.HandlerC6564e.a
    /* renamed from: e */
    public void mo4822e() {
        C6565f c6565f = this.f5197c;
        if (c6565f != null) {
            c6565f.m4847d();
            this.f5197c = null;
        }
    }

    /* renamed from: a */
    public void m4817a(Object obj, Surface surface) {
        TXCLog.m4994i("TXGLSurfaceRenderThread", "surface-render: surface render start " + surface + ", " + this);
        m4812b(obj, surface);
    }

    /* renamed from: b */
    private void m4812b(Object obj, Surface surface) {
        m4813f();
        synchronized (this) {
            try {
                this.f5195a = new HandlerThread("TXGLSurfaceRenderThread");
                this.f5195a.start();
                this.f5196b = new HandlerC6564e(this.f5195a.getLooper());
                this.f5196b.m4830a(this);
                if (obj != null && !(obj instanceof EGLContext)) {
                    this.f5196b.f5228d = true;
                    this.f5196b.f5230f = (android.opengl.EGLContext) obj;
                } else {
                    this.f5196b.f5228d = false;
                    this.f5196b.f5232h = (EGLContext) obj;
                }
                this.f5196b.f5227c = surface;
                TXCLog.m4998w("TXGLSurfaceRenderThread", "surface-render: create gl thread " + this.f5195a.getName());
            } catch (Throwable th) {
                throw th;
            }
        }
        m4807a(100);
    }

    /* renamed from: a */
    public void m4814a() {
        TXCLog.m4994i("TXGLSurfaceRenderThread", "surface-render: surface render stop " + this);
        m4813f();
    }

    /* renamed from: a */
    public void m4818a(Runnable runnable) {
        synchronized (this) {
            try {
                if (this.f5196b != null) {
                    this.f5196b.post(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    public void m4815a(final int i10, final boolean z10, final int i11, final int i12, final int i13, final int i14, final int i15, final boolean z11, final boolean z12) {
        GLES20.glFinish();
        synchronized (this) {
            try {
                if (this.f5196b != null) {
                    this.f5196b.post(new Runnable() { // from class: com.tencent.liteav.basic.c.d.1
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                C6563d.this.m4811b(i10, z10, i11, i12, i13, i14, i15, z11, z12);
                            } catch (Exception e10) {
                                TXCLog.m4991e("TXGLSurfaceRenderThread", "surface-render: render texture error occurred!" + e10.getMessage());
                            }
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    public void m4816a(InterfaceC6570k interfaceC6570k) {
        this.f5207m = interfaceC6570k;
        this.f5206l = true;
    }

    /* renamed from: a */
    private void m4807a(int i10) {
        synchronized (this) {
            try {
                if (this.f5196b != null) {
                    this.f5196b.sendEmptyMessage(i10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    private int[] m4810a(int i10, int i11, int i12, int i13) {
        int i14;
        float f10 = i11;
        float f11 = i10;
        float f12 = i13 / i12;
        int i15 = 0;
        if (f10 / f11 > f12) {
            int i16 = (int) (f11 * f12);
            i14 = (i11 - i16) / 2;
            i11 = i16;
        } else {
            int i17 = (int) (f10 / f12);
            i15 = (i10 - i17) / 2;
            i10 = i17;
            i14 = 0;
        }
        return new int[]{i10, i11, i15, i14};
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m4811b(int r20, boolean r21, int r22, int r23, int r24, int r25, int r26, boolean r27, boolean r28) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.basic.p048c.C6563d.m4811b(int, boolean, int, int, int, int, int, boolean, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0054  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m4808a(int r13, int r14) {
        /*
            r12 = this;
            boolean r0 = r12.f5206l
            if (r0 == 0) goto L5b
            int r0 = r12.f5204j
            r1 = 0
            if (r0 == 0) goto L54
            int r2 = r12.f5205k
            if (r2 == 0) goto L54
            if (r0 > r2) goto L11
            r3 = 1
            goto L12
        L11:
            r3 = r1
        L12:
            if (r2 < r0) goto L16
            r4 = r2
            goto L17
        L16:
            r4 = r0
        L17:
            if (r2 < r0) goto L1a
            goto L1b
        L1a:
            r0 = r2
        L1b:
            if (r3 == 0) goto L20
            r7 = r0
            r8 = r4
            goto L22
        L20:
            r8 = r0
            r7 = r4
        L22:
            int r0 = r7 * r8
            int r0 = r0 * 4
            java.nio.ByteBuffer r11 = java.nio.ByteBuffer.allocate(r0)
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r7, r8, r0)
            r11.position(r1)
            r9 = 6408(0x1908, float:8.98E-42)
            r10 = 5121(0x1401, float:7.176E-42)
            r5 = r13
            r6 = r14
            android.opengl.GLES20.glReadPixels(r5, r6, r7, r8, r9, r10, r11)
            com.tencent.liteav.basic.c.k r13 = r12.f5207m
            if (r13 == 0) goto L54
            java.lang.Thread r14 = new java.lang.Thread
            com.tencent.liteav.basic.c.d$2 r5 = new com.tencent.liteav.basic.c.d$2
            r6 = r12
            r9 = r7
            r10 = r8
            r7 = r11
            r11 = r13
            r8 = r0
            r5.<init>()
            r14.<init>(r5)
            r14.start()
            goto L55
        L54:
            r6 = r12
        L55:
            r13 = 0
            r6.f5207m = r13
            r6.f5206l = r1
            return
        L5b:
            r6 = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.basic.p048c.C6563d.m4808a(int, int):void");
    }
}
