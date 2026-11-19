.class final Lcom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment$downloadAndOpen$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment$downloadAndOpen$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lkotlinx/coroutines/CoroutineScope;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Ljava/lang/String;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lkotlinx/coroutines/CoroutineScope;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.zykj.huiwei.launcher.ui.fragment.NotificationDetailFragment$downloadAndOpen$1$1"
    f = "NotificationDetailFragment.kt"
    i = {}
    l = {
        0xba
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/zykj/download/work/DownloadFileWorkProxy;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Ljava/io/File;


# direct methods
.method public constructor <init>(Lcom/zykj/download/work/DownloadFileWorkProxy;Ljava/lang/String;Ljava/io/File;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment$downloadAndOpen$1$1;->b:Lcom/zykj/download/work/DownloadFileWorkProxy;

    iput-object p2, p0, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment$downloadAndOpen$1$1;->c:Ljava/lang/String;

    iput-object p3, p0, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment$downloadAndOpen$1$1;->d:Ljava/io/File;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 3

    new-instance p1, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment$downloadAndOpen$1$1;

    iget-object v0, p0, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment$downloadAndOpen$1$1;->b:Lcom/zykj/download/work/DownloadFileWorkProxy;

    iget-object v1, p0, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment$downloadAndOpen$1$1;->c:Ljava/lang/String;

    iget-object v2, p0, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment$downloadAndOpen$1$1;->d:Ljava/io/File;

    invoke-direct {p1, v0, v1, v2, p2}, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment$downloadAndOpen$1$1;-><init>(Lcom/zykj/download/work/DownloadFileWorkProxy;Ljava/lang/String;Ljava/io/File;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment$downloadAndOpen$1$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment$downloadAndOpen$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment$downloadAndOpen$1$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment$downloadAndOpen$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment$downloadAndOpen$1$1;->a:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    if-ne v1, v2, :cond_0

    .line 11
    .line 12
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-object p1

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p1

    .line 24
    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment$downloadAndOpen$1$1;->b:Lcom/zykj/download/work/DownloadFileWorkProxy;

    .line 28
    .line 29
    iget-object v1, p0, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment$downloadAndOpen$1$1;->c:Ljava/lang/String;

    .line 30
    .line 31
    iget-object v3, p0, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment$downloadAndOpen$1$1;->d:Ljava/io/File;

    .line 32
    .line 33
    iput v2, p0, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment$downloadAndOpen$1$1;->a:I

    .line 34
    .line 35
    invoke-virtual {p1, v1, v3, p0}, Lcom/zykj/download/work/DownloadFileWorkProxy;->checkDownloadSuccess(Ljava/lang/String;Ljava/io/File;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    if-ne p1, v0, :cond_2

    .line 40
    .line 41
    return-object v0

    .line 42
    :cond_2
    return-object p1
.end method
