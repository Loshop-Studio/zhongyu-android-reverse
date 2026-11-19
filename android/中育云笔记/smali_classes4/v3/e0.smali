.class public final synthetic Lv3/e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/q;


# instance fields
.field public final synthetic c:Landroidx/navigation/NavHostController;

.field public final synthetic d:Lcom/friday/main/view/DBActivity;


# direct methods
.method public synthetic constructor <init>(Landroidx/navigation/NavHostController;Lcom/friday/main/view/DBActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv3/e0;->c:Landroidx/navigation/NavHostController;

    iput-object p2, p0, Lv3/e0;->d:Lcom/friday/main/view/DBActivity;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lv3/e0;->c:Landroidx/navigation/NavHostController;

    iget-object v1, p0, Lv3/e0;->d:Lcom/friday/main/view/DBActivity;

    check-cast p1, Landroidx/compose/foundation/layout/RowScope;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-static {v0, v1, p1, p2, p3}, Lcom/friday/main/view/DBActivity;->m0(Landroidx/navigation/NavHostController;Lcom/friday/main/view/DBActivity;Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/runtime/Composer;I)Lqc/q;

    move-result-object p1

    return-object p1
.end method
