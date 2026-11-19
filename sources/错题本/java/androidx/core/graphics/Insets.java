package androidx.core.graphics;

import android.graphics.Rect;
import android.support.v4.media.AbstractC0037f;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes2.dex */
public final class Insets {
    public static final Insets NONE = new Insets(0, 0, 0, 0);
    public final int bottom;
    public final int left;
    public final int right;

    /* renamed from: top, reason: collision with root package name */
    public final int f11683top;

    @RequiresApi(ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS)
    public static class Api29Impl {
        private Api29Impl() {
        }

        /* renamed from: of */
        public static android.graphics.Insets m1567of(int i, int i8, int i9, int i10) {
            return android.graphics.Insets.of(i, i8, i9, i10);
        }
    }

    private Insets(int i, int i8, int i9, int i10) {
        this.left = i;
        this.f11683top = i8;
        this.right = i9;
        this.bottom = i10;
    }

    public static Insets add(Insets insets, Insets insets2) {
        return m1565of(insets.left + insets2.left, insets.f11683top + insets2.f11683top, insets.right + insets2.right, insets.bottom + insets2.bottom);
    }

    public static Insets max(Insets insets, Insets insets2) {
        return m1565of(Math.max(insets.left, insets2.left), Math.max(insets.f11683top, insets2.f11683top), Math.max(insets.right, insets2.right), Math.max(insets.bottom, insets2.bottom));
    }

    public static Insets min(Insets insets, Insets insets2) {
        return m1565of(Math.min(insets.left, insets2.left), Math.min(insets.f11683top, insets2.f11683top), Math.min(insets.right, insets2.right), Math.min(insets.bottom, insets2.bottom));
    }

    /* renamed from: of */
    public static Insets m1565of(int i, int i8, int i9, int i10) {
        return (i == 0 && i8 == 0 && i9 == 0 && i10 == 0) ? NONE : new Insets(i, i8, i9, i10);
    }

    public static Insets subtract(Insets insets, Insets insets2) {
        return m1565of(insets.left - insets2.left, insets.f11683top - insets2.f11683top, insets.right - insets2.right, insets.bottom - insets2.bottom);
    }

    @RequiresApi(api = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS)
    public static Insets toCompatInsets(android.graphics.Insets insets) {
        return m1565of(insets.left, insets.top, insets.right, insets.bottom);
    }

    @RequiresApi(api = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS)
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
        return this.bottom == insets.bottom && this.left == insets.left && this.right == insets.right && this.f11683top == insets.f11683top;
    }

    public int hashCode() {
        return (((((this.left * 31) + this.f11683top) * 31) + this.right) * 31) + this.bottom;
    }

    @RequiresApi(ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS)
    public android.graphics.Insets toPlatformInsets() {
        return Api29Impl.m1567of(this.left, this.f11683top, this.right, this.bottom);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Insets{left=");
        sb.append(this.left);
        sb.append(", top=");
        sb.append(this.f11683top);
        sb.append(", right=");
        sb.append(this.right);
        sb.append(", bottom=");
        return AbstractC0037f.m88m(sb, this.bottom, '}');
    }

    /* renamed from: of */
    public static Insets m1566of(Rect rect) {
        return m1565of(rect.left, rect.top, rect.right, rect.bottom);
    }
}
