package androidx.compose.material3;

import androidx.compose.material3.internal.DateInputFormat;
import androidx.compose.p012ui.text.AnnotatedString;
import androidx.compose.p012ui.text.input.OffsetMapping;
import androidx.compose.p012ui.text.input.TransformedText;
import androidx.compose.p012ui.text.input.VisualTransformation;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

@Metadata(m13412d1 = {"\u0000+\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\b\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\tR\u000e\u0010\n\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m13413d2 = {"Landroidx/compose/material3/DateVisualTransformation;", "Landroidx/compose/ui/text/input/VisualTransformation;", "dateInputFormat", "Landroidx/compose/material3/internal/DateInputFormat;", "(Landroidx/compose/material3/internal/DateInputFormat;)V", "dateFormatLength", "", "dateOffsetTranslator", "androidx/compose/material3/DateVisualTransformation$dateOffsetTranslator$1", "Landroidx/compose/material3/DateVisualTransformation$dateOffsetTranslator$1;", "firstDelimiterOffset", "secondDelimiterOffset", "filter", "Landroidx/compose/ui/text/input/TransformedText;", "text", "Landroidx/compose/ui/text/AnnotatedString;", "material3_release"}, m13414k = 1, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nDateInput.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateInput.kt\nandroidx/compose/material3/DateVisualTransformation\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,386:1\n1183#2,3:387\n*S KotlinDebug\n*F\n+ 1 DateInput.kt\nandroidx/compose/material3/DateVisualTransformation\n*L\n371#1:387,3\n*E\n"})
/* loaded from: classes2.dex */
final class DateVisualTransformation implements VisualTransformation {
    private final int dateFormatLength;
    private final DateInputFormat dateInputFormat;
    private final DateVisualTransformation$dateOffsetTranslator$1 dateOffsetTranslator = new OffsetMapping() { // from class: androidx.compose.material3.DateVisualTransformation$dateOffsetTranslator$1
        @Override // androidx.compose.p012ui.text.input.OffsetMapping
        public int originalToTransformed(int offset) {
            return offset < this.this$0.firstDelimiterOffset ? offset : offset < this.this$0.secondDelimiterOffset ? offset + 1 : offset <= this.this$0.dateFormatLength ? offset + 2 : this.this$0.dateFormatLength + 2;
        }

        @Override // androidx.compose.p012ui.text.input.OffsetMapping
        public int transformedToOriginal(int offset) {
            return offset <= this.this$0.firstDelimiterOffset + (-1) ? offset : offset <= this.this$0.secondDelimiterOffset + (-1) ? offset - 1 : offset <= this.this$0.dateFormatLength + 1 ? offset - 2 : this.this$0.dateFormatLength;
        }
    };
    private final int firstDelimiterOffset;
    private final int secondDelimiterOffset;

    /* JADX WARN: Type inference failed for: r8v3, types: [androidx.compose.material3.DateVisualTransformation$dateOffsetTranslator$1] */
    public DateVisualTransformation(DateInputFormat dateInputFormat) {
        this.dateInputFormat = dateInputFormat;
        this.firstDelimiterOffset = StringsKt.indexOf$default((CharSequence) dateInputFormat.getPatternWithDelimiters(), dateInputFormat.getDelimiter(), 0, false, 6, (Object) null);
        this.secondDelimiterOffset = StringsKt.lastIndexOf$default((CharSequence) dateInputFormat.getPatternWithDelimiters(), dateInputFormat.getDelimiter(), 0, false, 6, (Object) null);
        this.dateFormatLength = dateInputFormat.getPatternWithoutDelimiters().length();
    }

    @Override // androidx.compose.p012ui.text.input.VisualTransformation
    public TransformedText filter(AnnotatedString text) {
        int i9 = 0;
        String strSubstring = text.getText().length() > this.dateFormatLength ? StringsKt.substring(text.getText(), RangesKt.until(0, this.dateFormatLength)) : text.getText();
        String str = "";
        int i10 = 0;
        while (i9 < strSubstring.length()) {
            int i11 = i10 + 1;
            String str2 = str + strSubstring.charAt(i9);
            if (i11 == this.firstDelimiterOffset || i10 + 2 == this.secondDelimiterOffset) {
                str = str2 + this.dateInputFormat.getDelimiter();
            } else {
                str = str2;
            }
            i9++;
            i10 = i11;
        }
        return new TransformedText(new AnnotatedString(str, null, null, 6, null), this.dateOffsetTranslator);
    }
}
