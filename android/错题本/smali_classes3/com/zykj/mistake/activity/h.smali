.class public final Lcom/zykj/mistake/activity/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/coroutines/flow/g;


# instance fields
.field public final synthetic a:Lcom/zykj/mistake/activity/MainActivity;


# direct methods
.method public constructor <init>(Lcom/zykj/mistake/activity/MainActivity;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/mistake/activity/h;->a:Lcom/zykj/mistake/activity/MainActivity;

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lh6/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    check-cast p1, Ld6/s;

    .line 2
    .line 3
    iget-object p1, p0, Lcom/zykj/mistake/activity/h;->a:Lcom/zykj/mistake/activity/MainActivity;

    .line 4
    .line 5
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    const-string v0, "getApplicationContext(...)"

    .line 10
    .line 11
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    sget v0, Lcom/zykj/mistake/R$string;->login_not_authenticated:I

    .line 15
    .line 16
    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const-string v1, "getString(...)"

    .line 21
    .line 22
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    sget-object v1, Lcom/zykj/mistake/utils/d;->e:Landroid/widget/Toast;

    .line 26
    .line 27
    if-nez v1, :cond_0

    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    invoke-static {p2, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    const/16 v0, 0x51

    .line 35
    .line 36
    const/16 v2, 0xdc

    .line 37
    .line 38
    invoke-virtual {p2, v0, v1, v2}, Landroid/widget/Toast;->setGravity(III)V

    .line 39
    .line 40
    .line 41
    sput-object p2, Lcom/zykj/mistake/utils/d;->e:Landroid/widget/Toast;

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    invoke-virtual {v1, v0}, Landroid/widget/Toast;->setText(Ljava/lang/CharSequence;)V

    .line 45
    .line 46
    .line 47
    :goto_0
    sget-object p2, Lcom/zykj/mistake/utils/d;->e:Landroid/widget/Toast;

    .line 48
    .line 49
    invoke-static {p2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p2}, Landroid/widget/Toast;->show()V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    const-string v0, "com.zykj.manage"

    .line 60
    .line 61
    invoke-virtual {p2, v0}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    if-eqz p2, :cond_1

    .line 66
    .line 67
    invoke-virtual {p1, p2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1}, Landroid/app/Activity;->finishAffinity()V

    .line 71
    .line 72
    .line 73
    :cond_1
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 74
    .line 75
    return-object p1
.end method
