.class public final Lcom/zykj/view/board/simple/DataStateKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0017\u0010\u0000\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "simplePenSizeList",
        "",
        "Lcom/zykj/view/board/simple/SimplePenSize;",
        "getSimplePenSizeList",
        "()Ljava/util/List;",
        "view_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final simplePenSizeList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/zykj/view/board/simple/SimplePenSize;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const/4 v0, 0x3

    .line 2
    new-array v0, v0, [Lcom/zykj/view/board/simple/SimplePenSize;

    .line 3
    .line 4
    sget-object v1, Lcom/zykj/view/board/simple/SimplePenSize$Little;->INSTANCE:Lcom/zykj/view/board/simple/SimplePenSize$Little;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    aput-object v1, v0, v2

    .line 8
    .line 9
    sget-object v1, Lcom/zykj/view/board/simple/SimplePenSize$Middle;->INSTANCE:Lcom/zykj/view/board/simple/SimplePenSize$Middle;

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    aput-object v1, v0, v2

    .line 13
    .line 14
    sget-object v1, Lcom/zykj/view/board/simple/SimplePenSize$Large;->INSTANCE:Lcom/zykj/view/board/simple/SimplePenSize$Large;

    .line 15
    .line 16
    const/4 v2, 0x2

    .line 17
    aput-object v1, v0, v2

    .line 18
    .line 19
    invoke-static {v0}, Lkotlin/collections/u;->z([Ljava/lang/Object;)Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, Lcom/zykj/view/board/simple/DataStateKt;->simplePenSizeList:Ljava/util/List;

    .line 24
    .line 25
    return-void
.end method

.method public static final getSimplePenSizeList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zykj/view/board/simple/SimplePenSize;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/view/board/simple/DataStateKt;->simplePenSizeList:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method
