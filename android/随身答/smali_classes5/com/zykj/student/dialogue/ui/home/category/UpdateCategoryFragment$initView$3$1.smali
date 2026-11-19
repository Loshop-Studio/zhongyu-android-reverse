.class final Lcom/zykj/student/dialogue/ui/home/category/UpdateCategoryFragment$initView$3$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/student/dialogue/ui/home/category/UpdateCategoryFragment$initView$3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lcom/zykj/student/dialogue/ui/home/category/a;",
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
        "Lcom/zykj/student/dialogue/ui/home/category/a;",
        "it",
        "",
        "<anonymous>",
        "(Lcom/zykj/student/dialogue/ui/home/category/a;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.zykj.student.dialogue.ui.home.category.UpdateCategoryFragment$initView$3$1"
    f = "UpdateCategoryFragment.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lcom/zykj/student/dialogue/ui/home/category/UpdateCategoryFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/student/dialogue/ui/home/category/UpdateCategoryFragment;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/home/category/UpdateCategoryFragment$initView$3$1;->c:Lcom/zykj/student/dialogue/ui/home/category/UpdateCategoryFragment;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/zykj/student/dialogue/ui/home/category/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/student/dialogue/ui/home/category/UpdateCategoryFragment$initView$3$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/student/dialogue/ui/home/category/UpdateCategoryFragment$initView$3$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/student/dialogue/ui/home/category/UpdateCategoryFragment$initView$3$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2

    new-instance v0, Lcom/zykj/student/dialogue/ui/home/category/UpdateCategoryFragment$initView$3$1;

    iget-object v1, p0, Lcom/zykj/student/dialogue/ui/home/category/UpdateCategoryFragment$initView$3$1;->c:Lcom/zykj/student/dialogue/ui/home/category/UpdateCategoryFragment;

    invoke-direct {v0, v1, p2}, Lcom/zykj/student/dialogue/ui/home/category/UpdateCategoryFragment$initView$3$1;-><init>(Lcom/zykj/student/dialogue/ui/home/category/UpdateCategoryFragment;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/zykj/student/dialogue/ui/home/category/UpdateCategoryFragment$initView$3$1;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/zykj/student/dialogue/ui/home/category/a;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/student/dialogue/ui/home/category/UpdateCategoryFragment$initView$3$1;->a(Lcom/zykj/student/dialogue/ui/home/category/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/home/category/UpdateCategoryFragment$initView$3$1;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lcom/zykj/student/dialogue/ui/home/category/a;

    .line 4
    .line 5
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    iget v1, p0, Lcom/zykj/student/dialogue/ui/home/category/UpdateCategoryFragment$initView$3$1;->a:I

    .line 9
    .line 10
    if-nez v1, :cond_1

    .line 11
    .line 12
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    instance-of p1, v0, Lcom/zykj/student/dialogue/ui/home/category/a$b;

    .line 16
    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/home/category/UpdateCategoryFragment$initView$3$1;->c:Lcom/zykj/student/dialogue/ui/home/category/UpdateCategoryFragment;

    .line 20
    .line 21
    invoke-virtual {p1}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    check-cast p1, Lcom/zykj/student/dialogue/databinding/DialogueFragmentUpdateCategoryBinding;

    .line 26
    .line 27
    iget-object p1, p1, Lcom/zykj/student/dialogue/databinding/DialogueFragmentUpdateCategoryBinding;->a:Landroid/widget/TextView;

    .line 28
    .line 29
    const/4 v1, 0x1

    .line 30
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 31
    .line 32
    .line 33
    check-cast v0, Lcom/zykj/student/dialogue/ui/home/category/a$b;

    .line 34
    .line 35
    invoke-virtual {v0}, Lcom/zykj/student/dialogue/ui/home/category/a$b;->a()Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-eqz p1, :cond_0

    .line 40
    .line 41
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/home/category/UpdateCategoryFragment$initView$3$1;->c:Lcom/zykj/student/dialogue/ui/home/category/UpdateCategoryFragment;

    .line 42
    .line 43
    new-instance v0, Landroid/os/Bundle;

    .line 44
    .line 45
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 46
    .line 47
    .line 48
    const-string v1, "RefreshList"

    .line 49
    .line 50
    invoke-static {p1, v1, v0}, Landroidx/fragment/app/FragmentKt;->setFragmentResult(Landroidx/fragment/app/Fragment;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 51
    .line 52
    .line 53
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/home/category/UpdateCategoryFragment$initView$3$1;->c:Lcom/zykj/student/dialogue/ui/home/category/UpdateCategoryFragment;

    .line 54
    .line 55
    invoke-static {p1}, Landroidx/navigation/fragment/FragmentKt;->findNavController(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-virtual {p1}, Landroidx/navigation/NavController;->navigateUp()Z

    .line 60
    .line 61
    .line 62
    :cond_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 63
    .line 64
    return-object p1

    .line 65
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 66
    .line 67
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 68
    .line 69
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    throw p1
.end method
