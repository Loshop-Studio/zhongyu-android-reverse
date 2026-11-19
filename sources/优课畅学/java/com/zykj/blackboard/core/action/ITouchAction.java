package com.zykj.blackboard.core.action;

import com.zykj.board.EzyTouchEvent;

/* loaded from: classes4.dex */
public interface ITouchAction {
    void onTouchDown(EzyTouchEvent.TouchEvent touchEvent);

    void onTouchMove(EzyTouchEvent.TouchEvent touchEvent);

    void onTouchPointerDown(EzyTouchEvent.TouchEvent touchEvent);

    void onTouchPointerUp(EzyTouchEvent.TouchEvent touchEvent);

    void onTouchUp(EzyTouchEvent.TouchEvent touchEvent);

    void reset();
}
