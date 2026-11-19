.class public final synthetic Lz5/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/Modifier;

.field public final synthetic b:Ljava/util/List;

.field public final synthetic c:J

.field public final synthetic d:Z

.field public final synthetic e:Ljava/lang/String;

.field public final synthetic f:Ljava/util/List;

.field public final synthetic g:Lkotlin/jvm/functions/Function1;

.field public final synthetic h:Ljava/util/List;

.field public final synthetic i:Lkotlin/jvm/functions/Function1;

.field public final synthetic j:Lkotlin/jvm/functions/Function1;

.field public final synthetic k:Lkotlin/jvm/functions/Function1;

.field public final synthetic l:Lkotlin/jvm/functions/Function0;

.field public final synthetic m:Lkotlin/jvm/functions/Function0;

.field public final synthetic n:Lkotlin/jvm/functions/Function1;

.field public final synthetic o:I

.field public final synthetic p:I

.field public final synthetic q:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Ljava/util/List;JZLjava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;III)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz5/s;->a:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lz5/s;->b:Ljava/util/List;

    iput-wide p3, p0, Lz5/s;->c:J

    iput-boolean p5, p0, Lz5/s;->d:Z

    iput-object p6, p0, Lz5/s;->e:Ljava/lang/String;

    iput-object p7, p0, Lz5/s;->f:Ljava/util/List;

    iput-object p8, p0, Lz5/s;->g:Lkotlin/jvm/functions/Function1;

    iput-object p9, p0, Lz5/s;->h:Ljava/util/List;

    iput-object p10, p0, Lz5/s;->i:Lkotlin/jvm/functions/Function1;

    iput-object p11, p0, Lz5/s;->j:Lkotlin/jvm/functions/Function1;

    iput-object p12, p0, Lz5/s;->k:Lkotlin/jvm/functions/Function1;

    iput-object p13, p0, Lz5/s;->l:Lkotlin/jvm/functions/Function0;

    iput-object p14, p0, Lz5/s;->m:Lkotlin/jvm/functions/Function0;

    iput-object p15, p0, Lz5/s;->n:Lkotlin/jvm/functions/Function1;

    move/from16 p1, p16

    iput p1, p0, Lz5/s;->o:I

    move/from16 p1, p17

    iput p1, p0, Lz5/s;->p:I

    move/from16 p1, p18

    iput p1, p0, Lz5/s;->q:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    iget-object v1, v0, Lz5/s;->a:Landroidx/compose/ui/Modifier;

    iget-object v2, v0, Lz5/s;->b:Ljava/util/List;

    iget-wide v3, v0, Lz5/s;->c:J

    iget-boolean v5, v0, Lz5/s;->d:Z

    iget-object v6, v0, Lz5/s;->e:Ljava/lang/String;

    iget-object v7, v0, Lz5/s;->f:Ljava/util/List;

    iget-object v8, v0, Lz5/s;->g:Lkotlin/jvm/functions/Function1;

    iget-object v9, v0, Lz5/s;->h:Ljava/util/List;

    iget-object v10, v0, Lz5/s;->i:Lkotlin/jvm/functions/Function1;

    iget-object v11, v0, Lz5/s;->j:Lkotlin/jvm/functions/Function1;

    iget-object v12, v0, Lz5/s;->k:Lkotlin/jvm/functions/Function1;

    iget-object v13, v0, Lz5/s;->l:Lkotlin/jvm/functions/Function0;

    iget-object v14, v0, Lz5/s;->m:Lkotlin/jvm/functions/Function0;

    iget-object v15, v0, Lz5/s;->n:Lkotlin/jvm/functions/Function1;

    move-object/from16 v16, v1

    iget v1, v0, Lz5/s;->o:I

    move/from16 v17, v1

    iget v1, v0, Lz5/s;->p:I

    move/from16 v18, v1

    iget v1, v0, Lz5/s;->q:I

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

    invoke-static/range {v1 .. v20}, Lz5/i0;->n(Landroidx/compose/ui/Modifier;Ljava/util/List;JZLjava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;IIILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object v1

    return-object v1
.end method
