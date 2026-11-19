.class public final synthetic Landroidx/navigation/compose/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroidx/navigation/NavHostController;

.field public final synthetic c:Ly6/c;

.field public final synthetic d:Landroidx/compose/ui/Modifier;

.field public final synthetic e:Landroidx/compose/ui/Alignment;

.field public final synthetic f:Ljava/util/Map;

.field public final synthetic g:Lr6/c;

.field public final synthetic h:Lr6/c;

.field public final synthetic i:Lr6/c;

.field public final synthetic j:Lr6/c;

.field public final synthetic k:Lr6/c;

.field public final synthetic l:Lr6/c;

.field public final synthetic m:I

.field public final synthetic n:I

.field public final synthetic o:I

.field public final synthetic p:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Landroidx/navigation/NavHostController;Ljava/lang/Object;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Ly6/c;Ljava/util/Map;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;III)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Landroidx/navigation/compose/l;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/navigation/compose/l;->b:Landroidx/navigation/NavHostController;

    iput-object p2, p0, Landroidx/navigation/compose/l;->p:Ljava/lang/Object;

    iput-object p3, p0, Landroidx/navigation/compose/l;->d:Landroidx/compose/ui/Modifier;

    iput-object p4, p0, Landroidx/navigation/compose/l;->e:Landroidx/compose/ui/Alignment;

    iput-object p5, p0, Landroidx/navigation/compose/l;->c:Ly6/c;

    iput-object p6, p0, Landroidx/navigation/compose/l;->f:Ljava/util/Map;

    iput-object p7, p0, Landroidx/navigation/compose/l;->g:Lr6/c;

    iput-object p8, p0, Landroidx/navigation/compose/l;->h:Lr6/c;

    iput-object p9, p0, Landroidx/navigation/compose/l;->i:Lr6/c;

    iput-object p10, p0, Landroidx/navigation/compose/l;->j:Lr6/c;

    iput-object p11, p0, Landroidx/navigation/compose/l;->k:Lr6/c;

    iput-object p12, p0, Landroidx/navigation/compose/l;->l:Lr6/c;

    iput p13, p0, Landroidx/navigation/compose/l;->m:I

    iput p14, p0, Landroidx/navigation/compose/l;->n:I

    move/from16 p1, p15

    iput p1, p0, Landroidx/navigation/compose/l;->o:I

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/navigation/NavHostController;Ly6/c;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Ly6/c;Ljava/util/Map;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;III)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Landroidx/navigation/compose/l;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/navigation/compose/l;->b:Landroidx/navigation/NavHostController;

    iput-object p2, p0, Landroidx/navigation/compose/l;->c:Ly6/c;

    iput-object p3, p0, Landroidx/navigation/compose/l;->d:Landroidx/compose/ui/Modifier;

    iput-object p4, p0, Landroidx/navigation/compose/l;->e:Landroidx/compose/ui/Alignment;

    iput-object p5, p0, Landroidx/navigation/compose/l;->p:Ljava/lang/Object;

    iput-object p6, p0, Landroidx/navigation/compose/l;->f:Ljava/util/Map;

    iput-object p7, p0, Landroidx/navigation/compose/l;->g:Lr6/c;

    iput-object p8, p0, Landroidx/navigation/compose/l;->h:Lr6/c;

    iput-object p9, p0, Landroidx/navigation/compose/l;->i:Lr6/c;

    iput-object p10, p0, Landroidx/navigation/compose/l;->j:Lr6/c;

    iput-object p11, p0, Landroidx/navigation/compose/l;->k:Lr6/c;

    iput-object p12, p0, Landroidx/navigation/compose/l;->l:Lr6/c;

    iput p13, p0, Landroidx/navigation/compose/l;->m:I

    iput p14, p0, Landroidx/navigation/compose/l;->n:I

    move/from16 p1, p15

    iput p1, p0, Landroidx/navigation/compose/l;->o:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    iget v1, v0, Landroidx/navigation/compose/l;->a:I

    packed-switch v1, :pswitch_data_0

    iget-object v1, v0, Landroidx/navigation/compose/l;->p:Ljava/lang/Object;

    move-object v6, v1

    check-cast v6, Ly6/c;

    move-object/from16 v17, p1

    check-cast v17, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v18

    iget-object v2, v0, Landroidx/navigation/compose/l;->b:Landroidx/navigation/NavHostController;

    iget-object v3, v0, Landroidx/navigation/compose/l;->c:Ly6/c;

    iget-object v4, v0, Landroidx/navigation/compose/l;->d:Landroidx/compose/ui/Modifier;

    iget-object v5, v0, Landroidx/navigation/compose/l;->e:Landroidx/compose/ui/Alignment;

    iget-object v7, v0, Landroidx/navigation/compose/l;->f:Ljava/util/Map;

    iget-object v8, v0, Landroidx/navigation/compose/l;->g:Lr6/c;

    iget-object v9, v0, Landroidx/navigation/compose/l;->h:Lr6/c;

    iget-object v10, v0, Landroidx/navigation/compose/l;->i:Lr6/c;

    iget-object v11, v0, Landroidx/navigation/compose/l;->j:Lr6/c;

    iget-object v12, v0, Landroidx/navigation/compose/l;->k:Lr6/c;

    iget-object v13, v0, Landroidx/navigation/compose/l;->l:Lr6/c;

    iget v14, v0, Landroidx/navigation/compose/l;->m:I

    iget v15, v0, Landroidx/navigation/compose/l;->n:I

    iget v1, v0, Landroidx/navigation/compose/l;->o:I

    move/from16 v16, v1

    invoke-static/range {v2 .. v18}, Landroidx/navigation/compose/NavHostKt;->h(Landroidx/navigation/NavHostController;Ly6/c;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Ly6/c;Ljava/util/Map;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;IIILandroidx/compose/runtime/Composer;I)Ld6/s;

    move-result-object v1

    return-object v1

    :pswitch_0
    move-object/from16 v17, p1

    check-cast v17, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v18

    iget-object v2, v0, Landroidx/navigation/compose/l;->b:Landroidx/navigation/NavHostController;

    iget-object v3, v0, Landroidx/navigation/compose/l;->p:Ljava/lang/Object;

    iget-object v4, v0, Landroidx/navigation/compose/l;->d:Landroidx/compose/ui/Modifier;

    iget-object v5, v0, Landroidx/navigation/compose/l;->e:Landroidx/compose/ui/Alignment;

    iget-object v6, v0, Landroidx/navigation/compose/l;->c:Ly6/c;

    iget-object v7, v0, Landroidx/navigation/compose/l;->f:Ljava/util/Map;

    iget-object v8, v0, Landroidx/navigation/compose/l;->g:Lr6/c;

    iget-object v9, v0, Landroidx/navigation/compose/l;->h:Lr6/c;

    iget-object v10, v0, Landroidx/navigation/compose/l;->i:Lr6/c;

    iget-object v11, v0, Landroidx/navigation/compose/l;->j:Lr6/c;

    iget-object v12, v0, Landroidx/navigation/compose/l;->k:Lr6/c;

    iget-object v13, v0, Landroidx/navigation/compose/l;->l:Lr6/c;

    iget v14, v0, Landroidx/navigation/compose/l;->m:I

    iget v15, v0, Landroidx/navigation/compose/l;->n:I

    iget v1, v0, Landroidx/navigation/compose/l;->o:I

    move/from16 v16, v1

    invoke-static/range {v2 .. v18}, Landroidx/navigation/compose/NavHostKt;->g(Landroidx/navigation/NavHostController;Ljava/lang/Object;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Ly6/c;Ljava/util/Map;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;IIILandroidx/compose/runtime/Composer;I)Ld6/s;

    move-result-object v1

    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
