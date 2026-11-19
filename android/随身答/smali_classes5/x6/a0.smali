.class public final synthetic Lx6/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/Modifier;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lkotlin/jvm/functions/Function1;

.field public final synthetic d:Lkotlin/jvm/functions/Function2;

.field public final synthetic e:Lkotlin/jvm/functions/Function0;

.field public final synthetic f:Landroidx/compose/foundation/text/KeyboardOptions;

.field public final synthetic g:Lkotlin/jvm/functions/Function1;

.field public final synthetic h:Landroidx/compose/ui/text/TextStyle;

.field public final synthetic i:Landroidx/compose/ui/text/TextStyle;

.field public final synthetic j:Z

.field public final synthetic k:Ljava/lang/String;

.field public final synthetic l:I

.field public final synthetic m:Z

.field public final synthetic n:I

.field public final synthetic o:I

.field public final synthetic p:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/text/KeyboardOptions;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;ZLjava/lang/String;IZIII)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx6/a0;->a:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lx6/a0;->b:Ljava/lang/String;

    iput-object p3, p0, Lx6/a0;->c:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Lx6/a0;->d:Lkotlin/jvm/functions/Function2;

    iput-object p5, p0, Lx6/a0;->e:Lkotlin/jvm/functions/Function0;

    iput-object p6, p0, Lx6/a0;->f:Landroidx/compose/foundation/text/KeyboardOptions;

    iput-object p7, p0, Lx6/a0;->g:Lkotlin/jvm/functions/Function1;

    iput-object p8, p0, Lx6/a0;->h:Landroidx/compose/ui/text/TextStyle;

    iput-object p9, p0, Lx6/a0;->i:Landroidx/compose/ui/text/TextStyle;

    iput-boolean p10, p0, Lx6/a0;->j:Z

    iput-object p11, p0, Lx6/a0;->k:Ljava/lang/String;

    iput p12, p0, Lx6/a0;->l:I

    iput-boolean p13, p0, Lx6/a0;->m:Z

    iput p14, p0, Lx6/a0;->n:I

    iput p15, p0, Lx6/a0;->o:I

    move/from16 p1, p16

    iput p1, p0, Lx6/a0;->p:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    iget-object v1, v0, Lx6/a0;->a:Landroidx/compose/ui/Modifier;

    iget-object v2, v0, Lx6/a0;->b:Ljava/lang/String;

    iget-object v3, v0, Lx6/a0;->c:Lkotlin/jvm/functions/Function1;

    iget-object v4, v0, Lx6/a0;->d:Lkotlin/jvm/functions/Function2;

    iget-object v5, v0, Lx6/a0;->e:Lkotlin/jvm/functions/Function0;

    iget-object v6, v0, Lx6/a0;->f:Landroidx/compose/foundation/text/KeyboardOptions;

    iget-object v7, v0, Lx6/a0;->g:Lkotlin/jvm/functions/Function1;

    iget-object v8, v0, Lx6/a0;->h:Landroidx/compose/ui/text/TextStyle;

    iget-object v9, v0, Lx6/a0;->i:Landroidx/compose/ui/text/TextStyle;

    iget-boolean v10, v0, Lx6/a0;->j:Z

    iget-object v11, v0, Lx6/a0;->k:Ljava/lang/String;

    iget v12, v0, Lx6/a0;->l:I

    iget-boolean v13, v0, Lx6/a0;->m:Z

    iget v14, v0, Lx6/a0;->n:I

    iget v15, v0, Lx6/a0;->o:I

    move-object/from16 v16, v1

    iget v1, v0, Lx6/a0;->p:I

    move-object/from16 v17, p1

    check-cast v17, Landroidx/compose/runtime/Composer;

    move-object/from16 v18, p2

    check-cast v18, Ljava/lang/Integer;

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Integer;->intValue()I

    move-result v18

    move-object/from16 v19, v16

    move/from16 v16, v1

    move-object/from16 v1, v19

    invoke-static/range {v1 .. v18}, Lx6/b0;->f(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/text/KeyboardOptions;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;ZLjava/lang/String;IZIIILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object v1

    return-object v1
.end method
