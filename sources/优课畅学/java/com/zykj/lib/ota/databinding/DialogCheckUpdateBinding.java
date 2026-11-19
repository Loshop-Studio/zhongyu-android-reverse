package com.zykj.lib.ota.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import com.xuexiang.xui.widget.progress.HorizontalProgressView;
import com.zykj.lib.ota.viewmodel.VersionViewModel;

/* loaded from: classes4.dex */
public abstract class DialogCheckUpdateBinding extends ViewDataBinding {

    /* renamed from: a */
    public final ImageView f10229a;

    /* renamed from: b */
    public final LinearLayout f10230b;

    /* renamed from: c */
    public final NestedScrollView f10231c;

    /* renamed from: d */
    public final HorizontalProgressView f10232d;

    /* renamed from: e */
    public final TextView f10233e;

    /* renamed from: f */
    public final TextView f10234f;

    /* renamed from: g */
    public final TextView f10235g;

    /* renamed from: h */
    public final TextView f10236h;

    /* renamed from: i */
    public final TextView f10237i;

    /* renamed from: j */
    public final TextView f10238j;

    /* renamed from: k */
    public final TextView f10239k;

    /* renamed from: l */
    public final TextView f10240l;

    /* renamed from: m */
    public final TextView f10241m;

    /* renamed from: n */
    public VersionViewModel f10242n;

    public DialogCheckUpdateBinding(Object obj, View view, int i10, ImageView imageView, LinearLayout linearLayout, NestedScrollView nestedScrollView, HorizontalProgressView horizontalProgressView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9) {
        super(obj, view, i10);
        this.f10229a = imageView;
        this.f10230b = linearLayout;
        this.f10231c = nestedScrollView;
        this.f10232d = horizontalProgressView;
        this.f10233e = textView;
        this.f10234f = textView2;
        this.f10235g = textView3;
        this.f10236h = textView4;
        this.f10237i = textView5;
        this.f10238j = textView6;
        this.f10239k = textView7;
        this.f10240l = textView8;
        this.f10241m = textView9;
    }

    /* renamed from: a */
    public abstract void mo9463a(VersionViewModel versionViewModel);
}
