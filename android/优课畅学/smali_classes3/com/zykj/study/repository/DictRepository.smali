.class public final Lcom/zykj/study/repository/DictRepository;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lcom/zykj/study/data/AppDatabase;

.field public final b:Lcom/zykj/study/data/PeriodEntityDao;

.field public final c:Lcom/zykj/study/data/GradeEntityDao;

.field public final d:Lcom/zykj/study/data/SubjectEntityDao;

.field public final e:Lo4/c;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/zykj/study/data/AppDatabase;Lcom/zykj/study/data/PeriodEntityDao;Lcom/zykj/study/data/GradeEntityDao;Lcom/zykj/study/data/SubjectEntityDao;Lo4/c;)V
    .locals 1

    .line 1
    const-string v0, "db"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "periodEntityDao"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "gradeEntityDao"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "subjectEntityDao"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "api"

    .line 22
    .line 23
    invoke-static {p5, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, Lcom/zykj/study/repository/DictRepository;->a:Lcom/zykj/study/data/AppDatabase;

    .line 30
    .line 31
    iput-object p2, p0, Lcom/zykj/study/repository/DictRepository;->b:Lcom/zykj/study/data/PeriodEntityDao;

    .line 32
    .line 33
    iput-object p3, p0, Lcom/zykj/study/repository/DictRepository;->c:Lcom/zykj/study/data/GradeEntityDao;

    .line 34
    .line 35
    iput-object p4, p0, Lcom/zykj/study/repository/DictRepository;->d:Lcom/zykj/study/data/SubjectEntityDao;

    .line 36
    .line 37
    iput-object p5, p0, Lcom/zykj/study/repository/DictRepository;->e:Lo4/c;

    .line 38
    .line 39
    return-void
.end method

.method public static final synthetic a(Lcom/zykj/study/repository/DictRepository;)Lo4/c;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/study/repository/DictRepository;->e:Lo4/c;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic b(Lcom/zykj/study/repository/DictRepository;)Lcom/zykj/study/data/AppDatabase;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/study/repository/DictRepository;->a:Lcom/zykj/study/data/AppDatabase;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic c(Lcom/zykj/study/repository/DictRepository;)Lcom/zykj/study/data/GradeEntityDao;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/study/repository/DictRepository;->c:Lcom/zykj/study/data/GradeEntityDao;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic d(Lcom/zykj/study/repository/DictRepository;)Lcom/zykj/study/data/PeriodEntityDao;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/study/repository/DictRepository;->b:Lcom/zykj/study/data/PeriodEntityDao;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic e(Lcom/zykj/study/repository/DictRepository;)Lcom/zykj/study/data/SubjectEntityDao;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/study/repository/DictRepository;->d:Lcom/zykj/study/data/SubjectEntityDao;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public final f()Landroidx/lifecycle/LiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/repository/DictRepository;->c:Lcom/zykj/study/data/GradeEntityDao;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/zykj/study/data/GradeEntityDao;->getList()Landroidx/lifecycle/LiveData;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final g()Landroidx/lifecycle/LiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/repository/DictRepository;->b:Lcom/zykj/study/data/PeriodEntityDao;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/zykj/study/data/PeriodEntityDao;->getList()Landroidx/lifecycle/LiveData;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final h()Landroidx/lifecycle/LiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/repository/DictRepository;->d:Lcom/zykj/study/data/SubjectEntityDao;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/zykj/study/data/SubjectEntityDao;->getList()Landroidx/lifecycle/LiveData;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final i(Lm7/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {}, Li8/i0;->b()Lkotlinx/coroutines/CoroutineDispatcher;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/zykj/study/repository/DictRepository$initDict$2;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p0, v2}, Lcom/zykj/study/repository/DictRepository$initDict$2;-><init>(Lcom/zykj/study/repository/DictRepository;Lm7/c;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1, p1}, Li8/f;->g(Lkotlin/coroutines/d;Lx7/p;Lm7/c;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-ne p1, v0, :cond_0

    .line 20
    .line 21
    return-object p1

    .line 22
    :cond_0
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 23
    .line 24
    return-object p1
.end method
