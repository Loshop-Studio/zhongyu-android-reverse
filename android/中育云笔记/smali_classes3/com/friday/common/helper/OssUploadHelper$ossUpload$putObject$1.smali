.class final Lcom/friday/common/helper/OssUploadHelper$ossUpload$putObject$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/common/helper/OssUploadHelper;->d(Ljava/lang/String;Ljava/lang/String;Lvc/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lhd/p;"
    }
.end annotation

.annotation runtime Lxc/d;
    c = "com.friday.common.helper.OssUploadHelper$ossUpload$putObject$1"
    f = "OssUploadHelper.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public final synthetic d:Lcom/alibaba/sdk/android/oss/OSSClient;

.field public final synthetic e:Lcom/alibaba/sdk/android/oss/model/PutObjectRequest;

.field public final synthetic f:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/alibaba/sdk/android/oss/OSSClient;Lcom/alibaba/sdk/android/oss/model/PutObjectRequest;Ljava/lang/String;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/common/helper/OssUploadHelper$ossUpload$putObject$1;->d:Lcom/alibaba/sdk/android/oss/OSSClient;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/common/helper/OssUploadHelper$ossUpload$putObject$1;->e:Lcom/alibaba/sdk/android/oss/model/PutObjectRequest;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/friday/common/helper/OssUploadHelper$ossUpload$putObject$1;->f:Ljava/lang/String;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 3

    .line 1
    new-instance p1, Lcom/friday/common/helper/OssUploadHelper$ossUpload$putObject$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/common/helper/OssUploadHelper$ossUpload$putObject$1;->d:Lcom/alibaba/sdk/android/oss/OSSClient;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/friday/common/helper/OssUploadHelper$ossUpload$putObject$1;->e:Lcom/alibaba/sdk/android/oss/model/PutObjectRequest;

    .line 6
    .line 7
    iget-object v2, p0, Lcom/friday/common/helper/OssUploadHelper$ossUpload$putObject$1;->f:Ljava/lang/String;

    .line 8
    .line 9
    invoke-direct {p1, v0, v1, v2, p2}, Lcom/friday/common/helper/OssUploadHelper$ossUpload$putObject$1;-><init>(Lcom/alibaba/sdk/android/oss/OSSClient;Lcom/alibaba/sdk/android/oss/model/PutObjectRequest;Ljava/lang/String;Lvc/c;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/friday/common/helper/OssUploadHelper$ossUpload$putObject$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/common/helper/OssUploadHelper$ossUpload$putObject$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/common/helper/OssUploadHelper$ossUpload$putObject$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/common/helper/OssUploadHelper$ossUpload$putObject$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/friday/common/helper/OssUploadHelper$ossUpload$putObject$1;->c:I

    .line 5
    .line 6
    if-nez v0, :cond_2

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/friday/common/helper/OssUploadHelper$ossUpload$putObject$1;->d:Lcom/alibaba/sdk/android/oss/OSSClient;

    .line 12
    .line 13
    iget-object v0, p0, Lcom/friday/common/helper/OssUploadHelper$ossUpload$putObject$1;->e:Lcom/alibaba/sdk/android/oss/model/PutObjectRequest;

    .line 14
    .line 15
    :try_start_0
    sget-object v1, Lkotlin/Result;->d:Lkotlin/Result$a;

    .line 16
    .line 17
    invoke-virtual {p1, v0}, Lcom/alibaba/sdk/android/oss/OSSClient;->putObject(Lcom/alibaba/sdk/android/oss/model/PutObjectRequest;)Lcom/alibaba/sdk/android/oss/model/PutObjectResult;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-static {p1}, Lkotlin/Result;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    move-exception p1

    .line 27
    sget-object v0, Lkotlin/Result;->d:Lkotlin/Result$a;

    .line 28
    .line 29
    invoke-static {p1}, Lkotlin/b;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-static {p1}, Lkotlin/Result;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    :goto_0
    iget-object v0, p0, Lcom/friday/common/helper/OssUploadHelper$ossUpload$putObject$1;->f:Ljava/lang/String;

    .line 38
    .line 39
    invoke-static {p1}, Lkotlin/Result;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    if-eqz v1, :cond_0

    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    new-instance v2, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 52
    .line 53
    .line 54
    const-string v3, "["

    .line 55
    .line 56
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    const-string v0, "]\u4e0a\u4f20OSS\u5931\u8d25\uff0creason: "

    .line 63
    .line 64
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    :cond_0
    invoke-static {p1}, Lkotlin/Result;->g(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    if-eqz v0, :cond_1

    .line 86
    .line 87
    const/4 p1, 0x0

    .line 88
    :cond_1
    return-object p1

    .line 89
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 90
    .line 91
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 92
    .line 93
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    throw p1
.end method
