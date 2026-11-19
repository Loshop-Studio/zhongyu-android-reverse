package com.zykj.sketch.core.listener;

import com.zykj.sketch.EzyDrawBoard;
import java.util.List;

/* loaded from: classes3.dex */
public interface IAction {
    EzyDrawBoard.ActionModeConfig.Mode enumType();

    List<EzyDrawBoard.ActionTouchEvent.TouchEvent> getTouchEventList();

    long getTouchStartTime();

    boolean isRecord();

    void onTouchDown(EzyDrawBoard.ActionTouchEvent.TouchEvent touchEvent);

    void onTouchMove(EzyDrawBoard.ActionTouchEvent.TouchEvent touchEvent);

    void onTouchPointerDown(EzyDrawBoard.ActionTouchEvent.TouchEvent touchEvent);

    void onTouchPointerUp(EzyDrawBoard.ActionTouchEvent.TouchEvent touchEvent);

    void onTouchUp(EzyDrawBoard.ActionTouchEvent.TouchEvent touchEvent);

    void setRecord(boolean z10);
}
