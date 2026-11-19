.class public final synthetic Lcom/zykj/sketch/core/player/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c:Lcom/zykj/sketch/core/player/SketchPlayerView;

.field public final synthetic d:Lhd/l;

.field public final synthetic e:Ljava/io/FileNotFoundException;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/sketch/core/player/SketchPlayerView;Lhd/l;Ljava/io/FileNotFoundException;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/sketch/core/player/p;->c:Lcom/zykj/sketch/core/player/SketchPlayerView;

    iput-object p2, p0, Lcom/zykj/sketch/core/player/p;->d:Lhd/l;

    iput-object p3, p0, Lcom/zykj/sketch/core/player/p;->e:Ljava/io/FileNotFoundException;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/player/p;->c:Lcom/zykj/sketch/core/player/SketchPlayerView;

    iget-object v1, p0, Lcom/zykj/sketch/core/player/p;->d:Lhd/l;

    iget-object v2, p0, Lcom/zykj/sketch/core/player/p;->e:Ljava/io/FileNotFoundException;

    invoke-static {v0, v1, v2}, Lcom/zykj/sketch/core/player/SketchPlayerView;->f(Lcom/zykj/sketch/core/player/SketchPlayerView;Lhd/l;Ljava/io/FileNotFoundException;)V

    return-void
.end method
