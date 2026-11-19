.class final Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addCommand$3$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lhd/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->G(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLcom/zykj/board/EzyGraphEnum$GraphEnum;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
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
.field public final synthetic c:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

.field public final synthetic d:I

.field public final synthetic e:I

.field public final synthetic f:Ljava/lang/String;

.field public final synthetic g:Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Ljava/lang/String;

.field public final synthetic j:Z


# direct methods
.method public constructor <init>(Lcom/zykj/board/EzyGraphEnum$GraphEnum;IILjava/lang/String;Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addCommand$3$1;->c:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    iput p2, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addCommand$3$1;->d:I

    iput p3, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addCommand$3$1;->e:I

    iput-object p4, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addCommand$3$1;->f:Ljava/lang/String;

    iput-object p5, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addCommand$3$1;->g:Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    iput-object p6, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addCommand$3$1;->h:Ljava/lang/String;

    iput-object p7, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addCommand$3$1;->i:Ljava/lang/String;

    iput-boolean p8, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addCommand$3$1;->j:Z

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/protobuf/Message;
    .locals 6

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
    iget-object v1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addCommand$3$1;->c:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

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
    iget v2, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addCommand$3$1;->d:I

    .line 35
    .line 36
    int-to-float v2, v2

    .line 37
    invoke-virtual {v1, v2}, Lcom/zykj/board/EzyRectF$RectF$b;->t(F)Lcom/zykj/board/EzyRectF$RectF$b;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    iget v2, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addCommand$3$1;->e:I

    .line 42
    .line 43
    int-to-float v2, v2

    .line 44
    invoke-virtual {v1, v2}, Lcom/zykj/board/EzyRectF$RectF$b;->p(F)Lcom/zykj/board/EzyRectF$RectF$b;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-virtual {v1}, Lcom/zykj/board/EzyRectF$RectF$b;->d()Lcom/zykj/board/EzyRectF$RectF;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-virtual {v0, v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->y(Lcom/zykj/board/EzyRectF$RectF;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;

    .line 53
    .line 54
    .line 55
    iget-object v1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addCommand$3$1;->f:Ljava/lang/String;

    .line 56
    .line 57
    invoke-virtual {v0, v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->z(Ljava/lang/String;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;

    .line 58
    .line 59
    .line 60
    iget-object v1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addCommand$3$1;->g:Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    .line 61
    .line 62
    invoke-static {v1}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->s(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;)Lja/o;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    iget-object v2, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addCommand$3$1;->h:Ljava/lang/String;

    .line 67
    .line 68
    iget-object v3, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addCommand$3$1;->i:Ljava/lang/String;

    .line 69
    .line 70
    iget v4, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addCommand$3$1;->d:I

    .line 71
    .line 72
    iget v5, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addCommand$3$1;->e:I

    .line 73
    .line 74
    invoke-virtual {v1, v2, v3, v4, v5}, Lja/o;->e(Ljava/lang/String;Ljava/lang/String;II)Lq9/c;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    if-eqz v1, :cond_0

    .line 79
    .line 80
    invoke-virtual {v1}, Lq9/c;->a()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    invoke-virtual {v0, v2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->B(Ljava/lang/String;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1}, Lq9/c;->b()I

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    invoke-virtual {v0, v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->C(I)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;

    .line 92
    .line 93
    .line 94
    :cond_0
    iget-boolean v1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addCommand$3$1;->j:Z

    .line 95
    .line 96
    if-eqz v1, :cond_1

    .line 97
    .line 98
    new-instance v1, Ljava/lang/StringBuilder;

    .line 99
    .line 100
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->l()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    const-string v2, "imageBackground;"

    .line 111
    .line 112
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    invoke-virtual {v0, v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->t(Ljava/lang/String;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;

    .line 120
    .line 121
    .line 122
    :cond_1
    invoke-virtual {v0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->d()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    const-string v1, "builder.build()"

    .line 127
    .line 128
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addCommand$3$1;->a()Lcom/google/protobuf/Message;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
