package com.zykj.camera.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.zykj.camera.R$id;
import com.zykj.camera.R$layout;

/* loaded from: classes4.dex */
public class AnswerSheetCompositionView extends AnswerSheetView {
    public AnswerSheetCompositionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public int getIndex() {
        RadioGroup radioGroup = (RadioGroup) this.f12454g.findViewById(R$id.radioGroup);
        for (int i10 = 0; i10 < radioGroup.getChildCount(); i10++) {
            if (((RadioButton) radioGroup.getChildAt(i10)).isChecked()) {
                return i10;
            }
        }
        return 0;
    }

    @Override // com.zykj.camera.view.AnswerSheetView, p099g5.AbstractC7531f
    public View getTipsView() {
        return LayoutInflater.from(getContext()).inflate(R$layout.scan_box_tips_index, (ViewGroup) null);
    }

    public void setIndex(int i10) {
        RadioGroup radioGroup = (RadioGroup) this.f12454g.findViewById(R$id.radioGroup);
        if (i10 >= radioGroup.getChildCount() - 1) {
            ((RadioButton) radioGroup.getChildAt(radioGroup.getChildCount() - 1)).setChecked(true);
        } else if (i10 <= 0) {
            ((RadioButton) radioGroup.getChildAt(0)).setChecked(true);
        } else {
            ((RadioButton) radioGroup.getChildAt(i10)).setChecked(true);
        }
    }
}
