.class public Lxa/d$a;
.super Landroidx/room/EntityInsertionAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxa/d;-><init>(Landroidx/room/RoomDatabase;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lxa/d;


# direct methods
.method public constructor <init>(Lxa/d;Landroidx/room/RoomDatabase;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lxa/d$a;->a:Lxa/d;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Landroidx/room/EntityInsertionAdapter;-><init>(Landroidx/room/RoomDatabase;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public b(Landroidx/sqlite/db/SupportSQLiteStatement;Lxa/b;)V
    .locals 3

    .line 1
    invoke-virtual {p2}, Lxa/b;->f()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    int-to-long v0, v0

    .line 6
    const/4 v2, 0x1

    .line 7
    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/db/SupportSQLiteProgram;->bindLong(IJ)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p2}, Lxa/b;->d()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/4 v1, 0x2

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    invoke-interface {p1, v1}, Landroidx/sqlite/db/SupportSQLiteProgram;->bindNull(I)V

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-virtual {p2}, Lxa/b;->d()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-interface {p1, v1, v0}, Landroidx/sqlite/db/SupportSQLiteProgram;->bindString(ILjava/lang/String;)V

    .line 26
    .line 27
    .line 28
    :goto_0
    invoke-virtual {p2}, Lxa/b;->g()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    const/4 v1, 0x3

    .line 33
    if-nez v0, :cond_1

    .line 34
    .line 35
    invoke-interface {p1, v1}, Landroidx/sqlite/db/SupportSQLiteProgram;->bindNull(I)V

    .line 36
    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    invoke-virtual {p2}, Lxa/b;->g()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-interface {p1, v1, v0}, Landroidx/sqlite/db/SupportSQLiteProgram;->bindString(ILjava/lang/String;)V

    .line 44
    .line 45
    .line 46
    :goto_1
    const/4 v0, 0x4

    .line 47
    invoke-virtual {p2}, Lxa/b;->h()J

    .line 48
    .line 49
    .line 50
    move-result-wide v1

    .line 51
    invoke-interface {p1, v0, v1, v2}, Landroidx/sqlite/db/SupportSQLiteProgram;->bindLong(IJ)V

    .line 52
    .line 53
    .line 54
    const/4 v0, 0x5

    .line 55
    invoke-virtual {p2}, Lxa/b;->c()J

    .line 56
    .line 57
    .line 58
    move-result-wide v1

    .line 59
    invoke-interface {p1, v0, v1, v2}, Landroidx/sqlite/db/SupportSQLiteProgram;->bindLong(IJ)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p2}, Lxa/b;->i()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    const/4 v1, 0x6

    .line 67
    if-nez v0, :cond_2

    .line 68
    .line 69
    invoke-interface {p1, v1}, Landroidx/sqlite/db/SupportSQLiteProgram;->bindNull(I)V

    .line 70
    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_2
    invoke-virtual {p2}, Lxa/b;->i()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-interface {p1, v1, v0}, Landroidx/sqlite/db/SupportSQLiteProgram;->bindString(ILjava/lang/String;)V

    .line 78
    .line 79
    .line 80
    :goto_2
    iget-object v0, p0, Lxa/d$a;->a:Lxa/d;

    .line 81
    .line 82
    invoke-static {v0}, Lxa/d;->d(Lxa/d;)Lxa/a;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-virtual {p2}, Lxa/b;->e()Lcom/zykj/download/DownloadFlag;

    .line 87
    .line 88
    .line 89
    move-result-object p2

    .line 90
    invoke-virtual {v0, p2}, Lxa/a;->a(Lcom/zykj/download/DownloadFlag;)I

    .line 91
    .line 92
    .line 93
    move-result p2

    .line 94
    const/4 v0, 0x7

    .line 95
    int-to-long v1, p2

    .line 96
    invoke-interface {p1, v0, v1, v2}, Landroidx/sqlite/db/SupportSQLiteProgram;->bindLong(IJ)V

    .line 97
    .line 98
    .line 99
    return-void
.end method

.method public bridge synthetic bind(Landroidx/sqlite/db/SupportSQLiteStatement;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lxa/b;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lxa/d$a;->b(Landroidx/sqlite/db/SupportSQLiteStatement;Lxa/b;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public createQuery()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "INSERT OR REPLACE INTO `download` (`id`,`downloadUrl`,`localPath`,`totalSize`,`downloadSize`,`verifyCode`,`flag`) VALUES (nullif(?, 0),?,?,?,?,?,?)"

    .line 2
    .line 3
    return-object v0
.end method
