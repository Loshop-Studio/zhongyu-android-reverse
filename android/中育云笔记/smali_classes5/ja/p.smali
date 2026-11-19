.class public final Lja/p;
.super Lia/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lja/p$a;
    }
.end annotation


# static fields
.field public static final e:Lja/p$a;


# instance fields
.field public c:Lcom/zykj/blackboard/core/data/dao/RecordEntity;

.field public d:Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lja/p$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lja/p$a;-><init>(Lkotlin/jvm/internal/n;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lja/p;->e:Lja/p$a;

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
    iget-object v0, p0, Lja/p;->d:Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, Lja/p;->f()Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, Lja/p;->d:Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;

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
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;->b()Lio/objectbox/relation/ToMany;

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
    invoke-virtual {p0}, Lja/p;->f()Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iput-object v0, p0, Lja/p;->d:Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;
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
.method public final e(ILjava/util/List;Lcom/zykj/board/EzyPaint$Paint;)Lq9/c;
    .locals 9

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
    invoke-virtual {p3}, Lcom/zykj/board/EzyPaint$Paint;->r()F

    .line 22
    .line 23
    .line 24
    move-result v6

    .line 25
    invoke-virtual {p3}, Lcom/zykj/board/EzyPaint$Paint;->p()I

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
    check-cast p2, Ljava/lang/Iterable;

    .line 36
    .line 37
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 42
    .line 43
    .line 44
    move-result p2

    .line 45
    if-eqz p2, :cond_0

    .line 46
    .line 47
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    check-cast p2, Lcom/zykj/board/EzyPointF$PointF;

    .line 52
    .line 53
    new-instance p3, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity;

    .line 54
    .line 55
    invoke-virtual {p2}, Lcom/zykj/board/EzyPointF$PointF;->getX()F

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    invoke-virtual {p2}, Lcom/zykj/board/EzyPointF$PointF;->getY()F

    .line 60
    .line 61
    .line 62
    move-result p2

    .line 63
    const-wide/16 v2, 0x0

    .line 64
    .line 65
    invoke-direct {p3, v2, v3, v0, p2}, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity;-><init>(JFF)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p3}, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity;->b()Lio/objectbox/relation/ToOne;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    invoke-virtual {p2, v1}, Lio/objectbox/relation/ToOne;->o(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p3}, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity;->e()V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity;->d()Lio/objectbox/relation/ToMany;

    .line 79
    .line 80
    .line 81
    move-result-object p2

    .line 82
    invoke-virtual {p2, p3}, Lio/objectbox/relation/ToMany;->add(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_0
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity;->i()V

    .line 87
    .line 88
    .line 89
    iget-object p1, p0, Lja/p;->d:Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;

    .line 90
    .line 91
    if-eqz p1, :cond_1

    .line 92
    .line 93
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity;->e()Lio/objectbox/relation/ToOne;

    .line 94
    .line 95
    .line 96
    move-result-object p2

    .line 97
    invoke-virtual {p2, p1}, Lio/objectbox/relation/ToOne;->o(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity;->i()V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;->b()Lio/objectbox/relation/ToMany;

    .line 104
    .line 105
    .line 106
    move-result-object p2

    .line 107
    invoke-virtual {p2, v1}, Lio/objectbox/relation/ToMany;->add(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;->e()V

    .line 111
    .line 112
    .line 113
    new-instance p2, Lq9/c;

    .line 114
    .line 115
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;->a()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object p3

    .line 119
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;->b()Lio/objectbox/relation/ToMany;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity;->c()J

    .line 124
    .line 125
    .line 126
    move-result-wide v0

    .line 127
    invoke-virtual {p1, v0, v1}, Lio/objectbox/relation/ToMany;->m(J)I

    .line 128
    .line 129
    .line 130
    move-result p1

    .line 131
    invoke-direct {p2, p3, p1}, Lq9/c;-><init>(Ljava/lang/String;I)V

    .line 132
    .line 133
    .line 134
    goto :goto_1

    .line 135
    :cond_1
    const/4 p2, 0x0

    .line 136
    :goto_1
    invoke-direct {p0}, Lja/p;->g()V

    .line 137
    .line 138
    .line 139
    return-object p2
.end method

.method public final f()Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;
    .locals 6

    .line 1
    iget-object v0, p0, Lja/p;->c:Lcom/zykj/blackboard/core/data/dao/RecordEntity;

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
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->d()Lio/objectbox/relation/ToMany;

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

.method public final h()Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;
    .locals 3

    .line 1
    iget-object v0, p0, Lja/p;->c:Lcom/zykj/blackboard/core/data/dao/RecordEntity;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->d()Lio/objectbox/relation/ToMany;

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
    check-cast v0, Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;->b()Lio/objectbox/relation/ToMany;

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
    invoke-virtual {p0}, Lja/p;->f()Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;

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
    iput-object p1, p0, Lja/p;->c:Lcom/zykj/blackboard/core/data/dao/RecordEntity;

    .line 7
    .line 8
    invoke-virtual {p0}, Lja/p;->h()Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iput-object p1, p0, Lja/p;->d:Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;

    .line 13
    .line 14
    return-void
.end method
