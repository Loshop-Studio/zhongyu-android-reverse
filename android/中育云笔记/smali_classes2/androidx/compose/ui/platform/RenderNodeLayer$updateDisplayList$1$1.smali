.class final Landroidx/compose/ui/platform/RenderNodeLayer$updateDisplayList$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/platform/RenderNodeLayer;->updateDisplayList()V
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
.field final synthetic $drawBlock:Lhd/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/p;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lhd/p;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/p;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/platform/RenderNodeLayer$updateDisplayList$1$1;->$drawBlock:Lhd/p;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/ui/graphics/Canvas;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/RenderNodeLayer$updateDisplayList$1$1;->invoke(Landroidx/compose/ui/graphics/Canvas;)V

    sget-object p1, Lqc/q;->a:Lqc/q;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/ui/graphics/Canvas;)V
    .locals 2

    .line 2
    iget-object v0, p0, Landroidx/compose/ui/platform/RenderNodeLayer$updateDisplayList$1$1;->$drawBlock:Lhd/p;

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Lhd/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
