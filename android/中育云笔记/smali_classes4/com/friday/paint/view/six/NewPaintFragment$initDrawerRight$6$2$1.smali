.class final Lcom/friday/paint/view/six/NewPaintFragment$initDrawerRight$6$2$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/paint/view/six/NewPaintFragment;->initDrawerRight()V
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
    c = "com.friday.paint.view.six.NewPaintFragment$initDrawerRight$6$2$1"
    f = "NewPaintFragment.kt"
    l = {
        0x27d
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public final synthetic d:Lcom/friday/paint/view/six/NewPaintFragment;


# direct methods
.method public constructor <init>(Lcom/friday/paint/view/six/NewPaintFragment;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/paint/view/six/NewPaintFragment$initDrawerRight$6$2$1;->d:Lcom/friday/paint/view/six/NewPaintFragment;

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
    new-instance p1, Lcom/friday/paint/view/six/NewPaintFragment$initDrawerRight$6$2$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/paint/view/six/NewPaintFragment$initDrawerRight$6$2$1;->d:Lcom/friday/paint/view/six/NewPaintFragment;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lcom/friday/paint/view/six/NewPaintFragment$initDrawerRight$6$2$1;-><init>(Lcom/friday/paint/view/six/NewPaintFragment;Lvc/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/friday/paint/view/six/NewPaintFragment$initDrawerRight$6$2$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/paint/view/six/NewPaintFragment$initDrawerRight$6$2$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/paint/view/six/NewPaintFragment$initDrawerRight$6$2$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/paint/view/six/NewPaintFragment$initDrawerRight$6$2$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v1, p0, Lcom/friday/paint/view/six/NewPaintFragment$initDrawerRight$6$2$1;->c:I

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
    goto :goto_1

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
    iget-object p1, p0, Lcom/friday/paint/view/six/NewPaintFragment$initDrawerRight$6$2$1;->d:Lcom/friday/paint/view/six/NewPaintFragment;

    .line 28
    .line 29
    invoke-static {p1}, Lcom/friday/paint/view/six/NewPaintFragment;->access$getViewModel(Lcom/friday/paint/view/six/NewPaintFragment;)Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iget-object v1, p0, Lcom/friday/paint/view/six/NewPaintFragment$initDrawerRight$6$2$1;->d:Lcom/friday/paint/view/six/NewPaintFragment;

    .line 34
    .line 35
    invoke-virtual {v1}, Lcom/friday/paint/view/six/NewPaintFragment;->getRightNoteListAdapter()Lcom/friday/paint/view/six/NewThumbnailListAdapter;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v1}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getData()Ljava/util/List;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    check-cast v1, Ljava/lang/Iterable;

    .line 44
    .line 45
    new-instance v3, Ljava/util/ArrayList;

    .line 46
    .line 47
    const/16 v4, 0xa

    .line 48
    .line 49
    invoke-static {v1, v4}, Lrc/x;->x(Ljava/lang/Iterable;I)I

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 54
    .line 55
    .line 56
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 61
    .line 62
    .line 63
    move-result v4

    .line 64
    if-eqz v4, :cond_2

    .line 65
    .line 66
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    check-cast v4, Lcom/friday/paint/model/NoteListEntity;

    .line 71
    .line 72
    invoke-virtual {v4}, Lcom/friday/paint/model/NoteListEntity;->getNoteDir()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_2
    iput v2, p0, Lcom/friday/paint/view/six/NewPaintFragment$initDrawerRight$6$2$1;->c:I

    .line 81
    .line 82
    invoke-virtual {p1, v3, p0}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->d0(Ljava/util/List;Lvc/c;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    if-ne p1, v0, :cond_3

    .line 87
    .line 88
    return-object v0

    .line 89
    :cond_3
    :goto_1
    iget-object p1, p0, Lcom/friday/paint/view/six/NewPaintFragment$initDrawerRight$6$2$1;->d:Lcom/friday/paint/view/six/NewPaintFragment;

    .line 90
    .line 91
    invoke-static {p1}, Lcom/friday/paint/view/six/NewPaintFragment;->access$getViewModel(Lcom/friday/paint/view/six/NewPaintFragment;)Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    invoke-virtual {p1}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->t()V

    .line 96
    .line 97
    .line 98
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 99
    .line 100
    return-object p1
.end method
