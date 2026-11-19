.class public final synthetic Landroidx/navigation/compose/e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# instance fields
.field public final synthetic c:Landroidx/navigation/NavHostController;

.field public final synthetic d:Landroidx/navigation/NavGraph;

.field public final synthetic e:Landroidx/compose/ui/Modifier;

.field public final synthetic f:I

.field public final synthetic g:I


# direct methods
.method public synthetic constructor <init>(Landroidx/navigation/NavHostController;Landroidx/navigation/NavGraph;Landroidx/compose/ui/Modifier;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/navigation/compose/e0;->c:Landroidx/navigation/NavHostController;

    iput-object p2, p0, Landroidx/navigation/compose/e0;->d:Landroidx/navigation/NavGraph;

    iput-object p3, p0, Landroidx/navigation/compose/e0;->e:Landroidx/compose/ui/Modifier;

    iput p4, p0, Landroidx/navigation/compose/e0;->f:I

    iput p5, p0, Landroidx/navigation/compose/e0;->g:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, Landroidx/navigation/compose/e0;->c:Landroidx/navigation/NavHostController;

    iget-object v1, p0, Landroidx/navigation/compose/e0;->d:Landroidx/navigation/NavGraph;

    iget-object v2, p0, Landroidx/navigation/compose/e0;->e:Landroidx/compose/ui/Modifier;

    iget v3, p0, Landroidx/navigation/compose/e0;->f:I

    iget v4, p0, Landroidx/navigation/compose/e0;->g:I

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static/range {v0 .. v6}, Landroidx/navigation/compose/NavHostKt;->v(Landroidx/navigation/NavHostController;Landroidx/navigation/NavGraph;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Lqc/q;

    move-result-object p1

    return-object p1
.end method
