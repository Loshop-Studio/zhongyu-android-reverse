.class final Lcom/zykj/download/work/DownloadFileWork$c$a;
.super Lkotlin/coroutines/jvm/internal/k;
.source "SourceFile"

# interfaces
.implements Lx2/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/download/work/DownloadFileWork$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/k;",
        "Lx2/p<",
        "Lf3/h0;",
        "Lq2/d<",
        "-",
        "Lcom/zykj/http/exception/RemoteCodeException;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "com.zykj.download.work.DownloadFileWork$downloadFileWithProgress$error$1$1"
    f = "DownloadFileWork.kt"
    l = {
        0x6c,
        0x78,
        0x7b,
        0x78,
        0x7b,
        0x78,
        0x7b,
        0x78,
        0x7b,
        0x78,
        0x7b
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field b:Ljava/lang/Object;

.field c:Ljava/lang/Object;

.field d:I

.field private synthetic e:Ljava/lang/Object;

.field final synthetic f:Lcom/zykj/download/work/DownloadFileWork;

.field final synthetic g:Lv1/b;


# direct methods
.method constructor <init>(Lcom/zykj/download/work/DownloadFileWork;Lv1/b;Lq2/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/download/work/DownloadFileWork;",
            "Lv1/b;",
            "Lq2/d<",
            "-",
            "Lcom/zykj/download/work/DownloadFileWork$c$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/zykj/download/work/DownloadFileWork$c$a;->f:Lcom/zykj/download/work/DownloadFileWork;

    iput-object p2, p0, Lcom/zykj/download/work/DownloadFileWork$c$a;->g:Lv1/b;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/k;-><init>(ILq2/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq2/d;)Lq2/d;
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lq2/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq2/d<",
            "*>;)",
            "Lq2/d<",
            "Lo2/r;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lcom/zykj/download/work/DownloadFileWork$c$a;

    iget-object v1, p0, Lcom/zykj/download/work/DownloadFileWork$c$a;->f:Lcom/zykj/download/work/DownloadFileWork;

    iget-object v2, p0, Lcom/zykj/download/work/DownloadFileWork$c$a;->g:Lv1/b;

    invoke-direct {v0, v1, v2, p2}, Lcom/zykj/download/work/DownloadFileWork$c$a;-><init>(Lcom/zykj/download/work/DownloadFileWork;Lv1/b;Lq2/d;)V

    iput-object p1, v0, Lcom/zykj/download/work/DownloadFileWork$c$a;->e:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lf3/h0;

    check-cast p2, Lq2/d;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/download/work/DownloadFileWork$c$a;->e(Lf3/h0;Lq2/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final e(Lf3/h0;Lq2/d;)Ljava/lang/Object;
    .locals 0
    .param p1    # Lf3/h0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lq2/d;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf3/h0;",
            "Lq2/d<",
            "-",
            "Lcom/zykj/http/exception/RemoteCodeException;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/zykj/download/work/DownloadFileWork$c$a;->create(Ljava/lang/Object;Lq2/d;)Lq2/d;

    move-result-object p1

    check-cast p1, Lcom/zykj/download/work/DownloadFileWork$c$a;

    sget-object p2, Lo2/r;->a:Lo2/r;

    invoke-virtual {p1, p2}, Lcom/zykj/download/work/DownloadFileWork$c$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-static {}, Lr2/b;->c()Ljava/lang/Object;

    move-result-object v0

    .line 1
    iget v1, p0, Lcom/zykj/download/work/DownloadFileWork$c$a;->d:I

    const-wide/16 v2, 0x3e8

    const/4 v4, 0x1

    const/4 v5, 0x0

    packed-switch v1, :pswitch_data_0

    .line 2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 3
    :pswitch_0
    iget-object v0, p0, Lcom/zykj/download/work/DownloadFileWork$c$a;->b:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Throwable;

    iget-object v1, p0, Lcom/zykj/download/work/DownloadFileWork$c$a;->e:Ljava/lang/Object;

    check-cast v1, Lf3/m1;

    invoke-static {p1}, Lo2/m;->b(Ljava/lang/Object;)V

    goto/16 :goto_c

    :pswitch_1
    iget-object v1, p0, Lcom/zykj/download/work/DownloadFileWork$c$a;->c:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Throwable;

    iget-object v2, p0, Lcom/zykj/download/work/DownloadFileWork$c$a;->b:Ljava/lang/Object;

    check-cast v2, Lcom/zykj/http/exception/RemoteCodeException;

    iget-object v3, p0, Lcom/zykj/download/work/DownloadFileWork$c$a;->e:Ljava/lang/Object;

    check-cast v3, Lf3/m1;

    invoke-static {p1}, Lo2/m;->b(Ljava/lang/Object;)V

    move-object p1, v1

    move-object v1, v3

    goto/16 :goto_b

    :pswitch_2
    iget-object v0, p0, Lcom/zykj/download/work/DownloadFileWork$c$a;->b:Ljava/lang/Object;

    check-cast v0, Lcom/zykj/http/exception/RemoteCodeException;

    iget-object v1, p0, Lcom/zykj/download/work/DownloadFileWork$c$a;->e:Ljava/lang/Object;

    check-cast v1, Lf3/m1;

    invoke-static {p1}, Lo2/m;->b(Ljava/lang/Object;)V

    goto/16 :goto_9

    :pswitch_3
    iget-object v1, p0, Lcom/zykj/download/work/DownloadFileWork$c$a;->b:Ljava/lang/Object;

    check-cast v1, Lcom/zykj/http/exception/RemoteCodeException;

    iget-object v2, p0, Lcom/zykj/download/work/DownloadFileWork$c$a;->e:Ljava/lang/Object;

    check-cast v2, Lf3/m1;

    invoke-static {p1}, Lo2/m;->b(Ljava/lang/Object;)V

    goto/16 :goto_4

    :pswitch_4
    iget-object v0, p0, Lcom/zykj/download/work/DownloadFileWork$c$a;->b:Ljava/lang/Object;

    check-cast v0, Lcom/zykj/http/exception/RemoteCodeException;

    iget-object v1, p0, Lcom/zykj/download/work/DownloadFileWork$c$a;->e:Ljava/lang/Object;

    check-cast v1, Lf3/m1;

    invoke-static {p1}, Lo2/m;->b(Ljava/lang/Object;)V

    goto/16 :goto_9

    :pswitch_5
    iget-object v1, p0, Lcom/zykj/download/work/DownloadFileWork$c$a;->b:Ljava/lang/Object;

    check-cast v1, Lcom/zykj/http/exception/RemoteCodeException;

    iget-object v2, p0, Lcom/zykj/download/work/DownloadFileWork$c$a;->e:Ljava/lang/Object;

    check-cast v2, Lf3/m1;

    invoke-static {p1}, Lo2/m;->b(Ljava/lang/Object;)V

    goto/16 :goto_6

    :pswitch_6
    iget-object v0, p0, Lcom/zykj/download/work/DownloadFileWork$c$a;->b:Ljava/lang/Object;

    check-cast v0, Lcom/zykj/http/exception/RemoteCodeException;

    iget-object v1, p0, Lcom/zykj/download/work/DownloadFileWork$c$a;->e:Ljava/lang/Object;

    check-cast v1, Lf3/m1;

    invoke-static {p1}, Lo2/m;->b(Ljava/lang/Object;)V

    goto/16 :goto_9

    :pswitch_7
    iget-object v1, p0, Lcom/zykj/download/work/DownloadFileWork$c$a;->b:Ljava/lang/Object;

    check-cast v1, Lcom/zykj/http/exception/RemoteCodeException;

    iget-object v2, p0, Lcom/zykj/download/work/DownloadFileWork$c$a;->e:Ljava/lang/Object;

    check-cast v2, Lf3/m1;

    invoke-static {p1}, Lo2/m;->b(Ljava/lang/Object;)V

    goto/16 :goto_8

    :pswitch_8
    iget-object v0, p0, Lcom/zykj/download/work/DownloadFileWork$c$a;->e:Ljava/lang/Object;

    check-cast v0, Lf3/m1;

    invoke-static {p1}, Lo2/m;->b(Ljava/lang/Object;)V

    goto/16 :goto_2

    :pswitch_9
    iget-object v1, p0, Lcom/zykj/download/work/DownloadFileWork$c$a;->e:Ljava/lang/Object;

    check-cast v1, Lf3/m1;

    invoke-static {p1}, Lo2/m;->b(Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_a
    iget-object v1, p0, Lcom/zykj/download/work/DownloadFileWork$c$a;->e:Ljava/lang/Object;

    check-cast v1, Lf3/m1;

    :try_start_0
    invoke-static {p1}, Lo2/m;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/net/UnknownServiceException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/net/SocketException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_3

    :catch_0
    move-exception p1

    goto/16 :goto_5

    :catch_1
    move-exception p1

    goto/16 :goto_7

    :pswitch_b
    invoke-static {p1}, Lo2/m;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/zykj/download/work/DownloadFileWork$c$a;->e:Ljava/lang/Object;

    check-cast p1, Lf3/h0;

    const/4 v7, 0x0

    const/4 v8, 0x0

    .line 4
    new-instance v9, Lcom/zykj/download/work/DownloadFileWork$c$a$b;

    iget-object v1, p0, Lcom/zykj/download/work/DownloadFileWork$c$a;->f:Lcom/zykj/download/work/DownloadFileWork;

    invoke-direct {v9, v1, v5}, Lcom/zykj/download/work/DownloadFileWork$c$a$b;-><init>(Lcom/zykj/download/work/DownloadFileWork;Lq2/d;)V

    const/4 v10, 0x3

    const/4 v11, 0x0

    move-object v6, p1

    invoke-static/range {v6 .. v11}, Lf3/g;->d(Lf3/h0;Lq2/g;Lf3/j0;Lx2/p;ILjava/lang/Object;)Lf3/m1;

    move-result-object v1

    .line 5
    new-instance v9, Lcom/zykj/download/work/DownloadFileWork$c$a$a;

    iget-object v6, p0, Lcom/zykj/download/work/DownloadFileWork$c$a;->f:Lcom/zykj/download/work/DownloadFileWork;

    iget-object v10, p0, Lcom/zykj/download/work/DownloadFileWork$c$a;->g:Lv1/b;

    invoke-direct {v9, v6, v10, v5}, Lcom/zykj/download/work/DownloadFileWork$c$a$a;-><init>(Lcom/zykj/download/work/DownloadFileWork;Lv1/b;Lq2/d;)V

    const/4 v10, 0x3

    move-object v6, p1

    invoke-static/range {v6 .. v11}, Lf3/g;->b(Lf3/h0;Lq2/g;Lf3/j0;Lx2/p;ILjava/lang/Object;)Lf3/o0;

    move-result-object p1

    .line 6
    :try_start_1
    iput-object v1, p0, Lcom/zykj/download/work/DownloadFileWork$c$a;->e:Ljava/lang/Object;

    iput v4, p0, Lcom/zykj/download/work/DownloadFileWork$c$a;->d:I

    invoke-interface {p1, p0}, Lf3/o0;->n(Lq2/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catch Ljava/net/UnknownServiceException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/net/SocketException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-ne p1, v0, :cond_0

    return-object v0

    .line 7
    :cond_0
    :goto_0
    iput-object v1, p0, Lcom/zykj/download/work/DownloadFileWork$c$a;->e:Ljava/lang/Object;

    const/4 p1, 0x2

    iput p1, p0, Lcom/zykj/download/work/DownloadFileWork$c$a;->d:I

    invoke-static {v2, v3, p0}, Lf3/r0;->a(JLq2/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_1

    return-object v0

    .line 8
    :cond_1
    :goto_1
    iget-object p1, p0, Lcom/zykj/download/work/DownloadFileWork$c$a;->f:Lcom/zykj/download/work/DownloadFileWork;

    invoke-virtual {p1}, Lcom/zykj/download/work/DownloadFileWork;->getProxy()Lcom/zykj/download/work/DownloadFileWorkProxy;

    move-result-object p1

    iget-object v2, p0, Lcom/zykj/download/work/DownloadFileWork$c$a;->g:Lv1/b;

    sget-object v3, Lcom/zykj/download/DownloadFlag;->DOWNLOAD_SUCCESS:Lcom/zykj/download/DownloadFlag;

    iput-object v1, p0, Lcom/zykj/download/work/DownloadFileWork$c$a;->e:Ljava/lang/Object;

    const/4 v6, 0x3

    iput v6, p0, Lcom/zykj/download/work/DownloadFileWork$c$a;->d:I

    invoke-virtual {p1, v2, v3, p0}, Lcom/zykj/download/work/DownloadFileWorkProxy;->updateFlag(Lv1/b;Lcom/zykj/download/DownloadFlag;Lq2/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    move-object v0, v1

    .line 9
    :goto_2
    invoke-static {v0, v5, v4, v5}, Lf3/m1$a;->a(Lf3/m1;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    goto/16 :goto_a

    .line 10
    :goto_3
    :try_start_2
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 11
    new-instance v6, Lcom/zykj/http/exception/RemoteCodeException;

    sget-object v7, Lcom/zykj/lib/error/code/ErrorCode;->DEFAULT_ERROR:Lcom/zykj/lib/error/code/ErrorCode;

    invoke-direct {v6, v7, p1}, Lcom/zykj/http/exception/RemoteCodeException;-><init>(Lcom/zykj/lib/error/code/ErrorCode;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 12
    iput-object v1, p0, Lcom/zykj/download/work/DownloadFileWork$c$a;->e:Ljava/lang/Object;

    iput-object v6, p0, Lcom/zykj/download/work/DownloadFileWork$c$a;->b:Ljava/lang/Object;

    const/16 p1, 0x8

    iput p1, p0, Lcom/zykj/download/work/DownloadFileWork$c$a;->d:I

    invoke-static {v2, v3, p0}, Lf3/r0;->a(JLq2/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    move-object v2, v1

    move-object v1, v6

    :goto_4
    if-nez v1, :cond_9

    .line 13
    iget-object p1, p0, Lcom/zykj/download/work/DownloadFileWork$c$a;->f:Lcom/zykj/download/work/DownloadFileWork;

    invoke-virtual {p1}, Lcom/zykj/download/work/DownloadFileWork;->getProxy()Lcom/zykj/download/work/DownloadFileWorkProxy;

    move-result-object p1

    iget-object v3, p0, Lcom/zykj/download/work/DownloadFileWork$c$a;->g:Lv1/b;

    sget-object v6, Lcom/zykj/download/DownloadFlag;->DOWNLOAD_SUCCESS:Lcom/zykj/download/DownloadFlag;

    iput-object v2, p0, Lcom/zykj/download/work/DownloadFileWork$c$a;->e:Ljava/lang/Object;

    iput-object v1, p0, Lcom/zykj/download/work/DownloadFileWork$c$a;->b:Ljava/lang/Object;

    const/16 v7, 0x9

    iput v7, p0, Lcom/zykj/download/work/DownloadFileWork$c$a;->d:I

    invoke-virtual {p1, v3, v6, p0}, Lcom/zykj/download/work/DownloadFileWorkProxy;->updateFlag(Lv1/b;Lcom/zykj/download/DownloadFlag;Lq2/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    move-object v0, v1

    move-object v1, v2

    goto/16 :goto_9

    .line 14
    :goto_5
    :try_start_3
    invoke-virtual {p1}, Ljava/net/SocketException;->printStackTrace()V

    .line 15
    new-instance v6, Lcom/zykj/http/exception/RemoteCodeException;

    sget-object v7, Lcom/zykj/lib/error/code/ErrorCode;->NET_SOCKET_TIME_OUT:Lcom/zykj/lib/error/code/ErrorCode;

    invoke-direct {v6, v7, p1}, Lcom/zykj/http/exception/RemoteCodeException;-><init>(Lcom/zykj/lib/error/code/ErrorCode;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 16
    iput-object v1, p0, Lcom/zykj/download/work/DownloadFileWork$c$a;->e:Ljava/lang/Object;

    iput-object v6, p0, Lcom/zykj/download/work/DownloadFileWork$c$a;->b:Ljava/lang/Object;

    const/4 p1, 0x6

    iput p1, p0, Lcom/zykj/download/work/DownloadFileWork$c$a;->d:I

    invoke-static {v2, v3, p0}, Lf3/r0;->a(JLq2/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    return-object v0

    :cond_5
    move-object v2, v1

    move-object v1, v6

    :goto_6
    if-nez v1, :cond_9

    .line 17
    iget-object p1, p0, Lcom/zykj/download/work/DownloadFileWork$c$a;->f:Lcom/zykj/download/work/DownloadFileWork;

    invoke-virtual {p1}, Lcom/zykj/download/work/DownloadFileWork;->getProxy()Lcom/zykj/download/work/DownloadFileWorkProxy;

    move-result-object p1

    iget-object v3, p0, Lcom/zykj/download/work/DownloadFileWork$c$a;->g:Lv1/b;

    sget-object v6, Lcom/zykj/download/DownloadFlag;->DOWNLOAD_SUCCESS:Lcom/zykj/download/DownloadFlag;

    iput-object v2, p0, Lcom/zykj/download/work/DownloadFileWork$c$a;->e:Ljava/lang/Object;

    iput-object v1, p0, Lcom/zykj/download/work/DownloadFileWork$c$a;->b:Ljava/lang/Object;

    const/4 v7, 0x7

    iput v7, p0, Lcom/zykj/download/work/DownloadFileWork$c$a;->d:I

    invoke-virtual {p1, v3, v6, p0}, Lcom/zykj/download/work/DownloadFileWorkProxy;->updateFlag(Lv1/b;Lcom/zykj/download/DownloadFlag;Lq2/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    return-object v0

    :cond_6
    move-object v0, v1

    move-object v1, v2

    goto :goto_9

    .line 18
    :goto_7
    :try_start_4
    invoke-virtual {p1}, Ljava/net/UnknownServiceException;->printStackTrace()V

    .line 19
    new-instance v6, Lcom/zykj/http/exception/RemoteCodeException;

    sget-object v7, Lcom/zykj/lib/error/code/ErrorCode;->NET_UN_KNOW_SERVER:Lcom/zykj/lib/error/code/ErrorCode;

    invoke-direct {v6, v7, p1}, Lcom/zykj/http/exception/RemoteCodeException;-><init>(Lcom/zykj/lib/error/code/ErrorCode;Ljava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 20
    iput-object v1, p0, Lcom/zykj/download/work/DownloadFileWork$c$a;->e:Ljava/lang/Object;

    iput-object v6, p0, Lcom/zykj/download/work/DownloadFileWork$c$a;->b:Ljava/lang/Object;

    const/4 p1, 0x4

    iput p1, p0, Lcom/zykj/download/work/DownloadFileWork$c$a;->d:I

    invoke-static {v2, v3, p0}, Lf3/r0;->a(JLq2/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    return-object v0

    :cond_7
    move-object v2, v1

    move-object v1, v6

    :goto_8
    if-nez v1, :cond_9

    .line 21
    iget-object p1, p0, Lcom/zykj/download/work/DownloadFileWork$c$a;->f:Lcom/zykj/download/work/DownloadFileWork;

    invoke-virtual {p1}, Lcom/zykj/download/work/DownloadFileWork;->getProxy()Lcom/zykj/download/work/DownloadFileWorkProxy;

    move-result-object p1

    iget-object v3, p0, Lcom/zykj/download/work/DownloadFileWork$c$a;->g:Lv1/b;

    sget-object v6, Lcom/zykj/download/DownloadFlag;->DOWNLOAD_SUCCESS:Lcom/zykj/download/DownloadFlag;

    iput-object v2, p0, Lcom/zykj/download/work/DownloadFileWork$c$a;->e:Ljava/lang/Object;

    iput-object v1, p0, Lcom/zykj/download/work/DownloadFileWork$c$a;->b:Ljava/lang/Object;

    const/4 v7, 0x5

    iput v7, p0, Lcom/zykj/download/work/DownloadFileWork$c$a;->d:I

    invoke-virtual {p1, v3, v6, p0}, Lcom/zykj/download/work/DownloadFileWorkProxy;->updateFlag(Lv1/b;Lcom/zykj/download/DownloadFlag;Lq2/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_8

    return-object v0

    :cond_8
    move-object v0, v1

    move-object v1, v2

    :goto_9
    move-object v2, v1

    move-object v1, v0

    .line 22
    :cond_9
    invoke-static {v2, v5, v4, v5}, Lf3/m1$a;->a(Lf3/m1;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    move-object v5, v1

    :goto_a
    return-object v5

    :catchall_1
    move-exception p1

    .line 23
    iput-object v1, p0, Lcom/zykj/download/work/DownloadFileWork$c$a;->e:Ljava/lang/Object;

    iput-object v5, p0, Lcom/zykj/download/work/DownloadFileWork$c$a;->b:Ljava/lang/Object;

    iput-object p1, p0, Lcom/zykj/download/work/DownloadFileWork$c$a;->c:Ljava/lang/Object;

    const/16 v6, 0xa

    iput v6, p0, Lcom/zykj/download/work/DownloadFileWork$c$a;->d:I

    invoke-static {v2, v3, p0}, Lf3/r0;->a(JLq2/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_a

    return-object v0

    :cond_a
    move-object v2, v5

    :goto_b
    if-nez v2, :cond_c

    .line 24
    iget-object v2, p0, Lcom/zykj/download/work/DownloadFileWork$c$a;->f:Lcom/zykj/download/work/DownloadFileWork;

    invoke-virtual {v2}, Lcom/zykj/download/work/DownloadFileWork;->getProxy()Lcom/zykj/download/work/DownloadFileWorkProxy;

    move-result-object v2

    iget-object v3, p0, Lcom/zykj/download/work/DownloadFileWork$c$a;->g:Lv1/b;

    sget-object v6, Lcom/zykj/download/DownloadFlag;->DOWNLOAD_SUCCESS:Lcom/zykj/download/DownloadFlag;

    iput-object v1, p0, Lcom/zykj/download/work/DownloadFileWork$c$a;->e:Ljava/lang/Object;

    iput-object p1, p0, Lcom/zykj/download/work/DownloadFileWork$c$a;->b:Ljava/lang/Object;

    iput-object v5, p0, Lcom/zykj/download/work/DownloadFileWork$c$a;->c:Ljava/lang/Object;

    const/16 v7, 0xb

    iput v7, p0, Lcom/zykj/download/work/DownloadFileWork$c$a;->d:I

    invoke-virtual {v2, v3, v6, p0}, Lcom/zykj/download/work/DownloadFileWorkProxy;->updateFlag(Lv1/b;Lcom/zykj/download/DownloadFlag;Lq2/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_b

    return-object v0

    :cond_b
    move-object v0, p1

    :goto_c
    move-object p1, v0

    .line 25
    :cond_c
    invoke-static {v1, v5, v4, v5}, Lf3/m1$a;->a(Lf3/m1;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
