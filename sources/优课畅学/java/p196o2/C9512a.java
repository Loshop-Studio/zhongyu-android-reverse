package p196o2;

import com.xuexiang.xui.widget.picker.wheelview.WheelView;
import java.util.TimerTask;

/* renamed from: o2.a */
/* loaded from: classes4.dex */
public final class C9512a extends TimerTask {

    /* renamed from: a */
    public float f18889a = 2.1474836E9f;

    /* renamed from: b */
    public final float f18890b;

    /* renamed from: c */
    public final WheelView f18891c;

    public C9512a(WheelView wheelView, float f10) {
        this.f18891c = wheelView;
        this.f18890b = f10;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        if (this.f18889a == 2.1474836E9f) {
            if (Math.abs(this.f18890b) > 2000.0f) {
                this.f18889a = this.f18890b <= 0.0f ? -2000.0f : 2000.0f;
            } else {
                this.f18889a = this.f18890b;
            }
        }
        if (Math.abs(this.f18889a) >= 0.0f && Math.abs(this.f18889a) <= 20.0f) {
            this.f18891c.m7045a();
            this.f18891c.getHandler().sendEmptyMessage(2000);
            return;
        }
        int i10 = (int) (this.f18889a / 100.0f);
        WheelView wheelView = this.f18891c;
        float f10 = i10;
        wheelView.setTotalScrollY(wheelView.getTotalScrollY() - f10);
        if (!this.f18891c.m7048d()) {
            float itemHeight = this.f18891c.getItemHeight();
            float totalScrollY = (-this.f18891c.getInitPosition()) * itemHeight;
            float itemsCount = ((this.f18891c.getItemsCount() - 1) - this.f18891c.getInitPosition()) * itemHeight;
            double d10 = itemHeight * 0.25d;
            if (this.f18891c.getTotalScrollY() - d10 < totalScrollY) {
                totalScrollY = this.f18891c.getTotalScrollY() + f10;
            } else if (this.f18891c.getTotalScrollY() + d10 > itemsCount) {
                itemsCount = this.f18891c.getTotalScrollY() + f10;
            }
            if (this.f18891c.getTotalScrollY() <= totalScrollY) {
                this.f18889a = 40.0f;
                this.f18891c.setTotalScrollY((int) totalScrollY);
            } else if (this.f18891c.getTotalScrollY() >= itemsCount) {
                this.f18891c.setTotalScrollY((int) itemsCount);
                this.f18889a = -40.0f;
            }
        }
        float f11 = this.f18889a;
        if (f11 < 0.0f) {
            this.f18889a = f11 + 20.0f;
        } else {
            this.f18889a = f11 - 20.0f;
        }
        this.f18891c.getHandler().sendEmptyMessage(1000);
    }
}
