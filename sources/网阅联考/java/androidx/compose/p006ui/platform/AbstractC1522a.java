package androidx.compose.p006ui.platform;

/* renamed from: androidx.compose.ui.platform.a */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1522a {
    /* renamed from: a */
    public static /* synthetic */ long m742a(AccessibilityManager accessibilityManager, long j4, boolean z3, boolean z4, boolean z5, int i4, Object obj) {
        if (obj == null) {
            return accessibilityManager.calculateRecommendedTimeoutMillis(j4, (i4 & 2) != 0 ? false : z3, (i4 & 4) != 0 ? false : z4, (i4 & 8) != 0 ? false : z5);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: calculateRecommendedTimeoutMillis");
    }
}
