.class public final Landroidx/constraintlayout/compose/ConstrainedLayoutReference;
.super Landroidx/constraintlayout/compose/LayoutReference;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/Stable;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u000f\u0008\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001c\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\t\u0010\nR\u001c\u0010\u000b\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u000c\u0010\u0008\u001a\u0004\u0008\r\u0010\nR\u001c\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u0010\u0010\u0008\u001a\u0004\u0008\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u00020\u00148\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u0015\u0010\u0008\u001a\u0004\u0008\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u0019\u0010\u0008\u001a\u0004\u0008\u001a\u0010\nR\u0014\u0010\u0002\u001a\u00020\u0003X\u0090\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u001e\u0010\u0008\u001a\u0004\u0008\u001f\u0010\nR\u001c\u0010 \u001a\u00020\u00148\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008!\u0010\u0008\u001a\u0004\u0008\"\u0010\u0017\u00a8\u0006#"
    }
    d2 = {
        "Landroidx/constraintlayout/compose/ConstrainedLayoutReference;",
        "Landroidx/constraintlayout/compose/LayoutReference;",
        "id",
        "",
        "(Ljava/lang/Object;)V",
        "absoluteLeft",
        "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;",
        "getAbsoluteLeft$annotations",
        "()V",
        "getAbsoluteLeft",
        "()Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;",
        "absoluteRight",
        "getAbsoluteRight$annotations",
        "getAbsoluteRight",
        "baseline",
        "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$BaselineAnchor;",
        "getBaseline$annotations",
        "getBaseline",
        "()Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$BaselineAnchor;",
        "bottom",
        "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;",
        "getBottom$annotations",
        "getBottom",
        "()Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;",
        "end",
        "getEnd$annotations",
        "getEnd",
        "getId$constraintlayout_compose_release",
        "()Ljava/lang/Object;",
        "start",
        "getStart$annotations",
        "getStart",
        "top",
        "getTop$annotations",
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
.field private final absoluteLeft:Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;

.field private final absoluteRight:Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;

.field private final baseline:Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$BaselineAnchor;

.field private final bottom:Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;

.field private final end:Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;

.field private final id:Ljava/lang/Object;

.field private final start:Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;

.field private final top:Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Landroidx/constraintlayout/compose/LayoutReference;-><init>(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/constraintlayout/compose/ConstrainedLayoutReference;->id:Ljava/lang/Object;

    .line 5
    .line 6
    new-instance p1, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;

    .line 7
    .line 8
    invoke-virtual {p0}, Landroidx/constraintlayout/compose/ConstrainedLayoutReference;->getId$constraintlayout_compose_release()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/4 v1, -0x2

    .line 13
    invoke-direct {p1, v0, v1, p0}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;-><init>(Ljava/lang/Object;ILandroidx/constraintlayout/compose/LayoutReference;)V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Landroidx/constraintlayout/compose/ConstrainedLayoutReference;->start:Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;

    .line 17
    .line 18
    new-instance p1, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;

    .line 19
    .line 20
    invoke-virtual {p0}, Landroidx/constraintlayout/compose/ConstrainedLayoutReference;->getId$constraintlayout_compose_release()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const/4 v1, 0x0

    .line 25
    invoke-direct {p1, v0, v1, p0}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;-><init>(Ljava/lang/Object;ILandroidx/constraintlayout/compose/LayoutReference;)V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, Landroidx/constraintlayout/compose/ConstrainedLayoutReference;->absoluteLeft:Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;

    .line 29
    .line 30
    new-instance p1, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;

    .line 31
    .line 32
    invoke-virtual {p0}, Landroidx/constraintlayout/compose/ConstrainedLayoutReference;->getId$constraintlayout_compose_release()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-direct {p1, v0, v1, p0}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;-><init>(Ljava/lang/Object;ILandroidx/constraintlayout/compose/LayoutReference;)V

    .line 37
    .line 38
    .line 39
    iput-object p1, p0, Landroidx/constraintlayout/compose/ConstrainedLayoutReference;->top:Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;

    .line 40
    .line 41
    new-instance p1, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;

    .line 42
    .line 43
    invoke-virtual {p0}, Landroidx/constraintlayout/compose/ConstrainedLayoutReference;->getId$constraintlayout_compose_release()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    const/4 v1, -0x1

    .line 48
    invoke-direct {p1, v0, v1, p0}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;-><init>(Ljava/lang/Object;ILandroidx/constraintlayout/compose/LayoutReference;)V

    .line 49
    .line 50
    .line 51
    iput-object p1, p0, Landroidx/constraintlayout/compose/ConstrainedLayoutReference;->end:Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;

    .line 52
    .line 53
    new-instance p1, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;

    .line 54
    .line 55
    invoke-virtual {p0}, Landroidx/constraintlayout/compose/ConstrainedLayoutReference;->getId$constraintlayout_compose_release()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    const/4 v1, 0x1

    .line 60
    invoke-direct {p1, v0, v1, p0}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;-><init>(Ljava/lang/Object;ILandroidx/constraintlayout/compose/LayoutReference;)V

    .line 61
    .line 62
    .line 63
    iput-object p1, p0, Landroidx/constraintlayout/compose/ConstrainedLayoutReference;->absoluteRight:Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;

    .line 64
    .line 65
    new-instance p1, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;

    .line 66
    .line 67
    invoke-virtual {p0}, Landroidx/constraintlayout/compose/ConstrainedLayoutReference;->getId$constraintlayout_compose_release()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-direct {p1, v0, v1, p0}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;-><init>(Ljava/lang/Object;ILandroidx/constraintlayout/compose/LayoutReference;)V

    .line 72
    .line 73
    .line 74
    iput-object p1, p0, Landroidx/constraintlayout/compose/ConstrainedLayoutReference;->bottom:Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;

    .line 75
    .line 76
    new-instance p1, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$BaselineAnchor;

    .line 77
    .line 78
    invoke-virtual {p0}, Landroidx/constraintlayout/compose/ConstrainedLayoutReference;->getId$constraintlayout_compose_release()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-direct {p1, v0, p0}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$BaselineAnchor;-><init>(Ljava/lang/Object;Landroidx/constraintlayout/compose/LayoutReference;)V

    .line 83
    .line 84
    .line 85
    iput-object p1, p0, Landroidx/constraintlayout/compose/ConstrainedLayoutReference;->baseline:Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$BaselineAnchor;

    .line 86
    .line 87
    return-void
.end method

.method public static synthetic getAbsoluteLeft$annotations()V
    .locals 0
    .annotation build Landroidx/compose/runtime/Stable;
    .end annotation

    return-void
.end method

.method public static synthetic getAbsoluteRight$annotations()V
    .locals 0
    .annotation build Landroidx/compose/runtime/Stable;
    .end annotation

    return-void
.end method

.method public static synthetic getBaseline$annotations()V
    .locals 0
    .annotation build Landroidx/compose/runtime/Stable;
    .end annotation

    return-void
.end method

.method public static synthetic getBottom$annotations()V
    .locals 0
    .annotation build Landroidx/compose/runtime/Stable;
    .end annotation

    return-void
.end method

.method public static synthetic getEnd$annotations()V
    .locals 0
    .annotation build Landroidx/compose/runtime/Stable;
    .end annotation

    return-void
.end method

.method public static synthetic getStart$annotations()V
    .locals 0
    .annotation build Landroidx/compose/runtime/Stable;
    .end annotation

    return-void
.end method

.method public static synthetic getTop$annotations()V
    .locals 0
    .annotation build Landroidx/compose/runtime/Stable;
    .end annotation

    return-void
.end method


# virtual methods
.method public final getAbsoluteLeft()Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstrainedLayoutReference;->absoluteLeft:Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getAbsoluteRight()Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstrainedLayoutReference;->absoluteRight:Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getBaseline()Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$BaselineAnchor;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstrainedLayoutReference;->baseline:Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$BaselineAnchor;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getBottom()Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstrainedLayoutReference;->bottom:Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getEnd()Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstrainedLayoutReference;->end:Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;

    .line 2
    .line 3
    return-object v0
.end method

.method public getId$constraintlayout_compose_release()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstrainedLayoutReference;->id:Ljava/lang/Object;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getStart()Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstrainedLayoutReference;->start:Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getTop()Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstrainedLayoutReference;->top:Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;

    .line 2
    .line 3
    return-object v0
.end method
