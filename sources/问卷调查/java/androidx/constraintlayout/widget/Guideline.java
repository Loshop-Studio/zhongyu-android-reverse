package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public class Guideline extends View {
    public Guideline(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setGuidelineBegin(int i) {
        ConstraintLayout.C0499a c0499a = (ConstraintLayout.C0499a) getLayoutParams();
        c0499a.f3041a = i;
        setLayoutParams(c0499a);
    }

    public void setGuidelineEnd(int i) {
        ConstraintLayout.C0499a c0499a = (ConstraintLayout.C0499a) getLayoutParams();
        c0499a.f3043b = i;
        setLayoutParams(c0499a);
    }

    public void setGuidelinePercent(float f2) {
        ConstraintLayout.C0499a c0499a = (ConstraintLayout.C0499a) getLayoutParams();
        c0499a.f3045c = f2;
        setLayoutParams(c0499a);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }
}
