.class public final Landroidx/constraintlayout/compose/VerticalChainScope;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Landroidx/compose/foundation/layout/LayoutScopeMarker;
.end annotation

.annotation build Landroidx/compose/runtime/Stable;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B\u0017\u0008\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0014\u0010\u0002\u001a\u00020\u0001X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0011\u0010\u000c\u001a\u00020\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\t\u00a8\u0006\u0012"
    }
    d2 = {
        "Landroidx/constraintlayout/compose/VerticalChainScope;",
        "",
        "id",
        "containerObject",
        "Landroidx/constraintlayout/core/parser/CLObject;",
        "(Ljava/lang/Object;Landroidx/constraintlayout/core/parser/CLObject;)V",
        "bottom",
        "Landroidx/constraintlayout/compose/HorizontalAnchorable;",
        "getBottom",
        "()Landroidx/constraintlayout/compose/HorizontalAnchorable;",
        "getId$constraintlayout_compose_release",
        "()Ljava/lang/Object;",
        "parent",
        "Landroidx/constraintlayout/compose/ConstrainedLayoutReference;",
        "getParent",
        "()Landroidx/constraintlayout/compose/ConstrainedLayoutReference;",
        "top",
        "getTop",
        "constraintlayout-compose_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I


# instance fields
.field private final bottom:Landroidx/constraintlayout/compose/HorizontalAnchorable;

.field private final id:Ljava/lang/Object;

.field private final parent:Landroidx/constraintlayout/compose/ConstrainedLayoutReference;

.field private final top:Landroidx/constraintlayout/compose/HorizontalAnchorable;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Landroidx/constraintlayout/core/parser/CLObject;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/constraintlayout/compose/VerticalChainScope;->id:Ljava/lang/Object;

    .line 5
    .line 6
    new-instance p1, Landroidx/constraintlayout/compose/ConstrainedLayoutReference;

    .line 7
    .line 8
    const-string/jumbo v0, "parent"

    .line 9
    .line 10
    .line 11
    invoke-direct {p1, v0}, Landroidx/constraintlayout/compose/ConstrainedLayoutReference;-><init>(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Landroidx/constraintlayout/compose/VerticalChainScope;->parent:Landroidx/constraintlayout/compose/ConstrainedLayoutReference;

    .line 15
    .line 16
    new-instance p1, Landroidx/constraintlayout/compose/ChainHorizontalAnchorable;

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    invoke-direct {p1, p2, v0}, Landroidx/constraintlayout/compose/ChainHorizontalAnchorable;-><init>(Landroidx/constraintlayout/core/parser/CLObject;I)V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Landroidx/constraintlayout/compose/VerticalChainScope;->top:Landroidx/constraintlayout/compose/HorizontalAnchorable;

    .line 23
    .line 24
    new-instance p1, Landroidx/constraintlayout/compose/ChainHorizontalAnchorable;

    .line 25
    .line 26
    const/4 v0, 0x1

    .line 27
    invoke-direct {p1, p2, v0}, Landroidx/constraintlayout/compose/ChainHorizontalAnchorable;-><init>(Landroidx/constraintlayout/core/parser/CLObject;I)V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Landroidx/constraintlayout/compose/VerticalChainScope;->bottom:Landroidx/constraintlayout/compose/HorizontalAnchorable;

    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public final getBottom()Landroidx/constraintlayout/compose/HorizontalAnchorable;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/VerticalChainScope;->bottom:Landroidx/constraintlayout/compose/HorizontalAnchorable;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getId$constraintlayout_compose_release()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/VerticalChainScope;->id:Ljava/lang/Object;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getParent()Landroidx/constraintlayout/compose/ConstrainedLayoutReference;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/VerticalChainScope;->parent:Landroidx/constraintlayout/compose/ConstrainedLayoutReference;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getTop()Landroidx/constraintlayout/compose/HorizontalAnchorable;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/VerticalChainScope;->top:Landroidx/constraintlayout/compose/HorizontalAnchorable;

    .line 2
    .line 3
    return-object v0
.end method
