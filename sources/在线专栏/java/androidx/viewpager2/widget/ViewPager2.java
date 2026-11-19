package androidx.viewpager2.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.C0358u;
import androidx.recyclerview.widget.C0597k;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.InterfaceC0784a;
import com.google.android.material.badge.BadgeDrawable;
import p016c0.C1050c;
import p016c0.InterfaceC1053f;
import p165w0.C3426a;

/* loaded from: classes.dex */
public final class ViewPager2 extends ViewGroup {

    /* renamed from: u */
    static boolean f4665u = true;

    /* renamed from: a */
    private final Rect f4666a;

    /* renamed from: b */
    private final Rect f4667b;

    /* renamed from: c */
    private C0801b f4668c;

    /* renamed from: d */
    int f4669d;

    /* renamed from: e */
    boolean f4670e;

    /* renamed from: f */
    private RecyclerView.AbstractC0564i f4671f;

    /* renamed from: g */
    private LinearLayoutManager f4672g;

    /* renamed from: h */
    private int f4673h;

    /* renamed from: i */
    private Parcelable f4674i;

    /* renamed from: j */
    RecyclerView f4675j;

    /* renamed from: k */
    private C0597k f4676k;

    /* renamed from: l */
    C0804e f4677l;

    /* renamed from: m */
    private C0801b f4678m;

    /* renamed from: n */
    private C0802c f4679n;

    /* renamed from: o */
    private C0803d f4680o;

    /* renamed from: p */
    private RecyclerView.AbstractC0567l f4681p;

    /* renamed from: q */
    private boolean f4682q;

    /* renamed from: r */
    private boolean f4683r;

    /* renamed from: s */
    private int f4684s;

    /* renamed from: t */
    AbstractC0790e f4685t;

    /* renamed from: androidx.viewpager2.widget.ViewPager2$a */
    class C0786a extends AbstractC0792g {
        C0786a() {
            super(null);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0792g, androidx.recyclerview.widget.RecyclerView.AbstractC0564i
        public void onChanged() {
            ViewPager2 viewPager2 = ViewPager2.this;
            viewPager2.f4670e = true;
            viewPager2.f4677l.m4113j();
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$b */
    class C0787b extends AbstractC0794i {
        C0787b() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0794i
        public void onPageScrollStateChanged(int i4) {
            if (i4 == 0) {
                ViewPager2.this.m4062o();
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0794i
        public void onPageSelected(int i4) {
            ViewPager2 viewPager2 = ViewPager2.this;
            if (viewPager2.f4669d != i4) {
                viewPager2.f4669d = i4;
                viewPager2.f4685t.mo4083q();
            }
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$c */
    class C0788c extends AbstractC0794i {
        C0788c() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0794i
        public void onPageSelected(int i4) {
            ViewPager2.this.clearFocus();
            if (ViewPager2.this.hasFocus()) {
                ViewPager2.this.f4675j.requestFocus(2);
            }
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$d */
    class C0789d implements RecyclerView.InterfaceC0571p {
        C0789d() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0571p
        /* renamed from: a */
        public void mo3097a(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            if (((ViewGroup.MarginLayoutParams) layoutParams).width != -1 || ((ViewGroup.MarginLayoutParams) layoutParams).height != -1) {
                throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0571p
        /* renamed from: b */
        public void mo3098b(View view) {
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$e */
    private abstract class AbstractC0790e {
        private AbstractC0790e() {
        }

        /* renamed from: a */
        boolean mo4067a() {
            return false;
        }

        /* renamed from: b */
        boolean mo4068b(int i4) {
            return false;
        }

        /* renamed from: c */
        boolean mo4069c(int i4, Bundle bundle) {
            return false;
        }

        /* renamed from: d */
        boolean mo4070d() {
            return false;
        }

        /* renamed from: e */
        void mo4071e(RecyclerView.AbstractC0562g<?> abstractC0562g) {
        }

        /* renamed from: f */
        void mo4072f(RecyclerView.AbstractC0562g<?> abstractC0562g) {
        }

        /* renamed from: g */
        String mo4073g() {
            throw new IllegalStateException("Not implemented.");
        }

        /* renamed from: h */
        void mo4074h(C0801b c0801b, RecyclerView recyclerView) {
        }

        /* renamed from: i */
        void mo4075i(AccessibilityNodeInfo accessibilityNodeInfo) {
        }

        /* renamed from: j */
        void mo4076j(C1050c c1050c) {
        }

        /* renamed from: k */
        boolean mo4077k(int i4) {
            throw new IllegalStateException("Not implemented.");
        }

        /* renamed from: l */
        boolean mo4078l(int i4, Bundle bundle) {
            throw new IllegalStateException("Not implemented.");
        }

        /* renamed from: m */
        void mo4079m() {
        }

        /* renamed from: n */
        CharSequence mo4080n() {
            throw new IllegalStateException("Not implemented.");
        }

        /* renamed from: o */
        void mo4081o(AccessibilityEvent accessibilityEvent) {
        }

        /* renamed from: p */
        void mo4082p() {
        }

        /* renamed from: q */
        void mo4083q() {
        }

        /* renamed from: r */
        void mo4084r() {
        }

        /* renamed from: s */
        void mo4085s() {
        }

        /* synthetic */ AbstractC0790e(ViewPager2 viewPager2, C0786a c0786a) {
            this();
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$f */
    class C0791f extends AbstractC0790e {
        C0791f() {
            super(ViewPager2.this, null);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0790e
        /* renamed from: b */
        public boolean mo4068b(int i4) {
            return (i4 == 8192 || i4 == 4096) && !ViewPager2.this.m4056e();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0790e
        /* renamed from: d */
        public boolean mo4070d() {
            return true;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0790e
        /* renamed from: j */
        public void mo4076j(C1050c c1050c) {
            if (ViewPager2.this.m4056e()) {
                return;
            }
            c1050c.m4869T(C1050c.a.f6220r);
            c1050c.m4869T(C1050c.a.f6219q);
            c1050c.m4915y0(false);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0790e
        /* renamed from: k */
        public boolean mo4077k(int i4) {
            if (mo4068b(i4)) {
                return false;
            }
            throw new IllegalStateException();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0790e
        /* renamed from: n */
        public CharSequence mo4080n() {
            if (mo4070d()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$g */
    private static abstract class AbstractC0792g extends RecyclerView.AbstractC0564i {
        private AbstractC0792g() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0564i
        public abstract void onChanged();

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0564i
        public final void onItemRangeChanged(int i4, int i5) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0564i
        public final void onItemRangeInserted(int i4, int i5) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0564i
        public final void onItemRangeMoved(int i4, int i5, int i6) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0564i
        public final void onItemRangeRemoved(int i4, int i5) {
            onChanged();
        }

        /* synthetic */ AbstractC0792g(C0786a c0786a) {
            this();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0564i
        public final void onItemRangeChanged(int i4, int i5, Object obj) {
            onChanged();
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$h */
    private class C0793h extends LinearLayoutManager {
        C0793h(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        protected void calculateExtraLayoutSpace(RecyclerView.C0580y c0580y, int[] iArr) {
            int offscreenPageLimit = ViewPager2.this.getOffscreenPageLimit();
            if (offscreenPageLimit == -1) {
                super.calculateExtraLayoutSpace(c0580y, iArr);
                return;
            }
            int pageSize = ViewPager2.this.getPageSize() * offscreenPageLimit;
            iArr[0] = pageSize;
            iArr[1] = pageSize;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0570o
        public void onInitializeAccessibilityNodeInfo(RecyclerView.C0576u c0576u, RecyclerView.C0580y c0580y, C1050c c1050c) {
            super.onInitializeAccessibilityNodeInfo(c0576u, c0580y, c1050c);
            ViewPager2.this.f4685t.mo4076j(c1050c);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0570o
        public boolean performAccessibilityAction(RecyclerView.C0576u c0576u, RecyclerView.C0580y c0580y, int i4, Bundle bundle) {
            return ViewPager2.this.f4685t.mo4068b(i4) ? ViewPager2.this.f4685t.mo4077k(i4) : super.performAccessibilityAction(c0576u, c0580y, i4, bundle);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0570o
        public boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z3, boolean z4) {
            return false;
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$i */
    public static abstract class AbstractC0794i {
        public void onPageScrollStateChanged(int i4) {
        }

        public void onPageScrolled(int i4, float f4, int i5) {
        }

        public void onPageSelected(int i4) {
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$j */
    class C0795j extends AbstractC0790e {

        /* renamed from: b */
        private final InterfaceC1053f f4696b;

        /* renamed from: c */
        private final InterfaceC1053f f4697c;

        /* renamed from: d */
        private RecyclerView.AbstractC0564i f4698d;

        /* renamed from: androidx.viewpager2.widget.ViewPager2$j$a */
        class a implements InterfaceC1053f {
            a() {
            }

            @Override // p016c0.InterfaceC1053f
            public boolean perform(View view, InterfaceC1053f.a aVar) {
                C0795j.this.m4088v(((ViewPager2) view).getCurrentItem() + 1);
                return true;
            }
        }

        /* renamed from: androidx.viewpager2.widget.ViewPager2$j$b */
        class b implements InterfaceC1053f {
            b() {
            }

            @Override // p016c0.InterfaceC1053f
            public boolean perform(View view, InterfaceC1053f.a aVar) {
                C0795j.this.m4088v(((ViewPager2) view).getCurrentItem() - 1);
                return true;
            }
        }

        /* renamed from: androidx.viewpager2.widget.ViewPager2$j$c */
        class c extends AbstractC0792g {
            c() {
                super(null);
            }

            @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0792g, androidx.recyclerview.widget.RecyclerView.AbstractC0564i
            public void onChanged() {
                C0795j.this.m4089w();
            }
        }

        C0795j() {
            super(ViewPager2.this, null);
            this.f4696b = new a();
            this.f4697c = new b();
        }

        /* renamed from: t */
        private void m4086t(AccessibilityNodeInfo accessibilityNodeInfo) {
            int itemCount;
            int itemCount2;
            if (ViewPager2.this.getAdapter() == null) {
                itemCount = 0;
            } else {
                if (ViewPager2.this.getOrientation() != 1) {
                    itemCount2 = ViewPager2.this.getAdapter().getItemCount();
                    itemCount = 0;
                    C1050c.m4832H0(accessibilityNodeInfo).m4882e0(C1050c.b.m4922b(itemCount, itemCount2, false, 0));
                }
                itemCount = ViewPager2.this.getAdapter().getItemCount();
            }
            itemCount2 = 0;
            C1050c.m4832H0(accessibilityNodeInfo).m4882e0(C1050c.b.m4922b(itemCount, itemCount2, false, 0));
        }

        /* renamed from: u */
        private void m4087u(AccessibilityNodeInfo accessibilityNodeInfo) {
            int itemCount;
            RecyclerView.AbstractC0562g adapter = ViewPager2.this.getAdapter();
            if (adapter == null || (itemCount = adapter.getItemCount()) == 0 || !ViewPager2.this.m4056e()) {
                return;
            }
            if (ViewPager2.this.f4669d > 0) {
                accessibilityNodeInfo.addAction(8192);
            }
            if (ViewPager2.this.f4669d < itemCount - 1) {
                accessibilityNodeInfo.addAction(4096);
            }
            accessibilityNodeInfo.setScrollable(true);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0790e
        /* renamed from: a */
        public boolean mo4067a() {
            return true;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0790e
        /* renamed from: c */
        public boolean mo4069c(int i4, Bundle bundle) {
            return i4 == 8192 || i4 == 4096;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0790e
        /* renamed from: e */
        public void mo4071e(RecyclerView.AbstractC0562g<?> abstractC0562g) {
            m4089w();
            if (abstractC0562g != null) {
                abstractC0562g.registerAdapterDataObserver(this.f4698d);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0790e
        /* renamed from: f */
        public void mo4072f(RecyclerView.AbstractC0562g<?> abstractC0562g) {
            if (abstractC0562g != null) {
                abstractC0562g.unregisterAdapterDataObserver(this.f4698d);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0790e
        /* renamed from: g */
        public String mo4073g() {
            if (mo4067a()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0790e
        /* renamed from: h */
        public void mo4074h(C0801b c0801b, RecyclerView recyclerView) {
            C0358u.m1979A0(recyclerView, 2);
            this.f4698d = new c();
            if (C0358u.m2066y(ViewPager2.this) == 0) {
                C0358u.m1979A0(ViewPager2.this, 1);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0790e
        /* renamed from: i */
        public void mo4075i(AccessibilityNodeInfo accessibilityNodeInfo) {
            m4086t(accessibilityNodeInfo);
            m4087u(accessibilityNodeInfo);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0790e
        /* renamed from: l */
        public boolean mo4078l(int i4, Bundle bundle) {
            if (!mo4069c(i4, bundle)) {
                throw new IllegalStateException();
            }
            m4088v(i4 == 8192 ? ViewPager2.this.getCurrentItem() - 1 : ViewPager2.this.getCurrentItem() + 1);
            return true;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0790e
        /* renamed from: m */
        public void mo4079m() {
            m4089w();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0790e
        /* renamed from: o */
        public void mo4081o(AccessibilityEvent accessibilityEvent) {
            accessibilityEvent.setSource(ViewPager2.this);
            accessibilityEvent.setClassName(mo4073g());
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0790e
        /* renamed from: p */
        public void mo4082p() {
            m4089w();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0790e
        /* renamed from: q */
        public void mo4083q() {
            m4089w();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0790e
        /* renamed from: r */
        public void mo4084r() {
            m4089w();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0790e
        /* renamed from: s */
        public void mo4085s() {
            m4089w();
        }

        /* renamed from: v */
        void m4088v(int i4) {
            if (ViewPager2.this.m4056e()) {
                ViewPager2.this.m4060k(i4, true);
            }
        }

        /* renamed from: w */
        void m4089w() {
            int itemCount;
            ViewPager2 viewPager2 = ViewPager2.this;
            int i4 = R.id.accessibilityActionPageLeft;
            C0358u.m2039k0(viewPager2, R.id.accessibilityActionPageLeft);
            C0358u.m2039k0(viewPager2, R.id.accessibilityActionPageRight);
            C0358u.m2039k0(viewPager2, R.id.accessibilityActionPageUp);
            C0358u.m2039k0(viewPager2, R.id.accessibilityActionPageDown);
            if (ViewPager2.this.getAdapter() == null || (itemCount = ViewPager2.this.getAdapter().getItemCount()) == 0 || !ViewPager2.this.m4056e()) {
                return;
            }
            if (ViewPager2.this.getOrientation() != 0) {
                if (ViewPager2.this.f4669d < itemCount - 1) {
                    C0358u.m2043m0(viewPager2, new C1050c.a(R.id.accessibilityActionPageDown, null), null, this.f4696b);
                }
                if (ViewPager2.this.f4669d > 0) {
                    C0358u.m2043m0(viewPager2, new C1050c.a(R.id.accessibilityActionPageUp, null), null, this.f4697c);
                    return;
                }
                return;
            }
            boolean zM4055d = ViewPager2.this.m4055d();
            int i5 = zM4055d ? R.id.accessibilityActionPageLeft : R.id.accessibilityActionPageRight;
            if (zM4055d) {
                i4 = R.id.accessibilityActionPageRight;
            }
            if (ViewPager2.this.f4669d < itemCount - 1) {
                C0358u.m2043m0(viewPager2, new C1050c.a(i5, null), null, this.f4696b);
            }
            if (ViewPager2.this.f4669d > 0) {
                C0358u.m2043m0(viewPager2, new C1050c.a(i4, null), null, this.f4697c);
            }
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$k */
    public interface InterfaceC0796k {
        void transformPage(View view, float f4);
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$l */
    private class C0797l extends C0597k {
        C0797l() {
        }

        @Override // androidx.recyclerview.widget.C0597k, androidx.recyclerview.widget.AbstractC0601o
        /* renamed from: e */
        public View mo3384e(RecyclerView.AbstractC0570o abstractC0570o) {
            if (ViewPager2.this.m4054c()) {
                return null;
            }
            return super.mo3384e(abstractC0570o);
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$m */
    private class C0798m extends RecyclerView {
        C0798m(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
        public CharSequence getAccessibilityClassName() {
            return ViewPager2.this.f4685t.mo4070d() ? ViewPager2.this.f4685t.mo4080n() : super.getAccessibilityClassName();
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setFromIndex(ViewPager2.this.f4669d);
            accessibilityEvent.setToIndex(ViewPager2.this.f4669d);
            ViewPager2.this.f4685t.mo4081o(accessibilityEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.m4056e() && super.onInterceptTouchEvent(motionEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.m4056e() && super.onTouchEvent(motionEvent);
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$n */
    private static class RunnableC0799n implements Runnable {

        /* renamed from: a */
        private final int f4705a;

        /* renamed from: b */
        private final RecyclerView f4706b;

        RunnableC0799n(int i4, RecyclerView recyclerView) {
            this.f4705a = i4;
            this.f4706b = recyclerView;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f4706b.smoothScrollToPosition(this.f4705a);
        }
    }

    public ViewPager2(Context context, AttributeSet attributeSet) throws IllegalStateException {
        super(context, attributeSet);
        this.f4666a = new Rect();
        this.f4667b = new Rect();
        this.f4668c = new C0801b(3);
        this.f4670e = false;
        this.f4671f = new C0786a();
        this.f4673h = -1;
        this.f4681p = null;
        this.f4682q = false;
        this.f4683r = true;
        this.f4684s = -1;
        m4049b(context, attributeSet);
    }

    /* renamed from: a */
    private RecyclerView.InterfaceC0571p m4048a() {
        return new C0789d();
    }

    /* renamed from: b */
    private void m4049b(Context context, AttributeSet attributeSet) throws IllegalStateException {
        this.f4685t = f4665u ? new C0795j() : new C0791f();
        C0798m c0798m = new C0798m(context);
        this.f4675j = c0798m;
        c0798m.setId(C0358u.m2036j());
        this.f4675j.setDescendantFocusability(131072);
        C0793h c0793h = new C0793h(context);
        this.f4672g = c0793h;
        this.f4675j.setLayoutManager(c0793h);
        this.f4675j.setScrollingTouchSlop(1);
        m4052l(context, attributeSet);
        this.f4675j.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f4675j.addOnChildAttachStateChangeListener(m4048a());
        C0804e c0804e = new C0804e(this);
        this.f4677l = c0804e;
        this.f4679n = new C0802c(this, c0804e, this.f4675j);
        C0797l c0797l = new C0797l();
        this.f4676k = c0797l;
        c0797l.attachToRecyclerView(this.f4675j);
        this.f4675j.addOnScrollListener(this.f4677l);
        C0801b c0801b = new C0801b(3);
        this.f4678m = c0801b;
        this.f4677l.m4115m(c0801b);
        C0787b c0787b = new C0787b();
        C0788c c0788c = new C0788c();
        this.f4678m.m4096a(c0787b);
        this.f4678m.m4096a(c0788c);
        this.f4685t.mo4074h(this.f4678m, this.f4675j);
        this.f4678m.m4096a(this.f4668c);
        C0803d c0803d = new C0803d(this.f4672g);
        this.f4680o = c0803d;
        this.f4678m.m4096a(c0803d);
        RecyclerView recyclerView = this.f4675j;
        attachViewToParent(recyclerView, 0, recyclerView.getLayoutParams());
    }

    /* renamed from: f */
    private void m4050f(RecyclerView.AbstractC0562g<?> abstractC0562g) {
        if (abstractC0562g != null) {
            abstractC0562g.registerAdapterDataObserver(this.f4671f);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: i */
    private void m4051i() {
        RecyclerView.AbstractC0562g adapter;
        if (this.f4673h == -1 || (adapter = getAdapter()) == 0) {
            return;
        }
        Parcelable parcelable = this.f4674i;
        if (parcelable != null) {
            if (adapter instanceof InterfaceC0784a) {
                ((InterfaceC0784a) adapter).m4047b(parcelable);
            }
            this.f4674i = null;
        }
        int iMax = Math.max(0, Math.min(this.f4673h, adapter.getItemCount() - 1));
        this.f4669d = iMax;
        this.f4673h = -1;
        this.f4675j.scrollToPosition(iMax);
        this.f4685t.mo4079m();
    }

    /* renamed from: l */
    private void m4052l(Context context, AttributeSet attributeSet) {
        int[] iArr = C3426a.f12009g;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        }
        try {
            setOrientation(typedArrayObtainStyledAttributes.getInt(C3426a.f12010h, 0));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: m */
    private void m4053m(RecyclerView.AbstractC0562g<?> abstractC0562g) {
        if (abstractC0562g != null) {
            abstractC0562g.unregisterAdapterDataObserver(this.f4671f);
        }
    }

    /* renamed from: c */
    public boolean m4054c() {
        return this.f4679n.m4098a();
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i4) {
        return this.f4675j.canScrollHorizontally(i4);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i4) {
        return this.f4675j.canScrollVertically(i4);
    }

    /* renamed from: d */
    boolean m4055d() {
        return this.f4672g.getLayoutDirection() == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        Parcelable parcelable = sparseArray.get(getId());
        if (parcelable instanceof SavedState) {
            int i4 = ((SavedState) parcelable).f4686a;
            sparseArray.put(this.f4675j.getId(), sparseArray.get(i4));
            sparseArray.remove(i4);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        m4051i();
    }

    /* renamed from: e */
    public boolean m4056e() {
        return this.f4683r;
    }

    /* renamed from: g */
    public void m4057g(AbstractC0794i abstractC0794i) {
        this.f4668c.m4096a(abstractC0794i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return this.f4685t.mo4067a() ? this.f4685t.mo4073g() : super.getAccessibilityClassName();
    }

    public RecyclerView.AbstractC0562g getAdapter() {
        return this.f4675j.getAdapter();
    }

    public int getCurrentItem() {
        return this.f4669d;
    }

    public int getItemDecorationCount() {
        return this.f4675j.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.f4684s;
    }

    public int getOrientation() {
        return this.f4672g.getOrientation();
    }

    int getPageSize() {
        int height;
        int paddingBottom;
        RecyclerView recyclerView = this.f4675j;
        if (getOrientation() == 0) {
            height = recyclerView.getWidth() - recyclerView.getPaddingLeft();
            paddingBottom = recyclerView.getPaddingRight();
        } else {
            height = recyclerView.getHeight() - recyclerView.getPaddingTop();
            paddingBottom = recyclerView.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.f4677l.m4110f();
    }

    /* renamed from: h */
    public void m4058h() {
        if (this.f4680o.m4099a() == null) {
            return;
        }
        double dM4109e = this.f4677l.m4109e();
        int i4 = (int) dM4109e;
        float f4 = (float) (dM4109e - i4);
        this.f4680o.onPageScrolled(i4, f4, Math.round(getPageSize() * f4));
    }

    /* renamed from: j */
    public void m4059j(int i4, boolean z3) {
        if (m4054c()) {
            throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
        }
        m4060k(i4, z3);
    }

    /* renamed from: k */
    void m4060k(int i4, boolean z3) {
        RecyclerView.AbstractC0562g adapter = getAdapter();
        if (adapter == null) {
            if (this.f4673h != -1) {
                this.f4673h = Math.max(i4, 0);
                return;
            }
            return;
        }
        if (adapter.getItemCount() <= 0) {
            return;
        }
        int iMin = Math.min(Math.max(i4, 0), adapter.getItemCount() - 1);
        if (iMin == this.f4669d && this.f4677l.m4112h()) {
            return;
        }
        int i5 = this.f4669d;
        if (iMin == i5 && z3) {
            return;
        }
        double dM4109e = i5;
        this.f4669d = iMin;
        this.f4685t.mo4083q();
        if (!this.f4677l.m4112h()) {
            dM4109e = this.f4677l.m4109e();
        }
        this.f4677l.m4114k(iMin, z3);
        if (!z3) {
            this.f4675j.scrollToPosition(iMin);
            return;
        }
        double d4 = iMin;
        if (Math.abs(d4 - dM4109e) <= 3.0d) {
            this.f4675j.smoothScrollToPosition(iMin);
            return;
        }
        this.f4675j.scrollToPosition(d4 > dM4109e ? iMin - 3 : iMin + 3);
        RecyclerView recyclerView = this.f4675j;
        recyclerView.post(new RunnableC0799n(iMin, recyclerView));
    }

    /* renamed from: n */
    public void m4061n(AbstractC0794i abstractC0794i) {
        this.f4668c.m4097b(abstractC0794i);
    }

    /* renamed from: o */
    void m4062o() {
        C0597k c0597k = this.f4676k;
        if (c0597k == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        View viewMo3384e = c0597k.mo3384e(this.f4672g);
        if (viewMo3384e == null) {
            return;
        }
        int position = this.f4672g.getPosition(viewMo3384e);
        if (position != this.f4669d && getScrollState() == 0) {
            this.f4678m.onPageSelected(position);
        }
        this.f4670e = false;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f4685t.mo4075i(accessibilityNodeInfo);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        int measuredWidth = this.f4675j.getMeasuredWidth();
        int measuredHeight = this.f4675j.getMeasuredHeight();
        this.f4666a.left = getPaddingLeft();
        this.f4666a.right = (i6 - i4) - getPaddingRight();
        this.f4666a.top = getPaddingTop();
        this.f4666a.bottom = (i7 - i5) - getPaddingBottom();
        Gravity.apply(BadgeDrawable.TOP_START, measuredWidth, measuredHeight, this.f4666a, this.f4667b);
        RecyclerView recyclerView = this.f4675j;
        Rect rect = this.f4667b;
        recyclerView.layout(rect.left, rect.top, rect.right, rect.bottom);
        if (this.f4670e) {
            m4062o();
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        measureChild(this.f4675j, i4, i5);
        int measuredWidth = this.f4675j.getMeasuredWidth();
        int measuredHeight = this.f4675j.getMeasuredHeight();
        int measuredState = this.f4675j.getMeasuredState();
        int paddingLeft = measuredWidth + getPaddingLeft() + getPaddingRight();
        int paddingTop = measuredHeight + getPaddingTop() + getPaddingBottom();
        setMeasuredDimension(ViewGroup.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i4, measuredState), ViewGroup.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i5, measuredState << 16));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f4673h = savedState.f4687b;
        this.f4674i = savedState.f4688c;
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f4686a = this.f4675j.getId();
        int i4 = this.f4673h;
        if (i4 == -1) {
            i4 = this.f4669d;
        }
        savedState.f4687b = i4;
        Parcelable parcelable = this.f4674i;
        if (parcelable != null) {
            savedState.f4688c = parcelable;
        } else {
            Object adapter = this.f4675j.getAdapter();
            if (adapter instanceof InterfaceC0784a) {
                savedState.f4688c = ((InterfaceC0784a) adapter).m4046a();
            }
        }
        return savedState;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        throw new IllegalStateException(ViewPager2.class.getSimpleName() + " does not support direct child views");
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i4, Bundle bundle) {
        return this.f4685t.mo4069c(i4, bundle) ? this.f4685t.mo4078l(i4, bundle) : super.performAccessibilityAction(i4, bundle);
    }

    public void setAdapter(RecyclerView.AbstractC0562g abstractC0562g) {
        RecyclerView.AbstractC0562g adapter = this.f4675j.getAdapter();
        this.f4685t.mo4072f(adapter);
        m4053m(adapter);
        this.f4675j.setAdapter(abstractC0562g);
        this.f4669d = 0;
        m4051i();
        this.f4685t.mo4071e(abstractC0562g);
        m4050f(abstractC0562g);
    }

    public void setCurrentItem(int i4) {
        m4059j(i4, true);
    }

    @Override // android.view.View
    public void setLayoutDirection(int i4) {
        super.setLayoutDirection(i4);
        this.f4685t.mo4082p();
    }

    public void setOffscreenPageLimit(int i4) {
        if (i4 < 1 && i4 != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.f4684s = i4;
        this.f4675j.requestLayout();
    }

    public void setOrientation(int i4) {
        this.f4672g.setOrientation(i4);
        this.f4685t.mo4084r();
    }

    public void setPageTransformer(InterfaceC0796k interfaceC0796k) {
        if (interfaceC0796k != null) {
            if (!this.f4682q) {
                this.f4681p = this.f4675j.getItemAnimator();
                this.f4682q = true;
            }
            this.f4675j.setItemAnimator(null);
        } else if (this.f4682q) {
            this.f4675j.setItemAnimator(this.f4681p);
            this.f4681p = null;
            this.f4682q = false;
        }
        if (interfaceC0796k == this.f4680o.m4099a()) {
            return;
        }
        this.f4680o.m4100b(interfaceC0796k);
        m4058h();
    }

    public void setUserInputEnabled(boolean z3) {
        this.f4683r = z3;
        this.f4685t.mo4085s();
    }

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0785a();

        /* renamed from: a */
        int f4686a;

        /* renamed from: b */
        int f4687b;

        /* renamed from: c */
        Parcelable f4688c;

        /* renamed from: androidx.viewpager2.widget.ViewPager2$SavedState$a */
        static class C0785a implements Parcelable.ClassLoaderCreator<SavedState> {
            C0785a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return createFromParcel(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return Build.VERSION.SDK_INT >= 24 ? new SavedState(parcel, classLoader) : new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i4) {
                return new SavedState[i4];
            }
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            m4063a(parcel, classLoader);
        }

        /* renamed from: a */
        private void m4063a(Parcel parcel, ClassLoader classLoader) {
            this.f4686a = parcel.readInt();
            this.f4687b = parcel.readInt();
            this.f4688c = parcel.readParcelable(classLoader);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeInt(this.f4686a);
            parcel.writeInt(this.f4687b);
            parcel.writeParcelable(this.f4688c, i4);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            m4063a(parcel, null);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public ViewPager2(Context context, AttributeSet attributeSet, int i4) throws IllegalStateException {
        super(context, attributeSet, i4);
        this.f4666a = new Rect();
        this.f4667b = new Rect();
        this.f4668c = new C0801b(3);
        this.f4670e = false;
        this.f4671f = new C0786a();
        this.f4673h = -1;
        this.f4681p = null;
        this.f4682q = false;
        this.f4683r = true;
        this.f4684s = -1;
        m4049b(context, attributeSet);
    }
}
