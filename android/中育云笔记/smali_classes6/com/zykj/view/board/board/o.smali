.class public abstract Lcom/zykj/view/board/board/o;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/view/board/board/o$a;,
        Lcom/zykj/view/board/board/o$b;,
        Lcom/zykj/view/board/board/o$c;,
        Lcom/zykj/view/board/board/o$d;
    }
.end annotation


# instance fields
.field public final a:Z

.field public final b:Z

.field public final c:Z

.field public final d:Lcom/zykj/blackboard/core/action/GeometryActionEnum;


# direct methods
.method public constructor <init>(ZZZLcom/zykj/blackboard/core/action/GeometryActionEnum;)V
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
    iput-object p4, p0, Lcom/zykj/view/board/board/o;->d:Lcom/zykj/blackboard/core/action/GeometryActionEnum;

    return-void
.end method

.method public synthetic constructor <init>(ZZZLcom/zykj/blackboard/core/action/GeometryActionEnum;ILkotlin/jvm/internal/n;)V
    .locals 7

    and-int/lit8 p6, p5, 0x1

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move v2, v0

    goto :goto_0

    :cond_0
    move v2, p1

    :goto_0
    and-int/lit8 p1, p5, 0x2

    if-eqz p1, :cond_1

    move v3, v0

    goto :goto_1

    :cond_1
    move v3, p2

    :goto_1
    and-int/lit8 p1, p5, 0x4

    if-eqz p1, :cond_2

    move v4, v0

    goto :goto_2

    :cond_2
    move v4, p3

    :goto_2
    and-int/lit8 p1, p5, 0x8

    if-eqz p1, :cond_3

    .line 7
    sget-object p4, Lcom/zykj/blackboard/core/action/GeometryActionEnum;->d:Lcom/zykj/blackboard/core/action/GeometryActionEnum;

    :cond_3
    move-object v5, p4

    const/4 v6, 0x0

    move-object v1, p0

    .line 8
    invoke-direct/range {v1 .. v6}, Lcom/zykj/view/board/board/o;-><init>(ZZZLcom/zykj/blackboard/core/action/GeometryActionEnum;Lkotlin/jvm/internal/n;)V

    return-void
.end method

.method public synthetic constructor <init>(ZZZLcom/zykj/blackboard/core/action/GeometryActionEnum;Lkotlin/jvm/internal/n;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/zykj/view/board/board/o;-><init>(ZZZLcom/zykj/blackboard/core/action/GeometryActionEnum;)V

    return-void
.end method


# virtual methods
.method public final a()Lcom/zykj/blackboard/core/action/GeometryActionEnum;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/o;->d:Lcom/zykj/blackboard/core/action/GeometryActionEnum;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/view/board/board/o;->b:Z

    .line 2
    .line 3
    return v0
.end method

.method public final c()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/view/board/board/o;->a:Z

    .line 2
    .line 3
    return v0
.end method

.method public final d()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/view/board/board/o;->c:Z

    .line 2
    .line 3
    return v0
.end method
