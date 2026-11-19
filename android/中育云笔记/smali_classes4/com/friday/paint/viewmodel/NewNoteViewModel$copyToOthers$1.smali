.class final Lcom/friday/paint/viewmodel/NewNoteViewModel$copyToOthers$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/paint/viewmodel/NewNoteViewModel;->t()V
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
    c = "com.friday.paint.viewmodel.NewNoteViewModel$copyToOthers$1"
    f = "NewNoteViewModel.kt"
    l = {
        0x185,
        0x187,
        0x189
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:Ljava/lang/Object;

.field public d:I

.field public final synthetic e:Lcom/friday/paint/viewmodel/NewNoteViewModel;


# direct methods
.method public constructor <init>(Lcom/friday/paint/viewmodel/NewNoteViewModel;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel$copyToOthers$1;->e:Lcom/friday/paint/viewmodel/NewNoteViewModel;

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
    new-instance p1, Lcom/friday/paint/viewmodel/NewNoteViewModel$copyToOthers$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel$copyToOthers$1;->e:Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lcom/friday/paint/viewmodel/NewNoteViewModel$copyToOthers$1;-><init>(Lcom/friday/paint/viewmodel/NewNoteViewModel;Lvc/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/friday/paint/viewmodel/NewNoteViewModel$copyToOthers$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/paint/viewmodel/NewNoteViewModel$copyToOthers$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/paint/viewmodel/NewNoteViewModel$copyToOthers$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/paint/viewmodel/NewNoteViewModel$copyToOthers$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel$copyToOthers$1;->d:I

    .line 6
    .line 7
    const/4 v2, 0x3

    .line 8
    const/4 v3, 0x2

    .line 9
    const/4 v4, 0x1

    .line 10
    if-eqz v1, :cond_3

    .line 11
    .line 12
    if-eq v1, v4, :cond_2

    .line 13
    .line 14
    if-eq v1, v3, :cond_1

    .line 15
    .line 16
    if-ne v1, v2, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 20
    .line 21
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 22
    .line 23
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw p1

    .line 27
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel$copyToOthers$1;->c:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v0, Ljava/util/List;

    .line 30
    .line 31
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    move-object v10, p0

    .line 35
    goto/16 :goto_3

    .line 36
    .line 37
    :cond_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    move-object v10, p0

    .line 41
    goto :goto_1

    .line 42
    :cond_3
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    iget-object p1, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel$copyToOthers$1;->e:Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 46
    .line 47
    invoke-static {p1}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->k(Lcom/friday/paint/viewmodel/NewNoteViewModel;)Lcom/friday/common/dao/ResourceDao;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    iget-object p1, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel$copyToOthers$1;->e:Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 52
    .line 53
    invoke-virtual {p1}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->G()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    iget-object p1, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel$copyToOthers$1;->e:Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 58
    .line 59
    invoke-virtual {p1}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->B()Landroidx/lifecycle/MutableLiveData;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-virtual {p1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-static {p1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    check-cast p1, Ljava/lang/Number;

    .line 71
    .line 72
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 73
    .line 74
    .line 75
    move-result v7

    .line 76
    iput v4, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel$copyToOthers$1;->d:I

    .line 77
    .line 78
    const-wide/16 v8, 0x0

    .line 79
    .line 80
    const/4 v11, 0x4

    .line 81
    const/4 v12, 0x0

    .line 82
    move-object v10, p0

    .line 83
    invoke-static/range {v5 .. v12}, Lcom/friday/common/dao/ResourceDao;->M(Lcom/friday/common/dao/ResourceDao;Ljava/lang/String;IJLvc/c;ILjava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    if-ne p1, v0, :cond_4

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_4
    :goto_1
    check-cast p1, Ljava/util/List;

    .line 91
    .line 92
    move-object v1, p1

    .line 93
    check-cast v1, Ljava/util/Collection;

    .line 94
    .line 95
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    if-nez v1, :cond_5

    .line 100
    .line 101
    iget-object v1, v10, Lcom/friday/paint/viewmodel/NewNoteViewModel$copyToOthers$1;->e:Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 102
    .line 103
    invoke-static {v1}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->n(Lcom/friday/paint/viewmodel/NewNoteViewModel;)Lvd/k;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    invoke-static {p1}, Lkotlin/Result;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    invoke-static {v2}, Lkotlin/Result;->a(Ljava/lang/Object;)Lkotlin/Result;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    invoke-static {p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    iput-object p1, v10, Lcom/friday/paint/viewmodel/NewNoteViewModel$copyToOthers$1;->c:Ljava/lang/Object;

    .line 120
    .line 121
    iput v3, v10, Lcom/friday/paint/viewmodel/NewNoteViewModel$copyToOthers$1;->d:I

    .line 122
    .line 123
    invoke-interface {v1, v2, p0}, Lvd/k;->emit(Ljava/lang/Object;Lvc/c;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    if-ne p1, v0, :cond_6

    .line 128
    .line 129
    goto :goto_2

    .line 130
    :cond_5
    iget-object v1, v10, Lcom/friday/paint/viewmodel/NewNoteViewModel$copyToOthers$1;->e:Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 131
    .line 132
    invoke-static {v1}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->n(Lcom/friday/paint/viewmodel/NewNoteViewModel;)Lvd/k;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    sget-object v3, Lkotlin/Result;->d:Lkotlin/Result$a;

    .line 137
    .line 138
    new-instance v3, Ljava/lang/Exception;

    .line 139
    .line 140
    const-string v4, "\u590d\u5236\u5931\u8d25\uff0c\u8bf7\u7a0d\u540e\u518d\u8bd5"

    .line 141
    .line 142
    invoke-direct {v3, v4}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    invoke-static {v3}, Lkotlin/b;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v3

    .line 149
    invoke-static {v3}, Lkotlin/Result;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v3

    .line 153
    invoke-static {v3}, Lkotlin/Result;->a(Ljava/lang/Object;)Lkotlin/Result;

    .line 154
    .line 155
    .line 156
    move-result-object v3

    .line 157
    invoke-static {p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    iput-object p1, v10, Lcom/friday/paint/viewmodel/NewNoteViewModel$copyToOthers$1;->c:Ljava/lang/Object;

    .line 162
    .line 163
    iput v2, v10, Lcom/friday/paint/viewmodel/NewNoteViewModel$copyToOthers$1;->d:I

    .line 164
    .line 165
    invoke-interface {v1, v3, p0}, Lvd/k;->emit(Ljava/lang/Object;Lvc/c;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    if-ne p1, v0, :cond_6

    .line 170
    .line 171
    :goto_2
    return-object v0

    .line 172
    :cond_6
    :goto_3
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 173
    .line 174
    return-object p1
.end method
