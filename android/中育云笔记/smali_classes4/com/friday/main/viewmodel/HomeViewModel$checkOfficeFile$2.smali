.class final Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/main/viewmodel/HomeViewModel;->l(Lvc/c;)Ljava/lang/Object;
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
    c = "com.friday.main.viewmodel.HomeViewModel$checkOfficeFile$2"
    f = "HomeViewModel.kt"
    l = {
        0xf8,
        0xfa,
        0x10e,
        0x111,
        0x117,
        0x11a,
        0x11f
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

.field public m:I

.field public n:I

.field public o:J

.field public p:I

.field public final synthetic q:Lcom/friday/main/viewmodel/HomeViewModel;


# direct methods
.method public constructor <init>(Lcom/friday/main/viewmodel/HomeViewModel;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->q:Lcom/friday/main/viewmodel/HomeViewModel;

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
    .locals 1

    .line 1
    new-instance p1, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->q:Lcom/friday/main/viewmodel/HomeViewModel;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;-><init>(Lcom/friday/main/viewmodel/HomeViewModel;Lvc/c;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v5, p0

    .line 2
    .line 3
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v6

    .line 7
    iget v0, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->p:I

    .line 8
    .line 9
    const/4 v7, 0x1

    .line 10
    const/4 v8, 0x0

    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 15
    .line 16
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 17
    .line 18
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw v0

    .line 22
    :pswitch_0
    iget v0, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->m:I

    .line 23
    .line 24
    iget-object v1, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->k:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v1, Ljava/lang/String;

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :pswitch_1
    iget v0, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->n:I

    .line 30
    .line 31
    iget v1, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->m:I

    .line 32
    .line 33
    iget-object v2, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->j:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v2, Ljava/lang/String;

    .line 36
    .line 37
    iget-object v3, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->i:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v3, Ljava/lang/String;

    .line 40
    .line 41
    iget-object v4, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->h:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v4, Lcom/friday/common/entity/FileEntity;

    .line 44
    .line 45
    iget-object v9, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->g:Ljava/lang/Object;

    .line 46
    .line 47
    iget-object v10, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->f:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v10, Ljava/util/Iterator;

    .line 50
    .line 51
    iget-object v11, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->e:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v11, Lcom/friday/main/viewmodel/HomeViewModel;

    .line 54
    .line 55
    iget-object v12, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->d:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v12, Ljava/lang/Iterable;

    .line 58
    .line 59
    iget-object v13, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->c:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v13, Ljava/util/List;

    .line 62
    .line 63
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    move v7, v1

    .line 67
    goto/16 :goto_8

    .line 68
    .line 69
    :pswitch_2
    iget v0, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->m:I

    .line 70
    .line 71
    :goto_0
    iget-object v1, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->j:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v1, Ljava/lang/String;

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :pswitch_3
    iget v0, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->m:I

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :pswitch_4
    iget v0, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->m:I

    .line 80
    .line 81
    iget-object v1, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->l:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v1, Ljava/util/List;

    .line 84
    .line 85
    iget-object v1, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->k:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v1, Ljava/lang/String;

    .line 88
    .line 89
    :goto_1
    iget-object v1, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->j:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v1, Ljava/util/List;

    .line 92
    .line 93
    :goto_2
    iget-object v1, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->i:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v1, Ljava/lang/String;

    .line 96
    .line 97
    iget-object v1, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->h:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v1, Lcom/friday/common/entity/FileEntity;

    .line 100
    .line 101
    iget-object v1, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->f:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v1, Ljava/util/Iterator;

    .line 104
    .line 105
    iget-object v2, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->e:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v2, Lcom/friday/main/viewmodel/HomeViewModel;

    .line 108
    .line 109
    iget-object v3, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->d:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v3, Ljava/lang/Iterable;

    .line 112
    .line 113
    iget-object v4, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->c:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast v4, Ljava/util/List;

    .line 116
    .line 117
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    goto/16 :goto_7

    .line 121
    .line 122
    :pswitch_5
    iget v0, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->n:I

    .line 123
    .line 124
    iget v1, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->m:I

    .line 125
    .line 126
    iget-object v2, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->h:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast v2, Lcom/friday/common/entity/FileEntity;

    .line 129
    .line 130
    iget-object v3, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->g:Ljava/lang/Object;

    .line 131
    .line 132
    iget-object v4, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->f:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast v4, Ljava/util/Iterator;

    .line 135
    .line 136
    iget-object v9, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->e:Ljava/lang/Object;

    .line 137
    .line 138
    check-cast v9, Lcom/friday/main/viewmodel/HomeViewModel;

    .line 139
    .line 140
    iget-object v10, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->d:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast v10, Ljava/lang/Iterable;

    .line 143
    .line 144
    iget-object v11, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->c:Ljava/lang/Object;

    .line 145
    .line 146
    check-cast v11, Ljava/util/List;

    .line 147
    .line 148
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    move v12, v1

    .line 152
    move v1, v0

    .line 153
    move v0, v12

    .line 154
    move-object v12, v3

    .line 155
    move-object v3, v4

    .line 156
    move-object v4, v2

    .line 157
    move-object v2, v9

    .line 158
    move-object v9, v11

    .line 159
    move-object/from16 v11, p1

    .line 160
    .line 161
    goto/16 :goto_5

    .line 162
    .line 163
    :pswitch_6
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    move-object/from16 v0, p1

    .line 167
    .line 168
    goto :goto_3

    .line 169
    :pswitch_7
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    iget-object v0, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->q:Lcom/friday/main/viewmodel/HomeViewModel;

    .line 173
    .line 174
    invoke-static {v0}, Lcom/friday/main/viewmodel/HomeViewModel;->g(Lcom/friday/main/viewmodel/HomeViewModel;)Lcom/friday/common/dao/FileDao;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    iget-object v1, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->q:Lcom/friday/main/viewmodel/HomeViewModel;

    .line 179
    .line 180
    invoke-static {v1}, Lcom/friday/main/viewmodel/HomeViewModel;->k(Lcom/friday/main/viewmodel/HomeViewModel;)J

    .line 181
    .line 182
    .line 183
    move-result-wide v1

    .line 184
    iput v7, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->p:I

    .line 185
    .line 186
    invoke-interface {v0, v1, v2, v5}, Lcom/friday/common/dao/FileDao;->s(JLvc/c;)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    if-ne v0, v6, :cond_0

    .line 191
    .line 192
    goto/16 :goto_9

    .line 193
    .line 194
    :cond_0
    :goto_3
    check-cast v0, Ljava/util/List;

    .line 195
    .line 196
    move-object v1, v0

    .line 197
    check-cast v1, Ljava/lang/Iterable;

    .line 198
    .line 199
    iget-object v2, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->q:Lcom/friday/main/viewmodel/HomeViewModel;

    .line 200
    .line 201
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 202
    .line 203
    .line 204
    move-result-object v3

    .line 205
    move v4, v8

    .line 206
    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 207
    .line 208
    .line 209
    move-result v9

    .line 210
    if-eqz v9, :cond_c

    .line 211
    .line 212
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v9

    .line 216
    move-object v10, v9

    .line 217
    check-cast v10, Lcom/friday/common/entity/FileEntity;

    .line 218
    .line 219
    invoke-static {v2}, Lcom/friday/main/viewmodel/HomeViewModel;->g(Lcom/friday/main/viewmodel/HomeViewModel;)Lcom/friday/common/dao/FileDao;

    .line 220
    .line 221
    .line 222
    move-result-object v11

    .line 223
    invoke-virtual {v10}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object v12

    .line 227
    invoke-static {v0}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v13

    .line 231
    iput-object v13, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->c:Ljava/lang/Object;

    .line 232
    .line 233
    invoke-static {v1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object v13

    .line 237
    iput-object v13, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->d:Ljava/lang/Object;

    .line 238
    .line 239
    iput-object v2, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->e:Ljava/lang/Object;

    .line 240
    .line 241
    iput-object v3, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->f:Ljava/lang/Object;

    .line 242
    .line 243
    invoke-static {v9}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v13

    .line 247
    iput-object v13, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->g:Ljava/lang/Object;

    .line 248
    .line 249
    iput-object v10, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->h:Ljava/lang/Object;

    .line 250
    .line 251
    const/4 v13, 0x0

    .line 252
    iput-object v13, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->i:Ljava/lang/Object;

    .line 253
    .line 254
    iput-object v13, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->j:Ljava/lang/Object;

    .line 255
    .line 256
    iput-object v13, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->k:Ljava/lang/Object;

    .line 257
    .line 258
    iput-object v13, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->l:Ljava/lang/Object;

    .line 259
    .line 260
    iput v4, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->m:I

    .line 261
    .line 262
    iput v8, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->n:I

    .line 263
    .line 264
    const/4 v13, 0x2

    .line 265
    iput v13, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->p:I

    .line 266
    .line 267
    invoke-interface {v11, v12, v5}, Lcom/friday/common/dao/FileDao;->q(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object v11

    .line 271
    if-ne v11, v6, :cond_1

    .line 272
    .line 273
    goto/16 :goto_9

    .line 274
    .line 275
    :cond_1
    move-object v12, v9

    .line 276
    move-object v9, v0

    .line 277
    move v0, v4

    .line 278
    move-object v4, v10

    .line 279
    move-object v10, v1

    .line 280
    move v1, v8

    .line 281
    :goto_5
    check-cast v11, Ljava/lang/String;

    .line 282
    .line 283
    invoke-virtual {v4}, Lcom/friday/common/entity/FileEntity;->getOfficePath()Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    move-result-object v13

    .line 287
    invoke-static {v13}, Lcom/blankj/utilcode/util/FileUtils;->isFileExists(Ljava/lang/String;)Z

    .line 288
    .line 289
    .line 290
    move-result v13

    .line 291
    if-nez v13, :cond_7

    .line 292
    .line 293
    invoke-virtual {v4}, Lcom/friday/common/entity/FileEntity;->getLocalFileUrl()Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object v13

    .line 297
    invoke-static {v13}, Lcom/blankj/utilcode/util/FileUtils;->listFilesInDir(Ljava/lang/String;)Ljava/util/List;

    .line 298
    .line 299
    .line 300
    move-result-object v13

    .line 301
    invoke-static {v13}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 302
    .line 303
    .line 304
    move-object v14, v13

    .line 305
    check-cast v14, Ljava/util/Collection;

    .line 306
    .line 307
    invoke-interface {v14}, Ljava/util/Collection;->isEmpty()Z

    .line 308
    .line 309
    .line 310
    move-result v14

    .line 311
    if-nez v14, :cond_6

    .line 312
    .line 313
    invoke-virtual {v4}, Lcom/friday/common/entity/FileEntity;->getLocalFileUrl()Ljava/lang/String;

    .line 314
    .line 315
    .line 316
    move-result-object v14

    .line 317
    invoke-virtual {v4}, Lcom/friday/common/entity/FileEntity;->getFileName()Ljava/lang/String;

    .line 318
    .line 319
    .line 320
    move-result-object v15

    .line 321
    new-instance v8, Ljava/lang/StringBuilder;

    .line 322
    .line 323
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 324
    .line 325
    .line 326
    invoke-virtual {v8, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 327
    .line 328
    .line 329
    invoke-virtual {v8, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 330
    .line 331
    .line 332
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 333
    .line 334
    .line 335
    move-result-object v8

    .line 336
    invoke-static {v8}, Lcom/blankj/utilcode/util/FileUtils;->getFileExtension(Ljava/lang/String;)Ljava/lang/String;

    .line 337
    .line 338
    .line 339
    move-result-object v8

    .line 340
    move-object v14, v13

    .line 341
    check-cast v14, Ljava/lang/Iterable;

    .line 342
    .line 343
    new-instance v15, Ljava/util/ArrayList;

    .line 344
    .line 345
    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 346
    .line 347
    .line 348
    invoke-interface {v14}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 349
    .line 350
    .line 351
    move-result-object v14

    .line 352
    :goto_6
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 353
    .line 354
    .line 355
    move-result v16

    .line 356
    if-eqz v16, :cond_3

    .line 357
    .line 358
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 359
    .line 360
    .line 361
    move-result-object v7

    .line 362
    move-object/from16 v17, v7

    .line 363
    .line 364
    check-cast v17, Ljava/io/File;

    .line 365
    .line 366
    move-object/from16 p1, v9

    .line 367
    .line 368
    invoke-static/range {v17 .. v17}, Lcom/blankj/utilcode/util/FileUtils;->getFileExtension(Ljava/io/File;)Ljava/lang/String;

    .line 369
    .line 370
    .line 371
    move-result-object v9

    .line 372
    invoke-static {v9, v8}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 373
    .line 374
    .line 375
    move-result v9

    .line 376
    if-eqz v9, :cond_2

    .line 377
    .line 378
    invoke-interface {v15, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 379
    .line 380
    .line 381
    :cond_2
    move-object/from16 v9, p1

    .line 382
    .line 383
    const/4 v7, 0x1

    .line 384
    goto :goto_6

    .line 385
    :cond_3
    move-object/from16 p1, v9

    .line 386
    .line 387
    invoke-interface {v15}, Ljava/util/List;->size()I

    .line 388
    .line 389
    .line 390
    move-result v7

    .line 391
    const/4 v9, 0x1

    .line 392
    if-ne v7, v9, :cond_4

    .line 393
    .line 394
    const/4 v7, 0x0

    .line 395
    invoke-interface {v15, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 396
    .line 397
    .line 398
    move-result-object v1

    .line 399
    check-cast v1, Ljava/io/File;

    .line 400
    .line 401
    invoke-virtual {v4}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 402
    .line 403
    .line 404
    move-result-object v4

    .line 405
    new-instance v11, Ljava/lang/StringBuilder;

    .line 406
    .line 407
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 408
    .line 409
    .line 410
    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 411
    .line 412
    .line 413
    const-string v4, "."

    .line 414
    .line 415
    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 416
    .line 417
    .line 418
    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 419
    .line 420
    .line 421
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 422
    .line 423
    .line 424
    move-result-object v4

    .line 425
    invoke-static {v1, v4}, Lcom/blankj/utilcode/util/FileUtils;->rename(Ljava/io/File;Ljava/lang/String;)Z

    .line 426
    .line 427
    .line 428
    move-result v1

    .line 429
    invoke-static {v1}, Lxc/a;->a(Z)Ljava/lang/Boolean;

    .line 430
    .line 431
    .line 432
    goto/16 :goto_a

    .line 433
    .line 434
    :cond_4
    const/4 v7, 0x0

    .line 435
    invoke-virtual {v4}, Lcom/friday/common/entity/FileEntity;->getLocalFileUrl()Ljava/lang/String;

    .line 436
    .line 437
    .line 438
    move-result-object v14

    .line 439
    invoke-static {v14}, Lcom/blankj/utilcode/util/FileUtils;->delete(Ljava/lang/String;)Z

    .line 440
    .line 441
    .line 442
    invoke-static {v2}, Lcom/friday/main/viewmodel/HomeViewModel;->g(Lcom/friday/main/viewmodel/HomeViewModel;)Lcom/friday/common/dao/FileDao;

    .line 443
    .line 444
    .line 445
    move-result-object v14

    .line 446
    invoke-virtual {v4}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 447
    .line 448
    .line 449
    move-result-object v7

    .line 450
    invoke-static/range {p1 .. p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 451
    .line 452
    .line 453
    move-result-object v9

    .line 454
    iput-object v9, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->c:Ljava/lang/Object;

    .line 455
    .line 456
    invoke-static {v10}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 457
    .line 458
    .line 459
    move-result-object v9

    .line 460
    iput-object v9, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->d:Ljava/lang/Object;

    .line 461
    .line 462
    iput-object v2, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->e:Ljava/lang/Object;

    .line 463
    .line 464
    iput-object v3, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->f:Ljava/lang/Object;

    .line 465
    .line 466
    invoke-static {v12}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 467
    .line 468
    .line 469
    move-result-object v9

    .line 470
    iput-object v9, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->g:Ljava/lang/Object;

    .line 471
    .line 472
    invoke-static {v4}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 473
    .line 474
    .line 475
    move-result-object v4

    .line 476
    iput-object v4, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->h:Ljava/lang/Object;

    .line 477
    .line 478
    invoke-static {v11}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 479
    .line 480
    .line 481
    move-result-object v4

    .line 482
    iput-object v4, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->i:Ljava/lang/Object;

    .line 483
    .line 484
    invoke-static {v13}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 485
    .line 486
    .line 487
    move-result-object v4

    .line 488
    iput-object v4, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->j:Ljava/lang/Object;

    .line 489
    .line 490
    invoke-static {v8}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 491
    .line 492
    .line 493
    move-result-object v4

    .line 494
    iput-object v4, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->k:Ljava/lang/Object;

    .line 495
    .line 496
    invoke-static {v15}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 497
    .line 498
    .line 499
    move-result-object v4

    .line 500
    iput-object v4, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->l:Ljava/lang/Object;

    .line 501
    .line 502
    iput v0, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->m:I

    .line 503
    .line 504
    iput v1, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->n:I

    .line 505
    .line 506
    const/4 v1, 0x3

    .line 507
    iput v1, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->p:I

    .line 508
    .line 509
    invoke-interface {v14, v7, v5}, Lcom/friday/common/dao/FileDao;->P(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 510
    .line 511
    .line 512
    move-result-object v1

    .line 513
    if-ne v1, v6, :cond_5

    .line 514
    .line 515
    goto/16 :goto_9

    .line 516
    .line 517
    :cond_5
    move-object/from16 v4, p1

    .line 518
    .line 519
    move-object v1, v3

    .line 520
    move-object v3, v10

    .line 521
    :goto_7
    move-object/from16 v19, v4

    .line 522
    .line 523
    move v4, v0

    .line 524
    move-object/from16 v0, v19

    .line 525
    .line 526
    move-object/from16 v19, v3

    .line 527
    .line 528
    move-object v3, v1

    .line 529
    move-object/from16 v1, v19

    .line 530
    .line 531
    goto/16 :goto_b

    .line 532
    .line 533
    :cond_6
    move-object/from16 p1, v9

    .line 534
    .line 535
    invoke-static {v2}, Lcom/friday/main/viewmodel/HomeViewModel;->g(Lcom/friday/main/viewmodel/HomeViewModel;)Lcom/friday/common/dao/FileDao;

    .line 536
    .line 537
    .line 538
    move-result-object v7

    .line 539
    invoke-virtual {v4}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 540
    .line 541
    .line 542
    move-result-object v8

    .line 543
    invoke-static/range {p1 .. p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 544
    .line 545
    .line 546
    move-result-object v9

    .line 547
    iput-object v9, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->c:Ljava/lang/Object;

    .line 548
    .line 549
    invoke-static {v10}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 550
    .line 551
    .line 552
    move-result-object v9

    .line 553
    iput-object v9, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->d:Ljava/lang/Object;

    .line 554
    .line 555
    iput-object v2, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->e:Ljava/lang/Object;

    .line 556
    .line 557
    iput-object v3, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->f:Ljava/lang/Object;

    .line 558
    .line 559
    invoke-static {v12}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 560
    .line 561
    .line 562
    move-result-object v9

    .line 563
    iput-object v9, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->g:Ljava/lang/Object;

    .line 564
    .line 565
    invoke-static {v4}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 566
    .line 567
    .line 568
    move-result-object v4

    .line 569
    iput-object v4, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->h:Ljava/lang/Object;

    .line 570
    .line 571
    invoke-static {v11}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 572
    .line 573
    .line 574
    move-result-object v4

    .line 575
    iput-object v4, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->i:Ljava/lang/Object;

    .line 576
    .line 577
    invoke-static {v13}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 578
    .line 579
    .line 580
    move-result-object v4

    .line 581
    iput-object v4, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->j:Ljava/lang/Object;

    .line 582
    .line 583
    iput v0, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->m:I

    .line 584
    .line 585
    iput v1, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->n:I

    .line 586
    .line 587
    const/4 v1, 0x4

    .line 588
    iput v1, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->p:I

    .line 589
    .line 590
    invoke-interface {v7, v8, v5}, Lcom/friday/common/dao/FileDao;->P(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 591
    .line 592
    .line 593
    move-result-object v1

    .line 594
    if-ne v1, v6, :cond_5

    .line 595
    .line 596
    goto/16 :goto_9

    .line 597
    .line 598
    :cond_7
    move-object/from16 p1, v9

    .line 599
    .line 600
    invoke-virtual {v4}, Lcom/friday/common/entity/FileEntity;->getOfficePath()Ljava/lang/String;

    .line 601
    .line 602
    .line 603
    move-result-object v7

    .line 604
    invoke-static {v7}, Lcom/blankj/utilcode/util/FileUtils;->getFileMD5ToString(Ljava/lang/String;)Ljava/lang/String;

    .line 605
    .line 606
    .line 607
    move-result-object v7

    .line 608
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 609
    .line 610
    .line 611
    move-result v8

    .line 612
    if-eqz v8, :cond_8

    .line 613
    .line 614
    invoke-static {v2}, Lcom/friday/main/viewmodel/HomeViewModel;->g(Lcom/friday/main/viewmodel/HomeViewModel;)Lcom/friday/common/dao/FileDao;

    .line 615
    .line 616
    .line 617
    move-result-object v8

    .line 618
    invoke-virtual {v4}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 619
    .line 620
    .line 621
    move-result-object v9

    .line 622
    invoke-static {v7}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 623
    .line 624
    .line 625
    invoke-static/range {p1 .. p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 626
    .line 627
    .line 628
    move-result-object v13

    .line 629
    iput-object v13, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->c:Ljava/lang/Object;

    .line 630
    .line 631
    invoke-static {v10}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 632
    .line 633
    .line 634
    move-result-object v13

    .line 635
    iput-object v13, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->d:Ljava/lang/Object;

    .line 636
    .line 637
    iput-object v2, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->e:Ljava/lang/Object;

    .line 638
    .line 639
    iput-object v3, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->f:Ljava/lang/Object;

    .line 640
    .line 641
    invoke-static {v12}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 642
    .line 643
    .line 644
    move-result-object v12

    .line 645
    iput-object v12, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->g:Ljava/lang/Object;

    .line 646
    .line 647
    invoke-static {v4}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 648
    .line 649
    .line 650
    move-result-object v4

    .line 651
    iput-object v4, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->h:Ljava/lang/Object;

    .line 652
    .line 653
    invoke-static {v11}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 654
    .line 655
    .line 656
    move-result-object v4

    .line 657
    iput-object v4, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->i:Ljava/lang/Object;

    .line 658
    .line 659
    invoke-static {v7}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 660
    .line 661
    .line 662
    move-result-object v4

    .line 663
    iput-object v4, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->j:Ljava/lang/Object;

    .line 664
    .line 665
    iput v0, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->m:I

    .line 666
    .line 667
    iput v1, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->n:I

    .line 668
    .line 669
    const/4 v1, 0x5

    .line 670
    iput v1, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->p:I

    .line 671
    .line 672
    invoke-interface {v8, v9, v7, v5}, Lcom/friday/common/dao/FileDao;->c(Ljava/lang/String;Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 673
    .line 674
    .line 675
    move-result-object v1

    .line 676
    if-ne v1, v6, :cond_5

    .line 677
    .line 678
    goto/16 :goto_9

    .line 679
    .line 680
    :cond_8
    invoke-static {v11, v7}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 681
    .line 682
    .line 683
    move-result v8

    .line 684
    if-nez v8, :cond_b

    .line 685
    .line 686
    invoke-static {v2}, Lcom/friday/main/viewmodel/HomeViewModel;->g(Lcom/friday/main/viewmodel/HomeViewModel;)Lcom/friday/common/dao/FileDao;

    .line 687
    .line 688
    .line 689
    move-result-object v8

    .line 690
    invoke-virtual {v4}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 691
    .line 692
    .line 693
    move-result-object v9

    .line 694
    invoke-static {v7}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 695
    .line 696
    .line 697
    invoke-static/range {p1 .. p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 698
    .line 699
    .line 700
    move-result-object v13

    .line 701
    iput-object v13, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->c:Ljava/lang/Object;

    .line 702
    .line 703
    invoke-static {v10}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 704
    .line 705
    .line 706
    move-result-object v13

    .line 707
    iput-object v13, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->d:Ljava/lang/Object;

    .line 708
    .line 709
    iput-object v2, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->e:Ljava/lang/Object;

    .line 710
    .line 711
    iput-object v3, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->f:Ljava/lang/Object;

    .line 712
    .line 713
    invoke-static {v12}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 714
    .line 715
    .line 716
    move-result-object v13

    .line 717
    iput-object v13, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->g:Ljava/lang/Object;

    .line 718
    .line 719
    iput-object v4, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->h:Ljava/lang/Object;

    .line 720
    .line 721
    invoke-static {v11}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 722
    .line 723
    .line 724
    move-result-object v13

    .line 725
    iput-object v13, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->i:Ljava/lang/Object;

    .line 726
    .line 727
    invoke-static {v7}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 728
    .line 729
    .line 730
    move-result-object v13

    .line 731
    iput-object v13, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->j:Ljava/lang/Object;

    .line 732
    .line 733
    iput v0, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->m:I

    .line 734
    .line 735
    iput v1, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->n:I

    .line 736
    .line 737
    const/4 v13, 0x6

    .line 738
    iput v13, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->p:I

    .line 739
    .line 740
    invoke-interface {v8, v9, v7, v5}, Lcom/friday/common/dao/FileDao;->c(Ljava/lang/String;Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 741
    .line 742
    .line 743
    move-result-object v8

    .line 744
    if-ne v8, v6, :cond_9

    .line 745
    .line 746
    goto/16 :goto_9

    .line 747
    .line 748
    :cond_9
    move-object/from16 v13, p1

    .line 749
    .line 750
    move-object v9, v12

    .line 751
    move-object v12, v10

    .line 752
    move-object v10, v3

    .line 753
    move-object v3, v11

    .line 754
    move-object v11, v2

    .line 755
    move-object v2, v7

    .line 756
    move v7, v0

    .line 757
    move v0, v1

    .line 758
    :goto_8
    invoke-virtual {v4}, Lcom/friday/common/entity/FileEntity;->getOfficePath()Ljava/lang/String;

    .line 759
    .line 760
    .line 761
    move-result-object v1

    .line 762
    invoke-static {v1}, Lcom/blankj/utilcode/util/FileUtils;->getFileLastModified(Ljava/lang/String;)J

    .line 763
    .line 764
    .line 765
    move-result-wide v14

    .line 766
    new-instance v1, Ljava/text/SimpleDateFormat;

    .line 767
    .line 768
    const-string v8, "yyyy-MM-dd HH:mm:ss"

    .line 769
    .line 770
    move-object/from16 p1, v2

    .line 771
    .line 772
    sget-object v2, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    .line 773
    .line 774
    invoke-direct {v1, v8, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 775
    .line 776
    .line 777
    invoke-static {v14, v15}, Lxc/a;->d(J)Ljava/lang/Long;

    .line 778
    .line 779
    .line 780
    move-result-object v2

    .line 781
    invoke-virtual {v1, v2}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    .line 782
    .line 783
    .line 784
    move-result-object v1

    .line 785
    invoke-static {v11}, Lcom/friday/main/viewmodel/HomeViewModel;->g(Lcom/friday/main/viewmodel/HomeViewModel;)Lcom/friday/common/dao/FileDao;

    .line 786
    .line 787
    .line 788
    move-result-object v2

    .line 789
    move-object v8, v4

    .line 790
    move-object v4, v1

    .line 791
    invoke-virtual {v8}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 792
    .line 793
    .line 794
    move-result-object v1

    .line 795
    move-object/from16 v17, v2

    .line 796
    .line 797
    invoke-virtual {v8}, Lcom/friday/common/entity/FileEntity;->getFileName()Ljava/lang/String;

    .line 798
    .line 799
    .line 800
    move-result-object v2

    .line 801
    invoke-static {v4}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 802
    .line 803
    .line 804
    move-object/from16 v18, v1

    .line 805
    .line 806
    invoke-static {v13}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 807
    .line 808
    .line 809
    move-result-object v1

    .line 810
    iput-object v1, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->c:Ljava/lang/Object;

    .line 811
    .line 812
    invoke-static {v12}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 813
    .line 814
    .line 815
    move-result-object v1

    .line 816
    iput-object v1, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->d:Ljava/lang/Object;

    .line 817
    .line 818
    iput-object v11, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->e:Ljava/lang/Object;

    .line 819
    .line 820
    iput-object v10, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->f:Ljava/lang/Object;

    .line 821
    .line 822
    invoke-static {v9}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 823
    .line 824
    .line 825
    move-result-object v1

    .line 826
    iput-object v1, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->g:Ljava/lang/Object;

    .line 827
    .line 828
    invoke-static {v8}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 829
    .line 830
    .line 831
    move-result-object v1

    .line 832
    iput-object v1, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->h:Ljava/lang/Object;

    .line 833
    .line 834
    invoke-static {v3}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 835
    .line 836
    .line 837
    move-result-object v1

    .line 838
    iput-object v1, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->i:Ljava/lang/Object;

    .line 839
    .line 840
    invoke-static/range {p1 .. p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 841
    .line 842
    .line 843
    move-result-object v1

    .line 844
    iput-object v1, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->j:Ljava/lang/Object;

    .line 845
    .line 846
    invoke-static {v4}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 847
    .line 848
    .line 849
    move-result-object v1

    .line 850
    iput-object v1, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->k:Ljava/lang/Object;

    .line 851
    .line 852
    iput v7, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->m:I

    .line 853
    .line 854
    iput v0, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->n:I

    .line 855
    .line 856
    iput-wide v14, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->o:J

    .line 857
    .line 858
    const/4 v0, 0x7

    .line 859
    iput v0, v5, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;->p:I

    .line 860
    .line 861
    const/4 v3, 0x1

    .line 862
    move-object/from16 v0, v17

    .line 863
    .line 864
    move-object/from16 v1, v18

    .line 865
    .line 866
    invoke-interface/range {v0 .. v5}, Lcom/friday/common/dao/FileDao;->a0(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 867
    .line 868
    .line 869
    move-result-object v0

    .line 870
    if-ne v0, v6, :cond_a

    .line 871
    .line 872
    :goto_9
    return-object v6

    .line 873
    :cond_a
    move v0, v7

    .line 874
    move-object v1, v10

    .line 875
    move-object v2, v11

    .line 876
    move-object v3, v12

    .line 877
    move-object v4, v13

    .line 878
    goto/16 :goto_7

    .line 879
    .line 880
    :cond_b
    :goto_a
    move v4, v0

    .line 881
    move-object v1, v10

    .line 882
    move-object/from16 v0, p1

    .line 883
    .line 884
    :goto_b
    const/4 v7, 0x1

    .line 885
    const/4 v8, 0x0

    .line 886
    move-object/from16 v5, p0

    .line 887
    .line 888
    goto/16 :goto_4

    .line 889
    .line 890
    :cond_c
    sget-object v0, Lqc/q;->a:Lqc/q;

    .line 891
    .line 892
    return-object v0

    .line 893
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
