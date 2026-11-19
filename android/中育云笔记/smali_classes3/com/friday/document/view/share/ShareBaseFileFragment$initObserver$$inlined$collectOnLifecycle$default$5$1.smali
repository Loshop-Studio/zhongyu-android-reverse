.class public final Lcom/friday/document/view/share/ShareBaseFileFragment$initObserver$$inlined$collectOnLifecycle$default$5$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/view/share/ShareBaseFileFragment$initObserver$$inlined$collectOnLifecycle$default$5;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.friday.document.view.share.ShareBaseFileFragment$initObserver$$inlined$collectOnLifecycle$default$5$1"
    f = "ShareBaseFileFragment.kt"
    l = {
        0x11
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public final synthetic d:Lvd/c;

.field public final synthetic e:Lcom/friday/document/view/share/ShareBaseFileFragment;


# direct methods
.method public constructor <init>(Lvd/c;Lvc/c;Lcom/friday/document/view/share/ShareBaseFileFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/view/share/ShareBaseFileFragment$initObserver$$inlined$collectOnLifecycle$default$5$1;->d:Lvd/c;

    .line 2
    .line 3
    iput-object p3, p0, Lcom/friday/document/view/share/ShareBaseFileFragment$initObserver$$inlined$collectOnLifecycle$default$5$1;->e:Lcom/friday/document/view/share/ShareBaseFileFragment;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 2

    .line 1
    new-instance p1, Lcom/friday/document/view/share/ShareBaseFileFragment$initObserver$$inlined$collectOnLifecycle$default$5$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/document/view/share/ShareBaseFileFragment$initObserver$$inlined$collectOnLifecycle$default$5$1;->d:Lvd/c;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/friday/document/view/share/ShareBaseFileFragment$initObserver$$inlined$collectOnLifecycle$default$5$1;->e:Lcom/friday/document/view/share/ShareBaseFileFragment;

    .line 6
    .line 7
    invoke-direct {p1, v0, p2, v1}, Lcom/friday/document/view/share/ShareBaseFileFragment$initObserver$$inlined$collectOnLifecycle$default$5$1;-><init>(Lvd/c;Lvc/c;Lcom/friday/document/view/share/ShareBaseFileFragment;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/friday/document/view/share/ShareBaseFileFragment$initObserver$$inlined$collectOnLifecycle$default$5$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/view/share/ShareBaseFileFragment$initObserver$$inlined$collectOnLifecycle$default$5$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/document/view/share/ShareBaseFileFragment$initObserver$$inlined$collectOnLifecycle$default$5$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/document/view/share/ShareBaseFileFragment$initObserver$$inlined$collectOnLifecycle$default$5$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/friday/document/view/share/ShareBaseFileFragment$initObserver$$inlined$collectOnLifecycle$default$5$1;->c:I

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
    iget-object p1, p0, Lcom/friday/document/view/share/ShareBaseFileFragment$initObserver$$inlined$collectOnLifecycle$default$5$1;->d:Lvd/c;

    .line 28
    .line 29
    new-instance v1, Lcom/friday/document/view/share/ShareBaseFileFragment$initObserver$$inlined$collectOnLifecycle$default$5$1$a;

    .line 30
    .line 31
    iget-object v3, p0, Lcom/friday/document/view/share/ShareBaseFileFragment$initObserver$$inlined$collectOnLifecycle$default$5$1;->e:Lcom/friday/document/view/share/ShareBaseFileFragment;

    .line 32
    .line 33
    invoke-direct {v1, v3}, Lcom/friday/document/view/share/ShareBaseFileFragment$initObserver$$inlined$collectOnLifecycle$default$5$1$a;-><init>(Lcom/friday/document/view/share/ShareBaseFileFragment;)V

    .line 34
    .line 35
    .line 36
    iput v2, p0, Lcom/friday/document/view/share/ShareBaseFileFragment$initObserver$$inlined$collectOnLifecycle$default$5$1;->c:I

    .line 37
    .line 38
    invoke-interface {p1, v1, p0}, Lvd/c;->collect(Lvd/d;Lvc/c;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    if-ne p1, v0, :cond_2

    .line 43
    .line 44
    return-object v0

    .line 45
    :cond_2
    :goto_0
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 46
    .line 47
    return-object p1
.end method
