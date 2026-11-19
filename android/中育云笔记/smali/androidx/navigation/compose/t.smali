.class public final synthetic Landroidx/navigation/compose/t;
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

.field public final synthetic m:I

.field public final synthetic n:I


# direct methods
.method public synthetic constructor <init>(Landroidx/navigation/NavHostController;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Ljava/lang/String;Lhd/l;Lhd/l;Lhd/l;Lhd/l;Lhd/l;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/navigation/compose/t;->c:Landroidx/navigation/NavHostController;

    iput-object p2, p0, Landroidx/navigation/compose/t;->d:Ljava/lang/String;

    iput-object p3, p0, Landroidx/navigation/compose/t;->e:Landroidx/compose/ui/Modifier;

    iput-object p4, p0, Landroidx/navigation/compose/t;->f:Landroidx/compose/ui/Alignment;

    iput-object p5, p0, Landroidx/navigation/compose/t;->g:Ljava/lang/String;

    iput-object p6, p0, Landroidx/navigation/compose/t;->h:Lhd/l;

    iput-object p7, p0, Landroidx/navigation/compose/t;->i:Lhd/l;

    iput-object p8, p0, Landroidx/navigation/compose/t;->j:Lhd/l;

    iput-object p9, p0, Landroidx/navigation/compose/t;->k:Lhd/l;

    iput-object p10, p0, Landroidx/navigation/compose/t;->l:Lhd/l;

    iput p11, p0, Landroidx/navigation/compose/t;->m:I

    iput p12, p0, Landroidx/navigation/compose/t;->n:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-object v0, p0, Landroidx/navigation/compose/t;->c:Landroidx/navigation/NavHostController;

    iget-object v1, p0, Landroidx/navigation/compose/t;->d:Ljava/lang/String;

    iget-object v2, p0, Landroidx/navigation/compose/t;->e:Landroidx/compose/ui/Modifier;

    iget-object v3, p0, Landroidx/navigation/compose/t;->f:Landroidx/compose/ui/Alignment;

    iget-object v4, p0, Landroidx/navigation/compose/t;->g:Ljava/lang/String;

    iget-object v5, p0, Landroidx/navigation/compose/t;->h:Lhd/l;

    iget-object v6, p0, Landroidx/navigation/compose/t;->i:Lhd/l;

    iget-object v7, p0, Landroidx/navigation/compose/t;->j:Lhd/l;

    iget-object v8, p0, Landroidx/navigation/compose/t;->k:Lhd/l;

    iget-object v9, p0, Landroidx/navigation/compose/t;->l:Lhd/l;

    iget v10, p0, Landroidx/navigation/compose/t;->m:I

    iget v11, p0, Landroidx/navigation/compose/t;->n:I

    move-object v12, p1

    check-cast v12, Landroidx/compose/runtime/Composer;

    move-object/from16 p1, p2

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v13

    invoke-static/range {v0 .. v13}, Landroidx/navigation/compose/NavHostKt;->u(Landroidx/navigation/NavHostController;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Ljava/lang/String;Lhd/l;Lhd/l;Lhd/l;Lhd/l;Lhd/l;IILandroidx/compose/runtime/Composer;I)Lqc/q;

    move-result-object p1

    return-object p1
.end method
