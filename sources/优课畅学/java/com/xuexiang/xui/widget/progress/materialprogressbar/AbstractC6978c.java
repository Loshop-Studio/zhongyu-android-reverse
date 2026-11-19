package com.xuexiang.xui.widget.progress.materialprogressbar;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import com.tencent.smtt.audio.core.utils.TbsDialogBase;
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.utils.AbstractC6877g;

/* renamed from: com.xuexiang.xui.widget.progress.materialprogressbar.c */
/* loaded from: classes4.dex */
public abstract class AbstractC6978c extends AbstractC6980e implements Animatable {

    /* renamed from: i */
    public Animator[] f8120i;

    public AbstractC6978c(Context context) {
        setTint(AbstractC6877g.m6470d(R$attr.colorControlActivated, -16777216, context));
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC6977b, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (m7124j()) {
            invalidateSelf();
        }
    }

    public boolean isRunning() {
        for (Animator animator : this.f8120i) {
            if (animator.isRunning()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: j */
    public final boolean m7124j() {
        for (Animator animator : this.f8120i) {
            if (animator.isStarted()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void start() {
        if (m7124j()) {
            return;
        }
        for (TbsDialogBase.Builder builder : this.f8120i) {
            builder.show();
        }
        invalidateSelf();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.animation.Animator[], android.content.DialogInterface$OnClickListener, java.lang.CharSequence] */
    public void stop() {
        ?? r02 = this.f8120i;
        for (TbsDialogBase.Builder builder : r02) {
            builder.setNegativeButton(r02, r02);
        }
    }
}
