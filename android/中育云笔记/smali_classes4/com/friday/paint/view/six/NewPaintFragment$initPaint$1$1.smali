.class final Lcom/friday/paint/view/six/NewPaintFragment$initPaint$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/paint/view/six/NewPaintFragment$initPaint$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.friday.paint.view.six.NewPaintFragment$initPaint$1$1"
    f = "NewPaintFragment.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public synthetic d:Ljava/lang/Object;

.field public final synthetic e:Lcom/friday/paint/view/six/NewPaintFragment;


# direct methods
.method public constructor <init>(Lcom/friday/paint/view/six/NewPaintFragment;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/paint/view/six/NewPaintFragment$initPaint$1$1;->e:Lcom/friday/paint/view/six/NewPaintFragment;

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
    new-instance v0, Lcom/friday/paint/view/six/NewPaintFragment$initPaint$1$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/friday/paint/view/six/NewPaintFragment$initPaint$1$1;->e:Lcom/friday/paint/view/six/NewPaintFragment;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Lcom/friday/paint/view/six/NewPaintFragment$initPaint$1$1;-><init>(Lcom/friday/paint/view/six/NewPaintFragment;Lvc/c;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Lcom/friday/paint/view/six/NewPaintFragment$initPaint$1$1;->d:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public final g(Ljava/util/List;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/friday/paint/view/six/NewPaintFragment$initPaint$1$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/friday/paint/view/six/NewPaintFragment$initPaint$1$1;

    .line 6
    .line 7
    sget-object p2, Lqc/q;->a:Lqc/q;

    .line 8
    .line 9
    invoke-virtual {p1, p2}, Lcom/friday/paint/view/six/NewPaintFragment$initPaint$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/friday/paint/view/six/NewPaintFragment$initPaint$1$1;->g(Ljava/util/List;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/friday/paint/view/six/NewPaintFragment$initPaint$1$1;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/List;

    .line 4
    .line 5
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    iget v1, p0, Lcom/friday/paint/view/six/NewPaintFragment$initPaint$1$1;->c:I

    .line 9
    .line 10
    if-nez v1, :cond_2

    .line 11
    .line 12
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    const/4 v1, 0x0

    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    iget-object p1, p0, Lcom/friday/paint/view/six/NewPaintFragment$initPaint$1$1;->e:Lcom/friday/paint/view/six/NewPaintFragment;

    .line 23
    .line 24
    const/4 v0, 0x2

    .line 25
    const/4 v2, 0x0

    .line 26
    invoke-static {p1, v1, v1, v0, v2}, Lcom/friday/paint/view/six/NewPaintFragment;->addNote$default(Lcom/friday/paint/view/six/NewPaintFragment;IZILjava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    iget-object p1, p0, Lcom/friday/paint/view/six/NewPaintFragment$initPaint$1$1;->e:Lcom/friday/paint/view/six/NewPaintFragment;

    .line 31
    .line 32
    invoke-virtual {p1}, Lcom/friday/paint/view/six/NewPaintFragment;->getRightNoteListAdapter()Lcom/friday/paint/view/six/NewThumbnailListAdapter;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    check-cast v0, Ljava/util/Collection;

    .line 37
    .line 38
    invoke-virtual {p1, v0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->setList(Ljava/util/Collection;)V

    .line 39
    .line 40
    .line 41
    iget-object p1, p0, Lcom/friday/paint/view/six/NewPaintFragment$initPaint$1$1;->e:Lcom/friday/paint/view/six/NewPaintFragment;

    .line 42
    .line 43
    invoke-static {p1}, Lcom/friday/paint/view/six/NewPaintFragment;->access$getViewModel(Lcom/friday/paint/view/six/NewPaintFragment;)Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    iget-object v0, p0, Lcom/friday/paint/view/six/NewPaintFragment$initPaint$1$1;->e:Lcom/friday/paint/view/six/NewPaintFragment;

    .line 48
    .line 49
    invoke-static {v0}, Lcom/friday/paint/view/six/NewPaintFragment;->access$getViewModel(Lcom/friday/paint/view/six/NewPaintFragment;)Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {v0}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->B()Landroidx/lifecycle/MutableLiveData;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    check-cast v0, Ljava/lang/Integer;

    .line 62
    .line 63
    if-eqz v0, :cond_1

    .line 64
    .line 65
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    :cond_1
    invoke-virtual {p1, v1}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->b0(I)V

    .line 70
    .line 71
    .line 72
    :goto_0
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 73
    .line 74
    return-object p1

    .line 75
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 76
    .line 77
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 78
    .line 79
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    throw p1
.end method
