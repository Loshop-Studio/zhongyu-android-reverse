package com.zykj.evaluation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.zykj.camera.view.AnswerSheetCompositionView;
import com.zykj.evaluation.R;

/* loaded from: classes4.dex */
public final class ViewAnswerSheetCompositionBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f8766a;

    /* renamed from: b */
    public final AnswerSheetCompositionView f8767b;

    public ViewAnswerSheetCompositionBinding(FrameLayout frameLayout, AnswerSheetCompositionView answerSheetCompositionView) {
        this.f8766a = frameLayout;
        this.f8767b = answerSheetCompositionView;
    }

    /* renamed from: a */
    public static ViewAnswerSheetCompositionBinding m8669a(View view) {
        AnswerSheetCompositionView answerSheetCompositionView = (AnswerSheetCompositionView) ViewBindings.findChildViewById(view, R.id.answer_sheet_view);
        if (answerSheetCompositionView != null) {
            return new ViewAnswerSheetCompositionBinding((FrameLayout) view, answerSheetCompositionView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.answer_sheet_view)));
    }

    /* renamed from: c */
    public static ViewAnswerSheetCompositionBinding m8670c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9) {
        View viewInflate = layoutInflater.inflate(R.layout.view_answer_sheet_composition, viewGroup, false);
        if (z9) {
            viewGroup.addView(viewInflate);
        }
        return m8669a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f8766a;
    }
}
