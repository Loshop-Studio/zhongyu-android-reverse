.class public final synthetic Lv3/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/q;


# instance fields
.field public final synthetic c:Landroidx/navigation/NavHostController;

.field public final synthetic d:Lcom/friday/main/view/DBActivity;

.field public final synthetic e:Lcom/friday/main/viewmodel/DbViewModel;


# direct methods
.method public synthetic constructor <init>(Landroidx/navigation/NavHostController;Lcom/friday/main/view/DBActivity;Lcom/friday/main/viewmodel/DbViewModel;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv3/c0;->c:Landroidx/navigation/NavHostController;

    iput-object p2, p0, Lv3/c0;->d:Lcom/friday/main/view/DBActivity;

    iput-object p3, p0, Lv3/c0;->e:Lcom/friday/main/viewmodel/DbViewModel;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, Lv3/c0;->c:Landroidx/navigation/NavHostController;

    iget-object v1, p0, Lv3/c0;->d:Lcom/friday/main/view/DBActivity;

    iget-object v2, p0, Lv3/c0;->e:Lcom/friday/main/viewmodel/DbViewModel;

    move-object v3, p1

    check-cast v3, Landroidx/compose/foundation/layout/PaddingValues;

    move-object v4, p2

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-static/range {v0 .. v5}, Lcom/friday/main/view/DBActivity;->h0(Landroidx/navigation/NavHostController;Lcom/friday/main/view/DBActivity;Lcom/friday/main/viewmodel/DbViewModel;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)Lqc/q;

    move-result-object p1

    return-object p1
.end method
