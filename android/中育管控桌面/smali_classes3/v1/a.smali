.class public abstract Lv1/a;
.super Landroid/widget/RelativeLayout;
.source "SourceFile"

# interfaces
.implements Lio/github/inflationx/calligraphy3/HasTypeface;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lv1/a$e;,
        Lv1/a$d;
    }
.end annotation


# instance fields
.field public a:Ljava/util/concurrent/ScheduledExecutorService;

.field public b:Landroid/content/Context;

.field public c:Landroid/util/DisplayMetrics;

.field public d:Landroidx/viewpager/widget/ViewPager;

.field public e:Landroid/widget/RelativeLayout;

.field public f:Ljava/util/List;

.field public g:I

.field public h:I

.field public i:J

.field public j:J

.field public k:Z

.field public l:Z

.field public m:I

.field public n:Ljava/lang/Class;

.field public o:I

.field public p:I

.field public q:Landroid/widget/LinearLayout;

.field public r:Z

.field public s:Landroid/widget/LinearLayout;

.field public t:Landroid/widget/TextView;

.field public u:Z

.field public v:Z

.field public w:F

.field public x:Landroid/os/Handler;

.field public y:Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;

.field public z:Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

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
    iput-object v0, p0, Lv1/a;->f:Ljava/util/List;

    .line 10
    .line 11
    const/16 v0, 0x1c2

    .line 12
    .line 13
    iput v0, p0, Lv1/a;->m:I

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    iput-boolean v0, p0, Lv1/a;->u:Z

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    iput-boolean v0, p0, Lv1/a;->v:Z

    .line 20
    .line 21
    new-instance v0, Landroid/os/Handler;

    .line 22
    .line 23
    new-instance v1, Lv1/a$a;

    .line 24
    .line 25
    invoke-direct {v1, p0}, Lv1/a$a;-><init>(Lv1/a;)V

    .line 26
    .line 27
    .line 28
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Handler$Callback;)V

    .line 29
    .line 30
    .line 31
    iput-object v0, p0, Lv1/a;->x:Landroid/os/Handler;

    .line 32
    .line 33
    new-instance v0, Lv1/a$b;

    .line 34
    .line 35
    invoke-direct {v0, p0}, Lv1/a$b;-><init>(Lv1/a;)V

    .line 36
    .line 37
    .line 38
    iput-object v0, p0, Lv1/a;->y:Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;

    .line 39
    .line 40
    invoke-direct {p0, p1, p2}, Lv1/a;->k(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method private D()V
    .locals 1

    .line 1
    iget-object v0, p0, Lv1/a;->a:Ljava/util/concurrent/ScheduledExecutorService;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lv1/a;->a:Ljava/util/concurrent/ScheduledExecutorService;

    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public static synthetic a(Lv1/a;I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lv1/a;->u(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic b(Lv1/a;)Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;
    .locals 0

    .line 1
    iget-object p0, p0, Lv1/a;->z:Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic c(Lv1/a;)Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, Lv1/a;->t:Landroid/widget/TextView;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic d(Lv1/a;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lv1/a;->r:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic e(Lv1/a;)Landroid/widget/LinearLayout;
    .locals 0

    .line 1
    iget-object p0, p0, Lv1/a;->q:Landroid/widget/LinearLayout;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic f(Lv1/a;)Landroid/os/Handler;
    .locals 0

    .line 1
    iget-object p0, p0, Lv1/a;->x:Landroid/os/Handler;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic g(Lv1/a;)Lv1/a$e;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    return-object p0
.end method

.method private k(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    iput-object v1, v0, Lv1/a;->b:Landroid/content/Context;

    .line 8
    .line 9
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    iput-object v3, v0, Lv1/a;->c:Landroid/util/DisplayMetrics;

    .line 18
    .line 19
    sget-object v3, Lcom/xuexiang/xui/R$styleable;->BaseBanner:[I

    .line 20
    .line 21
    invoke-virtual {v1, v2, v3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    sget v4, Lcom/xuexiang/xui/R$styleable;->BaseBanner_bb_scale:I

    .line 26
    .line 27
    const/high16 v5, -0x40800000    # -1.0f

    .line 28
    .line 29
    invoke-virtual {v3, v4, v5}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    iput v4, v0, Lv1/a;->w:F

    .line 34
    .line 35
    sget v4, Lcom/xuexiang/xui/R$styleable;->BaseBanner_bb_isLoopEnable:I

    .line 36
    .line 37
    const/4 v5, 0x1

    .line 38
    invoke-virtual {v3, v4, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    sget v6, Lcom/xuexiang/xui/R$styleable;->BaseBanner_bb_delay:I

    .line 43
    .line 44
    const/4 v7, 0x5

    .line 45
    invoke-virtual {v3, v6, v7}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 46
    .line 47
    .line 48
    move-result v6

    .line 49
    int-to-long v8, v6

    .line 50
    iput-wide v8, v0, Lv1/a;->i:J

    .line 51
    .line 52
    sget v6, Lcom/xuexiang/xui/R$styleable;->BaseBanner_bb_period:I

    .line 53
    .line 54
    invoke-virtual {v3, v6, v7}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 55
    .line 56
    .line 57
    move-result v6

    .line 58
    int-to-long v8, v6

    .line 59
    iput-wide v8, v0, Lv1/a;->j:J

    .line 60
    .line 61
    sget v6, Lcom/xuexiang/xui/R$styleable;->BaseBanner_bb_isAutoScrollEnable:I

    .line 62
    .line 63
    invoke-virtual {v3, v6, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 64
    .line 65
    .line 66
    move-result v6

    .line 67
    iput-boolean v6, v0, Lv1/a;->k:Z

    .line 68
    .line 69
    sget v6, Lcom/xuexiang/xui/R$styleable;->BaseBanner_bb_barColor:I

    .line 70
    .line 71
    const/4 v8, 0x0

    .line 72
    invoke-virtual {v3, v6, v8}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 73
    .line 74
    .line 75
    move-result v6

    .line 76
    sget v9, Lcom/xuexiang/xui/R$styleable;->BaseBanner_bb_isBarShowWhenLast:I

    .line 77
    .line 78
    invoke-virtual {v3, v9, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 79
    .line 80
    .line 81
    move-result v9

    .line 82
    iput-boolean v9, v0, Lv1/a;->r:Z

    .line 83
    .line 84
    sget v9, Lcom/xuexiang/xui/R$styleable;->BaseBanner_bb_indicatorGravity:I

    .line 85
    .line 86
    const/16 v10, 0x11

    .line 87
    .line 88
    invoke-virtual {v3, v9, v10}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 89
    .line 90
    .line 91
    move-result v9

    .line 92
    sget v11, Lcom/xuexiang/xui/R$styleable;->BaseBanner_bb_barPaddingLeft:I

    .line 93
    .line 94
    const/high16 v12, 0x41200000    # 10.0f

    .line 95
    .line 96
    invoke-virtual {v0, v12}, Lv1/a;->i(F)I

    .line 97
    .line 98
    .line 99
    move-result v13

    .line 100
    int-to-float v13, v13

    .line 101
    invoke-virtual {v3, v11, v13}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 102
    .line 103
    .line 104
    move-result v11

    .line 105
    sget v13, Lcom/xuexiang/xui/R$styleable;->BaseBanner_bb_barPaddingTop:I

    .line 106
    .line 107
    const/high16 v15, 0x40c00000    # 6.0f

    .line 108
    .line 109
    if-ne v9, v10, :cond_0

    .line 110
    .line 111
    move v14, v15

    .line 112
    goto :goto_0

    .line 113
    :cond_0
    const/high16 v14, 0x40000000    # 2.0f

    .line 114
    .line 115
    :goto_0
    invoke-virtual {v0, v14}, Lv1/a;->i(F)I

    .line 116
    .line 117
    .line 118
    move-result v14

    .line 119
    int-to-float v14, v14

    .line 120
    invoke-virtual {v3, v13, v14}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 121
    .line 122
    .line 123
    move-result v13

    .line 124
    sget v14, Lcom/xuexiang/xui/R$styleable;->BaseBanner_bb_barPaddingRight:I

    .line 125
    .line 126
    invoke-virtual {v0, v12}, Lv1/a;->i(F)I

    .line 127
    .line 128
    .line 129
    move-result v12

    .line 130
    int-to-float v12, v12

    .line 131
    invoke-virtual {v3, v14, v12}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 132
    .line 133
    .line 134
    move-result v12

    .line 135
    sget v14, Lcom/xuexiang/xui/R$styleable;->BaseBanner_bb_barPaddingBottom:I

    .line 136
    .line 137
    if-ne v9, v10, :cond_1

    .line 138
    .line 139
    goto :goto_1

    .line 140
    :cond_1
    const/high16 v15, 0x40000000    # 2.0f

    .line 141
    .line 142
    :goto_1
    invoke-virtual {v0, v15}, Lv1/a;->i(F)I

    .line 143
    .line 144
    .line 145
    move-result v15

    .line 146
    int-to-float v15, v15

    .line 147
    invoke-virtual {v3, v14, v15}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 148
    .line 149
    .line 150
    move-result v14

    .line 151
    sget v15, Lcom/xuexiang/xui/R$styleable;->BaseBanner_bb_textColor:I

    .line 152
    .line 153
    const-string v16, "#ffffff"

    .line 154
    .line 155
    invoke-static/range {v16 .. v16}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 156
    .line 157
    .line 158
    move-result v7

    .line 159
    invoke-virtual {v3, v15, v7}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 160
    .line 161
    .line 162
    move-result v7

    .line 163
    sget v15, Lcom/xuexiang/xui/R$styleable;->BaseBanner_bb_textSize:I

    .line 164
    .line 165
    const/high16 v10, 0x41480000    # 12.5f

    .line 166
    .line 167
    invoke-virtual {v0, v10}, Lv1/a;->B(F)F

    .line 168
    .line 169
    .line 170
    move-result v10

    .line 171
    invoke-virtual {v3, v15, v10}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 172
    .line 173
    .line 174
    move-result v10

    .line 175
    sget v15, Lcom/xuexiang/xui/R$styleable;->BaseBanner_bb_isTitleShow:I

    .line 176
    .line 177
    invoke-virtual {v3, v15, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 178
    .line 179
    .line 180
    move-result v15

    .line 181
    sget v8, Lcom/xuexiang/xui/R$styleable;->BaseBanner_bb_isIndicatorShow:I

    .line 182
    .line 183
    invoke-virtual {v3, v8, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 184
    .line 185
    .line 186
    move-result v5

    .line 187
    invoke-virtual {v3}, Landroid/content/res/TypedArray;->recycle()V

    .line 188
    .line 189
    .line 190
    const/4 v3, -0x2

    .line 191
    if-eqz v2, :cond_2

    .line 192
    .line 193
    const-string v8, "http://schemas.android.com/apk/res/android"

    .line 194
    .line 195
    move/from16 v17, v4

    .line 196
    .line 197
    const-string v4, "layout_height"

    .line 198
    .line 199
    invoke-interface {v2, v8, v4, v3}, Landroid/util/AttributeSet;->getAttributeIntValue(Ljava/lang/String;Ljava/lang/String;I)I

    .line 200
    .line 201
    .line 202
    move-result v4

    .line 203
    goto :goto_2

    .line 204
    :cond_2
    move/from16 v17, v4

    .line 205
    .line 206
    move v4, v3

    .line 207
    :goto_2
    if-eqz v17, :cond_3

    .line 208
    .line 209
    new-instance v8, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;

    .line 210
    .line 211
    invoke-direct {v8, v1}, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;-><init>(Landroid/content/Context;)V

    .line 212
    .line 213
    .line 214
    goto :goto_3

    .line 215
    :cond_3
    new-instance v8, Landroidx/viewpager/widget/ViewPager;

    .line 216
    .line 217
    invoke-direct {v8, v1}, Landroidx/viewpager/widget/ViewPager;-><init>(Landroid/content/Context;)V

    .line 218
    .line 219
    .line 220
    :goto_3
    iput-object v8, v0, Lv1/a;->d:Landroidx/viewpager/widget/ViewPager;

    .line 221
    .line 222
    const/4 v3, 0x2

    .line 223
    invoke-virtual {v8, v3}, Landroid/view/View;->setOverScrollMode(I)V

    .line 224
    .line 225
    .line 226
    iget-object v3, v0, Lv1/a;->c:Landroid/util/DisplayMetrics;

    .line 227
    .line 228
    iget v3, v3, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 229
    .line 230
    iput v3, v0, Lv1/a;->o:I

    .line 231
    .line 232
    invoke-virtual {v0, v1, v4, v2}, Lv1/a;->l(Landroid/content/Context;ILandroid/util/AttributeSet;)V

    .line 233
    .line 234
    .line 235
    new-instance v2, Landroid/widget/RelativeLayout$LayoutParams;

    .line 236
    .line 237
    iget v3, v0, Lv1/a;->o:I

    .line 238
    .line 239
    iget v4, v0, Lv1/a;->p:I

    .line 240
    .line 241
    invoke-direct {v2, v3, v4}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 242
    .line 243
    .line 244
    iget-object v3, v0, Lv1/a;->d:Landroidx/viewpager/widget/ViewPager;

    .line 245
    .line 246
    invoke-virtual {v0, v3, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 247
    .line 248
    .line 249
    new-instance v3, Landroid/widget/RelativeLayout;

    .line 250
    .line 251
    invoke-direct {v3, v1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 252
    .line 253
    .line 254
    iput-object v3, v0, Lv1/a;->e:Landroid/widget/RelativeLayout;

    .line 255
    .line 256
    invoke-virtual {v0, v3, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 257
    .line 258
    .line 259
    new-instance v2, Landroid/widget/LinearLayout;

    .line 260
    .line 261
    invoke-direct {v2, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 262
    .line 263
    .line 264
    iput-object v2, v0, Lv1/a;->q:Landroid/widget/LinearLayout;

    .line 265
    .line 266
    new-instance v2, Landroid/widget/RelativeLayout$LayoutParams;

    .line 267
    .line 268
    iget v3, v0, Lv1/a;->o:I

    .line 269
    .line 270
    const/4 v4, -0x2

    .line 271
    invoke-direct {v2, v3, v4}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 272
    .line 273
    .line 274
    const/16 v3, 0xc

    .line 275
    .line 276
    const/4 v4, -0x1

    .line 277
    invoke-virtual {v2, v3, v4}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 278
    .line 279
    .line 280
    iget-object v3, v0, Lv1/a;->e:Landroid/widget/RelativeLayout;

    .line 281
    .line 282
    iget-object v4, v0, Lv1/a;->q:Landroid/widget/LinearLayout;

    .line 283
    .line 284
    invoke-virtual {v3, v4, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 285
    .line 286
    .line 287
    iget-object v2, v0, Lv1/a;->q:Landroid/widget/LinearLayout;

    .line 288
    .line 289
    invoke-virtual {v2, v6}, Landroid/view/View;->setBackgroundColor(I)V

    .line 290
    .line 291
    .line 292
    iget-object v2, v0, Lv1/a;->q:Landroid/widget/LinearLayout;

    .line 293
    .line 294
    float-to-int v3, v11

    .line 295
    float-to-int v4, v13

    .line 296
    float-to-int v6, v12

    .line 297
    float-to-int v8, v14

    .line 298
    invoke-virtual {v2, v3, v4, v6, v8}, Landroid/view/View;->setPadding(IIII)V

    .line 299
    .line 300
    .line 301
    iget-object v2, v0, Lv1/a;->q:Landroid/widget/LinearLayout;

    .line 302
    .line 303
    const/4 v3, 0x0

    .line 304
    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 305
    .line 306
    .line 307
    iget-object v2, v0, Lv1/a;->q:Landroid/widget/LinearLayout;

    .line 308
    .line 309
    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 310
    .line 311
    .line 312
    invoke-virtual {v0, v1, v5}, Lv1/a;->m(Landroid/content/Context;Z)V

    .line 313
    .line 314
    .line 315
    invoke-virtual {v0, v1, v7, v10, v15}, Lv1/a;->n(Landroid/content/Context;IFZ)V

    .line 316
    .line 317
    .line 318
    const/16 v1, 0x11

    .line 319
    .line 320
    if-ne v9, v1, :cond_4

    .line 321
    .line 322
    iget-object v2, v0, Lv1/a;->q:Landroid/widget/LinearLayout;

    .line 323
    .line 324
    invoke-virtual {v2, v1}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 325
    .line 326
    .line 327
    iget-object v1, v0, Lv1/a;->q:Landroid/widget/LinearLayout;

    .line 328
    .line 329
    iget-object v2, v0, Lv1/a;->s:Landroid/widget/LinearLayout;

    .line 330
    .line 331
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 332
    .line 333
    .line 334
    return-void

    .line 335
    :cond_4
    const/4 v1, 0x3

    .line 336
    const/high16 v2, 0x40e00000    # 7.0f

    .line 337
    .line 338
    const/16 v3, 0x10

    .line 339
    .line 340
    const/4 v4, 0x5

    .line 341
    if-ne v9, v4, :cond_5

    .line 342
    .line 343
    iget-object v4, v0, Lv1/a;->q:Landroid/widget/LinearLayout;

    .line 344
    .line 345
    invoke-virtual {v4, v3}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 346
    .line 347
    .line 348
    iget-object v3, v0, Lv1/a;->q:Landroid/widget/LinearLayout;

    .line 349
    .line 350
    iget-object v4, v0, Lv1/a;->t:Landroid/widget/TextView;

    .line 351
    .line 352
    invoke-virtual {v3, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 353
    .line 354
    .line 355
    iget-object v3, v0, Lv1/a;->q:Landroid/widget/LinearLayout;

    .line 356
    .line 357
    iget-object v4, v0, Lv1/a;->s:Landroid/widget/LinearLayout;

    .line 358
    .line 359
    invoke-virtual {v3, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 360
    .line 361
    .line 362
    iget-object v3, v0, Lv1/a;->t:Landroid/widget/TextView;

    .line 363
    .line 364
    invoke-virtual {v0, v2}, Lv1/a;->i(F)I

    .line 365
    .line 366
    .line 367
    move-result v2

    .line 368
    const/4 v4, 0x0

    .line 369
    invoke-virtual {v3, v4, v4, v2, v4}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 370
    .line 371
    .line 372
    iget-object v2, v0, Lv1/a;->t:Landroid/widget/TextView;

    .line 373
    .line 374
    sget-object v3, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 375
    .line 376
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 377
    .line 378
    .line 379
    iget-object v2, v0, Lv1/a;->t:Landroid/widget/TextView;

    .line 380
    .line 381
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setGravity(I)V

    .line 382
    .line 383
    .line 384
    return-void

    .line 385
    :cond_5
    if-ne v9, v1, :cond_6

    .line 386
    .line 387
    iget-object v1, v0, Lv1/a;->q:Landroid/widget/LinearLayout;

    .line 388
    .line 389
    invoke-virtual {v1, v3}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 390
    .line 391
    .line 392
    iget-object v1, v0, Lv1/a;->q:Landroid/widget/LinearLayout;

    .line 393
    .line 394
    iget-object v3, v0, Lv1/a;->s:Landroid/widget/LinearLayout;

    .line 395
    .line 396
    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 397
    .line 398
    .line 399
    iget-object v1, v0, Lv1/a;->q:Landroid/widget/LinearLayout;

    .line 400
    .line 401
    iget-object v3, v0, Lv1/a;->t:Landroid/widget/TextView;

    .line 402
    .line 403
    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 404
    .line 405
    .line 406
    iget-object v1, v0, Lv1/a;->t:Landroid/widget/TextView;

    .line 407
    .line 408
    invoke-virtual {v0, v2}, Lv1/a;->i(F)I

    .line 409
    .line 410
    .line 411
    move-result v2

    .line 412
    const/4 v3, 0x0

    .line 413
    invoke-virtual {v1, v2, v3, v3, v3}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 414
    .line 415
    .line 416
    iget-object v1, v0, Lv1/a;->t:Landroid/widget/TextView;

    .line 417
    .line 418
    sget-object v2, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 419
    .line 420
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 421
    .line 422
    .line 423
    iget-object v1, v0, Lv1/a;->t:Landroid/widget/TextView;

    .line 424
    .line 425
    const/4 v4, 0x5

    .line 426
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setGravity(I)V

    .line 427
    .line 428
    .line 429
    :cond_6
    return-void
.end method


# virtual methods
.method public final A()V
    .locals 3

    .line 1
    new-instance v0, Lv1/a$d;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lv1/a$d;-><init>(Lv1/a;Lv1/a$a;)V

    .line 5
    .line 6
    .line 7
    iget-object v1, p0, Lv1/a;->d:Landroidx/viewpager/widget/ViewPager;

    .line 8
    .line 9
    invoke-virtual {v1, v0}, Landroidx/viewpager/widget/ViewPager;->setAdapter(Landroidx/viewpager/widget/PagerAdapter;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lv1/a;->d:Landroidx/viewpager/widget/ViewPager;

    .line 13
    .line 14
    iget-object v1, p0, Lv1/a;->f:Ljava/util/List;

    .line 15
    .line 16
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    const/4 v2, 0x1

    .line 21
    sub-int/2addr v1, v2

    .line 22
    invoke-virtual {v0, v1}, Landroidx/viewpager/widget/ViewPager;->setOffscreenPageLimit(I)V

    .line 23
    .line 24
    .line 25
    :try_start_0
    iget-object v0, p0, Lv1/a;->n:Ljava/lang/Class;

    .line 26
    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    iget-object v1, p0, Lv1/a;->d:Landroidx/viewpager/widget/ViewPager;

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, Landroidx/viewpager/widget/ViewPager$PageTransformer;

    .line 36
    .line 37
    invoke-virtual {v1, v2, v0}, Landroidx/viewpager/widget/ViewPager;->setPageTransformer(ZLandroidx/viewpager/widget/ViewPager$PageTransformer;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Lv1/a;->o()Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-eqz v0, :cond_1

    .line 45
    .line 46
    const/16 v0, 0x226

    .line 47
    .line 48
    iput v0, p0, Lv1/a;->m:I

    .line 49
    .line 50
    invoke-virtual {p0}, Lv1/a;->x()V

    .line 51
    .line 52
    .line 53
    goto :goto_1

    .line 54
    :catch_0
    move-exception v0

    .line 55
    goto :goto_0

    .line 56
    :cond_0
    invoke-virtual {p0}, Lv1/a;->o()Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-eqz v0, :cond_1

    .line 61
    .line 62
    const/16 v0, 0x1c2

    .line 63
    .line 64
    iput v0, p0, Lv1/a;->m:I

    .line 65
    .line 66
    invoke-virtual {p0}, Lv1/a;->x()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 67
    .line 68
    .line 69
    goto :goto_1

    .line 70
    :goto_0
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 71
    .line 72
    .line 73
    :cond_1
    :goto_1
    iget-object v0, p0, Lv1/a;->y:Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;

    .line 74
    .line 75
    if-eqz v0, :cond_2

    .line 76
    .line 77
    iget-object v1, p0, Lv1/a;->d:Landroidx/viewpager/widget/ViewPager;

    .line 78
    .line 79
    invoke-virtual {v1, v0}, Landroidx/viewpager/widget/ViewPager;->removeOnPageChangeListener(Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;)V

    .line 80
    .line 81
    .line 82
    iget-object v0, p0, Lv1/a;->d:Landroidx/viewpager/widget/ViewPager;

    .line 83
    .line 84
    iget-object v1, p0, Lv1/a;->y:Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;

    .line 85
    .line 86
    invoke-virtual {v0, v1}, Landroidx/viewpager/widget/ViewPager;->addOnPageChangeListener(Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;)V

    .line 87
    .line 88
    .line 89
    :cond_2
    return-void
.end method

.method public final B(F)F
    .locals 1

    .line 1
    iget-object v0, p0, Lv1/a;->b:Landroid/content/Context;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget v0, v0, Landroid/util/DisplayMetrics;->scaledDensity:F

    .line 12
    .line 13
    mul-float/2addr p1, v0

    .line 14
    return p1
.end method

.method public C()V
    .locals 2

    .line 1
    iget-object v0, p0, Lv1/a;->f:Ljava/util/List;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-lez v0, :cond_0

    .line 10
    .line 11
    iget v0, p0, Lv1/a;->g:I

    .line 12
    .line 13
    iget-object v1, p0, Lv1/a;->f:Ljava/util/List;

    .line 14
    .line 15
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    add-int/lit8 v1, v1, -0x1

    .line 20
    .line 21
    if-le v0, v1, :cond_0

    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    iput v0, p0, Lv1/a;->g:I

    .line 25
    .line 26
    :cond_0
    iget-object v0, p0, Lv1/a;->t:Landroid/widget/TextView;

    .line 27
    .line 28
    iget v1, p0, Lv1/a;->g:I

    .line 29
    .line 30
    invoke-virtual {p0, v0, v1}, Lv1/a;->s(Landroid/widget/TextView;I)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Lv1/a;->A()V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Lv1/a;->q()Landroid/view/View;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    if-eqz v0, :cond_1

    .line 41
    .line 42
    iget-object v1, p0, Lv1/a;->s:Landroid/widget/LinearLayout;

    .line 43
    .line 44
    invoke-virtual {v1}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 45
    .line 46
    .line 47
    iget-object v1, p0, Lv1/a;->s:Landroid/widget/LinearLayout;

    .line 48
    .line 49
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 50
    .line 51
    .line 52
    :cond_1
    invoke-virtual {p0}, Lv1/a;->j()V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 57
    .line 58
    const-string v1, "Data source is empty,you must setSource() before startScroll()"

    .line 59
    .line 60
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    throw v0
.end method

.method public final E()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lv1/a;->o()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lv1/a;->d:Landroidx/viewpager/widget/ViewPager;

    .line 8
    .line 9
    check-cast v0, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;

    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;->getPageAdapterWrapper()Landroidx/viewpager/widget/PagerAdapter;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Landroidx/viewpager/widget/PagerAdapter;->notifyDataSetChanged()V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    iget-object v0, p0, Lv1/a;->d:Landroidx/viewpager/widget/ViewPager;

    .line 20
    .line 21
    invoke-virtual {v0}, Landroidx/viewpager/widget/ViewPager;->getAdapter()Landroidx/viewpager/widget/PagerAdapter;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    iget-object v0, p0, Lv1/a;->d:Landroidx/viewpager/widget/ViewPager;

    .line 28
    .line 29
    invoke-virtual {v0}, Landroidx/viewpager/widget/ViewPager;->getAdapter()Landroidx/viewpager/widget/PagerAdapter;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {v0}, Landroidx/viewpager/widget/PagerAdapter;->notifyDataSetChanged()V

    .line 34
    .line 35
    .line 36
    :cond_1
    return-void
.end method

.method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    if-eq v0, v1, :cond_1

    .line 9
    .line 10
    const/4 v1, 0x3

    .line 11
    if-eq v0, v1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-virtual {p0}, Lv1/a;->j()V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    invoke-virtual {p0}, Lv1/a;->j()V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_2
    invoke-virtual {p0}, Lv1/a;->t()V

    .line 23
    .line 24
    .line 25
    :goto_0
    invoke-super {p0, p1}, Landroid/view/View;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    return p1
.end method

.method public getContainerScale()F
    .locals 1

    .line 1
    iget v0, p0, Lv1/a;->w:F

    .line 2
    .line 3
    return v0
.end method

.method public getItemHeight()I
    .locals 1

    .line 1
    iget v0, p0, Lv1/a;->p:I

    .line 2
    .line 3
    return v0
.end method

.method public getItemWidth()I
    .locals 1

    .line 1
    iget v0, p0, Lv1/a;->o:I

    .line 2
    .line 3
    return v0
.end method

.method public getViewPager()Landroidx/viewpager/widget/ViewPager;
    .locals 1

    .line 1
    iget-object v0, p0, Lv1/a;->d:Landroidx/viewpager/widget/ViewPager;

    .line 2
    .line 3
    return-object v0
.end method

.method public h(FFFF)Lv1/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lv1/a;->q:Landroid/widget/LinearLayout;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lv1/a;->i(F)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-virtual {p0, p2}, Lv1/a;->i(F)I

    .line 8
    .line 9
    .line 10
    move-result p2

    .line 11
    invoke-virtual {p0, p3}, Lv1/a;->i(F)I

    .line 12
    .line 13
    .line 14
    move-result p3

    .line 15
    invoke-virtual {p0, p4}, Lv1/a;->i(F)I

    .line 16
    .line 17
    .line 18
    move-result p4

    .line 19
    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/view/View;->setPadding(IIII)V

    .line 20
    .line 21
    .line 22
    return-object p0
.end method

.method public i(F)I
    .locals 1

    .line 1
    iget-object v0, p0, Lv1/a;->b:Landroid/content/Context;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    .line 12
    .line 13
    mul-float/2addr p1, v0

    .line 14
    const/high16 v0, 0x3f000000    # 0.5f

    .line 15
    .line 16
    add-float/2addr p1, v0

    .line 17
    float-to-int p1, p1

    .line 18
    return p1
.end method

.method public j()V
    .locals 8

    .line 1
    invoke-virtual {p0}, Lv1/a;->p()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget-boolean v0, p0, Lv1/a;->l:Z

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    :goto_0
    return-void

    .line 13
    :cond_1
    invoke-virtual {p0}, Lv1/a;->o()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    iget-boolean v0, p0, Lv1/a;->k:Z

    .line 20
    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    invoke-virtual {p0}, Lv1/a;->t()V

    .line 24
    .line 25
    .line 26
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor()Ljava/util/concurrent/ScheduledExecutorService;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    iput-object v1, p0, Lv1/a;->a:Ljava/util/concurrent/ScheduledExecutorService;

    .line 31
    .line 32
    new-instance v2, Lv1/a$c;

    .line 33
    .line 34
    invoke-direct {v2, p0}, Lv1/a$c;-><init>(Lv1/a;)V

    .line 35
    .line 36
    .line 37
    iget-wide v3, p0, Lv1/a;->i:J

    .line 38
    .line 39
    iget-wide v5, p0, Lv1/a;->j:J

    .line 40
    .line 41
    sget-object v7, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 42
    .line 43
    invoke-interface/range {v1 .. v7}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleAtFixedRate(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 44
    .line 45
    .line 46
    const/4 v0, 0x1

    .line 47
    iput-boolean v0, p0, Lv1/a;->l:Z

    .line 48
    .line 49
    new-instance v0, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    const-string v1, "--->goOnScroll()"

    .line 66
    .line 67
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-static {v0}, Lq1/c;->a(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :cond_2
    const/4 v0, 0x0

    .line 79
    iput-boolean v0, p0, Lv1/a;->l:Z

    .line 80
    .line 81
    return-void
.end method

.method public final l(Landroid/content/Context;ILandroid/util/AttributeSet;)V
    .locals 2

    .line 1
    iget v0, p0, Lv1/a;->w:F

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    cmpg-float v1, v0, v1

    .line 5
    .line 6
    if-gez v1, :cond_2

    .line 7
    .line 8
    const/4 v0, -0x1

    .line 9
    if-eq p2, v0, :cond_1

    .line 10
    .line 11
    const/4 v0, -0x2

    .line 12
    if-ne p2, v0, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const p2, 0x10100f5

    .line 16
    .line 17
    .line 18
    filled-new-array {p2}, [I

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    invoke-virtual {p1, p3, p2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    const/4 p2, 0x0

    .line 27
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 32
    .line 33
    .line 34
    iput p2, p0, Lv1/a;->p:I

    .line 35
    .line 36
    return-void

    .line 37
    :cond_1
    :goto_0
    iput p2, p0, Lv1/a;->p:I

    .line 38
    .line 39
    return-void

    .line 40
    :cond_2
    const/high16 p1, 0x3f800000    # 1.0f

    .line 41
    .line 42
    cmpl-float p2, v0, p1

    .line 43
    .line 44
    if-lez p2, :cond_3

    .line 45
    .line 46
    iput p1, p0, Lv1/a;->w:F

    .line 47
    .line 48
    :cond_3
    iget p1, p0, Lv1/a;->o:I

    .line 49
    .line 50
    int-to-float p1, p1

    .line 51
    iget p2, p0, Lv1/a;->w:F

    .line 52
    .line 53
    mul-float/2addr p1, p2

    .line 54
    float-to-int p1, p1

    .line 55
    iput p1, p0, Lv1/a;->p:I

    .line 56
    .line 57
    return-void
.end method

.method public final m(Landroid/content/Context;Z)V
    .locals 1

    .line 1
    new-instance v0, Landroid/widget/LinearLayout;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lv1/a;->s:Landroid/widget/LinearLayout;

    .line 7
    .line 8
    const/16 p1, 0x11

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, Lv1/a;->s:Landroid/widget/LinearLayout;

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    if-eqz p2, :cond_0

    .line 17
    .line 18
    move p2, v0

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 p2, 0x4

    .line 21
    :goto_0
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 22
    .line 23
    .line 24
    iget-object p1, p0, Lv1/a;->s:Landroid/widget/LinearLayout;

    .line 25
    .line 26
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 27
    .line 28
    .line 29
    iget-object p1, p0, Lv1/a;->s:Landroid/widget/LinearLayout;

    .line 30
    .line 31
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public final n(Landroid/content/Context;IFZ)V
    .locals 4

    .line 1
    new-instance v0, Landroid/widget/TextView;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lv1/a;->t:Landroid/widget/TextView;

    .line 7
    .line 8
    new-instance p1, Landroid/widget/LinearLayout$LayoutParams;

    .line 9
    .line 10
    const/4 v1, -0x2

    .line 11
    const/high16 v2, 0x3f800000    # 1.0f

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    invoke-direct {p1, v3, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 18
    .line 19
    .line 20
    iget-object p1, p0, Lv1/a;->t:Landroid/widget/TextView;

    .line 21
    .line 22
    const/4 v0, 0x1

    .line 23
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 24
    .line 25
    .line 26
    iget-object p1, p0, Lv1/a;->t:Landroid/widget/TextView;

    .line 27
    .line 28
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, Lv1/a;->t:Landroid/widget/TextView;

    .line 32
    .line 33
    invoke-virtual {p1, v3, p3}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 34
    .line 35
    .line 36
    iget-object p1, p0, Lv1/a;->t:Landroid/widget/TextView;

    .line 37
    .line 38
    if-eqz p4, :cond_0

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    const/4 v3, 0x4

    .line 42
    :goto_0
    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public o()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lv1/a;->d:Landroidx/viewpager/widget/ViewPager;

    .line 2
    .line 3
    instance-of v0, v0, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;

    .line 4
    .line 5
    return v0
.end method

.method public p()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lv1/a;->d:Landroidx/viewpager/widget/ViewPager;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    const-string v0, "ViewPager is not exist!"

    .line 7
    .line 8
    invoke-static {v0}, Lq1/c;->c(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return v1

    .line 12
    :cond_0
    iget-object v0, p0, Lv1/a;->f:Ljava/util/List;

    .line 13
    .line 14
    if-eqz v0, :cond_4

    .line 15
    .line 16
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-gtz v0, :cond_1

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_1
    iget-boolean v0, p0, Lv1/a;->v:Z

    .line 24
    .line 25
    const/4 v2, 0x1

    .line 26
    if-nez v0, :cond_3

    .line 27
    .line 28
    iget-object v0, p0, Lv1/a;->f:Ljava/util/List;

    .line 29
    .line 30
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eq v0, v2, :cond_2

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_2
    return v1

    .line 38
    :cond_3
    :goto_0
    return v2

    .line 39
    :cond_4
    :goto_1
    const-string v0, "DataList must be not empty!"

    .line 40
    .line 41
    invoke-static {v0}, Lq1/c;->c(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    return v1
.end method

.method public abstract q()Landroid/view/View;
.end method

.method public abstract r(I)Landroid/view/View;
.end method

.method public s(Landroid/widget/TextView;I)V
    .locals 0

    .line 1
    return-void
.end method

.method public setContainerScale(F)V
    .locals 2

    .line 1
    iput p1, p0, Lv1/a;->w:F

    .line 2
    .line 3
    const/high16 v0, 0x3f800000    # 1.0f

    .line 4
    .line 5
    cmpl-float p1, p1, v0

    .line 6
    .line 7
    if-lez p1, :cond_0

    .line 8
    .line 9
    iput v0, p0, Lv1/a;->w:F

    .line 10
    .line 11
    :cond_0
    iget p1, p0, Lv1/a;->o:I

    .line 12
    .line 13
    int-to-float p1, p1

    .line 14
    iget v0, p0, Lv1/a;->w:F

    .line 15
    .line 16
    mul-float/2addr p1, v0

    .line 17
    float-to-int p1, p1

    .line 18
    iput p1, p0, Lv1/a;->p:I

    .line 19
    .line 20
    iget-object p1, p0, Lv1/a;->d:Landroidx/viewpager/widget/ViewPager;

    .line 21
    .line 22
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 23
    .line 24
    .line 25
    iget-object p1, p0, Lv1/a;->e:Landroid/widget/RelativeLayout;

    .line 26
    .line 27
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 28
    .line 29
    .line 30
    new-instance p1, Landroid/widget/RelativeLayout$LayoutParams;

    .line 31
    .line 32
    iget v0, p0, Lv1/a;->o:I

    .line 33
    .line 34
    iget v1, p0, Lv1/a;->p:I

    .line 35
    .line 36
    invoke-direct {p1, v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 37
    .line 38
    .line 39
    iget-object v0, p0, Lv1/a;->d:Landroidx/viewpager/widget/ViewPager;

    .line 40
    .line 41
    invoke-virtual {p0, v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 42
    .line 43
    .line 44
    iget-object v0, p0, Lv1/a;->e:Landroid/widget/RelativeLayout;

    .line 45
    .line 46
    invoke-virtual {p0, v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public abstract setCurrentIndicator(I)V
.end method

.method public setTypeface(Landroid/graphics/Typeface;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lv1/a;->t:Landroid/widget/TextView;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public t()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lv1/a;->D()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v1, "--->pauseScroll()"

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-static {v0}, Lq1/c;->a(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    iput-boolean v0, p0, Lv1/a;->l:Z

    .line 34
    .line 35
    return-void
.end method

.method public final u(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lv1/a;->p()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    iget-boolean v0, p0, Lv1/a;->u:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Lv1/a;->E()V

    .line 12
    .line 13
    .line 14
    :cond_0
    add-int/lit8 p1, p1, 0x1

    .line 15
    .line 16
    iget-object v0, p0, Lv1/a;->d:Landroidx/viewpager/widget/ViewPager;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(I)V

    .line 19
    .line 20
    .line 21
    :cond_1
    return-void
.end method

.method public v(Z)Lv1/a;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lv1/a;->k:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public w(Z)Lv1/a;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lv1/a;->r:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public final x()V
    .locals 5

    .line 1
    :try_start_0
    const-class v0, Landroidx/viewpager/widget/ViewPager;

    .line 2
    .line 3
    const-string v1, "mScroller"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x1

    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 11
    .line 12
    .line 13
    new-instance v1, Landroid/view/animation/AccelerateDecelerateInterpolator;

    .line 14
    .line 15
    invoke-direct {v1}, Landroid/view/animation/AccelerateDecelerateInterpolator;-><init>()V

    .line 16
    .line 17
    .line 18
    new-instance v2, Lw1/a;

    .line 19
    .line 20
    iget-object v3, p0, Lv1/a;->b:Landroid/content/Context;

    .line 21
    .line 22
    iget v4, p0, Lv1/a;->m:I

    .line 23
    .line 24
    invoke-direct {v2, v3, v1, v4}, Lw1/a;-><init>(Landroid/content/Context;Landroid/view/animation/Interpolator;I)V

    .line 25
    .line 26
    .line 27
    iget-object v1, p0, Lv1/a;->d:Landroidx/viewpager/widget/ViewPager;

    .line 28
    .line 29
    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :catch_0
    move-exception v0

    .line 34
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public y(Ljava/util/List;)Lv1/a;
    .locals 0

    .line 1
    iput-object p1, p0, Lv1/a;->f:Ljava/util/List;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    iput-boolean p1, p0, Lv1/a;->u:Z

    .line 5
    .line 6
    return-object p0
.end method

.method public z(Ljava/lang/Class;)Lv1/a;
    .locals 0

    .line 1
    iput-object p1, p0, Lv1/a;->n:Ljava/lang/Class;

    .line 2
    .line 3
    return-object p0
.end method
