.class public Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;
.super Landroid/widget/ScrollView;
.source "SourceFile"


# static fields
.field public static final synthetic p:I


# instance fields
.field public final a:Landroid/content/Context;

.field public b:Lp3/r;

.field public c:I

.field public d:Lcom/xuexiang/xui/widget/tabbar/vertical/TabView;

.field public e:I

.field public f:I

.field public g:I

.field public h:F

.field public i:I

.field public j:I

.field public k:Landroidx/viewpager/widget/ViewPager;

.field public l:Landroidx/viewpager/widget/PagerAdapter;

.field public final m:Ljava/util/ArrayList;

.field public n:Lp3/n;

.field public o:Lp3/o;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    iput-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->a:Landroid/content/Context;

    .line 5
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    iput-object p3, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->m:Ljava/util/ArrayList;

    .line 6
    sget-object p3, Lcom/xuexiang/xui/R$styleable;->VerticalTabLayout:[I

    invoke-virtual {p1, p2, p3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p2

    .line 7
    sget p3, Lcom/xuexiang/xui/R$styleable;->VerticalTabLayout_vtl_indicator_color:I

    sget v0, Lcom/xuexiang/xui/R$attr;->colorAccent:I

    const/4 v1, 0x0

    .line 8
    invoke-static {p1, v0, v1}, Lkotlin/collections/u;->F(Landroid/content/Context;II)I

    move-result v0

    .line 9
    invoke-virtual {p2, p3, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p3

    iput p3, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->c:I

    .line 10
    sget p3, Lcom/xuexiang/xui/R$styleable;->VerticalTabLayout_vtl_indicator_width:I

    const/high16 v0, 0x40400000    # 3.0f

    invoke-static {p1, v0}, Lh4/a;->h(Landroid/content/Context;F)I

    move-result p1

    int-to-float p1, p1

    invoke-virtual {p2, p3, p1}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p1

    float-to-int p1, p1

    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->f:I

    .line 11
    sget p1, Lcom/xuexiang/xui/R$styleable;->VerticalTabLayout_vtl_indicator_corners:I

    const/4 p3, 0x0

    invoke-virtual {p2, p1, p3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->h:F

    .line 12
    sget p1, Lcom/xuexiang/xui/R$styleable;->VerticalTabLayout_vtl_indicator_gravity:I

    const/4 v0, 0x3

    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->g:I

    if-ne p1, v0, :cond_0

    .line 13
    iput v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->g:I

    goto :goto_0

    :cond_0
    const/4 v0, 0x5

    if-ne p1, v0, :cond_1

    .line 14
    iput v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->g:I

    goto :goto_0

    :cond_1
    const/16 v0, 0x77

    if-ne p1, v0, :cond_2

    .line 15
    iput v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->g:I

    .line 16
    :cond_2
    :goto_0
    sget p1, Lcom/xuexiang/xui/R$styleable;->VerticalTabLayout_vtl_tab_margin:I

    invoke-virtual {p2, p1, p3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p1

    float-to-int p1, p1

    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->e:I

    .line 17
    sget p1, Lcom/xuexiang/xui/R$styleable;->VerticalTabLayout_vtl_tab_mode:I

    const/16 p3, 0xa

    invoke-virtual {p2, p1, p3}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->i:I

    .line 18
    sget p1, Lcom/xuexiang/xui/R$styleable;->VerticalTabLayout_vtl_tab_height:I

    const/high16 p3, -0x40000000    # -2.0f

    invoke-virtual {p2, p1, p3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p1

    float-to-int p1, p1

    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->j:I

    .line 19
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method public static a(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;IZ)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->m:Ljava/util/ArrayList;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->b:Lp3/r;

    .line 4
    .line 5
    invoke-virtual {v1, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Lcom/xuexiang/xui/widget/tabbar/vertical/TabView;

    .line 10
    .line 11
    iget-object v2, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->d:Lcom/xuexiang/xui/widget/tabbar/vertical/TabView;

    .line 12
    .line 13
    const/4 v3, 0x1

    .line 14
    const/4 v4, 0x0

    .line 15
    if-eq v1, v2, :cond_0

    .line 16
    .line 17
    move v5, v3

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move v5, v4

    .line 20
    :goto_0
    const/4 v6, 0x0

    .line 21
    if-eqz v5, :cond_5

    .line 22
    .line 23
    if-eqz v2, :cond_1

    .line 24
    .line 25
    invoke-interface {v2, v4}, Landroid/widget/Checkable;->setChecked(Z)V

    .line 26
    .line 27
    .line 28
    iget-object v6, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->d:Lcom/xuexiang/xui/widget/tabbar/vertical/TabView;

    .line 29
    .line 30
    :cond_1
    invoke-interface {v1, v3}, Landroid/widget/Checkable;->setChecked(Z)V

    .line 31
    .line 32
    .line 33
    if-eqz p2, :cond_2

    .line 34
    .line 35
    iget-object p2, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->b:Lp3/r;

    .line 36
    .line 37
    invoke-virtual {p2, p1}, Lp3/r;->b(I)V

    .line 38
    .line 39
    .line 40
    :cond_2
    iget-object p2, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->b:Lp3/r;

    .line 41
    .line 42
    invoke-virtual {p2, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    check-cast p2, Lcom/xuexiang/xui/widget/tabbar/vertical/TabView;

    .line 47
    .line 48
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    invoke-virtual {p2}, Landroid/view/View;->getTop()I

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    invoke-virtual {p2}, Landroid/view/View;->getHeight()I

    .line 57
    .line 58
    .line 59
    move-result p2

    .line 60
    div-int/lit8 p2, p2, 0x2

    .line 61
    .line 62
    add-int/2addr p2, v3

    .line 63
    sub-int/2addr p2, v2

    .line 64
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    div-int/lit8 v2, v2, 0x2

    .line 69
    .line 70
    if-le p2, v2, :cond_3

    .line 71
    .line 72
    sub-int/2addr p2, v2

    .line 73
    invoke-virtual {p0, v4, p2}, Landroid/widget/ScrollView;->smoothScrollBy(II)V

    .line 74
    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_3
    if-ge p2, v2, :cond_4

    .line 78
    .line 79
    sub-int/2addr p2, v2

    .line 80
    invoke-virtual {p0, v4, p2}, Landroid/widget/ScrollView;->smoothScrollBy(II)V

    .line 81
    .line 82
    .line 83
    :cond_4
    :goto_1
    iput-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->d:Lcom/xuexiang/xui/widget/tabbar/vertical/TabView;

    .line 84
    .line 85
    :cond_5
    :goto_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 86
    .line 87
    .line 88
    move-result p2

    .line 89
    if-ge v4, p2, :cond_8

    .line 90
    .line 91
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object p2

    .line 95
    check-cast p2, Lp3/m;

    .line 96
    .line 97
    if-eqz p2, :cond_7

    .line 98
    .line 99
    if-eqz v5, :cond_7

    .line 100
    .line 101
    iget-object p2, p2, Lp3/m;->a:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;

    .line 102
    .line 103
    iget-object v1, p2, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->k:Landroidx/viewpager/widget/ViewPager;

    .line 104
    .line 105
    if-eqz v1, :cond_6

    .line 106
    .line 107
    invoke-virtual {v1}, Landroidx/viewpager/widget/ViewPager;->getAdapter()Landroidx/viewpager/widget/PagerAdapter;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    if-eqz v1, :cond_6

    .line 112
    .line 113
    if-ltz p1, :cond_6

    .line 114
    .line 115
    iget-object v1, p2, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->k:Landroidx/viewpager/widget/ViewPager;

    .line 116
    .line 117
    invoke-virtual {v1}, Landroidx/viewpager/widget/ViewPager;->getAdapter()Landroidx/viewpager/widget/PagerAdapter;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    invoke-virtual {v1}, Landroidx/viewpager/widget/PagerAdapter;->getCount()I

    .line 122
    .line 123
    .line 124
    move-result v1

    .line 125
    if-ge p1, v1, :cond_6

    .line 126
    .line 127
    iget-object p2, p2, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->k:Landroidx/viewpager/widget/ViewPager;

    .line 128
    .line 129
    invoke-virtual {p2, p1}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(I)V

    .line 130
    .line 131
    .line 132
    :cond_6
    if-eqz v6, :cond_7

    .line 133
    .line 134
    iget-object p2, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->b:Lp3/r;

    .line 135
    .line 136
    invoke-virtual {p2, v6}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 137
    .line 138
    .line 139
    :cond_7
    add-int/lit8 v4, v4, 0x1

    .line 140
    .line 141
    goto :goto_2

    .line 142
    :cond_8
    return-void
.end method


# virtual methods
.method public final b(Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;)V
    .locals 3

    .line 1
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    const/4 v2, -0x2

    .line 5
    invoke-direct {v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->c(Landroid/widget/LinearLayout$LayoutParams;)V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->b:Lp3/r;

    .line 12
    .line 13
    invoke-virtual {v1, p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->b:Lp3/r;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    invoke-interface {p1, v0}, Landroid/widget/Checkable;->setChecked(Z)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 33
    .line 34
    const/4 v1, 0x0

    .line 35
    invoke-virtual {v0, v1, v1, v1, v1}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 39
    .line 40
    .line 41
    iput-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->d:Lcom/xuexiang/xui/widget/tabbar/vertical/TabView;

    .line 42
    .line 43
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->b:Lp3/r;

    .line 44
    .line 45
    new-instance v1, Lp3/k;

    .line 46
    .line 47
    const/4 v2, 0x0

    .line 48
    invoke-direct {v1, p0, v2}, Lp3/k;-><init>(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;I)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 52
    .line 53
    .line 54
    :cond_0
    new-instance v0, Lb1/c;

    .line 55
    .line 56
    const/4 v1, 0x6

    .line 57
    invoke-direct {v0, p0, v1}, Lb1/c;-><init>(Landroid/view/KeyEvent$Callback;I)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method public final c(Landroid/widget/LinearLayout$LayoutParams;)V
    .locals 3

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->i:I

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    iput v2, p1, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 9
    .line 10
    const/high16 v0, 0x3f800000    # 1.0f

    .line 11
    .line 12
    iput v0, p1, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 13
    .line 14
    invoke-virtual {p1, v2, v2, v2, v2}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 15
    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    invoke-virtual {p0, p1}, Landroid/widget/ScrollView;->setFillViewport(Z)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    const/16 v1, 0xb

    .line 23
    .line 24
    if-ne v0, v1, :cond_1

    .line 25
    .line 26
    iget v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->j:I

    .line 27
    .line 28
    iput v0, p1, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 29
    .line 30
    const/4 v0, 0x0

    .line 31
    iput v0, p1, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 32
    .line 33
    iget v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->e:I

    .line 34
    .line 35
    invoke-virtual {p1, v2, v0, v2, v2}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, v2}, Landroid/widget/ScrollView;->setFillViewport(Z)V

    .line 39
    .line 40
    .line 41
    :cond_1
    return-void
.end method

.method public final d()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->b:Lp3/r;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->d:Lcom/xuexiang/xui/widget/tabbar/vertical/TabView;

    .line 8
    .line 9
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->l:Landroidx/viewpager/widget/PagerAdapter;

    .line 10
    .line 11
    if-eqz v1, :cond_3

    .line 12
    .line 13
    invoke-virtual {v1}, Landroidx/viewpager/widget/PagerAdapter;->getCount()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/4 v1, 0x0

    .line 18
    :goto_0
    if-ge v1, v0, :cond_1

    .line 19
    .line 20
    iget-object v2, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->l:Landroidx/viewpager/widget/PagerAdapter;

    .line 21
    .line 22
    invoke-virtual {v2, v1}, Landroidx/viewpager/widget/PagerAdapter;->getPageTitle(I)Ljava/lang/CharSequence;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    if-eqz v2, :cond_0

    .line 27
    .line 28
    invoke-interface {v2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    goto :goto_1

    .line 33
    :cond_0
    const-string v2, "tab"

    .line 34
    .line 35
    invoke-static {v1, v2}, Landroid/support/v4/media/f;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    :goto_1
    new-instance v3, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;

    .line 40
    .line 41
    iget-object v4, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->a:Landroid/content/Context;

    .line 42
    .line 43
    invoke-direct {v3, v4}, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;-><init>(Landroid/content/Context;)V

    .line 44
    .line 45
    .line 46
    new-instance v4, Le7/r;

    .line 47
    .line 48
    const/4 v5, 0x2

    .line 49
    invoke-direct {v4, v5}, Le7/r;-><init>(I)V

    .line 50
    .line 51
    .line 52
    iput-object v2, v4, Le7/r;->b:Ljava/lang/String;

    .line 53
    .line 54
    new-instance v2, Lq3/c;

    .line 55
    .line 56
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 57
    .line 58
    .line 59
    iput-object v4, v2, Lq3/c;->a:Le7/r;

    .line 60
    .line 61
    iput-object v2, v3, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->d:Lq3/c;

    .line 62
    .line 63
    invoke-virtual {v3}, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->c()V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0, v3}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->b(Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;)V

    .line 67
    .line 68
    .line 69
    add-int/lit8 v1, v1, 0x1

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_1
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->k:Landroidx/viewpager/widget/ViewPager;

    .line 73
    .line 74
    if-eqz v1, :cond_2

    .line 75
    .line 76
    if-lez v0, :cond_2

    .line 77
    .line 78
    invoke-virtual {v1}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->getSelectedTabPosition()I

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    if-eq v0, v1, :cond_2

    .line 87
    .line 88
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->getTabCount()I

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    if-ge v0, v1, :cond_2

    .line 93
    .line 94
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->setTabSelected(I)V

    .line 95
    .line 96
    .line 97
    :cond_2
    return-void

    .line 98
    :cond_3
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->b:Lp3/r;

    .line 99
    .line 100
    invoke-virtual {v1}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 101
    .line 102
    .line 103
    iput-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->d:Lcom/xuexiang/xui/widget/tabbar/vertical/TabView;

    .line 104
    .line 105
    return-void
.end method

.method public final e(Landroidx/viewpager/widget/PagerAdapter;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->l:Landroidx/viewpager/widget/PagerAdapter;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->o:Lp3/o;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroidx/viewpager/widget/PagerAdapter;->unregisterDataSetObserver(Landroid/database/DataSetObserver;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    iput-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->l:Landroidx/viewpager/widget/PagerAdapter;

    .line 13
    .line 14
    if-eqz p1, :cond_2

    .line 15
    .line 16
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->o:Lp3/o;

    .line 17
    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    new-instance v0, Lp3/o;

    .line 21
    .line 22
    invoke-direct {v0, p0}, Lp3/o;-><init>(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;)V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->o:Lp3/o;

    .line 26
    .line 27
    :cond_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->o:Lp3/o;

    .line 28
    .line 29
    invoke-virtual {p1, v0}, Landroidx/viewpager/widget/PagerAdapter;->registerDataSetObserver(Landroid/database/DataSetObserver;)V

    .line 30
    .line 31
    .line 32
    :cond_2
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->d()V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public getSelectedTabPosition()I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->d:Lcom/xuexiang/xui/widget/tabbar/vertical/TabView;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->b:Lp3/r;

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, -0x1

    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    :cond_0
    return v0
.end method

.method public getTabAdapter()Lq3/d;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public getTabCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->b:Lp3/r;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final onFinishInflate()V
    .locals 3

    .line 1
    invoke-super {p0}, Landroid/view/View;->onFinishInflate()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-lez v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 11
    .line 12
    .line 13
    :cond_0
    new-instance v0, Lp3/r;

    .line 14
    .line 15
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->a:Landroid/content/Context;

    .line 16
    .line 17
    invoke-direct {v0, p0, v1}, Lp3/r;-><init>(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;Landroid/content/Context;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->b:Lp3/r;

    .line 21
    .line 22
    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    .line 23
    .line 24
    const/4 v2, -0x1

    .line 25
    invoke-direct {v1, v2, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public setIndicatorColor(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->c:I

    .line 2
    .line 3
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->b:Lp3/r;

    .line 4
    .line 5
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setIndicatorCorners(I)V
    .locals 0

    .line 1
    int-to-float p1, p1

    .line 2
    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->h:F

    .line 3
    .line 4
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->b:Lp3/r;

    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setIndicatorGravity(I)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    if-eq p1, v0, :cond_1

    .line 3
    .line 4
    const/4 v0, 0x5

    .line 5
    if-eq p1, v0, :cond_1

    .line 6
    .line 7
    const/16 v0, 0x77

    .line 8
    .line 9
    if-ne v0, p1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 13
    .line 14
    const-string v0, "only support Gravity.LEFT, Gravity.RIGHT, Gravity.FILL"

    .line 15
    .line 16
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw p1

    .line 20
    :cond_1
    :goto_0
    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->g:I

    .line 21
    .line 22
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->b:Lp3/r;

    .line 23
    .line 24
    invoke-virtual {p1}, Lp3/r;->c()V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public setIndicatorWidth(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->f:I

    .line 2
    .line 3
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->b:Lp3/r;

    .line 4
    .line 5
    invoke-virtual {p1}, Lp3/r;->c()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setTabAdapter(Lq3/d;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->b:Lp3/r;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->d:Lcom/xuexiang/xui/widget/tabbar/vertical/TabView;

    .line 8
    .line 9
    if-eqz p1, :cond_3

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    :goto_0
    invoke-interface {p1}, Lq3/d;->getCount()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-ge v0, v1, :cond_3

    .line 17
    .line 18
    new-instance v1, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;

    .line 19
    .line 20
    iget-object v2, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->a:Landroid/content/Context;

    .line 21
    .line 22
    invoke-direct {v1, v2}, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;-><init>(Landroid/content/Context;)V

    .line 23
    .line 24
    .line 25
    invoke-interface {p1}, Lq3/d;->getIcon()Lq3/b;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    if-eqz v2, :cond_0

    .line 30
    .line 31
    iput-object v2, v1, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->c:Lq3/b;

    .line 32
    .line 33
    :cond_0
    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->b()V

    .line 34
    .line 35
    .line 36
    invoke-interface {p1}, Lq3/d;->getTitle()Lq3/c;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    if-eqz v2, :cond_1

    .line 41
    .line 42
    iput-object v2, v1, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->d:Lq3/c;

    .line 43
    .line 44
    :cond_1
    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->c()V

    .line 45
    .line 46
    .line 47
    invoke-interface {p1}, Lq3/d;->a()Lq3/a;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    if-eqz v2, :cond_2

    .line 52
    .line 53
    iput-object v2, v1, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->e:Lq3/a;

    .line 54
    .line 55
    :cond_2
    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->a()V

    .line 56
    .line 57
    .line 58
    invoke-interface {p1}, Lq3/d;->getBackground()I

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    invoke-virtual {v1, v2}, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->d(I)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0, v1}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->b(Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;)V

    .line 66
    .line 67
    .line 68
    add-int/lit8 v0, v0, 0x1

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_3
    return-void
.end method

.method public setTabHeight(I)V
    .locals 3

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->j:I

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->j:I

    .line 7
    .line 8
    iget p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->i:I

    .line 9
    .line 10
    const/16 v0, 0xa

    .line 11
    .line 12
    if-ne p1, v0, :cond_1

    .line 13
    .line 14
    :goto_0
    return-void

    .line 15
    :cond_1
    const/4 p1, 0x0

    .line 16
    :goto_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->b:Lp3/r;

    .line 17
    .line 18
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-ge p1, v0, :cond_2

    .line 23
    .line 24
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->b:Lp3/r;

    .line 25
    .line 26
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 35
    .line 36
    iget v2, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->j:I

    .line 37
    .line 38
    iput v2, v1, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 41
    .line 42
    .line 43
    add-int/lit8 p1, p1, 0x1

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->b:Lp3/r;

    .line 47
    .line 48
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    .line 49
    .line 50
    .line 51
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->b:Lp3/r;

    .line 52
    .line 53
    new-instance v0, Lp3/k;

    .line 54
    .line 55
    const/4 v1, 0x3

    .line 56
    invoke-direct {v0, p0, v1}, Lp3/k;-><init>(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;I)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 60
    .line 61
    .line 62
    return-void
.end method

.method public setTabMargin(I)V
    .locals 4

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->e:I

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->e:I

    .line 7
    .line 8
    iget p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->i:I

    .line 9
    .line 10
    const/16 v0, 0xa

    .line 11
    .line 12
    if-ne p1, v0, :cond_1

    .line 13
    .line 14
    :goto_0
    return-void

    .line 15
    :cond_1
    const/4 p1, 0x0

    .line 16
    move v0, p1

    .line 17
    :goto_1
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->b:Lp3/r;

    .line 18
    .line 19
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-ge v0, v1, :cond_3

    .line 24
    .line 25
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->b:Lp3/r;

    .line 26
    .line 27
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    check-cast v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 36
    .line 37
    if-nez v0, :cond_2

    .line 38
    .line 39
    move v3, p1

    .line 40
    goto :goto_2

    .line 41
    :cond_2
    iget v3, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->e:I

    .line 42
    .line 43
    :goto_2
    invoke-virtual {v2, p1, v3, p1, p1}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 47
    .line 48
    .line 49
    add-int/lit8 v0, v0, 0x1

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_3
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->b:Lp3/r;

    .line 53
    .line 54
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    .line 55
    .line 56
    .line 57
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->b:Lp3/r;

    .line 58
    .line 59
    new-instance v0, Lp3/k;

    .line 60
    .line 61
    const/4 v1, 0x2

    .line 62
    invoke-direct {v0, p0, v1}, Lp3/k;-><init>(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;I)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 66
    .line 67
    .line 68
    return-void
.end method

.method public setTabMode(I)V
    .locals 3

    .line 1
    const/16 v0, 0xa

    .line 2
    .line 3
    if-eq p1, v0, :cond_1

    .line 4
    .line 5
    const/16 v0, 0xb

    .line 6
    .line 7
    if-ne p1, v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 11
    .line 12
    const-string v0, "only support TAB_MODE_FIXED or TAB_MODE_SCROLLABLE"

    .line 13
    .line 14
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    throw p1

    .line 18
    :cond_1
    :goto_0
    iget v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->i:I

    .line 19
    .line 20
    if-ne p1, v0, :cond_2

    .line 21
    .line 22
    return-void

    .line 23
    :cond_2
    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->i:I

    .line 24
    .line 25
    const/4 p1, 0x0

    .line 26
    move v0, p1

    .line 27
    :goto_1
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->b:Lp3/r;

    .line 28
    .line 29
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-ge v0, v1, :cond_4

    .line 34
    .line 35
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->b:Lp3/r;

    .line 36
    .line 37
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    check-cast v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 46
    .line 47
    invoke-virtual {p0, v2}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->c(Landroid/widget/LinearLayout$LayoutParams;)V

    .line 48
    .line 49
    .line 50
    if-nez v0, :cond_3

    .line 51
    .line 52
    invoke-virtual {v2, p1, p1, p1, p1}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 53
    .line 54
    .line 55
    :cond_3
    invoke-virtual {v1, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 56
    .line 57
    .line 58
    add-int/lit8 v0, v0, 0x1

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_4
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->b:Lp3/r;

    .line 62
    .line 63
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    .line 64
    .line 65
    .line 66
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->b:Lp3/r;

    .line 67
    .line 68
    new-instance v0, Lp3/k;

    .line 69
    .line 70
    const/4 v1, 0x1

    .line 71
    invoke-direct {v0, p0, v1}, Lp3/k;-><init>(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;I)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 75
    .line 76
    .line 77
    return-void
.end method

.method public setTabSelected(I)V
    .locals 2

    .line 1
    new-instance v0, Lp3/l;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, p0, p1, v1}, Lp3/l;-><init>(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;IZ)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public setupWithViewPager(Landroidx/viewpager/widget/ViewPager;)V
    .locals 2
    .param p1    # Landroidx/viewpager/widget/ViewPager;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->k:Landroidx/viewpager/widget/ViewPager;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->n:Lp3/n;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroidx/viewpager/widget/ViewPager;->removeOnPageChangeListener(Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    if-eqz p1, :cond_3

    .line 13
    .line 14
    invoke-virtual {p1}, Landroidx/viewpager/widget/ViewPager;->getAdapter()Landroidx/viewpager/widget/PagerAdapter;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    iput-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->k:Landroidx/viewpager/widget/ViewPager;

    .line 21
    .line 22
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->n:Lp3/n;

    .line 23
    .line 24
    if-nez v1, :cond_1

    .line 25
    .line 26
    new-instance v1, Lp3/n;

    .line 27
    .line 28
    invoke-direct {v1, p0}, Lp3/n;-><init>(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;)V

    .line 29
    .line 30
    .line 31
    iput-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->n:Lp3/n;

    .line 32
    .line 33
    :cond_1
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->n:Lp3/n;

    .line 34
    .line 35
    invoke-virtual {p1, v1}, Landroidx/viewpager/widget/ViewPager;->addOnPageChangeListener(Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;)V

    .line 36
    .line 37
    .line 38
    new-instance p1, Lp3/m;

    .line 39
    .line 40
    invoke-direct {p1, p0}, Lp3/m;-><init>(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;)V

    .line 41
    .line 42
    .line 43
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->m:Ljava/util/ArrayList;

    .line 44
    .line 45
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->e(Landroidx/viewpager/widget/PagerAdapter;)V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 53
    .line 54
    const-string v0, "ViewPager does not have a PagerAdapter set"

    .line 55
    .line 56
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw p1

    .line 60
    :cond_3
    const/4 p1, 0x0

    .line 61
    iput-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->k:Landroidx/viewpager/widget/ViewPager;

    .line 62
    .line 63
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->e(Landroidx/viewpager/widget/PagerAdapter;)V

    .line 64
    .line 65
    .line 66
    return-void
.end method
