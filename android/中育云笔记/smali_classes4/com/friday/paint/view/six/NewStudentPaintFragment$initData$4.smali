.class final Lcom/friday/paint/view/six/NewStudentPaintFragment$initData$4;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/paint/view/six/NewStudentPaintFragment;->initData()V
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
    c = "com.friday.paint.view.six.NewStudentPaintFragment$initData$4"
    f = "NewStudentPaintFragment.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public final synthetic d:Lcom/friday/paint/view/six/NewStudentPaintFragment;


# direct methods
.method public constructor <init>(Lcom/friday/paint/view/six/NewStudentPaintFragment;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/paint/view/six/NewStudentPaintFragment$initData$4;->d:Lcom/friday/paint/view/six/NewStudentPaintFragment;

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
    new-instance p1, Lcom/friday/paint/view/six/NewStudentPaintFragment$initData$4;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/paint/view/six/NewStudentPaintFragment$initData$4;->d:Lcom/friday/paint/view/six/NewStudentPaintFragment;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lcom/friday/paint/view/six/NewStudentPaintFragment$initData$4;-><init>(Lcom/friday/paint/view/six/NewStudentPaintFragment;Lvc/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/friday/paint/view/six/NewStudentPaintFragment$initData$4;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/paint/view/six/NewStudentPaintFragment$initData$4;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/paint/view/six/NewStudentPaintFragment$initData$4;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/paint/view/six/NewStudentPaintFragment$initData$4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v0, p0, Lcom/friday/paint/view/six/NewStudentPaintFragment$initData$4;->c:I

    .line 5
    .line 6
    if-nez v0, :cond_2

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Lcom/blankj/utilcode/util/CacheMemoryUtils;->getInstance()Lcom/blankj/utilcode/util/CacheMemoryUtils;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const-string v0, "answer_cache"

    .line 16
    .line 17
    invoke-virtual {p1, v0}, Lcom/blankj/utilcode/util/CacheMemoryUtils;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    check-cast p1, Lcom/friday/common/entity/AnswerCache;

    .line 22
    .line 23
    if-eqz p1, :cond_1

    .line 24
    .line 25
    iget-object v0, p0, Lcom/friday/paint/view/six/NewStudentPaintFragment$initData$4;->d:Lcom/friday/paint/view/six/NewStudentPaintFragment;

    .line 26
    .line 27
    invoke-virtual {p1}, Lcom/friday/common/entity/AnswerCache;->isSubjective()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    invoke-static {v0}, Lcom/friday/paint/view/six/NewStudentPaintFragment;->access$getViewModel(Lcom/friday/paint/view/six/NewStudentPaintFragment;)Lcom/friday/paint/viewmodel/DoHomeworkViewModel;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v1}, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->j()Landroidx/lifecycle/MutableLiveData;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {p1}, Lcom/friday/common/entity/AnswerCache;->getHasStopped()Ljava/lang/Boolean;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-virtual {v1, v2}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    invoke-static {v0}, Lcom/friday/paint/view/six/NewStudentPaintFragment;->access$getViewModel(Lcom/friday/paint/view/six/NewStudentPaintFragment;)Lcom/friday/paint/viewmodel/DoHomeworkViewModel;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-virtual {p1}, Lcom/friday/common/entity/AnswerCache;->getQstCount()I

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    invoke-virtual {v1, v2}, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->y(I)V

    .line 58
    .line 59
    .line 60
    invoke-static {v0}, Lcom/friday/paint/view/six/NewStudentPaintFragment;->access$getViewModel(Lcom/friday/paint/view/six/NewStudentPaintFragment;)Lcom/friday/paint/viewmodel/DoHomeworkViewModel;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-virtual {p1}, Lcom/friday/common/entity/AnswerCache;->getDataList()Ljava/util/ArrayList;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-virtual {v1, v2}, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->s(Ljava/util/ArrayList;)V

    .line 69
    .line 70
    .line 71
    invoke-static {v0}, Lcom/friday/paint/view/six/NewStudentPaintFragment;->access$getViewModel(Lcom/friday/paint/view/six/NewStudentPaintFragment;)Lcom/friday/paint/viewmodel/DoHomeworkViewModel;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-virtual {p1}, Lcom/friday/common/entity/AnswerCache;->getFromServer()Z

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    invoke-virtual {v1, v2}, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->u(Z)V

    .line 80
    .line 81
    .line 82
    invoke-static {v0}, Lcom/friday/paint/view/six/NewStudentPaintFragment;->access$getViewModel(Lcom/friday/paint/view/six/NewStudentPaintFragment;)Lcom/friday/paint/viewmodel/DoHomeworkViewModel;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    invoke-virtual {p1}, Lcom/friday/common/entity/AnswerCache;->getHasSubmit()Z

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    invoke-virtual {v1, v2}, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->v(Z)V

    .line 91
    .line 92
    .line 93
    invoke-static {v0}, Lcom/friday/paint/view/six/NewStudentPaintFragment;->access$getViewModel(Lcom/friday/paint/view/six/NewStudentPaintFragment;)Lcom/friday/paint/viewmodel/DoHomeworkViewModel;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    invoke-virtual {p1}, Lcom/friday/common/entity/AnswerCache;->isSingle()Z

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    invoke-virtual {v1, v2}, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->z(Z)V

    .line 102
    .line 103
    .line 104
    invoke-static {v0}, Lcom/friday/paint/view/six/NewStudentPaintFragment;->access$getViewModel(Lcom/friday/paint/view/six/NewStudentPaintFragment;)Lcom/friday/paint/viewmodel/DoHomeworkViewModel;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    invoke-virtual {p1}, Lcom/friday/common/entity/AnswerCache;->getOptions()I

    .line 109
    .line 110
    .line 111
    move-result p1

    .line 112
    invoke-virtual {v1, p1}, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->x(I)V

    .line 113
    .line 114
    .line 115
    invoke-static {v0}, Lcom/friday/paint/view/six/NewStudentPaintFragment;->access$getViewModel(Lcom/friday/paint/view/six/NewStudentPaintFragment;)Lcom/friday/paint/viewmodel/DoHomeworkViewModel;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    invoke-virtual {p1}, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->k()Z

    .line 120
    .line 121
    .line 122
    move-result p1

    .line 123
    if-eqz p1, :cond_1

    .line 124
    .line 125
    invoke-static {v0}, Lcom/friday/paint/view/six/NewStudentPaintFragment;->access$getMBinding(Lcom/friday/paint/view/six/NewStudentPaintFragment;)Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    iget-object p1, p1, Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;->f:Landroid/widget/ImageView;

    .line 130
    .line 131
    const/4 v1, 0x0

    .line 132
    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v0}, Lcom/friday/paint/view/six/NewPaintFragment;->getRightNoteListAdapter()Lcom/friday/paint/view/six/NewThumbnailListAdapter;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    .line 140
    .line 141
    .line 142
    :cond_1
    :goto_0
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 143
    .line 144
    return-object p1

    .line 145
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 146
    .line 147
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 148
    .line 149
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    throw p1
.end method
