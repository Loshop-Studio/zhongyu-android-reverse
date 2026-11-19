package com.jaredrummler.android.colorpicker;

import android.content.Context;
import android.content.res.TypedArray;
import android.preference.Preference;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.FragmentActivity;
import p112m1.InterfaceC6095k;

/* loaded from: classes3.dex */
public class ColorPreference extends Preference implements InterfaceC6095k {

    /* renamed from: a */
    public int f3179a;

    /* renamed from: b */
    public boolean f3180b;

    /* renamed from: c */
    public int f3181c;

    /* renamed from: d */
    public int f3182d;

    /* renamed from: e */
    public boolean f3183e;

    /* renamed from: f */
    public boolean f3184f;

    /* renamed from: g */
    public boolean f3185g;

    /* renamed from: h */
    public boolean f3186h;

    /* renamed from: i */
    public int f3187i;

    /* renamed from: j */
    public int[] f3188j;

    /* renamed from: k */
    public int f3189k;

    public ColorPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3179a = ViewCompat.MEASURED_STATE_MASK;
        m2845b(attributeSet);
    }

    @Override // p112m1.InterfaceC6095k
    /* renamed from: a */
    public final void mo2844a(int i) {
        this.f3179a = i;
        persistInt(i);
        notifyChanged();
        callChangeListener(Integer.valueOf(i));
    }

    /* renamed from: b */
    public final void m2845b(AttributeSet attributeSet) {
        setPersistent(true);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.ColorPreference);
        this.f3180b = typedArrayObtainStyledAttributes.getBoolean(R$styleable.ColorPreference_cpv_showDialog, true);
        this.f3181c = typedArrayObtainStyledAttributes.getInt(R$styleable.ColorPreference_cpv_dialogType, 1);
        this.f3182d = typedArrayObtainStyledAttributes.getInt(R$styleable.ColorPreference_cpv_colorShape, 1);
        this.f3183e = typedArrayObtainStyledAttributes.getBoolean(R$styleable.ColorPreference_cpv_allowPresets, true);
        this.f3184f = typedArrayObtainStyledAttributes.getBoolean(R$styleable.ColorPreference_cpv_allowCustom, true);
        this.f3185g = typedArrayObtainStyledAttributes.getBoolean(R$styleable.ColorPreference_cpv_showAlphaSlider, false);
        this.f3186h = typedArrayObtainStyledAttributes.getBoolean(R$styleable.ColorPreference_cpv_showColorShades, true);
        this.f3187i = typedArrayObtainStyledAttributes.getInt(R$styleable.ColorPreference_cpv_previewSize, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.ColorPreference_cpv_colorPresets, 0);
        this.f3189k = typedArrayObtainStyledAttributes.getResourceId(R$styleable.ColorPreference_cpv_dialogTitle, R$string.cpv_default_title);
        if (resourceId != 0) {
            this.f3188j = getContext().getResources().getIntArray(resourceId);
        } else {
            this.f3188j = ColorPickerDialog.f3127t;
        }
        if (this.f3182d == 1) {
            setWidgetLayoutResource(this.f3187i == 1 ? R$layout.cpv_preference_circle_large : R$layout.cpv_preference_circle);
        } else {
            setWidgetLayoutResource(this.f3187i == 1 ? R$layout.cpv_preference_square_large : R$layout.cpv_preference_square);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.preference.Preference
    public final void onAttachedToActivity() {
        super.onAttachedToActivity();
        if (this.f3180b) {
            ColorPickerDialog colorPickerDialog = (ColorPickerDialog) ((FragmentActivity) getContext()).getSupportFragmentManager().findFragmentByTag("color_" + getKey());
            if (colorPickerDialog != null) {
                colorPickerDialog.f3128a = this;
            }
        }
    }

    @Override // android.preference.Preference
    public final void onBindView(View view) {
        super.onBindView(view);
        ColorPanelView colorPanelView = (ColorPanelView) view.findViewById(R$id.cpv_preference_preview_color_panel);
        if (colorPanelView != null) {
            colorPanelView.setColor(this.f3179a);
        }
    }

    @Override // android.preference.Preference
    public final void onClick() {
        super.onClick();
        if (this.f3180b) {
            C4031a c4031aM2835i = ColorPickerDialog.m2835i();
            c4031aM2835i.f3206e = this.f3181c;
            c4031aM2835i.f3202a = this.f3189k;
            c4031aM2835i.f3213l = this.f3182d;
            c4031aM2835i.f3207f = this.f3188j;
            c4031aM2835i.f3210i = this.f3183e;
            c4031aM2835i.f3211j = this.f3184f;
            c4031aM2835i.f3209h = this.f3185g;
            c4031aM2835i.f3212k = this.f3186h;
            c4031aM2835i.f3208g = this.f3179a;
            ColorPickerDialog colorPickerDialogM2848a = c4031aM2835i.m2848a();
            colorPickerDialogM2848a.f3128a = this;
            ((FragmentActivity) getContext()).getSupportFragmentManager().beginTransaction().add(colorPickerDialogM2848a, "color_" + getKey()).commitAllowingStateLoss();
        }
    }

    @Override // android.preference.Preference
    public final Object onGetDefaultValue(TypedArray typedArray, int i) {
        return Integer.valueOf(typedArray.getInteger(i, ViewCompat.MEASURED_STATE_MASK));
    }

    @Override // android.preference.Preference
    public final void onSetInitialValue(boolean z8, Object obj) {
        if (z8) {
            this.f3179a = getPersistedInt(ViewCompat.MEASURED_STATE_MASK);
            return;
        }
        int iIntValue = ((Integer) obj).intValue();
        this.f3179a = iIntValue;
        persistInt(iIntValue);
    }

    public ColorPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3179a = ViewCompat.MEASURED_STATE_MASK;
        m2845b(attributeSet);
    }
}
