.class public final Lcom/zykj/huiwei/launcher/app/App;
.super Lcom/zykj/huiwei/launcher/app/Hilt_App;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/huiwei/launcher/app/App$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u0000 \u00072\u00020\u0001:\u0001\u0008B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0006\u0010\u0003\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/zykj/huiwei/launcher/app/App;",
        "Lcom/zykj/base/BaseApplication;",
        "<init>",
        "()V",
        "",
        "onCreate",
        "onTerminate",
        "Companion",
        "a",
        "app_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I

.field public static final Companion:Lcom/zykj/huiwei/launcher/app/App$a;

.field public static app:Lcom/zykj/huiwei/launcher/app/App;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/huiwei/launcher/app/App$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/huiwei/launcher/app/App$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/zykj/huiwei/launcher/app/App;->Companion:Lcom/zykj/huiwei/launcher/app/App$a;

    const/16 v0, 0x8

    sput v0, Lcom/zykj/huiwei/launcher/app/App;->$stable:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/huiwei/launcher/app/Hilt_App;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic a(Lcom/zykj/huiwei/launcher/app/App;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/huiwei/launcher/app/App;->onCreate$lambda$0(Lcom/zykj/huiwei/launcher/app/App;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private static final onCreate$lambda$0(Lcom/zykj/huiwei/launcher/app/App;Ljava/lang/String;)Lkotlin/Unit;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance p1, Landroid/content/Intent;

    .line 7
    .line 8
    const-class v0, Lcom/zykj/huiwei/launcher/ui/activity/CrashActivity;

    .line 9
    .line 10
    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 11
    .line 12
    .line 13
    const v0, 0x8000

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 17
    .line 18
    .line 19
    const/high16 v0, 0x10000000

    .line 20
    .line 21
    invoke-virtual {p1, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 25
    .line 26
    .line 27
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 28
    .line 29
    return-object p0
.end method


# virtual methods
.method public onCreate()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/zykj/huiwei/launcher/app/Hilt_App;->onCreate()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/zykj/huiwei/launcher/app/App;->Companion:Lcom/zykj/huiwei/launcher/app/App$a;

    .line 5
    .line 6
    invoke-virtual {v0, p0}, Lcom/zykj/huiwei/launcher/app/App$a;->b(Lcom/zykj/huiwei/launcher/app/App;)V

    .line 7
    .line 8
    .line 9
    invoke-static {}, Lx2/b$b;->k()Lx2/b$b;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const/16 v1, 0xff

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Lx2/b$b;->l(I)Lx2/b$b;

    .line 16
    .line 17
    .line 18
    invoke-static {}, Lcom/blankj/utilcode/util/s;->p()Lcom/blankj/utilcode/util/s$d;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const-string v1, "HWLauncherLog"

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Lcom/blankj/utilcode/util/s$d;->x(Ljava/lang/String;)Lcom/blankj/utilcode/util/s$d;

    .line 25
    .line 26
    .line 27
    sget-object v0, Li4/g;->a:Li4/g$a;

    .line 28
    .line 29
    invoke-virtual {v0}, Li4/g$a;->g()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    sget-object v0, Li4/e;->a:Li4/e;

    .line 36
    .line 37
    new-instance v1, Lr3/a;

    .line 38
    .line 39
    invoke-direct {v1, p0}, Lr3/a;-><init>(Lcom/zykj/huiwei/launcher/app/App;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v1}, Li4/e;->e(Lkotlin/jvm/functions/Function1;)V

    .line 43
    .line 44
    .line 45
    :cond_0
    return-void
.end method

.method public onTerminate()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/app/Application;->onTerminate()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/zykj/message/server/MessageManage;->a:Lcom/zykj/message/server/MessageManage;

    .line 5
    .line 6
    invoke-virtual {v0, p0}, Lcom/zykj/message/server/MessageManage;->b(Landroid/content/Context;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method
