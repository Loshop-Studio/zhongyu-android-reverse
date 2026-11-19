.class final Landroidx/compose/material3/NavigationRailKt$NavigationRailItemLayout$1$2$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material3/NavigationRailKt;->NavigationRailItemLayout(Lhd/p;Lhd/p;Lhd/p;Lhd/p;ZLhd/a;Landroidx/compose/runtime/Composer;I)V
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
.field final synthetic $alwaysShowLabel:Z

.field final synthetic $animationProgress:Lhd/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/a;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(ZLhd/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lhd/a;",
            ")V"
        }
    .end annotation

    .line 1
    iput-boolean p1, p0, Landroidx/compose/material3/NavigationRailKt$NavigationRailItemLayout$1$2$1;->$alwaysShowLabel:Z

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/material3/NavigationRailKt$NavigationRailItemLayout$1$2$1;->$animationProgress:Lhd/a;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/ui/graphics/GraphicsLayerScope;

    invoke-virtual {p0, p1}, Landroidx/compose/material3/NavigationRailKt$NavigationRailItemLayout$1$2$1;->invoke(Landroidx/compose/ui/graphics/GraphicsLayerScope;)V

    sget-object p1, Lqc/q;->a:Lqc/q;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/ui/graphics/GraphicsLayerScope;)V
    .locals 1

    .line 2
    iget-boolean v0, p0, Landroidx/compose/material3/NavigationRailKt$NavigationRailItemLayout$1$2$1;->$alwaysShowLabel:Z

    if-eqz v0, :cond_0

    const/high16 v0, 0x3f800000    # 1.0f

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/compose/material3/NavigationRailKt$NavigationRailItemLayout$1$2$1;->$animationProgress:Lhd/a;

    invoke-interface {v0}, Lhd/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    :goto_0
    invoke-interface {p1, v0}, Landroidx/compose/ui/graphics/GraphicsLayerScope;->setAlpha(F)V

    return-void
.end method
