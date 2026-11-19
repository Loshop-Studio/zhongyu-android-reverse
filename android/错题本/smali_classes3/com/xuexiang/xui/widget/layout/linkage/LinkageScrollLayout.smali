.class public Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;
.super Landroid/view/ViewGroup;
.source "SourceFile"

# interfaces
.implements Landroidx/core/view/NestedScrollingParent;


# instance fields
.field public final a:Landroidx/core/view/NestedScrollingParentHelper;

.field public final b:Ljava/util/HashMap;

.field public c:I

.field public final d:Landroid/widget/Scroller;

.field public final e:Landroid/widget/Scroller;

.field public final f:Landroid/widget/Scroller;

.field public g:Landroid/view/VelocityTracker;

.field public final h:Lb3/e;

.field public final i:I

.field public final j:I

.field public k:I

.field public l:Z

.field public m:I

.field public final n:Lo2/a;


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

    iput-object p2, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->b:Ljava/util/HashMap;

    const/4 p2, 0x0

    .line 5
    iput p2, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->k:I

    .line 6
    new-instance p3, Lo2/a;

    const/4 v0, 0x2

    invoke-direct {p3, p0, v0}, Lo2/a;-><init>(Ljava/lang/Object;I)V

    iput-object p3, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->n:Lo2/a;

    .line 7
    new-instance p3, Landroidx/core/view/NestedScrollingParentHelper;

    invoke-direct {p3, p0}, Landroidx/core/view/NestedScrollingParentHelper;-><init>(Landroid/view/ViewGroup;)V

    iput-object p3, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->a:Landroidx/core/view/NestedScrollingParentHelper;

    .line 8
    new-instance p3, Landroid/widget/Scroller;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p3, v0}, Landroid/widget/Scroller;-><init>(Landroid/content/Context;)V

    iput-object p3, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->e:Landroid/widget/Scroller;

    .line 9
    new-instance p3, Landroid/widget/Scroller;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p3, v0}, Landroid/widget/Scroller;-><init>(Landroid/content/Context;)V

    iput-object p3, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->f:Landroid/widget/Scroller;

    .line 10
    new-instance p3, Landroid/widget/Scroller;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p3, v0}, Landroid/widget/Scroller;-><init>(Landroid/content/Context;)V

    iput-object p3, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->d:Landroid/widget/Scroller;

    .line 11
    new-instance p3, Lb3/e;

    invoke-direct {p3}, Lb3/e;-><init>()V

    iput-object p3, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->h:Lb3/e;

    .line 12
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object p1

    .line 13
    invoke-virtual {p1}, Landroid/view/ViewConfiguration;->getScaledMaximumFlingVelocity()I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->i:I

    .line 14
    invoke-virtual {p1}, Landroid/view/ViewConfiguration;->getScaledMinimumFlingVelocity()I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->j:I

    .line 15
    invoke-virtual {p1}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result p1

    .line 16
    iput p1, p3, Lb3/e;->e:I

    .line 17
    invoke-virtual {p0, p2}, Landroid/view/View;->setWillNotDraw(Z)V

    const/4 p1, 0x1

    .line 18
    invoke-virtual {p0, p1}, Landroid/view/View;->setVerticalScrollBarEnabled(Z)V

    return-void
.end method

.method public static synthetic a(Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->awakenScrollBars()Z

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private getNextEdge()I
    .locals 11

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget v1, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->k:I

    .line 6
    .line 7
    iget-object v2, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->b:Ljava/util/HashMap;

    .line 8
    .line 9
    const/4 v3, 0x1

    .line 10
    const/4 v4, 0x0

    .line 11
    const/16 v5, 0x11

    .line 12
    .line 13
    if-ne v1, v5, :cond_3

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    move v6, v4

    .line 20
    :goto_0
    if-ge v6, v1, :cond_7

    .line 21
    .line 22
    invoke-virtual {p0, v6}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object v7

    .line 26
    move-object v8, v7

    .line 27
    check-cast v8, Lb3/b;

    .line 28
    .line 29
    invoke-interface {v8}, Lb3/b;->a()Lb3/c;

    .line 30
    .line 31
    .line 32
    move-result-object v9

    .line 33
    invoke-virtual {v2, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v10

    .line 37
    check-cast v10, Lb3/d;

    .line 38
    .line 39
    if-eqz v10, :cond_0

    .line 40
    .line 41
    iget v10, v10, Lb3/d;->a:I

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_0
    move v10, v4

    .line 45
    :goto_1
    if-le v10, v0, :cond_2

    .line 46
    .line 47
    invoke-interface {v8}, Lb3/b;->a()Lb3/c;

    .line 48
    .line 49
    .line 50
    move-result-object v8

    .line 51
    invoke-interface {v8}, Lb3/c;->t()Z

    .line 52
    .line 53
    .line 54
    move-result v8

    .line 55
    if-eqz v8, :cond_2

    .line 56
    .line 57
    invoke-virtual {v7}, Landroid/view/View;->getHeight()I

    .line 58
    .line 59
    .line 60
    move-result v7

    .line 61
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 62
    .line 63
    .line 64
    move-result v8

    .line 65
    if-lt v7, v8, :cond_2

    .line 66
    .line 67
    invoke-interface {v9, v3}, Lb3/c;->e(I)Z

    .line 68
    .line 69
    .line 70
    move-result v7

    .line 71
    if-nez v7, :cond_1

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_1
    return v10

    .line 75
    :cond_2
    :goto_2
    add-int/lit8 v6, v6, 0x1

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_3
    const/16 v6, 0x12

    .line 79
    .line 80
    if-ne v1, v6, :cond_9

    .line 81
    .line 82
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    sub-int/2addr v1, v3

    .line 87
    :goto_3
    if-ltz v1, :cond_7

    .line 88
    .line 89
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    move-object v6, v3

    .line 94
    check-cast v6, Lb3/b;

    .line 95
    .line 96
    invoke-interface {v6}, Lb3/b;->a()Lb3/c;

    .line 97
    .line 98
    .line 99
    move-result-object v7

    .line 100
    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v8

    .line 104
    check-cast v8, Lb3/d;

    .line 105
    .line 106
    if-eqz v8, :cond_4

    .line 107
    .line 108
    iget v8, v8, Lb3/d;->a:I

    .line 109
    .line 110
    goto :goto_4

    .line 111
    :cond_4
    move v8, v4

    .line 112
    :goto_4
    if-ge v8, v0, :cond_6

    .line 113
    .line 114
    invoke-interface {v6}, Lb3/b;->a()Lb3/c;

    .line 115
    .line 116
    .line 117
    move-result-object v6

    .line 118
    invoke-interface {v6}, Lb3/c;->t()Z

    .line 119
    .line 120
    .line 121
    move-result v6

    .line 122
    if-eqz v6, :cond_6

    .line 123
    .line 124
    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    .line 125
    .line 126
    .line 127
    move-result v3

    .line 128
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 129
    .line 130
    .line 131
    move-result v6

    .line 132
    if-lt v3, v6, :cond_6

    .line 133
    .line 134
    const/4 v3, -0x1

    .line 135
    invoke-interface {v7, v3}, Lb3/c;->e(I)Z

    .line 136
    .line 137
    .line 138
    move-result v3

    .line 139
    if-nez v3, :cond_5

    .line 140
    .line 141
    goto :goto_5

    .line 142
    :cond_5
    return v8

    .line 143
    :cond_6
    :goto_5
    add-int/lit8 v1, v1, -0x1

    .line 144
    .line 145
    goto :goto_3

    .line 146
    :cond_7
    iget v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->k:I

    .line 147
    .line 148
    if-ne v0, v5, :cond_8

    .line 149
    .line 150
    iget v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->c:I

    .line 151
    .line 152
    return v0

    .line 153
    :cond_8
    return v4

    .line 154
    :cond_9
    new-instance v0, Ljava/lang/RuntimeException;

    .line 155
    .line 156
    const-string v1, "#getNextEdge# unknown Fling Orientation"

    .line 157
    .line 158
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    throw v0
.end method


# virtual methods
.method public final b()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->b:Ljava/util/HashMap;

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
    check-cast v3, Lb3/d;

    .line 32
    .line 33
    iget v4, v3, Lb3/d;->a:I

    .line 34
    .line 35
    if-lt v0, v4, :cond_0

    .line 36
    .line 37
    iget v3, v3, Lb3/d;->b:I

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
    const/4 v1, 0x0

    .line 57
    :goto_1
    const/4 v2, 0x1

    .line 58
    if-ge v1, v0, :cond_4

    .line 59
    .line 60
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    check-cast v3, Lb3/b;

    .line 65
    .line 66
    invoke-interface {v3}, Lb3/b;->a()Lb3/c;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    invoke-interface {v3}, Lb3/c;->t()Z

    .line 71
    .line 72
    .line 73
    move-result v4

    .line 74
    if-eqz v4, :cond_3

    .line 75
    .line 76
    invoke-interface {v3, v2}, Lb3/c;->e(I)Z

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    if-eqz v2, :cond_3

    .line 81
    .line 82
    invoke-interface {v3}, Lb3/c;->i()V

    .line 83
    .line 84
    .line 85
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_4
    add-int/2addr v0, v2

    .line 89
    :goto_2
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    if-ge v0, v1, :cond_6

    .line 94
    .line 95
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    check-cast v1, Lb3/b;

    .line 100
    .line 101
    invoke-interface {v1}, Lb3/b;->a()Lb3/c;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    invoke-interface {v1}, Lb3/c;->t()Z

    .line 106
    .line 107
    .line 108
    move-result v2

    .line 109
    if-eqz v2, :cond_5

    .line 110
    .line 111
    const/4 v2, -0x1

    .line 112
    invoke-interface {v1, v2}, Lb3/c;->e(I)Z

    .line 113
    .line 114
    .line 115
    move-result v2

    .line 116
    if-eqz v2, :cond_5

    .line 117
    .line 118
    invoke-interface {v1}, Lb3/c;->v()V

    .line 119
    .line 120
    .line 121
    :cond_5
    add-int/lit8 v0, v0, 0x1

    .line 122
    .line 123
    goto :goto_2

    .line 124
    :cond_6
    :goto_3
    return-void
.end method

.method public final c(F)V
    .locals 10

    .line 1
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget v1, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->j:I

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
    iput v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->k:I

    .line 23
    .line 24
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    float-to-int v5, p1

    .line 29
    const/high16 v8, -0x80000000

    .line 30
    .line 31
    const v9, 0x7fffffff

    .line 32
    .line 33
    .line 34
    iget-object v1, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->e:Landroid/widget/Scroller;

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

.method public final computeScroll()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->e:Landroid/widget/Scroller;

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
    const/4 v1, 0x1

    .line 14
    invoke-virtual {p0, v0, v1}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->d(IZ)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 18
    .line 19
    .line 20
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->f:Landroid/widget/Scroller;

    .line 21
    .line 22
    invoke-virtual {v0}, Landroid/widget/Scroller;->computeScrollOffset()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    invoke-virtual {v0}, Landroid/widget/Scroller;->getCurrY()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    const/4 v2, 0x0

    .line 33
    invoke-virtual {p0, v1, v2}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->d(IZ)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Landroid/widget/Scroller;->isFinished()Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_1

    .line 44
    .line 45
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->b()V

    .line 46
    .line 47
    .line 48
    :cond_1
    return-void
.end method

.method public final computeVerticalScrollExtent()I
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

.method public final computeVerticalScrollOffset()I
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
    check-cast v3, Lb3/b;

    .line 14
    .line 15
    invoke-interface {v3}, Lb3/b;->a()Lb3/c;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-interface {v3}, Lb3/c;->h()I

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
    add-int/2addr v0, v2

    .line 32
    return v0
.end method

.method public final computeVerticalScrollRange()I
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
    check-cast v3, Lb3/b;

    .line 14
    .line 15
    invoke-interface {v3}, Lb3/b;->a()Lb3/c;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-interface {v3}, Lb3/c;->k()I

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

.method public final d(IZ)V
    .locals 9

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->awakenScrollBars()Z

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    if-eqz p2, :cond_9

    .line 6
    .line 7
    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    iget p2, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->c:I

    .line 12
    .line 13
    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->getNextEdge()I

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    iget v1, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->k:I

    .line 22
    .line 23
    const/16 v2, 0x11

    .line 24
    .line 25
    if-ne v1, v2, :cond_0

    .line 26
    .line 27
    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    :cond_0
    iget v1, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->k:I

    .line 32
    .line 33
    const/16 v3, 0x12

    .line 34
    .line 35
    if-ne v1, v3, :cond_1

    .line 36
    .line 37
    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    :cond_1
    invoke-virtual {p0, v0, p1}, Landroid/view/View;->scrollTo(II)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    if-ne p1, p2, :cond_8

    .line 49
    .line 50
    iget-object p1, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->e:Landroid/widget/Scroller;

    .line 51
    .line 52
    invoke-virtual {p1}, Landroid/widget/Scroller;->getCurrVelocity()F

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    float-to-int v1, v1

    .line 57
    iget v4, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->k:I

    .line 58
    .line 59
    if-ne v4, v2, :cond_3

    .line 60
    .line 61
    if-lez v1, :cond_2

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_2
    neg-int v1, v1

    .line 65
    :cond_3
    :goto_0
    if-ne v4, v3, :cond_5

    .line 66
    .line 67
    if-gez v1, :cond_4

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_4
    neg-int v1, v1

    .line 71
    :cond_5
    :goto_1
    invoke-virtual {p1}, Landroid/widget/Scroller;->abortAnimation()V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    :goto_2
    if-ge v0, p1, :cond_7

    .line 79
    .line 80
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    iget-object v3, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->b:Ljava/util/HashMap;

    .line 85
    .line 86
    invoke-virtual {v3, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    check-cast v3, Lb3/d;

    .line 91
    .line 92
    if-eqz v3, :cond_6

    .line 93
    .line 94
    iget v3, v3, Lb3/d;->a:I

    .line 95
    .line 96
    if-ne v3, p2, :cond_6

    .line 97
    .line 98
    goto :goto_3

    .line 99
    :cond_6
    add-int/lit8 v0, v0, 0x1

    .line 100
    .line 101
    goto :goto_2

    .line 102
    :cond_7
    const/4 v2, 0x0

    .line 103
    :goto_3
    check-cast v2, Lb3/b;

    .line 104
    .line 105
    invoke-interface {v2}, Lb3/b;->a()Lb3/c;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    invoke-interface {p1, v1}, Lb3/c;->j(I)V

    .line 110
    .line 111
    .line 112
    int-to-float p1, v1

    .line 113
    float-to-int v4, p1

    .line 114
    const/high16 v7, -0x80000000

    .line 115
    .line 116
    const v8, 0x7fffffff

    .line 117
    .line 118
    .line 119
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->d:Landroid/widget/Scroller;

    .line 120
    .line 121
    const/4 v1, 0x0

    .line 122
    const/4 v2, 0x0

    .line 123
    const/4 v3, 0x0

    .line 124
    const/4 v5, 0x0

    .line 125
    const/4 v6, 0x0

    .line 126
    invoke-virtual/range {v0 .. v8}, Landroid/widget/Scroller;->fling(IIIIIIII)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 130
    .line 131
    .line 132
    :cond_8
    return-void

    .line 133
    :cond_9
    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    .line 134
    .line 135
    .line 136
    move-result p1

    .line 137
    iget p2, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->c:I

    .line 138
    .line 139
    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    .line 140
    .line 141
    .line 142
    move-result p1

    .line 143
    invoke-virtual {p0, v0, p1}, Landroid/view/View;->scrollTo(II)V

    .line 144
    .line 145
    .line 146
    return-void
.end method

.method public final dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 6

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
    const/4 v3, 0x0

    .line 16
    iget-object v4, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->h:Lb3/e;

    .line 17
    .line 18
    if-eqz v2, :cond_3

    .line 19
    .line 20
    const/4 v5, 0x1

    .line 21
    if-eq v2, v5, :cond_2

    .line 22
    .line 23
    const/4 v5, 0x2

    .line 24
    if-eq v2, v5, :cond_0

    .line 25
    .line 26
    const/4 v5, 0x3

    .line 27
    if-eq v2, v5, :cond_2

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_0
    invoke-virtual {v4, v0, v1}, Lb3/e;->a(FF)V

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->g:Landroid/view/VelocityTracker;

    .line 34
    .line 35
    if-nez v0, :cond_1

    .line 36
    .line 37
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    iput-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->g:Landroid/view/VelocityTracker;

    .line 42
    .line 43
    :cond_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->g:Landroid/view/VelocityTracker;

    .line 44
    .line 45
    invoke-virtual {v0, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 46
    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_2
    iput-boolean v3, v4, Lb3/e;->f:Z

    .line 50
    .line 51
    iget-object v2, v4, Lb3/e;->c:Landroid/graphics/PointF;

    .line 52
    .line 53
    invoke-virtual {v2, v0, v1}, Landroid/graphics/PointF;->set(FF)V

    .line 54
    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_3
    iget-object v2, v4, Lb3/e;->a:Landroid/graphics/PointF;

    .line 58
    .line 59
    invoke-virtual {v2, v0, v1}, Landroid/graphics/PointF;->set(FF)V

    .line 60
    .line 61
    .line 62
    iget-object v2, v4, Lb3/e;->b:Landroid/graphics/PointF;

    .line 63
    .line 64
    invoke-virtual {v2, v0, v1}, Landroid/graphics/PointF;->set(FF)V

    .line 65
    .line 66
    .line 67
    iput v3, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->k:I

    .line 68
    .line 69
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->d:Landroid/widget/Scroller;

    .line 70
    .line 71
    invoke-virtual {v0}, Landroid/widget/Scroller;->abortAnimation()V

    .line 72
    .line 73
    .line 74
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->e:Landroid/widget/Scroller;

    .line 75
    .line 76
    invoke-virtual {v0}, Landroid/widget/Scroller;->abortAnimation()V

    .line 77
    .line 78
    .line 79
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->f:Landroid/widget/Scroller;

    .line 80
    .line 81
    invoke-virtual {v0}, Landroid/widget/Scroller;->abortAnimation()V

    .line 82
    .line 83
    .line 84
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->g:Landroid/view/VelocityTracker;

    .line 85
    .line 86
    if-nez v0, :cond_4

    .line 87
    .line 88
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    iput-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->g:Landroid/view/VelocityTracker;

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_4
    invoke-virtual {v0}, Landroid/view/VelocityTracker;->clear()V

    .line 96
    .line 97
    .line 98
    :goto_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->g:Landroid/view/VelocityTracker;

    .line 99
    .line 100
    invoke-virtual {v0, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 101
    .line 102
    .line 103
    :goto_1
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 104
    .line 105
    .line 106
    move-result p1

    .line 107
    return p1
.end method

.method public getNestedScrollAxes()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->a:Landroidx/core/view/NestedScrollingParentHelper;

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

.method public final onFinishInflate()V
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
    instance-of v4, v3, Lb3/b;

    .line 23
    .line 24
    if-eqz v4, :cond_0

    .line 25
    .line 26
    move-object v4, v3

    .line 27
    check-cast v4, Lb3/b;

    .line 28
    .line 29
    iget-object v5, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->n:Lo2/a;

    .line 30
    .line 31
    invoke-interface {v4, v5}, Lb3/b;->setChildLinkageEvent(Lb3/a;)V

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

.method public final onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 12

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
    if-eqz v0, :cond_4

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    if-eq v0, v2, :cond_3

    .line 12
    .line 13
    const/4 v3, 0x2

    .line 14
    if-eq v0, v3, :cond_0

    .line 15
    .line 16
    const/4 p1, 0x3

    .line 17
    if-eq v0, p1, :cond_3

    .line 18
    .line 19
    goto :goto_2

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
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    move v5, v1

    .line 37
    :goto_0
    if-ge v5, v4, :cond_2

    .line 38
    .line 39
    invoke-virtual {p0, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    new-array v7, v3, [I

    .line 44
    .line 45
    invoke-virtual {v6, v7}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 46
    .line 47
    .line 48
    aget v8, v7, v1

    .line 49
    .line 50
    aget v7, v7, v2

    .line 51
    .line 52
    invoke-virtual {v6}, Landroid/view/View;->getWidth()I

    .line 53
    .line 54
    .line 55
    move-result v9

    .line 56
    add-int/2addr v9, v8

    .line 57
    invoke-virtual {v6}, Landroid/view/View;->getHeight()I

    .line 58
    .line 59
    .line 60
    move-result v10

    .line 61
    add-int/2addr v10, v7

    .line 62
    new-instance v11, Landroid/graphics/RectF;

    .line 63
    .line 64
    int-to-float v8, v8

    .line 65
    int-to-float v7, v7

    .line 66
    int-to-float v9, v9

    .line 67
    int-to-float v10, v10

    .line 68
    invoke-direct {v11, v8, v7, v9, v10}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v11, v0, p1}, Landroid/graphics/RectF;->contains(FF)Z

    .line 72
    .line 73
    .line 74
    move-result v7

    .line 75
    if-eqz v7, :cond_1

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_1
    add-int/lit8 v5, v5, 0x1

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_2
    const/4 v6, 0x0

    .line 82
    :goto_1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->h:Lb3/e;

    .line 83
    .line 84
    iget-boolean p1, p1, Lb3/e;->f:Z

    .line 85
    .line 86
    if-eqz p1, :cond_5

    .line 87
    .line 88
    if-eqz v6, :cond_5

    .line 89
    .line 90
    check-cast v6, Lb3/b;

    .line 91
    .line 92
    invoke-interface {v6}, Lb3/b;->a()Lb3/c;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    invoke-interface {p1}, Lb3/c;->t()Z

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    if-nez p1, :cond_5

    .line 101
    .line 102
    iput-boolean v2, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->l:Z

    .line 103
    .line 104
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    if-eqz p1, :cond_5

    .line 109
    .line 110
    invoke-interface {p1, v2}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 111
    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_3
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->l:Z

    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_4
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->l:Z

    .line 118
    .line 119
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->b()V

    .line 120
    .line 121
    .line 122
    :cond_5
    :goto_2
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->l:Z

    .line 123
    .line 124
    return p1
.end method

.method public final onLayout(ZIIII)V
    .locals 4

    .line 1
    const/4 p1, 0x0

    .line 2
    iput p1, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->c:I

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
    iget p3, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->c:I

    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    add-int/2addr v2, p3

    .line 29
    iput v2, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->c:I

    .line 30
    .line 31
    new-instance p3, Lb3/d;

    .line 32
    .line 33
    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    invoke-virtual {v0}, Landroid/view/View;->getBottom()I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    .line 42
    .line 43
    .line 44
    iput v2, p3, Lb3/d;->a:I

    .line 45
    .line 46
    iput v3, p3, Lb3/d;->b:I

    .line 47
    .line 48
    iget-object v2, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->b:Ljava/util/HashMap;

    .line 49
    .line 50
    invoke-virtual {v2, v0, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    add-int/lit8 p1, p1, 0x1

    .line 54
    .line 55
    move p3, v1

    .line 56
    goto :goto_0

    .line 57
    :cond_0
    iget p1, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->c:I

    .line 58
    .line 59
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 60
    .line 61
    .line 62
    move-result p2

    .line 63
    sub-int/2addr p1, p2

    .line 64
    iput p1, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->c:I

    .line 65
    .line 66
    return-void
.end method

.method public final onMeasure(II)V
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

.method public final onNestedFling(Landroid/view/View;FFZ)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final onNestedPreFling(Landroid/view/View;FF)Z
    .locals 9

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->b:Ljava/util/HashMap;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Lb3/d;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    cmpl-float v0, p3, v0

    .line 15
    .line 16
    if-lez v0, :cond_0

    .line 17
    .line 18
    const/16 v0, 0x11

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/16 v0, 0x12

    .line 22
    .line 23
    :goto_0
    iput v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->k:I

    .line 24
    .line 25
    iget p1, p1, Lb3/d;->a:I

    .line 26
    .line 27
    if-ne p2, p1, :cond_1

    .line 28
    .line 29
    float-to-int v4, p3

    .line 30
    const/high16 v7, -0x80000000

    .line 31
    .line 32
    const v8, 0x7fffffff

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->d:Landroid/widget/Scroller;

    .line 36
    .line 37
    const/4 v1, 0x0

    .line 38
    const/4 v2, 0x0

    .line 39
    const/4 v3, 0x0

    .line 40
    const/4 v5, 0x0

    .line 41
    const/4 v6, 0x0

    .line 42
    invoke-virtual/range {v0 .. v8}, Landroid/widget/Scroller;->fling(IIIIIIII)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 46
    .line 47
    .line 48
    const/4 p1, 0x0

    .line 49
    return p1

    .line 50
    :cond_1
    invoke-virtual {p0, p3}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->c(F)V

    .line 51
    .line 52
    .line 53
    const/4 p1, 0x1

    .line 54
    return p1
.end method

.method public final onNestedPreScroll(Landroid/view/View;II[I)V
    .locals 5

    .line 1
    const/4 p2, 0x0

    .line 2
    const/4 v0, 0x1

    .line 3
    if-lez p3, :cond_0

    .line 4
    .line 5
    move v1, v0

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    move v1, p2

    .line 8
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    iget-object v3, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->b:Ljava/util/HashMap;

    .line 13
    .line 14
    invoke-virtual {v3, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    check-cast v3, Lb3/d;

    .line 19
    .line 20
    move-object v4, p1

    .line 21
    check-cast v4, Lb3/b;

    .line 22
    .line 23
    invoke-interface {v4}, Lb3/b;->a()Lb3/c;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    iget v3, v3, Lb3/d;->a:I

    .line 28
    .line 29
    if-ne v2, v3, :cond_4

    .line 30
    .line 31
    if-nez v1, :cond_1

    .line 32
    .line 33
    const/4 v2, -0x1

    .line 34
    invoke-interface {v4, v2}, Lb3/c;->e(I)Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-eqz v2, :cond_2

    .line 39
    .line 40
    :cond_1
    if-eqz v1, :cond_3

    .line 41
    .line 42
    invoke-interface {v4, v0}, Lb3/c;->e(I)Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-nez v1, :cond_3

    .line 47
    .line 48
    :cond_2
    invoke-virtual {p0, p2, p3}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->scrollBy(II)V

    .line 49
    .line 50
    .line 51
    aput p3, p4, v0

    .line 52
    .line 53
    return-void

    .line 54
    :cond_3
    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :cond_4
    if-le v2, v3, :cond_7

    .line 59
    .line 60
    if-eqz v1, :cond_5

    .line 61
    .line 62
    invoke-virtual {p0, p2, p3}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->scrollBy(II)V

    .line 63
    .line 64
    .line 65
    aput p3, p4, v0

    .line 66
    .line 67
    :cond_5
    if-nez v1, :cond_a

    .line 68
    .line 69
    add-int p1, v2, p3

    .line 70
    .line 71
    if-le p1, v3, :cond_6

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_6
    sub-int p3, v3, v2

    .line 75
    .line 76
    :goto_1
    invoke-virtual {p0, p2, p3}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->scrollBy(II)V

    .line 77
    .line 78
    .line 79
    aput p3, p4, v0

    .line 80
    .line 81
    return-void

    .line 82
    :cond_7
    if-nez v1, :cond_8

    .line 83
    .line 84
    invoke-virtual {p0, p2, p3}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->scrollBy(II)V

    .line 85
    .line 86
    .line 87
    aput p3, p4, v0

    .line 88
    .line 89
    :cond_8
    if-eqz v1, :cond_a

    .line 90
    .line 91
    add-int p1, v2, p3

    .line 92
    .line 93
    if-ge p1, v3, :cond_9

    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_9
    sub-int p3, v3, v2

    .line 97
    .line 98
    :goto_2
    invoke-virtual {p0, p2, p3}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->scrollBy(II)V

    .line 99
    .line 100
    .line 101
    aput p3, p4, v0

    .line 102
    .line 103
    :cond_a
    return-void
.end method

.method public final onNestedScroll(Landroid/view/View;IIII)V
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

.method public final onNestedScrollAccepted(Landroid/view/View;Landroid/view/View;I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->a:Landroidx/core/view/NestedScrollingParentHelper;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3}, Landroidx/core/view/NestedScrollingParentHelper;->onNestedScrollAccepted(Landroid/view/View;Landroid/view/View;I)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput p1, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->k:I

    .line 8
    .line 9
    iget-object p1, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->d:Landroid/widget/Scroller;

    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/widget/Scroller;->abortAnimation()V

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->e:Landroid/widget/Scroller;

    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/widget/Scroller;->abortAnimation()V

    .line 17
    .line 18
    .line 19
    iget-object p1, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->f:Landroid/widget/Scroller;

    .line 20
    .line 21
    invoke-virtual {p1}, Landroid/widget/Scroller;->abortAnimation()V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public final onStartNestedScroll(Landroid/view/View;Landroid/view/View;I)Z
    .locals 0

    and-int/lit8 p1, p3, 0x2

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final onStopNestedScroll(Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->a:Landroidx/core/view/NestedScrollingParentHelper;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Landroidx/core/view/NestedScrollingParentHelper;->onStopNestedScroll(Landroid/view/View;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
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
    if-eqz v0, :cond_4

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
    iget v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->m:I

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
    iput p1, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->m:I

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
    iget v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->m:I

    .line 36
    .line 37
    sub-int v0, p1, v0

    .line 38
    .line 39
    iput p1, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->m:I

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
    iput v2, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->m:I

    .line 47
    .line 48
    iget-object p1, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->g:Landroid/view/VelocityTracker;

    .line 49
    .line 50
    if-eqz p1, :cond_5

    .line 51
    .line 52
    iget v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->i:I

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
    iget-object p1, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->g:Landroid/view/VelocityTracker;

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
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->g:Landroid/view/VelocityTracker;

    .line 68
    .line 69
    if-eqz v0, :cond_3

    .line 70
    .line 71
    invoke-virtual {v0}, Landroid/view/VelocityTracker;->recycle()V

    .line 72
    .line 73
    .line 74
    const/4 v0, 0x0

    .line 75
    iput-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->g:Landroid/view/VelocityTracker;

    .line 76
    .line 77
    :cond_3
    neg-int p1, p1

    .line 78
    int-to-float p1, p1

    .line 79
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->c(F)V

    .line 80
    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_4
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    float-to-int p1, p1

    .line 88
    iput p1, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->m:I

    .line 89
    .line 90
    :cond_5
    :goto_0
    return v1
.end method

.method public final scrollBy(II)V
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
    iget v2, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->c:I

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
