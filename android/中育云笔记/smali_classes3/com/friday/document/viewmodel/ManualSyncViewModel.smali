.class public final Lcom/friday/document/viewmodel/ManualSyncViewModel;
.super Lcom/friday/common/base/BaseViewModel;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# instance fields
.field public final b:Lcom/friday/common/dao/FileDao;

.field public final c:Lcom/friday/document/service/FileManager;

.field public final d:Landroidx/lifecycle/MutableLiveData;

.field public final e:Lvd/l;

.field public final f:Lvd/u;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/friday/common/dao/FileDao;Lcom/friday/document/service/FileManager;)V
    .locals 1

    .line 1
    const-string v0, "fileDao"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "fileManager"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Lcom/friday/common/base/BaseViewModel;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/friday/document/viewmodel/ManualSyncViewModel;->b:Lcom/friday/common/dao/FileDao;

    .line 15
    .line 16
    iput-object p2, p0, Lcom/friday/document/viewmodel/ManualSyncViewModel;->c:Lcom/friday/document/service/FileManager;

    .line 17
    .line 18
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 19
    .line 20
    invoke-direct {p1}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Lcom/friday/document/viewmodel/ManualSyncViewModel;->d:Landroidx/lifecycle/MutableLiveData;

    .line 24
    .line 25
    const/4 p1, 0x0

    .line 26
    invoke-static {p1}, Lvd/v;->a(Ljava/lang/Object;)Lvd/l;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iput-object p1, p0, Lcom/friday/document/viewmodel/ManualSyncViewModel;->e:Lvd/l;

    .line 31
    .line 32
    invoke-static {p1}, Lvd/e;->b(Lvd/l;)Lvd/u;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    iput-object p1, p0, Lcom/friday/document/viewmodel/ManualSyncViewModel;->f:Lvd/u;

    .line 37
    .line 38
    return-void
.end method

.method public static final synthetic e(Lcom/friday/document/viewmodel/ManualSyncViewModel;)Lvd/l;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/document/viewmodel/ManualSyncViewModel;->e:Lvd/l;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic f(Lcom/friday/document/viewmodel/ManualSyncViewModel;)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/document/viewmodel/ManualSyncViewModel;->m()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic g(Lcom/friday/document/viewmodel/ManualSyncViewModel;)J
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/friday/document/viewmodel/ManualSyncViewModel;->o()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    return-wide v0
.end method


# virtual methods
.method public final h()V
    .locals 6

    .line 1
    new-instance v1, Lcom/friday/document/viewmodel/ManualSyncViewModel$findSyncFailedList$1;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {v1, p0, v0}, Lcom/friday/document/viewmodel/ManualSyncViewModel$findSyncFailedList$1;-><init>(Lcom/friday/document/viewmodel/ManualSyncViewModel;Lvc/c;)V

    .line 5
    .line 6
    .line 7
    new-instance v2, Lcom/friday/document/viewmodel/ManualSyncViewModel$findSyncFailedList$2;

    .line 8
    .line 9
    invoke-direct {v2, p0, v0}, Lcom/friday/document/viewmodel/ManualSyncViewModel$findSyncFailedList$2;-><init>(Lcom/friday/document/viewmodel/ManualSyncViewModel;Lvc/c;)V

    .line 10
    .line 11
    .line 12
    const/4 v4, 0x4

    .line 13
    const/4 v5, 0x0

    .line 14
    const/4 v3, 0x0

    .line 15
    move-object v0, p0

    .line 16
    invoke-static/range {v0 .. v5}, Lcom/friday/common/base/BaseViewModel;->c(Lcom/friday/common/base/BaseViewModel;Lhd/p;Lhd/p;Lhd/a;ILjava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final i()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/viewmodel/ManualSyncViewModel;->d:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final j()Lcom/friday/common/dao/FileDao;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/viewmodel/ManualSyncViewModel;->b:Lcom/friday/common/dao/FileDao;

    .line 2
    .line 3
    return-object v0
.end method

.method public final k()Lcom/friday/document/service/FileManager;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/viewmodel/ManualSyncViewModel;->c:Lcom/friday/document/service/FileManager;

    .line 2
    .line 3
    return-object v0
.end method

.method public final l()Lvd/u;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/viewmodel/ManualSyncViewModel;->f:Lvd/u;

    .line 2
    .line 3
    return-object v0
.end method

.method public final m()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lcom/friday/common/helper/b;->w()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method

.method public final n(Lvc/c;)Ljava/lang/Object;
    .locals 11

    .line 1
    instance-of v0, p1, Lcom/friday/document/viewmodel/ManualSyncViewModel$manualSyncFile$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lcom/friday/document/viewmodel/ManualSyncViewModel$manualSyncFile$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/friday/document/viewmodel/ManualSyncViewModel$manualSyncFile$1;->k:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcom/friday/document/viewmodel/ManualSyncViewModel$manualSyncFile$1;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/friday/document/viewmodel/ManualSyncViewModel$manualSyncFile$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lcom/friday/document/viewmodel/ManualSyncViewModel$manualSyncFile$1;-><init>(Lcom/friday/document/viewmodel/ManualSyncViewModel;Lvc/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lcom/friday/document/viewmodel/ManualSyncViewModel$manualSyncFile$1;->i:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/friday/document/viewmodel/ManualSyncViewModel$manualSyncFile$1;->k:I

    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    const/4 v4, 0x1

    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    if-ne v2, v4, :cond_1

    .line 38
    .line 39
    iget v2, v0, Lcom/friday/document/viewmodel/ManualSyncViewModel$manualSyncFile$1;->g:I

    .line 40
    .line 41
    iget-object v5, v0, Lcom/friday/document/viewmodel/ManualSyncViewModel$manualSyncFile$1;->f:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v5, Lcom/friday/document/model/ManualSyncEntity;

    .line 44
    .line 45
    iget-object v5, v0, Lcom/friday/document/viewmodel/ManualSyncViewModel$manualSyncFile$1;->d:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v5, Ljava/util/Iterator;

    .line 48
    .line 49
    iget-object v6, v0, Lcom/friday/document/viewmodel/ManualSyncViewModel$manualSyncFile$1;->c:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v6, Ljava/lang/Iterable;

    .line 52
    .line 53
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 58
    .line 59
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 60
    .line 61
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw p1

    .line 65
    :cond_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    iget-object p1, p0, Lcom/friday/document/viewmodel/ManualSyncViewModel;->c:Lcom/friday/document/service/FileManager;

    .line 69
    .line 70
    invoke-virtual {p1}, Lcom/friday/document/service/FileManager;->t()V

    .line 71
    .line 72
    .line 73
    iget-object p1, p0, Lcom/friday/document/viewmodel/ManualSyncViewModel;->d:Landroidx/lifecycle/MutableLiveData;

    .line 74
    .line 75
    invoke-virtual {p1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    check-cast p1, Ljava/util/List;

    .line 80
    .line 81
    if-eqz p1, :cond_6

    .line 82
    .line 83
    check-cast p1, Ljava/lang/Iterable;

    .line 84
    .line 85
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    move-object v6, p1

    .line 90
    move-object v5, v2

    .line 91
    move v2, v3

    .line 92
    :cond_3
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 93
    .line 94
    .line 95
    move-result p1

    .line 96
    if-eqz p1, :cond_6

    .line 97
    .line 98
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    move-object v7, p1

    .line 103
    check-cast v7, Lcom/friday/document/model/ManualSyncEntity;

    .line 104
    .line 105
    sget-object v8, Lf2/c;->a:Lf2/c;

    .line 106
    .line 107
    invoke-virtual {v8}, Lf2/c;->e()Z

    .line 108
    .line 109
    .line 110
    move-result v8

    .line 111
    if-nez v8, :cond_4

    .line 112
    .line 113
    const-string p1, "\u7f51\u7edc\u8fde\u63a5\u5931\u8d25"

    .line 114
    .line 115
    invoke-static {p1}, Lz1/b;->i(Ljava/lang/CharSequence;)V

    .line 116
    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_4
    invoke-virtual {v7, v4}, Lcom/friday/document/model/ManualSyncEntity;->setSyncState(I)V

    .line 120
    .line 121
    .line 122
    iget-object v8, p0, Lcom/friday/document/viewmodel/ManualSyncViewModel;->e:Lvd/l;

    .line 123
    .line 124
    :cond_5
    invoke-interface {v8}, Lvd/l;->getValue()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v9

    .line 128
    new-instance v10, Ljava/lang/Object;

    .line 129
    .line 130
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 131
    .line 132
    .line 133
    invoke-interface {v8, v9, v10}, Lvd/l;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result v9

    .line 137
    if-eqz v9, :cond_5

    .line 138
    .line 139
    invoke-static {}, Lsd/r0;->b()Lsd/e0;

    .line 140
    .line 141
    .line 142
    move-result-object v8

    .line 143
    new-instance v9, Lcom/friday/document/viewmodel/ManualSyncViewModel$manualSyncFile$2$2;

    .line 144
    .line 145
    const/4 v10, 0x0

    .line 146
    invoke-direct {v9, p0, v7, v10}, Lcom/friday/document/viewmodel/ManualSyncViewModel$manualSyncFile$2$2;-><init>(Lcom/friday/document/viewmodel/ManualSyncViewModel;Lcom/friday/document/model/ManualSyncEntity;Lvc/c;)V

    .line 147
    .line 148
    .line 149
    invoke-static {v6}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v10

    .line 153
    iput-object v10, v0, Lcom/friday/document/viewmodel/ManualSyncViewModel$manualSyncFile$1;->c:Ljava/lang/Object;

    .line 154
    .line 155
    iput-object v5, v0, Lcom/friday/document/viewmodel/ManualSyncViewModel$manualSyncFile$1;->d:Ljava/lang/Object;

    .line 156
    .line 157
    invoke-static {p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    iput-object p1, v0, Lcom/friday/document/viewmodel/ManualSyncViewModel$manualSyncFile$1;->e:Ljava/lang/Object;

    .line 162
    .line 163
    invoke-static {v7}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    iput-object p1, v0, Lcom/friday/document/viewmodel/ManualSyncViewModel$manualSyncFile$1;->f:Ljava/lang/Object;

    .line 168
    .line 169
    iput v2, v0, Lcom/friday/document/viewmodel/ManualSyncViewModel$manualSyncFile$1;->g:I

    .line 170
    .line 171
    iput v3, v0, Lcom/friday/document/viewmodel/ManualSyncViewModel$manualSyncFile$1;->h:I

    .line 172
    .line 173
    iput v4, v0, Lcom/friday/document/viewmodel/ManualSyncViewModel$manualSyncFile$1;->k:I

    .line 174
    .line 175
    invoke-static {v8, v9, v0}, Lsd/f;->g(Lkotlin/coroutines/d;Lhd/p;Lvc/c;)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    if-ne p1, v1, :cond_3

    .line 180
    .line 181
    return-object v1

    .line 182
    :cond_6
    iget-object p1, p0, Lcom/friday/document/viewmodel/ManualSyncViewModel;->c:Lcom/friday/document/service/FileManager;

    .line 183
    .line 184
    invoke-virtual {p1}, Lcom/friday/document/service/FileManager;->E()V

    .line 185
    .line 186
    .line 187
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 188
    .line 189
    return-object p1
.end method

.method public final o()J
    .locals 2

    .line 1
    sget-object v0, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lcom/friday/common/helper/b;->t()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    return-wide v0
.end method
