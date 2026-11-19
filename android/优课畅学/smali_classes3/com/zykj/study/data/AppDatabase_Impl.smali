.class public final Lcom/zykj/study/data/AppDatabase_Impl;
.super Lcom/zykj/study/data/AppDatabase;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final _catalogEntityDao:Lh7/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lh7/d;"
        }
    .end annotation
.end field

.field private final _courseStudyEntityDao:Lh7/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lh7/d;"
        }
    .end annotation
.end field

.field private final _courseStudyKeyEntityDao:Lh7/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lh7/d;"
        }
    .end annotation
.end field

.field private final _gradeEntityDao:Lh7/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lh7/d;"
        }
    .end annotation
.end field

.field private final _myCourseEntityDao:Lh7/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lh7/d;"
        }
    .end annotation
.end field

.field private final _myCourseKeyEntityDao:Lh7/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lh7/d;"
        }
    .end annotation
.end field

.field private final _pdfDao:Lh7/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lh7/d;"
        }
    .end annotation
.end field

.field private final _periodEntityDao:Lh7/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lh7/d;"
        }
    .end annotation
.end field

.field private final _searchHistoryEntityDao:Lh7/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lh7/d;"
        }
    .end annotation
.end field

.field private final _subjectEntityDao:Lh7/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lh7/d;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/zykj/study/data/AppDatabase;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/zykj/study/data/a;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lcom/zykj/study/data/a;-><init>(Lcom/zykj/study/data/AppDatabase_Impl;)V

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Lkotlin/a;->b(Lx7/a;)Lh7/d;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lcom/zykj/study/data/AppDatabase_Impl;->_myCourseEntityDao:Lh7/d;

    .line 14
    .line 15
    new-instance v0, Lcom/zykj/study/data/b;

    .line 16
    .line 17
    invoke-direct {v0, p0}, Lcom/zykj/study/data/b;-><init>(Lcom/zykj/study/data/AppDatabase_Impl;)V

    .line 18
    .line 19
    .line 20
    invoke-static {v0}, Lkotlin/a;->b(Lx7/a;)Lh7/d;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iput-object v0, p0, Lcom/zykj/study/data/AppDatabase_Impl;->_myCourseKeyEntityDao:Lh7/d;

    .line 25
    .line 26
    new-instance v0, Lcom/zykj/study/data/c;

    .line 27
    .line 28
    invoke-direct {v0, p0}, Lcom/zykj/study/data/c;-><init>(Lcom/zykj/study/data/AppDatabase_Impl;)V

    .line 29
    .line 30
    .line 31
    invoke-static {v0}, Lkotlin/a;->b(Lx7/a;)Lh7/d;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iput-object v0, p0, Lcom/zykj/study/data/AppDatabase_Impl;->_periodEntityDao:Lh7/d;

    .line 36
    .line 37
    new-instance v0, Lcom/zykj/study/data/d;

    .line 38
    .line 39
    invoke-direct {v0, p0}, Lcom/zykj/study/data/d;-><init>(Lcom/zykj/study/data/AppDatabase_Impl;)V

    .line 40
    .line 41
    .line 42
    invoke-static {v0}, Lkotlin/a;->b(Lx7/a;)Lh7/d;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iput-object v0, p0, Lcom/zykj/study/data/AppDatabase_Impl;->_gradeEntityDao:Lh7/d;

    .line 47
    .line 48
    new-instance v0, Lcom/zykj/study/data/e;

    .line 49
    .line 50
    invoke-direct {v0, p0}, Lcom/zykj/study/data/e;-><init>(Lcom/zykj/study/data/AppDatabase_Impl;)V

    .line 51
    .line 52
    .line 53
    invoke-static {v0}, Lkotlin/a;->b(Lx7/a;)Lh7/d;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    iput-object v0, p0, Lcom/zykj/study/data/AppDatabase_Impl;->_subjectEntityDao:Lh7/d;

    .line 58
    .line 59
    new-instance v0, Lcom/zykj/study/data/f;

    .line 60
    .line 61
    invoke-direct {v0, p0}, Lcom/zykj/study/data/f;-><init>(Lcom/zykj/study/data/AppDatabase_Impl;)V

    .line 62
    .line 63
    .line 64
    invoke-static {v0}, Lkotlin/a;->b(Lx7/a;)Lh7/d;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    iput-object v0, p0, Lcom/zykj/study/data/AppDatabase_Impl;->_catalogEntityDao:Lh7/d;

    .line 69
    .line 70
    new-instance v0, Lcom/zykj/study/data/g;

    .line 71
    .line 72
    invoke-direct {v0, p0}, Lcom/zykj/study/data/g;-><init>(Lcom/zykj/study/data/AppDatabase_Impl;)V

    .line 73
    .line 74
    .line 75
    invoke-static {v0}, Lkotlin/a;->b(Lx7/a;)Lh7/d;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    iput-object v0, p0, Lcom/zykj/study/data/AppDatabase_Impl;->_searchHistoryEntityDao:Lh7/d;

    .line 80
    .line 81
    new-instance v0, Lcom/zykj/study/data/h;

    .line 82
    .line 83
    invoke-direct {v0, p0}, Lcom/zykj/study/data/h;-><init>(Lcom/zykj/study/data/AppDatabase_Impl;)V

    .line 84
    .line 85
    .line 86
    invoke-static {v0}, Lkotlin/a;->b(Lx7/a;)Lh7/d;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    iput-object v0, p0, Lcom/zykj/study/data/AppDatabase_Impl;->_courseStudyEntityDao:Lh7/d;

    .line 91
    .line 92
    new-instance v0, Lcom/zykj/study/data/i;

    .line 93
    .line 94
    invoke-direct {v0, p0}, Lcom/zykj/study/data/i;-><init>(Lcom/zykj/study/data/AppDatabase_Impl;)V

    .line 95
    .line 96
    .line 97
    invoke-static {v0}, Lkotlin/a;->b(Lx7/a;)Lh7/d;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    iput-object v0, p0, Lcom/zykj/study/data/AppDatabase_Impl;->_courseStudyKeyEntityDao:Lh7/d;

    .line 102
    .line 103
    new-instance v0, Lcom/zykj/study/data/j;

    .line 104
    .line 105
    invoke-direct {v0, p0}, Lcom/zykj/study/data/j;-><init>(Lcom/zykj/study/data/AppDatabase_Impl;)V

    .line 106
    .line 107
    .line 108
    invoke-static {v0}, Lkotlin/a;->b(Lx7/a;)Lh7/d;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    iput-object v0, p0, Lcom/zykj/study/data/AppDatabase_Impl;->_pdfDao:Lh7/d;

    .line 113
    .line 114
    return-void
.end method

.method private static final _catalogEntityDao$lambda$5(Lcom/zykj/study/data/AppDatabase_Impl;)Lcom/zykj/study/data/CatalogEntityDao_Impl;
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/study/data/CatalogEntityDao_Impl;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/zykj/study/data/CatalogEntityDao_Impl;-><init>(Landroidx/room/RoomDatabase;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method private static final _courseStudyEntityDao$lambda$7(Lcom/zykj/study/data/AppDatabase_Impl;)Lcom/zykj/study/data/CourseStudyEntityDao_Impl;
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/study/data/CourseStudyEntityDao_Impl;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/zykj/study/data/CourseStudyEntityDao_Impl;-><init>(Landroidx/room/RoomDatabase;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method private static final _courseStudyKeyEntityDao$lambda$8(Lcom/zykj/study/data/AppDatabase_Impl;)Lcom/zykj/study/data/CourseStudyKeyEntityDao_Impl;
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/study/data/CourseStudyKeyEntityDao_Impl;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/zykj/study/data/CourseStudyKeyEntityDao_Impl;-><init>(Landroidx/room/RoomDatabase;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method private static final _gradeEntityDao$lambda$3(Lcom/zykj/study/data/AppDatabase_Impl;)Lcom/zykj/study/data/GradeEntityDao_Impl;
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/study/data/GradeEntityDao_Impl;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/zykj/study/data/GradeEntityDao_Impl;-><init>(Landroidx/room/RoomDatabase;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method private static final _myCourseEntityDao$lambda$0(Lcom/zykj/study/data/AppDatabase_Impl;)Lcom/zykj/study/data/MyCourseEntityDao_Impl;
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/study/data/MyCourseEntityDao_Impl;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/zykj/study/data/MyCourseEntityDao_Impl;-><init>(Landroidx/room/RoomDatabase;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method private static final _myCourseKeyEntityDao$lambda$1(Lcom/zykj/study/data/AppDatabase_Impl;)Lcom/zykj/study/data/MyCourseKeyEntityDao_Impl;
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/study/data/MyCourseKeyEntityDao_Impl;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/zykj/study/data/MyCourseKeyEntityDao_Impl;-><init>(Landroidx/room/RoomDatabase;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method private static final _pdfDao$lambda$9(Lcom/zykj/study/data/AppDatabase_Impl;)Lcom/zykj/study/data/PdfDao_Impl;
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/study/data/PdfDao_Impl;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/zykj/study/data/PdfDao_Impl;-><init>(Landroidx/room/RoomDatabase;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method private static final _periodEntityDao$lambda$2(Lcom/zykj/study/data/AppDatabase_Impl;)Lcom/zykj/study/data/PeriodEntityDao_Impl;
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/study/data/PeriodEntityDao_Impl;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/zykj/study/data/PeriodEntityDao_Impl;-><init>(Landroidx/room/RoomDatabase;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method private static final _searchHistoryEntityDao$lambda$6(Lcom/zykj/study/data/AppDatabase_Impl;)Lcom/zykj/study/data/SearchHistoryEntityDao_Impl;
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/study/data/SearchHistoryEntityDao_Impl;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/zykj/study/data/SearchHistoryEntityDao_Impl;-><init>(Landroidx/room/RoomDatabase;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method private static final _subjectEntityDao$lambda$4(Lcom/zykj/study/data/AppDatabase_Impl;)Lcom/zykj/study/data/SubjectEntityDao_Impl;
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/study/data/SubjectEntityDao_Impl;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/zykj/study/data/SubjectEntityDao_Impl;-><init>(Landroidx/room/RoomDatabase;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static final synthetic access$internalInitInvalidationTracker(Lcom/zykj/study/data/AppDatabase_Impl;Landroidx/sqlite/SQLiteConnection;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/room/RoomDatabase;->internalInitInvalidationTracker(Landroidx/sqlite/SQLiteConnection;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic g(Lcom/zykj/study/data/AppDatabase_Impl;)Lcom/zykj/study/data/MyCourseKeyEntityDao_Impl;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/study/data/AppDatabase_Impl;->_myCourseKeyEntityDao$lambda$1(Lcom/zykj/study/data/AppDatabase_Impl;)Lcom/zykj/study/data/MyCourseKeyEntityDao_Impl;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lcom/zykj/study/data/AppDatabase_Impl;)Lcom/zykj/study/data/PeriodEntityDao_Impl;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/study/data/AppDatabase_Impl;->_periodEntityDao$lambda$2(Lcom/zykj/study/data/AppDatabase_Impl;)Lcom/zykj/study/data/PeriodEntityDao_Impl;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lcom/zykj/study/data/AppDatabase_Impl;)Lcom/zykj/study/data/PdfDao_Impl;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/study/data/AppDatabase_Impl;->_pdfDao$lambda$9(Lcom/zykj/study/data/AppDatabase_Impl;)Lcom/zykj/study/data/PdfDao_Impl;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lcom/zykj/study/data/AppDatabase_Impl;)Lcom/zykj/study/data/GradeEntityDao_Impl;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/study/data/AppDatabase_Impl;->_gradeEntityDao$lambda$3(Lcom/zykj/study/data/AppDatabase_Impl;)Lcom/zykj/study/data/GradeEntityDao_Impl;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lcom/zykj/study/data/AppDatabase_Impl;)Lcom/zykj/study/data/SubjectEntityDao_Impl;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/study/data/AppDatabase_Impl;->_subjectEntityDao$lambda$4(Lcom/zykj/study/data/AppDatabase_Impl;)Lcom/zykj/study/data/SubjectEntityDao_Impl;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lcom/zykj/study/data/AppDatabase_Impl;)Lcom/zykj/study/data/CourseStudyKeyEntityDao_Impl;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/study/data/AppDatabase_Impl;->_courseStudyKeyEntityDao$lambda$8(Lcom/zykj/study/data/AppDatabase_Impl;)Lcom/zykj/study/data/CourseStudyKeyEntityDao_Impl;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lcom/zykj/study/data/AppDatabase_Impl;)Lcom/zykj/study/data/MyCourseEntityDao_Impl;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/study/data/AppDatabase_Impl;->_myCourseEntityDao$lambda$0(Lcom/zykj/study/data/AppDatabase_Impl;)Lcom/zykj/study/data/MyCourseEntityDao_Impl;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Lcom/zykj/study/data/AppDatabase_Impl;)Lcom/zykj/study/data/CourseStudyEntityDao_Impl;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/study/data/AppDatabase_Impl;->_courseStudyEntityDao$lambda$7(Lcom/zykj/study/data/AppDatabase_Impl;)Lcom/zykj/study/data/CourseStudyEntityDao_Impl;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o(Lcom/zykj/study/data/AppDatabase_Impl;)Lcom/zykj/study/data/SearchHistoryEntityDao_Impl;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/study/data/AppDatabase_Impl;->_searchHistoryEntityDao$lambda$6(Lcom/zykj/study/data/AppDatabase_Impl;)Lcom/zykj/study/data/SearchHistoryEntityDao_Impl;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p(Lcom/zykj/study/data/AppDatabase_Impl;)Lcom/zykj/study/data/CatalogEntityDao_Impl;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/study/data/AppDatabase_Impl;->_catalogEntityDao$lambda$5(Lcom/zykj/study/data/AppDatabase_Impl;)Lcom/zykj/study/data/CatalogEntityDao_Impl;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public catalogEntityDao()Lcom/zykj/study/data/CatalogEntityDao;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/data/AppDatabase_Impl;->_catalogEntityDao:Lh7/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/study/data/CatalogEntityDao;

    .line 8
    .line 9
    return-object v0
.end method

.method public clearAllTables()V
    .locals 10

    .line 1
    const-string v8, "search_history"

    .line 2
    .line 3
    const-string v9, "PdfEntity"

    .line 4
    .line 5
    const-string v0, "course_study"

    .line 6
    .line 7
    const-string v1, "course_study_key"

    .line 8
    .line 9
    const-string v2, "my_course"

    .line 10
    .line 11
    const-string v3, "my_course_key"

    .line 12
    .line 13
    const-string v4, "period"

    .line 14
    .line 15
    const-string v5, "grade"

    .line 16
    .line 17
    const-string v6, "subject"

    .line 18
    .line 19
    const-string v7, "catalog"

    .line 20
    .line 21
    filled-new-array/range {v0 .. v9}, [Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    const/4 v1, 0x0

    .line 26
    invoke-super {p0, v1, v0}, Landroidx/room/RoomDatabase;->performClear(Z[Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public courseStudyEntityDao()Lcom/zykj/study/data/CourseStudyEntityDao;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/data/AppDatabase_Impl;->_courseStudyEntityDao:Lh7/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/study/data/CourseStudyEntityDao;

    .line 8
    .line 9
    return-object v0
.end method

.method public courseStudyKeyEntityDao()Lcom/zykj/study/data/CourseStudyKeyEntityDao;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/data/AppDatabase_Impl;->_courseStudyKeyEntityDao:Lh7/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/study/data/CourseStudyKeyEntityDao;

    .line 8
    .line 9
    return-object v0
.end method

.method public createAutoMigrations(Ljava/util/Map;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Le8/c;",
            "+",
            "Landroidx/room/migration/AutoMigrationSpec;",
            ">;)",
            "Ljava/util/List<",
            "Landroidx/room/migration/Migration;",
            ">;"
        }
    .end annotation

    .line 1
    const-string v0, "autoMigrationSpecs"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance p1, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    return-object p1
.end method

.method public createInvalidationTracker()Landroidx/room/InvalidationTracker;
    .locals 13

    .line 1
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 9
    .line 10
    .line 11
    new-instance v2, Landroidx/room/InvalidationTracker;

    .line 12
    .line 13
    const-string v11, "search_history"

    .line 14
    .line 15
    const-string v12, "PdfEntity"

    .line 16
    .line 17
    const-string v3, "course_study"

    .line 18
    .line 19
    const-string v4, "course_study_key"

    .line 20
    .line 21
    const-string v5, "my_course"

    .line 22
    .line 23
    const-string v6, "my_course_key"

    .line 24
    .line 25
    const-string v7, "period"

    .line 26
    .line 27
    const-string v8, "grade"

    .line 28
    .line 29
    const-string v9, "subject"

    .line 30
    .line 31
    const-string v10, "catalog"

    .line 32
    .line 33
    filled-new-array/range {v3 .. v12}, [Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    invoke-direct {v2, p0, v0, v1, v3}, Landroidx/room/InvalidationTracker;-><init>(Landroidx/room/RoomDatabase;Ljava/util/Map;Ljava/util/Map;[Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    return-object v2
.end method

.method public createOpenDelegate()Landroidx/room/RoomOpenDelegate;
    .locals 1

    .line 2
    new-instance v0, Lcom/zykj/study/data/AppDatabase_Impl$createOpenDelegate$_openDelegate$1;

    invoke-direct {v0, p0}, Lcom/zykj/study/data/AppDatabase_Impl$createOpenDelegate$_openDelegate$1;-><init>(Lcom/zykj/study/data/AppDatabase_Impl;)V

    return-object v0
.end method

.method public bridge synthetic createOpenDelegate()Landroidx/room/RoomOpenDelegateMarker;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/study/data/AppDatabase_Impl;->createOpenDelegate()Landroidx/room/RoomOpenDelegate;

    move-result-object v0

    return-object v0
.end method

.method public getRequiredAutoMigrationSpecClasses()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Le8/c;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public getRequiredTypeConverterClasses()Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Le8/c;",
            "Ljava/util/List<",
            "Le8/c;",
            ">;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    const-class v1, Lcom/zykj/study/data/MyCourseEntityDao;

    .line 7
    .line 8
    invoke-static {v1}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    sget-object v2, Lcom/zykj/study/data/MyCourseEntityDao_Impl;->Companion:Lcom/zykj/study/data/MyCourseEntityDao_Impl$Companion;

    .line 13
    .line 14
    invoke-virtual {v2}, Lcom/zykj/study/data/MyCourseEntityDao_Impl$Companion;->getRequiredConverters()Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    const-class v1, Lcom/zykj/study/data/MyCourseKeyEntityDao;

    .line 22
    .line 23
    invoke-static {v1}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    sget-object v2, Lcom/zykj/study/data/MyCourseKeyEntityDao_Impl;->Companion:Lcom/zykj/study/data/MyCourseKeyEntityDao_Impl$Companion;

    .line 28
    .line 29
    invoke-virtual {v2}, Lcom/zykj/study/data/MyCourseKeyEntityDao_Impl$Companion;->getRequiredConverters()Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    const-class v1, Lcom/zykj/study/data/PeriodEntityDao;

    .line 37
    .line 38
    invoke-static {v1}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    sget-object v2, Lcom/zykj/study/data/PeriodEntityDao_Impl;->Companion:Lcom/zykj/study/data/PeriodEntityDao_Impl$Companion;

    .line 43
    .line 44
    invoke-virtual {v2}, Lcom/zykj/study/data/PeriodEntityDao_Impl$Companion;->getRequiredConverters()Ljava/util/List;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    const-class v1, Lcom/zykj/study/data/GradeEntityDao;

    .line 52
    .line 53
    invoke-static {v1}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    sget-object v2, Lcom/zykj/study/data/GradeEntityDao_Impl;->Companion:Lcom/zykj/study/data/GradeEntityDao_Impl$Companion;

    .line 58
    .line 59
    invoke-virtual {v2}, Lcom/zykj/study/data/GradeEntityDao_Impl$Companion;->getRequiredConverters()Ljava/util/List;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    const-class v1, Lcom/zykj/study/data/SubjectEntityDao;

    .line 67
    .line 68
    invoke-static {v1}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    sget-object v2, Lcom/zykj/study/data/SubjectEntityDao_Impl;->Companion:Lcom/zykj/study/data/SubjectEntityDao_Impl$Companion;

    .line 73
    .line 74
    invoke-virtual {v2}, Lcom/zykj/study/data/SubjectEntityDao_Impl$Companion;->getRequiredConverters()Ljava/util/List;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    const-class v1, Lcom/zykj/study/data/CatalogEntityDao;

    .line 82
    .line 83
    invoke-static {v1}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    sget-object v2, Lcom/zykj/study/data/CatalogEntityDao_Impl;->Companion:Lcom/zykj/study/data/CatalogEntityDao_Impl$Companion;

    .line 88
    .line 89
    invoke-virtual {v2}, Lcom/zykj/study/data/CatalogEntityDao_Impl$Companion;->getRequiredConverters()Ljava/util/List;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    const-class v1, Lcom/zykj/study/data/SearchHistoryEntityDao;

    .line 97
    .line 98
    invoke-static {v1}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    sget-object v2, Lcom/zykj/study/data/SearchHistoryEntityDao_Impl;->Companion:Lcom/zykj/study/data/SearchHistoryEntityDao_Impl$Companion;

    .line 103
    .line 104
    invoke-virtual {v2}, Lcom/zykj/study/data/SearchHistoryEntityDao_Impl$Companion;->getRequiredConverters()Ljava/util/List;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    const-class v1, Lcom/zykj/study/data/CourseStudyEntityDao;

    .line 112
    .line 113
    invoke-static {v1}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    sget-object v2, Lcom/zykj/study/data/CourseStudyEntityDao_Impl;->Companion:Lcom/zykj/study/data/CourseStudyEntityDao_Impl$Companion;

    .line 118
    .line 119
    invoke-virtual {v2}, Lcom/zykj/study/data/CourseStudyEntityDao_Impl$Companion;->getRequiredConverters()Ljava/util/List;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    const-class v1, Lcom/zykj/study/data/CourseStudyKeyEntityDao;

    .line 127
    .line 128
    invoke-static {v1}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    sget-object v2, Lcom/zykj/study/data/CourseStudyKeyEntityDao_Impl;->Companion:Lcom/zykj/study/data/CourseStudyKeyEntityDao_Impl$Companion;

    .line 133
    .line 134
    invoke-virtual {v2}, Lcom/zykj/study/data/CourseStudyKeyEntityDao_Impl$Companion;->getRequiredConverters()Ljava/util/List;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    const-class v1, Lcom/zykj/study/data/PdfDao;

    .line 142
    .line 143
    invoke-static {v1}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    sget-object v2, Lcom/zykj/study/data/PdfDao_Impl;->Companion:Lcom/zykj/study/data/PdfDao_Impl$Companion;

    .line 148
    .line 149
    invoke-virtual {v2}, Lcom/zykj/study/data/PdfDao_Impl$Companion;->getRequiredConverters()Ljava/util/List;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    return-object v0
.end method

.method public gradeEntityDao()Lcom/zykj/study/data/GradeEntityDao;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/data/AppDatabase_Impl;->_gradeEntityDao:Lh7/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/study/data/GradeEntityDao;

    .line 8
    .line 9
    return-object v0
.end method

.method public myCourseEntityDao()Lcom/zykj/study/data/MyCourseEntityDao;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/data/AppDatabase_Impl;->_myCourseEntityDao:Lh7/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/study/data/MyCourseEntityDao;

    .line 8
    .line 9
    return-object v0
.end method

.method public myCourseKeyEntityDao()Lcom/zykj/study/data/MyCourseKeyEntityDao;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/data/AppDatabase_Impl;->_myCourseKeyEntityDao:Lh7/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/study/data/MyCourseKeyEntityDao;

    .line 8
    .line 9
    return-object v0
.end method

.method public pdfDao()Lcom/zykj/study/data/PdfDao;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/data/AppDatabase_Impl;->_pdfDao:Lh7/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/study/data/PdfDao;

    .line 8
    .line 9
    return-object v0
.end method

.method public periodEntityDao()Lcom/zykj/study/data/PeriodEntityDao;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/data/AppDatabase_Impl;->_periodEntityDao:Lh7/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/study/data/PeriodEntityDao;

    .line 8
    .line 9
    return-object v0
.end method

.method public searchHistoryEntityDao()Lcom/zykj/study/data/SearchHistoryEntityDao;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/data/AppDatabase_Impl;->_searchHistoryEntityDao:Lh7/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/study/data/SearchHistoryEntityDao;

    .line 8
    .line 9
    return-object v0
.end method

.method public subjectEntityDao()Lcom/zykj/study/data/SubjectEntityDao;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/data/AppDatabase_Impl;->_subjectEntityDao:Lh7/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/study/data/SubjectEntityDao;

    .line 8
    .line 9
    return-object v0
.end method
