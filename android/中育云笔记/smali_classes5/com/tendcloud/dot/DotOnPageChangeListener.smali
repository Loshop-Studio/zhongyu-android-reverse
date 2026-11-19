.class public Lcom/tendcloud/dot/DotOnPageChangeListener;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tendcloud/dot/DotOnPageChangeListener$PageChangeListener;
    }
.end annotation


# static fields
.field private static b:Lcom/tendcloud/dot/DotOnPageChangeListener$PageChangeListener;


# instance fields
.field private a:Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;

.field private c:Landroidx/viewpager/widget/ViewPager;


# direct methods
.method private constructor <init>(Landroidx/viewpager/widget/ViewPager;Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/tendcloud/dot/DotOnPageChangeListener;->c:Landroidx/viewpager/widget/ViewPager;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/tendcloud/dot/DotOnPageChangeListener;->a:Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;

    .line 7
    .line 8
    return-void
.end method

.method private a()Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tendcloud/dot/DotOnPageChangeListener;->a:Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;

    .line 2
    .line 3
    return-object v0
.end method

.method public static getDotOnPageChangeListener(Landroidx/viewpager/widget/ViewPager;Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;)Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;
    .locals 2

    .line 1
    :try_start_0
    instance-of v0, p1, Lcom/tendcloud/dot/DotOnPageChangeListener;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/tendcloud/dot/DotOnPageChangeListener;

    .line 6
    .line 7
    move-object v1, p1

    .line 8
    check-cast v1, Lcom/tendcloud/dot/DotOnPageChangeListener;

    .line 9
    .line 10
    invoke-direct {v1}, Lcom/tendcloud/dot/DotOnPageChangeListener;->a()Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-direct {v0, p0, v1}, Lcom/tendcloud/dot/DotOnPageChangeListener;-><init>(Landroidx/viewpager/widget/ViewPager;Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;)V

    .line 15
    .line 16
    .line 17
    return-object v0

    .line 18
    :catchall_0
    move-exception p0

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/tendcloud/dot/DotOnPageChangeListener;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lcom/tendcloud/dot/DotOnPageChangeListener;-><init>(Landroidx/viewpager/widget/ViewPager;Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    .line 25
    return-object v0

    .line 26
    :goto_0
    invoke-static {p0}, Lcom/tendcloud/tenddata/ca;->eForInternal(Ljava/lang/Throwable;)V

    .line 27
    .line 28
    .line 29
    return-object p1
.end method

.method public static setCallback(Lcom/tendcloud/dot/DotOnPageChangeListener$PageChangeListener;)V
    .locals 0

    .line 1
    sput-object p0, Lcom/tendcloud/dot/DotOnPageChangeListener;->b:Lcom/tendcloud/dot/DotOnPageChangeListener$PageChangeListener;

    .line 2
    .line 3
    return-void
.end method


# virtual methods
.method public onPageScrollStateChanged(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tendcloud/dot/DotOnPageChangeListener;->a:Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;

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
    iget-object v0, p0, Lcom/tendcloud/dot/DotOnPageChangeListener;->a:Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;

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
    :try_start_0
    sget-object v0, Lcom/tendcloud/dot/DotOnPageChangeListener;->b:Lcom/tendcloud/dot/DotOnPageChangeListener$PageChangeListener;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1}, Lcom/tendcloud/dot/DotOnPageChangeListener$PageChangeListener;->onPageSelect(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    .line 7
    .line 8
    goto :goto_0

    .line 9
    :catchall_0
    move-exception v0

    .line 10
    invoke-static {v0}, Lcom/tendcloud/tenddata/ca;->eForInternal(Ljava/lang/Throwable;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/tendcloud/dot/DotOnPageChangeListener;->a:Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    invoke-interface {v0, p1}, Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;->onPageSelected(I)V

    .line 18
    .line 19
    .line 20
    :cond_1
    return-void
.end method
