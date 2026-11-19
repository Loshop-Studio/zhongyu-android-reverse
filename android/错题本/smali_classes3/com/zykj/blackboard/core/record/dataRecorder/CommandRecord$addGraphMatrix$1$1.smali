# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class final Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addGraphMatrix$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lr6/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->addGraphMatrix$lambda-13(Ljava/util/List;Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLjava/util/List;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
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
.field final synthetic $graphIdList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $matrixList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/zykj/board/EzyMatrix$Matrix;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;


# direct methods
.method public constructor <init>(Ljava/util/List;Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;",
            ">;",
            "Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;",
            "Ljava/util/List<",
            "Lcom/zykj/board/EzyMatrix$Matrix;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addGraphMatrix$1$1;->$graphIdList:Ljava/util/List;

    iput-object p2, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addGraphMatrix$1$1;->this$0:Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    iput-object p3, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addGraphMatrix$1$1;->$matrixList:Ljava/util/List;

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
    invoke-static {}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix;->newBuilder()Lcom/zykj/board/t;

    move-result-object v0

    .line 3
    iget-object v1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addGraphMatrix$1$1;->$graphIdList:Ljava/util/List;

    .line 4
    iget-object v2, v0, Lcom/zykj/board/t;->c:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    if-nez v2, :cond_0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/board/t;->f()V

    .line 6
    iget-object v2, v0, Lcom/zykj/board/t;->b:Ljava/util/List;

    invoke-static {v1, v2}, Lcom/google/protobuf/AbstractMessageLite$Builder;->addAll(Ljava/lang/Iterable;Ljava/util/List;)V

    .line 7
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {v2, v1}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addAllMessages(Ljava/lang/Iterable;)Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 9
    :goto_0
    iget-object v1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addGraphMatrix$1$1;->this$0:Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    invoke-static {v1}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->access$getMatrixSourceRecord$p(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;)Lcom/zykj/blackboard/core/record/dataRecorder/MatrixSourceRecord;

    move-result-object v1

    iget-object v2, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addGraphMatrix$1$1;->$matrixList:Ljava/util/List;

    invoke-virtual {v1, v2}, Lcom/zykj/blackboard/core/record/dataRecorder/MatrixSourceRecord;->add(Ljava/util/List;)Lcom/zykj/blackboard/bean/CommonSourceResult;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 10
    invoke-virtual {v1}, Lcom/zykj/blackboard/bean/CommonSourceResult;->getSourceFileName()Ljava/lang/String;

    move-result-object v2

    .line 11
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    iput-object v2, v0, Lcom/zykj/board/t;->h:Ljava/lang/Object;

    .line 13
    iget v2, v0, Lcom/zykj/board/t;->a:I

    or-int/lit8 v2, v2, 0x8

    iput v2, v0, Lcom/zykj/board/t;->a:I

    .line 14
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 15
    invoke-virtual {v1}, Lcom/zykj/blackboard/bean/CommonSourceResult;->getSourceId()I

    move-result v1

    .line 16
    iput v1, v0, Lcom/zykj/board/t;->i:I

    .line 17
    iget v1, v0, Lcom/zykj/board/t;->a:I

    or-int/lit8 v1, v1, 0x10

    iput v1, v0, Lcom/zykj/board/t;->a:I

    .line 18
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 19
    :cond_1
    invoke-virtual {v0}, Lcom/zykj/board/t;->c()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix;

    move-result-object v0

    .line 20
    invoke-virtual {v0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix;->isInitialized()Z

    move-result v1

    if-eqz v1, :cond_2

    return-object v0

    .line 21
    :cond_2
    invoke-static {v0}, Lcom/google/protobuf/AbstractMessage$Builder;->newUninitializedMessageException(Lcom/google/protobuf/Message;)Lcom/google/protobuf/UninitializedMessageException;

    move-result-object v0

    throw v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addGraphMatrix$1$1;->invoke()Lcom/google/protobuf/Message;

    move-result-object v0

    return-object v0
.end method
