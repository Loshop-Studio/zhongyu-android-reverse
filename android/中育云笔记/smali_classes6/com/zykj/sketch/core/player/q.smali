.class public final synthetic Lcom/zykj/sketch/core/player/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c:Lcom/zykj/sketch/core/player/SketchPlayerView;

.field public final synthetic d:Lhd/l;

.field public final synthetic e:Ljava/io/IOException;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/sketch/core/player/SketchPlayerView;Lhd/l;Ljava/io/IOException;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/sketch/core/player/q;->c:Lcom/zykj/sketch/core/player/SketchPlayerView;

    iput-object p2, p0, Lcom/zykj/sketch/core/player/q;->d:Lhd/l;

    iput-object p3, p0, Lcom/zykj/sketch/core/player/q;->e:Ljava/io/IOException;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/player/q;->c:Lcom/zykj/sketch/core/player/SketchPlayerView;

    iget-object v1, p0, Lcom/zykj/sketch/core/player/q;->d:Lhd/l;

    iget-object v2, p0, Lcom/zykj/sketch/core/player/q;->e:Ljava/io/IOException;

    invoke-static {v0, v1, v2}, Lcom/zykj/sketch/core/player/SketchPlayerView;->a(Lcom/zykj/sketch/core/player/SketchPlayerView;Lhd/l;Ljava/io/IOException;)V

    return-void
.end method
