package p185o1;

import com.contrarywind.view.WheelView;
import java.util.TimerTask;

/* renamed from: o1.a */
/* loaded from: classes3.dex */
public final class C8693a extends TimerTask {

    /* renamed from: a */
    public float f14454a = 2.1474836E9f;

    /* renamed from: b */
    public final float f14455b;

    /* renamed from: c */
    public final WheelView f14456c;

    public C8693a(WheelView wheelView, float f10) {
        this.f14456c = wheelView;
        this.f14455b = f10;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        if (this.f14454a == 2.1474836E9f) {
            if (Math.abs(this.f14455b) > 2000.0f) {
                this.f14454a = this.f14455b <= 0.0f ? -2000.0f : 2000.0f;
            } else {
                this.f14454a = this.f14455b;
            }
        }
        if (Math.abs(this.f14454a) >= 0.0f && Math.abs(this.f14454a) <= 20.0f) {
            this.f14456c.m3991a();
            this.f14456c.getHandler().sendEmptyMessage(2000);
            return;
        }
        int i10 = (int) (this.f14454a / 100.0f);
        WheelView wheelView = this.f14456c;
        float f10 = i10;
        wheelView.setTotalScrollY(wheelView.getTotalScrollY() - f10);
        if (!this.f14456c.m3994d()) {
            float itemHeight = this.f14456c.getItemHeight();
            float totalScrollY = (-this.f14456c.getInitPosition()) * itemHeight;
            float itemsCount = ((this.f14456c.getItemsCount() - 1) - this.f14456c.getInitPosition()) * itemHeight;
            double d10 = itemHeight * 0.25d;
            if (this.f14456c.getTotalScrollY() - d10 < totalScrollY) {
                totalScrollY = this.f14456c.getTotalScrollY() + f10;
            } else if (this.f14456c.getTotalScrollY() + d10 > itemsCount) {
                itemsCount = this.f14456c.getTotalScrollY() + f10;
            }
            if (this.f14456c.getTotalScrollY() <= totalScrollY) {
                this.f14454a = 40.0f;
                this.f14456c.setTotalScrollY((int) totalScrollY);
            } else if (this.f14456c.getTotalScrollY() >= itemsCount) {
                this.f14456c.setTotalScrollY((int) itemsCount);
                this.f14454a = -40.0f;
            }
        }
        float f11 = this.f14454a;
        if (f11 < 0.0f) {
            this.f14454a = f11 + 20.0f;
        } else {
            this.f14454a = f11 - 20.0f;
        }
        this.f14456c.getHandler().sendEmptyMessage(1000);
    }
}
