package p008a7;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import androidx.constraintlayout.motion.widget.Key;

/* renamed from: a7.b */
/* loaded from: classes5.dex */
public abstract class AbstractC0069b {
    /* renamed from: a */
    public static void m143a(ImageView imageView, boolean z10) {
        float f10 = 180.0f;
        float f11 = 0.0f;
        if (z10) {
            f11 = 180.0f;
            f10 = 0.0f;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(imageView, Key.ROTATION, f10, f11);
        objectAnimatorOfFloat.setDuration(250L);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        objectAnimatorOfFloat.start();
    }

    /* renamed from: b */
    public static void m144b(View view) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, "scaleX", 1.0f, 1.05f, 1.0f), ObjectAnimator.ofFloat(view, "scaleY", 1.0f, 1.05f, 1.0f));
        animatorSet.setDuration(250L);
        animatorSet.setInterpolator(new LinearInterpolator());
        animatorSet.start();
    }
}
