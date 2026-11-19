.class public final Lcom/zykj/evaluation/di/entity/UploadAnswerDao_Impl$2;
.super Landroidx/room/EntityDeleteOrUpdateAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/evaluation/di/entity/UploadAnswerDao_Impl;-><init>(Landroidx/room/RoomDatabase;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/room/EntityDeleteOrUpdateAdapter<",
        "Ln5/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u0002H\u0014\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "com/zykj/evaluation/di/entity/UploadAnswerDao_Impl$2",
        "Landroidx/room/EntityDeleteOrUpdateAdapter;",
        "Ln5/h;",
        "",
        "createQuery",
        "()Ljava/lang/String;",
        "Landroidx/sqlite/SQLiteStatement;",
        "statement",
        "entity",
        "",
        "a",
        "(Landroidx/sqlite/SQLiteStatement;Ln5/h;)V",
        "app_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic a:Lcom/zykj/evaluation/di/entity/UploadAnswerDao_Impl;


# direct methods
.method public constructor <init>(Lcom/zykj/evaluation/di/entity/UploadAnswerDao_Impl;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/evaluation/di/entity/UploadAnswerDao_Impl$2;->a:Lcom/zykj/evaluation/di/entity/UploadAnswerDao_Impl;

    .line 2
    .line 3
    invoke-direct {p0}, Landroidx/room/EntityDeleteOrUpdateAdapter;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(Landroidx/sqlite/SQLiteStatement;Ln5/h;)V
    .locals 3

    .line 1
    const-string v0, "statement"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "entity"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    invoke-virtual {p2}, Ln5/h;->d()J

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
    invoke-virtual {p2}, Ln5/h;->a()J

    .line 21
    .line 22
    .line 23
    move-result-wide v1

    .line 24
    invoke-interface {p1, v0, v1, v2}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p2}, Ln5/h;->b()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    int-to-long v0, v0

    .line 32
    const/4 v2, 0x3

    .line 33
    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 34
    .line 35
    .line 36
    const/4 v0, 0x4

    .line 37
    invoke-virtual {p2}, Ln5/h;->e()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-interface {p1, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 42
    .line 43
    .line 44
    iget-object v0, p0, Lcom/zykj/evaluation/di/entity/UploadAnswerDao_Impl$2;->a:Lcom/zykj/evaluation/di/entity/UploadAnswerDao_Impl;

    .line 45
    .line 46
    invoke-static {v0}, Lcom/zykj/evaluation/di/entity/UploadAnswerDao_Impl;->k(Lcom/zykj/evaluation/di/entity/UploadAnswerDao_Impl;)Lcom/zykj/evaluation/di/converter/UploadDataConverter;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-virtual {p2}, Ln5/h;->c()Lcom/zykj/evaluation/bean/UploadData;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-virtual {v0, v1}, Lcom/zykj/evaluation/di/converter/UploadDataConverter;->d(Lcom/zykj/evaluation/bean/UploadData;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    const/4 v1, 0x5

    .line 59
    if-nez v0, :cond_0

    .line 60
    .line 61
    invoke-interface {p1, v1}, Landroidx/sqlite/SQLiteStatement;->bindNull(I)V

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_0
    invoke-interface {p1, v1, v0}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 66
    .line 67
    .line 68
    :goto_0
    const/4 v0, 0x6

    .line 69
    invoke-virtual {p2}, Ln5/h;->d()J

    .line 70
    .line 71
    .line 72
    move-result-wide v1

    .line 73
    invoke-interface {p1, v0, v1, v2}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 74
    .line 75
    .line 76
    const/4 v0, 0x7

    .line 77
    invoke-virtual {p2}, Ln5/h;->a()J

    .line 78
    .line 79
    .line 80
    move-result-wide v1

    .line 81
    invoke-interface {p1, v0, v1, v2}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p2}, Ln5/h;->b()I

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    int-to-long v0, v0

    .line 89
    const/16 v2, 0x8

    .line 90
    .line 91
    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 92
    .line 93
    .line 94
    const/16 v0, 0x9

    .line 95
    .line 96
    invoke-virtual {p2}, Ln5/h;->e()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p2

    .line 100
    invoke-interface {p1, v0, p2}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 101
    .line 102
    .line 103
    return-void
.end method

.method public bridge synthetic bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Ln5/h;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/di/entity/UploadAnswerDao_Impl$2;->a(Landroidx/sqlite/SQLiteStatement;Ln5/h;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public createQuery()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "UPDATE OR ABORT `upload_answer` SET `user_id` = ?,`task_id` = ?,`task_state` = ?,`uuid` = ?,`upload_data` = ? WHERE `user_id` = ? AND `task_id` = ? AND `task_state` = ? AND `uuid` = ?"

    .line 2
    .line 3
    return-object v0
.end method
