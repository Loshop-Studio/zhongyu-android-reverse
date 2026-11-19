.class public final Lcom/zykj/mistake/service/a;
.super La6/a;
.source "SourceFile"


# instance fields
.field public final synthetic b:Lcom/zykj/mistake/service/UploadFolderIntentService;

.field public final synthetic c:Landroid/os/Messenger;

.field public final synthetic d:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/zykj/mistake/service/UploadFolderIntentService;Landroid/os/Messenger;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/mistake/service/a;->b:Lcom/zykj/mistake/service/UploadFolderIntentService;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/mistake/service/a;->c:Landroid/os/Messenger;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/zykj/mistake/service/a;->d:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {p0}, La6/a;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onComplete()V
    .locals 3

    .line 1
    new-instance v0, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "UPLOAD_SUCCESS_URL"

    .line 7
    .line 8
    iget-object v2, p0, Lcom/zykj/mistake/service/a;->d:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const/16 v1, 0x67

    .line 14
    .line 15
    iget-object v2, p0, Lcom/zykj/mistake/service/a;->c:Landroid/os/Messenger;

    .line 16
    .line 17
    invoke-static {v1, v0, v2}, Lcom/zykj/mistake/service/UploadFolderIntentService;->b(ILandroid/os/Bundle;Landroid/os/Messenger;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final onError(Ljava/lang/Throwable;)V
    .locals 3

    .line 1
    const-string v0, "e"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lh4/a;->k(Ljava/lang/Throwable;)Lcom/zykj/mistake/network/ThrowableHandler$ResponeThrowable;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iget-object v0, p0, Lcom/zykj/mistake/service/a;->b:Lcom/zykj/mistake/service/UploadFolderIntentService;

    .line 11
    .line 12
    iget-object v0, v0, Lcom/zykj/mistake/service/UploadFolderIntentService;->a:Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {p1}, Lcom/zykj/mistake/network/ThrowableHandler$ResponeThrowable;->getMessage()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    new-instance v1, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    const-string v2, "throwable.message--->"

    .line 21
    .line 22
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 33
    .line 34
    .line 35
    const/4 p1, 0x0

    .line 36
    iget-object v0, p0, Lcom/zykj/mistake/service/a;->c:Landroid/os/Messenger;

    .line 37
    .line 38
    const/16 v1, 0xca

    .line 39
    .line 40
    invoke-static {v1, p1, v0}, Lcom/zykj/mistake/service/UploadFolderIntentService;->b(ILandroid/os/Bundle;Landroid/os/Messenger;)V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public final onNext(Ljava/lang/Object;)V
    .locals 3

    .line 1
    check-cast p1, Lcom/zykj/mistake/network/ApiResp;

    .line 2
    .line 3
    const-string v0, "resp"

    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/zykj/mistake/network/ApiResp;->getSuccess()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    iget-object v1, p0, Lcom/zykj/mistake/service/a;->b:Lcom/zykj/mistake/service/UploadFolderIntentService;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    iget-object p1, v1, Lcom/zykj/mistake/service/UploadFolderIntentService;->a:Ljava/lang/String;

    .line 17
    .line 18
    const-string v0, "resp ---> success"

    .line 19
    .line 20
    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    iget-object v0, v1, Lcom/zykj/mistake/service/UploadFolderIntentService;->a:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {p1}, Lcom/zykj/mistake/network/ApiResp;->getErrorMessage()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    new-instance v1, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    const-string v2, "resp.errorMessage--->"

    .line 33
    .line 34
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 45
    .line 46
    .line 47
    return-void
.end method
