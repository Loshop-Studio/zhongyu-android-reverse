.class public final synthetic La;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/graphics/Shape;

.field public final synthetic b:F

.field public final synthetic c:F

.field public final synthetic d:F

.field public final synthetic e:Landroidx/compose/ui/graphics/Brush;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/graphics/Shape;FFFLandroidx/compose/ui/graphics/Brush;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La;->a:Landroidx/compose/ui/graphics/Shape;

    iput p2, p0, La;->b:F

    iput p3, p0, La;->c:F

    iput p4, p0, La;->d:F

    iput-object p5, p0, La;->e:Landroidx/compose/ui/graphics/Brush;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-object v0, p0, La;->a:Landroidx/compose/ui/graphics/Shape;

    iget v1, p0, La;->b:F

    iget v2, p0, La;->c:F

    iget v3, p0, La;->d:F

    iget-object v4, p0, La;->e:Landroidx/compose/ui/graphics/Brush;

    move-object v5, p1

    check-cast v5, Landroidx/compose/ui/Modifier;

    move-object v6, p2

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v0 .. v7}, LDashedBorderKt;->b(Landroidx/compose/ui/graphics/Shape;FFFLandroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object p1

    return-object p1
.end method
