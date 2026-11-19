.class public final synthetic Lcom/zykj/blackboard/core/record/dataRecorder/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

.field public final synthetic b:J

.field public final synthetic c:Lcom/zykj/blackboard/core/graph/Graph;

.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLcom/zykj/blackboard/core/graph/Graph;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/i;->a:Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    iput-wide p2, p0, Lcom/zykj/blackboard/core/record/dataRecorder/i;->b:J

    iput-object p4, p0, Lcom/zykj/blackboard/core/record/dataRecorder/i;->c:Lcom/zykj/blackboard/core/graph/Graph;

    iput p5, p0, Lcom/zykj/blackboard/core/record/dataRecorder/i;->d:I

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/record/dataRecorder/i;->c:Lcom/zykj/blackboard/core/graph/Graph;

    iget v1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/i;->d:I

    iget-object v2, p0, Lcom/zykj/blackboard/core/record/dataRecorder/i;->a:Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    iget-wide v3, p0, Lcom/zykj/blackboard/core/record/dataRecorder/i;->b:J

    invoke-static {v2, v3, v4, v0, v1}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->k(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLcom/zykj/blackboard/core/graph/Graph;I)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    move-result-object v0

    return-object v0
.end method
