.class public final Ls4/o;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;)Lcom/zykj/study/data/AppDatabase;
    .locals 1

    .line 1
    const-string v0, "appContext"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lcom/zykj/study/data/AppDatabase;->Companion:Lcom/zykj/study/data/AppDatabase$Companion;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lcom/zykj/study/data/AppDatabase$Companion;->getInstance(Landroid/content/Context;)Lcom/zykj/study/data/AppDatabase;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public final b(Lcom/zykj/study/data/AppDatabase;)Lcom/zykj/study/data/GradeEntityDao;
    .locals 1

    .line 1
    const-string v0, "appDatabase"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/zykj/study/data/AppDatabase;->gradeEntityDao()Lcom/zykj/study/data/GradeEntityDao;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method

.method public final c(Lcom/zykj/study/data/AppDatabase;)Lcom/zykj/study/data/PdfDao;
    .locals 1

    .line 1
    const-string v0, "appDatabase"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/zykj/study/data/AppDatabase;->pdfDao()Lcom/zykj/study/data/PdfDao;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method

.method public final d(Lcom/zykj/study/data/AppDatabase;)Lcom/zykj/study/data/PeriodEntityDao;
    .locals 1

    .line 1
    const-string v0, "appDatabase"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/zykj/study/data/AppDatabase;->periodEntityDao()Lcom/zykj/study/data/PeriodEntityDao;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method

.method public final e(Lcom/zykj/study/data/AppDatabase;)Lcom/zykj/study/data/SearchHistoryEntityDao;
    .locals 1

    .line 1
    const-string v0, "appDatabase"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/zykj/study/data/AppDatabase;->searchHistoryEntityDao()Lcom/zykj/study/data/SearchHistoryEntityDao;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method

.method public final f(Lcom/zykj/study/data/AppDatabase;)Lcom/zykj/study/data/SubjectEntityDao;
    .locals 1

    .line 1
    const-string v0, "appDatabase"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/zykj/study/data/AppDatabase;->subjectEntityDao()Lcom/zykj/study/data/SubjectEntityDao;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method
