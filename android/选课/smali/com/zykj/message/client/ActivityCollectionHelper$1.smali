.class Lcom/zykj/message/client/ActivityCollectionHelper$1;
.super Ljava/lang/Object;
.source "ActivityCollectionHelper.java"

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/message/client/ActivityCollectionHelper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/zykj/message/client/ActivityCollectionHelper;


# direct methods
.method constructor <init>(Lcom/zykj/message/client/ActivityCollectionHelper;)V
    .locals 0

    .line 48
    iput-object p1, p0, Lcom/zykj/message/client/ActivityCollectionHelper$1;->this$0:Lcom/zykj/message/client/ActivityCollectionHelper;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    .line 52
    iget-object p2, p0, Lcom/zykj/message/client/ActivityCollectionHelper$1;->this$0:Lcom/zykj/message/client/ActivityCollectionHelper;

    invoke-static {p2}, Lcom/zykj/message/client/ActivityCollectionHelper;->access$000(Lcom/zykj/message/client/ActivityCollectionHelper;)Ljava/util/List;

    move-result-object p2

    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public onActivityDestroyed(Landroid/app/Activity;)V
    .locals 1

    .line 82
    iget-object v0, p0, Lcom/zykj/message/client/ActivityCollectionHelper$1;->this$0:Lcom/zykj/message/client/ActivityCollectionHelper;

    invoke-static {v0}, Lcom/zykj/message/client/ActivityCollectionHelper;->access$000(Lcom/zykj/message/client/ActivityCollectionHelper;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public onActivityPaused(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method public onActivityResumed(Landroid/app/Activity;)V
    .locals 0

    .line 61
    iget-object p1, p0, Lcom/zykj/message/client/ActivityCollectionHelper$1;->this$0:Lcom/zykj/message/client/ActivityCollectionHelper;

    invoke-static {p1}, Lcom/zykj/message/client/ActivityCollectionHelper;->access$100(Lcom/zykj/message/client/ActivityCollectionHelper;)Lcom/zykj/message/client/ActivityCollectionHelper$ActivityResumeListener;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 62
    iget-object p1, p0, Lcom/zykj/message/client/ActivityCollectionHelper$1;->this$0:Lcom/zykj/message/client/ActivityCollectionHelper;

    invoke-static {p1}, Lcom/zykj/message/client/ActivityCollectionHelper;->access$100(Lcom/zykj/message/client/ActivityCollectionHelper;)Lcom/zykj/message/client/ActivityCollectionHelper$ActivityResumeListener;

    move-result-object p1

    invoke-interface {p1}, Lcom/zykj/message/client/ActivityCollectionHelper$ActivityResumeListener;->onResume()V

    :cond_0
    return-void
.end method

.method public onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public onActivityStarted(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method public onActivityStopped(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method
