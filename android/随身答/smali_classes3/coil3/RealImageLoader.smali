.class public final Lcoil3/RealImageLoader;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcoil3/e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcoil3/RealImageLoader$a;
    }
.end annotation


# static fields
.field public static final synthetic g:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;


# instance fields
.field public final a:Lcoil3/RealImageLoader$a;

.field public final b:Lkotlinx/coroutines/CoroutineScope;

.field public final c:Le0/w;

.field public final d:Ly/o;

.field public final e:Lcoil3/a;

.field public volatile synthetic f:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, Lcoil3/RealImageLoader;

    const-string v1, "f"

    invoke-static {v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    sput-object v0, Lcoil3/RealImageLoader;->g:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    return-void
.end method

.method public constructor <init>(Lcoil3/RealImageLoader$a;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcoil3/RealImageLoader;->a:Lcoil3/RealImageLoader$a;

    .line 5
    .line 6
    invoke-virtual {p1}, Lcoil3/RealImageLoader$a;->f()Lcoil3/util/Logger;

    .line 7
    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-static {v0}, Lcoil3/h;->d(Lcoil3/util/Logger;)Lkotlinx/coroutines/CoroutineScope;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    iput-object v1, p0, Lcoil3/RealImageLoader;->b:Lkotlinx/coroutines/CoroutineScope;

    .line 15
    .line 16
    invoke-static {p0}, Le0/x;->a(Lcoil3/RealImageLoader;)Le0/w;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    iput-object v1, p0, Lcoil3/RealImageLoader;->c:Le0/w;

    .line 21
    .line 22
    invoke-virtual {p1}, Lcoil3/RealImageLoader$a;->f()Lcoil3/util/Logger;

    .line 23
    .line 24
    .line 25
    invoke-static {p0, v1, v0}, Ly/p;->a(Lcoil3/e;Le0/w;Lcoil3/util/Logger;)Ly/o;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    iput-object v2, p0, Lcoil3/RealImageLoader;->d:Ly/o;

    .line 30
    .line 31
    invoke-virtual {p1}, Lcoil3/RealImageLoader$a;->g()Lkotlin/Lazy;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1}, Lcoil3/RealImageLoader$a;->d()Lkotlin/Lazy;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1}, Lcoil3/RealImageLoader$a;->b()Lcoil3/a;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-virtual {v3}, Lcoil3/a;->k()Lcoil3/a$a;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-static {v3, p1}, Lcoil3/h;->f(Lcoil3/a$a;Lcoil3/RealImageLoader$a;)Lcoil3/a$a;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    invoke-static {v3, p1}, Lcoil3/i;->a(Lcoil3/a$a;Lcoil3/RealImageLoader$a;)Lcoil3/a$a;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    invoke-static {v3, p1}, Lcoil3/j;->a(Lcoil3/a$a;Lcoil3/RealImageLoader$a;)Lcoil3/a$a;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    invoke-static {v3, p1}, Lcoil3/k;->a(Lcoil3/a$a;Lcoil3/RealImageLoader$a;)Lcoil3/a$a;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    invoke-static {v3}, Lcoil3/h;->e(Lcoil3/a$a;)Lcoil3/a$a;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    new-instance v4, Lcoil3/intercept/EngineInterceptor;

    .line 66
    .line 67
    invoke-virtual {p1}, Lcoil3/RealImageLoader$a;->f()Lcoil3/util/Logger;

    .line 68
    .line 69
    .line 70
    invoke-direct {v4, p0, v1, v2, v0}, Lcoil3/intercept/EngineInterceptor;-><init>(Lcoil3/e;Le0/w;Ly/o;Lcoil3/util/Logger;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v3, v4}, Lcoil3/a$a;->h(Lcoil3/intercept/a;)Lcoil3/a$a;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-virtual {p1}, Lcoil3/a$a;->p()Lcoil3/a;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    iput-object p1, p0, Lcoil3/RealImageLoader;->e:Lcoil3/a;

    .line 82
    .line 83
    return-void
.end method

.method public static final synthetic g(Lcoil3/RealImageLoader;Ly/e;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcoil3/RealImageLoader;->h(Ly/e;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public a()Lcoil3/disk/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcoil3/RealImageLoader;->a:Lcoil3/RealImageLoader$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcoil3/RealImageLoader$a;->d()Lkotlin/Lazy;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lcoil3/disk/a;

    .line 12
    .line 13
    return-object v0
.end method

.method public b()Ly/e$b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcoil3/RealImageLoader;->a:Lcoil3/RealImageLoader$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcoil3/RealImageLoader$a;->c()Ly/e$b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public c(Ly/e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-static {p1}, Lcoil3/i;->d(Ly/e;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    invoke-virtual {p0, p1, v0, p2}, Lcoil3/RealImageLoader;->h(Ly/e;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1

    .line 13
    :cond_0
    new-instance v0, Lcoil3/RealImageLoader$execute$2;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-direct {v0, p1, p0, v1}, Lcoil3/RealImageLoader$execute$2;-><init>(Ly/e;Lcoil3/RealImageLoader;Lkotlin/coroutines/Continuation;)V

    .line 17
    .line 18
    .line 19
    invoke-static {v0, p2}, Lkotlinx/coroutines/CoroutineScopeKt;->coroutineScope(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    return-object p1
.end method

.method public d(Ly/e;)Ly/c;
    .locals 6

    .line 1
    iget-object v0, p0, Lcoil3/RealImageLoader;->b:Lkotlinx/coroutines/CoroutineScope;

    .line 2
    .line 3
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getMain()Lkotlinx/coroutines/MainCoroutineDispatcher;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Lkotlinx/coroutines/MainCoroutineDispatcher;->getImmediate()Lkotlinx/coroutines/MainCoroutineDispatcher;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    new-instance v3, Lcoil3/RealImageLoader$enqueue$job$1;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-direct {v3, p0, p1, v2}, Lcoil3/RealImageLoader$enqueue$job$1;-><init>(Lcoil3/RealImageLoader;Ly/e;Lkotlin/coroutines/Continuation;)V

    .line 15
    .line 16
    .line 17
    const/4 v4, 0x2

    .line 18
    const/4 v5, 0x0

    .line 19
    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/BuildersKt;->async$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Deferred;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-static {p1, v0}, Lcoil3/i;->c(Ly/e;Lkotlinx/coroutines/Deferred;)Ly/c;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    return-object p1
.end method

.method public e()Lcoil3/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcoil3/RealImageLoader;->e:Lcoil3/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public f()Lt/d;
    .locals 1

    .line 1
    iget-object v0, p0, Lcoil3/RealImageLoader;->a:Lcoil3/RealImageLoader$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcoil3/RealImageLoader$a;->g()Lkotlin/Lazy;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lt/d;

    .line 12
    .line 13
    return-object v0
.end method

.method public final h(Ly/e;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 13

    .line 1
    move-object/from16 v1, p3

    .line 2
    .line 3
    instance-of v3, v1, Lcoil3/RealImageLoader$execute$3;

    .line 4
    .line 5
    if-eqz v3, :cond_0

    .line 6
    .line 7
    move-object v3, v1

    .line 8
    check-cast v3, Lcoil3/RealImageLoader$execute$3;

    .line 9
    .line 10
    iget v4, v3, Lcoil3/RealImageLoader$execute$3;->g:I

    .line 11
    .line 12
    const/high16 v5, -0x80000000

    .line 13
    .line 14
    and-int v6, v4, v5

    .line 15
    .line 16
    if-eqz v6, :cond_0

    .line 17
    .line 18
    sub-int/2addr v4, v5

    .line 19
    iput v4, v3, Lcoil3/RealImageLoader$execute$3;->g:I

    .line 20
    .line 21
    :goto_0
    move-object v7, v3

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    new-instance v3, Lcoil3/RealImageLoader$execute$3;

    .line 24
    .line 25
    invoke-direct {v3, p0, v1}, Lcoil3/RealImageLoader$execute$3;-><init>(Lcoil3/RealImageLoader;Lkotlin/coroutines/Continuation;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :goto_1
    iget-object v1, v7, Lcoil3/RealImageLoader$execute$3;->e:Ljava/lang/Object;

    .line 30
    .line 31
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v8

    .line 35
    iget v3, v7, Lcoil3/RealImageLoader$execute$3;->g:I

    .line 36
    .line 37
    const/4 v9, 0x3

    .line 38
    const/4 v4, 0x2

    .line 39
    const/4 v10, 0x0

    .line 40
    const/4 v5, 0x1

    .line 41
    if-eqz v3, :cond_4

    .line 42
    .line 43
    if-eq v3, v5, :cond_3

    .line 44
    .line 45
    if-eq v3, v4, :cond_2

    .line 46
    .line 47
    if-ne v3, v9, :cond_1

    .line 48
    .line 49
    iget-object v0, v7, Lcoil3/RealImageLoader$execute$3;->c:Ljava/lang/Object;

    .line 50
    .line 51
    move-object v3, v0

    .line 52
    check-cast v3, Lcoil3/b;

    .line 53
    .line 54
    iget-object v0, v7, Lcoil3/RealImageLoader$execute$3;->b:Ljava/lang/Object;

    .line 55
    .line 56
    move-object v4, v0

    .line 57
    check-cast v4, Ly/e;

    .line 58
    .line 59
    iget-object v0, v7, Lcoil3/RealImageLoader$execute$3;->a:Ljava/lang/Object;

    .line 60
    .line 61
    move-object v5, v0

    .line 62
    check-cast v5, Ly/n;

    .line 63
    .line 64
    :try_start_0
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 65
    .line 66
    .line 67
    goto/16 :goto_a

    .line 68
    .line 69
    :catchall_0
    move-exception v0

    .line 70
    goto/16 :goto_d

    .line 71
    .line 72
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 73
    .line 74
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 75
    .line 76
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    throw v0

    .line 80
    :cond_2
    iget-object v0, v7, Lcoil3/RealImageLoader$execute$3;->d:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v0, Lk/j;

    .line 83
    .line 84
    iget-object v3, v7, Lcoil3/RealImageLoader$execute$3;->c:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v3, Lcoil3/b;

    .line 87
    .line 88
    iget-object v4, v7, Lcoil3/RealImageLoader$execute$3;->b:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v4, Ly/e;

    .line 91
    .line 92
    iget-object v5, v7, Lcoil3/RealImageLoader$execute$3;->a:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v5, Ly/n;

    .line 95
    .line 96
    :try_start_1
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 97
    .line 98
    .line 99
    move-object v11, v4

    .line 100
    move-object v4, v3

    .line 101
    move-object v3, v11

    .line 102
    move-object v11, v5

    .line 103
    :goto_2
    move-object v5, v0

    .line 104
    goto/16 :goto_8

    .line 105
    .line 106
    :cond_3
    iget-object v0, v7, Lcoil3/RealImageLoader$execute$3;->c:Ljava/lang/Object;

    .line 107
    .line 108
    move-object v3, v0

    .line 109
    check-cast v3, Lcoil3/b;

    .line 110
    .line 111
    iget-object v0, v7, Lcoil3/RealImageLoader$execute$3;->b:Ljava/lang/Object;

    .line 112
    .line 113
    move-object v5, v0

    .line 114
    check-cast v5, Ly/e;

    .line 115
    .line 116
    iget-object v0, v7, Lcoil3/RealImageLoader$execute$3;->a:Ljava/lang/Object;

    .line 117
    .line 118
    move-object v6, v0

    .line 119
    check-cast v6, Ly/n;

    .line 120
    .line 121
    :try_start_2
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 122
    .line 123
    .line 124
    goto :goto_4

    .line 125
    :catchall_1
    move-exception v0

    .line 126
    move-object v4, v5

    .line 127
    move-object v5, v6

    .line 128
    goto/16 :goto_d

    .line 129
    .line 130
    :cond_4
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    iget-object v1, p0, Lcoil3/RealImageLoader;->d:Ly/o;

    .line 134
    .line 135
    invoke-interface {v7}, Lkotlin/coroutines/Continuation;->getContext()Lkotlin/coroutines/CoroutineContext;

    .line 136
    .line 137
    .line 138
    move-result-object v3

    .line 139
    invoke-static {v3}, Lkotlinx/coroutines/JobKt;->getJob(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/Job;

    .line 140
    .line 141
    .line 142
    move-result-object v3

    .line 143
    if-nez p2, :cond_5

    .line 144
    .line 145
    move v6, v5

    .line 146
    goto :goto_3

    .line 147
    :cond_5
    const/4 v6, 0x0

    .line 148
    :goto_3
    invoke-interface {v1, p1, v3, v6}, Ly/o;->a(Ly/e;Lkotlinx/coroutines/Job;Z)Ly/n;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    invoke-interface {v1}, Ly/n;->b()V

    .line 153
    .line 154
    .line 155
    iget-object v3, p0, Lcoil3/RealImageLoader;->d:Ly/o;

    .line 156
    .line 157
    invoke-interface {v3, p1}, Ly/o;->d(Ly/e;)Ly/e;

    .line 158
    .line 159
    .line 160
    move-result-object v3

    .line 161
    iget-object v0, p0, Lcoil3/RealImageLoader;->a:Lcoil3/RealImageLoader$a;

    .line 162
    .line 163
    invoke-virtual {v0}, Lcoil3/RealImageLoader$a;->e()Lcoil3/b$c;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    invoke-interface {v0, v3}, Lcoil3/b$c;->a(Ly/e;)Lcoil3/b;

    .line 168
    .line 169
    .line 170
    move-result-object v6

    .line 171
    :try_start_3
    invoke-virtual {v3}, Ly/e;->d()Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    sget-object v11, Ly/k;->a:Ly/k;

    .line 176
    .line 177
    invoke-static {v0, v11}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    move-result v0

    .line 181
    if-nez v0, :cond_10

    .line 182
    .line 183
    invoke-interface {v1}, Ly/n;->start()V

    .line 184
    .line 185
    .line 186
    if-nez p2, :cond_7

    .line 187
    .line 188
    iput-object v1, v7, Lcoil3/RealImageLoader$execute$3;->a:Ljava/lang/Object;

    .line 189
    .line 190
    iput-object v3, v7, Lcoil3/RealImageLoader$execute$3;->b:Ljava/lang/Object;

    .line 191
    .line 192
    iput-object v6, v7, Lcoil3/RealImageLoader$execute$3;->c:Ljava/lang/Object;

    .line 193
    .line 194
    iput v5, v7, Lcoil3/RealImageLoader$execute$3;->g:I

    .line 195
    .line 196
    invoke-interface {v1, v7}, Ly/n;->a(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 200
    if-ne v0, v8, :cond_6

    .line 201
    .line 202
    goto/16 :goto_9

    .line 203
    .line 204
    :cond_6
    move-object v5, v3

    .line 205
    move-object v3, v6

    .line 206
    move-object v6, v1

    .line 207
    :goto_4
    move-object v1, v6

    .line 208
    goto :goto_5

    .line 209
    :catchall_2
    move-exception v0

    .line 210
    move-object v5, v1

    .line 211
    move-object v4, v3

    .line 212
    move-object v3, v6

    .line 213
    goto/16 :goto_d

    .line 214
    .line 215
    :cond_7
    move-object v5, v3

    .line 216
    move-object v3, v6

    .line 217
    :goto_5
    :try_start_4
    invoke-virtual {v5}, Ly/e;->u()Lt/d$b;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    if-eqz v0, :cond_8

    .line 222
    .line 223
    invoke-virtual {p0}, Lcoil3/RealImageLoader;->f()Lt/d;

    .line 224
    .line 225
    .line 226
    move-result-object v6

    .line 227
    if-eqz v6, :cond_8

    .line 228
    .line 229
    invoke-interface {v6, v0}, Lt/d;->a(Lt/d$b;)Lt/d$c;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    if-eqz v0, :cond_8

    .line 234
    .line 235
    invoke-virtual {v0}, Lt/d$c;->b()Lk/j;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    goto :goto_6

    .line 240
    :catchall_3
    move-exception v0

    .line 241
    move-object v4, v5

    .line 242
    move-object v5, v1

    .line 243
    goto/16 :goto_d

    .line 244
    .line 245
    :cond_8
    move-object v0, v10

    .line 246
    :goto_6
    invoke-virtual {v5}, Ly/e;->y()Lc0/a;

    .line 247
    .line 248
    .line 249
    move-result-object v6

    .line 250
    if-eqz v6, :cond_a

    .line 251
    .line 252
    if-nez v0, :cond_9

    .line 253
    .line 254
    invoke-virtual {v5}, Ly/e;->B()Lk/j;

    .line 255
    .line 256
    .line 257
    move-result-object v11

    .line 258
    goto :goto_7

    .line 259
    :cond_9
    move-object v11, v0

    .line 260
    :goto_7
    invoke-interface {v6, v11}, Lc0/a;->c(Lk/j;)V

    .line 261
    .line 262
    .line 263
    :cond_a
    invoke-virtual {v3, v5}, Lcoil3/b;->c(Ly/e;)V

    .line 264
    .line 265
    .line 266
    invoke-virtual {v5}, Ly/e;->p()Ly/e$d;

    .line 267
    .line 268
    .line 269
    move-result-object v6

    .line 270
    if-eqz v6, :cond_b

    .line 271
    .line 272
    invoke-interface {v6, v5}, Ly/e$d;->c(Ly/e;)V

    .line 273
    .line 274
    .line 275
    :cond_b
    invoke-virtual {v5}, Ly/e;->x()Lz/g;

    .line 276
    .line 277
    .line 278
    move-result-object v6

    .line 279
    invoke-virtual {v3, v5, v6}, Lcoil3/b;->n(Ly/e;Lz/g;)V

    .line 280
    .line 281
    .line 282
    iput-object v1, v7, Lcoil3/RealImageLoader$execute$3;->a:Ljava/lang/Object;

    .line 283
    .line 284
    iput-object v5, v7, Lcoil3/RealImageLoader$execute$3;->b:Ljava/lang/Object;

    .line 285
    .line 286
    iput-object v3, v7, Lcoil3/RealImageLoader$execute$3;->c:Ljava/lang/Object;

    .line 287
    .line 288
    iput-object v0, v7, Lcoil3/RealImageLoader$execute$3;->d:Ljava/lang/Object;

    .line 289
    .line 290
    iput v4, v7, Lcoil3/RealImageLoader$execute$3;->g:I

    .line 291
    .line 292
    invoke-interface {v6, v7}, Lz/g;->a(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 296
    if-ne v4, v8, :cond_c

    .line 297
    .line 298
    goto :goto_9

    .line 299
    :cond_c
    move-object v11, v1

    .line 300
    move-object v1, v4

    .line 301
    move-object v4, v3

    .line 302
    move-object v3, v5

    .line 303
    goto/16 :goto_2

    .line 304
    .line 305
    :goto_8
    :try_start_5
    check-cast v1, Lz/e;

    .line 306
    .line 307
    invoke-virtual {v4, v3, v1}, Lcoil3/b;->m(Ly/e;Lz/e;)V

    .line 308
    .line 309
    .line 310
    invoke-virtual {v3}, Ly/e;->o()Lkotlin/coroutines/CoroutineContext;

    .line 311
    .line 312
    .line 313
    move-result-object v12

    .line 314
    new-instance v0, Lcoil3/RealImageLoader$execute$result$1;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 315
    .line 316
    const/4 v6, 0x0

    .line 317
    move-object v2, v3

    .line 318
    move-object v3, v1

    .line 319
    move-object v1, v2

    .line 320
    move-object v2, p0

    .line 321
    :try_start_6
    invoke-direct/range {v0 .. v6}, Lcoil3/RealImageLoader$execute$result$1;-><init>(Ly/e;Lcoil3/RealImageLoader;Lz/e;Lcoil3/b;Lk/j;Lkotlin/coroutines/Continuation;)V

    .line 322
    .line 323
    .line 324
    iput-object v11, v7, Lcoil3/RealImageLoader$execute$3;->a:Ljava/lang/Object;

    .line 325
    .line 326
    iput-object v1, v7, Lcoil3/RealImageLoader$execute$3;->b:Ljava/lang/Object;

    .line 327
    .line 328
    iput-object v4, v7, Lcoil3/RealImageLoader$execute$3;->c:Ljava/lang/Object;

    .line 329
    .line 330
    iput-object v10, v7, Lcoil3/RealImageLoader$execute$3;->d:Ljava/lang/Object;

    .line 331
    .line 332
    iput v9, v7, Lcoil3/RealImageLoader$execute$3;->g:I

    .line 333
    .line 334
    invoke-static {v12, v0, v7}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 335
    .line 336
    .line 337
    move-result-object v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 338
    if-ne v0, v8, :cond_d

    .line 339
    .line 340
    :goto_9
    return-object v8

    .line 341
    :cond_d
    move-object v3, v4

    .line 342
    move-object v5, v11

    .line 343
    move-object v4, v1

    .line 344
    move-object v1, v0

    .line 345
    :goto_a
    :try_start_7
    check-cast v1, Ly/j;

    .line 346
    .line 347
    instance-of v0, v1, Ly/q;

    .line 348
    .line 349
    if-eqz v0, :cond_e

    .line 350
    .line 351
    move-object v0, v1

    .line 352
    check-cast v0, Ly/q;

    .line 353
    .line 354
    invoke-virtual {v4}, Ly/e;->y()Lc0/a;

    .line 355
    .line 356
    .line 357
    move-result-object v6

    .line 358
    invoke-virtual {p0, v0, v6, v3}, Lcoil3/RealImageLoader;->l(Ly/q;Lc0/a;Lcoil3/b;)V

    .line 359
    .line 360
    .line 361
    goto :goto_b

    .line 362
    :cond_e
    instance-of v0, v1, Ly/d;

    .line 363
    .line 364
    if-eqz v0, :cond_f

    .line 365
    .line 366
    move-object v0, v1

    .line 367
    check-cast v0, Ly/d;

    .line 368
    .line 369
    invoke-virtual {v4}, Ly/e;->y()Lc0/a;

    .line 370
    .line 371
    .line 372
    move-result-object v6

    .line 373
    invoke-virtual {p0, v0, v6, v3}, Lcoil3/RealImageLoader;->k(Ly/d;Lc0/a;Lcoil3/b;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 374
    .line 375
    .line 376
    :goto_b
    invoke-interface {v5}, Ly/n;->complete()V

    .line 377
    .line 378
    .line 379
    return-object v1

    .line 380
    :cond_f
    :try_start_8
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    .line 381
    .line 382
    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 383
    .line 384
    .line 385
    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 386
    :catchall_4
    move-exception v0

    .line 387
    :goto_c
    move-object v3, v4

    .line 388
    move-object v5, v11

    .line 389
    move-object v4, v1

    .line 390
    goto :goto_d

    .line 391
    :catchall_5
    move-exception v0

    .line 392
    move-object v1, v3

    .line 393
    goto :goto_c

    .line 394
    :cond_10
    :try_start_9
    new-instance v0, Lcoil3/request/NullRequestDataException;

    .line 395
    .line 396
    invoke-direct {v0}, Lcoil3/request/NullRequestDataException;-><init>()V

    .line 397
    .line 398
    .line 399
    throw v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 400
    :goto_d
    :try_start_a
    instance-of v1, v0, Ljava/util/concurrent/CancellationException;

    .line 401
    .line 402
    if-nez v1, :cond_11

    .line 403
    .line 404
    invoke-static {v4, v0}, Lcoil3/util/c;->c(Ly/e;Ljava/lang/Throwable;)Ly/d;

    .line 405
    .line 406
    .line 407
    move-result-object v0

    .line 408
    invoke-virtual {v4}, Ly/e;->y()Lc0/a;

    .line 409
    .line 410
    .line 411
    move-result-object v1

    .line 412
    invoke-virtual {p0, v0, v1, v3}, Lcoil3/RealImageLoader;->k(Ly/d;Lc0/a;Lcoil3/b;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_6

    .line 413
    .line 414
    .line 415
    invoke-interface {v5}, Ly/n;->complete()V

    .line 416
    .line 417
    .line 418
    return-object v0

    .line 419
    :catchall_6
    move-exception v0

    .line 420
    goto :goto_e

    .line 421
    :cond_11
    :try_start_b
    invoke-virtual {p0, v4, v3}, Lcoil3/RealImageLoader;->j(Ly/e;Lcoil3/b;)V

    .line 422
    .line 423
    .line 424
    throw v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_6

    .line 425
    :goto_e
    invoke-interface {v5}, Ly/n;->complete()V

    .line 426
    .line 427
    .line 428
    throw v0
.end method

.method public final i()Lcoil3/RealImageLoader$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcoil3/RealImageLoader;->a:Lcoil3/RealImageLoader$a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final j(Ly/e;Lcoil3/b;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcoil3/RealImageLoader;->a:Lcoil3/RealImageLoader$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcoil3/RealImageLoader$a;->f()Lcoil3/util/Logger;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p2, p1}, Lcoil3/b;->d(Ly/e;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Ly/e;->p()Ly/e$d;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    if-eqz p2, :cond_0

    .line 14
    .line 15
    invoke-interface {p2, p1}, Ly/e$d;->d(Ly/e;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public final k(Ly/d;Lc0/a;Lcoil3/b;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ly/d;->a()Ly/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcoil3/RealImageLoader;->a:Lcoil3/RealImageLoader$a;

    .line 6
    .line 7
    invoke-virtual {v1}, Lcoil3/RealImageLoader$a;->f()Lcoil3/util/Logger;

    .line 8
    .line 9
    .line 10
    instance-of v1, p2, Ld0/d;

    .line 11
    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    if-eqz p2, :cond_2

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-interface {p1}, Ly/j;->a()Ly/e;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-static {v1}, Ly/i;->o(Ly/e;)Ld0/c$a;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    move-object v2, p2

    .line 26
    check-cast v2, Ld0/d;

    .line 27
    .line 28
    invoke-interface {v1, v2, p1}, Ld0/c$a;->a(Ld0/d;Ly/j;)Ld0/c;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    instance-of v2, v1, Ld0/b;

    .line 33
    .line 34
    if-eqz v2, :cond_1

    .line 35
    .line 36
    :goto_0
    invoke-virtual {p1}, Ly/d;->b()Lk/j;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-interface {p2, v1}, Lc0/a;->b(Lk/j;)V

    .line 41
    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    invoke-interface {p1}, Ly/j;->a()Ly/e;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    invoke-virtual {p3, p2, v1}, Lcoil3/b;->r(Ly/e;Ld0/c;)V

    .line 49
    .line 50
    .line 51
    invoke-interface {v1}, Ld0/c;->a()V

    .line 52
    .line 53
    .line 54
    invoke-interface {p1}, Ly/j;->a()Ly/e;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    invoke-virtual {p3, p2, v1}, Lcoil3/b;->q(Ly/e;Ld0/c;)V

    .line 59
    .line 60
    .line 61
    :cond_2
    :goto_1
    invoke-virtual {p3, v0, p1}, Lcoil3/b;->b(Ly/e;Ly/d;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0}, Ly/e;->p()Ly/e$d;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    if-eqz p2, :cond_3

    .line 69
    .line 70
    invoke-interface {p2, v0, p1}, Ly/e$d;->b(Ly/e;Ly/d;)V

    .line 71
    .line 72
    .line 73
    :cond_3
    return-void
.end method

.method public final l(Ly/q;Lc0/a;Lcoil3/b;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ly/q;->a()Ly/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, Ly/q;->b()Lcoil3/decode/DataSource;

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lcoil3/RealImageLoader;->a:Lcoil3/RealImageLoader$a;

    .line 9
    .line 10
    invoke-virtual {v1}, Lcoil3/RealImageLoader$a;->f()Lcoil3/util/Logger;

    .line 11
    .line 12
    .line 13
    instance-of v1, p2, Ld0/d;

    .line 14
    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    if-eqz p2, :cond_2

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-interface {p1}, Ly/j;->a()Ly/e;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-static {v1}, Ly/i;->o(Ly/e;)Ld0/c$a;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    move-object v2, p2

    .line 29
    check-cast v2, Ld0/d;

    .line 30
    .line 31
    invoke-interface {v1, v2, p1}, Ld0/c$a;->a(Ld0/d;Ly/j;)Ld0/c;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    instance-of v2, v1, Ld0/b;

    .line 36
    .line 37
    if-eqz v2, :cond_1

    .line 38
    .line 39
    :goto_0
    invoke-virtual {p1}, Ly/q;->c()Lk/j;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-interface {p2, v1}, Lc0/a;->a(Lk/j;)V

    .line 44
    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    invoke-interface {p1}, Ly/j;->a()Ly/e;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    invoke-virtual {p3, p2, v1}, Lcoil3/b;->r(Ly/e;Ld0/c;)V

    .line 52
    .line 53
    .line 54
    invoke-interface {v1}, Ld0/c;->a()V

    .line 55
    .line 56
    .line 57
    invoke-interface {p1}, Ly/j;->a()Ly/e;

    .line 58
    .line 59
    .line 60
    move-result-object p2

    .line 61
    invoke-virtual {p3, p2, v1}, Lcoil3/b;->q(Ly/e;Ld0/c;)V

    .line 62
    .line 63
    .line 64
    :cond_2
    :goto_1
    invoke-virtual {p3, v0, p1}, Lcoil3/b;->a(Ly/e;Ly/q;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0}, Ly/e;->p()Ly/e$d;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    if-eqz p2, :cond_3

    .line 72
    .line 73
    invoke-interface {p2, v0, p1}, Ly/e$d;->a(Ly/e;Ly/q;)V

    .line 74
    .line 75
    .line 76
    :cond_3
    return-void
.end method
