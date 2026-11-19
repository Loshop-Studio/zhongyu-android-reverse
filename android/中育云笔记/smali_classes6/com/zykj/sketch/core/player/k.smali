.class public final synthetic Lcom/zykj/sketch/core/player/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c:Lcom/zykj/sketch/core/player/SketchPlayerView;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Lhd/l;

.field public final synthetic f:Lhd/l;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/sketch/core/player/SketchPlayerView;Ljava/lang/String;Lhd/l;Lhd/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/sketch/core/player/k;->c:Lcom/zykj/sketch/core/player/SketchPlayerView;

    iput-object p2, p0, Lcom/zykj/sketch/core/player/k;->d:Ljava/lang/String;

    iput-object p3, p0, Lcom/zykj/sketch/core/player/k;->e:Lhd/l;

    iput-object p4, p0, Lcom/zykj/sketch/core/player/k;->f:Lhd/l;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/player/k;->c:Lcom/zykj/sketch/core/player/SketchPlayerView;

    iget-object v1, p0, Lcom/zykj/sketch/core/player/k;->d:Ljava/lang/String;

    iget-object v2, p0, Lcom/zykj/sketch/core/player/k;->e:Lhd/l;

    iget-object v3, p0, Lcom/zykj/sketch/core/player/k;->f:Lhd/l;

    invoke-static {v0, v1, v2, v3}, Lcom/zykj/sketch/core/player/SketchPlayerView;->k(Lcom/zykj/sketch/core/player/SketchPlayerView;Ljava/lang/String;Lhd/l;Lhd/l;)V

    return-void
.end method
