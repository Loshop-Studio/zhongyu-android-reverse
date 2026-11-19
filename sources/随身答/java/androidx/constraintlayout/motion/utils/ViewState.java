package androidx.constraintlayout.motion.utils;

import android.view.View;

/* loaded from: classes2.dex */
public class ViewState {
    public int bottom;
    public int left;
    public int right;
    public float rotation;

    /* renamed from: top, reason: collision with root package name */
    public int f18128top;

    public void getState(View view) {
        this.left = view.getLeft();
        this.f18128top = view.getTop();
        this.right = view.getRight();
        this.bottom = view.getBottom();
        this.rotation = view.getRotation();
    }

    public int height() {
        return this.bottom - this.f18128top;
    }

    public int width() {
        return this.right - this.left;
    }
}
