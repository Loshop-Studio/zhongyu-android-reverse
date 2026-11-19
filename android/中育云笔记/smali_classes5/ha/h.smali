.class public final Lha/h;
.super Lz9/e;
.source "SourceFile"


# instance fields
.field public j:J

.field public k:J

.field public l:Ljava/util/ListIterator;

.field public m:Ljava/lang/String;

.field public n:Ljava/util/ListIterator;

.field public final o:Ljava/util/concurrent/ExecutorService;

.field public p:Ljava/util/List;

.field public q:J

.field public r:Lz9/a;

.field public s:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lz9/e;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, ""

    .line 5
    .line 6
    iput-object v0, p0, Lha/h;->m:Ljava/lang/String;

    .line 7
    .line 8
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iput-object v0, p0, Lha/h;->o:Ljava/util/concurrent/ExecutorService;

    .line 13
    .line 14
    new-instance v0, Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lha/h;->p:Ljava/util/List;

    .line 20
    .line 21
    const/4 v0, -0x1

    .line 22
    iput v0, p0, Lha/h;->s:I

    .line 23
    .line 24
    return-void
.end method

.method private final A()Z
    .locals 5

    .line 1
    iget-object v0, p0, Lha/h;->n:Ljava/util/ListIterator;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-interface {v0}, Ljava/util/ListIterator;->hasNext()Z

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    invoke-interface {v0}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;

    .line 17
    .line 18
    new-instance v1, Ljava/io/File;

    .line 19
    .line 20
    iget-object v2, p0, Lha/h;->m:Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {v0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;->getFileName()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-direct {v1, v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    new-instance v2, Ljava/io/FileInputStream;

    .line 30
    .line 31
    invoke-direct {v2, v1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 32
    .line 33
    .line 34
    invoke-static {v2}, Lcom/zykj/board/EzyCommand$CommandSource;->p(Ljava/io/InputStream;)Lcom/zykj/board/EzyCommand$CommandSource;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v1}, Lcom/zykj/board/EzyCommand$CommandSource;->f()Ljava/util/List;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-interface {v3}, Ljava/util/List;->listIterator()Ljava/util/ListIterator;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    iput-object v3, p0, Lha/h;->l:Ljava/util/ListIterator;

    .line 47
    .line 48
    new-instance v3, Ljava/lang/StringBuilder;

    .line 49
    .line 50
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 51
    .line 52
    .line 53
    const-string v4, "\u547d\u4ee4\u6587\u4ef6\u540d="

    .line 54
    .line 55
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;->getFileName()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    const-string v0, "  \u547d\u4ee4\u957f\u5ea6="

    .line 66
    .line 67
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1}, Lcom/zykj/board/EzyCommand$CommandSource;->f()Ljava/util/List;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 86
    .line 87
    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V

    .line 91
    .line 92
    .line 93
    const/4 v0, 0x1

    .line 94
    return v0

    .line 95
    :cond_0
    return v1
.end method

.method private final B(Ljava/util/ListIterator;)Z
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/ListIterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x1

    .line 10
    if-eqz v1, :cond_9

    .line 11
    .line 12
    invoke-interface {p1}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;

    .line 17
    .line 18
    invoke-virtual {v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->u()Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-eqz v3, :cond_7

    .line 23
    .line 24
    invoke-virtual {p0}, Lz9/e;->b()Lv9/c;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    if-eqz v3, :cond_2

    .line 29
    .line 30
    invoke-interface {v3}, Lv9/c;->I()Z

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    if-nez v3, :cond_2

    .line 35
    .line 36
    invoke-virtual {p0}, Lz9/e;->b()Lv9/c;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    if-eqz v3, :cond_1

    .line 41
    .line 42
    invoke-interface {v3, v2}, Lv9/c;->l(Z)V

    .line 43
    .line 44
    .line 45
    :cond_1
    invoke-virtual {p0}, Lz9/e;->b()Lv9/c;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    if-eqz v2, :cond_2

    .line 50
    .line 51
    invoke-interface {v2}, Lv9/c;->g()V

    .line 52
    .line 53
    .line 54
    :cond_2
    iget-wide v2, p0, Lha/h;->k:J

    .line 55
    .line 56
    invoke-virtual {v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->r()J

    .line 57
    .line 58
    .line 59
    move-result-wide v4

    .line 60
    cmp-long v2, v2, v4

    .line 61
    .line 62
    if-gez v2, :cond_4

    .line 63
    .line 64
    invoke-interface {p1}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    if-eqz v1, :cond_3

    .line 69
    .line 70
    invoke-interface {p1}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    :cond_3
    return v0

    .line 74
    :cond_4
    invoke-direct {p0, v1}, Lha/h;->z(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;)Z

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    if-eqz v2, :cond_5

    .line 79
    .line 80
    iget-object v2, p0, Lha/h;->r:Lz9/a;

    .line 81
    .line 82
    if-eqz v2, :cond_6

    .line 83
    .line 84
    iget-wide v3, p0, Lha/h;->k:J

    .line 85
    .line 86
    invoke-virtual {v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->r()J

    .line 87
    .line 88
    .line 89
    move-result-wide v5

    .line 90
    sub-long/2addr v3, v5

    .line 91
    invoke-virtual {v2, v1, v3, v4}, Lz9/a;->a(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;J)Lz9/e;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    if-eqz v2, :cond_6

    .line 96
    .line 97
    invoke-virtual {p0}, Lz9/e;->e()Lq9/e;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    invoke-virtual {v2, v3}, Lz9/e;->p(Lq9/e;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v2}, Lz9/e;->a()Ljava/util/List;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    new-instance v4, Lha/h$b;

    .line 109
    .line 110
    invoke-direct {v4, p0, v2, v1}, Lha/h$b;-><init>(Lha/h;Lz9/e;Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;)V

    .line 111
    .line 112
    .line 113
    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    invoke-virtual {v2}, Lz9/e;->t()V

    .line 117
    .line 118
    .line 119
    iget-object v3, p0, Lha/h;->p:Ljava/util/List;

    .line 120
    .line 121
    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    iget-object v3, p0, Lha/h;->o:Ljava/util/concurrent/ExecutorService;

    .line 125
    .line 126
    invoke-interface {v3, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 127
    .line 128
    .line 129
    goto :goto_1

    .line 130
    :cond_5
    iget-object v2, p0, Lha/h;->r:Lz9/a;

    .line 131
    .line 132
    if-eqz v2, :cond_6

    .line 133
    .line 134
    invoke-virtual {v2, v1}, Lz9/a;->b(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;)V

    .line 135
    .line 136
    .line 137
    :cond_6
    :goto_1
    iget-wide v2, p0, Lha/h;->k:J

    .line 138
    .line 139
    invoke-virtual {v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->r()J

    .line 140
    .line 141
    .line 142
    move-result-wide v4

    .line 143
    invoke-virtual {v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->t()J

    .line 144
    .line 145
    .line 146
    move-result-wide v6

    .line 147
    add-long/2addr v4, v6

    .line 148
    sub-long/2addr v2, v4

    .line 149
    iput-wide v2, p0, Lha/h;->k:J

    .line 150
    .line 151
    goto/16 :goto_0

    .line 152
    .line 153
    :cond_7
    invoke-virtual {p0}, Lz9/e;->b()Lv9/c;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    if-eqz v2, :cond_8

    .line 158
    .line 159
    invoke-interface {v2, v0}, Lv9/c;->l(Z)V

    .line 160
    .line 161
    .line 162
    :cond_8
    iget-object v2, p0, Lha/h;->r:Lz9/a;

    .line 163
    .line 164
    if-eqz v2, :cond_0

    .line 165
    .line 166
    invoke-virtual {v2, v1}, Lz9/a;->b(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;)V

    .line 167
    .line 168
    .line 169
    goto/16 :goto_0

    .line 170
    .line 171
    :cond_9
    return v2
.end method

.method public static final synthetic v(Lha/h;)Lz9/a;
    .locals 0

    .line 1
    iget-object p0, p0, Lha/h;->r:Lz9/a;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic w(Lha/h;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lha/h;->p:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method private final z(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;)Z
    .locals 8

    .line 1
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->t()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    cmp-long v0, v0, v2

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    return v1

    .line 13
    :cond_0
    iget-wide v2, p0, Lha/h;->k:J

    .line 14
    .line 15
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->r()J

    .line 16
    .line 17
    .line 18
    move-result-wide v4

    .line 19
    cmp-long v0, v2, v4

    .line 20
    .line 21
    if-ltz v0, :cond_1

    .line 22
    .line 23
    iget-wide v2, p0, Lha/h;->k:J

    .line 24
    .line 25
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->r()J

    .line 26
    .line 27
    .line 28
    move-result-wide v4

    .line 29
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->t()J

    .line 30
    .line 31
    .line 32
    move-result-wide v6

    .line 33
    add-long/2addr v4, v6

    .line 34
    cmp-long p1, v2, v4

    .line 35
    .line 36
    if-gez p1, :cond_1

    .line 37
    .line 38
    const/4 p1, 0x1

    .line 39
    return p1

    .line 40
    :cond_1
    return v1
.end method


# virtual methods
.method public final C(J)V
    .locals 2

    .line 1
    iput-wide p1, p0, Lha/h;->j:J

    .line 2
    .line 3
    iput-wide p1, p0, Lha/h;->k:J

    .line 4
    .line 5
    iget-object v0, p0, Lha/h;->n:Ljava/util/ListIterator;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    :goto_0
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iget-object v0, p0, Lha/h;->p:Ljava/util/List;

    .line 20
    .line 21
    check-cast v0, Ljava/lang/Iterable;

    .line 22
    .line 23
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_1

    .line 32
    .line 33
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    check-cast v1, Lz9/e;

    .line 38
    .line 39
    invoke-virtual {v1}, Lz9/e;->s()V

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    const-wide/16 v0, 0x32

    .line 44
    .line 45
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V

    .line 46
    .line 47
    .line 48
    iget-object v0, p0, Lha/h;->p:Ljava/util/List;

    .line 49
    .line 50
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 51
    .line 52
    .line 53
    invoke-direct {p0}, Lha/h;->A()Z

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0, p1, p2}, Lha/h;->x(J)V

    .line 57
    .line 58
    .line 59
    return-void
.end method

.method public final D(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lha/h;->q:J

    .line 2
    .line 3
    return-void
.end method

.method public final E(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "path"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lia/c;->d:Lia/c$a;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lia/c$a;->c(Ljava/lang/String;)Lcom/zykj/board/EzyRouterRecord$RouterRecord;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->E()Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-interface {v0}, Ljava/util/List;->listIterator()Ljava/util/ListIterator;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iput-object v0, p0, Lha/h;->n:Ljava/util/ListIterator;

    .line 21
    .line 22
    iput-object p1, p0, Lha/h;->m:Ljava/lang/String;

    .line 23
    .line 24
    invoke-direct {p0}, Lha/h;->A()Z

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final F(I)V
    .locals 0

    .line 1
    iput p1, p0, Lha/h;->s:I

    .line 2
    .line 3
    return-void
.end method

.method public k()V
    .locals 2

    .line 1
    invoke-super {p0}, Lz9/e;->k()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lha/h;->p:Ljava/util/List;

    .line 5
    .line 6
    check-cast v0, Ljava/lang/Iterable;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Lz9/e;

    .line 23
    .line 24
    invoke-virtual {v1}, Lz9/e;->k()V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    return-void
.end method

.method public l()V
    .locals 2

    .line 1
    invoke-super {p0}, Lz9/e;->l()V

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    iput-wide v0, p0, Lha/h;->k:J

    .line 7
    .line 8
    iput-wide v0, p0, Lha/h;->j:J

    .line 9
    .line 10
    iget-object v0, p0, Lha/h;->p:Ljava/util/List;

    .line 11
    .line 12
    check-cast v0, Ljava/lang/Iterable;

    .line 13
    .line 14
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, Lz9/e;

    .line 29
    .line 30
    invoke-virtual {v1}, Lz9/e;->s()V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    return-void
.end method

.method public m()V
    .locals 2

    .line 1
    invoke-super {p0}, Lz9/e;->m()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lha/h;->p:Ljava/util/List;

    .line 5
    .line 6
    check-cast v0, Ljava/lang/Iterable;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Lz9/e;

    .line 23
    .line 24
    invoke-virtual {v1}, Lz9/e;->m()V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    return-void
.end method

.method public run()V
    .locals 6

    .line 1
    iget-object v0, p0, Lha/h;->r:Lz9/a;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lz9/e;->g()Lga/d;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Lz9/e;->b()Lv9/c;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0}, Lz9/e;->c()Lu9/a;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    sget-object v3, Lz9/b;->a:Lz9/b;

    .line 24
    .line 25
    iget v4, p0, Lha/h;->s:I

    .line 26
    .line 27
    invoke-virtual {v3, v4, v0, v2, v1}, Lz9/b;->a(ILga/d;Lu9/a;Lv9/c;)Lz9/a;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iput-object v0, p0, Lha/h;->r:Lz9/a;

    .line 32
    .line 33
    :cond_0
    invoke-virtual {p0}, Lz9/e;->f()Lcom/zykj/blackboard/enums/PlayStatus;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    sget-object v1, Lcom/zykj/blackboard/enums/PlayStatus;->f:Lcom/zykj/blackboard/enums/PlayStatus;

    .line 38
    .line 39
    if-ne v0, v1, :cond_1

    .line 40
    .line 41
    goto/16 :goto_2

    .line 42
    .line 43
    :cond_1
    invoke-virtual {p0}, Lz9/e;->f()Lcom/zykj/blackboard/enums/PlayStatus;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    sget-object v1, Lcom/zykj/blackboard/enums/PlayStatus;->h:Lcom/zykj/blackboard/enums/PlayStatus;

    .line 48
    .line 49
    if-ne v0, v1, :cond_2

    .line 50
    .line 51
    const-wide/16 v0, 0x0

    .line 52
    .line 53
    iput-wide v0, p0, Lha/h;->j:J

    .line 54
    .line 55
    iput-wide v0, p0, Lha/h;->k:J

    .line 56
    .line 57
    return-void

    .line 58
    :cond_2
    iget-object v0, p0, Lha/h;->l:Ljava/util/ListIterator;

    .line 59
    .line 60
    invoke-direct {p0, v0}, Lha/h;->B(Ljava/util/ListIterator;)Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-eqz v0, :cond_4

    .line 65
    .line 66
    invoke-virtual {p0}, Lz9/e;->f()Lcom/zykj/blackboard/enums/PlayStatus;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    sget-object v1, Lcom/zykj/blackboard/enums/PlayStatus;->e:Lcom/zykj/blackboard/enums/PlayStatus;

    .line 71
    .line 72
    if-eq v0, v1, :cond_3

    .line 73
    .line 74
    invoke-virtual {p0}, Lz9/e;->f()Lcom/zykj/blackboard/enums/PlayStatus;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    sget-object v1, Lcom/zykj/blackboard/enums/PlayStatus;->g:Lcom/zykj/blackboard/enums/PlayStatus;

    .line 79
    .line 80
    if-ne v0, v1, :cond_4

    .line 81
    .line 82
    :cond_3
    invoke-direct {p0}, Lha/h;->A()Z

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    if-nez v0, :cond_2

    .line 87
    .line 88
    :cond_4
    iget-wide v0, p0, Lha/h;->k:J

    .line 89
    .line 90
    invoke-virtual {p0}, Lz9/e;->e()Lq9/e;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    const/16 v3, 0x10

    .line 95
    .line 96
    if-eqz v2, :cond_5

    .line 97
    .line 98
    invoke-virtual {v2}, Lq9/e;->a()I

    .line 99
    .line 100
    .line 101
    move-result v2

    .line 102
    goto :goto_0

    .line 103
    :cond_5
    move v2, v3

    .line 104
    :goto_0
    int-to-long v4, v2

    .line 105
    add-long/2addr v0, v4

    .line 106
    iput-wide v0, p0, Lha/h;->k:J

    .line 107
    .line 108
    iget-wide v0, p0, Lha/h;->j:J

    .line 109
    .line 110
    invoke-virtual {p0}, Lz9/e;->e()Lq9/e;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    if-eqz v2, :cond_6

    .line 115
    .line 116
    invoke-virtual {v2}, Lq9/e;->a()I

    .line 117
    .line 118
    .line 119
    move-result v2

    .line 120
    goto :goto_1

    .line 121
    :cond_6
    move v2, v3

    .line 122
    :goto_1
    int-to-long v4, v2

    .line 123
    add-long/2addr v0, v4

    .line 124
    iput-wide v0, p0, Lha/h;->j:J

    .line 125
    .line 126
    iget-wide v4, p0, Lha/h;->q:J

    .line 127
    .line 128
    invoke-virtual {p0}, Lz9/e;->e()Lq9/e;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    if-eqz v2, :cond_7

    .line 133
    .line 134
    invoke-virtual {v2}, Lq9/e;->a()I

    .line 135
    .line 136
    .line 137
    move-result v3

    .line 138
    :cond_7
    int-to-long v2, v3

    .line 139
    add-long/2addr v4, v2

    .line 140
    cmp-long v0, v0, v4

    .line 141
    .line 142
    if-lez v0, :cond_a

    .line 143
    .line 144
    invoke-virtual {p0}, Lha/h;->u()V

    .line 145
    .line 146
    .line 147
    iget-wide v0, p0, Lha/h;->q:J

    .line 148
    .line 149
    invoke-virtual {p0, v0, v1}, Lz9/e;->j(J)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {p0}, Lz9/e;->b()Lv9/c;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    if-eqz v0, :cond_8

    .line 157
    .line 158
    const/4 v1, 0x1

    .line 159
    invoke-interface {v0, v1}, Lv9/c;->l(Z)V

    .line 160
    .line 161
    .line 162
    :cond_8
    invoke-virtual {p0}, Lz9/e;->b()Lv9/c;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    if-eqz v0, :cond_9

    .line 167
    .line 168
    invoke-interface {v0}, Lv9/c;->g()V

    .line 169
    .line 170
    .line 171
    :cond_9
    :goto_2
    return-void

    .line 172
    :cond_a
    iget-wide v0, p0, Lha/h;->j:J

    .line 173
    .line 174
    invoke-virtual {p0, v0, v1}, Lz9/e;->j(J)V

    .line 175
    .line 176
    .line 177
    return-void
.end method

.method public s()V
    .locals 3

    .line 1
    invoke-super {p0}, Lz9/e;->s()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lha/h;->p:Ljava/util/List;

    .line 5
    .line 6
    monitor-enter v0

    .line 7
    :try_start_0
    iget-object v1, p0, Lha/h;->p:Ljava/util/List;

    .line 8
    .line 9
    check-cast v1, Ljava/lang/Iterable;

    .line 10
    .line 11
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    check-cast v2, Lz9/e;

    .line 26
    .line 27
    invoke-virtual {v2}, Lz9/e;->s()V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :catchall_0
    move-exception v1

    .line 32
    goto :goto_1

    .line 33
    :cond_0
    sget-object v1, Lqc/q;->a:Lqc/q;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    .line 35
    monitor-exit v0

    .line 36
    iget-object v0, p0, Lha/h;->o:Ljava/util/concurrent/ExecutorService;

    .line 37
    .line 38
    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 39
    .line 40
    .line 41
    const/4 v0, 0x0

    .line 42
    iput-object v0, p0, Lha/h;->n:Ljava/util/ListIterator;

    .line 43
    .line 44
    iput-object v0, p0, Lha/h;->l:Ljava/util/ListIterator;

    .line 45
    .line 46
    return-void

    .line 47
    :goto_1
    monitor-exit v0

    .line 48
    throw v1
.end method

.method public t()V
    .locals 2

    .line 1
    invoke-super {p0}, Lz9/e;->t()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lha/h;->p:Ljava/util/List;

    .line 5
    .line 6
    check-cast v0, Ljava/lang/Iterable;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Lz9/e;

    .line 23
    .line 24
    invoke-virtual {v1}, Lz9/e;->t()V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    return-void
.end method

.method public u()V
    .locals 2

    .line 1
    invoke-super {p0}, Lz9/e;->u()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lha/h;->p:Ljava/util/List;

    .line 5
    .line 6
    check-cast v0, Ljava/lang/Iterable;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Lz9/e;

    .line 23
    .line 24
    invoke-virtual {v1}, Lz9/e;->u()V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    return-void
.end method

.method public final x(J)V
    .locals 3

    .line 1
    const-string v0, "\u5373\u5c06\u5feb\u8fdb"

    .line 2
    .line 3
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    :goto_0
    iget-object v0, p0, Lha/h;->l:Ljava/util/ListIterator;

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Lha/h;->y(Ljava/util/ListIterator;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_2

    .line 15
    .line 16
    invoke-direct {p0}, Lha/h;->A()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    const-string v0, "\u88c5\u8f7d\u4e86\u4e0b\u4e00\u4e2a \u547d\u4ee4\u96c6\u5408"

    .line 23
    .line 24
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 25
    .line 26
    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 33
    .line 34
    .line 35
    const-string v1, "\u5feb\u8fdb\u7ed3\u675f nextCommandTime = "

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    iget-wide v1, p0, Lha/h;->k:J

    .line 41
    .line 42
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 50
    .line 51
    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    const-wide/16 v0, 0x1

    .line 55
    .line 56
    cmp-long v0, v0, p1

    .line 57
    .line 58
    if-gtz v0, :cond_1

    .line 59
    .line 60
    iget-wide v0, p0, Lha/h;->q:J

    .line 61
    .line 62
    cmp-long p1, p1, v0

    .line 63
    .line 64
    if-gez p1, :cond_1

    .line 65
    .line 66
    sget-object p1, Lcom/zykj/blackboard/enums/PlayStatus;->f:Lcom/zykj/blackboard/enums/PlayStatus;

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_1
    sget-object p1, Lcom/zykj/blackboard/enums/PlayStatus;->h:Lcom/zykj/blackboard/enums/PlayStatus;

    .line 70
    .line 71
    :goto_1
    invoke-virtual {p0, p1}, Lz9/e;->q(Lcom/zykj/blackboard/enums/PlayStatus;)V

    .line 72
    .line 73
    .line 74
    :cond_2
    return-void
.end method

.method public final y(Ljava/util/ListIterator;)Z
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/ListIterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_8

    .line 10
    .line 11
    invoke-interface {p1}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;

    .line 16
    .line 17
    iget-wide v2, p0, Lha/h;->k:J

    .line 18
    .line 19
    invoke-virtual {v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->r()J

    .line 20
    .line 21
    .line 22
    move-result-wide v4

    .line 23
    cmp-long v2, v2, v4

    .line 24
    .line 25
    const/4 v3, 0x1

    .line 26
    const-string v4, "  next.delayTime = "

    .line 27
    .line 28
    if-gez v2, :cond_2

    .line 29
    .line 30
    new-instance v0, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 33
    .line 34
    .line 35
    const-string v2, "\u5feb\u8fdb\u65f6\uff0c\u65f6\u95f4\u6ca1\u5230,\u5feb\u8fdb\u5373\u5c06\u7ed3\u675f nextCommandTime = "

    .line 36
    .line 37
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    iget-wide v5, p0, Lha/h;->k:J

    .line 41
    .line 42
    invoke-virtual {v0, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->r()J

    .line 49
    .line 50
    .line 51
    move-result-wide v1

    .line 52
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 60
    .line 61
    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    invoke-interface {p1}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-eqz v0, :cond_1

    .line 69
    .line 70
    invoke-interface {p1}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    :cond_1
    return v3

    .line 74
    :cond_2
    invoke-direct {p0, v1}, Lha/h;->z(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;)Z

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    if-eqz v2, :cond_5

    .line 79
    .line 80
    invoke-virtual {v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->u()Z

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    if-eqz v2, :cond_5

    .line 85
    .line 86
    new-instance v2, Ljava/lang/StringBuilder;

    .line 87
    .line 88
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 89
    .line 90
    .line 91
    const-string v5, "\u5feb\u8fdb\u5230\u9700\u8981\u64ad\u653e\u7684\u6307\u4ee4 nextCommandTime = "

    .line 92
    .line 93
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    iget-wide v5, p0, Lha/h;->k:J

    .line 97
    .line 98
    invoke-virtual {v2, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->r()J

    .line 105
    .line 106
    .line 107
    move-result-wide v4

    .line 108
    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    sget-object v4, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 116
    .line 117
    invoke-virtual {v4, v2}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {p0}, Lz9/e;->b()Lv9/c;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    if-eqz v2, :cond_4

    .line 125
    .line 126
    invoke-interface {v2}, Lv9/c;->I()Z

    .line 127
    .line 128
    .line 129
    move-result v2

    .line 130
    if-nez v2, :cond_4

    .line 131
    .line 132
    invoke-virtual {p0}, Lz9/e;->b()Lv9/c;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    if-eqz v2, :cond_3

    .line 137
    .line 138
    invoke-interface {v2, v3}, Lv9/c;->l(Z)V

    .line 139
    .line 140
    .line 141
    :cond_3
    invoke-virtual {p0}, Lz9/e;->b()Lv9/c;

    .line 142
    .line 143
    .line 144
    move-result-object v2

    .line 145
    if-eqz v2, :cond_4

    .line 146
    .line 147
    invoke-interface {v2}, Lv9/c;->g()V

    .line 148
    .line 149
    .line 150
    :cond_4
    iget-object v2, p0, Lha/h;->r:Lz9/a;

    .line 151
    .line 152
    if-eqz v2, :cond_6

    .line 153
    .line 154
    iget-wide v3, p0, Lha/h;->k:J

    .line 155
    .line 156
    invoke-virtual {v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->r()J

    .line 157
    .line 158
    .line 159
    move-result-wide v5

    .line 160
    sub-long/2addr v3, v5

    .line 161
    invoke-virtual {v2, v1, v3, v4}, Lz9/a;->a(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;J)Lz9/e;

    .line 162
    .line 163
    .line 164
    move-result-object v2

    .line 165
    if-eqz v2, :cond_6

    .line 166
    .line 167
    new-instance v3, Ljava/lang/StringBuilder;

    .line 168
    .line 169
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 170
    .line 171
    .line 172
    const-string v4, "\u5373\u5c06\u5f02\u6b65\u6267\u884c\u64ad\u653e\u6307\u4ee4 "

    .line 173
    .line 174
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 178
    .line 179
    .line 180
    move-result-object v4

    .line 181
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v4

    .line 185
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 186
    .line 187
    .line 188
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v3

    .line 192
    sget-object v4, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 193
    .line 194
    invoke-virtual {v4, v3}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {p0}, Lz9/e;->e()Lq9/e;

    .line 198
    .line 199
    .line 200
    move-result-object v3

    .line 201
    invoke-virtual {v2, v3}, Lz9/e;->p(Lq9/e;)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {v2}, Lz9/e;->a()Ljava/util/List;

    .line 205
    .line 206
    .line 207
    move-result-object v3

    .line 208
    new-instance v4, Lha/h$a;

    .line 209
    .line 210
    invoke-direct {v4, p0, v2, v1}, Lha/h$a;-><init>(Lha/h;Lz9/e;Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;)V

    .line 211
    .line 212
    .line 213
    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 214
    .line 215
    .line 216
    invoke-virtual {v2}, Lz9/e;->k()V

    .line 217
    .line 218
    .line 219
    iget-object v3, p0, Lha/h;->p:Ljava/util/List;

    .line 220
    .line 221
    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 222
    .line 223
    .line 224
    iget-object v3, p0, Lha/h;->o:Ljava/util/concurrent/ExecutorService;

    .line 225
    .line 226
    invoke-interface {v3, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 227
    .line 228
    .line 229
    goto :goto_1

    .line 230
    :cond_5
    iget-object v2, p0, Lha/h;->r:Lz9/a;

    .line 231
    .line 232
    if-eqz v2, :cond_6

    .line 233
    .line 234
    invoke-virtual {v2, v1}, Lz9/a;->b(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;)V

    .line 235
    .line 236
    .line 237
    :cond_6
    :goto_1
    invoke-virtual {v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->u()Z

    .line 238
    .line 239
    .line 240
    move-result v2

    .line 241
    if-eqz v2, :cond_7

    .line 242
    .line 243
    iget-wide v2, p0, Lha/h;->k:J

    .line 244
    .line 245
    invoke-virtual {v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->r()J

    .line 246
    .line 247
    .line 248
    move-result-wide v4

    .line 249
    invoke-virtual {v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->t()J

    .line 250
    .line 251
    .line 252
    move-result-wide v6

    .line 253
    add-long/2addr v4, v6

    .line 254
    sub-long/2addr v2, v4

    .line 255
    iput-wide v2, p0, Lha/h;->k:J

    .line 256
    .line 257
    :cond_7
    new-instance v1, Ljava/lang/StringBuilder;

    .line 258
    .line 259
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 260
    .line 261
    .line 262
    const-string v2, "\u5feb\u8fdb\u4e2d nextCommandTime = "

    .line 263
    .line 264
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 265
    .line 266
    .line 267
    iget-wide v2, p0, Lha/h;->k:J

    .line 268
    .line 269
    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 270
    .line 271
    .line 272
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    move-result-object v1

    .line 276
    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 277
    .line 278
    invoke-virtual {v2, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 279
    .line 280
    .line 281
    goto/16 :goto_0

    .line 282
    .line 283
    :cond_8
    const-string p1, "\u5feb\u8fdb\u4e2d \u6ca1\u6709\u547d\u4ee4\u5566\uff01\uff01\uff01\uff0c\u8d76\u5feb\u53bb\u88c5\u8f7d\u4e0b\u4e2a\u6307\u4ee4\u96c6\u5408"

    .line 284
    .line 285
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 286
    .line 287
    invoke-virtual {v1, p1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 288
    .line 289
    .line 290
    return v0
.end method
