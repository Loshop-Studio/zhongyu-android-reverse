.class public final Lcom/zykj/mistake/adapter/DetailPagerAdapter;
.super Landroidx/fragment/app/FragmentStatePagerAdapter;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0007\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"
    }
    d2 = {
        "Lcom/zykj/mistake/adapter/DetailPagerAdapter;",
        "Landroidx/fragment/app/FragmentStatePagerAdapter;",
        "app_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nDetailPagerAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DetailPagerAdapter.kt\ncom/zykj/mistake/adapter/DetailPagerAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,220:1\n1869#2,2:221\n1869#2,2:224\n1869#2,2:226\n1869#2,2:228\n1869#2,2:230\n1869#2,2:232\n1869#2,2:234\n1#3:223\n37#4:236\n36#4,3:237\n*S KotlinDebug\n*F\n+ 1 DetailPagerAdapter.kt\ncom/zykj/mistake/adapter/DetailPagerAdapter\n*L\n78#1:221,2\n130#1:224,2\n133#1:226,2\n172#1:228,2\n175#1:230,2\n197#1:232,2\n200#1:234,2\n215#1:236\n215#1:237,3\n*E\n"
    }
.end annotation


# instance fields
.field public final a:Lcom/zykj/mistake/activity/MistakeDetailActivity;

.field public final b:Ljava/util/ArrayList;

.field public final c:[Ljava/lang/String;

.field public d:Lcom/zykj/mistake/entity/resp/MistakeDetail;

.field public e:Z


# direct methods
.method public constructor <init>(Lcom/zykj/mistake/activity/MistakeDetailActivity;Landroidx/fragment/app/FragmentManager;)V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, p2, v0}, Landroidx/fragment/app/FragmentStatePagerAdapter;-><init>(Landroidx/fragment/app/FragmentManager;I)V

    .line 3
    .line 4
    .line 5
    iput-object p1, p0, Lcom/zykj/mistake/adapter/DetailPagerAdapter;->a:Lcom/zykj/mistake/activity/MistakeDetailActivity;

    .line 6
    .line 7
    new-instance p1, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Lcom/zykj/mistake/adapter/DetailPagerAdapter;->b:Ljava/util/ArrayList;

    .line 13
    .line 14
    const-string p1, "\u4f18\u89e3\u5178\u9519"

    .line 15
    .line 16
    const-string p2, "\u6211\u7684\u7b14\u8bb0"

    .line 17
    .line 18
    const-string v0, "\u539f\u7b54\u6848"

    .line 19
    .line 20
    const-string v1, "\u8ba2\u6b63\u7b54\u6848"

    .line 21
    .line 22
    const-string v2, "\u5fae\u8bfe"

    .line 23
    .line 24
    filled-new-array {v0, v1, v2, p1, p2}, [Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    iput-object p1, p0, Lcom/zykj/mistake/adapter/DetailPagerAdapter;->c:[Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {p0}, Lcom/zykj/mistake/adapter/DetailPagerAdapter;->b()V

    .line 31
    .line 32
    .line 33
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lcom/zykj/mistake/adapter/DetailPagerAdapter;->d:Lcom/zykj/mistake/entity/resp/MistakeDetail;

    .line 4
    .line 5
    const-string v2, "mMistakeDetail"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    if-eqz v1, :cond_17

    .line 9
    .line 10
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/MistakeDetail;->getAnswerInfos()Ljava/util/ArrayList;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    if-eqz v1, :cond_16

    .line 15
    .line 16
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    goto/16 :goto_6

    .line 23
    .line 24
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 27
    .line 28
    .line 29
    new-instance v4, Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 32
    .line 33
    .line 34
    new-instance v5, Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 37
    .line 38
    .line 39
    new-instance v6, Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 42
    .line 43
    .line 44
    iget-object v7, v0, Lcom/zykj/mistake/adapter/DetailPagerAdapter;->d:Lcom/zykj/mistake/entity/resp/MistakeDetail;

    .line 45
    .line 46
    if-eqz v7, :cond_15

    .line 47
    .line 48
    invoke-virtual {v7}, Lcom/zykj/mistake/entity/resp/MistakeDetail;->getAnswerInfos()Ljava/util/ArrayList;

    .line 49
    .line 50
    .line 51
    move-result-object v7

    .line 52
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 53
    .line 54
    .line 55
    move-result v8

    .line 56
    const/4 v9, 0x0

    .line 57
    move v10, v9

    .line 58
    :goto_0
    if-ge v10, v8, :cond_1

    .line 59
    .line 60
    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v11

    .line 64
    add-int/lit8 v10, v10, 0x1

    .line 65
    .line 66
    check-cast v11, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;

    .line 67
    .line 68
    new-instance v12, Lcom/google/gson/g;

    .line 69
    .line 70
    invoke-direct {v12}, Lcom/google/gson/g;-><init>()V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v12, v11}, Lcom/google/gson/g;->f(Ljava/lang/Object;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v11

    .line 77
    invoke-virtual {v1, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_1
    iget-object v7, v0, Lcom/zykj/mistake/adapter/DetailPagerAdapter;->d:Lcom/zykj/mistake/entity/resp/MistakeDetail;

    .line 82
    .line 83
    if-eqz v7, :cond_14

    .line 84
    .line 85
    invoke-virtual {v7}, Lcom/zykj/mistake/entity/resp/MistakeDetail;->getQstFlows()Ljava/util/ArrayList;

    .line 86
    .line 87
    .line 88
    move-result-object v7

    .line 89
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 90
    .line 91
    .line 92
    move-result v8

    .line 93
    move v10, v9

    .line 94
    :goto_1
    if-ge v10, v8, :cond_2

    .line 95
    .line 96
    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v11

    .line 100
    add-int/lit8 v10, v10, 0x1

    .line 101
    .line 102
    check-cast v11, Lcom/zykj/mistake/entity/resp/MistakeDetail$QstFlowBean;

    .line 103
    .line 104
    new-instance v12, Lcom/google/gson/g;

    .line 105
    .line 106
    invoke-direct {v12}, Lcom/google/gson/g;-><init>()V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v12, v11}, Lcom/google/gson/g;->f(Ljava/lang/Object;)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v11

    .line 113
    invoke-virtual {v4, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    goto :goto_1

    .line 117
    :cond_2
    iget-object v7, v0, Lcom/zykj/mistake/adapter/DetailPagerAdapter;->d:Lcom/zykj/mistake/entity/resp/MistakeDetail;

    .line 118
    .line 119
    if-eqz v7, :cond_13

    .line 120
    .line 121
    invoke-virtual {v7}, Lcom/zykj/mistake/entity/resp/MistakeDetail;->getAnswerInfos()Ljava/util/ArrayList;

    .line 122
    .line 123
    .line 124
    move-result-object v7

    .line 125
    const/4 v8, 0x1

    .line 126
    if-eqz v7, :cond_e

    .line 127
    .line 128
    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    .line 129
    .line 130
    .line 131
    move-result v7

    .line 132
    if-eqz v7, :cond_3

    .line 133
    .line 134
    goto/16 :goto_5

    .line 135
    .line 136
    :cond_3
    iget-object v7, v0, Lcom/zykj/mistake/adapter/DetailPagerAdapter;->d:Lcom/zykj/mistake/entity/resp/MistakeDetail;

    .line 137
    .line 138
    if-eqz v7, :cond_d

    .line 139
    .line 140
    invoke-virtual {v7}, Lcom/zykj/mistake/entity/resp/MistakeDetail;->getAnswerInfos()Ljava/util/ArrayList;

    .line 141
    .line 142
    .line 143
    move-result-object v7

    .line 144
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 145
    .line 146
    .line 147
    move-result v10

    .line 148
    move v11, v9

    .line 149
    :cond_4
    if-ge v11, v10, :cond_5

    .line 150
    .line 151
    invoke-virtual {v7, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v12

    .line 155
    add-int/lit8 v11, v11, 0x1

    .line 156
    .line 157
    move-object v13, v12

    .line 158
    check-cast v13, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;

    .line 159
    .line 160
    invoke-virtual {v13}, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;->getResult()I

    .line 161
    .line 162
    .line 163
    move-result v13

    .line 164
    if-eq v13, v8, :cond_4

    .line 165
    .line 166
    goto :goto_2

    .line 167
    :cond_5
    move-object v12, v3

    .line 168
    :goto_2
    check-cast v12, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;

    .line 169
    .line 170
    if-nez v12, :cond_7

    .line 171
    .line 172
    iget-object v7, v0, Lcom/zykj/mistake/adapter/DetailPagerAdapter;->d:Lcom/zykj/mistake/entity/resp/MistakeDetail;

    .line 173
    .line 174
    if-eqz v7, :cond_6

    .line 175
    .line 176
    invoke-virtual {v7}, Lcom/zykj/mistake/entity/resp/MistakeDetail;->getAnswerInfos()Ljava/util/ArrayList;

    .line 177
    .line 178
    .line 179
    move-result-object v7

    .line 180
    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v7

    .line 184
    const-string v10, "get(...)"

    .line 185
    .line 186
    invoke-static {v7, v10}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    move-object v12, v7

    .line 190
    check-cast v12, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;

    .line 191
    .line 192
    goto :goto_3

    .line 193
    :cond_6
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    throw v3

    .line 197
    :cond_7
    :goto_3
    new-instance v7, Lcom/zykj/mistake/entity/resp/MistakeDetail$QstMicroLessonBean;

    .line 198
    .line 199
    invoke-direct {v7}, Lcom/zykj/mistake/entity/resp/MistakeDetail$QstMicroLessonBean;-><init>()V

    .line 200
    .line 201
    .line 202
    sget v10, Lcom/zykj/mistake/R$string;->exam_micro:I

    .line 203
    .line 204
    iget-object v11, v0, Lcom/zykj/mistake/adapter/DetailPagerAdapter;->a:Lcom/zykj/mistake/activity/MistakeDetailActivity;

    .line 205
    .line 206
    invoke-virtual {v11, v10}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v10

    .line 210
    const-string v13, "getString(...)"

    .line 211
    .line 212
    invoke-static {v10, v13}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v7, v10}, Lcom/zykj/mistake/entity/resp/MistakeDetail$QstMicroLessonBean;->setName(Ljava/lang/String;)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v12}, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;->getExamAnswers()Ljava/util/ArrayList;

    .line 219
    .line 220
    .line 221
    move-result-object v10

    .line 222
    invoke-static {v10}, Lkotlin/collections/t;->i0(Ljava/util/List;)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v10

    .line 226
    check-cast v10, Ljava/lang/String;

    .line 227
    .line 228
    const-string v14, ""

    .line 229
    .line 230
    if-nez v10, :cond_8

    .line 231
    .line 232
    move-object v10, v14

    .line 233
    :cond_8
    invoke-virtual {v7, v10}, Lcom/zykj/mistake/entity/resp/MistakeDetail$QstMicroLessonBean;->setSnapshot(Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    invoke-virtual {v12}, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;->getExamMicroLessonComment()Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object v10

    .line 240
    if-nez v10, :cond_9

    .line 241
    .line 242
    move-object v10, v14

    .line 243
    :cond_9
    invoke-virtual {v7, v10}, Lcom/zykj/mistake/entity/resp/MistakeDetail$QstMicroLessonBean;->setAddress(Ljava/lang/String;)V

    .line 244
    .line 245
    .line 246
    new-instance v10, Lcom/zykj/mistake/entity/resp/MistakeDetail$QstMicroLessonBean;

    .line 247
    .line 248
    invoke-direct {v10}, Lcom/zykj/mistake/entity/resp/MistakeDetail$QstMicroLessonBean;-><init>()V

    .line 249
    .line 250
    .line 251
    sget v15, Lcom/zykj/mistake/R$string;->revise_micro:I

    .line 252
    .line 253
    invoke-virtual {v11, v15}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object v11

    .line 257
    invoke-static {v11, v13}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 258
    .line 259
    .line 260
    invoke-virtual {v10, v11}, Lcom/zykj/mistake/entity/resp/MistakeDetail$QstMicroLessonBean;->setName(Ljava/lang/String;)V

    .line 261
    .line 262
    .line 263
    invoke-virtual {v12}, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;->getRevisingAnswers()Ljava/util/ArrayList;

    .line 264
    .line 265
    .line 266
    move-result-object v11

    .line 267
    invoke-static {v11}, Lkotlin/collections/t;->i0(Ljava/util/List;)Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object v11

    .line 271
    check-cast v11, Ljava/lang/String;

    .line 272
    .line 273
    if-nez v11, :cond_a

    .line 274
    .line 275
    move-object v11, v14

    .line 276
    :cond_a
    invoke-virtual {v10, v11}, Lcom/zykj/mistake/entity/resp/MistakeDetail$QstMicroLessonBean;->setSnapshot(Ljava/lang/String;)V

    .line 277
    .line 278
    .line 279
    invoke-virtual {v12}, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;->getReviseMicroLessonComment()Ljava/lang/String;

    .line 280
    .line 281
    .line 282
    move-result-object v11

    .line 283
    if-nez v11, :cond_b

    .line 284
    .line 285
    goto :goto_4

    .line 286
    :cond_b
    move-object v14, v11

    .line 287
    :goto_4
    invoke-virtual {v10, v14}, Lcom/zykj/mistake/entity/resp/MistakeDetail$QstMicroLessonBean;->setAddress(Ljava/lang/String;)V

    .line 288
    .line 289
    .line 290
    invoke-virtual {v7}, Lcom/zykj/mistake/entity/resp/MistakeDetail$QstMicroLessonBean;->getAddress()Ljava/lang/String;

    .line 291
    .line 292
    .line 293
    move-result-object v11

    .line 294
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 295
    .line 296
    .line 297
    move-result v11

    .line 298
    if-lez v11, :cond_c

    .line 299
    .line 300
    new-instance v11, Lcom/google/gson/g;

    .line 301
    .line 302
    invoke-direct {v11}, Lcom/google/gson/g;-><init>()V

    .line 303
    .line 304
    .line 305
    invoke-virtual {v11, v7}, Lcom/google/gson/g;->f(Ljava/lang/Object;)Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object v7

    .line 309
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 310
    .line 311
    .line 312
    :cond_c
    invoke-virtual {v10}, Lcom/zykj/mistake/entity/resp/MistakeDetail$QstMicroLessonBean;->getAddress()Ljava/lang/String;

    .line 313
    .line 314
    .line 315
    move-result-object v7

    .line 316
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 317
    .line 318
    .line 319
    move-result v7

    .line 320
    if-lez v7, :cond_e

    .line 321
    .line 322
    new-instance v7, Lcom/google/gson/g;

    .line 323
    .line 324
    invoke-direct {v7}, Lcom/google/gson/g;-><init>()V

    .line 325
    .line 326
    .line 327
    invoke-virtual {v7, v10}, Lcom/google/gson/g;->f(Ljava/lang/Object;)Ljava/lang/String;

    .line 328
    .line 329
    .line 330
    move-result-object v7

    .line 331
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 332
    .line 333
    .line 334
    goto :goto_5

    .line 335
    :cond_d
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 336
    .line 337
    .line 338
    throw v3

    .line 339
    :cond_e
    :goto_5
    iget-object v7, v0, Lcom/zykj/mistake/adapter/DetailPagerAdapter;->d:Lcom/zykj/mistake/entity/resp/MistakeDetail;

    .line 340
    .line 341
    if-eqz v7, :cond_12

    .line 342
    .line 343
    invoke-virtual {v7}, Lcom/zykj/mistake/entity/resp/MistakeDetail;->getItemType()I

    .line 344
    .line 345
    .line 346
    move-result v7

    .line 347
    iget-object v10, v0, Lcom/zykj/mistake/adapter/DetailPagerAdapter;->d:Lcom/zykj/mistake/entity/resp/MistakeDetail;

    .line 348
    .line 349
    if-eqz v10, :cond_11

    .line 350
    .line 351
    invoke-virtual {v10}, Lcom/zykj/mistake/entity/resp/MistakeDetail;->isShowAnswer()Z

    .line 352
    .line 353
    .line 354
    move-result v10

    .line 355
    iget-boolean v11, v0, Lcom/zykj/mistake/adapter/DetailPagerAdapter;->e:Z

    .line 356
    .line 357
    new-instance v12, Landroid/os/Bundle;

    .line 358
    .line 359
    invoke-direct {v12}, Landroid/os/Bundle;-><init>()V

    .line 360
    .line 361
    .line 362
    const-string v13, "itemType"

    .line 363
    .line 364
    invoke-virtual {v12, v13, v7}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 365
    .line 366
    .line 367
    const-string v7, "answerInfoList"

    .line 368
    .line 369
    invoke-virtual {v12, v7, v1}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 370
    .line 371
    .line 372
    const-string v14, "qstFlowList"

    .line 373
    .line 374
    invoke-virtual {v12, v14, v4}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 375
    .line 376
    .line 377
    const-string v15, "microClassForScreenList"

    .line 378
    .line 379
    invoke-virtual {v12, v15, v5}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 380
    .line 381
    .line 382
    const-string v5, "isShowAnswer"

    .line 383
    .line 384
    invoke-virtual {v12, v5, v10}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 385
    .line 386
    .line 387
    const-string v10, "isGroup"

    .line 388
    .line 389
    invoke-virtual {v12, v10, v11}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 390
    .line 391
    .line 392
    new-instance v11, Lcom/zykj/mistake/fragment/OriginalAnswerFragment;

    .line 393
    .line 394
    invoke-direct {v11}, Lcom/zykj/mistake/fragment/OriginalAnswerFragment;-><init>()V

    .line 395
    .line 396
    .line 397
    invoke-virtual {v11, v12}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 398
    .line 399
    .line 400
    iget-object v12, v0, Lcom/zykj/mistake/adapter/DetailPagerAdapter;->d:Lcom/zykj/mistake/entity/resp/MistakeDetail;

    .line 401
    .line 402
    if-eqz v12, :cond_10

    .line 403
    .line 404
    invoke-virtual {v12}, Lcom/zykj/mistake/entity/resp/MistakeDetail;->getItemType()I

    .line 405
    .line 406
    .line 407
    move-result v12

    .line 408
    move-object/from16 v16, v3

    .line 409
    .line 410
    iget-object v3, v0, Lcom/zykj/mistake/adapter/DetailPagerAdapter;->d:Lcom/zykj/mistake/entity/resp/MistakeDetail;

    .line 411
    .line 412
    if-eqz v3, :cond_f

    .line 413
    .line 414
    invoke-virtual {v3}, Lcom/zykj/mistake/entity/resp/MistakeDetail;->isShowAnswer()Z

    .line 415
    .line 416
    .line 417
    move-result v2

    .line 418
    iget-boolean v3, v0, Lcom/zykj/mistake/adapter/DetailPagerAdapter;->e:Z

    .line 419
    .line 420
    new-instance v8, Landroid/os/Bundle;

    .line 421
    .line 422
    invoke-direct {v8}, Landroid/os/Bundle;-><init>()V

    .line 423
    .line 424
    .line 425
    invoke-virtual {v8, v13, v12}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 426
    .line 427
    .line 428
    invoke-virtual {v8, v7, v1}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 429
    .line 430
    .line 431
    invoke-virtual {v8, v14, v4}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 432
    .line 433
    .line 434
    invoke-virtual {v8, v15, v6}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 435
    .line 436
    .line 437
    invoke-virtual {v8, v5, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 438
    .line 439
    .line 440
    invoke-virtual {v8, v10, v3}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 441
    .line 442
    .line 443
    new-instance v1, Lcom/zykj/mistake/fragment/RevisedAnswerFragment;

    .line 444
    .line 445
    invoke-direct {v1}, Lcom/zykj/mistake/fragment/RevisedAnswerFragment;-><init>()V

    .line 446
    .line 447
    .line 448
    invoke-virtual {v1, v8}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 449
    .line 450
    .line 451
    iget-object v2, v0, Lcom/zykj/mistake/adapter/DetailPagerAdapter;->b:Ljava/util/ArrayList;

    .line 452
    .line 453
    invoke-virtual {v2, v9, v11}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 454
    .line 455
    .line 456
    const/4 v3, 0x1

    .line 457
    invoke-virtual {v2, v3, v1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 458
    .line 459
    .line 460
    return-void

    .line 461
    :cond_f
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 462
    .line 463
    .line 464
    throw v16

    .line 465
    :cond_10
    move-object/from16 v16, v3

    .line 466
    .line 467
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 468
    .line 469
    .line 470
    throw v16

    .line 471
    :cond_11
    move-object/from16 v16, v3

    .line 472
    .line 473
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 474
    .line 475
    .line 476
    throw v16

    .line 477
    :cond_12
    move-object/from16 v16, v3

    .line 478
    .line 479
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 480
    .line 481
    .line 482
    throw v16

    .line 483
    :cond_13
    move-object/from16 v16, v3

    .line 484
    .line 485
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 486
    .line 487
    .line 488
    throw v16

    .line 489
    :cond_14
    move-object/from16 v16, v3

    .line 490
    .line 491
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 492
    .line 493
    .line 494
    throw v16

    .line 495
    :cond_15
    move-object/from16 v16, v3

    .line 496
    .line 497
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 498
    .line 499
    .line 500
    throw v16

    .line 501
    :cond_16
    :goto_6
    return-void

    .line 502
    :cond_17
    move-object/from16 v16, v3

    .line 503
    .line 504
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 505
    .line 506
    .line 507
    throw v16
.end method

.method public final b()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/adapter/DetailPagerAdapter;->b:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 4
    .line 5
    .line 6
    sget v1, Lcom/zykj/mistake/R$string;->original_answer_empty:I

    .line 7
    .line 8
    iget-object v2, p0, Lcom/zykj/mistake/adapter/DetailPagerAdapter;->a:Lcom/zykj/mistake/activity/MistakeDetailActivity;

    .line 9
    .line 10
    invoke-virtual {v2, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const-string v3, "getString(...)"

    .line 15
    .line 16
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-static {v1}, Lt6/a;->n(Ljava/lang/String;)Lcom/zykj/mistake/fragment/EmptyFragment;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    sget v1, Lcom/zykj/mistake/R$string;->revised_answer_empty:I

    .line 27
    .line 28
    invoke-virtual {v2, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-static {v1}, Lt6/a;->n(Ljava/lang/String;)Lcom/zykj/mistake/fragment/EmptyFragment;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    sget v1, Lcom/zykj/mistake/R$string;->micro_class_empty:I

    .line 43
    .line 44
    invoke-virtual {v2, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-static {v1}, Lt6/a;->n(Ljava/lang/String;)Lcom/zykj/mistake/fragment/EmptyFragment;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    sget v1, Lcom/zykj/mistake/R$string;->typical_empty:I

    .line 59
    .line 60
    invoke-virtual {v2, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    invoke-static {v1}, Lt6/a;->n(Ljava/lang/String;)Lcom/zykj/mistake/fragment/EmptyFragment;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    sget v1, Lcom/zykj/mistake/R$string;->note_empty:I

    .line 75
    .line 76
    invoke-virtual {v2, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    invoke-static {v1}, Lt6/a;->n(Ljava/lang/String;)Lcom/zykj/mistake/fragment/EmptyFragment;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    return-void
.end method

.method public final c()V
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/adapter/DetailPagerAdapter;->d:Lcom/zykj/mistake/entity/resp/MistakeDetail;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "mMistakeDetail"

    .line 5
    .line 6
    if-eqz v0, :cond_e

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/zykj/mistake/entity/resp/MistakeDetail;->isShowMicroLesson()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_d

    .line 13
    .line 14
    iget-object v0, p0, Lcom/zykj/mistake/adapter/DetailPagerAdapter;->d:Lcom/zykj/mistake/entity/resp/MistakeDetail;

    .line 15
    .line 16
    if-eqz v0, :cond_c

    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/zykj/mistake/entity/resp/MistakeDetail;->getMicroClassToQuestionList()Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    :cond_0
    iget-object v0, p0, Lcom/zykj/mistake/adapter/DetailPagerAdapter;->d:Lcom/zykj/mistake/entity/resp/MistakeDetail;

    .line 31
    .line 32
    if-eqz v0, :cond_b

    .line 33
    .line 34
    invoke-virtual {v0}, Lcom/zykj/mistake/entity/resp/MistakeDetail;->getMicroClassToStudentList()Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    if-eqz v0, :cond_d

    .line 39
    .line 40
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-eqz v0, :cond_1

    .line 45
    .line 46
    goto/16 :goto_4

    .line 47
    .line 48
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    .line 49
    .line 50
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 51
    .line 52
    .line 53
    new-instance v3, Ljava/util/ArrayList;

    .line 54
    .line 55
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 56
    .line 57
    .line 58
    iget-object v4, p0, Lcom/zykj/mistake/adapter/DetailPagerAdapter;->d:Lcom/zykj/mistake/entity/resp/MistakeDetail;

    .line 59
    .line 60
    if-eqz v4, :cond_a

    .line 61
    .line 62
    invoke-virtual {v4}, Lcom/zykj/mistake/entity/resp/MistakeDetail;->getMicroClassToQuestionList()Ljava/util/List;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 71
    .line 72
    .line 73
    move-result v5

    .line 74
    if-eqz v5, :cond_2

    .line 75
    .line 76
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    check-cast v5, Lcom/zykj/mistake/entity/resp/MistakeDetail$QstMicroLessonBean;

    .line 81
    .line 82
    new-instance v6, Lcom/google/gson/g;

    .line 83
    .line 84
    invoke-direct {v6}, Lcom/google/gson/g;-><init>()V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v6, v5}, Lcom/google/gson/g;->f(Ljava/lang/Object;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v5

    .line 91
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_2
    iget-object v4, p0, Lcom/zykj/mistake/adapter/DetailPagerAdapter;->d:Lcom/zykj/mistake/entity/resp/MistakeDetail;

    .line 96
    .line 97
    if-eqz v4, :cond_9

    .line 98
    .line 99
    invoke-virtual {v4}, Lcom/zykj/mistake/entity/resp/MistakeDetail;->getMicroClassToStudentList()Ljava/util/List;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 104
    .line 105
    .line 106
    move-result-object v4

    .line 107
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 108
    .line 109
    .line 110
    move-result v5

    .line 111
    if-eqz v5, :cond_3

    .line 112
    .line 113
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v5

    .line 117
    check-cast v5, Lcom/zykj/mistake/entity/resp/MistakeDetail$QstMicroLessonBean;

    .line 118
    .line 119
    new-instance v6, Lcom/google/gson/g;

    .line 120
    .line 121
    invoke-direct {v6}, Lcom/google/gson/g;-><init>()V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v6, v5}, Lcom/google/gson/g;->f(Ljava/lang/Object;)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v5

    .line 128
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_3
    iget-object v4, p0, Lcom/zykj/mistake/adapter/DetailPagerAdapter;->d:Lcom/zykj/mistake/entity/resp/MistakeDetail;

    .line 133
    .line 134
    if-eqz v4, :cond_8

    .line 135
    .line 136
    invoke-virtual {v4}, Lcom/zykj/mistake/entity/resp/MistakeDetail;->getQuestionId()J

    .line 137
    .line 138
    .line 139
    move-result-wide v5

    .line 140
    const-wide/16 v7, 0x0

    .line 141
    .line 142
    cmp-long v5, v5, v7

    .line 143
    .line 144
    const-string v6, "microClassToStudentList"

    .line 145
    .line 146
    const-string v9, "microClassToQuestionList"

    .line 147
    .line 148
    if-eqz v5, :cond_7

    .line 149
    .line 150
    invoke-virtual {v4}, Lcom/zykj/mistake/entity/resp/MistakeDetail;->getExamId()J

    .line 151
    .line 152
    .line 153
    move-result-wide v4

    .line 154
    cmp-long v4, v4, v7

    .line 155
    .line 156
    if-nez v4, :cond_4

    .line 157
    .line 158
    goto :goto_2

    .line 159
    :cond_4
    iget-object v4, p0, Lcom/zykj/mistake/adapter/DetailPagerAdapter;->d:Lcom/zykj/mistake/entity/resp/MistakeDetail;

    .line 160
    .line 161
    if-eqz v4, :cond_6

    .line 162
    .line 163
    invoke-virtual {v4}, Lcom/zykj/mistake/entity/resp/MistakeDetail;->getExamId()J

    .line 164
    .line 165
    .line 166
    move-result-wide v4

    .line 167
    long-to-int v4, v4

    .line 168
    iget-object v5, p0, Lcom/zykj/mistake/adapter/DetailPagerAdapter;->d:Lcom/zykj/mistake/entity/resp/MistakeDetail;

    .line 169
    .line 170
    if-eqz v5, :cond_5

    .line 171
    .line 172
    invoke-virtual {v5}, Lcom/zykj/mistake/entity/resp/MistakeDetail;->getQuestionId()J

    .line 173
    .line 174
    .line 175
    move-result-wide v1

    .line 176
    long-to-int v1, v1

    .line 177
    new-instance v2, Landroid/os/Bundle;

    .line 178
    .line 179
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v2, v9, v0}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {v2, v6, v3}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 186
    .line 187
    .line 188
    const-string v0, "examId"

    .line 189
    .line 190
    invoke-virtual {v2, v0, v4}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 191
    .line 192
    .line 193
    const-string v0, "questionId"

    .line 194
    .line 195
    invoke-virtual {v2, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 196
    .line 197
    .line 198
    new-instance v0, Lcom/zykj/mistake/fragment/MicroClassFragment;

    .line 199
    .line 200
    invoke-direct {v0}, Lcom/zykj/mistake/fragment/MicroClassFragment;-><init>()V

    .line 201
    .line 202
    .line 203
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 204
    .line 205
    .line 206
    goto :goto_3

    .line 207
    :cond_5
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    throw v1

    .line 211
    :cond_6
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    throw v1

    .line 215
    :cond_7
    :goto_2
    new-instance v1, Landroid/os/Bundle;

    .line 216
    .line 217
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v1, v9, v0}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v1, v6, v3}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 224
    .line 225
    .line 226
    new-instance v0, Lcom/zykj/mistake/fragment/MicroClassFragment;

    .line 227
    .line 228
    invoke-direct {v0}, Lcom/zykj/mistake/fragment/MicroClassFragment;-><init>()V

    .line 229
    .line 230
    .line 231
    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 232
    .line 233
    .line 234
    :goto_3
    iget-object v1, p0, Lcom/zykj/mistake/adapter/DetailPagerAdapter;->b:Ljava/util/ArrayList;

    .line 235
    .line 236
    const/4 v2, 0x2

    .line 237
    invoke-virtual {v1, v2, v0}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    return-void

    .line 241
    :cond_8
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    throw v1

    .line 245
    :cond_9
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    throw v1

    .line 249
    :cond_a
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 250
    .line 251
    .line 252
    throw v1

    .line 253
    :cond_b
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 254
    .line 255
    .line 256
    throw v1

    .line 257
    :cond_c
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 258
    .line 259
    .line 260
    throw v1

    .line 261
    :cond_d
    :goto_4
    return-void

    .line 262
    :cond_e
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    throw v1
.end method

.method public final d()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/adapter/DetailPagerAdapter;->d:Lcom/zykj/mistake/entity/resp/MistakeDetail;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "mMistakeDetail"

    .line 5
    .line 6
    if-eqz v0, :cond_5

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/zykj/mistake/entity/resp/MistakeDetail;->getItemId()J

    .line 9
    .line 10
    .line 11
    move-result-wide v3

    .line 12
    iget-object v0, p0, Lcom/zykj/mistake/adapter/DetailPagerAdapter;->d:Lcom/zykj/mistake/entity/resp/MistakeDetail;

    .line 13
    .line 14
    if-eqz v0, :cond_4

    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/zykj/mistake/entity/resp/MistakeDetail;->getNote()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    const-string v0, ""

    .line 23
    .line 24
    :cond_0
    iget-object v5, p0, Lcom/zykj/mistake/adapter/DetailPagerAdapter;->d:Lcom/zykj/mistake/entity/resp/MistakeDetail;

    .line 25
    .line 26
    if-eqz v5, :cond_3

    .line 27
    .line 28
    invoke-virtual {v5}, Lcom/zykj/mistake/entity/resp/MistakeDetail;->getPictureNote()Ljava/util/List;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    const/4 v2, 0x0

    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    new-array v5, v2, [Ljava/lang/String;

    .line 36
    .line 37
    invoke-interface {v1, v5}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    check-cast v1, [Ljava/lang/String;

    .line 42
    .line 43
    if-nez v1, :cond_2

    .line 44
    .line 45
    :cond_1
    new-array v1, v2, [Ljava/lang/String;

    .line 46
    .line 47
    :cond_2
    new-instance v2, Landroid/os/Bundle;

    .line 48
    .line 49
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 50
    .line 51
    .line 52
    const-string v5, "itemId"

    .line 53
    .line 54
    invoke-virtual {v2, v5, v3, v4}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 55
    .line 56
    .line 57
    const-string v3, "noteUrl"

    .line 58
    .line 59
    invoke-virtual {v2, v3, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    const-string v0, "pictureNoteUrl"

    .line 63
    .line 64
    invoke-virtual {v2, v0, v1}, Landroid/os/BaseBundle;->putStringArray(Ljava/lang/String;[Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    new-instance v0, Lcom/zykj/mistake/fragment/NoteFragment;

    .line 68
    .line 69
    invoke-direct {v0}, Lcom/zykj/mistake/fragment/NoteFragment;-><init>()V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 73
    .line 74
    .line 75
    iget-object v1, p0, Lcom/zykj/mistake/adapter/DetailPagerAdapter;->b:Ljava/util/ArrayList;

    .line 76
    .line 77
    const/4 v2, 0x4

    .line 78
    invoke-virtual {v1, v2, v0}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    return-void

    .line 82
    :cond_3
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    throw v1

    .line 86
    :cond_4
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    throw v1

    .line 90
    :cond_5
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    throw v1
.end method

.method public final e()V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/adapter/DetailPagerAdapter;->d:Lcom/zykj/mistake/entity/resp/MistakeDetail;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "mMistakeDetail"

    .line 5
    .line 6
    if-eqz v0, :cond_9

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/zykj/mistake/entity/resp/MistakeDetail;->isShowMicroLesson()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_8

    .line 13
    .line 14
    iget-object v0, p0, Lcom/zykj/mistake/adapter/DetailPagerAdapter;->d:Lcom/zykj/mistake/entity/resp/MistakeDetail;

    .line 15
    .line 16
    if-eqz v0, :cond_7

    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/zykj/mistake/entity/resp/MistakeDetail;->getTypicalRightAnswers()Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    :cond_0
    iget-object v0, p0, Lcom/zykj/mistake/adapter/DetailPagerAdapter;->d:Lcom/zykj/mistake/entity/resp/MistakeDetail;

    .line 31
    .line 32
    if-eqz v0, :cond_6

    .line 33
    .line 34
    invoke-virtual {v0}, Lcom/zykj/mistake/entity/resp/MistakeDetail;->getTypicalErrorAnswers()Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    if-eqz v0, :cond_8

    .line 39
    .line 40
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-eqz v0, :cond_1

    .line 45
    .line 46
    goto/16 :goto_2

    .line 47
    .line 48
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    .line 49
    .line 50
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 51
    .line 52
    .line 53
    new-instance v3, Ljava/util/ArrayList;

    .line 54
    .line 55
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 56
    .line 57
    .line 58
    iget-object v4, p0, Lcom/zykj/mistake/adapter/DetailPagerAdapter;->d:Lcom/zykj/mistake/entity/resp/MistakeDetail;

    .line 59
    .line 60
    if-eqz v4, :cond_5

    .line 61
    .line 62
    invoke-virtual {v4}, Lcom/zykj/mistake/entity/resp/MistakeDetail;->getTypicalRightAnswers()Ljava/util/List;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    if-eqz v4, :cond_2

    .line 67
    .line 68
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 73
    .line 74
    .line 75
    move-result v5

    .line 76
    if-eqz v5, :cond_2

    .line 77
    .line 78
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v5

    .line 82
    check-cast v5, Lcom/zykj/mistake/entity/resp/MistakeDetail$QstAnswerBean;

    .line 83
    .line 84
    new-instance v6, Lcom/google/gson/g;

    .line 85
    .line 86
    invoke-direct {v6}, Lcom/google/gson/g;-><init>()V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v6, v5}, Lcom/google/gson/g;->f(Ljava/lang/Object;)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_2
    iget-object v4, p0, Lcom/zykj/mistake/adapter/DetailPagerAdapter;->d:Lcom/zykj/mistake/entity/resp/MistakeDetail;

    .line 98
    .line 99
    if-eqz v4, :cond_4

    .line 100
    .line 101
    invoke-virtual {v4}, Lcom/zykj/mistake/entity/resp/MistakeDetail;->getTypicalErrorAnswers()Ljava/util/List;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    if-eqz v1, :cond_3

    .line 106
    .line 107
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 112
    .line 113
    .line 114
    move-result v2

    .line 115
    if-eqz v2, :cond_3

    .line 116
    .line 117
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    check-cast v2, Lcom/zykj/mistake/entity/resp/MistakeDetail$QstAnswerBean;

    .line 122
    .line 123
    new-instance v4, Lcom/google/gson/g;

    .line 124
    .line 125
    invoke-direct {v4}, Lcom/google/gson/g;-><init>()V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v4, v2}, Lcom/google/gson/g;->f(Ljava/lang/Object;)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    goto :goto_1

    .line 136
    :cond_3
    new-instance v1, Landroid/os/Bundle;

    .line 137
    .line 138
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 139
    .line 140
    .line 141
    const-string v2, "typicalRightAnswers"

    .line 142
    .line 143
    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 144
    .line 145
    .line 146
    const-string v0, "typicalErrorAnswers"

    .line 147
    .line 148
    invoke-virtual {v1, v0, v3}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 149
    .line 150
    .line 151
    new-instance v0, Lcom/zykj/mistake/fragment/TypicalAnswerFragment;

    .line 152
    .line 153
    invoke-direct {v0}, Lcom/zykj/mistake/fragment/TypicalAnswerFragment;-><init>()V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 157
    .line 158
    .line 159
    iget-object v1, p0, Lcom/zykj/mistake/adapter/DetailPagerAdapter;->b:Ljava/util/ArrayList;

    .line 160
    .line 161
    const/4 v2, 0x3

    .line 162
    invoke-virtual {v1, v2, v0}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    return-void

    .line 166
    :cond_4
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    throw v1

    .line 170
    :cond_5
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    throw v1

    .line 174
    :cond_6
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    throw v1

    .line 178
    :cond_7
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    throw v1

    .line 182
    :cond_8
    :goto_2
    return-void

    .line 183
    :cond_9
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    throw v1
.end method

.method public final f(Lcom/zykj/mistake/entity/resp/MistakeDetail;)V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/zykj/mistake/adapter/DetailPagerAdapter;->e:Z

    .line 3
    .line 4
    invoke-virtual {p1}, Lcom/zykj/mistake/entity/resp/MistakeDetail;->getAnswerInfos()Ljava/util/ArrayList;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    :goto_0
    if-ge v0, v2, :cond_0

    .line 13
    .line 14
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    add-int/lit8 v0, v0, 0x1

    .line 19
    .line 20
    check-cast v3, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;

    .line 21
    .line 22
    invoke-virtual {v3}, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;->getNumber()I

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    invoke-virtual {v3, v4}, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;->setIndex(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Lcom/zykj/mistake/entity/resp/MistakeDetail;->getItemType()I

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    invoke-virtual {v3, v4}, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;->setItemType(I)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    iput-object p1, p0, Lcom/zykj/mistake/adapter/DetailPagerAdapter;->d:Lcom/zykj/mistake/entity/resp/MistakeDetail;

    .line 42
    .line 43
    invoke-virtual {p0}, Lcom/zykj/mistake/adapter/DetailPagerAdapter;->b()V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, Lcom/zykj/mistake/adapter/DetailPagerAdapter;->a()V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Lcom/zykj/mistake/adapter/DetailPagerAdapter;->c()V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0}, Lcom/zykj/mistake/adapter/DetailPagerAdapter;->e()V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0}, Lcom/zykj/mistake/adapter/DetailPagerAdapter;->d()V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0}, Landroidx/viewpager/widget/PagerAdapter;->notifyDataSetChanged()V

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method public final getCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/adapter/DetailPagerAdapter;->b:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final getItem(I)Landroidx/fragment/app/Fragment;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/adapter/DetailPagerAdapter;->b:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const-string v0, "get(...)"

    .line 8
    .line 9
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    check-cast p1, Landroidx/fragment/app/Fragment;

    .line 13
    .line 14
    return-object p1
.end method

.method public final getItemPosition(Ljava/lang/Object;)I
    .locals 1

    const-string v0, "object"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, -0x2

    return p1
.end method

.method public final getPageTitle(I)Ljava/lang/CharSequence;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/adapter/DetailPagerAdapter;->c:[Ljava/lang/String;

    .line 2
    .line 3
    aget-object p1, v0, p1

    .line 4
    .line 5
    return-object p1
.end method
