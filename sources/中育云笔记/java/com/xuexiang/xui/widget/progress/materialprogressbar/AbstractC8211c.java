package com.xuexiang.xui.widget.progress.materialprogressbar;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import androidx.core.view.ViewCompat;
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.utils.AbstractC8041g;

/* renamed from: com.xuexiang.xui.widget.progress.materialprogressbar.c */
/* loaded from: classes5.dex */
public abstract class AbstractC8211c extends AbstractC8213e implements Animatable {

    /* renamed from: k */
    public Animator[] f16832k;

    public AbstractC8211c(Context context) {
        setTint(AbstractC8041g.m12214a(R$attr.colorControlActivated, ViewCompat.MEASURED_STATE_MASK, context));
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC8210b, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (m13149j()) {
            invalidateSelf();
        }
    }

    public boolean isRunning() {
        for (Animator animator : this.f16832k) {
            if (animator.isRunning()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: j */
    public final boolean m13149j() {
        for (Animator animator : this.f16832k) {
            if (animator.isStarted()) {
                return true;
            }
        }
        return false;
    }

    public void start() {
        if (m13149j()) {
            return;
        }
        for (Animator animator : this.f16832k) {
            animator.start();
        }
        invalidateSelf();
    }

    public void stop() {
        for (Animator animator : this.f16832k) {
            animator.end();
        }
    }
}
