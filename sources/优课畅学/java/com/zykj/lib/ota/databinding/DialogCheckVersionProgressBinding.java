package com.zykj.lib.ota.databinding;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.zykj.lib.ota.view.ProgressBar;

/* loaded from: classes4.dex */
public abstract class DialogCheckVersionProgressBinding extends ViewDataBinding {

    /* renamed from: a */
    public final ProgressBar f10256a;

    /* renamed from: b */
    public boolean f10257b;

    public DialogCheckVersionProgressBinding(Object obj, View view, int i10, ProgressBar progressBar) {
        super(obj, view, i10);
        this.f10256a = progressBar;
    }

    /* renamed from: a */
    public abstract void mo9476a(boolean z10);
}
