package com.xuexiang.xui.widget.progress.materialprogressbar;

import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import androidx.core.view.ViewCompat;
import com.xuexiang.xui.R$attr;

/* renamed from: com.xuexiang.xui.widget.progress.materialprogressbar.c */
/* loaded from: classes3.dex */
public abstract class AbstractC4186c extends AbstractC4187d implements Animatable {

    /* renamed from: i */
    public Animator[] f4734i;

    public AbstractC4186c(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{R$attr.colorControlActivated});
        try {
            int color = typedArrayObtainStyledAttributes.getColor(0, ViewCompat.MEASURED_STATE_MASK);
            typedArrayObtainStyledAttributes.recycle();
            setTint(color);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC4187d, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        for (Animator animator : this.f4734i) {
            if (animator.isStarted()) {
                invalidateSelf();
                return;
            }
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        for (Animator animator : this.f4734i) {
            if (animator.isRunning()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        for (Animator animator : this.f4734i) {
            if (animator.isStarted()) {
                return;
            }
        }
        for (Animator animator2 : this.f4734i) {
            animator2.start();
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        for (Animator animator : this.f4734i) {
            animator.end();
        }
    }
}
