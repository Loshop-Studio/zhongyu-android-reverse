.class public abstract Lcom/friday/common/MyDataBase;
.super Landroidx/room/RoomDatabase;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation build Landroidx/room/Database;
    entities = {
        Lcom/friday/common/entity/User;,
        Lcom/friday/common/entity/FileEntity;,
        Lcom/friday/common/entity/ResourceEntity;,
        Lcom/friday/common/entity/ShareCacheEntity;,
        Lcom/friday/common/entity/PdfEntity;,
        Lcom/friday/common/entity/ImageSafetyEntity;
    }
    exportSchema = false
    version = 0xc
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/friday/common/MyDataBase$a;
    }
.end annotation


# static fields
.field public static final a:Lcom/friday/common/MyDataBase$a;

.field public static final b:I

.field public static final c:Landroidx/room/migration/Migration;

.field public static final d:Landroidx/room/migration/Migration;

.field public static final e:Landroidx/room/migration/Migration;

.field public static final f:Landroidx/room/migration/Migration;

.field public static final g:Landroidx/room/migration/Migration;

.field public static final h:Landroidx/room/migration/Migration;

.field public static final i:Landroidx/room/migration/Migration;

.field public static final j:Landroidx/room/migration/Migration;

.field public static final k:Landroidx/room/migration/Migration;

.field public static final l:Landroidx/room/migration/Migration;

.field public static final m:Landroidx/room/migration/Migration;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/friday/common/MyDataBase$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/friday/common/MyDataBase$a;-><init>(Lkotlin/jvm/internal/n;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/friday/common/MyDataBase;->a:Lcom/friday/common/MyDataBase$a;

    .line 8
    .line 9
    const/16 v0, 0x8

    .line 10
    .line 11
    sput v0, Lcom/friday/common/MyDataBase;->b:I

    .line 12
    .line 13
    new-instance v0, Lcom/friday/common/MyDataBase$Companion$MIGRATION_1_2$1;

    .line 14
    .line 15
    invoke-direct {v0}, Lcom/friday/common/MyDataBase$Companion$MIGRATION_1_2$1;-><init>()V

    .line 16
    .line 17
    .line 18
    sput-object v0, Lcom/friday/common/MyDataBase;->c:Landroidx/room/migration/Migration;

    .line 19
    .line 20
    new-instance v0, Lcom/friday/common/MyDataBase$Companion$MIGRATION_2_3$1;

    .line 21
    .line 22
    invoke-direct {v0}, Lcom/friday/common/MyDataBase$Companion$MIGRATION_2_3$1;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, Lcom/friday/common/MyDataBase;->d:Landroidx/room/migration/Migration;

    .line 26
    .line 27
    new-instance v0, Lcom/friday/common/MyDataBase$Companion$MIGRATION_3_4$1;

    .line 28
    .line 29
    invoke-direct {v0}, Lcom/friday/common/MyDataBase$Companion$MIGRATION_3_4$1;-><init>()V

    .line 30
    .line 31
    .line 32
    sput-object v0, Lcom/friday/common/MyDataBase;->e:Landroidx/room/migration/Migration;

    .line 33
    .line 34
    new-instance v0, Lcom/friday/common/MyDataBase$Companion$MIGRATION_4_5$1;

    .line 35
    .line 36
    invoke-direct {v0}, Lcom/friday/common/MyDataBase$Companion$MIGRATION_4_5$1;-><init>()V

    .line 37
    .line 38
    .line 39
    sput-object v0, Lcom/friday/common/MyDataBase;->f:Landroidx/room/migration/Migration;

    .line 40
    .line 41
    new-instance v0, Lcom/friday/common/MyDataBase$Companion$MIGRATION_5_6$1;

    .line 42
    .line 43
    invoke-direct {v0}, Lcom/friday/common/MyDataBase$Companion$MIGRATION_5_6$1;-><init>()V

    .line 44
    .line 45
    .line 46
    sput-object v0, Lcom/friday/common/MyDataBase;->g:Landroidx/room/migration/Migration;

    .line 47
    .line 48
    new-instance v0, Lcom/friday/common/MyDataBase$Companion$MIGRATION_6_7$1;

    .line 49
    .line 50
    invoke-direct {v0}, Lcom/friday/common/MyDataBase$Companion$MIGRATION_6_7$1;-><init>()V

    .line 51
    .line 52
    .line 53
    sput-object v0, Lcom/friday/common/MyDataBase;->h:Landroidx/room/migration/Migration;

    .line 54
    .line 55
    new-instance v0, Lcom/friday/common/MyDataBase$Companion$MIGRATION_7_8$1;

    .line 56
    .line 57
    invoke-direct {v0}, Lcom/friday/common/MyDataBase$Companion$MIGRATION_7_8$1;-><init>()V

    .line 58
    .line 59
    .line 60
    sput-object v0, Lcom/friday/common/MyDataBase;->i:Landroidx/room/migration/Migration;

    .line 61
    .line 62
    new-instance v0, Lcom/friday/common/MyDataBase$Companion$MIGRATION_8_9$1;

    .line 63
    .line 64
    invoke-direct {v0}, Lcom/friday/common/MyDataBase$Companion$MIGRATION_8_9$1;-><init>()V

    .line 65
    .line 66
    .line 67
    sput-object v0, Lcom/friday/common/MyDataBase;->j:Landroidx/room/migration/Migration;

    .line 68
    .line 69
    new-instance v0, Lcom/friday/common/MyDataBase$Companion$MIGRATION_9_10$1;

    .line 70
    .line 71
    invoke-direct {v0}, Lcom/friday/common/MyDataBase$Companion$MIGRATION_9_10$1;-><init>()V

    .line 72
    .line 73
    .line 74
    sput-object v0, Lcom/friday/common/MyDataBase;->k:Landroidx/room/migration/Migration;

    .line 75
    .line 76
    new-instance v0, Lcom/friday/common/MyDataBase$Companion$MIGRATION_10_11$1;

    .line 77
    .line 78
    invoke-direct {v0}, Lcom/friday/common/MyDataBase$Companion$MIGRATION_10_11$1;-><init>()V

    .line 79
    .line 80
    .line 81
    sput-object v0, Lcom/friday/common/MyDataBase;->l:Landroidx/room/migration/Migration;

    .line 82
    .line 83
    new-instance v0, Lcom/friday/common/MyDataBase$Companion$MIGRATION_11_12$1;

    .line 84
    .line 85
    invoke-direct {v0}, Lcom/friday/common/MyDataBase$Companion$MIGRATION_11_12$1;-><init>()V

    .line 86
    .line 87
    .line 88
    sput-object v0, Lcom/friday/common/MyDataBase;->m:Landroidx/room/migration/Migration;

    .line 89
    .line 90
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

.method public static final synthetic g()Landroidx/room/migration/Migration;
    .locals 1

    .line 1
    sget-object v0, Lcom/friday/common/MyDataBase;->l:Landroidx/room/migration/Migration;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic h()Landroidx/room/migration/Migration;
    .locals 1

    .line 1
    sget-object v0, Lcom/friday/common/MyDataBase;->m:Landroidx/room/migration/Migration;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic i()Landroidx/room/migration/Migration;
    .locals 1

    .line 1
    sget-object v0, Lcom/friday/common/MyDataBase;->c:Landroidx/room/migration/Migration;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic j()Landroidx/room/migration/Migration;
    .locals 1

    .line 1
    sget-object v0, Lcom/friday/common/MyDataBase;->d:Landroidx/room/migration/Migration;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic k()Landroidx/room/migration/Migration;
    .locals 1

    .line 1
    sget-object v0, Lcom/friday/common/MyDataBase;->e:Landroidx/room/migration/Migration;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic l()Landroidx/room/migration/Migration;
    .locals 1

    .line 1
    sget-object v0, Lcom/friday/common/MyDataBase;->f:Landroidx/room/migration/Migration;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic m()Landroidx/room/migration/Migration;
    .locals 1

    .line 1
    sget-object v0, Lcom/friday/common/MyDataBase;->g:Landroidx/room/migration/Migration;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic n()Landroidx/room/migration/Migration;
    .locals 1

    .line 1
    sget-object v0, Lcom/friday/common/MyDataBase;->h:Landroidx/room/migration/Migration;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic o()Landroidx/room/migration/Migration;
    .locals 1

    .line 1
    sget-object v0, Lcom/friday/common/MyDataBase;->i:Landroidx/room/migration/Migration;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic p()Landroidx/room/migration/Migration;
    .locals 1

    .line 1
    sget-object v0, Lcom/friday/common/MyDataBase;->j:Landroidx/room/migration/Migration;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic q()Landroidx/room/migration/Migration;
    .locals 1

    .line 1
    sget-object v0, Lcom/friday/common/MyDataBase;->k:Landroidx/room/migration/Migration;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public abstract r()Lcom/friday/common/dao/FileDao;
.end method

.method public abstract s()Lc2/v0;
.end method

.method public abstract t()Lc2/a1;
.end method

.method public abstract u()Lcom/friday/common/dao/ResourceDao;
.end method

.method public abstract v()Lc2/g2;
.end method

.method public abstract w()Lcom/friday/common/dao/UserDao;
.end method
