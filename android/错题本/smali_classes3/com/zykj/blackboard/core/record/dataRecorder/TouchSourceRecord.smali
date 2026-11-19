.class public final Lcom/zykj/blackboard/core/record/dataRecorder/TouchSourceRecord;
.super Lcom/zykj/blackboard/core/record/DataRecorder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/blackboard/core/record/dataRecorder/TouchSourceRecord$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0003J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0011\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\u0008J%\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0016R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/zykj/blackboard/core/record/dataRecorder/TouchSourceRecord;",
        "Lcom/zykj/blackboard/core/record/DataRecorder;",
        "<init>",
        "()V",
        "Ld6/s;",
        "checkLength",
        "Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;",
        "initRecordEntity",
        "()Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;",
        "buildRecordEntity",
        "",
        "Lcom/zykj/board/EzyTouchEvent$TouchEvent;",
        "eventList",
        "Lcom/zykj/board/EzyPaint$Paint;",
        "paint",
        "Lcom/zykj/blackboard/bean/CommonSourceResult;",
        "addTouchEvent",
        "(Ljava/util/List;Lcom/zykj/board/EzyPaint$Paint;)Lcom/zykj/blackboard/bean/CommonSourceResult;",
        "Lcom/zykj/blackboard/core/data/dao/RecordEntity;",
        "recordEntity",
        "setRecord",
        "(Lcom/zykj/blackboard/core/data/dao/RecordEntity;)V",
        "Lcom/zykj/blackboard/core/data/dao/RecordEntity;",
        "touchRecordEntity",
        "Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;",
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
.field public static final Companion:Lcom/zykj/blackboard/core/record/dataRecorder/TouchSourceRecord$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final SOURCE_FILE_NAME_SUFFIX:Ljava/lang/String; = "_touch.bin"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field private recordEntity:Lcom/zykj/blackboard/core/data/dao/RecordEntity;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private touchRecordEntity:Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/blackboard/core/record/dataRecorder/TouchSourceRecord$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/blackboard/core/record/dataRecorder/TouchSourceRecord$Companion;-><init>(Lkotlin/jvm/internal/e;)V

    sput-object v0, Lcom/zykj/blackboard/core/record/dataRecorder/TouchSourceRecord;->Companion:Lcom/zykj/blackboard/core/record/dataRecorder/TouchSourceRecord$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lcom/zykj/blackboard/core/record/DataRecorder;-><init>(Lcom/zykj/blackboard/core/record/TimeRecord;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method private final buildRecordEntity()Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/record/dataRecorder/TouchSourceRecord;->recordEntity:Lcom/zykj/blackboard/core/data/dao/RecordEntity;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v1, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;

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
    const-string v3, "_touch.bin"

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
    invoke-direct {v1, v4, v5, v2, v3}, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;-><init>(JLjava/lang/String;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->getTouchList()Lio/objectbox/relation/ToMany;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-virtual {v2, v1}, Lio/objectbox/relation/ToMany;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    new-instance v2, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    const-string v3, "after add \u5f53\u524dtouchList\u4e2a\u6570 -> "

    .line 45
    .line 46
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->getTouchList()Lio/objectbox/relation/ToMany;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    invoke-virtual {v3}, Lio/objectbox/relation/ToMany;->size()I

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    const-string v3, "TestForConvert"

    .line 65
    .line 66
    invoke-static {v3, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->put()V

    .line 70
    .line 71
    .line 72
    return-object v1

    .line 73
    :cond_0
    const/4 v0, 0x0

    .line 74
    return-object v0
.end method

.method private final declared-synchronized checkLength()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/zykj/blackboard/core/record/dataRecorder/TouchSourceRecord;->touchRecordEntity:Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    invoke-direct {p0}, Lcom/zykj/blackboard/core/record/dataRecorder/TouchSourceRecord;->buildRecordEntity()Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, Lcom/zykj/blackboard/core/record/dataRecorder/TouchSourceRecord;->touchRecordEntity:Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;

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
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;->getTouchEventList()Lio/objectbox/relation/ToMany;

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
    invoke-direct {p0}, Lcom/zykj/blackboard/core/record/dataRecorder/TouchSourceRecord;->buildRecordEntity()Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iput-object v0, p0, Lcom/zykj/blackboard/core/record/dataRecorder/TouchSourceRecord;->touchRecordEntity:Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;
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

.method private final initRecordEntity()Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/record/dataRecorder/TouchSourceRecord;->recordEntity:Lcom/zykj/blackboard/core/data/dao/RecordEntity;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->getTouchList()Lio/objectbox/relation/ToMany;

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
    check-cast v0, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;->getTouchEventList()Lio/objectbox/relation/ToMany;

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
    invoke-direct {p0}, Lcom/zykj/blackboard/core/record/dataRecorder/TouchSourceRecord;->buildRecordEntity()Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    return-object v0
.end method


# virtual methods
.method public final addTouchEvent(Ljava/util/List;Lcom/zykj/board/EzyPaint$Paint;)Lcom/zykj/blackboard/bean/CommonSourceResult;
    .locals 12
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/zykj/board/EzyPaint$Paint;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/zykj/board/EzyTouchEvent$TouchEvent;",
            ">;",
            "Lcom/zykj/board/EzyPaint$Paint;",
            ")",
            "Lcom/zykj/blackboard/bean/CommonSourceResult;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    const-string v0, "eventList"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "paint"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v1, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;

    .line 12
    .line 13
    invoke-virtual {p2}, Lcom/zykj/board/EzyPaint$Paint;->getWidth()F

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    invoke-virtual {p2}, Lcom/zykj/board/EzyPaint$Paint;->getColor()I

    .line 18
    .line 19
    .line 20
    move-result v5

    .line 21
    invoke-virtual {p2}, Lcom/zykj/board/EzyPaint$Paint;->getSpacing()F

    .line 22
    .line 23
    .line 24
    move-result v6

    .line 25
    invoke-virtual {p2}, Lcom/zykj/board/EzyPaint$Paint;->getItemLength()F

    .line 26
    .line 27
    .line 28
    move-result v7

    .line 29
    invoke-virtual {p2}, Lcom/zykj/board/EzyPaint$Paint;->getStyle()I

    .line 30
    .line 31
    .line 32
    move-result v8

    .line 33
    const/16 v10, 0x40

    .line 34
    .line 35
    const/4 v11, 0x0

    .line 36
    const-wide/16 v2, 0x0

    .line 37
    .line 38
    const/4 v9, 0x0

    .line 39
    invoke-direct/range {v1 .. v11}, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;-><init>(JFIFFIFILkotlin/jvm/internal/e;)V

    .line 40
    .line 41
    .line 42
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 47
    .line 48
    .line 49
    move-result p2

    .line 50
    if-eqz p2, :cond_0

    .line 51
    .line 52
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    check-cast p2, Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    .line 57
    .line 58
    new-instance v2, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity;

    .line 59
    .line 60
    invoke-virtual {p2}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getEventTime()J

    .line 61
    .line 62
    .line 63
    move-result-wide v5

    .line 64
    invoke-virtual {p2}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getX()F

    .line 65
    .line 66
    .line 67
    move-result v7

    .line 68
    invoke-virtual {p2}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getY()F

    .line 69
    .line 70
    .line 71
    move-result v8

    .line 72
    const-wide/16 v3, 0x0

    .line 73
    .line 74
    invoke-direct/range {v2 .. v8}, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity;-><init>(JJFF)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity;->getRecord()Lio/objectbox/relation/ToOne;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    invoke-virtual {p2, v1}, Lio/objectbox/relation/ToOne;->setTarget(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity;->put()V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->getTouchInfoList()Lio/objectbox/relation/ToMany;

    .line 88
    .line 89
    .line 90
    move-result-object p2

    .line 91
    invoke-virtual {p2, v2}, Lio/objectbox/relation/ToMany;->add(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_0
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->put()V

    .line 96
    .line 97
    .line 98
    iget-object p1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/TouchSourceRecord;->touchRecordEntity:Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;

    .line 99
    .line 100
    if-eqz p1, :cond_1

    .line 101
    .line 102
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->getRecord()Lio/objectbox/relation/ToOne;

    .line 103
    .line 104
    .line 105
    move-result-object p2

    .line 106
    invoke-virtual {p2, p1}, Lio/objectbox/relation/ToOne;->setTarget(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->put()V

    .line 110
    .line 111
    .line 112
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;->getTouchEventList()Lio/objectbox/relation/ToMany;

    .line 113
    .line 114
    .line 115
    move-result-object p2

    .line 116
    invoke-virtual {p2, v1}, Lio/objectbox/relation/ToMany;->add(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;->put()V

    .line 120
    .line 121
    .line 122
    new-instance p2, Lcom/zykj/blackboard/bean/CommonSourceResult;

    .line 123
    .line 124
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;->getFileName()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;->getTouchEventList()Lio/objectbox/relation/ToMany;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->getId()J

    .line 133
    .line 134
    .line 135
    move-result-wide v1

    .line 136
    invoke-virtual {p1, v1, v2}, Lio/objectbox/relation/ToMany;->indexOfId(J)I

    .line 137
    .line 138
    .line 139
    move-result p1

    .line 140
    invoke-direct {p2, v0, p1}, Lcom/zykj/blackboard/bean/CommonSourceResult;-><init>(Ljava/lang/String;I)V

    .line 141
    .line 142
    .line 143
    goto :goto_1

    .line 144
    :cond_1
    const/4 p2, 0x0

    .line 145
    :goto_1
    invoke-direct {p0}, Lcom/zykj/blackboard/core/record/dataRecorder/TouchSourceRecord;->checkLength()V

    .line 146
    .line 147
    .line 148
    return-object p2
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
    iput-object p1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/TouchSourceRecord;->recordEntity:Lcom/zykj/blackboard/core/data/dao/RecordEntity;

    .line 7
    .line 8
    invoke-direct {p0}, Lcom/zykj/blackboard/core/record/dataRecorder/TouchSourceRecord;->initRecordEntity()Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iput-object p1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/TouchSourceRecord;->touchRecordEntity:Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;

    .line 13
    .line 14
    return-void
.end method
