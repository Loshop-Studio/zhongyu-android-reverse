.class public final Lcom/zykj/mistake/feature/collection/detail/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/coroutines/flow/g;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/zykj/mistake/feature/collection/detail/f;->a:I

    iput-object p1, p0, Lcom/zykj/mistake/feature/collection/detail/f;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lh6/c;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget p2, p0, Lcom/zykj/mistake/feature/collection/detail/f;->a:I

    .line 2
    .line 3
    packed-switch p2, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lcom/zykj/mistake/main/a0;

    .line 7
    .line 8
    instance-of p2, p1, Lcom/zykj/mistake/main/z;

    .line 9
    .line 10
    if-eqz p2, :cond_5

    .line 11
    .line 12
    iget-object p2, p0, Lcom/zykj/mistake/feature/collection/detail/f;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p2, Lz4/g;

    .line 15
    .line 16
    iget-object p2, p2, Lz4/g;->b:La5/e;

    .line 17
    .line 18
    iget-object v0, p2, La5/e;->c:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Ljava/text/SimpleDateFormat;

    .line 21
    .line 22
    check-cast p1, Lcom/zykj/mistake/main/z;

    .line 23
    .line 24
    iget-object v1, p1, Lcom/zykj/mistake/main/z;->a:Ljava/lang/String;

    .line 25
    .line 26
    iget-object p1, p1, Lcom/zykj/mistake/main/z;->b:Ljava/lang/String;

    .line 27
    .line 28
    iget-object v2, p2, La5/e;->b:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v2, Lcom/zykj/mistake/activity/MainActivity;

    .line 31
    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    if-nez v1, :cond_0

    .line 43
    .line 44
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-virtual {v1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    :cond_0
    invoke-virtual {v3, v1}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    :goto_0
    if-eqz p1, :cond_3

    .line 61
    .line 62
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-virtual {v0, p1}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    if-nez p1, :cond_2

    .line 71
    .line 72
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-virtual {p1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    :cond_2
    invoke-virtual {v1, p1}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 81
    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_3
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    :goto_1
    new-instance p1, Landroid/app/Dialog;

    .line 89
    .line 90
    invoke-direct {p1, v2}, Landroid/app/Dialog;-><init>(Landroid/content/Context;)V

    .line 91
    .line 92
    .line 93
    new-instance v0, Landroid/widget/LinearLayout;

    .line 94
    .line 95
    invoke-direct {v0, v2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 96
    .line 97
    .line 98
    const/4 v4, 0x1

    .line 99
    invoke-virtual {v0, v4}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 100
    .line 101
    .line 102
    const/16 v4, 0x10

    .line 103
    .line 104
    const/16 v5, 0x18

    .line 105
    .line 106
    invoke-virtual {v0, v5, v5, v5, v4}, Landroid/view/View;->setPadding(IIII)V

    .line 107
    .line 108
    .line 109
    new-instance v4, Landroid/graphics/drawable/GradientDrawable;

    .line 110
    .line 111
    invoke-direct {v4}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 112
    .line 113
    .line 114
    const/4 v5, -0x1

    .line 115
    invoke-virtual {v4, v5}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 116
    .line 117
    .line 118
    const/4 v6, 0x4

    .line 119
    int-to-float v7, v6

    .line 120
    invoke-virtual {v2}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    .line 121
    .line 122
    .line 123
    move-result-object v8

    .line 124
    invoke-virtual {v8}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 125
    .line 126
    .line 127
    move-result-object v8

    .line 128
    iget v8, v8, Landroid/util/DisplayMetrics;->density:F

    .line 129
    .line 130
    mul-float/2addr v7, v8

    .line 131
    float-to-int v7, v7

    .line 132
    int-to-float v7, v7

    .line 133
    invoke-virtual {v4, v7}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v0, v4}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 137
    .line 138
    .line 139
    new-instance v4, Landroid/widget/LinearLayout;

    .line 140
    .line 141
    invoke-direct {v4, v2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 142
    .line 143
    .line 144
    const/4 v7, 0x0

    .line 145
    invoke-virtual {v4, v7}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v4, v6}, Landroid/view/View;->setVisibility(I)V

    .line 149
    .line 150
    .line 151
    invoke-static {v3}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {p2, v3}, La5/e;->c(Ljava/util/Calendar;)Landroid/widget/DatePicker;

    .line 155
    .line 156
    .line 157
    move-result-object v3

    .line 158
    invoke-static {v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {p2, v1}, La5/e;->c(Ljava/util/Calendar;)Landroid/widget/DatePicker;

    .line 162
    .line 163
    .line 164
    move-result-object v1

    .line 165
    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    .line 166
    .line 167
    const/4 v8, -0x2

    .line 168
    const/high16 v9, 0x3f800000    # 1.0f

    .line 169
    .line 170
    invoke-direct {v6, v7, v8, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v4, v3, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 174
    .line 175
    .line 176
    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    .line 177
    .line 178
    invoke-direct {v6, v7, v8, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v4, v1, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 182
    .line 183
    .line 184
    new-instance v6, Landroid/widget/LinearLayout;

    .line 185
    .line 186
    invoke-direct {v6, v2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v6, v7}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 190
    .line 191
    .line 192
    const/16 v8, 0x11

    .line 193
    .line 194
    invoke-virtual {v6, v8}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 195
    .line 196
    .line 197
    const/16 v9, 0xc

    .line 198
    .line 199
    invoke-virtual {v6, v7, v9, v7, v7}, Landroid/view/View;->setPadding(IIII)V

    .line 200
    .line 201
    .line 202
    new-instance v9, Landroid/widget/TextView;

    .line 203
    .line 204
    invoke-direct {v9, v2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 205
    .line 206
    .line 207
    sget v10, Lcom/zykj/mistake/R$string;->reset:I

    .line 208
    .line 209
    invoke-virtual {v2, v10}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v10

    .line 213
    invoke-virtual {v9, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v9, v8}, Landroid/widget/TextView;->setGravity(I)V

    .line 217
    .line 218
    .line 219
    const/high16 v10, 0x41600000    # 14.0f

    .line 220
    .line 221
    invoke-virtual {v9, v10}, Landroid/widget/TextView;->setTextSize(F)V

    .line 222
    .line 223
    .line 224
    const-string v11, "#1576FF"

    .line 225
    .line 226
    invoke-static {v11}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 227
    .line 228
    .line 229
    move-result v11

    .line 230
    invoke-virtual {v9, v11}, Landroid/widget/TextView;->setTextColor(I)V

    .line 231
    .line 232
    .line 233
    sget v11, Lcom/zykj/mistake/R$drawable;->bg_filter_reset:I

    .line 234
    .line 235
    invoke-virtual {v9, v11}, Landroid/view/View;->setBackgroundResource(I)V

    .line 236
    .line 237
    .line 238
    new-instance v11, La5/f;

    .line 239
    .line 240
    const/4 v12, 0x0

    .line 241
    invoke-direct {v11, v12, p2, p1}, La5/f;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 242
    .line 243
    .line 244
    invoke-virtual {v9, v11}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 245
    .line 246
    .line 247
    new-instance v11, Landroid/widget/TextView;

    .line 248
    .line 249
    invoke-direct {v11, v2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 250
    .line 251
    .line 252
    sget v12, Lcom/zykj/mistake/R$string;->confirm:I

    .line 253
    .line 254
    invoke-virtual {v2, v12}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v12

    .line 258
    invoke-virtual {v11, v12}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 259
    .line 260
    .line 261
    invoke-virtual {v11, v8}, Landroid/widget/TextView;->setGravity(I)V

    .line 262
    .line 263
    .line 264
    invoke-virtual {v11, v10}, Landroid/widget/TextView;->setTextSize(F)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v11, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 268
    .line 269
    .line 270
    sget v5, Lcom/zykj/mistake/R$drawable;->bg_filter_confirm:I

    .line 271
    .line 272
    invoke-virtual {v11, v5}, Landroid/view/View;->setBackgroundResource(I)V

    .line 273
    .line 274
    .line 275
    new-instance v5, La5/g;

    .line 276
    .line 277
    invoke-direct {v5, p2, p1, v3, v1}, La5/g;-><init>(La5/e;Landroid/app/Dialog;Landroid/widget/DatePicker;Landroid/widget/DatePicker;)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {v11, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 281
    .line 282
    .line 283
    const/16 v5, 0x66

    .line 284
    .line 285
    int-to-float v5, v5

    .line 286
    invoke-virtual {v2}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    .line 287
    .line 288
    .line 289
    move-result-object v8

    .line 290
    invoke-virtual {v8}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 291
    .line 292
    .line 293
    move-result-object v8

    .line 294
    iget v8, v8, Landroid/util/DisplayMetrics;->density:F

    .line 295
    .line 296
    mul-float/2addr v5, v8

    .line 297
    float-to-int v5, v5

    .line 298
    const/16 v8, 0x2a

    .line 299
    .line 300
    int-to-float v8, v8

    .line 301
    invoke-virtual {v2}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    .line 302
    .line 303
    .line 304
    move-result-object v2

    .line 305
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 306
    .line 307
    .line 308
    move-result-object v2

    .line 309
    iget v2, v2, Landroid/util/DisplayMetrics;->density:F

    .line 310
    .line 311
    mul-float/2addr v8, v2

    .line 312
    float-to-int v2, v8

    .line 313
    new-instance v8, Landroid/widget/LinearLayout$LayoutParams;

    .line 314
    .line 315
    invoke-direct {v8, v5, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 316
    .line 317
    .line 318
    invoke-virtual {v6, v9, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 319
    .line 320
    .line 321
    new-instance v8, Landroid/widget/LinearLayout$LayoutParams;

    .line 322
    .line 323
    invoke-direct {v8, v5, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 324
    .line 325
    .line 326
    const/16 v2, 0x38

    .line 327
    .line 328
    iput v2, v8, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 329
    .line 330
    invoke-virtual {v6, v11, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 331
    .line 332
    .line 333
    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 334
    .line 335
    .line 336
    invoke-virtual {v0, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 337
    .line 338
    .line 339
    invoke-virtual {p1, v0}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 340
    .line 341
    .line 342
    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 343
    .line 344
    .line 345
    move-result-object v0

    .line 346
    if-eqz v0, :cond_4

    .line 347
    .line 348
    new-instance v2, Landroid/graphics/drawable/ColorDrawable;

    .line 349
    .line 350
    invoke-direct {v2, v7}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 351
    .line 352
    .line 353
    invoke-virtual {v0, v2}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 354
    .line 355
    .line 356
    :cond_4
    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    .line 357
    .line 358
    .line 359
    new-instance p1, La5/c;

    .line 360
    .line 361
    const/4 v0, 0x1

    .line 362
    invoke-direct {p1, v4, v0}, La5/c;-><init>(Landroid/widget/LinearLayout;I)V

    .line 363
    .line 364
    .line 365
    new-instance v0, La5/h;

    .line 366
    .line 367
    invoke-direct {v0, p2, v3, v1, p1}, La5/h;-><init>(La5/e;Landroid/widget/DatePicker;Landroid/widget/DatePicker;La5/c;)V

    .line 368
    .line 369
    .line 370
    invoke-virtual {v3, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 371
    .line 372
    .line 373
    :cond_5
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 374
    .line 375
    return-object p1

    .line 376
    :pswitch_0
    check-cast p1, Lcom/zykj/mistake/main/a0;

    .line 377
    .line 378
    iget-object p2, p0, Lcom/zykj/mistake/feature/collection/detail/f;->b:Ljava/lang/Object;

    .line 379
    .line 380
    check-cast p2, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 381
    .line 382
    sget-object v0, Lcom/zykj/mistake/main/t;->a:Lcom/zykj/mistake/main/t;

    .line 383
    .line 384
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 385
    .line 386
    .line 387
    move-result v0

    .line 388
    if-eqz v0, :cond_6

    .line 389
    .line 390
    sget-object p1, Lcom/zykj/mistake/feature/notebook/detail/u1;->a:Lcom/zykj/mistake/feature/notebook/detail/u1;

    .line 391
    .line 392
    invoke-virtual {p2, p1}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->t(Lcom/zykj/mistake/feature/notebook/detail/i3;)V

    .line 393
    .line 394
    .line 395
    goto :goto_2

    .line 396
    :cond_6
    instance-of v0, p1, Lcom/zykj/mistake/main/w;

    .line 397
    .line 398
    if-eqz v0, :cond_8

    .line 399
    .line 400
    check-cast p1, Lcom/zykj/mistake/main/w;

    .line 401
    .line 402
    iget-object v0, p1, Lcom/zykj/mistake/main/w;->a:Lcom/zykj/mistake/main/TagEditorTarget;

    .line 403
    .line 404
    sget-object v1, Lcom/zykj/mistake/main/TagEditorTarget;->DETAIL:Lcom/zykj/mistake/main/TagEditorTarget;

    .line 405
    .line 406
    if-eq v0, v1, :cond_7

    .line 407
    .line 408
    goto :goto_2

    .line 409
    :cond_7
    new-instance v2, Lcom/zykj/mistake/feature/notebook/detail/v1;

    .line 410
    .line 411
    iget-object p1, p1, Lcom/zykj/mistake/main/w;->b:Lcom/zykj/mistake/main/z0;

    .line 412
    .line 413
    iget-object v3, p1, Lcom/zykj/mistake/main/z0;->a:Ljava/lang/Integer;

    .line 414
    .line 415
    iget-object v4, p1, Lcom/zykj/mistake/main/z0;->b:Ljava/lang/Integer;

    .line 416
    .line 417
    iget-object v5, p1, Lcom/zykj/mistake/main/z0;->c:Ljava/lang/Integer;

    .line 418
    .line 419
    iget-object v6, p1, Lcom/zykj/mistake/main/z0;->d:Ljava/util/ArrayList;

    .line 420
    .line 421
    iget-object v7, p1, Lcom/zykj/mistake/main/z0;->e:Ljava/util/ArrayList;

    .line 422
    .line 423
    invoke-direct/range {v2 .. v7}, Lcom/zykj/mistake/feature/notebook/detail/v1;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 424
    .line 425
    .line 426
    invoke-virtual {p2, v2}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->t(Lcom/zykj/mistake/feature/notebook/detail/i3;)V

    .line 427
    .line 428
    .line 429
    goto :goto_2

    .line 430
    :cond_8
    instance-of v0, p1, Lcom/zykj/mistake/main/x;

    .line 431
    .line 432
    if-eqz v0, :cond_a

    .line 433
    .line 434
    check-cast p1, Lcom/zykj/mistake/main/x;

    .line 435
    .line 436
    iget-object v0, p1, Lcom/zykj/mistake/main/x;->a:Lcom/zykj/mistake/main/TagEditorTarget;

    .line 437
    .line 438
    sget-object v1, Lcom/zykj/mistake/main/TagEditorTarget;->DETAIL:Lcom/zykj/mistake/main/TagEditorTarget;

    .line 439
    .line 440
    if-eq v0, v1, :cond_9

    .line 441
    .line 442
    goto :goto_2

    .line 443
    :cond_9
    new-instance v0, Lcom/zykj/mistake/feature/notebook/detail/x1;

    .line 444
    .line 445
    iget-object p1, p1, Lcom/zykj/mistake/main/x;->b:Ljava/lang/String;

    .line 446
    .line 447
    invoke-direct {v0, p1}, Lcom/zykj/mistake/feature/notebook/detail/x1;-><init>(Ljava/lang/String;)V

    .line 448
    .line 449
    .line 450
    invoke-virtual {p2, v0}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->t(Lcom/zykj/mistake/feature/notebook/detail/i3;)V

    .line 451
    .line 452
    .line 453
    goto :goto_2

    .line 454
    :cond_a
    instance-of v0, p1, Lcom/zykj/mistake/main/y;

    .line 455
    .line 456
    if-eqz v0, :cond_c

    .line 457
    .line 458
    check-cast p1, Lcom/zykj/mistake/main/y;

    .line 459
    .line 460
    iget-object v0, p1, Lcom/zykj/mistake/main/y;->a:Lcom/zykj/mistake/main/TagEditorTarget;

    .line 461
    .line 462
    sget-object v1, Lcom/zykj/mistake/main/TagEditorTarget;->DETAIL:Lcom/zykj/mistake/main/TagEditorTarget;

    .line 463
    .line 464
    if-eq v0, v1, :cond_b

    .line 465
    .line 466
    goto :goto_2

    .line 467
    :cond_b
    new-instance v0, Lcom/zykj/mistake/feature/notebook/detail/f2;

    .line 468
    .line 469
    iget-object v1, p1, Lcom/zykj/mistake/main/y;->b:Ljava/lang/String;

    .line 470
    .line 471
    iget-object v2, p1, Lcom/zykj/mistake/main/y;->c:Ljava/lang/String;

    .line 472
    .line 473
    iget-wide v3, p1, Lcom/zykj/mistake/main/y;->d:J

    .line 474
    .line 475
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/zykj/mistake/feature/notebook/detail/f2;-><init>(Ljava/lang/String;Ljava/lang/String;J)V

    .line 476
    .line 477
    .line 478
    invoke-virtual {p2, v0}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->t(Lcom/zykj/mistake/feature/notebook/detail/i3;)V

    .line 479
    .line 480
    .line 481
    :cond_c
    :goto_2
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 482
    .line 483
    return-object p1

    .line 484
    :pswitch_1
    check-cast p1, Lcom/zykj/mistake/main/a0;

    .line 485
    .line 486
    iget-object p2, p0, Lcom/zykj/mistake/feature/collection/detail/f;->b:Ljava/lang/Object;

    .line 487
    .line 488
    check-cast p2, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;

    .line 489
    .line 490
    instance-of v0, p1, Lcom/zykj/mistake/main/q;

    .line 491
    .line 492
    if-eqz v0, :cond_e

    .line 493
    .line 494
    check-cast p1, Lcom/zykj/mistake/main/q;

    .line 495
    .line 496
    iget-object v0, p1, Lcom/zykj/mistake/main/q;->a:Lcom/zykj/mistake/platform/picker/CollectionDatePickerTarget;

    .line 497
    .line 498
    sget-object v1, Lcom/zykj/mistake/platform/picker/CollectionDatePickerTarget;->FILTER_RESULT:Lcom/zykj/mistake/platform/picker/CollectionDatePickerTarget;

    .line 499
    .line 500
    if-eq v0, v1, :cond_d

    .line 501
    .line 502
    goto :goto_3

    .line 503
    :cond_d
    new-instance v0, Lcom/zykj/mistake/feature/collection/filter/w;

    .line 504
    .line 505
    iget-object v1, p1, Lcom/zykj/mistake/main/q;->b:Ljava/lang/String;

    .line 506
    .line 507
    iget-object p1, p1, Lcom/zykj/mistake/main/q;->c:Ljava/lang/String;

    .line 508
    .line 509
    invoke-direct {v0, v1, p1}, Lcom/zykj/mistake/feature/collection/filter/w;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 510
    .line 511
    .line 512
    invoke-virtual {p2, v0}, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;->c(Lcom/zykj/mistake/feature/collection/filter/r0;)V

    .line 513
    .line 514
    .line 515
    goto :goto_3

    .line 516
    :cond_e
    instance-of v0, p1, Lcom/zykj/mistake/main/r;

    .line 517
    .line 518
    if-eqz v0, :cond_10

    .line 519
    .line 520
    check-cast p1, Lcom/zykj/mistake/main/r;

    .line 521
    .line 522
    iget-object p1, p1, Lcom/zykj/mistake/main/r;->a:Lcom/zykj/mistake/platform/picker/CollectionDatePickerTarget;

    .line 523
    .line 524
    sget-object v0, Lcom/zykj/mistake/platform/picker/CollectionDatePickerTarget;->FILTER_RESULT:Lcom/zykj/mistake/platform/picker/CollectionDatePickerTarget;

    .line 525
    .line 526
    if-eq p1, v0, :cond_f

    .line 527
    .line 528
    goto :goto_3

    .line 529
    :cond_f
    sget-object p1, Lcom/zykj/mistake/feature/collection/filter/d0;->a:Lcom/zykj/mistake/feature/collection/filter/d0;

    .line 530
    .line 531
    invoke-virtual {p2, p1}, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;->c(Lcom/zykj/mistake/feature/collection/filter/r0;)V

    .line 532
    .line 533
    .line 534
    :cond_10
    :goto_3
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 535
    .line 536
    return-object p1

    .line 537
    :pswitch_2
    check-cast p1, Lcom/zykj/mistake/main/a0;

    .line 538
    .line 539
    iget-object p2, p0, Lcom/zykj/mistake/feature/collection/detail/f;->b:Ljava/lang/Object;

    .line 540
    .line 541
    check-cast p2, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;

    .line 542
    .line 543
    instance-of v0, p1, Lcom/zykj/mistake/main/q;

    .line 544
    .line 545
    if-eqz v0, :cond_12

    .line 546
    .line 547
    check-cast p1, Lcom/zykj/mistake/main/q;

    .line 548
    .line 549
    iget-object v0, p1, Lcom/zykj/mistake/main/q;->a:Lcom/zykj/mistake/platform/picker/CollectionDatePickerTarget;

    .line 550
    .line 551
    sget-object v1, Lcom/zykj/mistake/platform/picker/CollectionDatePickerTarget;->DETAIL_FILTER:Lcom/zykj/mistake/platform/picker/CollectionDatePickerTarget;

    .line 552
    .line 553
    if-eq v0, v1, :cond_11

    .line 554
    .line 555
    goto :goto_4

    .line 556
    :cond_11
    new-instance v0, Lcom/zykj/mistake/feature/collection/detail/w;

    .line 557
    .line 558
    iget-object v1, p1, Lcom/zykj/mistake/main/q;->b:Ljava/lang/String;

    .line 559
    .line 560
    iget-object p1, p1, Lcom/zykj/mistake/main/q;->c:Ljava/lang/String;

    .line 561
    .line 562
    invoke-direct {v0, v1, p1}, Lcom/zykj/mistake/feature/collection/detail/w;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 563
    .line 564
    .line 565
    invoke-virtual {p2, v0}, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;->d(Lcom/zykj/mistake/feature/collection/detail/y0;)V

    .line 566
    .line 567
    .line 568
    goto :goto_4

    .line 569
    :cond_12
    instance-of v0, p1, Lcom/zykj/mistake/main/r;

    .line 570
    .line 571
    if-eqz v0, :cond_14

    .line 572
    .line 573
    check-cast p1, Lcom/zykj/mistake/main/r;

    .line 574
    .line 575
    iget-object p1, p1, Lcom/zykj/mistake/main/r;->a:Lcom/zykj/mistake/platform/picker/CollectionDatePickerTarget;

    .line 576
    .line 577
    sget-object v0, Lcom/zykj/mistake/platform/picker/CollectionDatePickerTarget;->DETAIL_FILTER:Lcom/zykj/mistake/platform/picker/CollectionDatePickerTarget;

    .line 578
    .line 579
    if-eq p1, v0, :cond_13

    .line 580
    .line 581
    goto :goto_4

    .line 582
    :cond_13
    sget-object p1, Lcom/zykj/mistake/feature/collection/detail/k0;->a:Lcom/zykj/mistake/feature/collection/detail/k0;

    .line 583
    .line 584
    invoke-virtual {p2, p1}, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;->d(Lcom/zykj/mistake/feature/collection/detail/y0;)V

    .line 585
    .line 586
    .line 587
    :cond_14
    :goto_4
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 588
    .line 589
    return-object p1

    .line 590
    nop

    .line 591
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
