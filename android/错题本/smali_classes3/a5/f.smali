.class public final synthetic La5/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, La5/f;->a:I

    iput-object p2, p0, La5/f;->b:Ljava/lang/Object;

    iput-object p3, p0, La5/f;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 14

    .line 1
    iget v0, p0, La5/f;->a:I

    .line 2
    .line 3
    const-string v1, "requireActivity(...)"

    .line 4
    .line 5
    const/4 v2, -0x1

    .line 6
    const-string v3, "$viewHolder"

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    const/4 v5, 0x0

    .line 10
    iget-object v6, p0, La5/f;->c:Ljava/lang/Object;

    .line 11
    .line 12
    iget-object v7, p0, La5/f;->b:Ljava/lang/Object;

    .line 13
    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    check-cast v7, Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;

    .line 18
    .line 19
    check-cast v6, Lcom/chad/library/adapter/base/BaseQuickAdapter;

    .line 20
    .line 21
    invoke-static {v7, v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v7}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getBindingAdapterPosition()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-ne v0, v2, :cond_0

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_0
    const-string v2, "v"

    .line 32
    .line 33
    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    iget-object p1, v6, Lcom/chad/library/adapter/base/BaseQuickAdapter;->c:Landroidx/camera/core/impl/d;

    .line 37
    .line 38
    if-eqz p1, :cond_5

    .line 39
    .line 40
    iget-object p1, p1, Landroidx/camera/core/impl/d;->b:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p1, Lcom/zykj/mistake/fragment/NoteFragment;

    .line 43
    .line 44
    iget-object v2, v6, Lcom/chad/library/adapter/base/BaseQuickAdapter;->b:Ljava/util/List;

    .line 45
    .line 46
    invoke-static {v0, v2}, Lkotlin/collections/t;->j0(ILjava/util/List;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    instance-of v2, v0, Ljava/lang/String;

    .line 51
    .line 52
    if-eqz v2, :cond_1

    .line 53
    .line 54
    check-cast v0, Ljava/lang/String;

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    move-object v0, v5

    .line 58
    :goto_0
    if-nez v0, :cond_2

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_2
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    if-nez v2, :cond_4

    .line 66
    .line 67
    iget-object v0, p1, Lcom/zykj/mistake/fragment/NoteFragment;->m:Lcom/zykj/mistake/utils/g;

    .line 68
    .line 69
    if-eqz v0, :cond_3

    .line 70
    .line 71
    new-instance v1, Lq4/c;

    .line 72
    .line 73
    const/4 v2, 0x2

    .line 74
    invoke-direct {v1, p1, v2}, Lq4/c;-><init>(Lcom/zykj/mistake/fragment/NoteFragment;I)V

    .line 75
    .line 76
    .line 77
    new-instance v2, Lq4/d;

    .line 78
    .line 79
    invoke-direct {v2, p1, v4}, Lq4/d;-><init>(Lcom/zykj/mistake/fragment/NoteFragment;I)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0, v1, v2}, Lcom/zykj/mistake/utils/g;->a(Lr6/a;Lr6/c;)V

    .line 83
    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_3
    const-string p1, "galleryLauncher"

    .line 87
    .line 88
    invoke-static {p1}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    throw v5

    .line 92
    :cond_4
    new-instance v2, Lcom/zykj/mistake/dialog/ImageDialogFragment;

    .line 93
    .line 94
    invoke-direct {v2}, Lcom/zykj/mistake/dialog/ImageDialogFragment;-><init>()V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    invoke-static {v3, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    new-instance v1, Lq4/e;

    .line 105
    .line 106
    invoke-direct {v1, p1, v0, v2, v4}, Lq4/e;-><init>(Lcom/zykj/mistake/fragment/NoteFragment;Ljava/lang/String;Lcom/zykj/mistake/dialog/ImageDialogFragment;I)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v2, v3, v0, v1}, Lcom/zykj/mistake/dialog/ImageDialogFragment;->l(Landroidx/fragment/app/FragmentActivity;Ljava/lang/String;Lr6/a;)V

    .line 110
    .line 111
    .line 112
    :cond_5
    :goto_1
    return-void

    .line 113
    :pswitch_0
    check-cast v7, Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;

    .line 114
    .line 115
    check-cast v6, Lcom/chad/library/adapter/base/BaseProviderMultiAdapter;

    .line 116
    .line 117
    invoke-static {v7, v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v7}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getBindingAdapterPosition()I

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    if-ne v0, v2, :cond_6

    .line 125
    .line 126
    return-void

    .line 127
    :cond_6
    invoke-virtual {v7}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getItemViewType()I

    .line 128
    .line 129
    .line 130
    move-result v1

    .line 131
    iget-object v2, v6, Lcom/chad/library/adapter/base/BaseProviderMultiAdapter;->e:Ljava/lang/Object;

    .line 132
    .line 133
    invoke-interface {v2}, Ld6/e;->getValue()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    check-cast v2, Landroid/util/SparseArray;

    .line 138
    .line 139
    invoke-virtual {v2, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    if-nez v1, :cond_7

    .line 144
    .line 145
    const-string v1, "it"

    .line 146
    .line 147
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    iget-object p1, v6, Lcom/chad/library/adapter/base/BaseQuickAdapter;->b:Ljava/util/List;

    .line 151
    .line 152
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    throw v5

    .line 156
    :cond_7
    new-instance p1, Ljava/lang/ClassCastException;

    .line 157
    .line 158
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 159
    .line 160
    .line 161
    throw p1

    .line 162
    :pswitch_1
    check-cast v7, Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;

    .line 163
    .line 164
    check-cast v6, Lcom/chad/library/adapter/base/BaseBinderAdapter;

    .line 165
    .line 166
    invoke-static {v7, v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v7}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getBindingAdapterPosition()I

    .line 170
    .line 171
    .line 172
    move-result p1

    .line 173
    if-ne p1, v2, :cond_8

    .line 174
    .line 175
    return-void

    .line 176
    :cond_8
    invoke-virtual {v7}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getItemViewType()I

    .line 177
    .line 178
    .line 179
    move-result p1

    .line 180
    invoke-virtual {v6, p1}, Lcom/chad/library/adapter/base/BaseBinderAdapter;->j(I)V

    .line 181
    .line 182
    .line 183
    throw v5

    .line 184
    :pswitch_2
    check-cast v7, Lcom/zykj/mistake/fragment/RevisedAnswerFragment;

    .line 185
    .line 186
    check-cast v6, Lcom/zykj/mistake/entity/resp/MistakeDetail$QstMicroLessonBean;

    .line 187
    .line 188
    sget p1, Lcom/zykj/mistake/activity/SketchPlayerActivity;->g:I

    .line 189
    .line 190
    invoke-virtual {v7}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 191
    .line 192
    .line 193
    move-result-object p1

    .line 194
    invoke-virtual {v6}, Lcom/zykj/mistake/entity/resp/MistakeDetail$QstMicroLessonBean;->getAddress()Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    invoke-static {p1, v0, v5, v5}, Lio/reactivex/internal/operators/observable/c;->o(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 199
    .line 200
    .line 201
    return-void

    .line 202
    :pswitch_3
    check-cast v7, Lcom/zykj/mistake/fragment/OriginalAnswerFragment;

    .line 203
    .line 204
    check-cast v6, Ljava/lang/String;

    .line 205
    .line 206
    new-instance p1, Lcom/zykj/mistake/dialog/AnswerDialogFragment;

    .line 207
    .line 208
    invoke-direct {p1}, Lcom/zykj/mistake/dialog/AnswerDialogFragment;-><init>()V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v7}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 216
    .line 217
    .line 218
    const-string v1, ""

    .line 219
    .line 220
    invoke-virtual {p1, v0, v6, v1, v4}, Lcom/zykj/mistake/dialog/AnswerDialogFragment;->l(Landroidx/fragment/app/FragmentActivity;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 221
    .line 222
    .line 223
    return-void

    .line 224
    :pswitch_4
    check-cast v7, Lcom/zykj/mistake/fragment/OriginalAnswerFragment;

    .line 225
    .line 226
    check-cast v6, Lcom/zykj/mistake/entity/resp/MistakeDetail$QstMicroLessonBean;

    .line 227
    .line 228
    sget p1, Lcom/zykj/mistake/activity/SketchPlayerActivity;->g:I

    .line 229
    .line 230
    invoke-virtual {v7}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 231
    .line 232
    .line 233
    move-result-object p1

    .line 234
    invoke-virtual {v6}, Lcom/zykj/mistake/entity/resp/MistakeDetail$QstMicroLessonBean;->getAddress()Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    invoke-static {p1, v0, v5, v5}, Lio/reactivex/internal/operators/observable/c;->o(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 239
    .line 240
    .line 241
    return-void

    .line 242
    :pswitch_5
    check-cast v7, Ljava/lang/Integer;

    .line 243
    .line 244
    check-cast v6, Lcom/zykj/view/widget/customColor/LatestColorLayout;

    .line 245
    .line 246
    invoke-static {v7, v6, p1}, Lcom/zykj/view/widget/customColor/LatestColorLayout;->a(Ljava/lang/Integer;Lcom/zykj/view/widget/customColor/LatestColorLayout;Landroid/view/View;)V

    .line 247
    .line 248
    .line 249
    return-void

    .line 250
    :pswitch_6
    check-cast v7, Lcom/zykj/view/board/play/SpeedRateAdapter;

    .line 251
    .line 252
    check-cast v6, Lcom/zykj/view/board/play/SpeedRate;

    .line 253
    .line 254
    invoke-static {v7, v6, p1}, Lcom/zykj/view/board/play/SpeedRateAdapter;->a(Lcom/zykj/view/board/play/SpeedRateAdapter;Lcom/zykj/view/board/play/SpeedRate;Landroid/view/View;)V

    .line 255
    .line 256
    .line 257
    return-void

    .line 258
    :pswitch_7
    check-cast v7, Lcom/zykj/mistake/utils/k;

    .line 259
    .line 260
    check-cast v6, Lr6/a;

    .line 261
    .line 262
    iget-object p1, v7, Lcom/zykj/mistake/utils/k;->b:Lr6/a;

    .line 263
    .line 264
    invoke-interface {p1}, Lr6/a;->invoke()Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object p1

    .line 268
    check-cast p1, Ljava/lang/Number;

    .line 269
    .line 270
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 271
    .line 272
    .line 273
    move-result-wide v0

    .line 274
    iget-object p1, v7, Lcom/zykj/mistake/utils/k;->c:Ljava/lang/Long;

    .line 275
    .line 276
    if-eqz p1, :cond_9

    .line 277
    .line 278
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 279
    .line 280
    .line 281
    move-result-wide v2

    .line 282
    sub-long v2, v0, v2

    .line 283
    .line 284
    iget-wide v4, v7, Lcom/zykj/mistake/utils/k;->a:J

    .line 285
    .line 286
    cmp-long p1, v2, v4

    .line 287
    .line 288
    if-ltz p1, :cond_a

    .line 289
    .line 290
    :cond_9
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 291
    .line 292
    .line 293
    move-result-object p1

    .line 294
    iput-object p1, v7, Lcom/zykj/mistake/utils/k;->c:Ljava/lang/Long;

    .line 295
    .line 296
    invoke-interface {v6}, Lr6/a;->invoke()Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    :cond_a
    return-void

    .line 300
    :pswitch_8
    check-cast v7, Landroid/view/View;

    .line 301
    .line 302
    check-cast v6, Lcom/zykj/mistake/activity/MistakeListActivity;

    .line 303
    .line 304
    iget-object p1, v6, Lcom/zykj/mistake/activity/MistakeListActivity;->t:Ljava/util/ArrayList;

    .line 305
    .line 306
    sget v0, Lcom/zykj/mistake/activity/MistakeListActivity;->x:I

    .line 307
    .line 308
    invoke-virtual {v7}, Landroid/view/View;->isSelected()Z

    .line 309
    .line 310
    .line 311
    move-result v0

    .line 312
    const/4 v1, 0x1

    .line 313
    if-eqz v0, :cond_d

    .line 314
    .line 315
    invoke-virtual {v7, v4}, Landroid/view/View;->setSelected(Z)V

    .line 316
    .line 317
    .line 318
    invoke-virtual {v6, v1}, Lcom/zykj/mistake/activity/MistakeListActivity;->A(Z)V

    .line 319
    .line 320
    .line 321
    new-instance v0, Ljava/util/ArrayList;

    .line 322
    .line 323
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 324
    .line 325
    .line 326
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 327
    .line 328
    .line 329
    move-result v1

    .line 330
    :cond_b
    :goto_2
    if-ge v4, v1, :cond_c

    .line 331
    .line 332
    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 333
    .line 334
    .line 335
    move-result-object v2

    .line 336
    add-int/lit8 v4, v4, 0x1

    .line 337
    .line 338
    move-object v3, v2

    .line 339
    check-cast v3, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 340
    .line 341
    invoke-virtual {v3}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getLocalType()I

    .line 342
    .line 343
    .line 344
    move-result v3

    .line 345
    const/4 v5, 0x3

    .line 346
    if-ne v3, v5, :cond_b

    .line 347
    .line 348
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 349
    .line 350
    .line 351
    goto :goto_2

    .line 352
    :cond_c
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->removeAll(Ljava/util/Collection;)Z

    .line 353
    .line 354
    .line 355
    goto :goto_3

    .line 356
    :cond_d
    invoke-virtual {v6, v4}, Lcom/zykj/mistake/activity/MistakeListActivity;->A(Z)V

    .line 357
    .line 358
    .line 359
    invoke-virtual {v7, v1}, Landroid/view/View;->setSelected(Z)V

    .line 360
    .line 361
    .line 362
    move-object v0, v6

    .line 363
    new-instance v6, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 364
    .line 365
    sget v1, Lcom/zykj/mistake/R$string;->no_tag:I

    .line 366
    .line 367
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 368
    .line 369
    .line 370
    move-result-object v7

    .line 371
    const-string v0, "getString(...)"

    .line 372
    .line 373
    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 374
    .line 375
    .line 376
    const/4 v12, 0x6

    .line 377
    const/4 v13, 0x0

    .line 378
    const-wide/16 v8, 0x0

    .line 379
    .line 380
    const/4 v10, 0x0

    .line 381
    const/4 v11, 0x3

    .line 382
    invoke-direct/range {v6 .. v13}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;-><init>(Ljava/lang/String;JIIILkotlin/jvm/internal/e;)V

    .line 383
    .line 384
    .line 385
    invoke-virtual {p1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 386
    .line 387
    .line 388
    :goto_3
    return-void

    .line 389
    :pswitch_9
    check-cast v7, Lcom/zykj/mistake/activity/MistakeDetailActivity;

    .line 390
    .line 391
    check-cast v6, Ljava/lang/String;

    .line 392
    .line 393
    sget p1, Lcom/zykj/mistake/activity/MistakeDetailActivity;->s:I

    .line 394
    .line 395
    new-instance p1, Lcom/zykj/mistake/dialog/AnswerDialogFragment;

    .line 396
    .line 397
    invoke-direct {p1}, Lcom/zykj/mistake/dialog/AnswerDialogFragment;-><init>()V

    .line 398
    .line 399
    .line 400
    invoke-virtual {p1, v7, v6, v5, v4}, Lcom/zykj/mistake/dialog/AnswerDialogFragment;->l(Landroidx/fragment/app/FragmentActivity;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 401
    .line 402
    .line 403
    return-void

    .line 404
    :pswitch_a
    check-cast v7, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;

    .line 405
    .line 406
    check-cast v6, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;

    .line 407
    .line 408
    iget-object p1, v7, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->h:Ljava/util/ArrayList;

    .line 409
    .line 410
    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    .line 411
    .line 412
    .line 413
    iget-object p1, v6, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;->e:Lcom/zykj/mistake/widget/FlowLayout;

    .line 414
    .line 415
    iget-object v0, v6, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;->d:Lcom/zykj/mistake/widget/FlowLayout;

    .line 416
    .line 417
    iget-object v1, v6, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;->g:Lcom/zykj/mistake/widget/FlowLayout;

    .line 418
    .line 419
    iget-object v2, v6, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;->f:Lcom/zykj/mistake/widget/FlowLayout;

    .line 420
    .line 421
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 422
    .line 423
    .line 424
    move-result p1

    .line 425
    move v3, v4

    .line 426
    :goto_4
    if-ge v3, p1, :cond_e

    .line 427
    .line 428
    iget-object v5, v6, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;->e:Lcom/zykj/mistake/widget/FlowLayout;

    .line 429
    .line 430
    invoke-virtual {v5, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 431
    .line 432
    .line 433
    move-result-object v5

    .line 434
    invoke-virtual {v5, v4}, Landroid/view/View;->setSelected(Z)V

    .line 435
    .line 436
    .line 437
    add-int/lit8 v3, v3, 0x1

    .line 438
    .line 439
    goto :goto_4

    .line 440
    :cond_e
    invoke-virtual {v2}, Landroid/view/ViewGroup;->getChildCount()I

    .line 441
    .line 442
    .line 443
    move-result p1

    .line 444
    move v3, v4

    .line 445
    :goto_5
    if-ge v3, p1, :cond_f

    .line 446
    .line 447
    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 448
    .line 449
    .line 450
    move-result-object v5

    .line 451
    invoke-virtual {v5, v4}, Landroid/view/View;->setSelected(Z)V

    .line 452
    .line 453
    .line 454
    add-int/lit8 v3, v3, 0x1

    .line 455
    .line 456
    goto :goto_5

    .line 457
    :cond_f
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 458
    .line 459
    .line 460
    move-result p1

    .line 461
    move v2, v4

    .line 462
    :goto_6
    if-ge v2, p1, :cond_10

    .line 463
    .line 464
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 465
    .line 466
    .line 467
    move-result-object v3

    .line 468
    invoke-virtual {v3, v4}, Landroid/view/View;->setSelected(Z)V

    .line 469
    .line 470
    .line 471
    add-int/lit8 v2, v2, 0x1

    .line 472
    .line 473
    goto :goto_6

    .line 474
    :cond_10
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 475
    .line 476
    .line 477
    move-result p1

    .line 478
    move v1, v4

    .line 479
    :goto_7
    if-ge v1, p1, :cond_11

    .line 480
    .line 481
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 482
    .line 483
    .line 484
    move-result-object v2

    .line 485
    invoke-virtual {v2, v4}, Landroid/view/View;->setSelected(Z)V

    .line 486
    .line 487
    .line 488
    add-int/lit8 v1, v1, 0x1

    .line 489
    .line 490
    goto :goto_7

    .line 491
    :cond_11
    return-void

    .line 492
    :pswitch_b
    check-cast v7, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;

    .line 493
    .line 494
    check-cast v6, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 495
    .line 496
    iget-object p1, v7, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->f:Ljava/util/ArrayList;

    .line 497
    .line 498
    invoke-virtual {p1, v6}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 499
    .line 500
    .line 501
    iget-object v0, v7, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->h:Ljava/util/ArrayList;

    .line 502
    .line 503
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 504
    .line 505
    .line 506
    invoke-virtual {v7, p1}, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->z(Ljava/util/ArrayList;)V

    .line 507
    .line 508
    .line 509
    return-void

    .line 510
    :pswitch_c
    check-cast v7, Ljava/lang/String;

    .line 511
    .line 512
    check-cast v6, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;

    .line 513
    .line 514
    sget p1, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->u:I

    .line 515
    .line 516
    if-eqz v7, :cond_12

    .line 517
    .line 518
    new-instance p1, Lcom/zykj/mistake/dialog/ImageDialogFragment;

    .line 519
    .line 520
    invoke-direct {p1}, Lcom/zykj/mistake/dialog/ImageDialogFragment;-><init>()V

    .line 521
    .line 522
    .line 523
    invoke-virtual {p1, v6, v7, v5}, Lcom/zykj/mistake/dialog/ImageDialogFragment;->l(Landroidx/fragment/app/FragmentActivity;Ljava/lang/String;Lr6/a;)V

    .line 524
    .line 525
    .line 526
    :cond_12
    return-void

    .line 527
    :pswitch_d
    check-cast v7, Lcom/google/android/material/snackbar/Snackbar;

    .line 528
    .line 529
    check-cast v6, Landroid/view/View$OnClickListener;

    .line 530
    .line 531
    invoke-static {v7, v6, p1}, Lcom/google/android/material/snackbar/Snackbar;->a(Lcom/google/android/material/snackbar/Snackbar;Landroid/view/View$OnClickListener;Landroid/view/View;)V

    .line 532
    .line 533
    .line 534
    return-void

    .line 535
    :pswitch_e
    check-cast v7, La5/e;

    .line 536
    .line 537
    check-cast v6, Landroid/app/Dialog;

    .line 538
    .line 539
    iget-object p1, v7, La5/e;->f:Ljava/lang/Object;

    .line 540
    .line 541
    check-cast p1, Lcom/zykj/mistake/activity/f;

    .line 542
    .line 543
    invoke-virtual {p1}, Lcom/zykj/mistake/activity/f;->invoke()Ljava/lang/Object;

    .line 544
    .line 545
    .line 546
    invoke-virtual {v6}, Landroid/app/Dialog;->dismiss()V

    .line 547
    .line 548
    .line 549
    return-void

    .line 550
    nop

    .line 551
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
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
