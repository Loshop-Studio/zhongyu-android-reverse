.class public final synthetic Ly4/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Ljava/util/List;

.field public final synthetic b:Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

.field public final synthetic c:J

.field public final synthetic d:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLjava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly4/i;->a:Ljava/util/List;

    iput-object p2, p0, Ly4/i;->b:Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    iput-wide p3, p0, Ly4/i;->c:J

    iput-object p5, p0, Ly4/i;->d:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object v0, p0, Ly4/i;->a:Ljava/util/List;

    iget-object v1, p0, Ly4/i;->b:Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    iget-wide v2, p0, Ly4/i;->c:J

    iget-object v4, p0, Ly4/i;->d:Ljava/util/List;

    invoke-static {v0, v1, v2, v3, v4}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->h(Ljava/util/List;Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLjava/util/List;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    move-result-object v0

    return-object v0
.end method
