.class final Lcom/friday/paint/view/ThePaintFragment$initObserver$6$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/paint/view/ThePaintFragment$initObserver$6;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.friday.paint.view.ThePaintFragment$initObserver$6$1"
    f = "ThePaintFragment.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public synthetic d:Ljava/lang/Object;

.field public final synthetic e:Lcom/friday/paint/view/ThePaintFragment;


# direct methods
.method public constructor <init>(Lcom/friday/paint/view/ThePaintFragment;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/paint/view/ThePaintFragment$initObserver$6$1;->e:Lcom/friday/paint/view/ThePaintFragment;

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
    new-instance v0, Lcom/friday/paint/view/ThePaintFragment$initObserver$6$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/friday/paint/view/ThePaintFragment$initObserver$6$1;->e:Lcom/friday/paint/view/ThePaintFragment;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Lcom/friday/paint/view/ThePaintFragment$initObserver$6$1;-><init>(Lcom/friday/paint/view/ThePaintFragment;Lvc/c;)V

    .line 6
    .line 7
    .line 8
    check-cast p1, Lkotlin/Result;

    .line 9
    .line 10
    invoke-virtual {p1}, Lkotlin/Result;->n()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iput-object p1, v0, Lcom/friday/paint/view/ThePaintFragment$initObserver$6$1;->d:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlin/Result;

    invoke-virtual {p1}, Lkotlin/Result;->n()Ljava/lang/Object;

    move-result-object p1

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/friday/paint/view/ThePaintFragment$initObserver$6$1;->invoke(Ljava/lang/Object;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-static {p1}, Lkotlin/Result;->a(Ljava/lang/Object;)Lkotlin/Result;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lcom/friday/paint/view/ThePaintFragment$initObserver$6$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/paint/view/ThePaintFragment$initObserver$6$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/paint/view/ThePaintFragment$initObserver$6$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-object v0, p0, Lcom/friday/paint/view/ThePaintFragment$initObserver$6$1;->d:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iget v1, p0, Lcom/friday/paint/view/ThePaintFragment$initObserver$6$1;->c:I

    .line 7
    .line 8
    if-nez v1, :cond_3

    .line 9
    .line 10
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Lkotlin/Result;->k(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eqz p1, :cond_1

    .line 18
    .line 19
    sget-object v1, Lcom/friday/common/helper/c;->a:Lcom/friday/common/helper/c;

    .line 20
    .line 21
    iget-object p1, p0, Lcom/friday/paint/view/ThePaintFragment$initObserver$6$1;->e:Lcom/friday/paint/view/ThePaintFragment;

    .line 22
    .line 23
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    const-string p1, "requireActivity(...)"

    .line 28
    .line 29
    invoke-static {v2, p1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    iget-object p1, p0, Lcom/friday/paint/view/ThePaintFragment$initObserver$6$1;->e:Lcom/friday/paint/view/ThePaintFragment;

    .line 33
    .line 34
    invoke-static {p1}, Lcom/friday/paint/view/ThePaintFragment;->f0(Lcom/friday/paint/view/ThePaintFragment;)Lcom/friday/paint/viewmodel/NoteViewModel;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {p1}, Lcom/friday/paint/viewmodel/NoteViewModel;->G()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    iget-object p1, p0, Lcom/friday/paint/view/ThePaintFragment$initObserver$6$1;->e:Lcom/friday/paint/view/ThePaintFragment;

    .line 43
    .line 44
    invoke-static {p1}, Lcom/friday/paint/view/ThePaintFragment;->f0(Lcom/friday/paint/view/ThePaintFragment;)Lcom/friday/paint/viewmodel/NoteViewModel;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-virtual {p1}, Lcom/friday/paint/viewmodel/NoteViewModel;->B()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    new-instance v6, Ljava/util/ArrayList;

    .line 53
    .line 54
    invoke-static {}, Lrc/w;->n()Ljava/util/List;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-static {v0}, Lkotlin/Result;->g(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v5

    .line 62
    if-eqz v5, :cond_0

    .line 63
    .line 64
    move-object v0, p1

    .line 65
    :cond_0
    check-cast v0, Ljava/util/Collection;

    .line 66
    .line 67
    invoke-direct {v6, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 68
    .line 69
    .line 70
    const/16 v10, 0xc0

    .line 71
    .line 72
    const/4 v11, 0x0

    .line 73
    const/4 v5, 0x1

    .line 74
    const/4 v7, 0x0

    .line 75
    const/4 v8, 0x0

    .line 76
    const/4 v9, 0x0

    .line 77
    invoke-static/range {v1 .. v11}, Lcom/friday/common/helper/c;->b(Lcom/friday/common/helper/c;Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZLjava/util/ArrayList;ZZLjava/util/ArrayList;ILjava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_1
    invoke-static {v0}, Lkotlin/Result;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    if-eqz p1, :cond_2

    .line 86
    .line 87
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    if-eqz p1, :cond_2

    .line 92
    .line 93
    invoke-static {p1}, Lz1/b;->i(Ljava/lang/CharSequence;)V

    .line 94
    .line 95
    .line 96
    :cond_2
    :goto_0
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 97
    .line 98
    return-object p1

    .line 99
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 100
    .line 101
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 102
    .line 103
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    throw p1
.end method
