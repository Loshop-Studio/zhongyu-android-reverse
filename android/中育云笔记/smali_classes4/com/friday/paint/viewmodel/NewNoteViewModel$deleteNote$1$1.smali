.class final Lcom/friday/paint/viewmodel/NewNoteViewModel$deleteNote$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/paint/viewmodel/NewNoteViewModel$deleteNote$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lhd/l;"
    }
.end annotation

.annotation runtime Lxc/d;
    c = "com.friday.paint.viewmodel.NewNoteViewModel$deleteNote$1$1"
    f = "NewNoteViewModel.kt"
    l = {
        0x62
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public final synthetic d:Lcom/friday/paint/viewmodel/NewNoteViewModel;

.field public final synthetic e:Ljava/util/List;

.field public final synthetic f:I


# direct methods
.method public constructor <init>(Lcom/friday/paint/viewmodel/NewNoteViewModel;Ljava/util/List;ILvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel$deleteNote$1$1;->d:Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel$deleteNote$1$1;->e:Ljava/util/List;

    .line 4
    .line 5
    iput p3, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel$deleteNote$1$1;->f:I

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Lvc/c;)Lvc/c;
    .locals 4

    .line 1
    new-instance v0, Lcom/friday/paint/viewmodel/NewNoteViewModel$deleteNote$1$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel$deleteNote$1$1;->d:Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel$deleteNote$1$1;->e:Ljava/util/List;

    .line 6
    .line 7
    iget v3, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel$deleteNote$1$1;->f:I

    .line 8
    .line 9
    invoke-direct {v0, v1, v2, v3, p1}, Lcom/friday/paint/viewmodel/NewNoteViewModel$deleteNote$1$1;-><init>(Lcom/friday/paint/viewmodel/NewNoteViewModel;Ljava/util/List;ILvc/c;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lvc/c;

    invoke-virtual {p0, p1}, Lcom/friday/paint/viewmodel/NewNoteViewModel$deleteNote$1$1;->invoke(Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lvc/c;)Ljava/lang/Object;
    .locals 1

    .line 2
    invoke-virtual {p0, p1}, Lcom/friday/paint/viewmodel/NewNoteViewModel$deleteNote$1$1;->create(Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/paint/viewmodel/NewNoteViewModel$deleteNote$1$1;

    sget-object v0, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, v0}, Lcom/friday/paint/viewmodel/NewNoteViewModel$deleteNote$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel$deleteNote$1$1;->c:I

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
    new-instance v1, Lcom/friday/paint/viewmodel/NewNoteViewModel$deleteNote$1$1$1;

    .line 32
    .line 33
    iget-object v3, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel$deleteNote$1$1;->d:Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 34
    .line 35
    iget-object v4, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel$deleteNote$1$1;->e:Ljava/util/List;

    .line 36
    .line 37
    iget v5, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel$deleteNote$1$1;->f:I

    .line 38
    .line 39
    const/4 v6, 0x0

    .line 40
    invoke-direct {v1, v3, v4, v5, v6}, Lcom/friday/paint/viewmodel/NewNoteViewModel$deleteNote$1$1$1;-><init>(Lcom/friday/paint/viewmodel/NewNoteViewModel;Ljava/util/List;ILvc/c;)V

    .line 41
    .line 42
    .line 43
    iput v2, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel$deleteNote$1$1;->c:I

    .line 44
    .line 45
    invoke-static {p1, v1, p0}, Lsd/f;->g(Lkotlin/coroutines/d;Lhd/p;Lvc/c;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    if-ne p1, v0, :cond_2

    .line 50
    .line 51
    return-object v0

    .line 52
    :cond_2
    :goto_0
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 53
    .line 54
    return-object p1
.end method
