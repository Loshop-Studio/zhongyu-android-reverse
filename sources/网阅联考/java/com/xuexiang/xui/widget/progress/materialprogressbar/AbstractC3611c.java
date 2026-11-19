package com.xuexiang.xui.widget.progress.materialprogressbar;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import androidx.core.view.ViewCompat;
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.utils.AbstractC3531f;

/* renamed from: com.xuexiang.xui.widget.progress.materialprogressbar.c */
/* loaded from: classes2.dex */
public abstract class AbstractC3611c extends AbstractC3613e implements Animatable {

    /* renamed from: i */
    public Animator[] f3886i;

    public AbstractC3611c(Context context) {
        setTint(AbstractC3531f.m4068a(R$attr.colorControlActivated, ViewCompat.MEASURED_STATE_MASK, context));
    }

    /* renamed from: j */
    private boolean m4565j() {
        for (Animator animator : this.f3886i) {
            if (animator.isStarted()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC3610b, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (m4565j()) {
            invalidateSelf();
        }
    }

    public boolean isRunning() {
        for (Animator animator : this.f3886i) {
            if (animator.isRunning()) {
                return true;
            }
        }
        return false;
    }

    public void start() {
        if (m4565j()) {
            return;
        }
        for (Animator animator : this.f3886i) {
            animator.start();
        }
        invalidateSelf();
    }

    public void stop() {
        for (Animator animator : this.f3886i) {
            animator.end();
        }
    }
}
