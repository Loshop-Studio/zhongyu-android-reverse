.class public final synthetic Lw5/q0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic a:Lcom/zykj/evaluation/ui/detail/b;

.field public final synthetic b:Lkotlin/jvm/functions/Function0;

.field public final synthetic c:Landroidx/navigation/NavController;

.field public final synthetic d:Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;

.field public final synthetic e:Lf6/j;

.field public final synthetic f:Landroidx/compose/foundation/ScrollState;

.field public final synthetic g:Lw5/e;

.field public final synthetic h:Lkotlin/jvm/functions/Function4;

.field public final synthetic i:Lkotlin/jvm/functions/Function2;

.field public final synthetic j:Lkotlin/jvm/functions/Function1;

.field public final synthetic k:Lkotlin/jvm/functions/Function2;

.field public final synthetic l:Lkotlin/jvm/functions/Function2;

.field public final synthetic m:Lkotlin/jvm/functions/Function1;

.field public final synthetic n:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/evaluation/ui/detail/b;Lkotlin/jvm/functions/Function0;Landroidx/navigation/NavController;Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;Lf6/j;Landroidx/compose/foundation/ScrollState;Lw5/e;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw5/q0;->a:Lcom/zykj/evaluation/ui/detail/b;

    iput-object p2, p0, Lw5/q0;->b:Lkotlin/jvm/functions/Function0;

    iput-object p3, p0, Lw5/q0;->c:Landroidx/navigation/NavController;

    iput-object p4, p0, Lw5/q0;->d:Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;

    iput-object p5, p0, Lw5/q0;->e:Lf6/j;

    iput-object p6, p0, Lw5/q0;->f:Landroidx/compose/foundation/ScrollState;

    iput-object p7, p0, Lw5/q0;->g:Lw5/e;

    iput-object p8, p0, Lw5/q0;->h:Lkotlin/jvm/functions/Function4;

    iput-object p9, p0, Lw5/q0;->i:Lkotlin/jvm/functions/Function2;

    iput-object p10, p0, Lw5/q0;->j:Lkotlin/jvm/functions/Function1;

    iput-object p11, p0, Lw5/q0;->k:Lkotlin/jvm/functions/Function2;

    iput-object p12, p0, Lw5/q0;->l:Lkotlin/jvm/functions/Function2;

    iput-object p13, p0, Lw5/q0;->m:Lkotlin/jvm/functions/Function1;

    iput-object p14, p0, Lw5/q0;->n:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    iget-object v1, v0, Lw5/q0;->a:Lcom/zykj/evaluation/ui/detail/b;

    iget-object v2, v0, Lw5/q0;->b:Lkotlin/jvm/functions/Function0;

    iget-object v3, v0, Lw5/q0;->c:Landroidx/navigation/NavController;

    iget-object v4, v0, Lw5/q0;->d:Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;

    iget-object v5, v0, Lw5/q0;->e:Lf6/j;

    iget-object v6, v0, Lw5/q0;->f:Landroidx/compose/foundation/ScrollState;

    iget-object v7, v0, Lw5/q0;->g:Lw5/e;

    iget-object v8, v0, Lw5/q0;->h:Lkotlin/jvm/functions/Function4;

    iget-object v9, v0, Lw5/q0;->i:Lkotlin/jvm/functions/Function2;

    iget-object v10, v0, Lw5/q0;->j:Lkotlin/jvm/functions/Function1;

    iget-object v11, v0, Lw5/q0;->k:Lkotlin/jvm/functions/Function2;

    iget-object v12, v0, Lw5/q0;->l:Lkotlin/jvm/functions/Function2;

    iget-object v13, v0, Lw5/q0;->m:Lkotlin/jvm/functions/Function1;

    iget-object v14, v0, Lw5/q0;->n:Lkotlin/jvm/functions/Function1;

    move-object/from16 v15, p1

    check-cast v15, Landroidx/compose/foundation/layout/BoxScope;

    move-object/from16 v16, p2

    check-cast v16, Landroidx/compose/runtime/Composer;

    move-object/from16 v17, p3

    check-cast v17, Ljava/lang/Integer;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Integer;->intValue()I

    move-result v17

    invoke-static/range {v1 .. v17}, Lcom/zykj/evaluation/ui/detail/TaskDetailPageKt;->I(Lcom/zykj/evaluation/ui/detail/b;Lkotlin/jvm/functions/Function0;Landroidx/navigation/NavController;Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;Lf6/j;Landroidx/compose/foundation/ScrollState;Lw5/e;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object v1

    return-object v1
.end method
