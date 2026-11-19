.class public final Landroidx/compose/ui/node/DpTouchBoundsExpansion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/ui/node/DpTouchBoundsExpansion$Companion;
    }
.end annotation


# static fields
.field public static final $stable:I

.field public static final Companion:Landroidx/compose/ui/node/DpTouchBoundsExpansion$Companion;


# instance fields
.field private final bottom:F

.field private final end:F

.field private final isLayoutDirectionAware:Z

.field private final start:F

.field private final top:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/compose/ui/node/DpTouchBoundsExpansion$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/compose/ui/node/DpTouchBoundsExpansion$Companion;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Landroidx/compose/ui/node/DpTouchBoundsExpansion;->Companion:Landroidx/compose/ui/node/DpTouchBoundsExpansion$Companion;

    return-void
.end method

.method private constructor <init>(FFFFZ)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Landroidx/compose/ui/node/DpTouchBoundsExpansion;->start:F

    .line 4
    iput p2, p0, Landroidx/compose/ui/node/DpTouchBoundsExpansion;->top:F

    .line 5
    iput p3, p0, Landroidx/compose/ui/node/DpTouchBoundsExpansion;->end:F

    .line 6
    iput p4, p0, Landroidx/compose/ui/node/DpTouchBoundsExpansion;->bottom:F

    .line 7
    iput-boolean p5, p0, Landroidx/compose/ui/node/DpTouchBoundsExpansion;->isLayoutDirectionAware:Z

    const/4 p5, 0x0

    cmpl-float p1, p1, p5

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-ltz p1, :cond_0

    move p1, v1

    goto :goto_0

    :cond_0
    move p1, v0

    :goto_0
    if-nez p1, :cond_1

    .line 8
    const-string p1, "Left must be non-negative"

    .line 9
    invoke-static {p1}, Landroidx/compose/ui/internal/InlineClassHelperKt;->throwIllegalArgumentException(Ljava/lang/String;)V

    :cond_1
    cmpl-float p1, p2, p5

    if-ltz p1, :cond_2

    move p1, v1

    goto :goto_1

    :cond_2
    move p1, v0

    :goto_1
    if-nez p1, :cond_3

    .line 10
    const-string p1, "Top must be non-negative"

    .line 11
    invoke-static {p1}, Landroidx/compose/ui/internal/InlineClassHelperKt;->throwIllegalArgumentException(Ljava/lang/String;)V

    :cond_3
    cmpl-float p1, p3, p5

    if-ltz p1, :cond_4

    move p1, v1

    goto :goto_2

    :cond_4
    move p1, v0

    :goto_2
    if-nez p1, :cond_5

    .line 12
    const-string p1, "Right must be non-negative"

    .line 13
    invoke-static {p1}, Landroidx/compose/ui/internal/InlineClassHelperKt;->throwIllegalArgumentException(Ljava/lang/String;)V

    :cond_5
    cmpl-float p1, p4, p5

    if-ltz p1, :cond_6

    move v0, v1

    :cond_6
    if-nez v0, :cond_7

    .line 14
    const-string p1, "Bottom must be non-negative"

    .line 15
    invoke-static {p1}, Landroidx/compose/ui/internal/InlineClassHelperKt;->throwIllegalArgumentException(Ljava/lang/String;)V

    :cond_7
    return-void
.end method

.method public synthetic constructor <init>(FFFFZLkotlin/jvm/internal/n;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, Landroidx/compose/ui/node/DpTouchBoundsExpansion;-><init>(FFFFZ)V

    return-void
.end method

.method public static synthetic copy-lDy3nrA$default(Landroidx/compose/ui/node/DpTouchBoundsExpansion;FFFFZILjava/lang/Object;)Landroidx/compose/ui/node/DpTouchBoundsExpansion;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget p1, p0, Landroidx/compose/ui/node/DpTouchBoundsExpansion;->start:F

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget p2, p0, Landroidx/compose/ui/node/DpTouchBoundsExpansion;->top:F

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget p3, p0, Landroidx/compose/ui/node/DpTouchBoundsExpansion;->end:F

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget p4, p0, Landroidx/compose/ui/node/DpTouchBoundsExpansion;->bottom:F

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-boolean p5, p0, Landroidx/compose/ui/node/DpTouchBoundsExpansion;->isLayoutDirectionAware:Z

    :cond_4
    move p6, p4

    move p7, p5

    move p4, p2

    move p5, p3

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p7}, Landroidx/compose/ui/node/DpTouchBoundsExpansion;->copy-lDy3nrA(FFFFZ)Landroidx/compose/ui/node/DpTouchBoundsExpansion;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1-D9Ej5fM()F
    .locals 1

    iget v0, p0, Landroidx/compose/ui/node/DpTouchBoundsExpansion;->start:F

    return v0
.end method

.method public final component2-D9Ej5fM()F
    .locals 1

    iget v0, p0, Landroidx/compose/ui/node/DpTouchBoundsExpansion;->top:F

    return v0
.end method

.method public final component3-D9Ej5fM()F
    .locals 1

    iget v0, p0, Landroidx/compose/ui/node/DpTouchBoundsExpansion;->end:F

    return v0
.end method

.method public final component4-D9Ej5fM()F
    .locals 1

    iget v0, p0, Landroidx/compose/ui/node/DpTouchBoundsExpansion;->bottom:F

    return v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/ui/node/DpTouchBoundsExpansion;->isLayoutDirectionAware:Z

    return v0
.end method

.method public final copy-lDy3nrA(FFFFZ)Landroidx/compose/ui/node/DpTouchBoundsExpansion;
    .locals 7

    new-instance v0, Landroidx/compose/ui/node/DpTouchBoundsExpansion;

    const/4 v6, 0x0

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    invoke-direct/range {v0 .. v6}, Landroidx/compose/ui/node/DpTouchBoundsExpansion;-><init>(FFFFZLkotlin/jvm/internal/n;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Landroidx/compose/ui/node/DpTouchBoundsExpansion;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Landroidx/compose/ui/node/DpTouchBoundsExpansion;

    iget v1, p0, Landroidx/compose/ui/node/DpTouchBoundsExpansion;->start:F

    iget v3, p1, Landroidx/compose/ui/node/DpTouchBoundsExpansion;->start:F

    invoke-static {v1, v3}, Landroidx/compose/ui/unit/Dp;->equals-impl0(FF)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Landroidx/compose/ui/node/DpTouchBoundsExpansion;->top:F

    iget v3, p1, Landroidx/compose/ui/node/DpTouchBoundsExpansion;->top:F

    invoke-static {v1, v3}, Landroidx/compose/ui/unit/Dp;->equals-impl0(FF)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Landroidx/compose/ui/node/DpTouchBoundsExpansion;->end:F

    iget v3, p1, Landroidx/compose/ui/node/DpTouchBoundsExpansion;->end:F

    invoke-static {v1, v3}, Landroidx/compose/ui/unit/Dp;->equals-impl0(FF)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Landroidx/compose/ui/node/DpTouchBoundsExpansion;->bottom:F

    iget v3, p1, Landroidx/compose/ui/node/DpTouchBoundsExpansion;->bottom:F

    invoke-static {v1, v3}, Landroidx/compose/ui/unit/Dp;->equals-impl0(FF)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Landroidx/compose/ui/node/DpTouchBoundsExpansion;->isLayoutDirectionAware:Z

    iget-boolean p1, p1, Landroidx/compose/ui/node/DpTouchBoundsExpansion;->isLayoutDirectionAware:Z

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getBottom-D9Ej5fM()F
    .locals 1

    .line 1
    iget v0, p0, Landroidx/compose/ui/node/DpTouchBoundsExpansion;->bottom:F

    .line 2
    .line 3
    return v0
.end method

.method public final getEnd-D9Ej5fM()F
    .locals 1

    .line 1
    iget v0, p0, Landroidx/compose/ui/node/DpTouchBoundsExpansion;->end:F

    .line 2
    .line 3
    return v0
.end method

.method public final getStart-D9Ej5fM()F
    .locals 1

    .line 1
    iget v0, p0, Landroidx/compose/ui/node/DpTouchBoundsExpansion;->start:F

    .line 2
    .line 3
    return v0
.end method

.method public final getTop-D9Ej5fM()F
    .locals 1

    .line 1
    iget v0, p0, Landroidx/compose/ui/node/DpTouchBoundsExpansion;->top:F

    .line 2
    .line 3
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Landroidx/compose/ui/node/DpTouchBoundsExpansion;->start:F

    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->hashCode-impl(F)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Landroidx/compose/ui/node/DpTouchBoundsExpansion;->top:F

    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->hashCode-impl(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Landroidx/compose/ui/node/DpTouchBoundsExpansion;->end:F

    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->hashCode-impl(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Landroidx/compose/ui/node/DpTouchBoundsExpansion;->bottom:F

    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->hashCode-impl(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Landroidx/compose/ui/node/DpTouchBoundsExpansion;->isLayoutDirectionAware:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final isLayoutDirectionAware()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/compose/ui/node/DpTouchBoundsExpansion;->isLayoutDirectionAware:Z

    .line 2
    .line 3
    return v0
.end method

.method public final roundToTouchBoundsExpansion-TW6G1oQ(Landroidx/compose/ui/unit/Density;)J
    .locals 6

    .line 1
    sget-object v0, Landroidx/compose/ui/node/TouchBoundsExpansion;->Companion:Landroidx/compose/ui/node/TouchBoundsExpansion$Companion;

    .line 2
    .line 3
    iget v1, p0, Landroidx/compose/ui/node/DpTouchBoundsExpansion;->start:F

    .line 4
    .line 5
    invoke-interface {p1, v1}, Landroidx/compose/ui/unit/Density;->roundToPx-0680j_4(F)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    iget v2, p0, Landroidx/compose/ui/node/DpTouchBoundsExpansion;->top:F

    .line 10
    .line 11
    invoke-interface {p1, v2}, Landroidx/compose/ui/unit/Density;->roundToPx-0680j_4(F)I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    iget v3, p0, Landroidx/compose/ui/node/DpTouchBoundsExpansion;->end:F

    .line 16
    .line 17
    invoke-interface {p1, v3}, Landroidx/compose/ui/unit/Density;->roundToPx-0680j_4(F)I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    iget v4, p0, Landroidx/compose/ui/node/DpTouchBoundsExpansion;->bottom:F

    .line 22
    .line 23
    invoke-interface {p1, v4}, Landroidx/compose/ui/unit/Density;->roundToPx-0680j_4(F)I

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    iget-boolean v5, p0, Landroidx/compose/ui/node/DpTouchBoundsExpansion;->isLayoutDirectionAware:Z

    .line 28
    .line 29
    invoke-virtual/range {v0 .. v5}, Landroidx/compose/ui/node/TouchBoundsExpansion$Companion;->pack$ui_release(IIIIZ)J

    .line 30
    .line 31
    .line 32
    move-result-wide v0

    .line 33
    invoke-static {v0, v1}, Landroidx/compose/ui/node/TouchBoundsExpansion;->constructor-impl(J)J

    .line 34
    .line 35
    .line 36
    move-result-wide v0

    .line 37
    return-wide v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DpTouchBoundsExpansion(start="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/compose/ui/node/DpTouchBoundsExpansion;->start:F

    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->toString-impl(F)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", top="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/compose/ui/node/DpTouchBoundsExpansion;->top:F

    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->toString-impl(F)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", end="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/compose/ui/node/DpTouchBoundsExpansion;->end:F

    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->toString-impl(F)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", bottom="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/compose/ui/node/DpTouchBoundsExpansion;->bottom:F

    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->toString-impl(F)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", isLayoutDirectionAware="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Landroidx/compose/ui/node/DpTouchBoundsExpansion;->isLayoutDirectionAware:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
