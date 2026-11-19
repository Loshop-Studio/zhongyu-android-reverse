.class public final synthetic Landroidx/navigation/compose/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:Landroidx/compose/runtime/snapshots/SnapshotStateList;

.field public final synthetic d:Landroidx/navigation/NavBackStackEntry;

.field public final synthetic e:Landroidx/navigation/compose/DialogNavigator;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/runtime/snapshots/SnapshotStateList;Landroidx/navigation/NavBackStackEntry;Landroidx/navigation/compose/DialogNavigator;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/navigation/compose/f;->c:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    iput-object p2, p0, Landroidx/navigation/compose/f;->d:Landroidx/navigation/NavBackStackEntry;

    iput-object p3, p0, Landroidx/navigation/compose/f;->e:Landroidx/navigation/compose/DialogNavigator;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/navigation/compose/f;->c:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    iget-object v1, p0, Landroidx/navigation/compose/f;->d:Landroidx/navigation/NavBackStackEntry;

    iget-object v2, p0, Landroidx/navigation/compose/f;->e:Landroidx/navigation/compose/DialogNavigator;

    check-cast p1, Landroidx/compose/runtime/DisposableEffectScope;

    invoke-static {v0, v1, v2, p1}, Landroidx/navigation/compose/DialogHostKt$DialogHost$1$2;->a(Landroidx/compose/runtime/snapshots/SnapshotStateList;Landroidx/navigation/NavBackStackEntry;Landroidx/navigation/compose/DialogNavigator;Landroidx/compose/runtime/DisposableEffectScope;)Landroidx/compose/runtime/DisposableEffectResult;

    move-result-object p1

    return-object p1
.end method
