package androidx.constraintlayout.core.motion.utils;

/* loaded from: classes2.dex */
public class Rect {
    public int bottom;
    public int left;
    public int right;

    /* renamed from: top, reason: collision with root package name */
    public int f18125top;

    public int height() {
        return this.bottom - this.f18125top;
    }

    public int width() {
        return this.right - this.left;
    }
}
