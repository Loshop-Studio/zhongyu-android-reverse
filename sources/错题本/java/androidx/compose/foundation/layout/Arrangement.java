package androidx.compose.foundation.layout;

import androidx.collection.AbstractC0584a;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.unit.C2331Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.LayoutDirection;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6473e;

@Immutable
@Metadata(m5109d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b:\bÇ\u0002\u0018\u00002\u00020\u0001:\u0005NOPQRB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J6\u0010\u000b\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0082\b¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\"\u0010\u0012\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0013H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\"\u0010\u0012\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0018H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001b\u0010\u001dJ/\u0010$\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\"\u0010#J'\u0010'\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0005H\u0000¢\u0006\u0004\b%\u0010&J/\u0010)\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0005H\u0000¢\u0006\u0004\b(\u0010#J/\u0010+\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0005H\u0000¢\u0006\u0004\b*\u0010#J/\u0010-\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0005H\u0000¢\u0006\u0004\b,\u0010#J/\u0010/\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0005H\u0000¢\u0006\u0004\b.\u0010#R \u00100\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b0\u00101\u0012\u0004\b4\u0010\u0003\u001a\u0004\b2\u00103R \u00105\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b5\u00101\u0012\u0004\b7\u0010\u0003\u001a\u0004\b6\u00103R \u00108\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b8\u00109\u0012\u0004\b<\u0010\u0003\u001a\u0004\b:\u0010;R \u0010=\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b=\u00109\u0012\u0004\b?\u0010\u0003\u001a\u0004\b>\u0010;R \u0010@\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b@\u0010A\u0012\u0004\bD\u0010\u0003\u001a\u0004\bB\u0010CR \u0010E\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bE\u0010A\u0012\u0004\bG\u0010\u0003\u001a\u0004\bF\u0010CR \u0010H\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bH\u0010A\u0012\u0004\bJ\u0010\u0003\u001a\u0004\bI\u0010CR \u0010K\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bK\u0010A\u0012\u0004\bM\u0010\u0003\u001a\u0004\bL\u0010C\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006S"}, m5110d2 = {"Landroidx/compose/foundation/layout/Arrangement;", "", "<init>", "()V", "", "", "reversed", "Lkotlin/Function2;", "", "Ld6/s;", "action", "forEachIndexed", "([IZLr6/e;)V", "Landroidx/compose/ui/unit/Dp;", "space", "Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;", "spacedBy-0680j_4", "(F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;", "spacedBy", "Landroidx/compose/ui/Alignment$Horizontal;", "alignment", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "spacedBy-D5KLDUw", "(FLandroidx/compose/ui/Alignment$Horizontal;)Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "Landroidx/compose/ui/Alignment$Vertical;", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "(FLandroidx/compose/ui/Alignment$Vertical;)Landroidx/compose/foundation/layout/Arrangement$Vertical;", "aligned", "(Landroidx/compose/ui/Alignment$Horizontal;)Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "(Landroidx/compose/ui/Alignment$Vertical;)Landroidx/compose/foundation/layout/Arrangement$Vertical;", "totalSize", "size", "outPosition", "reverseInput", "placeRightOrBottom$foundation_layout_release", "(I[I[IZ)V", "placeRightOrBottom", "placeLeftOrTop$foundation_layout_release", "([I[IZ)V", "placeLeftOrTop", "placeCenter$foundation_layout_release", "placeCenter", "placeSpaceEvenly$foundation_layout_release", "placeSpaceEvenly", "placeSpaceBetween$foundation_layout_release", "placeSpaceBetween", "placeSpaceAround$foundation_layout_release", "placeSpaceAround", "Start", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "getStart", "()Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "getStart$annotations", "End", "getEnd", "getEnd$annotations", "Top", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "getTop", "()Landroidx/compose/foundation/layout/Arrangement$Vertical;", "getTop$annotations", "Bottom", "getBottom", "getBottom$annotations", "Center", "Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;", "getCenter", "()Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;", "getCenter$annotations", "SpaceEvenly", "getSpaceEvenly", "getSpaceEvenly$annotations", "SpaceBetween", "getSpaceBetween", "getSpaceBetween$annotations", "SpaceAround", "getSpaceAround", "getSpaceAround$annotations", "Absolute", "Horizontal", "HorizontalOrVertical", "SpacedAligned", "Vertical", "foundation-layout_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,711:1\n702#1,2:717\n705#1,5:722\n702#1,2:727\n705#1,5:732\n702#1,2:740\n705#1,5:746\n702#1,2:754\n705#1,5:760\n702#1,2:768\n705#1,5:774\n702#1,2:782\n705#1,5:788\n113#2:712\n113#2:713\n12762#3,3:714\n13404#3,3:719\n13404#3,3:729\n12762#3,3:737\n13404#3,2:742\n13406#3:745\n12762#3,3:751\n13404#3,2:756\n13406#3:759\n12762#3,3:765\n13404#3,2:770\n13406#3:773\n12762#3,3:779\n13404#3,2:784\n13406#3:787\n13404#3,3:793\n26#4:744\n26#4:758\n26#4:772\n26#4:786\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement\n*L\n614#1:717,2\n614#1:722,5\n622#1:727,2\n622#1:732,5\n636#1:740,2\n636#1:746,5\n651#1:754,2\n651#1:760,5\n675#1:768,2\n675#1:774,5\n695#1:782,2\n695#1:788,5\n339#1:712\n351#1:713\n612#1:714,3\n614#1:719,3\n622#1:729,3\n634#1:737,3\n636#1:742,2\n636#1:745\n648#1:751,3\n651#1:756,2\n651#1:759\n665#1:765,3\n675#1:770,2\n675#1:773\n687#1:779,3\n695#1:784,2\n695#1:787\n703#1:793,3\n637#1:744\n652#1:758\n676#1:772\n696#1:786\n*E\n"})
/* loaded from: classes.dex */
public final class Arrangement {
    public static final int $stable = 0;

    @NotNull
    public static final Arrangement INSTANCE = new Arrangement();

    @NotNull
    private static final Horizontal Start = new Horizontal() { // from class: androidx.compose.foundation.layout.Arrangement$Start$1
        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
        public void arrange(Density density, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.INSTANCE.placeLeftOrTop$foundation_layout_release(iArr, iArr2, false);
            } else {
                Arrangement.INSTANCE.placeRightOrBottom$foundation_layout_release(i, iArr, iArr2, true);
            }
        }

        public String toString() {
            return "Arrangement#Start";
        }
    };

    @NotNull
    private static final Horizontal End = new Horizontal() { // from class: androidx.compose.foundation.layout.Arrangement$End$1
        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
        public void arrange(Density density, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.INSTANCE.placeRightOrBottom$foundation_layout_release(i, iArr, iArr2, false);
            } else {
                Arrangement.INSTANCE.placeLeftOrTop$foundation_layout_release(iArr, iArr2, true);
            }
        }

        public String toString() {
            return "Arrangement#End";
        }
    };

    @NotNull
    private static final Vertical Top = new Vertical() { // from class: androidx.compose.foundation.layout.Arrangement$Top$1
        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        public void arrange(Density density, int i, int[] iArr, int[] iArr2) {
            Arrangement.INSTANCE.placeLeftOrTop$foundation_layout_release(iArr, iArr2, false);
        }

        public String toString() {
            return "Arrangement#Top";
        }
    };

    @NotNull
    private static final Vertical Bottom = new Vertical() { // from class: androidx.compose.foundation.layout.Arrangement$Bottom$1
        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        public void arrange(Density density, int i, int[] iArr, int[] iArr2) {
            Arrangement.INSTANCE.placeRightOrBottom$foundation_layout_release(i, iArr, iArr2, false);
        }

        public String toString() {
            return "Arrangement#Bottom";
        }
    };

    @NotNull
    private static final HorizontalOrVertical Center = new HorizontalOrVertical() { // from class: androidx.compose.foundation.layout.Arrangement$Center$1
        private final float spacing = C2331Dp.m13305constructorimpl(0);

        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
        public void arrange(Density density, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.INSTANCE.placeCenter$foundation_layout_release(i, iArr, iArr2, false);
            } else {
                Arrangement.INSTANCE.placeCenter$foundation_layout_release(i, iArr, iArr2, true);
            }
        }

        @Override // androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical, androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
        /* renamed from: getSpacing-D9Ej5fM, reason: not valid java name and from getter */
        public float getSpacing() {
            return this.spacing;
        }

        public String toString() {
            return "Arrangement#Center";
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        public void arrange(Density density, int i, int[] iArr, int[] iArr2) {
            Arrangement.INSTANCE.placeCenter$foundation_layout_release(i, iArr, iArr2, false);
        }
    };

    @NotNull
    private static final HorizontalOrVertical SpaceEvenly = new HorizontalOrVertical() { // from class: androidx.compose.foundation.layout.Arrangement$SpaceEvenly$1
        private final float spacing = C2331Dp.m13305constructorimpl(0);

        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
        public void arrange(Density density, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.INSTANCE.placeSpaceEvenly$foundation_layout_release(i, iArr, iArr2, false);
            } else {
                Arrangement.INSTANCE.placeSpaceEvenly$foundation_layout_release(i, iArr, iArr2, true);
            }
        }

        @Override // androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical, androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
        /* renamed from: getSpacing-D9Ej5fM, reason: from getter */
        public float getSpacing() {
            return this.spacing;
        }

        public String toString() {
            return "Arrangement#SpaceEvenly";
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        public void arrange(Density density, int i, int[] iArr, int[] iArr2) {
            Arrangement.INSTANCE.placeSpaceEvenly$foundation_layout_release(i, iArr, iArr2, false);
        }
    };

    @NotNull
    private static final HorizontalOrVertical SpaceBetween = new HorizontalOrVertical() { // from class: androidx.compose.foundation.layout.Arrangement$SpaceBetween$1
        private final float spacing = C2331Dp.m13305constructorimpl(0);

        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
        public void arrange(Density density, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.INSTANCE.placeSpaceBetween$foundation_layout_release(i, iArr, iArr2, false);
            } else {
                Arrangement.INSTANCE.placeSpaceBetween$foundation_layout_release(i, iArr, iArr2, true);
            }
        }

        @Override // androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical, androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
        /* renamed from: getSpacing-D9Ej5fM, reason: from getter */
        public float getSpacing() {
            return this.spacing;
        }

        public String toString() {
            return "Arrangement#SpaceBetween";
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        public void arrange(Density density, int i, int[] iArr, int[] iArr2) {
            Arrangement.INSTANCE.placeSpaceBetween$foundation_layout_release(i, iArr, iArr2, false);
        }
    };

    @NotNull
    private static final HorizontalOrVertical SpaceAround = new HorizontalOrVertical() { // from class: androidx.compose.foundation.layout.Arrangement$SpaceAround$1
        private final float spacing = C2331Dp.m13305constructorimpl(0);

        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
        public void arrange(Density density, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.INSTANCE.placeSpaceAround$foundation_layout_release(i, iArr, iArr2, false);
            } else {
                Arrangement.INSTANCE.placeSpaceAround$foundation_layout_release(i, iArr, iArr2, true);
            }
        }

        @Override // androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical, androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
        /* renamed from: getSpacing-D9Ej5fM, reason: from getter */
        public float getSpacing() {
            return this.spacing;
        }

        public String toString() {
            return "Arrangement#SpaceAround";
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        public void arrange(Density density, int i, int[] iArr, int[] iArr2) {
            Arrangement.INSTANCE.placeSpaceAround$foundation_layout_release(i, iArr, iArr2, false);
        }
    };

    @Metadata(m5109d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0019H\u0007J\u001a\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\"\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\b \u0010!J\"\u0010\u001a\u001a\u00020\"2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020#H\u0007ø\u0001\u0000¢\u0006\u0004\b \u0010$R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u0007R\u001c\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\u0002\u001a\u0004\b\r\u0010\u0007R\u001c\u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0002\u001a\u0004\b\u0010\u0010\u0007R\u001c\u0010\u0011\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u0002\u001a\u0004\b\u0013\u0010\u0007R\u001c\u0010\u0014\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0002\u001a\u0004\b\u0016\u0010\u0007\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006%"}, m5110d2 = {"Landroidx/compose/foundation/layout/Arrangement$Absolute;", "", "()V", "Center", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "getCenter$annotations", "getCenter", "()Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "Left", "getLeft$annotations", "getLeft", "Right", "getRight$annotations", "getRight", "SpaceAround", "getSpaceAround$annotations", "getSpaceAround", "SpaceBetween", "getSpaceBetween$annotations", "getSpaceBetween", "SpaceEvenly", "getSpaceEvenly$annotations", "getSpaceEvenly", "aligned", "alignment", "Landroidx/compose/ui/Alignment$Horizontal;", "spacedBy", "Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;", "space", "Landroidx/compose/ui/unit/Dp;", "spacedBy-0680j_4", "(F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;", "spacedBy-D5KLDUw", "(FLandroidx/compose/ui/Alignment$Horizontal;)Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "Landroidx/compose/ui/Alignment$Vertical;", "(FLandroidx/compose/ui/Alignment$Vertical;)Landroidx/compose/foundation/layout/Arrangement$Vertical;", "foundation-layout_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @Immutable
    @SourceDebugExtension({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$Absolute\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,711:1\n113#2:712\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$Absolute\n*L\n554#1:712\n*E\n"})
    public static final class Absolute {
        public static final int $stable = 0;

        @NotNull
        public static final Absolute INSTANCE = new Absolute();

        @NotNull
        private static final Horizontal Left = new Horizontal() { // from class: androidx.compose.foundation.layout.Arrangement$Absolute$Left$1
            @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
            public void arrange(Density density, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
                Arrangement.INSTANCE.placeLeftOrTop$foundation_layout_release(iArr, iArr2, false);
            }

            public String toString() {
                return "AbsoluteArrangement#Left";
            }
        };

        @NotNull
        private static final Horizontal Center = new Horizontal() { // from class: androidx.compose.foundation.layout.Arrangement$Absolute$Center$1
            @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
            public void arrange(Density density, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
                Arrangement.INSTANCE.placeCenter$foundation_layout_release(i, iArr, iArr2, false);
            }

            public String toString() {
                return "AbsoluteArrangement#Center";
            }
        };

        @NotNull
        private static final Horizontal Right = new Horizontal() { // from class: androidx.compose.foundation.layout.Arrangement$Absolute$Right$1
            @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
            public void arrange(Density density, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
                Arrangement.INSTANCE.placeRightOrBottom$foundation_layout_release(i, iArr, iArr2, false);
            }

            public String toString() {
                return "AbsoluteArrangement#Right";
            }
        };

        @NotNull
        private static final Horizontal SpaceBetween = new Horizontal() { // from class: androidx.compose.foundation.layout.Arrangement$Absolute$SpaceBetween$1
            @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
            public void arrange(Density density, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
                Arrangement.INSTANCE.placeSpaceBetween$foundation_layout_release(i, iArr, iArr2, false);
            }

            public String toString() {
                return "AbsoluteArrangement#SpaceBetween";
            }
        };

        @NotNull
        private static final Horizontal SpaceEvenly = new Horizontal() { // from class: androidx.compose.foundation.layout.Arrangement$Absolute$SpaceEvenly$1
            @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
            public void arrange(Density density, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
                Arrangement.INSTANCE.placeSpaceEvenly$foundation_layout_release(i, iArr, iArr2, false);
            }

            public String toString() {
                return "AbsoluteArrangement#SpaceEvenly";
            }
        };

        @NotNull
        private static final Horizontal SpaceAround = new Horizontal() { // from class: androidx.compose.foundation.layout.Arrangement$Absolute$SpaceAround$1
            @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
            public void arrange(Density density, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
                Arrangement.INSTANCE.placeSpaceAround$foundation_layout_release(i, iArr, iArr2, false);
            }

            public String toString() {
                return "AbsoluteArrangement#SpaceAround";
            }
        };

        private Absolute() {
        }

        @Stable
        public static /* synthetic */ void getCenter$annotations() {
        }

        @Stable
        public static /* synthetic */ void getLeft$annotations() {
        }

        @Stable
        public static /* synthetic */ void getRight$annotations() {
        }

        @Stable
        public static /* synthetic */ void getSpaceAround$annotations() {
        }

        @Stable
        public static /* synthetic */ void getSpaceBetween$annotations() {
        }

        @Stable
        public static /* synthetic */ void getSpaceEvenly$annotations() {
        }

        @Stable
        @NotNull
        public final Horizontal aligned(@NotNull final Alignment.Horizontal alignment) {
            return new SpacedAligned(C2331Dp.m13305constructorimpl(0), false, new InterfaceC6473e() { // from class: androidx.compose.foundation.layout.Arrangement$Absolute$aligned$1
                {
                    super(2);
                }

                @Override // p152r6.InterfaceC6473e
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return invoke(((Number) obj).intValue(), (LayoutDirection) obj2);
                }

                public final Integer invoke(int i, LayoutDirection layoutDirection) {
                    return Integer.valueOf(alignment.align(0, i, layoutDirection));
                }
            }, null);
        }

        @NotNull
        public final Horizontal getCenter() {
            return Center;
        }

        @NotNull
        public final Horizontal getLeft() {
            return Left;
        }

        @NotNull
        public final Horizontal getRight() {
            return Right;
        }

        @NotNull
        public final Horizontal getSpaceAround() {
            return SpaceAround;
        }

        @NotNull
        public final Horizontal getSpaceBetween() {
            return SpaceBetween;
        }

        @NotNull
        public final Horizontal getSpaceEvenly() {
            return SpaceEvenly;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Stable
        @NotNull
        /* renamed from: spacedBy-0680j_4, reason: not valid java name */
        public final HorizontalOrVertical m7146spacedBy0680j_4(float space) {
            return new SpacedAligned(space, false, null, 0 == true ? 1 : 0);
        }

        @Stable
        @NotNull
        /* renamed from: spacedBy-D5KLDUw, reason: not valid java name */
        public final Horizontal m7147spacedByD5KLDUw(float space, @NotNull final Alignment.Horizontal alignment) {
            return new SpacedAligned(space, false, new InterfaceC6473e() { // from class: androidx.compose.foundation.layout.Arrangement$Absolute$spacedBy$1
                {
                    super(2);
                }

                @Override // p152r6.InterfaceC6473e
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return invoke(((Number) obj).intValue(), (LayoutDirection) obj2);
                }

                public final Integer invoke(int i, LayoutDirection layoutDirection) {
                    return Integer.valueOf(alignment.align(0, i, layoutDirection));
                }
            }, null);
        }

        @Stable
        @NotNull
        /* renamed from: spacedBy-D5KLDUw, reason: not valid java name */
        public final Vertical m7148spacedByD5KLDUw(float space, @NotNull final Alignment.Vertical alignment) {
            return new SpacedAligned(space, false, new InterfaceC6473e() { // from class: androidx.compose.foundation.layout.Arrangement$Absolute$spacedBy$2
                {
                    super(2);
                }

                public final Integer invoke(int i, LayoutDirection layoutDirection) {
                    return Integer.valueOf(alignment.align(0, i));
                }

                @Override // p152r6.InterfaceC6473e
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return invoke(((Number) obj).intValue(), (LayoutDirection) obj2);
                }
            }, null);
        }
    }

    @Metadata(m5109d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J3\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H&¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\u00020\r8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0003"}, m5110d2 = {"Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "", "Landroidx/compose/ui/unit/Density;", "", "totalSize", "", "sizes", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "outPositions", "Ld6/s;", "arrange", "(Landroidx/compose/ui/unit/Density;I[ILandroidx/compose/ui/unit/LayoutDirection;[I)V", "Landroidx/compose/ui/unit/Dp;", "getSpacing-D9Ej5fM", "()F", "spacing", "foundation-layout_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @Stable
    @SourceDebugExtension({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$Horizontal\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,711:1\n113#2:712\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$Horizontal\n*L\n50#1:712\n*E\n"})
    public interface Horizontal {

        @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        public static final class DefaultImpls {
            @Deprecated
            /* renamed from: getSpacing-D9Ej5fM, reason: not valid java name */
            public static float m7151getSpacingD9Ej5fM(@NotNull Horizontal horizontal) {
                return Horizontal.super.getSpacing();
            }
        }

        void arrange(@NotNull Density density, int i, @NotNull int[] iArr, @NotNull LayoutDirection layoutDirection, @NotNull int[] iArr2);

        /* renamed from: getSpacing-D9Ej5fM */
        default float getSpacing() {
            return C2331Dp.m13305constructorimpl(0);
        }
    }

    @Metadata(m5109d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u00012\u00020\u0002R\u001a\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0003"}, m5110d2 = {"Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "spacing", "Landroidx/compose/ui/unit/Dp;", "getSpacing-D9Ej5fM", "()F", "foundation-layout_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @Stable
    @SourceDebugExtension({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,711:1\n113#2:712\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical\n*L\n101#1:712\n*E\n"})
    public interface HorizontalOrVertical extends Horizontal, Vertical {

        @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        public static final class DefaultImpls {
            @Deprecated
            /* renamed from: getSpacing-D9Ej5fM, reason: not valid java name */
            public static float m7153getSpacingD9Ej5fM(@NotNull HorizontalOrVertical horizontalOrVertical) {
                return HorizontalOrVertical.super.getSpacing();
            }
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
        /* renamed from: getSpacing-D9Ej5fM */
        default float getSpacing() {
            return C2331Dp.m13305constructorimpl(0);
        }
    }

    @Metadata(m5109d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u001a\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ3\u0010\u0013\u001a\u00020\u0012*\u00020\f2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u0013\u001a\u00020\u0012*\u00020\f2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u001b\u001a\u00020\u0002HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ$\u0010\u001e\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJE\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u001c\b\u0002\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001ø\u0001\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020\u00042\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u001dR+\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b.\u0010\u001fR \u0010/\u001a\u00020\u00028\u0016X\u0096\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b/\u0010)\u001a\u0004\b0\u0010\u001a\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00061"}, m5110d2 = {"Landroidx/compose/foundation/layout/Arrangement$SpacedAligned;", "Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;", "Landroidx/compose/ui/unit/Dp;", "space", "", "rtlMirror", "Lkotlin/Function2;", "", "Landroidx/compose/ui/unit/LayoutDirection;", "alignment", "<init>", "(FZLr6/e;Lkotlin/jvm/internal/e;)V", "Landroidx/compose/ui/unit/Density;", "totalSize", "", "sizes", "layoutDirection", "outPositions", "Ld6/s;", "arrange", "(Landroidx/compose/ui/unit/Density;I[ILandroidx/compose/ui/unit/LayoutDirection;[I)V", "(Landroidx/compose/ui/unit/Density;I[I[I)V", "", "toString", "()Ljava/lang/String;", "component1-D9Ej5fM", "()F", "component1", "component2", "()Z", "component3", "()Lr6/e;", "copy-8Feqmps", "(FZLr6/e;)Landroidx/compose/foundation/layout/Arrangement$SpacedAligned;", "copy", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "F", "getSpace-D9Ej5fM", "Z", "getRtlMirror", "Lr6/e;", "getAlignment", "spacing", "getSpacing-D9Ej5fM", "foundation-layout_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @Immutable
    @SourceDebugExtension({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$SpacedAligned\n+ 2 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,711:1\n702#2,2:712\n705#2,5:717\n13404#3,3:714\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$SpacedAligned\n*L\n584#1:712,2\n584#1:717,5\n584#1:714,3\n*E\n"})
    public static final /* data */ class SpacedAligned implements HorizontalOrVertical {
        public static final int $stable = 0;

        @Nullable
        private final InterfaceC6473e alignment;
        private final boolean rtlMirror;
        private final float space;
        private final float spacing;

        public /* synthetic */ SpacedAligned(float f, boolean z8, InterfaceC6473e interfaceC6473e, AbstractC5824e abstractC5824e) {
            this(f, z8, interfaceC6473e);
        }

        /* renamed from: copy-8Feqmps$default, reason: not valid java name */
        public static /* synthetic */ SpacedAligned m7154copy8Feqmps$default(SpacedAligned spacedAligned, float f, boolean z8, InterfaceC6473e interfaceC6473e, int i, Object obj) {
            if ((i & 1) != 0) {
                f = spacedAligned.space;
            }
            if ((i & 2) != 0) {
                z8 = spacedAligned.rtlMirror;
            }
            if ((i & 4) != 0) {
                interfaceC6473e = spacedAligned.alignment;
            }
            return spacedAligned.m7156copy8Feqmps(f, z8, interfaceC6473e);
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
        public void arrange(@NotNull Density density, int i, @NotNull int[] iArr, @NotNull LayoutDirection layoutDirection, @NotNull int[] iArr2) {
            int i8;
            int iMin;
            if (iArr.length == 0) {
                return;
            }
            int iMo6897roundToPx0680j_4 = density.mo6897roundToPx0680j_4(this.space);
            boolean z8 = this.rtlMirror && layoutDirection == LayoutDirection.Rtl;
            Arrangement arrangement = Arrangement.INSTANCE;
            if (z8) {
                i8 = 0;
                iMin = 0;
                for (int length = iArr.length - 1; -1 < length; length--) {
                    int i9 = iArr[length];
                    int iMin2 = Math.min(i8, i - i9);
                    iArr2[length] = iMin2;
                    iMin = Math.min(iMo6897roundToPx0680j_4, (i - iMin2) - i9);
                    i8 = iArr2[length] + i9 + iMin;
                }
            } else {
                int length2 = iArr.length;
                int i10 = 0;
                i8 = 0;
                iMin = 0;
                int i11 = 0;
                while (i10 < length2) {
                    int i12 = iArr[i10];
                    int iMin3 = Math.min(i8, i - i12);
                    iArr2[i11] = iMin3;
                    int iMin4 = Math.min(iMo6897roundToPx0680j_4, (i - iMin3) - i12);
                    int i13 = iArr2[i11] + i12 + iMin4;
                    i10++;
                    iMin = iMin4;
                    i8 = i13;
                    i11++;
                }
            }
            int i14 = i8 - iMin;
            InterfaceC6473e interfaceC6473e = this.alignment;
            if (interfaceC6473e == null || i14 >= i) {
                return;
            }
            int iIntValue = ((Number) interfaceC6473e.invoke(Integer.valueOf(i - i14), layoutDirection)).intValue();
            int length3 = iArr2.length;
            for (int i15 = 0; i15 < length3; i15++) {
                iArr2[i15] = iArr2[i15] + iIntValue;
            }
        }

        /* renamed from: component1-D9Ej5fM, reason: not valid java name and from getter */
        public final float getSpace() {
            return this.space;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getRtlMirror() {
            return this.rtlMirror;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final InterfaceC6473e getAlignment() {
            return this.alignment;
        }

        @NotNull
        /* renamed from: copy-8Feqmps, reason: not valid java name */
        public final SpacedAligned m7156copy8Feqmps(float space, boolean rtlMirror, @Nullable InterfaceC6473e alignment) {
            return new SpacedAligned(space, rtlMirror, alignment, null);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SpacedAligned)) {
                return false;
            }
            SpacedAligned spacedAligned = (SpacedAligned) other;
            return C2331Dp.m13310equalsimpl0(this.space, spacedAligned.space) && this.rtlMirror == spacedAligned.rtlMirror && AbstractC5830k.m5325b(this.alignment, spacedAligned.alignment);
        }

        @Nullable
        public final InterfaceC6473e getAlignment() {
            return this.alignment;
        }

        public final boolean getRtlMirror() {
            return this.rtlMirror;
        }

        /* renamed from: getSpace-D9Ej5fM, reason: not valid java name */
        public final float m7157getSpaceD9Ej5fM() {
            return this.space;
        }

        @Override // androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical, androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
        /* renamed from: getSpacing-D9Ej5fM, reason: from getter */
        public float getSpacing() {
            return this.spacing;
        }

        public int hashCode() {
            int iM908i = AbstractC0584a.m908i(this.rtlMirror, C2331Dp.m13311hashCodeimpl(this.space) * 31, 31);
            InterfaceC6473e interfaceC6473e = this.alignment;
            return iM908i + (interfaceC6473e == null ? 0 : interfaceC6473e.hashCode());
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.rtlMirror ? "" : "Absolute");
            sb.append("Arrangement#spacedAligned(");
            AbstractC0584a.m922w(sb, ", ", this.space);
            sb.append(this.alignment);
            sb.append(')');
            return sb.toString();
        }

        private SpacedAligned(float f, boolean z8, InterfaceC6473e interfaceC6473e) {
            this.space = f;
            this.rtlMirror = z8;
            this.alignment = interfaceC6473e;
            this.spacing = f;
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        public void arrange(@NotNull Density density, int i, @NotNull int[] iArr, @NotNull int[] iArr2) {
            arrange(density, i, iArr, LayoutDirection.Ltr, iArr2);
        }
    }

    @Metadata(m5109d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J+\u0010\t\u001a\u00020\b*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H&¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u000e\u001a\u00020\u000b8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\f\u0010\rø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0003"}, m5110d2 = {"Landroidx/compose/foundation/layout/Arrangement$Vertical;", "", "Landroidx/compose/ui/unit/Density;", "", "totalSize", "", "sizes", "outPositions", "Ld6/s;", "arrange", "(Landroidx/compose/ui/unit/Density;I[I[I)V", "Landroidx/compose/ui/unit/Dp;", "getSpacing-D9Ej5fM", "()F", "spacing", "foundation-layout_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @Stable
    @SourceDebugExtension({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$Vertical\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,711:1\n113#2:712\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$Vertical\n*L\n78#1:712\n*E\n"})
    public interface Vertical {

        @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        public static final class DefaultImpls {
            @Deprecated
            /* renamed from: getSpacing-D9Ej5fM, reason: not valid java name */
            public static float m7159getSpacingD9Ej5fM(@NotNull Vertical vertical) {
                return Vertical.super.getSpacing();
            }
        }

        void arrange(@NotNull Density density, int i, @NotNull int[] iArr, @NotNull int[] iArr2);

        /* renamed from: getSpacing-D9Ej5fM */
        default float getSpacing() {
            return C2331Dp.m13305constructorimpl(0);
        }
    }

    private Arrangement() {
    }

    private final void forEachIndexed(int[] iArr, boolean z8, InterfaceC6473e interfaceC6473e) {
        if (!z8) {
            int length = iArr.length;
            int i = 0;
            int i8 = 0;
            while (i < length) {
                interfaceC6473e.invoke(Integer.valueOf(i8), Integer.valueOf(iArr[i]));
                i++;
                i8++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            } else {
                interfaceC6473e.invoke(Integer.valueOf(length2), Integer.valueOf(iArr[length2]));
            }
        }
    }

    @Stable
    public static /* synthetic */ void getBottom$annotations() {
    }

    @Stable
    public static /* synthetic */ void getCenter$annotations() {
    }

    @Stable
    public static /* synthetic */ void getEnd$annotations() {
    }

    @Stable
    public static /* synthetic */ void getSpaceAround$annotations() {
    }

    @Stable
    public static /* synthetic */ void getSpaceBetween$annotations() {
    }

    @Stable
    public static /* synthetic */ void getSpaceEvenly$annotations() {
    }

    @Stable
    public static /* synthetic */ void getStart$annotations() {
    }

    @Stable
    public static /* synthetic */ void getTop$annotations() {
    }

    @Stable
    @NotNull
    public final Horizontal aligned(@NotNull final Alignment.Horizontal alignment) {
        return new SpacedAligned(C2331Dp.m13305constructorimpl(0), true, new InterfaceC6473e() { // from class: androidx.compose.foundation.layout.Arrangement.aligned.1
            {
                super(2);
            }

            @Override // p152r6.InterfaceC6473e
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Number) obj).intValue(), (LayoutDirection) obj2);
            }

            public final Integer invoke(int i, LayoutDirection layoutDirection) {
                return Integer.valueOf(alignment.align(0, i, layoutDirection));
            }
        }, null);
    }

    @NotNull
    public final Vertical getBottom() {
        return Bottom;
    }

    @NotNull
    public final HorizontalOrVertical getCenter() {
        return Center;
    }

    @NotNull
    public final Horizontal getEnd() {
        return End;
    }

    @NotNull
    public final HorizontalOrVertical getSpaceAround() {
        return SpaceAround;
    }

    @NotNull
    public final HorizontalOrVertical getSpaceBetween() {
        return SpaceBetween;
    }

    @NotNull
    public final HorizontalOrVertical getSpaceEvenly() {
        return SpaceEvenly;
    }

    @NotNull
    public final Horizontal getStart() {
        return Start;
    }

    @NotNull
    public final Vertical getTop() {
        return Top;
    }

    public final void placeCenter$foundation_layout_release(int totalSize, @NotNull int[] size, @NotNull int[] outPosition, boolean reverseInput) {
        int i = 0;
        int i8 = 0;
        for (int i9 : size) {
            i8 += i9;
        }
        float f = (totalSize - i8) / 2;
        if (!reverseInput) {
            int length = size.length;
            int i10 = 0;
            while (i < length) {
                int i11 = size[i];
                outPosition[i10] = Math.round(f);
                f += i11;
                i++;
                i10++;
            }
            return;
        }
        int length2 = size.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i12 = size[length2];
            outPosition[length2] = Math.round(f);
            f += i12;
        }
    }

    public final void placeLeftOrTop$foundation_layout_release(@NotNull int[] size, @NotNull int[] outPosition, boolean reverseInput) {
        int i = 0;
        if (!reverseInput) {
            int length = size.length;
            int i8 = 0;
            int i9 = 0;
            while (i < length) {
                int i10 = size[i];
                outPosition[i8] = i9;
                i9 += i10;
                i++;
                i8++;
            }
            return;
        }
        int length2 = size.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i11 = size[length2];
            outPosition[length2] = i;
            i += i11;
        }
    }

    public final void placeRightOrBottom$foundation_layout_release(int totalSize, @NotNull int[] size, @NotNull int[] outPosition, boolean reverseInput) {
        int i = 0;
        int i8 = 0;
        for (int i9 : size) {
            i8 += i9;
        }
        int i10 = totalSize - i8;
        if (!reverseInput) {
            int length = size.length;
            int i11 = 0;
            while (i < length) {
                int i12 = size[i];
                outPosition[i11] = i10;
                i10 += i12;
                i++;
                i11++;
            }
            return;
        }
        int length2 = size.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i13 = size[length2];
            outPosition[length2] = i10;
            i10 += i13;
        }
    }

    public final void placeSpaceAround$foundation_layout_release(int totalSize, @NotNull int[] size, @NotNull int[] outPosition, boolean reverseInput) {
        int i = 0;
        int i8 = 0;
        for (int i9 : size) {
            i8 += i9;
        }
        float length = !(size.length == 0) ? (totalSize - i8) / size.length : 0.0f;
        float f = length / 2;
        if (reverseInput) {
            for (int length2 = size.length - 1; -1 < length2; length2--) {
                int i10 = size[length2];
                outPosition[length2] = Math.round(f);
                f += i10 + length;
            }
            return;
        }
        int length3 = size.length;
        int i11 = 0;
        while (i < length3) {
            int i12 = size[i];
            outPosition[i11] = Math.round(f);
            f += i12 + length;
            i++;
            i11++;
        }
    }

    public final void placeSpaceBetween$foundation_layout_release(int totalSize, @NotNull int[] size, @NotNull int[] outPosition, boolean reverseInput) {
        if (size.length == 0) {
            return;
        }
        int i = 0;
        int i8 = 0;
        for (int i9 : size) {
            i8 += i9;
        }
        float fMax = (totalSize - i8) / Math.max(size.length - 1, 1);
        float f = (reverseInput && size.length == 1) ? fMax : 0.0f;
        if (reverseInput) {
            for (int length = size.length - 1; -1 < length; length--) {
                int i10 = size[length];
                outPosition[length] = Math.round(f);
                f += i10 + fMax;
            }
            return;
        }
        int length2 = size.length;
        int i11 = 0;
        while (i < length2) {
            int i12 = size[i];
            outPosition[i11] = Math.round(f);
            f += i12 + fMax;
            i++;
            i11++;
        }
    }

    public final void placeSpaceEvenly$foundation_layout_release(int totalSize, @NotNull int[] size, @NotNull int[] outPosition, boolean reverseInput) {
        int i = 0;
        int i8 = 0;
        for (int i9 : size) {
            i8 += i9;
        }
        float length = (totalSize - i8) / (size.length + 1);
        if (reverseInput) {
            float f = length;
            for (int length2 = size.length - 1; -1 < length2; length2--) {
                int i10 = size[length2];
                outPosition[length2] = Math.round(f);
                f += i10 + length;
            }
            return;
        }
        int length3 = size.length;
        float f7 = length;
        int i11 = 0;
        while (i < length3) {
            int i12 = size[i];
            outPosition[i11] = Math.round(f7);
            f7 += i12 + length;
            i++;
            i11++;
        }
    }

    @Stable
    @NotNull
    /* renamed from: spacedBy-0680j_4, reason: not valid java name */
    public final HorizontalOrVertical m7143spacedBy0680j_4(float space) {
        return new SpacedAligned(space, true, new InterfaceC6473e() { // from class: androidx.compose.foundation.layout.Arrangement$spacedBy$1
            @Override // p152r6.InterfaceC6473e
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Number) obj).intValue(), (LayoutDirection) obj2);
            }

            public final Integer invoke(int i, LayoutDirection layoutDirection) {
                return Integer.valueOf(Alignment.INSTANCE.getStart().align(0, i, layoutDirection));
            }
        }, null);
    }

    @Stable
    @NotNull
    /* renamed from: spacedBy-D5KLDUw, reason: not valid java name */
    public final Horizontal m7144spacedByD5KLDUw(float space, @NotNull final Alignment.Horizontal alignment) {
        return new SpacedAligned(space, true, new InterfaceC6473e() { // from class: androidx.compose.foundation.layout.Arrangement$spacedBy$2
            {
                super(2);
            }

            @Override // p152r6.InterfaceC6473e
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Number) obj).intValue(), (LayoutDirection) obj2);
            }

            public final Integer invoke(int i, LayoutDirection layoutDirection) {
                return Integer.valueOf(alignment.align(0, i, layoutDirection));
            }
        }, null);
    }

    @Stable
    @NotNull
    /* renamed from: spacedBy-D5KLDUw, reason: not valid java name */
    public final Vertical m7145spacedByD5KLDUw(float space, @NotNull final Alignment.Vertical alignment) {
        return new SpacedAligned(space, false, new InterfaceC6473e() { // from class: androidx.compose.foundation.layout.Arrangement$spacedBy$3
            {
                super(2);
            }

            public final Integer invoke(int i, LayoutDirection layoutDirection) {
                return Integer.valueOf(alignment.align(0, i));
            }

            @Override // p152r6.InterfaceC6473e
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Number) obj).intValue(), (LayoutDirection) obj2);
            }
        }, null);
    }

    @Stable
    @NotNull
    public final Vertical aligned(@NotNull final Alignment.Vertical alignment) {
        return new SpacedAligned(C2331Dp.m13305constructorimpl(0), false, new InterfaceC6473e() { // from class: androidx.compose.foundation.layout.Arrangement.aligned.2
            {
                super(2);
            }

            public final Integer invoke(int i, LayoutDirection layoutDirection) {
                return Integer.valueOf(alignment.align(0, i));
            }

            @Override // p152r6.InterfaceC6473e
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Number) obj).intValue(), (LayoutDirection) obj2);
            }
        }, null);
    }
}
