package p094f1;

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
import com.blankj.utilcode.util.AbstractC5379p;
import com.prolificinteractive.materialcalendarview.CalendarDay;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;
import java.util.Iterator;
import java.util.List;
import p106g1.InterfaceC8519e;

/* renamed from: f1.g */
/* loaded from: classes4.dex */
public class C8412g extends AppCompatCheckedTextView {

    /* renamed from: a */
    public CalendarDay f15958a;

    /* renamed from: b */
    public int f15959b;

    /* renamed from: c */
    public final int f15960c;

    /* renamed from: d */
    public Drawable f15961d;

    /* renamed from: e */
    public Drawable f15962e;

    /* renamed from: f */
    public Drawable f15963f;

    /* renamed from: g */
    public InterfaceC8519e f15964g;

    /* renamed from: h */
    public InterfaceC8519e f15965h;

    /* renamed from: i */
    public boolean f15966i;

    /* renamed from: j */
    public boolean f15967j;

    /* renamed from: k */
    public boolean f15968k;

    /* renamed from: l */
    public int f15969l;

    /* renamed from: m */
    public final Rect f15970m;

    /* renamed from: n */
    public final Rect f15971n;

    public C8412g(Context context, CalendarDay calendarDay) {
        super(context);
        this.f15959b = -7829368;
        this.f15961d = null;
        InterfaceC8519e interfaceC8519e = InterfaceC8519e.f16104a;
        this.f15964g = interfaceC8519e;
        this.f15965h = interfaceC8519e;
        this.f15966i = true;
        this.f15967j = true;
        this.f15968k = false;
        this.f15969l = 4;
        this.f15970m = new Rect();
        this.f15971n = new Rect();
        this.f15960c = getResources().getInteger(R.integer.config_shortAnimTime);
        m13735o(this.f15959b);
        setGravity(17);
        setTextAlignment(4);
        m13731k(calendarDay);
    }

    /* renamed from: c */
    public static Drawable m13721c(int i10, int i11, Rect rect) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.setExitFadeDuration(i11);
        stateListDrawable.addState(new int[]{R.attr.state_checked}, m13722d(i10));
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, m13723e(i10, rect));
        stateListDrawable.addState(new int[0], m13722d(0));
        return stateListDrawable;
    }

    /* renamed from: d */
    public static Drawable m13722d(int i10) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(i10);
        return shapeDrawable;
    }

    /* renamed from: e */
    public static Drawable m13723e(int i10, Rect rect) {
        return new RippleDrawable(ColorStateList.valueOf(i10), null, m13722d(-1));
    }

    /* renamed from: a */
    public void m13724a(C8413h c8413h) {
        this.f15968k = c8413h.m13738a();
        m13734n();
        m13730j(c8413h.m13739b());
        m13736p(c8413h.m13740c());
        List listM13741d = c8413h.m13741d();
        if (listM13741d.isEmpty()) {
            setText(m13728h());
            return;
        }
        m13728h();
        SpannableString spannableString = new SpannableString(m13728h());
        Iterator it = listM13741d.iterator();
        if (it.hasNext()) {
            AbstractC5379p.m2596a(it.next());
            throw null;
        }
        setText(spannableString);
    }

    /* renamed from: b */
    public final void m13725b(int i10, int i11) {
        int iMin = Math.min(i11, i10);
        int iAbs = Math.abs(i11 - i10) / 2;
        if (i10 >= i11) {
            this.f15970m.set(iAbs, 0, iMin + iAbs, i11);
            this.f15971n.set(iAbs, 0, iMin + iAbs, i11);
        } else {
            this.f15970m.set(0, iAbs, i10, iMin + iAbs);
            this.f15971n.set(0, iAbs, i10, iMin + iAbs);
        }
    }

    /* renamed from: f */
    public String m13726f() {
        InterfaceC8519e interfaceC8519e = this.f15965h;
        if (interfaceC8519e == null) {
            interfaceC8519e = this.f15964g;
        }
        return interfaceC8519e.mo13884a(this.f15958a);
    }

    /* renamed from: g */
    public CalendarDay m13727g() {
        return this.f15958a;
    }

    /* renamed from: h */
    public String m13728h() {
        return this.f15964g.mo13884a(this.f15958a);
    }

    /* renamed from: i */
    public final void m13729i() {
        Drawable drawable = this.f15962e;
        if (drawable != null) {
            setBackgroundDrawable(drawable);
            return;
        }
        Drawable drawableM13721c = m13721c(this.f15959b, this.f15960c, this.f15971n);
        this.f15963f = drawableM13721c;
        setBackgroundDrawable(drawableM13721c);
    }

    /* renamed from: j */
    public void m13730j(Drawable drawable) {
        if (drawable == null) {
            this.f15961d = null;
        } else {
            this.f15961d = drawable.getConstantState().newDrawable(getResources());
        }
        invalidate();
    }

    /* renamed from: k */
    public void m13731k(CalendarDay calendarDay) {
        this.f15958a = calendarDay;
        setText(m13728h());
    }

    /* renamed from: l */
    public void m13732l(InterfaceC8519e interfaceC8519e) {
        InterfaceC8519e interfaceC8519e2 = this.f15965h;
        if (interfaceC8519e2 == this.f15964g) {
            interfaceC8519e2 = interfaceC8519e;
        }
        this.f15965h = interfaceC8519e2;
        if (interfaceC8519e == null) {
            interfaceC8519e = InterfaceC8519e.f16104a;
        }
        this.f15964g = interfaceC8519e;
        CharSequence text = getText();
        Object[] spans = text instanceof Spanned ? ((Spanned) text).getSpans(0, text.length(), Object.class) : null;
        SpannableString spannableString = new SpannableString(m13728h());
        if (spans != null) {
            for (Object obj : spans) {
                spannableString.setSpan(obj, 0, spannableString.length(), 33);
            }
        }
        setText(spannableString);
    }

    /* renamed from: m */
    public void m13733m(InterfaceC8519e interfaceC8519e) {
        if (interfaceC8519e == null) {
            interfaceC8519e = this.f15964g;
        }
        this.f15965h = interfaceC8519e;
        setContentDescription(m13726f());
    }

    /* renamed from: n */
    public final void m13734n() {
        boolean z10 = this.f15967j && this.f15966i && !this.f15968k;
        super.setEnabled(this.f15966i && !this.f15968k);
        boolean zM4000J = MaterialCalendarView.m4000J(this.f15969l);
        boolean z11 = MaterialCalendarView.m4001K(this.f15969l) || zM4000J;
        boolean zM3999I = MaterialCalendarView.m3999I(this.f15969l);
        boolean z12 = this.f15967j;
        if (!z12 && zM4000J) {
            z10 = true;
        }
        boolean z13 = this.f15966i;
        if (!z13 && z11) {
            z10 |= z12;
        }
        if (this.f15968k && zM3999I) {
            z10 |= z12 && z13;
        }
        if (!z12 && z10) {
            setTextColor(getTextColors().getColorForState(new int[]{-16842910}, -7829368));
        }
        setVisibility(z10 ? 0 : 4);
    }

    /* renamed from: o */
    public void m13735o(int i10) {
        this.f15959b = i10;
        m13729i();
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        Drawable drawable = this.f15961d;
        if (drawable != null) {
            drawable.setBounds(this.f15970m);
            this.f15961d.setState(getDrawableState());
            this.f15961d.draw(canvas);
        }
        this.f15963f.setBounds(this.f15971n);
        super.onDraw(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        m13725b(i12 - i10, i13 - i11);
        m13729i();
    }

    /* renamed from: p */
    public void m13736p(Drawable drawable) {
        if (drawable == null) {
            this.f15962e = null;
        } else {
            this.f15962e = drawable.getConstantState().newDrawable(getResources());
        }
        m13729i();
    }

    /* renamed from: q */
    public void m13737q(int i10, boolean z10, boolean z11) {
        this.f15969l = i10;
        this.f15967j = z11;
        this.f15966i = z10;
        m13734n();
    }
}
