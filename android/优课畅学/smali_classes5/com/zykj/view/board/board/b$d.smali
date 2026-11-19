.class public final Lcom/zykj/view/board/board/b$d;
.super Lcom/zykj/view/board/board/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/view/board/board/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# static fields
.field public static final f:Lcom/zykj/view/board/board/b$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/zykj/view/board/board/b$d;

    invoke-direct {v0}, Lcom/zykj/view/board/board/b$d;-><init>()V

    sput-object v0, Lcom/zykj/view/board/board/b$d;->f:Lcom/zykj/view/board/board/b$d;

    return-void
.end method

.method public constructor <init>()V
    .locals 9

    .line 1
    const-string v0, "#FFFFFF"

    .line 2
    .line 3
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 4
    .line 5
    .line 6
    move-result v3

    .line 7
    const/16 v7, 0x1c

    .line 8
    .line 9
    const/4 v8, 0x0

    .line 10
    const/4 v2, 0x0

    .line 11
    const/4 v4, 0x0

    .line 12
    const/4 v5, 0x0

    .line 13
    const/4 v6, 0x0

    .line 14
    move-object v1, p0

    .line 15
    invoke-direct/range {v1 .. v8}, Lcom/zykj/view/board/board/b;-><init>(IILcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;IFILkotlin/jvm/internal/n;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method
