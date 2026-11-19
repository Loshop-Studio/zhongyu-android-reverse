package p021b2;

import android.R;
import android.animation.Animator;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.TextView;
import com.prolificinteractive.materialcalendarview.CalendarDay;
import p032c2.InterfaceC5112g;

/* renamed from: b2.q */
/* loaded from: classes4.dex */
public class C4977q {

    /* renamed from: a */
    public final TextView f2446a;

    /* renamed from: b */
    public InterfaceC5112g f2447b;

    /* renamed from: c */
    public final int f2448c;

    /* renamed from: d */
    public final int f2449d;

    /* renamed from: e */
    public final int f2450e;

    /* renamed from: f */
    public final Interpolator f2451f = new DecelerateInterpolator(2.0f);

    /* renamed from: g */
    public int f2452g = 0;

    /* renamed from: h */
    public long f2453h = 0;

    /* renamed from: i */
    public CalendarDay f2454i = null;

    /* renamed from: b2.q$a */
    public class a extends C4961a {

        /* renamed from: a */
        public final /* synthetic */ CharSequence f2455a;

        /* renamed from: b */
        public final /* synthetic */ int f2456b;

        public a(CharSequence charSequence, int i10) {
            this.f2455a = charSequence;
            this.f2456b = i10;
        }

        @Override // p021b2.C4961a, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            C4977q c4977q = C4977q.this;
            c4977q.m2453h(c4977q.f2446a, 0);
            C4977q.this.f2446a.setAlpha(1.0f);
        }

        @Override // p021b2.C4961a, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C4977q.this.f2446a.setText(this.f2455a);
            C4977q c4977q = C4977q.this;
            c4977q.m2453h(c4977q.f2446a, this.f2456b);
            ViewPropertyAnimator viewPropertyAnimatorAnimate = C4977q.this.f2446a.animate();
            if (C4977q.this.f2452g == 1) {
                viewPropertyAnimatorAnimate.translationX(0.0f);
            } else {
                viewPropertyAnimatorAnimate.translationY(0.0f);
            }
            viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(C4977q.this.f2449d).setInterpolator(C4977q.this.f2451f).setListener(new C4961a()).start();
        }
    }

    public C4977q(TextView textView) {
        this.f2446a = textView;
        Resources resources = textView.getResources();
        this.f2448c = 400;
        this.f2449d = resources.getInteger(R.integer.config_shortAnimTime) / 2;
        this.f2450e = (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics());
    }

    /* renamed from: f */
    public void m2451f(CalendarDay calendarDay) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (calendarDay == null) {
            return;
        }
        if (TextUtils.isEmpty(this.f2446a.getText()) || jCurrentTimeMillis - this.f2453h < this.f2448c) {
            m2452g(jCurrentTimeMillis, calendarDay, false);
        }
        if (calendarDay.equals(this.f2454i)) {
            return;
        }
        if (calendarDay.m4422i() == this.f2454i.m4422i() && calendarDay.m4423j() == this.f2454i.m4423j()) {
            return;
        }
        m2452g(jCurrentTimeMillis, calendarDay, true);
    }

    /* renamed from: g */
    public final void m2452g(long j10, CalendarDay calendarDay, boolean z9) {
        this.f2446a.animate().cancel();
        m2453h(this.f2446a, 0);
        this.f2446a.setAlpha(1.0f);
        this.f2453h = j10;
        CharSequence charSequenceMo2727a = this.f2447b.mo2727a(calendarDay);
        if (z9) {
            int i10 = this.f2450e * (this.f2454i.m4425o(calendarDay) ? 1 : -1);
            ViewPropertyAnimator viewPropertyAnimatorAnimate = this.f2446a.animate();
            if (this.f2452g == 1) {
                viewPropertyAnimatorAnimate.translationX(i10 * (-1));
            } else {
                viewPropertyAnimatorAnimate.translationY(i10 * (-1));
            }
            viewPropertyAnimatorAnimate.alpha(0.0f).setDuration(this.f2449d).setInterpolator(this.f2451f).setListener(new a(charSequenceMo2727a, i10)).start();
        } else {
            this.f2446a.setText(charSequenceMo2727a);
        }
        this.f2454i = calendarDay;
    }

    /* renamed from: h */
    public final void m2453h(TextView textView, int i10) {
        if (this.f2452g == 1) {
            textView.setTranslationX(i10);
        } else {
            textView.setTranslationY(i10);
        }
    }

    /* renamed from: i */
    public int m2454i() {
        return this.f2452g;
    }

    /* renamed from: j */
    public void m2455j(int i10) {
        this.f2452g = i10;
    }

    /* renamed from: k */
    public void m2456k(CalendarDay calendarDay) {
        this.f2454i = calendarDay;
    }

    /* renamed from: l */
    public void m2457l(InterfaceC5112g interfaceC5112g) {
        this.f2447b = interfaceC5112g;
    }
}
