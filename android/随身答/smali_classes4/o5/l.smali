.class public final synthetic Lo5/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

.field public final synthetic b:J

.field public final synthetic c:Lcom/zykj/board/EzyMatrix$Matrix;

.field public final synthetic d:Lcom/zykj/board/EzyMatrix$Matrix;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLcom/zykj/board/EzyMatrix$Matrix;Lcom/zykj/board/EzyMatrix$Matrix;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo5/l;->a:Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    iput-wide p2, p0, Lo5/l;->b:J

    iput-object p4, p0, Lo5/l;->c:Lcom/zykj/board/EzyMatrix$Matrix;

    iput-object p5, p0, Lo5/l;->d:Lcom/zykj/board/EzyMatrix$Matrix;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object v0, p0, Lo5/l;->a:Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    iget-wide v1, p0, Lo5/l;->b:J

    iget-object v3, p0, Lo5/l;->c:Lcom/zykj/board/EzyMatrix$Matrix;

    iget-object v4, p0, Lo5/l;->d:Lcom/zykj/board/EzyMatrix$Matrix;

    invoke-static {v0, v1, v2, v3, v4}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->m(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLcom/zykj/board/EzyMatrix$Matrix;Lcom/zykj/board/EzyMatrix$Matrix;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    move-result-object v0

    return-object v0
.end method
