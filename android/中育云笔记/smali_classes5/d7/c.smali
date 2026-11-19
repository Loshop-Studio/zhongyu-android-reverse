.class public Ld7/c;
.super Landroid/database/sqlite/SQLiteOpenHelper;
.source "SourceFile"


# static fields
.field public static final g:Ljava/util/concurrent/locks/Lock;


# instance fields
.field public c:Ld7/f;

.field public d:Ld7/f;

.field public e:Ld7/f;

.field public f:Ld7/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ld7/c;->g:Ljava/util/concurrent/locks/Lock;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-static {}, Lb7/a;->h()Lb7/a;

    move-result-object v0

    invoke-virtual {v0}, Lb7/a;->f()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p0, v0}, Ld7/c;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 20

    move-object/from16 v0, p0

    .line 2
    const-string v1, "okgo.db"

    const/4 v2, 0x0

    const/4 v3, 0x1

    move-object/from16 v4, p1

    invoke-direct {v0, v4, v1, v2, v3}, Landroid/database/sqlite/SQLiteOpenHelper;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)V

    .line 3
    new-instance v1, Ld7/f;

    const-string v2, "cache"

    invoke-direct {v1, v2}, Ld7/f;-><init>(Ljava/lang/String;)V

    iput-object v1, v0, Ld7/c;->c:Ld7/f;

    .line 4
    new-instance v1, Ld7/f;

    const-string v2, "cookie"

    invoke-direct {v1, v2}, Ld7/f;-><init>(Ljava/lang/String;)V

    iput-object v1, v0, Ld7/c;->d:Ld7/f;

    .line 5
    new-instance v1, Ld7/f;

    const-string v4, "download"

    invoke-direct {v1, v4}, Ld7/f;-><init>(Ljava/lang/String;)V

    iput-object v1, v0, Ld7/c;->e:Ld7/f;

    .line 6
    new-instance v1, Ld7/f;

    const-string v4, "upload"

    invoke-direct {v1, v4}, Ld7/f;-><init>(Ljava/lang/String;)V

    iput-object v1, v0, Ld7/c;->f:Ld7/f;

    .line 7
    iget-object v1, v0, Ld7/c;->c:Ld7/f;

    new-instance v4, Ld7/b;

    const-string v5, "key"

    const-string v6, "VARCHAR"

    invoke-direct {v4, v5, v6, v3, v3}, Ld7/b;-><init>(Ljava/lang/String;Ljava/lang/String;ZZ)V

    invoke-virtual {v1, v4}, Ld7/f;->a(Ld7/b;)Ld7/f;

    move-result-object v1

    new-instance v4, Ld7/b;

    const-string v5, "localExpire"

    const-string v7, "INTEGER"

    invoke-direct {v4, v5, v7}, Ld7/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    invoke-virtual {v1, v4}, Ld7/f;->a(Ld7/b;)Ld7/f;

    move-result-object v1

    new-instance v4, Ld7/b;

    const-string v5, "head"

    const-string v8, "BLOB"

    invoke-direct {v4, v5, v8}, Ld7/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    invoke-virtual {v1, v4}, Ld7/f;->a(Ld7/b;)Ld7/f;

    move-result-object v1

    new-instance v4, Ld7/b;

    const-string v5, "data"

    invoke-direct {v4, v5, v8}, Ld7/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    invoke-virtual {v1, v4}, Ld7/f;->a(Ld7/b;)Ld7/f;

    .line 11
    iget-object v1, v0, Ld7/c;->d:Ld7/f;

    new-instance v4, Ld7/b;

    const-string v5, "host"

    invoke-direct {v4, v5, v6}, Ld7/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v4}, Ld7/f;->a(Ld7/b;)Ld7/f;

    move-result-object v1

    new-instance v4, Ld7/b;

    const-string v9, "name"

    invoke-direct {v4, v9, v6}, Ld7/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    invoke-virtual {v1, v4}, Ld7/f;->a(Ld7/b;)Ld7/f;

    move-result-object v1

    new-instance v4, Ld7/b;

    const-string v10, "domain"

    invoke-direct {v4, v10, v6}, Ld7/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    invoke-virtual {v1, v4}, Ld7/f;->a(Ld7/b;)Ld7/f;

    move-result-object v1

    new-instance v4, Ld7/b;

    invoke-direct {v4, v2, v8}, Ld7/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    invoke-virtual {v1, v4}, Ld7/f;->a(Ld7/b;)Ld7/f;

    move-result-object v1

    new-instance v2, Ld7/b;

    filled-new-array {v5, v9, v10}, [Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v4}, Ld7/b;-><init>([Ljava/lang/String;)V

    .line 15
    invoke-virtual {v1, v2}, Ld7/f;->a(Ld7/b;)Ld7/f;

    .line 16
    iget-object v1, v0, Ld7/c;->e:Ld7/f;

    new-instance v2, Ld7/b;

    const-string v4, "tag"

    invoke-direct {v2, v4, v6, v3, v3}, Ld7/b;-><init>(Ljava/lang/String;Ljava/lang/String;ZZ)V

    invoke-virtual {v1, v2}, Ld7/f;->a(Ld7/b;)Ld7/f;

    move-result-object v1

    new-instance v2, Ld7/b;

    const-string v5, "url"

    invoke-direct {v2, v5, v6}, Ld7/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    invoke-virtual {v1, v2}, Ld7/f;->a(Ld7/b;)Ld7/f;

    move-result-object v1

    new-instance v2, Ld7/b;

    const-string v9, "folder"

    invoke-direct {v2, v9, v6}, Ld7/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 18
    invoke-virtual {v1, v2}, Ld7/f;->a(Ld7/b;)Ld7/f;

    move-result-object v1

    new-instance v2, Ld7/b;

    const-string v10, "filePath"

    invoke-direct {v2, v10, v6}, Ld7/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    invoke-virtual {v1, v2}, Ld7/f;->a(Ld7/b;)Ld7/f;

    move-result-object v1

    new-instance v2, Ld7/b;

    const-string v11, "fileName"

    invoke-direct {v2, v11, v6}, Ld7/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    invoke-virtual {v1, v2}, Ld7/f;->a(Ld7/b;)Ld7/f;

    move-result-object v1

    new-instance v2, Ld7/b;

    const-string v12, "fraction"

    invoke-direct {v2, v12, v6}, Ld7/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    invoke-virtual {v1, v2}, Ld7/f;->a(Ld7/b;)Ld7/f;

    move-result-object v1

    new-instance v2, Ld7/b;

    const-string v13, "totalSize"

    invoke-direct {v2, v13, v7}, Ld7/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    invoke-virtual {v1, v2}, Ld7/f;->a(Ld7/b;)Ld7/f;

    move-result-object v1

    new-instance v2, Ld7/b;

    const-string v14, "currentSize"

    invoke-direct {v2, v14, v7}, Ld7/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    invoke-virtual {v1, v2}, Ld7/f;->a(Ld7/b;)Ld7/f;

    move-result-object v1

    new-instance v2, Ld7/b;

    const-string v15, "status"

    invoke-direct {v2, v15, v7}, Ld7/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    invoke-virtual {v1, v2}, Ld7/f;->a(Ld7/b;)Ld7/f;

    move-result-object v1

    new-instance v2, Ld7/b;

    const-string v3, "priority"

    invoke-direct {v2, v3, v7}, Ld7/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    invoke-virtual {v1, v2}, Ld7/f;->a(Ld7/b;)Ld7/f;

    move-result-object v1

    new-instance v2, Ld7/b;

    move-object/from16 p1, v3

    const-string v3, "date"

    invoke-direct {v2, v3, v7}, Ld7/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 26
    invoke-virtual {v1, v2}, Ld7/f;->a(Ld7/b;)Ld7/f;

    move-result-object v1

    new-instance v2, Ld7/b;

    move-object/from16 v16, v3

    const-string v3, "request"

    invoke-direct {v2, v3, v8}, Ld7/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 27
    invoke-virtual {v1, v2}, Ld7/f;->a(Ld7/b;)Ld7/f;

    move-result-object v1

    new-instance v2, Ld7/b;

    move-object/from16 v17, v3

    const-string v3, "extra1"

    invoke-direct {v2, v3, v8}, Ld7/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 28
    invoke-virtual {v1, v2}, Ld7/f;->a(Ld7/b;)Ld7/f;

    move-result-object v1

    new-instance v2, Ld7/b;

    move-object/from16 v18, v3

    const-string v3, "extra2"

    invoke-direct {v2, v3, v8}, Ld7/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    invoke-virtual {v1, v2}, Ld7/f;->a(Ld7/b;)Ld7/f;

    move-result-object v1

    new-instance v2, Ld7/b;

    move-object/from16 v19, v3

    const-string v3, "extra3"

    invoke-direct {v2, v3, v8}, Ld7/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    invoke-virtual {v1, v2}, Ld7/f;->a(Ld7/b;)Ld7/f;

    .line 31
    iget-object v1, v0, Ld7/c;->f:Ld7/f;

    new-instance v2, Ld7/b;

    const/4 v3, 0x1

    invoke-direct {v2, v4, v6, v3, v3}, Ld7/b;-><init>(Ljava/lang/String;Ljava/lang/String;ZZ)V

    invoke-virtual {v1, v2}, Ld7/f;->a(Ld7/b;)Ld7/f;

    move-result-object v1

    new-instance v2, Ld7/b;

    invoke-direct {v2, v5, v6}, Ld7/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    invoke-virtual {v1, v2}, Ld7/f;->a(Ld7/b;)Ld7/f;

    move-result-object v1

    new-instance v2, Ld7/b;

    invoke-direct {v2, v9, v6}, Ld7/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 33
    invoke-virtual {v1, v2}, Ld7/f;->a(Ld7/b;)Ld7/f;

    move-result-object v1

    new-instance v2, Ld7/b;

    invoke-direct {v2, v10, v6}, Ld7/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    invoke-virtual {v1, v2}, Ld7/f;->a(Ld7/b;)Ld7/f;

    move-result-object v1

    new-instance v2, Ld7/b;

    invoke-direct {v2, v11, v6}, Ld7/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    invoke-virtual {v1, v2}, Ld7/f;->a(Ld7/b;)Ld7/f;

    move-result-object v1

    new-instance v2, Ld7/b;

    invoke-direct {v2, v12, v6}, Ld7/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    invoke-virtual {v1, v2}, Ld7/f;->a(Ld7/b;)Ld7/f;

    move-result-object v1

    new-instance v2, Ld7/b;

    invoke-direct {v2, v13, v7}, Ld7/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    invoke-virtual {v1, v2}, Ld7/f;->a(Ld7/b;)Ld7/f;

    move-result-object v1

    new-instance v2, Ld7/b;

    invoke-direct {v2, v14, v7}, Ld7/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 38
    invoke-virtual {v1, v2}, Ld7/f;->a(Ld7/b;)Ld7/f;

    move-result-object v1

    new-instance v2, Ld7/b;

    invoke-direct {v2, v15, v7}, Ld7/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 39
    invoke-virtual {v1, v2}, Ld7/f;->a(Ld7/b;)Ld7/f;

    move-result-object v1

    new-instance v2, Ld7/b;

    move-object/from16 v3, p1

    invoke-direct {v2, v3, v7}, Ld7/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    invoke-virtual {v1, v2}, Ld7/f;->a(Ld7/b;)Ld7/f;

    move-result-object v1

    new-instance v2, Ld7/b;

    move-object/from16 v3, v16

    invoke-direct {v2, v3, v7}, Ld7/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 41
    invoke-virtual {v1, v2}, Ld7/f;->a(Ld7/b;)Ld7/f;

    move-result-object v1

    new-instance v2, Ld7/b;

    move-object/from16 v3, v17

    invoke-direct {v2, v3, v8}, Ld7/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 42
    invoke-virtual {v1, v2}, Ld7/f;->a(Ld7/b;)Ld7/f;

    move-result-object v1

    new-instance v2, Ld7/b;

    move-object/from16 v3, v18

    invoke-direct {v2, v3, v8}, Ld7/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 43
    invoke-virtual {v1, v2}, Ld7/f;->a(Ld7/b;)Ld7/f;

    move-result-object v1

    new-instance v2, Ld7/b;

    move-object/from16 v3, v19

    invoke-direct {v2, v3, v8}, Ld7/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    invoke-virtual {v1, v2}, Ld7/f;->a(Ld7/b;)Ld7/f;

    move-result-object v1

    new-instance v2, Ld7/b;

    const-string v3, "extra3"

    invoke-direct {v2, v3, v8}, Ld7/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 45
    invoke-virtual {v1, v2}, Ld7/f;->a(Ld7/b;)Ld7/f;

    return-void
.end method


# virtual methods
.method public onCreate(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ld7/c;->c:Ld7/f;

    .line 2
    .line 3
    invoke-virtual {v0}, Ld7/f;->b()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Ld7/c;->d:Ld7/f;

    .line 11
    .line 12
    invoke-virtual {v0}, Ld7/f;->b()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Ld7/c;->e:Ld7/f;

    .line 20
    .line 21
    invoke-virtual {v0}, Ld7/f;->b()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Ld7/c;->f:Ld7/f;

    .line 29
    .line 30
    invoke-virtual {v0}, Ld7/f;->b()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public onDowngrade(Landroid/database/sqlite/SQLiteDatabase;II)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Ld7/c;->onUpgrade(Landroid/database/sqlite/SQLiteDatabase;II)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onUpgrade(Landroid/database/sqlite/SQLiteDatabase;II)V
    .locals 0

    .line 1
    iget-object p2, p0, Ld7/c;->c:Ld7/f;

    .line 2
    .line 3
    invoke-static {p1, p2}, Ld7/d;->a(Landroid/database/sqlite/SQLiteDatabase;Ld7/f;)Z

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    if-eqz p2, :cond_0

    .line 8
    .line 9
    const-string p2, "DROP TABLE IF EXISTS cache"

    .line 10
    .line 11
    invoke-virtual {p1, p2}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    iget-object p2, p0, Ld7/c;->d:Ld7/f;

    .line 15
    .line 16
    invoke-static {p1, p2}, Ld7/d;->a(Landroid/database/sqlite/SQLiteDatabase;Ld7/f;)Z

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    if-eqz p2, :cond_1

    .line 21
    .line 22
    const-string p2, "DROP TABLE IF EXISTS cookie"

    .line 23
    .line 24
    invoke-virtual {p1, p2}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    :cond_1
    iget-object p2, p0, Ld7/c;->e:Ld7/f;

    .line 28
    .line 29
    invoke-static {p1, p2}, Ld7/d;->a(Landroid/database/sqlite/SQLiteDatabase;Ld7/f;)Z

    .line 30
    .line 31
    .line 32
    move-result p2

    .line 33
    if-eqz p2, :cond_2

    .line 34
    .line 35
    const-string p2, "DROP TABLE IF EXISTS download"

    .line 36
    .line 37
    invoke-virtual {p1, p2}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    :cond_2
    iget-object p2, p0, Ld7/c;->f:Ld7/f;

    .line 41
    .line 42
    invoke-static {p1, p2}, Ld7/d;->a(Landroid/database/sqlite/SQLiteDatabase;Ld7/f;)Z

    .line 43
    .line 44
    .line 45
    move-result p2

    .line 46
    if-eqz p2, :cond_3

    .line 47
    .line 48
    const-string p2, "DROP TABLE IF EXISTS upload"

    .line 49
    .line 50
    invoke-virtual {p1, p2}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    :cond_3
    invoke-virtual {p0, p1}, Ld7/c;->onCreate(Landroid/database/sqlite/SQLiteDatabase;)V

    .line 54
    .line 55
    .line 56
    return-void
.end method
