.class final Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment$initView$7$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment$initView$7;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lcom/zykj/student/dialogue/ui/home/category/b;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lcom/zykj/student/dialogue/ui/home/category/b;",
        "it",
        "",
        "<anonymous>",
        "(Lcom/zykj/student/dialogue/ui/home/category/b;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.zykj.student.dialogue.ui.home.category.CategoryListFragment$initView$7$1"
    f = "CategoryListFragment.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment$initView$7$1;->c:Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/zykj/student/dialogue/ui/home/category/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment$initView$7$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment$initView$7$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment$initView$7$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2

    new-instance v0, Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment$initView$7$1;

    iget-object v1, p0, Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment$initView$7$1;->c:Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment;

    invoke-direct {v0, v1, p2}, Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment$initView$7$1;-><init>(Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment$initView$7$1;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/zykj/student/dialogue/ui/home/category/b;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment$initView$7$1;->a(Lcom/zykj/student/dialogue/ui/home/category/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment$initView$7$1;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lcom/zykj/student/dialogue/ui/home/category/b;

    .line 4
    .line 5
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    iget v1, p0, Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment$initView$7$1;->a:I

    .line 9
    .line 10
    if-nez v1, :cond_3

    .line 11
    .line 12
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    instance-of p1, v0, Lcom/zykj/student/dialogue/ui/home/category/b$a;

    .line 16
    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment$initView$7$1;->c:Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment;

    .line 20
    .line 21
    invoke-static {p1}, Landroidx/navigation/fragment/FragmentKt;->findNavController(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    sget v0, Lcom/zykj/student/dialogue/R$id;->addCategoryFragment:I

    .line 26
    .line 27
    invoke-virtual {p1, v0}, Landroidx/navigation/NavController;->navigate(I)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    instance-of p1, v0, Lcom/zykj/student/dialogue/ui/home/category/b$c;

    .line 32
    .line 33
    if-eqz p1, :cond_1

    .line 34
    .line 35
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment$initView$7$1;->c:Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment;

    .line 36
    .line 37
    invoke-static {p1}, Landroidx/navigation/fragment/FragmentKt;->findNavController(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    sget v1, Lcom/zykj/student/dialogue/R$id;->updateCategoryFragment:I

    .line 42
    .line 43
    check-cast v0, Lcom/zykj/student/dialogue/ui/home/category/b$c;

    .line 44
    .line 45
    invoke-virtual {v0}, Lcom/zykj/student/dialogue/ui/home/category/b$c;->a()Lcom/zykj/student/dialogue/bean/resp/CatalogResp;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    const-string v2, "category"

    .line 50
    .line 51
    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    filled-new-array {v0}, [Lkotlin/Pair;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-static {v0}, Landroidx/core/os/BundleKt;->bundleOf([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-virtual {p1, v1, v0}, Landroidx/navigation/NavController;->navigate(ILandroid/os/Bundle;)V

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_1
    instance-of p1, v0, Lcom/zykj/student/dialogue/ui/home/category/b$b;

    .line 68
    .line 69
    if-eqz p1, :cond_2

    .line 70
    .line 71
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment$initView$7$1;->c:Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment;

    .line 72
    .line 73
    invoke-static {p1}, Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment;->h(Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment;)Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    check-cast v0, Lcom/zykj/student/dialogue/ui/home/category/b$b;

    .line 78
    .line 79
    invoke-virtual {v0}, Lcom/zykj/student/dialogue/ui/home/category/b$b;->a()Lcom/zykj/student/dialogue/bean/resp/CatalogResp;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-virtual {v0}, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;->getId()J

    .line 84
    .line 85
    .line 86
    move-result-wide v0

    .line 87
    invoke-virtual {p1, v0, v1}, Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel;->s(J)V

    .line 88
    .line 89
    .line 90
    :goto_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 91
    .line 92
    return-object p1

    .line 93
    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 94
    .line 95
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 96
    .line 97
    .line 98
    throw p1

    .line 99
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 100
    .line 101
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 102
    .line 103
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    throw p1
.end method
