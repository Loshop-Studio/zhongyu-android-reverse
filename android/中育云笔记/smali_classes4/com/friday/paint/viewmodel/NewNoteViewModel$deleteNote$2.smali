.class final Lcom/friday/paint/viewmodel/NewNoteViewModel$deleteNote$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/paint/viewmodel/NewNoteViewModel;->v(ILjava/util/List;)V
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
    c = "com.friday.paint.viewmodel.NewNoteViewModel$deleteNote$2"
    f = "NewNoteViewModel.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public synthetic d:Ljava/lang/Object;

.field public final synthetic e:Lcom/friday/paint/viewmodel/NewNoteViewModel;


# direct methods
.method public constructor <init>(Lcom/friday/paint/viewmodel/NewNoteViewModel;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel$deleteNote$2;->e:Lcom/friday/paint/viewmodel/NewNoteViewModel;

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
    new-instance v0, Lcom/friday/paint/viewmodel/NewNoteViewModel$deleteNote$2;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel$deleteNote$2;->e:Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Lcom/friday/paint/viewmodel/NewNoteViewModel$deleteNote$2;-><init>(Lcom/friday/paint/viewmodel/NewNoteViewModel;Lvc/c;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Lcom/friday/paint/viewmodel/NewNoteViewModel$deleteNote$2;->d:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public final g(Ljava/lang/Throwable;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/friday/paint/viewmodel/NewNoteViewModel$deleteNote$2;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/friday/paint/viewmodel/NewNoteViewModel$deleteNote$2;

    .line 6
    .line 7
    sget-object p2, Lqc/q;->a:Lqc/q;

    .line 8
    .line 9
    invoke-virtual {p1, p2}, Lcom/friday/paint/viewmodel/NewNoteViewModel$deleteNote$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/friday/paint/viewmodel/NewNoteViewModel$deleteNote$2;->g(Ljava/lang/Throwable;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel$deleteNote$2;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/Throwable;

    .line 4
    .line 5
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    iget v1, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel$deleteNote$2;->c:I

    .line 9
    .line 10
    if-nez v1, :cond_1

    .line 11
    .line 12
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    instance-of p1, v0, Ljava/util/concurrent/CancellationException;

    .line 16
    .line 17
    if-nez p1, :cond_0

    .line 18
    .line 19
    iget-object p1, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel$deleteNote$2;->e:Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 20
    .line 21
    invoke-static {p1}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->o(Lcom/friday/paint/viewmodel/NewNoteViewModel;)Landroidx/lifecycle/MutableLiveData;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    const/4 v0, -0x1

    .line 26
    invoke-static {v0}, Lxc/a;->c(I)Ljava/lang/Integer;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {p1, v0}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 34
    .line 35
    return-object p1

    .line 36
    :cond_0
    throw v0

    .line 37
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 38
    .line 39
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 40
    .line 41
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    throw p1
.end method
