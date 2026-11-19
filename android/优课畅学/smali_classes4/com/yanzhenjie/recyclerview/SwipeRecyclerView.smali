.class public Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;
.super Landroidx/recyclerview/widget/RecyclerView;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yanzhenjie/recyclerview/SwipeRecyclerView$f;,
        Lcom/yanzhenjie/recyclerview/SwipeRecyclerView$g;,
        Lcom/yanzhenjie/recyclerview/SwipeRecyclerView$e;,
        Lcom/yanzhenjie/recyclerview/SwipeRecyclerView$d;,
        Lcom/yanzhenjie/recyclerview/SwipeRecyclerView$c;
    }
.end annotation


# instance fields
.field public a:I

.field public b:Lcom/yanzhenjie/recyclerview/SwipeMenuLayout;

.field public c:I

.field public d:I

.field public e:I

.field public f:Z

.field public g:Lcom/yanzhenjie/recyclerview/touch/DefaultItemTouchHelper;

.field public h:Ly2/h;

.field public i:Ly2/e;

.field public j:Ly2/c;

.field public k:Ly2/d;

.field public l:Ly2/a;

.field public m:Z

.field public n:Ljava/util/List;

.field public o:Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;

.field public p:Ljava/util/List;

.field public q:Ljava/util/List;

.field public r:I

.field public s:Z

.field public t:Z

.field public u:Z

.field public v:Z

.field public w:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, p2, v0}, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2, p3}, Landroidx/recyclerview/widget/RecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p1, -0x1

    .line 3
    iput p1, p0, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;->c:I

    const/4 p2, 0x1

    .line 4
    iput-boolean p2, p0, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;->m:Z

    .line 5
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    iput-object p3, p0, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;->n:Ljava/util/List;

    .line 6
    new-instance p3, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView$b;

    invoke-direct {p3, p0}, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView$b;-><init>(Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;)V

    iput-object p3, p0, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;->o:Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;

    .line 7
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    iput-object p3, p0, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;->p:Ljava/util/List;

    .line 8
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    iput-object p3, p0, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;->q:Ljava/util/List;

    .line 9
    iput p1, p0, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;->r:I

    const/4 p1, 0x0

    .line 10
    iput-boolean p1, p0, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;->s:Z

    .line 11
    iput-boolean p2, p0, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;->t:Z

    .line 12
    iput-boolean p1, p0, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;->u:Z

    .line 13
    iput-boolean p2, p0, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;->v:Z

    .line 14
    iput-boolean p1, p0, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;->w:Z

    .line 15
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result p1

    iput p1, p0, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;->a:I

    return-void
.end method

.method public static synthetic b(Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;)Ly2/a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;->l:Ly2/a;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public final c(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;->l:Ly2/a;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    throw v0
.end method

.method public final d()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;->u:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-boolean v0, p0, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;->t:Z

    .line 7
    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    return-void

    .line 11
    :cond_1
    iget-boolean v0, p0, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;->s:Z

    .line 12
    .line 13
    if-nez v0, :cond_3

    .line 14
    .line 15
    iget-boolean v0, p0, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;->v:Z

    .line 16
    .line 17
    if-nez v0, :cond_3

    .line 18
    .line 19
    iget-boolean v0, p0, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;->w:Z

    .line 20
    .line 21
    if-nez v0, :cond_2

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_2
    const/4 v0, 0x1

    .line 25
    iput-boolean v0, p0, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;->s:Z

    .line 26
    .line 27
    :cond_3
    :goto_0
    return-void
.end method

.method public final e(Landroid/view/View;)Landroid/view/View;
    .locals 5

    .line 1
    instance-of v0, p1, Lcom/yanzhenjie/recyclerview/SwipeMenuLayout;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object p1

    .line 6
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-nez v1, :cond_4

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    check-cast v2, Landroid/view/View;

    .line 26
    .line 27
    instance-of v3, v2, Landroid/view/ViewGroup;

    .line 28
    .line 29
    if-nez v3, :cond_2

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_2
    instance-of v3, v2, Lcom/yanzhenjie/recyclerview/SwipeMenuLayout;

    .line 33
    .line 34
    if-eqz v3, :cond_3

    .line 35
    .line 36
    return-object v2

    .line 37
    :cond_3
    check-cast v2, Landroid/view/ViewGroup;

    .line 38
    .line 39
    invoke-virtual {v2}, Landroid/view/ViewGroup;->getChildCount()I

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    :goto_1
    if-ge v1, v3, :cond_1

    .line 44
    .line 45
    invoke-virtual {v2, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    add-int/lit8 v1, v1, 0x1

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_4
    return-object p1
.end method

.method public final f(IIZ)Z
    .locals 3

    .line 1
    iget v0, p0, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;->d:I

    .line 2
    .line 3
    sub-int/2addr v0, p1

    .line 4
    iget p1, p0, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;->e:I

    .line 5
    .line 6
    sub-int/2addr p1, p2

    .line 7
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    .line 8
    .line 9
    .line 10
    move-result p2

    .line 11
    iget v1, p0, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;->a:I

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    if-le p2, v1, :cond_0

    .line 15
    .line 16
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-le p2, v1, :cond_0

    .line 25
    .line 26
    return v2

    .line 27
    :cond_0
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    iget p2, p0, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;->a:I

    .line 32
    .line 33
    if-ge p1, p2, :cond_1

    .line 34
    .line 35
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    iget p2, p0, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;->a:I

    .line 40
    .line 41
    if-ge p1, p2, :cond_1

    .line 42
    .line 43
    return v2

    .line 44
    :cond_1
    return p3
.end method

.method public final g()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;->g:Lcom/yanzhenjie/recyclerview/touch/DefaultItemTouchHelper;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/yanzhenjie/recyclerview/touch/DefaultItemTouchHelper;

    .line 6
    .line 7
    invoke-direct {v0}, Lcom/yanzhenjie/recyclerview/touch/DefaultItemTouchHelper;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;->g:Lcom/yanzhenjie/recyclerview/touch/DefaultItemTouchHelper;

    .line 11
    .line 12
    invoke-virtual {v0, p0}, Landroidx/recyclerview/widget/ItemTouchHelper;->attachToRecyclerView(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public getFooterCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;->l:Ly2/a;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return v0

    .line 7
    :cond_0
    invoke-virtual {v0}, Ly2/a;->h()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method

.method public getHeaderCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;->l:Ly2/a;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return v0

    .line 7
    :cond_0
    invoke-virtual {v0}, Ly2/a;->i()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method

.method public getOriginAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;->l:Ly2/a;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return-object v0

    .line 7
    :cond_0
    invoke-virtual {v0}, Ly2/a;->j()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 10

    .line 1
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-boolean v1, p0, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;->f:Z

    .line 6
    .line 7
    if-nez v1, :cond_14

    .line 8
    .line 9
    iget-object v1, p0, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;->h:Ly2/h;

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    goto/16 :goto_7

    .line 14
    .line 15
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    const/4 v2, 0x1

    .line 20
    if-le v1, v2, :cond_1

    .line 21
    .line 22
    return v2

    .line 23
    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    float-to-int v3, v3

    .line 32
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    float-to-int p1, p1

    .line 37
    int-to-float v4, v3

    .line 38
    int-to-float v5, p1

    .line 39
    invoke-virtual {p0, v4, v5}, Landroidx/recyclerview/widget/RecyclerView;->findChildViewUnder(FF)Landroid/view/View;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    invoke-virtual {p0, v4}, Landroidx/recyclerview/widget/RecyclerView;->getChildAdapterPosition(Landroid/view/View;)I

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    invoke-virtual {p0, v4}, Landroidx/recyclerview/widget/RecyclerView;->findViewHolderForAdapterPosition(I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    const/4 v6, 0x0

    .line 52
    if-eqz v5, :cond_2

    .line 53
    .line 54
    iget-object v5, v5, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 55
    .line 56
    invoke-virtual {p0, v5}, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;->e(Landroid/view/View;)Landroid/view/View;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    instance-of v7, v5, Lcom/yanzhenjie/recyclerview/SwipeMenuLayout;

    .line 61
    .line 62
    if-eqz v7, :cond_2

    .line 63
    .line 64
    check-cast v5, Lcom/yanzhenjie/recyclerview/SwipeMenuLayout;

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_2
    move-object v5, v6

    .line 68
    :goto_0
    iget-boolean v7, p0, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;->m:Z

    .line 69
    .line 70
    const/4 v8, 0x0

    .line 71
    if-eqz v7, :cond_3

    .line 72
    .line 73
    iget-object v7, p0, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;->n:Ljava/util/List;

    .line 74
    .line 75
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 76
    .line 77
    .line 78
    move-result-object v9

    .line 79
    invoke-interface {v7, v9}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v7

    .line 83
    if-nez v7, :cond_3

    .line 84
    .line 85
    move v7, v2

    .line 86
    goto :goto_1

    .line 87
    :cond_3
    move v7, v8

    .line 88
    :goto_1
    if-eqz v5, :cond_4

    .line 89
    .line 90
    invoke-virtual {v5, v7}, Lcom/yanzhenjie/recyclerview/SwipeMenuLayout;->setSwipeEnable(Z)V

    .line 91
    .line 92
    .line 93
    :cond_4
    if-nez v7, :cond_5

    .line 94
    .line 95
    goto/16 :goto_7

    .line 96
    .line 97
    :cond_5
    if-eqz v1, :cond_10

    .line 98
    .line 99
    if-eq v1, v2, :cond_f

    .line 100
    .line 101
    const/4 v4, 0x2

    .line 102
    if-eq v1, v4, :cond_6

    .line 103
    .line 104
    const/4 v2, 0x3

    .line 105
    if-eq v1, v2, :cond_f

    .line 106
    .line 107
    goto/16 :goto_7

    .line 108
    .line 109
    :cond_6
    invoke-virtual {p0, v3, p1, v0}, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;->f(IIZ)Z

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    iget-object v1, p0, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;->b:Lcom/yanzhenjie/recyclerview/SwipeMenuLayout;

    .line 114
    .line 115
    if-nez v1, :cond_7

    .line 116
    .line 117
    goto :goto_2

    .line 118
    :cond_7
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    if-nez v1, :cond_8

    .line 123
    .line 124
    :goto_2
    return v0

    .line 125
    :cond_8
    iget v4, p0, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;->d:I

    .line 126
    .line 127
    sub-int/2addr v4, v3

    .line 128
    if-lez v4, :cond_a

    .line 129
    .line 130
    iget-object v5, p0, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;->b:Lcom/yanzhenjie/recyclerview/SwipeMenuLayout;

    .line 131
    .line 132
    invoke-virtual {v5}, Lcom/yanzhenjie/recyclerview/SwipeMenuLayout;->e()Z

    .line 133
    .line 134
    .line 135
    move-result v5

    .line 136
    if-nez v5, :cond_9

    .line 137
    .line 138
    iget-object v5, p0, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;->b:Lcom/yanzhenjie/recyclerview/SwipeMenuLayout;

    .line 139
    .line 140
    invoke-virtual {v5}, Lcom/yanzhenjie/recyclerview/SwipeMenuLayout;->f()Z

    .line 141
    .line 142
    .line 143
    move-result v5

    .line 144
    if-eqz v5, :cond_a

    .line 145
    .line 146
    :cond_9
    move v5, v2

    .line 147
    goto :goto_3

    .line 148
    :cond_a
    move v5, v8

    .line 149
    :goto_3
    if-gez v4, :cond_c

    .line 150
    .line 151
    iget-object v4, p0, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;->b:Lcom/yanzhenjie/recyclerview/SwipeMenuLayout;

    .line 152
    .line 153
    invoke-virtual {v4}, Lcom/yanzhenjie/recyclerview/SwipeMenuLayout;->d()Z

    .line 154
    .line 155
    .line 156
    move-result v4

    .line 157
    if-nez v4, :cond_b

    .line 158
    .line 159
    iget-object v4, p0, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;->b:Lcom/yanzhenjie/recyclerview/SwipeMenuLayout;

    .line 160
    .line 161
    invoke-virtual {v4}, Lcom/yanzhenjie/recyclerview/SwipeMenuLayout;->k()Z

    .line 162
    .line 163
    .line 164
    move-result v4

    .line 165
    if-eqz v4, :cond_c

    .line 166
    .line 167
    :cond_b
    move v4, v2

    .line 168
    goto :goto_4

    .line 169
    :cond_c
    move v4, v8

    .line 170
    :goto_4
    if-nez v5, :cond_e

    .line 171
    .line 172
    if-eqz v4, :cond_d

    .line 173
    .line 174
    goto :goto_5

    .line 175
    :cond_d
    move v2, v8

    .line 176
    :cond_e
    :goto_5
    invoke-interface {v1, v2}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 177
    .line 178
    .line 179
    :cond_f
    invoke-virtual {p0, v3, p1, v0}, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;->f(IIZ)Z

    .line 180
    .line 181
    .line 182
    move-result p1

    .line 183
    return p1

    .line 184
    :cond_10
    iput v3, p0, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;->d:I

    .line 185
    .line 186
    iput p1, p0, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;->e:I

    .line 187
    .line 188
    iget p1, p0, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;->c:I

    .line 189
    .line 190
    if-eq v4, p1, :cond_11

    .line 191
    .line 192
    iget-object p1, p0, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;->b:Lcom/yanzhenjie/recyclerview/SwipeMenuLayout;

    .line 193
    .line 194
    if-eqz p1, :cond_11

    .line 195
    .line 196
    invoke-virtual {p1}, Lcom/yanzhenjie/recyclerview/SwipeMenuLayout;->i()Z

    .line 197
    .line 198
    .line 199
    move-result p1

    .line 200
    if-eqz p1, :cond_11

    .line 201
    .line 202
    iget-object p1, p0, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;->b:Lcom/yanzhenjie/recyclerview/SwipeMenuLayout;

    .line 203
    .line 204
    invoke-virtual {p1}, Lcom/yanzhenjie/recyclerview/SwipeMenuLayout;->a()V

    .line 205
    .line 206
    .line 207
    goto :goto_6

    .line 208
    :cond_11
    move v2, v8

    .line 209
    :goto_6
    if-eqz v2, :cond_12

    .line 210
    .line 211
    iput-object v6, p0, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;->b:Lcom/yanzhenjie/recyclerview/SwipeMenuLayout;

    .line 212
    .line 213
    const/4 p1, -0x1

    .line 214
    iput p1, p0, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;->c:I

    .line 215
    .line 216
    return v2

    .line 217
    :cond_12
    if-eqz v5, :cond_13

    .line 218
    .line 219
    iput-object v5, p0, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;->b:Lcom/yanzhenjie/recyclerview/SwipeMenuLayout;

    .line 220
    .line 221
    iput v4, p0, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;->c:I

    .line 222
    .line 223
    :cond_13
    return v2

    .line 224
    :cond_14
    :goto_7
    return v0
.end method

.method public onScrollStateChanged(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;->r:I

    .line 2
    .line 3
    return-void
.end method

.method public onScrolled(II)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    instance-of p2, p1, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 6
    .line 7
    const/4 v0, 0x2

    .line 8
    const/4 v1, 0x1

    .line 9
    if-eqz p2, :cond_2

    .line 10
    .line 11
    move-object p2, p1

    .line 12
    check-cast p2, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 13
    .line 14
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getItemCount()I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    if-gtz p1, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-virtual {p2}, Landroidx/recyclerview/widget/LinearLayoutManager;->findLastVisibleItemPosition()I

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    add-int/2addr p2, v1

    .line 26
    if-ne p1, p2, :cond_5

    .line 27
    .line 28
    iget p1, p0, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;->r:I

    .line 29
    .line 30
    if-eq p1, v1, :cond_1

    .line 31
    .line 32
    if-ne p1, v0, :cond_5

    .line 33
    .line 34
    :cond_1
    invoke-virtual {p0}, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;->d()V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_2
    instance-of p2, p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    .line 39
    .line 40
    if-eqz p2, :cond_5

    .line 41
    .line 42
    move-object p2, p1

    .line 43
    check-cast p2, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    .line 44
    .line 45
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getItemCount()I

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    if-gtz p1, :cond_3

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_3
    const/4 v2, 0x0

    .line 53
    invoke-virtual {p2, v2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->findLastCompletelyVisibleItemPositions([I)[I

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    array-length v2, p2

    .line 58
    sub-int/2addr v2, v1

    .line 59
    aget p2, p2, v2

    .line 60
    .line 61
    add-int/2addr p2, v1

    .line 62
    if-ne p1, p2, :cond_5

    .line 63
    .line 64
    iget p1, p0, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;->r:I

    .line 65
    .line 66
    if-eq p1, v1, :cond_4

    .line 67
    .line 68
    if-ne p1, v0, :cond_5

    .line 69
    .line 70
    :cond_4
    invoke-virtual {p0}, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;->d()V

    .line 71
    .line 72
    .line 73
    :cond_5
    :goto_0
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x2

    .line 6
    if-eq v0, v1, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    iget-object v0, p0, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;->b:Lcom/yanzhenjie/recyclerview/SwipeMenuLayout;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/yanzhenjie/recyclerview/SwipeMenuLayout;->i()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    iget-object v0, p0, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;->b:Lcom/yanzhenjie/recyclerview/SwipeMenuLayout;

    .line 20
    .line 21
    invoke-virtual {v0}, Lcom/yanzhenjie/recyclerview/SwipeMenuLayout;->a()V

    .line 22
    .line 23
    .line 24
    :cond_1
    :goto_0
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    return p1
.end method

.method public setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;->l:Ly2/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ly2/a;->j()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;->o:Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->unregisterAdapterDataObserver(Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    if-nez p1, :cond_1

    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    iput-object p1, p0, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;->l:Ly2/a;

    .line 18
    .line 19
    goto :goto_2

    .line 20
    :cond_1
    iget-object v0, p0, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;->o:Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;

    .line 21
    .line 22
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->registerAdapterDataObserver(Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;)V

    .line 23
    .line 24
    .line 25
    new-instance v0, Ly2/a;

    .line 26
    .line 27
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-direct {v0, v1, p1}, Ly2/a;-><init>(Landroid/content/Context;Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 32
    .line 33
    .line 34
    iput-object v0, p0, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;->l:Ly2/a;

    .line 35
    .line 36
    iget-object p1, p0, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;->j:Ly2/c;

    .line 37
    .line 38
    invoke-virtual {v0, p1}, Ly2/a;->p(Ly2/c;)V

    .line 39
    .line 40
    .line 41
    iget-object p1, p0, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;->l:Ly2/a;

    .line 42
    .line 43
    iget-object v0, p0, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;->k:Ly2/d;

    .line 44
    .line 45
    invoke-virtual {p1, v0}, Ly2/a;->q(Ly2/d;)V

    .line 46
    .line 47
    .line 48
    iget-object p1, p0, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;->l:Ly2/a;

    .line 49
    .line 50
    iget-object v0, p0, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;->h:Ly2/h;

    .line 51
    .line 52
    invoke-virtual {p1, v0}, Ly2/a;->s(Ly2/h;)V

    .line 53
    .line 54
    .line 55
    iget-object p1, p0, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;->l:Ly2/a;

    .line 56
    .line 57
    iget-object v0, p0, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;->i:Ly2/e;

    .line 58
    .line 59
    invoke-virtual {p1, v0}, Ly2/a;->r(Ly2/e;)V

    .line 60
    .line 61
    .line 62
    iget-object p1, p0, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;->p:Ljava/util/List;

    .line 63
    .line 64
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    if-lez p1, :cond_2

    .line 69
    .line 70
    iget-object p1, p0, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;->p:Ljava/util/List;

    .line 71
    .line 72
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    if-eqz v0, :cond_2

    .line 81
    .line 82
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    check-cast v0, Landroid/view/View;

    .line 87
    .line 88
    iget-object v1, p0, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;->l:Ly2/a;

    .line 89
    .line 90
    invoke-virtual {v1, v0}, Ly2/a;->f(Landroid/view/View;)V

    .line 91
    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_2
    iget-object p1, p0, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;->q:Ljava/util/List;

    .line 95
    .line 96
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    if-lez p1, :cond_3

    .line 101
    .line 102
    iget-object p1, p0, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;->q:Ljava/util/List;

    .line 103
    .line 104
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    if-eqz v0, :cond_3

    .line 113
    .line 114
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    check-cast v0, Landroid/view/View;

    .line 119
    .line 120
    iget-object v1, p0, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;->l:Ly2/a;

    .line 121
    .line 122
    invoke-virtual {v1, v0}, Ly2/a;->e(Landroid/view/View;)V

    .line 123
    .line 124
    .line 125
    goto :goto_1

    .line 126
    :cond_3
    :goto_2
    iget-object p1, p0, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;->l:Ly2/a;

    .line 127
    .line 128
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 129
    .line 130
    .line 131
    return-void
.end method

.method public setAutoLoadMore(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;->t:Z

    .line 2
    .line 3
    return-void
.end method

.method public setItemViewSwipeEnabled(Z)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;->g()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;->f:Z

    .line 5
    .line 6
    iget-object v0, p0, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;->g:Lcom/yanzhenjie/recyclerview/touch/DefaultItemTouchHelper;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lcom/yanzhenjie/recyclerview/touch/DefaultItemTouchHelper;->a(Z)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V
    .locals 3

    .line 1
    instance-of v0, p1, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroidx/recyclerview/widget/GridLayoutManager;->getSpanSizeLookup()Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    new-instance v2, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView$a;

    .line 13
    .line 14
    invoke-direct {v2, p0, v0, v1}, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView$a;-><init>(Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;Landroidx/recyclerview/widget/GridLayoutManager;Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/GridLayoutManager;->setSpanSizeLookup(Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public setLoadMoreListener(Lcom/yanzhenjie/recyclerview/SwipeRecyclerView$f;)V
    .locals 0

    return-void
.end method

.method public setLoadMoreView(Lcom/yanzhenjie/recyclerview/SwipeRecyclerView$g;)V
    .locals 0

    return-void
.end method

.method public setLongPressDragEnabled(Z)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;->g()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;->g:Lcom/yanzhenjie/recyclerview/touch/DefaultItemTouchHelper;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Lcom/yanzhenjie/recyclerview/touch/DefaultItemTouchHelper;->b(Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setOnItemClickListener(Ly2/c;)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    const-string v0, "Cannot set item click listener, setAdapter has already been called."

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;->c(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    new-instance v0, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView$c;

    .line 10
    .line 11
    invoke-direct {v0, p0, p1}, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView$c;-><init>(Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;Ly2/c;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;->j:Ly2/c;

    .line 15
    .line 16
    return-void
.end method

.method public setOnItemLongClickListener(Ly2/d;)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    const-string v0, "Cannot set item long click listener, setAdapter has already been called."

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;->c(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    new-instance v0, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView$d;

    .line 10
    .line 11
    invoke-direct {v0, p0, p1}, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView$d;-><init>(Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;Ly2/d;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;->k:Ly2/d;

    .line 15
    .line 16
    return-void
.end method

.method public setOnItemMenuClickListener(Ly2/e;)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    const-string v0, "Cannot set menu item click listener, setAdapter has already been called."

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;->c(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    new-instance v0, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView$e;

    .line 10
    .line 11
    invoke-direct {v0, p0, p1}, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView$e;-><init>(Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;Ly2/e;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;->i:Ly2/e;

    .line 15
    .line 16
    return-void
.end method

.method public setOnItemMoveListener(Lz2/b;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;->g()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;->g:Lcom/yanzhenjie/recyclerview/touch/DefaultItemTouchHelper;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Lcom/yanzhenjie/recyclerview/touch/DefaultItemTouchHelper;->c(Lz2/b;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setOnItemMovementListener(Lz2/c;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;->g()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;->g:Lcom/yanzhenjie/recyclerview/touch/DefaultItemTouchHelper;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Lcom/yanzhenjie/recyclerview/touch/DefaultItemTouchHelper;->d(Lz2/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setOnItemStateChangedListener(Lz2/d;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;->g()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;->g:Lcom/yanzhenjie/recyclerview/touch/DefaultItemTouchHelper;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Lcom/yanzhenjie/recyclerview/touch/DefaultItemTouchHelper;->e(Lz2/d;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setSwipeItemMenuEnabled(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;->m:Z

    .line 2
    .line 3
    return-void
.end method

.method public setSwipeMenuCreator(Ly2/h;)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    const-string v0, "Cannot set menu creator, setAdapter has already been called."

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;->c(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;->h:Ly2/h;

    .line 10
    .line 11
    return-void
.end method
