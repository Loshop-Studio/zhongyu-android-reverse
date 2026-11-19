package com.xuexiang.xui.widget.progress.materialprogressbar;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import androidx.core.view.ViewCompat;
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.utils.AbstractC5859g;

/* renamed from: com.xuexiang.xui.widget.progress.materialprogressbar.c */
/* loaded from: classes3.dex */
public abstract class AbstractC5950c extends AbstractC5952e implements Animatable {

    /* renamed from: i */
    public Animator[] f5407i;

    public AbstractC5950c(Context context) {
        setTint(AbstractC5859g.m4378d(R$attr.colorControlActivated, ViewCompat.MEASURED_STATE_MASK, context));
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC5949b, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (m4943j()) {
            invalidateSelf();
        }
    }

    public boolean isRunning() {
        for (Animator animator : this.f5407i) {
            if (animator.isRunning()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: j */
    public final boolean m4943j() {
        for (Animator animator : this.f5407i) {
            if (animator.isStarted()) {
                return true;
            }
        }
        return false;
    }

    public void start() {
        if (m4943j()) {
            return;
        }
        for (Animator animator : this.f5407i) {
            animator.start();
        }
        invalidateSelf();
    }

    public void stop() {
        for (Animator animator : this.f5407i) {
            animator.end();
        }
    }
}
