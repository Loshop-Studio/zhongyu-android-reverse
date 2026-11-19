.class public final Lcom/zykj/huiwei/launcher/dao/PreviewDao_Impl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt3/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/huiwei/launcher/dao/PreviewDao_Impl$a;
    }
.end annotation


# static fields
.field public static final c:Lcom/zykj/huiwei/launcher/dao/PreviewDao_Impl$a;

.field public static final d:I


# instance fields
.field public final a:Landroidx/room/RoomDatabase;

.field public final b:Landroidx/room/EntityInsertAdapter;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/huiwei/launcher/dao/PreviewDao_Impl$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/huiwei/launcher/dao/PreviewDao_Impl$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/zykj/huiwei/launcher/dao/PreviewDao_Impl;->c:Lcom/zykj/huiwei/launcher/dao/PreviewDao_Impl$a;

    const/16 v0, 0x8

    sput v0, Lcom/zykj/huiwei/launcher/dao/PreviewDao_Impl;->d:I

    return-void
.end method

.method public constructor <init>(Landroidx/room/RoomDatabase;)V
    .locals 1

    .line 1
    const-string v0, "__db"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/dao/PreviewDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 10
    .line 11
    new-instance p1, Lcom/zykj/huiwei/launcher/dao/PreviewDao_Impl$1;

    .line 12
    .line 13
    invoke-direct {p1}, Lcom/zykj/huiwei/launcher/dao/PreviewDao_Impl$1;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/dao/PreviewDao_Impl;->b:Landroidx/room/EntityInsertAdapter;

    .line 17
    .line 18
    return-void
.end method

.method public static synthetic c(Ljava/lang/String;Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lcom/zykj/huiwei/launcher/dao/PDFPreviewInfo;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/huiwei/launcher/dao/PreviewDao_Impl;->e(Ljava/lang/String;Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lcom/zykj/huiwei/launcher/dao/PDFPreviewInfo;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lcom/zykj/huiwei/launcher/dao/PreviewDao_Impl;Lcom/zykj/huiwei/launcher/dao/PDFPreviewInfo;Landroidx/sqlite/SQLiteConnection;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/huiwei/launcher/dao/PreviewDao_Impl;->f(Lcom/zykj/huiwei/launcher/dao/PreviewDao_Impl;Lcom/zykj/huiwei/launcher/dao/PDFPreviewInfo;Landroidx/sqlite/SQLiteConnection;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Ljava/lang/String;Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lcom/zykj/huiwei/launcher/dao/PDFPreviewInfo;
    .locals 3

    .line 1
    const-string v0, "_connection"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p2, p0}, Landroidx/sqlite/SQLiteConnection;->prepare(Ljava/lang/String;)Landroidx/sqlite/SQLiteStatement;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const/4 p2, 0x1

    .line 11
    :try_start_0
    invoke-interface {p0, p2, p1}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const-string p1, "path"

    .line 15
    .line 16
    invoke-static {p0, p1}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    const-string p2, "pageIndex"

    .line 21
    .line 22
    invoke-static {p0, p2}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 23
    .line 24
    .line 25
    move-result p2

    .line 26
    const-string v0, "pageOffset"

    .line 27
    .line 28
    invoke-static {p0, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->step()Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_0

    .line 37
    .line 38
    invoke-interface {p0, p1}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-interface {p0, p2}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 43
    .line 44
    .line 45
    move-result-wide v1

    .line 46
    long-to-int p2, v1

    .line 47
    invoke-interface {p0, v0}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    .line 48
    .line 49
    .line 50
    move-result-wide v0

    .line 51
    double-to-float v0, v0

    .line 52
    new-instance v1, Lcom/zykj/huiwei/launcher/dao/PDFPreviewInfo;

    .line 53
    .line 54
    invoke-direct {v1, p1, p2, v0}, Lcom/zykj/huiwei/launcher/dao/PDFPreviewInfo;-><init>(Ljava/lang/String;IF)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :catchall_0
    move-exception p1

    .line 59
    goto :goto_1

    .line 60
    :cond_0
    const/4 v1, 0x0

    .line 61
    :goto_0
    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 62
    .line 63
    .line 64
    return-object v1

    .line 65
    :goto_1
    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 66
    .line 67
    .line 68
    throw p1
.end method

.method public static final f(Lcom/zykj/huiwei/launcher/dao/PreviewDao_Impl;Lcom/zykj/huiwei/launcher/dao/PDFPreviewInfo;Landroidx/sqlite/SQLiteConnection;)Lkotlin/Unit;
    .locals 1

    .line 1
    const-string v0, "_connection"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lcom/zykj/huiwei/launcher/dao/PreviewDao_Impl;->b:Landroidx/room/EntityInsertAdapter;

    .line 7
    .line 8
    invoke-virtual {p0, p2, p1}, Landroidx/room/EntityInsertAdapter;->insert(Landroidx/sqlite/SQLiteConnection;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 12
    .line 13
    return-object p0
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lcom/zykj/huiwei/launcher/dao/PDFPreviewInfo;
    .locals 3

    .line 1
    const-string v0, "path"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/dao/PreviewDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 7
    .line 8
    new-instance v1, Lt3/d;

    .line 9
    .line 10
    const-string v2, "SELECT * FROM previewInfo WHERE path = ?"

    .line 11
    .line 12
    invoke-direct {v1, v2, p1}, Lt3/d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const/4 p1, 0x1

    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-static {v0, p1, v2, v1}, Landroidx/room/util/DBUtil;->performBlocking(Landroidx/room/RoomDatabase;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    check-cast p1, Lcom/zykj/huiwei/launcher/dao/PDFPreviewInfo;

    .line 22
    .line 23
    return-object p1
.end method

.method public b(Lcom/zykj/huiwei/launcher/dao/PDFPreviewInfo;)V
    .locals 3

    .line 1
    const-string v0, "info"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/dao/PreviewDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 7
    .line 8
    new-instance v1, Lt3/c;

    .line 9
    .line 10
    invoke-direct {v1, p0, p1}, Lt3/c;-><init>(Lcom/zykj/huiwei/launcher/dao/PreviewDao_Impl;Lcom/zykj/huiwei/launcher/dao/PDFPreviewInfo;)V

    .line 11
    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    const/4 v2, 0x1

    .line 15
    invoke-static {v0, p1, v2, v1}, Landroidx/room/util/DBUtil;->performBlocking(Landroidx/room/RoomDatabase;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    return-void
.end method
