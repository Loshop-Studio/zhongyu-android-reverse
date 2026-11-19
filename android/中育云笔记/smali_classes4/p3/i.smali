.class public final synthetic Lp3/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:Lcom/friday/login/view/SMSVerificationDialog;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/login/view/SMSVerificationDialog;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp3/i;->c:Lcom/friday/login/view/SMSVerificationDialog;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lp3/i;->c:Lcom/friday/login/view/SMSVerificationDialog;

    check-cast p1, Ljava/lang/Boolean;

    invoke-static {v0, p1}, Lcom/friday/login/view/SMSVerificationDialog;->u(Lcom/friday/login/view/SMSVerificationDialog;Ljava/lang/Boolean;)Lqc/q;

    move-result-object p1

    return-object p1
.end method
