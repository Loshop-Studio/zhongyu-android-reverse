# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class final Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addConfigCommand$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lr6/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->addConfigCommand$lambda-19(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JIILcom/zykj/blackboard/bean/BackgroundLineConfig;Lcom/zykj/blackboard/bean/BackgroundLineConfig;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
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
.field final synthetic $lastBackgroundColor:I

.field final synthetic $lastBackgroundLineConfig:Lcom/zykj/blackboard/bean/BackgroundLineConfig;

.field final synthetic $originBackgroundColor:I

.field final synthetic $originBackgroundLineConfig:Lcom/zykj/blackboard/bean/BackgroundLineConfig;


# direct methods
.method public constructor <init>(IILcom/zykj/blackboard/bean/BackgroundLineConfig;Lcom/zykj/blackboard/bean/BackgroundLineConfig;)V
    .locals 0

    iput p1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addConfigCommand$1$1;->$originBackgroundColor:I

    iput p2, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addConfigCommand$1$1;->$lastBackgroundColor:I

    iput-object p3, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addConfigCommand$1$1;->$originBackgroundLineConfig:Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    iput-object p4, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addConfigCommand$1$1;->$lastBackgroundLineConfig:Lcom/zykj/blackboard/bean/BackgroundLineConfig;

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
    invoke-static {}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$Config;->newBuilder()Lcom/zykj/board/k;

    move-result-object v0

    .line 3
    iget v1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addConfigCommand$1$1;->$originBackgroundColor:I

    .line 4
    iput v1, v0, Lcom/zykj/board/k;->b:I

    .line 5
    iget v1, v0, Lcom/zykj/board/k;->a:I

    or-int/lit8 v1, v1, 0x1

    iput v1, v0, Lcom/zykj/board/k;->a:I

    .line 6
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 7
    iget v1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addConfigCommand$1$1;->$lastBackgroundColor:I

    .line 8
    iput v1, v0, Lcom/zykj/board/k;->c:I

    .line 9
    iget v1, v0, Lcom/zykj/board/k;->a:I

    or-int/lit8 v1, v1, 0x2

    iput v1, v0, Lcom/zykj/board/k;->a:I

    .line 10
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 11
    iget-object v1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addConfigCommand$1$1;->$originBackgroundLineConfig:Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    invoke-static {v1}, Lcom/zykj/blackboard/utils/ConvertExtKt;->toEzyConfig(Lcom/zykj/blackboard/bean/BackgroundLineConfig;)Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    move-result-object v1

    .line 12
    iget-object v2, v0, Lcom/zykj/board/k;->e:Lcom/google/protobuf/SingleFieldBuilderV3;

    if-nez v2, :cond_0

    .line 13
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    iput-object v1, v0, Lcom/zykj/board/k;->d:Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    goto :goto_0

    .line 15
    :cond_0
    invoke-virtual {v2, v1}, Lcom/google/protobuf/SingleFieldBuilderV3;->setMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 16
    :goto_0
    iget v1, v0, Lcom/zykj/board/k;->a:I

    or-int/lit8 v1, v1, 0x4

    iput v1, v0, Lcom/zykj/board/k;->a:I

    .line 17
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 18
    iget-object v1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addConfigCommand$1$1;->$lastBackgroundLineConfig:Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    invoke-static {v1}, Lcom/zykj/blackboard/utils/ConvertExtKt;->toEzyConfig(Lcom/zykj/blackboard/bean/BackgroundLineConfig;)Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    move-result-object v1

    .line 19
    iget-object v2, v0, Lcom/zykj/board/k;->g:Lcom/google/protobuf/SingleFieldBuilderV3;

    if-nez v2, :cond_1

    .line 20
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    iput-object v1, v0, Lcom/zykj/board/k;->f:Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    goto :goto_1

    .line 22
    :cond_1
    invoke-virtual {v2, v1}, Lcom/google/protobuf/SingleFieldBuilderV3;->setMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 23
    :goto_1
    iget v1, v0, Lcom/zykj/board/k;->a:I

    or-int/lit8 v1, v1, 0x8

    iput v1, v0, Lcom/zykj/board/k;->a:I

    .line 24
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 25
    invoke-virtual {v0}, Lcom/zykj/board/k;->c()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$Config;

    move-result-object v0

    .line 26
    invoke-virtual {v0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$Config;->isInitialized()Z

    move-result v1

    if-eqz v1, :cond_2

    return-object v0

    .line 27
    :cond_2
    invoke-static {v0}, Lcom/google/protobuf/AbstractMessage$Builder;->newUninitializedMessageException(Lcom/google/protobuf/Message;)Lcom/google/protobuf/UninitializedMessageException;

    move-result-object v0

    throw v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addConfigCommand$1$1;->invoke()Lcom/google/protobuf/Message;

    move-result-object v0

    return-object v0
.end method
