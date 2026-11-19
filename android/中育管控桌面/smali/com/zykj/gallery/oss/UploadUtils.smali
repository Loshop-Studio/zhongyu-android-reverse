.class public final Lcom/zykj/gallery/oss/UploadUtils;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0005\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J(\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0086@\u00a2\u0006\u0002\u0010\u000bJ&\u0010\u000c\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0082@\u00a2\u0006\u0002\u0010\u000bJ&\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0082@\u00a2\u0006\u0002\u0010\u000bJ&\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0082@\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0011\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/zykj/gallery/oss/UploadUtils;",
        "",
        "<init>",
        "()V",
        "SKIP_CHECKSUM",
        "",
        "uploadFile",
        "localPath",
        "uploadPath",
        "credential",
        "Lcom/zykj/gallery/oss/OssToken;",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/zykj/gallery/oss/OssToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "gridFsUpload",
        "",
        "zyFsUpload",
        "ossUpload",
        "getFileNameFromUrlWithRegex",
        "url",
        "module_gallery_release"
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
.field public static final $stable:I = 0x0

.field public static final INSTANCE:Lcom/zykj/gallery/oss/UploadUtils;

.field public static final SKIP_CHECKSUM:Ljava/lang/String; = "3f4e17759c6b9c6a364211895bbb2abdc0ba62db"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/zykj/gallery/oss/UploadUtils;

    invoke-direct {v0}, Lcom/zykj/gallery/oss/UploadUtils;-><init>()V

    sput-object v0, Lcom/zykj/gallery/oss/UploadUtils;->INSTANCE:Lcom/zykj/gallery/oss/UploadUtils;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$gridFsUpload(Lcom/zykj/gallery/oss/UploadUtils;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/gallery/oss/OssToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/zykj/gallery/oss/UploadUtils;->gridFsUpload(Ljava/lang/String;Ljava/lang/String;Lcom/zykj/gallery/oss/OssToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$ossUpload(Lcom/zykj/gallery/oss/UploadUtils;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/gallery/oss/OssToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/zykj/gallery/oss/UploadUtils;->ossUpload(Ljava/lang/String;Ljava/lang/String;Lcom/zykj/gallery/oss/OssToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$zyFsUpload(Lcom/zykj/gallery/oss/UploadUtils;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/gallery/oss/OssToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/zykj/gallery/oss/UploadUtils;->zyFsUpload(Ljava/lang/String;Ljava/lang/String;Lcom/zykj/gallery/oss/OssToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final gridFsUpload(Ljava/lang/String;Ljava/lang/String;Lcom/zykj/gallery/oss/OssToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/zykj/gallery/oss/OssToken;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lf5/z$a;

    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    const/4 v3, 0x0

    .line 10
    invoke-direct {v1, v3, v2, v3}, Lf5/z$a;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 11
    .line 12
    .line 13
    sget-object v2, Lf5/z;->k:Lf5/y;

    .line 14
    .line 15
    invoke-virtual {v1, v2}, Lf5/z$a;->e(Lf5/y;)Lf5/z$a;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sget-object v2, Lf5/c0;->Companion:Lf5/c0$a;

    .line 24
    .line 25
    new-instance v4, Ljava/io/File;

    .line 26
    .line 27
    invoke-direct {v4, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    sget-object p1, Lf5/y;->e:Lf5/y$a;

    .line 31
    .line 32
    const-string/jumbo v5, "multipart/form-data"

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, v5}, Lf5/y$a;->b(Ljava/lang/String;)Lf5/y;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-virtual {v2, v4, p1}, Lf5/c0$a;->g(Ljava/io/File;Lf5/y;)Lf5/c0;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    const-string/jumbo v2, "file"

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1, v2, v0, p1}, Lf5/z$a;->a(Ljava/lang/String;Ljava/lang/String;Lf5/c0;)Lf5/z$a;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-virtual {p1}, Lf5/z$a;->d()Lf5/z;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    new-instance v0, Lf5/b0$a;

    .line 55
    .line 56
    invoke-direct {v0}, Lf5/b0$a;-><init>()V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p3}, Lcom/zykj/gallery/oss/OssToken;->getEndpoint()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    new-instance v2, Ljava/lang/StringBuilder;

    .line 64
    .line 65
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    const-string v1, "/"

    .line 72
    .line 73
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    invoke-virtual {v0, p2}, Lf5/b0$a;->w(Ljava/lang/String;)Lf5/b0$a;

    .line 84
    .line 85
    .line 86
    move-result-object p2

    .line 87
    invoke-virtual {p3}, Lcom/zykj/gallery/oss/OssToken;->getSecurityToken()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p3

    .line 91
    new-instance v0, Ljava/lang/StringBuilder;

    .line 92
    .line 93
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 94
    .line 95
    .line 96
    const-string/jumbo v1, "bearer "

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p3

    .line 109
    const-string v0, "Authorization"

    .line 110
    .line 111
    invoke-virtual {p2, v0, p3}, Lf5/b0$a;->a(Ljava/lang/String;Ljava/lang/String;)Lf5/b0$a;

    .line 112
    .line 113
    .line 114
    move-result-object p2

    .line 115
    const-string p3, "Checksum"

    .line 116
    .line 117
    const-string v0, "3f4e17759c6b9c6a364211895bbb2abdc0ba62db"

    .line 118
    .line 119
    invoke-virtual {p2, p3, v0}, Lf5/b0$a;->a(Ljava/lang/String;Ljava/lang/String;)Lf5/b0$a;

    .line 120
    .line 121
    .line 122
    move-result-object p2

    .line 123
    invoke-virtual {p2, p1}, Lf5/b0$a;->r(Lf5/c0;)Lf5/b0$a;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    invoke-virtual {p1}, Lf5/b0$a;->b()Lf5/b0;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    .line 132
    .line 133
    .line 134
    move-result-object p2

    .line 135
    new-instance p3, Lcom/zykj/gallery/oss/UploadUtils$gridFsUpload$2;

    .line 136
    .line 137
    invoke-direct {p3, p1, v3}, Lcom/zykj/gallery/oss/UploadUtils$gridFsUpload$2;-><init>(Lf5/b0;Lkotlin/coroutines/Continuation;)V

    .line 138
    .line 139
    .line 140
    invoke-static {p2, p3, p4}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    return-object p1
.end method

.method private final ossUpload(Ljava/lang/String;Ljava/lang/String;Lcom/zykj/gallery/oss/OssToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/zykj/gallery/oss/OssToken;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string/jumbo v1, "start ossUpload file:"

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string v1, ", serverPath: "

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-static {v0}, Lcom/blankj/utilcode/util/s;->t([Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    new-instance v0, Lcom/alibaba/sdk/android/oss/common/auth/OSSStsTokenCredentialProvider;

    .line 35
    .line 36
    invoke-virtual {p3}, Lcom/zykj/gallery/oss/OssToken;->getAccessKeyId()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {p3}, Lcom/zykj/gallery/oss/OssToken;->getAccessKeySecret()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-virtual {p3}, Lcom/zykj/gallery/oss/OssToken;->getSecurityToken()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    invoke-direct {v0, v1, v2, v3}, Lcom/alibaba/sdk/android/oss/common/auth/OSSStsTokenCredentialProvider;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p3}, Lcom/zykj/gallery/oss/OssToken;->getEndpoint()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    invoke-virtual {p3}, Lcom/zykj/gallery/oss/OssToken;->getBucket()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    new-instance v2, Ljava/lang/StringBuilder;

    .line 60
    .line 61
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    const-string v1, "."

    .line 68
    .line 69
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    const/4 v8, 0x4

    .line 77
    const/4 v9, 0x0

    .line 78
    const-string v6, ""

    .line 79
    .line 80
    const/4 v7, 0x0

    .line 81
    invoke-static/range {v4 .. v9}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    new-instance v2, Lcom/alibaba/sdk/android/oss/OSSClient;

    .line 86
    .line 87
    invoke-static {}, Lcom/blankj/utilcode/util/l0;->a()Landroid/app/Application;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    invoke-direct {v2, v3, v1, v0}, Lcom/alibaba/sdk/android/oss/OSSClient;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/alibaba/sdk/android/oss/common/auth/OSSCredentialProvider;)V

    .line 92
    .line 93
    .line 94
    new-instance v0, Lcom/alibaba/sdk/android/oss/model/PutObjectRequest;

    .line 95
    .line 96
    invoke-virtual {p3}, Lcom/zykj/gallery/oss/OssToken;->getBucket()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p3

    .line 100
    invoke-direct {v0, p3, p2, p1}, Lcom/alibaba/sdk/android/oss/model/PutObjectRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    .line 104
    .line 105
    .line 106
    move-result-object p2

    .line 107
    new-instance p3, Lcom/zykj/gallery/oss/UploadUtils$ossUpload$2;

    .line 108
    .line 109
    const/4 v1, 0x0

    .line 110
    invoke-direct {p3, v2, v0, p1, v1}, Lcom/zykj/gallery/oss/UploadUtils$ossUpload$2;-><init>(Lcom/alibaba/sdk/android/oss/OSSClient;Lcom/alibaba/sdk/android/oss/model/PutObjectRequest;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    .line 111
    .line 112
    .line 113
    invoke-static {p2, p3, p4}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    return-object p1
.end method

.method private final zyFsUpload(Ljava/lang/String;Ljava/lang/String;Lcom/zykj/gallery/oss/OssToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/zykj/gallery/oss/OssToken;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lf5/z$a;

    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    const/4 v3, 0x0

    .line 10
    invoke-direct {v1, v3, v2, v3}, Lf5/z$a;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 11
    .line 12
    .line 13
    sget-object v2, Lf5/z;->k:Lf5/y;

    .line 14
    .line 15
    invoke-virtual {v1, v2}, Lf5/z$a;->e(Lf5/y;)Lf5/z$a;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sget-object v2, Lf5/c0;->Companion:Lf5/c0$a;

    .line 24
    .line 25
    new-instance v4, Ljava/io/File;

    .line 26
    .line 27
    invoke-direct {v4, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    sget-object p1, Lf5/y;->e:Lf5/y$a;

    .line 31
    .line 32
    const-string/jumbo v5, "multipart/form-data"

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, v5}, Lf5/y$a;->b(Ljava/lang/String;)Lf5/y;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-virtual {v2, v4, p1}, Lf5/c0$a;->g(Ljava/io/File;Lf5/y;)Lf5/c0;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    const-string/jumbo v2, "file"

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1, v2, v0, p1}, Lf5/z$a;->a(Ljava/lang/String;Ljava/lang/String;Lf5/c0;)Lf5/z$a;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-virtual {p1}, Lf5/z$a;->d()Lf5/z;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    new-instance v0, Lf5/b0$a;

    .line 55
    .line 56
    invoke-direct {v0}, Lf5/b0$a;-><init>()V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p3}, Lcom/zykj/gallery/oss/OssToken;->getEndpoint()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    new-instance v2, Ljava/lang/StringBuilder;

    .line 64
    .line 65
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    const-string v1, "/"

    .line 72
    .line 73
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    invoke-virtual {v0, p2}, Lf5/b0$a;->w(Ljava/lang/String;)Lf5/b0$a;

    .line 84
    .line 85
    .line 86
    move-result-object p2

    .line 87
    invoke-virtual {p3}, Lcom/zykj/gallery/oss/OssToken;->getSecurityToken()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p3

    .line 91
    new-instance v0, Ljava/lang/StringBuilder;

    .line 92
    .line 93
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 94
    .line 95
    .line 96
    const-string/jumbo v1, "bearer "

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p3

    .line 109
    const-string v0, "Authorization"

    .line 110
    .line 111
    invoke-virtual {p2, v0, p3}, Lf5/b0$a;->a(Ljava/lang/String;Ljava/lang/String;)Lf5/b0$a;

    .line 112
    .line 113
    .line 114
    move-result-object p2

    .line 115
    const-string p3, "Checksum"

    .line 116
    .line 117
    const-string v0, "3f4e17759c6b9c6a364211895bbb2abdc0ba62db"

    .line 118
    .line 119
    invoke-virtual {p2, p3, v0}, Lf5/b0$a;->a(Ljava/lang/String;Ljava/lang/String;)Lf5/b0$a;

    .line 120
    .line 121
    .line 122
    move-result-object p2

    .line 123
    invoke-virtual {p2, p1}, Lf5/b0$a;->r(Lf5/c0;)Lf5/b0$a;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    invoke-virtual {p1}, Lf5/b0$a;->b()Lf5/b0;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    .line 132
    .line 133
    .line 134
    move-result-object p2

    .line 135
    new-instance p3, Lcom/zykj/gallery/oss/UploadUtils$zyFsUpload$2;

    .line 136
    .line 137
    invoke-direct {p3, p1, v3}, Lcom/zykj/gallery/oss/UploadUtils$zyFsUpload$2;-><init>(Lf5/b0;Lkotlin/coroutines/Continuation;)V

    .line 138
    .line 139
    .line 140
    invoke-static {p2, p3, p4}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    return-object p1
.end method


# virtual methods
.method public final getFileNameFromUrlWithRegex(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    const-string/jumbo v0, "url"

    .line 2
    .line 3
    .line 4
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    new-instance v0, Lkotlin/text/Regex;

    .line 8
    .line 9
    const-string v1, ".*/(.+)\\..+"

    .line 10
    .line 11
    invoke-direct {v0, v1}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    const/4 v2, 0x2

    .line 16
    const/4 v3, 0x0

    .line 17
    invoke-static {v0, p1, v1, v2, v3}, Lkotlin/text/Regex;->find$default(Lkotlin/text/Regex;Ljava/lang/CharSequence;IILjava/lang/Object;)Lkotlin/text/MatchResult;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    invoke-interface {p1}, Lkotlin/text/MatchResult;->getGroups()Lkotlin/text/MatchGroupCollection;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    if-eqz p1, :cond_0

    .line 28
    .line 29
    const/4 v0, 0x1

    .line 30
    invoke-interface {p1, v0}, Lkotlin/text/MatchGroupCollection;->get(I)Lkotlin/text/MatchGroup;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    if-eqz p1, :cond_0

    .line 35
    .line 36
    invoke-virtual {p1}, Lkotlin/text/MatchGroup;->getValue()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    return-object p1

    .line 41
    :cond_0
    return-object v3
.end method

.method public final uploadFile(Ljava/lang/String;Ljava/lang/String;Lcom/zykj/gallery/oss/OssToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/zykj/gallery/oss/OssToken;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p4, Lcom/zykj/gallery/oss/UploadUtils$uploadFile$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, Lcom/zykj/gallery/oss/UploadUtils$uploadFile$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/gallery/oss/UploadUtils$uploadFile$1;->label:I

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
    iput v1, v0, Lcom/zykj/gallery/oss/UploadUtils$uploadFile$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/gallery/oss/UploadUtils$uploadFile$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p4}, Lcom/zykj/gallery/oss/UploadUtils$uploadFile$1;-><init>(Lcom/zykj/gallery/oss/UploadUtils;Lkotlin/coroutines/Continuation;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, Lcom/zykj/gallery/oss/UploadUtils$uploadFile$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/gallery/oss/UploadUtils$uploadFile$1;->label:I

    .line 32
    .line 33
    const/4 v3, 0x3

    .line 34
    const/4 v4, 0x2

    .line 35
    const/4 v5, 0x1

    .line 36
    if-eqz v2, :cond_4

    .line 37
    .line 38
    if-eq v2, v5, :cond_3

    .line 39
    .line 40
    if-eq v2, v4, :cond_2

    .line 41
    .line 42
    if-ne v2, v3, :cond_1

    .line 43
    .line 44
    iget-object p1, v0, Lcom/zykj/gallery/oss/UploadUtils$uploadFile$1;->L$2:Ljava/lang/Object;

    .line 45
    .line 46
    move-object p3, p1

    .line 47
    check-cast p3, Lcom/zykj/gallery/oss/OssToken;

    .line 48
    .line 49
    iget-object p1, v0, Lcom/zykj/gallery/oss/UploadUtils$uploadFile$1;->L$1:Ljava/lang/Object;

    .line 50
    .line 51
    move-object p2, p1

    .line 52
    check-cast p2, Ljava/lang/String;

    .line 53
    .line 54
    iget-object p1, v0, Lcom/zykj/gallery/oss/UploadUtils$uploadFile$1;->L$0:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast p1, Ljava/lang/String;

    .line 57
    .line 58
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    goto/16 :goto_4

    .line 62
    .line 63
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 64
    .line 65
    const-string/jumbo p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 66
    .line 67
    .line 68
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    throw p1

    .line 72
    :cond_2
    iget-object p1, v0, Lcom/zykj/gallery/oss/UploadUtils$uploadFile$1;->L$2:Ljava/lang/Object;

    .line 73
    .line 74
    move-object p3, p1

    .line 75
    check-cast p3, Lcom/zykj/gallery/oss/OssToken;

    .line 76
    .line 77
    iget-object p1, v0, Lcom/zykj/gallery/oss/UploadUtils$uploadFile$1;->L$1:Ljava/lang/Object;

    .line 78
    .line 79
    move-object p2, p1

    .line 80
    check-cast p2, Ljava/lang/String;

    .line 81
    .line 82
    iget-object p1, v0, Lcom/zykj/gallery/oss/UploadUtils$uploadFile$1;->L$0:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast p1, Ljava/lang/String;

    .line 85
    .line 86
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_3
    iget-object p1, v0, Lcom/zykj/gallery/oss/UploadUtils$uploadFile$1;->L$2:Ljava/lang/Object;

    .line 91
    .line 92
    move-object p3, p1

    .line 93
    check-cast p3, Lcom/zykj/gallery/oss/OssToken;

    .line 94
    .line 95
    iget-object p1, v0, Lcom/zykj/gallery/oss/UploadUtils$uploadFile$1;->L$1:Ljava/lang/Object;

    .line 96
    .line 97
    move-object p2, p1

    .line 98
    check-cast p2, Ljava/lang/String;

    .line 99
    .line 100
    iget-object p1, v0, Lcom/zykj/gallery/oss/UploadUtils$uploadFile$1;->L$0:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast p1, Ljava/lang/String;

    .line 103
    .line 104
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_4
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p3}, Lcom/zykj/gallery/oss/OssToken;->getStrategy()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object p4

    .line 115
    const-string v2, "GridFS"

    .line 116
    .line 117
    invoke-static {p4, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v2

    .line 121
    if-eqz v2, :cond_6

    .line 122
    .line 123
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object p4

    .line 127
    iput-object p4, v0, Lcom/zykj/gallery/oss/UploadUtils$uploadFile$1;->L$0:Ljava/lang/Object;

    .line 128
    .line 129
    iput-object p2, v0, Lcom/zykj/gallery/oss/UploadUtils$uploadFile$1;->L$1:Ljava/lang/Object;

    .line 130
    .line 131
    iput-object p3, v0, Lcom/zykj/gallery/oss/UploadUtils$uploadFile$1;->L$2:Ljava/lang/Object;

    .line 132
    .line 133
    iput v5, v0, Lcom/zykj/gallery/oss/UploadUtils$uploadFile$1;->label:I

    .line 134
    .line 135
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/zykj/gallery/oss/UploadUtils;->gridFsUpload(Ljava/lang/String;Ljava/lang/String;Lcom/zykj/gallery/oss/OssToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object p4

    .line 139
    if-ne p4, v1, :cond_5

    .line 140
    .line 141
    goto :goto_3

    .line 142
    :cond_5
    :goto_1
    check-cast p4, Ljava/lang/Boolean;

    .line 143
    .line 144
    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 145
    .line 146
    .line 147
    move-result p1

    .line 148
    goto :goto_5

    .line 149
    :cond_6
    const-string v2, "ZYFS"

    .line 150
    .line 151
    invoke-static {p4, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result p4

    .line 155
    if-eqz p4, :cond_8

    .line 156
    .line 157
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object p4

    .line 161
    iput-object p4, v0, Lcom/zykj/gallery/oss/UploadUtils$uploadFile$1;->L$0:Ljava/lang/Object;

    .line 162
    .line 163
    iput-object p2, v0, Lcom/zykj/gallery/oss/UploadUtils$uploadFile$1;->L$1:Ljava/lang/Object;

    .line 164
    .line 165
    iput-object p3, v0, Lcom/zykj/gallery/oss/UploadUtils$uploadFile$1;->L$2:Ljava/lang/Object;

    .line 166
    .line 167
    iput v4, v0, Lcom/zykj/gallery/oss/UploadUtils$uploadFile$1;->label:I

    .line 168
    .line 169
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/zykj/gallery/oss/UploadUtils;->zyFsUpload(Ljava/lang/String;Ljava/lang/String;Lcom/zykj/gallery/oss/OssToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object p4

    .line 173
    if-ne p4, v1, :cond_7

    .line 174
    .line 175
    goto :goto_3

    .line 176
    :cond_7
    :goto_2
    check-cast p4, Ljava/lang/Boolean;

    .line 177
    .line 178
    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 179
    .line 180
    .line 181
    move-result p1

    .line 182
    goto :goto_5

    .line 183
    :cond_8
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object p4

    .line 187
    iput-object p4, v0, Lcom/zykj/gallery/oss/UploadUtils$uploadFile$1;->L$0:Ljava/lang/Object;

    .line 188
    .line 189
    iput-object p2, v0, Lcom/zykj/gallery/oss/UploadUtils$uploadFile$1;->L$1:Ljava/lang/Object;

    .line 190
    .line 191
    iput-object p3, v0, Lcom/zykj/gallery/oss/UploadUtils$uploadFile$1;->L$2:Ljava/lang/Object;

    .line 192
    .line 193
    iput v3, v0, Lcom/zykj/gallery/oss/UploadUtils$uploadFile$1;->label:I

    .line 194
    .line 195
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/zykj/gallery/oss/UploadUtils;->ossUpload(Ljava/lang/String;Ljava/lang/String;Lcom/zykj/gallery/oss/OssToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object p4

    .line 199
    if-ne p4, v1, :cond_9

    .line 200
    .line 201
    :goto_3
    return-object v1

    .line 202
    :cond_9
    :goto_4
    check-cast p4, Ljava/lang/Boolean;

    .line 203
    .line 204
    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 205
    .line 206
    .line 207
    move-result p1

    .line 208
    :goto_5
    if-eqz p1, :cond_a

    .line 209
    .line 210
    invoke-virtual {p3}, Lcom/zykj/gallery/oss/OssToken;->getEndpoint()Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object p1

    .line 214
    new-instance p3, Ljava/lang/StringBuilder;

    .line 215
    .line 216
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 217
    .line 218
    .line 219
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 220
    .line 221
    .line 222
    const-string p1, "/"

    .line 223
    .line 224
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 225
    .line 226
    .line 227
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 228
    .line 229
    .line 230
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object p1

    .line 234
    return-object p1

    .line 235
    :cond_a
    const/4 p1, 0x0

    .line 236
    return-object p1
.end method
