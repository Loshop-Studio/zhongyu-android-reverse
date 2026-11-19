.class final Lcom/friday/main/viewmodel/DbViewModel$fetchImageDb$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/main/viewmodel/DbViewModel;->n()V
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
    c = "com.friday.main.viewmodel.DbViewModel$fetchImageDb$1"
    f = "DbViewModel.kt"
    l = {
        0x4c
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public final synthetic d:Lcom/friday/main/viewmodel/DbViewModel;


# direct methods
.method public constructor <init>(Lcom/friday/main/viewmodel/DbViewModel;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/main/viewmodel/DbViewModel$fetchImageDb$1;->d:Lcom/friday/main/viewmodel/DbViewModel;

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
    new-instance p1, Lcom/friday/main/viewmodel/DbViewModel$fetchImageDb$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/main/viewmodel/DbViewModel$fetchImageDb$1;->d:Lcom/friday/main/viewmodel/DbViewModel;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lcom/friday/main/viewmodel/DbViewModel$fetchImageDb$1;-><init>(Lcom/friday/main/viewmodel/DbViewModel;Lvc/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/friday/main/viewmodel/DbViewModel$fetchImageDb$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/main/viewmodel/DbViewModel$fetchImageDb$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/main/viewmodel/DbViewModel$fetchImageDb$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/main/viewmodel/DbViewModel$fetchImageDb$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/friday/main/viewmodel/DbViewModel$fetchImageDb$1;->c:I

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
    iget-object p1, p0, Lcom/friday/main/viewmodel/DbViewModel$fetchImageDb$1;->d:Lcom/friday/main/viewmodel/DbViewModel;

    .line 28
    .line 29
    invoke-static {p1}, Lcom/friday/main/viewmodel/DbViewModel;->f(Lcom/friday/main/viewmodel/DbViewModel;)Lc2/v0;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iput v2, p0, Lcom/friday/main/viewmodel/DbViewModel$fetchImageDb$1;->c:I

    .line 34
    .line 35
    invoke-interface {p1, p0}, Lc2/v0;->b(Lvc/c;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    if-ne p1, v0, :cond_2

    .line 40
    .line 41
    return-object v0

    .line 42
    :cond_2
    :goto_0
    check-cast p1, Ljava/util/List;

    .line 43
    .line 44
    iget-object v0, p0, Lcom/friday/main/viewmodel/DbViewModel$fetchImageDb$1;->d:Lcom/friday/main/viewmodel/DbViewModel;

    .line 45
    .line 46
    invoke-static {v0}, Lcom/friday/main/viewmodel/DbViewModel;->j(Lcom/friday/main/viewmodel/DbViewModel;)Lvd/l;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    :cond_3
    invoke-interface {v0}, Lvd/l;->getValue()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    move-object v2, v1

    .line 55
    check-cast v2, Ljava/util/List;

    .line 56
    .line 57
    invoke-interface {v0, v1, p1}, Lvd/l;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-eqz v1, :cond_3

    .line 62
    .line 63
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 64
    .line 65
    return-object p1
.end method
