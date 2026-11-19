.class final Landroidx/compose/foundation/lazy/layout/Averages;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private compositionTimeNanos:J

.field private measureTimeNanos:J


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

.method private final calculateAverageTime(JJ)J
    .locals 4

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p3, v0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-wide p1

    .line 8
    :cond_0
    const/4 v0, 0x4

    .line 9
    int-to-long v0, v0

    .line 10
    div-long/2addr p3, v0

    .line 11
    const/4 v2, 0x3

    .line 12
    int-to-long v2, v2

    .line 13
    mul-long/2addr p3, v2

    .line 14
    div-long/2addr p1, v0

    .line 15
    add-long/2addr p3, p1

    .line 16
    return-wide p3
.end method


# virtual methods
.method public final copy()Landroidx/compose/foundation/lazy/layout/Averages;
    .locals 3

    .line 1
    new-instance v0, Landroidx/compose/foundation/lazy/layout/Averages;

    .line 2
    .line 3
    invoke-direct {v0}, Landroidx/compose/foundation/lazy/layout/Averages;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-wide v1, p0, Landroidx/compose/foundation/lazy/layout/Averages;->compositionTimeNanos:J

    .line 7
    .line 8
    iput-wide v1, v0, Landroidx/compose/foundation/lazy/layout/Averages;->compositionTimeNanos:J

    .line 9
    .line 10
    iget-wide v1, p0, Landroidx/compose/foundation/lazy/layout/Averages;->measureTimeNanos:J

    .line 11
    .line 12
    iput-wide v1, v0, Landroidx/compose/foundation/lazy/layout/Averages;->measureTimeNanos:J

    .line 13
    .line 14
    return-object v0
.end method

.method public final getCompositionTimeNanos()J
    .locals 2

    .line 1
    iget-wide v0, p0, Landroidx/compose/foundation/lazy/layout/Averages;->compositionTimeNanos:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getMeasureTimeNanos()J
    .locals 2

    .line 1
    iget-wide v0, p0, Landroidx/compose/foundation/lazy/layout/Averages;->measureTimeNanos:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final saveCompositionTimeNanos(J)V
    .locals 2

    .line 1
    iget-wide v0, p0, Landroidx/compose/foundation/lazy/layout/Averages;->compositionTimeNanos:J

    .line 2
    .line 3
    invoke-direct {p0, p1, p2, v0, v1}, Landroidx/compose/foundation/lazy/layout/Averages;->calculateAverageTime(JJ)J

    .line 4
    .line 5
    .line 6
    move-result-wide p1

    .line 7
    iput-wide p1, p0, Landroidx/compose/foundation/lazy/layout/Averages;->compositionTimeNanos:J

    .line 8
    .line 9
    return-void
.end method

.method public final saveMeasureTimeNanos(J)V
    .locals 2

    .line 1
    iget-wide v0, p0, Landroidx/compose/foundation/lazy/layout/Averages;->measureTimeNanos:J

    .line 2
    .line 3
    invoke-direct {p0, p1, p2, v0, v1}, Landroidx/compose/foundation/lazy/layout/Averages;->calculateAverageTime(JJ)J

    .line 4
    .line 5
    .line 6
    move-result-wide p1

    .line 7
    iput-wide p1, p0, Landroidx/compose/foundation/lazy/layout/Averages;->measureTimeNanos:J

    .line 8
    .line 9
    return-void
.end method

.method public final setCompositionTimeNanos(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Landroidx/compose/foundation/lazy/layout/Averages;->compositionTimeNanos:J

    .line 2
    .line 3
    return-void
.end method

.method public final setMeasureTimeNanos(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Landroidx/compose/foundation/lazy/layout/Averages;->measureTimeNanos:J

    .line 2
    .line 3
    return-void
.end method
