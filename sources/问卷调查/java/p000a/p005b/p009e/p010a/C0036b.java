package p000a.p005b.p009e.p010a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.SparseArray;
import java.util.Objects;
import p000a.p005b.p009e.p010a.C0038d;
import p000a.p031h.p032b.C0190e;

/* renamed from: a.b.e.a.b */
/* loaded from: classes.dex */
public class C0036b extends Drawable implements Drawable.Callback {

    /* renamed from: n */
    public static final /* synthetic */ int f228n = 0;

    /* renamed from: b */
    public c f229b;

    /* renamed from: c */
    public Rect f230c;

    /* renamed from: d */
    public Drawable f231d;

    /* renamed from: e */
    public Drawable f232e;

    /* renamed from: g */
    public boolean f234g;

    /* renamed from: i */
    public boolean f236i;

    /* renamed from: j */
    public Runnable f237j;

    /* renamed from: k */
    public long f238k;

    /* renamed from: l */
    public long f239l;

    /* renamed from: m */
    public b f240m;

    /* renamed from: f */
    public int f233f = 255;

    /* renamed from: h */
    public int f235h = -1;

    /* renamed from: a.b.e.a.b$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0036b.this.m141a(true);
            C0036b.this.invalidateSelf();
        }
    }

    /* renamed from: a.b.e.a.b$b */
    public static class b implements Drawable.Callback {

        /* renamed from: b */
        public Drawable.Callback f242b;

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            Drawable.Callback callback = this.f242b;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.f242b;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    /* renamed from: a.b.e.a.b$c */
    public static abstract class c extends Drawable.ConstantState {

        /* renamed from: A */
        public int f243A;

        /* renamed from: B */
        public int f244B;

        /* renamed from: C */
        public boolean f245C;

        /* renamed from: D */
        public ColorFilter f246D;

        /* renamed from: E */
        public boolean f247E;

        /* renamed from: F */
        public ColorStateList f248F;

        /* renamed from: G */
        public PorterDuff.Mode f249G;

        /* renamed from: H */
        public boolean f250H;

        /* renamed from: I */
        public boolean f251I;

        /* renamed from: a */
        public final C0036b f252a;

        /* renamed from: b */
        public Resources f253b;

        /* renamed from: c */
        public int f254c;

        /* renamed from: d */
        public int f255d;

        /* renamed from: e */
        public int f256e;

        /* renamed from: f */
        public SparseArray<Drawable.ConstantState> f257f;

        /* renamed from: g */
        public Drawable[] f258g;

        /* renamed from: h */
        public int f259h;

        /* renamed from: i */
        public boolean f260i;

        /* renamed from: j */
        public boolean f261j;

        /* renamed from: k */
        public Rect f262k;

        /* renamed from: l */
        public boolean f263l;

        /* renamed from: m */
        public boolean f264m;

        /* renamed from: n */
        public int f265n;

        /* renamed from: o */
        public int f266o;

        /* renamed from: p */
        public int f267p;

        /* renamed from: q */
        public int f268q;

        /* renamed from: r */
        public boolean f269r;

        /* renamed from: s */
        public int f270s;

        /* renamed from: t */
        public boolean f271t;

        /* renamed from: u */
        public boolean f272u;

        /* renamed from: v */
        public boolean f273v;

        /* renamed from: w */
        public boolean f274w;

        /* renamed from: x */
        public boolean f275x;

        /* renamed from: y */
        public boolean f276y;

        /* renamed from: z */
        public int f277z;

        public c(c cVar, C0036b c0036b, Resources resources) {
            this.f260i = false;
            this.f263l = false;
            this.f275x = true;
            this.f243A = 0;
            this.f244B = 0;
            this.f252a = c0036b;
            this.f253b = resources != null ? resources : cVar != null ? cVar.f253b : null;
            int i = cVar != null ? cVar.f254c : 0;
            int i2 = C0036b.f228n;
            i = resources != null ? resources.getDisplayMetrics().densityDpi : i;
            i = i == 0 ? 160 : i;
            this.f254c = i;
            if (cVar == null) {
                this.f258g = new Drawable[10];
                this.f259h = 0;
                return;
            }
            this.f255d = cVar.f255d;
            this.f256e = cVar.f256e;
            this.f273v = true;
            this.f274w = true;
            this.f260i = cVar.f260i;
            this.f263l = cVar.f263l;
            this.f275x = cVar.f275x;
            this.f276y = cVar.f276y;
            this.f277z = cVar.f277z;
            this.f243A = cVar.f243A;
            this.f244B = cVar.f244B;
            this.f245C = cVar.f245C;
            this.f246D = cVar.f246D;
            this.f247E = cVar.f247E;
            this.f248F = cVar.f248F;
            this.f249G = cVar.f249G;
            this.f250H = cVar.f250H;
            this.f251I = cVar.f251I;
            if (cVar.f254c == i) {
                if (cVar.f261j) {
                    this.f262k = cVar.f262k != null ? new Rect(cVar.f262k) : null;
                    this.f261j = true;
                }
                if (cVar.f264m) {
                    this.f265n = cVar.f265n;
                    this.f266o = cVar.f266o;
                    this.f267p = cVar.f267p;
                    this.f268q = cVar.f268q;
                    this.f264m = true;
                }
            }
            if (cVar.f269r) {
                this.f270s = cVar.f270s;
                this.f269r = true;
            }
            if (cVar.f271t) {
                this.f272u = cVar.f272u;
                this.f271t = true;
            }
            Drawable[] drawableArr = cVar.f258g;
            this.f258g = new Drawable[drawableArr.length];
            this.f259h = cVar.f259h;
            SparseArray<Drawable.ConstantState> sparseArray = cVar.f257f;
            this.f257f = sparseArray != null ? sparseArray.clone() : new SparseArray<>(this.f259h);
            int i3 = this.f259h;
            for (int i4 = 0; i4 < i3; i4++) {
                if (drawableArr[i4] != null) {
                    Drawable.ConstantState constantState = drawableArr[i4].getConstantState();
                    if (constantState != null) {
                        this.f257f.put(i4, constantState);
                    } else {
                        this.f258g[i4] = drawableArr[i4];
                    }
                }
            }
        }

        /* renamed from: a */
        public final int m144a(Drawable drawable) {
            int i = this.f259h;
            if (i >= this.f258g.length) {
                int i2 = i + 10;
                C0038d.a aVar = (C0038d.a) this;
                Drawable[] drawableArr = new Drawable[i2];
                Drawable[] drawableArr2 = aVar.f258g;
                if (drawableArr2 != null) {
                    System.arraycopy(drawableArr2, 0, drawableArr, 0, i);
                }
                aVar.f258g = drawableArr;
                int[][] iArr = new int[i2][];
                System.arraycopy(aVar.f281J, 0, iArr, 0, i);
                aVar.f281J = iArr;
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f252a);
            this.f258g[i] = drawable;
            this.f259h++;
            this.f256e = drawable.getChangingConfigurations() | this.f256e;
            this.f269r = false;
            this.f271t = false;
            this.f262k = null;
            this.f261j = false;
            this.f264m = false;
            this.f273v = false;
            return i;
        }

        /* renamed from: b */
        public void m145b() {
            this.f264m = true;
            m146c();
            int i = this.f259h;
            Drawable[] drawableArr = this.f258g;
            this.f266o = -1;
            this.f265n = -1;
            this.f268q = 0;
            this.f267p = 0;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f265n) {
                    this.f265n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f266o) {
                    this.f266o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f267p) {
                    this.f267p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f268q) {
                    this.f268q = minimumHeight;
                }
            }
        }

        /* renamed from: c */
        public final void m146c() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f257f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    int iKeyAt = this.f257f.keyAt(i);
                    Drawable.ConstantState constantStateValueAt = this.f257f.valueAt(i);
                    Drawable[] drawableArr = this.f258g;
                    Drawable drawableNewDrawable = constantStateValueAt.newDrawable(this.f253b);
                    drawableNewDrawable.setLayoutDirection(this.f277z);
                    Drawable drawableMutate = drawableNewDrawable.mutate();
                    drawableMutate.setCallback(this.f252a);
                    drawableArr[iKeyAt] = drawableMutate;
                }
                this.f257f = null;
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            int i = this.f259h;
            Drawable[] drawableArr = this.f258g;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                if (drawable == null) {
                    Drawable.ConstantState constantState = this.f257f.get(i2);
                    if (constantState != null && constantState.canApplyTheme()) {
                        return true;
                    }
                } else if (drawable.canApplyTheme()) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: d */
        public final Drawable m147d(int i) {
            int iIndexOfKey;
            Drawable drawable = this.f258g[i];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f257f;
            if (sparseArray == null || (iIndexOfKey = sparseArray.indexOfKey(i)) < 0) {
                return null;
            }
            Drawable drawableNewDrawable = this.f257f.valueAt(iIndexOfKey).newDrawable(this.f253b);
            drawableNewDrawable.setLayoutDirection(this.f277z);
            Drawable drawableMutate = drawableNewDrawable.mutate();
            drawableMutate.setCallback(this.f252a);
            this.f258g[i] = drawableMutate;
            this.f257f.removeAt(iIndexOfKey);
            if (this.f257f.size() == 0) {
                this.f257f = null;
            }
            return drawableMutate;
        }

        /* renamed from: e */
        public abstract void mo137e();

        /* renamed from: f */
        public final void m148f(Resources resources) {
            if (resources != null) {
                this.f253b = resources;
                int i = C0036b.f228n;
                int i2 = resources.getDisplayMetrics().densityDpi;
                if (i2 == 0) {
                    i2 = 160;
                }
                int i3 = this.f254c;
                this.f254c = i2;
                if (i3 != i2) {
                    this.f264m = false;
                    this.f261j = false;
                }
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f255d | this.f256e;
        }
    }

    /* renamed from: a */
    public void m141a(boolean z) {
        boolean z2;
        boolean z3 = true;
        this.f234g = true;
        long jUptimeMillis = SystemClock.uptimeMillis();
        Drawable drawable = this.f231d;
        if (drawable != null) {
            long j = this.f238k;
            if (j == 0) {
                z2 = false;
            } else if (j <= jUptimeMillis) {
                drawable.setAlpha(this.f233f);
                this.f238k = 0L;
                z2 = false;
            } else {
                drawable.setAlpha(((255 - (((int) ((j - jUptimeMillis) * 255)) / this.f229b.f243A)) * this.f233f) / 255);
                z2 = true;
            }
        } else {
            this.f238k = 0L;
            z2 = false;
        }
        Drawable drawable2 = this.f232e;
        if (drawable2 != null) {
            long j2 = this.f239l;
            if (j2 == 0) {
                z3 = z2;
            } else if (j2 <= jUptimeMillis) {
                drawable2.setVisible(false, false);
                this.f232e = null;
                this.f239l = 0L;
                z3 = z2;
            } else {
                drawable2.setAlpha(((((int) ((j2 - jUptimeMillis) * 255)) / this.f229b.f244B) * this.f233f) / 255);
            }
        } else {
            this.f239l = 0L;
            z3 = z2;
        }
        if (z && z3) {
            scheduleSelf(this.f237j, jUptimeMillis + 16);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        c cVar = this.f229b;
        Objects.requireNonNull(cVar);
        if (theme != null) {
            cVar.m146c();
            int i = cVar.f259h;
            Drawable[] drawableArr = cVar.f258g;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2] != null && drawableArr[i2].canApplyTheme()) {
                    drawableArr[i2].applyTheme(theme);
                    cVar.f256e |= drawableArr[i2].getChangingConfigurations();
                }
            }
            cVar.m148f(theme.getResources());
        }
    }

    /* renamed from: b */
    public c mo131b() {
        throw null;
    }

    /* renamed from: c */
    public final void m142c(Drawable drawable) {
        if (this.f240m == null) {
            this.f240m = new b();
        }
        b bVar = this.f240m;
        bVar.f242b = drawable.getCallback();
        drawable.setCallback(bVar);
        try {
            if (this.f229b.f243A <= 0 && this.f234g) {
                drawable.setAlpha(this.f233f);
            }
            c cVar = this.f229b;
            if (cVar.f247E) {
                drawable.setColorFilter(cVar.f246D);
            } else {
                if (cVar.f250H) {
                    drawable.setTintList(cVar.f248F);
                }
                c cVar2 = this.f229b;
                if (cVar2.f251I) {
                    drawable.setTintMode(cVar2.f249G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f229b.f275x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            drawable.setLayoutDirection(getLayoutDirection());
            drawable.setAutoMirrored(this.f229b.f245C);
            Rect rect = this.f230c;
            if (rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            b bVar2 = this.f240m;
            Drawable.Callback callback = bVar2.f242b;
            bVar2.f242b = null;
            drawable.setCallback(callback);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        return this.f229b.canApplyTheme();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m143d(int r10) {
        /*
            r9 = this;
            int r0 = r9.f235h
            r1 = 0
            if (r10 != r0) goto L6
            return r1
        L6:
            long r2 = android.os.SystemClock.uptimeMillis()
            a.b.e.a.b$c r0 = r9.f229b
            int r0 = r0.f244B
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L2e
            android.graphics.drawable.Drawable r0 = r9.f232e
            if (r0 == 0) goto L1a
            r0.setVisible(r1, r1)
        L1a:
            android.graphics.drawable.Drawable r0 = r9.f231d
            if (r0 == 0) goto L29
            r9.f232e = r0
            a.b.e.a.b$c r0 = r9.f229b
            int r0 = r0.f244B
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f239l = r0
            goto L35
        L29:
            r9.f232e = r4
            r9.f239l = r5
            goto L35
        L2e:
            android.graphics.drawable.Drawable r0 = r9.f231d
            if (r0 == 0) goto L35
            r0.setVisible(r1, r1)
        L35:
            if (r10 < 0) goto L55
            a.b.e.a.b$c r0 = r9.f229b
            int r1 = r0.f259h
            if (r10 >= r1) goto L55
            android.graphics.drawable.Drawable r0 = r0.m147d(r10)
            r9.f231d = r0
            r9.f235h = r10
            if (r0 == 0) goto L5a
            a.b.e.a.b$c r10 = r9.f229b
            int r10 = r10.f243A
            if (r10 <= 0) goto L51
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f238k = r2
        L51:
            r9.m142c(r0)
            goto L5a
        L55:
            r9.f231d = r4
            r10 = -1
            r9.f235h = r10
        L5a:
            long r0 = r9.f238k
            int r10 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            r0 = 1
            if (r10 != 0) goto L67
            long r1 = r9.f239l
            int r10 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r10 == 0) goto L79
        L67:
            java.lang.Runnable r10 = r9.f237j
            if (r10 != 0) goto L73
            a.b.e.a.b$a r10 = new a.b.e.a.b$a
            r10.<init>()
            r9.f237j = r10
            goto L76
        L73:
            r9.unscheduleSelf(r10)
        L76:
            r9.m141a(r0)
        L79:
            r9.invalidateSelf()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p005b.p009e.p010a.C0036b.m143d(int):boolean");
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f231d;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f232e;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    /* renamed from: e */
    public void mo132e(c cVar) {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f233f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f229b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        c cVar = this.f229b;
        boolean z = true;
        if (!cVar.f273v) {
            cVar.m146c();
            cVar.f273v = true;
            int i = cVar.f259h;
            Drawable[] drawableArr = cVar.f258g;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    cVar.f274w = true;
                    break;
                }
                if (drawableArr[i2].getConstantState() == null) {
                    cVar.f274w = false;
                    z = false;
                    break;
                }
                i2++;
            }
        } else {
            z = cVar.f274w;
        }
        if (!z) {
            return null;
        }
        this.f229b.f255d = getChangingConfigurations();
        return this.f229b;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f231d;
    }

    @Override // android.graphics.drawable.Drawable
    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f230c;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        c cVar = this.f229b;
        if (cVar.f263l) {
            if (!cVar.f264m) {
                cVar.m145b();
            }
            return cVar.f266o;
        }
        Drawable drawable = this.f231d;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        c cVar = this.f229b;
        if (cVar.f263l) {
            if (!cVar.f264m) {
                cVar.m145b();
            }
            return cVar.f265n;
        }
        Drawable drawable = this.f231d;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        c cVar = this.f229b;
        if (cVar.f263l) {
            if (!cVar.f264m) {
                cVar.m145b();
            }
            return cVar.f268q;
        }
        Drawable drawable = this.f231d;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        c cVar = this.f229b;
        if (cVar.f263l) {
            if (!cVar.f264m) {
                cVar.m145b();
            }
            return cVar.f267p;
        }
        Drawable drawable = this.f231d;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f231d;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        c cVar = this.f229b;
        if (cVar.f269r) {
            return cVar.f270s;
        }
        cVar.m146c();
        int i = cVar.f259h;
        Drawable[] drawableArr = cVar.f258g;
        int opacity = i > 0 ? drawableArr[0].getOpacity() : -2;
        for (int i2 = 1; i2 < i; i2++) {
            opacity = Drawable.resolveOpacity(opacity, drawableArr[i2].getOpacity());
        }
        cVar.f270s = opacity;
        cVar.f269r = true;
        return opacity;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Drawable drawable = this.f231d;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        boolean padding;
        c cVar = this.f229b;
        Rect rect2 = null;
        boolean z = false;
        if (!cVar.f260i) {
            Rect rect3 = cVar.f262k;
            if (rect3 != null || cVar.f261j) {
                rect2 = rect3;
            } else {
                cVar.m146c();
                Rect rect4 = new Rect();
                int i = cVar.f259h;
                Drawable[] drawableArr = cVar.f258g;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2].getPadding(rect4)) {
                        if (rect2 == null) {
                            rect2 = new Rect(0, 0, 0, 0);
                        }
                        int i3 = rect4.left;
                        if (i3 > rect2.left) {
                            rect2.left = i3;
                        }
                        int i4 = rect4.top;
                        if (i4 > rect2.top) {
                            rect2.top = i4;
                        }
                        int i5 = rect4.right;
                        if (i5 > rect2.right) {
                            rect2.right = i5;
                        }
                        int i6 = rect4.bottom;
                        if (i6 > rect2.bottom) {
                            rect2.bottom = i6;
                        }
                    }
                }
                cVar.f261j = true;
                cVar.f262k = rect2;
            }
        }
        if (rect2 != null) {
            rect.set(rect2);
            padding = (((rect2.left | rect2.top) | rect2.bottom) | rect2.right) != 0;
        } else {
            Drawable drawable = this.f231d;
            padding = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (this.f229b.f245C && getLayoutDirection() == 1) {
            z = true;
        }
        if (z) {
            int i7 = rect.left;
            rect.left = rect.right;
            rect.right = i7;
        }
        return padding;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        c cVar = this.f229b;
        if (cVar != null) {
            cVar.f269r = false;
            cVar.f271t = false;
        }
        if (drawable != this.f231d || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.f229b.f245C;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.f232e;
        boolean z2 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f232e = null;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.f231d;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f234g) {
                this.f231d.setAlpha(this.f233f);
            }
        }
        if (this.f239l != 0) {
            this.f239l = 0L;
            z = true;
        }
        if (this.f238k != 0) {
            this.f238k = 0L;
        } else {
            z2 = z;
        }
        if (z2) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f236i && super.mutate() == this) {
            c cVarMo131b = mo131b();
            cVarMo131b.mo137e();
            mo132e(cVarMo131b);
            this.f236i = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f232e;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f231d;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i) {
        c cVar = this.f229b;
        int i2 = this.f235h;
        int i3 = cVar.f259h;
        Drawable[] drawableArr = cVar.f258g;
        boolean z = false;
        for (int i4 = 0; i4 < i3; i4++) {
            if (drawableArr[i4] != null) {
                boolean layoutDirection = drawableArr[i4].setLayoutDirection(i);
                if (i4 == i2) {
                    z = layoutDirection;
                }
            }
        }
        cVar.f277z = i;
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        Drawable drawable = this.f232e;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        Drawable drawable2 = this.f231d;
        if (drawable2 != null) {
            return drawable2.setLevel(i);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f232e;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f231d;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (drawable != this.f231d || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.f234g && this.f233f == i) {
            return;
        }
        this.f234g = true;
        this.f233f = i;
        Drawable drawable = this.f231d;
        if (drawable != null) {
            if (this.f238k == 0) {
                drawable.setAlpha(i);
            } else {
                m141a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        c cVar = this.f229b;
        if (cVar.f245C != z) {
            cVar.f245C = z;
            Drawable drawable = this.f231d;
            if (drawable != null) {
                drawable.setAutoMirrored(z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        c cVar = this.f229b;
        cVar.f247E = true;
        if (cVar.f246D != colorFilter) {
            cVar.f246D = colorFilter;
            Drawable drawable = this.f231d;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        c cVar = this.f229b;
        if (cVar.f275x != z) {
            cVar.f275x = z;
            Drawable drawable = this.f231d;
            if (drawable != null) {
                drawable.setDither(z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f2, float f3) {
        Drawable drawable = this.f231d;
        if (drawable != null) {
            drawable.setHotspot(f2, f3);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        Rect rect = this.f230c;
        if (rect == null) {
            this.f230c = new Rect(i, i2, i3, i4);
        } else {
            rect.set(i, i2, i3, i4);
        }
        Drawable drawable = this.f231d;
        if (drawable != null) {
            drawable.setHotspotBounds(i, i2, i3, i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        c cVar = this.f229b;
        cVar.f250H = true;
        if (cVar.f248F != colorStateList) {
            cVar.f248F = colorStateList;
            C0190e.m701N(this.f231d, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.f229b;
        cVar.f251I = true;
        if (cVar.f249G != mode) {
            cVar.f249G = mode;
            C0190e.m702O(this.f231d, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.f232e;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.f231d;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.f231d || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }
}
