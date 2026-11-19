package p003a2;

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
import p020b2.InterfaceC5103e;
import p217q.AbstractC9343a;

/* renamed from: a2.g */
/* loaded from: classes4.dex */
public class C0020g extends AppCompatCheckedTextView {

    /* renamed from: a */
    public CalendarDay f74a;

    /* renamed from: b */
    public int f75b;

    /* renamed from: c */
    public final int f76c;

    /* renamed from: d */
    public Drawable f77d;

    /* renamed from: e */
    public Drawable f78e;

    /* renamed from: f */
    public Drawable f79f;

    /* renamed from: g */
    public InterfaceC5103e f80g;

    /* renamed from: h */
    public InterfaceC5103e f81h;

    /* renamed from: i */
    public boolean f82i;

    /* renamed from: j */
    public boolean f83j;

    /* renamed from: k */
    public boolean f84k;

    /* renamed from: l */
    public int f85l;

    /* renamed from: m */
    public final Rect f86m;

    /* renamed from: n */
    public final Rect f87n;

    public C0020g(Context context, CalendarDay calendarDay) {
        super(context);
        this.f75b = -7829368;
        this.f77d = null;
        InterfaceC5103e interfaceC5103e = InterfaceC5103e.f2211a;
        this.f80g = interfaceC5103e;
        this.f81h = interfaceC5103e;
        this.f82i = true;
        this.f83j = true;
        this.f84k = false;
        this.f85l = 4;
        this.f86m = new Rect();
        this.f87n = new Rect();
        this.f76c = getResources().getInteger(R.integer.config_shortAnimTime);
        m143o(this.f75b);
        setGravity(17);
        setTextAlignment(4);
        m139k(calendarDay);
    }

    /* renamed from: c */
    public static Drawable m129c(int i9, int i10, Rect rect) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.setExitFadeDuration(i10);
        stateListDrawable.addState(new int[]{R.attr.state_checked}, m130d(i9));
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, m131e(i9, rect));
        stateListDrawable.addState(new int[0], m130d(0));
        return stateListDrawable;
    }

    /* renamed from: d */
    public static Drawable m130d(int i9) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(i9);
        return shapeDrawable;
    }

    /* renamed from: e */
    public static Drawable m131e(int i9, Rect rect) {
        return new RippleDrawable(ColorStateList.valueOf(i9), null, m130d(-1));
    }

    /* renamed from: a */
    public void m132a(C0021h c0021h) {
        this.f84k = c0021h.m146a();
        m142n();
        m138j(c0021h.m147b());
        m144p(c0021h.m148c());
        List listM149d = c0021h.m149d();
        if (listM149d.isEmpty()) {
            setText(m136h());
            return;
        }
        m136h();
        SpannableString spannableString = new SpannableString(m136h());
        Iterator it = listM149d.iterator();
        if (it.hasNext()) {
            AbstractC9343a.m15285a(it.next());
            throw null;
        }
        setText(spannableString);
    }

    /* renamed from: b */
    public final void m133b(int i9, int i10) {
        int iMin = Math.min(i10, i9);
        int iAbs = Math.abs(i10 - i9) / 2;
        if (i9 >= i10) {
            this.f86m.set(iAbs, 0, iMin + iAbs, i10);
            this.f87n.set(iAbs, 0, iMin + iAbs, i10);
        } else {
            this.f86m.set(0, iAbs, i9, iMin + iAbs);
            this.f87n.set(0, iAbs, i9, iMin + iAbs);
        }
    }

    /* renamed from: f */
    public String m134f() {
        InterfaceC5103e interfaceC5103e = this.f81h;
        if (interfaceC5103e == null) {
            interfaceC5103e = this.f80g;
        }
        return interfaceC5103e.mo2163a(this.f74a);
    }

    /* renamed from: g */
    public CalendarDay m135g() {
        return this.f74a;
    }

    /* renamed from: h */
    public String m136h() {
        return this.f80g.mo2163a(this.f74a);
    }

    /* renamed from: i */
    public final void m137i() {
        Drawable drawable = this.f78e;
        if (drawable != null) {
            setBackgroundDrawable(drawable);
            return;
        }
        Drawable drawableM129c = m129c(this.f75b, this.f76c, this.f87n);
        this.f79f = drawableM129c;
        setBackgroundDrawable(drawableM129c);
    }

    /* renamed from: j */
    public void m138j(Drawable drawable) {
        if (drawable == null) {
            this.f77d = null;
        } else {
            this.f77d = drawable.getConstantState().newDrawable(getResources());
        }
        invalidate();
    }

    /* renamed from: k */
    public void m139k(CalendarDay calendarDay) {
        this.f74a = calendarDay;
        setText(m136h());
    }

    /* renamed from: l */
    public void m140l(InterfaceC5103e interfaceC5103e) {
        InterfaceC5103e interfaceC5103e2 = this.f81h;
        if (interfaceC5103e2 == this.f80g) {
            interfaceC5103e2 = interfaceC5103e;
        }
        this.f81h = interfaceC5103e2;
        if (interfaceC5103e == null) {
            interfaceC5103e = InterfaceC5103e.f2211a;
        }
        this.f80g = interfaceC5103e;
        CharSequence text = getText();
        Object[] spans = text instanceof Spanned ? ((Spanned) text).getSpans(0, text.length(), Object.class) : null;
        SpannableString spannableString = new SpannableString(m136h());
        if (spans != null) {
            for (Object obj : spans) {
                spannableString.setSpan(obj, 0, spannableString.length(), 33);
            }
        }
        setText(spannableString);
    }

    /* renamed from: m */
    public void m141m(InterfaceC5103e interfaceC5103e) {
        if (interfaceC5103e == null) {
            interfaceC5103e = this.f80g;
        }
        this.f81h = interfaceC5103e;
        setContentDescription(m134f());
    }

    /* renamed from: n */
    public final void m142n() {
        boolean z9 = this.f83j && this.f82i && !this.f84k;
        super.setEnabled(this.f82i && !this.f84k);
        boolean zM4635J = MaterialCalendarView.m4635J(this.f85l);
        boolean z10 = MaterialCalendarView.m4636K(this.f85l) || zM4635J;
        boolean zM4634I = MaterialCalendarView.m4634I(this.f85l);
        boolean z11 = this.f83j;
        if (!z11 && zM4635J) {
            z9 = true;
        }
        boolean z12 = this.f82i;
        if (!z12 && z10) {
            z9 |= z11;
        }
        if (this.f84k && zM4634I) {
            z9 |= z11 && z12;
        }
        if (!z11 && z9) {
            setTextColor(getTextColors().getColorForState(new int[]{-16842910}, -7829368));
        }
        setVisibility(z9 ? 0 : 4);
    }

    /* renamed from: o */
    public void m143o(int i9) {
        this.f75b = i9;
        m137i();
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        Drawable drawable = this.f77d;
        if (drawable != null) {
            drawable.setBounds(this.f86m);
            this.f77d.setState(getDrawableState());
            this.f77d.draw(canvas);
        }
        this.f79f.setBounds(this.f87n);
        super.onDraw(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z9, int i9, int i10, int i11, int i12) {
        super.onLayout(z9, i9, i10, i11, i12);
        m133b(i11 - i9, i12 - i10);
        m137i();
    }

    /* renamed from: p */
    public void m144p(Drawable drawable) {
        if (drawable == null) {
            this.f78e = null;
        } else {
            this.f78e = drawable.getConstantState().newDrawable(getResources());
        }
        m137i();
    }

    /* renamed from: q */
    public void m145q(int i9, boolean z9, boolean z10) {
        this.f85l = i9;
        this.f83j = z10;
        this.f82i = z9;
        m142n();
    }
}
