.class final Lcom/friday/user/viewmodel/UserViewModel$uploadLog$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/user/viewmodel/UserViewModel;->t()V
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
    c = "com.friday.user.viewmodel.UserViewModel$uploadLog$1"
    f = "UserViewModel.kt"
    l = {
        0xdc,
        0xec
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

.field public o:I

.field public p:I

.field public q:I

.field public r:I

.field public synthetic s:Ljava/lang/Object;

.field public final synthetic t:Lcom/friday/user/viewmodel/UserViewModel;


# direct methods
.method public constructor <init>(Lcom/friday/user/viewmodel/UserViewModel;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/user/viewmodel/UserViewModel$uploadLog$1;->t:Lcom/friday/user/viewmodel/UserViewModel;

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
    new-instance v0, Lcom/friday/user/viewmodel/UserViewModel$uploadLog$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/friday/user/viewmodel/UserViewModel$uploadLog$1;->t:Lcom/friday/user/viewmodel/UserViewModel;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Lcom/friday/user/viewmodel/UserViewModel$uploadLog$1;-><init>(Lcom/friday/user/viewmodel/UserViewModel;Lvc/c;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Lcom/friday/user/viewmodel/UserViewModel$uploadLog$1;->s:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/friday/user/viewmodel/UserViewModel$uploadLog$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/user/viewmodel/UserViewModel$uploadLog$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/user/viewmodel/UserViewModel$uploadLog$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/user/viewmodel/UserViewModel$uploadLog$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 39

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, Lcom/friday/user/viewmodel/UserViewModel$uploadLog$1;->s:Ljava/lang/Object;

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
    iget v0, v1, Lcom/friday/user/viewmodel/UserViewModel$uploadLog$1;->r:I

    .line 13
    .line 14
    const-string v4, "substring(...)"

    .line 15
    .line 16
    const-string v6, "getName(...)"

    .line 17
    .line 18
    const/4 v7, 0x2

    .line 19
    const-string v8, "/"

    .line 20
    .line 21
    const/4 v9, 0x1

    .line 22
    const/4 v11, 0x0

    .line 23
    if-eqz v0, :cond_2

    .line 24
    .line 25
    if-eq v0, v9, :cond_1

    .line 26
    .line 27
    if-ne v0, v7, :cond_0

    .line 28
    .line 29
    iget v12, v1, Lcom/friday/user/viewmodel/UserViewModel$uploadLog$1;->o:I

    .line 30
    .line 31
    iget-object v0, v1, Lcom/friday/user/viewmodel/UserViewModel$uploadLog$1;->l:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v0, Ljava/lang/String;

    .line 34
    .line 35
    iget-object v0, v1, Lcom/friday/user/viewmodel/UserViewModel$uploadLog$1;->k:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v0, Lsd/i0;

    .line 38
    .line 39
    iget-object v0, v1, Lcom/friday/user/viewmodel/UserViewModel$uploadLog$1;->j:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v0, Ljava/io/File;

    .line 42
    .line 43
    iget-object v0, v1, Lcom/friday/user/viewmodel/UserViewModel$uploadLog$1;->h:Ljava/lang/Object;

    .line 44
    .line 45
    move-object v13, v0

    .line 46
    check-cast v13, Ljava/util/Iterator;

    .line 47
    .line 48
    iget-object v0, v1, Lcom/friday/user/viewmodel/UserViewModel$uploadLog$1;->g:Ljava/lang/Object;

    .line 49
    .line 50
    move-object v14, v0

    .line 51
    check-cast v14, Lcom/friday/user/viewmodel/UserViewModel;

    .line 52
    .line 53
    iget-object v0, v1, Lcom/friday/user/viewmodel/UserViewModel$uploadLog$1;->f:Ljava/lang/Object;

    .line 54
    .line 55
    move-object v15, v0

    .line 56
    check-cast v15, Ljava/lang/Iterable;

    .line 57
    .line 58
    iget-object v0, v1, Lcom/friday/user/viewmodel/UserViewModel$uploadLog$1;->e:Ljava/lang/Object;

    .line 59
    .line 60
    move-object/from16 v16, v0

    .line 61
    .line 62
    check-cast v16, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 63
    .line 64
    iget-object v0, v1, Lcom/friday/user/viewmodel/UserViewModel$uploadLog$1;->d:Ljava/lang/Object;

    .line 65
    .line 66
    move-object/from16 v17, v0

    .line 67
    .line 68
    check-cast v17, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 69
    .line 70
    iget-object v0, v1, Lcom/friday/user/viewmodel/UserViewModel$uploadLog$1;->c:Ljava/lang/Object;

    .line 71
    .line 72
    move-object/from16 v18, v0

    .line 73
    .line 74
    check-cast v18, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 75
    .line 76
    :try_start_0
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 77
    .line 78
    .line 79
    move-object/from16 v0, p1

    .line 80
    .line 81
    move-object/from16 v19, v4

    .line 82
    .line 83
    move-object/from16 v22, v6

    .line 84
    .line 85
    move v5, v11

    .line 86
    move-object/from16 v24, v15

    .line 87
    .line 88
    const/4 v4, 0x0

    .line 89
    move v15, v7

    .line 90
    goto/16 :goto_8

    .line 91
    .line 92
    :catchall_0
    move-exception v0

    .line 93
    move-object/from16 v19, v4

    .line 94
    .line 95
    move-object/from16 v22, v6

    .line 96
    .line 97
    move v5, v11

    .line 98
    move-object/from16 v24, v15

    .line 99
    .line 100
    const/4 v4, 0x0

    .line 101
    move v15, v7

    .line 102
    goto/16 :goto_10

    .line 103
    .line 104
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 105
    .line 106
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 107
    .line 108
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    throw v0

    .line 112
    :cond_1
    iget v12, v1, Lcom/friday/user/viewmodel/UserViewModel$uploadLog$1;->p:I

    .line 113
    .line 114
    iget v13, v1, Lcom/friday/user/viewmodel/UserViewModel$uploadLog$1;->o:I

    .line 115
    .line 116
    iget-object v0, v1, Lcom/friday/user/viewmodel/UserViewModel$uploadLog$1;->n:Ljava/lang/Object;

    .line 117
    .line 118
    move-object v14, v0

    .line 119
    check-cast v14, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 120
    .line 121
    iget-object v0, v1, Lcom/friday/user/viewmodel/UserViewModel$uploadLog$1;->m:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v0, Ljava/lang/String;

    .line 124
    .line 125
    iget-object v0, v1, Lcom/friday/user/viewmodel/UserViewModel$uploadLog$1;->l:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast v0, Lcom/friday/common/entity/OssReqData;

    .line 128
    .line 129
    iget-object v0, v1, Lcom/friday/user/viewmodel/UserViewModel$uploadLog$1;->k:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast v0, Ljava/lang/String;

    .line 132
    .line 133
    iget-object v0, v1, Lcom/friday/user/viewmodel/UserViewModel$uploadLog$1;->j:Ljava/lang/Object;

    .line 134
    .line 135
    move-object v15, v0

    .line 136
    check-cast v15, Ljava/io/File;

    .line 137
    .line 138
    iget-object v7, v1, Lcom/friday/user/viewmodel/UserViewModel$uploadLog$1;->i:Ljava/lang/Object;

    .line 139
    .line 140
    iget-object v0, v1, Lcom/friday/user/viewmodel/UserViewModel$uploadLog$1;->h:Ljava/lang/Object;

    .line 141
    .line 142
    move-object/from16 v17, v0

    .line 143
    .line 144
    check-cast v17, Ljava/util/Iterator;

    .line 145
    .line 146
    iget-object v0, v1, Lcom/friday/user/viewmodel/UserViewModel$uploadLog$1;->g:Ljava/lang/Object;

    .line 147
    .line 148
    move-object/from16 v18, v0

    .line 149
    .line 150
    check-cast v18, Lcom/friday/user/viewmodel/UserViewModel;

    .line 151
    .line 152
    iget-object v0, v1, Lcom/friday/user/viewmodel/UserViewModel$uploadLog$1;->f:Ljava/lang/Object;

    .line 153
    .line 154
    move-object/from16 v19, v0

    .line 155
    .line 156
    check-cast v19, Ljava/lang/Iterable;

    .line 157
    .line 158
    iget-object v0, v1, Lcom/friday/user/viewmodel/UserViewModel$uploadLog$1;->e:Ljava/lang/Object;

    .line 159
    .line 160
    move-object/from16 v20, v0

    .line 161
    .line 162
    check-cast v20, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 163
    .line 164
    iget-object v0, v1, Lcom/friday/user/viewmodel/UserViewModel$uploadLog$1;->d:Ljava/lang/Object;

    .line 165
    .line 166
    move-object/from16 v21, v0

    .line 167
    .line 168
    check-cast v21, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 169
    .line 170
    iget-object v0, v1, Lcom/friday/user/viewmodel/UserViewModel$uploadLog$1;->c:Ljava/lang/Object;

    .line 171
    .line 172
    move-object/from16 v22, v0

    .line 173
    .line 174
    check-cast v22, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 175
    .line 176
    :try_start_1
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 177
    .line 178
    .line 179
    move-object/from16 v0, p1

    .line 180
    .line 181
    move-object/from16 v5, v17

    .line 182
    .line 183
    move-object/from16 v10, v21

    .line 184
    .line 185
    move-object/from16 v9, v22

    .line 186
    .line 187
    move-object/from16 v22, v6

    .line 188
    .line 189
    move-object/from16 v6, v20

    .line 190
    .line 191
    goto/16 :goto_1

    .line 192
    .line 193
    :catchall_1
    move-exception v0

    .line 194
    move-object/from16 v5, v17

    .line 195
    .line 196
    move-object/from16 v10, v21

    .line 197
    .line 198
    move-object/from16 v9, v22

    .line 199
    .line 200
    move-object/from16 v22, v6

    .line 201
    .line 202
    move-object/from16 v6, v20

    .line 203
    .line 204
    goto/16 :goto_3

    .line 205
    .line 206
    :cond_2
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 207
    .line 208
    .line 209
    iget-object v0, v1, Lcom/friday/user/viewmodel/UserViewModel$uploadLog$1;->t:Lcom/friday/user/viewmodel/UserViewModel;

    .line 210
    .line 211
    invoke-virtual {v0, v11}, Lcom/friday/user/viewmodel/UserViewModel;->s(Z)V

    .line 212
    .line 213
    .line 214
    new-instance v0, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 215
    .line 216
    invoke-direct {v0}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 217
    .line 218
    .line 219
    new-instance v7, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 220
    .line 221
    invoke-direct {v7}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 222
    .line 223
    .line 224
    new-instance v12, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 225
    .line 226
    invoke-direct {v12}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 227
    .line 228
    .line 229
    invoke-static {}, Lcom/blankj/utilcode/util/LogUtils;->getLogFiles()Ljava/util/List;

    .line 230
    .line 231
    .line 232
    move-result-object v13

    .line 233
    const-string v14, "getLogFiles(...)"

    .line 234
    .line 235
    invoke-static {v13, v14}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 236
    .line 237
    .line 238
    check-cast v13, Ljava/lang/Iterable;

    .line 239
    .line 240
    iget-object v14, v1, Lcom/friday/user/viewmodel/UserViewModel$uploadLog$1;->t:Lcom/friday/user/viewmodel/UserViewModel;

    .line 241
    .line 242
    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 243
    .line 244
    .line 245
    move-result-object v15

    .line 246
    move-object v10, v7

    .line 247
    move-object/from16 v19, v13

    .line 248
    .line 249
    move-object v7, v14

    .line 250
    move-object v14, v0

    .line 251
    move v13, v11

    .line 252
    :goto_0
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    .line 253
    .line 254
    .line 255
    move-result v0

    .line 256
    if-eqz v0, :cond_b

    .line 257
    .line 258
    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v18

    .line 262
    move-object/from16 v9, v18

    .line 263
    .line 264
    check-cast v9, Ljava/io/File;

    .line 265
    .line 266
    iget-object v0, v14, Lkotlin/jvm/internal/Ref$ObjectRef;->c:Ljava/lang/Object;

    .line 267
    .line 268
    if-nez v0, :cond_7

    .line 269
    .line 270
    invoke-static {v9}, Lcom/blankj/utilcode/util/FileUtils;->getFileExtension(Ljava/io/File;)Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    move-result-object v0

    .line 274
    invoke-virtual {v9}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object v5

    .line 278
    invoke-static {v5, v6}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 279
    .line 280
    .line 281
    invoke-static {v5}, Lk2/p;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object v5

    .line 285
    move-object/from16 v22, v6

    .line 286
    .line 287
    const/16 v6, 0xa

    .line 288
    .line 289
    invoke-virtual {v5, v11, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object v5

    .line 293
    invoke-static {v5, v4}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 294
    .line 295
    .line 296
    const/16 v27, 0x4

    .line 297
    .line 298
    const/16 v28, 0x0

    .line 299
    .line 300
    const-string v24, "_"

    .line 301
    .line 302
    const-string v25, ""

    .line 303
    .line 304
    const/16 v26, 0x0

    .line 305
    .line 306
    move-object/from16 v23, v5

    .line 307
    .line 308
    invoke-static/range {v23 .. v28}, Lqd/z;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    .line 309
    .line 310
    .line 311
    move-result-object v33

    .line 312
    sget-object v29, Lcom/friday/common/helper/OssUploadHelper;->b:Lcom/friday/common/helper/OssUploadHelper$a;

    .line 313
    .line 314
    sget-object v30, Lcom/friday/common/entity/OssFileType$Folder;->INSTANCE:Lcom/friday/common/entity/OssFileType$Folder;

    .line 315
    .line 316
    new-instance v5, Ljava/lang/StringBuilder;

    .line 317
    .line 318
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 319
    .line 320
    .line 321
    const-string v6, "."

    .line 322
    .line 323
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 324
    .line 325
    .line 326
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 327
    .line 328
    .line 329
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 330
    .line 331
    .line 332
    move-result-object v31

    .line 333
    sget-object v32, Lcom/friday/common/entity/OssFileResource$Log;->INSTANCE:Lcom/friday/common/entity/OssFileResource$Log;

    .line 334
    .line 335
    const/16 v37, 0x30

    .line 336
    .line 337
    const/16 v38, 0x0

    .line 338
    .line 339
    const/16 v34, 0x0

    .line 340
    .line 341
    const-wide/16 v35, 0x0

    .line 342
    .line 343
    invoke-static/range {v29 .. v38}, Lcom/friday/common/helper/OssUploadHelper$a;->b(Lcom/friday/common/helper/OssUploadHelper$a;Lcom/friday/common/entity/OssFileType;Ljava/lang/String;Lcom/friday/common/entity/OssFileResource;Ljava/lang/String;Ljava/lang/String;JILjava/lang/Object;)Lcom/friday/common/entity/OssReqData;

    .line 344
    .line 345
    .line 346
    move-result-object v5

    .line 347
    move-object/from16 v6, v33

    .line 348
    .line 349
    invoke-virtual {v5}, Lcom/friday/common/entity/OssReqData;->getObjectKey()Ljava/lang/String;

    .line 350
    .line 351
    .line 352
    move-result-object v11

    .line 353
    move-object/from16 p1, v0

    .line 354
    .line 355
    new-instance v0, Ljava/lang/StringBuilder;

    .line 356
    .line 357
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 358
    .line 359
    .line 360
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 361
    .line 362
    .line 363
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 364
    .line 365
    .line 366
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 367
    .line 368
    .line 369
    move-result-object v0

    .line 370
    invoke-static {v11, v0}, Lqd/c0;->z0(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 371
    .line 372
    .line 373
    move-result-object v0

    .line 374
    iput-object v0, v10, Lkotlin/jvm/internal/Ref$ObjectRef;->c:Ljava/lang/Object;

    .line 375
    .line 376
    :try_start_2
    sget-object v0, Lkotlin/Result;->d:Lkotlin/Result$a;

    .line 377
    .line 378
    invoke-static {v7}, Lcom/friday/user/viewmodel/UserViewModel;->f(Lcom/friday/user/viewmodel/UserViewModel;)Ld2/i;

    .line 379
    .line 380
    .line 381
    move-result-object v0

    .line 382
    invoke-virtual {v5}, Lcom/friday/common/entity/OssReqData;->getTokenReq()Lcom/friday/common/entity/OssTokenReq;

    .line 383
    .line 384
    .line 385
    move-result-object v11

    .line 386
    iput-object v2, v1, Lcom/friday/user/viewmodel/UserViewModel$uploadLog$1;->s:Ljava/lang/Object;

    .line 387
    .line 388
    iput-object v14, v1, Lcom/friday/user/viewmodel/UserViewModel$uploadLog$1;->c:Ljava/lang/Object;

    .line 389
    .line 390
    iput-object v10, v1, Lcom/friday/user/viewmodel/UserViewModel$uploadLog$1;->d:Ljava/lang/Object;

    .line 391
    .line 392
    iput-object v12, v1, Lcom/friday/user/viewmodel/UserViewModel$uploadLog$1;->e:Ljava/lang/Object;

    .line 393
    .line 394
    move-object/from16 v24, v5

    .line 395
    .line 396
    invoke-static/range {v19 .. v19}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 397
    .line 398
    .line 399
    move-result-object v5

    .line 400
    iput-object v5, v1, Lcom/friday/user/viewmodel/UserViewModel$uploadLog$1;->f:Ljava/lang/Object;

    .line 401
    .line 402
    iput-object v7, v1, Lcom/friday/user/viewmodel/UserViewModel$uploadLog$1;->g:Ljava/lang/Object;

    .line 403
    .line 404
    iput-object v15, v1, Lcom/friday/user/viewmodel/UserViewModel$uploadLog$1;->h:Ljava/lang/Object;

    .line 405
    .line 406
    invoke-static/range {v18 .. v18}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 407
    .line 408
    .line 409
    move-result-object v5

    .line 410
    iput-object v5, v1, Lcom/friday/user/viewmodel/UserViewModel$uploadLog$1;->i:Ljava/lang/Object;

    .line 411
    .line 412
    iput-object v9, v1, Lcom/friday/user/viewmodel/UserViewModel$uploadLog$1;->j:Ljava/lang/Object;

    .line 413
    .line 414
    invoke-static/range {p1 .. p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 415
    .line 416
    .line 417
    move-result-object v5

    .line 418
    iput-object v5, v1, Lcom/friday/user/viewmodel/UserViewModel$uploadLog$1;->k:Ljava/lang/Object;

    .line 419
    .line 420
    invoke-static/range {v24 .. v24}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 421
    .line 422
    .line 423
    move-result-object v5

    .line 424
    iput-object v5, v1, Lcom/friday/user/viewmodel/UserViewModel$uploadLog$1;->l:Ljava/lang/Object;

    .line 425
    .line 426
    invoke-static {v6}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 427
    .line 428
    .line 429
    move-result-object v5

    .line 430
    iput-object v5, v1, Lcom/friday/user/viewmodel/UserViewModel$uploadLog$1;->m:Ljava/lang/Object;

    .line 431
    .line 432
    iput-object v14, v1, Lcom/friday/user/viewmodel/UserViewModel$uploadLog$1;->n:Ljava/lang/Object;

    .line 433
    .line 434
    iput v13, v1, Lcom/friday/user/viewmodel/UserViewModel$uploadLog$1;->o:I

    .line 435
    .line 436
    const/4 v5, 0x0

    .line 437
    iput v5, v1, Lcom/friday/user/viewmodel/UserViewModel$uploadLog$1;->p:I

    .line 438
    .line 439
    iput v5, v1, Lcom/friday/user/viewmodel/UserViewModel$uploadLog$1;->q:I

    .line 440
    .line 441
    const/4 v5, 0x1

    .line 442
    iput v5, v1, Lcom/friday/user/viewmodel/UserViewModel$uploadLog$1;->r:I

    .line 443
    .line 444
    invoke-interface {v0, v11, v1}, Ld2/i;->a(Lcom/friday/common/entity/OssTokenReq;Lvc/c;)Ljava/lang/Object;

    .line 445
    .line 446
    .line 447
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 448
    if-ne v0, v3, :cond_3

    .line 449
    .line 450
    goto/16 :goto_7

    .line 451
    .line 452
    :cond_3
    move-object/from16 v5, v18

    .line 453
    .line 454
    move-object/from16 v18, v7

    .line 455
    .line 456
    move-object v7, v5

    .line 457
    move-object v6, v12

    .line 458
    move-object v5, v15

    .line 459
    const/4 v12, 0x0

    .line 460
    move-object v15, v9

    .line 461
    move-object v9, v14

    .line 462
    :goto_1
    :try_start_3
    check-cast v0, Lcom/friday/common/entity/OssTokenResult;

    .line 463
    .line 464
    invoke-virtual {v0}, Lcom/friday/common/entity/OssTokenResult;->getSuccess()Z

    .line 465
    .line 466
    .line 467
    move-result v11

    .line 468
    if-eqz v11, :cond_4

    .line 469
    .line 470
    invoke-virtual {v0}, Lcom/friday/common/entity/OssTokenResult;->getResult()Lcom/friday/common/entity/OssTokenResponse;

    .line 471
    .line 472
    .line 473
    move-result-object v0

    .line 474
    goto :goto_2

    .line 475
    :catchall_2
    move-exception v0

    .line 476
    goto :goto_3

    .line 477
    :cond_4
    const/4 v0, 0x0

    .line 478
    :goto_2
    invoke-static {v0}, Lkotlin/Result;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 479
    .line 480
    .line 481
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 482
    goto :goto_4

    .line 483
    :catchall_3
    move-exception v0

    .line 484
    move-object/from16 v5, v18

    .line 485
    .line 486
    move-object/from16 v18, v7

    .line 487
    .line 488
    move-object v7, v5

    .line 489
    move-object v6, v12

    .line 490
    move-object v5, v15

    .line 491
    const/4 v12, 0x0

    .line 492
    move-object v15, v9

    .line 493
    move-object v9, v14

    .line 494
    :goto_3
    sget-object v11, Lkotlin/Result;->d:Lkotlin/Result$a;

    .line 495
    .line 496
    invoke-static {v0}, Lkotlin/b;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 497
    .line 498
    .line 499
    move-result-object v0

    .line 500
    invoke-static {v0}, Lkotlin/Result;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 501
    .line 502
    .line 503
    move-result-object v0

    .line 504
    :goto_4
    invoke-static {v0}, Lkotlin/Result;->g(Ljava/lang/Object;)Z

    .line 505
    .line 506
    .line 507
    move-result v11

    .line 508
    if-eqz v11, :cond_5

    .line 509
    .line 510
    const/4 v0, 0x0

    .line 511
    :cond_5
    iput-object v0, v14, Lkotlin/jvm/internal/Ref$ObjectRef;->c:Ljava/lang/Object;

    .line 512
    .line 513
    iget-object v0, v9, Lkotlin/jvm/internal/Ref$ObjectRef;->c:Ljava/lang/Object;

    .line 514
    .line 515
    if-nez v0, :cond_6

    .line 516
    .line 517
    const-string v0, "ossToken\u83b7\u53d6\u5931\u8d25"

    .line 518
    .line 519
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 520
    .line 521
    .line 522
    move-result-object v0

    .line 523
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    .line 524
    .line 525
    .line 526
    sget-object v0, Lqc/q;->a:Lqc/q;

    .line 527
    .line 528
    return-object v0

    .line 529
    :cond_6
    move v14, v13

    .line 530
    move-object v13, v5

    .line 531
    move v5, v12

    .line 532
    move v12, v14

    .line 533
    move-object/from16 v14, v18

    .line 534
    .line 535
    move-object/from16 v18, v7

    .line 536
    .line 537
    move-object v7, v9

    .line 538
    move-object v9, v15

    .line 539
    :goto_5
    move-object/from16 v15, v19

    .line 540
    .line 541
    goto :goto_6

    .line 542
    :cond_7
    move-object/from16 v22, v6

    .line 543
    .line 544
    move-object v5, v14

    .line 545
    move-object v14, v7

    .line 546
    move-object v7, v5

    .line 547
    move-object v6, v12

    .line 548
    move v12, v13

    .line 549
    move-object v13, v15

    .line 550
    const/4 v5, 0x0

    .line 551
    goto :goto_5

    .line 552
    :goto_6
    iget-object v0, v6, Lkotlin/jvm/internal/Ref$ObjectRef;->c:Ljava/lang/Object;

    .line 553
    .line 554
    if-nez v0, :cond_8

    .line 555
    .line 556
    new-instance v0, Lcom/friday/common/helper/OssUploadHelper;

    .line 557
    .line 558
    iget-object v11, v7, Lkotlin/jvm/internal/Ref$ObjectRef;->c:Ljava/lang/Object;

    .line 559
    .line 560
    invoke-static {v11}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 561
    .line 562
    .line 563
    check-cast v11, Lcom/friday/common/entity/OssTokenResponse;

    .line 564
    .line 565
    invoke-direct {v0, v11}, Lcom/friday/common/helper/OssUploadHelper;-><init>(Lcom/friday/common/entity/OssTokenResponse;)V

    .line 566
    .line 567
    .line 568
    iput-object v0, v6, Lkotlin/jvm/internal/Ref$ObjectRef;->c:Ljava/lang/Object;

    .line 569
    .line 570
    :cond_8
    :try_start_4
    sget-object v0, Lkotlin/Result;->d:Lkotlin/Result$a;

    .line 571
    .line 572
    invoke-virtual {v9}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 573
    .line 574
    .line 575
    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_b

    .line 576
    move-object/from16 v11, v22

    .line 577
    .line 578
    :try_start_5
    invoke-static {v0, v11}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 579
    .line 580
    .line 581
    invoke-static {v0}, Lk2/p;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 582
    .line 583
    .line 584
    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_d

    .line 585
    move-object/from16 p1, v9

    .line 586
    .line 587
    move-object/from16 v22, v11

    .line 588
    .line 589
    const/16 v9, 0xa

    .line 590
    .line 591
    const/4 v11, 0x0

    .line 592
    :try_start_6
    invoke-virtual {v0, v11, v9}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 593
    .line 594
    .line 595
    move-result-object v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_c

    .line 596
    :try_start_7
    invoke-static {v0, v4}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 597
    .line 598
    .line 599
    const-string v25, "_"

    .line 600
    .line 601
    const-string v26, ""

    .line 602
    .line 603
    const/16 v28, 0x4

    .line 604
    .line 605
    const/16 v29, 0x0

    .line 606
    .line 607
    const/16 v27, 0x0

    .line 608
    .line 609
    move-object/from16 v24, v0

    .line 610
    .line 611
    invoke-static/range {v24 .. v29}, Lqd/z;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    .line 612
    .line 613
    .line 614
    move-result-object v0

    .line 615
    iget-object v11, v6, Lkotlin/jvm/internal/Ref$ObjectRef;->c:Ljava/lang/Object;

    .line 616
    .line 617
    check-cast v11, Lcom/friday/common/helper/OssUploadHelper;

    .line 618
    .line 619
    if-eqz v11, :cond_a

    .line 620
    .line 621
    invoke-virtual/range {p1 .. p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 622
    .line 623
    .line 624
    move-result-object v9
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_b

    .line 625
    move-object/from16 v19, v4

    .line 626
    .line 627
    :try_start_8
    const-string v4, "getAbsolutePath(...)"

    .line 628
    .line 629
    invoke-static {v9, v4}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 630
    .line 631
    .line 632
    iget-object v4, v10, Lkotlin/jvm/internal/Ref$ObjectRef;->c:Ljava/lang/Object;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_a

    .line 633
    .line 634
    move-object/from16 v24, v15

    .line 635
    .line 636
    :try_start_9
    invoke-virtual/range {p1 .. p1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 637
    .line 638
    .line 639
    move-result-object v15
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_9

    .line 640
    move-object/from16 v25, v3

    .line 641
    .line 642
    :try_start_a
    new-instance v3, Ljava/lang/StringBuilder;

    .line 643
    .line 644
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 645
    .line 646
    .line 647
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 648
    .line 649
    .line 650
    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 651
    .line 652
    .line 653
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 654
    .line 655
    .line 656
    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 657
    .line 658
    .line 659
    invoke-virtual {v3, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 660
    .line 661
    .line 662
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 663
    .line 664
    .line 665
    move-result-object v3

    .line 666
    iput-object v2, v1, Lcom/friday/user/viewmodel/UserViewModel$uploadLog$1;->s:Ljava/lang/Object;

    .line 667
    .line 668
    iput-object v7, v1, Lcom/friday/user/viewmodel/UserViewModel$uploadLog$1;->c:Ljava/lang/Object;

    .line 669
    .line 670
    iput-object v10, v1, Lcom/friday/user/viewmodel/UserViewModel$uploadLog$1;->d:Ljava/lang/Object;

    .line 671
    .line 672
    iput-object v6, v1, Lcom/friday/user/viewmodel/UserViewModel$uploadLog$1;->e:Ljava/lang/Object;

    .line 673
    .line 674
    invoke-static/range {v24 .. v24}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 675
    .line 676
    .line 677
    move-result-object v4

    .line 678
    iput-object v4, v1, Lcom/friday/user/viewmodel/UserViewModel$uploadLog$1;->f:Ljava/lang/Object;

    .line 679
    .line 680
    iput-object v14, v1, Lcom/friday/user/viewmodel/UserViewModel$uploadLog$1;->g:Ljava/lang/Object;

    .line 681
    .line 682
    iput-object v13, v1, Lcom/friday/user/viewmodel/UserViewModel$uploadLog$1;->h:Ljava/lang/Object;

    .line 683
    .line 684
    invoke-static/range {v18 .. v18}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 685
    .line 686
    .line 687
    move-result-object v4

    .line 688
    iput-object v4, v1, Lcom/friday/user/viewmodel/UserViewModel$uploadLog$1;->i:Ljava/lang/Object;

    .line 689
    .line 690
    invoke-static/range {p1 .. p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 691
    .line 692
    .line 693
    move-result-object v4

    .line 694
    iput-object v4, v1, Lcom/friday/user/viewmodel/UserViewModel$uploadLog$1;->j:Ljava/lang/Object;

    .line 695
    .line 696
    invoke-static {v2}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 697
    .line 698
    .line 699
    move-result-object v4

    .line 700
    iput-object v4, v1, Lcom/friday/user/viewmodel/UserViewModel$uploadLog$1;->k:Ljava/lang/Object;

    .line 701
    .line 702
    invoke-static {v0}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 703
    .line 704
    .line 705
    move-result-object v0

    .line 706
    iput-object v0, v1, Lcom/friday/user/viewmodel/UserViewModel$uploadLog$1;->l:Ljava/lang/Object;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_8

    .line 707
    .line 708
    const/4 v4, 0x0

    .line 709
    :try_start_b
    iput-object v4, v1, Lcom/friday/user/viewmodel/UserViewModel$uploadLog$1;->m:Ljava/lang/Object;

    .line 710
    .line 711
    iput-object v4, v1, Lcom/friday/user/viewmodel/UserViewModel$uploadLog$1;->n:Ljava/lang/Object;

    .line 712
    .line 713
    iput v12, v1, Lcom/friday/user/viewmodel/UserViewModel$uploadLog$1;->o:I

    .line 714
    .line 715
    iput v5, v1, Lcom/friday/user/viewmodel/UserViewModel$uploadLog$1;->p:I
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_7

    .line 716
    .line 717
    const/4 v5, 0x0

    .line 718
    :try_start_c
    iput v5, v1, Lcom/friday/user/viewmodel/UserViewModel$uploadLog$1;->q:I
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_6

    .line 719
    .line 720
    const/4 v15, 0x2

    .line 721
    :try_start_d
    iput v15, v1, Lcom/friday/user/viewmodel/UserViewModel$uploadLog$1;->r:I

    .line 722
    .line 723
    invoke-virtual {v11, v9, v3, v1}, Lcom/friday/common/helper/OssUploadHelper;->e(Ljava/lang/String;Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 724
    .line 725
    .line 726
    move-result-object v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_5

    .line 727
    move-object/from16 v3, v25

    .line 728
    .line 729
    if-ne v0, v3, :cond_9

    .line 730
    .line 731
    :goto_7
    return-object v3

    .line 732
    :cond_9
    move-object/from16 v16, v6

    .line 733
    .line 734
    move-object/from16 v18, v7

    .line 735
    .line 736
    move-object/from16 v17, v10

    .line 737
    .line 738
    :goto_8
    :try_start_e
    check-cast v0, Ljava/lang/String;

    .line 739
    .line 740
    goto :goto_e

    .line 741
    :catchall_4
    move-exception v0

    .line 742
    goto/16 :goto_10

    .line 743
    .line 744
    :catchall_5
    move-exception v0

    .line 745
    move-object/from16 v3, v25

    .line 746
    .line 747
    :goto_9
    move-object/from16 v16, v6

    .line 748
    .line 749
    move-object/from16 v18, v7

    .line 750
    .line 751
    move-object/from16 v17, v10

    .line 752
    .line 753
    goto :goto_10

    .line 754
    :catchall_6
    move-exception v0

    .line 755
    move-object/from16 v3, v25

    .line 756
    .line 757
    :goto_a
    const/4 v15, 0x2

    .line 758
    goto :goto_9

    .line 759
    :catchall_7
    move-exception v0

    .line 760
    move-object/from16 v3, v25

    .line 761
    .line 762
    :goto_b
    const/4 v5, 0x0

    .line 763
    goto :goto_a

    .line 764
    :catchall_8
    move-exception v0

    .line 765
    move-object/from16 v3, v25

    .line 766
    .line 767
    :goto_c
    const/4 v4, 0x0

    .line 768
    goto :goto_b

    .line 769
    :catchall_9
    move-exception v0

    .line 770
    goto :goto_c

    .line 771
    :catchall_a
    move-exception v0

    .line 772
    :goto_d
    move-object/from16 v24, v15

    .line 773
    .line 774
    goto :goto_c

    .line 775
    :catchall_b
    move-exception v0

    .line 776
    move-object/from16 v19, v4

    .line 777
    .line 778
    goto :goto_d

    .line 779
    :cond_a
    move-object/from16 v19, v4

    .line 780
    .line 781
    move-object/from16 v24, v15

    .line 782
    .line 783
    const/4 v4, 0x0

    .line 784
    const/4 v5, 0x0

    .line 785
    const/4 v15, 0x2

    .line 786
    move-object v0, v4

    .line 787
    move-object/from16 v16, v6

    .line 788
    .line 789
    move-object/from16 v18, v7

    .line 790
    .line 791
    move-object/from16 v17, v10

    .line 792
    .line 793
    :goto_e
    invoke-static {v0}, Lkotlin/Result;->c(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_4

    .line 794
    .line 795
    .line 796
    :goto_f
    move-object v0, v13

    .line 797
    move-object v7, v14

    .line 798
    move-object/from16 v10, v17

    .line 799
    .line 800
    move-object/from16 v14, v18

    .line 801
    .line 802
    move v13, v12

    .line 803
    move-object/from16 v12, v16

    .line 804
    .line 805
    goto :goto_11

    .line 806
    :catchall_c
    move-exception v0

    .line 807
    move-object/from16 v19, v4

    .line 808
    .line 809
    move v5, v11

    .line 810
    move-object/from16 v24, v15

    .line 811
    .line 812
    const/4 v4, 0x0

    .line 813
    goto :goto_a

    .line 814
    :catchall_d
    move-exception v0

    .line 815
    move-object/from16 v19, v4

    .line 816
    .line 817
    move-object/from16 v22, v11

    .line 818
    .line 819
    goto :goto_d

    .line 820
    :goto_10
    sget-object v6, Lkotlin/Result;->d:Lkotlin/Result$a;

    .line 821
    .line 822
    invoke-static {v0}, Lkotlin/b;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 823
    .line 824
    .line 825
    move-result-object v0

    .line 826
    invoke-static {v0}, Lkotlin/Result;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 827
    .line 828
    .line 829
    goto :goto_f

    .line 830
    :goto_11
    move-object v15, v0

    .line 831
    move v11, v5

    .line 832
    move-object/from16 v4, v19

    .line 833
    .line 834
    move-object/from16 v6, v22

    .line 835
    .line 836
    move-object/from16 v19, v24

    .line 837
    .line 838
    const/4 v9, 0x1

    .line 839
    goto/16 :goto_0

    .line 840
    .line 841
    :cond_b
    iget-object v0, v1, Lcom/friday/user/viewmodel/UserViewModel$uploadLog$1;->t:Lcom/friday/user/viewmodel/UserViewModel;

    .line 842
    .line 843
    const/4 v5, 0x1

    .line 844
    invoke-virtual {v0, v5}, Lcom/friday/user/viewmodel/UserViewModel;->s(Z)V

    .line 845
    .line 846
    .line 847
    sget-object v0, Lqc/q;->a:Lqc/q;

    .line 848
    .line 849
    return-object v0
.end method
