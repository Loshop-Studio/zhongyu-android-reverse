.class public final Lcoil3/intercept/EngineInterceptor;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcoil3/intercept/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcoil3/intercept/EngineInterceptor$a;,
        Lcoil3/intercept/EngineInterceptor$b;
    }
.end annotation


# static fields
.field public static final e:Lcoil3/intercept/EngineInterceptor$a;


# instance fields
.field public final a:Lcoil3/e;

.field public final b:Le0/w;

.field public final c:Ly/o;

.field public final d:Lt/e;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcoil3/intercept/EngineInterceptor$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcoil3/intercept/EngineInterceptor$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcoil3/intercept/EngineInterceptor;->e:Lcoil3/intercept/EngineInterceptor$a;

    return-void
.end method

.method public constructor <init>(Lcoil3/e;Le0/w;Ly/o;Lcoil3/util/Logger;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcoil3/intercept/EngineInterceptor;->a:Lcoil3/e;

    .line 5
    .line 6
    iput-object p2, p0, Lcoil3/intercept/EngineInterceptor;->b:Le0/w;

    .line 7
    .line 8
    iput-object p3, p0, Lcoil3/intercept/EngineInterceptor;->c:Ly/o;

    .line 9
    .line 10
    new-instance p2, Lt/e;

    .line 11
    .line 12
    const/4 p4, 0x0

    .line 13
    invoke-direct {p2, p1, p3, p4}, Lt/e;-><init>(Lcoil3/e;Ly/o;Lcoil3/util/Logger;)V

    .line 14
    .line 15
    .line 16
    iput-object p2, p0, Lcoil3/intercept/EngineInterceptor;->d:Lt/e;

    .line 17
    .line 18
    return-void
.end method

.method public static final synthetic b(Lcoil3/intercept/EngineInterceptor;Lp/p;Lcoil3/a;Ly/e;Ljava/lang/Object;Ly/m;Lcoil3/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual/range {p0 .. p7}, Lcoil3/intercept/EngineInterceptor;->g(Lp/p;Lcoil3/a;Ly/e;Ljava/lang/Object;Ly/m;Lcoil3/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic c(Lcoil3/intercept/EngineInterceptor;Ly/e;Ljava/lang/Object;Ly/m;Lcoil3/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual/range {p0 .. p5}, Lcoil3/intercept/EngineInterceptor;->h(Ly/e;Ljava/lang/Object;Ly/m;Lcoil3/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic d(Lcoil3/intercept/EngineInterceptor;Lcoil3/a;Ly/e;Ljava/lang/Object;Ly/m;Lcoil3/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual/range {p0 .. p6}, Lcoil3/intercept/EngineInterceptor;->i(Lcoil3/a;Ly/e;Ljava/lang/Object;Ly/m;Lcoil3/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic e(Lcoil3/intercept/EngineInterceptor;)Lt/e;
    .locals 0

    .line 1
    iget-object p0, p0, Lcoil3/intercept/EngineInterceptor;->d:Lt/e;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic f(Lcoil3/intercept/EngineInterceptor;)Le0/w;
    .locals 0

    .line 1
    iget-object p0, p0, Lcoil3/intercept/EngineInterceptor;->b:Le0/w;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public a(Lcoil3/intercept/a$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 13

    .line 1
    instance-of v0, p2, Lcoil3/intercept/EngineInterceptor$intercept$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lcoil3/intercept/EngineInterceptor$intercept$1;

    .line 7
    .line 8
    iget v1, v0, Lcoil3/intercept/EngineInterceptor$intercept$1;->d:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcoil3/intercept/EngineInterceptor$intercept$1;->d:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcoil3/intercept/EngineInterceptor$intercept$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lcoil3/intercept/EngineInterceptor$intercept$1;-><init>(Lcoil3/intercept/EngineInterceptor;Lkotlin/coroutines/Continuation;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lcoil3/intercept/EngineInterceptor$intercept$1;->b:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcoil3/intercept/EngineInterceptor$intercept$1;->d:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    iget-object p1, v0, Lcoil3/intercept/EngineInterceptor$intercept$1;->a:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p1, Lcoil3/intercept/a$a;

    .line 41
    .line 42
    :try_start_0
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    .line 44
    .line 45
    return-object p2

    .line 46
    :catchall_0
    move-exception v0

    .line 47
    :goto_1
    move-object p2, v0

    .line 48
    goto/16 :goto_3

    .line 49
    .line 50
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 51
    .line 52
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 53
    .line 54
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    throw p1

    .line 58
    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    :try_start_1
    invoke-interface {p1}, Lcoil3/intercept/a$a;->a()Ly/e;

    .line 62
    .line 63
    .line 64
    move-result-object v6

    .line 65
    invoke-virtual {v6}, Ly/e;->d()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    invoke-interface {p1}, Lcoil3/intercept/a$a;->getSize()Lz/e;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    invoke-static {p1}, Lcoil3/util/c;->l(Lcoil3/intercept/a$a;)Lcoil3/b;

    .line 74
    .line 75
    .line 76
    move-result-object v9

    .line 77
    iget-object v4, p0, Lcoil3/intercept/EngineInterceptor;->c:Ly/o;

    .line 78
    .line 79
    invoke-interface {v4, v6, v2}, Ly/o;->c(Ly/e;Lz/e;)Ly/m;

    .line 80
    .line 81
    .line 82
    move-result-object v8

    .line 83
    invoke-virtual {v8}, Ly/m;->j()Lcoil3/size/Scale;

    .line 84
    .line 85
    .line 86
    move-result-object v4

    .line 87
    invoke-virtual {v9, v6, p2}, Lcoil3/b;->l(Ly/e;Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    iget-object v5, p0, Lcoil3/intercept/EngineInterceptor;->a:Lcoil3/e;

    .line 91
    .line 92
    invoke-interface {v5}, Lcoil3/e;->e()Lcoil3/a;

    .line 93
    .line 94
    .line 95
    move-result-object v5

    .line 96
    invoke-virtual {v5, p2, v8}, Lcoil3/a;->j(Ljava/lang/Object;Ly/m;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v7

    .line 100
    invoke-virtual {v9, v6, v7}, Lcoil3/b;->k(Ly/e;Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    iget-object p2, p0, Lcoil3/intercept/EngineInterceptor;->d:Lt/e;

    .line 104
    .line 105
    invoke-virtual {p2, v6, v7, v8, v9}, Lt/e;->f(Ly/e;Ljava/lang/Object;Ly/m;Lcoil3/b;)Lt/d$b;

    .line 106
    .line 107
    .line 108
    move-result-object v10
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 109
    if-eqz v10, :cond_3

    .line 110
    .line 111
    :try_start_2
    iget-object p2, p0, Lcoil3/intercept/EngineInterceptor;->d:Lt/e;

    .line 112
    .line 113
    invoke-virtual {p2, v6, v10, v2, v4}, Lt/e;->a(Ly/e;Lt/d$b;Lz/e;Lcoil3/size/Scale;)Lt/d$c;

    .line 114
    .line 115
    .line 116
    move-result-object p2

    .line 117
    goto :goto_2

    .line 118
    :cond_3
    const/4 p2, 0x0

    .line 119
    :goto_2
    if-eqz p2, :cond_4

    .line 120
    .line 121
    iget-object v0, p0, Lcoil3/intercept/EngineInterceptor;->d:Lt/e;

    .line 122
    .line 123
    invoke-virtual {v0, p1, v6, v10, p2}, Lt/e;->g(Lcoil3/intercept/a$a;Ly/e;Lt/d$b;Lt/d$c;)Ly/q;

    .line 124
    .line 125
    .line 126
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 127
    return-object p1

    .line 128
    :cond_4
    :try_start_3
    invoke-virtual {v6}, Ly/e;->l()Lkotlin/coroutines/CoroutineContext;

    .line 129
    .line 130
    .line 131
    move-result-object p2

    .line 132
    new-instance v4, Lcoil3/intercept/EngineInterceptor$intercept$2;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 133
    .line 134
    const/4 v12, 0x0

    .line 135
    move-object v5, p0

    .line 136
    move-object v11, p1

    .line 137
    :try_start_4
    invoke-direct/range {v4 .. v12}, Lcoil3/intercept/EngineInterceptor$intercept$2;-><init>(Lcoil3/intercept/EngineInterceptor;Ly/e;Ljava/lang/Object;Ly/m;Lcoil3/b;Lt/d$b;Lcoil3/intercept/a$a;Lkotlin/coroutines/Continuation;)V

    .line 138
    .line 139
    .line 140
    iput-object v11, v0, Lcoil3/intercept/EngineInterceptor$intercept$1;->a:Ljava/lang/Object;

    .line 141
    .line 142
    iput v3, v0, Lcoil3/intercept/EngineInterceptor$intercept$1;->d:I

    .line 143
    .line 144
    invoke-static {p2, v4, v0}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 148
    if-ne p1, v1, :cond_5

    .line 149
    .line 150
    return-object v1

    .line 151
    :cond_5
    return-object p1

    .line 152
    :catchall_1
    move-exception v0

    .line 153
    move-object p2, v0

    .line 154
    move-object p1, v11

    .line 155
    goto :goto_3

    .line 156
    :catchall_2
    move-exception v0

    .line 157
    move-object v11, p1

    .line 158
    goto :goto_1

    .line 159
    :goto_3
    instance-of v0, p2, Ljava/util/concurrent/CancellationException;

    .line 160
    .line 161
    if-nez v0, :cond_6

    .line 162
    .line 163
    invoke-interface {p1}, Lcoil3/intercept/a$a;->a()Ly/e;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    invoke-static {p1, p2}, Lcoil3/util/c;->c(Ly/e;Ljava/lang/Throwable;)Ly/d;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    return-object p1

    .line 172
    :cond_6
    throw p2
.end method

.method public final g(Lp/p;Lcoil3/a;Ly/e;Ljava/lang/Object;Ly/m;Lcoil3/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p7, Lcoil3/intercept/EngineInterceptor$decode$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p7

    .line 6
    check-cast v0, Lcoil3/intercept/EngineInterceptor$decode$1;

    .line 7
    .line 8
    iget v1, v0, Lcoil3/intercept/EngineInterceptor$decode$1;->k:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcoil3/intercept/EngineInterceptor$decode$1;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcoil3/intercept/EngineInterceptor$decode$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p7}, Lcoil3/intercept/EngineInterceptor$decode$1;-><init>(Lcoil3/intercept/EngineInterceptor;Lkotlin/coroutines/Continuation;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p7, v0, Lcoil3/intercept/EngineInterceptor$decode$1;->i:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcoil3/intercept/EngineInterceptor$decode$1;->k:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    iget p1, v0, Lcoil3/intercept/EngineInterceptor$decode$1;->h:I

    .line 39
    .line 40
    iget-object p2, v0, Lcoil3/intercept/EngineInterceptor$decode$1;->g:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p2, Lcoil3/decode/a;

    .line 43
    .line 44
    iget-object p3, v0, Lcoil3/intercept/EngineInterceptor$decode$1;->f:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p3, Lcoil3/b;

    .line 47
    .line 48
    iget-object p4, v0, Lcoil3/intercept/EngineInterceptor$decode$1;->e:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast p4, Ly/m;

    .line 51
    .line 52
    iget-object p5, v0, Lcoil3/intercept/EngineInterceptor$decode$1;->d:Ljava/lang/Object;

    .line 53
    .line 54
    iget-object p6, v0, Lcoil3/intercept/EngineInterceptor$decode$1;->c:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast p6, Ly/e;

    .line 57
    .line 58
    iget-object v2, v0, Lcoil3/intercept/EngineInterceptor$decode$1;->b:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v2, Lcoil3/a;

    .line 61
    .line 62
    iget-object v4, v0, Lcoil3/intercept/EngineInterceptor$decode$1;->a:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v4, Lp/p;

    .line 65
    .line 66
    invoke-static {p7}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    move-object v5, v0

    .line 70
    move v0, p1

    .line 71
    move-object p1, v4

    .line 72
    move-object v4, v5

    .line 73
    move-object v5, p6

    .line 74
    move-object p6, p3

    .line 75
    move-object p3, v5

    .line 76
    move-object v5, p5

    .line 77
    move-object p5, p4

    .line 78
    move-object p4, v5

    .line 79
    goto :goto_2

    .line 80
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 81
    .line 82
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 83
    .line 84
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    throw p1

    .line 88
    :cond_2
    invoke-static {p7}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    const/4 p7, 0x0

    .line 92
    :goto_1
    iget-object v2, p0, Lcoil3/intercept/EngineInterceptor;->a:Lcoil3/e;

    .line 93
    .line 94
    invoke-virtual {p2, p1, p5, v2, p7}, Lcoil3/a;->l(Lp/p;Ly/m;Lcoil3/e;I)Lkotlin/Pair;

    .line 95
    .line 96
    .line 97
    move-result-object p7

    .line 98
    if-eqz p7, :cond_7

    .line 99
    .line 100
    invoke-virtual {p7}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    check-cast v2, Lcoil3/decode/a;

    .line 105
    .line 106
    invoke-virtual {p7}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object p7

    .line 110
    check-cast p7, Ljava/lang/Number;

    .line 111
    .line 112
    invoke-virtual {p7}, Ljava/lang/Number;->intValue()I

    .line 113
    .line 114
    .line 115
    move-result p7

    .line 116
    add-int/2addr p7, v3

    .line 117
    invoke-virtual {p6, p3, v2, p5}, Lcoil3/b;->f(Ly/e;Lcoil3/decode/a;Ly/m;)V

    .line 118
    .line 119
    .line 120
    iput-object p1, v0, Lcoil3/intercept/EngineInterceptor$decode$1;->a:Ljava/lang/Object;

    .line 121
    .line 122
    iput-object p2, v0, Lcoil3/intercept/EngineInterceptor$decode$1;->b:Ljava/lang/Object;

    .line 123
    .line 124
    iput-object p3, v0, Lcoil3/intercept/EngineInterceptor$decode$1;->c:Ljava/lang/Object;

    .line 125
    .line 126
    iput-object p4, v0, Lcoil3/intercept/EngineInterceptor$decode$1;->d:Ljava/lang/Object;

    .line 127
    .line 128
    iput-object p5, v0, Lcoil3/intercept/EngineInterceptor$decode$1;->e:Ljava/lang/Object;

    .line 129
    .line 130
    iput-object p6, v0, Lcoil3/intercept/EngineInterceptor$decode$1;->f:Ljava/lang/Object;

    .line 131
    .line 132
    iput-object v2, v0, Lcoil3/intercept/EngineInterceptor$decode$1;->g:Ljava/lang/Object;

    .line 133
    .line 134
    iput p7, v0, Lcoil3/intercept/EngineInterceptor$decode$1;->h:I

    .line 135
    .line 136
    iput v3, v0, Lcoil3/intercept/EngineInterceptor$decode$1;->k:I

    .line 137
    .line 138
    invoke-interface {v2, v0}, Lcoil3/decode/a;->a(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v4

    .line 142
    if-ne v4, v1, :cond_3

    .line 143
    .line 144
    return-object v1

    .line 145
    :cond_3
    move-object v5, v2

    .line 146
    move-object v2, p2

    .line 147
    move-object p2, v5

    .line 148
    move-object v5, v0

    .line 149
    move v0, p7

    .line 150
    move-object p7, v4

    .line 151
    move-object v4, v5

    .line 152
    :goto_2
    check-cast p7, Ln/g;

    .line 153
    .line 154
    invoke-virtual {p6, p3, p2, p5, p7}, Lcoil3/b;->e(Ly/e;Lcoil3/decode/a;Ly/m;Ln/g;)V

    .line 155
    .line 156
    .line 157
    if-eqz p7, :cond_6

    .line 158
    .line 159
    new-instance p2, Lcoil3/intercept/EngineInterceptor$b;

    .line 160
    .line 161
    invoke-virtual {p7}, Ln/g;->a()Lk/j;

    .line 162
    .line 163
    .line 164
    move-result-object p3

    .line 165
    invoke-virtual {p7}, Ln/g;->b()Z

    .line 166
    .line 167
    .line 168
    move-result p4

    .line 169
    invoke-virtual {p1}, Lp/p;->a()Lcoil3/decode/DataSource;

    .line 170
    .line 171
    .line 172
    move-result-object p5

    .line 173
    invoke-virtual {p1}, Lp/p;->c()Ln/r;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    instance-of p6, p1, Ln/q;

    .line 178
    .line 179
    const/4 p7, 0x0

    .line 180
    if-eqz p6, :cond_4

    .line 181
    .line 182
    check-cast p1, Ln/q;

    .line 183
    .line 184
    goto :goto_3

    .line 185
    :cond_4
    move-object p1, p7

    .line 186
    :goto_3
    if-eqz p1, :cond_5

    .line 187
    .line 188
    invoke-virtual {p1}, Ln/q;->g()Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object p7

    .line 192
    :cond_5
    invoke-direct {p2, p3, p4, p5, p7}, Lcoil3/intercept/EngineInterceptor$b;-><init>(Lk/j;ZLcoil3/decode/DataSource;Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    return-object p2

    .line 196
    :cond_6
    move p7, v0

    .line 197
    move-object p2, v2

    .line 198
    move-object v0, v4

    .line 199
    goto :goto_1

    .line 200
    :cond_7
    new-instance p1, Ljava/lang/StringBuilder;

    .line 201
    .line 202
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 203
    .line 204
    .line 205
    const-string p2, "Unable to create a decoder that supports: "

    .line 206
    .line 207
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 208
    .line 209
    .line 210
    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 211
    .line 212
    .line 213
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object p1

    .line 217
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 218
    .line 219
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object p1

    .line 223
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    throw p2
.end method

.method public final h(Ly/e;Ljava/lang/Object;Ly/m;Lcoil3/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 15

    .line 1
    move-object/from16 v0, p5

    .line 2
    .line 3
    instance-of v2, v0, Lcoil3/intercept/EngineInterceptor$execute$1;

    .line 4
    .line 5
    if-eqz v2, :cond_0

    .line 6
    .line 7
    move-object v2, v0

    .line 8
    check-cast v2, Lcoil3/intercept/EngineInterceptor$execute$1;

    .line 9
    .line 10
    iget v3, v2, Lcoil3/intercept/EngineInterceptor$execute$1;->j:I

    .line 11
    .line 12
    const/high16 v4, -0x80000000

    .line 13
    .line 14
    and-int v5, v3, v4

    .line 15
    .line 16
    if-eqz v5, :cond_0

    .line 17
    .line 18
    sub-int/2addr v3, v4

    .line 19
    iput v3, v2, Lcoil3/intercept/EngineInterceptor$execute$1;->j:I

    .line 20
    .line 21
    :goto_0
    move-object v7, v2

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    new-instance v2, Lcoil3/intercept/EngineInterceptor$execute$1;

    .line 24
    .line 25
    invoke-direct {v2, p0, v0}, Lcoil3/intercept/EngineInterceptor$execute$1;-><init>(Lcoil3/intercept/EngineInterceptor;Lkotlin/coroutines/Continuation;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :goto_1
    iget-object v0, v7, Lcoil3/intercept/EngineInterceptor$execute$1;->h:Ljava/lang/Object;

    .line 30
    .line 31
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v9

    .line 35
    iget v2, v7, Lcoil3/intercept/EngineInterceptor$execute$1;->j:I

    .line 36
    .line 37
    const/4 v10, 0x3

    .line 38
    const/4 v11, 0x2

    .line 39
    const/4 v3, 0x1

    .line 40
    const/4 v12, 0x0

    .line 41
    if-eqz v2, :cond_4

    .line 42
    .line 43
    if-eq v2, v3, :cond_3

    .line 44
    .line 45
    if-eq v2, v11, :cond_2

    .line 46
    .line 47
    if-ne v2, v10, :cond_1

    .line 48
    .line 49
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    goto/16 :goto_8

    .line 53
    .line 54
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 55
    .line 56
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 57
    .line 58
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    throw v0

    .line 62
    :cond_2
    iget-object v2, v7, Lcoil3/intercept/EngineInterceptor$execute$1;->d:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v2, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 65
    .line 66
    iget-object v3, v7, Lcoil3/intercept/EngineInterceptor$execute$1;->c:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v3, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 69
    .line 70
    iget-object v4, v7, Lcoil3/intercept/EngineInterceptor$execute$1;->b:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v4, Lcoil3/b;

    .line 73
    .line 74
    iget-object v5, v7, Lcoil3/intercept/EngineInterceptor$execute$1;->a:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v5, Ly/e;

    .line 77
    .line 78
    :try_start_0
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 79
    .line 80
    .line 81
    move-object v14, v7

    .line 82
    goto/16 :goto_4

    .line 83
    .line 84
    :catchall_0
    move-exception v0

    .line 85
    goto/16 :goto_9

    .line 86
    .line 87
    :cond_3
    iget-object v2, v7, Lcoil3/intercept/EngineInterceptor$execute$1;->g:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v2, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 90
    .line 91
    iget-object v3, v7, Lcoil3/intercept/EngineInterceptor$execute$1;->f:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v3, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 94
    .line 95
    iget-object v4, v7, Lcoil3/intercept/EngineInterceptor$execute$1;->e:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v4, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 98
    .line 99
    iget-object v5, v7, Lcoil3/intercept/EngineInterceptor$execute$1;->d:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v5, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 102
    .line 103
    iget-object v6, v7, Lcoil3/intercept/EngineInterceptor$execute$1;->c:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast v6, Lcoil3/b;

    .line 106
    .line 107
    iget-object v8, v7, Lcoil3/intercept/EngineInterceptor$execute$1;->b:Ljava/lang/Object;

    .line 108
    .line 109
    iget-object v13, v7, Lcoil3/intercept/EngineInterceptor$execute$1;->a:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v13, Ly/e;

    .line 112
    .line 113
    :try_start_1
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 114
    .line 115
    .line 116
    move-object v14, v7

    .line 117
    move-object v7, v6

    .line 118
    move-object v6, v5

    .line 119
    move-object v5, v8

    .line 120
    move-object v8, v4

    .line 121
    move-object v4, v13

    .line 122
    goto/16 :goto_3

    .line 123
    .line 124
    :catchall_1
    move-exception v0

    .line 125
    move-object v2, v3

    .line 126
    goto/16 :goto_9

    .line 127
    .line 128
    :cond_4
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    new-instance v0, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 132
    .line 133
    invoke-direct {v0}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 134
    .line 135
    .line 136
    move-object/from16 v2, p3

    .line 137
    .line 138
    iput-object v2, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 139
    .line 140
    new-instance v8, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 141
    .line 142
    invoke-direct {v8}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 143
    .line 144
    .line 145
    iget-object v2, p0, Lcoil3/intercept/EngineInterceptor;->a:Lcoil3/e;

    .line 146
    .line 147
    invoke-interface {v2}, Lcoil3/e;->e()Lcoil3/a;

    .line 148
    .line 149
    .line 150
    move-result-object v2

    .line 151
    iput-object v2, v8, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 152
    .line 153
    new-instance v13, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 154
    .line 155
    invoke-direct {v13}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 156
    .line 157
    .line 158
    :try_start_2
    iget-object v2, p0, Lcoil3/intercept/EngineInterceptor;->c:Ly/o;

    .line 159
    .line 160
    iget-object v4, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 161
    .line 162
    check-cast v4, Ly/m;

    .line 163
    .line 164
    invoke-interface {v2, v4}, Ly/o;->e(Ly/m;)Ly/m;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    iput-object v2, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 169
    .line 170
    invoke-virtual/range {p1 .. p1}, Ly/e;->m()Lkotlin/Pair;

    .line 171
    .line 172
    .line 173
    move-result-object v2

    .line 174
    if-nez v2, :cond_5

    .line 175
    .line 176
    invoke-virtual/range {p1 .. p1}, Ly/e;->f()Lcoil3/decode/a$a;

    .line 177
    .line 178
    .line 179
    move-result-object v2

    .line 180
    if-eqz v2, :cond_6

    .line 181
    .line 182
    goto :goto_2

    .line 183
    :catchall_2
    move-exception v0

    .line 184
    move-object v2, v13

    .line 185
    goto/16 :goto_9

    .line 186
    .line 187
    :cond_5
    :goto_2
    iget-object v2, v8, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 188
    .line 189
    check-cast v2, Lcoil3/a;

    .line 190
    .line 191
    invoke-virtual {v2}, Lcoil3/a;->k()Lcoil3/a$a;

    .line 192
    .line 193
    .line 194
    move-result-object v2

    .line 195
    invoke-virtual/range {p1 .. p1}, Ly/e;->m()Lkotlin/Pair;

    .line 196
    .line 197
    .line 198
    move-result-object v4

    .line 199
    invoke-static {v2, v4}, Lcoil3/util/c;->e(Lcoil3/a$a;Lkotlin/Pair;)Lcoil3/a$a;

    .line 200
    .line 201
    .line 202
    move-result-object v2

    .line 203
    invoke-virtual/range {p1 .. p1}, Ly/e;->f()Lcoil3/decode/a$a;

    .line 204
    .line 205
    .line 206
    move-result-object v4

    .line 207
    invoke-static {v2, v4}, Lcoil3/util/c;->d(Lcoil3/a$a;Lcoil3/decode/a$a;)Lcoil3/a$a;

    .line 208
    .line 209
    .line 210
    move-result-object v2

    .line 211
    invoke-virtual {v2}, Lcoil3/a$a;->p()Lcoil3/a;

    .line 212
    .line 213
    .line 214
    move-result-object v2

    .line 215
    iput-object v2, v8, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 216
    .line 217
    :cond_6
    iget-object v2, v8, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 218
    .line 219
    check-cast v2, Lcoil3/a;

    .line 220
    .line 221
    iget-object v4, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 222
    .line 223
    move-object v5, v4

    .line 224
    check-cast v5, Ly/m;

    .line 225
    .line 226
    move-object/from16 v4, p1

    .line 227
    .line 228
    iput-object v4, v7, Lcoil3/intercept/EngineInterceptor$execute$1;->a:Ljava/lang/Object;

    .line 229
    .line 230
    move-object/from16 v6, p2

    .line 231
    .line 232
    iput-object v6, v7, Lcoil3/intercept/EngineInterceptor$execute$1;->b:Ljava/lang/Object;

    .line 233
    .line 234
    move-object/from16 v14, p4

    .line 235
    .line 236
    iput-object v14, v7, Lcoil3/intercept/EngineInterceptor$execute$1;->c:Ljava/lang/Object;

    .line 237
    .line 238
    iput-object v0, v7, Lcoil3/intercept/EngineInterceptor$execute$1;->d:Ljava/lang/Object;

    .line 239
    .line 240
    iput-object v8, v7, Lcoil3/intercept/EngineInterceptor$execute$1;->e:Ljava/lang/Object;

    .line 241
    .line 242
    iput-object v13, v7, Lcoil3/intercept/EngineInterceptor$execute$1;->f:Ljava/lang/Object;

    .line 243
    .line 244
    iput-object v13, v7, Lcoil3/intercept/EngineInterceptor$execute$1;->g:Ljava/lang/Object;

    .line 245
    .line 246
    iput v3, v7, Lcoil3/intercept/EngineInterceptor$execute$1;->j:I

    .line 247
    .line 248
    move-object v1, p0

    .line 249
    move-object v3, v4

    .line 250
    move-object v4, v6

    .line 251
    move-object v6, v14

    .line 252
    invoke-virtual/range {v1 .. v7}, Lcoil3/intercept/EngineInterceptor;->i(Lcoil3/a;Ly/e;Ljava/lang/Object;Ly/m;Lcoil3/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 256
    move-object v14, v7

    .line 257
    if-ne v2, v9, :cond_7

    .line 258
    .line 259
    goto/16 :goto_7

    .line 260
    .line 261
    :cond_7
    move-object/from16 v4, p1

    .line 262
    .line 263
    move-object/from16 v5, p2

    .line 264
    .line 265
    move-object/from16 v7, p4

    .line 266
    .line 267
    move-object v6, v0

    .line 268
    move-object v0, v2

    .line 269
    move-object v2, v13

    .line 270
    move-object v3, v2

    .line 271
    :goto_3
    :try_start_3
    iput-object v0, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 272
    .line 273
    iget-object v0, v3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 274
    .line 275
    move-object v1, v0

    .line 276
    check-cast v1, Lp/j;

    .line 277
    .line 278
    instance-of v2, v1, Lp/p;

    .line 279
    .line 280
    if-eqz v2, :cond_9

    .line 281
    .line 282
    invoke-virtual {v4}, Ly/e;->e()Lkotlin/coroutines/CoroutineContext;

    .line 283
    .line 284
    .line 285
    move-result-object v13

    .line 286
    new-instance v0, Lcoil3/intercept/EngineInterceptor$execute$executeResult$1;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 287
    .line 288
    move-object v2, v3

    .line 289
    move-object v3, v8

    .line 290
    const/4 v8, 0x0

    .line 291
    move-object v1, p0

    .line 292
    :try_start_4
    invoke-direct/range {v0 .. v8}, Lcoil3/intercept/EngineInterceptor$execute$executeResult$1;-><init>(Lcoil3/intercept/EngineInterceptor;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/internal/Ref$ObjectRef;Ly/e;Ljava/lang/Object;Lkotlin/jvm/internal/Ref$ObjectRef;Lcoil3/b;Lkotlin/coroutines/Continuation;)V

    .line 293
    .line 294
    .line 295
    iput-object v4, v14, Lcoil3/intercept/EngineInterceptor$execute$1;->a:Ljava/lang/Object;

    .line 296
    .line 297
    iput-object v7, v14, Lcoil3/intercept/EngineInterceptor$execute$1;->b:Ljava/lang/Object;

    .line 298
    .line 299
    iput-object v6, v14, Lcoil3/intercept/EngineInterceptor$execute$1;->c:Ljava/lang/Object;

    .line 300
    .line 301
    iput-object v2, v14, Lcoil3/intercept/EngineInterceptor$execute$1;->d:Ljava/lang/Object;

    .line 302
    .line 303
    iput-object v12, v14, Lcoil3/intercept/EngineInterceptor$execute$1;->e:Ljava/lang/Object;

    .line 304
    .line 305
    iput-object v12, v14, Lcoil3/intercept/EngineInterceptor$execute$1;->f:Ljava/lang/Object;

    .line 306
    .line 307
    iput-object v12, v14, Lcoil3/intercept/EngineInterceptor$execute$1;->g:Ljava/lang/Object;

    .line 308
    .line 309
    iput v11, v14, Lcoil3/intercept/EngineInterceptor$execute$1;->j:I

    .line 310
    .line 311
    invoke-static {v13, v0, v14}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    move-result-object v0

    .line 315
    if-ne v0, v9, :cond_8

    .line 316
    .line 317
    goto/16 :goto_7

    .line 318
    .line 319
    :cond_8
    move-object v5, v4

    .line 320
    move-object v3, v6

    .line 321
    move-object v4, v7

    .line 322
    :goto_4
    check-cast v0, Lcoil3/intercept/EngineInterceptor$b;

    .line 323
    .line 324
    move-object v6, v3

    .line 325
    move-object v7, v4

    .line 326
    move-object v4, v5

    .line 327
    move-object v3, v0

    .line 328
    goto :goto_5

    .line 329
    :cond_9
    move-object v2, v3

    .line 330
    instance-of v1, v1, Lp/m;

    .line 331
    .line 332
    if-eqz v1, :cond_d

    .line 333
    .line 334
    new-instance v1, Lcoil3/intercept/EngineInterceptor$b;

    .line 335
    .line 336
    check-cast v0, Lp/m;

    .line 337
    .line 338
    invoke-virtual {v0}, Lp/m;->b()Lk/j;

    .line 339
    .line 340
    .line 341
    move-result-object v0

    .line 342
    iget-object v3, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 343
    .line 344
    check-cast v3, Lp/m;

    .line 345
    .line 346
    invoke-virtual {v3}, Lp/m;->c()Z

    .line 347
    .line 348
    .line 349
    move-result v3

    .line 350
    iget-object v5, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 351
    .line 352
    check-cast v5, Lp/m;

    .line 353
    .line 354
    invoke-virtual {v5}, Lp/m;->a()Lcoil3/decode/DataSource;

    .line 355
    .line 356
    .line 357
    move-result-object v5

    .line 358
    invoke-direct {v1, v0, v3, v5, v12}, Lcoil3/intercept/EngineInterceptor$b;-><init>(Lk/j;ZLcoil3/decode/DataSource;Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 359
    .line 360
    .line 361
    move-object v3, v1

    .line 362
    :goto_5
    iget-object v0, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 363
    .line 364
    instance-of v1, v0, Lp/p;

    .line 365
    .line 366
    if-eqz v1, :cond_a

    .line 367
    .line 368
    check-cast v0, Lp/p;

    .line 369
    .line 370
    goto :goto_6

    .line 371
    :cond_a
    move-object v0, v12

    .line 372
    :goto_6
    if-eqz v0, :cond_b

    .line 373
    .line 374
    invoke-virtual {v0}, Lp/p;->c()Ln/r;

    .line 375
    .line 376
    .line 377
    move-result-object v0

    .line 378
    if-eqz v0, :cond_b

    .line 379
    .line 380
    invoke-static {v0}, Lcoil3/util/c;->i(Ljava/lang/AutoCloseable;)V

    .line 381
    .line 382
    .line 383
    :cond_b
    iget-object v0, v6, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 384
    .line 385
    move-object v5, v0

    .line 386
    check-cast v5, Ly/m;

    .line 387
    .line 388
    iput-object v12, v14, Lcoil3/intercept/EngineInterceptor$execute$1;->a:Ljava/lang/Object;

    .line 389
    .line 390
    iput-object v12, v14, Lcoil3/intercept/EngineInterceptor$execute$1;->b:Ljava/lang/Object;

    .line 391
    .line 392
    iput-object v12, v14, Lcoil3/intercept/EngineInterceptor$execute$1;->c:Ljava/lang/Object;

    .line 393
    .line 394
    iput-object v12, v14, Lcoil3/intercept/EngineInterceptor$execute$1;->d:Ljava/lang/Object;

    .line 395
    .line 396
    iput-object v12, v14, Lcoil3/intercept/EngineInterceptor$execute$1;->e:Ljava/lang/Object;

    .line 397
    .line 398
    iput-object v12, v14, Lcoil3/intercept/EngineInterceptor$execute$1;->f:Ljava/lang/Object;

    .line 399
    .line 400
    iput-object v12, v14, Lcoil3/intercept/EngineInterceptor$execute$1;->g:Ljava/lang/Object;

    .line 401
    .line 402
    iput v10, v14, Lcoil3/intercept/EngineInterceptor$execute$1;->j:I

    .line 403
    .line 404
    move-object v6, v7

    .line 405
    const/4 v7, 0x0

    .line 406
    move-object v8, v14

    .line 407
    invoke-static/range {v3 .. v8}, Lcoil3/intercept/EngineInterceptorKt;->a(Lcoil3/intercept/EngineInterceptor$b;Ly/e;Ly/m;Lcoil3/b;Lcoil3/util/Logger;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 408
    .line 409
    .line 410
    move-result-object v0

    .line 411
    if-ne v0, v9, :cond_c

    .line 412
    .line 413
    :goto_7
    return-object v9

    .line 414
    :cond_c
    :goto_8
    check-cast v0, Lcoil3/intercept/EngineInterceptor$b;

    .line 415
    .line 416
    invoke-virtual {v0}, Lcoil3/intercept/EngineInterceptor$b;->e()Lk/j;

    .line 417
    .line 418
    .line 419
    move-result-object v1

    .line 420
    invoke-static {v1}, Lcoil3/util/d;->k(Lk/j;)V

    .line 421
    .line 422
    .line 423
    return-object v0

    .line 424
    :cond_d
    :try_start_5
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    .line 425
    .line 426
    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 427
    .line 428
    .line 429
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 430
    :goto_9
    iget-object v1, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 431
    .line 432
    instance-of v2, v1, Lp/p;

    .line 433
    .line 434
    if-eqz v2, :cond_e

    .line 435
    .line 436
    move-object v12, v1

    .line 437
    check-cast v12, Lp/p;

    .line 438
    .line 439
    :cond_e
    if-eqz v12, :cond_f

    .line 440
    .line 441
    invoke-virtual {v12}, Lp/p;->c()Ln/r;

    .line 442
    .line 443
    .line 444
    move-result-object v1

    .line 445
    if-eqz v1, :cond_f

    .line 446
    .line 447
    invoke-static {v1}, Lcoil3/util/c;->i(Ljava/lang/AutoCloseable;)V

    .line 448
    .line 449
    .line 450
    :cond_f
    throw v0
.end method

.method public final i(Lcoil3/a;Ly/e;Ljava/lang/Object;Ly/m;Lcoil3/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p6, Lcoil3/intercept/EngineInterceptor$fetch$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p6

    .line 6
    check-cast v0, Lcoil3/intercept/EngineInterceptor$fetch$1;

    .line 7
    .line 8
    iget v1, v0, Lcoil3/intercept/EngineInterceptor$fetch$1;->j:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcoil3/intercept/EngineInterceptor$fetch$1;->j:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcoil3/intercept/EngineInterceptor$fetch$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p6}, Lcoil3/intercept/EngineInterceptor$fetch$1;-><init>(Lcoil3/intercept/EngineInterceptor;Lkotlin/coroutines/Continuation;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p6, v0, Lcoil3/intercept/EngineInterceptor$fetch$1;->h:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcoil3/intercept/EngineInterceptor$fetch$1;->j:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    iget p1, v0, Lcoil3/intercept/EngineInterceptor$fetch$1;->g:I

    .line 39
    .line 40
    iget-object p2, v0, Lcoil3/intercept/EngineInterceptor$fetch$1;->f:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p2, Lp/k;

    .line 43
    .line 44
    iget-object p3, v0, Lcoil3/intercept/EngineInterceptor$fetch$1;->e:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p3, Lcoil3/b;

    .line 47
    .line 48
    iget-object p4, v0, Lcoil3/intercept/EngineInterceptor$fetch$1;->d:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast p4, Ly/m;

    .line 51
    .line 52
    iget-object p5, v0, Lcoil3/intercept/EngineInterceptor$fetch$1;->c:Ljava/lang/Object;

    .line 53
    .line 54
    iget-object v2, v0, Lcoil3/intercept/EngineInterceptor$fetch$1;->b:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v2, Ly/e;

    .line 57
    .line 58
    iget-object v4, v0, Lcoil3/intercept/EngineInterceptor$fetch$1;->a:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v4, Lcoil3/a;

    .line 61
    .line 62
    invoke-static {p6}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    move-object v5, v0

    .line 66
    move v0, p1

    .line 67
    move-object p1, v4

    .line 68
    move-object v4, v5

    .line 69
    move-object v5, v2

    .line 70
    move-object v2, p2

    .line 71
    move-object p2, v5

    .line 72
    move-object v5, p5

    .line 73
    move-object p5, p3

    .line 74
    move-object p3, v5

    .line 75
    goto :goto_2

    .line 76
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 77
    .line 78
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 79
    .line 80
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    throw p1

    .line 84
    :cond_2
    invoke-static {p6}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    const/4 p6, 0x0

    .line 88
    :goto_1
    iget-object v2, p0, Lcoil3/intercept/EngineInterceptor;->a:Lcoil3/e;

    .line 89
    .line 90
    invoke-virtual {p1, p3, p4, v2, p6}, Lcoil3/a;->m(Ljava/lang/Object;Ly/m;Lcoil3/e;I)Lkotlin/Pair;

    .line 91
    .line 92
    .line 93
    move-result-object p6

    .line 94
    if-eqz p6, :cond_7

    .line 95
    .line 96
    invoke-virtual {p6}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    check-cast v2, Lp/k;

    .line 101
    .line 102
    invoke-virtual {p6}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p6

    .line 106
    check-cast p6, Ljava/lang/Number;

    .line 107
    .line 108
    invoke-virtual {p6}, Ljava/lang/Number;->intValue()I

    .line 109
    .line 110
    .line 111
    move-result p6

    .line 112
    add-int/2addr p6, v3

    .line 113
    invoke-virtual {p5, p2, v2, p4}, Lcoil3/b;->h(Ly/e;Lp/k;Ly/m;)V

    .line 114
    .line 115
    .line 116
    iput-object p1, v0, Lcoil3/intercept/EngineInterceptor$fetch$1;->a:Ljava/lang/Object;

    .line 117
    .line 118
    iput-object p2, v0, Lcoil3/intercept/EngineInterceptor$fetch$1;->b:Ljava/lang/Object;

    .line 119
    .line 120
    iput-object p3, v0, Lcoil3/intercept/EngineInterceptor$fetch$1;->c:Ljava/lang/Object;

    .line 121
    .line 122
    iput-object p4, v0, Lcoil3/intercept/EngineInterceptor$fetch$1;->d:Ljava/lang/Object;

    .line 123
    .line 124
    iput-object p5, v0, Lcoil3/intercept/EngineInterceptor$fetch$1;->e:Ljava/lang/Object;

    .line 125
    .line 126
    iput-object v2, v0, Lcoil3/intercept/EngineInterceptor$fetch$1;->f:Ljava/lang/Object;

    .line 127
    .line 128
    iput p6, v0, Lcoil3/intercept/EngineInterceptor$fetch$1;->g:I

    .line 129
    .line 130
    iput v3, v0, Lcoil3/intercept/EngineInterceptor$fetch$1;->j:I

    .line 131
    .line 132
    invoke-interface {v2, v0}, Lp/k;->a(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v4

    .line 136
    if-ne v4, v1, :cond_3

    .line 137
    .line 138
    return-object v1

    .line 139
    :cond_3
    move-object v5, v0

    .line 140
    move v0, p6

    .line 141
    move-object p6, v4

    .line 142
    move-object v4, v5

    .line 143
    :goto_2
    check-cast p6, Lp/j;

    .line 144
    .line 145
    :try_start_0
    invoke-virtual {p5, p2, v2, p4, p6}, Lcoil3/b;->g(Ly/e;Lp/k;Ly/m;Lp/j;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 146
    .line 147
    .line 148
    if-eqz p6, :cond_4

    .line 149
    .line 150
    return-object p6

    .line 151
    :cond_4
    move p6, v0

    .line 152
    move-object v0, v4

    .line 153
    goto :goto_1

    .line 154
    :catchall_0
    move-exception p1

    .line 155
    instance-of p2, p6, Lp/p;

    .line 156
    .line 157
    if-eqz p2, :cond_5

    .line 158
    .line 159
    check-cast p6, Lp/p;

    .line 160
    .line 161
    goto :goto_3

    .line 162
    :cond_5
    const/4 p6, 0x0

    .line 163
    :goto_3
    if-eqz p6, :cond_6

    .line 164
    .line 165
    invoke-virtual {p6}, Lp/p;->c()Ln/r;

    .line 166
    .line 167
    .line 168
    move-result-object p2

    .line 169
    if-eqz p2, :cond_6

    .line 170
    .line 171
    invoke-static {p2}, Lcoil3/util/c;->i(Ljava/lang/AutoCloseable;)V

    .line 172
    .line 173
    .line 174
    :cond_6
    throw p1

    .line 175
    :cond_7
    new-instance p1, Ljava/lang/StringBuilder;

    .line 176
    .line 177
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 178
    .line 179
    .line 180
    const-string p2, "Unable to create a fetcher that supports: "

    .line 181
    .line 182
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 186
    .line 187
    .line 188
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object p1

    .line 192
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 193
    .line 194
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object p1

    .line 198
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    throw p2
.end method
