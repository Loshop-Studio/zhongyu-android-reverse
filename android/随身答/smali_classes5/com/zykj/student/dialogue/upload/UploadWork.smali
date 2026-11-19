.class public final Lcom/zykj/student/dialogue/upload/UploadWork;
.super Landroidx/work/CoroutineWorker;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation build Landroidx/hilt/work/HiltWorker;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/student/dialogue/upload/UploadWork$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u000b\u0008\u0007\u0018\u0000 \"2\u00020\u0001:\u0001 B%\u0008\u0007\u0012\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u0097@\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ2\u0010\u0015\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0082@\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J(\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0082@\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ(\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0082@\u00a2\u0006\u0004\u0008\u001b\u0010\u001aJ(\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0082@\u00a2\u0006\u0004\u0008\u001c\u0010\u001aJ\u001a\u0010\u001e\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u001d\u001a\u00020\u0011H\u0082@\u00a2\u0006\u0004\u0008\u001e\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010!\u00a8\u0006#"
    }
    d2 = {
        "Lcom/zykj/student/dialogue/upload/UploadWork;",
        "Landroidx/work/CoroutineWorker;",
        "Landroid/content/Context;",
        "context",
        "Landroidx/work/WorkerParameters;",
        "workerParams",
        "Lcom/zykj/student/dialogue/upload/OssTaskManger;",
        "ossTaskManger",
        "<init>",
        "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lcom/zykj/student/dialogue/upload/OssTaskManger;)V",
        "Landroidx/work/ListenableWorker$Result;",
        "doWork",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "",
        "type",
        "Ljava/io/File;",
        "file",
        "",
        "fileRelativePath",
        "Lcom/zykj/student/dialogue/upload/OssToken;",
        "credential",
        "e",
        "(ILjava/io/File;Ljava/lang/String;Lcom/zykj/student/dialogue/upload/OssToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "uploadPath",
        "",
        "c",
        "(Ljava/io/File;Ljava/lang/String;Lcom/zykj/student/dialogue/upload/OssToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "g",
        "d",
        "srcPath",
        "f",
        "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "a",
        "Lcom/zykj/student/dialogue/upload/OssTaskManger;",
        "b",
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

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nUploadWork.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UploadWork.kt\ncom/zykj/student/dialogue/upload/UploadWork\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 Data.kt\nandroidx/work/DataKt\n*L\n1#1,374:1\n13472#2,2:375\n31#3,5:377\n31#3,5:382\n31#3,5:387\n31#3,5:392\n31#3,5:397\n31#3,5:402\n31#3,5:407\n31#3,5:412\n31#3,5:417\n31#3,5:422\n*S KotlinDebug\n*F\n+ 1 UploadWork.kt\ncom/zykj/student/dialogue/upload/UploadWork\n*L\n105#1:375,2\n115#1:377,5\n126#1:382,5\n129#1:387,5\n144#1:392,5\n163#1:397,5\n171#1:402,5\n180#1:407,5\n189#1:412,5\n201#1:417,5\n204#1:422,5\n*E\n"
    }
.end annotation


# static fields
.field public static final b:Lcom/zykj/student/dialogue/upload/UploadWork$a;

.field public static final c:I

.field public static final d:Ljava/lang/String;


# instance fields
.field public final a:Lcom/zykj/student/dialogue/upload/OssTaskManger;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/zykj/student/dialogue/upload/UploadWork$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/zykj/student/dialogue/upload/UploadWork$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/zykj/student/dialogue/upload/UploadWork;->b:Lcom/zykj/student/dialogue/upload/UploadWork$a;

    .line 8
    .line 9
    const/16 v0, 0x8

    .line 10
    .line 11
    sput v0, Lcom/zykj/student/dialogue/upload/UploadWork;->c:I

    .line 12
    .line 13
    const-class v0, Lcom/zykj/student/dialogue/upload/UploadWork;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sput-object v0, Lcom/zykj/student/dialogue/upload/UploadWork;->d:Ljava/lang/String;

    .line 20
    .line 21
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;Lcom/zykj/student/dialogue/upload/OssTaskManger;)V
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
    invoke-direct {p0, p1, p2}, Landroidx/work/CoroutineWorker;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    .line 17
    .line 18
    .line 19
    iput-object p3, p0, Lcom/zykj/student/dialogue/upload/UploadWork;->a:Lcom/zykj/student/dialogue/upload/OssTaskManger;

    .line 20
    .line 21
    return-void
.end method

.method public static final synthetic b(Lcom/zykj/student/dialogue/upload/UploadWork;ILjava/io/File;Ljava/lang/String;Lcom/zykj/student/dialogue/upload/OssToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual/range {p0 .. p5}, Lcom/zykj/student/dialogue/upload/UploadWork;->e(ILjava/io/File;Ljava/lang/String;Lcom/zykj/student/dialogue/upload/OssToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public final c(Ljava/io/File;Ljava/lang/String;Lcom/zykj/student/dialogue/upload/OssToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6

    .line 1
    new-instance v0, Ll8/u$a;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-direct {v0, v2, v1, v2}, Ll8/u$a;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 6
    .line 7
    .line 8
    sget-object v1, Ll8/u;->k:Ll8/t;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ll8/u$a;->e(Ll8/t;)Ll8/u$a;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    sget-object v3, Ll8/x;->Companion:Ll8/x$a;

    .line 19
    .line 20
    sget-object v4, Ll8/t;->e:Ll8/t$a;

    .line 21
    .line 22
    const-string v5, "multipart/form-data"

    .line 23
    .line 24
    invoke-virtual {v4, v5}, Ll8/t$a;->b(Ljava/lang/String;)Ll8/t;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    invoke-virtual {v3, p1, v4}, Ll8/x$a;->a(Ljava/io/File;Ll8/t;)Ll8/x;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    const-string v3, "file"

    .line 33
    .line 34
    invoke-virtual {v0, v3, v1, p1}, Ll8/u$a;->a(Ljava/lang/String;Ljava/lang/String;Ll8/x;)Ll8/u$a;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {p1}, Ll8/u$a;->d()Ll8/u;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    new-instance v0, Ll8/w$a;

    .line 43
    .line 44
    invoke-direct {v0}, Ll8/w$a;-><init>()V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p3}, Lcom/zykj/student/dialogue/upload/OssToken;->getEndpoint()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    new-instance v3, Ljava/lang/StringBuilder;

    .line 52
    .line 53
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    const-string v1, "/"

    .line 60
    .line 61
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    invoke-virtual {v0, p2}, Ll8/w$a;->n(Ljava/lang/String;)Ll8/w$a;

    .line 72
    .line 73
    .line 74
    move-result-object p2

    .line 75
    invoke-virtual {p3}, Lcom/zykj/student/dialogue/upload/OssToken;->getSecurityToken()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p3

    .line 79
    new-instance v0, Ljava/lang/StringBuilder;

    .line 80
    .line 81
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 82
    .line 83
    .line 84
    const-string v1, "bearer "

    .line 85
    .line 86
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p3

    .line 96
    const-string v0, "Authorization"

    .line 97
    .line 98
    invoke-virtual {p2, v0, p3}, Ll8/w$a;->a(Ljava/lang/String;Ljava/lang/String;)Ll8/w$a;

    .line 99
    .line 100
    .line 101
    move-result-object p2

    .line 102
    const-string p3, "Checksum"

    .line 103
    .line 104
    const-string v0, "3f4e17759c6b9c6a364211895bbb2abdc0ba62db"

    .line 105
    .line 106
    invoke-virtual {p2, p3, v0}, Ll8/w$a;->a(Ljava/lang/String;Ljava/lang/String;)Ll8/w$a;

    .line 107
    .line 108
    .line 109
    move-result-object p2

    .line 110
    invoke-virtual {p2, p1}, Ll8/w$a;->k(Ll8/x;)Ll8/w$a;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    invoke-virtual {p1}, Ll8/w$a;->b()Ll8/w;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    .line 119
    .line 120
    .line 121
    move-result-object p2

    .line 122
    new-instance p3, Lcom/zykj/student/dialogue/upload/UploadWork$gridFsUpload$2;

    .line 123
    .line 124
    invoke-direct {p3, p1, v2}, Lcom/zykj/student/dialogue/upload/UploadWork$gridFsUpload$2;-><init>(Ll8/w;Lkotlin/coroutines/Continuation;)V

    .line 125
    .line 126
    .line 127
    invoke-static {p2, p3, p4}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    return-object p1
.end method

.method public final d(Ljava/io/File;Ljava/lang/String;Lcom/zykj/student/dialogue/upload/OssToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 10

    .line 1
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    const-string v2, "start ossUpload file--->"

    .line 11
    .line 12
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    new-instance v0, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 32
    .line 33
    .line 34
    const-string v1, "start ossUpload fileRelativePath--->"

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    new-instance v0, Lcom/alibaba/sdk/android/oss/common/auth/OSSStsTokenCredentialProvider;

    .line 54
    .line 55
    invoke-virtual {p3}, Lcom/zykj/student/dialogue/upload/OssToken;->getAccessKeyId()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-virtual {p3}, Lcom/zykj/student/dialogue/upload/OssToken;->getAccessKeySecret()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-virtual {p3}, Lcom/zykj/student/dialogue/upload/OssToken;->getSecurityToken()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    invoke-direct {v0, v1, v2, v3}, Lcom/alibaba/sdk/android/oss/common/auth/OSSStsTokenCredentialProvider;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p3}, Lcom/zykj/student/dialogue/upload/OssToken;->getEndpoint()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    invoke-virtual {p3}, Lcom/zykj/student/dialogue/upload/OssToken;->getBucket()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    new-instance v2, Ljava/lang/StringBuilder;

    .line 79
    .line 80
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    const-string v1, "."

    .line 87
    .line 88
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v5

    .line 95
    const/4 v8, 0x4

    .line 96
    const/4 v9, 0x0

    .line 97
    const-string v6, ""

    .line 98
    .line 99
    const/4 v7, 0x0

    .line 100
    invoke-static/range {v4 .. v9}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    new-instance v2, Lcom/alibaba/sdk/android/oss/OSSClient;

    .line 105
    .line 106
    invoke-virtual {p0}, Landroidx/work/ListenableWorker;->getApplicationContext()Landroid/content/Context;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    invoke-direct {v2, v3, v1, v0}, Lcom/alibaba/sdk/android/oss/OSSClient;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/alibaba/sdk/android/oss/common/auth/OSSCredentialProvider;)V

    .line 111
    .line 112
    .line 113
    new-instance v0, Lcom/alibaba/sdk/android/oss/model/PutObjectRequest;

    .line 114
    .line 115
    invoke-virtual {p3}, Lcom/zykj/student/dialogue/upload/OssToken;->getBucket()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object p3

    .line 119
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    invoke-direct {v0, p3, p2, v1}, Lcom/alibaba/sdk/android/oss/model/PutObjectRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    .line 127
    .line 128
    .line 129
    move-result-object p2

    .line 130
    new-instance p3, Lcom/zykj/student/dialogue/upload/UploadWork$ossUpload$2;

    .line 131
    .line 132
    const/4 v1, 0x0

    .line 133
    invoke-direct {p3, v2, v0, p1, v1}, Lcom/zykj/student/dialogue/upload/UploadWork$ossUpload$2;-><init>(Lcom/alibaba/sdk/android/oss/OSSClient;Lcom/alibaba/sdk/android/oss/model/PutObjectRequest;Ljava/io/File;Lkotlin/coroutines/Continuation;)V

    .line 134
    .line 135
    .line 136
    invoke-static {p2, p3, p4}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    return-object p1
.end method

.method public doWork(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    instance-of v2, v1, Lcom/zykj/student/dialogue/upload/UploadWork$doWork$1;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lcom/zykj/student/dialogue/upload/UploadWork$doWork$1;

    iget v3, v2, Lcom/zykj/student/dialogue/upload/UploadWork$doWork$1;->h:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lcom/zykj/student/dialogue/upload/UploadWork$doWork$1;->h:I

    :goto_0
    move-object v5, v2

    goto :goto_1

    :cond_0
    new-instance v2, Lcom/zykj/student/dialogue/upload/UploadWork$doWork$1;

    invoke-direct {v2, v0, v1}, Lcom/zykj/student/dialogue/upload/UploadWork$doWork$1;-><init>(Lcom/zykj/student/dialogue/upload/UploadWork;Lkotlin/coroutines/Continuation;)V

    goto :goto_0

    :goto_1
    iget-object v1, v5, Lcom/zykj/student/dialogue/upload/UploadWork$doWork$1;->f:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v6

    .line 1
    iget v2, v5, Lcom/zykj/student/dialogue/upload/UploadWork$doWork$1;->h:I

    const/4 v3, 0x4

    const/4 v4, 0x3

    const-string v7, "failure(...)"

    const-string v8, "ERROR_KEY"

    const-string v9, "EXTRA_DATA"

    const/4 v10, 0x0

    const/4 v11, 0x2

    const/4 v12, 0x1

    if-eqz v2, :cond_5

    if-eq v2, v12, :cond_4

    if-eq v2, v11, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v2, v5, Lcom/zykj/student/dialogue/upload/UploadWork$doWork$1;->d:Ljava/lang/Object;

    check-cast v2, Ljava/io/File;

    iget-object v2, v5, Lcom/zykj/student/dialogue/upload/UploadWork$doWork$1;->c:Ljava/lang/Object;

    check-cast v2, Lcom/zykj/student/dialogue/upload/OssData;

    iget-object v2, v5, Lcom/zykj/student/dialogue/upload/UploadWork$doWork$1;->b:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v2, v5, Lcom/zykj/student/dialogue/upload/UploadWork$doWork$1;->a:Ljava/lang/Object;

    check-cast v2, [Ljava/lang/String;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_15

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget v2, v5, Lcom/zykj/student/dialogue/upload/UploadWork$doWork$1;->e:I

    iget-object v4, v5, Lcom/zykj/student/dialogue/upload/UploadWork$doWork$1;->d:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v4, v5, Lcom/zykj/student/dialogue/upload/UploadWork$doWork$1;->c:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v4, v5, Lcom/zykj/student/dialogue/upload/UploadWork$doWork$1;->b:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v13, v5, Lcom/zykj/student/dialogue/upload/UploadWork$doWork$1;->a:Ljava/lang/Object;

    check-cast v13, [Ljava/lang/String;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_b

    :cond_3
    iget v2, v5, Lcom/zykj/student/dialogue/upload/UploadWork$doWork$1;->e:I

    iget-object v4, v5, Lcom/zykj/student/dialogue/upload/UploadWork$doWork$1;->b:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v13, v5, Lcom/zykj/student/dialogue/upload/UploadWork$doWork$1;->a:Ljava/lang/Object;

    check-cast v13, [Ljava/lang/String;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_d

    :cond_4
    iget v2, v5, Lcom/zykj/student/dialogue/upload/UploadWork$doWork$1;->e:I

    iget-object v4, v5, Lcom/zykj/student/dialogue/upload/UploadWork$doWork$1;->b:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v13, v5, Lcom/zykj/student/dialogue/upload/UploadWork$doWork$1;->a:Ljava/lang/Object;

    check-cast v13, [Ljava/lang/String;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_e

    :cond_5
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 2
    invoke-virtual {v0}, Landroidx/work/ListenableWorker;->getInputData()Landroidx/work/Data;

    move-result-object v1

    invoke-virtual {v1, v9}, Landroidx/work/Data;->getStringArray(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v13

    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    if-eqz v13, :cond_6

    .line 4
    array-length v2, v13

    move v14, v10

    :goto_2
    if-ge v14, v2, :cond_6

    aget-object v15, v13, v14

    .line 5
    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v14, v14, 0x1

    goto :goto_2

    .line 6
    :cond_6
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v14, "work start--->"

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 7
    invoke-static {}, Lcom/blankj/utilcode/util/NetworkUtils;->isConnected()Z

    move-result v1

    if-nez v1, :cond_9

    .line 8
    invoke-virtual {v0}, Landroidx/work/ListenableWorker;->getRunAttemptCount()I

    move-result v1

    if-ge v1, v12, :cond_7

    .line 9
    invoke-static {}, Landroidx/work/ListenableWorker$Result;->retry()Landroidx/work/ListenableWorker$Result;

    move-result-object v1

    .line 10
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    return-object v1

    :cond_7
    const/16 v1, 0x65

    .line 11
    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v8, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    .line 12
    invoke-static {v9, v13}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    filled-new-array {v1, v2}, [Lkotlin/Pair;

    move-result-object v1

    .line 13
    new-instance v2, Landroidx/work/Data$Builder;

    invoke-direct {v2}, Landroidx/work/Data$Builder;-><init>()V

    :goto_3
    if-ge v10, v11, :cond_8

    .line 14
    aget-object v3, v1, v10

    .line 15
    invoke-virtual {v3}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v3}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v4, v3}, Landroidx/work/Data$Builder;->put(Ljava/lang/String;Ljava/lang/Object;)Landroidx/work/Data$Builder;

    add-int/lit8 v10, v10, 0x1

    goto :goto_3

    .line 16
    :cond_8
    invoke-virtual {v2}, Landroidx/work/Data$Builder;->build()Landroidx/work/Data;

    move-result-object v1

    .line 17
    invoke-static {v1}, Landroidx/work/ListenableWorker$Result;->failure(Landroidx/work/Data;)Landroidx/work/ListenableWorker$Result;

    move-result-object v1

    .line 18
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    return-object v1

    .line 19
    :cond_9
    invoke-virtual {v0}, Landroidx/work/ListenableWorker;->getInputData()Landroidx/work/Data;

    move-result-object v1

    const-string v2, "INPUT_TYPE"

    const/4 v14, -0x1

    invoke-virtual {v1, v2, v14}, Landroidx/work/Data;->getInt(Ljava/lang/String;I)I

    move-result v2

    const/16 v1, 0x64

    if-ne v2, v14, :cond_b

    .line 20
    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v8, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    invoke-static {v9, v13}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    filled-new-array {v1, v2}, [Lkotlin/Pair;

    move-result-object v1

    .line 21
    new-instance v2, Landroidx/work/Data$Builder;

    invoke-direct {v2}, Landroidx/work/Data$Builder;-><init>()V

    :goto_4
    if-ge v10, v11, :cond_a

    .line 22
    aget-object v3, v1, v10

    .line 23
    invoke-virtual {v3}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v3}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v4, v3}, Landroidx/work/Data$Builder;->put(Ljava/lang/String;Ljava/lang/Object;)Landroidx/work/Data$Builder;

    add-int/lit8 v10, v10, 0x1

    goto :goto_4

    .line 24
    :cond_a
    invoke-virtual {v2}, Landroidx/work/Data$Builder;->build()Landroidx/work/Data;

    move-result-object v1

    .line 25
    invoke-static {v1}, Landroidx/work/ListenableWorker$Result;->failure(Landroidx/work/Data;)Landroidx/work/ListenableWorker$Result;

    move-result-object v1

    invoke-static {v1, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v1

    .line 26
    :cond_b
    invoke-virtual {v0}, Landroidx/work/ListenableWorker;->getInputData()Landroidx/work/Data;

    move-result-object v14

    const-string v15, "INPUT_FILE_ABSOLUTE_PATH"

    invoke-virtual {v14, v15}, Landroidx/work/Data;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    if-nez v14, :cond_d

    .line 27
    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v8, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    .line 28
    invoke-static {v9, v13}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    filled-new-array {v1, v2}, [Lkotlin/Pair;

    move-result-object v1

    .line 29
    new-instance v2, Landroidx/work/Data$Builder;

    invoke-direct {v2}, Landroidx/work/Data$Builder;-><init>()V

    :goto_5
    if-ge v10, v11, :cond_c

    .line 30
    aget-object v3, v1, v10

    .line 31
    invoke-virtual {v3}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v3}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v4, v3}, Landroidx/work/Data$Builder;->put(Ljava/lang/String;Ljava/lang/Object;)Landroidx/work/Data$Builder;

    add-int/lit8 v10, v10, 0x1

    goto :goto_5

    .line 32
    :cond_c
    invoke-virtual {v2}, Landroidx/work/Data$Builder;->build()Landroidx/work/Data;

    move-result-object v1

    .line 33
    invoke-static {v1}, Landroidx/work/ListenableWorker$Result;->failure(Landroidx/work/Data;)Landroidx/work/ListenableWorker$Result;

    move-result-object v1

    invoke-static {v1, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v1

    :cond_d
    if-eqz v2, :cond_19

    if-eq v2, v12, :cond_17

    if-eq v2, v11, :cond_e

    const/4 v1, 0x0

    goto/16 :goto_f

    .line 34
    :cond_e
    const-string v15, ""

    if-eqz v13, :cond_10

    invoke-static {v13, v10}, Lkotlin/collections/ArraysKt;->getOrNull([Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v16

    check-cast v16, Ljava/lang/String;

    if-nez v16, :cond_f

    goto :goto_6

    :cond_f
    move-object/from16 p1, v16

    goto :goto_7

    :cond_10
    :goto_6
    move-object/from16 p1, v15

    :goto_7
    if-eqz v13, :cond_12

    .line 35
    invoke-static {v13, v12}, Lkotlin/collections/ArraysKt;->getOrNull([Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v16

    check-cast v16, Ljava/lang/String;

    if-nez v16, :cond_11

    goto :goto_8

    :cond_11
    move-object/from16 v15, v16

    .line 36
    :cond_12
    :goto_8
    invoke-interface/range {p1 .. p1}, Ljava/lang/CharSequence;->length()I

    move-result v16

    if-nez v16, :cond_13

    goto :goto_9

    :cond_13
    invoke-interface {v15}, Ljava/lang/CharSequence;->length()I

    move-result v16

    if-nez v16, :cond_15

    .line 37
    :goto_9
    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v8, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    .line 38
    invoke-static {v9, v13}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    filled-new-array {v1, v2}, [Lkotlin/Pair;

    move-result-object v1

    .line 39
    new-instance v2, Landroidx/work/Data$Builder;

    invoke-direct {v2}, Landroidx/work/Data$Builder;-><init>()V

    :goto_a
    if-ge v10, v11, :cond_14

    .line 40
    aget-object v3, v1, v10

    .line 41
    invoke-virtual {v3}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v3}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v4, v3}, Landroidx/work/Data$Builder;->put(Ljava/lang/String;Ljava/lang/Object;)Landroidx/work/Data$Builder;

    add-int/lit8 v10, v10, 0x1

    goto :goto_a

    .line 42
    :cond_14
    invoke-virtual {v2}, Landroidx/work/Data$Builder;->build()Landroidx/work/Data;

    move-result-object v1

    .line 43
    invoke-static {v1}, Landroidx/work/ListenableWorker$Result;->failure(Landroidx/work/Data;)Landroidx/work/ListenableWorker$Result;

    move-result-object v1

    invoke-static {v1, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v1

    .line 44
    :cond_15
    iget-object v1, v0, Lcom/zykj/student/dialogue/upload/UploadWork;->a:Lcom/zykj/student/dialogue/upload/OssTaskManger;

    iput-object v13, v5, Lcom/zykj/student/dialogue/upload/UploadWork$doWork$1;->a:Ljava/lang/Object;

    iput-object v14, v5, Lcom/zykj/student/dialogue/upload/UploadWork$doWork$1;->b:Ljava/lang/Object;

    invoke-static/range {p1 .. p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    iput-object v10, v5, Lcom/zykj/student/dialogue/upload/UploadWork$doWork$1;->c:Ljava/lang/Object;

    invoke-static {v15}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    iput-object v10, v5, Lcom/zykj/student/dialogue/upload/UploadWork$doWork$1;->d:Ljava/lang/Object;

    iput v2, v5, Lcom/zykj/student/dialogue/upload/UploadWork$doWork$1;->e:I

    iput v4, v5, Lcom/zykj/student/dialogue/upload/UploadWork$doWork$1;->h:I

    move-object/from16 v4, p1

    invoke-virtual {v1, v4, v15, v5}, Lcom/zykj/student/dialogue/upload/OssTaskManger;->b(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v6, :cond_16

    goto/16 :goto_14

    :cond_16
    move-object v4, v14

    :goto_b
    check-cast v1, Lcom/zykj/student/dialogue/upload/OssData;

    :goto_c
    move-object v14, v4

    goto :goto_f

    .line 45
    :cond_17
    iget-object v1, v0, Lcom/zykj/student/dialogue/upload/UploadWork;->a:Lcom/zykj/student/dialogue/upload/OssTaskManger;

    iput-object v13, v5, Lcom/zykj/student/dialogue/upload/UploadWork$doWork$1;->a:Ljava/lang/Object;

    iput-object v14, v5, Lcom/zykj/student/dialogue/upload/UploadWork$doWork$1;->b:Ljava/lang/Object;

    iput v2, v5, Lcom/zykj/student/dialogue/upload/UploadWork$doWork$1;->e:I

    iput v11, v5, Lcom/zykj/student/dialogue/upload/UploadWork$doWork$1;->h:I

    const-string v4, ".zip"

    invoke-virtual {v1, v4, v5}, Lcom/zykj/student/dialogue/upload/OssTaskManger;->c(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v6, :cond_18

    goto/16 :goto_14

    :cond_18
    move-object v4, v14

    :goto_d
    check-cast v1, Lcom/zykj/student/dialogue/upload/OssData;

    goto :goto_c

    .line 46
    :cond_19
    iget-object v1, v0, Lcom/zykj/student/dialogue/upload/UploadWork;->a:Lcom/zykj/student/dialogue/upload/OssTaskManger;

    invoke-static {v14}, Lcom/blankj/utilcode/util/FileUtils;->getFileExtension(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v15, "."

    invoke-virtual {v10, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    iput-object v13, v5, Lcom/zykj/student/dialogue/upload/UploadWork$doWork$1;->a:Ljava/lang/Object;

    iput-object v14, v5, Lcom/zykj/student/dialogue/upload/UploadWork$doWork$1;->b:Ljava/lang/Object;

    iput v2, v5, Lcom/zykj/student/dialogue/upload/UploadWork$doWork$1;->e:I

    iput v12, v5, Lcom/zykj/student/dialogue/upload/UploadWork$doWork$1;->h:I

    invoke-virtual {v1, v4, v5}, Lcom/zykj/student/dialogue/upload/OssTaskManger;->c(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v6, :cond_1a

    goto/16 :goto_14

    :cond_1a
    move-object v4, v14

    :goto_e
    check-cast v1, Lcom/zykj/student/dialogue/upload/OssData;

    goto :goto_c

    :goto_f
    if-nez v1, :cond_1d

    .line 47
    invoke-virtual {v0}, Landroidx/work/ListenableWorker;->getRunAttemptCount()I

    move-result v1

    if-ge v1, v12, :cond_1b

    .line 48
    invoke-static {}, Landroidx/work/ListenableWorker$Result;->retry()Landroidx/work/ListenableWorker$Result;

    move-result-object v1

    .line 49
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    return-object v1

    :cond_1b
    const/16 v1, 0x67

    .line 50
    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v8, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    invoke-static {v9, v13}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    filled-new-array {v1, v2}, [Lkotlin/Pair;

    move-result-object v1

    .line 51
    new-instance v2, Landroidx/work/Data$Builder;

    invoke-direct {v2}, Landroidx/work/Data$Builder;-><init>()V

    const/4 v10, 0x0

    :goto_10
    if-ge v10, v11, :cond_1c

    .line 52
    aget-object v3, v1, v10

    .line 53
    invoke-virtual {v3}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v3}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v4, v3}, Landroidx/work/Data$Builder;->put(Ljava/lang/String;Ljava/lang/Object;)Landroidx/work/Data$Builder;

    add-int/lit8 v10, v10, 0x1

    goto :goto_10

    .line 54
    :cond_1c
    invoke-virtual {v2}, Landroidx/work/Data$Builder;->build()Landroidx/work/Data;

    move-result-object v1

    .line 55
    invoke-static {v1}, Landroidx/work/ListenableWorker$Result;->failure(Landroidx/work/Data;)Landroidx/work/ListenableWorker$Result;

    move-result-object v1

    .line 56
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    return-object v1

    .line 57
    :cond_1d
    const-string v4, "token \u83b7\u53d6\u6210\u529f\uff0c\u5f00\u59cb\u4e0a\u4f20"

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 58
    new-instance v4, Ljava/io/File;

    invoke-direct {v4, v14}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 59
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v10

    const/16 v15, 0x69

    if-nez v10, :cond_1f

    .line 60
    invoke-static {v15}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v8, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    .line 61
    invoke-static {v9, v13}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    filled-new-array {v1, v2}, [Lkotlin/Pair;

    move-result-object v1

    .line 62
    new-instance v2, Landroidx/work/Data$Builder;

    invoke-direct {v2}, Landroidx/work/Data$Builder;-><init>()V

    const/4 v10, 0x0

    :goto_11
    if-ge v10, v11, :cond_1e

    .line 63
    aget-object v3, v1, v10

    .line 64
    invoke-virtual {v3}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v3}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v4, v3}, Landroidx/work/Data$Builder;->put(Ljava/lang/String;Ljava/lang/Object;)Landroidx/work/Data$Builder;

    add-int/lit8 v10, v10, 0x1

    goto :goto_11

    .line 65
    :cond_1e
    invoke-virtual {v2}, Landroidx/work/Data$Builder;->build()Landroidx/work/Data;

    move-result-object v1

    .line 66
    invoke-static {v1}, Landroidx/work/ListenableWorker$Result;->failure(Landroidx/work/Data;)Landroidx/work/ListenableWorker$Result;

    move-result-object v1

    invoke-static {v1, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v1

    :cond_1f
    if-nez v2, :cond_21

    .line 67
    invoke-virtual {v4}, Ljava/io/File;->isFile()Z

    move-result v10

    if-nez v10, :cond_21

    .line 68
    invoke-static {v15}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v8, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    .line 69
    invoke-static {v9, v13}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    filled-new-array {v1, v2}, [Lkotlin/Pair;

    move-result-object v1

    .line 70
    new-instance v2, Landroidx/work/Data$Builder;

    invoke-direct {v2}, Landroidx/work/Data$Builder;-><init>()V

    const/4 v10, 0x0

    :goto_12
    if-ge v10, v11, :cond_20

    .line 71
    aget-object v3, v1, v10

    .line 72
    invoke-virtual {v3}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v3}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v4, v3}, Landroidx/work/Data$Builder;->put(Ljava/lang/String;Ljava/lang/Object;)Landroidx/work/Data$Builder;

    add-int/lit8 v10, v10, 0x1

    goto :goto_12

    .line 73
    :cond_20
    invoke-virtual {v2}, Landroidx/work/Data$Builder;->build()Landroidx/work/Data;

    move-result-object v1

    .line 74
    invoke-static {v1}, Landroidx/work/ListenableWorker$Result;->failure(Landroidx/work/Data;)Landroidx/work/ListenableWorker$Result;

    move-result-object v1

    invoke-static {v1, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v1

    :cond_21
    if-ne v2, v12, :cond_23

    .line 75
    invoke-virtual {v4}, Ljava/io/File;->isDirectory()Z

    move-result v10

    if-nez v10, :cond_23

    .line 76
    invoke-static {v15}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v8, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    .line 77
    invoke-static {v9, v13}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    filled-new-array {v1, v2}, [Lkotlin/Pair;

    move-result-object v1

    .line 78
    new-instance v2, Landroidx/work/Data$Builder;

    invoke-direct {v2}, Landroidx/work/Data$Builder;-><init>()V

    const/4 v10, 0x0

    :goto_13
    if-ge v10, v11, :cond_22

    .line 79
    aget-object v3, v1, v10

    .line 80
    invoke-virtual {v3}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v3}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v4, v3}, Landroidx/work/Data$Builder;->put(Ljava/lang/String;Ljava/lang/Object;)Landroidx/work/Data$Builder;

    add-int/lit8 v10, v10, 0x1

    goto :goto_13

    .line 81
    :cond_22
    invoke-virtual {v2}, Landroidx/work/Data$Builder;->build()Landroidx/work/Data;

    move-result-object v1

    .line 82
    invoke-static {v1}, Landroidx/work/ListenableWorker$Result;->failure(Landroidx/work/Data;)Landroidx/work/ListenableWorker$Result;

    move-result-object v1

    invoke-static {v1, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v1

    .line 83
    :cond_23
    invoke-virtual {v1}, Lcom/zykj/student/dialogue/upload/OssData;->getObjectKey()Ljava/lang/String;

    move-result-object v7

    move-object v10, v4

    invoke-virtual {v1}, Lcom/zykj/student/dialogue/upload/OssData;->getToken()Lcom/zykj/student/dialogue/upload/OssToken;

    move-result-object v4

    iput-object v13, v5, Lcom/zykj/student/dialogue/upload/UploadWork$doWork$1;->a:Ljava/lang/Object;

    invoke-static {v14}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    iput-object v14, v5, Lcom/zykj/student/dialogue/upload/UploadWork$doWork$1;->b:Ljava/lang/Object;

    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v5, Lcom/zykj/student/dialogue/upload/UploadWork$doWork$1;->c:Ljava/lang/Object;

    invoke-static {v10}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v5, Lcom/zykj/student/dialogue/upload/UploadWork$doWork$1;->d:Ljava/lang/Object;

    iput v2, v5, Lcom/zykj/student/dialogue/upload/UploadWork$doWork$1;->e:I

    iput v3, v5, Lcom/zykj/student/dialogue/upload/UploadWork$doWork$1;->h:I

    move v1, v2

    move-object v3, v7

    move-object v2, v10

    invoke-virtual/range {v0 .. v5}, Lcom/zykj/student/dialogue/upload/UploadWork;->e(ILjava/io/File;Ljava/lang/String;Lcom/zykj/student/dialogue/upload/OssToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v6, :cond_24

    :goto_14
    return-object v6

    :cond_24
    move-object v2, v13

    .line 84
    :goto_15
    check-cast v1, Ljava/lang/String;

    .line 85
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "work end--->"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    if-eqz v1, :cond_27

    .line 86
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_25

    goto :goto_17

    .line 87
    :cond_25
    const-string v0, "SUCCESS_KEY"

    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    invoke-static {v9, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    filled-new-array {v0, v1}, [Lkotlin/Pair;

    move-result-object v0

    .line 88
    new-instance v1, Landroidx/work/Data$Builder;

    invoke-direct {v1}, Landroidx/work/Data$Builder;-><init>()V

    const/4 v10, 0x0

    :goto_16
    if-ge v10, v11, :cond_26

    .line 89
    aget-object v2, v0, v10

    .line 90
    invoke-virtual {v2}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v2}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v3, v2}, Landroidx/work/Data$Builder;->put(Ljava/lang/String;Ljava/lang/Object;)Landroidx/work/Data$Builder;

    add-int/lit8 v10, v10, 0x1

    goto :goto_16

    .line 91
    :cond_26
    invoke-virtual {v1}, Landroidx/work/Data$Builder;->build()Landroidx/work/Data;

    move-result-object v0

    .line 92
    invoke-static {v0}, Landroidx/work/ListenableWorker$Result;->success(Landroidx/work/Data;)Landroidx/work/ListenableWorker$Result;

    move-result-object v0

    .line 93
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    return-object v0

    .line 94
    :cond_27
    :goto_17
    invoke-virtual/range {p0 .. p0}, Landroidx/work/ListenableWorker;->getRunAttemptCount()I

    move-result v0

    if-ge v0, v12, :cond_28

    .line 95
    invoke-static {}, Landroidx/work/ListenableWorker$Result;->retry()Landroidx/work/ListenableWorker$Result;

    move-result-object v0

    .line 96
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    return-object v0

    :cond_28
    const/16 v0, 0x68

    .line 97
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v8, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    invoke-static {v9, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    filled-new-array {v0, v1}, [Lkotlin/Pair;

    move-result-object v0

    .line 98
    new-instance v1, Landroidx/work/Data$Builder;

    invoke-direct {v1}, Landroidx/work/Data$Builder;-><init>()V

    const/4 v10, 0x0

    :goto_18
    if-ge v10, v11, :cond_29

    .line 99
    aget-object v2, v0, v10

    .line 100
    invoke-virtual {v2}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v2}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v3, v2}, Landroidx/work/Data$Builder;->put(Ljava/lang/String;Ljava/lang/Object;)Landroidx/work/Data$Builder;

    add-int/lit8 v10, v10, 0x1

    goto :goto_18

    .line 101
    :cond_29
    invoke-virtual {v1}, Landroidx/work/Data$Builder;->build()Landroidx/work/Data;

    move-result-object v0

    .line 102
    invoke-static {v0}, Landroidx/work/ListenableWorker$Result;->failure(Landroidx/work/Data;)Landroidx/work/ListenableWorker$Result;

    move-result-object v0

    .line 103
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    return-object v0
.end method

.method public final e(ILjava/io/File;Ljava/lang/String;Lcom/zykj/student/dialogue/upload/OssToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 10

    .line 1
    instance-of v0, p5, Lcom/zykj/student/dialogue/upload/UploadWork$uploadFile$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p5

    .line 6
    check-cast v0, Lcom/zykj/student/dialogue/upload/UploadWork$uploadFile$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/student/dialogue/upload/UploadWork$uploadFile$1;->h:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcom/zykj/student/dialogue/upload/UploadWork$uploadFile$1;->h:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/student/dialogue/upload/UploadWork$uploadFile$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p5}, Lcom/zykj/student/dialogue/upload/UploadWork$uploadFile$1;-><init>(Lcom/zykj/student/dialogue/upload/UploadWork;Lkotlin/coroutines/Continuation;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p5, v0, Lcom/zykj/student/dialogue/upload/UploadWork$uploadFile$1;->f:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/student/dialogue/upload/UploadWork$uploadFile$1;->h:I

    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    const/4 v4, 0x4

    .line 35
    const/4 v5, 0x3

    .line 36
    const/4 v6, 0x2

    .line 37
    const/4 v7, 0x1

    .line 38
    if-eqz v2, :cond_5

    .line 39
    .line 40
    if-eq v2, v7, :cond_4

    .line 41
    .line 42
    if-eq v2, v6, :cond_3

    .line 43
    .line 44
    if-eq v2, v5, :cond_2

    .line 45
    .line 46
    if-ne v2, v4, :cond_1

    .line 47
    .line 48
    iget p1, v0, Lcom/zykj/student/dialogue/upload/UploadWork$uploadFile$1;->a:I

    .line 49
    .line 50
    iget-object p2, v0, Lcom/zykj/student/dialogue/upload/UploadWork$uploadFile$1;->e:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p2, Ljava/io/File;

    .line 53
    .line 54
    iget-object p3, v0, Lcom/zykj/student/dialogue/upload/UploadWork$uploadFile$1;->d:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast p3, Lcom/zykj/student/dialogue/upload/OssToken;

    .line 57
    .line 58
    iget-object p4, v0, Lcom/zykj/student/dialogue/upload/UploadWork$uploadFile$1;->c:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast p4, Ljava/lang/String;

    .line 61
    .line 62
    iget-object v0, v0, Lcom/zykj/student/dialogue/upload/UploadWork$uploadFile$1;->b:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v0, Ljava/io/File;

    .line 65
    .line 66
    invoke-static {p5}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    goto/16 :goto_6

    .line 70
    .line 71
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 72
    .line 73
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 74
    .line 75
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    throw p1

    .line 79
    :cond_2
    iget p1, v0, Lcom/zykj/student/dialogue/upload/UploadWork$uploadFile$1;->a:I

    .line 80
    .line 81
    iget-object p2, v0, Lcom/zykj/student/dialogue/upload/UploadWork$uploadFile$1;->e:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast p2, Ljava/io/File;

    .line 84
    .line 85
    iget-object p3, v0, Lcom/zykj/student/dialogue/upload/UploadWork$uploadFile$1;->d:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast p3, Lcom/zykj/student/dialogue/upload/OssToken;

    .line 88
    .line 89
    iget-object p4, v0, Lcom/zykj/student/dialogue/upload/UploadWork$uploadFile$1;->c:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast p4, Ljava/lang/String;

    .line 92
    .line 93
    iget-object v0, v0, Lcom/zykj/student/dialogue/upload/UploadWork$uploadFile$1;->b:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v0, Ljava/io/File;

    .line 96
    .line 97
    invoke-static {p5}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    goto/16 :goto_4

    .line 101
    .line 102
    :cond_3
    iget p1, v0, Lcom/zykj/student/dialogue/upload/UploadWork$uploadFile$1;->a:I

    .line 103
    .line 104
    iget-object p2, v0, Lcom/zykj/student/dialogue/upload/UploadWork$uploadFile$1;->e:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast p2, Ljava/io/File;

    .line 107
    .line 108
    iget-object p3, v0, Lcom/zykj/student/dialogue/upload/UploadWork$uploadFile$1;->d:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast p3, Lcom/zykj/student/dialogue/upload/OssToken;

    .line 111
    .line 112
    iget-object p4, v0, Lcom/zykj/student/dialogue/upload/UploadWork$uploadFile$1;->c:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast p4, Ljava/lang/String;

    .line 115
    .line 116
    iget-object v0, v0, Lcom/zykj/student/dialogue/upload/UploadWork$uploadFile$1;->b:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v0, Ljava/io/File;

    .line 119
    .line 120
    invoke-static {p5}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    goto/16 :goto_3

    .line 124
    .line 125
    :cond_4
    iget p1, v0, Lcom/zykj/student/dialogue/upload/UploadWork$uploadFile$1;->a:I

    .line 126
    .line 127
    iget-object p2, v0, Lcom/zykj/student/dialogue/upload/UploadWork$uploadFile$1;->d:Ljava/lang/Object;

    .line 128
    .line 129
    move-object p4, p2

    .line 130
    check-cast p4, Lcom/zykj/student/dialogue/upload/OssToken;

    .line 131
    .line 132
    iget-object p2, v0, Lcom/zykj/student/dialogue/upload/UploadWork$uploadFile$1;->c:Ljava/lang/Object;

    .line 133
    .line 134
    move-object p3, p2

    .line 135
    check-cast p3, Ljava/lang/String;

    .line 136
    .line 137
    iget-object p2, v0, Lcom/zykj/student/dialogue/upload/UploadWork$uploadFile$1;->b:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast p2, Ljava/io/File;

    .line 140
    .line 141
    invoke-static {p5}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    goto :goto_1

    .line 145
    :cond_5
    invoke-static {p5}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    if-ne p1, v7, :cond_8

    .line 149
    .line 150
    invoke-virtual {p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object p5

    .line 154
    const-string v2, "getAbsolutePath(...)"

    .line 155
    .line 156
    invoke-static {p5, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    iput-object v2, v0, Lcom/zykj/student/dialogue/upload/UploadWork$uploadFile$1;->b:Ljava/lang/Object;

    .line 164
    .line 165
    iput-object p3, v0, Lcom/zykj/student/dialogue/upload/UploadWork$uploadFile$1;->c:Ljava/lang/Object;

    .line 166
    .line 167
    iput-object p4, v0, Lcom/zykj/student/dialogue/upload/UploadWork$uploadFile$1;->d:Ljava/lang/Object;

    .line 168
    .line 169
    iput p1, v0, Lcom/zykj/student/dialogue/upload/UploadWork$uploadFile$1;->a:I

    .line 170
    .line 171
    iput v7, v0, Lcom/zykj/student/dialogue/upload/UploadWork$uploadFile$1;->h:I

    .line 172
    .line 173
    invoke-virtual {p0, p5, v0}, Lcom/zykj/student/dialogue/upload/UploadWork;->f(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object p5

    .line 177
    if-ne p5, v1, :cond_6

    .line 178
    .line 179
    goto/16 :goto_5

    .line 180
    .line 181
    :cond_6
    :goto_1
    check-cast p5, Ljava/lang/String;

    .line 182
    .line 183
    if-eqz p5, :cond_7

    .line 184
    .line 185
    new-instance v2, Ljava/io/File;

    .line 186
    .line 187
    invoke-direct {v2, p5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    move-object p5, p4

    .line 191
    move-object p4, p3

    .line 192
    move-object p3, p2

    .line 193
    move-object p2, v2

    .line 194
    goto :goto_2

    .line 195
    :cond_7
    return-object v3

    .line 196
    :cond_8
    move-object p5, p4

    .line 197
    move-object p4, p3

    .line 198
    move-object p3, p2

    .line 199
    :goto_2
    invoke-virtual {p5}, Lcom/zykj/student/dialogue/upload/OssToken;->getStrategy()Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v2

    .line 203
    const-string v8, "GridFS"

    .line 204
    .line 205
    invoke-static {v2, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 206
    .line 207
    .line 208
    move-result v8

    .line 209
    if-eqz v8, :cond_a

    .line 210
    .line 211
    invoke-static {p3}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object p3

    .line 215
    iput-object p3, v0, Lcom/zykj/student/dialogue/upload/UploadWork$uploadFile$1;->b:Ljava/lang/Object;

    .line 216
    .line 217
    iput-object p4, v0, Lcom/zykj/student/dialogue/upload/UploadWork$uploadFile$1;->c:Ljava/lang/Object;

    .line 218
    .line 219
    iput-object p5, v0, Lcom/zykj/student/dialogue/upload/UploadWork$uploadFile$1;->d:Ljava/lang/Object;

    .line 220
    .line 221
    iput-object p2, v0, Lcom/zykj/student/dialogue/upload/UploadWork$uploadFile$1;->e:Ljava/lang/Object;

    .line 222
    .line 223
    iput p1, v0, Lcom/zykj/student/dialogue/upload/UploadWork$uploadFile$1;->a:I

    .line 224
    .line 225
    iput v6, v0, Lcom/zykj/student/dialogue/upload/UploadWork$uploadFile$1;->h:I

    .line 226
    .line 227
    invoke-virtual {p0, p2, p4, p5, v0}, Lcom/zykj/student/dialogue/upload/UploadWork;->c(Ljava/io/File;Ljava/lang/String;Lcom/zykj/student/dialogue/upload/OssToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object p3

    .line 231
    if-ne p3, v1, :cond_9

    .line 232
    .line 233
    goto :goto_5

    .line 234
    :cond_9
    move-object v9, p5

    .line 235
    move-object p5, p3

    .line 236
    move-object p3, v9

    .line 237
    :goto_3
    check-cast p5, Ljava/lang/Boolean;

    .line 238
    .line 239
    invoke-virtual {p5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 240
    .line 241
    .line 242
    move-result p5

    .line 243
    goto :goto_7

    .line 244
    :cond_a
    const-string v6, "ZYFS"

    .line 245
    .line 246
    invoke-static {v2, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 247
    .line 248
    .line 249
    move-result v2

    .line 250
    if-eqz v2, :cond_c

    .line 251
    .line 252
    invoke-static {p3}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object p3

    .line 256
    iput-object p3, v0, Lcom/zykj/student/dialogue/upload/UploadWork$uploadFile$1;->b:Ljava/lang/Object;

    .line 257
    .line 258
    iput-object p4, v0, Lcom/zykj/student/dialogue/upload/UploadWork$uploadFile$1;->c:Ljava/lang/Object;

    .line 259
    .line 260
    iput-object p5, v0, Lcom/zykj/student/dialogue/upload/UploadWork$uploadFile$1;->d:Ljava/lang/Object;

    .line 261
    .line 262
    iput-object p2, v0, Lcom/zykj/student/dialogue/upload/UploadWork$uploadFile$1;->e:Ljava/lang/Object;

    .line 263
    .line 264
    iput p1, v0, Lcom/zykj/student/dialogue/upload/UploadWork$uploadFile$1;->a:I

    .line 265
    .line 266
    iput v5, v0, Lcom/zykj/student/dialogue/upload/UploadWork$uploadFile$1;->h:I

    .line 267
    .line 268
    invoke-virtual {p0, p2, p4, p5, v0}, Lcom/zykj/student/dialogue/upload/UploadWork;->g(Ljava/io/File;Ljava/lang/String;Lcom/zykj/student/dialogue/upload/OssToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object p3

    .line 272
    if-ne p3, v1, :cond_b

    .line 273
    .line 274
    goto :goto_5

    .line 275
    :cond_b
    move-object v9, p5

    .line 276
    move-object p5, p3

    .line 277
    move-object p3, v9

    .line 278
    :goto_4
    check-cast p5, Ljava/lang/Boolean;

    .line 279
    .line 280
    invoke-virtual {p5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 281
    .line 282
    .line 283
    move-result p5

    .line 284
    goto :goto_7

    .line 285
    :cond_c
    invoke-static {p3}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    move-result-object p3

    .line 289
    iput-object p3, v0, Lcom/zykj/student/dialogue/upload/UploadWork$uploadFile$1;->b:Ljava/lang/Object;

    .line 290
    .line 291
    iput-object p4, v0, Lcom/zykj/student/dialogue/upload/UploadWork$uploadFile$1;->c:Ljava/lang/Object;

    .line 292
    .line 293
    iput-object p5, v0, Lcom/zykj/student/dialogue/upload/UploadWork$uploadFile$1;->d:Ljava/lang/Object;

    .line 294
    .line 295
    iput-object p2, v0, Lcom/zykj/student/dialogue/upload/UploadWork$uploadFile$1;->e:Ljava/lang/Object;

    .line 296
    .line 297
    iput p1, v0, Lcom/zykj/student/dialogue/upload/UploadWork$uploadFile$1;->a:I

    .line 298
    .line 299
    iput v4, v0, Lcom/zykj/student/dialogue/upload/UploadWork$uploadFile$1;->h:I

    .line 300
    .line 301
    invoke-virtual {p0, p2, p4, p5, v0}, Lcom/zykj/student/dialogue/upload/UploadWork;->d(Ljava/io/File;Ljava/lang/String;Lcom/zykj/student/dialogue/upload/OssToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    move-result-object p3

    .line 305
    if-ne p3, v1, :cond_d

    .line 306
    .line 307
    :goto_5
    return-object v1

    .line 308
    :cond_d
    move-object v9, p5

    .line 309
    move-object p5, p3

    .line 310
    move-object p3, v9

    .line 311
    :goto_6
    check-cast p5, Ljava/lang/Boolean;

    .line 312
    .line 313
    invoke-virtual {p5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 314
    .line 315
    .line 316
    move-result p5

    .line 317
    :goto_7
    if-ne p1, v7, :cond_e

    .line 318
    .line 319
    invoke-virtual {p2}, Ljava/io/File;->delete()Z

    .line 320
    .line 321
    .line 322
    :cond_e
    if-eqz p5, :cond_f

    .line 323
    .line 324
    invoke-virtual {p3}, Lcom/zykj/student/dialogue/upload/OssToken;->getEndpoint()Ljava/lang/String;

    .line 325
    .line 326
    .line 327
    move-result-object p1

    .line 328
    new-instance p2, Ljava/lang/StringBuilder;

    .line 329
    .line 330
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 331
    .line 332
    .line 333
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 334
    .line 335
    .line 336
    const-string p1, "/"

    .line 337
    .line 338
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 339
    .line 340
    .line 341
    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 342
    .line 343
    .line 344
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 345
    .line 346
    .line 347
    move-result-object p1

    .line 348
    return-object p1

    .line 349
    :cond_f
    return-object v3
.end method

.method public final f(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/zykj/student/dialogue/upload/UploadWork$zipFile$2;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p1, v2}, Lcom/zykj/student/dialogue/upload/UploadWork$zipFile$2;-><init>(Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1, p2}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method

.method public final g(Ljava/io/File;Ljava/lang/String;Lcom/zykj/student/dialogue/upload/OssToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6

    .line 1
    new-instance v0, Ll8/u$a;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-direct {v0, v2, v1, v2}, Ll8/u$a;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 6
    .line 7
    .line 8
    sget-object v1, Ll8/u;->k:Ll8/t;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ll8/u$a;->e(Ll8/t;)Ll8/u$a;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    sget-object v3, Ll8/x;->Companion:Ll8/x$a;

    .line 19
    .line 20
    sget-object v4, Ll8/t;->e:Ll8/t$a;

    .line 21
    .line 22
    const-string v5, "multipart/form-data"

    .line 23
    .line 24
    invoke-virtual {v4, v5}, Ll8/t$a;->b(Ljava/lang/String;)Ll8/t;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    invoke-virtual {v3, p1, v4}, Ll8/x$a;->a(Ljava/io/File;Ll8/t;)Ll8/x;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    const-string v3, "file"

    .line 33
    .line 34
    invoke-virtual {v0, v3, v1, p1}, Ll8/u$a;->a(Ljava/lang/String;Ljava/lang/String;Ll8/x;)Ll8/u$a;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {p1}, Ll8/u$a;->d()Ll8/u;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    new-instance v0, Ll8/w$a;

    .line 43
    .line 44
    invoke-direct {v0}, Ll8/w$a;-><init>()V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p3}, Lcom/zykj/student/dialogue/upload/OssToken;->getEndpoint()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    new-instance v3, Ljava/lang/StringBuilder;

    .line 52
    .line 53
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    const-string v1, "/"

    .line 60
    .line 61
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    invoke-virtual {v0, p2}, Ll8/w$a;->n(Ljava/lang/String;)Ll8/w$a;

    .line 72
    .line 73
    .line 74
    move-result-object p2

    .line 75
    invoke-virtual {p3}, Lcom/zykj/student/dialogue/upload/OssToken;->getSecurityToken()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p3

    .line 79
    new-instance v0, Ljava/lang/StringBuilder;

    .line 80
    .line 81
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 82
    .line 83
    .line 84
    const-string v1, "bearer "

    .line 85
    .line 86
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p3

    .line 96
    const-string v0, "Authorization"

    .line 97
    .line 98
    invoke-virtual {p2, v0, p3}, Ll8/w$a;->a(Ljava/lang/String;Ljava/lang/String;)Ll8/w$a;

    .line 99
    .line 100
    .line 101
    move-result-object p2

    .line 102
    const-string p3, "Checksum"

    .line 103
    .line 104
    const-string v0, "3f4e17759c6b9c6a364211895bbb2abdc0ba62db"

    .line 105
    .line 106
    invoke-virtual {p2, p3, v0}, Ll8/w$a;->a(Ljava/lang/String;Ljava/lang/String;)Ll8/w$a;

    .line 107
    .line 108
    .line 109
    move-result-object p2

    .line 110
    invoke-virtual {p2, p1}, Ll8/w$a;->k(Ll8/x;)Ll8/w$a;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    invoke-virtual {p1}, Ll8/w$a;->b()Ll8/w;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    .line 119
    .line 120
    .line 121
    move-result-object p2

    .line 122
    new-instance p3, Lcom/zykj/student/dialogue/upload/UploadWork$zyFsUpload$2;

    .line 123
    .line 124
    invoke-direct {p3, p1, v2}, Lcom/zykj/student/dialogue/upload/UploadWork$zyFsUpload$2;-><init>(Ll8/w;Lkotlin/coroutines/Continuation;)V

    .line 125
    .line 126
    .line 127
    invoke-static {p2, p3, p4}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    return-object p1
.end method
