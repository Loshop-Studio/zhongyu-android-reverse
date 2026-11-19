.class public final synthetic Li/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic a:Lcn/com/techvision/launchercore/internal/LauncherService;


# direct methods
.method public synthetic constructor <init>(Lcn/com/techvision/launchercore/internal/LauncherService;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li/b;->a:Lcn/com/techvision/launchercore/internal/LauncherService;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Li/b;->a:Lcn/com/techvision/launchercore/internal/LauncherService;

    check-cast p1, Lcn/com/techvision/launchercore/internal/LauncherFlow$b;

    invoke-static {v0, p1}, Lcn/com/techvision/launchercore/internal/LauncherService;->b(Lcn/com/techvision/launchercore/internal/LauncherService;Lcn/com/techvision/launchercore/internal/LauncherFlow$b;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
