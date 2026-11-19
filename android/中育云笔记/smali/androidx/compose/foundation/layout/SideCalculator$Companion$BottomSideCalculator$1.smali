.class public final Landroidx/compose/foundation/layout/SideCalculator$Companion$BottomSideCalculator$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/foundation/layout/SideCalculator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/foundation/layout/SideCalculator$Companion;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public adjustInsets(Landroid/graphics/Insets;I)Landroid/graphics/Insets;
    .locals 2

    .line 1
    invoke-static {p1}, Landroidx/appcompat/widget/j;->a(Landroid/graphics/Insets;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p1}, Landroidx/appcompat/widget/k;->a(Landroid/graphics/Insets;)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-static {p1}, Landroidx/appcompat/widget/l;->a(Landroid/graphics/Insets;)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-static {v0, v1, p1, p2}, Landroidx/compose/foundation/layout/a;->a(IIII)Landroid/graphics/Insets;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public consumedOffsets-MK-Hz9U(J)J
    .locals 5

    .line 1
    const-wide v0, 0xffffffffL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    and-long/2addr p1, v0

    .line 7
    long-to-int p1, p1

    .line 8
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    const/4 p2, 0x0

    .line 13
    invoke-static {p2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    int-to-long v2, p2

    .line 18
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    int-to-long p1, p1

    .line 23
    const/16 v4, 0x20

    .line 24
    .line 25
    shl-long/2addr v2, v4

    .line 26
    and-long/2addr p1, v0

    .line 27
    or-long/2addr p1, v2

    .line 28
    invoke-static {p1, p2}, Landroidx/compose/ui/geometry/Offset;->constructor-impl(J)J

    .line 29
    .line 30
    .line 31
    move-result-wide p1

    .line 32
    return-wide p1
.end method

.method public consumedVelocity-QWom1Mo(JF)J
    .locals 0

    .line 1
    invoke-static {p1, p2}, Landroidx/compose/ui/unit/Velocity;->getY-impl(J)F

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    add-float/2addr p1, p3

    .line 6
    const/4 p2, 0x0

    .line 7
    invoke-static {p2, p1}, Landroidx/compose/ui/unit/VelocityKt;->Velocity(FF)J

    .line 8
    .line 9
    .line 10
    move-result-wide p1

    .line 11
    return-wide p1
.end method

.method public motionOf(FF)F
    .locals 0

    neg-float p1, p2

    return p1
.end method

.method public valueOf(Landroid/graphics/Insets;)I
    .locals 0

    .line 1
    invoke-static {p1}, Landroidx/appcompat/widget/m;->a(Landroid/graphics/Insets;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method
