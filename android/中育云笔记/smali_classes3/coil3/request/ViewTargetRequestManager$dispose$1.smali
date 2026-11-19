.class final Lcoil3/request/ViewTargetRequestManager$dispose$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcoil3/request/ViewTargetRequestManager;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lhd/p;"
    }
.end annotation

.annotation runtime Lxc/d;
    c = "coil3.request.ViewTargetRequestManager$dispose$1"
    f = "ViewTargetRequestManager.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public final synthetic d:Lcoil3/request/ViewTargetRequestManager;


# direct methods
.method public constructor <init>(Lcoil3/request/ViewTargetRequestManager;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcoil3/request/ViewTargetRequestManager$dispose$1;->d:Lcoil3/request/ViewTargetRequestManager;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 1

    .line 1
    new-instance p1, Lcoil3/request/ViewTargetRequestManager$dispose$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcoil3/request/ViewTargetRequestManager$dispose$1;->d:Lcoil3/request/ViewTargetRequestManager;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lcoil3/request/ViewTargetRequestManager$dispose$1;-><init>(Lcoil3/request/ViewTargetRequestManager;Lvc/c;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcoil3/request/ViewTargetRequestManager$dispose$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcoil3/request/ViewTargetRequestManager$dispose$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcoil3/request/ViewTargetRequestManager$dispose$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcoil3/request/ViewTargetRequestManager$dispose$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcoil3/request/ViewTargetRequestManager$dispose$1;->c:I

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcoil3/request/ViewTargetRequestManager$dispose$1;->d:Lcoil3/request/ViewTargetRequestManager;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    invoke-virtual {p1, v0}, Lcoil3/request/ViewTargetRequestManager;->c(Lcoil3/request/ViewTargetRequestDelegate;)V

    .line 15
    .line 16
    .line 17
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 18
    .line 19
    return-object p1

    .line 20
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 21
    .line 22
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 23
    .line 24
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw p1
.end method
