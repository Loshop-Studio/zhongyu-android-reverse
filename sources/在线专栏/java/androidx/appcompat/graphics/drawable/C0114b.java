package androidx.appcompat.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import java.lang.reflect.InvocationTargetException;
import p156u.C3403a;

/* renamed from: androidx.appcompat.graphics.drawable.b */
/* loaded from: classes.dex */
class C0114b extends Drawable implements Drawable.Callback {

    /* renamed from: a */
    private d f439a;

    /* renamed from: b */
    private Rect f440b;

    /* renamed from: c */
    private Drawable f441c;

    /* renamed from: d */
    private Drawable f442d;

    /* renamed from: f */
    private boolean f444f;

    /* renamed from: h */
    private boolean f446h;

    /* renamed from: i */
    private Runnable f447i;

    /* renamed from: j */
    private long f448j;

    /* renamed from: k */
    private long f449k;

    /* renamed from: l */
    private c f450l;

    /* renamed from: e */
    private int f443e = 255;

    /* renamed from: g */
    private int f445g = -1;

    /* renamed from: androidx.appcompat.graphics.drawable.b$a */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0114b.this.m372a(true);
            C0114b.this.invalidateSelf();
        }
    }

    /* renamed from: androidx.appcompat.graphics.drawable.b$b */
    private static class b {
        /* renamed from: a */
        public static boolean m376a(Drawable.ConstantState constantState) {
            return constantState.canApplyTheme();
        }

        /* renamed from: b */
        public static void m377b(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }

        /* renamed from: c */
        public static Resources m378c(Resources.Theme theme) {
            return theme.getResources();
        }
    }

    /* renamed from: androidx.appcompat.graphics.drawable.b$c */
    static class c implements Drawable.Callback {

        /* renamed from: a */
        private Drawable.Callback f452a;

        c() {
        }

        /* renamed from: a */
        public Drawable.Callback m379a() {
            Drawable.Callback callback = this.f452a;
            this.f452a = null;
            return callback;
        }

        /* renamed from: b */
        public c m380b(Drawable.Callback callback) {
            this.f452a = callback;
            return this;
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j4) {
            Drawable.Callback callback = this.f452a;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j4);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.f452a;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    /* renamed from: androidx.appcompat.graphics.drawable.b$d */
    static abstract class d extends Drawable.ConstantState {

        /* renamed from: A */
        int f453A;

        /* renamed from: B */
        int f454B;

        /* renamed from: C */
        boolean f455C;

        /* renamed from: D */
        ColorFilter f456D;

        /* renamed from: E */
        boolean f457E;

        /* renamed from: F */
        ColorStateList f458F;

        /* renamed from: G */
        PorterDuff.Mode f459G;

        /* renamed from: H */
        boolean f460H;

        /* renamed from: I */
        boolean f461I;

        /* renamed from: a */
        final C0114b f462a;

        /* renamed from: b */
        Resources f463b;

        /* renamed from: c */
        int f464c;

        /* renamed from: d */
        int f465d;

        /* renamed from: e */
        int f466e;

        /* renamed from: f */
        SparseArray<Drawable.ConstantState> f467f;

        /* renamed from: g */
        Drawable[] f468g;

        /* renamed from: h */
        int f469h;

        /* renamed from: i */
        boolean f470i;

        /* renamed from: j */
        boolean f471j;

        /* renamed from: k */
        Rect f472k;

        /* renamed from: l */
        boolean f473l;

        /* renamed from: m */
        boolean f474m;

        /* renamed from: n */
        int f475n;

        /* renamed from: o */
        int f476o;

        /* renamed from: p */
        int f477p;

        /* renamed from: q */
        int f478q;

        /* renamed from: r */
        boolean f479r;

        /* renamed from: s */
        int f480s;

        /* renamed from: t */
        boolean f481t;

        /* renamed from: u */
        boolean f482u;

        /* renamed from: v */
        boolean f483v;

        /* renamed from: w */
        boolean f484w;

        /* renamed from: x */
        boolean f485x;

        /* renamed from: y */
        boolean f486y;

        /* renamed from: z */
        int f487z;

        d(d dVar, C0114b c0114b, Resources resources) {
            this.f470i = false;
            this.f473l = false;
            this.f485x = true;
            this.f453A = 0;
            this.f454B = 0;
            this.f462a = c0114b;
            this.f463b = resources != null ? resources : dVar != null ? dVar.f463b : null;
            int iM371f = C0114b.m371f(resources, dVar != null ? dVar.f464c : 0);
            this.f464c = iM371f;
            if (dVar == null) {
                this.f468g = new Drawable[10];
                this.f469h = 0;
                return;
            }
            this.f465d = dVar.f465d;
            this.f466e = dVar.f466e;
            this.f483v = true;
            this.f484w = true;
            this.f470i = dVar.f470i;
            this.f473l = dVar.f473l;
            this.f485x = dVar.f485x;
            this.f486y = dVar.f486y;
            this.f487z = dVar.f487z;
            this.f453A = dVar.f453A;
            this.f454B = dVar.f454B;
            this.f455C = dVar.f455C;
            this.f456D = dVar.f456D;
            this.f457E = dVar.f457E;
            this.f458F = dVar.f458F;
            this.f459G = dVar.f459G;
            this.f460H = dVar.f460H;
            this.f461I = dVar.f461I;
            if (dVar.f464c == iM371f) {
                if (dVar.f471j) {
                    this.f472k = dVar.f472k != null ? new Rect(dVar.f472k) : null;
                    this.f471j = true;
                }
                if (dVar.f474m) {
                    this.f475n = dVar.f475n;
                    this.f476o = dVar.f476o;
                    this.f477p = dVar.f477p;
                    this.f478q = dVar.f478q;
                    this.f474m = true;
                }
            }
            if (dVar.f479r) {
                this.f480s = dVar.f480s;
                this.f479r = true;
            }
            if (dVar.f481t) {
                this.f482u = dVar.f482u;
                this.f481t = true;
            }
            Drawable[] drawableArr = dVar.f468g;
            this.f468g = new Drawable[drawableArr.length];
            this.f469h = dVar.f469h;
            SparseArray<Drawable.ConstantState> sparseArray = dVar.f467f;
            if (sparseArray != null) {
                this.f467f = sparseArray.clone();
            } else {
                this.f467f = new SparseArray<>(this.f469h);
            }
            int i4 = this.f469h;
            for (int i5 = 0; i5 < i4; i5++) {
                if (drawableArr[i5] != null) {
                    Drawable.ConstantState constantState = drawableArr[i5].getConstantState();
                    if (constantState != null) {
                        this.f467f.put(i5, constantState);
                    } else {
                        this.f468g[i5] = drawableArr[i5];
                    }
                }
            }
        }

        /* renamed from: e */
        private void m381e() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f467f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i4 = 0; i4 < size; i4++) {
                    this.f468g[this.f467f.keyAt(i4)] = m382s(this.f467f.valueAt(i4).newDrawable(this.f463b));
                }
                this.f467f = null;
            }
        }

        /* renamed from: s */
        private Drawable m382s(Drawable drawable) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            if (Build.VERSION.SDK_INT >= 23) {
                C3403a.m10396m(drawable, this.f487z);
            }
            Drawable drawableMutate = drawable.mutate();
            drawableMutate.setCallback(this.f462a);
            return drawableMutate;
        }

        /* renamed from: a */
        public final int m383a(Drawable drawable) {
            int i4 = this.f469h;
            if (i4 >= this.f468g.length) {
                mo396o(i4, i4 + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f462a);
            this.f468g[i4] = drawable;
            this.f469h++;
            this.f466e = drawable.getChangingConfigurations() | this.f466e;
            m397p();
            this.f472k = null;
            this.f471j = false;
            this.f474m = false;
            this.f483v = false;
            return i4;
        }

        /* renamed from: b */
        final void m384b(Resources.Theme theme) {
            if (theme != null) {
                m381e();
                int i4 = this.f469h;
                Drawable[] drawableArr = this.f468g;
                for (int i5 = 0; i5 < i4; i5++) {
                    if (drawableArr[i5] != null && C3403a.m10385b(drawableArr[i5])) {
                        C3403a.m10384a(drawableArr[i5], theme);
                        this.f466e |= drawableArr[i5].getChangingConfigurations();
                    }
                }
                m404y(b.m378c(theme));
            }
        }

        /* renamed from: c */
        public boolean m385c() {
            if (this.f483v) {
                return this.f484w;
            }
            m381e();
            this.f483v = true;
            int i4 = this.f469h;
            Drawable[] drawableArr = this.f468g;
            for (int i5 = 0; i5 < i4; i5++) {
                if (drawableArr[i5].getConstantState() == null) {
                    this.f484w = false;
                    return false;
                }
            }
            this.f484w = true;
            return true;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            int i4 = this.f469h;
            Drawable[] drawableArr = this.f468g;
            for (int i5 = 0; i5 < i4; i5++) {
                Drawable drawable = drawableArr[i5];
                if (drawable == null) {
                    Drawable.ConstantState constantState = this.f467f.get(i5);
                    if (constantState != null && b.m376a(constantState)) {
                        return true;
                    }
                } else if (C3403a.m10385b(drawable)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: d */
        protected void m386d() {
            this.f474m = true;
            m381e();
            int i4 = this.f469h;
            Drawable[] drawableArr = this.f468g;
            this.f476o = -1;
            this.f475n = -1;
            this.f478q = 0;
            this.f477p = 0;
            for (int i5 = 0; i5 < i4; i5++) {
                Drawable drawable = drawableArr[i5];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f475n) {
                    this.f475n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f476o) {
                    this.f476o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f477p) {
                    this.f477p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f478q) {
                    this.f478q = minimumHeight;
                }
            }
        }

        /* renamed from: f */
        final int m387f() {
            return this.f468g.length;
        }

        /* renamed from: g */
        public final Drawable m388g(int i4) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            int iIndexOfKey;
            Drawable drawable = this.f468g[i4];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f467f;
            if (sparseArray == null || (iIndexOfKey = sparseArray.indexOfKey(i4)) < 0) {
                return null;
            }
            Drawable drawableM382s = m382s(this.f467f.valueAt(iIndexOfKey).newDrawable(this.f463b));
            this.f468g[i4] = drawableM382s;
            this.f467f.removeAt(iIndexOfKey);
            if (this.f467f.size() == 0) {
                this.f467f = null;
            }
            return drawableM382s;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f465d | this.f466e;
        }

        /* renamed from: h */
        public final int m389h() {
            return this.f469h;
        }

        /* renamed from: i */
        public final int m390i() {
            if (!this.f474m) {
                m386d();
            }
            return this.f476o;
        }

        /* renamed from: j */
        public final int m391j() {
            if (!this.f474m) {
                m386d();
            }
            return this.f478q;
        }

        /* renamed from: k */
        public final int m392k() {
            if (!this.f474m) {
                m386d();
            }
            return this.f477p;
        }

        /* renamed from: l */
        public final Rect m393l() {
            Rect rect = null;
            if (this.f470i) {
                return null;
            }
            Rect rect2 = this.f472k;
            if (rect2 != null || this.f471j) {
                return rect2;
            }
            m381e();
            Rect rect3 = new Rect();
            int i4 = this.f469h;
            Drawable[] drawableArr = this.f468g;
            for (int i5 = 0; i5 < i4; i5++) {
                if (drawableArr[i5].getPadding(rect3)) {
                    if (rect == null) {
                        rect = new Rect(0, 0, 0, 0);
                    }
                    int i6 = rect3.left;
                    if (i6 > rect.left) {
                        rect.left = i6;
                    }
                    int i7 = rect3.top;
                    if (i7 > rect.top) {
                        rect.top = i7;
                    }
                    int i8 = rect3.right;
                    if (i8 > rect.right) {
                        rect.right = i8;
                    }
                    int i9 = rect3.bottom;
                    if (i9 > rect.bottom) {
                        rect.bottom = i9;
                    }
                }
            }
            this.f471j = true;
            this.f472k = rect;
            return rect;
        }

        /* renamed from: m */
        public final int m394m() {
            if (!this.f474m) {
                m386d();
            }
            return this.f475n;
        }

        /* renamed from: n */
        public final int m395n() {
            if (this.f479r) {
                return this.f480s;
            }
            m381e();
            int i4 = this.f469h;
            Drawable[] drawableArr = this.f468g;
            int opacity = i4 > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i5 = 1; i5 < i4; i5++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i5].getOpacity());
            }
            this.f480s = opacity;
            this.f479r = true;
            return opacity;
        }

        /* renamed from: o */
        public void mo396o(int i4, int i5) {
            Drawable[] drawableArr = new Drawable[i5];
            Drawable[] drawableArr2 = this.f468g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i4);
            }
            this.f468g = drawableArr;
        }

        /* renamed from: p */
        void m397p() {
            this.f479r = false;
            this.f481t = false;
        }

        /* renamed from: q */
        public final boolean m398q() {
            return this.f473l;
        }

        /* renamed from: r */
        abstract void mo364r();

        /* renamed from: t */
        public final void m399t(boolean z3) {
            this.f473l = z3;
        }

        /* renamed from: u */
        public final void m400u(int i4) {
            this.f453A = i4;
        }

        /* renamed from: v */
        public final void m401v(int i4) {
            this.f454B = i4;
        }

        /* renamed from: w */
        final boolean m402w(int i4, int i5) {
            int i6 = this.f469h;
            Drawable[] drawableArr = this.f468g;
            boolean z3 = false;
            for (int i7 = 0; i7 < i6; i7++) {
                if (drawableArr[i7] != null) {
                    boolean zM10396m = Build.VERSION.SDK_INT >= 23 ? C3403a.m10396m(drawableArr[i7], i4) : false;
                    if (i7 == i5) {
                        z3 = zM10396m;
                    }
                }
            }
            this.f487z = i4;
            return z3;
        }

        /* renamed from: x */
        public final void m403x(boolean z3) {
            this.f470i = z3;
        }

        /* renamed from: y */
        final void m404y(Resources resources) {
            if (resources != null) {
                this.f463b = resources;
                int iM371f = C0114b.m371f(resources, this.f464c);
                int i4 = this.f464c;
                this.f464c = iM371f;
                if (i4 != iM371f) {
                    this.f474m = false;
                    this.f471j = false;
                }
            }
        }
    }

    C0114b() {
    }

    /* renamed from: d */
    private void m369d(Drawable drawable) {
        if (this.f450l == null) {
            this.f450l = new c();
        }
        drawable.setCallback(this.f450l.m380b(drawable.getCallback()));
        try {
            if (this.f439a.f453A <= 0 && this.f444f) {
                drawable.setAlpha(this.f443e);
            }
            d dVar = this.f439a;
            if (dVar.f457E) {
                drawable.setColorFilter(dVar.f456D);
            } else {
                if (dVar.f460H) {
                    C3403a.m10398o(drawable, dVar.f458F);
                }
                d dVar2 = this.f439a;
                if (dVar2.f461I) {
                    C3403a.m10399p(drawable, dVar2.f459G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f439a.f485x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                C3403a.m10396m(drawable, C3403a.m10389f(this));
            }
            C3403a.m10393j(drawable, this.f439a.f455C);
            Rect rect = this.f440b;
            if (rect != null) {
                C3403a.m10395l(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            drawable.setCallback(this.f450l.m379a());
        }
    }

    /* renamed from: e */
    private boolean m370e() {
        return isAutoMirrored() && C3403a.m10389f(this) == 1;
    }

    /* renamed from: f */
    static int m371f(Resources resources, int i4) {
        if (resources != null) {
            i4 = resources.getDisplayMetrics().densityDpi;
        }
        if (i4 == 0) {
            return 160;
        }
        return i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void m372a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f444f = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f441c
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r7 = 0
            if (r3 == 0) goto L38
            long r9 = r13.f448j
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 == 0) goto L3a
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L22
            int r9 = r13.f443e
            r3.setAlpha(r9)
            r13.f448j = r7
            goto L3a
        L22:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r10 = (int) r9
            androidx.appcompat.graphics.drawable.b$d r9 = r13.f439a
            int r9 = r9.f453A
            int r10 = r10 / r9
            int r9 = 255 - r10
            int r10 = r13.f443e
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = 1
            goto L3b
        L38:
            r13.f448j = r7
        L3a:
            r3 = 0
        L3b:
            android.graphics.drawable.Drawable r9 = r13.f442d
            if (r9 == 0) goto L65
            long r10 = r13.f449k
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 == 0) goto L67
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L52
            r9.setVisible(r6, r6)
            r0 = 0
            r13.f442d = r0
            r13.f449k = r7
            goto L67
        L52:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            androidx.appcompat.graphics.drawable.b$d r4 = r13.f439a
            int r4 = r4.f454B
            int r3 = r3 / r4
            int r4 = r13.f443e
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L68
        L65:
            r13.f449k = r7
        L67:
            r0 = r3
        L68:
            if (r14 == 0) goto L74
            if (r0 == 0) goto L74
            java.lang.Runnable r14 = r13.f447i
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L74:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.graphics.drawable.C0114b.m372a(boolean):void");
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        this.f439a.m384b(theme);
    }

    /* renamed from: b */
    d mo349b() {
        throw null;
    }

    /* renamed from: c */
    int m373c() {
        return this.f445g;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        return this.f439a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f441c;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f442d;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    boolean m374g(int r10) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            r9 = this;
            int r0 = r9.f445g
            r1 = 0
            if (r10 != r0) goto L6
            return r1
        L6:
            long r2 = android.os.SystemClock.uptimeMillis()
            androidx.appcompat.graphics.drawable.b$d r0 = r9.f439a
            int r0 = r0.f454B
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L2e
            android.graphics.drawable.Drawable r0 = r9.f442d
            if (r0 == 0) goto L1a
            r0.setVisible(r1, r1)
        L1a:
            android.graphics.drawable.Drawable r0 = r9.f441c
            if (r0 == 0) goto L29
            r9.f442d = r0
            androidx.appcompat.graphics.drawable.b$d r0 = r9.f439a
            int r0 = r0.f454B
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f449k = r0
            goto L35
        L29:
            r9.f442d = r4
            r9.f449k = r5
            goto L35
        L2e:
            android.graphics.drawable.Drawable r0 = r9.f441c
            if (r0 == 0) goto L35
            r0.setVisible(r1, r1)
        L35:
            if (r10 < 0) goto L55
            androidx.appcompat.graphics.drawable.b$d r0 = r9.f439a
            int r1 = r0.f469h
            if (r10 >= r1) goto L55
            android.graphics.drawable.Drawable r0 = r0.m388g(r10)
            r9.f441c = r0
            r9.f445g = r10
            if (r0 == 0) goto L5a
            androidx.appcompat.graphics.drawable.b$d r10 = r9.f439a
            int r10 = r10.f453A
            if (r10 <= 0) goto L51
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f448j = r2
        L51:
            r9.m369d(r0)
            goto L5a
        L55:
            r9.f441c = r4
            r10 = -1
            r9.f445g = r10
        L5a:
            long r0 = r9.f448j
            r10 = 1
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 != 0) goto L67
            long r0 = r9.f449k
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 == 0) goto L79
        L67:
            java.lang.Runnable r0 = r9.f447i
            if (r0 != 0) goto L73
            androidx.appcompat.graphics.drawable.b$a r0 = new androidx.appcompat.graphics.drawable.b$a
            r0.<init>()
            r9.f447i = r0
            goto L76
        L73:
            r9.unscheduleSelf(r0)
        L76:
            r9.m372a(r10)
        L79:
            r9.invalidateSelf()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.graphics.drawable.C0114b.m374g(int):boolean");
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f443e;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f439a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (!this.f439a.m385c()) {
            return null;
        }
        this.f439a.f465d = getChangingConfigurations();
        return this.f439a;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f441c;
    }

    @Override // android.graphics.drawable.Drawable
    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f440b;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.f439a.m398q()) {
            return this.f439a.m390i();
        }
        Drawable drawable = this.f441c;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.f439a.m398q()) {
            return this.f439a.m394m();
        }
        Drawable drawable = this.f441c;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        if (this.f439a.m398q()) {
            return this.f439a.m391j();
        }
        Drawable drawable = this.f441c;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        if (this.f439a.m398q()) {
            return this.f439a.m392k();
        }
        Drawable drawable = this.f441c;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f441c;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.f439a.m395n();
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Drawable drawable = this.f441c;
        if (drawable != null) {
            b.m377b(drawable, outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        boolean padding;
        Rect rectM393l = this.f439a.m393l();
        if (rectM393l != null) {
            rect.set(rectM393l);
            padding = (rectM393l.right | ((rectM393l.left | rectM393l.top) | rectM393l.bottom)) != 0;
        } else {
            Drawable drawable = this.f441c;
            padding = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (m370e()) {
            int i4 = rect.left;
            rect.left = rect.right;
            rect.right = i4;
        }
        return padding;
    }

    /* renamed from: h */
    void mo350h(d dVar) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        this.f439a = dVar;
        int i4 = this.f445g;
        if (i4 >= 0) {
            Drawable drawableM388g = dVar.m388g(i4);
            this.f441c = drawableM388g;
            if (drawableM388g != null) {
                m369d(drawableM388g);
            }
        }
        this.f442d = null;
    }

    /* renamed from: i */
    final void m375i(Resources resources) {
        this.f439a.m404y(resources);
    }

    public void invalidateDrawable(Drawable drawable) {
        d dVar = this.f439a;
        if (dVar != null) {
            dVar.m397p();
        }
        if (drawable != this.f441c || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.f439a.f455C;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z3;
        Drawable drawable = this.f442d;
        boolean z4 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f442d = null;
            z3 = true;
        } else {
            z3 = false;
        }
        Drawable drawable2 = this.f441c;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f444f) {
                this.f441c.setAlpha(this.f443e);
            }
        }
        if (this.f449k != 0) {
            this.f449k = 0L;
            z3 = true;
        }
        if (this.f448j != 0) {
            this.f448j = 0L;
        } else {
            z4 = z3;
        }
        if (z4) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (!this.f446h && super.mutate() == this) {
            d dVarMo349b = mo349b();
            dVarMo349b.mo364r();
            mo350h(dVarMo349b);
            this.f446h = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f442d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f441c;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i4) {
        return this.f439a.m402w(i4, m373c());
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i4) {
        Drawable drawable = this.f442d;
        if (drawable != null) {
            return drawable.setLevel(i4);
        }
        Drawable drawable2 = this.f441c;
        if (drawable2 != null) {
            return drawable2.setLevel(i4);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f442d;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f441c;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j4) {
        if (drawable != this.f441c || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j4);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i4) {
        if (this.f444f && this.f443e == i4) {
            return;
        }
        this.f444f = true;
        this.f443e = i4;
        Drawable drawable = this.f441c;
        if (drawable != null) {
            if (this.f448j == 0) {
                drawable.setAlpha(i4);
            } else {
                m372a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z3) {
        d dVar = this.f439a;
        if (dVar.f455C != z3) {
            dVar.f455C = z3;
            Drawable drawable = this.f441c;
            if (drawable != null) {
                C3403a.m10393j(drawable, z3);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        d dVar = this.f439a;
        dVar.f457E = true;
        if (dVar.f456D != colorFilter) {
            dVar.f456D = colorFilter;
            Drawable drawable = this.f441c;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z3) {
        d dVar = this.f439a;
        if (dVar.f485x != z3) {
            dVar.f485x = z3;
            Drawable drawable = this.f441c;
            if (drawable != null) {
                drawable.setDither(z3);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f4, float f5) {
        Drawable drawable = this.f441c;
        if (drawable != null) {
            C3403a.m10394k(drawable, f4, f5);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i4, int i5, int i6, int i7) {
        Rect rect = this.f440b;
        if (rect == null) {
            this.f440b = new Rect(i4, i5, i6, i7);
        } else {
            rect.set(i4, i5, i6, i7);
        }
        Drawable drawable = this.f441c;
        if (drawable != null) {
            C3403a.m10395l(drawable, i4, i5, i6, i7);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        d dVar = this.f439a;
        dVar.f460H = true;
        if (dVar.f458F != colorStateList) {
            dVar.f458F = colorStateList;
            C3403a.m10398o(this.f441c, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        d dVar = this.f439a;
        dVar.f461I = true;
        if (dVar.f459G != mode) {
            dVar.f459G = mode;
            C3403a.m10399p(this.f441c, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z3, boolean z4) {
        boolean visible = super.setVisible(z3, z4);
        Drawable drawable = this.f442d;
        if (drawable != null) {
            drawable.setVisible(z3, z4);
        }
        Drawable drawable2 = this.f441c;
        if (drawable2 != null) {
            drawable2.setVisible(z3, z4);
        }
        return visible;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.f441c || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }
}
