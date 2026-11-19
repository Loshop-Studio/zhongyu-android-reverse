package p105f4;

import com.xuexiang.xui.widget.picker.wheelview.WheelView;
import java.util.TimerTask;

/* renamed from: f4.c */
/* loaded from: classes4.dex */
public final class C7922c extends TimerTask {

    /* renamed from: a */
    public int f13348a = Integer.MAX_VALUE;

    /* renamed from: b */
    public int f13349b = 0;

    /* renamed from: c */
    public int f13350c;

    /* renamed from: d */
    public final WheelView f13351d;

    public C7922c(WheelView wheelView, int i9) {
        this.f13351d = wheelView;
        this.f13350c = i9;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        if (this.f13348a == Integer.MAX_VALUE) {
            this.f13348a = this.f13350c;
        }
        int i9 = this.f13348a;
        int i10 = (int) (i9 * 0.1f);
        this.f13349b = i10;
        if (i10 == 0) {
            if (i9 < 0) {
                this.f13349b = -1;
            } else {
                this.f13349b = 1;
            }
        }
        if (Math.abs(i9) <= 1) {
            this.f13351d.m6950b();
            this.f13351d.getHandler().sendEmptyMessage(3000);
            return;
        }
        WheelView wheelView = this.f13351d;
        wheelView.setTotalScrollY(wheelView.getTotalScrollY() + this.f13349b);
        if (!this.f13351d.m6957i()) {
            float itemHeight = this.f13351d.getItemHeight();
            float itemsCount = ((this.f13351d.getItemsCount() - 1) - this.f13351d.getInitPosition()) * itemHeight;
            if (this.f13351d.getTotalScrollY() <= (-this.f13351d.getInitPosition()) * itemHeight || this.f13351d.getTotalScrollY() >= itemsCount) {
                WheelView wheelView2 = this.f13351d;
                wheelView2.setTotalScrollY(wheelView2.getTotalScrollY() - this.f13349b);
                this.f13351d.m6950b();
                this.f13351d.getHandler().sendEmptyMessage(3000);
                return;
            }
        }
        this.f13351d.getHandler().sendEmptyMessage(1000);
        this.f13348a -= this.f13349b;
    }
}
