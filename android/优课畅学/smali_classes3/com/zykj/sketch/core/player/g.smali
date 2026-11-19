.class public final synthetic Lcom/zykj/sketch/core/player/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/zykj/sketch/core/player/SketchPlayerView;

.field public final synthetic b:Lx7/l;

.field public final synthetic c:Ljava/lang/Throwable;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/sketch/core/player/SketchPlayerView;Lx7/l;Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/sketch/core/player/g;->a:Lcom/zykj/sketch/core/player/SketchPlayerView;

    iput-object p2, p0, Lcom/zykj/sketch/core/player/g;->b:Lx7/l;

    iput-object p3, p0, Lcom/zykj/sketch/core/player/g;->c:Ljava/lang/Throwable;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/player/g;->a:Lcom/zykj/sketch/core/player/SketchPlayerView;

    iget-object v1, p0, Lcom/zykj/sketch/core/player/g;->b:Lx7/l;

    iget-object v2, p0, Lcom/zykj/sketch/core/player/g;->c:Ljava/lang/Throwable;

    invoke-static {v0, v1, v2}, Lcom/zykj/sketch/core/player/SketchPlayerView;->o(Lcom/zykj/sketch/core/player/SketchPlayerView;Lx7/l;Ljava/lang/Throwable;)V

    return-void
.end method
