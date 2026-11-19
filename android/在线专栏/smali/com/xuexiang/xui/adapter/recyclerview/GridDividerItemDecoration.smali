.class public Lcom/xuexiang/xui/adapter/recyclerview/GridDividerItemDecoration;
.super Landroidx/recyclerview/widget/RecyclerView$n;
.source "SourceFile"


# static fields
.field private static final ATTRS:[I


# instance fields
.field private mDivider:Landroid/graphics/drawable/Drawable;

.field private mDividerWidth:I

.field private mPaint:Landroid/graphics/Paint;

.field private mSpanCount:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [I

    const/4 v1, 0x0

    const v2, 0x1010214

    aput v2, v0, v1

    sput-object v0, Lcom/xuexiang/xui/adapter/recyclerview/GridDividerItemDecoration;->ATTRS:[I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$n;-><init>()V

    .line 2
    iput p2, p0, Lcom/xuexiang/xui/adapter/recyclerview/GridDividerItemDecoration;->mSpanCount:I

    .line 3
    sget-object p2, Lcom/xuexiang/xui/adapter/recyclerview/GridDividerItemDecoration;->ATTRS:[I

    invoke-virtual {p1, p2}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object p1

    const/4 p2, 0x0

    .line 4
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    iput-object p2, p0, Lcom/xuexiang/xui/adapter/recyclerview/GridDividerItemDecoration;->mDivider:Landroid/graphics/drawable/Drawable;

    .line 5
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 6
    iget-object p1, p0, Lcom/xuexiang/xui/adapter/recyclerview/GridDividerItemDecoration;->mDivider:Landroid/graphics/drawable/Drawable;

    if-eqz p1, :cond_0

    .line 7
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/adapter/recyclerview/GridDividerItemDecoration;->mDividerWidth:I

    goto :goto_0

    :cond_0
    const/high16 p1, 0x3f800000    # 1.0f

    .line 8
    invoke-static {p1}, Lcom/xuexiang/xui/utils/DensityUtils;->dp2px(F)I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/adapter/recyclerview/GridDividerItemDecoration;->mDividerWidth:I

    :goto_0
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;II)V
    .locals 0

    .line 9
    invoke-direct {p0, p1, p2}, Lcom/xuexiang/xui/adapter/recyclerview/GridDividerItemDecoration;-><init>(Landroid/content/Context;I)V

    .line 10
    iput p3, p0, Lcom/xuexiang/xui/adapter/recyclerview/GridDividerItemDecoration;->mDividerWidth:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;III)V
    .locals 0

    .line 11
    invoke-direct {p0, p1, p2}, Lcom/xuexiang/xui/adapter/recyclerview/GridDividerItemDecoration;-><init>(Landroid/content/Context;I)V

    .line 12
    iput p3, p0, Lcom/xuexiang/xui/adapter/recyclerview/GridDividerItemDecoration;->mDividerWidth:I

    .line 13
    new-instance p1, Landroid/graphics/Paint;

    const/4 p2, 0x1

    invoke-direct {p1, p2}, Landroid/graphics/Paint;-><init>(I)V

    iput-object p1, p0, Lcom/xuexiang/xui/adapter/recyclerview/GridDividerItemDecoration;->mPaint:Landroid/graphics/Paint;

    .line 14
    invoke-virtual {p1, p4}, Landroid/graphics/Paint;->setColor(I)V

    .line 15
    iget-object p1, p0, Lcom/xuexiang/xui/adapter/recyclerview/GridDividerItemDecoration;->mPaint:Landroid/graphics/Paint;

    sget-object p2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    return-void
.end method

.method private isLastRow(Landroidx/recyclerview/widget/RecyclerView;III)Z
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$o;

    move-result-object p1

    .line 2
    instance-of v0, p1, Landroidx/recyclerview/widget/GridLayoutManager;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_2

    .line 3
    rem-int p1, p4, p3

    div-int/2addr p4, p3

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    add-int/2addr p4, v2

    .line 4
    :goto_0
    div-int/2addr p2, p3

    add-int/2addr p2, v2

    if-ne p4, p2, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1

    .line 5
    :cond_2
    instance-of v0, p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    if-eqz v0, :cond_5

    .line 6
    check-cast p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    .line 7
    invoke-virtual {p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->getOrientation()I

    move-result p1

    if-ne p1, v2, :cond_4

    .line 8
    rem-int p1, p4, p3

    sub-int/2addr p4, p1

    if-lt p2, p4, :cond_3

    const/4 v1, 0x1

    :cond_3
    return v1

    :cond_4
    add-int/2addr p2, v2

    .line 9
    rem-int/2addr p2, p3

    if-nez p2, :cond_5

    const/4 v1, 0x1

    :cond_5
    return v1
.end method


# virtual methods
.method public getItemOffsets(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$y;)V
    .locals 4

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroidx/recyclerview/widget/RecyclerView$n;->getItemOffsets(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$y;)V

    .line 2
    invoke-virtual {p3, p2}, Landroidx/recyclerview/widget/RecyclerView;->getChildLayoutPosition(Landroid/view/View;)I

    move-result p2

    .line 3
    invoke-virtual {p3}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$g;

    move-result-object p4

    const/4 v0, 0x0

    if-eqz p4, :cond_1

    .line 4
    invoke-virtual {p3}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$g;

    move-result-object p4

    invoke-virtual {p4}, Landroidx/recyclerview/widget/RecyclerView$g;->getItemCount()I

    move-result p4

    .line 5
    iget v1, p0, Lcom/xuexiang/xui/adapter/recyclerview/GridDividerItemDecoration;->mSpanCount:I

    invoke-direct {p0, p3, p2, v1, p4}, Lcom/xuexiang/xui/adapter/recyclerview/GridDividerItemDecoration;->isLastRow(Landroidx/recyclerview/widget/RecyclerView;III)Z

    move-result p3

    .line 6
    iget p4, p0, Lcom/xuexiang/xui/adapter/recyclerview/GridDividerItemDecoration;->mSpanCount:I

    add-int/lit8 v1, p4, -0x1

    iget v2, p0, Lcom/xuexiang/xui/adapter/recyclerview/GridDividerItemDecoration;->mDividerWidth:I

    mul-int v1, v1, v2

    div-int/2addr v1, p4

    sub-int v3, v2, v1

    .line 7
    rem-int/2addr p2, p4

    mul-int p2, p2, v3

    sub-int/2addr v1, p2

    if-eqz p3, :cond_0

    .line 8
    invoke-virtual {p1, p2, v0, v1, v0}, Landroid/graphics/Rect;->set(IIII)V

    goto :goto_0

    .line 9
    :cond_0
    invoke-virtual {p1, p2, v0, v1, v2}, Landroid/graphics/Rect;->set(IIII)V

    goto :goto_0

    :cond_1
    add-int/lit8 p2, p2, 0x1

    .line 10
    iget p3, p0, Lcom/xuexiang/xui/adapter/recyclerview/GridDividerItemDecoration;->mSpanCount:I

    rem-int/2addr p2, p3

    if-lez p2, :cond_2

    .line 11
    iget p2, p0, Lcom/xuexiang/xui/adapter/recyclerview/GridDividerItemDecoration;->mDividerWidth:I

    invoke-virtual {p1, v0, v0, p2, p2}, Landroid/graphics/Rect;->set(IIII)V

    goto :goto_0

    .line 12
    :cond_2
    iget p2, p0, Lcom/xuexiang/xui/adapter/recyclerview/GridDividerItemDecoration;->mDividerWidth:I

    invoke-virtual {p1, v0, v0, v0, p2}, Landroid/graphics/Rect;->set(IIII)V

    :goto_0
    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$y;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v7, p1

    move-object/from16 v8, p2

    .line 1
    invoke-super/range {p0 .. p3}, Landroidx/recyclerview/widget/RecyclerView$n;->onDraw(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$y;)V

    .line 2
    invoke-virtual/range {p2 .. p2}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v9

    const/4 v1, 0x0

    const/4 v10, 0x0

    :goto_0
    if-ge v10, v9, :cond_5

    .line 3
    invoke-virtual {v8, v10}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v11

    .line 4
    invoke-virtual {v8, v11}, Landroidx/recyclerview/widget/RecyclerView;->getChildLayoutPosition(Landroid/view/View;)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    .line 5
    iget v2, v0, Lcom/xuexiang/xui/adapter/recyclerview/GridDividerItemDecoration;->mSpanCount:I

    rem-int/2addr v1, v2

    if-nez v1, :cond_0

    move v12, v2

    goto :goto_1

    :cond_0
    move v12, v1

    .line 6
    :goto_1
    invoke-virtual {v11}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    .line 7
    invoke-virtual {v11}, Landroid/view/View;->getBottom()I

    move-result v2

    iget v3, v1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr v2, v3

    invoke-static {v11}, Landroidx/core/view/u;->M(Landroid/view/View;)F

    move-result v3

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v3

    add-int/2addr v2, v3

    .line 8
    iget v3, v0, Lcom/xuexiang/xui/adapter/recyclerview/GridDividerItemDecoration;->mDividerWidth:I

    add-int v13, v2, v3

    .line 9
    invoke-virtual {v11}, Landroid/view/View;->getRight()I

    move-result v3

    iget v1, v1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    add-int/2addr v3, v1

    invoke-static {v11}, Landroidx/core/view/u;->L(Landroid/view/View;)F

    move-result v1

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    add-int v14, v3, v1

    .line 10
    iget v1, v0, Lcom/xuexiang/xui/adapter/recyclerview/GridDividerItemDecoration;->mDividerWidth:I

    add-int v15, v14, v1

    .line 11
    iget-object v1, v0, Lcom/xuexiang/xui/adapter/recyclerview/GridDividerItemDecoration;->mPaint:Landroid/graphics/Paint;

    if-eqz v1, :cond_1

    .line 12
    invoke-virtual {v11}, Landroid/view/View;->getLeft()I

    move-result v1

    int-to-float v3, v1

    int-to-float v4, v2

    int-to-float v5, v15

    int-to-float v6, v13

    iget-object v2, v0, Lcom/xuexiang/xui/adapter/recyclerview/GridDividerItemDecoration;->mPaint:Landroid/graphics/Paint;

    move-object/from16 v1, p1

    move-object/from16 v16, v2

    move v2, v3

    move v3, v4

    move v4, v5

    move v5, v6

    move-object/from16 v6, v16

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    goto :goto_2

    .line 13
    :cond_1
    iget-object v1, v0, Lcom/xuexiang/xui/adapter/recyclerview/GridDividerItemDecoration;->mDivider:Landroid/graphics/drawable/Drawable;

    if-eqz v1, :cond_2

    .line 14
    invoke-virtual {v11}, Landroid/view/View;->getLeft()I

    move-result v3

    invoke-virtual {v1, v3, v2, v15, v13}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 15
    iget-object v1, v0, Lcom/xuexiang/xui/adapter/recyclerview/GridDividerItemDecoration;->mDivider:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1, v7}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 16
    :cond_2
    :goto_2
    iget v1, v0, Lcom/xuexiang/xui/adapter/recyclerview/GridDividerItemDecoration;->mSpanCount:I

    if-ge v12, v1, :cond_4

    .line 17
    iget-object v1, v0, Lcom/xuexiang/xui/adapter/recyclerview/GridDividerItemDecoration;->mPaint:Landroid/graphics/Paint;

    if-eqz v1, :cond_3

    int-to-float v2, v14

    .line 18
    invoke-virtual {v11}, Landroid/view/View;->getTop()I

    move-result v1

    int-to-float v3, v1

    int-to-float v4, v15

    int-to-float v5, v13

    iget-object v6, v0, Lcom/xuexiang/xui/adapter/recyclerview/GridDividerItemDecoration;->mPaint:Landroid/graphics/Paint;

    move-object/from16 v1, p1

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    goto :goto_3

    .line 19
    :cond_3
    iget-object v1, v0, Lcom/xuexiang/xui/adapter/recyclerview/GridDividerItemDecoration;->mDivider:Landroid/graphics/drawable/Drawable;

    if-eqz v1, :cond_4

    .line 20
    invoke-virtual {v11}, Landroid/view/View;->getTop()I

    move-result v2

    invoke-virtual {v1, v14, v2, v15, v13}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 21
    iget-object v1, v0, Lcom/xuexiang/xui/adapter/recyclerview/GridDividerItemDecoration;->mDivider:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1, v7}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    :cond_4
    :goto_3
    add-int/lit8 v10, v10, 0x1

    goto/16 :goto_0

    :cond_5
    return-void
.end method

.method public setDivider(Landroid/graphics/drawable/Drawable;)Lcom/xuexiang/xui/adapter/recyclerview/GridDividerItemDecoration;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/adapter/recyclerview/GridDividerItemDecoration;->mDivider:Landroid/graphics/drawable/Drawable;

    .line 2
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/adapter/recyclerview/GridDividerItemDecoration;->mDividerWidth:I

    return-object p0
.end method
