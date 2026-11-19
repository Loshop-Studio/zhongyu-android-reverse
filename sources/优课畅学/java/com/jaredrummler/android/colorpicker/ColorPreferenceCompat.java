package com.jaredrummler.android.colorpicker;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.fragment.app.FragmentActivity;
import androidx.preference.Preference;
import androidx.preference.PreferenceViewHolder;
import p082e1.InterfaceC8347b;

/* loaded from: classes4.dex */
public class ColorPreferenceCompat extends Preference implements InterfaceC8347b {

    /* renamed from: a */
    public int f4190a;

    /* renamed from: b */
    public boolean f4191b;

    /* renamed from: c */
    public int f4192c;

    /* renamed from: d */
    public int f4193d;

    /* renamed from: e */
    public boolean f4194e;

    /* renamed from: f */
    public boolean f4195f;

    /* renamed from: g */
    public boolean f4196g;

    /* renamed from: h */
    public boolean f4197h;

    /* renamed from: i */
    public int f4198i;

    /* renamed from: j */
    public int[] f4199j;

    /* renamed from: k */
    public int f4200k;

    public ColorPreferenceCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4190a = -16777216;
        m3975e(attributeSet);
    }

    @Override // p082e1.InterfaceC8347b
    /* renamed from: a */
    public void mo3971a(int i10, int i11) {
        m3976f(i11);
    }

    @Override // p082e1.InterfaceC8347b
    /* renamed from: b */
    public void mo3972b(int i10) {
    }

    /* renamed from: c */
    public FragmentActivity m3973c() {
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
    public String m3974d() {
        return "color_" + getKey();
    }

    /* renamed from: e */
    public final void m3975e(AttributeSet attributeSet) {
        setPersistent(true);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.ColorPreference);
        this.f4191b = typedArrayObtainStyledAttributes.getBoolean(R$styleable.ColorPreference_cpv_showDialog, true);
        this.f4192c = typedArrayObtainStyledAttributes.getInt(R$styleable.ColorPreference_cpv_dialogType, 1);
        this.f4193d = typedArrayObtainStyledAttributes.getInt(R$styleable.ColorPreference_cpv_colorShape, 1);
        this.f4194e = typedArrayObtainStyledAttributes.getBoolean(R$styleable.ColorPreference_cpv_allowPresets, true);
        this.f4195f = typedArrayObtainStyledAttributes.getBoolean(R$styleable.ColorPreference_cpv_allowCustom, true);
        this.f4196g = typedArrayObtainStyledAttributes.getBoolean(R$styleable.ColorPreference_cpv_showAlphaSlider, false);
        this.f4197h = typedArrayObtainStyledAttributes.getBoolean(R$styleable.ColorPreference_cpv_showColorShades, true);
        this.f4198i = typedArrayObtainStyledAttributes.getInt(R$styleable.ColorPreference_cpv_previewSize, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.ColorPreference_cpv_colorPresets, 0);
        this.f4200k = typedArrayObtainStyledAttributes.getResourceId(R$styleable.ColorPreference_cpv_dialogTitle, R$string.cpv_default_title);
        if (resourceId != 0) {
            this.f4199j = getContext().getResources().getIntArray(resourceId);
        } else {
            this.f4199j = ColorPickerDialog.f4105u;
        }
        if (this.f4193d == 1) {
            setWidgetLayoutResource(this.f4198i == 1 ? R$layout.cpv_preference_circle_large : R$layout.cpv_preference_circle);
        } else {
            setWidgetLayoutResource(this.f4198i == 1 ? R$layout.cpv_preference_square_large : R$layout.cpv_preference_square);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: f */
    public void m3976f(int i10) {
        this.f4190a = i10;
        persistInt(i10);
        notifyChanged();
        callChangeListener(Integer.valueOf(i10));
    }

    @Override // androidx.preference.Preference
    public void onAttached() {
        ColorPickerDialog colorPickerDialog;
        super.onAttached();
        if (!this.f4191b || (colorPickerDialog = (ColorPickerDialog) m3973c().getSupportFragmentManager().findFragmentByTag(m3974d())) == null) {
            return;
        }
        colorPickerDialog.m3938s(this);
    }

    @Override // androidx.preference.Preference
    public void onBindViewHolder(PreferenceViewHolder preferenceViewHolder) {
        super.onBindViewHolder(preferenceViewHolder);
        ColorPanelView colorPanelView = (ColorPanelView) preferenceViewHolder.itemView.findViewById(R$id.cpv_preference_preview_color_panel);
        if (colorPanelView != null) {
            colorPanelView.setColor(this.f4190a);
        }
    }

    @Override // androidx.preference.Preference
    public void onClick() {
        super.onClick();
        if (this.f4191b) {
            ColorPickerDialog colorPickerDialogM3944a = ColorPickerDialog.m3927n().m3950g(this.f4192c).m3949f(this.f4200k).m3948e(this.f4193d).m3951h(this.f4199j).m3946c(this.f4194e).m3945b(this.f4195f).m3952i(this.f4196g).m3953j(this.f4197h).m3947d(this.f4190a).m3944a();
            colorPickerDialogM3944a.m3938s(this);
            m3973c().getSupportFragmentManager().beginTransaction().add(colorPickerDialogM3944a, m3974d()).commitAllowingStateLoss();
        }
    }

    @Override // androidx.preference.Preference
    public Object onGetDefaultValue(TypedArray typedArray, int i10) {
        return Integer.valueOf(typedArray.getInteger(i10, -16777216));
    }

    @Override // androidx.preference.Preference
    public void onSetInitialValue(Object obj) {
        super.onSetInitialValue(obj);
        if (!(obj instanceof Integer)) {
            this.f4190a = getPersistedInt(-16777216);
            return;
        }
        int iIntValue = ((Integer) obj).intValue();
        this.f4190a = iIntValue;
        persistInt(iIntValue);
    }
}
