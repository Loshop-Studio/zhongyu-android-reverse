package p198p3;

import com.xuexiang.xui.widget.picker.wheelview.WheelView;
import java.util.TimerTask;

/* renamed from: p3.c */
/* loaded from: classes4.dex */
public final class C8822c extends TimerTask {

    /* renamed from: a */
    public int f15000a = Integer.MAX_VALUE;

    /* renamed from: b */
    public int f15001b = 0;

    /* renamed from: c */
    public int f15002c;

    /* renamed from: d */
    public final WheelView f15003d;

    public C8822c(WheelView wheelView, int i10) {
        this.f15003d = wheelView;
        this.f15002c = i10;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        if (this.f15000a == Integer.MAX_VALUE) {
            this.f15000a = this.f15002c;
        }
        int i10 = this.f15000a;
        int i11 = (int) (i10 * 0.1f);
        this.f15001b = i11;
        if (i11 == 0) {
            if (i10 < 0) {
                this.f15001b = -1;
            } else {
                this.f15001b = 1;
            }
        }
        if (Math.abs(i10) <= 1) {
            this.f15003d.m5852b();
            this.f15003d.getHandler().sendEmptyMessage(3000);
            return;
        }
        WheelView wheelView = this.f15003d;
        wheelView.setTotalScrollY(wheelView.getTotalScrollY() + this.f15001b);
        if (!this.f15003d.m5859i()) {
            float itemHeight = this.f15003d.getItemHeight();
            float itemsCount = ((this.f15003d.getItemsCount() - 1) - this.f15003d.getInitPosition()) * itemHeight;
            if (this.f15003d.getTotalScrollY() <= (-this.f15003d.getInitPosition()) * itemHeight || this.f15003d.getTotalScrollY() >= itemsCount) {
                WheelView wheelView2 = this.f15003d;
                wheelView2.setTotalScrollY(wheelView2.getTotalScrollY() - this.f15001b);
                this.f15003d.m5852b();
                this.f15003d.getHandler().sendEmptyMessage(3000);
                return;
            }
        }
        this.f15003d.getHandler().sendEmptyMessage(1000);
        this.f15000a -= this.f15001b;
    }
}
