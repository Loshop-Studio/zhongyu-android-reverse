package p065g3;

import androidx.vectordrawable.graphics.drawable.PathInterpolatorCompat;
import com.xuexiang.xui.widget.picker.wheelview.WheelView;
import java.util.TimerTask;

/* renamed from: g3.b */
/* loaded from: classes3.dex */
public final class C5601b extends TimerTask {

    /* renamed from: a */
    public int f8697a = Integer.MAX_VALUE;

    /* renamed from: b */
    public int f8698b = 0;

    /* renamed from: c */
    public final int f8699c;

    /* renamed from: d */
    public final WheelView f8700d;

    public C5601b(WheelView wheelView, int i) {
        this.f8700d = wheelView;
        this.f8699c = i;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        if (this.f8697a == Integer.MAX_VALUE) {
            this.f8697a = this.f8699c;
        }
        int i = this.f8697a;
        int i8 = (int) (i * 0.1f);
        this.f8698b = i8;
        if (i8 == 0) {
            if (i < 0) {
                this.f8698b = -1;
            } else {
                this.f8698b = 1;
            }
        }
        int iAbs = Math.abs(i);
        WheelView wheelView = this.f8700d;
        if (iAbs <= 1) {
            wheelView.m3535a();
            wheelView.getHandler().sendEmptyMessage(PathInterpolatorCompat.MAX_NUM_POINTS);
            return;
        }
        wheelView.setTotalScrollY(wheelView.getTotalScrollY() + this.f8698b);
        if (!wheelView.f4604o) {
            float itemHeight = wheelView.getItemHeight();
            float itemsCount = ((wheelView.getItemsCount() - 1) - wheelView.getInitPosition()) * itemHeight;
            if (wheelView.getTotalScrollY() <= (-wheelView.getInitPosition()) * itemHeight || wheelView.getTotalScrollY() >= itemsCount) {
                wheelView.setTotalScrollY(wheelView.getTotalScrollY() - this.f8698b);
                wheelView.m3535a();
                wheelView.getHandler().sendEmptyMessage(PathInterpolatorCompat.MAX_NUM_POINTS);
                return;
            }
        }
        wheelView.getHandler().sendEmptyMessage(1000);
        this.f8697a -= this.f8698b;
    }
}
