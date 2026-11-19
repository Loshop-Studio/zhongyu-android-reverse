.class public final Lcom/zykj/sketch/core/data/RenderTask;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0012\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B5\u0012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u000f\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0003H\u00c6\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\tH\u00c6\u0003J?\u0010\u001a\u001a\u00020\u00002\u000e\u0008\u0002\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u000e\u0008\u0002\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00032\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0008\u0008\u0002\u0010\u0008\u001a\u00020\tH\u00c6\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001e\u001a\u00020\u001fH\u00d6\u0001J\t\u0010 \u001a\u00020!H\u00d6\u0001R\u0017\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0017\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000cR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000e\u0010\u000f\"\u0004\u0008\u0010\u0010\u0011R\u001a\u0010\u0008\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013\"\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\""
    }
    d2 = {
        "Lcom/zykj/sketch/core/data/RenderTask;",
        "",
        "graphTask",
        "",
        "Lcom/zykj/sketch/core/data/GraphTask;",
        "audioTaskList",
        "Lcom/zykj/sketch/core/data/AudioTask;",
        "lastSnapshot",
        "progress",
        "",
        "(Ljava/util/List;Ljava/util/List;Lcom/zykj/sketch/core/data/GraphTask;J)V",
        "getAudioTaskList",
        "()Ljava/util/List;",
        "getGraphTask",
        "getLastSnapshot",
        "()Lcom/zykj/sketch/core/data/GraphTask;",
        "setLastSnapshot",
        "(Lcom/zykj/sketch/core/data/GraphTask;)V",
        "getProgress",
        "()J",
        "setProgress",
        "(J)V",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
        "",
        "sketch_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field private final audioTaskList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/zykj/sketch/core/data/AudioTask;",
            ">;"
        }
    .end annotation
.end field

.field private final graphTask:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/zykj/sketch/core/data/GraphTask;",
            ">;"
        }
    .end annotation
.end field

.field private lastSnapshot:Lcom/zykj/sketch/core/data/GraphTask;

.field private progress:J


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/util/List;Lcom/zykj/sketch/core/data/GraphTask;J)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/zykj/sketch/core/data/GraphTask;",
            ">;",
            "Ljava/util/List<",
            "Lcom/zykj/sketch/core/data/AudioTask;",
            ">;",
            "Lcom/zykj/sketch/core/data/GraphTask;",
            "J)V"
        }
    .end annotation

    const-string v0, "graphTask"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "audioTaskList"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/zykj/sketch/core/data/RenderTask;->graphTask:Ljava/util/List;

    .line 3
    iput-object p2, p0, Lcom/zykj/sketch/core/data/RenderTask;->audioTaskList:Ljava/util/List;

    .line 4
    iput-object p3, p0, Lcom/zykj/sketch/core/data/RenderTask;->lastSnapshot:Lcom/zykj/sketch/core/data/GraphTask;

    .line 5
    iput-wide p4, p0, Lcom/zykj/sketch/core/data/RenderTask;->progress:J

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Ljava/util/List;Lcom/zykj/sketch/core/data/GraphTask;JILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p6, p6, 0x8

    if-eqz p6, :cond_0

    const-wide/16 p4, 0x0

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-wide v4, p4

    .line 6
    invoke-direct/range {v0 .. v5}, Lcom/zykj/sketch/core/data/RenderTask;-><init>(Ljava/util/List;Ljava/util/List;Lcom/zykj/sketch/core/data/GraphTask;J)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/zykj/sketch/core/data/RenderTask;Ljava/util/List;Ljava/util/List;Lcom/zykj/sketch/core/data/GraphTask;JILjava/lang/Object;)Lcom/zykj/sketch/core/data/RenderTask;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/zykj/sketch/core/data/RenderTask;->graphTask:Ljava/util/List;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/zykj/sketch/core/data/RenderTask;->audioTaskList:Ljava/util/List;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lcom/zykj/sketch/core/data/RenderTask;->lastSnapshot:Lcom/zykj/sketch/core/data/GraphTask;

    :cond_2
    and-int/lit8 p6, p6, 0x8

    if-eqz p6, :cond_3

    iget-wide p4, p0, Lcom/zykj/sketch/core/data/RenderTask;->progress:J

    :cond_3
    move-wide p6, p4

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/zykj/sketch/core/data/RenderTask;->copy(Ljava/util/List;Ljava/util/List;Lcom/zykj/sketch/core/data/GraphTask;J)Lcom/zykj/sketch/core/data/RenderTask;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zykj/sketch/core/data/GraphTask;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/zykj/sketch/core/data/RenderTask;->graphTask:Ljava/util/List;

    return-object v0
.end method

.method public final component2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zykj/sketch/core/data/AudioTask;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/zykj/sketch/core/data/RenderTask;->audioTaskList:Ljava/util/List;

    return-object v0
.end method

.method public final component3()Lcom/zykj/sketch/core/data/GraphTask;
    .locals 1

    iget-object v0, p0, Lcom/zykj/sketch/core/data/RenderTask;->lastSnapshot:Lcom/zykj/sketch/core/data/GraphTask;

    return-object v0
.end method

.method public final component4()J
    .locals 2

    iget-wide v0, p0, Lcom/zykj/sketch/core/data/RenderTask;->progress:J

    return-wide v0
.end method

.method public final copy(Ljava/util/List;Ljava/util/List;Lcom/zykj/sketch/core/data/GraphTask;J)Lcom/zykj/sketch/core/data/RenderTask;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/zykj/sketch/core/data/GraphTask;",
            ">;",
            "Ljava/util/List<",
            "Lcom/zykj/sketch/core/data/AudioTask;",
            ">;",
            "Lcom/zykj/sketch/core/data/GraphTask;",
            "J)",
            "Lcom/zykj/sketch/core/data/RenderTask;"
        }
    .end annotation

    const-string v0, "graphTask"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "audioTaskList"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/zykj/sketch/core/data/RenderTask;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-wide v5, p4

    invoke-direct/range {v1 .. v6}, Lcom/zykj/sketch/core/data/RenderTask;-><init>(Ljava/util/List;Ljava/util/List;Lcom/zykj/sketch/core/data/GraphTask;J)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/zykj/sketch/core/data/RenderTask;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/sketch/core/data/RenderTask;

    iget-object v1, p0, Lcom/zykj/sketch/core/data/RenderTask;->graphTask:Ljava/util/List;

    iget-object v3, p1, Lcom/zykj/sketch/core/data/RenderTask;->graphTask:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/zykj/sketch/core/data/RenderTask;->audioTaskList:Ljava/util/List;

    iget-object v3, p1, Lcom/zykj/sketch/core/data/RenderTask;->audioTaskList:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/zykj/sketch/core/data/RenderTask;->lastSnapshot:Lcom/zykj/sketch/core/data/GraphTask;

    iget-object v3, p1, Lcom/zykj/sketch/core/data/RenderTask;->lastSnapshot:Lcom/zykj/sketch/core/data/GraphTask;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Lcom/zykj/sketch/core/data/RenderTask;->progress:J

    iget-wide v5, p1, Lcom/zykj/sketch/core/data/RenderTask;->progress:J

    cmp-long p1, v3, v5

    if-eqz p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getAudioTaskList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zykj/sketch/core/data/AudioTask;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/data/RenderTask;->audioTaskList:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getGraphTask()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zykj/sketch/core/data/GraphTask;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/data/RenderTask;->graphTask:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getLastSnapshot()Lcom/zykj/sketch/core/data/GraphTask;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/data/RenderTask;->lastSnapshot:Lcom/zykj/sketch/core/data/GraphTask;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getProgress()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/sketch/core/data/RenderTask;->progress:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/zykj/sketch/core/data/RenderTask;->graphTask:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/sketch/core/data/RenderTask;->audioTaskList:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/sketch/core/data/RenderTask;->lastSnapshot:Lcom/zykj/sketch/core/data/GraphTask;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/zykj/sketch/core/data/GraphTask;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/zykj/sketch/core/data/RenderTask;->progress:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setLastSnapshot(Lcom/zykj/sketch/core/data/GraphTask;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/sketch/core/data/RenderTask;->lastSnapshot:Lcom/zykj/sketch/core/data/GraphTask;

    .line 2
    .line 3
    return-void
.end method

.method public final setProgress(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/zykj/sketch/core/data/RenderTask;->progress:J

    .line 2
    .line 3
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "RenderTask(graphTask="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/zykj/sketch/core/data/RenderTask;->graphTask:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", audioTaskList="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/zykj/sketch/core/data/RenderTask;->audioTaskList:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", lastSnapshot="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/zykj/sketch/core/data/RenderTask;->lastSnapshot:Lcom/zykj/sketch/core/data/GraphTask;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", progress="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/zykj/sketch/core/data/RenderTask;->progress:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
