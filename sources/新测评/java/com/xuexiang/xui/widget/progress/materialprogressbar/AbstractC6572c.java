package com.xuexiang.xui.widget.progress.materialprogressbar;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import androidx.core.view.ViewCompat;
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.utils.AbstractC6482g;

/* renamed from: com.xuexiang.xui.widget.progress.materialprogressbar.c */
/* loaded from: classes4.dex */
public abstract class AbstractC6572c extends AbstractC6574e implements Animatable {

    /* renamed from: i */
    public Animator[] f6698i;

    public AbstractC6572c(Context context) {
        setTint(AbstractC6482g.m5373d(R$attr.colorControlActivated, ViewCompat.MEASURED_STATE_MASK, context));
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC6571b, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (m5934j()) {
            invalidateSelf();
        }
    }

    public boolean isRunning() {
        for (Animator animator : this.f6698i) {
            if (animator.isRunning()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: j */
    public final boolean m5934j() {
        for (Animator animator : this.f6698i) {
            if (animator.isStarted()) {
                return true;
            }
        }
        return false;
    }

    public void start() {
        if (m5934j()) {
            return;
        }
        for (Animator animator : this.f6698i) {
            animator.start();
        }
        invalidateSelf();
    }

    public void stop() {
        for (Animator animator : this.f6698i) {
            animator.end();
        }
    }
}
