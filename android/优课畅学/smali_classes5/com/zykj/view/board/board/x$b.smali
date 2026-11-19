.class public final Lcom/zykj/view/board/board/x$b;
.super Lcom/zykj/view/board/board/x;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/view/board/board/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field public static final c:Lcom/zykj/view/board/board/x$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/zykj/view/board/board/x$b;

    invoke-direct {v0}, Lcom/zykj/view/board/board/x$b;-><init>()V

    sput-object v0, Lcom/zykj/view/board/board/x$b;->c:Lcom/zykj/view/board/board/x$b;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    const v0, 0x3f23d70a    # 0.64f

    .line 2
    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    const/4 v2, 0x1

    .line 6
    invoke-direct {p0, v2, v0, v1}, Lcom/zykj/view/board/board/x;-><init>(IFLkotlin/jvm/internal/n;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method
