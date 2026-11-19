.class public final Lcom/friday/main/viewmodel/FullScreenViewModel;
.super Lcom/friday/common/base/BaseViewModel;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# instance fields
.field public final b:Lcom/friday/common/dao/FileDao;

.field public final c:Lcom/friday/common/dao/ResourceDao;

.field public final d:Lc2/g2;

.field public final e:Landroidx/lifecycle/MutableLiveData;

.field public final f:Landroidx/lifecycle/MutableLiveData;

.field public final g:Landroidx/lifecycle/MutableLiveData;

.field public final h:Landroidx/lifecycle/LiveData;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/friday/common/dao/FileDao;Lcom/friday/common/dao/ResourceDao;Lc2/g2;)V
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
    const-string v0, "shareCacheDao"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Lcom/friday/common/base/BaseViewModel;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lcom/friday/main/viewmodel/FullScreenViewModel;->b:Lcom/friday/common/dao/FileDao;

    .line 20
    .line 21
    iput-object p2, p0, Lcom/friday/main/viewmodel/FullScreenViewModel;->c:Lcom/friday/common/dao/ResourceDao;

    .line 22
    .line 23
    iput-object p3, p0, Lcom/friday/main/viewmodel/FullScreenViewModel;->d:Lc2/g2;

    .line 24
    .line 25
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 26
    .line 27
    invoke-direct {p1}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Lcom/friday/main/viewmodel/FullScreenViewModel;->e:Landroidx/lifecycle/MutableLiveData;

    .line 31
    .line 32
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 33
    .line 34
    invoke-direct {p1}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object p1, p0, Lcom/friday/main/viewmodel/FullScreenViewModel;->f:Landroidx/lifecycle/MutableLiveData;

    .line 38
    .line 39
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 40
    .line 41
    invoke-direct {p1}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 42
    .line 43
    .line 44
    iput-object p1, p0, Lcom/friday/main/viewmodel/FullScreenViewModel;->g:Landroidx/lifecycle/MutableLiveData;

    .line 45
    .line 46
    iput-object p1, p0, Lcom/friday/main/viewmodel/FullScreenViewModel;->h:Landroidx/lifecycle/LiveData;

    .line 47
    .line 48
    return-void
.end method

.method public static final synthetic e(Lcom/friday/main/viewmodel/FullScreenViewModel;)Lcom/friday/common/dao/FileDao;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/main/viewmodel/FullScreenViewModel;->b:Lcom/friday/common/dao/FileDao;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic f(Lcom/friday/main/viewmodel/FullScreenViewModel;)Lcom/friday/common/dao/ResourceDao;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/main/viewmodel/FullScreenViewModel;->c:Lcom/friday/common/dao/ResourceDao;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic g(Lcom/friday/main/viewmodel/FullScreenViewModel;)Landroidx/lifecycle/MutableLiveData;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/main/viewmodel/FullScreenViewModel;->g:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public final h()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/main/viewmodel/FullScreenViewModel;->f:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final i()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/main/viewmodel/FullScreenViewModel;->e:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final j(Ljava/lang/String;)V
    .locals 7

    .line 1
    const-string v0, "noteId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v2, Lcom/friday/main/viewmodel/FullScreenViewModel$getNoteItem$1;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-direct {v2, p0, p1, v0}, Lcom/friday/main/viewmodel/FullScreenViewModel$getNoteItem$1;-><init>(Lcom/friday/main/viewmodel/FullScreenViewModel;Ljava/lang/String;Lvc/c;)V

    .line 10
    .line 11
    .line 12
    new-instance v3, Lcom/friday/main/viewmodel/FullScreenViewModel$getNoteItem$2;

    .line 13
    .line 14
    invoke-direct {v3, p0, v0}, Lcom/friday/main/viewmodel/FullScreenViewModel$getNoteItem$2;-><init>(Lcom/friday/main/viewmodel/FullScreenViewModel;Lvc/c;)V

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

.method public final k(Lcom/friday/common/entity/FileEntity;)V
    .locals 7

    .line 1
    const-string v0, "fileEntity"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v2, Lcom/friday/main/viewmodel/FullScreenViewModel$getPreviewList$1;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-direct {v2, p0, p1, v0}, Lcom/friday/main/viewmodel/FullScreenViewModel$getPreviewList$1;-><init>(Lcom/friday/main/viewmodel/FullScreenViewModel;Lcom/friday/common/entity/FileEntity;Lvc/c;)V

    .line 10
    .line 11
    .line 12
    new-instance v3, Lcom/friday/main/viewmodel/FullScreenViewModel$getPreviewList$2;

    .line 13
    .line 14
    invoke-direct {v3, p0, v0}, Lcom/friday/main/viewmodel/FullScreenViewModel$getPreviewList$2;-><init>(Lcom/friday/main/viewmodel/FullScreenViewModel;Lvc/c;)V

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

.method public final l(Lcom/friday/common/entity/FileEntity;)V
    .locals 7

    .line 1
    const-string v0, "data"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v2, Lcom/friday/main/viewmodel/FullScreenViewModel$getPreviewNewNoteList$1;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-direct {v2, p0, p1, v0}, Lcom/friday/main/viewmodel/FullScreenViewModel$getPreviewNewNoteList$1;-><init>(Lcom/friday/main/viewmodel/FullScreenViewModel;Lcom/friday/common/entity/FileEntity;Lvc/c;)V

    .line 10
    .line 11
    .line 12
    new-instance v3, Lcom/friday/main/viewmodel/FullScreenViewModel$getPreviewNewNoteList$2;

    .line 13
    .line 14
    invoke-direct {v3, p0, v0}, Lcom/friday/main/viewmodel/FullScreenViewModel$getPreviewNewNoteList$2;-><init>(Lcom/friday/main/viewmodel/FullScreenViewModel;Lvc/c;)V

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

.method public final m()Landroidx/lifecycle/LiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/main/viewmodel/FullScreenViewModel;->h:Landroidx/lifecycle/LiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final n(Ljava/lang/String;)V
    .locals 7

    .line 1
    const-string v0, "fileId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v2, Lcom/friday/main/viewmodel/FullScreenViewModel$getStudentSharePreviewList$1;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-direct {v2, p0, p1, v0}, Lcom/friday/main/viewmodel/FullScreenViewModel$getStudentSharePreviewList$1;-><init>(Lcom/friday/main/viewmodel/FullScreenViewModel;Ljava/lang/String;Lvc/c;)V

    .line 10
    .line 11
    .line 12
    new-instance v3, Lcom/friday/main/viewmodel/FullScreenViewModel$getStudentSharePreviewList$2;

    .line 13
    .line 14
    invoke-direct {v3, p0, v0}, Lcom/friday/main/viewmodel/FullScreenViewModel$getStudentSharePreviewList$2;-><init>(Lcom/friday/main/viewmodel/FullScreenViewModel;Lvc/c;)V

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
