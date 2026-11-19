.class public Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet$BottomGridSheetBuilder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "BottomGridSheetBuilder"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet$BottomGridSheetBuilder$Style;,
        Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet$BottomGridSheetBuilder$OnSheetItemClickListener;
    }
.end annotation


# static fields
.field public static final FIRST_LINE:I = 0x0

.field public static final SECOND_LINE:I = 0x1


# instance fields
.field private mBottomButtonTypeFace:Landroid/graphics/Typeface;

.field private mButtonClickListener:Landroid/view/View$OnClickListener;

.field private mButtonText:Ljava/lang/CharSequence;

.field private mContext:Landroid/content/Context;

.field private mDialog:Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet;

.field private mFirstLineViews:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field private mIsShowButton:Z

.field private mItemTextTypeFace:Landroid/graphics/Typeface;

.field private mMiniItemWidth:I

.field private mOnSheetItemClickListener:Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet$BottomGridSheetBuilder$OnSheetItemClickListener;

.field private mSecondLineViews:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 2
    iput v0, p0, Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet$BottomGridSheetBuilder;->mMiniItemWidth:I

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet$BottomGridSheetBuilder;->mItemTextTypeFace:Landroid/graphics/Typeface;

    .line 4
    iput-object v0, p0, Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet$BottomGridSheetBuilder;->mBottomButtonTypeFace:Landroid/graphics/Typeface;

    const/4 v1, 0x1

    .line 5
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet$BottomGridSheetBuilder;->mIsShowButton:Z

    .line 6
    iput-object v0, p0, Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet$BottomGridSheetBuilder;->mButtonText:Ljava/lang/CharSequence;

    .line 7
    iput-object v0, p0, Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet$BottomGridSheetBuilder;->mButtonClickListener:Landroid/view/View$OnClickListener;

    .line 8
    iput-object p1, p0, Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet$BottomGridSheetBuilder;->mContext:Landroid/content/Context;

    .line 9
    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet$BottomGridSheetBuilder;->mFirstLineViews:Landroid/util/SparseArray;

    .line 10
    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet$BottomGridSheetBuilder;->mSecondLineViews:Landroid/util/SparseArray;

    return-void
.end method

.method static synthetic access$1100(Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet$BottomGridSheetBuilder;)Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet$BottomGridSheetBuilder$OnSheetItemClickListener;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet$BottomGridSheetBuilder;->mOnSheetItemClickListener:Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet$BottomGridSheetBuilder$OnSheetItemClickListener;

    return-object p0
.end method

.method static synthetic access$1200(Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet$BottomGridSheetBuilder;)Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet$BottomGridSheetBuilder;->mDialog:Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet;

    return-object p0
.end method

.method private addViewsInSection(Landroid/util/SparseArray;Landroid/widget/LinearLayout;I)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/SparseArray<",
            "Landroid/view/View;",
            ">;",
            "Landroid/widget/LinearLayout;",
            "I)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    :goto_0
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 2
    invoke-virtual {p1, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    .line 3
    invoke-direct {p0, v1, p3}, Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet$BottomGridSheetBuilder;->setItemWidth(Landroid/view/View;I)V

    .line 4
    invoke-virtual {p2, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private buildViews()Landroid/view/View;
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet$BottomGridSheetBuilder;->mContext:Landroid/content/Context;

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet$BottomGridSheetBuilder;->getContentViewLayoutId()I

    move-result v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    .line 2
    sget v1, Lcom/xuexiang/xui/R$id;->bottom_sheet_first_linear_layout:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/LinearLayout;

    .line 3
    sget v2, Lcom/xuexiang/xui/R$id;->bottom_sheet_second_linear_layout:I

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/LinearLayout;

    .line 4
    sget v3, Lcom/xuexiang/xui/R$id;->bottom_sheet_button_container:I

    invoke-virtual {v0, v3}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/view/ViewGroup;

    .line 5
    sget v4, Lcom/xuexiang/xui/R$id;->bottom_sheet_close_button:I

    invoke-virtual {v0, v4}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    .line 6
    iget-object v5, p0, Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet$BottomGridSheetBuilder;->mFirstLineViews:Landroid/util/SparseArray;

    invoke-virtual {v5}, Landroid/util/SparseArray;->size()I

    move-result v5

    iget-object v6, p0, Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet$BottomGridSheetBuilder;->mSecondLineViews:Landroid/util/SparseArray;

    invoke-virtual {v6}, Landroid/util/SparseArray;->size()I

    move-result v6

    invoke-static {v5, v6}, Ljava/lang/Math;->max(II)I

    move-result v5

    .line 7
    iget-object v6, p0, Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet$BottomGridSheetBuilder;->mContext:Landroid/content/Context;

    invoke-static {v6}, Lcom/xuexiang/xui/utils/Utils;->getScreenWidth(Landroid/content/Context;)I

    move-result v6

    .line 8
    iget-object v7, p0, Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet$BottomGridSheetBuilder;->mContext:Landroid/content/Context;

    invoke-static {v7}, Lcom/xuexiang/xui/utils/Utils;->getScreenHeight(Landroid/content/Context;)I

    move-result v7

    .line 9
    invoke-static {v6, v7}, Ljava/lang/Math;->min(II)I

    move-result v6

    .line 10
    invoke-virtual {v1}, Landroid/widget/LinearLayout;->getPaddingLeft()I

    move-result v7

    invoke-virtual {v1}, Landroid/widget/LinearLayout;->getPaddingRight()I

    move-result v8

    invoke-direct {p0, v6, v5, v7, v8}, Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet$BottomGridSheetBuilder;->calculateItemWidth(IIII)I

    move-result v5

    .line 11
    iget-object v6, p0, Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet$BottomGridSheetBuilder;->mFirstLineViews:Landroid/util/SparseArray;

    invoke-direct {p0, v6, v1, v5}, Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet$BottomGridSheetBuilder;->addViewsInSection(Landroid/util/SparseArray;Landroid/widget/LinearLayout;I)V

    .line 12
    iget-object v6, p0, Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet$BottomGridSheetBuilder;->mSecondLineViews:Landroid/util/SparseArray;

    invoke-direct {p0, v6, v2, v5}, Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet$BottomGridSheetBuilder;->addViewsInSection(Landroid/util/SparseArray;Landroid/widget/LinearLayout;I)V

    .line 13
    iget-object v5, p0, Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet$BottomGridSheetBuilder;->mFirstLineViews:Landroid/util/SparseArray;

    invoke-virtual {v5}, Landroid/util/SparseArray;->size()I

    move-result v5

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-lez v5, :cond_0

    const/4 v5, 0x1

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    .line 14
    :goto_0
    iget-object v8, p0, Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet$BottomGridSheetBuilder;->mSecondLineViews:Landroid/util/SparseArray;

    invoke-virtual {v8}, Landroid/util/SparseArray;->size()I

    move-result v8

    if-lez v8, :cond_1

    goto :goto_1

    :cond_1
    const/4 v6, 0x0

    :goto_1
    const/16 v8, 0x8

    if-nez v5, :cond_2

    .line 15
    invoke-virtual {v1, v8}, Landroid/widget/LinearLayout;->setVisibility(I)V

    :cond_2
    if-nez v6, :cond_4

    if-eqz v5, :cond_3

    .line 16
    invoke-virtual {v1}, Landroid/widget/LinearLayout;->getPaddingLeft()I

    move-result v5

    .line 17
    invoke-virtual {v1}, Landroid/widget/LinearLayout;->getPaddingTop()I

    move-result v6

    .line 18
    invoke-virtual {v1}, Landroid/widget/LinearLayout;->getPaddingRight()I

    move-result v9

    .line 19
    invoke-virtual {v1, v5, v6, v9, v7}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    .line 20
    :cond_3
    invoke-virtual {v2, v8}, Landroid/widget/LinearLayout;->setVisibility(I)V

    :cond_4
    if-eqz v3, :cond_9

    .line 21
    iget-boolean v1, p0, Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet$BottomGridSheetBuilder;->mIsShowButton:Z

    if-eqz v1, :cond_5

    .line 22
    invoke-virtual {v3, v7}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 23
    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getPaddingLeft()I

    move-result v1

    .line 24
    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getPaddingTop()I

    move-result v2

    .line 25
    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getPaddingRight()I

    move-result v3

    .line 26
    invoke-virtual {v0, v1, v2, v3, v7}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    goto :goto_2

    .line 27
    :cond_5
    invoke-virtual {v3, v8}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 28
    :goto_2
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet$BottomGridSheetBuilder;->mBottomButtonTypeFace:Landroid/graphics/Typeface;

    if-eqz v1, :cond_6

    .line 29
    invoke-virtual {v4, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 30
    :cond_6
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet$BottomGridSheetBuilder;->mButtonText:Ljava/lang/CharSequence;

    if-eqz v1, :cond_7

    .line 31
    invoke-virtual {v4, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 32
    :cond_7
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet$BottomGridSheetBuilder;->mButtonClickListener:Landroid/view/View$OnClickListener;

    if-eqz v1, :cond_8

    .line 33
    invoke-virtual {v4, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_3

    .line 34
    :cond_8
    new-instance v1, Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet$BottomGridSheetBuilder$2;

    invoke-direct {v1, p0}, Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet$BottomGridSheetBuilder$2;-><init>(Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet$BottomGridSheetBuilder;)V

    invoke-virtual {v4, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_9
    :goto_3
    return-object v0
.end method

.method private calculateItemWidth(IIII)I
    .locals 2

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet$BottomGridSheetBuilder;->mMiniItemWidth:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet$BottomGridSheetBuilder;->mContext:Landroid/content/Context;

    sget v1, Lcom/xuexiang/xui/R$attr;->xui_bottom_sheet_grid_item_mini_width:I

    invoke-static {v0, v1}, Lcom/xuexiang/xui/utils/ThemeUtils;->resolveDimension(Landroid/content/Context;I)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet$BottomGridSheetBuilder;->mMiniItemWidth:I

    :cond_0
    sub-int/2addr p1, p3

    sub-int p3, p1, p4

    .line 3
    iget p4, p0, Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet$BottomGridSheetBuilder;->mMiniItemWidth:I

    const/4 v0, 0x3

    if-lt p2, v0, :cond_1

    mul-int v0, p2, p4

    sub-int v0, p3, v0

    if-lez v0, :cond_1

    if-ge v0, p4, :cond_1

    .line 4
    div-int p4, p3, p4

    .line 5
    div-int p4, p3, p4

    :cond_1
    mul-int p2, p2, p4

    if-le p2, p3, :cond_2

    .line 6
    div-int p2, p1, p4

    int-to-float p1, p1

    int-to-float p2, p2

    const/high16 p3, 0x3f000000    # 0.5f

    add-float/2addr p2, p3

    div-float/2addr p1, p2

    float-to-int p4, p1

    :cond_2
    return p4
.end method

.method private setItemWidth(Landroid/view/View;I)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout$LayoutParams;

    .line 3
    iput p2, p1, Landroid/widget/LinearLayout$LayoutParams;->width:I

    goto :goto_0

    .line 4
    :cond_0
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v1, -0x2

    invoke-direct {v0, p2, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 5
    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    move-object p1, v0

    :goto_0
    const/16 p2, 0x30

    .line 6
    iput p2, p1, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    return-void
.end method


# virtual methods
.method public addItem(ILjava/lang/CharSequence;I)Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet$BottomGridSheetBuilder;
    .locals 6

    const/4 v5, 0x0

    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move-object v3, p2

    move v4, p3

    .line 1
    invoke-virtual/range {v0 .. v5}, Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet$BottomGridSheetBuilder;->addItem(ILjava/lang/CharSequence;Ljava/lang/Object;II)Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet$BottomGridSheetBuilder;

    move-result-object p1

    return-object p1
.end method

.method public addItem(ILjava/lang/CharSequence;Ljava/lang/Object;I)Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet$BottomGridSheetBuilder;
    .locals 6

    const/4 v5, 0x0

    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    .line 2
    invoke-virtual/range {v0 .. v5}, Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet$BottomGridSheetBuilder;->addItem(ILjava/lang/CharSequence;Ljava/lang/Object;II)Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet$BottomGridSheetBuilder;

    move-result-object p1

    return-object p1
.end method

.method public addItem(ILjava/lang/CharSequence;Ljava/lang/Object;II)Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet$BottomGridSheetBuilder;
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet$BottomGridSheetBuilder;->mContext:Landroid/content/Context;

    invoke-static {v0, p1}, Ld/a;->d(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1, p2, p3, p5}, Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet$BottomGridSheetBuilder;->createItemView(Landroid/graphics/drawable/Drawable;Ljava/lang/CharSequence;Ljava/lang/Object;I)Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheetItemView;

    move-result-object p1

    .line 4
    invoke-virtual {p0, p1, p4}, Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet$BottomGridSheetBuilder;->addItem(Landroid/view/View;I)Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet$BottomGridSheetBuilder;

    move-result-object p1

    return-object p1
.end method

.method public addItem(Landroid/view/View;I)Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet$BottomGridSheetBuilder;
    .locals 1

    if-eqz p2, :cond_1

    const/4 v0, 0x1

    if-eq p2, v0, :cond_0

    goto :goto_0

    .line 5
    :cond_0
    iget-object p2, p0, Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet$BottomGridSheetBuilder;->mSecondLineViews:Landroid/util/SparseArray;

    invoke-virtual {p2}, Landroid/util/SparseArray;->size()I

    move-result v0

    invoke-virtual {p2, v0, p1}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    goto :goto_0

    .line 6
    :cond_1
    iget-object p2, p0, Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet$BottomGridSheetBuilder;->mFirstLineViews:Landroid/util/SparseArray;

    invoke-virtual {p2}, Landroid/util/SparseArray;->size()I

    move-result v0

    invoke-virtual {p2, v0, p1}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    :goto_0
    return-object p0
.end method

.method public build()Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet;
    .locals 5

    .line 1
    new-instance v0, Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet$BottomGridSheetBuilder;->mContext:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet$BottomGridSheetBuilder;->mDialog:Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet;

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet$BottomGridSheetBuilder;->buildViews()Landroid/view/View;

    move-result-object v0

    .line 3
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet$BottomGridSheetBuilder;->mDialog:Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet;

    new-instance v2, Landroid/view/ViewGroup$LayoutParams;

    const/4 v3, -0x1

    const/4 v4, -0x2

    invoke-direct {v2, v3, v4}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v1, v0, v2}, Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet;->setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet$BottomGridSheetBuilder;->mDialog:Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet;

    return-object v0
.end method

.method public createItemView(Landroid/graphics/drawable/Drawable;Ljava/lang/CharSequence;Ljava/lang/Object;I)Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheetItemView;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet$BottomGridSheetBuilder;->mContext:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    .line 2
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet$BottomGridSheetBuilder;->getItemViewLayoutId()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheetItemView;

    .line 3
    sget v1, Lcom/xuexiang/xui/R$id;->grid_item_title:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 4
    iget-object v2, p0, Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet$BottomGridSheetBuilder;->mItemTextTypeFace:Landroid/graphics/Typeface;

    if-eqz v2, :cond_0

    .line 5
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 6
    :cond_0
    invoke-virtual {v1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 7
    invoke-virtual {v0, p3}, Landroid/widget/LinearLayout;->setTag(Ljava/lang/Object;)V

    .line 8
    new-instance p2, Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet$BottomGridSheetBuilder$1;

    invoke-direct {p2, p0}, Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet$BottomGridSheetBuilder$1;-><init>(Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet$BottomGridSheetBuilder;)V

    invoke-virtual {v0, p2}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 9
    sget p2, Lcom/xuexiang/xui/R$id;->grid_item_image:I

    invoke-virtual {v0, p2}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroidx/appcompat/widget/AppCompatImageView;

    .line 10
    invoke-virtual {p2, p1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    if-eqz p4, :cond_1

    .line 11
    sget p1, Lcom/xuexiang/xui/R$id;->grid_item_subscript:I

    invoke-virtual {v0, p1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/view/ViewStub;

    .line 12
    invoke-virtual {p1}, Landroid/view/ViewStub;->inflate()Landroid/view/View;

    move-result-object p1

    .line 13
    check-cast p1, Landroid/widget/ImageView;

    invoke-virtual {p1, p4}, Landroid/widget/ImageView;->setImageResource(I)V

    :cond_1
    return-object v0
.end method

.method protected getContentViewLayoutId()I
    .locals 1

    sget v0, Lcom/xuexiang/xui/R$layout;->xui_bottom_sheet_grid:I

    return v0
.end method

.method protected getItemViewLayoutId()I
    .locals 1

    sget v0, Lcom/xuexiang/xui/R$layout;->xui_bottom_sheet_grid_item:I

    return v0
.end method

.method public setBottomButtonTypeFace(Landroid/graphics/Typeface;)Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet$BottomGridSheetBuilder;
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet$BottomGridSheetBuilder;->mBottomButtonTypeFace:Landroid/graphics/Typeface;

    return-object p0
.end method

.method public setButtonClickListener(Landroid/view/View$OnClickListener;)Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet$BottomGridSheetBuilder;
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet$BottomGridSheetBuilder;->mButtonClickListener:Landroid/view/View$OnClickListener;

    return-object p0
.end method

.method public setButtonText(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet$BottomGridSheetBuilder;
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet$BottomGridSheetBuilder;->mButtonText:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public setIsShowButton(Z)Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet$BottomGridSheetBuilder;
    .locals 0

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet$BottomGridSheetBuilder;->mIsShowButton:Z

    return-object p0
.end method

.method public setItemTextTypeFace(Landroid/graphics/Typeface;)Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet$BottomGridSheetBuilder;
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet$BottomGridSheetBuilder;->mItemTextTypeFace:Landroid/graphics/Typeface;

    return-object p0
.end method

.method public setItemVisibility(Ljava/lang/Object;I)V
    .locals 5

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 1
    :goto_0
    iget-object v3, p0, Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet$BottomGridSheetBuilder;->mFirstLineViews:Landroid/util/SparseArray;

    invoke-virtual {v3}, Landroid/util/SparseArray;->size()I

    move-result v3

    if-ge v2, v3, :cond_1

    .line 2
    iget-object v3, p0, Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet$BottomGridSheetBuilder;->mFirstLineViews:Landroid/util/SparseArray;

    invoke-virtual {v3, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    if-eqz v3, :cond_0

    .line 3
    invoke-virtual {v3}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v4, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    move-object v1, v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 4
    :cond_1
    :goto_1
    iget-object v2, p0, Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet$BottomGridSheetBuilder;->mSecondLineViews:Landroid/util/SparseArray;

    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    move-result v2

    if-ge v0, v2, :cond_3

    .line 5
    iget-object v2, p0, Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet$BottomGridSheetBuilder;->mSecondLineViews:Landroid/util/SparseArray;

    invoke-virtual {v2, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    if-eqz v2, :cond_2

    .line 6
    invoke-virtual {v2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    move-object v1, v2

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_3
    if-eqz v1, :cond_4

    .line 7
    invoke-virtual {v1, p2}, Landroid/view/View;->setVisibility(I)V

    :cond_4
    return-void
.end method

.method public setOnSheetItemClickListener(Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet$BottomGridSheetBuilder$OnSheetItemClickListener;)Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet$BottomGridSheetBuilder;
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet$BottomGridSheetBuilder;->mOnSheetItemClickListener:Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet$BottomGridSheetBuilder$OnSheetItemClickListener;

    return-object p0
.end method
