package androidx.compose.p006ui.node;

import androidx.compose.p006ui.node.Owner;

/* renamed from: androidx.compose.ui.node.e */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1457e {
    static {
        Owner.Companion companion = Owner.INSTANCE;
    }

    /* renamed from: a */
    public static /* synthetic */ void m722a() {
    }

    /* renamed from: b */
    public static /* synthetic */ void m723b() {
    }

    /* renamed from: c */
    public static /* synthetic */ void m724c() {
    }

    /* renamed from: d */
    public static /* synthetic */ void m725d() {
    }

    /* renamed from: e */
    public static /* synthetic */ void m726e(Owner owner, boolean z3, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: measureAndLayout");
        }
        if ((i4 & 1) != 0) {
            z3 = true;
        }
        owner.measureAndLayout(z3);
    }

    /* renamed from: f */
    public static /* synthetic */ void m727f(Owner owner, LayoutNode layoutNode, boolean z3, boolean z4, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestMeasure");
        }
        if ((i4 & 2) != 0) {
            z3 = false;
        }
        if ((i4 & 4) != 0) {
            z4 = false;
        }
        owner.onRequestMeasure(layoutNode, z3, z4);
    }

    /* renamed from: g */
    public static /* synthetic */ void m728g(Owner owner, LayoutNode layoutNode, boolean z3, boolean z4, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestRelayout");
        }
        if ((i4 & 2) != 0) {
            z3 = false;
        }
        if ((i4 & 4) != 0) {
            z4 = false;
        }
        owner.onRequestRelayout(layoutNode, z3, z4);
    }
}
