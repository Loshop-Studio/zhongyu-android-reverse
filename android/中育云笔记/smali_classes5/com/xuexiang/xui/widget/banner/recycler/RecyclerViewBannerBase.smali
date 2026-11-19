.class public abstract Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase$IndicatorAdapter;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<",
        "L:Landroidx/recyclerview/widget/RecyclerView$LayoutManager;",
        "A:",
        "Landroidx/recyclerview/widget/RecyclerView$Adapter;",
        ">",
        "Landroid/widget/FrameLayout;"
    }
.end annotation


# instance fields
.field public c:Landroidx/recyclerview/widget/RecyclerView;

.field public d:Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase$IndicatorAdapter;

.field public e:I

.field public f:Z

.field public g:Landroid/graphics/drawable/Drawable;

.field public h:Landroid/graphics/drawable/Drawable;

.field public i:Landroidx/recyclerview/widget/RecyclerView;

.field public j:Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

.field public k:Z

.field public l:I

.field public m:Z

.field public n:I

.field public o:I

.field public p:Z

.field public q:Ljava/util/List;

.field public r:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/16 p3, 0xfa0

    .line 4
    iput p3, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->l:I

    const/4 p3, 0x1

    .line 5
    iput p3, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->n:I

    .line 6
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    iput-object p3, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->q:Ljava/util/List;

    .line 7
    new-instance p3, Landroid/os/Handler;

    new-instance v0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase$a;

    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase$a;-><init>(Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;)V

    invoke-direct {p3, v0}, Landroid/os/Handler;-><init>(Landroid/os/Handler$Callback;)V

    iput-object p3, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->r:Landroid/os/Handler;

    .line 8
    invoke-virtual {p0, p1, p2}, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->b(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method


# virtual methods
.method public abstract a(Landroid/content/Context;I)Landroidx/recyclerview/widget/RecyclerView$LayoutManager;
.end method

.method public b(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 7

    .line 1
    sget-object v0, Lcom/xuexiang/xui/R$styleable;->RecyclerViewBannerBase:[I

    .line 2
    .line 3
    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    sget v0, Lcom/xuexiang/xui/R$styleable;->RecyclerViewBannerBase_rvbb_showIndicator:I

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->f:Z

    .line 15
    .line 16
    sget v0, Lcom/xuexiang/xui/R$styleable;->RecyclerViewBannerBase_rvbb_interval:I

    .line 17
    .line 18
    const/16 v2, 0xfa0

    .line 19
    .line 20
    invoke-virtual {p2, v0, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iput v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->l:I

    .line 25
    .line 26
    sget v0, Lcom/xuexiang/xui/R$styleable;->RecyclerViewBannerBase_rvbb_autoPlaying:I

    .line 27
    .line 28
    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->k:Z

    .line 33
    .line 34
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    sget v2, Lcom/xuexiang/xui/R$styleable;->RecyclerViewBannerBase_rvbb_indicatorSelectedSrc:I

    .line 39
    .line 40
    invoke-static {v0, p2, v2}, Lcom/xuexiang/xui/utils/f;->g(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    iput-object v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->g:Landroid/graphics/drawable/Drawable;

    .line 45
    .line 46
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    sget v2, Lcom/xuexiang/xui/R$styleable;->RecyclerViewBannerBase_rvbb_indicatorUnselectedSrc:I

    .line 51
    .line 52
    invoke-static {v0, p2, v2}, Lcom/xuexiang/xui/utils/f;->g(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    iput-object v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->h:Landroid/graphics/drawable/Drawable;

    .line 57
    .line 58
    sget v0, Lcom/xuexiang/xui/R$styleable;->RecyclerViewBannerBase_rvbb_indicatorSize:I

    .line 59
    .line 60
    sget v2, Lcom/xuexiang/xui/R$dimen;->default_recycler_banner_indicatorSize:I

    .line 61
    .line 62
    invoke-static {v2}, Lcom/xuexiang/xui/utils/f;->e(I)I

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    invoke-virtual {p2, v0, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    sget v2, Lcom/xuexiang/xui/R$styleable;->RecyclerViewBannerBase_rvbb_indicatorSelectedColor:I

    .line 71
    .line 72
    const/high16 v3, -0x10000

    .line 73
    .line 74
    invoke-virtual {p2, v2, v3}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    sget v3, Lcom/xuexiang/xui/R$styleable;->RecyclerViewBannerBase_rvbb_indicatorUnselectedColor:I

    .line 79
    .line 80
    const v4, -0x777778

    .line 81
    .line 82
    .line 83
    invoke-virtual {p2, v3, v4}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 84
    .line 85
    .line 86
    move-result v3

    .line 87
    iget-object v4, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->g:Landroid/graphics/drawable/Drawable;

    .line 88
    .line 89
    const/4 v5, 0x0

    .line 90
    if-nez v4, :cond_0

    .line 91
    .line 92
    new-instance v4, Landroid/graphics/drawable/GradientDrawable;

    .line 93
    .line 94
    invoke-direct {v4}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v4, v1}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v4, v2}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v4, v0, v0}, Landroid/graphics/drawable/GradientDrawable;->setSize(II)V

    .line 104
    .line 105
    .line 106
    shr-int/lit8 v2, v0, 0x1

    .line 107
    .line 108
    int-to-float v2, v2

    .line 109
    invoke-virtual {v4, v2}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 110
    .line 111
    .line 112
    new-instance v2, Landroid/graphics/drawable/LayerDrawable;

    .line 113
    .line 114
    new-array v6, v1, [Landroid/graphics/drawable/Drawable;

    .line 115
    .line 116
    aput-object v4, v6, v5

    .line 117
    .line 118
    invoke-direct {v2, v6}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    .line 119
    .line 120
    .line 121
    iput-object v2, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->g:Landroid/graphics/drawable/Drawable;

    .line 122
    .line 123
    :cond_0
    iget-object v2, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->h:Landroid/graphics/drawable/Drawable;

    .line 124
    .line 125
    if-nez v2, :cond_1

    .line 126
    .line 127
    new-instance v2, Landroid/graphics/drawable/GradientDrawable;

    .line 128
    .line 129
    invoke-direct {v2}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v2, v1}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v2, v3}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v2, v0, v0}, Landroid/graphics/drawable/GradientDrawable;->setSize(II)V

    .line 139
    .line 140
    .line 141
    shr-int/2addr v0, v1

    .line 142
    int-to-float v0, v0

    .line 143
    invoke-virtual {v2, v0}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 144
    .line 145
    .line 146
    new-instance v0, Landroid/graphics/drawable/LayerDrawable;

    .line 147
    .line 148
    new-array v1, v1, [Landroid/graphics/drawable/Drawable;

    .line 149
    .line 150
    aput-object v2, v1, v5

    .line 151
    .line 152
    invoke-direct {v0, v1}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    .line 153
    .line 154
    .line 155
    iput-object v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->h:Landroid/graphics/drawable/Drawable;

    .line 156
    .line 157
    :cond_1
    sget v0, Lcom/xuexiang/xui/R$styleable;->RecyclerViewBannerBase_rvbb_indicatorSpace:I

    .line 158
    .line 159
    sget v1, Lcom/xuexiang/xui/R$dimen;->default_recycler_banner_indicatorSpace:I

    .line 160
    .line 161
    invoke-static {v1}, Lcom/xuexiang/xui/utils/f;->e(I)I

    .line 162
    .line 163
    .line 164
    move-result v1

    .line 165
    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 166
    .line 167
    .line 168
    move-result v0

    .line 169
    iput v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->e:I

    .line 170
    .line 171
    sget v0, Lcom/xuexiang/xui/R$styleable;->RecyclerViewBannerBase_rvbb_indicatorMarginLeft:I

    .line 172
    .line 173
    sget v1, Lcom/xuexiang/xui/R$dimen;->default_recycler_banner_indicatorMarginLeft:I

    .line 174
    .line 175
    invoke-static {v1}, Lcom/xuexiang/xui/utils/f;->e(I)I

    .line 176
    .line 177
    .line 178
    move-result v1

    .line 179
    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 180
    .line 181
    .line 182
    move-result v0

    .line 183
    sget v1, Lcom/xuexiang/xui/R$styleable;->RecyclerViewBannerBase_rvbb_indicatorMarginRight:I

    .line 184
    .line 185
    sget v2, Lcom/xuexiang/xui/R$dimen;->default_recycler_banner_indicatorMarginRight:I

    .line 186
    .line 187
    invoke-static {v2}, Lcom/xuexiang/xui/utils/f;->e(I)I

    .line 188
    .line 189
    .line 190
    move-result v2

    .line 191
    invoke-virtual {p2, v1, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 192
    .line 193
    .line 194
    move-result v1

    .line 195
    sget v2, Lcom/xuexiang/xui/R$styleable;->RecyclerViewBannerBase_rvbb_indicatorMarginBottom:I

    .line 196
    .line 197
    sget v3, Lcom/xuexiang/xui/R$dimen;->default_recycler_banner_indicatorMarginBottom:I

    .line 198
    .line 199
    invoke-static {v3}, Lcom/xuexiang/xui/utils/f;->e(I)I

    .line 200
    .line 201
    .line 202
    move-result v3

    .line 203
    invoke-virtual {p2, v2, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 204
    .line 205
    .line 206
    move-result v2

    .line 207
    sget v3, Lcom/xuexiang/xui/R$styleable;->RecyclerViewBannerBase_rvbb_indicatorGravity:I

    .line 208
    .line 209
    invoke-virtual {p2, v3, v5}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 210
    .line 211
    .line 212
    move-result v3

    .line 213
    if-nez v3, :cond_2

    .line 214
    .line 215
    const v3, 0x800003

    .line 216
    .line 217
    .line 218
    goto :goto_0

    .line 219
    :cond_2
    const/4 v4, 0x2

    .line 220
    if-ne v3, v4, :cond_3

    .line 221
    .line 222
    const v3, 0x800005

    .line 223
    .line 224
    .line 225
    goto :goto_0

    .line 226
    :cond_3
    const/16 v3, 0x11

    .line 227
    .line 228
    :goto_0
    sget v4, Lcom/xuexiang/xui/R$styleable;->RecyclerViewBannerBase_rvbb_orientation:I

    .line 229
    .line 230
    invoke-virtual {p2, v4, v5}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 231
    .line 232
    .line 233
    move-result v4

    .line 234
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 235
    .line 236
    .line 237
    new-instance p2, Landroidx/recyclerview/widget/RecyclerView;

    .line 238
    .line 239
    invoke-direct {p2, p1}, Landroidx/recyclerview/widget/RecyclerView;-><init>(Landroid/content/Context;)V

    .line 240
    .line 241
    .line 242
    iput-object p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->i:Landroidx/recyclerview/widget/RecyclerView;

    .line 243
    .line 244
    new-instance p2, Landroidx/recyclerview/widget/PagerSnapHelper;

    .line 245
    .line 246
    invoke-direct {p2}, Landroidx/recyclerview/widget/PagerSnapHelper;-><init>()V

    .line 247
    .line 248
    .line 249
    iget-object v6, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->i:Landroidx/recyclerview/widget/RecyclerView;

    .line 250
    .line 251
    invoke-virtual {p2, v6}, Landroidx/recyclerview/widget/SnapHelper;->attachToRecyclerView(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 252
    .line 253
    .line 254
    invoke-virtual {p0, p1, v4}, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->a(Landroid/content/Context;I)Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    .line 255
    .line 256
    .line 257
    move-result-object p2

    .line 258
    iput-object p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->j:Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    .line 259
    .line 260
    iget-object v6, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->i:Landroidx/recyclerview/widget/RecyclerView;

    .line 261
    .line 262
    invoke-virtual {v6, p2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 263
    .line 264
    .line 265
    iget-object p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->i:Landroidx/recyclerview/widget/RecyclerView;

    .line 266
    .line 267
    new-instance v6, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase$b;

    .line 268
    .line 269
    invoke-direct {v6, p0}, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase$b;-><init>(Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {p2, v6}, Landroidx/recyclerview/widget/RecyclerView;->addOnScrollListener(Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;)V

    .line 273
    .line 274
    .line 275
    new-instance p2, Landroid/widget/FrameLayout$LayoutParams;

    .line 276
    .line 277
    const/4 v6, -0x1

    .line 278
    invoke-direct {p2, v6, v6}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 279
    .line 280
    .line 281
    iget-object v6, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->i:Landroidx/recyclerview/widget/RecyclerView;

    .line 282
    .line 283
    invoke-virtual {p0, v6, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 284
    .line 285
    .line 286
    new-instance p2, Landroidx/recyclerview/widget/RecyclerView;

    .line 287
    .line 288
    invoke-direct {p2, p1}, Landroidx/recyclerview/widget/RecyclerView;-><init>(Landroid/content/Context;)V

    .line 289
    .line 290
    .line 291
    iput-object p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->c:Landroidx/recyclerview/widget/RecyclerView;

    .line 292
    .line 293
    new-instance p2, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 294
    .line 295
    invoke-direct {p2, p1, v4, v5}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    .line 296
    .line 297
    .line 298
    iget-object p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->c:Landroidx/recyclerview/widget/RecyclerView;

    .line 299
    .line 300
    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 301
    .line 302
    .line 303
    new-instance p1, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase$IndicatorAdapter;

    .line 304
    .line 305
    invoke-direct {p1, p0}, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase$IndicatorAdapter;-><init>(Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;)V

    .line 306
    .line 307
    .line 308
    iput-object p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->d:Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase$IndicatorAdapter;

    .line 309
    .line 310
    iget-object p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->c:Landroidx/recyclerview/widget/RecyclerView;

    .line 311
    .line 312
    invoke-virtual {p2, p1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 313
    .line 314
    .line 315
    new-instance p1, Landroid/widget/FrameLayout$LayoutParams;

    .line 316
    .line 317
    const/4 p2, -0x2

    .line 318
    invoke-direct {p1, p2, p2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 319
    .line 320
    .line 321
    or-int/lit8 p2, v3, 0x50

    .line 322
    .line 323
    iput p2, p1, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 324
    .line 325
    invoke-virtual {p1, v0, v5, v1, v2}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 326
    .line 327
    .line 328
    iget-object p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->c:Landroidx/recyclerview/widget/RecyclerView;

    .line 329
    .line 330
    invoke-virtual {p0, p2, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 331
    .line 332
    .line 333
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->f:Z

    .line 334
    .line 335
    if-nez p1, :cond_4

    .line 336
    .line 337
    iget-object p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->c:Landroidx/recyclerview/widget/RecyclerView;

    .line 338
    .line 339
    const/16 p2, 0x8

    .line 340
    .line 341
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 342
    .line 343
    .line 344
    :cond_4
    return-void
.end method

.method public c(Landroidx/recyclerview/widget/RecyclerView;I)V
    .locals 0

    .line 1
    return-void
.end method

.method public d(Landroidx/recyclerview/widget/RecyclerView;II)V
    .locals 0

    .line 1
    return-void
.end method

.method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 4

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    if-eq v0, v2, :cond_0

    .line 10
    .line 11
    const/4 v3, 0x3

    .line 12
    if-eq v0, v3, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-virtual {p0, v2}, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->setPlaying(Z)V

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    invoke-virtual {p0, v1}, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->setPlaying(Z)V

    .line 20
    .line 21
    .line 22
    :goto_0
    :try_start_0
    invoke-super {p0, p1}, Landroid/view/View;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 23
    .line 24
    .line 25
    move-result p1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 26
    return p1

    .line 27
    :catch_0
    move-exception p1

    .line 28
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 29
    .line 30
    .line 31
    return v1
.end method

.method public declared-synchronized e()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->n:I

    .line 3
    .line 4
    const/4 v1, 0x1

    .line 5
    if-le v0, v1, :cond_0

    .line 6
    .line 7
    iget v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->o:I

    .line 8
    .line 9
    rem-int/2addr v1, v0

    .line 10
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->f:Z

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->d:Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase$IndicatorAdapter;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase$IndicatorAdapter;->a(I)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->d:Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase$IndicatorAdapter;

    .line 20
    .line 21
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    move-exception v0

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    :goto_0
    monitor-exit p0

    .line 28
    return-void

    .line 29
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 30
    throw v0
.end method

.method public onAttachedToWindow()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->setPlaying(Z)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public onDetachedFromWindow()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->setPlaying(Z)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 0

    .line 1
    :try_start_0
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    .line 2
    .line 3
    .line 4
    move-result p1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    return p1

    .line 6
    :catch_0
    move-exception p1

    .line 7
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 8
    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    return p1
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 0

    .line 1
    :try_start_0
    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 2
    .line 3
    .line 4
    move-result p1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    return p1

    .line 6
    :catch_0
    move-exception p1

    .line 7
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 8
    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    return p1
.end method

.method public onWindowVisibilityChanged(I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onWindowVisibilityChanged(I)V

    .line 2
    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->setPlaying(Z)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    const/4 p1, 0x0

    .line 12
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->setPlaying(Z)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public setAutoPlaying(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->k:Z

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->setPlaying(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setIndicatorInterval(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->l:I

    .line 2
    .line 3
    return-void
.end method

.method public declared-synchronized setPlaying(Z)V
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->k:Z

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->m:Z

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->p:Z

    .line 11
    .line 12
    const/16 v1, 0x3e8

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    iget-object p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->r:Landroid/os/Handler;

    .line 19
    .line 20
    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->l:I

    .line 21
    .line 22
    int-to-long v2, v0

    .line 23
    invoke-virtual {p1, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 24
    .line 25
    .line 26
    const/4 p1, 0x1

    .line 27
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->p:Z

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception p1

    .line 31
    goto :goto_1

    .line 32
    :cond_0
    if-eqz v0, :cond_1

    .line 33
    .line 34
    if-nez p1, :cond_1

    .line 35
    .line 36
    iget-object p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->r:Landroid/os/Handler;

    .line 37
    .line 38
    invoke-virtual {p1, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 39
    .line 40
    .line 41
    const/4 p1, 0x0

    .line 42
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->p:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    .line 44
    :cond_1
    :goto_0
    monitor-exit p0

    .line 45
    return-void

    .line 46
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 47
    throw p1
.end method

.method public setShowIndicator(Z)V
    .locals 1

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->f:Z

    .line 2
    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->c:Landroidx/recyclerview/widget/RecyclerView;

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/16 p1, 0x8

    .line 10
    .line 11
    :goto_0
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
