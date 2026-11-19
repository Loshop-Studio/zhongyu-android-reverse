.class public final Lcn/com/techvision/launchercore/internal/LauncherService$mLACallback$2$a;
.super Landroid/content/pm/LauncherApps$Callback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/com/techvision/launchercore/internal/LauncherService$mLACallback$2;->a()Lcn/com/techvision/launchercore/internal/LauncherService$mLACallback$2$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcn/com/techvision/launchercore/internal/LauncherService;


# direct methods
.method public constructor <init>(Lcn/com/techvision/launchercore/internal/LauncherService;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcn/com/techvision/launchercore/internal/LauncherService$mLACallback$2$a;->a:Lcn/com/techvision/launchercore/internal/LauncherService;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/content/pm/LauncherApps$Callback;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onPackageAdded(Ljava/lang/String;Landroid/os/UserHandle;)V
    .locals 2

    .line 1
    const-string v0, "packageName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "user"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object p2, Lcn/com/techvision/launchercore/internal/LauncherService;->e:Lcn/com/techvision/launchercore/internal/LauncherService$a;

    .line 12
    .line 13
    new-instance v0, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 16
    .line 17
    .line 18
    const-string v1, "onPackageAdded"

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-static {p2, p1}, Lcn/com/techvision/launchercore/internal/LauncherService$a;->a(Lcn/com/techvision/launchercore/internal/LauncherService$a;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    iget-object p1, p0, Lcn/com/techvision/launchercore/internal/LauncherService$mLACallback$2$a;->a:Lcn/com/techvision/launchercore/internal/LauncherService;

    .line 34
    .line 35
    invoke-static {p1}, Lcn/com/techvision/launchercore/internal/LauncherService;->f(Lcn/com/techvision/launchercore/internal/LauncherService;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public onPackageChanged(Ljava/lang/String;Landroid/os/UserHandle;)V
    .locals 2

    .line 1
    const-string v0, "packageName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "user"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object p2, Lcn/com/techvision/launchercore/internal/LauncherService;->e:Lcn/com/techvision/launchercore/internal/LauncherService$a;

    .line 12
    .line 13
    new-instance v0, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 16
    .line 17
    .line 18
    const-string v1, "onPackageChanged"

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-static {p2, p1}, Lcn/com/techvision/launchercore/internal/LauncherService$a;->a(Lcn/com/techvision/launchercore/internal/LauncherService$a;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    iget-object p1, p0, Lcn/com/techvision/launchercore/internal/LauncherService$mLACallback$2$a;->a:Lcn/com/techvision/launchercore/internal/LauncherService;

    .line 34
    .line 35
    invoke-static {p1}, Lcn/com/techvision/launchercore/internal/LauncherService;->f(Lcn/com/techvision/launchercore/internal/LauncherService;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public onPackageRemoved(Ljava/lang/String;Landroid/os/UserHandle;)V
    .locals 2

    .line 1
    const-string v0, "packageName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "user"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object p2, Lcn/com/techvision/launchercore/internal/LauncherService;->e:Lcn/com/techvision/launchercore/internal/LauncherService$a;

    .line 12
    .line 13
    new-instance v0, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 16
    .line 17
    .line 18
    const-string v1, "onPackageRemoved"

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-static {p2, p1}, Lcn/com/techvision/launchercore/internal/LauncherService$a;->a(Lcn/com/techvision/launchercore/internal/LauncherService$a;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    iget-object p1, p0, Lcn/com/techvision/launchercore/internal/LauncherService$mLACallback$2$a;->a:Lcn/com/techvision/launchercore/internal/LauncherService;

    .line 34
    .line 35
    invoke-static {p1}, Lcn/com/techvision/launchercore/internal/LauncherService;->f(Lcn/com/techvision/launchercore/internal/LauncherService;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public onPackagesAvailable([Ljava/lang/String;Landroid/os/UserHandle;Z)V
    .locals 0

    .line 1
    const-string p3, "packageNames"

    .line 2
    .line 3
    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "user"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object p1, Lcn/com/techvision/launchercore/internal/LauncherService;->e:Lcn/com/techvision/launchercore/internal/LauncherService$a;

    .line 12
    .line 13
    new-instance p2, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 16
    .line 17
    .line 18
    const-string p3, "onPackagesAvailable"

    .line 19
    .line 20
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    iget-object p3, p0, Lcn/com/techvision/launchercore/internal/LauncherService$mLACallback$2$a;->a:Lcn/com/techvision/launchercore/internal/LauncherService;

    .line 24
    .line 25
    invoke-virtual {p3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p3

    .line 29
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    invoke-static {p1, p2}, Lcn/com/techvision/launchercore/internal/LauncherService$a;->a(Lcn/com/techvision/launchercore/internal/LauncherService$a;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    iget-object p1, p0, Lcn/com/techvision/launchercore/internal/LauncherService$mLACallback$2$a;->a:Lcn/com/techvision/launchercore/internal/LauncherService;

    .line 40
    .line 41
    invoke-static {p1}, Lcn/com/techvision/launchercore/internal/LauncherService;->f(Lcn/com/techvision/launchercore/internal/LauncherService;)V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public onPackagesUnavailable([Ljava/lang/String;Landroid/os/UserHandle;Z)V
    .locals 0

    .line 1
    const-string p3, "packageNames"

    .line 2
    .line 3
    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "user"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object p1, Lcn/com/techvision/launchercore/internal/LauncherService;->e:Lcn/com/techvision/launchercore/internal/LauncherService$a;

    .line 12
    .line 13
    new-instance p2, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 16
    .line 17
    .line 18
    const-string p3, "onPackagesUnavailable"

    .line 19
    .line 20
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    iget-object p3, p0, Lcn/com/techvision/launchercore/internal/LauncherService$mLACallback$2$a;->a:Lcn/com/techvision/launchercore/internal/LauncherService;

    .line 24
    .line 25
    invoke-virtual {p3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p3

    .line 29
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    invoke-static {p1, p2}, Lcn/com/techvision/launchercore/internal/LauncherService$a;->a(Lcn/com/techvision/launchercore/internal/LauncherService$a;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    iget-object p1, p0, Lcn/com/techvision/launchercore/internal/LauncherService$mLACallback$2$a;->a:Lcn/com/techvision/launchercore/internal/LauncherService;

    .line 40
    .line 41
    invoke-static {p1}, Lcn/com/techvision/launchercore/internal/LauncherService;->f(Lcn/com/techvision/launchercore/internal/LauncherService;)V

    .line 42
    .line 43
    .line 44
    return-void
.end method
