.class public final synthetic Landroidx/navigation/compose/e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Landroidx/navigation/NavHostController;

.field public final synthetic b:Landroidx/navigation/NavGraph;

.field public final synthetic c:Landroidx/compose/ui/Modifier;

.field public final synthetic d:I

.field public final synthetic e:I


# direct methods
.method public synthetic constructor <init>(Landroidx/navigation/NavHostController;Landroidx/navigation/NavGraph;Landroidx/compose/ui/Modifier;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/navigation/compose/e0;->a:Landroidx/navigation/NavHostController;

    iput-object p2, p0, Landroidx/navigation/compose/e0;->b:Landroidx/navigation/NavGraph;

    iput-object p3, p0, Landroidx/navigation/compose/e0;->c:Landroidx/compose/ui/Modifier;

    iput p4, p0, Landroidx/navigation/compose/e0;->d:I

    iput p5, p0, Landroidx/navigation/compose/e0;->e:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, Landroidx/navigation/compose/e0;->a:Landroidx/navigation/NavHostController;

    iget-object v1, p0, Landroidx/navigation/compose/e0;->b:Landroidx/navigation/NavGraph;

    iget-object v2, p0, Landroidx/navigation/compose/e0;->c:Landroidx/compose/ui/Modifier;

    iget v3, p0, Landroidx/navigation/compose/e0;->d:I

    iget v4, p0, Landroidx/navigation/compose/e0;->e:I

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static/range {v0 .. v6}, Landroidx/navigation/compose/NavHostKt;->v(Landroidx/navigation/NavHostController;Landroidx/navigation/NavGraph;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
