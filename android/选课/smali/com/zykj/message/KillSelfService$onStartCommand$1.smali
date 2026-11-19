.class final Lcom/zykj/message/KillSelfService$onStartCommand$1;
.super Ljava/lang/Object;
.source "KillSelfService.kt"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/message/KillSelfService;->onStartCommand(Landroid/content/Intent;II)I
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nKillSelfService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KillSelfService.kt\ncom/zykj/message/KillSelfService$onStartCommand$1\n*L\n1#1,40:1\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "",
        "run"
    }
    k = 0x3
    mv = {
        0x1,
        0x1,
        0xf
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/zykj/message/KillSelfService;


# direct methods
.method constructor <init>(Lcom/zykj/message/KillSelfService;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/message/KillSelfService$onStartCommand$1;->this$0:Lcom/zykj/message/KillSelfService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 25
    iget-object v0, p0, Lcom/zykj/message/KillSelfService$onStartCommand$1;->this$0:Lcom/zykj/message/KillSelfService;

    invoke-virtual {v0}, Lcom/zykj/message/KillSelfService;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    iget-object v1, p0, Lcom/zykj/message/KillSelfService$onStartCommand$1;->this$0:Lcom/zykj/message/KillSelfService;

    invoke-virtual {v1}, Lcom/zykj/message/KillSelfService;->getApplication()Landroid/app/Application;

    move-result-object v1

    const-string v2, "application"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/app/Application;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    if-eqz v0, :cond_0

    const/high16 v1, 0x10000000

    .line 26
    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    const/high16 v1, 0x4000000

    .line 27
    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 28
    iget-object v1, p0, Lcom/zykj/message/KillSelfService$onStartCommand$1;->this$0:Lcom/zykj/message/KillSelfService;

    invoke-virtual {v1, v0}, Lcom/zykj/message/KillSelfService;->startActivity(Landroid/content/Intent;)V

    .line 29
    iget-object v0, p0, Lcom/zykj/message/KillSelfService$onStartCommand$1;->this$0:Lcom/zykj/message/KillSelfService;

    invoke-virtual {v0}, Lcom/zykj/message/KillSelfService;->stopSelf()V

    :cond_0
    return-void
.end method
