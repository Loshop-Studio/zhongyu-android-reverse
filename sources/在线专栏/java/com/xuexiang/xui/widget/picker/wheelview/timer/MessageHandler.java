package com.xuexiang.xui.widget.picker.wheelview.timer;

import android.os.Handler;
import android.os.Message;
import com.xuexiang.xui.widget.picker.wheelview.WheelView;

/* loaded from: classes.dex */
public final class MessageHandler extends Handler {
    public static final int WHAT_INVALIDATE_LOOP_VIEW = 1000;
    public static final int WHAT_ITEM_SELECTED = 3000;
    public static final int WHAT_SMOOTH_SCROLL = 2000;
    private final WheelView mWheelView;

    public MessageHandler(WheelView wheelView) {
        this.mWheelView = wheelView;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i4 = message.what;
        if (i4 == 1000) {
            this.mWheelView.invalidate();
        } else if (i4 == 2000) {
            this.mWheelView.smoothScroll(WheelView.ACTION.FLING);
        } else {
            if (i4 != 3000) {
                return;
            }
            this.mWheelView.onItemSelected();
        }
    }
}
