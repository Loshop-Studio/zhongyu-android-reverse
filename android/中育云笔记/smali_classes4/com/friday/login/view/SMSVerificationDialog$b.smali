.class public final Lcom/friday/login/view/SMSVerificationDialog$b;
.super Landroid/os/CountDownTimer;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/login/view/SMSVerificationDialog;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/friday/login/view/SMSVerificationDialog;


# direct methods
.method public constructor <init>(Lcom/friday/login/view/SMSVerificationDialog;)V
    .locals 4

    .line 1
    iput-object p1, p0, Lcom/friday/login/view/SMSVerificationDialog$b;->a:Lcom/friday/login/view/SMSVerificationDialog;

    .line 2
    .line 3
    const-wide/32 v0, 0xea60

    .line 4
    .line 5
    .line 6
    const-wide/16 v2, 0x3e8

    .line 7
    .line 8
    invoke-direct {p0, v0, v1, v2, v3}, Landroid/os/CountDownTimer;-><init>(JJ)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public onFinish()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/friday/login/view/SMSVerificationDialog$b;->a:Lcom/friday/login/view/SMSVerificationDialog;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/friday/login/view/SMSVerificationDialog;->w(Lcom/friday/login/view/SMSVerificationDialog;)Lcom/friday/login/databinding/DialogSmsVerificationBinding;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v0, v0, Lcom/friday/login/databinding/DialogSmsVerificationBinding;->f:Landroid/widget/TextView;

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lcom/friday/login/view/SMSVerificationDialog$b;->a:Lcom/friday/login/view/SMSVerificationDialog;

    .line 14
    .line 15
    invoke-static {v0}, Lcom/friday/login/view/SMSVerificationDialog;->w(Lcom/friday/login/view/SMSVerificationDialog;)Lcom/friday/login/databinding/DialogSmsVerificationBinding;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget-object v0, v0, Lcom/friday/login/databinding/DialogSmsVerificationBinding;->f:Landroid/widget/TextView;

    .line 20
    .line 21
    const-string v1, "\u83b7\u53d6\u9a8c\u8bc1\u7801"

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lcom/friday/login/view/SMSVerificationDialog$b;->a:Lcom/friday/login/view/SMSVerificationDialog;

    .line 27
    .line 28
    invoke-static {v0}, Lcom/friday/login/view/SMSVerificationDialog;->w(Lcom/friday/login/view/SMSVerificationDialog;)Lcom/friday/login/databinding/DialogSmsVerificationBinding;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iget-object v0, v0, Lcom/friday/login/databinding/DialogSmsVerificationBinding;->f:Landroid/widget/TextView;

    .line 33
    .line 34
    const/4 v1, -0x1

    .line 35
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public onTick(J)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/friday/login/view/SMSVerificationDialog$b;->a:Lcom/friday/login/view/SMSVerificationDialog;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/friday/login/view/SMSVerificationDialog;->w(Lcom/friday/login/view/SMSVerificationDialog;)Lcom/friday/login/databinding/DialogSmsVerificationBinding;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v0, v0, Lcom/friday/login/databinding/DialogSmsVerificationBinding;->f:Landroid/widget/TextView;

    .line 8
    .line 9
    const/16 v1, 0x3e8

    .line 10
    .line 11
    int-to-long v1, v1

    .line 12
    div-long/2addr p1, v1

    .line 13
    new-instance v1, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    const-string p1, "s\u540e\u91cd\u53d1"

    .line 22
    .line 23
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method
