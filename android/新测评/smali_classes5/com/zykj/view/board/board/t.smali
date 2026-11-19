.class public abstract Lcom/zykj/view/board/board/t;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/view/board/board/t$a;,
        Lcom/zykj/view/board/board/t$b;,
        Lcom/zykj/view/board/board/t$c;
    }
.end annotation


# instance fields
.field public final a:I

.field public final b:Z

.field public final c:Z

.field public final d:Z

.field public final e:Z


# direct methods
.method public constructor <init>(IZZZZ)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lcom/zykj/view/board/board/t;->a:I

    .line 4
    iput-boolean p2, p0, Lcom/zykj/view/board/board/t;->b:Z

    .line 5
    iput-boolean p3, p0, Lcom/zykj/view/board/board/t;->c:Z

    .line 6
    iput-boolean p4, p0, Lcom/zykj/view/board/board/t;->d:Z

    .line 7
    iput-boolean p5, p0, Lcom/zykj/view/board/board/t;->e:Z

    return-void
.end method

.method public synthetic constructor <init>(IZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V
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
    invoke-direct/range {v3 .. v9}, Lcom/zykj/view/board/board/t;-><init>(IZZZZLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(IZZZZLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, Lcom/zykj/view/board/board/t;-><init>(IZZZZ)V

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/view/board/board/t;->a:I

    .line 2
    .line 3
    return v0
.end method

.method public final b()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/view/board/board/t;->d:Z

    .line 2
    .line 3
    return v0
.end method

.method public final c()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/view/board/board/t;->c:Z

    .line 2
    .line 3
    return v0
.end method

.method public final d()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/view/board/board/t;->e:Z

    .line 2
    .line 3
    return v0
.end method
