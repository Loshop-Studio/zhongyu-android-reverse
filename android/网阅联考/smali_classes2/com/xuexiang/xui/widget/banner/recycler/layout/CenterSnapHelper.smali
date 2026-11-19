.class public Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper;
.super Landroidx/recyclerview/widget/RecyclerView$OnFlingListener;
.source "SourceFile"


# instance fields
.field public a:Landroidx/recyclerview/widget/RecyclerView;

.field public b:Landroid/widget/Scroller;

.field public c:Z

.field public final d:Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$OnFlingListener;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper;->c:Z

    .line 6
    .line 7
    new-instance v0, Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper$a;

    .line 8
    .line 9
    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper$a;-><init>(Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper;)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper;->d:Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;

    .line 13
    .line 14
    return-void
.end method

.method public static synthetic a(Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper;->c:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic b(Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper;->c:Z

    .line 2
    .line 3
    return p1
.end method


# virtual methods
.method public c(Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager$a;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->o()I

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
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->getOrientation()I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    const/4 v3, 0x1

    .line 13
    if-ne v2, v3, :cond_0

    .line 14
    .line 15
    iget-object v2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 16
    .line 17
    invoke-virtual {v2, v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->smoothScrollBy(II)V

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    iget-object v2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 22
    .line 23
    invoke-virtual {v2, v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->smoothScrollBy(II)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper;->c:Z

    .line 28
    .line 29
    :goto_0
    if-eqz p2, :cond_2

    .line 30
    .line 31
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->g()I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    invoke-interface {p2, p1}, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager$a;->onPageSelected(I)V

    .line 36
    .line 37
    .line 38
    :cond_2
    return-void
.end method

.method public onFling(II)Z
    .locals 11

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    return v1

    .line 13
    :cond_0
    iget-object v2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 14
    .line 15
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    if-nez v2, :cond_1

    .line 20
    .line 21
    return v1

    .line 22
    :cond_1
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->j()Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-nez v2, :cond_3

    .line 27
    .line 28
    iget v2, v0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->g:F

    .line 29
    .line 30
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->k()F

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    cmpl-float v2, v2, v3

    .line 35
    .line 36
    if-eqz v2, :cond_2

    .line 37
    .line 38
    iget v2, v0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->g:F

    .line 39
    .line 40
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->l()F

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    cmpl-float v2, v2, v3

    .line 45
    .line 46
    if-nez v2, :cond_3

    .line 47
    .line 48
    :cond_2
    return v1

    .line 49
    :cond_3
    iget-object v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 50
    .line 51
    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->getMinFlingVelocity()I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    iget-object v2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper;->b:Landroid/widget/Scroller;

    .line 56
    .line 57
    const/4 v3, 0x0

    .line 58
    const/4 v4, 0x0

    .line 59
    const/high16 v7, -0x80000000

    .line 60
    .line 61
    const v8, 0x7fffffff

    .line 62
    .line 63
    .line 64
    const/high16 v9, -0x80000000

    .line 65
    .line 66
    const v10, 0x7fffffff

    .line 67
    .line 68
    .line 69
    move v5, p1

    .line 70
    move v6, p2

    .line 71
    invoke-virtual/range {v2 .. v10}, Landroid/widget/Scroller;->fling(IIIIIIII)V

    .line 72
    .line 73
    .line 74
    iget v2, v0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->d:I

    .line 75
    .line 76
    const/4 v3, 0x1

    .line 77
    if-ne v2, v3, :cond_5

    .line 78
    .line 79
    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    .line 80
    .line 81
    .line 82
    move-result p2

    .line 83
    if-le p2, v1, :cond_5

    .line 84
    .line 85
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->g()I

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    iget-object p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper;->b:Landroid/widget/Scroller;

    .line 90
    .line 91
    invoke-virtual {p2}, Landroid/widget/Scroller;->getFinalY()I

    .line 92
    .line 93
    .line 94
    move-result p2

    .line 95
    int-to-float p2, p2

    .line 96
    iget v1, v0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->n:F

    .line 97
    .line 98
    div-float/2addr p2, v1

    .line 99
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->i()F

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    div-float/2addr p2, v1

    .line 104
    float-to-int p2, p2

    .line 105
    iget-object v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 106
    .line 107
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->getReverseLayout()Z

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    if-eqz v0, :cond_4

    .line 112
    .line 113
    sub-int/2addr p1, p2

    .line 114
    goto :goto_0

    .line 115
    :cond_4
    add-int/2addr p1, p2

    .line 116
    :goto_0
    invoke-virtual {v1, p1}, Landroidx/recyclerview/widget/RecyclerView;->smoothScrollToPosition(I)V

    .line 117
    .line 118
    .line 119
    return v3

    .line 120
    :cond_5
    iget p2, v0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->d:I

    .line 121
    .line 122
    if-nez p2, :cond_7

    .line 123
    .line 124
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    .line 125
    .line 126
    .line 127
    move-result p1

    .line 128
    if-le p1, v1, :cond_7

    .line 129
    .line 130
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->g()I

    .line 131
    .line 132
    .line 133
    move-result p1

    .line 134
    iget-object p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper;->b:Landroid/widget/Scroller;

    .line 135
    .line 136
    invoke-virtual {p2}, Landroid/widget/Scroller;->getFinalX()I

    .line 137
    .line 138
    .line 139
    move-result p2

    .line 140
    int-to-float p2, p2

    .line 141
    iget v1, v0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->n:F

    .line 142
    .line 143
    div-float/2addr p2, v1

    .line 144
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->i()F

    .line 145
    .line 146
    .line 147
    move-result v1

    .line 148
    div-float/2addr p2, v1

    .line 149
    float-to-int p2, p2

    .line 150
    iget-object v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 151
    .line 152
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->getReverseLayout()Z

    .line 153
    .line 154
    .line 155
    move-result v0

    .line 156
    if-eqz v0, :cond_6

    .line 157
    .line 158
    sub-int/2addr p1, p2

    .line 159
    goto :goto_1

    .line 160
    :cond_6
    add-int/2addr p1, p2

    .line 161
    :goto_1
    invoke-virtual {v1, p1}, Landroidx/recyclerview/widget/RecyclerView;->smoothScrollToPosition(I)V

    .line 162
    .line 163
    .line 164
    :cond_7
    return v3
.end method
