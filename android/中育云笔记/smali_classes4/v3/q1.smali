.class public final synthetic Lv3/q1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/Observer;


# instance fields
.field public final synthetic c:Lcom/friday/main/view/HomeActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/main/view/HomeActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv3/q1;->c:Lcom/friday/main/view/HomeActivity;

    return-void
.end method


# virtual methods
.method public final onChanged(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lv3/q1;->c:Lcom/friday/main/view/HomeActivity;

    check-cast p1, Ljava/lang/Integer;

    invoke-static {v0, p1}, Lcom/friday/main/view/HomeActivity;->V(Lcom/friday/main/view/HomeActivity;Ljava/lang/Integer;)V

    return-void
.end method
