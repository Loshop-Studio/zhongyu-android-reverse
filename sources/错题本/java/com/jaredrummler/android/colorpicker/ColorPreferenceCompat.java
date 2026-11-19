package com.jaredrummler.android.colorpicker;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.preference.Preference;
import androidx.preference.PreferenceViewHolder;
import p112m1.InterfaceC6095k;

/* loaded from: classes3.dex */
public class ColorPreferenceCompat extends Preference implements InterfaceC6095k {

    /* renamed from: a */
    public int f3190a;

    /* renamed from: b */
    public boolean f3191b;

    /* renamed from: c */
    public int f3192c;

    /* renamed from: d */
    public int f3193d;

    /* renamed from: e */
    public boolean f3194e;

    /* renamed from: f */
    public boolean f3195f;

    /* renamed from: g */
    public boolean f3196g;

    /* renamed from: h */
    public boolean f3197h;

    /* renamed from: i */
    public int f3198i;

    /* renamed from: j */
    public int[] f3199j;

    /* renamed from: k */
    public int f3200k;

    public ColorPreferenceCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3190a = ViewCompat.MEASURED_STATE_MASK;
        m2847c(attributeSet);
    }

    @Override // p112m1.InterfaceC6095k
    /* renamed from: a */
    public final void mo2844a(int i) {
        this.f3190a = i;
        persistInt(i);
        notifyChanged();
        callChangeListener(Integer.valueOf(i));
    }

    /* renamed from: b */
    public final FragmentActivity m2846b() {
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

    /* renamed from: c */
    public final void m2847c(AttributeSet attributeSet) {
        setPersistent(true);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.ColorPreference);
        this.f3191b = typedArrayObtainStyledAttributes.getBoolean(R$styleable.ColorPreference_cpv_showDialog, true);
        this.f3192c = typedArrayObtainStyledAttributes.getInt(R$styleable.ColorPreference_cpv_dialogType, 1);
        this.f3193d = typedArrayObtainStyledAttributes.getInt(R$styleable.ColorPreference_cpv_colorShape, 1);
        this.f3194e = typedArrayObtainStyledAttributes.getBoolean(R$styleable.ColorPreference_cpv_allowPresets, true);
        this.f3195f = typedArrayObtainStyledAttributes.getBoolean(R$styleable.ColorPreference_cpv_allowCustom, true);
        this.f3196g = typedArrayObtainStyledAttributes.getBoolean(R$styleable.ColorPreference_cpv_showAlphaSlider, false);
        this.f3197h = typedArrayObtainStyledAttributes.getBoolean(R$styleable.ColorPreference_cpv_showColorShades, true);
        this.f3198i = typedArrayObtainStyledAttributes.getInt(R$styleable.ColorPreference_cpv_previewSize, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.ColorPreference_cpv_colorPresets, 0);
        this.f3200k = typedArrayObtainStyledAttributes.getResourceId(R$styleable.ColorPreference_cpv_dialogTitle, R$string.cpv_default_title);
        if (resourceId != 0) {
            this.f3199j = getContext().getResources().getIntArray(resourceId);
        } else {
            this.f3199j = ColorPickerDialog.f3127t;
        }
        if (this.f3193d == 1) {
            setWidgetLayoutResource(this.f3198i == 1 ? R$layout.cpv_preference_circle_large : R$layout.cpv_preference_circle);
        } else {
            setWidgetLayoutResource(this.f3198i == 1 ? R$layout.cpv_preference_square_large : R$layout.cpv_preference_square);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final void onAttached() {
        super.onAttached();
        if (this.f3191b) {
            ColorPickerDialog colorPickerDialog = (ColorPickerDialog) m2846b().getSupportFragmentManager().findFragmentByTag("color_" + getKey());
            if (colorPickerDialog != null) {
                colorPickerDialog.f3128a = this;
            }
        }
    }

    @Override // androidx.preference.Preference
    public final void onBindViewHolder(PreferenceViewHolder preferenceViewHolder) {
        super.onBindViewHolder(preferenceViewHolder);
        ColorPanelView colorPanelView = (ColorPanelView) preferenceViewHolder.itemView.findViewById(R$id.cpv_preference_preview_color_panel);
        if (colorPanelView != null) {
            colorPanelView.setColor(this.f3190a);
        }
    }

    @Override // androidx.preference.Preference
    public final void onClick() {
        super.onClick();
        if (this.f3191b) {
            C4031a c4031aM2835i = ColorPickerDialog.m2835i();
            c4031aM2835i.f3206e = this.f3192c;
            c4031aM2835i.f3202a = this.f3200k;
            c4031aM2835i.f3213l = this.f3193d;
            c4031aM2835i.f3207f = this.f3199j;
            c4031aM2835i.f3210i = this.f3194e;
            c4031aM2835i.f3211j = this.f3195f;
            c4031aM2835i.f3209h = this.f3196g;
            c4031aM2835i.f3212k = this.f3197h;
            c4031aM2835i.f3208g = this.f3190a;
            ColorPickerDialog colorPickerDialogM2848a = c4031aM2835i.m2848a();
            colorPickerDialogM2848a.f3128a = this;
            m2846b().getSupportFragmentManager().beginTransaction().add(colorPickerDialogM2848a, "color_" + getKey()).commitAllowingStateLoss();
        }
    }

    @Override // androidx.preference.Preference
    public final Object onGetDefaultValue(TypedArray typedArray, int i) {
        return Integer.valueOf(typedArray.getInteger(i, ViewCompat.MEASURED_STATE_MASK));
    }

    @Override // androidx.preference.Preference
    public final void onSetInitialValue(Object obj) {
        super.onSetInitialValue(obj);
        if (!(obj instanceof Integer)) {
            this.f3190a = getPersistedInt(ViewCompat.MEASURED_STATE_MASK);
            return;
        }
        int iIntValue = ((Integer) obj).intValue();
        this.f3190a = iIntValue;
        persistInt(iIntValue);
    }

    public ColorPreferenceCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3190a = ViewCompat.MEASURED_STATE_MASK;
        m2847c(attributeSet);
    }
}
