.class public final synthetic Lv3/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# instance fields
.field public final synthetic c:Landroidx/navigation/NavHostController;

.field public final synthetic d:Lcom/friday/main/view/DBActivity;


# direct methods
.method public synthetic constructor <init>(Landroidx/navigation/NavHostController;Lcom/friday/main/view/DBActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv3/r;->c:Landroidx/navigation/NavHostController;

    iput-object p2, p0, Lv3/r;->d:Lcom/friday/main/view/DBActivity;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lv3/r;->c:Landroidx/navigation/NavHostController;

    iget-object v1, p0, Lv3/r;->d:Lcom/friday/main/view/DBActivity;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, p1, p2}, Lcom/friday/main/view/DBActivity;->e0(Landroidx/navigation/NavHostController;Lcom/friday/main/view/DBActivity;Landroidx/compose/runtime/Composer;I)Lqc/q;

    move-result-object p1

    return-object p1
.end method
