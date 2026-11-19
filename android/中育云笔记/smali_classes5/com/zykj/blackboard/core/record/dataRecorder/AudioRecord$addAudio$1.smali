.class final Lcom/zykj/blackboard/core/record/dataRecorder/AudioRecord$addAudio$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lhd/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/blackboard/core/record/dataRecorder/AudioRecord;->e(Ljava/lang/String;JJ)Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;
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
.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:J


# direct methods
.method public constructor <init>(Ljava/lang/String;J)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/AudioRecord$addAudio$1;->c:Ljava/lang/String;

    iput-wide p2, p0, Lcom/zykj/blackboard/core/record/dataRecorder/AudioRecord$addAudio$1;->d:J

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/protobuf/Message;
    .locals 3

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;->o()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/AudioRecord$addAudio$1;->c:Ljava/lang/String;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;->r(Ljava/lang/String;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;

    .line 8
    .line 9
    .line 10
    iget-wide v1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/AudioRecord$addAudio$1;->d:J

    .line 11
    .line 12
    invoke-virtual {v0, v1, v2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;->p(J)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;->d()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const-string v1, "builder.build()"

    .line 20
    .line 21
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/record/dataRecorder/AudioRecord$addAudio$1;->a()Lcom/google/protobuf/Message;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
