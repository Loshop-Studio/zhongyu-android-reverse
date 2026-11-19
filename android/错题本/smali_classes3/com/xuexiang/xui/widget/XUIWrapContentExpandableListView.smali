.class public Lcom/xuexiang/xui/widget/XUIWrapContentExpandableListView;
.super Landroid/widget/ExpandableListView;
.source "SourceFile"


# instance fields
.field public a:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroid/widget/ExpandableListView;-><init>(Landroid/content/Context;)V

    const p1, 0x1fffffff

    .line 2
    iput p1, p0, Lcom/xuexiang/xui/widget/XUIWrapContentExpandableListView;->a:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 3
    invoke-direct {p0, p1, p2}, Landroid/widget/ExpandableListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const v0, 0x1fffffff

    .line 4
    iput v0, p0, Lcom/xuexiang/xui/widget/XUIWrapContentExpandableListView;->a:I

    .line 5
    sget-object v0, Lcom/xuexiang/xui/R$styleable;->XUIWrapContentExpandableListView:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 6
    sget p2, Lcom/xuexiang/xui/R$styleable;->XUIWrapContentExpandableListView_wcelv_max_height:I

    iget v0, p0, Lcom/xuexiang/xui/widget/XUIWrapContentExpandableListView;->a:I

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/XUIWrapContentExpandableListView;->a:I

    .line 7
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    :cond_0
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 8
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/ExpandableListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const p3, 0x1fffffff

    .line 9
    iput p3, p0, Lcom/xuexiang/xui/widget/XUIWrapContentExpandableListView;->a:I

    .line 10
    sget-object p3, Lcom/xuexiang/xui/R$styleable;->XUIWrapContentExpandableListView:[I

    invoke-virtual {p1, p2, p3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 11
    sget p2, Lcom/xuexiang/xui/R$styleable;->XUIWrapContentExpandableListView_wcelv_max_height:I

    iget p3, p0, Lcom/xuexiang/xui/widget/XUIWrapContentExpandableListView;->a:I

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/XUIWrapContentExpandableListView;->a:I

    .line 12
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    :cond_0
    return-void
.end method


# virtual methods
.method public final onMeasure(II)V
    .locals 1

    .line 1
    iget p2, p0, Lcom/xuexiang/xui/widget/XUIWrapContentExpandableListView;->a:I

    .line 2
    .line 3
    const/high16 v0, -0x80000000

    .line 4
    .line 5
    invoke-static {p2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public setMaxHeight(I)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/XUIWrapContentExpandableListView;->a:I

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput p1, p0, Lcom/xuexiang/xui/widget/XUIWrapContentExpandableListView;->a:I

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method
