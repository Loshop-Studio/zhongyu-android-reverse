.class public final synthetic Lp3/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# instance fields
.field public final synthetic c:Lcom/friday/login/view/LoginActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/login/view/LoginActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp3/a;->c:Lcom/friday/login/view/LoginActivity;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lp3/a;->c:Lcom/friday/login/view/LoginActivity;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/friday/login/view/LoginActivity;->P(Lcom/friday/login/view/LoginActivity;ZI)Lqc/q;

    move-result-object p1

    return-object p1
.end method
