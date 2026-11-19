.class public final synthetic Landroidx/navigation/compose/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# instance fields
.field public final synthetic a:Landroidx/navigation/NavHostController;

.field public final synthetic b:Landroidx/navigation/NavGraph;

.field public final synthetic c:Landroidx/compose/ui/Modifier;

.field public final synthetic d:Landroidx/compose/ui/Alignment;

.field public final synthetic e:Lr6/c;

.field public final synthetic f:Lr6/c;

.field public final synthetic g:Lr6/c;

.field public final synthetic h:Lr6/c;

.field public final synthetic i:I

.field public final synthetic j:I


# direct methods
.method public synthetic constructor <init>(Landroidx/navigation/NavHostController;Landroidx/navigation/NavGraph;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Lr6/c;Lr6/c;Lr6/c;Lr6/c;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/navigation/compose/m;->a:Landroidx/navigation/NavHostController;

    iput-object p2, p0, Landroidx/navigation/compose/m;->b:Landroidx/navigation/NavGraph;

    iput-object p3, p0, Landroidx/navigation/compose/m;->c:Landroidx/compose/ui/Modifier;

    iput-object p4, p0, Landroidx/navigation/compose/m;->d:Landroidx/compose/ui/Alignment;

    iput-object p5, p0, Landroidx/navigation/compose/m;->e:Lr6/c;

    iput-object p6, p0, Landroidx/navigation/compose/m;->f:Lr6/c;

    iput-object p7, p0, Landroidx/navigation/compose/m;->g:Lr6/c;

    iput-object p8, p0, Landroidx/navigation/compose/m;->h:Lr6/c;

    iput p9, p0, Landroidx/navigation/compose/m;->i:I

    iput p10, p0, Landroidx/navigation/compose/m;->j:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    move-object v10, p1

    check-cast v10, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v11

    iget-object v0, p0, Landroidx/navigation/compose/m;->a:Landroidx/navigation/NavHostController;

    iget-object v1, p0, Landroidx/navigation/compose/m;->b:Landroidx/navigation/NavGraph;

    iget-object v2, p0, Landroidx/navigation/compose/m;->c:Landroidx/compose/ui/Modifier;

    iget-object v3, p0, Landroidx/navigation/compose/m;->d:Landroidx/compose/ui/Alignment;

    iget-object v4, p0, Landroidx/navigation/compose/m;->e:Lr6/c;

    iget-object v5, p0, Landroidx/navigation/compose/m;->f:Lr6/c;

    iget-object v6, p0, Landroidx/navigation/compose/m;->g:Lr6/c;

    iget-object v7, p0, Landroidx/navigation/compose/m;->h:Lr6/c;

    iget v8, p0, Landroidx/navigation/compose/m;->i:I

    iget v9, p0, Landroidx/navigation/compose/m;->j:I

    invoke-static/range {v0 .. v11}, Landroidx/navigation/compose/NavHostKt;->l(Landroidx/navigation/NavHostController;Landroidx/navigation/NavGraph;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Lr6/c;Lr6/c;Lr6/c;Lr6/c;IILandroidx/compose/runtime/Composer;I)Ld6/s;

    move-result-object p1

    return-object p1
.end method
