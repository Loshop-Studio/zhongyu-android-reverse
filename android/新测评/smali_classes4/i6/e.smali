.class public final synthetic Li6/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic a:Li6/o0;

.field public final synthetic b:Lkotlin/jvm/functions/Function4;

.field public final synthetic c:Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;

.field public final synthetic d:Landroidx/navigation/NavController;

.field public final synthetic e:Landroidx/compose/runtime/State;


# direct methods
.method public synthetic constructor <init>(Li6/o0;Lkotlin/jvm/functions/Function4;Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;Landroidx/navigation/NavController;Landroidx/compose/runtime/State;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li6/e;->a:Li6/o0;

    iput-object p2, p0, Li6/e;->b:Lkotlin/jvm/functions/Function4;

    iput-object p3, p0, Li6/e;->c:Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;

    iput-object p4, p0, Li6/e;->d:Landroidx/navigation/NavController;

    iput-object p5, p0, Li6/e;->e:Landroidx/compose/runtime/State;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-object v0, p0, Li6/e;->a:Li6/o0;

    iget-object v1, p0, Li6/e;->b:Lkotlin/jvm/functions/Function4;

    iget-object v2, p0, Li6/e;->c:Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;

    iget-object v3, p0, Li6/e;->d:Landroidx/navigation/NavController;

    iget-object v4, p0, Li6/e;->e:Landroidx/compose/runtime/State;

    move-object v5, p1

    check-cast v5, Landroidx/compose/foundation/layout/RowScope;

    move-object v6, p2

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v0 .. v7}, Lcom/zykj/evaluation/ui/guide/noStem/NoStemPageKt;->c(Li6/o0;Lkotlin/jvm/functions/Function4;Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;Landroidx/navigation/NavController;Landroidx/compose/runtime/State;Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
