package p065g3;

import com.xuexiang.xui.widget.picker.wheelview.WheelView;
import java.util.TimerTask;

/* renamed from: g3.a */
/* loaded from: classes3.dex */
public final class C5600a extends TimerTask {

    /* renamed from: a */
    public float f8694a = 2.1474836E9f;

    /* renamed from: b */
    public final float f8695b;

    /* renamed from: c */
    public final WheelView f8696c;

    public C5600a(WheelView wheelView, float f) {
        this.f8696c = wheelView;
        this.f8695b = f;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        if (this.f8694a == 2.1474836E9f) {
            float f = this.f8695b;
            if (Math.abs(f) > 2000.0f) {
                this.f8694a = f <= 0.0f ? -2000.0f : 2000.0f;
            } else {
                this.f8694a = f;
            }
        }
        float fAbs = Math.abs(this.f8694a);
        WheelView wheelView = this.f8696c;
        if (fAbs >= 0.0f && Math.abs(this.f8694a) <= 20.0f) {
            wheelView.m3535a();
            wheelView.getHandler().sendEmptyMessage(2000);
            return;
        }
        float f7 = (int) (this.f8694a / 100.0f);
        wheelView.setTotalScrollY(wheelView.getTotalScrollY() - f7);
        if (!wheelView.f4604o) {
            float itemHeight = wheelView.getItemHeight();
            float totalScrollY = (-wheelView.getInitPosition()) * itemHeight;
            float itemsCount = ((wheelView.getItemsCount() - 1) - wheelView.getInitPosition()) * itemHeight;
            double d9 = itemHeight * 0.25d;
            if (wheelView.getTotalScrollY() - d9 < totalScrollY) {
                totalScrollY = wheelView.getTotalScrollY() + f7;
            } else if (wheelView.getTotalScrollY() + d9 > itemsCount) {
                itemsCount = wheelView.getTotalScrollY() + f7;
            }
            if (wheelView.getTotalScrollY() <= totalScrollY) {
                this.f8694a = 40.0f;
                wheelView.setTotalScrollY((int) totalScrollY);
            } else if (wheelView.getTotalScrollY() >= itemsCount) {
                wheelView.setTotalScrollY((int) itemsCount);
                this.f8694a = -40.0f;
            }
        }
        float f8 = this.f8694a;
        if (f8 < 0.0f) {
            this.f8694a = f8 + 20.0f;
        } else {
            this.f8694a = f8 - 20.0f;
        }
        wheelView.getHandler().sendEmptyMessage(1000);
    }
}
