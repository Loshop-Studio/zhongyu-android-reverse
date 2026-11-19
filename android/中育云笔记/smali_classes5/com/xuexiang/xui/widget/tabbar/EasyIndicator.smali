.class public Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;
.super Landroid/widget/LinearLayout;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;
.implements Lio/github/inflationx/calligraphy3/HasTypeface;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/tabbar/EasyIndicator$b;
    }
.end annotation


# instance fields
.field public c:Landroid/view/View;

.field public d:Landroidx/viewpager/widget/ViewPager;

.field public e:Landroid/widget/LinearLayout;

.field public f:[Landroid/widget/TextView;

.field public g:I

.field public h:I

.field public i:I

.field public j:I

.field public k:I

.field public l:Z

.field public m:I

.field public n:I

.field public o:I

.field public p:I

.field public q:I

.field public r:I

.field public s:I

.field public t:I

.field public u:I

.field public v:F

.field public w:F


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 2
    sget v0, Lcom/xuexiang/xui/R$attr;->EasyIndicatorStyle:I

    invoke-direct {p0, p1, p2, v0}, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/16 v0, 0x2d

    .line 4
    iput v0, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->j:I

    const/4 v0, -0x1

    .line 5
    iput v0, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->k:I

    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->l:Z

    const/4 v1, 0x3

    .line 7
    iput v1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->m:I

    const/4 v1, 0x0

    .line 8
    iput v1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->o:I

    .line 9
    iput v1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->q:I

    .line 10
    iput v1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->r:I

    const/high16 v1, 0x41600000    # 14.0f

    .line 11
    iput v1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->v:F

    .line 12
    iput v1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->w:F

    .line 13
    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 14
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->f()V

    .line 15
    invoke-direct {p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->e(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static synthetic a(Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;)Landroid/view/View;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->c:Landroid/view/View;

    .line 2
    .line 3
    return-object p0
.end method

.method private e(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .line 1
    sget-object v0, Lcom/xuexiang/xui/R$styleable;->EasyIndicator:[I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p1, p2, v0, p3, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    const/4 p2, -0x1

    .line 9
    if-eqz p1, :cond_1

    .line 10
    .line 11
    sget p3, Lcom/xuexiang/xui/R$styleable;->EasyIndicator_indicator_height:I

    .line 12
    .line 13
    iget v0, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->j:I

    .line 14
    .line 15
    invoke-virtual {p0, p1, p3, v0}, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->c(Landroid/content/res/TypedArray;II)F

    .line 16
    .line 17
    .line 18
    move-result p3

    .line 19
    float-to-int p3, p3

    .line 20
    iput p3, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->j:I

    .line 21
    .line 22
    sget p3, Lcom/xuexiang/xui/R$styleable;->EasyIndicator_indicator_line_height:I

    .line 23
    .line 24
    iget v0, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->m:I

    .line 25
    .line 26
    invoke-virtual {p0, p1, p3, v0}, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->c(Landroid/content/res/TypedArray;II)F

    .line 27
    .line 28
    .line 29
    move-result p3

    .line 30
    float-to-int p3, p3

    .line 31
    iput p3, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->m:I

    .line 32
    .line 33
    sget p3, Lcom/xuexiang/xui/R$styleable;->EasyIndicator_indicator_bottom_line_height:I

    .line 34
    .line 35
    iget v0, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->o:I

    .line 36
    .line 37
    invoke-virtual {p0, p1, p3, v0}, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->c(Landroid/content/res/TypedArray;II)F

    .line 38
    .line 39
    .line 40
    move-result p3

    .line 41
    float-to-int p3, p3

    .line 42
    iput p3, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->o:I

    .line 43
    .line 44
    sget p3, Lcom/xuexiang/xui/R$styleable;->EasyIndicator_indicator_bottom_line_color:I

    .line 45
    .line 46
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    sget v1, Lcom/xuexiang/xui/R$attr;->xui_config_color_separator_dark:I

    .line 51
    .line 52
    invoke-static {v0, v1}, Lcom/xuexiang/xui/utils/g;->d(Landroid/content/Context;I)I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    invoke-virtual {p1, p3, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 57
    .line 58
    .line 59
    move-result p3

    .line 60
    iput p3, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->p:I

    .line 61
    .line 62
    sget p3, Lcom/xuexiang/xui/R$styleable;->EasyIndicator_indicator_selected_color:I

    .line 63
    .line 64
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    sget v1, Lcom/xuexiang/xui/R$attr;->colorAccent:I

    .line 69
    .line 70
    invoke-static {v0, v1}, Lcom/xuexiang/xui/utils/g;->d(Landroid/content/Context;I)I

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    invoke-virtual {p1, p3, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 75
    .line 76
    .line 77
    move-result p3

    .line 78
    iput p3, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->t:I

    .line 79
    .line 80
    sget p3, Lcom/xuexiang/xui/R$styleable;->EasyIndicator_indicator_normal_color:I

    .line 81
    .line 82
    sget v0, Lcom/xuexiang/xui/R$color;->xui_config_color_black:I

    .line 83
    .line 84
    invoke-static {v0}, Lcom/xuexiang/xui/utils/f;->c(I)I

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    invoke-virtual {p1, p3, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 89
    .line 90
    .line 91
    move-result p3

    .line 92
    iput p3, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->u:I

    .line 93
    .line 94
    sget p3, Lcom/xuexiang/xui/R$styleable;->EasyIndicator_indicator_line_color:I

    .line 95
    .line 96
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    sget v1, Lcom/xuexiang/xui/R$attr;->colorAccent:I

    .line 101
    .line 102
    invoke-static {v0, v1}, Lcom/xuexiang/xui/utils/g;->d(Landroid/content/Context;I)I

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    invoke-virtual {p1, p3, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 107
    .line 108
    .line 109
    move-result p3

    .line 110
    iput p3, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->n:I

    .line 111
    .line 112
    sget p3, Lcom/xuexiang/xui/R$styleable;->EasyIndicator_indicator_textSize:I

    .line 113
    .line 114
    iget v0, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->v:F

    .line 115
    .line 116
    float-to-int v0, v0

    .line 117
    invoke-virtual {p0, p1, p3, v0}, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->c(Landroid/content/res/TypedArray;II)F

    .line 118
    .line 119
    .line 120
    move-result p3

    .line 121
    iput p3, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->v:F

    .line 122
    .line 123
    sget p3, Lcom/xuexiang/xui/R$styleable;->EasyIndicator_indicator_line_show:I

    .line 124
    .line 125
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->l:Z

    .line 126
    .line 127
    invoke-virtual {p1, p3, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 128
    .line 129
    .line 130
    move-result p3

    .line 131
    iput-boolean p3, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->l:Z

    .line 132
    .line 133
    sget p3, Lcom/xuexiang/xui/R$styleable;->EasyIndicator_indicator_vertical_line_w:I

    .line 134
    .line 135
    iget v0, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->q:I

    .line 136
    .line 137
    invoke-virtual {p0, p1, p3, v0}, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->c(Landroid/content/res/TypedArray;II)F

    .line 138
    .line 139
    .line 140
    move-result p3

    .line 141
    float-to-int p3, p3

    .line 142
    iput p3, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->q:I

    .line 143
    .line 144
    sget p3, Lcom/xuexiang/xui/R$styleable;->EasyIndicator_indicator_vertical_line_color:I

    .line 145
    .line 146
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    sget v1, Lcom/xuexiang/xui/R$attr;->xui_config_color_separator_dark:I

    .line 151
    .line 152
    invoke-static {v0, v1}, Lcom/xuexiang/xui/utils/g;->d(Landroid/content/Context;I)I

    .line 153
    .line 154
    .line 155
    move-result v0

    .line 156
    invoke-virtual {p1, p3, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 157
    .line 158
    .line 159
    move-result p3

    .line 160
    iput p3, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->s:I

    .line 161
    .line 162
    sget p3, Lcom/xuexiang/xui/R$styleable;->EasyIndicator_indicator_vertical_line_h:I

    .line 163
    .line 164
    iget v0, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->r:I

    .line 165
    .line 166
    invoke-virtual {p0, p1, p3, v0}, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->c(Landroid/content/res/TypedArray;II)F

    .line 167
    .line 168
    .line 169
    move-result p3

    .line 170
    float-to-int p3, p3

    .line 171
    iput p3, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->r:I

    .line 172
    .line 173
    sget p3, Lcom/xuexiang/xui/R$styleable;->EasyIndicator_indicator_width:I

    .line 174
    .line 175
    iget v0, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->k:I

    .line 176
    .line 177
    invoke-virtual {p0, p1, p3, v0}, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->c(Landroid/content/res/TypedArray;II)F

    .line 178
    .line 179
    .line 180
    move-result p3

    .line 181
    float-to-int p3, p3

    .line 182
    iput p3, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->k:I

    .line 183
    .line 184
    sget p3, Lcom/xuexiang/xui/R$styleable;->EasyIndicator_indicator_select_textSize:I

    .line 185
    .line 186
    const/16 v0, 0xe

    .line 187
    .line 188
    invoke-virtual {p0, p1, p3, v0}, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->c(Landroid/content/res/TypedArray;II)F

    .line 189
    .line 190
    .line 191
    move-result p3

    .line 192
    iput p3, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->w:F

    .line 193
    .line 194
    iget p3, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->k:I

    .line 195
    .line 196
    if-nez p3, :cond_0

    .line 197
    .line 198
    iput p2, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->k:I

    .line 199
    .line 200
    :cond_0
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 201
    .line 202
    .line 203
    :cond_1
    new-instance p1, Landroid/widget/LinearLayout;

    .line 204
    .line 205
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 206
    .line 207
    .line 208
    move-result-object p3

    .line 209
    invoke-direct {p1, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 210
    .line 211
    .line 212
    iput-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->e:Landroid/widget/LinearLayout;

    .line 213
    .line 214
    new-instance p1, Landroid/widget/LinearLayout$LayoutParams;

    .line 215
    .line 216
    iget p3, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->k:I

    .line 217
    .line 218
    const/4 v0, -0x2

    .line 219
    invoke-direct {p1, p3, v0}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 220
    .line 221
    .line 222
    iget-object p3, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->e:Landroid/widget/LinearLayout;

    .line 223
    .line 224
    invoke-virtual {p3, p2}, Landroid/view/View;->setBackgroundColor(I)V

    .line 225
    .line 226
    .line 227
    const/16 p2, 0x11

    .line 228
    .line 229
    iput p2, p1, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 230
    .line 231
    iget-object p2, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->e:Landroid/widget/LinearLayout;

    .line 232
    .line 233
    invoke-virtual {p2, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 234
    .line 235
    .line 236
    return-void
.end method

.method private setSelectorColor(Landroid/widget/TextView;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->f:[Landroid/widget/TextView;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    move v3, v2

    .line 6
    :goto_0
    if-ge v3, v1, :cond_0

    .line 7
    .line 8
    aget-object v4, v0, v3

    .line 9
    .line 10
    iget v5, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->u:I

    .line 11
    .line 12
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 13
    .line 14
    .line 15
    iget v5, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->v:F

    .line 16
    .line 17
    invoke-virtual {v4, v2, v5}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 18
    .line 19
    .line 20
    add-int/lit8 v3, v3, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget v0, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->t:I

    .line 24
    .line 25
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 26
    .line 27
    .line 28
    iget v0, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->w:F

    .line 29
    .line 30
    invoke-virtual {p1, v2, v0}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 31
    .line 32
    .line 33
    return-void
.end method


# virtual methods
.method public final b(Landroid/widget/TextView;)Landroid/animation/AnimatorSet;
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->e:Landroid/widget/LinearLayout;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getX()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->c:Landroid/view/View;

    .line 8
    .line 9
    invoke-virtual {v1}, Landroid/view/View;->getX()F

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-virtual {p1}, Landroid/view/View;->getX()F

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    add-float/2addr v3, v0

    .line 18
    const/4 v0, 0x2

    .line 19
    new-array v4, v0, [F

    .line 20
    .line 21
    const/4 v5, 0x0

    .line 22
    aput v2, v4, v5

    .line 23
    .line 24
    const/4 v2, 0x1

    .line 25
    aput v3, v4, v2

    .line 26
    .line 27
    const-string v3, "X"

    .line 28
    .line 29
    invoke-static {v1, v3, v4}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    iget-object v3, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->c:Landroid/view/View;

    .line 34
    .line 35
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    iget v4, v3, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 40
    .line 41
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    filled-new-array {v4, p1}, [I

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-static {p1}, Landroid/animation/ValueAnimator;->ofInt([I)Landroid/animation/ValueAnimator;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    new-instance v4, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator$a;

    .line 54
    .line 55
    invoke-direct {v4, p0, v3}, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator$a;-><init>(Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;Landroid/view/ViewGroup$LayoutParams;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1, v4}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 59
    .line 60
    .line 61
    new-instance v3, Landroid/animation/AnimatorSet;

    .line 62
    .line 63
    invoke-direct {v3}, Landroid/animation/AnimatorSet;-><init>()V

    .line 64
    .line 65
    .line 66
    new-instance v4, Landroidx/interpolator/view/animation/FastOutSlowInInterpolator;

    .line 67
    .line 68
    invoke-direct {v4}, Landroidx/interpolator/view/animation/FastOutSlowInInterpolator;-><init>()V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v3, v4}, Landroid/animation/AnimatorSet;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 72
    .line 73
    .line 74
    new-array v0, v0, [Landroid/animation/Animator;

    .line 75
    .line 76
    aput-object v1, v0, v5

    .line 77
    .line 78
    aput-object p1, v0, v2

    .line 79
    .line 80
    invoke-virtual {v3, v0}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 81
    .line 82
    .line 83
    return-object v3
.end method

.method public final c(Landroid/content/res/TypedArray;II)F
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-lez v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getResources()Landroid/content/res/Resources;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    :goto_0
    int-to-float p1, p1

    .line 17
    return p1

    .line 18
    :cond_0
    invoke-virtual {p0, p3}, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->d(I)F

    .line 19
    .line 20
    .line 21
    move-result p3

    .line 22
    float-to-int p3, p3

    .line 23
    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    goto :goto_0
.end method

.method public final d(I)F
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget v0, v0, Landroid/util/DisplayMetrics;->scaledDensity:F

    .line 10
    .line 11
    int-to-float p1, p1

    .line 12
    mul-float/2addr p1, v0

    .line 13
    return p1
.end method

.method public final f()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget v1, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 10
    .line 11
    iput v1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->h:I

    .line 12
    .line 13
    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 14
    .line 15
    iput v0, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->g:I

    .line 16
    .line 17
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    move-object v0, p1

    .line 2
    check-cast v0, Landroid/widget/TextView;

    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, Ljava/lang/Integer;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->d:Landroidx/viewpager/widget/ViewPager;

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-virtual {v1, p1}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(I)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-direct {p0, v0}, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->setSelectorColor(Landroid/widget/TextView;)V

    .line 23
    .line 24
    .line 25
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->l:Z

    .line 26
    .line 27
    if-eqz p1, :cond_1

    .line 28
    .line 29
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->b(Landroid/widget/TextView;)Landroid/animation/AnimatorSet;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p1}, Landroid/animation/AnimatorSet;->start()V

    .line 34
    .line 35
    .line 36
    :cond_1
    :goto_0
    return-void
.end method

.method public onPageScrollStateChanged(I)V
    .locals 0

    return-void
.end method

.method public onPageScrolled(IFI)V
    .locals 1

    .line 1
    iget-object p3, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->c:Landroid/view/View;

    .line 2
    .line 3
    invoke-virtual {p3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 4
    .line 5
    .line 6
    move-result-object p3

    .line 7
    check-cast p3, Landroid/widget/LinearLayout$LayoutParams;

    .line 8
    .line 9
    iget v0, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->i:I

    .line 10
    .line 11
    if-ne v0, p1, :cond_0

    .line 12
    .line 13
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->c:Landroid/view/View;

    .line 14
    .line 15
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    mul-int/2addr v0, p1

    .line 20
    int-to-float p1, v0

    .line 21
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->c:Landroid/view/View;

    .line 22
    .line 23
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    int-to-float v0, v0

    .line 28
    mul-float/2addr p2, v0

    .line 29
    add-float/2addr p1, p2

    .line 30
    float-to-int p1, p1

    .line 31
    invoke-virtual {p3, p1}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    if-le v0, p1, :cond_1

    .line 36
    .line 37
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->c:Landroid/view/View;

    .line 38
    .line 39
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    mul-int/2addr v0, p1

    .line 44
    int-to-float p1, v0

    .line 45
    const/high16 v0, 0x3f800000    # 1.0f

    .line 46
    .line 47
    sub-float/2addr v0, p2

    .line 48
    iget-object p2, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->c:Landroid/view/View;

    .line 49
    .line 50
    invoke-virtual {p2}, Landroid/view/View;->getMeasuredWidth()I

    .line 51
    .line 52
    .line 53
    move-result p2

    .line 54
    int-to-float p2, p2

    .line 55
    mul-float/2addr v0, p2

    .line 56
    sub-float/2addr p1, v0

    .line 57
    float-to-int p1, p1

    .line 58
    invoke-virtual {p3, p1}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 59
    .line 60
    .line 61
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->c:Landroid/view/View;

    .line 62
    .line 63
    invoke-virtual {p1, p3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 64
    .line 65
    .line 66
    return-void
.end method

.method public onPageSelected(I)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->i:I

    .line 2
    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->f:[Landroid/widget/TextView;

    .line 4
    .line 5
    aget-object p1, v0, p1

    .line 6
    .line 7
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->setSelectorColor(Landroid/widget/TextView;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public setOnTabClickListener(Lcom/xuexiang/xui/widget/tabbar/EasyIndicator$b;)V
    .locals 0

    return-void
.end method

.method public setTabTitles([Ljava/lang/String;)V
    .locals 6

    .line 1
    array-length v0, p1

    .line 2
    new-array v0, v0, [Landroid/widget/TextView;

    .line 3
    .line 4
    iput-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->f:[Landroid/widget/TextView;

    .line 5
    .line 6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->e:Landroid/widget/LinearLayout;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    move v1, v0

    .line 13
    :goto_0
    array-length v2, p1

    .line 14
    if-ge v1, v2, :cond_2

    .line 15
    .line 16
    new-instance v2, Landroid/widget/TextView;

    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-direct {v2, v3}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 23
    .line 24
    .line 25
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    invoke-virtual {v2, v3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    aget-object v3, p1, v1

    .line 33
    .line 34
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 35
    .line 36
    .line 37
    invoke-static {}, Ly7/b;->c()Landroid/graphics/Typeface;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 42
    .line 43
    .line 44
    const/16 v3, 0x11

    .line 45
    .line 46
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setGravity(I)V

    .line 47
    .line 48
    .line 49
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    .line 50
    .line 51
    iget v4, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->j:I

    .line 52
    .line 53
    const/high16 v5, 0x3f800000    # 1.0f

    .line 54
    .line 55
    invoke-direct {v3, v0, v4, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v2, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 59
    .line 60
    .line 61
    if-eqz v1, :cond_0

    .line 62
    .line 63
    iget v3, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->u:I

    .line 64
    .line 65
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 66
    .line 67
    .line 68
    iget v3, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->v:F

    .line 69
    .line 70
    invoke-virtual {v2, v0, v3}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 71
    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_0
    iget v3, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->t:I

    .line 75
    .line 76
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 77
    .line 78
    .line 79
    iget v3, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->w:F

    .line 80
    .line 81
    invoke-virtual {v2, v0, v3}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 82
    .line 83
    .line 84
    :goto_1
    invoke-virtual {v2, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 85
    .line 86
    .line 87
    iget-object v3, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->f:[Landroid/widget/TextView;

    .line 88
    .line 89
    aput-object v2, v3, v1

    .line 90
    .line 91
    iget-object v3, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->e:Landroid/widget/LinearLayout;

    .line 92
    .line 93
    invoke-virtual {v3, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 94
    .line 95
    .line 96
    array-length v2, p1

    .line 97
    add-int/lit8 v2, v2, -0x1

    .line 98
    .line 99
    if-eq v1, v2, :cond_1

    .line 100
    .line 101
    new-instance v2, Landroid/view/View;

    .line 102
    .line 103
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    invoke-direct {v2, v3}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 108
    .line 109
    .line 110
    iget v3, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->s:I

    .line 111
    .line 112
    invoke-virtual {v2, v3}, Landroid/view/View;->setBackgroundColor(I)V

    .line 113
    .line 114
    .line 115
    new-instance v3, Landroidx/appcompat/widget/LinearLayoutCompat$LayoutParams;

    .line 116
    .line 117
    iget v4, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->q:I

    .line 118
    .line 119
    iget v5, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->r:I

    .line 120
    .line 121
    invoke-direct {v3, v4, v5}, Landroidx/appcompat/widget/LinearLayoutCompat$LayoutParams;-><init>(II)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v2, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 125
    .line 126
    .line 127
    iget-object v3, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->e:Landroid/widget/LinearLayout;

    .line 128
    .line 129
    invoke-virtual {v3, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 130
    .line 131
    .line 132
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 133
    .line 134
    goto :goto_0

    .line 135
    :cond_2
    invoke-virtual {p0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 136
    .line 137
    .line 138
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->e:Landroid/widget/LinearLayout;

    .line 139
    .line 140
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 141
    .line 142
    .line 143
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->l:Z

    .line 144
    .line 145
    const/4 v1, -0x1

    .line 146
    if-eqz p1, :cond_5

    .line 147
    .line 148
    new-instance p1, Landroid/view/View;

    .line 149
    .line 150
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    invoke-direct {p1, v2}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 155
    .line 156
    .line 157
    iput-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->c:Landroid/view/View;

    .line 158
    .line 159
    iget v2, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->k:I

    .line 160
    .line 161
    if-eqz v2, :cond_3

    .line 162
    .line 163
    if-ne v2, v1, :cond_4

    .line 164
    .line 165
    :cond_3
    iget v0, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->g:I

    .line 166
    .line 167
    iget-object v2, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->f:[Landroid/widget/TextView;

    .line 168
    .line 169
    array-length v2, v2

    .line 170
    div-int/2addr v0, v2

    .line 171
    :cond_4
    new-instance v2, Landroidx/appcompat/widget/LinearLayoutCompat$LayoutParams;

    .line 172
    .line 173
    iget v3, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->m:I

    .line 174
    .line 175
    invoke-direct {v2, v0, v3}, Landroidx/appcompat/widget/LinearLayoutCompat$LayoutParams;-><init>(II)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {p1, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 179
    .line 180
    .line 181
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->c:Landroid/view/View;

    .line 182
    .line 183
    iget v0, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->n:I

    .line 184
    .line 185
    invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 186
    .line 187
    .line 188
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->c:Landroid/view/View;

    .line 189
    .line 190
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 191
    .line 192
    .line 193
    :cond_5
    new-instance p1, Landroid/view/View;

    .line 194
    .line 195
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    invoke-direct {p1, v0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 200
    .line 201
    .line 202
    new-instance v0, Landroidx/appcompat/widget/LinearLayoutCompat$LayoutParams;

    .line 203
    .line 204
    iget v2, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->o:I

    .line 205
    .line 206
    invoke-direct {v0, v1, v2}, Landroidx/appcompat/widget/LinearLayoutCompat$LayoutParams;-><init>(II)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 210
    .line 211
    .line 212
    iget v0, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->p:I

    .line 213
    .line 214
    invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 218
    .line 219
    .line 220
    return-void
.end method

.method public setTypeface(Landroid/graphics/Typeface;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->f:[Landroid/widget/TextView;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    array-length v1, v0

    .line 6
    const/4 v2, 0x0

    .line 7
    :goto_0
    if-ge v2, v1, :cond_0

    .line 8
    .line 9
    aget-object v3, v0, v2

    .line 10
    .line 11
    invoke-virtual {v3, p1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 12
    .line 13
    .line 14
    add-int/lit8 v2, v2, 0x1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    return-void
.end method

.method public setViewPager(Landroidx/viewpager/widget/PagerAdapter;)V
    .locals 3

    .line 1
    new-instance v0, Landroidx/viewpager/widget/ViewPager;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Landroidx/viewpager/widget/ViewPager;-><init>(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->d:Landroidx/viewpager/widget/ViewPager;

    .line 11
    .line 12
    sget v1, Lcom/xuexiang/xui/R$id;->view_pager:I

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroid/view/View;->setId(I)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->d:Landroidx/viewpager/widget/ViewPager;

    .line 18
    .line 19
    new-instance v1, Landroidx/appcompat/widget/LinearLayoutCompat$LayoutParams;

    .line 20
    .line 21
    const/4 v2, -0x1

    .line 22
    invoke-direct {v1, v2, v2}, Landroidx/appcompat/widget/LinearLayoutCompat$LayoutParams;-><init>(II)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->d:Landroidx/viewpager/widget/ViewPager;

    .line 29
    .line 30
    invoke-virtual {v0, p1}, Landroidx/viewpager/widget/ViewPager;->setAdapter(Landroidx/viewpager/widget/PagerAdapter;)V

    .line 31
    .line 32
    .line 33
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->d:Landroidx/viewpager/widget/ViewPager;

    .line 34
    .line 35
    const/4 v0, 0x0

    .line 36
    invoke-virtual {p1, v0}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(I)V

    .line 37
    .line 38
    .line 39
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->d:Landroidx/viewpager/widget/ViewPager;

    .line 40
    .line 41
    invoke-virtual {p1, p0}, Landroidx/viewpager/widget/ViewPager;->addOnPageChangeListener(Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;)V

    .line 42
    .line 43
    .line 44
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->d:Landroidx/viewpager/widget/ViewPager;

    .line 45
    .line 46
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 47
    .line 48
    .line 49
    return-void
.end method
