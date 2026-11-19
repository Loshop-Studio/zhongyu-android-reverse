.class final Lcom/friday/paint/view/six/NewPaintFragment$initObserver$5$1;
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
    c = "com.friday.paint.view.six.NewPaintFragment$initObserver$5$1"
    f = "NewPaintFragment.kt"
    l = {
        0x140,
        0x145
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public final synthetic d:Ljava/lang/Boolean;

.field public final synthetic e:Lcom/friday/paint/view/six/NewPaintFragment;


# direct methods
.method public constructor <init>(Ljava/lang/Boolean;Lcom/friday/paint/view/six/NewPaintFragment;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$5$1;->d:Ljava/lang/Boolean;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$5$1;->e:Lcom/friday/paint/view/six/NewPaintFragment;

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
    new-instance p1, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$5$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$5$1;->d:Ljava/lang/Boolean;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$5$1;->e:Lcom/friday/paint/view/six/NewPaintFragment;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$5$1;-><init>(Ljava/lang/Boolean;Lcom/friday/paint/view/six/NewPaintFragment;Lvc/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$5$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$5$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$5$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$5$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$5$1;->c:I

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    const/4 v3, 0x1

    .line 9
    if-eqz v1, :cond_2

    .line 10
    .line 11
    if-eq v1, v3, :cond_1

    .line 12
    .line 13
    if-ne v1, v2, :cond_0

    .line 14
    .line 15
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    goto/16 :goto_3

    .line 19
    .line 20
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 21
    .line 22
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 23
    .line 24
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw p1

    .line 28
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iget-object p1, p0, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$5$1;->d:Ljava/lang/Boolean;

    .line 36
    .line 37
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-eqz p1, :cond_4

    .line 42
    .line 43
    iget-object p1, p0, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$5$1;->e:Lcom/friday/paint/view/six/NewPaintFragment;

    .line 44
    .line 45
    invoke-static {p1}, Lcom/friday/paint/view/six/NewPaintFragment;->access$getViewModel(Lcom/friday/paint/view/six/NewPaintFragment;)Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    iget-object v1, p0, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$5$1;->e:Lcom/friday/paint/view/six/NewPaintFragment;

    .line 50
    .line 51
    invoke-virtual {v1}, Lcom/friday/paint/view/six/NewPaintFragment;->getRightNoteListAdapter()Lcom/friday/paint/view/six/NewThumbnailListAdapter;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-virtual {v1}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getData()Ljava/util/List;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    check-cast v1, Ljava/lang/Iterable;

    .line 60
    .line 61
    new-instance v4, Ljava/util/ArrayList;

    .line 62
    .line 63
    const/16 v5, 0xa

    .line 64
    .line 65
    invoke-static {v1, v5}, Lrc/x;->x(Ljava/lang/Iterable;I)I

    .line 66
    .line 67
    .line 68
    move-result v5

    .line 69
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 70
    .line 71
    .line 72
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 77
    .line 78
    .line 79
    move-result v5

    .line 80
    if-eqz v5, :cond_3

    .line 81
    .line 82
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v5

    .line 86
    check-cast v5, Lcom/friday/paint/model/NoteListEntity;

    .line 87
    .line 88
    invoke-virtual {v5}, Lcom/friday/paint/model/NoteListEntity;->getNoteDir()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v5

    .line 92
    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_3
    iput v3, p0, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$5$1;->c:I

    .line 97
    .line 98
    invoke-virtual {p1, v4, p0}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->d0(Ljava/util/List;Lvc/c;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    if-ne p1, v0, :cond_4

    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_4
    :goto_1
    iget-object p1, p0, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$5$1;->e:Lcom/friday/paint/view/six/NewPaintFragment;

    .line 106
    .line 107
    invoke-static {p1}, Lcom/friday/paint/view/six/NewPaintFragment;->access$getViewModel(Lcom/friday/paint/view/six/NewPaintFragment;)Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    invoke-virtual {p1}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->F()Landroidx/lifecycle/MutableLiveData;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    invoke-virtual {p1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    invoke-static {v3}, Lxc/a;->a(Z)Ljava/lang/Boolean;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    invoke-static {p1, v1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result p1

    .line 127
    if-eqz p1, :cond_8

    .line 128
    .line 129
    iget-object p1, p0, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$5$1;->e:Lcom/friday/paint/view/six/NewPaintFragment;

    .line 130
    .line 131
    invoke-static {p1}, Lcom/friday/paint/view/six/NewPaintFragment;->access$getViewModel(Lcom/friday/paint/view/six/NewPaintFragment;)Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    iput v2, p0, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$5$1;->c:I

    .line 136
    .line 137
    invoke-virtual {p1, p0}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->s(Lvc/c;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    if-ne p1, v0, :cond_5

    .line 142
    .line 143
    :goto_2
    return-object v0

    .line 144
    :cond_5
    :goto_3
    iget-object p1, p0, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$5$1;->e:Lcom/friday/paint/view/six/NewPaintFragment;

    .line 145
    .line 146
    invoke-static {p1}, Lcom/friday/paint/view/six/NewPaintFragment;->access$getViewModel(Lcom/friday/paint/view/six/NewPaintFragment;)Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    invoke-virtual {p1}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->I()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    invoke-static {p1}, Lcom/friday/common/entity/FromPage;->valueOf(Ljava/lang/String;)Lcom/friday/common/entity/FromPage;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    sget-object v0, Lcom/friday/common/entity/FromPage;->FROM_CLASS:Lcom/friday/common/entity/FromPage;

    .line 159
    .line 160
    const/4 v1, 0x0

    .line 161
    if-ne p1, v0, :cond_6

    .line 162
    .line 163
    const-string v2, "checkTab"

    .line 164
    .line 165
    invoke-static {v2}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/String;)Lcom/jeremyliao/liveeventbus/core/Observable;

    .line 166
    .line 167
    .line 168
    move-result-object v2

    .line 169
    invoke-static {v1}, Lxc/a;->c(I)Ljava/lang/Integer;

    .line 170
    .line 171
    .line 172
    move-result-object v3

    .line 173
    invoke-interface {v2, v3}, Lcom/jeremyliao/liveeventbus/core/Observable;->post(Ljava/lang/Object;)V

    .line 174
    .line 175
    .line 176
    :cond_6
    const-string v2, "UpdateSelectedNote"

    .line 177
    .line 178
    invoke-static {v2}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/String;)Lcom/jeremyliao/liveeventbus/core/Observable;

    .line 179
    .line 180
    .line 181
    move-result-object v2

    .line 182
    new-instance v3, Lcom/friday/common/entity/UpdateSpecifiedItem;

    .line 183
    .line 184
    iget-object v4, p0, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$5$1;->e:Lcom/friday/paint/view/six/NewPaintFragment;

    .line 185
    .line 186
    invoke-static {v4}, Lcom/friday/paint/view/six/NewPaintFragment;->access$getViewModel(Lcom/friday/paint/view/six/NewPaintFragment;)Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 187
    .line 188
    .line 189
    move-result-object v4

    .line 190
    invoke-virtual {v4}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->G()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v4

    .line 194
    if-ne p1, v0, :cond_7

    .line 195
    .line 196
    sget-object p1, Lcom/friday/common/entity/FromPage;->FROM_NEWEST:Lcom/friday/common/entity/FromPage;

    .line 197
    .line 198
    :cond_7
    invoke-direct {v3, v4, p1}, Lcom/friday/common/entity/UpdateSpecifiedItem;-><init>(Ljava/lang/String;Lcom/friday/common/entity/FromPage;)V

    .line 199
    .line 200
    .line 201
    invoke-interface {v2, v3}, Lcom/jeremyliao/liveeventbus/core/Observable;->post(Ljava/lang/Object;)V

    .line 202
    .line 203
    .line 204
    iget-object p1, p0, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$5$1;->e:Lcom/friday/paint/view/six/NewPaintFragment;

    .line 205
    .line 206
    invoke-virtual {p1, v1}, Lcom/friday/common/base/BaseFragment;->isShowLoading(Z)V

    .line 207
    .line 208
    .line 209
    iget-object p1, p0, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$5$1;->e:Lcom/friday/paint/view/six/NewPaintFragment;

    .line 210
    .line 211
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 212
    .line 213
    .line 214
    move-result-object p1

    .line 215
    if-eqz p1, :cond_8

    .line 216
    .line 217
    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    .line 218
    .line 219
    .line 220
    :cond_8
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 221
    .line 222
    return-object p1
.end method
