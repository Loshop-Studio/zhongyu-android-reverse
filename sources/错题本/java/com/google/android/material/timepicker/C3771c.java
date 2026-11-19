package com.google.android.material.timepicker;

import com.google.android.material.button.MaterialButtonToggleGroup;

/* renamed from: com.google.android.material.timepicker.c */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3771c implements MaterialButtonToggleGroup.OnButtonCheckedListener {

    /* renamed from: a */
    public final /* synthetic */ int f2941a;

    /* renamed from: b */
    public final /* synthetic */ Object f2942b;

    public /* synthetic */ C3771c(Object obj, int i) {
        this.f2941a = i;
        this.f2942b = obj;
    }

    @Override // com.google.android.material.button.MaterialButtonToggleGroup.OnButtonCheckedListener
    public final void onButtonChecked(MaterialButtonToggleGroup materialButtonToggleGroup, int i, boolean z8) {
        switch (this.f2941a) {
            case 0:
                ((TimePickerTextInputPresenter) this.f2942b).lambda$setupPeriodToggle$0(materialButtonToggleGroup, i, z8);
                break;
            default:
                ((TimePickerView) this.f2942b).lambda$new$0(materialButtonToggleGroup, i, z8);
                break;
        }
    }
}
