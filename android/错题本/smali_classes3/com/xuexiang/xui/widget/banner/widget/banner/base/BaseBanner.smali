.class public abstract Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;
.super Landroid/widget/RelativeLayout;
.source "SourceFile"

# interfaces
.implements Lio/github/inflationx/calligraphy3/HasTypeface;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        "T:",
        "Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner<",
        "TE;TT;>;>",
        "Landroid/widget/RelativeLayout;",
        "Lio/github/inflationx/calligraphy3/HasTypeface;"
    }
.end annotation


# static fields
.field public static final synthetic y:I


# instance fields
.field public a:Ljava/util/concurrent/ScheduledExecutorService;

.field public b:Landroid/content/Context;

.field public c:Landroid/util/DisplayMetrics;

.field public d:Landroidx/viewpager/widget/ViewPager;

.field public e:Ljava/util/List;

.field public f:I

.field public g:I

.field public h:J

.field public i:J

.field public j:Z

.field public k:Z

.field public l:I

.field public m:Ljava/lang/Class;

.field public n:I

.field public o:I

.field public p:Landroid/widget/LinearLayout;

.field public q:Z

.field public r:Landroid/widget/LinearLayout;

.field public s:Landroid/widget/TextView;

.field public t:Z

.field public final u:Z

.field public v:F

.field public final w:Landroid/os/Handler;

.field public final x:Lb2/b;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 1
    invoke-direct {p0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->e:Ljava/util/List;

    const/16 v0, 0x1c2

    .line 3
    iput v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->l:I

    const/4 v0, 0x0

    .line 4
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->t:Z

    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->u:Z

    .line 6
    new-instance v0, Landroid/os/Handler;

    new-instance v1, Lb2/a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lb2/a;-><init>(Ljava/lang/Object;I)V

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Handler$Callback;)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->w:Landroid/os/Handler;

    .line 7
    new-instance v0, Lb2/b;

    invoke-direct {v0, p0}, Lb2/b;-><init>(Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->x:Lb2/b;

    const/4 v0, 0x0

    .line 8
    invoke-virtual {p0, p1, v0}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->c(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    .line 9
    invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 10
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->e:Ljava/util/List;

    const/16 v0, 0x1c2

    .line 11
    iput v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->l:I

    const/4 v0, 0x0

    .line 12
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->t:Z

    const/4 v0, 0x1

    .line 13
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->u:Z

    .line 14
    new-instance v0, Landroid/os/Handler;

    new-instance v1, Lb2/a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lb2/a;-><init>(Ljava/lang/Object;I)V

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Handler$Callback;)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->w:Landroid/os/Handler;

    .line 15
    new-instance v0, Lb2/b;

    invoke-direct {v0, p0}, Lb2/b;-><init>(Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->x:Lb2/b;

    .line 16
    invoke-virtual {p0, p1, p2}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->c(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .line 17
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 18
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    iput-object p3, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->e:Ljava/util/List;

    const/16 p3, 0x1c2

    .line 19
    iput p3, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->l:I

    const/4 p3, 0x0

    .line 20
    iput-boolean p3, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->t:Z

    const/4 p3, 0x1

    .line 21
    iput-boolean p3, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->u:Z

    .line 22
    new-instance p3, Landroid/os/Handler;

    new-instance v0, Lb2/a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lb2/a;-><init>(Ljava/lang/Object;I)V

    invoke-direct {p3, v0}, Landroid/os/Handler;-><init>(Landroid/os/Handler$Callback;)V

    iput-object p3, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->w:Landroid/os/Handler;

    .line 23
    new-instance p3, Lb2/b;

    invoke-direct {p3, p0}, Lb2/b;-><init>(Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;)V

    iput-object p3, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->x:Lb2/b;

    .line 24
    invoke-virtual {p0, p1, p2}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->c(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method


# virtual methods
.method public final a(F)I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->b:Landroid/content/Context;

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

.method public final b()V
    .locals 8

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->d()Z

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
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->k:Z

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    :goto_0
    return-void

    .line 13
    :cond_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->d:Landroidx/viewpager/widget/ViewPager;

    .line 14
    .line 15
    instance-of v0, v0, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;

    .line 16
    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->j:Z

    .line 20
    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->f()V

    .line 24
    .line 25
    .line 26
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor()Ljava/util/concurrent/ScheduledExecutorService;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    iput-object v1, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->a:Ljava/util/concurrent/ScheduledExecutorService;

    .line 31
    .line 32
    new-instance v2, Lb0/a;

    .line 33
    .line 34
    const/4 v0, 0x2

    .line 35
    invoke-direct {v2, p0, v0}, Lb0/a;-><init>(Ljava/lang/Object;I)V

    .line 36
    .line 37
    .line 38
    iget-wide v3, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->h:J

    .line 39
    .line 40
    iget-wide v5, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->i:J

    .line 41
    .line 42
    sget-object v7, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 43
    .line 44
    invoke-interface/range {v1 .. v7}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleAtFixedRate(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 45
    .line 46
    .line 47
    const/4 v0, 0x1

    .line 48
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->k:Z

    .line 49
    .line 50
    return-void

    .line 51
    :cond_2
    const/4 v0, 0x0

    .line 52
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->k:Z

    .line 53
    .line 54
    return-void
.end method

.method public final c(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 21

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
    iput-object v1, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->b:Landroid/content/Context;

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
    iput-object v3, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->c:Landroid/util/DisplayMetrics;

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
    iput v4, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->v:F

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
    iput-wide v8, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->h:J

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
    iput-wide v8, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->i:J

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
    iput-boolean v6, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->j:Z

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
    iput-boolean v9, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->q:Z

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
    invoke-virtual {v0, v12}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->a(F)I

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
    invoke-virtual {v0, v14}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->a(F)I

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
    invoke-virtual {v0, v12}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->a(F)I

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
    invoke-virtual {v0, v15}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->a(F)I

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
    iget-object v10, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->b:Landroid/content/Context;

    .line 166
    .line 167
    invoke-virtual {v10}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 168
    .line 169
    .line 170
    move-result-object v10

    .line 171
    invoke-virtual {v10}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 172
    .line 173
    .line 174
    move-result-object v10

    .line 175
    iget v10, v10, Landroid/util/DisplayMetrics;->scaledDensity:F

    .line 176
    .line 177
    const/high16 v17, 0x41480000    # 12.5f

    .line 178
    .line 179
    mul-float v10, v10, v17

    .line 180
    .line 181
    invoke-virtual {v3, v15, v10}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 182
    .line 183
    .line 184
    move-result v10

    .line 185
    sget v15, Lcom/xuexiang/xui/R$styleable;->BaseBanner_bb_isTitleShow:I

    .line 186
    .line 187
    invoke-virtual {v3, v15, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 188
    .line 189
    .line 190
    move-result v15

    .line 191
    sget v8, Lcom/xuexiang/xui/R$styleable;->BaseBanner_bb_isIndicatorShow:I

    .line 192
    .line 193
    invoke-virtual {v3, v8, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 194
    .line 195
    .line 196
    move-result v8

    .line 197
    invoke-virtual {v3}, Landroid/content/res/TypedArray;->recycle()V

    .line 198
    .line 199
    .line 200
    const-string v3, "http://schemas.android.com/apk/res/android"

    .line 201
    .line 202
    const-string v5, "layout_height"

    .line 203
    .line 204
    invoke-interface {v2, v3, v5}, Landroid/util/AttributeSet;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v3

    .line 208
    if-eqz v4, :cond_2

    .line 209
    .line 210
    new-instance v4, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;

    .line 211
    .line 212
    invoke-direct {v4, v1}, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;-><init>(Landroid/content/Context;)V

    .line 213
    .line 214
    .line 215
    goto :goto_2

    .line 216
    :cond_2
    new-instance v4, Landroidx/viewpager/widget/ViewPager;

    .line 217
    .line 218
    invoke-direct {v4, v1}, Landroidx/viewpager/widget/ViewPager;-><init>(Landroid/content/Context;)V

    .line 219
    .line 220
    .line 221
    :goto_2
    iput-object v4, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->d:Landroidx/viewpager/widget/ViewPager;

    .line 222
    .line 223
    const/4 v5, 0x2

    .line 224
    invoke-virtual {v4, v5}, Landroid/view/View;->setOverScrollMode(I)V

    .line 225
    .line 226
    .line 227
    iget-object v4, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->c:Landroid/util/DisplayMetrics;

    .line 228
    .line 229
    iget v4, v4, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 230
    .line 231
    iput v4, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->n:I

    .line 232
    .line 233
    iget v5, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->v:F

    .line 234
    .line 235
    const/16 v18, 0x0

    .line 236
    .line 237
    cmpg-float v18, v5, v18

    .line 238
    .line 239
    move/from16 v19, v5

    .line 240
    .line 241
    const/high16 v20, 0x3f800000    # 1.0f

    .line 242
    .line 243
    const/4 v5, -0x2

    .line 244
    if-gez v18, :cond_5

    .line 245
    .line 246
    const-string v4, "-1"

    .line 247
    .line 248
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 249
    .line 250
    .line 251
    move-result v4

    .line 252
    if-eqz v4, :cond_3

    .line 253
    .line 254
    const/4 v4, -0x1

    .line 255
    iput v4, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->o:I

    .line 256
    .line 257
    goto :goto_3

    .line 258
    :cond_3
    const-string v4, "-2"

    .line 259
    .line 260
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 261
    .line 262
    .line 263
    move-result v3

    .line 264
    if-eqz v3, :cond_4

    .line 265
    .line 266
    iput v5, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->o:I

    .line 267
    .line 268
    goto :goto_3

    .line 269
    :cond_4
    const v3, 0x10100f5

    .line 270
    .line 271
    .line 272
    filled-new-array {v3}, [I

    .line 273
    .line 274
    .line 275
    move-result-object v3

    .line 276
    invoke-virtual {v1, v2, v3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 277
    .line 278
    .line 279
    move-result-object v2

    .line 280
    const/4 v3, 0x0

    .line 281
    invoke-virtual {v2, v3, v5}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 282
    .line 283
    .line 284
    move-result v4

    .line 285
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    .line 286
    .line 287
    .line 288
    iput v4, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->o:I

    .line 289
    .line 290
    goto :goto_3

    .line 291
    :cond_5
    cmpl-float v2, v19, v20

    .line 292
    .line 293
    if-lez v2, :cond_6

    .line 294
    .line 295
    move/from16 v2, v20

    .line 296
    .line 297
    iput v2, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->v:F

    .line 298
    .line 299
    :cond_6
    int-to-float v2, v4

    .line 300
    iget v3, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->v:F

    .line 301
    .line 302
    mul-float/2addr v2, v3

    .line 303
    float-to-int v2, v2

    .line 304
    iput v2, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->o:I

    .line 305
    .line 306
    :goto_3
    new-instance v2, Landroid/widget/RelativeLayout$LayoutParams;

    .line 307
    .line 308
    iget v3, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->n:I

    .line 309
    .line 310
    iget v4, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->o:I

    .line 311
    .line 312
    invoke-direct {v2, v3, v4}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 313
    .line 314
    .line 315
    iget-object v3, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->d:Landroidx/viewpager/widget/ViewPager;

    .line 316
    .line 317
    invoke-virtual {v0, v3, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 318
    .line 319
    .line 320
    new-instance v3, Landroid/widget/RelativeLayout;

    .line 321
    .line 322
    invoke-direct {v3, v1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 323
    .line 324
    .line 325
    invoke-virtual {v0, v3, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 326
    .line 327
    .line 328
    new-instance v2, Landroid/widget/LinearLayout;

    .line 329
    .line 330
    invoke-direct {v2, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 331
    .line 332
    .line 333
    iput-object v2, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->p:Landroid/widget/LinearLayout;

    .line 334
    .line 335
    new-instance v2, Landroid/widget/RelativeLayout$LayoutParams;

    .line 336
    .line 337
    iget v4, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->n:I

    .line 338
    .line 339
    invoke-direct {v2, v4, v5}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 340
    .line 341
    .line 342
    const/16 v4, 0xc

    .line 343
    .line 344
    const/4 v5, -0x1

    .line 345
    invoke-virtual {v2, v4, v5}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 346
    .line 347
    .line 348
    iget-object v4, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->p:Landroid/widget/LinearLayout;

    .line 349
    .line 350
    invoke-virtual {v3, v4, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 351
    .line 352
    .line 353
    iget-object v2, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->p:Landroid/widget/LinearLayout;

    .line 354
    .line 355
    invoke-virtual {v2, v6}, Landroid/view/View;->setBackgroundColor(I)V

    .line 356
    .line 357
    .line 358
    iget-object v2, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->p:Landroid/widget/LinearLayout;

    .line 359
    .line 360
    float-to-int v3, v11

    .line 361
    float-to-int v4, v13

    .line 362
    float-to-int v5, v12

    .line 363
    float-to-int v6, v14

    .line 364
    invoke-virtual {v2, v3, v4, v5, v6}, Landroid/view/View;->setPadding(IIII)V

    .line 365
    .line 366
    .line 367
    iget-object v2, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->p:Landroid/widget/LinearLayout;

    .line 368
    .line 369
    const/4 v3, 0x0

    .line 370
    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 371
    .line 372
    .line 373
    iget-object v2, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->p:Landroid/widget/LinearLayout;

    .line 374
    .line 375
    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 376
    .line 377
    .line 378
    new-instance v2, Landroid/widget/LinearLayout;

    .line 379
    .line 380
    invoke-direct {v2, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 381
    .line 382
    .line 383
    iput-object v2, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->r:Landroid/widget/LinearLayout;

    .line 384
    .line 385
    const/16 v3, 0x11

    .line 386
    .line 387
    invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 388
    .line 389
    .line 390
    iget-object v2, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->r:Landroid/widget/LinearLayout;

    .line 391
    .line 392
    const/4 v3, 0x4

    .line 393
    if-eqz v8, :cond_7

    .line 394
    .line 395
    const/4 v4, 0x0

    .line 396
    goto :goto_4

    .line 397
    :cond_7
    move v4, v3

    .line 398
    :goto_4
    invoke-virtual {v2, v4}, Landroid/view/View;->setVisibility(I)V

    .line 399
    .line 400
    .line 401
    iget-object v2, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->r:Landroid/widget/LinearLayout;

    .line 402
    .line 403
    const/4 v4, 0x0

    .line 404
    invoke-virtual {v2, v4}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 405
    .line 406
    .line 407
    iget-object v2, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->r:Landroid/widget/LinearLayout;

    .line 408
    .line 409
    invoke-virtual {v2, v4}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 410
    .line 411
    .line 412
    new-instance v2, Landroid/widget/TextView;

    .line 413
    .line 414
    invoke-direct {v2, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 415
    .line 416
    .line 417
    iput-object v2, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->s:Landroid/widget/TextView;

    .line 418
    .line 419
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 420
    .line 421
    const/high16 v5, 0x3f800000    # 1.0f

    .line 422
    .line 423
    const/4 v6, -0x2

    .line 424
    invoke-direct {v1, v4, v6, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 425
    .line 426
    .line 427
    invoke-virtual {v2, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 428
    .line 429
    .line 430
    iget-object v1, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->s:Landroid/widget/TextView;

    .line 431
    .line 432
    const/4 v2, 0x1

    .line 433
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 434
    .line 435
    .line 436
    iget-object v1, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->s:Landroid/widget/TextView;

    .line 437
    .line 438
    invoke-virtual {v1, v7}, Landroid/widget/TextView;->setTextColor(I)V

    .line 439
    .line 440
    .line 441
    iget-object v1, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->s:Landroid/widget/TextView;

    .line 442
    .line 443
    invoke-virtual {v1, v4, v10}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 444
    .line 445
    .line 446
    iget-object v1, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->s:Landroid/widget/TextView;

    .line 447
    .line 448
    if-eqz v15, :cond_8

    .line 449
    .line 450
    const/4 v3, 0x0

    .line 451
    :cond_8
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 452
    .line 453
    .line 454
    const/16 v3, 0x11

    .line 455
    .line 456
    if-ne v9, v3, :cond_9

    .line 457
    .line 458
    iget-object v1, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->p:Landroid/widget/LinearLayout;

    .line 459
    .line 460
    invoke-virtual {v1, v3}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 461
    .line 462
    .line 463
    iget-object v1, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->p:Landroid/widget/LinearLayout;

    .line 464
    .line 465
    iget-object v2, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->r:Landroid/widget/LinearLayout;

    .line 466
    .line 467
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 468
    .line 469
    .line 470
    return-void

    .line 471
    :cond_9
    const/4 v1, 0x3

    .line 472
    const/high16 v2, 0x40e00000    # 7.0f

    .line 473
    .line 474
    const/16 v3, 0x10

    .line 475
    .line 476
    const/4 v4, 0x5

    .line 477
    if-ne v9, v4, :cond_a

    .line 478
    .line 479
    iget-object v4, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->p:Landroid/widget/LinearLayout;

    .line 480
    .line 481
    invoke-virtual {v4, v3}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 482
    .line 483
    .line 484
    iget-object v3, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->p:Landroid/widget/LinearLayout;

    .line 485
    .line 486
    iget-object v4, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->s:Landroid/widget/TextView;

    .line 487
    .line 488
    invoke-virtual {v3, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 489
    .line 490
    .line 491
    iget-object v3, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->p:Landroid/widget/LinearLayout;

    .line 492
    .line 493
    iget-object v4, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->r:Landroid/widget/LinearLayout;

    .line 494
    .line 495
    invoke-virtual {v3, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 496
    .line 497
    .line 498
    iget-object v3, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->s:Landroid/widget/TextView;

    .line 499
    .line 500
    invoke-virtual {v0, v2}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->a(F)I

    .line 501
    .line 502
    .line 503
    move-result v2

    .line 504
    const/4 v4, 0x0

    .line 505
    invoke-virtual {v3, v4, v4, v2, v4}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 506
    .line 507
    .line 508
    iget-object v2, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->s:Landroid/widget/TextView;

    .line 509
    .line 510
    sget-object v3, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 511
    .line 512
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 513
    .line 514
    .line 515
    iget-object v2, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->s:Landroid/widget/TextView;

    .line 516
    .line 517
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setGravity(I)V

    .line 518
    .line 519
    .line 520
    return-void

    .line 521
    :cond_a
    if-ne v9, v1, :cond_b

    .line 522
    .line 523
    iget-object v1, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->p:Landroid/widget/LinearLayout;

    .line 524
    .line 525
    invoke-virtual {v1, v3}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 526
    .line 527
    .line 528
    iget-object v1, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->p:Landroid/widget/LinearLayout;

    .line 529
    .line 530
    iget-object v3, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->r:Landroid/widget/LinearLayout;

    .line 531
    .line 532
    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 533
    .line 534
    .line 535
    iget-object v1, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->p:Landroid/widget/LinearLayout;

    .line 536
    .line 537
    iget-object v3, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->s:Landroid/widget/TextView;

    .line 538
    .line 539
    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 540
    .line 541
    .line 542
    iget-object v1, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->s:Landroid/widget/TextView;

    .line 543
    .line 544
    invoke-virtual {v0, v2}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->a(F)I

    .line 545
    .line 546
    .line 547
    move-result v2

    .line 548
    const/4 v3, 0x0

    .line 549
    invoke-virtual {v1, v2, v3, v3, v3}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 550
    .line 551
    .line 552
    iget-object v1, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->s:Landroid/widget/TextView;

    .line 553
    .line 554
    sget-object v2, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 555
    .line 556
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 557
    .line 558
    .line 559
    iget-object v1, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->s:Landroid/widget/TextView;

    .line 560
    .line 561
    const/4 v4, 0x5

    .line 562
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setGravity(I)V

    .line 563
    .line 564
    .line 565
    :cond_b
    return-void
.end method

.method public final d()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->d:Landroidx/viewpager/widget/ViewPager;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->e:Ljava/util/List;

    .line 7
    .line 8
    if-eqz v0, :cond_3

    .line 9
    .line 10
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-gtz v0, :cond_1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->u:Z

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    if-nez v0, :cond_2

    .line 21
    .line 22
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->e:Ljava/util/List;

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eq v0, v1, :cond_3

    .line 29
    .line 30
    :cond_2
    return v1

    .line 31
    :cond_3
    :goto_0
    const/4 v0, 0x0

    .line 32
    return v0
.end method

.method public final dispatchTouchEvent(Landroid/view/MotionEvent;)Z
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
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->b()V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->b()V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_2
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->f()V

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

.method public e(I)V
    .locals 0

    .line 1
    return-void
.end method

.method public final f()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->a:Ljava/util/concurrent/ScheduledExecutorService;

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
    iput-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->a:Ljava/util/concurrent/ScheduledExecutorService;

    .line 10
    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->k:Z

    .line 13
    .line 14
    return-void
.end method

.method public final g()V
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
    new-instance v2, Lc2/a;

    .line 19
    .line 20
    iget-object v3, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->b:Landroid/content/Context;

    .line 21
    .line 22
    iget v4, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->l:I

    .line 23
    .line 24
    invoke-direct {v2, v3, v1}, Landroid/widget/Scroller;-><init>(Landroid/content/Context;Landroid/view/animation/Interpolator;)V

    .line 25
    .line 26
    .line 27
    iput v4, v2, Lc2/a;->a:I

    .line 28
    .line 29
    iget-object v1, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->d:Landroidx/viewpager/widget/ViewPager;

    .line 30
    .line 31
    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :catch_0
    move-exception v0

    .line 36
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public getContainerScale()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->v:F

    .line 2
    .line 3
    return v0
.end method

.method public getItemHeight()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->o:I

    .line 2
    .line 3
    return v0
.end method

.method public getItemWidth()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->n:I

    .line 2
    .line 3
    return v0
.end method

.method public getViewPager()Landroidx/viewpager/widget/ViewPager;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->d:Landroidx/viewpager/widget/ViewPager;

    .line 2
    .line 3
    return-object v0
.end method

.method public abstract setCurrentIndicator(I)V
.end method

.method public setTypeface(Landroid/graphics/Typeface;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->s:Landroid/widget/TextView;

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
