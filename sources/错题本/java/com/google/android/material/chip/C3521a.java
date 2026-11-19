package com.google.android.material.chip;

import android.widget.CompoundButton;
import com.zykj.view.p037ui.camera.ImagePickFragment;

/* renamed from: com.google.android.material.chip.a */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3521a implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ int f2844a;

    /* renamed from: b */
    public final /* synthetic */ Object f2845b;

    public /* synthetic */ C3521a(Object obj, int i) {
        this.f2844a = i;
        this.f2845b = obj;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z8) {
        switch (this.f2844a) {
            case 0:
                ((Chip) this.f2845b).lambda$new$0(compoundButton, z8);
                break;
            default:
                ImagePickFragment.initView$lambda$3((ImagePickFragment) this.f2845b, compoundButton, z8);
                break;
        }
    }
}
