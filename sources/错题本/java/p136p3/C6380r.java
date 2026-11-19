package p136p3;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.LinearLayout;
import androidx.camera.video.AudioStats;
import com.xuexiang.xui.widget.tabbar.VerticalTabLayout;
import p016b0.RunnableC3059a;

/* renamed from: p3.r */
/* loaded from: classes3.dex */
public final class C6380r extends LinearLayout {

    /* renamed from: a */
    public float f10432a;

    /* renamed from: b */
    public float f10433b;

    /* renamed from: c */
    public float f10434c;

    /* renamed from: d */
    public int f10435d;

    /* renamed from: e */
    public final Paint f10436e;

    /* renamed from: f */
    public final RectF f10437f;

    /* renamed from: g */
    public AnimatorSet f10438g;

    /* renamed from: h */
    public final /* synthetic */ VerticalTabLayout f10439h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6380r(VerticalTabLayout verticalTabLayout, Context context) {
        super(context);
        this.f10439h = verticalTabLayout;
        setWillNotDraw(false);
        setOrientation(1);
        Paint paint = new Paint();
        this.f10436e = paint;
        paint.setAntiAlias(true);
        int i = verticalTabLayout.f4966g;
        verticalTabLayout.f4966g = i == 0 ? 3 : i;
        this.f10437f = new RectF();
        m6030c();
    }

    /* renamed from: a */
    public final void m6028a(float f) {
        double d9 = f;
        int iFloor = (int) Math.floor(d9);
        View childAt = getChildAt(iFloor);
        if (Math.floor(d9) == getChildCount() - 1 || Math.ceil(d9) == AudioStats.AUDIO_AMPLITUDE_NONE) {
            this.f10432a = childAt.getTop();
            this.f10434c = childAt.getBottom();
        } else {
            View childAt2 = getChildAt(iFloor + 1);
            float f7 = f - iFloor;
            this.f10432a = ((childAt2.getTop() - childAt.getTop()) * f7) + childAt.getTop();
            this.f10434c = ((childAt2.getBottom() - childAt.getBottom()) * f7) + childAt.getBottom();
        }
        invalidate();
    }

    /* renamed from: b */
    public final void m6029b(int i) {
        int selectedTabPosition = i - this.f10439h.getSelectedTabPosition();
        View childAt = getChildAt(i);
        float top2 = childAt.getTop();
        float bottom = childAt.getBottom();
        if (this.f10432a == top2 && this.f10434c == bottom) {
            return;
        }
        AnimatorSet animatorSet = this.f10438g;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.f10438g.end();
        }
        post(new RunnableC6379q(this, selectedTabPosition, bottom, top2));
    }

    /* renamed from: c */
    public final void m6030c() {
        VerticalTabLayout verticalTabLayout = this.f10439h;
        int i = verticalTabLayout.f4966g;
        if (i == 3) {
            this.f10433b = 0.0f;
            int i8 = this.f10435d;
            if (i8 != 0) {
                verticalTabLayout.f4965f = i8;
            }
            setPadding(verticalTabLayout.f4965f, 0, 0, 0);
        } else if (i == 5) {
            int i9 = this.f10435d;
            if (i9 != 0) {
                verticalTabLayout.f4965f = i9;
            }
            setPadding(0, 0, verticalTabLayout.f4965f, 0);
        } else if (i == 119) {
            this.f10433b = 0.0f;
            setPadding(0, 0, 0, 0);
        }
        post(new RunnableC3059a(this, 16));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        VerticalTabLayout verticalTabLayout = this.f10439h;
        int i = verticalTabLayout.f4962c;
        Paint paint = this.f10436e;
        paint.setColor(i);
        float f = this.f10433b;
        RectF rectF = this.f10437f;
        rectF.left = f;
        rectF.top = this.f10432a;
        rectF.right = f + verticalTabLayout.f4965f;
        rectF.bottom = this.f10434c;
        float f7 = verticalTabLayout.f4967h;
        if (f7 != 0.0f) {
            canvas.drawRoundRect(rectF, f7, f7, paint);
        } else {
            canvas.drawRect(rectF, paint);
        }
    }
}
