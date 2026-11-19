.class public final synthetic Landroidx/navigation/compose/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# instance fields
.field public final synthetic a:Landroidx/navigation/NavHostController;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Landroidx/compose/ui/Modifier;

.field public final synthetic d:Landroidx/compose/ui/Alignment;

.field public final synthetic e:Ljava/lang/String;

.field public final synthetic f:Lr6/c;

.field public final synthetic g:Lr6/c;

.field public final synthetic h:Lr6/c;

.field public final synthetic i:Lr6/c;

.field public final synthetic j:Lr6/c;

.field public final synthetic k:Lr6/c;

.field public final synthetic l:I

.field public final synthetic m:I

.field public final synthetic n:I


# direct methods
.method public synthetic constructor <init>(Landroidx/navigation/NavHostController;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Ljava/lang/String;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;III)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/navigation/compose/n;->a:Landroidx/navigation/NavHostController;

    iput-object p2, p0, Landroidx/navigation/compose/n;->b:Ljava/lang/String;

    iput-object p3, p0, Landroidx/navigation/compose/n;->c:Landroidx/compose/ui/Modifier;

    iput-object p4, p0, Landroidx/navigation/compose/n;->d:Landroidx/compose/ui/Alignment;

    iput-object p5, p0, Landroidx/navigation/compose/n;->e:Ljava/lang/String;

    iput-object p6, p0, Landroidx/navigation/compose/n;->f:Lr6/c;

    iput-object p7, p0, Landroidx/navigation/compose/n;->g:Lr6/c;

    iput-object p8, p0, Landroidx/navigation/compose/n;->h:Lr6/c;

    iput-object p9, p0, Landroidx/navigation/compose/n;->i:Lr6/c;

    iput-object p10, p0, Landroidx/navigation/compose/n;->j:Lr6/c;

    iput-object p11, p0, Landroidx/navigation/compose/n;->k:Lr6/c;

    iput p12, p0, Landroidx/navigation/compose/n;->l:I

    iput p13, p0, Landroidx/navigation/compose/n;->m:I

    iput p14, p0, Landroidx/navigation/compose/n;->n:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    move-object/from16 v15, p1

    check-cast v15, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v16

    iget-object v1, v0, Landroidx/navigation/compose/n;->a:Landroidx/navigation/NavHostController;

    iget-object v2, v0, Landroidx/navigation/compose/n;->b:Ljava/lang/String;

    iget-object v3, v0, Landroidx/navigation/compose/n;->c:Landroidx/compose/ui/Modifier;

    iget-object v4, v0, Landroidx/navigation/compose/n;->d:Landroidx/compose/ui/Alignment;

    iget-object v5, v0, Landroidx/navigation/compose/n;->e:Ljava/lang/String;

    iget-object v6, v0, Landroidx/navigation/compose/n;->f:Lr6/c;

    iget-object v7, v0, Landroidx/navigation/compose/n;->g:Lr6/c;

    iget-object v8, v0, Landroidx/navigation/compose/n;->h:Lr6/c;

    iget-object v9, v0, Landroidx/navigation/compose/n;->i:Lr6/c;

    iget-object v10, v0, Landroidx/navigation/compose/n;->j:Lr6/c;

    iget-object v11, v0, Landroidx/navigation/compose/n;->k:Lr6/c;

    iget v12, v0, Landroidx/navigation/compose/n;->l:I

    iget v13, v0, Landroidx/navigation/compose/n;->m:I

    iget v14, v0, Landroidx/navigation/compose/n;->n:I

    invoke-static/range {v1 .. v16}, Landroidx/navigation/compose/NavHostKt;->n(Landroidx/navigation/NavHostController;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Ljava/lang/String;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;IIILandroidx/compose/runtime/Composer;I)Ld6/s;

    move-result-object v1

    return-object v1
.end method
