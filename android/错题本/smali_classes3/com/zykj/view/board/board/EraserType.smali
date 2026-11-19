.class public abstract Lcom/zykj/view/board/board/EraserType;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/view/board/board/EraserType$Large;,
        Lcom/zykj/view/board/board/EraserType$Little;,
        Lcom/zykj/view/board/board/EraserType$Middle;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u00002\u00020\u0001:\u0003\u000c\r\u000eB\u0019\u0008\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000b\u0082\u0001\u0003\u000f\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/zykj/view/board/board/EraserType;",
        "",
        "ordinal",
        "",
        "size",
        "",
        "<init>",
        "(IF)V",
        "getOrdinal",
        "()I",
        "getSize",
        "()F",
        "Little",
        "Middle",
        "Large",
        "Lcom/zykj/view/board/board/EraserType$Large;",
        "Lcom/zykj/view/board/board/EraserType$Little;",
        "Lcom/zykj/view/board/board/EraserType$Middle;",
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
.field private final ordinal:I

.field private final size:F


# direct methods
.method private constructor <init>(IF)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lcom/zykj/view/board/board/EraserType;->ordinal:I

    .line 4
    iput p2, p0, Lcom/zykj/view/board/board/EraserType;->size:F

    return-void
.end method

.method public synthetic constructor <init>(IFLkotlin/jvm/internal/e;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/zykj/view/board/board/EraserType;-><init>(IF)V

    return-void
.end method


# virtual methods
.method public final getOrdinal()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/view/board/board/EraserType;->ordinal:I

    .line 2
    .line 3
    return v0
.end method

.method public final getSize()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/view/board/board/EraserType;->size:F

    .line 2
    .line 3
    return v0
.end method
