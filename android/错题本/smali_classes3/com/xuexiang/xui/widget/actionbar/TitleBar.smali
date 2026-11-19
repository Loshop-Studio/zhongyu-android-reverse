.class public Lcom/xuexiang/xui/widget/actionbar/TitleBar;
.super Landroid/view/ViewGroup;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lio/github/inflationx/calligraphy3/HasTypeface;


# instance fields
.field public final a:I

.field public final b:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 2
    sget v0, Lcom/xuexiang/xui/R$attr;->TitleBarStyle:I

    invoke-direct {p0, p1, p2, v0}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 3

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    sget-object v0, Lcom/xuexiang/xui/R$styleable;->TitleBar:[I

    const/4 v1, 0x0

    invoke-virtual {p1, p2, v0, p3, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p2

    .line 5
    sget p3, Lcom/xuexiang/xui/R$styleable;->TitleBar_tb_barHeight:I

    sget v0, Lcom/xuexiang/xui/R$attr;->xui_actionbar_height:I

    const/4 v2, -0x1

    .line 6
    invoke-static {p1, v0, v2}, Lkotlin/collections/u;->G(Landroid/content/Context;II)I

    move-result v0

    .line 7
    invoke-virtual {p2, p3, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p3

    iput p3, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->a:I

    .line 8
    sget p3, Lcom/xuexiang/xui/R$styleable;->TitleBar_tb_immersive:I

    sget v0, Lcom/xuexiang/xui/R$attr;->xui_actionbar_immersive:I

    .line 9
    invoke-static {p1, v0, v1}, Lkotlin/collections/u;->E(Landroid/content/Context;IZ)Z

    move-result v0

    .line 10
    invoke-virtual {p2, p3, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 11
    sget p3, Lcom/xuexiang/xui/R$styleable;->TitleBar_tb_actionPadding:I

    sget v0, Lcom/xuexiang/xui/R$attr;->xui_actionbar_action_padding:I

    .line 12
    invoke-static {p1, v0, v2}, Lkotlin/collections/u;->G(Landroid/content/Context;II)I

    move-result v0

    .line 13
    invoke-virtual {p2, p3, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 14
    sget p3, Lcom/xuexiang/xui/R$styleable;->TitleBar_tb_sideTextPadding:I

    sget v0, Lcom/xuexiang/xui/R$attr;->xui_actionbar_side_text_padding:I

    .line 15
    invoke-static {p1, v0, v2}, Lkotlin/collections/u;->G(Landroid/content/Context;II)I

    move-result v0

    .line 16
    invoke-virtual {p2, p3, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 17
    sget p3, Lcom/xuexiang/xui/R$styleable;->TitleBar_tb_centerGravity:I

    invoke-virtual {p2, p3, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p3

    iput p3, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->b:I

    .line 18
    sget p3, Lcom/xuexiang/xui/R$styleable;->TitleBar_tb_sideTextSize:I

    sget v0, Lcom/xuexiang/xui/R$attr;->xui_actionbar_action_text_size:I

    .line 19
    invoke-static {p1, v0, v2}, Lkotlin/collections/u;->G(Landroid/content/Context;II)I

    move-result v0

    .line 20
    invoke-virtual {p2, p3, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 21
    sget p3, Lcom/xuexiang/xui/R$styleable;->TitleBar_tb_titleTextSize:I

    sget v0, Lcom/xuexiang/xui/R$attr;->xui_actionbar_title_text_size:I

    .line 22
    invoke-static {p1, v0, v2}, Lkotlin/collections/u;->G(Landroid/content/Context;II)I

    move-result v0

    .line 23
    invoke-virtual {p2, p3, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 24
    sget p3, Lcom/xuexiang/xui/R$styleable;->TitleBar_tb_subTitleTextSize:I

    sget v0, Lcom/xuexiang/xui/R$attr;->xui_actionbar_sub_text_size:I

    .line 25
    invoke-static {p1, v0, v2}, Lkotlin/collections/u;->G(Landroid/content/Context;II)I

    move-result v0

    .line 26
    invoke-virtual {p2, p3, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 27
    sget p3, Lcom/xuexiang/xui/R$styleable;->TitleBar_tb_actionTextSize:I

    sget v0, Lcom/xuexiang/xui/R$attr;->xui_actionbar_action_text_size:I

    .line 28
    invoke-static {p1, v0, v2}, Lkotlin/collections/u;->G(Landroid/content/Context;II)I

    move-result p1

    .line 29
    invoke-virtual {p2, p3, p1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 30
    sget p1, Lcom/xuexiang/xui/R$styleable;->TitleBar_tb_sideTextColor:I

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p3

    sget v0, Lcom/xuexiang/xui/R$attr;->xui_actionbar_text_color:I

    invoke-static {p3, v0, v2}, Lkotlin/collections/u;->F(Landroid/content/Context;II)I

    move-result p3

    invoke-virtual {p2, p1, p3}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 31
    sget p1, Lcom/xuexiang/xui/R$styleable;->TitleBar_tb_titleTextColor:I

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p3

    sget v0, Lcom/xuexiang/xui/R$attr;->xui_actionbar_text_color:I

    invoke-static {p3, v0, v2}, Lkotlin/collections/u;->F(Landroid/content/Context;II)I

    move-result p3

    invoke-virtual {p2, p1, p3}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 32
    sget p1, Lcom/xuexiang/xui/R$styleable;->TitleBar_tb_subTitleTextColor:I

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p3

    sget v0, Lcom/xuexiang/xui/R$attr;->xui_actionbar_text_color:I

    invoke-static {p3, v0, v2}, Lkotlin/collections/u;->F(Landroid/content/Context;II)I

    move-result p3

    invoke-virtual {p2, p1, p3}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 33
    sget p1, Lcom/xuexiang/xui/R$styleable;->TitleBar_tb_actionTextColor:I

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p3

    sget v0, Lcom/xuexiang/xui/R$attr;->xui_actionbar_text_color:I

    invoke-static {p3, v0, v2}, Lkotlin/collections/u;->F(Landroid/content/Context;II)I

    move-result p3

    invoke-virtual {p2, p1, p3}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 34
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    sget p1, Lcom/xuexiang/xui/R$styleable;->TitleBar_tb_leftImageResource:I

    .line 35
    invoke-virtual {p2, p1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 36
    sget p1, Lcom/xuexiang/xui/R$styleable;->TitleBar_tb_leftText:I

    invoke-virtual {p2, p1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 37
    sget p1, Lcom/xuexiang/xui/R$styleable;->TitleBar_tb_titleText:I

    invoke-virtual {p2, p1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 38
    sget p1, Lcom/xuexiang/xui/R$styleable;->TitleBar_tb_subTitleText:I

    invoke-virtual {p2, p1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 39
    sget p1, Lcom/xuexiang/xui/R$styleable;->TitleBar_tb_dividerColor:I

    invoke-virtual {p2, p1, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 40
    invoke-static {}, Lt1/a;->a()V

    const/4 p1, 0x0

    throw p1
.end method

.method public static getStatusBarHeight()I
    .locals 4

    .line 1
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "dimen"

    .line 6
    .line 7
    const-string v2, "android"

    .line 8
    .line 9
    const-string v3, "status_bar_height"

    .line 10
    .line 11
    invoke-virtual {v0, v3, v1, v2}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-lez v1, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    return v0

    .line 22
    :cond_0
    const/4 v0, 0x0

    .line 23
    return v0
.end method


# virtual methods
.method public final a(Landroid/view/View;Lcom/xuexiang/xui/widget/alpha/XUIAlphaLinearLayout;Landroid/view/View;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-virtual {p1, v2, v2, v0, v1}, Landroid/view/View;->layout(IIII)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p3}, Landroid/view/View;->getMeasuredWidth()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    rsub-int/lit8 v0, v0, 0x0

    .line 18
    .line 19
    invoke-virtual {p3}, Landroid/view/View;->getMeasuredHeight()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    invoke-virtual {p3, v0, v2, v2, v1}, Landroid/view/View;->layout(IIII)V

    .line 24
    .line 25
    .line 26
    const/4 v0, 0x1

    .line 27
    iget v1, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->b:I

    .line 28
    .line 29
    if-ne v1, v0, :cond_0

    .line 30
    .line 31
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    .line 32
    .line 33
    .line 34
    move-result p3

    .line 35
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    rsub-int/lit8 p1, p1, 0x0

    .line 40
    .line 41
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    invoke-virtual {p2, p3, v2, p1, v0}, Landroid/view/View;->layout(IIII)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_0
    const/4 v0, 0x2

    .line 50
    if-ne v1, v0, :cond_1

    .line 51
    .line 52
    invoke-virtual {p3}, Landroid/view/View;->getMeasuredWidth()I

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    invoke-virtual {p3}, Landroid/view/View;->getMeasuredWidth()I

    .line 57
    .line 58
    .line 59
    move-result p3

    .line 60
    rsub-int/lit8 p3, p3, 0x0

    .line 61
    .line 62
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    invoke-virtual {p2, p1, v2, p3, v0}, Landroid/view/View;->layout(IIII)V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    invoke-virtual {p3}, Landroid/view/View;->getMeasuredWidth()I

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    if-le v0, v1, :cond_2

    .line 79
    .line 80
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    .line 81
    .line 82
    .line 83
    move-result p3

    .line 84
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    .line 85
    .line 86
    .line 87
    move-result p1

    .line 88
    rsub-int/lit8 p1, p1, 0x0

    .line 89
    .line 90
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    invoke-virtual {p2, p3, v2, p1, v0}, Landroid/view/View;->layout(IIII)V

    .line 95
    .line 96
    .line 97
    return-void

    .line 98
    :cond_2
    invoke-virtual {p3}, Landroid/view/View;->getMeasuredWidth()I

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    invoke-virtual {p3}, Landroid/view/View;->getMeasuredWidth()I

    .line 103
    .line 104
    .line 105
    move-result p3

    .line 106
    rsub-int/lit8 p3, p3, 0x0

    .line 107
    .line 108
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    invoke-virtual {p2, p1, v2, p3, v0}, Landroid/view/View;->layout(IIII)V

    .line 113
    .line 114
    .line 115
    return-void
.end method

.method public getActionCount()I
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    throw v0
.end method

.method public getCenterText()Landroid/widget/TextView;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getDividerView()Landroid/view/View;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getLeftText()Lcom/xuexiang/xui/widget/alpha/XUIAlphaTextView;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getSubTitleText()Landroid/widget/TextView;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 p2, 0x1

    .line 6
    const/4 p3, 0x0

    .line 7
    if-ne p1, p2, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0, p3, p3, p3}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->a(Landroid/view/View;Lcom/xuexiang/xui/widget/alpha/XUIAlphaLinearLayout;Landroid/view/View;)V

    .line 10
    .line 11
    .line 12
    throw p3

    .line 13
    :cond_0
    invoke-virtual {p0, p3, p3, p3}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->a(Landroid/view/View;Lcom/xuexiang/xui/widget/alpha/XUIAlphaLinearLayout;Landroid/view/View;)V

    .line 14
    .line 15
    .line 16
    throw p3
.end method

.method public final onMeasure(II)V
    .locals 2

    .line 1
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/high16 v1, 0x40000000    # 2.0f

    .line 6
    .line 7
    if-eq v0, v1, :cond_0

    .line 8
    .line 9
    iget p2, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->a:I

    .line 10
    .line 11
    invoke-static {p2, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 17
    .line 18
    .line 19
    :goto_0
    const/4 v0, 0x0

    .line 20
    invoke-virtual {p0, v0, p1, p2}, Landroid/view/ViewGroup;->measureChild(Landroid/view/View;II)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v0, p1, p2}, Landroid/view/ViewGroup;->measureChild(Landroid/view/View;II)V

    .line 24
    .line 25
    .line 26
    throw v0
.end method

.method public setTypeface(Landroid/graphics/Typeface;)V
    .locals 0

    return-void
.end method
