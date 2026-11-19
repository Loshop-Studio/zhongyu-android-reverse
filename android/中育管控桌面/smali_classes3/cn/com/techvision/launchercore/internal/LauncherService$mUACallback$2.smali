.class final Lcn/com/techvision/launchercore/internal/LauncherService$mUACallback$2;
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
        "Lcn/com/techvision/launchercore/internal/LauncherService$mUACallback$2$a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0007\n\u0002\u0008\u0003*\u0001\u0000\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "cn/com/techvision/launchercore/internal/LauncherService$mUACallback$2$a",
        "a",
        "()Lcn/com/techvision/launchercore/internal/LauncherService$mUACallback$2$a;"
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

    iput-object p1, p0, Lcn/com/techvision/launchercore/internal/LauncherService$mUACallback$2;->a:Lcn/com/techvision/launchercore/internal/LauncherService;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Lcn/com/techvision/launchercore/internal/LauncherService$mUACallback$2$a;
    .locals 3

    .line 1
    new-instance v0, Landroid/os/Handler;

    .line 2
    .line 3
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 8
    .line 9
    .line 10
    new-instance v1, Lcn/com/techvision/launchercore/internal/LauncherService$mUACallback$2$a;

    .line 11
    .line 12
    iget-object v2, p0, Lcn/com/techvision/launchercore/internal/LauncherService$mUACallback$2;->a:Lcn/com/techvision/launchercore/internal/LauncherService;

    .line 13
    .line 14
    invoke-direct {v1, v2, v0}, Lcn/com/techvision/launchercore/internal/LauncherService$mUACallback$2$a;-><init>(Lcn/com/techvision/launchercore/internal/LauncherService;Landroid/os/Handler;)V

    .line 15
    .line 16
    .line 17
    return-object v1
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcn/com/techvision/launchercore/internal/LauncherService$mUACallback$2;->a()Lcn/com/techvision/launchercore/internal/LauncherService$mUACallback$2$a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
