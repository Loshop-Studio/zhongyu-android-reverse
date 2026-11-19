.class public final synthetic Lja/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

.field public final synthetic b:J

.field public final synthetic c:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

.field public final synthetic d:Lcom/zykj/board/EzyRectF$RectF;

.field public final synthetic e:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLcom/zykj/board/EzyGraphEnum$GraphEnum;Lcom/zykj/board/EzyRectF$RectF;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lja/d;->a:Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    iput-wide p2, p0, Lja/d;->b:J

    iput-object p4, p0, Lja/d;->c:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    iput-object p5, p0, Lja/d;->d:Lcom/zykj/board/EzyRectF$RectF;

    iput-object p6, p0, Lja/d;->e:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, Lja/d;->a:Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    iget-wide v1, p0, Lja/d;->b:J

    iget-object v3, p0, Lja/d;->c:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    iget-object v4, p0, Lja/d;->d:Lcom/zykj/board/EzyRectF$RectF;

    iget-object v5, p0, Lja/d;->e:Ljava/lang/String;

    invoke-static/range {v0 .. v5}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->f(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLcom/zykj/board/EzyGraphEnum$GraphEnum;Lcom/zykj/board/EzyRectF$RectF;Ljava/lang/String;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    move-result-object v0

    return-object v0
.end method
