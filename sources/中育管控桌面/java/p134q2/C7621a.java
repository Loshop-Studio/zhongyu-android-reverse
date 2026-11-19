package p134q2;

import com.xuexiang.xui.widget.picker.wheelview.WheelView;
import java.util.TimerTask;

/* renamed from: q2.a */
/* loaded from: classes3.dex */
public final class C7621a extends TimerTask {

    /* renamed from: a */
    public float f10080a = 2.1474836E9f;

    /* renamed from: b */
    public final float f10081b;

    /* renamed from: c */
    public final WheelView f10082c;

    public C7621a(WheelView wheelView, float f6) {
        this.f10082c = wheelView;
        this.f10081b = f6;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        if (this.f10080a == 2.1474836E9f) {
            if (Math.abs(this.f10081b) > 2000.0f) {
                this.f10080a = this.f10081b <= 0.0f ? -2000.0f : 2000.0f;
            } else {
                this.f10080a = this.f10081b;
            }
        }
        if (Math.abs(this.f10080a) >= 0.0f && Math.abs(this.f10080a) <= 20.0f) {
            this.f10082c.m4870a();
            this.f10082c.getHandler().sendEmptyMessage(2000);
            return;
        }
        int i6 = (int) (this.f10080a / 100.0f);
        WheelView wheelView = this.f10082c;
        float f6 = i6;
        wheelView.setTotalScrollY(wheelView.getTotalScrollY() - f6);
        if (!this.f10082c.m4873d()) {
            float itemHeight = this.f10082c.getItemHeight();
            float totalScrollY = (-this.f10082c.getInitPosition()) * itemHeight;
            float itemsCount = ((this.f10082c.getItemsCount() - 1) - this.f10082c.getInitPosition()) * itemHeight;
            double d6 = itemHeight * 0.25d;
            if (this.f10082c.getTotalScrollY() - d6 < totalScrollY) {
                totalScrollY = this.f10082c.getTotalScrollY() + f6;
            } else if (this.f10082c.getTotalScrollY() + d6 > itemsCount) {
                itemsCount = this.f10082c.getTotalScrollY() + f6;
            }
            if (this.f10082c.getTotalScrollY() <= totalScrollY) {
                this.f10080a = 40.0f;
                this.f10082c.setTotalScrollY((int) totalScrollY);
            } else if (this.f10082c.getTotalScrollY() >= itemsCount) {
                this.f10082c.setTotalScrollY((int) itemsCount);
                this.f10080a = -40.0f;
            }
        }
        float f7 = this.f10080a;
        if (f7 < 0.0f) {
            this.f10080a = f7 + 20.0f;
        } else {
            this.f10080a = f7 - 20.0f;
        }
        this.f10082c.getHandler().sendEmptyMessage(1000);
    }
}
