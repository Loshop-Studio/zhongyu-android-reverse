.class public final synthetic Landroidx/navigation/compose/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroidx/navigation/NavHostController;

.field public final synthetic c:Landroidx/navigation/NavGraph;

.field public final synthetic d:Landroidx/compose/ui/Modifier;

.field public final synthetic e:Landroidx/compose/ui/Alignment;

.field public final synthetic f:Lr6/c;

.field public final synthetic g:Lr6/c;

.field public final synthetic h:Lr6/c;

.field public final synthetic i:Lr6/c;

.field public final synthetic j:Lr6/c;

.field public final synthetic k:I

.field public final synthetic l:I


# direct methods
.method public synthetic constructor <init>(Landroidx/navigation/NavHostController;Landroidx/navigation/NavGraph;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;III)V
    .locals 0

    .line 1
    iput p12, p0, Landroidx/navigation/compose/o;->a:I

    iput-object p1, p0, Landroidx/navigation/compose/o;->b:Landroidx/navigation/NavHostController;

    iput-object p2, p0, Landroidx/navigation/compose/o;->c:Landroidx/navigation/NavGraph;

    iput-object p3, p0, Landroidx/navigation/compose/o;->d:Landroidx/compose/ui/Modifier;

    iput-object p4, p0, Landroidx/navigation/compose/o;->e:Landroidx/compose/ui/Alignment;

    iput-object p5, p0, Landroidx/navigation/compose/o;->f:Lr6/c;

    iput-object p6, p0, Landroidx/navigation/compose/o;->g:Lr6/c;

    iput-object p7, p0, Landroidx/navigation/compose/o;->h:Lr6/c;

    iput-object p8, p0, Landroidx/navigation/compose/o;->i:Lr6/c;

    iput-object p9, p0, Landroidx/navigation/compose/o;->j:Lr6/c;

    iput p10, p0, Landroidx/navigation/compose/o;->k:I

    iput p11, p0, Landroidx/navigation/compose/o;->l:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget v0, p0, Landroidx/navigation/compose/o;->a:I

    packed-switch v0, :pswitch_data_0

    move-object v12, p1

    check-cast v12, Landroidx/compose/runtime/Composer;

    move-object/from16 p1, p2

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v13

    iget-object v1, p0, Landroidx/navigation/compose/o;->b:Landroidx/navigation/NavHostController;

    iget-object v2, p0, Landroidx/navigation/compose/o;->c:Landroidx/navigation/NavGraph;

    iget-object v3, p0, Landroidx/navigation/compose/o;->d:Landroidx/compose/ui/Modifier;

    iget-object v4, p0, Landroidx/navigation/compose/o;->e:Landroidx/compose/ui/Alignment;

    iget-object v5, p0, Landroidx/navigation/compose/o;->f:Lr6/c;

    iget-object v6, p0, Landroidx/navigation/compose/o;->g:Lr6/c;

    iget-object v7, p0, Landroidx/navigation/compose/o;->h:Lr6/c;

    iget-object v8, p0, Landroidx/navigation/compose/o;->i:Lr6/c;

    iget-object v9, p0, Landroidx/navigation/compose/o;->j:Lr6/c;

    iget v10, p0, Landroidx/navigation/compose/o;->k:I

    iget v11, p0, Landroidx/navigation/compose/o;->l:I

    invoke-static/range {v1 .. v13}, Landroidx/navigation/compose/NavHostKt;->e(Landroidx/navigation/NavHostController;Landroidx/navigation/NavGraph;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;IILandroidx/compose/runtime/Composer;I)Ld6/s;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v11, p1

    check-cast v11, Landroidx/compose/runtime/Composer;

    move-object/from16 p1, p2

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v12

    iget-object v0, p0, Landroidx/navigation/compose/o;->b:Landroidx/navigation/NavHostController;

    iget-object v1, p0, Landroidx/navigation/compose/o;->c:Landroidx/navigation/NavGraph;

    iget-object v2, p0, Landroidx/navigation/compose/o;->d:Landroidx/compose/ui/Modifier;

    iget-object v3, p0, Landroidx/navigation/compose/o;->e:Landroidx/compose/ui/Alignment;

    iget-object v4, p0, Landroidx/navigation/compose/o;->f:Lr6/c;

    iget-object v5, p0, Landroidx/navigation/compose/o;->g:Lr6/c;

    iget-object v6, p0, Landroidx/navigation/compose/o;->h:Lr6/c;

    iget-object v7, p0, Landroidx/navigation/compose/o;->i:Lr6/c;

    iget-object v8, p0, Landroidx/navigation/compose/o;->j:Lr6/c;

    iget v9, p0, Landroidx/navigation/compose/o;->k:I

    iget v10, p0, Landroidx/navigation/compose/o;->l:I

    invoke-static/range {v0 .. v12}, Landroidx/navigation/compose/NavHostKt;->f(Landroidx/navigation/NavHostController;Landroidx/navigation/NavGraph;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;IILandroidx/compose/runtime/Composer;I)Ld6/s;

    move-result-object p1

    return-object p1

    :pswitch_1
    move-object v11, p1

    check-cast v11, Landroidx/compose/runtime/Composer;

    move-object/from16 p1, p2

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v12

    iget-object v0, p0, Landroidx/navigation/compose/o;->b:Landroidx/navigation/NavHostController;

    iget-object v1, p0, Landroidx/navigation/compose/o;->c:Landroidx/navigation/NavGraph;

    iget-object v2, p0, Landroidx/navigation/compose/o;->d:Landroidx/compose/ui/Modifier;

    iget-object v3, p0, Landroidx/navigation/compose/o;->e:Landroidx/compose/ui/Alignment;

    iget-object v4, p0, Landroidx/navigation/compose/o;->f:Lr6/c;

    iget-object v5, p0, Landroidx/navigation/compose/o;->g:Lr6/c;

    iget-object v6, p0, Landroidx/navigation/compose/o;->h:Lr6/c;

    iget-object v7, p0, Landroidx/navigation/compose/o;->i:Lr6/c;

    iget-object v8, p0, Landroidx/navigation/compose/o;->j:Lr6/c;

    iget v9, p0, Landroidx/navigation/compose/o;->k:I

    iget v10, p0, Landroidx/navigation/compose/o;->l:I

    invoke-static/range {v0 .. v12}, Landroidx/navigation/compose/NavHostKt;->i(Landroidx/navigation/NavHostController;Landroidx/navigation/NavGraph;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;IILandroidx/compose/runtime/Composer;I)Ld6/s;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
