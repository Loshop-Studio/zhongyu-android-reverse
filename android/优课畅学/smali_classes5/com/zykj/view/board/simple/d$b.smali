.class public final Lcom/zykj/view/board/simple/d$b;
.super Lcom/zykj/view/board/simple/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/view/board/simple/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field public static final d:Lcom/zykj/view/board/simple/d$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/zykj/view/board/simple/d$b;

    invoke-direct {v0}, Lcom/zykj/view/board/simple/d$b;-><init>()V

    sput-object v0, Lcom/zykj/view/board/simple/d$b;->d:Lcom/zykj/view/board/simple/d$b;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x2

    .line 4
    invoke-direct {p0, v2, v0, v0, v1}, Lcom/zykj/view/board/simple/d;-><init>(IIZLkotlin/jvm/internal/n;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method
