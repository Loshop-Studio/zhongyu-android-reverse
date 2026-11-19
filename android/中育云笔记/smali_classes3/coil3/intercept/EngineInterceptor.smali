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

.field public final b:La0/x;

.field public final c:Lw/p;

.field public final d:Lr/e;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcoil3/intercept/EngineInterceptor$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcoil3/intercept/EngineInterceptor$a;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Lcoil3/intercept/EngineInterceptor;->e:Lcoil3/intercept/EngineInterceptor$a;

    return-void
.end method

.method public constructor <init>(Lcoil3/e;La0/x;Lw/p;Lcoil3/util/Logger;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcoil3/intercept/EngineInterceptor;->a:Lcoil3/e;

    .line 5
    .line 6
    iput-object p2, p0, Lcoil3/intercept/EngineInterceptor;->b:La0/x;

    .line 7
    .line 8
    iput-object p3, p0, Lcoil3/intercept/EngineInterceptor;->c:Lw/p;

    .line 9
    .line 10
    new-instance p2, Lr/e;

    .line 11
    .line 12
    const/4 p4, 0x0

    .line 13
    invoke-direct {p2, p1, p3, p4}, Lr/e;-><init>(Lcoil3/e;Lw/p;Lcoil3/util/Logger;)V

    .line 14
    .line 15
    .line 16
    iput-object p2, p0, Lcoil3/intercept/EngineInterceptor;->d:Lr/e;

    .line 17
    .line 18
    return-void
.end method

.method public static final synthetic b(Lcoil3/intercept/EngineInterceptor;Ln/p;Lcoil3/a;Lw/g;Ljava/lang/Object;Lw/n;Lcoil3/b;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual/range {p0 .. p7}, Lcoil3/intercept/EngineInterceptor;->g(Ln/p;Lcoil3/a;Lw/g;Ljava/lang/Object;Lw/n;Lcoil3/b;Lvc/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic c(Lcoil3/intercept/EngineInterceptor;Lw/g;Ljava/lang/Object;Lw/n;Lcoil3/b;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual/range {p0 .. p5}, Lcoil3/intercept/EngineInterceptor;->h(Lw/g;Ljava/lang/Object;Lw/n;Lcoil3/b;Lvc/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic d(Lcoil3/intercept/EngineInterceptor;Lcoil3/a;Lw/g;Ljava/lang/Object;Lw/n;Lcoil3/b;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual/range {p0 .. p6}, Lcoil3/intercept/EngineInterceptor;->i(Lcoil3/a;Lw/g;Ljava/lang/Object;Lw/n;Lcoil3/b;Lvc/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic e(Lcoil3/intercept/EngineInterceptor;)Lr/e;
    .locals 0

    .line 1
    iget-object p0, p0, Lcoil3/intercept/EngineInterceptor;->d:Lr/e;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic f(Lcoil3/intercept/EngineInterceptor;)La0/x;
    .locals 0

    .line 1
    iget-object p0, p0, Lcoil3/intercept/EngineInterceptor;->b:La0/x;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public a(Lcoil3/intercept/a$a;Lvc/c;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v7, p1

    .line 4
    .line 5
    move-object/from16 v0, p2

    .line 6
    .line 7
    instance-of v2, v0, Lcoil3/intercept/EngineInterceptor$intercept$1;

    .line 8
    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    move-object v2, v0

    .line 12
    check-cast v2, Lcoil3/intercept/EngineInterceptor$intercept$1;

    .line 13
    .line 14
    iget v3, v2, Lcoil3/intercept/EngineInterceptor$intercept$1;->o:I

    .line 15
    .line 16
    const/high16 v4, -0x80000000

    .line 17
    .line 18
    and-int v5, v3, v4

    .line 19
    .line 20
    if-eqz v5, :cond_0

    .line 21
    .line 22
    sub-int/2addr v3, v4

    .line 23
    iput v3, v2, Lcoil3/intercept/EngineInterceptor$intercept$1;->o:I

    .line 24
    .line 25
    :goto_0
    move-object v9, v2

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    new-instance v2, Lcoil3/intercept/EngineInterceptor$intercept$1;

    .line 28
    .line 29
    invoke-direct {v2, v1, v0}, Lcoil3/intercept/EngineInterceptor$intercept$1;-><init>(Lcoil3/intercept/EngineInterceptor;Lvc/c;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :goto_1
    iget-object v0, v9, Lcoil3/intercept/EngineInterceptor$intercept$1;->m:Ljava/lang/Object;

    .line 34
    .line 35
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v10

    .line 39
    iget v2, v9, Lcoil3/intercept/EngineInterceptor$intercept$1;->o:I

    .line 40
    .line 41
    const/4 v11, 0x1

    .line 42
    if-eqz v2, :cond_2

    .line 43
    .line 44
    if-ne v2, v11, :cond_1

    .line 45
    .line 46
    iget-object v2, v9, Lcoil3/intercept/EngineInterceptor$intercept$1;->l:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v2, Lr/d$c;

    .line 49
    .line 50
    iget-object v2, v9, Lcoil3/intercept/EngineInterceptor$intercept$1;->k:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v2, Lr/d$b;

    .line 53
    .line 54
    iget-object v2, v9, Lcoil3/intercept/EngineInterceptor$intercept$1;->i:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v2, Lcoil3/size/Scale;

    .line 57
    .line 58
    iget-object v2, v9, Lcoil3/intercept/EngineInterceptor$intercept$1;->h:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v2, Lw/n;

    .line 61
    .line 62
    iget-object v2, v9, Lcoil3/intercept/EngineInterceptor$intercept$1;->g:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v2, Lcoil3/b;

    .line 65
    .line 66
    iget-object v2, v9, Lcoil3/intercept/EngineInterceptor$intercept$1;->f:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v2, Lx/e;

    .line 69
    .line 70
    iget-object v2, v9, Lcoil3/intercept/EngineInterceptor$intercept$1;->d:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v2, Lw/g;

    .line 73
    .line 74
    iget-object v2, v9, Lcoil3/intercept/EngineInterceptor$intercept$1;->c:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v2, Lcoil3/intercept/a$a;

    .line 77
    .line 78
    :try_start_0
    invoke-static {v0}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 79
    .line 80
    .line 81
    return-object v0

    .line 82
    :catchall_0
    move-exception v0

    .line 83
    move-object v7, v2

    .line 84
    goto/16 :goto_4

    .line 85
    .line 86
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 87
    .line 88
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 89
    .line 90
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    throw v0

    .line 94
    :cond_2
    invoke-static {v0}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    :try_start_1
    invoke-interface {v7}, Lcoil3/intercept/a$a;->a()Lw/g;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    invoke-virtual {v2}, Lw/g;->d()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v12

    .line 105
    invoke-interface {v7}, Lcoil3/intercept/a$a;->getSize()Lx/e;

    .line 106
    .line 107
    .line 108
    move-result-object v13

    .line 109
    invoke-static {v7}, Lcoil3/util/c;->l(Lcoil3/intercept/a$a;)Lcoil3/b;

    .line 110
    .line 111
    .line 112
    move-result-object v5

    .line 113
    iget-object v0, v1, Lcoil3/intercept/EngineInterceptor;->c:Lw/p;

    .line 114
    .line 115
    invoke-interface {v0, v2, v13}, Lw/p;->a(Lw/g;Lx/e;)Lw/n;

    .line 116
    .line 117
    .line 118
    move-result-object v4

    .line 119
    invoke-virtual {v4}, Lw/n;->j()Lcoil3/size/Scale;

    .line 120
    .line 121
    .line 122
    move-result-object v14

    .line 123
    invoke-virtual {v5, v2, v12}, Lcoil3/b;->l(Lw/g;Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    iget-object v0, v1, Lcoil3/intercept/EngineInterceptor;->a:Lcoil3/e;

    .line 127
    .line 128
    invoke-interface {v0}, Lcoil3/e;->d()Lcoil3/a;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    invoke-virtual {v0, v12, v4}, Lcoil3/a;->j(Ljava/lang/Object;Lw/n;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v3

    .line 136
    invoke-virtual {v5, v2, v3}, Lcoil3/b;->k(Lw/g;Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    iget-object v0, v1, Lcoil3/intercept/EngineInterceptor;->d:Lr/e;

    .line 140
    .line 141
    invoke-virtual {v0, v2, v3, v4, v5}, Lr/e;->f(Lw/g;Ljava/lang/Object;Lw/n;Lcoil3/b;)Lr/d$b;

    .line 142
    .line 143
    .line 144
    move-result-object v6

    .line 145
    if-eqz v6, :cond_3

    .line 146
    .line 147
    iget-object v0, v1, Lcoil3/intercept/EngineInterceptor;->d:Lr/e;

    .line 148
    .line 149
    invoke-virtual {v0, v2, v6, v13, v14}, Lr/e;->a(Lw/g;Lr/d$b;Lx/e;Lcoil3/size/Scale;)Lr/d$c;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    :goto_2
    move-object v15, v0

    .line 154
    goto :goto_3

    .line 155
    :catchall_1
    move-exception v0

    .line 156
    goto :goto_4

    .line 157
    :cond_3
    const/4 v0, 0x0

    .line 158
    goto :goto_2

    .line 159
    :goto_3
    if-eqz v15, :cond_4

    .line 160
    .line 161
    iget-object v0, v1, Lcoil3/intercept/EngineInterceptor;->d:Lr/e;

    .line 162
    .line 163
    invoke-virtual {v0, v7, v2, v6, v15}, Lr/e;->g(Lcoil3/intercept/a$a;Lw/g;Lr/d$b;Lr/d$c;)Lw/r;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    return-object v0

    .line 168
    :cond_4
    invoke-virtual {v2}, Lw/g;->l()Lkotlin/coroutines/d;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    move-object v8, v0

    .line 173
    new-instance v0, Lcoil3/intercept/EngineInterceptor$intercept$2;

    .line 174
    .line 175
    move-object/from16 v16, v8

    .line 176
    .line 177
    const/4 v8, 0x0

    .line 178
    move-object/from16 v17, v16

    .line 179
    .line 180
    invoke-direct/range {v0 .. v8}, Lcoil3/intercept/EngineInterceptor$intercept$2;-><init>(Lcoil3/intercept/EngineInterceptor;Lw/g;Ljava/lang/Object;Lw/n;Lcoil3/b;Lr/d$b;Lcoil3/intercept/a$a;Lvc/c;)V

    .line 181
    .line 182
    .line 183
    iput-object v7, v9, Lcoil3/intercept/EngineInterceptor$intercept$1;->c:Ljava/lang/Object;

    .line 184
    .line 185
    invoke-static {v2}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v1

    .line 189
    iput-object v1, v9, Lcoil3/intercept/EngineInterceptor$intercept$1;->d:Ljava/lang/Object;

    .line 190
    .line 191
    invoke-static {v12}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    iput-object v1, v9, Lcoil3/intercept/EngineInterceptor$intercept$1;->e:Ljava/lang/Object;

    .line 196
    .line 197
    invoke-static {v13}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v1

    .line 201
    iput-object v1, v9, Lcoil3/intercept/EngineInterceptor$intercept$1;->f:Ljava/lang/Object;

    .line 202
    .line 203
    invoke-static {v5}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v1

    .line 207
    iput-object v1, v9, Lcoil3/intercept/EngineInterceptor$intercept$1;->g:Ljava/lang/Object;

    .line 208
    .line 209
    invoke-static {v4}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v1

    .line 213
    iput-object v1, v9, Lcoil3/intercept/EngineInterceptor$intercept$1;->h:Ljava/lang/Object;

    .line 214
    .line 215
    invoke-static {v14}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v1

    .line 219
    iput-object v1, v9, Lcoil3/intercept/EngineInterceptor$intercept$1;->i:Ljava/lang/Object;

    .line 220
    .line 221
    invoke-static {v3}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v1

    .line 225
    iput-object v1, v9, Lcoil3/intercept/EngineInterceptor$intercept$1;->j:Ljava/lang/Object;

    .line 226
    .line 227
    invoke-static {v6}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v1

    .line 231
    iput-object v1, v9, Lcoil3/intercept/EngineInterceptor$intercept$1;->k:Ljava/lang/Object;

    .line 232
    .line 233
    invoke-static {v15}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object v1

    .line 237
    iput-object v1, v9, Lcoil3/intercept/EngineInterceptor$intercept$1;->l:Ljava/lang/Object;

    .line 238
    .line 239
    iput v11, v9, Lcoil3/intercept/EngineInterceptor$intercept$1;->o:I

    .line 240
    .line 241
    move-object/from16 v8, v17

    .line 242
    .line 243
    invoke-static {v8, v0, v9}, Lsd/f;->g(Lkotlin/coroutines/d;Lhd/p;Lvc/c;)Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 247
    if-ne v0, v10, :cond_5

    .line 248
    .line 249
    return-object v10

    .line 250
    :cond_5
    return-object v0

    .line 251
    :goto_4
    instance-of v1, v0, Ljava/util/concurrent/CancellationException;

    .line 252
    .line 253
    if-nez v1, :cond_6

    .line 254
    .line 255
    invoke-interface {v7}, Lcoil3/intercept/a$a;->a()Lw/g;

    .line 256
    .line 257
    .line 258
    move-result-object v1

    .line 259
    invoke-static {v1, v0}, Lcoil3/util/c;->c(Lw/g;Ljava/lang/Throwable;)Lw/d;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    return-object v0

    .line 264
    :cond_6
    throw v0
.end method

.method public final g(Ln/p;Lcoil3/a;Lw/g;Ljava/lang/Object;Lw/n;Lcoil3/b;Lvc/c;)Ljava/lang/Object;
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
    iget v1, v0, Lcoil3/intercept/EngineInterceptor$decode$1;->n:I

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
    iput v1, v0, Lcoil3/intercept/EngineInterceptor$decode$1;->n:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcoil3/intercept/EngineInterceptor$decode$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p7}, Lcoil3/intercept/EngineInterceptor$decode$1;-><init>(Lcoil3/intercept/EngineInterceptor;Lvc/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p7, v0, Lcoil3/intercept/EngineInterceptor$decode$1;->l:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcoil3/intercept/EngineInterceptor$decode$1;->n:I

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
    iget p1, v0, Lcoil3/intercept/EngineInterceptor$decode$1;->k:I

    .line 39
    .line 40
    iget-object p2, v0, Lcoil3/intercept/EngineInterceptor$decode$1;->j:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p2, Lcoil3/decode/a;

    .line 43
    .line 44
    iget-object p3, v0, Lcoil3/intercept/EngineInterceptor$decode$1;->i:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p3, Lkotlin/Pair;

    .line 47
    .line 48
    iget-object p3, v0, Lcoil3/intercept/EngineInterceptor$decode$1;->h:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast p3, Lcoil3/b;

    .line 51
    .line 52
    iget-object p4, v0, Lcoil3/intercept/EngineInterceptor$decode$1;->g:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast p4, Lw/n;

    .line 55
    .line 56
    iget-object p5, v0, Lcoil3/intercept/EngineInterceptor$decode$1;->f:Ljava/lang/Object;

    .line 57
    .line 58
    iget-object p6, v0, Lcoil3/intercept/EngineInterceptor$decode$1;->e:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast p6, Lw/g;

    .line 61
    .line 62
    iget-object v2, v0, Lcoil3/intercept/EngineInterceptor$decode$1;->d:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v2, Lcoil3/a;

    .line 65
    .line 66
    iget-object v4, v0, Lcoil3/intercept/EngineInterceptor$decode$1;->c:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v4, Ln/p;

    .line 69
    .line 70
    invoke-static {p7}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    move-object v5, v4

    .line 74
    move v4, p1

    .line 75
    move-object p1, v5

    .line 76
    move-object v5, p6

    .line 77
    move-object p6, p3

    .line 78
    move-object p3, v5

    .line 79
    move-object v5, p5

    .line 80
    move-object p5, p4

    .line 81
    move-object p4, v5

    .line 82
    goto :goto_2

    .line 83
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 84
    .line 85
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 86
    .line 87
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    throw p1

    .line 91
    :cond_2
    invoke-static {p7}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    const/4 p7, 0x0

    .line 95
    :goto_1
    iget-object v2, p0, Lcoil3/intercept/EngineInterceptor;->a:Lcoil3/e;

    .line 96
    .line 97
    invoke-virtual {p2, p1, p5, v2, p7}, Lcoil3/a;->l(Ln/p;Lw/n;Lcoil3/e;I)Lkotlin/Pair;

    .line 98
    .line 99
    .line 100
    move-result-object p7

    .line 101
    if-eqz p7, :cond_7

    .line 102
    .line 103
    invoke-virtual {p7}, Lkotlin/Pair;->f()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    check-cast v2, Lcoil3/decode/a;

    .line 108
    .line 109
    invoke-virtual {p7}, Lkotlin/Pair;->g()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v4

    .line 113
    check-cast v4, Ljava/lang/Number;

    .line 114
    .line 115
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 116
    .line 117
    .line 118
    move-result v4

    .line 119
    add-int/2addr v4, v3

    .line 120
    invoke-virtual {p6, p3, v2, p5}, Lcoil3/b;->f(Lw/g;Lcoil3/decode/a;Lw/n;)V

    .line 121
    .line 122
    .line 123
    iput-object p1, v0, Lcoil3/intercept/EngineInterceptor$decode$1;->c:Ljava/lang/Object;

    .line 124
    .line 125
    iput-object p2, v0, Lcoil3/intercept/EngineInterceptor$decode$1;->d:Ljava/lang/Object;

    .line 126
    .line 127
    iput-object p3, v0, Lcoil3/intercept/EngineInterceptor$decode$1;->e:Ljava/lang/Object;

    .line 128
    .line 129
    iput-object p4, v0, Lcoil3/intercept/EngineInterceptor$decode$1;->f:Ljava/lang/Object;

    .line 130
    .line 131
    iput-object p5, v0, Lcoil3/intercept/EngineInterceptor$decode$1;->g:Ljava/lang/Object;

    .line 132
    .line 133
    iput-object p6, v0, Lcoil3/intercept/EngineInterceptor$decode$1;->h:Ljava/lang/Object;

    .line 134
    .line 135
    invoke-static {p7}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object p7

    .line 139
    iput-object p7, v0, Lcoil3/intercept/EngineInterceptor$decode$1;->i:Ljava/lang/Object;

    .line 140
    .line 141
    iput-object v2, v0, Lcoil3/intercept/EngineInterceptor$decode$1;->j:Ljava/lang/Object;

    .line 142
    .line 143
    iput v4, v0, Lcoil3/intercept/EngineInterceptor$decode$1;->k:I

    .line 144
    .line 145
    iput v3, v0, Lcoil3/intercept/EngineInterceptor$decode$1;->n:I

    .line 146
    .line 147
    invoke-interface {v2, v0}, Lcoil3/decode/a;->a(Lvc/c;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object p7

    .line 151
    if-ne p7, v1, :cond_3

    .line 152
    .line 153
    return-object v1

    .line 154
    :cond_3
    move-object v5, v2

    .line 155
    move-object v2, p2

    .line 156
    move-object p2, v5

    .line 157
    :goto_2
    check-cast p7, Ll/g;

    .line 158
    .line 159
    invoke-virtual {p6, p3, p2, p5, p7}, Lcoil3/b;->e(Lw/g;Lcoil3/decode/a;Lw/n;Ll/g;)V

    .line 160
    .line 161
    .line 162
    if-eqz p7, :cond_6

    .line 163
    .line 164
    new-instance p2, Lcoil3/intercept/EngineInterceptor$b;

    .line 165
    .line 166
    invoke-virtual {p7}, Ll/g;->a()Lk/j;

    .line 167
    .line 168
    .line 169
    move-result-object p3

    .line 170
    invoke-virtual {p7}, Ll/g;->b()Z

    .line 171
    .line 172
    .line 173
    move-result p4

    .line 174
    invoke-virtual {p1}, Ln/p;->a()Lcoil3/decode/DataSource;

    .line 175
    .line 176
    .line 177
    move-result-object p5

    .line 178
    invoke-virtual {p1}, Ln/p;->b()Ll/r;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    instance-of p6, p1, Ll/q;

    .line 183
    .line 184
    const/4 p7, 0x0

    .line 185
    if-eqz p6, :cond_4

    .line 186
    .line 187
    check-cast p1, Ll/q;

    .line 188
    .line 189
    goto :goto_3

    .line 190
    :cond_4
    move-object p1, p7

    .line 191
    :goto_3
    if-eqz p1, :cond_5

    .line 192
    .line 193
    invoke-virtual {p1}, Ll/q;->g()Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object p7

    .line 197
    :cond_5
    invoke-direct {p2, p3, p4, p5, p7}, Lcoil3/intercept/EngineInterceptor$b;-><init>(Lk/j;ZLcoil3/decode/DataSource;Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    return-object p2

    .line 201
    :cond_6
    move-object p2, v2

    .line 202
    move p7, v4

    .line 203
    goto :goto_1

    .line 204
    :cond_7
    new-instance p1, Ljava/lang/StringBuilder;

    .line 205
    .line 206
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 207
    .line 208
    .line 209
    const-string p2, "Unable to create a decoder that supports: "

    .line 210
    .line 211
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 212
    .line 213
    .line 214
    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 215
    .line 216
    .line 217
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object p1

    .line 221
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 222
    .line 223
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object p1

    .line 227
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    throw p2
.end method

.method public final h(Lw/g;Ljava/lang/Object;Lw/n;Lcoil3/b;Lvc/c;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p5

    .line 4
    .line 5
    instance-of v2, v0, Lcoil3/intercept/EngineInterceptor$execute$1;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v0

    .line 10
    check-cast v2, Lcoil3/intercept/EngineInterceptor$execute$1;

    .line 11
    .line 12
    iget v3, v2, Lcoil3/intercept/EngineInterceptor$execute$1;->m:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, Lcoil3/intercept/EngineInterceptor$execute$1;->m:I

    .line 22
    .line 23
    :goto_0
    move-object v7, v2

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    new-instance v2, Lcoil3/intercept/EngineInterceptor$execute$1;

    .line 26
    .line 27
    invoke-direct {v2, v1, v0}, Lcoil3/intercept/EngineInterceptor$execute$1;-><init>(Lcoil3/intercept/EngineInterceptor;Lvc/c;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :goto_1
    iget-object v0, v7, Lcoil3/intercept/EngineInterceptor$execute$1;->k:Ljava/lang/Object;

    .line 32
    .line 33
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v9

    .line 37
    iget v2, v7, Lcoil3/intercept/EngineInterceptor$execute$1;->m:I

    .line 38
    .line 39
    const/4 v10, 0x3

    .line 40
    const/4 v11, 0x2

    .line 41
    const/4 v3, 0x1

    .line 42
    const/4 v12, 0x0

    .line 43
    if-eqz v2, :cond_4

    .line 44
    .line 45
    if-eq v2, v3, :cond_3

    .line 46
    .line 47
    if-eq v2, v11, :cond_2

    .line 48
    .line 49
    if-ne v2, v10, :cond_1

    .line 50
    .line 51
    iget-object v2, v7, Lcoil3/intercept/EngineInterceptor$execute$1;->j:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v2, Lcoil3/intercept/EngineInterceptor$b;

    .line 54
    .line 55
    iget-object v2, v7, Lcoil3/intercept/EngineInterceptor$execute$1;->i:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v2, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 58
    .line 59
    iget-object v2, v7, Lcoil3/intercept/EngineInterceptor$execute$1;->h:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v2, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 62
    .line 63
    iget-object v2, v7, Lcoil3/intercept/EngineInterceptor$execute$1;->g:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v2, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 66
    .line 67
    iget-object v2, v7, Lcoil3/intercept/EngineInterceptor$execute$1;->f:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v2, Lcoil3/b;

    .line 70
    .line 71
    iget-object v2, v7, Lcoil3/intercept/EngineInterceptor$execute$1;->e:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v2, Lw/n;

    .line 74
    .line 75
    iget-object v2, v7, Lcoil3/intercept/EngineInterceptor$execute$1;->c:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v2, Lw/g;

    .line 78
    .line 79
    invoke-static {v0}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    goto/16 :goto_8

    .line 83
    .line 84
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 85
    .line 86
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 87
    .line 88
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    throw v0

    .line 92
    :cond_2
    iget-object v2, v7, Lcoil3/intercept/EngineInterceptor$execute$1;->i:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v2, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 95
    .line 96
    iget-object v3, v7, Lcoil3/intercept/EngineInterceptor$execute$1;->h:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v3, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 99
    .line 100
    iget-object v4, v7, Lcoil3/intercept/EngineInterceptor$execute$1;->g:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v4, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 103
    .line 104
    iget-object v5, v7, Lcoil3/intercept/EngineInterceptor$execute$1;->f:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v5, Lcoil3/b;

    .line 107
    .line 108
    iget-object v6, v7, Lcoil3/intercept/EngineInterceptor$execute$1;->e:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v6, Lw/n;

    .line 111
    .line 112
    iget-object v8, v7, Lcoil3/intercept/EngineInterceptor$execute$1;->d:Ljava/lang/Object;

    .line 113
    .line 114
    iget-object v11, v7, Lcoil3/intercept/EngineInterceptor$execute$1;->c:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast v11, Lw/g;

    .line 117
    .line 118
    :try_start_0
    invoke-static {v0}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 119
    .line 120
    .line 121
    move-object v15, v7

    .line 122
    goto/16 :goto_5

    .line 123
    .line 124
    :catchall_0
    move-exception v0

    .line 125
    goto/16 :goto_9

    .line 126
    .line 127
    :cond_3
    iget-object v2, v7, Lcoil3/intercept/EngineInterceptor$execute$1;->j:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v2, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 130
    .line 131
    iget-object v3, v7, Lcoil3/intercept/EngineInterceptor$execute$1;->i:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast v3, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 134
    .line 135
    iget-object v4, v7, Lcoil3/intercept/EngineInterceptor$execute$1;->h:Ljava/lang/Object;

    .line 136
    .line 137
    check-cast v4, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 138
    .line 139
    iget-object v5, v7, Lcoil3/intercept/EngineInterceptor$execute$1;->g:Ljava/lang/Object;

    .line 140
    .line 141
    check-cast v5, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 142
    .line 143
    iget-object v6, v7, Lcoil3/intercept/EngineInterceptor$execute$1;->f:Ljava/lang/Object;

    .line 144
    .line 145
    check-cast v6, Lcoil3/b;

    .line 146
    .line 147
    iget-object v8, v7, Lcoil3/intercept/EngineInterceptor$execute$1;->e:Ljava/lang/Object;

    .line 148
    .line 149
    check-cast v8, Lw/n;

    .line 150
    .line 151
    iget-object v13, v7, Lcoil3/intercept/EngineInterceptor$execute$1;->d:Ljava/lang/Object;

    .line 152
    .line 153
    iget-object v14, v7, Lcoil3/intercept/EngineInterceptor$execute$1;->c:Ljava/lang/Object;

    .line 154
    .line 155
    check-cast v14, Lw/g;

    .line 156
    .line 157
    :try_start_1
    invoke-static {v0}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 158
    .line 159
    .line 160
    move-object v1, v4

    .line 161
    move-object v15, v7

    .line 162
    move-object v4, v14

    .line 163
    move-object v7, v6

    .line 164
    move-object v6, v5

    .line 165
    move-object v5, v13

    .line 166
    :goto_2
    move-object v13, v8

    .line 167
    goto/16 :goto_4

    .line 168
    .line 169
    :catchall_1
    move-exception v0

    .line 170
    move-object v2, v3

    .line 171
    goto/16 :goto_9

    .line 172
    .line 173
    :cond_4
    invoke-static {v0}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 174
    .line 175
    .line 176
    new-instance v0, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 177
    .line 178
    invoke-direct {v0}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 179
    .line 180
    .line 181
    move-object/from16 v8, p3

    .line 182
    .line 183
    iput-object v8, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->c:Ljava/lang/Object;

    .line 184
    .line 185
    new-instance v13, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 186
    .line 187
    invoke-direct {v13}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 188
    .line 189
    .line 190
    iget-object v2, v1, Lcoil3/intercept/EngineInterceptor;->a:Lcoil3/e;

    .line 191
    .line 192
    invoke-interface {v2}, Lcoil3/e;->d()Lcoil3/a;

    .line 193
    .line 194
    .line 195
    move-result-object v2

    .line 196
    iput-object v2, v13, Lkotlin/jvm/internal/Ref$ObjectRef;->c:Ljava/lang/Object;

    .line 197
    .line 198
    new-instance v14, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 199
    .line 200
    invoke-direct {v14}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 201
    .line 202
    .line 203
    :try_start_2
    iget-object v2, v1, Lcoil3/intercept/EngineInterceptor;->c:Lw/p;

    .line 204
    .line 205
    iget-object v4, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->c:Ljava/lang/Object;

    .line 206
    .line 207
    check-cast v4, Lw/n;

    .line 208
    .line 209
    invoke-interface {v2, v4}, Lw/p;->e(Lw/n;)Lw/n;

    .line 210
    .line 211
    .line 212
    move-result-object v2

    .line 213
    iput-object v2, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->c:Ljava/lang/Object;

    .line 214
    .line 215
    invoke-virtual/range {p1 .. p1}, Lw/g;->m()Lkotlin/Pair;

    .line 216
    .line 217
    .line 218
    move-result-object v2

    .line 219
    if-nez v2, :cond_5

    .line 220
    .line 221
    invoke-virtual/range {p1 .. p1}, Lw/g;->f()Lcoil3/decode/a$a;

    .line 222
    .line 223
    .line 224
    move-result-object v2

    .line 225
    if-eqz v2, :cond_6

    .line 226
    .line 227
    goto :goto_3

    .line 228
    :catchall_2
    move-exception v0

    .line 229
    move-object v2, v14

    .line 230
    goto/16 :goto_9

    .line 231
    .line 232
    :cond_5
    :goto_3
    iget-object v2, v13, Lkotlin/jvm/internal/Ref$ObjectRef;->c:Ljava/lang/Object;

    .line 233
    .line 234
    check-cast v2, Lcoil3/a;

    .line 235
    .line 236
    invoke-virtual {v2}, Lcoil3/a;->k()Lcoil3/a$a;

    .line 237
    .line 238
    .line 239
    move-result-object v2

    .line 240
    invoke-virtual/range {p1 .. p1}, Lw/g;->m()Lkotlin/Pair;

    .line 241
    .line 242
    .line 243
    move-result-object v4

    .line 244
    invoke-static {v2, v4}, Lcoil3/util/c;->e(Lcoil3/a$a;Lkotlin/Pair;)Lcoil3/a$a;

    .line 245
    .line 246
    .line 247
    move-result-object v2

    .line 248
    invoke-virtual/range {p1 .. p1}, Lw/g;->f()Lcoil3/decode/a$a;

    .line 249
    .line 250
    .line 251
    move-result-object v4

    .line 252
    invoke-static {v2, v4}, Lcoil3/util/c;->d(Lcoil3/a$a;Lcoil3/decode/a$a;)Lcoil3/a$a;

    .line 253
    .line 254
    .line 255
    move-result-object v2

    .line 256
    invoke-virtual {v2}, Lcoil3/a$a;->p()Lcoil3/a;

    .line 257
    .line 258
    .line 259
    move-result-object v2

    .line 260
    iput-object v2, v13, Lkotlin/jvm/internal/Ref$ObjectRef;->c:Ljava/lang/Object;

    .line 261
    .line 262
    :cond_6
    iget-object v2, v13, Lkotlin/jvm/internal/Ref$ObjectRef;->c:Ljava/lang/Object;

    .line 263
    .line 264
    check-cast v2, Lcoil3/a;

    .line 265
    .line 266
    iget-object v4, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->c:Ljava/lang/Object;

    .line 267
    .line 268
    move-object v5, v4

    .line 269
    check-cast v5, Lw/n;

    .line 270
    .line 271
    move-object/from16 v4, p1

    .line 272
    .line 273
    iput-object v4, v7, Lcoil3/intercept/EngineInterceptor$execute$1;->c:Ljava/lang/Object;

    .line 274
    .line 275
    move-object/from16 v6, p2

    .line 276
    .line 277
    iput-object v6, v7, Lcoil3/intercept/EngineInterceptor$execute$1;->d:Ljava/lang/Object;

    .line 278
    .line 279
    invoke-static {v8}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object v15

    .line 283
    iput-object v15, v7, Lcoil3/intercept/EngineInterceptor$execute$1;->e:Ljava/lang/Object;

    .line 284
    .line 285
    move-object/from16 v15, p4

    .line 286
    .line 287
    iput-object v15, v7, Lcoil3/intercept/EngineInterceptor$execute$1;->f:Ljava/lang/Object;

    .line 288
    .line 289
    iput-object v0, v7, Lcoil3/intercept/EngineInterceptor$execute$1;->g:Ljava/lang/Object;

    .line 290
    .line 291
    iput-object v13, v7, Lcoil3/intercept/EngineInterceptor$execute$1;->h:Ljava/lang/Object;

    .line 292
    .line 293
    iput-object v14, v7, Lcoil3/intercept/EngineInterceptor$execute$1;->i:Ljava/lang/Object;

    .line 294
    .line 295
    iput-object v14, v7, Lcoil3/intercept/EngineInterceptor$execute$1;->j:Ljava/lang/Object;

    .line 296
    .line 297
    iput v3, v7, Lcoil3/intercept/EngineInterceptor$execute$1;->m:I

    .line 298
    .line 299
    move-object v3, v4

    .line 300
    move-object v4, v6

    .line 301
    move-object v6, v15

    .line 302
    invoke-virtual/range {v1 .. v7}, Lcoil3/intercept/EngineInterceptor;->i(Lcoil3/a;Lw/g;Ljava/lang/Object;Lw/n;Lcoil3/b;Lvc/c;)Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 306
    move-object v15, v7

    .line 307
    if-ne v2, v9, :cond_7

    .line 308
    .line 309
    goto/16 :goto_7

    .line 310
    .line 311
    :cond_7
    move-object/from16 v4, p1

    .line 312
    .line 313
    move-object/from16 v5, p2

    .line 314
    .line 315
    move-object/from16 v7, p4

    .line 316
    .line 317
    move-object v6, v0

    .line 318
    move-object v0, v2

    .line 319
    move-object v1, v13

    .line 320
    move-object v2, v14

    .line 321
    move-object v3, v2

    .line 322
    goto/16 :goto_2

    .line 323
    .line 324
    :goto_4
    :try_start_3
    iput-object v0, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->c:Ljava/lang/Object;

    .line 325
    .line 326
    iget-object v0, v3, Lkotlin/jvm/internal/Ref$ObjectRef;->c:Ljava/lang/Object;

    .line 327
    .line 328
    move-object v2, v0

    .line 329
    check-cast v2, Ln/j;

    .line 330
    .line 331
    instance-of v8, v2, Ln/p;

    .line 332
    .line 333
    if-eqz v8, :cond_9

    .line 334
    .line 335
    invoke-virtual {v4}, Lw/g;->e()Lkotlin/coroutines/d;

    .line 336
    .line 337
    .line 338
    move-result-object v14

    .line 339
    new-instance v0, Lcoil3/intercept/EngineInterceptor$execute$executeResult$1;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 340
    .line 341
    const/4 v8, 0x0

    .line 342
    move-object v2, v3

    .line 343
    move-object v3, v1

    .line 344
    move-object/from16 v1, p0

    .line 345
    .line 346
    :try_start_4
    invoke-direct/range {v0 .. v8}, Lcoil3/intercept/EngineInterceptor$execute$executeResult$1;-><init>(Lcoil3/intercept/EngineInterceptor;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/internal/Ref$ObjectRef;Lw/g;Ljava/lang/Object;Lkotlin/jvm/internal/Ref$ObjectRef;Lcoil3/b;Lvc/c;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 347
    .line 348
    .line 349
    move-object v1, v4

    .line 350
    move-object v4, v3

    .line 351
    move-object v3, v2

    .line 352
    :try_start_5
    iput-object v1, v15, Lcoil3/intercept/EngineInterceptor$execute$1;->c:Ljava/lang/Object;

    .line 353
    .line 354
    invoke-static {v5}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 355
    .line 356
    .line 357
    move-result-object v2

    .line 358
    iput-object v2, v15, Lcoil3/intercept/EngineInterceptor$execute$1;->d:Ljava/lang/Object;

    .line 359
    .line 360
    invoke-static {v13}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 361
    .line 362
    .line 363
    move-result-object v2

    .line 364
    iput-object v2, v15, Lcoil3/intercept/EngineInterceptor$execute$1;->e:Ljava/lang/Object;

    .line 365
    .line 366
    iput-object v7, v15, Lcoil3/intercept/EngineInterceptor$execute$1;->f:Ljava/lang/Object;

    .line 367
    .line 368
    iput-object v6, v15, Lcoil3/intercept/EngineInterceptor$execute$1;->g:Ljava/lang/Object;

    .line 369
    .line 370
    invoke-static {v4}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 371
    .line 372
    .line 373
    move-result-object v2

    .line 374
    iput-object v2, v15, Lcoil3/intercept/EngineInterceptor$execute$1;->h:Ljava/lang/Object;

    .line 375
    .line 376
    iput-object v3, v15, Lcoil3/intercept/EngineInterceptor$execute$1;->i:Ljava/lang/Object;

    .line 377
    .line 378
    iput-object v12, v15, Lcoil3/intercept/EngineInterceptor$execute$1;->j:Ljava/lang/Object;

    .line 379
    .line 380
    iput v11, v15, Lcoil3/intercept/EngineInterceptor$execute$1;->m:I

    .line 381
    .line 382
    invoke-static {v14, v0, v15}, Lsd/f;->g(Lkotlin/coroutines/d;Lhd/p;Lvc/c;)Ljava/lang/Object;

    .line 383
    .line 384
    .line 385
    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 386
    if-ne v0, v9, :cond_8

    .line 387
    .line 388
    goto/16 :goto_7

    .line 389
    .line 390
    :cond_8
    move-object v11, v1

    .line 391
    move-object v2, v3

    .line 392
    move-object v3, v4

    .line 393
    move-object v8, v5

    .line 394
    move-object v4, v6

    .line 395
    move-object v5, v7

    .line 396
    move-object v6, v13

    .line 397
    :goto_5
    :try_start_6
    check-cast v0, Lcoil3/intercept/EngineInterceptor$b;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 398
    .line 399
    move-object v1, v3

    .line 400
    move-object v7, v5

    .line 401
    move-object v13, v6

    .line 402
    move-object v5, v8

    .line 403
    move-object v3, v0

    .line 404
    move-object v6, v4

    .line 405
    move-object v4, v11

    .line 406
    goto :goto_6

    .line 407
    :catchall_3
    move-exception v0

    .line 408
    move-object v3, v2

    .line 409
    goto/16 :goto_9

    .line 410
    .line 411
    :cond_9
    move-object/from16 v16, v4

    .line 412
    .line 413
    move-object v4, v1

    .line 414
    move-object/from16 v1, v16

    .line 415
    .line 416
    :try_start_7
    instance-of v2, v2, Ln/m;

    .line 417
    .line 418
    if-eqz v2, :cond_d

    .line 419
    .line 420
    new-instance v2, Lcoil3/intercept/EngineInterceptor$b;

    .line 421
    .line 422
    check-cast v0, Ln/m;

    .line 423
    .line 424
    invoke-virtual {v0}, Ln/m;->b()Lk/j;

    .line 425
    .line 426
    .line 427
    move-result-object v0

    .line 428
    iget-object v8, v3, Lkotlin/jvm/internal/Ref$ObjectRef;->c:Ljava/lang/Object;

    .line 429
    .line 430
    check-cast v8, Ln/m;

    .line 431
    .line 432
    invoke-virtual {v8}, Ln/m;->c()Z

    .line 433
    .line 434
    .line 435
    move-result v8

    .line 436
    iget-object v11, v3, Lkotlin/jvm/internal/Ref$ObjectRef;->c:Ljava/lang/Object;

    .line 437
    .line 438
    check-cast v11, Ln/m;

    .line 439
    .line 440
    invoke-virtual {v11}, Ln/m;->a()Lcoil3/decode/DataSource;

    .line 441
    .line 442
    .line 443
    move-result-object v11

    .line 444
    invoke-direct {v2, v0, v8, v11, v12}, Lcoil3/intercept/EngineInterceptor$b;-><init>(Lk/j;ZLcoil3/decode/DataSource;Ljava/lang/String;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 445
    .line 446
    .line 447
    move-object/from16 v16, v4

    .line 448
    .line 449
    move-object v4, v1

    .line 450
    move-object/from16 v1, v16

    .line 451
    .line 452
    move-object/from16 v16, v3

    .line 453
    .line 454
    move-object v3, v2

    .line 455
    move-object/from16 v2, v16

    .line 456
    .line 457
    :goto_6
    iget-object v0, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->c:Ljava/lang/Object;

    .line 458
    .line 459
    instance-of v8, v0, Ln/p;

    .line 460
    .line 461
    if-eqz v8, :cond_a

    .line 462
    .line 463
    move-object v12, v0

    .line 464
    check-cast v12, Ln/p;

    .line 465
    .line 466
    :cond_a
    if-eqz v12, :cond_b

    .line 467
    .line 468
    invoke-virtual {v12}, Ln/p;->b()Ll/r;

    .line 469
    .line 470
    .line 471
    move-result-object v0

    .line 472
    if-eqz v0, :cond_b

    .line 473
    .line 474
    invoke-static {v0}, Lcoil3/util/c;->i(Ljava/lang/AutoCloseable;)V

    .line 475
    .line 476
    .line 477
    :cond_b
    iget-object v0, v6, Lkotlin/jvm/internal/Ref$ObjectRef;->c:Ljava/lang/Object;

    .line 478
    .line 479
    check-cast v0, Lw/n;

    .line 480
    .line 481
    invoke-static {v4}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 482
    .line 483
    .line 484
    move-result-object v8

    .line 485
    iput-object v8, v15, Lcoil3/intercept/EngineInterceptor$execute$1;->c:Ljava/lang/Object;

    .line 486
    .line 487
    invoke-static {v5}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 488
    .line 489
    .line 490
    move-result-object v5

    .line 491
    iput-object v5, v15, Lcoil3/intercept/EngineInterceptor$execute$1;->d:Ljava/lang/Object;

    .line 492
    .line 493
    invoke-static {v13}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 494
    .line 495
    .line 496
    move-result-object v5

    .line 497
    iput-object v5, v15, Lcoil3/intercept/EngineInterceptor$execute$1;->e:Ljava/lang/Object;

    .line 498
    .line 499
    invoke-static {v7}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 500
    .line 501
    .line 502
    move-result-object v5

    .line 503
    iput-object v5, v15, Lcoil3/intercept/EngineInterceptor$execute$1;->f:Ljava/lang/Object;

    .line 504
    .line 505
    invoke-static {v6}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 506
    .line 507
    .line 508
    move-result-object v5

    .line 509
    iput-object v5, v15, Lcoil3/intercept/EngineInterceptor$execute$1;->g:Ljava/lang/Object;

    .line 510
    .line 511
    invoke-static {v1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 512
    .line 513
    .line 514
    move-result-object v1

    .line 515
    iput-object v1, v15, Lcoil3/intercept/EngineInterceptor$execute$1;->h:Ljava/lang/Object;

    .line 516
    .line 517
    invoke-static {v2}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 518
    .line 519
    .line 520
    move-result-object v1

    .line 521
    iput-object v1, v15, Lcoil3/intercept/EngineInterceptor$execute$1;->i:Ljava/lang/Object;

    .line 522
    .line 523
    invoke-static {v3}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 524
    .line 525
    .line 526
    move-result-object v1

    .line 527
    iput-object v1, v15, Lcoil3/intercept/EngineInterceptor$execute$1;->j:Ljava/lang/Object;

    .line 528
    .line 529
    iput v10, v15, Lcoil3/intercept/EngineInterceptor$execute$1;->m:I

    .line 530
    .line 531
    move-object v6, v7

    .line 532
    const/4 v7, 0x0

    .line 533
    move-object v5, v0

    .line 534
    move-object v8, v15

    .line 535
    invoke-static/range {v3 .. v8}, Lcoil3/intercept/EngineInterceptorKt;->a(Lcoil3/intercept/EngineInterceptor$b;Lw/g;Lw/n;Lcoil3/b;Lcoil3/util/Logger;Lvc/c;)Ljava/lang/Object;

    .line 536
    .line 537
    .line 538
    move-result-object v0

    .line 539
    if-ne v0, v9, :cond_c

    .line 540
    .line 541
    :goto_7
    return-object v9

    .line 542
    :cond_c
    :goto_8
    check-cast v0, Lcoil3/intercept/EngineInterceptor$b;

    .line 543
    .line 544
    invoke-virtual {v0}, Lcoil3/intercept/EngineInterceptor$b;->e()Lk/j;

    .line 545
    .line 546
    .line 547
    move-result-object v1

    .line 548
    invoke-static {v1}, Lcoil3/util/d;->k(Lk/j;)V

    .line 549
    .line 550
    .line 551
    return-object v0

    .line 552
    :cond_d
    :try_start_8
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    .line 553
    .line 554
    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 555
    .line 556
    .line 557
    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 558
    :goto_9
    iget-object v1, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->c:Ljava/lang/Object;

    .line 559
    .line 560
    instance-of v2, v1, Ln/p;

    .line 561
    .line 562
    if-eqz v2, :cond_e

    .line 563
    .line 564
    move-object v12, v1

    .line 565
    check-cast v12, Ln/p;

    .line 566
    .line 567
    :cond_e
    if-eqz v12, :cond_f

    .line 568
    .line 569
    invoke-virtual {v12}, Ln/p;->b()Ll/r;

    .line 570
    .line 571
    .line 572
    move-result-object v1

    .line 573
    if-eqz v1, :cond_f

    .line 574
    .line 575
    invoke-static {v1}, Lcoil3/util/c;->i(Ljava/lang/AutoCloseable;)V

    .line 576
    .line 577
    .line 578
    :cond_f
    throw v0
.end method

.method public final i(Lcoil3/a;Lw/g;Ljava/lang/Object;Lw/n;Lcoil3/b;Lvc/c;)Ljava/lang/Object;
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
    iget v1, v0, Lcoil3/intercept/EngineInterceptor$fetch$1;->m:I

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
    iput v1, v0, Lcoil3/intercept/EngineInterceptor$fetch$1;->m:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcoil3/intercept/EngineInterceptor$fetch$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p6}, Lcoil3/intercept/EngineInterceptor$fetch$1;-><init>(Lcoil3/intercept/EngineInterceptor;Lvc/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p6, v0, Lcoil3/intercept/EngineInterceptor$fetch$1;->k:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcoil3/intercept/EngineInterceptor$fetch$1;->m:I

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
    iget p1, v0, Lcoil3/intercept/EngineInterceptor$fetch$1;->j:I

    .line 39
    .line 40
    iget-object p2, v0, Lcoil3/intercept/EngineInterceptor$fetch$1;->i:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p2, Ln/k;

    .line 43
    .line 44
    iget-object p3, v0, Lcoil3/intercept/EngineInterceptor$fetch$1;->h:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p3, Lkotlin/Pair;

    .line 47
    .line 48
    iget-object p3, v0, Lcoil3/intercept/EngineInterceptor$fetch$1;->g:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast p3, Lcoil3/b;

    .line 51
    .line 52
    iget-object p4, v0, Lcoil3/intercept/EngineInterceptor$fetch$1;->f:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast p4, Lw/n;

    .line 55
    .line 56
    iget-object p5, v0, Lcoil3/intercept/EngineInterceptor$fetch$1;->e:Ljava/lang/Object;

    .line 57
    .line 58
    iget-object v2, v0, Lcoil3/intercept/EngineInterceptor$fetch$1;->d:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v2, Lw/g;

    .line 61
    .line 62
    iget-object v4, v0, Lcoil3/intercept/EngineInterceptor$fetch$1;->c:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v4, Lcoil3/a;

    .line 65
    .line 66
    invoke-static {p6}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    move-object v5, v4

    .line 70
    move v4, p1

    .line 71
    move-object p1, v5

    .line 72
    move-object v5, v2

    .line 73
    move-object v2, p2

    .line 74
    move-object p2, v5

    .line 75
    move-object v5, p5

    .line 76
    move-object p5, p3

    .line 77
    move-object p3, v5

    .line 78
    goto :goto_2

    .line 79
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 80
    .line 81
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 82
    .line 83
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    throw p1

    .line 87
    :cond_2
    invoke-static {p6}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    const/4 p6, 0x0

    .line 91
    :goto_1
    iget-object v2, p0, Lcoil3/intercept/EngineInterceptor;->a:Lcoil3/e;

    .line 92
    .line 93
    invoke-virtual {p1, p3, p4, v2, p6}, Lcoil3/a;->m(Ljava/lang/Object;Lw/n;Lcoil3/e;I)Lkotlin/Pair;

    .line 94
    .line 95
    .line 96
    move-result-object p6

    .line 97
    if-eqz p6, :cond_7

    .line 98
    .line 99
    invoke-virtual {p6}, Lkotlin/Pair;->f()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    check-cast v2, Ln/k;

    .line 104
    .line 105
    invoke-virtual {p6}, Lkotlin/Pair;->g()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v4

    .line 109
    check-cast v4, Ljava/lang/Number;

    .line 110
    .line 111
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 112
    .line 113
    .line 114
    move-result v4

    .line 115
    add-int/2addr v4, v3

    .line 116
    invoke-virtual {p5, p2, v2, p4}, Lcoil3/b;->h(Lw/g;Ln/k;Lw/n;)V

    .line 117
    .line 118
    .line 119
    iput-object p1, v0, Lcoil3/intercept/EngineInterceptor$fetch$1;->c:Ljava/lang/Object;

    .line 120
    .line 121
    iput-object p2, v0, Lcoil3/intercept/EngineInterceptor$fetch$1;->d:Ljava/lang/Object;

    .line 122
    .line 123
    iput-object p3, v0, Lcoil3/intercept/EngineInterceptor$fetch$1;->e:Ljava/lang/Object;

    .line 124
    .line 125
    iput-object p4, v0, Lcoil3/intercept/EngineInterceptor$fetch$1;->f:Ljava/lang/Object;

    .line 126
    .line 127
    iput-object p5, v0, Lcoil3/intercept/EngineInterceptor$fetch$1;->g:Ljava/lang/Object;

    .line 128
    .line 129
    invoke-static {p6}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object p6

    .line 133
    iput-object p6, v0, Lcoil3/intercept/EngineInterceptor$fetch$1;->h:Ljava/lang/Object;

    .line 134
    .line 135
    iput-object v2, v0, Lcoil3/intercept/EngineInterceptor$fetch$1;->i:Ljava/lang/Object;

    .line 136
    .line 137
    iput v4, v0, Lcoil3/intercept/EngineInterceptor$fetch$1;->j:I

    .line 138
    .line 139
    iput v3, v0, Lcoil3/intercept/EngineInterceptor$fetch$1;->m:I

    .line 140
    .line 141
    invoke-interface {v2, v0}, Ln/k;->a(Lvc/c;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object p6

    .line 145
    if-ne p6, v1, :cond_3

    .line 146
    .line 147
    return-object v1

    .line 148
    :cond_3
    :goto_2
    check-cast p6, Ln/j;

    .line 149
    .line 150
    :try_start_0
    invoke-virtual {p5, p2, v2, p4, p6}, Lcoil3/b;->g(Lw/g;Ln/k;Lw/n;Ln/j;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 151
    .line 152
    .line 153
    if-eqz p6, :cond_4

    .line 154
    .line 155
    return-object p6

    .line 156
    :cond_4
    move p6, v4

    .line 157
    goto :goto_1

    .line 158
    :catchall_0
    move-exception p1

    .line 159
    instance-of p2, p6, Ln/p;

    .line 160
    .line 161
    if-eqz p2, :cond_5

    .line 162
    .line 163
    check-cast p6, Ln/p;

    .line 164
    .line 165
    goto :goto_3

    .line 166
    :cond_5
    const/4 p6, 0x0

    .line 167
    :goto_3
    if-eqz p6, :cond_6

    .line 168
    .line 169
    invoke-virtual {p6}, Ln/p;->b()Ll/r;

    .line 170
    .line 171
    .line 172
    move-result-object p2

    .line 173
    if-eqz p2, :cond_6

    .line 174
    .line 175
    invoke-static {p2}, Lcoil3/util/c;->i(Ljava/lang/AutoCloseable;)V

    .line 176
    .line 177
    .line 178
    :cond_6
    throw p1

    .line 179
    :cond_7
    new-instance p1, Ljava/lang/StringBuilder;

    .line 180
    .line 181
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 182
    .line 183
    .line 184
    const-string p2, "Unable to create a fetcher that supports: "

    .line 185
    .line 186
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 190
    .line 191
    .line 192
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object p1

    .line 196
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 197
    .line 198
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object p1

    .line 202
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    throw p2
.end method
