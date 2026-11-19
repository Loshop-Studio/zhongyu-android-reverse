package androidx.compose.foundation.text;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p014ui.ComposedModifierKt;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.platform.CompositionLocalsKt;
import androidx.compose.p014ui.platform.InspectableValueKt;
import androidx.compose.p014ui.platform.InspectorInfo;
import androidx.compose.p014ui.text.TextStyle;
import androidx.compose.p014ui.text.TextStyleKt;
import androidx.compose.p014ui.text.font.FontFamily;
import androidx.compose.p014ui.text.font.FontStyle;
import androidx.compose.p014ui.text.font.FontSynthesis;
import androidx.compose.p014ui.text.font.FontWeight;
import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.p014ui.unit.LayoutDirection;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9545q;
import p309qc.C10786q;

/* loaded from: classes.dex */
public final class HeightInLinesModifierKt {
    public static final int DefaultMinLines = 1;

    public static final Modifier heightInLines(Modifier modifier, final TextStyle textStyle, final int i10, final int i11) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new InterfaceC9540l() { // from class: androidx.compose.foundation.text.HeightInLinesModifierKt$heightInLines$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return C10786q.f26013a;
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("heightInLines");
                inspectorInfo.getProperties().set("minLines", Integer.valueOf(i10));
                inspectorInfo.getProperties().set("maxLines", Integer.valueOf(i11));
                inspectorInfo.getProperties().set("textStyle", textStyle);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new InterfaceC9545q() { // from class: androidx.compose.foundation.text.HeightInLinesModifierKt.heightInLines.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // p181hd.InterfaceC9545q
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
            }

            @Composable
            public final Modifier invoke(Modifier modifier2, Composer composer, int i12) {
                composer.startReplaceGroup(408240218);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(408240218, i12, -1, "androidx.compose.foundation.text.heightInLines.<anonymous> (HeightInLinesModifier.kt:62)");
                }
                HeightInLinesModifierKt.validateMinMaxLines(i10, i11);
                if (i10 == 1 && i11 == Integer.MAX_VALUE) {
                    Modifier.Companion companion = Modifier.Companion;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer.endReplaceGroup();
                    return companion;
                }
                Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
                FontFamily.Resolver resolver = (FontFamily.Resolver) composer.consume(CompositionLocalsKt.getLocalFontFamilyResolver());
                LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
                boolean zChanged = composer.changed(textStyle) | composer.changed(layoutDirection);
                TextStyle textStyle2 = textStyle;
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = TextStyleKt.resolveDefaults(textStyle2, layoutDirection);
                    composer.updateRememberedValue(objRememberedValue);
                }
                TextStyle textStyle3 = (TextStyle) objRememberedValue;
                boolean zChanged2 = composer.changed(resolver) | composer.changed(textStyle3);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                    FontFamily fontFamily = textStyle3.getFontFamily();
                    FontWeight fontWeight = textStyle3.getFontWeight();
                    if (fontWeight == null) {
                        fontWeight = FontWeight.Companion.getNormal();
                    }
                    FontStyle fontStyleM32998getFontStyle4Lr2A7w = textStyle3.m32998getFontStyle4Lr2A7w();
                    int iM33080unboximpl = fontStyleM32998getFontStyle4Lr2A7w != null ? fontStyleM32998getFontStyle4Lr2A7w.m33080unboximpl() : FontStyle.Companion.m33084getNormal_LCdwA();
                    FontSynthesis fontSynthesisM32999getFontSynthesisZQGJjVo = textStyle3.m32999getFontSynthesisZQGJjVo();
                    objRememberedValue2 = resolver.mo33050resolveDPcqOEQ(fontFamily, fontWeight, iM33080unboximpl, fontSynthesisM32999getFontSynthesisZQGJjVo != null ? fontSynthesisM32999getFontSynthesisZQGJjVo.m33093unboximpl() : FontSynthesis.Companion.m33094getAllGVVA2EU());
                    composer.updateRememberedValue(objRememberedValue2);
                }
                State state = (State) objRememberedValue2;
                boolean zChanged3 = composer.changed(state.getValue()) | composer.changed(density) | composer.changed(resolver) | composer.changed(textStyle) | composer.changed(layoutDirection);
                Object objRememberedValue3 = composer.rememberedValue();
                if (zChanged3 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                    objRememberedValue3 = Integer.valueOf((int) (TextFieldDelegateKt.computeSizeForDefaultText(textStyle3, density, resolver, TextFieldDelegateKt.getEmptyTextReplacement(), 1) & 4294967295L));
                    composer.updateRememberedValue(objRememberedValue3);
                }
                int iIntValue = ((Number) objRememberedValue3).intValue();
                boolean zChanged4 = composer.changed(layoutDirection) | composer.changed(density) | composer.changed(resolver) | composer.changed(textStyle) | composer.changed(state.getValue());
                Object objRememberedValue4 = composer.rememberedValue();
                if (zChanged4 || objRememberedValue4 == Composer.Companion.getEmpty()) {
                    objRememberedValue4 = Integer.valueOf((int) (TextFieldDelegateKt.computeSizeForDefaultText(textStyle3, density, resolver, TextFieldDelegateKt.getEmptyTextReplacement() + '\n' + TextFieldDelegateKt.getEmptyTextReplacement(), 2) & 4294967295L));
                    composer.updateRememberedValue(objRememberedValue4);
                }
                int iIntValue2 = ((Number) objRememberedValue4).intValue() - iIntValue;
                int i13 = i10;
                Integer numValueOf = i13 == 1 ? null : Integer.valueOf(((i13 - 1) * iIntValue2) + iIntValue);
                int i14 = i11;
                Integer numValueOf2 = i14 != Integer.MAX_VALUE ? Integer.valueOf(iIntValue + (iIntValue2 * (i14 - 1))) : null;
                Modifier modifierM27492heightInVpY3zN4 = SizeKt.m27492heightInVpY3zN4(Modifier.Companion, numValueOf != null ? density.mo27096toDpu2uoSUM(numValueOf.intValue()) : C3186Dp.Companion.m33521getUnspecifiedD9Ej5fM(), numValueOf2 != null ? density.mo27096toDpu2uoSUM(numValueOf2.intValue()) : C3186Dp.Companion.m33521getUnspecifiedD9Ej5fM());
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return modifierM27492heightInVpY3zN4;
            }
        });
    }

    public static /* synthetic */ Modifier heightInLines$default(Modifier modifier, TextStyle textStyle, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 1;
        }
        if ((i12 & 4) != 0) {
            i11 = Integer.MAX_VALUE;
        }
        return heightInLines(modifier, textStyle, i10, i11);
    }

    public static final void validateMinMaxLines(int i10, int i11) {
        if (!(i10 > 0 && i11 > 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("both minLines " + i10 + " and maxLines " + i11 + " must be greater than zero");
        }
        if (i10 <= i11) {
            return;
        }
        InlineClassHelperKt.throwIllegalArgumentException("minLines " + i10 + " must be less than or equal to maxLines " + i11);
    }
}
