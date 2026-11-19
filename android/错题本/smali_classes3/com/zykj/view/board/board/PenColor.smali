.class public abstract Lcom/zykj/view/board/board/PenColor;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/view/board/board/PenColor$ColorBlack;,
        Lcom/zykj/view/board/board/PenColor$ColorCustom;,
        Lcom/zykj/view/board/board/PenColor$ColorRed;,
        Lcom/zykj/view/board/board/PenColor$ColorWhite;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u00002\u00020\u0001:\u0004\n\u000b\u000c\rB\u0019\u0008\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\u0008\u0082\u0001\u0004\u000e\u000f\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/zykj/view/board/board/PenColor;",
        "",
        "ordinal",
        "",
        "color",
        "<init>",
        "(II)V",
        "getOrdinal",
        "()I",
        "getColor",
        "ColorCustom",
        "ColorBlack",
        "ColorWhite",
        "ColorRed",
        "Lcom/zykj/view/board/board/PenColor$ColorBlack;",
        "Lcom/zykj/view/board/board/PenColor$ColorCustom;",
        "Lcom/zykj/view/board/board/PenColor$ColorRed;",
        "Lcom/zykj/view/board/board/PenColor$ColorWhite;",
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
.field private final color:I

.field private final ordinal:I


# direct methods
.method private constructor <init>(II)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lcom/zykj/view/board/board/PenColor;->ordinal:I

    .line 4
    iput p2, p0, Lcom/zykj/view/board/board/PenColor;->color:I

    return-void
.end method

.method public synthetic constructor <init>(IILkotlin/jvm/internal/e;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/zykj/view/board/board/PenColor;-><init>(II)V

    return-void
.end method


# virtual methods
.method public final getColor()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/view/board/board/PenColor;->color:I

    .line 2
    .line 3
    return v0
.end method

.method public final getOrdinal()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/view/board/board/PenColor;->ordinal:I

    .line 2
    .line 3
    return v0
.end method
