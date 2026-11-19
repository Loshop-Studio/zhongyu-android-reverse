.class final Lcom/friday/paint/view/ThePaintFragment$copyNote$1$3;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/paint/view/ThePaintFragment$copyNote$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.friday.paint.view.ThePaintFragment$copyNote$1$3"
    f = "ThePaintFragment.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public final synthetic d:Lcom/friday/paint/view/ThePaintFragment;

.field public final synthetic e:I

.field public final synthetic f:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/friday/paint/view/ThePaintFragment;ILjava/lang/String;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/paint/view/ThePaintFragment$copyNote$1$3;->d:Lcom/friday/paint/view/ThePaintFragment;

    .line 2
    .line 3
    iput p2, p0, Lcom/friday/paint/view/ThePaintFragment$copyNote$1$3;->e:I

    .line 4
    .line 5
    iput-object p3, p0, Lcom/friday/paint/view/ThePaintFragment$copyNote$1$3;->f:Ljava/lang/String;

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

.method public static synthetic g(Lcom/friday/paint/view/ThePaintFragment;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/ThePaintFragment$copyNote$1$3;->m(Lcom/friday/paint/view/ThePaintFragment;I)V

    return-void
.end method

.method public static final m(Lcom/friday/paint/view/ThePaintFragment;I)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/friday/paint/view/ThePaintFragment;->f0(Lcom/friday/paint/view/ThePaintFragment;)Lcom/friday/paint/viewmodel/NoteViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1}, Lcom/friday/paint/viewmodel/NoteViewModel;->V(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 3

    .line 1
    new-instance p1, Lcom/friday/paint/view/ThePaintFragment$copyNote$1$3;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/paint/view/ThePaintFragment$copyNote$1$3;->d:Lcom/friday/paint/view/ThePaintFragment;

    .line 4
    .line 5
    iget v1, p0, Lcom/friday/paint/view/ThePaintFragment$copyNote$1$3;->e:I

    .line 6
    .line 7
    iget-object v2, p0, Lcom/friday/paint/view/ThePaintFragment$copyNote$1$3;->f:Ljava/lang/String;

    .line 8
    .line 9
    invoke-direct {p1, v0, v1, v2, p2}, Lcom/friday/paint/view/ThePaintFragment$copyNote$1$3;-><init>(Lcom/friday/paint/view/ThePaintFragment;ILjava/lang/String;Lvc/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/friday/paint/view/ThePaintFragment$copyNote$1$3;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/paint/view/ThePaintFragment$copyNote$1$3;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/paint/view/ThePaintFragment$copyNote$1$3;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/paint/view/ThePaintFragment$copyNote$1$3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/friday/paint/view/ThePaintFragment$copyNote$1$3;->c:I

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/friday/paint/view/ThePaintFragment$copyNote$1$3;->d:Lcom/friday/paint/view/ThePaintFragment;

    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/friday/paint/view/ThePaintFragment;->u0()Lcom/friday/paint/adapter/ThumbnailListAdapter;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iget v0, p0, Lcom/friday/paint/view/ThePaintFragment$copyNote$1$3;->e:I

    .line 18
    .line 19
    new-instance v1, Lcom/friday/paint/model/NoteListEntity;

    .line 20
    .line 21
    iget-object v2, p0, Lcom/friday/paint/view/ThePaintFragment$copyNote$1$3;->f:Ljava/lang/String;

    .line 22
    .line 23
    new-instance v3, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string v2, "/thumbnail.jpg"

    .line 32
    .line 33
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    const/16 v6, 0xe

    .line 41
    .line 42
    const/4 v7, 0x0

    .line 43
    const/4 v3, 0x0

    .line 44
    const/4 v4, 0x0

    .line 45
    const/4 v5, 0x0

    .line 46
    invoke-direct/range {v1 .. v7}, Lcom/friday/paint/model/NoteListEntity;-><init>(Ljava/lang/String;ZZLjava/lang/String;ILkotlin/jvm/internal/n;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1, v0, v1}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->addData(ILjava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iget p1, p0, Lcom/friday/paint/view/ThePaintFragment$copyNote$1$3;->e:I

    .line 53
    .line 54
    iget-object v0, p0, Lcom/friday/paint/view/ThePaintFragment$copyNote$1$3;->d:Lcom/friday/paint/view/ThePaintFragment;

    .line 55
    .line 56
    invoke-virtual {v0}, Lcom/friday/paint/view/ThePaintFragment;->u0()Lcom/friday/paint/adapter/ThumbnailListAdapter;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-virtual {v0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getData()Ljava/util/List;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    :goto_0
    if-ge p1, v0, :cond_0

    .line 69
    .line 70
    iget-object v1, p0, Lcom/friday/paint/view/ThePaintFragment$copyNote$1$3;->d:Lcom/friday/paint/view/ThePaintFragment;

    .line 71
    .line 72
    invoke-virtual {v1}, Lcom/friday/paint/view/ThePaintFragment;->u0()Lcom/friday/paint/adapter/ThumbnailListAdapter;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-virtual {v1, p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemChanged(I)V

    .line 77
    .line 78
    .line 79
    add-int/lit8 p1, p1, 0x1

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_0
    new-instance p1, Lcom/friday/paint/model/PaintEntity;

    .line 83
    .line 84
    iget-object v0, p0, Lcom/friday/paint/view/ThePaintFragment$copyNote$1$3;->f:Ljava/lang/String;

    .line 85
    .line 86
    invoke-direct {p1, v0}, Lcom/friday/paint/model/PaintEntity;-><init>(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    iget-object v0, p0, Lcom/friday/paint/view/ThePaintFragment$copyNote$1$3;->d:Lcom/friday/paint/view/ThePaintFragment;

    .line 90
    .line 91
    invoke-virtual {v0}, Lcom/friday/paint/view/ThePaintFragment;->t0()Lcom/friday/paint/adapter/NoteFragmentStateAdapter;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    iget v1, p0, Lcom/friday/paint/view/ThePaintFragment$copyNote$1$3;->e:I

    .line 96
    .line 97
    invoke-virtual {v0, v1, p1}, Lcom/friday/paint/adapter/NoteFragmentStateAdapter;->a(ILcom/friday/paint/model/PaintEntity;)V

    .line 98
    .line 99
    .line 100
    iget-object p1, p0, Lcom/friday/paint/view/ThePaintFragment$copyNote$1$3;->d:Lcom/friday/paint/view/ThePaintFragment;

    .line 101
    .line 102
    invoke-static {p1}, Lcom/friday/paint/view/ThePaintFragment;->e0(Lcom/friday/paint/view/ThePaintFragment;)Lcom/friday/paint/databinding/FragmentThePaintBinding;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    iget-object p1, p1, Lcom/friday/paint/databinding/FragmentThePaintBinding;->E:Landroidx/recyclerview/widget/RecyclerView;

    .line 107
    .line 108
    iget-object v0, p0, Lcom/friday/paint/view/ThePaintFragment$copyNote$1$3;->d:Lcom/friday/paint/view/ThePaintFragment;

    .line 109
    .line 110
    iget v1, p0, Lcom/friday/paint/view/ThePaintFragment$copyNote$1$3;->e:I

    .line 111
    .line 112
    new-instance v2, Lcom/friday/paint/view/b;

    .line 113
    .line 114
    invoke-direct {v2, v0, v1}, Lcom/friday/paint/view/b;-><init>(Lcom/friday/paint/view/ThePaintFragment;I)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {p1, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 118
    .line 119
    .line 120
    iget-object p1, p0, Lcom/friday/paint/view/ThePaintFragment$copyNote$1$3;->d:Lcom/friday/paint/view/ThePaintFragment;

    .line 121
    .line 122
    const/4 v0, 0x0

    .line 123
    invoke-virtual {p1, v0}, Lcom/friday/common/base/BaseFragment;->isShowLoading(Z)V

    .line 124
    .line 125
    .line 126
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 127
    .line 128
    return-object p1

    .line 129
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 130
    .line 131
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 132
    .line 133
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    throw p1
.end method
