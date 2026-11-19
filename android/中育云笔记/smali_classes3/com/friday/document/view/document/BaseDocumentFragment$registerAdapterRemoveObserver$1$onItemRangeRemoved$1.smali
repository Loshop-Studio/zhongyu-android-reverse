.class final Lcom/friday/document/view/document/BaseDocumentFragment$registerAdapterRemoveObserver$1$onItemRangeRemoved$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/view/document/BaseDocumentFragment$registerAdapterRemoveObserver$1;->onItemRangeRemoved(II)V
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
    c = "com.friday.document.view.document.BaseDocumentFragment$registerAdapterRemoveObserver$1$onItemRangeRemoved$1"
    f = "BaseDocumentFragment.kt"
    l = {
        0x2c
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public final synthetic d:Lcom/friday/document/view/document/BaseDocumentFragment;


# direct methods
.method public constructor <init>(Lcom/friday/document/view/document/BaseDocumentFragment;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/view/document/BaseDocumentFragment$registerAdapterRemoveObserver$1$onItemRangeRemoved$1;->d:Lcom/friday/document/view/document/BaseDocumentFragment;

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
    new-instance p1, Lcom/friday/document/view/document/BaseDocumentFragment$registerAdapterRemoveObserver$1$onItemRangeRemoved$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/document/view/document/BaseDocumentFragment$registerAdapterRemoveObserver$1$onItemRangeRemoved$1;->d:Lcom/friday/document/view/document/BaseDocumentFragment;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lcom/friday/document/view/document/BaseDocumentFragment$registerAdapterRemoveObserver$1$onItemRangeRemoved$1;-><init>(Lcom/friday/document/view/document/BaseDocumentFragment;Lvc/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/friday/document/view/document/BaseDocumentFragment$registerAdapterRemoveObserver$1$onItemRangeRemoved$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/view/document/BaseDocumentFragment$registerAdapterRemoveObserver$1$onItemRangeRemoved$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/document/view/document/BaseDocumentFragment$registerAdapterRemoveObserver$1$onItemRangeRemoved$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/document/view/document/BaseDocumentFragment$registerAdapterRemoveObserver$1$onItemRangeRemoved$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/friday/document/view/document/BaseDocumentFragment$registerAdapterRemoveObserver$1$onItemRangeRemoved$1;->c:I

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
    invoke-static {}, Lsd/r0;->b()Lsd/e0;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    new-instance v1, Lcom/friday/document/view/document/BaseDocumentFragment$registerAdapterRemoveObserver$1$onItemRangeRemoved$1$find$1;

    .line 32
    .line 33
    iget-object v3, p0, Lcom/friday/document/view/document/BaseDocumentFragment$registerAdapterRemoveObserver$1$onItemRangeRemoved$1;->d:Lcom/friday/document/view/document/BaseDocumentFragment;

    .line 34
    .line 35
    const/4 v4, 0x0

    .line 36
    invoke-direct {v1, v3, v4}, Lcom/friday/document/view/document/BaseDocumentFragment$registerAdapterRemoveObserver$1$onItemRangeRemoved$1$find$1;-><init>(Lcom/friday/document/view/document/BaseDocumentFragment;Lvc/c;)V

    .line 37
    .line 38
    .line 39
    iput v2, p0, Lcom/friday/document/view/document/BaseDocumentFragment$registerAdapterRemoveObserver$1$onItemRangeRemoved$1;->c:I

    .line 40
    .line 41
    invoke-static {p1, v1, p0}, Lsd/f;->g(Lkotlin/coroutines/d;Lhd/p;Lvc/c;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    if-ne p1, v0, :cond_2

    .line 46
    .line 47
    return-object v0

    .line 48
    :cond_2
    :goto_0
    check-cast p1, Lcom/friday/document/adapter/MultiModeFileEntity;

    .line 49
    .line 50
    if-nez p1, :cond_3

    .line 51
    .line 52
    iget-object p1, p0, Lcom/friday/document/view/document/BaseDocumentFragment$registerAdapterRemoveObserver$1$onItemRangeRemoved$1;->d:Lcom/friday/document/view/document/BaseDocumentFragment;

    .line 53
    .line 54
    invoke-virtual {p1}, Lcom/friday/document/view/document/BaseDocumentFragment;->y()V

    .line 55
    .line 56
    .line 57
    :cond_3
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 58
    .line 59
    return-object p1
.end method
