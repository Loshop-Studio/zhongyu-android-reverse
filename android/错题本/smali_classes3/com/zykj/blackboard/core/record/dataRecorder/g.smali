.class public final synthetic Lcom/zykj/blackboard/core/record/dataRecorder/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

.field public final synthetic c:J

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLcom/zykj/board/EzyMatrix$Matrix;Lcom/zykj/board/EzyMatrix$Matrix;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lcom/zykj/blackboard/core/record/dataRecorder/g;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/g;->b:Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    iput-wide p2, p0, Lcom/zykj/blackboard/core/record/dataRecorder/g;->c:J

    iput-object p4, p0, Lcom/zykj/blackboard/core/record/dataRecorder/g;->d:Ljava/lang/Object;

    iput-object p5, p0, Lcom/zykj/blackboard/core/record/dataRecorder/g;->e:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLjava/lang/Object;I)V
    .locals 0

    .line 2
    iput p6, p0, Lcom/zykj/blackboard/core/record/dataRecorder/g;->a:I

    iput-object p1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/g;->d:Ljava/lang/Object;

    iput-object p2, p0, Lcom/zykj/blackboard/core/record/dataRecorder/g;->b:Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    iput-wide p3, p0, Lcom/zykj/blackboard/core/record/dataRecorder/g;->c:J

    iput-object p5, p0, Lcom/zykj/blackboard/core/record/dataRecorder/g;->e:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/core/record/dataRecorder/g;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/zykj/blackboard/core/record/dataRecorder/g;->d:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    iget-object v1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/g;->e:Ljava/lang/Object;

    check-cast v1, Lcom/zykj/board/EzyPaint$Paint;

    iget-object v2, p0, Lcom/zykj/blackboard/core/record/dataRecorder/g;->b:Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    iget-wide v3, p0, Lcom/zykj/blackboard/core/record/dataRecorder/g;->c:J

    invoke-static {v0, v2, v3, v4, v1}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->c(Ljava/util/List;Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLcom/zykj/board/EzyPaint$Paint;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lcom/zykj/blackboard/core/record/dataRecorder/g;->d:Ljava/lang/Object;

    check-cast v0, Lcom/zykj/board/EzyMatrix$Matrix;

    iget-object v1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/g;->e:Ljava/lang/Object;

    check-cast v1, Lcom/zykj/board/EzyMatrix$Matrix;

    iget-object v2, p0, Lcom/zykj/blackboard/core/record/dataRecorder/g;->b:Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    iget-wide v3, p0, Lcom/zykj/blackboard/core/record/dataRecorder/g;->c:J

    invoke-static {v2, v3, v4, v0, v1}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->i(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLcom/zykj/board/EzyMatrix$Matrix;Lcom/zykj/board/EzyMatrix$Matrix;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lcom/zykj/blackboard/core/record/dataRecorder/g;->d:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    iget-object v1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/g;->e:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    iget-object v2, p0, Lcom/zykj/blackboard/core/record/dataRecorder/g;->b:Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    iget-wide v3, p0, Lcom/zykj/blackboard/core/record/dataRecorder/g;->c:J

    invoke-static {v0, v2, v3, v4, v1}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->d(Ljava/util/List;Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLjava/util/List;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
