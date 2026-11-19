package com.zykj.student.dialogue.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.xuexiang.xui.widget.imageview.photoview.PhotoView;
import com.zykj.student.dialogue.R;

/* loaded from: classes5.dex */
public abstract class DialogueFragmentAnswerPagerBinding extends ViewDataBinding {

    /* renamed from: a */
    public final View f10424a;

    /* renamed from: b */
    public final FrameLayout f10425b;

    /* renamed from: c */
    public final ImageView f10426c;

    /* renamed from: d */
    public final ImageView f10427d;

    /* renamed from: e */
    public final ImageView f10428e;

    /* renamed from: f */
    public final LinearLayout f10429f;

    /* renamed from: g */
    public final PhotoView f10430g;

    /* renamed from: h */
    public final View f10431h;

    public DialogueFragmentAnswerPagerBinding(Object obj, View view, int i9, View view2, FrameLayout frameLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, LinearLayout linearLayout, PhotoView photoView, View view3) {
        super(obj, view, i9);
        this.f10424a = view2;
        this.f10425b = frameLayout;
        this.f10426c = imageView;
        this.f10427d = imageView2;
        this.f10428e = imageView3;
        this.f10429f = linearLayout;
        this.f10430g = photoView;
        this.f10431h = view3;
    }

    /* renamed from: a */
    public static DialogueFragmentAnswerPagerBinding m9940a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9) {
        return m9941c(layoutInflater, viewGroup, z9, DataBindingUtil.getDefaultComponent());
    }

    /* renamed from: c */
    public static DialogueFragmentAnswerPagerBinding m9941c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9, Object obj) {
        return (DialogueFragmentAnswerPagerBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.dialogue_fragment_answer_pager, viewGroup, z9, obj);
    }
}
