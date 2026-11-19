package com.friday.document.databinding;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.LiveData;

/* loaded from: classes3.dex */
public abstract class LayoutFileFolderBinding extends ViewDataBinding {

    /* renamed from: c */
    public final FragmentContainerView f6551c;

    /* renamed from: d */
    public final AppCompatImageView f6552d;

    /* renamed from: e */
    public final AppCompatImageView f6553e;

    /* renamed from: f */
    public final AppCompatImageView f6554f;

    /* renamed from: g */
    public final AppCompatImageView f6555g;

    /* renamed from: h */
    public final LinearLayoutCompat f6556h;

    /* renamed from: i */
    public final AppCompatTextView f6557i;

    /* renamed from: j */
    public final AppCompatTextView f6558j;

    /* renamed from: k */
    public final AppCompatTextView f6559k;

    /* renamed from: l */
    public final AppCompatTextView f6560l;

    /* renamed from: m */
    public LiveData f6561m;

    /* renamed from: n */
    public LiveData f6562n;

    public LayoutFileFolderBinding(Object obj, View view, int i10, FragmentContainerView fragmentContainerView, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, AppCompatImageView appCompatImageView4, LinearLayoutCompat linearLayoutCompat, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4) {
        super(obj, view, i10);
        this.f6551c = fragmentContainerView;
        this.f6552d = appCompatImageView;
        this.f6553e = appCompatImageView2;
        this.f6554f = appCompatImageView3;
        this.f6555g = appCompatImageView4;
        this.f6556h = linearLayoutCompat;
        this.f6557i = appCompatTextView;
        this.f6558j = appCompatTextView2;
        this.f6559k = appCompatTextView3;
        this.f6560l = appCompatTextView4;
    }

    /* renamed from: a */
    public abstract void mo5545a(LiveData liveData);

    /* renamed from: c */
    public abstract void mo5546c(LiveData liveData);
}
