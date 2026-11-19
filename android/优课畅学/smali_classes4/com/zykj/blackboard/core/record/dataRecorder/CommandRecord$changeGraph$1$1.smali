.class final Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$changeGraph$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lx7/a;


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
        "Lx7/a;"
    }
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
    .locals 3

    .line 2
    invoke-static {}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->D()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange$b;

    move-result-object v0

    .line 3
    iget-object v1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$changeGraph$1$1;->$graphId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange$b;->K(Ljava/lang/String;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange$b;

    .line 4
    iget-object v1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$changeGraph$1$1;->$graphEnum:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    invoke-virtual {v0, v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange$b;->I(Lcom/zykj/board/EzyGraphEnum$GraphEnum;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange$b;

    .line 5
    iget-object v1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$changeGraph$1$1;->$originRectF:Lcom/zykj/board/EzyRectF$RectF;

    if-eqz v1, :cond_0

    .line 6
    invoke-virtual {v0, v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange$b;->L(Lcom/zykj/board/EzyRectF$RectF;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange$b;

    .line 7
    :cond_0
    iget-object v1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$changeGraph$1$1;->$content:Ljava/lang/String;

    if-eqz v1, :cond_1

    .line 8
    invoke-virtual {v0, v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange$b;->F(Ljava/lang/String;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange$b;

    .line 9
    :cond_1
    iget-object v1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$changeGraph$1$1;->$paint:Lcom/zykj/board/EzyPaint$Paint;

    if-eqz v1, :cond_2

    .line 10
    invoke-virtual {v0, v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange$b;->M(Lcom/zykj/board/EzyPaint$Paint;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange$b;

    .line 11
    :cond_2
    iget-object v1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$changeGraph$1$1;->$points:Ljava/util/List;

    if-eqz v1, :cond_3

    .line 12
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/zykj/board/EzyPointF$PointF;

    .line 13
    invoke-virtual {v0, v2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange$b;->c(Lcom/zykj/board/EzyPointF$PointF;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange$b;

    goto :goto_0

    .line 14
    :cond_3
    iget-object v1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$changeGraph$1$1;->$renderMatrix:Lcom/zykj/board/EzyMatrix$Matrix;

    if-eqz v1, :cond_4

    .line 15
    invoke-virtual {v0, v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange$b;->N(Lcom/zykj/board/EzyMatrix$Matrix;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange$b;

    .line 16
    :cond_4
    iget-object v1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$changeGraph$1$1;->$filePath:Ljava/lang/String;

    if-eqz v1, :cond_5

    .line 17
    invoke-virtual {v0, v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange$b;->H(Ljava/lang/String;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange$b;

    .line 18
    :cond_5
    invoke-virtual {v0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange$b;->f()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;

    move-result-object v0

    const-string v1, "builder.build()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$changeGraph$1$1;->invoke()Lcom/google/protobuf/Message;

    move-result-object v0

    return-object v0
.end method
