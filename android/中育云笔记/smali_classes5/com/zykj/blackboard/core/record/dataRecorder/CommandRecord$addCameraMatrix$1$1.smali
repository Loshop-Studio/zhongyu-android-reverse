.class final Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addCameraMatrix$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lhd/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->A(Ljava/util/List;Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLcom/zykj/board/EzyMatrix$Matrix;Lcom/zykj/board/EzyMatrix$Matrix;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
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
.field public final synthetic c:Lcom/zykj/board/EzyMatrix$Matrix;

.field public final synthetic d:Lcom/zykj/board/EzyMatrix$Matrix;

.field public final synthetic e:Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

.field public final synthetic f:Ljava/util/List;


# direct methods
.method public constructor <init>(Lcom/zykj/board/EzyMatrix$Matrix;Lcom/zykj/board/EzyMatrix$Matrix;Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;Ljava/util/List;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addCameraMatrix$1$1;->c:Lcom/zykj/board/EzyMatrix$Matrix;

    iput-object p2, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addCameraMatrix$1$1;->d:Lcom/zykj/board/EzyMatrix$Matrix;

    iput-object p3, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addCameraMatrix$1$1;->e:Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    iput-object p4, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addCameraMatrix$1$1;->f:Ljava/util/List;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/protobuf/Message;
    .locals 3

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix;->v()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addCameraMatrix$1$1;->c:Lcom/zykj/board/EzyMatrix$Matrix;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->y(Lcom/zykj/board/EzyMatrix$Matrix;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addCameraMatrix$1$1;->d:Lcom/zykj/board/EzyMatrix$Matrix;

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->z(Lcom/zykj/board/EzyMatrix$Matrix;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;

    .line 13
    .line 14
    .line 15
    iget-object v1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addCameraMatrix$1$1;->e:Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    .line 16
    .line 17
    invoke-static {v1}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->u(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;)Lja/q;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    iget-object v2, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addCameraMatrix$1$1;->f:Ljava/util/List;

    .line 22
    .line 23
    invoke-virtual {v1, v2}, Lja/q;->e(Ljava/util/List;)Lq9/c;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    if-eqz v1, :cond_0

    .line 28
    .line 29
    invoke-virtual {v1}, Lq9/c;->a()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-virtual {v0, v2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->B(Ljava/lang/String;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1}, Lq9/c;->b()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    invoke-virtual {v0, v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->C(I)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;

    .line 41
    .line 42
    .line 43
    :cond_0
    invoke-virtual {v0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->d()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    const-string v1, "builder.build()"

    .line 48
    .line 49
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addCameraMatrix$1$1;->a()Lcom/google/protobuf/Message;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
