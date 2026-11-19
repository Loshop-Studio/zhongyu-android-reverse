.class public final synthetic Landroidx/navigation/compose/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# instance fields
.field public final synthetic c:Landroidx/navigation/NavHostController;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Landroidx/compose/ui/Modifier;

.field public final synthetic f:Landroidx/compose/ui/Alignment;

.field public final synthetic g:Ljava/lang/String;

.field public final synthetic h:Lhd/l;

.field public final synthetic i:Lhd/l;

.field public final synthetic j:Lhd/l;

.field public final synthetic k:Lhd/l;

.field public final synthetic l:Lhd/l;

.field public final synthetic m:Lhd/l;

.field public final synthetic n:I

.field public final synthetic o:I

.field public final synthetic p:I


# direct methods
.method public synthetic constructor <init>(Landroidx/navigation/NavHostController;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Ljava/lang/String;Lhd/l;Lhd/l;Lhd/l;Lhd/l;Lhd/l;Lhd/l;III)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/navigation/compose/d0;->c:Landroidx/navigation/NavHostController;

    iput-object p2, p0, Landroidx/navigation/compose/d0;->d:Ljava/lang/String;

    iput-object p3, p0, Landroidx/navigation/compose/d0;->e:Landroidx/compose/ui/Modifier;

    iput-object p4, p0, Landroidx/navigation/compose/d0;->f:Landroidx/compose/ui/Alignment;

    iput-object p5, p0, Landroidx/navigation/compose/d0;->g:Ljava/lang/String;

    iput-object p6, p0, Landroidx/navigation/compose/d0;->h:Lhd/l;

    iput-object p7, p0, Landroidx/navigation/compose/d0;->i:Lhd/l;

    iput-object p8, p0, Landroidx/navigation/compose/d0;->j:Lhd/l;

    iput-object p9, p0, Landroidx/navigation/compose/d0;->k:Lhd/l;

    iput-object p10, p0, Landroidx/navigation/compose/d0;->l:Lhd/l;

    iput-object p11, p0, Landroidx/navigation/compose/d0;->m:Lhd/l;

    iput p12, p0, Landroidx/navigation/compose/d0;->n:I

    iput p13, p0, Landroidx/navigation/compose/d0;->o:I

    iput p14, p0, Landroidx/navigation/compose/d0;->p:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    iget-object v1, v0, Landroidx/navigation/compose/d0;->c:Landroidx/navigation/NavHostController;

    iget-object v2, v0, Landroidx/navigation/compose/d0;->d:Ljava/lang/String;

    iget-object v3, v0, Landroidx/navigation/compose/d0;->e:Landroidx/compose/ui/Modifier;

    iget-object v4, v0, Landroidx/navigation/compose/d0;->f:Landroidx/compose/ui/Alignment;

    iget-object v5, v0, Landroidx/navigation/compose/d0;->g:Ljava/lang/String;

    iget-object v6, v0, Landroidx/navigation/compose/d0;->h:Lhd/l;

    iget-object v7, v0, Landroidx/navigation/compose/d0;->i:Lhd/l;

    iget-object v8, v0, Landroidx/navigation/compose/d0;->j:Lhd/l;

    iget-object v9, v0, Landroidx/navigation/compose/d0;->k:Lhd/l;

    iget-object v10, v0, Landroidx/navigation/compose/d0;->l:Lhd/l;

    iget-object v11, v0, Landroidx/navigation/compose/d0;->m:Lhd/l;

    iget v12, v0, Landroidx/navigation/compose/d0;->n:I

    iget v13, v0, Landroidx/navigation/compose/d0;->o:I

    iget v14, v0, Landroidx/navigation/compose/d0;->p:I

    move-object/from16 v15, p1

    check-cast v15, Landroidx/compose/runtime/Composer;

    move-object/from16 v16, p2

    check-cast v16, Ljava/lang/Integer;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Integer;->intValue()I

    move-result v16

    invoke-static/range {v1 .. v16}, Landroidx/navigation/compose/NavHostKt;->n(Landroidx/navigation/NavHostController;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Ljava/lang/String;Lhd/l;Lhd/l;Lhd/l;Lhd/l;Lhd/l;Lhd/l;IIILandroidx/compose/runtime/Composer;I)Lqc/q;

    move-result-object v1

    return-object v1
.end method
