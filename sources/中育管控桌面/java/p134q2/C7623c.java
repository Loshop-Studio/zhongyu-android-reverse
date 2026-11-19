package p134q2;

import com.xuexiang.xui.widget.picker.wheelview.WheelView;
import java.util.TimerTask;

/* renamed from: q2.c */
/* loaded from: classes3.dex */
public final class C7623c extends TimerTask {

    /* renamed from: a */
    public int f10084a = Integer.MAX_VALUE;

    /* renamed from: b */
    public int f10085b = 0;

    /* renamed from: c */
    public int f10086c;

    /* renamed from: d */
    public final WheelView f10087d;

    public C7623c(WheelView wheelView, int i6) {
        this.f10087d = wheelView;
        this.f10086c = i6;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        if (this.f10084a == Integer.MAX_VALUE) {
            this.f10084a = this.f10086c;
        }
        int i6 = this.f10084a;
        int i7 = (int) (i6 * 0.1f);
        this.f10085b = i7;
        if (i7 == 0) {
            if (i6 < 0) {
                this.f10085b = -1;
            } else {
                this.f10085b = 1;
            }
        }
        if (Math.abs(i6) <= 1) {
            this.f10087d.m4870a();
            this.f10087d.getHandler().sendEmptyMessage(3000);
            return;
        }
        WheelView wheelView = this.f10087d;
        wheelView.setTotalScrollY(wheelView.getTotalScrollY() + this.f10085b);
        if (!this.f10087d.m4873d()) {
            float itemHeight = this.f10087d.getItemHeight();
            float itemsCount = ((this.f10087d.getItemsCount() - 1) - this.f10087d.getInitPosition()) * itemHeight;
            if (this.f10087d.getTotalScrollY() <= (-this.f10087d.getInitPosition()) * itemHeight || this.f10087d.getTotalScrollY() >= itemsCount) {
                WheelView wheelView2 = this.f10087d;
                wheelView2.setTotalScrollY(wheelView2.getTotalScrollY() - this.f10085b);
                this.f10087d.m4870a();
                this.f10087d.getHandler().sendEmptyMessage(3000);
                return;
            }
        }
        this.f10087d.getHandler().sendEmptyMessage(1000);
        this.f10084a -= this.f10085b;
    }
}
