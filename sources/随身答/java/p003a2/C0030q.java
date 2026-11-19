package p003a2;

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
import p020b2.InterfaceC5105g;

/* renamed from: a2.q */
/* loaded from: classes4.dex */
public class C0030q {

    /* renamed from: a */
    public final TextView f96a;

    /* renamed from: b */
    public InterfaceC5105g f97b;

    /* renamed from: c */
    public final int f98c;

    /* renamed from: d */
    public final int f99d;

    /* renamed from: e */
    public final int f100e;

    /* renamed from: f */
    public final Interpolator f101f = new DecelerateInterpolator(2.0f);

    /* renamed from: g */
    public int f102g = 0;

    /* renamed from: h */
    public long f103h = 0;

    /* renamed from: i */
    public CalendarDay f104i = null;

    /* renamed from: a2.q$a */
    public class a extends C0014a {

        /* renamed from: a */
        public final /* synthetic */ CharSequence f105a;

        /* renamed from: b */
        public final /* synthetic */ int f106b;

        public a(CharSequence charSequence, int i9) {
            this.f105a = charSequence;
            this.f106b = i9;
        }

        @Override // p003a2.C0014a, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            C0030q c0030q = C0030q.this;
            c0030q.m164h(c0030q.f96a, 0);
            C0030q.this.f96a.setAlpha(1.0f);
        }

        @Override // p003a2.C0014a, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C0030q.this.f96a.setText(this.f105a);
            C0030q c0030q = C0030q.this;
            c0030q.m164h(c0030q.f96a, this.f106b);
            ViewPropertyAnimator viewPropertyAnimatorAnimate = C0030q.this.f96a.animate();
            if (C0030q.this.f102g == 1) {
                viewPropertyAnimatorAnimate.translationX(0.0f);
            } else {
                viewPropertyAnimatorAnimate.translationY(0.0f);
            }
            viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(C0030q.this.f99d).setInterpolator(C0030q.this.f101f).setListener(new C0014a()).start();
        }
    }

    public C0030q(TextView textView) {
        this.f96a = textView;
        Resources resources = textView.getResources();
        this.f98c = 400;
        this.f99d = resources.getInteger(R.integer.config_shortAnimTime) / 2;
        this.f100e = (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics());
    }

    /* renamed from: f */
    public void m162f(CalendarDay calendarDay) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (calendarDay == null) {
            return;
        }
        if (TextUtils.isEmpty(this.f96a.getText()) || jCurrentTimeMillis - this.f103h < this.f98c) {
            m163g(jCurrentTimeMillis, calendarDay, false);
        }
        if (calendarDay.equals(this.f104i)) {
            return;
        }
        if (calendarDay.m4627i() == this.f104i.m4627i() && calendarDay.m4628j() == this.f104i.m4628j()) {
            return;
        }
        m163g(jCurrentTimeMillis, calendarDay, true);
    }

    /* renamed from: g */
    public final void m163g(long j9, CalendarDay calendarDay, boolean z9) {
        this.f96a.animate().cancel();
        m164h(this.f96a, 0);
        this.f96a.setAlpha(1.0f);
        this.f103h = j9;
        CharSequence charSequenceMo2164a = this.f97b.mo2164a(calendarDay);
        if (z9) {
            int i9 = this.f100e * (this.f104i.m4630m(calendarDay) ? 1 : -1);
            ViewPropertyAnimator viewPropertyAnimatorAnimate = this.f96a.animate();
            if (this.f102g == 1) {
                viewPropertyAnimatorAnimate.translationX(i9 * (-1));
            } else {
                viewPropertyAnimatorAnimate.translationY(i9 * (-1));
            }
            viewPropertyAnimatorAnimate.alpha(0.0f).setDuration(this.f99d).setInterpolator(this.f101f).setListener(new a(charSequenceMo2164a, i9)).start();
        } else {
            this.f96a.setText(charSequenceMo2164a);
        }
        this.f104i = calendarDay;
    }

    /* renamed from: h */
    public final void m164h(TextView textView, int i9) {
        if (this.f102g == 1) {
            textView.setTranslationX(i9);
        } else {
            textView.setTranslationY(i9);
        }
    }

    /* renamed from: i */
    public int m165i() {
        return this.f102g;
    }

    /* renamed from: j */
    public void m166j(int i9) {
        this.f102g = i9;
    }

    /* renamed from: k */
    public void m167k(CalendarDay calendarDay) {
        this.f104i = calendarDay;
    }

    /* renamed from: l */
    public void m168l(InterfaceC5105g interfaceC5105g) {
        this.f97b = interfaceC5105g;
    }
}
