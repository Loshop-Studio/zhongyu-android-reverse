package androidx.compose.foundation.lazy.layout;

import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.p013ui.layout.AlignmentLine;
import androidx.compose.p013ui.layout.Measurable;
import androidx.compose.p013ui.layout.MeasureResult;
import androidx.compose.p013ui.layout.MeasureScope;
import androidx.compose.p013ui.layout.Placeable;
import androidx.compose.p013ui.layout.SubcomposeMeasureScope;
import androidx.compose.p013ui.unit.DpRect;
import androidx.compose.p013ui.unit.LayoutDirection;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p300x7.InterfaceC10570l;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class LazyLayoutMeasureScopeImpl implements LazyLayoutMeasureScope, MeasureScope {
    public static final int $stable = 0;
    private final LazyLayoutItemContentFactory itemContentFactory;
    private final LazyLayoutItemProvider itemProvider;
    private final MutableIntObjectMap<List<Placeable>> placeablesCache = IntObjectMapKt.mutableIntObjectMapOf();
    private final SubcomposeMeasureScope subcomposeMeasureScope;

    public LazyLayoutMeasureScopeImpl(LazyLayoutItemContentFactory lazyLayoutItemContentFactory, SubcomposeMeasureScope subcomposeMeasureScope) {
        this.itemContentFactory = lazyLayoutItemContentFactory;
        this.subcomposeMeasureScope = subcomposeMeasureScope;
        this.itemProvider = (LazyLayoutItemProvider) lazyLayoutItemContentFactory.getItemProvider().invoke();
    }

    @Override // androidx.compose.p013ui.unit.Density
    public float getDensity() {
        return this.subcomposeMeasureScope.getDensity();
    }

    @Override // androidx.compose.p013ui.unit.FontScaling
    public float getFontScale() {
        return this.subcomposeMeasureScope.getFontScale();
    }

    @Override // androidx.compose.p013ui.layout.IntrinsicMeasureScope
    public LayoutDirection getLayoutDirection() {
        return this.subcomposeMeasureScope.getLayoutDirection();
    }

    @Override // androidx.compose.p013ui.layout.IntrinsicMeasureScope
    public boolean isLookingAhead() {
        return this.subcomposeMeasureScope.isLookingAhead();
    }

    @Override // androidx.compose.p013ui.layout.MeasureScope
    public MeasureResult layout(int i10, int i11, Map<AlignmentLine, Integer> map, InterfaceC10570l interfaceC10570l) {
        return this.subcomposeMeasureScope.layout(i10, i11, map, interfaceC10570l);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope
    /* renamed from: measure-0kLqBqw */
    public List<Placeable> mo21032measure0kLqBqw(int i10, long j10) {
        List<Placeable> list = this.placeablesCache.get(i10);
        if (list != null) {
            return list;
        }
        Object key = this.itemProvider.getKey(i10);
        List<Measurable> listSubcompose = this.subcomposeMeasureScope.subcompose(key, this.itemContentFactory.getContent(i10, key, this.itemProvider.getContentType(i10)));
        int size = listSubcompose.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(listSubcompose.get(i11).mo25627measureBRTryo0(j10));
        }
        this.placeablesCache.set(i10, arrayList);
        return arrayList;
    }

    @Override // androidx.compose.p013ui.unit.Density
    @Stable
    /* renamed from: roundToPx--R2X_6o */
    public int mo20490roundToPxR2X_6o(long j10) {
        return this.subcomposeMeasureScope.mo20490roundToPxR2X_6o(j10);
    }

    @Override // androidx.compose.p013ui.unit.Density
    @Stable
    /* renamed from: roundToPx-0680j_4 */
    public int mo20491roundToPx0680j_4(float f10) {
        return this.subcomposeMeasureScope.mo20491roundToPx0680j_4(f10);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.p013ui.unit.FontScaling
    /* renamed from: toDp-GaN1DYA */
    public float mo20492toDpGaN1DYA(long j10) {
        return this.subcomposeMeasureScope.mo20492toDpGaN1DYA(j10);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.p013ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public float mo20494toDpu2uoSUM(int i10) {
        return this.subcomposeMeasureScope.mo20494toDpu2uoSUM(i10);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.p013ui.unit.Density
    /* renamed from: toDpSize-k-rfVVM */
    public long mo20495toDpSizekrfVVM(long j10) {
        return this.subcomposeMeasureScope.mo20495toDpSizekrfVVM(j10);
    }

    @Override // androidx.compose.p013ui.unit.Density
    @Stable
    /* renamed from: toPx--R2X_6o */
    public float mo20496toPxR2X_6o(long j10) {
        return this.subcomposeMeasureScope.mo20496toPxR2X_6o(j10);
    }

    @Override // androidx.compose.p013ui.unit.Density
    @Stable
    /* renamed from: toPx-0680j_4 */
    public float mo20497toPx0680j_4(float f10) {
        return this.subcomposeMeasureScope.mo20497toPx0680j_4(f10);
    }

    @Override // androidx.compose.p013ui.unit.Density
    @Stable
    public Rect toRect(DpRect dpRect) {
        return this.subcomposeMeasureScope.toRect(dpRect);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.p013ui.unit.Density
    /* renamed from: toSize-XkaWNTQ */
    public long mo20498toSizeXkaWNTQ(long j10) {
        return this.subcomposeMeasureScope.mo20498toSizeXkaWNTQ(j10);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.p013ui.unit.FontScaling
    /* renamed from: toSp-0xMU5do */
    public long mo20499toSp0xMU5do(float f10) {
        return this.subcomposeMeasureScope.mo20499toSp0xMU5do(f10);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.p013ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    public long mo20500toSpkPz2Gy4(float f10) {
        return this.subcomposeMeasureScope.mo20500toSpkPz2Gy4(f10);
    }

    @Override // androidx.compose.p013ui.layout.MeasureScope
    public MeasureResult layout(int i10, int i11, Map<AlignmentLine, Integer> map, InterfaceC10570l interfaceC10570l, InterfaceC10570l interfaceC10570l2) {
        return this.subcomposeMeasureScope.layout(i10, i11, map, interfaceC10570l, interfaceC10570l2);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.p013ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public float mo20493toDpu2uoSUM(float f10) {
        return this.subcomposeMeasureScope.mo20493toDpu2uoSUM(f10);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.p013ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    public long mo20501toSpkPz2Gy4(int i10) {
        return this.subcomposeMeasureScope.mo20501toSpkPz2Gy4(i10);
    }
}
