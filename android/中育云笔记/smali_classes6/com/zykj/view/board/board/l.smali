.class public abstract Lcom/zykj/view/board/board/l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/view/board/board/l$a;,
        Lcom/zykj/view/board/board/l$b;
    }
.end annotation


# instance fields
.field public final a:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/zykj/view/board/board/l;->a:I

    return-void
.end method

.method public synthetic constructor <init>(ILkotlin/jvm/internal/n;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/view/board/board/l;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/view/board/board/l;->a:I

    .line 2
    .line 3
    return v0
.end method
