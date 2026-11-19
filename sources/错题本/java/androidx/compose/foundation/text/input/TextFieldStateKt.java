package androidx.compose.foundation.text.input;

import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawStyle;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.PlatformSpanStyle;
import androidx.compose.p011ui.text.SpanStyle;
import androidx.compose.p011ui.text.TextRange;
import androidx.compose.p011ui.text.TextRangeKt;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontSynthesis;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.intl.LocaleList;
import androidx.compose.p011ui.text.style.BaselineShift;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextGeometricTransform;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC5805t;
import kotlin.collections.AbstractC5806u;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6469a;

@Metadata(m5109d1 = {"\u0000>\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a&\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0019\u0010\n\u001a\u00020\t*\u00020\u00042\u0006\u0010\b\u001a\u00020\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0019\u0010\f\u001a\u00020\t*\u00020\u00042\u0006\u0010\b\u001a\u00020\u0000¢\u0006\u0004\b\f\u0010\u000b\u001a\u0011\u0010\r\u001a\u00020\t*\u00020\u0004¢\u0006\u0004\b\r\u0010\u000e\u001aF\u0010\u0018\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00120\u0011j\u0002`\u00130\u00152\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0018\u0010\u0014\u001a\u0014\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00120\u0011j\u0002`\u0013\u0018\u00010\u0010H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0011\u0010\u001a\u001a\u00020\u0019*\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u001b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, m5110d2 = {"", "initialText", "Landroidx/compose/ui/text/TextRange;", "initialSelection", "Landroidx/compose/foundation/text/input/TextFieldState;", "rememberTextFieldState-Le-punE", "(Ljava/lang/String;JLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/text/input/TextFieldState;", "rememberTextFieldState", "text", "Ld6/s;", "setTextAndPlaceCursorAtEnd", "(Landroidx/compose/foundation/text/input/TextFieldState;Ljava/lang/String;)V", "setTextAndSelectAll", "clearText", "(Landroidx/compose/foundation/text/input/TextFieldState;)V", "composition", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/AnnotatedString$Annotation;", "Landroidx/compose/foundation/text/input/PlacedAnnotation;", "annotationList", "", "finalizeComposingAnnotations-itr0ztk", "(Landroidx/compose/ui/text/TextRange;Landroidx/compose/runtime/collection/MutableVector;)Ljava/util/List;", "finalizeComposingAnnotations", "Landroidx/compose/foundation/text/input/TextFieldBuffer;", "toTextFieldBuffer", "(Landroidx/compose/foundation/text/input/TextFieldState;)Landroidx/compose/foundation/text/input/TextFieldBuffer;", "foundation_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nTextFieldState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldState.kt\nandroidx/compose/foundation/text/input/TextFieldStateKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 TextFieldState.kt\nandroidx/compose/foundation/text/input/TextFieldState\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,765:1\n1247#2,6:766\n170#3,8:772\n170#3,8:780\n170#3,8:788\n519#4:796\n*S KotlinDebug\n*F\n+ 1 TextFieldState.kt\nandroidx/compose/foundation/text/input/TextFieldStateKt\n*L\n645#1:766,6\n665#1:772,8\n689#1:780,8\n711#1:788,8\n728#1:796\n*E\n"})
/* loaded from: classes.dex */
public final class TextFieldStateKt {
    public static final void clearText(@NotNull TextFieldState textFieldState) {
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
    public static final List<AnnotatedString.Range<AnnotatedString.Annotation>> m7755finalizeComposingAnnotationsitr0ztk(TextRange textRange, MutableVector<AnnotatedString.Range<AnnotatedString.Annotation>> mutableVector) {
        return (mutableVector == null || mutableVector.getSize() == 0) ? (textRange == null || TextRange.m12764getCollapsedimpl(textRange.getPackedValue())) ? EmptyList.INSTANCE : AbstractC5806u.m5286y(new AnnotatedString.Range(new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.INSTANCE.getUnderline(), (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 61439, (AbstractC5824e) null), TextRange.m12768getMinimpl(textRange.getPackedValue()), TextRange.m12767getMaximpl(textRange.getPackedValue()))) : AbstractC5805t.m5217D0(mutableVector.asMutableList());
    }

    @Composable
    @NotNull
    /* renamed from: rememberTextFieldState-Le-punE, reason: not valid java name */
    public static final TextFieldState m7756rememberTextFieldStateLepunE(@Nullable final String str, final long j7, @Nullable Composer composer, int i, int i8) {
        if ((i8 & 1) != 0) {
            str = "";
        }
        if ((i8 & 2) != 0) {
            j7 = TextRangeKt.TextRange(str.length());
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1125389485, i, -1, "androidx.compose.foundation.text.input.rememberTextFieldState (TextFieldState.kt:644)");
        }
        Object[] objArr = new Object[0];
        TextFieldState.Saver saver = TextFieldState.Saver.INSTANCE;
        boolean z8 = ((((i & 14) ^ 6) > 4 && composer.changed(str)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && composer.changed(j7)) || (i & 48) == 32);
        Object objRememberedValue = composer.rememberedValue();
        if (z8 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new InterfaceC6469a() { // from class: androidx.compose.foundation.text.input.TextFieldStateKt$rememberTextFieldState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p152r6.InterfaceC6469a
                public final TextFieldState invoke() {
                    return new TextFieldState(str, j7, (AbstractC5824e) null);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        TextFieldState textFieldState = (TextFieldState) RememberSaveableKt.m10224rememberSaveable(objArr, (Saver) saver, (String) null, (InterfaceC6469a) objRememberedValue, composer, 48, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return textFieldState;
    }

    public static final void setTextAndPlaceCursorAtEnd(@NotNull TextFieldState textFieldState, @NotNull String str) {
        TextFieldBuffer textFieldBufferStartEdit = textFieldState.startEdit();
        try {
            textFieldBufferStartEdit.replace(0, textFieldBufferStartEdit.getLength(), str);
            TextFieldBufferKt.placeCursorAtEnd(textFieldBufferStartEdit);
            textFieldState.commitEdit(textFieldBufferStartEdit);
        } finally {
            textFieldState.finishEditing();
        }
    }

    public static final void setTextAndSelectAll(@NotNull TextFieldState textFieldState, @NotNull String str) {
        TextFieldBuffer textFieldBufferStartEdit = textFieldState.startEdit();
        try {
            textFieldBufferStartEdit.replace(0, textFieldBufferStartEdit.getLength(), str);
            TextFieldBufferKt.selectAll(textFieldBufferStartEdit);
            textFieldState.commitEdit(textFieldBufferStartEdit);
        } finally {
            textFieldState.finishEditing();
        }
    }

    @NotNull
    public static final TextFieldBuffer toTextFieldBuffer(@NotNull TextFieldState textFieldState) {
        return new TextFieldBuffer(textFieldState.getValue$foundation_release(), null, null, null, 14, null);
    }
}
