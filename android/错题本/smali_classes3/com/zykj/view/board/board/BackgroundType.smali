.class public abstract Lcom/zykj/view/board/board/BackgroundType;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/view/board/board/BackgroundType$ColorBlack;,
        Lcom/zykj/view/board/board/BackgroundType$ColorBlue;,
        Lcom/zykj/view/board/board/BackgroundType$ColorGreen;,
        Lcom/zykj/view/board/board/BackgroundType$ColorWhite;,
        Lcom/zykj/view/board/board/BackgroundType$LineHorizontal;,
        Lcom/zykj/view/board/board/BackgroundType$LineInterweave;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u00002\u00020\u0001:\u0006\u0014\u0015\u0016\u0017\u0018\u0019B9\u0008\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0004\u0008\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\rR\u0011\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013\u0082\u0001\u0006\u001a\u001b\u001c\u001d\u001e\u001f\u00a8\u0006 "
    }
    d2 = {
        "Lcom/zykj/view/board/board/BackgroundType;",
        "",
        "ordinal",
        "",
        "backgroundColor",
        "lineType",
        "Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;",
        "lineColor",
        "lineSpace",
        "",
        "<init>",
        "(IILcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;IF)V",
        "getOrdinal",
        "()I",
        "getBackgroundColor",
        "getLineType",
        "()Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;",
        "getLineColor",
        "getLineSpace",
        "()F",
        "ColorWhite",
        "ColorBlack",
        "ColorBlue",
        "ColorGreen",
        "LineInterweave",
        "LineHorizontal",
        "Lcom/zykj/view/board/board/BackgroundType$ColorBlack;",
        "Lcom/zykj/view/board/board/BackgroundType$ColorBlue;",
        "Lcom/zykj/view/board/board/BackgroundType$ColorGreen;",
        "Lcom/zykj/view/board/board/BackgroundType$ColorWhite;",
        "Lcom/zykj/view/board/board/BackgroundType$LineHorizontal;",
        "Lcom/zykj/view/board/board/BackgroundType$LineInterweave;",
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
.field private final backgroundColor:I

.field private final lineColor:I

.field private final lineSpace:F

.field private final lineType:Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final ordinal:I


# direct methods
.method private constructor <init>(IILcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;IF)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lcom/zykj/view/board/board/BackgroundType;->ordinal:I

    .line 4
    iput p2, p0, Lcom/zykj/view/board/board/BackgroundType;->backgroundColor:I

    .line 5
    iput-object p3, p0, Lcom/zykj/view/board/board/BackgroundType;->lineType:Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;

    .line 6
    iput p4, p0, Lcom/zykj/view/board/board/BackgroundType;->lineColor:I

    .line 7
    iput p5, p0, Lcom/zykj/view/board/board/BackgroundType;->lineSpace:F

    return-void
.end method

.method public synthetic constructor <init>(IILcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;IFILkotlin/jvm/internal/e;)V
    .locals 7

    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_0

    const/4 p2, -0x1

    :cond_0
    move v2, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_1

    .line 8
    sget-object p3, Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;->Horizontal:Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;

    :cond_1
    move-object v3, p3

    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_2

    const/4 p4, 0x0

    :cond_2
    move v4, p4

    and-int/lit8 p2, p6, 0x10

    if-eqz p2, :cond_3

    const/high16 p5, 0x42800000    # 64.0f

    :cond_3
    move v5, p5

    const/4 v6, 0x0

    move-object v0, p0

    move v1, p1

    .line 9
    invoke-direct/range {v0 .. v6}, Lcom/zykj/view/board/board/BackgroundType;-><init>(IILcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;IFLkotlin/jvm/internal/e;)V

    return-void
.end method

.method public synthetic constructor <init>(IILcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;IFLkotlin/jvm/internal/e;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, Lcom/zykj/view/board/board/BackgroundType;-><init>(IILcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;IF)V

    return-void
.end method


# virtual methods
.method public final getBackgroundColor()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/view/board/board/BackgroundType;->backgroundColor:I

    .line 2
    .line 3
    return v0
.end method

.method public final getLineColor()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/view/board/board/BackgroundType;->lineColor:I

    .line 2
    .line 3
    return v0
.end method

.method public final getLineSpace()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/view/board/board/BackgroundType;->lineSpace:F

    .line 2
    .line 3
    return v0
.end method

.method public final getLineType()Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BackgroundType;->lineType:Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getOrdinal()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/view/board/board/BackgroundType;->ordinal:I

    .line 2
    .line 3
    return v0
.end method
