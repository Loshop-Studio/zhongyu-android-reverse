.class public final Lj4/e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lj4/e;-><init>(Landroidx/appcompat/app/AppCompatActivity;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lj4/e;


# direct methods
.method public constructor <init>(Lj4/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lj4/e$a;->a:Lj4/e;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic a(Lj4/e;Landroid/net/Uri;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lj4/e$a;->b(Lj4/e;Landroid/net/Uri;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lj4/e;Landroid/net/Uri;)Lkotlin/Unit;
    .locals 1

    .line 1
    const-string v0, "uri"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Lj4/e;->c(Lj4/e;)Lkotlin/jvm/functions/Function1;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 16
    .line 17
    return-object p0
.end method


# virtual methods
.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 1

    .line 1
    const-string p1, "null cannot be cast to non-null type com.zykj.huiwei.launcher.server.MyFloatingToolService.MyServiceBinder"

    .line 2
    .line 3
    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    check-cast p2, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService$c;

    .line 7
    .line 8
    iget-object p1, p0, Lj4/e$a;->a:Lj4/e;

    .line 9
    .line 10
    invoke-static {p1}, Lj4/e;->d(Lj4/e;)Lkotlin/jvm/functions/Function1;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p2}, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService$c;->a()Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, Lj4/e$a;->a:Lj4/e;

    .line 22
    .line 23
    invoke-static {p1}, Lj4/e;->f(Lj4/e;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p2}, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService$c;->a()Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iget-object p2, p0, Lj4/e$a;->a:Lj4/e;

    .line 31
    .line 32
    new-instance v0, Lj4/d;

    .line 33
    .line 34
    invoke-direct {v0, p2}, Lj4/d;-><init>(Lj4/e;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1, v0}, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->J(Lkotlin/jvm/functions/Function1;)V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lj4/e$a;->a:Lj4/e;

    .line 2
    .line 3
    invoke-static {p1}, Lj4/e;->e(Lj4/e;)Lkotlin/jvm/functions/Function0;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, Lj4/e$a;->a:Lj4/e;

    .line 11
    .line 12
    invoke-static {p1}, Lj4/e;->f(Lj4/e;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    return-void
.end method
