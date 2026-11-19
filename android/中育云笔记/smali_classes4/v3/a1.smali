.class public final synthetic Lv3/a1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# instance fields
.field public final synthetic c:Lcom/friday/main/view/HomeActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/main/view/HomeActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv3/a1;->c:Lcom/friday/main/view/HomeActivity;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lv3/a1;->c:Lcom/friday/main/view/HomeActivity;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/friday/main/view/HomeActivity;->S(Lcom/friday/main/view/HomeActivity;IZ)Lqc/q;

    move-result-object p1

    return-object p1
.end method
