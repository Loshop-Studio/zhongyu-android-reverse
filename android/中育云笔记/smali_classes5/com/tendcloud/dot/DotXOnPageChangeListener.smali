.class public Lcom/tendcloud/dot/DotXOnPageChangeListener;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tendcloud/dot/DotXOnPageChangeListener$PageChangeListener;
    }
.end annotation


# instance fields
.field private a:Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;

.field private b:Lcom/tendcloud/dot/DotXOnPageChangeListener$PageChangeListener;

.field private c:Landroidx/viewpager/widget/ViewPager;


# direct methods
.method private constructor <init>(Landroidx/viewpager/widget/ViewPager;Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/tendcloud/dot/DotXOnPageChangeListener;->c:Landroidx/viewpager/widget/ViewPager;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/tendcloud/dot/DotXOnPageChangeListener;->a:Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;

    .line 7
    .line 8
    return-void
.end method

.method private a()Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tendcloud/dot/DotXOnPageChangeListener;->a:Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;

    return-object v0
.end method

.method private a(Landroid/view/View;)Ljava/lang/String;
    .locals 2

    .line 2
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 3
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getResourceEntryName(I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 4
    :cond_0
    const-string p1, "-1"

    return-object p1
.end method

.method public static getDotOnPageChangeListener(Landroidx/viewpager/widget/ViewPager;Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;)Lcom/tendcloud/dot/DotXOnPageChangeListener;
    .locals 1

    .line 1
    instance-of v0, p1, Lcom/tendcloud/dot/DotXOnPageChangeListener;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/tendcloud/dot/DotXOnPageChangeListener;

    .line 6
    .line 7
    check-cast p1, Lcom/tendcloud/dot/DotXOnPageChangeListener;

    .line 8
    .line 9
    invoke-direct {p1}, Lcom/tendcloud/dot/DotXOnPageChangeListener;->a()Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-direct {v0, p0, p1}, Lcom/tendcloud/dot/DotXOnPageChangeListener;-><init>(Landroidx/viewpager/widget/ViewPager;Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;)V

    .line 14
    .line 15
    .line 16
    return-object v0

    .line 17
    :cond_0
    new-instance v0, Lcom/tendcloud/dot/DotXOnPageChangeListener;

    .line 18
    .line 19
    invoke-direct {v0, p0, p1}, Lcom/tendcloud/dot/DotXOnPageChangeListener;-><init>(Landroidx/viewpager/widget/ViewPager;Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;)V

    .line 20
    .line 21
    .line 22
    return-object v0
.end method


# virtual methods
.method public onPageScrollStateChanged(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tendcloud/dot/DotXOnPageChangeListener;->a:Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1}, Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;->onPageScrollStateChanged(I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public onPageScrolled(IFI)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tendcloud/dot/DotXOnPageChangeListener;->a:Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1, p2, p3}, Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;->onPageScrolled(IFI)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public onPageSelected(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tendcloud/dot/DotXOnPageChangeListener;->b:Lcom/tendcloud/dot/DotXOnPageChangeListener$PageChangeListener;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1}, Lcom/tendcloud/dot/DotXOnPageChangeListener$PageChangeListener;->onPageSelect(I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Lcom/tendcloud/dot/DotXOnPageChangeListener;->a:Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    invoke-interface {v0, p1}, Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;->onPageSelected(I)V

    .line 13
    .line 14
    .line 15
    :cond_1
    return-void
.end method
