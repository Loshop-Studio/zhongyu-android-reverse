package androidx.compose.material3;

import androidx.compose.material3.internal.DateInputFormat;
import androidx.compose.p014ui.text.AnnotatedString;
import androidx.compose.p014ui.text.input.OffsetMapping;
import androidx.compose.p014ui.text.input.TransformedText;
import androidx.compose.p014ui.text.input.VisualTransformation;
import p265nd.AbstractC10410o;
import p310qd.AbstractC10793c0;

/* loaded from: classes2.dex */
final class DateVisualTransformation implements VisualTransformation {
    private final int dateFormatLength;
    private final DateInputFormat dateInputFormat;
    private final DateVisualTransformation$dateOffsetTranslator$1 dateOffsetTranslator = new OffsetMapping() { // from class: androidx.compose.material3.DateVisualTransformation$dateOffsetTranslator$1
        @Override // androidx.compose.p014ui.text.input.OffsetMapping
        public int originalToTransformed(int i10) {
            return i10 < this.this$0.firstDelimiterOffset ? i10 : i10 < this.this$0.secondDelimiterOffset ? i10 + 1 : i10 <= this.this$0.dateFormatLength ? i10 + 2 : this.this$0.dateFormatLength + 2;
        }

        @Override // androidx.compose.p014ui.text.input.OffsetMapping
        public int transformedToOriginal(int i10) {
            return i10 <= this.this$0.firstDelimiterOffset + (-1) ? i10 : i10 <= this.this$0.secondDelimiterOffset + (-1) ? i10 - 1 : i10 <= this.this$0.dateFormatLength + 1 ? i10 - 2 : this.this$0.dateFormatLength;
        }
    };
    private final int firstDelimiterOffset;
    private final int secondDelimiterOffset;

    /* JADX WARN: Type inference failed for: r8v3, types: [androidx.compose.material3.DateVisualTransformation$dateOffsetTranslator$1] */
    public DateVisualTransformation(DateInputFormat dateInputFormat) {
        this.dateInputFormat = dateInputFormat;
        this.firstDelimiterOffset = AbstractC10793c0.m23128e0(dateInputFormat.getPatternWithDelimiters(), dateInputFormat.getDelimiter(), 0, false, 6, null);
        this.secondDelimiterOffset = AbstractC10793c0.m23135k0(dateInputFormat.getPatternWithDelimiters(), dateInputFormat.getDelimiter(), 0, false, 6, null);
        this.dateFormatLength = dateInputFormat.getPatternWithoutDelimiters().length();
    }

    @Override // androidx.compose.p014ui.text.input.VisualTransformation
    public TransformedText filter(AnnotatedString annotatedString) {
        int i10 = 0;
        String strM23097O0 = annotatedString.getText().length() > this.dateFormatLength ? AbstractC10793c0.m23097O0(annotatedString.getText(), AbstractC10410o.m21768u(0, this.dateFormatLength)) : annotatedString.getText();
        String str = "";
        int i11 = 0;
        while (i10 < strM23097O0.length()) {
            int i12 = i11 + 1;
            String str2 = str + strM23097O0.charAt(i10);
            if (i12 == this.firstDelimiterOffset || i11 + 2 == this.secondDelimiterOffset) {
                str = str2 + this.dateInputFormat.getDelimiter();
            } else {
                str = str2;
            }
            i10++;
            i11 = i12;
        }
        return new TransformedText(new AnnotatedString(str, null, null, 6, null), this.dateOffsetTranslator);
    }
}
