.class public abstract Lcom/zykj/study/data/AppDatabase;
.super Landroidx/room/RoomDatabase;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation build Landroidx/room/Database;
    entities = {
        Lcom/zykj/study/data/CourseStudyEntity;,
        Lcom/zykj/study/data/CourseStudyKeyEntity;,
        Lcom/zykj/study/data/MyCourseEntity;,
        Lcom/zykj/study/data/MyCourseKeyEntity;,
        Lcom/zykj/study/data/PeriodEntity;,
        Lcom/zykj/study/data/GradeEntity;,
        Lcom/zykj/study/data/SubjectEntity;,
        Lcom/zykj/study/data/CatalogEntity;,
        Lcom/zykj/study/data/SearchHistoryEntity;,
        Lcom/zykj/study/data/PdfEntity;
    }
    exportSchema = false
    version = 0x3
.end annotation

.annotation build Landroidx/room/TypeConverters;
    value = {
        Lcom/zykj/study/data/Converters;
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/study/data/AppDatabase$Companion;
    }
.end annotation


# static fields
.field public static final $stable:I

.field public static final Companion:Lcom/zykj/study/data/AppDatabase$Companion;

.field private static final DATABASE_NAME:Ljava/lang/String; = "study.db"

.field private static final MIGRATION_1_2:Landroidx/room/migration/Migration;

.field private static final MIGRATION_2_3:Landroidx/room/migration/Migration;

.field private static volatile instance:Lcom/zykj/study/data/AppDatabase;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/zykj/study/data/AppDatabase$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/zykj/study/data/AppDatabase$Companion;-><init>(Lkotlin/jvm/internal/n;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/zykj/study/data/AppDatabase;->Companion:Lcom/zykj/study/data/AppDatabase$Companion;

    .line 8
    .line 9
    const/16 v0, 0x8

    .line 10
    .line 11
    sput v0, Lcom/zykj/study/data/AppDatabase;->$stable:I

    .line 12
    .line 13
    new-instance v0, Lcom/zykj/study/data/AppDatabase$Companion$MIGRATION_1_2$1;

    .line 14
    .line 15
    invoke-direct {v0}, Lcom/zykj/study/data/AppDatabase$Companion$MIGRATION_1_2$1;-><init>()V

    .line 16
    .line 17
    .line 18
    sput-object v0, Lcom/zykj/study/data/AppDatabase;->MIGRATION_1_2:Landroidx/room/migration/Migration;

    .line 19
    .line 20
    new-instance v0, Lcom/zykj/study/data/AppDatabase$Companion$MIGRATION_2_3$1;

    .line 21
    .line 22
    invoke-direct {v0}, Lcom/zykj/study/data/AppDatabase$Companion$MIGRATION_2_3$1;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, Lcom/zykj/study/data/AppDatabase;->MIGRATION_2_3:Landroidx/room/migration/Migration;

    .line 26
    .line 27
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/room/RoomDatabase;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$getInstance$cp()Lcom/zykj/study/data/AppDatabase;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/study/data/AppDatabase;->instance:Lcom/zykj/study/data/AppDatabase;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic access$getMIGRATION_1_2$cp()Landroidx/room/migration/Migration;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/study/data/AppDatabase;->MIGRATION_1_2:Landroidx/room/migration/Migration;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic access$getMIGRATION_2_3$cp()Landroidx/room/migration/Migration;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/study/data/AppDatabase;->MIGRATION_2_3:Landroidx/room/migration/Migration;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic access$setInstance$cp(Lcom/zykj/study/data/AppDatabase;)V
    .locals 0

    .line 1
    sput-object p0, Lcom/zykj/study/data/AppDatabase;->instance:Lcom/zykj/study/data/AppDatabase;

    .line 2
    .line 3
    return-void
.end method


# virtual methods
.method public abstract catalogEntityDao()Lcom/zykj/study/data/CatalogEntityDao;
.end method

.method public abstract courseStudyEntityDao()Lcom/zykj/study/data/CourseStudyEntityDao;
.end method

.method public abstract courseStudyKeyEntityDao()Lcom/zykj/study/data/CourseStudyKeyEntityDao;
.end method

.method public abstract gradeEntityDao()Lcom/zykj/study/data/GradeEntityDao;
.end method

.method public abstract myCourseEntityDao()Lcom/zykj/study/data/MyCourseEntityDao;
.end method

.method public abstract myCourseKeyEntityDao()Lcom/zykj/study/data/MyCourseKeyEntityDao;
.end method

.method public abstract pdfDao()Lcom/zykj/study/data/PdfDao;
.end method

.method public abstract periodEntityDao()Lcom/zykj/study/data/PeriodEntityDao;
.end method

.method public abstract searchHistoryEntityDao()Lcom/zykj/study/data/SearchHistoryEntityDao;
.end method

.method public abstract subjectEntityDao()Lcom/zykj/study/data/SubjectEntityDao;
.end method
