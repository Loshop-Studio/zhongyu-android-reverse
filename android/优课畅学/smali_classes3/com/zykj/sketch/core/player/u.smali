.class public final synthetic Lcom/zykj/sketch/core/player/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/zykj/sketch/core/player/SketchPlayerView;

.field public final synthetic b:Lx7/l;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/sketch/core/player/SketchPlayerView;Lx7/l;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/sketch/core/player/u;->a:Lcom/zykj/sketch/core/player/SketchPlayerView;

    iput-object p2, p0, Lcom/zykj/sketch/core/player/u;->b:Lx7/l;

    iput p3, p0, Lcom/zykj/sketch/core/player/u;->c:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/player/u;->a:Lcom/zykj/sketch/core/player/SketchPlayerView;

    iget-object v1, p0, Lcom/zykj/sketch/core/player/u;->b:Lx7/l;

    iget v2, p0, Lcom/zykj/sketch/core/player/u;->c:I

    invoke-static {v0, v1, v2}, Lcom/zykj/sketch/core/player/SketchPlayerView$loadData$1$1$1;->a(Lcom/zykj/sketch/core/player/SketchPlayerView;Lx7/l;I)V

    return-void
.end method
