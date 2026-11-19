.class public final synthetic Ls5/k1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function4;


# instance fields
.field public final synthetic a:Landroidx/navigation/NavHostController;

.field public final synthetic b:Lcom/zykj/evaluation/ui/MainFragment;


# direct methods
.method public synthetic constructor <init>(Landroidx/navigation/NavHostController;Lcom/zykj/evaluation/ui/MainFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls5/k1;->a:Landroidx/navigation/NavHostController;

    iput-object p2, p0, Ls5/k1;->b:Lcom/zykj/evaluation/ui/MainFragment;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, Ls5/k1;->a:Landroidx/navigation/NavHostController;

    iget-object v1, p0, Ls5/k1;->b:Lcom/zykj/evaluation/ui/MainFragment;

    move-object v2, p1

    check-cast v2, Landroidx/compose/animation/AnimatedContentScope;

    move-object v3, p2

    check-cast v3, Landroidx/navigation/NavBackStackEntry;

    move-object v4, p3

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Integer;

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-static/range {v0 .. v5}, Lcom/zykj/evaluation/ui/MainFragment;->A(Landroidx/navigation/NavHostController;Lcom/zykj/evaluation/ui/MainFragment;Landroidx/compose/animation/AnimatedContentScope;Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
