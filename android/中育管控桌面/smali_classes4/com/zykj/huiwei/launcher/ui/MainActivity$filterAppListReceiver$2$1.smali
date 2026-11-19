.class public final Lcom/zykj/huiwei/launcher/ui/MainActivity$filterAppListReceiver$2$1;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/huiwei/launcher/ui/MainActivity;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/zykj/huiwei/launcher/ui/MainActivity;


# direct methods
.method public constructor <init>(Lcom/zykj/huiwei/launcher/ui/MainActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/ui/MainActivity$filterAppListReceiver$2$1;->a:Lcom/zykj/huiwei/launcher/ui/MainActivity;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 6

    .line 1
    iget-object p1, p0, Lcom/zykj/huiwei/launcher/ui/MainActivity$filterAppListReceiver$2$1;->a:Lcom/zykj/huiwei/launcher/ui/MainActivity;

    .line 2
    .line 3
    invoke-static {p1}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v3, Lcom/zykj/huiwei/launcher/ui/MainActivity$filterAppListReceiver$2$1$onReceive$1;

    .line 8
    .line 9
    iget-object p1, p0, Lcom/zykj/huiwei/launcher/ui/MainActivity$filterAppListReceiver$2$1;->a:Lcom/zykj/huiwei/launcher/ui/MainActivity;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-direct {v3, p2, p1, v1}, Lcom/zykj/huiwei/launcher/ui/MainActivity$filterAppListReceiver$2$1$onReceive$1;-><init>(Landroid/content/Intent;Lcom/zykj/huiwei/launcher/ui/MainActivity;Lkotlin/coroutines/Continuation;)V

    .line 13
    .line 14
    .line 15
    const/4 v4, 0x3

    .line 16
    const/4 v5, 0x0

    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 19
    .line 20
    .line 21
    return-void
.end method
