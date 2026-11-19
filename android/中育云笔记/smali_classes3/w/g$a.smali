.class public final Lw/g$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Landroid/content/Context;

.field public b:Lw/g$b;

.field public c:Ljava/lang/Object;

.field public d:Ly/a;

.field public e:Lw/g$d;

.field public f:Ljava/lang/String;

.field public g:Z

.field public h:Ljava/lang/Object;

.field public i:Ljava/lang/String;

.field public j:Lokio/FileSystem;

.field public k:Lkotlin/Pair;

.field public l:Lcoil3/decode/a$a;

.field public m:Lkotlin/coroutines/d;

.field public n:Lkotlin/coroutines/d;

.field public o:Lkotlin/coroutines/d;

.field public p:Lcoil3/request/CachePolicy;

.field public q:Lcoil3/request/CachePolicy;

.field public r:Lcoil3/request/CachePolicy;

.field public s:Lr/d$b;

.field public t:Lhd/l;

.field public u:Lhd/l;

.field public v:Lhd/l;

.field public w:Lx/g;

.field public x:Lcoil3/size/Scale;

.field public y:Lcoil3/size/Precision;

.field public z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lw/g$a;->a:Landroid/content/Context;

    .line 3
    sget-object p1, Lw/g$b;->p:Lw/g$b;

    iput-object p1, p0, Lw/g$a;->b:Lw/g$b;

    const/4 p1, 0x0

    .line 4
    iput-object p1, p0, Lw/g$a;->c:Ljava/lang/Object;

    .line 5
    iput-object p1, p0, Lw/g$a;->d:Ly/a;

    .line 6
    iput-object p1, p0, Lw/g$a;->e:Lw/g$d;

    .line 7
    iput-object p1, p0, Lw/g$a;->f:Ljava/lang/String;

    .line 8
    invoke-static {}, Lkotlin/collections/a;->h()Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lw/g$a;->h:Ljava/lang/Object;

    .line 9
    iput-object p1, p0, Lw/g$a;->i:Ljava/lang/String;

    .line 10
    iput-object p1, p0, Lw/g$a;->j:Lokio/FileSystem;

    .line 11
    iput-object p1, p0, Lw/g$a;->k:Lkotlin/Pair;

    .line 12
    iput-object p1, p0, Lw/g$a;->l:Lcoil3/decode/a$a;

    .line 13
    iput-object p1, p0, Lw/g$a;->m:Lkotlin/coroutines/d;

    .line 14
    iput-object p1, p0, Lw/g$a;->n:Lkotlin/coroutines/d;

    .line 15
    iput-object p1, p0, Lw/g$a;->o:Lkotlin/coroutines/d;

    .line 16
    iput-object p1, p0, Lw/g$a;->p:Lcoil3/request/CachePolicy;

    .line 17
    iput-object p1, p0, Lw/g$a;->q:Lcoil3/request/CachePolicy;

    .line 18
    iput-object p1, p0, Lw/g$a;->r:Lcoil3/request/CachePolicy;

    .line 19
    iput-object p1, p0, Lw/g$a;->s:Lr/d$b;

    .line 20
    invoke-static {}, Lcoil3/util/c;->k()Lhd/l;

    move-result-object v0

    iput-object v0, p0, Lw/g$a;->t:Lhd/l;

    .line 21
    invoke-static {}, Lcoil3/util/c;->k()Lhd/l;

    move-result-object v0

    iput-object v0, p0, Lw/g$a;->u:Lhd/l;

    .line 22
    invoke-static {}, Lcoil3/util/c;->k()Lhd/l;

    move-result-object v0

    iput-object v0, p0, Lw/g$a;->v:Lhd/l;

    .line 23
    iput-object p1, p0, Lw/g$a;->w:Lx/g;

    .line 24
    iput-object p1, p0, Lw/g$a;->x:Lcoil3/size/Scale;

    .line 25
    iput-object p1, p0, Lw/g$a;->y:Lcoil3/size/Precision;

    .line 26
    sget-object p1, Lcoil3/c;->c:Lcoil3/c;

    iput-object p1, p0, Lw/g$a;->z:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lw/g;Landroid/content/Context;)V
    .locals 0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-object p2, p0, Lw/g$a;->a:Landroid/content/Context;

    .line 29
    invoke-virtual {p1}, Lw/g;->g()Lw/g$b;

    move-result-object p2

    iput-object p2, p0, Lw/g$a;->b:Lw/g$b;

    .line 30
    invoke-virtual {p1}, Lw/g;->d()Ljava/lang/Object;

    move-result-object p2

    iput-object p2, p0, Lw/g$a;->c:Ljava/lang/Object;

    .line 31
    invoke-virtual {p1}, Lw/g;->y()Ly/a;

    move-result-object p2

    iput-object p2, p0, Lw/g$a;->d:Ly/a;

    .line 32
    invoke-virtual {p1}, Lw/g;->p()Lw/g$d;

    move-result-object p2

    iput-object p2, p0, Lw/g$a;->e:Lw/g$d;

    .line 33
    invoke-virtual {p1}, Lw/g;->q()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lw/g$a;->f:Ljava/lang/String;

    .line 34
    invoke-virtual {p1}, Lw/g;->r()Ljava/util/Map;

    move-result-object p2

    iput-object p2, p0, Lw/g$a;->h:Ljava/lang/Object;

    .line 35
    invoke-virtual {p1}, Lw/g;->i()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lw/g$a;->i:Ljava/lang/String;

    .line 36
    invoke-virtual {p1}, Lw/g;->h()Lw/g$c;

    move-result-object p2

    invoke-virtual {p2}, Lw/g$c;->f()Lokio/FileSystem;

    move-result-object p2

    iput-object p2, p0, Lw/g$a;->j:Lokio/FileSystem;

    .line 37
    invoke-virtual {p1}, Lw/g;->m()Lkotlin/Pair;

    move-result-object p2

    iput-object p2, p0, Lw/g$a;->k:Lkotlin/Pair;

    .line 38
    invoke-virtual {p1}, Lw/g;->f()Lcoil3/decode/a$a;

    move-result-object p2

    iput-object p2, p0, Lw/g$a;->l:Lcoil3/decode/a$a;

    .line 39
    invoke-virtual {p1}, Lw/g;->h()Lw/g$c;

    move-result-object p2

    invoke-virtual {p2}, Lw/g$c;->g()Lkotlin/coroutines/d;

    move-result-object p2

    iput-object p2, p0, Lw/g$a;->m:Lkotlin/coroutines/d;

    .line 40
    invoke-virtual {p1}, Lw/g;->h()Lw/g$c;

    move-result-object p2

    invoke-virtual {p2}, Lw/g$c;->e()Lkotlin/coroutines/d;

    move-result-object p2

    iput-object p2, p0, Lw/g$a;->n:Lkotlin/coroutines/d;

    .line 41
    invoke-virtual {p1}, Lw/g;->h()Lw/g$c;

    move-result-object p2

    invoke-virtual {p2}, Lw/g$c;->a()Lkotlin/coroutines/d;

    move-result-object p2

    iput-object p2, p0, Lw/g$a;->o:Lkotlin/coroutines/d;

    .line 42
    invoke-virtual {p1}, Lw/g;->h()Lw/g$c;

    move-result-object p2

    invoke-virtual {p2}, Lw/g$c;->h()Lcoil3/request/CachePolicy;

    move-result-object p2

    iput-object p2, p0, Lw/g$a;->p:Lcoil3/request/CachePolicy;

    .line 43
    invoke-virtual {p1}, Lw/g;->h()Lw/g$c;

    move-result-object p2

    invoke-virtual {p2}, Lw/g$c;->b()Lcoil3/request/CachePolicy;

    move-result-object p2

    iput-object p2, p0, Lw/g$a;->q:Lcoil3/request/CachePolicy;

    .line 44
    invoke-virtual {p1}, Lw/g;->h()Lw/g$c;

    move-result-object p2

    invoke-virtual {p2}, Lw/g$c;->i()Lcoil3/request/CachePolicy;

    move-result-object p2

    iput-object p2, p0, Lw/g$a;->r:Lcoil3/request/CachePolicy;

    .line 45
    invoke-virtual {p1}, Lw/g;->u()Lr/d$b;

    move-result-object p2

    iput-object p2, p0, Lw/g$a;->s:Lr/d$b;

    .line 46
    invoke-virtual {p1}, Lw/g;->h()Lw/g$c;

    move-result-object p2

    invoke-virtual {p2}, Lw/g$c;->j()Lhd/l;

    move-result-object p2

    iput-object p2, p0, Lw/g$a;->t:Lhd/l;

    .line 47
    invoke-virtual {p1}, Lw/g;->h()Lw/g$c;

    move-result-object p2

    invoke-virtual {p2}, Lw/g$c;->c()Lhd/l;

    move-result-object p2

    iput-object p2, p0, Lw/g$a;->u:Lhd/l;

    .line 48
    invoke-virtual {p1}, Lw/g;->h()Lw/g$c;

    move-result-object p2

    invoke-virtual {p2}, Lw/g$c;->d()Lhd/l;

    move-result-object p2

    iput-object p2, p0, Lw/g$a;->v:Lhd/l;

    .line 49
    invoke-virtual {p1}, Lw/g;->h()Lw/g$c;

    move-result-object p2

    invoke-virtual {p2}, Lw/g$c;->m()Lx/g;

    move-result-object p2

    iput-object p2, p0, Lw/g$a;->w:Lx/g;

    .line 50
    invoke-virtual {p1}, Lw/g;->h()Lw/g$c;

    move-result-object p2

    invoke-virtual {p2}, Lw/g$c;->l()Lcoil3/size/Scale;

    move-result-object p2

    iput-object p2, p0, Lw/g$a;->x:Lcoil3/size/Scale;

    .line 51
    invoke-virtual {p1}, Lw/g;->h()Lw/g$c;

    move-result-object p2

    invoke-virtual {p2}, Lw/g$c;->k()Lcoil3/size/Precision;

    move-result-object p2

    iput-object p2, p0, Lw/g$a;->y:Lcoil3/size/Precision;

    .line 52
    invoke-virtual {p1}, Lw/g;->k()Lcoil3/c;

    move-result-object p1

    iput-object p1, p0, Lw/g$a;->z:Ljava/lang/Object;

    return-void
.end method

.method public static synthetic a(Lk/j;Lw/g;)Lk/j;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lw/g$a;->o(Lk/j;Lw/g;)Lk/j;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lk/j;Lw/g;)Lk/j;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lw/g$a;->i(Lk/j;Lw/g;)Lk/j;

    move-result-object p0

    return-object p0
.end method

.method public static final i(Lk/j;Lw/g;)Lk/j;
    .locals 0

    .line 1
    return-object p0
.end method

.method public static final o(Lk/j;Lw/g;)Lk/j;
    .locals 0

    .line 1
    return-object p0
.end method


# virtual methods
.method public final c()Lw/g;
    .locals 41

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v2, v0, Lw/g$a;->a:Landroid/content/Context;

    .line 4
    .line 5
    iget-object v1, v0, Lw/g$a;->c:Ljava/lang/Object;

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    sget-object v1, Lw/l;->a:Lw/l;

    .line 10
    .line 11
    :cond_0
    move-object v3, v1

    .line 12
    iget-object v4, v0, Lw/g$a;->d:Ly/a;

    .line 13
    .line 14
    iget-object v5, v0, Lw/g$a;->e:Lw/g$d;

    .line 15
    .line 16
    iget-object v6, v0, Lw/g$a;->f:Ljava/lang/String;

    .line 17
    .line 18
    iget-object v1, v0, Lw/g$a;->h:Ljava/lang/Object;

    .line 19
    .line 20
    iget-boolean v7, v0, Lw/g$a;->g:Z

    .line 21
    .line 22
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 23
    .line 24
    .line 25
    move-result-object v7

    .line 26
    invoke-static {v1, v7}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    invoke-static {v1, v7}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-static {v1}, Lkotlin/jvm/internal/d0;->d(Ljava/lang/Object;)Ljava/util/Map;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-static {v1}, La0/b;->d(Ljava/util/Map;)Ljava/util/Map;

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
    invoke-static {v7, v1}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    iget-object v8, v0, Lw/g$a;->i:Ljava/lang/String;

    .line 60
    .line 61
    iget-object v1, v0, Lw/g$a;->j:Lokio/FileSystem;

    .line 62
    .line 63
    if-nez v1, :cond_2

    .line 64
    .line 65
    iget-object v1, v0, Lw/g$a;->b:Lw/g$b;

    .line 66
    .line 67
    invoke-virtual {v1}, Lw/g$b;->i()Lokio/FileSystem;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    :cond_2
    move-object v9, v1

    .line 72
    iget-object v10, v0, Lw/g$a;->k:Lkotlin/Pair;

    .line 73
    .line 74
    iget-object v11, v0, Lw/g$a;->l:Lcoil3/decode/a$a;

    .line 75
    .line 76
    iget-object v1, v0, Lw/g$a;->p:Lcoil3/request/CachePolicy;

    .line 77
    .line 78
    if-nez v1, :cond_3

    .line 79
    .line 80
    iget-object v1, v0, Lw/g$a;->b:Lw/g$b;

    .line 81
    .line 82
    invoke-virtual {v1}, Lw/g$b;->k()Lcoil3/request/CachePolicy;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    :cond_3
    move-object v15, v1

    .line 87
    iget-object v1, v0, Lw/g$a;->q:Lcoil3/request/CachePolicy;

    .line 88
    .line 89
    if-nez v1, :cond_4

    .line 90
    .line 91
    iget-object v1, v0, Lw/g$a;->b:Lw/g$b;

    .line 92
    .line 93
    invoke-virtual {v1}, Lw/g$b;->d()Lcoil3/request/CachePolicy;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    :cond_4
    move-object/from16 v16, v1

    .line 98
    .line 99
    iget-object v1, v0, Lw/g$a;->r:Lcoil3/request/CachePolicy;

    .line 100
    .line 101
    if-nez v1, :cond_5

    .line 102
    .line 103
    iget-object v1, v0, Lw/g$a;->b:Lw/g$b;

    .line 104
    .line 105
    invoke-virtual {v1}, Lw/g$b;->l()Lcoil3/request/CachePolicy;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    :cond_5
    move-object/from16 v17, v1

    .line 110
    .line 111
    iget-object v1, v0, Lw/g$a;->m:Lkotlin/coroutines/d;

    .line 112
    .line 113
    if-nez v1, :cond_6

    .line 114
    .line 115
    iget-object v1, v0, Lw/g$a;->b:Lw/g$b;

    .line 116
    .line 117
    invoke-virtual {v1}, Lw/g$b;->j()Lkotlin/coroutines/d;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    :cond_6
    move-object v12, v1

    .line 122
    iget-object v1, v0, Lw/g$a;->n:Lkotlin/coroutines/d;

    .line 123
    .line 124
    if-nez v1, :cond_7

    .line 125
    .line 126
    iget-object v1, v0, Lw/g$a;->b:Lw/g$b;

    .line 127
    .line 128
    invoke-virtual {v1}, Lw/g$b;->h()Lkotlin/coroutines/d;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    :cond_7
    move-object v13, v1

    .line 133
    iget-object v1, v0, Lw/g$a;->o:Lkotlin/coroutines/d;

    .line 134
    .line 135
    if-nez v1, :cond_8

    .line 136
    .line 137
    iget-object v1, v0, Lw/g$a;->b:Lw/g$b;

    .line 138
    .line 139
    invoke-virtual {v1}, Lw/g$b;->c()Lkotlin/coroutines/d;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    :cond_8
    move-object v14, v1

    .line 144
    iget-object v1, v0, Lw/g$a;->s:Lr/d$b;

    .line 145
    .line 146
    move-object/from16 v18, v1

    .line 147
    .line 148
    iget-object v1, v0, Lw/g$a;->t:Lhd/l;

    .line 149
    .line 150
    if-nez v1, :cond_9

    .line 151
    .line 152
    iget-object v1, v0, Lw/g$a;->b:Lw/g$b;

    .line 153
    .line 154
    invoke-virtual {v1}, Lw/g$b;->m()Lhd/l;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    :cond_9
    move-object/from16 v19, v1

    .line 159
    .line 160
    iget-object v1, v0, Lw/g$a;->u:Lhd/l;

    .line 161
    .line 162
    if-nez v1, :cond_a

    .line 163
    .line 164
    iget-object v1, v0, Lw/g$a;->b:Lw/g$b;

    .line 165
    .line 166
    invoke-virtual {v1}, Lw/g$b;->e()Lhd/l;

    .line 167
    .line 168
    .line 169
    move-result-object v1

    .line 170
    :cond_a
    move-object/from16 v20, v1

    .line 171
    .line 172
    iget-object v1, v0, Lw/g$a;->v:Lhd/l;

    .line 173
    .line 174
    if-nez v1, :cond_b

    .line 175
    .line 176
    iget-object v1, v0, Lw/g$a;->b:Lw/g$b;

    .line 177
    .line 178
    invoke-virtual {v1}, Lw/g$b;->g()Lhd/l;

    .line 179
    .line 180
    .line 181
    move-result-object v1

    .line 182
    :cond_b
    move-object/from16 v21, v1

    .line 183
    .line 184
    iget-object v1, v0, Lw/g$a;->w:Lx/g;

    .line 185
    .line 186
    if-nez v1, :cond_c

    .line 187
    .line 188
    iget-object v1, v0, Lw/g$a;->b:Lw/g$b;

    .line 189
    .line 190
    invoke-virtual {v1}, Lw/g$b;->p()Lx/g;

    .line 191
    .line 192
    .line 193
    move-result-object v1

    .line 194
    :cond_c
    move-object/from16 v22, v1

    .line 195
    .line 196
    iget-object v1, v0, Lw/g$a;->x:Lcoil3/size/Scale;

    .line 197
    .line 198
    if-nez v1, :cond_d

    .line 199
    .line 200
    iget-object v1, v0, Lw/g$a;->b:Lw/g$b;

    .line 201
    .line 202
    invoke-virtual {v1}, Lw/g$b;->o()Lcoil3/size/Scale;

    .line 203
    .line 204
    .line 205
    move-result-object v1

    .line 206
    :cond_d
    move-object/from16 v23, v1

    .line 207
    .line 208
    iget-object v1, v0, Lw/g$a;->y:Lcoil3/size/Precision;

    .line 209
    .line 210
    if-nez v1, :cond_e

    .line 211
    .line 212
    iget-object v1, v0, Lw/g$a;->b:Lw/g$b;

    .line 213
    .line 214
    invoke-virtual {v1}, Lw/g$b;->n()Lcoil3/size/Precision;

    .line 215
    .line 216
    .line 217
    move-result-object v1

    .line 218
    :cond_e
    move-object/from16 v24, v1

    .line 219
    .line 220
    iget-object v1, v0, Lw/g$a;->z:Ljava/lang/Object;

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
    iget-object v2, v0, Lw/g$a;->j:Lokio/FileSystem;

    .line 242
    .line 243
    move-object/from16 v40, v1

    .line 244
    .line 245
    iget-object v1, v0, Lw/g$a;->m:Lkotlin/coroutines/d;

    .line 246
    .line 247
    move-object/from16 v28, v1

    .line 248
    .line 249
    iget-object v1, v0, Lw/g$a;->n:Lkotlin/coroutines/d;

    .line 250
    .line 251
    move-object/from16 v29, v1

    .line 252
    .line 253
    iget-object v1, v0, Lw/g$a;->o:Lkotlin/coroutines/d;

    .line 254
    .line 255
    move-object/from16 v30, v1

    .line 256
    .line 257
    iget-object v1, v0, Lw/g$a;->t:Lhd/l;

    .line 258
    .line 259
    move-object/from16 v34, v1

    .line 260
    .line 261
    iget-object v1, v0, Lw/g$a;->u:Lhd/l;

    .line 262
    .line 263
    move-object/from16 v35, v1

    .line 264
    .line 265
    iget-object v1, v0, Lw/g$a;->v:Lhd/l;

    .line 266
    .line 267
    move-object/from16 v36, v1

    .line 268
    .line 269
    iget-object v1, v0, Lw/g$a;->p:Lcoil3/request/CachePolicy;

    .line 270
    .line 271
    move-object/from16 v31, v1

    .line 272
    .line 273
    iget-object v1, v0, Lw/g$a;->q:Lcoil3/request/CachePolicy;

    .line 274
    .line 275
    move-object/from16 v32, v1

    .line 276
    .line 277
    iget-object v1, v0, Lw/g$a;->r:Lcoil3/request/CachePolicy;

    .line 278
    .line 279
    move-object/from16 v33, v1

    .line 280
    .line 281
    iget-object v1, v0, Lw/g$a;->w:Lx/g;

    .line 282
    .line 283
    move-object/from16 v37, v1

    .line 284
    .line 285
    iget-object v1, v0, Lw/g$a;->x:Lcoil3/size/Scale;

    .line 286
    .line 287
    move-object/from16 v38, v1

    .line 288
    .line 289
    iget-object v1, v0, Lw/g$a;->y:Lcoil3/size/Precision;

    .line 290
    .line 291
    new-instance v26, Lw/g$c;

    .line 292
    .line 293
    move-object/from16 v39, v1

    .line 294
    .line 295
    move-object/from16 v27, v2

    .line 296
    .line 297
    invoke-direct/range {v26 .. v39}, Lw/g$c;-><init>(Lokio/FileSystem;Lkotlin/coroutines/d;Lkotlin/coroutines/d;Lkotlin/coroutines/d;Lcoil3/request/CachePolicy;Lcoil3/request/CachePolicy;Lcoil3/request/CachePolicy;Lhd/l;Lhd/l;Lhd/l;Lx/g;Lcoil3/size/Scale;Lcoil3/size/Precision;)V

    .line 298
    .line 299
    .line 300
    iget-object v1, v0, Lw/g$a;->b:Lw/g$b;

    .line 301
    .line 302
    move-object/from16 v27, v1

    .line 303
    .line 304
    new-instance v1, Lw/g;

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
    invoke-direct/range {v1 .. v28}, Lw/g;-><init>(Landroid/content/Context;Ljava/lang/Object;Ly/a;Lw/g$d;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lokio/FileSystem;Lkotlin/Pair;Lcoil3/decode/a$a;Lkotlin/coroutines/d;Lkotlin/coroutines/d;Lkotlin/coroutines/d;Lcoil3/request/CachePolicy;Lcoil3/request/CachePolicy;Lcoil3/request/CachePolicy;Lr/d$b;Lhd/l;Lhd/l;Lhd/l;Lx/g;Lcoil3/size/Scale;Lcoil3/size/Precision;Lcoil3/c;Lw/g$c;Lw/g$b;Lkotlin/jvm/internal/n;)V

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

.method public final d(Ljava/lang/Object;)Lw/g$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lw/g$a;->c:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public final e(Lw/g$b;)Lw/g$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lw/g$a;->b:Lw/g$b;

    .line 2
    .line 3
    return-object p0
.end method

.method public final f(Lcoil3/request/CachePolicy;)Lw/g$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lw/g$a;->q:Lcoil3/request/CachePolicy;

    .line 2
    .line 3
    return-object p0
.end method

.method public final g(Lhd/l;)Lw/g$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lw/g$a;->u:Lhd/l;

    .line 2
    .line 3
    return-object p0
.end method

.method public final h(Lk/j;)Lw/g$a;
    .locals 1

    .line 1
    new-instance v0, Lw/e;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lw/e;-><init>(Lk/j;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lw/g$a;->g(Lhd/l;)Lw/g$a;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method

.method public final j(Lw/g$d;)Lw/g$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lw/g$a;->e:Lw/g$d;

    .line 2
    .line 3
    return-object p0
.end method

.method public final k(Lcoil3/request/CachePolicy;)Lw/g$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lw/g$a;->p:Lcoil3/request/CachePolicy;

    .line 2
    .line 3
    return-object p0
.end method

.method public final l(Lcoil3/request/CachePolicy;)Lw/g$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lw/g$a;->r:Lcoil3/request/CachePolicy;

    .line 2
    .line 3
    return-object p0
.end method

.method public final m(Lhd/l;)Lw/g$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lw/g$a;->t:Lhd/l;

    .line 2
    .line 3
    return-object p0
.end method

.method public final n(Lk/j;)Lw/g$a;
    .locals 1

    .line 1
    new-instance v0, Lw/f;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lw/f;-><init>(Lk/j;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lw/g$a;->m(Lhd/l;)Lw/g$a;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method

.method public final p(Lcoil3/size/Precision;)Lw/g$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lw/g$a;->y:Lcoil3/size/Precision;

    .line 2
    .line 3
    return-object p0
.end method

.method public final q(Lcoil3/size/Scale;)Lw/g$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lw/g$a;->x:Lcoil3/size/Scale;

    .line 2
    .line 3
    return-object p0
.end method

.method public final r(Lx/g;)Lw/g$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lw/g$a;->w:Lx/g;

    .line 2
    .line 3
    return-object p0
.end method

.method public final s(Ly/a;)Lw/g$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lw/g$a;->d:Ly/a;

    .line 2
    .line 3
    return-object p0
.end method
