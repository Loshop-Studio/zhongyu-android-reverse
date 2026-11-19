.class public Lcom/xuexiang/xui/widget/progress/loading/LoadingViewLayout;
.super Landroid/widget/LinearLayout;
.source "SourceFile"

# interfaces
.implements Lcom/xuexiang/xui/widget/progress/loading/IMessageLoader;


# instance fields
.field private mLoadingView:Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;

.field private mTvTipMessage:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 2
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/progress/loading/LoadingViewLayout;->initView(Landroid/content/Context;)V

    const/4 v0, 0x0

    .line 3
    invoke-direct {p0, p1, v0}, Lcom/xuexiang/xui/widget/progress/loading/LoadingViewLayout;->initAttrs(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 4
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 5
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/progress/loading/LoadingViewLayout;->initView(Landroid/content/Context;)V

    .line 6
    invoke-direct {p0, p1, p2}, Lcom/xuexiang/xui/widget/progress/loading/LoadingViewLayout;->initAttrs(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 7
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 8
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/progress/loading/LoadingViewLayout;->initView(Landroid/content/Context;)V

    .line 9
    invoke-direct {p0, p1, p2}, Lcom/xuexiang/xui/widget/progress/loading/LoadingViewLayout;->initAttrs(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method private initAttrs(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    if-eqz p2, :cond_1

    .line 1
    sget-object v0, Lcom/xuexiang/xui/R$styleable;->LoadingViewLayout:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 2
    sget p2, Lcom/xuexiang/xui/R$styleable;->LoadingViewLayout_lvl_message:I

    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p2

    .line 3
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 4
    invoke-virtual {p0, p2}, Lcom/xuexiang/xui/widget/progress/loading/LoadingViewLayout;->updateMessage(Ljava/lang/String;)V

    .line 5
    :cond_0
    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getContext()Landroid/content/Context;

    move-result-object p2

    sget v0, Lcom/xuexiang/xui/R$styleable;->LoadingViewLayout_lvl_icon:I

    invoke-static {p2, p1, v0}, Lcom/xuexiang/xui/utils/ResUtils;->getDrawableAttrRes(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/xuexiang/xui/widget/progress/loading/LoadingViewLayout;->setLoadingIcon(Landroid/graphics/drawable/Drawable;)Lcom/xuexiang/xui/widget/progress/loading/LoadingViewLayout;

    .line 6
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    :cond_1
    return-void
.end method

.method private initLayoutStyle(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const/16 v0, 0x11

    .line 2
    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->setGravity(I)V

    const/16 v0, 0x8

    .line 3
    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 4
    sget v0, Lcom/xuexiang/xui/R$attr;->xui_dialog_loading_padding_size:I

    invoke-static {p1, v0}, Lcom/xuexiang/xui/utils/ThemeUtils;->resolveDimension(Landroid/content/Context;I)I

    move-result v0

    .line 5
    invoke-virtual {p0, v0, v0, v0, v0}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    .line 6
    sget v0, Lcom/xuexiang/xui/R$attr;->xui_dialog_loading_min_size:I

    invoke-static {p1, v0}, Lcom/xuexiang/xui/utils/ThemeUtils;->resolveDimension(Landroid/content/Context;I)I

    move-result p1

    .line 7
    invoke-virtual {p0, p1}, Landroid/widget/LinearLayout;->setMinimumHeight(I)V

    .line 8
    invoke-virtual {p0, p1}, Landroid/widget/LinearLayout;->setMinimumWidth(I)V

    return-void
.end method

.method private initView(Landroid/content/Context;)V
    .locals 3

    .line 1
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/xuexiang/xui/R$layout;->xui_layout_loading_view:I

    const/4 v2, 0x1

    invoke-virtual {v0, v1, p0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 2
    sget v0, Lcom/xuexiang/xui/R$id;->arc_loading_view:I

    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;

    iput-object v0, p0, Lcom/xuexiang/xui/widget/progress/loading/LoadingViewLayout;->mLoadingView:Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;

    .line 3
    sget v0, Lcom/xuexiang/xui/R$id;->tv_tip_message:I

    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/xuexiang/xui/widget/progress/loading/LoadingViewLayout;->mTvTipMessage:Landroid/widget/TextView;

    .line 4
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/progress/loading/LoadingViewLayout;->initLayoutStyle(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public dismiss()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/loading/LoadingViewLayout;->mLoadingView:Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->stop()V

    :cond_0
    const/16 v0, 0x8

    .line 3
    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    return-void
.end method

.method public getDrawable(I)Landroid/graphics/drawable/Drawable;
    .locals 1

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/xuexiang/xui/utils/ResUtils;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    return-object p1
.end method

.method public getString(I)Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public isLoading()Z
    .locals 1

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public recycle()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/loading/LoadingViewLayout;->mLoadingView:Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->recycle()V

    :cond_0
    return-void
.end method

.method public setCancelable(Z)V
    .locals 0

    return-void
.end method

.method public setIconScale(F)Lcom/xuexiang/xui/widget/progress/loading/LoadingViewLayout;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/loading/LoadingViewLayout;->mLoadingView:Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->setIconScale(F)Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;

    :cond_0
    return-object p0
.end method

.method public setLoadingCancelListener(Lcom/xuexiang/xui/widget/progress/loading/LoadingCancelListener;)V
    .locals 0

    return-void
.end method

.method public setLoadingIcon(I)Lcom/xuexiang/xui/widget/progress/loading/LoadingViewLayout;
    .locals 0

    .line 3
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/progress/loading/LoadingViewLayout;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/progress/loading/LoadingViewLayout;->setLoadingIcon(Landroid/graphics/drawable/Drawable;)Lcom/xuexiang/xui/widget/progress/loading/LoadingViewLayout;

    move-result-object p1

    return-object p1
.end method

.method public setLoadingIcon(Landroid/graphics/drawable/Drawable;)Lcom/xuexiang/xui/widget/progress/loading/LoadingViewLayout;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/loading/LoadingViewLayout;->mLoadingView:Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->setLoadingIcon(Landroid/graphics/drawable/Drawable;)Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;

    :cond_0
    return-object p0
.end method

.method public show()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/loading/LoadingViewLayout;->mLoadingView:Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->start()V

    :cond_0
    return-void
.end method

.method public updateMessage(I)V
    .locals 0

    .line 7
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/progress/loading/LoadingViewLayout;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/progress/loading/LoadingViewLayout;->updateMessage(Ljava/lang/String;)V

    return-void
.end method

.method public updateMessage(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/loading/LoadingViewLayout;->mTvTipMessage:Landroid/widget/TextView;

    if-eqz v0, :cond_1

    .line 2
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/loading/LoadingViewLayout;->mTvTipMessage:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 4
    iget-object p1, p0, Lcom/xuexiang/xui/widget/progress/loading/LoadingViewLayout;->mTvTipMessage:Landroid/widget/TextView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 5
    :cond_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/progress/loading/LoadingViewLayout;->mTvTipMessage:Landroid/widget/TextView;

    const-string v0, ""

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 6
    iget-object p1, p0, Lcom/xuexiang/xui/widget/progress/loading/LoadingViewLayout;->mTvTipMessage:Landroid/widget/TextView;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    :cond_1
    :goto_0
    return-void
.end method
