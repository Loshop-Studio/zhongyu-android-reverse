package com.jaredrummler.android.colorpicker;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.preference.Preference;
import androidx.preference.PreferenceViewHolder;
import p196p1.InterfaceC8815b;

/* loaded from: classes.dex */
public class ColorPreferenceCompat extends Preference implements InterfaceC8815b {

    /* renamed from: a */
    public int f4627a;

    /* renamed from: b */
    public boolean f4628b;

    /* renamed from: c */
    public int f4629c;

    /* renamed from: d */
    public int f4630d;

    /* renamed from: e */
    public boolean f4631e;

    /* renamed from: f */
    public boolean f4632f;

    /* renamed from: g */
    public boolean f4633g;

    /* renamed from: h */
    public boolean f4634h;

    /* renamed from: i */
    public int f4635i;

    /* renamed from: j */
    public int[] f4636j;

    /* renamed from: k */
    public int f4637k;

    public ColorPreferenceCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4627a = ViewCompat.MEASURED_STATE_MASK;
        m4363e(attributeSet);
    }

    @Override // p196p1.InterfaceC8815b
    /* renamed from: a */
    public void mo4359a(int i10, int i11) {
        m4364f(i11);
    }

    @Override // p196p1.InterfaceC8815b
    /* renamed from: b */
    public void mo4360b(int i10) {
    }

    /* renamed from: c */
    public FragmentActivity m4361c() {
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
    public String m4362d() {
        return "color_" + getKey();
    }

    /* renamed from: e */
    public final void m4363e(AttributeSet attributeSet) {
        setPersistent(true);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.ColorPreference);
        this.f4628b = typedArrayObtainStyledAttributes.getBoolean(R$styleable.ColorPreference_cpv_showDialog, true);
        this.f4629c = typedArrayObtainStyledAttributes.getInt(R$styleable.ColorPreference_cpv_dialogType, 1);
        this.f4630d = typedArrayObtainStyledAttributes.getInt(R$styleable.ColorPreference_cpv_colorShape, 1);
        this.f4631e = typedArrayObtainStyledAttributes.getBoolean(R$styleable.ColorPreference_cpv_allowPresets, true);
        this.f4632f = typedArrayObtainStyledAttributes.getBoolean(R$styleable.ColorPreference_cpv_allowCustom, true);
        this.f4633g = typedArrayObtainStyledAttributes.getBoolean(R$styleable.ColorPreference_cpv_showAlphaSlider, false);
        this.f4634h = typedArrayObtainStyledAttributes.getBoolean(R$styleable.ColorPreference_cpv_showColorShades, true);
        this.f4635i = typedArrayObtainStyledAttributes.getInt(R$styleable.ColorPreference_cpv_previewSize, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.ColorPreference_cpv_colorPresets, 0);
        this.f4637k = typedArrayObtainStyledAttributes.getResourceId(R$styleable.ColorPreference_cpv_dialogTitle, R$string.cpv_default_title);
        if (resourceId != 0) {
            this.f4636j = getContext().getResources().getIntArray(resourceId);
        } else {
            this.f4636j = ColorPickerDialog.f4542u;
        }
        if (this.f4630d == 1) {
            setWidgetLayoutResource(this.f4635i == 1 ? R$layout.cpv_preference_circle_large : R$layout.cpv_preference_circle);
        } else {
            setWidgetLayoutResource(this.f4635i == 1 ? R$layout.cpv_preference_square_large : R$layout.cpv_preference_square);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: f */
    public void m4364f(int i10) {
        this.f4627a = i10;
        persistInt(i10);
        notifyChanged();
        callChangeListener(Integer.valueOf(i10));
    }

    @Override // androidx.preference.Preference
    public void onAttached() {
        ColorPickerDialog colorPickerDialog;
        super.onAttached();
        if (!this.f4628b || (colorPickerDialog = (ColorPickerDialog) m4361c().getSupportFragmentManager().findFragmentByTag(m4362d())) == null) {
            return;
        }
        colorPickerDialog.m4326p(this);
    }

    @Override // androidx.preference.Preference
    public void onBindViewHolder(PreferenceViewHolder preferenceViewHolder) {
        super.onBindViewHolder(preferenceViewHolder);
        ColorPanelView colorPanelView = (ColorPanelView) preferenceViewHolder.itemView.findViewById(R$id.cpv_preference_preview_color_panel);
        if (colorPanelView != null) {
            colorPanelView.setColor(this.f4627a);
        }
    }

    @Override // androidx.preference.Preference
    public void onClick() {
        super.onClick();
        if (this.f4628b) {
            ColorPickerDialog colorPickerDialogM4332a = ColorPickerDialog.m4315k().m4338g(this.f4629c).m4337f(this.f4637k).m4336e(this.f4630d).m4339h(this.f4636j).m4334c(this.f4631e).m4333b(this.f4632f).m4340i(this.f4633g).m4341j(this.f4634h).m4335d(this.f4627a).m4332a();
            colorPickerDialogM4332a.m4326p(this);
            m4361c().getSupportFragmentManager().beginTransaction().add(colorPickerDialogM4332a, m4362d()).commitAllowingStateLoss();
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
            this.f4627a = getPersistedInt(ViewCompat.MEASURED_STATE_MASK);
            return;
        }
        int iIntValue = ((Integer) obj).intValue();
        this.f4627a = iIntValue;
        persistInt(iIntValue);
    }
}
