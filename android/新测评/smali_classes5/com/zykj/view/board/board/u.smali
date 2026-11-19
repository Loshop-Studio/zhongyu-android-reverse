.class public abstract Lcom/zykj/view/board/board/u;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/view/board/board/u$a;,
        Lcom/zykj/view/board/board/u$b;,
        Lcom/zykj/view/board/board/u$c;,
        Lcom/zykj/view/board/board/u$d;,
        Lcom/zykj/view/board/board/u$e;,
        Lcom/zykj/view/board/board/u$f;,
        Lcom/zykj/view/board/board/u$g;,
        Lcom/zykj/view/board/board/u$h;,
        Lcom/zykj/view/board/board/u$i;,
        Lcom/zykj/view/board/board/u$j;,
        Lcom/zykj/view/board/board/u$k;
    }
.end annotation


# instance fields
.field public final a:I

.field public final b:F


# direct methods
.method public constructor <init>(IF)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/zykj/view/board/board/u;->a:I

    iput p2, p0, Lcom/zykj/view/board/board/u;->b:F

    return-void
.end method

.method public synthetic constructor <init>(IFLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/zykj/view/board/board/u;-><init>(IF)V

    return-void
.end method


# virtual methods
.method public final a()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/view/board/board/u;->b:F

    .line 2
    .line 3
    return v0
.end method
