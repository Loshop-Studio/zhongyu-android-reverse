package com.zykj.sketch.core.listener;

import androidx.core.app.NotificationCompat;
import com.zykj.sketch.EzyDrawBoard;
import java.util.List;
import kotlin.Metadata;

@Metadata(m13557d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0006H&J\u0010\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0006H&J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0006H&J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0006H&J\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0006H&J\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\nH&¨\u0006\u0014"}, m13558d2 = {"Lcom/zykj/sketch/core/listener/IAction;", "", "enumType", "Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;", "getTouchEventList", "", "Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;", "getTouchStartTime", "", "isRecord", "", "onTouchDown", "", NotificationCompat.CATEGORY_EVENT, "onTouchMove", "onTouchPointerDown", "onTouchPointerUp", "onTouchUp", "setRecord", "record", "sketch_release"}, m13559k = 1, m13560mv = {1, 7, 1}, m13562xi = 48)
/* loaded from: classes5.dex */
public interface IAction {
    EzyDrawBoard.ActionModeConfig.Mode enumType();

    List<EzyDrawBoard.ActionTouchEvent.TouchEvent> getTouchEventList();

    long getTouchStartTime();

    boolean isRecord();

    void onTouchDown(EzyDrawBoard.ActionTouchEvent.TouchEvent event);

    void onTouchMove(EzyDrawBoard.ActionTouchEvent.TouchEvent event);

    void onTouchPointerDown(EzyDrawBoard.ActionTouchEvent.TouchEvent event);

    void onTouchPointerUp(EzyDrawBoard.ActionTouchEvent.TouchEvent event);

    void onTouchUp(EzyDrawBoard.ActionTouchEvent.TouchEvent event);

    void setRecord(boolean record);
}
