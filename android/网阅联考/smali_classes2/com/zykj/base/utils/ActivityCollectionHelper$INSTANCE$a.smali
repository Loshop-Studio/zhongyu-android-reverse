.class public final Lcom/zykj/base/utils/ActivityCollectionHelper$INSTANCE$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/base/utils/ActivityCollectionHelper$INSTANCE;-><init>(Ljava/lang/String;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/zykj/base/utils/ActivityCollectionHelper$INSTANCE;


# direct methods
.method public constructor <init>(Lcom/zykj/base/utils/ActivityCollectionHelper$INSTANCE;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/base/utils/ActivityCollectionHelper$INSTANCE$a;->a:Lcom/zykj/base/utils/ActivityCollectionHelper$INSTANCE;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    iget-object p2, p0, Lcom/zykj/base/utils/ActivityCollectionHelper$INSTANCE$a;->a:Lcom/zykj/base/utils/ActivityCollectionHelper$INSTANCE;

    .line 5
    .line 6
    invoke-static {p2}, Lcom/zykj/base/utils/ActivityCollectionHelper$INSTANCE;->a(Lcom/zykj/base/utils/ActivityCollectionHelper$INSTANCE;)Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    :goto_0
    return-void
.end method

.method public onActivityDestroyed(Landroid/app/Activity;)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/zykj/base/utils/ActivityCollectionHelper$INSTANCE$a;->a:Lcom/zykj/base/utils/ActivityCollectionHelper$INSTANCE;

    .line 5
    .line 6
    invoke-static {v0}, Lcom/zykj/base/utils/ActivityCollectionHelper$INSTANCE;->a(Lcom/zykj/base/utils/ActivityCollectionHelper$INSTANCE;)Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    :goto_0
    return-void
.end method

.method public onActivityPaused(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method public onActivityResumed(Landroid/app/Activity;)V
    .locals 0

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
