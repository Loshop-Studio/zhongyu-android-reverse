.class public final Lcom/friday/document/viewmodel/TeacherOnlyViewModel;
.super Lcom/friday/common/base/BaseViewModel;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# instance fields
.field public final b:Ls2/a;

.field public final c:Lcom/friday/common/dao/FileDao;

.field public final d:Lcom/friday/document/service/FileManager;

.field public final e:Lvd/k;

.field public final f:Lvd/p;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ls2/a;Lcom/friday/common/dao/FileDao;Lcom/friday/document/service/FileManager;)V
    .locals 1

    .line 1
    const-string v0, "service"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "fileDao"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "fileManager"

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
    iput-object p1, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel;->b:Ls2/a;

    .line 20
    .line 21
    iput-object p2, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel;->c:Lcom/friday/common/dao/FileDao;

    .line 22
    .line 23
    iput-object p3, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel;->d:Lcom/friday/document/service/FileManager;

    .line 24
    .line 25
    const/4 p1, 0x0

    .line 26
    const/4 p2, 0x7

    .line 27
    const/4 p3, 0x0

    .line 28
    invoke-static {p3, p3, p1, p2, p1}, Lvd/q;->b(IILkotlinx/coroutines/channels/BufferOverflow;ILjava/lang/Object;)Lvd/k;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iput-object p1, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel;->e:Lvd/k;

    .line 33
    .line 34
    invoke-static {p1}, Lvd/e;->a(Lvd/k;)Lvd/p;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    iput-object p1, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel;->f:Lvd/p;

    .line 39
    .line 40
    return-void
.end method

.method public static final synthetic e(Lcom/friday/document/viewmodel/TeacherOnlyViewModel;)Lcom/friday/common/dao/FileDao;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel;->c:Lcom/friday/common/dao/FileDao;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic f(Lcom/friday/document/viewmodel/TeacherOnlyViewModel;)Lcom/friday/document/service/FileManager;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel;->d:Lcom/friday/document/service/FileManager;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic g(Lcom/friday/document/viewmodel/TeacherOnlyViewModel;)Ls2/a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel;->b:Ls2/a;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic h(Lcom/friday/document/viewmodel/TeacherOnlyViewModel;)Lvd/k;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel;->e:Lvd/k;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic i(Lcom/friday/document/viewmodel/TeacherOnlyViewModel;)J
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/friday/document/viewmodel/TeacherOnlyViewModel;->l()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    return-wide v0
.end method

.method private final l()J
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


# virtual methods
.method public final j()Lvd/p;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel;->f:Lvd/p;

    .line 2
    .line 3
    return-object v0
.end method

.method public final k()V
    .locals 6

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lsd/i0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v3, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v3, p0, v1}, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1;-><init>(Lcom/friday/document/viewmodel/TeacherOnlyViewModel;Lvc/c;)V

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
