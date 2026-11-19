.class public final synthetic Lp3/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic c:Lcom/friday/login/view/SMSVerificationDialog;

.field public final synthetic d:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/login/view/SMSVerificationDialog;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp3/h;->c:Lcom/friday/login/view/SMSVerificationDialog;

    iput-object p2, p0, Lp3/h;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lp3/h;->c:Lcom/friday/login/view/SMSVerificationDialog;

    iget-object v1, p0, Lp3/h;->d:Ljava/lang/String;

    invoke-static {v0, v1, p1}, Lcom/friday/login/view/SMSVerificationDialog;->s(Lcom/friday/login/view/SMSVerificationDialog;Ljava/lang/String;Landroid/view/View;)V

    return-void
.end method
