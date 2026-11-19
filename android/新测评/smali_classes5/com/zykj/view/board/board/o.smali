.class public abstract Lcom/zykj/view/board/board/o;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/view/board/board/o$a;,
        Lcom/zykj/view/board/board/o$b;,
        Lcom/zykj/view/board/board/o$c;,
        Lcom/zykj/view/board/board/o$d;,
        Lcom/zykj/view/board/board/o$e;,
        Lcom/zykj/view/board/board/o$f;
    }
.end annotation


# instance fields
.field public final a:Z

.field public final b:Z

.field public final c:Z

.field public final d:Z

.field public final e:Z


# direct methods
.method public constructor <init>(ZZZZZ)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-boolean p1, p0, Lcom/zykj/view/board/board/o;->a:Z

    .line 4
    iput-boolean p2, p0, Lcom/zykj/view/board/board/o;->b:Z

    .line 5
    iput-boolean p3, p0, Lcom/zykj/view/board/board/o;->c:Z

    .line 6
    iput-boolean p4, p0, Lcom/zykj/view/board/board/o;->d:Z

    .line 7
    iput-boolean p5, p0, Lcom/zykj/view/board/board/o;->e:Z

    return-void
.end method

.method public synthetic constructor <init>(ZZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 8

    and-int/lit8 p7, p6, 0x1

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    move v2, v0

    goto :goto_0

    :cond_0
    move v2, p1

    :goto_0
    and-int/lit8 p1, p6, 0x2

    if-eqz p1, :cond_1

    move v3, v0

    goto :goto_1

    :cond_1
    move v3, p2

    :goto_1
    and-int/lit8 p1, p6, 0x4

    if-eqz p1, :cond_2

    move v4, v0

    goto :goto_2

    :cond_2
    move v4, p3

    :goto_2
    and-int/lit8 p1, p6, 0x8

    if-eqz p1, :cond_3

    move v5, v0

    goto :goto_3

    :cond_3
    move v5, p4

    :goto_3
    and-int/lit8 p1, p6, 0x10

    if-eqz p1, :cond_4

    move v6, v0

    goto :goto_4

    :cond_4
    move v6, p5

    :goto_4
    const/4 v7, 0x0

    move-object v1, p0

    .line 8
    invoke-direct/range {v1 .. v7}, Lcom/zykj/view/board/board/o;-><init>(ZZZZZLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(ZZZZZLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, Lcom/zykj/view/board/board/o;-><init>(ZZZZZ)V

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/view/board/board/o;->e:Z

    .line 2
    .line 3
    return v0
.end method

.method public final b()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/view/board/board/o;->c:Z

    .line 2
    .line 3
    return v0
.end method

.method public final c()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/view/board/board/o;->d:Z

    .line 2
    .line 3
    return v0
.end method

.method public final d()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/view/board/board/o;->b:Z

    .line 2
    .line 3
    return v0
.end method

.method public final e()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/view/board/board/o;->a:Z

    .line 2
    .line 3
    return v0
.end method
