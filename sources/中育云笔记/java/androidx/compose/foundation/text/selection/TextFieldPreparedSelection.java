package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.p014ui.text.TextRange;
import androidx.compose.p014ui.text.input.CommitTextCommand;
import androidx.compose.p014ui.text.input.EditCommand;
import androidx.compose.p014ui.text.input.OffsetMapping;
import androidx.compose.p014ui.text.input.SetSelectionCommand;
import androidx.compose.p014ui.text.input.TextFieldValue;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p325rc.AbstractC10976v;
import p325rc.AbstractC10978w;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class TextFieldPreparedSelection extends BaseTextPreparedSelection<TextFieldPreparedSelection> {
    public static final int $stable = 8;
    private final TextFieldValue currentValue;
    private final TextLayoutResultProxy layoutResultProxy;

    public /* synthetic */ TextFieldPreparedSelection(TextFieldValue textFieldValue, OffsetMapping offsetMapping, TextLayoutResultProxy textLayoutResultProxy, TextPreparedSelectionState textPreparedSelectionState, int i10, AbstractC9972n abstractC9972n) {
        this(textFieldValue, (i10 & 2) != 0 ? OffsetMapping.Companion.getIdentity() : offsetMapping, textLayoutResultProxy, (i10 & 8) != 0 ? new TextPreparedSelectionState() : textPreparedSelectionState);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int jumpByPagesOffset(androidx.compose.foundation.text.TextLayoutResultProxy r9, int r10) {
        /*
            r8 = this;
            androidx.compose.ui.layout.LayoutCoordinates r0 = r9.getInnerTextFieldCoordinates()
            if (r0 == 0) goto L15
            androidx.compose.ui.layout.LayoutCoordinates r1 = r9.getDecorationBoxCoordinates()
            r2 = 0
            if (r1 == 0) goto L13
            r3 = 0
            r4 = 2
            androidx.compose.ui.geometry.Rect r2 = androidx.compose.p014ui.layout.LayoutCoordinates.localBoundingBoxOf$default(r1, r0, r3, r4, r2)
        L13:
            if (r2 != 0) goto L1b
        L15:
            androidx.compose.ui.geometry.Rect$Companion r0 = androidx.compose.p014ui.geometry.Rect.Companion
            androidx.compose.ui.geometry.Rect r2 = r0.getZero()
        L1b:
            androidx.compose.ui.text.input.OffsetMapping r0 = r8.getOffsetMapping()
            androidx.compose.ui.text.input.TextFieldValue r1 = r8.currentValue
            long r3 = r1.m33214getSelectiond9O1mEE()
            int r1 = androidx.compose.p014ui.text.TextRange.m32961getEndimpl(r3)
            int r0 = r0.originalToTransformed(r1)
            androidx.compose.ui.text.TextLayoutResult r1 = r9.getValue()
            androidx.compose.ui.geometry.Rect r0 = r1.getCursorRect(r0)
            float r1 = r0.getLeft()
            float r0 = r0.getTop()
            long r2 = r2.m30670getSizeNHjbRc()
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            int r2 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r2)
            float r10 = (float) r10
            float r2 = r2 * r10
            float r0 = r0 + r2
            androidx.compose.ui.text.input.OffsetMapping r10 = r8.getOffsetMapping()
            androidx.compose.ui.text.TextLayoutResult r9 = r9.getValue()
            int r1 = java.lang.Float.floatToRawIntBits(r1)
            long r1 = (long) r1
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            long r6 = (long) r0
            r0 = 32
            long r0 = r1 << r0
            long r2 = r6 & r4
            long r0 = r0 | r2
            long r0 = androidx.compose.p014ui.geometry.Offset.m30629constructorimpl(r0)
            int r9 = r9.m32936getOffsetForPositionk4lQ0M(r0)
            int r9 = r10.transformedToOriginal(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.TextFieldPreparedSelection.jumpByPagesOffset(androidx.compose.foundation.text.TextLayoutResultProxy, int):int");
    }

    public final List<EditCommand> deleteIfSelectedOr(InterfaceC9540l interfaceC9540l) {
        if (!TextRange.m32960getCollapsedimpl(m28210getSelectiond9O1mEE())) {
            return AbstractC10978w.m24139q(new CommitTextCommand("", 0), new SetSelectionCommand(TextRange.m32964getMinimpl(m28210getSelectiond9O1mEE()), TextRange.m32964getMinimpl(m28210getSelectiond9O1mEE())));
        }
        EditCommand editCommand = (EditCommand) interfaceC9540l.invoke(this);
        if (editCommand != null) {
            return AbstractC10976v.m24126e(editCommand);
        }
        return null;
    }

    public final TextFieldValue getCurrentValue() {
        return this.currentValue;
    }

    public final TextLayoutResultProxy getLayoutResultProxy() {
        return this.layoutResultProxy;
    }

    public final TextFieldValue getValue() {
        return TextFieldValue.m33209copy3r_uNRQ$default(this.currentValue, getAnnotatedString(), m28210getSelectiond9O1mEE(), (TextRange) null, 4, (Object) null);
    }

    public final TextFieldPreparedSelection moveCursorDownByPage() {
        TextLayoutResultProxy textLayoutResultProxy;
        if (getText$foundation_release().length() > 0 && (textLayoutResultProxy = this.layoutResultProxy) != null) {
            setCursor(jumpByPagesOffset(textLayoutResultProxy, 1));
        }
        AbstractC9979u.m20292e(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final TextFieldPreparedSelection moveCursorUpByPage() {
        TextLayoutResultProxy textLayoutResultProxy;
        if (getText$foundation_release().length() > 0 && (textLayoutResultProxy = this.layoutResultProxy) != null) {
            setCursor(jumpByPagesOffset(textLayoutResultProxy, -1));
        }
        AbstractC9979u.m20292e(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public TextFieldPreparedSelection(TextFieldValue textFieldValue, OffsetMapping offsetMapping, TextLayoutResultProxy textLayoutResultProxy, TextPreparedSelectionState textPreparedSelectionState) {
        super(textFieldValue.getAnnotatedString(), textFieldValue.m33214getSelectiond9O1mEE(), textLayoutResultProxy != null ? textLayoutResultProxy.getValue() : null, offsetMapping, textPreparedSelectionState, null);
        this.currentValue = textFieldValue;
        this.layoutResultProxy = textLayoutResultProxy;
    }
}
