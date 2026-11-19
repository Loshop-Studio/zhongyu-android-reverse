package p070b.p074b.p075a.p076a.p091m;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.internal.CheckableImageButton;
import io.github.inflationx.calligraphy3.C1088R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import p000a.p005b.p007d.p008a.C0034a;
import p000a.p031h.p043j.C0266o;
import p000a.p031h.p043j.C0273v;
import p000a.p052k.p053b.C0294a;
import p000a.p052k.p053b.DialogInterfaceOnCancelListenerC0318l;
import p070b.p074b.p075a.p076a.C0562a;
import p070b.p074b.p075a.p076a.p091m.C0606a;
import p070b.p074b.p075a.p076a.p092n.ViewOnTouchListenerC0635a;
import p070b.p074b.p075a.p076a.p093o.C0636a;
import p070b.p074b.p075a.p076a.p101w.C0675g;
import p070b.p074b.p075a.p076a.p101w.C0678j;

/* renamed from: b.b.a.a.m.o */
/* loaded from: classes.dex */
public final class C0623o<S> extends DialogInterfaceOnCancelListenerC0318l {

    /* renamed from: B0 */
    public static final /* synthetic */ int f3769B0 = 0;

    /* renamed from: A0 */
    public Button f3770A0;

    /* renamed from: k0 */
    public final LinkedHashSet<InterfaceC0625q<? super S>> f3771k0 = new LinkedHashSet<>();

    /* renamed from: l0 */
    public final LinkedHashSet<View.OnClickListener> f3772l0 = new LinkedHashSet<>();

    /* renamed from: m0 */
    public final LinkedHashSet<DialogInterface.OnCancelListener> f3773m0 = new LinkedHashSet<>();

    /* renamed from: n0 */
    public final LinkedHashSet<DialogInterface.OnDismissListener> f3774n0 = new LinkedHashSet<>();

    /* renamed from: o0 */
    public int f3775o0;

    /* renamed from: p0 */
    public InterfaceC0612d<S> f3776p0;

    /* renamed from: q0 */
    public AbstractC0632x<S> f3777q0;

    /* renamed from: r0 */
    public C0606a f3778r0;

    /* renamed from: s0 */
    public C0615g<S> f3779s0;

    /* renamed from: t0 */
    public int f3780t0;

    /* renamed from: u0 */
    public CharSequence f3781u0;

    /* renamed from: v0 */
    public boolean f3782v0;

    /* renamed from: w0 */
    public int f3783w0;

    /* renamed from: x0 */
    public TextView f3784x0;

    /* renamed from: y0 */
    public CheckableImageButton f3785y0;

    /* renamed from: z0 */
    public C0675g f3786z0;

    /* renamed from: b.b.a.a.m.o$a */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator<InterfaceC0625q<? super S>> it = C0623o.this.f3771k0.iterator();
            while (it.hasNext()) {
                it.next().m2204a(C0623o.this.f3776p0.m2186a());
            }
            C0623o.this.m1124x0(false, false);
        }
    }

    /* renamed from: b.b.a.a.m.o$b */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator<View.OnClickListener> it = C0623o.this.f3772l0.iterator();
            while (it.hasNext()) {
                it.next().onClick(view);
            }
            C0623o.this.m1124x0(false, false);
        }
    }

    /* renamed from: b.b.a.a.m.o$c */
    public class c extends AbstractC0631w<S> {
        public c() {
        }

        @Override // p070b.p074b.p075a.p076a.p091m.AbstractC0631w
        /* renamed from: a */
        public void mo2203a(S s) {
            C0623o c0623o = C0623o.this;
            int i = C0623o.f3769B0;
            c0623o.m2201D0();
            C0623o c0623o2 = C0623o.this;
            c0623o2.f3770A0.setEnabled(c0623o2.f3776p0.m2187b());
        }
    }

    /* renamed from: A0 */
    public static int m2198A0(Context context) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(C1088R.dimen.mtrl_calendar_content_padding);
        int i = C0627s.m2207p().f3798f;
        return ((i - 1) * resources.getDimensionPixelOffset(C1088R.dimen.mtrl_calendar_month_horizontal_padding)) + (resources.getDimensionPixelSize(C1088R.dimen.mtrl_calendar_day_width) * i) + (dimensionPixelOffset * 2);
    }

    /* renamed from: B0 */
    public static boolean m2199B0(Context context) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(C0562a.m2096q(context, C1088R.attr.materialCalendarStyle, C0615g.class.getCanonicalName()), new int[]{R.attr.windowFullscreen});
        boolean z = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z;
    }

    /* renamed from: C0 */
    public final void m2200C0() {
        AbstractC0632x<S> c0626r;
        InterfaceC0612d<S> interfaceC0612d = this.f3776p0;
        Context contextM1165k0 = m1165k0();
        int iM2191h = this.f3775o0;
        if (iM2191h == 0) {
            iM2191h = this.f3776p0.m2191h(contextM1165k0);
        }
        C0606a c0606a = this.f3778r0;
        C0615g<S> c0615g = new C0615g<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", iM2191h);
        bundle.putParcelable("GRID_SELECTOR_KEY", interfaceC0612d);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", c0606a);
        bundle.putParcelable("CURRENT_MONTH_KEY", c0606a.f3704d);
        c0615g.m1175p0(bundle);
        this.f3779s0 = c0615g;
        if (this.f3785y0.isChecked()) {
            InterfaceC0612d<S> interfaceC0612d2 = this.f3776p0;
            C0606a c0606a2 = this.f3778r0;
            c0626r = new C0626r<>();
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("DATE_SELECTOR_KEY", interfaceC0612d2);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", c0606a2);
            c0626r.m1175p0(bundle2);
        } else {
            c0626r = this.f3779s0;
        }
        this.f3777q0 = c0626r;
        m2201D0();
        C0294a c0294a = new C0294a(m1162j());
        c0294a.mo974c(C1088R.id.mtrl_calendar_frame, this.f3777q0, null, 2);
        if (c0294a.f1939g) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        c0294a.f1762p.m1009D(c0294a, false);
        AbstractC0632x<S> abstractC0632x = this.f3777q0;
        abstractC0632x.f3814V.add(new c());
    }

    /* renamed from: D0 */
    public final void m2201D0() {
        String strM2189e = this.f3776p0.m2189e(m1164k());
        this.f3784x0.setContentDescription(String.format(m1132C(C1088R.string.mtrl_picker_announce_current_selection), strM2189e));
        this.f3784x0.setText(strM2189e);
    }

    /* renamed from: E0 */
    public final void m2202E0(CheckableImageButton checkableImageButton) {
        this.f3785y0.setContentDescription(checkableImageButton.getContext().getString(this.f3785y0.isChecked() ? C1088R.string.mtrl_picker_toggle_to_calendar_input_mode : C1088R.string.mtrl_picker_toggle_to_text_input_mode));
    }

    @Override // p000a.p052k.p053b.DialogInterfaceOnCancelListenerC0318l, p000a.p052k.p053b.ComponentCallbacksC0320m
    /* renamed from: M */
    public final void mo1114M(Bundle bundle) {
        super.mo1114M(bundle);
        if (bundle == null) {
            bundle = this.f1983h;
        }
        this.f3775o0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.f3776p0 = (InterfaceC0612d) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f3778r0 = (C0606a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f3780t0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f3781u0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f3783w0 = bundle.getInt("INPUT_MODE_KEY");
    }

    @Override // p000a.p052k.p053b.ComponentCallbacksC0320m
    /* renamed from: P */
    public final View mo1143P(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) throws Resources.NotFoundException {
        View viewInflate = layoutInflater.inflate(this.f3782v0 ? C1088R.layout.mtrl_picker_fullscreen : C1088R.layout.mtrl_picker_dialog, viewGroup);
        Context context = viewInflate.getContext();
        if (this.f3782v0) {
            viewInflate.findViewById(C1088R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(m2198A0(context), -2));
        } else {
            View viewFindViewById = viewInflate.findViewById(C1088R.id.mtrl_calendar_main_pane);
            View viewFindViewById2 = viewInflate.findViewById(C1088R.id.mtrl_calendar_frame);
            viewFindViewById.setLayoutParams(new LinearLayout.LayoutParams(m2198A0(context), -1));
            Resources resources = m1165k0().getResources();
            int dimensionPixelOffset = resources.getDimensionPixelOffset(C1088R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(C1088R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(C1088R.dimen.mtrl_calendar_navigation_height);
            int dimensionPixelSize = resources.getDimensionPixelSize(C1088R.dimen.mtrl_calendar_days_of_week_height);
            int i = C0628t.f3801f;
            viewFindViewById2.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(C1088R.dimen.mtrl_calendar_month_vertical_padding) * (i - 1)) + (resources.getDimensionPixelSize(C1088R.dimen.mtrl_calendar_day_height) * i) + resources.getDimensionPixelOffset(C1088R.dimen.mtrl_calendar_bottom_padding));
        }
        TextView textView = (TextView) viewInflate.findViewById(C1088R.id.mtrl_picker_header_selection_text);
        this.f3784x0 = textView;
        WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
        textView.setAccessibilityLiveRegion(1);
        this.f3785y0 = (CheckableImageButton) viewInflate.findViewById(C1088R.id.mtrl_picker_header_toggle);
        TextView textView2 = (TextView) viewInflate.findViewById(C1088R.id.mtrl_picker_title_text);
        CharSequence charSequence = this.f3781u0;
        if (charSequence != null) {
            textView2.setText(charSequence);
        } else {
            textView2.setText(this.f3780t0);
        }
        this.f3785y0.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.f3785y0;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, C0034a.m129a(context, C1088R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], C0034a.m129a(context, C1088R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.f3785y0.setChecked(this.f3783w0 != 0);
        C0266o.m875n(this.f3785y0, null);
        m2202E0(this.f3785y0);
        this.f3785y0.setOnClickListener(new ViewOnClickListenerC0624p(this));
        this.f3770A0 = (Button) viewInflate.findViewById(C1088R.id.confirm_button);
        if (this.f3776p0.m2187b()) {
            this.f3770A0.setEnabled(true);
        } else {
            this.f3770A0.setEnabled(false);
        }
        this.f3770A0.setTag("CONFIRM_BUTTON_TAG");
        this.f3770A0.setOnClickListener(new a());
        Button button = (Button) viewInflate.findViewById(C1088R.id.cancel_button);
        button.setTag("CANCEL_BUTTON_TAG");
        button.setOnClickListener(new b());
        return viewInflate;
    }

    @Override // p000a.p052k.p053b.DialogInterfaceOnCancelListenerC0318l, p000a.p052k.p053b.ComponentCallbacksC0320m
    /* renamed from: b0 */
    public final void mo1119b0(Bundle bundle) {
        super.mo1119b0(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f3775o0);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f3776p0);
        C0606a.b bVar = new C0606a.b(this.f3778r0);
        C0627s c0627s = this.f3779s0.f3742Z;
        if (c0627s != null) {
            bVar.f3712c = Long.valueOf(c0627s.f3800h);
        }
        if (bVar.f3712c == null) {
            long j = C0627s.m2207p().f3800h;
            long j2 = bVar.f3710a;
            if (j2 > j || j > bVar.f3711b) {
                j = j2;
            }
            bVar.f3712c = Long.valueOf(j);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", bVar.f3713d);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new C0606a(C0627s.m2206o(bVar.f3710a), C0627s.m2206o(bVar.f3711b), C0627s.m2206o(bVar.f3712c.longValue()), (C0606a.c) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY"), null));
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f3780t0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f3781u0);
    }

    @Override // p000a.p052k.p053b.DialogInterfaceOnCancelListenerC0318l, p000a.p052k.p053b.ComponentCallbacksC0320m
    /* renamed from: c0 */
    public void mo1120c0() throws Resources.NotFoundException {
        super.mo1120c0();
        Window window = m1126z0().getWindow();
        if (this.f3782v0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f3786z0);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = m1191y().getDimensionPixelOffset(C1088R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f3786z0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new ViewOnTouchListenerC0635a(m1126z0(), rect));
        }
        m2200C0();
    }

    @Override // p000a.p052k.p053b.DialogInterfaceOnCancelListenerC0318l, p000a.p052k.p053b.ComponentCallbacksC0320m
    /* renamed from: d0 */
    public void mo1121d0() {
        this.f3777q0.f3814V.clear();
        this.f1961E = true;
        Dialog dialog = this.f1923g0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // p000a.p052k.p053b.DialogInterfaceOnCancelListenerC0318l, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.f3773m0.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
    }

    @Override // p000a.p052k.p053b.DialogInterfaceOnCancelListenerC0318l, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.f3774n0.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.f1963G;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // p000a.p052k.p053b.DialogInterfaceOnCancelListenerC0318l
    /* renamed from: y0 */
    public final Dialog mo1125y0(Bundle bundle) {
        Context contextM1165k0 = m1165k0();
        Context contextM1165k02 = m1165k0();
        int iM2191h = this.f3775o0;
        if (iM2191h == 0) {
            iM2191h = this.f3776p0.m2191h(contextM1165k02);
        }
        Dialog dialog = new Dialog(contextM1165k0, iM2191h);
        Context context = dialog.getContext();
        this.f3782v0 = m2199B0(context);
        int iM2096q = C0562a.m2096q(context, C1088R.attr.colorSurface, C0623o.class.getCanonicalName());
        C0675g c0675g = new C0675g(C0678j.m2305b(context, null, C1088R.attr.materialCalendarStyle, C1088R.style.Widget_MaterialComponents_MaterialCalendar).m2310a());
        this.f3786z0 = c0675g;
        c0675g.f3998b.f4022b = new C0636a(context);
        c0675g.m2303w();
        this.f3786z0.m2296p(ColorStateList.valueOf(iM2096q));
        C0675g c0675g2 = this.f3786z0;
        View decorView = dialog.getWindow().getDecorView();
        WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
        c0675g2.m2295o(decorView.getElevation());
        return dialog;
    }
}
