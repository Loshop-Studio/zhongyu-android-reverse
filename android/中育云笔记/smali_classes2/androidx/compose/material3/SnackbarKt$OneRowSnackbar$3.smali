.class final Landroidx/compose/material3/SnackbarKt$OneRowSnackbar$3;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material3/SnackbarKt;->OneRowSnackbar-kKq0p4A(Lhd/p;Lhd/p;Lhd/p;Landroidx/compose/ui/text/TextStyle;JJLandroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lhd/p;"
    }
.end annotation


# instance fields
.field final synthetic $$changed:I

.field final synthetic $action:Lhd/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/p;"
        }
    .end annotation
.end field

.field final synthetic $actionTextColor:J

.field final synthetic $actionTextStyle:Landroidx/compose/ui/text/TextStyle;

.field final synthetic $dismissAction:Lhd/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/p;"
        }
    .end annotation
.end field

.field final synthetic $dismissActionColor:J

.field final synthetic $text:Lhd/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/p;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lhd/p;Lhd/p;Lhd/p;Landroidx/compose/ui/text/TextStyle;JJI)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/p;",
            "Lhd/p;",
            "Lhd/p;",
            "Landroidx/compose/ui/text/TextStyle;",
            "JJI)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/material3/SnackbarKt$OneRowSnackbar$3;->$text:Lhd/p;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/material3/SnackbarKt$OneRowSnackbar$3;->$action:Lhd/p;

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/compose/material3/SnackbarKt$OneRowSnackbar$3;->$dismissAction:Lhd/p;

    .line 6
    .line 7
    iput-object p4, p0, Landroidx/compose/material3/SnackbarKt$OneRowSnackbar$3;->$actionTextStyle:Landroidx/compose/ui/text/TextStyle;

    .line 8
    .line 9
    iput-wide p5, p0, Landroidx/compose/material3/SnackbarKt$OneRowSnackbar$3;->$actionTextColor:J

    .line 10
    .line 11
    iput-wide p7, p0, Landroidx/compose/material3/SnackbarKt$OneRowSnackbar$3;->$dismissActionColor:J

    .line 12
    .line 13
    iput p9, p0, Landroidx/compose/material3/SnackbarKt$OneRowSnackbar$3;->$$changed:I

    .line 14
    .line 15
    const/4 p1, 0x2

    .line 16
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 17
    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroidx/compose/material3/SnackbarKt$OneRowSnackbar$3;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lqc/q;->a:Lqc/q;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 10

    .line 2
    iget-object v0, p0, Landroidx/compose/material3/SnackbarKt$OneRowSnackbar$3;->$text:Lhd/p;

    iget-object v1, p0, Landroidx/compose/material3/SnackbarKt$OneRowSnackbar$3;->$action:Lhd/p;

    iget-object v2, p0, Landroidx/compose/material3/SnackbarKt$OneRowSnackbar$3;->$dismissAction:Lhd/p;

    iget-object v3, p0, Landroidx/compose/material3/SnackbarKt$OneRowSnackbar$3;->$actionTextStyle:Landroidx/compose/ui/text/TextStyle;

    iget-wide v4, p0, Landroidx/compose/material3/SnackbarKt$OneRowSnackbar$3;->$actionTextColor:J

    iget-wide v6, p0, Landroidx/compose/material3/SnackbarKt$OneRowSnackbar$3;->$dismissActionColor:J

    iget p2, p0, Landroidx/compose/material3/SnackbarKt$OneRowSnackbar$3;->$$changed:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v9

    move-object v8, p1

    invoke-static/range {v0 .. v9}, Landroidx/compose/material3/SnackbarKt;->access$OneRowSnackbar-kKq0p4A(Lhd/p;Lhd/p;Lhd/p;Landroidx/compose/ui/text/TextStyle;JJLandroidx/compose/runtime/Composer;I)V

    return-void
.end method
