.class final Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addCommand$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lr6/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->addCommand$lambda-1(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLcom/zykj/board/EzyGraphEnum$GraphEnum;Lcom/zykj/board/EzyRectF$RectF;Ljava/lang/String;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
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
.field final synthetic $graphType:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

.field final synthetic $parentGraphId:Ljava/lang/String;

.field final synthetic $rectF:Lcom/zykj/board/EzyRectF$RectF;


# direct methods
.method public constructor <init>(Lcom/zykj/board/EzyGraphEnum$GraphEnum;Lcom/zykj/board/EzyRectF$RectF;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addCommand$1$1;->$graphType:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    iput-object p2, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addCommand$1$1;->$rectF:Lcom/zykj/board/EzyRectF$RectF;

    iput-object p3, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addCommand$1$1;->$parentGraphId:Ljava/lang/String;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Lcom/google/protobuf/Message;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 2
    invoke-static {}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;->newBuilder()Lcom/zykj/board/q;

    move-result-object v0

    .line 3
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/zykj/board/q;->k(Ljava/lang/String;)V

    .line 4
    iget-object v1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addCommand$1$1;->$graphType:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    invoke-virtual {v0, v1}, Lcom/zykj/board/q;->j(Lcom/zykj/board/EzyGraphEnum$GraphEnum;)V

    .line 5
    iget-object v1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addCommand$1$1;->$rectF:Lcom/zykj/board/EzyRectF$RectF;

    invoke-virtual {v0, v1}, Lcom/zykj/board/q;->l(Lcom/zykj/board/EzyRectF$RectF;)V

    .line 6
    iget-object v1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addCommand$1$1;->$parentGraphId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/zykj/board/q;->m(Ljava/lang/String;)V

    .line 7
    invoke-virtual {v0}, Lcom/zykj/board/q;->c()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addCommand$1$1;->invoke()Lcom/google/protobuf/Message;

    move-result-object v0

    return-object v0
.end method
