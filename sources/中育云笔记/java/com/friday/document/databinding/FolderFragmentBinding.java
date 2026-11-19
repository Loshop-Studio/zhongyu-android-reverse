package com.friday.document.databinding;

import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LiveData;

/* loaded from: classes3.dex */
public abstract class FolderFragmentBinding extends ViewDataBinding {

    /* renamed from: c */
    public final FrameLayout f6366c;

    /* renamed from: d */
    public final LayoutFileFolderBinding f6367d;

    /* renamed from: e */
    public LiveData f6368e;

    /* renamed from: f */
    public LiveData f6369f;

    public FolderFragmentBinding(Object obj, View view, int i10, FrameLayout frameLayout, LayoutFileFolderBinding layoutFileFolderBinding) {
        super(obj, view, i10);
        this.f6366c = frameLayout;
        this.f6367d = layoutFileFolderBinding;
    }

    /* renamed from: a */
    public abstract void mo5519a(LiveData liveData);

    /* renamed from: c */
    public abstract void mo5520c(LiveData liveData);
}
