package androidx.compose.p014ui.text;

import androidx.compose.p014ui.text.AnnotatedString;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes2.dex */
public final class StringAnnotationKt {
    public static final AnnotatedString.Range<String> unbox(AnnotatedString.Range<? extends AnnotatedString.Annotation> range) {
        AnnotatedString.Annotation item = range.getItem();
        AbstractC9979u.m20292e(item, "null cannot be cast to non-null type androidx.compose.ui.text.StringAnnotation");
        return new AnnotatedString.Range<>(((StringAnnotation) item).m32920unboximpl(), range.getStart(), range.getEnd(), range.getTag());
    }
}
