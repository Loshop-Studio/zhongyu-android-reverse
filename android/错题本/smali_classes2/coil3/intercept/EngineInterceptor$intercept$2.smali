.class final Lcoil3/intercept/EngineInterceptor$intercept$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lr6/e;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lkotlinx/coroutines/v;",
        "Ls/n;",
        "<anonymous>",
        "(Lkotlinx/coroutines/v;)Ls/n;"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "coil3.intercept.EngineInterceptor$intercept$2"
    f = "EngineInterceptor.kt"
    i = {}
    l = {
        0x4d
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nEngineInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EngineInterceptor.kt\ncoil3/intercept/EngineInterceptor$intercept$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,272:1\n1#2:273\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $cacheKey:Lq/a;

.field final synthetic $chain:Lcoil3/intercept/d;

.field final synthetic $eventListener:Lcoil3/h;

.field final synthetic $mappedData:Ljava/lang/Object;

.field final synthetic $options:Ls/l;

.field final synthetic $request:Ls/f;

.field label:I

.field final synthetic this$0:Lcoil3/intercept/b;


# direct methods
.method public constructor <init>(Lcoil3/intercept/b;Ls/f;Ljava/lang/Object;Ls/l;Lcoil3/h;Lq/a;Lcoil3/intercept/d;Lh6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcoil3/intercept/b;",
            "Ls/f;",
            "Ljava/lang/Object;",
            "Ls/l;",
            "Lcoil3/h;",
            "Lq/a;",
            "Lcoil3/intercept/d;",
            "Lh6/c<",
            "-",
            "Lcoil3/intercept/EngineInterceptor$intercept$2;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcoil3/intercept/EngineInterceptor$intercept$2;->this$0:Lcoil3/intercept/b;

    .line 2
    .line 3
    iput-object p2, p0, Lcoil3/intercept/EngineInterceptor$intercept$2;->$request:Ls/f;

    .line 4
    .line 5
    iput-object p3, p0, Lcoil3/intercept/EngineInterceptor$intercept$2;->$mappedData:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p4, p0, Lcoil3/intercept/EngineInterceptor$intercept$2;->$options:Ls/l;

    .line 8
    .line 9
    iput-object p5, p0, Lcoil3/intercept/EngineInterceptor$intercept$2;->$eventListener:Lcoil3/h;

    .line 10
    .line 11
    iput-object p6, p0, Lcoil3/intercept/EngineInterceptor$intercept$2;->$cacheKey:Lq/a;

    .line 12
    .line 13
    iput-object p7, p0, Lcoil3/intercept/EngineInterceptor$intercept$2;->$chain:Lcoil3/intercept/d;

    .line 14
    .line 15
    const/4 p1, 0x2

    .line 16
    invoke-direct {p0, p1, p8}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILh6/c;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lh6/c;)Lh6/c;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lh6/c<",
            "*>;)",
            "Lh6/c<",
            "Ld6/s;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcoil3/intercept/EngineInterceptor$intercept$2;

    .line 2
    .line 3
    iget-object v1, p0, Lcoil3/intercept/EngineInterceptor$intercept$2;->this$0:Lcoil3/intercept/b;

    .line 4
    .line 5
    iget-object v2, p0, Lcoil3/intercept/EngineInterceptor$intercept$2;->$request:Ls/f;

    .line 6
    .line 7
    iget-object v3, p0, Lcoil3/intercept/EngineInterceptor$intercept$2;->$mappedData:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v4, p0, Lcoil3/intercept/EngineInterceptor$intercept$2;->$options:Ls/l;

    .line 10
    .line 11
    iget-object v5, p0, Lcoil3/intercept/EngineInterceptor$intercept$2;->$eventListener:Lcoil3/h;

    .line 12
    .line 13
    iget-object v6, p0, Lcoil3/intercept/EngineInterceptor$intercept$2;->$cacheKey:Lq/a;

    .line 14
    .line 15
    iget-object v7, p0, Lcoil3/intercept/EngineInterceptor$intercept$2;->$chain:Lcoil3/intercept/d;

    .line 16
    .line 17
    move-object v8, p2

    .line 18
    invoke-direct/range {v0 .. v8}, Lcoil3/intercept/EngineInterceptor$intercept$2;-><init>(Lcoil3/intercept/b;Ls/f;Ljava/lang/Object;Ls/l;Lcoil3/h;Lq/a;Lcoil3/intercept/d;Lh6/c;)V

    .line 19
    .line 20
    .line 21
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/v;

    check-cast p2, Lh6/c;

    invoke-virtual {p0, p1, p2}, Lcoil3/intercept/EngineInterceptor$intercept$2;->invoke(Lkotlinx/coroutines/v;Lh6/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/v;Lh6/c;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/v;",
            "Lh6/c<",
            "-",
            "Ls/n;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lcoil3/intercept/EngineInterceptor$intercept$2;->create(Ljava/lang/Object;Lh6/c;)Lh6/c;

    move-result-object p1

    check-cast p1, Lcoil3/intercept/EngineInterceptor$intercept$2;

    sget-object p2, Ld6/s;->a:Ld6/s;

    invoke-virtual {p1, p2}, Lcoil3/intercept/EngineInterceptor$intercept$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v5, p0

    .line 2
    .line 3
    sget-object v6, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 4
    .line 5
    iget v0, v5, Lcoil3/intercept/EngineInterceptor$intercept$2;->label:I

    .line 6
    .line 7
    const/4 v7, 0x1

    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    if-ne v0, v7, :cond_0

    .line 11
    .line 12
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    move-object/from16 v0, p1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 19
    .line 20
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 21
    .line 22
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw v0

    .line 26
    :cond_1
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    iget-object v0, v5, Lcoil3/intercept/EngineInterceptor$intercept$2;->this$0:Lcoil3/intercept/b;

    .line 30
    .line 31
    iget-object v1, v5, Lcoil3/intercept/EngineInterceptor$intercept$2;->$request:Ls/f;

    .line 32
    .line 33
    iget-object v2, v5, Lcoil3/intercept/EngineInterceptor$intercept$2;->$mappedData:Ljava/lang/Object;

    .line 34
    .line 35
    iget-object v3, v5, Lcoil3/intercept/EngineInterceptor$intercept$2;->$options:Ls/l;

    .line 36
    .line 37
    iget-object v4, v5, Lcoil3/intercept/EngineInterceptor$intercept$2;->$eventListener:Lcoil3/h;

    .line 38
    .line 39
    iput v7, v5, Lcoil3/intercept/EngineInterceptor$intercept$2;->label:I

    .line 40
    .line 41
    invoke-static/range {v0 .. v5}, Lcoil3/intercept/b;->b(Lcoil3/intercept/b;Ls/f;Ljava/lang/Object;Ls/l;Lcoil3/h;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    if-ne v0, v6, :cond_2

    .line 46
    .line 47
    return-object v6

    .line 48
    :cond_2
    :goto_0
    check-cast v0, Lcoil3/intercept/a;

    .line 49
    .line 50
    iget-object v1, v5, Lcoil3/intercept/EngineInterceptor$intercept$2;->this$0:Lcoil3/intercept/b;

    .line 51
    .line 52
    iget-object v1, v1, Lcoil3/intercept/b;->b:Lcoil3/util/a;

    .line 53
    .line 54
    monitor-enter v1

    .line 55
    :try_start_0
    iget-object v2, v1, Lcoil3/util/a;->a:Ljava/lang/ref/WeakReference;

    .line 56
    .line 57
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    check-cast v2, Lcoil3/r;

    .line 62
    .line 63
    if-eqz v2, :cond_3

    .line 64
    .line 65
    iget-object v3, v1, Lcoil3/util/a;->b:Landroid/content/Context;

    .line 66
    .line 67
    if-nez v3, :cond_4

    .line 68
    .line 69
    iget-object v2, v2, Lcoil3/r;->a:Lcoil3/q;

    .line 70
    .line 71
    iget-object v2, v2, Lcoil3/q;->a:Landroid/content/Context;

    .line 72
    .line 73
    iput-object v2, v1, Lcoil3/util/a;->b:Landroid/content/Context;

    .line 74
    .line 75
    invoke-virtual {v2, v1}, Landroid/content/Context;->registerComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    .line 76
    .line 77
    .line 78
    goto :goto_1

    .line 79
    :catchall_0
    move-exception v0

    .line 80
    goto/16 :goto_8

    .line 81
    .line 82
    :cond_3
    invoke-virtual {v1}, Lcoil3/util/a;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 83
    .line 84
    .line 85
    :cond_4
    :goto_1
    monitor-exit v1

    .line 86
    iget-object v1, v5, Lcoil3/intercept/EngineInterceptor$intercept$2;->this$0:Lcoil3/intercept/b;

    .line 87
    .line 88
    iget-object v1, v1, Lcoil3/intercept/b;->d:Lq/d;

    .line 89
    .line 90
    iget-object v9, v5, Lcoil3/intercept/EngineInterceptor$intercept$2;->$cacheKey:Lq/a;

    .line 91
    .line 92
    iget-object v2, v5, Lcoil3/intercept/EngineInterceptor$intercept$2;->$request:Ls/f;

    .line 93
    .line 94
    const/4 v3, 0x0

    .line 95
    if-eqz v9, :cond_6

    .line 96
    .line 97
    iget-object v2, v2, Ls/f;->i:Lcoil3/request/CachePolicy;

    .line 98
    .line 99
    invoke-virtual {v2}, Lcoil3/request/CachePolicy;->getWriteEnabled()Z

    .line 100
    .line 101
    .line 102
    move-result v2

    .line 103
    if-eqz v2, :cond_6

    .line 104
    .line 105
    iget-object v2, v0, Lcoil3/intercept/a;->a:Lcoil3/k;

    .line 106
    .line 107
    invoke-interface {v2}, Lcoil3/k;->a()Z

    .line 108
    .line 109
    .line 110
    move-result v2

    .line 111
    if-nez v2, :cond_5

    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_5
    iget-object v1, v1, Lq/d;->a:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast v1, Lcoil3/r;

    .line 117
    .line 118
    invoke-virtual {v1}, Lcoil3/r;->d()Lq/e;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    if-nez v1, :cond_7

    .line 123
    .line 124
    :cond_6
    :goto_2
    move v1, v3

    .line 125
    goto :goto_4

    .line 126
    :cond_7
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 127
    .line 128
    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 129
    .line 130
    .line 131
    const-string v4, "coil#is_sampled"

    .line 132
    .line 133
    iget-boolean v6, v0, Lcoil3/intercept/a;->b:Z

    .line 134
    .line 135
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 136
    .line 137
    .line 138
    move-result-object v6

    .line 139
    invoke-interface {v2, v4, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    iget-object v4, v0, Lcoil3/intercept/a;->d:Ljava/lang/String;

    .line 143
    .line 144
    if-eqz v4, :cond_8

    .line 145
    .line 146
    const-string v6, "coil#disk_cache_key"

    .line 147
    .line 148
    invoke-interface {v2, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    :cond_8
    iget-object v10, v0, Lcoil3/intercept/a;->a:Lcoil3/k;

    .line 152
    .line 153
    invoke-static {v2}, Lt6/a;->x(Ljava/util/Map;)Ljava/util/Map;

    .line 154
    .line 155
    .line 156
    move-result-object v11

    .line 157
    const-string v2, "Image size must be non-negative: "

    .line 158
    .line 159
    iget-object v4, v1, Lq/e;->c:Ljava/lang/Object;

    .line 160
    .line 161
    monitor-enter v4

    .line 162
    :try_start_1
    invoke-interface {v10}, Lcoil3/k;->getSize()J

    .line 163
    .line 164
    .line 165
    move-result-wide v12

    .line 166
    const-wide/16 v14, 0x0

    .line 167
    .line 168
    cmp-long v6, v12, v14

    .line 169
    .line 170
    if-ltz v6, :cond_9

    .line 171
    .line 172
    iget-object v8, v1, Lq/e;->a:Lq/i;

    .line 173
    .line 174
    invoke-interface/range {v8 .. v13}, Lq/i;->w(Lq/a;Lcoil3/k;Ljava/util/Map;J)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 175
    .line 176
    .line 177
    monitor-exit v4

    .line 178
    move v1, v7

    .line 179
    goto :goto_4

    .line 180
    :catchall_1
    move-exception v0

    .line 181
    goto :goto_3

    .line 182
    :cond_9
    :try_start_2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 183
    .line 184
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v0, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 195
    .line 196
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 204
    :goto_3
    monitor-exit v4

    .line 205
    throw v0

    .line 206
    :goto_4
    iget-object v9, v0, Lcoil3/intercept/a;->a:Lcoil3/k;

    .line 207
    .line 208
    iget-object v10, v5, Lcoil3/intercept/EngineInterceptor$intercept$2;->$request:Ls/f;

    .line 209
    .line 210
    iget-object v11, v0, Lcoil3/intercept/a;->c:Lcoil3/decode/DataSource;

    .line 211
    .line 212
    iget-object v2, v5, Lcoil3/intercept/EngineInterceptor$intercept$2;->$cacheKey:Lq/a;

    .line 213
    .line 214
    if-eqz v1, :cond_a

    .line 215
    .line 216
    :goto_5
    move-object v12, v2

    .line 217
    goto :goto_6

    .line 218
    :cond_a
    const/4 v2, 0x0

    .line 219
    goto :goto_5

    .line 220
    :goto_6
    iget-object v13, v0, Lcoil3/intercept/a;->d:Ljava/lang/String;

    .line 221
    .line 222
    iget-boolean v14, v0, Lcoil3/intercept/a;->b:Z

    .line 223
    .line 224
    iget-object v0, v5, Lcoil3/intercept/EngineInterceptor$intercept$2;->$chain:Lcoil3/intercept/d;

    .line 225
    .line 226
    instance-of v1, v0, Lcoil3/intercept/e;

    .line 227
    .line 228
    if-eqz v1, :cond_b

    .line 229
    .line 230
    check-cast v0, Lcoil3/intercept/e;

    .line 231
    .line 232
    iget-boolean v0, v0, Lcoil3/intercept/e;->g:Z

    .line 233
    .line 234
    if-eqz v0, :cond_b

    .line 235
    .line 236
    move v15, v7

    .line 237
    goto :goto_7

    .line 238
    :cond_b
    move v15, v3

    .line 239
    :goto_7
    new-instance v8, Ls/n;

    .line 240
    .line 241
    invoke-direct/range {v8 .. v15}, Ls/n;-><init>(Lcoil3/k;Ls/f;Lcoil3/decode/DataSource;Lq/a;Ljava/lang/String;ZZ)V

    .line 242
    .line 243
    .line 244
    return-object v8

    .line 245
    :goto_8
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 246
    throw v0
.end method
