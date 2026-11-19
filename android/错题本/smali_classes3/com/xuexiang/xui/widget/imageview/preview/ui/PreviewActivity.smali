.class public Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;
.super Landroidx/fragment/app/FragmentActivity;
.source "SourceFile"


# static fields
.field public static final synthetic j:I


# instance fields
.field public a:Z

.field public b:Ljava/util/ArrayList;

.field public c:I

.field public d:Ljava/util/ArrayList;

.field public e:Lcom/xuexiang/xui/widget/imageview/preview/view/PhotoViewPager;

.field public f:Landroid/widget/TextView;

.field public g:Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;

.field public h:Lcom/xuexiang/xui/widget/imageview/preview/PreviewBuilder$IndicatorType;

.field public i:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/FragmentActivity;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->a:Z

    .line 6
    .line 7
    new-instance v0, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->d:Ljava/util/ArrayList;

    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->i:Z

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final o()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->finish()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-virtual {p0, v0, v0}, Landroid/app/Activity;->overridePendingTransition(II)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final onBackPressed()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->q()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 5

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/FragmentActivity;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    const-string v0, "com.xuexiang.xui.widget.preview.KEY_IMAGE_PATHS"

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getParcelableArrayListExtra(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->b:Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    const-string v0, "com.xuexiang.xui.widget.preview.KEY_POSITION"

    .line 21
    .line 22
    const/4 v1, -0x1

    .line 23
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->c:I

    .line 28
    .line 29
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    const-string v0, "com.xuexiang.xui.widget.preview.KEY_TYPE"

    .line 34
    .line 35
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    check-cast p1, Lcom/xuexiang/xui/widget/imageview/preview/PreviewBuilder$IndicatorType;

    .line 40
    .line 41
    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->h:Lcom/xuexiang/xui/widget/imageview/preview/PreviewBuilder$IndicatorType;

    .line 42
    .line 43
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    const-string v0, "com.xuexiang.xui.widget.preview.KEY_IS_SHOW"

    .line 48
    .line 49
    const/4 v1, 0x1

    .line 50
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->i:Z

    .line 55
    .line 56
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    const-string v0, "com.xuexiang.xui.widget.preview.KEY_DURATION"

    .line 61
    .line 62
    const/16 v2, 0x12c

    .line 63
    .line 64
    invoke-virtual {p1, v0, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    const-string v2, "com.xuexiang.xui.widget.preview.KEY_IS_FULLSCREEN"

    .line 73
    .line 74
    const/4 v3, 0x0

    .line 75
    invoke-virtual {v0, v2, v3}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-eqz v0, :cond_0

    .line 80
    .line 81
    const v0, 0x1030011

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0, v0}, Landroid/content/Context;->setTheme(I)V

    .line 85
    .line 86
    .line 87
    :cond_0
    :try_start_0
    invoke-static {p1}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->setDuration(I)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    const-string v0, "com.xuexiang.xui.widget.preview.KEY_CLASSNAME"

    .line 95
    .line 96
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    check-cast p1, Ljava/lang/Class;

    .line 101
    .line 102
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->b:Ljava/util/ArrayList;

    .line 103
    .line 104
    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->c:I

    .line 105
    .line 106
    invoke-virtual {p0, v0, v2, p1}, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->p(Ljava/util/ArrayList;ILjava/lang/Class;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 107
    .line 108
    .line 109
    goto :goto_0

    .line 110
    :catch_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->b:Ljava/util/ArrayList;

    .line 111
    .line 112
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->c:I

    .line 113
    .line 114
    const-class v2, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;

    .line 115
    .line 116
    invoke-virtual {p0, p1, v0, v2}, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->p(Ljava/util/ArrayList;ILjava/lang/Class;)V

    .line 117
    .line 118
    .line 119
    :goto_0
    # RE layout layout/preview_activity_image_photo (0x7f0c00de), APK res/As.xml
    sget p1, Lcom/xuexiang/xui/R$layout;->preview_activity_image_photo:I

    .line 120
    .line 121
    invoke-virtual {p0, p1}, Landroidx/activity/ComponentActivity;->setContentView(I)V

    .line 122
    .line 123
    .line 124
    sget p1, Lcom/xuexiang/xui/R$id;->viewPager:I

    .line 125
    .line 126
    invoke-virtual {p0, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    check-cast p1, Lcom/xuexiang/xui/widget/imageview/preview/view/PhotoViewPager;

    .line 131
    .line 132
    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->e:Lcom/xuexiang/xui/widget/imageview/preview/view/PhotoViewPager;

    .line 133
    .line 134
    new-instance p1, Lw2/f;

    .line 135
    .line 136
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    invoke-direct {p1, p0, v0}, Lw2/f;-><init>(Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;Landroidx/fragment/app/FragmentManager;)V

    .line 141
    .line 142
    .line 143
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->e:Lcom/xuexiang/xui/widget/imageview/preview/view/PhotoViewPager;

    .line 144
    .line 145
    invoke-virtual {v0, p1}, Landroidx/viewpager/widget/ViewPager;->setAdapter(Landroidx/viewpager/widget/PagerAdapter;)V

    .line 146
    .line 147
    .line 148
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->e:Lcom/xuexiang/xui/widget/imageview/preview/view/PhotoViewPager;

    .line 149
    .line 150
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->c:I

    .line 151
    .line 152
    invoke-virtual {p1, v0}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(I)V

    .line 153
    .line 154
    .line 155
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->e:Lcom/xuexiang/xui/widget/imageview/preview/view/PhotoViewPager;

    .line 156
    .line 157
    const/4 v0, 0x3

    .line 158
    invoke-virtual {p1, v0}, Landroidx/viewpager/widget/ViewPager;->setOffscreenPageLimit(I)V

    .line 159
    .line 160
    .line 161
    sget p1, Lcom/xuexiang/xui/R$id;->bezierBannerView:I

    .line 162
    .line 163
    invoke-virtual {p0, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    check-cast p1, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;

    .line 168
    .line 169
    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->g:Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;

    .line 170
    .line 171
    sget p1, Lcom/xuexiang/xui/R$id;->tv_index:I

    .line 172
    .line 173
    invoke-virtual {p0, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    check-cast p1, Landroid/widget/TextView;

    .line 178
    .line 179
    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->f:Landroid/widget/TextView;

    .line 180
    .line 181
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->h:Lcom/xuexiang/xui/widget/imageview/preview/PreviewBuilder$IndicatorType;

    .line 182
    .line 183
    sget-object v2, Lcom/xuexiang/xui/widget/imageview/preview/PreviewBuilder$IndicatorType;->Dot:Lcom/xuexiang/xui/widget/imageview/preview/PreviewBuilder$IndicatorType;

    .line 184
    .line 185
    if-ne v0, v2, :cond_2

    .line 186
    .line 187
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->g:Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;

    .line 188
    .line 189
    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 190
    .line 191
    .line 192
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->g:Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;

    .line 193
    .line 194
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->e:Lcom/xuexiang/xui/widget/imageview/preview/view/PhotoViewPager;

    .line 195
    .line 196
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 197
    .line 198
    .line 199
    invoke-virtual {v0, p1}, Landroidx/viewpager/widget/ViewPager;->addOnPageChangeListener(Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v0}, Landroidx/viewpager/widget/ViewPager;->getAdapter()Landroidx/viewpager/widget/PagerAdapter;

    .line 203
    .line 204
    .line 205
    move-result-object v2

    .line 206
    if-eqz v2, :cond_1

    .line 207
    .line 208
    invoke-virtual {v0}, Landroidx/viewpager/widget/ViewPager;->getAdapter()Landroidx/viewpager/widget/PagerAdapter;

    .line 209
    .line 210
    .line 211
    move-result-object v2

    .line 212
    invoke-virtual {v2}, Landroidx/viewpager/widget/PagerAdapter;->getCount()I

    .line 213
    .line 214
    .line 215
    move-result v2

    .line 216
    iput v2, p1, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->z:I

    .line 217
    .line 218
    :cond_1
    invoke-virtual {v0}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I

    .line 219
    .line 220
    .line 221
    move-result v0

    .line 222
    iput v0, p1, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->y:I

    .line 223
    .line 224
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->d()V

    .line 225
    .line 226
    .line 227
    const/4 v0, 0x2

    .line 228
    iput v0, p1, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->I:I

    .line 229
    .line 230
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    .line 231
    .line 232
    .line 233
    goto :goto_1

    .line 234
    :cond_2
    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 235
    .line 236
    .line 237
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->f:Landroid/widget/TextView;

    .line 238
    .line 239
    sget v0, Lcom/xuexiang/xui/R$string;->xui_preview_count_string:I

    .line 240
    .line 241
    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->c:I

    .line 242
    .line 243
    add-int/2addr v2, v1

    .line 244
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 245
    .line 246
    .line 247
    move-result-object v2

    .line 248
    iget-object v4, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->b:Ljava/util/ArrayList;

    .line 249
    .line 250
    if-eqz v4, :cond_3

    .line 251
    .line 252
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    .line 253
    .line 254
    .line 255
    move-result v3

    .line 256
    :cond_3
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 257
    .line 258
    .line 259
    move-result-object v3

    .line 260
    filled-new-array {v2, v3}, [Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object v2

    .line 264
    invoke-virtual {p0, v0, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 269
    .line 270
    .line 271
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->e:Lcom/xuexiang/xui/widget/imageview/preview/view/PhotoViewPager;

    .line 272
    .line 273
    new-instance v0, Lw2/c;

    .line 274
    .line 275
    invoke-direct {v0, p0}, Lw2/c;-><init>(Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;)V

    .line 276
    .line 277
    .line 278
    invoke-virtual {p1, v0}, Landroidx/viewpager/widget/ViewPager;->addOnPageChangeListener(Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;)V

    .line 279
    .line 280
    .line 281
    :goto_1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->d:Ljava/util/ArrayList;

    .line 282
    .line 283
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 284
    .line 285
    .line 286
    move-result p1

    .line 287
    if-ne p1, v1, :cond_4

    .line 288
    .line 289
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->i:Z

    .line 290
    .line 291
    if-nez p1, :cond_4

    .line 292
    .line 293
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->g:Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;

    .line 294
    .line 295
    const/16 v0, 0x8

    .line 296
    .line 297
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 298
    .line 299
    .line 300
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->f:Landroid/widget/TextView;

    .line 301
    .line 302
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 303
    .line 304
    .line 305
    :cond_4
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->e:Lcom/xuexiang/xui/widget/imageview/preview/view/PhotoViewPager;

    .line 306
    .line 307
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 308
    .line 309
    .line 310
    move-result-object p1

    .line 311
    new-instance v0, Lw2/d;

    .line 312
    .line 313
    invoke-direct {v0, p0}, Lw2/d;-><init>(Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;)V

    .line 314
    .line 315
    .line 316
    invoke-virtual {p1, v0}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 317
    .line 318
    .line 319
    return-void
.end method

.method public final onDestroy()V
    .locals 2

    .line 1
    invoke-static {}, Lu2/a;->a()Lu2/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Lu2/a;->a:Lio/reactivex/internal/operators/observable/c;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-static {p0}, Lcom/bumptech/glide/b;->c(Landroid/content/Context;)Lcom/bumptech/glide/b;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Lcom/bumptech/glide/b;->b()V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->e:Lcom/xuexiang/xui/widget/imageview/preview/view/PhotoViewPager;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Landroidx/viewpager/widget/ViewPager;->setAdapter(Landroidx/viewpager/widget/PagerAdapter;)V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->e:Lcom/xuexiang/xui/widget/imageview/preview/view/PhotoViewPager;

    .line 26
    .line 27
    invoke-virtual {v0}, Landroidx/viewpager/widget/ViewPager;->clearOnPageChangeListeners()V

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->e:Lcom/xuexiang/xui/widget/imageview/preview/view/PhotoViewPager;

    .line 31
    .line 32
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 33
    .line 34
    .line 35
    iput-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->e:Lcom/xuexiang/xui/widget/imageview/preview/view/PhotoViewPager;

    .line 36
    .line 37
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->d:Ljava/util/ArrayList;

    .line 38
    .line 39
    if-eqz v0, :cond_1

    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 42
    .line 43
    .line 44
    iput-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->d:Ljava/util/ArrayList;

    .line 45
    .line 46
    :cond_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->b:Ljava/util/ArrayList;

    .line 47
    .line 48
    if-eqz v0, :cond_2

    .line 49
    .line 50
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 51
    .line 52
    .line 53
    iput-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->b:Ljava/util/ArrayList;

    .line 54
    .line 55
    :cond_2
    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onDestroy()V

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method public final p(Ljava/util/ArrayList;ILjava/lang/Class;)V
    .locals 18

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    move v3, v2

    .line 11
    :goto_0
    if-ge v3, v1, :cond_1

    .line 12
    .line 13
    move-object/from16 v4, p0

    .line 14
    .line 15
    iget-object v5, v4, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->d:Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v6

    .line 21
    check-cast v6, Lcom/xuexiang/xui/widget/imageview/preview/enitity/IPreviewInfo;

    .line 22
    .line 23
    move/from16 v7, p2

    .line 24
    .line 25
    if-ne v7, v3, :cond_0

    .line 26
    .line 27
    const/4 v8, 0x1

    .line 28
    goto :goto_1

    .line 29
    :cond_0
    move v8, v2

    .line 30
    :goto_1
    invoke-virtual {v4}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 31
    .line 32
    .line 33
    move-result-object v9

    .line 34
    const-string v10, "com.xuexiang.xui.widget.preview.KEY_SING_FILING"

    .line 35
    .line 36
    invoke-virtual {v9, v10, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 37
    .line 38
    .line 39
    move-result v9

    .line 40
    invoke-virtual {v4}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 41
    .line 42
    .line 43
    move-result-object v11

    .line 44
    const-string v12, "com.xuexiang.xui.widget.preview.KEY_DRAG"

    .line 45
    .line 46
    invoke-virtual {v11, v12, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 47
    .line 48
    .line 49
    move-result v11

    .line 50
    invoke-virtual {v4}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 51
    .line 52
    .line 53
    move-result-object v13

    .line 54
    const/high16 v14, 0x3f000000    # 0.5f

    .line 55
    .line 56
    const-string v15, "com.xuexiang.xui.widget.preview.KEY_SENSITIVITY"

    .line 57
    .line 58
    invoke-virtual {v13, v15, v14}, Landroid/content/Intent;->getFloatExtra(Ljava/lang/String;F)F

    .line 59
    .line 60
    .line 61
    move-result v13

    .line 62
    invoke-virtual {v4}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 63
    .line 64
    .line 65
    move-result-object v14

    .line 66
    sget v2, Lcom/xuexiang/xui/R$color;->xui_config_color_main_theme:I

    .line 67
    .line 68
    const-string v0, "com.xuexiang.xui.widget.preview.KEY_PROGRESS_COLOR"

    .line 69
    .line 70
    invoke-virtual {v14, v0, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    :try_start_0
    invoke-virtual/range {p3 .. p3}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v14

    .line 78
    check-cast v14, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 79
    .line 80
    :goto_2
    move/from16 v16, v1

    .line 81
    .line 82
    goto :goto_3

    .line 83
    :catch_0
    new-instance v14, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;

    .line 84
    .line 85
    invoke-direct {v14}, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;-><init>()V

    .line 86
    .line 87
    .line 88
    goto :goto_2

    .line 89
    :goto_3
    new-instance v1, Landroid/os/Bundle;

    .line 90
    .line 91
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 92
    .line 93
    .line 94
    move/from16 v17, v3

    .line 95
    .line 96
    const-string v3, "com.xuexiang.xui.widget.preview.KEY_PREVIEW_ITEM"

    .line 97
    .line 98
    invoke-virtual {v1, v3, v6}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 99
    .line 100
    .line 101
    const-string v3, "com.xuexiang.xui.widget.preview.KEY_TRANS_PHOTO"

    .line 102
    .line 103
    invoke-virtual {v1, v3, v8}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v1, v10, v9}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v1, v12, v11}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v1, v15, v13}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v1, v0, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v14, v1}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v5, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    add-int/lit8 v3, v17, 0x1

    .line 125
    .line 126
    move-object/from16 v0, p1

    .line 127
    .line 128
    move/from16 v1, v16

    .line 129
    .line 130
    const/4 v2, 0x0

    .line 131
    goto :goto_0

    .line 132
    :cond_1
    move-object/from16 v4, p0

    .line 133
    .line 134
    return-void

    .line 135
    :cond_2
    move-object/from16 v4, p0

    .line 136
    .line 137
    invoke-super {v4}, Landroid/app/Activity;->finish()V

    .line 138
    .line 139
    .line 140
    return-void
.end method

.method public final q()V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->a:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->a:Z

    .line 8
    .line 9
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->e:Lcom/xuexiang/xui/widget/imageview/preview/view/PhotoViewPager;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->b:Ljava/util/ArrayList;

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    goto :goto_0

    .line 25
    :cond_1
    move v1, v2

    .line 26
    :goto_0
    if-ge v0, v1, :cond_3

    .line 27
    .line 28
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->d:Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;

    .line 35
    .line 36
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->f:Landroid/widget/TextView;

    .line 37
    .line 38
    const/16 v3, 0x8

    .line 39
    .line 40
    if-eqz v1, :cond_2

    .line 41
    .line 42
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_2
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->g:Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;

    .line 47
    .line 48
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 49
    .line 50
    .line 51
    :goto_1
    iget-object v1, v0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->c:Landroid/widget/ImageView;

    .line 52
    .line 53
    invoke-static {v1}, Landroidx/core/view/ViewCompat;->animate(Landroid/view/View;)Landroidx/core/view/ViewPropertyAnimatorCompat;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    const/4 v3, 0x0

    .line 58
    invoke-virtual {v1, v3}, Landroidx/core/view/ViewPropertyAnimatorCompat;->alpha(F)Landroidx/core/view/ViewPropertyAnimatorCompat;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    const-wide/16 v3, 0x1f4

    .line 63
    .line 64
    invoke-virtual {v1, v3, v4}, Landroidx/core/view/ViewPropertyAnimatorCompat;->setDuration(J)Landroidx/core/view/ViewPropertyAnimatorCompat;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-virtual {v1}, Landroidx/core/view/ViewPropertyAnimatorCompat;->start()V

    .line 69
    .line 70
    .line 71
    iget-object v1, v0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->b:Landroid/view/View;

    .line 72
    .line 73
    invoke-virtual {v1, v2}, Landroid/view/View;->setBackgroundColor(I)V

    .line 74
    .line 75
    .line 76
    new-instance v1, Lw2/e;

    .line 77
    .line 78
    invoke-direct {v1, p0}, Lw2/e;-><init>(Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;)V

    .line 79
    .line 80
    .line 81
    iget-object v0, v0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->a:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    .line 82
    .line 83
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->f(Lcom/xuexiang/xui/widget/imageview/preview/view/b;)V

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :cond_3
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->o()V

    .line 88
    .line 89
    .line 90
    return-void
.end method
