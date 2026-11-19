package androidx.compose.foundation.text.input.internal;

import androidx.autofill.HintConstants;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.TextDelegateKt;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.layout.AlignmentLine;
import androidx.compose.p013ui.layout.AlignmentLineKt;
import androidx.compose.p013ui.layout.LayoutCoordinates;
import androidx.compose.p013ui.layout.Measurable;
import androidx.compose.p013ui.layout.MeasureResult;
import androidx.compose.p013ui.layout.MeasureScope;
import androidx.compose.p013ui.layout.Placeable;
import androidx.compose.p013ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.p013ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.p013ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.p013ui.node.LayoutModifierNode;
import androidx.compose.p013ui.platform.CompositionLocalsKt;
import androidx.compose.p013ui.text.TextLayoutResult;
import androidx.compose.p013ui.text.TextStyle;
import androidx.compose.p013ui.text.font.FontFamily;
import androidx.compose.p013ui.unit.C3127Dp;
import androidx.compose.p013ui.unit.Constraints;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004Be\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u00126\u0010\r\u001a2\u0012\u0004\u0012\u00020\u000f\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u000e¢\u0006\u0002\b\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018¢\u0006\u0002\u0010\u0019J\u0010\u0010 \u001a\u00020\u00152\u0006\u0010!\u001a\u00020\"H\u0016Jf\u0010#\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f26\u0010\r\u001a2\u0012\u0004\u0012\u00020\u000f\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u000e¢\u0006\u0002\b\u00162\u0006\u0010\u0017\u001a\u00020\u0018J&\u0010$\u001a\u00020%*\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0016ø\u0001\u0000¢\u0006\u0004\b+\u0010,R\"\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001bX\u0082\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u001e\u0010\u001fR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006-"}, m13558d2 = {"Landroidx/compose/foundation/text/input/internal/TextFieldTextLayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/node/GlobalPositionAwareModifierNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "textLayoutState", "Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "textFieldState", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "singleLine", "", "onTextLayout", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Density;", "Lkotlin/Function0;", "Landroidx/compose/ui/text/TextLayoutResult;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "getResult", "", "Lkotlin/ExtensionFunctionType;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "(Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/ui/text/TextStyle;ZLkotlin/jvm/functions/Function2;Landroidx/compose/foundation/text/KeyboardOptions;)V", "baselineCache", "", "Landroidx/compose/ui/layout/AlignmentLine;", "", "getBaselineCache$annotations", "()V", "onGloballyPositioned", "coordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "updateNode", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "foundation_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nTextFieldTextLayoutModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldTextLayoutModifier.kt\nandroidx/compose/foundation/text/input/internal/TextFieldTextLayoutModifierNode\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,183:1\n54#2:184\n54#2:186\n59#2:188\n59#2:190\n54#2:195\n59#2:197\n85#3:185\n85#3:187\n90#3:189\n90#3:191\n85#3:196\n90#3:198\n113#4:192\n26#5:193\n26#5:194\n*S KotlinDebug\n*F\n+ 1 TextFieldTextLayoutModifier.kt\nandroidx/compose/foundation/text/input/internal/TextFieldTextLayoutModifierNode\n*L\n151#1:184\n152#1:186\n153#1:188\n154#1:190\n175#1:195\n176#1:197\n151#1:185\n152#1:187\n153#1:189\n154#1:191\n175#1:196\n176#1:198\n166#1:192\n170#1:193\n171#1:194\n*E\n"})
/* loaded from: classes.dex */
public final class TextFieldTextLayoutModifierNode extends Modifier.Node implements LayoutModifierNode, GlobalPositionAwareModifierNode, CompositionLocalConsumerModifierNode {
    public static final int $stable = 8;
    private Map<AlignmentLine, Integer> baselineCache;
    private boolean singleLine;
    private TextLayoutState textLayoutState;

    public TextFieldTextLayoutModifierNode(TextLayoutState textLayoutState, TransformedTextFieldState transformedTextFieldState, TextStyle textStyle, boolean z9, Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function2, KeyboardOptions keyboardOptions) {
        this.textLayoutState = textLayoutState;
        this.singleLine = z9;
        textLayoutState.setOnTextLayout(function2);
        TextLayoutState textLayoutState2 = this.textLayoutState;
        boolean z10 = this.singleLine;
        textLayoutState2.updateNonMeasureInputs(transformedTextFieldState, textStyle, z10, !z10, keyboardOptions);
    }

    private static /* synthetic */ void getBaselineCache$annotations() {
    }

    @Override // androidx.compose.p013ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo17016measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j10) {
        TextLayoutResult textLayoutResultM18257layoutWithNewMeasureInputshBUhpc = this.textLayoutState.m18257layoutWithNewMeasureInputshBUhpc(measureScope, measureScope.getLayoutDirection(), (FontFamily.Resolver) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalFontFamilyResolver()), j10);
        final Placeable placeableMo22324measureBRTryo0 = measurable.mo22324measureBRTryo0(Constraints.INSTANCE.m23523fitPrioritizingWidthZbe2FdA((int) (textLayoutResultM18257layoutWithNewMeasureInputshBUhpc.getSize() >> 32), (int) (textLayoutResultM18257layoutWithNewMeasureInputshBUhpc.getSize() >> 32), (int) (textLayoutResultM18257layoutWithNewMeasureInputshBUhpc.getSize() & 4294967295L), (int) (textLayoutResultM18257layoutWithNewMeasureInputshBUhpc.getSize() & 4294967295L)));
        this.textLayoutState.m18258setMinHeightForSingleLineField0680j_4(this.singleLine ? measureScope.mo17329toDpu2uoSUM(TextDelegateKt.ceilToIntPx(textLayoutResultM18257layoutWithNewMeasureInputshBUhpc.getLineBottom(0))) : C3127Dp.m23561constructorimpl(0));
        Map<AlignmentLine, Integer> linkedHashMap = this.baselineCache;
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap<>(2);
        }
        linkedHashMap.put(AlignmentLineKt.getFirstBaseline(), Integer.valueOf(Math.round(textLayoutResultM18257layoutWithNewMeasureInputshBUhpc.getFirstBaseline())));
        linkedHashMap.put(AlignmentLineKt.getLastBaseline(), Integer.valueOf(Math.round(textLayoutResultM18257layoutWithNewMeasureInputshBUhpc.getLastBaseline())));
        this.baselineCache = linkedHashMap;
        int size = (int) (textLayoutResultM18257layoutWithNewMeasureInputshBUhpc.getSize() >> 32);
        int size2 = (int) (textLayoutResultM18257layoutWithNewMeasureInputshBUhpc.getSize() & 4294967295L);
        Map<AlignmentLine, Integer> map = this.baselineCache;
        Intrinsics.checkNotNull(map);
        return measureScope.layout(size, size2, map, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldTextLayoutModifierNode$measure$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope.place$default(placementScope, placeableMo22324measureBRTryo0, 0, 0, 0.0f, 4, null);
            }
        });
    }

    @Override // androidx.compose.p013ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(LayoutCoordinates coordinates) {
        this.textLayoutState.setTextLayoutNodeCoordinates(coordinates);
    }

    public final void updateNode(TextLayoutState textLayoutState, TransformedTextFieldState textFieldState, TextStyle textStyle, boolean singleLine, Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> onTextLayout, KeyboardOptions keyboardOptions) {
        this.textLayoutState = textLayoutState;
        textLayoutState.setOnTextLayout(onTextLayout);
        this.singleLine = singleLine;
        this.textLayoutState.updateNonMeasureInputs(textFieldState, textStyle, singleLine, !singleLine, keyboardOptions);
    }
}
