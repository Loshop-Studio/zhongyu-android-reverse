.class public final synthetic Lp3/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:Lcom/friday/login/view/SMSVerificationDialog;

.field public final synthetic d:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/login/view/SMSVerificationDialog;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp3/j;->c:Lcom/friday/login/view/SMSVerificationDialog;

    iput-object p2, p0, Lp3/j;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lp3/j;->c:Lcom/friday/login/view/SMSVerificationDialog;

    iget-object v1, p0, Lp3/j;->d:Ljava/lang/String;

    check-cast p1, Ljava/lang/Boolean;

    invoke-static {v0, v1, p1}, Lcom/friday/login/view/SMSVerificationDialog;->v(Lcom/friday/login/view/SMSVerificationDialog;Ljava/lang/String;Ljava/lang/Boolean;)Lqc/q;

    move-result-object p1

    return-object p1
.end method
