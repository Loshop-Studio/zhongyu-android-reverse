package p129h7;

import android.graphics.RectF;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: h7.e */
/* loaded from: classes5.dex */
public final class C8109e {

    /* renamed from: a */
    public final int f13860a;

    /* renamed from: b */
    public final RectF f13861b;

    public C8109e(int i9, RectF bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        this.f13860a = i9;
        this.f13861b = bounds;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8109e)) {
            return false;
        }
        C8109e c8109e = (C8109e) obj;
        return this.f13860a == c8109e.f13860a && Intrinsics.areEqual(this.f13861b, c8109e.f13861b);
    }

    public int hashCode() {
        return (Integer.hashCode(this.f13860a) * 31) + this.f13861b.hashCode();
    }

    public String toString() {
        return "SimpleBoardSelectionInfo(count=" + this.f13860a + ", bounds=" + this.f13861b + ")";
    }
}
