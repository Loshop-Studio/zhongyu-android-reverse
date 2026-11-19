.class Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;
.super Landroid/widget/RelativeLayout;
.source "SourceFile"


# instance fields
.field private mEmptyView:Landroid/widget/ImageView;

.field private mFilledView:Landroid/widget/ImageView;

.field private mStarHeight:I

.field private mStarWidth:I


# direct methods
.method public constructor <init>(Landroid/content/Context;IIII)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 2
    iput p3, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;->mStarWidth:I

    .line 3
    iput p4, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;->mStarHeight:I

    .line 4
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/widget/RelativeLayout;->setTag(Ljava/lang/Object;)V

    .line 5
    invoke-virtual {p0, p5, p5, p5, p5}, Landroid/widget/RelativeLayout;->setPadding(IIII)V

    .line 6
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;->init()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 7
    invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, 0x0

    .line 8
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;->mStarWidth:I

    .line 9
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;->mStarHeight:I

    .line 10
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;->init()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 11
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p1, 0x0

    .line 12
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;->mStarWidth:I

    .line 13
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;->mStarHeight:I

    .line 14
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;->init()V

    return-void
.end method

.method private init()V
    .locals 4

    .line 1
    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    iget v1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;->mStarWidth:I

    const/4 v2, -0x2

    if-nez v1, :cond_0

    const/4 v1, -0x2

    :cond_0
    iget v3, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;->mStarHeight:I

    if-nez v3, :cond_1

    goto :goto_0

    :cond_1
    move v2, v3

    :goto_0
    invoke-direct {v0, v1, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 2
    new-instance v1, Landroid/widget/ImageView;

    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;->mFilledView:Landroid/widget/ImageView;

    .line 3
    sget-object v2, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 4
    iget-object v1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;->mFilledView:Landroid/widget/ImageView;

    invoke-virtual {p0, v1, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 5
    new-instance v1, Landroid/widget/ImageView;

    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;->mEmptyView:Landroid/widget/ImageView;

    .line 6
    sget-object v2, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 7
    iget-object v1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;->mEmptyView:Landroid/widget/ImageView;

    invoke-virtual {p0, v1, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 8
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;->setEmpty()V

    return-void
.end method


# virtual methods
.method public setEmpty()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;->mFilledView:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageLevel(I)V

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;->mEmptyView:Landroid/widget/ImageView;

    const/16 v1, 0x2710

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageLevel(I)V

    return-void
.end method

.method public setEmptyDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    new-instance v0, Landroid/graphics/drawable/ClipDrawable;

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    move-result-object p1

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    const v1, 0x800005

    const/4 v2, 0x1

    invoke-direct {v0, p1, v1, v2}, Landroid/graphics/drawable/ClipDrawable;-><init>(Landroid/graphics/drawable/Drawable;II)V

    .line 3
    iget-object p1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;->mEmptyView:Landroid/widget/ImageView;

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setFilled()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;->mFilledView:Landroid/widget/ImageView;

    const/16 v1, 0x2710

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageLevel(I)V

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;->mEmptyView:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageLevel(I)V

    return-void
.end method

.method public setFilledDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    new-instance v0, Landroid/graphics/drawable/ClipDrawable;

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    move-result-object p1

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    const v1, 0x800003

    const/4 v2, 0x1

    invoke-direct {v0, p1, v1, v2}, Landroid/graphics/drawable/ClipDrawable;-><init>(Landroid/graphics/drawable/Drawable;II)V

    .line 3
    iget-object p1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;->mFilledView:Landroid/widget/ImageView;

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setPartialFilled(F)V
    .locals 2

    const/high16 v0, 0x3f800000    # 1.0f

    rem-float/2addr p1, v0

    const v0, 0x461c4000    # 10000.0f

    mul-float p1, p1, v0

    float-to-int p1, p1

    const/16 v0, 0x2710

    if-nez p1, :cond_0

    const/16 p1, 0x2710

    .line 1
    :cond_0
    iget-object v1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;->mFilledView:Landroid/widget/ImageView;

    invoke-virtual {v1, p1}, Landroid/widget/ImageView;->setImageLevel(I)V

    .line 2
    iget-object v1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;->mEmptyView:Landroid/widget/ImageView;

    sub-int/2addr v0, p1

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageLevel(I)V

    return-void
.end method

.method public setStarHeight(I)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;->mStarHeight:I

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;->mFilledView:Landroid/widget/ImageView;

    invoke-virtual {p1}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    .line 3
    iget v0, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;->mStarHeight:I

    iput v0, p1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;->mFilledView:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;->mEmptyView:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public setStarWidth(I)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;->mStarWidth:I

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;->mFilledView:Landroid/widget/ImageView;

    invoke-virtual {p1}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    .line 3
    iget v0, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;->mStarWidth:I

    iput v0, p1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;->mFilledView:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;->mEmptyView:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method
