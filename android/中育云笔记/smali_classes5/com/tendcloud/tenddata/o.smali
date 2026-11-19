.class public final Lcom/tendcloud/tenddata/o;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tendcloud/tenddata/o$b;,
        Lcom/tendcloud/tenddata/o$a;,
        Lcom/tendcloud/tenddata/o$c;
    }
.end annotation


# static fields
.field public static final a:Ljava/lang/String; = "native"

.field public static final b:Ljava/lang/String; = "hybrid"

.field public static final c:Ljava/lang/String; = "currentElements"

.field public static final d:Ljava/lang/String; = "native_value"

.field public static final e:Ljava/lang/String; = "hybrid_value"

.field private static final f:Ljava/lang/String; = "TDcodeless_config.db"

.field private static volatile g:Lcom/tendcloud/tenddata/o; = null

.field private static final h:I = 0x1

.field private static i:Landroid/database/sqlite/SQLiteDatabase; = null

.field private static j:I = 0x0

.field private static final n:I = 0x1388000


# instance fields
.field private final k:I

.field private final l:I

.field private final m:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput v0, p0, Lcom/tendcloud/tenddata/o;->k:I

    .line 6
    .line 7
    const/4 v0, 0x2

    .line 8
    iput v0, p0, Lcom/tendcloud/tenddata/o;->l:I

    .line 9
    .line 10
    const/4 v0, 0x3

    .line 11
    iput v0, p0, Lcom/tendcloud/tenddata/o;->m:I

    .line 12
    .line 13
    return-void
.end method

.method private declared-synchronized a(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;I)J
    .locals 3

    monitor-enter p0

    .line 7
    :try_start_0
    invoke-static {p1}, Lcom/tendcloud/tenddata/cq;->b(Ljava/lang/String;)Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-wide/16 v1, 0x0

    if-eqz v0, :cond_0

    .line 8
    monitor-exit p0

    return-wide v1

    .line 9
    :cond_0
    :try_start_1
    sget-object v0, Lcom/tendcloud/tenddata/o;->i:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 v0, 0x1

    if-eq p5, v0, :cond_3

    const/4 v0, 0x2

    if-eq p5, v0, :cond_2

    const/4 p2, 0x3

    if-eq p5, p2, :cond_1

    goto :goto_1

    .line 10
    :cond_1
    :try_start_2
    sget-object p2, Lcom/tendcloud/tenddata/o;->i:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {p2, p1, p3, p4}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result p1

    :goto_0
    int-to-long v1, p1

    goto :goto_1

    .line 11
    :cond_2
    sget-object p5, Lcom/tendcloud/tenddata/o;->i:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {p5, p1, p2, p3, p4}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result p1

    goto :goto_0

    .line 12
    :cond_3
    sget-object p3, Lcom/tendcloud/tenddata/o;->i:Landroid/database/sqlite/SQLiteDatabase;

    const/4 p4, 0x0

    invoke-virtual {p3, p1, p4, p2}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    move-result-wide v1

    .line 13
    :goto_1
    sget-object p1, Lcom/tendcloud/tenddata/o;->i:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 14
    :try_start_3
    sget-object p1, Lcom/tendcloud/tenddata/o;->i:Landroid/database/sqlite/SQLiteDatabase;

    :goto_2
    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    goto :goto_3

    :catchall_0
    move-exception p1

    goto :goto_4

    :catchall_1
    sget-object p1, Lcom/tendcloud/tenddata/o;->i:Landroid/database/sqlite/SQLiteDatabase;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_2

    .line 15
    :goto_3
    monitor-exit p0

    return-wide v1

    :goto_4
    :try_start_4
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw p1
.end method

.method public static a()Lcom/tendcloud/tenddata/o;
    .locals 2

    .line 1
    sget-object v0, Lcom/tendcloud/tenddata/o;->g:Lcom/tendcloud/tenddata/o;

    if-nez v0, :cond_1

    .line 2
    const-class v0, Lcom/tendcloud/tenddata/o;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, Lcom/tendcloud/tenddata/o;->g:Lcom/tendcloud/tenddata/o;

    if-nez v1, :cond_0

    .line 4
    new-instance v1, Lcom/tendcloud/tenddata/o;

    invoke-direct {v1}, Lcom/tendcloud/tenddata/o;-><init>()V

    sput-object v1, Lcom/tendcloud/tenddata/o;->g:Lcom/tendcloud/tenddata/o;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    .line 5
    :cond_0
    :goto_0
    monitor-exit v0

    goto :goto_2

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 6
    :cond_1
    :goto_2
    sget-object v0, Lcom/tendcloud/tenddata/o;->g:Lcom/tendcloud/tenddata/o;

    return-object v0
.end method

.method private declared-synchronized f()V
    .locals 7

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    .line 3
    .line 4
    if-eqz v0, :cond_4

    .line 5
    .line 6
    sget-object v1, Lcom/tendcloud/tenddata/o;->i:Landroid/database/sqlite/SQLiteDatabase;

    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    if-nez v1, :cond_3

    .line 10
    .line 11
    const-string v1, "TDcodeless_config.db"

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    const/4 v4, 0x0

    .line 15
    invoke-virtual {v0, v1, v3, v4}, Landroid/content/Context;->openOrCreateDatabase(Ljava/lang/String;ILandroid/database/sqlite/SQLiteDatabase$CursorFactory;)Landroid/database/sqlite/SQLiteDatabase;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sput-object v0, Lcom/tendcloud/tenddata/o;->i:Landroid/database/sqlite/SQLiteDatabase;

    .line 20
    .line 21
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    .line 22
    .line 23
    const-string v1, "TDcodeless_config.db"

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Landroid/content/Context;->getDatabasePath(Ljava/lang/String;)Ljava/io/File;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    invoke-virtual {v0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-nez v3, :cond_0

    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    invoke-virtual {v3}, Ljava/io/File;->mkdirs()Z

    .line 48
    .line 49
    .line 50
    :cond_0
    invoke-virtual {v0}, Ljava/io/File;->length()J

    .line 51
    .line 52
    .line 53
    move-result-wide v3

    .line 54
    const-wide/32 v5, 0x1194000

    .line 55
    .line 56
    .line 57
    cmp-long v3, v3, v5

    .line 58
    .line 59
    if-lez v3, :cond_1

    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/io/File;->length()J

    .line 62
    .line 63
    .line 64
    move-result-wide v3

    .line 65
    const-wide/32 v5, 0x136f000

    .line 66
    .line 67
    .line 68
    cmp-long v0, v3, v5

    .line 69
    .line 70
    if-lez v0, :cond_1

    .line 71
    .line 72
    invoke-static {}, Lcom/tendcloud/tenddata/o;->g()V

    .line 73
    .line 74
    .line 75
    invoke-direct {p0}, Lcom/tendcloud/tenddata/o;->h()V

    .line 76
    .line 77
    .line 78
    :cond_1
    sget-object v0, Lcom/tendcloud/tenddata/o;->i:Landroid/database/sqlite/SQLiteDatabase;

    .line 79
    .line 80
    const-wide/32 v3, 0x1388000

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0, v3, v4}, Landroid/database/sqlite/SQLiteDatabase;->setMaximumSize(J)J

    .line 84
    .line 85
    .line 86
    sput v2, Lcom/tendcloud/tenddata/o;->j:I

    .line 87
    .line 88
    if-nez v1, :cond_2

    .line 89
    .line 90
    invoke-direct {p0}, Lcom/tendcloud/tenddata/o;->h()V

    .line 91
    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_2
    sget-object v0, Lcom/tendcloud/tenddata/o;->i:Landroid/database/sqlite/SQLiteDatabase;

    .line 95
    .line 96
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->getVersion()I

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    if-le v2, v0, :cond_4

    .line 101
    .line 102
    invoke-static {}, Lcom/tendcloud/tenddata/o;->g()V

    .line 103
    .line 104
    .line 105
    invoke-direct {p0}, Lcom/tendcloud/tenddata/o;->h()V

    .line 106
    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_3
    sget v0, Lcom/tendcloud/tenddata/o;->j:I

    .line 110
    .line 111
    add-int/2addr v0, v2

    .line 112
    sput v0, Lcom/tendcloud/tenddata/o;->j:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 113
    .line 114
    :catchall_0
    :cond_4
    :goto_0
    monitor-exit p0

    .line 115
    return-void
.end method

.method private static g()V
    .locals 2

    .line 1
    sget-object v0, Lcom/tendcloud/tenddata/o;->i:Landroid/database/sqlite/SQLiteDatabase;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->setVersion(I)V

    .line 5
    .line 6
    .line 7
    sget-object v0, Lcom/tendcloud/tenddata/o;->i:Landroid/database/sqlite/SQLiteDatabase;

    .line 8
    .line 9
    invoke-static {v0}, Lcom/tendcloud/tenddata/o$c;->access$000(Landroid/database/sqlite/SQLiteDatabase;)V

    .line 10
    .line 11
    .line 12
    sget-object v0, Lcom/tendcloud/tenddata/o;->i:Landroid/database/sqlite/SQLiteDatabase;

    .line 13
    .line 14
    invoke-static {v0}, Lcom/tendcloud/tenddata/o$a;->access$100(Landroid/database/sqlite/SQLiteDatabase;)V

    .line 15
    .line 16
    .line 17
    sget-object v0, Lcom/tendcloud/tenddata/o;->i:Landroid/database/sqlite/SQLiteDatabase;

    .line 18
    .line 19
    invoke-static {v0}, Lcom/tendcloud/tenddata/o$b;->access$200(Landroid/database/sqlite/SQLiteDatabase;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method private h()V
    .locals 2

    .line 1
    sget-object v0, Lcom/tendcloud/tenddata/o;->i:Landroid/database/sqlite/SQLiteDatabase;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->setVersion(I)V

    .line 5
    .line 6
    .line 7
    sget-object v0, Lcom/tendcloud/tenddata/o;->i:Landroid/database/sqlite/SQLiteDatabase;

    .line 8
    .line 9
    invoke-static {v0}, Lcom/tendcloud/tenddata/o$c;->access$300(Landroid/database/sqlite/SQLiteDatabase;)V

    .line 10
    .line 11
    .line 12
    sget-object v0, Lcom/tendcloud/tenddata/o;->i:Landroid/database/sqlite/SQLiteDatabase;

    .line 13
    .line 14
    invoke-static {v0}, Lcom/tendcloud/tenddata/o$a;->access$400(Landroid/database/sqlite/SQLiteDatabase;)V

    .line 15
    .line 16
    .line 17
    sget-object v0, Lcom/tendcloud/tenddata/o;->i:Landroid/database/sqlite/SQLiteDatabase;

    .line 18
    .line 19
    invoke-static {v0}, Lcom/tendcloud/tenddata/o$b;->access$500(Landroid/database/sqlite/SQLiteDatabase;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method private declared-synchronized i()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sget v0, Lcom/tendcloud/tenddata/o;->j:I

    .line 3
    .line 4
    add-int/lit8 v0, v0, -0x1

    .line 5
    .line 6
    sput v0, Lcom/tendcloud/tenddata/o;->j:I

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    sput v0, Lcom/tendcloud/tenddata/o;->j:I

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    sget-object v0, Lcom/tendcloud/tenddata/o;->i:Landroid/database/sqlite/SQLiteDatabase;

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteClosable;->close()V

    .line 22
    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    sput-object v0, Lcom/tendcloud/tenddata/o;->i:Landroid/database/sqlite/SQLiteDatabase;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :catchall_0
    move-exception v0

    .line 29
    goto :goto_1

    .line 30
    :cond_0
    :goto_0
    monitor-exit p0

    .line 31
    return-void

    .line 32
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 33
    throw v0
.end method


# virtual methods
.method public declared-synchronized a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)J
    .locals 6

    monitor-enter p0

    .line 16
    :try_start_0
    new-instance v2, Landroid/content/ContentValues;

    invoke-direct {v2}, Landroid/content/ContentValues;-><init>()V

    .line 17
    const-string v0, ""

    .line 18
    invoke-virtual {p3}, Ljava/lang/String;->hashCode()I

    move-result v1

    const v3, -0x7a2da670

    const/4 v4, 0x1

    const/4 v5, 0x2

    if-eq v1, v3, :cond_2

    const v3, -0x47b09e04

    if-eq v1, v3, :cond_1

    const v3, -0x3ebdafe9

    if-eq v1, v3, :cond_0

    goto :goto_0

    :cond_0
    const-string v1, "native"

    invoke-virtual {p3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_3

    const/4 p3, 0x0

    goto :goto_1

    :catchall_0
    move-object v0, p0

    goto/16 :goto_4

    :cond_1
    const-string v1, "hybrid"

    invoke-virtual {p3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_3

    move p3, v5

    goto :goto_1

    :cond_2
    const-string v1, "currentElements"

    invoke-virtual {p3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_3

    move p3, v4

    goto :goto_1

    :cond_3
    :goto_0
    const/4 p3, -0x1

    :goto_1
    if-eqz p3, :cond_6

    if-eq p3, v4, :cond_5

    if-eq p3, v5, :cond_4

    :goto_2
    move-object v1, v0

    goto :goto_3

    .line 19
    :cond_4
    const-string v0, "hybrid"

    .line 20
    const-string p3, "url"

    invoke-virtual {v2, p3, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    const-string p1, "events"

    invoke-virtual {v2, p1, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    .line 22
    :cond_5
    const-string v0, "ce"

    .line 23
    const-string p3, "value"

    invoke-virtual {v2, p3, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    const-string p1, "events"

    invoke-virtual {v2, p1, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    .line 25
    :cond_6
    const-string v0, "native"

    .line 26
    const-string p3, "page_name"

    invoke-virtual {v2, p3, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 27
    const-string p1, "events"

    invoke-virtual {v2, p1, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    .line 28
    :goto_3
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "[CodelessSQLiteDataSaver] saveConfig :tableName: "

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, "\nevents: "

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "\n"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/tendcloud/tenddata/ca;->dForInternal([Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v3, 0x0

    move-object v0, p0

    .line 29
    :try_start_1
    invoke-direct/range {v0 .. v5}, Lcom/tendcloud/tenddata/o;->a(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;I)J

    move-result-wide p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    monitor-exit p0

    return-wide p1

    .line 30
    :catchall_1
    :goto_4
    monitor-exit p0

    const-wide/16 p1, -0x1

    return-wide p1
.end method

.method public declared-synchronized a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 18

    move-object/from16 v0, p2

    monitor-enter p0

    if-eqz p1, :cond_b

    if-nez v0, :cond_0

    goto/16 :goto_8

    .line 31
    :cond_0
    :try_start_0
    const-string v1, ""

    .line 32
    const-string v2, ""

    .line 33
    const-string v3, ""
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    const/4 v4, 0x0

    .line 34
    :try_start_1
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v5

    const v6, -0x7a2da670

    const/4 v7, 0x1

    const/4 v8, 0x2

    const/4 v9, 0x0

    if-eq v5, v6, :cond_3

    const v6, -0x47b09e04

    if-eq v5, v6, :cond_2

    const v6, -0x3ebdafe9

    if-eq v5, v6, :cond_1

    goto :goto_0

    :cond_1
    const-string v5, "native"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    move v0, v9

    goto :goto_1

    :catchall_0
    move-exception v0

    goto/16 :goto_6

    :cond_2
    const-string v5, "hybrid"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    move v0, v8

    goto :goto_1

    :cond_3
    const-string v5, "currentElements"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    move v0, v7

    goto :goto_1

    :cond_4
    :goto_0
    const/4 v0, -0x1

    :goto_1
    if-eqz v0, :cond_7

    if-eq v0, v7, :cond_6

    if-eq v0, v8, :cond_5

    :goto_2
    move-object v11, v1

    goto :goto_3

    .line 35
    :cond_5
    const-string v1, "hybrid"

    .line 36
    const-string v2, "url"

    goto :goto_2

    .line 37
    :cond_6
    const-string v1, "ce"

    .line 38
    const-string v2, "value"

    goto :goto_2

    .line 39
    :cond_7
    const-string v1, "native"

    .line 40
    const-string v2, "page_name"

    goto :goto_2

    .line 41
    :goto_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 42
    sget-object v10, Lcom/tendcloud/tenddata/o;->i:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "events"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " = ?"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    filled-new-array/range {p1 .. p1}, [Ljava/lang/String;

    move-result-object v14

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/4 v15, 0x0

    invoke-virtual/range {v10 .. v17}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v4

    .line 43
    invoke-interface {v4}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 44
    :goto_4
    invoke-interface {v4}, Landroid/database/Cursor;->isAfterLast()Z

    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v0, :cond_8

    .line 45
    :try_start_2
    invoke-interface {v4, v9}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 46
    :try_start_3
    invoke-interface {v4}, Landroid/database/Cursor;->moveToNext()Z

    goto :goto_4

    .line 47
    :catchall_1
    invoke-interface {v4}, Landroid/database/Cursor;->moveToNext()Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_4

    .line 48
    :cond_8
    :goto_5
    :try_start_4
    invoke-interface {v4}, Landroid/database/Cursor;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    goto :goto_7

    :catchall_2
    move-exception v0

    goto :goto_9

    .line 49
    :goto_6
    :try_start_5
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    if-eqz v4, :cond_9

    goto :goto_5

    .line 50
    :cond_9
    :goto_7
    monitor-exit p0

    return-object v3

    :catchall_3
    move-exception v0

    if-eqz v4, :cond_a

    .line 51
    :try_start_6
    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    :cond_a
    throw v0

    .line 52
    :cond_b
    :goto_8
    const-string v0, ""
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    monitor-exit p0

    return-object v0

    :goto_9
    :try_start_7
    monitor-exit p0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    throw v0
.end method

.method public declared-synchronized b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)J
    .locals 8

    monitor-enter p0

    const-wide/16 v0, -0x1

    if-nez p1, :cond_0

    .line 2
    monitor-exit p0

    return-wide v0

    .line 3
    :cond_0
    :try_start_0
    new-instance v4, Landroid/content/ContentValues;

    invoke-direct {v4}, Landroid/content/ContentValues;-><init>()V

    .line 4
    const-string v2, "events"

    invoke-virtual {v4, v2, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 5
    invoke-virtual {p3}, Ljava/lang/String;->hashCode()I

    move-result p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    const v2, -0x7a2da670

    const/4 v3, 0x1

    const/4 v5, 0x2

    if-eq p2, v2, :cond_3

    const v2, -0x47b09e04

    if-eq p2, v2, :cond_2

    const v2, -0x3ebdafe9

    if-eq p2, v2, :cond_1

    goto :goto_0

    :cond_1
    :try_start_1
    const-string p2, "native"

    invoke-virtual {p3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_4

    const/4 p2, 0x0

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object p1, v0

    move-object v2, p0

    goto :goto_3

    :cond_2
    const-string p2, "hybrid"

    invoke-virtual {p3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz p2, :cond_4

    move p2, v5

    goto :goto_1

    :cond_3
    :try_start_2
    const-string p2, "currentElements"

    invoke-virtual {p3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    if-eqz p2, :cond_4

    move p2, v3

    goto :goto_1

    :cond_4
    :goto_0
    const/4 p2, -0x1

    :goto_1
    if-eqz p2, :cond_7

    if-eq p2, v3, :cond_6

    if-eq p2, v5, :cond_5

    .line 6
    monitor-exit p0

    return-wide v0

    .line 7
    :cond_5
    :try_start_3
    const-string v3, "hybrid"

    const-string v5, "url=?"

    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object v6
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    const/4 v7, 0x2

    move-object v2, p0

    :try_start_4
    invoke-direct/range {v2 .. v7}, Lcom/tendcloud/tenddata/o;->a(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;I)J

    move-result-wide p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    monitor-exit p0

    return-wide p1

    :catchall_1
    move-exception v0

    :goto_2
    move-object p1, v0

    goto :goto_3

    :catchall_2
    move-exception v0

    move-object v2, p0

    goto :goto_2

    :cond_6
    move-object v2, p0

    .line 8
    :try_start_5
    const-string v3, "ce"

    const-string v5, "value=?"

    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x2

    invoke-direct/range {v2 .. v7}, Lcom/tendcloud/tenddata/o;->a(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;I)J

    move-result-wide p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    monitor-exit p0

    return-wide p1

    :cond_7
    move-object v2, p0

    .line 9
    :try_start_6
    const-string v3, "native"

    const-string v5, "page_name=?"

    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x2

    invoke-direct/range {v2 .. v7}, Lcom/tendcloud/tenddata/o;->a(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;I)J

    move-result-wide p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    monitor-exit p0

    return-wide p1

    :goto_3
    :try_start_7
    monitor-exit p0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    throw p1
.end method

.method public b()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/tendcloud/tenddata/o;->f()V

    return-void
.end method

.method public c()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/tendcloud/tenddata/o;->i()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public d()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/tendcloud/tenddata/o;->i:Landroid/database/sqlite/SQLiteDatabase;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->isOpen()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    return v0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    return v0
.end method

.method public dropTable(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/4 v1, -0x1

    .line 9
    sparse-switch v0, :sswitch_data_0

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :sswitch_0
    const-string v0, "native"

    .line 14
    .line 15
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-nez p1, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 v1, 0x2

    .line 23
    goto :goto_0

    .line 24
    :sswitch_1
    const-string v0, "hybrid"

    .line 25
    .line 26
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-nez p1, :cond_1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    const/4 v1, 0x1

    .line 34
    goto :goto_0

    .line 35
    :sswitch_2
    const-string v0, "currentElements"

    .line 36
    .line 37
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-nez p1, :cond_2

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    const/4 v1, 0x0

    .line 45
    :goto_0
    packed-switch v1, :pswitch_data_0

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :pswitch_0
    sget-object p1, Lcom/tendcloud/tenddata/o;->i:Landroid/database/sqlite/SQLiteDatabase;

    .line 50
    .line 51
    invoke-static {p1}, Lcom/tendcloud/tenddata/o$c;->access$000(Landroid/database/sqlite/SQLiteDatabase;)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :pswitch_1
    sget-object p1, Lcom/tendcloud/tenddata/o;->i:Landroid/database/sqlite/SQLiteDatabase;

    .line 56
    .line 57
    invoke-static {p1}, Lcom/tendcloud/tenddata/o$b;->access$200(Landroid/database/sqlite/SQLiteDatabase;)V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :pswitch_2
    sget-object p1, Lcom/tendcloud/tenddata/o;->i:Landroid/database/sqlite/SQLiteDatabase;

    .line 62
    .line 63
    invoke-static {p1}, Lcom/tendcloud/tenddata/o$a;->access$100(Landroid/database/sqlite/SQLiteDatabase;)V

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :sswitch_data_0
    .sparse-switch
        -0x7a2da670 -> :sswitch_2
        -0x47b09e04 -> :sswitch_1
        -0x3ebdafe9 -> :sswitch_0
    .end sparse-switch

    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public declared-synchronized e()Z
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-direct {p0}, Lcom/tendcloud/tenddata/o;->i()V

    .line 3
    .line 4
    .line 5
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    .line 6
    .line 7
    const-string v1, "TDcodeless_config.db"

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/content/Context;->getDatabasePath(Ljava/lang/String;)Ljava/io/File;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 14
    .line 15
    .line 16
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    monitor-exit p0

    .line 20
    const/4 v0, 0x1

    .line 21
    return v0

    .line 22
    :cond_0
    :try_start_1
    invoke-static {v0}, Landroid/database/sqlite/SQLiteDatabase;->deleteDatabase(Ljava/io/File;)Z

    .line 23
    .line 24
    .line 25
    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 26
    monitor-exit p0

    .line 27
    return v0

    .line 28
    :catchall_0
    move-exception v0

    .line 29
    :try_start_2
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 30
    .line 31
    .line 32
    monitor-exit p0

    .line 33
    const/4 v0, 0x0

    .line 34
    return v0

    .line 35
    :catchall_1
    move-exception v0

    .line 36
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 37
    throw v0
.end method

.method public open(Landroid/content/Context;)V
    .locals 1

    .line 1
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    sput-object p1, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    .line 12
    .line 13
    :cond_0
    invoke-direct {p0}, Lcom/tendcloud/tenddata/o;->f()V

    .line 14
    .line 15
    .line 16
    return-void
.end method
