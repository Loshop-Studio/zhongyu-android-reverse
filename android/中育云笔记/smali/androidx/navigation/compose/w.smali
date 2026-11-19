.class public final synthetic Landroidx/navigation/compose/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# instance fields
.field public final synthetic c:Landroidx/navigation/NavHostController;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Landroidx/compose/ui/Modifier;

.field public final synthetic f:Landroidx/compose/ui/Alignment;

.field public final synthetic g:Lod/c;

.field public final synthetic h:Ljava/util/Map;

.field public final synthetic i:Lhd/l;

.field public final synthetic j:Lhd/l;

.field public final synthetic k:Lhd/l;

.field public final synthetic l:Lhd/l;

.field public final synthetic m:Lhd/l;

.field public final synthetic n:Lhd/l;

.field public final synthetic o:I

.field public final synthetic p:I

.field public final synthetic q:I


# direct methods
.method public synthetic constructor <init>(Landroidx/navigation/NavHostController;Ljava/lang/Object;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Lod/c;Ljava/util/Map;Lhd/l;Lhd/l;Lhd/l;Lhd/l;Lhd/l;Lhd/l;III)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/navigation/compose/w;->c:Landroidx/navigation/NavHostController;

    iput-object p2, p0, Landroidx/navigation/compose/w;->d:Ljava/lang/Object;

    iput-object p3, p0, Landroidx/navigation/compose/w;->e:Landroidx/compose/ui/Modifier;

    iput-object p4, p0, Landroidx/navigation/compose/w;->f:Landroidx/compose/ui/Alignment;

    iput-object p5, p0, Landroidx/navigation/compose/w;->g:Lod/c;

    iput-object p6, p0, Landroidx/navigation/compose/w;->h:Ljava/util/Map;

    iput-object p7, p0, Landroidx/navigation/compose/w;->i:Lhd/l;

    iput-object p8, p0, Landroidx/navigation/compose/w;->j:Lhd/l;

    iput-object p9, p0, Landroidx/navigation/compose/w;->k:Lhd/l;

    iput-object p10, p0, Landroidx/navigation/compose/w;->l:Lhd/l;

    iput-object p11, p0, Landroidx/navigation/compose/w;->m:Lhd/l;

    iput-object p12, p0, Landroidx/navigation/compose/w;->n:Lhd/l;

    iput p13, p0, Landroidx/navigation/compose/w;->o:I

    iput p14, p0, Landroidx/navigation/compose/w;->p:I

    iput p15, p0, Landroidx/navigation/compose/w;->q:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    iget-object v1, v0, Landroidx/navigation/compose/w;->c:Landroidx/navigation/NavHostController;

    iget-object v2, v0, Landroidx/navigation/compose/w;->d:Ljava/lang/Object;

    iget-object v3, v0, Landroidx/navigation/compose/w;->e:Landroidx/compose/ui/Modifier;

    iget-object v4, v0, Landroidx/navigation/compose/w;->f:Landroidx/compose/ui/Alignment;

    iget-object v5, v0, Landroidx/navigation/compose/w;->g:Lod/c;

    iget-object v6, v0, Landroidx/navigation/compose/w;->h:Ljava/util/Map;

    iget-object v7, v0, Landroidx/navigation/compose/w;->i:Lhd/l;

    iget-object v8, v0, Landroidx/navigation/compose/w;->j:Lhd/l;

    iget-object v9, v0, Landroidx/navigation/compose/w;->k:Lhd/l;

    iget-object v10, v0, Landroidx/navigation/compose/w;->l:Lhd/l;

    iget-object v11, v0, Landroidx/navigation/compose/w;->m:Lhd/l;

    iget-object v12, v0, Landroidx/navigation/compose/w;->n:Lhd/l;

    iget v13, v0, Landroidx/navigation/compose/w;->o:I

    iget v14, v0, Landroidx/navigation/compose/w;->p:I

    iget v15, v0, Landroidx/navigation/compose/w;->q:I

    move-object/from16 v16, p1

    check-cast v16, Landroidx/compose/runtime/Composer;

    move-object/from16 v17, p2

    check-cast v17, Ljava/lang/Integer;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Integer;->intValue()I

    move-result v17

    invoke-static/range {v1 .. v17}, Landroidx/navigation/compose/NavHostKt;->g(Landroidx/navigation/NavHostController;Ljava/lang/Object;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Lod/c;Ljava/util/Map;Lhd/l;Lhd/l;Lhd/l;Lhd/l;Lhd/l;Lhd/l;IIILandroidx/compose/runtime/Composer;I)Lqc/q;

    move-result-object v1

    return-object v1
.end method
