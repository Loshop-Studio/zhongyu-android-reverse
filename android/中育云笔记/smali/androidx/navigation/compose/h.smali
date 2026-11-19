.class public final synthetic Landroidx/navigation/compose/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# instance fields
.field public final synthetic c:Landroidx/compose/runtime/saveable/SaveableStateHolder;

.field public final synthetic d:Lhd/p;

.field public final synthetic e:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/runtime/saveable/SaveableStateHolder;Lhd/p;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/navigation/compose/h;->c:Landroidx/compose/runtime/saveable/SaveableStateHolder;

    iput-object p2, p0, Landroidx/navigation/compose/h;->d:Lhd/p;

    iput p3, p0, Landroidx/navigation/compose/h;->e:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/navigation/compose/h;->c:Landroidx/compose/runtime/saveable/SaveableStateHolder;

    iget-object v1, p0, Landroidx/navigation/compose/h;->d:Lhd/p;

    iget v2, p0, Landroidx/navigation/compose/h;->e:I

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, v2, p1, p2}, Landroidx/navigation/compose/NavBackStackEntryProviderKt;->b(Landroidx/compose/runtime/saveable/SaveableStateHolder;Lhd/p;ILandroidx/compose/runtime/Composer;I)Lqc/q;

    move-result-object p1

    return-object p1
.end method
