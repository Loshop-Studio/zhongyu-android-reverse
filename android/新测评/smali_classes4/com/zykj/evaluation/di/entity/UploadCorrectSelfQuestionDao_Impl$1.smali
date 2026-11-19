.class public final Lcom/zykj/evaluation/di/entity/UploadCorrectSelfQuestionDao_Impl$1;
.super Landroidx/room/EntityInsertAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/evaluation/di/entity/UploadCorrectSelfQuestionDao_Impl;-><init>(Landroidx/room/RoomDatabase;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/room/EntityInsertAdapter<",
        "Ln5/o;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u0002H\u0014\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "com/zykj/evaluation/di/entity/UploadCorrectSelfQuestionDao_Impl$1",
        "Landroidx/room/EntityInsertAdapter;",
        "Ln5/o;",
        "",
        "createQuery",
        "()Ljava/lang/String;",
        "Landroidx/sqlite/SQLiteStatement;",
        "statement",
        "entity",
        "",
        "a",
        "(Landroidx/sqlite/SQLiteStatement;Ln5/o;)V",
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
.field public final synthetic a:Lcom/zykj/evaluation/di/entity/UploadCorrectSelfQuestionDao_Impl;


# direct methods
.method public constructor <init>(Lcom/zykj/evaluation/di/entity/UploadCorrectSelfQuestionDao_Impl;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/evaluation/di/entity/UploadCorrectSelfQuestionDao_Impl$1;->a:Lcom/zykj/evaluation/di/entity/UploadCorrectSelfQuestionDao_Impl;

    .line 2
    .line 3
    invoke-direct {p0}, Landroidx/room/EntityInsertAdapter;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(Landroidx/sqlite/SQLiteStatement;Ln5/o;)V
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
    invoke-virtual {p2}, Ln5/o;->i()J

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
    invoke-virtual {p2}, Ln5/o;->g()J

    .line 21
    .line 22
    .line 23
    move-result-wide v1

    .line 24
    invoke-interface {p1, v0, v1, v2}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p2}, Ln5/o;->h()I

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
    invoke-virtual {p2}, Ln5/o;->f()J

    .line 38
    .line 39
    .line 40
    move-result-wide v1

    .line 41
    invoke-interface {p1, v0, v1, v2}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 42
    .line 43
    .line 44
    iget-object v0, p0, Lcom/zykj/evaluation/di/entity/UploadCorrectSelfQuestionDao_Impl$1;->a:Lcom/zykj/evaluation/di/entity/UploadCorrectSelfQuestionDao_Impl;

    .line 45
    .line 46
    invoke-static {v0}, Lcom/zykj/evaluation/di/entity/UploadCorrectSelfQuestionDao_Impl;->l(Lcom/zykj/evaluation/di/entity/UploadCorrectSelfQuestionDao_Impl;)Lcom/zykj/evaluation/di/converter/UploadDataConverter;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-virtual {p2}, Ln5/o;->c()Ljava/util/List;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-virtual {v0, v1}, Lcom/zykj/evaluation/di/converter/UploadDataConverter;->c(Ljava/util/List;)Ljava/lang/String;

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
    iget-object v0, p0, Lcom/zykj/evaluation/di/entity/UploadCorrectSelfQuestionDao_Impl$1;->a:Lcom/zykj/evaluation/di/entity/UploadCorrectSelfQuestionDao_Impl;

    .line 69
    .line 70
    invoke-static {v0}, Lcom/zykj/evaluation/di/entity/UploadCorrectSelfQuestionDao_Impl;->k(Lcom/zykj/evaluation/di/entity/UploadCorrectSelfQuestionDao_Impl;)Lcom/zykj/evaluation/di/converter/CommitSelfCorrectConverter;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-virtual {p2}, Ln5/o;->d()Ljava/util/List;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-virtual {v0, v1}, Lcom/zykj/evaluation/di/converter/CommitSelfCorrectConverter;->a(Ljava/util/List;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    const/4 v1, 0x6

    .line 83
    if-nez v0, :cond_1

    .line 84
    .line 85
    invoke-interface {p1, v1}, Landroidx/sqlite/SQLiteStatement;->bindNull(I)V

    .line 86
    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_1
    invoke-interface {p1, v1, v0}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 90
    .line 91
    .line 92
    :goto_1
    invoke-virtual {p2}, Ln5/o;->e()I

    .line 93
    .line 94
    .line 95
    move-result p2

    .line 96
    int-to-long v0, p2

    .line 97
    const/4 p2, 0x7

    .line 98
    invoke-interface {p1, p2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 99
    .line 100
    .line 101
    return-void
.end method

.method public bridge synthetic bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Ln5/o;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/di/entity/UploadCorrectSelfQuestionDao_Impl$1;->a(Landroidx/sqlite/SQLiteStatement;Ln5/o;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public createQuery()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "INSERT OR REPLACE INTO `upload_correct_self_question` (`user_id`,`task_id`,`task_state`,`question_id`,`answer_upload_data`,`commit_self_correct_req`,`commit_state`) VALUES (?,?,?,?,?,?,?)"

    .line 2
    .line 3
    return-object v0
.end method
