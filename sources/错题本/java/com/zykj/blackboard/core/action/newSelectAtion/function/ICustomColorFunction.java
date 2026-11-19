package com.zykj.blackboard.core.action.newSelectAtion.function;

import android.view.MotionEvent;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bR\u001e\u0010\u000e\u001a\u0004\u0018\u00010\t8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000f"}, m5110d2 = {"Lcom/zykj/blackboard/core/action/newSelectAtion/function/ICustomColorFunction;", "", "Landroid/view/MotionEvent;", "motionEvent", "Ld6/s;", "handleTouchEvent", "(Landroid/view/MotionEvent;)V", "handleCustomColorUsed", "()V", "", "getLastChangeColor", "()Ljava/lang/Integer;", "setLastChangeColor", "(Ljava/lang/Integer;)V", "lastChangeColor", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public interface ICustomColorFunction {
    @Nullable
    Integer getLastChangeColor();

    void handleCustomColorUsed();

    void handleTouchEvent(@NotNull MotionEvent motionEvent);

    void setLastChangeColor(@Nullable Integer num);
}
