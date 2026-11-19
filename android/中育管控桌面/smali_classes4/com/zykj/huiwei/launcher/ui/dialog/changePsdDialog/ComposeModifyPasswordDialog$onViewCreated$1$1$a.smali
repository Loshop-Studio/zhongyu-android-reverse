.class public final Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ComposeModifyPasswordDialog$onViewCreated$1$1$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/coroutines/flow/FlowCollector;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ComposeModifyPasswordDialog$onViewCreated$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ComposeModifyPasswordDialog;


# direct methods
.method public constructor <init>(Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ComposeModifyPasswordDialog;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ComposeModifyPasswordDialog$onViewCreated$1$1$a;->a:Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ComposeModifyPasswordDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2

    .line 1
    instance-of p2, p1, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/c$b;

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    const p1, 0x7f110092

    .line 6
    .line 7
    .line 8
    invoke-static {p1}, Lcom/xuexiang/xui/utils/j;->c(I)V

    .line 9
    .line 10
    .line 11
    sget-object p1, Li4/g;->a:Li4/g$a;

    .line 12
    .line 13
    iget-object p2, p0, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ComposeModifyPasswordDialog$onViewCreated$1$1$a;->a:Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ComposeModifyPasswordDialog;

    .line 14
    .line 15
    invoke-virtual {p2}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    const-string v0, "requireActivity(...)"

    .line 20
    .line 21
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, p2}, Li4/g$a;->d(Landroid/app/Activity;)V

    .line 25
    .line 26
    .line 27
    iget-object p2, p0, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ComposeModifyPasswordDialog$onViewCreated$1$1$a;->a:Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ComposeModifyPasswordDialog;

    .line 28
    .line 29
    invoke-virtual {p2}, Landroidx/fragment/app/DialogFragment;->dismiss()V

    .line 30
    .line 31
    .line 32
    const/4 p2, 0x1

    .line 33
    const/4 v0, 0x0

    .line 34
    const/4 v1, 0x0

    .line 35
    invoke-static {p1, v1, p2, v0}, Li4/g$a;->i(Li4/g$a;ZILjava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    instance-of p2, p1, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/c$a;

    .line 40
    .line 41
    if-eqz p2, :cond_1

    .line 42
    .line 43
    check-cast p1, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/c$a;

    .line 44
    .line 45
    invoke-virtual {p1}, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/c$a;->a()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-static {p1}, Lcom/xuexiang/xui/utils/j;->a(Ljava/lang/CharSequence;)V

    .line 50
    .line 51
    .line 52
    :goto_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 53
    .line 54
    return-object p1

    .line 55
    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 56
    .line 57
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 58
    .line 59
    .line 60
    throw p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/c;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ComposeModifyPasswordDialog$onViewCreated$1$1$a;->a(Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
