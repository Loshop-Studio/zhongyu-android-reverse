package p000a.p031h.p043j.p044a0;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;
import java.util.Objects;

/* renamed from: a.h.j.a0.c */
/* loaded from: classes.dex */
public class C0246c {

    /* renamed from: a */
    public final Object f1580a;

    /* renamed from: a.h.j.a0.c$a */
    public static class a extends AccessibilityNodeProvider {

        /* renamed from: a */
        public final C0246c f1581a;

        public a(C0246c c0246c) {
            this.f1581a = c0246c;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            C0245b c0245bMo829a = this.f1581a.mo829a(i);
            if (c0245bMo829a == null) {
                return null;
            }
            return c0245bMo829a.f1563a;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
            Objects.requireNonNull(this.f1581a);
            return null;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i, int i2, Bundle bundle) {
            return this.f1581a.mo831c(i, i2, bundle);
        }
    }

    /* renamed from: a.h.j.a0.c$b */
    public static class b extends a {
        public b(C0246c c0246c) {
            super(c0246c);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int i) {
            C0245b c0245bMo830b = this.f1581a.mo830b(i);
            if (c0245bMo830b == null) {
                return null;
            }
            return c0245bMo830b.f1563a;
        }
    }

    /* renamed from: a.h.j.a0.c$c */
    public static class c extends b {
        public c(C0246c c0246c) {
            super(c0246c);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            Objects.requireNonNull(this.f1581a);
        }
    }

    public C0246c() {
        this.f1580a = Build.VERSION.SDK_INT >= 26 ? new c(this) : new b(this);
    }

    public C0246c(Object obj) {
        this.f1580a = obj;
    }

    /* renamed from: a */
    public C0245b mo829a(int i) {
        return null;
    }

    /* renamed from: b */
    public C0245b mo830b(int i) {
        return null;
    }

    /* renamed from: c */
    public boolean mo831c(int i, int i2, Bundle bundle) {
        return false;
    }
}
