.class final Lcom/friday/paint/view/six/NewPaintFragment$initObserver$4$1$changeNote$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/paint/view/six/NewPaintFragment$initObserver$4$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.friday.paint.view.six.NewPaintFragment$initObserver$4$1$changeNote$1$1"
    f = "NewPaintFragment.kt"
    l = {
        0x122
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Lcom/friday/paint/view/six/NewPaintFragment;

.field public final synthetic f:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/friday/paint/view/six/NewPaintFragment;Ljava/lang/Integer;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$4$1$changeNote$1$1;->d:Ljava/lang/String;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$4$1$changeNote$1$1;->e:Lcom/friday/paint/view/six/NewPaintFragment;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$4$1$changeNote$1$1;->f:Ljava/lang/Integer;

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
    new-instance p1, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$4$1$changeNote$1$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$4$1$changeNote$1$1;->d:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$4$1$changeNote$1$1;->e:Lcom/friday/paint/view/six/NewPaintFragment;

    .line 6
    .line 7
    iget-object v2, p0, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$4$1$changeNote$1$1;->f:Ljava/lang/Integer;

    .line 8
    .line 9
    invoke-direct {p1, v0, v1, v2, p2}, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$4$1$changeNote$1$1;-><init>(Ljava/lang/String;Lcom/friday/paint/view/six/NewPaintFragment;Ljava/lang/Integer;Lvc/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$4$1$changeNote$1$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$4$1$changeNote$1$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$4$1$changeNote$1$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$4$1$changeNote$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v1, p0, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$4$1$changeNote$1$1;->c:I

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
    :try_start_0
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    .line 14
    .line 15
    goto/16 :goto_0

    .line 16
    .line 17
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 18
    .line 19
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 20
    .line 21
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    throw p1

    .line 25
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    :try_start_1
    iget-object p1, p0, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$4$1$changeNote$1$1;->d:Ljava/lang/String;

    .line 29
    .line 30
    if-eqz p1, :cond_2

    .line 31
    .line 32
    iget-object v1, p0, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$4$1$changeNote$1$1;->e:Lcom/friday/paint/view/six/NewPaintFragment;

    .line 33
    .line 34
    invoke-static {v1, p1}, Lcom/friday/paint/view/six/NewPaintFragment;->access$updateNoteScreenShotByNotePath(Lcom/friday/paint/view/six/NewPaintFragment;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    :cond_2
    iget-object p1, p0, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$4$1$changeNote$1$1;->e:Lcom/friday/paint/view/six/NewPaintFragment;

    .line 38
    .line 39
    invoke-virtual {p1}, Lcom/friday/paint/view/six/NewPaintFragment;->getRightNoteListAdapter()Lcom/friday/paint/view/six/NewThumbnailListAdapter;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {p1}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getItemCount()I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    iget-object v1, p0, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$4$1$changeNote$1$1;->f:Ljava/lang/Integer;

    .line 48
    .line 49
    invoke-static {v1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-ltz v1, :cond_3

    .line 57
    .line 58
    if-ge v1, p1, :cond_3

    .line 59
    .line 60
    iget-object p1, p0, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$4$1$changeNote$1$1;->e:Lcom/friday/paint/view/six/NewPaintFragment;

    .line 61
    .line 62
    invoke-virtual {p1}, Lcom/friday/paint/view/six/NewPaintFragment;->getRightNoteListAdapter()Lcom/friday/paint/view/six/NewThumbnailListAdapter;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    iget-object v1, p0, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$4$1$changeNote$1$1;->f:Ljava/lang/Integer;

    .line 67
    .line 68
    invoke-static {v1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    invoke-virtual {p1, v1}, Lcom/friday/paint/view/six/NewThumbnailListAdapter;->updateSelectedItem(I)V

    .line 76
    .line 77
    .line 78
    iget-object p1, p0, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$4$1$changeNote$1$1;->e:Lcom/friday/paint/view/six/NewPaintFragment;

    .line 79
    .line 80
    iget-object v1, p0, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$4$1$changeNote$1$1;->f:Ljava/lang/Integer;

    .line 81
    .line 82
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    add-int/2addr v1, v2

    .line 87
    iget-object v3, p0, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$4$1$changeNote$1$1;->e:Lcom/friday/paint/view/six/NewPaintFragment;

    .line 88
    .line 89
    invoke-virtual {v3}, Lcom/friday/paint/view/six/NewPaintFragment;->getRightNoteListAdapter()Lcom/friday/paint/view/six/NewThumbnailListAdapter;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    invoke-virtual {v3}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getItemCount()I

    .line 94
    .line 95
    .line 96
    move-result v3

    .line 97
    invoke-static {p1, v1, v3}, Lcom/friday/paint/view/six/NewPaintFragment;->access$updateCurrentPage(Lcom/friday/paint/view/six/NewPaintFragment;II)V

    .line 98
    .line 99
    .line 100
    iget-object p1, p0, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$4$1$changeNote$1$1;->e:Lcom/friday/paint/view/six/NewPaintFragment;

    .line 101
    .line 102
    invoke-static {p1}, Lcom/friday/paint/view/six/NewPaintFragment;->access$getMBinding(Lcom/friday/paint/view/six/NewPaintFragment;)Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    iget-object v1, v1, Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;->s:Landroidx/recyclerview/widget/RecyclerView;

    .line 107
    .line 108
    const-string v3, "rvNoteList"

    .line 109
    .line 110
    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    iget-object v3, p0, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$4$1$changeNote$1$1;->f:Ljava/lang/Integer;

    .line 114
    .line 115
    invoke-static {v3}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 119
    .line 120
    .line 121
    move-result v3

    .line 122
    invoke-static {p1, v1, v3}, Lcom/friday/paint/view/six/NewPaintFragment;->access$moveToPosition(Lcom/friday/paint/view/six/NewPaintFragment;Landroidx/recyclerview/widget/RecyclerView;I)V

    .line 123
    .line 124
    .line 125
    :cond_3
    iget-object p1, p0, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$4$1$changeNote$1$1;->e:Lcom/friday/paint/view/six/NewPaintFragment;

    .line 126
    .line 127
    invoke-virtual {p1}, Lcom/friday/paint/view/six/NewPaintFragment;->getRightNoteListAdapter()Lcom/friday/paint/view/six/NewThumbnailListAdapter;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    invoke-virtual {v1}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getData()Ljava/util/List;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    iget-object v3, p0, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$4$1$changeNote$1$1;->f:Ljava/lang/Integer;

    .line 136
    .line 137
    invoke-static {v3}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 141
    .line 142
    .line 143
    move-result v3

    .line 144
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    check-cast v1, Lcom/friday/paint/model/NoteListEntity;

    .line 149
    .line 150
    invoke-virtual {v1}, Lcom/friday/paint/model/NoteListEntity;->getNoteDir()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    iput v2, p0, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$4$1$changeNote$1$1;->c:I

    .line 155
    .line 156
    invoke-static {p1, v1, p0}, Lcom/friday/paint/view/six/NewPaintFragment;->access$changeNote(Lcom/friday/paint/view/six/NewPaintFragment;Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    if-ne p1, v0, :cond_4

    .line 161
    .line 162
    return-object v0

    .line 163
    :cond_4
    :goto_0
    iget-object p1, p0, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$4$1$changeNote$1$1;->e:Lcom/friday/paint/view/six/NewPaintFragment;

    .line 164
    .line 165
    invoke-static {p1}, Lcom/friday/paint/view/six/NewPaintFragment;->access$getViewModel(Lcom/friday/paint/view/six/NewPaintFragment;)Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    invoke-virtual {p1, v2}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->c0(Z)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 170
    .line 171
    .line 172
    goto :goto_1

    .line 173
    :catch_0
    iget-object p1, p0, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$4$1$changeNote$1$1;->e:Lcom/friday/paint/view/six/NewPaintFragment;

    .line 174
    .line 175
    const/4 v0, 0x0

    .line 176
    invoke-virtual {p1, v0}, Lcom/friday/common/base/BaseFragment;->isShowLoading(Z)V

    .line 177
    .line 178
    .line 179
    :goto_1
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 180
    .line 181
    return-object p1
.end method
