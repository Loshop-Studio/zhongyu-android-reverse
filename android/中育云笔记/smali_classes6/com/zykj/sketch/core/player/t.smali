.class public final synthetic Lcom/zykj/sketch/core/player/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c:Lhd/l;

.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(Lhd/l;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/sketch/core/player/t;->c:Lhd/l;

    iput p2, p0, Lcom/zykj/sketch/core/player/t;->d:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/player/t;->c:Lhd/l;

    iget v1, p0, Lcom/zykj/sketch/core/player/t;->d:I

    invoke-static {v0, v1}, Lcom/zykj/sketch/core/player/SketchPlayerView$loadData$1$1$1;->c(Lhd/l;I)V

    return-void
.end method
