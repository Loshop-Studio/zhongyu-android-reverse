package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.C0335a;
import androidx.core.view.C0358u;
import java.util.Map;
import java.util.WeakHashMap;
import p016c0.C1050c;
import p016c0.C1051d;

/* renamed from: androidx.recyclerview.widget.l */
/* loaded from: classes.dex */
public class C0598l extends C0335a {
    private final a mItemDelegate;
    final RecyclerView mRecyclerView;

    /* renamed from: androidx.recyclerview.widget.l$a */
    public static class a extends C0335a {

        /* renamed from: a */
        final C0598l f3882a;

        /* renamed from: b */
        private Map<View, C0335a> f3883b = new WeakHashMap();

        public a(C0598l c0598l) {
            this.f3882a = c0598l;
        }

        /* renamed from: a */
        C0335a m3419a(View view) {
            return this.f3883b.remove(view);
        }

        /* renamed from: b */
        void m3420b(View view) {
            C0335a c0335aM2038k = C0358u.m2038k(view);
            if (c0335aM2038k == null || c0335aM2038k == this) {
                return;
            }
            this.f3883b.put(view, c0335aM2038k);
        }

        @Override // androidx.core.view.C0335a
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            C0335a c0335a = this.f3883b.get(view);
            return c0335a != null ? c0335a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent) : super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // androidx.core.view.C0335a
        public C1051d getAccessibilityNodeProvider(View view) {
            C0335a c0335a = this.f3883b.get(view);
            return c0335a != null ? c0335a.getAccessibilityNodeProvider(view) : super.getAccessibilityNodeProvider(view);
        }

        @Override // androidx.core.view.C0335a
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            C0335a c0335a = this.f3883b.get(view);
            if (c0335a != null) {
                c0335a.onInitializeAccessibilityEvent(view, accessibilityEvent);
            } else {
                super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.C0335a
        public void onInitializeAccessibilityNodeInfo(View view, C1050c c1050c) {
            if (this.f3882a.shouldIgnore() || this.f3882a.mRecyclerView.getLayoutManager() == null) {
                super.onInitializeAccessibilityNodeInfo(view, c1050c);
                return;
            }
            this.f3882a.mRecyclerView.getLayoutManager().onInitializeAccessibilityNodeInfoForItem(view, c1050c);
            C0335a c0335a = this.f3883b.get(view);
            if (c0335a != null) {
                c0335a.onInitializeAccessibilityNodeInfo(view, c1050c);
            } else {
                super.onInitializeAccessibilityNodeInfo(view, c1050c);
            }
        }

        @Override // androidx.core.view.C0335a
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            C0335a c0335a = this.f3883b.get(view);
            if (c0335a != null) {
                c0335a.onPopulateAccessibilityEvent(view, accessibilityEvent);
            } else {
                super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.C0335a
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            C0335a c0335a = this.f3883b.get(viewGroup);
            return c0335a != null ? c0335a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent) : super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        @Override // androidx.core.view.C0335a
        public boolean performAccessibilityAction(View view, int i4, Bundle bundle) {
            if (this.f3882a.shouldIgnore() || this.f3882a.mRecyclerView.getLayoutManager() == null) {
                return super.performAccessibilityAction(view, i4, bundle);
            }
            C0335a c0335a = this.f3883b.get(view);
            if (c0335a != null) {
                if (c0335a.performAccessibilityAction(view, i4, bundle)) {
                    return true;
                }
            } else if (super.performAccessibilityAction(view, i4, bundle)) {
                return true;
            }
            return this.f3882a.mRecyclerView.getLayoutManager().performAccessibilityActionForItem(view, i4, bundle);
        }

        @Override // androidx.core.view.C0335a
        public void sendAccessibilityEvent(View view, int i4) {
            C0335a c0335a = this.f3883b.get(view);
            if (c0335a != null) {
                c0335a.sendAccessibilityEvent(view, i4);
            } else {
                super.sendAccessibilityEvent(view, i4);
            }
        }

        @Override // androidx.core.view.C0335a
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            C0335a c0335a = this.f3883b.get(view);
            if (c0335a != null) {
                c0335a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
            } else {
                super.sendAccessibilityEventUnchecked(view, accessibilityEvent);
            }
        }
    }

    public C0598l(RecyclerView recyclerView) {
        this.mRecyclerView = recyclerView;
        C0335a itemDelegate = getItemDelegate();
        if (itemDelegate == null || !(itemDelegate instanceof a)) {
            this.mItemDelegate = new a(this);
        } else {
            this.mItemDelegate = (a) itemDelegate;
        }
    }

    public C0335a getItemDelegate() {
        return this.mItemDelegate;
    }

    @Override // androidx.core.view.C0335a
    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || shouldIgnore()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().onInitializeAccessibilityEvent(accessibilityEvent);
        }
    }

    @Override // androidx.core.view.C0335a
    public void onInitializeAccessibilityNodeInfo(View view, C1050c c1050c) {
        super.onInitializeAccessibilityNodeInfo(view, c1050c);
        if (shouldIgnore() || this.mRecyclerView.getLayoutManager() == null) {
            return;
        }
        this.mRecyclerView.getLayoutManager().onInitializeAccessibilityNodeInfo(c1050c);
    }

    @Override // androidx.core.view.C0335a
    public boolean performAccessibilityAction(View view, int i4, Bundle bundle) {
        if (super.performAccessibilityAction(view, i4, bundle)) {
            return true;
        }
        if (shouldIgnore() || this.mRecyclerView.getLayoutManager() == null) {
            return false;
        }
        return this.mRecyclerView.getLayoutManager().performAccessibilityAction(i4, bundle);
    }

    boolean shouldIgnore() {
        return this.mRecyclerView.hasPendingAdapterUpdates();
    }
}
