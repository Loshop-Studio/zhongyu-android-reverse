package androidx.compose.p014ui.platform;

/* loaded from: classes2.dex */
public interface AccessibilityManager {

    public static final class DefaultImpls {
    }

    static /* synthetic */ long calculateRecommendedTimeoutMillis$default(AccessibilityManager accessibilityManager, long j10, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: calculateRecommendedTimeoutMillis");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        if ((i10 & 8) != 0) {
            z12 = false;
        }
        return accessibilityManager.calculateRecommendedTimeoutMillis(j10, z10, z11, z12);
    }

    long calculateRecommendedTimeoutMillis(long j10, boolean z10, boolean z11, boolean z12);
}
