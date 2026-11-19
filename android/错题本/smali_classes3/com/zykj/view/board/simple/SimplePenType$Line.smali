.class public final Lcom/zykj/view/board/simple/SimplePenType$Line;
.super Lcom/zykj/view/board/simple/SimplePenType;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/view/board/simple/SimplePenType;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Line"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lcom/zykj/view/board/simple/SimplePenType$Line;",
        "Lcom/zykj/view/board/simple/SimplePenType;",
        "<init>",
        "()V",
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


# static fields
.field public static final INSTANCE:Lcom/zykj/view/board/simple/SimplePenType$Line;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/zykj/view/board/simple/SimplePenType$Line;

    invoke-direct {v0}, Lcom/zykj/view/board/simple/SimplePenType$Line;-><init>()V

    sput-object v0, Lcom/zykj/view/board/simple/SimplePenType$Line;->INSTANCE:Lcom/zykj/view/board/simple/SimplePenType$Line;

    return-void
.end method

.method private constructor <init>()V
    .locals 6

    .line 1
    const/4 v4, 0x4

    .line 2
    const/4 v5, 0x0

    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    move-object v0, p0

    .line 7
    invoke-direct/range {v0 .. v5}, Lcom/zykj/view/board/simple/SimplePenType;-><init>(IIZILkotlin/jvm/internal/e;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
