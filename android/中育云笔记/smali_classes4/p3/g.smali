.class public final synthetic Lp3/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic c:Lcom/friday/login/view/SMSVerificationDialog;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Ljava/lang/String;

.field public final synthetic f:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/login/view/SMSVerificationDialog;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp3/g;->c:Lcom/friday/login/view/SMSVerificationDialog;

    iput-object p2, p0, Lp3/g;->d:Ljava/lang/String;

    iput-object p3, p0, Lp3/g;->e:Ljava/lang/String;

    iput-object p4, p0, Lp3/g;->f:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lp3/g;->c:Lcom/friday/login/view/SMSVerificationDialog;

    iget-object v1, p0, Lp3/g;->d:Ljava/lang/String;

    iget-object v2, p0, Lp3/g;->e:Ljava/lang/String;

    iget-object v3, p0, Lp3/g;->f:Ljava/lang/String;

    invoke-static {v0, v1, v2, v3, p1}, Lcom/friday/login/view/SMSVerificationDialog;->r(Lcom/friday/login/view/SMSVerificationDialog;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View;)V

    return-void
.end method
