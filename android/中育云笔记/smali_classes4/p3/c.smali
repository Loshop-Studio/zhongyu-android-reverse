.class public final synthetic Lp3/c;
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

    iput-object p1, p0, Lp3/c;->c:Lcom/friday/login/view/LoginActivity;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lp3/c;->c:Lcom/friday/login/view/LoginActivity;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {v0, p1}, Lcom/friday/login/view/LoginActivity;->N(Lcom/friday/login/view/LoginActivity;Z)Lqc/q;

    move-result-object p1

    return-object p1
.end method
