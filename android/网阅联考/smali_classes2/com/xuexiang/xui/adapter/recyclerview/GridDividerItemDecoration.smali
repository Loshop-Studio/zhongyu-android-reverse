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
    move v1, v2

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
    move v1, v2

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
    move v1, v2

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
    goto :goto_0

    .line 48
    :cond_0
    invoke-virtual {p1, p2, v0, v1, v2}, Landroid/graphics/Rect;->set(IIII)V

    .line 49
    .line 50
    .line 51
    goto :goto_0

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
    goto :goto_0

    .line 65
    :cond_2
    iget p2, p0, Lcom/xuexiang/xui/adapter/recyclerview/GridDividerItemDecoration;->c:I

    .line 66
    .line 67
    invoke-virtual {p1, v0, v0, v0, p2}, Landroid/graphics/Rect;->set(IIII)V

    .line 68
    .line 69
    .line 70
    :goto_0
    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$State;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v7, p1

    .line 4
    .line 5
    move-object/from16 v8, p2

    .line 6
    .line 7
    invoke-super/range {p0 .. p3}, Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;->onDraw(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$State;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual/range {p2 .. p2}, Landroid/view/ViewGroup;->getChildCount()I

    .line 11
    .line 12
    .line 13
    move-result v9

    .line 14
    const/4 v1, 0x0

    .line 15
    move v10, v1

    .line 16
    :goto_0
    if-ge v10, v9, :cond_5

    .line 17
    .line 18
    invoke-virtual {v8, v10}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object v11

    .line 22
    invoke-virtual {v8, v11}, Landroidx/recyclerview/widget/RecyclerView;->getChildLayoutPosition(Landroid/view/View;)I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    add-int/lit8 v1, v1, 0x1

    .line 27
    .line 28
    rem-int/lit8 v1, v1, 0x3

    .line 29
    .line 30
    if-nez v1, :cond_0

    .line 31
    .line 32
    iget v1, v0, Lcom/xuexiang/xui/adapter/recyclerview/GridDividerItemDecoration;->b:I

    .line 33
    .line 34
    :cond_0
    move v12, v1

    .line 35
    invoke-virtual {v11}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    check-cast v1, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    .line 40
    .line 41
    invoke-virtual {v11}, Landroid/view/View;->getBottom()I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    iget v3, v1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 46
    .line 47
    add-int/2addr v2, v3

    .line 48
    invoke-static {v11}, Landroidx/core/view/ViewCompat;->getTranslationY(Landroid/view/View;)F

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    add-int/2addr v2, v3

    .line 57
    iget v3, v0, Lcom/xuexiang/xui/adapter/recyclerview/GridDividerItemDecoration;->c:I

    .line 58
    .line 59
    add-int v13, v2, v3

    .line 60
    .line 61
    invoke-virtual {v11}, Landroid/view/View;->getRight()I

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    iget v1, v1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 66
    .line 67
    add-int/2addr v3, v1

    .line 68
    invoke-static {v11}, Landroidx/core/view/ViewCompat;->getTranslationX(Landroid/view/View;)F

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    add-int v14, v3, v1

    .line 77
    .line 78
    iget v1, v0, Lcom/xuexiang/xui/adapter/recyclerview/GridDividerItemDecoration;->c:I

    .line 79
    .line 80
    add-int v15, v14, v1

    .line 81
    .line 82
    iget-object v1, v0, Lcom/xuexiang/xui/adapter/recyclerview/GridDividerItemDecoration;->d:Landroid/graphics/Paint;

    .line 83
    .line 84
    if-eqz v1, :cond_1

    .line 85
    .line 86
    iget-object v1, v0, Lcom/xuexiang/xui/adapter/recyclerview/GridDividerItemDecoration;->a:Landroid/graphics/drawable/Drawable;

    .line 87
    .line 88
    invoke-virtual {v11}, Landroid/view/View;->getLeft()I

    .line 89
    .line 90
    .line 91
    move-result v3

    .line 92
    invoke-virtual {v1, v3, v2, v15, v13}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 93
    .line 94
    .line 95
    iget-object v1, v0, Lcom/xuexiang/xui/adapter/recyclerview/GridDividerItemDecoration;->a:Landroid/graphics/drawable/Drawable;

    .line 96
    .line 97
    invoke-virtual {v1, v7}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 98
    .line 99
    .line 100
    :cond_1
    iget-object v1, v0, Lcom/xuexiang/xui/adapter/recyclerview/GridDividerItemDecoration;->d:Landroid/graphics/Paint;

    .line 101
    .line 102
    if-eqz v1, :cond_2

    .line 103
    .line 104
    invoke-virtual {v11}, Landroid/view/View;->getLeft()I

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    int-to-float v3, v1

    .line 109
    int-to-float v4, v2

    .line 110
    int-to-float v5, v15

    .line 111
    int-to-float v6, v13

    .line 112
    iget-object v2, v0, Lcom/xuexiang/xui/adapter/recyclerview/GridDividerItemDecoration;->d:Landroid/graphics/Paint;

    .line 113
    .line 114
    move-object/from16 v1, p1

    .line 115
    .line 116
    move-object/from16 v16, v2

    .line 117
    .line 118
    move v2, v3

    .line 119
    move v3, v4

    .line 120
    move v4, v5

    .line 121
    move v5, v6

    .line 122
    move-object/from16 v6, v16

    .line 123
    .line 124
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 125
    .line 126
    .line 127
    :cond_2
    iget v1, v0, Lcom/xuexiang/xui/adapter/recyclerview/GridDividerItemDecoration;->b:I

    .line 128
    .line 129
    if-ge v12, v1, :cond_4

    .line 130
    .line 131
    iget-object v1, v0, Lcom/xuexiang/xui/adapter/recyclerview/GridDividerItemDecoration;->d:Landroid/graphics/Paint;

    .line 132
    .line 133
    if-eqz v1, :cond_3

    .line 134
    .line 135
    iget-object v1, v0, Lcom/xuexiang/xui/adapter/recyclerview/GridDividerItemDecoration;->a:Landroid/graphics/drawable/Drawable;

    .line 136
    .line 137
    invoke-virtual {v11}, Landroid/view/View;->getTop()I

    .line 138
    .line 139
    .line 140
    move-result v2

    .line 141
    invoke-virtual {v1, v14, v2, v15, v13}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 142
    .line 143
    .line 144
    iget-object v1, v0, Lcom/xuexiang/xui/adapter/recyclerview/GridDividerItemDecoration;->a:Landroid/graphics/drawable/Drawable;

    .line 145
    .line 146
    invoke-virtual {v1, v7}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 147
    .line 148
    .line 149
    :cond_3
    iget-object v1, v0, Lcom/xuexiang/xui/adapter/recyclerview/GridDividerItemDecoration;->d:Landroid/graphics/Paint;

    .line 150
    .line 151
    if-eqz v1, :cond_4

    .line 152
    .line 153
    int-to-float v2, v14

    .line 154
    invoke-virtual {v11}, Landroid/view/View;->getTop()I

    .line 155
    .line 156
    .line 157
    move-result v1

    .line 158
    int-to-float v3, v1

    .line 159
    int-to-float v4, v15

    .line 160
    int-to-float v5, v13

    .line 161
    iget-object v6, v0, Lcom/xuexiang/xui/adapter/recyclerview/GridDividerItemDecoration;->d:Landroid/graphics/Paint;

    .line 162
    .line 163
    move-object/from16 v1, p1

    .line 164
    .line 165
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 166
    .line 167
    .line 168
    :cond_4
    add-int/lit8 v10, v10, 0x1

    .line 169
    .line 170
    goto/16 :goto_0

    .line 171
    .line 172
    :cond_5
    return-void
.end method
