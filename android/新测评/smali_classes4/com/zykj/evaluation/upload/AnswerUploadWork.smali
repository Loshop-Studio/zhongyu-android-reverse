.class public final Lcom/zykj/evaluation/upload/AnswerUploadWork;
.super Lcom/zykj/evaluation/upload/UploadWork;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation build Landroidx/hilt/work/HiltWorker;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/evaluation/upload/AnswerUploadWork$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001 B-\u0008\u0007\u0012\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u000cH\u0096@\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\u000c2\u0006\u0010\u0010\u001a\u00020\u000fH\u0096@\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0018\u0010\u0015\u001a\u00020\u000c2\u0006\u0010\u0014\u001a\u00020\u0013H\u0096@\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002\u00a2\u0006\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001f\u00a8\u0006!"
    }
    d2 = {
        "Lcom/zykj/evaluation/upload/AnswerUploadWork;",
        "Lcom/zykj/evaluation/upload/UploadWork;",
        "Landroid/content/Context;",
        "context",
        "Landroidx/work/WorkerParameters;",
        "workerParams",
        "Lcom/zykj/evaluation/upload/OssTaskManger;",
        "ossTaskManger",
        "Lcom/zykj/evaluation/di/AppDatabase;",
        "database",
        "<init>",
        "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lcom/zykj/evaluation/upload/OssTaskManger;Lcom/zykj/evaluation/di/AppDatabase;)V",
        "",
        "h",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "",
        "uploadUrl",
        "i",
        "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "",
        "key",
        "g",
        "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "Lm5/e;",
        "commitState",
        "Ln5/h;",
        "m",
        "(Ljava/lang/String;Lm5/e;)Ln5/h;",
        "e",
        "Lcom/zykj/evaluation/upload/OssTaskManger;",
        "f",
        "Lcom/zykj/evaluation/di/AppDatabase;",
        "a",
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


# static fields
.field public static final g:Lcom/zykj/evaluation/upload/AnswerUploadWork$a;

.field public static final h:I


# instance fields
.field public final e:Lcom/zykj/evaluation/upload/OssTaskManger;

.field public final f:Lcom/zykj/evaluation/di/AppDatabase;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/evaluation/upload/AnswerUploadWork$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/evaluation/upload/AnswerUploadWork$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/zykj/evaluation/upload/AnswerUploadWork;->g:Lcom/zykj/evaluation/upload/AnswerUploadWork$a;

    const/16 v0, 0x8

    sput v0, Lcom/zykj/evaluation/upload/AnswerUploadWork;->h:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;Lcom/zykj/evaluation/upload/OssTaskManger;Lcom/zykj/evaluation/di/AppDatabase;)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "workerParams"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "ossTaskManger"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "database"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0, p1, p2, p3}, Lcom/zykj/evaluation/upload/UploadWork;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;Lcom/zykj/evaluation/upload/OssTaskManger;)V

    .line 22
    .line 23
    .line 24
    iput-object p3, p0, Lcom/zykj/evaluation/upload/AnswerUploadWork;->e:Lcom/zykj/evaluation/upload/OssTaskManger;

    .line 25
    .line 26
    iput-object p4, p0, Lcom/zykj/evaluation/upload/AnswerUploadWork;->f:Lcom/zykj/evaluation/di/AppDatabase;

    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method public g(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/Exception;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    const-string v2, "AnswerUploadWork failed, key is "

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-direct {v0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-static {v0}, Lcom/tencent/bugly/crashreport/CrashReport;->postCatchedException(Ljava/lang/Throwable;)V

    .line 24
    .line 25
    .line 26
    iget-object p1, p0, Lcom/zykj/evaluation/upload/AnswerUploadWork;->f:Lcom/zykj/evaluation/di/AppDatabase;

    .line 27
    .line 28
    invoke-virtual {p1}, Lcom/zykj/evaluation/di/AppDatabase;->h()Ln5/i;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    const-string v0, ""

    .line 33
    .line 34
    sget-object v1, Lm5/e$a;->b:Lm5/e$a;

    .line 35
    .line 36
    invoke-virtual {p0, v0, v1}, Lcom/zykj/evaluation/upload/AnswerUploadWork;->m(Ljava/lang/String;Lm5/e;)Ln5/h;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-interface {p1, v0, p2}, Ln5/i;->c(Ln5/h;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    if-ne p1, p2, :cond_0

    .line 49
    .line 50
    return-object p1

    .line 51
    :cond_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 52
    .line 53
    return-object p1
.end method

.method public h(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 2
    .line 3
    return-object p1
.end method

.method public i(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/upload/AnswerUploadWork;->f:Lcom/zykj/evaluation/di/AppDatabase;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/evaluation/di/AppDatabase;->h()Ln5/i;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Lm5/e$b;->b:Lm5/e$b;

    .line 8
    .line 9
    invoke-virtual {p0, p1, v1}, Lcom/zykj/evaluation/upload/AnswerUploadWork;->m(Ljava/lang/String;Lm5/e;)Ln5/h;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-interface {v0, p1, p2}, Ln5/i;->c(Ln5/h;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    if-ne p1, p2, :cond_0

    .line 22
    .line 23
    return-object p1

    .line 24
    :cond_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 25
    .line 26
    return-object p1
.end method

.method public final m(Ljava/lang/String;Lm5/e;)Ln5/h;
    .locals 12

    .line 1
    invoke-virtual {p0}, Landroidx/work/ListenableWorker;->getInputData()Landroidx/work/Data;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "USER_ID"

    .line 6
    .line 7
    const-wide/16 v2, -0x1

    .line 8
    .line 9
    invoke-virtual {v0, v1, v2, v3}, Landroidx/work/Data;->getLong(Ljava/lang/String;J)J

    .line 10
    .line 11
    .line 12
    move-result-wide v5

    .line 13
    invoke-virtual {p0}, Landroidx/work/ListenableWorker;->getInputData()Landroidx/work/Data;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const-string v1, "TASK_ID"

    .line 18
    .line 19
    invoke-virtual {v0, v1, v2, v3}, Landroidx/work/Data;->getLong(Ljava/lang/String;J)J

    .line 20
    .line 21
    .line 22
    move-result-wide v7

    .line 23
    invoke-virtual {p0}, Landroidx/work/ListenableWorker;->getInputData()Landroidx/work/Data;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const-string v1, "TASK_STATE"

    .line 28
    .line 29
    const/4 v2, -0x1

    .line 30
    invoke-virtual {v0, v1, v2}, Landroidx/work/Data;->getInt(Ljava/lang/String;I)I

    .line 31
    .line 32
    .line 33
    move-result v9

    .line 34
    invoke-virtual {p0}, Landroidx/work/ListenableWorker;->getInputData()Landroidx/work/Data;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    const-string v1, "UUID"

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Landroidx/work/Data;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    const-string v1, ""

    .line 45
    .line 46
    if-nez v0, :cond_0

    .line 47
    .line 48
    move-object v10, v1

    .line 49
    goto :goto_0

    .line 50
    :cond_0
    move-object v10, v0

    .line 51
    :goto_0
    invoke-virtual {p0}, Landroidx/work/ListenableWorker;->getInputData()Landroidx/work/Data;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    const-string v2, "INPUT_FILE_ABSOLUTE_PATH"

    .line 56
    .line 57
    invoke-virtual {v0, v2}, Landroidx/work/Data;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    if-nez v0, :cond_1

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_1
    move-object v1, v0

    .line 65
    :goto_1
    new-instance v4, Ln5/h;

    .line 66
    .line 67
    new-instance v11, Lcom/zykj/evaluation/bean/UploadData;

    .line 68
    .line 69
    invoke-virtual {p2}, Lm5/e;->a()I

    .line 70
    .line 71
    .line 72
    move-result p2

    .line 73
    invoke-direct {v11, v10, v1, p1, p2}, Lcom/zykj/evaluation/bean/UploadData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 74
    .line 75
    .line 76
    invoke-direct/range {v4 .. v11}, Ln5/h;-><init>(JJILjava/lang/String;Lcom/zykj/evaluation/bean/UploadData;)V

    .line 77
    .line 78
    .line 79
    return-object v4
.end method
