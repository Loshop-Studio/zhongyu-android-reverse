.class final Lcom/friday/paint/view/six/NewPaintFragment$initObserver$4$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/paint/view/six/NewPaintFragment;->initObserver()V
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
    c = "com.friday.paint.view.six.NewPaintFragment$initObserver$4$1"
    f = "NewPaintFragment.kt"
    l = {
        0x137
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:Ljava/lang/Object;

.field public d:I

.field public final synthetic e:Lcom/friday/paint/view/six/NewPaintFragment;

.field public final synthetic f:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Lcom/friday/paint/view/six/NewPaintFragment;Ljava/lang/Integer;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$4$1;->e:Lcom/friday/paint/view/six/NewPaintFragment;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$4$1;->f:Ljava/lang/Integer;

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

.method public static synthetic g(Lcom/friday/paint/view/six/NewPaintFragment;Ljava/lang/Integer;Ljava/lang/String;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$4$1;->p(Lcom/friday/paint/view/six/NewPaintFragment;Ljava/lang/Integer;Ljava/lang/String;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lhd/l;Ljava/lang/String;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$4$1;->v(Lhd/l;Ljava/lang/String;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Lhd/l;Ljava/lang/Throwable;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$4$1;->t(Lhd/l;Ljava/lang/Throwable;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static final p(Lcom/friday/paint/view/six/NewPaintFragment;Ljava/lang/Integer;Ljava/lang/String;)Lqc/q;
    .locals 6

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v3, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$4$1$changeNote$1$1;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v3, p2, p0, p1, v1}, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$4$1$changeNote$1$1;-><init>(Ljava/lang/String;Lcom/friday/paint/view/six/NewPaintFragment;Ljava/lang/Integer;Lvc/c;)V

    .line 9
    .line 10
    .line 11
    const/4 v4, 0x3

    .line 12
    const/4 v5, 0x0

    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-static/range {v0 .. v5}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 15
    .line 16
    .line 17
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 18
    .line 19
    return-object p0
.end method

.method public static final t(Lhd/l;Ljava/lang/Throwable;)Lqc/q;
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    invoke-interface {p0, p1}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 6
    .line 7
    return-object p0
.end method

.method public static final v(Lhd/l;Ljava/lang/String;)Lqc/q;
    .locals 0

    .line 1
    invoke-interface {p0, p1}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 5
    .line 6
    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 2

    .line 1
    new-instance p1, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$4$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$4$1;->e:Lcom/friday/paint/view/six/NewPaintFragment;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$4$1;->f:Ljava/lang/Integer;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$4$1;-><init>(Lcom/friday/paint/view/six/NewPaintFragment;Ljava/lang/Integer;Lvc/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$4$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$4$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$4$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$4$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$4$1;->d:I

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
    iget-object v0, p0, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$4$1;->c:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Lcom/zykj/view/board/board/BoardFragment;

    .line 15
    .line 16
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    goto/16 :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 22
    .line 23
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 24
    .line 25
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw p1

    .line 29
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iget-object p1, p0, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$4$1;->e:Lcom/friday/paint/view/six/NewPaintFragment;

    .line 33
    .line 34
    invoke-virtual {p1}, Lcom/friday/paint/view/six/NewPaintFragment;->getCurrentNoteFragment()Lcom/zykj/view/board/board/BoardFragment;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    if-eqz v4, :cond_2

    .line 39
    .line 40
    iget-object p1, p0, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$4$1;->e:Lcom/friday/paint/view/six/NewPaintFragment;

    .line 41
    .line 42
    invoke-virtual {p1, v2}, Lcom/friday/common/base/BaseFragment;->isShowLoading(Z)V

    .line 43
    .line 44
    .line 45
    const-string p1, "\u5f00\u59cb\u52a0\u8f7dBoardFragment"

    .line 46
    .line 47
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    iget-object p1, p0, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$4$1;->e:Lcom/friday/paint/view/six/NewPaintFragment;

    .line 55
    .line 56
    iget-object v0, p0, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$4$1;->f:Ljava/lang/Integer;

    .line 57
    .line 58
    new-instance v1, Lcom/friday/paint/view/six/d;

    .line 59
    .line 60
    invoke-direct {v1, p1, v0}, Lcom/friday/paint/view/six/d;-><init>(Lcom/friday/paint/view/six/NewPaintFragment;Ljava/lang/Integer;)V

    .line 61
    .line 62
    .line 63
    iget-object v3, p0, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$4$1;->e:Lcom/friday/paint/view/six/NewPaintFragment;

    .line 64
    .line 65
    new-instance v6, Lcom/friday/paint/view/six/e;

    .line 66
    .line 67
    invoke-direct {v6, v1}, Lcom/friday/paint/view/six/e;-><init>(Lhd/l;)V

    .line 68
    .line 69
    .line 70
    new-instance v7, Lcom/friday/paint/view/six/f;

    .line 71
    .line 72
    invoke-direct {v7, v1}, Lcom/friday/paint/view/six/f;-><init>(Lhd/l;)V

    .line 73
    .line 74
    .line 75
    const/4 v8, 0x2

    .line 76
    const/4 v9, 0x0

    .line 77
    const/4 v5, 0x0

    .line 78
    invoke-static/range {v3 .. v9}, Lcom/friday/paint/view/six/NewPaintFragment;->save$default(Lcom/friday/paint/view/six/NewPaintFragment;Lcom/zykj/view/board/board/BoardFragment;ZLhd/l;Lhd/l;ILjava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    goto/16 :goto_1

    .line 82
    .line 83
    :cond_2
    iget-object p1, p0, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$4$1;->e:Lcom/friday/paint/view/six/NewPaintFragment;

    .line 84
    .line 85
    invoke-virtual {p1}, Lcom/friday/paint/view/six/NewPaintFragment;->getRightNoteListAdapter()Lcom/friday/paint/view/six/NewThumbnailListAdapter;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    invoke-virtual {p1}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getItemCount()I

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    iget-object v1, p0, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$4$1;->f:Ljava/lang/Integer;

    .line 94
    .line 95
    invoke-static {v1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    if-ltz v1, :cond_3

    .line 103
    .line 104
    if-ge v1, p1, :cond_3

    .line 105
    .line 106
    iget-object p1, p0, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$4$1;->e:Lcom/friday/paint/view/six/NewPaintFragment;

    .line 107
    .line 108
    invoke-virtual {p1}, Lcom/friday/paint/view/six/NewPaintFragment;->getRightNoteListAdapter()Lcom/friday/paint/view/six/NewThumbnailListAdapter;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    iget-object v1, p0, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$4$1;->f:Ljava/lang/Integer;

    .line 113
    .line 114
    invoke-static {v1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 118
    .line 119
    .line 120
    move-result v1

    .line 121
    invoke-virtual {p1, v1}, Lcom/friday/paint/view/six/NewThumbnailListAdapter;->updateSelectedItem(I)V

    .line 122
    .line 123
    .line 124
    iget-object p1, p0, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$4$1;->e:Lcom/friday/paint/view/six/NewPaintFragment;

    .line 125
    .line 126
    iget-object v1, p0, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$4$1;->f:Ljava/lang/Integer;

    .line 127
    .line 128
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 129
    .line 130
    .line 131
    move-result v1

    .line 132
    add-int/2addr v1, v2

    .line 133
    iget-object v3, p0, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$4$1;->e:Lcom/friday/paint/view/six/NewPaintFragment;

    .line 134
    .line 135
    invoke-virtual {v3}, Lcom/friday/paint/view/six/NewPaintFragment;->getRightNoteListAdapter()Lcom/friday/paint/view/six/NewThumbnailListAdapter;

    .line 136
    .line 137
    .line 138
    move-result-object v3

    .line 139
    invoke-virtual {v3}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getItemCount()I

    .line 140
    .line 141
    .line 142
    move-result v3

    .line 143
    invoke-static {p1, v1, v3}, Lcom/friday/paint/view/six/NewPaintFragment;->access$updateCurrentPage(Lcom/friday/paint/view/six/NewPaintFragment;II)V

    .line 144
    .line 145
    .line 146
    iget-object p1, p0, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$4$1;->e:Lcom/friday/paint/view/six/NewPaintFragment;

    .line 147
    .line 148
    invoke-static {p1}, Lcom/friday/paint/view/six/NewPaintFragment;->access$getMBinding(Lcom/friday/paint/view/six/NewPaintFragment;)Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    iget-object v1, v1, Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;->s:Landroidx/recyclerview/widget/RecyclerView;

    .line 153
    .line 154
    const-string v3, "rvNoteList"

    .line 155
    .line 156
    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    iget-object v3, p0, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$4$1;->f:Ljava/lang/Integer;

    .line 160
    .line 161
    invoke-static {v3}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 165
    .line 166
    .line 167
    move-result v3

    .line 168
    invoke-static {p1, v1, v3}, Lcom/friday/paint/view/six/NewPaintFragment;->access$moveToPosition(Lcom/friday/paint/view/six/NewPaintFragment;Landroidx/recyclerview/widget/RecyclerView;I)V

    .line 169
    .line 170
    .line 171
    :cond_3
    iget-object p1, p0, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$4$1;->e:Lcom/friday/paint/view/six/NewPaintFragment;

    .line 172
    .line 173
    invoke-virtual {p1}, Lcom/friday/paint/view/six/NewPaintFragment;->getRightNoteListAdapter()Lcom/friday/paint/view/six/NewThumbnailListAdapter;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    invoke-virtual {v1}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getData()Ljava/util/List;

    .line 178
    .line 179
    .line 180
    move-result-object v1

    .line 181
    iget-object v3, p0, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$4$1;->f:Ljava/lang/Integer;

    .line 182
    .line 183
    invoke-static {v3}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 187
    .line 188
    .line 189
    move-result v3

    .line 190
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v1

    .line 194
    check-cast v1, Lcom/friday/paint/model/NoteListEntity;

    .line 195
    .line 196
    invoke-virtual {v1}, Lcom/friday/paint/model/NoteListEntity;->getNoteDir()Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v1

    .line 200
    invoke-static {v4}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v3

    .line 204
    iput-object v3, p0, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$4$1;->c:Ljava/lang/Object;

    .line 205
    .line 206
    iput v2, p0, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$4$1;->d:I

    .line 207
    .line 208
    invoke-static {p1, v1, p0}, Lcom/friday/paint/view/six/NewPaintFragment;->access$changeNote(Lcom/friday/paint/view/six/NewPaintFragment;Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object p1

    .line 212
    if-ne p1, v0, :cond_4

    .line 213
    .line 214
    return-object v0

    .line 215
    :cond_4
    :goto_0
    iget-object p1, p0, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$4$1;->e:Lcom/friday/paint/view/six/NewPaintFragment;

    .line 216
    .line 217
    invoke-static {p1}, Lcom/friday/paint/view/six/NewPaintFragment;->access$getViewModel(Lcom/friday/paint/view/six/NewPaintFragment;)Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 218
    .line 219
    .line 220
    move-result-object p1

    .line 221
    invoke-virtual {p1, v2}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->c0(Z)V

    .line 222
    .line 223
    .line 224
    :goto_1
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 225
    .line 226
    return-object p1
.end method
