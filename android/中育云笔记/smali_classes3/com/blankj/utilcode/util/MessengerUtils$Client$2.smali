.class Lcom/blankj/utilcode/util/MessengerUtils$Client$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/blankj/utilcode/util/MessengerUtils$Client;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/blankj/utilcode/util/MessengerUtils$Client;


# direct methods
.method public constructor <init>(Lcom/blankj/utilcode/util/MessengerUtils$Client;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/blankj/utilcode/util/MessengerUtils$Client$2;->this$0:Lcom/blankj/utilcode/util/MessengerUtils$Client;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 1

    .line 1
    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lcom/blankj/utilcode/util/MessengerUtils$Client$2;->this$0:Lcom/blankj/utilcode/util/MessengerUtils$Client;

    .line 5
    .line 6
    new-instance v0, Landroid/os/Messenger;

    .line 7
    .line 8
    invoke-direct {v0, p2}, Landroid/os/Messenger;-><init>(Landroid/os/IBinder;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p1, Lcom/blankj/utilcode/util/MessengerUtils$Client;->mServer:Landroid/os/Messenger;

    .line 12
    .line 13
    invoke-static {}, Lcom/blankj/utilcode/util/UtilsBridge;->getCurrentProcessName()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    iget-object p2, p0, Lcom/blankj/utilcode/util/MessengerUtils$Client$2;->this$0:Lcom/blankj/utilcode/util/MessengerUtils$Client;

    .line 22
    .line 23
    iget-object p2, p2, Lcom/blankj/utilcode/util/MessengerUtils$Client;->mReceiveServeMsgHandler:Landroid/os/Handler;

    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    invoke-static {p2, v0, p1, v0}, Landroid/os/Message;->obtain(Landroid/os/Handler;III)Landroid/os/Message;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    const-class v0, Lcom/blankj/utilcode/util/MessengerUtils;

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {p2, v0}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 41
    .line 42
    .line 43
    iget-object p2, p0, Lcom/blankj/utilcode/util/MessengerUtils$Client$2;->this$0:Lcom/blankj/utilcode/util/MessengerUtils$Client;

    .line 44
    .line 45
    iget-object v0, p2, Lcom/blankj/utilcode/util/MessengerUtils$Client;->mClient:Landroid/os/Messenger;

    .line 46
    .line 47
    iput-object v0, p1, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    .line 48
    .line 49
    :try_start_0
    iget-object p2, p2, Lcom/blankj/utilcode/util/MessengerUtils$Client;->mServer:Landroid/os/Messenger;

    .line 50
    .line 51
    invoke-virtual {p2, p1}, Landroid/os/Messenger;->send(Landroid/os/Message;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :catch_0
    move-exception p1

    .line 56
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 57
    .line 58
    .line 59
    :goto_0
    iget-object p1, p0, Lcom/blankj/utilcode/util/MessengerUtils$Client$2;->this$0:Lcom/blankj/utilcode/util/MessengerUtils$Client;

    .line 60
    .line 61
    invoke-static {p1}, Lcom/blankj/utilcode/util/MessengerUtils$Client;->access$100(Lcom/blankj/utilcode/util/MessengerUtils$Client;)V

    .line 62
    .line 63
    .line 64
    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "client service disconnected:"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const-string v1, "MessengerUtils"

    .line 19
    .line 20
    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lcom/blankj/utilcode/util/MessengerUtils$Client$2;->this$0:Lcom/blankj/utilcode/util/MessengerUtils$Client;

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    iput-object v2, v0, Lcom/blankj/utilcode/util/MessengerUtils$Client;->mServer:Landroid/os/Messenger;

    .line 27
    .line 28
    invoke-virtual {v0}, Lcom/blankj/utilcode/util/MessengerUtils$Client;->bind()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_0

    .line 33
    .line 34
    new-instance v0, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 37
    .line 38
    .line 39
    const-string v2, "client service rebind failed: "

    .line 40
    .line 41
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-static {v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 52
    .line 53
    .line 54
    :cond_0
    return-void
.end method
