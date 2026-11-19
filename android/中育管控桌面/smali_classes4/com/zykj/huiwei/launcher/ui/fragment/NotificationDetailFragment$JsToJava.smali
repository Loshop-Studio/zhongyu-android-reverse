.class public final Lcom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment$JsToJava;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "JsToJava"
.end annotation


# instance fields
.field public final synthetic a:Lcom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment$JsToJava;->a:Lcom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final open_file(Ljava/lang/String;)V
    .locals 7
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    const-string v0, "args"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment$JsToJava;->a:Lcom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment;

    .line 14
    .line 15
    invoke-static {v0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    new-instance v4, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment$JsToJava$open_file$1;

    .line 20
    .line 21
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment$JsToJava;->a:Lcom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment;

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    invoke-direct {v4, v0, p1, v2}, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment$JsToJava$open_file$1;-><init>(Lcom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    .line 25
    .line 26
    .line 27
    const/4 v5, 0x3

    .line 28
    const/4 v6, 0x0

    .line 29
    const/4 v3, 0x0

    .line 30
    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 31
    .line 32
    .line 33
    return-void
.end method
