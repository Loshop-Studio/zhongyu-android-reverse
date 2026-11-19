package com.friday.document.databinding;

import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LiveData;

/* loaded from: classes3.dex */
public abstract class DocumentFragmentBinding extends ViewDataBinding {

    /* renamed from: c */
    public final FrameLayout f6358c;

    /* renamed from: d */
    public final LayoutFileBrowserBinding f6359d;

    /* renamed from: e */
    public LiveData f6360e;

    /* renamed from: f */
    public LiveData f6361f;

    public DocumentFragmentBinding(Object obj, View view, int i10, FrameLayout frameLayout, LayoutFileBrowserBinding layoutFileBrowserBinding) {
        super(obj, view, i10);
        this.f6358c = frameLayout;
        this.f6359d = layoutFileBrowserBinding;
    }

    /* renamed from: a */
    public abstract void mo5514a(LiveData liveData);

    /* renamed from: c */
    public abstract void mo5515c(LiveData liveData);
}
