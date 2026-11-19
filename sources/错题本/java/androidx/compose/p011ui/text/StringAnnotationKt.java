package androidx.compose.p011ui.text;

import androidx.compose.p011ui.text.AnnotatedString;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0001H\u0000¨\u0006\u0004"}, m5110d2 = {"unbox", "Landroidx/compose/ui/text/AnnotatedString$Range;", "", "Landroidx/compose/ui/text/AnnotatedString$Annotation;", "ui-text_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class StringAnnotationKt {
    @NotNull
    public static final AnnotatedString.Range<String> unbox(@NotNull AnnotatedString.Range<? extends AnnotatedString.Annotation> range) {
        AnnotatedString.Annotation item = range.getItem();
        AbstractC5830k.m5328e(item, "null cannot be cast to non-null type androidx.compose.ui.text.StringAnnotation");
        return new AnnotatedString.Range<>(((StringAnnotation) item).m12724unboximpl(), range.getStart(), range.getEnd(), range.getTag());
    }
}
