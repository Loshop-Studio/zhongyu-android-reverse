package p016c0;

import android.view.View;
import android.view.accessibility.AccessibilityRecord;

/* renamed from: c0.e */
/* loaded from: classes.dex */
public class C1052e {
    /* renamed from: a */
    public static void m4928a(AccessibilityRecord accessibilityRecord, int i4) {
        accessibilityRecord.setMaxScrollX(i4);
    }

    /* renamed from: b */
    public static void m4929b(AccessibilityRecord accessibilityRecord, int i4) {
        accessibilityRecord.setMaxScrollY(i4);
    }

    /* renamed from: c */
    public static void m4930c(AccessibilityRecord accessibilityRecord, View view, int i4) {
        accessibilityRecord.setSource(view, i4);
    }
}
