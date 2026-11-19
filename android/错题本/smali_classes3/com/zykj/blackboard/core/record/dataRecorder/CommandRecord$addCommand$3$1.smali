# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class final Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addCommand$3$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lr6/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->addCommand$lambda-5(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLcom/zykj/board/EzyGraphEnum$GraphEnum;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
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
.field final synthetic $fileName:Ljava/lang/String;

.field final synthetic $graphType:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

.field final synthetic $height:I

.field final synthetic $imageBackground:Z

.field final synthetic $parentGraphId:Ljava/lang/String;

.field final synthetic $validate:Ljava/lang/String;

.field final synthetic $width:I

.field final synthetic this$0:Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;


# direct methods
.method public constructor <init>(Lcom/zykj/board/EzyGraphEnum$GraphEnum;IILjava/lang/String;Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addCommand$3$1;->$graphType:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    iput p2, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addCommand$3$1;->$width:I

    iput p3, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addCommand$3$1;->$height:I

    iput-object p4, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addCommand$3$1;->$parentGraphId:Ljava/lang/String;

    iput-object p5, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addCommand$3$1;->this$0:Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    iput-object p6, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addCommand$3$1;->$fileName:Ljava/lang/String;

    iput-object p7, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addCommand$3$1;->$validate:Ljava/lang/String;

    iput-boolean p8, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addCommand$3$1;->$imageBackground:Z

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Lcom/google/protobuf/Message;
    .locals 6
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
    iget-object v1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addCommand$3$1;->$graphType:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    invoke-virtual {v0, v1}, Lcom/zykj/board/q;->j(Lcom/zykj/board/EzyGraphEnum$GraphEnum;)V

    .line 5
    invoke-static {}, Lcom/zykj/board/EzyRectF$RectF;->newBuilder()Lb4/b1;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lb4/b1;->j(F)V

    invoke-virtual {v1, v2}, Lb4/b1;->l(F)V

    iget v2, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addCommand$3$1;->$width:I

    int-to-float v2, v2

    invoke-virtual {v1, v2}, Lb4/b1;->k(F)V

    .line 6
    iget v2, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addCommand$3$1;->$height:I

    int-to-float v2, v2

    invoke-virtual {v1, v2}, Lb4/b1;->i(F)V

    invoke-virtual {v1}, Lb4/b1;->c()Lcom/zykj/board/EzyRectF$RectF;

    move-result-object v1

    .line 7
    invoke-virtual {v0, v1}, Lcom/zykj/board/q;->l(Lcom/zykj/board/EzyRectF$RectF;)V

    .line 8
    iget-object v1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addCommand$3$1;->$parentGraphId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/zykj/board/q;->m(Ljava/lang/String;)V

    .line 9
    iget-object v1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addCommand$3$1;->this$0:Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    invoke-static {v1}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->access$getFileSourceRecord$p(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;)Lcom/zykj/blackboard/core/record/dataRecorder/FileSourceRecord;

    move-result-object v1

    .line 10
    iget-object v2, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addCommand$3$1;->$fileName:Ljava/lang/String;

    .line 11
    iget-object v3, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addCommand$3$1;->$validate:Ljava/lang/String;

    .line 12
    iget v4, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addCommand$3$1;->$width:I

    .line 13
    iget v5, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addCommand$3$1;->$height:I

    .line 14
    invoke-virtual {v1, v2, v3, v4, v5}, Lcom/zykj/blackboard/core/record/dataRecorder/FileSourceRecord;->addFile(Ljava/lang/String;Ljava/lang/String;II)Lcom/zykj/blackboard/bean/CommonSourceResult;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 15
    invoke-virtual {v1}, Lcom/zykj/blackboard/bean/CommonSourceResult;->getSourceFileName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/zykj/board/q;->n(Ljava/lang/String;)V

    .line 16
    invoke-virtual {v1}, Lcom/zykj/blackboard/bean/CommonSourceResult;->getSourceId()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/zykj/board/q;->o(I)V

    .line 17
    :cond_0
    iget-boolean v1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addCommand$3$1;->$imageBackground:Z

    if-eqz v1, :cond_2

    .line 18
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    iget-object v2, v0, Lcom/zykj/board/q;->i:Ljava/lang/Object;

    .line 20
    instance-of v3, v2, Ljava/lang/String;

    if-nez v3, :cond_1

    .line 21
    check-cast v2, Lcom/google/protobuf/ByteString;

    .line 22
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    move-result-object v2

    .line 23
    iput-object v2, v0, Lcom/zykj/board/q;->i:Ljava/lang/Object;

    goto :goto_0

    .line 24
    :cond_1
    check-cast v2, Ljava/lang/String;

    .line 25
    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "imageBackground;"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 26
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    iput-object v1, v0, Lcom/zykj/board/q;->i:Ljava/lang/Object;

    .line 28
    iget v1, v0, Lcom/zykj/board/q;->a:I

    or-int/lit8 v1, v1, 0x40

    iput v1, v0, Lcom/zykj/board/q;->a:I

    .line 29
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 30
    :cond_2
    invoke-virtual {v0}, Lcom/zykj/board/q;->c()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addCommand$3$1;->invoke()Lcom/google/protobuf/Message;

    move-result-object v0

    return-object v0
.end method
