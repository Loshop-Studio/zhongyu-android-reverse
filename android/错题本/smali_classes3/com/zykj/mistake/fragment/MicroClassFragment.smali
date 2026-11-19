.class public final Lcom/zykj/mistake/fragment/MicroClassFragment;
.super Lcom/zykj/mistake/base/BaseFragment;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/zykj/mistake/base/BaseFragment<",
        "Lcom/zykj/mistake/databinding/FragmentMicroClassBinding;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Lcom/zykj/mistake/fragment/MicroClassFragment;",
        "Lcom/zykj/mistake/base/BaseFragment;",
        "Lcom/zykj/mistake/databinding/FragmentMicroClassBinding;",
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
        "SMAP\nMicroClassFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MicroClassFragment.kt\ncom/zykj/mistake/fragment/MicroClassFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,177:1\n1869#2,2:178\n1869#2,2:180\n1869#2,2:182\n774#2:184\n865#2,2:185\n1869#2,2:187\n774#2:189\n865#2,2:190\n1869#2,2:192\n*S KotlinDebug\n*F\n+ 1 MicroClassFragment.kt\ncom/zykj/mistake/fragment/MicroClassFragment\n*L\n70#1:178,2\n75#1:180,2\n96#1:182,2\n123#1:184\n123#1:185,2\n127#1:187,2\n152#1:189\n152#1:190,2\n156#1:192,2\n*E\n"
    }
.end annotation


# instance fields
.field public final b:Ljava/util/ArrayList;

.field public final c:Ljava/util/ArrayList;

.field public d:Landroid/widget/LinearLayout;

.field public e:Landroid/widget/LinearLayout;

.field public f:Landroid/widget/LinearLayout;

.field public g:Landroid/widget/LinearLayout;

.field public h:Landroid/widget/LinearLayout;

.field public i:Landroid/widget/LinearLayout;


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
    iput-object v0, p0, Lcom/zykj/mistake/fragment/MicroClassFragment;->b:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/zykj/mistake/fragment/MicroClassFragment;->c:Ljava/util/ArrayList;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final e()I
    .locals 1

    .line 1
    sget v0, Lcom/zykj/mistake/R$layout;->fragment_micro_class:I

    .line 2
    .line 3
    return v0
.end method

.method public final g(Landroid/view/View;)V
    .locals 14

    .line 1
    sget v0, Lcom/zykj/mistake/R$id;->ll_answer:I

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "findViewById(...)"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    check-cast v0, Landroid/widget/LinearLayout;

    .line 13
    .line 14
    iput-object v0, p0, Lcom/zykj/mistake/fragment/MicroClassFragment;->d:Landroid/widget/LinearLayout;

    .line 15
    .line 16
    sget v0, Lcom/zykj/mistake/R$id;->ll_revised:I

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    check-cast v0, Landroid/widget/LinearLayout;

    .line 26
    .line 27
    iput-object v0, p0, Lcom/zykj/mistake/fragment/MicroClassFragment;->e:Landroid/widget/LinearLayout;

    .line 28
    .line 29
    sget v0, Lcom/zykj/mistake/R$id;->ll_one2one:I

    .line 30
    .line 31
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    check-cast v0, Landroid/widget/LinearLayout;

    .line 39
    .line 40
    iput-object v0, p0, Lcom/zykj/mistake/fragment/MicroClassFragment;->f:Landroid/widget/LinearLayout;

    .line 41
    .line 42
    sget v0, Lcom/zykj/mistake/R$id;->ll_screen:I

    .line 43
    .line 44
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    check-cast v0, Landroid/widget/LinearLayout;

    .line 52
    .line 53
    sget v0, Lcom/zykj/mistake/R$id;->ll_answer_container:I

    .line 54
    .line 55
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    check-cast v0, Landroid/widget/LinearLayout;

    .line 63
    .line 64
    iput-object v0, p0, Lcom/zykj/mistake/fragment/MicroClassFragment;->g:Landroid/widget/LinearLayout;

    .line 65
    .line 66
    sget v0, Lcom/zykj/mistake/R$id;->ll_revised_container:I

    .line 67
    .line 68
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    check-cast v0, Landroid/widget/LinearLayout;

    .line 76
    .line 77
    iput-object v0, p0, Lcom/zykj/mistake/fragment/MicroClassFragment;->h:Landroid/widget/LinearLayout;

    .line 78
    .line 79
    sget v0, Lcom/zykj/mistake/R$id;->ll_one2one_container:I

    .line 80
    .line 81
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    check-cast v0, Landroid/widget/LinearLayout;

    .line 89
    .line 90
    iput-object v0, p0, Lcom/zykj/mistake/fragment/MicroClassFragment;->i:Landroid/widget/LinearLayout;

    .line 91
    .line 92
    sget v0, Lcom/zykj/mistake/R$id;->ll_screen_container:I

    .line 93
    .line 94
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    check-cast p1, Landroid/widget/LinearLayout;

    .line 102
    .line 103
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireArguments()Landroid/os/Bundle;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    const-string v0, "microClassToQuestionList"

    .line 108
    .line 109
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireArguments()Landroid/os/Bundle;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    const-string v1, "microClassToStudentList"

    .line 118
    .line 119
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    const-class v1, Lcom/zykj/mistake/entity/resp/MistakeDetail$QstMicroLessonBean;

    .line 124
    .line 125
    iget-object v2, p0, Lcom/zykj/mistake/fragment/MicroClassFragment;->b:Ljava/util/ArrayList;

    .line 126
    .line 127
    const/4 v3, 0x0

    .line 128
    if-eqz p1, :cond_0

    .line 129
    .line 130
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 131
    .line 132
    .line 133
    move-result v4

    .line 134
    move v5, v3

    .line 135
    :goto_0
    if-ge v5, v4, :cond_0

    .line 136
    .line 137
    invoke-virtual {p1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v6

    .line 141
    add-int/lit8 v5, v5, 0x1

    .line 142
    .line 143
    check-cast v6, Ljava/lang/String;

    .line 144
    .line 145
    new-instance v7, Lcom/google/gson/g;

    .line 146
    .line 147
    invoke-direct {v7}, Lcom/google/gson/g;-><init>()V

    .line 148
    .line 149
    .line 150
    new-instance v8, Lk1/a;

    .line 151
    .line 152
    invoke-direct {v8, v1}, Lk1/a;-><init>(Ljava/lang/reflect/Type;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v7, v6, v8}, Lcom/google/gson/g;->c(Ljava/lang/String;Lk1/a;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v6

    .line 159
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    goto :goto_0

    .line 163
    :cond_0
    iget-object p1, p0, Lcom/zykj/mistake/fragment/MicroClassFragment;->c:Ljava/util/ArrayList;

    .line 164
    .line 165
    if-eqz v0, :cond_1

    .line 166
    .line 167
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 168
    .line 169
    .line 170
    move-result v4

    .line 171
    move v5, v3

    .line 172
    :goto_1
    if-ge v5, v4, :cond_1

    .line 173
    .line 174
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v6

    .line 178
    add-int/lit8 v5, v5, 0x1

    .line 179
    .line 180
    check-cast v6, Ljava/lang/String;

    .line 181
    .line 182
    new-instance v7, Lcom/google/gson/g;

    .line 183
    .line 184
    invoke-direct {v7}, Lcom/google/gson/g;-><init>()V

    .line 185
    .line 186
    .line 187
    new-instance v8, Lk1/a;

    .line 188
    .line 189
    invoke-direct {v8, v1}, Lk1/a;-><init>(Ljava/lang/reflect/Type;)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v7, v6, v8}, Lcom/google/gson/g;->c(Ljava/lang/String;Lk1/a;)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v6

    .line 196
    invoke-virtual {p1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 197
    .line 198
    .line 199
    goto :goto_1

    .line 200
    :cond_1
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 201
    .line 202
    .line 203
    move-result v0

    .line 204
    const/4 v1, 0x0

    .line 205
    const-string v4, "inflate(...)"

    .line 206
    .line 207
    const/16 v5, 0x8

    .line 208
    .line 209
    const-string v6, "answerContent"

    .line 210
    .line 211
    if-eqz v0, :cond_3

    .line 212
    .line 213
    iget-object v0, p0, Lcom/zykj/mistake/fragment/MicroClassFragment;->d:Landroid/widget/LinearLayout;

    .line 214
    .line 215
    if-eqz v0, :cond_2

    .line 216
    .line 217
    invoke-virtual {v0, v5}, Landroid/view/View;->setVisibility(I)V

    .line 218
    .line 219
    .line 220
    goto/16 :goto_3

    .line 221
    .line 222
    :cond_2
    invoke-static {v6}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    throw v1

    .line 226
    :cond_3
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 227
    .line 228
    .line 229
    move-result v0

    .line 230
    move v7, v3

    .line 231
    :goto_2
    if-ge v7, v0, :cond_6

    .line 232
    .line 233
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object v8

    .line 237
    add-int/lit8 v7, v7, 0x1

    .line 238
    .line 239
    check-cast v8, Lcom/zykj/mistake/entity/resp/MistakeDetail$QstMicroLessonBean;

    .line 240
    .line 241
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 242
    .line 243
    .line 244
    move-result-object v9

    .line 245
    invoke-static {v9}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 246
    .line 247
    .line 248
    move-result-object v9

    .line 249
    iget-object v10, p0, Lcom/zykj/mistake/fragment/MicroClassFragment;->g:Landroid/widget/LinearLayout;

    .line 250
    .line 251
    const-string v11, "answerContainer"

    .line 252
    .line 253
    if-eqz v10, :cond_5

    .line 254
    .line 255
    invoke-static {v9, v10}, Lcom/zykj/mistake/databinding/ItemMicroSessionsBinding;->a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lcom/zykj/mistake/databinding/ItemMicroSessionsBinding;

    .line 256
    .line 257
    .line 258
    move-result-object v9

    .line 259
    invoke-static {v9, v4}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    invoke-static {p0}, Lcom/bumptech/glide/b;->f(Landroidx/fragment/app/Fragment;)Lcom/bumptech/glide/h;

    .line 263
    .line 264
    .line 265
    move-result-object v10

    .line 266
    invoke-virtual {v8}, Lcom/zykj/mistake/entity/resp/MistakeDetail$QstMicroLessonBean;->getSnapshot()Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v12

    .line 270
    invoke-virtual {v10, v12}, Lcom/bumptech/glide/h;->l(Ljava/lang/String;)Lcom/bumptech/glide/f;

    .line 271
    .line 272
    .line 273
    move-result-object v10

    .line 274
    new-instance v12, Lr0/d;

    .line 275
    .line 276
    invoke-direct {v12}, Lr0/a;-><init>()V

    .line 277
    .line 278
    .line 279
    sget v13, Lcom/zykj/mistake/R$mipmap;->ic_default_micro:I

    .line 280
    .line 281
    invoke-virtual {v12, v13}, Lr0/a;->l(I)Lr0/a;

    .line 282
    .line 283
    .line 284
    move-result-object v12

    .line 285
    invoke-virtual {v10, v12}, Lcom/bumptech/glide/f;->w(Lr0/a;)Lcom/bumptech/glide/f;

    .line 286
    .line 287
    .line 288
    move-result-object v10

    .line 289
    iget-object v12, v9, Lcom/zykj/mistake/databinding/ItemMicroSessionsBinding;->a:Landroid/widget/ImageView;

    .line 290
    .line 291
    invoke-virtual {v10, v12}, Lcom/bumptech/glide/f;->y(Landroid/widget/ImageView;)V

    .line 292
    .line 293
    .line 294
    iget-object v10, v9, Lcom/zykj/mistake/databinding/ItemMicroSessionsBinding;->b:Landroid/widget/TextView;

    .line 295
    .line 296
    invoke-virtual {v8}, Lcom/zykj/mistake/entity/resp/MistakeDetail$QstMicroLessonBean;->getName()Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object v12

    .line 300
    invoke-virtual {v10, v12}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 301
    .line 302
    .line 303
    invoke-virtual {v8}, Lcom/zykj/mistake/entity/resp/MistakeDetail$QstMicroLessonBean;->getAddress()Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object v8

    .line 307
    invoke-virtual {v9}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 308
    .line 309
    .line 310
    move-result-object v10

    .line 311
    new-instance v12, Lq4/a;

    .line 312
    .line 313
    const/4 v13, 0x1

    .line 314
    invoke-direct {v12, p0, v8, v13}, Lq4/a;-><init>(Lcom/zykj/mistake/fragment/MicroClassFragment;Ljava/lang/String;I)V

    .line 315
    .line 316
    .line 317
    invoke-virtual {v10, v12}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 318
    .line 319
    .line 320
    iget-object v8, p0, Lcom/zykj/mistake/fragment/MicroClassFragment;->g:Landroid/widget/LinearLayout;

    .line 321
    .line 322
    if-eqz v8, :cond_4

    .line 323
    .line 324
    invoke-virtual {v9}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 325
    .line 326
    .line 327
    move-result-object v9

    .line 328
    invoke-virtual {v8, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 329
    .line 330
    .line 331
    goto :goto_2

    .line 332
    :cond_4
    invoke-static {v11}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 333
    .line 334
    .line 335
    throw v1

    .line 336
    :cond_5
    invoke-static {v11}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 337
    .line 338
    .line 339
    throw v1

    .line 340
    :cond_6
    iget-object v0, p0, Lcom/zykj/mistake/fragment/MicroClassFragment;->d:Landroid/widget/LinearLayout;

    .line 341
    .line 342
    if-eqz v0, :cond_17

    .line 343
    .line 344
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 345
    .line 346
    .line 347
    :goto_3
    new-instance v0, Ljava/util/ArrayList;

    .line 348
    .line 349
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 350
    .line 351
    .line 352
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 353
    .line 354
    .line 355
    move-result v2

    .line 356
    move v6, v3

    .line 357
    :cond_7
    :goto_4
    if-ge v6, v2, :cond_8

    .line 358
    .line 359
    invoke-virtual {p1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 360
    .line 361
    .line 362
    move-result-object v7

    .line 363
    add-int/lit8 v6, v6, 0x1

    .line 364
    .line 365
    move-object v8, v7

    .line 366
    check-cast v8, Lcom/zykj/mistake/entity/resp/MistakeDetail$QstMicroLessonBean;

    .line 367
    .line 368
    invoke-virtual {v8}, Lcom/zykj/mistake/entity/resp/MistakeDetail$QstMicroLessonBean;->isRevising()Ljava/lang/Boolean;

    .line 369
    .line 370
    .line 371
    move-result-object v8

    .line 372
    sget-object v9, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 373
    .line 374
    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 375
    .line 376
    .line 377
    move-result v8

    .line 378
    if-eqz v8, :cond_7

    .line 379
    .line 380
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 381
    .line 382
    .line 383
    goto :goto_4

    .line 384
    :cond_8
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 385
    .line 386
    .line 387
    move-result v2

    .line 388
    const-string v6, "one2oneContent"

    .line 389
    .line 390
    if-eqz v2, :cond_a

    .line 391
    .line 392
    iget-object v0, p0, Lcom/zykj/mistake/fragment/MicroClassFragment;->f:Landroid/widget/LinearLayout;

    .line 393
    .line 394
    if-eqz v0, :cond_9

    .line 395
    .line 396
    invoke-virtual {v0, v5}, Landroid/view/View;->setVisibility(I)V

    .line 397
    .line 398
    .line 399
    goto/16 :goto_6

    .line 400
    .line 401
    :cond_9
    invoke-static {v6}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 402
    .line 403
    .line 404
    throw v1

    .line 405
    :cond_a
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 406
    .line 407
    .line 408
    move-result v2

    .line 409
    move v7, v3

    .line 410
    :goto_5
    if-ge v7, v2, :cond_d

    .line 411
    .line 412
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 413
    .line 414
    .line 415
    move-result-object v8

    .line 416
    add-int/lit8 v7, v7, 0x1

    .line 417
    .line 418
    check-cast v8, Lcom/zykj/mistake/entity/resp/MistakeDetail$QstMicroLessonBean;

    .line 419
    .line 420
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 421
    .line 422
    .line 423
    move-result-object v9

    .line 424
    invoke-static {v9}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 425
    .line 426
    .line 427
    move-result-object v9

    .line 428
    iget-object v10, p0, Lcom/zykj/mistake/fragment/MicroClassFragment;->i:Landroid/widget/LinearLayout;

    .line 429
    .line 430
    const-string v11, "one2oneContainer"

    .line 431
    .line 432
    if-eqz v10, :cond_c

    .line 433
    .line 434
    invoke-static {v9, v10}, Lcom/zykj/mistake/databinding/ItemMicroSessionsBinding;->a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lcom/zykj/mistake/databinding/ItemMicroSessionsBinding;

    .line 435
    .line 436
    .line 437
    move-result-object v9

    .line 438
    invoke-static {v9, v4}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 439
    .line 440
    .line 441
    invoke-static {p0}, Lcom/bumptech/glide/b;->f(Landroidx/fragment/app/Fragment;)Lcom/bumptech/glide/h;

    .line 442
    .line 443
    .line 444
    move-result-object v10

    .line 445
    invoke-virtual {v8}, Lcom/zykj/mistake/entity/resp/MistakeDetail$QstMicroLessonBean;->getSnapshot()Ljava/lang/String;

    .line 446
    .line 447
    .line 448
    move-result-object v12

    .line 449
    invoke-virtual {v10, v12}, Lcom/bumptech/glide/h;->l(Ljava/lang/String;)Lcom/bumptech/glide/f;

    .line 450
    .line 451
    .line 452
    move-result-object v10

    .line 453
    new-instance v12, Lr0/d;

    .line 454
    .line 455
    invoke-direct {v12}, Lr0/a;-><init>()V

    .line 456
    .line 457
    .line 458
    sget v13, Lcom/zykj/mistake/R$mipmap;->ic_default_micro:I

    .line 459
    .line 460
    invoke-virtual {v12, v13}, Lr0/a;->l(I)Lr0/a;

    .line 461
    .line 462
    .line 463
    move-result-object v12

    .line 464
    invoke-virtual {v10, v12}, Lcom/bumptech/glide/f;->w(Lr0/a;)Lcom/bumptech/glide/f;

    .line 465
    .line 466
    .line 467
    move-result-object v10

    .line 468
    iget-object v12, v9, Lcom/zykj/mistake/databinding/ItemMicroSessionsBinding;->a:Landroid/widget/ImageView;

    .line 469
    .line 470
    invoke-virtual {v10, v12}, Lcom/bumptech/glide/f;->y(Landroid/widget/ImageView;)V

    .line 471
    .line 472
    .line 473
    iget-object v10, v9, Lcom/zykj/mistake/databinding/ItemMicroSessionsBinding;->b:Landroid/widget/TextView;

    .line 474
    .line 475
    invoke-virtual {v8}, Lcom/zykj/mistake/entity/resp/MistakeDetail$QstMicroLessonBean;->getName()Ljava/lang/String;

    .line 476
    .line 477
    .line 478
    move-result-object v12

    .line 479
    invoke-virtual {v10, v12}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 480
    .line 481
    .line 482
    invoke-virtual {v8}, Lcom/zykj/mistake/entity/resp/MistakeDetail$QstMicroLessonBean;->getAddress()Ljava/lang/String;

    .line 483
    .line 484
    .line 485
    move-result-object v8

    .line 486
    invoke-virtual {v9}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 487
    .line 488
    .line 489
    move-result-object v10

    .line 490
    new-instance v12, Lq4/a;

    .line 491
    .line 492
    const/4 v13, 0x0

    .line 493
    invoke-direct {v12, p0, v8, v13}, Lq4/a;-><init>(Lcom/zykj/mistake/fragment/MicroClassFragment;Ljava/lang/String;I)V

    .line 494
    .line 495
    .line 496
    invoke-virtual {v10, v12}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 497
    .line 498
    .line 499
    iget-object v8, p0, Lcom/zykj/mistake/fragment/MicroClassFragment;->i:Landroid/widget/LinearLayout;

    .line 500
    .line 501
    if-eqz v8, :cond_b

    .line 502
    .line 503
    invoke-virtual {v9}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 504
    .line 505
    .line 506
    move-result-object v9

    .line 507
    invoke-virtual {v8, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 508
    .line 509
    .line 510
    goto :goto_5

    .line 511
    :cond_b
    invoke-static {v11}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 512
    .line 513
    .line 514
    throw v1

    .line 515
    :cond_c
    invoke-static {v11}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 516
    .line 517
    .line 518
    throw v1

    .line 519
    :cond_d
    iget-object v0, p0, Lcom/zykj/mistake/fragment/MicroClassFragment;->f:Landroid/widget/LinearLayout;

    .line 520
    .line 521
    if-eqz v0, :cond_16

    .line 522
    .line 523
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 524
    .line 525
    .line 526
    :goto_6
    new-instance v0, Ljava/util/ArrayList;

    .line 527
    .line 528
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 529
    .line 530
    .line 531
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 532
    .line 533
    .line 534
    move-result v2

    .line 535
    move v6, v3

    .line 536
    :cond_e
    :goto_7
    if-ge v6, v2, :cond_f

    .line 537
    .line 538
    invoke-virtual {p1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 539
    .line 540
    .line 541
    move-result-object v7

    .line 542
    add-int/lit8 v6, v6, 0x1

    .line 543
    .line 544
    move-object v8, v7

    .line 545
    check-cast v8, Lcom/zykj/mistake/entity/resp/MistakeDetail$QstMicroLessonBean;

    .line 546
    .line 547
    invoke-virtual {v8}, Lcom/zykj/mistake/entity/resp/MistakeDetail$QstMicroLessonBean;->isRevising()Ljava/lang/Boolean;

    .line 548
    .line 549
    .line 550
    move-result-object v8

    .line 551
    sget-object v9, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 552
    .line 553
    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 554
    .line 555
    .line 556
    move-result v8

    .line 557
    if-eqz v8, :cond_e

    .line 558
    .line 559
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 560
    .line 561
    .line 562
    goto :goto_7

    .line 563
    :cond_f
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 564
    .line 565
    .line 566
    move-result p1

    .line 567
    const-string v2, "revisedContent"

    .line 568
    .line 569
    if-eqz p1, :cond_11

    .line 570
    .line 571
    iget-object p1, p0, Lcom/zykj/mistake/fragment/MicroClassFragment;->e:Landroid/widget/LinearLayout;

    .line 572
    .line 573
    if-eqz p1, :cond_10

    .line 574
    .line 575
    invoke-virtual {p1, v5}, Landroid/view/View;->setVisibility(I)V

    .line 576
    .line 577
    .line 578
    return-void

    .line 579
    :cond_10
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 580
    .line 581
    .line 582
    throw v1

    .line 583
    :cond_11
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 584
    .line 585
    .line 586
    move-result p1

    .line 587
    move v5, v3

    .line 588
    :goto_8
    if-ge v5, p1, :cond_14

    .line 589
    .line 590
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 591
    .line 592
    .line 593
    move-result-object v6

    .line 594
    add-int/lit8 v5, v5, 0x1

    .line 595
    .line 596
    check-cast v6, Lcom/zykj/mistake/entity/resp/MistakeDetail$QstMicroLessonBean;

    .line 597
    .line 598
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 599
    .line 600
    .line 601
    move-result-object v7

    .line 602
    invoke-static {v7}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 603
    .line 604
    .line 605
    move-result-object v7

    .line 606
    iget-object v8, p0, Lcom/zykj/mistake/fragment/MicroClassFragment;->h:Landroid/widget/LinearLayout;

    .line 607
    .line 608
    const-string v9, "revisedContainer"

    .line 609
    .line 610
    if-eqz v8, :cond_13

    .line 611
    .line 612
    invoke-static {v7, v8}, Lcom/zykj/mistake/databinding/ItemMicroSessionsBinding;->a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lcom/zykj/mistake/databinding/ItemMicroSessionsBinding;

    .line 613
    .line 614
    .line 615
    move-result-object v7

    .line 616
    invoke-static {v7, v4}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 617
    .line 618
    .line 619
    invoke-static {p0}, Lcom/bumptech/glide/b;->f(Landroidx/fragment/app/Fragment;)Lcom/bumptech/glide/h;

    .line 620
    .line 621
    .line 622
    move-result-object v8

    .line 623
    invoke-virtual {v6}, Lcom/zykj/mistake/entity/resp/MistakeDetail$QstMicroLessonBean;->getSnapshot()Ljava/lang/String;

    .line 624
    .line 625
    .line 626
    move-result-object v10

    .line 627
    invoke-virtual {v8, v10}, Lcom/bumptech/glide/h;->l(Ljava/lang/String;)Lcom/bumptech/glide/f;

    .line 628
    .line 629
    .line 630
    move-result-object v8

    .line 631
    new-instance v10, Lr0/d;

    .line 632
    .line 633
    invoke-direct {v10}, Lr0/a;-><init>()V

    .line 634
    .line 635
    .line 636
    sget v11, Lcom/zykj/mistake/R$mipmap;->ic_default_micro:I

    .line 637
    .line 638
    invoke-virtual {v10, v11}, Lr0/a;->l(I)Lr0/a;

    .line 639
    .line 640
    .line 641
    move-result-object v10

    .line 642
    invoke-virtual {v8, v10}, Lcom/bumptech/glide/f;->w(Lr0/a;)Lcom/bumptech/glide/f;

    .line 643
    .line 644
    .line 645
    move-result-object v8

    .line 646
    iget-object v10, v7, Lcom/zykj/mistake/databinding/ItemMicroSessionsBinding;->a:Landroid/widget/ImageView;

    .line 647
    .line 648
    invoke-virtual {v8, v10}, Lcom/bumptech/glide/f;->y(Landroid/widget/ImageView;)V

    .line 649
    .line 650
    .line 651
    iget-object v8, v7, Lcom/zykj/mistake/databinding/ItemMicroSessionsBinding;->b:Landroid/widget/TextView;

    .line 652
    .line 653
    invoke-virtual {v6}, Lcom/zykj/mistake/entity/resp/MistakeDetail$QstMicroLessonBean;->getName()Ljava/lang/String;

    .line 654
    .line 655
    .line 656
    move-result-object v10

    .line 657
    invoke-virtual {v8, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 658
    .line 659
    .line 660
    invoke-virtual {v6}, Lcom/zykj/mistake/entity/resp/MistakeDetail$QstMicroLessonBean;->getAddress()Ljava/lang/String;

    .line 661
    .line 662
    .line 663
    move-result-object v6

    .line 664
    invoke-virtual {v7}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 665
    .line 666
    .line 667
    move-result-object v8

    .line 668
    new-instance v10, Lq4/a;

    .line 669
    .line 670
    const/4 v11, 0x2

    .line 671
    invoke-direct {v10, p0, v6, v11}, Lq4/a;-><init>(Lcom/zykj/mistake/fragment/MicroClassFragment;Ljava/lang/String;I)V

    .line 672
    .line 673
    .line 674
    invoke-virtual {v8, v10}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 675
    .line 676
    .line 677
    iget-object v6, p0, Lcom/zykj/mistake/fragment/MicroClassFragment;->h:Landroid/widget/LinearLayout;

    .line 678
    .line 679
    if-eqz v6, :cond_12

    .line 680
    .line 681
    invoke-virtual {v7}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 682
    .line 683
    .line 684
    move-result-object v7

    .line 685
    invoke-virtual {v6, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 686
    .line 687
    .line 688
    goto :goto_8

    .line 689
    :cond_12
    invoke-static {v9}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 690
    .line 691
    .line 692
    throw v1

    .line 693
    :cond_13
    invoke-static {v9}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 694
    .line 695
    .line 696
    throw v1

    .line 697
    :cond_14
    iget-object p1, p0, Lcom/zykj/mistake/fragment/MicroClassFragment;->e:Landroid/widget/LinearLayout;

    .line 698
    .line 699
    if-eqz p1, :cond_15

    .line 700
    .line 701
    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 702
    .line 703
    .line 704
    return-void

    .line 705
    :cond_15
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 706
    .line 707
    .line 708
    throw v1

    .line 709
    :cond_16
    invoke-static {v6}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 710
    .line 711
    .line 712
    throw v1

    .line 713
    :cond_17
    invoke-static {v6}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 714
    .line 715
    .line 716
    throw v1
.end method
