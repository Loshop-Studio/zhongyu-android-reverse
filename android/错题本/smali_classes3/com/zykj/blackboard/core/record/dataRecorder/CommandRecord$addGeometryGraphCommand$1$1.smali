.class final Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addGeometryGraphCommand$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lr6/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->addGeometryGraphCommand$lambda-9(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JFFLjava/lang/String;ILjava/util/List;Lcom/zykj/board/EzyPaint$Paint;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
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
.field final synthetic $geometryType:I

.field final synthetic $height:F

.field final synthetic $paint:Lcom/zykj/board/EzyPaint$Paint;

.field final synthetic $parentGraphId:Ljava/lang/String;

.field final synthetic $pointList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/graphics/PointF;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $width:F

.field final synthetic this$0:Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;


# direct methods
.method public constructor <init>(FFLjava/lang/String;Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;ILjava/util/List;Lcom/zykj/board/EzyPaint$Paint;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(FF",
            "Ljava/lang/String;",
            "Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;",
            "I",
            "Ljava/util/List<",
            "+",
            "Landroid/graphics/PointF;",
            ">;",
            "Lcom/zykj/board/EzyPaint$Paint;",
            ")V"
        }
    .end annotation

    iput p1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addGeometryGraphCommand$1$1;->$width:F

    iput p2, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addGeometryGraphCommand$1$1;->$height:F

    iput-object p3, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addGeometryGraphCommand$1$1;->$parentGraphId:Ljava/lang/String;

    iput-object p4, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addGeometryGraphCommand$1$1;->this$0:Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    iput p5, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addGeometryGraphCommand$1$1;->$geometryType:I

    iput-object p6, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addGeometryGraphCommand$1$1;->$pointList:Ljava/util/List;

    iput-object p7, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addGeometryGraphCommand$1$1;->$paint:Lcom/zykj/board/EzyPaint$Paint;

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
    sget-object v1, Lcom/zykj/board/EzyGraphEnum$GraphEnum;->GEOMETRY_GRAPH:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    invoke-virtual {v0, v1}, Lcom/zykj/board/q;->j(Lcom/zykj/board/EzyGraphEnum$GraphEnum;)V

    .line 5
    invoke-static {}, Lcom/zykj/board/EzyRectF$RectF;->newBuilder()Lb4/b1;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lb4/b1;->j(F)V

    invoke-virtual {v1, v2}, Lb4/b1;->l(F)V

    iget v2, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addGeometryGraphCommand$1$1;->$width:F

    invoke-virtual {v1, v2}, Lb4/b1;->k(F)V

    iget v2, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addGeometryGraphCommand$1$1;->$height:F

    invoke-virtual {v1, v2}, Lb4/b1;->i(F)V

    .line 6
    invoke-virtual {v1}, Lb4/b1;->c()Lcom/zykj/board/EzyRectF$RectF;

    move-result-object v1

    .line 7
    invoke-virtual {v0, v1}, Lcom/zykj/board/q;->l(Lcom/zykj/board/EzyRectF$RectF;)V

    .line 8
    iget-object v1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addGeometryGraphCommand$1$1;->$parentGraphId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/zykj/board/q;->m(Ljava/lang/String;)V

    .line 9
    iget-object v1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addGeometryGraphCommand$1$1;->this$0:Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    invoke-static {v1}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->access$getGeometrySourceRecord$p(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;)Lcom/zykj/blackboard/core/record/dataRecorder/GeometrySourceRecord;

    move-result-object v1

    .line 10
    iget v2, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addGeometryGraphCommand$1$1;->$geometryType:I

    .line 11
    iget-object v3, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addGeometryGraphCommand$1$1;->$pointList:Ljava/util/List;

    .line 12
    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v3, v5}, Lkotlin/collections/u;->p(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 13
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    .line 14
    check-cast v5, Landroid/graphics/PointF;

    .line 15
    invoke-static {v5}, Lcom/zykj/blackboard/utils/GraphUtilsKt;->covertEzyPointF(Landroid/graphics/PointF;)Lcom/zykj/board/EzyPointF$PointF;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 16
    :cond_0
    iget-object v3, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addGeometryGraphCommand$1$1;->$paint:Lcom/zykj/board/EzyPaint$Paint;

    .line 17
    invoke-virtual {v1, v2, v4, v3}, Lcom/zykj/blackboard/core/record/dataRecorder/GeometrySourceRecord;->addGeometry(ILjava/util/List;Lcom/zykj/board/EzyPaint$Paint;)Lcom/zykj/blackboard/bean/CommonSourceResult;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 18
    invoke-virtual {v1}, Lcom/zykj/blackboard/bean/CommonSourceResult;->getSourceFileName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/zykj/board/q;->n(Ljava/lang/String;)V

    .line 19
    invoke-virtual {v1}, Lcom/zykj/blackboard/bean/CommonSourceResult;->getSourceId()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/zykj/board/q;->o(I)V

    .line 20
    :cond_1
    invoke-virtual {v0}, Lcom/zykj/board/q;->c()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addGeometryGraphCommand$1$1;->invoke()Lcom/google/protobuf/Message;

    move-result-object v0

    return-object v0
.end method
