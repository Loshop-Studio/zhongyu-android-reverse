package p070b.p074b.p075a.p076a.p104z;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.Filterable;
import android.widget.ListAdapter;
import com.google.android.material.textfield.TextInputLayout;
import io.github.inflationx.calligraphy3.BuildConfig;
import io.github.inflationx.calligraphy3.C1088R;
import java.lang.reflect.InvocationTargetException;
import java.util.Locale;
import p000a.p005b.p014h.C0075d;
import p000a.p005b.p014h.C0084h0;
import p070b.p074b.p075a.p076a.C0564b;
import p070b.p074b.p075a.p076a.p077a0.p078a.C0563a;
import p070b.p074b.p075a.p076a.p096r.C0655j;

/* renamed from: b.b.a.a.z.p */
/* loaded from: classes.dex */
public class C0704p extends C0075d {

    /* renamed from: e */
    public final C0084h0 f4191e;

    /* renamed from: f */
    public final AccessibilityManager f4192f;

    /* renamed from: g */
    public final Rect f4193g;

    public C0704p(Context context, AttributeSet attributeSet) {
        super(C0563a.m2100a(context, attributeSet, C1088R.attr.autoCompleteTextViewStyle, 0), attributeSet, C1088R.attr.autoCompleteTextViewStyle);
        this.f4193g = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayM2269d = C0655j.m2269d(context2, attributeSet, C0564b.f3514i, C1088R.attr.autoCompleteTextViewStyle, C1088R.style.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        if (typedArrayM2269d.hasValue(0) && typedArrayM2269d.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.f4192f = (AccessibilityManager) context2.getSystemService("accessibility");
        C0084h0 c0084h0 = new C0084h0(context2, null, C1088R.attr.listPopupWindowStyle, 0);
        this.f4191e = c0084h0;
        c0084h0.m332s(true);
        c0084h0.f660q = this;
        c0084h0.f644A.setInputMethodMode(2);
        c0084h0.mo329o(getAdapter());
        c0084h0.f661r = new C0703o(this);
        typedArrayM2269d.recycle();
    }

    /* renamed from: a */
    public static void m2350a(C0704p c0704p, Object obj) {
        c0704p.setText(c0704p.convertSelectionToString(obj), false);
    }

    /* renamed from: b */
    public final TextInputLayout m2351b() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayoutM2351b = m2351b();
        return (textInputLayoutM2351b == null || !textInputLayoutM2351b.f4982B) ? super.getHint() : textInputLayoutM2351b.getHint();
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayoutM2351b = m2351b();
        if (textInputLayoutM2351b != null && textInputLayoutM2351b.f4982B && super.getHint() == null && Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu")) {
            setHint(BuildConfig.FLAVOR);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout textInputLayoutM2351b = m2351b();
            int measuredWidth2 = 0;
            if (adapter != null && textInputLayoutM2351b != null) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                C0084h0 c0084h0 = this.f4191e;
                int iMin = Math.min(adapter.getCount(), Math.max(0, !c0084h0.mo171a() ? -1 : c0084h0.f647d.getSelectedItemPosition()) + 15);
                View view = null;
                int iMax = 0;
                for (int iMax2 = Math.max(0, iMin - 15); iMax2 < iMin; iMax2++) {
                    int itemViewType = adapter.getItemViewType(iMax2);
                    if (itemViewType != measuredWidth2) {
                        view = null;
                        measuredWidth2 = itemViewType;
                    }
                    view = adapter.getView(iMax2, view, textInputLayoutM2351b);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    iMax = Math.max(iMax, view.getMeasuredWidth());
                }
                Drawable drawableM328n = this.f4191e.m328n();
                if (drawableM328n != null) {
                    drawableM328n.getPadding(this.f4193g);
                    Rect rect = this.f4193g;
                    iMax += rect.left + rect.right;
                }
                measuredWidth2 = textInputLayoutM2351b.getEndIconView().getMeasuredWidth() + iMax;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, measuredWidth2), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t) {
        super.setAdapter(t);
        this.f4191e.mo329o(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void showDropDown() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        AccessibilityManager accessibilityManager;
        if (getInputType() == 0 && (accessibilityManager = this.f4192f) != null && accessibilityManager.isTouchExplorationEnabled()) {
            this.f4191e.mo172b();
        } else {
            super.showDropDown();
        }
    }
}
