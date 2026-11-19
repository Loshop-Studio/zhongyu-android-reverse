package p070b.p113c.p114a.p116e.p144h.p145a;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import io.github.inflationx.calligraphy3.C1088R;
import p070b.p113c.p114a.C0787a;

/* renamed from: b.c.a.e.h.a.c */
/* loaded from: classes.dex */
public abstract class AbstractC0857c extends AbstractC0858d implements Animatable {

    /* renamed from: j */
    public Animator[] f4652j;

    @SuppressLint({"NewApi"})
    public AbstractC0857c(Context context) {
        setTint(C0787a.m2478l(C1088R.attr.colorControlActivated, -16777216, context));
    }

    @Override // p070b.p113c.p114a.p116e.p144h.p145a.AbstractC0856b, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (m2562h()) {
            invalidateSelf();
        }
    }

    /* renamed from: h */
    public final boolean m2562h() {
        for (Animator animator : this.f4652j) {
            if (animator.isStarted()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        for (Animator animator : this.f4652j) {
            if (animator.isRunning()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        if (m2562h()) {
            return;
        }
        for (Animator animator : this.f4652j) {
            animator.start();
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        for (Animator animator : this.f4652j) {
            animator.end();
        }
    }
}
