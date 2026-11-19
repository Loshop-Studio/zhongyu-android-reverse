package p070b.p113c.p114a.p116e.p138g.p139a.p143e;

import com.xuexiang.xui.widget.picker.wheelview.WheelView;
import java.util.TimerTask;

/* renamed from: b.c.a.e.g.a.e.c */
/* loaded from: classes.dex */
public final class C0854c extends TimerTask {

    /* renamed from: b */
    public int f4637b = Integer.MAX_VALUE;

    /* renamed from: c */
    public int f4638c = 0;

    /* renamed from: d */
    public int f4639d;

    /* renamed from: e */
    public final WheelView f4640e;

    public C0854c(WheelView wheelView, int i) {
        this.f4640e = wheelView;
        this.f4639d = i;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        if (this.f4637b == Integer.MAX_VALUE) {
            this.f4637b = this.f4639d;
        }
        int i = this.f4637b;
        int i2 = (int) (i * 0.1f);
        this.f4638c = i2;
        if (i2 == 0) {
            if (i < 0) {
                this.f4638c = -1;
            } else {
                this.f4638c = 1;
            }
        }
        if (Math.abs(i) <= 1) {
            this.f4640e.m2774a();
            this.f4640e.getHandler().sendEmptyMessage(3000);
            return;
        }
        WheelView wheelView = this.f4640e;
        wheelView.setTotalScrollY(wheelView.getTotalScrollY() + this.f4638c);
        WheelView wheelView2 = this.f4640e;
        if (!wheelView2.f5356z) {
            float itemHeight = wheelView2.getItemHeight();
            float itemsCount = ((this.f4640e.getItemsCount() - 1) - this.f4640e.getInitPosition()) * itemHeight;
            if (this.f4640e.getTotalScrollY() <= (-this.f4640e.getInitPosition()) * itemHeight || this.f4640e.getTotalScrollY() >= itemsCount) {
                WheelView wheelView3 = this.f4640e;
                wheelView3.setTotalScrollY(wheelView3.getTotalScrollY() - this.f4638c);
                this.f4640e.m2774a();
                this.f4640e.getHandler().sendEmptyMessage(3000);
                return;
            }
        }
        this.f4640e.getHandler().sendEmptyMessage(1000);
        this.f4637b -= this.f4638c;
    }
}
