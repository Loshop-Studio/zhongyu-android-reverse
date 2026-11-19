.class public final Lcom/zykj/evaluation/upload/UploadUtils;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/zykj/evaluation/upload/UploadUtils;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/zykj/evaluation/upload/UploadUtils;

    invoke-direct {v0}, Lcom/zykj/evaluation/upload/UploadUtils;-><init>()V

    sput-object v0, Lcom/zykj/evaluation/upload/UploadUtils;->a:Lcom/zykj/evaluation/upload/UploadUtils;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;Lcom/zykj/evaluation/upload/OssToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance p1, La9/u$a;

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-direct {p1, v2, v1, v2}, La9/u$a;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 11
    .line 12
    .line 13
    sget-object v1, La9/u;->k:La9/t;

    .line 14
    .line 15
    invoke-virtual {p1, v1}, La9/u$a;->e(La9/t;)La9/u$a;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    sget-object v3, La9/x;->Companion:La9/x$a;

    .line 24
    .line 25
    sget-object v4, La9/t;->e:La9/t$a;

    .line 26
    .line 27
    const-string v5, "multipart/form-data"

    .line 28
    .line 29
    invoke-virtual {v4, v5}, La9/t$a;->b(Ljava/lang/String;)La9/t;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    invoke-virtual {v3, v0, v4}, La9/x$a;->g(Ljava/io/File;La9/t;)La9/x;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    const-string v3, "file"

    .line 38
    .line 39
    invoke-virtual {p1, v3, v1, v0}, La9/u$a;->a(Ljava/lang/String;Ljava/lang/String;La9/x;)La9/u$a;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {p1}, La9/u$a;->d()La9/u;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    new-instance v0, La9/w$a;

    .line 48
    .line 49
    invoke-direct {v0}, La9/w$a;-><init>()V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p3}, Lcom/zykj/evaluation/upload/OssToken;->getEndpoint()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    new-instance v3, Ljava/lang/StringBuilder;

    .line 57
    .line 58
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    const-string v1, "/"

    .line 65
    .line 66
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p2

    .line 76
    invoke-virtual {v0, p2}, La9/w$a;->o(Ljava/lang/String;)La9/w$a;

    .line 77
    .line 78
    .line 79
    move-result-object p2

    .line 80
    invoke-virtual {p3}, Lcom/zykj/evaluation/upload/OssToken;->getSecurityToken()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p3

    .line 84
    new-instance v0, Ljava/lang/StringBuilder;

    .line 85
    .line 86
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 87
    .line 88
    .line 89
    const-string v1, "bearer "

    .line 90
    .line 91
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p3

    .line 101
    const-string v0, "Authorization"

    .line 102
    .line 103
    invoke-virtual {p2, v0, p3}, La9/w$a;->a(Ljava/lang/String;Ljava/lang/String;)La9/w$a;

    .line 104
    .line 105
    .line 106
    move-result-object p2

    .line 107
    const-string p3, "Checksum"

    .line 108
    .line 109
    const-string v0, "3f4e17759c6b9c6a364211895bbb2abdc0ba62db"

    .line 110
    .line 111
    invoke-virtual {p2, p3, v0}, La9/w$a;->a(Ljava/lang/String;Ljava/lang/String;)La9/w$a;

    .line 112
    .line 113
    .line 114
    move-result-object p2

    .line 115
    invoke-virtual {p2, p1}, La9/w$a;->k(La9/x;)La9/w$a;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    invoke-virtual {p1}, La9/w$a;->b()La9/w;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    .line 124
    .line 125
    .line 126
    move-result-object p2

    .line 127
    new-instance p3, Lcom/zykj/evaluation/upload/UploadUtils$gridFsUpload$2;

    .line 128
    .line 129
    invoke-direct {p3, p1, v2}, Lcom/zykj/evaluation/upload/UploadUtils$gridFsUpload$2;-><init>(La9/w;Lkotlin/coroutines/Continuation;)V

    .line 130
    .line 131
    .line 132
    invoke-static {p2, p3, p4}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    return-object p1
.end method

.method public final b(Ljava/lang/String;Ljava/lang/String;Lcom/zykj/evaluation/upload/OssToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 10

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "start ossUpload file:"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    const-string v1, ", serverPath: "

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    new-instance v0, Lcom/alibaba/sdk/android/oss/common/auth/OSSStsTokenCredentialProvider;

    .line 34
    .line 35
    invoke-virtual {p3}, Lcom/zykj/evaluation/upload/OssToken;->getAccessKeyId()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {p3}, Lcom/zykj/evaluation/upload/OssToken;->getAccessKeySecret()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-virtual {p3}, Lcom/zykj/evaluation/upload/OssToken;->getSecurityToken()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    invoke-direct {v0, v1, v2, v3}, Lcom/alibaba/sdk/android/oss/common/auth/OSSStsTokenCredentialProvider;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p3}, Lcom/zykj/evaluation/upload/OssToken;->getEndpoint()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    invoke-virtual {p3}, Lcom/zykj/evaluation/upload/OssToken;->getBucket()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    new-instance v2, Ljava/lang/StringBuilder;

    .line 59
    .line 60
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    const-string v1, "."

    .line 67
    .line 68
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v5

    .line 75
    const/4 v8, 0x4

    .line 76
    const/4 v9, 0x0

    .line 77
    const-string v6, ""

    .line 78
    .line 79
    const/4 v7, 0x0

    .line 80
    invoke-static/range {v4 .. v9}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    new-instance v2, Lcom/alibaba/sdk/android/oss/OSSClient;

    .line 85
    .line 86
    invoke-static {}, Lcom/blankj/utilcode/util/Utils;->getApp()Landroid/app/Application;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    invoke-direct {v2, v3, v1, v0}, Lcom/alibaba/sdk/android/oss/OSSClient;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/alibaba/sdk/android/oss/common/auth/OSSCredentialProvider;)V

    .line 91
    .line 92
    .line 93
    new-instance v0, Lcom/alibaba/sdk/android/oss/model/PutObjectRequest;

    .line 94
    .line 95
    invoke-virtual {p3}, Lcom/zykj/evaluation/upload/OssToken;->getBucket()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p3

    .line 99
    invoke-direct {v0, p3, p2, p1}, Lcom/alibaba/sdk/android/oss/model/PutObjectRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    .line 103
    .line 104
    .line 105
    move-result-object p2

    .line 106
    new-instance p3, Lcom/zykj/evaluation/upload/UploadUtils$ossUpload$2;

    .line 107
    .line 108
    const/4 v1, 0x0

    .line 109
    invoke-direct {p3, v2, v0, p1, v1}, Lcom/zykj/evaluation/upload/UploadUtils$ossUpload$2;-><init>(Lcom/alibaba/sdk/android/oss/OSSClient;Lcom/alibaba/sdk/android/oss/model/PutObjectRequest;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    .line 110
    .line 111
    .line 112
    invoke-static {p2, p3, p4}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    return-object p1
.end method

.method public final c(Ljava/lang/String;Ljava/lang/String;Lcom/zykj/evaluation/upload/OssToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p4, Lcom/zykj/evaluation/upload/UploadUtils$uploadFile$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, Lcom/zykj/evaluation/upload/UploadUtils$uploadFile$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/evaluation/upload/UploadUtils$uploadFile$1;->f:I

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
    iput v1, v0, Lcom/zykj/evaluation/upload/UploadUtils$uploadFile$1;->f:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/evaluation/upload/UploadUtils$uploadFile$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p4}, Lcom/zykj/evaluation/upload/UploadUtils$uploadFile$1;-><init>(Lcom/zykj/evaluation/upload/UploadUtils;Lkotlin/coroutines/Continuation;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, Lcom/zykj/evaluation/upload/UploadUtils$uploadFile$1;->d:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/evaluation/upload/UploadUtils$uploadFile$1;->f:I

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
    iget-object p1, v0, Lcom/zykj/evaluation/upload/UploadUtils$uploadFile$1;->c:Ljava/lang/Object;

    .line 45
    .line 46
    move-object p3, p1

    .line 47
    check-cast p3, Lcom/zykj/evaluation/upload/OssToken;

    .line 48
    .line 49
    iget-object p1, v0, Lcom/zykj/evaluation/upload/UploadUtils$uploadFile$1;->b:Ljava/lang/Object;

    .line 50
    .line 51
    move-object p2, p1

    .line 52
    check-cast p2, Ljava/lang/String;

    .line 53
    .line 54
    iget-object p1, v0, Lcom/zykj/evaluation/upload/UploadUtils$uploadFile$1;->a:Ljava/lang/Object;

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
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 66
    .line 67
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    throw p1

    .line 71
    :cond_2
    iget-object p1, v0, Lcom/zykj/evaluation/upload/UploadUtils$uploadFile$1;->c:Ljava/lang/Object;

    .line 72
    .line 73
    move-object p3, p1

    .line 74
    check-cast p3, Lcom/zykj/evaluation/upload/OssToken;

    .line 75
    .line 76
    iget-object p1, v0, Lcom/zykj/evaluation/upload/UploadUtils$uploadFile$1;->b:Ljava/lang/Object;

    .line 77
    .line 78
    move-object p2, p1

    .line 79
    check-cast p2, Ljava/lang/String;

    .line 80
    .line 81
    iget-object p1, v0, Lcom/zykj/evaluation/upload/UploadUtils$uploadFile$1;->a:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast p1, Ljava/lang/String;

    .line 84
    .line 85
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_3
    iget-object p1, v0, Lcom/zykj/evaluation/upload/UploadUtils$uploadFile$1;->c:Ljava/lang/Object;

    .line 90
    .line 91
    move-object p3, p1

    .line 92
    check-cast p3, Lcom/zykj/evaluation/upload/OssToken;

    .line 93
    .line 94
    iget-object p1, v0, Lcom/zykj/evaluation/upload/UploadUtils$uploadFile$1;->b:Ljava/lang/Object;

    .line 95
    .line 96
    move-object p2, p1

    .line 97
    check-cast p2, Ljava/lang/String;

    .line 98
    .line 99
    iget-object p1, v0, Lcom/zykj/evaluation/upload/UploadUtils$uploadFile$1;->a:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast p1, Ljava/lang/String;

    .line 102
    .line 103
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_4
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p3}, Lcom/zykj/evaluation/upload/OssToken;->getStrategy()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p4

    .line 114
    const-string v2, "GridFS"

    .line 115
    .line 116
    invoke-static {p4, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result v2

    .line 120
    if-eqz v2, :cond_6

    .line 121
    .line 122
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object p4

    .line 126
    iput-object p4, v0, Lcom/zykj/evaluation/upload/UploadUtils$uploadFile$1;->a:Ljava/lang/Object;

    .line 127
    .line 128
    iput-object p2, v0, Lcom/zykj/evaluation/upload/UploadUtils$uploadFile$1;->b:Ljava/lang/Object;

    .line 129
    .line 130
    iput-object p3, v0, Lcom/zykj/evaluation/upload/UploadUtils$uploadFile$1;->c:Ljava/lang/Object;

    .line 131
    .line 132
    iput v5, v0, Lcom/zykj/evaluation/upload/UploadUtils$uploadFile$1;->f:I

    .line 133
    .line 134
    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/zykj/evaluation/upload/UploadUtils;->a(Ljava/lang/String;Ljava/lang/String;Lcom/zykj/evaluation/upload/OssToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object p4

    .line 138
    if-ne p4, v1, :cond_5

    .line 139
    .line 140
    goto :goto_3

    .line 141
    :cond_5
    :goto_1
    check-cast p4, Ljava/lang/Boolean;

    .line 142
    .line 143
    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 144
    .line 145
    .line 146
    move-result p1

    .line 147
    goto :goto_5

    .line 148
    :cond_6
    const-string v2, "ZYFS"

    .line 149
    .line 150
    invoke-static {p4, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    move-result p4

    .line 154
    if-eqz p4, :cond_8

    .line 155
    .line 156
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object p4

    .line 160
    iput-object p4, v0, Lcom/zykj/evaluation/upload/UploadUtils$uploadFile$1;->a:Ljava/lang/Object;

    .line 161
    .line 162
    iput-object p2, v0, Lcom/zykj/evaluation/upload/UploadUtils$uploadFile$1;->b:Ljava/lang/Object;

    .line 163
    .line 164
    iput-object p3, v0, Lcom/zykj/evaluation/upload/UploadUtils$uploadFile$1;->c:Ljava/lang/Object;

    .line 165
    .line 166
    iput v4, v0, Lcom/zykj/evaluation/upload/UploadUtils$uploadFile$1;->f:I

    .line 167
    .line 168
    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/zykj/evaluation/upload/UploadUtils;->d(Ljava/lang/String;Ljava/lang/String;Lcom/zykj/evaluation/upload/OssToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object p4

    .line 172
    if-ne p4, v1, :cond_7

    .line 173
    .line 174
    goto :goto_3

    .line 175
    :cond_7
    :goto_2
    check-cast p4, Ljava/lang/Boolean;

    .line 176
    .line 177
    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 178
    .line 179
    .line 180
    move-result p1

    .line 181
    goto :goto_5

    .line 182
    :cond_8
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object p4

    .line 186
    iput-object p4, v0, Lcom/zykj/evaluation/upload/UploadUtils$uploadFile$1;->a:Ljava/lang/Object;

    .line 187
    .line 188
    iput-object p2, v0, Lcom/zykj/evaluation/upload/UploadUtils$uploadFile$1;->b:Ljava/lang/Object;

    .line 189
    .line 190
    iput-object p3, v0, Lcom/zykj/evaluation/upload/UploadUtils$uploadFile$1;->c:Ljava/lang/Object;

    .line 191
    .line 192
    iput v3, v0, Lcom/zykj/evaluation/upload/UploadUtils$uploadFile$1;->f:I

    .line 193
    .line 194
    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/zykj/evaluation/upload/UploadUtils;->b(Ljava/lang/String;Ljava/lang/String;Lcom/zykj/evaluation/upload/OssToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object p4

    .line 198
    if-ne p4, v1, :cond_9

    .line 199
    .line 200
    :goto_3
    return-object v1

    .line 201
    :cond_9
    :goto_4
    check-cast p4, Ljava/lang/Boolean;

    .line 202
    .line 203
    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 204
    .line 205
    .line 206
    move-result p1

    .line 207
    :goto_5
    if-eqz p1, :cond_a

    .line 208
    .line 209
    invoke-virtual {p3}, Lcom/zykj/evaluation/upload/OssToken;->getEndpoint()Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object p1

    .line 213
    new-instance p3, Ljava/lang/StringBuilder;

    .line 214
    .line 215
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 216
    .line 217
    .line 218
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 219
    .line 220
    .line 221
    const-string p1, "/"

    .line 222
    .line 223
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 224
    .line 225
    .line 226
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 227
    .line 228
    .line 229
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object p1

    .line 233
    return-object p1

    .line 234
    :cond_a
    const/4 p1, 0x0

    .line 235
    return-object p1
.end method

.method public final d(Ljava/lang/String;Ljava/lang/String;Lcom/zykj/evaluation/upload/OssToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance p1, La9/u$a;

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-direct {p1, v2, v1, v2}, La9/u$a;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 11
    .line 12
    .line 13
    sget-object v1, La9/u;->k:La9/t;

    .line 14
    .line 15
    invoke-virtual {p1, v1}, La9/u$a;->e(La9/t;)La9/u$a;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    sget-object v3, La9/x;->Companion:La9/x$a;

    .line 24
    .line 25
    sget-object v4, La9/t;->e:La9/t$a;

    .line 26
    .line 27
    const-string v5, "multipart/form-data"

    .line 28
    .line 29
    invoke-virtual {v4, v5}, La9/t$a;->b(Ljava/lang/String;)La9/t;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    invoke-virtual {v3, v0, v4}, La9/x$a;->g(Ljava/io/File;La9/t;)La9/x;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    const-string v3, "file"

    .line 38
    .line 39
    invoke-virtual {p1, v3, v1, v0}, La9/u$a;->a(Ljava/lang/String;Ljava/lang/String;La9/x;)La9/u$a;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {p1}, La9/u$a;->d()La9/u;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    new-instance v0, La9/w$a;

    .line 48
    .line 49
    invoke-direct {v0}, La9/w$a;-><init>()V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p3}, Lcom/zykj/evaluation/upload/OssToken;->getEndpoint()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    new-instance v3, Ljava/lang/StringBuilder;

    .line 57
    .line 58
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    const-string v1, "/"

    .line 65
    .line 66
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p2

    .line 76
    invoke-virtual {v0, p2}, La9/w$a;->o(Ljava/lang/String;)La9/w$a;

    .line 77
    .line 78
    .line 79
    move-result-object p2

    .line 80
    invoke-virtual {p3}, Lcom/zykj/evaluation/upload/OssToken;->getSecurityToken()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p3

    .line 84
    new-instance v0, Ljava/lang/StringBuilder;

    .line 85
    .line 86
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 87
    .line 88
    .line 89
    const-string v1, "bearer "

    .line 90
    .line 91
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p3

    .line 101
    const-string v0, "Authorization"

    .line 102
    .line 103
    invoke-virtual {p2, v0, p3}, La9/w$a;->a(Ljava/lang/String;Ljava/lang/String;)La9/w$a;

    .line 104
    .line 105
    .line 106
    move-result-object p2

    .line 107
    const-string p3, "Checksum"

    .line 108
    .line 109
    const-string v0, "3f4e17759c6b9c6a364211895bbb2abdc0ba62db"

    .line 110
    .line 111
    invoke-virtual {p2, p3, v0}, La9/w$a;->a(Ljava/lang/String;Ljava/lang/String;)La9/w$a;

    .line 112
    .line 113
    .line 114
    move-result-object p2

    .line 115
    invoke-virtual {p2, p1}, La9/w$a;->k(La9/x;)La9/w$a;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    invoke-virtual {p1}, La9/w$a;->b()La9/w;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    .line 124
    .line 125
    .line 126
    move-result-object p2

    .line 127
    new-instance p3, Lcom/zykj/evaluation/upload/UploadUtils$zyFsUpload$2;

    .line 128
    .line 129
    invoke-direct {p3, p1, v2}, Lcom/zykj/evaluation/upload/UploadUtils$zyFsUpload$2;-><init>(La9/w;Lkotlin/coroutines/Continuation;)V

    .line 130
    .line 131
    .line 132
    invoke-static {p2, p3, p4}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    return-object p1
.end method
