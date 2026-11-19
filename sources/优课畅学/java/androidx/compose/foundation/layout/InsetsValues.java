package androidx.compose.foundation.layout;

import androidx.compose.runtime.Immutable;

@Immutable
/* loaded from: classes.dex */
public final class InsetsValues {
    public static final int $stable = 0;
    private final int bottom;
    private final int left;
    private final int right;

    /* renamed from: top, reason: collision with root package name */
    private final int f21441top;

    public InsetsValues(int i10, int i11, int i12, int i13) {
        this.left = i10;
        this.f21441top = i11;
        this.right = i12;
        this.bottom = i13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InsetsValues)) {
            return false;
        }
        InsetsValues insetsValues = (InsetsValues) obj;
        return this.left == insetsValues.left && this.f21441top == insetsValues.f21441top && this.right == insetsValues.right && this.bottom == insetsValues.bottom;
    }

    public final int getBottom() {
        return this.bottom;
    }

    public final int getLeft() {
        return this.left;
    }

    public final int getRight() {
        return this.right;
    }

    public final int getTop() {
        return this.f21441top;
    }

    public int hashCode() {
        return (((((this.left * 31) + this.f21441top) * 31) + this.right) * 31) + this.bottom;
    }

    public String toString() {
        return "InsetsValues(left=" + this.left + ", top=" + this.f21441top + ", right=" + this.right + ", bottom=" + this.bottom + ')';
    }
}
