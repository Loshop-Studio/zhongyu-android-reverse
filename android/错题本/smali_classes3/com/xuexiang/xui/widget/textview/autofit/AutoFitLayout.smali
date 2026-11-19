.class public Lcom/xuexiang/xui/widget/textview/autofit/AutoFitLayout;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# instance fields
.field public a:Z

.field public b:F

.field public c:F

.field public final d:Ljava/util/WeakHashMap;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 2
    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/autofit/AutoFitLayout;->d:Ljava/util/WeakHashMap;

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 3
    invoke-virtual {p0, p1, v0, v1}, Lcom/xuexiang/xui/widget/textview/autofit/AutoFitLayout;->a(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 4
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 5
    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/autofit/AutoFitLayout;->d:Ljava/util/WeakHashMap;

    const/4 v0, 0x0

    .line 6
    invoke-virtual {p0, p1, p2, v0}, Lcom/xuexiang/xui/widget/textview/autofit/AutoFitLayout;->a(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 7
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 8
    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/autofit/AutoFitLayout;->d:Ljava/util/WeakHashMap;

    .line 9
    invoke-virtual {p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/textview/autofit/AutoFitLayout;->a(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, -0x1

    .line 3
    const/high16 v2, -0x40800000    # -1.0f

    .line 4
    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    sget-object v3, Lcom/xuexiang/xui/R$styleable;->AutoFitTextView:[I

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-virtual {p1, p2, v3, p3, v4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    sget p2, Lcom/xuexiang/xui/R$styleable;->AutoFitTextView_aftv_enable:I

    .line 15
    .line 16
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    sget p2, Lcom/xuexiang/xui/R$styleable;->AutoFitTextView_aftv_minTextSize:I

    .line 21
    .line 22
    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    sget p2, Lcom/xuexiang/xui/R$styleable;->AutoFitTextView_aftv_precision:I

    .line 27
    .line 28
    invoke-virtual {p1, p2, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 33
    .line 34
    .line 35
    :cond_0
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/textview/autofit/AutoFitLayout;->a:Z

    .line 36
    .line 37
    int-to-float p1, v1

    .line 38
    iput p1, p0, Lcom/xuexiang/xui/widget/textview/autofit/AutoFitLayout;->b:F

    .line 39
    .line 40
    iput v2, p0, Lcom/xuexiang/xui/widget/textview/autofit/AutoFitLayout;->c:F

    .line 41
    .line 42
    return-void
.end method

.method public final addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
    .locals 3

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 2
    .line 3
    .line 4
    instance-of p2, p1, Landroid/widget/TextView;

    .line 5
    .line 6
    if-eqz p2, :cond_2

    .line 7
    .line 8
    check-cast p1, Landroid/widget/TextView;

    .line 9
    .line 10
    const/4 p2, 0x0

    .line 11
    const/4 p3, 0x0

    .line 12
    invoke-static {p1, p2, p3}, Ls3/c;->b(Landroid/widget/TextView;Landroid/util/AttributeSet;I)Ls3/c;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/textview/autofit/AutoFitLayout;->a:Z

    .line 17
    .line 18
    invoke-virtual {p2, v0}, Ls3/c;->d(Z)V

    .line 19
    .line 20
    .line 21
    iget v0, p0, Lcom/xuexiang/xui/widget/textview/autofit/AutoFitLayout;->c:F

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    cmpl-float v2, v0, v1

    .line 25
    .line 26
    if-lez v2, :cond_0

    .line 27
    .line 28
    iget v2, p2, Ls3/c;->g:F

    .line 29
    .line 30
    cmpl-float v2, v2, v0

    .line 31
    .line 32
    if-eqz v2, :cond_0

    .line 33
    .line 34
    iput v0, p2, Ls3/c;->g:F

    .line 35
    .line 36
    invoke-virtual {p2}, Ls3/c;->a()V

    .line 37
    .line 38
    .line 39
    :cond_0
    iget v0, p0, Lcom/xuexiang/xui/widget/textview/autofit/AutoFitLayout;->b:F

    .line 40
    .line 41
    cmpl-float v1, v0, v1

    .line 42
    .line 43
    if-lez v1, :cond_1

    .line 44
    .line 45
    invoke-virtual {p2, v0, p3}, Ls3/c;->e(FI)V

    .line 46
    .line 47
    .line 48
    :cond_1
    iget-object p3, p0, Lcom/xuexiang/xui/widget/textview/autofit/AutoFitLayout;->d:Ljava/util/WeakHashMap;

    .line 49
    .line 50
    invoke-virtual {p3, p1, p2}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    :cond_2
    return-void
.end method
