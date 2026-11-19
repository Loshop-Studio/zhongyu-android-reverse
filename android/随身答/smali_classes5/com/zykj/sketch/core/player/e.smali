.class public final synthetic Lcom/zykj/sketch/core/player/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lkotlin/jvm/functions/Function1;

.field public final synthetic b:Lcom/zykj/sketch/exception/HighVersionException;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lcom/zykj/sketch/exception/HighVersionException;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/sketch/core/player/e;->a:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lcom/zykj/sketch/core/player/e;->b:Lcom/zykj/sketch/exception/HighVersionException;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/player/e;->a:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lcom/zykj/sketch/core/player/e;->b:Lcom/zykj/sketch/exception/HighVersionException;

    invoke-static {v0, v1}, Lcom/zykj/sketch/core/player/SketchPlayerView;->g(Lkotlin/jvm/functions/Function1;Lcom/zykj/sketch/exception/HighVersionException;)V

    return-void
.end method
