package p094f1;

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
import com.tencent.smtt.sdk.TbsListener;
import p106g1.InterfaceC8521g;

/* renamed from: f1.q */
/* loaded from: classes4.dex */
public class C8422q {

    /* renamed from: a */
    public final TextView f15980a;

    /* renamed from: b */
    public InterfaceC8521g f15981b;

    /* renamed from: c */
    public final int f15982c;

    /* renamed from: d */
    public final int f15983d;

    /* renamed from: e */
    public final int f15984e;

    /* renamed from: f */
    public final Interpolator f15985f = new DecelerateInterpolator(2.0f);

    /* renamed from: g */
    public int f15986g = 0;

    /* renamed from: h */
    public long f15987h = 0;

    /* renamed from: i */
    public CalendarDay f15988i = null;

    /* renamed from: f1.q$a */
    public class a extends C8406a {

        /* renamed from: a */
        public final /* synthetic */ CharSequence f15989a;

        /* renamed from: b */
        public final /* synthetic */ int f15990b;

        public a(CharSequence charSequence, int i10) {
            this.f15989a = charSequence;
            this.f15990b = i10;
        }

        @Override // p094f1.C8406a, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            C8422q c8422q = C8422q.this;
            c8422q.m13755h(c8422q.f15980a, 0);
            C8422q.this.f15980a.setAlpha(1.0f);
        }

        @Override // p094f1.C8406a, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C8422q.this.f15980a.setText(this.f15989a);
            C8422q c8422q = C8422q.this;
            c8422q.m13755h(c8422q.f15980a, this.f15990b);
            ViewPropertyAnimator viewPropertyAnimatorAnimate = C8422q.this.f15980a.animate();
            if (C8422q.this.f15986g == 1) {
                viewPropertyAnimatorAnimate.translationX(0.0f);
            } else {
                viewPropertyAnimatorAnimate.translationY(0.0f);
            }
            viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(C8422q.this.f15983d).setInterpolator(C8422q.this.f15985f).setListener(new C8406a()).start();
        }
    }

    public C8422q(TextView textView) {
        this.f15980a = textView;
        Resources resources = textView.getResources();
        this.f15982c = TbsListener.ErrorCode.INFO_CODE_BASE;
        this.f15983d = resources.getInteger(R.integer.config_shortAnimTime) / 2;
        this.f15984e = (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics());
    }

    /* renamed from: f */
    public void m13753f(CalendarDay calendarDay) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (calendarDay == null) {
            return;
        }
        if (TextUtils.isEmpty(this.f15980a.getText()) || jCurrentTimeMillis - this.f15987h < this.f15982c) {
            m13754g(jCurrentTimeMillis, calendarDay, false);
        }
        if (calendarDay.equals(this.f15988i)) {
            return;
        }
        if (calendarDay.m3992k() == this.f15988i.m3992k() && calendarDay.m3993l() == this.f15988i.m3993l()) {
            return;
        }
        m13754g(jCurrentTimeMillis, calendarDay, true);
    }

    /* renamed from: g */
    public final void m13754g(long j10, CalendarDay calendarDay, boolean z10) {
        this.f15980a.animate().cancel();
        m13755h(this.f15980a, 0);
        this.f15980a.setAlpha(1.0f);
        this.f15987h = j10;
        CharSequence charSequenceMo13885a = this.f15981b.mo13885a(calendarDay);
        if (z10) {
            int i10 = this.f15984e * (this.f15988i.m3995o(calendarDay) ? 1 : -1);
            ViewPropertyAnimator viewPropertyAnimatorAnimate = this.f15980a.animate();
            if (this.f15986g == 1) {
                viewPropertyAnimatorAnimate.translationX(i10 * (-1));
            } else {
                viewPropertyAnimatorAnimate.translationY(i10 * (-1));
            }
            viewPropertyAnimatorAnimate.alpha(0.0f).setDuration(this.f15983d).setInterpolator(this.f15985f).setListener(new a(charSequenceMo13885a, i10)).start();
        } else {
            this.f15980a.setText(charSequenceMo13885a);
        }
        this.f15988i = calendarDay;
    }

    /* renamed from: h */
    public final void m13755h(TextView textView, int i10) {
        if (this.f15986g == 1) {
            textView.setTranslationX(i10);
        } else {
            textView.setTranslationY(i10);
        }
    }

    /* renamed from: i */
    public int m13756i() {
        return this.f15986g;
    }

    /* renamed from: j */
    public void m13757j(int i10) {
        this.f15986g = i10;
    }

    /* renamed from: k */
    public void m13758k(CalendarDay calendarDay) {
        this.f15988i = calendarDay;
    }

    /* renamed from: l */
    public void m13759l(InterfaceC8521g interfaceC8521g) {
        this.f15981b = interfaceC8521g;
    }
}
