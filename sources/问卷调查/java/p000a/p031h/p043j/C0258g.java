package p000a.p031h.p043j;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;

/* renamed from: a.h.j.g */
/* loaded from: classes.dex */
public class C0258g {

    /* renamed from: a */
    public ViewParent f1606a;

    /* renamed from: b */
    public ViewParent f1607b;

    /* renamed from: c */
    public final View f1608c;

    /* renamed from: d */
    public boolean f1609d;

    /* renamed from: e */
    public int[] f1610e;

    public C0258g(View view) {
        this.f1608c = view;
    }

    /* renamed from: a */
    public boolean m842a(float f2, float f3, boolean z) {
        ViewParent viewParentM848g;
        if (!this.f1609d || (viewParentM848g = m848g(0)) == null) {
            return false;
        }
        try {
            return viewParentM848g.onNestedFling(this.f1608c, f2, f3, z);
        } catch (AbstractMethodError e2) {
            Log.e("ViewParentCompat", "ViewParent " + viewParentM848g + " does not implement interface method onNestedFling", e2);
            return false;
        }
    }

    /* renamed from: b */
    public boolean m843b(float f2, float f3) {
        ViewParent viewParentM848g;
        if (!this.f1609d || (viewParentM848g = m848g(0)) == null) {
            return false;
        }
        try {
            return viewParentM848g.onNestedPreFling(this.f1608c, f2, f3);
        } catch (AbstractMethodError e2) {
            Log.e("ViewParentCompat", "ViewParent " + viewParentM848g + " does not implement interface method onNestedPreFling", e2);
            return false;
        }
    }

    /* renamed from: c */
    public boolean m844c(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent viewParentM848g;
        int i4;
        int i5;
        int[] iArr3;
        if (!this.f1609d || (viewParentM848g = m848g(i3)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        if (iArr2 != null) {
            this.f1608c.getLocationInWindow(iArr2);
            i4 = iArr2[0];
            i5 = iArr2[1];
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (iArr == null) {
            if (this.f1610e == null) {
                this.f1610e = new int[2];
            }
            iArr3 = this.f1610e;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        View view = this.f1608c;
        if (viewParentM848g instanceof InterfaceC0259h) {
            ((InterfaceC0259h) viewParentM848g).mo855n(view, i, i2, iArr3, i3);
        } else if (i3 == 0) {
            try {
                viewParentM848g.onNestedPreScroll(view, i, i2, iArr3);
            } catch (AbstractMethodError e2) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentM848g + " does not implement interface method onNestedPreScroll", e2);
            }
        }
        if (iArr2 != null) {
            this.f1608c.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i4;
            iArr2[1] = iArr2[1] - i5;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    /* renamed from: d */
    public void m845d(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        m847f(i, i2, i3, i4, null, i5, iArr2);
    }

    /* renamed from: e */
    public boolean m846e(int i, int i2, int i3, int i4, int[] iArr) {
        return m847f(i, i2, i3, i4, iArr, 0, null);
    }

    /* renamed from: f */
    public final boolean m847f(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent viewParentM848g;
        int i6;
        int i7;
        int[] iArr3;
        if (!this.f1609d || (viewParentM848g = m848g(i5)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.f1608c.getLocationInWindow(iArr);
            i6 = iArr[0];
            i7 = iArr[1];
        } else {
            i6 = 0;
            i7 = 0;
        }
        if (iArr2 == null) {
            if (this.f1610e == null) {
                this.f1610e = new int[2];
            }
            int[] iArr4 = this.f1610e;
            iArr4[0] = 0;
            iArr4[1] = 0;
            iArr3 = iArr4;
        } else {
            iArr3 = iArr2;
        }
        View view = this.f1608c;
        if (viewParentM848g instanceof InterfaceC0260i) {
            ((InterfaceC0260i) viewParentM848g).mo857k(view, i, i2, i3, i4, i5, iArr3);
        } else {
            iArr3[0] = iArr3[0] + i3;
            iArr3[1] = iArr3[1] + i4;
            if (viewParentM848g instanceof InterfaceC0259h) {
                ((InterfaceC0259h) viewParentM848g).mo853l(view, i, i2, i3, i4, i5);
            } else if (i5 == 0) {
                try {
                    viewParentM848g.onNestedScroll(view, i, i2, i3, i4);
                } catch (AbstractMethodError e2) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParentM848g + " does not implement interface method onNestedScroll", e2);
                }
            }
        }
        if (iArr != null) {
            this.f1608c.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i6;
            iArr[1] = iArr[1] - i7;
        }
        return true;
    }

    /* renamed from: g */
    public final ViewParent m848g(int i) {
        if (i == 0) {
            return this.f1606a;
        }
        if (i != 1) {
            return null;
        }
        return this.f1607b;
    }

    /* renamed from: h */
    public boolean m849h(int i) {
        return m848g(i) != null;
    }

    /* renamed from: i */
    public boolean m850i(int i, int i2) {
        boolean zOnStartNestedScroll;
        if (m848g(i2) != null) {
            return true;
        }
        if (this.f1609d) {
            View view = this.f1608c;
            for (ViewParent parent = this.f1608c.getParent(); parent != null; parent = parent.getParent()) {
                View view2 = this.f1608c;
                boolean z = parent instanceof InterfaceC0259h;
                if (z) {
                    zOnStartNestedScroll = ((InterfaceC0259h) parent).mo856o(view, view2, i, i2);
                } else if (i2 == 0) {
                    try {
                        zOnStartNestedScroll = parent.onStartNestedScroll(view, view2, i);
                    } catch (AbstractMethodError e2) {
                        Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e2);
                    }
                } else {
                    zOnStartNestedScroll = false;
                }
                if (zOnStartNestedScroll) {
                    if (i2 == 0) {
                        this.f1606a = parent;
                    } else if (i2 == 1) {
                        this.f1607b = parent;
                    }
                    View view3 = this.f1608c;
                    if (z) {
                        ((InterfaceC0259h) parent).mo852i(view, view3, i, i2);
                    } else if (i2 == 0) {
                        try {
                            parent.onNestedScrollAccepted(view, view3, i);
                        } catch (AbstractMethodError e3) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e3);
                        }
                    }
                    return true;
                }
                if (parent instanceof View) {
                    view = parent;
                }
            }
        }
        return false;
    }

    /* renamed from: j */
    public void m851j(int i) {
        ViewParent viewParentM848g = m848g(i);
        if (viewParentM848g != null) {
            View view = this.f1608c;
            if (viewParentM848g instanceof InterfaceC0259h) {
                ((InterfaceC0259h) viewParentM848g).mo854m(view, i);
            } else if (i == 0) {
                try {
                    viewParentM848g.onStopNestedScroll(view);
                } catch (AbstractMethodError e2) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParentM848g + " does not implement interface method onStopNestedScroll", e2);
                }
            }
            if (i == 0) {
                this.f1606a = null;
            } else {
                if (i != 1) {
                    return;
                }
                this.f1607b = null;
            }
        }
    }
}
