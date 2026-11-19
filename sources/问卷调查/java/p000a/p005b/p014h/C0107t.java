package p000a.p005b.p014h;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

/* renamed from: a.b.h.t */
/* loaded from: classes.dex */
public final class C0107t {

    /* renamed from: a */
    public TextView f790a;

    /* renamed from: b */
    public TextClassifier f791b;

    public C0107t(TextView textView) {
        this.f790a = textView;
    }

    /* renamed from: a */
    public TextClassifier m397a() {
        TextClassifier textClassifier = this.f791b;
        if (textClassifier != null) {
            return textClassifier;
        }
        TextClassificationManager textClassificationManager = (TextClassificationManager) this.f790a.getContext().getSystemService(TextClassificationManager.class);
        return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
    }
}
