.class public final synthetic Lh4/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:Lcom/friday/user/view/UserFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/user/view/UserFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh4/s;->c:Lcom/friday/user/view/UserFragment;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lh4/s;->c:Lcom/friday/user/view/UserFragment;

    check-cast p1, Ljava/lang/Boolean;

    invoke-static {v0, p1}, Lcom/friday/user/view/UserFragment;->r(Lcom/friday/user/view/UserFragment;Ljava/lang/Boolean;)Lqc/q;

    move-result-object p1

    return-object p1
.end method
