package androidx.compose.foundation.lazy.layout;

import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.layout.AlignmentLine;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.layout.SubcomposeMeasureScope;
import androidx.compose.p011ui.unit.DpRect;
import androidx.compose.p011ui.unit.LayoutDirection;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6471c;

@StabilityInferred(parameters = 1)
@Metadata(m5109d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJl\u0010\u0017\u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\f2\u001b\b\u0002\u0010\u0013\u001a\u0015\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f¢\u0006\u0002\b\u00122\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u000f¢\u0006\u0002\b\u0012H\u0096\u0001¢\u0006\u0004\b\u0017\u0010\u0018JO\u0010\u0017\u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\f2\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u000f¢\u0006\u0002\b\u0012H\u0096\u0001¢\u0006\u0004\b\u0017\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\t*\u00020\u001aH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\t*\u00020\u001eH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010$\u001a\u00020!*\u00020\u001aH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020!*\u00020\u001eH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b%\u0010&J\u0014\u0010)\u001a\u00020(*\u00020'H\u0097\u0001¢\u0006\u0004\b)\u0010*J(\u00102\u001a\b\u0012\u0004\u0012\u00020/0.2\u0006\u0010+\u001a\u00020\t2\u0006\u0010-\u001a\u00020,H\u0016ø\u0001\u0000¢\u0006\u0004\b0\u00101J\u0016\u00104\u001a\u00020\u001a*\u00020\u001eH\u0016ø\u0001\u0000¢\u0006\u0004\b3\u0010&J\u0019\u00104\u001a\u00020\u001a*\u00020\tH\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b5\u00106J\u0019\u00104\u001a\u00020\u001a*\u00020!H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b5\u0010#J\u0019\u00109\u001a\u00020\u001e*\u00020!H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b7\u00108J\u0019\u00109\u001a\u00020\u001e*\u00020\tH\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b7\u0010:J\u0016\u00109\u001a\u00020\u001e*\u00020\u001aH\u0016ø\u0001\u0000¢\u0006\u0004\b;\u00108J\u0016\u0010@\u001a\u00020=*\u00020<H\u0016ø\u0001\u0000¢\u0006\u0004\b>\u0010?J\u0016\u0010B\u001a\u00020<*\u00020=H\u0016ø\u0001\u0000¢\u0006\u0004\bA\u0010?R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010CR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010DR\u0014\u0010F\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR \u0010I\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0.0H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010M\u001a\u00020!8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\bK\u0010LR\u0014\u0010O\u001a\u00020!8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\bN\u0010LR\u0014\u0010Q\u001a\u00020P8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\bQ\u0010RR\u0014\u0010V\u001a\u00020S8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bT\u0010U\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006W"}, m5110d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScopeImpl;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;", "itemContentFactory", "Landroidx/compose/ui/layout/SubcomposeMeasureScope;", "subcomposeMeasureScope", "<init>", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;Landroidx/compose/ui/layout/SubcomposeMeasureScope;)V", "", "width", "height", "", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLines", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/RulerScope;", "Ld6/s;", "Lkotlin/ExtensionFunctionType;", "rulers", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "placementBlock", "Landroidx/compose/ui/layout/MeasureResult;", "layout", "(IILjava/util/Map;Lr6/c;Lr6/c;)Landroidx/compose/ui/layout/MeasureResult;", "(IILjava/util/Map;Lr6/c;)Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/unit/Dp;", "roundToPx-0680j_4", "(F)I", "roundToPx", "Landroidx/compose/ui/unit/TextUnit;", "roundToPx--R2X_6o", "(J)I", "", "toPx-0680j_4", "(F)F", "toPx", "toPx--R2X_6o", "(J)F", "Landroidx/compose/ui/unit/DpRect;", "Landroidx/compose/ui/geometry/Rect;", "toRect", "(Landroidx/compose/ui/unit/DpRect;)Landroidx/compose/ui/geometry/Rect;", "index", "Landroidx/compose/ui/unit/Constraints;", "constraints", "", "Landroidx/compose/ui/layout/Placeable;", "measure-0kLqBqw", "(IJ)Ljava/util/List;", "measure", "toDp-GaN1DYA", "toDp", "toDp-u2uoSUM", "(I)F", "toSp-kPz2Gy4", "(F)J", "toSp", "(I)J", "toSp-0xMU5do", "Landroidx/compose/ui/unit/DpSize;", "Landroidx/compose/ui/geometry/Size;", "toSize-XkaWNTQ", "(J)J", "toSize", "toDpSize-k-rfVVM", "toDpSize", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;", "Landroidx/compose/ui/layout/SubcomposeMeasureScope;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "itemProvider", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "Landroidx/collection/MutableIntObjectMap;", "placeablesCache", "Landroidx/collection/MutableIntObjectMap;", "getDensity", "()F", "density", "getFontScale", "fontScale", "", "isLookingAhead", "()Z", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nLazyLayoutMeasureScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutMeasureScope.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScopeImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,147:1\n1#2:148\n*E\n"})
/* loaded from: classes.dex */
public final class LazyLayoutMeasureScopeImpl implements LazyLayoutMeasureScope, MeasureScope {
    public static final int $stable = 0;

    @NotNull
    private final LazyLayoutItemContentFactory itemContentFactory;

    @NotNull
    private final LazyLayoutItemProvider itemProvider;

    @NotNull
    private final MutableIntObjectMap<List<Placeable>> placeablesCache = IntObjectMapKt.mutableIntObjectMapOf();

    @NotNull
    private final SubcomposeMeasureScope subcomposeMeasureScope;

    public LazyLayoutMeasureScopeImpl(@NotNull LazyLayoutItemContentFactory lazyLayoutItemContentFactory, @NotNull SubcomposeMeasureScope subcomposeMeasureScope) {
        this.itemContentFactory = lazyLayoutItemContentFactory;
        this.subcomposeMeasureScope = subcomposeMeasureScope;
        this.itemProvider = (LazyLayoutItemProvider) lazyLayoutItemContentFactory.getItemProvider().invoke();
    }

    @Override // androidx.compose.p011ui.unit.Density
    public float getDensity() {
        return this.subcomposeMeasureScope.getDensity();
    }

    @Override // androidx.compose.p011ui.unit.FontScaling
    public float getFontScale() {
        return this.subcomposeMeasureScope.getFontScale();
    }

    @Override // androidx.compose.p011ui.layout.IntrinsicMeasureScope
    @NotNull
    public LayoutDirection getLayoutDirection() {
        return this.subcomposeMeasureScope.getLayoutDirection();
    }

    @Override // androidx.compose.p011ui.layout.IntrinsicMeasureScope
    public boolean isLookingAhead() {
        return this.subcomposeMeasureScope.isLookingAhead();
    }

    @Override // androidx.compose.p011ui.layout.MeasureScope
    @NotNull
    public MeasureResult layout(int width, int height, @NotNull Map<AlignmentLine, Integer> alignmentLines, @NotNull InterfaceC6471c placementBlock) {
        return this.subcomposeMeasureScope.layout(width, height, alignmentLines, placementBlock);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope
    @NotNull
    /* renamed from: measure-0kLqBqw */
    public List<Placeable> mo7438measure0kLqBqw(int index, long constraints) {
        List<Placeable> list = this.placeablesCache.get(index);
        if (list != null) {
            return list;
        }
        Object key = this.itemProvider.getKey(index);
        List<Measurable> listSubcompose = this.subcomposeMeasureScope.subcompose(key, this.itemContentFactory.getContent(index, key, this.itemProvider.getContentType(index)));
        int size = listSubcompose.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(listSubcompose.get(i).mo12033measureBRTryo0(constraints));
        }
        this.placeablesCache.set(index, arrayList);
        return arrayList;
    }

    @Override // androidx.compose.p011ui.unit.Density
    @Stable
    /* renamed from: roundToPx--R2X_6o */
    public int mo6896roundToPxR2X_6o(long j7) {
        return this.subcomposeMeasureScope.mo6896roundToPxR2X_6o(j7);
    }

    @Override // androidx.compose.p011ui.unit.Density
    @Stable
    /* renamed from: roundToPx-0680j_4 */
    public int mo6897roundToPx0680j_4(float f) {
        return this.subcomposeMeasureScope.mo6897roundToPx0680j_4(f);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.p011ui.unit.FontScaling
    /* renamed from: toDp-GaN1DYA */
    public float mo6898toDpGaN1DYA(long j7) {
        return this.subcomposeMeasureScope.mo6898toDpGaN1DYA(j7);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.p011ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public float mo6900toDpu2uoSUM(int i) {
        return this.subcomposeMeasureScope.mo6900toDpu2uoSUM(i);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.p011ui.unit.Density
    /* renamed from: toDpSize-k-rfVVM */
    public long mo6901toDpSizekrfVVM(long j7) {
        return this.subcomposeMeasureScope.mo6901toDpSizekrfVVM(j7);
    }

    @Override // androidx.compose.p011ui.unit.Density
    @Stable
    /* renamed from: toPx--R2X_6o */
    public float mo6902toPxR2X_6o(long j7) {
        return this.subcomposeMeasureScope.mo6902toPxR2X_6o(j7);
    }

    @Override // androidx.compose.p011ui.unit.Density
    @Stable
    /* renamed from: toPx-0680j_4 */
    public float mo6903toPx0680j_4(float f) {
        return this.subcomposeMeasureScope.mo6903toPx0680j_4(f);
    }

    @Override // androidx.compose.p011ui.unit.Density
    @Stable
    @NotNull
    public Rect toRect(@NotNull DpRect dpRect) {
        return this.subcomposeMeasureScope.toRect(dpRect);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.p011ui.unit.Density
    /* renamed from: toSize-XkaWNTQ */
    public long mo6904toSizeXkaWNTQ(long j7) {
        return this.subcomposeMeasureScope.mo6904toSizeXkaWNTQ(j7);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.p011ui.unit.FontScaling
    /* renamed from: toSp-0xMU5do */
    public long mo6905toSp0xMU5do(float f) {
        return this.subcomposeMeasureScope.mo6905toSp0xMU5do(f);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.p011ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    public long mo6906toSpkPz2Gy4(float f) {
        return this.subcomposeMeasureScope.mo6906toSpkPz2Gy4(f);
    }

    @Override // androidx.compose.p011ui.layout.MeasureScope
    @NotNull
    public MeasureResult layout(int width, int height, @NotNull Map<AlignmentLine, Integer> alignmentLines, @Nullable InterfaceC6471c rulers, @NotNull InterfaceC6471c placementBlock) {
        return this.subcomposeMeasureScope.layout(width, height, alignmentLines, rulers, placementBlock);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.p011ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public float mo6899toDpu2uoSUM(float f) {
        return this.subcomposeMeasureScope.mo6899toDpu2uoSUM(f);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.p011ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    public long mo6907toSpkPz2Gy4(int i) {
        return this.subcomposeMeasureScope.mo6907toSpkPz2Gy4(i);
    }
}
