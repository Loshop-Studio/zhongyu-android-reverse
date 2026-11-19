package p175m1;

import com.contrarywind.view.WheelView;
import java.util.TimerTask;

/* renamed from: m1.c */
/* loaded from: classes3.dex */
public final class C8951c extends TimerTask {

    /* renamed from: a */
    public int f15013a = Integer.MAX_VALUE;

    /* renamed from: b */
    public int f15014b = 0;

    /* renamed from: c */
    public int f15015c;

    /* renamed from: d */
    public final WheelView f15016d;

    public C8951c(WheelView wheelView, int i9) {
        this.f15016d = wheelView;
        this.f15015c = i9;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        if (this.f15013a == Integer.MAX_VALUE) {
            this.f15013a = this.f15015c;
        }
        int i9 = this.f15013a;
        int i10 = (int) (i9 * 0.1f);
        this.f15014b = i10;
        if (i10 == 0) {
            if (i9 < 0) {
                this.f15014b = -1;
            } else {
                this.f15014b = 1;
            }
        }
        if (Math.abs(i9) <= 1) {
            this.f15016d.m4015a();
            this.f15016d.getHandler().sendEmptyMessage(3000);
            return;
        }
        WheelView wheelView = this.f15016d;
        wheelView.setTotalScrollY(wheelView.getTotalScrollY() + this.f15014b);
        if (!this.f15016d.m4018d()) {
            float itemHeight = this.f15016d.getItemHeight();
            float itemsCount = ((this.f15016d.getItemsCount() - 1) - this.f15016d.getInitPosition()) * itemHeight;
            if (this.f15016d.getTotalScrollY() <= (-this.f15016d.getInitPosition()) * itemHeight || this.f15016d.getTotalScrollY() >= itemsCount) {
                WheelView wheelView2 = this.f15016d;
                wheelView2.setTotalScrollY(wheelView2.getTotalScrollY() - this.f15014b);
                this.f15016d.m4015a();
                this.f15016d.getHandler().sendEmptyMessage(3000);
                return;
            }
        }
        this.f15016d.getHandler().sendEmptyMessage(1000);
        this.f15013a -= this.f15014b;
    }
}
