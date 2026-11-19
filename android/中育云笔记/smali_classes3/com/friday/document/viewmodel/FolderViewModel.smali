.class public final Lcom/friday/document/viewmodel/FolderViewModel;
.super Lcom/friday/document/viewmodel/BaseFileViewModel;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# instance fields
.field public final K:Lcom/friday/document/repositroy/FileRepository;

.field public final L:Lvd/l;

.field public final M:Lvd/c;

.field public final N:Ljava/util/List;

.field public final O:Ljava/util/List;

.field public final P:Lvd/k;

.field public final Q:Lvd/p;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/friday/common/dao/FileDao;Lcom/friday/common/dao/ResourceDao;Ls2/a;Lcom/friday/document/service/FileManager;Lcom/friday/document/repositroy/FileRepository;)V
    .locals 1

    .line 1
    const-string v0, "fileDao"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "resourceDao"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "documentService"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "fileManager"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "fileRepository"

    .line 22
    .line 23
    invoke-static {p5, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/friday/document/viewmodel/BaseFileViewModel;-><init>(Lcom/friday/common/dao/FileDao;Lcom/friday/common/dao/ResourceDao;Ls2/a;Lcom/friday/document/service/FileManager;)V

    .line 27
    .line 28
    .line 29
    iput-object p5, p0, Lcom/friday/document/viewmodel/FolderViewModel;->K:Lcom/friday/document/repositroy/FileRepository;

    .line 30
    .line 31
    new-instance p1, Lkotlin/Pair;

    .line 32
    .line 33
    sget-object p2, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 34
    .line 35
    invoke-virtual {p2}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    invoke-virtual {p2}, Lcom/friday/common/helper/b;->j()I

    .line 40
    .line 41
    .line 42
    move-result p2

    .line 43
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    const-string p3, "0"

    .line 48
    .line 49
    invoke-direct {p1, p3, p2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    invoke-static {p1}, Lvd/v;->a(Ljava/lang/Object;)Lvd/l;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    iput-object p1, p0, Lcom/friday/document/viewmodel/FolderViewModel;->L:Lvd/l;

    .line 57
    .line 58
    invoke-virtual {p0, p1}, Lcom/friday/document/viewmodel/FolderViewModel;->I0(Lvd/u;)Lvd/c;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    iput-object p1, p0, Lcom/friday/document/viewmodel/FolderViewModel;->M:Lvd/c;

    .line 63
    .line 64
    new-instance p1, Ljava/util/ArrayList;

    .line 65
    .line 66
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 67
    .line 68
    .line 69
    iput-object p1, p0, Lcom/friday/document/viewmodel/FolderViewModel;->N:Ljava/util/List;

    .line 70
    .line 71
    new-instance p1, Ljava/util/ArrayList;

    .line 72
    .line 73
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 74
    .line 75
    .line 76
    iput-object p1, p0, Lcom/friday/document/viewmodel/FolderViewModel;->O:Ljava/util/List;

    .line 77
    .line 78
    const/4 p1, 0x0

    .line 79
    const/4 p2, 0x7

    .line 80
    const/4 p3, 0x0

    .line 81
    invoke-static {p3, p3, p1, p2, p1}, Lvd/q;->b(IILkotlinx/coroutines/channels/BufferOverflow;ILjava/lang/Object;)Lvd/k;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    iput-object p1, p0, Lcom/friday/document/viewmodel/FolderViewModel;->P:Lvd/k;

    .line 86
    .line 87
    invoke-static {p1}, Lvd/e;->a(Lvd/k;)Lvd/p;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    iput-object p1, p0, Lcom/friday/document/viewmodel/FolderViewModel;->Q:Lvd/p;

    .line 92
    .line 93
    return-void
.end method

.method public static final synthetic D0(Lcom/friday/document/viewmodel/FolderViewModel;)Lcom/friday/document/repositroy/FileRepository;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/document/viewmodel/FolderViewModel;->K:Lcom/friday/document/repositroy/FileRepository;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic E0(Lcom/friday/document/viewmodel/FolderViewModel;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/document/viewmodel/FolderViewModel;->N:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic F0(Lcom/friday/document/viewmodel/FolderViewModel;)Lvd/k;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/document/viewmodel/FolderViewModel;->P:Lvd/k;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic G0(Lcom/friday/document/viewmodel/FolderViewModel;)Lvd/l;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/document/viewmodel/FolderViewModel;->L:Lvd/l;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
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
    new-instance v2, Lcom/friday/document/viewmodel/FolderViewModel$clearSingleNoteCache$1;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-direct {v2, p0, p1, v0}, Lcom/friday/document/viewmodel/FolderViewModel$clearSingleNoteCache$1;-><init>(Lcom/friday/document/viewmodel/FolderViewModel;Lcom/friday/common/entity/FileEntity;Lvc/c;)V

    .line 10
    .line 11
    .line 12
    new-instance v3, Lcom/friday/document/viewmodel/FolderViewModel$clearSingleNoteCache$2;

    .line 13
    .line 14
    invoke-direct {v3, v0}, Lcom/friday/document/viewmodel/FolderViewModel$clearSingleNoteCache$2;-><init>(Lvc/c;)V

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

.method public final I0(Lvd/u;)Lvd/c;
    .locals 2

    .line 1
    new-instance v0, Lcom/friday/document/viewmodel/FolderViewModel$convertStateFlowToPagingDataFlow$$inlined$flatMapLatest$1;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1, p0}, Lcom/friday/document/viewmodel/FolderViewModel$convertStateFlowToPagingDataFlow$$inlined$flatMapLatest$1;-><init>(Lvc/c;Lcom/friday/document/viewmodel/FolderViewModel;)V

    .line 5
    .line 6
    .line 7
    invoke-static {p1, v0}, Lvd/e;->T(Lvd/c;Lhd/q;)Lvd/c;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method

.method public final J0(Lvc/c;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p1, Lcom/friday/document/viewmodel/FolderViewModel$getCurrentFolderId$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lcom/friday/document/viewmodel/FolderViewModel$getCurrentFolderId$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/friday/document/viewmodel/FolderViewModel$getCurrentFolderId$1;->f:I

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
    iput v1, v0, Lcom/friday/document/viewmodel/FolderViewModel$getCurrentFolderId$1;->f:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/friday/document/viewmodel/FolderViewModel$getCurrentFolderId$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lcom/friday/document/viewmodel/FolderViewModel$getCurrentFolderId$1;-><init>(Lcom/friday/document/viewmodel/FolderViewModel;Lvc/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lcom/friday/document/viewmodel/FolderViewModel$getCurrentFolderId$1;->d:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/friday/document/viewmodel/FolderViewModel$getCurrentFolderId$1;->f:I

    .line 32
    .line 33
    const-string v3, "0"

    .line 34
    .line 35
    const/4 v4, 0x1

    .line 36
    if-eqz v2, :cond_2

    .line 37
    .line 38
    if-ne v2, v4, :cond_1

    .line 39
    .line 40
    iget-object v0, v0, Lcom/friday/document/viewmodel/FolderViewModel$getCurrentFolderId$1;->c:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v0, Ljava/lang/String;

    .line 43
    .line 44
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 49
    .line 50
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw p1

    .line 56
    :cond_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0}, Lcom/friday/document/viewmodel/FolderViewModel;->N0()Lvd/l;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-interface {p1}, Lvd/l;->getValue()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    check-cast p1, Lkotlin/Pair;

    .line 68
    .line 69
    invoke-virtual {p1}, Lkotlin/Pair;->f()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    check-cast p1, Ljava/lang/String;

    .line 74
    .line 75
    if-nez p1, :cond_3

    .line 76
    .line 77
    return-object v3

    .line 78
    :cond_3
    invoke-virtual {p0}, Lcom/friday/document/viewmodel/BaseFileViewModel;->M()Lcom/friday/common/dao/FileDao;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    iput-object p1, v0, Lcom/friday/document/viewmodel/FolderViewModel$getCurrentFolderId$1;->c:Ljava/lang/Object;

    .line 83
    .line 84
    iput v4, v0, Lcom/friday/document/viewmodel/FolderViewModel$getCurrentFolderId$1;->f:I

    .line 85
    .line 86
    invoke-interface {v2, p1, v0}, Lcom/friday/common/dao/FileDao;->r(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    if-ne v0, v1, :cond_4

    .line 91
    .line 92
    return-object v1

    .line 93
    :cond_4
    move-object v5, v0

    .line 94
    move-object v0, p1

    .line 95
    move-object p1, v5

    .line 96
    :goto_1
    check-cast p1, Lcom/friday/common/entity/FileEntity;

    .line 97
    .line 98
    if-eqz p1, :cond_6

    .line 99
    .line 100
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getState()I

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    const/16 v2, 0x1e

    .line 105
    .line 106
    if-eq v1, v2, :cond_6

    .line 107
    .line 108
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getState()I

    .line 109
    .line 110
    .line 111
    move-result p1

    .line 112
    const/4 v1, 0x3

    .line 113
    if-ne p1, v1, :cond_5

    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_5
    return-object v0

    .line 117
    :cond_6
    :goto_2
    return-object v3
.end method

.method public final K0(Ljava/lang/String;)Lvd/c;
    .locals 4

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    iget-object p1, p0, Lcom/friday/document/viewmodel/FolderViewModel;->M:Lvd/c;

    .line 4
    .line 5
    return-object p1

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/friday/document/viewmodel/FolderViewModel;->N:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/4 v1, 0x0

    .line 13
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    const/4 v3, -0x1

    .line 18
    if-eqz v2, :cond_2

    .line 19
    .line 20
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    check-cast v2, Lvd/l;

    .line 25
    .line 26
    invoke-interface {v2}, Lvd/l;->getValue()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    check-cast v2, Lkotlin/Pair;

    .line 31
    .line 32
    invoke-virtual {v2}, Lkotlin/Pair;->f()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-static {v2, p1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-eqz v2, :cond_1

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    move v1, v3

    .line 47
    :goto_1
    if-ne v1, v3, :cond_3

    .line 48
    .line 49
    iget-object p1, p0, Lcom/friday/document/viewmodel/FolderViewModel;->M:Lvd/c;

    .line 50
    .line 51
    return-object p1

    .line 52
    :cond_3
    iget-object p1, p0, Lcom/friday/document/viewmodel/FolderViewModel;->O:Ljava/util/List;

    .line 53
    .line 54
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    check-cast p1, Lvd/c;

    .line 59
    .line 60
    return-object p1
.end method

.method public final L0(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/friday/document/viewmodel/BaseFileViewModel;->M()Lcom/friday/common/dao/FileDao;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0, p1, p2}, Lcom/friday/common/dao/FileDao;->r(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public final M0()Lvd/p;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/viewmodel/FolderViewModel;->Q:Lvd/p;

    .line 2
    .line 3
    return-object v0
.end method

.method public final N0()Lvd/l;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/viewmodel/FolderViewModel;->N:Ljava/util/List;

    .line 2
    .line 3
    invoke-static {v0}, Lrc/g0;->z0(Ljava/util/List;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lvd/l;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/friday/document/viewmodel/FolderViewModel;->L:Lvd/l;

    .line 12
    .line 13
    :cond_0
    return-object v0
.end method

.method public final O0(Lcom/friday/common/entity/FileEntity;)V
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
    new-instance v4, Lcom/friday/document/viewmodel/FolderViewModel$retrySyncSingleFile$1;

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    invoke-direct {v4, p0, p1, v0}, Lcom/friday/document/viewmodel/FolderViewModel$retrySyncSingleFile$1;-><init>(Lcom/friday/document/viewmodel/FolderViewModel;Lcom/friday/common/entity/FileEntity;Lvc/c;)V

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

.method public final P0()V
    .locals 6

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lsd/i0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v3, Lcom/friday/document/viewmodel/FolderViewModel$updateSortType$1;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v3, p0, v1}, Lcom/friday/document/viewmodel/FolderViewModel$updateSortType$1;-><init>(Lcom/friday/document/viewmodel/FolderViewModel;Lvc/c;)V

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

.method public k0(Ljava/lang/String;)V
    .locals 2

    .line 1
    const-string v0, "fileId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lkotlin/Pair;

    .line 7
    .line 8
    sget-object v1, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 9
    .line 10
    invoke-virtual {v1}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v1}, Lcom/friday/common/helper/b;->j()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-direct {v0, p1, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    invoke-static {v0}, Lvd/v;->a(Ljava/lang/Object;)Lvd/l;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iget-object v0, p0, Lcom/friday/document/viewmodel/FolderViewModel;->N:Ljava/util/List;

    .line 30
    .line 31
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Lcom/friday/document/viewmodel/FolderViewModel;->O:Ljava/util/List;

    .line 35
    .line 36
    invoke-virtual {p0, p1}, Lcom/friday/document/viewmodel/FolderViewModel;->I0(Lvd/u;)Lvd/c;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public l0()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/viewmodel/FolderViewModel;->N:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/friday/document/viewmodel/FolderViewModel;->O:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public m0()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/viewmodel/FolderViewModel;->N:Ljava/util/List;

    .line 2
    .line 3
    invoke-static {v0}, Lrc/b0;->P(Ljava/util/List;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/friday/document/viewmodel/FolderViewModel;->O:Ljava/util/List;

    .line 7
    .line 8
    invoke-static {v0}, Lrc/b0;->P(Ljava/util/List;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    return-void
.end method
