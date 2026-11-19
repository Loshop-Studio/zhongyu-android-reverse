.class public final synthetic Lcom/zykj/sketch/core/player/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lx7/l;

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lx7/l;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/sketch/core/player/l;->a:Lx7/l;

    iput-object p2, p0, Lcom/zykj/sketch/core/player/l;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/player/l;->a:Lx7/l;

    iget-object v1, p0, Lcom/zykj/sketch/core/player/l;->b:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/zykj/sketch/core/player/SketchPlayerView;->h(Lx7/l;Ljava/lang/String;)V

    return-void
.end method
