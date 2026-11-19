.class public abstract Lcom/zykj/view/board/board/MainToolType;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/view/board/board/MainToolType$Eraser;,
        Lcom/zykj/view/board/board/MainToolType$Graph;,
        Lcom/zykj/view/board/board/MainToolType$Pen;,
        Lcom/zykj/view/board/board/MainToolType$Select;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u00002\u00020\u0001:\u0004\n\u000b\u000c\rB1\u0008\u0004\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0002\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0004\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\t\u0082\u0001\u0004\u000e\u000f\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/zykj/view/board/board/MainToolType;",
        "",
        "isSelectChecked",
        "",
        "isPenChecked",
        "isEraserChecked",
        "isGraphChecked",
        "<init>",
        "(ZZZZ)V",
        "()Z",
        "Select",
        "Pen",
        "Eraser",
        "Graph",
        "Lcom/zykj/view/board/board/MainToolType$Eraser;",
        "Lcom/zykj/view/board/board/MainToolType$Graph;",
        "Lcom/zykj/view/board/board/MainToolType$Pen;",
        "Lcom/zykj/view/board/board/MainToolType$Select;",
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
.field private final isEraserChecked:Z

.field private final isGraphChecked:Z

.field private final isPenChecked:Z

.field private final isSelectChecked:Z


# direct methods
.method private constructor <init>(ZZZZ)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-boolean p1, p0, Lcom/zykj/view/board/board/MainToolType;->isSelectChecked:Z

    .line 4
    iput-boolean p2, p0, Lcom/zykj/view/board/board/MainToolType;->isPenChecked:Z

    .line 5
    iput-boolean p3, p0, Lcom/zykj/view/board/board/MainToolType;->isEraserChecked:Z

    .line 6
    iput-boolean p4, p0, Lcom/zykj/view/board/board/MainToolType;->isGraphChecked:Z

    return-void
.end method

.method public synthetic constructor <init>(ZZZZILkotlin/jvm/internal/e;)V
    .locals 7

    and-int/lit8 p6, p5, 0x1

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move v2, v0

    goto :goto_0

    :cond_0
    move v2, p1

    :goto_0
    and-int/lit8 p1, p5, 0x2

    if-eqz p1, :cond_1

    move v3, v0

    goto :goto_1

    :cond_1
    move v3, p2

    :goto_1
    and-int/lit8 p1, p5, 0x4

    if-eqz p1, :cond_2

    move v4, v0

    goto :goto_2

    :cond_2
    move v4, p3

    :goto_2
    and-int/lit8 p1, p5, 0x8

    if-eqz p1, :cond_3

    move v5, v0

    goto :goto_3

    :cond_3
    move v5, p4

    :goto_3
    const/4 v6, 0x0

    move-object v1, p0

    .line 7
    invoke-direct/range {v1 .. v6}, Lcom/zykj/view/board/board/MainToolType;-><init>(ZZZZLkotlin/jvm/internal/e;)V

    return-void
.end method

.method public synthetic constructor <init>(ZZZZLkotlin/jvm/internal/e;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/zykj/view/board/board/MainToolType;-><init>(ZZZZ)V

    return-void
.end method


# virtual methods
.method public final isEraserChecked()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/view/board/board/MainToolType;->isEraserChecked:Z

    .line 2
    .line 3
    return v0
.end method

.method public final isGraphChecked()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/view/board/board/MainToolType;->isGraphChecked:Z

    .line 2
    .line 3
    return v0
.end method

.method public final isPenChecked()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/view/board/board/MainToolType;->isPenChecked:Z

    .line 2
    .line 3
    return v0
.end method

.method public final isSelectChecked()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/view/board/board/MainToolType;->isSelectChecked:Z

    .line 2
    .line 3
    return v0
.end method
