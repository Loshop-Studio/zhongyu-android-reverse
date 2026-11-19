.class public Lcom/xuexiang/xui/widget/textview/autofit/AutoFitLayout;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# instance fields
.field private mEnabled:Z

.field private mHelpers:Ljava/util/WeakHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/WeakHashMap<",
            "Landroid/view/View;",
            "Lcom/xuexiang/xui/widget/textview/autofit/AutoFitHelper;",
            ">;"
        }
    .end annotation
.end field

.field private mMinTextSize:F

.field private mPrecision:F


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 2
    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/autofit/AutoFitLayout;->mHelpers:Ljava/util/WeakHashMap;

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 3
    invoke-direct {p0, p1, v0, v1}, Lcom/xuexiang/xui/widget/textview/autofit/AutoFitLayout;->init(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 4
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 5
    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/autofit/AutoFitLayout;->mHelpers:Ljava/util/WeakHashMap;

    const/4 v0, 0x0

    .line 6
    invoke-direct {p0, p1, p2, v0}, Lcom/xuexiang/xui/widget/textview/autofit/AutoFitLayout;->init(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 7
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 8
    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/autofit/AutoFitLayout;->mHelpers:Ljava/util/WeakHashMap;

    .line 9
    invoke-direct {p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/textview/autofit/AutoFitLayout;->init(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private init(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 5

    const/4 v0, 0x1

    const/4 v1, -0x1

    const/high16 v2, -0x40800000    # -1.0f

    if-eqz p2, :cond_0

    .line 1
    sget-object v3, Lcom/xuexiang/xui/R$styleable;->AutoFitTextView:[I

    const/4 v4, 0x0

    invoke-virtual {p1, p2, v3, p3, v4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 2
    sget p2, Lcom/xuexiang/xui/R$styleable;->AutoFitTextView_aftv_enable:I

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    .line 3
    sget p2, Lcom/xuexiang/xui/R$styleable;->AutoFitTextView_aftv_minTextSize:I

    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v1

    .line 4
    sget p2, Lcom/xuexiang/xui/R$styleable;->AutoFitTextView_aftv_precision:I

    invoke-virtual {p1, p2, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    .line 5
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 6
    :cond_0
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/textview/autofit/AutoFitLayout;->mEnabled:Z

    int-to-float p1, v1

    .line 7
    iput p1, p0, Lcom/xuexiang/xui/widget/textview/autofit/AutoFitLayout;->mMinTextSize:F

    .line 8
    iput v2, p0, Lcom/xuexiang/xui/widget/textview/autofit/AutoFitLayout;->mPrecision:F

    return-void
.end method


# virtual methods
.method public addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
    .locals 2

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 2
    instance-of p2, p1, Landroid/widget/TextView;

    if-eqz p2, :cond_2

    .line 3
    check-cast p1, Landroid/widget/TextView;

    .line 4
    invoke-static {p1}, Lcom/xuexiang/xui/widget/textview/autofit/AutoFitHelper;->create(Landroid/widget/TextView;)Lcom/xuexiang/xui/widget/textview/autofit/AutoFitHelper;

    move-result-object p2

    iget-boolean p3, p0, Lcom/xuexiang/xui/widget/textview/autofit/AutoFitLayout;->mEnabled:Z

    invoke-virtual {p2, p3}, Lcom/xuexiang/xui/widget/textview/autofit/AutoFitHelper;->setEnabled(Z)Lcom/xuexiang/xui/widget/textview/autofit/AutoFitHelper;

    move-result-object p2

    .line 5
    iget p3, p0, Lcom/xuexiang/xui/widget/textview/autofit/AutoFitLayout;->mPrecision:F

    const/4 v0, 0x0

    cmpl-float v1, p3, v0

    if-lez v1, :cond_0

    .line 6
    invoke-virtual {p2, p3}, Lcom/xuexiang/xui/widget/textview/autofit/AutoFitHelper;->setPrecision(F)Lcom/xuexiang/xui/widget/textview/autofit/AutoFitHelper;

    .line 7
    :cond_0
    iget p3, p0, Lcom/xuexiang/xui/widget/textview/autofit/AutoFitLayout;->mMinTextSize:F

    cmpl-float v0, p3, v0

    if-lez v0, :cond_1

    const/4 v0, 0x0

    .line 8
    invoke-virtual {p2, v0, p3}, Lcom/xuexiang/xui/widget/textview/autofit/AutoFitHelper;->setMinTextSize(IF)Lcom/xuexiang/xui/widget/textview/autofit/AutoFitHelper;

    .line 9
    :cond_1
    iget-object p3, p0, Lcom/xuexiang/xui/widget/textview/autofit/AutoFitLayout;->mHelpers:Ljava/util/WeakHashMap;

    invoke-virtual {p3, p1, p2}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    return-void
.end method

.method public getAutofitHelper(I)Lcom/xuexiang/xui/widget/textview/autofit/AutoFitHelper;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/autofit/AutoFitLayout;->mHelpers:Ljava/util/WeakHashMap;

    invoke-virtual {p0, p1}, Landroid/widget/FrameLayout;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/xuexiang/xui/widget/textview/autofit/AutoFitHelper;

    return-object p1
.end method

.method public getAutofitHelper(Landroid/widget/TextView;)Lcom/xuexiang/xui/widget/textview/autofit/AutoFitHelper;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/autofit/AutoFitLayout;->mHelpers:Ljava/util/WeakHashMap;

    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/xuexiang/xui/widget/textview/autofit/AutoFitHelper;

    return-object p1
.end method
