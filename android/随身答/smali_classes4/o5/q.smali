.class public final Lo5/q;
.super Ln5/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo5/q$a;
    }
.end annotation


# static fields
.field public static final e:Lo5/q$a;


# instance fields
.field public c:Lcom/zykj/blackboard/core/data/dao/RecordEntity;

.field public d:Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lo5/q$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lo5/q$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lo5/q;->e:Lo5/q$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Ln5/a;-><init>(Ln5/e;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method private final declared-synchronized g()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lo5/q;->d:Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, Lo5/q;->f()Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, Lo5/q;->d:Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;

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
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;->c()Lio/objectbox/relation/ToMany;

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
    invoke-virtual {p0}, Lo5/q;->f()Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iput-object v0, p0, Lo5/q;->d:Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;
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


# virtual methods
.method public final e(Ljava/util/List;)Lv4/c;
    .locals 17

    .line 1
    const-string v0, "matrix"

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    new-instance v0, Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity;

    .line 9
    .line 10
    const-wide/16 v2, 0x0

    .line 11
    .line 12
    invoke-direct {v0, v2, v3}, Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity;-><init>(J)V

    .line 13
    .line 14
    .line 15
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    check-cast v2, Lcom/zykj/board/EzyMatrix$Matrix;

    .line 30
    .line 31
    new-instance v3, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;

    .line 32
    .line 33
    invoke-virtual {v2}, Lcom/zykj/board/EzyMatrix$Matrix;->getEventTime()J

    .line 34
    .line 35
    .line 36
    move-result-wide v6

    .line 37
    invoke-virtual {v2}, Lcom/zykj/board/EzyMatrix$Matrix;->getScaleX()F

    .line 38
    .line 39
    .line 40
    move-result v8

    .line 41
    invoke-virtual {v2}, Lcom/zykj/board/EzyMatrix$Matrix;->C()F

    .line 42
    .line 43
    .line 44
    move-result v9

    .line 45
    invoke-virtual {v2}, Lcom/zykj/board/EzyMatrix$Matrix;->E()F

    .line 46
    .line 47
    .line 48
    move-result v10

    .line 49
    invoke-virtual {v2}, Lcom/zykj/board/EzyMatrix$Matrix;->D()F

    .line 50
    .line 51
    .line 52
    move-result v11

    .line 53
    invoke-virtual {v2}, Lcom/zykj/board/EzyMatrix$Matrix;->getScaleY()F

    .line 54
    .line 55
    .line 56
    move-result v12

    .line 57
    invoke-virtual {v2}, Lcom/zykj/board/EzyMatrix$Matrix;->F()F

    .line 58
    .line 59
    .line 60
    move-result v13

    .line 61
    invoke-virtual {v2}, Lcom/zykj/board/EzyMatrix$Matrix;->z()F

    .line 62
    .line 63
    .line 64
    move-result v14

    .line 65
    invoke-virtual {v2}, Lcom/zykj/board/EzyMatrix$Matrix;->A()F

    .line 66
    .line 67
    .line 68
    move-result v15

    .line 69
    invoke-virtual {v2}, Lcom/zykj/board/EzyMatrix$Matrix;->B()F

    .line 70
    .line 71
    .line 72
    move-result v16

    .line 73
    const-wide/16 v4, 0x0

    .line 74
    .line 75
    invoke-direct/range {v3 .. v16}, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;-><init>(JJFFFFFFFFF)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v3}, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->f()Lio/objectbox/relation/ToOne;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    invoke-virtual {v2, v0}, Lio/objectbox/relation/ToOne;->w(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v3}, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->m()V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity;->b()Lio/objectbox/relation/ToMany;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    invoke-virtual {v2, v3}, Lio/objectbox/relation/ToMany;->add(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_0
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity;->d()V

    .line 97
    .line 98
    .line 99
    move-object/from16 v1, p0

    .line 100
    .line 101
    iget-object v2, v1, Lo5/q;->d:Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;

    .line 102
    .line 103
    if-eqz v2, :cond_1

    .line 104
    .line 105
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity;->c()Lio/objectbox/relation/ToOne;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    invoke-virtual {v3, v2}, Lio/objectbox/relation/ToOne;->w(Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity;->d()V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;->c()Lio/objectbox/relation/ToMany;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    invoke-virtual {v3, v0}, Lio/objectbox/relation/ToMany;->add(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;->e()V

    .line 123
    .line 124
    .line 125
    new-instance v3, Lv4/c;

    .line 126
    .line 127
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;->a()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v4

    .line 131
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;->c()Lio/objectbox/relation/ToMany;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity;->a()J

    .line 136
    .line 137
    .line 138
    move-result-wide v5

    .line 139
    invoke-virtual {v2, v5, v6}, Lio/objectbox/relation/ToMany;->u(J)I

    .line 140
    .line 141
    .line 142
    move-result v0

    .line 143
    invoke-direct {v3, v4, v0}, Lv4/c;-><init>(Ljava/lang/String;I)V

    .line 144
    .line 145
    .line 146
    goto :goto_1

    .line 147
    :cond_1
    const/4 v3, 0x0

    .line 148
    :goto_1
    invoke-direct {v1}, Lo5/q;->g()V

    .line 149
    .line 150
    .line 151
    return-object v3
.end method

.method public final f()Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;
    .locals 6

    .line 1
    iget-object v0, p0, Lo5/q;->c:Lcom/zykj/blackboard/core/data/dao/RecordEntity;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v1, Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;

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
    const-string v3, "_matrix.bin"

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
    invoke-direct {v1, v4, v5, v2, v3}, Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;-><init>(JLjava/lang/String;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->f()Lio/objectbox/relation/ToMany;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-virtual {v2, v1}, Lio/objectbox/relation/ToMany;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->j()V

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

.method public final h()Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;
    .locals 3

    .line 1
    iget-object v0, p0, Lo5/q;->c:Lcom/zykj/blackboard/core/data/dao/RecordEntity;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->f()Lio/objectbox/relation/ToMany;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->lastOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;->c()Lio/objectbox/relation/ToMany;

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
    invoke-virtual {p0}, Lo5/q;->f()Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    return-object v0
.end method

.method public final i(Lcom/zykj/blackboard/core/data/dao/RecordEntity;)V
    .locals 1

    .line 1
    const-string v0, "recordEntity"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lo5/q;->c:Lcom/zykj/blackboard/core/data/dao/RecordEntity;

    .line 7
    .line 8
    invoke-virtual {p0}, Lo5/q;->h()Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iput-object p1, p0, Lo5/q;->d:Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;

    .line 13
    .line 14
    return-void
.end method
