package p105f4;

import com.xuexiang.xui.widget.picker.wheelview.WheelView;
import java.util.TimerTask;

/* renamed from: f4.a */
/* loaded from: classes4.dex */
public final class C7920a extends TimerTask {

    /* renamed from: a */
    public float f13344a = 2.1474836E9f;

    /* renamed from: b */
    public final float f13345b;

    /* renamed from: c */
    public final WheelView f13346c;

    public C7920a(WheelView wheelView, float f10) {
        this.f13346c = wheelView;
        this.f13345b = f10;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        if (this.f13344a == 2.1474836E9f) {
            if (Math.abs(this.f13345b) > 2000.0f) {
                this.f13344a = this.f13345b <= 0.0f ? -2000.0f : 2000.0f;
            } else {
                this.f13344a = this.f13345b;
            }
        }
        if (Math.abs(this.f13344a) >= 0.0f && Math.abs(this.f13344a) <= 20.0f) {
            this.f13346c.m6950b();
            this.f13346c.getHandler().sendEmptyMessage(2000);
            return;
        }
        int i9 = (int) (this.f13344a / 100.0f);
        WheelView wheelView = this.f13346c;
        float f10 = i9;
        wheelView.setTotalScrollY(wheelView.getTotalScrollY() - f10);
        if (!this.f13346c.m6957i()) {
            float itemHeight = this.f13346c.getItemHeight();
            float totalScrollY = (-this.f13346c.getInitPosition()) * itemHeight;
            float itemsCount = ((this.f13346c.getItemsCount() - 1) - this.f13346c.getInitPosition()) * itemHeight;
            double d10 = itemHeight * 0.25d;
            if (this.f13346c.getTotalScrollY() - d10 < totalScrollY) {
                totalScrollY = this.f13346c.getTotalScrollY() + f10;
            } else if (this.f13346c.getTotalScrollY() + d10 > itemsCount) {
                itemsCount = this.f13346c.getTotalScrollY() + f10;
            }
            if (this.f13346c.getTotalScrollY() <= totalScrollY) {
                this.f13344a = 40.0f;
                this.f13346c.setTotalScrollY((int) totalScrollY);
            } else if (this.f13346c.getTotalScrollY() >= itemsCount) {
                this.f13346c.setTotalScrollY((int) itemsCount);
                this.f13344a = -40.0f;
            }
        }
        float f11 = this.f13344a;
        if (f11 < 0.0f) {
            this.f13344a = f11 + 20.0f;
        } else {
            this.f13344a = f11 - 20.0f;
        }
        this.f13346c.getHandler().sendEmptyMessage(1000);
    }
}
