.class public abstract Lcom/zykj/view/board/board/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/view/board/board/b$a;,
        Lcom/zykj/view/board/board/b$b;,
        Lcom/zykj/view/board/board/b$c;,
        Lcom/zykj/view/board/board/b$d;,
        Lcom/zykj/view/board/board/b$e;,
        Lcom/zykj/view/board/board/b$f;
    }
.end annotation


# instance fields
.field public final a:I

.field public final b:I

.field public final c:Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;

.field public final d:I

.field public final e:F


# direct methods
.method public constructor <init>(IILcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;IF)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lcom/zykj/view/board/board/b;->a:I

    .line 4
    iput p2, p0, Lcom/zykj/view/board/board/b;->b:I

    .line 5
    iput-object p3, p0, Lcom/zykj/view/board/board/b;->c:Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;

    .line 6
    iput p4, p0, Lcom/zykj/view/board/board/b;->d:I

    .line 7
    iput p5, p0, Lcom/zykj/view/board/board/b;->e:F

    return-void
.end method

.method public synthetic constructor <init>(IILcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;IFILkotlin/jvm/internal/n;)V
    .locals 7

    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_0

    const/4 p2, -0x1

    :cond_0
    move v2, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_1

    .line 8
    sget-object p3, Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;->c:Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;

    :cond_1
    move-object v3, p3

    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_2

    const/4 p4, 0x0

    :cond_2
    move v4, p4

    and-int/lit8 p2, p6, 0x10

    if-eqz p2, :cond_3

    const/high16 p5, 0x42800000    # 64.0f

    :cond_3
    move v5, p5

    const/4 v6, 0x0

    move-object v0, p0

    move v1, p1

    .line 9
    invoke-direct/range {v0 .. v6}, Lcom/zykj/view/board/board/b;-><init>(IILcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;IFLkotlin/jvm/internal/n;)V

    return-void
.end method

.method public synthetic constructor <init>(IILcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;IFLkotlin/jvm/internal/n;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, Lcom/zykj/view/board/board/b;-><init>(IILcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;IF)V

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/view/board/board/b;->b:I

    .line 2
    .line 3
    return v0
.end method

.method public final b()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/view/board/board/b;->d:I

    .line 2
    .line 3
    return v0
.end method

.method public final c()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/view/board/board/b;->e:F

    .line 2
    .line 3
    return v0
.end method

.method public final d()Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/b;->c:Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/view/board/board/b;->a:I

    .line 2
    .line 3
    return v0
.end method
