.class public final Lb2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;


# instance fields
.field public final synthetic a:Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;


# direct methods
.method public constructor <init>(Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lb2/b;->a:Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onPageScrollStateChanged(I)V
    .locals 0

    .line 1
    sget p1, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->y:I

    .line 2
    .line 3
    iget-object p1, p0, Lb2/b;->a:Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final onPageScrolled(IFI)V
    .locals 0

    .line 1
    sget p1, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->y:I

    .line 2
    .line 3
    iget-object p1, p0, Lb2/b;->a:Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final onPageSelected(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lb2/b;->a:Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;

    .line 2
    .line 3
    iget-object v1, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->e:Ljava/util/List;

    .line 4
    .line 5
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    rem-int/2addr p1, v1

    .line 10
    iput p1, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->f:I

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->setCurrentIndicator(I)V

    .line 13
    .line 14
    .line 15
    iget p1, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->f:I

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->e(I)V

    .line 18
    .line 19
    .line 20
    iget-object p1, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->p:Landroid/widget/LinearLayout;

    .line 21
    .line 22
    iget v1, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->f:I

    .line 23
    .line 24
    iget-object v2, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->e:Ljava/util/List;

    .line 25
    .line 26
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    add-int/lit8 v2, v2, -0x1

    .line 31
    .line 32
    if-ne v1, v2, :cond_0

    .line 33
    .line 34
    iget-boolean v1, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->q:Z

    .line 35
    .line 36
    if-nez v1, :cond_0

    .line 37
    .line 38
    const/16 v1, 0x8

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    const/4 v1, 0x0

    .line 42
    :goto_0
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 43
    .line 44
    .line 45
    iget p1, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->f:I

    .line 46
    .line 47
    iput p1, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->g:I

    .line 48
    .line 49
    return-void
.end method
