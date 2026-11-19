.class public final synthetic Lr6/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/Modifier;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Z

.field public final synthetic f:Ljava/lang/String;

.field public final synthetic g:Ljava/lang/String;

.field public final synthetic h:Z

.field public final synthetic i:Ljava/lang/String;

.field public final synthetic j:Ljava/lang/String;

.field public final synthetic k:Lkotlin/jvm/functions/Function0;

.field public final synthetic l:Lkotlin/jvm/functions/Function0;

.field public final synthetic m:Ljava/lang/String;

.field public final synthetic n:Lkotlin/jvm/functions/Function0;

.field public final synthetic o:Lkotlin/jvm/functions/Function0;

.field public final synthetic p:I

.field public final synthetic q:I

.field public final synthetic r:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;III)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr6/q;->a:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lr6/q;->b:Ljava/lang/String;

    iput-object p3, p0, Lr6/q;->c:Ljava/lang/String;

    iput-object p4, p0, Lr6/q;->d:Ljava/lang/String;

    iput-boolean p5, p0, Lr6/q;->e:Z

    iput-object p6, p0, Lr6/q;->f:Ljava/lang/String;

    iput-object p7, p0, Lr6/q;->g:Ljava/lang/String;

    iput-boolean p8, p0, Lr6/q;->h:Z

    iput-object p9, p0, Lr6/q;->i:Ljava/lang/String;

    iput-object p10, p0, Lr6/q;->j:Ljava/lang/String;

    iput-object p11, p0, Lr6/q;->k:Lkotlin/jvm/functions/Function0;

    iput-object p12, p0, Lr6/q;->l:Lkotlin/jvm/functions/Function0;

    iput-object p13, p0, Lr6/q;->m:Ljava/lang/String;

    iput-object p14, p0, Lr6/q;->n:Lkotlin/jvm/functions/Function0;

    iput-object p15, p0, Lr6/q;->o:Lkotlin/jvm/functions/Function0;

    move/from16 p1, p16

    iput p1, p0, Lr6/q;->p:I

    move/from16 p1, p17

    iput p1, p0, Lr6/q;->q:I

    move/from16 p1, p18

    iput p1, p0, Lr6/q;->r:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    iget-object v1, v0, Lr6/q;->a:Landroidx/compose/ui/Modifier;

    iget-object v2, v0, Lr6/q;->b:Ljava/lang/String;

    iget-object v3, v0, Lr6/q;->c:Ljava/lang/String;

    iget-object v4, v0, Lr6/q;->d:Ljava/lang/String;

    iget-boolean v5, v0, Lr6/q;->e:Z

    iget-object v6, v0, Lr6/q;->f:Ljava/lang/String;

    iget-object v7, v0, Lr6/q;->g:Ljava/lang/String;

    iget-boolean v8, v0, Lr6/q;->h:Z

    iget-object v9, v0, Lr6/q;->i:Ljava/lang/String;

    iget-object v10, v0, Lr6/q;->j:Ljava/lang/String;

    iget-object v11, v0, Lr6/q;->k:Lkotlin/jvm/functions/Function0;

    iget-object v12, v0, Lr6/q;->l:Lkotlin/jvm/functions/Function0;

    iget-object v13, v0, Lr6/q;->m:Ljava/lang/String;

    iget-object v14, v0, Lr6/q;->n:Lkotlin/jvm/functions/Function0;

    iget-object v15, v0, Lr6/q;->o:Lkotlin/jvm/functions/Function0;

    move-object/from16 v16, v1

    iget v1, v0, Lr6/q;->p:I

    move/from16 v17, v1

    iget v1, v0, Lr6/q;->q:I

    move/from16 v18, v1

    iget v1, v0, Lr6/q;->r:I

    move-object/from16 v19, p1

    check-cast v19, Landroidx/compose/runtime/Composer;

    move-object/from16 v20, p2

    check-cast v20, Ljava/lang/Integer;

    invoke-virtual/range {v20 .. v20}, Ljava/lang/Integer;->intValue()I

    move-result v20

    move/from16 v21, v18

    move/from16 v18, v1

    move-object/from16 v1, v16

    move/from16 v16, v17

    move/from16 v17, v21

    invoke-static/range {v1 .. v20}, Lr6/r;->d(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;IIILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object v1

    return-object v1
.end method
