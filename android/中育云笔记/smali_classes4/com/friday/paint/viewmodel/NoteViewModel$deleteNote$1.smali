.class final Lcom/friday/paint/viewmodel/NoteViewModel$deleteNote$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/paint/viewmodel/NoteViewModel;->q(ILjava/util/List;)V
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
    c = "com.friday.paint.viewmodel.NoteViewModel$deleteNote$1"
    f = "NoteViewModel.kt"
    l = {
        0x76
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public final synthetic d:I

.field public final synthetic e:Ljava/util/List;

.field public final synthetic f:Lcom/friday/paint/viewmodel/NoteViewModel;


# direct methods
.method public constructor <init>(ILjava/util/List;Lcom/friday/paint/viewmodel/NoteViewModel;Lvc/c;)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/friday/paint/viewmodel/NoteViewModel$deleteNote$1;->d:I

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/paint/viewmodel/NoteViewModel$deleteNote$1;->e:Ljava/util/List;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/friday/paint/viewmodel/NoteViewModel$deleteNote$1;->f:Lcom/friday/paint/viewmodel/NoteViewModel;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 3

    .line 1
    new-instance p1, Lcom/friday/paint/viewmodel/NoteViewModel$deleteNote$1;

    .line 2
    .line 3
    iget v0, p0, Lcom/friday/paint/viewmodel/NoteViewModel$deleteNote$1;->d:I

    .line 4
    .line 5
    iget-object v1, p0, Lcom/friday/paint/viewmodel/NoteViewModel$deleteNote$1;->e:Ljava/util/List;

    .line 6
    .line 7
    iget-object v2, p0, Lcom/friday/paint/viewmodel/NoteViewModel$deleteNote$1;->f:Lcom/friday/paint/viewmodel/NoteViewModel;

    .line 8
    .line 9
    invoke-direct {p1, v0, v1, v2, p2}, Lcom/friday/paint/viewmodel/NoteViewModel$deleteNote$1;-><init>(ILjava/util/List;Lcom/friday/paint/viewmodel/NoteViewModel;Lvc/c;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/friday/paint/viewmodel/NoteViewModel$deleteNote$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/paint/viewmodel/NoteViewModel$deleteNote$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/paint/viewmodel/NoteViewModel$deleteNote$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/paint/viewmodel/NoteViewModel$deleteNote$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v1, p0, Lcom/friday/paint/viewmodel/NoteViewModel$deleteNote$1;->c:I

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
    iget p1, p0, Lcom/friday/paint/viewmodel/NoteViewModel$deleteNote$1;->d:I

    .line 28
    .line 29
    if-ltz p1, :cond_3

    .line 30
    .line 31
    iget-object v1, p0, Lcom/friday/paint/viewmodel/NoteViewModel$deleteNote$1;->e:Ljava/util/List;

    .line 32
    .line 33
    check-cast v1, Ljava/util/Collection;

    .line 34
    .line 35
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-ge p1, v1, :cond_3

    .line 40
    .line 41
    iget-object p1, p0, Lcom/friday/paint/viewmodel/NoteViewModel$deleteNote$1;->f:Lcom/friday/paint/viewmodel/NoteViewModel;

    .line 42
    .line 43
    invoke-virtual {p1}, Lcom/friday/paint/viewmodel/NoteViewModel;->B()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    iget v3, p0, Lcom/friday/paint/viewmodel/NoteViewModel$deleteNote$1;->d:I

    .line 48
    .line 49
    iput v2, p0, Lcom/friday/paint/viewmodel/NoteViewModel$deleteNote$1;->c:I

    .line 50
    .line 51
    invoke-static {p1, v1, v3, p0}, Lcom/friday/paint/viewmodel/NoteViewModel;->e(Lcom/friday/paint/viewmodel/NoteViewModel;Ljava/lang/String;ILvc/c;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    if-ne p1, v0, :cond_2

    .line 56
    .line 57
    return-object v0

    .line 58
    :cond_2
    :goto_0
    iget-object p1, p0, Lcom/friday/paint/viewmodel/NoteViewModel$deleteNote$1;->f:Lcom/friday/paint/viewmodel/NoteViewModel;

    .line 59
    .line 60
    invoke-static {p1}, Lcom/friday/paint/viewmodel/NoteViewModel;->m(Lcom/friday/paint/viewmodel/NoteViewModel;)Landroidx/lifecycle/MutableLiveData;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    iget v0, p0, Lcom/friday/paint/viewmodel/NoteViewModel$deleteNote$1;->d:I

    .line 65
    .line 66
    invoke-static {v0}, Lxc/a;->c(I)Ljava/lang/Integer;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-virtual {p1, v0}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 74
    .line 75
    return-object p1

    .line 76
    :cond_3
    iget-object p1, p0, Lcom/friday/paint/viewmodel/NoteViewModel$deleteNote$1;->f:Lcom/friday/paint/viewmodel/NoteViewModel;

    .line 77
    .line 78
    invoke-static {p1}, Lcom/friday/paint/viewmodel/NoteViewModel;->m(Lcom/friday/paint/viewmodel/NoteViewModel;)Landroidx/lifecycle/MutableLiveData;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    const/4 v0, -0x1

    .line 83
    invoke-static {v0}, Lxc/a;->c(I)Ljava/lang/Integer;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-virtual {p1, v0}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 91
    .line 92
    return-object p1
.end method
