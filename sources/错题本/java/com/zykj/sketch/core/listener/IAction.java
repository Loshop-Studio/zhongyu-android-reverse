package com.zykj.sketch.core.listener;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import com.zykj.sketch.EzyDrawBoard;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u0006J\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH&¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0011H&¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H&¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m5110d2 = {"Lcom/zykj/sketch/core/listener/IAction;", "", "Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;", NotificationCompat.CATEGORY_EVENT, "Ld6/s;", "onTouchDown", "(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;)V", "onTouchPointerDown", "onTouchMove", "onTouchPointerUp", "onTouchUp", "", "getTouchEventList", "()Ljava/util/List;", "", "getTouchStartTime", "()J", "", "isRecord", "()Z", "record", "setRecord", "(Z)V", "Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;", "enumType", "()Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;", "sketch_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public interface IAction {
    @NotNull
    EzyDrawBoard.ActionModeConfig.Mode enumType();

    @NotNull
    List<EzyDrawBoard.ActionTouchEvent.TouchEvent> getTouchEventList();

    long getTouchStartTime();

    boolean isRecord();

    void onTouchDown(@NotNull EzyDrawBoard.ActionTouchEvent.TouchEvent event);

    void onTouchMove(@NotNull EzyDrawBoard.ActionTouchEvent.TouchEvent event);

    void onTouchPointerDown(@NotNull EzyDrawBoard.ActionTouchEvent.TouchEvent event);

    void onTouchPointerUp(@NotNull EzyDrawBoard.ActionTouchEvent.TouchEvent event);

    void onTouchUp(@NotNull EzyDrawBoard.ActionTouchEvent.TouchEvent event);

    void setRecord(boolean record);
}
