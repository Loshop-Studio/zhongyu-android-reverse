package p185o1;

import com.contrarywind.view.WheelView;
import java.util.TimerTask;

/* renamed from: o1.c */
/* loaded from: classes3.dex */
public final class C8695c extends TimerTask {

    /* renamed from: a */
    public int f14458a = Integer.MAX_VALUE;

    /* renamed from: b */
    public int f14459b = 0;

    /* renamed from: c */
    public int f14460c;

    /* renamed from: d */
    public final WheelView f14461d;

    public C8695c(WheelView wheelView, int i10) {
        this.f14461d = wheelView;
        this.f14460c = i10;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        if (this.f14458a == Integer.MAX_VALUE) {
            this.f14458a = this.f14460c;
        }
        int i10 = this.f14458a;
        int i11 = (int) (i10 * 0.1f);
        this.f14459b = i11;
        if (i11 == 0) {
            if (i10 < 0) {
                this.f14459b = -1;
            } else {
                this.f14459b = 1;
            }
        }
        if (Math.abs(i10) <= 1) {
            this.f14461d.m3991a();
            this.f14461d.getHandler().sendEmptyMessage(3000);
            return;
        }
        WheelView wheelView = this.f14461d;
        wheelView.setTotalScrollY(wheelView.getTotalScrollY() + this.f14459b);
        if (!this.f14461d.m3994d()) {
            float itemHeight = this.f14461d.getItemHeight();
            float itemsCount = ((this.f14461d.getItemsCount() - 1) - this.f14461d.getInitPosition()) * itemHeight;
            if (this.f14461d.getTotalScrollY() <= (-this.f14461d.getInitPosition()) * itemHeight || this.f14461d.getTotalScrollY() >= itemsCount) {
                WheelView wheelView2 = this.f14461d;
                wheelView2.setTotalScrollY(wheelView2.getTotalScrollY() - this.f14459b);
                this.f14461d.m3991a();
                this.f14461d.getHandler().sendEmptyMessage(3000);
                return;
            }
        }
        this.f14461d.getHandler().sendEmptyMessage(1000);
        this.f14458a -= this.f14459b;
    }
}
