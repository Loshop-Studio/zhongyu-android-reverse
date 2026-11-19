.class final Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$changeGraph$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->R(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLjava/lang/String;Lcom/zykj/board/EzyGraphEnum$GraphEnum;Lcom/zykj/board/EzyRectF$RectF;Ljava/lang/String;Lcom/zykj/board/EzyPaint$Paint;Ljava/util/List;Lcom/zykj/board/EzyMatrix$Matrix;Ljava/lang/String;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lcom/google/protobuf/Message;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "Lcom/google/protobuf/Message;",
        "a",
        "()Lcom/google/protobuf/Message;"
    }
    k = 0x3
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

.field public final synthetic c:Lcom/zykj/board/EzyRectF$RectF;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Lcom/zykj/board/EzyPaint$Paint;

.field public final synthetic f:Ljava/util/List;

.field public final synthetic g:Lcom/zykj/board/EzyMatrix$Matrix;

.field public final synthetic h:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/zykj/board/EzyGraphEnum$GraphEnum;Lcom/zykj/board/EzyRectF$RectF;Ljava/lang/String;Lcom/zykj/board/EzyPaint$Paint;Ljava/util/List;Lcom/zykj/board/EzyMatrix$Matrix;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$changeGraph$1$1;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$changeGraph$1$1;->b:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    iput-object p3, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$changeGraph$1$1;->c:Lcom/zykj/board/EzyRectF$RectF;

    iput-object p4, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$changeGraph$1$1;->d:Ljava/lang/String;

    iput-object p5, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$changeGraph$1$1;->e:Lcom/zykj/board/EzyPaint$Paint;

    iput-object p6, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$changeGraph$1$1;->f:Ljava/util/List;

    iput-object p7, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$changeGraph$1$1;->g:Lcom/zykj/board/EzyMatrix$Matrix;

    iput-object p8, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$changeGraph$1$1;->h:Ljava/lang/String;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/protobuf/Message;
    .locals 3

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->N()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$changeGraph$1$1;->a:Ljava/lang/String;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange$b;->I(Ljava/lang/String;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange$b;

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$changeGraph$1$1;->b:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange$b;->G(Lcom/zykj/board/EzyGraphEnum$GraphEnum;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange$b;

    .line 13
    .line 14
    .line 15
    iget-object v1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$changeGraph$1$1;->c:Lcom/zykj/board/EzyRectF$RectF;

    .line 16
    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange$b;->J(Lcom/zykj/board/EzyRectF$RectF;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange$b;

    .line 20
    .line 21
    .line 22
    :cond_0
    iget-object v1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$changeGraph$1$1;->d:Ljava/lang/String;

    .line 23
    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange$b;->D(Ljava/lang/String;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange$b;

    .line 27
    .line 28
    .line 29
    :cond_1
    iget-object v1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$changeGraph$1$1;->e:Lcom/zykj/board/EzyPaint$Paint;

    .line 30
    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange$b;->K(Lcom/zykj/board/EzyPaint$Paint;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange$b;

    .line 34
    .line 35
    .line 36
    :cond_2
    iget-object v1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$changeGraph$1$1;->f:Ljava/util/List;

    .line 37
    .line 38
    if-eqz v1, :cond_3

    .line 39
    .line 40
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-eqz v2, :cond_3

    .line 49
    .line 50
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    check-cast v2, Lcom/zykj/board/EzyPointF$PointF;

    .line 55
    .line 56
    invoke-virtual {v0, v2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange$b;->b(Lcom/zykj/board/EzyPointF$PointF;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange$b;

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_3
    iget-object v1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$changeGraph$1$1;->g:Lcom/zykj/board/EzyMatrix$Matrix;

    .line 61
    .line 62
    if-eqz v1, :cond_4

    .line 63
    .line 64
    invoke-virtual {v0, v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange$b;->L(Lcom/zykj/board/EzyMatrix$Matrix;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange$b;

    .line 65
    .line 66
    .line 67
    :cond_4
    iget-object v1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$changeGraph$1$1;->h:Ljava/lang/String;

    .line 68
    .line 69
    if-eqz v1, :cond_5

    .line 70
    .line 71
    invoke-virtual {v0, v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange$b;->F(Ljava/lang/String;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange$b;

    .line 72
    .line 73
    .line 74
    :cond_5
    invoke-virtual {v0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange$b;->e()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    const-string v1, "builder.build()"

    .line 79
    .line 80
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$changeGraph$1$1;->a()Lcom/google/protobuf/Message;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
