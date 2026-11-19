.class public abstract Lcom/xuexiang/xui/widget/activity/BaseGuideActivity;
.super Landroidx/appcompat/app/AppCompatActivity;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public abstract o()Ljava/util/List;
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 9

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/FragmentActivity;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x1

    .line 5
    invoke-virtual {p0, p1}, Landroid/app/Activity;->requestWindowFeature(I)Z

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/16 v1, 0x400

    .line 13
    .line 14
    invoke-virtual {v0, v1, v1}, Landroid/view/Window;->setFlags(II)V

    .line 15
    .line 16
    .line 17
    sget v0, Lcom/xuexiang/xui/R$layout;->xui_activity_guide:I

    .line 18
    .line 19
    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/activity/BaseGuideActivity;->o()Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/activity/BaseGuideActivity;->p()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    sget v2, Lcom/xuexiang/xui/R$id;->sgb:I

    .line 31
    .line 32
    invoke-virtual {p0, v2}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    check-cast v2, Lcom/xuexiang/xui/widget/banner/widget/banner/SimpleGuideBanner;

    .line 37
    .line 38
    const/high16 v3, 0x40c00000    # 6.0f

    .line 39
    .line 40
    invoke-virtual {v2, v3}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->a(F)I

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    iput v4, v2, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;->B:I

    .line 45
    .line 46
    invoke-virtual {v2, v3}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->a(F)I

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    iput v3, v2, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;->C:I

    .line 51
    .line 52
    const/high16 v3, 0x41400000    # 12.0f

    .line 53
    .line 54
    invoke-virtual {v2, v3}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->a(F)I

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    iput v3, v2, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;->D:I

    .line 59
    .line 60
    const/high16 v3, 0x40600000    # 3.5f

    .line 61
    .line 62
    invoke-virtual {v2, v3}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->a(F)I

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    iput v3, v2, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;->E:I

    .line 67
    .line 68
    const-class v3, Ly1/a;

    .line 69
    .line 70
    iput-object v3, v2, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;->J:Ljava/lang/Class;

    .line 71
    .line 72
    const-class v3, Lcom/xuexiang/xui/widget/banner/transform/DepthTransformer;

    .line 73
    .line 74
    iput-object v3, v2, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->m:Ljava/lang/Class;

    .line 75
    .line 76
    iget-object v3, v2, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->p:Landroid/widget/LinearLayout;

    .line 77
    .line 78
    const/4 v4, 0x0

    .line 79
    invoke-virtual {v2, v4}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->a(F)I

    .line 80
    .line 81
    .line 82
    move-result v5

    .line 83
    const/high16 v6, 0x41200000    # 10.0f

    .line 84
    .line 85
    invoke-virtual {v2, v6}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->a(F)I

    .line 86
    .line 87
    .line 88
    move-result v7

    .line 89
    invoke-virtual {v2, v4}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->a(F)I

    .line 90
    .line 91
    .line 92
    move-result v4

    .line 93
    invoke-virtual {v2, v6}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->a(F)I

    .line 94
    .line 95
    .line 96
    move-result v6

    .line 97
    invoke-virtual {v3, v5, v7, v4, v6}, Landroid/view/View;->setPadding(IIII)V

    .line 98
    .line 99
    .line 100
    iput-object v0, v2, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->e:Ljava/util/List;

    .line 101
    .line 102
    iput-boolean p1, v2, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->t:Z

    .line 103
    .line 104
    if-eqz v0, :cond_9

    .line 105
    .line 106
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    const/4 v3, 0x0

    .line 111
    if-lez v0, :cond_0

    .line 112
    .line 113
    iget v0, v2, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->f:I

    .line 114
    .line 115
    iget-object v4, v2, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->e:Ljava/util/List;

    .line 116
    .line 117
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 118
    .line 119
    .line 120
    move-result v4

    .line 121
    sub-int/2addr v4, p1

    .line 122
    if-le v0, v4, :cond_0

    .line 123
    .line 124
    iput v3, v2, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->f:I

    .line 125
    .line 126
    :cond_0
    iget-object v0, v2, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->x:Lb2/b;

    .line 127
    .line 128
    new-instance v4, Lb2/d;

    .line 129
    .line 130
    invoke-direct {v4, v2}, Lb2/d;-><init>(Lcom/xuexiang/xui/widget/banner/widget/banner/SimpleGuideBanner;)V

    .line 131
    .line 132
    .line 133
    iget-object v5, v2, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->d:Landroidx/viewpager/widget/ViewPager;

    .line 134
    .line 135
    invoke-virtual {v5, v4}, Landroidx/viewpager/widget/ViewPager;->setAdapter(Landroidx/viewpager/widget/PagerAdapter;)V

    .line 136
    .line 137
    .line 138
    iget-object v4, v2, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->d:Landroidx/viewpager/widget/ViewPager;

    .line 139
    .line 140
    iget-object v5, v2, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->e:Ljava/util/List;

    .line 141
    .line 142
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 143
    .line 144
    .line 145
    move-result v5

    .line 146
    sub-int/2addr v5, p1

    .line 147
    invoke-virtual {v4, v5}, Landroidx/viewpager/widget/ViewPager;->setOffscreenPageLimit(I)V

    .line 148
    .line 149
    .line 150
    :try_start_0
    iget-object v4, v2, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->m:Ljava/lang/Class;

    .line 151
    .line 152
    if-eqz v4, :cond_1

    .line 153
    .line 154
    iget-object v5, v2, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->d:Landroidx/viewpager/widget/ViewPager;

    .line 155
    .line 156
    invoke-virtual {v4}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v4

    .line 160
    check-cast v4, Landroidx/viewpager/widget/ViewPager$PageTransformer;

    .line 161
    .line 162
    invoke-virtual {v5, p1, v4}, Landroidx/viewpager/widget/ViewPager;->setPageTransformer(ZLandroidx/viewpager/widget/ViewPager$PageTransformer;)V

    .line 163
    .line 164
    .line 165
    iget-object v4, v2, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->d:Landroidx/viewpager/widget/ViewPager;

    .line 166
    .line 167
    instance-of v4, v4, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;

    .line 168
    .line 169
    if-eqz v4, :cond_2

    .line 170
    .line 171
    const/16 v4, 0x226

    .line 172
    .line 173
    iput v4, v2, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->l:I

    .line 174
    .line 175
    invoke-virtual {v2}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->g()V

    .line 176
    .line 177
    .line 178
    goto :goto_1

    .line 179
    :catch_0
    move-exception v4

    .line 180
    goto :goto_0

    .line 181
    :cond_1
    iget-object v4, v2, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->d:Landroidx/viewpager/widget/ViewPager;

    .line 182
    .line 183
    instance-of v4, v4, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;

    .line 184
    .line 185
    if-eqz v4, :cond_2

    .line 186
    .line 187
    const/16 v4, 0x1c2

    .line 188
    .line 189
    iput v4, v2, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->l:I

    .line 190
    .line 191
    invoke-virtual {v2}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->g()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 192
    .line 193
    .line 194
    goto :goto_1

    .line 195
    :goto_0
    invoke-virtual {v4}, Ljava/lang/Throwable;->printStackTrace()V

    .line 196
    .line 197
    .line 198
    :cond_2
    :goto_1
    if-eqz v0, :cond_3

    .line 199
    .line 200
    iget-object v4, v2, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->d:Landroidx/viewpager/widget/ViewPager;

    .line 201
    .line 202
    invoke-virtual {v4, v0}, Landroidx/viewpager/widget/ViewPager;->removeOnPageChangeListener(Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;)V

    .line 203
    .line 204
    .line 205
    :cond_3
    iget-object v4, v2, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->d:Landroidx/viewpager/widget/ViewPager;

    .line 206
    .line 207
    invoke-virtual {v4, v0}, Landroidx/viewpager/widget/ViewPager;->addOnPageChangeListener(Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;)V

    .line 208
    .line 209
    .line 210
    iget-object v0, v2, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;->z:Ljava/util/ArrayList;

    .line 211
    .line 212
    iget v4, v2, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;->A:I

    .line 213
    .line 214
    if-ne v4, p1, :cond_4

    .line 215
    .line 216
    iget p1, v2, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;->I:I

    .line 217
    .line 218
    iget v4, v2, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;->E:I

    .line 219
    .line 220
    int-to-float v4, v4

    .line 221
    new-instance v5, Landroid/graphics/drawable/GradientDrawable;

    .line 222
    .line 223
    invoke-direct {v5}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 224
    .line 225
    .line 226
    invoke-virtual {v5, v4}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v5, p1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 230
    .line 231
    .line 232
    iput-object v5, v2, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;->G:Landroid/graphics/drawable/Drawable;

    .line 233
    .line 234
    iget p1, v2, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;->H:I

    .line 235
    .line 236
    iget v4, v2, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;->E:I

    .line 237
    .line 238
    int-to-float v4, v4

    .line 239
    new-instance v5, Landroid/graphics/drawable/GradientDrawable;

    .line 240
    .line 241
    invoke-direct {v5}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 242
    .line 243
    .line 244
    invoke-virtual {v5, v4}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {v5, p1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 248
    .line 249
    .line 250
    iput-object v5, v2, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;->F:Landroid/graphics/drawable/Drawable;

    .line 251
    .line 252
    :cond_4
    iget-object p1, v2, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->e:Ljava/util/List;

    .line 253
    .line 254
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 255
    .line 256
    .line 257
    move-result p1

    .line 258
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 259
    .line 260
    .line 261
    iget-object v4, v2, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;->K:Landroid/widget/LinearLayout;

    .line 262
    .line 263
    invoke-virtual {v4}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 264
    .line 265
    .line 266
    move v4, v3

    .line 267
    :goto_2
    if-ge v4, p1, :cond_7

    .line 268
    .line 269
    new-instance v5, Landroid/widget/ImageView;

    .line 270
    .line 271
    iget-object v6, v2, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->b:Landroid/content/Context;

    .line 272
    .line 273
    invoke-direct {v5, v6}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 274
    .line 275
    .line 276
    iget v6, v2, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->f:I

    .line 277
    .line 278
    if-ne v4, v6, :cond_5

    .line 279
    .line 280
    iget-object v6, v2, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;->F:Landroid/graphics/drawable/Drawable;

    .line 281
    .line 282
    goto :goto_3

    .line 283
    :cond_5
    iget-object v6, v2, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;->G:Landroid/graphics/drawable/Drawable;

    .line 284
    .line 285
    :goto_3
    invoke-virtual {v5, v6}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 286
    .line 287
    .line 288
    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    .line 289
    .line 290
    iget v7, v2, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;->B:I

    .line 291
    .line 292
    iget v8, v2, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;->C:I

    .line 293
    .line 294
    invoke-direct {v6, v7, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 295
    .line 296
    .line 297
    if-nez v4, :cond_6

    .line 298
    .line 299
    move v7, v3

    .line 300
    goto :goto_4

    .line 301
    :cond_6
    iget v7, v2, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;->D:I

    .line 302
    .line 303
    :goto_4
    invoke-virtual {v6, v7}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 304
    .line 305
    .line 306
    iget-object v7, v2, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;->K:Landroid/widget/LinearLayout;

    .line 307
    .line 308
    invoke-virtual {v7, v5, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 309
    .line 310
    .line 311
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 312
    .line 313
    .line 314
    add-int/lit8 v4, v4, 0x1

    .line 315
    .line 316
    goto :goto_2

    .line 317
    :cond_7
    iget p1, v2, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->f:I

    .line 318
    .line 319
    invoke-virtual {v2, p1}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;->setCurrentIndicator(I)V

    .line 320
    .line 321
    .line 322
    iget-object p1, v2, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;->K:Landroid/widget/LinearLayout;

    .line 323
    .line 324
    if-eqz p1, :cond_8

    .line 325
    .line 326
    iget-object v0, v2, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->r:Landroid/widget/LinearLayout;

    .line 327
    .line 328
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 329
    .line 330
    .line 331
    iget-object v0, v2, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->r:Landroid/widget/LinearLayout;

    .line 332
    .line 333
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 334
    .line 335
    .line 336
    :cond_8
    invoke-virtual {v2}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->b()V

    .line 337
    .line 338
    .line 339
    new-instance p1, Lw1/a;

    .line 340
    .line 341
    invoke-direct {p1, p0, v1}, Lw1/a;-><init>(Lcom/xuexiang/xui/widget/activity/BaseGuideActivity;Ljava/lang/Class;)V

    .line 342
    .line 343
    .line 344
    invoke-virtual {v2, p1}, Lcom/xuexiang/xui/widget/banner/widget/banner/SimpleGuideBanner;->setOnJumpClickListener(La2/b;)V

    .line 345
    .line 346
    .line 347
    return-void

    .line 348
    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 349
    .line 350
    const-string v0, "Data source is empty,you must setSource() before startScroll()"

    .line 351
    .line 352
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 353
    .line 354
    .line 355
    throw p1
.end method

.method public abstract p()Ljava/lang/Class;
.end method
