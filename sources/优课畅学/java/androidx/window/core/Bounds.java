package androidx.window.core;

import android.graphics.Rect;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes3.dex */
public final class Bounds {
    private final int bottom;
    private final int left;
    private final int right;

    /* renamed from: top, reason: collision with root package name */
    private final int f21467top;

    public Bounds(int i10, int i11, int i12, int i13) {
        this.left = i10;
        this.f21467top = i11;
        this.right = i12;
        this.bottom = i13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AbstractC9133u.m16128b(Bounds.class, obj == null ? null : obj.getClass())) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.window.core.Bounds");
        }
        Bounds bounds = (Bounds) obj;
        return this.left == bounds.left && this.f21467top == bounds.f21467top && this.right == bounds.right && this.bottom == bounds.bottom;
    }

    public final int getBottom() {
        return this.bottom;
    }

    public final int getHeight() {
        return this.bottom - this.f21467top;
    }

    public final int getLeft() {
        return this.left;
    }

    public final int getRight() {
        return this.right;
    }

    public final int getTop() {
        return this.f21467top;
    }

    public final int getWidth() {
        return this.right - this.left;
    }

    public int hashCode() {
        return (((((this.left * 31) + this.f21467top) * 31) + this.right) * 31) + this.bottom;
    }

    public final boolean isEmpty() {
        return getHeight() == 0 || getWidth() == 0;
    }

    public final boolean isZero() {
        return getHeight() == 0 && getWidth() == 0;
    }

    public final Rect toRect() {
        return new Rect(this.left, this.f21467top, this.right, this.bottom);
    }

    public String toString() {
        return ((Object) Bounds.class.getSimpleName()) + " { [" + this.left + ',' + this.f21467top + ',' + this.right + ',' + this.bottom + "] }";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Bounds(Rect rect) {
        this(rect.left, rect.top, rect.right, rect.bottom);
        AbstractC9133u.m16133g(rect, "rect");
    }
}
