.class final Lcom/zykj/mistake/activity/MainActivity$connection$1$onServiceConnected$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/mistake/activity/MainActivity$connection$1$onServiceConnected$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lr6/e;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lkotlinx/coroutines/v;",
        "Ld6/s;",
        "<anonymous>",
        "(Lkotlinx/coroutines/v;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.zykj.mistake.activity.MainActivity$connection$1$onServiceConnected$1$1"
    f = "MainActivity.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field label:I

.field final synthetic this$0:Lcom/zykj/mistake/activity/MainActivity;


# direct methods
.method public constructor <init>(Lcom/zykj/mistake/activity/MainActivity;Lh6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/mistake/activity/MainActivity;",
            "Lh6/c<",
            "-",
            "Lcom/zykj/mistake/activity/MainActivity$connection$1$onServiceConnected$1$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/mistake/activity/MainActivity$connection$1$onServiceConnected$1$1;->this$0:Lcom/zykj/mistake/activity/MainActivity;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILh6/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lh6/c;)Lh6/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lh6/c<",
            "*>;)",
            "Lh6/c<",
            "Ld6/s;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance p1, Lcom/zykj/mistake/activity/MainActivity$connection$1$onServiceConnected$1$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/mistake/activity/MainActivity$connection$1$onServiceConnected$1$1;->this$0:Lcom/zykj/mistake/activity/MainActivity;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lcom/zykj/mistake/activity/MainActivity$connection$1$onServiceConnected$1$1;-><init>(Lcom/zykj/mistake/activity/MainActivity;Lh6/c;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/v;

    check-cast p2, Lh6/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/activity/MainActivity$connection$1$onServiceConnected$1$1;->invoke(Lkotlinx/coroutines/v;Lh6/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/v;Lh6/c;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/v;",
            "Lh6/c<",
            "-",
            "Ld6/s;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/activity/MainActivity$connection$1$onServiceConnected$1$1;->create(Ljava/lang/Object;Lh6/c;)Lh6/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/mistake/activity/MainActivity$connection$1$onServiceConnected$1$1;

    sget-object p2, Ld6/s;->a:Ld6/s;

    invoke-virtual {p1, p2}, Lcom/zykj/mistake/activity/MainActivity$connection$1$onServiceConnected$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 2
    .line 3
    iget v0, p0, Lcom/zykj/mistake/activity/MainActivity$connection$1$onServiceConnected$1$1;->label:I

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    new-instance p1, Lcom/zykj/mistake/dialog/ConvertDialog;

    .line 11
    .line 12
    invoke-direct {p1}, Lcom/zykj/mistake/dialog/ConvertDialog;-><init>()V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lcom/zykj/mistake/activity/MainActivity$connection$1$onServiceConnected$1$1;->this$0:Lcom/zykj/mistake/activity/MainActivity;

    .line 16
    .line 17
    sget v1, Lcom/zykj/mistake/R$string;->tips_upgrade_new_version:I

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    new-instance v2, Ll4/c;

    .line 24
    .line 25
    iget-object v3, p0, Lcom/zykj/mistake/activity/MainActivity$connection$1$onServiceConnected$1$1;->this$0:Lcom/zykj/mistake/activity/MainActivity;

    .line 26
    .line 27
    sget v4, Lcom/zykj/mistake/R$string;->to_update:I

    .line 28
    .line 29
    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    iget-object v4, p0, Lcom/zykj/mistake/activity/MainActivity$connection$1$onServiceConnected$1$1;->this$0:Lcom/zykj/mistake/activity/MainActivity;

    .line 34
    .line 35
    new-instance v5, Lcom/zykj/mistake/activity/f;

    .line 36
    .line 37
    const/4 v6, 0x0

    .line 38
    invoke-direct {v5, v4, v6}, Lcom/zykj/mistake/activity/f;-><init>(Lcom/zykj/mistake/activity/MainActivity;I)V

    .line 39
    .line 40
    .line 41
    invoke-direct {v2, v3, v5}, Ll4/c;-><init>(Ljava/lang/String;Lcom/zykj/mistake/activity/f;)V

    .line 42
    .line 43
    .line 44
    iput-object v1, p1, Lcom/zykj/mistake/dialog/ConvertDialog;->c:Ljava/lang/String;

    .line 45
    .line 46
    iput-object v2, p1, Lcom/zykj/mistake/dialog/ConvertDialog;->d:Ll4/c;

    .line 47
    .line 48
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    const-string v1, "getSupportFragmentManager(...)"

    .line 53
    .line 54
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    const-string v1, "ConvertDialog"

    .line 58
    .line 59
    invoke-virtual {p1, v0, v1}, Lcom/zykj/mistake/dialog/BaseDialogFragment;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 63
    .line 64
    return-object p1

    .line 65
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 66
    .line 67
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 68
    .line 69
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    throw p1
.end method
