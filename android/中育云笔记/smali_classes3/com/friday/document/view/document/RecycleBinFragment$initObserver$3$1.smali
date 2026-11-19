.class final Lcom/friday/document/view/document/RecycleBinFragment$initObserver$3$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/view/document/RecycleBinFragment$initObserver$3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.friday.document.view.document.RecycleBinFragment$initObserver$3$1"
    f = "RecycleBinFragment.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public synthetic d:Z

.field public final synthetic e:Lcom/friday/document/view/document/RecycleBinFragment;


# direct methods
.method public constructor <init>(Lcom/friday/document/view/document/RecycleBinFragment;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/view/document/RecycleBinFragment$initObserver$3$1;->e:Lcom/friday/document/view/document/RecycleBinFragment;

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
    .locals 2

    .line 1
    new-instance v0, Lcom/friday/document/view/document/RecycleBinFragment$initObserver$3$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/friday/document/view/document/RecycleBinFragment$initObserver$3$1;->e:Lcom/friday/document/view/document/RecycleBinFragment;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Lcom/friday/document/view/document/RecycleBinFragment$initObserver$3$1;-><init>(Lcom/friday/document/view/document/RecycleBinFragment;Lvc/c;)V

    .line 6
    .line 7
    .line 8
    check-cast p1, Ljava/lang/Boolean;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    iput-boolean p1, v0, Lcom/friday/document/view/document/RecycleBinFragment$initObserver$3$1;->d:Z

    .line 15
    .line 16
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/friday/document/view/document/RecycleBinFragment$initObserver$3$1;->invoke(ZLvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(ZLvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lcom/friday/document/view/document/RecycleBinFragment$initObserver$3$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/document/view/document/RecycleBinFragment$initObserver$3$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/document/view/document/RecycleBinFragment$initObserver$3$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/friday/document/view/document/RecycleBinFragment$initObserver$3$1;->d:Z

    .line 2
    .line 3
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iget v1, p0, Lcom/friday/document/view/document/RecycleBinFragment$initObserver$3$1;->c:I

    .line 7
    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, Lcom/friday/document/view/document/RecycleBinFragment$initObserver$3$1;->e:Lcom/friday/document/view/document/RecycleBinFragment;

    .line 14
    .line 15
    invoke-virtual {p1, v0}, Lcom/friday/common/base/BaseFragment;->isShowLoading(Z)V

    .line 16
    .line 17
    .line 18
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 19
    .line 20
    return-object p1

    .line 21
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 22
    .line 23
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 24
    .line 25
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw p1
.end method
