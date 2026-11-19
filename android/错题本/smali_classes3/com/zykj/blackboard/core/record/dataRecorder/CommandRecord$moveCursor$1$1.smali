# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class final Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$moveCursor$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lr6/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->moveCursor$lambda-25(Ljava/util/List;Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLcom/zykj/board/EzyPaint$Paint;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
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
.field final synthetic $eventList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/zykj/board/EzyTouchEvent$TouchEvent;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $paint:Lcom/zykj/board/EzyPaint$Paint;

.field final synthetic this$0:Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;


# direct methods
.method public constructor <init>(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;Ljava/util/List;Lcom/zykj/board/EzyPaint$Paint;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;",
            "Ljava/util/List<",
            "Lcom/zykj/board/EzyTouchEvent$TouchEvent;",
            ">;",
            "Lcom/zykj/board/EzyPaint$Paint;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$moveCursor$1$1;->this$0:Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    iput-object p2, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$moveCursor$1$1;->$eventList:Ljava/util/List;

    iput-object p3, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$moveCursor$1$1;->$paint:Lcom/zykj/board/EzyPaint$Paint;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Lcom/google/protobuf/Message;
    .locals 4
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 2
    invoke-static {}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CursorMove;->newBuilder()Lcom/zykj/board/m;

    move-result-object v0

    .line 3
    iget-object v1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$moveCursor$1$1;->this$0:Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    invoke-static {v1}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->access$getTouchSourceRecord$p(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;)Lcom/zykj/blackboard/core/record/dataRecorder/TouchSourceRecord;

    move-result-object v1

    iget-object v2, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$moveCursor$1$1;->$eventList:Ljava/util/List;

    iget-object v3, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$moveCursor$1$1;->$paint:Lcom/zykj/board/EzyPaint$Paint;

    invoke-virtual {v1, v2, v3}, Lcom/zykj/blackboard/core/record/dataRecorder/TouchSourceRecord;->addTouchEvent(Ljava/util/List;Lcom/zykj/board/EzyPaint$Paint;)Lcom/zykj/blackboard/bean/CommonSourceResult;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 4
    invoke-virtual {v1}, Lcom/zykj/blackboard/bean/CommonSourceResult;->getSourceFileName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    iput-object v2, v0, Lcom/zykj/board/m;->b:Ljava/lang/Object;

    .line 7
    iget v2, v0, Lcom/zykj/board/m;->a:I

    or-int/lit8 v2, v2, 0x1

    iput v2, v0, Lcom/zykj/board/m;->a:I

    .line 8
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 9
    invoke-virtual {v1}, Lcom/zykj/blackboard/bean/CommonSourceResult;->getSourceId()I

    move-result v1

    .line 10
    iput v1, v0, Lcom/zykj/board/m;->c:I

    .line 11
    iget v1, v0, Lcom/zykj/board/m;->a:I

    or-int/lit8 v1, v1, 0x2

    iput v1, v0, Lcom/zykj/board/m;->a:I

    .line 12
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 13
    :cond_0
    invoke-virtual {v0}, Lcom/zykj/board/m;->c()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CursorMove;

    move-result-object v0

    .line 14
    invoke-virtual {v0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CursorMove;->isInitialized()Z

    move-result v1

    if-eqz v1, :cond_1

    return-object v0

    .line 15
    :cond_1
    invoke-static {v0}, Lcom/google/protobuf/AbstractMessage$Builder;->newUninitializedMessageException(Lcom/google/protobuf/Message;)Lcom/google/protobuf/UninitializedMessageException;

    move-result-object v0

    throw v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$moveCursor$1$1;->invoke()Lcom/google/protobuf/Message;

    move-result-object v0

    return-object v0
.end method
