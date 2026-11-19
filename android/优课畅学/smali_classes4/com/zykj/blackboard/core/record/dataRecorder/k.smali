.class public final synthetic Lcom/zykj/blackboard/core/record/dataRecorder/k;
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

    iput-object p1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/k;->a:Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    iput-wide p2, p0, Lcom/zykj/blackboard/core/record/dataRecorder/k;->b:J

    iput-object p4, p0, Lcom/zykj/blackboard/core/record/dataRecorder/k;->c:Lcom/zykj/blackboard/core/graph/Graph;

    iput p5, p0, Lcom/zykj/blackboard/core/record/dataRecorder/k;->d:I

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/record/dataRecorder/k;->a:Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    iget-wide v1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/k;->b:J

    iget-object v3, p0, Lcom/zykj/blackboard/core/record/dataRecorder/k;->c:Lcom/zykj/blackboard/core/graph/Graph;

    iget v4, p0, Lcom/zykj/blackboard/core/record/dataRecorder/k;->d:I

    invoke-static {v0, v1, v2, v3, v4}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->k(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLcom/zykj/blackboard/core/graph/Graph;I)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    move-result-object v0

    return-object v0
.end method
