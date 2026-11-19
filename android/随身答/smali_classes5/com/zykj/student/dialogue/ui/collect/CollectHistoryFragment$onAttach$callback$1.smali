.class public final Lcom/zykj/student/dialogue/ui/collect/CollectHistoryFragment$onAttach$callback$1;
.super Landroidx/activity/OnBackPressedCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/student/dialogue/ui/collect/CollectHistoryFragment;->onAttach(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0008\u0010\u0002\u001a\u00020\u0003H\u0016\u00a8\u0006\u0004"
    }
    d2 = {
        "com/zykj/student/dialogue/ui/collect/CollectHistoryFragment$onAttach$callback$1",
        "Landroidx/activity/OnBackPressedCallback;",
        "handleOnBackPressed",
        "",
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


# instance fields
.field public final synthetic a:Lcom/zykj/student/dialogue/ui/collect/CollectHistoryFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/student/dialogue/ui/collect/CollectHistoryFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/collect/CollectHistoryFragment$onAttach$callback$1;->a:Lcom/zykj/student/dialogue/ui/collect/CollectHistoryFragment;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    invoke-direct {p0, p1}, Landroidx/activity/OnBackPressedCallback;-><init>(Z)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public handleOnBackPressed()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/collect/CollectHistoryFragment$onAttach$callback$1;->a:Lcom/zykj/student/dialogue/ui/collect/CollectHistoryFragment;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/zykj/student/dialogue/ui/collect/CollectHistoryFragment;->l(Lcom/zykj/student/dialogue/ui/collect/CollectHistoryFragment;)Lcom/zykj/student/dialogue/databinding/FragmentCollectHistoryBinding;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    const-string v2, "binding"

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    move-object v0, v1

    .line 16
    :cond_0
    iget-object v0, v0, Lcom/zykj/student/dialogue/databinding/FragmentCollectHistoryBinding;->c:Landroidx/drawerlayout/widget/DrawerLayout;

    .line 17
    .line 18
    const v3, 0x800005

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v3}, Landroidx/drawerlayout/widget/DrawerLayout;->isDrawerOpen(I)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/collect/CollectHistoryFragment$onAttach$callback$1;->a:Lcom/zykj/student/dialogue/ui/collect/CollectHistoryFragment;

    .line 28
    .line 29
    invoke-static {v0}, Lcom/zykj/student/dialogue/ui/collect/CollectHistoryFragment;->l(Lcom/zykj/student/dialogue/ui/collect/CollectHistoryFragment;)Lcom/zykj/student/dialogue/databinding/FragmentCollectHistoryBinding;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    if-nez v0, :cond_1

    .line 34
    .line 35
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    move-object v1, v0

    .line 40
    :goto_0
    iget-object v0, v1, Lcom/zykj/student/dialogue/databinding/FragmentCollectHistoryBinding;->c:Landroidx/drawerlayout/widget/DrawerLayout;

    .line 41
    .line 42
    invoke-virtual {v0, v3}, Landroidx/drawerlayout/widget/DrawerLayout;->closeDrawer(I)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_2
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/collect/CollectHistoryFragment$onAttach$callback$1;->a:Lcom/zykj/student/dialogue/ui/collect/CollectHistoryFragment;

    .line 47
    .line 48
    invoke-static {v0}, Lcom/zykj/student/dialogue/ui/collect/CollectHistoryFragment;->o(Lcom/zykj/student/dialogue/ui/collect/CollectHistoryFragment;)Lcom/zykj/student/dialogue/ui/home/HomeViewModel;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {v0}, Lcom/zykj/student/dialogue/ui/home/HomeViewModel;->E()Lkotlinx/coroutines/flow/StateFlow;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-interface {v0}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    check-cast v0, Ls6/s2;

    .line 61
    .line 62
    invoke-virtual {v0}, Ls6/s2;->g()Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-eqz v0, :cond_3

    .line 67
    .line 68
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/collect/CollectHistoryFragment$onAttach$callback$1;->a:Lcom/zykj/student/dialogue/ui/collect/CollectHistoryFragment;

    .line 69
    .line 70
    invoke-static {v0}, Lcom/zykj/student/dialogue/ui/collect/CollectHistoryFragment;->o(Lcom/zykj/student/dialogue/ui/collect/CollectHistoryFragment;)Lcom/zykj/student/dialogue/ui/home/HomeViewModel;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-virtual {v0}, Lcom/zykj/student/dialogue/ui/home/HomeViewModel;->x()V

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :cond_3
    const/4 v0, 0x0

    .line 79
    invoke-virtual {p0, v0}, Landroidx/activity/OnBackPressedCallback;->setEnabled(Z)V

    .line 80
    .line 81
    .line 82
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/collect/CollectHistoryFragment$onAttach$callback$1;->a:Lcom/zykj/student/dialogue/ui/collect/CollectHistoryFragment;

    .line 83
    .line 84
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    invoke-virtual {v0}, Landroidx/activity/ComponentActivity;->getOnBackPressedDispatcher()Landroidx/activity/OnBackPressedDispatcher;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    invoke-virtual {v0}, Landroidx/activity/OnBackPressedDispatcher;->onBackPressed()V

    .line 93
    .line 94
    .line 95
    const/4 v0, 0x1

    .line 96
    invoke-virtual {p0, v0}, Landroidx/activity/OnBackPressedCallback;->setEnabled(Z)V

    .line 97
    .line 98
    .line 99
    return-void
.end method
