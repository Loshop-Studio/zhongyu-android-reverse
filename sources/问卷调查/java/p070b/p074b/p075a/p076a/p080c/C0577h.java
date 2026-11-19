package p070b.p074b.p075a.p076a.p080c;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;

/* renamed from: b.b.a.a.c.h */
/* loaded from: classes.dex */
public class C0577h {

    /* renamed from: a */
    public long f3549a;

    /* renamed from: b */
    public long f3550b;

    /* renamed from: c */
    public TimeInterpolator f3551c;

    /* renamed from: d */
    public int f3552d;

    /* renamed from: e */
    public int f3553e;

    public C0577h(long j, long j2) {
        this.f3549a = 0L;
        this.f3550b = 300L;
        this.f3551c = null;
        this.f3552d = 0;
        this.f3553e = 1;
        this.f3549a = j;
        this.f3550b = j2;
    }

    public C0577h(long j, long j2, TimeInterpolator timeInterpolator) {
        this.f3549a = 0L;
        this.f3550b = 300L;
        this.f3551c = null;
        this.f3552d = 0;
        this.f3553e = 1;
        this.f3549a = j;
        this.f3550b = j2;
        this.f3551c = timeInterpolator;
    }

    /* renamed from: a */
    public void m2105a(Animator animator) {
        animator.setStartDelay(this.f3549a);
        animator.setDuration(this.f3550b);
        animator.setInterpolator(m2106b());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(this.f3552d);
            valueAnimator.setRepeatMode(this.f3553e);
        }
    }

    /* renamed from: b */
    public TimeInterpolator m2106b() {
        TimeInterpolator timeInterpolator = this.f3551c;
        return timeInterpolator != null ? timeInterpolator : C0570a.f3535b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0577h)) {
            return false;
        }
        C0577h c0577h = (C0577h) obj;
        if (this.f3549a == c0577h.f3549a && this.f3550b == c0577h.f3550b && this.f3552d == c0577h.f3552d && this.f3553e == c0577h.f3553e) {
            return m2106b().getClass().equals(c0577h.m2106b().getClass());
        }
        return false;
    }

    public int hashCode() {
        long j = this.f3549a;
        long j2 = this.f3550b;
        return ((((m2106b().getClass().hashCode() + (((((int) (j ^ (j >>> 32))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31)) * 31) + this.f3552d) * 31) + this.f3553e;
    }

    public String toString() {
        return '\n' + C0577h.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + this.f3549a + " duration: " + this.f3550b + " interpolator: " + m2106b().getClass() + " repeatCount: " + this.f3552d + " repeatMode: " + this.f3553e + "}\n";
    }
}
