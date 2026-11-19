.class public final Lcom/zykj/gallery/ui/share/ShareActivity$onCreate$2$1$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/coroutines/flow/FlowCollector;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/gallery/ui/share/ShareActivity$onCreate$2$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/zykj/gallery/ui/share/ShareActivity;


# direct methods
.method public constructor <init>(Lcom/zykj/gallery/ui/share/ShareActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/gallery/ui/share/ShareActivity$onCreate$2$1$a;->a:Lcom/zykj/gallery/ui/share/ShareActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/zykj/gallery/ui/share/page/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2

    .line 1
    instance-of p2, p1, Lcom/zykj/gallery/ui/share/page/b$a;

    .line 2
    .line 3
    const/4 v0, -0x1

    .line 4
    const/4 v1, 0x1

    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    new-instance p1, Landroid/content/Intent;

    .line 8
    .line 9
    invoke-direct {p1}, Landroid/content/Intent;-><init>()V

    .line 10
    .line 11
    .line 12
    iget-object p2, p0, Lcom/zykj/gallery/ui/share/ShareActivity$onCreate$2$1$a;->a:Lcom/zykj/gallery/ui/share/ShareActivity;

    .line 13
    .line 14
    invoke-static {p2}, Lcom/zykj/gallery/ui/share/ShareActivity;->t(Lcom/zykj/gallery/ui/share/ShareActivity;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    invoke-virtual {p1, p2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 19
    .line 20
    .line 21
    iget-object p2, p0, Lcom/zykj/gallery/ui/share/ShareActivity$onCreate$2$1$a;->a:Lcom/zykj/gallery/ui/share/ShareActivity;

    .line 22
    .line 23
    invoke-virtual {p2, v0, p1}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    .line 24
    .line 25
    .line 26
    iget-object p1, p0, Lcom/zykj/gallery/ui/share/ShareActivity$onCreate$2$1$a;->a:Lcom/zykj/gallery/ui/share/ShareActivity;

    .line 27
    .line 28
    const/4 p2, 0x0

    .line 29
    invoke-virtual {p1, p2, p2}, Landroid/app/Activity;->overridePendingTransition(II)V

    .line 30
    .line 31
    .line 32
    iget-object p1, p0, Lcom/zykj/gallery/ui/share/ShareActivity$onCreate$2$1$a;->a:Lcom/zykj/gallery/ui/share/ShareActivity;

    .line 33
    .line 34
    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    instance-of p2, p1, Lcom/zykj/gallery/ui/share/page/b$b;

    .line 39
    .line 40
    if-eqz p2, :cond_1

    .line 41
    .line 42
    new-instance p2, Landroid/content/Intent;

    .line 43
    .line 44
    invoke-direct {p2}, Landroid/content/Intent;-><init>()V

    .line 45
    .line 46
    .line 47
    check-cast p1, Lcom/zykj/gallery/ui/share/page/b$b;

    .line 48
    .line 49
    invoke-virtual {p1}, Lcom/zykj/gallery/ui/share/page/b$b;->a()Landroid/net/Uri;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-virtual {p2, p1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 54
    .line 55
    .line 56
    invoke-virtual {p2, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 57
    .line 58
    .line 59
    iget-object p1, p0, Lcom/zykj/gallery/ui/share/ShareActivity$onCreate$2$1$a;->a:Lcom/zykj/gallery/ui/share/ShareActivity;

    .line 60
    .line 61
    invoke-virtual {p1, v0, p2}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    .line 62
    .line 63
    .line 64
    iget-object p1, p0, Lcom/zykj/gallery/ui/share/ShareActivity$onCreate$2$1$a;->a:Lcom/zykj/gallery/ui/share/ShareActivity;

    .line 65
    .line 66
    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    .line 67
    .line 68
    .line 69
    :goto_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 70
    .line 71
    return-object p1

    .line 72
    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 73
    .line 74
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 75
    .line 76
    .line 77
    throw p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/zykj/gallery/ui/share/page/b;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/zykj/gallery/ui/share/ShareActivity$onCreate$2$1$a;->a(Lcom/zykj/gallery/ui/share/page/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
