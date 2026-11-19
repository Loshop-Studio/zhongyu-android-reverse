package com.zykj.evaluation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.zykj.camera.view.AnswerSheetView;
import com.zykj.evaluation.R;

/* loaded from: classes4.dex */
public final class ViewAnswerSheetCommonBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f8764a;

    /* renamed from: b */
    public final AnswerSheetView f8765b;

    public ViewAnswerSheetCommonBinding(FrameLayout frameLayout, AnswerSheetView answerSheetView) {
        this.f8764a = frameLayout;
        this.f8765b = answerSheetView;
    }

    /* renamed from: a */
    public static ViewAnswerSheetCommonBinding m8666a(View view) {
        AnswerSheetView answerSheetView = (AnswerSheetView) ViewBindings.findChildViewById(view, R.id.answer_sheet_view);
        if (answerSheetView != null) {
            return new ViewAnswerSheetCommonBinding((FrameLayout) view, answerSheetView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.answer_sheet_view)));
    }

    /* renamed from: c */
    public static ViewAnswerSheetCommonBinding m8667c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9) {
        View viewInflate = layoutInflater.inflate(R.layout.view_answer_sheet_common, viewGroup, false);
        if (z9) {
            viewGroup.addView(viewInflate);
        }
        return m8666a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f8764a;
    }
}
