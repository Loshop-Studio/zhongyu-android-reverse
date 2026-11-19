.class final Lcom/friday/document/viewmodel/TxtEditViewModel$findItem$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/viewmodel/TxtEditViewModel;->j(Ljava/lang/String;)V
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
    c = "com.friday.document.viewmodel.TxtEditViewModel$findItem$1"
    f = "TxtEditViewModel.kt"
    l = {
        0x3f
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:Ljava/lang/Object;

.field public d:I

.field public final synthetic e:Lcom/friday/document/viewmodel/TxtEditViewModel;

.field public final synthetic f:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/friday/document/viewmodel/TxtEditViewModel;Ljava/lang/String;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/viewmodel/TxtEditViewModel$findItem$1;->e:Lcom/friday/document/viewmodel/TxtEditViewModel;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/document/viewmodel/TxtEditViewModel$findItem$1;->f:Ljava/lang/String;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 2

    .line 1
    new-instance p1, Lcom/friday/document/viewmodel/TxtEditViewModel$findItem$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/document/viewmodel/TxtEditViewModel$findItem$1;->e:Lcom/friday/document/viewmodel/TxtEditViewModel;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/friday/document/viewmodel/TxtEditViewModel$findItem$1;->f:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/friday/document/viewmodel/TxtEditViewModel$findItem$1;-><init>(Lcom/friday/document/viewmodel/TxtEditViewModel;Ljava/lang/String;Lvc/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/friday/document/viewmodel/TxtEditViewModel$findItem$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/viewmodel/TxtEditViewModel$findItem$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/document/viewmodel/TxtEditViewModel$findItem$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/document/viewmodel/TxtEditViewModel$findItem$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v1, p0, Lcom/friday/document/viewmodel/TxtEditViewModel$findItem$1;->d:I

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
    iget-object v0, p0, Lcom/friday/document/viewmodel/TxtEditViewModel$findItem$1;->c:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Landroidx/lifecycle/MutableLiveData;

    .line 15
    .line 16
    :try_start_0
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    .line 18
    .line 19
    goto :goto_0

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

    .line 28
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    :try_start_1
    iget-object p1, p0, Lcom/friday/document/viewmodel/TxtEditViewModel$findItem$1;->e:Lcom/friday/document/viewmodel/TxtEditViewModel;

    .line 32
    .line 33
    invoke-virtual {p1}, Lcom/friday/document/viewmodel/TxtEditViewModel;->l()Landroidx/lifecycle/MutableLiveData;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iget-object v1, p0, Lcom/friday/document/viewmodel/TxtEditViewModel$findItem$1;->e:Lcom/friday/document/viewmodel/TxtEditViewModel;

    .line 38
    .line 39
    invoke-static {v1}, Lcom/friday/document/viewmodel/TxtEditViewModel;->g(Lcom/friday/document/viewmodel/TxtEditViewModel;)Lcom/friday/common/dao/FileDao;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    iget-object v3, p0, Lcom/friday/document/viewmodel/TxtEditViewModel$findItem$1;->f:Ljava/lang/String;

    .line 44
    .line 45
    iput-object p1, p0, Lcom/friday/document/viewmodel/TxtEditViewModel$findItem$1;->c:Ljava/lang/Object;

    .line 46
    .line 47
    iput v2, p0, Lcom/friday/document/viewmodel/TxtEditViewModel$findItem$1;->d:I

    .line 48
    .line 49
    invoke-interface {v1, v3, p0}, Lcom/friday/common/dao/FileDao;->r(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    if-ne v1, v0, :cond_2

    .line 54
    .line 55
    return-object v0

    .line 56
    :cond_2
    move-object v0, p1

    .line 57
    move-object p1, v1

    .line 58
    :goto_0
    invoke-virtual {v0, p1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 59
    .line 60
    .line 61
    goto :goto_1

    .line 62
    :catch_0
    iget-object p1, p0, Lcom/friday/document/viewmodel/TxtEditViewModel$findItem$1;->e:Lcom/friday/document/viewmodel/TxtEditViewModel;

    .line 63
    .line 64
    invoke-virtual {p1}, Lcom/friday/document/viewmodel/TxtEditViewModel;->l()Landroidx/lifecycle/MutableLiveData;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    const/4 v0, 0x0

    .line 69
    invoke-virtual {p1, v0}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    :goto_1
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 73
    .line 74
    return-object p1
.end method
