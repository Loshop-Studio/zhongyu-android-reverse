.class public abstract Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;
.super Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        "T:",
        "Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner<",
        "TE;TT;>;>",
        "Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner<",
        "TE;TT;>;"
    }
.end annotation


# instance fields
.field public A:I

.field public B:I

.field public C:I

.field public D:I

.field public E:I

.field public F:Landroid/graphics/drawable/Drawable;

.field public G:Landroid/graphics/drawable/Drawable;

.field public H:I

.field public I:I

.field public J:Ljava/lang/Class;

.field public K:Landroid/widget/LinearLayout;

.field public final z:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;-><init>(Landroid/content/Context;)V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;->z:Ljava/util/ArrayList;

    const/4 v0, 0x0

    .line 3
    invoke-virtual {p0, p1, v0}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;->h(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 4
    invoke-direct {p0, p1, p2}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 5
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;->z:Ljava/util/ArrayList;

    .line 6
    invoke-virtual {p0, p1, p2}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;->h(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 7
    invoke-direct {p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 8
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    iput-object p3, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;->z:Ljava/util/ArrayList;

    .line 9
    invoke-virtual {p0, p1, p2}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;->h(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method


# virtual methods
.method public final h(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    .line 1
    sget-object v0, Lcom/xuexiang/xui/R$styleable;->BaseIndicatorBanner:[I

    .line 2
    .line 3
    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    sget v0, Lcom/xuexiang/xui/R$styleable;->BaseIndicatorBanner_bb_indicatorStyle:I

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iput v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;->A:I

    .line 15
    .line 16
    sget v0, Lcom/xuexiang/xui/R$styleable;->BaseIndicatorBanner_bb_indicatorWidth:I

    .line 17
    .line 18
    const/high16 v1, 0x40c00000    # 6.0f

    .line 19
    .line 20
    invoke-virtual {p0, v1}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->a(F)I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    invoke-virtual {p2, v0, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iput v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;->B:I

    .line 29
    .line 30
    sget v0, Lcom/xuexiang/xui/R$styleable;->BaseIndicatorBanner_bb_indicatorHeight:I

    .line 31
    .line 32
    invoke-virtual {p0, v1}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->a(F)I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    invoke-virtual {p2, v0, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iput v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;->C:I

    .line 41
    .line 42
    sget v0, Lcom/xuexiang/xui/R$styleable;->BaseIndicatorBanner_bb_indicatorGap:I

    .line 43
    .line 44
    invoke-virtual {p0, v1}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->a(F)I

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iput v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;->D:I

    .line 53
    .line 54
    sget v0, Lcom/xuexiang/xui/R$styleable;->BaseIndicatorBanner_bb_indicatorCornerRadius:I

    .line 55
    .line 56
    const/high16 v1, 0x40400000    # 3.0f

    .line 57
    .line 58
    invoke-virtual {p0, v1}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->a(F)I

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    iput v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;->E:I

    .line 67
    .line 68
    sget v0, Lcom/xuexiang/xui/R$styleable;->BaseIndicatorBanner_bb_indicatorSelectColor:I

    .line 69
    .line 70
    const-string v1, "#ffffff"

    .line 71
    .line 72
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    iput v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;->H:I

    .line 81
    .line 82
    sget v0, Lcom/xuexiang/xui/R$styleable;->BaseIndicatorBanner_bb_indicatorUnselectColor:I

    .line 83
    .line 84
    const-string v1, "#88ffffff"

    .line 85
    .line 86
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    iput v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;->I:I

    .line 95
    .line 96
    sget v0, Lcom/xuexiang/xui/R$styleable;->BaseIndicatorBanner_bb_indicatorSelectRes:I

    .line 97
    .line 98
    const/4 v1, 0x0

    .line 99
    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    sget v2, Lcom/xuexiang/xui/R$styleable;->BaseIndicatorBanner_bb_indicatorUnselectRes:I

    .line 104
    .line 105
    invoke-virtual {p2, v2, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 106
    .line 107
    .line 108
    move-result v1

    .line 109
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 110
    .line 111
    .line 112
    new-instance p2, Landroid/widget/LinearLayout;

    .line 113
    .line 114
    invoke-direct {p2, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 115
    .line 116
    .line 117
    iput-object p2, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;->K:Landroid/widget/LinearLayout;

    .line 118
    .line 119
    const/16 p1, 0x11

    .line 120
    .line 121
    invoke-virtual {p2, p1}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 122
    .line 123
    .line 124
    :try_start_0
    iget p1, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;->A:I

    .line 125
    .line 126
    if-nez p1, :cond_1

    .line 127
    .line 128
    if-eqz v0, :cond_0

    .line 129
    .line 130
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    iput-object p1, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;->F:Landroid/graphics/drawable/Drawable;

    .line 139
    .line 140
    goto :goto_0

    .line 141
    :catch_0
    move-exception p1

    .line 142
    goto :goto_1

    .line 143
    :cond_0
    :goto_0
    if-eqz v1, :cond_1

    .line 144
    .line 145
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    invoke-virtual {p1, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    iput-object p1, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;->G:Landroid/graphics/drawable/Drawable;
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 154
    .line 155
    :cond_1
    return-void

    .line 156
    :goto_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 157
    .line 158
    .line 159
    return-void
.end method

.method public setCurrentIndicator(I)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;->z:Ljava/util/ArrayList;

    .line 3
    .line 4
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 5
    .line 6
    .line 7
    move-result v2

    .line 8
    if-ge v0, v2, :cond_1

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    check-cast v1, Landroid/widget/ImageView;

    .line 15
    .line 16
    if-ne v0, p1, :cond_0

    .line 17
    .line 18
    iget-object v2, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;->F:Landroid/graphics/drawable/Drawable;

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_0
    iget-object v2, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;->G:Landroid/graphics/drawable/Drawable;

    .line 22
    .line 23
    :goto_1
    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 24
    .line 25
    .line 26
    add-int/lit8 v0, v0, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    :try_start_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;->J:Ljava/lang/Class;

    .line 30
    .line 31
    if-eqz v0, :cond_5

    .line 32
    .line 33
    iget v2, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->g:I

    .line 34
    .line 35
    const/4 v3, 0x0

    .line 36
    if-ne p1, v2, :cond_3

    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    if-nez v0, :cond_2

    .line 43
    .line 44
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    check-cast p1, Landroid/view/View;

    .line 49
    .line 50
    throw v3

    .line 51
    :catch_0
    move-exception p1

    .line 52
    goto :goto_2

    .line 53
    :cond_2
    new-instance p1, Ljava/lang/ClassCastException;

    .line 54
    .line 55
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 56
    .line 57
    .line 58
    throw p1

    .line 59
    :cond_3
    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    if-nez v0, :cond_4

    .line 64
    .line 65
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    check-cast p1, Landroid/view/View;

    .line 70
    .line 71
    throw v3

    .line 72
    :cond_4
    new-instance p1, Ljava/lang/ClassCastException;

    .line 73
    .line 74
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 75
    .line 76
    .line 77
    throw p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 78
    :cond_5
    return-void

    .line 79
    :goto_2
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 80
    .line 81
    .line 82
    return-void
.end method
