package p070b.p074b.p075a.p076a.p104z;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import io.github.inflationx.calligraphy3.C1088R;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import p000a.p031h.p043j.C0266o;
import p000a.p031h.p043j.C0273v;
import p070b.p074b.p075a.p076a.C0562a;
import p070b.p074b.p075a.p076a.p080c.C0570a;

/* renamed from: b.b.a.a.z.n */
/* loaded from: classes.dex */
public final class C0702n {

    /* renamed from: a */
    public final Context f4163a;

    /* renamed from: b */
    public final TextInputLayout f4164b;

    /* renamed from: c */
    public LinearLayout f4165c;

    /* renamed from: d */
    public int f4166d;

    /* renamed from: e */
    public FrameLayout f4167e;

    /* renamed from: f */
    public int f4168f;

    /* renamed from: g */
    public Animator f4169g;

    /* renamed from: h */
    public final float f4170h;

    /* renamed from: i */
    public int f4171i;

    /* renamed from: j */
    public int f4172j;

    /* renamed from: k */
    public CharSequence f4173k;

    /* renamed from: l */
    public boolean f4174l;

    /* renamed from: m */
    public TextView f4175m;

    /* renamed from: n */
    public CharSequence f4176n;

    /* renamed from: o */
    public int f4177o;

    /* renamed from: p */
    public ColorStateList f4178p;

    /* renamed from: q */
    public CharSequence f4179q;

    /* renamed from: r */
    public boolean f4180r;

    /* renamed from: s */
    public TextView f4181s;

    /* renamed from: t */
    public int f4182t;

    /* renamed from: u */
    public ColorStateList f4183u;

    /* renamed from: v */
    public Typeface f4184v;

    /* renamed from: b.b.a.a.z.n$a */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ int f4185a;

        /* renamed from: b */
        public final /* synthetic */ TextView f4186b;

        /* renamed from: c */
        public final /* synthetic */ int f4187c;

        /* renamed from: d */
        public final /* synthetic */ TextView f4188d;

        public a(int i, TextView textView, int i2, TextView textView2) {
            this.f4185a = i;
            this.f4186b = textView;
            this.f4187c = i2;
            this.f4188d = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            TextView textView;
            C0702n c0702n = C0702n.this;
            c0702n.f4171i = this.f4185a;
            c0702n.f4169g = null;
            TextView textView2 = this.f4186b;
            if (textView2 != null) {
                textView2.setVisibility(4);
                if (this.f4187c == 1 && (textView = C0702n.this.f4175m) != null) {
                    textView.setText((CharSequence) null);
                }
            }
            TextView textView3 = this.f4188d;
            if (textView3 != null) {
                textView3.setTranslationY(0.0f);
                this.f4188d.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            TextView textView = this.f4188d;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }
    }

    public C0702n(TextInputLayout textInputLayout) {
        this.f4163a = textInputLayout.getContext();
        this.f4164b = textInputLayout;
        this.f4170h = r0.getResources().getDimensionPixelSize(C1088R.dimen.design_textinput_caption_translate_y);
    }

    /* renamed from: a */
    public void m2339a(TextView textView, int i) {
        if (this.f4165c == null && this.f4167e == null) {
            LinearLayout linearLayout = new LinearLayout(this.f4163a);
            this.f4165c = linearLayout;
            linearLayout.setOrientation(0);
            this.f4164b.addView(this.f4165c, -1, -2);
            this.f4167e = new FrameLayout(this.f4163a);
            this.f4165c.addView(this.f4167e, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f4164b.getEditText() != null) {
                m2340b();
            }
        }
        if (i == 0 || i == 1) {
            this.f4167e.setVisibility(0);
            this.f4167e.addView(textView);
            this.f4168f++;
        } else {
            this.f4165c.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f4165c.setVisibility(0);
        this.f4166d++;
    }

    /* renamed from: b */
    public void m2340b() {
        if ((this.f4165c == null || this.f4164b.getEditText() == null) ? false : true) {
            LinearLayout linearLayout = this.f4165c;
            EditText editText = this.f4164b.getEditText();
            WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
            linearLayout.setPaddingRelative(editText.getPaddingStart(), 0, this.f4164b.getEditText().getPaddingEnd(), 0);
        }
    }

    /* renamed from: c */
    public void m2341c() {
        Animator animator = this.f4169g;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* renamed from: d */
    public final void m2342d(List<Animator> list, boolean z, TextView textView, int i, int i2, int i3) {
        if (textView == null || !z) {
            return;
        }
        if (i == i3 || i == i2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, i3 == i ? 1.0f : 0.0f);
            objectAnimatorOfFloat.setDuration(167L);
            objectAnimatorOfFloat.setInterpolator(C0570a.f3534a);
            list.add(objectAnimatorOfFloat);
            if (i3 == i) {
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.TRANSLATION_Y, -this.f4170h, 0.0f);
                objectAnimatorOfFloat2.setDuration(217L);
                objectAnimatorOfFloat2.setInterpolator(C0570a.f3537d);
                list.add(objectAnimatorOfFloat2);
            }
        }
    }

    /* renamed from: e */
    public boolean m2343e() {
        return (this.f4172j != 1 || this.f4175m == null || TextUtils.isEmpty(this.f4173k)) ? false : true;
    }

    /* renamed from: f */
    public final TextView m2344f(int i) {
        if (i == 1) {
            return this.f4175m;
        }
        if (i != 2) {
            return null;
        }
        return this.f4181s;
    }

    /* renamed from: g */
    public int m2345g() {
        TextView textView = this.f4175m;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* renamed from: h */
    public void m2346h() {
        this.f4173k = null;
        m2341c();
        if (this.f4171i == 1) {
            this.f4172j = (!this.f4180r || TextUtils.isEmpty(this.f4179q)) ? 0 : 2;
        }
        m2349k(this.f4171i, this.f4172j, m2348j(this.f4175m, null));
    }

    /* renamed from: i */
    public void m2347i(TextView textView, int i) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.f4165c;
        if (linearLayout == null) {
            return;
        }
        if (!(i == 0 || i == 1) || (frameLayout = this.f4167e) == null) {
            linearLayout.removeView(textView);
        } else {
            int i2 = this.f4168f - 1;
            this.f4168f = i2;
            if (i2 == 0) {
                frameLayout.setVisibility(8);
            }
            this.f4167e.removeView(textView);
        }
        int i3 = this.f4166d - 1;
        this.f4166d = i3;
        LinearLayout linearLayout2 = this.f4165c;
        if (i3 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    /* renamed from: j */
    public final boolean m2348j(TextView textView, CharSequence charSequence) {
        TextInputLayout textInputLayout = this.f4164b;
        WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
        return textInputLayout.isLaidOut() && this.f4164b.isEnabled() && !(this.f4172j == this.f4171i && textView != null && TextUtils.equals(textView.getText(), charSequence));
    }

    /* renamed from: k */
    public final void m2349k(int i, int i2, boolean z) {
        TextView textViewM2344f;
        TextView textViewM2344f2;
        if (i == i2) {
            return;
        }
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f4169g = animatorSet;
            ArrayList arrayList = new ArrayList();
            m2342d(arrayList, this.f4180r, this.f4181s, 2, i, i2);
            m2342d(arrayList, this.f4174l, this.f4175m, 1, i, i2);
            C0562a.m2093n(animatorSet, arrayList);
            animatorSet.addListener(new a(i2, m2344f(i), i, m2344f(i2)));
            animatorSet.start();
        } else if (i != i2) {
            if (i2 != 0 && (textViewM2344f2 = m2344f(i2)) != null) {
                textViewM2344f2.setVisibility(0);
                textViewM2344f2.setAlpha(1.0f);
            }
            if (i != 0 && (textViewM2344f = m2344f(i)) != null) {
                textViewM2344f.setVisibility(4);
                if (i == 1) {
                    textViewM2344f.setText((CharSequence) null);
                }
            }
            this.f4171i = i2;
        }
        this.f4164b.m2708v();
        this.f4164b.m2711y(z, false);
        this.f4164b.m2688F();
    }
}
