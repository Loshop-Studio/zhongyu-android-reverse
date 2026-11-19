.class public final synthetic Lcom/zykj/blackboard/core/record/dataRecorder/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Ljava/util/List;

.field public final synthetic b:Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

.field public final synthetic c:J

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

.field public final synthetic f:Ljava/lang/String;

.field public final synthetic g:Lcom/zykj/board/EzyPaint$Paint;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLjava/lang/String;Lcom/zykj/board/EzyGraphEnum$GraphEnum;Ljava/lang/String;Lcom/zykj/board/EzyPaint$Paint;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/c;->a:Ljava/util/List;

    iput-object p2, p0, Lcom/zykj/blackboard/core/record/dataRecorder/c;->b:Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    iput-wide p3, p0, Lcom/zykj/blackboard/core/record/dataRecorder/c;->c:J

    iput-object p5, p0, Lcom/zykj/blackboard/core/record/dataRecorder/c;->d:Ljava/lang/String;

    iput-object p6, p0, Lcom/zykj/blackboard/core/record/dataRecorder/c;->e:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    iput-object p7, p0, Lcom/zykj/blackboard/core/record/dataRecorder/c;->f:Ljava/lang/String;

    iput-object p8, p0, Lcom/zykj/blackboard/core/record/dataRecorder/c;->g:Lcom/zykj/board/EzyPaint$Paint;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/record/dataRecorder/c;->a:Ljava/util/List;

    iget-object v1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/c;->b:Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    iget-wide v2, p0, Lcom/zykj/blackboard/core/record/dataRecorder/c;->c:J

    iget-object v4, p0, Lcom/zykj/blackboard/core/record/dataRecorder/c;->d:Ljava/lang/String;

    iget-object v5, p0, Lcom/zykj/blackboard/core/record/dataRecorder/c;->e:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    iget-object v6, p0, Lcom/zykj/blackboard/core/record/dataRecorder/c;->f:Ljava/lang/String;

    iget-object v7, p0, Lcom/zykj/blackboard/core/record/dataRecorder/c;->g:Lcom/zykj/board/EzyPaint$Paint;

    invoke-static/range {v0 .. v7}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->l(Ljava/util/List;Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLjava/lang/String;Lcom/zykj/board/EzyGraphEnum$GraphEnum;Ljava/lang/String;Lcom/zykj/board/EzyPaint$Paint;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    move-result-object v0

    return-object v0
.end method
