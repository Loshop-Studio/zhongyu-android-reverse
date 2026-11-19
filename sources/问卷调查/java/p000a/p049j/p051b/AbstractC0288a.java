package p000a.p049j.p051b;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import p000a.p021e.C0137i;
import p000a.p031h.p043j.C0243a;
import p000a.p031h.p043j.C0266o;
import p000a.p031h.p043j.C0273v;
import p000a.p031h.p043j.p044a0.C0245b;
import p000a.p031h.p043j.p044a0.C0246c;

/* renamed from: a.j.b.a */
/* loaded from: classes.dex */
public abstract class AbstractC0288a extends C0243a {

    /* renamed from: n */
    public static final Rect f1719n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: o */
    public static final InterfaceC0289b<C0245b> f1720o = new a();

    /* renamed from: p */
    public static final InterfaceC0290c<C0137i<C0245b>, C0245b> f1721p = new b();

    /* renamed from: h */
    public final AccessibilityManager f1726h;

    /* renamed from: i */
    public final View f1727i;

    /* renamed from: j */
    public c f1728j;

    /* renamed from: d */
    public final Rect f1722d = new Rect();

    /* renamed from: e */
    public final Rect f1723e = new Rect();

    /* renamed from: f */
    public final Rect f1724f = new Rect();

    /* renamed from: g */
    public final int[] f1725g = new int[2];

    /* renamed from: k */
    public int f1729k = Integer.MIN_VALUE;

    /* renamed from: l */
    public int f1730l = Integer.MIN_VALUE;

    /* renamed from: m */
    private int f1731m = Integer.MIN_VALUE;

    /* renamed from: a.j.b.a$a */
    public static class a implements InterfaceC0289b<C0245b> {
        /* renamed from: a */
        public void m941a(Object obj, Rect rect) {
            ((C0245b) obj).f1563a.getBoundsInParent(rect);
        }
    }

    /* renamed from: a.j.b.a$b */
    public static class b implements InterfaceC0290c<C0137i<C0245b>, C0245b> {
    }

    /* renamed from: a.j.b.a$c */
    public class c extends C0246c {
        public c() {
        }

        @Override // p000a.p031h.p043j.p044a0.C0246c
        /* renamed from: a */
        public C0245b mo829a(int i) {
            return new C0245b(AccessibilityNodeInfo.obtain(AbstractC0288a.this.m933q(i).f1563a));
        }

        @Override // p000a.p031h.p043j.p044a0.C0246c
        /* renamed from: b */
        public C0245b mo830b(int i) {
            int i2 = i == 2 ? AbstractC0288a.this.f1729k : AbstractC0288a.this.f1730l;
            if (i2 == Integer.MIN_VALUE) {
                return null;
            }
            return new C0245b(AccessibilityNodeInfo.obtain(AbstractC0288a.this.m933q(i2).f1563a));
        }

        @Override // p000a.p031h.p043j.p044a0.C0246c
        /* renamed from: c */
        public boolean mo831c(int i, int i2, Bundle bundle) {
            int i3;
            AbstractC0288a abstractC0288a = AbstractC0288a.this;
            if (i == -1) {
                View view = abstractC0288a.f1727i;
                WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
                return view.performAccessibilityAction(i2, bundle);
            }
            boolean z = true;
            if (i2 == 1) {
                return abstractC0288a.m938v(i);
            }
            if (i2 == 2) {
                return abstractC0288a.m927k(i);
            }
            if (i2 != 64) {
                return i2 != 128 ? abstractC0288a.mo934r(i, i2, bundle) : abstractC0288a.m926j(i);
            }
            if (abstractC0288a.f1726h.isEnabled() && abstractC0288a.f1726h.isTouchExplorationEnabled() && (i3 = abstractC0288a.f1729k) != i) {
                if (i3 != Integer.MIN_VALUE) {
                    abstractC0288a.m926j(i3);
                }
                abstractC0288a.f1729k = i;
                abstractC0288a.f1727i.invalidate();
                abstractC0288a.m939w(i, 32768);
            } else {
                z = false;
            }
            return z;
        }
    }

    public AbstractC0288a(View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.f1727i = view;
        this.f1726h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    @Override // p000a.p031h.p043j.C0243a
    /* renamed from: b */
    public C0246c mo808b(View view) {
        if (this.f1728j == null) {
            this.f1728j = new c();
        }
        return this.f1728j;
    }

    @Override // p000a.p031h.p043j.C0243a
    /* renamed from: c */
    public void mo809c(View view, AccessibilityEvent accessibilityEvent) {
        this.f1556a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // p000a.p031h.p043j.C0243a
    /* renamed from: d */
    public void mo810d(View view, C0245b c0245b) {
        this.f1556a.onInitializeAccessibilityNodeInfo(view, c0245b.f1563a);
        mo935s(c0245b);
    }

    /* renamed from: j */
    public final boolean m926j(int i) {
        if (this.f1729k != i) {
            return false;
        }
        this.f1729k = Integer.MIN_VALUE;
        this.f1727i.invalidate();
        m939w(i, 65536);
        return true;
    }

    /* renamed from: k */
    public final boolean m927k(int i) {
        if (this.f1730l != i) {
            return false;
        }
        this.f1730l = Integer.MIN_VALUE;
        mo937u(i, false);
        m939w(i, 8);
        return true;
    }

    /* renamed from: l */
    public final C0245b m928l(int i) {
        AccessibilityNodeInfo accessibilityNodeInfo;
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
        C0245b c0245b = new C0245b(accessibilityNodeInfoObtain);
        accessibilityNodeInfoObtain.setEnabled(true);
        c0245b.f1563a.setFocusable(true);
        c0245b.f1563a.setClassName("android.view.View");
        Rect rect = f1719n;
        c0245b.f1563a.setBoundsInParent(rect);
        c0245b.f1563a.setBoundsInScreen(rect);
        View view = this.f1727i;
        c0245b.f1564b = -1;
        c0245b.f1563a.setParent(view);
        mo936t(i, c0245b);
        if (c0245b.m822g() == null && c0245b.m820e() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        c0245b.f1563a.getBoundsInParent(this.f1723e);
        if (this.f1723e.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int actions = c0245b.f1563a.getActions();
        if ((actions & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        int i2 = 128;
        if ((actions & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        c0245b.f1563a.setPackageName(this.f1727i.getContext().getPackageName());
        View view2 = this.f1727i;
        c0245b.f1565c = i;
        c0245b.f1563a.setSource(view2, i);
        boolean z = false;
        if (this.f1729k == i) {
            c0245b.f1563a.setAccessibilityFocused(true);
            accessibilityNodeInfo = c0245b.f1563a;
        } else {
            c0245b.f1563a.setAccessibilityFocused(false);
            accessibilityNodeInfo = c0245b.f1563a;
            i2 = 64;
        }
        accessibilityNodeInfo.addAction(i2);
        boolean z2 = this.f1730l == i;
        if (z2) {
            c0245b.f1563a.addAction(2);
        } else if (c0245b.f1563a.isFocusable()) {
            c0245b.f1563a.addAction(1);
        }
        c0245b.f1563a.setFocused(z2);
        this.f1727i.getLocationOnScreen(this.f1725g);
        c0245b.f1563a.getBoundsInScreen(this.f1722d);
        if (this.f1722d.equals(rect)) {
            c0245b.f1563a.getBoundsInParent(this.f1722d);
            if (c0245b.f1564b != -1) {
                C0245b c0245b2 = new C0245b(AccessibilityNodeInfo.obtain());
                for (int i3 = c0245b.f1564b; i3 != -1; i3 = c0245b2.f1564b) {
                    View view3 = this.f1727i;
                    c0245b2.f1564b = -1;
                    c0245b2.f1563a.setParent(view3, -1);
                    c0245b2.f1563a.setBoundsInParent(f1719n);
                    mo936t(i3, c0245b2);
                    c0245b2.f1563a.getBoundsInParent(this.f1723e);
                    Rect rect2 = this.f1722d;
                    Rect rect3 = this.f1723e;
                    rect2.offset(rect3.left, rect3.top);
                }
                c0245b2.f1563a.recycle();
            }
            this.f1722d.offset(this.f1725g[0] - this.f1727i.getScrollX(), this.f1725g[1] - this.f1727i.getScrollY());
        }
        if (this.f1727i.getLocalVisibleRect(this.f1724f)) {
            this.f1724f.offset(this.f1725g[0] - this.f1727i.getScrollX(), this.f1725g[1] - this.f1727i.getScrollY());
            if (this.f1722d.intersect(this.f1724f)) {
                c0245b.f1563a.setBoundsInScreen(this.f1722d);
                Rect rect4 = this.f1722d;
                if (rect4 != null && !rect4.isEmpty() && this.f1727i.getWindowVisibility() == 0) {
                    View view4 = this.f1727i;
                    while (true) {
                        Object parent = view4.getParent();
                        if (parent instanceof View) {
                            view4 = (View) parent;
                            if (view4.getAlpha() <= 0.0f || view4.getVisibility() != 0) {
                                break;
                            }
                        } else if (parent != null) {
                            z = true;
                        }
                    }
                }
                if (z) {
                    c0245b.f1563a.setVisibleToUser(true);
                }
            }
        }
        return c0245b;
    }

    /* renamed from: m */
    public final boolean m929m(MotionEvent motionEvent) {
        int i;
        if (!this.f1726h.isEnabled() || !this.f1726h.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int iMo930n = mo930n(motionEvent.getX(), motionEvent.getY());
            int i2 = this.f1731m;
            if (i2 != iMo930n) {
                this.f1731m = iMo930n;
                m939w(iMo930n, 128);
                m939w(i2, 256);
            }
            return iMo930n != Integer.MIN_VALUE;
        }
        if (action != 10 || (i = this.f1731m) == Integer.MIN_VALUE) {
            return false;
        }
        if (i != Integer.MIN_VALUE) {
            this.f1731m = Integer.MIN_VALUE;
            m939w(Integer.MIN_VALUE, 128);
            m939w(i, 256);
        }
        return true;
    }

    /* renamed from: n */
    public abstract int mo930n(float f2, float f3);

    /* renamed from: o */
    public abstract void mo931o(List<Integer> list);

    /* JADX WARN: Removed duplicated region for block: B:117:0x0134 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0185  */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m932p(int r20, android.graphics.Rect r21) {
        /*
            Method dump skipped, instructions count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p049j.p051b.AbstractC0288a.m932p(int, android.graphics.Rect):boolean");
    }

    /* renamed from: q */
    public C0245b m933q(int i) {
        if (i != -1) {
            return m928l(i);
        }
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(this.f1727i);
        C0245b c0245b = new C0245b(accessibilityNodeInfoObtain);
        View view = this.f1727i;
        WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
        view.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
        ArrayList arrayList = new ArrayList();
        mo931o(arrayList);
        if (c0245b.f1563a.getChildCount() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            c0245b.f1563a.addChild(this.f1727i, ((Integer) arrayList.get(i2)).intValue());
        }
        return c0245b;
    }

    /* renamed from: r */
    public abstract boolean mo934r(int i, int i2, Bundle bundle);

    /* renamed from: s */
    public void mo935s(C0245b c0245b) {
    }

    /* renamed from: t */
    public abstract void mo936t(int i, C0245b c0245b);

    /* renamed from: u */
    public void mo937u(int i, boolean z) {
    }

    /* renamed from: v */
    public final boolean m938v(int i) {
        int i2;
        if ((!this.f1727i.isFocused() && !this.f1727i.requestFocus()) || (i2 = this.f1730l) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            m927k(i2);
        }
        this.f1730l = i;
        mo937u(i, true);
        m939w(i, 8);
        return true;
    }

    /* renamed from: w */
    public final boolean m939w(int i, int i2) {
        ViewParent parent;
        AccessibilityEvent accessibilityEventObtain;
        if (i == Integer.MIN_VALUE || !this.f1726h.isEnabled() || (parent = this.f1727i.getParent()) == null) {
            return false;
        }
        if (i != -1) {
            accessibilityEventObtain = AccessibilityEvent.obtain(i2);
            C0245b c0245bM933q = m933q(i);
            accessibilityEventObtain.getText().add(c0245bM933q.m822g());
            accessibilityEventObtain.setContentDescription(c0245bM933q.m820e());
            accessibilityEventObtain.setScrollable(c0245bM933q.f1563a.isScrollable());
            accessibilityEventObtain.setPassword(c0245bM933q.f1563a.isPassword());
            accessibilityEventObtain.setEnabled(c0245bM933q.f1563a.isEnabled());
            accessibilityEventObtain.setChecked(c0245bM933q.f1563a.isChecked());
            if (accessibilityEventObtain.getText().isEmpty() && accessibilityEventObtain.getContentDescription() == null) {
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            }
            accessibilityEventObtain.setClassName(c0245bM933q.f1563a.getClassName());
            accessibilityEventObtain.setSource(this.f1727i, i);
            accessibilityEventObtain.setPackageName(this.f1727i.getContext().getPackageName());
        } else {
            accessibilityEventObtain = AccessibilityEvent.obtain(i2);
            this.f1727i.onInitializeAccessibilityEvent(accessibilityEventObtain);
        }
        return parent.requestSendAccessibilityEvent(this.f1727i, accessibilityEventObtain);
    }

    /* renamed from: x */
    public final void m940x(int i) {
        int i2 = this.f1731m;
        if (i2 == i) {
            return;
        }
        this.f1731m = i;
        m939w(i, 128);
        m939w(i2, 256);
    }
}
