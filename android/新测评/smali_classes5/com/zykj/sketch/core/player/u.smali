.class public final synthetic Lcom/zykj/sketch/core/player/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/zykj/sketch/core/player/SketchPlayerView;

.field public final synthetic b:Lkotlin/jvm/functions/Function1;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/sketch/core/player/SketchPlayerView;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/sketch/core/player/u;->a:Lcom/zykj/sketch/core/player/SketchPlayerView;

    iput-object p2, p0, Lcom/zykj/sketch/core/player/u;->b:Lkotlin/jvm/functions/Function1;

    iput p3, p0, Lcom/zykj/sketch/core/player/u;->c:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/player/u;->a:Lcom/zykj/sketch/core/player/SketchPlayerView;

    iget-object v1, p0, Lcom/zykj/sketch/core/player/u;->b:Lkotlin/jvm/functions/Function1;

    iget v2, p0, Lcom/zykj/sketch/core/player/u;->c:I

    invoke-static {v0, v1, v2}, Lcom/zykj/sketch/core/player/SketchPlayerView$loadData$1$1$1;->a(Lcom/zykj/sketch/core/player/SketchPlayerView;Lkotlin/jvm/functions/Function1;I)V

    return-void
.end method
