.class public abstract Lcom/zykj/view/board/board/ExpandStatus;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/view/board/board/ExpandStatus$Collapse;,
        Lcom/zykj/view/board/board/ExpandStatus$Expanded;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u00002\u00020\u0001:\u0002\u0008\tB\u0013\u0008\u0004\u0012\u0008\u0008\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\u0082\u0001\u0002\n\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/zykj/view/board/board/ExpandStatus;",
        "",
        "icon",
        "",
        "<init>",
        "(I)V",
        "getIcon",
        "()I",
        "Expanded",
        "Collapse",
        "Lcom/zykj/view/board/board/ExpandStatus$Collapse;",
        "Lcom/zykj/view/board/board/ExpandStatus$Expanded;",
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


# direct methods
.method private constructor <init>(I)V
    .locals 0
    .param p1    # I
        .annotation build Landroidx/annotation/DrawableRes;
        .end annotation
    .end param

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/zykj/view/board/board/ExpandStatus;->icon:I

    return-void
.end method

.method public synthetic constructor <init>(ILkotlin/jvm/internal/e;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/view/board/board/ExpandStatus;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final getIcon()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/view/board/board/ExpandStatus;->icon:I

    .line 2
    .line 3
    return v0
.end method
