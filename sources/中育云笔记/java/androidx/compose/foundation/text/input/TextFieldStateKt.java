package androidx.compose.foundation.text.input;

import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.p014ui.graphics.Shadow;
import androidx.compose.p014ui.graphics.drawscope.DrawStyle;
import androidx.compose.p014ui.text.AnnotatedString;
import androidx.compose.p014ui.text.PlatformSpanStyle;
import androidx.compose.p014ui.text.SpanStyle;
import androidx.compose.p014ui.text.TextRange;
import androidx.compose.p014ui.text.TextRangeKt;
import androidx.compose.p014ui.text.font.FontFamily;
import androidx.compose.p014ui.text.font.FontStyle;
import androidx.compose.p014ui.text.font.FontSynthesis;
import androidx.compose.p014ui.text.font.FontWeight;
import androidx.compose.p014ui.text.intl.LocaleList;
import androidx.compose.p014ui.text.style.BaselineShift;
import androidx.compose.p014ui.text.style.TextDecoration;
import androidx.compose.p014ui.text.style.TextGeometricTransform;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import java.util.List;
import kotlin.jvm.internal.AbstractC9972n;
import p181hd.InterfaceC9529a;
import p325rc.AbstractC10947g0;
import p325rc.AbstractC10976v;
import p325rc.AbstractC10978w;

/* loaded from: classes.dex */
public final class TextFieldStateKt {
    public static final void clearText(TextFieldState textFieldState) {
        TextFieldBuffer textFieldBufferStartEdit = textFieldState.startEdit();
        try {
            TextFieldBufferKt.delete(textFieldBufferStartEdit, 0, textFieldBufferStartEdit.getLength());
            TextFieldBufferKt.placeCursorAtEnd(textFieldBufferStartEdit);
            textFieldState.commitEdit(textFieldBufferStartEdit);
        } finally {
            textFieldState.finishEditing();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: finalizeComposingAnnotations-itr0ztk, reason: not valid java name */
    public static final List<AnnotatedString.Range<AnnotatedString.Annotation>> m27951finalizeComposingAnnotationsitr0ztk(TextRange textRange, MutableVector<AnnotatedString.Range<AnnotatedString.Annotation>> mutableVector) {
        return (mutableVector == null || mutableVector.getSize() == 0) ? (textRange == null || TextRange.m32960getCollapsedimpl(textRange.m32970unboximpl())) ? AbstractC10978w.m24136n() : AbstractC10976v.m24126e(new AnnotatedString.Range(new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.Companion.getUnderline(), (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 61439, (AbstractC9972n) null), TextRange.m32964getMinimpl(textRange.m32970unboximpl()), TextRange.m32963getMaximpl(textRange.m32970unboximpl()))) : AbstractC10947g0.m23922X0(mutableVector.asMutableList());
    }

    @Composable
    /* renamed from: rememberTextFieldState-Le-punE, reason: not valid java name */
    public static final TextFieldState m27952rememberTextFieldStateLepunE(final String str, final long j10, Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0) {
            str = "";
        }
        if ((i11 & 2) != 0) {
            j10 = TextRangeKt.TextRange(str.length());
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1125389485, i10, -1, "androidx.compose.foundation.text.input.rememberTextFieldState (TextFieldState.kt:644)");
        }
        Object[] objArr = new Object[0];
        TextFieldState.Saver saver = TextFieldState.Saver.INSTANCE;
        boolean z10 = ((((i10 & 14) ^ 6) > 4 && composer.changed(str)) || (i10 & 6) == 4) | ((((i10 & 112) ^ 48) > 32 && composer.changed(j10)) || (i10 & 48) == 32);
        Object objRememberedValue = composer.rememberedValue();
        if (z10 || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new InterfaceC9529a() { // from class: androidx.compose.foundation.text.input.TextFieldStateKt$rememberTextFieldState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p181hd.InterfaceC9529a
                public final TextFieldState invoke() {
                    return new TextFieldState(str, j10, (AbstractC9972n) null);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        TextFieldState textFieldState = (TextFieldState) RememberSaveableKt.m30420rememberSaveable(objArr, (Saver) saver, (String) null, (InterfaceC9529a) objRememberedValue, composer, 48, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return textFieldState;
    }

    public static final void setTextAndPlaceCursorAtEnd(TextFieldState textFieldState, String str) {
        TextFieldBuffer textFieldBufferStartEdit = textFieldState.startEdit();
        try {
            textFieldBufferStartEdit.replace(0, textFieldBufferStartEdit.getLength(), str);
            TextFieldBufferKt.placeCursorAtEnd(textFieldBufferStartEdit);
            textFieldState.commitEdit(textFieldBufferStartEdit);
        } finally {
            textFieldState.finishEditing();
        }
    }

    public static final void setTextAndSelectAll(TextFieldState textFieldState, String str) {
        TextFieldBuffer textFieldBufferStartEdit = textFieldState.startEdit();
        try {
            textFieldBufferStartEdit.replace(0, textFieldBufferStartEdit.getLength(), str);
            TextFieldBufferKt.selectAll(textFieldBufferStartEdit);
            textFieldState.commitEdit(textFieldBufferStartEdit);
        } finally {
            textFieldState.finishEditing();
        }
    }

    public static final TextFieldBuffer toTextFieldBuffer(TextFieldState textFieldState) {
        return new TextFieldBuffer(textFieldState.getValue$foundation_release(), null, null, null, 14, null);
    }
}
