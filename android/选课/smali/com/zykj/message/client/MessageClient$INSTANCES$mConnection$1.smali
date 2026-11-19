.class public final Lcom/zykj/message/client/MessageClient$INSTANCES$mConnection$1;
.super Ljava/lang/Object;
.source "MessageClient.kt"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/message/client/MessageClient$INSTANCES;-><init>(Ljava/lang/String;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nMessageClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MessageClient.kt\ncom/zykj/message/client/MessageClient$INSTANCES$mConnection$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,551:1\n1586#2,2:552\n*E\n*S KotlinDebug\n*F\n+ 1 MessageClient.kt\ncom/zykj/message/client/MessageClient$INSTANCES$mConnection$1\n*L\n56#1,2:552\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\u0008\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\t"
    }
    d2 = {
        "com/zykj/message/client/MessageClient$INSTANCES$mConnection$1",
        "Landroid/content/ServiceConnection;",
        "onServiceConnected",
        "",
        "className",
        "Landroid/content/ComponentName;",
        "service",
        "Landroid/os/IBinder;",
        "onServiceDisconnected",
        "messageclient_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xf
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/zykj/message/client/MessageClient$INSTANCES;


# direct methods
.method constructor <init>(Lcom/zykj/message/client/MessageClient$INSTANCES;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 43
    iput-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES$mConnection$1;->this$0:Lcom/zykj/message/client/MessageClient$INSTANCES;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 2

    const-string v0, "className"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "service"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "\u8fde\u63a5\u5230\u4e2a\u4eba\u4e2d\u5fc3\u670d\u52a1"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "MessageClient"

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 47
    iget-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES$mConnection$1;->this$0:Lcom/zykj/message/client/MessageClient$INSTANCES;

    invoke-static {p1}, Lcom/zykj/message/client/MessageClient$INSTANCES;->access$getTimeOut$p(Lcom/zykj/message/client/MessageClient$INSTANCES;)Ljava/util/Timer;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/util/Timer;->cancel()V

    .line 48
    :cond_0
    iget-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES$mConnection$1;->this$0:Lcom/zykj/message/client/MessageClient$INSTANCES;

    const/4 v0, 0x0

    check-cast v0, Ljava/util/Timer;

    invoke-static {p1, v0}, Lcom/zykj/message/client/MessageClient$INSTANCES;->access$setTimeOut$p(Lcom/zykj/message/client/MessageClient$INSTANCES;Ljava/util/Timer;)V

    .line 50
    iget-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES$mConnection$1;->this$0:Lcom/zykj/message/client/MessageClient$INSTANCES;

    invoke-static {p2}, Lcom/zykj/message/server/MessageServer$Stub;->asInterface(Landroid/os/IBinder;)Lcom/zykj/message/server/MessageServer;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/zykj/message/client/MessageClient$INSTANCES;->setRemoteServer(Lcom/zykj/message/server/MessageServer;)V

    .line 52
    iget-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES$mConnection$1;->this$0:Lcom/zykj/message/client/MessageClient$INSTANCES;

    new-instance p2, Lcom/zykj/message/client/MessageClient$INSTANCES$mConnection$1$onServiceConnected$1;

    invoke-direct {p2, p0}, Lcom/zykj/message/client/MessageClient$INSTANCES$mConnection$1$onServiceConnected$1;-><init>(Lcom/zykj/message/client/MessageClient$INSTANCES$mConnection$1;)V

    check-cast p2, Lkotlin/jvm/functions/Function1;

    invoke-virtual {p1, p2}, Lcom/zykj/message/client/MessageClient$INSTANCES;->getServerInfo(Lkotlin/jvm/functions/Function1;)V

    .line 56
    iget-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES$mConnection$1;->this$0:Lcom/zykj/message/client/MessageClient$INSTANCES;

    invoke-static {p1}, Lcom/zykj/message/client/MessageClient$INSTANCES;->access$getListenerList$p(Lcom/zykj/message/client/MessageClient$INSTANCES;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    .line 552
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/zykj/message/listener/BaseMessageCallBack;

    .line 57
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES$mConnection$1;->this$0:Lcom/zykj/message/client/MessageClient$INSTANCES;

    invoke-virtual {v0, p2}, Lcom/zykj/message/client/MessageClient$INSTANCES;->registerListener(Lcom/zykj/message/listener/BaseMessageCallBack;)V

    goto :goto_0

    .line 60
    :cond_1
    iget-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES$mConnection$1;->this$0:Lcom/zykj/message/client/MessageClient$INSTANCES;

    invoke-static {p1}, Lcom/zykj/message/client/MessageClient$INSTANCES;->access$registerResumeListener(Lcom/zykj/message/client/MessageClient$INSTANCES;)V

    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 1

    const-string v0, "className"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "MessageClient"

    const-string v0, "\u4e2a\u4eba\u4e2d\u5fc3\u670d\u52a1\u5931\u53bb\u8fde\u63a5"

    .line 64
    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 66
    :try_start_0
    iget-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES$mConnection$1;->this$0:Lcom/zykj/message/client/MessageClient$INSTANCES;

    invoke-static {p1}, Lcom/zykj/message/client/MessageClient$INSTANCES;->access$getMContext$p(Lcom/zykj/message/client/MessageClient$INSTANCES;)Landroid/app/Application;

    move-result-object p1

    move-object v0, p0

    check-cast v0, Landroid/content/ServiceConnection;

    invoke-virtual {p1, v0}, Landroid/app/Application;->unbindService(Landroid/content/ServiceConnection;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 70
    :catch_0
    iget-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES$mConnection$1;->this$0:Lcom/zykj/message/client/MessageClient$INSTANCES;

    const/4 v0, 0x0

    check-cast v0, Lcom/zykj/message/server/MessageServer;

    invoke-virtual {p1, v0}, Lcom/zykj/message/client/MessageClient$INSTANCES;->setRemoteServer(Lcom/zykj/message/server/MessageServer;)V

    return-void
.end method
