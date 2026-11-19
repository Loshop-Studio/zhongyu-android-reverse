.class public abstract Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;
.super Landroid/widget/RelativeLayout;
.source "SourceFile"

# interfaces
.implements Lio/github/inflationx/calligraphy3/HasTypeface;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner$e;,
        Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner$d;
    }
.end annotation

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


# instance fields
.field public A:Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;

.field public c:Ljava/util/concurrent/ScheduledExecutorService;

.field public d:Landroid/content/Context;

.field public e:Landroid/util/DisplayMetrics;

.field public f:Landroidx/viewpager/widget/ViewPager;

.field public g:Ljava/util/List;

.field public h:I

.field public i:I

.field public j:J

.field public k:J

.field public l:Z

.field public m:Z

.field public n:I

.field public o:Ljava/lang/Class;

.field public p:I

.field public q:I

.field public r:Landroid/widget/LinearLayout;

.field public s:Z

.field public t:Landroid/widget/LinearLayout;

.field public u:Landroid/widget/TextView;

.field public v:Z

.field public w:Z

.field public x:F

.field public y:Landroid/os/Handler;

.field public z:Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->g:Ljava/util/List;

    const/16 v0, 0x1c2

    .line 3
    iput v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->n:I

    const/4 v0, 0x0

    .line 4
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->v:Z

    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->w:Z

    .line 6
    new-instance v0, Landroid/os/Handler;

    new-instance v1, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner$a;

    invoke-direct {v1, p0}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner$a;-><init>(Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;)V

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Handler$Callback;)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->y:Landroid/os/Handler;

    .line 7
    new-instance v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner$b;

    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner$b;-><init>(Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->z:Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;

    const/4 v0, 0x0

    .line 8
    invoke-direct {p0, p1, v0}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->l(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 9
    invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 10
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->g:Ljava/util/List;

    const/16 v0, 0x1c2

    .line 11
    iput v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->n:I

    const/4 v0, 0x0

    .line 12
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->v:Z

    const/4 v0, 0x1

    .line 13
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->w:Z

    .line 14
    new-instance v0, Landroid/os/Handler;

    new-instance v1, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner$a;

    invoke-direct {v1, p0}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner$a;-><init>(Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;)V

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Handler$Callback;)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->y:Landroid/os/Handler;

    .line 15
    new-instance v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner$b;

    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner$b;-><init>(Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->z:Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;

    .line 16
    invoke-direct {p0, p1, p2}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->l(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 17
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 18
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    iput-object p3, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->g:Ljava/util/List;

    const/16 p3, 0x1c2

    .line 19
    iput p3, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->n:I

    const/4 p3, 0x0

    .line 20
    iput-boolean p3, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->v:Z

    const/4 p3, 0x1

    .line 21
    iput-boolean p3, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->w:Z

    .line 22
    new-instance p3, Landroid/os/Handler;

    new-instance v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner$a;

    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner$a;-><init>(Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;)V

    invoke-direct {p3, v0}, Landroid/os/Handler;-><init>(Landroid/os/Handler$Callback;)V

    iput-object p3, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->y:Landroid/os/Handler;

    .line 23
    new-instance p3, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner$b;

    invoke-direct {p3, p0}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner$b;-><init>(Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;)V

    iput-object p3, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->z:Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;

    .line 24
    invoke-direct {p0, p1, p2}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->l(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method private C()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->c:Ljava/util/concurrent/ScheduledExecutorService;

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
    iput-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->c:Ljava/util/concurrent/ScheduledExecutorService;

    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public static synthetic a(Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->s(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic b(Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;)Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->A:Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic c(Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;)Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->u:Landroid/widget/TextView;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic d(Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->s:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic e(Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;)Landroid/widget/LinearLayout;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->r:Landroid/widget/LinearLayout;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic f(Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;)Landroid/os/Handler;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->y:Landroid/os/Handler;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic g(Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;)Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner$e;
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

.method private l(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 20

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
    iput-object v1, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->d:Landroid/content/Context;

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
    iput-object v3, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->e:Landroid/util/DisplayMetrics;

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
    iput v4, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->x:F

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
    iput-wide v8, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->j:J

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
    iput-wide v8, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->k:J

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
    iput-boolean v6, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->l:Z

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
    iput-boolean v9, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->s:Z

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
    invoke-virtual {v0, v12}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->i(F)I

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
    invoke-virtual {v0, v14}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->i(F)I

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
    invoke-virtual {v0, v12}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->i(F)I

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
    invoke-virtual {v0, v15}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->i(F)I

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
    invoke-virtual {v0, v10}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->A(F)F

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
    move-result v8

    .line 187
    invoke-virtual {v3}, Landroid/content/res/TypedArray;->recycle()V

    .line 188
    .line 189
    .line 190
    const-string v3, "http://schemas.android.com/apk/res/android"

    .line 191
    .line 192
    const-string v5, "layout_height"

    .line 193
    .line 194
    invoke-interface {v2, v3, v5}, Landroid/util/AttributeSet;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v3

    .line 198
    if-eqz v4, :cond_2

    .line 199
    .line 200
    new-instance v4, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;

    .line 201
    .line 202
    invoke-direct {v4, v1}, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;-><init>(Landroid/content/Context;)V

    .line 203
    .line 204
    .line 205
    goto :goto_2

    .line 206
    :cond_2
    new-instance v4, Landroidx/viewpager/widget/ViewPager;

    .line 207
    .line 208
    invoke-direct {v4, v1}, Landroidx/viewpager/widget/ViewPager;-><init>(Landroid/content/Context;)V

    .line 209
    .line 210
    .line 211
    :goto_2
    iput-object v4, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->f:Landroidx/viewpager/widget/ViewPager;

    .line 212
    .line 213
    const/4 v5, 0x2

    .line 214
    invoke-virtual {v4, v5}, Landroid/view/View;->setOverScrollMode(I)V

    .line 215
    .line 216
    .line 217
    iget-object v4, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->e:Landroid/util/DisplayMetrics;

    .line 218
    .line 219
    iget v4, v4, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 220
    .line 221
    iput v4, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->p:I

    .line 222
    .line 223
    iget v5, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->x:F

    .line 224
    .line 225
    const/16 v17, 0x0

    .line 226
    .line 227
    cmpg-float v17, v5, v17

    .line 228
    .line 229
    move/from16 v18, v5

    .line 230
    .line 231
    const/high16 v19, 0x3f800000    # 1.0f

    .line 232
    .line 233
    const/4 v5, -0x2

    .line 234
    if-gez v17, :cond_5

    .line 235
    .line 236
    const-string v4, "-1"

    .line 237
    .line 238
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 239
    .line 240
    .line 241
    move-result v4

    .line 242
    if-eqz v4, :cond_3

    .line 243
    .line 244
    const/4 v4, -0x1

    .line 245
    iput v4, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->q:I

    .line 246
    .line 247
    goto :goto_3

    .line 248
    :cond_3
    const-string v4, "-2"

    .line 249
    .line 250
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 251
    .line 252
    .line 253
    move-result v3

    .line 254
    if-eqz v3, :cond_4

    .line 255
    .line 256
    iput v5, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->q:I

    .line 257
    .line 258
    goto :goto_3

    .line 259
    :cond_4
    const v3, 0x10100f5

    .line 260
    .line 261
    .line 262
    filled-new-array {v3}, [I

    .line 263
    .line 264
    .line 265
    move-result-object v3

    .line 266
    invoke-virtual {v1, v2, v3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 267
    .line 268
    .line 269
    move-result-object v2

    .line 270
    const/4 v3, 0x0

    .line 271
    invoke-virtual {v2, v3, v5}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 272
    .line 273
    .line 274
    move-result v4

    .line 275
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    .line 276
    .line 277
    .line 278
    iput v4, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->q:I

    .line 279
    .line 280
    goto :goto_3

    .line 281
    :cond_5
    cmpl-float v2, v18, v19

    .line 282
    .line 283
    if-lez v2, :cond_6

    .line 284
    .line 285
    move/from16 v2, v19

    .line 286
    .line 287
    iput v2, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->x:F

    .line 288
    .line 289
    :cond_6
    int-to-float v2, v4

    .line 290
    iget v3, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->x:F

    .line 291
    .line 292
    mul-float/2addr v2, v3

    .line 293
    float-to-int v2, v2

    .line 294
    iput v2, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->q:I

    .line 295
    .line 296
    :goto_3
    new-instance v2, Landroid/widget/RelativeLayout$LayoutParams;

    .line 297
    .line 298
    iget v3, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->p:I

    .line 299
    .line 300
    iget v4, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->q:I

    .line 301
    .line 302
    invoke-direct {v2, v3, v4}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 303
    .line 304
    .line 305
    iget-object v3, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->f:Landroidx/viewpager/widget/ViewPager;

    .line 306
    .line 307
    invoke-virtual {v0, v3, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 308
    .line 309
    .line 310
    new-instance v3, Landroid/widget/RelativeLayout;

    .line 311
    .line 312
    invoke-direct {v3, v1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 313
    .line 314
    .line 315
    invoke-virtual {v0, v3, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 316
    .line 317
    .line 318
    new-instance v2, Landroid/widget/LinearLayout;

    .line 319
    .line 320
    invoke-direct {v2, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 321
    .line 322
    .line 323
    iput-object v2, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->r:Landroid/widget/LinearLayout;

    .line 324
    .line 325
    new-instance v2, Landroid/widget/RelativeLayout$LayoutParams;

    .line 326
    .line 327
    iget v4, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->p:I

    .line 328
    .line 329
    invoke-direct {v2, v4, v5}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 330
    .line 331
    .line 332
    const/16 v4, 0xc

    .line 333
    .line 334
    const/4 v5, -0x1

    .line 335
    invoke-virtual {v2, v4, v5}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 336
    .line 337
    .line 338
    iget-object v4, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->r:Landroid/widget/LinearLayout;

    .line 339
    .line 340
    invoke-virtual {v3, v4, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 341
    .line 342
    .line 343
    iget-object v2, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->r:Landroid/widget/LinearLayout;

    .line 344
    .line 345
    invoke-virtual {v2, v6}, Landroid/view/View;->setBackgroundColor(I)V

    .line 346
    .line 347
    .line 348
    iget-object v2, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->r:Landroid/widget/LinearLayout;

    .line 349
    .line 350
    float-to-int v3, v11

    .line 351
    float-to-int v4, v13

    .line 352
    float-to-int v5, v12

    .line 353
    float-to-int v6, v14

    .line 354
    invoke-virtual {v2, v3, v4, v5, v6}, Landroid/view/View;->setPadding(IIII)V

    .line 355
    .line 356
    .line 357
    iget-object v2, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->r:Landroid/widget/LinearLayout;

    .line 358
    .line 359
    const/4 v3, 0x0

    .line 360
    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 361
    .line 362
    .line 363
    iget-object v2, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->r:Landroid/widget/LinearLayout;

    .line 364
    .line 365
    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 366
    .line 367
    .line 368
    new-instance v2, Landroid/widget/LinearLayout;

    .line 369
    .line 370
    invoke-direct {v2, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 371
    .line 372
    .line 373
    iput-object v2, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->t:Landroid/widget/LinearLayout;

    .line 374
    .line 375
    const/16 v3, 0x11

    .line 376
    .line 377
    invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 378
    .line 379
    .line 380
    iget-object v2, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->t:Landroid/widget/LinearLayout;

    .line 381
    .line 382
    const/4 v3, 0x4

    .line 383
    if-eqz v8, :cond_7

    .line 384
    .line 385
    const/4 v4, 0x0

    .line 386
    goto :goto_4

    .line 387
    :cond_7
    move v4, v3

    .line 388
    :goto_4
    invoke-virtual {v2, v4}, Landroid/view/View;->setVisibility(I)V

    .line 389
    .line 390
    .line 391
    iget-object v2, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->t:Landroid/widget/LinearLayout;

    .line 392
    .line 393
    const/4 v4, 0x0

    .line 394
    invoke-virtual {v2, v4}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 395
    .line 396
    .line 397
    iget-object v2, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->t:Landroid/widget/LinearLayout;

    .line 398
    .line 399
    invoke-virtual {v2, v4}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 400
    .line 401
    .line 402
    new-instance v2, Landroid/widget/TextView;

    .line 403
    .line 404
    invoke-direct {v2, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 405
    .line 406
    .line 407
    iput-object v2, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->u:Landroid/widget/TextView;

    .line 408
    .line 409
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 410
    .line 411
    const/high16 v5, 0x3f800000    # 1.0f

    .line 412
    .line 413
    const/4 v6, -0x2

    .line 414
    invoke-direct {v1, v4, v6, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 415
    .line 416
    .line 417
    invoke-virtual {v2, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 418
    .line 419
    .line 420
    iget-object v1, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->u:Landroid/widget/TextView;

    .line 421
    .line 422
    const/4 v2, 0x1

    .line 423
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 424
    .line 425
    .line 426
    iget-object v1, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->u:Landroid/widget/TextView;

    .line 427
    .line 428
    invoke-virtual {v1, v7}, Landroid/widget/TextView;->setTextColor(I)V

    .line 429
    .line 430
    .line 431
    iget-object v1, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->u:Landroid/widget/TextView;

    .line 432
    .line 433
    invoke-virtual {v1, v4, v10}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 434
    .line 435
    .line 436
    iget-object v1, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->u:Landroid/widget/TextView;

    .line 437
    .line 438
    if-eqz v15, :cond_8

    .line 439
    .line 440
    const/4 v3, 0x0

    .line 441
    :cond_8
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 442
    .line 443
    .line 444
    const/16 v3, 0x11

    .line 445
    .line 446
    if-ne v9, v3, :cond_9

    .line 447
    .line 448
    iget-object v1, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->r:Landroid/widget/LinearLayout;

    .line 449
    .line 450
    invoke-virtual {v1, v3}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 451
    .line 452
    .line 453
    iget-object v1, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->r:Landroid/widget/LinearLayout;

    .line 454
    .line 455
    iget-object v2, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->t:Landroid/widget/LinearLayout;

    .line 456
    .line 457
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 458
    .line 459
    .line 460
    return-void

    .line 461
    :cond_9
    const/4 v1, 0x3

    .line 462
    const/high16 v2, 0x40e00000    # 7.0f

    .line 463
    .line 464
    const/16 v3, 0x10

    .line 465
    .line 466
    const/4 v4, 0x5

    .line 467
    if-ne v9, v4, :cond_a

    .line 468
    .line 469
    iget-object v4, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->r:Landroid/widget/LinearLayout;

    .line 470
    .line 471
    invoke-virtual {v4, v3}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 472
    .line 473
    .line 474
    iget-object v3, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->r:Landroid/widget/LinearLayout;

    .line 475
    .line 476
    iget-object v4, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->u:Landroid/widget/TextView;

    .line 477
    .line 478
    invoke-virtual {v3, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 479
    .line 480
    .line 481
    iget-object v3, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->r:Landroid/widget/LinearLayout;

    .line 482
    .line 483
    iget-object v4, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->t:Landroid/widget/LinearLayout;

    .line 484
    .line 485
    invoke-virtual {v3, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 486
    .line 487
    .line 488
    iget-object v3, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->u:Landroid/widget/TextView;

    .line 489
    .line 490
    invoke-virtual {v0, v2}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->i(F)I

    .line 491
    .line 492
    .line 493
    move-result v2

    .line 494
    const/4 v4, 0x0

    .line 495
    invoke-virtual {v3, v4, v4, v2, v4}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 496
    .line 497
    .line 498
    iget-object v2, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->u:Landroid/widget/TextView;

    .line 499
    .line 500
    sget-object v3, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 501
    .line 502
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 503
    .line 504
    .line 505
    iget-object v2, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->u:Landroid/widget/TextView;

    .line 506
    .line 507
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setGravity(I)V

    .line 508
    .line 509
    .line 510
    return-void

    .line 511
    :cond_a
    if-ne v9, v1, :cond_b

    .line 512
    .line 513
    iget-object v1, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->r:Landroid/widget/LinearLayout;

    .line 514
    .line 515
    invoke-virtual {v1, v3}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 516
    .line 517
    .line 518
    iget-object v1, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->r:Landroid/widget/LinearLayout;

    .line 519
    .line 520
    iget-object v3, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->t:Landroid/widget/LinearLayout;

    .line 521
    .line 522
    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 523
    .line 524
    .line 525
    iget-object v1, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->r:Landroid/widget/LinearLayout;

    .line 526
    .line 527
    iget-object v3, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->u:Landroid/widget/TextView;

    .line 528
    .line 529
    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 530
    .line 531
    .line 532
    iget-object v1, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->u:Landroid/widget/TextView;

    .line 533
    .line 534
    invoke-virtual {v0, v2}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->i(F)I

    .line 535
    .line 536
    .line 537
    move-result v2

    .line 538
    const/4 v3, 0x0

    .line 539
    invoke-virtual {v1, v2, v3, v3, v3}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 540
    .line 541
    .line 542
    iget-object v1, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->u:Landroid/widget/TextView;

    .line 543
    .line 544
    sget-object v2, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 545
    .line 546
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 547
    .line 548
    .line 549
    iget-object v1, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->u:Landroid/widget/TextView;

    .line 550
    .line 551
    const/4 v4, 0x5

    .line 552
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setGravity(I)V

    .line 553
    .line 554
    .line 555
    :cond_b
    return-void
.end method


# virtual methods
.method public final A(F)F
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->d:Landroid/content/Context;

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

.method public B()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->g:Ljava/util/List;

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
    iget v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->h:I

    .line 12
    .line 13
    iget-object v1, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->g:Ljava/util/List;

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
    iput v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->h:I

    .line 25
    .line 26
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->u:Landroid/widget/TextView;

    .line 27
    .line 28
    iget v1, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->h:I

    .line 29
    .line 30
    invoke-virtual {p0, v0, v1}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->q(Landroid/widget/TextView;I)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->y()V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->o()Landroid/view/View;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    if-eqz v0, :cond_1

    .line 41
    .line 42
    iget-object v1, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->t:Landroid/widget/LinearLayout;

    .line 43
    .line 44
    invoke-virtual {v1}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 45
    .line 46
    .line 47
    iget-object v1, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->t:Landroid/widget/LinearLayout;

    .line 48
    .line 49
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 50
    .line 51
    .line 52
    :cond_1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->k()V

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

.method public final D()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->m()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->f:Landroidx/viewpager/widget/ViewPager;

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
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->f:Landroidx/viewpager/widget/ViewPager;

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
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->f:Landroidx/viewpager/widget/ViewPager;

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
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->k()V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->k()V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_2
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->r()V

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
    iget v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->x:F

    .line 2
    .line 3
    return v0
.end method

.method public getItemHeight()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->q:I

    .line 2
    .line 3
    return v0
.end method

.method public getItemWidth()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->p:I

    .line 2
    .line 3
    return v0
.end method

.method public getViewPager()Landroidx/viewpager/widget/ViewPager;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->f:Landroidx/viewpager/widget/ViewPager;

    .line 2
    .line 3
    return-object v0
.end method

.method public h(FFFF)Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->r:Landroid/widget/LinearLayout;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->i(F)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-virtual {p0, p2}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->i(F)I

    .line 8
    .line 9
    .line 10
    move-result p2

    .line 11
    invoke-virtual {p0, p3}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->i(F)I

    .line 12
    .line 13
    .line 14
    move-result p3

    .line 15
    invoke-virtual {p0, p4}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->i(F)I

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
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->d:Landroid/content/Context;

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

.method public j(I)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->z()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-lez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->g:Ljava/util/List;

    .line 8
    .line 9
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    :cond_0
    const/4 p1, 0x0

    .line 15
    return-object p1
.end method

.method public k()V
    .locals 8

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->n()Z

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
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->m:Z

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    :goto_0
    return-void

    .line 13
    :cond_1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->m()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->l:Z

    .line 20
    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->r()V

    .line 24
    .line 25
    .line 26
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor()Ljava/util/concurrent/ScheduledExecutorService;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    iput-object v1, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->c:Ljava/util/concurrent/ScheduledExecutorService;

    .line 31
    .line 32
    new-instance v2, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner$c;

    .line 33
    .line 34
    invoke-direct {v2, p0}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner$c;-><init>(Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;)V

    .line 35
    .line 36
    .line 37
    iget-wide v3, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->j:J

    .line 38
    .line 39
    iget-wide v5, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->k:J

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
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->m:Z

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
    invoke-static {v0}, Lb8/c;->a(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :cond_2
    const/4 v0, 0x0

    .line 79
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->m:Z

    .line 80
    .line 81
    return-void
.end method

.method public m()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->f:Landroidx/viewpager/widget/ViewPager;

    .line 2
    .line 3
    instance-of v0, v0, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;

    .line 4
    .line 5
    return v0
.end method

.method public n()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->f:Landroidx/viewpager/widget/ViewPager;

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
    invoke-static {v0}, Lb8/c;->c(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return v1

    .line 12
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->g:Ljava/util/List;

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
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->w:Z

    .line 24
    .line 25
    const/4 v2, 0x1

    .line 26
    if-nez v0, :cond_3

    .line 27
    .line 28
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->g:Ljava/util/List;

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
    invoke-static {v0}, Lb8/c;->c(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    return v1
.end method

.method public abstract o()Landroid/view/View;
.end method

.method public abstract p(I)Landroid/view/View;
.end method

.method public q(Landroid/widget/TextView;I)V
    .locals 0

    .line 1
    return-void
.end method

.method public r()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->C()V

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
    invoke-static {v0}, Lb8/c;->a(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->m:Z

    .line 34
    .line 35
    return-void
.end method

.method public final s(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->n()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->v:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->D()V

    .line 12
    .line 13
    .line 14
    :cond_0
    add-int/lit8 p1, p1, 0x1

    .line 15
    .line 16
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->f:Landroidx/viewpager/widget/ViewPager;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(I)V

    .line 19
    .line 20
    .line 21
    :cond_1
    return-void
.end method

.method public abstract setCurrentIndicator(I)V
.end method

.method public setTypeface(Landroid/graphics/Typeface;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->u:Landroid/widget/TextView;

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

.method public t(Z)Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->l:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public u(Z)Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->s:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public final v()V
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
    new-instance v2, Lf8/a;

    .line 19
    .line 20
    iget-object v3, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->d:Landroid/content/Context;

    .line 21
    .line 22
    iget v4, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->n:I

    .line 23
    .line 24
    invoke-direct {v2, v3, v1, v4}, Lf8/a;-><init>(Landroid/content/Context;Landroid/view/animation/Interpolator;I)V

    .line 25
    .line 26
    .line 27
    iget-object v1, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->f:Landroidx/viewpager/widget/ViewPager;

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

.method public w(Ljava/util/List;)Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->g:Ljava/util/List;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->v:Z

    .line 5
    .line 6
    return-object p0
.end method

.method public x(Ljava/lang/Class;)Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->o:Ljava/lang/Class;

    .line 2
    .line 3
    return-object p0
.end method

.method public final y()V
    .locals 3

    .line 1
    new-instance v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner$d;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner$d;-><init>(Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner$a;)V

    .line 5
    .line 6
    .line 7
    iget-object v1, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->f:Landroidx/viewpager/widget/ViewPager;

    .line 8
    .line 9
    invoke-virtual {v1, v0}, Landroidx/viewpager/widget/ViewPager;->setAdapter(Landroidx/viewpager/widget/PagerAdapter;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->f:Landroidx/viewpager/widget/ViewPager;

    .line 13
    .line 14
    iget-object v1, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->g:Ljava/util/List;

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
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->o:Ljava/lang/Class;

    .line 26
    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    iget-object v1, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->f:Landroidx/viewpager/widget/ViewPager;

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
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->m()Z

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
    iput v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->n:I

    .line 49
    .line 50
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->v()V

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
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->m()Z

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
    iput v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->n:I

    .line 65
    .line 66
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->v()V
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
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->z:Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;

    .line 74
    .line 75
    if-eqz v0, :cond_2

    .line 76
    .line 77
    iget-object v1, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->f:Landroidx/viewpager/widget/ViewPager;

    .line 78
    .line 79
    invoke-virtual {v1, v0}, Landroidx/viewpager/widget/ViewPager;->removeOnPageChangeListener(Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;)V

    .line 80
    .line 81
    .line 82
    :cond_2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->f:Landroidx/viewpager/widget/ViewPager;

    .line 83
    .line 84
    iget-object v1, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->z:Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;

    .line 85
    .line 86
    invoke-virtual {v0, v1}, Landroidx/viewpager/widget/ViewPager;->addOnPageChangeListener(Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;)V

    .line 87
    .line 88
    .line 89
    return-void
.end method

.method public z()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->g:Ljava/util/List;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return v0
.end method
