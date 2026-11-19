.class public final synthetic Li/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcn/com/techvision/launchercore/internal/LauncherService;


# direct methods
.method public synthetic constructor <init>(Lcn/com/techvision/launchercore/internal/LauncherService;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li/a;->a:Lcn/com/techvision/launchercore/internal/LauncherService;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget-object v0, p0, Li/a;->a:Lcn/com/techvision/launchercore/internal/LauncherService;

    invoke-static {v0}, Lcn/com/techvision/launchercore/internal/LauncherService;->c(Lcn/com/techvision/launchercore/internal/LauncherService;)V

    return-void
.end method
