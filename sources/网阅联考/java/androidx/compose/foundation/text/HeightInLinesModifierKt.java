package androidx.compose.foundation.text;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p006ui.ComposedModifierKt;
import androidx.compose.p006ui.Modifier;
import androidx.compose.p006ui.platform.CompositionLocalsKt;
import androidx.compose.p006ui.platform.InspectableValueKt;
import androidx.compose.p006ui.platform.InspectorInfo;
import androidx.compose.p006ui.text.TextStyle;
import androidx.compose.p006ui.text.TextStyleKt;
import androidx.compose.p006ui.text.font.FontFamily;
import androidx.compose.p006ui.text.font.FontStyle;
import androidx.compose.p006ui.text.font.FontSynthesis;
import androidx.compose.p006ui.text.font.FontWeight;
import androidx.compose.p006ui.unit.C1700Dp;
import androidx.compose.p006ui.unit.Density;
import androidx.compose.p006ui.unit.IntSize;
import androidx.compose.p006ui.unit.LayoutDirection;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m5174d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0000\u001a(\u0010\u0006\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0001H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\n"}, m5175d2 = {"DefaultMinLines", "", "validateMinMaxLines", "", "minLines", "maxLines", "heightInLines", "Landroidx/compose/ui/Modifier;", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "foundation_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nHeightInLinesModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeightInLinesModifier.kt\nandroidx/compose/foundation/text/HeightInLinesModifierKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,134:1\n135#2:135\n*S KotlinDebug\n*F\n+ 1 HeightInLinesModifier.kt\nandroidx/compose/foundation/text/HeightInLinesModifierKt\n*L\n53#1:135\n*E\n"})
/* loaded from: classes.dex */
public final class HeightInLinesModifierKt {
    public static final int DefaultMinLines = 1;

    public static final Modifier heightInLines(Modifier modifier, final TextStyle textStyle, final int i4, final int i5) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(textStyle, "textStyle");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.text.HeightInLinesModifierKt$heightInLines$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("heightInLines");
                inspectorInfo.getProperties().set("minLines", Integer.valueOf(i4));
                inspectorInfo.getProperties().set("maxLines", Integer.valueOf(i5));
                inspectorInfo.getProperties().set("textStyle", textStyle);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.text.HeightInLinesModifierKt.heightInLines.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            @Composable
            public final Modifier invoke(Modifier composed, Composer composer, int i6) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(408240218);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(408240218, i6, -1, "androidx.compose.foundation.text.heightInLines.<anonymous> (HeightInLinesModifier.kt:58)");
                }
                HeightInLinesModifierKt.validateMinMaxLines(i4, i5);
                if (i4 == 1 && i5 == Integer.MAX_VALUE) {
                    Modifier.Companion companion = Modifier.INSTANCE;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer.endReplaceableGroup();
                    return companion;
                }
                Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
                FontFamily.Resolver resolver = (FontFamily.Resolver) composer.consume(CompositionLocalsKt.getLocalFontFamilyResolver());
                LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
                TextStyle textStyle2 = textStyle;
                composer.startReplaceableGroup(511388516);
                boolean zChanged = composer.changed(textStyle2) | composer.changed(layoutDirection);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = TextStyleKt.resolveDefaults(textStyle2, layoutDirection);
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                TextStyle textStyle3 = (TextStyle) objRememberedValue;
                composer.startReplaceableGroup(511388516);
                boolean zChanged2 = composer.changed(resolver) | composer.changed(textStyle3);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    FontFamily fontFamily = textStyle3.getFontFamily();
                    FontWeight fontWeight = textStyle3.getFontWeight();
                    if (fontWeight == null) {
                        fontWeight = FontWeight.INSTANCE.getNormal();
                    }
                    FontStyle fontStyleM11099getFontStyle4Lr2A7w = textStyle3.m11099getFontStyle4Lr2A7w();
                    int iM11165unboximpl = fontStyleM11099getFontStyle4Lr2A7w != null ? fontStyleM11099getFontStyle4Lr2A7w.m11165unboximpl() : FontStyle.INSTANCE.m11167getNormal_LCdwA();
                    FontSynthesis fontSynthesisM11100getFontSynthesisZQGJjVo = textStyle3.m11100getFontSynthesisZQGJjVo();
                    objRememberedValue2 = resolver.mo11137resolveDPcqOEQ(fontFamily, fontWeight, iM11165unboximpl, fontSynthesisM11100getFontSynthesisZQGJjVo != null ? fontSynthesisM11100getFontSynthesisZQGJjVo.getValue() : FontSynthesis.INSTANCE.m11177getAllGVVA2EU());
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceableGroup();
                State state = (State) objRememberedValue2;
                Object[] objArr = {density, resolver, textStyle, layoutDirection, state.getValue()};
                composer.startReplaceableGroup(-568225417);
                boolean zChanged3 = false;
                for (int i7 = 0; i7 < 5; i7++) {
                    zChanged3 |= composer.changed(objArr[i7]);
                }
                Object objRememberedValue3 = composer.rememberedValue();
                if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = Integer.valueOf(IntSize.m11684getHeightimpl(TextFieldDelegateKt.computeSizeForDefaultText(textStyle3, density, resolver, TextFieldDelegateKt.getEmptyTextReplacement(), 1)));
                    composer.updateRememberedValue(objRememberedValue3);
                }
                composer.endReplaceableGroup();
                int iIntValue = ((Number) objRememberedValue3).intValue();
                Object[] objArr2 = {density, resolver, textStyle, layoutDirection, state.getValue()};
                composer.startReplaceableGroup(-568225417);
                boolean zChanged4 = false;
                for (int i8 = 0; i8 < 5; i8++) {
                    zChanged4 |= composer.changed(objArr2[i8]);
                }
                Object objRememberedValue4 = composer.rememberedValue();
                if (zChanged4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = Integer.valueOf(IntSize.m11684getHeightimpl(TextFieldDelegateKt.computeSizeForDefaultText(textStyle3, density, resolver, TextFieldDelegateKt.getEmptyTextReplacement() + '\n' + TextFieldDelegateKt.getEmptyTextReplacement(), 2)));
                    composer.updateRememberedValue(objRememberedValue4);
                }
                composer.endReplaceableGroup();
                int iIntValue2 = ((Number) objRememberedValue4).intValue() - iIntValue;
                int i9 = i4;
                Integer numValueOf = i9 == 1 ? null : Integer.valueOf(((i9 - 1) * iIntValue2) + iIntValue);
                int i10 = i5;
                Integer numValueOf2 = i10 != Integer.MAX_VALUE ? Integer.valueOf(iIntValue + (iIntValue2 * (i10 - 1))) : null;
                Modifier modifierM7346heightInVpY3zN4 = SizeKt.m7346heightInVpY3zN4(Modifier.INSTANCE, numValueOf != null ? density.mo7203toDpu2uoSUM(numValueOf.intValue()) : C1700Dp.INSTANCE.m11545getUnspecifiedD9Ej5fM(), numValueOf2 != null ? density.mo7203toDpu2uoSUM(numValueOf2.intValue()) : C1700Dp.INSTANCE.m11545getUnspecifiedD9Ej5fM());
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return modifierM7346heightInVpY3zN4;
            }
        });
    }

    public static /* synthetic */ Modifier heightInLines$default(Modifier modifier, TextStyle textStyle, int i4, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i4 = 1;
        }
        if ((i6 & 4) != 0) {
            i5 = Integer.MAX_VALUE;
        }
        return heightInLines(modifier, textStyle, i4, i5);
    }

    public static final void validateMinMaxLines(int i4, int i5) {
        if (!(i4 > 0 && i5 > 0)) {
            throw new IllegalArgumentException(("both minLines " + i4 + " and maxLines " + i5 + " must be greater than zero").toString());
        }
        if (i4 <= i5) {
            return;
        }
        throw new IllegalArgumentException(("minLines " + i4 + " must be less than or equal to maxLines " + i5).toString());
    }
}
