.class public final Lcom/friday/common/dao/UserDao_Impl$1;
.super Landroidx/room/EntityInsertAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/common/dao/UserDao_Impl;-><init>(Landroidx/room/RoomDatabase;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/room/EntityInsertAdapter<",
        "Lcom/friday/common/entity/User;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/room/EntityInsertAdapter;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public a(Landroidx/sqlite/SQLiteStatement;Lcom/friday/common/entity/User;)V
    .locals 4

    .line 1
    const-string v0, "statement"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "entity"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    invoke-virtual {p2}, Lcom/friday/common/entity/User;->getAccountId()J

    .line 13
    .line 14
    .line 15
    move-result-wide v1

    .line 16
    invoke-interface {p1, v0, v1, v2}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 17
    .line 18
    .line 19
    const/4 v0, 0x2

    .line 20
    invoke-virtual {p2}, Lcom/friday/common/entity/User;->getAccountName()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-interface {p1, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const/4 v0, 0x3

    .line 28
    invoke-virtual {p2}, Lcom/friday/common/entity/User;->getHeadPhotoUrl()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-interface {p1, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 33
    .line 34
    .line 35
    const/4 v0, 0x4

    .line 36
    invoke-virtual {p2}, Lcom/friday/common/entity/User;->getUserName()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-interface {p1, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 41
    .line 42
    .line 43
    const/4 v0, 0x5

    .line 44
    invoke-virtual {p2}, Lcom/friday/common/entity/User;->getUnit()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-interface {p1, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p2}, Lcom/friday/common/entity/User;->getCameraPermission()Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    const/4 v1, 0x6

    .line 56
    int-to-long v2, v0

    .line 57
    invoke-interface {p1, v1, v2, v3}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p2}, Lcom/friday/common/entity/User;->getAlbumPermission()Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    const/4 v1, 0x7

    .line 65
    int-to-long v2, v0

    .line 66
    invoke-interface {p1, v1, v2, v3}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p2}, Lcom/friday/common/entity/User;->getScreenshotsPermission()Z

    .line 70
    .line 71
    .line 72
    move-result p2

    .line 73
    const/16 v0, 0x8

    .line 74
    .line 75
    int-to-long v1, p2

    .line 76
    invoke-interface {p1, v0, v1, v2}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 77
    .line 78
    .line 79
    return-void
.end method

.method public bridge synthetic bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/friday/common/entity/User;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/friday/common/dao/UserDao_Impl$1;->a(Landroidx/sqlite/SQLiteStatement;Lcom/friday/common/entity/User;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public createQuery()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "INSERT OR REPLACE INTO `User` (`accountId`,`accountName`,`headPhotoUrl`,`userName`,`unit`,`cameraPermission`,`albumPermission`,`screenshotsPermission`) VALUES (?,?,?,?,?,?,?,?)"

    .line 2
    .line 3
    return-object v0
.end method
