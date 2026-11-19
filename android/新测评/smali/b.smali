.class public final synthetic Lb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


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

    iput-object p1, p0, Lb;->a:Landroidx/compose/ui/graphics/Shape;

    iput p2, p0, Lb;->b:F

    iput p3, p0, Lb;->c:F

    iput p4, p0, Lb;->d:F

    iput-object p5, p0, Lb;->e:Landroidx/compose/ui/graphics/Brush;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, Lb;->a:Landroidx/compose/ui/graphics/Shape;

    iget v1, p0, Lb;->b:F

    iget v2, p0, Lb;->c:F

    iget v3, p0, Lb;->d:F

    iget-object v4, p0, Lb;->e:Landroidx/compose/ui/graphics/Brush;

    move-object v5, p1

    check-cast v5, Landroidx/compose/ui/draw/CacheDrawScope;

    invoke-static/range {v0 .. v5}, LDashedBorderKt;->a(Landroidx/compose/ui/graphics/Shape;FFFLandroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/draw/CacheDrawScope;)Landroidx/compose/ui/draw/DrawResult;

    move-result-object p1

    return-object p1
.end method
