.class public final Lcom/zykj/view/board/simple/SimplePenSize$Little;
.super Lcom/zykj/view/board/simple/SimplePenSize;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/view/board/simple/SimplePenSize;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Little"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lcom/zykj/view/board/simple/SimplePenSize$Little;",
        "Lcom/zykj/view/board/simple/SimplePenSize;",
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
.field public static final INSTANCE:Lcom/zykj/view/board/simple/SimplePenSize$Little;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/zykj/view/board/simple/SimplePenSize$Little;

    invoke-direct {v0}, Lcom/zykj/view/board/simple/SimplePenSize$Little;-><init>()V

    sput-object v0, Lcom/zykj/view/board/simple/SimplePenSize$Little;->INSTANCE:Lcom/zykj/view/board/simple/SimplePenSize$Little;

    return-void
.end method

.method private constructor <init>()V
    .locals 3

    .line 1
    const/high16 v0, 0x40400000    # 3.0f

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-direct {p0, v2, v0, v1}, Lcom/zykj/view/board/simple/SimplePenSize;-><init>(IFLkotlin/jvm/internal/e;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
