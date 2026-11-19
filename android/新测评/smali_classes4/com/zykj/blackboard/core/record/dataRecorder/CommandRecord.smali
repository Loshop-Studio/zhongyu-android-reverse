.class public final Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;
.super Lx4/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$a;
    }
.end annotation


# static fields
.field public static final l:Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$a;


# instance fields
.field public c:Lcom/zykj/blackboard/core/data/dao/RecordEntity;

.field public d:Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;

.field public final e:Ly4/s;

.field public final f:Ly4/q;

.field public final g:Ly4/o;

.field public final h:Ljava/util/List;

.field public final i:Ly4/r;

.field public final j:Ly4/p;

.field public final k:Ljava/util/concurrent/ThreadPoolExecutor;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->l:Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$a;

    return-void
.end method

.method public constructor <init>(Lx4/e;)V
    .locals 1

    .line 1
    const-string v0, "timeRecord"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lx4/a;-><init>(Lx4/e;)V

    .line 7
    .line 8
    .line 9
    new-instance p1, Ly4/s;

    .line 10
    .line 11
    invoke-direct {p1}, Ly4/s;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->e:Ly4/s;

    .line 15
    .line 16
    new-instance p1, Ly4/q;

    .line 17
    .line 18
    invoke-direct {p1}, Ly4/q;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->f:Ly4/q;

    .line 22
    .line 23
    new-instance p1, Ly4/o;

    .line 24
    .line 25
    invoke-direct {p1}, Ly4/o;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->g:Ly4/o;

    .line 29
    .line 30
    new-instance p1, Ljava/util/ArrayList;

    .line 31
    .line 32
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 33
    .line 34
    .line 35
    iput-object p1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->h:Ljava/util/List;

    .line 36
    .line 37
    new-instance p1, Ly4/r;

    .line 38
    .line 39
    invoke-direct {p1}, Ly4/r;-><init>()V

    .line 40
    .line 41
    .line 42
    iput-object p1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->i:Ly4/r;

    .line 43
    .line 44
    new-instance p1, Ly4/p;

    .line 45
    .line 46
    invoke-direct {p1}, Ly4/p;-><init>()V

    .line 47
    .line 48
    .line 49
    iput-object p1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->j:Ly4/p;

    .line 50
    .line 51
    invoke-static {}, Ljava/util/concurrent/Executors;->newCachedThreadPool()Ljava/util/concurrent/ExecutorService;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    const-string v0, "null cannot be cast to non-null type java.util.concurrent.ThreadPoolExecutor"

    .line 56
    .line 57
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    check-cast p1, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 61
    .line 62
    iput-object p1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->k:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 63
    .line 64
    return-void
.end method

.method public static final A(Ljava/util/List;Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLcom/zykj/board/EzyMatrix$Matrix;Lcom/zykj/board/EzyMatrix$Matrix;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
    .locals 9

    .line 1
    const-string v0, "$matrixList"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "this$0"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "$lastMatrix"

    .line 12
    .line 13
    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "$originMatrix"

    .line 17
    .line 18
    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_1

    .line 26
    .line 27
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    const/4 v1, 0x1

    .line 32
    if-ne v0, v1, :cond_0

    .line 33
    .line 34
    const-wide/16 v0, 0x0

    .line 35
    .line 36
    :goto_0
    move-wide v5, v0

    .line 37
    goto :goto_1

    .line 38
    :cond_0
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->last(Ljava/util/List;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    check-cast v0, Lcom/zykj/board/EzyMatrix$Matrix;

    .line 43
    .line 44
    invoke-virtual {v0}, Lcom/zykj/board/EzyMatrix$Matrix;->getEventTime()J

    .line 45
    .line 46
    .line 47
    move-result-wide v0

    .line 48
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    check-cast v2, Lcom/zykj/board/EzyMatrix$Matrix;

    .line 53
    .line 54
    invoke-virtual {v2}, Lcom/zykj/board/EzyMatrix$Matrix;->getEventTime()J

    .line 55
    .line 56
    .line 57
    move-result-wide v2

    .line 58
    sub-long/2addr v0, v2

    .line 59
    goto :goto_0

    .line 60
    :goto_1
    invoke-virtual {p1, v5, v6, p2, p3}, Lx4/a;->c(JJ)J

    .line 61
    .line 62
    .line 63
    move-result-wide v3

    .line 64
    sget-object v7, Lcom/zykj/board/EzyCommandEnum$CommandEnum;->j:Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 65
    .line 66
    new-instance v8, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addCameraMatrix$1$1;

    .line 67
    .line 68
    invoke-direct {v8, p4, p5, p1, p0}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addCameraMatrix$1$1;-><init>(Lcom/zykj/board/EzyMatrix$Matrix;Lcom/zykj/board/EzyMatrix$Matrix;Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;Ljava/util/List;)V

    .line 69
    .line 70
    .line 71
    move-object v2, p1

    .line 72
    invoke-virtual/range {v2 .. v8}, Lx4/a;->b(JJLcom/zykj/board/EzyCommandEnum$CommandEnum;Lkotlin/jvm/functions/Function0;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    invoke-virtual {v2, p0}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->g0(Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;)V

    .line 77
    .line 78
    .line 79
    return-object p0

    .line 80
    :cond_1
    const/4 p0, 0x0

    .line 81
    return-object p0
.end method

.method public static final E(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLcom/zykj/board/EzyGraphEnum$GraphEnum;Lcom/zykj/board/EzyRectF$RectF;Ljava/lang/String;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
    .locals 7

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "$graphType"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "$rectF"

    .line 12
    .line 13
    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "$parentGraphId"

    .line 17
    .line 18
    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lx4/a;->d()Lx4/e;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    const/4 v5, 0x2

    .line 28
    const/4 v6, 0x0

    .line 29
    const/4 v4, 0x0

    .line 30
    move-wide v2, p1

    .line 31
    invoke-static/range {v1 .. v6}, Lx4/b$a;->a(Lx4/b;JZILjava/lang/Object;)J

    .line 32
    .line 33
    .line 34
    move-result-wide p1

    .line 35
    :goto_0
    move-wide v1, p1

    .line 36
    goto :goto_1

    .line 37
    :cond_0
    const-wide/16 p1, 0x0

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :goto_1
    sget-object v5, Lcom/zykj/board/EzyCommandEnum$CommandEnum;->c:Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 41
    .line 42
    new-instance v6, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addCommand$1$1;

    .line 43
    .line 44
    invoke-direct {v6, p3, p4, p5}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addCommand$1$1;-><init>(Lcom/zykj/board/EzyGraphEnum$GraphEnum;Lcom/zykj/board/EzyRectF$RectF;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    const-wide/16 v3, 0x0

    .line 48
    .line 49
    move-object v0, p0

    .line 50
    invoke-virtual/range {v0 .. v6}, Lx4/a;->b(JJLcom/zykj/board/EzyCommandEnum$CommandEnum;Lkotlin/jvm/functions/Function0;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-virtual {v0, p0}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->g0(Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;)V

    .line 55
    .line 56
    .line 57
    return-object p0
.end method

.method public static final F(Ljava/util/List;Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLjava/lang/String;Lcom/zykj/board/EzyGraphEnum$GraphEnum;Ljava/lang/String;Lcom/zykj/board/EzyPaint$Paint;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
    .locals 10

    .line 1
    const-string v0, "$eventList"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "this$0"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "$graphId"

    .line 12
    .line 13
    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "$graphType"

    .line 17
    .line 18
    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "$parentGraphId"

    .line 22
    .line 23
    move-object/from16 v5, p6

    .line 24
    .line 25
    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const-string v0, "$paint"

    .line 29
    .line 30
    move-object/from16 v7, p7

    .line 31
    .line 32
    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-nez v0, :cond_1

    .line 40
    .line 41
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    const/4 v1, 0x1

    .line 46
    if-ne v0, v1, :cond_0

    .line 47
    .line 48
    const-wide/16 v0, 0x0

    .line 49
    .line 50
    :goto_0
    move-wide v8, v0

    .line 51
    goto :goto_1

    .line 52
    :cond_0
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->last(Ljava/util/List;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    check-cast v0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    .line 57
    .line 58
    invoke-virtual {v0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getEventTime()J

    .line 59
    .line 60
    .line 61
    move-result-wide v0

    .line 62
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    check-cast v4, Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    .line 67
    .line 68
    invoke-virtual {v4}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getEventTime()J

    .line 69
    .line 70
    .line 71
    move-result-wide v8

    .line 72
    sub-long/2addr v0, v8

    .line 73
    goto :goto_0

    .line 74
    :goto_1
    invoke-virtual {p1, v8, v9, p2, p3}, Lx4/a;->c(JJ)J

    .line 75
    .line 76
    .line 77
    move-result-wide p2

    .line 78
    sget-object v0, Lcom/zykj/board/EzyCommandEnum$CommandEnum;->c:Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 79
    .line 80
    new-instance v1, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addCommand$2$1;

    .line 81
    .line 82
    move-object v4, p0

    .line 83
    move-object v6, p1

    .line 84
    move-object v2, p4

    .line 85
    move-object v3, p5

    .line 86
    invoke-direct/range {v1 .. v7}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addCommand$2$1;-><init>(Ljava/lang/String;Lcom/zykj/board/EzyGraphEnum$GraphEnum;Ljava/util/List;Ljava/lang/String;Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;Lcom/zykj/board/EzyPaint$Paint;)V

    .line 87
    .line 88
    .line 89
    move-wide v3, p2

    .line 90
    move-object v7, v0

    .line 91
    move-object v2, v6

    .line 92
    move-wide v5, v8

    .line 93
    move-object v8, v1

    .line 94
    invoke-virtual/range {v2 .. v8}, Lx4/a;->b(JJLcom/zykj/board/EzyCommandEnum$CommandEnum;Lkotlin/jvm/functions/Function0;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    invoke-virtual {p1, p0}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->g0(Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;)V

    .line 99
    .line 100
    .line 101
    return-object p0

    .line 102
    :cond_1
    const/4 p0, 0x0

    .line 103
    return-object p0
.end method

.method public static final G(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLcom/zykj/board/EzyGraphEnum$GraphEnum;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
    .locals 14

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "$graphType"

    .line 7
    .line 8
    move-object/from16 v1, p3

    .line 9
    .line 10
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const-string v0, "$parentGraphId"

    .line 14
    .line 15
    move-object/from16 v4, p6

    .line 16
    .line 17
    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const-string v0, "$fileName"

    .line 21
    .line 22
    move-object/from16 v6, p7

    .line 23
    .line 24
    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const-string v0, "$validate"

    .line 28
    .line 29
    move-object/from16 v7, p8

    .line 30
    .line 31
    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Lx4/a;->d()Lx4/e;

    .line 35
    .line 36
    .line 37
    move-result-object v8

    .line 38
    if-eqz v8, :cond_0

    .line 39
    .line 40
    const/4 v12, 0x2

    .line 41
    const/4 v13, 0x0

    .line 42
    const/4 v11, 0x0

    .line 43
    move-wide v9, p1

    .line 44
    invoke-static/range {v8 .. v13}, Lx4/b$a;->a(Lx4/b;JZILjava/lang/Object;)J

    .line 45
    .line 46
    .line 47
    move-result-wide v2

    .line 48
    :goto_0
    move-wide v9, v2

    .line 49
    goto :goto_1

    .line 50
    :cond_0
    const-wide/16 v2, 0x0

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :goto_1
    sget-object v11, Lcom/zykj/board/EzyCommandEnum$CommandEnum;->c:Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 54
    .line 55
    new-instance v0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addCommand$3$1;

    .line 56
    .line 57
    move-object v5, p0

    .line 58
    move/from16 v2, p4

    .line 59
    .line 60
    move/from16 v3, p5

    .line 61
    .line 62
    move/from16 v8, p9

    .line 63
    .line 64
    invoke-direct/range {v0 .. v8}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addCommand$3$1;-><init>(Lcom/zykj/board/EzyGraphEnum$GraphEnum;IILjava/lang/String;Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 65
    .line 66
    .line 67
    const-wide/16 v1, 0x0

    .line 68
    .line 69
    move-object p1, p0

    .line 70
    move-object/from16 p7, v0

    .line 71
    .line 72
    move-wide/from16 p4, v1

    .line 73
    .line 74
    move-wide/from16 p2, v9

    .line 75
    .line 76
    move-object/from16 p6, v11

    .line 77
    .line 78
    invoke-virtual/range {p1 .. p7}, Lx4/a;->b(JJLcom/zykj/board/EzyCommandEnum$CommandEnum;Lkotlin/jvm/functions/Function0;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-virtual {p0, v0}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->g0(Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;)V

    .line 83
    .line 84
    .line 85
    return-object v0
.end method

.method public static final I(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JIILcom/zykj/blackboard/bean/BackgroundLineConfig;Lcom/zykj/blackboard/bean/BackgroundLineConfig;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
    .locals 7

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "$originBackgroundLineConfig"

    .line 7
    .line 8
    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "$lastBackgroundLineConfig"

    .line 12
    .line 13
    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lx4/a;->d()Lx4/e;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    const/4 v5, 0x2

    .line 23
    const/4 v6, 0x0

    .line 24
    const/4 v4, 0x0

    .line 25
    move-wide v2, p1

    .line 26
    invoke-static/range {v1 .. v6}, Lx4/b$a;->a(Lx4/b;JZILjava/lang/Object;)J

    .line 27
    .line 28
    .line 29
    move-result-wide p1

    .line 30
    :goto_0
    move-wide v1, p1

    .line 31
    goto :goto_1

    .line 32
    :cond_0
    const-wide/16 p1, 0x0

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :goto_1
    sget-object v5, Lcom/zykj/board/EzyCommandEnum$CommandEnum;->k:Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 36
    .line 37
    new-instance v6, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addConfigCommand$1$1;

    .line 38
    .line 39
    invoke-direct {v6, p3, p4, p5, p6}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addConfigCommand$1$1;-><init>(IILcom/zykj/blackboard/bean/BackgroundLineConfig;Lcom/zykj/blackboard/bean/BackgroundLineConfig;)V

    .line 40
    .line 41
    .line 42
    const-wide/16 v3, 0x0

    .line 43
    .line 44
    move-object v0, p0

    .line 45
    invoke-virtual/range {v0 .. v6}, Lx4/a;->b(JJLcom/zykj/board/EzyCommandEnum$CommandEnum;Lkotlin/jvm/functions/Function0;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-virtual {v0, p0}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->g0(Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;)V

    .line 50
    .line 51
    .line 52
    return-object p0
.end method

.method public static final K(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JFFLjava/lang/String;ILjava/util/List;Lcom/zykj/board/EzyPaint$Paint;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
    .locals 7

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "$parentGraphId"

    .line 7
    .line 8
    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "$pointList"

    .line 12
    .line 13
    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "$paint"

    .line 17
    .line 18
    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lx4/a;->d()Lx4/e;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    const/4 v5, 0x2

    .line 28
    const/4 v6, 0x0

    .line 29
    const/4 v4, 0x0

    .line 30
    move-wide v2, p1

    .line 31
    invoke-static/range {v1 .. v6}, Lx4/b$a;->a(Lx4/b;JZILjava/lang/Object;)J

    .line 32
    .line 33
    .line 34
    move-result-wide p1

    .line 35
    :goto_0
    move-wide v1, p1

    .line 36
    goto :goto_1

    .line 37
    :cond_0
    const-wide/16 p1, 0x0

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :goto_1
    sget-object v5, Lcom/zykj/board/EzyCommandEnum$CommandEnum;->c:Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 41
    .line 42
    new-instance v6, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addGeometryGraphCommand$1$1;

    .line 43
    .line 44
    move p1, p3

    .line 45
    move p2, p4

    .line 46
    move-object p3, p5

    .line 47
    move p5, p6

    .line 48
    move-object p6, p7

    .line 49
    move-object p7, p8

    .line 50
    move-object p4, p0

    .line 51
    move-object p0, v6

    .line 52
    invoke-direct/range {p0 .. p7}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addGeometryGraphCommand$1$1;-><init>(FFLjava/lang/String;Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;ILjava/util/List;Lcom/zykj/board/EzyPaint$Paint;)V

    .line 53
    .line 54
    .line 55
    const-wide/16 v3, 0x0

    .line 56
    .line 57
    move-object v0, p4

    .line 58
    invoke-virtual/range {v0 .. v6}, Lx4/a;->b(JJLcom/zykj/board/EzyCommandEnum$CommandEnum;Lkotlin/jvm/functions/Function0;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-virtual {p4, p0}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->g0(Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;)V

    .line 63
    .line 64
    .line 65
    return-object p0
.end method

.method public static final M(Ljava/util/List;Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLjava/util/List;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
    .locals 9

    .line 1
    const-string v0, "$matrixList"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "this$0"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "$graphIdList"

    .line 12
    .line 13
    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    const/4 v1, 0x1

    .line 27
    if-ne v0, v1, :cond_0

    .line 28
    .line 29
    const-wide/16 v0, 0x0

    .line 30
    .line 31
    :goto_0
    move-wide v5, v0

    .line 32
    goto :goto_1

    .line 33
    :cond_0
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->last(Ljava/util/List;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    check-cast v0, Lcom/zykj/board/EzyMatrix$Matrix;

    .line 38
    .line 39
    invoke-virtual {v0}, Lcom/zykj/board/EzyMatrix$Matrix;->getEventTime()J

    .line 40
    .line 41
    .line 42
    move-result-wide v0

    .line 43
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    check-cast v2, Lcom/zykj/board/EzyMatrix$Matrix;

    .line 48
    .line 49
    invoke-virtual {v2}, Lcom/zykj/board/EzyMatrix$Matrix;->getEventTime()J

    .line 50
    .line 51
    .line 52
    move-result-wide v2

    .line 53
    sub-long/2addr v0, v2

    .line 54
    goto :goto_0

    .line 55
    :goto_1
    invoke-virtual {p1, v5, v6, p2, p3}, Lx4/a;->c(JJ)J

    .line 56
    .line 57
    .line 58
    move-result-wide v3

    .line 59
    sget-object v7, Lcom/zykj/board/EzyCommandEnum$CommandEnum;->e:Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 60
    .line 61
    new-instance v8, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addGraphMatrix$1$1;

    .line 62
    .line 63
    invoke-direct {v8, p4, p1, p0}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addGraphMatrix$1$1;-><init>(Ljava/util/List;Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;Ljava/util/List;)V

    .line 64
    .line 65
    .line 66
    move-object v2, p1

    .line 67
    invoke-virtual/range {v2 .. v8}, Lx4/a;->b(JJLcom/zykj/board/EzyCommandEnum$CommandEnum;Lkotlin/jvm/functions/Function0;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    invoke-virtual {v2, p0}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->g0(Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;)V

    .line 72
    .line 73
    .line 74
    return-object p0

    .line 75
    :cond_1
    const/4 p0, 0x0

    .line 76
    return-object p0
.end method

.method public static final O(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JFFLjava/lang/String;Ljava/lang/String;Lcom/zykj/board/EzyPaint$Paint;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
    .locals 7

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "$parentGraphId"

    .line 7
    .line 8
    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "$content"

    .line 12
    .line 13
    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "$paint"

    .line 17
    .line 18
    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lx4/a;->d()Lx4/e;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    const/4 v5, 0x2

    .line 28
    const/4 v6, 0x0

    .line 29
    const/4 v4, 0x0

    .line 30
    move-wide v2, p1

    .line 31
    invoke-static/range {v1 .. v6}, Lx4/b$a;->a(Lx4/b;JZILjava/lang/Object;)J

    .line 32
    .line 33
    .line 34
    move-result-wide p1

    .line 35
    :goto_0
    move-wide v1, p1

    .line 36
    goto :goto_1

    .line 37
    :cond_0
    const-wide/16 p1, 0x0

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :goto_1
    sget-object v5, Lcom/zykj/board/EzyCommandEnum$CommandEnum;->c:Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 41
    .line 42
    new-instance v6, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addTextGraphCommand$1$1;

    .line 43
    .line 44
    move p1, p3

    .line 45
    move p2, p4

    .line 46
    move-object p3, p5

    .line 47
    move-object p5, p6

    .line 48
    move-object p6, p7

    .line 49
    move-object p4, p0

    .line 50
    move-object p0, v6

    .line 51
    invoke-direct/range {p0 .. p6}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addTextGraphCommand$1$1;-><init>(FFLjava/lang/String;Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;Ljava/lang/String;Lcom/zykj/board/EzyPaint$Paint;)V

    .line 52
    .line 53
    .line 54
    const-wide/16 v3, 0x0

    .line 55
    .line 56
    move-object v0, p4

    .line 57
    invoke-virtual/range {v0 .. v6}, Lx4/a;->b(JJLcom/zykj/board/EzyCommandEnum$CommandEnum;Lkotlin/jvm/functions/Function0;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-virtual {p4, p0}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->g0(Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;)V

    .line 62
    .line 63
    .line 64
    return-object p0
.end method

.method public static final R(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLjava/lang/String;Lcom/zykj/board/EzyGraphEnum$GraphEnum;Lcom/zykj/board/EzyRectF$RectF;Ljava/lang/String;Lcom/zykj/board/EzyPaint$Paint;Ljava/util/List;Lcom/zykj/board/EzyMatrix$Matrix;Ljava/lang/String;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
    .locals 10

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "$graphId"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "$graphEnum"

    .line 12
    .line 13
    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lx4/a;->d()Lx4/e;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    if-eqz v4, :cond_0

    .line 21
    .line 22
    const/4 v8, 0x2

    .line 23
    const/4 v9, 0x0

    .line 24
    const/4 v7, 0x0

    .line 25
    move-wide v5, p1

    .line 26
    invoke-static/range {v4 .. v9}, Lx4/b$a;->a(Lx4/b;JZILjava/lang/Object;)J

    .line 27
    .line 28
    .line 29
    move-result-wide p1

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const-wide/16 p1, 0x0

    .line 32
    .line 33
    :goto_0
    sget-object v0, Lcom/zykj/board/EzyCommandEnum$CommandEnum;->f:Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 34
    .line 35
    new-instance v1, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$changeGraph$1$1;

    .line 36
    .line 37
    move-object v2, p3

    .line 38
    move-object v3, p4

    .line 39
    move-object v4, p5

    .line 40
    move-object/from16 v5, p6

    .line 41
    .line 42
    move-object/from16 v6, p7

    .line 43
    .line 44
    move-object/from16 v7, p8

    .line 45
    .line 46
    move-object/from16 v8, p9

    .line 47
    .line 48
    move-object/from16 v9, p10

    .line 49
    .line 50
    invoke-direct/range {v1 .. v9}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$changeGraph$1$1;-><init>(Ljava/lang/String;Lcom/zykj/board/EzyGraphEnum$GraphEnum;Lcom/zykj/board/EzyRectF$RectF;Ljava/lang/String;Lcom/zykj/board/EzyPaint$Paint;Ljava/util/List;Lcom/zykj/board/EzyMatrix$Matrix;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    const-wide/16 v2, 0x0

    .line 54
    .line 55
    move-object p3, p0

    .line 56
    move-wide p4, p1

    .line 57
    move-object/from16 p8, v0

    .line 58
    .line 59
    move-object/from16 p9, v1

    .line 60
    .line 61
    move-wide/from16 p6, v2

    .line 62
    .line 63
    invoke-virtual/range {p3 .. p9}, Lx4/a;->b(JJLcom/zykj/board/EzyCommandEnum$CommandEnum;Lkotlin/jvm/functions/Function0;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->g0(Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;)V

    .line 68
    .line 69
    .line 70
    return-object p1
.end method

.method private final declared-synchronized S()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->d:Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->P()Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->d:Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;

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
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;->a()Lio/objectbox/relation/ToMany;

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
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->P()Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iput-object v0, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->d:Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;
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

.method public static final V(Ljava/util/List;Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLcom/zykj/board/EzyPaint$Paint;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
    .locals 9

    .line 1
    const-string v0, "$eventList"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "this$0"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "$paint"

    .line 12
    .line 13
    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    const/4 v1, 0x1

    .line 27
    if-ne v0, v1, :cond_0

    .line 28
    .line 29
    const-wide/16 v0, 0x0

    .line 30
    .line 31
    :goto_0
    move-wide v5, v0

    .line 32
    goto :goto_1

    .line 33
    :cond_0
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->last(Ljava/util/List;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    check-cast v0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    .line 38
    .line 39
    invoke-virtual {v0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getEventTime()J

    .line 40
    .line 41
    .line 42
    move-result-wide v0

    .line 43
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    check-cast v2, Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    .line 48
    .line 49
    invoke-virtual {v2}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getEventTime()J

    .line 50
    .line 51
    .line 52
    move-result-wide v2

    .line 53
    sub-long/2addr v0, v2

    .line 54
    goto :goto_0

    .line 55
    :goto_1
    invoke-virtual {p1, v5, v6, p2, p3}, Lx4/a;->c(JJ)J

    .line 56
    .line 57
    .line 58
    move-result-wide v3

    .line 59
    sget-object v7, Lcom/zykj/board/EzyCommandEnum$CommandEnum;->m:Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 60
    .line 61
    new-instance v8, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$moveCursor$1$1;

    .line 62
    .line 63
    invoke-direct {v8, p1, p0, p4}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$moveCursor$1$1;-><init>(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;Ljava/util/List;Lcom/zykj/board/EzyPaint$Paint;)V

    .line 64
    .line 65
    .line 66
    move-object v2, p1

    .line 67
    invoke-virtual/range {v2 .. v8}, Lx4/a;->b(JJLcom/zykj/board/EzyCommandEnum$CommandEnum;Lkotlin/jvm/functions/Function0;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    invoke-virtual {v2, p0}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->g0(Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;)V

    .line 72
    .line 73
    .line 74
    return-object p0

    .line 75
    :cond_1
    const/4 p0, 0x0

    .line 76
    return-object p0
.end method

.method public static final Y(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLq4/a;I)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
    .locals 7

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "$rootGraph"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lx4/a;->d()Lx4/e;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    const/4 v5, 0x2

    .line 18
    const/4 v6, 0x0

    .line 19
    const/4 v4, 0x0

    .line 20
    move-wide v2, p1

    .line 21
    invoke-static/range {v1 .. v6}, Lx4/b$a;->a(Lx4/b;JZILjava/lang/Object;)J

    .line 22
    .line 23
    .line 24
    move-result-wide p1

    .line 25
    :goto_0
    move-wide v1, p1

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    const-wide/16 p1, 0x0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :goto_1
    sget-object v5, Lcom/zykj/board/EzyCommandEnum$CommandEnum;->n:Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 31
    .line 32
    new-instance v6, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$rebuild$1$1;

    .line 33
    .line 34
    invoke-direct {v6, p3, p4}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$rebuild$1$1;-><init>(Lq4/a;I)V

    .line 35
    .line 36
    .line 37
    const-wide/16 v3, 0x0

    .line 38
    .line 39
    move-object v0, p0

    .line 40
    invoke-virtual/range {v0 .. v6}, Lx4/a;->b(JJLcom/zykj/board/EzyCommandEnum$CommandEnum;Lkotlin/jvm/functions/Function0;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-virtual {v0, p0}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->g0(Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;)V

    .line 45
    .line 46
    .line 47
    return-object p0
.end method

.method public static final b0(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLjava/util/List;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
    .locals 7

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "$graphIdList"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lx4/a;->d()Lx4/e;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    const/4 v5, 0x2

    .line 18
    const/4 v6, 0x0

    .line 19
    const/4 v4, 0x0

    .line 20
    move-wide v2, p1

    .line 21
    invoke-static/range {v1 .. v6}, Lx4/b$a;->a(Lx4/b;JZILjava/lang/Object;)J

    .line 22
    .line 23
    .line 24
    move-result-wide p1

    .line 25
    :goto_0
    move-wide v1, p1

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    const-wide/16 p1, 0x0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :goto_1
    sget-object v5, Lcom/zykj/board/EzyCommandEnum$CommandEnum;->d:Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 31
    .line 32
    new-instance v6, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$removeGraphList$1$1;

    .line 33
    .line 34
    invoke-direct {v6, p3}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$removeGraphList$1$1;-><init>(Ljava/util/List;)V

    .line 35
    .line 36
    .line 37
    const-wide/16 v3, 0x0

    .line 38
    .line 39
    move-object v0, p0

    .line 40
    invoke-virtual/range {v0 .. v6}, Lx4/a;->b(JJLcom/zykj/board/EzyCommandEnum$CommandEnum;Lkotlin/jvm/functions/Function0;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-virtual {v0, p0}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->g0(Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;)V

    .line 45
    .line 46
    .line 47
    return-object p0
.end method

.method public static synthetic e(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JFFLjava/lang/String;ILjava/util/List;Lcom/zykj/board/EzyPaint$Paint;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p8}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->K(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JFFLjava/lang/String;ILjava/util/List;Lcom/zykj/board/EzyPaint$Paint;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    move-result-object p0

    return-object p0
.end method

.method public static final e0(JLcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
    .locals 11

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 7
    .line 8
    sget-object v9, Lcom/zykj/board/EzyCommandEnum$CommandEnum;->l:Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 9
    .line 10
    invoke-static {}, Lcom/google/protobuf/Any;->newBuilder()Lcom/google/protobuf/Any$Builder;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Lcom/google/protobuf/Any$Builder;->build()Lcom/google/protobuf/Any;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, Lcom/google/protobuf/AbstractMessageLite;->toByteArray()[B

    .line 19
    .line 20
    .line 21
    move-result-object v10

    .line 22
    const-string v0, "newBuilder().build().toByteArray()"

    .line 23
    .line 24
    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const-wide/16 v2, 0x0

    .line 28
    .line 29
    const-wide/16 v6, 0x0

    .line 30
    .line 31
    const/4 v8, 0x1

    .line 32
    move-wide v4, p0

    .line 33
    invoke-direct/range {v1 .. v10}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;-><init>(JJJZLcom/zykj/board/EzyCommandEnum$CommandEnum;[B)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p2, v1}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->g0(Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;)V

    .line 37
    .line 38
    .line 39
    return-object v1
.end method

.method public static synthetic f(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLcom/zykj/board/EzyGraphEnum$GraphEnum;Lcom/zykj/board/EzyRectF$RectF;Ljava/lang/String;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->E(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLcom/zykj/board/EzyGraphEnum$GraphEnum;Lcom/zykj/board/EzyRectF$RectF;Ljava/lang/String;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Ljava/util/List;Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLcom/zykj/board/EzyPaint$Paint;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->V(Ljava/util/List;Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLcom/zykj/board/EzyPaint$Paint;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Ljava/util/List;Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLjava/util/List;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->M(Ljava/util/List;Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLjava/util/List;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLcom/zykj/board/EzyGraphEnum$GraphEnum;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p9}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->G(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLcom/zykj/board/EzyGraphEnum$GraphEnum;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(JLcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->e0(JLcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JIILcom/zykj/blackboard/bean/BackgroundLineConfig;Lcom/zykj/blackboard/bean/BackgroundLineConfig;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p6}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->I(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JIILcom/zykj/blackboard/bean/BackgroundLineConfig;Lcom/zykj/blackboard/bean/BackgroundLineConfig;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLjava/lang/String;Lcom/zykj/board/EzyGraphEnum$GraphEnum;Lcom/zykj/board/EzyRectF$RectF;Ljava/lang/String;Lcom/zykj/board/EzyPaint$Paint;Ljava/util/List;Lcom/zykj/board/EzyMatrix$Matrix;Ljava/lang/String;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p10}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->R(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLjava/lang/String;Lcom/zykj/board/EzyGraphEnum$GraphEnum;Lcom/zykj/board/EzyRectF$RectF;Ljava/lang/String;Lcom/zykj/board/EzyPaint$Paint;Ljava/util/List;Lcom/zykj/board/EzyMatrix$Matrix;Ljava/lang/String;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLcom/zykj/board/EzyMatrix$Matrix;Lcom/zykj/board/EzyMatrix$Matrix;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->y(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLcom/zykj/board/EzyMatrix$Matrix;Lcom/zykj/board/EzyMatrix$Matrix;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLjava/util/List;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->b0(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLjava/util/List;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLq4/a;I)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->Y(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLq4/a;I)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p(Ljava/util/List;Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLjava/lang/String;Lcom/zykj/board/EzyGraphEnum$GraphEnum;Ljava/lang/String;Lcom/zykj/board/EzyPaint$Paint;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p7}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->F(Ljava/util/List;Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLjava/lang/String;Lcom/zykj/board/EzyGraphEnum$GraphEnum;Ljava/lang/String;Lcom/zykj/board/EzyPaint$Paint;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic q(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JFFLjava/lang/String;Ljava/lang/String;Lcom/zykj/board/EzyPaint$Paint;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p7}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->O(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JFFLjava/lang/String;Ljava/lang/String;Lcom/zykj/board/EzyPaint$Paint;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic r(Ljava/util/List;Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLcom/zykj/board/EzyMatrix$Matrix;Lcom/zykj/board/EzyMatrix$Matrix;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->A(Ljava/util/List;Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLcom/zykj/board/EzyMatrix$Matrix;Lcom/zykj/board/EzyMatrix$Matrix;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic s(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;)Ly4/o;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->g:Ly4/o;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic t(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;)Ly4/p;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->j:Ly4/p;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic u(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;)Ly4/q;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->f:Ly4/q;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic v(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;)Ly4/r;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->i:Ly4/r;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic w(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;)Ly4/s;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->e:Ly4/s;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final y(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLcom/zykj/board/EzyMatrix$Matrix;Lcom/zykj/board/EzyMatrix$Matrix;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
    .locals 7

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "$originMatrix"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "$lastMatrix"

    .line 12
    .line 13
    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lx4/a;->d()Lx4/e;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    const/4 v5, 0x2

    .line 23
    const/4 v6, 0x0

    .line 24
    const/4 v4, 0x0

    .line 25
    move-wide v2, p1

    .line 26
    invoke-static/range {v1 .. v6}, Lx4/b$a;->a(Lx4/b;JZILjava/lang/Object;)J

    .line 27
    .line 28
    .line 29
    move-result-wide p1

    .line 30
    :goto_0
    move-wide v1, p1

    .line 31
    goto :goto_1

    .line 32
    :cond_0
    const-wide/16 p1, 0x0

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :goto_1
    sget-object v5, Lcom/zykj/board/EzyCommandEnum$CommandEnum;->i:Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 36
    .line 37
    new-instance v6, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addCamera$1$1;

    .line 38
    .line 39
    invoke-direct {v6, p3, p4}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addCamera$1$1;-><init>(Lcom/zykj/board/EzyMatrix$Matrix;Lcom/zykj/board/EzyMatrix$Matrix;)V

    .line 40
    .line 41
    .line 42
    const-wide/16 v3, 0x0

    .line 43
    .line 44
    move-object v0, p0

    .line 45
    invoke-virtual/range {v0 .. v6}, Lx4/a;->b(JJLcom/zykj/board/EzyCommandEnum$CommandEnum;Lkotlin/jvm/functions/Function0;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-virtual {v0, p0}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->g0(Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;)V

    .line 50
    .line 51
    .line 52
    return-object p0
.end method


# virtual methods
.method public final B(Ljava/lang/String;Lcom/zykj/board/EzyGraphEnum$GraphEnum;Lcom/zykj/board/EzyRectF$RectF;J)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
    .locals 8

    .line 1
    const-string v0, "parentGraphId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "graphType"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "rectF"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->k:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 17
    .line 18
    new-instance v1, Ly4/d;

    .line 19
    .line 20
    move-object v2, p0

    .line 21
    move-object v7, p1

    .line 22
    move-object v5, p2

    .line 23
    move-object v6, p3

    .line 24
    move-wide v3, p4

    .line 25
    invoke-direct/range {v1 .. v7}, Ly4/d;-><init>(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLcom/zykj/board/EzyGraphEnum$GraphEnum;Lcom/zykj/board/EzyRectF$RectF;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/util/concurrent/AbstractExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    const-string p2, "service.submit<CommandIn\u2026        }\n        }.get()"

    .line 37
    .line 38
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 42
    .line 43
    return-object p1
.end method

.method public final C(Ljava/lang/String;Lcom/zykj/board/EzyGraphEnum$GraphEnum;Ljava/util/List;Lcom/zykj/board/EzyPaint$Paint;Ljava/lang/String;J)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
    .locals 10

    .line 1
    const-string v0, "parentGraphId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "graphType"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "eventList"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "paint"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "graphId"

    .line 22
    .line 23
    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->k:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 27
    .line 28
    new-instance v1, Ly4/e;

    .line 29
    .line 30
    move-object v3, p0

    .line 31
    move-object v8, p1

    .line 32
    move-object v7, p2

    .line 33
    move-object v2, p3

    .line 34
    move-object v9, p4

    .line 35
    move-object v6, p5

    .line 36
    move-wide/from16 v4, p6

    .line 37
    .line 38
    invoke-direct/range {v1 .. v9}, Ly4/e;-><init>(Ljava/util/List;Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLjava/lang/String;Lcom/zykj/board/EzyGraphEnum$GraphEnum;Ljava/lang/String;Lcom/zykj/board/EzyPaint$Paint;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v1}, Ljava/util/concurrent/AbstractExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 50
    .line 51
    return-object p1
.end method

.method public final D(Ljava/lang/String;Ljava/lang/String;Lcom/zykj/board/EzyGraphEnum$GraphEnum;Ljava/lang/String;IIJZ)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
    .locals 12

    .line 1
    const-string v0, "parentGraphId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "fileName"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "graphType"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "validate"

    .line 17
    .line 18
    move-object/from16 v10, p4

    .line 19
    .line 20
    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->k:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 24
    .line 25
    new-instance v1, Ly4/b;

    .line 26
    .line 27
    move-object v2, p0

    .line 28
    move-object v8, p1

    .line 29
    move-object v9, p2

    .line 30
    move-object v5, p3

    .line 31
    move/from16 v6, p5

    .line 32
    .line 33
    move/from16 v7, p6

    .line 34
    .line 35
    move-wide/from16 v3, p7

    .line 36
    .line 37
    move/from16 v11, p9

    .line 38
    .line 39
    invoke-direct/range {v1 .. v11}, Ly4/b;-><init>(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLcom/zykj/board/EzyGraphEnum$GraphEnum;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/util/concurrent/AbstractExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    const-string p2, "service.submit<CommandIn\u2026        }\n        }.get()"

    .line 51
    .line 52
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 56
    .line 57
    return-object p1
.end method

.method public final H(IILcom/zykj/blackboard/bean/BackgroundLineConfig;Lcom/zykj/blackboard/bean/BackgroundLineConfig;J)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
    .locals 9

    .line 1
    const-string v0, "originBackgroundLineConfig"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "lastBackgroundLineConfig"

    .line 7
    .line 8
    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->k:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 12
    .line 13
    new-instance v1, Ly4/g;

    .line 14
    .line 15
    move-object v2, p0

    .line 16
    move v5, p1

    .line 17
    move v6, p2

    .line 18
    move-object v7, p3

    .line 19
    move-object v8, p4

    .line 20
    move-wide v3, p5

    .line 21
    invoke-direct/range {v1 .. v8}, Ly4/g;-><init>(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JIILcom/zykj/blackboard/bean/BackgroundLineConfig;Lcom/zykj/blackboard/bean/BackgroundLineConfig;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/util/concurrent/AbstractExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    const-string p2, "service.submit<CommandIn\u2026        }\n        }.get()"

    .line 33
    .line 34
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 38
    .line 39
    return-object p1
.end method

.method public final J(Ljava/lang/String;FFILjava/util/List;Lcom/zykj/board/EzyPaint$Paint;J)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
    .locals 11

    .line 1
    const-string v0, "parentGraphId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "pointList"

    .line 7
    .line 8
    move-object/from16 v9, p5

    .line 9
    .line 10
    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const-string v0, "paint"

    .line 14
    .line 15
    move-object/from16 v10, p6

    .line 16
    .line 17
    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->k:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 21
    .line 22
    new-instance v1, Ly4/f;

    .line 23
    .line 24
    move-object v2, p0

    .line 25
    move-object v7, p1

    .line 26
    move v5, p2

    .line 27
    move v6, p3

    .line 28
    move v8, p4

    .line 29
    move-wide/from16 v3, p7

    .line 30
    .line 31
    invoke-direct/range {v1 .. v10}, Ly4/f;-><init>(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JFFLjava/lang/String;ILjava/util/List;Lcom/zykj/board/EzyPaint$Paint;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/util/concurrent/AbstractExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    const-string p2, "service.submit<CommandIn\u2026        }\n        }.get()"

    .line 43
    .line 44
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 48
    .line 49
    return-object p1
.end method

.method public final L(Ljava/util/List;Ljava/util/List;J)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
    .locals 7

    .line 1
    const-string v0, "graphIdList"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "matrixList"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->k:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 12
    .line 13
    new-instance v1, Ly4/i;

    .line 14
    .line 15
    move-object v3, p0

    .line 16
    move-object v6, p1

    .line 17
    move-object v2, p2

    .line 18
    move-wide v4, p3

    .line 19
    invoke-direct/range {v1 .. v6}, Ly4/i;-><init>(Ljava/util/List;Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLjava/util/List;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/util/concurrent/AbstractExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 31
    .line 32
    return-object p1
.end method

.method public final N(Ljava/lang/String;FFLcom/zykj/board/EzyPaint$Paint;Ljava/lang/String;J)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
    .locals 10

    .line 1
    const-string v0, "parentGraphId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "paint"

    .line 7
    .line 8
    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "content"

    .line 12
    .line 13
    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->k:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 17
    .line 18
    new-instance v1, Ly4/j;

    .line 19
    .line 20
    move-object v2, p0

    .line 21
    move-object v7, p1

    .line 22
    move v5, p2

    .line 23
    move v6, p3

    .line 24
    move-object v9, p4

    .line 25
    move-object v8, p5

    .line 26
    move-wide/from16 v3, p6

    .line 27
    .line 28
    invoke-direct/range {v1 .. v9}, Ly4/j;-><init>(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JFFLjava/lang/String;Ljava/lang/String;Lcom/zykj/board/EzyPaint$Paint;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/util/concurrent/AbstractExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    const-string p2, "service.submit<CommandIn\u2026        }\n        }.get()"

    .line 40
    .line 41
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 45
    .line 46
    return-object p1
.end method

.method public final P()Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->c:Lcom/zykj/blackboard/core/data/dao/RecordEntity;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v1, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;

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
    const-string v3, "_command.bin"

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
    invoke-direct {v1, v4, v5, v2, v3}, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;-><init>(JLjava/lang/String;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->b()Lio/objectbox/relation/ToMany;

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

.method public final Q(Ljava/lang/String;Lcom/zykj/board/EzyGraphEnum$GraphEnum;Lcom/zykj/board/EzyRectF$RectF;Ljava/lang/String;Lcom/zykj/board/EzyPaint$Paint;Ljava/util/List;Lcom/zykj/board/EzyMatrix$Matrix;Ljava/lang/String;J)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
    .locals 13

    .line 1
    const-string v0, "graphId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "graphEnum"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->k:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 12
    .line 13
    new-instance v1, Ly4/m;

    .line 14
    .line 15
    move-object v2, p0

    .line 16
    move-object v5, p1

    .line 17
    move-object v6, p2

    .line 18
    move-object/from16 v7, p3

    .line 19
    .line 20
    move-object/from16 v8, p4

    .line 21
    .line 22
    move-object/from16 v9, p5

    .line 23
    .line 24
    move-object/from16 v10, p6

    .line 25
    .line 26
    move-object/from16 v11, p7

    .line 27
    .line 28
    move-object/from16 v12, p8

    .line 29
    .line 30
    move-wide/from16 v3, p9

    .line 31
    .line 32
    invoke-direct/range {v1 .. v12}, Ly4/m;-><init>(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLjava/lang/String;Lcom/zykj/board/EzyGraphEnum$GraphEnum;Lcom/zykj/board/EzyRectF$RectF;Ljava/lang/String;Lcom/zykj/board/EzyPaint$Paint;Ljava/util/List;Lcom/zykj/board/EzyMatrix$Matrix;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/util/concurrent/AbstractExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    const-string p2, "service.submit<CommandIn\u2026        }\n        }.get()"

    .line 44
    .line 45
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 49
    .line 50
    return-object p1
.end method

.method public final T()Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->c:Lcom/zykj/blackboard/core/data/dao/RecordEntity;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->b()Lio/objectbox/relation/ToMany;

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
    check-cast v0, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;->a()Lio/objectbox/relation/ToMany;

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
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->P()Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    return-object v0
.end method

.method public final U(Ljava/util/List;Lcom/zykj/board/EzyPaint$Paint;J)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
    .locals 7

    .line 1
    const-string v0, "eventList"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "paint"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->k:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 12
    .line 13
    new-instance v1, Ly4/n;

    .line 14
    .line 15
    move-object v3, p0

    .line 16
    move-object v2, p1

    .line 17
    move-object v6, p2

    .line 18
    move-wide v4, p3

    .line 19
    invoke-direct/range {v1 .. v6}, Ly4/n;-><init>(Ljava/util/List;Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLcom/zykj/board/EzyPaint$Paint;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/util/concurrent/AbstractExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 31
    .line 32
    return-object p1
.end method

.method public final W(Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->h:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lc5/b;

    .line 18
    .line 19
    :try_start_0
    invoke-interface {v1, p1}, Lc5/b;->a(Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception v1

    .line 24
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    return-void
.end method

.method public final X(Lq4/a;IJ)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
    .locals 7

    .line 1
    const-string v0, "rootGraph"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->k:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 7
    .line 8
    new-instance v1, Ly4/k;

    .line 9
    .line 10
    move-object v2, p0

    .line 11
    move-object v5, p1

    .line 12
    move v6, p2

    .line 13
    move-wide v3, p3

    .line 14
    invoke-direct/range {v1 .. v6}, Ly4/k;-><init>(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLq4/a;I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/util/concurrent/AbstractExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    const-string p2, "service.submit<CommandIn\u2026        }\n        }.get()"

    .line 26
    .line 27
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 31
    .line 32
    return-object p1
.end method

.method public final Z(Lc5/b;)V
    .locals 1

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->h:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final a0(Ljava/util/List;J)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
    .locals 2

    .line 1
    const-string v0, "graphIdList"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->k:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 7
    .line 8
    new-instance v1, Ly4/c;

    .line 9
    .line 10
    invoke-direct {v1, p0, p2, p3, p1}, Ly4/c;-><init>(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLjava/util/List;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/util/concurrent/AbstractExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const-string p2, "service.submit<CommandIn\u2026        }\n        }.get()"

    .line 22
    .line 23
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 27
    .line 28
    return-object p1
.end method

.method public final c0(Lcom/zykj/blackboard/core/data/dao/RecordEntity;)V
    .locals 1

    .line 1
    const-string v0, "recordEntity"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->c:Lcom/zykj/blackboard/core/data/dao/RecordEntity;

    .line 7
    .line 8
    iget-object v0, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->e:Ly4/s;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Ly4/s;->i(Lcom/zykj/blackboard/core/data/dao/RecordEntity;)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->f:Ly4/q;

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Ly4/q;->i(Lcom/zykj/blackboard/core/data/dao/RecordEntity;)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->g:Ly4/o;

    .line 19
    .line 20
    invoke-virtual {v0, p1}, Ly4/o;->i(Lcom/zykj/blackboard/core/data/dao/RecordEntity;)V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->i:Ly4/r;

    .line 24
    .line 25
    invoke-virtual {v0, p1}, Ly4/r;->i(Lcom/zykj/blackboard/core/data/dao/RecordEntity;)V

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->j:Ly4/p;

    .line 29
    .line 30
    invoke-virtual {v0, p1}, Ly4/p;->i(Lcom/zykj/blackboard/core/data/dao/RecordEntity;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->T()Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iput-object p1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->d:Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;

    .line 38
    .line 39
    return-void
.end method

.method public final d0(J)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->k:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 2
    .line 3
    new-instance v1, Ly4/a;

    .line 4
    .line 5
    invoke-direct {v1, p1, p2, p0}, Ly4/a;-><init>(JLcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/util/concurrent/AbstractExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final f0(Lc5/b;)V
    .locals 1

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->h:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final g0(Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->d:Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;->f()Lio/objectbox/relation/ToOne;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1, v0}, Lio/objectbox/relation/ToOne;->t(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;->h()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;->a()Lio/objectbox/relation/ToMany;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v1, p1}, Lio/objectbox/relation/ToMany;->add(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;->e()V

    .line 23
    .line 24
    .line 25
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 28
    .line 29
    .line 30
    const-string v1, "CommandRecord:updateEntity -> "

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;->a()Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    invoke-direct {p0}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->S()V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->W(Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;)V

    .line 57
    .line 58
    .line 59
    return-void
.end method

.method public final x(Lcom/zykj/board/EzyMatrix$Matrix;Lcom/zykj/board/EzyMatrix$Matrix;J)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
    .locals 7

    .line 1
    const-string v0, "originMatrix"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "lastMatrix"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->k:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 12
    .line 13
    new-instance v1, Ly4/l;

    .line 14
    .line 15
    move-object v2, p0

    .line 16
    move-object v5, p1

    .line 17
    move-object v6, p2

    .line 18
    move-wide v3, p3

    .line 19
    invoke-direct/range {v1 .. v6}, Ly4/l;-><init>(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLcom/zykj/board/EzyMatrix$Matrix;Lcom/zykj/board/EzyMatrix$Matrix;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/util/concurrent/AbstractExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    const-string p2, "service.submit<CommandIn\u2026        }\n        }.get()"

    .line 31
    .line 32
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 36
    .line 37
    return-object p1
.end method

.method public final z(Lcom/zykj/board/EzyMatrix$Matrix;Lcom/zykj/board/EzyMatrix$Matrix;Ljava/util/List;J)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
    .locals 8

    .line 1
    const-string v0, "originMatrix"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "lastMatrix"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "matrixList"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->k:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 17
    .line 18
    new-instance v1, Ly4/h;

    .line 19
    .line 20
    move-object v3, p0

    .line 21
    move-object v7, p1

    .line 22
    move-object v6, p2

    .line 23
    move-object v2, p3

    .line 24
    move-wide v4, p4

    .line 25
    invoke-direct/range {v1 .. v7}, Ly4/h;-><init>(Ljava/util/List;Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLcom/zykj/board/EzyMatrix$Matrix;Lcom/zykj/board/EzyMatrix$Matrix;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/util/concurrent/AbstractExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 37
    .line 38
    return-object p1
.end method
