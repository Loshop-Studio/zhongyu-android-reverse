.class public final Lb2/d;
.super Landroidx/viewpager/widget/PagerAdapter;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lcom/xuexiang/xui/widget/banner/widget/banner/SimpleGuideBanner;


# direct methods
.method public constructor <init>(Lcom/xuexiang/xui/widget/banner/widget/banner/SimpleGuideBanner;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lb2/d;->a:Lcom/xuexiang/xui/widget/banner/widget/banner/SimpleGuideBanner;

    .line 2
    .line 3
    invoke-direct {p0}, Landroidx/viewpager/widget/PagerAdapter;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final destroyItem(Landroid/view/ViewGroup;ILjava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p3, Landroid/view/View;

    .line 2
    .line 3
    invoke-virtual {p1, p3}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final getCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lb2/d;->a:Lcom/xuexiang/xui/widget/banner/widget/banner/SimpleGuideBanner;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->e:Ljava/util/List;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    return v0
.end method

.method public final getItemPosition(Ljava/lang/Object;)I
    .locals 0

    .line 1
    const/4 p1, -0x2

    .line 2
    return p1
.end method

.method public final instantiateItem(Landroid/view/ViewGroup;I)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-object v0, p0, Lb2/d;->a:Lcom/xuexiang/xui/widget/banner/widget/banner/SimpleGuideBanner;

    .line 2
    .line 3
    iget-object v1, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->b:Landroid/content/Context;

    .line 4
    .line 5
    sget v2, Lcom/xuexiang/xui/R$layout;->xui_adapter_simple_guide:I

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-static {v1, v2, v3}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    sget v2, Lcom/xuexiang/xui/R$id;->iv:I

    .line 13
    .line 14
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    check-cast v2, Landroid/widget/ImageView;

    .line 19
    .line 20
    sget v3, Lcom/xuexiang/xui/R$id;->tv_jump:I

    .line 21
    .line 22
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    check-cast v3, Landroid/widget/TextView;

    .line 27
    .line 28
    sget v4, Lcom/xuexiang/xui/R$id;->tv_start:I

    .line 29
    .line 30
    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    check-cast v4, Landroid/widget/TextView;

    .line 35
    .line 36
    iget-object v5, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->e:Ljava/util/List;

    .line 37
    .line 38
    invoke-interface {v5, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    const/16 v6, 0x8

    .line 43
    .line 44
    const/4 v7, 0x0

    .line 45
    if-nez p2, :cond_0

    .line 46
    .line 47
    move v8, v7

    .line 48
    goto :goto_0

    .line 49
    :cond_0
    move v8, v6

    .line 50
    :goto_0
    invoke-virtual {v3, v8}, Landroid/view/View;->setVisibility(I)V

    .line 51
    .line 52
    .line 53
    iget-object v8, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->e:Ljava/util/List;

    .line 54
    .line 55
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 56
    .line 57
    .line 58
    move-result v8

    .line 59
    const/4 v9, 0x1

    .line 60
    sub-int/2addr v8, v9

    .line 61
    if-ne p2, v8, :cond_1

    .line 62
    .line 63
    move v6, v7

    .line 64
    :cond_1
    invoke-virtual {v4, v6}, Landroid/view/View;->setVisibility(I)V

    .line 65
    .line 66
    .line 67
    sget-object v6, Lo2/a;->c:Lo2/a;

    .line 68
    .line 69
    if-nez v6, :cond_3

    .line 70
    .line 71
    const-class v6, Lo2/a;

    .line 72
    .line 73
    monitor-enter v6

    .line 74
    :try_start_0
    sget-object v7, Lo2/a;->c:Lo2/a;

    .line 75
    .line 76
    if-nez v7, :cond_2

    .line 77
    .line 78
    new-instance v7, Lo2/a;

    .line 79
    .line 80
    const/4 v8, 0x0

    .line 81
    const/4 v10, 0x0

    .line 82
    invoke-direct {v7, v8, v10}, Lo2/a;-><init>(IZ)V

    .line 83
    .line 84
    .line 85
    new-instance v8, Lc8/c;

    .line 86
    .line 87
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 88
    .line 89
    .line 90
    iput-object v8, v7, Lo2/a;->b:Ljava/lang/Object;

    .line 91
    .line 92
    sput-object v7, Lo2/a;->c:Lo2/a;

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :catchall_0
    move-exception p1

    .line 96
    goto :goto_2

    .line 97
    :cond_2
    :goto_1
    monitor-exit v6

    .line 98
    goto :goto_3

    .line 99
    :goto_2
    monitor-exit v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 100
    throw p1

    .line 101
    :cond_3
    :goto_3
    sget-object v6, Lo2/a;->c:Lo2/a;

    .line 102
    .line 103
    iget-object v6, v6, Lo2/a;->b:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast v6, Lc8/c;

    .line 106
    .line 107
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 111
    .line 112
    .line 113
    move-result-object v6

    .line 114
    invoke-static {v6}, Lcom/bumptech/glide/b;->e(Landroid/content/Context;)Lcom/bumptech/glide/h;

    .line 115
    .line 116
    .line 117
    move-result-object v6

    .line 118
    const-class v7, Landroid/graphics/drawable/Drawable;

    .line 119
    .line 120
    invoke-virtual {v6, v7}, Lcom/bumptech/glide/h;->i(Ljava/lang/Class;)Lcom/bumptech/glide/f;

    .line 121
    .line 122
    .line 123
    move-result-object v6

    .line 124
    iput-object v5, v6, Lcom/bumptech/glide/f;->w:Ljava/lang/Object;

    .line 125
    .line 126
    iput-boolean v9, v6, Lcom/bumptech/glide/f;->y:Z

    .line 127
    .line 128
    invoke-virtual {v6, v2}, Lcom/bumptech/glide/f;->y(Landroid/widget/ImageView;)V

    .line 129
    .line 130
    .line 131
    new-instance v2, La2/a;

    .line 132
    .line 133
    const/4 v5, 0x0

    .line 134
    invoke-direct {v2, v0, v5}, La2/a;-><init>(Lcom/xuexiang/xui/widget/banner/widget/banner/SimpleGuideBanner;I)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v3, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 138
    .line 139
    .line 140
    new-instance v2, La2/a;

    .line 141
    .line 142
    const/4 v3, 0x1

    .line 143
    invoke-direct {v2, v0, v3}, La2/a;-><init>(Lcom/xuexiang/xui/widget/banner/widget/banner/SimpleGuideBanner;I)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v4, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 147
    .line 148
    .line 149
    new-instance v0, Lb2/c;

    .line 150
    .line 151
    invoke-direct {v0, p0, p2}, Lb2/c;-><init>(Lb2/d;I)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 158
    .line 159
    .line 160
    return-object v1
.end method

.method public final isViewFromObject(Landroid/view/View;Ljava/lang/Object;)Z
    .locals 0

    .line 1
    if-ne p1, p2, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    return p1

    .line 5
    :cond_0
    const/4 p1, 0x0

    .line 6
    return p1
.end method
