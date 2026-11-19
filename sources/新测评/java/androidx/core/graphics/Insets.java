package androidx.core.graphics;

import android.graphics.Rect;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

/* loaded from: classes2.dex */
public final class Insets {
    public static final Insets NONE = new Insets(0, 0, 0, 0);
    public final int bottom;
    public final int left;
    public final int right;

    /* renamed from: top, reason: collision with root package name */
    public final int f18238top;

    @RequiresApi(29)
    public static class Api29Impl {
        private Api29Impl() {
        }

        /* renamed from: of */
        public static android.graphics.Insets m1667of(int i10, int i11, int i12, int i13) {
            return android.graphics.Insets.of(i10, i11, i12, i13);
        }
    }

    private Insets(int i10, int i11, int i12, int i13) {
        this.left = i10;
        this.f18238top = i11;
        this.right = i12;
        this.bottom = i13;
    }

    public static Insets add(Insets insets, Insets insets2) {
        return m1665of(insets.left + insets2.left, insets.f18238top + insets2.f18238top, insets.right + insets2.right, insets.bottom + insets2.bottom);
    }

    public static Insets max(Insets insets, Insets insets2) {
        return m1665of(Math.max(insets.left, insets2.left), Math.max(insets.f18238top, insets2.f18238top), Math.max(insets.right, insets2.right), Math.max(insets.bottom, insets2.bottom));
    }

    public static Insets min(Insets insets, Insets insets2) {
        return m1665of(Math.min(insets.left, insets2.left), Math.min(insets.f18238top, insets2.f18238top), Math.min(insets.right, insets2.right), Math.min(insets.bottom, insets2.bottom));
    }

    /* renamed from: of */
    public static Insets m1665of(int i10, int i11, int i12, int i13) {
        return (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) ? NONE : new Insets(i10, i11, i12, i13);
    }

    public static Insets subtract(Insets insets, Insets insets2) {
        return m1665of(insets.left - insets2.left, insets.f18238top - insets2.f18238top, insets.right - insets2.right, insets.bottom - insets2.bottom);
    }

    @RequiresApi(api = 29)
    public static Insets toCompatInsets(android.graphics.Insets insets) {
        return m1665of(insets.left, insets.top, insets.right, insets.bottom);
    }

    @RequiresApi(api = 29)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public static Insets wrap(android.graphics.Insets insets) {
        return toCompatInsets(insets);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Insets.class != obj.getClass()) {
            return false;
        }
        Insets insets = (Insets) obj;
        return this.bottom == insets.bottom && this.left == insets.left && this.right == insets.right && this.f18238top == insets.f18238top;
    }

    public int hashCode() {
        return (((((this.left * 31) + this.f18238top) * 31) + this.right) * 31) + this.bottom;
    }

    @RequiresApi(29)
    public android.graphics.Insets toPlatformInsets() {
        return Api29Impl.m1667of(this.left, this.f18238top, this.right, this.bottom);
    }

    public String toString() {
        return "Insets{left=" + this.left + ", top=" + this.f18238top + ", right=" + this.right + ", bottom=" + this.bottom + '}';
    }

    /* renamed from: of */
    public static Insets m1666of(Rect rect) {
        return m1665of(rect.left, rect.top, rect.right, rect.bottom);
    }
}
