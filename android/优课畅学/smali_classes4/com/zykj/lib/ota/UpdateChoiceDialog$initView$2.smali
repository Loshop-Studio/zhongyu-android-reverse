.class final Lcom/zykj/lib/ota/UpdateChoiceDialog$initView$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/lib/ota/UpdateChoiceDialog;->initView(Landroid/os/Bundle;Lm7/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lx7/p;"
    }
.end annotation

.annotation runtime Lo7/d;
    c = "com.zykj.lib.ota.UpdateChoiceDialog$initView$2"
    f = "UpdateChoiceDialog.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/zykj/lib/ota/UpdateChoiceDialog;


# direct methods
.method public constructor <init>(Lcom/zykj/lib/ota/UpdateChoiceDialog;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/lib/ota/UpdateChoiceDialog$initView$2;->b:Lcom/zykj/lib/ota/UpdateChoiceDialog;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILm7/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public static synthetic c(Lcom/zykj/lib/ota/UpdateChoiceDialog;Ljava/lang/Boolean;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/lib/ota/UpdateChoiceDialog$initView$2;->m(Lcom/zykj/lib/ota/UpdateChoiceDialog;Ljava/lang/Boolean;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lcom/zykj/lib/ota/UpdateChoiceDialog;Ljava/lang/Boolean;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/lib/ota/UpdateChoiceDialog$initView$2;->l(Lcom/zykj/lib/ota/UpdateChoiceDialog;Ljava/lang/Boolean;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Ljava/lang/Boolean;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/lib/ota/UpdateChoiceDialog$initView$2;->n(Ljava/lang/Boolean;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static final l(Lcom/zykj/lib/ota/UpdateChoiceDialog;Ljava/lang/Boolean;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/navigation/fragment/FragmentKt;->findNavController(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Landroidx/navigation/NavController;->navigateUp()Z

    .line 6
    .line 7
    .line 8
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 9
    .line 10
    return-object p0
.end method

.method public static final m(Lcom/zykj/lib/ota/UpdateChoiceDialog;Ljava/lang/Boolean;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/lib/ota/UpdateChoiceDialog;->h(Lcom/zykj/lib/ota/UpdateChoiceDialog;)Lcom/zykj/lib/ota/UpdateChoiceDialogArgs;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/zykj/lib/ota/UpdateChoiceDialogArgs;->a()Lcom/zykj/lib/ota/bean/VersionInfo;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p1}, Lcom/zykj/lib/ota/bean/VersionInfo;->getFileUrl()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-static {p0, p1}, Lcom/zykj/lib/ota/UpdateChoiceDialog;->k(Lcom/zykj/lib/ota/UpdateChoiceDialog;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 17
    .line 18
    return-object p0
.end method

.method public static final n(Ljava/lang/Boolean;)Lh7/p;
    .locals 0

    .line 1
    sget-object p0, Lcom/zykj/base/utils/ActivityCollectionHelper;->INSTANCE:Lcom/zykj/base/utils/ActivityCollectionHelper;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/zykj/base/utils/ActivityCollectionHelper;->exitApp()V

    .line 4
    .line 5
    .line 6
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 7
    .line 8
    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm7/c;)Lm7/c;
    .locals 1

    .line 1
    new-instance p1, Lcom/zykj/lib/ota/UpdateChoiceDialog$initView$2;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/lib/ota/UpdateChoiceDialog$initView$2;->b:Lcom/zykj/lib/ota/UpdateChoiceDialog;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lcom/zykj/lib/ota/UpdateChoiceDialog$initView$2;-><init>(Lcom/zykj/lib/ota/UpdateChoiceDialog;Lm7/c;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public final invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/lib/ota/UpdateChoiceDialog$initView$2;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/lib/ota/UpdateChoiceDialog$initView$2;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/zykj/lib/ota/UpdateChoiceDialog$initView$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Li8/b0;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/lib/ota/UpdateChoiceDialog$initView$2;->invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/zykj/lib/ota/UpdateChoiceDialog$initView$2;->a:I

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/zykj/lib/ota/UpdateChoiceDialog$initView$2;->b:Lcom/zykj/lib/ota/UpdateChoiceDialog;

    .line 12
    .line 13
    invoke-static {p1}, Lcom/zykj/lib/ota/UpdateChoiceDialog;->i(Lcom/zykj/lib/ota/UpdateChoiceDialog;)Lcom/zykj/lib/ota/viewmodel/VersionViewModel;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p1}, Lcom/zykj/lib/ota/viewmodel/VersionViewModel;->c()Landroidx/lifecycle/MutableLiveData;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iget-object v0, p0, Lcom/zykj/lib/ota/UpdateChoiceDialog$initView$2;->b:Lcom/zykj/lib/ota/UpdateChoiceDialog;

    .line 22
    .line 23
    new-instance v1, Lcom/zykj/lib/ota/b;

    .line 24
    .line 25
    invoke-direct {v1, v0}, Lcom/zykj/lib/ota/b;-><init>(Lcom/zykj/lib/ota/UpdateChoiceDialog;)V

    .line 26
    .line 27
    .line 28
    new-instance v2, Lcom/zykj/lib/ota/UpdateChoiceDialog$b;

    .line 29
    .line 30
    invoke-direct {v2, v1}, Lcom/zykj/lib/ota/UpdateChoiceDialog$b;-><init>(Lx7/l;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1, v0, v2}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 34
    .line 35
    .line 36
    iget-object p1, p0, Lcom/zykj/lib/ota/UpdateChoiceDialog$initView$2;->b:Lcom/zykj/lib/ota/UpdateChoiceDialog;

    .line 37
    .line 38
    invoke-static {p1}, Lcom/zykj/lib/ota/UpdateChoiceDialog;->i(Lcom/zykj/lib/ota/UpdateChoiceDialog;)Lcom/zykj/lib/ota/viewmodel/VersionViewModel;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {p1}, Lcom/zykj/lib/ota/viewmodel/VersionViewModel;->f()Landroidx/lifecycle/MutableLiveData;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    iget-object v0, p0, Lcom/zykj/lib/ota/UpdateChoiceDialog$initView$2;->b:Lcom/zykj/lib/ota/UpdateChoiceDialog;

    .line 47
    .line 48
    new-instance v1, Lcom/zykj/lib/ota/c;

    .line 49
    .line 50
    invoke-direct {v1, v0}, Lcom/zykj/lib/ota/c;-><init>(Lcom/zykj/lib/ota/UpdateChoiceDialog;)V

    .line 51
    .line 52
    .line 53
    new-instance v2, Lcom/zykj/lib/ota/UpdateChoiceDialog$b;

    .line 54
    .line 55
    invoke-direct {v2, v1}, Lcom/zykj/lib/ota/UpdateChoiceDialog$b;-><init>(Lx7/l;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1, v0, v2}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 59
    .line 60
    .line 61
    iget-object p1, p0, Lcom/zykj/lib/ota/UpdateChoiceDialog$initView$2;->b:Lcom/zykj/lib/ota/UpdateChoiceDialog;

    .line 62
    .line 63
    invoke-static {p1}, Lcom/zykj/lib/ota/UpdateChoiceDialog;->i(Lcom/zykj/lib/ota/UpdateChoiceDialog;)Lcom/zykj/lib/ota/viewmodel/VersionViewModel;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-virtual {p1}, Lcom/zykj/lib/ota/viewmodel/VersionViewModel;->b()Landroidx/lifecycle/MutableLiveData;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    iget-object v0, p0, Lcom/zykj/lib/ota/UpdateChoiceDialog$initView$2;->b:Lcom/zykj/lib/ota/UpdateChoiceDialog;

    .line 72
    .line 73
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    new-instance v1, Lcom/zykj/lib/ota/d;

    .line 78
    .line 79
    invoke-direct {v1}, Lcom/zykj/lib/ota/d;-><init>()V

    .line 80
    .line 81
    .line 82
    new-instance v2, Lcom/zykj/lib/ota/UpdateChoiceDialog$b;

    .line 83
    .line 84
    invoke-direct {v2, v1}, Lcom/zykj/lib/ota/UpdateChoiceDialog$b;-><init>(Lx7/l;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p1, v0, v2}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 88
    .line 89
    .line 90
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 91
    .line 92
    return-object p1

    .line 93
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 94
    .line 95
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 96
    .line 97
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    throw p1
.end method
