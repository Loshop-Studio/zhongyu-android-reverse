.class public final Lcom/zykj/view/board/board/b$e;
.super Lcom/zykj/view/board/board/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/view/board/board/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation


# static fields
.field public static final f:Lcom/zykj/view/board/board/b$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/zykj/view/board/board/b$e;

    invoke-direct {v0}, Lcom/zykj/view/board/board/b$e;-><init>()V

    sput-object v0, Lcom/zykj/view/board/board/b$e;->f:Lcom/zykj/view/board/board/b$e;

    return-void
.end method

.method public constructor <init>()V
    .locals 8

    .line 1
    const-string v0, "#F6F0E8"

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
    sget-object v4, Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;->c:Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;

    .line 14
    .line 15
    const/high16 v6, 0x42d80000    # 108.0f

    .line 16
    .line 17
    const/4 v7, 0x0

    .line 18
    const/4 v2, 0x5

    .line 19
    move-object v1, p0

    .line 20
    invoke-direct/range {v1 .. v7}, Lcom/zykj/view/board/board/b;-><init>(IILcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;IFLkotlin/jvm/internal/n;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method
