.class public final synthetic Lcom/zykj/mistake/feature/notebook/list/j1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/c;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/zykj/mistake/feature/notebook/list/j1;->a:I

    iput-object p1, p0, Lcom/zykj/mistake/feature/notebook/list/j1;->b:Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lcom/zykj/mistake/feature/notebook/list/j1;->a:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p1

    .line 9
    .line 10
    check-cast v1, Ljava/util/List;

    .line 11
    .line 12
    const-string v2, "collections"

    .line 13
    .line 14
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    iget-object v3, v0, Lcom/zykj/mistake/feature/notebook/list/j1;->b:Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;

    .line 22
    .line 23
    if-eqz v2, :cond_1

    .line 24
    .line 25
    iget-object v2, v3, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;->d:Lkotlinx/coroutines/flow/n0;

    .line 26
    .line 27
    :cond_0
    invoke-virtual {v2}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    move-object v3, v1

    .line 32
    check-cast v3, Lcom/zykj/mistake/feature/notebook/list/e1;

    .line 33
    .line 34
    sget-object v25, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookContract$CreateCollectionEntry;->EMPTY_DIRECT:Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookContract$CreateCollectionEntry;

    .line 35
    .line 36
    const/16 v26, 0x0

    .line 37
    .line 38
    const v27, 0x147ffff

    .line 39
    .line 40
    .line 41
    const/4 v4, 0x0

    .line 42
    const/4 v5, 0x0

    .line 43
    const/4 v6, 0x0

    .line 44
    const/4 v7, 0x0

    .line 45
    const/4 v8, 0x0

    .line 46
    const/4 v9, 0x0

    .line 47
    const/4 v10, 0x0

    .line 48
    const/4 v11, 0x0

    .line 49
    const/4 v12, 0x0

    .line 50
    const/4 v13, 0x0

    .line 51
    const/4 v14, 0x0

    .line 52
    const/4 v15, 0x0

    .line 53
    const/16 v16, 0x0

    .line 54
    .line 55
    const/16 v17, 0x0

    .line 56
    .line 57
    const/16 v18, 0x0

    .line 58
    .line 59
    const/16 v19, 0x0

    .line 60
    .line 61
    const/16 v20, 0x0

    .line 62
    .line 63
    const/16 v21, 0x1

    .line 64
    .line 65
    const-string v22, ""

    .line 66
    .line 67
    const-string v23, ""

    .line 68
    .line 69
    const/16 v24, 0x0

    .line 70
    .line 71
    invoke-static/range {v3 .. v27}, Lcom/zykj/mistake/feature/notebook/list/e1;->a(Lcom/zykj/mistake/feature/notebook/list/e1;IIZLjava/util/ArrayList;ZZZZLjava/util/Set;Ljava/util/ArrayList;Ljava/util/List;Ljava/util/List;ZLjava/util/ArrayList;Lkotlin/collections/EmptySet;Ljava/util/Set;ZZLjava/lang/String;Ljava/lang/String;ZLcom/zykj/mistake/feature/notebook/list/MistakeNotebookContract$CreateCollectionEntry;ZI)Lcom/zykj/mistake/feature/notebook/list/e1;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    invoke-virtual {v2, v1, v3}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    if-eqz v1, :cond_0

    .line 80
    .line 81
    goto/16 :goto_3

    .line 82
    .line 83
    :cond_1
    new-instance v2, Ljava/util/ArrayList;

    .line 84
    .line 85
    const/16 v4, 0xa

    .line 86
    .line 87
    invoke-static {v1, v4}, Lkotlin/collections/u;->p(Ljava/lang/Iterable;I)I

    .line 88
    .line 89
    .line 90
    move-result v4

    .line 91
    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 92
    .line 93
    .line 94
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 99
    .line 100
    .line 101
    move-result v4

    .line 102
    if-eqz v4, :cond_3

    .line 103
    .line 104
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v4

    .line 108
    check-cast v4, Lcom/zykj/mistake/data/c;

    .line 109
    .line 110
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    new-instance v5, Lcom/zykj/mistake/feature/notebook/list/a;

    .line 114
    .line 115
    iget-object v6, v4, Lcom/zykj/mistake/data/c;->a:Ljava/lang/String;

    .line 116
    .line 117
    iget-object v7, v4, Lcom/zykj/mistake/data/c;->b:Ljava/lang/String;

    .line 118
    .line 119
    iget v8, v4, Lcom/zykj/mistake/data/c;->c:I

    .line 120
    .line 121
    iget v9, v4, Lcom/zykj/mistake/data/c;->d:I

    .line 122
    .line 123
    if-lt v8, v9, :cond_2

    .line 124
    .line 125
    const/4 v10, 0x1

    .line 126
    goto :goto_1

    .line 127
    :cond_2
    const/4 v10, 0x0

    .line 128
    :goto_1
    iget-boolean v11, v4, Lcom/zykj/mistake/data/c;->e:Z

    .line 129
    .line 130
    invoke-direct/range {v5 .. v11}, Lcom/zykj/mistake/feature/notebook/list/a;-><init>(Ljava/lang/String;Ljava/lang/String;IIZZ)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    goto :goto_0

    .line 137
    :cond_3
    iget-object v1, v3, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;->d:Lkotlinx/coroutines/flow/n0;

    .line 138
    .line 139
    :goto_2
    invoke-virtual {v1}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v3

    .line 143
    move-object v4, v3

    .line 144
    move-object v3, v4

    .line 145
    check-cast v3, Lcom/zykj/mistake/feature/notebook/list/e1;

    .line 146
    .line 147
    sget-object v18, Lkotlin/collections/EmptySet;->INSTANCE:Lkotlin/collections/EmptySet;

    .line 148
    .line 149
    const/16 v26, 0x0

    .line 150
    .line 151
    const v27, 0x1fc3fff

    .line 152
    .line 153
    .line 154
    move-object v5, v4

    .line 155
    const/4 v4, 0x0

    .line 156
    move-object v6, v5

    .line 157
    const/4 v5, 0x0

    .line 158
    move-object v7, v6

    .line 159
    const/4 v6, 0x0

    .line 160
    move-object v8, v7

    .line 161
    const/4 v7, 0x0

    .line 162
    move-object v9, v8

    .line 163
    const/4 v8, 0x0

    .line 164
    move-object v10, v9

    .line 165
    const/4 v9, 0x0

    .line 166
    move-object v11, v10

    .line 167
    const/4 v10, 0x0

    .line 168
    move-object v12, v11

    .line 169
    const/4 v11, 0x0

    .line 170
    move-object v13, v12

    .line 171
    const/4 v12, 0x0

    .line 172
    move-object v14, v13

    .line 173
    const/4 v13, 0x0

    .line 174
    move-object v15, v14

    .line 175
    const/4 v14, 0x0

    .line 176
    move-object/from16 v16, v15

    .line 177
    .line 178
    const/4 v15, 0x0

    .line 179
    move-object/from16 v17, v16

    .line 180
    .line 181
    const/16 v16, 0x1

    .line 182
    .line 183
    const/16 v20, 0x0

    .line 184
    .line 185
    const/16 v21, 0x0

    .line 186
    .line 187
    const/16 v22, 0x0

    .line 188
    .line 189
    const/16 v23, 0x0

    .line 190
    .line 191
    const/16 v24, 0x0

    .line 192
    .line 193
    const/16 v25, 0x0

    .line 194
    .line 195
    move-object/from16 v19, v18

    .line 196
    .line 197
    move-object/from16 v29, v17

    .line 198
    .line 199
    move-object/from16 v17, v2

    .line 200
    .line 201
    move-object/from16 v2, v29

    .line 202
    .line 203
    invoke-static/range {v3 .. v27}, Lcom/zykj/mistake/feature/notebook/list/e1;->a(Lcom/zykj/mistake/feature/notebook/list/e1;IIZLjava/util/ArrayList;ZZZZLjava/util/Set;Ljava/util/ArrayList;Ljava/util/List;Ljava/util/List;ZLjava/util/ArrayList;Lkotlin/collections/EmptySet;Ljava/util/Set;ZZLjava/lang/String;Ljava/lang/String;ZLcom/zykj/mistake/feature/notebook/list/MistakeNotebookContract$CreateCollectionEntry;ZI)Lcom/zykj/mistake/feature/notebook/list/e1;

    .line 204
    .line 205
    .line 206
    move-result-object v3

    .line 207
    invoke-virtual {v1, v2, v3}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 208
    .line 209
    .line 210
    move-result v2

    .line 211
    if-eqz v2, :cond_4

    .line 212
    .line 213
    :goto_3
    sget-object v1, Ld6/s;->a:Ld6/s;

    .line 214
    .line 215
    return-object v1

    .line 216
    :cond_4
    move-object/from16 v2, v17

    .line 217
    .line 218
    goto :goto_2

    .line 219
    :pswitch_0
    move-object/from16 v1, p1

    .line 220
    .line 221
    check-cast v1, Lcom/zykj/mistake/entity/resp/GetMyTagResp;

    .line 222
    .line 223
    const-string v2, "resp"

    .line 224
    .line 225
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/GetMyTagResp;->getResult()Ljava/util/List;

    .line 229
    .line 230
    .line 231
    move-result-object v1

    .line 232
    if-nez v1, :cond_5

    .line 233
    .line 234
    sget-object v1, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 235
    .line 236
    :cond_5
    move-object v13, v1

    .line 237
    iget-object v1, v0, Lcom/zykj/mistake/feature/notebook/list/j1;->b:Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;

    .line 238
    .line 239
    iget-object v2, v1, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;->d:Lkotlinx/coroutines/flow/n0;

    .line 240
    .line 241
    :goto_4
    invoke-virtual {v2}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object v3

    .line 245
    move-object v4, v2

    .line 246
    move-object v2, v3

    .line 247
    check-cast v2, Lcom/zykj/mistake/feature/notebook/list/e1;

    .line 248
    .line 249
    const/16 v25, 0x0

    .line 250
    .line 251
    const v26, 0x1fff7ff

    .line 252
    .line 253
    .line 254
    move-object v5, v3

    .line 255
    const/4 v3, 0x0

    .line 256
    move-object v6, v4

    .line 257
    const/4 v4, 0x0

    .line 258
    move-object v7, v5

    .line 259
    const/4 v5, 0x0

    .line 260
    move-object v8, v6

    .line 261
    const/4 v6, 0x0

    .line 262
    move-object v9, v7

    .line 263
    const/4 v7, 0x0

    .line 264
    move-object v10, v8

    .line 265
    const/4 v8, 0x0

    .line 266
    move-object v11, v9

    .line 267
    const/4 v9, 0x0

    .line 268
    move-object v12, v10

    .line 269
    const/4 v10, 0x0

    .line 270
    move-object v14, v11

    .line 271
    const/4 v11, 0x0

    .line 272
    move-object v15, v12

    .line 273
    const/4 v12, 0x0

    .line 274
    move-object/from16 v16, v14

    .line 275
    .line 276
    const/4 v14, 0x0

    .line 277
    move-object/from16 v17, v15

    .line 278
    .line 279
    const/4 v15, 0x0

    .line 280
    move-object/from16 v18, v16

    .line 281
    .line 282
    const/16 v16, 0x0

    .line 283
    .line 284
    move-object/from16 v19, v17

    .line 285
    .line 286
    const/16 v17, 0x0

    .line 287
    .line 288
    move-object/from16 v20, v18

    .line 289
    .line 290
    const/16 v18, 0x0

    .line 291
    .line 292
    move-object/from16 v21, v19

    .line 293
    .line 294
    const/16 v19, 0x0

    .line 295
    .line 296
    move-object/from16 v22, v20

    .line 297
    .line 298
    const/16 v20, 0x0

    .line 299
    .line 300
    move-object/from16 v23, v21

    .line 301
    .line 302
    const/16 v21, 0x0

    .line 303
    .line 304
    move-object/from16 v24, v22

    .line 305
    .line 306
    const/16 v22, 0x0

    .line 307
    .line 308
    move-object/from16 v27, v23

    .line 309
    .line 310
    const/16 v23, 0x0

    .line 311
    .line 312
    move-object/from16 v28, v24

    .line 313
    .line 314
    const/16 v24, 0x0

    .line 315
    .line 316
    move-object/from16 v0, v27

    .line 317
    .line 318
    move-object/from16 v27, v1

    .line 319
    .line 320
    move-object/from16 v1, v28

    .line 321
    .line 322
    invoke-static/range {v2 .. v26}, Lcom/zykj/mistake/feature/notebook/list/e1;->a(Lcom/zykj/mistake/feature/notebook/list/e1;IIZLjava/util/ArrayList;ZZZZLjava/util/Set;Ljava/util/ArrayList;Ljava/util/List;Ljava/util/List;ZLjava/util/ArrayList;Lkotlin/collections/EmptySet;Ljava/util/Set;ZZLjava/lang/String;Ljava/lang/String;ZLcom/zykj/mistake/feature/notebook/list/MistakeNotebookContract$CreateCollectionEntry;ZI)Lcom/zykj/mistake/feature/notebook/list/e1;

    .line 323
    .line 324
    .line 325
    move-result-object v2

    .line 326
    invoke-virtual {v0, v1, v2}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 327
    .line 328
    .line 329
    move-result v1

    .line 330
    if-eqz v1, :cond_6

    .line 331
    .line 332
    new-instance v0, Lcom/zykj/mistake/feature/notebook/list/s;

    .line 333
    .line 334
    invoke-direct {v0, v13}, Lcom/zykj/mistake/feature/notebook/list/s;-><init>(Ljava/util/List;)V

    .line 335
    .line 336
    .line 337
    move-object/from16 v1, v27

    .line 338
    .line 339
    invoke-virtual {v1, v0}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;->h(Lcom/zykj/mistake/feature/notebook/list/y;)V

    .line 340
    .line 341
    .line 342
    sget-object v0, Ld6/s;->a:Ld6/s;

    .line 343
    .line 344
    return-object v0

    .line 345
    :cond_6
    move-object v2, v0

    .line 346
    move-object/from16 v1, v27

    .line 347
    .line 348
    move-object/from16 v0, p0

    .line 349
    .line 350
    goto :goto_4

    .line 351
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
