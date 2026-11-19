package com.jaredrummler.android.colorpicker;

import android.content.Context;
import android.content.res.TypedArray;
import android.preference.Preference;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.FragmentActivity;
import p162g6.InterfaceC9273b;

/* loaded from: classes5.dex */
public class ColorPreference extends Preference implements InterfaceC9273b {

    /* renamed from: c */
    public int f11993c;

    /* renamed from: d */
    public boolean f11994d;

    /* renamed from: e */
    public int f11995e;

    /* renamed from: f */
    public int f11996f;

    /* renamed from: g */
    public boolean f11997g;

    /* renamed from: h */
    public boolean f11998h;

    /* renamed from: i */
    public boolean f11999i;

    /* renamed from: j */
    public boolean f12000j;

    /* renamed from: k */
    public int f12001k;

    /* renamed from: l */
    public int[] f12002l;

    /* renamed from: m */
    public int f12003m;

    public ColorPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11993c = ViewCompat.MEASURED_STATE_MASK;
        m8891d(attributeSet);
    }

    @Override // p162g6.InterfaceC9273b
    /* renamed from: a */
    public void mo8888a(int i10, int i11) {
        m8892e(i11);
    }

    @Override // p162g6.InterfaceC9273b
    /* renamed from: b */
    public void mo8889b(int i10) {
    }

    /* renamed from: c */
    public String m8890c() {
        return "color_" + getKey();
    }

    /* renamed from: d */
    public final void m8891d(AttributeSet attributeSet) {
        setPersistent(true);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.ColorPreference);
        this.f11994d = typedArrayObtainStyledAttributes.getBoolean(R$styleable.ColorPreference_cpv_showDialog, true);
        this.f11995e = typedArrayObtainStyledAttributes.getInt(R$styleable.ColorPreference_cpv_dialogType, 1);
        this.f11996f = typedArrayObtainStyledAttributes.getInt(R$styleable.ColorPreference_cpv_colorShape, 1);
        this.f11997g = typedArrayObtainStyledAttributes.getBoolean(R$styleable.ColorPreference_cpv_allowPresets, true);
        this.f11998h = typedArrayObtainStyledAttributes.getBoolean(R$styleable.ColorPreference_cpv_allowCustom, true);
        this.f11999i = typedArrayObtainStyledAttributes.getBoolean(R$styleable.ColorPreference_cpv_showAlphaSlider, false);
        this.f12000j = typedArrayObtainStyledAttributes.getBoolean(R$styleable.ColorPreference_cpv_showColorShades, true);
        this.f12001k = typedArrayObtainStyledAttributes.getInt(R$styleable.ColorPreference_cpv_previewSize, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.ColorPreference_cpv_colorPresets, 0);
        this.f12003m = typedArrayObtainStyledAttributes.getResourceId(R$styleable.ColorPreference_cpv_dialogTitle, R$string.cpv_default_title);
        if (resourceId != 0) {
            this.f12002l = getContext().getResources().getIntArray(resourceId);
        } else {
            this.f12002l = ColorPickerDialog.f11908x;
        }
        if (this.f11996f == 1) {
            setWidgetLayoutResource(this.f12001k == 1 ? R$layout.cpv_preference_circle_large : R$layout.cpv_preference_circle);
        } else {
            setWidgetLayoutResource(this.f12001k == 1 ? R$layout.cpv_preference_square_large : R$layout.cpv_preference_square);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: e */
    public void m8892e(int i10) {
        this.f11993c = i10;
        persistInt(i10);
        notifyChanged();
        callChangeListener(Integer.valueOf(i10));
    }

    @Override // android.preference.Preference
    public void onAttachedToActivity() {
        ColorPickerDialog colorPickerDialog;
        super.onAttachedToActivity();
        if (!this.f11994d || (colorPickerDialog = (ColorPickerDialog) ((FragmentActivity) getContext()).getSupportFragmentManager().findFragmentByTag(m8890c())) == null) {
            return;
        }
        colorPickerDialog.m8846B(this);
    }

    @Override // android.preference.Preference
    public void onBindView(View view) {
        super.onBindView(view);
        ColorPanelView colorPanelView = (ColorPanelView) view.findViewById(R$id.cpv_preference_preview_color_panel);
        if (colorPanelView != null) {
            colorPanelView.setColor(this.f11993c);
        }
    }

    @Override // android.preference.Preference
    public void onClick() {
        super.onClick();
        if (this.f11994d) {
            ColorPickerDialog colorPickerDialogM8861a = ColorPickerDialog.m8844w().m8867g(this.f11995e).m8866f(this.f12003m).m8865e(this.f11996f).m8868h(this.f12002l).m8863c(this.f11997g).m8862b(this.f11998h).m8869i(this.f11999i).m8870j(this.f12000j).m8864d(this.f11993c).m8861a();
            colorPickerDialogM8861a.m8846B(this);
            ((FragmentActivity) getContext()).getSupportFragmentManager().beginTransaction().add(colorPickerDialogM8861a, m8890c()).commitAllowingStateLoss();
        }
    }

    @Override // android.preference.Preference
    public Object onGetDefaultValue(TypedArray typedArray, int i10) {
        return Integer.valueOf(typedArray.getInteger(i10, ViewCompat.MEASURED_STATE_MASK));
    }

    @Override // android.preference.Preference
    public void onSetInitialValue(boolean z10, Object obj) {
        if (z10) {
            this.f11993c = getPersistedInt(ViewCompat.MEASURED_STATE_MASK);
            return;
        }
        int iIntValue = ((Integer) obj).intValue();
        this.f11993c = iIntValue;
        persistInt(iIntValue);
    }

    public ColorPreference(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f11993c = ViewCompat.MEASURED_STATE_MASK;
        m8891d(attributeSet);
    }
}
