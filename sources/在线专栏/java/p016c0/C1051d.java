package p016c0;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

/* renamed from: c0.d */
/* loaded from: classes.dex */
public class C1051d {

    /* renamed from: a */
    private final Object f6236a;

    /* renamed from: c0.d$a */
    static class a extends AccessibilityNodeProvider {

        /* renamed from: a */
        final C1051d f6237a;

        a(C1051d c1051d) {
            this.f6237a = c1051d;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i4) {
            C1050c c1050cMo2222b = this.f6237a.mo2222b(i4);
            if (c1050cMo2222b == null) {
                return null;
            }
            return c1050cMo2222b.m4859G0();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i4) {
            List<C1050c> listM4926c = this.f6237a.m4926c(str, i4);
            if (listM4926c == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = listM4926c.size();
            for (int i5 = 0; i5 < size; i5++) {
                arrayList.add(listM4926c.get(i5).m4859G0());
            }
            return arrayList;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i4, int i5, Bundle bundle) {
            return this.f6237a.mo2224f(i4, i5, bundle);
        }
    }

    /* renamed from: c0.d$b */
    static class b extends a {
        b(C1051d c1051d) {
            super(c1051d);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int i4) {
            C1050c c1050cMo2223d = this.f6237a.mo2223d(i4);
            if (c1050cMo2223d == null) {
                return null;
            }
            return c1050cMo2223d.m4859G0();
        }
    }

    /* renamed from: c0.d$c */
    static class c extends b {
        c(C1051d c1051d) {
            super(c1051d);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i4, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f6237a.m4925a(i4, C1050c.m4832H0(accessibilityNodeInfo), str, bundle);
        }
    }

    public C1051d() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f6236a = new c(this);
        } else {
            this.f6236a = new b(this);
        }
    }

    /* renamed from: a */
    public void m4925a(int i4, C1050c c1050c, String str, Bundle bundle) {
    }

    /* renamed from: b */
    public C1050c mo2222b(int i4) {
        return null;
    }

    /* renamed from: c */
    public List<C1050c> m4926c(String str, int i4) {
        return null;
    }

    /* renamed from: d */
    public C1050c mo2223d(int i4) {
        return null;
    }

    /* renamed from: e */
    public Object m4927e() {
        return this.f6236a;
    }

    /* renamed from: f */
    public boolean mo2224f(int i4, int i5, Bundle bundle) {
        return false;
    }

    public C1051d(Object obj) {
        this.f6236a = obj;
    }
}
