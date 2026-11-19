.class public Lcom/zykj/paint/data/Vector2D;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public x:D

.field public y:D


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    .line 2
    iput-wide v0, p0, Lcom/zykj/paint/data/Vector2D;->x:D

    .line 3
    iput-wide v0, p0, Lcom/zykj/paint/data/Vector2D;->y:D

    return-void
.end method

.method public constructor <init>(DD)V
    .locals 0

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-wide p1, p0, Lcom/zykj/paint/data/Vector2D;->x:D

    .line 6
    iput-wide p3, p0, Lcom/zykj/paint/data/Vector2D;->y:D

    return-void
.end method
