package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.TextDelegateKt;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.layout.AlignmentLine;
import androidx.compose.p014ui.layout.AlignmentLineKt;
import androidx.compose.p014ui.layout.LayoutCoordinates;
import androidx.compose.p014ui.layout.Measurable;
import androidx.compose.p014ui.layout.MeasureResult;
import androidx.compose.p014ui.layout.MeasureScope;
import androidx.compose.p014ui.layout.Placeable;
import androidx.compose.p014ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.p014ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.p014ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.p014ui.node.LayoutModifierNode;
import androidx.compose.p014ui.platform.CompositionLocalsKt;
import androidx.compose.p014ui.text.TextLayoutResult;
import androidx.compose.p014ui.text.TextStyle;
import androidx.compose.p014ui.text.font.FontFamily;
import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.p014ui.unit.Constraints;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class TextFieldTextLayoutModifierNode extends Modifier.Node implements LayoutModifierNode, GlobalPositionAwareModifierNode, CompositionLocalConsumerModifierNode {
    public static final int $stable = 8;
    private Map<AlignmentLine, Integer> baselineCache;
    private boolean singleLine;
    private TextLayoutState textLayoutState;

    public TextFieldTextLayoutModifierNode(TextLayoutState textLayoutState, TransformedTextFieldState transformedTextFieldState, TextStyle textStyle, boolean z10, InterfaceC9544p interfaceC9544p, KeyboardOptions keyboardOptions) {
        this.textLayoutState = textLayoutState;
        this.singleLine = z10;
        textLayoutState.setOnTextLayout(interfaceC9544p);
        TextLayoutState textLayoutState2 = this.textLayoutState;
        boolean z11 = this.singleLine;
        textLayoutState2.updateNonMeasureInputs(transformedTextFieldState, textStyle, z11, !z11, keyboardOptions);
    }

    private static /* synthetic */ void getBaselineCache$annotations() {
    }

    @Override // androidx.compose.p014ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo26769measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j10) {
        TextLayoutResult textLayoutResultM28070layoutWithNewMeasureInputshBUhpc = this.textLayoutState.m28070layoutWithNewMeasureInputshBUhpc(measureScope, measureScope.getLayoutDirection(), (FontFamily.Resolver) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalFontFamilyResolver()), j10);
        final Placeable placeableMo32229measureBRTryo0 = measurable.mo32229measureBRTryo0(Constraints.Companion.m33463fitPrioritizingWidthZbe2FdA((int) (textLayoutResultM28070layoutWithNewMeasureInputshBUhpc.m32937getSizeYbymL2g() >> 32), (int) (textLayoutResultM28070layoutWithNewMeasureInputshBUhpc.m32937getSizeYbymL2g() >> 32), (int) (textLayoutResultM28070layoutWithNewMeasureInputshBUhpc.m32937getSizeYbymL2g() & 4294967295L), (int) (textLayoutResultM28070layoutWithNewMeasureInputshBUhpc.m32937getSizeYbymL2g() & 4294967295L)));
        this.textLayoutState.m28071setMinHeightForSingleLineField0680j_4(this.singleLine ? measureScope.mo27096toDpu2uoSUM(TextDelegateKt.ceilToIntPx(textLayoutResultM28070layoutWithNewMeasureInputshBUhpc.getLineBottom(0))) : C3186Dp.m33501constructorimpl(0));
        Map<AlignmentLine, Integer> linkedHashMap = this.baselineCache;
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap<>(2);
        }
        linkedHashMap.put(AlignmentLineKt.getFirstBaseline(), Integer.valueOf(Math.round(textLayoutResultM28070layoutWithNewMeasureInputshBUhpc.getFirstBaseline())));
        linkedHashMap.put(AlignmentLineKt.getLastBaseline(), Integer.valueOf(Math.round(textLayoutResultM28070layoutWithNewMeasureInputshBUhpc.getLastBaseline())));
        this.baselineCache = linkedHashMap;
        int iM32937getSizeYbymL2g = (int) (textLayoutResultM28070layoutWithNewMeasureInputshBUhpc.m32937getSizeYbymL2g() >> 32);
        int iM32937getSizeYbymL2g2 = (int) (textLayoutResultM28070layoutWithNewMeasureInputshBUhpc.m32937getSizeYbymL2g() & 4294967295L);
        Map<AlignmentLine, Integer> map = this.baselineCache;
        AbstractC9979u.m20291d(map);
        return measureScope.layout(iM32937getSizeYbymL2g, iM32937getSizeYbymL2g2, map, new InterfaceC9540l() { // from class: androidx.compose.foundation.text.input.internal.TextFieldTextLayoutModifierNode$measure$1
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return C10786q.f26013a;
            }

            public final void invoke(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope.place$default(placementScope, placeableMo32229measureBRTryo0, 0, 0, 0.0f, 4, null);
            }
        });
    }

    @Override // androidx.compose.p014ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(LayoutCoordinates layoutCoordinates) {
        this.textLayoutState.setTextLayoutNodeCoordinates(layoutCoordinates);
    }

    public final void updateNode(TextLayoutState textLayoutState, TransformedTextFieldState transformedTextFieldState, TextStyle textStyle, boolean z10, InterfaceC9544p interfaceC9544p, KeyboardOptions keyboardOptions) {
        this.textLayoutState = textLayoutState;
        textLayoutState.setOnTextLayout(interfaceC9544p);
        this.singleLine = z10;
        this.textLayoutState.updateNonMeasureInputs(transformedTextFieldState, textStyle, z10, !z10, keyboardOptions);
    }
}
