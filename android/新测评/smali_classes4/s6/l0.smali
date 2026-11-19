.class public final synthetic Ls6/l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic a:Landroidx/compose/material3/DrawerState;

.field public final synthetic b:Lcom/zykj/evaluation/ui/home/HomeViewModel;

.field public final synthetic c:Lkotlin/jvm/functions/Function3;

.field public final synthetic d:Lkotlinx/coroutines/CoroutineScope;

.field public final synthetic e:Landroidx/compose/runtime/State;

.field public final synthetic f:Landroidx/navigation/NavController;

.field public final synthetic g:Landroidx/compose/runtime/State;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/material3/DrawerState;Lcom/zykj/evaluation/ui/home/HomeViewModel;Lkotlin/jvm/functions/Function3;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/runtime/State;Landroidx/navigation/NavController;Landroidx/compose/runtime/State;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls6/l0;->a:Landroidx/compose/material3/DrawerState;

    iput-object p2, p0, Ls6/l0;->b:Lcom/zykj/evaluation/ui/home/HomeViewModel;

    iput-object p3, p0, Ls6/l0;->c:Lkotlin/jvm/functions/Function3;

    iput-object p4, p0, Ls6/l0;->d:Lkotlinx/coroutines/CoroutineScope;

    iput-object p5, p0, Ls6/l0;->e:Landroidx/compose/runtime/State;

    iput-object p6, p0, Ls6/l0;->f:Landroidx/navigation/NavController;

    iput-object p7, p0, Ls6/l0;->g:Landroidx/compose/runtime/State;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-object v0, p0, Ls6/l0;->a:Landroidx/compose/material3/DrawerState;

    iget-object v1, p0, Ls6/l0;->b:Lcom/zykj/evaluation/ui/home/HomeViewModel;

    iget-object v2, p0, Ls6/l0;->c:Lkotlin/jvm/functions/Function3;

    iget-object v3, p0, Ls6/l0;->d:Lkotlinx/coroutines/CoroutineScope;

    iget-object v4, p0, Ls6/l0;->e:Landroidx/compose/runtime/State;

    iget-object v5, p0, Ls6/l0;->f:Landroidx/navigation/NavController;

    iget-object v6, p0, Ls6/l0;->g:Landroidx/compose/runtime/State;

    move-object v7, p1

    check-cast v7, Landroidx/compose/foundation/layout/BoxScope;

    move-object v8, p2

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v9

    invoke-static/range {v0 .. v9}, Lcom/zykj/evaluation/ui/home/HomePageKt;->b(Landroidx/compose/material3/DrawerState;Lcom/zykj/evaluation/ui/home/HomeViewModel;Lkotlin/jvm/functions/Function3;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/runtime/State;Landroidx/navigation/NavController;Landroidx/compose/runtime/State;Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
