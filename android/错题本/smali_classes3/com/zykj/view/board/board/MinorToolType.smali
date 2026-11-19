.class public abstract Lcom/zykj/view/board/board/MinorToolType;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/view/board/board/MinorToolType$Background;,
        Lcom/zykj/view/board/board/MinorToolType$Eraser;,
        Lcom/zykj/view/board/board/MinorToolType$Graph;,
        Lcom/zykj/view/board/board/MinorToolType$Null;,
        Lcom/zykj/view/board/board/MinorToolType$Pen;,
        Lcom/zykj/view/board/board/MinorToolType$Select;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u00002\u00020\u0001:\u0006\u0010\u0011\u0012\u0013\u0014\u0015B;\u0008\u0004\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0008\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u000b\u0082\u0001\u0006\u0016\u0017\u0018\u0019\u001a\u001b\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/zykj/view/board/board/MinorToolType;",
        "",
        "selectVisible",
        "",
        "penVisible",
        "eraserVisible",
        "graphVisible",
        "backgroundVisible",
        "<init>",
        "(ZZZZZ)V",
        "getSelectVisible",
        "()Z",
        "getPenVisible",
        "getEraserVisible",
        "getGraphVisible",
        "getBackgroundVisible",
        "Select",
        "Pen",
        "Eraser",
        "Graph",
        "Background",
        "Null",
        "Lcom/zykj/view/board/board/MinorToolType$Background;",
        "Lcom/zykj/view/board/board/MinorToolType$Eraser;",
        "Lcom/zykj/view/board/board/MinorToolType$Graph;",
        "Lcom/zykj/view/board/board/MinorToolType$Null;",
        "Lcom/zykj/view/board/board/MinorToolType$Pen;",
        "Lcom/zykj/view/board/board/MinorToolType$Select;",
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
.field private final backgroundVisible:Z

.field private final eraserVisible:Z

.field private final graphVisible:Z

.field private final penVisible:Z

.field private final selectVisible:Z


# direct methods
.method private constructor <init>(ZZZZZ)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-boolean p1, p0, Lcom/zykj/view/board/board/MinorToolType;->selectVisible:Z

    .line 4
    iput-boolean p2, p0, Lcom/zykj/view/board/board/MinorToolType;->penVisible:Z

    .line 5
    iput-boolean p3, p0, Lcom/zykj/view/board/board/MinorToolType;->eraserVisible:Z

    .line 6
    iput-boolean p4, p0, Lcom/zykj/view/board/board/MinorToolType;->graphVisible:Z

    .line 7
    iput-boolean p5, p0, Lcom/zykj/view/board/board/MinorToolType;->backgroundVisible:Z

    return-void
.end method

.method public synthetic constructor <init>(ZZZZZILkotlin/jvm/internal/e;)V
    .locals 8

    and-int/lit8 p7, p6, 0x1

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    move v2, v0

    goto :goto_0

    :cond_0
    move v2, p1

    :goto_0
    and-int/lit8 p1, p6, 0x2

    if-eqz p1, :cond_1

    move v3, v0

    goto :goto_1

    :cond_1
    move v3, p2

    :goto_1
    and-int/lit8 p1, p6, 0x4

    if-eqz p1, :cond_2

    move v4, v0

    goto :goto_2

    :cond_2
    move v4, p3

    :goto_2
    and-int/lit8 p1, p6, 0x8

    if-eqz p1, :cond_3

    move v5, v0

    goto :goto_3

    :cond_3
    move v5, p4

    :goto_3
    and-int/lit8 p1, p6, 0x10

    if-eqz p1, :cond_4

    move v6, v0

    goto :goto_4

    :cond_4
    move v6, p5

    :goto_4
    const/4 v7, 0x0

    move-object v1, p0

    .line 8
    invoke-direct/range {v1 .. v7}, Lcom/zykj/view/board/board/MinorToolType;-><init>(ZZZZZLkotlin/jvm/internal/e;)V

    return-void
.end method

.method public synthetic constructor <init>(ZZZZZLkotlin/jvm/internal/e;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, Lcom/zykj/view/board/board/MinorToolType;-><init>(ZZZZZ)V

    return-void
.end method


# virtual methods
.method public final getBackgroundVisible()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/view/board/board/MinorToolType;->backgroundVisible:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getEraserVisible()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/view/board/board/MinorToolType;->eraserVisible:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getGraphVisible()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/view/board/board/MinorToolType;->graphVisible:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getPenVisible()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/view/board/board/MinorToolType;->penVisible:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getSelectVisible()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/view/board/board/MinorToolType;->selectVisible:Z

    .line 2
    .line 3
    return v0
.end method
