.class public final Lcoil3/network/NetworkFetcher;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp/k;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcoil3/network/NetworkFetcher$Factory;
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ly/m;

.field public final c:Lkotlin/Lazy;

.field public final d:Lkotlin/Lazy;

.field public final e:Lkotlin/Lazy;

.field public final f:Lu/b;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ly/m;Lkotlin/Lazy;Lkotlin/Lazy;Lkotlin/Lazy;Lu/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcoil3/network/NetworkFetcher;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lcoil3/network/NetworkFetcher;->b:Ly/m;

    .line 7
    .line 8
    iput-object p3, p0, Lcoil3/network/NetworkFetcher;->c:Lkotlin/Lazy;

    .line 9
    .line 10
    iput-object p4, p0, Lcoil3/network/NetworkFetcher;->d:Lkotlin/Lazy;

    .line 11
    .line 12
    iput-object p5, p0, Lcoil3/network/NetworkFetcher;->e:Lkotlin/Lazy;

    .line 13
    .line 14
    iput-object p6, p0, Lcoil3/network/NetworkFetcher;->f:Lu/b;

    .line 15
    .line 16
    return-void
.end method

.method public static final synthetic b(Lcoil3/network/NetworkFetcher;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcoil3/network/NetworkFetcher;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic c(Lcoil3/network/NetworkFetcher;Lu/m;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcoil3/network/NetworkFetcher;->n(Lu/m;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic d(Lcoil3/network/NetworkFetcher;Lcoil3/disk/a$c;)Ln/r;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcoil3/network/NetworkFetcher;->o(Lcoil3/disk/a$c;)Ln/r;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic e(Lcoil3/network/NetworkFetcher;Lokio/Buffer;)Ln/r;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcoil3/network/NetworkFetcher;->p(Lokio/Buffer;)Ln/r;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic f(Lcoil3/network/NetworkFetcher;Lcoil3/disk/a$c;)Lu/l;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcoil3/network/NetworkFetcher;->q(Lcoil3/disk/a$c;)Lu/l;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic g(Lcoil3/network/NetworkFetcher;Lcoil3/disk/a$c;Lu/l;Lu/j;Lu/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual/range {p0 .. p5}, Lcoil3/network/NetworkFetcher;->r(Lcoil3/disk/a$c;Lu/l;Lu/j;Lu/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public a(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 14

    .line 1
    instance-of v0, p1, Lcoil3/network/NetworkFetcher$fetch$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lcoil3/network/NetworkFetcher$fetch$1;

    .line 7
    .line 8
    iget v1, v0, Lcoil3/network/NetworkFetcher$fetch$1;->e:I

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
    iput v1, v0, Lcoil3/network/NetworkFetcher$fetch$1;->e:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcoil3/network/NetworkFetcher$fetch$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lcoil3/network/NetworkFetcher$fetch$1;-><init>(Lcoil3/network/NetworkFetcher;Lkotlin/coroutines/Continuation;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lcoil3/network/NetworkFetcher$fetch$1;->c:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcoil3/network/NetworkFetcher$fetch$1;->e:I

    .line 32
    .line 33
    const/4 v3, 0x3

    .line 34
    const/4 v4, 0x2

    .line 35
    const/4 v5, 0x1

    .line 36
    const/4 v6, 0x0

    .line 37
    if-eqz v2, :cond_4

    .line 38
    .line 39
    if-eq v2, v5, :cond_3

    .line 40
    .line 41
    if-eq v2, v4, :cond_2

    .line 42
    .line 43
    if-ne v2, v3, :cond_1

    .line 44
    .line 45
    iget-object v0, v0, Lcoil3/network/NetworkFetcher$fetch$1;->a:Ljava/lang/Object;

    .line 46
    .line 47
    move-object v1, v0

    .line 48
    check-cast v1, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 49
    .line 50
    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 51
    .line 52
    .line 53
    move-object v9, p0

    .line 54
    goto/16 :goto_d

    .line 55
    .line 56
    :catch_0
    move-exception v0

    .line 57
    move-object p1, v0

    .line 58
    move-object v9, p0

    .line 59
    goto/16 :goto_f

    .line 60
    .line 61
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 62
    .line 63
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 64
    .line 65
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    throw p1

    .line 69
    :cond_2
    iget-object v2, v0, Lcoil3/network/NetworkFetcher$fetch$1;->a:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v2, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 72
    .line 73
    :try_start_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 74
    .line 75
    .line 76
    move-object v9, p0

    .line 77
    goto/16 :goto_b

    .line 78
    .line 79
    :catch_1
    move-exception v0

    .line 80
    move-object p1, v0

    .line 81
    move-object v9, p0

    .line 82
    :goto_1
    move-object v1, v2

    .line 83
    goto/16 :goto_f

    .line 84
    .line 85
    :cond_3
    iget-object v2, v0, Lcoil3/network/NetworkFetcher$fetch$1;->b:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v2, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 88
    .line 89
    iget-object v5, v0, Lcoil3/network/NetworkFetcher$fetch$1;->a:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v5, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 92
    .line 93
    :try_start_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 94
    .line 95
    .line 96
    goto/16 :goto_4

    .line 97
    .line 98
    :catch_2
    move-exception v0

    .line 99
    move-object p1, v0

    .line 100
    move-object v9, p0

    .line 101
    move-object v1, v5

    .line 102
    goto/16 :goto_f

    .line 103
    .line 104
    :cond_4
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    new-instance p1, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 108
    .line 109
    invoke-direct {p1}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 110
    .line 111
    .line 112
    invoke-virtual {p0}, Lcoil3/network/NetworkFetcher;->m()Lcoil3/disk/a$c;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    iput-object v2, p1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 117
    .line 118
    :try_start_3
    new-instance v2, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 119
    .line 120
    invoke-direct {v2}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 121
    .line 122
    .line 123
    iget-object v7, p1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 124
    .line 125
    if-eqz v7, :cond_9

    .line 126
    .line 127
    invoke-virtual {p0}, Lcoil3/network/NetworkFetcher;->j()Lokio/FileSystem;

    .line 128
    .line 129
    .line 130
    move-result-object v7

    .line 131
    iget-object v8, p1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast v8, Lcoil3/disk/a$c;

    .line 134
    .line 135
    invoke-interface {v8}, Lcoil3/disk/a$c;->getMetadata()Lokio/Path;

    .line 136
    .line 137
    .line 138
    move-result-object v8

    .line 139
    invoke-virtual {v7, v8}, Lokio/FileSystem;->metadata(Lokio/Path;)Lokio/FileMetadata;

    .line 140
    .line 141
    .line 142
    move-result-object v7

    .line 143
    invoke-virtual {v7}, Lokio/FileMetadata;->getSize()Ljava/lang/Long;

    .line 144
    .line 145
    .line 146
    move-result-object v7

    .line 147
    if-nez v7, :cond_5

    .line 148
    .line 149
    goto :goto_3

    .line 150
    :cond_5
    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    .line 151
    .line 152
    .line 153
    move-result-wide v7

    .line 154
    const-wide/16 v9, 0x0

    .line 155
    .line 156
    cmp-long v7, v7, v9

    .line 157
    .line 158
    if-nez v7, :cond_6

    .line 159
    .line 160
    new-instance v0, Lp/p;

    .line 161
    .line 162
    iget-object v1, p1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 163
    .line 164
    check-cast v1, Lcoil3/disk/a$c;

    .line 165
    .line 166
    invoke-virtual {p0, v1}, Lcoil3/network/NetworkFetcher;->o(Lcoil3/disk/a$c;)Ln/r;

    .line 167
    .line 168
    .line 169
    move-result-object v1

    .line 170
    iget-object v2, p0, Lcoil3/network/NetworkFetcher;->a:Ljava/lang/String;

    .line 171
    .line 172
    invoke-virtual {p0, v2, v6}, Lcoil3/network/NetworkFetcher;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v2

    .line 176
    sget-object v3, Lcoil3/decode/DataSource;->c:Lcoil3/decode/DataSource;

    .line 177
    .line 178
    invoke-direct {v0, v1, v2, v3}, Lp/p;-><init>(Ln/r;Ljava/lang/String;Lcoil3/decode/DataSource;)V

    .line 179
    .line 180
    .line 181
    return-object v0

    .line 182
    :catch_3
    move-exception v0

    .line 183
    move-object v9, p0

    .line 184
    move-object v1, p1

    .line 185
    :goto_2
    move-object p1, v0

    .line 186
    goto/16 :goto_f

    .line 187
    .line 188
    :cond_6
    :goto_3
    iget-object v7, p1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 189
    .line 190
    check-cast v7, Lcoil3/disk/a$c;

    .line 191
    .line 192
    invoke-virtual {p0, v7}, Lcoil3/network/NetworkFetcher;->q(Lcoil3/disk/a$c;)Lu/l;

    .line 193
    .line 194
    .line 195
    move-result-object v7

    .line 196
    iput-object v7, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 197
    .line 198
    if-eqz v7, :cond_9

    .line 199
    .line 200
    iget-object v7, p0, Lcoil3/network/NetworkFetcher;->e:Lkotlin/Lazy;

    .line 201
    .line 202
    invoke-interface {v7}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v7

    .line 206
    check-cast v7, Lcoil3/network/b;

    .line 207
    .line 208
    iget-object v8, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 209
    .line 210
    check-cast v8, Lu/l;

    .line 211
    .line 212
    invoke-virtual {p0}, Lcoil3/network/NetworkFetcher;->l()Lu/j;

    .line 213
    .line 214
    .line 215
    move-result-object v9

    .line 216
    iget-object v10, p0, Lcoil3/network/NetworkFetcher;->b:Ly/m;

    .line 217
    .line 218
    iput-object p1, v0, Lcoil3/network/NetworkFetcher$fetch$1;->a:Ljava/lang/Object;

    .line 219
    .line 220
    iput-object v2, v0, Lcoil3/network/NetworkFetcher$fetch$1;->b:Ljava/lang/Object;

    .line 221
    .line 222
    iput v5, v0, Lcoil3/network/NetworkFetcher$fetch$1;->e:I

    .line 223
    .line 224
    invoke-interface {v7, v8, v9, v10, v0}, Lcoil3/network/b;->b(Lu/l;Lu/j;Ly/m;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v5
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    .line 228
    if-ne v5, v1, :cond_7

    .line 229
    .line 230
    move-object v9, p0

    .line 231
    goto/16 :goto_c

    .line 232
    .line 233
    :cond_7
    move-object v13, v5

    .line 234
    move-object v5, p1

    .line 235
    move-object p1, v13

    .line 236
    :goto_4
    :try_start_4
    check-cast p1, Lcoil3/network/b$b;

    .line 237
    .line 238
    invoke-virtual {p1}, Lcoil3/network/b$b;->b()Lu/l;

    .line 239
    .line 240
    .line 241
    move-result-object v7

    .line 242
    if-eqz v7, :cond_8

    .line 243
    .line 244
    new-instance v0, Lp/p;

    .line 245
    .line 246
    iget-object v1, v5, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 247
    .line 248
    check-cast v1, Lcoil3/disk/a$c;

    .line 249
    .line 250
    invoke-virtual {p0, v1}, Lcoil3/network/NetworkFetcher;->o(Lcoil3/disk/a$c;)Ln/r;

    .line 251
    .line 252
    .line 253
    move-result-object v1

    .line 254
    iget-object v2, p0, Lcoil3/network/NetworkFetcher;->a:Ljava/lang/String;

    .line 255
    .line 256
    invoke-virtual {p1}, Lcoil3/network/b$b;->b()Lu/l;

    .line 257
    .line 258
    .line 259
    move-result-object p1

    .line 260
    invoke-virtual {p1}, Lu/l;->e()Lcoil3/network/c;

    .line 261
    .line 262
    .line 263
    move-result-object p1

    .line 264
    const-string v3, "Content-Type"

    .line 265
    .line 266
    invoke-virtual {p1, v3}, Lcoil3/network/c;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object p1

    .line 270
    invoke-virtual {p0, v2, p1}, Lcoil3/network/NetworkFetcher;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    move-result-object p1

    .line 274
    sget-object v2, Lcoil3/decode/DataSource;->c:Lcoil3/decode/DataSource;

    .line 275
    .line 276
    invoke-direct {v0, v1, p1, v2}, Lp/p;-><init>(Ln/r;Ljava/lang/String;Lcoil3/decode/DataSource;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    .line 277
    .line 278
    .line 279
    return-object v0

    .line 280
    :cond_8
    move-object v8, v5

    .line 281
    :goto_5
    move-object v10, v2

    .line 282
    goto :goto_6

    .line 283
    :cond_9
    move-object v8, p1

    .line 284
    move-object p1, v6

    .line 285
    goto :goto_5

    .line 286
    :goto_6
    if-eqz p1, :cond_b

    .line 287
    .line 288
    :try_start_5
    invoke-virtual {p1}, Lcoil3/network/b$b;->a()Lu/j;

    .line 289
    .line 290
    .line 291
    move-result-object p1
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_4

    .line 292
    if-nez p1, :cond_a

    .line 293
    .line 294
    goto :goto_9

    .line 295
    :cond_a
    :goto_7
    move-object v11, p1

    .line 296
    goto :goto_a

    .line 297
    :catch_4
    move-exception v0

    .line 298
    move-object p1, v0

    .line 299
    move-object v9, p0

    .line 300
    :goto_8
    move-object v1, v8

    .line 301
    goto :goto_f

    .line 302
    :cond_b
    :goto_9
    :try_start_6
    invoke-virtual {p0}, Lcoil3/network/NetworkFetcher;->l()Lu/j;

    .line 303
    .line 304
    .line 305
    move-result-object p1

    .line 306
    goto :goto_7

    .line 307
    :goto_a
    new-instance v7, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_8

    .line 308
    .line 309
    const/4 v12, 0x0

    .line 310
    move-object v9, p0

    .line 311
    :try_start_7
    invoke-direct/range {v7 .. v12}, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;Lcoil3/network/NetworkFetcher;Lkotlin/jvm/internal/Ref$ObjectRef;Lu/j;Lkotlin/coroutines/Continuation;)V

    .line 312
    .line 313
    .line 314
    iput-object v8, v0, Lcoil3/network/NetworkFetcher$fetch$1;->a:Ljava/lang/Object;

    .line 315
    .line 316
    iput-object v6, v0, Lcoil3/network/NetworkFetcher$fetch$1;->b:Ljava/lang/Object;

    .line 317
    .line 318
    iput v4, v0, Lcoil3/network/NetworkFetcher$fetch$1;->e:I

    .line 319
    .line 320
    invoke-virtual {p0, v11, v7, v0}, Lcoil3/network/NetworkFetcher;->h(Lu/j;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    move-result-object p1
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_7

    .line 324
    if-ne p1, v1, :cond_c

    .line 325
    .line 326
    goto :goto_c

    .line 327
    :cond_c
    move-object v2, v8

    .line 328
    :goto_b
    :try_start_8
    check-cast p1, Lp/p;

    .line 329
    .line 330
    if-nez p1, :cond_e

    .line 331
    .line 332
    invoke-virtual {p0}, Lcoil3/network/NetworkFetcher;->l()Lu/j;

    .line 333
    .line 334
    .line 335
    move-result-object p1

    .line 336
    new-instance v4, Lcoil3/network/NetworkFetcher$fetch$2;

    .line 337
    .line 338
    invoke-direct {v4, p0, v6}, Lcoil3/network/NetworkFetcher$fetch$2;-><init>(Lcoil3/network/NetworkFetcher;Lkotlin/coroutines/Continuation;)V

    .line 339
    .line 340
    .line 341
    iput-object v2, v0, Lcoil3/network/NetworkFetcher$fetch$1;->a:Ljava/lang/Object;

    .line 342
    .line 343
    iput v3, v0, Lcoil3/network/NetworkFetcher$fetch$1;->e:I

    .line 344
    .line 345
    invoke-virtual {p0, p1, v4, v0}, Lcoil3/network/NetworkFetcher;->h(Lu/j;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 346
    .line 347
    .line 348
    move-result-object p1
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_6

    .line 349
    if-ne p1, v1, :cond_d

    .line 350
    .line 351
    :goto_c
    return-object v1

    .line 352
    :cond_d
    move-object v1, v2

    .line 353
    :goto_d
    :try_start_9
    check-cast p1, Lp/p;
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_5

    .line 354
    .line 355
    return-object p1

    .line 356
    :catch_5
    move-exception v0

    .line 357
    goto/16 :goto_2

    .line 358
    .line 359
    :catch_6
    move-exception v0

    .line 360
    move-object p1, v0

    .line 361
    goto/16 :goto_1

    .line 362
    .line 363
    :cond_e
    return-object p1

    .line 364
    :catch_7
    move-exception v0

    .line 365
    :goto_e
    move-object p1, v0

    .line 366
    goto :goto_8

    .line 367
    :catch_8
    move-exception v0

    .line 368
    move-object v9, p0

    .line 369
    goto :goto_e

    .line 370
    :goto_f
    iget-object v0, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 371
    .line 372
    check-cast v0, Lcoil3/disk/a$c;

    .line 373
    .line 374
    if-eqz v0, :cond_f

    .line 375
    .line 376
    invoke-static {v0}, Lcoil3/network/internal/UtilsKt;->c(Ljava/lang/AutoCloseable;)V

    .line 377
    .line 378
    .line 379
    :cond_f
    throw p1
.end method

.method public final h(Lu/j;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcoil3/network/NetworkFetcher;->b:Ly/m;

    .line 2
    .line 3
    invoke-virtual {v0}, Ly/m;->h()Lcoil3/request/CachePolicy;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lcoil3/request/CachePolicy;->c()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-static {}, Lv/e;->a()V

    .line 14
    .line 15
    .line 16
    :cond_0
    iget-object v0, p0, Lcoil3/network/NetworkFetcher;->c:Lkotlin/Lazy;

    .line 17
    .line 18
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Lu/f;

    .line 23
    .line 24
    new-instance v1, Lcoil3/network/NetworkFetcher$executeNetworkRequest$2;

    .line 25
    .line 26
    const/4 v2, 0x0

    .line 27
    invoke-direct {v1, p2, v2}, Lcoil3/network/NetworkFetcher$executeNetworkRequest$2;-><init>(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)V

    .line 28
    .line 29
    .line 30
    invoke-interface {v0, p1, v1, p3}, Lu/f;->a(Lu/j;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    return-object p1
.end method

.method public final i()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcoil3/network/NetworkFetcher;->b:Ly/m;

    .line 2
    .line 3
    invoke-virtual {v0}, Ly/m;->d()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcoil3/network/NetworkFetcher;->a:Ljava/lang/String;

    .line 10
    .line 11
    :cond_0
    return-object v0
.end method

.method public final j()Lokio/FileSystem;
    .locals 1

    .line 1
    iget-object v0, p0, Lcoil3/network/NetworkFetcher;->d:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcoil3/disk/a;

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    invoke-interface {v0}, Lcoil3/disk/a;->getFileSystem()Lokio/FileSystem;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    return-object v0

    .line 19
    :cond_1
    :goto_0
    iget-object v0, p0, Lcoil3/network/NetworkFetcher;->b:Ly/m;

    .line 20
    .line 21
    invoke-virtual {v0}, Ly/m;->g()Lokio/FileSystem;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    return-object v0
.end method

.method public final k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x0

    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    const-string v2, "text/plain"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-static {p2, v2, v3, v0, v1}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-eqz v2, :cond_1

    .line 13
    .line 14
    :cond_0
    sget-object v2, Le0/q;->a:Le0/q;

    .line 15
    .line 16
    invoke-virtual {v2, p1}, Le0/q;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    if-eqz p1, :cond_1

    .line 21
    .line 22
    return-object p1

    .line 23
    :cond_1
    if-eqz p2, :cond_2

    .line 24
    .line 25
    const/16 p1, 0x3b

    .line 26
    .line 27
    invoke-static {p2, p1, v1, v0, v1}, Lkotlin/text/StringsKt;->substringBefore$default(Ljava/lang/String;CLjava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    return-object p1

    .line 32
    :cond_2
    return-object v1
.end method

.method public final l()Lu/j;
    .locals 10

    .line 1
    iget-object v0, p0, Lcoil3/network/NetworkFetcher;->b:Ly/m;

    .line 2
    .line 3
    invoke-static {v0}, Lu/e;->b(Ly/m;)Lcoil3/network/c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lcoil3/network/c;->d()Lcoil3/network/c$a;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v1, p0, Lcoil3/network/NetworkFetcher;->b:Ly/m;

    .line 12
    .line 13
    invoke-virtual {v1}, Ly/m;->e()Lcoil3/request/CachePolicy;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, Lcoil3/request/CachePolicy;->c()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    iget-object v2, p0, Lcoil3/network/NetworkFetcher;->b:Ly/m;

    .line 22
    .line 23
    invoke-virtual {v2}, Ly/m;->h()Lcoil3/request/CachePolicy;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {v2}, Lcoil3/request/CachePolicy;->c()Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_0

    .line 32
    .line 33
    iget-object v2, p0, Lcoil3/network/NetworkFetcher;->f:Lu/b;

    .line 34
    .line 35
    invoke-interface {v2}, Lu/b;->c()Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-eqz v2, :cond_0

    .line 40
    .line 41
    const/4 v2, 0x1

    .line 42
    goto :goto_0

    .line 43
    :cond_0
    const/4 v2, 0x0

    .line 44
    :goto_0
    const-string v3, "Cache-Control"

    .line 45
    .line 46
    if-nez v2, :cond_1

    .line 47
    .line 48
    if-eqz v1, :cond_1

    .line 49
    .line 50
    const-string v1, "only-if-cached, max-stale=2147483647"

    .line 51
    .line 52
    invoke-virtual {v0, v3, v1}, Lcoil3/network/c$a;->c(Ljava/lang/String;Ljava/lang/String;)Lcoil3/network/c$a;

    .line 53
    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_1
    if-eqz v2, :cond_3

    .line 57
    .line 58
    if-nez v1, :cond_3

    .line 59
    .line 60
    iget-object v1, p0, Lcoil3/network/NetworkFetcher;->b:Ly/m;

    .line 61
    .line 62
    invoke-virtual {v1}, Ly/m;->e()Lcoil3/request/CachePolicy;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-virtual {v1}, Lcoil3/request/CachePolicy;->g()Z

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    if-eqz v1, :cond_2

    .line 71
    .line 72
    const-string v1, "no-cache"

    .line 73
    .line 74
    invoke-virtual {v0, v3, v1}, Lcoil3/network/c$a;->c(Ljava/lang/String;Ljava/lang/String;)Lcoil3/network/c$a;

    .line 75
    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_2
    const-string v1, "no-cache, no-store"

    .line 79
    .line 80
    invoke-virtual {v0, v3, v1}, Lcoil3/network/c$a;->c(Ljava/lang/String;Ljava/lang/String;)Lcoil3/network/c$a;

    .line 81
    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_3
    if-nez v2, :cond_4

    .line 85
    .line 86
    if-nez v1, :cond_4

    .line 87
    .line 88
    const-string v1, "no-cache, only-if-cached"

    .line 89
    .line 90
    invoke-virtual {v0, v3, v1}, Lcoil3/network/c$a;->c(Ljava/lang/String;Ljava/lang/String;)Lcoil3/network/c$a;

    .line 91
    .line 92
    .line 93
    :cond_4
    :goto_1
    new-instance v4, Lu/j;

    .line 94
    .line 95
    iget-object v5, p0, Lcoil3/network/NetworkFetcher;->a:Ljava/lang/String;

    .line 96
    .line 97
    iget-object v1, p0, Lcoil3/network/NetworkFetcher;->b:Ly/m;

    .line 98
    .line 99
    invoke-static {v1}, Lu/e;->c(Ly/m;)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v6

    .line 103
    invoke-virtual {v0}, Lcoil3/network/c$a;->b()Lcoil3/network/c;

    .line 104
    .line 105
    .line 106
    move-result-object v7

    .line 107
    iget-object v0, p0, Lcoil3/network/NetworkFetcher;->b:Ly/m;

    .line 108
    .line 109
    invoke-static {v0}, Lu/e;->a(Ly/m;)Lu/k;

    .line 110
    .line 111
    .line 112
    iget-object v0, p0, Lcoil3/network/NetworkFetcher;->b:Ly/m;

    .line 113
    .line 114
    invoke-virtual {v0}, Ly/m;->f()Lcoil3/c;

    .line 115
    .line 116
    .line 117
    move-result-object v9

    .line 118
    const/4 v8, 0x0

    .line 119
    invoke-direct/range {v4 .. v9}, Lu/j;-><init>(Ljava/lang/String;Ljava/lang/String;Lcoil3/network/c;Lu/k;Lcoil3/c;)V

    .line 120
    .line 121
    .line 122
    return-object v4
.end method

.method public final m()Lcoil3/disk/a$c;
    .locals 2

    .line 1
    iget-object v0, p0, Lcoil3/network/NetworkFetcher;->b:Ly/m;

    .line 2
    .line 3
    invoke-virtual {v0}, Ly/m;->e()Lcoil3/request/CachePolicy;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lcoil3/request/CachePolicy;->c()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lcoil3/network/NetworkFetcher;->d:Lkotlin/Lazy;

    .line 15
    .line 16
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Lcoil3/disk/a;

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    invoke-virtual {p0}, Lcoil3/network/NetworkFetcher;->i()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-interface {v0, v1}, Lcoil3/disk/a;->b(Ljava/lang/String;)Lcoil3/disk/a$c;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    return-object v0

    .line 33
    :cond_0
    return-object v1
.end method

.method public final n(Lu/m;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p2, Lcoil3/network/NetworkFetcher$toImageSource$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lcoil3/network/NetworkFetcher$toImageSource$1;

    .line 7
    .line 8
    iget v1, v0, Lcoil3/network/NetworkFetcher$toImageSource$1;->d:I

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
    iput v1, v0, Lcoil3/network/NetworkFetcher$toImageSource$1;->d:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcoil3/network/NetworkFetcher$toImageSource$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lcoil3/network/NetworkFetcher$toImageSource$1;-><init>(Lcoil3/network/NetworkFetcher;Lkotlin/coroutines/Continuation;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lcoil3/network/NetworkFetcher$toImageSource$1;->b:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcoil3/network/NetworkFetcher$toImageSource$1;->d:I

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
    iget-object p1, v0, Lcoil3/network/NetworkFetcher$toImageSource$1;->a:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p1, Lokio/Buffer;

    .line 41
    .line 42
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 47
    .line 48
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p1

    .line 54
    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    new-instance p2, Lokio/Buffer;

    .line 58
    .line 59
    invoke-direct {p2}, Lokio/Buffer;-><init>()V

    .line 60
    .line 61
    .line 62
    iput-object p2, v0, Lcoil3/network/NetworkFetcher$toImageSource$1;->a:Ljava/lang/Object;

    .line 63
    .line 64
    iput v3, v0, Lcoil3/network/NetworkFetcher$toImageSource$1;->d:I

    .line 65
    .line 66
    invoke-interface {p1, p2, v0}, Lu/m;->b(Lokio/BufferedSink;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    if-ne p1, v1, :cond_3

    .line 71
    .line 72
    return-object v1

    .line 73
    :cond_3
    move-object p1, p2

    .line 74
    :goto_1
    invoke-virtual {p0, p1}, Lcoil3/network/NetworkFetcher;->p(Lokio/Buffer;)Ln/r;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    return-object p1
.end method

.method public final o(Lcoil3/disk/a$c;)Ln/r;
    .locals 7

    .line 1
    invoke-interface {p1}, Lcoil3/disk/a$c;->getData()Lokio/Path;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lcoil3/network/NetworkFetcher;->j()Lokio/FileSystem;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {p0}, Lcoil3/network/NetworkFetcher;->i()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    const/16 v5, 0x10

    .line 14
    .line 15
    const/4 v6, 0x0

    .line 16
    const/4 v4, 0x0

    .line 17
    move-object v3, p1

    .line 18
    invoke-static/range {v0 .. v6}, Ln/s;->d(Lokio/Path;Lokio/FileSystem;Ljava/lang/String;Ljava/lang/AutoCloseable;Ln/r$a;ILjava/lang/Object;)Ln/r;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1
.end method

.method public final p(Lokio/Buffer;)Ln/r;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcoil3/network/NetworkFetcher;->j()Lokio/FileSystem;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x4

    .line 7
    invoke-static {p1, v0, v1, v2, v1}, Ln/s;->c(Lokio/BufferedSource;Lokio/FileSystem;Ln/r$a;ILjava/lang/Object;)Ln/r;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method

.method public final q(Lcoil3/disk/a$c;)Lu/l;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Lcoil3/network/NetworkFetcher;->j()Lokio/FileSystem;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    invoke-interface {p1}, Lcoil3/disk/a$c;->getMetadata()Lokio/Path;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {v1, p1}, Lokio/FileSystem;->source(Lokio/Path;)Lokio/Source;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-static {p1}, Lokio/Okio;->buffer(Lokio/Source;)Lokio/BufferedSource;

    .line 15
    .line 16
    .line 17
    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    :try_start_1
    sget-object v1, Lcoil3/network/a;->a:Lcoil3/network/a;

    .line 19
    .line 20
    invoke-virtual {v1, p1}, Lcoil3/network/a;->a(Lokio/BufferedSource;)Lu/l;

    .line 21
    .line 22
    .line 23
    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 24
    if-eqz p1, :cond_0

    .line 25
    .line 26
    :try_start_2
    invoke-interface {p1}, Ljava/io/Closeable;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception p1

    .line 31
    goto :goto_2

    .line 32
    :cond_0
    :goto_0
    move-object p1, v0

    .line 33
    goto :goto_2

    .line 34
    :catchall_1
    move-exception v1

    .line 35
    if-eqz p1, :cond_1

    .line 36
    .line 37
    :try_start_3
    invoke-interface {p1}, Ljava/io/Closeable;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :catchall_2
    move-exception p1

    .line 42
    :try_start_4
    invoke-static {v1, p1}, Lkotlin/ExceptionsKt;->addSuppressed(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 43
    .line 44
    .line 45
    :cond_1
    :goto_1
    move-object p1, v1

    .line 46
    move-object v1, v0

    .line 47
    :goto_2
    if-nez p1, :cond_2

    .line 48
    .line 49
    return-object v1

    .line 50
    :cond_2
    throw p1
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    .line 51
    :catch_0
    return-object v0
.end method

.method public final r(Lcoil3/disk/a$c;Lu/l;Lu/j;Lu/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 11

    .line 1
    move-object/from16 v0, p5

    .line 2
    .line 3
    instance-of v1, v0, Lcoil3/network/NetworkFetcher$writeToDiskCache$1;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, Lcoil3/network/NetworkFetcher$writeToDiskCache$1;

    .line 9
    .line 10
    iget v2, v1, Lcoil3/network/NetworkFetcher$writeToDiskCache$1;->f:I

    .line 11
    .line 12
    const/high16 v3, -0x80000000

    .line 13
    .line 14
    and-int v4, v2, v3

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    sub-int/2addr v2, v3

    .line 19
    iput v2, v1, Lcoil3/network/NetworkFetcher$writeToDiskCache$1;->f:I

    .line 20
    .line 21
    :goto_0
    move-object v7, v1

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    new-instance v1, Lcoil3/network/NetworkFetcher$writeToDiskCache$1;

    .line 24
    .line 25
    invoke-direct {v1, p0, v0}, Lcoil3/network/NetworkFetcher$writeToDiskCache$1;-><init>(Lcoil3/network/NetworkFetcher;Lkotlin/coroutines/Continuation;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :goto_1
    iget-object v0, v7, Lcoil3/network/NetworkFetcher$writeToDiskCache$1;->d:Ljava/lang/Object;

    .line 30
    .line 31
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    iget v2, v7, Lcoil3/network/NetworkFetcher$writeToDiskCache$1;->f:I

    .line 36
    .line 37
    const/4 v8, 0x2

    .line 38
    const/4 v3, 0x1

    .line 39
    const/4 v9, 0x0

    .line 40
    if-eqz v2, :cond_3

    .line 41
    .line 42
    if-eq v2, v3, :cond_2

    .line 43
    .line 44
    if-ne v2, v8, :cond_1

    .line 45
    .line 46
    iget-object p1, v7, Lcoil3/network/NetworkFetcher$writeToDiskCache$1;->c:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p1, Lcoil3/disk/a$b;

    .line 49
    .line 50
    iget-object p2, v7, Lcoil3/network/NetworkFetcher$writeToDiskCache$1;->b:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p2, Lu/l;

    .line 53
    .line 54
    iget-object p3, v7, Lcoil3/network/NetworkFetcher$writeToDiskCache$1;->a:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast p3, Lu/l;

    .line 57
    .line 58
    :try_start_0
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 59
    .line 60
    .line 61
    goto/16 :goto_6

    .line 62
    .line 63
    :catch_0
    move-exception v0

    .line 64
    goto/16 :goto_7

    .line 65
    .line 66
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 67
    .line 68
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 69
    .line 70
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    throw p1

    .line 74
    :cond_2
    iget-object p1, v7, Lcoil3/network/NetworkFetcher$writeToDiskCache$1;->b:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast p1, Lu/l;

    .line 77
    .line 78
    iget-object p2, v7, Lcoil3/network/NetworkFetcher$writeToDiskCache$1;->a:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast p2, Lcoil3/disk/a$c;

    .line 81
    .line 82
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    move-object v10, p2

    .line 86
    move-object p2, p1

    .line 87
    move-object p1, v10

    .line 88
    goto :goto_2

    .line 89
    :cond_3
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    iget-object v0, p0, Lcoil3/network/NetworkFetcher;->b:Ly/m;

    .line 93
    .line 94
    invoke-virtual {v0}, Ly/m;->e()Lcoil3/request/CachePolicy;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-virtual {v0}, Lcoil3/request/CachePolicy;->g()Z

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    if-nez v0, :cond_5

    .line 103
    .line 104
    if-eqz p1, :cond_4

    .line 105
    .line 106
    invoke-static {p1}, Lcoil3/network/internal/UtilsKt;->c(Ljava/lang/AutoCloseable;)V

    .line 107
    .line 108
    .line 109
    :cond_4
    return-object v9

    .line 110
    :cond_5
    iget-object v0, p0, Lcoil3/network/NetworkFetcher;->e:Lkotlin/Lazy;

    .line 111
    .line 112
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    move-object v2, v0

    .line 117
    check-cast v2, Lcoil3/network/b;

    .line 118
    .line 119
    iget-object v6, p0, Lcoil3/network/NetworkFetcher;->b:Ly/m;

    .line 120
    .line 121
    iput-object p1, v7, Lcoil3/network/NetworkFetcher$writeToDiskCache$1;->a:Ljava/lang/Object;

    .line 122
    .line 123
    iput-object p4, v7, Lcoil3/network/NetworkFetcher$writeToDiskCache$1;->b:Ljava/lang/Object;

    .line 124
    .line 125
    iput v3, v7, Lcoil3/network/NetworkFetcher$writeToDiskCache$1;->f:I

    .line 126
    .line 127
    move-object v3, p2

    .line 128
    move-object v4, p3

    .line 129
    move-object v5, p4

    .line 130
    invoke-interface/range {v2 .. v7}, Lcoil3/network/b;->a(Lu/l;Lu/j;Lu/l;Ly/m;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    if-ne v0, v1, :cond_6

    .line 135
    .line 136
    goto/16 :goto_5

    .line 137
    .line 138
    :cond_6
    move-object p2, p4

    .line 139
    :goto_2
    check-cast v0, Lcoil3/network/b$c;

    .line 140
    .line 141
    invoke-virtual {v0}, Lcoil3/network/b$c;->a()Lu/l;

    .line 142
    .line 143
    .line 144
    move-result-object p3

    .line 145
    if-nez p3, :cond_7

    .line 146
    .line 147
    return-object v9

    .line 148
    :cond_7
    if-eqz p1, :cond_8

    .line 149
    .line 150
    invoke-interface {p1}, Lcoil3/disk/a$c;->e()Lcoil3/disk/a$b;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    goto :goto_3

    .line 155
    :cond_8
    iget-object p1, p0, Lcoil3/network/NetworkFetcher;->d:Lkotlin/Lazy;

    .line 156
    .line 157
    invoke-interface {p1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    check-cast p1, Lcoil3/disk/a;

    .line 162
    .line 163
    if-eqz p1, :cond_9

    .line 164
    .line 165
    invoke-virtual {p0}, Lcoil3/network/NetworkFetcher;->i()Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    invoke-interface {p1, v0}, Lcoil3/disk/a;->a(Ljava/lang/String;)Lcoil3/disk/a$b;

    .line 170
    .line 171
    .line 172
    move-result-object p1

    .line 173
    goto :goto_3

    .line 174
    :cond_9
    move-object p1, v9

    .line 175
    :goto_3
    if-nez p1, :cond_a

    .line 176
    .line 177
    return-object v9

    .line 178
    :cond_a
    :try_start_1
    invoke-virtual {p0}, Lcoil3/network/NetworkFetcher;->j()Lokio/FileSystem;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    invoke-interface {p1}, Lcoil3/disk/a$b;->getMetadata()Lokio/Path;

    .line 183
    .line 184
    .line 185
    move-result-object v2

    .line 186
    const/4 v3, 0x0

    .line 187
    invoke-virtual {v0, v2, v3}, Lokio/FileSystem;->sink(Lokio/Path;Z)Lokio/Sink;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    invoke-static {v0}, Lokio/Okio;->buffer(Lokio/Sink;)Lokio/BufferedSink;

    .line 192
    .line 193
    .line 194
    move-result-object v2
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 195
    :try_start_2
    sget-object v0, Lcoil3/network/a;->a:Lcoil3/network/a;

    .line 196
    .line 197
    invoke-virtual {v0, p3, v2}, Lcoil3/network/a;->b(Lu/l;Lokio/BufferedSink;)V

    .line 198
    .line 199
    .line 200
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 201
    .line 202
    if-eqz v2, :cond_b

    .line 203
    .line 204
    :try_start_3
    invoke-interface {v2}, Ljava/io/Closeable;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 205
    .line 206
    .line 207
    goto :goto_4

    .line 208
    :catchall_0
    move-exception v0

    .line 209
    move-object v9, v0

    .line 210
    goto :goto_4

    .line 211
    :catchall_1
    move-exception v0

    .line 212
    move-object v9, v0

    .line 213
    if-eqz v2, :cond_b

    .line 214
    .line 215
    :try_start_4
    invoke-interface {v2}, Ljava/io/Closeable;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 216
    .line 217
    .line 218
    goto :goto_4

    .line 219
    :catchall_2
    move-exception v0

    .line 220
    :try_start_5
    invoke-static {v9, v0}, Lkotlin/ExceptionsKt;->addSuppressed(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 221
    .line 222
    .line 223
    goto :goto_4

    .line 224
    :catch_1
    move-exception v0

    .line 225
    move-object v10, p3

    .line 226
    move-object p3, p2

    .line 227
    move-object p2, v10

    .line 228
    goto :goto_7

    .line 229
    :cond_b
    :goto_4
    if-nez v9, :cond_d

    .line 230
    .line 231
    invoke-virtual {p3}, Lu/l;->c()Lu/m;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    if-eqz v0, :cond_c

    .line 236
    .line 237
    invoke-virtual {p0}, Lcoil3/network/NetworkFetcher;->j()Lokio/FileSystem;

    .line 238
    .line 239
    .line 240
    move-result-object v2

    .line 241
    invoke-interface {p1}, Lcoil3/disk/a$b;->getData()Lokio/Path;

    .line 242
    .line 243
    .line 244
    move-result-object v3

    .line 245
    iput-object p2, v7, Lcoil3/network/NetworkFetcher$writeToDiskCache$1;->a:Ljava/lang/Object;

    .line 246
    .line 247
    iput-object p3, v7, Lcoil3/network/NetworkFetcher$writeToDiskCache$1;->b:Ljava/lang/Object;

    .line 248
    .line 249
    iput-object p1, v7, Lcoil3/network/NetworkFetcher$writeToDiskCache$1;->c:Ljava/lang/Object;

    .line 250
    .line 251
    iput v8, v7, Lcoil3/network/NetworkFetcher$writeToDiskCache$1;->f:I

    .line 252
    .line 253
    invoke-interface {v0, v2, v3, v7}, Lu/m;->d(Lokio/FileSystem;Lokio/Path;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v0
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1

    .line 257
    if-ne v0, v1, :cond_c

    .line 258
    .line 259
    :goto_5
    return-object v1

    .line 260
    :cond_c
    move-object v10, p3

    .line 261
    move-object p3, p2

    .line 262
    move-object p2, v10

    .line 263
    :goto_6
    :try_start_6
    invoke-interface {p1}, Lcoil3/disk/a$b;->a()Lcoil3/disk/a$c;

    .line 264
    .line 265
    .line 266
    move-result-object p1
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    .line 267
    return-object p1

    .line 268
    :cond_d
    :try_start_7
    throw v9
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_1

    .line 269
    :goto_7
    invoke-static {p1}, Lcoil3/network/internal/UtilsKt;->a(Lcoil3/disk/a$b;)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {p3}, Lu/l;->c()Lu/m;

    .line 273
    .line 274
    .line 275
    move-result-object p1

    .line 276
    if-eqz p1, :cond_e

    .line 277
    .line 278
    invoke-static {p1}, Lcoil3/network/internal/UtilsKt;->c(Ljava/lang/AutoCloseable;)V

    .line 279
    .line 280
    .line 281
    :cond_e
    invoke-virtual {p2}, Lu/l;->c()Lu/m;

    .line 282
    .line 283
    .line 284
    move-result-object p1

    .line 285
    if-eqz p1, :cond_f

    .line 286
    .line 287
    invoke-static {p1}, Lcoil3/network/internal/UtilsKt;->c(Ljava/lang/AutoCloseable;)V

    .line 288
    .line 289
    .line 290
    :cond_f
    throw v0
.end method
