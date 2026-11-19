.class final Lcom/friday/paint/view/ThePaintFragment$initObserver$5$1;
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
    c = "com.friday.paint.view.ThePaintFragment$initObserver$5$1"
    f = "ThePaintFragment.kt"
    l = {
        0x11b
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public final synthetic d:Ljava/lang/Boolean;

.field public final synthetic e:Lcom/friday/paint/view/ThePaintFragment;


# direct methods
.method public constructor <init>(Ljava/lang/Boolean;Lcom/friday/paint/view/ThePaintFragment;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/paint/view/ThePaintFragment$initObserver$5$1;->d:Ljava/lang/Boolean;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/paint/view/ThePaintFragment$initObserver$5$1;->e:Lcom/friday/paint/view/ThePaintFragment;

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
    new-instance p1, Lcom/friday/paint/view/ThePaintFragment$initObserver$5$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/paint/view/ThePaintFragment$initObserver$5$1;->d:Ljava/lang/Boolean;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/friday/paint/view/ThePaintFragment$initObserver$5$1;->e:Lcom/friday/paint/view/ThePaintFragment;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/friday/paint/view/ThePaintFragment$initObserver$5$1;-><init>(Ljava/lang/Boolean;Lcom/friday/paint/view/ThePaintFragment;Lvc/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/friday/paint/view/ThePaintFragment$initObserver$5$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/paint/view/ThePaintFragment$initObserver$5$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/paint/view/ThePaintFragment$initObserver$5$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/paint/view/ThePaintFragment$initObserver$5$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v1, p0, Lcom/friday/paint/view/ThePaintFragment$initObserver$5$1;->c:I

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
    iget-object p1, p0, Lcom/friday/paint/view/ThePaintFragment$initObserver$5$1;->d:Ljava/lang/Boolean;

    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-eqz p1, :cond_3

    .line 34
    .line 35
    iget-object p1, p0, Lcom/friday/paint/view/ThePaintFragment$initObserver$5$1;->e:Lcom/friday/paint/view/ThePaintFragment;

    .line 36
    .line 37
    invoke-static {p1}, Lcom/friday/paint/view/ThePaintFragment;->f0(Lcom/friday/paint/view/ThePaintFragment;)Lcom/friday/paint/viewmodel/NoteViewModel;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    iget-object v1, p0, Lcom/friday/paint/view/ThePaintFragment$initObserver$5$1;->e:Lcom/friday/paint/view/ThePaintFragment;

    .line 42
    .line 43
    invoke-virtual {v1}, Lcom/friday/paint/view/ThePaintFragment;->t0()Lcom/friday/paint/adapter/NoteFragmentStateAdapter;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-virtual {v1}, Lcom/friday/paint/adapter/NoteFragmentStateAdapter;->getData()Ljava/util/List;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    check-cast v1, Ljava/lang/Iterable;

    .line 52
    .line 53
    new-instance v3, Ljava/util/ArrayList;

    .line 54
    .line 55
    const/16 v4, 0xa

    .line 56
    .line 57
    invoke-static {v1, v4}, Lrc/x;->x(Ljava/lang/Iterable;I)I

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 62
    .line 63
    .line 64
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    if-eqz v4, :cond_2

    .line 73
    .line 74
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    check-cast v4, Lcom/friday/paint/model/PaintEntity;

    .line 79
    .line 80
    invoke-virtual {v4}, Lcom/friday/paint/model/PaintEntity;->getPath()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_2
    iput v2, p0, Lcom/friday/paint/view/ThePaintFragment$initObserver$5$1;->c:I

    .line 89
    .line 90
    invoke-virtual {p1, v3, p0}, Lcom/friday/paint/viewmodel/NoteViewModel;->X(Ljava/util/List;Lvc/c;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    if-ne p1, v0, :cond_3

    .line 95
    .line 96
    return-object v0

    .line 97
    :cond_3
    :goto_1
    iget-object p1, p0, Lcom/friday/paint/view/ThePaintFragment$initObserver$5$1;->e:Lcom/friday/paint/view/ThePaintFragment;

    .line 98
    .line 99
    invoke-static {p1}, Lcom/friday/paint/view/ThePaintFragment;->f0(Lcom/friday/paint/view/ThePaintFragment;)Lcom/friday/paint/viewmodel/NoteViewModel;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    invoke-virtual {p1}, Lcom/friday/paint/viewmodel/NoteViewModel;->A()Landroidx/lifecycle/MutableLiveData;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    invoke-virtual {p1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    invoke-static {v2}, Lxc/a;->a(Z)Ljava/lang/Boolean;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result p1

    .line 119
    if-eqz p1, :cond_6

    .line 120
    .line 121
    iget-object p1, p0, Lcom/friday/paint/view/ThePaintFragment$initObserver$5$1;->e:Lcom/friday/paint/view/ThePaintFragment;

    .line 122
    .line 123
    invoke-static {p1}, Lcom/friday/paint/view/ThePaintFragment;->f0(Lcom/friday/paint/view/ThePaintFragment;)Lcom/friday/paint/viewmodel/NoteViewModel;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    invoke-virtual {p1}, Lcom/friday/paint/viewmodel/NoteViewModel;->D()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    invoke-static {p1}, Lcom/friday/common/entity/FromPage;->valueOf(Ljava/lang/String;)Lcom/friday/common/entity/FromPage;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    sget-object v0, Lcom/friday/common/entity/FromPage;->FROM_CLASS:Lcom/friday/common/entity/FromPage;

    .line 136
    .line 137
    const/4 v1, 0x0

    .line 138
    if-ne p1, v0, :cond_4

    .line 139
    .line 140
    const-string v2, "checkTab"

    .line 141
    .line 142
    invoke-static {v2}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/String;)Lcom/jeremyliao/liveeventbus/core/Observable;

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    invoke-static {v1}, Lxc/a;->c(I)Ljava/lang/Integer;

    .line 147
    .line 148
    .line 149
    move-result-object v3

    .line 150
    invoke-interface {v2, v3}, Lcom/jeremyliao/liveeventbus/core/Observable;->post(Ljava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    :cond_4
    const-string v2, "UpdateSelectedNote"

    .line 154
    .line 155
    invoke-static {v2}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/String;)Lcom/jeremyliao/liveeventbus/core/Observable;

    .line 156
    .line 157
    .line 158
    move-result-object v2

    .line 159
    new-instance v3, Lcom/friday/common/entity/UpdateSpecifiedItem;

    .line 160
    .line 161
    iget-object v4, p0, Lcom/friday/paint/view/ThePaintFragment$initObserver$5$1;->e:Lcom/friday/paint/view/ThePaintFragment;

    .line 162
    .line 163
    invoke-static {v4}, Lcom/friday/paint/view/ThePaintFragment;->f0(Lcom/friday/paint/view/ThePaintFragment;)Lcom/friday/paint/viewmodel/NoteViewModel;

    .line 164
    .line 165
    .line 166
    move-result-object v4

    .line 167
    invoke-virtual {v4}, Lcom/friday/paint/viewmodel/NoteViewModel;->B()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v4

    .line 171
    if-ne p1, v0, :cond_5

    .line 172
    .line 173
    sget-object p1, Lcom/friday/common/entity/FromPage;->FROM_NEWEST:Lcom/friday/common/entity/FromPage;

    .line 174
    .line 175
    :cond_5
    invoke-direct {v3, v4, p1}, Lcom/friday/common/entity/UpdateSpecifiedItem;-><init>(Ljava/lang/String;Lcom/friday/common/entity/FromPage;)V

    .line 176
    .line 177
    .line 178
    invoke-interface {v2, v3}, Lcom/jeremyliao/liveeventbus/core/Observable;->post(Ljava/lang/Object;)V

    .line 179
    .line 180
    .line 181
    iget-object p1, p0, Lcom/friday/paint/view/ThePaintFragment$initObserver$5$1;->e:Lcom/friday/paint/view/ThePaintFragment;

    .line 182
    .line 183
    invoke-virtual {p1, v1}, Lcom/friday/common/base/BaseFragment;->isShowLoading(Z)V

    .line 184
    .line 185
    .line 186
    iget-object p1, p0, Lcom/friday/paint/view/ThePaintFragment$initObserver$5$1;->e:Lcom/friday/paint/view/ThePaintFragment;

    .line 187
    .line 188
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 189
    .line 190
    .line 191
    move-result-object p1

    .line 192
    if-eqz p1, :cond_6

    .line 193
    .line 194
    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    .line 195
    .line 196
    .line 197
    :cond_6
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 198
    .line 199
    return-object p1
.end method
