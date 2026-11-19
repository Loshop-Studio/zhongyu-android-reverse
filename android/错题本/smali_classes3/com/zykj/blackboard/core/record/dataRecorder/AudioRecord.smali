# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class public final Lcom/zykj/blackboard/core/record/dataRecorder/AudioRecord;
.super Lcom/zykj/blackboard/core/record/DataRecorder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/blackboard/core/record/dataRecorder/AudioRecord$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\t\u0018\u0000 &2\u00020\u0001:\u0001&B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0011\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\rH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u000fJ\'\u0010\u0016\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\u00082\u0006\u0010\u001b\u001a\u00020\u001a\u00a2\u0006\u0004\u0008\u001c\u0010\u001dR$\u0010 \u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e8\u0006@BX\u0086\u000e\u00a2\u0006\u000c\n\u0004\u0008 \u0010!\u001a\u0004\u0008 \u0010\"R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010#R\u0018\u0010$\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008$\u0010%\u00a8\u0006\'"
    }
    d2 = {
        "Lcom/zykj/blackboard/core/record/dataRecorder/AudioRecord;",
        "Lcom/zykj/blackboard/core/record/DataRecorder;",
        "Lcom/zykj/blackboard/core/record/TimeRecord;",
        "timeRecord",
        "<init>",
        "(Lcom/zykj/blackboard/core/record/TimeRecord;)V",
        "Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;",
        "entity",
        "Ld6/s;",
        "updateEntity",
        "(Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;)V",
        "checkLength",
        "()V",
        "Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;",
        "initRecordEntity",
        "()Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;",
        "buildRecordEntity",
        "",
        "fileName",
        "",
        "duration",
        "currentTime",
        "addAudio",
        "(Ljava/lang/String;JJ)Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;",
        "updateAudio",
        "(Ljava/lang/String;J)Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;",
        "Lcom/zykj/blackboard/core/data/dao/RecordEntity;",
        "recordEntity",
        "setRecord",
        "(Lcom/zykj/blackboard/core/data/dao/RecordEntity;)V",
        "",
        "<set-?>",
        "isRecordChange",
        "Z",
        "()Z",
        "Lcom/zykj/blackboard/core/data/dao/RecordEntity;",
        "audioRecordEntity",
        "Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;",
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
.field public static final Companion:Lcom/zykj/blackboard/core/record/dataRecorder/AudioRecord$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final SOURCE_FILE_NAME_SUFFIX:Ljava/lang/String; = "_audio.bin"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field private audioRecordEntity:Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private isRecordChange:Z

.field private recordEntity:Lcom/zykj/blackboard/core/data/dao/RecordEntity;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/blackboard/core/record/dataRecorder/AudioRecord$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/blackboard/core/record/dataRecorder/AudioRecord$Companion;-><init>(Lkotlin/jvm/internal/e;)V

    sput-object v0, Lcom/zykj/blackboard/core/record/dataRecorder/AudioRecord;->Companion:Lcom/zykj/blackboard/core/record/dataRecorder/AudioRecord$Companion;

    return-void
.end method

.method public constructor <init>(Lcom/zykj/blackboard/core/record/TimeRecord;)V
    .locals 1
    .param p1    # Lcom/zykj/blackboard/core/record/TimeRecord;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "timeRecord"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lcom/zykj/blackboard/core/record/DataRecorder;-><init>(Lcom/zykj/blackboard/core/record/TimeRecord;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private final buildRecordEntity()Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/record/dataRecorder/AudioRecord;->recordEntity:Lcom/zykj/blackboard/core/data/dao/RecordEntity;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v1, Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;

    .line 6
    .line 7
    new-instance v2, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string v3, "_audio.bin"

    .line 20
    .line 21
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    const-string v3, ""

    .line 29
    .line 30
    const-wide/16 v4, 0x0

    .line 31
    .line 32
    invoke-direct {v1, v4, v5, v2, v3}, Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;-><init>(JLjava/lang/String;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->getAudioList()Lio/objectbox/relation/ToMany;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-virtual {v2, v1}, Lio/objectbox/relation/ToMany;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->put()V

    .line 43
    .line 44
    .line 45
    return-object v1

    .line 46
    :cond_0
    const/4 v0, 0x0

    .line 47
    return-object v0
.end method

.method private final declared-synchronized checkLength()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/zykj/blackboard/core/record/dataRecorder/AudioRecord;->audioRecordEntity:Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    invoke-direct {p0}, Lcom/zykj/blackboard/core/record/dataRecorder/AudioRecord;->buildRecordEntity()Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, Lcom/zykj/blackboard/core/record/dataRecorder/AudioRecord;->audioRecordEntity:Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :catchall_0
    move-exception v0

    .line 14
    goto :goto_1

    .line 15
    :cond_0
    invoke-static {v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;->getAudioInfoEntity()Lio/objectbox/relation/ToMany;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0}, Lio/objectbox/relation/ToMany;->size()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    const/16 v1, 0x64

    .line 27
    .line 28
    if-lt v0, v1, :cond_1

    .line 29
    .line 30
    invoke-direct {p0}, Lcom/zykj/blackboard/core/record/dataRecorder/AudioRecord;->buildRecordEntity()Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iput-object v0, p0, Lcom/zykj/blackboard/core/record/dataRecorder/AudioRecord;->audioRecordEntity:Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    .line 36
    :cond_1
    :goto_0
    monitor-exit p0

    .line 37
    return-void

    .line 38
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 39
    throw v0
.end method

.method private final initRecordEntity()Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/record/dataRecorder/AudioRecord;->recordEntity:Lcom/zykj/blackboard/core/data/dao/RecordEntity;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->getAudioList()Lio/objectbox/relation/ToMany;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-static {v0}, Lkotlin/collections/t;->p0(Ljava/util/List;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;->getAudioInfoEntity()Lio/objectbox/relation/ToMany;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v1}, Lio/objectbox/relation/ToMany;->size()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    const/16 v2, 0x64

    .line 28
    .line 29
    if-ge v1, v2, :cond_0

    .line 30
    .line 31
    return-object v0

    .line 32
    :cond_0
    invoke-direct {p0}, Lcom/zykj/blackboard/core/record/dataRecorder/AudioRecord;->buildRecordEntity()Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    return-object v0
.end method

.method private final updateEntity(Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/record/dataRecorder/AudioRecord;->audioRecordEntity:Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->getRecord()Lio/objectbox/relation/ToOne;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1, v0}, Lio/objectbox/relation/ToOne;->setTarget(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->put()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;->getAudioInfoEntity()Lio/objectbox/relation/ToMany;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v1, p1}, Lio/objectbox/relation/ToMany;->add(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;->put()V

    .line 23
    .line 24
    .line 25
    :cond_0
    invoke-direct {p0}, Lcom/zykj/blackboard/core/record/dataRecorder/AudioRecord;->checkLength()V

    .line 26
    .line 27
    .line 28
    const/4 p1, 0x1

    .line 29
    iput-boolean p1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/AudioRecord;->isRecordChange:Z

    .line 30
    .line 31
    return-void
.end method


# virtual methods
.method public final addAudio(Ljava/lang/String;JJ)Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    const-string v0, "fileName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/record/DataRecorder;->getTimeRecord()Lcom/zykj/blackboard/core/record/TimeRecord;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-static {v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    invoke-virtual {v0, p4, p5, v1}, Lcom/zykj/blackboard/core/record/TimeRecord;->getDelayTime(JZ)J

    .line 15
    .line 16
    .line 17
    move-result-wide p4

    .line 18
    sub-long v1, p4, p2

    .line 19
    .line 20
    sget-object v5, Lcom/zykj/board/EzyCommandEnum$CommandEnum;->ACTION_AUDIO_START:Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 21
    .line 22
    new-instance v6, Lcom/zykj/blackboard/core/record/dataRecorder/AudioRecord$addAudio$1;

    .line 23
    .line 24
    invoke-direct {v6, p1, p2, p3}, Lcom/zykj/blackboard/core/record/dataRecorder/AudioRecord$addAudio$1;-><init>(Ljava/lang/String;J)V

    .line 25
    .line 26
    .line 27
    move-object v0, p0

    .line 28
    move-wide v3, p2

    .line 29
    invoke-virtual/range {v0 .. v6}, Lcom/zykj/blackboard/core/record/DataRecorder;->buildAudioInfoEntity(JJLcom/zykj/board/EzyCommandEnum$CommandEnum;Lr6/a;)Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-direct {p0, p1}, Lcom/zykj/blackboard/core/record/dataRecorder/AudioRecord;->updateEntity(Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;)V

    .line 34
    .line 35
    .line 36
    return-object p1
.end method

.method public final isRecordChange()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/blackboard/core/record/dataRecorder/AudioRecord;->isRecordChange:Z

    .line 2
    .line 3
    return v0
.end method

.method public final setRecord(Lcom/zykj/blackboard/core/data/dao/RecordEntity;)V
    .locals 1
    .param p1    # Lcom/zykj/blackboard/core/data/dao/RecordEntity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "recordEntity"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/AudioRecord;->recordEntity:Lcom/zykj/blackboard/core/data/dao/RecordEntity;

    .line 7
    .line 8
    invoke-direct {p0}, Lcom/zykj/blackboard/core/record/dataRecorder/AudioRecord;->initRecordEntity()Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iput-object p1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/AudioRecord;->audioRecordEntity:Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;

    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    iput-boolean p1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/AudioRecord;->isRecordChange:Z

    .line 16
    .line 17
    return-void
.end method

.method public final updateAudio(Ljava/lang/String;J)Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;
    .locals 4
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    const-string v0, "fileName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/record/DataRecorder;->getTimeRecord()Lcom/zykj/blackboard/core/record/TimeRecord;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0, p2, p3}, Lcom/zykj/blackboard/core/record/TimeRecord;->setOffsetForAudio(J)V

    .line 13
    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Lcom/zykj/blackboard/core/record/dataRecorder/AudioRecord;->audioRecordEntity:Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    if-eqz v0, :cond_3

    .line 19
    .line 20
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;->getAudioInfoEntity()Lio/objectbox/relation/ToMany;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    if-eqz v0, :cond_3

    .line 25
    .line 26
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    move-object v3, v2

    .line 41
    check-cast v3, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;

    .line 42
    .line 43
    invoke-virtual {v3}, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->getData()[B

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    invoke-static {v3}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;->parseFrom([B)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    invoke-virtual {v3}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;->getFileName()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    invoke-static {v3, p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    if-eqz v3, :cond_1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_2
    move-object v2, v1

    .line 63
    :goto_0
    check-cast v2, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;

    .line 64
    .line 65
    if-eqz v2, :cond_3

    .line 66
    .line 67
    invoke-virtual {v2, p2, p3}, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->setDuration(J)V

    .line 68
    .line 69
    .line 70
    invoke-static {}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;->newBuilder()Lcom/zykj/board/d;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    iput-object p1, v0, Lcom/zykj/board/d;->b:Ljava/lang/Object;

    .line 78
    .line 79
    iget p1, v0, Lcom/zykj/board/d;->a:I

    .line 80
    .line 81
    or-int/lit8 p1, p1, 0x1

    .line 82
    .line 83
    iput p1, v0, Lcom/zykj/board/d;->a:I

    .line 84
    .line 85
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0, p2, p3}, Lcom/zykj/board/d;->i(J)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0}, Lcom/zykj/board/d;->c()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    invoke-virtual {p1}, Lcom/google/protobuf/AbstractMessageLite;->toByteArray()[B

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    const-string p2, "builder.build().toByteArray()"

    .line 100
    .line 101
    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v2, p1}, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->setData([B)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->put()V

    .line 108
    .line 109
    .line 110
    return-object v2

    .line 111
    :cond_3
    return-object v1
.end method
