.class public final Landroidx/compose/material3/TooltipScopeImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/material3/TooltipScope;


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation


# static fields
.field public static final $stable:I


# instance fields
.field private final getAnchorBounds:Lhd/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/a;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lhd/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/a;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/material3/TooltipScopeImpl;->getAnchorBounds:Lhd/a;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public drawCaret(Landroidx/compose/ui/Modifier;Lhd/p;)Landroidx/compose/ui/Modifier;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lhd/p;",
            ")",
            "Landroidx/compose/ui/Modifier;"
        }
    .end annotation

    .line 1
    new-instance v0, Landroidx/compose/material3/TooltipScopeImpl$drawCaret$1;

    .line 2
    .line 3
    invoke-direct {v0, p2, p0}, Landroidx/compose/material3/TooltipScopeImpl$drawCaret$1;-><init>(Lhd/p;Landroidx/compose/material3/TooltipScopeImpl;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Landroidx/compose/ui/draw/DrawModifierKt;->drawWithCache(Landroidx/compose/ui/Modifier;Lhd/l;)Landroidx/compose/ui/Modifier;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method

.method public final getGetAnchorBounds()Lhd/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lhd/a;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/material3/TooltipScopeImpl;->getAnchorBounds:Lhd/a;

    .line 2
    .line 3
    return-object v0
.end method
