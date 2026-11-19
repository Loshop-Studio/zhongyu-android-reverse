package com.zykj.view.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes3.dex */
public class TouchSwitchView extends ConstraintLayout {
    private boolean canTouch;

    public TouchSwitchView(@NonNull Context context) {
        super(context);
        this.canTouch = true;
    }

    public boolean canTouch() {
        return this.canTouch;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return !this.canTouch;
    }

    public void setCanTouch(boolean z8) {
        this.canTouch = z8;
    }

    public TouchSwitchView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.canTouch = true;
    }

    public TouchSwitchView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.canTouch = true;
    }
}
