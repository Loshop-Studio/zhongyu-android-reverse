# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class final Lcom/zykj/blackboard/core/record/dataRecorder/AudioRecord$addAudio$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lr6/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/blackboard/core/record/dataRecorder/AudioRecord;->addAudio(Ljava/lang/String;JJ)Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;
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
.field final synthetic $duration:J

.field final synthetic $fileName:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;J)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/AudioRecord$addAudio$1;->$fileName:Ljava/lang/String;

    iput-wide p2, p0, Lcom/zykj/blackboard/core/record/dataRecorder/AudioRecord$addAudio$1;->$duration:J

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
    invoke-static {}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;->newBuilder()Lcom/zykj/board/d;

    move-result-object v0

    .line 3
    iget-object v1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/AudioRecord$addAudio$1;->$fileName:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    iput-object v1, v0, Lcom/zykj/board/d;->b:Ljava/lang/Object;

    .line 6
    iget v1, v0, Lcom/zykj/board/d;->a:I

    or-int/lit8 v1, v1, 0x1

    iput v1, v0, Lcom/zykj/board/d;->a:I

    .line 7
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 8
    iget-wide v1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/AudioRecord$addAudio$1;->$duration:J

    invoke-virtual {v0, v1, v2}, Lcom/zykj/board/d;->i(J)V

    .line 9
    invoke-virtual {v0}, Lcom/zykj/board/d;->c()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/record/dataRecorder/AudioRecord$addAudio$1;->invoke()Lcom/google/protobuf/Message;

    move-result-object v0

    return-object v0
.end method
