.class final Lcom/zykj/message/server/MessageManage$INSTANCES;
.super Lcom/zykj/message/server/MessageManage;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/message/server/MessageManage;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "INSTANCES"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00009\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0008\u0005*\u0001\u0014\u0008\u00c6\u0001\u0018\u00002\u00020\u0001J/\u0010\t\u001a\u00020\u0008\"\u0008\u0008\u0000\u0010\u0003*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0006H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/zykj/message/server/MessageManage$INSTANCES;",
        "Lcom/zykj/message/server/MessageManage;",
        "Lm4/c;",
        "T",
        "Landroid/content/Context;",
        "context",
        "Ljava/lang/Class;",
        "messageService",
        "",
        "a",
        "(Landroid/content/Context;Ljava/lang/Class;)V",
        "Lcom/zykj/message/server/bean/ServerInfo;",
        "serverInfo",
        "c",
        "(Lcom/zykj/message/server/bean/ServerInfo;)V",
        "b",
        "(Landroid/content/Context;)V",
        "Lm4/b;",
        "Lm4/b;",
        "mService",
        "com/zykj/message/server/MessageManage$INSTANCES$a",
        "d",
        "Lcom/zykj/message/server/MessageManage$INSTANCES$a;",
        "mConnection",
        "messageserver_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# instance fields
.field public c:Lm4/b;

.field public final d:Lcom/zykj/message/server/MessageManage$INSTANCES$a;


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lcom/zykj/message/server/MessageManage;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 3
    .line 4
    .line 5
    new-instance p1, Lcom/zykj/message/server/MessageManage$INSTANCES$a;

    .line 6
    .line 7
    invoke-direct {p1, p0}, Lcom/zykj/message/server/MessageManage$INSTANCES$a;-><init>(Lcom/zykj/message/server/MessageManage$INSTANCES;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lcom/zykj/message/server/MessageManage$INSTANCES;->d:Lcom/zykj/message/server/MessageManage$INSTANCES$a;

    .line 11
    .line 12
    return-void
.end method

.method public static final synthetic d(Lcom/zykj/message/server/MessageManage$INSTANCES;)Lm4/b;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/message/server/MessageManage$INSTANCES;->c:Lm4/b;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic e(Lcom/zykj/message/server/MessageManage$INSTANCES;Lm4/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/message/server/MessageManage$INSTANCES;->c:Lm4/b;

    .line 2
    .line 3
    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Ljava/lang/Class;)V
    .locals 2

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "messageService"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 12
    .line 13
    const/16 v1, 0x1a

    .line 14
    .line 15
    if-lt v0, v1, :cond_0

    .line 16
    .line 17
    new-instance v0, Landroid/content/Intent;

    .line 18
    .line 19
    invoke-direct {v0, p1, p2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 20
    .line 21
    .line 22
    invoke-static {p1, v0}, Landroidx/media/session/a;->a(Landroid/content/Context;Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v0, Landroid/content/Intent;

    .line 27
    .line 28
    invoke-direct {v0, p1, p2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 32
    .line 33
    .line 34
    :goto_0
    new-instance p2, Landroid/content/Intent;

    .line 35
    .line 36
    const-string v0, "com.zykj.action.zykj.message.service"

    .line 37
    .line 38
    invoke-direct {p2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {p2, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 46
    .line 47
    .line 48
    iget-object v0, p0, Lcom/zykj/message/server/MessageManage$INSTANCES;->d:Lcom/zykj/message/server/MessageManage$INSTANCES$a;

    .line 49
    .line 50
    const/4 v1, 0x1

    .line 51
    invoke-virtual {p1, p2, v0, v1}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public b(Landroid/content/Context;)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/message/server/MessageManage$INSTANCES;->c:Lm4/b;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lcom/zykj/message/server/MessageManage$INSTANCES;->d:Lcom/zykj/message/server/MessageManage$INSTANCES$a;

    .line 11
    .line 12
    invoke-virtual {p1, v0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    .line 13
    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    iput-object p1, p0, Lcom/zykj/message/server/MessageManage$INSTANCES;->c:Lm4/b;

    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public c(Lcom/zykj/message/server/bean/ServerInfo;)V
    .locals 2

    .line 1
    const-string v0, "serverInfo"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/lang/Thread;

    .line 7
    .line 8
    new-instance v1, Lcom/zykj/message/server/MessageManage$INSTANCES$b;

    .line 9
    .line 10
    invoke-direct {v1, p0, p1}, Lcom/zykj/message/server/MessageManage$INSTANCES$b;-><init>(Lcom/zykj/message/server/MessageManage$INSTANCES;Lcom/zykj/message/server/bean/ServerInfo;)V

    .line 11
    .line 12
    .line 13
    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 17
    .line 18
    .line 19
    return-void
.end method
