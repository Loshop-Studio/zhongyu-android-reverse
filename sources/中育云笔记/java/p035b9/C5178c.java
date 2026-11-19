package p035b9;

import com.xuexiang.xui.widget.picker.wheelview.WheelView;
import java.util.TimerTask;

/* renamed from: b9.c */
/* loaded from: classes5.dex */
public final class C5178c extends TimerTask {

    /* renamed from: c */
    public int f3041c = Integer.MAX_VALUE;

    /* renamed from: d */
    public int f3042d = 0;

    /* renamed from: e */
    public int f3043e;

    /* renamed from: f */
    public final WheelView f3044f;

    public C5178c(WheelView wheelView, int i10) {
        this.f3044f = wheelView;
        this.f3043e = i10;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        if (this.f3041c == Integer.MAX_VALUE) {
            this.f3041c = this.f3043e;
        }
        int i10 = this.f3041c;
        int i11 = (int) (i10 * 0.1f);
        this.f3042d = i11;
        if (i11 == 0) {
            if (i10 < 0) {
                this.f3042d = -1;
            } else {
                this.f3042d = 1;
            }
        }
        if (Math.abs(i10) <= 1) {
            this.f3044f.m13017a();
            this.f3044f.getHandler().sendEmptyMessage(3000);
            return;
        }
        WheelView wheelView = this.f3044f;
        wheelView.setTotalScrollY(wheelView.getTotalScrollY() + this.f3042d);
        if (!this.f3044f.m13020d()) {
            float itemHeight = this.f3044f.getItemHeight();
            float itemsCount = ((this.f3044f.getItemsCount() - 1) - this.f3044f.getInitPosition()) * itemHeight;
            if (this.f3044f.getTotalScrollY() <= (-this.f3044f.getInitPosition()) * itemHeight || this.f3044f.getTotalScrollY() >= itemsCount) {
                WheelView wheelView2 = this.f3044f;
                wheelView2.setTotalScrollY(wheelView2.getTotalScrollY() - this.f3042d);
                this.f3044f.m13017a();
                this.f3044f.getHandler().sendEmptyMessage(3000);
                return;
            }
        }
        this.f3044f.getHandler().sendEmptyMessage(1000);
        this.f3041c -= this.f3042d;
    }
}
