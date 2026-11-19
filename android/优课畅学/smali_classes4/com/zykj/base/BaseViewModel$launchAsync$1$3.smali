.class final Lcom/zykj/base/BaseViewModel$launchAsync$1$3;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/base/BaseViewModel$launchAsync$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.zykj.base.BaseViewModel$launchAsync$1$3"
    f = "BaseViewModel.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/zykj/base/BaseViewModel;

.field public final synthetic c:Ljava/lang/Throwable;

.field public final synthetic d:Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;


# direct methods
.method public constructor <init>(Lcom/zykj/base/BaseViewModel;Ljava/lang/Throwable;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/base/BaseViewModel$launchAsync$1$3;->b:Lcom/zykj/base/BaseViewModel;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/base/BaseViewModel$launchAsync$1$3;->c:Ljava/lang/Throwable;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/zykj/base/BaseViewModel$launchAsync$1$3;->d:Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

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
    new-instance p1, Lcom/zykj/base/BaseViewModel$launchAsync$1$3;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/base/BaseViewModel$launchAsync$1$3;->b:Lcom/zykj/base/BaseViewModel;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/zykj/base/BaseViewModel$launchAsync$1$3;->c:Ljava/lang/Throwable;

    .line 6
    .line 7
    iget-object v2, p0, Lcom/zykj/base/BaseViewModel$launchAsync$1$3;->d:Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 8
    .line 9
    invoke-direct {p1, v0, v1, v2, p2}, Lcom/zykj/base/BaseViewModel$launchAsync$1$3;-><init>(Lcom/zykj/base/BaseViewModel;Ljava/lang/Throwable;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lm7/c;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method public final invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/base/BaseViewModel$launchAsync$1$3;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/base/BaseViewModel$launchAsync$1$3;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/zykj/base/BaseViewModel$launchAsync$1$3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Li8/b0;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/base/BaseViewModel$launchAsync$1$3;->invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/zykj/base/BaseViewModel$launchAsync$1$3;->a:I

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/zykj/base/BaseViewModel$launchAsync$1$3;->b:Lcom/zykj/base/BaseViewModel;

    .line 12
    .line 13
    iget-object v0, p0, Lcom/zykj/base/BaseViewModel$launchAsync$1$3;->c:Ljava/lang/Throwable;

    .line 14
    .line 15
    iget-object v1, p0, Lcom/zykj/base/BaseViewModel$launchAsync$1$3;->d:Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 16
    .line 17
    invoke-virtual {p1, v0, v1}, Lcom/zykj/base/BaseViewModel;->handlerThrowable(Ljava/lang/Throwable;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;)V

    .line 18
    .line 19
    .line 20
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 21
    .line 22
    return-object p1

    .line 23
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 24
    .line 25
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 26
    .line 27
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw p1
.end method
