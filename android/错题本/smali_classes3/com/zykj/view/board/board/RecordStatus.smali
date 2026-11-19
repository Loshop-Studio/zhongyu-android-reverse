.class public abstract Lcom/zykj/view/board/board/RecordStatus;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/view/board/board/RecordStatus$Continue;,
        Lcom/zykj/view/board/board/RecordStatus$Init;,
        Lcom/zykj/view/board/board/RecordStatus$Pause;,
        Lcom/zykj/view/board/board/RecordStatus$Recording;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u00002\u00020\u0001:\u0004\u000e\u000f\u0010\u0011B7\u0008\u0004\u0012\u0008\u0008\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0004\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\rR\u0011\u0010\u0008\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\r\u0082\u0001\u0004\u0012\u0013\u0014\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/zykj/view/board/board/RecordStatus;",
        "",
        "icon",
        "",
        "isProgressVisible",
        "",
        "isFunctionVisible",
        "isCropVisible",
        "isRecordVisible",
        "<init>",
        "(IZZZZ)V",
        "getIcon",
        "()I",
        "()Z",
        "Init",
        "Pause",
        "Recording",
        "Continue",
        "Lcom/zykj/view/board/board/RecordStatus$Continue;",
        "Lcom/zykj/view/board/board/RecordStatus$Init;",
        "Lcom/zykj/view/board/board/RecordStatus$Pause;",
        "Lcom/zykj/view/board/board/RecordStatus$Recording;",
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
.field private final icon:I

.field private final isCropVisible:Z

.field private final isFunctionVisible:Z

.field private final isProgressVisible:Z

.field private final isRecordVisible:Z


# direct methods
.method private constructor <init>(IZZZZ)V
    .locals 0
    .param p1    # I
        .annotation build Landroidx/annotation/DrawableRes;
        .end annotation
    .end param

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lcom/zykj/view/board/board/RecordStatus;->icon:I

    .line 4
    iput-boolean p2, p0, Lcom/zykj/view/board/board/RecordStatus;->isProgressVisible:Z

    .line 5
    iput-boolean p3, p0, Lcom/zykj/view/board/board/RecordStatus;->isFunctionVisible:Z

    .line 6
    iput-boolean p4, p0, Lcom/zykj/view/board/board/RecordStatus;->isCropVisible:Z

    .line 7
    iput-boolean p5, p0, Lcom/zykj/view/board/board/RecordStatus;->isRecordVisible:Z

    return-void
.end method

.method public synthetic constructor <init>(IZZZZILkotlin/jvm/internal/e;)V
    .locals 10

    and-int/lit8 v0, p6, 0x8

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    if-eqz p2, :cond_0

    if-eqz p3, :cond_0

    move p4, v2

    goto :goto_0

    :cond_0
    move p4, v1

    :cond_1
    :goto_0
    move v7, p4

    and-int/lit8 p4, p6, 0x10

    if-eqz p4, :cond_4

    if-nez p2, :cond_3

    if-eqz v7, :cond_2

    goto :goto_1

    :cond_2
    move p5, v1

    goto :goto_2

    :cond_3
    :goto_1
    move p5, v2

    :cond_4
    :goto_2
    move v8, p5

    const/4 v9, 0x0

    move-object v3, p0

    move v4, p1

    move v5, p2

    move v6, p3

    .line 8
    invoke-direct/range {v3 .. v9}, Lcom/zykj/view/board/board/RecordStatus;-><init>(IZZZZLkotlin/jvm/internal/e;)V

    return-void
.end method

.method public synthetic constructor <init>(IZZZZLkotlin/jvm/internal/e;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, Lcom/zykj/view/board/board/RecordStatus;-><init>(IZZZZ)V

    return-void
.end method


# virtual methods
.method public final getIcon()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/view/board/board/RecordStatus;->icon:I

    .line 2
    .line 3
    return v0
.end method

.method public final isCropVisible()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/view/board/board/RecordStatus;->isCropVisible:Z

    .line 2
    .line 3
    return v0
.end method

.method public final isFunctionVisible()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/view/board/board/RecordStatus;->isFunctionVisible:Z

    .line 2
    .line 3
    return v0
.end method

.method public final isProgressVisible()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/view/board/board/RecordStatus;->isProgressVisible:Z

    .line 2
    .line 3
    return v0
.end method

.method public final isRecordVisible()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/view/board/board/RecordStatus;->isRecordVisible:Z

    .line 2
    .line 3
    return v0
.end method
