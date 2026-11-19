.class public Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper;
.super Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;
.source "SourceFile"

# interfaces
.implements Landroidx/recyclerview/widget/RecyclerView$OnChildAttachStateChangeListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper$c;
    }
.end annotation


# instance fields
.field public final a:Ljava/util/List;

.field public final b:[F

.field public c:Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

.field public d:Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

.field public e:F

.field public f:F

.field public g:F

.field public h:F

.field public i:I

.field public j:I

.field public k:Ljava/util/List;

.field public l:Landroidx/recyclerview/widget/RecyclerView;

.field public m:Landroid/view/VelocityTracker;

.field public n:Landroidx/recyclerview/widget/RecyclerView$ChildDrawingOrderCallback;

.field public o:Landroid/view/View;

.field public p:I

.field public q:J


# virtual methods
.method public a(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Z)I
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper;->k:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    add-int/lit8 v0, v0, -0x1

    .line 8
    .line 9
    :goto_0
    if-ltz v0, :cond_2

    .line 10
    .line 11
    iget-object v1, p0, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper;->k:Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper$c;

    .line 18
    .line 19
    iget-object v2, v1, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper$c;->e:Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    .line 20
    .line 21
    if-ne v2, p1, :cond_1

    .line 22
    .line 23
    iget-boolean p1, v1, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper$c;->j:Z

    .line 24
    .line 25
    or-int/2addr p1, p2

    .line 26
    iput-boolean p1, v1, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper$c;->j:Z

    .line 27
    .line 28
    iget-boolean p1, v1, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper$c;->k:Z

    .line 29
    .line 30
    if-nez p1, :cond_0

    .line 31
    .line 32
    invoke-virtual {v1}, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper$c;->a()V

    .line 33
    .line 34
    .line 35
    :cond_0
    iget-object p1, p0, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper;->k:Ljava/util/List;

    .line 36
    .line 37
    invoke-interface {p1, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    iget p1, v1, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper$c;->h:I

    .line 41
    .line 42
    return p1

    .line 43
    :cond_1
    add-int/lit8 v0, v0, -0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    const/4 p1, 0x0

    .line 47
    return p1
.end method

.method public final addChildDrawingOrderCallback()V
    .locals 0

    return-void
.end method

.method public b(Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper$c;I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper;->l:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    new-instance v1, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper$b;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1, p2}, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper$b;-><init>(Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper;Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper$c;I)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public getItemOffsets(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$State;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Landroid/graphics/Rect;->setEmpty()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final getSelectedDxDy([F)V
    .locals 3

    .line 1
    iget v0, p0, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper;->j:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, 0xc

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget v0, p0, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper;->g:F

    .line 9
    .line 10
    iget v2, p0, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper;->e:F

    .line 11
    .line 12
    add-float/2addr v0, v2

    .line 13
    iget-object v2, p0, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper;->c:Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    .line 14
    .line 15
    iget-object v2, v2, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 16
    .line 17
    invoke-virtual {v2}, Landroid/view/View;->getLeft()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    int-to-float v2, v2

    .line 22
    sub-float/2addr v0, v2

    .line 23
    aput v0, p1, v1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    iget-object v0, p0, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper;->c:Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    .line 27
    .line 28
    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 29
    .line 30
    invoke-virtual {v0}, Landroid/view/View;->getTranslationX()F

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    aput v0, p1, v1

    .line 35
    .line 36
    :goto_0
    iget v0, p0, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper;->j:I

    .line 37
    .line 38
    and-int/lit8 v0, v0, 0x3

    .line 39
    .line 40
    const/4 v1, 0x1

    .line 41
    if-eqz v0, :cond_1

    .line 42
    .line 43
    iget v0, p0, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper;->h:F

    .line 44
    .line 45
    iget v2, p0, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper;->f:F

    .line 46
    .line 47
    add-float/2addr v0, v2

    .line 48
    iget-object v2, p0, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper;->c:Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    .line 49
    .line 50
    iget-object v2, v2, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 51
    .line 52
    invoke-virtual {v2}, Landroid/view/View;->getTop()I

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    int-to-float v2, v2

    .line 57
    sub-float/2addr v0, v2

    .line 58
    aput v0, p1, v1

    .line 59
    .line 60
    return-void

    .line 61
    :cond_1
    iget-object v0, p0, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper;->c:Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    .line 62
    .line 63
    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 64
    .line 65
    invoke-virtual {v0}, Landroid/view/View;->getTranslationY()F

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    aput v0, p1, v1

    .line 70
    .line 71
    return-void
.end method

.method public hasRunningRecoverAnim()Z
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper;->k:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    move v2, v1

    .line 9
    :goto_0
    if-ge v2, v0, :cond_1

    .line 10
    .line 11
    iget-object v3, p0, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper;->k:Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    check-cast v3, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper$c;

    .line 18
    .line 19
    iget-boolean v3, v3, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper$c;->k:Z

    .line 20
    .line 21
    if-nez v3, :cond_0

    .line 22
    .line 23
    const/4 v0, 0x1

    .line 24
    return v0

    .line 25
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    return v1
.end method

.method public onChildViewAttachedToWindow(Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method public onChildViewDetachedFromWindow(Landroid/view/View;)V
    .locals 3

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper;->removeChildDrawingOrderCallbackIfNecessary(Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper;->l:Landroidx/recyclerview/widget/RecyclerView;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->getChildViewHolder(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iget-object v0, p0, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper;->c:Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    const/4 v2, 0x0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    if-ne p1, v0, :cond_1

    .line 20
    .line 21
    invoke-virtual {p0, v2, v1}, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper;->select(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_1
    invoke-virtual {p0, p1, v1}, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper;->a(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Z)I

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper;->a:Ljava/util/List;

    .line 29
    .line 30
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 31
    .line 32
    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-nez p1, :cond_2

    .line 37
    .line 38
    :goto_0
    return-void

    .line 39
    :cond_2
    throw v2
.end method

.method public onDraw(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$State;)V
    .locals 0

    .line 1
    const/4 p1, -0x1

    .line 2
    iput p1, p0, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper;->p:I

    .line 3
    .line 4
    iget-object p1, p0, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper;->c:Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    iget-object p1, p0, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper;->b:[F

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper;->getSelectedDxDy([F)V

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper;->b:[F

    .line 14
    .line 15
    const/4 p2, 0x0

    .line 16
    aget p2, p1, p2

    .line 17
    .line 18
    const/4 p2, 0x1

    .line 19
    aget p1, p1, p2

    .line 20
    .line 21
    :cond_0
    const/4 p1, 0x0

    .line 22
    throw p1
.end method

.method public onDrawOver(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$State;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper;->c:Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper;->b:[F

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper;->getSelectedDxDy([F)V

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper;->b:[F

    .line 11
    .line 12
    const/4 p2, 0x0

    .line 13
    aget p2, p1, p2

    .line 14
    .line 15
    const/4 p2, 0x1

    .line 16
    aget p1, p1, p2

    .line 17
    .line 18
    :cond_0
    const/4 p1, 0x0

    .line 19
    throw p1
.end method

.method public final releaseVelocityTracker()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper;->m:Landroid/view/VelocityTracker;

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
    iput-object v0, p0, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper;->m:Landroid/view/VelocityTracker;

    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public removeChildDrawingOrderCallbackIfNecessary(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper;->o:Landroid/view/View;

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    iput-object p1, p0, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper;->o:Landroid/view/View;

    .line 7
    .line 8
    iget-object v0, p0, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper;->n:Landroidx/recyclerview/widget/RecyclerView$ChildDrawingOrderCallback;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper;->l:Landroidx/recyclerview/widget/RecyclerView;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->setChildDrawingOrderCallback(Landroidx/recyclerview/widget/RecyclerView$ChildDrawingOrderCallback;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public select(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 14

    .line 1
    move/from16 v2, p2

    .line 2
    .line 3
    iget-object v3, p0, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper;->c:Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    .line 4
    .line 5
    if-ne p1, v3, :cond_0

    .line 6
    .line 7
    iget v3, p0, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper;->i:I

    .line 8
    .line 9
    if-ne v2, v3, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    const-wide/high16 v3, -0x8000000000000000L

    .line 13
    .line 14
    iput-wide v3, p0, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper;->q:J

    .line 15
    .line 16
    iget v4, p0, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper;->i:I

    .line 17
    .line 18
    const/4 v3, 0x1

    .line 19
    invoke-virtual {p0, p1, v3}, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper;->a(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Z)I

    .line 20
    .line 21
    .line 22
    iput v2, p0, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper;->i:I

    .line 23
    .line 24
    const/4 v5, 0x2

    .line 25
    if-ne v2, v5, :cond_1

    .line 26
    .line 27
    iget-object v2, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 28
    .line 29
    iput-object v2, p0, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper;->o:Landroid/view/View;

    .line 30
    .line 31
    invoke-virtual {p0}, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper;->addChildDrawingOrderCallback()V

    .line 32
    .line 33
    .line 34
    :cond_1
    iget-object v2, p0, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper;->c:Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    .line 35
    .line 36
    const/4 v6, 0x0

    .line 37
    const/4 v11, 0x0

    .line 38
    if-eqz v2, :cond_8

    .line 39
    .line 40
    iget-object v0, v2, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 41
    .line 42
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    if-eqz v0, :cond_7

    .line 47
    .line 48
    if-ne v4, v5, :cond_2

    .line 49
    .line 50
    move v9, v6

    .line 51
    goto :goto_0

    .line 52
    :cond_2
    invoke-virtual {p0, v2}, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper;->swipeIfNecessary(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    move v9, v0

    .line 57
    :goto_0
    invoke-virtual {p0}, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper;->releaseVelocityTracker()V

    .line 58
    .line 59
    .line 60
    const/16 v0, 0x8

    .line 61
    .line 62
    const/4 v7, 0x4

    .line 63
    const/4 v8, 0x0

    .line 64
    if-eq v9, v3, :cond_4

    .line 65
    .line 66
    if-eq v9, v5, :cond_4

    .line 67
    .line 68
    if-eq v9, v7, :cond_3

    .line 69
    .line 70
    if-eq v9, v0, :cond_3

    .line 71
    .line 72
    const/16 v10, 0x10

    .line 73
    .line 74
    if-eq v9, v10, :cond_3

    .line 75
    .line 76
    const/16 v10, 0x20

    .line 77
    .line 78
    if-eq v9, v10, :cond_3

    .line 79
    .line 80
    move v10, v8

    .line 81
    goto :goto_1

    .line 82
    :cond_3
    iget v10, p0, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper;->e:F

    .line 83
    .line 84
    invoke-static {v10}, Ljava/lang/Math;->signum(F)F

    .line 85
    .line 86
    .line 87
    move-result v10

    .line 88
    iget-object v12, p0, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper;->l:Landroidx/recyclerview/widget/RecyclerView;

    .line 89
    .line 90
    invoke-virtual {v12}, Landroid/view/View;->getWidth()I

    .line 91
    .line 92
    .line 93
    move-result v12

    .line 94
    int-to-float v12, v12

    .line 95
    mul-float/2addr v10, v12

    .line 96
    move v13, v10

    .line 97
    move v10, v8

    .line 98
    move v8, v13

    .line 99
    goto :goto_1

    .line 100
    :cond_4
    iget v10, p0, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper;->f:F

    .line 101
    .line 102
    invoke-static {v10}, Ljava/lang/Math;->signum(F)F

    .line 103
    .line 104
    .line 105
    move-result v10

    .line 106
    iget-object v12, p0, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper;->l:Landroidx/recyclerview/widget/RecyclerView;

    .line 107
    .line 108
    invoke-virtual {v12}, Landroid/view/View;->getHeight()I

    .line 109
    .line 110
    .line 111
    move-result v12

    .line 112
    int-to-float v12, v12

    .line 113
    mul-float/2addr v10, v12

    .line 114
    :goto_1
    if-eq v4, v5, :cond_6

    .line 115
    .line 116
    if-lez v9, :cond_5

    .line 117
    .line 118
    goto :goto_2

    .line 119
    :cond_5
    move v5, v7

    .line 120
    goto :goto_2

    .line 121
    :cond_6
    move v5, v0

    .line 122
    :goto_2
    iget-object v0, p0, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper;->b:[F

    .line 123
    .line 124
    invoke-virtual {p0, v0}, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper;->getSelectedDxDy([F)V

    .line 125
    .line 126
    .line 127
    iget-object v0, p0, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper;->b:[F

    .line 128
    .line 129
    move v7, v3

    .line 130
    move v3, v5

    .line 131
    aget v5, v0, v6

    .line 132
    .line 133
    aget v6, v0, v7

    .line 134
    .line 135
    new-instance v0, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper$a;

    .line 136
    .line 137
    move v7, v8

    .line 138
    move v8, v10

    .line 139
    move-object v10, v2

    .line 140
    move-object v1, p0

    .line 141
    invoke-direct/range {v0 .. v10}, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper$a;-><init>(Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;IIFFFFILandroidx/recyclerview/widget/RecyclerView$ViewHolder;)V

    .line 142
    .line 143
    .line 144
    throw v11

    .line 145
    :cond_7
    iget-object v0, v2, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 146
    .line 147
    invoke-virtual {p0, v0}, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper;->removeChildDrawingOrderCallbackIfNecessary(Landroid/view/View;)V

    .line 148
    .line 149
    .line 150
    throw v11

    .line 151
    :cond_8
    move v7, v3

    .line 152
    if-nez p1, :cond_b

    .line 153
    .line 154
    iget-object v0, p0, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper;->l:Landroidx/recyclerview/widget/RecyclerView;

    .line 155
    .line 156
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    if-eqz v0, :cond_a

    .line 161
    .line 162
    iget-object v2, p0, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper;->c:Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    .line 163
    .line 164
    if-eqz v2, :cond_9

    .line 165
    .line 166
    move v3, v7

    .line 167
    goto :goto_3

    .line 168
    :cond_9
    move v3, v6

    .line 169
    :goto_3
    invoke-interface {v0, v3}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 170
    .line 171
    .line 172
    :cond_a
    iget-object v0, p0, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper;->l:Landroidx/recyclerview/widget/RecyclerView;

    .line 173
    .line 174
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->requestSimpleAnimationsInNextLayout()V

    .line 179
    .line 180
    .line 181
    throw v11

    .line 182
    :cond_b
    throw v11
.end method

.method public final swipeIfNecessary(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)I
    .locals 1

    .line 1
    iget p1, p0, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper;->i:I

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    if-ne p1, v0, :cond_0

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    return p1

    .line 8
    :cond_0
    const/4 p1, 0x0

    .line 9
    throw p1
.end method
