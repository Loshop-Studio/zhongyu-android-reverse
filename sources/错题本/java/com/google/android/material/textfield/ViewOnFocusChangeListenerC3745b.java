package com.google.android.material.textfield;

import android.view.View;

/* renamed from: com.google.android.material.textfield.b */
/* loaded from: classes2.dex */
public final /* synthetic */ class ViewOnFocusChangeListenerC3745b implements View.OnFocusChangeListener {

    /* renamed from: a */
    public final /* synthetic */ int f2929a;

    /* renamed from: b */
    public final /* synthetic */ EndIconDelegate f2930b;

    public /* synthetic */ ViewOnFocusChangeListenerC3745b(EndIconDelegate endIconDelegate, int i) {
        this.f2929a = i;
        this.f2930b = endIconDelegate;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z8) {
        switch (this.f2929a) {
            case 0:
                ((ClearTextEndIconDelegate) this.f2930b).lambda$new$1(view, z8);
                break;
            default:
                ((DropdownMenuEndIconDelegate) this.f2930b).lambda$new$1(view, z8);
                break;
        }
    }
}
