.class public final synthetic Lv3/f0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/a;


# instance fields
.field public final synthetic c:Landroidx/navigation/NavHostController;

.field public final synthetic d:Lcom/friday/main/view/DBActivity$a;


# direct methods
.method public synthetic constructor <init>(Landroidx/navigation/NavHostController;Lcom/friday/main/view/DBActivity$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv3/f0;->c:Landroidx/navigation/NavHostController;

    iput-object p2, p0, Lv3/f0;->d:Lcom/friday/main/view/DBActivity$a;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lv3/f0;->c:Landroidx/navigation/NavHostController;

    iget-object v1, p0, Lv3/f0;->d:Lcom/friday/main/view/DBActivity$a;

    invoke-static {v0, v1}, Lcom/friday/main/view/DBActivity;->f0(Landroidx/navigation/NavHostController;Lcom/friday/main/view/DBActivity$a;)Lqc/q;

    move-result-object v0

    return-object v0
.end method
