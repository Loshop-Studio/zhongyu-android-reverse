package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import p011b0.C1025h;

/* renamed from: androidx.appcompat.widget.l */
/* loaded from: classes.dex */
final class C0223l {

    /* renamed from: a */
    private TextView f1150a;

    /* renamed from: b */
    private TextClassifier f1151b;

    C0223l(TextView textView) {
        this.f1150a = (TextView) C1025h.m4782f(textView);
    }

    /* renamed from: a */
    public TextClassifier m912a() {
        TextClassifier textClassifier = this.f1151b;
        if (textClassifier != null) {
            return textClassifier;
        }
        TextClassificationManager textClassificationManager = (TextClassificationManager) this.f1150a.getContext().getSystemService(TextClassificationManager.class);
        return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
    }

    /* renamed from: b */
    public void m913b(TextClassifier textClassifier) {
        this.f1151b = textClassifier;
    }
}
