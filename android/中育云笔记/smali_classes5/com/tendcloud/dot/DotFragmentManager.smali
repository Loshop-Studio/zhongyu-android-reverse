.class public Lcom/tendcloud/dot/DotFragmentManager;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tendcloud/dot/DotFragmentManager$DotFragmentMangerCallback;
    }
.end annotation


# static fields
.field private static a:Lcom/tendcloud/dot/DotFragmentManager$DotFragmentMangerCallback;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static onViewCreated(Ljava/lang/Object;Landroid/view/View;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    :try_start_0
    sget-object v0, Lcom/tendcloud/dot/DotFragmentManager;->a:Lcom/tendcloud/dot/DotFragmentManager$DotFragmentMangerCallback;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p0, p1, p2}, Lcom/tendcloud/dot/DotFragmentManager$DotFragmentMangerCallback;->onViewCreated(Ljava/lang/Object;Landroid/view/View;Landroid/os/Bundle;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void

    .line 9
    :catchall_0
    move-exception p0

    .line 10
    invoke-static {p0}, Lcom/tendcloud/tenddata/ca;->eForInternal(Ljava/lang/Throwable;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public static onVisibilityChangedToUser(Ljava/lang/Object;ZZ)V
    .locals 1

    .line 1
    :try_start_0
    sget-object v0, Lcom/tendcloud/dot/DotFragmentManager;->a:Lcom/tendcloud/dot/DotFragmentManager$DotFragmentMangerCallback;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p0, p1, p2}, Lcom/tendcloud/dot/DotFragmentManager$DotFragmentMangerCallback;->onFragmentVisibilityChanged(Ljava/lang/Object;ZZ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void

    .line 9
    :catchall_0
    move-exception p0

    .line 10
    invoke-static {p0}, Lcom/tendcloud/tenddata/ca;->eForInternal(Ljava/lang/Throwable;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public static setCallback(Lcom/tendcloud/dot/DotFragmentManager$DotFragmentMangerCallback;)V
    .locals 0

    .line 1
    sput-object p0, Lcom/tendcloud/dot/DotFragmentManager;->a:Lcom/tendcloud/dot/DotFragmentManager$DotFragmentMangerCallback;

    .line 2
    .line 3
    return-void
.end method
