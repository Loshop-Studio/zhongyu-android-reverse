package androidx.compose.p013ui.text.platform.extensions;

import android.text.style.TtsSpan;
import androidx.compose.p013ui.text.TtsAnnotation;
import androidx.compose.p013ui.text.VerbatimTtsAnnotation;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class TtsAnnotationExtensions_androidKt {
    public static final TtsSpan toSpan(TtsAnnotation ttsAnnotation) {
        if (ttsAnnotation instanceof VerbatimTtsAnnotation) {
            return toSpan((VerbatimTtsAnnotation) ttsAnnotation);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final TtsSpan toSpan(VerbatimTtsAnnotation verbatimTtsAnnotation) {
        return new TtsSpan.VerbatimBuilder(verbatimTtsAnnotation.getVerbatim()).build();
    }
}
