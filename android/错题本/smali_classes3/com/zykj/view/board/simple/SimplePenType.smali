.class public abstract Lcom/zykj/view/board/simple/SimplePenType;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/view/board/simple/SimplePenType$Custom;,
        Lcom/zykj/view/board/simple/SimplePenType$DottedLine;,
        Lcom/zykj/view/board/simple/SimplePenType$Line;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u00002\u00020\u0001:\u0003\r\u000e\u000fB#\u0008\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u000c\u0082\u0001\u0003\u0010\u0011\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/zykj/view/board/simple/SimplePenType;",
        "",
        "ordinal",
        "",
        "mode",
        "isPenDashed",
        "",
        "<init>",
        "(IIZ)V",
        "getOrdinal",
        "()I",
        "getMode",
        "()Z",
        "Custom",
        "Line",
        "DottedLine",
        "Lcom/zykj/view/board/simple/SimplePenType$Custom;",
        "Lcom/zykj/view/board/simple/SimplePenType$DottedLine;",
        "Lcom/zykj/view/board/simple/SimplePenType$Line;",
        "view_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final isPenDashed:Z

.field private final mode:I

.field private final ordinal:I


# direct methods
.method private constructor <init>(IIZ)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lcom/zykj/view/board/simple/SimplePenType;->ordinal:I

    .line 4
    iput p2, p0, Lcom/zykj/view/board/simple/SimplePenType;->mode:I

    .line 5
    iput-boolean p3, p0, Lcom/zykj/view/board/simple/SimplePenType;->isPenDashed:Z

    return-void
.end method

.method public synthetic constructor <init>(IIZILkotlin/jvm/internal/e;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    const/4 p4, 0x0

    .line 6
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/zykj/view/board/simple/SimplePenType;-><init>(IIZLkotlin/jvm/internal/e;)V

    return-void
.end method

.method public synthetic constructor <init>(IIZLkotlin/jvm/internal/e;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/zykj/view/board/simple/SimplePenType;-><init>(IIZ)V

    return-void
.end method


# virtual methods
.method public final getMode()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/view/board/simple/SimplePenType;->mode:I

    .line 2
    .line 3
    return v0
.end method

.method public final getOrdinal()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/view/board/simple/SimplePenType;->ordinal:I

    .line 2
    .line 3
    return v0
.end method

.method public final isPenDashed()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/view/board/simple/SimplePenType;->isPenDashed:Z

    .line 2
    .line 3
    return v0
.end method
