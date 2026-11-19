.class public final Landroidx/constraintlayout/compose/InvalidationStrategySpecification;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u0008\u0000\u00a2\u0006\u0002\u0010\u0002J0\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u000c\u001a\u00020\u0004\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\r\u0010\u000eJ0\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u000c\u001a\u00020\u0004\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0010\u0010\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006\u0011"
    }
    d2 = {
        "Landroidx/constraintlayout/compose/InvalidationStrategySpecification;",
        "",
        "()V",
        "heightRateCount",
        "",
        "widthRateCount",
        "shouldInvalidateOnFixedHeight",
        "",
        "oldConstraints",
        "Landroidx/compose/ui/unit/Constraints;",
        "newConstraints",
        "skipCount",
        "threshold",
        "shouldInvalidateOnFixedHeight-SulIKG4",
        "(JJII)Z",
        "shouldInvalidateOnFixedWidth",
        "shouldInvalidateOnFixedWidth-SulIKG4",
        "constraintlayout-compose_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private heightRateCount:I

.field private widthRateCount:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

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
.method public final shouldInvalidateOnFixedHeight-SulIKG4(JJII)Z
    .locals 2

    .line 1
    invoke-static {p1, p2}, Landroidx/compose/ui/unit/Constraints;->getHasFixedHeight-impl(J)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    invoke-static {p3, p4}, Landroidx/compose/ui/unit/Constraints;->getHasFixedHeight-impl(J)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-static {p3, p4}, Landroidx/compose/ui/unit/Constraints;->getMaxHeight-impl(J)I

    .line 15
    .line 16
    .line 17
    move-result p3

    .line 18
    invoke-static {p1, p2}, Landroidx/compose/ui/unit/Constraints;->getMaxHeight-impl(J)I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    sub-int/2addr p3, p1

    .line 23
    invoke-static {p3}, Ljava/lang/Math;->abs(I)I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    const/4 p2, 0x1

    .line 28
    if-lt p1, p6, :cond_0

    .line 29
    .line 30
    iput v1, p0, Landroidx/constraintlayout/compose/InvalidationStrategySpecification;->heightRateCount:I

    .line 31
    .line 32
    return p2

    .line 33
    :cond_0
    if-eqz p1, :cond_2

    .line 34
    .line 35
    iget p1, p0, Landroidx/constraintlayout/compose/InvalidationStrategySpecification;->heightRateCount:I

    .line 36
    .line 37
    add-int/2addr p1, p2

    .line 38
    iput p1, p0, Landroidx/constraintlayout/compose/InvalidationStrategySpecification;->heightRateCount:I

    .line 39
    .line 40
    if-le p1, p5, :cond_2

    .line 41
    .line 42
    iput v1, p0, Landroidx/constraintlayout/compose/InvalidationStrategySpecification;->heightRateCount:I

    .line 43
    .line 44
    return p2

    .line 45
    :cond_1
    iput v1, p0, Landroidx/constraintlayout/compose/InvalidationStrategySpecification;->heightRateCount:I

    .line 46
    .line 47
    :cond_2
    return v1
.end method

.method public final shouldInvalidateOnFixedWidth-SulIKG4(JJII)Z
    .locals 2

    .line 1
    invoke-static {p1, p2}, Landroidx/compose/ui/unit/Constraints;->getHasFixedWidth-impl(J)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    invoke-static {p3, p4}, Landroidx/compose/ui/unit/Constraints;->getHasFixedWidth-impl(J)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-static {p3, p4}, Landroidx/compose/ui/unit/Constraints;->getMaxWidth-impl(J)I

    .line 15
    .line 16
    .line 17
    move-result p3

    .line 18
    invoke-static {p1, p2}, Landroidx/compose/ui/unit/Constraints;->getMaxWidth-impl(J)I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    sub-int/2addr p3, p1

    .line 23
    invoke-static {p3}, Ljava/lang/Math;->abs(I)I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    const/4 p2, 0x1

    .line 28
    if-lt p1, p6, :cond_0

    .line 29
    .line 30
    iput v1, p0, Landroidx/constraintlayout/compose/InvalidationStrategySpecification;->widthRateCount:I

    .line 31
    .line 32
    return p2

    .line 33
    :cond_0
    if-eqz p1, :cond_2

    .line 34
    .line 35
    iget p1, p0, Landroidx/constraintlayout/compose/InvalidationStrategySpecification;->widthRateCount:I

    .line 36
    .line 37
    add-int/2addr p1, p2

    .line 38
    iput p1, p0, Landroidx/constraintlayout/compose/InvalidationStrategySpecification;->widthRateCount:I

    .line 39
    .line 40
    if-le p1, p5, :cond_2

    .line 41
    .line 42
    iput v1, p0, Landroidx/constraintlayout/compose/InvalidationStrategySpecification;->widthRateCount:I

    .line 43
    .line 44
    return p2

    .line 45
    :cond_1
    iput v1, p0, Landroidx/constraintlayout/compose/InvalidationStrategySpecification;->widthRateCount:I

    .line 46
    .line 47
    :cond_2
    return v1
.end method
