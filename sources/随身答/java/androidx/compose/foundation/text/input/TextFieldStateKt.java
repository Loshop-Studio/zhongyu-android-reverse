package androidx.compose.foundation.text.input;

import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.p012ui.graphics.Shadow;
import androidx.compose.p012ui.graphics.drawscope.DrawStyle;
import androidx.compose.p012ui.text.AnnotatedString;
import androidx.compose.p012ui.text.PlatformSpanStyle;
import androidx.compose.p012ui.text.SpanStyle;
import androidx.compose.p012ui.text.TextRange;
import androidx.compose.p012ui.text.TextRangeKt;
import androidx.compose.p012ui.text.font.FontFamily;
import androidx.compose.p012ui.text.font.FontStyle;
import androidx.compose.p012ui.text.font.FontSynthesis;
import androidx.compose.p012ui.text.font.FontWeight;
import androidx.compose.p012ui.text.intl.LocaleList;
import androidx.compose.p012ui.text.style.BaselineShift;
import androidx.compose.p012ui.text.style.TextDecoration;
import androidx.compose.p012ui.text.style.TextGeometricTransform;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13412d1 = {"\u0000>\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001aD\u0010\u0000\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\u00040\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0018\u0010\u0007\u001a\u0014\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\u0004\u0018\u00010\bH\u0002ø\u0001\u0000¢\u0006\u0002\b\t\u001a&\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\n\u0010\u0011\u001a\u00020\u0012*\u00020\u000b\u001a\u0012\u0010\u0013\u001a\u00020\u0012*\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\r\u001a\u0012\u0010\u0015\u001a\u00020\u0012*\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\r\u001a\n\u0010\u0016\u001a\u00020\u0017*\u00020\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, m13413d2 = {"finalizeComposingAnnotations", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/AnnotatedString$Annotation;", "Landroidx/compose/foundation/text/input/PlacedAnnotation;", "composition", "Landroidx/compose/ui/text/TextRange;", "annotationList", "Landroidx/compose/runtime/collection/MutableVector;", "finalizeComposingAnnotations-itr0ztk", "rememberTextFieldState", "Landroidx/compose/foundation/text/input/TextFieldState;", "initialText", "", "initialSelection", "rememberTextFieldState-Le-punE", "(Ljava/lang/String;JLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/text/input/TextFieldState;", "clearText", "", "setTextAndPlaceCursorAtEnd", "text", "setTextAndSelectAll", "toTextFieldBuffer", "Landroidx/compose/foundation/text/input/TextFieldBuffer;", "foundation_release"}, m13414k = 2, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nTextFieldState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldState.kt\nandroidx/compose/foundation/text/input/TextFieldStateKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 TextFieldState.kt\nandroidx/compose/foundation/text/input/TextFieldState\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,765:1\n1247#2,6:766\n170#3,8:772\n170#3,8:780\n170#3,8:788\n519#4:796\n*S KotlinDebug\n*F\n+ 1 TextFieldState.kt\nandroidx/compose/foundation/text/input/TextFieldStateKt\n*L\n645#1:766,6\n665#1:772,8\n689#1:780,8\n711#1:788,8\n728#1:796\n*E\n"})
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
    public static final List<AnnotatedString.Range<AnnotatedString.Annotation>> m18581finalizeComposingAnnotationsitr0ztk(TextRange textRange, MutableVector<AnnotatedString.Range<AnnotatedString.Annotation>> mutableVector) {
        return (mutableVector == null || mutableVector.getSize() == 0) ? (textRange == null || TextRange.m23454getCollapsedimpl(textRange.getPackedValue())) ? CollectionsKt.emptyList() : CollectionsKt.listOf(new AnnotatedString.Range(new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.INSTANCE.getUnderline(), (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 61439, (DefaultConstructorMarker) null), TextRange.m23458getMinimpl(textRange.getPackedValue()), TextRange.m23457getMaximpl(textRange.getPackedValue()))) : CollectionsKt.toList(mutableVector.asMutableList());
    }

    @Composable
    /* renamed from: rememberTextFieldState-Le-punE, reason: not valid java name */
    public static final TextFieldState m18582rememberTextFieldStateLepunE(final String str, final long j9, Composer composer, int i9, int i10) {
        if ((i10 & 1) != 0) {
            str = "";
        }
        if ((i10 & 2) != 0) {
            j9 = TextRangeKt.TextRange(str.length());
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1125389485, i9, -1, "androidx.compose.foundation.text.input.rememberTextFieldState (TextFieldState.kt:644)");
        }
        Object[] objArr = new Object[0];
        TextFieldState.Saver saver = TextFieldState.Saver.INSTANCE;
        boolean z9 = ((((i9 & 14) ^ 6) > 4 && composer.changed(str)) || (i9 & 6) == 4) | ((((i9 & 112) ^ 48) > 32 && composer.changed(j9)) || (i9 & 48) == 32);
        Object objRememberedValue = composer.rememberedValue();
        if (z9 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0<TextFieldState>() { // from class: androidx.compose.foundation.text.input.TextFieldStateKt$rememberTextFieldState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final TextFieldState invoke() {
                    return new TextFieldState(str, j9, (DefaultConstructorMarker) null);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        TextFieldState textFieldState = (TextFieldState) RememberSaveableKt.m20966rememberSaveable(objArr, (Saver) saver, (String) null, (Function0) objRememberedValue, composer, 48, 4);
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
