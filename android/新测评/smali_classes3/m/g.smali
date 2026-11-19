.class public final synthetic Lm/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/graphics/painter/Painter;

.field public final synthetic b:Landroidx/compose/ui/graphics/painter/Painter;

.field public final synthetic c:Landroidx/compose/ui/graphics/painter/Painter;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/graphics/painter/Painter;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm/g;->a:Landroidx/compose/ui/graphics/painter/Painter;

    iput-object p2, p0, Lm/g;->b:Landroidx/compose/ui/graphics/painter/Painter;

    iput-object p3, p0, Lm/g;->c:Landroidx/compose/ui/graphics/painter/Painter;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lm/g;->a:Landroidx/compose/ui/graphics/painter/Painter;

    iget-object v1, p0, Lm/g;->b:Landroidx/compose/ui/graphics/painter/Painter;

    iget-object v2, p0, Lm/g;->c:Landroidx/compose/ui/graphics/painter/Painter;

    check-cast p1, Lcoil3/compose/AsyncImagePainter$c;

    invoke-static {v0, v1, v2, p1}, Lm/j;->b(Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/graphics/painter/Painter;Lcoil3/compose/AsyncImagePainter$c;)Lcoil3/compose/AsyncImagePainter$c;

    move-result-object p1

    return-object p1
.end method
