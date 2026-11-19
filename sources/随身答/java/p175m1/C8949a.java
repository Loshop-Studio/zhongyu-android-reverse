package p175m1;

import com.contrarywind.view.WheelView;
import java.util.TimerTask;

/* renamed from: m1.a */
/* loaded from: classes3.dex */
public final class C8949a extends TimerTask {

    /* renamed from: a */
    public float f15009a = 2.1474836E9f;

    /* renamed from: b */
    public final float f15010b;

    /* renamed from: c */
    public final WheelView f15011c;

    public C8949a(WheelView wheelView, float f10) {
        this.f15011c = wheelView;
        this.f15010b = f10;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        if (this.f15009a == 2.1474836E9f) {
            if (Math.abs(this.f15010b) > 2000.0f) {
                this.f15009a = this.f15010b <= 0.0f ? -2000.0f : 2000.0f;
            } else {
                this.f15009a = this.f15010b;
            }
        }
        if (Math.abs(this.f15009a) >= 0.0f && Math.abs(this.f15009a) <= 20.0f) {
            this.f15011c.m4015a();
            this.f15011c.getHandler().sendEmptyMessage(2000);
            return;
        }
        int i9 = (int) (this.f15009a / 100.0f);
        WheelView wheelView = this.f15011c;
        float f10 = i9;
        wheelView.setTotalScrollY(wheelView.getTotalScrollY() - f10);
        if (!this.f15011c.m4018d()) {
            float itemHeight = this.f15011c.getItemHeight();
            float totalScrollY = (-this.f15011c.getInitPosition()) * itemHeight;
            float itemsCount = ((this.f15011c.getItemsCount() - 1) - this.f15011c.getInitPosition()) * itemHeight;
            double d10 = itemHeight * 0.25d;
            if (this.f15011c.getTotalScrollY() - d10 < totalScrollY) {
                totalScrollY = this.f15011c.getTotalScrollY() + f10;
            } else if (this.f15011c.getTotalScrollY() + d10 > itemsCount) {
                itemsCount = this.f15011c.getTotalScrollY() + f10;
            }
            if (this.f15011c.getTotalScrollY() <= totalScrollY) {
                this.f15009a = 40.0f;
                this.f15011c.setTotalScrollY((int) totalScrollY);
            } else if (this.f15011c.getTotalScrollY() >= itemsCount) {
                this.f15011c.setTotalScrollY((int) itemsCount);
                this.f15009a = -40.0f;
            }
        }
        float f11 = this.f15009a;
        if (f11 < 0.0f) {
            this.f15009a = f11 + 20.0f;
        } else {
            this.f15009a = f11 - 20.0f;
        }
        this.f15011c.getHandler().sendEmptyMessage(1000);
    }
}
