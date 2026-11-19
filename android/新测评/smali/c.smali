.class public final synthetic Lc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lkotlin/jvm/internal/Ref$ObjectRef;

.field public final synthetic b:Lkotlin/jvm/internal/Ref$ObjectRef;

.field public final synthetic c:Lkotlin/jvm/internal/Ref$ObjectRef;

.field public final synthetic d:Landroidx/compose/ui/graphics/Brush;

.field public final synthetic e:Lkotlin/jvm/internal/Ref$FloatRef;

.field public final synthetic f:Lkotlin/jvm/internal/Ref$ObjectRef;

.field public final synthetic g:Landroidx/compose/ui/graphics/Outline;

.field public final synthetic h:F

.field public final synthetic i:F


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/internal/Ref$ObjectRef;Landroidx/compose/ui/graphics/Brush;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$ObjectRef;Landroidx/compose/ui/graphics/Outline;FF)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc;->a:Lkotlin/jvm/internal/Ref$ObjectRef;

    iput-object p2, p0, Lc;->b:Lkotlin/jvm/internal/Ref$ObjectRef;

    iput-object p3, p0, Lc;->c:Lkotlin/jvm/internal/Ref$ObjectRef;

    iput-object p4, p0, Lc;->d:Landroidx/compose/ui/graphics/Brush;

    iput-object p5, p0, Lc;->e:Lkotlin/jvm/internal/Ref$FloatRef;

    iput-object p6, p0, Lc;->f:Lkotlin/jvm/internal/Ref$ObjectRef;

    iput-object p7, p0, Lc;->g:Landroidx/compose/ui/graphics/Outline;

    iput p8, p0, Lc;->h:F

    iput p9, p0, Lc;->i:F

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-object v0, p0, Lc;->a:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v1, p0, Lc;->b:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v2, p0, Lc;->c:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v3, p0, Lc;->d:Landroidx/compose/ui/graphics/Brush;

    iget-object v4, p0, Lc;->e:Lkotlin/jvm/internal/Ref$FloatRef;

    iget-object v5, p0, Lc;->f:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v6, p0, Lc;->g:Landroidx/compose/ui/graphics/Outline;

    iget v7, p0, Lc;->h:F

    iget v8, p0, Lc;->i:F

    move-object v9, p1

    check-cast v9, Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;

    invoke-static/range {v0 .. v9}, LDashedBorderKt;->c(Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/internal/Ref$ObjectRef;Landroidx/compose/ui/graphics/Brush;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$ObjectRef;Landroidx/compose/ui/graphics/Outline;FFLandroidx/compose/ui/graphics/drawscope/ContentDrawScope;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
