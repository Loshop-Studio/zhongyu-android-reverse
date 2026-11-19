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
    public final int f18131top;

    @RequiresApi(29)
    public static class Api29Impl {
        private Api29Impl() {
        }

        /* renamed from: of */
        public static android.graphics.Insets m1445of(int i9, int i10, int i11, int i12) {
            return android.graphics.Insets.of(i9, i10, i11, i12);
        }
    }

    private Insets(int i9, int i10, int i11, int i12) {
        this.left = i9;
        this.f18131top = i10;
        this.right = i11;
        this.bottom = i12;
    }

    public static Insets add(Insets insets, Insets insets2) {
        return m1443of(insets.left + insets2.left, insets.f18131top + insets2.f18131top, insets.right + insets2.right, insets.bottom + insets2.bottom);
    }

    public static Insets max(Insets insets, Insets insets2) {
        return m1443of(Math.max(insets.left, insets2.left), Math.max(insets.f18131top, insets2.f18131top), Math.max(insets.right, insets2.right), Math.max(insets.bottom, insets2.bottom));
    }

    public static Insets min(Insets insets, Insets insets2) {
        return m1443of(Math.min(insets.left, insets2.left), Math.min(insets.f18131top, insets2.f18131top), Math.min(insets.right, insets2.right), Math.min(insets.bottom, insets2.bottom));
    }

    /* renamed from: of */
    public static Insets m1443of(int i9, int i10, int i11, int i12) {
        return (i9 == 0 && i10 == 0 && i11 == 0 && i12 == 0) ? NONE : new Insets(i9, i10, i11, i12);
    }

    public static Insets subtract(Insets insets, Insets insets2) {
        return m1443of(insets.left - insets2.left, insets.f18131top - insets2.f18131top, insets.right - insets2.right, insets.bottom - insets2.bottom);
    }

    @RequiresApi(api = 29)
    public static Insets toCompatInsets(android.graphics.Insets insets) {
        return m1443of(insets.left, insets.top, insets.right, insets.bottom);
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
        return this.bottom == insets.bottom && this.left == insets.left && this.right == insets.right && this.f18131top == insets.f18131top;
    }

    public int hashCode() {
        return (((((this.left * 31) + this.f18131top) * 31) + this.right) * 31) + this.bottom;
    }

    @RequiresApi(29)
    public android.graphics.Insets toPlatformInsets() {
        return Api29Impl.m1445of(this.left, this.f18131top, this.right, this.bottom);
    }

    public String toString() {
        return "Insets{left=" + this.left + ", top=" + this.f18131top + ", right=" + this.right + ", bottom=" + this.bottom + '}';
    }

    /* renamed from: of */
    public static Insets m1444of(Rect rect) {
        return m1443of(rect.left, rect.top, rect.right, rect.bottom);
    }
}
