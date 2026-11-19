package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.unit.C2331Dp;
import androidx.compose.p011ui.unit.DpKt;
import androidx.compose.p011ui.unit.DpSize;
import androidx.compose.p011ui.unit.TextUnit;
import androidx.compose.p011ui.unit.TextUnitKt;
import androidx.compose.p011ui.unit.TextUnitType;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\u00020\f*\u00020\rH\u0017ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u000b\u001a\u00020\f*\u00020\u0010H\u0017ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u000b\u001a\u00020\f*\u00020\u0006H\u0017ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0013J\u0016\u0010\u0014\u001a\u00020\u0015*\u00020\u0016H\u0017ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\u00020\u0016*\u00020\u0015H\u0017ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0018J\u0016\u0010\u001b\u001a\u00020\r*\u00020\fH\u0017ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001b\u001a\u00020\r*\u00020\u0010H\u0017ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001dJ\u0019\u0010\u001b\u001a\u00020\r*\u00020\u0006H\u0017ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u0082\u0001\u0001 ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006!À\u0006\u0001"}, m5110d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "Landroidx/compose/ui/layout/MeasureScope;", "measure", "", "Landroidx/compose/ui/layout/Placeable;", "index", "", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-0kLqBqw", "(IJ)Ljava/util/List;", "toDp", "Landroidx/compose/ui/unit/Dp;", "Landroidx/compose/ui/unit/TextUnit;", "toDp-GaN1DYA", "(J)F", "", "toDp-u2uoSUM", "(F)F", "(I)F", "toDpSize", "Landroidx/compose/ui/unit/DpSize;", "Landroidx/compose/ui/geometry/Size;", "toDpSize-k-rfVVM", "(J)J", "toSize", "toSize-XkaWNTQ", "toSp", "toSp-0xMU5do", "(F)J", "toSp-kPz2Gy4", "(I)J", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScopeImpl;", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@Stable
@ExperimentalFoundationApi
@SourceDebugExtension({"SMAP\nLazyLayoutMeasureScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutMeasureScope.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 7 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,147:1\n50#2,5:148\n123#3:153\n123#3:154\n363#3:155\n33#4:156\n148#4:160\n53#5,3:157\n60#5:162\n70#5:165\n57#6:161\n61#6:164\n22#7:163\n*S KotlinDebug\n*F\n+ 1 LazyLayoutMeasureScope.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope\n*L\n70#1:148,5\n74#1:153\n76#1:154\n86#1:155\n87#1:156\n94#1:160\n87#1:157,3\n95#1:162\n95#1:165\n95#1:161\n95#1:164\n95#1:163\n*E\n"})
/* loaded from: classes.dex */
public interface LazyLayoutMeasureScope extends MeasureScope {
    @NotNull
    /* renamed from: measure-0kLqBqw, reason: not valid java name */
    List<Placeable> mo7438measure0kLqBqw(int index, long constraints);

    @Override // androidx.compose.p011ui.unit.FontScaling
    @Stable
    /* renamed from: toDp-GaN1DYA */
    default float mo6898toDpGaN1DYA(long j7) {
        if (!TextUnitType.m13527equalsimpl0(TextUnit.m13498getTypeUIouoOA(j7), TextUnitType.INSTANCE.m13532getSpUIouoOA())) {
            InlineClassHelperKt.throwIllegalStateException("Only Sp can convert to Px");
        }
        return C2331Dp.m13305constructorimpl(getFontScale() * TextUnit.m13499getValueimpl(j7));
    }

    @Override // androidx.compose.p011ui.unit.Density
    @Stable
    /* renamed from: toDp-u2uoSUM */
    default float mo6900toDpu2uoSUM(int i) {
        return C2331Dp.m13305constructorimpl(i / getDensity());
    }

    @Override // androidx.compose.p011ui.unit.Density
    @Stable
    /* renamed from: toDpSize-k-rfVVM */
    default long mo6901toDpSizekrfVVM(long j7) {
        return j7 != androidx.compose.p011ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats ? DpKt.m13327DpSizeYgX7TsA(mo6899toDpu2uoSUM(Float.intBitsToFloat((int) (j7 >> 32))), mo6899toDpu2uoSUM(Float.intBitsToFloat((int) (j7 & 4294967295L)))) : DpSize.INSTANCE.m13412getUnspecifiedMYxV2XQ();
    }

    @Override // androidx.compose.p011ui.unit.Density
    @Stable
    /* renamed from: toSize-XkaWNTQ */
    default long mo6904toSizeXkaWNTQ(long j7) {
        if (j7 == androidx.compose.p011ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
            return Size.INSTANCE.m10518getUnspecifiedNHjbRc();
        }
        float fMo6903toPx0680j_4 = mo6903toPx0680j_4(DpSize.m13403getWidthD9Ej5fM(j7));
        float fMo6903toPx0680j_42 = mo6903toPx0680j_4(DpSize.m13401getHeightD9Ej5fM(j7));
        return Size.m10501constructorimpl((Float.floatToRawIntBits(fMo6903toPx0680j_42) & 4294967295L) | (Float.floatToRawIntBits(fMo6903toPx0680j_4) << 32));
    }

    @Override // androidx.compose.p011ui.unit.FontScaling
    @Stable
    /* renamed from: toSp-0xMU5do */
    default long mo6905toSp0xMU5do(float f) {
        return TextUnitKt.getSp(f / getFontScale());
    }

    @Override // androidx.compose.p011ui.unit.Density
    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    default long mo6906toSpkPz2Gy4(float f) {
        return TextUnitKt.getSp(f / (getDensity() * getFontScale()));
    }

    @Override // androidx.compose.p011ui.unit.Density
    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    default long mo6907toSpkPz2Gy4(int i) {
        return TextUnitKt.getSp(i / (getDensity() * getFontScale()));
    }

    @Override // androidx.compose.p011ui.unit.Density
    @Stable
    /* renamed from: toDp-u2uoSUM */
    default float mo6899toDpu2uoSUM(float f) {
        return C2331Dp.m13305constructorimpl(f / getDensity());
    }
}
