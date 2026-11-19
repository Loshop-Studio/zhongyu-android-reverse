.class public abstract Lw4/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw4/m;


# instance fields
.field public final a:Lw4/l;

.field public final b:Ll4/j;

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public final e:Lv4/a;

.field public final f:Lj4/a;

.field public final g:Lcom/zykj/blackboard/bean/BoardConfig;

.field public final h:Lk4/b;

.field public i:Lf4/d;

.field public final j:Lw4/h;

.field public final k:Lcom/zykj/blackboard/core/play/AudioCommandThread;

.field public l:Ljava/util/concurrent/ScheduledExecutorService;

.field public m:J

.field public n:I

.field public o:Lcom/zykj/blackboard/bean/BackgroundLineConfig;

.field public p:Lg4/a;

.field public final q:Lc5/h;

.field public final r:Ljava/util/concurrent/ExecutorService;


# direct methods
.method public constructor <init>(Lw4/l;Ll4/j;)V
    .locals 13

    .line 1
    const-string v0, "playControl"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "renderLayer"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lw4/f;->a:Lw4/l;

    .line 15
    .line 16
    iput-object p2, p0, Lw4/f;->b:Ll4/j;

    .line 17
    .line 18
    const-string p1, ""

    .line 19
    .line 20
    iput-object p1, p0, Lw4/f;->c:Ljava/lang/String;

    .line 21
    .line 22
    iput-object p1, p0, Lw4/f;->d:Ljava/lang/String;

    .line 23
    .line 24
    new-instance v4, Lv4/a;

    .line 25
    .line 26
    invoke-direct {v4}, Lv4/a;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object v4, p0, Lw4/f;->e:Lv4/a;

    .line 30
    .line 31
    new-instance v3, Lj4/a;

    .line 32
    .line 33
    invoke-direct {v3}, Lj4/a;-><init>()V

    .line 34
    .line 35
    .line 36
    iput-object v3, p0, Lw4/f;->f:Lj4/a;

    .line 37
    .line 38
    new-instance v2, Lcom/zykj/blackboard/bean/BoardConfig;

    .line 39
    .line 40
    invoke-virtual {p2}, Ll4/j;->e()Landroid/graphics/Rect;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    invoke-virtual {p2}, Ll4/j;->e()Landroid/graphics/Rect;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    invoke-direct {v2, p1, v0}, Lcom/zykj/blackboard/bean/BoardConfig;-><init>(II)V

    .line 57
    .line 58
    .line 59
    sget-object p1, Lcom/zykj/board/EzyModeEnum$ModeEnum;->h:Lcom/zykj/board/EzyModeEnum$ModeEnum;

    .line 60
    .line 61
    invoke-virtual {v2, p1}, Lcom/zykj/blackboard/bean/BoardConfig;->setMode(Lcom/zykj/board/EzyModeEnum$ModeEnum;)V

    .line 62
    .line 63
    .line 64
    iput-object v2, p0, Lw4/f;->g:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 65
    .line 66
    new-instance v1, Lk4/b;

    .line 67
    .line 68
    invoke-direct {v1, v3, p2, v2}, Lk4/b;-><init>(Lj4/a;Ll4/j;Lcom/zykj/blackboard/bean/BoardConfig;)V

    .line 69
    .line 70
    .line 71
    iput-object v1, p0, Lw4/f;->h:Lk4/b;

    .line 72
    .line 73
    new-instance p1, Lf4/d;

    .line 74
    .line 75
    invoke-direct {p1}, Lf4/d;-><init>()V

    .line 76
    .line 77
    .line 78
    iput-object p1, p0, Lw4/f;->i:Lf4/d;

    .line 79
    .line 80
    new-instance p1, Lw4/h;

    .line 81
    .line 82
    invoke-direct {p1}, Lw4/h;-><init>()V

    .line 83
    .line 84
    .line 85
    iput-object p1, p0, Lw4/f;->j:Lw4/h;

    .line 86
    .line 87
    new-instance p2, Lcom/zykj/blackboard/core/play/AudioCommandThread;

    .line 88
    .line 89
    invoke-direct {p2}, Lcom/zykj/blackboard/core/play/AudioCommandThread;-><init>()V

    .line 90
    .line 91
    .line 92
    iput-object p2, p0, Lw4/f;->k:Lcom/zykj/blackboard/core/play/AudioCommandThread;

    .line 93
    .line 94
    const/4 v0, 0x1

    .line 95
    invoke-static {v0}, Ljava/util/concurrent/Executors;->newScheduledThreadPool(I)Ljava/util/concurrent/ScheduledExecutorService;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    const-string v5, "newScheduledThreadPool(1)"

    .line 100
    .line 101
    invoke-static {v0, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    iput-object v0, p0, Lw4/f;->l:Ljava/util/concurrent/ScheduledExecutorService;

    .line 105
    .line 106
    new-instance v6, Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    .line 107
    .line 108
    const/16 v11, 0xf

    .line 109
    .line 110
    const/4 v12, 0x0

    .line 111
    const/4 v7, 0x0

    .line 112
    const/4 v8, 0x0

    .line 113
    const/4 v9, 0x0

    .line 114
    const/4 v10, 0x0

    .line 115
    invoke-direct/range {v6 .. v12}, Lcom/zykj/blackboard/bean/BackgroundLineConfig;-><init>(IFLcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 116
    .line 117
    .line 118
    iput-object v6, p0, Lw4/f;->o:Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    .line 119
    .line 120
    new-instance v0, Lg4/a;

    .line 121
    .line 122
    const/16 v7, 0x30

    .line 123
    .line 124
    const/4 v8, 0x0

    .line 125
    const/4 v5, 0x0

    .line 126
    const/4 v6, 0x0

    .line 127
    invoke-direct/range {v0 .. v8}, Lg4/a;-><init>(Lk4/b;Lcom/zykj/blackboard/bean/BoardConfig;Lj4/a;Lv4/d;Lx4/c;Ln4/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 128
    .line 129
    .line 130
    iput-object v0, p0, Lw4/f;->p:Lg4/a;

    .line 131
    .line 132
    iget-object v0, p0, Lw4/f;->i:Lf4/d;

    .line 133
    .line 134
    invoke-virtual {p1, v0}, Lo4/e;->p(Lf4/d;)V

    .line 135
    .line 136
    .line 137
    iget-object p1, p0, Lw4/f;->i:Lf4/d;

    .line 138
    .line 139
    invoke-virtual {p2, p1}, Lo4/e;->p(Lf4/d;)V

    .line 140
    .line 141
    .line 142
    new-instance p1, Lw4/f$a;

    .line 143
    .line 144
    invoke-direct {p1, p0}, Lw4/f$a;-><init>(Lw4/f;)V

    .line 145
    .line 146
    .line 147
    iput-object p1, p0, Lw4/f;->q:Lc5/h;

    .line 148
    .line 149
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    iput-object p1, p0, Lw4/f;->r:Ljava/util/concurrent/ExecutorService;

    .line 154
    .line 155
    return-void
.end method

.method public static synthetic i(Lw4/f;Lkotlin/jvm/functions/Function0;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lw4/f;->w(Lw4/f;Lkotlin/jvm/functions/Function0;)V

    return-void
.end method

.method public static final synthetic j(Lw4/f;Z)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lw4/f;->v(Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final w(Lw4/f;Lkotlin/jvm/functions/Function0;)V
    .locals 5

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "$callBack"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    const-string v1, "playThread = "

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string v1, " show"

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 42
    .line 43
    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    sget-object v0, Le5/k;->a:Le5/k;

    .line 47
    .line 48
    new-instance v1, Ljava/io/File;

    .line 49
    .line 50
    iget-object v2, p0, Lw4/f;->c:Ljava/lang/String;

    .line 51
    .line 52
    const-string v3, "snapshot.bin"

    .line 53
    .line 54
    invoke-direct {v1, v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    const-string v2, "File(mPageDirPath, BaseP\u2026T_FILE_NAME).absolutePath"

    .line 62
    .line 63
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, v1}, Le5/k;->e(Ljava/lang/String;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    if-eqz v1, :cond_0

    .line 71
    .line 72
    iget-object v2, p0, Lw4/f;->f:Lj4/a;

    .line 73
    .line 74
    invoke-virtual {v1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;->m()Lcom/zykj/board/EzyMatrix$Matrix;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    const-string v4, "this.cameraMatrix"

    .line 79
    .line 80
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    invoke-static {v3}, Le5/m;->d(Lcom/zykj/board/EzyMatrix$Matrix;)Landroid/graphics/Matrix;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    invoke-virtual {v2, v3}, Lj4/a;->j(Landroid/graphics/Matrix;)V

    .line 88
    .line 89
    .line 90
    iget-object v2, p0, Lw4/f;->e:Lv4/a;

    .line 91
    .line 92
    invoke-virtual {v1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;->r()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    const-string v3, "this.graphSnapshot"

    .line 97
    .line 98
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0, v2, v1}, Le5/k;->a(Lv4/d;Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;)Lq4/a;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    if-eqz v0, :cond_0

    .line 106
    .line 107
    iget-object v1, p0, Lw4/f;->h:Lk4/b;

    .line 108
    .line 109
    invoke-virtual {v1, v0}, Lk4/b;->p(Lq4/c;)V

    .line 110
    .line 111
    .line 112
    :cond_0
    iget-object v0, p0, Lw4/f;->h:Lk4/b;

    .line 113
    .line 114
    iget v1, p0, Lw4/f;->n:I

    .line 115
    .line 116
    invoke-virtual {v0, v1}, Lk4/b;->c(I)V

    .line 117
    .line 118
    .line 119
    iget-object v0, p0, Lw4/f;->h:Lk4/b;

    .line 120
    .line 121
    iget-object v1, p0, Lw4/f;->o:Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    .line 122
    .line 123
    invoke-virtual {v0, v1}, Lk4/b;->t(Lcom/zykj/blackboard/bean/BackgroundLineConfig;)V

    .line 124
    .line 125
    .line 126
    iget-object v0, p0, Lw4/f;->h:Lk4/b;

    .line 127
    .line 128
    invoke-virtual {v0}, Lk4/b;->V()V

    .line 129
    .line 130
    .line 131
    iget-object p0, p0, Lw4/f;->h:Lk4/b;

    .line 132
    .line 133
    invoke-virtual {p0}, Lk4/b;->e()V

    .line 134
    .line 135
    .line 136
    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    return-void
.end method


# virtual methods
.method public b(Lkotlin/jvm/functions/Function0;)V
    .locals 2

    .line 1
    const-string v0, "callBack"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lw4/f;->r:Ljava/util/concurrent/ExecutorService;

    .line 7
    .line 8
    new-instance v1, Lw4/e;

    .line 9
    .line 10
    invoke-direct {v1, p0, p1}, Lw4/e;-><init>(Lw4/f;Lkotlin/jvm/functions/Function0;)V

    .line 11
    .line 12
    .line 13
    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public f(Lc5/h;)V
    .locals 1

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lw4/f;->j:Lw4/h;

    .line 7
    .line 8
    invoke-virtual {v0}, Lo4/e;->d()Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public h(Ljava/lang/String;)V
    .locals 13

    .line 1
    const-string v0, "pageName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/io/File;

    .line 7
    .line 8
    iget-object v1, p0, Lw4/f;->a:Lw4/l;

    .line 9
    .line 10
    invoke-interface {v1}, Lw4/l;->b()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-direct {v0, v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const-string v1, "File(playControl.getRoot\u2026), pageName).absolutePath"

    .line 22
    .line 23
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, Lw4/f;->c:Ljava/lang/String;

    .line 27
    .line 28
    iput-object p1, p0, Lw4/f;->d:Ljava/lang/String;

    .line 29
    .line 30
    iget-object p1, p0, Lw4/f;->e:Lv4/a;

    .line 31
    .line 32
    invoke-virtual {p1, v0}, Lv4/a;->g(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    sget-object p1, Lm4/b;->a:Lm4/b;

    .line 36
    .line 37
    iget-object v0, p0, Lw4/f;->c:Ljava/lang/String;

    .line 38
    .line 39
    invoke-virtual {p1, v0}, Lm4/b;->i(Ljava/lang/String;)Lcom/zykj/board/EzyHeader$Header;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Header;->getVersion()I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    const-string v1, " supportLastVersion=6"

    .line 48
    .line 49
    const-string v2, "version="

    .line 50
    .line 51
    const/4 v3, 0x6

    .line 52
    if-gt v0, v3, :cond_4

    .line 53
    .line 54
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Header;->getVersion()I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-lt v0, v3, :cond_3

    .line 59
    .line 60
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Header;->I()J

    .line 61
    .line 62
    .line 63
    move-result-wide v0

    .line 64
    iput-wide v0, p0, Lw4/f;->m:J

    .line 65
    .line 66
    iget-object v0, p0, Lw4/f;->p:Lg4/a;

    .line 67
    .line 68
    invoke-virtual {v0}, Lg4/a;->s()Lg4/c;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    instance-of v1, v0, Lg4/d;

    .line 73
    .line 74
    const/4 v2, 0x0

    .line 75
    const/4 v3, 0x1

    .line 76
    const-wide/16 v4, 0x0

    .line 77
    .line 78
    if-eqz v1, :cond_1

    .line 79
    .line 80
    check-cast v0, Lg4/d;

    .line 81
    .line 82
    iget-wide v6, p0, Lw4/f;->m:J

    .line 83
    .line 84
    cmp-long v1, v6, v4

    .line 85
    .line 86
    if-lez v1, :cond_0

    .line 87
    .line 88
    move v1, v3

    .line 89
    goto :goto_0

    .line 90
    :cond_0
    move v1, v2

    .line 91
    :goto_0
    invoke-virtual {v0, v1}, Lg4/d;->K(Z)V

    .line 92
    .line 93
    .line 94
    :cond_1
    iget-object v0, p0, Lw4/f;->b:Ll4/j;

    .line 95
    .line 96
    invoke-virtual {v0}, Ll4/j;->e()Landroid/graphics/Rect;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    iget-object v1, p0, Lw4/f;->f:Lj4/a;

    .line 101
    .line 102
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Header;->getWidth()I

    .line 103
    .line 104
    .line 105
    move-result v6

    .line 106
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Header;->getHeight()I

    .line 107
    .line 108
    .line 109
    move-result v7

    .line 110
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 111
    .line 112
    .line 113
    move-result v8

    .line 114
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    .line 115
    .line 116
    .line 117
    move-result v9

    .line 118
    iget-wide v10, p0, Lw4/f;->m:J

    .line 119
    .line 120
    cmp-long v0, v10, v4

    .line 121
    .line 122
    if-lez v0, :cond_2

    .line 123
    .line 124
    move v10, v3

    .line 125
    goto :goto_1

    .line 126
    :cond_2
    move v10, v2

    .line 127
    :goto_1
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Header;->L()Lcom/zykj/board/EzyHeader$MoveConfig;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    invoke-virtual {v0}, Lcom/zykj/board/EzyHeader$MoveConfig;->w()I

    .line 132
    .line 133
    .line 134
    move-result v11

    .line 135
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Header;->L()Lcom/zykj/board/EzyHeader$MoveConfig;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    invoke-virtual {v0}, Lcom/zykj/board/EzyHeader$MoveConfig;->v()I

    .line 140
    .line 141
    .line 142
    move-result v12

    .line 143
    invoke-static/range {v6 .. v12}, Ln4/j;->b(IIIIZII)Landroid/graphics/Matrix;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    invoke-virtual {v1, v0}, Lj4/a;->k(Landroid/graphics/Matrix;)V

    .line 148
    .line 149
    .line 150
    iget-object v0, p0, Lw4/f;->j:Lw4/h;

    .line 151
    .line 152
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Header;->getVersion()I

    .line 153
    .line 154
    .line 155
    move-result v1

    .line 156
    invoke-virtual {v0, v1}, Lw4/h;->F(I)V

    .line 157
    .line 158
    .line 159
    iget-object v0, p0, Lw4/f;->h:Lk4/b;

    .line 160
    .line 161
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Header;->E()I

    .line 162
    .line 163
    .line 164
    move-result v1

    .line 165
    invoke-virtual {v0, v1}, Lk4/b;->Q(I)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Header;->J()I

    .line 169
    .line 170
    .line 171
    move-result v0

    .line 172
    iput v0, p0, Lw4/f;->n:I

    .line 173
    .line 174
    iget-object v0, p0, Lw4/f;->h:Lk4/b;

    .line 175
    .line 176
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Header;->F()Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 177
    .line 178
    .line 179
    move-result-object v1

    .line 180
    const-string v2, "header.defaultBackgroundLineConfig"

    .line 181
    .line 182
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    invoke-static {v1}, Le5/f;->c(Lcom/zykj/board/EzyHeader$BackgroundLineConfig;)Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    .line 186
    .line 187
    .line 188
    move-result-object v1

    .line 189
    invoke-virtual {v0, v1}, Lk4/b;->R(Lcom/zykj/blackboard/bean/BackgroundLineConfig;)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Header;->K()Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    const-string v1, "header.lastBackgroundLineConfig"

    .line 197
    .line 198
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    invoke-static {v0}, Le5/f;->c(Lcom/zykj/board/EzyHeader$BackgroundLineConfig;)Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    iput-object v0, p0, Lw4/f;->o:Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    .line 206
    .line 207
    iget-object v0, p0, Lw4/f;->p:Lg4/a;

    .line 208
    .line 209
    invoke-virtual {v0}, Lg4/a;->k()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    invoke-virtual {v0}, Lcom/zykj/blackboard/bean/BoardConfig;->getMoveActionConfig()Lf4/c;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Header;->L()Lcom/zykj/board/EzyHeader$MoveConfig;

    .line 218
    .line 219
    .line 220
    move-result-object v1

    .line 221
    const-string v2, "header.moveConfig"

    .line 222
    .line 223
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {p0, v0, v1}, Lw4/f;->k(Lf4/c;Lcom/zykj/board/EzyHeader$MoveConfig;)V

    .line 227
    .line 228
    .line 229
    iget-object v0, p0, Lw4/f;->h:Lk4/b;

    .line 230
    .line 231
    new-instance v1, Landroid/graphics/RectF;

    .line 232
    .line 233
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Header;->getWidth()I

    .line 234
    .line 235
    .line 236
    move-result v2

    .line 237
    int-to-float v2, v2

    .line 238
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Header;->getHeight()I

    .line 239
    .line 240
    .line 241
    move-result p1

    .line 242
    int-to-float p1, p1

    .line 243
    const/4 v3, 0x0

    .line 244
    invoke-direct {v1, v3, v3, v2, p1}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {v0, v1}, Lk4/b;->T(Landroid/graphics/RectF;)V

    .line 248
    .line 249
    .line 250
    return-void

    .line 251
    :cond_3
    new-instance v0, Lcom/zykj/blackboard/exception/LowVersionException;

    .line 252
    .line 253
    new-instance v3, Ljava/lang/StringBuilder;

    .line 254
    .line 255
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 256
    .line 257
    .line 258
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 259
    .line 260
    .line 261
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Header;->getVersion()I

    .line 262
    .line 263
    .line 264
    move-result p1

    .line 265
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 266
    .line 267
    .line 268
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 269
    .line 270
    .line 271
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object p1

    .line 275
    invoke-direct {v0, p1}, Lcom/zykj/blackboard/exception/LowVersionException;-><init>(Ljava/lang/String;)V

    .line 276
    .line 277
    .line 278
    throw v0

    .line 279
    :cond_4
    new-instance v0, Lcom/zykj/blackboard/exception/HighVersionException;

    .line 280
    .line 281
    new-instance v3, Ljava/lang/StringBuilder;

    .line 282
    .line 283
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 284
    .line 285
    .line 286
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 287
    .line 288
    .line 289
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Header;->getVersion()I

    .line 290
    .line 291
    .line 292
    move-result p1

    .line 293
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 294
    .line 295
    .line 296
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 297
    .line 298
    .line 299
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object p1

    .line 303
    invoke-direct {v0, p1}, Lcom/zykj/blackboard/exception/HighVersionException;-><init>(Ljava/lang/String;)V

    .line 304
    .line 305
    .line 306
    throw v0
.end method

.method public hide()V
    .locals 1

    .line 1
    iget-object v0, p0, Lw4/f;->h:Lk4/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lk4/b;->M()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final k(Lf4/c;Lcom/zykj/board/EzyHeader$MoveConfig;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Lcom/zykj/board/EzyHeader$MoveConfig;->u()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1, v0}, Lf4/c;->l(Z)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p2}, Lcom/zykj/board/EzyHeader$MoveConfig;->z()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-virtual {p1, v0}, Lf4/c;->o(Z)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p2}, Lcom/zykj/board/EzyHeader$MoveConfig;->t()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    invoke-virtual {p1, v0}, Lf4/c;->i(Z)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p2}, Lcom/zykj/board/EzyHeader$MoveConfig;->y()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    invoke-virtual {p1, v0}, Lf4/c;->n(Z)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p2}, Lcom/zykj/board/EzyHeader$MoveConfig;->x()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    invoke-virtual {p1, v0}, Lf4/c;->m(Z)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p2}, Lcom/zykj/board/EzyHeader$MoveConfig;->w()I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    invoke-virtual {p1, v0}, Lf4/c;->k(I)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p2}, Lcom/zykj/board/EzyHeader$MoveConfig;->v()I

    .line 44
    .line 45
    .line 46
    move-result p2

    .line 47
    invoke-virtual {p1, p2}, Lf4/c;->j(I)V

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public final l()Lg4/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lw4/f;->p:Lg4/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final m()Lcom/zykj/blackboard/core/play/AudioCommandThread;
    .locals 1

    .line 1
    iget-object v0, p0, Lw4/f;->k:Lcom/zykj/blackboard/core/play/AudioCommandThread;

    .line 2
    .line 3
    return-object v0
.end method

.method public final n()Lv4/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lw4/f;->e:Lv4/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final o()Lw4/h;
    .locals 1

    .line 1
    iget-object v0, p0, Lw4/f;->j:Lw4/h;

    .line 2
    .line 3
    return-object v0
.end method

.method public final p()Lk4/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lw4/f;->h:Lk4/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public final q()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lw4/f;->c:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final r()Lj4/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lw4/f;->f:Lj4/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public release()V
    .locals 1

    .line 1
    iget-object v0, p0, Lw4/f;->l:Ljava/util/concurrent/ScheduledExecutorService;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lw4/f;->l:Ljava/util/concurrent/ScheduledExecutorService;

    .line 10
    .line 11
    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 12
    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, Lw4/f;->j:Lw4/h;

    .line 15
    .line 16
    invoke-virtual {v0}, Lw4/h;->s()V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lw4/f;->k:Lcom/zykj/blackboard/core/play/AudioCommandThread;

    .line 20
    .line 21
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/play/AudioCommandThread;->s()V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lw4/f;->h:Lk4/b;

    .line 25
    .line 26
    invoke-virtual {v0}, Lk4/b;->M()V

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Lw4/f;->e:Lv4/a;

    .line 30
    .line 31
    invoke-virtual {v0}, Lv4/a;->h()V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public final s()Lf4/d;
    .locals 1

    .line 1
    iget-object v0, p0, Lw4/f;->i:Lf4/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public status()Lcom/zykj/blackboard/enums/PlayStatus;
    .locals 1

    .line 1
    iget-object v0, p0, Lw4/f;->j:Lw4/h;

    .line 2
    .line 3
    invoke-virtual {v0}, Lo4/e;->h()Lcom/zykj/blackboard/enums/PlayStatus;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final t()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lw4/f;->m:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final u()V
    .locals 11

    .line 1
    iget-object v0, p0, Lw4/f;->l:Ljava/util/concurrent/ScheduledExecutorService;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x2

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-static {v1}, Ljava/util/concurrent/Executors;->newScheduledThreadPool(I)Ljava/util/concurrent/ScheduledExecutorService;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const-string v1, "{\n            Executors.\u2026edThreadPool(2)\n        }"

    .line 15
    .line 16
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    :goto_0
    move-object v2, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    iget-object v0, p0, Lw4/f;->l:Ljava/util/concurrent/ScheduledExecutorService;

    .line 22
    .line 23
    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 24
    .line 25
    .line 26
    invoke-static {v1}, Ljava/util/concurrent/Executors;->newScheduledThreadPool(I)Ljava/util/concurrent/ScheduledExecutorService;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    const-string v1, "{\n            execute.sh\u2026edThreadPool(2)\n        }"

    .line 31
    .line 32
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :goto_1
    iput-object v2, p0, Lw4/f;->l:Ljava/util/concurrent/ScheduledExecutorService;

    .line 37
    .line 38
    iget-object v3, p0, Lw4/f;->j:Lw4/h;

    .line 39
    .line 40
    sget-object v8, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 41
    .line 42
    const-wide/16 v4, 0x0

    .line 43
    .line 44
    const-wide/16 v6, 0x10

    .line 45
    .line 46
    invoke-interface/range {v2 .. v8}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleAtFixedRate(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 47
    .line 48
    .line 49
    iget-object v4, p0, Lw4/f;->l:Ljava/util/concurrent/ScheduledExecutorService;

    .line 50
    .line 51
    iget-object v5, p0, Lw4/f;->k:Lcom/zykj/blackboard/core/play/AudioCommandThread;

    .line 52
    .line 53
    const-wide/16 v6, 0x0

    .line 54
    .line 55
    move-object v10, v8

    .line 56
    const-wide/16 v8, 0x10

    .line 57
    .line 58
    invoke-interface/range {v4 .. v10}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleAtFixedRate(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method public final v(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lw4/f;->p:Lg4/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lg4/a;->s()Lg4/c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    instance-of v1, v0, Lg4/d;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    check-cast v0, Lg4/d;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Lg4/d;->K(Z)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method
