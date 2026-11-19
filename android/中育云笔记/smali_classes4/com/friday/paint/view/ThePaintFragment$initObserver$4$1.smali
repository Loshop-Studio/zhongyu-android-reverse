.class final Lcom/friday/paint/view/ThePaintFragment$initObserver$4$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/paint/view/ThePaintFragment;->initObserver()V
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
    c = "com.friday.paint.view.ThePaintFragment$initObserver$4$1"
    f = "ThePaintFragment.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public final synthetic d:Lcom/friday/paint/view/ThePaintFragment;

.field public final synthetic e:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Lcom/friday/paint/view/ThePaintFragment;Ljava/lang/Integer;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/paint/view/ThePaintFragment$initObserver$4$1;->d:Lcom/friday/paint/view/ThePaintFragment;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/paint/view/ThePaintFragment$initObserver$4$1;->e:Ljava/lang/Integer;

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
    new-instance p1, Lcom/friday/paint/view/ThePaintFragment$initObserver$4$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/paint/view/ThePaintFragment$initObserver$4$1;->d:Lcom/friday/paint/view/ThePaintFragment;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/friday/paint/view/ThePaintFragment$initObserver$4$1;->e:Ljava/lang/Integer;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/friday/paint/view/ThePaintFragment$initObserver$4$1;-><init>(Lcom/friday/paint/view/ThePaintFragment;Ljava/lang/Integer;Lvc/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/friday/paint/view/ThePaintFragment$initObserver$4$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/paint/view/ThePaintFragment$initObserver$4$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/paint/view/ThePaintFragment$initObserver$4$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/paint/view/ThePaintFragment$initObserver$4$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/friday/paint/view/ThePaintFragment$initObserver$4$1;->c:I

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/friday/paint/view/ThePaintFragment$initObserver$4$1;->d:Lcom/friday/paint/view/ThePaintFragment;

    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/friday/paint/view/ThePaintFragment;->t0()Lcom/friday/paint/adapter/NoteFragmentStateAdapter;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p1}, Lcom/friday/paint/adapter/NoteFragmentStateAdapter;->getItemCount()I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    iget-object v0, p0, Lcom/friday/paint/view/ThePaintFragment$initObserver$4$1;->e:Ljava/lang/Integer;

    .line 22
    .line 23
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-ltz v0, :cond_0

    .line 31
    .line 32
    if-ge v0, p1, :cond_0

    .line 33
    .line 34
    iget-object p1, p0, Lcom/friday/paint/view/ThePaintFragment$initObserver$4$1;->d:Lcom/friday/paint/view/ThePaintFragment;

    .line 35
    .line 36
    invoke-static {p1}, Lcom/friday/paint/view/ThePaintFragment;->e0(Lcom/friday/paint/view/ThePaintFragment;)Lcom/friday/paint/databinding/FragmentThePaintBinding;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    iget-object p1, p1, Lcom/friday/paint/databinding/FragmentThePaintBinding;->I:Landroidx/viewpager2/widget/ViewPager2;

    .line 41
    .line 42
    iget-object v0, p0, Lcom/friday/paint/view/ThePaintFragment$initObserver$4$1;->e:Ljava/lang/Integer;

    .line 43
    .line 44
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    const/4 v1, 0x0

    .line 52
    invoke-virtual {p1, v0, v1}, Landroidx/viewpager2/widget/ViewPager2;->setCurrentItem(IZ)V

    .line 53
    .line 54
    .line 55
    iget-object p1, p0, Lcom/friday/paint/view/ThePaintFragment$initObserver$4$1;->d:Lcom/friday/paint/view/ThePaintFragment;

    .line 56
    .line 57
    invoke-virtual {p1}, Lcom/friday/paint/view/ThePaintFragment;->t0()Lcom/friday/paint/adapter/NoteFragmentStateAdapter;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    .line 62
    .line 63
    .line 64
    iget-object p1, p0, Lcom/friday/paint/view/ThePaintFragment$initObserver$4$1;->d:Lcom/friday/paint/view/ThePaintFragment;

    .line 65
    .line 66
    invoke-virtual {p1}, Lcom/friday/paint/view/ThePaintFragment;->u0()Lcom/friday/paint/adapter/ThumbnailListAdapter;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    iget-object v0, p0, Lcom/friday/paint/view/ThePaintFragment$initObserver$4$1;->e:Ljava/lang/Integer;

    .line 71
    .line 72
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    invoke-virtual {p1, v0}, Lcom/friday/paint/adapter/ThumbnailListAdapter;->updateSelectedItem(I)V

    .line 80
    .line 81
    .line 82
    iget-object p1, p0, Lcom/friday/paint/view/ThePaintFragment$initObserver$4$1;->d:Lcom/friday/paint/view/ThePaintFragment;

    .line 83
    .line 84
    iget-object v0, p0, Lcom/friday/paint/view/ThePaintFragment$initObserver$4$1;->e:Ljava/lang/Integer;

    .line 85
    .line 86
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    add-int/lit8 v0, v0, 0x1

    .line 91
    .line 92
    iget-object v1, p0, Lcom/friday/paint/view/ThePaintFragment$initObserver$4$1;->d:Lcom/friday/paint/view/ThePaintFragment;

    .line 93
    .line 94
    invoke-virtual {v1}, Lcom/friday/paint/view/ThePaintFragment;->t0()Lcom/friday/paint/adapter/NoteFragmentStateAdapter;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    invoke-virtual {v1}, Lcom/friday/paint/adapter/NoteFragmentStateAdapter;->getItemCount()I

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    invoke-static {p1, v0, v1}, Lcom/friday/paint/view/ThePaintFragment;->h0(Lcom/friday/paint/view/ThePaintFragment;II)V

    .line 103
    .line 104
    .line 105
    iget-object p1, p0, Lcom/friday/paint/view/ThePaintFragment$initObserver$4$1;->d:Lcom/friday/paint/view/ThePaintFragment;

    .line 106
    .line 107
    invoke-static {p1}, Lcom/friday/paint/view/ThePaintFragment;->e0(Lcom/friday/paint/view/ThePaintFragment;)Lcom/friday/paint/databinding/FragmentThePaintBinding;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    iget-object v0, v0, Lcom/friday/paint/databinding/FragmentThePaintBinding;->E:Landroidx/recyclerview/widget/RecyclerView;

    .line 112
    .line 113
    const-string v1, "rvNoteList"

    .line 114
    .line 115
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    iget-object v1, p0, Lcom/friday/paint/view/ThePaintFragment$initObserver$4$1;->e:Ljava/lang/Integer;

    .line 119
    .line 120
    invoke-static {v1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 124
    .line 125
    .line 126
    move-result v1

    .line 127
    invoke-static {p1, v0, v1}, Lcom/friday/paint/view/ThePaintFragment;->g0(Lcom/friday/paint/view/ThePaintFragment;Landroidx/recyclerview/widget/RecyclerView;I)V

    .line 128
    .line 129
    .line 130
    :cond_0
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 131
    .line 132
    return-object p1

    .line 133
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 134
    .line 135
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 136
    .line 137
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    throw p1
.end method
