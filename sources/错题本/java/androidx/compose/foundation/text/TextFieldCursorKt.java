package androidx.compose.foundation.text;

import androidx.compose.foundation.text.input.internal.CursorAnimationState;
import androidx.compose.p011ui.ComposedModifierKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.DrawModifierKt;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.SolidColor;
import androidx.compose.p011ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.WindowInfo;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.text.TextRange;
import androidx.compose.p011ui.text.input.OffsetMapping;
import androidx.compose.p011ui.text.input.TextFieldValue;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;
import p152r6.InterfaceC6474f;

@Metadata(m5109d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a4\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0000¨\u0006\f"}, m5110d2 = {"cursor", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/text/LegacyTextFieldState;", "value", "Landroidx/compose/ui/text/input/TextFieldValue;", "offsetMapping", "Landroidx/compose/ui/text/input/OffsetMapping;", "cursorBrush", "Landroidx/compose/ui/graphics/Brush;", "enabled", "", "foundation_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class TextFieldCursorKt {
    @NotNull
    public static final Modifier cursor(@NotNull Modifier modifier, @NotNull final LegacyTextFieldState legacyTextFieldState, @NotNull final TextFieldValue textFieldValue, @NotNull final OffsetMapping offsetMapping, @NotNull final Brush brush, boolean z8) {
        return z8 ? ComposedModifierKt.composed$default(modifier, null, new InterfaceC6474f() { // from class: androidx.compose.foundation.text.TextFieldCursorKt.cursor.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // p152r6.InterfaceC6474f
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
            }

            @Composable
            public final Modifier invoke(Modifier modifier2, Composer composer, int i) {
                Modifier modifierDrawWithContent;
                composer.startReplaceGroup(-84507373);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-84507373, i, -1, "androidx.compose.foundation.text.cursor.<anonymous> (TextFieldCursor.kt:46)");
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
                boolean z9 = ((brush2 instanceof SolidColor) && ((SolidColor) brush2).getValue() == 16) ? false : true;
                if (((WindowInfo) composer.consume(CompositionLocalsKt.getLocalWindowInfo())).isWindowFocused() && legacyTextFieldState.getHasFocus() && TextRange.m12764getCollapsedimpl(textFieldValue.getSelection()) && z9) {
                    composer.startReplaceGroup(808460990);
                    AnnotatedString annotatedString = textFieldValue.getAnnotatedString();
                    TextRange textRangeM12758boximpl = TextRange.m12758boximpl(textFieldValue.getSelection());
                    boolean zChangedInstance = composer.changedInstance(cursorAnimationState);
                    Object objRememberedValue2 = composer.rememberedValue();
                    if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new TextFieldCursorKt$cursor$1$1$1(cursorAnimationState, null);
                        composer.updateRememberedValue(objRememberedValue2);
                    }
                    EffectsKt.LaunchedEffect(annotatedString, textRangeM12758boximpl, (InterfaceC6473e) objRememberedValue2, composer, 0);
                    boolean zChangedInstance2 = composer.changedInstance(cursorAnimationState) | composer.changedInstance(offsetMapping) | composer.changed(textFieldValue) | composer.changedInstance(legacyTextFieldState) | composer.changed(brush);
                    final OffsetMapping offsetMapping2 = offsetMapping;
                    final TextFieldValue textFieldValue2 = textFieldValue;
                    final LegacyTextFieldState legacyTextFieldState2 = legacyTextFieldState;
                    final Brush brush3 = brush;
                    Object objRememberedValue3 = composer.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        Object obj = new InterfaceC6471c() { // from class: androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // p152r6.InterfaceC6471c
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                invoke((ContentDrawScope) obj2);
                                return C5443s.f8405a;
                            }

                            public final void invoke(ContentDrawScope contentDrawScope) {
                                Rect rect;
                                TextLayoutResult value;
                                contentDrawScope.drawContent();
                                float cursorAlpha = cursorAnimationState.getCursorAlpha();
                                if (cursorAlpha == 0.0f) {
                                    return;
                                }
                                int iOriginalToTransformed = offsetMapping2.originalToTransformed(TextRange.m12770getStartimpl(textFieldValue2.getSelection()));
                                TextLayoutResultProxy layoutResult = legacyTextFieldState2.getLayoutResult();
                                if (layoutResult == null || (value = layoutResult.getValue()) == null || (rect = value.getCursorRect(iOriginalToTransformed)) == null) {
                                    rect = new Rect(0.0f, 0.0f, 0.0f, 0.0f);
                                }
                                float fFloor = (float) Math.floor(contentDrawScope.mo6903toPx0680j_4(TextFieldCursor_androidKt.getDefaultCursorThickness()));
                                float f = fFloor < 1.0f ? 1.0f : fFloor;
                                float f7 = f / 2;
                                float left = rect.getLeft() + f7;
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (contentDrawScope.mo11233getSizeNHjbRc() >> 32)) - f7;
                                if (left > fIntBitsToFloat) {
                                    left = fIntBitsToFloat;
                                }
                                if (left >= f7) {
                                    f7 = left;
                                }
                                float fFloor2 = ((int) f) % 2 == 1 ? ((float) Math.floor(f7)) + 0.5f : (float) Math.rint(f7);
                                DrawScope.m11218drawLine1RTmtNc$default(contentDrawScope, brush3, Offset.m10433constructorimpl((Float.floatToRawIntBits(fFloor2) << 32) | (Float.floatToRawIntBits(rect.getTop()) & 4294967295L)), Offset.m10433constructorimpl((Float.floatToRawIntBits(rect.getBottom()) & 4294967295L) | (Float.floatToRawIntBits(fFloor2) << 32)), f, 0, null, cursorAlpha, null, 0, 432, null);
                            }
                        };
                        composer.updateRememberedValue(obj);
                        objRememberedValue3 = obj;
                    }
                    modifierDrawWithContent = DrawModifierKt.drawWithContent(modifier2, (InterfaceC6471c) objRememberedValue3);
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
