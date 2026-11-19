package com.zykj.blackboard.core.action;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import com.zykj.board.EzyTouchEvent$TouchEvent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\u0004H&¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m5110d2 = {"Lcom/zykj/blackboard/core/action/ITouchAction;", "", "Lcom/zykj/board/EzyTouchEvent$TouchEvent;", NotificationCompat.CATEGORY_EVENT, "Ld6/s;", "onTouchDown", "(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V", "onTouchPointerDown", "onTouchMove", "onTouchPointerUp", "onTouchUp", "reset", "()V", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public interface ITouchAction {
    void onTouchDown(@NotNull EzyTouchEvent$TouchEvent event);

    void onTouchMove(@NotNull EzyTouchEvent$TouchEvent event);

    void onTouchPointerDown(@NotNull EzyTouchEvent$TouchEvent event);

    void onTouchPointerUp(@NotNull EzyTouchEvent$TouchEvent event);

    void onTouchUp(@NotNull EzyTouchEvent$TouchEvent event);

    void reset();
}
