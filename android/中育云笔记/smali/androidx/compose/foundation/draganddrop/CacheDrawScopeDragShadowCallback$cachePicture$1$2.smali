.class final Landroidx/compose/foundation/draganddrop/CacheDrawScopeDragShadowCallback$cachePicture$1$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/draganddrop/CacheDrawScopeDragShadowCallback;->cachePicture(Landroidx/compose/ui/draw/CacheDrawScope;)Landroidx/compose/ui/draw/DrawResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lhd/l;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Landroidx/compose/foundation/draganddrop/CacheDrawScopeDragShadowCallback;


# direct methods
.method public constructor <init>(Landroidx/compose/foundation/draganddrop/CacheDrawScopeDragShadowCallback;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/draganddrop/CacheDrawScopeDragShadowCallback$cachePicture$1$2;->this$0:Landroidx/compose/foundation/draganddrop/CacheDrawScopeDragShadowCallback;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/draganddrop/CacheDrawScopeDragShadowCallback$cachePicture$1$2;->invoke(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V

    sget-object p1, Lqc/q;->a:Lqc/q;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V
    .locals 1

    .line 2
    iget-object v0, p0, Landroidx/compose/foundation/draganddrop/CacheDrawScopeDragShadowCallback$cachePicture$1$2;->this$0:Landroidx/compose/foundation/draganddrop/CacheDrawScopeDragShadowCallback;

    invoke-static {v0}, Landroidx/compose/foundation/draganddrop/CacheDrawScopeDragShadowCallback;->access$getGraphicsLayer$p(Landroidx/compose/foundation/draganddrop/CacheDrawScopeDragShadowCallback;)Landroidx/compose/ui/graphics/layer/GraphicsLayer;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    invoke-static {p1, v0}, Landroidx/compose/ui/graphics/layer/GraphicsLayerKt;->drawLayer(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V

    return-void
.end method
