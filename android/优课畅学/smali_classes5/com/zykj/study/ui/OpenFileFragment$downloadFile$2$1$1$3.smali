.class final Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$3;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/ui/OpenFileFragment;->p(Ljava/lang/String;)V
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
    c = "com.zykj.study.ui.OpenFileFragment$downloadFile$2$1$1$3"
    f = "OpenFileFragment.kt"
    l = {
        0xc2
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/zykj/study/ui/OpenFileFragment;

.field public final synthetic c:Landroidx/work/WorkInfo;

.field public final synthetic d:Landroid/content/DialogInterface;


# direct methods
.method public constructor <init>(Lcom/zykj/study/ui/OpenFileFragment;Landroidx/work/WorkInfo;Landroid/content/DialogInterface;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$3;->b:Lcom/zykj/study/ui/OpenFileFragment;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$3;->c:Landroidx/work/WorkInfo;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$3;->d:Landroid/content/DialogInterface;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILm7/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm7/c;)Lm7/c;
    .locals 3

    .line 1
    new-instance p1, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$3;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$3;->b:Lcom/zykj/study/ui/OpenFileFragment;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$3;->c:Landroidx/work/WorkInfo;

    .line 6
    .line 7
    iget-object v2, p0, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$3;->d:Landroid/content/DialogInterface;

    .line 8
    .line 9
    invoke-direct {p1, v0, v1, v2, p2}, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$3;-><init>(Lcom/zykj/study/ui/OpenFileFragment;Landroidx/work/WorkInfo;Landroid/content/DialogInterface;Lm7/c;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method public final invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$3;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$3;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Li8/b0;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$3;->invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$3;->a:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    if-ne v1, v2, :cond_0

    .line 11
    .line 12
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p1

    .line 24
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$3;->b:Lcom/zykj/study/ui/OpenFileFragment;

    .line 28
    .line 29
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    const-string v1, "getViewLifecycleOwner(...)"

    .line 34
    .line 35
    invoke-static {p1, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    sget-object v1, Landroidx/lifecycle/Lifecycle$State;->STARTED:Landroidx/lifecycle/Lifecycle$State;

    .line 39
    .line 40
    new-instance v3, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$3$1;

    .line 41
    .line 42
    iget-object v4, p0, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$3;->c:Landroidx/work/WorkInfo;

    .line 43
    .line 44
    iget-object v5, p0, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$3;->d:Landroid/content/DialogInterface;

    .line 45
    .line 46
    const/4 v6, 0x0

    .line 47
    invoke-direct {v3, v4, v5, v6}, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$3$1;-><init>(Landroidx/work/WorkInfo;Landroid/content/DialogInterface;Lm7/c;)V

    .line 48
    .line 49
    .line 50
    iput v2, p0, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$3;->a:I

    .line 51
    .line 52
    invoke-static {p1, v1, v3, p0}, Landroidx/lifecycle/RepeatOnLifecycleKt;->repeatOnLifecycle(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$State;Lx7/p;Lm7/c;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    if-ne p1, v0, :cond_2

    .line 57
    .line 58
    return-object v0

    .line 59
    :cond_2
    :goto_0
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 60
    .line 61
    return-object p1
.end method
