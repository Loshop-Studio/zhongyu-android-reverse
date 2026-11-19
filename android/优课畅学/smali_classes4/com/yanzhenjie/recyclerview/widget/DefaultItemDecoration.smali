.class public Lcom/yanzhenjie/recyclerview/widget/DefaultItemDecoration;
.super Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method


# virtual methods
.method public final a(Landroid/graphics/Canvas;Landroid/view/View;III)V
    .locals 2

    .line 1
    const/4 p1, 0x0

    .line 2
    invoke-virtual {p0, p1, p3, p4, p5}, Lcom/yanzhenjie/recyclerview/widget/DefaultItemDecoration;->f(IIII)Z

    .line 3
    .line 4
    .line 5
    move-result p2

    .line 6
    invoke-virtual {p0, p1, p3, p4, p5}, Lcom/yanzhenjie/recyclerview/widget/DefaultItemDecoration;->h(IIII)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    invoke-virtual {p0, p1, p3, p4, p5}, Lcom/yanzhenjie/recyclerview/widget/DefaultItemDecoration;->e(IIII)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-virtual {p0, p1, p3, p4, p5}, Lcom/yanzhenjie/recyclerview/widget/DefaultItemDecoration;->g(IIII)Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    const/4 p3, 0x1

    .line 19
    const/4 p5, 0x0

    .line 20
    if-ne p4, p3, :cond_3

    .line 21
    .line 22
    if-eqz p2, :cond_0

    .line 23
    .line 24
    if-eqz p1, :cond_0

    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    if-nez v1, :cond_2

    .line 28
    .line 29
    if-eqz p1, :cond_1

    .line 30
    .line 31
    throw p5

    .line 32
    :cond_1
    throw p5

    .line 33
    :cond_2
    throw p5

    .line 34
    :cond_3
    if-eqz v1, :cond_5

    .line 35
    .line 36
    if-nez p2, :cond_4

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_4
    throw p5

    .line 40
    :cond_5
    :goto_0
    if-eqz v1, :cond_7

    .line 41
    .line 42
    if-nez v0, :cond_6

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_6
    throw p5

    .line 46
    :cond_7
    :goto_1
    if-eqz p1, :cond_9

    .line 47
    .line 48
    if-nez p2, :cond_8

    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_8
    throw p5

    .line 52
    :cond_9
    :goto_2
    if-eqz p1, :cond_b

    .line 53
    .line 54
    if-nez v0, :cond_a

    .line 55
    .line 56
    goto :goto_3

    .line 57
    :cond_a
    throw p5

    .line 58
    :cond_b
    :goto_3
    if-nez v1, :cond_f

    .line 59
    .line 60
    if-nez p1, :cond_e

    .line 61
    .line 62
    if-nez p2, :cond_d

    .line 63
    .line 64
    if-eqz v0, :cond_c

    .line 65
    .line 66
    throw p5

    .line 67
    :cond_c
    throw p5

    .line 68
    :cond_d
    throw p5

    .line 69
    :cond_e
    throw p5

    .line 70
    :cond_f
    throw p5
.end method

.method public final b(Landroid/graphics/Canvas;Landroid/view/View;III)V
    .locals 2

    .line 1
    const/4 p1, 0x1

    .line 2
    invoke-virtual {p0, p1, p3, p4, p5}, Lcom/yanzhenjie/recyclerview/widget/DefaultItemDecoration;->f(IIII)Z

    .line 3
    .line 4
    .line 5
    move-result p2

    .line 6
    invoke-virtual {p0, p1, p3, p4, p5}, Lcom/yanzhenjie/recyclerview/widget/DefaultItemDecoration;->h(IIII)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    invoke-virtual {p0, p1, p3, p4, p5}, Lcom/yanzhenjie/recyclerview/widget/DefaultItemDecoration;->e(IIII)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-virtual {p0, p1, p3, p4, p5}, Lcom/yanzhenjie/recyclerview/widget/DefaultItemDecoration;->g(IIII)Z

    .line 15
    .line 16
    .line 17
    move-result p3

    .line 18
    const/4 p5, 0x0

    .line 19
    if-ne p4, p1, :cond_3

    .line 20
    .line 21
    if-eqz p2, :cond_0

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    if-nez p2, :cond_2

    .line 27
    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    throw p5

    .line 31
    :cond_1
    throw p5

    .line 32
    :cond_2
    throw p5

    .line 33
    :cond_3
    if-eqz p2, :cond_5

    .line 34
    .line 35
    if-nez v1, :cond_4

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_4
    throw p5

    .line 39
    :cond_5
    :goto_0
    if-eqz p2, :cond_7

    .line 40
    .line 41
    if-nez p3, :cond_6

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_6
    throw p5

    .line 45
    :cond_7
    :goto_1
    if-eqz v0, :cond_9

    .line 46
    .line 47
    if-nez v1, :cond_8

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_8
    throw p5

    .line 51
    :cond_9
    :goto_2
    if-eqz v0, :cond_b

    .line 52
    .line 53
    if-nez p3, :cond_a

    .line 54
    .line 55
    goto :goto_3

    .line 56
    :cond_a
    throw p5

    .line 57
    :cond_b
    :goto_3
    if-nez p2, :cond_f

    .line 58
    .line 59
    if-nez v0, :cond_e

    .line 60
    .line 61
    if-nez v1, :cond_d

    .line 62
    .line 63
    if-eqz p3, :cond_c

    .line 64
    .line 65
    throw p5

    .line 66
    :cond_c
    throw p5

    .line 67
    :cond_d
    throw p5

    .line 68
    :cond_e
    throw p5

    .line 69
    :cond_f
    throw p5
.end method

.method public final c(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)I
    .locals 1

    .line 1
    instance-of v0, p1, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 6
    .line 7
    invoke-virtual {p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->getOrientation()I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1

    .line 12
    :cond_0
    instance-of v0, p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    check-cast p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    .line 17
    .line 18
    invoke-virtual {p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->getOrientation()I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    return p1

    .line 23
    :cond_1
    const/4 p1, 0x1

    .line 24
    return p1
.end method

.method public final d(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)I
    .locals 1

    .line 1
    instance-of v0, p1, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 6
    .line 7
    invoke-virtual {p1}, Landroidx/recyclerview/widget/GridLayoutManager;->getSpanCount()I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1

    .line 12
    :cond_0
    instance-of v0, p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    check-cast p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    .line 17
    .line 18
    invoke-virtual {p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->getSpanCount()I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    return p1

    .line 23
    :cond_1
    const/4 p1, 0x1

    .line 24
    return p1
.end method

.method public final e(IIII)Z
    .locals 1

    .line 1
    const/4 p4, 0x0

    .line 2
    const/4 v0, 0x1

    .line 3
    if-ne p1, v0, :cond_2

    .line 4
    .line 5
    if-ne p3, v0, :cond_0

    .line 6
    .line 7
    return v0

    .line 8
    :cond_0
    rem-int/2addr p2, p3

    .line 9
    if-nez p2, :cond_1

    .line 10
    .line 11
    return v0

    .line 12
    :cond_1
    return p4

    .line 13
    :cond_2
    if-ge p2, p3, :cond_3

    .line 14
    .line 15
    return v0

    .line 16
    :cond_3
    return p4
.end method

.method public final f(IIII)Z
    .locals 1

    .line 1
    const/4 p4, 0x0

    .line 2
    const/4 v0, 0x1

    .line 3
    if-ne p1, v0, :cond_1

    .line 4
    .line 5
    if-ge p2, p3, :cond_0

    .line 6
    .line 7
    return v0

    .line 8
    :cond_0
    return p4

    .line 9
    :cond_1
    if-ne p3, v0, :cond_2

    .line 10
    .line 11
    return v0

    .line 12
    :cond_2
    rem-int/2addr p2, p3

    .line 13
    if-nez p2, :cond_3

    .line 14
    .line 15
    return v0

    .line 16
    :cond_3
    return p4
.end method

.method public final g(IIII)Z
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    if-ne p1, v1, :cond_2

    .line 4
    .line 5
    if-ne p3, v1, :cond_0

    .line 6
    .line 7
    return v1

    .line 8
    :cond_0
    add-int/2addr p2, v1

    .line 9
    rem-int/2addr p2, p3

    .line 10
    if-nez p2, :cond_1

    .line 11
    .line 12
    return v1

    .line 13
    :cond_1
    return v0

    .line 14
    :cond_2
    if-ne p3, v1, :cond_4

    .line 15
    .line 16
    add-int/2addr p2, v1

    .line 17
    if-ne p2, p4, :cond_3

    .line 18
    .line 19
    return v1

    .line 20
    :cond_3
    return v0

    .line 21
    :cond_4
    rem-int p1, p4, p3

    .line 22
    .line 23
    sub-int/2addr p4, p1

    .line 24
    div-int/2addr p4, p3

    .line 25
    if-lez p1, :cond_5

    .line 26
    .line 27
    move p1, v1

    .line 28
    goto :goto_0

    .line 29
    :cond_5
    move p1, v0

    .line 30
    :goto_0
    add-int/2addr p4, p1

    .line 31
    add-int/2addr p2, v1

    .line 32
    rem-int p1, p2, p3

    .line 33
    .line 34
    if-nez p1, :cond_7

    .line 35
    .line 36
    div-int/2addr p2, p3

    .line 37
    if-ne p4, p2, :cond_6

    .line 38
    .line 39
    return v1

    .line 40
    :cond_6
    return v0

    .line 41
    :cond_7
    sub-int/2addr p2, p1

    .line 42
    div-int/2addr p2, p3

    .line 43
    add-int/2addr p2, v1

    .line 44
    if-ne p4, p2, :cond_8

    .line 45
    .line 46
    return v1

    .line 47
    :cond_8
    return v0
.end method

.method public getItemOffsets(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$State;)V
    .locals 2

    .line 1
    invoke-virtual {p3}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    .line 2
    .line 3
    .line 4
    move-result-object p4

    .line 5
    instance-of v0, p4, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    invoke-virtual {p0, p4}, Lcom/yanzhenjie/recyclerview/widget/DefaultItemDecoration;->c(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-virtual {p3, p2}, Landroidx/recyclerview/widget/RecyclerView;->getChildLayoutPosition(Landroid/view/View;)I

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    invoke-virtual {p0, p4}, Lcom/yanzhenjie/recyclerview/widget/DefaultItemDecoration;->d(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)I

    .line 18
    .line 19
    .line 20
    move-result p3

    .line 21
    invoke-virtual {p4}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getItemCount()I

    .line 22
    .line 23
    .line 24
    move-result p4

    .line 25
    const/4 v1, 0x1

    .line 26
    if-ne v0, v1, :cond_0

    .line 27
    .line 28
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/yanzhenjie/recyclerview/widget/DefaultItemDecoration;->j(Landroid/graphics/Rect;III)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/yanzhenjie/recyclerview/widget/DefaultItemDecoration;->i(Landroid/graphics/Rect;III)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_1
    instance-of p2, p4, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    .line 37
    .line 38
    if-eqz p2, :cond_2

    .line 39
    .line 40
    iget p2, p0, Lcom/yanzhenjie/recyclerview/widget/DefaultItemDecoration;->a:I

    .line 41
    .line 42
    iget p3, p0, Lcom/yanzhenjie/recyclerview/widget/DefaultItemDecoration;->b:I

    .line 43
    .line 44
    invoke-virtual {p1, p2, p3, p2, p3}, Landroid/graphics/Rect;->set(IIII)V

    .line 45
    .line 46
    .line 47
    :cond_2
    return-void
.end method

.method public final h(IIII)Z
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    if-ne p1, v1, :cond_6

    .line 4
    .line 5
    if-ne p3, v1, :cond_1

    .line 6
    .line 7
    add-int/2addr p2, v1

    .line 8
    if-ne p2, p4, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    return v0

    .line 12
    :cond_1
    rem-int p1, p4, p3

    .line 13
    .line 14
    sub-int/2addr p4, p1

    .line 15
    div-int/2addr p4, p3

    .line 16
    if-lez p1, :cond_2

    .line 17
    .line 18
    move p1, v1

    .line 19
    goto :goto_0

    .line 20
    :cond_2
    move p1, v0

    .line 21
    :goto_0
    add-int/2addr p4, p1

    .line 22
    add-int/2addr p2, v1

    .line 23
    rem-int p1, p2, p3

    .line 24
    .line 25
    if-nez p1, :cond_4

    .line 26
    .line 27
    div-int/2addr p2, p3

    .line 28
    if-ne p4, p2, :cond_3

    .line 29
    .line 30
    return v1

    .line 31
    :cond_3
    return v0

    .line 32
    :cond_4
    sub-int/2addr p2, p1

    .line 33
    div-int/2addr p2, p3

    .line 34
    add-int/2addr p2, v1

    .line 35
    if-ne p4, p2, :cond_5

    .line 36
    .line 37
    return v1

    .line 38
    :cond_5
    return v0

    .line 39
    :cond_6
    if-ne p3, v1, :cond_7

    .line 40
    .line 41
    return v1

    .line 42
    :cond_7
    add-int/2addr p2, v1

    .line 43
    rem-int/2addr p2, p3

    .line 44
    if-nez p2, :cond_8

    .line 45
    .line 46
    return v1

    .line 47
    :cond_8
    return v0
.end method

.method public final i(Landroid/graphics/Rect;III)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0, p2, p3, p4}, Lcom/yanzhenjie/recyclerview/widget/DefaultItemDecoration;->f(IIII)Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    invoke-virtual {p0, v0, p2, p3, p4}, Lcom/yanzhenjie/recyclerview/widget/DefaultItemDecoration;->h(IIII)Z

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    invoke-virtual {p0, v0, p2, p3, p4}, Lcom/yanzhenjie/recyclerview/widget/DefaultItemDecoration;->e(IIII)Z

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    invoke-virtual {p0, v0, p2, p3, p4}, Lcom/yanzhenjie/recyclerview/widget/DefaultItemDecoration;->g(IIII)Z

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    const/4 p4, 0x1

    .line 19
    if-ne p3, p4, :cond_3

    .line 20
    .line 21
    if-eqz v3, :cond_0

    .line 22
    .line 23
    if-eqz p2, :cond_0

    .line 24
    .line 25
    invoke-virtual {p1, v0, v0, v0, v0}, Landroid/graphics/Rect;->set(IIII)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    if-eqz v3, :cond_1

    .line 30
    .line 31
    iget p2, p0, Lcom/yanzhenjie/recyclerview/widget/DefaultItemDecoration;->a:I

    .line 32
    .line 33
    invoke-virtual {p1, v0, v0, p2, v0}, Landroid/graphics/Rect;->set(IIII)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_1
    if-eqz p2, :cond_2

    .line 38
    .line 39
    iget p2, p0, Lcom/yanzhenjie/recyclerview/widget/DefaultItemDecoration;->a:I

    .line 40
    .line 41
    invoke-virtual {p1, p2, v0, v0, v0}, Landroid/graphics/Rect;->set(IIII)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_2
    iget p2, p0, Lcom/yanzhenjie/recyclerview/widget/DefaultItemDecoration;->a:I

    .line 46
    .line 47
    invoke-virtual {p1, p2, v0, p2, v0}, Landroid/graphics/Rect;->set(IIII)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_3
    if-eqz v3, :cond_4

    .line 52
    .line 53
    if-eqz v1, :cond_4

    .line 54
    .line 55
    iget p2, p0, Lcom/yanzhenjie/recyclerview/widget/DefaultItemDecoration;->a:I

    .line 56
    .line 57
    iget p3, p0, Lcom/yanzhenjie/recyclerview/widget/DefaultItemDecoration;->b:I

    .line 58
    .line 59
    invoke-virtual {p1, v0, v0, p2, p3}, Landroid/graphics/Rect;->set(IIII)V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :cond_4
    if-eqz v3, :cond_5

    .line 64
    .line 65
    if-eqz v2, :cond_5

    .line 66
    .line 67
    iget p2, p0, Lcom/yanzhenjie/recyclerview/widget/DefaultItemDecoration;->b:I

    .line 68
    .line 69
    iget p3, p0, Lcom/yanzhenjie/recyclerview/widget/DefaultItemDecoration;->a:I

    .line 70
    .line 71
    invoke-virtual {p1, v0, p2, p3, v0}, Landroid/graphics/Rect;->set(IIII)V

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :cond_5
    if-eqz p2, :cond_6

    .line 76
    .line 77
    if-eqz v1, :cond_6

    .line 78
    .line 79
    iget p2, p0, Lcom/yanzhenjie/recyclerview/widget/DefaultItemDecoration;->a:I

    .line 80
    .line 81
    iget p3, p0, Lcom/yanzhenjie/recyclerview/widget/DefaultItemDecoration;->b:I

    .line 82
    .line 83
    invoke-virtual {p1, p2, v0, v0, p3}, Landroid/graphics/Rect;->set(IIII)V

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :cond_6
    if-eqz p2, :cond_7

    .line 88
    .line 89
    if-eqz v2, :cond_7

    .line 90
    .line 91
    iget p2, p0, Lcom/yanzhenjie/recyclerview/widget/DefaultItemDecoration;->a:I

    .line 92
    .line 93
    iget p3, p0, Lcom/yanzhenjie/recyclerview/widget/DefaultItemDecoration;->b:I

    .line 94
    .line 95
    invoke-virtual {p1, p2, p3, v0, v0}, Landroid/graphics/Rect;->set(IIII)V

    .line 96
    .line 97
    .line 98
    return-void

    .line 99
    :cond_7
    if-eqz v3, :cond_8

    .line 100
    .line 101
    iget p2, p0, Lcom/yanzhenjie/recyclerview/widget/DefaultItemDecoration;->b:I

    .line 102
    .line 103
    iget p3, p0, Lcom/yanzhenjie/recyclerview/widget/DefaultItemDecoration;->a:I

    .line 104
    .line 105
    invoke-virtual {p1, v0, p2, p3, p2}, Landroid/graphics/Rect;->set(IIII)V

    .line 106
    .line 107
    .line 108
    return-void

    .line 109
    :cond_8
    if-eqz p2, :cond_9

    .line 110
    .line 111
    iget p2, p0, Lcom/yanzhenjie/recyclerview/widget/DefaultItemDecoration;->a:I

    .line 112
    .line 113
    iget p3, p0, Lcom/yanzhenjie/recyclerview/widget/DefaultItemDecoration;->b:I

    .line 114
    .line 115
    invoke-virtual {p1, p2, p3, v0, p3}, Landroid/graphics/Rect;->set(IIII)V

    .line 116
    .line 117
    .line 118
    return-void

    .line 119
    :cond_9
    if-eqz v1, :cond_a

    .line 120
    .line 121
    iget p2, p0, Lcom/yanzhenjie/recyclerview/widget/DefaultItemDecoration;->a:I

    .line 122
    .line 123
    iget p3, p0, Lcom/yanzhenjie/recyclerview/widget/DefaultItemDecoration;->b:I

    .line 124
    .line 125
    invoke-virtual {p1, p2, v0, p2, p3}, Landroid/graphics/Rect;->set(IIII)V

    .line 126
    .line 127
    .line 128
    return-void

    .line 129
    :cond_a
    if-eqz v2, :cond_b

    .line 130
    .line 131
    iget p2, p0, Lcom/yanzhenjie/recyclerview/widget/DefaultItemDecoration;->a:I

    .line 132
    .line 133
    iget p3, p0, Lcom/yanzhenjie/recyclerview/widget/DefaultItemDecoration;->b:I

    .line 134
    .line 135
    invoke-virtual {p1, p2, p3, p2, v0}, Landroid/graphics/Rect;->set(IIII)V

    .line 136
    .line 137
    .line 138
    return-void

    .line 139
    :cond_b
    iget p2, p0, Lcom/yanzhenjie/recyclerview/widget/DefaultItemDecoration;->a:I

    .line 140
    .line 141
    iget p3, p0, Lcom/yanzhenjie/recyclerview/widget/DefaultItemDecoration;->b:I

    .line 142
    .line 143
    invoke-virtual {p1, p2, p3, p2, p3}, Landroid/graphics/Rect;->set(IIII)V

    .line 144
    .line 145
    .line 146
    return-void
.end method

.method public final j(Landroid/graphics/Rect;III)V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0, p2, p3, p4}, Lcom/yanzhenjie/recyclerview/widget/DefaultItemDecoration;->f(IIII)Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    invoke-virtual {p0, v0, p2, p3, p4}, Lcom/yanzhenjie/recyclerview/widget/DefaultItemDecoration;->h(IIII)Z

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    invoke-virtual {p0, v0, p2, p3, p4}, Lcom/yanzhenjie/recyclerview/widget/DefaultItemDecoration;->e(IIII)Z

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    invoke-virtual {p0, v0, p2, p3, p4}, Lcom/yanzhenjie/recyclerview/widget/DefaultItemDecoration;->g(IIII)Z

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    const/4 p4, 0x0

    .line 19
    if-ne p3, v0, :cond_3

    .line 20
    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    invoke-virtual {p1, p4, p4, p4, p4}, Landroid/graphics/Rect;->set(IIII)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    if-eqz v1, :cond_1

    .line 30
    .line 31
    iget p2, p0, Lcom/yanzhenjie/recyclerview/widget/DefaultItemDecoration;->b:I

    .line 32
    .line 33
    invoke-virtual {p1, p4, p4, p4, p2}, Landroid/graphics/Rect;->set(IIII)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_1
    if-eqz v2, :cond_2

    .line 38
    .line 39
    iget p2, p0, Lcom/yanzhenjie/recyclerview/widget/DefaultItemDecoration;->b:I

    .line 40
    .line 41
    invoke-virtual {p1, p4, p2, p4, p4}, Landroid/graphics/Rect;->set(IIII)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_2
    iget p2, p0, Lcom/yanzhenjie/recyclerview/widget/DefaultItemDecoration;->b:I

    .line 46
    .line 47
    invoke-virtual {p1, p4, p2, p4, p2}, Landroid/graphics/Rect;->set(IIII)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_3
    if-eqz v1, :cond_4

    .line 52
    .line 53
    if-eqz v3, :cond_4

    .line 54
    .line 55
    iget p2, p0, Lcom/yanzhenjie/recyclerview/widget/DefaultItemDecoration;->a:I

    .line 56
    .line 57
    iget p3, p0, Lcom/yanzhenjie/recyclerview/widget/DefaultItemDecoration;->b:I

    .line 58
    .line 59
    invoke-virtual {p1, p4, p4, p2, p3}, Landroid/graphics/Rect;->set(IIII)V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :cond_4
    if-eqz v1, :cond_5

    .line 64
    .line 65
    if-eqz p2, :cond_5

    .line 66
    .line 67
    iget p2, p0, Lcom/yanzhenjie/recyclerview/widget/DefaultItemDecoration;->a:I

    .line 68
    .line 69
    iget p3, p0, Lcom/yanzhenjie/recyclerview/widget/DefaultItemDecoration;->b:I

    .line 70
    .line 71
    invoke-virtual {p1, p2, p4, p4, p3}, Landroid/graphics/Rect;->set(IIII)V

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :cond_5
    if-eqz v2, :cond_6

    .line 76
    .line 77
    if-eqz v3, :cond_6

    .line 78
    .line 79
    iget p2, p0, Lcom/yanzhenjie/recyclerview/widget/DefaultItemDecoration;->b:I

    .line 80
    .line 81
    iget p3, p0, Lcom/yanzhenjie/recyclerview/widget/DefaultItemDecoration;->a:I

    .line 82
    .line 83
    invoke-virtual {p1, p4, p2, p3, p4}, Landroid/graphics/Rect;->set(IIII)V

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :cond_6
    if-eqz v2, :cond_7

    .line 88
    .line 89
    if-eqz p2, :cond_7

    .line 90
    .line 91
    iget p2, p0, Lcom/yanzhenjie/recyclerview/widget/DefaultItemDecoration;->a:I

    .line 92
    .line 93
    iget p3, p0, Lcom/yanzhenjie/recyclerview/widget/DefaultItemDecoration;->b:I

    .line 94
    .line 95
    invoke-virtual {p1, p2, p3, p4, p4}, Landroid/graphics/Rect;->set(IIII)V

    .line 96
    .line 97
    .line 98
    return-void

    .line 99
    :cond_7
    if-eqz v1, :cond_8

    .line 100
    .line 101
    iget p2, p0, Lcom/yanzhenjie/recyclerview/widget/DefaultItemDecoration;->a:I

    .line 102
    .line 103
    iget p3, p0, Lcom/yanzhenjie/recyclerview/widget/DefaultItemDecoration;->b:I

    .line 104
    .line 105
    invoke-virtual {p1, p2, p4, p2, p3}, Landroid/graphics/Rect;->set(IIII)V

    .line 106
    .line 107
    .line 108
    return-void

    .line 109
    :cond_8
    if-eqz v2, :cond_9

    .line 110
    .line 111
    iget p2, p0, Lcom/yanzhenjie/recyclerview/widget/DefaultItemDecoration;->a:I

    .line 112
    .line 113
    iget p3, p0, Lcom/yanzhenjie/recyclerview/widget/DefaultItemDecoration;->b:I

    .line 114
    .line 115
    invoke-virtual {p1, p2, p3, p2, p4}, Landroid/graphics/Rect;->set(IIII)V

    .line 116
    .line 117
    .line 118
    return-void

    .line 119
    :cond_9
    if-eqz v3, :cond_a

    .line 120
    .line 121
    iget p2, p0, Lcom/yanzhenjie/recyclerview/widget/DefaultItemDecoration;->b:I

    .line 122
    .line 123
    iget p3, p0, Lcom/yanzhenjie/recyclerview/widget/DefaultItemDecoration;->a:I

    .line 124
    .line 125
    invoke-virtual {p1, p4, p2, p3, p2}, Landroid/graphics/Rect;->set(IIII)V

    .line 126
    .line 127
    .line 128
    return-void

    .line 129
    :cond_a
    if-eqz p2, :cond_b

    .line 130
    .line 131
    iget p2, p0, Lcom/yanzhenjie/recyclerview/widget/DefaultItemDecoration;->a:I

    .line 132
    .line 133
    iget p3, p0, Lcom/yanzhenjie/recyclerview/widget/DefaultItemDecoration;->b:I

    .line 134
    .line 135
    invoke-virtual {p1, p2, p3, p4, p3}, Landroid/graphics/Rect;->set(IIII)V

    .line 136
    .line 137
    .line 138
    return-void

    .line 139
    :cond_b
    iget p2, p0, Lcom/yanzhenjie/recyclerview/widget/DefaultItemDecoration;->a:I

    .line 140
    .line 141
    iget p3, p0, Lcom/yanzhenjie/recyclerview/widget/DefaultItemDecoration;->b:I

    .line 142
    .line 143
    invoke-virtual {p1, p2, p3, p2, p3}, Landroid/graphics/Rect;->set(IIII)V

    .line 144
    .line 145
    .line 146
    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$State;)V
    .locals 8

    .line 1
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    .line 2
    .line 3
    .line 4
    move-result-object p3

    .line 5
    invoke-virtual {p0, p3}, Lcom/yanzhenjie/recyclerview/widget/DefaultItemDecoration;->c(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-virtual {p0, p3}, Lcom/yanzhenjie/recyclerview/widget/DefaultItemDecoration;->d(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)I

    .line 10
    .line 11
    .line 12
    move-result v5

    .line 13
    invoke-virtual {p3}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getChildCount()I

    .line 14
    .line 15
    .line 16
    move-result v6

    .line 17
    instance-of v1, p3, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    if-eqz v1, :cond_2

    .line 21
    .line 22
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 23
    .line 24
    .line 25
    move v7, v2

    .line 26
    :goto_0
    if-ge v7, v6, :cond_1

    .line 27
    .line 28
    invoke-virtual {p3, v7}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getChildAt(I)Landroid/view/View;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    invoke-virtual {p2, v3}, Landroidx/recyclerview/widget/RecyclerView;->getChildLayoutPosition(Landroid/view/View;)I

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    const/4 v1, 0x1

    .line 37
    if-ne v0, v1, :cond_0

    .line 38
    .line 39
    move-object v1, p0

    .line 40
    move-object v2, p1

    .line 41
    invoke-virtual/range {v1 .. v6}, Lcom/yanzhenjie/recyclerview/widget/DefaultItemDecoration;->b(Landroid/graphics/Canvas;Landroid/view/View;III)V

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_0
    move-object v1, p0

    .line 46
    move-object v2, p1

    .line 47
    invoke-virtual/range {v1 .. v6}, Lcom/yanzhenjie/recyclerview/widget/DefaultItemDecoration;->a(Landroid/graphics/Canvas;Landroid/view/View;III)V

    .line 48
    .line 49
    .line 50
    :goto_1
    add-int/lit8 v7, v7, 0x1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :cond_2
    instance-of p2, p3, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    .line 58
    .line 59
    if-eqz p2, :cond_4

    .line 60
    .line 61
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 62
    .line 63
    .line 64
    if-gtz v6, :cond_3

    .line 65
    .line 66
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :cond_3
    invoke-virtual {p3, v2}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getChildAt(I)Landroid/view/View;

    .line 71
    .line 72
    .line 73
    const/4 p1, 0x0

    .line 74
    throw p1

    .line 75
    :cond_4
    return-void
.end method
