.class public final synthetic Lcom/zykj/sketch/core/player/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/zykj/sketch/core/player/SketchPlayerView;

.field public final synthetic b:I

.field public final synthetic c:Lkotlin/jvm/functions/Function1;

.field public final synthetic d:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/sketch/core/player/SketchPlayerView;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/sketch/core/player/i;->a:Lcom/zykj/sketch/core/player/SketchPlayerView;

    iput p2, p0, Lcom/zykj/sketch/core/player/i;->b:I

    iput-object p3, p0, Lcom/zykj/sketch/core/player/i;->c:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Lcom/zykj/sketch/core/player/i;->d:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/player/i;->a:Lcom/zykj/sketch/core/player/SketchPlayerView;

    iget v1, p0, Lcom/zykj/sketch/core/player/i;->b:I

    iget-object v2, p0, Lcom/zykj/sketch/core/player/i;->c:Lkotlin/jvm/functions/Function1;

    iget-object v3, p0, Lcom/zykj/sketch/core/player/i;->d:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, v2, v3}, Lcom/zykj/sketch/core/player/SketchPlayerView;->m(Lcom/zykj/sketch/core/player/SketchPlayerView;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method
