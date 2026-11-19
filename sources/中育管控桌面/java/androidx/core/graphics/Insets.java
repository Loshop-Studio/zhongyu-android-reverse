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
    public final int top;

    @RequiresApi(29)
    public static class Api29Impl {
        private Api29Impl() {
        }

        /* renamed from: of */
        public static android.graphics.Insets m729of(int i6, int i7, int i8, int i9) {
            return android.graphics.Insets.of(i6, i7, i8, i9);
        }
    }

    private Insets(int i6, int i7, int i8, int i9) {
        this.left = i6;
        this.top = i7;
        this.right = i8;
        this.bottom = i9;
    }

    public static Insets add(Insets insets, Insets insets2) {
        return m727of(insets.left + insets2.left, insets.top + insets2.top, insets.right + insets2.right, insets.bottom + insets2.bottom);
    }

    public static Insets max(Insets insets, Insets insets2) {
        return m727of(Math.max(insets.left, insets2.left), Math.max(insets.top, insets2.top), Math.max(insets.right, insets2.right), Math.max(insets.bottom, insets2.bottom));
    }

    public static Insets min(Insets insets, Insets insets2) {
        return m727of(Math.min(insets.left, insets2.left), Math.min(insets.top, insets2.top), Math.min(insets.right, insets2.right), Math.min(insets.bottom, insets2.bottom));
    }

    /* renamed from: of */
    public static Insets m727of(int i6, int i7, int i8, int i9) {
        return (i6 == 0 && i7 == 0 && i8 == 0 && i9 == 0) ? NONE : new Insets(i6, i7, i8, i9);
    }

    public static Insets subtract(Insets insets, Insets insets2) {
        return m727of(insets.left - insets2.left, insets.top - insets2.top, insets.right - insets2.right, insets.bottom - insets2.bottom);
    }

    @RequiresApi(api = 29)
    public static Insets toCompatInsets(android.graphics.Insets insets) {
        return m727of(insets.left, insets.top, insets.right, insets.bottom);
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
        return this.bottom == insets.bottom && this.left == insets.left && this.right == insets.right && this.top == insets.top;
    }

    public int hashCode() {
        return (((((this.left * 31) + this.top) * 31) + this.right) * 31) + this.bottom;
    }

    @RequiresApi(29)
    public android.graphics.Insets toPlatformInsets() {
        return Api29Impl.m729of(this.left, this.top, this.right, this.bottom);
    }

    public String toString() {
        return "Insets{left=" + this.left + ", top=" + this.top + ", right=" + this.right + ", bottom=" + this.bottom + '}';
    }

    /* renamed from: of */
    public static Insets m728of(Rect rect) {
        return m727of(rect.left, rect.top, rect.right, rect.bottom);
    }
}
