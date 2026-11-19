.class public final Lcom/friday/common/widget/dialog/BaseDialog$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/friday/common/widget/dialog/BaseDialog;
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
    invoke-direct {p0}, Lcom/friday/common/widget/dialog/BaseDialog$a;-><init>()V

    return-void
.end method

.method public static synthetic b(Lcom/friday/common/widget/dialog/BaseDialog$a;ZFLhd/l;ILjava/lang/Object;)Lcom/friday/common/widget/dialog/BaseDialog;
    .locals 0

    .line 1
    and-int/lit8 p4, p4, 0x2

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    const/high16 p2, 0x3f000000    # 0.5f

    .line 6
    .line 7
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/friday/common/widget/dialog/BaseDialog$a;->a(ZFLhd/l;)Lcom/friday/common/widget/dialog/BaseDialog;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method


# virtual methods
.method public final a(ZFLhd/l;)Lcom/friday/common/widget/dialog/BaseDialog;
    .locals 3

    .line 1
    const-string v0, "callDialog"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/friday/common/widget/dialog/BaseDialog;

    .line 7
    .line 8
    invoke-direct {v0}, Lcom/friday/common/widget/dialog/BaseDialog;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Landroidx/fragment/app/DialogFragment;->getDialog()Landroid/app/Dialog;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    const/4 v2, 0x1

    .line 18
    invoke-virtual {v1, v2}, Landroid/app/Dialog;->requestWindowFeature(I)Z

    .line 19
    .line 20
    .line 21
    :cond_0
    invoke-virtual {v0, p1}, Landroidx/fragment/app/DialogFragment;->setCancelable(Z)V

    .line 22
    .line 23
    .line 24
    new-instance p1, Landroid/os/Bundle;

    .line 25
    .line 26
    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 27
    .line 28
    .line 29
    const-string v1, "dimAmount"

    .line 30
    .line 31
    invoke-virtual {p1, v1, p2}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, p1}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, p3}, Lcom/friday/common/widget/dialog/BaseDialog;->o(Lhd/l;)V

    .line 38
    .line 39
    .line 40
    return-object v0
.end method
