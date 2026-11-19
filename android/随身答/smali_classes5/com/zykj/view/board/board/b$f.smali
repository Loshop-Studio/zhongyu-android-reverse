.class public final Lcom/zykj/view/board/board/b$f;
.super Lcom/zykj/view/board/board/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/view/board/board/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "f"
.end annotation


# static fields
.field public static final f:Lcom/zykj/view/board/board/b$f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/zykj/view/board/board/b$f;

    invoke-direct {v0}, Lcom/zykj/view/board/board/b$f;-><init>()V

    sput-object v0, Lcom/zykj/view/board/board/b$f;->f:Lcom/zykj/view/board/board/b$f;

    return-void
.end method

.method public constructor <init>()V
    .locals 8

    .line 1
    const-string v0, "#F6F0E9"

    .line 2
    .line 3
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 4
    .line 5
    .line 6
    move-result v3

    .line 7
    const-string v0, "#B0AEAE"

    .line 8
    .line 9
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 10
    .line 11
    .line 12
    move-result v5

    .line 13
    sget-object v4, Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;->b:Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;

    .line 14
    .line 15
    const/high16 v6, 0x42800000    # 64.0f

    .line 16
    .line 17
    const/4 v7, 0x0

    .line 18
    const/4 v2, 0x4

    .line 19
    move-object v1, p0

    .line 20
    invoke-direct/range {v1 .. v7}, Lcom/zykj/view/board/board/b;-><init>(IILcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;IFLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of p1, p1, Lcom/zykj/view/board/board/b$f;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    return v0
.end method

.method public hashCode()I
    .locals 1

    const v0, 0x71f7d52a

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "LineInterweave"

    return-object v0
.end method
