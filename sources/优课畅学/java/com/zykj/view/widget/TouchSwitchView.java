package com.zykj.view.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes5.dex */
public class TouchSwitchView extends ConstraintLayout {

    /* renamed from: a */
    public boolean f15636a;

    public TouchSwitchView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15636a = true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return !this.f15636a;
    }

    public void setCanTouch(boolean z10) {
        this.f15636a = z10;
    }
}
