.class final Landroidx/compose/material3/TooltipScopeImpl$drawCaret$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material3/TooltipScopeImpl;->drawCaret(Landroidx/compose/ui/Modifier;Lhd/p;)Landroidx/compose/ui/Modifier;
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
.field final synthetic $draw:Lhd/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/p;"
        }
    .end annotation
.end field

.field final synthetic this$0:Landroidx/compose/material3/TooltipScopeImpl;


# direct methods
.method public constructor <init>(Lhd/p;Landroidx/compose/material3/TooltipScopeImpl;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/p;",
            "Landroidx/compose/material3/TooltipScopeImpl;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/material3/TooltipScopeImpl$drawCaret$1;->$draw:Lhd/p;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/material3/TooltipScopeImpl$drawCaret$1;->this$0:Landroidx/compose/material3/TooltipScopeImpl;

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
.method public final invoke(Landroidx/compose/ui/draw/CacheDrawScope;)Landroidx/compose/ui/draw/DrawResult;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/material3/TooltipScopeImpl$drawCaret$1;->$draw:Lhd/p;

    iget-object v1, p0, Landroidx/compose/material3/TooltipScopeImpl$drawCaret$1;->this$0:Landroidx/compose/material3/TooltipScopeImpl;

    invoke-virtual {v1}, Landroidx/compose/material3/TooltipScopeImpl;->getGetAnchorBounds()Lhd/a;

    move-result-object v1

    invoke-interface {v1}, Lhd/a;->invoke()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Lhd/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/compose/ui/draw/DrawResult;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Landroidx/compose/ui/draw/CacheDrawScope;

    invoke-virtual {p0, p1}, Landroidx/compose/material3/TooltipScopeImpl$drawCaret$1;->invoke(Landroidx/compose/ui/draw/CacheDrawScope;)Landroidx/compose/ui/draw/DrawResult;

    move-result-object p1

    return-object p1
.end method
