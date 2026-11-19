package androidx.compose.foundation.text.input.internal;

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
import androidx.compose.p013ui.unit.C3156Dp;
import androidx.compose.p013ui.unit.Constraints;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class TextFieldTextLayoutModifierNode extends Modifier.Node implements LayoutModifierNode, GlobalPositionAwareModifierNode, CompositionLocalConsumerModifierNode {
    public static final int $stable = 8;
    private Map<AlignmentLine, Integer> baselineCache;
    private boolean singleLine;
    private TextLayoutState textLayoutState;

    public TextFieldTextLayoutModifierNode(TextLayoutState textLayoutState, TransformedTextFieldState transformedTextFieldState, TextStyle textStyle, boolean z10, InterfaceC10574p interfaceC10574p, KeyboardOptions keyboardOptions) {
        this.textLayoutState = textLayoutState;
        this.singleLine = z10;
        textLayoutState.setOnTextLayout(interfaceC10574p);
        TextLayoutState textLayoutState2 = this.textLayoutState;
        boolean z11 = this.singleLine;
        textLayoutState2.updateNonMeasureInputs(transformedTextFieldState, textStyle, z11, !z11, keyboardOptions);
    }

    private static /* synthetic */ void getBaselineCache$annotations() {
    }

    @Override // androidx.compose.p013ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo20167measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j10) {
        TextLayoutResult textLayoutResultM21468layoutWithNewMeasureInputshBUhpc = this.textLayoutState.m21468layoutWithNewMeasureInputshBUhpc(measureScope, measureScope.getLayoutDirection(), (FontFamily.Resolver) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalFontFamilyResolver()), j10);
        final Placeable placeableMo25627measureBRTryo0 = measurable.mo25627measureBRTryo0(Constraints.Companion.m26861fitPrioritizingWidthZbe2FdA((int) (textLayoutResultM21468layoutWithNewMeasureInputshBUhpc.m26335getSizeYbymL2g() >> 32), (int) (textLayoutResultM21468layoutWithNewMeasureInputshBUhpc.m26335getSizeYbymL2g() >> 32), (int) (textLayoutResultM21468layoutWithNewMeasureInputshBUhpc.m26335getSizeYbymL2g() & 4294967295L), (int) (textLayoutResultM21468layoutWithNewMeasureInputshBUhpc.m26335getSizeYbymL2g() & 4294967295L)));
        this.textLayoutState.m21469setMinHeightForSingleLineField0680j_4(this.singleLine ? measureScope.mo20494toDpu2uoSUM(TextDelegateKt.ceilToIntPx(textLayoutResultM21468layoutWithNewMeasureInputshBUhpc.getLineBottom(0))) : C3156Dp.m26899constructorimpl(0));
        Map<AlignmentLine, Integer> linkedHashMap = this.baselineCache;
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap<>(2);
        }
        linkedHashMap.put(AlignmentLineKt.getFirstBaseline(), Integer.valueOf(Math.round(textLayoutResultM21468layoutWithNewMeasureInputshBUhpc.getFirstBaseline())));
        linkedHashMap.put(AlignmentLineKt.getLastBaseline(), Integer.valueOf(Math.round(textLayoutResultM21468layoutWithNewMeasureInputshBUhpc.getLastBaseline())));
        this.baselineCache = linkedHashMap;
        int iM26335getSizeYbymL2g = (int) (textLayoutResultM21468layoutWithNewMeasureInputshBUhpc.m26335getSizeYbymL2g() >> 32);
        int iM26335getSizeYbymL2g2 = (int) (textLayoutResultM21468layoutWithNewMeasureInputshBUhpc.m26335getSizeYbymL2g() & 4294967295L);
        Map<AlignmentLine, Integer> map = this.baselineCache;
        AbstractC9133u.m16130d(map);
        return measureScope.layout(iM26335getSizeYbymL2g, iM26335getSizeYbymL2g2, map, new InterfaceC10570l() { // from class: androidx.compose.foundation.text.input.internal.TextFieldTextLayoutModifierNode$measure$1
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return C8736p.f16368a;
            }

            public final void invoke(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope.place$default(placementScope, placeableMo25627measureBRTryo0, 0, 0, 0.0f, 4, null);
            }
        });
    }

    @Override // androidx.compose.p013ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(LayoutCoordinates layoutCoordinates) {
        this.textLayoutState.setTextLayoutNodeCoordinates(layoutCoordinates);
    }

    public final void updateNode(TextLayoutState textLayoutState, TransformedTextFieldState transformedTextFieldState, TextStyle textStyle, boolean z10, InterfaceC10574p interfaceC10574p, KeyboardOptions keyboardOptions) {
        this.textLayoutState = textLayoutState;
        textLayoutState.setOnTextLayout(interfaceC10574p);
        this.singleLine = z10;
        this.textLayoutState.updateNonMeasureInputs(transformedTextFieldState, textStyle, z10, !z10, keyboardOptions);
    }
}
