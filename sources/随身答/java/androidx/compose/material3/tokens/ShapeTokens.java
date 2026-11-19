package androidx.compose.material3.tokens;

import androidx.camera.video.AudioStats;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.p012ui.graphics.RectangleShapeKt;
import androidx.compose.p012ui.graphics.Shape;
import androidx.compose.p012ui.unit.C3115Dp;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 1)
@Metadata(m13412d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0011\u0010\r\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0011\u0010\u000f\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u0011\u0010\u0011\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006R\u0011\u0010\u0013\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0006R\u0011\u0010\u0015\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0006R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0006¨\u0006\u001d"}, m13413d2 = {"Landroidx/compose/material3/tokens/ShapeTokens;", "", "()V", "CornerExtraLarge", "Landroidx/compose/foundation/shape/RoundedCornerShape;", "getCornerExtraLarge", "()Landroidx/compose/foundation/shape/RoundedCornerShape;", "CornerExtraLargeTop", "getCornerExtraLargeTop", "CornerExtraSmall", "getCornerExtraSmall", "CornerExtraSmallTop", "getCornerExtraSmallTop", "CornerFull", "getCornerFull", "CornerLarge", "getCornerLarge", "CornerLargeEnd", "getCornerLargeEnd", "CornerLargeTop", "getCornerLargeTop", "CornerMedium", "getCornerMedium", "CornerNone", "Landroidx/compose/ui/graphics/Shape;", "getCornerNone", "()Landroidx/compose/ui/graphics/Shape;", "CornerSmall", "getCornerSmall", "material3_release"}, m13414k = 1, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nShapeTokens.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShapeTokens.kt\nandroidx/compose/material3/tokens/ShapeTokens\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,63:1\n158#2:64\n158#2:65\n158#2:66\n158#2:67\n158#2:68\n158#2:69\n158#2:70\n158#2:71\n158#2:72\n158#2:73\n158#2:74\n158#2:75\n158#2:76\n158#2:77\n158#2:78\n158#2:79\n158#2:80\n158#2:81\n158#2:82\n158#2:83\n158#2:84\n*S KotlinDebug\n*F\n+ 1 ShapeTokens.kt\nandroidx/compose/material3/tokens/ShapeTokens\n*L\n27#1:64\n30#1:65\n31#1:66\n32#1:67\n33#1:68\n35#1:69\n38#1:70\n39#1:71\n40#1:72\n41#1:73\n44#1:74\n47#1:75\n48#1:76\n49#1:77\n50#1:78\n54#1:79\n55#1:80\n56#1:81\n57#1:82\n59#1:83\n61#1:84\n*E\n"})
/* loaded from: classes2.dex */
public final class ShapeTokens {
    public static final int $stable = 0;
    private static final RoundedCornerShape CornerExtraLarge;
    private static final RoundedCornerShape CornerExtraLargeTop;
    private static final RoundedCornerShape CornerExtraSmall;
    private static final RoundedCornerShape CornerExtraSmallTop;
    private static final RoundedCornerShape CornerFull;
    private static final RoundedCornerShape CornerLarge;
    private static final RoundedCornerShape CornerLargeEnd;
    private static final RoundedCornerShape CornerLargeTop;
    private static final RoundedCornerShape CornerMedium;
    private static final Shape CornerNone;
    private static final RoundedCornerShape CornerSmall;
    public static final ShapeTokens INSTANCE = new ShapeTokens();

    static {
        float f10 = (float) 28.0d;
        CornerExtraLarge = RoundedCornerShapeKt.m18407RoundedCornerShape0680j_4(C3115Dp.m23994constructorimpl(f10));
        float fM23994constructorimpl = C3115Dp.m23994constructorimpl(f10);
        float fM23994constructorimpl2 = C3115Dp.m23994constructorimpl(f10);
        float f11 = (float) AudioStats.AUDIO_AMPLITUDE_NONE;
        CornerExtraLargeTop = RoundedCornerShapeKt.m18408RoundedCornerShapea9UjIt4(fM23994constructorimpl, fM23994constructorimpl2, C3115Dp.m23994constructorimpl(f11), C3115Dp.m23994constructorimpl(f11));
        float f12 = (float) 4.0d;
        CornerExtraSmall = RoundedCornerShapeKt.m18407RoundedCornerShape0680j_4(C3115Dp.m23994constructorimpl(f12));
        CornerExtraSmallTop = RoundedCornerShapeKt.m18408RoundedCornerShapea9UjIt4(C3115Dp.m23994constructorimpl(f12), C3115Dp.m23994constructorimpl(f12), C3115Dp.m23994constructorimpl(f11), C3115Dp.m23994constructorimpl(f11));
        CornerFull = RoundedCornerShapeKt.getCircleShape();
        float f13 = (float) 16.0d;
        CornerLarge = RoundedCornerShapeKt.m18407RoundedCornerShape0680j_4(C3115Dp.m23994constructorimpl(f13));
        CornerLargeEnd = RoundedCornerShapeKt.m18408RoundedCornerShapea9UjIt4(C3115Dp.m23994constructorimpl(f11), C3115Dp.m23994constructorimpl(f13), C3115Dp.m23994constructorimpl(f13), C3115Dp.m23994constructorimpl(f11));
        CornerLargeTop = RoundedCornerShapeKt.m18408RoundedCornerShapea9UjIt4(C3115Dp.m23994constructorimpl(f13), C3115Dp.m23994constructorimpl(f13), C3115Dp.m23994constructorimpl(f11), C3115Dp.m23994constructorimpl(f11));
        CornerMedium = RoundedCornerShapeKt.m18407RoundedCornerShape0680j_4(C3115Dp.m23994constructorimpl((float) 12.0d));
        CornerNone = RectangleShapeKt.getRectangleShape();
        CornerSmall = RoundedCornerShapeKt.m18407RoundedCornerShape0680j_4(C3115Dp.m23994constructorimpl((float) 8.0d));
    }

    private ShapeTokens() {
    }

    public final RoundedCornerShape getCornerExtraLarge() {
        return CornerExtraLarge;
    }

    public final RoundedCornerShape getCornerExtraLargeTop() {
        return CornerExtraLargeTop;
    }

    public final RoundedCornerShape getCornerExtraSmall() {
        return CornerExtraSmall;
    }

    public final RoundedCornerShape getCornerExtraSmallTop() {
        return CornerExtraSmallTop;
    }

    public final RoundedCornerShape getCornerFull() {
        return CornerFull;
    }

    public final RoundedCornerShape getCornerLarge() {
        return CornerLarge;
    }

    public final RoundedCornerShape getCornerLargeEnd() {
        return CornerLargeEnd;
    }

    public final RoundedCornerShape getCornerLargeTop() {
        return CornerLargeTop;
    }

    public final RoundedCornerShape getCornerMedium() {
        return CornerMedium;
    }

    public final Shape getCornerNone() {
        return CornerNone;
    }

    public final RoundedCornerShape getCornerSmall() {
        return CornerSmall;
    }
}
