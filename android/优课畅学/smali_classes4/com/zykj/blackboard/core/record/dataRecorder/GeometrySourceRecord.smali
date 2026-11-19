.class public final Lcom/zykj/blackboard/core/record/dataRecorder/GeometrySourceRecord;
.super Lcom/zykj/blackboard/core/record/DataRecorder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/blackboard/core/record/dataRecorder/GeometrySourceRecord$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/zykj/blackboard/core/record/dataRecorder/GeometrySourceRecord$Companion;

.field public static final SOURCE_FILE_NAME_SUFFIX:Ljava/lang/String; = "_geometry.bin"


# instance fields
.field private geometryRecordEntity:Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;

.field private recordEntity:Lcom/zykj/blackboard/core/data/dao/RecordEntity;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/blackboard/core/record/dataRecorder/GeometrySourceRecord$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/blackboard/core/record/dataRecorder/GeometrySourceRecord$Companion;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Lcom/zykj/blackboard/core/record/dataRecorder/GeometrySourceRecord;->Companion:Lcom/zykj/blackboard/core/record/dataRecorder/GeometrySourceRecord$Companion;

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

.method private final buildRecordEntity()Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/record/dataRecorder/GeometrySourceRecord;->recordEntity:Lcom/zykj/blackboard/core/data/dao/RecordEntity;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v1, Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;

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
    const-string v3, "_geometry.bin"

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
    invoke-direct {v1, v4, v5, v2, v3}, Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;-><init>(JLjava/lang/String;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->getGeometryList()Lio/objectbox/relation/ToMany;

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
    iget-object v0, p0, Lcom/zykj/blackboard/core/record/dataRecorder/GeometrySourceRecord;->geometryRecordEntity:Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    invoke-direct {p0}, Lcom/zykj/blackboard/core/record/dataRecorder/GeometrySourceRecord;->buildRecordEntity()Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, Lcom/zykj/blackboard/core/record/dataRecorder/GeometrySourceRecord;->geometryRecordEntity:Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;

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
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;->getGeometryInfoEntityList()Lio/objectbox/relation/ToMany;

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
    invoke-direct {p0}, Lcom/zykj/blackboard/core/record/dataRecorder/GeometrySourceRecord;->buildRecordEntity()Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iput-object v0, p0, Lcom/zykj/blackboard/core/record/dataRecorder/GeometrySourceRecord;->geometryRecordEntity:Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;
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

.method private final initRecordEntity()Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/record/dataRecorder/GeometrySourceRecord;->recordEntity:Lcom/zykj/blackboard/core/data/dao/RecordEntity;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->getGeometryList()Lio/objectbox/relation/ToMany;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-static {v0}, Li7/f0;->y0(Ljava/util/List;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;->getGeometryInfoEntityList()Lio/objectbox/relation/ToMany;

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
    invoke-direct {p0}, Lcom/zykj/blackboard/core/record/dataRecorder/GeometrySourceRecord;->buildRecordEntity()Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    return-object v0
.end method


# virtual methods
.method public final addGeometry(ILjava/util/List;Lcom/zykj/board/EzyPaint$Paint;)Lcom/zykj/blackboard/bean/CommonSourceResult;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lcom/zykj/board/EzyPointF$PointF;",
            ">;",
            "Lcom/zykj/board/EzyPaint$Paint;",
            ")",
            "Lcom/zykj/blackboard/bean/CommonSourceResult;"
        }
    .end annotation

    .line 1
    const-string v0, "pointFList"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "paint"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v1, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity;

    .line 12
    .line 13
    invoke-virtual {p3}, Lcom/zykj/board/EzyPaint$Paint;->getWidth()F

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    invoke-virtual {p3}, Lcom/zykj/board/EzyPaint$Paint;->getColor()I

    .line 18
    .line 19
    .line 20
    move-result v5

    .line 21
    invoke-virtual {p3}, Lcom/zykj/board/EzyPaint$Paint;->m()F

    .line 22
    .line 23
    .line 24
    move-result v6

    .line 25
    invoke-virtual {p3}, Lcom/zykj/board/EzyPaint$Paint;->l()I

    .line 26
    .line 27
    .line 28
    move-result v7

    .line 29
    const-wide/16 v2, 0x0

    .line 30
    .line 31
    move v8, p1

    .line 32
    invoke-direct/range {v1 .. v8}, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity;-><init>(JFIFII)V

    .line 33
    .line 34
    .line 35
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result p2

    .line 43
    if-eqz p2, :cond_0

    .line 44
    .line 45
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    check-cast p2, Lcom/zykj/board/EzyPointF$PointF;

    .line 50
    .line 51
    new-instance p3, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity;

    .line 52
    .line 53
    invoke-virtual {p2}, Lcom/zykj/board/EzyPointF$PointF;->getX()F

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    invoke-virtual {p2}, Lcom/zykj/board/EzyPointF$PointF;->getY()F

    .line 58
    .line 59
    .line 60
    move-result p2

    .line 61
    const-wide/16 v2, 0x0

    .line 62
    .line 63
    invoke-direct {p3, v2, v3, v0, p2}, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity;-><init>(JFF)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p3}, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity;->getRecord()Lio/objectbox/relation/ToOne;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    invoke-virtual {p2, v1}, Lio/objectbox/relation/ToOne;->k(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p3}, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity;->put()V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity;->getPointList()Lio/objectbox/relation/ToMany;

    .line 77
    .line 78
    .line 79
    move-result-object p2

    .line 80
    invoke-virtual {p2, p3}, Lio/objectbox/relation/ToMany;->add(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_0
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity;->put()V

    .line 85
    .line 86
    .line 87
    iget-object p1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/GeometrySourceRecord;->geometryRecordEntity:Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;

    .line 88
    .line 89
    if-eqz p1, :cond_1

    .line 90
    .line 91
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity;->getRecord()Lio/objectbox/relation/ToOne;

    .line 92
    .line 93
    .line 94
    move-result-object p2

    .line 95
    invoke-virtual {p2, p1}, Lio/objectbox/relation/ToOne;->k(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity;->put()V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;->getGeometryInfoEntityList()Lio/objectbox/relation/ToMany;

    .line 102
    .line 103
    .line 104
    move-result-object p2

    .line 105
    invoke-virtual {p2, v1}, Lio/objectbox/relation/ToMany;->add(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;->put()V

    .line 109
    .line 110
    .line 111
    new-instance p2, Lcom/zykj/blackboard/bean/CommonSourceResult;

    .line 112
    .line 113
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;->getFileName()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object p3

    .line 117
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;->getGeometryInfoEntityList()Lio/objectbox/relation/ToMany;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity;->getId()J

    .line 122
    .line 123
    .line 124
    move-result-wide v0

    .line 125
    invoke-virtual {p1, v0, v1}, Lio/objectbox/relation/ToMany;->i(J)I

    .line 126
    .line 127
    .line 128
    move-result p1

    .line 129
    invoke-direct {p2, p3, p1}, Lcom/zykj/blackboard/bean/CommonSourceResult;-><init>(Ljava/lang/String;I)V

    .line 130
    .line 131
    .line 132
    goto :goto_1

    .line 133
    :cond_1
    const/4 p2, 0x0

    .line 134
    :goto_1
    invoke-direct {p0}, Lcom/zykj/blackboard/core/record/dataRecorder/GeometrySourceRecord;->checkLength()V

    .line 135
    .line 136
    .line 137
    return-object p2
.end method

.method public final setRecord(Lcom/zykj/blackboard/core/data/dao/RecordEntity;)V
    .locals 1

    .line 1
    const-string v0, "recordEntity"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/GeometrySourceRecord;->recordEntity:Lcom/zykj/blackboard/core/data/dao/RecordEntity;

    .line 7
    .line 8
    invoke-direct {p0}, Lcom/zykj/blackboard/core/record/dataRecorder/GeometrySourceRecord;->initRecordEntity()Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iput-object p1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/GeometrySourceRecord;->geometryRecordEntity:Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;

    .line 13
    .line 14
    return-void
.end method
