.class public final Lcom/zykj/view/board/board/x$d;
.super Lcom/zykj/view/board/board/x;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/view/board/board/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# static fields
.field public static final c:Lcom/zykj/view/board/board/x$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/zykj/view/board/board/x$d;

    invoke-direct {v0}, Lcom/zykj/view/board/board/x$d;-><init>()V

    sput-object v0, Lcom/zykj/view/board/board/x$d;->c:Lcom/zykj/view/board/board/x$d;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    const/high16 v0, 0x3f800000    # 1.0f

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x3

    .line 5
    invoke-direct {p0, v2, v0, v1}, Lcom/zykj/view/board/board/x;-><init>(IFLkotlin/jvm/internal/n;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
