package androidx.compose.foundation.text.input.internal;

import androidx.autofill.HintConstants;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.TextDelegateKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.AlignmentLine;
import androidx.compose.p011ui.layout.AlignmentLineKt;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.p011ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.p011ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.p011ui.node.LayoutModifierNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.unit.C2331Dp;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004Bg\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u00126\u0010\u0016\u001a2\u0012\u0004\u0012\u00020\u000e\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\r¢\u0006\u0002\b\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJm\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b26\u0010\u0016\u001a2\u0012\u0004\u0012\u00020\u000e\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\r¢\u0006\u0002\b\u00152\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001b\u0010\u001aJ\u0017\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ&\u0010(\u001a\u00020%*\u00020 2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#H\u0016ø\u0001\u0000¢\u0006\u0004\b&\u0010'R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010)R\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010*R*\u0010.\u001a\u0010\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020-\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b.\u0010/\u0012\u0004\b0\u00101\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00062"}, m5110d2 = {"Landroidx/compose/foundation/text/input/internal/TextFieldTextLayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/node/GlobalPositionAwareModifierNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "textLayoutState", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "textFieldState", "Landroidx/compose/ui/text/TextStyle;", "textStyle", "", "singleLine", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Density;", "Lkotlin/Function0;", "Landroidx/compose/ui/text/TextLayoutResult;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "getResult", "Ld6/s;", "Lkotlin/ExtensionFunctionType;", "onTextLayout", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardOptions", "<init>", "(Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/ui/text/TextStyle;ZLr6/e;Landroidx/compose/foundation/text/KeyboardOptions;)V", "updateNode", "Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "onGloballyPositioned", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "Z", "", "Landroidx/compose/ui/layout/AlignmentLine;", "", "baselineCache", "Ljava/util/Map;", "getBaselineCache$annotations", "()V", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nTextFieldTextLayoutModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldTextLayoutModifier.kt\nandroidx/compose/foundation/text/input/internal/TextFieldTextLayoutModifierNode\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,183:1\n54#2:184\n54#2:186\n59#2:188\n59#2:190\n54#2:195\n59#2:197\n85#3:185\n85#3:187\n90#3:189\n90#3:191\n85#3:196\n90#3:198\n113#4:192\n26#5:193\n26#5:194\n*S KotlinDebug\n*F\n+ 1 TextFieldTextLayoutModifier.kt\nandroidx/compose/foundation/text/input/internal/TextFieldTextLayoutModifierNode\n*L\n151#1:184\n152#1:186\n153#1:188\n154#1:190\n175#1:195\n176#1:197\n151#1:185\n152#1:187\n153#1:189\n154#1:191\n175#1:196\n176#1:198\n166#1:192\n170#1:193\n171#1:194\n*E\n"})
/* loaded from: classes.dex */
public final class TextFieldTextLayoutModifierNode extends Modifier.Node implements LayoutModifierNode, GlobalPositionAwareModifierNode, CompositionLocalConsumerModifierNode {
    public static final int $stable = 8;

    @Nullable
    private Map<AlignmentLine, Integer> baselineCache;
    private boolean singleLine;

    @NotNull
    private TextLayoutState textLayoutState;

    public TextFieldTextLayoutModifierNode(@NotNull TextLayoutState textLayoutState, @NotNull TransformedTextFieldState transformedTextFieldState, @NotNull TextStyle textStyle, boolean z8, @Nullable InterfaceC6473e interfaceC6473e, @NotNull KeyboardOptions keyboardOptions) {
        this.textLayoutState = textLayoutState;
        this.singleLine = z8;
        textLayoutState.setOnTextLayout(interfaceC6473e);
        TextLayoutState textLayoutState2 = this.textLayoutState;
        boolean z9 = this.singleLine;
        textLayoutState2.updateNonMeasureInputs(transformedTextFieldState, textStyle, z9, !z9, keyboardOptions);
    }

    private static /* synthetic */ void getBaselineCache$annotations() {
    }

    @Override // androidx.compose.p011ui.node.LayoutModifierNode
    @NotNull
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo6573measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull Measurable measurable, long j7) {
        TextLayoutResult textLayoutResultM7874layoutWithNewMeasureInputshBUhpc = this.textLayoutState.m7874layoutWithNewMeasureInputshBUhpc(measureScope, measureScope.getLayoutDirection(), (FontFamily.Resolver) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalFontFamilyResolver()), j7);
        final Placeable placeableMo12033measureBRTryo0 = measurable.mo12033measureBRTryo0(Constraints.INSTANCE.m13267fitPrioritizingWidthZbe2FdA((int) (textLayoutResultM7874layoutWithNewMeasureInputshBUhpc.getSize() >> 32), (int) (textLayoutResultM7874layoutWithNewMeasureInputshBUhpc.getSize() >> 32), (int) (textLayoutResultM7874layoutWithNewMeasureInputshBUhpc.getSize() & 4294967295L), (int) (textLayoutResultM7874layoutWithNewMeasureInputshBUhpc.getSize() & 4294967295L)));
        this.textLayoutState.m7875setMinHeightForSingleLineField0680j_4(this.singleLine ? measureScope.mo6900toDpu2uoSUM(TextDelegateKt.ceilToIntPx(textLayoutResultM7874layoutWithNewMeasureInputshBUhpc.getLineBottom(0))) : C2331Dp.m13305constructorimpl(0));
        Map<AlignmentLine, Integer> linkedHashMap = this.baselineCache;
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap<>(2);
        }
        linkedHashMap.put(AlignmentLineKt.getFirstBaseline(), Integer.valueOf(Math.round(textLayoutResultM7874layoutWithNewMeasureInputshBUhpc.getFirstBaseline())));
        linkedHashMap.put(AlignmentLineKt.getLastBaseline(), Integer.valueOf(Math.round(textLayoutResultM7874layoutWithNewMeasureInputshBUhpc.getLastBaseline())));
        this.baselineCache = linkedHashMap;
        int size = (int) (textLayoutResultM7874layoutWithNewMeasureInputshBUhpc.getSize() >> 32);
        int size2 = (int) (textLayoutResultM7874layoutWithNewMeasureInputshBUhpc.getSize() & 4294967295L);
        Map<AlignmentLine, Integer> map = this.baselineCache;
        AbstractC5830k.m5327d(map);
        return measureScope.layout(size, size2, map, new InterfaceC6471c() { // from class: androidx.compose.foundation.text.input.internal.TextFieldTextLayoutModifierNode$measure$1
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return C5443s.f8405a;
            }

            public final void invoke(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope.place$default(placementScope, placeableMo12033measureBRTryo0, 0, 0, 0.0f, 4, null);
            }
        });
    }

    @Override // androidx.compose.p011ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(@NotNull LayoutCoordinates coordinates) {
        this.textLayoutState.setTextLayoutNodeCoordinates(coordinates);
    }

    public final void updateNode(@NotNull TextLayoutState textLayoutState, @NotNull TransformedTextFieldState textFieldState, @NotNull TextStyle textStyle, boolean singleLine, @Nullable InterfaceC6473e onTextLayout, @NotNull KeyboardOptions keyboardOptions) {
        this.textLayoutState = textLayoutState;
        textLayoutState.setOnTextLayout(onTextLayout);
        this.singleLine = singleLine;
        this.textLayoutState.updateNonMeasureInputs(textFieldState, textStyle, singleLine, !singleLine, keyboardOptions);
    }
}
