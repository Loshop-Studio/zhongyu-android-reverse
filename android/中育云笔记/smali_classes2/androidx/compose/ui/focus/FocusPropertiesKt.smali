.class public final Landroidx/compose/ui/focus/FocusPropertiesKt;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final synthetic access$toUsingEnterExitScope(Lhd/l;)Lhd/l;
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/compose/ui/focus/FocusPropertiesKt;->toUsingEnterExitScope(Lhd/l;)Lhd/l;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final focusProperties(Landroidx/compose/ui/Modifier;Lhd/l;)Landroidx/compose/ui/Modifier;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lhd/l;",
            ")",
            "Landroidx/compose/ui/Modifier;"
        }
    .end annotation

    .line 1
    new-instance v0, Landroidx/compose/ui/focus/FocusPropertiesElement;

    .line 2
    .line 3
    new-instance v1, Landroidx/compose/ui/focus/FocusPropertiesKt$sam$androidx_compose_ui_focus_FocusPropertiesScope$0;

    .line 4
    .line 5
    invoke-direct {v1, p1}, Landroidx/compose/ui/focus/FocusPropertiesKt$sam$androidx_compose_ui_focus_FocusPropertiesScope$0;-><init>(Lhd/l;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1}, Landroidx/compose/ui/focus/FocusPropertiesElement;-><init>(Landroidx/compose/ui/focus/FocusPropertiesScope;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p0, v0}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method private static final toUsingEnterExitScope(Lhd/l;)Lhd/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/l;",
            ")",
            "Lhd/l;"
        }
    .end annotation

    .line 1
    new-instance v0, Landroidx/compose/ui/focus/FocusPropertiesKt$toUsingEnterExitScope$1;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Landroidx/compose/ui/focus/FocusPropertiesKt$toUsingEnterExitScope$1;-><init>(Lhd/l;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
