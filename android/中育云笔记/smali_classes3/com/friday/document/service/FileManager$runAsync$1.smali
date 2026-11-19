.class final Lcom/friday/document/service/FileManager$runAsync$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/service/FileManager;->E()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lhd/p;"
    }
.end annotation

.annotation runtime Lxc/d;
    c = "com.friday.document.service.FileManager$runAsync$1"
    f = "FileManager.kt"
    l = {
        0x5b,
        0x5b,
        0x60,
        0x67
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;

.field public g:Ljava/lang/Object;

.field public h:Ljava/lang/Object;

.field public i:Ljava/lang/Object;

.field public j:I

.field public k:I

.field public l:I

.field public m:I

.field public synthetic n:Ljava/lang/Object;

.field public final synthetic o:Lcom/friday/document/service/FileManager;


# direct methods
.method public constructor <init>(Lcom/friday/document/service/FileManager;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/service/FileManager$runAsync$1;->o:Lcom/friday/document/service/FileManager;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 2

    .line 1
    new-instance v0, Lcom/friday/document/service/FileManager$runAsync$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/friday/document/service/FileManager$runAsync$1;->o:Lcom/friday/document/service/FileManager;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Lcom/friday/document/service/FileManager$runAsync$1;-><init>(Lcom/friday/document/service/FileManager;Lvc/c;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Lcom/friday/document/service/FileManager$runAsync$1;->n:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/friday/document/service/FileManager$runAsync$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/service/FileManager$runAsync$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/document/service/FileManager$runAsync$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/document/service/FileManager$runAsync$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, Lcom/friday/document/service/FileManager$runAsync$1;->n:Ljava/lang/Object;

    .line 4
    .line 5
    move-object v2, v0

    .line 6
    check-cast v2, Lsd/i0;

    .line 7
    .line 8
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v3

    .line 12
    iget v0, v1, Lcom/friday/document/service/FileManager$runAsync$1;->m:I

    .line 13
    .line 14
    const/4 v4, 0x4

    .line 15
    const/4 v5, 0x3

    .line 16
    const/4 v6, 0x2

    .line 17
    const/4 v7, 0x1

    .line 18
    const/4 v8, 0x0

    .line 19
    const/4 v9, 0x0

    .line 20
    if-eqz v0, :cond_4

    .line 21
    .line 22
    if-eq v0, v7, :cond_3

    .line 23
    .line 24
    if-eq v0, v6, :cond_2

    .line 25
    .line 26
    if-eq v0, v5, :cond_1

    .line 27
    .line 28
    if-ne v0, v4, :cond_0

    .line 29
    .line 30
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    goto/16 :goto_9

    .line 34
    .line 35
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 36
    .line 37
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 38
    .line 39
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    throw v0

    .line 43
    :cond_1
    iget v10, v1, Lcom/friday/document/service/FileManager$runAsync$1;->j:I

    .line 44
    .line 45
    iget-object v0, v1, Lcom/friday/document/service/FileManager$runAsync$1;->i:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v0, Lsd/i0;

    .line 48
    .line 49
    iget-object v0, v1, Lcom/friday/document/service/FileManager$runAsync$1;->h:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v0, Lcom/friday/common/entity/FileEntity;

    .line 52
    .line 53
    iget-object v0, v1, Lcom/friday/document/service/FileManager$runAsync$1;->f:Ljava/lang/Object;

    .line 54
    .line 55
    move-object v11, v0

    .line 56
    check-cast v11, Ljava/util/Iterator;

    .line 57
    .line 58
    iget-object v0, v1, Lcom/friday/document/service/FileManager$runAsync$1;->e:Ljava/lang/Object;

    .line 59
    .line 60
    move-object v12, v0

    .line 61
    check-cast v12, Lcom/friday/document/service/FileManager;

    .line 62
    .line 63
    iget-object v0, v1, Lcom/friday/document/service/FileManager$runAsync$1;->d:Ljava/lang/Object;

    .line 64
    .line 65
    move-object v13, v0

    .line 66
    check-cast v13, Ljava/lang/Iterable;

    .line 67
    .line 68
    iget-object v0, v1, Lcom/friday/document/service/FileManager$runAsync$1;->c:Ljava/lang/Object;

    .line 69
    .line 70
    move-object v14, v0

    .line 71
    check-cast v14, Ljava/util/List;

    .line 72
    .line 73
    :try_start_0
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 74
    .line 75
    .line 76
    goto/16 :goto_4

    .line 77
    .line 78
    :catchall_0
    move-exception v0

    .line 79
    goto/16 :goto_5

    .line 80
    .line 81
    :cond_2
    :try_start_1
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 82
    .line 83
    .line 84
    move-object/from16 v0, p1

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :catch_0
    move-exception v0

    .line 88
    goto/16 :goto_7

    .line 89
    .line 90
    :cond_3
    iget-object v0, v1, Lcom/friday/document/service/FileManager$runAsync$1;->c:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v0, Lcom/friday/document/service/FileManager;

    .line 93
    .line 94
    :try_start_2
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 95
    .line 96
    .line 97
    move-object/from16 v10, p1

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_4
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    :goto_0
    invoke-static {v2}, Lkotlinx/coroutines/d;->f(Lsd/i0;)Z

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    if-eqz v0, :cond_b

    .line 108
    .line 109
    :try_start_3
    iget-object v0, v1, Lcom/friday/document/service/FileManager$runAsync$1;->o:Lcom/friday/document/service/FileManager;

    .line 110
    .line 111
    invoke-static {v0}, Lcom/friday/document/service/FileManager;->j(Lcom/friday/document/service/FileManager;)Lj2/g;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    invoke-interface {v0}, Lj2/g;->a()Z

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    if-nez v0, :cond_9

    .line 120
    .line 121
    sget-object v0, Lf2/c;->a:Lf2/c;

    .line 122
    .line 123
    invoke-virtual {v0}, Lf2/c;->e()Z

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    if-eqz v0, :cond_9

    .line 128
    .line 129
    iget-object v0, v1, Lcom/friday/document/service/FileManager$runAsync$1;->o:Lcom/friday/document/service/FileManager;

    .line 130
    .line 131
    invoke-static {v0}, Lcom/friday/document/service/FileManager;->i(Lcom/friday/document/service/FileManager;)Lcom/friday/common/dao/FileDao;

    .line 132
    .line 133
    .line 134
    move-result-object v10

    .line 135
    iget-object v11, v1, Lcom/friday/document/service/FileManager$runAsync$1;->o:Lcom/friday/document/service/FileManager;

    .line 136
    .line 137
    invoke-static {v11}, Lcom/friday/document/service/FileManager;->q(Lcom/friday/document/service/FileManager;)J

    .line 138
    .line 139
    .line 140
    move-result-wide v11

    .line 141
    iput-object v2, v1, Lcom/friday/document/service/FileManager$runAsync$1;->n:Ljava/lang/Object;

    .line 142
    .line 143
    iput-object v0, v1, Lcom/friday/document/service/FileManager$runAsync$1;->c:Ljava/lang/Object;

    .line 144
    .line 145
    iput v7, v1, Lcom/friday/document/service/FileManager$runAsync$1;->m:I

    .line 146
    .line 147
    invoke-interface {v10, v11, v12, v1}, Lcom/friday/common/dao/FileDao;->K(JLvc/c;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v10

    .line 151
    if-ne v10, v3, :cond_5

    .line 152
    .line 153
    goto/16 :goto_8

    .line 154
    .line 155
    :cond_5
    :goto_1
    check-cast v10, Ljava/util/List;

    .line 156
    .line 157
    iput-object v2, v1, Lcom/friday/document/service/FileManager$runAsync$1;->n:Ljava/lang/Object;

    .line 158
    .line 159
    iput-object v9, v1, Lcom/friday/document/service/FileManager$runAsync$1;->c:Ljava/lang/Object;

    .line 160
    .line 161
    iput v6, v1, Lcom/friday/document/service/FileManager$runAsync$1;->m:I

    .line 162
    .line 163
    invoke-static {v0, v10, v1}, Lcom/friday/document/service/FileManager;->g(Lcom/friday/document/service/FileManager;Ljava/util/List;Lvc/c;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    if-ne v0, v3, :cond_6

    .line 168
    .line 169
    goto/16 :goto_8

    .line 170
    .line 171
    :cond_6
    :goto_2
    check-cast v0, Ljava/util/List;

    .line 172
    .line 173
    move-object v10, v0

    .line 174
    check-cast v10, Ljava/util/Collection;

    .line 175
    .line 176
    invoke-interface {v10}, Ljava/util/Collection;->isEmpty()Z

    .line 177
    .line 178
    .line 179
    move-result v10

    .line 180
    if-nez v10, :cond_9

    .line 181
    .line 182
    move-object v10, v0

    .line 183
    check-cast v10, Ljava/lang/Iterable;

    .line 184
    .line 185
    iget-object v11, v1, Lcom/friday/document/service/FileManager$runAsync$1;->o:Lcom/friday/document/service/FileManager;

    .line 186
    .line 187
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 188
    .line 189
    .line 190
    move-result-object v12

    .line 191
    move-object v13, v12

    .line 192
    move-object v12, v11

    .line 193
    move-object v11, v13

    .line 194
    move-object v14, v0

    .line 195
    move-object v13, v10

    .line 196
    move v10, v8

    .line 197
    :goto_3
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 198
    .line 199
    .line 200
    move-result v0

    .line 201
    if-eqz v0, :cond_9

    .line 202
    .line 203
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    move-object v15, v0

    .line 208
    check-cast v15, Lcom/friday/common/entity/FileEntity;

    .line 209
    .line 210
    sget-object v16, Lf2/c;->a:Lf2/c;

    .line 211
    .line 212
    invoke-virtual/range {v16 .. v16}, Lf2/c;->e()Z

    .line 213
    .line 214
    .line 215
    move-result v16
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 216
    if-eqz v16, :cond_8

    .line 217
    .line 218
    :try_start_4
    sget-object v16, Lkotlin/Result;->d:Lkotlin/Result$a;

    .line 219
    .line 220
    iput-object v2, v1, Lcom/friday/document/service/FileManager$runAsync$1;->n:Ljava/lang/Object;

    .line 221
    .line 222
    invoke-static {v14}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v6

    .line 226
    iput-object v6, v1, Lcom/friday/document/service/FileManager$runAsync$1;->c:Ljava/lang/Object;

    .line 227
    .line 228
    invoke-static {v13}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v6

    .line 232
    iput-object v6, v1, Lcom/friday/document/service/FileManager$runAsync$1;->d:Ljava/lang/Object;

    .line 233
    .line 234
    iput-object v12, v1, Lcom/friday/document/service/FileManager$runAsync$1;->e:Ljava/lang/Object;

    .line 235
    .line 236
    iput-object v11, v1, Lcom/friday/document/service/FileManager$runAsync$1;->f:Ljava/lang/Object;

    .line 237
    .line 238
    invoke-static {v0}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    iput-object v0, v1, Lcom/friday/document/service/FileManager$runAsync$1;->g:Ljava/lang/Object;

    .line 243
    .line 244
    invoke-static {v15}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    iput-object v0, v1, Lcom/friday/document/service/FileManager$runAsync$1;->h:Ljava/lang/Object;

    .line 249
    .line 250
    invoke-static {v2}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    iput-object v0, v1, Lcom/friday/document/service/FileManager$runAsync$1;->i:Ljava/lang/Object;

    .line 255
    .line 256
    iput v10, v1, Lcom/friday/document/service/FileManager$runAsync$1;->j:I

    .line 257
    .line 258
    iput v8, v1, Lcom/friday/document/service/FileManager$runAsync$1;->k:I

    .line 259
    .line 260
    iput v8, v1, Lcom/friday/document/service/FileManager$runAsync$1;->l:I

    .line 261
    .line 262
    iput v5, v1, Lcom/friday/document/service/FileManager$runAsync$1;->m:I

    .line 263
    .line 264
    invoke-virtual {v12, v15, v1}, Lcom/friday/document/service/FileManager;->G(Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    if-ne v0, v3, :cond_7

    .line 269
    .line 270
    goto :goto_8

    .line 271
    :cond_7
    :goto_4
    sget-object v0, Lqc/q;->a:Lqc/q;

    .line 272
    .line 273
    invoke-static {v0}, Lkotlin/Result;->c(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 274
    .line 275
    .line 276
    goto :goto_6

    .line 277
    :goto_5
    :try_start_5
    sget-object v6, Lkotlin/Result;->d:Lkotlin/Result$a;

    .line 278
    .line 279
    invoke-static {v0}, Lkotlin/b;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object v0

    .line 283
    invoke-static {v0}, Lkotlin/Result;->c(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    .line 284
    .line 285
    .line 286
    :cond_8
    :goto_6
    const/4 v6, 0x2

    .line 287
    goto :goto_3

    .line 288
    :goto_7
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object v0

    .line 292
    new-instance v6, Ljava/lang/StringBuilder;

    .line 293
    .line 294
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 295
    .line 296
    .line 297
    const-string v10, "\u9875\u9762 FileManager.kt -> runAsync\uff0c\u540c\u6b65\u5faa\u73af\u5f02\u5e38\uff0c\u5f02\u5e38="

    .line 298
    .line 299
    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 300
    .line 301
    .line 302
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 303
    .line 304
    .line 305
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object v0

    .line 309
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    move-result-object v0

    .line 313
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    .line 314
    .line 315
    .line 316
    :cond_9
    iput-object v2, v1, Lcom/friday/document/service/FileManager$runAsync$1;->n:Ljava/lang/Object;

    .line 317
    .line 318
    iput-object v9, v1, Lcom/friday/document/service/FileManager$runAsync$1;->c:Ljava/lang/Object;

    .line 319
    .line 320
    iput-object v9, v1, Lcom/friday/document/service/FileManager$runAsync$1;->d:Ljava/lang/Object;

    .line 321
    .line 322
    iput-object v9, v1, Lcom/friday/document/service/FileManager$runAsync$1;->e:Ljava/lang/Object;

    .line 323
    .line 324
    iput-object v9, v1, Lcom/friday/document/service/FileManager$runAsync$1;->f:Ljava/lang/Object;

    .line 325
    .line 326
    iput-object v9, v1, Lcom/friday/document/service/FileManager$runAsync$1;->g:Ljava/lang/Object;

    .line 327
    .line 328
    iput-object v9, v1, Lcom/friday/document/service/FileManager$runAsync$1;->h:Ljava/lang/Object;

    .line 329
    .line 330
    iput-object v9, v1, Lcom/friday/document/service/FileManager$runAsync$1;->i:Ljava/lang/Object;

    .line 331
    .line 332
    iput v4, v1, Lcom/friday/document/service/FileManager$runAsync$1;->m:I

    .line 333
    .line 334
    const-wide/16 v10, 0x3e8

    .line 335
    .line 336
    invoke-static {v10, v11, v1}, Lkotlinx/coroutines/DelayKt;->b(JLvc/c;)Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    move-result-object v0

    .line 340
    if-ne v0, v3, :cond_a

    .line 341
    .line 342
    :goto_8
    return-object v3

    .line 343
    :cond_a
    :goto_9
    const/4 v6, 0x2

    .line 344
    goto/16 :goto_0

    .line 345
    .line 346
    :cond_b
    sget-object v0, Lqc/q;->a:Lqc/q;

    .line 347
    .line 348
    return-object v0
.end method
