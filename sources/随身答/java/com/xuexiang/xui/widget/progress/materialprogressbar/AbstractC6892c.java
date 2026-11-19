package com.xuexiang.xui.widget.progress.materialprogressbar;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import androidx.core.view.ViewCompat;
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.utils.AbstractC6801g;

/* renamed from: com.xuexiang.xui.widget.progress.materialprogressbar.c */
/* loaded from: classes4.dex */
public abstract class AbstractC6892c extends AbstractC6894e implements Animatable {

    /* renamed from: i */
    public Animator[] f7956i;

    public AbstractC6892c(Context context) {
        setTint(AbstractC6801g.m6471d(R$attr.colorControlActivated, ViewCompat.MEASURED_STATE_MASK, context));
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC6891b, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (m7032j()) {
            invalidateSelf();
        }
    }

    public boolean isRunning() {
        for (Animator animator : this.f7956i) {
            if (animator.isRunning()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: j */
    public final boolean m7032j() {
        for (Animator animator : this.f7956i) {
            if (animator.isStarted()) {
                return true;
            }
        }
        return false;
    }

    public void start() {
        if (m7032j()) {
            return;
        }
        for (Animator animator : this.f7956i) {
            animator.start();
        }
        invalidateSelf();
    }

    public void stop() {
        for (Animator animator : this.f7956i) {
            animator.end();
        }
    }
}
