.class public Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;
.super Landroid/view/ViewGroup;
.source "SourceFile"


# static fields
.field private static final INDEX_NEGATIVE:I = 0x1

.field private static final INDEX_NEUTRAL:I = 0x0

.field private static final INDEX_POSITIVE:I = 0x2


# instance fields
.field private bottomOnScrollChangedListener:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

.field private buttonBarHeight:I

.field private buttonGravity:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

.field private buttonHorizontalEdgeMargin:I

.field private buttonPaddingFull:I

.field private final buttons:[Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

.field private content:Landroid/view/View;

.field private dividerPaint:Landroid/graphics/Paint;

.field private dividerWidth:I

.field private drawBottomDivider:Z

.field private drawTopDivider:Z

.field private isStacked:Z

.field private maxHeight:I

.field private noTitleNoPadding:Z

.field private noTitlePaddingFull:I

.field private reducePaddingNoTitleNoButtons:Z

.field private stackBehavior:Lcom/xuexiang/xui/widget/dialog/materialdialog/StackingBehavior;

.field private titleBar:Landroid/view/View;

.field private topOnScrollChangedListener:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

.field private useFullPadding:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v1, 0x3

    new-array v1, v1, [Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 2
    iput-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->buttons:[Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    const/4 v1, 0x0

    .line 3
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->drawTopDivider:Z

    .line 4
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->drawBottomDivider:Z

    .line 5
    sget-object v2, Lcom/xuexiang/xui/widget/dialog/materialdialog/StackingBehavior;->ADAPTIVE:Lcom/xuexiang/xui/widget/dialog/materialdialog/StackingBehavior;

    iput-object v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->stackBehavior:Lcom/xuexiang/xui/widget/dialog/materialdialog/StackingBehavior;

    .line 6
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->isStacked:Z

    const/4 v2, 0x1

    .line 7
    iput-boolean v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->useFullPadding:Z

    .line 8
    sget-object v2, Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;->START:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    iput-object v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->buttonGravity:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 9
    invoke-direct {p0, p1, v0, v1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->init(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    const/4 v0, 0x0

    .line 10
    invoke-direct {p0, p1, p2, v0}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 v1, 0x3

    new-array v1, v1, [Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 11
    iput-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->buttons:[Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 12
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->drawTopDivider:Z

    .line 13
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->drawBottomDivider:Z

    .line 14
    sget-object v1, Lcom/xuexiang/xui/widget/dialog/materialdialog/StackingBehavior;->ADAPTIVE:Lcom/xuexiang/xui/widget/dialog/materialdialog/StackingBehavior;

    iput-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->stackBehavior:Lcom/xuexiang/xui/widget/dialog/materialdialog/StackingBehavior;

    .line 15
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->isStacked:Z

    const/4 v1, 0x1

    .line 16
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->useFullPadding:Z

    .line 17
    sget-object v1, Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;->START:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    iput-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->buttonGravity:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 18
    invoke-direct {p0, p1, p2, v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->init(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0xb
    .end annotation

    .line 19
    invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 v0, 0x3

    new-array v0, v0, [Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 20
    iput-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->buttons:[Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    const/4 v0, 0x0

    .line 21
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->drawTopDivider:Z

    .line 22
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->drawBottomDivider:Z

    .line 23
    sget-object v1, Lcom/xuexiang/xui/widget/dialog/materialdialog/StackingBehavior;->ADAPTIVE:Lcom/xuexiang/xui/widget/dialog/materialdialog/StackingBehavior;

    iput-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->stackBehavior:Lcom/xuexiang/xui/widget/dialog/materialdialog/StackingBehavior;

    .line 24
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->isStacked:Z

    const/4 v0, 0x1

    .line 25
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->useFullPadding:Z

    .line 26
    sget-object v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;->START:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    iput-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->buttonGravity:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 27
    invoke-direct {p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->init(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 1
    .annotation build Landroid/annotation/TargetApi;
        value = 0x15
    .end annotation

    .line 28
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    const/4 p4, 0x3

    new-array p4, p4, [Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 29
    iput-object p4, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->buttons:[Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    const/4 p4, 0x0

    .line 30
    iput-boolean p4, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->drawTopDivider:Z

    .line 31
    iput-boolean p4, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->drawBottomDivider:Z

    .line 32
    sget-object v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/StackingBehavior;->ADAPTIVE:Lcom/xuexiang/xui/widget/dialog/materialdialog/StackingBehavior;

    iput-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->stackBehavior:Lcom/xuexiang/xui/widget/dialog/materialdialog/StackingBehavior;

    .line 33
    iput-boolean p4, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->isStacked:Z

    const/4 p4, 0x1

    .line 34
    iput-boolean p4, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->useFullPadding:Z

    .line 35
    sget-object p4, Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;->START:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    iput-object p4, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->buttonGravity:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 36
    invoke-direct {p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->init(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method static synthetic access$000(Landroid/webkit/WebView;)Z
    .locals 0

    invoke-static {p0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->canWebViewScroll(Landroid/webkit/WebView;)Z

    move-result p0

    return p0
.end method

.method static synthetic access$102(Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->drawTopDivider:Z

    return p1
.end method

.method static synthetic access$202(Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->drawBottomDivider:Z

    return p1
.end method

.method static synthetic access$300(Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;Landroid/view/ViewGroup;ZZ)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->addScrollListener(Landroid/view/ViewGroup;ZZ)V

    return-void
.end method

.method static synthetic access$400(Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;)[Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->buttons:[Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    return-object p0
.end method

.method static synthetic access$500(Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;Landroid/view/ViewGroup;ZZZ)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->invalidateDividersForScrollingView(Landroid/view/ViewGroup;ZZZ)V

    return-void
.end method

.method static synthetic access$600(Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;Landroid/webkit/WebView;ZZZ)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->invalidateDividersForWebView(Landroid/webkit/WebView;ZZZ)V

    return-void
.end method

.method private addScrollListener(Landroid/view/ViewGroup;ZZ)V
    .locals 1

    if-nez p3, :cond_0

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->topOnScrollChangedListener:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

    if-eqz v0, :cond_1

    :cond_0
    if-eqz p3, :cond_4

    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->bottomOnScrollChangedListener:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

    if-nez v0, :cond_4

    .line 2
    :cond_1
    instance-of v0, p1, Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_2

    .line 3
    new-instance v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout$2;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout$2;-><init>(Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;Landroid/view/ViewGroup;ZZ)V

    .line 4
    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->addOnScrollListener(Landroidx/recyclerview/widget/RecyclerView$s;)V

    const/4 p2, 0x0

    .line 5
    invoke-virtual {v0, p1, p2, p2}, Landroidx/recyclerview/widget/RecyclerView$s;->onScrolled(Landroidx/recyclerview/widget/RecyclerView;II)V

    goto :goto_1

    .line 6
    :cond_2
    new-instance v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout$3;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout$3;-><init>(Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;Landroid/view/ViewGroup;ZZ)V

    if-nez p3, :cond_3

    .line 7
    iput-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->topOnScrollChangedListener:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

    .line 8
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object p1

    iget-object p2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->topOnScrollChangedListener:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

    invoke-virtual {p1, p2}, Landroid/view/ViewTreeObserver;->addOnScrollChangedListener(Landroid/view/ViewTreeObserver$OnScrollChangedListener;)V

    goto :goto_0

    .line 9
    :cond_3
    iput-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->bottomOnScrollChangedListener:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

    .line 10
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object p1

    iget-object p2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->bottomOnScrollChangedListener:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

    invoke-virtual {p1, p2}, Landroid/view/ViewTreeObserver;->addOnScrollChangedListener(Landroid/view/ViewTreeObserver$OnScrollChangedListener;)V

    .line 11
    :goto_0
    invoke-interface {v0}, Landroid/view/ViewTreeObserver$OnScrollChangedListener;->onScrollChanged()V

    :cond_4
    :goto_1
    return-void
.end method

.method private static canAdapterViewScroll(Landroid/widget/AdapterView;)Z
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroid/widget/AdapterView;->getLastVisiblePosition()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, -0x1

    if-ne v0, v2, :cond_0

    return v1

    .line 2
    :cond_0
    invoke-virtual {p0}, Landroid/widget/AdapterView;->getFirstVisiblePosition()I

    move-result v0

    const/4 v2, 0x1

    if-nez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 3
    :goto_0
    invoke-virtual {p0}, Landroid/widget/AdapterView;->getLastVisiblePosition()I

    move-result v3

    invoke-virtual {p0}, Landroid/widget/AdapterView;->getCount()I

    move-result v4

    sub-int/2addr v4, v2

    if-ne v3, v4, :cond_2

    const/4 v3, 0x1

    goto :goto_1

    :cond_2
    const/4 v3, 0x0

    :goto_1
    if-eqz v0, :cond_5

    if-eqz v3, :cond_5

    .line 4
    invoke-virtual {p0}, Landroid/widget/AdapterView;->getChildCount()I

    move-result v0

    if-lez v0, :cond_5

    .line 5
    invoke-virtual {p0, v1}, Landroid/widget/AdapterView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v0

    invoke-virtual {p0}, Landroid/widget/AdapterView;->getPaddingTop()I

    move-result v3

    if-ge v0, v3, :cond_3

    return v2

    .line 6
    :cond_3
    invoke-virtual {p0}, Landroid/widget/AdapterView;->getChildCount()I

    move-result v0

    sub-int/2addr v0, v2

    invoke-virtual {p0, v0}, Landroid/widget/AdapterView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getBottom()I

    move-result v0

    .line 7
    invoke-virtual {p0}, Landroid/widget/AdapterView;->getHeight()I

    move-result v3

    invoke-virtual {p0}, Landroid/widget/AdapterView;->getPaddingBottom()I

    move-result p0

    sub-int/2addr v3, p0

    if-le v0, v3, :cond_4

    const/4 v1, 0x1

    :cond_4
    return v1

    :cond_5
    return v2
.end method

.method public static canRecyclerViewScroll(Landroidx/recyclerview/widget/RecyclerView;)Z
    .locals 1

    if-eqz p0, :cond_0

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$o;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$o;

    move-result-object p0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->canScrollVertically()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static canScrollViewScroll(Landroid/widget/ScrollView;)Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/widget/ScrollView;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 2
    :cond_0
    invoke-virtual {p0, v1}, Landroid/widget/ScrollView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    .line 3
    invoke-virtual {p0}, Landroid/widget/ScrollView;->getMeasuredHeight()I

    move-result v2

    invoke-virtual {p0}, Landroid/widget/ScrollView;->getPaddingTop()I

    move-result v3

    sub-int/2addr v2, v3

    invoke-virtual {p0}, Landroid/widget/ScrollView;->getPaddingBottom()I

    move-result p0

    sub-int/2addr v2, p0

    if-ge v2, v0, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method private static canWebViewScroll(Landroid/webkit/WebView;)Z
    .locals 2

    invoke-virtual {p0}, Landroid/webkit/WebView;->getMeasuredHeight()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p0}, Landroid/webkit/WebView;->getContentHeight()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {p0}, Landroid/webkit/WebView;->getScale()F

    move-result p0

    mul-float v1, v1, p0

    cmpg-float p0, v0, v1

    if-gez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static getBottomView(Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 5

    const/4 v0, 0x0

    if-eqz p0, :cond_2

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    if-nez v1, :cond_0

    goto :goto_1

    .line 2
    :cond_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    :goto_0
    if-ltz v1, :cond_2

    .line 3
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 4
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    move-result v3

    if-nez v3, :cond_1

    .line 5
    invoke-virtual {v2}, Landroid/view/View;->getBottom()I

    move-result v3

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getMeasuredHeight()I

    move-result v4

    if-ne v3, v4, :cond_1

    move-object v0, v2

    goto :goto_1

    :cond_1
    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_2
    :goto_1
    return-object v0
.end method

.method private static getTopView(Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 4

    const/4 v0, 0x0

    if-eqz p0, :cond_2

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    if-nez v1, :cond_0

    goto :goto_1

    .line 2
    :cond_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    :goto_0
    if-ltz v1, :cond_2

    .line 3
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 4
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    move-result v3

    if-nez v3, :cond_1

    invoke-virtual {v2}, Landroid/view/View;->getTop()I

    move-result v3

    if-nez v3, :cond_1

    move-object v0, v2

    goto :goto_1

    :cond_1
    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_2
    :goto_1
    return-object v0
.end method

.method private init(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 2
    sget-object v1, Lcom/xuexiang/xui/R$styleable;->MDRootLayout:[I

    const/4 v2, 0x0

    invoke-virtual {p1, p2, v1, p3, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p2

    .line 3
    sget p3, Lcom/xuexiang/xui/R$styleable;->MDRootLayout_md_reduce_padding_no_title_no_buttons:I

    const/4 v1, 0x1

    invoke-virtual {p2, p3, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p3

    iput-boolean p3, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->reducePaddingNoTitleNoButtons:Z

    .line 4
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 5
    sget p2, Lcom/xuexiang/xui/R$dimen;->md_notitle_vertical_padding:I

    invoke-virtual {v0, p2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->noTitlePaddingFull:I

    .line 6
    sget p2, Lcom/xuexiang/xui/R$dimen;->md_button_frame_vertical_padding:I

    invoke-virtual {v0, p2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->buttonPaddingFull:I

    .line 7
    sget p2, Lcom/xuexiang/xui/R$dimen;->md_button_padding_frame_side:I

    invoke-virtual {v0, p2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->buttonHorizontalEdgeMargin:I

    .line 8
    sget p2, Lcom/xuexiang/xui/R$attr;->md_button_height:I

    sget p3, Lcom/xuexiang/xui/R$dimen;->default_md_button_height_phone:I

    invoke-virtual {v0, p3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p3

    invoke-static {p1, p2, p3}, Lcom/xuexiang/xui/utils/ThemeUtils;->resolveDimension(Landroid/content/Context;II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->buttonBarHeight:I

    .line 9
    new-instance p2, Landroid/graphics/Paint;

    invoke-direct {p2}, Landroid/graphics/Paint;-><init>()V

    iput-object p2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->dividerPaint:Landroid/graphics/Paint;

    .line 10
    sget p2, Lcom/xuexiang/xui/R$dimen;->md_divider_height:I

    invoke-virtual {v0, p2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->dividerWidth:I

    .line 11
    iget-object p2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->dividerPaint:Landroid/graphics/Paint;

    sget p3, Lcom/xuexiang/xui/R$attr;->md_divider_color:I

    invoke-static {p1, p3}, Lcom/xuexiang/xui/utils/ThemeUtils;->resolveColor(Landroid/content/Context;I)I

    move-result p1

    invoke-virtual {p2, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 12
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->setWillNotDraw(Z)V

    return-void
.end method

.method private invalidateDividersForScrollingView(Landroid/view/ViewGroup;ZZZ)V
    .locals 3

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p2, :cond_1

    .line 1
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p2

    if-lez p2, :cond_1

    .line 2
    iget-object p2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->titleBar:Landroid/view/View;

    if-eqz p2, :cond_0

    .line 3
    invoke-virtual {p2}, Landroid/view/View;->getVisibility()I

    move-result p2

    const/16 v2, 0x8

    if-eq p2, v2, :cond_0

    .line 4
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getScrollY()I

    move-result p2

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v2

    add-int/2addr p2, v2

    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getTop()I

    move-result v2

    if-le p2, v2, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    iput-boolean p2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->drawTopDivider:Z

    :cond_1
    if-eqz p3, :cond_3

    .line 5
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p2

    if-lez p2, :cond_3

    if-eqz p4, :cond_2

    .line 6
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getScrollY()I

    move-result p2

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getHeight()I

    move-result p3

    add-int/2addr p2, p3

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getPaddingBottom()I

    move-result p3

    sub-int/2addr p2, p3

    .line 7
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p3

    sub-int/2addr p3, v0

    invoke-virtual {p1, p3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getBottom()I

    move-result p1

    if-ge p2, p1, :cond_2

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->drawBottomDivider:Z

    :cond_3
    return-void
.end method

.method private invalidateDividersForWebView(Landroid/webkit/WebView;ZZZ)V
    .locals 3

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p2, :cond_1

    .line 1
    iget-object p2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->titleBar:Landroid/view/View;

    if-eqz p2, :cond_0

    .line 2
    invoke-virtual {p2}, Landroid/view/View;->getVisibility()I

    move-result p2

    const/16 v2, 0x8

    if-eq p2, v2, :cond_0

    .line 3
    invoke-virtual {p1}, Landroid/webkit/WebView;->getScrollY()I

    move-result p2

    invoke-virtual {p1}, Landroid/webkit/WebView;->getPaddingTop()I

    move-result v2

    add-int/2addr p2, v2

    if-lez p2, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    iput-boolean p2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->drawTopDivider:Z

    :cond_1
    if-eqz p3, :cond_3

    if-eqz p4, :cond_2

    .line 4
    invoke-virtual {p1}, Landroid/webkit/WebView;->getScrollY()I

    move-result p2

    invoke-virtual {p1}, Landroid/webkit/WebView;->getMeasuredHeight()I

    move-result p3

    add-int/2addr p2, p3

    invoke-virtual {p1}, Landroid/webkit/WebView;->getPaddingBottom()I

    move-result p3

    sub-int/2addr p2, p3

    int-to-float p2, p2

    .line 5
    invoke-virtual {p1}, Landroid/webkit/WebView;->getContentHeight()I

    move-result p3

    int-to-float p3, p3

    invoke-virtual {p1}, Landroid/webkit/WebView;->getScale()F

    move-result p1

    mul-float p3, p3, p1

    cmpg-float p1, p2, p3

    if-gez p1, :cond_2

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->drawBottomDivider:Z

    :cond_3
    return-void
.end method

.method private invertGravityIfNecessary()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Landroid/content/res/Configuration;->getLayoutDirection()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 3
    sget-object v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout$4;->$SwitchMap$com$xuexiang$xui$widget$dialog$materialdialog$GravityEnum:[I

    iget-object v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->buttonGravity:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v0, v0, v2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    sget-object v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;->START:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    iput-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->buttonGravity:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    goto :goto_0

    .line 5
    :cond_1
    sget-object v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;->END:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    iput-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->buttonGravity:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    :cond_2
    :goto_0
    return-void
.end method

.method private static isVisible(Landroid/view/View;)Z
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p0, :cond_0

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    move-result v2

    const/16 v3, 0x8

    if-eq v2, v3, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_2

    .line 2
    instance-of v3, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    if-eqz v3, :cond_2

    .line 3
    check-cast p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    invoke-virtual {p0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object p0

    invoke-interface {p0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p0

    if-lez p0, :cond_1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    move v2, v0

    :cond_2
    return v2
.end method

.method private setUpDividersVisibility(Landroid/view/View;ZZ)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    .line 1
    :cond_0
    instance-of v0, p1, Landroid/widget/ScrollView;

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    .line 2
    check-cast p1, Landroid/widget/ScrollView;

    .line 3
    invoke-static {p1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->canScrollViewScroll(Landroid/widget/ScrollView;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 4
    invoke-direct {p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->addScrollListener(Landroid/view/ViewGroup;ZZ)V

    goto :goto_0

    :cond_1
    if-eqz p2, :cond_2

    .line 5
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->drawTopDivider:Z

    :cond_2
    if-eqz p3, :cond_b

    .line 6
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->drawBottomDivider:Z

    goto :goto_0

    .line 7
    :cond_3
    instance-of v0, p1, Landroid/widget/AdapterView;

    if-eqz v0, :cond_6

    .line 8
    check-cast p1, Landroid/widget/AdapterView;

    .line 9
    invoke-static {p1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->canAdapterViewScroll(Landroid/widget/AdapterView;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 10
    invoke-direct {p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->addScrollListener(Landroid/view/ViewGroup;ZZ)V

    goto :goto_0

    :cond_4
    if-eqz p2, :cond_5

    .line 11
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->drawTopDivider:Z

    :cond_5
    if-eqz p3, :cond_b

    .line 12
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->drawBottomDivider:Z

    goto :goto_0

    .line 13
    :cond_6
    instance-of v0, p1, Landroid/webkit/WebView;

    if-eqz v0, :cond_7

    .line 14
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    new-instance v1, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout$1;

    invoke-direct {v1, p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout$1;-><init>(Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;Landroid/view/View;ZZ)V

    .line 15
    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    goto :goto_0

    .line 16
    :cond_7
    instance-of v0, p1, Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_a

    .line 17
    move-object v0, p1

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->canRecyclerViewScroll(Landroidx/recyclerview/widget/RecyclerView;)Z

    move-result v0

    if-eqz p2, :cond_8

    .line 18
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->drawTopDivider:Z

    :cond_8
    if-eqz p3, :cond_9

    .line 19
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->drawBottomDivider:Z

    :cond_9
    if-eqz v0, :cond_b

    .line 20
    check-cast p1, Landroid/view/ViewGroup;

    invoke-direct {p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->addScrollListener(Landroid/view/ViewGroup;ZZ)V

    goto :goto_0

    .line 21
    :cond_a
    instance-of v0, p1, Landroid/view/ViewGroup;

    if-eqz v0, :cond_b

    .line 22
    check-cast p1, Landroid/view/ViewGroup;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->getTopView(Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    .line 23
    invoke-direct {p0, v0, p2, p3}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->setUpDividersVisibility(Landroid/view/View;ZZ)V

    .line 24
    invoke-static {p1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->getBottomView(Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    if-eq p1, v0, :cond_b

    const/4 p2, 0x1

    .line 25
    invoke-direct {p0, p1, v1, p2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->setUpDividersVisibility(Landroid/view/View;ZZ)V

    :cond_b
    :goto_0
    return-void
.end method


# virtual methods
.method public noTitleNoPadding()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->noTitleNoPadding:Z

    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 7

    .line 1
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onDraw(Landroid/graphics/Canvas;)V

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->content:Landroid/view/View;

    if-eqz v0, :cond_1

    .line 3
    iget-boolean v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->drawTopDivider:Z

    if-eqz v1, :cond_0

    .line 4
    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v0

    const/4 v2, 0x0

    .line 5
    iget v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->dividerWidth:I

    sub-int v1, v0, v1

    int-to-float v3, v1

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getMeasuredWidth()I

    move-result v1

    int-to-float v4, v1

    int-to-float v5, v0

    iget-object v6, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->dividerPaint:Landroid/graphics/Paint;

    move-object v1, p1

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 6
    :cond_0
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->drawBottomDivider:Z

    if-eqz v0, :cond_1

    .line 7
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->content:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getBottom()I

    move-result v0

    const/4 v2, 0x0

    int-to-float v3, v0

    .line 8
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getMeasuredWidth()I

    move-result v1

    int-to-float v4, v1

    iget v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->dividerWidth:I

    add-int/2addr v0, v1

    int-to-float v5, v0

    iget-object v6, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->dividerPaint:Landroid/graphics/Paint;

    move-object v1, p1

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    :cond_1
    return-void
.end method

.method public onFinishInflate()V
    .locals 5

    .line 1
    invoke-super {p0}, Landroid/view/ViewGroup;->onFinishInflate()V

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 2
    :goto_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v2

    if-ge v1, v2, :cond_4

    .line 3
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 4
    invoke-virtual {v2}, Landroid/view/View;->getId()I

    move-result v3

    sget v4, Lcom/xuexiang/xui/R$id;->md_titleFrame:I

    if-ne v3, v4, :cond_0

    .line 5
    iput-object v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->titleBar:Landroid/view/View;

    goto :goto_1

    .line 6
    :cond_0
    invoke-virtual {v2}, Landroid/view/View;->getId()I

    move-result v3

    sget v4, Lcom/xuexiang/xui/R$id;->md_buttonDefaultNeutral:I

    if-ne v3, v4, :cond_1

    .line 7
    iget-object v3, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->buttons:[Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    check-cast v2, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    aput-object v2, v3, v0

    goto :goto_1

    .line 8
    :cond_1
    invoke-virtual {v2}, Landroid/view/View;->getId()I

    move-result v3

    sget v4, Lcom/xuexiang/xui/R$id;->md_buttonDefaultNegative:I

    if-ne v3, v4, :cond_2

    .line 9
    iget-object v3, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->buttons:[Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    check-cast v2, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    const/4 v4, 0x1

    aput-object v2, v3, v4

    goto :goto_1

    .line 10
    :cond_2
    invoke-virtual {v2}, Landroid/view/View;->getId()I

    move-result v3

    sget v4, Lcom/xuexiang/xui/R$id;->md_buttonDefaultPositive:I

    if-ne v3, v4, :cond_3

    .line 11
    iget-object v3, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->buttons:[Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    const/4 v4, 0x2

    check-cast v2, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    aput-object v2, v3, v4

    goto :goto_1

    .line 12
    :cond_3
    iput-object v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->content:Landroid/view/View;

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_4
    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 8

    .line 1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->titleBar:Landroid/view/View;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->isVisible(Landroid/view/View;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->titleBar:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result p1

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->titleBar:Landroid/view/View;

    add-int/2addr p1, p3

    invoke-virtual {v0, p2, p3, p4, p1}, Landroid/view/View;->layout(IIII)V

    move p3, p1

    goto :goto_0

    .line 4
    :cond_0
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->noTitleNoPadding:Z

    if-nez p1, :cond_1

    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->useFullPadding:Z

    if-eqz p1, :cond_1

    .line 5
    iget p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->noTitlePaddingFull:I

    add-int/2addr p3, p1

    .line 6
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->content:Landroid/view/View;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->isVisible(Landroid/view/View;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 7
    iget-object p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->content:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    add-int/2addr v0, p3

    invoke-virtual {p1, p2, p3, p4, v0}, Landroid/view/View;->layout(IIII)V

    .line 8
    :cond_2
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->isStacked:Z

    const/4 p3, 0x1

    const/4 v0, 0x0

    if-eqz p1, :cond_4

    .line 9
    iget p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->buttonPaddingFull:I

    sub-int/2addr p5, p1

    .line 10
    iget-object p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->buttons:[Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    array-length v1, p1

    :goto_1
    if-ge v0, v1, :cond_10

    aget-object v2, p1, v0

    .line 11
    invoke-static {v2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->isVisible(Landroid/view/View;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 12
    invoke-virtual {v2}, Landroid/widget/TextView;->getMeasuredHeight()I

    move-result v3

    sub-int v3, p5, v3

    invoke-virtual {v2, p2, v3, p4, p5}, Landroid/widget/TextView;->layout(IIII)V

    .line 13
    invoke-virtual {v2}, Landroid/widget/TextView;->getMeasuredHeight()I

    move-result v2

    sub-int/2addr p5, v2

    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 14
    :cond_4
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->useFullPadding:Z

    if-eqz p1, :cond_5

    .line 15
    iget p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->buttonPaddingFull:I

    sub-int/2addr p5, p1

    .line 16
    :cond_5
    iget p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->buttonBarHeight:I

    sub-int p1, p5, p1

    .line 17
    iget v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->buttonHorizontalEdgeMargin:I

    .line 18
    iget-object v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->buttons:[Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    const/4 v3, 0x2

    aget-object v2, v2, v3

    invoke-static {v2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->isVisible(Landroid/view/View;)Z

    move-result v2

    const/4 v4, -0x1

    if-eqz v2, :cond_7

    .line 19
    iget-object v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->buttonGravity:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    sget-object v5, Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;->END:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    if-ne v2, v5, :cond_6

    add-int v2, p2, v1

    .line 20
    iget-object v5, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->buttons:[Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    aget-object v5, v5, v3

    invoke-virtual {v5}, Landroid/widget/TextView;->getMeasuredWidth()I

    move-result v5

    add-int/2addr v5, v2

    move v6, v5

    const/4 v5, -0x1

    goto :goto_2

    :cond_6
    sub-int v5, p4, v1

    .line 21
    iget-object v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->buttons:[Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    aget-object v2, v2, v3

    invoke-virtual {v2}, Landroid/widget/TextView;->getMeasuredWidth()I

    move-result v2

    sub-int v2, v5, v2

    move v6, v5

    move v5, v2

    .line 22
    :goto_2
    iget-object v7, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->buttons:[Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    aget-object v7, v7, v3

    invoke-virtual {v7, v2, p1, v6, p5}, Landroid/widget/TextView;->layout(IIII)V

    .line 23
    iget-object v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->buttons:[Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    aget-object v2, v2, v3

    invoke-virtual {v2}, Landroid/widget/TextView;->getMeasuredWidth()I

    move-result v2

    add-int/2addr v1, v2

    goto :goto_3

    :cond_7
    const/4 v5, -0x1

    .line 24
    :goto_3
    iget-object v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->buttons:[Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    aget-object v2, v2, p3

    invoke-static {v2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->isVisible(Landroid/view/View;)Z

    move-result v2

    if-eqz v2, :cond_a

    .line 25
    iget-object v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->buttonGravity:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    sget-object v6, Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;->END:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    if-ne v2, v6, :cond_8

    add-int/2addr v1, p2

    .line 26
    iget-object v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->buttons:[Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    aget-object v2, v2, p3

    invoke-virtual {v2}, Landroid/widget/TextView;->getMeasuredWidth()I

    move-result v2

    add-int/2addr v2, v1

    :goto_4
    const/4 v6, -0x1

    goto :goto_5

    .line 27
    :cond_8
    sget-object v6, Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;->START:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    if-ne v2, v6, :cond_9

    sub-int v2, p4, v1

    .line 28
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->buttons:[Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    aget-object v1, v1, p3

    invoke-virtual {v1}, Landroid/widget/TextView;->getMeasuredWidth()I

    move-result v1

    sub-int v1, v2, v1

    goto :goto_4

    .line 29
    :cond_9
    iget v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->buttonHorizontalEdgeMargin:I

    add-int/2addr v1, p2

    .line 30
    iget-object v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->buttons:[Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    aget-object v2, v2, p3

    invoke-virtual {v2}, Landroid/widget/TextView;->getMeasuredWidth()I

    move-result v2

    add-int/2addr v2, v1

    move v6, v2

    .line 31
    :goto_5
    iget-object v7, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->buttons:[Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    aget-object v7, v7, p3

    invoke-virtual {v7, v1, p1, v2, p5}, Landroid/widget/TextView;->layout(IIII)V

    goto :goto_6

    :cond_a
    const/4 v6, -0x1

    .line 32
    :goto_6
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->buttons:[Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    aget-object v1, v1, v0

    invoke-static {v1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->isVisible(Landroid/view/View;)Z

    move-result v1

    if-eqz v1, :cond_10

    .line 33
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->buttonGravity:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    sget-object v2, Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;->END:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    if-ne v1, v2, :cond_b

    .line 34
    iget p2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->buttonHorizontalEdgeMargin:I

    sub-int/2addr p4, p2

    .line 35
    iget-object p2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->buttons:[Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    aget-object p2, p2, v0

    invoke-virtual {p2}, Landroid/widget/TextView;->getMeasuredWidth()I

    move-result p2

    sub-int p2, p4, p2

    goto :goto_9

    .line 36
    :cond_b
    sget-object v2, Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;->START:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    if-ne v1, v2, :cond_c

    .line 37
    iget p4, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->buttonHorizontalEdgeMargin:I

    add-int/2addr p2, p4

    .line 38
    iget-object p4, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->buttons:[Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    aget-object p4, p4, v0

    invoke-virtual {p4}, Landroid/widget/TextView;->getMeasuredWidth()I

    move-result p4

    add-int/2addr p4, p2

    goto :goto_9

    :cond_c
    if-ne v6, v4, :cond_d

    if-eq v5, v4, :cond_d

    .line 39
    iget-object p2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->buttons:[Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    aget-object p2, p2, v0

    invoke-virtual {p2}, Landroid/widget/TextView;->getMeasuredWidth()I

    move-result p2

    sub-int v6, v5, p2

    goto :goto_8

    :cond_d
    if-ne v5, v4, :cond_e

    if-eq v6, v4, :cond_e

    .line 40
    iget-object p2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->buttons:[Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    aget-object p2, p2, v0

    invoke-virtual {p2}, Landroid/widget/TextView;->getMeasuredWidth()I

    move-result p2

    goto :goto_7

    :cond_e
    if-ne v5, v4, :cond_f

    sub-int/2addr p4, p2

    .line 41
    div-int/2addr p4, v3

    iget-object p2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->buttons:[Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    aget-object p2, p2, v0

    invoke-virtual {p2}, Landroid/widget/TextView;->getMeasuredWidth()I

    move-result p2

    div-int/2addr p2, v3

    sub-int v6, p4, p2

    .line 42
    iget-object p2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->buttons:[Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    aget-object p2, p2, v0

    invoke-virtual {p2}, Landroid/widget/TextView;->getMeasuredWidth()I

    move-result p2

    :goto_7
    add-int v5, v6, p2

    :cond_f
    :goto_8
    move p4, v5

    move p2, v6

    .line 43
    :goto_9
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->buttons:[Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    aget-object v0, v1, v0

    invoke-virtual {v0, p2, p1, p4, p5}, Landroid/widget/TextView;->layout(IIII)V

    .line 44
    :cond_10
    iget-object p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->content:Landroid/view/View;

    invoke-direct {p0, p1, p3, p3}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->setUpDividersVisibility(Landroid/view/View;ZZ)V

    return-void
.end method

.method public onMeasure(II)V
    .locals 11

    .line 1
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    .line 2
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v1

    .line 3
    iget v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->maxHeight:I

    if-le v1, v2, :cond_0

    move v1, v2

    :cond_0
    const/4 v2, 0x1

    .line 4
    iput-boolean v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->useFullPadding:Z

    .line 5
    iget-object v3, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->stackBehavior:Lcom/xuexiang/xui/widget/dialog/materialdialog/StackingBehavior;

    sget-object v4, Lcom/xuexiang/xui/widget/dialog/materialdialog/StackingBehavior;->ALWAYS:Lcom/xuexiang/xui/widget/dialog/materialdialog/StackingBehavior;

    const/4 v5, 0x0

    if-ne v3, v4, :cond_1

    const/4 v3, 0x1

    :goto_0
    const/4 v8, 0x0

    goto :goto_2

    .line 6
    :cond_1
    sget-object v4, Lcom/xuexiang/xui/widget/dialog/materialdialog/StackingBehavior;->NEVER:Lcom/xuexiang/xui/widget/dialog/materialdialog/StackingBehavior;

    if-ne v3, v4, :cond_2

    const/4 v3, 0x0

    goto :goto_0

    .line 7
    :cond_2
    iget-object v3, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->buttons:[Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    array-length v4, v3

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    :goto_1
    if-ge v6, v4, :cond_4

    aget-object v9, v3, v6

    if-eqz v9, :cond_3

    .line 8
    invoke-static {v9}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->isVisible(Landroid/view/View;)Z

    move-result v10

    if-eqz v10, :cond_3

    .line 9
    invoke-virtual {v9, v5, v5}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;->setStacked(ZZ)V

    .line 10
    invoke-virtual {p0, v9, p1, p2}, Landroid/view/ViewGroup;->measureChild(Landroid/view/View;II)V

    .line 11
    invoke-virtual {v9}, Landroid/widget/TextView;->getMeasuredWidth()I

    move-result v8

    add-int/2addr v7, v8

    const/4 v8, 0x1

    :cond_3
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 12
    :cond_4
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/xuexiang/xui/R$dimen;->md_neutral_button_margin:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v3

    mul-int/lit8 v3, v3, 0x2

    sub-int v3, v0, v3

    if-le v7, v3, :cond_5

    const/4 v3, 0x1

    goto :goto_2

    :cond_5
    const/4 v3, 0x0

    .line 13
    :goto_2
    iput-boolean v3, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->isStacked:Z

    if-eqz v3, :cond_7

    .line 14
    iget-object v3, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->buttons:[Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    array-length v4, v3

    const/4 v6, 0x0

    const/4 v7, 0x0

    :goto_3
    if-ge v6, v4, :cond_8

    aget-object v9, v3, v6

    if-eqz v9, :cond_6

    .line 15
    invoke-static {v9}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->isVisible(Landroid/view/View;)Z

    move-result v10

    if-eqz v10, :cond_6

    .line 16
    invoke-virtual {v9, v2, v5}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;->setStacked(ZZ)V

    .line 17
    invoke-virtual {p0, v9, p1, p2}, Landroid/view/ViewGroup;->measureChild(Landroid/view/View;II)V

    .line 18
    invoke-virtual {v9}, Landroid/widget/TextView;->getMeasuredHeight()I

    move-result v8

    add-int/2addr v7, v8

    const/4 v8, 0x1

    :cond_6
    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    :cond_7
    const/4 v7, 0x0

    :cond_8
    if-eqz v8, :cond_a

    .line 19
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->isStacked:Z

    if-eqz p1, :cond_9

    sub-int p1, v1, v7

    .line 20
    iget p2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->buttonPaddingFull:I

    mul-int/lit8 v3, p2, 0x2

    add-int/2addr v3, v5

    mul-int/lit8 p2, p2, 0x2

    add-int/2addr p2, v5

    goto :goto_5

    .line 21
    :cond_9
    iget p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->buttonBarHeight:I

    sub-int p1, v1, p1

    .line 22
    iget p2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->buttonPaddingFull:I

    mul-int/lit8 p2, p2, 0x2

    add-int/lit8 v3, p2, 0x0

    goto :goto_4

    .line 23
    :cond_a
    iget p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->buttonPaddingFull:I

    mul-int/lit8 p1, p1, 0x2

    add-int/lit8 v3, p1, 0x0

    move p1, v1

    :goto_4
    const/4 p2, 0x0

    .line 24
    :goto_5
    iget-object v4, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->titleBar:Landroid/view/View;

    invoke-static {v4}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->isVisible(Landroid/view/View;)Z

    move-result v4

    const/high16 v6, 0x40000000    # 2.0f

    if-eqz v4, :cond_b

    .line 25
    iget-object v4, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->titleBar:Landroid/view/View;

    .line 26
    invoke-static {v0, v6}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v7

    .line 27
    invoke-virtual {v4, v7, v5}, Landroid/view/View;->measure(II)V

    .line 28
    iget-object v4, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->titleBar:Landroid/view/View;

    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    move-result v4

    sub-int/2addr p1, v4

    goto :goto_6

    .line 29
    :cond_b
    iget-boolean v4, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->noTitleNoPadding:Z

    if-nez v4, :cond_c

    .line 30
    iget v4, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->noTitlePaddingFull:I

    add-int/2addr v3, v4

    .line 31
    :cond_c
    :goto_6
    iget-object v4, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->content:Landroid/view/View;

    invoke-static {v4}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->isVisible(Landroid/view/View;)Z

    move-result v4

    if-eqz v4, :cond_10

    .line 32
    iget-object v4, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->content:Landroid/view/View;

    .line 33
    invoke-static {v0, v6}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v6

    sub-int v7, p1, p2

    const/high16 v9, -0x80000000

    .line 34
    invoke-static {v7, v9}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v7

    .line 35
    invoke-virtual {v4, v6, v7}, Landroid/view/View;->measure(II)V

    .line 36
    iget-object v4, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->content:Landroid/view/View;

    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    move-result v4

    sub-int v6, p1, v3

    if-gt v4, v6, :cond_f

    .line 37
    iget-boolean v4, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->reducePaddingNoTitleNoButtons:Z

    if-eqz v4, :cond_e

    iget-object v4, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->titleBar:Landroid/view/View;

    invoke-static {v4}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->isVisible(Landroid/view/View;)Z

    move-result v4

    if-nez v4, :cond_e

    if-eqz v8, :cond_d

    goto :goto_7

    .line 38
    :cond_d
    iput-boolean v5, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->useFullPadding:Z

    .line 39
    iget-object v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->content:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    add-int/2addr v2, p2

    sub-int v5, p1, v2

    goto :goto_8

    .line 40
    :cond_e
    :goto_7
    iput-boolean v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->useFullPadding:Z

    .line 41
    iget-object p2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->content:Landroid/view/View;

    invoke-virtual {p2}, Landroid/view/View;->getMeasuredHeight()I

    move-result p2

    add-int/2addr p2, v3

    sub-int v5, p1, p2

    goto :goto_8

    .line 42
    :cond_f
    iput-boolean v5, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->useFullPadding:Z

    goto :goto_8

    :cond_10
    move v5, p1

    :goto_8
    sub-int/2addr v1, v5

    .line 43
    invoke-virtual {p0, v0, v1}, Landroid/view/ViewGroup;->setMeasuredDimension(II)V

    return-void
.end method

.method public setButtonGravity(Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->buttonGravity:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->invertGravityIfNecessary()V

    return-void
.end method

.method public setButtonStackedGravity(Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->buttons:[Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    if-eqz v3, :cond_0

    .line 2
    invoke-virtual {v3, p1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;->setStackedGravity(Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;)V

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public setDividerColor(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->dividerPaint:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 2
    invoke-virtual {p0}, Landroid/view/ViewGroup;->invalidate()V

    return-void
.end method

.method public setMaxHeight(I)V
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->maxHeight:I

    return-void
.end method

.method public setStackingBehavior(Lcom/xuexiang/xui/widget/dialog/materialdialog/StackingBehavior;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->stackBehavior:Lcom/xuexiang/xui/widget/dialog/materialdialog/StackingBehavior;

    .line 2
    invoke-virtual {p0}, Landroid/view/ViewGroup;->invalidate()V

    return-void
.end method
