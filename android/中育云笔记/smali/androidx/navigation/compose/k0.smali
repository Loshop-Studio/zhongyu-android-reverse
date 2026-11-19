.class public final synthetic Landroidx/navigation/compose/k0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# instance fields
.field public final synthetic c:Landroidx/navigation/NavHostController;

.field public final synthetic d:Landroidx/navigation/NavGraph;

.field public final synthetic e:Landroidx/compose/ui/Modifier;

.field public final synthetic f:Landroidx/compose/ui/Alignment;

.field public final synthetic g:Lhd/l;

.field public final synthetic h:Lhd/l;

.field public final synthetic i:Lhd/l;

.field public final synthetic j:Lhd/l;

.field public final synthetic k:Lhd/l;

.field public final synthetic l:I

.field public final synthetic m:I


# direct methods
.method public synthetic constructor <init>(Landroidx/navigation/NavHostController;Landroidx/navigation/NavGraph;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Lhd/l;Lhd/l;Lhd/l;Lhd/l;Lhd/l;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/navigation/compose/k0;->c:Landroidx/navigation/NavHostController;

    iput-object p2, p0, Landroidx/navigation/compose/k0;->d:Landroidx/navigation/NavGraph;

    iput-object p3, p0, Landroidx/navigation/compose/k0;->e:Landroidx/compose/ui/Modifier;

    iput-object p4, p0, Landroidx/navigation/compose/k0;->f:Landroidx/compose/ui/Alignment;

    iput-object p5, p0, Landroidx/navigation/compose/k0;->g:Lhd/l;

    iput-object p6, p0, Landroidx/navigation/compose/k0;->h:Lhd/l;

    iput-object p7, p0, Landroidx/navigation/compose/k0;->i:Lhd/l;

    iput-object p8, p0, Landroidx/navigation/compose/k0;->j:Lhd/l;

    iput-object p9, p0, Landroidx/navigation/compose/k0;->k:Lhd/l;

    iput p10, p0, Landroidx/navigation/compose/k0;->l:I

    iput p11, p0, Landroidx/navigation/compose/k0;->m:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-object v0, p0, Landroidx/navigation/compose/k0;->c:Landroidx/navigation/NavHostController;

    iget-object v1, p0, Landroidx/navigation/compose/k0;->d:Landroidx/navigation/NavGraph;

    iget-object v2, p0, Landroidx/navigation/compose/k0;->e:Landroidx/compose/ui/Modifier;

    iget-object v3, p0, Landroidx/navigation/compose/k0;->f:Landroidx/compose/ui/Alignment;

    iget-object v4, p0, Landroidx/navigation/compose/k0;->g:Lhd/l;

    iget-object v5, p0, Landroidx/navigation/compose/k0;->h:Lhd/l;

    iget-object v6, p0, Landroidx/navigation/compose/k0;->i:Lhd/l;

    iget-object v7, p0, Landroidx/navigation/compose/k0;->j:Lhd/l;

    iget-object v8, p0, Landroidx/navigation/compose/k0;->k:Lhd/l;

    iget v9, p0, Landroidx/navigation/compose/k0;->l:I

    iget v10, p0, Landroidx/navigation/compose/k0;->m:I

    move-object v11, p1

    check-cast v11, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v12

    invoke-static/range {v0 .. v12}, Landroidx/navigation/compose/NavHostKt;->f(Landroidx/navigation/NavHostController;Landroidx/navigation/NavGraph;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Lhd/l;Lhd/l;Lhd/l;Lhd/l;Lhd/l;IILandroidx/compose/runtime/Composer;I)Lqc/q;

    move-result-object p1

    return-object p1
.end method
