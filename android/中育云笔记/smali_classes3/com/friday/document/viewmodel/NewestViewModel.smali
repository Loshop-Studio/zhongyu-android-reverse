.class public final Lcom/friday/document/viewmodel/NewestViewModel;
.super Lcom/friday/document/viewmodel/BaseFileViewModel;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# instance fields
.field public final K:Lcom/friday/document/repositroy/FileRepository;

.field public final L:Lvd/c;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/friday/common/dao/FileDao;Lcom/friday/common/dao/ResourceDao;Ls2/a;Lcom/friday/document/service/FileManager;Lcom/friday/document/repositroy/FileRepository;)V
    .locals 12

    .line 1
    move-object/from16 v0, p5

    .line 2
    .line 3
    const-string v1, "fileDao"

    .line 4
    .line 5
    invoke-static {p1, v1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string v1, "resourceDao"

    .line 9
    .line 10
    invoke-static {p2, v1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const-string v1, "documentService"

    .line 14
    .line 15
    invoke-static {p3, v1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const-string v1, "fileManager"

    .line 19
    .line 20
    move-object/from16 v3, p4

    .line 21
    .line 22
    invoke-static {v3, v1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const-string v1, "fileRepository"

    .line 26
    .line 27
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-direct/range {p0 .. p4}, Lcom/friday/document/viewmodel/BaseFileViewModel;-><init>(Lcom/friday/common/dao/FileDao;Lcom/friday/common/dao/ResourceDao;Ls2/a;Lcom/friday/document/service/FileManager;)V

    .line 31
    .line 32
    .line 33
    iput-object v0, p0, Lcom/friday/document/viewmodel/NewestViewModel;->K:Lcom/friday/document/repositroy/FileRepository;

    .line 34
    .line 35
    new-instance v2, Landroidx/paging/Pager;

    .line 36
    .line 37
    new-instance v3, Landroidx/paging/PagingConfig;

    .line 38
    .line 39
    const/16 v10, 0x3c

    .line 40
    .line 41
    const/4 v11, 0x0

    .line 42
    const/16 v4, 0x14

    .line 43
    .line 44
    const/4 v5, 0x1

    .line 45
    const/4 v6, 0x0

    .line 46
    const/4 v7, 0x0

    .line 47
    const/4 v8, 0x0

    .line 48
    const/4 v9, 0x0

    .line 49
    invoke-direct/range {v3 .. v11}, Landroidx/paging/PagingConfig;-><init>(IIZIIIILkotlin/jvm/internal/n;)V

    .line 50
    .line 51
    .line 52
    new-instance v5, Lz2/i;

    .line 53
    .line 54
    invoke-direct {v5, p1, p0}, Lz2/i;-><init>(Lcom/friday/common/dao/FileDao;Lcom/friday/document/viewmodel/NewestViewModel;)V

    .line 55
    .line 56
    .line 57
    const/4 v6, 0x2

    .line 58
    const/4 v7, 0x0

    .line 59
    const/4 v4, 0x0

    .line 60
    invoke-direct/range {v2 .. v7}, Landroidx/paging/Pager;-><init>(Landroidx/paging/PagingConfig;Ljava/lang/Object;Lhd/a;ILkotlin/jvm/internal/n;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v2}, Landroidx/paging/Pager;->getFlow()Lvd/c;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    new-instance p2, Lcom/friday/document/viewmodel/NewestViewModel$special$$inlined$map$1;

    .line 68
    .line 69
    invoke-direct {p2, p1, p0}, Lcom/friday/document/viewmodel/NewestViewModel$special$$inlined$map$1;-><init>(Lvd/c;Lcom/friday/document/viewmodel/NewestViewModel;)V

    .line 70
    .line 71
    .line 72
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lsd/i0;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-static {p2, p1}, Landroidx/paging/CachedPagingDataKt;->cachedIn(Lvd/c;Lsd/i0;)Lvd/c;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-virtual {p0}, Lcom/friday/document/viewmodel/BaseFileViewModel;->Z()Landroidx/lifecycle/MutableLiveData;

    .line 81
    .line 82
    .line 83
    move-result-object p2

    .line 84
    invoke-static {p2}, Landroidx/lifecycle/FlowLiveDataConversions;->asFlow(Landroidx/lifecycle/LiveData;)Lvd/c;

    .line 85
    .line 86
    .line 87
    move-result-object p2

    .line 88
    invoke-virtual {p0}, Lcom/friday/document/viewmodel/BaseFileViewModel;->a0()Lvd/l;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    invoke-virtual {p0}, Lcom/friday/document/viewmodel/BaseFileViewModel;->Y()Landroidx/lifecycle/MutableLiveData;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    invoke-static {v1}, Landroidx/lifecycle/FlowLiveDataConversions;->asFlow(Landroidx/lifecycle/LiveData;)Lvd/c;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    new-instance v2, Lcom/friday/document/viewmodel/NewestViewModel$allFiles$3$1;

    .line 101
    .line 102
    const/4 v3, 0x0

    .line 103
    invoke-direct {v2, v3}, Lcom/friday/document/viewmodel/NewestViewModel$allFiles$3$1;-><init>(Lvc/c;)V

    .line 104
    .line 105
    .line 106
    invoke-static {p1, p2, v0, v1, v2}, Lvd/e;->j(Lvd/c;Lvd/c;Lvd/c;Lvd/c;Lhd/s;)Lvd/c;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lsd/i0;

    .line 111
    .line 112
    .line 113
    move-result-object p2

    .line 114
    invoke-static {p1, p2}, Landroidx/paging/CachedPagingDataKt;->cachedIn(Lvd/c;Lsd/i0;)Lvd/c;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    iput-object p1, p0, Lcom/friday/document/viewmodel/NewestViewModel;->L:Lvd/c;

    .line 119
    .line 120
    return-void
.end method

.method public static synthetic D0(Lcom/friday/common/dao/FileDao;Lcom/friday/document/viewmodel/NewestViewModel;)Landroidx/paging/PagingSource;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/document/viewmodel/NewestViewModel;->F0(Lcom/friday/common/dao/FileDao;Lcom/friday/document/viewmodel/NewestViewModel;)Landroidx/paging/PagingSource;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic E0(Lcom/friday/document/viewmodel/NewestViewModel;)Lcom/friday/document/repositroy/FileRepository;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/document/viewmodel/NewestViewModel;->K:Lcom/friday/document/repositroy/FileRepository;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final F0(Lcom/friday/common/dao/FileDao;Lcom/friday/document/viewmodel/NewestViewModel;)Landroidx/paging/PagingSource;
    .locals 2

    .line 1
    invoke-virtual {p1}, Lcom/friday/document/viewmodel/BaseFileViewModel;->X()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-interface {p0, v0, v1}, Lcom/friday/common/dao/FileDao;->o(J)Landroidx/paging/PagingSource;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method


# virtual methods
.method public final G0()V
    .locals 6

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lsd/i0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v3, Lcom/friday/document/viewmodel/NewestViewModel$cancelSyncJob$1;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v3, p0, v1}, Lcom/friday/document/viewmodel/NewestViewModel$cancelSyncJob$1;-><init>(Lcom/friday/document/viewmodel/NewestViewModel;Lvc/c;)V

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
    return-void
.end method

.method public final H0(Lcom/friday/common/entity/FileEntity;)V
    .locals 7

    .line 1
    const-string v0, "fileEntity"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v2, Lcom/friday/document/viewmodel/NewestViewModel$clearSingleNoteCache$1;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-direct {v2, p0, p1, v0}, Lcom/friday/document/viewmodel/NewestViewModel$clearSingleNoteCache$1;-><init>(Lcom/friday/document/viewmodel/NewestViewModel;Lcom/friday/common/entity/FileEntity;Lvc/c;)V

    .line 10
    .line 11
    .line 12
    new-instance v3, Lcom/friday/document/viewmodel/NewestViewModel$clearSingleNoteCache$2;

    .line 13
    .line 14
    invoke-direct {v3, v0}, Lcom/friday/document/viewmodel/NewestViewModel$clearSingleNoteCache$2;-><init>(Lvc/c;)V

    .line 15
    .line 16
    .line 17
    const/4 v5, 0x4

    .line 18
    const/4 v6, 0x0

    .line 19
    const/4 v4, 0x0

    .line 20
    move-object v1, p0

    .line 21
    invoke-static/range {v1 .. v6}, Lcom/friday/common/base/BaseViewModel;->c(Lcom/friday/common/base/BaseViewModel;Lhd/p;Lhd/p;Lhd/a;ILjava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public final I0()Lvd/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/viewmodel/NewestViewModel;->L:Lvd/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final J0(Lcom/friday/common/entity/FileEntity;)V
    .locals 7

    .line 1
    const-string v0, "fileEntity"

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
    invoke-static {}, Lsd/r0;->b()Lsd/e0;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    new-instance v4, Lcom/friday/document/viewmodel/NewestViewModel$retrySyncSingleFile$1;

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    invoke-direct {v4, p0, p1, v0}, Lcom/friday/document/viewmodel/NewestViewModel$retrySyncSingleFile$1;-><init>(Lcom/friday/document/viewmodel/NewestViewModel;Lcom/friday/common/entity/FileEntity;Lvc/c;)V

    .line 18
    .line 19
    .line 20
    const/4 v5, 0x2

    .line 21
    const/4 v6, 0x0

    .line 22
    const/4 v3, 0x0

    .line 23
    invoke-static/range {v1 .. v6}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 24
    .line 25
    .line 26
    return-void
.end method
