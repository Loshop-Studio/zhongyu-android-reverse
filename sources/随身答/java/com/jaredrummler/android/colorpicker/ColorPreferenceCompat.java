package com.jaredrummler.android.colorpicker;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.preference.Preference;
import androidx.preference.PreferenceViewHolder;
import p185n1.InterfaceC9085b;

/* loaded from: classes4.dex */
public class ColorPreferenceCompat extends Preference implements InterfaceC9085b {

    /* renamed from: a */
    public int f5218a;

    /* renamed from: b */
    public boolean f5219b;

    /* renamed from: c */
    public int f5220c;

    /* renamed from: d */
    public int f5221d;

    /* renamed from: e */
    public boolean f5222e;

    /* renamed from: f */
    public boolean f5223f;

    /* renamed from: g */
    public boolean f5224g;

    /* renamed from: h */
    public boolean f5225h;

    /* renamed from: i */
    public int f5226i;

    /* renamed from: j */
    public int[] f5227j;

    /* renamed from: k */
    public int f5228k;

    public ColorPreferenceCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5218a = ViewCompat.MEASURED_STATE_MASK;
        m4557e(attributeSet);
    }

    @Override // p185n1.InterfaceC9085b
    /* renamed from: a */
    public void mo4553a(int i9, int i10) {
        m4558f(i10);
    }

    @Override // p185n1.InterfaceC9085b
    /* renamed from: b */
    public void mo4554b(int i9) {
    }

    /* renamed from: c */
    public FragmentActivity m4555c() {
        Context context = getContext();
        if (context instanceof FragmentActivity) {
            return (FragmentActivity) context;
        }
        if (context instanceof ContextWrapper) {
            Context baseContext = ((ContextWrapper) context).getBaseContext();
            if (baseContext instanceof FragmentActivity) {
                return (FragmentActivity) baseContext;
            }
        }
        throw new IllegalStateException("Error getting activity from context");
    }

    /* renamed from: d */
    public String m4556d() {
        return "color_" + getKey();
    }

    /* renamed from: e */
    public final void m4557e(AttributeSet attributeSet) {
        setPersistent(true);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.ColorPreference);
        this.f5219b = typedArrayObtainStyledAttributes.getBoolean(R$styleable.ColorPreference_cpv_showDialog, true);
        this.f5220c = typedArrayObtainStyledAttributes.getInt(R$styleable.ColorPreference_cpv_dialogType, 1);
        this.f5221d = typedArrayObtainStyledAttributes.getInt(R$styleable.ColorPreference_cpv_colorShape, 1);
        this.f5222e = typedArrayObtainStyledAttributes.getBoolean(R$styleable.ColorPreference_cpv_allowPresets, true);
        this.f5223f = typedArrayObtainStyledAttributes.getBoolean(R$styleable.ColorPreference_cpv_allowCustom, true);
        this.f5224g = typedArrayObtainStyledAttributes.getBoolean(R$styleable.ColorPreference_cpv_showAlphaSlider, false);
        this.f5225h = typedArrayObtainStyledAttributes.getBoolean(R$styleable.ColorPreference_cpv_showColorShades, true);
        this.f5226i = typedArrayObtainStyledAttributes.getInt(R$styleable.ColorPreference_cpv_previewSize, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.ColorPreference_cpv_colorPresets, 0);
        this.f5228k = typedArrayObtainStyledAttributes.getResourceId(R$styleable.ColorPreference_cpv_dialogTitle, R$string.cpv_default_title);
        if (resourceId != 0) {
            this.f5227j = getContext().getResources().getIntArray(resourceId);
        } else {
            this.f5227j = ColorPickerDialog.f5133u;
        }
        if (this.f5221d == 1) {
            setWidgetLayoutResource(this.f5226i == 1 ? R$layout.cpv_preference_circle_large : R$layout.cpv_preference_circle);
        } else {
            setWidgetLayoutResource(this.f5226i == 1 ? R$layout.cpv_preference_square_large : R$layout.cpv_preference_square);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: f */
    public void m4558f(int i9) {
        this.f5218a = i9;
        persistInt(i9);
        notifyChanged();
        callChangeListener(Integer.valueOf(i9));
    }

    @Override // androidx.preference.Preference
    public void onAttached() {
        ColorPickerDialog colorPickerDialog;
        super.onAttached();
        if (!this.f5219b || (colorPickerDialog = (ColorPickerDialog) m4555c().getSupportFragmentManager().findFragmentByTag(m4556d())) == null) {
            return;
        }
        colorPickerDialog.m4520p(this);
    }

    @Override // androidx.preference.Preference
    public void onBindViewHolder(PreferenceViewHolder preferenceViewHolder) {
        super.onBindViewHolder(preferenceViewHolder);
        ColorPanelView colorPanelView = (ColorPanelView) preferenceViewHolder.itemView.findViewById(R$id.cpv_preference_preview_color_panel);
        if (colorPanelView != null) {
            colorPanelView.setColor(this.f5218a);
        }
    }

    @Override // androidx.preference.Preference
    public void onClick() {
        super.onClick();
        if (this.f5219b) {
            ColorPickerDialog colorPickerDialogM4526a = ColorPickerDialog.m4509k().m4532g(this.f5220c).m4531f(this.f5228k).m4530e(this.f5221d).m4533h(this.f5227j).m4528c(this.f5222e).m4527b(this.f5223f).m4534i(this.f5224g).m4535j(this.f5225h).m4529d(this.f5218a).m4526a();
            colorPickerDialogM4526a.m4520p(this);
            m4555c().getSupportFragmentManager().beginTransaction().add(colorPickerDialogM4526a, m4556d()).commitAllowingStateLoss();
        }
    }

    @Override // androidx.preference.Preference
    public Object onGetDefaultValue(TypedArray typedArray, int i9) {
        return Integer.valueOf(typedArray.getInteger(i9, ViewCompat.MEASURED_STATE_MASK));
    }

    @Override // androidx.preference.Preference
    public void onSetInitialValue(Object obj) {
        super.onSetInitialValue(obj);
        if (!(obj instanceof Integer)) {
            this.f5218a = getPersistedInt(ViewCompat.MEASURED_STATE_MASK);
            return;
        }
        int iIntValue = ((Integer) obj).intValue();
        this.f5218a = iIntValue;
        persistInt(iIntValue);
    }
}
