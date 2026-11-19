package p174u3;

import android.graphics.Matrix;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import com.xuexiang.xui.widget.textview.label.LabelView;

/* renamed from: u3.a */
/* loaded from: classes3.dex */
public final class C6612a extends Animation {
    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        Matrix matrix = transformation.getMatrix();
        int i = LabelView.f5054c;
        matrix.postTranslate(0.0f, 0.0f);
        matrix.postRotate(0.0f, 0.0f, 0.0f);
    }
}
