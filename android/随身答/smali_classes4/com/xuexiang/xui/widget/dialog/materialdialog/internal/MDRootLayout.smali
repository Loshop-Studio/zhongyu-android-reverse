.class public Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;
.super Landroid/view/ViewGroup;
.source "SourceFile"


# instance fields
.field public final a:[Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

.field public b:I

.field public c:Landroid/view/View;

.field public d:Landroid/view/View;

.field public e:Z

.field public f:Z

.field public g:Lcom/xuexiang/xui/widget/dialog/materialdialog/StackingBehavior;

.field public h:Z

.field public i:Z

.field public j:Z

.field public k:Z

.field public l:I

.field public m:I

.field public n:I

.field public o:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

.field public p:I

.field public q:Landroid/graphics/Paint;

.field public r:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

.field public s:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

.field public t:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 3
    .line 4
    .line 5
    const/4 v1, 0x3

    .line 6
    new-array v1, v1, [Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 7
    .line 8
    iput-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->a:[Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 9
    .line 10
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->e:Z

    .line 11
    .line 12
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->f:Z

    .line 13
    .line 14
    sget-object v1, Lcom/xuexiang/xui/widget/dialog/materialdialog/StackingBehavior;->b:Lcom/xuexiang/xui/widget/dialog/materialdialog/StackingBehavior;

    .line 15
    .line 16
    iput-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->g:Lcom/xuexiang/xui/widget/dialog/materialdialog/StackingBehavior;

    .line 17
    .line 18
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->h:Z

    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->i:Z

    .line 22
    .line 23
    sget-object v1, Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;->a:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 24
    .line 25
    iput-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->o:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2, v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->o(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public static synthetic a(Landroid/webkit/WebView;)Z
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->l(Landroid/webkit/WebView;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic b(Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->e:Z

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic c(Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->f:Z

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic d(Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;Landroid/view/ViewGroup;ZZ)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->h(Landroid/view/ViewGroup;ZZ)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic e(Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;)[Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->a:[Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic f(Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;Landroid/view/ViewGroup;ZZZ)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->p(Landroid/view/ViewGroup;ZZZ)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic g(Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;Landroid/webkit/WebView;ZZZ)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->q(Landroid/webkit/WebView;ZZZ)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static i(Landroid/widget/AdapterView;)Z
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroid/widget/AdapterView;->getLastVisiblePosition()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, -0x1

    .line 6
    const/4 v2, 0x0

    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    return v2

    .line 10
    :cond_0
    invoke-virtual {p0}, Landroid/widget/AdapterView;->getFirstVisiblePosition()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x1

    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    move v0, v1

    .line 18
    goto :goto_0

    .line 19
    :cond_1
    move v0, v2

    .line 20
    :goto_0
    invoke-virtual {p0}, Landroid/widget/AdapterView;->getLastVisiblePosition()I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    invoke-virtual {p0}, Landroid/widget/AdapterView;->getCount()I

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    sub-int/2addr v4, v1

    .line 29
    if-ne v3, v4, :cond_2

    .line 30
    .line 31
    move v3, v1

    .line 32
    goto :goto_1

    .line 33
    :cond_2
    move v3, v2

    .line 34
    :goto_1
    if-eqz v0, :cond_5

    .line 35
    .line 36
    if-eqz v3, :cond_5

    .line 37
    .line 38
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-lez v0, :cond_5

    .line 43
    .line 44
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    if-ge v0, v3, :cond_3

    .line 57
    .line 58
    return v1

    .line 59
    :cond_3
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    sub-int/2addr v0, v1

    .line 64
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-virtual {v0}, Landroid/view/View;->getBottom()I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 77
    .line 78
    .line 79
    move-result p0

    .line 80
    sub-int/2addr v3, p0

    .line 81
    if-le v0, v3, :cond_4

    .line 82
    .line 83
    return v1

    .line 84
    :cond_4
    return v2

    .line 85
    :cond_5
    return v1
.end method

.method public static j(Landroidx/recyclerview/widget/RecyclerView;)Z
    .locals 1

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->canScrollVertically()Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    const/4 p0, 0x1

    .line 20
    return p0

    .line 21
    :cond_0
    const/4 p0, 0x0

    .line 22
    return p0
.end method

.method public static k(Landroid/widget/ScrollView;)Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    sub-int/2addr v2, v3

    .line 26
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    sub-int/2addr v2, p0

    .line 31
    if-ge v2, v0, :cond_1

    .line 32
    .line 33
    const/4 p0, 0x1

    .line 34
    return p0

    .line 35
    :cond_1
    return v1
.end method

.method public static l(Landroid/webkit/WebView;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    int-to-float v0, v0

    .line 6
    invoke-virtual {p0}, Landroid/webkit/WebView;->getContentHeight()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    int-to-float v1, v1

    .line 11
    invoke-virtual {p0}, Landroid/webkit/WebView;->getScale()F

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    mul-float/2addr v1, p0

    .line 16
    cmpg-float p0, v0, v1

    .line 17
    .line 18
    if-gez p0, :cond_0

    .line 19
    .line 20
    const/4 p0, 0x1

    .line 21
    return p0

    .line 22
    :cond_0
    const/4 p0, 0x0

    .line 23
    return p0
.end method

.method public static m(Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_2

    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    goto :goto_1

    .line 11
    :cond_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/lit8 v1, v1, -0x1

    .line 16
    .line 17
    :goto_0
    if-ltz v1, :cond_2

    .line 18
    .line 19
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-nez v3, :cond_1

    .line 28
    .line 29
    invoke-virtual {v2}, Landroid/view/View;->getBottom()I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    if-ne v3, v4, :cond_1

    .line 38
    .line 39
    return-object v2

    .line 40
    :cond_1
    add-int/lit8 v1, v1, -0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    :goto_1
    return-object v0
.end method

.method public static n(Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_2

    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    goto :goto_1

    .line 11
    :cond_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/lit8 v1, v1, -0x1

    .line 16
    .line 17
    :goto_0
    if-ltz v1, :cond_2

    .line 18
    .line 19
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-nez v3, :cond_1

    .line 28
    .line 29
    invoke-virtual {v2}, Landroid/view/View;->getTop()I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-nez v3, :cond_1

    .line 34
    .line 35
    return-object v2

    .line 36
    :cond_1
    add-int/lit8 v1, v1, -0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    :goto_1
    return-object v0
.end method

.method public static s(Landroid/view/View;)Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/16 v3, 0x8

    .line 10
    .line 11
    if-eq v2, v3, :cond_0

    .line 12
    .line 13
    move v2, v1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move v2, v0

    .line 16
    :goto_0
    if-eqz v2, :cond_2

    .line 17
    .line 18
    instance-of v3, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 19
    .line 20
    if-eqz v3, :cond_2

    .line 21
    .line 22
    check-cast p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 23
    .line 24
    invoke-virtual {p0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-interface {p0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    if-lez p0, :cond_1

    .line 41
    .line 42
    return v1

    .line 43
    :cond_1
    return v0

    .line 44
    :cond_2
    return v2
.end method


# virtual methods
.method public final h(Landroid/view/ViewGroup;ZZ)V
    .locals 1

    .line 1
    if-nez p3, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->r:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    :cond_0
    if-eqz p3, :cond_4

    .line 8
    .line 9
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->s:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

    .line 10
    .line 11
    if-nez v0, :cond_4

    .line 12
    .line 13
    :cond_1
    instance-of v0, p1, Landroidx/recyclerview/widget/RecyclerView;

    .line 14
    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    new-instance v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout$b;

    .line 18
    .line 19
    invoke-direct {v0, p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout$b;-><init>(Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;Landroid/view/ViewGroup;ZZ)V

    .line 20
    .line 21
    .line 22
    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    .line 23
    .line 24
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->addOnScrollListener(Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;)V

    .line 25
    .line 26
    .line 27
    const/4 p2, 0x0

    .line 28
    invoke-virtual {v0, p1, p2, p2}, Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;->onScrolled(Landroidx/recyclerview/widget/RecyclerView;II)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_2
    new-instance v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout$c;

    .line 33
    .line 34
    invoke-direct {v0, p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout$c;-><init>(Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;Landroid/view/ViewGroup;ZZ)V

    .line 35
    .line 36
    .line 37
    if-nez p3, :cond_3

    .line 38
    .line 39
    iput-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->r:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

    .line 40
    .line 41
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    iget-object p2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->r:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

    .line 46
    .line 47
    invoke-virtual {p1, p2}, Landroid/view/ViewTreeObserver;->addOnScrollChangedListener(Landroid/view/ViewTreeObserver$OnScrollChangedListener;)V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_3
    iput-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->s:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

    .line 52
    .line 53
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    iget-object p2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->s:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

    .line 58
    .line 59
    invoke-virtual {p1, p2}, Landroid/view/ViewTreeObserver;->addOnScrollChangedListener(Landroid/view/ViewTreeObserver$OnScrollChangedListener;)V

    .line 60
    .line 61
    .line 62
    :goto_0
    invoke-interface {v0}, Landroid/view/ViewTreeObserver$OnScrollChangedListener;->onScrollChanged()V

    .line 63
    .line 64
    .line 65
    :cond_4
    return-void
.end method

.method public final o(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lcom/xuexiang/xui/R$styleable;->MDRootLayout:[I

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-virtual {p1, p2, v1, p3, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    sget p3, Lcom/xuexiang/xui/R$styleable;->MDRootLayout_md_reduce_padding_no_title_no_buttons:I

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    invoke-virtual {p2, p3, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 16
    .line 17
    .line 18
    move-result p3

    .line 19
    iput-boolean p3, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->j:Z

    .line 20
    .line 21
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 22
    .line 23
    .line 24
    sget p2, Lcom/xuexiang/xui/R$dimen;->md_notitle_vertical_padding:I

    .line 25
    .line 26
    invoke-virtual {v0, p2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    iput p2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->l:I

    .line 31
    .line 32
    sget p2, Lcom/xuexiang/xui/R$dimen;->md_button_frame_vertical_padding:I

    .line 33
    .line 34
    invoke-virtual {v0, p2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 35
    .line 36
    .line 37
    move-result p2

    .line 38
    iput p2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->m:I

    .line 39
    .line 40
    sget p2, Lcom/xuexiang/xui/R$dimen;->md_button_padding_frame_side:I

    .line 41
    .line 42
    invoke-virtual {v0, p2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 43
    .line 44
    .line 45
    move-result p2

    .line 46
    iput p2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->p:I

    .line 47
    .line 48
    sget p2, Lcom/xuexiang/xui/R$attr;->md_button_height:I

    .line 49
    .line 50
    sget p3, Lcom/xuexiang/xui/R$dimen;->default_md_button_height_phone:I

    .line 51
    .line 52
    invoke-virtual {v0, p3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 53
    .line 54
    .line 55
    move-result p3

    .line 56
    invoke-static {p1, p2, p3}, Lcom/xuexiang/xui/utils/g;->o(Landroid/content/Context;II)I

    .line 57
    .line 58
    .line 59
    move-result p2

    .line 60
    iput p2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->n:I

    .line 61
    .line 62
    new-instance p2, Landroid/graphics/Paint;

    .line 63
    .line 64
    invoke-direct {p2}, Landroid/graphics/Paint;-><init>()V

    .line 65
    .line 66
    .line 67
    iput-object p2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->q:Landroid/graphics/Paint;

    .line 68
    .line 69
    sget p2, Lcom/xuexiang/xui/R$dimen;->md_divider_height:I

    .line 70
    .line 71
    invoke-virtual {v0, p2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 72
    .line 73
    .line 74
    move-result p2

    .line 75
    iput p2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->t:I

    .line 76
    .line 77
    iget-object p2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->q:Landroid/graphics/Paint;

    .line 78
    .line 79
    sget p3, Lcom/xuexiang/xui/R$attr;->md_divider_color:I

    .line 80
    .line 81
    invoke-static {p1, p3}, Lcom/xuexiang/xui/utils/g;->l(Landroid/content/Context;I)I

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    invoke-virtual {p2, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p0, v2}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 89
    .line 90
    .line 91
    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 14

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->d:Landroid/view/View;

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    iget-boolean v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->e:Z

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->t:I

    .line 17
    .line 18
    sub-int v1, v0, v1

    .line 19
    .line 20
    int-to-float v4, v1

    .line 21
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    int-to-float v5, v1

    .line 26
    int-to-float v6, v0

    .line 27
    iget-object v7, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->q:Landroid/graphics/Paint;

    .line 28
    .line 29
    const/4 v3, 0x0

    .line 30
    move-object v2, p1

    .line 31
    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    move-object v2, p1

    .line 36
    :goto_0
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->f:Z

    .line 37
    .line 38
    if-eqz p1, :cond_1

    .line 39
    .line 40
    iget-object p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->d:Landroid/view/View;

    .line 41
    .line 42
    invoke-virtual {p1}, Landroid/view/View;->getBottom()I

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    int-to-float v10, p1

    .line 47
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    int-to-float v11, v0

    .line 52
    iget v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->t:I

    .line 53
    .line 54
    add-int/2addr p1, v0

    .line 55
    int-to-float v12, p1

    .line 56
    iget-object v13, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->q:Landroid/graphics/Paint;

    .line 57
    .line 58
    const/4 v9, 0x0

    .line 59
    move-object v8, v2

    .line 60
    invoke-virtual/range {v8 .. v13}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 61
    .line 62
    .line 63
    :cond_1
    return-void
.end method

.method public onFinishInflate()V
    .locals 5

    .line 1
    invoke-super {p0}, Landroid/view/View;->onFinishInflate()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    move v1, v0

    .line 6
    :goto_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    if-ge v1, v2, :cond_4

    .line 11
    .line 12
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-virtual {v2}, Landroid/view/View;->getId()I

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    sget v4, Lcom/xuexiang/xui/R$id;->md_titleFrame:I

    .line 21
    .line 22
    if-ne v3, v4, :cond_0

    .line 23
    .line 24
    iput-object v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->c:Landroid/view/View;

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_0
    invoke-virtual {v2}, Landroid/view/View;->getId()I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    sget v4, Lcom/xuexiang/xui/R$id;->md_buttonDefaultNeutral:I

    .line 32
    .line 33
    if-ne v3, v4, :cond_1

    .line 34
    .line 35
    iget-object v3, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->a:[Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 36
    .line 37
    check-cast v2, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 38
    .line 39
    aput-object v2, v3, v0

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    invoke-virtual {v2}, Landroid/view/View;->getId()I

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    sget v4, Lcom/xuexiang/xui/R$id;->md_buttonDefaultNegative:I

    .line 47
    .line 48
    if-ne v3, v4, :cond_2

    .line 49
    .line 50
    iget-object v3, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->a:[Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 51
    .line 52
    check-cast v2, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 53
    .line 54
    const/4 v4, 0x1

    .line 55
    aput-object v2, v3, v4

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_2
    invoke-virtual {v2}, Landroid/view/View;->getId()I

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    sget v4, Lcom/xuexiang/xui/R$id;->md_buttonDefaultPositive:I

    .line 63
    .line 64
    if-ne v3, v4, :cond_3

    .line 65
    .line 66
    iget-object v3, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->a:[Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 67
    .line 68
    const/4 v4, 0x2

    .line 69
    check-cast v2, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 70
    .line 71
    aput-object v2, v3, v4

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_3
    iput-object v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->d:Landroid/view/View;

    .line 75
    .line 76
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_4
    return-void
.end method

.method public onLayout(ZIIII)V
    .locals 8

    .line 1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->c:Landroid/view/View;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->s(Landroid/view/View;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->c:Landroid/view/View;

    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->c:Landroid/view/View;

    .line 16
    .line 17
    add-int/2addr p1, p3

    .line 18
    invoke-virtual {v0, p2, p3, p4, p1}, Landroid/view/View;->layout(IIII)V

    .line 19
    .line 20
    .line 21
    move p3, p1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->k:Z

    .line 24
    .line 25
    if-nez p1, :cond_1

    .line 26
    .line 27
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->i:Z

    .line 28
    .line 29
    if-eqz p1, :cond_1

    .line 30
    .line 31
    iget p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->l:I

    .line 32
    .line 33
    add-int/2addr p3, p1

    .line 34
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->d:Landroid/view/View;

    .line 35
    .line 36
    invoke-static {p1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->s(Landroid/view/View;)Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-eqz p1, :cond_2

    .line 41
    .line 42
    iget-object p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->d:Landroid/view/View;

    .line 43
    .line 44
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    add-int/2addr v0, p3

    .line 49
    invoke-virtual {p1, p2, p3, p4, v0}, Landroid/view/View;->layout(IIII)V

    .line 50
    .line 51
    .line 52
    :cond_2
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->h:Z

    .line 53
    .line 54
    const/4 p3, 0x1

    .line 55
    const/4 v0, 0x0

    .line 56
    if-eqz p1, :cond_4

    .line 57
    .line 58
    iget p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->m:I

    .line 59
    .line 60
    sub-int/2addr p5, p1

    .line 61
    iget-object p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->a:[Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 62
    .line 63
    array-length v1, p1

    .line 64
    :goto_1
    if-ge v0, v1, :cond_10

    .line 65
    .line 66
    aget-object v2, p1, v0

    .line 67
    .line 68
    invoke-static {v2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->s(Landroid/view/View;)Z

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    if-eqz v3, :cond_3

    .line 73
    .line 74
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I

    .line 75
    .line 76
    .line 77
    move-result v3

    .line 78
    sub-int v3, p5, v3

    .line 79
    .line 80
    invoke-virtual {v2, p2, v3, p4, p5}, Landroid/view/View;->layout(IIII)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    sub-int/2addr p5, v2

    .line 88
    :cond_3
    add-int/lit8 v0, v0, 0x1

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_4
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->i:Z

    .line 92
    .line 93
    if-eqz p1, :cond_5

    .line 94
    .line 95
    iget p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->m:I

    .line 96
    .line 97
    sub-int/2addr p5, p1

    .line 98
    :cond_5
    iget p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->n:I

    .line 99
    .line 100
    sub-int p1, p5, p1

    .line 101
    .line 102
    iget v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->p:I

    .line 103
    .line 104
    iget-object v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->a:[Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 105
    .line 106
    const/4 v3, 0x2

    .line 107
    aget-object v2, v2, v3

    .line 108
    .line 109
    invoke-static {v2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->s(Landroid/view/View;)Z

    .line 110
    .line 111
    .line 112
    move-result v2

    .line 113
    const/4 v4, -0x1

    .line 114
    if-eqz v2, :cond_7

    .line 115
    .line 116
    iget-object v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->o:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 117
    .line 118
    sget-object v5, Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 119
    .line 120
    if-ne v2, v5, :cond_6

    .line 121
    .line 122
    add-int v2, p2, v1

    .line 123
    .line 124
    iget-object v5, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->a:[Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 125
    .line 126
    aget-object v5, v5, v3

    .line 127
    .line 128
    invoke-virtual {v5}, Landroid/view/View;->getMeasuredWidth()I

    .line 129
    .line 130
    .line 131
    move-result v5

    .line 132
    add-int/2addr v5, v2

    .line 133
    move v6, v5

    .line 134
    move v5, v4

    .line 135
    goto :goto_2

    .line 136
    :cond_6
    sub-int v5, p4, v1

    .line 137
    .line 138
    iget-object v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->a:[Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 139
    .line 140
    aget-object v2, v2, v3

    .line 141
    .line 142
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredWidth()I

    .line 143
    .line 144
    .line 145
    move-result v2

    .line 146
    sub-int v2, v5, v2

    .line 147
    .line 148
    move v6, v5

    .line 149
    move v5, v2

    .line 150
    :goto_2
    iget-object v7, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->a:[Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 151
    .line 152
    aget-object v7, v7, v3

    .line 153
    .line 154
    invoke-virtual {v7, v2, p1, v6, p5}, Landroid/view/View;->layout(IIII)V

    .line 155
    .line 156
    .line 157
    iget-object v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->a:[Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 158
    .line 159
    aget-object v2, v2, v3

    .line 160
    .line 161
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredWidth()I

    .line 162
    .line 163
    .line 164
    move-result v2

    .line 165
    add-int/2addr v1, v2

    .line 166
    goto :goto_3

    .line 167
    :cond_7
    move v5, v4

    .line 168
    :goto_3
    iget-object v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->a:[Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 169
    .line 170
    aget-object v2, v2, p3

    .line 171
    .line 172
    invoke-static {v2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->s(Landroid/view/View;)Z

    .line 173
    .line 174
    .line 175
    move-result v2

    .line 176
    if-eqz v2, :cond_a

    .line 177
    .line 178
    iget-object v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->o:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 179
    .line 180
    sget-object v6, Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 181
    .line 182
    if-ne v2, v6, :cond_8

    .line 183
    .line 184
    add-int/2addr v1, p2

    .line 185
    iget-object v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->a:[Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 186
    .line 187
    aget-object v2, v2, p3

    .line 188
    .line 189
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredWidth()I

    .line 190
    .line 191
    .line 192
    move-result v2

    .line 193
    add-int/2addr v2, v1

    .line 194
    :goto_4
    move v6, v4

    .line 195
    goto :goto_5

    .line 196
    :cond_8
    sget-object v6, Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;->a:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 197
    .line 198
    if-ne v2, v6, :cond_9

    .line 199
    .line 200
    sub-int v2, p4, v1

    .line 201
    .line 202
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->a:[Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 203
    .line 204
    aget-object v1, v1, p3

    .line 205
    .line 206
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    .line 207
    .line 208
    .line 209
    move-result v1

    .line 210
    sub-int v1, v2, v1

    .line 211
    .line 212
    goto :goto_4

    .line 213
    :cond_9
    iget v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->p:I

    .line 214
    .line 215
    add-int/2addr v1, p2

    .line 216
    iget-object v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->a:[Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 217
    .line 218
    aget-object v2, v2, p3

    .line 219
    .line 220
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredWidth()I

    .line 221
    .line 222
    .line 223
    move-result v2

    .line 224
    add-int/2addr v2, v1

    .line 225
    move v6, v2

    .line 226
    :goto_5
    iget-object v7, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->a:[Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 227
    .line 228
    aget-object v7, v7, p3

    .line 229
    .line 230
    invoke-virtual {v7, v1, p1, v2, p5}, Landroid/view/View;->layout(IIII)V

    .line 231
    .line 232
    .line 233
    goto :goto_6

    .line 234
    :cond_a
    move v6, v4

    .line 235
    :goto_6
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->a:[Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 236
    .line 237
    aget-object v1, v1, v0

    .line 238
    .line 239
    invoke-static {v1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->s(Landroid/view/View;)Z

    .line 240
    .line 241
    .line 242
    move-result v1

    .line 243
    if-eqz v1, :cond_10

    .line 244
    .line 245
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->o:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 246
    .line 247
    sget-object v2, Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 248
    .line 249
    if-ne v1, v2, :cond_b

    .line 250
    .line 251
    iget p2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->p:I

    .line 252
    .line 253
    sub-int/2addr p4, p2

    .line 254
    iget-object p2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->a:[Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 255
    .line 256
    aget-object p2, p2, v0

    .line 257
    .line 258
    invoke-virtual {p2}, Landroid/view/View;->getMeasuredWidth()I

    .line 259
    .line 260
    .line 261
    move-result p2

    .line 262
    sub-int p2, p4, p2

    .line 263
    .line 264
    goto :goto_9

    .line 265
    :cond_b
    sget-object v2, Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;->a:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 266
    .line 267
    if-ne v1, v2, :cond_c

    .line 268
    .line 269
    iget p4, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->p:I

    .line 270
    .line 271
    add-int/2addr p2, p4

    .line 272
    iget-object p4, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->a:[Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 273
    .line 274
    aget-object p4, p4, v0

    .line 275
    .line 276
    invoke-virtual {p4}, Landroid/view/View;->getMeasuredWidth()I

    .line 277
    .line 278
    .line 279
    move-result p4

    .line 280
    add-int/2addr p4, p2

    .line 281
    goto :goto_9

    .line 282
    :cond_c
    if-ne v6, v4, :cond_d

    .line 283
    .line 284
    if-eq v5, v4, :cond_d

    .line 285
    .line 286
    iget-object p2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->a:[Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 287
    .line 288
    aget-object p2, p2, v0

    .line 289
    .line 290
    invoke-virtual {p2}, Landroid/view/View;->getMeasuredWidth()I

    .line 291
    .line 292
    .line 293
    move-result p2

    .line 294
    sub-int v6, v5, p2

    .line 295
    .line 296
    goto :goto_8

    .line 297
    :cond_d
    if-ne v5, v4, :cond_e

    .line 298
    .line 299
    if-eq v6, v4, :cond_e

    .line 300
    .line 301
    iget-object p2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->a:[Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 302
    .line 303
    aget-object p2, p2, v0

    .line 304
    .line 305
    invoke-virtual {p2}, Landroid/view/View;->getMeasuredWidth()I

    .line 306
    .line 307
    .line 308
    move-result p2

    .line 309
    :goto_7
    add-int v5, v6, p2

    .line 310
    .line 311
    goto :goto_8

    .line 312
    :cond_e
    if-ne v5, v4, :cond_f

    .line 313
    .line 314
    sub-int/2addr p4, p2

    .line 315
    div-int/2addr p4, v3

    .line 316
    iget-object p2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->a:[Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 317
    .line 318
    aget-object p2, p2, v0

    .line 319
    .line 320
    invoke-virtual {p2}, Landroid/view/View;->getMeasuredWidth()I

    .line 321
    .line 322
    .line 323
    move-result p2

    .line 324
    div-int/2addr p2, v3

    .line 325
    sub-int v6, p4, p2

    .line 326
    .line 327
    iget-object p2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->a:[Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 328
    .line 329
    aget-object p2, p2, v0

    .line 330
    .line 331
    invoke-virtual {p2}, Landroid/view/View;->getMeasuredWidth()I

    .line 332
    .line 333
    .line 334
    move-result p2

    .line 335
    goto :goto_7

    .line 336
    :cond_f
    :goto_8
    move p4, v5

    .line 337
    move p2, v6

    .line 338
    :goto_9
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->a:[Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 339
    .line 340
    aget-object v0, v1, v0

    .line 341
    .line 342
    invoke-virtual {v0, p2, p1, p4, p5}, Landroid/view/View;->layout(IIII)V

    .line 343
    .line 344
    .line 345
    :cond_10
    iget-object p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->d:Landroid/view/View;

    .line 346
    .line 347
    invoke-virtual {p0, p1, p3, p3}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->u(Landroid/view/View;ZZ)V

    .line 348
    .line 349
    .line 350
    return-void
.end method

.method public onMeasure(II)V
    .locals 11

    .line 1
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    iget v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->b:I

    .line 10
    .line 11
    if-le v1, v2, :cond_0

    .line 12
    .line 13
    move v1, v2

    .line 14
    :cond_0
    const/4 v2, 0x1

    .line 15
    iput-boolean v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->i:Z

    .line 16
    .line 17
    iget-object v3, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->g:Lcom/xuexiang/xui/widget/dialog/materialdialog/StackingBehavior;

    .line 18
    .line 19
    sget-object v4, Lcom/xuexiang/xui/widget/dialog/materialdialog/StackingBehavior;->a:Lcom/xuexiang/xui/widget/dialog/materialdialog/StackingBehavior;

    .line 20
    .line 21
    const/4 v5, 0x0

    .line 22
    if-ne v3, v4, :cond_1

    .line 23
    .line 24
    move v3, v2

    .line 25
    move v8, v5

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    sget-object v4, Lcom/xuexiang/xui/widget/dialog/materialdialog/StackingBehavior;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/StackingBehavior;

    .line 28
    .line 29
    if-ne v3, v4, :cond_2

    .line 30
    .line 31
    move v3, v5

    .line 32
    move v8, v3

    .line 33
    goto :goto_1

    .line 34
    :cond_2
    iget-object v3, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->a:[Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 35
    .line 36
    array-length v4, v3

    .line 37
    move v6, v5

    .line 38
    move v7, v6

    .line 39
    move v8, v7

    .line 40
    :goto_0
    if-ge v6, v4, :cond_4

    .line 41
    .line 42
    aget-object v9, v3, v6

    .line 43
    .line 44
    if-eqz v9, :cond_3

    .line 45
    .line 46
    invoke-static {v9}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->s(Landroid/view/View;)Z

    .line 47
    .line 48
    .line 49
    move-result v10

    .line 50
    if-eqz v10, :cond_3

    .line 51
    .line 52
    invoke-virtual {v9, v5, v5}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;->b(ZZ)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0, v9, p1, p2}, Landroid/view/ViewGroup;->measureChild(Landroid/view/View;II)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v9}, Landroid/view/View;->getMeasuredWidth()I

    .line 59
    .line 60
    .line 61
    move-result v8

    .line 62
    add-int/2addr v7, v8

    .line 63
    move v8, v2

    .line 64
    :cond_3
    add-int/lit8 v6, v6, 0x1

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_4
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    sget v4, Lcom/xuexiang/xui/R$dimen;->md_neutral_button_margin:I

    .line 76
    .line 77
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    mul-int/lit8 v3, v3, 0x2

    .line 82
    .line 83
    sub-int v3, v0, v3

    .line 84
    .line 85
    if-le v7, v3, :cond_5

    .line 86
    .line 87
    move v3, v2

    .line 88
    goto :goto_1

    .line 89
    :cond_5
    move v3, v5

    .line 90
    :goto_1
    iput-boolean v3, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->h:Z

    .line 91
    .line 92
    if-eqz v3, :cond_7

    .line 93
    .line 94
    iget-object v3, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->a:[Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 95
    .line 96
    array-length v4, v3

    .line 97
    move v6, v5

    .line 98
    move v7, v6

    .line 99
    :goto_2
    if-ge v6, v4, :cond_8

    .line 100
    .line 101
    aget-object v9, v3, v6

    .line 102
    .line 103
    if-eqz v9, :cond_6

    .line 104
    .line 105
    invoke-static {v9}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->s(Landroid/view/View;)Z

    .line 106
    .line 107
    .line 108
    move-result v10

    .line 109
    if-eqz v10, :cond_6

    .line 110
    .line 111
    invoke-virtual {v9, v2, v5}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;->b(ZZ)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p0, v9, p1, p2}, Landroid/view/ViewGroup;->measureChild(Landroid/view/View;II)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v9}, Landroid/view/View;->getMeasuredHeight()I

    .line 118
    .line 119
    .line 120
    move-result v8

    .line 121
    add-int/2addr v7, v8

    .line 122
    move v8, v2

    .line 123
    :cond_6
    add-int/lit8 v6, v6, 0x1

    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_7
    move v7, v5

    .line 127
    :cond_8
    if-eqz v8, :cond_a

    .line 128
    .line 129
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->h:Z

    .line 130
    .line 131
    if-eqz p1, :cond_9

    .line 132
    .line 133
    sub-int p1, v1, v7

    .line 134
    .line 135
    iget p2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->m:I

    .line 136
    .line 137
    mul-int/lit8 v3, p2, 0x2

    .line 138
    .line 139
    mul-int/lit8 p2, p2, 0x2

    .line 140
    .line 141
    goto :goto_4

    .line 142
    :cond_9
    iget p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->n:I

    .line 143
    .line 144
    sub-int p1, v1, p1

    .line 145
    .line 146
    iget p2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->m:I

    .line 147
    .line 148
    mul-int/lit8 v3, p2, 0x2

    .line 149
    .line 150
    :goto_3
    move p2, v5

    .line 151
    goto :goto_4

    .line 152
    :cond_a
    iget p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->m:I

    .line 153
    .line 154
    mul-int/lit8 v3, p1, 0x2

    .line 155
    .line 156
    move p1, v1

    .line 157
    goto :goto_3

    .line 158
    :goto_4
    iget-object v4, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->c:Landroid/view/View;

    .line 159
    .line 160
    invoke-static {v4}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->s(Landroid/view/View;)Z

    .line 161
    .line 162
    .line 163
    move-result v4

    .line 164
    const/high16 v6, 0x40000000    # 2.0f

    .line 165
    .line 166
    if-eqz v4, :cond_b

    .line 167
    .line 168
    iget-object v4, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->c:Landroid/view/View;

    .line 169
    .line 170
    invoke-static {v0, v6}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 171
    .line 172
    .line 173
    move-result v7

    .line 174
    invoke-virtual {v4, v7, v5}, Landroid/view/View;->measure(II)V

    .line 175
    .line 176
    .line 177
    iget-object v4, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->c:Landroid/view/View;

    .line 178
    .line 179
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    .line 180
    .line 181
    .line 182
    move-result v4

    .line 183
    sub-int/2addr p1, v4

    .line 184
    goto :goto_5

    .line 185
    :cond_b
    iget-boolean v4, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->k:Z

    .line 186
    .line 187
    if-nez v4, :cond_c

    .line 188
    .line 189
    iget v4, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->l:I

    .line 190
    .line 191
    add-int/2addr v3, v4

    .line 192
    :cond_c
    :goto_5
    iget-object v4, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->d:Landroid/view/View;

    .line 193
    .line 194
    invoke-static {v4}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->s(Landroid/view/View;)Z

    .line 195
    .line 196
    .line 197
    move-result v4

    .line 198
    if-eqz v4, :cond_10

    .line 199
    .line 200
    iget-object v4, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->d:Landroid/view/View;

    .line 201
    .line 202
    invoke-static {v0, v6}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 203
    .line 204
    .line 205
    move-result v6

    .line 206
    sub-int v7, p1, p2

    .line 207
    .line 208
    const/high16 v9, -0x80000000

    .line 209
    .line 210
    invoke-static {v7, v9}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 211
    .line 212
    .line 213
    move-result v7

    .line 214
    invoke-virtual {v4, v6, v7}, Landroid/view/View;->measure(II)V

    .line 215
    .line 216
    .line 217
    iget-object v4, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->d:Landroid/view/View;

    .line 218
    .line 219
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    .line 220
    .line 221
    .line 222
    move-result v4

    .line 223
    sub-int v6, p1, v3

    .line 224
    .line 225
    if-gt v4, v6, :cond_f

    .line 226
    .line 227
    iget-boolean v4, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->j:Z

    .line 228
    .line 229
    if-eqz v4, :cond_e

    .line 230
    .line 231
    iget-object v4, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->c:Landroid/view/View;

    .line 232
    .line 233
    invoke-static {v4}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->s(Landroid/view/View;)Z

    .line 234
    .line 235
    .line 236
    move-result v4

    .line 237
    if-nez v4, :cond_e

    .line 238
    .line 239
    if-eqz v8, :cond_d

    .line 240
    .line 241
    goto :goto_6

    .line 242
    :cond_d
    iput-boolean v5, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->i:Z

    .line 243
    .line 244
    iget-object v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->d:Landroid/view/View;

    .line 245
    .line 246
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I

    .line 247
    .line 248
    .line 249
    move-result v2

    .line 250
    add-int/2addr v2, p2

    .line 251
    sub-int v5, p1, v2

    .line 252
    .line 253
    goto :goto_7

    .line 254
    :cond_e
    :goto_6
    iput-boolean v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->i:Z

    .line 255
    .line 256
    iget-object p2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->d:Landroid/view/View;

    .line 257
    .line 258
    invoke-virtual {p2}, Landroid/view/View;->getMeasuredHeight()I

    .line 259
    .line 260
    .line 261
    move-result p2

    .line 262
    add-int/2addr p2, v3

    .line 263
    sub-int v5, p1, p2

    .line 264
    .line 265
    goto :goto_7

    .line 266
    :cond_f
    iput-boolean v5, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->i:Z

    .line 267
    .line 268
    goto :goto_7

    .line 269
    :cond_10
    move v5, p1

    .line 270
    :goto_7
    sub-int/2addr v1, v5

    .line 271
    invoke-virtual {p0, v0, v1}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 272
    .line 273
    .line 274
    return-void
.end method

.method public final p(Landroid/view/ViewGroup;ZZZ)V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    if-eqz p2, :cond_1

    .line 4
    .line 5
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    if-lez p2, :cond_1

    .line 10
    .line 11
    iget-object p2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->c:Landroid/view/View;

    .line 12
    .line 13
    if-eqz p2, :cond_0

    .line 14
    .line 15
    invoke-virtual {p2}, Landroid/view/View;->getVisibility()I

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    const/16 v2, 0x8

    .line 20
    .line 21
    if-eq p2, v2, :cond_0

    .line 22
    .line 23
    invoke-virtual {p1}, Landroid/view/View;->getScrollY()I

    .line 24
    .line 25
    .line 26
    move-result p2

    .line 27
    invoke-virtual {p1}, Landroid/view/View;->getPaddingTop()I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    add-int/2addr p2, v2

    .line 32
    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-virtual {v2}, Landroid/view/View;->getTop()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-le p2, v2, :cond_0

    .line 41
    .line 42
    move p2, v0

    .line 43
    goto :goto_0

    .line 44
    :cond_0
    move p2, v1

    .line 45
    :goto_0
    iput-boolean p2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->e:Z

    .line 46
    .line 47
    :cond_1
    if-eqz p3, :cond_3

    .line 48
    .line 49
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 50
    .line 51
    .line 52
    move-result p2

    .line 53
    if-lez p2, :cond_3

    .line 54
    .line 55
    if-eqz p4, :cond_2

    .line 56
    .line 57
    invoke-virtual {p1}, Landroid/view/View;->getScrollY()I

    .line 58
    .line 59
    .line 60
    move-result p2

    .line 61
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 62
    .line 63
    .line 64
    move-result p3

    .line 65
    add-int/2addr p2, p3

    .line 66
    invoke-virtual {p1}, Landroid/view/View;->getPaddingBottom()I

    .line 67
    .line 68
    .line 69
    move-result p3

    .line 70
    sub-int/2addr p2, p3

    .line 71
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 72
    .line 73
    .line 74
    move-result p3

    .line 75
    sub-int/2addr p3, v0

    .line 76
    invoke-virtual {p1, p3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-virtual {p1}, Landroid/view/View;->getBottom()I

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    if-ge p2, p1, :cond_2

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_2
    move v0, v1

    .line 88
    :goto_1
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->f:Z

    .line 89
    .line 90
    :cond_3
    return-void
.end method

.method public final q(Landroid/webkit/WebView;ZZZ)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    if-eqz p2, :cond_1

    .line 4
    .line 5
    iget-object p2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->c:Landroid/view/View;

    .line 6
    .line 7
    if-eqz p2, :cond_0

    .line 8
    .line 9
    invoke-virtual {p2}, Landroid/view/View;->getVisibility()I

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    const/16 v2, 0x8

    .line 14
    .line 15
    if-eq p2, v2, :cond_0

    .line 16
    .line 17
    invoke-virtual {p1}, Landroid/view/View;->getScrollY()I

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    invoke-virtual {p1}, Landroid/view/View;->getPaddingTop()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    add-int/2addr p2, v2

    .line 26
    if-lez p2, :cond_0

    .line 27
    .line 28
    move p2, v1

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    move p2, v0

    .line 31
    :goto_0
    iput-boolean p2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->e:Z

    .line 32
    .line 33
    :cond_1
    if-eqz p3, :cond_3

    .line 34
    .line 35
    if-eqz p4, :cond_2

    .line 36
    .line 37
    invoke-virtual {p1}, Landroid/view/View;->getScrollY()I

    .line 38
    .line 39
    .line 40
    move-result p2

    .line 41
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    .line 42
    .line 43
    .line 44
    move-result p3

    .line 45
    add-int/2addr p2, p3

    .line 46
    invoke-virtual {p1}, Landroid/view/View;->getPaddingBottom()I

    .line 47
    .line 48
    .line 49
    move-result p3

    .line 50
    sub-int/2addr p2, p3

    .line 51
    int-to-float p2, p2

    .line 52
    invoke-virtual {p1}, Landroid/webkit/WebView;->getContentHeight()I

    .line 53
    .line 54
    .line 55
    move-result p3

    .line 56
    int-to-float p3, p3

    .line 57
    invoke-virtual {p1}, Landroid/webkit/WebView;->getScale()F

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    mul-float/2addr p3, p1

    .line 62
    cmpg-float p1, p2, p3

    .line 63
    .line 64
    if-gez p1, :cond_2

    .line 65
    .line 66
    move v0, v1

    .line 67
    :cond_2
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->f:Z

    .line 68
    .line 69
    :cond_3
    return-void
.end method

.method public final r()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Landroid/content/res/Configuration;->getLayoutDirection()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x1

    .line 14
    if-ne v0, v1, :cond_2

    .line 15
    .line 16
    sget-object v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout$d;->a:[I

    .line 17
    .line 18
    iget-object v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->o:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    aget v0, v0, v2

    .line 25
    .line 26
    if-eq v0, v1, :cond_1

    .line 27
    .line 28
    const/4 v1, 0x2

    .line 29
    if-eq v0, v1, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    sget-object v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;->a:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 33
    .line 34
    iput-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->o:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 35
    .line 36
    return-void

    .line 37
    :cond_1
    sget-object v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 38
    .line 39
    iput-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->o:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 40
    .line 41
    :cond_2
    :goto_0
    return-void
.end method

.method public setButtonGravity(Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->o:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->r()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setButtonStackedGravity(Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->a:[Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    :goto_0
    if-ge v2, v1, :cond_1

    .line 6
    .line 7
    aget-object v3, v0, v2

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    invoke-virtual {v3, p1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;->setStackedGravity(Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    return-void
.end method

.method public setDividerColor(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->q:Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setMaxHeight(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->b:I

    .line 2
    .line 3
    return-void
.end method

.method public setStackingBehavior(Lcom/xuexiang/xui/widget/dialog/materialdialog/StackingBehavior;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->g:Lcom/xuexiang/xui/widget/dialog/materialdialog/StackingBehavior;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public t()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->k:Z

    .line 3
    .line 4
    return-void
.end method

.method public final u(Landroid/view/View;ZZ)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto/16 :goto_0

    .line 4
    .line 5
    :cond_0
    instance-of v0, p1, Landroid/widget/ScrollView;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_3

    .line 9
    .line 10
    check-cast p1, Landroid/widget/ScrollView;

    .line 11
    .line 12
    invoke-static {p1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->k(Landroid/widget/ScrollView;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->h(Landroid/view/ViewGroup;ZZ)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_1
    if-eqz p2, :cond_2

    .line 23
    .line 24
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->e:Z

    .line 25
    .line 26
    :cond_2
    if-eqz p3, :cond_b

    .line 27
    .line 28
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->f:Z

    .line 29
    .line 30
    return-void

    .line 31
    :cond_3
    instance-of v0, p1, Landroid/widget/AdapterView;

    .line 32
    .line 33
    if-eqz v0, :cond_6

    .line 34
    .line 35
    check-cast p1, Landroid/widget/AdapterView;

    .line 36
    .line 37
    invoke-static {p1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->i(Landroid/widget/AdapterView;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_4

    .line 42
    .line 43
    invoke-virtual {p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->h(Landroid/view/ViewGroup;ZZ)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_4
    if-eqz p2, :cond_5

    .line 48
    .line 49
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->e:Z

    .line 50
    .line 51
    :cond_5
    if-eqz p3, :cond_b

    .line 52
    .line 53
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->f:Z

    .line 54
    .line 55
    return-void

    .line 56
    :cond_6
    instance-of v0, p1, Landroid/webkit/WebView;

    .line 57
    .line 58
    if-eqz v0, :cond_7

    .line 59
    .line 60
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    new-instance v1, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout$a;

    .line 65
    .line 66
    invoke-direct {v1, p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout$a;-><init>(Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;Landroid/view/View;ZZ)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :cond_7
    instance-of v0, p1, Landroidx/recyclerview/widget/RecyclerView;

    .line 74
    .line 75
    if-eqz v0, :cond_a

    .line 76
    .line 77
    move-object v0, p1

    .line 78
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 79
    .line 80
    invoke-static {v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->j(Landroidx/recyclerview/widget/RecyclerView;)Z

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-eqz p2, :cond_8

    .line 85
    .line 86
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->e:Z

    .line 87
    .line 88
    :cond_8
    if-eqz p3, :cond_9

    .line 89
    .line 90
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->f:Z

    .line 91
    .line 92
    :cond_9
    if-eqz v0, :cond_b

    .line 93
    .line 94
    check-cast p1, Landroid/view/ViewGroup;

    .line 95
    .line 96
    invoke-virtual {p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->h(Landroid/view/ViewGroup;ZZ)V

    .line 97
    .line 98
    .line 99
    return-void

    .line 100
    :cond_a
    instance-of v0, p1, Landroid/view/ViewGroup;

    .line 101
    .line 102
    if-eqz v0, :cond_b

    .line 103
    .line 104
    check-cast p1, Landroid/view/ViewGroup;

    .line 105
    .line 106
    invoke-static {p1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->n(Landroid/view/ViewGroup;)Landroid/view/View;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-virtual {p0, v0, p2, p3}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->u(Landroid/view/View;ZZ)V

    .line 111
    .line 112
    .line 113
    invoke-static {p1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->m(Landroid/view/ViewGroup;)Landroid/view/View;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    if-eq p1, v0, :cond_b

    .line 118
    .line 119
    const/4 p2, 0x1

    .line 120
    invoke-virtual {p0, p1, v1, p2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->u(Landroid/view/View;ZZ)V

    .line 121
    .line 122
    .line 123
    :cond_b
    :goto_0
    return-void
.end method
