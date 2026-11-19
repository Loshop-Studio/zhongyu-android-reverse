# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class public final synthetic Lcom/zykj/blackboard/core/record/dataRecorder/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

.field public final synthetic c:J

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Lcom/google/protobuf/GeneratedMessageV3;

.field public final synthetic f:Ljava/io/Serializable;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLcom/zykj/board/EzyGraphEnum$GraphEnum;Lcom/zykj/board/EzyRectF$RectF;Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lcom/zykj/blackboard/core/record/dataRecorder/d;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/d;->b:Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    iput-wide p2, p0, Lcom/zykj/blackboard/core/record/dataRecorder/d;->c:J

    iput-object p4, p0, Lcom/zykj/blackboard/core/record/dataRecorder/d;->d:Ljava/lang/Object;

    iput-object p5, p0, Lcom/zykj/blackboard/core/record/dataRecorder/d;->e:Lcom/google/protobuf/GeneratedMessageV3;

    iput-object p6, p0, Lcom/zykj/blackboard/core/record/dataRecorder/d;->f:Ljava/io/Serializable;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLcom/zykj/board/EzyMatrix$Matrix;Lcom/zykj/board/EzyMatrix$Matrix;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lcom/zykj/blackboard/core/record/dataRecorder/d;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/d;->d:Ljava/lang/Object;

    iput-object p2, p0, Lcom/zykj/blackboard/core/record/dataRecorder/d;->b:Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    iput-wide p3, p0, Lcom/zykj/blackboard/core/record/dataRecorder/d;->c:J

    iput-object p5, p0, Lcom/zykj/blackboard/core/record/dataRecorder/d;->e:Lcom/google/protobuf/GeneratedMessageV3;

    iput-object p6, p0, Lcom/zykj/blackboard/core/record/dataRecorder/d;->f:Ljava/io/Serializable;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/core/record/dataRecorder/d;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/zykj/blackboard/core/record/dataRecorder/d;->d:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ljava/util/List;

    iget-object v0, p0, Lcom/zykj/blackboard/core/record/dataRecorder/d;->e:Lcom/google/protobuf/GeneratedMessageV3;

    move-object v5, v0

    check-cast v5, Lcom/zykj/board/EzyMatrix$Matrix;

    iget-object v0, p0, Lcom/zykj/blackboard/core/record/dataRecorder/d;->f:Ljava/io/Serializable;

    move-object v6, v0

    check-cast v6, Lcom/zykj/board/EzyMatrix$Matrix;

    iget-object v2, p0, Lcom/zykj/blackboard/core/record/dataRecorder/d;->b:Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    iget-wide v3, p0, Lcom/zykj/blackboard/core/record/dataRecorder/d;->c:J

    invoke-static/range {v1 .. v6}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->n(Ljava/util/List;Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLcom/zykj/board/EzyMatrix$Matrix;Lcom/zykj/board/EzyMatrix$Matrix;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lcom/zykj/blackboard/core/record/dataRecorder/d;->d:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    iget-object v0, p0, Lcom/zykj/blackboard/core/record/dataRecorder/d;->e:Lcom/google/protobuf/GeneratedMessageV3;

    move-object v5, v0

    check-cast v5, Lcom/zykj/board/EzyRectF$RectF;

    iget-object v0, p0, Lcom/zykj/blackboard/core/record/dataRecorder/d;->f:Ljava/io/Serializable;

    move-object v6, v0

    check-cast v6, Ljava/lang/String;

    iget-object v1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/d;->b:Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    iget-wide v2, p0, Lcom/zykj/blackboard/core/record/dataRecorder/d;->c:J

    invoke-static/range {v1 .. v6}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->b(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLcom/zykj/board/EzyGraphEnum$GraphEnum;Lcom/zykj/board/EzyRectF$RectF;Ljava/lang/String;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
