.class public Lcom/xuexiang/xui/widget/banner/widget/banner/SimpleGuideBanner;
.super Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/banner/widget/banner/SimpleGuideBanner$OnJumpClickListener;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner<",
        "Ljava/lang/Object;",
        "Lcom/xuexiang/xui/widget/banner/widget/banner/SimpleGuideBanner;",
        ">;"
    }
.end annotation


# instance fields
.field private onJumpClickListener:Lcom/xuexiang/xui/widget/banner/widget/banner/SimpleGuideBanner$OnJumpClickListener;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;-><init>(Landroid/content/Context;)V

    .line 2
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/widget/banner/SimpleGuideBanner;->onCreateBanner()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p2}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 4
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/widget/banner/SimpleGuideBanner;->onCreateBanner()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 5
    invoke-direct {p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 6
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/widget/banner/SimpleGuideBanner;->onCreateBanner()V

    return-void
.end method

.method static synthetic access$000(Lcom/xuexiang/xui/widget/banner/widget/banner/SimpleGuideBanner;)Lcom/xuexiang/xui/widget/banner/widget/banner/SimpleGuideBanner$OnJumpClickListener;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/SimpleGuideBanner;->onJumpClickListener:Lcom/xuexiang/xui/widget/banner/widget/banner/SimpleGuideBanner$OnJumpClickListener;

    return-object p0
.end method


# virtual methods
.method protected onCreateBanner()V
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->setBarShowWhenLast(Z)Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->setAutoScrollEnable(Z)Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;

    return-void
.end method

.method public onCreateItemView(I)Landroid/view/View;
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mContext:Landroid/content/Context;

    sget v1, Lcom/xuexiang/xui/R$layout;->xui_adapter_simple_guide:I

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    .line 2
    sget v1, Lcom/xuexiang/xui/R$id;->iv:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    .line 3
    sget v2, Lcom/xuexiang/xui/R$id;->tv_jump:I

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    .line 4
    sget v3, Lcom/xuexiang/xui/R$id;->tv_start:I

    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    .line 5
    iget-object v4, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mDatas:Ljava/util/List;

    invoke-interface {v4, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    const/4 v5, 0x0

    const/16 v6, 0x8

    if-nez p1, :cond_0

    const/4 v7, 0x0

    goto :goto_0

    :cond_0
    const/16 v7, 0x8

    .line 6
    :goto_0
    invoke-virtual {v2, v7}, Landroid/widget/TextView;->setVisibility(I)V

    .line 7
    iget-object v7, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mDatas:Ljava/util/List;

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v7

    add-int/lit8 v7, v7, -0x1

    if-ne p1, v7, :cond_1

    goto :goto_1

    :cond_1
    const/16 v5, 0x8

    :goto_1
    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setVisibility(I)V

    .line 8
    invoke-static {}, Lcom/xuexiang/xui/widget/imageview/ImageLoader;->get()Lcom/xuexiang/xui/widget/imageview/ImageLoader;

    move-result-object p1

    invoke-virtual {p1, v1, v4}, Lcom/xuexiang/xui/widget/imageview/ImageLoader;->loadImage(Landroid/widget/ImageView;Ljava/lang/Object;)V

    .line 9
    new-instance p1, Lcom/xuexiang/xui/widget/banner/widget/banner/SimpleGuideBanner$1;

    invoke-direct {p1, p0}, Lcom/xuexiang/xui/widget/banner/widget/banner/SimpleGuideBanner$1;-><init>(Lcom/xuexiang/xui/widget/banner/widget/banner/SimpleGuideBanner;)V

    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 10
    new-instance p1, Lcom/xuexiang/xui/widget/banner/widget/banner/SimpleGuideBanner$2;

    invoke-direct {p1, p0}, Lcom/xuexiang/xui/widget/banner/widget/banner/SimpleGuideBanner$2;-><init>(Lcom/xuexiang/xui/widget/banner/widget/banner/SimpleGuideBanner;)V

    invoke-virtual {v3, p1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-object v0
.end method

.method public setOnJumpClickListener(Lcom/xuexiang/xui/widget/banner/widget/banner/SimpleGuideBanner$OnJumpClickListener;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/SimpleGuideBanner;->onJumpClickListener:Lcom/xuexiang/xui/widget/banner/widget/banner/SimpleGuideBanner$OnJumpClickListener;

    return-void
.end method
