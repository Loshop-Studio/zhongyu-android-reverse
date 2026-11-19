.class public final synthetic Lcom/zykj/blackboard/core/record/dataRecorder/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

.field public final synthetic b:J

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

.field public final synthetic e:Lcom/zykj/board/EzyRectF$RectF;

.field public final synthetic f:Ljava/lang/String;

.field public final synthetic g:Lcom/zykj/board/EzyPaint$Paint;

.field public final synthetic h:Ljava/util/List;

.field public final synthetic i:Lcom/zykj/board/EzyMatrix$Matrix;

.field public final synthetic j:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLjava/lang/String;Lcom/zykj/board/EzyGraphEnum$GraphEnum;Lcom/zykj/board/EzyRectF$RectF;Ljava/lang/String;Lcom/zykj/board/EzyPaint$Paint;Ljava/util/List;Lcom/zykj/board/EzyMatrix$Matrix;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/m;->a:Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    iput-wide p2, p0, Lcom/zykj/blackboard/core/record/dataRecorder/m;->b:J

    iput-object p4, p0, Lcom/zykj/blackboard/core/record/dataRecorder/m;->c:Ljava/lang/String;

    iput-object p5, p0, Lcom/zykj/blackboard/core/record/dataRecorder/m;->d:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    iput-object p6, p0, Lcom/zykj/blackboard/core/record/dataRecorder/m;->e:Lcom/zykj/board/EzyRectF$RectF;

    iput-object p7, p0, Lcom/zykj/blackboard/core/record/dataRecorder/m;->f:Ljava/lang/String;

    iput-object p8, p0, Lcom/zykj/blackboard/core/record/dataRecorder/m;->g:Lcom/zykj/board/EzyPaint$Paint;

    iput-object p9, p0, Lcom/zykj/blackboard/core/record/dataRecorder/m;->h:Ljava/util/List;

    iput-object p10, p0, Lcom/zykj/blackboard/core/record/dataRecorder/m;->i:Lcom/zykj/board/EzyMatrix$Matrix;

    iput-object p11, p0, Lcom/zykj/blackboard/core/record/dataRecorder/m;->j:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 11

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/record/dataRecorder/m;->a:Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    iget-wide v1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/m;->b:J

    iget-object v3, p0, Lcom/zykj/blackboard/core/record/dataRecorder/m;->c:Ljava/lang/String;

    iget-object v4, p0, Lcom/zykj/blackboard/core/record/dataRecorder/m;->d:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    iget-object v5, p0, Lcom/zykj/blackboard/core/record/dataRecorder/m;->e:Lcom/zykj/board/EzyRectF$RectF;

    iget-object v6, p0, Lcom/zykj/blackboard/core/record/dataRecorder/m;->f:Ljava/lang/String;

    iget-object v7, p0, Lcom/zykj/blackboard/core/record/dataRecorder/m;->g:Lcom/zykj/board/EzyPaint$Paint;

    iget-object v8, p0, Lcom/zykj/blackboard/core/record/dataRecorder/m;->h:Ljava/util/List;

    iget-object v9, p0, Lcom/zykj/blackboard/core/record/dataRecorder/m;->i:Lcom/zykj/board/EzyMatrix$Matrix;

    iget-object v10, p0, Lcom/zykj/blackboard/core/record/dataRecorder/m;->j:Ljava/lang/String;

    invoke-static/range {v0 .. v10}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->h(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLjava/lang/String;Lcom/zykj/board/EzyGraphEnum$GraphEnum;Lcom/zykj/board/EzyRectF$RectF;Ljava/lang/String;Lcom/zykj/board/EzyPaint$Paint;Ljava/util/List;Lcom/zykj/board/EzyMatrix$Matrix;Ljava/lang/String;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    move-result-object v0

    return-object v0
.end method
