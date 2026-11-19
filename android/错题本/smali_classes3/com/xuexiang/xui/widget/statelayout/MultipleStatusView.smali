.class public Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# static fields
.field public static final i:Landroid/widget/FrameLayout$LayoutParams;


# instance fields
.field public a:Landroid/view/View;

.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:I

.field public g:Landroid/view/LayoutInflater;

.field public final h:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    invoke-direct {v0, v1, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->i:Landroid/widget/FrameLayout$LayoutParams;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 2
    sget v0, Lcom/xuexiang/xui/R$attr;->MultipleStatusViewStyle:I

    invoke-direct {p0, p1, p2, v0}, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    sget v0, Lcom/xuexiang/xui/R$layout;->msv_layout_empty_view:I

    iput v0, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->b:I

    .line 5
    sget v0, Lcom/xuexiang/xui/R$layout;->msv_layout_error_view:I

    iput v0, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->c:I

    .line 6
    sget v0, Lcom/xuexiang/xui/R$layout;->msv_layout_loading_view:I

    iput v0, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->d:I

    .line 7
    sget v0, Lcom/xuexiang/xui/R$layout;->msv_layout_no_network_view:I

    iput v0, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->e:I

    .line 8
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->h:Ljava/util/ArrayList;

    .line 9
    sget-object v0, Lcom/xuexiang/xui/R$styleable;->MultipleStatusView:[I

    const/4 v1, 0x0

    invoke-virtual {p1, p2, v0, p3, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 10
    sget p2, Lcom/xuexiang/xui/R$styleable;->MultipleStatusView_msv_emptyView:I

    iget p3, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->b:I

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->b:I

    .line 11
    sget p2, Lcom/xuexiang/xui/R$styleable;->MultipleStatusView_msv_errorView:I

    iget p3, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->c:I

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->c:I

    .line 12
    sget p2, Lcom/xuexiang/xui/R$styleable;->MultipleStatusView_msv_loadingView:I

    iget p3, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->d:I

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->d:I

    .line 13
    sget p2, Lcom/xuexiang/xui/R$styleable;->MultipleStatusView_msv_noNetworkView:I

    iget p3, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->e:I

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->e:I

    .line 14
    sget p2, Lcom/xuexiang/xui/R$styleable;->MultipleStatusView_msv_contentView:I

    const/4 p3, -0x1

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->f:I

    .line 15
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 16
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    iput-object p1, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->g:Landroid/view/LayoutInflater;

    return-void
.end method


# virtual methods
.method public getContentView()Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->a:Landroid/view/View;

    .line 2
    .line 3
    return-object v0
.end method

.method public getEmptyView()Landroid/view/View;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getErrorView()Landroid/view/View;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getLoadingView()Landroid/view/View;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getNoNetworkView()Landroid/view/View;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getViewStatus()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final onDetachedFromWindow()V
    .locals 4

    .line 1
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    filled-new-array {v0, v0, v0, v0}, [Landroid/view/View;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x0

    .line 10
    :goto_0
    const/4 v3, 0x4

    .line 11
    if-ge v2, v3, :cond_1

    .line 12
    .line 13
    :try_start_0
    aget-object v3, v1, v2

    .line 14
    .line 15
    if-eqz v3, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    .line 19
    .line 20
    goto :goto_1

    .line 21
    :catch_0
    move-exception v1

    .line 22
    goto :goto_2

    .line 23
    :cond_0
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :goto_2
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 27
    .line 28
    .line 29
    :cond_1
    iget-object v1, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->h:Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 32
    .line 33
    .line 34
    iput-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->g:Landroid/view/LayoutInflater;

    .line 35
    .line 36
    return-void
.end method

.method public final onFinishInflate()V
    .locals 6

    .line 1
    invoke-super {p0}, Landroid/view/View;->onFinishInflate()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->a:Landroid/view/View;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/4 v0, -0x1

    .line 10
    iget v2, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->f:I

    .line 11
    .line 12
    if-eq v2, v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->g:Landroid/view/LayoutInflater;

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    invoke-virtual {v0, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iput-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->a:Landroid/view/View;

    .line 22
    .line 23
    sget-object v2, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->i:Landroid/widget/FrameLayout$LayoutParams;

    .line 24
    .line 25
    invoke-virtual {p0, v0, v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    move v2, v1

    .line 33
    :goto_0
    if-ge v2, v0, :cond_2

    .line 34
    .line 35
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-virtual {v3}, Landroid/view/View;->getId()I

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    iget-object v5, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->h:Ljava/util/ArrayList;

    .line 48
    .line 49
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    if-eqz v4, :cond_1

    .line 54
    .line 55
    const/16 v4, 0x8

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_1
    move v4, v1

    .line 59
    :goto_1
    invoke-virtual {v3, v4}, Landroid/view/View;->setVisibility(I)V

    .line 60
    .line 61
    .line 62
    add-int/lit8 v2, v2, 0x1

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_2
    return-void
.end method

.method public setOnRetryClickListener(Landroid/view/View$OnClickListener;)V
    .locals 0

    return-void
.end method
