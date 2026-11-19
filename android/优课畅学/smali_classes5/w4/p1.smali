.class public final synthetic Lw4/p1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# instance fields
.field public final synthetic a:Lcom/zykj/study/ui/home/exercise/MicroEditFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/study/ui/home/exercise/MicroEditFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw4/p1;->a:Lcom/zykj/study/ui/home/exercise/MicroEditFragment;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lw4/p1;->a:Lcom/zykj/study/ui/home/exercise/MicroEditFragment;

    check-cast p1, Ljava/lang/String;

    check-cast p2, Landroid/os/Bundle;

    invoke-static {v0, p1, p2}, Lcom/zykj/study/ui/home/exercise/MicroEditFragment;->j(Lcom/zykj/study/ui/home/exercise/MicroEditFragment;Ljava/lang/String;Landroid/os/Bundle;)Lh7/p;

    move-result-object p1

    return-object p1
.end method
