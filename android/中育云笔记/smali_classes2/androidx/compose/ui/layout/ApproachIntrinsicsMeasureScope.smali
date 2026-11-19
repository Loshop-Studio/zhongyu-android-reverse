.class public final Landroidx/compose/ui/layout/ApproachIntrinsicsMeasureScope;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/layout/ApproachMeasureScope;
.implements Landroidx/compose/ui/layout/ApproachIntrinsicMeasureScope;


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation


# static fields
.field public static final $stable:I


# instance fields
.field private final synthetic $$delegate_0:Landroidx/compose/ui/layout/ApproachIntrinsicMeasureScope;

.field private final layoutDirection:Landroidx/compose/ui/unit/LayoutDirection;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroidx/compose/ui/layout/ApproachIntrinsicMeasureScope;Landroidx/compose/ui/unit/LayoutDirection;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Landroidx/compose/ui/layout/ApproachIntrinsicsMeasureScope;->layoutDirection:Landroidx/compose/ui/unit/LayoutDirection;

    .line 5
    .line 6
    iput-object p1, p0, Landroidx/compose/ui/layout/ApproachIntrinsicsMeasureScope;->$$delegate_0:Landroidx/compose/ui/layout/ApproachIntrinsicMeasureScope;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public getDensity()F
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/layout/ApproachIntrinsicsMeasureScope;->$$delegate_0:Landroidx/compose/ui/layout/ApproachIntrinsicMeasureScope;

    invoke-interface {v0}, Landroidx/compose/ui/unit/Density;->getDensity()F

    move-result v0

    return v0
.end method

.method public getFontScale()F
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/layout/ApproachIntrinsicsMeasureScope;->$$delegate_0:Landroidx/compose/ui/layout/ApproachIntrinsicMeasureScope;

    invoke-interface {v0}, Landroidx/compose/ui/unit/FontScaling;->getFontScale()F

    move-result v0

    return v0
.end method

.method public getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/layout/ApproachIntrinsicsMeasureScope;->layoutDirection:Landroidx/compose/ui/unit/LayoutDirection;

    .line 2
    .line 3
    return-object v0
.end method

.method public getLookaheadConstraints-msEJaDk()J
    .locals 2

    iget-object v0, p0, Landroidx/compose/ui/layout/ApproachIntrinsicsMeasureScope;->$$delegate_0:Landroidx/compose/ui/layout/ApproachIntrinsicMeasureScope;

    invoke-interface {v0}, Landroidx/compose/ui/layout/ApproachIntrinsicMeasureScope;->getLookaheadConstraints-msEJaDk()J

    move-result-wide v0

    return-wide v0
.end method

.method public getLookaheadSize-YbymL2g()J
    .locals 2

    iget-object v0, p0, Landroidx/compose/ui/layout/ApproachIntrinsicsMeasureScope;->$$delegate_0:Landroidx/compose/ui/layout/ApproachIntrinsicMeasureScope;

    invoke-interface {v0}, Landroidx/compose/ui/layout/ApproachIntrinsicMeasureScope;->getLookaheadSize-YbymL2g()J

    move-result-wide v0

    return-wide v0
.end method

.method public isLookingAhead()Z
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/layout/ApproachIntrinsicsMeasureScope;->$$delegate_0:Landroidx/compose/ui/layout/ApproachIntrinsicMeasureScope;

    invoke-interface {v0}, Landroidx/compose/ui/layout/IntrinsicMeasureScope;->isLookingAhead()Z

    move-result v0

    return v0
.end method

.method public layout(IILjava/util/Map;Lhd/l;Lhd/l;)Landroidx/compose/ui/layout/MeasureResult;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/util/Map<",
            "Landroidx/compose/ui/layout/AlignmentLine;",
            "Ljava/lang/Integer;",
            ">;",
            "Lhd/l;",
            "Lhd/l;",
            ")",
            "Landroidx/compose/ui/layout/MeasureResult;"
        }
    .end annotation

    .line 1
    const/4 p5, 0x0

    .line 2
    if-gez p1, :cond_0

    .line 3
    .line 4
    move p1, p5

    .line 5
    :cond_0
    if-gez p2, :cond_1

    .line 6
    .line 7
    move p2, p5

    .line 8
    :cond_1
    const/high16 v0, -0x1000000

    .line 9
    .line 10
    and-int v1, p1, v0

    .line 11
    .line 12
    if-nez v1, :cond_2

    .line 13
    .line 14
    and-int/2addr v0, p2

    .line 15
    if-nez v0, :cond_2

    .line 16
    .line 17
    const/4 p5, 0x1

    .line 18
    :cond_2
    if-nez p5, :cond_3

    .line 19
    .line 20
    new-instance p5, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    invoke-direct {p5}, Ljava/lang/StringBuilder;-><init>()V

    .line 23
    .line 24
    .line 25
    const-string v0, "Size("

    .line 26
    .line 27
    invoke-virtual {p5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p5, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v0, " x "

    .line 34
    .line 35
    invoke-virtual {p5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p5, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string v0, ") is out of range. Each dimension must be between 0 and 16777215."

    .line 42
    .line 43
    invoke-virtual {p5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p5

    .line 50
    invoke-static {p5}, Landroidx/compose/ui/internal/InlineClassHelperKt;->throwIllegalStateException(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    :cond_3
    new-instance p5, Landroidx/compose/ui/layout/ApproachIntrinsicsMeasureScope$layout$1;

    .line 54
    .line 55
    invoke-direct {p5, p1, p2, p3, p4}, Landroidx/compose/ui/layout/ApproachIntrinsicsMeasureScope$layout$1;-><init>(IILjava/util/Map;Lhd/l;)V

    .line 56
    .line 57
    .line 58
    return-object p5
.end method

.method public roundToPx--R2X_6o(J)I
    .locals 1
    .annotation build Landroidx/compose/runtime/Stable;
    .end annotation

    iget-object v0, p0, Landroidx/compose/ui/layout/ApproachIntrinsicsMeasureScope;->$$delegate_0:Landroidx/compose/ui/layout/ApproachIntrinsicMeasureScope;

    invoke-interface {v0, p1, p2}, Landroidx/compose/ui/unit/Density;->roundToPx--R2X_6o(J)I

    move-result p1

    return p1
.end method

.method public roundToPx-0680j_4(F)I
    .locals 1
    .annotation build Landroidx/compose/runtime/Stable;
    .end annotation

    iget-object v0, p0, Landroidx/compose/ui/layout/ApproachIntrinsicsMeasureScope;->$$delegate_0:Landroidx/compose/ui/layout/ApproachIntrinsicMeasureScope;

    invoke-interface {v0, p1}, Landroidx/compose/ui/unit/Density;->roundToPx-0680j_4(F)I

    move-result p1

    return p1
.end method

.method public toDp-GaN1DYA(J)F
    .locals 1
    .annotation build Landroidx/compose/runtime/Stable;
    .end annotation

    iget-object v0, p0, Landroidx/compose/ui/layout/ApproachIntrinsicsMeasureScope;->$$delegate_0:Landroidx/compose/ui/layout/ApproachIntrinsicMeasureScope;

    invoke-interface {v0, p1, p2}, Landroidx/compose/ui/unit/FontScaling;->toDp-GaN1DYA(J)F

    move-result p1

    return p1
.end method

.method public toDp-u2uoSUM(F)F
    .locals 1
    .annotation build Landroidx/compose/runtime/Stable;
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/layout/ApproachIntrinsicsMeasureScope;->$$delegate_0:Landroidx/compose/ui/layout/ApproachIntrinsicMeasureScope;

    invoke-interface {v0, p1}, Landroidx/compose/ui/unit/Density;->toDp-u2uoSUM(F)F

    move-result p1

    return p1
.end method

.method public toDp-u2uoSUM(I)F
    .locals 1
    .annotation build Landroidx/compose/runtime/Stable;
    .end annotation

    .line 2
    iget-object v0, p0, Landroidx/compose/ui/layout/ApproachIntrinsicsMeasureScope;->$$delegate_0:Landroidx/compose/ui/layout/ApproachIntrinsicMeasureScope;

    invoke-interface {v0, p1}, Landroidx/compose/ui/unit/Density;->toDp-u2uoSUM(I)F

    move-result p1

    return p1
.end method

.method public toDpSize-k-rfVVM(J)J
    .locals 1
    .annotation build Landroidx/compose/runtime/Stable;
    .end annotation

    iget-object v0, p0, Landroidx/compose/ui/layout/ApproachIntrinsicsMeasureScope;->$$delegate_0:Landroidx/compose/ui/layout/ApproachIntrinsicMeasureScope;

    invoke-interface {v0, p1, p2}, Landroidx/compose/ui/unit/Density;->toDpSize-k-rfVVM(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public toPx--R2X_6o(J)F
    .locals 1
    .annotation build Landroidx/compose/runtime/Stable;
    .end annotation

    iget-object v0, p0, Landroidx/compose/ui/layout/ApproachIntrinsicsMeasureScope;->$$delegate_0:Landroidx/compose/ui/layout/ApproachIntrinsicMeasureScope;

    invoke-interface {v0, p1, p2}, Landroidx/compose/ui/unit/Density;->toPx--R2X_6o(J)F

    move-result p1

    return p1
.end method

.method public toPx-0680j_4(F)F
    .locals 1
    .annotation build Landroidx/compose/runtime/Stable;
    .end annotation

    iget-object v0, p0, Landroidx/compose/ui/layout/ApproachIntrinsicsMeasureScope;->$$delegate_0:Landroidx/compose/ui/layout/ApproachIntrinsicMeasureScope;

    invoke-interface {v0, p1}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    move-result p1

    return p1
.end method

.method public toRect(Landroidx/compose/ui/unit/DpRect;)Landroidx/compose/ui/geometry/Rect;
    .locals 1
    .annotation build Landroidx/compose/runtime/Stable;
    .end annotation

    iget-object v0, p0, Landroidx/compose/ui/layout/ApproachIntrinsicsMeasureScope;->$$delegate_0:Landroidx/compose/ui/layout/ApproachIntrinsicMeasureScope;

    invoke-interface {v0, p1}, Landroidx/compose/ui/unit/Density;->toRect(Landroidx/compose/ui/unit/DpRect;)Landroidx/compose/ui/geometry/Rect;

    move-result-object p1

    return-object p1
.end method

.method public toSize-XkaWNTQ(J)J
    .locals 1
    .annotation build Landroidx/compose/runtime/Stable;
    .end annotation

    iget-object v0, p0, Landroidx/compose/ui/layout/ApproachIntrinsicsMeasureScope;->$$delegate_0:Landroidx/compose/ui/layout/ApproachIntrinsicMeasureScope;

    invoke-interface {v0, p1, p2}, Landroidx/compose/ui/unit/Density;->toSize-XkaWNTQ(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public toSp-0xMU5do(F)J
    .locals 2
    .annotation build Landroidx/compose/runtime/Stable;
    .end annotation

    iget-object v0, p0, Landroidx/compose/ui/layout/ApproachIntrinsicsMeasureScope;->$$delegate_0:Landroidx/compose/ui/layout/ApproachIntrinsicMeasureScope;

    invoke-interface {v0, p1}, Landroidx/compose/ui/unit/FontScaling;->toSp-0xMU5do(F)J

    move-result-wide v0

    return-wide v0
.end method

.method public toSp-kPz2Gy4(F)J
    .locals 2
    .annotation build Landroidx/compose/runtime/Stable;
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/layout/ApproachIntrinsicsMeasureScope;->$$delegate_0:Landroidx/compose/ui/layout/ApproachIntrinsicMeasureScope;

    invoke-interface {v0, p1}, Landroidx/compose/ui/unit/Density;->toSp-kPz2Gy4(F)J

    move-result-wide v0

    return-wide v0
.end method

.method public toSp-kPz2Gy4(I)J
    .locals 2
    .annotation build Landroidx/compose/runtime/Stable;
    .end annotation

    .line 2
    iget-object v0, p0, Landroidx/compose/ui/layout/ApproachIntrinsicsMeasureScope;->$$delegate_0:Landroidx/compose/ui/layout/ApproachIntrinsicMeasureScope;

    invoke-interface {v0, p1}, Landroidx/compose/ui/unit/Density;->toSp-kPz2Gy4(I)J

    move-result-wide v0

    return-wide v0
.end method
