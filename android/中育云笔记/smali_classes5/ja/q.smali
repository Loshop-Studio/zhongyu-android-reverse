.class public final Lja/q;
.super Lia/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lja/q$a;
    }
.end annotation


# static fields
.field public static final e:Lja/q$a;


# instance fields
.field public c:Lcom/zykj/blackboard/core/data/dao/RecordEntity;

.field public d:Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lja/q$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lja/q$a;-><init>(Lkotlin/jvm/internal/n;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lja/q;->e:Lja/q$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lia/a;-><init>(Lia/e;)V

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
    iget-object v0, p0, Lja/q;->d:Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, Lja/q;->f()Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, Lja/q;->d:Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;

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
    invoke-virtual {p0}, Lja/q;->f()Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iput-object v0, p0, Lja/q;->d:Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;
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
.method public final e(Ljava/util/List;)Lq9/c;
    .locals 17

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    const-string v1, "matrix"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity;

    .line 9
    .line 10
    const-wide/16 v2, 0x0

    .line 11
    .line 12
    invoke-direct {v1, v2, v3}, Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity;-><init>(J)V

    .line 13
    .line 14
    .line 15
    check-cast v0, Ljava/lang/Iterable;

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    check-cast v2, Lcom/zykj/board/EzyMatrix$Matrix;

    .line 32
    .line 33
    new-instance v3, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;

    .line 34
    .line 35
    invoke-virtual {v2}, Lcom/zykj/board/EzyMatrix$Matrix;->getEventTime()J

    .line 36
    .line 37
    .line 38
    move-result-wide v6

    .line 39
    invoke-virtual {v2}, Lcom/zykj/board/EzyMatrix$Matrix;->getScaleX()F

    .line 40
    .line 41
    .line 42
    move-result v8

    .line 43
    invoke-virtual {v2}, Lcom/zykj/board/EzyMatrix$Matrix;->y()F

    .line 44
    .line 45
    .line 46
    move-result v9

    .line 47
    invoke-virtual {v2}, Lcom/zykj/board/EzyMatrix$Matrix;->A()F

    .line 48
    .line 49
    .line 50
    move-result v10

    .line 51
    invoke-virtual {v2}, Lcom/zykj/board/EzyMatrix$Matrix;->z()F

    .line 52
    .line 53
    .line 54
    move-result v11

    .line 55
    invoke-virtual {v2}, Lcom/zykj/board/EzyMatrix$Matrix;->getScaleY()F

    .line 56
    .line 57
    .line 58
    move-result v12

    .line 59
    invoke-virtual {v2}, Lcom/zykj/board/EzyMatrix$Matrix;->C()F

    .line 60
    .line 61
    .line 62
    move-result v13

    .line 63
    invoke-virtual {v2}, Lcom/zykj/board/EzyMatrix$Matrix;->t()F

    .line 64
    .line 65
    .line 66
    move-result v14

    .line 67
    invoke-virtual {v2}, Lcom/zykj/board/EzyMatrix$Matrix;->u()F

    .line 68
    .line 69
    .line 70
    move-result v15

    .line 71
    invoke-virtual {v2}, Lcom/zykj/board/EzyMatrix$Matrix;->v()F

    .line 72
    .line 73
    .line 74
    move-result v16

    .line 75
    const-wide/16 v4, 0x0

    .line 76
    .line 77
    invoke-direct/range {v3 .. v16}, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;-><init>(JJFFFFFFFFF)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v3}, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->f()Lio/objectbox/relation/ToOne;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    invoke-virtual {v2, v1}, Lio/objectbox/relation/ToOne;->o(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v3}, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->m()V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity;->b()Lio/objectbox/relation/ToMany;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    invoke-virtual {v2, v3}, Lio/objectbox/relation/ToMany;->add(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_0
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity;->d()V

    .line 99
    .line 100
    .line 101
    move-object/from16 v0, p0

    .line 102
    .line 103
    iget-object v2, v0, Lja/q;->d:Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;

    .line 104
    .line 105
    if-eqz v2, :cond_1

    .line 106
    .line 107
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity;->c()Lio/objectbox/relation/ToOne;

    .line 108
    .line 109
    .line 110
    move-result-object v3

    .line 111
    invoke-virtual {v3, v2}, Lio/objectbox/relation/ToOne;->o(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity;->d()V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;->c()Lio/objectbox/relation/ToMany;

    .line 118
    .line 119
    .line 120
    move-result-object v3

    .line 121
    invoke-virtual {v3, v1}, Lio/objectbox/relation/ToMany;->add(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;->e()V

    .line 125
    .line 126
    .line 127
    new-instance v3, Lq9/c;

    .line 128
    .line 129
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;->a()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v4

    .line 133
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;->c()Lio/objectbox/relation/ToMany;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity;->a()J

    .line 138
    .line 139
    .line 140
    move-result-wide v5

    .line 141
    invoke-virtual {v2, v5, v6}, Lio/objectbox/relation/ToMany;->m(J)I

    .line 142
    .line 143
    .line 144
    move-result v1

    .line 145
    invoke-direct {v3, v4, v1}, Lq9/c;-><init>(Ljava/lang/String;I)V

    .line 146
    .line 147
    .line 148
    goto :goto_1

    .line 149
    :cond_1
    const/4 v3, 0x0

    .line 150
    :goto_1
    invoke-direct {v0}, Lja/q;->g()V

    .line 151
    .line 152
    .line 153
    return-object v3
.end method

.method public final f()Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;
    .locals 6

    .line 1
    iget-object v0, p0, Lja/q;->c:Lcom/zykj/blackboard/core/data/dao/RecordEntity;

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
    iget-object v0, p0, Lja/q;->c:Lcom/zykj/blackboard/core/data/dao/RecordEntity;

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
    invoke-static {v0}, Lrc/g0;->z0(Ljava/util/List;)Ljava/lang/Object;

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
    invoke-virtual {p0}, Lja/q;->f()Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;

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
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lja/q;->c:Lcom/zykj/blackboard/core/data/dao/RecordEntity;

    .line 7
    .line 8
    invoke-virtual {p0}, Lja/q;->h()Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iput-object p1, p0, Lja/q;->d:Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;

    .line 13
    .line 14
    return-void
.end method
