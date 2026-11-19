package com.xuexiang.xui.widget.picker.wheelview.timer;

import com.xuexiang.xui.widget.picker.wheelview.WheelView;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import java.util.TimerTask;

/* loaded from: classes.dex */
public final class InertiaTimerTask extends TimerTask {
    private float mCurrentVelocityY = 2.1474836E9f;
    private final float mFirstVelocityY;
    private final WheelView mWheelView;

    public InertiaTimerTask(WheelView wheelView, float f4) {
        this.mWheelView = wheelView;
        this.mFirstVelocityY = f4;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        if (this.mCurrentVelocityY == 2.1474836E9f) {
            if (Math.abs(this.mFirstVelocityY) > 2000.0f) {
                this.mCurrentVelocityY = this.mFirstVelocityY <= IGoodView.DEFAULT_TO_ALPHA ? -2000.0f : 2000.0f;
            } else {
                this.mCurrentVelocityY = this.mFirstVelocityY;
            }
        }
        if (Math.abs(this.mCurrentVelocityY) >= IGoodView.DEFAULT_TO_ALPHA && Math.abs(this.mCurrentVelocityY) <= 20.0f) {
            this.mWheelView.cancelFuture();
            this.mWheelView.getHandler().sendEmptyMessage(MessageHandler.WHAT_SMOOTH_SCROLL);
            return;
        }
        int i4 = (int) (this.mCurrentVelocityY / 100.0f);
        WheelView wheelView = this.mWheelView;
        float f4 = i4;
        wheelView.setTotalScrollY(wheelView.getTotalScrollY() - f4);
        if (!this.mWheelView.isLoop()) {
            float itemHeight = this.mWheelView.getItemHeight();
            float totalScrollY = (-this.mWheelView.getInitPosition()) * itemHeight;
            float itemsCount = ((this.mWheelView.getItemsCount() - 1) - this.mWheelView.getInitPosition()) * itemHeight;
            double d4 = itemHeight * 0.25d;
            if (this.mWheelView.getTotalScrollY() - d4 < totalScrollY) {
                totalScrollY = this.mWheelView.getTotalScrollY() + f4;
            } else if (this.mWheelView.getTotalScrollY() + d4 > itemsCount) {
                itemsCount = this.mWheelView.getTotalScrollY() + f4;
            }
            if (this.mWheelView.getTotalScrollY() <= totalScrollY) {
                this.mCurrentVelocityY = 40.0f;
                this.mWheelView.setTotalScrollY((int) totalScrollY);
            } else if (this.mWheelView.getTotalScrollY() >= itemsCount) {
                this.mWheelView.setTotalScrollY((int) itemsCount);
                this.mCurrentVelocityY = -40.0f;
            }
        }
        float f5 = this.mCurrentVelocityY;
        if (f5 < IGoodView.DEFAULT_TO_ALPHA) {
            this.mCurrentVelocityY = f5 + 20.0f;
        } else {
            this.mCurrentVelocityY = f5 - 20.0f;
        }
        this.mWheelView.getHandler().sendEmptyMessage(1000);
    }
}
