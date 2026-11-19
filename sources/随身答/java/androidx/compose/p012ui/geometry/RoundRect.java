package androidx.compose.p012ui.geometry;

import androidx.compose.runtime.Immutable;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Immutable
@Metadata(m13412d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 >2\u00020\u0001:\u0001>BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b¢\u0006\u0002\u0010\fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u0016\u0010!\u001a\u00020\bHÆ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\"\u0010\u0011J\u0016\u0010#\u001a\u00020\bHÆ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b$\u0010\u0011J\u0016\u0010%\u001a\u00020\bHÆ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b&\u0010\u0011J\u0016\u0010'\u001a\u00020\bHÆ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b(\u0010\u0011J\u001b\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b-\u0010.Jc\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\bHÆ\u0001ø\u0001\u0000¢\u0006\u0004\b0\u00101J\u0013\u00102\u001a\u00020*2\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00104\u001a\u000205HÖ\u0001J(\u00106\u001a\u00020\u00032\u0006\u00107\u001a\u00020\u00032\u0006\u00108\u001a\u00020\u00032\u0006\u00109\u001a\u00020\u00032\u0006\u0010:\u001a\u00020\u0003H\u0002J\b\u0010;\u001a\u00020\u0000H\u0002J\b\u0010<\u001a\u00020=H\u0016R\u0010\u0010\r\u001a\u0004\u0018\u00010\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u000b\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\n\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0014\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000fR\u0019\u0010\u0007\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0019\u0010\u0011R\u0019\u0010\t\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u001a\u0010\u0011R\u0011\u0010\u001b\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u000f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006?"}, m13413d2 = {"Landroidx/compose/ui/geometry/RoundRect;", "", "left", "", "top", "right", "bottom", "topLeftCornerRadius", "Landroidx/compose/ui/geometry/CornerRadius;", "topRightCornerRadius", "bottomRightCornerRadius", "bottomLeftCornerRadius", "(FFFFJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "_scaledRadiiRect", "getBottom", "()F", "getBottomLeftCornerRadius-kKHJgLs", "()J", "J", "getBottomRightCornerRadius-kKHJgLs", "height", "getHeight", "getLeft", "getRight", "getTop", "getTopLeftCornerRadius-kKHJgLs", "getTopRightCornerRadius-kKHJgLs", "width", "getWidth", "component1", "component2", "component3", "component4", "component5", "component5-kKHJgLs", "component6", "component6-kKHJgLs", "component7", "component7-kKHJgLs", "component8", "component8-kKHJgLs", "contains", "", "point", "Landroidx/compose/ui/geometry/Offset;", "contains-k-4lQ0M", "(J)Z", "copy", "copy-MDFrsts", "(FFFFJJJJ)Landroidx/compose/ui/geometry/RoundRect;", "equals", "other", "hashCode", "", "minRadius", "min", "radius1", "radius2", "limit", "scaledRadiiRect", "toString", "", "Companion", "ui-geometry_release"}, m13414k = 1, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nRoundRect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoundRect.kt\nandroidx/compose/ui/geometry/RoundRect\n+ 2 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadius\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadiusKt\n+ 6 Offset.kt\nandroidx/compose/ui/geometry/Offset\n*L\n1#1,422:1\n53#2:423\n48#2:426\n53#2:429\n48#2:432\n48#2:435\n53#2:438\n48#2:445\n53#2:448\n48#2:455\n53#2:458\n48#2:465\n53#2:468\n48#2:483\n53#2:487\n48#2:491\n53#2:495\n48#2:496\n53#2:499\n48#2:505\n53#2:509\n48#2:513\n53#2:517\n48#2:518\n53#2:521\n48#2:527\n53#2:531\n48#2:535\n53#2:539\n48#2:540\n53#2:543\n48#2:549\n53#2:553\n48#2:557\n53#2:561\n48#2:562\n53#2:565\n48#2:568\n53#2:571\n48#2:573\n48#2:576\n53#2:579\n70#3:424\n60#3:427\n70#3:430\n60#3:433\n60#3:436\n70#3:439\n53#3,3:442\n60#3:446\n70#3:449\n53#3,3:452\n60#3:456\n70#3:459\n53#3,3:462\n60#3:466\n70#3:469\n53#3,3:472\n60#3:476\n70#3:479\n60#3:481\n70#3:485\n60#3:489\n70#3:493\n60#3:497\n70#3:500\n60#3:503\n70#3:507\n60#3:511\n70#3:515\n60#3:519\n70#3:522\n60#3:525\n70#3:529\n60#3:533\n70#3:537\n60#3:541\n70#3:544\n60#3:547\n70#3:551\n60#3:555\n70#3:559\n60#3:563\n70#3:566\n60#3:569\n70#3:572\n60#3:574\n60#3:577\n70#3:580\n22#4:425\n22#4:428\n22#4:431\n22#4:434\n22#4:437\n22#4:440\n22#4:447\n22#4:450\n22#4:457\n22#4:460\n22#4:467\n22#4:470\n22#4:477\n22#4:482\n22#4:486\n22#4:490\n22#4:494\n22#4:498\n22#4:501\n22#4:504\n22#4:508\n22#4:512\n22#4:516\n22#4:520\n22#4:523\n22#4:526\n22#4:530\n22#4:534\n22#4:538\n22#4:542\n22#4:545\n22#4:548\n22#4:552\n22#4:556\n22#4:560\n22#4:564\n22#4:567\n22#4:570\n22#4:575\n22#4:578\n22#4:581\n33#5:441\n33#5:451\n33#5:461\n33#5:471\n65#6:475\n69#6:478\n65#6:480\n69#6:484\n65#6:488\n69#6:492\n65#6:502\n69#6:506\n65#6:510\n69#6:514\n65#6:524\n69#6:528\n65#6:532\n69#6:536\n65#6:546\n69#6:550\n65#6:554\n69#6:558\n*S KotlinDebug\n*F\n+ 1 RoundRect.kt\nandroidx/compose/ui/geometry/RoundRect\n*L\n72#1:423\n73#1:426\n75#1:429\n77#1:432\n86#1:435\n87#1:438\n91#1:445\n92#1:448\n96#1:455\n97#1:458\n101#1:465\n102#1:468\n148#1:483\n149#1:487\n151#1:491\n152#1:495\n153#1:496\n154#1:499\n156#1:505\n157#1:509\n159#1:513\n160#1:517\n161#1:518\n162#1:521\n164#1:527\n165#1:531\n167#1:535\n168#1:539\n169#1:540\n170#1:543\n172#1:549\n173#1:553\n175#1:557\n176#1:561\n177#1:562\n178#1:565\n202#1:568\n202#1:571\n203#1:573\n205#1:576\n206#1:579\n72#1:424\n73#1:427\n75#1:430\n77#1:433\n86#1:436\n87#1:439\n85#1:442,3\n91#1:446\n92#1:449\n90#1:452,3\n96#1:456\n97#1:459\n95#1:462,3\n101#1:466\n102#1:469\n100#1:472,3\n134#1:476\n134#1:479\n148#1:481\n149#1:485\n151#1:489\n152#1:493\n153#1:497\n154#1:500\n156#1:503\n157#1:507\n159#1:511\n160#1:515\n161#1:519\n162#1:522\n164#1:525\n165#1:529\n167#1:533\n168#1:537\n169#1:541\n170#1:544\n172#1:547\n173#1:551\n175#1:555\n176#1:559\n177#1:563\n178#1:566\n202#1:569\n202#1:572\n203#1:574\n205#1:577\n206#1:580\n72#1:425\n73#1:428\n75#1:431\n77#1:434\n86#1:437\n87#1:440\n91#1:447\n92#1:450\n96#1:457\n97#1:460\n101#1:467\n102#1:470\n134#1:477\n148#1:482\n149#1:486\n151#1:490\n152#1:494\n153#1:498\n154#1:501\n156#1:504\n157#1:508\n159#1:512\n160#1:516\n161#1:520\n162#1:523\n164#1:526\n165#1:530\n167#1:534\n168#1:538\n169#1:542\n170#1:545\n172#1:548\n173#1:552\n175#1:556\n176#1:560\n177#1:564\n178#1:567\n202#1:570\n203#1:575\n205#1:578\n206#1:581\n85#1:441\n90#1:451\n95#1:461\n100#1:471\n134#1:475\n134#1:478\n148#1:480\n149#1:484\n151#1:488\n152#1:492\n156#1:502\n157#1:506\n159#1:510\n160#1:514\n164#1:524\n165#1:528\n167#1:532\n168#1:536\n172#1:546\n173#1:550\n175#1:554\n176#1:558\n*E\n"})
/* loaded from: classes2.dex */
public final /* data */ class RoundRect {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final RoundRect Zero = RoundRectKt.m21222RoundRectgG7oq9Y(0.0f, 0.0f, 0.0f, 0.0f, CornerRadius.INSTANCE.m21140getZerokKHJgLs());
    private RoundRect _scaledRadiiRect;
    private final float bottom;
    private final long bottomLeftCornerRadius;
    private final long bottomRightCornerRadius;
    private final float left;
    private final float right;
    private final float top;
    private final long topLeftCornerRadius;
    private final long topRightCornerRadius;

    @Metadata(m13412d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m13413d2 = {"Landroidx/compose/ui/geometry/RoundRect$Companion;", "", "()V", "Zero", "Landroidx/compose/ui/geometry/RoundRect;", "getZero$annotations", "getZero", "()Landroidx/compose/ui/geometry/RoundRect;", "ui-geometry_release"}, m13414k = 1, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public static /* synthetic */ void getZero$annotations() {
        }

        public final RoundRect getZero() {
            return RoundRect.Zero;
        }

        private Companion() {
        }
    }

    public /* synthetic */ RoundRect(float f10, float f11, float f12, float f13, long j9, long j10, long j11, long j12, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, f12, f13, j9, j10, j11, j12);
    }

    /* renamed from: copy-MDFrsts$default, reason: not valid java name */
    public static /* synthetic */ RoundRect m21209copyMDFrsts$default(RoundRect roundRect, float f10, float f11, float f12, float f13, long j9, long j10, long j11, long j12, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            f10 = roundRect.left;
        }
        if ((i9 & 2) != 0) {
            f11 = roundRect.top;
        }
        if ((i9 & 4) != 0) {
            f12 = roundRect.right;
        }
        if ((i9 & 8) != 0) {
            f13 = roundRect.bottom;
        }
        if ((i9 & 16) != 0) {
            j9 = roundRect.topLeftCornerRadius;
        }
        if ((i9 & 32) != 0) {
            j10 = roundRect.topRightCornerRadius;
        }
        if ((i9 & 64) != 0) {
            j11 = roundRect.bottomRightCornerRadius;
        }
        if ((i9 & 128) != 0) {
            j12 = roundRect.bottomLeftCornerRadius;
        }
        long j13 = j12;
        long j14 = j11;
        long j15 = j10;
        long j16 = j9;
        return roundRect.m21215copyMDFrsts(f10, f11, f12, f13, j16, j15, j14, j13);
    }

    public static final RoundRect getZero() {
        return INSTANCE.getZero();
    }

    private final float minRadius(float min, float radius1, float radius2, float limit) {
        float f10 = radius1 + radius2;
        return (f10 <= limit || f10 == 0.0f) ? min : Math.min(min, limit / f10);
    }

    private final RoundRect scaledRadiiRect() {
        RoundRect roundRect = this._scaledRadiiRect;
        if (roundRect != null) {
            return roundRect;
        }
        float fMinRadius = minRadius(minRadius(minRadius(minRadius(1.0f, Float.intBitsToFloat((int) (this.bottomLeftCornerRadius & 4294967295L)), Float.intBitsToFloat((int) (this.topLeftCornerRadius & 4294967295L)), getHeight()), Float.intBitsToFloat((int) (this.topLeftCornerRadius >> 32)), Float.intBitsToFloat((int) (this.topRightCornerRadius >> 32)), getWidth()), Float.intBitsToFloat((int) (this.topRightCornerRadius & 4294967295L)), Float.intBitsToFloat((int) (this.bottomRightCornerRadius & 4294967295L)), getHeight()), Float.intBitsToFloat((int) (this.bottomRightCornerRadius >> 32)), Float.intBitsToFloat((int) (this.bottomLeftCornerRadius >> 32)), getWidth());
        float f10 = this.left * fMinRadius;
        float f11 = this.top * fMinRadius;
        float f12 = this.right * fMinRadius;
        float f13 = this.bottom * fMinRadius;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.topLeftCornerRadius >> 32)) * fMinRadius;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.topLeftCornerRadius & 4294967295L)) * fMinRadius;
        long jM21122constructorimpl = CornerRadius.m21122constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (this.topRightCornerRadius >> 32)) * fMinRadius;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (this.topRightCornerRadius & 4294967295L)) * fMinRadius;
        long jM21122constructorimpl2 = CornerRadius.m21122constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat4) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat3) << 32));
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (this.bottomRightCornerRadius >> 32)) * fMinRadius;
        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (this.bottomRightCornerRadius & 4294967295L)) * fMinRadius;
        long jM21122constructorimpl3 = CornerRadius.m21122constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat6) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat5) << 32));
        float fIntBitsToFloat7 = Float.intBitsToFloat((int) (this.bottomLeftCornerRadius >> 32)) * fMinRadius;
        float fIntBitsToFloat8 = Float.intBitsToFloat((int) (this.bottomLeftCornerRadius & 4294967295L)) * fMinRadius;
        RoundRect roundRect2 = new RoundRect(f10, f11, f12, f13, jM21122constructorimpl, jM21122constructorimpl2, jM21122constructorimpl3, CornerRadius.m21122constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat7) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat8) & 4294967295L)), null);
        this._scaledRadiiRect = roundRect2;
        return roundRect2;
    }

    /* renamed from: component1, reason: from getter */
    public final float getLeft() {
        return this.left;
    }

    /* renamed from: component2, reason: from getter */
    public final float getTop() {
        return this.top;
    }

    /* renamed from: component3, reason: from getter */
    public final float getRight() {
        return this.right;
    }

    /* renamed from: component4, reason: from getter */
    public final float getBottom() {
        return this.bottom;
    }

    /* renamed from: component5-kKHJgLs, reason: not valid java name and from getter */
    public final long getTopLeftCornerRadius() {
        return this.topLeftCornerRadius;
    }

    /* renamed from: component6-kKHJgLs, reason: not valid java name and from getter */
    public final long getTopRightCornerRadius() {
        return this.topRightCornerRadius;
    }

    /* renamed from: component7-kKHJgLs, reason: not valid java name and from getter */
    public final long getBottomRightCornerRadius() {
        return this.bottomRightCornerRadius;
    }

    /* renamed from: component8-kKHJgLs, reason: not valid java name and from getter */
    public final long getBottomLeftCornerRadius() {
        return this.bottomLeftCornerRadius;
    }

    /* renamed from: contains-k-4lQ0M, reason: not valid java name */
    public final boolean m21214containsk4lQ0M(long point) {
        float fIntBitsToFloat;
        float fIntBitsToFloat2;
        float fIntBitsToFloat3;
        float fIntBitsToFloat4;
        int i9 = (int) (point >> 32);
        if (Float.intBitsToFloat(i9) >= this.left && Float.intBitsToFloat(i9) < this.right) {
            int i10 = (int) (point & 4294967295L);
            if (Float.intBitsToFloat(i10) >= this.top && Float.intBitsToFloat(i10) < this.bottom) {
                RoundRect roundRectScaledRadiiRect = scaledRadiiRect();
                if (Float.intBitsToFloat(i9) < this.left + Float.intBitsToFloat((int) (roundRectScaledRadiiRect.topLeftCornerRadius >> 32)) && Float.intBitsToFloat(i10) < this.top + Float.intBitsToFloat((int) (roundRectScaledRadiiRect.topLeftCornerRadius & 4294967295L))) {
                    fIntBitsToFloat = (Float.intBitsToFloat(i9) - this.left) - Float.intBitsToFloat((int) (roundRectScaledRadiiRect.topLeftCornerRadius >> 32));
                    fIntBitsToFloat2 = (Float.intBitsToFloat(i10) - this.top) - Float.intBitsToFloat((int) (roundRectScaledRadiiRect.topLeftCornerRadius & 4294967295L));
                    fIntBitsToFloat3 = Float.intBitsToFloat((int) (roundRectScaledRadiiRect.topLeftCornerRadius >> 32));
                    fIntBitsToFloat4 = Float.intBitsToFloat((int) (4294967295L & roundRectScaledRadiiRect.topLeftCornerRadius));
                } else if (Float.intBitsToFloat(i9) > this.right - Float.intBitsToFloat((int) (roundRectScaledRadiiRect.topRightCornerRadius >> 32)) && Float.intBitsToFloat(i10) < this.top + Float.intBitsToFloat((int) (roundRectScaledRadiiRect.topRightCornerRadius & 4294967295L))) {
                    fIntBitsToFloat = (Float.intBitsToFloat(i9) - this.right) + Float.intBitsToFloat((int) (roundRectScaledRadiiRect.topRightCornerRadius >> 32));
                    fIntBitsToFloat2 = (Float.intBitsToFloat(i10) - this.top) - Float.intBitsToFloat((int) (roundRectScaledRadiiRect.topRightCornerRadius & 4294967295L));
                    fIntBitsToFloat3 = Float.intBitsToFloat((int) (roundRectScaledRadiiRect.topRightCornerRadius >> 32));
                    fIntBitsToFloat4 = Float.intBitsToFloat((int) (4294967295L & roundRectScaledRadiiRect.topRightCornerRadius));
                } else if (Float.intBitsToFloat(i9) > this.right - Float.intBitsToFloat((int) (roundRectScaledRadiiRect.bottomRightCornerRadius >> 32)) && Float.intBitsToFloat(i10) > this.bottom - Float.intBitsToFloat((int) (roundRectScaledRadiiRect.bottomRightCornerRadius & 4294967295L))) {
                    fIntBitsToFloat = (Float.intBitsToFloat(i9) - this.right) + Float.intBitsToFloat((int) (roundRectScaledRadiiRect.bottomRightCornerRadius >> 32));
                    fIntBitsToFloat2 = (Float.intBitsToFloat(i10) - this.bottom) + Float.intBitsToFloat((int) (roundRectScaledRadiiRect.bottomRightCornerRadius & 4294967295L));
                    fIntBitsToFloat3 = Float.intBitsToFloat((int) (roundRectScaledRadiiRect.bottomRightCornerRadius >> 32));
                    fIntBitsToFloat4 = Float.intBitsToFloat((int) (4294967295L & roundRectScaledRadiiRect.bottomRightCornerRadius));
                } else {
                    if (Float.intBitsToFloat(i9) >= this.left + Float.intBitsToFloat((int) (roundRectScaledRadiiRect.bottomLeftCornerRadius >> 32)) || Float.intBitsToFloat(i10) <= this.bottom - Float.intBitsToFloat((int) (roundRectScaledRadiiRect.bottomLeftCornerRadius & 4294967295L))) {
                        return true;
                    }
                    fIntBitsToFloat = (Float.intBitsToFloat(i9) - this.left) - Float.intBitsToFloat((int) (roundRectScaledRadiiRect.bottomLeftCornerRadius >> 32));
                    fIntBitsToFloat2 = (Float.intBitsToFloat(i10) - this.bottom) + Float.intBitsToFloat((int) (roundRectScaledRadiiRect.bottomLeftCornerRadius & 4294967295L));
                    fIntBitsToFloat3 = Float.intBitsToFloat((int) (roundRectScaledRadiiRect.bottomLeftCornerRadius >> 32));
                    fIntBitsToFloat4 = Float.intBitsToFloat((int) (4294967295L & roundRectScaledRadiiRect.bottomLeftCornerRadius));
                }
                float f10 = fIntBitsToFloat / fIntBitsToFloat3;
                float f11 = fIntBitsToFloat2 / fIntBitsToFloat4;
                return (f10 * f10) + (f11 * f11) <= 1.0f;
            }
        }
        return false;
    }

    /* renamed from: copy-MDFrsts, reason: not valid java name */
    public final RoundRect m21215copyMDFrsts(float left, float top2, float right, float bottom, long topLeftCornerRadius, long topRightCornerRadius, long bottomRightCornerRadius, long bottomLeftCornerRadius) {
        return new RoundRect(left, top2, right, bottom, topLeftCornerRadius, topRightCornerRadius, bottomRightCornerRadius, bottomLeftCornerRadius, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RoundRect)) {
            return false;
        }
        RoundRect roundRect = (RoundRect) other;
        return Float.compare(this.left, roundRect.left) == 0 && Float.compare(this.top, roundRect.top) == 0 && Float.compare(this.right, roundRect.right) == 0 && Float.compare(this.bottom, roundRect.bottom) == 0 && CornerRadius.m21127equalsimpl0(this.topLeftCornerRadius, roundRect.topLeftCornerRadius) && CornerRadius.m21127equalsimpl0(this.topRightCornerRadius, roundRect.topRightCornerRadius) && CornerRadius.m21127equalsimpl0(this.bottomRightCornerRadius, roundRect.bottomRightCornerRadius) && CornerRadius.m21127equalsimpl0(this.bottomLeftCornerRadius, roundRect.bottomLeftCornerRadius);
    }

    public final float getBottom() {
        return this.bottom;
    }

    /* renamed from: getBottomLeftCornerRadius-kKHJgLs, reason: not valid java name */
    public final long m21216getBottomLeftCornerRadiuskKHJgLs() {
        return this.bottomLeftCornerRadius;
    }

    /* renamed from: getBottomRightCornerRadius-kKHJgLs, reason: not valid java name */
    public final long m21217getBottomRightCornerRadiuskKHJgLs() {
        return this.bottomRightCornerRadius;
    }

    public final float getHeight() {
        return this.bottom - this.top;
    }

    public final float getLeft() {
        return this.left;
    }

    public final float getRight() {
        return this.right;
    }

    public final float getTop() {
        return this.top;
    }

    /* renamed from: getTopLeftCornerRadius-kKHJgLs, reason: not valid java name */
    public final long m21218getTopLeftCornerRadiuskKHJgLs() {
        return this.topLeftCornerRadius;
    }

    /* renamed from: getTopRightCornerRadius-kKHJgLs, reason: not valid java name */
    public final long m21219getTopRightCornerRadiuskKHJgLs() {
        return this.topRightCornerRadius;
    }

    public final float getWidth() {
        return this.right - this.left;
    }

    public int hashCode() {
        return (((((((((((((Float.hashCode(this.left) * 31) + Float.hashCode(this.top)) * 31) + Float.hashCode(this.right)) * 31) + Float.hashCode(this.bottom)) * 31) + CornerRadius.m21130hashCodeimpl(this.topLeftCornerRadius)) * 31) + CornerRadius.m21130hashCodeimpl(this.topRightCornerRadius)) * 31) + CornerRadius.m21130hashCodeimpl(this.bottomRightCornerRadius)) * 31) + CornerRadius.m21130hashCodeimpl(this.bottomLeftCornerRadius);
    }

    public String toString() {
        long j9 = this.topLeftCornerRadius;
        long j10 = this.topRightCornerRadius;
        long j11 = this.bottomRightCornerRadius;
        long j12 = this.bottomLeftCornerRadius;
        String str = GeometryUtilsKt.toStringAsFixed(this.left, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.top, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.right, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.bottom, 1);
        if (!CornerRadius.m21127equalsimpl0(j9, j10) || !CornerRadius.m21127equalsimpl0(j10, j11) || !CornerRadius.m21127equalsimpl0(j11, j12)) {
            return "RoundRect(rect=" + str + ", topLeft=" + ((Object) CornerRadius.m21136toStringimpl(j9)) + ", topRight=" + ((Object) CornerRadius.m21136toStringimpl(j10)) + ", bottomRight=" + ((Object) CornerRadius.m21136toStringimpl(j11)) + ", bottomLeft=" + ((Object) CornerRadius.m21136toStringimpl(j12)) + ')';
        }
        int i9 = (int) (j9 >> 32);
        int i10 = (int) (j9 & 4294967295L);
        if (Float.intBitsToFloat(i9) == Float.intBitsToFloat(i10)) {
            return "RoundRect(rect=" + str + ", radius=" + GeometryUtilsKt.toStringAsFixed(Float.intBitsToFloat(i9), 1) + ')';
        }
        return "RoundRect(rect=" + str + ", x=" + GeometryUtilsKt.toStringAsFixed(Float.intBitsToFloat(i9), 1) + ", y=" + GeometryUtilsKt.toStringAsFixed(Float.intBitsToFloat(i10), 1) + ')';
    }

    private RoundRect(float f10, float f11, float f12, float f13, long j9, long j10, long j11, long j12) {
        this.left = f10;
        this.top = f11;
        this.right = f12;
        this.bottom = f13;
        this.topLeftCornerRadius = j9;
        this.topRightCornerRadius = j10;
        this.bottomRightCornerRadius = j11;
        this.bottomLeftCornerRadius = j12;
    }

    public /* synthetic */ RoundRect(float f10, float f11, float f12, float f13, long j9, long j10, long j11, long j12, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, f12, f13, (i9 & 16) != 0 ? CornerRadius.INSTANCE.m21140getZerokKHJgLs() : j9, (i9 & 32) != 0 ? CornerRadius.INSTANCE.m21140getZerokKHJgLs() : j10, (i9 & 64) != 0 ? CornerRadius.INSTANCE.m21140getZerokKHJgLs() : j11, (i9 & 128) != 0 ? CornerRadius.INSTANCE.m21140getZerokKHJgLs() : j12, null);
    }
}
