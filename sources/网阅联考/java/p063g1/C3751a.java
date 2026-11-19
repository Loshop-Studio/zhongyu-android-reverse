package p063g1;

import com.xuexiang.xui.widget.picker.wheelview.WheelView;
import java.util.TimerTask;

/* renamed from: g1.a */
/* loaded from: classes2.dex */
public final class C3751a extends TimerTask {

    /* renamed from: a */
    public float f4399a = 2.1474836E9f;

    /* renamed from: b */
    public final float f4400b;

    /* renamed from: c */
    public final WheelView f4401c;

    public C3751a(WheelView wheelView, float f4) {
        this.f4401c = wheelView;
        this.f4400b = f4;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        if (this.f4399a == 2.1474836E9f) {
            if (Math.abs(this.f4400b) > 2000.0f) {
                this.f4399a = this.f4400b <= 0.0f ? -2000.0f : 2000.0f;
            } else {
                this.f4399a = this.f4400b;
            }
        }
        if (Math.abs(this.f4399a) >= 0.0f && Math.abs(this.f4399a) <= 20.0f) {
            this.f4401c.m4491a();
            this.f4401c.getHandler().sendEmptyMessage(2000);
            return;
        }
        int i4 = (int) (this.f4399a / 100.0f);
        WheelView wheelView = this.f4401c;
        float f4 = i4;
        wheelView.setTotalScrollY(wheelView.getTotalScrollY() - f4);
        if (!this.f4401c.m4494d()) {
            float itemHeight = this.f4401c.getItemHeight();
            float totalScrollY = (-this.f4401c.getInitPosition()) * itemHeight;
            float itemsCount = ((this.f4401c.getItemsCount() - 1) - this.f4401c.getInitPosition()) * itemHeight;
            double d4 = itemHeight * 0.25d;
            if (this.f4401c.getTotalScrollY() - d4 < totalScrollY) {
                totalScrollY = this.f4401c.getTotalScrollY() + f4;
            } else if (this.f4401c.getTotalScrollY() + d4 > itemsCount) {
                itemsCount = this.f4401c.getTotalScrollY() + f4;
            }
            if (this.f4401c.getTotalScrollY() <= totalScrollY) {
                this.f4399a = 40.0f;
                this.f4401c.setTotalScrollY((int) totalScrollY);
            } else if (this.f4401c.getTotalScrollY() >= itemsCount) {
                this.f4401c.setTotalScrollY((int) itemsCount);
                this.f4399a = -40.0f;
            }
        }
        float f5 = this.f4399a;
        if (f5 < 0.0f) {
            this.f4399a = f5 + 20.0f;
        } else {
            this.f4399a = f5 - 20.0f;
        }
        this.f4401c.getHandler().sendEmptyMessage(1000);
    }
}
