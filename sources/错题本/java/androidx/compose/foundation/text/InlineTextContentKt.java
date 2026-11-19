package androidx.compose.foundation.text;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a#\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006\"\u0014\u0010\u0007\u001a\u00020\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\b\"\u0014\u0010\t\u001a\u00020\u00018\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\b¨\u0006\n"}, m5110d2 = {"Landroidx/compose/ui/text/AnnotatedString$Builder;", "", "id", "alternateText", "Ld6/s;", "appendInlineContent", "(Landroidx/compose/ui/text/AnnotatedString$Builder;Ljava/lang/String;Ljava/lang/String;)V", "INLINE_CONTENT_TAG", "Ljava/lang/String;", "REPLACEMENT_CHAR", "foundation_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nInlineTextContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InlineTextContent.kt\nandroidx/compose/foundation/text/InlineTextContentKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n*L\n1#1,86:1\n96#2,5:87\n*S KotlinDebug\n*F\n+ 1 InlineTextContent.kt\nandroidx/compose/foundation/text/InlineTextContentKt\n*L\n52#1:87,5\n*E\n"})
/* loaded from: classes.dex */
public final class InlineTextContentKt {

    @NotNull
    public static final String INLINE_CONTENT_TAG = "androidx.compose.foundation.text.inlineContent";

    @NotNull
    private static final String REPLACEMENT_CHAR = "�";

    public static final void appendInlineContent(@NotNull AnnotatedString.Builder builder, @NotNull String str, @NotNull String str2) {
        if (!(str2.length() > 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("alternateText can't be an empty string.");
        }
        builder.pushStringAnnotation(INLINE_CONTENT_TAG, str);
        builder.append(str2);
        builder.pop();
    }

    public static /* synthetic */ void appendInlineContent$default(AnnotatedString.Builder builder, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = REPLACEMENT_CHAR;
        }
        appendInlineContent(builder, str, str2);
    }
}
