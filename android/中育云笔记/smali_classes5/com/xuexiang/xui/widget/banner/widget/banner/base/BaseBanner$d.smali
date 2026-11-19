.class public Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner$d;
.super Landroidx/viewpager/widget/PagerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "d"
.end annotation


# instance fields
.field public final synthetic a:Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;


# direct methods
.method public constructor <init>(Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner$d;->a:Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;

    invoke-direct {p0}, Landroidx/viewpager/widget/PagerAdapter;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner$d;-><init>(Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;)V

    return-void
.end method


# virtual methods
.method public destroyItem(Landroid/view/ViewGroup;ILjava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p3, Landroid/view/View;

    .line 2
    .line 3
    invoke-virtual {p1, p3}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public getCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner$d;->a:Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->g:Ljava/util/List;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    return v0
.end method

.method public getItemPosition(Ljava/lang/Object;)I
    .locals 0

    const/4 p1, -0x2

    return p1
.end method

.method public instantiateItem(Landroid/view/ViewGroup;I)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner$d;->a:Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;

    .line 2
    .line 3
    invoke-virtual {v0, p2}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->p(I)Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner$d$a;

    .line 8
    .line 9
    invoke-direct {v1, p0, p2}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner$d$a;-><init>(Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner$d;I)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method

.method public isViewFromObject(Landroid/view/View;Ljava/lang/Object;)Z
    .locals 0

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
