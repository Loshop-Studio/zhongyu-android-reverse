.class public abstract Lcom/zykj/view/board/board/ConfirmButtonType;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/view/board/board/ConfirmButtonType$Commit;,
        Lcom/zykj/view/board/board/ConfirmButtonType$CommitWithRecord;,
        Lcom/zykj/view/board/board/ConfirmButtonType$Null;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u00002\u00020\u0001:\u0003\u0008\t\nB\u001d\u0008\u0004\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0004\u0010\u0007\u0082\u0001\u0003\u000b\u000c\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/zykj/view/board/board/ConfirmButtonType;",
        "",
        "isCommitVisible",
        "",
        "isRecordVisible",
        "<init>",
        "(ZZ)V",
        "()Z",
        "Commit",
        "CommitWithRecord",
        "Null",
        "Lcom/zykj/view/board/board/ConfirmButtonType$Commit;",
        "Lcom/zykj/view/board/board/ConfirmButtonType$CommitWithRecord;",
        "Lcom/zykj/view/board/board/ConfirmButtonType$Null;",
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
.field private final isCommitVisible:Z

.field private final isRecordVisible:Z


# direct methods
.method private constructor <init>(ZZ)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-boolean p1, p0, Lcom/zykj/view/board/board/ConfirmButtonType;->isCommitVisible:Z

    .line 4
    iput-boolean p2, p0, Lcom/zykj/view/board/board/ConfirmButtonType;->isRecordVisible:Z

    return-void
.end method

.method public synthetic constructor <init>(ZZILkotlin/jvm/internal/e;)V
    .locals 1

    and-int/lit8 p4, p3, 0x1

    const/4 v0, 0x0

    if-eqz p4, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    move p2, v0

    :cond_1
    const/4 p3, 0x0

    .line 5
    invoke-direct {p0, p1, p2, p3}, Lcom/zykj/view/board/board/ConfirmButtonType;-><init>(ZZLkotlin/jvm/internal/e;)V

    return-void
.end method

.method public synthetic constructor <init>(ZZLkotlin/jvm/internal/e;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/zykj/view/board/board/ConfirmButtonType;-><init>(ZZ)V

    return-void
.end method


# virtual methods
.method public final isCommitVisible()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/view/board/board/ConfirmButtonType;->isCommitVisible:Z

    .line 2
    .line 3
    return v0
.end method

.method public final isRecordVisible()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/view/board/board/ConfirmButtonType;->isRecordVisible:Z

    .line 2
    .line 3
    return v0
.end method
