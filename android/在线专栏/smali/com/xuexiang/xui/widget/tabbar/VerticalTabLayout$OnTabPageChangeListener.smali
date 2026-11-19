.class Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$OnTabPageChangeListener;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/viewpager/widget/ViewPager$i;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "OnTabPageChangeListener"
.end annotation


# instance fields
.field private mScrollState:I

.field mUpdateIndicator:Z

.field final synthetic this$0:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;


# direct methods
.method public constructor <init>(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$OnTabPageChangeListener;->this$0:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPageScrollStateChanged(I)V
    .locals 2

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$OnTabPageChangeListener;->mScrollState:I

    .line 2
    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$OnTabPageChangeListener;->mScrollState:I

    const/4 v1, 0x2

    if-ne p1, v1, :cond_1

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 3
    :goto_1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$OnTabPageChangeListener;->mUpdateIndicator:Z

    return-void
.end method

.method public onPageScrolled(IFI)V
    .locals 0

    .line 1
    iget-boolean p3, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$OnTabPageChangeListener;->mUpdateIndicator:Z

    if-eqz p3, :cond_0

    .line 2
    iget-object p3, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$OnTabPageChangeListener;->this$0:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;

    invoke-static {p3}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->access$000(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;)Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;

    move-result-object p3

    int-to-float p1, p1

    add-float/2addr p2, p1

    invoke-virtual {p3, p2}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;->moveIndicator(F)V

    :cond_0
    return-void
.end method

.method public onPageSelected(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$OnTabPageChangeListener;->this$0:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->getSelectedTabPosition()I

    move-result v0

    if-eq p1, v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$OnTabPageChangeListener;->this$0:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;

    iget-boolean v1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$OnTabPageChangeListener;->mUpdateIndicator:Z

    const/4 v2, 0x1

    xor-int/2addr v1, v2

    invoke-static {v0, p1, v1, v2}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->access$1300(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;IZZ)V

    :cond_0
    return-void
.end method
