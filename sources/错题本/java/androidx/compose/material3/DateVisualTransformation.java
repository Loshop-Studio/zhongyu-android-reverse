package androidx.compose.material3;

import android.support.v4.media.AbstractC0037f;
import androidx.compose.material3.internal.DateInputFormat;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.input.OffsetMapping;
import androidx.compose.p011ui.text.input.TransformedText;
import androidx.compose.p011ui.text.input.VisualTransformation;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.AbstractC5855p;
import org.jetbrains.annotations.NotNull;
import p200x6.C6756f;

@Metadata(m5109d1 = {"\u0000+\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\b\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\tR\u000e\u0010\n\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m5110d2 = {"Landroidx/compose/material3/DateVisualTransformation;", "Landroidx/compose/ui/text/input/VisualTransformation;", "dateInputFormat", "Landroidx/compose/material3/internal/DateInputFormat;", "(Landroidx/compose/material3/internal/DateInputFormat;)V", "dateFormatLength", "", "dateOffsetTranslator", "androidx/compose/material3/DateVisualTransformation$dateOffsetTranslator$1", "Landroidx/compose/material3/DateVisualTransformation$dateOffsetTranslator$1;", "firstDelimiterOffset", "secondDelimiterOffset", "filter", "Landroidx/compose/ui/text/input/TransformedText;", "text", "Landroidx/compose/ui/text/AnnotatedString;", "material3_release"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nDateInput.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateInput.kt\nandroidx/compose/material3/DateVisualTransformation\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,386:1\n1183#2,3:387\n*S KotlinDebug\n*F\n+ 1 DateInput.kt\nandroidx/compose/material3/DateVisualTransformation\n*L\n371#1:387,3\n*E\n"})
/* loaded from: classes.dex */
final class DateVisualTransformation implements VisualTransformation {
    private final int dateFormatLength;

    @NotNull
    private final DateInputFormat dateInputFormat;

    @NotNull
    private final DateVisualTransformation$dateOffsetTranslator$1 dateOffsetTranslator = new OffsetMapping() { // from class: androidx.compose.material3.DateVisualTransformation$dateOffsetTranslator$1
        @Override // androidx.compose.p011ui.text.input.OffsetMapping
        public int originalToTransformed(int offset) {
            return offset < this.this$0.firstDelimiterOffset ? offset : offset < this.this$0.secondDelimiterOffset ? offset + 1 : offset <= this.this$0.dateFormatLength ? offset + 2 : this.this$0.dateFormatLength + 2;
        }

        @Override // androidx.compose.p011ui.text.input.OffsetMapping
        public int transformedToOriginal(int offset) {
            return offset <= this.this$0.firstDelimiterOffset + (-1) ? offset : offset <= this.this$0.secondDelimiterOffset + (-1) ? offset - 1 : offset <= this.this$0.dateFormatLength + 1 ? offset - 2 : this.this$0.dateFormatLength;
        }
    };
    private final int firstDelimiterOffset;
    private final int secondDelimiterOffset;

    /* JADX WARN: Type inference failed for: r5v3, types: [androidx.compose.material3.DateVisualTransformation$dateOffsetTranslator$1] */
    public DateVisualTransformation(@NotNull DateInputFormat dateInputFormat) {
        this.dateInputFormat = dateInputFormat;
        this.firstDelimiterOffset = AbstractC5855p.m5379M(dateInputFormat.getPatternWithDelimiters(), dateInputFormat.getDelimiter(), 0, 6);
        this.secondDelimiterOffset = AbstractC5855p.m5385S(dateInputFormat.getPatternWithDelimiters(), dateInputFormat.getDelimiter(), 0, 6);
        this.dateFormatLength = dateInputFormat.getPatternWithoutDelimiters().length();
    }

    @Override // androidx.compose.p011ui.text.input.VisualTransformation
    @NotNull
    public TransformedText filter(@NotNull AnnotatedString text) {
        String text2;
        int i = 0;
        if (text.getText().length() > this.dateFormatLength) {
            String text3 = text.getText();
            C6756f range = AbstractC5806u.m5260N(0, this.dateFormatLength);
            AbstractC5830k.m5330g(text3, "<this>");
            AbstractC5830k.m5330g(range, "range");
            text2 = text3.substring(range.f11420a, range.f11421b + 1);
            AbstractC5830k.m5329f(text2, "substring(...)");
        } else {
            text2 = text.getText();
        }
        String string = "";
        int i8 = 0;
        while (i < text2.length()) {
            int i9 = i8 + 1;
            String str = string + text2.charAt(i);
            if (i9 == this.firstDelimiterOffset || i8 + 2 == this.secondDelimiterOffset) {
                StringBuilder sbM97v = AbstractC0037f.m97v(str);
                sbM97v.append(this.dateInputFormat.getDelimiter());
                string = sbM97v.toString();
            } else {
                string = str;
            }
            i++;
            i8 = i9;
        }
        return new TransformedText(new AnnotatedString(string, null, null, 6, null), this.dateOffsetTranslator);
    }
}
