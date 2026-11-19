.class public final synthetic La8/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, La8/a;->a:I

    iput-object p1, p0, La8/a;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 11

    .line 1
    iget v0, p0, La8/a;->a:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    packed-switch v0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, La8/a;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Lcom/zykj/blackboard/core/record/TimeRecord;

    .line 10
    .line 11
    invoke-static {v0}, Lcom/zykj/blackboard/core/record/TimeRecord;->a(Lcom/zykj/blackboard/core/record/TimeRecord;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :pswitch_0
    iget-object v0, p0, La8/a;->b:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Ll4/i;

    .line 18
    .line 19
    invoke-virtual {v0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    const-string v3, "input_method"

    .line 24
    .line 25
    invoke-virtual {v2, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    instance-of v3, v2, Landroid/view/inputmethod/InputMethodManager;

    .line 30
    .line 31
    const/4 v4, 0x0

    .line 32
    if-eqz v3, :cond_0

    .line 33
    .line 34
    check-cast v2, Landroid/view/inputmethod/InputMethodManager;

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    move-object v2, v4

    .line 38
    :goto_0
    if-eqz v2, :cond_2

    .line 39
    .line 40
    iget-object v0, v0, Ll4/i;->b:Lcom/zykj/mistake/databinding/DialogMistakeTagAddBinding;

    .line 41
    .line 42
    if-eqz v0, :cond_1

    .line 43
    .line 44
    iget-object v0, v0, Lcom/zykj/mistake/databinding/DialogMistakeTagAddBinding;->a:Landroid/widget/EditText;

    .line 45
    .line 46
    invoke-virtual {v2, v0, v1}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    .line 47
    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    const-string v0, "mBinding"

    .line 51
    .line 52
    invoke-static {v0}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw v4

    .line 56
    :cond_2
    :goto_1
    return-void

    .line 57
    :pswitch_1
    iget-object v0, p0, La8/a;->b:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v0, Lio/objectbox/relation/ToMany;

    .line 60
    .line 61
    iget-object v1, v0, Lio/objectbox/relation/ToMany;->b:Lio/objectbox/a;

    .line 62
    .line 63
    invoke-virtual {v1}, Lio/objectbox/a;->b()Lio/objectbox/Cursor;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    iget-object v2, v0, Lio/objectbox/relation/ToMany;->c:Lio/objectbox/a;

    .line 68
    .line 69
    invoke-virtual {v2}, Lio/objectbox/a;->b()Lio/objectbox/Cursor;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    invoke-virtual {v0, v1, v2}, Lio/objectbox/relation/ToMany;->internalApplyToDb(Lio/objectbox/Cursor;Lio/objectbox/Cursor;)V

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :pswitch_2
    iget-object v0, p0, La8/a;->b:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v0, Lcom/zykj/mistake/application/MistakeApplication;

    .line 80
    .line 81
    sget v1, Lcom/zykj/mistake/application/MistakeApplication;->b:I

    .line 82
    .line 83
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    const-string v2, "getFilesDir(...)"

    .line 92
    .line 93
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    invoke-static {v1}, Lcom/zykj/mistake/utils/d;->a(Ljava/io/File;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    invoke-virtual {v1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    const-string v2, "getCacheDir(...)"

    .line 108
    .line 109
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    invoke-static {v1}, Lcom/zykj/mistake/utils/d;->a(Ljava/io/File;)V

    .line 113
    .line 114
    .line 115
    sget-object v1, Landroid/os/Environment;->DIRECTORY_DOCUMENTS:Ljava/lang/String;

    .line 116
    .line 117
    invoke-virtual {v0, v1}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    if-eqz v0, :cond_3

    .line 122
    .line 123
    invoke-static {v0}, Lcom/zykj/mistake/utils/d;->a(Ljava/io/File;)V

    .line 124
    .line 125
    .line 126
    :cond_3
    return-void

    .line 127
    :pswitch_3
    iget-object v0, p0, La8/a;->b:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v0, Lcom/zykj/mistake/widget/StemWebView;

    .line 130
    .line 131
    iget-object v2, v0, Lcom/zykj/mistake/widget/StemWebView;->a:Landroid/webkit/WebView;

    .line 132
    .line 133
    new-instance v3, Landroid/widget/RelativeLayout$LayoutParams;

    .line 134
    .line 135
    const/4 v4, -0x1

    .line 136
    invoke-direct {v3, v4, v4}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v2, v3}, Landroid/webkit/WebView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 143
    .line 144
    .line 145
    invoke-static {v2, v1}, Lcom/tencent/bugly/crashreport/CrashReport;->setJavascriptMonitor(Landroid/webkit/WebView;Z)Z

    .line 146
    .line 147
    .line 148
    iget v3, v0, Lcom/zykj/mistake/widget/StemWebView;->d:I

    .line 149
    .line 150
    invoke-virtual {v2, v3}, Landroid/webkit/WebView;->setInitialScale(I)V

    .line 151
    .line 152
    .line 153
    new-instance v3, Lf5/c;

    .line 154
    .line 155
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v2, v3}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 159
    .line 160
    .line 161
    const/4 v3, 0x0

    .line 162
    invoke-virtual {v2, v3}, Landroid/view/View;->setVerticalScrollBarEnabled(Z)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v2, v3}, Landroid/view/View;->setHorizontalScrollBarEnabled(Z)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v2}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 169
    .line 170
    .line 171
    move-result-object v4

    .line 172
    invoke-virtual {v4, v1}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v2}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 176
    .line 177
    .line 178
    move-result-object v4

    .line 179
    const/16 v5, 0x64

    .line 180
    .line 181
    invoke-virtual {v4, v5}, Landroid/webkit/WebSettings;->setTextZoom(I)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v2}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 185
    .line 186
    .line 187
    move-result-object v4

    .line 188
    invoke-virtual {v4, v3}, Landroid/webkit/WebSettings;->setMixedContentMode(I)V

    .line 189
    .line 190
    .line 191
    new-instance v4, Lf5/e;

    .line 192
    .line 193
    invoke-direct {v4, v0}, Lf5/e;-><init>(Lcom/zykj/mistake/widget/StemWebView;)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {v2, v4}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 197
    .line 198
    .line 199
    new-instance v2, Landroid/widget/LinearLayout;

    .line 200
    .line 201
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 202
    .line 203
    .line 204
    move-result-object v4

    .line 205
    invoke-direct {v2, v4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 206
    .line 207
    .line 208
    iput-object v2, v0, Lcom/zykj/mistake/widget/StemWebView;->g:Landroid/widget/LinearLayout;

    .line 209
    .line 210
    new-instance v4, Landroid/widget/RelativeLayout$LayoutParams;

    .line 211
    .line 212
    const/4 v5, -0x2

    .line 213
    invoke-direct {v4, v5, v5}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 217
    .line 218
    .line 219
    move-result-object v5

    .line 220
    sget v6, Lcom/zykj/mistake/R$dimen;->view_5:I

    .line 221
    .line 222
    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 223
    .line 224
    .line 225
    move-result v5

    .line 226
    iput v5, v4, Landroid/widget/RelativeLayout$LayoutParams;->rightMargin:I

    .line 227
    .line 228
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 229
    .line 230
    .line 231
    move-result-object v5

    .line 232
    sget v6, Lcom/zykj/mistake/R$dimen;->view_5:I

    .line 233
    .line 234
    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 235
    .line 236
    .line 237
    move-result v5

    .line 238
    iput v5, v4, Landroid/widget/RelativeLayout$LayoutParams;->topMargin:I

    .line 239
    .line 240
    const/16 v5, 0x15

    .line 241
    .line 242
    invoke-virtual {v4, v5}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {v2, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 249
    .line 250
    .line 251
    iget-boolean v4, v0, Lcom/zykj/mistake/widget/StemWebView;->h:Z

    .line 252
    .line 253
    if-eqz v4, :cond_4

    .line 254
    .line 255
    move v4, v3

    .line 256
    goto :goto_2

    .line 257
    :cond_4
    const/16 v4, 0x8

    .line 258
    .line 259
    :goto_2
    invoke-virtual {v2, v4}, Landroid/view/View;->setVisibility(I)V

    .line 260
    .line 261
    .line 262
    new-instance v4, Landroid/widget/ImageView;

    .line 263
    .line 264
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 265
    .line 266
    .line 267
    move-result-object v5

    .line 268
    invoke-direct {v4, v5}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 269
    .line 270
    .line 271
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    .line 272
    .line 273
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 274
    .line 275
    .line 276
    move-result-object v6

    .line 277
    sget v7, Lcom/zykj/mistake/R$dimen;->view_20:I

    .line 278
    .line 279
    invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 280
    .line 281
    .line 282
    move-result v6

    .line 283
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 284
    .line 285
    .line 286
    move-result-object v7

    .line 287
    sget v8, Lcom/zykj/mistake/R$dimen;->view_15:I

    .line 288
    .line 289
    invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 290
    .line 291
    .line 292
    move-result v7

    .line 293
    invoke-direct {v5, v6, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 294
    .line 295
    .line 296
    invoke-virtual {v4, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 297
    .line 298
    .line 299
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 300
    .line 301
    .line 302
    move-result-object v5

    .line 303
    sget v6, Lcom/zykj/mistake/R$dimen;->view_4:I

    .line 304
    .line 305
    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 306
    .line 307
    .line 308
    move-result v5

    .line 309
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 310
    .line 311
    .line 312
    move-result-object v6

    .line 313
    sget v7, Lcom/zykj/mistake/R$dimen;->view_2:I

    .line 314
    .line 315
    invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 316
    .line 317
    .line 318
    move-result v6

    .line 319
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 320
    .line 321
    .line 322
    move-result-object v7

    .line 323
    sget v8, Lcom/zykj/mistake/R$dimen;->view_4:I

    .line 324
    .line 325
    invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 326
    .line 327
    .line 328
    move-result v7

    .line 329
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 330
    .line 331
    .line 332
    move-result-object v8

    .line 333
    sget v9, Lcom/zykj/mistake/R$dimen;->view_2:I

    .line 334
    .line 335
    invoke-virtual {v8, v9}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 336
    .line 337
    .line 338
    move-result v8

    .line 339
    invoke-virtual {v4, v5, v6, v7, v8}, Landroid/view/View;->setPadding(IIII)V

    .line 340
    .line 341
    .line 342
    sget v5, Lcom/zykj/mistake/R$drawable;->ic_stem_enlarge:I

    .line 343
    .line 344
    invoke-virtual {v4, v5}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 345
    .line 346
    .line 347
    sget v5, Lcom/zykj/mistake/R$drawable;->selector_bg_stem_btn:I

    .line 348
    .line 349
    invoke-virtual {v4, v5}, Landroid/view/View;->setBackgroundResource(I)V

    .line 350
    .line 351
    .line 352
    invoke-virtual {v2, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 353
    .line 354
    .line 355
    new-instance v5, Landroid/widget/ImageView;

    .line 356
    .line 357
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 358
    .line 359
    .line 360
    move-result-object v6

    .line 361
    invoke-direct {v5, v6}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 362
    .line 363
    .line 364
    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    .line 365
    .line 366
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 367
    .line 368
    .line 369
    move-result-object v7

    .line 370
    sget v8, Lcom/zykj/mistake/R$dimen;->view_20:I

    .line 371
    .line 372
    invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 373
    .line 374
    .line 375
    move-result v7

    .line 376
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 377
    .line 378
    .line 379
    move-result-object v8

    .line 380
    sget v9, Lcom/zykj/mistake/R$dimen;->view_15:I

    .line 381
    .line 382
    invoke-virtual {v8, v9}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 383
    .line 384
    .line 385
    move-result v8

    .line 386
    invoke-direct {v6, v7, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 387
    .line 388
    .line 389
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 390
    .line 391
    .line 392
    move-result-object v7

    .line 393
    sget v8, Lcom/zykj/mistake/R$dimen;->view_3:I

    .line 394
    .line 395
    invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 396
    .line 397
    .line 398
    move-result v7

    .line 399
    iput v7, v6, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 400
    .line 401
    invoke-virtual {v5, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 402
    .line 403
    .line 404
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 405
    .line 406
    .line 407
    move-result-object v6

    .line 408
    sget v7, Lcom/zykj/mistake/R$dimen;->view_4:I

    .line 409
    .line 410
    invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 411
    .line 412
    .line 413
    move-result v6

    .line 414
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 415
    .line 416
    .line 417
    move-result-object v7

    .line 418
    sget v8, Lcom/zykj/mistake/R$dimen;->view_2:I

    .line 419
    .line 420
    invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 421
    .line 422
    .line 423
    move-result v7

    .line 424
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 425
    .line 426
    .line 427
    move-result-object v8

    .line 428
    sget v9, Lcom/zykj/mistake/R$dimen;->view_4:I

    .line 429
    .line 430
    invoke-virtual {v8, v9}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 431
    .line 432
    .line 433
    move-result v8

    .line 434
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 435
    .line 436
    .line 437
    move-result-object v9

    .line 438
    sget v10, Lcom/zykj/mistake/R$dimen;->view_2:I

    .line 439
    .line 440
    invoke-virtual {v9, v10}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 441
    .line 442
    .line 443
    move-result v9

    .line 444
    invoke-virtual {v5, v6, v7, v8, v9}, Landroid/view/View;->setPadding(IIII)V

    .line 445
    .line 446
    .line 447
    sget v6, Lcom/zykj/mistake/R$drawable;->ic_stem_reduce:I

    .line 448
    .line 449
    invoke-virtual {v5, v6}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 450
    .line 451
    .line 452
    sget v6, Lcom/zykj/mistake/R$drawable;->selector_bg_stem_btn:I

    .line 453
    .line 454
    invoke-virtual {v5, v6}, Landroid/view/View;->setBackgroundResource(I)V

    .line 455
    .line 456
    .line 457
    invoke-virtual {v2, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 458
    .line 459
    .line 460
    new-instance v2, Lf5/b;

    .line 461
    .line 462
    invoke-direct {v2, v0, v3}, Lf5/b;-><init>(Lcom/zykj/mistake/widget/StemWebView;I)V

    .line 463
    .line 464
    .line 465
    invoke-virtual {v4, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 466
    .line 467
    .line 468
    new-instance v2, Lf5/b;

    .line 469
    .line 470
    invoke-direct {v2, v0, v1}, Lf5/b;-><init>(Lcom/zykj/mistake/widget/StemWebView;I)V

    .line 471
    .line 472
    .line 473
    invoke-virtual {v5, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 474
    .line 475
    .line 476
    return-void

    .line 477
    :pswitch_4
    iget-object v0, p0, La8/a;->b:Ljava/lang/Object;

    .line 478
    .line 479
    check-cast v0, Lcom/zykj/sketch/core/record/SketchRecorderView;

    .line 480
    .line 481
    invoke-static {v0}, Lcom/zykj/sketch/core/record/SketchRecorderView;->a(Lcom/zykj/sketch/core/record/SketchRecorderView;)V

    .line 482
    .line 483
    .line 484
    return-void

    .line 485
    :pswitch_5
    iget-object v0, p0, La8/a;->b:Ljava/lang/Object;

    .line 486
    .line 487
    check-cast v0, Lcom/zykj/paint/render/SketchViewer;

    .line 488
    .line 489
    invoke-static {v0}, Lcom/zykj/paint/render/SketchViewer;->a(Lcom/zykj/paint/render/SketchViewer;)V

    .line 490
    .line 491
    .line 492
    return-void

    .line 493
    :pswitch_6
    iget-object v0, p0, La8/a;->b:Ljava/lang/Object;

    .line 494
    .line 495
    check-cast v0, Lcom/zykj/blackboard/core/edit/BoardControl;

    .line 496
    .line 497
    invoke-static {v0}, Lcom/zykj/blackboard/core/edit/BoardControl;->a(Lcom/zykj/blackboard/core/edit/BoardControl;)V

    .line 498
    .line 499
    .line 500
    return-void

    .line 501
    :pswitch_7
    iget-object v0, p0, La8/a;->b:Ljava/lang/Object;

    .line 502
    .line 503
    check-cast v0, Lcom/zykj/blackboard/core/edit/BasePageControl;

    .line 504
    .line 505
    invoke-static {v0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->b(Lcom/zykj/blackboard/core/edit/BasePageControl;)V

    .line 506
    .line 507
    .line 508
    return-void

    .line 509
    :pswitch_8
    iget-object v0, p0, La8/a;->b:Ljava/lang/Object;

    .line 510
    .line 511
    check-cast v0, Lcom/google/android/material/motion/MaterialBackOrchestrator;

    .line 512
    .line 513
    invoke-virtual {v0}, Lcom/google/android/material/motion/MaterialBackOrchestrator;->startListeningForBackCallbacksWithPriorityOverlay()V

    .line 514
    .line 515
    .line 516
    return-void

    .line 517
    :pswitch_9
    iget-object v0, p0, La8/a;->b:Ljava/lang/Object;

    .line 518
    .line 519
    check-cast v0, Lcom/google/android/material/carousel/CarouselLayoutManager;

    .line 520
    .line 521
    invoke-static {v0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->a(Lcom/google/android/material/carousel/CarouselLayoutManager;)V

    .line 522
    .line 523
    .line 524
    return-void

    .line 525
    :pswitch_a
    iget-object v0, p0, La8/a;->b:Ljava/lang/Object;

    .line 526
    .line 527
    check-cast v0, Landroidx/constraintlayout/helper/widget/Carousel;

    .line 528
    .line 529
    invoke-static {v0}, Landroidx/constraintlayout/helper/widget/Carousel;->a(Landroidx/constraintlayout/helper/widget/Carousel;)V

    .line 530
    .line 531
    .line 532
    return-void

    .line 533
    :pswitch_b
    iget-object v0, p0, La8/a;->b:Ljava/lang/Object;

    .line 534
    .line 535
    check-cast v0, Landroidx/compose/ui/text/input/TextInputServiceAndroid;

    .line 536
    .line 537
    invoke-static {v0}, Landroidx/compose/ui/text/input/TextInputServiceAndroid;->a(Landroidx/compose/ui/text/input/TextInputServiceAndroid;)V

    .line 538
    .line 539
    .line 540
    return-void

    .line 541
    :pswitch_c
    iget-object v0, p0, La8/a;->b:Ljava/lang/Object;

    .line 542
    .line 543
    check-cast v0, Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager;

    .line 544
    .line 545
    invoke-static {v0}, Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager;->a(Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager;)V

    .line 546
    .line 547
    .line 548
    return-void

    .line 549
    :pswitch_d
    iget-object v0, p0, La8/a;->b:Ljava/lang/Object;

    .line 550
    .line 551
    check-cast v0, Lr6/a;

    .line 552
    .line 553
    invoke-static {v0}, Landroidx/compose/ui/Actual_androidKt;->a(Lr6/a;)V

    .line 554
    .line 555
    .line 556
    return-void

    .line 557
    :pswitch_e
    iget-object v0, p0, La8/a;->b:Ljava/lang/Object;

    .line 558
    .line 559
    check-cast v0, Landroidx/compose/material/ripple/RippleHostView;

    .line 560
    .line 561
    invoke-static {v0}, Landroidx/compose/material/ripple/RippleHostView;->a(Landroidx/compose/material/ripple/RippleHostView;)V

    .line 562
    .line 563
    .line 564
    return-void

    .line 565
    :pswitch_f
    iget-object v0, p0, La8/a;->b:Ljava/lang/Object;

    .line 566
    .line 567
    check-cast v0, Landroidx/camera/video/internal/audio/AudioStream$AudioStreamCallback;

    .line 568
    .line 569
    invoke-static {v0}, Landroidx/camera/video/internal/audio/SilentAudioStream;->a(Landroidx/camera/video/internal/audio/AudioStream$AudioStreamCallback;)V

    .line 570
    .line 571
    .line 572
    return-void

    .line 573
    :pswitch_10
    iget-object v0, p0, La8/a;->b:Ljava/lang/Object;

    .line 574
    .line 575
    check-cast v0, Landroidx/camera/lifecycle/ProcessCameraProvider;

    .line 576
    .line 577
    invoke-static {v0}, Landroidx/camera/lifecycle/ProcessCameraProvider;->b(Landroidx/camera/lifecycle/ProcessCameraProvider;)V

    .line 578
    .line 579
    .line 580
    return-void

    .line 581
    :pswitch_11
    iget-object v0, p0, La8/a;->b:Ljava/lang/Object;

    .line 582
    .line 583
    check-cast v0, Landroidx/camera/core/processing/concurrent/DualSurfaceProcessorNode;

    .line 584
    .line 585
    invoke-static {v0}, Landroidx/camera/core/processing/concurrent/DualSurfaceProcessorNode;->a(Landroidx/camera/core/processing/concurrent/DualSurfaceProcessorNode;)V

    .line 586
    .line 587
    .line 588
    return-void

    .line 589
    :pswitch_12
    iget-object v0, p0, La8/a;->b:Ljava/lang/Object;

    .line 590
    .line 591
    check-cast v0, Landroidx/camera/core/processing/concurrent/DualSurfaceProcessor;

    .line 592
    .line 593
    invoke-static {v0}, Landroidx/camera/core/processing/concurrent/DualSurfaceProcessor;->d(Landroidx/camera/core/processing/concurrent/DualSurfaceProcessor;)V

    .line 594
    .line 595
    .line 596
    return-void

    .line 597
    :pswitch_13
    iget-object v0, p0, La8/a;->b:Ljava/lang/Object;

    .line 598
    .line 599
    check-cast v0, Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;

    .line 600
    .line 601
    invoke-static {v0}, Landroidx/camera/core/impl/utils/futures/Futures;->g(Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;)V

    .line 602
    .line 603
    .line 604
    return-void

    .line 605
    :pswitch_14
    iget-object v0, p0, La8/a;->b:Ljava/lang/Object;

    .line 606
    .line 607
    check-cast v0, Le1/a;

    .line 608
    .line 609
    invoke-static {v0}, Landroidx/camera/core/impl/DeferrableSurfaces;->b(Le1/a;)V

    .line 610
    .line 611
    .line 612
    return-void

    .line 613
    :pswitch_15
    iget-object v0, p0, La8/a;->b:Ljava/lang/Object;

    .line 614
    .line 615
    check-cast v0, Landroidx/camera/core/impl/CameraStateRegistry$OnConfigureAvailableListener;

    .line 616
    .line 617
    invoke-interface {v0}, Landroidx/camera/core/impl/CameraStateRegistry$OnConfigureAvailableListener;->onConfigureAvailable()V

    .line 618
    .line 619
    .line 620
    return-void

    .line 621
    :pswitch_16
    iget-object v0, p0, La8/a;->b:Ljava/lang/Object;

    .line 622
    .line 623
    check-cast v0, Landroidx/camera/core/impl/CameraStateRegistry$OnOpenAvailableListener;

    .line 624
    .line 625
    invoke-interface {v0}, Landroidx/camera/core/impl/CameraStateRegistry$OnOpenAvailableListener;->onOpenAvailable()V

    .line 626
    .line 627
    .line 628
    return-void

    .line 629
    :pswitch_17
    iget-object v0, p0, La8/a;->b:Ljava/lang/Object;

    .line 630
    .line 631
    check-cast v0, Landroidx/camera/camera2/interop/Camera2CameraControl;

    .line 632
    .line 633
    invoke-static {v0}, Landroidx/camera/camera2/interop/Camera2CameraControl;->d(Landroidx/camera/camera2/interop/Camera2CameraControl;)V

    .line 634
    .line 635
    .line 636
    return-void

    .line 637
    :pswitch_18
    iget-object v0, p0, La8/a;->b:Ljava/lang/Object;

    .line 638
    .line 639
    check-cast v0, Lorg/angmarch/views/NiceSpinner;

    .line 640
    .line 641
    invoke-virtual {v0}, Lorg/angmarch/views/NiceSpinner;->g()V

    .line 642
    .line 643
    .line 644
    return-void

    .line 645
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
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
