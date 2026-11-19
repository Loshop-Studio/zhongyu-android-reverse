.class public final synthetic Lw5/p0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/Modifier;

.field public final synthetic b:Lcom/zykj/evaluation/ui/detail/a;

.field public final synthetic c:Lkotlin/jvm/functions/Function1;

.field public final synthetic d:Lcom/zykj/evaluation/ui/detail/d;

.field public final synthetic e:Lkotlin/jvm/functions/Function0;

.field public final synthetic f:Lw5/i;

.field public final synthetic g:Lkotlin/jvm/functions/Function0;

.field public final synthetic h:Z

.field public final synthetic i:Ljava/lang/String;

.field public final synthetic j:Lkotlin/jvm/functions/Function0;

.field public final synthetic k:Ljava/lang/String;

.field public final synthetic l:Lkotlin/jvm/functions/Function0;

.field public final synthetic m:Z

.field public final synthetic n:Lkotlin/jvm/functions/Function0;

.field public final synthetic o:I

.field public final synthetic p:I

.field public final synthetic q:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Lcom/zykj/evaluation/ui/detail/a;Lkotlin/jvm/functions/Function1;Lcom/zykj/evaluation/ui/detail/d;Lkotlin/jvm/functions/Function0;Lw5/i;Lkotlin/jvm/functions/Function0;ZLjava/lang/String;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function0;III)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw5/p0;->a:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lw5/p0;->b:Lcom/zykj/evaluation/ui/detail/a;

    iput-object p3, p0, Lw5/p0;->c:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Lw5/p0;->d:Lcom/zykj/evaluation/ui/detail/d;

    iput-object p5, p0, Lw5/p0;->e:Lkotlin/jvm/functions/Function0;

    iput-object p6, p0, Lw5/p0;->f:Lw5/i;

    iput-object p7, p0, Lw5/p0;->g:Lkotlin/jvm/functions/Function0;

    iput-boolean p8, p0, Lw5/p0;->h:Z

    iput-object p9, p0, Lw5/p0;->i:Ljava/lang/String;

    iput-object p10, p0, Lw5/p0;->j:Lkotlin/jvm/functions/Function0;

    iput-object p11, p0, Lw5/p0;->k:Ljava/lang/String;

    iput-object p12, p0, Lw5/p0;->l:Lkotlin/jvm/functions/Function0;

    iput-boolean p13, p0, Lw5/p0;->m:Z

    iput-object p14, p0, Lw5/p0;->n:Lkotlin/jvm/functions/Function0;

    iput p15, p0, Lw5/p0;->o:I

    move/from16 p1, p16

    iput p1, p0, Lw5/p0;->p:I

    move/from16 p1, p17

    iput p1, p0, Lw5/p0;->q:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    iget-object v1, v0, Lw5/p0;->a:Landroidx/compose/ui/Modifier;

    iget-object v2, v0, Lw5/p0;->b:Lcom/zykj/evaluation/ui/detail/a;

    iget-object v3, v0, Lw5/p0;->c:Lkotlin/jvm/functions/Function1;

    iget-object v4, v0, Lw5/p0;->d:Lcom/zykj/evaluation/ui/detail/d;

    iget-object v5, v0, Lw5/p0;->e:Lkotlin/jvm/functions/Function0;

    iget-object v6, v0, Lw5/p0;->f:Lw5/i;

    iget-object v7, v0, Lw5/p0;->g:Lkotlin/jvm/functions/Function0;

    iget-boolean v8, v0, Lw5/p0;->h:Z

    iget-object v9, v0, Lw5/p0;->i:Ljava/lang/String;

    iget-object v10, v0, Lw5/p0;->j:Lkotlin/jvm/functions/Function0;

    iget-object v11, v0, Lw5/p0;->k:Ljava/lang/String;

    iget-object v12, v0, Lw5/p0;->l:Lkotlin/jvm/functions/Function0;

    iget-boolean v13, v0, Lw5/p0;->m:Z

    iget-object v14, v0, Lw5/p0;->n:Lkotlin/jvm/functions/Function0;

    iget v15, v0, Lw5/p0;->o:I

    move-object/from16 v16, v1

    iget v1, v0, Lw5/p0;->p:I

    move/from16 v17, v1

    iget v1, v0, Lw5/p0;->q:I

    move-object/from16 v18, p1

    check-cast v18, Landroidx/compose/runtime/Composer;

    move-object/from16 v19, p2

    check-cast v19, Ljava/lang/Integer;

    invoke-virtual/range {v19 .. v19}, Ljava/lang/Integer;->intValue()I

    move-result v19

    move/from16 v20, v17

    move/from16 v17, v1

    move-object/from16 v1, v16

    move/from16 v16, v20

    invoke-static/range {v1 .. v19}, Lcom/zykj/evaluation/ui/detail/TaskDetailPageKt;->i(Landroidx/compose/ui/Modifier;Lcom/zykj/evaluation/ui/detail/a;Lkotlin/jvm/functions/Function1;Lcom/zykj/evaluation/ui/detail/d;Lkotlin/jvm/functions/Function0;Lw5/i;Lkotlin/jvm/functions/Function0;ZLjava/lang/String;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function0;IIILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object v1

    return-object v1
.end method
