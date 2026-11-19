package p000a.p060o.p061b;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: a.o.b.o */
/* loaded from: classes.dex */
public class C0392o extends RecyclerView.AbstractC0548v {

    /* renamed from: k */
    public PointF f2329k;

    /* renamed from: l */
    public final DisplayMetrics f2330l;

    /* renamed from: n */
    public float f2332n;

    /* renamed from: i */
    public final LinearInterpolator f2327i = new LinearInterpolator();

    /* renamed from: j */
    public final DecelerateInterpolator f2328j = new DecelerateInterpolator();

    /* renamed from: m */
    public boolean f2331m = false;

    /* renamed from: o */
    public int f2333o = 0;

    /* renamed from: p */
    public int f2334p = 0;

    public C0392o(Context context) {
        this.f2330l = context.getResources().getDisplayMetrics();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0015  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0548v
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo1380c(android.view.View r11, androidx.recyclerview.widget.RecyclerView.C0549w r12, androidx.recyclerview.widget.RecyclerView.AbstractC0548v.a r13) {
        /*
            r10 = this;
            android.graphics.PointF r12 = r10.f2329k
            r0 = 1
            r1 = -1
            r2 = 0
            r3 = 0
            if (r12 == 0) goto L15
            float r12 = r12.x
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto Lf
            goto L15
        Lf:
            if (r12 <= 0) goto L13
            r9 = r0
            goto L16
        L13:
            r9 = r1
            goto L16
        L15:
            r9 = r3
        L16:
            androidx.recyclerview.widget.RecyclerView$l r12 = r10.f3393c
            if (r12 == 0) goto L47
            boolean r4 = r12.mo1784e()
            if (r4 != 0) goto L21
            goto L47
        L21:
            android.view.ViewGroup$LayoutParams r4 = r11.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$m r4 = (androidx.recyclerview.widget.RecyclerView.C0539m) r4
            int r5 = r12.m1913D(r11)
            int r6 = r4.leftMargin
            int r5 = r5 - r6
            int r6 = r12.m1919G(r11)
            int r4 = r4.rightMargin
            int r6 = r6 + r4
            int r7 = r12.m1933O()
            int r4 = r12.f3363p
            int r12 = r12.m1934P()
            int r8 = r4 - r12
            r4 = r10
            int r12 = r4.m1381e(r5, r6, r7, r8, r9)
            goto L48
        L47:
            r12 = r3
        L48:
            android.graphics.PointF r4 = r10.f2329k
            if (r4 == 0) goto L59
            float r4 = r4.y
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 != 0) goto L53
            goto L59
        L53:
            if (r2 <= 0) goto L57
            r9 = r0
            goto L5a
        L57:
            r9 = r1
            goto L5a
        L59:
            r9 = r3
        L5a:
            androidx.recyclerview.widget.RecyclerView$l r0 = r10.f3393c
            if (r0 == 0) goto L8c
            boolean r1 = r0.mo1786f()
            if (r1 != 0) goto L65
            goto L8c
        L65:
            android.view.ViewGroup$LayoutParams r1 = r11.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$m r1 = (androidx.recyclerview.widget.RecyclerView.C0539m) r1
            int r2 = r0.m1921H(r11)
            int r3 = r1.topMargin
            int r5 = r2 - r3
            int r11 = r0.m1911B(r11)
            int r1 = r1.bottomMargin
            int r6 = r11 + r1
            int r7 = r0.m1936Q()
            int r11 = r0.f3364q
            int r0 = r0.m1932N()
            int r8 = r11 - r0
            r4 = r10
            int r3 = r4.m1381e(r5, r6, r7, r8, r9)
        L8c:
            int r11 = r12 * r12
            int r0 = r3 * r3
            int r0 = r0 + r11
            double r0 = (double) r0
            double r0 = java.lang.Math.sqrt(r0)
            int r11 = (int) r0
            int r11 = r10.m1383g(r11)
            double r0 = (double) r11
            r4 = 4599717252057688074(0x3fd57a786c22680a, double:0.3356)
            double r0 = r0 / r4
            double r0 = java.lang.Math.ceil(r0)
            int r11 = (int) r0
            if (r11 <= 0) goto Lb0
            int r12 = -r12
            int r0 = -r3
            android.view.animation.DecelerateInterpolator r1 = r10.f2328j
            r13.m1993b(r12, r0, r11, r1)
        Lb0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p060o.p061b.C0392o.mo1380c(android.view.View, androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$v$a):void");
    }

    /* renamed from: e */
    public int m1381e(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 != 0) {
            if (i5 == 1) {
                return i4 - i2;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i6 = i3 - i;
        if (i6 > 0) {
            return i6;
        }
        int i7 = i4 - i2;
        if (i7 < 0) {
            return i7;
        }
        return 0;
    }

    /* renamed from: f */
    public float mo1382f(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    /* renamed from: g */
    public int m1383g(int i) {
        float fAbs = Math.abs(i);
        if (!this.f2331m) {
            this.f2332n = mo1382f(this.f2330l);
            this.f2331m = true;
        }
        return (int) Math.ceil(fAbs * this.f2332n);
    }
}
