.class public final Ly/e$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Landroid/content/Context;

.field public b:Ly/e$b;

.field public c:Ljava/lang/Object;

.field public d:Lc0/a;

.field public e:Ly/e$d;

.field public f:Ljava/lang/String;

.field public g:Z

.field public h:Ljava/lang/Object;

.field public i:Ljava/lang/String;

.field public j:Lokio/FileSystem;

.field public k:Lkotlin/Pair;

.field public l:Lcoil3/decode/a$a;

.field public m:Lkotlin/coroutines/CoroutineContext;

.field public n:Lkotlin/coroutines/CoroutineContext;

.field public o:Lkotlin/coroutines/CoroutineContext;

.field public p:Lcoil3/request/CachePolicy;

.field public q:Lcoil3/request/CachePolicy;

.field public r:Lcoil3/request/CachePolicy;

.field public s:Lt/d$b;

.field public t:Lkotlin/jvm/functions/Function1;

.field public u:Lkotlin/jvm/functions/Function1;

.field public v:Lkotlin/jvm/functions/Function1;

.field public w:Lz/g;

.field public x:Lcoil3/size/Scale;

.field public y:Lcoil3/size/Precision;

.field public z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ly/e$a;->a:Landroid/content/Context;

    .line 3
    sget-object p1, Ly/e$b;->p:Ly/e$b;

    iput-object p1, p0, Ly/e$a;->b:Ly/e$b;

    const/4 p1, 0x0

    .line 4
    iput-object p1, p0, Ly/e$a;->c:Ljava/lang/Object;

    .line 5
    iput-object p1, p0, Ly/e$a;->d:Lc0/a;

    .line 6
    iput-object p1, p0, Ly/e$a;->e:Ly/e$d;

    .line 7
    iput-object p1, p0, Ly/e$a;->f:Ljava/lang/String;

    .line 8
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Ly/e$a;->h:Ljava/lang/Object;

    .line 9
    iput-object p1, p0, Ly/e$a;->i:Ljava/lang/String;

    .line 10
    iput-object p1, p0, Ly/e$a;->j:Lokio/FileSystem;

    .line 11
    iput-object p1, p0, Ly/e$a;->k:Lkotlin/Pair;

    .line 12
    iput-object p1, p0, Ly/e$a;->l:Lcoil3/decode/a$a;

    .line 13
    iput-object p1, p0, Ly/e$a;->m:Lkotlin/coroutines/CoroutineContext;

    .line 14
    iput-object p1, p0, Ly/e$a;->n:Lkotlin/coroutines/CoroutineContext;

    .line 15
    iput-object p1, p0, Ly/e$a;->o:Lkotlin/coroutines/CoroutineContext;

    .line 16
    iput-object p1, p0, Ly/e$a;->p:Lcoil3/request/CachePolicy;

    .line 17
    iput-object p1, p0, Ly/e$a;->q:Lcoil3/request/CachePolicy;

    .line 18
    iput-object p1, p0, Ly/e$a;->r:Lcoil3/request/CachePolicy;

    .line 19
    iput-object p1, p0, Ly/e$a;->s:Lt/d$b;

    .line 20
    invoke-static {}, Lcoil3/util/c;->k()Lkotlin/jvm/functions/Function1;

    move-result-object v0

    iput-object v0, p0, Ly/e$a;->t:Lkotlin/jvm/functions/Function1;

    .line 21
    invoke-static {}, Lcoil3/util/c;->k()Lkotlin/jvm/functions/Function1;

    move-result-object v0

    iput-object v0, p0, Ly/e$a;->u:Lkotlin/jvm/functions/Function1;

    .line 22
    invoke-static {}, Lcoil3/util/c;->k()Lkotlin/jvm/functions/Function1;

    move-result-object v0

    iput-object v0, p0, Ly/e$a;->v:Lkotlin/jvm/functions/Function1;

    .line 23
    iput-object p1, p0, Ly/e$a;->w:Lz/g;

    .line 24
    iput-object p1, p0, Ly/e$a;->x:Lcoil3/size/Scale;

    .line 25
    iput-object p1, p0, Ly/e$a;->y:Lcoil3/size/Precision;

    .line 26
    sget-object p1, Lcoil3/c;->c:Lcoil3/c;

    iput-object p1, p0, Ly/e$a;->z:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ly/e;Landroid/content/Context;)V
    .locals 0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-object p2, p0, Ly/e$a;->a:Landroid/content/Context;

    .line 29
    invoke-virtual {p1}, Ly/e;->g()Ly/e$b;

    move-result-object p2

    iput-object p2, p0, Ly/e$a;->b:Ly/e$b;

    .line 30
    invoke-virtual {p1}, Ly/e;->d()Ljava/lang/Object;

    move-result-object p2

    iput-object p2, p0, Ly/e$a;->c:Ljava/lang/Object;

    .line 31
    invoke-virtual {p1}, Ly/e;->y()Lc0/a;

    move-result-object p2

    iput-object p2, p0, Ly/e$a;->d:Lc0/a;

    .line 32
    invoke-virtual {p1}, Ly/e;->p()Ly/e$d;

    move-result-object p2

    iput-object p2, p0, Ly/e$a;->e:Ly/e$d;

    .line 33
    invoke-virtual {p1}, Ly/e;->q()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Ly/e$a;->f:Ljava/lang/String;

    .line 34
    invoke-virtual {p1}, Ly/e;->r()Ljava/util/Map;

    move-result-object p2

    iput-object p2, p0, Ly/e$a;->h:Ljava/lang/Object;

    .line 35
    invoke-virtual {p1}, Ly/e;->i()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Ly/e$a;->i:Ljava/lang/String;

    .line 36
    invoke-virtual {p1}, Ly/e;->h()Ly/e$c;

    move-result-object p2

    invoke-virtual {p2}, Ly/e$c;->f()Lokio/FileSystem;

    move-result-object p2

    iput-object p2, p0, Ly/e$a;->j:Lokio/FileSystem;

    .line 37
    invoke-virtual {p1}, Ly/e;->m()Lkotlin/Pair;

    move-result-object p2

    iput-object p2, p0, Ly/e$a;->k:Lkotlin/Pair;

    .line 38
    invoke-virtual {p1}, Ly/e;->f()Lcoil3/decode/a$a;

    move-result-object p2

    iput-object p2, p0, Ly/e$a;->l:Lcoil3/decode/a$a;

    .line 39
    invoke-virtual {p1}, Ly/e;->h()Ly/e$c;

    move-result-object p2

    invoke-virtual {p2}, Ly/e$c;->g()Lkotlin/coroutines/CoroutineContext;

    move-result-object p2

    iput-object p2, p0, Ly/e$a;->m:Lkotlin/coroutines/CoroutineContext;

    .line 40
    invoke-virtual {p1}, Ly/e;->h()Ly/e$c;

    move-result-object p2

    invoke-virtual {p2}, Ly/e$c;->e()Lkotlin/coroutines/CoroutineContext;

    move-result-object p2

    iput-object p2, p0, Ly/e$a;->n:Lkotlin/coroutines/CoroutineContext;

    .line 41
    invoke-virtual {p1}, Ly/e;->h()Ly/e$c;

    move-result-object p2

    invoke-virtual {p2}, Ly/e$c;->a()Lkotlin/coroutines/CoroutineContext;

    move-result-object p2

    iput-object p2, p0, Ly/e$a;->o:Lkotlin/coroutines/CoroutineContext;

    .line 42
    invoke-virtual {p1}, Ly/e;->h()Ly/e$c;

    move-result-object p2

    invoke-virtual {p2}, Ly/e$c;->h()Lcoil3/request/CachePolicy;

    move-result-object p2

    iput-object p2, p0, Ly/e$a;->p:Lcoil3/request/CachePolicy;

    .line 43
    invoke-virtual {p1}, Ly/e;->h()Ly/e$c;

    move-result-object p2

    invoke-virtual {p2}, Ly/e$c;->b()Lcoil3/request/CachePolicy;

    move-result-object p2

    iput-object p2, p0, Ly/e$a;->q:Lcoil3/request/CachePolicy;

    .line 44
    invoke-virtual {p1}, Ly/e;->h()Ly/e$c;

    move-result-object p2

    invoke-virtual {p2}, Ly/e$c;->i()Lcoil3/request/CachePolicy;

    move-result-object p2

    iput-object p2, p0, Ly/e$a;->r:Lcoil3/request/CachePolicy;

    .line 45
    invoke-virtual {p1}, Ly/e;->u()Lt/d$b;

    move-result-object p2

    iput-object p2, p0, Ly/e$a;->s:Lt/d$b;

    .line 46
    invoke-virtual {p1}, Ly/e;->h()Ly/e$c;

    move-result-object p2

    invoke-virtual {p2}, Ly/e$c;->j()Lkotlin/jvm/functions/Function1;

    move-result-object p2

    iput-object p2, p0, Ly/e$a;->t:Lkotlin/jvm/functions/Function1;

    .line 47
    invoke-virtual {p1}, Ly/e;->h()Ly/e$c;

    move-result-object p2

    invoke-virtual {p2}, Ly/e$c;->c()Lkotlin/jvm/functions/Function1;

    move-result-object p2

    iput-object p2, p0, Ly/e$a;->u:Lkotlin/jvm/functions/Function1;

    .line 48
    invoke-virtual {p1}, Ly/e;->h()Ly/e$c;

    move-result-object p2

    invoke-virtual {p2}, Ly/e$c;->d()Lkotlin/jvm/functions/Function1;

    move-result-object p2

    iput-object p2, p0, Ly/e$a;->v:Lkotlin/jvm/functions/Function1;

    .line 49
    invoke-virtual {p1}, Ly/e;->h()Ly/e$c;

    move-result-object p2

    invoke-virtual {p2}, Ly/e$c;->m()Lz/g;

    move-result-object p2

    iput-object p2, p0, Ly/e$a;->w:Lz/g;

    .line 50
    invoke-virtual {p1}, Ly/e;->h()Ly/e$c;

    move-result-object p2

    invoke-virtual {p2}, Ly/e$c;->l()Lcoil3/size/Scale;

    move-result-object p2

    iput-object p2, p0, Ly/e$a;->x:Lcoil3/size/Scale;

    .line 51
    invoke-virtual {p1}, Ly/e;->h()Ly/e$c;

    move-result-object p2

    invoke-virtual {p2}, Ly/e$c;->k()Lcoil3/size/Precision;

    move-result-object p2

    iput-object p2, p0, Ly/e$a;->y:Lcoil3/size/Precision;

    .line 52
    invoke-virtual {p1}, Ly/e;->k()Lcoil3/c;

    move-result-object p1

    iput-object p1, p0, Ly/e$a;->z:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a()Ly/e;
    .locals 41

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v2, v0, Ly/e$a;->a:Landroid/content/Context;

    .line 4
    .line 5
    iget-object v1, v0, Ly/e$a;->c:Ljava/lang/Object;

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    sget-object v1, Ly/k;->a:Ly/k;

    .line 10
    .line 11
    :cond_0
    move-object v3, v1

    .line 12
    iget-object v4, v0, Ly/e$a;->d:Lc0/a;

    .line 13
    .line 14
    iget-object v5, v0, Ly/e$a;->e:Ly/e$d;

    .line 15
    .line 16
    iget-object v6, v0, Ly/e$a;->f:Ljava/lang/String;

    .line 17
    .line 18
    iget-object v1, v0, Ly/e$a;->h:Ljava/lang/Object;

    .line 19
    .line 20
    iget-boolean v7, v0, Ly/e$a;->g:Z

    .line 21
    .line 22
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 23
    .line 24
    .line 25
    move-result-object v7

    .line 26
    invoke-static {v1, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v7

    .line 30
    if-eqz v7, :cond_1

    .line 31
    .line 32
    const-string v7, "null cannot be cast to non-null type kotlin.collections.MutableMap<*, *>"

    .line 33
    .line 34
    invoke-static {v1, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-static {v1}, Lkotlin/jvm/internal/TypeIntrinsics;->asMutableMap(Ljava/lang/Object;)Ljava/util/Map;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-static {v1}, Le0/b;->d(Ljava/util/Map;)Ljava/util/Map;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    :goto_0
    move-object v7, v1

    .line 46
    goto :goto_1

    .line 47
    :cond_1
    instance-of v7, v1, Ljava/util/Map;

    .line 48
    .line 49
    if-eqz v7, :cond_11

    .line 50
    .line 51
    check-cast v1, Ljava/util/Map;

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :goto_1
    const-string v1, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>"

    .line 55
    .line 56
    invoke-static {v7, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    iget-object v8, v0, Ly/e$a;->i:Ljava/lang/String;

    .line 60
    .line 61
    iget-object v1, v0, Ly/e$a;->j:Lokio/FileSystem;

    .line 62
    .line 63
    if-nez v1, :cond_2

    .line 64
    .line 65
    iget-object v1, v0, Ly/e$a;->b:Ly/e$b;

    .line 66
    .line 67
    invoke-virtual {v1}, Ly/e$b;->i()Lokio/FileSystem;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    :cond_2
    move-object v9, v1

    .line 72
    iget-object v10, v0, Ly/e$a;->k:Lkotlin/Pair;

    .line 73
    .line 74
    iget-object v11, v0, Ly/e$a;->l:Lcoil3/decode/a$a;

    .line 75
    .line 76
    iget-object v1, v0, Ly/e$a;->p:Lcoil3/request/CachePolicy;

    .line 77
    .line 78
    if-nez v1, :cond_3

    .line 79
    .line 80
    iget-object v1, v0, Ly/e$a;->b:Ly/e$b;

    .line 81
    .line 82
    invoke-virtual {v1}, Ly/e$b;->k()Lcoil3/request/CachePolicy;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    :cond_3
    move-object v15, v1

    .line 87
    iget-object v1, v0, Ly/e$a;->q:Lcoil3/request/CachePolicy;

    .line 88
    .line 89
    if-nez v1, :cond_4

    .line 90
    .line 91
    iget-object v1, v0, Ly/e$a;->b:Ly/e$b;

    .line 92
    .line 93
    invoke-virtual {v1}, Ly/e$b;->d()Lcoil3/request/CachePolicy;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    :cond_4
    move-object/from16 v16, v1

    .line 98
    .line 99
    iget-object v1, v0, Ly/e$a;->r:Lcoil3/request/CachePolicy;

    .line 100
    .line 101
    if-nez v1, :cond_5

    .line 102
    .line 103
    iget-object v1, v0, Ly/e$a;->b:Ly/e$b;

    .line 104
    .line 105
    invoke-virtual {v1}, Ly/e$b;->l()Lcoil3/request/CachePolicy;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    :cond_5
    move-object/from16 v17, v1

    .line 110
    .line 111
    iget-object v1, v0, Ly/e$a;->m:Lkotlin/coroutines/CoroutineContext;

    .line 112
    .line 113
    if-nez v1, :cond_6

    .line 114
    .line 115
    iget-object v1, v0, Ly/e$a;->b:Ly/e$b;

    .line 116
    .line 117
    invoke-virtual {v1}, Ly/e$b;->j()Lkotlin/coroutines/CoroutineContext;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    :cond_6
    move-object v12, v1

    .line 122
    iget-object v1, v0, Ly/e$a;->n:Lkotlin/coroutines/CoroutineContext;

    .line 123
    .line 124
    if-nez v1, :cond_7

    .line 125
    .line 126
    iget-object v1, v0, Ly/e$a;->b:Ly/e$b;

    .line 127
    .line 128
    invoke-virtual {v1}, Ly/e$b;->h()Lkotlin/coroutines/CoroutineContext;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    :cond_7
    move-object v13, v1

    .line 133
    iget-object v1, v0, Ly/e$a;->o:Lkotlin/coroutines/CoroutineContext;

    .line 134
    .line 135
    if-nez v1, :cond_8

    .line 136
    .line 137
    iget-object v1, v0, Ly/e$a;->b:Ly/e$b;

    .line 138
    .line 139
    invoke-virtual {v1}, Ly/e$b;->c()Lkotlin/coroutines/CoroutineContext;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    :cond_8
    move-object v14, v1

    .line 144
    iget-object v1, v0, Ly/e$a;->s:Lt/d$b;

    .line 145
    .line 146
    move-object/from16 v18, v1

    .line 147
    .line 148
    iget-object v1, v0, Ly/e$a;->t:Lkotlin/jvm/functions/Function1;

    .line 149
    .line 150
    if-nez v1, :cond_9

    .line 151
    .line 152
    iget-object v1, v0, Ly/e$a;->b:Ly/e$b;

    .line 153
    .line 154
    invoke-virtual {v1}, Ly/e$b;->m()Lkotlin/jvm/functions/Function1;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    :cond_9
    move-object/from16 v19, v1

    .line 159
    .line 160
    iget-object v1, v0, Ly/e$a;->u:Lkotlin/jvm/functions/Function1;

    .line 161
    .line 162
    if-nez v1, :cond_a

    .line 163
    .line 164
    iget-object v1, v0, Ly/e$a;->b:Ly/e$b;

    .line 165
    .line 166
    invoke-virtual {v1}, Ly/e$b;->e()Lkotlin/jvm/functions/Function1;

    .line 167
    .line 168
    .line 169
    move-result-object v1

    .line 170
    :cond_a
    move-object/from16 v20, v1

    .line 171
    .line 172
    iget-object v1, v0, Ly/e$a;->v:Lkotlin/jvm/functions/Function1;

    .line 173
    .line 174
    if-nez v1, :cond_b

    .line 175
    .line 176
    iget-object v1, v0, Ly/e$a;->b:Ly/e$b;

    .line 177
    .line 178
    invoke-virtual {v1}, Ly/e$b;->g()Lkotlin/jvm/functions/Function1;

    .line 179
    .line 180
    .line 181
    move-result-object v1

    .line 182
    :cond_b
    move-object/from16 v21, v1

    .line 183
    .line 184
    iget-object v1, v0, Ly/e$a;->w:Lz/g;

    .line 185
    .line 186
    if-nez v1, :cond_c

    .line 187
    .line 188
    iget-object v1, v0, Ly/e$a;->b:Ly/e$b;

    .line 189
    .line 190
    invoke-virtual {v1}, Ly/e$b;->p()Lz/g;

    .line 191
    .line 192
    .line 193
    move-result-object v1

    .line 194
    :cond_c
    move-object/from16 v22, v1

    .line 195
    .line 196
    iget-object v1, v0, Ly/e$a;->x:Lcoil3/size/Scale;

    .line 197
    .line 198
    if-nez v1, :cond_d

    .line 199
    .line 200
    iget-object v1, v0, Ly/e$a;->b:Ly/e$b;

    .line 201
    .line 202
    invoke-virtual {v1}, Ly/e$b;->o()Lcoil3/size/Scale;

    .line 203
    .line 204
    .line 205
    move-result-object v1

    .line 206
    :cond_d
    move-object/from16 v23, v1

    .line 207
    .line 208
    iget-object v1, v0, Ly/e$a;->y:Lcoil3/size/Precision;

    .line 209
    .line 210
    if-nez v1, :cond_e

    .line 211
    .line 212
    iget-object v1, v0, Ly/e$a;->b:Ly/e$b;

    .line 213
    .line 214
    invoke-virtual {v1}, Ly/e$b;->n()Lcoil3/size/Precision;

    .line 215
    .line 216
    .line 217
    move-result-object v1

    .line 218
    :cond_e
    move-object/from16 v24, v1

    .line 219
    .line 220
    iget-object v1, v0, Ly/e$a;->z:Ljava/lang/Object;

    .line 221
    .line 222
    move-object/from16 v25, v2

    .line 223
    .line 224
    instance-of v2, v1, Lcoil3/c$a;

    .line 225
    .line 226
    if-eqz v2, :cond_f

    .line 227
    .line 228
    check-cast v1, Lcoil3/c$a;

    .line 229
    .line 230
    invoke-virtual {v1}, Lcoil3/c$a;->a()Lcoil3/c;

    .line 231
    .line 232
    .line 233
    move-result-object v1

    .line 234
    goto :goto_2

    .line 235
    :cond_f
    instance-of v2, v1, Lcoil3/c;

    .line 236
    .line 237
    if-eqz v2, :cond_10

    .line 238
    .line 239
    check-cast v1, Lcoil3/c;

    .line 240
    .line 241
    :goto_2
    iget-object v2, v0, Ly/e$a;->j:Lokio/FileSystem;

    .line 242
    .line 243
    move-object/from16 v40, v1

    .line 244
    .line 245
    iget-object v1, v0, Ly/e$a;->m:Lkotlin/coroutines/CoroutineContext;

    .line 246
    .line 247
    move-object/from16 v28, v1

    .line 248
    .line 249
    iget-object v1, v0, Ly/e$a;->n:Lkotlin/coroutines/CoroutineContext;

    .line 250
    .line 251
    move-object/from16 v29, v1

    .line 252
    .line 253
    iget-object v1, v0, Ly/e$a;->o:Lkotlin/coroutines/CoroutineContext;

    .line 254
    .line 255
    move-object/from16 v30, v1

    .line 256
    .line 257
    iget-object v1, v0, Ly/e$a;->t:Lkotlin/jvm/functions/Function1;

    .line 258
    .line 259
    move-object/from16 v34, v1

    .line 260
    .line 261
    iget-object v1, v0, Ly/e$a;->u:Lkotlin/jvm/functions/Function1;

    .line 262
    .line 263
    move-object/from16 v35, v1

    .line 264
    .line 265
    iget-object v1, v0, Ly/e$a;->v:Lkotlin/jvm/functions/Function1;

    .line 266
    .line 267
    move-object/from16 v36, v1

    .line 268
    .line 269
    iget-object v1, v0, Ly/e$a;->p:Lcoil3/request/CachePolicy;

    .line 270
    .line 271
    move-object/from16 v31, v1

    .line 272
    .line 273
    iget-object v1, v0, Ly/e$a;->q:Lcoil3/request/CachePolicy;

    .line 274
    .line 275
    move-object/from16 v32, v1

    .line 276
    .line 277
    iget-object v1, v0, Ly/e$a;->r:Lcoil3/request/CachePolicy;

    .line 278
    .line 279
    move-object/from16 v33, v1

    .line 280
    .line 281
    iget-object v1, v0, Ly/e$a;->w:Lz/g;

    .line 282
    .line 283
    move-object/from16 v37, v1

    .line 284
    .line 285
    iget-object v1, v0, Ly/e$a;->x:Lcoil3/size/Scale;

    .line 286
    .line 287
    move-object/from16 v38, v1

    .line 288
    .line 289
    iget-object v1, v0, Ly/e$a;->y:Lcoil3/size/Precision;

    .line 290
    .line 291
    new-instance v26, Ly/e$c;

    .line 292
    .line 293
    move-object/from16 v39, v1

    .line 294
    .line 295
    move-object/from16 v27, v2

    .line 296
    .line 297
    invoke-direct/range {v26 .. v39}, Ly/e$c;-><init>(Lokio/FileSystem;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Lcoil3/request/CachePolicy;Lcoil3/request/CachePolicy;Lcoil3/request/CachePolicy;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lz/g;Lcoil3/size/Scale;Lcoil3/size/Precision;)V

    .line 298
    .line 299
    .line 300
    iget-object v1, v0, Ly/e$a;->b:Ly/e$b;

    .line 301
    .line 302
    move-object/from16 v27, v1

    .line 303
    .line 304
    new-instance v1, Ly/e;

    .line 305
    .line 306
    const/16 v28, 0x0

    .line 307
    .line 308
    move-object/from16 v2, v25

    .line 309
    .line 310
    move-object/from16 v25, v40

    .line 311
    .line 312
    invoke-direct/range {v1 .. v28}, Ly/e;-><init>(Landroid/content/Context;Ljava/lang/Object;Lc0/a;Ly/e$d;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lokio/FileSystem;Lkotlin/Pair;Lcoil3/decode/a$a;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Lcoil3/request/CachePolicy;Lcoil3/request/CachePolicy;Lcoil3/request/CachePolicy;Lt/d$b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lz/g;Lcoil3/size/Scale;Lcoil3/size/Precision;Lcoil3/c;Ly/e$c;Ly/e$b;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 313
    .line 314
    .line 315
    return-object v1

    .line 316
    :cond_10
    new-instance v1, Ljava/lang/AssertionError;

    .line 317
    .line 318
    invoke-direct {v1}, Ljava/lang/AssertionError;-><init>()V

    .line 319
    .line 320
    .line 321
    throw v1

    .line 322
    :cond_11
    new-instance v1, Ljava/lang/AssertionError;

    .line 323
    .line 324
    invoke-direct {v1}, Ljava/lang/AssertionError;-><init>()V

    .line 325
    .line 326
    .line 327
    throw v1
.end method

.method public final b(Lkotlin/coroutines/CoroutineContext;)Ly/e$a;
    .locals 0

    .line 1
    iput-object p1, p0, Ly/e$a;->m:Lkotlin/coroutines/CoroutineContext;

    .line 2
    .line 3
    iput-object p1, p0, Ly/e$a;->n:Lkotlin/coroutines/CoroutineContext;

    .line 4
    .line 5
    iput-object p1, p0, Ly/e$a;->o:Lkotlin/coroutines/CoroutineContext;

    .line 6
    .line 7
    return-object p0
.end method

.method public final c(Ljava/lang/Object;)Ly/e$a;
    .locals 0

    .line 1
    iput-object p1, p0, Ly/e$a;->c:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public final d(Lcoil3/decode/a$a;)Ly/e$a;
    .locals 0

    .line 1
    iput-object p1, p0, Ly/e$a;->l:Lcoil3/decode/a$a;

    .line 2
    .line 3
    return-object p0
.end method

.method public final e(Ly/e$b;)Ly/e$a;
    .locals 0

    .line 1
    iput-object p1, p0, Ly/e$a;->b:Ly/e$b;

    .line 2
    .line 3
    return-object p0
.end method

.method public final f(Lkotlin/jvm/functions/Function1;)Ly/e$a;
    .locals 0

    .line 1
    iput-object p1, p0, Ly/e$a;->u:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    return-object p0
.end method

.method public final g(Lkotlin/jvm/functions/Function1;)Ly/e$a;
    .locals 0

    .line 1
    iput-object p1, p0, Ly/e$a;->t:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    return-object p0
.end method

.method public final h(Lcoil3/size/Precision;)Ly/e$a;
    .locals 0

    .line 1
    iput-object p1, p0, Ly/e$a;->y:Lcoil3/size/Precision;

    .line 2
    .line 3
    return-object p0
.end method

.method public final i(Lcoil3/size/Scale;)Ly/e$a;
    .locals 0

    .line 1
    iput-object p1, p0, Ly/e$a;->x:Lcoil3/size/Scale;

    .line 2
    .line 3
    return-object p0
.end method

.method public final j(Lz/g;)Ly/e$a;
    .locals 0

    .line 1
    iput-object p1, p0, Ly/e$a;->w:Lz/g;

    .line 2
    .line 3
    return-object p0
.end method

.method public final k(Lc0/a;)Ly/e$a;
    .locals 0

    .line 1
    iput-object p1, p0, Ly/e$a;->d:Lc0/a;

    .line 2
    .line 3
    return-object p0
.end method
