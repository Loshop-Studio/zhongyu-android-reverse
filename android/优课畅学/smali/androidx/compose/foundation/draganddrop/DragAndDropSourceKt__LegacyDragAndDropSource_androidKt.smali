.class final synthetic Landroidx/compose/foundation/draganddrop/DragAndDropSourceKt__LegacyDragAndDropSource_androidKt;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final dragAndDropSource(Landroidx/compose/ui/Modifier;Lx7/l;Lx7/p;)Landroidx/compose/ui/Modifier;
    .locals 1
    .annotation build Landroidx/compose/foundation/ExperimentalFoundationApi;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lx7/l;",
            "Lx7/p;",
            ")",
            "Landroidx/compose/ui/Modifier;"
        }
    .end annotation

    .annotation runtime Lh7/a;
    .end annotation

    .line 1
    new-instance v0, Landroidx/compose/foundation/draganddrop/LegacyDragAndDropSourceElement;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Landroidx/compose/foundation/draganddrop/LegacyDragAndDropSourceElement;-><init>(Lx7/l;Lx7/p;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0, v0}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method
