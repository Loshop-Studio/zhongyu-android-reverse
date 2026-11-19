package p070b.p113c.p114a.p116e.p138g.p139a.p143e;

import android.os.Handler;
import com.xuexiang.xui.widget.picker.wheelview.WheelView;
import java.util.TimerTask;

/* renamed from: b.c.a.e.g.a.e.a */
/* loaded from: classes.dex */
public final class C0852a extends TimerTask {

    /* renamed from: b */
    public float f4633b = 2.1474836E9f;

    /* renamed from: c */
    public final float f4634c;

    /* renamed from: d */
    public final WheelView f4635d;

    public C0852a(WheelView wheelView, float f2) {
        this.f4635d = wheelView;
        this.f4634c = f2;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        Handler handler;
        int i;
        if (this.f4633b == 2.1474836E9f) {
            if (Math.abs(this.f4634c) > 2000.0f) {
                this.f4633b = this.f4634c <= 0.0f ? -2000.0f : 2000.0f;
            } else {
                this.f4633b = this.f4634c;
            }
        }
        if (Math.abs(this.f4633b) < 0.0f || Math.abs(this.f4633b) > 20.0f) {
            int i2 = (int) (this.f4633b / 100.0f);
            WheelView wheelView = this.f4635d;
            float f2 = i2;
            wheelView.setTotalScrollY(wheelView.getTotalScrollY() - f2);
            WheelView wheelView2 = this.f4635d;
            if (!wheelView2.f5356z) {
                float itemHeight = wheelView2.getItemHeight();
                float totalScrollY = (-this.f4635d.getInitPosition()) * itemHeight;
                float itemsCount = ((this.f4635d.getItemsCount() - 1) - this.f4635d.getInitPosition()) * itemHeight;
                double d2 = itemHeight * 0.25d;
                if (this.f4635d.getTotalScrollY() - d2 < totalScrollY) {
                    totalScrollY = this.f4635d.getTotalScrollY() + f2;
                } else if (this.f4635d.getTotalScrollY() + d2 > itemsCount) {
                    itemsCount = this.f4635d.getTotalScrollY() + f2;
                }
                if (this.f4635d.getTotalScrollY() <= totalScrollY) {
                    this.f4633b = 40.0f;
                    this.f4635d.setTotalScrollY((int) totalScrollY);
                } else if (this.f4635d.getTotalScrollY() >= itemsCount) {
                    this.f4635d.setTotalScrollY((int) itemsCount);
                    this.f4633b = -40.0f;
                }
            }
            float f3 = this.f4633b;
            this.f4633b = f3 < 0.0f ? f3 + 20.0f : f3 - 20.0f;
            handler = this.f4635d.getHandler();
            i = 1000;
        } else {
            this.f4635d.m2774a();
            handler = this.f4635d.getHandler();
            i = 2000;
        }
        handler.sendEmptyMessage(i);
    }
}
