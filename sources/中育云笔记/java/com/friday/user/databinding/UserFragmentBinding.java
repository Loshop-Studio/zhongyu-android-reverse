package com.friday.user.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.friday.common.widget.FridayNoTouchViewPager;
import com.friday.user.viewmodel.UserViewModel;

/* loaded from: classes5.dex */
public abstract class UserFragmentBinding extends ViewDataBinding {

    /* renamed from: c */
    public final LinearLayoutCompat f10614c;

    /* renamed from: d */
    public final RecyclerView f10615d;

    /* renamed from: e */
    public final TextView f10616e;

    /* renamed from: f */
    public final TextView f10617f;

    /* renamed from: g */
    public final View f10618g;

    /* renamed from: h */
    public final FridayNoTouchViewPager f10619h;

    /* renamed from: i */
    public UserViewModel f10620i;

    public UserFragmentBinding(Object obj, View view, int i10, LinearLayoutCompat linearLayoutCompat, RecyclerView recyclerView, TextView textView, TextView textView2, View view2, FridayNoTouchViewPager fridayNoTouchViewPager) {
        super(obj, view, i10);
        this.f10614c = linearLayoutCompat;
        this.f10615d = recyclerView;
        this.f10616e = textView;
        this.f10617f = textView2;
        this.f10618g = view2;
        this.f10619h = fridayNoTouchViewPager;
    }
}
