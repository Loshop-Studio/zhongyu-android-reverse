package androidx.compose.foundation.text;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.p013ui.text.AnnotatedString;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001c\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m13558d2 = {"INLINE_CONTENT_TAG", "", "REPLACEMENT_CHAR", "appendInlineContent", "", "Landroidx/compose/ui/text/AnnotatedString$Builder;", "id", "alternateText", "foundation_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nInlineTextContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InlineTextContent.kt\nandroidx/compose/foundation/text/InlineTextContentKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n*L\n1#1,86:1\n96#2,5:87\n*S KotlinDebug\n*F\n+ 1 InlineTextContent.kt\nandroidx/compose/foundation/text/InlineTextContentKt\n*L\n52#1:87,5\n*E\n"})
/* loaded from: classes.dex */
public final class InlineTextContentKt {
    public static final String INLINE_CONTENT_TAG = "androidx.compose.foundation.text.inlineContent";
    private static final String REPLACEMENT_CHAR = "�";

    public static final void appendInlineContent(AnnotatedString.Builder builder, String str, String str2) {
        if (!(str2.length() > 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("alternateText can't be an empty string.");
        }
        builder.pushStringAnnotation(INLINE_CONTENT_TAG, str);
        builder.append(str2);
        builder.pop();
    }

    public static /* synthetic */ void appendInlineContent$default(AnnotatedString.Builder builder, String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = REPLACEMENT_CHAR;
        }
        appendInlineContent(builder, str, str2);
    }
}
