.class public final Lcom/friday/document/viewmodel/TxtEditViewModel;
.super Lcom/friday/common/base/BaseViewModel;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# instance fields
.field public final b:Lcom/friday/common/dao/FileDao;

.field public final c:Landroidx/lifecycle/MutableLiveData;

.field public final d:Landroidx/lifecycle/MutableLiveData;

.field public final e:Landroidx/lifecycle/MutableLiveData;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/friday/common/dao/FileDao;)V
    .locals 1

    .line 1
    const-string v0, "fileDao"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/friday/common/base/BaseViewModel;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/friday/document/viewmodel/TxtEditViewModel;->b:Lcom/friday/common/dao/FileDao;

    .line 10
    .line 11
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 12
    .line 13
    invoke-direct {p1}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lcom/friday/document/viewmodel/TxtEditViewModel;->c:Landroidx/lifecycle/MutableLiveData;

    .line 17
    .line 18
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 19
    .line 20
    invoke-direct {p1}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Lcom/friday/document/viewmodel/TxtEditViewModel;->d:Landroidx/lifecycle/MutableLiveData;

    .line 24
    .line 25
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 26
    .line 27
    invoke-direct {p1}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Lcom/friday/document/viewmodel/TxtEditViewModel;->e:Landroidx/lifecycle/MutableLiveData;

    .line 31
    .line 32
    return-void
.end method

.method public static synthetic e()Lqc/q;
    .locals 1

    .line 1
    invoke-static {}, Lcom/friday/document/viewmodel/TxtEditViewModel;->o()Lqc/q;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic f(Lcom/friday/document/viewmodel/TxtEditViewModel;Lcom/friday/common/entity/FileEntity;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/document/viewmodel/TxtEditViewModel;->i(Lcom/friday/document/viewmodel/TxtEditViewModel;Lcom/friday/common/entity/FileEntity;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic g(Lcom/friday/document/viewmodel/TxtEditViewModel;)Lcom/friday/common/dao/FileDao;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/document/viewmodel/TxtEditViewModel;->b:Lcom/friday/common/dao/FileDao;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final i(Lcom/friday/document/viewmodel/TxtEditViewModel;Lcom/friday/common/entity/FileEntity;)Lqc/q;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/document/viewmodel/TxtEditViewModel;->c:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    sget p0, Lcom/friday/document/R$string;->save_success:I

    .line 7
    .line 8
    invoke-static {p0}, Lz1/b;->h(I)V

    .line 9
    .line 10
    .line 11
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 12
    .line 13
    return-object p0
.end method

.method public static final o()Lqc/q;
    .locals 1

    .line 1
    sget v0, Lcom/friday/document/R$string;->save_success:I

    .line 2
    .line 3
    invoke-static {v0}, Lz1/b;->h(I)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lqc/q;->a:Lqc/q;

    .line 7
    .line 8
    return-object v0
.end method


# virtual methods
.method public final h(Lcom/friday/common/entity/CreateNoteInput;)V
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-string v1, "note"

    .line 4
    .line 5
    move-object/from16 v2, p1

    .line 6
    .line 7
    invoke-static {v2, v1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    new-instance v1, Ljava/text/SimpleDateFormat;

    .line 11
    .line 12
    const-string v3, "yyyy-MM-dd HH:mm:ss"

    .line 13
    .line 14
    sget-object v4, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    .line 15
    .line 16
    invoke-direct {v1, v3, v4}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 17
    .line 18
    .line 19
    new-instance v3, Ljava/util/Date;

    .line 20
    .line 21
    invoke-direct {v3}, Ljava/util/Date;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, v3}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v13

    .line 28
    invoke-virtual {v2}, Lcom/friday/common/entity/CreateNoteInput;->getNoteId()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    invoke-virtual {v2}, Lcom/friday/common/entity/CreateNoteInput;->getUserId()J

    .line 33
    .line 34
    .line 35
    move-result-wide v6

    .line 36
    invoke-virtual {v2}, Lcom/friday/common/entity/CreateNoteInput;->getNoteName()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v8

    .line 40
    invoke-virtual {v2}, Lcom/friday/common/entity/CreateNoteInput;->getLocalPath()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v10

    .line 44
    invoke-virtual {v2}, Lcom/friday/common/entity/CreateNoteInput;->getFileType()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v11

    .line 48
    invoke-virtual {v2}, Lcom/friday/common/entity/CreateNoteInput;->getParentId()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v12

    .line 52
    invoke-static {v13}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    new-instance v4, Lcom/friday/common/entity/FileEntity;

    .line 56
    .line 57
    const v26, 0x6e000

    .line 58
    .line 59
    .line 60
    const/16 v27, 0x0

    .line 61
    .line 62
    const-string v9, ""

    .line 63
    .line 64
    const/4 v15, 0x1

    .line 65
    const/16 v16, 0x0

    .line 66
    .line 67
    const/16 v17, 0x0

    .line 68
    .line 69
    const/16 v18, 0x0

    .line 70
    .line 71
    const/16 v19, 0x0

    .line 72
    .line 73
    const/16 v20, 0x0

    .line 74
    .line 75
    const/16 v21, 0x0

    .line 76
    .line 77
    const/16 v22, 0x1

    .line 78
    .line 79
    const-wide/16 v23, 0x0

    .line 80
    .line 81
    const/16 v25, 0x0

    .line 82
    .line 83
    move-object v14, v13

    .line 84
    invoke-direct/range {v4 .. v27}, Lcom/friday/common/entity/FileEntity;-><init>(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZIZLjava/lang/String;ILjava/lang/String;ZJZILkotlin/jvm/internal/n;)V

    .line 85
    .line 86
    .line 87
    new-instance v1, Lcom/friday/document/viewmodel/TxtEditViewModel$createNewNote$1;

    .line 88
    .line 89
    const/4 v2, 0x0

    .line 90
    invoke-direct {v1, v0, v4, v2}, Lcom/friday/document/viewmodel/TxtEditViewModel$createNewNote$1;-><init>(Lcom/friday/document/viewmodel/TxtEditViewModel;Lcom/friday/common/entity/FileEntity;Lvc/c;)V

    .line 91
    .line 92
    .line 93
    new-instance v3, Lcom/friday/document/viewmodel/TxtEditViewModel$createNewNote$2;

    .line 94
    .line 95
    invoke-direct {v3, v0, v2}, Lcom/friday/document/viewmodel/TxtEditViewModel$createNewNote$2;-><init>(Lcom/friday/document/viewmodel/TxtEditViewModel;Lvc/c;)V

    .line 96
    .line 97
    .line 98
    new-instance v2, Lz2/w0;

    .line 99
    .line 100
    invoke-direct {v2, v0, v4}, Lz2/w0;-><init>(Lcom/friday/document/viewmodel/TxtEditViewModel;Lcom/friday/common/entity/FileEntity;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0, v1, v3, v2}, Lcom/friday/common/base/BaseViewModel;->b(Lhd/p;Lhd/p;Lhd/a;)V

    .line 104
    .line 105
    .line 106
    return-void
.end method

.method public final j(Ljava/lang/String;)V
    .locals 7

    .line 1
    const-string v0, "fileId"

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
    new-instance v4, Lcom/friday/document/viewmodel/TxtEditViewModel$findItem$1;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-direct {v4, p0, p1, v0}, Lcom/friday/document/viewmodel/TxtEditViewModel$findItem$1;-><init>(Lcom/friday/document/viewmodel/TxtEditViewModel;Ljava/lang/String;Lvc/c;)V

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

.method public final k()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/viewmodel/TxtEditViewModel;->c:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final l()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/viewmodel/TxtEditViewModel;->d:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final m()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/viewmodel/TxtEditViewModel;->e:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final n(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 7

    .line 1
    const-string v0, "noteId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "name"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v1, Lcom/friday/document/viewmodel/TxtEditViewModel$updateNote$1;

    .line 12
    .line 13
    const/4 v6, 0x0

    .line 14
    move-object v2, p0

    .line 15
    move-object v3, p1

    .line 16
    move-object v4, p2

    .line 17
    move v5, p3

    .line 18
    invoke-direct/range {v1 .. v6}, Lcom/friday/document/viewmodel/TxtEditViewModel$updateNote$1;-><init>(Lcom/friday/document/viewmodel/TxtEditViewModel;Ljava/lang/String;Ljava/lang/String;ILvc/c;)V

    .line 19
    .line 20
    .line 21
    new-instance p1, Lcom/friday/document/viewmodel/TxtEditViewModel$updateNote$2;

    .line 22
    .line 23
    const/4 p2, 0x0

    .line 24
    invoke-direct {p1, p0, p2}, Lcom/friday/document/viewmodel/TxtEditViewModel$updateNote$2;-><init>(Lcom/friday/document/viewmodel/TxtEditViewModel;Lvc/c;)V

    .line 25
    .line 26
    .line 27
    new-instance p2, Lz2/x0;

    .line 28
    .line 29
    invoke-direct {p2}, Lz2/x0;-><init>()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, v1, p1, p2}, Lcom/friday/common/base/BaseViewModel;->b(Lhd/p;Lhd/p;Lhd/a;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method
