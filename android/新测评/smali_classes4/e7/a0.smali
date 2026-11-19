.class public final synthetic Le7/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln9/b;


# instance fields
.field public final synthetic a:Landroidx/compose/runtime/State;

.field public final synthetic b:Landroidx/compose/runtime/State;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le7/a0;->a:Landroidx/compose/runtime/State;

    iput-object p2, p0, Le7/a0;->b:Landroidx/compose/runtime/State;

    return-void
.end method


# virtual methods
.method public final a(Lorg/angmarch/views/NiceSpinner;Landroid/view/View;IJ)V
    .locals 7

    .line 1
    iget-object v0, p0, Le7/a0;->a:Landroidx/compose/runtime/State;

    iget-object v1, p0, Le7/a0;->b:Landroidx/compose/runtime/State;

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move-wide v5, p4

    invoke-static/range {v0 .. v6}, Le7/b0;->b(Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;Lorg/angmarch/views/NiceSpinner;Landroid/view/View;IJ)V

    return-void
.end method
