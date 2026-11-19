.class public Lcom/xuexiang/xui/widget/XUIWrapContentScrollView;
.super Lcom/xuexiang/xui/widget/XUIObservableScrollView;
.source "SourceFile"


# instance fields
.field private mMaxHeight:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/XUIObservableScrollView;-><init>(Landroid/content/Context;)V

    const p1, 0x1fffffff

    .line 2
    iput p1, p0, Lcom/xuexiang/xui/widget/XUIWrapContentScrollView;->mMaxHeight:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;I)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/XUIObservableScrollView;-><init>(Landroid/content/Context;)V

    .line 4
    iput p2, p0, Lcom/xuexiang/xui/widget/XUIWrapContentScrollView;->mMaxHeight:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 5
    invoke-direct {p0, p1, p2}, Lcom/xuexiang/xui/widget/XUIObservableScrollView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const v0, 0x1fffffff

    .line 6
    iput v0, p0, Lcom/xuexiang/xui/widget/XUIWrapContentScrollView;->mMaxHeight:I

    .line 7
    invoke-direct {p0, p1, p2}, Lcom/xuexiang/xui/widget/XUIWrapContentScrollView;->initAttrs(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 8
    invoke-direct {p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/XUIObservableScrollView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const p3, 0x1fffffff

    .line 9
    iput p3, p0, Lcom/xuexiang/xui/widget/XUIWrapContentScrollView;->mMaxHeight:I

    .line 10
    invoke-direct {p0, p1, p2}, Lcom/xuexiang/xui/widget/XUIWrapContentScrollView;->initAttrs(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method private initAttrs(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 1
    sget-object v0, Lcom/xuexiang/xui/R$styleable;->XUIWrapContentScrollView:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 2
    sget p2, Lcom/xuexiang/xui/R$styleable;->XUIWrapContentScrollView_wcsv_max_height:I

    iget v0, p0, Lcom/xuexiang/xui/widget/XUIWrapContentScrollView;->mMaxHeight:I

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/XUIWrapContentScrollView;->mMaxHeight:I

    .line 3
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    :cond_0
    return-void
.end method


# virtual methods
.method protected onMeasure(II)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/widget/ScrollView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p2

    .line 2
    iget p2, p2, Landroid/view/ViewGroup$LayoutParams;->height:I

    if-lez p2, :cond_0

    iget v0, p0, Lcom/xuexiang/xui/widget/XUIWrapContentScrollView;->mMaxHeight:I

    if-gt p2, v0, :cond_0

    const/high16 v0, 0x40000000    # 2.0f

    .line 3
    invoke-static {p2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    goto :goto_0

    .line 4
    :cond_0
    iget p2, p0, Lcom/xuexiang/xui/widget/XUIWrapContentScrollView;->mMaxHeight:I

    const/high16 v0, -0x80000000

    invoke-static {p2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    .line 5
    :goto_0
    invoke-super {p0, p1, p2}, Landroid/widget/ScrollView;->onMeasure(II)V

    return-void
.end method

.method public setMaxHeight(I)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/XUIWrapContentScrollView;->mMaxHeight:I

    if-eq v0, p1, :cond_0

    .line 2
    iput p1, p0, Lcom/xuexiang/xui/widget/XUIWrapContentScrollView;->mMaxHeight:I

    .line 3
    invoke-virtual {p0}, Landroid/widget/ScrollView;->requestLayout()V

    :cond_0
    return-void
.end method
