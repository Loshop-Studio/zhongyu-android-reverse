package androidx.compose.foundation.shape;

import androidx.annotation.IntRange;
import androidx.compose.p013ui.unit.C3127Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a8\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u000e\u001a.\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u000e2\b\b\u0002\u0010\t\u001a\u00020\u000e2\b\b\u0002\u0010\n\u001a\u00020\u000e2\b\b\u0002\u0010\u000b\u001a\u00020\u000e\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0010\u001a.\u0010\u0000\u001a\u00020\u00012\b\b\u0003\u0010\u0011\u001a\u00020\u00102\b\b\u0003\u0010\u0012\u001a\u00020\u00102\b\b\u0003\u0010\u0013\u001a\u00020\u00102\b\b\u0003\u0010\u0014\u001a\u00020\u0010\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, m13558d2 = {"CutCornerShape", "Landroidx/compose/foundation/shape/CutCornerShape;", "corner", "Landroidx/compose/foundation/shape/CornerSize;", "size", "Landroidx/compose/ui/unit/Dp;", "CutCornerShape-0680j_4", "(F)Landroidx/compose/foundation/shape/CutCornerShape;", "topStart", "topEnd", "bottomEnd", "bottomStart", "CutCornerShape-a9UjIt4", "(FFFF)Landroidx/compose/foundation/shape/CutCornerShape;", "", "percent", "", "topStartPercent", "topEndPercent", "bottomEndPercent", "bottomStartPercent", "foundation_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nCutCornerShape.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CutCornerShape.kt\nandroidx/compose/foundation/shape/CutCornerShapeKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,202:1\n113#2:203\n113#2:204\n113#2:205\n113#2:206\n*S KotlinDebug\n*F\n+ 1 CutCornerShape.kt\nandroidx/compose/foundation/shape/CutCornerShapeKt\n*L\n152#1:203\n153#1:204\n154#1:205\n155#1:206\n*E\n"})
/* loaded from: classes.dex */
public final class CutCornerShapeKt {
    public static final CutCornerShape CutCornerShape(CornerSize cornerSize) {
        return new CutCornerShape(cornerSize, cornerSize, cornerSize, cornerSize);
    }

    public static /* synthetic */ CutCornerShape CutCornerShape$default(float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        if ((i10 & 4) != 0) {
            f12 = 0.0f;
        }
        if ((i10 & 8) != 0) {
            f13 = 0.0f;
        }
        return CutCornerShape(f10, f11, f12, f13);
    }

    /* renamed from: CutCornerShape-0680j_4, reason: not valid java name */
    public static final CutCornerShape m17967CutCornerShape0680j_4(float f10) {
        return CutCornerShape(CornerSizeKt.m17966CornerSize0680j_4(f10));
    }

    /* renamed from: CutCornerShape-a9UjIt4, reason: not valid java name */
    public static final CutCornerShape m17968CutCornerShapea9UjIt4(float f10, float f11, float f12, float f13) {
        return new CutCornerShape(CornerSizeKt.m17966CornerSize0680j_4(f10), CornerSizeKt.m17966CornerSize0680j_4(f11), CornerSizeKt.m17966CornerSize0680j_4(f12), CornerSizeKt.m17966CornerSize0680j_4(f13));
    }

    /* renamed from: CutCornerShape-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ CutCornerShape m17969CutCornerShapea9UjIt4$default(float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = C3127Dp.m23561constructorimpl(0);
        }
        if ((i10 & 2) != 0) {
            f11 = C3127Dp.m23561constructorimpl(0);
        }
        if ((i10 & 4) != 0) {
            f12 = C3127Dp.m23561constructorimpl(0);
        }
        if ((i10 & 8) != 0) {
            f13 = C3127Dp.m23561constructorimpl(0);
        }
        return m17968CutCornerShapea9UjIt4(f10, f11, f12, f13);
    }

    public static final CutCornerShape CutCornerShape(float f10) {
        return CutCornerShape(CornerSizeKt.CornerSize(f10));
    }

    public static /* synthetic */ CutCornerShape CutCornerShape$default(int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = 0;
        }
        if ((i14 & 2) != 0) {
            i11 = 0;
        }
        if ((i14 & 4) != 0) {
            i12 = 0;
        }
        if ((i14 & 8) != 0) {
            i13 = 0;
        }
        return CutCornerShape(i10, i11, i12, i13);
    }

    public static final CutCornerShape CutCornerShape(int i10) {
        return CutCornerShape(CornerSizeKt.CornerSize(i10));
    }

    public static final CutCornerShape CutCornerShape(float f10, float f11, float f12, float f13) {
        return new CutCornerShape(CornerSizeKt.CornerSize(f10), CornerSizeKt.CornerSize(f11), CornerSizeKt.CornerSize(f12), CornerSizeKt.CornerSize(f13));
    }

    public static final CutCornerShape CutCornerShape(@IntRange(from = 0, m488to = 100) int i10, @IntRange(from = 0, m488to = 100) int i11, @IntRange(from = 0, m488to = 100) int i12, @IntRange(from = 0, m488to = 100) int i13) {
        return new CutCornerShape(CornerSizeKt.CornerSize(i10), CornerSizeKt.CornerSize(i11), CornerSizeKt.CornerSize(i12), CornerSizeKt.CornerSize(i13));
    }
}
