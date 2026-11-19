.class public abstract Lcom/zykj/blackboard/core/record/DataRecorder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/blackboard/core/record/DataRecorder$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008&\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0011\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J3\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J3\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u001d\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001b"
    }
    d2 = {
        "Lcom/zykj/blackboard/core/record/DataRecorder;",
        "",
        "Lcom/zykj/blackboard/core/record/TimeRecord;",
        "timeRecord",
        "<init>",
        "(Lcom/zykj/blackboard/core/record/TimeRecord;)V",
        "",
        "delayTime",
        "duration",
        "Lcom/zykj/board/EzyCommandEnum$CommandEnum;",
        "commandEnum",
        "Lkotlin/Function0;",
        "Lcom/google/protobuf/Message;",
        "buildCallBack",
        "Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;",
        "buildCommandInfoEntity",
        "(JJLcom/zykj/board/EzyCommandEnum$CommandEnum;Lr6/a;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;",
        "Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;",
        "buildAudioInfoEntity",
        "(JJLcom/zykj/board/EzyCommandEnum$CommandEnum;Lr6/a;)Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;",
        "currentTime",
        "getStartEventTime",
        "(JJ)J",
        "Lcom/zykj/blackboard/core/record/TimeRecord;",
        "getTimeRecord",
        "()Lcom/zykj/blackboard/core/record/TimeRecord;",
        "Companion",
        "blackboard_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lcom/zykj/blackboard/core/record/DataRecorder$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final MAX_LENGTH:I = 0x64


# instance fields
.field private final timeRecord:Lcom/zykj/blackboard/core/record/TimeRecord;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/blackboard/core/record/DataRecorder$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/blackboard/core/record/DataRecorder$Companion;-><init>(Lkotlin/jvm/internal/e;)V

    sput-object v0, Lcom/zykj/blackboard/core/record/DataRecorder;->Companion:Lcom/zykj/blackboard/core/record/DataRecorder$Companion;

    return-void
.end method

.method public constructor <init>(Lcom/zykj/blackboard/core/record/TimeRecord;)V
    .locals 0
    .param p1    # Lcom/zykj/blackboard/core/record/TimeRecord;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/zykj/blackboard/core/record/DataRecorder;->timeRecord:Lcom/zykj/blackboard/core/record/TimeRecord;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final buildAudioInfoEntity(JJLcom/zykj/board/EzyCommandEnum$CommandEnum;Lr6/a;)Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;
    .locals 11
    .param p5    # Lcom/zykj/board/EzyCommandEnum$CommandEnum;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Lr6/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJ",
            "Lcom/zykj/board/EzyCommandEnum$CommandEnum;",
            "Lr6/a;",
            ")",
            "Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const-string v0, "commandEnum"

    .line 2
    .line 3
    move-object/from16 v9, p5

    .line 4
    .line 5
    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string v0, "buildCallBack"

    .line 9
    .line 10
    move-object/from16 v1, p6

    .line 11
    .line 12
    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    new-instance v1, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;

    .line 16
    .line 17
    iget-object v0, p0, Lcom/zykj/blackboard/core/record/DataRecorder;->timeRecord:Lcom/zykj/blackboard/core/record/TimeRecord;

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/record/TimeRecord;->isRecord()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    const/4 v3, 0x1

    .line 27
    if-ne v0, v3, :cond_0

    .line 28
    .line 29
    move v8, v3

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move v8, v2

    .line 32
    :goto_0
    invoke-interface/range {p6 .. p6}, Lr6/a;->invoke()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    check-cast v0, Lcom/google/protobuf/Message;

    .line 37
    .line 38
    invoke-interface {v0}, Lcom/google/protobuf/MessageLite;->toByteArray()[B

    .line 39
    .line 40
    .line 41
    move-result-object v10

    .line 42
    const-string v0, "buildCallBack().toByteArray()"

    .line 43
    .line 44
    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    const-wide/16 v2, 0x0

    .line 48
    .line 49
    move-wide v4, p1

    .line 50
    move-wide v6, p3

    .line 51
    invoke-direct/range {v1 .. v10}, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;-><init>(JJJZLcom/zykj/board/EzyCommandEnum$CommandEnum;[B)V

    .line 52
    .line 53
    .line 54
    return-object v1
.end method

.method public final buildCommandInfoEntity(JJLcom/zykj/board/EzyCommandEnum$CommandEnum;Lr6/a;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
    .locals 11
    .param p5    # Lcom/zykj/board/EzyCommandEnum$CommandEnum;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Lr6/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJ",
            "Lcom/zykj/board/EzyCommandEnum$CommandEnum;",
            "Lr6/a;",
            ")",
            "Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const-string v0, "commandEnum"

    .line 2
    .line 3
    move-object/from16 v9, p5

    .line 4
    .line 5
    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string v0, "buildCallBack"

    .line 9
    .line 10
    move-object/from16 v1, p6

    .line 11
    .line 12
    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    new-instance v1, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 16
    .line 17
    iget-object v0, p0, Lcom/zykj/blackboard/core/record/DataRecorder;->timeRecord:Lcom/zykj/blackboard/core/record/TimeRecord;

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/record/TimeRecord;->isRecord()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    const/4 v3, 0x1

    .line 27
    if-ne v0, v3, :cond_0

    .line 28
    .line 29
    move v8, v3

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move v8, v2

    .line 32
    :goto_0
    invoke-interface/range {p6 .. p6}, Lr6/a;->invoke()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    check-cast v0, Lcom/google/protobuf/Message;

    .line 37
    .line 38
    invoke-interface {v0}, Lcom/google/protobuf/MessageLite;->toByteArray()[B

    .line 39
    .line 40
    .line 41
    move-result-object v10

    .line 42
    const-string v0, "buildCallBack().toByteArray()"

    .line 43
    .line 44
    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    const-wide/16 v2, 0x0

    .line 48
    .line 49
    move-wide v4, p1

    .line 50
    move-wide v6, p3

    .line 51
    invoke-direct/range {v1 .. v10}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;-><init>(JJJZLcom/zykj/board/EzyCommandEnum$CommandEnum;[B)V

    .line 52
    .line 53
    .line 54
    return-object v1
.end method

.method public final getStartEventTime(JJ)J
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/record/DataRecorder;->timeRecord:Lcom/zykj/blackboard/core/record/TimeRecord;

    .line 2
    .line 3
    const-wide/16 v6, 0x0

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v4, 0x2

    .line 8
    const/4 v5, 0x0

    .line 9
    const/4 v3, 0x0

    .line 10
    move-wide v1, p3

    .line 11
    invoke-static/range {v0 .. v5}, Lcom/zykj/blackboard/core/record/ITimeRecord$DefaultImpls;->getDelayTime$default(Lcom/zykj/blackboard/core/record/ITimeRecord;JZILjava/lang/Object;)J

    .line 12
    .line 13
    .line 14
    move-result-wide p3

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move-wide p3, v6

    .line 17
    :goto_0
    sub-long/2addr p3, p1

    .line 18
    cmp-long p1, p3, v6

    .line 19
    .line 20
    if-gez p1, :cond_1

    .line 21
    .line 22
    return-wide v6

    .line 23
    :cond_1
    return-wide p3
.end method

.method public final getTimeRecord()Lcom/zykj/blackboard/core/record/TimeRecord;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/record/DataRecorder;->timeRecord:Lcom/zykj/blackboard/core/record/TimeRecord;

    .line 2
    .line 3
    return-object v0
.end method
