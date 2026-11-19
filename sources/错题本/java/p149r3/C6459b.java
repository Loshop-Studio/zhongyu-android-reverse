package p149r3;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.TextView;
import com.xuexiang.xui.widget.textview.ExpandableTextView;

/* renamed from: r3.b */
/* loaded from: classes3.dex */
public final class C6459b extends Animation {

    /* renamed from: a */
    public final ExpandableTextView f10625a;

    /* renamed from: b */
    public final int f10626b;

    /* renamed from: c */
    public final int f10627c;

    /* renamed from: d */
    public final /* synthetic */ ExpandableTextView f10628d;

    public C6459b(ExpandableTextView expandableTextView, ExpandableTextView expandableTextView2, int i, int i8) {
        this.f10628d = expandableTextView;
        this.f10625a = expandableTextView2;
        this.f10626b = i;
        this.f10627c = i8;
        setDuration(expandableTextView.f5008k);
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        int i = this.f10627c;
        int i8 = (int) (((i - r0) * f) + this.f10626b);
        ExpandableTextView expandableTextView = this.f10628d;
        expandableTextView.f4998a.setMaxHeight(i8 - expandableTextView.f5005h);
        if (Float.compare(expandableTextView.f5009l, 1.0f) != 0) {
            TextView textView = expandableTextView.f4998a;
            float f7 = expandableTextView.f5009l;
            textView.setAlpha(((1.0f - f7) * f) + f7);
        }
        ExpandableTextView expandableTextView2 = this.f10625a;
        expandableTextView2.getLayoutParams().height = i8;
        expandableTextView2.requestLayout();
    }

    @Override // android.view.animation.Animation
    public final boolean willChangeBounds() {
        return true;
    }
}
