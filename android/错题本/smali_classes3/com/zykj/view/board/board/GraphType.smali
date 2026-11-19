.class public abstract Lcom/zykj/view/board/board/GraphType;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/view/board/board/GraphType$Null;,
        Lcom/zykj/view/board/board/GraphType$Oval;,
        Lcom/zykj/view/board/board/GraphType$Rectangle;,
        Lcom/zykj/view/board/board/GraphType$Triangle;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u00002\u00020\u0001:\u0004\r\u000e\u000f\u0010B1\u0008\u0004\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0002\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0004\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000c\u0082\u0001\u0004\u0011\u0012\u0013\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/zykj/view/board/board/GraphType;",
        "",
        "isRectangleChecked",
        "",
        "isOvalChecked",
        "isTriangleChecked",
        "geometryActionEnum",
        "Lcom/zykj/blackboard/core/action/GeometryActionEnum;",
        "<init>",
        "(ZZZLcom/zykj/blackboard/core/action/GeometryActionEnum;)V",
        "()Z",
        "getGeometryActionEnum",
        "()Lcom/zykj/blackboard/core/action/GeometryActionEnum;",
        "Rectangle",
        "Oval",
        "Triangle",
        "Null",
        "Lcom/zykj/view/board/board/GraphType$Null;",
        "Lcom/zykj/view/board/board/GraphType$Oval;",
        "Lcom/zykj/view/board/board/GraphType$Rectangle;",
        "Lcom/zykj/view/board/board/GraphType$Triangle;",
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
.field private final geometryActionEnum:Lcom/zykj/blackboard/core/action/GeometryActionEnum;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final isOvalChecked:Z

.field private final isRectangleChecked:Z

.field private final isTriangleChecked:Z


# direct methods
.method private constructor <init>(ZZZLcom/zykj/blackboard/core/action/GeometryActionEnum;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-boolean p1, p0, Lcom/zykj/view/board/board/GraphType;->isRectangleChecked:Z

    .line 4
    iput-boolean p2, p0, Lcom/zykj/view/board/board/GraphType;->isOvalChecked:Z

    .line 5
    iput-boolean p3, p0, Lcom/zykj/view/board/board/GraphType;->isTriangleChecked:Z

    .line 6
    iput-object p4, p0, Lcom/zykj/view/board/board/GraphType;->geometryActionEnum:Lcom/zykj/blackboard/core/action/GeometryActionEnum;

    return-void
.end method

.method public synthetic constructor <init>(ZZZLcom/zykj/blackboard/core/action/GeometryActionEnum;ILkotlin/jvm/internal/e;)V
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

    .line 7
    sget-object p4, Lcom/zykj/blackboard/core/action/GeometryActionEnum;->RECTANGLE:Lcom/zykj/blackboard/core/action/GeometryActionEnum;

    :cond_3
    move-object v5, p4

    const/4 v6, 0x0

    move-object v1, p0

    .line 8
    invoke-direct/range {v1 .. v6}, Lcom/zykj/view/board/board/GraphType;-><init>(ZZZLcom/zykj/blackboard/core/action/GeometryActionEnum;Lkotlin/jvm/internal/e;)V

    return-void
.end method

.method public synthetic constructor <init>(ZZZLcom/zykj/blackboard/core/action/GeometryActionEnum;Lkotlin/jvm/internal/e;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/zykj/view/board/board/GraphType;-><init>(ZZZLcom/zykj/blackboard/core/action/GeometryActionEnum;)V

    return-void
.end method


# virtual methods
.method public final getGeometryActionEnum()Lcom/zykj/blackboard/core/action/GeometryActionEnum;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/GraphType;->geometryActionEnum:Lcom/zykj/blackboard/core/action/GeometryActionEnum;

    .line 2
    .line 3
    return-object v0
.end method

.method public final isOvalChecked()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/view/board/board/GraphType;->isOvalChecked:Z

    .line 2
    .line 3
    return v0
.end method

.method public final isRectangleChecked()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/view/board/board/GraphType;->isRectangleChecked:Z

    .line 2
    .line 3
    return v0
.end method

.method public final isTriangleChecked()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/view/board/board/GraphType;->isTriangleChecked:Z

    .line 2
    .line 3
    return v0
.end method
