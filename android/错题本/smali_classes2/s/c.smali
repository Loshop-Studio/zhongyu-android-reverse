.class public final Ls/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public b:Ls/d;

.field public c:Ljava/lang/Object;

.field public d:Lu/a;

.field public final e:Ljava/util/Map;

.field public f:Lh6/h;

.field public g:Lh6/h;

.field public h:Lh6/h;

.field public i:Lcoil3/request/CachePolicy;

.field public j:Lcoil3/request/CachePolicy;

.field public final k:Lr6/c;

.field public final l:Lr6/c;

.field public final m:Lr6/c;

.field public n:Lt/g;

.field public o:Lcoil3/size/Scale;

.field public p:Lcoil3/size/Precision;

.field public q:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ls/c;->a:Landroid/content/Context;

    .line 3
    sget-object p1, Ls/d;->o:Ls/d;

    iput-object p1, p0, Ls/c;->b:Ls/d;

    const/4 p1, 0x0

    .line 4
    iput-object p1, p0, Ls/c;->c:Ljava/lang/Object;

    .line 5
    iput-object p1, p0, Ls/c;->d:Lu/a;

    .line 6
    invoke-static {}, Lkotlin/collections/e0;->A()Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Ls/c;->e:Ljava/util/Map;

    .line 7
    iput-object p1, p0, Ls/c;->f:Lh6/h;

    .line 8
    iput-object p1, p0, Ls/c;->g:Lh6/h;

    .line 9
    iput-object p1, p0, Ls/c;->h:Lh6/h;

    .line 10
    iput-object p1, p0, Ls/c;->i:Lcoil3/request/CachePolicy;

    .line 11
    iput-object p1, p0, Ls/c;->j:Lcoil3/request/CachePolicy;

    .line 12
    sget-object v0, Lcoil3/util/k;->a:Lcoil3/util/k;

    iput-object v0, p0, Ls/c;->k:Lr6/c;

    .line 13
    iput-object v0, p0, Ls/c;->l:Lr6/c;

    .line 14
    iput-object v0, p0, Ls/c;->m:Lr6/c;

    .line 15
    iput-object p1, p0, Ls/c;->n:Lt/g;

    .line 16
    iput-object p1, p0, Ls/c;->o:Lcoil3/size/Scale;

    .line 17
    iput-object p1, p0, Ls/c;->p:Lcoil3/size/Precision;

    .line 18
    sget-object p1, Lcoil3/j;->b:Lcoil3/j;

    iput-object p1, p0, Ls/c;->q:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ls/f;Landroid/content/Context;)V
    .locals 1

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p2, p0, Ls/c;->a:Landroid/content/Context;

    .line 21
    iget-object p2, p1, Ls/f;->t:Ls/d;

    .line 22
    iput-object p2, p0, Ls/c;->b:Ls/d;

    .line 23
    iget-object p2, p1, Ls/f;->b:Ljava/lang/Object;

    .line 24
    iput-object p2, p0, Ls/c;->c:Ljava/lang/Object;

    .line 25
    iget-object p2, p1, Ls/f;->c:Lu/a;

    .line 26
    iput-object p2, p0, Ls/c;->d:Lu/a;

    .line 27
    iget-object p2, p1, Ls/f;->d:Ljava/util/Map;

    .line 28
    iput-object p2, p0, Ls/c;->e:Ljava/util/Map;

    .line 29
    iget-object p2, p1, Ls/f;->s:Ls/e;

    .line 30
    iget-object v0, p2, Ls/e;->a:Lh6/h;

    .line 31
    iput-object v0, p0, Ls/c;->f:Lh6/h;

    .line 32
    iget-object v0, p2, Ls/e;->b:Lh6/h;

    .line 33
    iput-object v0, p0, Ls/c;->g:Lh6/h;

    .line 34
    iget-object v0, p2, Ls/e;->c:Lh6/h;

    .line 35
    iput-object v0, p0, Ls/c;->h:Lh6/h;

    .line 36
    iget-object v0, p2, Ls/e;->d:Lcoil3/request/CachePolicy;

    .line 37
    iput-object v0, p0, Ls/c;->i:Lcoil3/request/CachePolicy;

    .line 38
    iget-object v0, p2, Ls/e;->e:Lcoil3/request/CachePolicy;

    .line 39
    iput-object v0, p0, Ls/c;->j:Lcoil3/request/CachePolicy;

    .line 40
    iget-object v0, p2, Ls/e;->f:Lr6/c;

    .line 41
    iput-object v0, p0, Ls/c;->k:Lr6/c;

    .line 42
    iget-object v0, p2, Ls/e;->g:Lr6/c;

    .line 43
    iput-object v0, p0, Ls/c;->l:Lr6/c;

    .line 44
    iget-object v0, p2, Ls/e;->h:Lr6/c;

    .line 45
    iput-object v0, p0, Ls/c;->m:Lr6/c;

    .line 46
    iget-object v0, p2, Ls/e;->i:Lt/g;

    .line 47
    iput-object v0, p0, Ls/c;->n:Lt/g;

    .line 48
    iget-object v0, p2, Ls/e;->j:Lcoil3/size/Scale;

    .line 49
    iput-object v0, p0, Ls/c;->o:Lcoil3/size/Scale;

    .line 50
    iget-object p2, p2, Ls/e;->k:Lcoil3/size/Precision;

    .line 51
    iput-object p2, p0, Ls/c;->p:Lcoil3/size/Precision;

    .line 52
    iget-object p1, p1, Ls/f;->r:Lcoil3/j;

    .line 53
    iput-object p1, p0, Ls/c;->q:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a()Ls/f;
    .locals 33

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Ls/c;->c:Ljava/lang/Object;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    sget-object v1, Ls/j;->a:Ls/j;

    .line 8
    .line 9
    :cond_0
    move-object v4, v1

    .line 10
    iget-object v5, v0, Ls/c;->d:Lu/a;

    .line 11
    .line 12
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 13
    .line 14
    iget-object v2, v0, Ls/c;->e:Ljava/util/Map;

    .line 15
    .line 16
    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    const-string v1, "null cannot be cast to non-null type kotlin.collections.MutableMap<*, *>"

    .line 23
    .line 24
    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-static {v2}, Lkotlin/jvm/internal/p;->b(Ljava/lang/Object;)Ljava/util/Map;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-static {v1}, Lt6/a;->x(Ljava/util/Map;)Ljava/util/Map;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    :goto_0
    move-object v6, v2

    .line 36
    goto :goto_1

    .line 37
    :cond_1
    if-eqz v2, :cond_f

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :goto_1
    const-string v1, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>"

    .line 41
    .line 42
    invoke-static {v6, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    iget-object v1, v0, Ls/c;->b:Ls/d;

    .line 46
    .line 47
    iget-object v7, v1, Ls/d;->a:Lokio/FileSystem;

    .line 48
    .line 49
    iget-object v2, v0, Ls/c;->i:Lcoil3/request/CachePolicy;

    .line 50
    .line 51
    if-nez v2, :cond_2

    .line 52
    .line 53
    iget-object v2, v1, Ls/d;->e:Lcoil3/request/CachePolicy;

    .line 54
    .line 55
    :cond_2
    move-object v11, v2

    .line 56
    iget-object v2, v0, Ls/c;->j:Lcoil3/request/CachePolicy;

    .line 57
    .line 58
    if-nez v2, :cond_3

    .line 59
    .line 60
    iget-object v2, v1, Ls/d;->f:Lcoil3/request/CachePolicy;

    .line 61
    .line 62
    :cond_3
    move-object v12, v2

    .line 63
    iget-object v13, v1, Ls/d;->g:Lcoil3/request/CachePolicy;

    .line 64
    .line 65
    iget-object v2, v0, Ls/c;->f:Lh6/h;

    .line 66
    .line 67
    if-nez v2, :cond_4

    .line 68
    .line 69
    iget-object v2, v1, Ls/d;->b:Lh6/h;

    .line 70
    .line 71
    :cond_4
    move-object v8, v2

    .line 72
    iget-object v2, v0, Ls/c;->g:Lh6/h;

    .line 73
    .line 74
    if-nez v2, :cond_5

    .line 75
    .line 76
    iget-object v2, v1, Ls/d;->c:Lh6/h;

    .line 77
    .line 78
    :cond_5
    move-object v9, v2

    .line 79
    iget-object v2, v0, Ls/c;->h:Lh6/h;

    .line 80
    .line 81
    if-nez v2, :cond_6

    .line 82
    .line 83
    iget-object v2, v1, Ls/d;->d:Lh6/h;

    .line 84
    .line 85
    :cond_6
    move-object v10, v2

    .line 86
    iget-object v2, v0, Ls/c;->k:Lr6/c;

    .line 87
    .line 88
    if-nez v2, :cond_7

    .line 89
    .line 90
    iget-object v2, v1, Ls/d;->h:Lr6/c;

    .line 91
    .line 92
    :cond_7
    move-object v14, v2

    .line 93
    iget-object v2, v0, Ls/c;->l:Lr6/c;

    .line 94
    .line 95
    if-nez v2, :cond_8

    .line 96
    .line 97
    iget-object v2, v1, Ls/d;->i:Lr6/c;

    .line 98
    .line 99
    :cond_8
    move-object v15, v2

    .line 100
    iget-object v2, v0, Ls/c;->m:Lr6/c;

    .line 101
    .line 102
    if-nez v2, :cond_9

    .line 103
    .line 104
    iget-object v2, v1, Ls/d;->j:Lr6/c;

    .line 105
    .line 106
    :cond_9
    move-object/from16 v16, v2

    .line 107
    .line 108
    iget-object v2, v0, Ls/c;->n:Lt/g;

    .line 109
    .line 110
    if-nez v2, :cond_a

    .line 111
    .line 112
    iget-object v2, v1, Ls/d;->k:Lt/g;

    .line 113
    .line 114
    :cond_a
    move-object/from16 v17, v2

    .line 115
    .line 116
    iget-object v2, v0, Ls/c;->o:Lcoil3/size/Scale;

    .line 117
    .line 118
    if-nez v2, :cond_b

    .line 119
    .line 120
    iget-object v2, v1, Ls/d;->l:Lcoil3/size/Scale;

    .line 121
    .line 122
    :cond_b
    move-object/from16 v18, v2

    .line 123
    .line 124
    iget-object v2, v0, Ls/c;->p:Lcoil3/size/Precision;

    .line 125
    .line 126
    if-nez v2, :cond_c

    .line 127
    .line 128
    iget-object v2, v1, Ls/d;->m:Lcoil3/size/Precision;

    .line 129
    .line 130
    :cond_c
    move-object/from16 v19, v2

    .line 131
    .line 132
    iget-object v1, v0, Ls/c;->q:Ljava/lang/Object;

    .line 133
    .line 134
    instance-of v2, v1, Lcoil3/i;

    .line 135
    .line 136
    if-eqz v2, :cond_d

    .line 137
    .line 138
    check-cast v1, Lcoil3/i;

    .line 139
    .line 140
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    new-instance v2, Lcoil3/j;

    .line 144
    .line 145
    iget-object v1, v1, Lcoil3/i;->a:Ljava/util/LinkedHashMap;

    .line 146
    .line 147
    invoke-static {v1}, Lt6/a;->x(Ljava/util/Map;)Ljava/util/Map;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    invoke-direct {v2, v1}, Lcoil3/j;-><init>(Ljava/util/Map;)V

    .line 152
    .line 153
    .line 154
    :goto_2
    move-object/from16 v20, v2

    .line 155
    .line 156
    goto :goto_3

    .line 157
    :cond_d
    instance-of v2, v1, Lcoil3/j;

    .line 158
    .line 159
    if-eqz v2, :cond_e

    .line 160
    .line 161
    move-object v2, v1

    .line 162
    check-cast v2, Lcoil3/j;

    .line 163
    .line 164
    goto :goto_2

    .line 165
    :goto_3
    iget-object v1, v0, Ls/c;->f:Lh6/h;

    .line 166
    .line 167
    iget-object v2, v0, Ls/c;->g:Lh6/h;

    .line 168
    .line 169
    iget-object v3, v0, Ls/c;->h:Lh6/h;

    .line 170
    .line 171
    move-object/from16 v22, v1

    .line 172
    .line 173
    iget-object v1, v0, Ls/c;->i:Lcoil3/request/CachePolicy;

    .line 174
    .line 175
    move-object/from16 v25, v1

    .line 176
    .line 177
    iget-object v1, v0, Ls/c;->j:Lcoil3/request/CachePolicy;

    .line 178
    .line 179
    move-object/from16 v26, v1

    .line 180
    .line 181
    iget-object v1, v0, Ls/c;->n:Lt/g;

    .line 182
    .line 183
    move-object/from16 v30, v1

    .line 184
    .line 185
    iget-object v1, v0, Ls/c;->o:Lcoil3/size/Scale;

    .line 186
    .line 187
    move-object/from16 v31, v1

    .line 188
    .line 189
    iget-object v1, v0, Ls/c;->p:Lcoil3/size/Precision;

    .line 190
    .line 191
    new-instance v21, Ls/e;

    .line 192
    .line 193
    move-object/from16 v32, v1

    .line 194
    .line 195
    iget-object v1, v0, Ls/c;->k:Lr6/c;

    .line 196
    .line 197
    move-object/from16 v27, v1

    .line 198
    .line 199
    iget-object v1, v0, Ls/c;->l:Lr6/c;

    .line 200
    .line 201
    move-object/from16 v28, v1

    .line 202
    .line 203
    iget-object v1, v0, Ls/c;->m:Lr6/c;

    .line 204
    .line 205
    move-object/from16 v29, v1

    .line 206
    .line 207
    move-object/from16 v23, v2

    .line 208
    .line 209
    move-object/from16 v24, v3

    .line 210
    .line 211
    invoke-direct/range {v21 .. v32}, Ls/e;-><init>(Lh6/h;Lh6/h;Lh6/h;Lcoil3/request/CachePolicy;Lcoil3/request/CachePolicy;Lr6/c;Lr6/c;Lr6/c;Lt/g;Lcoil3/size/Scale;Lcoil3/size/Precision;)V

    .line 212
    .line 213
    .line 214
    iget-object v1, v0, Ls/c;->b:Ls/d;

    .line 215
    .line 216
    new-instance v2, Ls/f;

    .line 217
    .line 218
    iget-object v3, v0, Ls/c;->a:Landroid/content/Context;

    .line 219
    .line 220
    move-object/from16 v22, v1

    .line 221
    .line 222
    invoke-direct/range {v2 .. v22}, Ls/f;-><init>(Landroid/content/Context;Ljava/lang/Object;Lu/a;Ljava/util/Map;Lokio/FileSystem;Lh6/h;Lh6/h;Lh6/h;Lcoil3/request/CachePolicy;Lcoil3/request/CachePolicy;Lcoil3/request/CachePolicy;Lr6/c;Lr6/c;Lr6/c;Lt/g;Lcoil3/size/Scale;Lcoil3/size/Precision;Lcoil3/j;Ls/e;Ls/d;)V

    .line 223
    .line 224
    .line 225
    return-object v2

    .line 226
    :cond_e
    new-instance v1, Ljava/lang/AssertionError;

    .line 227
    .line 228
    invoke-direct {v1}, Ljava/lang/AssertionError;-><init>()V

    .line 229
    .line 230
    .line 231
    throw v1

    .line 232
    :cond_f
    new-instance v1, Ljava/lang/AssertionError;

    .line 233
    .line 234
    invoke-direct {v1}, Ljava/lang/AssertionError;-><init>()V

    .line 235
    .line 236
    .line 237
    throw v1
.end method
