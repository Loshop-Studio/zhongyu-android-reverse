.class public final synthetic Lc5/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/q;


# instance fields
.field public final synthetic a:Landroidx/compose/runtime/MutableState;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Landroidx/compose/ui/text/TextStyle;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/runtime/MutableState;Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc5/g0;->a:Landroidx/compose/runtime/MutableState;

    iput-object p2, p0, Lc5/g0;->b:Ljava/lang/String;

    iput-object p3, p0, Lc5/g0;->c:Landroidx/compose/ui/text/TextStyle;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, Lc5/g0;->a:Landroidx/compose/runtime/MutableState;

    iget-object v1, p0, Lc5/g0;->b:Ljava/lang/String;

    iget-object v2, p0, Lc5/g0;->c:Landroidx/compose/ui/text/TextStyle;

    move-object v3, p1

    check-cast v3, Lx7/p;

    move-object v4, p2

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-static/range {v0 .. v5}, Lc5/j0;->f(Landroidx/compose/runtime/MutableState;Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;Lx7/p;Landroidx/compose/runtime/Composer;I)Lh7/p;

    move-result-object p1

    return-object p1
.end method
