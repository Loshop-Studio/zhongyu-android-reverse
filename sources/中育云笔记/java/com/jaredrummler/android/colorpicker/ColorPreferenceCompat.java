package com.jaredrummler.android.colorpicker;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.preference.Preference;
import androidx.preference.PreferenceViewHolder;
import p162g6.InterfaceC9273b;

/* loaded from: classes5.dex */
public class ColorPreferenceCompat extends Preference implements InterfaceC9273b {

    /* renamed from: c */
    public int f12004c;

    /* renamed from: d */
    public boolean f12005d;

    /* renamed from: e */
    public int f12006e;

    /* renamed from: f */
    public int f12007f;

    /* renamed from: g */
    public boolean f12008g;

    /* renamed from: h */
    public boolean f12009h;

    /* renamed from: i */
    public boolean f12010i;

    /* renamed from: j */
    public boolean f12011j;

    /* renamed from: k */
    public int f12012k;

    /* renamed from: l */
    public int[] f12013l;

    /* renamed from: m */
    public int f12014m;

    public ColorPreferenceCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12004c = ViewCompat.MEASURED_STATE_MASK;
        m8893e(attributeSet);
    }

    /* renamed from: e */
    private void m8893e(AttributeSet attributeSet) {
        setPersistent(true);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.ColorPreference);
        this.f12005d = typedArrayObtainStyledAttributes.getBoolean(R$styleable.ColorPreference_cpv_showDialog, true);
        this.f12006e = typedArrayObtainStyledAttributes.getInt(R$styleable.ColorPreference_cpv_dialogType, 1);
        this.f12007f = typedArrayObtainStyledAttributes.getInt(R$styleable.ColorPreference_cpv_colorShape, 1);
        this.f12008g = typedArrayObtainStyledAttributes.getBoolean(R$styleable.ColorPreference_cpv_allowPresets, true);
        this.f12009h = typedArrayObtainStyledAttributes.getBoolean(R$styleable.ColorPreference_cpv_allowCustom, true);
        this.f12010i = typedArrayObtainStyledAttributes.getBoolean(R$styleable.ColorPreference_cpv_showAlphaSlider, false);
        this.f12011j = typedArrayObtainStyledAttributes.getBoolean(R$styleable.ColorPreference_cpv_showColorShades, true);
        this.f12012k = typedArrayObtainStyledAttributes.getInt(R$styleable.ColorPreference_cpv_previewSize, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.ColorPreference_cpv_colorPresets, 0);
        this.f12014m = typedArrayObtainStyledAttributes.getResourceId(R$styleable.ColorPreference_cpv_dialogTitle, R$string.cpv_default_title);
        if (resourceId != 0) {
            this.f12013l = getContext().getResources().getIntArray(resourceId);
        } else {
            this.f12013l = ColorPickerDialog.f11908x;
        }
        if (this.f12007f == 1) {
            setWidgetLayoutResource(this.f12012k == 1 ? R$layout.cpv_preference_circle_large : R$layout.cpv_preference_circle);
        } else {
            setWidgetLayoutResource(this.f12012k == 1 ? R$layout.cpv_preference_square_large : R$layout.cpv_preference_square);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // p162g6.InterfaceC9273b
    /* renamed from: a */
    public void mo8888a(int i10, int i11) {
        m8896f(i11);
    }

    @Override // p162g6.InterfaceC9273b
    /* renamed from: b */
    public void mo8889b(int i10) {
    }

    /* renamed from: c */
    public FragmentActivity m8894c() {
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
    public String m8895d() {
        return "color_" + getKey();
    }

    /* renamed from: f */
    public void m8896f(int i10) {
        this.f12004c = i10;
        persistInt(i10);
        notifyChanged();
        callChangeListener(Integer.valueOf(i10));
    }

    @Override // androidx.preference.Preference
    public void onAttached() {
        ColorPickerDialog colorPickerDialog;
        super.onAttached();
        if (!this.f12005d || (colorPickerDialog = (ColorPickerDialog) m8894c().getSupportFragmentManager().findFragmentByTag(m8895d())) == null) {
            return;
        }
        colorPickerDialog.m8846B(this);
    }

    @Override // androidx.preference.Preference
    public void onBindViewHolder(PreferenceViewHolder preferenceViewHolder) {
        super.onBindViewHolder(preferenceViewHolder);
        ColorPanelView colorPanelView = (ColorPanelView) preferenceViewHolder.itemView.findViewById(R$id.cpv_preference_preview_color_panel);
        if (colorPanelView != null) {
            colorPanelView.setColor(this.f12004c);
        }
    }

    @Override // androidx.preference.Preference
    public void onClick() {
        super.onClick();
        if (this.f12005d) {
            ColorPickerDialog colorPickerDialogM8861a = ColorPickerDialog.m8844w().m8867g(this.f12006e).m8866f(this.f12014m).m8865e(this.f12007f).m8868h(this.f12013l).m8863c(this.f12008g).m8862b(this.f12009h).m8869i(this.f12010i).m8870j(this.f12011j).m8864d(this.f12004c).m8861a();
            colorPickerDialogM8861a.m8846B(this);
            m8894c().getSupportFragmentManager().beginTransaction().add(colorPickerDialogM8861a, m8895d()).commitAllowingStateLoss();
        }
    }

    @Override // androidx.preference.Preference
    public Object onGetDefaultValue(TypedArray typedArray, int i10) {
        return Integer.valueOf(typedArray.getInteger(i10, ViewCompat.MEASURED_STATE_MASK));
    }

    @Override // androidx.preference.Preference
    public void onSetInitialValue(Object obj) {
        super.onSetInitialValue(obj);
        if (!(obj instanceof Integer)) {
            this.f12004c = getPersistedInt(ViewCompat.MEASURED_STATE_MASK);
            return;
        }
        int iIntValue = ((Integer) obj).intValue();
        this.f12004c = iIntValue;
        persistInt(iIntValue);
    }

    public ColorPreferenceCompat(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f12004c = ViewCompat.MEASURED_STATE_MASK;
        m8893e(attributeSet);
    }
}
