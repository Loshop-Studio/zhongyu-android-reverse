.class public Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;
.super Landroid/view/ViewGroup;
.source "SourceFile"

# interfaces
.implements Landroidx/core/view/NestedScrollingParent;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout$b;
    }
.end annotation


# instance fields
.field public c:Landroidx/core/view/NestedScrollingParentHelper;

.field public d:Ljava/util/HashMap;

.field public e:I

.field public f:Landroid/widget/Scroller;

.field public g:Landroid/widget/Scroller;

.field public h:Landroid/widget/Scroller;

.field public i:Landroid/view/VelocityTracker;

.field public j:Ly8/e;

.field public k:I

.field public l:I

.field public m:I

.field public n:Z

.field public o:I

.field public p:Ly8/a;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, -0x1

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    iput-object p2, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->d:Ljava/util/HashMap;

    const/4 p2, 0x0

    .line 5
    iput p2, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->m:I

    .line 6
    new-instance p3, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout$a;

    invoke-direct {p3, p0}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout$a;-><init>(Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;)V

    iput-object p3, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->p:Ly8/a;

    .line 7
    new-instance p3, Landroidx/core/view/NestedScrollingParentHelper;

    invoke-direct {p3, p0}, Landroidx/core/view/NestedScrollingParentHelper;-><init>(Landroid/view/ViewGroup;)V

    iput-object p3, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->c:Landroidx/core/view/NestedScrollingParentHelper;

    .line 8
    new-instance p3, Landroid/widget/Scroller;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p3, v0}, Landroid/widget/Scroller;-><init>(Landroid/content/Context;)V

    iput-object p3, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->g:Landroid/widget/Scroller;

    .line 9
    new-instance p3, Landroid/widget/Scroller;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p3, v0}, Landroid/widget/Scroller;-><init>(Landroid/content/Context;)V

    iput-object p3, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->h:Landroid/widget/Scroller;

    .line 10
    new-instance p3, Landroid/widget/Scroller;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p3, v0}, Landroid/widget/Scroller;-><init>(Landroid/content/Context;)V

    iput-object p3, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->f:Landroid/widget/Scroller;

    .line 11
    new-instance p3, Ly8/e;

    invoke-direct {p3}, Ly8/e;-><init>()V

    iput-object p3, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->j:Ly8/e;

    .line 12
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object p1

    .line 13
    invoke-virtual {p1}, Landroid/view/ViewConfiguration;->getScaledMaximumFlingVelocity()I

    move-result p3

    iput p3, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->k:I

    .line 14
    invoke-virtual {p1}, Landroid/view/ViewConfiguration;->getScaledMinimumFlingVelocity()I

    move-result p3

    iput p3, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->l:I

    .line 15
    iget-object p3, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->j:Ly8/e;

    invoke-virtual {p1}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result p1

    invoke-virtual {p3, p1}, Ly8/e;->j(I)V

    .line 16
    invoke-virtual {p0, p2}, Landroid/view/View;->setWillNotDraw(Z)V

    const/4 p1, 0x1

    .line 17
    invoke-virtual {p0, p1}, Landroid/view/View;->setVerticalScrollBarEnabled(Z)V

    return-void
.end method

.method public static synthetic a(Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->m:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic b(Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;Landroid/view/View;)Z
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->q(Landroid/view/View;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic c(Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;Landroid/view/View;)Ly8/c;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->k(Landroid/view/View;)Ly8/c;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic d(Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;Landroid/view/View;)Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout$b;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->m(Landroid/view/View;)Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout$b;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic e(Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;)Landroid/widget/Scroller;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->f:Landroid/widget/Scroller;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic f(Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;F)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->t(F)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic g(Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;Landroid/view/View;)Z
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->r(Landroid/view/View;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private getNextEdge()I
    .locals 9

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget v1, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->m:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    const/4 v3, 0x0

    .line 9
    const/16 v4, 0x11

    .line 10
    .line 11
    if-ne v1, v4, :cond_3

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    move v5, v3

    .line 18
    :goto_0
    if-ge v5, v1, :cond_7

    .line 19
    .line 20
    invoke-virtual {p0, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 21
    .line 22
    .line 23
    move-result-object v6

    .line 24
    invoke-virtual {p0, v6}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->k(Landroid/view/View;)Ly8/c;

    .line 25
    .line 26
    .line 27
    move-result-object v7

    .line 28
    iget-object v8, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->d:Ljava/util/HashMap;

    .line 29
    .line 30
    invoke-virtual {v8, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v8

    .line 34
    check-cast v8, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout$b;

    .line 35
    .line 36
    if-eqz v8, :cond_0

    .line 37
    .line 38
    iget v8, v8, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout$b;->a:I

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_0
    move v8, v3

    .line 42
    :goto_1
    if-le v8, v0, :cond_2

    .line 43
    .line 44
    invoke-virtual {p0, v6}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->s(Landroid/view/View;)Z

    .line 45
    .line 46
    .line 47
    move-result v6

    .line 48
    if-eqz v6, :cond_2

    .line 49
    .line 50
    invoke-interface {v7, v2}, Ly8/c;->a(I)Z

    .line 51
    .line 52
    .line 53
    move-result v6

    .line 54
    if-nez v6, :cond_1

    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_1
    return v8

    .line 58
    :cond_2
    :goto_2
    add-int/lit8 v5, v5, 0x1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_3
    const/16 v5, 0x12

    .line 62
    .line 63
    if-ne v1, v5, :cond_9

    .line 64
    .line 65
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    sub-int/2addr v1, v2

    .line 70
    :goto_3
    if-ltz v1, :cond_7

    .line 71
    .line 72
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    invoke-virtual {p0, v2}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->k(Landroid/view/View;)Ly8/c;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    iget-object v6, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->d:Ljava/util/HashMap;

    .line 81
    .line 82
    invoke-virtual {v6, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v6

    .line 86
    check-cast v6, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout$b;

    .line 87
    .line 88
    if-eqz v6, :cond_4

    .line 89
    .line 90
    iget v6, v6, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout$b;->a:I

    .line 91
    .line 92
    goto :goto_4

    .line 93
    :cond_4
    move v6, v3

    .line 94
    :goto_4
    if-ge v6, v0, :cond_6

    .line 95
    .line 96
    invoke-virtual {p0, v2}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->s(Landroid/view/View;)Z

    .line 97
    .line 98
    .line 99
    move-result v2

    .line 100
    if-eqz v2, :cond_6

    .line 101
    .line 102
    const/4 v2, -0x1

    .line 103
    invoke-interface {v5, v2}, Ly8/c;->a(I)Z

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    if-nez v2, :cond_5

    .line 108
    .line 109
    goto :goto_5

    .line 110
    :cond_5
    return v6

    .line 111
    :cond_6
    :goto_5
    add-int/lit8 v1, v1, -0x1

    .line 112
    .line 113
    goto :goto_3

    .line 114
    :cond_7
    iget v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->m:I

    .line 115
    .line 116
    if-ne v0, v4, :cond_8

    .line 117
    .line 118
    iget v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->e:I

    .line 119
    .line 120
    return v0

    .line 121
    :cond_8
    return v3

    .line 122
    :cond_9
    new-instance v0, Ljava/lang/RuntimeException;

    .line 123
    .line 124
    const-string v1, "#getNextEdge# unknown Fling Orientation"

    .line 125
    .line 126
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    throw v0
.end method

.method public static synthetic h(Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->awakenScrollBars()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private o()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->i:Landroid/view/VelocityTracker;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->i:Landroid/view/VelocityTracker;

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-virtual {v0}, Landroid/view/VelocityTracker;->clear()V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method private p()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->i:Landroid/view/VelocityTracker;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->i:Landroid/view/VelocityTracker;

    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method private u()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->i:Landroid/view/VelocityTracker;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/view/VelocityTracker;->recycle()V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->i:Landroid/view/VelocityTracker;

    .line 10
    .line 11
    :cond_0
    return-void
.end method


# virtual methods
.method public computeScroll()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->g:Landroid/widget/Scroller;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/widget/Scroller;->computeScrollOffset()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->g:Landroid/widget/Scroller;

    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/widget/Scroller;->getCurrY()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v2, 0x1

    .line 17
    invoke-virtual {p0, v1, v0, v2}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->y(IIZ)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 21
    .line 22
    .line 23
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->h:Landroid/widget/Scroller;

    .line 24
    .line 25
    invoke-virtual {v0}, Landroid/widget/Scroller;->computeScrollOffset()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->h:Landroid/widget/Scroller;

    .line 32
    .line 33
    invoke-virtual {v0}, Landroid/widget/Scroller;->getCurrY()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    invoke-virtual {p0, v1, v0, v1}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->y(IIZ)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 41
    .line 42
    .line 43
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->h:Landroid/widget/Scroller;

    .line 44
    .line 45
    invoke-virtual {v0}, Landroid/widget/Scroller;->isFinished()Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-eqz v0, :cond_1

    .line 50
    .line 51
    const-string v0, "ELinkageScrollLayout"

    .line 52
    .line 53
    const-string v1, "#computeScroll#, LocScroll finished"

    .line 54
    .line 55
    invoke-static {v0, v1}, Lb8/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->i()V

    .line 59
    .line 60
    .line 61
    :cond_1
    return-void
.end method

.method public computeVerticalScrollExtent()I
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/view/View;->computeVerticalScrollExtent()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public computeVerticalScrollOffset()I
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    move v2, v1

    .line 7
    :goto_0
    if-ge v1, v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    check-cast v3, Ly8/b;

    .line 14
    .line 15
    invoke-interface {v3}, Ly8/b;->a()Ly8/c;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-interface {v3}, Ly8/c;->b()I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    add-int/2addr v2, v3

    .line 24
    add-int/lit8 v1, v1, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    add-int/2addr v2, v0

    .line 32
    return v2
.end method

.method public computeVerticalScrollRange()I
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    move v2, v1

    .line 7
    :goto_0
    if-ge v1, v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    check-cast v3, Ly8/b;

    .line 14
    .line 15
    invoke-interface {v3}, Ly8/b;->a()Ly8/c;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-interface {v3}, Ly8/c;->d()I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    add-int/2addr v2, v3

    .line 24
    add-int/lit8 v1, v1, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    return v2
.end method

.method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 4

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

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
    and-int/lit16 v2, v2, 0xff

    .line 14
    .line 15
    if-eqz v2, :cond_2

    .line 16
    .line 17
    const/4 v3, 0x1

    .line 18
    if-eq v2, v3, :cond_1

    .line 19
    .line 20
    const/4 v3, 0x2

    .line 21
    if-eq v2, v3, :cond_0

    .line 22
    .line 23
    const/4 v3, 0x3

    .line 24
    if-eq v2, v3, :cond_1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    iget-object v2, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->j:Ly8/e;

    .line 28
    .line 29
    invoke-virtual {v2, v0, v1}, Ly8/e;->f(FF)V

    .line 30
    .line 31
    .line 32
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->p()V

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->i:Landroid/view/VelocityTracker;

    .line 36
    .line 37
    invoke-virtual {v0, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    iget-object v2, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->j:Ly8/e;

    .line 42
    .line 43
    invoke-virtual {v2, v0, v1}, Ly8/e;->g(FF)V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_2
    iget-object v2, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->j:Ly8/e;

    .line 48
    .line 49
    invoke-virtual {v2, v0, v1}, Ly8/e;->e(FF)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->v()V

    .line 53
    .line 54
    .line 55
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->o()V

    .line 56
    .line 57
    .line 58
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->i:Landroid/view/VelocityTracker;

    .line 59
    .line 60
    invoke-virtual {v0, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 61
    .line 62
    .line 63
    :goto_0
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->j(Landroid/view/MotionEvent;)Z

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    return p1
.end method

.method public getNestedScrollAxes()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->c:Landroidx/core/view/NestedScrollingParentHelper;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/core/view/NestedScrollingParentHelper;->getNestedScrollAxes()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final i()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->d:Ljava/util/HashMap;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    check-cast v2, Ljava/util/Map$Entry;

    .line 26
    .line 27
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    check-cast v3, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout$b;

    .line 32
    .line 33
    iget v4, v3, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout$b;->a:I

    .line 34
    .line 35
    if-lt v0, v4, :cond_0

    .line 36
    .line 37
    iget v3, v3, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout$b;->b:I

    .line 38
    .line 39
    if-ge v0, v3, :cond_0

    .line 40
    .line 41
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    check-cast v0, Landroid/view/View;

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    const/4 v0, 0x0

    .line 49
    :goto_0
    if-nez v0, :cond_2

    .line 50
    .line 51
    goto :goto_3

    .line 52
    :cond_2
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    new-instance v1, Ljava/lang/StringBuilder;

    .line 57
    .line 58
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 59
    .line 60
    .line 61
    const-string v2, "#checkTargetsScroll# index: "

    .line 62
    .line 63
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    const-string v2, "ELinkageScrollLayout"

    .line 74
    .line 75
    invoke-static {v2, v1}, Lb8/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    const/4 v1, 0x0

    .line 79
    :goto_1
    if-ge v1, v0, :cond_3

    .line 80
    .line 81
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    invoke-virtual {p0, v2}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->w(Landroid/view/View;)V

    .line 86
    .line 87
    .line 88
    add-int/lit8 v1, v1, 0x1

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_3
    :goto_2
    add-int/lit8 v0, v0, 0x1

    .line 92
    .line 93
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    if-ge v0, v1, :cond_4

    .line 98
    .line 99
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    invoke-virtual {p0, v1}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->x(Landroid/view/View;)V

    .line 104
    .line 105
    .line 106
    goto :goto_2

    .line 107
    :cond_4
    :goto_3
    return-void
.end method

.method public final j(Landroid/view/MotionEvent;)Z
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

.method public final k(Landroid/view/View;)Ly8/c;
    .locals 0

    .line 1
    check-cast p1, Ly8/b;

    .line 2
    .line 3
    invoke-interface {p1}, Ly8/b;->a()Ly8/c;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final l(I)Landroid/view/View;
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    :goto_0
    if-ge v1, v0, :cond_1

    .line 7
    .line 8
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    iget-object v3, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->d:Ljava/util/HashMap;

    .line 13
    .line 14
    invoke-virtual {v3, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    check-cast v3, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout$b;

    .line 19
    .line 20
    if-eqz v3, :cond_0

    .line 21
    .line 22
    iget v3, v3, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout$b;->a:I

    .line 23
    .line 24
    if-ne v3, p1, :cond_0

    .line 25
    .line 26
    return-object v2

    .line 27
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    const/4 p1, 0x0

    .line 31
    return-object p1
.end method

.method public final m(Landroid/view/View;)Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout$b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->d:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout$b;

    .line 8
    .line 9
    return-object p1
.end method

.method public final n(FF)Landroid/view/View;
    .locals 9

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    move v2, v1

    .line 7
    :goto_0
    if-ge v2, v0, :cond_1

    .line 8
    .line 9
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    const/4 v4, 0x2

    .line 14
    new-array v4, v4, [I

    .line 15
    .line 16
    invoke-virtual {v3, v4}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 17
    .line 18
    .line 19
    aget v5, v4, v1

    .line 20
    .line 21
    const/4 v6, 0x1

    .line 22
    aget v4, v4, v6

    .line 23
    .line 24
    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    .line 25
    .line 26
    .line 27
    move-result v6

    .line 28
    add-int/2addr v6, v5

    .line 29
    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    .line 30
    .line 31
    .line 32
    move-result v7

    .line 33
    add-int/2addr v7, v4

    .line 34
    new-instance v8, Landroid/graphics/RectF;

    .line 35
    .line 36
    int-to-float v5, v5

    .line 37
    int-to-float v4, v4

    .line 38
    int-to-float v6, v6

    .line 39
    int-to-float v7, v7

    .line 40
    invoke-direct {v8, v5, v4, v6, v7}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v8, p1, p2}, Landroid/graphics/RectF;->contains(FF)Z

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    if-eqz v4, :cond_0

    .line 48
    .line 49
    return-object v3

    .line 50
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    const/4 p1, 0x0

    .line 54
    return-object p1
.end method

.method public onFinishInflate()V
    .locals 6

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
    const/4 v1, 0x0

    .line 9
    move v2, v1

    .line 10
    :goto_0
    if-ge v2, v0, :cond_1

    .line 11
    .line 12
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    invoke-virtual {v3, v1}, Landroid/view/View;->setVerticalScrollBarEnabled(Z)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v3, v1}, Landroid/view/View;->setHorizontalScrollBarEnabled(Z)V

    .line 20
    .line 21
    .line 22
    instance-of v4, v3, Ly8/b;

    .line 23
    .line 24
    if-eqz v4, :cond_0

    .line 25
    .line 26
    move-object v4, v3

    .line 27
    check-cast v4, Ly8/b;

    .line 28
    .line 29
    iget-object v5, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->p:Ly8/a;

    .line 30
    .line 31
    invoke-interface {v4, v5}, Ly8/b;->setChildLinkageEvent(Ly8/a;)V

    .line 32
    .line 33
    .line 34
    const/4 v4, 0x2

    .line 35
    invoke-virtual {v3, v4}, Landroid/view/View;->setOverScrollMode(I)V

    .line 36
    .line 37
    .line 38
    add-int/lit8 v2, v2, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    .line 42
    .line 43
    const-string v1, "Child in LinkageScrollLayout must implement ILinkageScroll"

    .line 44
    .line 45
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw v0

    .line 49
    :cond_1
    return-void
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 4

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    and-int/lit16 v0, v0, 0xff

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_2

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    if-eq v0, v2, :cond_1

    .line 12
    .line 13
    const/4 v3, 0x2

    .line 14
    if-eq v0, v3, :cond_0

    .line 15
    .line 16
    const/4 p1, 0x3

    .line 17
    if-eq v0, p1, :cond_1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    float-to-int v0, v0

    .line 25
    int-to-float v0, v0

    .line 26
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    float-to-int p1, p1

    .line 31
    int-to-float p1, p1

    .line 32
    invoke-virtual {p0, v0, p1}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->n(FF)Landroid/view/View;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->j:Ly8/e;

    .line 37
    .line 38
    invoke-virtual {v0}, Ly8/e;->b()Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_3

    .line 43
    .line 44
    if-eqz p1, :cond_3

    .line 45
    .line 46
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->k(Landroid/view/View;)Ly8/c;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-interface {p1}, Ly8/c;->f()Z

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    if-nez p1, :cond_3

    .line 55
    .line 56
    iput-boolean v2, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->n:Z

    .line 57
    .line 58
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    if-eqz p1, :cond_3

    .line 63
    .line 64
    invoke-interface {p1, v2}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_1
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->n:Z

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_2
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->n:Z

    .line 72
    .line 73
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->i()V

    .line 74
    .line 75
    .line 76
    :cond_3
    :goto_0
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->n:Z

    .line 77
    .line 78
    return p1
.end method

.method public onLayout(ZIIII)V
    .locals 5

    .line 1
    const/4 p1, 0x0

    .line 2
    iput p1, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->e:I

    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 5
    .line 6
    .line 7
    move-result p5

    .line 8
    :goto_0
    if-ge p1, p5, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    add-int/2addr v1, p3

    .line 19
    invoke-virtual {v0, p2, p3, p4, v1}, Landroid/view/View;->layout(IIII)V

    .line 20
    .line 21
    .line 22
    iget p3, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->e:I

    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    add-int/2addr p3, v2

    .line 29
    iput p3, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->e:I

    .line 30
    .line 31
    iget-object p3, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->d:Ljava/util/HashMap;

    .line 32
    .line 33
    new-instance v2, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout$b;

    .line 34
    .line 35
    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    invoke-virtual {v0}, Landroid/view/View;->getBottom()I

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    invoke-direct {v2, v3, v4}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout$b;-><init>(II)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p3, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    add-int/lit8 p1, p1, 0x1

    .line 50
    .line 51
    move p3, v1

    .line 52
    goto :goto_0

    .line 53
    :cond_0
    iget p1, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->e:I

    .line 54
    .line 55
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 56
    .line 57
    .line 58
    move-result p2

    .line 59
    sub-int/2addr p1, p2

    .line 60
    iput p1, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->e:I

    .line 61
    .line 62
    return-void
.end method

.method public onMeasure(II)V
    .locals 3

    .line 1
    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/4 v1, 0x0

    .line 9
    :goto_0
    if-ge v1, v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {p0, v2, p1, p2}, Landroid/view/ViewGroup;->measureChild(Landroid/view/View;II)V

    .line 16
    .line 17
    .line 18
    add-int/lit8 v1, v1, 0x1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    return-void
.end method

.method public onNestedFling(Landroid/view/View;FFZ)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public onNestedPreFling(Landroid/view/View;FF)Z
    .locals 1

    .line 1
    new-instance p2, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v0, "#onNestedPreFling# velocityY: "

    .line 7
    .line 8
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    const-string v0, "ELinkageScrollLayout"

    .line 19
    .line 20
    invoke-static {v0, p2}, Lb8/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    .line 24
    .line 25
    .line 26
    move-result p2

    .line 27
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->m(Landroid/view/View;)Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout$b;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    const/4 v0, 0x0

    .line 32
    cmpl-float v0, p3, v0

    .line 33
    .line 34
    if-lez v0, :cond_0

    .line 35
    .line 36
    const/16 v0, 0x11

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    const/16 v0, 0x12

    .line 40
    .line 41
    :goto_0
    iput v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->m:I

    .line 42
    .line 43
    iget p1, p1, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout$b;->a:I

    .line 44
    .line 45
    if-ne p2, p1, :cond_1

    .line 46
    .line 47
    invoke-virtual {p0, p3}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->z(F)V

    .line 48
    .line 49
    .line 50
    const/4 p1, 0x0

    .line 51
    return p1

    .line 52
    :cond_1
    invoke-virtual {p0, p3}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->t(F)V

    .line 53
    .line 54
    .line 55
    const/4 p1, 0x1

    .line 56
    return p1
.end method

.method public onNestedPreScroll(Landroid/view/View;II[I)V
    .locals 7

    .line 1
    new-instance p2, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v0, "#onNestedPreScroll# dy: "

    .line 7
    .line 8
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    const-string v0, "ELinkageScrollLayout"

    .line 19
    .line 20
    invoke-static {v0, p2}, Lb8/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const/4 p2, 0x0

    .line 24
    const/4 v1, 0x1

    .line 25
    if-lez p3, :cond_0

    .line 26
    .line 27
    move v2, v1

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move v2, p2

    .line 30
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->m(Landroid/view/View;)Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout$b;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    move-object v5, p1

    .line 39
    check-cast v5, Ly8/b;

    .line 40
    .line 41
    invoke-interface {v5}, Ly8/b;->a()Ly8/c;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    iget v6, v4, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout$b;->a:I

    .line 46
    .line 47
    if-ne v3, v6, :cond_4

    .line 48
    .line 49
    if-nez v2, :cond_1

    .line 50
    .line 51
    const/4 v3, -0x1

    .line 52
    invoke-interface {v5, v3}, Ly8/c;->a(I)Z

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    if-eqz v3, :cond_2

    .line 57
    .line 58
    :cond_1
    if-eqz v2, :cond_3

    .line 59
    .line 60
    invoke-interface {v5, v1}, Ly8/c;->a(I)Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    if-nez v2, :cond_3

    .line 65
    .line 66
    :cond_2
    invoke-virtual {p0, p2, p3}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->scrollBy(II)V

    .line 67
    .line 68
    .line 69
    aput p3, p4, v1

    .line 70
    .line 71
    return-void

    .line 72
    :cond_3
    new-instance p2, Ljava/lang/StringBuilder;

    .line 73
    .line 74
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 75
    .line 76
    .line 77
    const-string p3, "#onNestedPreScroll#, handle scroll by "

    .line 78
    .line 79
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    invoke-static {v0, p1}, Lb8/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    return-void

    .line 93
    :cond_4
    if-le v3, v6, :cond_7

    .line 94
    .line 95
    if-eqz v2, :cond_5

    .line 96
    .line 97
    invoke-virtual {p0, p2, p3}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->scrollBy(II)V

    .line 98
    .line 99
    .line 100
    aput p3, p4, v1

    .line 101
    .line 102
    :cond_5
    if-nez v2, :cond_a

    .line 103
    .line 104
    add-int p1, v3, p3

    .line 105
    .line 106
    iget v0, v4, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout$b;->a:I

    .line 107
    .line 108
    if-le p1, v0, :cond_6

    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_6
    sub-int p3, v0, v3

    .line 112
    .line 113
    :goto_1
    invoke-virtual {p0, p2, p3}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->scrollBy(II)V

    .line 114
    .line 115
    .line 116
    aput p3, p4, v1

    .line 117
    .line 118
    return-void

    .line 119
    :cond_7
    if-nez v2, :cond_8

    .line 120
    .line 121
    invoke-virtual {p0, p2, p3}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->scrollBy(II)V

    .line 122
    .line 123
    .line 124
    aput p3, p4, v1

    .line 125
    .line 126
    :cond_8
    if-eqz v2, :cond_a

    .line 127
    .line 128
    add-int p1, v3, p3

    .line 129
    .line 130
    iget v0, v4, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout$b;->a:I

    .line 131
    .line 132
    if-ge p1, v0, :cond_9

    .line 133
    .line 134
    goto :goto_2

    .line 135
    :cond_9
    sub-int p3, v0, v3

    .line 136
    .line 137
    :goto_2
    invoke-virtual {p0, p2, p3}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->scrollBy(II)V

    .line 138
    .line 139
    .line 140
    aput p3, p4, v1

    .line 141
    .line 142
    :cond_a
    return-void
.end method

.method public onNestedScroll(Landroid/view/View;IIII)V
    .locals 0

    .line 1
    if-eqz p3, :cond_0

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-virtual {p0, p1, p5}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->scrollBy(II)V

    .line 7
    .line 8
    .line 9
    :cond_0
    return-void
.end method

.method public onNestedScrollAccepted(Landroid/view/View;Landroid/view/View;I)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "#onNestedScrollAccepted# axes: "

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const-string v1, "ELinkageScrollLayout"

    .line 19
    .line 20
    invoke-static {v1, v0}, Lb8/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->c:Landroidx/core/view/NestedScrollingParentHelper;

    .line 24
    .line 25
    invoke-virtual {v0, p1, p2, p3}, Landroidx/core/view/NestedScrollingParentHelper;->onNestedScrollAccepted(Landroid/view/View;Landroid/view/View;I)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->v()V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public onStartNestedScroll(Landroid/view/View;Landroid/view/View;I)Z
    .locals 0

    .line 1
    new-instance p1, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string p2, "#onStartNestedScroll# nestedScrollAxes: "

    .line 7
    .line 8
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    const-string p2, "ELinkageScrollLayout"

    .line 19
    .line 20
    invoke-static {p2, p1}, Lb8/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    and-int/lit8 p1, p3, 0x2

    .line 24
    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    const/4 p1, 0x1

    .line 28
    return p1

    .line 29
    :cond_0
    const/4 p1, 0x0

    .line 30
    return p1
.end method

.method public onStopNestedScroll(Landroid/view/View;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "#onStopNestedScroll# child: "

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const-string v1, "ELinkageScrollLayout"

    .line 19
    .line 20
    invoke-static {v1, v0}, Lb8/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->c:Landroidx/core/view/NestedScrollingParentHelper;

    .line 24
    .line 25
    invoke-virtual {v0, p1}, Landroidx/core/view/NestedScrollingParentHelper;->onStopNestedScroll(Landroid/view/View;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 4

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_3

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    if-eq v0, v1, :cond_2

    .line 10
    .line 11
    const/4 v3, 0x2

    .line 12
    if-eq v0, v3, :cond_0

    .line 13
    .line 14
    const/4 p1, 0x3

    .line 15
    if-eq v0, p1, :cond_2

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iget v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->o:I

    .line 19
    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    float-to-int p1, p1

    .line 27
    iput p1, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->o:I

    .line 28
    .line 29
    return v1

    .line 30
    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    float-to-int p1, p1

    .line 35
    iget v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->o:I

    .line 36
    .line 37
    sub-int v0, p1, v0

    .line 38
    .line 39
    iput p1, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->o:I

    .line 40
    .line 41
    neg-int p1, v0

    .line 42
    invoke-virtual {p0, v2, p1}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->scrollBy(II)V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    iput v2, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->o:I

    .line 47
    .line 48
    iget-object p1, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->i:Landroid/view/VelocityTracker;

    .line 49
    .line 50
    if-eqz p1, :cond_4

    .line 51
    .line 52
    iget v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->k:I

    .line 53
    .line 54
    int-to-float v0, v0

    .line 55
    const/16 v2, 0x3e8

    .line 56
    .line 57
    invoke-virtual {p1, v2, v0}, Landroid/view/VelocityTracker;->computeCurrentVelocity(IF)V

    .line 58
    .line 59
    .line 60
    iget-object p1, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->i:Landroid/view/VelocityTracker;

    .line 61
    .line 62
    invoke-virtual {p1}, Landroid/view/VelocityTracker;->getYVelocity()F

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    float-to-int p1, p1

    .line 67
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->u()V

    .line 68
    .line 69
    .line 70
    neg-int v0, p1

    .line 71
    int-to-float v0, v0

    .line 72
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->t(F)V

    .line 73
    .line 74
    .line 75
    new-instance v0, Ljava/lang/StringBuilder;

    .line 76
    .line 77
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 78
    .line 79
    .line 80
    const-string v2, "#dispatchTouchEvent# ACTION_UP, yVelocity: "

    .line 81
    .line 82
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    const-string v0, "ELinkageScrollLayout"

    .line 93
    .line 94
    invoke-static {v0, p1}, Lb8/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_3
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    float-to-int p1, p1

    .line 103
    iput p1, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->o:I

    .line 104
    .line 105
    :cond_4
    :goto_0
    return v1
.end method

.method public final q(Landroid/view/View;)Z
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    if-ne p1, v1, :cond_0

    .line 7
    .line 8
    const/4 p1, 0x1

    .line 9
    return p1

    .line 10
    :cond_0
    return v0
.end method

.method public final r(Landroid/view/View;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    sub-int/2addr v0, v1

    .line 7
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-ne p1, v0, :cond_0

    .line 12
    .line 13
    return v1

    .line 14
    :cond_0
    const/4 p1, 0x0

    .line 15
    return p1
.end method

.method public final s(Landroid/view/View;)Z
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->k(Landroid/view/View;)Ly8/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Ly8/c;->f()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-lt p1, v0, :cond_0

    .line 20
    .line 21
    const/4 p1, 0x1

    .line 22
    return p1

    .line 23
    :cond_0
    const/4 p1, 0x0

    .line 24
    return p1
.end method

.method public scrollBy(II)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->awakenScrollBars()Z

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-gez p2, :cond_0

    .line 9
    .line 10
    add-int v1, v0, p2

    .line 11
    .line 12
    if-gez v1, :cond_1

    .line 13
    .line 14
    neg-int p2, v0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    add-int v1, v0, p2

    .line 17
    .line 18
    iget v2, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->e:I

    .line 19
    .line 20
    if-le v1, v2, :cond_1

    .line 21
    .line 22
    sub-int p2, v2, v0

    .line 23
    .line 24
    :cond_1
    :goto_0
    if-eqz p2, :cond_2

    .line 25
    .line 26
    invoke-super {p0, p1, p2}, Landroid/view/View;->scrollBy(II)V

    .line 27
    .line 28
    .line 29
    :cond_2
    return-void
.end method

.method public final t(F)V
    .locals 10

    .line 1
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget v1, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->l:I

    .line 6
    .line 7
    int-to-float v1, v1

    .line 8
    cmpl-float v0, v0, v1

    .line 9
    .line 10
    if-lez v0, :cond_1

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    cmpl-float v0, p1, v0

    .line 14
    .line 15
    if-lez v0, :cond_0

    .line 16
    .line 17
    const/16 v0, 0x11

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/16 v0, 0x12

    .line 21
    .line 22
    :goto_0
    iput v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->m:I

    .line 23
    .line 24
    iget-object v1, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->g:Landroid/widget/Scroller;

    .line 25
    .line 26
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    float-to-int v5, p1

    .line 31
    const/high16 v8, -0x80000000

    .line 32
    .line 33
    const v9, 0x7fffffff

    .line 34
    .line 35
    .line 36
    const/4 v2, 0x0

    .line 37
    const/4 v4, 0x1

    .line 38
    const/4 v6, 0x0

    .line 39
    const/4 v7, 0x0

    .line 40
    invoke-virtual/range {v1 .. v9}, Landroid/widget/Scroller;->fling(IIIIIIII)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 44
    .line 45
    .line 46
    :cond_1
    return-void
.end method

.method public final v()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->m:I

    .line 3
    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->f:Landroid/widget/Scroller;

    .line 5
    .line 6
    invoke-virtual {v0}, Landroid/widget/Scroller;->abortAnimation()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->g:Landroid/widget/Scroller;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/widget/Scroller;->abortAnimation()V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->h:Landroid/widget/Scroller;

    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/widget/Scroller;->abortAnimation()V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final w(Landroid/view/View;)V
    .locals 1

    .line 1
    check-cast p1, Ly8/b;

    .line 2
    .line 3
    invoke-interface {p1}, Ly8/b;->a()Ly8/c;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {p1}, Ly8/c;->f()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    invoke-interface {p1, v0}, Ly8/c;->a(I)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    invoke-interface {p1}, Ly8/c;->c()V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
.end method

.method public final x(Landroid/view/View;)V
    .locals 1

    .line 1
    check-cast p1, Ly8/b;

    .line 2
    .line 3
    invoke-interface {p1}, Ly8/b;->a()Ly8/c;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {p1}, Ly8/c;->f()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 v0, -0x1

    .line 14
    invoke-interface {p1, v0}, Ly8/c;->a(I)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    invoke-interface {p1}, Ly8/c;->g()V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
.end method

.method public y(IIZ)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->awakenScrollBars()Z

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    if-eqz p3, :cond_7

    .line 6
    .line 7
    invoke-static {p2, v0}, Ljava/lang/Math;->max(II)I

    .line 8
    .line 9
    .line 10
    move-result p2

    .line 11
    iget p3, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->e:I

    .line 12
    .line 13
    invoke-static {p2, p3}, Ljava/lang/Math;->min(II)I

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->getNextEdge()I

    .line 18
    .line 19
    .line 20
    move-result p3

    .line 21
    iget v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->m:I

    .line 22
    .line 23
    const/16 v1, 0x11

    .line 24
    .line 25
    if-ne v0, v1, :cond_0

    .line 26
    .line 27
    invoke-static {p2, p3}, Ljava/lang/Math;->min(II)I

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    :cond_0
    iget v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->m:I

    .line 32
    .line 33
    const/16 v2, 0x12

    .line 34
    .line 35
    if-ne v0, v2, :cond_1

    .line 36
    .line 37
    invoke-static {p2, p3}, Ljava/lang/Math;->max(II)I

    .line 38
    .line 39
    .line 40
    move-result p2

    .line 41
    :cond_1
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->scrollTo(II)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    if-ne p1, p3, :cond_6

    .line 49
    .line 50
    iget-object p1, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->g:Landroid/widget/Scroller;

    .line 51
    .line 52
    invoke-virtual {p1}, Landroid/widget/Scroller;->getCurrVelocity()F

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    float-to-int p1, p1

    .line 57
    iget p2, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->m:I

    .line 58
    .line 59
    if-ne p2, v1, :cond_3

    .line 60
    .line 61
    if-lez p1, :cond_2

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_2
    neg-int p1, p1

    .line 65
    :cond_3
    :goto_0
    if-ne p2, v2, :cond_5

    .line 66
    .line 67
    if-gez p1, :cond_4

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_4
    neg-int p1, p1

    .line 71
    :cond_5
    :goto_1
    new-instance p2, Ljava/lang/StringBuilder;

    .line 72
    .line 73
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 74
    .line 75
    .line 76
    const-string v0, "#scrollTo# To Edge: "

    .line 77
    .line 78
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    const-string v0, ", velocity: "

    .line 85
    .line 86
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p2

    .line 96
    const-string v0, "ELinkageScrollLayout"

    .line 97
    .line 98
    invoke-static {v0, p2}, Lb8/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    iget-object p2, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->g:Landroid/widget/Scroller;

    .line 102
    .line 103
    invoke-virtual {p2}, Landroid/widget/Scroller;->abortAnimation()V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p0, p3}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->l(I)Landroid/view/View;

    .line 107
    .line 108
    .line 109
    move-result-object p2

    .line 110
    invoke-virtual {p0, p2}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->k(Landroid/view/View;)Ly8/c;

    .line 111
    .line 112
    .line 113
    move-result-object p3

    .line 114
    invoke-interface {p3, p2, p1}, Ly8/c;->e(Landroid/view/View;I)V

    .line 115
    .line 116
    .line 117
    int-to-float p1, p1

    .line 118
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->z(F)V

    .line 119
    .line 120
    .line 121
    :cond_6
    return-void

    .line 122
    :cond_7
    invoke-static {p2, v0}, Ljava/lang/Math;->max(II)I

    .line 123
    .line 124
    .line 125
    move-result p2

    .line 126
    iget p3, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->e:I

    .line 127
    .line 128
    invoke-static {p2, p3}, Ljava/lang/Math;->min(II)I

    .line 129
    .line 130
    .line 131
    move-result p2

    .line 132
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->scrollTo(II)V

    .line 133
    .line 134
    .line 135
    return-void
.end method

.method public final z(F)V
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->f:Landroid/widget/Scroller;

    .line 2
    .line 3
    float-to-int v4, p1

    .line 4
    const/high16 v7, -0x80000000

    .line 5
    .line 6
    const v8, 0x7fffffff

    .line 7
    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    const/4 v2, 0x0

    .line 11
    const/4 v3, 0x0

    .line 12
    const/4 v5, 0x0

    .line 13
    const/4 v6, 0x0

    .line 14
    invoke-virtual/range {v0 .. v8}, Landroid/widget/Scroller;->fling(IIIIIIII)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 18
    .line 19
    .line 20
    return-void
.end method
