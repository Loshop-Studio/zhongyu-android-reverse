.class public final Lcn/com/techvision/launchercore/internal/LauncherService$mUACallback$2$a;
.super Landroid/database/ContentObserver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/com/techvision/launchercore/internal/LauncherService$mUACallback$2;->a()Lcn/com/techvision/launchercore/internal/LauncherService$mUACallback$2$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcn/com/techvision/launchercore/internal/LauncherService;


# direct methods
.method public constructor <init>(Lcn/com/techvision/launchercore/internal/LauncherService;Landroid/os/Handler;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcn/com/techvision/launchercore/internal/LauncherService$mUACallback$2$a;->a:Lcn/com/techvision/launchercore/internal/LauncherService;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Landroid/database/ContentObserver;-><init>(Landroid/os/Handler;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onChange(Z)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/database/ContentObserver;->onChange(Z)V

    .line 2
    .line 3
    .line 4
    sget-object p1, Lcn/com/techvision/launchercore/internal/LauncherService;->e:Lcn/com/techvision/launchercore/internal/LauncherService$a;

    .line 5
    .line 6
    const-string v0, "onMDMUsableAppsChanged"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lcn/com/techvision/launchercore/internal/LauncherService$a;->a(Lcn/com/techvision/launchercore/internal/LauncherService$a;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcn/com/techvision/launchercore/internal/LauncherService$mUACallback$2$a;->a:Lcn/com/techvision/launchercore/internal/LauncherService;

    .line 12
    .line 13
    invoke-static {p1}, Lcn/com/techvision/launchercore/internal/LauncherService;->f(Lcn/com/techvision/launchercore/internal/LauncherService;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
