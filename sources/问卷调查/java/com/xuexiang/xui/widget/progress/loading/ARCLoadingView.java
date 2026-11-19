package com.xuexiang.xui.widget.progress.loading;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.view.View;

/* loaded from: classes.dex */
public class ARCLoadingView extends View {

    /* renamed from: b */
    public boolean f5364b;

    /* renamed from: c */
    public Paint f5365c;

    /* renamed from: d */
    public int f5366d;

    /* renamed from: e */
    public int f5367e;

    /* renamed from: f */
    public RectF f5368f;

    /* renamed from: g */
    public int f5369g;

    /* renamed from: h */
    public float f5370h;

    /* renamed from: i */
    public int f5371i;

    /* renamed from: j */
    public Bitmap f5372j;

    /* renamed from: k */
    public float f5373k;

    /* renamed from: l */
    public Paint f5374l;

    /* renamed from: m */
    public int[] f5375m;

    /* JADX WARN: Removed duplicated region for block: B:21:0x0088 A[PHI: r5
      0x0088: PHI (r5v20 android.graphics.drawable.Drawable) = (r5v19 android.graphics.drawable.Drawable), (r5v26 android.graphics.drawable.Drawable) binds: [B:5:0x0068, B:20:0x0086] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ARCLoadingView(android.content.Context r5, android.util.AttributeSet r6) {
        /*
            r4 = this;
            r4.<init>(r5, r6)
            r0 = 10
            r4.f5369g = r0
            int[] r0 = p070b.p113c.p114a.C0788b.f4450d
            android.content.res.TypedArray r6 = r5.obtainStyledAttributes(r6, r0)
            java.lang.Object r0 = p000a.p031h.p033c.C0192a.f1425a
            r0 = 2131099969(0x7f060141, float:1.7812306E38)
            int r0 = p000a.p031h.p033c.C0192a.d.m741a(r5, r0)
            r1 = 2130968924(0x7f04015c, float:1.7546515E38)
            int r5 = p070b.p113c.p114a.C0787a.m2462B(r5, r1, r0)
            r0 = 3
            int r5 = r6.getColor(r0, r5)
            r4.f5367e = r5
            r5 = 315(0x13b, float:4.41E-43)
            r0 = 0
            int r5 = r6.getInt(r0, r5)
            float r5 = (float) r5
            r4.f5370h = r5
            r5 = 2
            int[] r1 = new int[r5]
            r1[r0] = r0
            int r0 = r4.f5367e
            r2 = 1
            r1[r2] = r0
            r4.f5375m = r1
            r0 = 8
            android.content.Context r1 = r4.getContext()
            r3 = 1086324736(0x40c00000, float:6.0)
            int r1 = p070b.p113c.p114a.C0787a.m2474h(r1, r3)
            int r0 = r6.getDimensionPixelSize(r0, r1)
            r4.f5366d = r0
            r0 = 7
            r1 = 5
            int r0 = r6.getInt(r0, r1)
            r4.f5371i = r0
            boolean r5 = r6.getBoolean(r5, r2)
            r4.f5364b = r5
            r5 = 4
            boolean r5 = r6.getBoolean(r5, r2)
            if (r5 == 0) goto L97
            r4.getContext()
            android.graphics.drawable.Drawable r5 = r6.getDrawable(r1)
            if (r5 == 0) goto L6b
            goto L88
        L6b:
            b.c.a.c r5 = p070b.p113c.p114a.C0789c.f4457b
            if (r5 != 0) goto L82
            java.lang.Class<b.c.a.c> r5 = p070b.p113c.p114a.C0789c.class
            monitor-enter(r5)
            b.c.a.c r0 = p070b.p113c.p114a.C0789c.f4457b     // Catch: java.lang.Throwable -> L7f
            if (r0 != 0) goto L7d
            b.c.a.c r0 = new b.c.a.c     // Catch: java.lang.Throwable -> L7f
            r0.<init>()     // Catch: java.lang.Throwable -> L7f
            p070b.p113c.p114a.C0789c.f4457b = r0     // Catch: java.lang.Throwable -> L7f
        L7d:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L7f
            goto L82
        L7f:
            r6 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L7f
            throw r6
        L82:
            b.c.a.c r5 = p070b.p113c.p114a.C0789c.f4457b
            android.graphics.drawable.Drawable r5 = r5.f4458a
            if (r5 == 0) goto L8e
        L88:
            android.graphics.Bitmap r5 = p070b.p113c.p114a.C0787a.m2477k(r5)
            r4.f5372j = r5
        L8e:
            r5 = 6
            r0 = 1056964608(0x3f000000, float:0.5)
            float r5 = r6.getFloat(r5, r0)
            r4.f5373k = r5
        L97:
            r6.recycle()
            android.graphics.Paint r5 = new android.graphics.Paint
            r5.<init>()
            r4.f5365c = r5
            int r6 = r4.f5367e
            r5.setColor(r6)
            android.graphics.Paint r5 = r4.f5365c
            r5.setAntiAlias(r2)
            android.graphics.Paint r5 = r4.f5365c
            android.graphics.Paint$Style r6 = android.graphics.Paint.Style.STROKE
            r5.setStyle(r6)
            android.graphics.Paint r5 = r4.f5365c
            int r6 = r4.f5366d
            float r6 = (float) r6
            r5.setStrokeWidth(r6)
            android.graphics.Paint r5 = new android.graphics.Paint
            r5.<init>()
            r4.f5374l = r5
            int r6 = r4.f5367e
            r5.setColor(r6)
            android.graphics.Paint r5 = r4.f5374l
            r5.setAntiAlias(r2)
            android.graphics.Paint r5 = r4.f5374l
            r5.setFilterBitmap(r2)
            android.graphics.Paint r5 = r4.f5374l
            android.graphics.Paint$Style r6 = android.graphics.Paint.Style.STROKE
            r5.setStyle(r6)
            android.graphics.Paint r5 = r4.f5374l
            android.graphics.Paint$Cap r6 = android.graphics.Paint.Cap.ROUND
            r5.setStrokeCap(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xuexiang.xui.widget.progress.loading.ARCLoadingView.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public float getIconScale() {
        return this.f5373k;
    }

    public int getLoadingColor() {
        return this.f5367e;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        float height;
        float height2;
        super.onDraw(canvas);
        if (this.f5364b) {
            Bitmap bitmap = this.f5372j;
            if (bitmap != null) {
                float width = bitmap.getWidth();
                float height3 = bitmap.getHeight();
                if (width >= height3) {
                    height2 = (getWidth() / width) * height3;
                    height = getWidth();
                } else {
                    height = width * (getHeight() / height3);
                    height2 = getHeight();
                }
                float width2 = (getWidth() - (height * this.f5373k)) / 2.0f;
                float height4 = (getHeight() - (height2 * this.f5373k)) / 2.0f;
                canvas.drawBitmap(bitmap, (Rect) null, new RectF(width2, height4, getWidth() - width2, getHeight() - height4), this.f5374l);
            }
            Paint paint = this.f5365c;
            SweepGradient sweepGradient = new SweepGradient(canvas.getWidth() >> 1, canvas.getHeight() >> 1, this.f5375m, (float[]) null);
            Matrix matrix = new Matrix();
            matrix.setRotate(this.f5369g, canvas.getWidth() >> 1, canvas.getHeight() >> 1);
            sweepGradient.setLocalMatrix(matrix);
            paint.setShader(sweepGradient);
            canvas.drawArc(this.f5368f, this.f5369g, this.f5370h, false, this.f5365c);
            int i = this.f5369g + this.f5371i;
            this.f5369g = i;
            if (i > 360) {
                this.f5369g = i - 360;
            }
            invalidate();
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int i5 = this.f5366d;
        this.f5368f = new RectF(i5 * 2, i5 * 2, i - (i5 * 2), i2 - (i5 * 2));
    }
}
