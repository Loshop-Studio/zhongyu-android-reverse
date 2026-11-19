package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import java.util.Locale;

/* renamed from: androidx.viewpager2.widget.e */
/* loaded from: classes.dex */
final class C0804e extends RecyclerView.AbstractC0574s {

    /* renamed from: a */
    private ViewPager2.AbstractC0794i f4716a;

    /* renamed from: b */
    private final ViewPager2 f4717b;

    /* renamed from: c */
    private final RecyclerView f4718c;

    /* renamed from: d */
    private final LinearLayoutManager f4719d;

    /* renamed from: e */
    private int f4720e;

    /* renamed from: f */
    private int f4721f;

    /* renamed from: g */
    private a f4722g;

    /* renamed from: h */
    private int f4723h;

    /* renamed from: i */
    private int f4724i;

    /* renamed from: j */
    private boolean f4725j;

    /* renamed from: k */
    private boolean f4726k;

    /* renamed from: l */
    private boolean f4727l;

    /* renamed from: m */
    private boolean f4728m;

    /* renamed from: androidx.viewpager2.widget.e$a */
    private static final class a {

        /* renamed from: a */
        int f4729a;

        /* renamed from: b */
        float f4730b;

        /* renamed from: c */
        int f4731c;

        a() {
        }

        /* renamed from: a */
        void m4116a() {
            this.f4729a = -1;
            this.f4730b = IGoodView.DEFAULT_TO_ALPHA;
            this.f4731c = 0;
        }
    }

    C0804e(ViewPager2 viewPager2) {
        this.f4717b = viewPager2;
        RecyclerView recyclerView = viewPager2.f4675j;
        this.f4718c = recyclerView;
        this.f4719d = (LinearLayoutManager) recyclerView.getLayoutManager();
        this.f4722g = new a();
        m4106l();
    }

    /* renamed from: a */
    private void m4101a(int i4, float f4, int i5) {
        ViewPager2.AbstractC0794i abstractC0794i = this.f4716a;
        if (abstractC0794i != null) {
            abstractC0794i.onPageScrolled(i4, f4, i5);
        }
    }

    /* renamed from: b */
    private void m4102b(int i4) {
        ViewPager2.AbstractC0794i abstractC0794i = this.f4716a;
        if (abstractC0794i != null) {
            abstractC0794i.onPageSelected(i4);
        }
    }

    /* renamed from: c */
    private void m4103c(int i4) {
        if ((this.f4720e == 3 && this.f4721f == 0) || this.f4721f == i4) {
            return;
        }
        this.f4721f = i4;
        ViewPager2.AbstractC0794i abstractC0794i = this.f4716a;
        if (abstractC0794i != null) {
            abstractC0794i.onPageScrollStateChanged(i4);
        }
    }

    /* renamed from: d */
    private int m4104d() {
        return this.f4719d.findFirstVisibleItemPosition();
    }

    /* renamed from: i */
    private boolean m4105i() {
        int i4 = this.f4720e;
        return i4 == 1 || i4 == 4;
    }

    /* renamed from: l */
    private void m4106l() {
        this.f4720e = 0;
        this.f4721f = 0;
        this.f4722g.m4116a();
        this.f4723h = -1;
        this.f4724i = -1;
        this.f4725j = false;
        this.f4726k = false;
        this.f4728m = false;
        this.f4727l = false;
    }

    /* renamed from: n */
    private void m4107n(boolean z3) {
        this.f4728m = z3;
        this.f4720e = z3 ? 4 : 1;
        int i4 = this.f4724i;
        if (i4 != -1) {
            this.f4723h = i4;
            this.f4724i = -1;
        } else if (this.f4723h == -1) {
            this.f4723h = m4104d();
        }
        m4103c(1);
    }

    /* renamed from: o */
    private void m4108o() {
        int top;
        a aVar = this.f4722g;
        int iFindFirstVisibleItemPosition = this.f4719d.findFirstVisibleItemPosition();
        aVar.f4729a = iFindFirstVisibleItemPosition;
        if (iFindFirstVisibleItemPosition == -1) {
            aVar.m4116a();
            return;
        }
        View viewFindViewByPosition = this.f4719d.findViewByPosition(iFindFirstVisibleItemPosition);
        if (viewFindViewByPosition == null) {
            aVar.m4116a();
            return;
        }
        int leftDecorationWidth = this.f4719d.getLeftDecorationWidth(viewFindViewByPosition);
        int rightDecorationWidth = this.f4719d.getRightDecorationWidth(viewFindViewByPosition);
        int topDecorationHeight = this.f4719d.getTopDecorationHeight(viewFindViewByPosition);
        int bottomDecorationHeight = this.f4719d.getBottomDecorationHeight(viewFindViewByPosition);
        ViewGroup.LayoutParams layoutParams = viewFindViewByPosition.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            leftDecorationWidth += marginLayoutParams.leftMargin;
            rightDecorationWidth += marginLayoutParams.rightMargin;
            topDecorationHeight += marginLayoutParams.topMargin;
            bottomDecorationHeight += marginLayoutParams.bottomMargin;
        }
        int height = viewFindViewByPosition.getHeight() + topDecorationHeight + bottomDecorationHeight;
        int width = viewFindViewByPosition.getWidth() + leftDecorationWidth + rightDecorationWidth;
        if (this.f4719d.getOrientation() == 0) {
            top = (viewFindViewByPosition.getLeft() - leftDecorationWidth) - this.f4718c.getPaddingLeft();
            if (this.f4717b.m4055d()) {
                top = -top;
            }
            height = width;
        } else {
            top = (viewFindViewByPosition.getTop() - topDecorationHeight) - this.f4718c.getPaddingTop();
        }
        int i4 = -top;
        aVar.f4731c = i4;
        if (i4 >= 0) {
            aVar.f4730b = height == 0 ? IGoodView.DEFAULT_TO_ALPHA : i4 / height;
        } else {
            if (!new C0800a(this.f4719d).m4093d()) {
                throw new IllegalStateException(String.format(Locale.US, "Page can only be offset by a positive amount, not by %d", Integer.valueOf(aVar.f4731c)));
            }
            throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
        }
    }

    /* renamed from: e */
    double m4109e() {
        m4108o();
        a aVar = this.f4722g;
        return aVar.f4729a + aVar.f4730b;
    }

    /* renamed from: f */
    int m4110f() {
        return this.f4721f;
    }

    /* renamed from: g */
    boolean m4111g() {
        return this.f4728m;
    }

    /* renamed from: h */
    boolean m4112h() {
        return this.f4721f == 0;
    }

    /* renamed from: j */
    void m4113j() {
        this.f4727l = true;
    }

    /* renamed from: k */
    void m4114k(int i4, boolean z3) {
        this.f4720e = z3 ? 2 : 3;
        this.f4728m = false;
        boolean z4 = this.f4724i != i4;
        this.f4724i = i4;
        m4103c(2);
        if (z4) {
            m4102b(i4);
        }
    }

    /* renamed from: m */
    void m4115m(ViewPager2.AbstractC0794i abstractC0794i) {
        this.f4716a = abstractC0794i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0574s
    public void onScrollStateChanged(RecyclerView recyclerView, int i4) {
        boolean z3 = true;
        if (!(this.f4720e == 1 && this.f4721f == 1) && i4 == 1) {
            m4107n(false);
            return;
        }
        if (m4105i() && i4 == 2) {
            if (this.f4726k) {
                m4103c(2);
                this.f4725j = true;
                return;
            }
            return;
        }
        if (m4105i() && i4 == 0) {
            m4108o();
            if (this.f4726k) {
                a aVar = this.f4722g;
                if (aVar.f4731c == 0) {
                    int i5 = this.f4723h;
                    int i6 = aVar.f4729a;
                    if (i5 != i6) {
                        m4102b(i6);
                    }
                } else {
                    z3 = false;
                }
            } else {
                int i7 = this.f4722g.f4729a;
                if (i7 != -1) {
                    m4101a(i7, IGoodView.DEFAULT_TO_ALPHA, 0);
                }
            }
            if (z3) {
                m4103c(0);
                m4106l();
            }
        }
        if (this.f4720e == 2 && i4 == 0 && this.f4727l) {
            m4108o();
            a aVar2 = this.f4722g;
            if (aVar2.f4731c == 0) {
                int i8 = this.f4724i;
                int i9 = aVar2.f4729a;
                if (i8 != i9) {
                    if (i9 == -1) {
                        i9 = 0;
                    }
                    m4102b(i9);
                }
                m4103c(0);
                m4106l();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0574s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onScrolled(androidx.recyclerview.widget.RecyclerView r4, int r5, int r6) {
        /*
            r3 = this;
            r4 = 1
            r3.f4726k = r4
            r3.m4108o()
            boolean r0 = r3.f4725j
            r1 = -1
            r2 = 0
            if (r0 == 0) goto L3d
            r3.f4725j = r2
            if (r6 > 0) goto L22
            if (r6 != 0) goto L20
            if (r5 >= 0) goto L16
            r5 = 1
            goto L17
        L16:
            r5 = 0
        L17:
            androidx.viewpager2.widget.ViewPager2 r6 = r3.f4717b
            boolean r6 = r6.m4055d()
            if (r5 != r6) goto L20
            goto L22
        L20:
            r5 = 0
            goto L23
        L22:
            r5 = 1
        L23:
            if (r5 == 0) goto L2f
            androidx.viewpager2.widget.e$a r5 = r3.f4722g
            int r6 = r5.f4731c
            if (r6 == 0) goto L2f
            int r5 = r5.f4729a
            int r5 = r5 + r4
            goto L33
        L2f:
            androidx.viewpager2.widget.e$a r5 = r3.f4722g
            int r5 = r5.f4729a
        L33:
            r3.f4724i = r5
            int r6 = r3.f4723h
            if (r6 == r5) goto L4b
            r3.m4102b(r5)
            goto L4b
        L3d:
            int r5 = r3.f4720e
            if (r5 != 0) goto L4b
            androidx.viewpager2.widget.e$a r5 = r3.f4722g
            int r5 = r5.f4729a
            if (r5 != r1) goto L48
            r5 = 0
        L48:
            r3.m4102b(r5)
        L4b:
            androidx.viewpager2.widget.e$a r5 = r3.f4722g
            int r6 = r5.f4729a
            if (r6 != r1) goto L52
            r6 = 0
        L52:
            float r0 = r5.f4730b
            int r5 = r5.f4731c
            r3.m4101a(r6, r0, r5)
            androidx.viewpager2.widget.e$a r5 = r3.f4722g
            int r6 = r5.f4729a
            int r0 = r3.f4724i
            if (r6 == r0) goto L63
            if (r0 != r1) goto L71
        L63:
            int r5 = r5.f4731c
            if (r5 != 0) goto L71
            int r5 = r3.f4721f
            if (r5 == r4) goto L71
            r3.m4103c(r2)
            r3.m4106l()
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager2.widget.C0804e.onScrolled(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }
}
