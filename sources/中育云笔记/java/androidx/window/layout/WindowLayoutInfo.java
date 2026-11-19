package androidx.window.layout;

import androidx.annotation.RestrictTo;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;
import p325rc.AbstractC10947g0;

/* loaded from: classes3.dex */
public final class WindowLayoutInfo {
    private final List<DisplayFeature> displayFeatures;

    /* JADX WARN: Multi-variable type inference failed */
    @RestrictTo({RestrictTo.Scope.TESTS})
    public WindowLayoutInfo(List<? extends DisplayFeature> displayFeatures) {
        AbstractC9979u.m20294g(displayFeatures, "displayFeatures");
        this.displayFeatures = displayFeatures;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !AbstractC9979u.m20289b(WindowLayoutInfo.class, obj.getClass())) {
            return false;
        }
        return AbstractC9979u.m20289b(this.displayFeatures, ((WindowLayoutInfo) obj).displayFeatures);
    }

    public final List<DisplayFeature> getDisplayFeatures() {
        return this.displayFeatures;
    }

    public int hashCode() {
        return this.displayFeatures.hashCode();
    }

    public String toString() {
        return AbstractC10947g0.m23954w0(this.displayFeatures, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", 0, null, null, 56, null);
    }
}
