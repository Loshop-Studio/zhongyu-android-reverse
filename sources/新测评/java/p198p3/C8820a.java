package p198p3;

import com.xuexiang.xui.widget.picker.wheelview.WheelView;
import java.util.TimerTask;

/* renamed from: p3.a */
/* loaded from: classes4.dex */
public final class C8820a extends TimerTask {

    /* renamed from: a */
    public float f14996a = 2.1474836E9f;

    /* renamed from: b */
    public final float f14997b;

    /* renamed from: c */
    public final WheelView f14998c;

    public C8820a(WheelView wheelView, float f10) {
        this.f14998c = wheelView;
        this.f14997b = f10;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        if (this.f14996a == 2.1474836E9f) {
            if (Math.abs(this.f14997b) > 2000.0f) {
                this.f14996a = this.f14997b <= 0.0f ? -2000.0f : 2000.0f;
            } else {
                this.f14996a = this.f14997b;
            }
        }
        if (Math.abs(this.f14996a) >= 0.0f && Math.abs(this.f14996a) <= 20.0f) {
            this.f14998c.m5852b();
            this.f14998c.getHandler().sendEmptyMessage(2000);
            return;
        }
        int i10 = (int) (this.f14996a / 100.0f);
        WheelView wheelView = this.f14998c;
        float f10 = i10;
        wheelView.setTotalScrollY(wheelView.getTotalScrollY() - f10);
        if (!this.f14998c.m5859i()) {
            float itemHeight = this.f14998c.getItemHeight();
            float totalScrollY = (-this.f14998c.getInitPosition()) * itemHeight;
            float itemsCount = ((this.f14998c.getItemsCount() - 1) - this.f14998c.getInitPosition()) * itemHeight;
            double d10 = itemHeight * 0.25d;
            if (this.f14998c.getTotalScrollY() - d10 < totalScrollY) {
                totalScrollY = this.f14998c.getTotalScrollY() + f10;
            } else if (this.f14998c.getTotalScrollY() + d10 > itemsCount) {
                itemsCount = this.f14998c.getTotalScrollY() + f10;
            }
            if (this.f14998c.getTotalScrollY() <= totalScrollY) {
                this.f14996a = 40.0f;
                this.f14998c.setTotalScrollY((int) totalScrollY);
            } else if (this.f14998c.getTotalScrollY() >= itemsCount) {
                this.f14998c.setTotalScrollY((int) itemsCount);
                this.f14996a = -40.0f;
            }
        }
        float f11 = this.f14996a;
        if (f11 < 0.0f) {
            this.f14996a = f11 + 20.0f;
        } else {
            this.f14996a = f11 - 20.0f;
        }
        this.f14998c.getHandler().sendEmptyMessage(1000);
    }
}
