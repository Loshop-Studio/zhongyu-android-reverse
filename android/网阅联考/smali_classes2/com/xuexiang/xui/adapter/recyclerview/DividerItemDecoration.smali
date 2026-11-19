.class public Lcom/xuexiang/xui/adapter/recyclerview/DividerItemDecoration;
.super Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;
.source "SourceFile"


# static fields
.field public static final f:[I


# instance fields
.field public a:Landroid/graphics/Paint;

.field public b:Landroid/graphics/drawable/Drawable;

.field public c:I

.field public d:I

.field public e:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    const v0, 0x1010214

    .line 2
    .line 3
    .line 4
    filled-new-array {v0}, [I

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    sput-object v0, Lcom/xuexiang/xui/adapter/recyclerview/DividerItemDecoration;->f:[I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final drawHorizontal(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 13

    .line 1
    invoke-virtual {p2}, Landroid/view/View;->getPaddingTop()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget v1, p0, Lcom/xuexiang/xui/adapter/recyclerview/DividerItemDecoration;->e:I

    .line 6
    .line 7
    add-int/2addr v0, v1

    .line 8
    invoke-virtual {p2}, Landroid/view/View;->getMeasuredHeight()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    invoke-virtual {p2}, Landroid/view/View;->getPaddingBottom()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    sub-int/2addr v1, v2

    .line 17
    iget v2, p0, Lcom/xuexiang/xui/adapter/recyclerview/DividerItemDecoration;->e:I

    .line 18
    .line 19
    sub-int/2addr v1, v2

    .line 20
    invoke-virtual {p2}, Landroid/view/ViewGroup;->getChildCount()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    const/4 v3, 0x0

    .line 25
    :goto_0
    add-int/lit8 v4, v2, -0x1

    .line 26
    .line 27
    if-ge v3, v4, :cond_2

    .line 28
    .line 29
    invoke-virtual {p2, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    check-cast v5, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    .line 38
    .line 39
    invoke-virtual {v4}, Landroid/view/View;->getRight()I

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    iget v5, v5, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 44
    .line 45
    add-int/2addr v4, v5

    .line 46
    iget v5, p0, Lcom/xuexiang/xui/adapter/recyclerview/DividerItemDecoration;->c:I

    .line 47
    .line 48
    add-int/2addr v5, v4

    .line 49
    iget-object v6, p0, Lcom/xuexiang/xui/adapter/recyclerview/DividerItemDecoration;->b:Landroid/graphics/drawable/Drawable;

    .line 50
    .line 51
    if-eqz v6, :cond_0

    .line 52
    .line 53
    invoke-virtual {v6, v4, v0, v5, v1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 54
    .line 55
    .line 56
    iget-object v6, p0, Lcom/xuexiang/xui/adapter/recyclerview/DividerItemDecoration;->b:Landroid/graphics/drawable/Drawable;

    .line 57
    .line 58
    invoke-virtual {v6, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 59
    .line 60
    .line 61
    :cond_0
    iget-object v12, p0, Lcom/xuexiang/xui/adapter/recyclerview/DividerItemDecoration;->a:Landroid/graphics/Paint;

    .line 62
    .line 63
    if-eqz v12, :cond_1

    .line 64
    .line 65
    int-to-float v8, v4

    .line 66
    int-to-float v9, v0

    .line 67
    int-to-float v10, v5

    .line 68
    int-to-float v11, v1

    .line 69
    move-object v7, p1

    .line 70
    invoke-virtual/range {v7 .. v12}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 71
    .line 72
    .line 73
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_2
    return-void
.end method

.method public final drawVertical(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 13

    .line 1
    invoke-virtual {p2}, Landroid/view/View;->getPaddingLeft()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget v1, p0, Lcom/xuexiang/xui/adapter/recyclerview/DividerItemDecoration;->e:I

    .line 6
    .line 7
    add-int/2addr v0, v1

    .line 8
    invoke-virtual {p2}, Landroid/view/View;->getMeasuredWidth()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    invoke-virtual {p2}, Landroid/view/View;->getPaddingRight()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    sub-int/2addr v1, v2

    .line 17
    iget v2, p0, Lcom/xuexiang/xui/adapter/recyclerview/DividerItemDecoration;->e:I

    .line 18
    .line 19
    sub-int/2addr v1, v2

    .line 20
    invoke-virtual {p2}, Landroid/view/ViewGroup;->getChildCount()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    const/4 v3, 0x0

    .line 25
    :goto_0
    add-int/lit8 v4, v2, -0x1

    .line 26
    .line 27
    if-ge v3, v4, :cond_2

    .line 28
    .line 29
    invoke-virtual {p2, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    check-cast v5, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    .line 38
    .line 39
    invoke-virtual {v4}, Landroid/view/View;->getBottom()I

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    iget v5, v5, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 44
    .line 45
    add-int/2addr v4, v5

    .line 46
    iget v5, p0, Lcom/xuexiang/xui/adapter/recyclerview/DividerItemDecoration;->c:I

    .line 47
    .line 48
    add-int/2addr v5, v4

    .line 49
    iget-object v6, p0, Lcom/xuexiang/xui/adapter/recyclerview/DividerItemDecoration;->b:Landroid/graphics/drawable/Drawable;

    .line 50
    .line 51
    if-eqz v6, :cond_0

    .line 52
    .line 53
    invoke-virtual {v6, v0, v4, v1, v5}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 54
    .line 55
    .line 56
    iget-object v6, p0, Lcom/xuexiang/xui/adapter/recyclerview/DividerItemDecoration;->b:Landroid/graphics/drawable/Drawable;

    .line 57
    .line 58
    invoke-virtual {v6, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 59
    .line 60
    .line 61
    :cond_0
    iget-object v12, p0, Lcom/xuexiang/xui/adapter/recyclerview/DividerItemDecoration;->a:Landroid/graphics/Paint;

    .line 62
    .line 63
    if-eqz v12, :cond_1

    .line 64
    .line 65
    int-to-float v8, v0

    .line 66
    int-to-float v9, v4

    .line 67
    int-to-float v10, v1

    .line 68
    int-to-float v11, v5

    .line 69
    move-object v7, p1

    .line 70
    invoke-virtual/range {v7 .. v12}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 71
    .line 72
    .line 73
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_2
    return-void
.end method

.method public getItemOffsets(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$State;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;->getItemOffsets(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$State;)V

    .line 2
    .line 3
    .line 4
    iget p2, p0, Lcom/xuexiang/xui/adapter/recyclerview/DividerItemDecoration;->d:I

    .line 5
    .line 6
    const/4 p3, 0x1

    .line 7
    const/4 p4, 0x0

    .line 8
    if-ne p2, p3, :cond_0

    .line 9
    .line 10
    iget p2, p0, Lcom/xuexiang/xui/adapter/recyclerview/DividerItemDecoration;->c:I

    .line 11
    .line 12
    invoke-virtual {p1, p4, p4, p4, p2}, Landroid/graphics/Rect;->set(IIII)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget p2, p0, Lcom/xuexiang/xui/adapter/recyclerview/DividerItemDecoration;->c:I

    .line 17
    .line 18
    invoke-virtual {p1, p4, p4, p2, p4}, Landroid/graphics/Rect;->set(IIII)V

    .line 19
    .line 20
    .line 21
    :goto_0
    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$State;)V
    .locals 1

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;->onDraw(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$State;)V

    .line 2
    .line 3
    .line 4
    iget p3, p0, Lcom/xuexiang/xui/adapter/recyclerview/DividerItemDecoration;->d:I

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    if-ne p3, v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0, p1, p2}, Lcom/xuexiang/xui/adapter/recyclerview/DividerItemDecoration;->drawVertical(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;)V

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/xuexiang/xui/adapter/recyclerview/DividerItemDecoration;->drawHorizontal(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;)V

    .line 14
    .line 15
    .line 16
    :goto_0
    return-void
.end method
