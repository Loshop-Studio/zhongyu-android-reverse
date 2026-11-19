.class public final Landroidx/compose/foundation/text/TextFieldCursorKt;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final cursor(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/text/LegacyTextFieldState;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/ui/graphics/Brush;Z)Landroidx/compose/ui/Modifier;
    .locals 0

    .line 1
    if-eqz p5, :cond_0

    .line 2
    .line 3
    new-instance p5, Landroidx/compose/foundation/text/TextFieldCursorKt$cursor$1;

    .line 4
    .line 5
    invoke-direct {p5, p4, p1, p2, p3}, Landroidx/compose/foundation/text/TextFieldCursorKt$cursor$1;-><init>(Landroidx/compose/ui/graphics/Brush;Landroidx/compose/foundation/text/LegacyTextFieldState;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/OffsetMapping;)V

    .line 6
    .line 7
    .line 8
    const/4 p1, 0x1

    .line 9
    const/4 p2, 0x0

    .line 10
    invoke-static {p0, p2, p5, p1, p2}, Landroidx/compose/ui/ComposedModifierKt;->composed$default(Landroidx/compose/ui/Modifier;Lhd/l;Lhd/q;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    :cond_0
    return-object p0
.end method
