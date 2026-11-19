# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class final Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$changeGraph$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lr6/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->changeGraph$lambda-11(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLjava/lang/String;Lcom/zykj/board/EzyGraphEnum$GraphEnum;Lcom/zykj/board/EzyRectF$RectF;Ljava/lang/String;Lcom/zykj/board/EzyPaint$Paint;Ljava/util/List;Lcom/zykj/board/EzyMatrix$Matrix;Ljava/lang/String;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
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
.field final synthetic $content:Ljava/lang/String;

.field final synthetic $filePath:Ljava/lang/String;

.field final synthetic $graphEnum:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

.field final synthetic $graphId:Ljava/lang/String;

.field final synthetic $originRectF:Lcom/zykj/board/EzyRectF$RectF;

.field final synthetic $paint:Lcom/zykj/board/EzyPaint$Paint;

.field final synthetic $points:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/zykj/board/EzyPointF$PointF;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $renderMatrix:Lcom/zykj/board/EzyMatrix$Matrix;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/zykj/board/EzyGraphEnum$GraphEnum;Lcom/zykj/board/EzyRectF$RectF;Ljava/lang/String;Lcom/zykj/board/EzyPaint$Paint;Ljava/util/List;Lcom/zykj/board/EzyMatrix$Matrix;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/zykj/board/EzyGraphEnum$GraphEnum;",
            "Lcom/zykj/board/EzyRectF$RectF;",
            "Ljava/lang/String;",
            "Lcom/zykj/board/EzyPaint$Paint;",
            "Ljava/util/List<",
            "Lcom/zykj/board/EzyPointF$PointF;",
            ">;",
            "Lcom/zykj/board/EzyMatrix$Matrix;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$changeGraph$1$1;->$graphId:Ljava/lang/String;

    iput-object p2, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$changeGraph$1$1;->$graphEnum:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    iput-object p3, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$changeGraph$1$1;->$originRectF:Lcom/zykj/board/EzyRectF$RectF;

    iput-object p4, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$changeGraph$1$1;->$content:Ljava/lang/String;

    iput-object p5, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$changeGraph$1$1;->$paint:Lcom/zykj/board/EzyPaint$Paint;

    iput-object p6, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$changeGraph$1$1;->$points:Ljava/util/List;

    iput-object p7, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$changeGraph$1$1;->$renderMatrix:Lcom/zykj/board/EzyMatrix$Matrix;

    iput-object p8, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$changeGraph$1$1;->$filePath:Ljava/lang/String;

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
    invoke-static {}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->newBuilder()Lcom/zykj/board/o;

    move-result-object v0

    .line 3
    iget-object v1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$changeGraph$1$1;->$graphId:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    iput-object v1, v0, Lcom/zykj/board/o;->b:Ljava/lang/Object;

    .line 6
    iget v1, v0, Lcom/zykj/board/o;->a:I

    or-int/lit8 v1, v1, 0x1

    iput v1, v0, Lcom/zykj/board/o;->a:I

    .line 7
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 8
    iget-object v1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$changeGraph$1$1;->$graphEnum:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    iget v2, v0, Lcom/zykj/board/o;->a:I

    or-int/lit8 v2, v2, 0x2

    iput v2, v0, Lcom/zykj/board/o;->a:I

    .line 11
    invoke-virtual {v1}, Lcom/zykj/board/EzyGraphEnum$GraphEnum;->getNumber()I

    move-result v1

    iput v1, v0, Lcom/zykj/board/o;->c:I

    .line 12
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 13
    iget-object v1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$changeGraph$1$1;->$originRectF:Lcom/zykj/board/EzyRectF$RectF;

    if-eqz v1, :cond_1

    .line 14
    iget-object v2, v0, Lcom/zykj/board/o;->e:Lcom/google/protobuf/SingleFieldBuilderV3;

    if-nez v2, :cond_0

    .line 15
    iput-object v1, v0, Lcom/zykj/board/o;->d:Lcom/zykj/board/EzyRectF$RectF;

    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {v2, v1}, Lcom/google/protobuf/SingleFieldBuilderV3;->setMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 17
    :goto_0
    iget v1, v0, Lcom/zykj/board/o;->a:I

    or-int/lit8 v1, v1, 0x4

    iput v1, v0, Lcom/zykj/board/o;->a:I

    .line 18
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 19
    :cond_1
    iget-object v1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$changeGraph$1$1;->$content:Ljava/lang/String;

    if-eqz v1, :cond_2

    .line 20
    iput-object v1, v0, Lcom/zykj/board/o;->f:Ljava/lang/Object;

    .line 21
    iget v1, v0, Lcom/zykj/board/o;->a:I

    or-int/lit8 v1, v1, 0x8

    iput v1, v0, Lcom/zykj/board/o;->a:I

    .line 22
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 23
    :cond_2
    iget-object v1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$changeGraph$1$1;->$paint:Lcom/zykj/board/EzyPaint$Paint;

    if-eqz v1, :cond_4

    .line 24
    iget-object v2, v0, Lcom/zykj/board/o;->h:Lcom/google/protobuf/SingleFieldBuilderV3;

    if-nez v2, :cond_3

    .line 25
    iput-object v1, v0, Lcom/zykj/board/o;->g:Lcom/zykj/board/EzyPaint$Paint;

    goto :goto_1

    .line 26
    :cond_3
    invoke-virtual {v2, v1}, Lcom/google/protobuf/SingleFieldBuilderV3;->setMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 27
    :goto_1
    iget v1, v0, Lcom/zykj/board/o;->a:I

    or-int/lit8 v1, v1, 0x10

    iput v1, v0, Lcom/zykj/board/o;->a:I

    .line 28
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 29
    :cond_4
    iget-object v1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$changeGraph$1$1;->$points:Ljava/util/List;

    if-eqz v1, :cond_6

    .line 30
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/zykj/board/EzyPointF$PointF;

    .line 31
    iget-object v3, v0, Lcom/zykj/board/o;->j:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    if-nez v3, :cond_5

    .line 32
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    invoke-virtual {v0}, Lcom/zykj/board/o;->ensurePointsIsMutable()V

    .line 34
    iget-object v3, v0, Lcom/zykj/board/o;->i:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 35
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    goto :goto_2

    .line 36
    :cond_5
    invoke-virtual {v3, v2}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/RepeatedFieldBuilderV3;

    goto :goto_2

    .line 37
    :cond_6
    iget-object v1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$changeGraph$1$1;->$renderMatrix:Lcom/zykj/board/EzyMatrix$Matrix;

    if-eqz v1, :cond_8

    .line 38
    iget-object v2, v0, Lcom/zykj/board/o;->l:Lcom/google/protobuf/SingleFieldBuilderV3;

    if-nez v2, :cond_7

    .line 39
    iput-object v1, v0, Lcom/zykj/board/o;->k:Lcom/zykj/board/EzyMatrix$Matrix;

    goto :goto_3

    .line 40
    :cond_7
    invoke-virtual {v2, v1}, Lcom/google/protobuf/SingleFieldBuilderV3;->setMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 41
    :goto_3
    iget v1, v0, Lcom/zykj/board/o;->a:I

    or-int/lit8 v1, v1, 0x40

    iput v1, v0, Lcom/zykj/board/o;->a:I

    .line 42
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 43
    :cond_8
    iget-object v1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$changeGraph$1$1;->$filePath:Ljava/lang/String;

    if-eqz v1, :cond_9

    .line 44
    iput-object v1, v0, Lcom/zykj/board/o;->m:Ljava/lang/Object;

    .line 45
    iget v1, v0, Lcom/zykj/board/o;->a:I

    or-int/lit16 v1, v1, 0x80

    iput v1, v0, Lcom/zykj/board/o;->a:I

    .line 46
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 47
    :cond_9
    invoke-virtual {v0}, Lcom/zykj/board/o;->c()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;

    move-result-object v0

    .line 48
    invoke-virtual {v0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->isInitialized()Z

    move-result v1

    if-eqz v1, :cond_a

    return-object v0

    .line 49
    :cond_a
    invoke-static {v0}, Lcom/google/protobuf/AbstractMessage$Builder;->newUninitializedMessageException(Lcom/google/protobuf/Message;)Lcom/google/protobuf/UninitializedMessageException;

    move-result-object v0

    throw v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$changeGraph$1$1;->invoke()Lcom/google/protobuf/Message;

    move-result-object v0

    return-object v0
.end method
