.class Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$OnTabSelectedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->setupWithViewPager(Landroidx/viewpager/widget/ViewPager;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$7;->this$0:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTabReselected(Lcom/xuexiang/xui/widget/tabbar/vertical/TabView;I)V
    .locals 0

    return-void
.end method

.method public onTabSelected(Lcom/xuexiang/xui/widget/tabbar/vertical/TabView;I)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$7;->this$0:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->access$200(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;)Landroidx/viewpager/widget/ViewPager;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$7;->this$0:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->access$200(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;)Landroidx/viewpager/widget/ViewPager;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/viewpager/widget/ViewPager;->getAdapter()Landroidx/viewpager/widget/a;

    move-result-object p1

    if-eqz p1, :cond_0

    if-ltz p2, :cond_0

    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$7;->this$0:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->access$200(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;)Landroidx/viewpager/widget/ViewPager;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/viewpager/widget/ViewPager;->getAdapter()Landroidx/viewpager/widget/a;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/viewpager/widget/a;->getCount()I

    move-result p1

    if-ge p2, p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$7;->this$0:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->access$200(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;)Landroidx/viewpager/widget/ViewPager;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(I)V

    :cond_0
    return-void
.end method

.method public onTabUnselected(Lcom/xuexiang/xui/widget/tabbar/vertical/TabView;I)V
    .locals 0

    return-void
.end method
