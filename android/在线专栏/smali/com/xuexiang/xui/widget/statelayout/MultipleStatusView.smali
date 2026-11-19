.class public Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# static fields
.field private static final DEFAULT_LAYOUT_PARAMS:Landroid/widget/FrameLayout$LayoutParams;

.field private static final NULL_RESOURCE_ID:I = -0x1

.field public static final STATUS_CONTENT:I = 0x0

.field public static final STATUS_EMPTY:I = 0x2

.field public static final STATUS_ERROR:I = 0x3

.field public static final STATUS_LOADING:I = 0x1

.field public static final STATUS_NO_NETWORK:I = 0x4


# instance fields
.field private mContentView:Landroid/view/View;

.field private mContentViewResId:I

.field private mEmptyView:Landroid/view/View;

.field private mEmptyViewResId:I

.field private mErrorView:Landroid/view/View;

.field private mErrorViewResId:I

.field private mInflater:Landroid/view/LayoutInflater;

.field private mLoadingView:Landroid/view/View;

.field private mLoadingViewResId:I

.field private mNoNetworkView:Landroid/view/View;

.field private mNoNetworkViewResId:I

.field private mOnRetryClickListener:Landroid/view/View$OnClickListener;

.field private final mOtherIds:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private mViewStatus:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v1, -0x1

    invoke-direct {v0, v1, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    sput-object v0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->DEFAULT_LAYOUT_PARAMS:Landroid/widget/FrameLayout$LayoutParams;

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
    .locals 1

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    sget v0, Lcom/xuexiang/xui/R$layout;->msv_layout_empty_view:I

    iput v0, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->mEmptyViewResId:I

    .line 5
    sget v0, Lcom/xuexiang/xui/R$layout;->msv_layout_error_view:I

    iput v0, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->mErrorViewResId:I

    .line 6
    sget v0, Lcom/xuexiang/xui/R$layout;->msv_layout_loading_view:I

    iput v0, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->mLoadingViewResId:I

    .line 7
    sget v0, Lcom/xuexiang/xui/R$layout;->msv_layout_no_network_view:I

    iput v0, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->mNoNetworkViewResId:I

    .line 8
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->mOtherIds:Ljava/util/List;

    .line 9
    invoke-direct {p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->initAttrs(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private varargs clear([Landroid/view/View;)V
    .locals 3

    if-nez p1, :cond_0

    return-void

    .line 1
    :cond_0
    :try_start_0
    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    aget-object v2, p1, v1

    if-eqz v2, :cond_1

    .line 2
    invoke-virtual {p0, v2}, Landroid/widget/FrameLayout;->removeView(Landroid/view/View;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :catch_0
    move-exception p1

    .line 3
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_2
    return-void
.end method

.method private inflateView(I)Landroid/view/View;
    .locals 2

    iget-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->mInflater:Landroid/view/LayoutInflater;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method private initAttrs(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .line 1
    sget-object v0, Lcom/xuexiang/xui/R$styleable;->MultipleStatusView:[I

    const/4 v1, 0x0

    invoke-virtual {p1, p2, v0, p3, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 2
    sget p2, Lcom/xuexiang/xui/R$styleable;->MultipleStatusView_msv_emptyView:I

    iget p3, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->mEmptyViewResId:I

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->mEmptyViewResId:I

    .line 3
    sget p2, Lcom/xuexiang/xui/R$styleable;->MultipleStatusView_msv_errorView:I

    iget p3, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->mErrorViewResId:I

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->mErrorViewResId:I

    .line 4
    sget p2, Lcom/xuexiang/xui/R$styleable;->MultipleStatusView_msv_loadingView:I

    iget p3, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->mLoadingViewResId:I

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->mLoadingViewResId:I

    .line 5
    sget p2, Lcom/xuexiang/xui/R$styleable;->MultipleStatusView_msv_noNetworkView:I

    iget p3, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->mNoNetworkViewResId:I

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->mNoNetworkViewResId:I

    .line 6
    sget p2, Lcom/xuexiang/xui/R$styleable;->MultipleStatusView_msv_contentView:I

    const/4 p3, -0x1

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->mContentViewResId:I

    .line 7
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 8
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    iput-object p1, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->mInflater:Landroid/view/LayoutInflater;

    return-void
.end method

.method private showContentView()V
    .locals 6

    .line 1
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    .line 2
    invoke-virtual {p0, v2}, Landroid/widget/FrameLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 3
    iget-object v4, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->mOtherIds:Ljava/util/List;

    invoke-virtual {v3}, Landroid/view/View;->getId()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/16 v4, 0x8

    goto :goto_1

    :cond_0
    const/4 v4, 0x0

    :goto_1
    invoke-virtual {v3, v4}, Landroid/view/View;->setVisibility(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method private showViewById(I)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    .line 2
    invoke-virtual {p0, v2}, Landroid/widget/FrameLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 3
    invoke-virtual {v3}, Landroid/view/View;->getId()I

    move-result v4

    if-ne v4, p1, :cond_0

    const/4 v4, 0x0

    goto :goto_1

    :cond_0
    const/16 v4, 0x8

    :goto_1
    invoke-virtual {v3, v4}, Landroid/view/View;->setVisibility(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method public getContentView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->mContentView:Landroid/view/View;

    return-object v0
.end method

.method public getEmptyView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->mEmptyView:Landroid/view/View;

    return-object v0
.end method

.method public getErrorView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->mErrorView:Landroid/view/View;

    return-object v0
.end method

.method public getLoadingView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->mLoadingView:Landroid/view/View;

    return-object v0
.end method

.method public getNoNetworkView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->mNoNetworkView:Landroid/view/View;

    return-object v0
.end method

.method public getViewStatus()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->mViewStatus:I

    return v0
.end method

.method protected onDetachedFromWindow()V
    .locals 3

    .line 1
    invoke-super {p0}, Landroid/widget/FrameLayout;->onDetachedFromWindow()V

    const/4 v0, 0x4

    new-array v0, v0, [Landroid/view/View;

    .line 2
    iget-object v1, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->mEmptyView:Landroid/view/View;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->mLoadingView:Landroid/view/View;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->mErrorView:Landroid/view/View;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->mNoNetworkView:Landroid/view/View;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    invoke-direct {p0, v0}, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->clear([Landroid/view/View;)V

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->mOtherIds:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    const/4 v0, 0x0

    .line 4
    iput-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->mOnRetryClickListener:Landroid/view/View$OnClickListener;

    .line 5
    iput-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->mInflater:Landroid/view/LayoutInflater;

    return-void
.end method

.method protected onFinishInflate()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/widget/FrameLayout;->onFinishInflate()V

    .line 2
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->showContent()V

    return-void
.end method

.method public setOnRetryClickListener(Landroid/view/View$OnClickListener;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->mOnRetryClickListener:Landroid/view/View$OnClickListener;

    return-void
.end method

.method public final showContent()V
    .locals 4

    const/4 v0, 0x0

    .line 1
    iput v0, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->mViewStatus:I

    .line 2
    iget-object v1, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->mContentView:Landroid/view/View;

    if-nez v1, :cond_0

    iget v1, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->mContentViewResId:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    .line 3
    iget-object v2, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->mInflater:Landroid/view/LayoutInflater;

    const/4 v3, 0x0

    invoke-virtual {v2, v1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    iput-object v1, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->mContentView:Landroid/view/View;

    .line 4
    sget-object v2, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->DEFAULT_LAYOUT_PARAMS:Landroid/widget/FrameLayout$LayoutParams;

    invoke-virtual {p0, v1, v0, v2}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 5
    :cond_0
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->showContentView()V

    return-void
.end method

.method public final showEmpty()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->mEmptyViewResId:I

    sget-object v1, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->DEFAULT_LAYOUT_PARAMS:Landroid/widget/FrameLayout$LayoutParams;

    invoke-virtual {p0, v0, v1}, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->showEmpty(ILandroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public final showEmpty(ILandroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->inflateView(I)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->showEmpty(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public final showEmpty(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    const-string v0, "Empty view is null!"

    .line 3
    invoke-static {p1, v0}, Lcom/xuexiang/xui/utils/Utils;->checkNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x2

    .line 4
    iput v0, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->mViewStatus:I

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->mEmptyView:Landroid/view/View;

    if-nez v0, :cond_1

    .line 6
    iput-object p1, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->mEmptyView:Landroid/view/View;

    .line 7
    iget-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->mOnRetryClickListener:Landroid/view/View$OnClickListener;

    if-eqz v0, :cond_0

    .line 8
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 9
    :cond_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->mOtherIds:Ljava/util/List;

    iget-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->mEmptyView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getId()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 10
    iget-object p1, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->mEmptyView:Landroid/view/View;

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0, p2}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 11
    :cond_1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->mEmptyView:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->showViewById(I)V

    return-void
.end method

.method public final showError()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->mErrorViewResId:I

    sget-object v1, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->DEFAULT_LAYOUT_PARAMS:Landroid/widget/FrameLayout$LayoutParams;

    invoke-virtual {p0, v0, v1}, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->showError(ILandroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public final showError(ILandroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->inflateView(I)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->showError(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public final showError(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    const-string v0, "Error view is null!"

    .line 3
    invoke-static {p1, v0}, Lcom/xuexiang/xui/utils/Utils;->checkNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x3

    .line 4
    iput v0, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->mViewStatus:I

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->mErrorView:Landroid/view/View;

    if-nez v0, :cond_1

    .line 6
    iput-object p1, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->mErrorView:Landroid/view/View;

    .line 7
    iget-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->mOnRetryClickListener:Landroid/view/View$OnClickListener;

    if-eqz v0, :cond_0

    .line 8
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 9
    :cond_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->mOtherIds:Ljava/util/List;

    iget-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->mErrorView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getId()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 10
    iget-object p1, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->mErrorView:Landroid/view/View;

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0, p2}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 11
    :cond_1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->mErrorView:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->showViewById(I)V

    return-void
.end method

.method public final showLoading()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->mLoadingViewResId:I

    sget-object v1, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->DEFAULT_LAYOUT_PARAMS:Landroid/widget/FrameLayout$LayoutParams;

    invoke-virtual {p0, v0, v1}, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->showLoading(ILandroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public final showLoading(ILandroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->inflateView(I)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->showLoading(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public final showLoading(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    const-string v0, "Loading view is null!"

    .line 3
    invoke-static {p1, v0}, Lcom/xuexiang/xui/utils/Utils;->checkNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    .line 4
    iput v0, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->mViewStatus:I

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->mLoadingView:Landroid/view/View;

    if-nez v0, :cond_0

    .line 6
    iput-object p1, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->mLoadingView:Landroid/view/View;

    .line 7
    iget-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->mOtherIds:Ljava/util/List;

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 8
    iget-object p1, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->mLoadingView:Landroid/view/View;

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0, p2}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 9
    :cond_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->mLoadingView:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->showViewById(I)V

    return-void
.end method

.method public final showNoNetwork()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->mNoNetworkViewResId:I

    sget-object v1, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->DEFAULT_LAYOUT_PARAMS:Landroid/widget/FrameLayout$LayoutParams;

    invoke-virtual {p0, v0, v1}, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->showNoNetwork(ILandroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public final showNoNetwork(ILandroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->inflateView(I)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->showNoNetwork(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public final showNoNetwork(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    const-string v0, "No network view is null!"

    .line 3
    invoke-static {p1, v0}, Lcom/xuexiang/xui/utils/Utils;->checkNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x4

    .line 4
    iput v0, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->mViewStatus:I

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->mNoNetworkView:Landroid/view/View;

    if-nez v0, :cond_1

    .line 6
    iput-object p1, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->mNoNetworkView:Landroid/view/View;

    .line 7
    iget-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->mOnRetryClickListener:Landroid/view/View$OnClickListener;

    if-eqz v0, :cond_0

    .line 8
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 9
    :cond_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->mOtherIds:Ljava/util/List;

    iget-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->mNoNetworkView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getId()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 10
    iget-object p1, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->mNoNetworkView:Landroid/view/View;

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0, p2}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 11
    :cond_1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->mNoNetworkView:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->showViewById(I)V

    return-void
.end method
