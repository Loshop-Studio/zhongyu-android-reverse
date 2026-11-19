# RE note 本类字节码直接引用的读写或显示接口包括文件流。
.class final Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.friday.paint.view.six.NewPaintFragment$copyNote$1$1"
    f = "NewPaintFragment.kt"
    l = {
        0x365
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

.field public j:Ljava/lang/Object;

.field public k:Ljava/lang/Object;

.field public l:Ljava/lang/Object;

.field public m:Ljava/lang/Object;

.field public n:Ljava/lang/Object;

.field public o:Ljava/lang/Object;

.field public p:Ljava/lang/Object;

.field public q:I

.field public r:I

.field public s:I

.field public t:I

.field public u:I

.field public v:I

.field public final synthetic w:Ljava/lang/String;

.field public final synthetic x:Ljava/lang/String;

.field public final synthetic y:Lcom/friday/paint/view/six/NewPaintFragment;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/friday/paint/view/six/NewPaintFragment;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1$1;->w:Ljava/lang/String;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1$1;->x:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1$1;->y:Lcom/friday/paint/view/six/NewPaintFragment;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 3

    .line 1
    new-instance p1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1$1;->w:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1$1;->x:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v2, p0, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1$1;->y:Lcom/friday/paint/view/six/NewPaintFragment;

    .line 8
    .line 9
    invoke-direct {p1, v0, v1, v2, p2}, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1$1;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/friday/paint/view/six/NewPaintFragment;Lvc/c;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 26

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget v2, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1$1;->v:I

    .line 8
    .line 9
    const-string v3, "listFilesInDir(...)"

    .line 10
    .line 11
    const/4 v4, 0x1

    .line 12
    if-eqz v2, :cond_1

    .line 13
    .line 14
    if-ne v2, v4, :cond_0

    .line 15
    .line 16
    iget v2, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1$1;->t:I

    .line 17
    .line 18
    iget v7, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1$1;->s:I

    .line 19
    .line 20
    iget v8, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1$1;->r:I

    .line 21
    .line 22
    iget v9, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1$1;->q:I

    .line 23
    .line 24
    iget-object v10, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1$1;->p:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v10, Ljava/io/File;

    .line 27
    .line 28
    iget-object v11, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1$1;->n:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v11, Ljava/util/Iterator;

    .line 31
    .line 32
    iget-object v12, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1$1;->m:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v12, Ljava/lang/Iterable;

    .line 35
    .line 36
    iget-object v13, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1$1;->l:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v13, Ljava/io/File;

    .line 39
    .line 40
    iget-object v14, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1$1;->k:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v14, Ljava/io/File;

    .line 43
    .line 44
    iget-object v15, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1$1;->j:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v15, Ljava/io/File;

    .line 47
    .line 48
    iget-object v4, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1$1;->i:Ljava/lang/Object;

    .line 49
    .line 50
    iget-object v5, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1$1;->h:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v5, Ljava/util/Iterator;

    .line 53
    .line 54
    iget-object v6, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1$1;->g:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v6, Ljava/lang/String;

    .line 57
    .line 58
    move/from16 v17, v2

    .line 59
    .line 60
    iget-object v2, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1$1;->f:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v2, Lcom/friday/paint/view/six/NewPaintFragment;

    .line 63
    .line 64
    move-object/from16 v18, v2

    .line 65
    .line 66
    iget-object v2, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1$1;->e:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v2, Ljava/lang/String;

    .line 69
    .line 70
    move-object/from16 v19, v2

    .line 71
    .line 72
    iget-object v2, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1$1;->d:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v2, Ljava/lang/Iterable;

    .line 75
    .line 76
    move-object/from16 v20, v2

    .line 77
    .line 78
    iget-object v2, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1$1;->c:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v2, Ljava/lang/String;

    .line 81
    .line 82
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    move-object/from16 v24, v3

    .line 86
    .line 87
    move-object/from16 v16, v11

    .line 88
    .line 89
    move-object/from16 v21, v12

    .line 90
    .line 91
    move-object v3, v0

    .line 92
    move-object v12, v2

    .line 93
    move v11, v7

    .line 94
    move-object/from16 v2, v18

    .line 95
    .line 96
    move-object/from16 v0, p1

    .line 97
    .line 98
    move-object v7, v6

    .line 99
    move-object/from16 v18, v14

    .line 100
    .line 101
    move/from16 v6, v17

    .line 102
    .line 103
    move-object/from16 v17, v20

    .line 104
    .line 105
    move v14, v9

    .line 106
    move-object v9, v4

    .line 107
    move-object v4, v13

    .line 108
    move v13, v8

    .line 109
    move-object v8, v5

    .line 110
    move-object/from16 v5, v19

    .line 111
    .line 112
    move-object/from16 v19, v15

    .line 113
    .line 114
    const/4 v15, 0x1

    .line 115
    goto/16 :goto_9

    .line 116
    .line 117
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 118
    .line 119
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 120
    .line 121
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    throw v0

    .line 125
    :cond_1
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    iget-object v2, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1$1;->w:Ljava/lang/String;

    .line 129
    .line 130
    invoke-static {v2}, Lcom/blankj/utilcode/util/FileUtils;->createOrExistsDir(Ljava/lang/String;)Z

    .line 131
    .line 132
    .line 133
    move-result v2

    .line 134
    if-eqz v2, :cond_2

    .line 135
    .line 136
    iget-object v2, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1$1;->x:Ljava/lang/String;

    .line 137
    .line 138
    iget-object v4, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1$1;->w:Ljava/lang/String;

    .line 139
    .line 140
    invoke-static {v2, v4}, Lcom/blankj/utilcode/util/FileUtils;->copy(Ljava/lang/String;Ljava/lang/String;)Z

    .line 141
    .line 142
    .line 143
    :cond_2
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v2

    .line 151
    const-string v4, "toString(...)"

    .line 152
    .line 153
    invoke-static {v2, v4}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    iget-object v4, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1$1;->w:Ljava/lang/String;

    .line 157
    .line 158
    invoke-static {v4}, Lcom/blankj/utilcode/util/FileUtils;->listFilesInDir(Ljava/lang/String;)Ljava/util/List;

    .line 159
    .line 160
    .line 161
    move-result-object v4

    .line 162
    invoke-static {v4, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    check-cast v4, Ljava/lang/Iterable;

    .line 166
    .line 167
    iget-object v5, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1$1;->w:Ljava/lang/String;

    .line 168
    .line 169
    iget-object v6, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1$1;->y:Lcom/friday/paint/view/six/NewPaintFragment;

    .line 170
    .line 171
    iget-object v7, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1$1;->x:Ljava/lang/String;

    .line 172
    .line 173
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 174
    .line 175
    .line 176
    move-result-object v8

    .line 177
    move-object v11, v2

    .line 178
    const/4 v2, 0x0

    .line 179
    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 180
    .line 181
    .line 182
    move-result v9

    .line 183
    if-eqz v9, :cond_10

    .line 184
    .line 185
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v9

    .line 189
    move-object v10, v9

    .line 190
    check-cast v10, Ljava/io/File;

    .line 191
    .line 192
    invoke-virtual {v10}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v12

    .line 196
    const-string v13, "page_router.bin"

    .line 197
    .line 198
    invoke-static {v12, v13}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    move-result v12

    .line 202
    if-eqz v12, :cond_3

    .line 203
    .line 204
    invoke-static {}, Lcom/zykj/board/EzyPageRouter$PageRouter;->k()Lcom/zykj/board/EzyPageRouter$PageRouter$b;

    .line 205
    .line 206
    .line 207
    move-result-object v9

    .line 208
    invoke-static {}, Lcom/zykj/board/EzyPageRouter$PageRouter$PageInfo;->k()Lcom/zykj/board/EzyPageRouter$PageRouter$PageInfo$b;

    .line 209
    .line 210
    .line 211
    move-result-object v10

    .line 212
    invoke-virtual {v10, v11}, Lcom/zykj/board/EzyPageRouter$PageRouter$PageInfo$b;->q(Ljava/lang/String;)Lcom/zykj/board/EzyPageRouter$PageRouter$PageInfo$b;

    .line 213
    .line 214
    .line 215
    move-result-object v10

    .line 216
    const/4 v12, 0x0

    .line 217
    invoke-virtual {v10, v12}, Lcom/zykj/board/EzyPageRouter$PageRouter$PageInfo$b;->r(I)Lcom/zykj/board/EzyPageRouter$PageRouter$PageInfo$b;

    .line 218
    .line 219
    .line 220
    move-result-object v10

    .line 221
    invoke-virtual {v10}, Lcom/zykj/board/EzyPageRouter$PageRouter$PageInfo$b;->d()Lcom/zykj/board/EzyPageRouter$PageRouter$PageInfo;

    .line 222
    .line 223
    .line 224
    move-result-object v10

    .line 225
    invoke-virtual {v9, v10}, Lcom/zykj/board/EzyPageRouter$PageRouter$b;->d(Lcom/zykj/board/EzyPageRouter$PageRouter$PageInfo;)Lcom/zykj/board/EzyPageRouter$PageRouter$b;

    .line 226
    .line 227
    .line 228
    move-result-object v9

    .line 229
    invoke-virtual {v9}, Lcom/zykj/board/EzyPageRouter$PageRouter$b;->f()Lcom/zykj/board/EzyPageRouter$PageRouter;

    .line 230
    .line 231
    .line 232
    move-result-object v9

    .line 233
    sget-object v10, Lna/k;->a:Lna/k;

    .line 234
    .line 235
    invoke-static {v9}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 236
    .line 237
    .line 238
    invoke-virtual {v10, v5, v13, v9}, Lna/k;->c(Ljava/lang/String;Ljava/lang/String;Lcom/google/protobuf/MessageLite;)Ljava/io/File;

    .line 239
    .line 240
    .line 241
    :goto_1
    move/from16 p1, v2

    .line 242
    .line 243
    move-object/from16 v24, v3

    .line 244
    .line 245
    move-object/from16 v17, v4

    .line 246
    .line 247
    :goto_2
    const/4 v15, 0x1

    .line 248
    move-object v3, v0

    .line 249
    goto/16 :goto_b

    .line 250
    .line 251
    :cond_3
    invoke-virtual {v10}, Ljava/io/File;->isDirectory()Z

    .line 252
    .line 253
    .line 254
    move-result v12

    .line 255
    if-eqz v12, :cond_7

    .line 256
    .line 257
    invoke-virtual {v10}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v12

    .line 261
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    .line 262
    .line 263
    .line 264
    move-result v12

    .line 265
    const/16 v13, 0x24

    .line 266
    .line 267
    if-ne v12, v13, :cond_7

    .line 268
    .line 269
    new-instance v9, Ljava/io/File;

    .line 270
    .line 271
    const-string v12, "page_mdb"

    .line 272
    .line 273
    invoke-direct {v9, v5, v12}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    invoke-virtual {v9}, Ljava/io/File;->exists()Z

    .line 277
    .line 278
    .line 279
    move-result v9

    .line 280
    if-eqz v9, :cond_4

    .line 281
    .line 282
    invoke-static {v6, v5}, Lcom/friday/paint/view/six/NewPaintFragment;->access$handleMdbUpdate(Lcom/friday/paint/view/six/NewPaintFragment;Ljava/lang/String;)V

    .line 283
    .line 284
    .line 285
    goto :goto_1

    .line 286
    :cond_4
    invoke-virtual {v10}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object v9

    .line 290
    invoke-static {v9, v11}, Lcom/blankj/utilcode/util/FileUtils;->rename(Ljava/lang/String;Ljava/lang/String;)Z

    .line 291
    .line 292
    .line 293
    move-result v9

    .line 294
    if-eqz v9, :cond_6

    .line 295
    .line 296
    invoke-virtual {v10}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object v9

    .line 300
    const-string v12, "getAbsolutePath(...)"

    .line 301
    .line 302
    invoke-static {v9, v12}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 303
    .line 304
    .line 305
    invoke-virtual {v10}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object v10

    .line 309
    const-string v12, "getName(...)"

    .line 310
    .line 311
    invoke-static {v10, v12}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 312
    .line 313
    .line 314
    const/4 v13, 0x4

    .line 315
    const/4 v14, 0x0

    .line 316
    const/4 v12, 0x0

    .line 317
    invoke-static/range {v9 .. v14}, Lqd/z;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    .line 318
    .line 319
    .line 320
    move-result-object v9

    .line 321
    new-instance v10, Ljava/util/HashMap;

    .line 322
    .line 323
    invoke-direct {v10}, Ljava/util/HashMap;-><init>()V

    .line 324
    .line 325
    .line 326
    new-instance v12, Ljava/io/FileInputStream;

    .line 327
    .line 328
    new-instance v13, Ljava/io/File;

    .line 329
    .line 330
    const-string v14, "router.bin"

    .line 331
    .line 332
    invoke-direct {v13, v9, v14}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 333
    .line 334
    .line 335
    invoke-direct {v12, v13}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 336
    .line 337
    .line 338
    :try_start_0
    invoke-static {v12}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->U(Ljava/io/InputStream;)Lcom/zykj/board/EzyRouterRecord$RouterRecord;

    .line 339
    .line 340
    .line 341
    move-result-object v13

    .line 342
    invoke-virtual {v13}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->E()Ljava/util/List;

    .line 343
    .line 344
    .line 345
    move-result-object v15

    .line 346
    move/from16 p1, v2

    .line 347
    .line 348
    const-string v2, "getCommandRecordList(...)"

    .line 349
    .line 350
    invoke-static {v15, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 351
    .line 352
    .line 353
    const-string v2, "_command.bin"

    .line 354
    .line 355
    invoke-static {v6, v9, v15, v2, v10}, Lcom/friday/paint/view/six/NewPaintFragment;->access$renameBin(Lcom/friday/paint/view/six/NewPaintFragment;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/HashMap;)Ljava/util/List;

    .line 356
    .line 357
    .line 358
    move-result-object v2

    .line 359
    invoke-virtual {v13}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->C()Ljava/util/List;

    .line 360
    .line 361
    .line 362
    move-result-object v15

    .line 363
    move-object/from16 v17, v2

    .line 364
    .line 365
    const-string v2, "getAudioRecordList(...)"

    .line 366
    .line 367
    invoke-static {v15, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 368
    .line 369
    .line 370
    const-string v2, "_audio.bin"

    .line 371
    .line 372
    invoke-static {v6, v9, v15, v2, v10}, Lcom/friday/paint/view/six/NewPaintFragment;->access$renameBin(Lcom/friday/paint/view/six/NewPaintFragment;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/HashMap;)Ljava/util/List;

    .line 373
    .line 374
    .line 375
    move-result-object v2

    .line 376
    invoke-virtual {v13}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->Q()Ljava/util/List;

    .line 377
    .line 378
    .line 379
    move-result-object v15

    .line 380
    move-object/from16 v18, v2

    .line 381
    .line 382
    const-string v2, "getTouchSourceRecordList(...)"

    .line 383
    .line 384
    invoke-static {v15, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 385
    .line 386
    .line 387
    const-string v2, "_touch.bin"

    .line 388
    .line 389
    invoke-static {v6, v9, v15, v2, v10}, Lcom/friday/paint/view/six/NewPaintFragment;->access$renameBin(Lcom/friday/paint/view/six/NewPaintFragment;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/HashMap;)Ljava/util/List;

    .line 390
    .line 391
    .line 392
    move-result-object v2

    .line 393
    invoke-virtual {v13}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->I()Ljava/util/List;

    .line 394
    .line 395
    .line 396
    move-result-object v15

    .line 397
    move-object/from16 v19, v2

    .line 398
    .line 399
    const-string v2, "getFileSourceRecordList(...)"

    .line 400
    .line 401
    invoke-static {v15, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 402
    .line 403
    .line 404
    const-string v2, "_file.bin"

    .line 405
    .line 406
    invoke-static {v6, v9, v15, v2, v10}, Lcom/friday/paint/view/six/NewPaintFragment;->access$renameBin(Lcom/friday/paint/view/six/NewPaintFragment;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/HashMap;)Ljava/util/List;

    .line 407
    .line 408
    .line 409
    move-result-object v2

    .line 410
    invoke-virtual {v13}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->O()Ljava/util/List;

    .line 411
    .line 412
    .line 413
    move-result-object v15

    .line 414
    move-object/from16 v20, v2

    .line 415
    .line 416
    const-string v2, "getTextSourceRecordList(...)"

    .line 417
    .line 418
    invoke-static {v15, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 419
    .line 420
    .line 421
    const-string v2, "_text.bin"

    .line 422
    .line 423
    invoke-static {v6, v9, v15, v2, v10}, Lcom/friday/paint/view/six/NewPaintFragment;->access$renameBin(Lcom/friday/paint/view/six/NewPaintFragment;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/HashMap;)Ljava/util/List;

    .line 424
    .line 425
    .line 426
    move-result-object v2

    .line 427
    invoke-virtual {v13}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->M()Ljava/util/List;

    .line 428
    .line 429
    .line 430
    move-result-object v15

    .line 431
    move-object/from16 v21, v2

    .line 432
    .line 433
    const-string v2, "getMatrixSourceRecordList(...)"

    .line 434
    .line 435
    invoke-static {v15, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 436
    .line 437
    .line 438
    const-string v2, "_matrix.bin"

    .line 439
    .line 440
    invoke-static {v6, v9, v15, v2, v10}, Lcom/friday/paint/view/six/NewPaintFragment;->access$renameBin(Lcom/friday/paint/view/six/NewPaintFragment;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/HashMap;)Ljava/util/List;

    .line 441
    .line 442
    .line 443
    move-result-object v2

    .line 444
    invoke-virtual {v13}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->V()Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;

    .line 445
    .line 446
    .line 447
    move-result-object v13

    .line 448
    invoke-virtual {v13}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->w()Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;

    .line 449
    .line 450
    .line 451
    move-result-object v13

    .line 452
    invoke-virtual {v13}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->v()Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;

    .line 453
    .line 454
    .line 455
    move-result-object v13

    .line 456
    invoke-virtual {v13}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->y()Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;

    .line 457
    .line 458
    .line 459
    move-result-object v13

    .line 460
    invoke-virtual {v13}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->z()Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;

    .line 461
    .line 462
    .line 463
    move-result-object v13

    .line 464
    invoke-virtual {v13}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->B()Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;

    .line 465
    .line 466
    .line 467
    move-result-object v13

    .line 468
    invoke-virtual {v13}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->C()Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;

    .line 469
    .line 470
    .line 471
    move-result-object v13

    .line 472
    move-object/from16 v15, v17

    .line 473
    .line 474
    check-cast v15, Ljava/lang/Iterable;

    .line 475
    .line 476
    invoke-virtual {v13, v15}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->d(Ljava/lang/Iterable;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;

    .line 477
    .line 478
    .line 479
    move-result-object v13

    .line 480
    move-object/from16 v15, v18

    .line 481
    .line 482
    check-cast v15, Ljava/lang/Iterable;

    .line 483
    .line 484
    invoke-virtual {v13, v15}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->b(Ljava/lang/Iterable;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;

    .line 485
    .line 486
    .line 487
    move-result-object v13

    .line 488
    move-object/from16 v15, v19

    .line 489
    .line 490
    check-cast v15, Ljava/lang/Iterable;

    .line 491
    .line 492
    invoke-virtual {v13, v15}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->h(Ljava/lang/Iterable;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;

    .line 493
    .line 494
    .line 495
    move-result-object v13

    .line 496
    move-object/from16 v15, v20

    .line 497
    .line 498
    check-cast v15, Ljava/lang/Iterable;

    .line 499
    .line 500
    invoke-virtual {v13, v15}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->e(Ljava/lang/Iterable;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;

    .line 501
    .line 502
    .line 503
    move-result-object v13

    .line 504
    move-object/from16 v15, v21

    .line 505
    .line 506
    check-cast v15, Ljava/lang/Iterable;

    .line 507
    .line 508
    invoke-virtual {v13, v15}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->g(Ljava/lang/Iterable;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;

    .line 509
    .line 510
    .line 511
    move-result-object v13

    .line 512
    check-cast v2, Ljava/lang/Iterable;

    .line 513
    .line 514
    invoke-virtual {v13, v2}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->f(Ljava/lang/Iterable;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;

    .line 515
    .line 516
    .line 517
    move-result-object v2

    .line 518
    invoke-virtual {v2}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->q()Lcom/zykj/board/EzyRouterRecord$RouterRecord;

    .line 519
    .line 520
    .line 521
    move-result-object v2

    .line 522
    sget-object v13, Lna/k;->a:Lna/k;

    .line 523
    .line 524
    invoke-static {v2}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 525
    .line 526
    .line 527
    invoke-virtual {v13, v9, v14, v2}, Lna/k;->c(Ljava/lang/String;Ljava/lang/String;Lcom/google/protobuf/MessageLite;)Ljava/io/File;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 528
    .line 529
    .line 530
    const/4 v2, 0x0

    .line 531
    invoke-static {v12, v2}, Lcd/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 532
    .line 533
    .line 534
    new-instance v2, Ljava/io/FileInputStream;

    .line 535
    .line 536
    new-instance v12, Ljava/io/File;

    .line 537
    .line 538
    const-string v14, "snapshot.bin"

    .line 539
    .line 540
    invoke-direct {v12, v9, v14}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 541
    .line 542
    .line 543
    invoke-direct {v2, v12}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 544
    .line 545
    .line 546
    :try_start_1
    invoke-static {v2}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;->t(Ljava/io/InputStream;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;

    .line 547
    .line 548
    .line 549
    move-result-object v12

    .line 550
    invoke-virtual {v12}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;->u()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$b;

    .line 551
    .line 552
    .line 553
    move-result-object v12

    .line 554
    invoke-virtual {v12}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$b;->o()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    .line 555
    .line 556
    .line 557
    move-result-object v15

    .line 558
    move-object/from16 v17, v4

    .line 559
    .line 560
    const-string v4, "getGraphSnapshot(...)"

    .line 561
    .line 562
    invoke-static {v15, v4}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 563
    .line 564
    .line 565
    invoke-static {v6, v15, v10}, Lcom/friday/paint/view/six/NewPaintFragment;->access$updateGraphName(Lcom/friday/paint/view/six/NewPaintFragment;Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;Ljava/util/HashMap;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    .line 566
    .line 567
    .line 568
    move-result-object v4

    .line 569
    invoke-virtual {v12, v4}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$b;->y(Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$b;

    .line 570
    .line 571
    .line 572
    sget-object v4, Lqc/q;->a:Lqc/q;

    .line 573
    .line 574
    invoke-virtual {v12}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$b;->d()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;

    .line 575
    .line 576
    .line 577
    move-result-object v4

    .line 578
    const-string v10, "build(...)"

    .line 579
    .line 580
    invoke-static {v4, v10}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 581
    .line 582
    .line 583
    invoke-virtual {v13, v9, v14, v4}, Lna/k;->c(Ljava/lang/String;Ljava/lang/String;Lcom/google/protobuf/MessageLite;)Ljava/io/File;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 584
    .line 585
    .line 586
    const/4 v4, 0x0

    .line 587
    invoke-static {v2, v4}, Lcd/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 588
    .line 589
    .line 590
    :cond_5
    :goto_3
    move-object/from16 v24, v3

    .line 591
    .line 592
    goto/16 :goto_2

    .line 593
    .line 594
    :catchall_0
    move-exception v0

    .line 595
    move-object v3, v0

    .line 596
    :try_start_2
    throw v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 597
    :catchall_1
    move-exception v0

    .line 598
    invoke-static {v2, v3}, Lcd/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 599
    .line 600
    .line 601
    throw v0

    .line 602
    :catchall_2
    move-exception v0

    .line 603
    move-object v2, v0

    .line 604
    :try_start_3
    throw v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 605
    :catchall_3
    move-exception v0

    .line 606
    invoke-static {v12, v2}, Lcd/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 607
    .line 608
    .line 609
    throw v0

    .line 610
    :cond_6
    move/from16 p1, v2

    .line 611
    .line 612
    move-object/from16 v17, v4

    .line 613
    .line 614
    goto :goto_3

    .line 615
    :cond_7
    move/from16 p1, v2

    .line 616
    .line 617
    move-object/from16 v17, v4

    .line 618
    .line 619
    const/4 v4, 0x0

    .line 620
    invoke-virtual {v10}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 621
    .line 622
    .line 623
    move-result-object v2

    .line 624
    const-string v12, "res"

    .line 625
    .line 626
    invoke-static {v2, v12}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 627
    .line 628
    .line 629
    move-result v2

    .line 630
    if-eqz v2, :cond_5

    .line 631
    .line 632
    invoke-static {v10}, Lcom/blankj/utilcode/util/FileUtils;->listFilesInDir(Ljava/io/File;)Ljava/util/List;

    .line 633
    .line 634
    .line 635
    move-result-object v2

    .line 636
    if-eqz v2, :cond_5

    .line 637
    .line 638
    check-cast v2, Ljava/lang/Iterable;

    .line 639
    .line 640
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 641
    .line 642
    .line 643
    move-result-object v2

    .line 644
    :cond_8
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 645
    .line 646
    .line 647
    move-result v12

    .line 648
    if-eqz v12, :cond_9

    .line 649
    .line 650
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 651
    .line 652
    .line 653
    move-result-object v12

    .line 654
    move-object v13, v12

    .line 655
    check-cast v13, Ljava/io/File;

    .line 656
    .line 657
    invoke-virtual {v13}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 658
    .line 659
    .line 660
    move-result-object v13

    .line 661
    const-string v14, "image"

    .line 662
    .line 663
    invoke-static {v13, v14}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 664
    .line 665
    .line 666
    move-result v13

    .line 667
    if-eqz v13, :cond_8

    .line 668
    .line 669
    move-object v2, v12

    .line 670
    goto :goto_4

    .line 671
    :cond_9
    move-object v2, v4

    .line 672
    :goto_4
    check-cast v2, Ljava/io/File;

    .line 673
    .line 674
    if-eqz v2, :cond_5

    .line 675
    .line 676
    invoke-static {v2}, Lcom/blankj/utilcode/util/FileUtils;->listFilesInDir(Ljava/io/File;)Ljava/util/List;

    .line 677
    .line 678
    .line 679
    move-result-object v12

    .line 680
    invoke-static {v12, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 681
    .line 682
    .line 683
    check-cast v12, Ljava/lang/Iterable;

    .line 684
    .line 685
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 686
    .line 687
    .line 688
    move-result-object v13

    .line 689
    move-object v4, v2

    .line 690
    move-object/from16 v18, v4

    .line 691
    .line 692
    move-object v2, v6

    .line 693
    move-object/from16 v19, v10

    .line 694
    .line 695
    move-object v15, v12

    .line 696
    move-object v14, v13

    .line 697
    const/4 v6, 0x0

    .line 698
    const/4 v10, 0x0

    .line 699
    const/4 v12, 0x0

    .line 700
    move/from16 v13, p1

    .line 701
    .line 702
    :goto_5
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 703
    .line 704
    .line 705
    move-result v20

    .line 706
    if-eqz v20, :cond_f

    .line 707
    .line 708
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 709
    .line 710
    .line 711
    move-result-object v20

    .line 712
    move-object/from16 p1, v9

    .line 713
    .line 714
    move-object/from16 v9, v20

    .line 715
    .line 716
    check-cast v9, Ljava/io/File;

    .line 717
    .line 718
    move-object/from16 v21, v15

    .line 719
    .line 720
    invoke-static {v2}, Lcom/friday/paint/view/six/NewPaintFragment;->access$getViewModel(Lcom/friday/paint/view/six/NewPaintFragment;)Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 721
    .line 722
    .line 723
    move-result-object v15

    .line 724
    move-object/from16 v22, v0

    .line 725
    .line 726
    move-object/from16 v23, v15

    .line 727
    .line 728
    const/4 v0, 0x1

    .line 729
    invoke-static {v7, v0}, Lcom/blankj/utilcode/util/FileUtils;->listFilesInDir(Ljava/lang/String;Z)Ljava/util/List;

    .line 730
    .line 731
    .line 732
    move-result-object v15

    .line 733
    invoke-static {v15, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 734
    .line 735
    .line 736
    check-cast v15, Ljava/lang/Iterable;

    .line 737
    .line 738
    invoke-interface {v15}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 739
    .line 740
    .line 741
    move-result-object v0

    .line 742
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 743
    .line 744
    .line 745
    move-result v15

    .line 746
    if-eqz v15, :cond_b

    .line 747
    .line 748
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 749
    .line 750
    .line 751
    move-result-object v15

    .line 752
    move-object/from16 v24, v15

    .line 753
    .line 754
    check-cast v24, Ljava/io/File;

    .line 755
    .line 756
    move-object/from16 v25, v0

    .line 757
    .line 758
    invoke-virtual/range {v24 .. v24}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 759
    .line 760
    .line 761
    move-result-object v0

    .line 762
    move-object/from16 v24, v3

    .line 763
    .line 764
    invoke-virtual {v9}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 765
    .line 766
    .line 767
    move-result-object v3

    .line 768
    invoke-static {v0, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 769
    .line 770
    .line 771
    move-result v0

    .line 772
    if-eqz v0, :cond_a

    .line 773
    .line 774
    goto :goto_7

    .line 775
    :cond_a
    move-object/from16 v3, v24

    .line 776
    .line 777
    move-object/from16 v0, v25

    .line 778
    .line 779
    goto :goto_6

    .line 780
    :cond_b
    move-object/from16 v24, v3

    .line 781
    .line 782
    const/4 v15, 0x0

    .line 783
    :goto_7
    check-cast v15, Ljava/io/File;

    .line 784
    .line 785
    if-eqz v15, :cond_c

    .line 786
    .line 787
    invoke-virtual {v15}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 788
    .line 789
    .line 790
    move-result-object v0

    .line 791
    goto :goto_8

    .line 792
    :cond_c
    const/4 v0, 0x0

    .line 793
    :goto_8
    iput-object v11, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1$1;->c:Ljava/lang/Object;

    .line 794
    .line 795
    invoke-static/range {v17 .. v17}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 796
    .line 797
    .line 798
    move-result-object v3

    .line 799
    iput-object v3, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1$1;->d:Ljava/lang/Object;

    .line 800
    .line 801
    iput-object v5, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1$1;->e:Ljava/lang/Object;

    .line 802
    .line 803
    iput-object v2, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1$1;->f:Ljava/lang/Object;

    .line 804
    .line 805
    iput-object v7, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1$1;->g:Ljava/lang/Object;

    .line 806
    .line 807
    iput-object v8, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1$1;->h:Ljava/lang/Object;

    .line 808
    .line 809
    invoke-static/range {p1 .. p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 810
    .line 811
    .line 812
    move-result-object v3

    .line 813
    iput-object v3, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1$1;->i:Ljava/lang/Object;

    .line 814
    .line 815
    invoke-static/range {v19 .. v19}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 816
    .line 817
    .line 818
    move-result-object v3

    .line 819
    iput-object v3, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1$1;->j:Ljava/lang/Object;

    .line 820
    .line 821
    invoke-static/range {v18 .. v18}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 822
    .line 823
    .line 824
    move-result-object v3

    .line 825
    iput-object v3, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1$1;->k:Ljava/lang/Object;

    .line 826
    .line 827
    iput-object v4, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1$1;->l:Ljava/lang/Object;

    .line 828
    .line 829
    invoke-static/range {v21 .. v21}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 830
    .line 831
    .line 832
    move-result-object v3

    .line 833
    iput-object v3, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1$1;->m:Ljava/lang/Object;

    .line 834
    .line 835
    iput-object v14, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1$1;->n:Ljava/lang/Object;

    .line 836
    .line 837
    invoke-static/range {v20 .. v20}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 838
    .line 839
    .line 840
    move-result-object v3

    .line 841
    iput-object v3, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1$1;->o:Ljava/lang/Object;

    .line 842
    .line 843
    iput-object v9, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1$1;->p:Ljava/lang/Object;

    .line 844
    .line 845
    iput v13, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1$1;->q:I

    .line 846
    .line 847
    iput v12, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1$1;->r:I

    .line 848
    .line 849
    iput v10, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1$1;->s:I

    .line 850
    .line 851
    iput v6, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1$1;->t:I

    .line 852
    .line 853
    const/4 v3, 0x0

    .line 854
    iput v3, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1$1;->u:I

    .line 855
    .line 856
    const/4 v15, 0x1

    .line 857
    iput v15, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1$1;->v:I

    .line 858
    .line 859
    move-object/from16 v3, v23

    .line 860
    .line 861
    invoke-virtual {v3, v0, v1}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->f0(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 862
    .line 863
    .line 864
    move-result-object v0

    .line 865
    move-object/from16 v3, v22

    .line 866
    .line 867
    if-ne v0, v3, :cond_d

    .line 868
    .line 869
    return-object v3

    .line 870
    :cond_d
    move-object/from16 v16, v14

    .line 871
    .line 872
    move v14, v13

    .line 873
    move v13, v12

    .line 874
    move-object v12, v11

    .line 875
    move v11, v10

    .line 876
    move-object v10, v9

    .line 877
    move-object/from16 v9, p1

    .line 878
    .line 879
    :goto_9
    check-cast v0, Ljava/lang/Boolean;

    .line 880
    .line 881
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 882
    .line 883
    .line 884
    move-result v0

    .line 885
    if-eqz v0, :cond_e

    .line 886
    .line 887
    invoke-static {v10}, Lcom/blankj/utilcode/util/FileUtils;->delete(Ljava/io/File;)Z

    .line 888
    .line 889
    .line 890
    :cond_e
    move-object v0, v3

    .line 891
    move v10, v11

    .line 892
    move-object v11, v12

    .line 893
    move v12, v13

    .line 894
    move v13, v14

    .line 895
    move-object/from16 v14, v16

    .line 896
    .line 897
    move-object/from16 v15, v21

    .line 898
    .line 899
    move-object/from16 v3, v24

    .line 900
    .line 901
    goto/16 :goto_5

    .line 902
    .line 903
    :cond_f
    move-object/from16 v24, v3

    .line 904
    .line 905
    const/4 v15, 0x1

    .line 906
    move-object v3, v0

    .line 907
    move-object v6, v2

    .line 908
    move v2, v13

    .line 909
    :goto_a
    move-object/from16 v4, v17

    .line 910
    .line 911
    goto :goto_c

    .line 912
    :goto_b
    move/from16 v2, p1

    .line 913
    .line 914
    goto :goto_a

    .line 915
    :goto_c
    move-object v0, v3

    .line 916
    move-object/from16 v3, v24

    .line 917
    .line 918
    goto/16 :goto_0

    .line 919
    .line 920
    :cond_10
    sget-object v0, Lqc/q;->a:Lqc/q;

    .line 921
    .line 922
    return-object v0
.end method
