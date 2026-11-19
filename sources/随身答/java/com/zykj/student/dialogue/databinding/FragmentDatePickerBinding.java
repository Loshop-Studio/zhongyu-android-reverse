package com.zykj.student.dialogue.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;
import com.zykj.student.dialogue.R;

/* loaded from: classes5.dex */
public final class FragmentDatePickerBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f10513a;

    /* renamed from: b */
    public final View f10514b;

    /* renamed from: c */
    public final MaterialCalendarView f10515c;

    /* renamed from: d */
    public final MaterialCalendarView f10516d;

    /* renamed from: e */
    public final AppCompatTextView f10517e;

    /* renamed from: f */
    public final TextView f10518f;

    /* renamed from: g */
    public final AppCompatTextView f10519g;

    /* renamed from: h */
    public final TextView f10520h;

    /* renamed from: i */
    public final View f10521i;

    public FragmentDatePickerBinding(FrameLayout frameLayout, View view, MaterialCalendarView materialCalendarView, MaterialCalendarView materialCalendarView2, AppCompatTextView appCompatTextView, TextView textView, AppCompatTextView appCompatTextView2, TextView textView2, View view2) {
        this.f10513a = frameLayout;
        this.f10514b = view;
        this.f10515c = materialCalendarView;
        this.f10516d = materialCalendarView2;
        this.f10517e = appCompatTextView;
        this.f10518f = textView;
        this.f10519g = appCompatTextView2;
        this.f10520h = textView2;
        this.f10521i = view2;
    }

    /* renamed from: a */
    public static FragmentDatePickerBinding m9959a(View view) {
        View viewFindChildViewById;
        int i9 = R.id.divider;
        View viewFindChildViewById2 = ViewBindings.findChildViewById(view, i9);
        if (viewFindChildViewById2 != null) {
            i9 = R.id.end_date;
            MaterialCalendarView materialCalendarView = (MaterialCalendarView) ViewBindings.findChildViewById(view, i9);
            if (materialCalendarView != null) {
                i9 = R.id.start_date;
                MaterialCalendarView materialCalendarView2 = (MaterialCalendarView) ViewBindings.findChildViewById(view, i9);
                if (materialCalendarView2 != null) {
                    i9 = R.id.tv_confirm;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i9);
                    if (appCompatTextView != null) {
                        i9 = R.id.tv_end_time;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, i9);
                        if (textView != null) {
                            i9 = R.id.tv_reset;
                            AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i9);
                            if (appCompatTextView2 != null) {
                                i9 = R.id.tv_start_time;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i9);
                                if (textView2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i9 = R.id.view_bg))) != null) {
                                    return new FragmentDatePickerBinding((FrameLayout) view, viewFindChildViewById2, materialCalendarView, materialCalendarView2, appCompatTextView, textView, appCompatTextView2, textView2, viewFindChildViewById);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i9)));
    }

    /* renamed from: c */
    public static FragmentDatePickerBinding m9960c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_date_picker, viewGroup, false);
        if (z9) {
            viewGroup.addView(viewInflate);
        }
        return m9959a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f10513a;
    }
}
