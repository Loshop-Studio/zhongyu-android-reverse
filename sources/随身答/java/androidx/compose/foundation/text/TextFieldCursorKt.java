package androidx.compose.foundation.text;

import androidx.compose.foundation.text.input.internal.CursorAnimationState;
import androidx.compose.p012ui.ComposedModifierKt;
import androidx.compose.p012ui.Modifier;
import androidx.compose.p012ui.draw.DrawModifierKt;
import androidx.compose.p012ui.geometry.Offset;
import androidx.compose.p012ui.geometry.Rect;
import androidx.compose.p012ui.graphics.Brush;
import androidx.compose.p012ui.graphics.SolidColor;
import androidx.compose.p012ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p012ui.graphics.drawscope.DrawScope;
import androidx.compose.p012ui.platform.CompositionLocalsKt;
import androidx.compose.p012ui.platform.WindowInfo;
import androidx.compose.p012ui.text.AnnotatedString;
import androidx.compose.p012ui.text.TextLayoutResult;
import androidx.compose.p012ui.text.TextRange;
import androidx.compose.p012ui.text.input.OffsetMapping;
import androidx.compose.p012ui.text.input.TextFieldValue;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.ranges.RangesKt;

@Metadata(m13412d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a4\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0000¨\u0006\f"}, m13413d2 = {"cursor", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/text/LegacyTextFieldState;", "value", "Landroidx/compose/ui/text/input/TextFieldValue;", "offsetMapping", "Landroidx/compose/ui/text/input/OffsetMapping;", "cursorBrush", "Landroidx/compose/ui/graphics/Brush;", "enabled", "", "foundation_release"}, m13414k = 2, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class TextFieldCursorKt {
    public static final Modifier cursor(Modifier modifier, final LegacyTextFieldState legacyTextFieldState, final TextFieldValue textFieldValue, final OffsetMapping offsetMapping, final Brush brush, boolean z9) {
        return z9 ? ComposedModifierKt.composed$default(modifier, null, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.text.TextFieldCursorKt.cursor.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            @Composable
            public final Modifier invoke(Modifier modifier2, Composer composer, int i9) {
                Modifier modifierDrawWithContent;
                composer.startReplaceGroup(-84507373);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-84507373, i9, -1, "androidx.compose.foundation.text.cursor.<anonymous> (TextFieldCursor.kt:46)");
                }
                boolean zBooleanValue = ((Boolean) composer.consume(CompositionLocalsKt.getLocalCursorBlinkEnabled())).booleanValue();
                boolean zChanged = composer.changed(zBooleanValue);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new CursorAnimationState(zBooleanValue);
                    composer.updateRememberedValue(objRememberedValue);
                }
                final CursorAnimationState cursorAnimationState = (CursorAnimationState) objRememberedValue;
                Brush brush2 = brush;
                boolean z10 = ((brush2 instanceof SolidColor) && ((SolidColor) brush2).getValue() == 16) ? false : true;
                if (((WindowInfo) composer.consume(CompositionLocalsKt.getLocalWindowInfo())).isWindowFocused() && legacyTextFieldState.getHasFocus() && TextRange.m23454getCollapsedimpl(textFieldValue.getSelection()) && z10) {
                    composer.startReplaceGroup(808460990);
                    AnnotatedString text = textFieldValue.getText();
                    TextRange textRangeM23448boximpl = TextRange.m23448boximpl(textFieldValue.getSelection());
                    boolean zChangedInstance = composer.changedInstance(cursorAnimationState);
                    Object objRememberedValue2 = composer.rememberedValue();
                    if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new TextFieldCursorKt$cursor$1$1$1(cursorAnimationState, null);
                        composer.updateRememberedValue(objRememberedValue2);
                    }
                    EffectsKt.LaunchedEffect(text, textRangeM23448boximpl, (Function2) objRememberedValue2, composer, 0);
                    boolean zChangedInstance2 = composer.changedInstance(cursorAnimationState) | composer.changedInstance(offsetMapping) | composer.changed(textFieldValue) | composer.changedInstance(legacyTextFieldState) | composer.changed(brush);
                    final OffsetMapping offsetMapping2 = offsetMapping;
                    final TextFieldValue textFieldValue2 = textFieldValue;
                    final LegacyTextFieldState legacyTextFieldState2 = legacyTextFieldState;
                    final Brush brush3 = brush;
                    Object objRememberedValue3 = composer.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        Object obj = new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                                invoke2(contentDrawScope);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(ContentDrawScope contentDrawScope) {
                                Rect rect;
                                TextLayoutResult value;
                                contentDrawScope.drawContent();
                                float cursorAlpha = cursorAnimationState.getCursorAlpha();
                                if (cursorAlpha == 0.0f) {
                                    return;
                                }
                                int iOriginalToTransformed = offsetMapping2.originalToTransformed(TextRange.m23460getStartimpl(textFieldValue2.getSelection()));
                                TextLayoutResultProxy layoutResult = legacyTextFieldState2.getLayoutResult();
                                if (layoutResult == null || (value = layoutResult.getValue()) == null || (rect = value.getCursorRect(iOriginalToTransformed)) == null) {
                                    rect = new Rect(0.0f, 0.0f, 0.0f, 0.0f);
                                }
                                float fCoerceAtLeast = RangesKt.coerceAtLeast((float) Math.floor(contentDrawScope.mo17765toPx0680j_4(TextFieldCursor_androidKt.getDefaultCursorThickness())), 1.0f);
                                float f10 = fCoerceAtLeast / 2;
                                float fCoerceAtLeast2 = RangesKt.coerceAtLeast(RangesKt.coerceAtMost(rect.getLeft() + f10, Float.intBitsToFloat((int) (contentDrawScope.mo21960getSizeNHjbRc() >> 32)) - f10), f10);
                                float fFloor = ((int) fCoerceAtLeast) % 2 == 1 ? ((float) Math.floor(fCoerceAtLeast2)) + 0.5f : (float) Math.rint(fCoerceAtLeast2);
                                DrawScope.m21945drawLine1RTmtNc$default(contentDrawScope, brush3, Offset.m21160constructorimpl((Float.floatToRawIntBits(fFloor) << 32) | (Float.floatToRawIntBits(rect.getTop()) & 4294967295L)), Offset.m21160constructorimpl((Float.floatToRawIntBits(rect.getBottom()) & 4294967295L) | (Float.floatToRawIntBits(fFloor) << 32)), fCoerceAtLeast, 0, null, cursorAlpha, null, 0, 432, null);
                            }
                        };
                        composer.updateRememberedValue(obj);
                        objRememberedValue3 = obj;
                    }
                    modifierDrawWithContent = DrawModifierKt.drawWithContent(modifier2, (Function1) objRememberedValue3);
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(810474750);
                    composer.endReplaceGroup();
                    modifierDrawWithContent = Modifier.INSTANCE;
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
