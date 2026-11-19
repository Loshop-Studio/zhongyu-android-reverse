.class public final Lcom/zykj/huiwei/launcher/ui/fragment/HomeFragment$initObserver$3$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/coroutines/flow/FlowCollector;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/huiwei/launcher/ui/fragment/HomeFragment$initObserver$3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/zykj/huiwei/launcher/ui/fragment/HomeFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/huiwei/launcher/ui/fragment/HomeFragment;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/huiwei/launcher/ui/fragment/HomeFragment$initObserver$3$a;->a:Lcom/zykj/huiwei/launcher/ui/fragment/HomeFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lcom/zykj/huiwei/launcher/ui/fragment/HomeFragment;Ljava/lang/String;Landroid/os/Bundle;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/huiwei/launcher/ui/fragment/HomeFragment$initObserver$3$a;->c(Lcom/zykj/huiwei/launcher/ui/fragment/HomeFragment;Ljava/lang/String;Landroid/os/Bundle;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lcom/zykj/huiwei/launcher/ui/fragment/HomeFragment;Ljava/lang/String;Landroid/os/Bundle;)Lkotlin/Unit;
    .locals 1

    .line 1
    const-string v0, "<unused var>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-static {p0}, Lcom/zykj/huiwei/launcher/ui/fragment/HomeFragment;->z(Lcom/zykj/huiwei/launcher/ui/fragment/HomeFragment;)Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    sget-object p1, Lcom/zykj/huiwei/launcher/app/App;->Companion:Lcom/zykj/huiwei/launcher/app/App$a;

    .line 14
    .line 15
    invoke-virtual {p1}, Lcom/zykj/huiwei/launcher/app/App$a;->a()Lcom/zykj/huiwei/launcher/app/App;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    const-string p2, "getPackageName(...)"

    .line 24
    .line 25
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, p1}, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;->o(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 32
    .line 33
    return-object p0
.end method


# virtual methods
.method public final b(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-object p1, p0, Lcom/zykj/huiwei/launcher/ui/fragment/HomeFragment$initObserver$3$a;->a:Lcom/zykj/huiwei/launcher/ui/fragment/HomeFragment;

    .line 2
    .line 3
    invoke-static {p1}, Landroidx/navigation/fragment/FragmentKt;->findNavController(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1}, Landroidx/navigation/NavController;->getCurrentDestination()Landroidx/navigation/NavDestination;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const p2, 0x7f090335

    .line 12
    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    invoke-virtual {p1}, Landroidx/navigation/NavDestination;->getId()I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-ne p1, p2, :cond_0

    .line 21
    .line 22
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 23
    .line 24
    return-object p1

    .line 25
    :cond_0
    iget-object p1, p0, Lcom/zykj/huiwei/launcher/ui/fragment/HomeFragment$initObserver$3$a;->a:Lcom/zykj/huiwei/launcher/ui/fragment/HomeFragment;

    .line 26
    .line 27
    invoke-static {p1}, Lcom/zykj/huiwei/launcher/ui/fragment/HomeFragment;->z(Lcom/zykj/huiwei/launcher/ui/fragment/HomeFragment;)Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p1}, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;->v()V

    .line 32
    .line 33
    .line 34
    iget-object p1, p0, Lcom/zykj/huiwei/launcher/ui/fragment/HomeFragment$initObserver$3$a;->a:Lcom/zykj/huiwei/launcher/ui/fragment/HomeFragment;

    .line 35
    .line 36
    :goto_0
    if-eqz p1, :cond_1

    .line 37
    .line 38
    instance-of v0, p1, Lcom/zykj/huiwei/launcher/ui/fragment/MainFragment;

    .line 39
    .line 40
    if-nez v0, :cond_1

    .line 41
    .line 42
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getParentFragment()Landroidx/fragment/app/Fragment;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    goto :goto_0

    .line 47
    :cond_1
    instance-of v0, p1, Lcom/zykj/huiwei/launcher/ui/fragment/MainFragment;

    .line 48
    .line 49
    if-eqz v0, :cond_2

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_2
    const/4 p1, 0x0

    .line 53
    :goto_1
    check-cast p1, Lcom/zykj/huiwei/launcher/ui/fragment/MainFragment;

    .line 54
    .line 55
    if-eqz p1, :cond_3

    .line 56
    .line 57
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/ui/fragment/HomeFragment$initObserver$3$a;->a:Lcom/zykj/huiwei/launcher/ui/fragment/HomeFragment;

    .line 58
    .line 59
    new-instance v1, Lf4/k;

    .line 60
    .line 61
    invoke-direct {v1, v0}, Lf4/k;-><init>(Lcom/zykj/huiwei/launcher/ui/fragment/HomeFragment;)V

    .line 62
    .line 63
    .line 64
    const-string v0, "TipsDialogRequestKey"

    .line 65
    .line 66
    invoke-static {p1, v0, v1}, Landroidx/fragment/app/FragmentKt;->setFragmentResultListener(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    .line 67
    .line 68
    .line 69
    :cond_3
    iget-object p1, p0, Lcom/zykj/huiwei/launcher/ui/fragment/HomeFragment$initObserver$3$a;->a:Lcom/zykj/huiwei/launcher/ui/fragment/HomeFragment;

    .line 70
    .line 71
    const v0, 0x7f11008a

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    const-string v0, "getString(...)"

    .line 79
    .line 80
    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    iget-object v1, p0, Lcom/zykj/huiwei/launcher/ui/fragment/HomeFragment$initObserver$3$a;->a:Lcom/zykj/huiwei/launcher/ui/fragment/HomeFragment;

    .line 84
    .line 85
    const v3, 0x7f110099

    .line 86
    .line 87
    .line 88
    invoke-virtual {v1, v3}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v4

    .line 92
    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    new-instance v1, Lcom/zykj/huiwei/launcher/ui/dialog/TipsDialogArgs;

    .line 96
    .line 97
    const/4 v8, 0x2

    .line 98
    const/4 v9, 0x0

    .line 99
    const/4 v3, 0x0

    .line 100
    const/4 v5, 0x0

    .line 101
    const/4 v6, 0x0

    .line 102
    const/4 v7, 0x0

    .line 103
    invoke-direct/range {v1 .. v9}, Lcom/zykj/huiwei/launcher/ui/dialog/TipsDialogArgs;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v1}, Lcom/zykj/huiwei/launcher/ui/dialog/TipsDialogArgs;->g()Landroid/os/Bundle;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    new-instance v1, Landroidx/navigation/NavOptions$Builder;

    .line 111
    .line 112
    invoke-direct {v1}, Landroidx/navigation/NavOptions$Builder;-><init>()V

    .line 113
    .line 114
    .line 115
    const/4 v2, 0x1

    .line 116
    invoke-virtual {v1, v2}, Landroidx/navigation/NavOptions$Builder;->setLaunchSingleTop(Z)Landroidx/navigation/NavOptions$Builder;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    invoke-virtual {v1}, Landroidx/navigation/NavOptions$Builder;->build()Landroidx/navigation/NavOptions;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    invoke-virtual {p1, p2, v0, v1}, Lcom/zykj/huiwei/launcher/base/CommonFragment;->d(ILandroid/os/Bundle;Landroidx/navigation/NavOptions;)V

    .line 125
    .line 126
    .line 127
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 128
    .line 129
    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-virtual {p0, p1, p2}, Lcom/zykj/huiwei/launcher/ui/fragment/HomeFragment$initObserver$3$a;->b(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method
