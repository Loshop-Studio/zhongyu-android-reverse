package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.p012ui.geometry.Size;
import androidx.compose.p012ui.layout.MeasureScope;
import androidx.compose.p012ui.layout.Placeable;
import androidx.compose.p012ui.unit.C3115Dp;
import androidx.compose.p012ui.unit.DpKt;
import androidx.compose.p012ui.unit.DpSize;
import androidx.compose.p012ui.unit.TextUnit;
import androidx.compose.p012ui.unit.TextUnitKt;
import androidx.compose.p012ui.unit.TextUnitType;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13412d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\u00020\f*\u00020\rH\u0017ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u000b\u001a\u00020\f*\u00020\u0010H\u0017ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u000b\u001a\u00020\f*\u00020\u0006H\u0017ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0013J\u0016\u0010\u0014\u001a\u00020\u0015*\u00020\u0016H\u0017ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\u00020\u0016*\u00020\u0015H\u0017ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0018J\u0016\u0010\u001b\u001a\u00020\r*\u00020\fH\u0017ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001b\u001a\u00020\r*\u00020\u0010H\u0017ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001dJ\u0019\u0010\u001b\u001a\u00020\r*\u00020\u0006H\u0017ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u0082\u0001\u0001 ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006!À\u0006\u0001"}, m13413d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "Landroidx/compose/ui/layout/MeasureScope;", "measure", "", "Landroidx/compose/ui/layout/Placeable;", "index", "", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-0kLqBqw", "(IJ)Ljava/util/List;", "toDp", "Landroidx/compose/ui/unit/Dp;", "Landroidx/compose/ui/unit/TextUnit;", "toDp-GaN1DYA", "(J)F", "", "toDp-u2uoSUM", "(F)F", "(I)F", "toDpSize", "Landroidx/compose/ui/unit/DpSize;", "Landroidx/compose/ui/geometry/Size;", "toDpSize-k-rfVVM", "(J)J", "toSize", "toSize-XkaWNTQ", "toSp", "toSp-0xMU5do", "(F)J", "toSp-kPz2Gy4", "(I)J", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScopeImpl;", "foundation_release"}, m13414k = 1, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@Stable
@ExperimentalFoundationApi
@SourceDebugExtension({"SMAP\nLazyLayoutMeasureScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutMeasureScope.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 7 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,147:1\n50#2,5:148\n123#3:153\n123#3:154\n363#3:155\n33#4:156\n148#4:160\n53#5,3:157\n60#5:162\n70#5:165\n57#6:161\n61#6:164\n22#7:163\n*S KotlinDebug\n*F\n+ 1 LazyLayoutMeasureScope.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope\n*L\n70#1:148,5\n74#1:153\n76#1:154\n86#1:155\n87#1:156\n94#1:160\n87#1:157,3\n95#1:162\n95#1:165\n95#1:161\n95#1:164\n95#1:163\n*E\n"})
/* loaded from: classes.dex */
public interface LazyLayoutMeasureScope extends MeasureScope {
    /* renamed from: measure-0kLqBqw, reason: not valid java name */
    List<Placeable> mo18288measure0kLqBqw(int index, long constraints);

    @Override // androidx.compose.p012ui.unit.FontScaling
    @Stable
    /* renamed from: toDp-GaN1DYA */
    default float mo17760toDpGaN1DYA(long j9) {
        if (!TextUnitType.m24216equalsimpl0(TextUnit.m24187getTypeUIouoOA(j9), TextUnitType.INSTANCE.m24221getSpUIouoOA())) {
            InlineClassHelperKt.throwIllegalStateException("Only Sp can convert to Px");
        }
        return C3115Dp.m23994constructorimpl(TextUnit.m24188getValueimpl(j9) * getFontScale());
    }

    @Override // androidx.compose.p012ui.unit.Density
    @Stable
    /* renamed from: toDp-u2uoSUM */
    default float mo17762toDpu2uoSUM(int i9) {
        return C3115Dp.m23994constructorimpl(i9 / getDensity());
    }

    @Override // androidx.compose.p012ui.unit.Density
    @Stable
    /* renamed from: toDpSize-k-rfVVM */
    default long mo17763toDpSizekrfVVM(long j9) {
        return j9 != androidx.compose.p012ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats ? DpKt.m24016DpSizeYgX7TsA(mo17761toDpu2uoSUM(Float.intBitsToFloat((int) (j9 >> 32))), mo17761toDpu2uoSUM(Float.intBitsToFloat((int) (j9 & 4294967295L)))) : DpSize.INSTANCE.m24101getUnspecifiedMYxV2XQ();
    }

    @Override // androidx.compose.p012ui.unit.Density
    @Stable
    /* renamed from: toSize-XkaWNTQ */
    default long mo17766toSizeXkaWNTQ(long j9) {
        if (j9 == androidx.compose.p012ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
            return Size.INSTANCE.m21245getUnspecifiedNHjbRc();
        }
        float fMo17765toPx0680j_4 = mo17765toPx0680j_4(DpSize.m24092getWidthD9Ej5fM(j9));
        float fMo17765toPx0680j_42 = mo17765toPx0680j_4(DpSize.m24090getHeightD9Ej5fM(j9));
        return Size.m21228constructorimpl((Float.floatToRawIntBits(fMo17765toPx0680j_42) & 4294967295L) | (Float.floatToRawIntBits(fMo17765toPx0680j_4) << 32));
    }

    @Override // androidx.compose.p012ui.unit.FontScaling
    @Stable
    /* renamed from: toSp-0xMU5do */
    default long mo17767toSp0xMU5do(float f10) {
        return TextUnitKt.getSp(f10 / getFontScale());
    }

    @Override // androidx.compose.p012ui.unit.Density
    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    default long mo17768toSpkPz2Gy4(float f10) {
        return TextUnitKt.getSp(f10 / (getFontScale() * getDensity()));
    }

    @Override // androidx.compose.p012ui.unit.Density
    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    default long mo17769toSpkPz2Gy4(int i9) {
        return TextUnitKt.getSp(i9 / (getFontScale() * getDensity()));
    }

    @Override // androidx.compose.p012ui.unit.Density
    @Stable
    /* renamed from: toDp-u2uoSUM */
    default float mo17761toDpu2uoSUM(float f10) {
        return C3115Dp.m23994constructorimpl(f10 / getDensity());
    }
}
