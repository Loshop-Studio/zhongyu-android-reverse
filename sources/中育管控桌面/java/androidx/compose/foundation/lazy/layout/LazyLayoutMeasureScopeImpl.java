package androidx.compose.foundation.lazy.layout;

import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.p009ui.geometry.Rect;
import androidx.compose.p009ui.layout.AlignmentLine;
import androidx.compose.p009ui.layout.Measurable;
import androidx.compose.p009ui.layout.MeasureResult;
import androidx.compose.p009ui.layout.MeasureScope;
import androidx.compose.p009ui.layout.Placeable;
import androidx.compose.p009ui.layout.RulerScope;
import androidx.compose.p009ui.layout.SubcomposeMeasureScope;
import androidx.compose.p009ui.unit.DpRect;
import androidx.compose.p009ui.unit.LayoutDirection;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 1)
@Metadata(m7879d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007Je\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0014\b\u0002\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u001e0!2\u001b\b\u0002\u0010#\u001a\u0015\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&\u0018\u00010$¢\u0006\u0002\b'2\u0017\u0010(\u001a\u0013\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020&0$¢\u0006\u0002\b'H\u0096\u0001JH\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0014\b\u0002\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u001e0!2\u0017\u0010(\u001a\u0013\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020&0$¢\u0006\u0002\b'H\u0096\u0001J(\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010+\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020-H\u0016ø\u0001\u0000¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\u001e*\u000201H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b2\u00103J\u0017\u00100\u001a\u00020\u001e*\u000204H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b5\u00106J\u0016\u00107\u001a\u000201*\u000204H\u0016ø\u0001\u0000¢\u0006\u0004\b8\u00109J\u0019\u00107\u001a\u000201*\u00020\tH\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b:\u0010;J\u0019\u00107\u001a\u000201*\u00020\u001eH\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b:\u0010<J\u0016\u0010=\u001a\u00020>*\u00020?H\u0016ø\u0001\u0000¢\u0006\u0004\b@\u0010AJ\u0017\u0010B\u001a\u00020\t*\u000201H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\bC\u0010;J\u0017\u0010B\u001a\u00020\t*\u000204H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\bD\u00109J\r\u0010E\u001a\u00020F*\u00020GH\u0097\u0001J\u0016\u0010H\u001a\u00020?*\u00020>H\u0016ø\u0001\u0000¢\u0006\u0004\bI\u0010AJ\u0016\u0010J\u001a\u000204*\u000201H\u0016ø\u0001\u0000¢\u0006\u0004\bK\u0010LJ\u0019\u0010J\u001a\u000204*\u00020\tH\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bM\u0010LJ\u0019\u0010J\u001a\u000204*\u00020\u001eH\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bM\u0010NR\u0014\u0010\b\u001a\u00020\t8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u000f8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0013\u001a\u00020\u0014X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006O"}, m7880d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScopeImpl;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "Landroidx/compose/ui/layout/MeasureScope;", "itemContentFactory", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;", "subcomposeMeasureScope", "Landroidx/compose/ui/layout/SubcomposeMeasureScope;", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;Landroidx/compose/ui/layout/SubcomposeMeasureScope;)V", "density", "", "getDensity", "()F", "fontScale", "getFontScale", "isLookingAhead", "", "()Z", "itemProvider", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "placeablesCache", "Landroidx/collection/MutableIntObjectMap;", "", "Landroidx/compose/ui/layout/Placeable;", "layout", "Landroidx/compose/ui/layout/MeasureResult;", "width", "", "height", "alignmentLines", "", "Landroidx/compose/ui/layout/AlignmentLine;", "rulers", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/RulerScope;", "", "Lkotlin/ExtensionFunctionType;", "placementBlock", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "measure", "index", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-0kLqBqw", "(IJ)Ljava/util/List;", "roundToPx", "Landroidx/compose/ui/unit/Dp;", "roundToPx-0680j_4", "(F)I", "Landroidx/compose/ui/unit/TextUnit;", "roundToPx--R2X_6o", "(J)I", "toDp", "toDp-GaN1DYA", "(J)F", "toDp-u2uoSUM", "(F)F", "(I)F", "toDpSize", "Landroidx/compose/ui/unit/DpSize;", "Landroidx/compose/ui/geometry/Size;", "toDpSize-k-rfVVM", "(J)J", "toPx", "toPx-0680j_4", "toPx--R2X_6o", "toRect", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/unit/DpRect;", "toSize", "toSize-XkaWNTQ", "toSp", "toSp-0xMU5do", "(F)J", "toSp-kPz2Gy4", "(I)J", "foundation_release"}, m7881k = 1, m7882mv = {1, 9, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nLazyLayoutMeasureScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutMeasureScope.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScopeImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,147:1\n1#2:148\n*E\n"})
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
        this.itemProvider = lazyLayoutItemContentFactory.getItemProvider().invoke();
    }

    @Override // androidx.compose.p009ui.unit.Density
    public float getDensity() {
        return this.subcomposeMeasureScope.getDensity();
    }

    @Override // androidx.compose.p009ui.unit.FontScaling
    public float getFontScale() {
        return this.subcomposeMeasureScope.getFontScale();
    }

    @Override // androidx.compose.p009ui.layout.IntrinsicMeasureScope
    public LayoutDirection getLayoutDirection() {
        return this.subcomposeMeasureScope.getLayoutDirection();
    }

    @Override // androidx.compose.p009ui.layout.IntrinsicMeasureScope
    public boolean isLookingAhead() {
        return this.subcomposeMeasureScope.isLookingAhead();
    }

    @Override // androidx.compose.p009ui.layout.MeasureScope
    public MeasureResult layout(int width, int height, Map<AlignmentLine, Integer> alignmentLines, Function1<? super Placeable.PlacementScope, Unit> placementBlock) {
        return this.subcomposeMeasureScope.layout(width, height, alignmentLines, placementBlock);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope
    /* renamed from: measure-0kLqBqw */
    public List<Placeable> mo10778measure0kLqBqw(int index, long constraints) {
        List<Placeable> list = this.placeablesCache.get(index);
        if (list != null) {
            return list;
        }
        Object key = this.itemProvider.getKey(index);
        List<Measurable> listSubcompose = this.subcomposeMeasureScope.subcompose(key, this.itemContentFactory.getContent(index, key, this.itemProvider.getContentType(index)));
        int size = listSubcompose.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i6 = 0; i6 < size; i6++) {
            arrayList.add(listSubcompose.get(i6).mo15247measureBRTryo0(constraints));
        }
        this.placeablesCache.set(index, arrayList);
        return arrayList;
    }

    @Override // androidx.compose.p009ui.unit.Density
    @Stable
    /* renamed from: roundToPx--R2X_6o */
    public int mo10248roundToPxR2X_6o(long j6) {
        return this.subcomposeMeasureScope.mo10248roundToPxR2X_6o(j6);
    }

    @Override // androidx.compose.p009ui.unit.Density
    @Stable
    /* renamed from: roundToPx-0680j_4 */
    public int mo10249roundToPx0680j_4(float f6) {
        return this.subcomposeMeasureScope.mo10249roundToPx0680j_4(f6);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.p009ui.unit.FontScaling
    /* renamed from: toDp-GaN1DYA */
    public float mo10250toDpGaN1DYA(long j6) {
        return this.subcomposeMeasureScope.mo10250toDpGaN1DYA(j6);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.p009ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public float mo10252toDpu2uoSUM(int i6) {
        return this.subcomposeMeasureScope.mo10252toDpu2uoSUM(i6);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.p009ui.unit.Density
    /* renamed from: toDpSize-k-rfVVM */
    public long mo10253toDpSizekrfVVM(long j6) {
        return this.subcomposeMeasureScope.mo10253toDpSizekrfVVM(j6);
    }

    @Override // androidx.compose.p009ui.unit.Density
    @Stable
    /* renamed from: toPx--R2X_6o */
    public float mo10254toPxR2X_6o(long j6) {
        return this.subcomposeMeasureScope.mo10254toPxR2X_6o(j6);
    }

    @Override // androidx.compose.p009ui.unit.Density
    @Stable
    /* renamed from: toPx-0680j_4 */
    public float mo10255toPx0680j_4(float f6) {
        return this.subcomposeMeasureScope.mo10255toPx0680j_4(f6);
    }

    @Override // androidx.compose.p009ui.unit.Density
    @Stable
    public Rect toRect(DpRect dpRect) {
        return this.subcomposeMeasureScope.toRect(dpRect);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.p009ui.unit.Density
    /* renamed from: toSize-XkaWNTQ */
    public long mo10256toSizeXkaWNTQ(long j6) {
        return this.subcomposeMeasureScope.mo10256toSizeXkaWNTQ(j6);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.p009ui.unit.FontScaling
    /* renamed from: toSp-0xMU5do */
    public long mo10257toSp0xMU5do(float f6) {
        return this.subcomposeMeasureScope.mo10257toSp0xMU5do(f6);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.p009ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    public long mo10258toSpkPz2Gy4(float f6) {
        return this.subcomposeMeasureScope.mo10258toSpkPz2Gy4(f6);
    }

    @Override // androidx.compose.p009ui.layout.MeasureScope
    public MeasureResult layout(int width, int height, Map<AlignmentLine, Integer> alignmentLines, Function1<? super RulerScope, Unit> rulers, Function1<? super Placeable.PlacementScope, Unit> placementBlock) {
        return this.subcomposeMeasureScope.layout(width, height, alignmentLines, rulers, placementBlock);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.p009ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public float mo10251toDpu2uoSUM(float f6) {
        return this.subcomposeMeasureScope.mo10251toDpu2uoSUM(f6);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.p009ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    public long mo10259toSpkPz2Gy4(int i6) {
        return this.subcomposeMeasureScope.mo10259toSpkPz2Gy4(i6);
    }
}
