.class final Lcom/zykj/evaluation/ui/detail/TaskDetailPageKt$TaskDetailPage$9$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/evaluation/ui/detail/TaskDetailPageKt;->m0(JLcom/zykj/evaluation/bean/bundle/DetailBundle;Landroidx/navigation/NavController;Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lkotlinx/coroutines/CoroutineScope;",
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
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lkotlinx/coroutines/CoroutineScope;"
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
    c = "com.zykj.evaluation.ui.detail.TaskDetailPageKt$TaskDetailPage$9$1"
    f = "TaskDetailPage.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;

.field public final synthetic c:Lcom/zykj/evaluation/bean/bundle/DetailBundle;

.field public final synthetic d:Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel;

.field public final synthetic e:J


# direct methods
.method public constructor <init>(Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;Lcom/zykj/evaluation/bean/bundle/DetailBundle;Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel;JLkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/evaluation/ui/detail/TaskDetailPageKt$TaskDetailPage$9$1;->b:Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;

    iput-object p2, p0, Lcom/zykj/evaluation/ui/detail/TaskDetailPageKt$TaskDetailPage$9$1;->c:Lcom/zykj/evaluation/bean/bundle/DetailBundle;

    iput-object p3, p0, Lcom/zykj/evaluation/ui/detail/TaskDetailPageKt$TaskDetailPage$9$1;->d:Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel;

    iput-wide p4, p0, Lcom/zykj/evaluation/ui/detail/TaskDetailPageKt$TaskDetailPage$9$1;->e:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 7

    new-instance v0, Lcom/zykj/evaluation/ui/detail/TaskDetailPageKt$TaskDetailPage$9$1;

    iget-object v1, p0, Lcom/zykj/evaluation/ui/detail/TaskDetailPageKt$TaskDetailPage$9$1;->b:Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;

    iget-object v2, p0, Lcom/zykj/evaluation/ui/detail/TaskDetailPageKt$TaskDetailPage$9$1;->c:Lcom/zykj/evaluation/bean/bundle/DetailBundle;

    iget-object v3, p0, Lcom/zykj/evaluation/ui/detail/TaskDetailPageKt$TaskDetailPage$9$1;->d:Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel;

    iget-wide v4, p0, Lcom/zykj/evaluation/ui/detail/TaskDetailPageKt$TaskDetailPage$9$1;->e:J

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lcom/zykj/evaluation/ui/detail/TaskDetailPageKt$TaskDetailPage$9$1;-><init>(Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;Lcom/zykj/evaluation/bean/bundle/DetailBundle;Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel;JLkotlin/coroutines/Continuation;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/detail/TaskDetailPageKt$TaskDetailPage$9$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/detail/TaskDetailPageKt$TaskDetailPage$9$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/evaluation/ui/detail/TaskDetailPageKt$TaskDetailPage$9$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/evaluation/ui/detail/TaskDetailPageKt$TaskDetailPage$9$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/zykj/evaluation/ui/detail/TaskDetailPageKt$TaskDetailPage$9$1;->a:I

    .line 5
    .line 6
    if-nez v0, :cond_2

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/zykj/evaluation/ui/detail/TaskDetailPageKt$TaskDetailPage$9$1;->b:Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;

    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->Y()Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 20
    .line 21
    return-object p1

    .line 22
    :cond_0
    iget-object p1, p0, Lcom/zykj/evaluation/ui/detail/TaskDetailPageKt$TaskDetailPage$9$1;->c:Lcom/zykj/evaluation/bean/bundle/DetailBundle;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    if-nez p1, :cond_1

    .line 26
    .line 27
    iget-object p1, p0, Lcom/zykj/evaluation/ui/detail/TaskDetailPageKt$TaskDetailPage$9$1;->b:Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;

    .line 28
    .line 29
    new-instance v1, Lcom/zykj/evaluation/ui/detail/TaskDetailPageKt$TaskDetailPage$9$1$1;

    .line 30
    .line 31
    iget-object v2, p0, Lcom/zykj/evaluation/ui/detail/TaskDetailPageKt$TaskDetailPage$9$1;->d:Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel;

    .line 32
    .line 33
    iget-wide v3, p0, Lcom/zykj/evaluation/ui/detail/TaskDetailPageKt$TaskDetailPage$9$1;->e:J

    .line 34
    .line 35
    invoke-direct {v1, v2, v3, v4, v0}, Lcom/zykj/evaluation/ui/detail/TaskDetailPageKt$TaskDetailPage$9$1$1;-><init>(Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel;JLkotlin/coroutines/Continuation;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1, v1}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->V(Lkotlin/jvm/functions/Function2;)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    iget-object v1, p0, Lcom/zykj/evaluation/ui/detail/TaskDetailPageKt$TaskDetailPage$9$1;->b:Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;

    .line 43
    .line 44
    const/4 v2, 0x0

    .line 45
    const/4 v3, 0x2

    .line 46
    invoke-static {v1, p1, v2, v3, v0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->W(Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;Lcom/zykj/evaluation/bean/bundle/DetailBundle;ZILjava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    invoke-static {}, Lg7/b;->a()Landroid/os/Bundle;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    const-string v1, "KEY_DETAIL_BUNDLE"

    .line 54
    .line 55
    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 56
    .line 57
    .line 58
    :goto_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 59
    .line 60
    return-object p1

    .line 61
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 62
    .line 63
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 64
    .line 65
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    throw p1
.end method
