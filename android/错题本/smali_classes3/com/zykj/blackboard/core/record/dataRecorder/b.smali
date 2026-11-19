.class public final synthetic Lcom/zykj/blackboard/core/record/dataRecorder/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

.field public final synthetic b:J

.field public final synthetic c:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

.field public final synthetic d:I

.field public final synthetic e:I

.field public final synthetic f:Ljava/lang/String;

.field public final synthetic g:Ljava/lang/String;

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Z


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLcom/zykj/board/EzyGraphEnum$GraphEnum;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/b;->a:Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    iput-wide p2, p0, Lcom/zykj/blackboard/core/record/dataRecorder/b;->b:J

    iput-object p4, p0, Lcom/zykj/blackboard/core/record/dataRecorder/b;->c:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    iput p5, p0, Lcom/zykj/blackboard/core/record/dataRecorder/b;->d:I

    iput p6, p0, Lcom/zykj/blackboard/core/record/dataRecorder/b;->e:I

    iput-object p7, p0, Lcom/zykj/blackboard/core/record/dataRecorder/b;->f:Ljava/lang/String;

    iput-object p8, p0, Lcom/zykj/blackboard/core/record/dataRecorder/b;->g:Ljava/lang/String;

    iput-object p9, p0, Lcom/zykj/blackboard/core/record/dataRecorder/b;->h:Ljava/lang/String;

    iput-boolean p10, p0, Lcom/zykj/blackboard/core/record/dataRecorder/b;->i:Z

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 10

    .line 1
    iget-object v8, p0, Lcom/zykj/blackboard/core/record/dataRecorder/b;->h:Ljava/lang/String;

    iget-boolean v9, p0, Lcom/zykj/blackboard/core/record/dataRecorder/b;->i:Z

    iget-object v0, p0, Lcom/zykj/blackboard/core/record/dataRecorder/b;->a:Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    iget-wide v1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/b;->b:J

    iget-object v3, p0, Lcom/zykj/blackboard/core/record/dataRecorder/b;->c:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    iget v4, p0, Lcom/zykj/blackboard/core/record/dataRecorder/b;->d:I

    iget v5, p0, Lcom/zykj/blackboard/core/record/dataRecorder/b;->e:I

    iget-object v6, p0, Lcom/zykj/blackboard/core/record/dataRecorder/b;->f:Ljava/lang/String;

    iget-object v7, p0, Lcom/zykj/blackboard/core/record/dataRecorder/b;->g:Ljava/lang/String;

    invoke-static/range {v0 .. v9}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->e(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLcom/zykj/board/EzyGraphEnum$GraphEnum;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    move-result-object v0

    return-object v0
.end method
