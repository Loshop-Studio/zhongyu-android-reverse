.class final Lcn/com/techvision/launchercore/internal/LauncherService$mLAService$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/com/techvision/launchercore/internal/LauncherService;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Landroid/content/pm/LauncherApps;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "Landroid/content/pm/LauncherApps;",
        "a",
        "()Landroid/content/pm/LauncherApps;"
    }
    k = 0x3
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic a:Lcn/com/techvision/launchercore/internal/LauncherService;


# direct methods
.method public constructor <init>(Lcn/com/techvision/launchercore/internal/LauncherService;)V
    .locals 0

    iput-object p1, p0, Lcn/com/techvision/launchercore/internal/LauncherService$mLAService$2;->a:Lcn/com/techvision/launchercore/internal/LauncherService;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Landroid/content/pm/LauncherApps;
    .locals 2

    .line 1
    iget-object v0, p0, Lcn/com/techvision/launchercore/internal/LauncherService$mLAService$2;->a:Lcn/com/techvision/launchercore/internal/LauncherService;

    .line 2
    .line 3
    const-string v1, "launcherapps"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    check-cast v0, Landroid/content/pm/LauncherApps;

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    new-instance v0, Ljava/lang/NullPointerException;

    .line 15
    .line 16
    const-string v1, "null cannot be cast to non-null type android.content.pm.LauncherApps"

    .line 17
    .line 18
    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcn/com/techvision/launchercore/internal/LauncherService$mLAService$2;->a()Landroid/content/pm/LauncherApps;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
