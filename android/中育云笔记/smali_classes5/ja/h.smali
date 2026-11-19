.class public final synthetic Lja/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Ljava/util/List;

.field public final synthetic b:Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

.field public final synthetic c:J

.field public final synthetic d:Lcom/zykj/board/EzyMatrix$Matrix;

.field public final synthetic e:Lcom/zykj/board/EzyMatrix$Matrix;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLcom/zykj/board/EzyMatrix$Matrix;Lcom/zykj/board/EzyMatrix$Matrix;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lja/h;->a:Ljava/util/List;

    iput-object p2, p0, Lja/h;->b:Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    iput-wide p3, p0, Lja/h;->c:J

    iput-object p5, p0, Lja/h;->d:Lcom/zykj/board/EzyMatrix$Matrix;

    iput-object p6, p0, Lja/h;->e:Lcom/zykj/board/EzyMatrix$Matrix;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, Lja/h;->a:Ljava/util/List;

    iget-object v1, p0, Lja/h;->b:Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    iget-wide v2, p0, Lja/h;->c:J

    iget-object v4, p0, Lja/h;->d:Lcom/zykj/board/EzyMatrix$Matrix;

    iget-object v5, p0, Lja/h;->e:Lcom/zykj/board/EzyMatrix$Matrix;

    invoke-static/range {v0 .. v5}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->r(Ljava/util/List;Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLcom/zykj/board/EzyMatrix$Matrix;Lcom/zykj/board/EzyMatrix$Matrix;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    move-result-object v0

    return-object v0
.end method
