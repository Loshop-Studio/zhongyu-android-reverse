.class final Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addTextGraphCommand$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lhd/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->O(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JFFLjava/lang/String;Ljava/lang/String;Lcom/zykj/board/EzyPaint$Paint;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lhd/a;"
    }
.end annotation


# instance fields
.field public final synthetic c:F

.field public final synthetic d:F

.field public final synthetic e:Ljava/lang/String;

.field public final synthetic f:Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

.field public final synthetic g:Ljava/lang/String;

.field public final synthetic h:Lcom/zykj/board/EzyPaint$Paint;


# direct methods
.method public constructor <init>(FFLjava/lang/String;Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;Ljava/lang/String;Lcom/zykj/board/EzyPaint$Paint;)V
    .locals 0

    iput p1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addTextGraphCommand$1$1;->c:F

    iput p2, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addTextGraphCommand$1$1;->d:F

    iput-object p3, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addTextGraphCommand$1$1;->e:Ljava/lang/String;

    iput-object p4, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addTextGraphCommand$1$1;->f:Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    iput-object p5, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addTextGraphCommand$1$1;->g:Ljava/lang/String;

    iput-object p6, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addTextGraphCommand$1$1;->h:Lcom/zykj/board/EzyPaint$Paint;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/protobuf/Message;
    .locals 4

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;->I()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v0, v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->x(Ljava/lang/String;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;

    .line 14
    .line 15
    .line 16
    sget-object v1, Lcom/zykj/board/EzyGraphEnum$GraphEnum;->i:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->v(Lcom/zykj/board/EzyGraphEnum$GraphEnum;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;

    .line 19
    .line 20
    .line 21
    invoke-static {}, Lcom/zykj/board/EzyRectF$RectF;->k()Lcom/zykj/board/EzyRectF$RectF$b;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    const/4 v2, 0x0

    .line 26
    invoke-virtual {v1, v2}, Lcom/zykj/board/EzyRectF$RectF$b;->r(F)Lcom/zykj/board/EzyRectF$RectF$b;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {v1, v2}, Lcom/zykj/board/EzyRectF$RectF$b;->u(F)Lcom/zykj/board/EzyRectF$RectF$b;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    iget v2, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addTextGraphCommand$1$1;->c:F

    .line 35
    .line 36
    invoke-virtual {v1, v2}, Lcom/zykj/board/EzyRectF$RectF$b;->t(F)Lcom/zykj/board/EzyRectF$RectF$b;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    iget v2, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addTextGraphCommand$1$1;->d:F

    .line 41
    .line 42
    invoke-virtual {v1, v2}, Lcom/zykj/board/EzyRectF$RectF$b;->p(F)Lcom/zykj/board/EzyRectF$RectF$b;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-virtual {v1}, Lcom/zykj/board/EzyRectF$RectF$b;->d()Lcom/zykj/board/EzyRectF$RectF;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-virtual {v0, v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->y(Lcom/zykj/board/EzyRectF$RectF;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;

    .line 51
    .line 52
    .line 53
    iget-object v1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addTextGraphCommand$1$1;->e:Ljava/lang/String;

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->z(Ljava/lang/String;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;

    .line 56
    .line 57
    .line 58
    iget-object v1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addTextGraphCommand$1$1;->f:Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    .line 59
    .line 60
    invoke-static {v1}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->v(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;)Lja/r;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    iget-object v2, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addTextGraphCommand$1$1;->g:Ljava/lang/String;

    .line 65
    .line 66
    iget-object v3, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addTextGraphCommand$1$1;->h:Lcom/zykj/board/EzyPaint$Paint;

    .line 67
    .line 68
    invoke-virtual {v1, v2, v3}, Lja/r;->e(Ljava/lang/String;Lcom/zykj/board/EzyPaint$Paint;)Lq9/c;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    if-eqz v1, :cond_0

    .line 73
    .line 74
    invoke-virtual {v1}, Lq9/c;->a()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    invoke-virtual {v0, v2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->B(Ljava/lang/String;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v1}, Lq9/c;->b()I

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    invoke-virtual {v0, v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->C(I)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;

    .line 86
    .line 87
    .line 88
    :cond_0
    invoke-virtual {v0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->d()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    const-string v1, "builder.build()"

    .line 93
    .line 94
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addTextGraphCommand$1$1;->a()Lcom/google/protobuf/Message;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
