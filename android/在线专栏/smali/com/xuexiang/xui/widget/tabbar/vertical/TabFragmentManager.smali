.class public Lcom/xuexiang/xui/widget/tabbar/vertical/TabFragmentManager;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/tabbar/vertical/TabFragmentManager$OnFragmentTabSelectedListener;
    }
.end annotation


# instance fields
.field private mContainerResId:I

.field private mFragments:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/fragment/app/Fragment;",
            ">;"
        }
    .end annotation
.end field

.field private mListener:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$OnTabSelectedListener;

.field private mManager:Landroidx/fragment/app/FragmentManager;

.field private mTabLayout:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/FragmentManager;ILjava/util/List;Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/fragment/app/FragmentManager;",
            "I",
            "Ljava/util/List<",
            "Landroidx/fragment/app/Fragment;",
            ">;",
            "Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;",
            ")V"
        }
    .end annotation

    .line 7
    invoke-direct {p0, p1, p3, p4}, Lcom/xuexiang/xui/widget/tabbar/vertical/TabFragmentManager;-><init>(Landroidx/fragment/app/FragmentManager;Ljava/util/List;Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;)V

    .line 8
    iput p2, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/TabFragmentManager;->mContainerResId:I

    .line 9
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/tabbar/vertical/TabFragmentManager;->changeFragment()V

    return-void
.end method

.method public constructor <init>(Landroidx/fragment/app/FragmentManager;Ljava/util/List;Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/fragment/app/FragmentManager;",
            "Ljava/util/List<",
            "Landroidx/fragment/app/Fragment;",
            ">;",
            "Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/TabFragmentManager;->mManager:Landroidx/fragment/app/FragmentManager;

    .line 3
    iput-object p2, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/TabFragmentManager;->mFragments:Ljava/util/List;

    .line 4
    iput-object p3, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/TabFragmentManager;->mTabLayout:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;

    .line 5
    new-instance p1, Lcom/xuexiang/xui/widget/tabbar/vertical/TabFragmentManager$OnFragmentTabSelectedListener;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Lcom/xuexiang/xui/widget/tabbar/vertical/TabFragmentManager$OnFragmentTabSelectedListener;-><init>(Lcom/xuexiang/xui/widget/tabbar/vertical/TabFragmentManager;Lcom/xuexiang/xui/widget/tabbar/vertical/TabFragmentManager$1;)V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/TabFragmentManager;->mListener:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$OnTabSelectedListener;

    .line 6
    iget-object p2, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/TabFragmentManager;->mTabLayout:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;

    invoke-virtual {p2, p1}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->addOnTabSelectedListener(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$OnTabSelectedListener;)V

    return-void
.end method


# virtual methods
.method public changeFragment()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/TabFragmentManager;->mManager:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->m()Landroidx/fragment/app/s;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/TabFragmentManager;->mTabLayout:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;

    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->getSelectedTabPosition()I

    move-result v1

    .line 3
    iget-object v2, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/TabFragmentManager;->mManager:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {v2}, Landroidx/fragment/app/FragmentManager;->u0()Ljava/util/List;

    move-result-object v2

    const/4 v3, 0x0

    .line 4
    :goto_0
    iget-object v4, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/TabFragmentManager;->mFragments:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ge v3, v4, :cond_5

    .line 5
    iget-object v4, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/TabFragmentManager;->mFragments:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/fragment/app/Fragment;

    if-eqz v2, :cond_0

    .line 6
    invoke-interface {v2, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1

    :cond_0
    iget v5, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/TabFragmentManager;->mContainerResId:I

    if-eqz v5, :cond_1

    .line 7
    invoke-virtual {v0, v5, v4}, Landroidx/fragment/app/s;->b(ILandroidx/fragment/app/Fragment;)Landroidx/fragment/app/s;

    .line 8
    :cond_1
    iget-object v5, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/TabFragmentManager;->mFragments:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    if-le v5, v1, :cond_2

    if-eq v3, v1, :cond_3

    :cond_2
    iget-object v5, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/TabFragmentManager;->mFragments:Ljava/util/List;

    .line 9
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    if-gt v5, v1, :cond_4

    iget-object v5, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/TabFragmentManager;->mFragments:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    add-int/lit8 v5, v5, -0x1

    if-ne v3, v5, :cond_4

    .line 10
    :cond_3
    invoke-virtual {v0, v4}, Landroidx/fragment/app/s;->u(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/s;

    goto :goto_1

    .line 11
    :cond_4
    invoke-virtual {v0, v4}, Landroidx/fragment/app/s;->o(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/s;

    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 12
    :cond_5
    invoke-virtual {v0}, Landroidx/fragment/app/s;->h()I

    .line 13
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/TabFragmentManager;->mManager:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->f0()Z

    return-void
.end method

.method public detach()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/TabFragmentManager;->mManager:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->m()Landroidx/fragment/app/s;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/TabFragmentManager;->mFragments:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/fragment/app/Fragment;

    .line 3
    invoke-virtual {v0, v2}, Landroidx/fragment/app/s;->p(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/s;

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {v0}, Landroidx/fragment/app/s;->h()I

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/TabFragmentManager;->mManager:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->f0()Z

    const/4 v0, 0x0

    .line 6
    iput-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/TabFragmentManager;->mManager:Landroidx/fragment/app/FragmentManager;

    .line 7
    iput-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/TabFragmentManager;->mFragments:Ljava/util/List;

    .line 8
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/TabFragmentManager;->mTabLayout:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;

    iget-object v2, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/TabFragmentManager;->mListener:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$OnTabSelectedListener;

    invoke-virtual {v1, v2}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->removeOnTabSelectedListener(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$OnTabSelectedListener;)V

    .line 9
    iput-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/TabFragmentManager;->mListener:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$OnTabSelectedListener;

    .line 10
    iput-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/TabFragmentManager;->mTabLayout:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;

    return-void
.end method
