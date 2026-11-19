package p000a.p060o.p061b;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;
import java.util.WeakHashMap;
import p000a.p031h.p043j.C0243a;
import p000a.p031h.p043j.p044a0.C0245b;
import p000a.p031h.p043j.p044a0.C0246c;

/* renamed from: a.o.b.w */
/* loaded from: classes.dex */
public class C0400w extends C0243a {

    /* renamed from: d */
    public final RecyclerView f2343d;

    /* renamed from: e */
    public final a f2344e;

    /* renamed from: a.o.b.w$a */
    public static class a extends C0243a {

        /* renamed from: d */
        public final C0400w f2345d;

        /* renamed from: e */
        public Map<View, C0243a> f2346e = new WeakHashMap();

        public a(C0400w c0400w) {
            this.f2345d = c0400w;
        }

        @Override // p000a.p031h.p043j.C0243a
        /* renamed from: a */
        public boolean mo807a(View view, AccessibilityEvent accessibilityEvent) {
            C0243a c0243a = this.f2346e.get(view);
            return c0243a != null ? c0243a.mo807a(view, accessibilityEvent) : this.f1556a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // p000a.p031h.p043j.C0243a
        /* renamed from: b */
        public C0246c mo808b(View view) {
            C0243a c0243a = this.f2346e.get(view);
            return c0243a != null ? c0243a.mo808b(view) : super.mo808b(view);
        }

        @Override // p000a.p031h.p043j.C0243a
        /* renamed from: c */
        public void mo809c(View view, AccessibilityEvent accessibilityEvent) {
            C0243a c0243a = this.f2346e.get(view);
            if (c0243a != null) {
                c0243a.mo809c(view, accessibilityEvent);
            } else {
                this.f1556a.onInitializeAccessibilityEvent(view, accessibilityEvent);
            }
        }

        @Override // p000a.p031h.p043j.C0243a
        /* renamed from: d */
        public void mo810d(View view, C0245b c0245b) {
            if (!this.f2345d.m1415j() && this.f2345d.f2343d.getLayoutManager() != null) {
                this.f2345d.f2343d.getLayoutManager().m1960n0(view, c0245b);
                C0243a c0243a = this.f2346e.get(view);
                if (c0243a != null) {
                    c0243a.mo810d(view, c0245b);
                    return;
                }
            }
            this.f1556a.onInitializeAccessibilityNodeInfo(view, c0245b.f1563a);
        }

        @Override // p000a.p031h.p043j.C0243a
        /* renamed from: e */
        public void mo811e(View view, AccessibilityEvent accessibilityEvent) {
            C0243a c0243a = this.f2346e.get(view);
            if (c0243a != null) {
                c0243a.mo811e(view, accessibilityEvent);
            } else {
                this.f1556a.onPopulateAccessibilityEvent(view, accessibilityEvent);
            }
        }

        @Override // p000a.p031h.p043j.C0243a
        /* renamed from: f */
        public boolean mo812f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            C0243a c0243a = this.f2346e.get(viewGroup);
            return c0243a != null ? c0243a.mo812f(viewGroup, view, accessibilityEvent) : this.f1556a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        @Override // p000a.p031h.p043j.C0243a
        /* renamed from: g */
        public boolean mo813g(View view, int i, Bundle bundle) {
            if (this.f2345d.m1415j() || this.f2345d.f2343d.getLayoutManager() == null) {
                return super.mo813g(view, i, bundle);
            }
            C0243a c0243a = this.f2346e.get(view);
            if (c0243a != null) {
                if (c0243a.mo813g(view, i, bundle)) {
                    return true;
                }
            } else if (super.mo813g(view, i, bundle)) {
                return true;
            }
            RecyclerView.AbstractC0538l layoutManager = this.f2345d.f2343d.getLayoutManager();
            RecyclerView.C0544r c0544r = layoutManager.f3349b.f3291c;
            return layoutManager.m1918F0();
        }

        @Override // p000a.p031h.p043j.C0243a
        /* renamed from: h */
        public void mo814h(View view, int i) {
            C0243a c0243a = this.f2346e.get(view);
            if (c0243a != null) {
                c0243a.mo814h(view, i);
            } else {
                this.f1556a.sendAccessibilityEvent(view, i);
            }
        }

        @Override // p000a.p031h.p043j.C0243a
        /* renamed from: i */
        public void mo815i(View view, AccessibilityEvent accessibilityEvent) {
            C0243a c0243a = this.f2346e.get(view);
            if (c0243a != null) {
                c0243a.mo815i(view, accessibilityEvent);
            } else {
                this.f1556a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
            }
        }
    }

    public C0400w(RecyclerView recyclerView) {
        this.f2343d = recyclerView;
        a aVar = this.f2344e;
        this.f2344e = aVar == null ? new a(this) : aVar;
    }

    @Override // p000a.p031h.p043j.C0243a
    /* renamed from: c */
    public void mo809c(View view, AccessibilityEvent accessibilityEvent) {
        this.f1556a.onInitializeAccessibilityEvent(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || m1415j()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().mo1797l0(accessibilityEvent);
        }
    }

    @Override // p000a.p031h.p043j.C0243a
    /* renamed from: d */
    public void mo810d(View view, C0245b c0245b) {
        this.f1556a.onInitializeAccessibilityNodeInfo(view, c0245b.f1563a);
        if (m1415j() || this.f2343d.getLayoutManager() == null) {
            return;
        }
        RecyclerView.AbstractC0538l layoutManager = this.f2343d.getLayoutManager();
        RecyclerView recyclerView = layoutManager.f3349b;
        RecyclerView.C0544r c0544r = recyclerView.f3291c;
        RecyclerView.C0549w c0549w = recyclerView.f3298f0;
        if (recyclerView.canScrollVertically(-1) || layoutManager.f3349b.canScrollHorizontally(-1)) {
            c0245b.f1563a.addAction(8192);
            c0245b.f1563a.setScrollable(true);
        }
        if (layoutManager.f3349b.canScrollVertically(1) || layoutManager.f3349b.canScrollHorizontally(1)) {
            c0245b.f1563a.addAction(4096);
            c0245b.f1563a.setScrollable(true);
        }
        c0245b.m824i(new C0245b.b(AccessibilityNodeInfo.CollectionInfo.obtain(layoutManager.mo1742T(c0544r, c0549w), layoutManager.mo1727A(c0544r, c0549w), layoutManager.m1945X(), layoutManager.m1941U())));
    }

    @Override // p000a.p031h.p043j.C0243a
    /* renamed from: g */
    public boolean mo813g(View view, int i, Bundle bundle) {
        if (super.mo813g(view, i, bundle)) {
            return true;
        }
        if (m1415j() || this.f2343d.getLayoutManager() == null) {
            return false;
        }
        RecyclerView.AbstractC0538l layoutManager = this.f2343d.getLayoutManager();
        RecyclerView.C0544r c0544r = layoutManager.f3349b.f3291c;
        return layoutManager.m1916E0(i);
    }

    /* renamed from: j */
    public boolean m1415j() {
        return this.f2343d.m1837M();
    }
}
