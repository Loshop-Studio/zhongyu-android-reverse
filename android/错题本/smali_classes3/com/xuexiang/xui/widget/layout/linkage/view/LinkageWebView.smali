.class public Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;
.super Landroid/webkit/WebView;
.source "SourceFile"

# interfaces
.implements Lb3/b;
.implements Landroidx/core/view/NestedScrollingChild;


# static fields
.field public static final synthetic j:I


# instance fields
.field public final a:Landroidx/core/view/NestedScrollingChildHelper;

.field public final b:Lb3/e;

.field public final c:F

.field public d:Landroid/view/VelocityTracker;

.field public final e:I

.field public final f:I

.field public final g:Landroid/widget/Scroller;

.field public h:Lb3/a;

.field public final i:[I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, -0x1

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p2, 0x2

    .line 4
    new-array p2, p2, [I

    iput-object p2, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->i:[I

    .line 5
    new-instance p2, Landroid/widget/Scroller;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-direct {p2, p3}, Landroid/widget/Scroller;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->g:Landroid/widget/Scroller;

    .line 6
    new-instance p2, Landroidx/core/view/NestedScrollingChildHelper;

    invoke-direct {p2, p0}, Landroidx/core/view/NestedScrollingChildHelper;-><init>(Landroid/view/View;)V

    iput-object p2, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->a:Landroidx/core/view/NestedScrollingChildHelper;

    .line 7
    new-instance p2, Lb3/e;

    invoke-direct {p2}, Lb3/e;-><init>()V

    iput-object p2, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->b:Lb3/e;

    .line 8
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object p3

    .line 9
    invoke-virtual {p3}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result v0

    .line 10
    iput v0, p2, Lb3/e;->e:I

    .line 11
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    iput p1, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->c:F

    .line 12
    invoke-virtual {p3}, Landroid/view/ViewConfiguration;->getScaledMaximumFlingVelocity()I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->e:I

    .line 13
    invoke-virtual {p3}, Landroid/view/ViewConfiguration;->getScaledMinimumFlingVelocity()I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->f:I

    const/4 p1, 0x1

    .line 14
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->setNestedScrollingEnabled(Z)V

    return-void
.end method

.method public static synthetic b(Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;)I
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->computeVerticalScrollOffset()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic c(Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;)I
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->computeVerticalScrollRange()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method


# virtual methods
.method public final a()Lb3/c;
    .locals 2

    .line 1
    new-instance v0, Lo2/a;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    invoke-direct {v0, p0, v1}, Lo2/a;-><init>(Ljava/lang/Object;I)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public final computeScroll()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->g:Landroid/widget/Scroller;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/widget/Scroller;->computeScrollOffset()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/widget/Scroller;->getCurrY()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-virtual {p0, v1, v0}, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->scrollTo(II)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public final d()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->getWebViewContentHeight()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    sub-int/2addr v0, v1

    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-super {p0, v1, v0}, Landroid/view/View;->scrollTo(II)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final dispatchNestedFling(FFZ)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->a:Landroidx/core/view/NestedScrollingChildHelper;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3}, Landroidx/core/view/NestedScrollingChildHelper;->dispatchNestedFling(FFZ)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final dispatchNestedPreFling(FF)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->a:Landroidx/core/view/NestedScrollingChildHelper;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Landroidx/core/view/NestedScrollingChildHelper;->dispatchNestedPreFling(FF)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final dispatchNestedPreScroll(II[I[I)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->a:Landroidx/core/view/NestedScrollingChildHelper;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3, p4}, Landroidx/core/view/NestedScrollingChildHelper;->dispatchNestedPreScroll(II[I[I)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final dispatchNestedScroll(IIII[I)Z
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->a:Landroidx/core/view/NestedScrollingChildHelper;

    .line 2
    .line 3
    move v1, p1

    .line 4
    move v2, p2

    .line 5
    move v3, p3

    .line 6
    move v4, p4

    .line 7
    move-object v5, p5

    .line 8
    invoke-virtual/range {v0 .. v5}, Landroidx/core/view/NestedScrollingChildHelper;->dispatchNestedScroll(IIII[I)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    return p1
.end method

.method public final flingScroll(II)V
    .locals 9

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    .line 2
    .line 3
    .line 4
    move-result v2

    .line 5
    const/high16 v7, -0x80000000

    .line 6
    .line 7
    const v8, 0x7fffffff

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->g:Landroid/widget/Scroller;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    const/4 v3, 0x0

    .line 14
    const/4 v5, 0x0

    .line 15
    const/4 v6, 0x0

    .line 16
    move v4, p2

    .line 17
    invoke-virtual/range {v0 .. v8}, Landroid/widget/Scroller;->fling(IIIIIIII)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public getScrollRange()I
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->getWebViewContentHeight()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    sub-int/2addr v0, v1

    .line 10
    return v0
.end method

.method public getWebViewContentHeight()I
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/webkit/WebView;->getContentHeight()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    int-to-float v0, v0

    .line 6
    iget v1, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->c:F

    .line 7
    .line 8
    mul-float/2addr v0, v1

    .line 9
    float-to-int v0, v0

    .line 10
    return v0
.end method

.method public final hasNestedScrollingParent()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->a:Landroidx/core/view/NestedScrollingChildHelper;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/core/view/NestedScrollingChildHelper;->hasNestedScrollingParent()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final isNestedScrollingEnabled()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->a:Landroidx/core/view/NestedScrollingChildHelper;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/core/view/NestedScrollingChildHelper;->isNestedScrollingEnabled()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final onScrollChanged(IIII)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/webkit/WebView;->onScrollChanged(IIII)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x1

    .line 5
    invoke-virtual {p0, p1}, Landroid/view/View;->canScrollVertically(I)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->getScrollRange()I

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    if-lt p1, p2, :cond_1

    .line 20
    .line 21
    :cond_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->h:Lb3/a;

    .line 22
    .line 23
    if-eqz p1, :cond_1

    .line 24
    .line 25
    check-cast p1, Lo2/a;

    .line 26
    .line 27
    invoke-virtual {p1, p0}, Lo2/a;->z(Landroid/view/View;)V

    .line 28
    .line 29
    .line 30
    :cond_1
    const/4 p1, -0x1

    .line 31
    invoke-virtual {p0, p1}, Landroid/view/View;->canScrollVertically(I)Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-nez p1, :cond_2

    .line 36
    .line 37
    iget-object p1, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->h:Lb3/a;

    .line 38
    .line 39
    if-eqz p1, :cond_2

    .line 40
    .line 41
    check-cast p1, Lo2/a;

    .line 42
    .line 43
    invoke-virtual {p1, p0}, Lo2/a;->A(Landroid/view/View;)V

    .line 44
    .line 45
    .line 46
    :cond_2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->h:Lb3/a;

    .line 47
    .line 48
    if-eqz p1, :cond_3

    .line 49
    .line 50
    check-cast p1, Lo2/a;

    .line 51
    .line 52
    iget-object p1, p1, Lo2/a;->b:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast p1, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;

    .line 55
    .line 56
    invoke-static {p1}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->a(Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;)V

    .line 57
    .line 58
    .line 59
    :cond_3
    return-void
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 10

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    const/4 v3, 0x2

    .line 14
    iget-object v4, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->b:Lb3/e;

    .line 15
    .line 16
    const/4 v5, 0x1

    .line 17
    if-eqz v2, :cond_8

    .line 18
    .line 19
    iget-object v6, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->a:Landroidx/core/view/NestedScrollingChildHelper;

    .line 20
    .line 21
    const/4 v7, 0x0

    .line 22
    const/4 v8, 0x0

    .line 23
    if-eq v2, v5, :cond_3

    .line 24
    .line 25
    const/4 v9, 0x3

    .line 26
    if-eq v2, v3, :cond_0

    .line 27
    .line 28
    if-eq v2, v9, :cond_3

    .line 29
    .line 30
    goto/16 :goto_3

    .line 31
    .line 32
    :cond_0
    invoke-virtual {v4, v0, v1}, Lb3/e;->a(FF)V

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->d:Landroid/view/VelocityTracker;

    .line 36
    .line 37
    if-nez v0, :cond_1

    .line 38
    .line 39
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    iput-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->d:Landroid/view/VelocityTracker;

    .line 44
    .line 45
    :cond_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->d:Landroid/view/VelocityTracker;

    .line 46
    .line 47
    invoke-virtual {v0, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 48
    .line 49
    .line 50
    iget-boolean v0, v4, Lb3/e;->f:Z

    .line 51
    .line 52
    if-eqz v0, :cond_b

    .line 53
    .line 54
    iget v0, v4, Lb3/e;->d:F

    .line 55
    .line 56
    neg-float v0, v0

    .line 57
    float-to-int v0, v0

    .line 58
    iget-object v1, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->i:[I

    .line 59
    .line 60
    invoke-virtual {v6, v8, v0, v1, v7}, Landroidx/core/view/NestedScrollingChildHelper;->dispatchNestedPreScroll(II[I[I)Z

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    if-nez v1, :cond_2

    .line 65
    .line 66
    invoke-virtual {p0, v8, v0}, Landroid/view/View;->scrollBy(II)V

    .line 67
    .line 68
    .line 69
    :cond_2
    invoke-virtual {p1, v9}, Landroid/view/MotionEvent;->setAction(I)V

    .line 70
    .line 71
    .line 72
    goto/16 :goto_3

    .line 73
    .line 74
    :cond_3
    iput-boolean v8, v4, Lb3/e;->f:Z

    .line 75
    .line 76
    iget-object v2, v4, Lb3/e;->c:Landroid/graphics/PointF;

    .line 77
    .line 78
    invoke-virtual {v2, v0, v1}, Landroid/graphics/PointF;->set(FF)V

    .line 79
    .line 80
    .line 81
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->d:Landroid/view/VelocityTracker;

    .line 82
    .line 83
    invoke-virtual {v0, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 84
    .line 85
    .line 86
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->d:Landroid/view/VelocityTracker;

    .line 87
    .line 88
    if-eqz v0, :cond_b

    .line 89
    .line 90
    iget v1, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->e:I

    .line 91
    .line 92
    int-to-float v1, v1

    .line 93
    const/16 v2, 0x3e8

    .line 94
    .line 95
    invoke-virtual {v0, v2, v1}, Landroid/view/VelocityTracker;->computeCurrentVelocity(IF)V

    .line 96
    .line 97
    .line 98
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->d:Landroid/view/VelocityTracker;

    .line 99
    .line 100
    invoke-virtual {v0}, Landroid/view/VelocityTracker;->getYVelocity()F

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    float-to-int v0, v0

    .line 105
    iget-object v1, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->d:Landroid/view/VelocityTracker;

    .line 106
    .line 107
    if-eqz v1, :cond_4

    .line 108
    .line 109
    invoke-virtual {v1}, Landroid/view/VelocityTracker;->recycle()V

    .line 110
    .line 111
    .line 112
    iput-object v7, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->d:Landroid/view/VelocityTracker;

    .line 113
    .line 114
    :cond_4
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    .line 115
    .line 116
    .line 117
    move-result v1

    .line 118
    iget v2, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->f:I

    .line 119
    .line 120
    if-le v1, v2, :cond_b

    .line 121
    .line 122
    neg-int v0, v0

    .line 123
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    .line 124
    .line 125
    .line 126
    move-result v1

    .line 127
    if-gtz v1, :cond_5

    .line 128
    .line 129
    if-lez v0, :cond_6

    .line 130
    .line 131
    :cond_5
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->getScrollRange()I

    .line 132
    .line 133
    .line 134
    move-result v2

    .line 135
    if-lt v1, v2, :cond_7

    .line 136
    .line 137
    if-gez v0, :cond_6

    .line 138
    .line 139
    goto :goto_0

    .line 140
    :cond_6
    move v1, v8

    .line 141
    goto :goto_1

    .line 142
    :cond_7
    :goto_0
    move v1, v5

    .line 143
    :goto_1
    int-to-float v2, v0

    .line 144
    const/4 v3, 0x0

    .line 145
    invoke-virtual {v6, v3, v2}, Landroidx/core/view/NestedScrollingChildHelper;->dispatchNestedPreFling(FF)Z

    .line 146
    .line 147
    .line 148
    move-result v4

    .line 149
    if-nez v4, :cond_b

    .line 150
    .line 151
    invoke-virtual {p0, v3, v2, v1}, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->dispatchNestedFling(FFZ)Z

    .line 152
    .line 153
    .line 154
    invoke-virtual {p0, v8, v0}, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->flingScroll(II)V

    .line 155
    .line 156
    .line 157
    goto :goto_3

    .line 158
    :cond_8
    iget-object v2, v4, Lb3/e;->a:Landroid/graphics/PointF;

    .line 159
    .line 160
    invoke-virtual {v2, v0, v1}, Landroid/graphics/PointF;->set(FF)V

    .line 161
    .line 162
    .line 163
    iget-object v2, v4, Lb3/e;->b:Landroid/graphics/PointF;

    .line 164
    .line 165
    invoke-virtual {v2, v0, v1}, Landroid/graphics/PointF;->set(FF)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {p0, v3}, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->startNestedScroll(I)Z

    .line 169
    .line 170
    .line 171
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    if-eqz v0, :cond_9

    .line 176
    .line 177
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    invoke-interface {v0, v5}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 182
    .line 183
    .line 184
    :cond_9
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->d:Landroid/view/VelocityTracker;

    .line 185
    .line 186
    if-nez v0, :cond_a

    .line 187
    .line 188
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    iput-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->d:Landroid/view/VelocityTracker;

    .line 193
    .line 194
    goto :goto_2

    .line 195
    :cond_a
    invoke-virtual {v0}, Landroid/view/VelocityTracker;->clear()V

    .line 196
    .line 197
    .line 198
    :goto_2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->d:Landroid/view/VelocityTracker;

    .line 199
    .line 200
    invoke-virtual {v0, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 201
    .line 202
    .line 203
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->g:Landroid/widget/Scroller;

    .line 204
    .line 205
    invoke-virtual {v0}, Landroid/widget/Scroller;->abortAnimation()V

    .line 206
    .line 207
    .line 208
    :cond_b
    :goto_3
    invoke-super {p0, p1}, Landroid/webkit/WebView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 209
    .line 210
    .line 211
    return v5
.end method

.method public final scrollTo(II)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->getScrollRange()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-static {p2, v1}, Ljava/lang/Math;->max(II)I

    .line 7
    .line 8
    .line 9
    move-result p2

    .line 10
    invoke-static {p2, v0}, Ljava/lang/Math;->min(II)I

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    invoke-super {p0, p1, p2}, Landroid/view/View;->scrollTo(II)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public setChildLinkageEvent(Lb3/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->h:Lb3/a;

    .line 2
    .line 3
    return-void
.end method

.method public setNestedScrollingEnabled(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->a:Landroidx/core/view/NestedScrollingChildHelper;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/core/view/NestedScrollingChildHelper;->setNestedScrollingEnabled(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final startNestedScroll(I)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->a:Landroidx/core/view/NestedScrollingChildHelper;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/core/view/NestedScrollingChildHelper;->startNestedScroll(I)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final stopNestedScroll()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->a:Landroidx/core/view/NestedScrollingChildHelper;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/core/view/NestedScrollingChildHelper;->stopNestedScroll()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
