.class public final Lcom/zykj/message/KillSelfService$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/message/KillSelfService;->onStartCommand(Landroid/content/Intent;II)I
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic c:Lcom/zykj/message/KillSelfService;


# direct methods
.method public constructor <init>(Lcom/zykj/message/KillSelfService;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/message/KillSelfService$a;->c:Lcom/zykj/message/KillSelfService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/message/KillSelfService$a;->c:Lcom/zykj/message/KillSelfService;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lcom/zykj/message/KillSelfService$a;->c:Lcom/zykj/message/KillSelfService;

    .line 8
    .line 9
    invoke-virtual {v1}, Landroid/app/Service;->getApplication()Landroid/app/Application;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const-string v2, "application"

    .line 14
    .line 15
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    const/high16 v1, 0x10000000

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 31
    .line 32
    .line 33
    const/high16 v1, 0x4000000

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, Lcom/zykj/message/KillSelfService$a;->c:Lcom/zykj/message/KillSelfService;

    .line 39
    .line 40
    invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 41
    .line 42
    .line 43
    iget-object v0, p0, Lcom/zykj/message/KillSelfService$a;->c:Lcom/zykj/message/KillSelfService;

    .line 44
    .line 45
    invoke-virtual {v0}, Landroid/app/Service;->stopSelf()V

    .line 46
    .line 47
    .line 48
    :cond_0
    return-void
.end method
