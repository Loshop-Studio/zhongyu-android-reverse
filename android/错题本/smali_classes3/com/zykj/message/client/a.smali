.class public final Lcom/zykj/message/client/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# instance fields
.field public final synthetic a:Lcom/zykj/message/client/b;


# direct methods
.method public constructor <init>(Lcom/zykj/message/client/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/zykj/message/client/a;->a:Lcom/zykj/message/client/b;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    iget-object p2, p0, Lcom/zykj/message/client/a;->a:Lcom/zykj/message/client/b;

    .line 2
    .line 3
    iget-object p2, p2, Lcom/zykj/message/client/b;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 4
    .line 5
    invoke-virtual {p2, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final onActivityDestroyed(Landroid/app/Activity;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/message/client/a;->a:Lcom/zykj/message/client/b;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/zykj/message/client/b;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final onActivityPaused(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method public final onActivityResumed(Landroid/app/Activity;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/zykj/message/client/a;->a:Lcom/zykj/message/client/b;

    .line 2
    .line 3
    iget-object p1, p1, Lcom/zykj/message/client/b;->c:Lcom/zykj/message/client/f0;

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iget-object v0, p1, Lcom/zykj/message/client/f0;->a:Lcom/zykj/message/client/MessageClient$INSTANCES;

    .line 8
    .line 9
    new-instance v1, Lcom/zykj/message/client/MessageClient$INSTANCES$registerResumeListener$1$1;

    .line 10
    .line 11
    invoke-direct {v1, p1}, Lcom/zykj/message/client/MessageClient$INSTANCES$registerResumeListener$1$1;-><init>(Lcom/zykj/message/client/f0;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lcom/zykj/message/client/MessageClient$INSTANCES;->getServerInfo(Lr6/c;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public final onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public final onActivityStarted(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method public final onActivityStopped(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method
