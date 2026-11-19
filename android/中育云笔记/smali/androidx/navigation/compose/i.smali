.class public final synthetic Landroidx/navigation/compose/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# instance fields
.field public final synthetic c:Landroidx/navigation/NavBackStackEntry;

.field public final synthetic d:Landroidx/compose/runtime/saveable/SaveableStateHolder;

.field public final synthetic e:Lhd/p;

.field public final synthetic f:I


# direct methods
.method public synthetic constructor <init>(Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/saveable/SaveableStateHolder;Lhd/p;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/navigation/compose/i;->c:Landroidx/navigation/NavBackStackEntry;

    iput-object p2, p0, Landroidx/navigation/compose/i;->d:Landroidx/compose/runtime/saveable/SaveableStateHolder;

    iput-object p3, p0, Landroidx/navigation/compose/i;->e:Lhd/p;

    iput p4, p0, Landroidx/navigation/compose/i;->f:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, Landroidx/navigation/compose/i;->c:Landroidx/navigation/NavBackStackEntry;

    iget-object v1, p0, Landroidx/navigation/compose/i;->d:Landroidx/compose/runtime/saveable/SaveableStateHolder;

    iget-object v2, p0, Landroidx/navigation/compose/i;->e:Lhd/p;

    iget v3, p0, Landroidx/navigation/compose/i;->f:I

    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-static/range {v0 .. v5}, Landroidx/navigation/compose/NavBackStackEntryProviderKt;->c(Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/saveable/SaveableStateHolder;Lhd/p;ILandroidx/compose/runtime/Composer;I)Lqc/q;

    move-result-object p1

    return-object p1
.end method
