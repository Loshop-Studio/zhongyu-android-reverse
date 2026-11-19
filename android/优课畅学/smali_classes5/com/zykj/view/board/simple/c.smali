.class public abstract Lcom/zykj/view/board/simple/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/view/board/simple/c$a;,
        Lcom/zykj/view/board/simple/c$b;,
        Lcom/zykj/view/board/simple/c$c;
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

    .line 3
    iput p1, p0, Lcom/zykj/view/board/simple/c;->a:I

    .line 4
    iput p2, p0, Lcom/zykj/view/board/simple/c;->b:F

    return-void
.end method

.method public synthetic constructor <init>(IFLkotlin/jvm/internal/n;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/zykj/view/board/simple/c;-><init>(IF)V

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/view/board/simple/c;->a:I

    .line 2
    .line 3
    return v0
.end method

.method public final b()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/view/board/simple/c;->b:F

    .line 2
    .line 3
    return v0
.end method
