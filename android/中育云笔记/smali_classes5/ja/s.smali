.class public final Lja/s;
.super Lia/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lja/s$a;
    }
.end annotation


# static fields
.field public static final e:Lja/s$a;


# instance fields
.field public c:Lcom/zykj/blackboard/core/data/dao/RecordEntity;

.field public d:Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lja/s$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lja/s$a;-><init>(Lkotlin/jvm/internal/n;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lja/s;->e:Lja/s$a;

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
    iget-object v0, p0, Lja/s;->d:Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, Lja/s;->f()Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, Lja/s;->d:Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;

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
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;->c()Lio/objectbox/relation/ToMany;

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
    invoke-virtual {p0}, Lja/s;->f()Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iput-object v0, p0, Lja/s;->d:Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;
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
.method public final e(Ljava/util/List;Lcom/zykj/board/EzyPaint$Paint;)Lq9/c;
    .locals 12

    .line 1
    const-string v0, "eventList"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "paint"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

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
    invoke-virtual {p2}, Lcom/zykj/board/EzyPaint$Paint;->o()F

    .line 22
    .line 23
    .line 24
    move-result v6

    .line 25
    invoke-virtual {p2}, Lcom/zykj/board/EzyPaint$Paint;->n()F

    .line 26
    .line 27
    .line 28
    move-result v7

    .line 29
    invoke-virtual {p2}, Lcom/zykj/board/EzyPaint$Paint;->p()I

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
    invoke-direct/range {v1 .. v11}, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;-><init>(JFIFFIFILkotlin/jvm/internal/n;)V

    .line 40
    .line 41
    .line 42
    check-cast p1, Ljava/lang/Iterable;

    .line 43
    .line 44
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result p2

    .line 52
    if-eqz p2, :cond_0

    .line 53
    .line 54
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    check-cast p2, Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    .line 59
    .line 60
    new-instance v2, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity;

    .line 61
    .line 62
    invoke-virtual {p2}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getEventTime()J

    .line 63
    .line 64
    .line 65
    move-result-wide v5

    .line 66
    invoke-virtual {p2}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getX()F

    .line 67
    .line 68
    .line 69
    move-result v7

    .line 70
    invoke-virtual {p2}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getY()F

    .line 71
    .line 72
    .line 73
    move-result v8

    .line 74
    const-wide/16 v3, 0x0

    .line 75
    .line 76
    invoke-direct/range {v2 .. v8}, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity;-><init>(JJFF)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity;->c()Lio/objectbox/relation/ToOne;

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    invoke-virtual {p2, v1}, Lio/objectbox/relation/ToOne;->o(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity;->f()V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->h()Lio/objectbox/relation/ToMany;

    .line 90
    .line 91
    .line 92
    move-result-object p2

    .line 93
    invoke-virtual {p2, v2}, Lio/objectbox/relation/ToMany;->add(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_0
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->j()V

    .line 98
    .line 99
    .line 100
    iget-object p1, p0, Lja/s;->d:Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;

    .line 101
    .line 102
    if-eqz p1, :cond_1

    .line 103
    .line 104
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->d()Lio/objectbox/relation/ToOne;

    .line 105
    .line 106
    .line 107
    move-result-object p2

    .line 108
    invoke-virtual {p2, p1}, Lio/objectbox/relation/ToOne;->o(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->j()V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;->c()Lio/objectbox/relation/ToMany;

    .line 115
    .line 116
    .line 117
    move-result-object p2

    .line 118
    invoke-virtual {p2, v1}, Lio/objectbox/relation/ToMany;->add(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;->e()V

    .line 122
    .line 123
    .line 124
    new-instance p2, Lq9/c;

    .line 125
    .line 126
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;->a()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;->c()Lio/objectbox/relation/ToMany;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->b()J

    .line 135
    .line 136
    .line 137
    move-result-wide v1

    .line 138
    invoke-virtual {p1, v1, v2}, Lio/objectbox/relation/ToMany;->m(J)I

    .line 139
    .line 140
    .line 141
    move-result p1

    .line 142
    invoke-direct {p2, v0, p1}, Lq9/c;-><init>(Ljava/lang/String;I)V

    .line 143
    .line 144
    .line 145
    goto :goto_1

    .line 146
    :cond_1
    const/4 p2, 0x0

    .line 147
    :goto_1
    invoke-direct {p0}, Lja/s;->g()V

    .line 148
    .line 149
    .line 150
    return-object p2
.end method

.method public final f()Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;
    .locals 6

    .line 1
    iget-object v0, p0, Lja/s;->c:Lcom/zykj/blackboard/core/data/dao/RecordEntity;

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
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->i()Lio/objectbox/relation/ToMany;

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
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 45
    .line 46
    .line 47
    const-string v3, "after add \u5f53\u524dtouchList\u4e2a\u6570 -> "

    .line 48
    .line 49
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->i()Lio/objectbox/relation/ToMany;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    invoke-virtual {v3}, Lio/objectbox/relation/ToMany;->size()I

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    const-string v3, "TestForConvert"

    .line 68
    .line 69
    invoke-static {v3, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->j()V

    .line 73
    .line 74
    .line 75
    return-object v1

    .line 76
    :cond_0
    const/4 v0, 0x0

    .line 77
    return-object v0
.end method

.method public final h()Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;
    .locals 3

    .line 1
    iget-object v0, p0, Lja/s;->c:Lcom/zykj/blackboard/core/data/dao/RecordEntity;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->i()Lio/objectbox/relation/ToMany;

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
    check-cast v0, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;->c()Lio/objectbox/relation/ToMany;

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
    invoke-virtual {p0}, Lja/s;->f()Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;

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
    iput-object p1, p0, Lja/s;->c:Lcom/zykj/blackboard/core/data/dao/RecordEntity;

    .line 7
    .line 8
    invoke-virtual {p0}, Lja/s;->h()Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iput-object p1, p0, Lja/s;->d:Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;

    .line 13
    .line 14
    return-void
.end method
