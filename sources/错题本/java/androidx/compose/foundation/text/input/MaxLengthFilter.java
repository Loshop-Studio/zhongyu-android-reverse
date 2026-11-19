package androidx.compose.foundation.text.input;

import android.support.v4.media.AbstractC0037f;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.p011ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\u00020\t*\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0007J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001a¨\u0006\u001b"}, m5110d2 = {"Landroidx/compose/foundation/text/input/MaxLengthFilter;", "Landroidx/compose/foundation/text/input/InputTransformation;", "", "maxLength", "<init>", "(I)V", "component1", "()I", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "Ld6/s;", "applySemantics", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "Landroidx/compose/foundation/text/input/TextFieldBuffer;", "transformInput", "(Landroidx/compose/foundation/text/input/TextFieldBuffer;)V", "", "toString", "()Ljava/lang/String;", "copy", "(I)Landroidx/compose/foundation/text/input/MaxLengthFilter;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nInputTransformation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InputTransformation.kt\nandroidx/compose/foundation/text/input/MaxLengthFilter\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n*L\n1#1,243:1\n96#2,5:244\n*S KotlinDebug\n*F\n+ 1 InputTransformation.kt\nandroidx/compose/foundation/text/input/MaxLengthFilter\n*L\n226#1:244,5\n*E\n"})
/* loaded from: classes.dex */
final /* data */ class MaxLengthFilter implements InputTransformation {
    private final int maxLength;

    public MaxLengthFilter(int i) {
        this.maxLength = i;
        if (i >= 0) {
            return;
        }
        InlineClassHelperKt.throwIllegalArgumentException("maxLength must be at least zero");
    }

    /* renamed from: component1, reason: from getter */
    private final int getMaxLength() {
        return this.maxLength;
    }

    public static /* synthetic */ MaxLengthFilter copy$default(MaxLengthFilter maxLengthFilter, int i, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i = maxLengthFilter.maxLength;
        }
        return maxLengthFilter.copy(i);
    }

    @Override // androidx.compose.foundation.text.input.InputTransformation
    public void applySemantics(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setMaxTextLength(semanticsPropertyReceiver, this.maxLength);
    }

    @NotNull
    public final MaxLengthFilter copy(int maxLength) {
        return new MaxLengthFilter(maxLength);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MaxLengthFilter) && this.maxLength == ((MaxLengthFilter) other).maxLength;
    }

    public int hashCode() {
        return Integer.hashCode(this.maxLength);
    }

    @NotNull
    public String toString() {
        return AbstractC0037f.m88m(new StringBuilder("InputTransformation.maxLength("), this.maxLength, ')');
    }

    @Override // androidx.compose.foundation.text.input.InputTransformation
    public void transformInput(@NotNull TextFieldBuffer textFieldBuffer) {
        if (textFieldBuffer.getLength() > this.maxLength) {
            textFieldBuffer.revertAllChanges();
        }
    }
}
