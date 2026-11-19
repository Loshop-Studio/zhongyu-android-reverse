.class public final Lcom/zykj/mistake/fragment/TypicalAnswerFragment;
.super Lcom/zykj/mistake/base/BaseFragment;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/zykj/mistake/base/BaseFragment<",
        "Lcom/zykj/mistake/databinding/FragmentTypicalAnswerBinding;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Lcom/zykj/mistake/fragment/TypicalAnswerFragment;",
        "Lcom/zykj/mistake/base/BaseFragment;",
        "Lcom/zykj/mistake/databinding/FragmentTypicalAnswerBinding;",
        "<init>",
        "()V",
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
        "SMAP\nTypicalAnswerFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypicalAnswerFragment.kt\ncom/zykj/mistake/fragment/TypicalAnswerFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,154:1\n1869#2,2:155\n1869#2,2:157\n1869#2,2:159\n1869#2,2:161\n*S KotlinDebug\n*F\n+ 1 TypicalAnswerFragment.kt\ncom/zykj/mistake/fragment/TypicalAnswerFragment\n*L\n54#1:155,2\n59#1:157,2\n77#1:159,2\n110#1:161,2\n*E\n"
    }
.end annotation


# instance fields
.field public final b:Ljava/util/ArrayList;

.field public final c:Ljava/util/ArrayList;

.field public d:Landroid/widget/LinearLayout;

.field public e:Landroid/widget/LinearLayout;

.field public f:Landroid/widget/LinearLayout;

.field public g:Landroid/widget/LinearLayout;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/zykj/mistake/base/BaseFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/zykj/mistake/fragment/TypicalAnswerFragment;->b:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/zykj/mistake/fragment/TypicalAnswerFragment;->c:Ljava/util/ArrayList;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final e()I
    .locals 1

    .line 1
    sget v0, Lcom/zykj/mistake/R$layout;->fragment_typical_answer:I

    .line 2
    .line 3
    return v0
.end method

.method public final g(Landroid/view/View;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    sget v2, Lcom/zykj/mistake/R$id;->ll_right:I

    .line 6
    .line 7
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    const-string v3, "findViewById(...)"

    .line 12
    .line 13
    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    check-cast v2, Landroid/widget/LinearLayout;

    .line 17
    .line 18
    iput-object v2, v0, Lcom/zykj/mistake/fragment/TypicalAnswerFragment;->d:Landroid/widget/LinearLayout;

    .line 19
    .line 20
    sget v2, Lcom/zykj/mistake/R$id;->ll_wrong:I

    .line 21
    .line 22
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    check-cast v2, Landroid/widget/LinearLayout;

    .line 30
    .line 31
    iput-object v2, v0, Lcom/zykj/mistake/fragment/TypicalAnswerFragment;->e:Landroid/widget/LinearLayout;

    .line 32
    .line 33
    sget v2, Lcom/zykj/mistake/R$id;->ll_right_container:I

    .line 34
    .line 35
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    check-cast v2, Landroid/widget/LinearLayout;

    .line 43
    .line 44
    iput-object v2, v0, Lcom/zykj/mistake/fragment/TypicalAnswerFragment;->f:Landroid/widget/LinearLayout;

    .line 45
    .line 46
    sget v2, Lcom/zykj/mistake/R$id;->ll_wrong_container:I

    .line 47
    .line 48
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    check-cast v1, Landroid/widget/LinearLayout;

    .line 56
    .line 57
    iput-object v1, v0, Lcom/zykj/mistake/fragment/TypicalAnswerFragment;->g:Landroid/widget/LinearLayout;

    .line 58
    .line 59
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->requireArguments()Landroid/os/Bundle;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    const-string v2, "typicalRightAnswers"

    .line 64
    .line 65
    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->requireArguments()Landroid/os/Bundle;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    const-string v3, "typicalErrorAnswers"

    .line 74
    .line 75
    invoke-virtual {v2, v3}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    const-class v3, Lcom/zykj/mistake/entity/resp/MistakeDetail$QstAnswerBean;

    .line 80
    .line 81
    iget-object v4, v0, Lcom/zykj/mistake/fragment/TypicalAnswerFragment;->b:Ljava/util/ArrayList;

    .line 82
    .line 83
    if-eqz v1, :cond_0

    .line 84
    .line 85
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 86
    .line 87
    .line 88
    move-result v6

    .line 89
    const/4 v7, 0x0

    .line 90
    :goto_0
    if-ge v7, v6, :cond_0

    .line 91
    .line 92
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v8

    .line 96
    add-int/lit8 v7, v7, 0x1

    .line 97
    .line 98
    check-cast v8, Ljava/lang/String;

    .line 99
    .line 100
    new-instance v9, Lcom/google/gson/g;

    .line 101
    .line 102
    invoke-direct {v9}, Lcom/google/gson/g;-><init>()V

    .line 103
    .line 104
    .line 105
    new-instance v10, Lk1/a;

    .line 106
    .line 107
    invoke-direct {v10, v3}, Lk1/a;-><init>(Ljava/lang/reflect/Type;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v9, v8, v10}, Lcom/google/gson/g;->c(Ljava/lang/String;Lk1/a;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v8

    .line 114
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    goto :goto_0

    .line 118
    :cond_0
    iget-object v1, v0, Lcom/zykj/mistake/fragment/TypicalAnswerFragment;->c:Ljava/util/ArrayList;

    .line 119
    .line 120
    if-eqz v2, :cond_1

    .line 121
    .line 122
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 123
    .line 124
    .line 125
    move-result v6

    .line 126
    const/4 v7, 0x0

    .line 127
    :goto_1
    if-ge v7, v6, :cond_1

    .line 128
    .line 129
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v8

    .line 133
    add-int/lit8 v7, v7, 0x1

    .line 134
    .line 135
    check-cast v8, Ljava/lang/String;

    .line 136
    .line 137
    new-instance v9, Lcom/google/gson/g;

    .line 138
    .line 139
    invoke-direct {v9}, Lcom/google/gson/g;-><init>()V

    .line 140
    .line 141
    .line 142
    new-instance v10, Lk1/a;

    .line 143
    .line 144
    invoke-direct {v10, v3}, Lk1/a;-><init>(Ljava/lang/reflect/Type;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v9, v8, v10}, Lcom/google/gson/g;->c(Ljava/lang/String;Lk1/a;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v8

    .line 151
    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    goto :goto_1

    .line 155
    :cond_1
    const-string v6, "inflate(...)"

    .line 156
    .line 157
    const-string v7, "rightContent"

    .line 158
    .line 159
    if-eqz v4, :cond_2

    .line 160
    .line 161
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 162
    .line 163
    .line 164
    move-result v8

    .line 165
    if-eqz v8, :cond_3

    .line 166
    .line 167
    :cond_2
    const/16 p1, 0x0

    .line 168
    .line 169
    goto/16 :goto_4

    .line 170
    .line 171
    :cond_3
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 172
    .line 173
    .line 174
    move-result v8

    .line 175
    const/4 v9, 0x0

    .line 176
    :goto_2
    if-ge v9, v8, :cond_8

    .line 177
    .line 178
    invoke-virtual {v4, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v10

    .line 182
    add-int/lit8 v9, v9, 0x1

    .line 183
    .line 184
    check-cast v10, Lcom/zykj/mistake/entity/resp/MistakeDetail$QstAnswerBean;

    .line 185
    .line 186
    invoke-virtual {v10}, Lcom/zykj/mistake/entity/resp/MistakeDetail$QstAnswerBean;->getAnswers()Ljava/util/ArrayList;

    .line 187
    .line 188
    .line 189
    move-result-object v11

    .line 190
    invoke-virtual {v10}, Lcom/zykj/mistake/entity/resp/MistakeDetail$QstAnswerBean;->getComments()Ljava/util/ArrayList;

    .line 191
    .line 192
    .line 193
    move-result-object v12

    .line 194
    if-eqz v11, :cond_4

    .line 195
    .line 196
    invoke-interface {v11}, Ljava/util/Collection;->isEmpty()Z

    .line 197
    .line 198
    .line 199
    move-result v13

    .line 200
    if-eqz v13, :cond_5

    .line 201
    .line 202
    :cond_4
    const/16 p1, 0x0

    .line 203
    .line 204
    goto :goto_2

    .line 205
    :cond_5
    invoke-interface {v11}, Ljava/util/Collection;->size()I

    .line 206
    .line 207
    .line 208
    move-result v13

    .line 209
    const/4 v14, 0x0

    .line 210
    :goto_3
    if-ge v14, v13, :cond_4

    .line 211
    .line 212
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 213
    .line 214
    .line 215
    move-result-object v15

    .line 216
    invoke-static {v15}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 217
    .line 218
    .line 219
    move-result-object v15

    .line 220
    const/16 p1, 0x0

    .line 221
    .line 222
    iget-object v2, v0, Lcom/zykj/mistake/fragment/TypicalAnswerFragment;->f:Landroid/widget/LinearLayout;

    .line 223
    .line 224
    const-string v16, "rightContainer"

    .line 225
    .line 226
    if-eqz v2, :cond_7

    .line 227
    .line 228
    invoke-static {v15, v2}, Lcom/zykj/mistake/databinding/ItemMicroSessionsBinding;->a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lcom/zykj/mistake/databinding/ItemMicroSessionsBinding;

    .line 229
    .line 230
    .line 231
    move-result-object v2

    .line 232
    invoke-static {v2, v6}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    invoke-static {v0}, Lcom/bumptech/glide/b;->f(Landroidx/fragment/app/Fragment;)Lcom/bumptech/glide/h;

    .line 236
    .line 237
    .line 238
    move-result-object v15

    .line 239
    invoke-virtual {v11, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object v17

    .line 243
    move-object/from16 v3, v17

    .line 244
    .line 245
    check-cast v3, Ljava/lang/String;

    .line 246
    .line 247
    invoke-virtual {v15, v3}, Lcom/bumptech/glide/h;->l(Ljava/lang/String;)Lcom/bumptech/glide/f;

    .line 248
    .line 249
    .line 250
    move-result-object v3

    .line 251
    new-instance v15, Lr0/d;

    .line 252
    .line 253
    invoke-direct {v15}, Lr0/a;-><init>()V

    .line 254
    .line 255
    .line 256
    sget v5, Lcom/zykj/mistake/R$mipmap;->ic_default_micro:I

    .line 257
    .line 258
    invoke-virtual {v15, v5}, Lr0/a;->l(I)Lr0/a;

    .line 259
    .line 260
    .line 261
    move-result-object v5

    .line 262
    invoke-virtual {v3, v5}, Lcom/bumptech/glide/f;->w(Lr0/a;)Lcom/bumptech/glide/f;

    .line 263
    .line 264
    .line 265
    move-result-object v3

    .line 266
    iget-object v5, v2, Lcom/zykj/mistake/databinding/ItemMicroSessionsBinding;->a:Landroid/widget/ImageView;

    .line 267
    .line 268
    invoke-virtual {v3, v5}, Lcom/bumptech/glide/f;->y(Landroid/widget/ImageView;)V

    .line 269
    .line 270
    .line 271
    iget-object v3, v2, Lcom/zykj/mistake/databinding/ItemMicroSessionsBinding;->b:Landroid/widget/TextView;

    .line 272
    .line 273
    invoke-virtual {v10}, Lcom/zykj/mistake/entity/resp/MistakeDetail$QstAnswerBean;->getFullname()Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v5

    .line 277
    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {v2}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 281
    .line 282
    .line 283
    move-result-object v3

    .line 284
    new-instance v5, Lq4/m;

    .line 285
    .line 286
    invoke-direct {v5, v0, v11, v14, v12}, Lq4/m;-><init>(Lcom/zykj/mistake/fragment/TypicalAnswerFragment;Ljava/util/ArrayList;ILjava/util/ArrayList;)V

    .line 287
    .line 288
    .line 289
    invoke-virtual {v3, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 290
    .line 291
    .line 292
    iget-object v3, v0, Lcom/zykj/mistake/fragment/TypicalAnswerFragment;->f:Landroid/widget/LinearLayout;

    .line 293
    .line 294
    if-eqz v3, :cond_6

    .line 295
    .line 296
    invoke-virtual {v2}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 297
    .line 298
    .line 299
    move-result-object v2

    .line 300
    invoke-virtual {v3, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 301
    .line 302
    .line 303
    add-int/lit8 v14, v14, 0x1

    .line 304
    .line 305
    goto :goto_3

    .line 306
    :cond_6
    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 307
    .line 308
    .line 309
    throw p1

    .line 310
    :cond_7
    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 311
    .line 312
    .line 313
    throw p1

    .line 314
    :cond_8
    const/16 p1, 0x0

    .line 315
    .line 316
    iget-object v2, v0, Lcom/zykj/mistake/fragment/TypicalAnswerFragment;->d:Landroid/widget/LinearLayout;

    .line 317
    .line 318
    if-eqz v2, :cond_9

    .line 319
    .line 320
    const/4 v3, 0x0

    .line 321
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 322
    .line 323
    .line 324
    goto :goto_5

    .line 325
    :cond_9
    invoke-static {v7}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 326
    .line 327
    .line 328
    throw p1

    .line 329
    :goto_4
    iget-object v2, v0, Lcom/zykj/mistake/fragment/TypicalAnswerFragment;->d:Landroid/widget/LinearLayout;

    .line 330
    .line 331
    if-eqz v2, :cond_13

    .line 332
    .line 333
    const/16 v3, 0x8

    .line 334
    .line 335
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 336
    .line 337
    .line 338
    :goto_5
    const-string v2, "wrongContent"

    .line 339
    .line 340
    if-eqz v1, :cond_11

    .line 341
    .line 342
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 343
    .line 344
    .line 345
    move-result v3

    .line 346
    if-eqz v3, :cond_a

    .line 347
    .line 348
    goto/16 :goto_8

    .line 349
    .line 350
    :cond_a
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 351
    .line 352
    .line 353
    move-result v3

    .line 354
    const/4 v4, 0x0

    .line 355
    :cond_b
    :goto_6
    if-ge v4, v3, :cond_f

    .line 356
    .line 357
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 358
    .line 359
    .line 360
    move-result-object v5

    .line 361
    add-int/lit8 v4, v4, 0x1

    .line 362
    .line 363
    check-cast v5, Lcom/zykj/mistake/entity/resp/MistakeDetail$QstAnswerBean;

    .line 364
    .line 365
    invoke-virtual {v5}, Lcom/zykj/mistake/entity/resp/MistakeDetail$QstAnswerBean;->getAnswers()Ljava/util/ArrayList;

    .line 366
    .line 367
    .line 368
    move-result-object v7

    .line 369
    invoke-virtual {v5}, Lcom/zykj/mistake/entity/resp/MistakeDetail$QstAnswerBean;->getComments()Ljava/util/ArrayList;

    .line 370
    .line 371
    .line 372
    move-result-object v8

    .line 373
    if-eqz v7, :cond_b

    .line 374
    .line 375
    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    .line 376
    .line 377
    .line 378
    move-result v9

    .line 379
    if-eqz v9, :cond_c

    .line 380
    .line 381
    goto :goto_6

    .line 382
    :cond_c
    invoke-interface {v7}, Ljava/util/Collection;->size()I

    .line 383
    .line 384
    .line 385
    move-result v9

    .line 386
    const/4 v10, 0x0

    .line 387
    :goto_7
    if-ge v10, v9, :cond_b

    .line 388
    .line 389
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 390
    .line 391
    .line 392
    move-result-object v11

    .line 393
    invoke-static {v11}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 394
    .line 395
    .line 396
    move-result-object v11

    .line 397
    iget-object v12, v0, Lcom/zykj/mistake/fragment/TypicalAnswerFragment;->g:Landroid/widget/LinearLayout;

    .line 398
    .line 399
    const-string v13, "wrongContainer"

    .line 400
    .line 401
    if-eqz v12, :cond_e

    .line 402
    .line 403
    invoke-static {v11, v12}, Lcom/zykj/mistake/databinding/ItemMicroSessionsBinding;->a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lcom/zykj/mistake/databinding/ItemMicroSessionsBinding;

    .line 404
    .line 405
    .line 406
    move-result-object v11

    .line 407
    invoke-static {v11, v6}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 408
    .line 409
    .line 410
    invoke-static {v0}, Lcom/bumptech/glide/b;->f(Landroidx/fragment/app/Fragment;)Lcom/bumptech/glide/h;

    .line 411
    .line 412
    .line 413
    move-result-object v12

    .line 414
    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 415
    .line 416
    .line 417
    move-result-object v14

    .line 418
    check-cast v14, Ljava/lang/String;

    .line 419
    .line 420
    invoke-virtual {v12, v14}, Lcom/bumptech/glide/h;->l(Ljava/lang/String;)Lcom/bumptech/glide/f;

    .line 421
    .line 422
    .line 423
    move-result-object v12

    .line 424
    new-instance v14, Lr0/d;

    .line 425
    .line 426
    invoke-direct {v14}, Lr0/a;-><init>()V

    .line 427
    .line 428
    .line 429
    sget v15, Lcom/zykj/mistake/R$mipmap;->ic_default_micro:I

    .line 430
    .line 431
    invoke-virtual {v14, v15}, Lr0/a;->l(I)Lr0/a;

    .line 432
    .line 433
    .line 434
    move-result-object v14

    .line 435
    invoke-virtual {v12, v14}, Lcom/bumptech/glide/f;->w(Lr0/a;)Lcom/bumptech/glide/f;

    .line 436
    .line 437
    .line 438
    move-result-object v12

    .line 439
    iget-object v14, v11, Lcom/zykj/mistake/databinding/ItemMicroSessionsBinding;->a:Landroid/widget/ImageView;

    .line 440
    .line 441
    invoke-virtual {v12, v14}, Lcom/bumptech/glide/f;->y(Landroid/widget/ImageView;)V

    .line 442
    .line 443
    .line 444
    iget-object v12, v11, Lcom/zykj/mistake/databinding/ItemMicroSessionsBinding;->b:Landroid/widget/TextView;

    .line 445
    .line 446
    invoke-virtual {v5}, Lcom/zykj/mistake/entity/resp/MistakeDetail$QstAnswerBean;->getFullname()Ljava/lang/String;

    .line 447
    .line 448
    .line 449
    move-result-object v14

    .line 450
    invoke-virtual {v12, v14}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 451
    .line 452
    .line 453
    invoke-virtual {v11}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 454
    .line 455
    .line 456
    move-result-object v12

    .line 457
    new-instance v14, Lq4/m;

    .line 458
    .line 459
    invoke-direct {v14, v10, v8, v0, v7}, Lq4/m;-><init>(ILjava/util/ArrayList;Lcom/zykj/mistake/fragment/TypicalAnswerFragment;Ljava/util/ArrayList;)V

    .line 460
    .line 461
    .line 462
    invoke-virtual {v12, v14}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 463
    .line 464
    .line 465
    iget-object v12, v0, Lcom/zykj/mistake/fragment/TypicalAnswerFragment;->g:Landroid/widget/LinearLayout;

    .line 466
    .line 467
    if-eqz v12, :cond_d

    .line 468
    .line 469
    invoke-virtual {v11}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 470
    .line 471
    .line 472
    move-result-object v11

    .line 473
    invoke-virtual {v12, v11}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 474
    .line 475
    .line 476
    add-int/lit8 v10, v10, 0x1

    .line 477
    .line 478
    goto :goto_7

    .line 479
    :cond_d
    invoke-static {v13}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 480
    .line 481
    .line 482
    throw p1

    .line 483
    :cond_e
    invoke-static {v13}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 484
    .line 485
    .line 486
    throw p1

    .line 487
    :cond_f
    iget-object v1, v0, Lcom/zykj/mistake/fragment/TypicalAnswerFragment;->e:Landroid/widget/LinearLayout;

    .line 488
    .line 489
    if-eqz v1, :cond_10

    .line 490
    .line 491
    const/4 v3, 0x0

    .line 492
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 493
    .line 494
    .line 495
    return-void

    .line 496
    :cond_10
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 497
    .line 498
    .line 499
    throw p1

    .line 500
    :cond_11
    :goto_8
    iget-object v1, v0, Lcom/zykj/mistake/fragment/TypicalAnswerFragment;->e:Landroid/widget/LinearLayout;

    .line 501
    .line 502
    if-eqz v1, :cond_12

    .line 503
    .line 504
    const/16 v3, 0x8

    .line 505
    .line 506
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 507
    .line 508
    .line 509
    return-void

    .line 510
    :cond_12
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 511
    .line 512
    .line 513
    throw p1

    .line 514
    :cond_13
    invoke-static {v7}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 515
    .line 516
    .line 517
    throw p1
.end method

.method public final h(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/zykj/mistake/dialog/AnswerDialogFragment;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/zykj/mistake/dialog/AnswerDialogFragment;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    const-string v2, "requireActivity(...)"

    .line 11
    .line 12
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    if-eqz p2, :cond_1

    .line 16
    .line 17
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-nez v2, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-virtual {p2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-nez v2, :cond_1

    .line 29
    .line 30
    const/4 v2, 0x1

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    :goto_0
    const/4 v2, 0x0

    .line 33
    :goto_1
    invoke-virtual {v0, v1, p1, p2, v2}, Lcom/zykj/mistake/dialog/AnswerDialogFragment;->l(Landroidx/fragment/app/FragmentActivity;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 34
    .line 35
    .line 36
    return-void
.end method
