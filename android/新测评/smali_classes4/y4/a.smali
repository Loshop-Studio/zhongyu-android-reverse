.class public final synthetic Ly4/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:J

.field public final synthetic b:Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;


# direct methods
.method public synthetic constructor <init>(JLcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Ly4/a;->a:J

    iput-object p3, p0, Ly4/a;->b:Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-wide v0, p0, Ly4/a;->a:J

    iget-object v2, p0, Ly4/a;->b:Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    invoke-static {v0, v1, v2}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->j(JLcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    move-result-object v0

    return-object v0
.end method
