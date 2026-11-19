.class public abstract Lcom/zykj/base/BaseApplication;
.super Landroid/app/Application;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0008\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0014J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0008H&J\u0008\u0010\t\u001a\u00020\u0004H\u0016J\u0008\u0010\n\u001a\u00020\u0004H\u0016\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/zykj/base/BaseApplication;",
        "Landroid/app/Application;",
        "()V",
        "attachBaseContext",
        "",
        "base",
        "Landroid/content/Context;",
        "initAppKey",
        "",
        "onCreate",
        "onTerminate",
        "base_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/app/Application;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public attachBaseContext(Landroid/content/Context;)V
    .locals 1

    .line 1
    const-string v0, "base"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Landroid/content/ContextWrapper;->attachBaseContext(Landroid/content/Context;)V

    .line 7
    .line 8
    .line 9
    invoke-static {p0}, Le3/b;->e(Landroid/app/Application;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public abstract initAppKey()Ljava/lang/String;
.end method

.method public onCreate()V
    .locals 3

    .line 1
    invoke-super {p0}, Landroid/app/Application;->onCreate()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/zykj/base/utils/ActivityCollectionHelper;->INSTANCE:Lcom/zykj/base/utils/ActivityCollectionHelper;

    .line 5
    .line 6
    invoke-virtual {v0, p0}, Lcom/zykj/base/utils/ActivityCollectionHelper;->register(Landroid/app/Application;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/zykj/base/BaseApplication;->initAppKey()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    const/4 v1, 0x0

    .line 17
    const/4 v2, 0x1

    .line 18
    invoke-static {p0, v0, v1, v2, v1}, Lk2/a;->d(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    .line 19
    .line 20
    .line 21
    sget-object v0, Lcom/umeng/analytics/MobclickAgent$PageMode;->a:Lcom/umeng/analytics/MobclickAgent$PageMode;

    .line 22
    .line 23
    invoke-static {v0}, Lcom/umeng/analytics/MobclickAgent;->b(Lcom/umeng/analytics/MobclickAgent$PageMode;)V

    .line 24
    .line 25
    .line 26
    invoke-static {v2}, Lk2/a;->j(Z)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public onTerminate()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/app/Application;->onTerminate()V

    .line 2
    .line 3
    .line 4
    invoke-static {p0}, Lcom/umeng/analytics/MobclickAgent;->a(Landroid/content/Context;)V

    .line 5
    .line 6
    .line 7
    sget-object v0, Lcom/zykj/base/utils/ActivityCollectionHelper;->INSTANCE:Lcom/zykj/base/utils/ActivityCollectionHelper;

    .line 8
    .line 9
    invoke-virtual {v0, p0}, Lcom/zykj/base/utils/ActivityCollectionHelper;->unRegister(Landroid/app/Application;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
