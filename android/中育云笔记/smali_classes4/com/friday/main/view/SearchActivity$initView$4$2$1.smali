.class final Lcom/friday/main/view/SearchActivity$initView$4$2$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/main/view/SearchActivity;->initView()V
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
    c = "com.friday.main.view.SearchActivity$initView$4$2$1"
    f = "SearchActivity.kt"
    l = {
        0xa4,
        0xd0,
        0xe3
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:Ljava/lang/Object;

.field public d:I

.field public final synthetic e:Lcom/friday/common/entity/FileEntity;

.field public final synthetic f:Lcom/friday/main/view/SearchActivity;


# direct methods
.method public constructor <init>(Lcom/friday/common/entity/FileEntity;Lcom/friday/main/view/SearchActivity;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/main/view/SearchActivity$initView$4$2$1;->e:Lcom/friday/common/entity/FileEntity;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/main/view/SearchActivity$initView$4$2$1;->f:Lcom/friday/main/view/SearchActivity;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 2

    .line 1
    new-instance p1, Lcom/friday/main/view/SearchActivity$initView$4$2$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/main/view/SearchActivity$initView$4$2$1;->e:Lcom/friday/common/entity/FileEntity;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/friday/main/view/SearchActivity$initView$4$2$1;->f:Lcom/friday/main/view/SearchActivity;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/friday/main/view/SearchActivity$initView$4$2$1;-><init>(Lcom/friday/common/entity/FileEntity;Lcom/friday/main/view/SearchActivity;Lvc/c;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/friday/main/view/SearchActivity$initView$4$2$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/main/view/SearchActivity$initView$4$2$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/main/view/SearchActivity$initView$4$2$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/main/view/SearchActivity$initView$4$2$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget v2, v0, Lcom/friday/main/view/SearchActivity$initView$4$2$1;->d:I

    .line 8
    .line 9
    const-string v3, "12"

    .line 10
    .line 11
    const/4 v4, 0x3

    .line 12
    const/4 v5, 0x2

    .line 13
    const/4 v6, 0x1

    .line 14
    if-eqz v2, :cond_3

    .line 15
    .line 16
    if-eq v2, v6, :cond_2

    .line 17
    .line 18
    if-eq v2, v5, :cond_1

    .line 19
    .line 20
    if-ne v2, v4, :cond_0

    .line 21
    .line 22
    iget-object v1, v0, Lcom/friday/main/view/SearchActivity$initView$4$2$1;->c:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v1, Ljava/lang/String;

    .line 25
    .line 26
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    move-object/from16 v2, p1

    .line 30
    .line 31
    goto/16 :goto_2

    .line 32
    .line 33
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 34
    .line 35
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 36
    .line 37
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    throw v1

    .line 41
    :cond_1
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    move-object/from16 v2, p1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_2
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    move-object/from16 v2, p1

    .line 51
    .line 52
    goto/16 :goto_4

    .line 53
    .line 54
    :cond_3
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    sget-object v2, Lk2/v;->a:Lk2/v$a;

    .line 58
    .line 59
    const-string v7, "SearchResult"

    .line 60
    .line 61
    invoke-virtual {v2, v7}, Lk2/v$a;->a(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    iget-object v2, v0, Lcom/friday/main/view/SearchActivity$initView$4$2$1;->e:Lcom/friday/common/entity/FileEntity;

    .line 65
    .line 66
    invoke-virtual {v2}, Lcom/friday/common/entity/FileEntity;->getFileType()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 71
    .line 72
    .line 73
    move-result v7

    .line 74
    const/16 v8, 0x31

    .line 75
    .line 76
    if-eq v7, v8, :cond_11

    .line 77
    .line 78
    const/16 v8, 0x36

    .line 79
    .line 80
    if-eq v7, v8, :cond_d

    .line 81
    .line 82
    const/16 v8, 0x38

    .line 83
    .line 84
    if-eq v7, v8, :cond_b

    .line 85
    .line 86
    const/16 v8, 0x39

    .line 87
    .line 88
    if-eq v7, v8, :cond_a

    .line 89
    .line 90
    const/16 v8, 0x620

    .line 91
    .line 92
    if-eq v7, v8, :cond_5

    .line 93
    .line 94
    const/16 v8, 0x621

    .line 95
    .line 96
    if-eq v7, v8, :cond_4

    .line 97
    .line 98
    goto/16 :goto_1

    .line 99
    .line 100
    :cond_4
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    if-nez v2, :cond_15

    .line 105
    .line 106
    goto/16 :goto_1

    .line 107
    .line 108
    :cond_5
    const-string v3, "11"

    .line 109
    .line 110
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v2

    .line 114
    if-nez v2, :cond_6

    .line 115
    .line 116
    goto/16 :goto_1

    .line 117
    .line 118
    :cond_6
    iget-object v2, v0, Lcom/friday/main/view/SearchActivity$initView$4$2$1;->f:Lcom/friday/main/view/SearchActivity;

    .line 119
    .line 120
    invoke-static {v2}, Lcom/friday/main/view/SearchActivity;->V(Lcom/friday/main/view/SearchActivity;)Lcom/friday/main/viewmodel/SearchViewModel;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    iget-object v3, v0, Lcom/friday/main/view/SearchActivity$initView$4$2$1;->e:Lcom/friday/common/entity/FileEntity;

    .line 125
    .line 126
    invoke-virtual {v3}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v3

    .line 130
    iput v5, v0, Lcom/friday/main/view/SearchActivity$initView$4$2$1;->d:I

    .line 131
    .line 132
    invoke-virtual {v2, v3, v0}, Lcom/friday/main/viewmodel/SearchViewModel;->k(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    if-ne v2, v1, :cond_7

    .line 137
    .line 138
    goto/16 :goto_3

    .line 139
    .line 140
    :cond_7
    :goto_0
    check-cast v2, Ljava/lang/Boolean;

    .line 141
    .line 142
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 143
    .line 144
    .line 145
    move-result v1

    .line 146
    if-eqz v1, :cond_8

    .line 147
    .line 148
    iget-object v1, v0, Lcom/friday/main/view/SearchActivity$initView$4$2$1;->f:Lcom/friday/main/view/SearchActivity;

    .line 149
    .line 150
    invoke-static {v1}, Lcom/friday/main/view/SearchActivity;->V(Lcom/friday/main/view/SearchActivity;)Lcom/friday/main/viewmodel/SearchViewModel;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    iget-object v2, v0, Lcom/friday/main/view/SearchActivity$initView$4$2$1;->e:Lcom/friday/common/entity/FileEntity;

    .line 155
    .line 156
    invoke-virtual {v1, v2}, Lcom/friday/main/viewmodel/SearchViewModel;->w(Lcom/friday/common/entity/FileEntity;)V

    .line 157
    .line 158
    .line 159
    goto/16 :goto_5

    .line 160
    .line 161
    :cond_8
    sget-object v1, Lf2/c;->a:Lf2/c;

    .line 162
    .line 163
    invoke-virtual {v1}, Lf2/c;->e()Z

    .line 164
    .line 165
    .line 166
    move-result v1

    .line 167
    if-nez v1, :cond_9

    .line 168
    .line 169
    sget v1, Lcom/friday/main/R$string;->disconnected_net_without_micro_class:I

    .line 170
    .line 171
    invoke-static {v1}, Lz1/b;->h(I)V

    .line 172
    .line 173
    .line 174
    goto/16 :goto_5

    .line 175
    .line 176
    :cond_9
    iget-object v1, v0, Lcom/friday/main/view/SearchActivity$initView$4$2$1;->f:Lcom/friday/main/view/SearchActivity;

    .line 177
    .line 178
    invoke-virtual {v1, v6}, Lcom/friday/common/base/BaseActivity;->isShowLoading(Z)V

    .line 179
    .line 180
    .line 181
    iget-object v1, v0, Lcom/friday/main/view/SearchActivity$initView$4$2$1;->f:Lcom/friday/main/view/SearchActivity;

    .line 182
    .line 183
    iget-object v2, v0, Lcom/friday/main/view/SearchActivity$initView$4$2$1;->e:Lcom/friday/common/entity/FileEntity;

    .line 184
    .line 185
    invoke-static {v1, v2}, Lcom/friday/main/view/SearchActivity;->X(Lcom/friday/main/view/SearchActivity;Lcom/friday/common/entity/FileEntity;)V

    .line 186
    .line 187
    .line 188
    iget-object v1, v0, Lcom/friday/main/view/SearchActivity$initView$4$2$1;->f:Lcom/friday/main/view/SearchActivity;

    .line 189
    .line 190
    invoke-static {v1}, Lcom/friday/main/view/SearchActivity;->V(Lcom/friday/main/view/SearchActivity;)Lcom/friday/main/viewmodel/SearchViewModel;

    .line 191
    .line 192
    .line 193
    move-result-object v1

    .line 194
    iget-object v2, v0, Lcom/friday/main/view/SearchActivity$initView$4$2$1;->e:Lcom/friday/common/entity/FileEntity;

    .line 195
    .line 196
    invoke-virtual {v1, v2}, Lcom/friday/main/viewmodel/SearchViewModel;->m(Lcom/friday/common/entity/FileEntity;)V

    .line 197
    .line 198
    .line 199
    goto/16 :goto_5

    .line 200
    .line 201
    :cond_a
    const-string v3, "9"

    .line 202
    .line 203
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 204
    .line 205
    .line 206
    move-result v2

    .line 207
    if-nez v2, :cond_c

    .line 208
    .line 209
    goto/16 :goto_1

    .line 210
    .line 211
    :cond_b
    const-string v3, "8"

    .line 212
    .line 213
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 214
    .line 215
    .line 216
    move-result v2

    .line 217
    if-nez v2, :cond_c

    .line 218
    .line 219
    goto/16 :goto_1

    .line 220
    .line 221
    :cond_c
    sget-object v7, Lcom/friday/common/helper/c;->a:Lcom/friday/common/helper/c;

    .line 222
    .line 223
    iget-object v1, v0, Lcom/friday/main/view/SearchActivity$initView$4$2$1;->e:Lcom/friday/common/entity/FileEntity;

    .line 224
    .line 225
    invoke-virtual {v1}, Lcom/friday/common/entity/FileEntity;->getFileName()Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object v8

    .line 229
    iget-object v1, v0, Lcom/friday/main/view/SearchActivity$initView$4$2$1;->e:Lcom/friday/common/entity/FileEntity;

    .line 230
    .line 231
    invoke-virtual {v1}, Lcom/friday/common/entity/FileEntity;->getRealOssUrl()Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v9

    .line 235
    const/16 v14, 0x1c

    .line 236
    .line 237
    const/4 v15, 0x0

    .line 238
    const/4 v10, 0x0

    .line 239
    const/4 v11, 0x0

    .line 240
    const-wide/16 v12, 0x0

    .line 241
    .line 242
    invoke-static/range {v7 .. v15}, Lcom/friday/common/helper/c;->s(Lcom/friday/common/helper/c;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;JILjava/lang/Object;)V

    .line 243
    .line 244
    .line 245
    goto/16 :goto_5

    .line 246
    .line 247
    :cond_d
    const-string v3, "6"

    .line 248
    .line 249
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 250
    .line 251
    .line 252
    move-result v2

    .line 253
    if-nez v2, :cond_e

    .line 254
    .line 255
    goto :goto_1

    .line 256
    :cond_e
    iget-object v1, v0, Lcom/friday/main/view/SearchActivity$initView$4$2$1;->e:Lcom/friday/common/entity/FileEntity;

    .line 257
    .line 258
    invoke-virtual {v1}, Lcom/friday/common/entity/FileEntity;->getTxtFilePath()Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v1

    .line 262
    invoke-static {v1}, Lcom/blankj/utilcode/util/FileUtils;->isFileExists(Ljava/lang/String;)Z

    .line 263
    .line 264
    .line 265
    move-result v1

    .line 266
    if-eqz v1, :cond_f

    .line 267
    .line 268
    sget-object v7, Lcom/friday/common/helper/c;->a:Lcom/friday/common/helper/c;

    .line 269
    .line 270
    iget-object v1, v0, Lcom/friday/main/view/SearchActivity$initView$4$2$1;->e:Lcom/friday/common/entity/FileEntity;

    .line 271
    .line 272
    invoke-virtual {v1}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    move-result-object v8

    .line 276
    iget-object v1, v0, Lcom/friday/main/view/SearchActivity$initView$4$2$1;->e:Lcom/friday/common/entity/FileEntity;

    .line 277
    .line 278
    invoke-virtual {v1}, Lcom/friday/common/entity/FileEntity;->getParentId()Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object v9

    .line 282
    iget-object v1, v0, Lcom/friday/main/view/SearchActivity$initView$4$2$1;->e:Lcom/friday/common/entity/FileEntity;

    .line 283
    .line 284
    invoke-virtual {v1}, Lcom/friday/common/entity/FileEntity;->getFileName()Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object v10

    .line 288
    const/16 v15, 0x78

    .line 289
    .line 290
    const/16 v16, 0x0

    .line 291
    .line 292
    const/4 v11, 0x0

    .line 293
    const/4 v12, 0x0

    .line 294
    const/4 v13, 0x0

    .line 295
    const/4 v14, 0x0

    .line 296
    invoke-static/range {v7 .. v16}, Lcom/friday/common/helper/c;->q(Lcom/friday/common/helper/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/friday/common/entity/FromPage;Ljava/lang/String;ZLjava/lang/String;ILjava/lang/Object;)V

    .line 297
    .line 298
    .line 299
    goto/16 :goto_5

    .line 300
    .line 301
    :cond_f
    sget-object v1, Lf2/c;->a:Lf2/c;

    .line 302
    .line 303
    invoke-virtual {v1}, Lf2/c;->e()Z

    .line 304
    .line 305
    .line 306
    move-result v1

    .line 307
    if-nez v1, :cond_10

    .line 308
    .line 309
    sget v1, Lcom/friday/main/R$string;->disconnected_net_without_text:I

    .line 310
    .line 311
    invoke-static {v1}, Lz1/b;->h(I)V

    .line 312
    .line 313
    .line 314
    goto/16 :goto_5

    .line 315
    .line 316
    :cond_10
    iget-object v1, v0, Lcom/friday/main/view/SearchActivity$initView$4$2$1;->f:Lcom/friday/main/view/SearchActivity;

    .line 317
    .line 318
    invoke-virtual {v1, v6}, Lcom/friday/common/base/BaseActivity;->isShowLoading(Z)V

    .line 319
    .line 320
    .line 321
    iget-object v1, v0, Lcom/friday/main/view/SearchActivity$initView$4$2$1;->f:Lcom/friday/main/view/SearchActivity;

    .line 322
    .line 323
    iget-object v2, v0, Lcom/friday/main/view/SearchActivity$initView$4$2$1;->e:Lcom/friday/common/entity/FileEntity;

    .line 324
    .line 325
    invoke-static {v1, v2}, Lcom/friday/main/view/SearchActivity;->X(Lcom/friday/main/view/SearchActivity;Lcom/friday/common/entity/FileEntity;)V

    .line 326
    .line 327
    .line 328
    iget-object v1, v0, Lcom/friday/main/view/SearchActivity$initView$4$2$1;->f:Lcom/friday/main/view/SearchActivity;

    .line 329
    .line 330
    invoke-static {v1}, Lcom/friday/main/view/SearchActivity;->V(Lcom/friday/main/view/SearchActivity;)Lcom/friday/main/viewmodel/SearchViewModel;

    .line 331
    .line 332
    .line 333
    move-result-object v1

    .line 334
    iget-object v2, v0, Lcom/friday/main/view/SearchActivity$initView$4$2$1;->e:Lcom/friday/common/entity/FileEntity;

    .line 335
    .line 336
    invoke-virtual {v1, v2}, Lcom/friday/main/viewmodel/SearchViewModel;->p(Lcom/friday/common/entity/FileEntity;)V

    .line 337
    .line 338
    .line 339
    goto/16 :goto_5

    .line 340
    .line 341
    :cond_11
    const-string v7, "1"

    .line 342
    .line 343
    invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 344
    .line 345
    .line 346
    move-result v2

    .line 347
    if-nez v2, :cond_15

    .line 348
    .line 349
    :goto_1
    iget-object v2, v0, Lcom/friday/main/view/SearchActivity$initView$4$2$1;->e:Lcom/friday/common/entity/FileEntity;

    .line 350
    .line 351
    invoke-virtual {v2}, Lcom/friday/common/entity/FileEntity;->getRealOssUrl()Ljava/lang/String;

    .line 352
    .line 353
    .line 354
    move-result-object v2

    .line 355
    iget-object v3, v0, Lcom/friday/main/view/SearchActivity$initView$4$2$1;->e:Lcom/friday/common/entity/FileEntity;

    .line 356
    .line 357
    invoke-virtual {v3}, Lcom/friday/common/entity/FileEntity;->getFileType()Ljava/lang/String;

    .line 358
    .line 359
    .line 360
    move-result-object v3

    .line 361
    const-string v7, "7"

    .line 362
    .line 363
    invoke-static {v7, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 364
    .line 365
    .line 366
    move-result v3

    .line 367
    if-eqz v3, :cond_12

    .line 368
    .line 369
    sget-object v1, Lcom/friday/common/helper/c;->a:Lcom/friday/common/helper/c;

    .line 370
    .line 371
    const/4 v3, 0x0

    .line 372
    const/4 v4, 0x0

    .line 373
    invoke-static {v1, v2, v3, v5, v4}, Lcom/friday/common/helper/c;->e(Lcom/friday/common/helper/c;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 374
    .line 375
    .line 376
    sget-object v1, Lqc/q;->a:Lqc/q;

    .line 377
    .line 378
    return-object v1

    .line 379
    :cond_12
    iget-object v3, v0, Lcom/friday/main/view/SearchActivity$initView$4$2$1;->f:Lcom/friday/main/view/SearchActivity;

    .line 380
    .line 381
    invoke-static {v3}, Lcom/friday/main/view/SearchActivity;->V(Lcom/friday/main/view/SearchActivity;)Lcom/friday/main/viewmodel/SearchViewModel;

    .line 382
    .line 383
    .line 384
    move-result-object v3

    .line 385
    iget-object v5, v0, Lcom/friday/main/view/SearchActivity$initView$4$2$1;->e:Lcom/friday/common/entity/FileEntity;

    .line 386
    .line 387
    invoke-virtual {v5}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 388
    .line 389
    .line 390
    move-result-object v5

    .line 391
    invoke-static {v2}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 392
    .line 393
    .line 394
    move-result-object v2

    .line 395
    iput-object v2, v0, Lcom/friday/main/view/SearchActivity$initView$4$2$1;->c:Ljava/lang/Object;

    .line 396
    .line 397
    iput v4, v0, Lcom/friday/main/view/SearchActivity$initView$4$2$1;->d:I

    .line 398
    .line 399
    invoke-virtual {v3, v5, v0}, Lcom/friday/main/viewmodel/SearchViewModel;->k(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 400
    .line 401
    .line 402
    move-result-object v2

    .line 403
    if-ne v2, v1, :cond_13

    .line 404
    .line 405
    goto :goto_3

    .line 406
    :cond_13
    :goto_2
    check-cast v2, Ljava/lang/Boolean;

    .line 407
    .line 408
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 409
    .line 410
    .line 411
    move-result v1

    .line 412
    if-eqz v1, :cond_14

    .line 413
    .line 414
    iget-object v1, v0, Lcom/friday/main/view/SearchActivity$initView$4$2$1;->f:Lcom/friday/main/view/SearchActivity;

    .line 415
    .line 416
    invoke-static {v1}, Lcom/friday/main/view/SearchActivity;->V(Lcom/friday/main/view/SearchActivity;)Lcom/friday/main/viewmodel/SearchViewModel;

    .line 417
    .line 418
    .line 419
    move-result-object v1

    .line 420
    invoke-virtual {v1}, Lcom/friday/main/viewmodel/SearchViewModel;->r()Landroidx/lifecycle/MutableLiveData;

    .line 421
    .line 422
    .line 423
    move-result-object v1

    .line 424
    iget-object v2, v0, Lcom/friday/main/view/SearchActivity$initView$4$2$1;->e:Lcom/friday/common/entity/FileEntity;

    .line 425
    .line 426
    invoke-virtual {v1, v2}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 427
    .line 428
    .line 429
    goto :goto_5

    .line 430
    :cond_14
    iget-object v1, v0, Lcom/friday/main/view/SearchActivity$initView$4$2$1;->f:Lcom/friday/main/view/SearchActivity;

    .line 431
    .line 432
    invoke-virtual {v1, v6}, Lcom/friday/common/base/BaseActivity;->isShowLoading(Z)V

    .line 433
    .line 434
    .line 435
    iget-object v1, v0, Lcom/friday/main/view/SearchActivity$initView$4$2$1;->f:Lcom/friday/main/view/SearchActivity;

    .line 436
    .line 437
    invoke-static {v1}, Lcom/friday/main/view/SearchActivity;->V(Lcom/friday/main/view/SearchActivity;)Lcom/friday/main/viewmodel/SearchViewModel;

    .line 438
    .line 439
    .line 440
    move-result-object v1

    .line 441
    iget-object v2, v0, Lcom/friday/main/view/SearchActivity$initView$4$2$1;->e:Lcom/friday/common/entity/FileEntity;

    .line 442
    .line 443
    invoke-virtual {v1, v2}, Lcom/friday/main/viewmodel/SearchViewModel;->n(Lcom/friday/common/entity/FileEntity;)V

    .line 444
    .line 445
    .line 446
    goto :goto_5

    .line 447
    :cond_15
    iget-object v2, v0, Lcom/friday/main/view/SearchActivity$initView$4$2$1;->f:Lcom/friday/main/view/SearchActivity;

    .line 448
    .line 449
    invoke-static {v2}, Lcom/friday/main/view/SearchActivity;->V(Lcom/friday/main/view/SearchActivity;)Lcom/friday/main/viewmodel/SearchViewModel;

    .line 450
    .line 451
    .line 452
    move-result-object v2

    .line 453
    iget-object v4, v0, Lcom/friday/main/view/SearchActivity$initView$4$2$1;->e:Lcom/friday/common/entity/FileEntity;

    .line 454
    .line 455
    iput v6, v0, Lcom/friday/main/view/SearchActivity$initView$4$2$1;->d:I

    .line 456
    .line 457
    invoke-virtual {v2, v4, v0}, Lcom/friday/main/viewmodel/SearchViewModel;->j(Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;

    .line 458
    .line 459
    .line 460
    move-result-object v2

    .line 461
    if-ne v2, v1, :cond_16

    .line 462
    .line 463
    :goto_3
    return-object v1

    .line 464
    :cond_16
    :goto_4
    check-cast v2, Ljava/lang/Boolean;

    .line 465
    .line 466
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 467
    .line 468
    .line 469
    move-result v1

    .line 470
    if-nez v1, :cond_18

    .line 471
    .line 472
    sget-object v1, Lf2/c;->a:Lf2/c;

    .line 473
    .line 474
    invoke-virtual {v1}, Lf2/c;->e()Z

    .line 475
    .line 476
    .line 477
    move-result v1

    .line 478
    if-nez v1, :cond_17

    .line 479
    .line 480
    sget v1, Lcom/friday/main/R$string;->dis_net:I

    .line 481
    .line 482
    invoke-static {v1}, Lz1/b;->h(I)V

    .line 483
    .line 484
    .line 485
    goto :goto_5

    .line 486
    :cond_17
    iget-object v1, v0, Lcom/friday/main/view/SearchActivity$initView$4$2$1;->f:Lcom/friday/main/view/SearchActivity;

    .line 487
    .line 488
    invoke-virtual {v1, v6}, Lcom/friday/common/base/BaseActivity;->isShowLoading(Z)V

    .line 489
    .line 490
    .line 491
    iget-object v1, v0, Lcom/friday/main/view/SearchActivity$initView$4$2$1;->f:Lcom/friday/main/view/SearchActivity;

    .line 492
    .line 493
    iget-object v2, v0, Lcom/friday/main/view/SearchActivity$initView$4$2$1;->e:Lcom/friday/common/entity/FileEntity;

    .line 494
    .line 495
    invoke-static {v1, v2}, Lcom/friday/main/view/SearchActivity;->X(Lcom/friday/main/view/SearchActivity;Lcom/friday/common/entity/FileEntity;)V

    .line 496
    .line 497
    .line 498
    iget-object v1, v0, Lcom/friday/main/view/SearchActivity$initView$4$2$1;->f:Lcom/friday/main/view/SearchActivity;

    .line 499
    .line 500
    invoke-static {v1}, Lcom/friday/main/view/SearchActivity;->V(Lcom/friday/main/view/SearchActivity;)Lcom/friday/main/viewmodel/SearchViewModel;

    .line 501
    .line 502
    .line 503
    move-result-object v1

    .line 504
    iget-object v2, v0, Lcom/friday/main/view/SearchActivity$initView$4$2$1;->e:Lcom/friday/common/entity/FileEntity;

    .line 505
    .line 506
    invoke-virtual {v1, v2}, Lcom/friday/main/viewmodel/SearchViewModel;->l(Lcom/friday/common/entity/FileEntity;)V

    .line 507
    .line 508
    .line 509
    goto :goto_5

    .line 510
    :cond_18
    sget-object v1, Lcom/friday/common/helper/c;->a:Lcom/friday/common/helper/c;

    .line 511
    .line 512
    iget-object v2, v0, Lcom/friday/main/view/SearchActivity$initView$4$2$1;->e:Lcom/friday/common/entity/FileEntity;

    .line 513
    .line 514
    invoke-virtual {v2}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 515
    .line 516
    .line 517
    move-result-object v4

    .line 518
    iget-object v2, v0, Lcom/friday/main/view/SearchActivity$initView$4$2$1;->e:Lcom/friday/common/entity/FileEntity;

    .line 519
    .line 520
    invoke-virtual {v2}, Lcom/friday/common/entity/FileEntity;->getFileType()Ljava/lang/String;

    .line 521
    .line 522
    .line 523
    move-result-object v2

    .line 524
    invoke-static {v2, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 525
    .line 526
    .line 527
    move-result v7

    .line 528
    const/16 v9, 0x10

    .line 529
    .line 530
    const/4 v10, 0x0

    .line 531
    const/4 v5, 0x1

    .line 532
    const/4 v6, 0x1

    .line 533
    const/4 v8, 0x0

    .line 534
    move-object v3, v1

    .line 535
    invoke-static/range {v3 .. v10}, Lcom/friday/common/helper/c;->l(Lcom/friday/common/helper/c;Ljava/lang/String;ZZZLjava/lang/String;ILjava/lang/Object;)V

    .line 536
    .line 537
    .line 538
    :goto_5
    sget-object v1, Lqc/q;->a:Lqc/q;

    .line 539
    .line 540
    return-object v1
.end method
