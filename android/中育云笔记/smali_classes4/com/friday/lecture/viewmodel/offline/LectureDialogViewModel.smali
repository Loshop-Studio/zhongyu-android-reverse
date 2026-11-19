.class public final Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel;
.super Lcom/friday/common/base/BaseViewModel;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# instance fields
.field public final b:Lvd/l;

.field public final c:Lvd/u;

.field public final d:Lvd/l;

.field public final e:Lvd/u;

.field public final f:Lvd/l;

.field public final g:Lvd/u;

.field public final h:Landroidx/lifecycle/MutableLiveData;

.field public final i:Landroidx/lifecycle/MutableLiveData;

.field public j:Landroid/content/Intent;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/friday/common/base/BaseViewModel;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/friday/lecture/model/ConnectMode$Code;->INSTANCE:Lcom/friday/lecture/model/ConnectMode$Code;

    .line 5
    .line 6
    invoke-static {v0}, Lvd/v;->a(Ljava/lang/Object;)Lvd/l;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel;->b:Lvd/l;

    .line 11
    .line 12
    invoke-static {v0}, Lvd/e;->b(Lvd/l;)Lvd/u;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iput-object v0, p0, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel;->c:Lvd/u;

    .line 17
    .line 18
    invoke-static {}, Lrc/w;->n()Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-static {v0}, Lvd/v;->a(Ljava/lang/Object;)Lvd/l;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iput-object v0, p0, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel;->d:Lvd/l;

    .line 27
    .line 28
    invoke-static {v0}, Lvd/e;->b(Lvd/l;)Lvd/u;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iput-object v0, p0, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel;->e:Lvd/u;

    .line 33
    .line 34
    invoke-static {}, Lrc/w;->n()Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-static {v0}, Lvd/v;->a(Ljava/lang/Object;)Lvd/l;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    iput-object v0, p0, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel;->f:Lvd/l;

    .line 43
    .line 44
    invoke-static {v0}, Lvd/e;->b(Lvd/l;)Lvd/u;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iput-object v0, p0, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel;->g:Lvd/u;

    .line 49
    .line 50
    new-instance v0, Landroidx/lifecycle/MutableLiveData;

    .line 51
    .line 52
    invoke-direct {v0}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 53
    .line 54
    .line 55
    iput-object v0, p0, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel;->h:Landroidx/lifecycle/MutableLiveData;

    .line 56
    .line 57
    new-instance v0, Landroidx/lifecycle/MutableLiveData;

    .line 58
    .line 59
    invoke-direct {v0}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 60
    .line 61
    .line 62
    iput-object v0, p0, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel;->i:Landroidx/lifecycle/MutableLiveData;

    .line 63
    .line 64
    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    const-string v1, "ConnectMode"

    .line 69
    .line 70
    invoke-virtual {v0, v1}, Lcom/blankj/utilcode/util/SPUtils;->getInt(Ljava/lang/String;)I

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    invoke-static {v0}, Lcom/friday/lecture/model/ConnectionStatusKt;->convert2ConnectMode(I)Lcom/friday/lecture/model/ConnectMode;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-virtual {p0, v0}, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel;->i(Lcom/friday/lecture/model/ConnectMode;)V

    .line 79
    .line 80
    .line 81
    return-void
.end method

.method public static final synthetic e(Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel;)Lvd/l;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel;->b:Lvd/l;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic f(Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel;)Lvd/l;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel;->f:Lvd/l;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic g(Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel;)Lvd/l;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel;->d:Lvd/l;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic h(Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel;->w()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final A()V
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel;->y(Z)V

    .line 3
    .line 4
    .line 5
    sget-object v0, Lcom/friday/common/helper/c;->a:Lcom/friday/common/helper/c;

    .line 6
    .line 7
    const-string v1, "\u8bfe\u5802\u7b14\u8bb0"

    .line 8
    .line 9
    sget-object v2, Lcom/friday/common/entity/FromPage;->FROM_CLASS:Lcom/friday/common/entity/FromPage;

    .line 10
    .line 11
    const-string v3, ""

    .line 12
    .line 13
    const-string v4, "0"

    .line 14
    .line 15
    invoke-virtual {v0, v3, v4, v1, v2}, Lcom/friday/common/helper/c;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/friday/common/entity/FromPage;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final i(Lcom/friday/lecture/model/ConnectMode;)V
    .locals 7

    .line 1
    const-string v0, "mode"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lsd/i0;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    new-instance v4, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel$changeConnectMode$1;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-direct {v4, p0, p1, v0}, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel$changeConnectMode$1;-><init>(Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel;Lcom/friday/lecture/model/ConnectMode;Lvc/c;)V

    .line 14
    .line 15
    .line 16
    const/4 v5, 0x3

    .line 17
    const/4 v6, 0x0

    .line 18
    const/4 v2, 0x0

    .line 19
    const/4 v3, 0x0

    .line 20
    invoke-static/range {v1 .. v6}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final j(Lhd/l;)V
    .locals 10

    .line 1
    const-string v0, "successCallback"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel;->v()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel;->e:Lvd/u;

    .line 10
    .line 11
    invoke-interface {v0}, Lvd/u;->getValue()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Ljava/util/List;

    .line 16
    .line 17
    move-object v1, v0

    .line 18
    check-cast v1, Ljava/lang/Iterable;

    .line 19
    .line 20
    const/16 v8, 0x3e

    .line 21
    .line 22
    const/4 v9, 0x0

    .line 23
    const-string v2, ""

    .line 24
    .line 25
    const/4 v3, 0x0

    .line 26
    const/4 v4, 0x0

    .line 27
    const/4 v5, 0x0

    .line 28
    const/4 v6, 0x0

    .line 29
    const/4 v7, 0x0

    .line 30
    invoke-static/range {v1 .. v9}, Lrc/g0;->w0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lhd/l;ILjava/lang/Object;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    iget-object v2, p0, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel;->c:Lvd/u;

    .line 35
    .line 36
    invoke-interface {v2}, Lvd/u;->getValue()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    sget-object v3, Lcom/friday/lecture/model/ConnectMode$IP;->INSTANCE:Lcom/friday/lecture/model/ConnectMode$IP;

    .line 41
    .line 42
    invoke-static {v2, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-eqz v2, :cond_0

    .line 47
    .line 48
    invoke-virtual {p0, v0}, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel;->k(Ljava/util/List;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    sget-object v2, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 53
    .line 54
    invoke-virtual {v2}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    invoke-virtual {v2, v0}, Lcom/friday/common/helper/b;->C(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-interface {p1, v1}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :cond_0
    invoke-virtual {p0, v0}, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel;->l(Ljava/util/List;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    sget-object v2, Lcom/friday/common/helper/e;->k:Lcom/friday/common/helper/e$a;

    .line 70
    .line 71
    invoke-virtual {v2}, Lcom/friday/common/helper/e$a;->a()Lcom/friday/common/helper/e;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    invoke-virtual {v3, v0}, Lcom/friday/common/helper/e;->i(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v2}, Lcom/friday/common/helper/e$a;->a()Lcom/friday/common/helper/e;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    new-instance v2, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel$connectClass$1;

    .line 83
    .line 84
    invoke-direct {v2, p0, p1, v1}, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel$connectClass$1;-><init>(Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel;Lhd/l;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0, v2}, Lcom/friday/common/helper/e;->o(Lcom/friday/common/helper/e$b;)V

    .line 88
    .line 89
    .line 90
    return-void
.end method

.method public final k(Ljava/util/List;)Ljava/lang/String;
    .locals 9

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {v0}, Lcom/blankj/utilcode/util/NetworkUtils;->getIPAddress(Z)Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    invoke-static {v1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    const-string v7, "."

    .line 10
    .line 11
    filled-new-array {v7}, [Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    const/4 v5, 0x6

    .line 16
    const/4 v6, 0x0

    .line 17
    const/4 v3, 0x0

    .line 18
    const/4 v4, 0x0

    .line 19
    invoke-static/range {v1 .. v6}, Lqd/c0;->I0(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    const/4 v2, 0x0

    .line 24
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    new-instance v5, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    const/16 v4, 0x10

    .line 48
    .line 49
    invoke-static {v4}, Lqd/a;->a(I)I

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    invoke-static {v3, v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    const/4 v5, 0x2

    .line 58
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    const/4 v6, 0x3

    .line 63
    invoke-interface {p1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v6

    .line 67
    new-instance v8, Ljava/lang/StringBuilder;

    .line 68
    .line 69
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v5

    .line 82
    invoke-static {v4}, Lqd/a;->a(I)I

    .line 83
    .line 84
    .line 85
    move-result v6

    .line 86
    invoke-static {v5, v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    .line 87
    .line 88
    .line 89
    move-result v5

    .line 90
    sub-int/2addr v5, v3

    .line 91
    add-int/lit16 v5, v5, 0x100

    .line 92
    .line 93
    rem-int/lit16 v5, v5, 0x100

    .line 94
    .line 95
    const/4 v6, 0x4

    .line 96
    invoke-interface {p1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v6

    .line 100
    const/4 v8, 0x5

    .line 101
    invoke-interface {p1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    new-instance v8, Ljava/lang/StringBuilder;

    .line 106
    .line 107
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v8, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    invoke-static {v4}, Lqd/a;->a(I)I

    .line 121
    .line 122
    .line 123
    move-result v4

    .line 124
    invoke-static {p1, v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    .line 125
    .line 126
    .line 127
    move-result p1

    .line 128
    add-int/2addr p1, v3

    .line 129
    add-int/lit16 p1, p1, 0x100

    .line 130
    .line 131
    rem-int/lit16 p1, p1, 0x100

    .line 132
    .line 133
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    new-instance v1, Ljava/lang/StringBuilder;

    .line 142
    .line 143
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    return-object p1
.end method

.method public final l(Ljava/util/List;)Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuffer;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Iterable;

    .line 7
    .line 8
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    const-string v0, "toString(...)"

    .line 33
    .line 34
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    return-object p1
.end method

.method public final m()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel;->y(Z)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public final n()Lvd/u;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel;->c:Lvd/u;

    .line 2
    .line 3
    return-object v0
.end method

.method public final o()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel;->i:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final p()Lvd/u;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel;->g:Lvd/u;

    .line 2
    .line 3
    return-object v0
.end method

.method public final q()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel;->h:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final r()Lvd/u;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel;->e:Lvd/u;

    .line 2
    .line 3
    return-object v0
.end method

.method public final s()V
    .locals 2

    .line 1
    const-class v0, Lcom/friday/common/activity/PusherService;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/blankj/utilcode/util/ServiceUtils;->isServiceRunning(Ljava/lang/Class;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-static {v0}, Lcom/blankj/utilcode/util/ServiceUtils;->stopService(Ljava/lang/Class;)Z

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-virtual {p0}, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel;->m()V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final t(Landroid/content/Intent;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel;->j:Landroid/content/Intent;

    .line 2
    .line 3
    return-void
.end method

.method public final u()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel;->h:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->hasActiveObservers()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel;->h:Landroidx/lifecycle/MutableLiveData;

    .line 10
    .line 11
    new-instance v1, Le2/a;

    .line 12
    .line 13
    sget-object v2, Lcom/friday/lecture/model/ConnectionStatus;->CONNECTED:Lcom/friday/lecture/model/ConnectionStatus;

    .line 14
    .line 15
    invoke-direct {v1, v2}, Le2/a;-><init>(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    iget-object v0, p0, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel;->h:Landroidx/lifecycle/MutableLiveData;

    .line 23
    .line 24
    new-instance v1, Le2/a;

    .line 25
    .line 26
    sget-object v2, Lcom/friday/lecture/model/ConnectionStatus;->CONNECTED:Lcom/friday/lecture/model/ConnectionStatus;

    .line 27
    .line 28
    invoke-direct {v1, v2}, Le2/a;-><init>(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    const/4 v2, 0x1

    .line 32
    invoke-virtual {v1, v2}, Le2/a;->c(Z)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v1}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public final v()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel;->h:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->hasActiveObservers()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel;->h:Landroidx/lifecycle/MutableLiveData;

    .line 10
    .line 11
    new-instance v1, Le2/a;

    .line 12
    .line 13
    sget-object v2, Lcom/friday/lecture/model/ConnectionStatus;->CONNECTING:Lcom/friday/lecture/model/ConnectionStatus;

    .line 14
    .line 15
    invoke-direct {v1, v2}, Le2/a;-><init>(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    iget-object v0, p0, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel;->h:Landroidx/lifecycle/MutableLiveData;

    .line 23
    .line 24
    new-instance v1, Le2/a;

    .line 25
    .line 26
    sget-object v2, Lcom/friday/lecture/model/ConnectionStatus;->CONNECTING:Lcom/friday/lecture/model/ConnectionStatus;

    .line 27
    .line 28
    invoke-direct {v1, v2}, Le2/a;-><init>(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    const/4 v2, 0x1

    .line 32
    invoke-virtual {v1, v2}, Le2/a;->c(Z)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v1}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public final w()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel;->h:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->hasActiveObservers()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel;->h:Landroidx/lifecycle/MutableLiveData;

    .line 10
    .line 11
    new-instance v1, Le2/a;

    .line 12
    .line 13
    sget-object v2, Lcom/friday/lecture/model/ConnectionStatus;->CONNECTION_FAILED:Lcom/friday/lecture/model/ConnectionStatus;

    .line 14
    .line 15
    invoke-direct {v1, v2}, Le2/a;-><init>(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    iget-object v0, p0, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel;->h:Landroidx/lifecycle/MutableLiveData;

    .line 23
    .line 24
    new-instance v1, Le2/a;

    .line 25
    .line 26
    sget-object v2, Lcom/friday/lecture/model/ConnectionStatus;->CONNECTION_FAILED:Lcom/friday/lecture/model/ConnectionStatus;

    .line 27
    .line 28
    invoke-direct {v1, v2}, Le2/a;-><init>(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    const/4 v2, 0x1

    .line 32
    invoke-virtual {v1, v2}, Le2/a;->c(Z)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v1}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public final x()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel;->h:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->hasActiveObservers()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel;->h:Landroidx/lifecycle/MutableLiveData;

    .line 10
    .line 11
    new-instance v1, Le2/a;

    .line 12
    .line 13
    sget-object v2, Lcom/friday/lecture/model/ConnectionStatus;->DISCONNECTED:Lcom/friday/lecture/model/ConnectionStatus;

    .line 14
    .line 15
    invoke-direct {v1, v2}, Le2/a;-><init>(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    iget-object v0, p0, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel;->h:Landroidx/lifecycle/MutableLiveData;

    .line 23
    .line 24
    new-instance v1, Le2/a;

    .line 25
    .line 26
    sget-object v2, Lcom/friday/lecture/model/ConnectionStatus;->DISCONNECTED:Lcom/friday/lecture/model/ConnectionStatus;

    .line 27
    .line 28
    invoke-direct {v1, v2}, Le2/a;-><init>(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    const/4 v2, 0x1

    .line 32
    invoke-virtual {v1, v2}, Le2/a;->c(Z)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public final y(Z)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel;->u()V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    invoke-virtual {p0}, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel;->x()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final z(Lcom/friday/lecture/model/KeyboardData;)V
    .locals 7

    .line 1
    const-string v0, "keyboardData"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/friday/lecture/model/KeyboardData;->isValue()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_3

    .line 11
    .line 12
    iget-object v0, p0, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel;->d:Lvd/l;

    .line 13
    .line 14
    :cond_0
    invoke-interface {v0}, Lvd/l;->getValue()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    move-object v2, v1

    .line 19
    check-cast v2, Ljava/util/List;

    .line 20
    .line 21
    check-cast v2, Ljava/lang/Iterable;

    .line 22
    .line 23
    new-instance v3, Ljava/util/ArrayList;

    .line 24
    .line 25
    const/16 v4, 0xa

    .line 26
    .line 27
    invoke-static {v2, v4}, Lrc/x;->x(Ljava/lang/Iterable;I)I

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 32
    .line 33
    .line 34
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    const/4 v4, 0x0

    .line 39
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v5

    .line 43
    if-eqz v5, :cond_2

    .line 44
    .line 45
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    check-cast v5, Ljava/lang/String;

    .line 50
    .line 51
    if-nez v4, :cond_1

    .line 52
    .line 53
    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    .line 54
    .line 55
    .line 56
    move-result v6

    .line 57
    if-nez v6, :cond_1

    .line 58
    .line 59
    invoke-virtual {p1}, Lcom/friday/lecture/model/KeyboardData;->getValue()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v5

    .line 63
    const/4 v4, 0x1

    .line 64
    :cond_1
    invoke-interface {v3, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_2
    invoke-interface {v0, v1, v3}, Lvd/l;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    if-eqz v1, :cond_0

    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_3
    iget-object p1, p0, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel;->d:Lvd/l;

    .line 76
    .line 77
    :cond_4
    invoke-interface {p1}, Lvd/l;->getValue()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    move-object v1, v0

    .line 82
    check-cast v1, Ljava/util/List;

    .line 83
    .line 84
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    invoke-interface {v1, v2}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    :cond_5
    invoke-interface {v2}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 93
    .line 94
    .line 95
    move-result v3

    .line 96
    const/4 v4, -0x1

    .line 97
    if-eqz v3, :cond_6

    .line 98
    .line 99
    invoke-interface {v2}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    check-cast v3, Ljava/lang/String;

    .line 104
    .line 105
    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    .line 106
    .line 107
    .line 108
    move-result v3

    .line 109
    if-lez v3, :cond_5

    .line 110
    .line 111
    invoke-interface {v2}, Ljava/util/ListIterator;->nextIndex()I

    .line 112
    .line 113
    .line 114
    move-result v2

    .line 115
    goto :goto_1

    .line 116
    :cond_6
    move v2, v4

    .line 117
    :goto_1
    if-eq v2, v4, :cond_7

    .line 118
    .line 119
    check-cast v1, Ljava/util/Collection;

    .line 120
    .line 121
    invoke-static {v1}, Lrc/g0;->a1(Ljava/util/Collection;)Ljava/util/List;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    const-string v3, ""

    .line 126
    .line 127
    invoke-interface {v1, v2, v3}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    :cond_7
    invoke-interface {p1, v0, v1}, Lvd/l;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    if-eqz v0, :cond_4

    .line 135
    .line 136
    :goto_2
    return-void
.end method
