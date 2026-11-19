.class public final synthetic Lv3/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/r;


# instance fields
.field public final synthetic c:Lcom/friday/main/view/DBActivity;

.field public final synthetic d:Lcom/friday/main/viewmodel/DbViewModel;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/main/view/DBActivity;Lcom/friday/main/viewmodel/DbViewModel;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv3/j0;->c:Lcom/friday/main/view/DBActivity;

    iput-object p2, p0, Lv3/j0;->d:Lcom/friday/main/viewmodel/DbViewModel;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, Lv3/j0;->c:Lcom/friday/main/view/DBActivity;

    iget-object v1, p0, Lv3/j0;->d:Lcom/friday/main/viewmodel/DbViewModel;

    move-object v2, p1

    check-cast v2, Landroidx/compose/animation/AnimatedContentScope;

    move-object v3, p2

    check-cast v3, Landroidx/navigation/NavBackStackEntry;

    move-object v4, p3

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Integer;

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-static/range {v0 .. v5}, Lcom/friday/main/view/DBActivity;->l0(Lcom/friday/main/view/DBActivity;Lcom/friday/main/viewmodel/DbViewModel;Landroidx/compose/animation/AnimatedContentScope;Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)Lqc/q;

    move-result-object p1

    return-object p1
.end method
