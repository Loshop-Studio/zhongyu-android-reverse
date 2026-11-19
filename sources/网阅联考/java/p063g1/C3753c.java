package p063g1;

import androidx.vectordrawable.graphics.drawable.PathInterpolatorCompat;
import com.xuexiang.xui.widget.picker.wheelview.WheelView;
import java.util.TimerTask;

/* renamed from: g1.c */
/* loaded from: classes2.dex */
public final class C3753c extends TimerTask {

    /* renamed from: a */
    public int f4403a = Integer.MAX_VALUE;

    /* renamed from: b */
    public int f4404b = 0;

    /* renamed from: c */
    public int f4405c;

    /* renamed from: d */
    public final WheelView f4406d;

    public C3753c(WheelView wheelView, int i4) {
        this.f4406d = wheelView;
        this.f4405c = i4;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        if (this.f4403a == Integer.MAX_VALUE) {
            this.f4403a = this.f4405c;
        }
        int i4 = this.f4403a;
        int i5 = (int) (i4 * 0.1f);
        this.f4404b = i5;
        if (i5 == 0) {
            if (i4 < 0) {
                this.f4404b = -1;
            } else {
                this.f4404b = 1;
            }
        }
        if (Math.abs(i4) <= 1) {
            this.f4406d.m4491a();
            this.f4406d.getHandler().sendEmptyMessage(PathInterpolatorCompat.MAX_NUM_POINTS);
            return;
        }
        WheelView wheelView = this.f4406d;
        wheelView.setTotalScrollY(wheelView.getTotalScrollY() + this.f4404b);
        if (!this.f4406d.m4494d()) {
            float itemHeight = this.f4406d.getItemHeight();
            float itemsCount = ((this.f4406d.getItemsCount() - 1) - this.f4406d.getInitPosition()) * itemHeight;
            if (this.f4406d.getTotalScrollY() <= (-this.f4406d.getInitPosition()) * itemHeight || this.f4406d.getTotalScrollY() >= itemsCount) {
                WheelView wheelView2 = this.f4406d;
                wheelView2.setTotalScrollY(wheelView2.getTotalScrollY() - this.f4404b);
                this.f4406d.m4491a();
                this.f4406d.getHandler().sendEmptyMessage(PathInterpolatorCompat.MAX_NUM_POINTS);
                return;
            }
        }
        this.f4406d.getHandler().sendEmptyMessage(1000);
        this.f4403a -= this.f4404b;
    }
}
