.class final Lcom/zykj/student/dialogue/ui/home/HomePagerFragment$onViewCreated$1$1$1$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/student/dialogue/ui/home/HomePagerFragment$onViewCreated$1$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Landroidx/paging/CombinedLoadStates;",
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
        "\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "loadStates",
        "Landroidx/paging/CombinedLoadStates;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.zykj.student.dialogue.ui.home.HomePagerFragment$onViewCreated$1$1$1$2"
    f = "HomePagerFragment.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nHomePagerFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomePagerFragment.kt\ncom/zykj/student/dialogue/ui/home/HomePagerFragment$onViewCreated$1$1$1$2\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,288:1\n257#2,2:289\n*S KotlinDebug\n*F\n+ 1 HomePagerFragment.kt\ncom/zykj/student/dialogue/ui/home/HomePagerFragment$onViewCreated$1$1$1$2\n*L\n151#1:289,2\n*E\n"
    }
.end annotation


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lcom/zykj/student/dialogue/ui/home/HomePagerFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/student/dialogue/ui/home/HomePagerFragment;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/home/HomePagerFragment$onViewCreated$1$1$1$2;->c:Lcom/zykj/student/dialogue/ui/home/HomePagerFragment;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/paging/CombinedLoadStates;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/student/dialogue/ui/home/HomePagerFragment$onViewCreated$1$1$1$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/student/dialogue/ui/home/HomePagerFragment$onViewCreated$1$1$1$2;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/student/dialogue/ui/home/HomePagerFragment$onViewCreated$1$1$1$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2

    new-instance v0, Lcom/zykj/student/dialogue/ui/home/HomePagerFragment$onViewCreated$1$1$1$2;

    iget-object v1, p0, Lcom/zykj/student/dialogue/ui/home/HomePagerFragment$onViewCreated$1$1$1$2;->c:Lcom/zykj/student/dialogue/ui/home/HomePagerFragment;

    invoke-direct {v0, v1, p2}, Lcom/zykj/student/dialogue/ui/home/HomePagerFragment$onViewCreated$1$1$1$2;-><init>(Lcom/zykj/student/dialogue/ui/home/HomePagerFragment;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/zykj/student/dialogue/ui/home/HomePagerFragment$onViewCreated$1$1$1$2;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/paging/CombinedLoadStates;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/student/dialogue/ui/home/HomePagerFragment$onViewCreated$1$1$1$2;->a(Landroidx/paging/CombinedLoadStates;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/home/HomePagerFragment$onViewCreated$1$1$1$2;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/paging/CombinedLoadStates;

    .line 4
    .line 5
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    iget v1, p0, Lcom/zykj/student/dialogue/ui/home/HomePagerFragment$onViewCreated$1$1$1$2;->a:I

    .line 9
    .line 10
    if-nez v1, :cond_4

    .line 11
    .line 12
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Landroidx/paging/CombinedLoadStates;->getRefresh()Landroidx/paging/LoadState;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    instance-of p1, p1, Landroidx/paging/LoadState$NotLoading;

    .line 20
    .line 21
    if-eqz p1, :cond_3

    .line 22
    .line 23
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/home/HomePagerFragment$onViewCreated$1$1$1$2;->c:Lcom/zykj/student/dialogue/ui/home/HomePagerFragment;

    .line 24
    .line 25
    invoke-static {p1}, Lcom/zykj/student/dialogue/ui/home/HomePagerFragment;->m(Lcom/zykj/student/dialogue/ui/home/HomePagerFragment;)Lcom/zykj/student/dialogue/databinding/FragmentMainPagerBinding;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    if-nez p1, :cond_0

    .line 30
    .line 31
    const-string p1, "binding"

    .line 32
    .line 33
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const/4 p1, 0x0

    .line 37
    :cond_0
    iget-object p1, p1, Lcom/zykj/student/dialogue/databinding/FragmentMainPagerBinding;->b:Landroid/widget/LinearLayout;

    .line 38
    .line 39
    const-string v0, "llEmpty"

    .line 40
    .line 41
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/home/HomePagerFragment$onViewCreated$1$1$1$2;->c:Lcom/zykj/student/dialogue/ui/home/HomePagerFragment;

    .line 45
    .line 46
    invoke-static {v0}, Lcom/zykj/student/dialogue/ui/home/HomePagerFragment;->p(Lcom/zykj/student/dialogue/ui/home/HomePagerFragment;)Lcom/zykj/student/dialogue/ui/home/SessionListAdapter;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-virtual {v0}, Landroidx/paging/PagingDataAdapter;->getItemCount()I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    const/4 v1, 0x0

    .line 55
    if-nez v0, :cond_1

    .line 56
    .line 57
    const/4 v0, 0x1

    .line 58
    goto :goto_0

    .line 59
    :cond_1
    move v0, v1

    .line 60
    :goto_0
    if-eqz v0, :cond_2

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_2
    const/16 v1, 0x8

    .line 64
    .line 65
    :goto_1
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 66
    .line 67
    .line 68
    :cond_3
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 69
    .line 70
    return-object p1

    .line 71
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 72
    .line 73
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 74
    .line 75
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    throw p1
.end method
