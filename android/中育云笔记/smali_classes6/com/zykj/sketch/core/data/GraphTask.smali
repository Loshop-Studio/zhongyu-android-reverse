.class public final Lcom/zykj/sketch/core/data/GraphTask;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final actionContent:Lcom/zykj/sketch/EzyDrawBoard$ActionContent;

.field private final executeVoid:Lhd/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/a;"
        }
    .end annotation
.end field

.field private final hasSnapshot:Z

.field private final snapshotVoid:Lhd/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/a;"
        }
    .end annotation
.end field

.field private final startTime:J


# direct methods
.method public constructor <init>(JLcom/zykj/sketch/EzyDrawBoard$ActionContent;Lhd/a;ZLhd/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lcom/zykj/sketch/EzyDrawBoard$ActionContent;",
            "Lhd/a;",
            "Z",
            "Lhd/a;",
            ")V"
        }
    .end annotation

    const-string v0, "actionContent"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "executeVoid"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "snapshotVoid"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-wide p1, p0, Lcom/zykj/sketch/core/data/GraphTask;->startTime:J

    .line 3
    iput-object p3, p0, Lcom/zykj/sketch/core/data/GraphTask;->actionContent:Lcom/zykj/sketch/EzyDrawBoard$ActionContent;

    .line 4
    iput-object p4, p0, Lcom/zykj/sketch/core/data/GraphTask;->executeVoid:Lhd/a;

    .line 5
    iput-boolean p5, p0, Lcom/zykj/sketch/core/data/GraphTask;->hasSnapshot:Z

    .line 6
    iput-object p6, p0, Lcom/zykj/sketch/core/data/GraphTask;->snapshotVoid:Lhd/a;

    return-void
.end method

.method public synthetic constructor <init>(JLcom/zykj/sketch/EzyDrawBoard$ActionContent;Lhd/a;ZLhd/a;ILkotlin/jvm/internal/n;)V
    .locals 7

    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_0

    const/4 p5, 0x0

    :cond_0
    move v5, p5

    and-int/lit8 p5, p7, 0x10

    if-eqz p5, :cond_1

    .line 7
    sget-object p6, Lcom/zykj/sketch/core/data/GraphTask$1;->INSTANCE:Lcom/zykj/sketch/core/data/GraphTask$1;

    :cond_1
    move-object v0, p0

    move-wide v1, p1

    move-object v3, p3

    move-object v4, p4

    move-object v6, p6

    .line 8
    invoke-direct/range {v0 .. v6}, Lcom/zykj/sketch/core/data/GraphTask;-><init>(JLcom/zykj/sketch/EzyDrawBoard$ActionContent;Lhd/a;ZLhd/a;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/zykj/sketch/core/data/GraphTask;JLcom/zykj/sketch/EzyDrawBoard$ActionContent;Lhd/a;ZLhd/a;ILjava/lang/Object;)Lcom/zykj/sketch/core/data/GraphTask;
    .locals 7

    .line 1
    and-int/lit8 p8, p7, 0x1

    .line 2
    .line 3
    if-eqz p8, :cond_0

    .line 4
    .line 5
    iget-wide p1, p0, Lcom/zykj/sketch/core/data/GraphTask;->startTime:J

    .line 6
    .line 7
    :cond_0
    move-wide v1, p1

    .line 8
    and-int/lit8 p1, p7, 0x2

    .line 9
    .line 10
    if-eqz p1, :cond_1

    .line 11
    .line 12
    iget-object p3, p0, Lcom/zykj/sketch/core/data/GraphTask;->actionContent:Lcom/zykj/sketch/EzyDrawBoard$ActionContent;

    .line 13
    .line 14
    :cond_1
    move-object v3, p3

    .line 15
    and-int/lit8 p1, p7, 0x4

    .line 16
    .line 17
    if-eqz p1, :cond_2

    .line 18
    .line 19
    iget-object p4, p0, Lcom/zykj/sketch/core/data/GraphTask;->executeVoid:Lhd/a;

    .line 20
    .line 21
    :cond_2
    move-object v4, p4

    .line 22
    and-int/lit8 p1, p7, 0x8

    .line 23
    .line 24
    if-eqz p1, :cond_3

    .line 25
    .line 26
    iget-boolean p5, p0, Lcom/zykj/sketch/core/data/GraphTask;->hasSnapshot:Z

    .line 27
    .line 28
    :cond_3
    move v5, p5

    .line 29
    and-int/lit8 p1, p7, 0x10

    .line 30
    .line 31
    if-eqz p1, :cond_4

    .line 32
    .line 33
    iget-object p6, p0, Lcom/zykj/sketch/core/data/GraphTask;->snapshotVoid:Lhd/a;

    .line 34
    .line 35
    :cond_4
    move-object v0, p0

    .line 36
    move-object v6, p6

    .line 37
    invoke-virtual/range {v0 .. v6}, Lcom/zykj/sketch/core/data/GraphTask;->copy(JLcom/zykj/sketch/EzyDrawBoard$ActionContent;Lhd/a;ZLhd/a;)Lcom/zykj/sketch/core/data/GraphTask;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0
.end method


# virtual methods
.method public final component1()J
    .locals 2

    iget-wide v0, p0, Lcom/zykj/sketch/core/data/GraphTask;->startTime:J

    return-wide v0
.end method

.method public final component2()Lcom/zykj/sketch/EzyDrawBoard$ActionContent;
    .locals 1

    iget-object v0, p0, Lcom/zykj/sketch/core/data/GraphTask;->actionContent:Lcom/zykj/sketch/EzyDrawBoard$ActionContent;

    return-object v0
.end method

.method public final component3()Lhd/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lhd/a;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/data/GraphTask;->executeVoid:Lhd/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lcom/zykj/sketch/core/data/GraphTask;->hasSnapshot:Z

    return v0
.end method

.method public final component5()Lhd/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lhd/a;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/data/GraphTask;->snapshotVoid:Lhd/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final copy(JLcom/zykj/sketch/EzyDrawBoard$ActionContent;Lhd/a;ZLhd/a;)Lcom/zykj/sketch/core/data/GraphTask;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lcom/zykj/sketch/EzyDrawBoard$ActionContent;",
            "Lhd/a;",
            "Z",
            "Lhd/a;",
            ")",
            "Lcom/zykj/sketch/core/data/GraphTask;"
        }
    .end annotation

    .line 1
    const-string v0, "actionContent"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "executeVoid"

    .line 7
    .line 8
    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "snapshotVoid"

    .line 12
    .line 13
    invoke-static {p6, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance v1, Lcom/zykj/sketch/core/data/GraphTask;

    .line 17
    .line 18
    move-wide v2, p1

    .line 19
    move-object v4, p3

    .line 20
    move-object v5, p4

    .line 21
    move v6, p5

    .line 22
    move-object v7, p6

    .line 23
    invoke-direct/range {v1 .. v7}, Lcom/zykj/sketch/core/data/GraphTask;-><init>(JLcom/zykj/sketch/EzyDrawBoard$ActionContent;Lhd/a;ZLhd/a;)V

    .line 24
    .line 25
    .line 26
    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/zykj/sketch/core/data/GraphTask;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/sketch/core/data/GraphTask;

    iget-wide v3, p0, Lcom/zykj/sketch/core/data/GraphTask;->startTime:J

    iget-wide v5, p1, Lcom/zykj/sketch/core/data/GraphTask;->startTime:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/zykj/sketch/core/data/GraphTask;->actionContent:Lcom/zykj/sketch/EzyDrawBoard$ActionContent;

    iget-object v3, p1, Lcom/zykj/sketch/core/data/GraphTask;->actionContent:Lcom/zykj/sketch/EzyDrawBoard$ActionContent;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/zykj/sketch/core/data/GraphTask;->executeVoid:Lhd/a;

    iget-object v3, p1, Lcom/zykj/sketch/core/data/GraphTask;->executeVoid:Lhd/a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lcom/zykj/sketch/core/data/GraphTask;->hasSnapshot:Z

    iget-boolean v3, p1, Lcom/zykj/sketch/core/data/GraphTask;->hasSnapshot:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/zykj/sketch/core/data/GraphTask;->snapshotVoid:Lhd/a;

    iget-object p1, p1, Lcom/zykj/sketch/core/data/GraphTask;->snapshotVoid:Lhd/a;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getActionContent()Lcom/zykj/sketch/EzyDrawBoard$ActionContent;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/data/GraphTask;->actionContent:Lcom/zykj/sketch/EzyDrawBoard$ActionContent;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getExecuteVoid()Lhd/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lhd/a;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/data/GraphTask;->executeVoid:Lhd/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getHasSnapshot()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/sketch/core/data/GraphTask;->hasSnapshot:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getSnapshotVoid()Lhd/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lhd/a;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/data/GraphTask;->snapshotVoid:Lhd/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getStartTime()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/sketch/core/data/GraphTask;->startTime:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public hashCode()I
    .locals 2

    iget-wide v0, p0, Lcom/zykj/sketch/core/data/GraphTask;->startTime:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/sketch/core/data/GraphTask;->actionContent:Lcom/zykj/sketch/EzyDrawBoard$ActionContent;

    invoke-virtual {v1}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/sketch/core/data/GraphTask;->executeVoid:Lhd/a;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/zykj/sketch/core/data/GraphTask;->hasSnapshot:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    :cond_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/sketch/core/data/GraphTask;->snapshotVoid:Lhd/a;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "GraphTask(startTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/zykj/sketch/core/data/GraphTask;->startTime:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", actionContent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/zykj/sketch/core/data/GraphTask;->actionContent:Lcom/zykj/sketch/EzyDrawBoard$ActionContent;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", executeVoid="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/zykj/sketch/core/data/GraphTask;->executeVoid:Lhd/a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", hasSnapshot="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/zykj/sketch/core/data/GraphTask;->hasSnapshot:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", snapshotVoid="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/zykj/sketch/core/data/GraphTask;->snapshotVoid:Lhd/a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
