.class public final synthetic Lz5/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/Modifier;

.field public final synthetic b:Ljava/util/List;

.field public final synthetic c:Lkotlin/jvm/functions/Function1;

.field public final synthetic d:Ljava/util/List;

.field public final synthetic e:Lkotlin/jvm/functions/Function1;

.field public final synthetic f:Ljava/util/List;

.field public final synthetic g:Lkotlin/jvm/functions/Function1;

.field public final synthetic h:Ljava/util/List;

.field public final synthetic i:Lkotlin/jvm/functions/Function1;

.field public final synthetic j:Lkotlin/jvm/functions/Function1;

.field public final synthetic k:Lkotlin/jvm/functions/Function0;

.field public final synthetic l:Lkotlin/jvm/functions/Function0;

.field public final synthetic m:I

.field public final synthetic n:I

.field public final synthetic o:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Ljava/util/List;Lkotlin/jvm/functions/Function1;Ljava/util/List;Lkotlin/jvm/functions/Function1;Ljava/util/List;Lkotlin/jvm/functions/Function1;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;III)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz5/g;->a:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lz5/g;->b:Ljava/util/List;

    iput-object p3, p0, Lz5/g;->c:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Lz5/g;->d:Ljava/util/List;

    iput-object p5, p0, Lz5/g;->e:Lkotlin/jvm/functions/Function1;

    iput-object p6, p0, Lz5/g;->f:Ljava/util/List;

    iput-object p7, p0, Lz5/g;->g:Lkotlin/jvm/functions/Function1;

    iput-object p8, p0, Lz5/g;->h:Ljava/util/List;

    iput-object p9, p0, Lz5/g;->i:Lkotlin/jvm/functions/Function1;

    iput-object p10, p0, Lz5/g;->j:Lkotlin/jvm/functions/Function1;

    iput-object p11, p0, Lz5/g;->k:Lkotlin/jvm/functions/Function0;

    iput-object p12, p0, Lz5/g;->l:Lkotlin/jvm/functions/Function0;

    iput p13, p0, Lz5/g;->m:I

    iput p14, p0, Lz5/g;->n:I

    iput p15, p0, Lz5/g;->o:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    iget-object v1, v0, Lz5/g;->a:Landroidx/compose/ui/Modifier;

    iget-object v2, v0, Lz5/g;->b:Ljava/util/List;

    iget-object v3, v0, Lz5/g;->c:Lkotlin/jvm/functions/Function1;

    iget-object v4, v0, Lz5/g;->d:Ljava/util/List;

    iget-object v5, v0, Lz5/g;->e:Lkotlin/jvm/functions/Function1;

    iget-object v6, v0, Lz5/g;->f:Ljava/util/List;

    iget-object v7, v0, Lz5/g;->g:Lkotlin/jvm/functions/Function1;

    iget-object v8, v0, Lz5/g;->h:Ljava/util/List;

    iget-object v9, v0, Lz5/g;->i:Lkotlin/jvm/functions/Function1;

    iget-object v10, v0, Lz5/g;->j:Lkotlin/jvm/functions/Function1;

    iget-object v11, v0, Lz5/g;->k:Lkotlin/jvm/functions/Function0;

    iget-object v12, v0, Lz5/g;->l:Lkotlin/jvm/functions/Function0;

    iget v13, v0, Lz5/g;->m:I

    iget v14, v0, Lz5/g;->n:I

    iget v15, v0, Lz5/g;->o:I

    move-object/from16 v16, p1

    check-cast v16, Landroidx/compose/runtime/Composer;

    move-object/from16 v17, p2

    check-cast v17, Ljava/lang/Integer;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Integer;->intValue()I

    move-result v17

    invoke-static/range {v1 .. v17}, Lz5/r;->c(Landroidx/compose/ui/Modifier;Ljava/util/List;Lkotlin/jvm/functions/Function1;Ljava/util/List;Lkotlin/jvm/functions/Function1;Ljava/util/List;Lkotlin/jvm/functions/Function1;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;IIILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object v1

    return-object v1
.end method
