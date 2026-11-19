.class final Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel$changeConnectMode$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel;->i(Lcom/friday/lecture/model/ConnectMode;)V
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
    c = "com.friday.lecture.viewmodel.offline.LectureDialogViewModel$changeConnectMode$1"
    f = "LectureDialogViewModel.kt"
    l = {
        0x3f,
        0x41,
        0x47
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public final synthetic d:Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel;

.field public final synthetic e:Lcom/friday/lecture/model/ConnectMode;


# direct methods
.method public constructor <init>(Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel;Lcom/friday/lecture/model/ConnectMode;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel$changeConnectMode$1;->d:Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel$changeConnectMode$1;->e:Lcom/friday/lecture/model/ConnectMode;

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
    new-instance p1, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel$changeConnectMode$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel$changeConnectMode$1;->d:Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel$changeConnectMode$1;->e:Lcom/friday/lecture/model/ConnectMode;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel$changeConnectMode$1;-><init>(Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel;Lcom/friday/lecture/model/ConnectMode;Lvc/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel$changeConnectMode$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel$changeConnectMode$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel$changeConnectMode$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel$changeConnectMode$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel$changeConnectMode$1;->c:I

    .line 6
    .line 7
    const-string v2, ""

    .line 8
    .line 9
    const/4 v3, 0x3

    .line 10
    const/4 v4, 0x2

    .line 11
    const/4 v5, 0x1

    .line 12
    if-eqz v1, :cond_3

    .line 13
    .line 14
    if-eq v1, v5, :cond_2

    .line 15
    .line 16
    if-eq v1, v4, :cond_1

    .line 17
    .line 18
    if-ne v1, v3, :cond_0

    .line 19
    .line 20
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    goto/16 :goto_5

    .line 24
    .line 25
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 26
    .line 27
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 28
    .line 29
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw p1

    .line 33
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_3
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    iget-object p1, p0, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel$changeConnectMode$1;->d:Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel;

    .line 45
    .line 46
    invoke-static {p1}, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel;->e(Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel;)Lvd/l;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    iget-object v1, p0, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel$changeConnectMode$1;->e:Lcom/friday/lecture/model/ConnectMode;

    .line 51
    .line 52
    iput v5, p0, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel$changeConnectMode$1;->c:I

    .line 53
    .line 54
    invoke-interface {p1, v1, p0}, Lvd/k;->emit(Ljava/lang/Object;Lvc/c;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    if-ne p1, v0, :cond_4

    .line 59
    .line 60
    goto :goto_4

    .line 61
    :cond_4
    :goto_0
    iget-object p1, p0, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel$changeConnectMode$1;->d:Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel;

    .line 62
    .line 63
    invoke-static {p1}, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel;->g(Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel;)Lvd/l;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    new-instance v1, Ljava/util/ArrayList;

    .line 68
    .line 69
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 70
    .line 71
    .line 72
    iget-object v5, p0, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel$changeConnectMode$1;->e:Lcom/friday/lecture/model/ConnectMode;

    .line 73
    .line 74
    invoke-virtual {v5}, Lcom/friday/lecture/model/ConnectMode;->getPasswordMaxSize()I

    .line 75
    .line 76
    .line 77
    move-result v5

    .line 78
    const/4 v6, 0x0

    .line 79
    :goto_1
    if-ge v6, v5, :cond_5

    .line 80
    .line 81
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    add-int/lit8 v6, v6, 0x1

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_5
    iput v4, p0, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel$changeConnectMode$1;->c:I

    .line 88
    .line 89
    invoke-interface {p1, v1, p0}, Lvd/k;->emit(Ljava/lang/Object;Lvc/c;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    if-ne p1, v0, :cond_6

    .line 94
    .line 95
    goto :goto_4

    .line 96
    :cond_6
    :goto_2
    iget-object p1, p0, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel$changeConnectMode$1;->d:Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel;

    .line 97
    .line 98
    invoke-static {p1}, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel;->f(Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel;)Lvd/l;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    new-instance v1, Ljava/util/ArrayList;

    .line 103
    .line 104
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 105
    .line 106
    .line 107
    iget-object v4, p0, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel$changeConnectMode$1;->e:Lcom/friday/lecture/model/ConnectMode;

    .line 108
    .line 109
    invoke-virtual {v4}, Lcom/friday/lecture/model/ConnectMode;->getKeyboardList()Ljava/util/List;

    .line 110
    .line 111
    .line 112
    move-result-object v4

    .line 113
    check-cast v4, Ljava/lang/Iterable;

    .line 114
    .line 115
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 116
    .line 117
    .line 118
    move-result-object v4

    .line 119
    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 120
    .line 121
    .line 122
    move-result v5

    .line 123
    if-eqz v5, :cond_7

    .line 124
    .line 125
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v5

    .line 129
    check-cast v5, Ljava/lang/String;

    .line 130
    .line 131
    new-instance v6, Lcom/friday/lecture/model/KeyboardData;

    .line 132
    .line 133
    invoke-direct {v6, v5}, Lcom/friday/lecture/model/KeyboardData;-><init>(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    invoke-interface {v1, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    goto :goto_3

    .line 140
    :cond_7
    new-instance v4, Lcom/friday/lecture/model/KeyboardData;

    .line 141
    .line 142
    invoke-direct {v4, v2}, Lcom/friday/lecture/model/KeyboardData;-><init>(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    iput v3, p0, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel$changeConnectMode$1;->c:I

    .line 149
    .line 150
    invoke-interface {p1, v1, p0}, Lvd/k;->emit(Ljava/lang/Object;Lvc/c;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    if-ne p1, v0, :cond_8

    .line 155
    .line 156
    :goto_4
    return-object v0

    .line 157
    :cond_8
    :goto_5
    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    iget-object v0, p0, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel$changeConnectMode$1;->e:Lcom/friday/lecture/model/ConnectMode;

    .line 162
    .line 163
    invoke-virtual {v0}, Lcom/friday/lecture/model/ConnectMode;->getPasswordMaxSize()I

    .line 164
    .line 165
    .line 166
    move-result v0

    .line 167
    const-string v1, "ConnectMode"

    .line 168
    .line 169
    invoke-virtual {p1, v1, v0}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;I)V

    .line 170
    .line 171
    .line 172
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 173
    .line 174
    return-object p1
.end method
