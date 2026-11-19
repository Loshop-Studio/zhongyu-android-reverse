.class final Lcom/friday/cloudsnote/viewModel/MainViewModel$uploadLog$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/cloudsnote/viewModel/MainViewModel;->i()V
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
    c = "com.friday.cloudsnote.viewModel.MainViewModel$uploadLog$1"
    f = "MainViewModel.kt"
    l = {
        0x4d,
        0x56
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

.field public k:I

.field public l:I

.field public synthetic m:Ljava/lang/Object;

.field public final synthetic n:Lcom/friday/cloudsnote/viewModel/MainViewModel;


# direct methods
.method public constructor <init>(Lcom/friday/cloudsnote/viewModel/MainViewModel;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/cloudsnote/viewModel/MainViewModel$uploadLog$1;->n:Lcom/friday/cloudsnote/viewModel/MainViewModel;

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
    new-instance v0, Lcom/friday/cloudsnote/viewModel/MainViewModel$uploadLog$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/friday/cloudsnote/viewModel/MainViewModel$uploadLog$1;->n:Lcom/friday/cloudsnote/viewModel/MainViewModel;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Lcom/friday/cloudsnote/viewModel/MainViewModel$uploadLog$1;-><init>(Lcom/friday/cloudsnote/viewModel/MainViewModel;Lvc/c;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Lcom/friday/cloudsnote/viewModel/MainViewModel$uploadLog$1;->m:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/friday/cloudsnote/viewModel/MainViewModel$uploadLog$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/cloudsnote/viewModel/MainViewModel$uploadLog$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/cloudsnote/viewModel/MainViewModel$uploadLog$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/cloudsnote/viewModel/MainViewModel$uploadLog$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 29

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, Lcom/friday/cloudsnote/viewModel/MainViewModel$uploadLog$1;->m:Ljava/lang/Object;

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
    iget v0, v1, Lcom/friday/cloudsnote/viewModel/MainViewModel$uploadLog$1;->l:I

    .line 13
    .line 14
    const/4 v4, 0x1

    .line 15
    const/4 v5, 0x2

    .line 16
    const/4 v6, 0x0

    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    if-eq v0, v4, :cond_1

    .line 20
    .line 21
    if-ne v0, v5, :cond_0

    .line 22
    .line 23
    iget-object v0, v1, Lcom/friday/cloudsnote/viewModel/MainViewModel$uploadLog$1;->j:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, Lcom/friday/common/entity/OssTokenResponse;

    .line 26
    .line 27
    iget-object v0, v1, Lcom/friday/cloudsnote/viewModel/MainViewModel$uploadLog$1;->i:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v0, Ljava/lang/String;

    .line 30
    .line 31
    iget-object v0, v1, Lcom/friday/cloudsnote/viewModel/MainViewModel$uploadLog$1;->h:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v0, Lcom/friday/common/entity/OssReqData;

    .line 34
    .line 35
    iget-object v0, v1, Lcom/friday/cloudsnote/viewModel/MainViewModel$uploadLog$1;->g:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v0, Ljava/lang/String;

    .line 38
    .line 39
    iget-object v0, v1, Lcom/friday/cloudsnote/viewModel/MainViewModel$uploadLog$1;->f:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v0, Ljava/lang/String;

    .line 42
    .line 43
    iget-object v0, v1, Lcom/friday/cloudsnote/viewModel/MainViewModel$uploadLog$1;->e:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v0, Ljava/io/File;

    .line 46
    .line 47
    iget-object v2, v1, Lcom/friday/cloudsnote/viewModel/MainViewModel$uploadLog$1;->d:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v2, Ljava/util/List;

    .line 50
    .line 51
    iget-object v2, v1, Lcom/friday/cloudsnote/viewModel/MainViewModel$uploadLog$1;->c:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v2, Ljava/lang/String;

    .line 54
    .line 55
    :try_start_0
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 56
    .line 57
    .line 58
    goto/16 :goto_7

    .line 59
    .line 60
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 61
    .line 62
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 63
    .line 64
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    throw v0

    .line 68
    :cond_1
    iget-object v0, v1, Lcom/friday/cloudsnote/viewModel/MainViewModel$uploadLog$1;->i:Ljava/lang/Object;

    .line 69
    .line 70
    move-object v4, v0

    .line 71
    check-cast v4, Ljava/lang/String;

    .line 72
    .line 73
    iget-object v0, v1, Lcom/friday/cloudsnote/viewModel/MainViewModel$uploadLog$1;->h:Ljava/lang/Object;

    .line 74
    .line 75
    move-object v7, v0

    .line 76
    check-cast v7, Lcom/friday/common/entity/OssReqData;

    .line 77
    .line 78
    iget-object v0, v1, Lcom/friday/cloudsnote/viewModel/MainViewModel$uploadLog$1;->g:Ljava/lang/Object;

    .line 79
    .line 80
    move-object v8, v0

    .line 81
    check-cast v8, Ljava/lang/String;

    .line 82
    .line 83
    iget-object v0, v1, Lcom/friday/cloudsnote/viewModel/MainViewModel$uploadLog$1;->f:Ljava/lang/Object;

    .line 84
    .line 85
    move-object v9, v0

    .line 86
    check-cast v9, Ljava/lang/String;

    .line 87
    .line 88
    iget-object v0, v1, Lcom/friday/cloudsnote/viewModel/MainViewModel$uploadLog$1;->e:Ljava/lang/Object;

    .line 89
    .line 90
    move-object v10, v0

    .line 91
    check-cast v10, Ljava/io/File;

    .line 92
    .line 93
    iget-object v0, v1, Lcom/friday/cloudsnote/viewModel/MainViewModel$uploadLog$1;->d:Ljava/lang/Object;

    .line 94
    .line 95
    move-object v11, v0

    .line 96
    check-cast v11, Ljava/util/List;

    .line 97
    .line 98
    iget-object v0, v1, Lcom/friday/cloudsnote/viewModel/MainViewModel$uploadLog$1;->c:Ljava/lang/Object;

    .line 99
    .line 100
    move-object v12, v0

    .line 101
    check-cast v12, Ljava/lang/String;

    .line 102
    .line 103
    :try_start_1
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 104
    .line 105
    .line 106
    move-object/from16 v0, p1

    .line 107
    .line 108
    goto/16 :goto_1

    .line 109
    .line 110
    :catchall_0
    move-exception v0

    .line 111
    goto/16 :goto_3

    .line 112
    .line 113
    :cond_2
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    const-string v0, "yyyy_MM_dd"

    .line 117
    .line 118
    invoke-static {v0}, Lcom/blankj/utilcode/util/TimeUtils;->getSafeDateFormat(Ljava/lang/String;)Ljava/text/SimpleDateFormat;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    invoke-static {v0}, Lcom/blankj/utilcode/util/TimeUtils;->getNowString(Ljava/text/DateFormat;)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v12

    .line 126
    invoke-static {}, Lcom/blankj/utilcode/util/LogUtils;->getLogFiles()Ljava/util/List;

    .line 127
    .line 128
    .line 129
    move-result-object v11

    .line 130
    invoke-static {v11}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    move-object v0, v11

    .line 134
    check-cast v0, Ljava/lang/Iterable;

    .line 135
    .line 136
    invoke-static {v0}, Lrc/g0;->O0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 137
    .line 138
    .line 139
    invoke-static {v11}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 147
    .line 148
    .line 149
    move-result v7

    .line 150
    const-string v8, "getName(...)"

    .line 151
    .line 152
    const/4 v9, 0x0

    .line 153
    if-eqz v7, :cond_4

    .line 154
    .line 155
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v7

    .line 159
    move-object v10, v7

    .line 160
    check-cast v10, Ljava/io/File;

    .line 161
    .line 162
    invoke-virtual {v10}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v10

    .line 166
    invoke-static {v10, v8}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    invoke-static {v12}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    invoke-static {v10, v12, v9, v5, v6}, Lqd/c0;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result v10

    .line 176
    if-nez v10, :cond_3

    .line 177
    .line 178
    goto :goto_0

    .line 179
    :cond_4
    move-object v7, v6

    .line 180
    :goto_0
    move-object v10, v7

    .line 181
    check-cast v10, Ljava/io/File;

    .line 182
    .line 183
    if-nez v10, :cond_5

    .line 184
    .line 185
    sget-object v0, Lqc/q;->a:Lqc/q;

    .line 186
    .line 187
    return-object v0

    .line 188
    :cond_5
    const-string v0, "\u4e0a\u4f20\u65e5\u5fd7"

    .line 189
    .line 190
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 195
    .line 196
    .line 197
    invoke-static {}, Lcom/blankj/utilcode/util/NetworkUtils;->isConnected()Z

    .line 198
    .line 199
    .line 200
    move-result v0

    .line 201
    if-nez v0, :cond_6

    .line 202
    .line 203
    const-string v0, "\u4e0a\u4f20\u65e5\u5fd7\u5931\u8d25\uff0c\u65e0\u7f51\u7edc"

    .line 204
    .line 205
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    .line 210
    .line 211
    .line 212
    sget-object v0, Lqc/q;->a:Lqc/q;

    .line 213
    .line 214
    return-object v0

    .line 215
    :cond_6
    invoke-static {v10}, Lcom/blankj/utilcode/util/FileUtils;->getFileExtension(Ljava/io/File;)Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v7

    .line 219
    invoke-virtual {v10}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    invoke-static {v0, v8}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    invoke-static {v0}, Lk2/p;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    const/16 v8, 0xa

    .line 231
    .line 232
    invoke-virtual {v0, v9, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v13

    .line 236
    const-string v0, "substring(...)"

    .line 237
    .line 238
    invoke-static {v13, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    const/16 v17, 0x4

    .line 242
    .line 243
    const/16 v18, 0x0

    .line 244
    .line 245
    const-string v14, "_"

    .line 246
    .line 247
    const-string v15, ""

    .line 248
    .line 249
    const/16 v16, 0x0

    .line 250
    .line 251
    invoke-static/range {v13 .. v18}, Lqd/z;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object v23

    .line 255
    sget-object v19, Lcom/friday/common/helper/OssUploadHelper;->b:Lcom/friday/common/helper/OssUploadHelper$a;

    .line 256
    .line 257
    sget-object v20, Lcom/friday/common/entity/OssFileType$Folder;->INSTANCE:Lcom/friday/common/entity/OssFileType$Folder;

    .line 258
    .line 259
    new-instance v0, Ljava/lang/StringBuilder;

    .line 260
    .line 261
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 262
    .line 263
    .line 264
    const-string v8, "."

    .line 265
    .line 266
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 267
    .line 268
    .line 269
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 270
    .line 271
    .line 272
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    move-result-object v21

    .line 276
    sget-object v22, Lcom/friday/common/entity/OssFileResource$Log;->INSTANCE:Lcom/friday/common/entity/OssFileResource$Log;

    .line 277
    .line 278
    const/16 v27, 0x30

    .line 279
    .line 280
    const/16 v28, 0x0

    .line 281
    .line 282
    const/16 v24, 0x0

    .line 283
    .line 284
    const-wide/16 v25, 0x0

    .line 285
    .line 286
    invoke-static/range {v19 .. v28}, Lcom/friday/common/helper/OssUploadHelper$a;->b(Lcom/friday/common/helper/OssUploadHelper$a;Lcom/friday/common/entity/OssFileType;Ljava/lang/String;Lcom/friday/common/entity/OssFileResource;Ljava/lang/String;Ljava/lang/String;JILjava/lang/Object;)Lcom/friday/common/entity/OssReqData;

    .line 287
    .line 288
    .line 289
    move-result-object v8

    .line 290
    invoke-virtual {v8}, Lcom/friday/common/entity/OssReqData;->getObjectKey()Ljava/lang/String;

    .line 291
    .line 292
    .line 293
    move-result-object v0

    .line 294
    invoke-virtual {v10}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object v13

    .line 298
    new-instance v14, Ljava/lang/StringBuilder;

    .line 299
    .line 300
    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    .line 301
    .line 302
    .line 303
    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 304
    .line 305
    .line 306
    const-string v0, "/"

    .line 307
    .line 308
    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 309
    .line 310
    .line 311
    invoke-virtual {v14, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 312
    .line 313
    .line 314
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 315
    .line 316
    .line 317
    move-result-object v13

    .line 318
    iget-object v0, v1, Lcom/friday/cloudsnote/viewModel/MainViewModel$uploadLog$1;->n:Lcom/friday/cloudsnote/viewModel/MainViewModel;

    .line 319
    .line 320
    :try_start_2
    sget-object v14, Lkotlin/Result;->d:Lkotlin/Result$a;

    .line 321
    .line 322
    invoke-static {v0}, Lcom/friday/cloudsnote/viewModel/MainViewModel;->e(Lcom/friday/cloudsnote/viewModel/MainViewModel;)Ld2/i;

    .line 323
    .line 324
    .line 325
    move-result-object v0

    .line 326
    invoke-virtual {v8}, Lcom/friday/common/entity/OssReqData;->getTokenReq()Lcom/friday/common/entity/OssTokenReq;

    .line 327
    .line 328
    .line 329
    move-result-object v14

    .line 330
    iput-object v2, v1, Lcom/friday/cloudsnote/viewModel/MainViewModel$uploadLog$1;->m:Ljava/lang/Object;

    .line 331
    .line 332
    invoke-static {v12}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 333
    .line 334
    .line 335
    move-result-object v15

    .line 336
    iput-object v15, v1, Lcom/friday/cloudsnote/viewModel/MainViewModel$uploadLog$1;->c:Ljava/lang/Object;

    .line 337
    .line 338
    invoke-static {v11}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    move-result-object v15

    .line 342
    iput-object v15, v1, Lcom/friday/cloudsnote/viewModel/MainViewModel$uploadLog$1;->d:Ljava/lang/Object;

    .line 343
    .line 344
    iput-object v10, v1, Lcom/friday/cloudsnote/viewModel/MainViewModel$uploadLog$1;->e:Ljava/lang/Object;

    .line 345
    .line 346
    invoke-static {v7}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 347
    .line 348
    .line 349
    move-result-object v15

    .line 350
    iput-object v15, v1, Lcom/friday/cloudsnote/viewModel/MainViewModel$uploadLog$1;->f:Ljava/lang/Object;

    .line 351
    .line 352
    invoke-static/range {v23 .. v23}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 353
    .line 354
    .line 355
    move-result-object v15

    .line 356
    iput-object v15, v1, Lcom/friday/cloudsnote/viewModel/MainViewModel$uploadLog$1;->g:Ljava/lang/Object;

    .line 357
    .line 358
    invoke-static {v8}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 359
    .line 360
    .line 361
    move-result-object v15

    .line 362
    iput-object v15, v1, Lcom/friday/cloudsnote/viewModel/MainViewModel$uploadLog$1;->h:Ljava/lang/Object;

    .line 363
    .line 364
    iput-object v13, v1, Lcom/friday/cloudsnote/viewModel/MainViewModel$uploadLog$1;->i:Ljava/lang/Object;

    .line 365
    .line 366
    iput v9, v1, Lcom/friday/cloudsnote/viewModel/MainViewModel$uploadLog$1;->k:I

    .line 367
    .line 368
    iput v4, v1, Lcom/friday/cloudsnote/viewModel/MainViewModel$uploadLog$1;->l:I

    .line 369
    .line 370
    invoke-interface {v0, v14, v1}, Ld2/i;->a(Lcom/friday/common/entity/OssTokenReq;Lvc/c;)Ljava/lang/Object;

    .line 371
    .line 372
    .line 373
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 374
    if-ne v0, v3, :cond_7

    .line 375
    .line 376
    goto/16 :goto_6

    .line 377
    .line 378
    :cond_7
    move-object v9, v7

    .line 379
    move-object v7, v8

    .line 380
    move-object v4, v13

    .line 381
    move-object/from16 v8, v23

    .line 382
    .line 383
    :goto_1
    :try_start_3
    check-cast v0, Lcom/friday/common/entity/OssTokenResult;

    .line 384
    .line 385
    invoke-virtual {v0}, Lcom/friday/common/entity/OssTokenResult;->getSuccess()Z

    .line 386
    .line 387
    .line 388
    move-result v13

    .line 389
    if-eqz v13, :cond_8

    .line 390
    .line 391
    invoke-virtual {v0}, Lcom/friday/common/entity/OssTokenResult;->getResult()Lcom/friday/common/entity/OssTokenResponse;

    .line 392
    .line 393
    .line 394
    move-result-object v0

    .line 395
    goto :goto_2

    .line 396
    :cond_8
    move-object v0, v6

    .line 397
    :goto_2
    invoke-static {v0}, Lkotlin/Result;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 398
    .line 399
    .line 400
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 401
    goto :goto_4

    .line 402
    :catchall_1
    move-exception v0

    .line 403
    move-object v9, v7

    .line 404
    move-object v7, v8

    .line 405
    move-object v4, v13

    .line 406
    move-object/from16 v8, v23

    .line 407
    .line 408
    :goto_3
    sget-object v13, Lkotlin/Result;->d:Lkotlin/Result$a;

    .line 409
    .line 410
    invoke-static {v0}, Lkotlin/b;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 411
    .line 412
    .line 413
    move-result-object v0

    .line 414
    invoke-static {v0}, Lkotlin/Result;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 415
    .line 416
    .line 417
    move-result-object v0

    .line 418
    :goto_4
    invoke-static {v0}, Lkotlin/Result;->g(Ljava/lang/Object;)Z

    .line 419
    .line 420
    .line 421
    move-result v13

    .line 422
    if-eqz v13, :cond_9

    .line 423
    .line 424
    goto :goto_5

    .line 425
    :cond_9
    move-object v6, v0

    .line 426
    :goto_5
    check-cast v6, Lcom/friday/common/entity/OssTokenResponse;

    .line 427
    .line 428
    if-nez v6, :cond_a

    .line 429
    .line 430
    const-string v0, "ossToken\u83b7\u53d6\u5931\u8d25"

    .line 431
    .line 432
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 433
    .line 434
    .line 435
    move-result-object v0

    .line 436
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    .line 437
    .line 438
    .line 439
    sget-object v0, Lqc/q;->a:Lqc/q;

    .line 440
    .line 441
    return-object v0

    .line 442
    :cond_a
    :try_start_4
    new-instance v0, Lcom/friday/common/helper/OssUploadHelper;

    .line 443
    .line 444
    invoke-direct {v0, v6}, Lcom/friday/common/helper/OssUploadHelper;-><init>(Lcom/friday/common/entity/OssTokenResponse;)V

    .line 445
    .line 446
    .line 447
    invoke-virtual {v10}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 448
    .line 449
    .line 450
    move-result-object v13

    .line 451
    const-string v14, "getAbsolutePath(...)"

    .line 452
    .line 453
    invoke-static {v13, v14}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 454
    .line 455
    .line 456
    invoke-static {v2}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 457
    .line 458
    .line 459
    move-result-object v2

    .line 460
    iput-object v2, v1, Lcom/friday/cloudsnote/viewModel/MainViewModel$uploadLog$1;->m:Ljava/lang/Object;

    .line 461
    .line 462
    invoke-static {v12}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 463
    .line 464
    .line 465
    move-result-object v2

    .line 466
    iput-object v2, v1, Lcom/friday/cloudsnote/viewModel/MainViewModel$uploadLog$1;->c:Ljava/lang/Object;

    .line 467
    .line 468
    invoke-static {v11}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 469
    .line 470
    .line 471
    move-result-object v2

    .line 472
    iput-object v2, v1, Lcom/friday/cloudsnote/viewModel/MainViewModel$uploadLog$1;->d:Ljava/lang/Object;

    .line 473
    .line 474
    iput-object v10, v1, Lcom/friday/cloudsnote/viewModel/MainViewModel$uploadLog$1;->e:Ljava/lang/Object;

    .line 475
    .line 476
    invoke-static {v9}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 477
    .line 478
    .line 479
    move-result-object v2

    .line 480
    iput-object v2, v1, Lcom/friday/cloudsnote/viewModel/MainViewModel$uploadLog$1;->f:Ljava/lang/Object;

    .line 481
    .line 482
    invoke-static {v8}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 483
    .line 484
    .line 485
    move-result-object v2

    .line 486
    iput-object v2, v1, Lcom/friday/cloudsnote/viewModel/MainViewModel$uploadLog$1;->g:Ljava/lang/Object;

    .line 487
    .line 488
    invoke-static {v7}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 489
    .line 490
    .line 491
    move-result-object v2

    .line 492
    iput-object v2, v1, Lcom/friday/cloudsnote/viewModel/MainViewModel$uploadLog$1;->h:Ljava/lang/Object;

    .line 493
    .line 494
    invoke-static {v4}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 495
    .line 496
    .line 497
    move-result-object v2

    .line 498
    iput-object v2, v1, Lcom/friday/cloudsnote/viewModel/MainViewModel$uploadLog$1;->i:Ljava/lang/Object;

    .line 499
    .line 500
    invoke-static {v6}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 501
    .line 502
    .line 503
    move-result-object v2

    .line 504
    iput-object v2, v1, Lcom/friday/cloudsnote/viewModel/MainViewModel$uploadLog$1;->j:Ljava/lang/Object;

    .line 505
    .line 506
    iput v5, v1, Lcom/friday/cloudsnote/viewModel/MainViewModel$uploadLog$1;->l:I

    .line 507
    .line 508
    invoke-virtual {v0, v13, v4, v1}, Lcom/friday/common/helper/OssUploadHelper;->e(Ljava/lang/String;Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 509
    .line 510
    .line 511
    move-result-object v0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 512
    if-ne v0, v3, :cond_b

    .line 513
    .line 514
    :goto_6
    return-object v3

    .line 515
    :cond_b
    move-object v0, v10

    .line 516
    :goto_7
    :try_start_5
    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 517
    .line 518
    .line 519
    move-result-object v2

    .line 520
    new-instance v3, Ljava/lang/StringBuilder;

    .line 521
    .line 522
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 523
    .line 524
    .line 525
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 526
    .line 527
    .line 528
    const-string v2, ", \u4e0a\u4f20\u6210\u529f"

    .line 529
    .line 530
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 531
    .line 532
    .line 533
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 534
    .line 535
    .line 536
    move-result-object v2

    .line 537
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 538
    .line 539
    .line 540
    move-result-object v2

    .line 541
    invoke-static {v2}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 542
    .line 543
    .line 544
    invoke-static {v0}, Lcom/blankj/utilcode/util/FileUtils;->delete(Ljava/io/File;)Z
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1

    .line 545
    .line 546
    .line 547
    goto :goto_8

    .line 548
    :catch_0
    move-object v0, v10

    .line 549
    :catch_1
    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 550
    .line 551
    .line 552
    move-result-object v0

    .line 553
    new-instance v2, Ljava/lang/StringBuilder;

    .line 554
    .line 555
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 556
    .line 557
    .line 558
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 559
    .line 560
    .line 561
    const-string v0, ", \u4e0a\u4f20\u5931\u8d25"

    .line 562
    .line 563
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 564
    .line 565
    .line 566
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 567
    .line 568
    .line 569
    move-result-object v0

    .line 570
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 571
    .line 572
    .line 573
    move-result-object v0

    .line 574
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    .line 575
    .line 576
    .line 577
    :goto_8
    sget-object v0, Lqc/q;->a:Lqc/q;

    .line 578
    .line 579
    return-object v0
.end method
