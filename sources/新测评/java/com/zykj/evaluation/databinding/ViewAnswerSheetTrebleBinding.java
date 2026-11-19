package com.zykj.evaluation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.zykj.camera.view.AnswerSheetTrebleView;
import com.zykj.evaluation.R;

/* loaded from: classes4.dex */
public final class ViewAnswerSheetTrebleBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f8768a;

    /* renamed from: b */
    public final AnswerSheetTrebleView f8769b;

    public ViewAnswerSheetTrebleBinding(FrameLayout frameLayout, AnswerSheetTrebleView answerSheetTrebleView) {
        this.f8768a = frameLayout;
        this.f8769b = answerSheetTrebleView;
    }

    /* renamed from: a */
    public static ViewAnswerSheetTrebleBinding m8672a(View view) {
        AnswerSheetTrebleView answerSheetTrebleView = (AnswerSheetTrebleView) ViewBindings.findChildViewById(view, R.id.answer_sheet_view);
        if (answerSheetTrebleView != null) {
            return new ViewAnswerSheetTrebleBinding((FrameLayout) view, answerSheetTrebleView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.answer_sheet_view)));
    }

    /* renamed from: c */
    public static ViewAnswerSheetTrebleBinding m8673c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9) {
        View viewInflate = layoutInflater.inflate(R.layout.view_answer_sheet_treble, viewGroup, false);
        if (z9) {
            viewGroup.addView(viewInflate);
        }
        return m8672a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f8768a;
    }
}
