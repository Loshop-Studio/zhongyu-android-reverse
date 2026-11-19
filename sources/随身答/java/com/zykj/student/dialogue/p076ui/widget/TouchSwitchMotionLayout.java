package com.zykj.student.dialogue.p076ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.motion.widget.MotionLayout;

/* loaded from: classes5.dex */
public class TouchSwitchMotionLayout extends MotionLayout {

    /* renamed from: a */
    public boolean f11908a;

    public TouchSwitchMotionLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11908a = false;
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f11908a;
    }

    public void setIntercepted(boolean z9) {
        this.f11908a = z9;
    }
}
