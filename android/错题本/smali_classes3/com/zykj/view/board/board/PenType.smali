.class public abstract Lcom/zykj/view/board/board/PenType;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/view/board/board/PenType$Cursor;,
        Lcom/zykj/view/board/board/PenType$Custom;,
        Lcom/zykj/view/board/board/PenType$DottedLine;,
        Lcom/zykj/view/board/board/PenType$Highlighter;,
        Lcom/zykj/view/board/board/PenType$Line;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0002\u0008\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u00002\u00020\u0001:\u0005\u0017\u0018\u0019\u001a\u001bB=\u0008\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u000e\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\n0\t\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0012R\u0017\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016\u0082\u0001\u0005\u001c\u001d\u001e\u001f \u00a8\u0006!"
    }
    d2 = {
        "Lcom/zykj/view/board/board/PenType;",
        "",
        "ordinal",
        "",
        "mode",
        "Lcom/zykj/board/EzyModeEnum$ModeEnum;",
        "isDotted",
        "",
        "paintWidthList",
        "",
        "",
        "paintColorAlpha",
        "<init>",
        "(ILcom/zykj/board/EzyModeEnum$ModeEnum;ZLjava/util/List;F)V",
        "getOrdinal",
        "()I",
        "getMode",
        "()Lcom/zykj/board/EzyModeEnum$ModeEnum;",
        "()Z",
        "getPaintWidthList",
        "()Ljava/util/List;",
        "getPaintColorAlpha",
        "()F",
        "Custom",
        "Line",
        "DottedLine",
        "Highlighter",
        "Cursor",
        "Lcom/zykj/view/board/board/PenType$Cursor;",
        "Lcom/zykj/view/board/board/PenType$Custom;",
        "Lcom/zykj/view/board/board/PenType$DottedLine;",
        "Lcom/zykj/view/board/board/PenType$Highlighter;",
        "Lcom/zykj/view/board/board/PenType$Line;",
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
.field private final isDotted:Z

.field private final mode:Lcom/zykj/board/EzyModeEnum$ModeEnum;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final ordinal:I

.field private final paintColorAlpha:F

.field private final paintWidthList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method private constructor <init>(ILcom/zykj/board/EzyModeEnum$ModeEnum;ZLjava/util/List;F)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/zykj/board/EzyModeEnum$ModeEnum;",
            "Z",
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;F)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lcom/zykj/view/board/board/PenType;->ordinal:I

    .line 4
    iput-object p2, p0, Lcom/zykj/view/board/board/PenType;->mode:Lcom/zykj/board/EzyModeEnum$ModeEnum;

    .line 5
    iput-boolean p3, p0, Lcom/zykj/view/board/board/PenType;->isDotted:Z

    .line 6
    iput-object p4, p0, Lcom/zykj/view/board/board/PenType;->paintWidthList:Ljava/util/List;

    .line 7
    iput p5, p0, Lcom/zykj/view/board/board/PenType;->paintColorAlpha:F

    return-void
.end method

.method public synthetic constructor <init>(ILcom/zykj/board/EzyModeEnum$ModeEnum;ZLjava/util/List;FILkotlin/jvm/internal/e;)V
    .locals 7

    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_0

    const/4 p3, 0x0

    :cond_0
    move v3, p3

    and-int/lit8 p3, p6, 0x8

    if-eqz p3, :cond_1

    const/high16 p3, 0x40400000    # 3.0f

    .line 8
    invoke-static {p3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p3

    const/high16 p4, 0x41000000    # 8.0f

    invoke-static {p4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p4

    const/high16 p7, 0x41700000    # 15.0f

    invoke-static {p7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p7

    filled-new-array {p3, p4, p7}, [Ljava/lang/Float;

    move-result-object p3

    invoke-static {p3}, Lkotlin/collections/u;->z([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p4

    :cond_1
    move-object v4, p4

    and-int/lit8 p3, p6, 0x10

    if-eqz p3, :cond_2

    const/high16 p5, 0x3f800000    # 1.0f

    :cond_2
    move v5, p5

    const/4 v6, 0x0

    move-object v0, p0

    move v1, p1

    move-object v2, p2

    .line 9
    invoke-direct/range {v0 .. v6}, Lcom/zykj/view/board/board/PenType;-><init>(ILcom/zykj/board/EzyModeEnum$ModeEnum;ZLjava/util/List;FLkotlin/jvm/internal/e;)V

    return-void
.end method

.method public synthetic constructor <init>(ILcom/zykj/board/EzyModeEnum$ModeEnum;ZLjava/util/List;FLkotlin/jvm/internal/e;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, Lcom/zykj/view/board/board/PenType;-><init>(ILcom/zykj/board/EzyModeEnum$ModeEnum;ZLjava/util/List;F)V

    return-void
.end method


# virtual methods
.method public final getMode()Lcom/zykj/board/EzyModeEnum$ModeEnum;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/PenType;->mode:Lcom/zykj/board/EzyModeEnum$ModeEnum;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getOrdinal()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/view/board/board/PenType;->ordinal:I

    .line 2
    .line 3
    return v0
.end method

.method public final getPaintColorAlpha()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/view/board/board/PenType;->paintColorAlpha:F

    .line 2
    .line 3
    return v0
.end method

.method public final getPaintWidthList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/PenType;->paintWidthList:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final isDotted()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/view/board/board/PenType;->isDotted:Z

    .line 2
    .line 3
    return v0
.end method
