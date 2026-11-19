.class public final synthetic Lg3/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Lkotlin/jvm/functions/Function0;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Ljava/lang/String;

.field public final synthetic f:J

.field public final synthetic g:Lkotlin/jvm/functions/Function0;

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:J

.field public final synthetic j:Lkotlin/jvm/functions/Function0;

.field public final synthetic k:Z

.field public final synthetic l:Landroidx/compose/ui/unit/Density;

.field public final synthetic m:Landroidx/compose/ui/Modifier;

.field public final synthetic n:I

.field public final synthetic o:I

.field public final synthetic p:I


# direct methods
.method public synthetic constructor <init>(ZLkotlin/jvm/functions/Function0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLkotlin/jvm/functions/Function0;Ljava/lang/String;JLkotlin/jvm/functions/Function0;ZLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/Modifier;III)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lg3/g;->a:Z

    iput-object p2, p0, Lg3/g;->b:Lkotlin/jvm/functions/Function0;

    iput-object p3, p0, Lg3/g;->c:Ljava/lang/String;

    iput-object p4, p0, Lg3/g;->d:Ljava/lang/String;

    iput-object p5, p0, Lg3/g;->e:Ljava/lang/String;

    iput-wide p6, p0, Lg3/g;->f:J

    iput-object p8, p0, Lg3/g;->g:Lkotlin/jvm/functions/Function0;

    iput-object p9, p0, Lg3/g;->h:Ljava/lang/String;

    iput-wide p10, p0, Lg3/g;->i:J

    iput-object p12, p0, Lg3/g;->j:Lkotlin/jvm/functions/Function0;

    iput-boolean p13, p0, Lg3/g;->k:Z

    iput-object p14, p0, Lg3/g;->l:Landroidx/compose/ui/unit/Density;

    iput-object p15, p0, Lg3/g;->m:Landroidx/compose/ui/Modifier;

    move/from16 p1, p16

    iput p1, p0, Lg3/g;->n:I

    move/from16 p1, p17

    iput p1, p0, Lg3/g;->o:I

    move/from16 p1, p18

    iput p1, p0, Lg3/g;->p:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    iget-boolean v1, v0, Lg3/g;->a:Z

    iget-object v2, v0, Lg3/g;->b:Lkotlin/jvm/functions/Function0;

    iget-object v3, v0, Lg3/g;->c:Ljava/lang/String;

    iget-object v4, v0, Lg3/g;->d:Ljava/lang/String;

    iget-object v5, v0, Lg3/g;->e:Ljava/lang/String;

    iget-wide v6, v0, Lg3/g;->f:J

    iget-object v8, v0, Lg3/g;->g:Lkotlin/jvm/functions/Function0;

    iget-object v9, v0, Lg3/g;->h:Ljava/lang/String;

    iget-wide v10, v0, Lg3/g;->i:J

    iget-object v12, v0, Lg3/g;->j:Lkotlin/jvm/functions/Function0;

    iget-boolean v13, v0, Lg3/g;->k:Z

    iget-object v14, v0, Lg3/g;->l:Landroidx/compose/ui/unit/Density;

    iget-object v15, v0, Lg3/g;->m:Landroidx/compose/ui/Modifier;

    move/from16 v16, v1

    iget v1, v0, Lg3/g;->n:I

    move/from16 v17, v1

    iget v1, v0, Lg3/g;->o:I

    move/from16 v18, v1

    iget v1, v0, Lg3/g;->p:I

    move-object/from16 v19, p1

    check-cast v19, Landroidx/compose/runtime/Composer;

    move-object/from16 v20, p2

    check-cast v20, Ljava/lang/Integer;

    invoke-virtual/range {v20 .. v20}, Ljava/lang/Integer;->intValue()I

    move-result v20

    move/from16 v21, v18

    move/from16 v18, v1

    move/from16 v1, v16

    move/from16 v16, v17

    move/from16 v17, v21

    invoke-static/range {v1 .. v20}, Lg3/j;->g(ZLkotlin/jvm/functions/Function0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLkotlin/jvm/functions/Function0;Ljava/lang/String;JLkotlin/jvm/functions/Function0;ZLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/Modifier;IIILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object v1

    return-object v1
.end method
