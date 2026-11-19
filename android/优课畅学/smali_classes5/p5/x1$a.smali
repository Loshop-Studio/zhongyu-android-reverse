.class public final Lp5/x1$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/blackboard/listener/WithdrawListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lp5/x1;->a(Lcom/zykj/blackboard/core/edit/IPageControl;Lx7/p;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lx7/p;


# direct methods
.method public constructor <init>(Lx7/p;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lp5/x1$a;->a:Lx7/p;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onWithdraw(ZZ)V
    .locals 1

    .line 1
    iget-object v0, p0, Lp5/x1$a;->a:Lx7/p;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-interface {v0, p1, p2}, Lx7/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    return-void
.end method
