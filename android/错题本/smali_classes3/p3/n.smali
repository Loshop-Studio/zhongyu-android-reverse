.class public final Lp3/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;


# instance fields
.field public a:I

.field public b:Z

.field public final synthetic c:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;


# direct methods
.method public constructor <init>(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lp3/n;->c:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onPageScrollStateChanged(I)V
    .locals 2

    .line 1
    iget v0, p0, Lp3/n;->a:I

    .line 2
    .line 3
    iput p1, p0, Lp3/n;->a:I

    .line 4
    .line 5
    const/4 v1, 0x2

    .line 6
    if-ne p1, v1, :cond_1

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 p1, 0x0

    .line 12
    goto :goto_1

    .line 13
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 14
    :goto_1
    iput-boolean p1, p0, Lp3/n;->b:Z

    .line 15
    .line 16
    return-void
.end method

.method public final onPageScrolled(IFI)V
    .locals 0

    .line 1
    iget-boolean p3, p0, Lp3/n;->b:Z

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    iget-object p3, p0, Lp3/n;->c:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;

    .line 6
    .line 7
    iget-object p3, p3, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->b:Lp3/r;

    .line 8
    .line 9
    int-to-float p1, p1

    .line 10
    add-float/2addr p2, p1

    .line 11
    invoke-virtual {p3, p2}, Lp3/r;->a(F)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public final onPageSelected(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lp3/n;->c:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->getSelectedTabPosition()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eq p1, v1, :cond_0

    .line 8
    .line 9
    iget-boolean v1, p0, Lp3/n;->b:Z

    .line 10
    .line 11
    xor-int/lit8 v1, v1, 0x1

    .line 12
    .line 13
    new-instance v2, Lp3/l;

    .line 14
    .line 15
    invoke-direct {v2, v0, p1, v1}, Lp3/l;-><init>(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;IZ)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
.end method
