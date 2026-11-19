package androidx.compose.foundation.text;

import androidx.compose.foundation.text.input.internal.CursorAnimationState;
import androidx.compose.p014ui.ComposedModifierKt;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.draw.DrawModifierKt;
import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.geometry.Rect;
import androidx.compose.p014ui.graphics.Brush;
import androidx.compose.p014ui.graphics.SolidColor;
import androidx.compose.p014ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p014ui.graphics.drawscope.DrawScope;
import androidx.compose.p014ui.platform.CompositionLocalsKt;
import androidx.compose.p014ui.platform.WindowInfo;
import androidx.compose.p014ui.text.AnnotatedString;
import androidx.compose.p014ui.text.TextLayoutResult;
import androidx.compose.p014ui.text.TextRange;
import androidx.compose.p014ui.text.input.OffsetMapping;
import androidx.compose.p014ui.text.input.TextFieldValue;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p181hd.InterfaceC9545q;
import p265nd.AbstractC10410o;
import p309qc.C10786q;

/* loaded from: classes.dex */
public final class TextFieldCursorKt {
    public static final Modifier cursor(Modifier modifier, final LegacyTextFieldState legacyTextFieldState, final TextFieldValue textFieldValue, final OffsetMapping offsetMapping, final Brush brush, boolean z10) {
        return z10 ? ComposedModifierKt.composed$default(modifier, null, new InterfaceC9545q() { // from class: androidx.compose.foundation.text.TextFieldCursorKt.cursor.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // p181hd.InterfaceC9545q
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
            }

            @Composable
            public final Modifier invoke(Modifier modifier2, Composer composer, int i10) {
                Modifier modifierDrawWithContent;
                composer.startReplaceGroup(-84507373);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-84507373, i10, -1, "androidx.compose.foundation.text.cursor.<anonymous> (TextFieldCursor.kt:46)");
                }
                boolean zBooleanValue = ((Boolean) composer.consume(CompositionLocalsKt.getLocalCursorBlinkEnabled())).booleanValue();
                boolean zChanged = composer.changed(zBooleanValue);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new CursorAnimationState(zBooleanValue);
                    composer.updateRememberedValue(objRememberedValue);
                }
                final CursorAnimationState cursorAnimationState = (CursorAnimationState) objRememberedValue;
                Brush brush2 = brush;
                boolean z11 = ((brush2 instanceof SolidColor) && ((SolidColor) brush2).m31213getValue0d7_KjU() == 16) ? false : true;
                if (((WindowInfo) composer.consume(CompositionLocalsKt.getLocalWindowInfo())).isWindowFocused() && legacyTextFieldState.getHasFocus() && TextRange.m32960getCollapsedimpl(textFieldValue.m33214getSelectiond9O1mEE()) && z11) {
                    composer.startReplaceGroup(808460990);
                    AnnotatedString annotatedString = textFieldValue.getAnnotatedString();
                    TextRange textRangeM32954boximpl = TextRange.m32954boximpl(textFieldValue.m33214getSelectiond9O1mEE());
                    boolean zChangedInstance = composer.changedInstance(cursorAnimationState);
                    Object objRememberedValue2 = composer.rememberedValue();
                    if (zChangedInstance || objRememberedValue2 == Composer.Companion.getEmpty()) {
                        objRememberedValue2 = new TextFieldCursorKt$cursor$1$1$1(cursorAnimationState, null);
                        composer.updateRememberedValue(objRememberedValue2);
                    }
                    EffectsKt.LaunchedEffect(annotatedString, textRangeM32954boximpl, (InterfaceC9544p) objRememberedValue2, composer, 0);
                    boolean zChangedInstance2 = composer.changedInstance(cursorAnimationState) | composer.changedInstance(offsetMapping) | composer.changed(textFieldValue) | composer.changedInstance(legacyTextFieldState) | composer.changed(brush);
                    final OffsetMapping offsetMapping2 = offsetMapping;
                    final TextFieldValue textFieldValue2 = textFieldValue;
                    final LegacyTextFieldState legacyTextFieldState2 = legacyTextFieldState;
                    final Brush brush3 = brush;
                    Object objRememberedValue3 = composer.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                        Object obj = new InterfaceC9540l() { // from class: androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // p181hd.InterfaceC9540l
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                invoke((ContentDrawScope) obj2);
                                return C10786q.f26013a;
                            }

                            public final void invoke(ContentDrawScope contentDrawScope) {
                                Rect rect;
                                TextLayoutResult value;
                                contentDrawScope.drawContent();
                                float cursorAlpha = cursorAnimationState.getCursorAlpha();
                                if (cursorAlpha == 0.0f) {
                                    return;
                                }
                                int iOriginalToTransformed = offsetMapping2.originalToTransformed(TextRange.m32966getStartimpl(textFieldValue2.m33214getSelectiond9O1mEE()));
                                TextLayoutResultProxy layoutResult = legacyTextFieldState2.getLayoutResult();
                                if (layoutResult == null || (value = layoutResult.getValue()) == null || (rect = value.getCursorRect(iOriginalToTransformed)) == null) {
                                    rect = new Rect(0.0f, 0.0f, 0.0f, 0.0f);
                                }
                                float fM21751d = AbstractC10410o.m21751d((float) Math.floor(contentDrawScope.mo27099toPx0680j_4(TextFieldCursor_androidKt.getDefaultCursorThickness())), 1.0f);
                                float f10 = fM21751d / 2;
                                float fM21751d2 = AbstractC10410o.m21751d(AbstractC10410o.m21755h(rect.getLeft() + f10, Float.intBitsToFloat((int) (contentDrawScope.mo31429getSizeNHjbRc() >> 32)) - f10), f10);
                                float fFloor = ((int) fM21751d) % 2 == 1 ? ((float) Math.floor(fM21751d2)) + 0.5f : (float) Math.rint(fM21751d2);
                                DrawScope.m31414drawLine1RTmtNc$default(contentDrawScope, brush3, Offset.m30629constructorimpl((Float.floatToRawIntBits(fFloor) << 32) | (Float.floatToRawIntBits(rect.getTop()) & 4294967295L)), Offset.m30629constructorimpl((Float.floatToRawIntBits(rect.getBottom()) & 4294967295L) | (Float.floatToRawIntBits(fFloor) << 32)), fM21751d, 0, null, cursorAlpha, null, 0, 432, null);
                            }
                        };
                        composer.updateRememberedValue(obj);
                        objRememberedValue3 = obj;
                    }
                    modifierDrawWithContent = DrawModifierKt.drawWithContent(modifier2, (InterfaceC9540l) objRememberedValue3);
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(810474750);
                    composer.endReplaceGroup();
                    modifierDrawWithContent = Modifier.Companion;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return modifierDrawWithContent;
            }
        }, 1, null) : modifier;
    }
}
