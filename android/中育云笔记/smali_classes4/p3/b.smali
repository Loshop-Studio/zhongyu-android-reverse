.class public final synthetic Lp3/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/Observer;


# instance fields
.field public final synthetic c:Lcom/friday/login/view/LoginActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/login/view/LoginActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp3/b;->c:Lcom/friday/login/view/LoginActivity;

    return-void
.end method


# virtual methods
.method public final onChanged(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lp3/b;->c:Lcom/friday/login/view/LoginActivity;

    check-cast p1, Ljava/lang/Boolean;

    invoke-static {v0, p1}, Lcom/friday/login/view/LoginActivity;->R(Lcom/friday/login/view/LoginActivity;Ljava/lang/Boolean;)V

    return-void
.end method
