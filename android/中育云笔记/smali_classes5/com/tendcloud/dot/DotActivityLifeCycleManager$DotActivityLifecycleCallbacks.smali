.class public interface abstract Lcom/tendcloud/dot/DotActivityLifeCycleManager$DotActivityLifecycleCallbacks;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tendcloud/dot/DotActivityLifeCycleManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "DotActivityLifecycleCallbacks"
.end annotation


# virtual methods
.method public abstract onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
.end method

.method public abstract onActivityDestroyed(Landroid/app/Activity;)V
.end method

.method public abstract onActivityPaused(Landroid/app/Activity;)V
.end method

.method public abstract onActivityResumed(Landroid/app/Activity;)V
.end method

.method public abstract onActivityStarted(Landroid/app/Activity;)V
.end method

.method public abstract onActivityStopped(Landroid/app/Activity;)V
.end method
