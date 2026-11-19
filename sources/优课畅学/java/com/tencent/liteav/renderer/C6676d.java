package com.tencent.liteav.renderer;

import android.graphics.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.view.TextureView;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.smtt.sdk.TbsListener;

/* renamed from: com.tencent.liteav.renderer.d */
/* loaded from: classes4.dex */
public class C6676d {

    /* renamed from: a */
    private TextureView f6087a;

    /* renamed from: b */
    private Handler f6088b;

    /* renamed from: c */
    private int f6089c;

    /* renamed from: d */
    private int f6090d;

    /* renamed from: e */
    private int f6091e = TbsListener.ErrorCode.STATIC_TBS_INSTALL_MAKE_SYMBOLIC_LINK_ERR;

    /* renamed from: f */
    private int f6092f = 480;

    /* renamed from: g */
    private int f6093g = 0;

    /* renamed from: h */
    private int f6094h = 0;

    /* renamed from: i */
    private int f6095i = 1;

    /* renamed from: j */
    private int f6096j = 0;

    /* renamed from: k */
    private float f6097k = 1.0f;

    /* renamed from: l */
    private int f6098l = 0;

    public C6676d(TextureView textureView) {
        this.f6089c = 0;
        this.f6090d = 0;
        this.f6087a = textureView;
        this.f6089c = textureView.getWidth();
        this.f6090d = textureView.getHeight();
        this.f6088b = new Handler(textureView.getContext().getMainLooper());
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0033 A[PHI: r8
      0x0033: PHI (r8v11 float) = (r8v7 float), (r8v17 float) binds: [B:34:0x0059, B:18:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035 A[PHI: r2
      0x0035: PHI (r2v7 float) = (r2v3 float), (r2v6 float), (r2v10 float) binds: [B:37:0x0068, B:34:0x0059, B:18:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m5475b(int r8) {
        /*
            r7 = this;
            r7.f6095i = r8
            android.view.TextureView r0 = r7.f6087a
            if (r0 == 0) goto L81
            r1 = 1
            r2 = 90
            r3 = 270(0x10e, float:3.78E-43)
            r4 = 180(0xb4, float:2.52E-43)
            r5 = 1065353216(0x3f800000, float:1.0)
            if (r8 != r1) goto L37
            int r8 = r7.f6096j
            if (r8 == 0) goto L6b
            if (r8 != r4) goto L18
            goto L6b
        L18:
            if (r8 == r3) goto L1c
            if (r8 != r2) goto L6b
        L1c:
            int r8 = r7.f6093g
            if (r8 == 0) goto L81
            int r1 = r7.f6094h
            if (r1 != 0) goto L25
            goto L81
        L25:
            int r2 = r7.f6090d
            float r2 = (float) r2
            float r8 = (float) r8
            float r2 = r2 / r8
            int r8 = r7.f6089c
            float r8 = (float) r8
            float r1 = (float) r1
            float r8 = r8 / r1
            int r1 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r1 <= 0) goto L35
        L33:
            r5 = r8
            goto L6b
        L35:
            r5 = r2
            goto L6b
        L37:
            if (r8 != 0) goto L6b
            int r8 = r7.f6093g
            if (r8 == 0) goto L81
            int r1 = r7.f6094h
            if (r1 != 0) goto L42
            goto L81
        L42:
            int r6 = r7.f6096j
            if (r6 == 0) goto L5c
            if (r6 != r4) goto L49
            goto L5c
        L49:
            if (r6 == r3) goto L4d
            if (r6 != r2) goto L6b
        L4d:
            int r2 = r7.f6090d
            float r2 = (float) r2
            float r8 = (float) r8
            float r2 = r2 / r8
            int r8 = r7.f6089c
            float r8 = (float) r8
            float r1 = (float) r1
            float r8 = r8 / r1
            int r1 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r1 >= 0) goto L35
            goto L33
        L5c:
            int r2 = r7.f6090d
            float r2 = (float) r2
            float r1 = (float) r1
            float r2 = r2 / r1
            int r1 = r7.f6089c
            float r1 = (float) r1
            float r8 = (float) r8
            float r1 = r1 / r8
            int r8 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r8 >= 0) goto L35
            r5 = r1
        L6b:
            float r8 = r7.f6097k
            r1 = 0
            int r8 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r8 >= 0) goto L73
            float r5 = -r5
        L73:
            r0.setScaleX(r5)
            android.view.TextureView r8 = r7.f6087a
            float r0 = java.lang.Math.abs(r5)
            r8.setScaleY(r0)
            r7.f6097k = r5
        L81:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.renderer.C6676d.m5475b(int):void");
    }

    /* renamed from: c */
    public void m5477c(final int i10) {
        try {
            this.f6088b.post(new Runnable() { // from class: com.tencent.liteav.renderer.d.2
                @Override // java.lang.Runnable
                public void run() {
                    C6676d.this.m5478d(i10);
                }
            });
        } catch (Exception e10) {
            TXCLog.m4992e("TXCTextureViewWrapper", "set render rotation failed.", e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0040 A[PHI: r0
      0x0040: PHI (r0v6 float) = (r0v5 float), (r0v13 float), (r0v13 float) binds: [B:38:0x006d, B:26:0x0048, B:21:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m5478d(int r5) {
        /*
            r4 = this;
            int r5 = r5 % 360
            r4.f6096j = r5
            android.view.TextureView r0 = r4.f6087a
            if (r0 == 0) goto L89
            r1 = 1
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r5 == 0) goto L4b
            r3 = 180(0xb4, float:2.52E-43)
            if (r5 != r3) goto L12
            goto L4b
        L12:
            r3 = 270(0x10e, float:3.78E-43)
            if (r5 == r3) goto L1a
            r3 = 90
            if (r5 != r3) goto L71
        L1a:
            int r3 = r4.f6093g
            if (r3 == 0) goto L89
            int r3 = r4.f6094h
            if (r3 != 0) goto L24
            goto L89
        L24:
            int r5 = 360 - r5
            float r5 = (float) r5
            r0.setRotation(r5)
            int r5 = r4.f6090d
            float r5 = (float) r5
            int r0 = r4.f6093g
            float r0 = (float) r0
            float r5 = r5 / r0
            int r0 = r4.f6089c
            float r0 = (float) r0
            int r3 = r4.f6094h
            float r3 = (float) r3
            float r0 = r0 / r3
            int r3 = r4.f6095i
            if (r3 != r1) goto L44
            int r1 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r1 <= 0) goto L42
        L40:
            r2 = r0
            goto L71
        L42:
            r2 = r5
            goto L71
        L44:
            if (r3 != 0) goto L71
            int r1 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r1 >= 0) goto L42
            goto L40
        L4b:
            int r5 = 360 - r5
            float r5 = (float) r5
            r0.setRotation(r5)
            int r5 = r4.f6095i
            if (r5 != r1) goto L56
            goto L71
        L56:
            if (r5 != 0) goto L71
            int r5 = r4.f6093g
            if (r5 == 0) goto L89
            int r0 = r4.f6094h
            if (r0 != 0) goto L61
            goto L89
        L61:
            int r1 = r4.f6090d
            float r1 = (float) r1
            float r0 = (float) r0
            float r1 = r1 / r0
            int r0 = r4.f6089c
            float r0 = (float) r0
            float r5 = (float) r5
            float r0 = r0 / r5
            int r5 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r5 >= 0) goto L70
            goto L40
        L70:
            r2 = r1
        L71:
            float r5 = r4.f6097k
            r0 = 0
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 >= 0) goto L79
            float r2 = -r2
        L79:
            android.view.TextureView r5 = r4.f6087a
            r5.setScaleX(r2)
            android.view.TextureView r5 = r4.f6087a
            float r0 = java.lang.Math.abs(r2)
            r5.setScaleY(r0)
            r4.f6097k = r2
        L89:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.renderer.C6676d.m5478d(int):void");
    }

    /* renamed from: a */
    public void m5473a(final int i10) {
        try {
            this.f6088b.post(new Runnable() { // from class: com.tencent.liteav.renderer.d.1
                @Override // java.lang.Runnable
                public void run() {
                    C6676d.this.m5475b(i10);
                }
            });
        } catch (Exception e10) {
            TXCLog.m4992e("TXCTextureViewWrapper", "set render mode failed", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m5471c(int i10, int i11) {
        int i12;
        int i13;
        if (this.f6087a == null || i10 == 0 || i11 == 0 || (i12 = this.f6089c) == 0 || (i13 = this.f6090d) == 0) {
            return;
        }
        double d10 = i11 / i10;
        if (i13 > ((int) (i12 * d10))) {
            this.f6093g = i12;
            this.f6094h = (int) (i12 * d10);
        } else {
            this.f6093g = (int) (i13 / d10);
            this.f6094h = i13;
        }
        int i14 = this.f6093g;
        float f10 = (i12 - i14) / 2.0f;
        float f11 = (i13 - r3) / 2.0f;
        float f12 = i14 / i12;
        float f13 = this.f6094h / i13;
        Matrix matrix = new Matrix();
        this.f6087a.getTransform(matrix);
        matrix.setScale(f12, f13);
        matrix.postTranslate(f10, f11);
        this.f6087a.setTransform(matrix);
        this.f6087a.requestLayout();
    }

    /* renamed from: a */
    private void m5466a() {
        try {
            m5468a(new Runnable() { // from class: com.tencent.liteav.renderer.d.3
                @Override // java.lang.Runnable
                public void run() {
                    C6676d c6676d = C6676d.this;
                    c6676d.m5471c(c6676d.f6091e, C6676d.this.f6092f);
                    C6676d c6676d2 = C6676d.this;
                    c6676d2.m5475b(c6676d2.f6095i);
                    C6676d c6676d3 = C6676d.this;
                    c6676d3.m5478d(c6676d3.f6096j);
                }
            });
        } catch (Exception e10) {
            TXCLog.m4992e("TXCTextureViewWrapper", "adjust video size failed.", e10);
        }
    }

    /* renamed from: a */
    public void m5474a(int i10, int i11) {
        TXCLog.m4998w("TXCTextureViewWrapper", "vrender: set view size:" + i10 + "," + i11);
        this.f6089c = i10;
        this.f6090d = i11;
        m5466a();
    }

    /* renamed from: a */
    private void m5468a(Runnable runnable) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            this.f6088b.post(runnable);
        }
    }

    /* renamed from: b */
    public void m5476b(int i10, int i11) {
        TXCLog.m4998w("TXCTextureViewWrapper", "vrender: set video size:" + i10 + "," + i11);
        this.f6091e = i10;
        this.f6092f = i11;
        m5466a();
    }
}
