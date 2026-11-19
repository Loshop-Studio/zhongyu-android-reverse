.class public final Lcom/zykj/student/dialogue/ui/home/HomeFragment$onViewCreated$9$1;
.super Landroidx/viewpager2/adapter/FragmentStateAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/student/dialogue/ui/home/HomeFragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0008\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0003H\u0016\u00a8\u0006\u000c"
    }
    d2 = {
        "com/zykj/student/dialogue/ui/home/HomeFragment$onViewCreated$9$1",
        "Landroidx/viewpager2/adapter/FragmentStateAdapter;",
        "getItemCount",
        "",
        "createFragment",
        "Landroidx/fragment/app/Fragment;",
        "position",
        "containsItem",
        "",
        "itemId",
        "",
        "getItemId",
        "app_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nHomeFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeFragment.kt\ncom/zykj/student/dialogue/ui/home/HomeFragment$onViewCreated$9$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,436:1\n1761#2,3:437\n*S KotlinDebug\n*F\n+ 1 HomeFragment.kt\ncom/zykj/student/dialogue/ui/home/HomeFragment$onViewCreated$9$1\n*L\n247#1:437,3\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/zykj/student/dialogue/ui/home/HomeFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/student/dialogue/ui/home/HomeFragment;Landroidx/fragment/app/FragmentManager;Landroidx/lifecycle/Lifecycle;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/home/HomeFragment$onViewCreated$9$1;->a:Lcom/zykj/student/dialogue/ui/home/HomeFragment;

    .line 2
    .line 3
    invoke-direct {p0, p2, p3}, Landroidx/viewpager2/adapter/FragmentStateAdapter;-><init>(Landroidx/fragment/app/FragmentManager;Landroidx/lifecycle/Lifecycle;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public containsItem(J)Z
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/home/HomeFragment$onViewCreated$9$1;->a:Lcom/zykj/student/dialogue/ui/home/HomeFragment;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/zykj/student/dialogue/ui/home/HomeFragment;->M(Lcom/zykj/student/dialogue/ui/home/HomeFragment;)Lcom/zykj/student/dialogue/ui/home/HomeViewModel;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lcom/zykj/student/dialogue/ui/home/HomeViewModel;->E()Lkotlinx/coroutines/flow/StateFlow;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {v0}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Ls6/s2;

    .line 16
    .line 17
    invoke-virtual {v0}, Ls6/s2;->e()Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const/4 v1, 0x0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    return v1

    .line 31
    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-eqz v2, :cond_2

    .line 40
    .line 41
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    check-cast v2, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;

    .line 46
    .line 47
    invoke-virtual {v2}, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;->getId()J

    .line 48
    .line 49
    .line 50
    move-result-wide v2

    .line 51
    cmp-long v2, v2, p1

    .line 52
    .line 53
    if-nez v2, :cond_1

    .line 54
    .line 55
    const/4 p1, 0x1

    .line 56
    return p1

    .line 57
    :cond_2
    return v1
.end method

.method public createFragment(I)Landroidx/fragment/app/Fragment;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/home/HomeFragment$onViewCreated$9$1;->a:Lcom/zykj/student/dialogue/ui/home/HomeFragment;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/zykj/student/dialogue/ui/home/HomeFragment;->M(Lcom/zykj/student/dialogue/ui/home/HomeFragment;)Lcom/zykj/student/dialogue/ui/home/HomeViewModel;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lcom/zykj/student/dialogue/ui/home/HomeViewModel;->E()Lkotlinx/coroutines/flow/StateFlow;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {v0}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Ls6/s2;

    .line 16
    .line 17
    invoke-virtual {v0}, Ls6/s2;->e()Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    check-cast p1, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;

    .line 26
    .line 27
    invoke-virtual {p1}, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;->getId()J

    .line 28
    .line 29
    .line 30
    move-result-wide v0

    .line 31
    sget-object v2, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;->Companion:Lcom/zykj/student/dialogue/bean/resp/CatalogResp$Companion;

    .line 32
    .line 33
    invoke-virtual {v2}, Lcom/zykj/student/dialogue/bean/resp/CatalogResp$Companion;->getHISTORY_COLLECT()Lcom/zykj/student/dialogue/bean/resp/CatalogResp;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-virtual {v2}, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;->getId()J

    .line 38
    .line 39
    .line 40
    move-result-wide v2

    .line 41
    cmp-long v0, v0, v2

    .line 42
    .line 43
    if-nez v0, :cond_0

    .line 44
    .line 45
    new-instance p1, Lcom/zykj/student/dialogue/ui/collect/CollectHistoryFragment;

    .line 46
    .line 47
    invoke-direct {p1}, Lcom/zykj/student/dialogue/ui/collect/CollectHistoryFragment;-><init>()V

    .line 48
    .line 49
    .line 50
    return-object p1

    .line 51
    :cond_0
    sget-object v0, Lcom/zykj/student/dialogue/ui/home/HomePagerFragment;->j:Lcom/zykj/student/dialogue/ui/home/HomePagerFragment$a;

    .line 52
    .line 53
    invoke-virtual {p1}, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;->getId()J

    .line 54
    .line 55
    .line 56
    move-result-wide v1

    .line 57
    invoke-virtual {v0, v1, v2}, Lcom/zykj/student/dialogue/ui/home/HomePagerFragment$a;->a(J)Lcom/zykj/student/dialogue/ui/home/HomePagerFragment;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    return-object p1
.end method

.method public getItemCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/home/HomeFragment$onViewCreated$9$1;->a:Lcom/zykj/student/dialogue/ui/home/HomeFragment;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/zykj/student/dialogue/ui/home/HomeFragment;->M(Lcom/zykj/student/dialogue/ui/home/HomeFragment;)Lcom/zykj/student/dialogue/ui/home/HomeViewModel;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lcom/zykj/student/dialogue/ui/home/HomeViewModel;->E()Lkotlinx/coroutines/flow/StateFlow;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {v0}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Ls6/s2;

    .line 16
    .line 17
    invoke-virtual {v0}, Ls6/s2;->e()Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    return v0
.end method

.method public getItemId(I)J
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/home/HomeFragment$onViewCreated$9$1;->a:Lcom/zykj/student/dialogue/ui/home/HomeFragment;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/zykj/student/dialogue/ui/home/HomeFragment;->M(Lcom/zykj/student/dialogue/ui/home/HomeFragment;)Lcom/zykj/student/dialogue/ui/home/HomeViewModel;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lcom/zykj/student/dialogue/ui/home/HomeViewModel;->E()Lkotlinx/coroutines/flow/StateFlow;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {v0}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Ls6/s2;

    .line 16
    .line 17
    invoke-virtual {v0}, Ls6/s2;->e()Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    check-cast p1, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;

    .line 26
    .line 27
    invoke-virtual {p1}, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;->getId()J

    .line 28
    .line 29
    .line 30
    move-result-wide v0

    .line 31
    return-wide v0
.end method
