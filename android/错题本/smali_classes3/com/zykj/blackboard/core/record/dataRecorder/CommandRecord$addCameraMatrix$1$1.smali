# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class final Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addCameraMatrix$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lr6/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->addCameraMatrix$lambda-15(Ljava/util/List;Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLcom/zykj/board/EzyMatrix$Matrix;Lcom/zykj/board/EzyMatrix$Matrix;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lr6/a;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "Lcom/google/protobuf/Message;",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $lastMatrix:Lcom/zykj/board/EzyMatrix$Matrix;

.field final synthetic $matrixList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/zykj/board/EzyMatrix$Matrix;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $originMatrix:Lcom/zykj/board/EzyMatrix$Matrix;

.field final synthetic this$0:Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;


# direct methods
.method public constructor <init>(Lcom/zykj/board/EzyMatrix$Matrix;Lcom/zykj/board/EzyMatrix$Matrix;Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/board/EzyMatrix$Matrix;",
            "Lcom/zykj/board/EzyMatrix$Matrix;",
            "Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;",
            "Ljava/util/List<",
            "Lcom/zykj/board/EzyMatrix$Matrix;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addCameraMatrix$1$1;->$lastMatrix:Lcom/zykj/board/EzyMatrix$Matrix;

    iput-object p2, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addCameraMatrix$1$1;->$originMatrix:Lcom/zykj/board/EzyMatrix$Matrix;

    iput-object p3, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addCameraMatrix$1$1;->this$0:Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    iput-object p4, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addCameraMatrix$1$1;->$matrixList:Ljava/util/List;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Lcom/google/protobuf/Message;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 2
    invoke-static {}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix;->newBuilder()Lcom/zykj/board/i;

    move-result-object v0

    .line 3
    iget-object v1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addCameraMatrix$1$1;->$lastMatrix:Lcom/zykj/board/EzyMatrix$Matrix;

    .line 4
    iget-object v2, v0, Lcom/zykj/board/i;->e:Lcom/google/protobuf/SingleFieldBuilderV3;

    if-nez v2, :cond_0

    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    iput-object v1, v0, Lcom/zykj/board/i;->d:Lcom/zykj/board/EzyMatrix$Matrix;

    goto :goto_0

    .line 7
    :cond_0
    invoke-virtual {v2, v1}, Lcom/google/protobuf/SingleFieldBuilderV3;->setMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 8
    :goto_0
    iget v1, v0, Lcom/zykj/board/i;->a:I

    or-int/lit8 v1, v1, 0x2

    iput v1, v0, Lcom/zykj/board/i;->a:I

    .line 9
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 10
    iget-object v1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addCameraMatrix$1$1;->$originMatrix:Lcom/zykj/board/EzyMatrix$Matrix;

    .line 11
    iget-object v2, v0, Lcom/zykj/board/i;->c:Lcom/google/protobuf/SingleFieldBuilderV3;

    if-nez v2, :cond_1

    .line 12
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    iput-object v1, v0, Lcom/zykj/board/i;->b:Lcom/zykj/board/EzyMatrix$Matrix;

    goto :goto_1

    .line 14
    :cond_1
    invoke-virtual {v2, v1}, Lcom/google/protobuf/SingleFieldBuilderV3;->setMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 15
    :goto_1
    iget v1, v0, Lcom/zykj/board/i;->a:I

    or-int/lit8 v1, v1, 0x1

    iput v1, v0, Lcom/zykj/board/i;->a:I

    .line 16
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 17
    iget-object v1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addCameraMatrix$1$1;->this$0:Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    invoke-static {v1}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->access$getMatrixSourceRecord$p(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;)Lcom/zykj/blackboard/core/record/dataRecorder/MatrixSourceRecord;

    move-result-object v1

    iget-object v2, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addCameraMatrix$1$1;->$matrixList:Ljava/util/List;

    invoke-virtual {v1, v2}, Lcom/zykj/blackboard/core/record/dataRecorder/MatrixSourceRecord;->add(Ljava/util/List;)Lcom/zykj/blackboard/bean/CommonSourceResult;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 18
    invoke-virtual {v1}, Lcom/zykj/blackboard/bean/CommonSourceResult;->getSourceFileName()Ljava/lang/String;

    move-result-object v2

    .line 19
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    iput-object v2, v0, Lcom/zykj/board/i;->f:Ljava/lang/Object;

    .line 21
    iget v2, v0, Lcom/zykj/board/i;->a:I

    or-int/lit8 v2, v2, 0x4

    iput v2, v0, Lcom/zykj/board/i;->a:I

    .line 22
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 23
    invoke-virtual {v1}, Lcom/zykj/blackboard/bean/CommonSourceResult;->getSourceId()I

    move-result v1

    .line 24
    iput v1, v0, Lcom/zykj/board/i;->g:I

    .line 25
    iget v1, v0, Lcom/zykj/board/i;->a:I

    or-int/lit8 v1, v1, 0x8

    iput v1, v0, Lcom/zykj/board/i;->a:I

    .line 26
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 27
    :cond_2
    invoke-virtual {v0}, Lcom/zykj/board/i;->c()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix;

    move-result-object v0

    .line 28
    invoke-virtual {v0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix;->isInitialized()Z

    move-result v1

    if-eqz v1, :cond_3

    return-object v0

    .line 29
    :cond_3
    invoke-static {v0}, Lcom/google/protobuf/AbstractMessage$Builder;->newUninitializedMessageException(Lcom/google/protobuf/Message;)Lcom/google/protobuf/UninitializedMessageException;

    move-result-object v0

    throw v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addCameraMatrix$1$1;->invoke()Lcom/google/protobuf/Message;

    move-result-object v0

    return-object v0
.end method
