.class public final synthetic Lcom/zykj/sketch/core/player/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c:Lhd/l;

.field public final synthetic d:Ljava/io/IOException;


# direct methods
.method public synthetic constructor <init>(Lhd/l;Ljava/io/IOException;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/sketch/core/player/h;->c:Lhd/l;

    iput-object p2, p0, Lcom/zykj/sketch/core/player/h;->d:Ljava/io/IOException;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/player/h;->c:Lhd/l;

    iget-object v1, p0, Lcom/zykj/sketch/core/player/h;->d:Ljava/io/IOException;

    invoke-static {v0, v1}, Lcom/zykj/sketch/core/player/SketchPlayerView;->l(Lhd/l;Ljava/io/IOException;)V

    return-void
.end method
