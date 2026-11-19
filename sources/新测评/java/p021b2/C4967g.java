package p021b2;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableString;
import android.text.Spanned;
import androidx.appcompat.widget.AppCompatCheckedTextView;
import com.prolificinteractive.materialcalendarview.CalendarDay;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;
import java.util.Iterator;
import java.util.List;
import p032c2.InterfaceC5110e;
import p137k.AbstractC7846r;

/* renamed from: b2.g */
/* loaded from: classes4.dex */
public class C4967g extends AppCompatCheckedTextView {

    /* renamed from: a */
    public CalendarDay f2424a;

    /* renamed from: b */
    public int f2425b;

    /* renamed from: c */
    public final int f2426c;

    /* renamed from: d */
    public Drawable f2427d;

    /* renamed from: e */
    public Drawable f2428e;

    /* renamed from: f */
    public Drawable f2429f;

    /* renamed from: g */
    public InterfaceC5110e f2430g;

    /* renamed from: h */
    public InterfaceC5110e f2431h;

    /* renamed from: i */
    public boolean f2432i;

    /* renamed from: j */
    public boolean f2433j;

    /* renamed from: k */
    public boolean f2434k;

    /* renamed from: l */
    public int f2435l;

    /* renamed from: m */
    public final Rect f2436m;

    /* renamed from: n */
    public final Rect f2437n;

    public C4967g(Context context, CalendarDay calendarDay) {
        super(context);
        this.f2425b = -7829368;
        this.f2427d = null;
        InterfaceC5110e interfaceC5110e = InterfaceC5110e.f2670a;
        this.f2430g = interfaceC5110e;
        this.f2431h = interfaceC5110e;
        this.f2432i = true;
        this.f2433j = true;
        this.f2434k = false;
        this.f2435l = 4;
        this.f2436m = new Rect();
        this.f2437n = new Rect();
        this.f2426c = getResources().getInteger(R.integer.config_shortAnimTime);
        m2432o(this.f2425b);
        setGravity(17);
        setTextAlignment(4);
        m2428k(calendarDay);
    }

    /* renamed from: c */
    public static Drawable m2418c(int i10, int i11, Rect rect) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.setExitFadeDuration(i11);
        stateListDrawable.addState(new int[]{R.attr.state_checked}, m2419d(i10));
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, m2420e(i10, rect));
        stateListDrawable.addState(new int[0], m2419d(0));
        return stateListDrawable;
    }

    /* renamed from: d */
    public static Drawable m2419d(int i10) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(i10);
        return shapeDrawable;
    }

    /* renamed from: e */
    public static Drawable m2420e(int i10, Rect rect) {
        return new RippleDrawable(ColorStateList.valueOf(i10), null, m2419d(-1));
    }

    /* renamed from: a */
    public void m2421a(C4968h c4968h) {
        this.f2434k = c4968h.m2435a();
        m2431n();
        m2427j(c4968h.m2436b());
        m2433p(c4968h.m2437c());
        List listM2438d = c4968h.m2438d();
        if (listM2438d.isEmpty()) {
            setText(m2425h());
            return;
        }
        m2425h();
        SpannableString spannableString = new SpannableString(m2425h());
        Iterator it = listM2438d.iterator();
        if (it.hasNext()) {
            AbstractC7846r.m13306a(it.next());
            throw null;
        }
        setText(spannableString);
    }

    /* renamed from: b */
    public final void m2422b(int i10, int i11) {
        int iMin = Math.min(i11, i10);
        int iAbs = Math.abs(i11 - i10) / 2;
        if (i10 >= i11) {
            this.f2436m.set(iAbs, 0, iMin + iAbs, i11);
            this.f2437n.set(iAbs, 0, iMin + iAbs, i11);
        } else {
            this.f2436m.set(0, iAbs, i10, iMin + iAbs);
            this.f2437n.set(0, iAbs, i10, iMin + iAbs);
        }
    }

    /* renamed from: f */
    public String m2423f() {
        InterfaceC5110e interfaceC5110e = this.f2431h;
        if (interfaceC5110e == null) {
            interfaceC5110e = this.f2430g;
        }
        return interfaceC5110e.mo2726a(this.f2424a);
    }

    /* renamed from: g */
    public CalendarDay m2424g() {
        return this.f2424a;
    }

    /* renamed from: h */
    public String m2425h() {
        return this.f2430g.mo2726a(this.f2424a);
    }

    /* renamed from: i */
    public final void m2426i() {
        Drawable drawable = this.f2428e;
        if (drawable != null) {
            setBackgroundDrawable(drawable);
            return;
        }
        Drawable drawableM2418c = m2418c(this.f2425b, this.f2426c, this.f2437n);
        this.f2429f = drawableM2418c;
        setBackgroundDrawable(drawableM2418c);
    }

    /* renamed from: j */
    public void m2427j(Drawable drawable) {
        if (drawable == null) {
            this.f2427d = null;
        } else {
            this.f2427d = drawable.getConstantState().newDrawable(getResources());
        }
        invalidate();
    }

    /* renamed from: k */
    public void m2428k(CalendarDay calendarDay) {
        this.f2424a = calendarDay;
        setText(m2425h());
    }

    /* renamed from: l */
    public void m2429l(InterfaceC5110e interfaceC5110e) {
        InterfaceC5110e interfaceC5110e2 = this.f2431h;
        if (interfaceC5110e2 == this.f2430g) {
            interfaceC5110e2 = interfaceC5110e;
        }
        this.f2431h = interfaceC5110e2;
        if (interfaceC5110e == null) {
            interfaceC5110e = InterfaceC5110e.f2670a;
        }
        this.f2430g = interfaceC5110e;
        CharSequence text = getText();
        Object[] spans = text instanceof Spanned ? ((Spanned) text).getSpans(0, text.length(), Object.class) : null;
        SpannableString spannableString = new SpannableString(m2425h());
        if (spans != null) {
            for (Object obj : spans) {
                spannableString.setSpan(obj, 0, spannableString.length(), 33);
            }
        }
        setText(spannableString);
    }

    /* renamed from: m */
    public void m2430m(InterfaceC5110e interfaceC5110e) {
        if (interfaceC5110e == null) {
            interfaceC5110e = this.f2430g;
        }
        this.f2431h = interfaceC5110e;
        setContentDescription(m2423f());
    }

    /* renamed from: n */
    public final void m2431n() {
        boolean z9 = this.f2433j && this.f2432i && !this.f2434k;
        super.setEnabled(this.f2432i && !this.f2434k);
        boolean zM4430J = MaterialCalendarView.m4430J(this.f2435l);
        boolean z10 = MaterialCalendarView.m4431K(this.f2435l) || zM4430J;
        boolean zM4429I = MaterialCalendarView.m4429I(this.f2435l);
        boolean z11 = this.f2433j;
        if (!z11 && zM4430J) {
            z9 = true;
        }
        boolean z12 = this.f2432i;
        if (!z12 && z10) {
            z9 |= z11;
        }
        if (this.f2434k && zM4429I) {
            z9 |= z11 && z12;
        }
        if (!z11 && z9) {
            setTextColor(getTextColors().getColorForState(new int[]{-16842910}, -7829368));
        }
        setVisibility(z9 ? 0 : 4);
    }

    /* renamed from: o */
    public void m2432o(int i10) {
        this.f2425b = i10;
        m2426i();
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        Drawable drawable = this.f2427d;
        if (drawable != null) {
            drawable.setBounds(this.f2436m);
            this.f2427d.setState(getDrawableState());
            this.f2427d.draw(canvas);
        }
        this.f2429f.setBounds(this.f2437n);
        super.onDraw(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        super.onLayout(z9, i10, i11, i12, i13);
        m2422b(i12 - i10, i13 - i11);
        m2426i();
    }

    /* renamed from: p */
    public void m2433p(Drawable drawable) {
        if (drawable == null) {
            this.f2428e = null;
        } else {
            this.f2428e = drawable.getConstantState().newDrawable(getResources());
        }
        m2426i();
    }

    /* renamed from: q */
    public void m2434q(int i10, boolean z9, boolean z10) {
        this.f2435l = i10;
        this.f2433j = z10;
        this.f2432i = z9;
        m2431n();
    }
}
