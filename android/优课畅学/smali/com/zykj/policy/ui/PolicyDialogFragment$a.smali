.class public final Lcom/zykj/policy/ui/PolicyDialogFragment$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/policy/ui/PolicyDialogFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/n;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/policy/ui/PolicyDialogFragment$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lj4/a;)Lcom/zykj/policy/ui/PolicyDialogFragment;
    .locals 3

    .line 1
    const-string v0, "policyBean"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroid/os/Bundle;

    .line 7
    .line 8
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 9
    .line 10
    .line 11
    const-string v1, "SPAN_COLOR"

    .line 12
    .line 13
    invoke-virtual {p1}, Lj4/a;->h()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 18
    .line 19
    .line 20
    const-string v1, "TITLE"

    .line 21
    .line 22
    invoke-virtual {p1}, Lj4/a;->i()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const-string v1, "CONTENT"

    .line 30
    .line 31
    invoke-virtual {p1}, Lj4/a;->c()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    const-string v1, "CANCEL"

    .line 39
    .line 40
    invoke-virtual {p1}, Lj4/a;->a()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    const-string v1, "CONFIRM"

    .line 48
    .line 49
    invoke-virtual {p1}, Lj4/a;->b()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    const-string v1, "USER_AGREEMENT_URL"

    .line 57
    .line 58
    invoke-virtual {p1}, Lj4/a;->k()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    const-string v1, "PRIVATE_POLICY_URL"

    .line 66
    .line 67
    invoke-virtual {p1}, Lj4/a;->g()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    new-instance v1, Lcom/zykj/policy/ui/PolicyDialogFragment;

    .line 75
    .line 76
    invoke-direct {v1}, Lcom/zykj/policy/ui/PolicyDialogFragment;-><init>()V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p1}, Lj4/a;->d()Lx7/a;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    invoke-virtual {v1, v2}, Lcom/zykj/policy/ui/PolicyDialogFragment;->i(Lx7/a;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p1}, Lj4/a;->e()Lx7/a;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    invoke-virtual {v1, p1}, Lcom/zykj/policy/ui/PolicyDialogFragment;->j(Lx7/a;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v1, v0}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 94
    .line 95
    .line 96
    return-object v1
.end method
