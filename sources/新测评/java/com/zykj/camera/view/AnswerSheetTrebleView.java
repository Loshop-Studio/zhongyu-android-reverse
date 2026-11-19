package com.zykj.camera.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zykj.camera.R$layout;

/* loaded from: classes4.dex */
public class AnswerSheetTrebleView extends AnswerSheetView {
    public AnswerSheetTrebleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.zykj.camera.view.AnswerSheetView, p099g5.AbstractC7531f
    public View getTipsView() {
        return LayoutInflater.from(getContext()).inflate(R$layout.scan_box_tips_treble, (ViewGroup) null);
    }
}
