.class public final synthetic Lp3/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:Lcom/friday/login/view/LoginActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/login/view/LoginActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp3/d;->c:Lcom/friday/login/view/LoginActivity;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lp3/d;->c:Lcom/friday/login/view/LoginActivity;

    check-cast p1, Lcom/friday/common/entity/SendSmsBean;

    invoke-static {v0, p1}, Lcom/friday/login/view/LoginActivity;->Q(Lcom/friday/login/view/LoginActivity;Lcom/friday/common/entity/SendSmsBean;)Lqc/q;

    move-result-object p1

    return-object p1
.end method
