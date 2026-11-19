.class public final synthetic Lx6/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/Modifier;

.field public final synthetic b:Landroidx/compose/ui/graphics/Shape;

.field public final synthetic c:J

.field public final synthetic d:J

.field public final synthetic e:J

.field public final synthetic f:Ljava/lang/String;

.field public final synthetic g:Landroidx/compose/foundation/BorderStroke;

.field public final synthetic h:Z

.field public final synthetic i:Landroidx/compose/foundation/layout/PaddingValues;

.field public final synthetic j:Lkotlin/jvm/functions/Function0;

.field public final synthetic k:I

.field public final synthetic l:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJJLjava/lang/String;Landroidx/compose/foundation/BorderStroke;ZLandroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function0;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx6/f;->a:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lx6/f;->b:Landroidx/compose/ui/graphics/Shape;

    iput-wide p3, p0, Lx6/f;->c:J

    iput-wide p5, p0, Lx6/f;->d:J

    iput-wide p7, p0, Lx6/f;->e:J

    iput-object p9, p0, Lx6/f;->f:Ljava/lang/String;

    iput-object p10, p0, Lx6/f;->g:Landroidx/compose/foundation/BorderStroke;

    iput-boolean p11, p0, Lx6/f;->h:Z

    iput-object p12, p0, Lx6/f;->i:Landroidx/compose/foundation/layout/PaddingValues;

    iput-object p13, p0, Lx6/f;->j:Lkotlin/jvm/functions/Function0;

    iput p14, p0, Lx6/f;->k:I

    iput p15, p0, Lx6/f;->l:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    iget-object v1, v0, Lx6/f;->a:Landroidx/compose/ui/Modifier;

    iget-object v2, v0, Lx6/f;->b:Landroidx/compose/ui/graphics/Shape;

    iget-wide v3, v0, Lx6/f;->c:J

    iget-wide v5, v0, Lx6/f;->d:J

    iget-wide v7, v0, Lx6/f;->e:J

    iget-object v9, v0, Lx6/f;->f:Ljava/lang/String;

    iget-object v10, v0, Lx6/f;->g:Landroidx/compose/foundation/BorderStroke;

    iget-boolean v11, v0, Lx6/f;->h:Z

    iget-object v12, v0, Lx6/f;->i:Landroidx/compose/foundation/layout/PaddingValues;

    iget-object v13, v0, Lx6/f;->j:Lkotlin/jvm/functions/Function0;

    iget v14, v0, Lx6/f;->k:I

    iget v15, v0, Lx6/f;->l:I

    move-object/from16 v16, p1

    check-cast v16, Landroidx/compose/runtime/Composer;

    move-object/from16 v17, p2

    check-cast v17, Ljava/lang/Integer;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Integer;->intValue()I

    move-result v17

    invoke-static/range {v1 .. v17}, Lx6/g;->d(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJJLjava/lang/String;Landroidx/compose/foundation/BorderStroke;ZLandroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function0;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object v1

    return-object v1
.end method
