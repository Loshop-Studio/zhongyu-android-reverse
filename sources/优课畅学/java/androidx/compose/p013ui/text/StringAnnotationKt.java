package androidx.compose.p013ui.text;

import androidx.compose.p013ui.text.AnnotatedString;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes2.dex */
public final class StringAnnotationKt {
    public static final AnnotatedString.Range<String> unbox(AnnotatedString.Range<? extends AnnotatedString.Annotation> range) {
        AnnotatedString.Annotation item = range.getItem();
        AbstractC9133u.m16131e(item, "null cannot be cast to non-null type androidx.compose.ui.text.StringAnnotation");
        return new AnnotatedString.Range<>(((StringAnnotation) item).m26318unboximpl(), range.getStart(), range.getEnd(), range.getTag());
    }
}
