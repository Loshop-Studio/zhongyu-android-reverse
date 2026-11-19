.class public Lcom/xuexiang/xui/widget/XUIWrapContentScrollView;
.super Lcom/xuexiang/xui/widget/XUIObservableScrollView;
.source "SourceFile"


# instance fields
.field public b:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/XUIObservableScrollView;-><init>(Landroid/content/Context;)V

    const p1, 0x1fffffff

    .line 2
    iput p1, p0, Lcom/xuexiang/xui/widget/XUIWrapContentScrollView;->b:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 3
    invoke-direct {p0, p1, p2}, Lcom/xuexiang/xui/widget/XUIObservableScrollView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const v0, 0x1fffffff

    .line 4
    iput v0, p0, Lcom/xuexiang/xui/widget/XUIWrapContentScrollView;->b:I

    .line 5
    sget-object v0, Lcom/xuexiang/xui/R$styleable;->XUIWrapContentScrollView:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 6
    sget p2, Lcom/xuexiang/xui/R$styleable;->XUIWrapContentScrollView_wcsv_max_height:I

    iget v0, p0, Lcom/xuexiang/xui/widget/XUIWrapContentScrollView;->b:I

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/XUIWrapContentScrollView;->b:I

    .line 7
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    :cond_0
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 8
    invoke-direct {p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/XUIObservableScrollView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const p3, 0x1fffffff

    .line 9
    iput p3, p0, Lcom/xuexiang/xui/widget/XUIWrapContentScrollView;->b:I

    .line 10
    sget-object p3, Lcom/xuexiang/xui/R$styleable;->XUIWrapContentScrollView:[I

    invoke-virtual {p1, p2, p3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 11
    sget p2, Lcom/xuexiang/xui/R$styleable;->XUIWrapContentScrollView_wcsv_max_height:I

    iget p3, p0, Lcom/xuexiang/xui/widget/XUIWrapContentScrollView;->b:I

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/XUIWrapContentScrollView;->b:I

    .line 12
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    :cond_0
    return-void
.end method


# virtual methods
.method public final onMeasure(II)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    iget p2, p2, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 6
    .line 7
    if-lez p2, :cond_0

    .line 8
    .line 9
    iget v0, p0, Lcom/xuexiang/xui/widget/XUIWrapContentScrollView;->b:I

    .line 10
    .line 11
    if-gt p2, v0, :cond_0

    .line 12
    .line 13
    const/high16 v0, 0x40000000    # 2.0f

    .line 14
    .line 15
    invoke-static {p2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    iget p2, p0, Lcom/xuexiang/xui/widget/XUIWrapContentScrollView;->b:I

    .line 21
    .line 22
    const/high16 v0, -0x80000000

    .line 23
    .line 24
    invoke-static {p2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 25
    .line 26
    .line 27
    move-result p2

    .line 28
    :goto_0
    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public setMaxHeight(I)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/XUIWrapContentScrollView;->b:I

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput p1, p0, Lcom/xuexiang/xui/widget/XUIWrapContentScrollView;->b:I

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method
