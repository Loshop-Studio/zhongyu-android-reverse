package com.google.android.material.textfield;

import android.view.View;

/* renamed from: com.google.android.material.textfield.a */
/* loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC3744a implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ int f2927a;

    /* renamed from: b */
    public final /* synthetic */ EndIconDelegate f2928b;

    public /* synthetic */ ViewOnClickListenerC3744a(EndIconDelegate endIconDelegate, int i) {
        this.f2927a = i;
        this.f2928b = endIconDelegate;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f2927a) {
            case 0:
                ((ClearTextEndIconDelegate) this.f2928b).lambda$new$0(view);
                break;
            case 1:
                ((DropdownMenuEndIconDelegate) this.f2928b).lambda$new$0(view);
                break;
            default:
                ((PasswordToggleEndIconDelegate) this.f2928b).lambda$new$0(view);
                break;
        }
    }
}
