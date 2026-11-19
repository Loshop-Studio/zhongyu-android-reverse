.class public final Lc2/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;


# instance fields
.field public a:F

.field public b:F

.field public final synthetic c:Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;


# direct methods
.method public constructor <init>(Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lc2/c;->c:Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;

    .line 5
    .line 6
    const/high16 p1, -0x40800000    # -1.0f

    .line 7
    .line 8
    iput p1, p0, Lc2/c;->a:F

    .line 9
    .line 10
    iput p1, p0, Lc2/c;->b:F

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final onPageScrollStateChanged(I)V
    .locals 5

    .line 1
    iget-object v0, p0, Lc2/c;->c:Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;

    .line 2
    .line 3
    iget-object v1, v0, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;->a:Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopPagerAdapterWrapper;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v1, :cond_1

    .line 7
    .line 8
    invoke-static {v0}, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;->a(Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;)I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    iget-object v3, v0, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;->a:Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopPagerAdapterWrapper;

    .line 13
    .line 14
    invoke-virtual {v3, v1}, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopPagerAdapterWrapper;->a(I)I

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    if-nez p1, :cond_1

    .line 19
    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    iget-object v4, v0, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;->a:Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopPagerAdapterWrapper;

    .line 23
    .line 24
    invoke-virtual {v4}, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopPagerAdapterWrapper;->getCount()I

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    add-int/lit8 v4, v4, -0x1

    .line 29
    .line 30
    if-ne v1, v4, :cond_1

    .line 31
    .line 32
    :cond_0
    invoke-virtual {v0, v3, v2}, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;->setCurrentItem(IZ)V

    .line 33
    .line 34
    .line 35
    :cond_1
    iget-object v1, v0, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;->c:Ljava/util/ArrayList;

    .line 36
    .line 37
    if-eqz v1, :cond_3

    .line 38
    .line 39
    :goto_0
    iget-object v1, v0, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;->c:Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-ge v2, v1, :cond_3

    .line 46
    .line 47
    iget-object v1, v0, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;->c:Ljava/util/ArrayList;

    .line 48
    .line 49
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    check-cast v1, Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;

    .line 54
    .line 55
    if-eqz v1, :cond_2

    .line 56
    .line 57
    invoke-interface {v1, p1}, Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;->onPageScrollStateChanged(I)V

    .line 58
    .line 59
    .line 60
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_3
    return-void
.end method

.method public final onPageScrolled(IFI)V
    .locals 10

    .line 1
    iget-object v0, p0, Lc2/c;->c:Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;

    .line 2
    .line 3
    iget-object v1, v0, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;->a:Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopPagerAdapterWrapper;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    if-eqz v1, :cond_2

    .line 8
    .line 9
    invoke-virtual {v1, p1}, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopPagerAdapterWrapper;->a(I)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    cmpl-float v4, p2, v2

    .line 14
    .line 15
    if-nez v4, :cond_1

    .line 16
    .line 17
    iget v4, p0, Lc2/c;->a:F

    .line 18
    .line 19
    cmpl-float v4, v4, v2

    .line 20
    .line 21
    if-nez v4, :cond_1

    .line 22
    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    iget-object v4, v0, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;->a:Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopPagerAdapterWrapper;

    .line 26
    .line 27
    invoke-virtual {v4}, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopPagerAdapterWrapper;->getCount()I

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    add-int/lit8 v4, v4, -0x1

    .line 32
    .line 33
    if-ne p1, v4, :cond_1

    .line 34
    .line 35
    :cond_0
    invoke-virtual {v0, v1, v3}, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;->setCurrentItem(IZ)V

    .line 36
    .line 37
    .line 38
    :cond_1
    move p1, v1

    .line 39
    :cond_2
    iput p2, p0, Lc2/c;->a:F

    .line 40
    .line 41
    iget-object v1, v0, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;->a:Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopPagerAdapterWrapper;

    .line 42
    .line 43
    if-eqz v1, :cond_3

    .line 44
    .line 45
    iget-object v1, v1, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopPagerAdapterWrapper;->a:Landroidx/viewpager/widget/PagerAdapter;

    .line 46
    .line 47
    invoke-virtual {v1}, Landroidx/viewpager/widget/PagerAdapter;->getCount()I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    add-int/lit8 v1, v1, -0x1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_3
    const/4 v1, -0x1

    .line 55
    :goto_0
    iget-object v4, v0, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;->c:Ljava/util/ArrayList;

    .line 56
    .line 57
    if-eqz v4, :cond_7

    .line 58
    .line 59
    move v4, v3

    .line 60
    :goto_1
    iget-object v5, v0, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;->c:Ljava/util/ArrayList;

    .line 61
    .line 62
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 63
    .line 64
    .line 65
    move-result v5

    .line 66
    if-ge v4, v5, :cond_7

    .line 67
    .line 68
    iget-object v5, v0, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;->c:Ljava/util/ArrayList;

    .line 69
    .line 70
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    check-cast v5, Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;

    .line 75
    .line 76
    if-eqz v5, :cond_6

    .line 77
    .line 78
    if-eq p1, v1, :cond_4

    .line 79
    .line 80
    invoke-interface {v5, p1, p2, p3}, Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;->onPageScrolled(IFI)V

    .line 81
    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_4
    float-to-double v6, p2

    .line 85
    const-wide/high16 v8, 0x3fe0000000000000L    # 0.5

    .line 86
    .line 87
    cmpl-double v6, v6, v8

    .line 88
    .line 89
    if-lez v6, :cond_5

    .line 90
    .line 91
    invoke-interface {v5, v3, v2, v3}, Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;->onPageScrolled(IFI)V

    .line 92
    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_5
    invoke-interface {v5, p1, v2, v3}, Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;->onPageScrolled(IFI)V

    .line 96
    .line 97
    .line 98
    :cond_6
    :goto_2
    add-int/lit8 v4, v4, 0x1

    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_7
    return-void
.end method

.method public final onPageSelected(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lc2/c;->c:Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;

    .line 2
    .line 3
    iget-object v1, v0, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;->a:Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopPagerAdapterWrapper;

    .line 4
    .line 5
    invoke-virtual {v1, p1}, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopPagerAdapterWrapper;->a(I)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    iget v1, p0, Lc2/c;->b:F

    .line 10
    .line 11
    int-to-float v2, p1

    .line 12
    cmpl-float v1, v1, v2

    .line 13
    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    iput v2, p0, Lc2/c;->b:F

    .line 17
    .line 18
    iget-object v1, v0, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;->c:Ljava/util/ArrayList;

    .line 19
    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    :goto_0
    iget-object v2, v0, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;->c:Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-ge v1, v2, :cond_1

    .line 30
    .line 31
    iget-object v2, v0, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;->c:Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    check-cast v2, Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;

    .line 38
    .line 39
    if-eqz v2, :cond_0

    .line 40
    .line 41
    invoke-interface {v2, p1}, Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;->onPageSelected(I)V

    .line 42
    .line 43
    .line 44
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    return-void
.end method
