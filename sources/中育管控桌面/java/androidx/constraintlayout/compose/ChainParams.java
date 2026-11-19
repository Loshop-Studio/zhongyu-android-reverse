package androidx.constraintlayout.compose;

import androidx.compose.p009ui.unit.C2452Dp;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 1)
@Metadata(m7879d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u000e\b\u0000\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rR\u0019\u0010\n\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0006\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0011\u0010\u000fR\u0019\u0010\t\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0012\u0010\u000fR\u0019\u0010\u0005\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0013\u0010\u000fR\u0019\u0010\u0007\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0014\u0010\u000fR\u0019\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0015\u0010\u000fR\u0019\u0010\b\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0016\u0010\u000fR\u0019\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0017\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001a"}, m7880d2 = {"Landroidx/constraintlayout/compose/ChainParams;", "Landroidx/constraintlayout/compose/HelperParams;", "startMargin", "Landroidx/compose/ui/unit/Dp;", "topMargin", "endMargin", "bottomMargin", "startGoneMargin", "topGoneMargin", "endGoneMargin", "bottomGoneMargin", "weight", "", "(FFFFFFFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getBottomGoneMargin-D9Ej5fM", "()F", "F", "getBottomMargin-D9Ej5fM", "getEndGoneMargin-D9Ej5fM", "getEndMargin-D9Ej5fM", "getStartGoneMargin-D9Ej5fM", "getStartMargin-D9Ej5fM", "getTopGoneMargin-D9Ej5fM", "getTopMargin-D9Ej5fM", "getWeight", "Companion", "constraintlayout-compose_release"}, m7881k = 1, m7882mv = {1, 8, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nConstraintLayoutBaseScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConstraintLayoutBaseScope.kt\nandroidx/constraintlayout/compose/ChainParams\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1456:1\n149#2:1457\n149#2:1458\n149#2:1459\n149#2:1460\n149#2:1461\n149#2:1462\n149#2:1463\n149#2:1464\n*S KotlinDebug\n*F\n+ 1 ConstraintLayoutBaseScope.kt\nandroidx/constraintlayout/compose/ChainParams\n*L\n1143#1:1457\n1144#1:1458\n1145#1:1459\n1146#1:1460\n1147#1:1461\n1148#1:1462\n1149#1:1463\n1150#1:1464\n*E\n"})
/* loaded from: classes2.dex */
public final class ChainParams implements HelperParams {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final ChainParams Default;
    private final float bottomGoneMargin;
    private final float bottomMargin;
    private final float endGoneMargin;
    private final float endMargin;
    private final float startGoneMargin;
    private final float startMargin;
    private final float topGoneMargin;
    private final float topMargin;
    private final float weight;

    @Metadata(m7879d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m7880d2 = {"Landroidx/constraintlayout/compose/ChainParams$Companion;", "", "()V", "Default", "Landroidx/constraintlayout/compose/ChainParams;", "getDefault$constraintlayout_compose_release", "()Landroidx/constraintlayout/compose/ChainParams;", "constraintlayout-compose_release"}, m7881k = 1, m7882mv = {1, 8, 0}, m7884xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ChainParams getDefault$constraintlayout_compose_release() {
            return ChainParams.Default;
        }

        private Companion() {
        }
    }

    static {
        float f6 = 0;
        Default = new ChainParams(C2452Dp.m16484constructorimpl(f6), C2452Dp.m16484constructorimpl(f6), C2452Dp.m16484constructorimpl(f6), C2452Dp.m16484constructorimpl(f6), C2452Dp.m16484constructorimpl(f6), C2452Dp.m16484constructorimpl(f6), C2452Dp.m16484constructorimpl(f6), C2452Dp.m16484constructorimpl(f6), Float.NaN, null);
    }

    public /* synthetic */ ChainParams(float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, DefaultConstructorMarker defaultConstructorMarker) {
        this(f6, f7, f8, f9, f10, f11, f12, f13, f14);
    }

    /* renamed from: getBottomGoneMargin-D9Ej5fM, reason: not valid java name and from getter */
    public final float getBottomGoneMargin() {
        return this.bottomGoneMargin;
    }

    /* renamed from: getBottomMargin-D9Ej5fM, reason: not valid java name and from getter */
    public final float getBottomMargin() {
        return this.bottomMargin;
    }

    /* renamed from: getEndGoneMargin-D9Ej5fM, reason: not valid java name and from getter */
    public final float getEndGoneMargin() {
        return this.endGoneMargin;
    }

    /* renamed from: getEndMargin-D9Ej5fM, reason: not valid java name and from getter */
    public final float getEndMargin() {
        return this.endMargin;
    }

    /* renamed from: getStartGoneMargin-D9Ej5fM, reason: not valid java name and from getter */
    public final float getStartGoneMargin() {
        return this.startGoneMargin;
    }

    /* renamed from: getStartMargin-D9Ej5fM, reason: not valid java name and from getter */
    public final float getStartMargin() {
        return this.startMargin;
    }

    /* renamed from: getTopGoneMargin-D9Ej5fM, reason: not valid java name and from getter */
    public final float getTopGoneMargin() {
        return this.topGoneMargin;
    }

    /* renamed from: getTopMargin-D9Ej5fM, reason: not valid java name and from getter */
    public final float getTopMargin() {
        return this.topMargin;
    }

    public final float getWeight() {
        return this.weight;
    }

    private ChainParams(float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14) {
        this.startMargin = f6;
        this.topMargin = f7;
        this.endMargin = f8;
        this.bottomMargin = f9;
        this.startGoneMargin = f10;
        this.topGoneMargin = f11;
        this.endGoneMargin = f12;
        this.bottomGoneMargin = f13;
        this.weight = f14;
    }
}
