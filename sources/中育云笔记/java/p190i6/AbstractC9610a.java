package p190i6;

import android.view.View;
import androidx.core.view.ViewCompat;

/* renamed from: i6.a */
/* loaded from: classes5.dex */
public abstract class AbstractC9610a {
    /* renamed from: a */
    public static void m18843a(View view) {
        view.setAlpha(1.0f);
        view.setScaleY(1.0f);
        view.setScaleX(1.0f);
        view.setTranslationY(0.0f);
        view.setTranslationX(0.0f);
        view.setRotation(0.0f);
        view.setRotationY(0.0f);
        view.setRotationX(0.0f);
        view.setPivotY(view.getMeasuredHeight() / 2);
        view.setPivotX(view.getMeasuredWidth() / 2);
        ViewCompat.animate(view).setInterpolator(null).setStartDelay(0L);
    }
}
