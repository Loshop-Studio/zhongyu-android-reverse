package androidx.compose.foundation.text;

import androidx.compose.p014ui.ComposedModifierKt;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.layout.LayoutModifierKt;
import androidx.compose.p014ui.layout.Measurable;
import androidx.compose.p014ui.layout.MeasureResult;
import androidx.compose.p014ui.layout.MeasureScope;
import androidx.compose.p014ui.layout.Placeable;
import androidx.compose.p014ui.platform.CompositionLocalsKt;
import androidx.compose.p014ui.text.TextStyle;
import androidx.compose.p014ui.text.TextStyleKt;
import androidx.compose.p014ui.text.font.FontFamily;
import androidx.compose.p014ui.text.font.FontStyle;
import androidx.compose.p014ui.text.font.FontSynthesis;
import androidx.compose.p014ui.text.font.FontWeight;
import androidx.compose.p014ui.unit.Constraints;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.p014ui.unit.LayoutDirection;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9545q;
import p265nd.AbstractC10410o;
import p309qc.C10786q;

/* loaded from: classes.dex */
public final class TextFieldSizeKt {
    public static final Modifier textFieldMinSize(Modifier modifier, final TextStyle textStyle) {
        return ComposedModifierKt.composed$default(modifier, null, new InterfaceC9545q() { // from class: androidx.compose.foundation.text.TextFieldSizeKt.textFieldMinSize.1
            {
                super(3);
            }

            @Override // p181hd.InterfaceC9545q
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
            }

            @Composable
            public final Modifier invoke(Modifier modifier2, Composer composer, int i10) {
                composer.startReplaceGroup(1582736677);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1582736677, i10, -1, "androidx.compose.foundation.text.textFieldMinSize.<anonymous> (TextFieldSize.kt:37)");
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
                TextStyle textStyle4 = textStyle;
                Object objRememberedValue3 = composer.rememberedValue();
                Composer.Companion companion = Composer.Companion;
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new TextFieldSize(layoutDirection, density, resolver, textStyle4, state.getValue());
                    composer.updateRememberedValue(objRememberedValue3);
                }
                final TextFieldSize textFieldSize = (TextFieldSize) objRememberedValue3;
                textFieldSize.update(layoutDirection, density, resolver, textStyle3, state.getValue());
                Modifier.Companion companion2 = Modifier.Companion;
                boolean zChangedInstance = composer.changedInstance(textFieldSize);
                Object objRememberedValue4 = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new InterfaceC9545q() { // from class: androidx.compose.foundation.text.TextFieldSizeKt$textFieldMinSize$1$1$1
                        {
                            super(3);
                        }

                        @Override // p181hd.InterfaceC9545q
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                            return m27917invoke3p2s80s((MeasureScope) obj, (Measurable) obj2, ((Constraints) obj3).m33460unboximpl());
                        }

                        /* renamed from: invoke-3p2s80s, reason: not valid java name */
                        public final MeasureResult m27917invoke3p2s80s(MeasureScope measureScope, Measurable measurable, long j10) {
                            long jM27916getMinSizeYbymL2g = textFieldSize.m27916getMinSizeYbymL2g();
                            final Placeable placeableMo32229measureBRTryo0 = measurable.mo32229measureBRTryo0(Constraints.m33444copyZbe2FdA$default(j10, AbstractC10410o.m21761n((int) (jM27916getMinSizeYbymL2g >> 32), Constraints.m33456getMinWidthimpl(j10), Constraints.m33454getMaxWidthimpl(j10)), 0, AbstractC10410o.m21761n((int) (jM27916getMinSizeYbymL2g & 4294967295L), Constraints.m33455getMinHeightimpl(j10), Constraints.m33453getMaxHeightimpl(j10)), 0, 10, null));
                            return MeasureScope.layout$default(measureScope, placeableMo32229measureBRTryo0.getWidth(), placeableMo32229measureBRTryo0.getHeight(), null, new InterfaceC9540l() { // from class: androidx.compose.foundation.text.TextFieldSizeKt$textFieldMinSize$1$1$1.1
                                {
                                    super(1);
                                }

                                @Override // p181hd.InterfaceC9540l
                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    invoke((Placeable.PlacementScope) obj);
                                    return C10786q.f26013a;
                                }

                                public final void invoke(Placeable.PlacementScope placementScope) {
                                    Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo32229measureBRTryo0, 0, 0, 0.0f, 4, null);
                                }
                            }, 4, null);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue4);
                }
                Modifier modifierLayout = LayoutModifierKt.layout(companion2, (InterfaceC9545q) objRememberedValue4);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return modifierLayout;
            }
        }, 1, null);
    }
}
