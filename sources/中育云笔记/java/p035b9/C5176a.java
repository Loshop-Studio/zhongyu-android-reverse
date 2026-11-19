package p035b9;

import com.shuyu.gsyvideoplayer.video.base.GSYVideoView;
import com.xuexiang.xui.widget.picker.wheelview.WheelView;
import java.util.TimerTask;

/* renamed from: b9.a */
/* loaded from: classes5.dex */
public final class C5176a extends TimerTask {

    /* renamed from: c */
    public float f3037c = 2.1474836E9f;

    /* renamed from: d */
    public final float f3038d;

    /* renamed from: e */
    public final WheelView f3039e;

    public C5176a(WheelView wheelView, float f10) {
        this.f3039e = wheelView;
        this.f3038d = f10;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        if (this.f3037c == 2.1474836E9f) {
            if (Math.abs(this.f3038d) > 2000.0f) {
                this.f3037c = this.f3038d <= 0.0f ? -2000.0f : 2000.0f;
            } else {
                this.f3037c = this.f3038d;
            }
        }
        if (Math.abs(this.f3037c) >= 0.0f && Math.abs(this.f3037c) <= 20.0f) {
            this.f3039e.m13017a();
            this.f3039e.getHandler().sendEmptyMessage(GSYVideoView.CHANGE_DELAY_TIME);
            return;
        }
        int i10 = (int) (this.f3037c / 100.0f);
        WheelView wheelView = this.f3039e;
        float f10 = i10;
        wheelView.setTotalScrollY(wheelView.getTotalScrollY() - f10);
        if (!this.f3039e.m13020d()) {
            float itemHeight = this.f3039e.getItemHeight();
            float totalScrollY = (-this.f3039e.getInitPosition()) * itemHeight;
            float itemsCount = ((this.f3039e.getItemsCount() - 1) - this.f3039e.getInitPosition()) * itemHeight;
            double d10 = itemHeight * 0.25d;
            if (this.f3039e.getTotalScrollY() - d10 < totalScrollY) {
                totalScrollY = this.f3039e.getTotalScrollY() + f10;
            } else if (this.f3039e.getTotalScrollY() + d10 > itemsCount) {
                itemsCount = this.f3039e.getTotalScrollY() + f10;
            }
            if (this.f3039e.getTotalScrollY() <= totalScrollY) {
                this.f3037c = 40.0f;
                this.f3039e.setTotalScrollY((int) totalScrollY);
            } else if (this.f3039e.getTotalScrollY() >= itemsCount) {
                this.f3039e.setTotalScrollY((int) itemsCount);
                this.f3037c = -40.0f;
            }
        }
        float f11 = this.f3037c;
        if (f11 < 0.0f) {
            this.f3037c = f11 + 20.0f;
        } else {
            this.f3037c = f11 - 20.0f;
        }
        this.f3039e.getHandler().sendEmptyMessage(1000);
    }
}
