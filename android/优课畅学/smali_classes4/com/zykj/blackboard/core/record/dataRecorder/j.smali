.class public final synthetic Lcom/zykj/blackboard/core/record/dataRecorder/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

.field public final synthetic b:J

.field public final synthetic c:F

.field public final synthetic d:F

.field public final synthetic e:Ljava/lang/String;

.field public final synthetic f:Ljava/lang/String;

.field public final synthetic g:Lcom/zykj/board/EzyPaint$Paint;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JFFLjava/lang/String;Ljava/lang/String;Lcom/zykj/board/EzyPaint$Paint;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/j;->a:Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    iput-wide p2, p0, Lcom/zykj/blackboard/core/record/dataRecorder/j;->b:J

    iput p4, p0, Lcom/zykj/blackboard/core/record/dataRecorder/j;->c:F

    iput p5, p0, Lcom/zykj/blackboard/core/record/dataRecorder/j;->d:F

    iput-object p6, p0, Lcom/zykj/blackboard/core/record/dataRecorder/j;->e:Ljava/lang/String;

    iput-object p7, p0, Lcom/zykj/blackboard/core/record/dataRecorder/j;->f:Ljava/lang/String;

    iput-object p8, p0, Lcom/zykj/blackboard/core/record/dataRecorder/j;->g:Lcom/zykj/board/EzyPaint$Paint;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/record/dataRecorder/j;->a:Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    iget-wide v1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/j;->b:J

    iget v3, p0, Lcom/zykj/blackboard/core/record/dataRecorder/j;->c:F

    iget v4, p0, Lcom/zykj/blackboard/core/record/dataRecorder/j;->d:F

    iget-object v5, p0, Lcom/zykj/blackboard/core/record/dataRecorder/j;->e:Ljava/lang/String;

    iget-object v6, p0, Lcom/zykj/blackboard/core/record/dataRecorder/j;->f:Ljava/lang/String;

    iget-object v7, p0, Lcom/zykj/blackboard/core/record/dataRecorder/j;->g:Lcom/zykj/board/EzyPaint$Paint;

    invoke-static/range {v0 .. v7}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->m(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JFFLjava/lang/String;Ljava/lang/String;Lcom/zykj/board/EzyPaint$Paint;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    move-result-object v0

    return-object v0
.end method
