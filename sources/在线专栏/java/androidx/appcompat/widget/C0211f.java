package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.appcompat.widget.C0237w;
import p015c.C1038a;
import p015c.C1040c;
import p015c.C1041d;
import p015c.C1042e;
import p073d.C2443a;
import p152t.C3385d;

/* renamed from: androidx.appcompat.widget.f */
/* loaded from: classes.dex */
public final class C0211f {

    /* renamed from: b */
    private static final PorterDuff.Mode f1081b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c */
    private static C0211f f1082c;

    /* renamed from: a */
    private C0237w f1083a;

    /* renamed from: androidx.appcompat.widget.f$a */
    class a implements C0237w.f {

        /* renamed from: a */
        private final int[] f1084a = {C1042e.f5804R, C1042e.f5802P, C1042e.f5806a};

        /* renamed from: b */
        private final int[] f1085b = {C1042e.f5820o, C1042e.f5788B, C1042e.f5825t, C1042e.f5821p, C1042e.f5822q, C1042e.f5824s, C1042e.f5823r};

        /* renamed from: c */
        private final int[] f1086c = {C1042e.f5801O, C1042e.f5803Q, C1042e.f5816k, C1042e.f5797K, C1042e.f5798L, C1042e.f5799M, C1042e.f5800N};

        /* renamed from: d */
        private final int[] f1087d = {C1042e.f5828w, C1042e.f5814i, C1042e.f5827v};

        /* renamed from: e */
        private final int[] f1088e = {C1042e.f5796J, C1042e.f5805S};

        /* renamed from: f */
        private final int[] f1089f = {C1042e.f5808c, C1042e.f5812g, C1042e.f5809d, C1042e.f5813h};

        a() {
        }

        /* renamed from: f */
        private boolean m799f(int[] iArr, int i4) {
            for (int i5 : iArr) {
                if (i5 == i4) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: g */
        private ColorStateList m800g(Context context) {
            return m801h(context, 0);
        }

        /* renamed from: h */
        private ColorStateList m801h(Context context, int i4) {
            int iM764c = C0204b0.m764c(context, C1038a.f5758v);
            return new ColorStateList(new int[][]{C0204b0.f1052b, C0204b0.f1055e, C0204b0.f1053c, C0204b0.f1059i}, new int[]{C0204b0.m763b(context, C1038a.f5756t), C3385d.m10301b(iM764c, i4), C3385d.m10301b(iM764c, i4), i4});
        }

        /* renamed from: i */
        private ColorStateList m802i(Context context) {
            return m801h(context, C0204b0.m764c(context, C1038a.f5755s));
        }

        /* renamed from: j */
        private ColorStateList m803j(Context context) {
            return m801h(context, C0204b0.m764c(context, C1038a.f5756t));
        }

        /* renamed from: k */
        private ColorStateList m804k(Context context) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            int i4 = C1038a.f5761y;
            ColorStateList colorStateListM766e = C0204b0.m766e(context, i4);
            if (colorStateListM766e == null || !colorStateListM766e.isStateful()) {
                iArr[0] = C0204b0.f1052b;
                iArr2[0] = C0204b0.m763b(context, i4);
                iArr[1] = C0204b0.f1056f;
                iArr2[1] = C0204b0.m764c(context, C1038a.f5757u);
                iArr[2] = C0204b0.f1059i;
                iArr2[2] = C0204b0.m764c(context, i4);
            } else {
                iArr[0] = C0204b0.f1052b;
                iArr2[0] = colorStateListM766e.getColorForState(iArr[0], 0);
                iArr[1] = C0204b0.f1056f;
                iArr2[1] = C0204b0.m764c(context, C1038a.f5757u);
                iArr[2] = C0204b0.f1059i;
                iArr2[2] = colorStateListM766e.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        /* renamed from: l */
        private LayerDrawable m805l(C0237w c0237w, Context context, int i4) throws Resources.NotFoundException {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i4);
            Drawable drawableM1026j = c0237w.m1026j(context, C1042e.f5792F);
            Drawable drawableM1026j2 = c0237w.m1026j(context, C1042e.f5793G);
            if ((drawableM1026j instanceof BitmapDrawable) && drawableM1026j.getIntrinsicWidth() == dimensionPixelSize && drawableM1026j.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) drawableM1026j;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                drawableM1026j.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableM1026j.draw(canvas);
                bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
                bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((drawableM1026j2 instanceof BitmapDrawable) && drawableM1026j2.getIntrinsicWidth() == dimensionPixelSize && drawableM1026j2.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) drawableM1026j2;
            } else {
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
                drawableM1026j2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableM1026j2.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, R.id.background);
            layerDrawable.setId(1, R.id.secondaryProgress);
            layerDrawable.setId(2, R.id.progress);
            return layerDrawable;
        }

        /* renamed from: m */
        private void m806m(Drawable drawable, int i4, PorterDuff.Mode mode) {
            if (C0231q.m980a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = C0211f.f1081b;
            }
            drawable.setColorFilter(C0211f.m792e(i4, mode));
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0061 A[RETURN] */
        @Override // androidx.appcompat.widget.C0237w.f
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean mo807a(android.content.Context r7, int r8, android.graphics.drawable.Drawable r9) {
            /*
                r6 = this;
                android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.C0211f.m790a()
                int[] r1 = r6.f1084a
                boolean r1 = r6.m799f(r1, r8)
                r2 = 16842801(0x1010031, float:2.3693695E-38)
                r3 = -1
                r4 = 0
                r5 = 1
                if (r1 == 0) goto L17
                int r2 = p015c.C1038a.f5759w
            L14:
                r8 = -1
            L15:
                r1 = 1
                goto L44
            L17:
                int[] r1 = r6.f1086c
                boolean r1 = r6.m799f(r1, r8)
                if (r1 == 0) goto L22
                int r2 = p015c.C1038a.f5757u
                goto L14
            L22:
                int[] r1 = r6.f1087d
                boolean r1 = r6.m799f(r1, r8)
                if (r1 == 0) goto L2d
                android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
                goto L14
            L2d:
                int r1 = p015c.C1042e.f5826u
                if (r8 != r1) goto L3c
                r2 = 16842800(0x1010030, float:2.3693693E-38)
                r8 = 1109603123(0x42233333, float:40.8)
                int r8 = java.lang.Math.round(r8)
                goto L15
            L3c:
                int r1 = p015c.C1042e.f5817l
                if (r8 != r1) goto L41
                goto L14
            L41:
                r8 = -1
                r1 = 0
                r2 = 0
            L44:
                if (r1 == 0) goto L61
                boolean r1 = androidx.appcompat.widget.C0231q.m980a(r9)
                if (r1 == 0) goto L50
                android.graphics.drawable.Drawable r9 = r9.mutate()
            L50:
                int r7 = androidx.appcompat.widget.C0204b0.m764c(r7, r2)
                android.graphics.PorterDuffColorFilter r7 = androidx.appcompat.widget.C0211f.m792e(r7, r0)
                r9.setColorFilter(r7)
                if (r8 == r3) goto L60
                r9.setAlpha(r8)
            L60:
                return r5
            L61:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0211f.a.mo807a(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
        }

        @Override // androidx.appcompat.widget.C0237w.f
        /* renamed from: b */
        public PorterDuff.Mode mo808b(int i4) {
            if (i4 == C1042e.f5794H) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        @Override // androidx.appcompat.widget.C0237w.f
        /* renamed from: c */
        public Drawable mo809c(C0237w c0237w, Context context, int i4) {
            if (i4 == C1042e.f5815j) {
                return new LayerDrawable(new Drawable[]{c0237w.m1026j(context, C1042e.f5814i), c0237w.m1026j(context, C1042e.f5816k)});
            }
            if (i4 == C1042e.f5830y) {
                return m805l(c0237w, context, C1041d.f5780i);
            }
            if (i4 == C1042e.f5829x) {
                return m805l(c0237w, context, C1041d.f5781j);
            }
            if (i4 == C1042e.f5831z) {
                return m805l(c0237w, context, C1041d.f5782k);
            }
            return null;
        }

        @Override // androidx.appcompat.widget.C0237w.f
        /* renamed from: d */
        public ColorStateList mo810d(Context context, int i4) {
            if (i4 == C1042e.f5818m) {
                return C2443a.m8168c(context, C1040c.f5768e);
            }
            if (i4 == C1042e.f5795I) {
                return C2443a.m8168c(context, C1040c.f5771h);
            }
            if (i4 == C1042e.f5794H) {
                return m804k(context);
            }
            if (i4 == C1042e.f5811f) {
                return m803j(context);
            }
            if (i4 == C1042e.f5807b) {
                return m800g(context);
            }
            if (i4 == C1042e.f5810e) {
                return m802i(context);
            }
            if (i4 == C1042e.f5790D || i4 == C1042e.f5791E) {
                return C2443a.m8168c(context, C1040c.f5770g);
            }
            if (m799f(this.f1085b, i4)) {
                return C0204b0.m766e(context, C1038a.f5759w);
            }
            if (m799f(this.f1088e, i4)) {
                return C2443a.m8168c(context, C1040c.f5767d);
            }
            if (m799f(this.f1089f, i4)) {
                return C2443a.m8168c(context, C1040c.f5766c);
            }
            if (i4 == C1042e.f5787A) {
                return C2443a.m8168c(context, C1040c.f5769f);
            }
            return null;
        }

        @Override // androidx.appcompat.widget.C0237w.f
        /* renamed from: e */
        public boolean mo811e(Context context, int i4, Drawable drawable) {
            if (i4 == C1042e.f5789C) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.background);
                int i5 = C1038a.f5759w;
                m806m(drawableFindDrawableByLayerId, C0204b0.m764c(context, i5), C0211f.f1081b);
                m806m(layerDrawable.findDrawableByLayerId(R.id.secondaryProgress), C0204b0.m764c(context, i5), C0211f.f1081b);
                m806m(layerDrawable.findDrawableByLayerId(R.id.progress), C0204b0.m764c(context, C1038a.f5757u), C0211f.f1081b);
                return true;
            }
            if (i4 != C1042e.f5830y && i4 != C1042e.f5829x && i4 != C1042e.f5831z) {
                return false;
            }
            LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
            m806m(layerDrawable2.findDrawableByLayerId(R.id.background), C0204b0.m763b(context, C1038a.f5759w), C0211f.f1081b);
            Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(R.id.secondaryProgress);
            int i6 = C1038a.f5757u;
            m806m(drawableFindDrawableByLayerId2, C0204b0.m764c(context, i6), C0211f.f1081b);
            m806m(layerDrawable2.findDrawableByLayerId(R.id.progress), C0204b0.m764c(context, i6), C0211f.f1081b);
            return true;
        }
    }

    /* renamed from: b */
    public static synchronized C0211f m791b() {
        if (f1082c == null) {
            m793h();
        }
        return f1082c;
    }

    /* renamed from: e */
    public static synchronized PorterDuffColorFilter m792e(int i4, PorterDuff.Mode mode) {
        return C0237w.m1019l(i4, mode);
    }

    /* renamed from: h */
    public static synchronized void m793h() {
        if (f1082c == null) {
            C0211f c0211f = new C0211f();
            f1082c = c0211f;
            c0211f.f1083a = C0237w.m1017h();
            f1082c.f1083a.m1032u(new a());
        }
    }

    /* renamed from: i */
    static void m794i(Drawable drawable, C0210e0 c0210e0, int[] iArr) {
        C0237w.m1025w(drawable, c0210e0, iArr);
    }

    /* renamed from: c */
    public synchronized Drawable m795c(Context context, int i4) {
        return this.f1083a.m1026j(context, i4);
    }

    /* renamed from: d */
    synchronized Drawable m796d(Context context, int i4, boolean z3) {
        return this.f1083a.m1027k(context, i4, z3);
    }

    /* renamed from: f */
    synchronized ColorStateList m797f(Context context, int i4) {
        return this.f1083a.m1028m(context, i4);
    }

    /* renamed from: g */
    public synchronized void m798g(Context context) {
        this.f1083a.m1030s(context);
    }
}
