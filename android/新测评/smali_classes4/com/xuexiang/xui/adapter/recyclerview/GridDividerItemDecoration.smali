.class public Lcom/xuexiang/xui/adapter/recyclerview/GridDividerItemDecoration;
.super Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;
.source "SourceFile"


# static fields
.field public static final e:[I


# instance fields
.field public a:Landroid/graphics/drawable/Drawable;

.field public b:I

.field public c:I

.field public d:Landroid/graphics/Paint;


# direct methods
.method static constructor <clinit>()V
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
    sput-object v0, Lcom/xuexiang/xui/adapter/recyclerview/GridDividerItemDecoration;->e:[I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(Landroidx/recyclerview/widget/RecyclerView;III)Z
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    instance-of v0, p1, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    const/4 v2, 0x1

    .line 9
    if-eqz v0, :cond_2

    .line 10
    .line 11
    rem-int p1, p4, p3

    .line 12
    .line 13
    div-int/2addr p4, p3

    .line 14
    if-nez p1, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    add-int/2addr p4, v2

    .line 18
    :goto_0
    div-int/2addr p2, p3

    .line 19
    add-int/2addr p2, v2

    .line 20
    if-ne p4, p2, :cond_1

    .line 21
    .line 22
    return v2

    .line 23
    :cond_1
    return v1

    .line 24
    :cond_2
    instance-of v0, p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    .line 25
    .line 26
    if-eqz v0, :cond_5

    .line 27
    .line 28
    check-cast p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    .line 29
    .line 30
    invoke-virtual {p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->getOrientation()I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-ne p1, v2, :cond_4

    .line 35
    .line 36
    rem-int p1, p4, p3

    .line 37
    .line 38
    sub-int/2addr p4, p1

    .line 39
    if-lt p2, p4, :cond_3

    .line 40
    .line 41
    return v2

    .line 42
    :cond_3
    return v1

    .line 43
    :cond_4
    add-int/2addr p2, v2

    .line 44
    rem-int/2addr p2, p3

    .line 45
    if-nez p2, :cond_5

    .line 46
    .line 47
    return v2

    .line 48
    :cond_5
    return v1
.end method

.method public getItemOffsets(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$State;)V
    .locals 4

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;->getItemOffsets(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$State;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3, p2}, Landroidx/recyclerview/widget/RecyclerView;->getChildLayoutPosition(Landroid/view/View;)I

    .line 5
    .line 6
    .line 7
    move-result p2

    .line 8
    invoke-virtual {p3}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    .line 9
    .line 10
    .line 11
    move-result-object p4

    .line 12
    const/4 v0, 0x0

    .line 13
    if-eqz p4, :cond_1

    .line 14
    .line 15
    invoke-virtual {p3}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    .line 16
    .line 17
    .line 18
    move-result-object p4

    .line 19
    invoke-virtual {p4}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->getItemCount()I

    .line 20
    .line 21
    .line 22
    move-result p4

    .line 23
    iget v1, p0, Lcom/xuexiang/xui/adapter/recyclerview/GridDividerItemDecoration;->b:I

    .line 24
    .line 25
    invoke-virtual {p0, p3, p2, v1, p4}, Lcom/xuexiang/xui/adapter/recyclerview/GridDividerItemDecoration;->a(Landroidx/recyclerview/widget/RecyclerView;III)Z

    .line 26
    .line 27
    .line 28
    move-result p3

    .line 29
    iget p4, p0, Lcom/xuexiang/xui/adapter/recyclerview/GridDividerItemDecoration;->b:I

    .line 30
    .line 31
    add-int/lit8 v1, p4, -0x1

    .line 32
    .line 33
    iget v2, p0, Lcom/xuexiang/xui/adapter/recyclerview/GridDividerItemDecoration;->c:I

    .line 34
    .line 35
    mul-int/2addr v1, v2

    .line 36
    div-int/2addr v1, p4

    .line 37
    sub-int v3, v2, v1

    .line 38
    .line 39
    rem-int/2addr p2, p4

    .line 40
    mul-int/2addr p2, v3

    .line 41
    sub-int/2addr v1, p2

    .line 42
    if-eqz p3, :cond_0

    .line 43
    .line 44
    invoke-virtual {p1, p2, v0, v1, v0}, Landroid/graphics/Rect;->set(IIII)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :cond_0
    invoke-virtual {p1, p2, v0, v1, v2}, Landroid/graphics/Rect;->set(IIII)V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :cond_1
    add-int/lit8 p2, p2, 0x1

    .line 53
    .line 54
    iget p3, p0, Lcom/xuexiang/xui/adapter/recyclerview/GridDividerItemDecoration;->b:I

    .line 55
    .line 56
    rem-int/2addr p2, p3

    .line 57
    if-lez p2, :cond_2

    .line 58
    .line 59
    iget p2, p0, Lcom/xuexiang/xui/adapter/recyclerview/GridDividerItemDecoration;->c:I

    .line 60
    .line 61
    invoke-virtual {p1, v0, v0, p2, p2}, Landroid/graphics/Rect;->set(IIII)V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :cond_2
    iget p2, p0, Lcom/xuexiang/xui/adapter/recyclerview/GridDividerItemDecoration;->c:I

    .line 66
    .line 67
    invoke-virtual {p1, v0, v0, v0, p2}, Landroid/graphics/Rect;->set(IIII)V

    .line 68
    .line 69
    .line 70
    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$State;)V
    .locals 14

    .line 1
    move-object/from16 v6, p2

    .line 2
    .line 3
    invoke-super/range {p0 .. p3}, Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;->onDraw(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$State;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v6}, Landroid/view/ViewGroup;->getChildCount()I

    .line 7
    .line 8
    .line 9
    move-result v7

    .line 10
    const/4 v0, 0x0

    .line 11
    move v8, v0

    .line 12
    :goto_0
    if-ge v8, v7, :cond_5

    .line 13
    .line 14
    invoke-virtual {v6, v8}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 15
    .line 16
    .line 17
    move-result-object v9

    .line 18
    invoke-virtual {v6, v9}, Landroidx/recyclerview/widget/RecyclerView;->getChildLayoutPosition(Landroid/view/View;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    add-int/lit8 v0, v0, 0x1

    .line 23
    .line 24
    iget v1, p0, Lcom/xuexiang/xui/adapter/recyclerview/GridDividerItemDecoration;->b:I

    .line 25
    .line 26
    rem-int/2addr v0, v1

    .line 27
    if-nez v0, :cond_0

    .line 28
    .line 29
    move v10, v1

    .line 30
    goto :goto_1

    .line 31
    :cond_0
    move v10, v0

    .line 32
    :goto_1
    invoke-virtual {v9}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    .line 37
    .line 38
    invoke-virtual {v9}, Landroid/view/View;->getBottom()I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    iget v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 43
    .line 44
    add-int/2addr v1, v2

    .line 45
    invoke-static {v9}, Landroidx/core/view/ViewCompat;->getTranslationY(Landroid/view/View;)F

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    add-int/2addr v1, v2

    .line 54
    iget v2, p0, Lcom/xuexiang/xui/adapter/recyclerview/GridDividerItemDecoration;->c:I

    .line 55
    .line 56
    add-int v11, v1, v2

    .line 57
    .line 58
    invoke-virtual {v9}, Landroid/view/View;->getRight()I

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 63
    .line 64
    add-int/2addr v2, v0

    .line 65
    invoke-static {v9}, Landroidx/core/view/ViewCompat;->getTranslationX(Landroid/view/View;)F

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    add-int v12, v2, v0

    .line 74
    .line 75
    iget v0, p0, Lcom/xuexiang/xui/adapter/recyclerview/GridDividerItemDecoration;->c:I

    .line 76
    .line 77
    add-int v13, v12, v0

    .line 78
    .line 79
    iget-object v0, p0, Lcom/xuexiang/xui/adapter/recyclerview/GridDividerItemDecoration;->d:Landroid/graphics/Paint;

    .line 80
    .line 81
    if-eqz v0, :cond_1

    .line 82
    .line 83
    invoke-virtual {v9}, Landroid/view/View;->getLeft()I

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    int-to-float v0, v0

    .line 88
    int-to-float v2, v1

    .line 89
    int-to-float v3, v13

    .line 90
    int-to-float v4, v11

    .line 91
    iget-object v5, p0, Lcom/xuexiang/xui/adapter/recyclerview/GridDividerItemDecoration;->d:Landroid/graphics/Paint;

    .line 92
    .line 93
    move v1, v0

    .line 94
    move-object v0, p1

    .line 95
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 96
    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_1
    move-object v0, p1

    .line 100
    iget-object v2, p0, Lcom/xuexiang/xui/adapter/recyclerview/GridDividerItemDecoration;->a:Landroid/graphics/drawable/Drawable;

    .line 101
    .line 102
    if-eqz v2, :cond_2

    .line 103
    .line 104
    invoke-virtual {v9}, Landroid/view/View;->getLeft()I

    .line 105
    .line 106
    .line 107
    move-result v3

    .line 108
    invoke-virtual {v2, v3, v1, v13, v11}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 109
    .line 110
    .line 111
    iget-object v1, p0, Lcom/xuexiang/xui/adapter/recyclerview/GridDividerItemDecoration;->a:Landroid/graphics/drawable/Drawable;

    .line 112
    .line 113
    invoke-virtual {v1, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 114
    .line 115
    .line 116
    :cond_2
    :goto_2
    iget v1, p0, Lcom/xuexiang/xui/adapter/recyclerview/GridDividerItemDecoration;->b:I

    .line 117
    .line 118
    if-ge v10, v1, :cond_4

    .line 119
    .line 120
    iget-object v1, p0, Lcom/xuexiang/xui/adapter/recyclerview/GridDividerItemDecoration;->d:Landroid/graphics/Paint;

    .line 121
    .line 122
    if-eqz v1, :cond_3

    .line 123
    .line 124
    int-to-float v1, v12

    .line 125
    invoke-virtual {v9}, Landroid/view/View;->getTop()I

    .line 126
    .line 127
    .line 128
    move-result v2

    .line 129
    int-to-float v2, v2

    .line 130
    int-to-float v3, v13

    .line 131
    int-to-float v4, v11

    .line 132
    iget-object v5, p0, Lcom/xuexiang/xui/adapter/recyclerview/GridDividerItemDecoration;->d:Landroid/graphics/Paint;

    .line 133
    .line 134
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 135
    .line 136
    .line 137
    goto :goto_3

    .line 138
    :cond_3
    iget-object v1, p0, Lcom/xuexiang/xui/adapter/recyclerview/GridDividerItemDecoration;->a:Landroid/graphics/drawable/Drawable;

    .line 139
    .line 140
    if-eqz v1, :cond_4

    .line 141
    .line 142
    invoke-virtual {v9}, Landroid/view/View;->getTop()I

    .line 143
    .line 144
    .line 145
    move-result v2

    .line 146
    invoke-virtual {v1, v12, v2, v13, v11}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 147
    .line 148
    .line 149
    iget-object v1, p0, Lcom/xuexiang/xui/adapter/recyclerview/GridDividerItemDecoration;->a:Landroid/graphics/drawable/Drawable;

    .line 150
    .line 151
    invoke-virtual {v1, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 152
    .line 153
    .line 154
    :cond_4
    :goto_3
    add-int/lit8 v8, v8, 0x1

    .line 155
    .line 156
    goto/16 :goto_0

    .line 157
    .line 158
    :cond_5
    return-void
.end method
