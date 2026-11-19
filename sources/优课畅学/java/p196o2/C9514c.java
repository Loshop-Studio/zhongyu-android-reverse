package p196o2;

import com.xuexiang.xui.widget.picker.wheelview.WheelView;
import java.util.TimerTask;

/* renamed from: o2.c */
/* loaded from: classes4.dex */
public final class C9514c extends TimerTask {

    /* renamed from: a */
    public int f18893a = Integer.MAX_VALUE;

    /* renamed from: b */
    public int f18894b = 0;

    /* renamed from: c */
    public int f18895c;

    /* renamed from: d */
    public final WheelView f18896d;

    public C9514c(WheelView wheelView, int i10) {
        this.f18896d = wheelView;
        this.f18895c = i10;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        if (this.f18893a == Integer.MAX_VALUE) {
            this.f18893a = this.f18895c;
        }
        int i10 = this.f18893a;
        int i11 = (int) (i10 * 0.1f);
        this.f18894b = i11;
        if (i11 == 0) {
            if (i10 < 0) {
                this.f18894b = -1;
            } else {
                this.f18894b = 1;
            }
        }
        if (Math.abs(i10) <= 1) {
            this.f18896d.m7045a();
            this.f18896d.getHandler().sendEmptyMessage(3000);
            return;
        }
        WheelView wheelView = this.f18896d;
        wheelView.setTotalScrollY(wheelView.getTotalScrollY() + this.f18894b);
        if (!this.f18896d.m7048d()) {
            float itemHeight = this.f18896d.getItemHeight();
            float itemsCount = ((this.f18896d.getItemsCount() - 1) - this.f18896d.getInitPosition()) * itemHeight;
            if (this.f18896d.getTotalScrollY() <= (-this.f18896d.getInitPosition()) * itemHeight || this.f18896d.getTotalScrollY() >= itemsCount) {
                WheelView wheelView2 = this.f18896d;
                wheelView2.setTotalScrollY(wheelView2.getTotalScrollY() - this.f18894b);
                this.f18896d.m7045a();
                this.f18896d.getHandler().sendEmptyMessage(3000);
                return;
            }
        }
        this.f18896d.getHandler().sendEmptyMessage(1000);
        this.f18893a -= this.f18894b;
    }
}
