.class public final synthetic Lcom/zykj/mistake/feature/notebook/detail/y3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/c;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p3, p0, Lcom/zykj/mistake/feature/notebook/detail/y3;->a:I

    iput-object p1, p0, Lcom/zykj/mistake/feature/notebook/detail/y3;->b:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    iput-object p2, p0, Lcom/zykj/mistake/feature/notebook/detail/y3;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 73

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lcom/zykj/mistake/feature/notebook/detail/y3;->a:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p1

    .line 9
    .line 10
    check-cast v1, Lcom/zykj/mistake/network/ApiResp;

    .line 11
    .line 12
    const-string v2, "it"

    .line 13
    .line 14
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iget-object v1, v0, Lcom/zykj/mistake/feature/notebook/detail/y3;->b:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 18
    .line 19
    iget-object v1, v1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->e:Lkotlinx/coroutines/flow/n0;

    .line 20
    .line 21
    :cond_0
    invoke-virtual {v1}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    move-object v3, v2

    .line 26
    check-cast v3, Lcom/zykj/mistake/feature/notebook/detail/m3;

    .line 27
    .line 28
    iget-object v4, v3, Lcom/zykj/mistake/feature/notebook/detail/m3;->I:Lcom/zykj/mistake/feature/notebook/detail/k3;

    .line 29
    .line 30
    iget-object v5, v4, Lcom/zykj/mistake/feature/notebook/detail/k3;->e:Ljava/util/List;

    .line 31
    .line 32
    iget-object v6, v0, Lcom/zykj/mistake/feature/notebook/detail/y3;->c:Ljava/lang/String;

    .line 33
    .line 34
    invoke-static {v5, v6}, Lkotlin/collections/t;->s0(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    iget-object v6, v3, Lcom/zykj/mistake/feature/notebook/detail/m3;->I:Lcom/zykj/mistake/feature/notebook/detail/k3;

    .line 39
    .line 40
    iget v6, v6, Lcom/zykj/mistake/feature/notebook/detail/k3;->g:I

    .line 41
    .line 42
    invoke-static {v6, v5}, Lkotlin/collections/t;->y0(ILjava/util/List;)Ljava/util/List;

    .line 43
    .line 44
    .line 45
    move-result-object v8

    .line 46
    const/4 v9, 0x0

    .line 47
    const/16 v10, 0x6f

    .line 48
    .line 49
    const/4 v5, 0x0

    .line 50
    const-wide/16 v6, 0x0

    .line 51
    .line 52
    invoke-static/range {v4 .. v10}, Lcom/zykj/mistake/feature/notebook/detail/k3;->a(Lcom/zykj/mistake/feature/notebook/detail/k3;Ljava/lang/String;JLjava/util/List;ZI)Lcom/zykj/mistake/feature/notebook/detail/k3;

    .line 53
    .line 54
    .line 55
    move-result-object v39

    .line 56
    const/16 v71, -0x5

    .line 57
    .line 58
    const/16 v72, 0x1

    .line 59
    .line 60
    const/4 v4, 0x0

    .line 61
    const/4 v5, 0x0

    .line 62
    const/4 v8, 0x0

    .line 63
    const/4 v9, 0x0

    .line 64
    const/4 v10, 0x0

    .line 65
    const/4 v11, 0x0

    .line 66
    const/4 v12, 0x0

    .line 67
    const/4 v13, 0x0

    .line 68
    const/4 v14, 0x0

    .line 69
    const/4 v15, 0x0

    .line 70
    const/16 v16, 0x0

    .line 71
    .line 72
    const/16 v17, 0x0

    .line 73
    .line 74
    const/16 v18, 0x0

    .line 75
    .line 76
    const/16 v19, 0x0

    .line 77
    .line 78
    const/16 v20, 0x0

    .line 79
    .line 80
    const/16 v21, 0x0

    .line 81
    .line 82
    const/16 v22, 0x0

    .line 83
    .line 84
    const/16 v23, 0x0

    .line 85
    .line 86
    const/16 v24, 0x0

    .line 87
    .line 88
    const/16 v25, 0x0

    .line 89
    .line 90
    const/16 v26, 0x0

    .line 91
    .line 92
    const/16 v27, 0x0

    .line 93
    .line 94
    const/16 v28, 0x0

    .line 95
    .line 96
    const/16 v29, 0x0

    .line 97
    .line 98
    const/16 v30, 0x0

    .line 99
    .line 100
    const/16 v31, 0x0

    .line 101
    .line 102
    const/16 v32, 0x0

    .line 103
    .line 104
    const/16 v33, 0x0

    .line 105
    .line 106
    const/16 v34, 0x0

    .line 107
    .line 108
    const/16 v35, 0x0

    .line 109
    .line 110
    const/16 v36, 0x0

    .line 111
    .line 112
    const/16 v37, 0x0

    .line 113
    .line 114
    const/16 v38, 0x0

    .line 115
    .line 116
    const/16 v40, 0x0

    .line 117
    .line 118
    const/16 v41, 0x0

    .line 119
    .line 120
    const/16 v42, 0x0

    .line 121
    .line 122
    const/16 v43, 0x0

    .line 123
    .line 124
    const/16 v44, 0x0

    .line 125
    .line 126
    const/16 v45, 0x0

    .line 127
    .line 128
    const/16 v46, 0x0

    .line 129
    .line 130
    const/16 v47, 0x0

    .line 131
    .line 132
    const/16 v48, 0x0

    .line 133
    .line 134
    const/16 v49, 0x0

    .line 135
    .line 136
    const/16 v50, 0x0

    .line 137
    .line 138
    const/16 v51, 0x0

    .line 139
    .line 140
    const/16 v52, 0x0

    .line 141
    .line 142
    const/16 v53, 0x0

    .line 143
    .line 144
    const/16 v54, 0x0

    .line 145
    .line 146
    const/16 v55, 0x0

    .line 147
    .line 148
    const/16 v56, 0x0

    .line 149
    .line 150
    const/16 v57, 0x0

    .line 151
    .line 152
    const/16 v58, 0x0

    .line 153
    .line 154
    const/16 v59, 0x0

    .line 155
    .line 156
    const/16 v60, 0x0

    .line 157
    .line 158
    const/16 v61, 0x0

    .line 159
    .line 160
    const/16 v62, 0x0

    .line 161
    .line 162
    const/16 v63, 0x0

    .line 163
    .line 164
    const/16 v64, 0x0

    .line 165
    .line 166
    const/16 v65, 0x0

    .line 167
    .line 168
    const/16 v66, 0x0

    .line 169
    .line 170
    const/16 v67, 0x0

    .line 171
    .line 172
    const/16 v68, 0x0

    .line 173
    .line 174
    const/16 v69, 0x0

    .line 175
    .line 176
    const/16 v70, -0x1

    .line 177
    .line 178
    invoke-static/range {v3 .. v72}, Lcom/zykj/mistake/feature/notebook/detail/m3;->a(Lcom/zykj/mistake/feature/notebook/detail/m3;IIJLcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$EntryMode;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/mistake/feature/review/ReviewContract$PracticeScene;Lcom/zykj/mistake/feature/review/ReviewContract$PracticePoolType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZZZLjava/util/List;Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerResult;ZZZLjava/lang/Integer;ZZZZZLcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$DetailTab;Ljava/util/List;Lcom/zykj/mistake/feature/notebook/detail/p0;Lcom/zykj/mistake/feature/notebook/detail/p0;Lcom/zykj/mistake/feature/notebook/detail/n3;Lcom/zykj/mistake/feature/notebook/detail/k3;Lcom/zykj/mistake/feature/notebook/detail/q0;ZZZLcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$DraftNavigation;ZZILjava/util/List;IZLjava/util/ArrayList;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;ZZZZLjava/lang/String;Ljava/lang/String;ZLcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$CreateCollectionEntry;ZZZZZLcom/zykj/mistake/feature/notebook/detail/l3;IIII)Lcom/zykj/mistake/feature/notebook/detail/m3;

    .line 179
    .line 180
    .line 181
    move-result-object v3

    .line 182
    invoke-virtual {v1, v2, v3}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    move-result v2

    .line 186
    if-eqz v2, :cond_0

    .line 187
    .line 188
    sget-object v1, Ld6/s;->a:Ld6/s;

    .line 189
    .line 190
    return-object v1

    .line 191
    :pswitch_0
    move-object/from16 v1, p1

    .line 192
    .line 193
    check-cast v1, Lcom/zykj/mistake/network/ApiResp;

    .line 194
    .line 195
    const-string v2, "it"

    .line 196
    .line 197
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    iget-object v1, v0, Lcom/zykj/mistake/feature/notebook/detail/y3;->b:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 201
    .line 202
    iget-object v1, v1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->e:Lkotlinx/coroutines/flow/n0;

    .line 203
    .line 204
    :cond_1
    invoke-virtual {v1}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v2

    .line 208
    move-object v3, v2

    .line 209
    check-cast v3, Lcom/zykj/mistake/feature/notebook/detail/m3;

    .line 210
    .line 211
    iget-object v4, v3, Lcom/zykj/mistake/feature/notebook/detail/m3;->I:Lcom/zykj/mistake/feature/notebook/detail/k3;

    .line 212
    .line 213
    iget-object v5, v4, Lcom/zykj/mistake/feature/notebook/detail/k3;->e:Ljava/util/List;

    .line 214
    .line 215
    new-instance v8, Ljava/util/ArrayList;

    .line 216
    .line 217
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 218
    .line 219
    .line 220
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 221
    .line 222
    .line 223
    move-result-object v5

    .line 224
    :cond_2
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 225
    .line 226
    .line 227
    move-result v6

    .line 228
    if-eqz v6, :cond_3

    .line 229
    .line 230
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object v6

    .line 234
    move-object v7, v6

    .line 235
    check-cast v7, Ljava/lang/String;

    .line 236
    .line 237
    iget-object v9, v0, Lcom/zykj/mistake/feature/notebook/detail/y3;->c:Ljava/lang/String;

    .line 238
    .line 239
    invoke-static {v7, v9}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 240
    .line 241
    .line 242
    move-result v7

    .line 243
    if-nez v7, :cond_2

    .line 244
    .line 245
    invoke-virtual {v8, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 246
    .line 247
    .line 248
    goto :goto_0

    .line 249
    :cond_3
    const/4 v9, 0x0

    .line 250
    const/16 v10, 0x6f

    .line 251
    .line 252
    const/4 v5, 0x0

    .line 253
    const-wide/16 v6, 0x0

    .line 254
    .line 255
    invoke-static/range {v4 .. v10}, Lcom/zykj/mistake/feature/notebook/detail/k3;->a(Lcom/zykj/mistake/feature/notebook/detail/k3;Ljava/lang/String;JLjava/util/List;ZI)Lcom/zykj/mistake/feature/notebook/detail/k3;

    .line 256
    .line 257
    .line 258
    move-result-object v39

    .line 259
    const/16 v71, -0x5

    .line 260
    .line 261
    const/16 v72, 0x1

    .line 262
    .line 263
    const/4 v4, 0x0

    .line 264
    const/4 v5, 0x0

    .line 265
    const/4 v8, 0x0

    .line 266
    const/4 v9, 0x0

    .line 267
    const/4 v10, 0x0

    .line 268
    const/4 v11, 0x0

    .line 269
    const/4 v12, 0x0

    .line 270
    const/4 v13, 0x0

    .line 271
    const/4 v14, 0x0

    .line 272
    const/4 v15, 0x0

    .line 273
    const/16 v16, 0x0

    .line 274
    .line 275
    const/16 v17, 0x0

    .line 276
    .line 277
    const/16 v18, 0x0

    .line 278
    .line 279
    const/16 v19, 0x0

    .line 280
    .line 281
    const/16 v20, 0x0

    .line 282
    .line 283
    const/16 v21, 0x0

    .line 284
    .line 285
    const/16 v22, 0x0

    .line 286
    .line 287
    const/16 v23, 0x0

    .line 288
    .line 289
    const/16 v24, 0x0

    .line 290
    .line 291
    const/16 v25, 0x0

    .line 292
    .line 293
    const/16 v26, 0x0

    .line 294
    .line 295
    const/16 v27, 0x0

    .line 296
    .line 297
    const/16 v28, 0x0

    .line 298
    .line 299
    const/16 v29, 0x0

    .line 300
    .line 301
    const/16 v30, 0x0

    .line 302
    .line 303
    const/16 v31, 0x0

    .line 304
    .line 305
    const/16 v32, 0x0

    .line 306
    .line 307
    const/16 v33, 0x0

    .line 308
    .line 309
    const/16 v34, 0x0

    .line 310
    .line 311
    const/16 v35, 0x0

    .line 312
    .line 313
    const/16 v36, 0x0

    .line 314
    .line 315
    const/16 v37, 0x0

    .line 316
    .line 317
    const/16 v38, 0x0

    .line 318
    .line 319
    const/16 v40, 0x0

    .line 320
    .line 321
    const/16 v41, 0x0

    .line 322
    .line 323
    const/16 v42, 0x0

    .line 324
    .line 325
    const/16 v43, 0x0

    .line 326
    .line 327
    const/16 v44, 0x0

    .line 328
    .line 329
    const/16 v45, 0x0

    .line 330
    .line 331
    const/16 v46, 0x0

    .line 332
    .line 333
    const/16 v47, 0x0

    .line 334
    .line 335
    const/16 v48, 0x0

    .line 336
    .line 337
    const/16 v49, 0x0

    .line 338
    .line 339
    const/16 v50, 0x0

    .line 340
    .line 341
    const/16 v51, 0x0

    .line 342
    .line 343
    const/16 v52, 0x0

    .line 344
    .line 345
    const/16 v53, 0x0

    .line 346
    .line 347
    const/16 v54, 0x0

    .line 348
    .line 349
    const/16 v55, 0x0

    .line 350
    .line 351
    const/16 v56, 0x0

    .line 352
    .line 353
    const/16 v57, 0x0

    .line 354
    .line 355
    const/16 v58, 0x0

    .line 356
    .line 357
    const/16 v59, 0x0

    .line 358
    .line 359
    const/16 v60, 0x0

    .line 360
    .line 361
    const/16 v61, 0x0

    .line 362
    .line 363
    const/16 v62, 0x0

    .line 364
    .line 365
    const/16 v63, 0x0

    .line 366
    .line 367
    const/16 v64, 0x0

    .line 368
    .line 369
    const/16 v65, 0x0

    .line 370
    .line 371
    const/16 v66, 0x0

    .line 372
    .line 373
    const/16 v67, 0x0

    .line 374
    .line 375
    const/16 v68, 0x0

    .line 376
    .line 377
    const/16 v69, 0x0

    .line 378
    .line 379
    const/16 v70, -0x1

    .line 380
    .line 381
    invoke-static/range {v3 .. v72}, Lcom/zykj/mistake/feature/notebook/detail/m3;->a(Lcom/zykj/mistake/feature/notebook/detail/m3;IIJLcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$EntryMode;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/mistake/feature/review/ReviewContract$PracticeScene;Lcom/zykj/mistake/feature/review/ReviewContract$PracticePoolType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZZZLjava/util/List;Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerResult;ZZZLjava/lang/Integer;ZZZZZLcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$DetailTab;Ljava/util/List;Lcom/zykj/mistake/feature/notebook/detail/p0;Lcom/zykj/mistake/feature/notebook/detail/p0;Lcom/zykj/mistake/feature/notebook/detail/n3;Lcom/zykj/mistake/feature/notebook/detail/k3;Lcom/zykj/mistake/feature/notebook/detail/q0;ZZZLcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$DraftNavigation;ZZILjava/util/List;IZLjava/util/ArrayList;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;ZZZZLjava/lang/String;Ljava/lang/String;ZLcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$CreateCollectionEntry;ZZZZZLcom/zykj/mistake/feature/notebook/detail/l3;IIII)Lcom/zykj/mistake/feature/notebook/detail/m3;

    .line 382
    .line 383
    .line 384
    move-result-object v3

    .line 385
    invoke-virtual {v1, v2, v3}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 386
    .line 387
    .line 388
    move-result v2

    .line 389
    if-eqz v2, :cond_1

    .line 390
    .line 391
    sget-object v1, Ld6/s;->a:Ld6/s;

    .line 392
    .line 393
    return-object v1

    .line 394
    nop

    .line 395
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
