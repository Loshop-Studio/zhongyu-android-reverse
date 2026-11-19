.class public final synthetic Lcom/zykj/sketch/core/player/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lkotlin/jvm/functions/Function1;

.field public final synthetic b:Ljava/io/IOException;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Ljava/io/IOException;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/sketch/core/player/h;->a:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lcom/zykj/sketch/core/player/h;->b:Ljava/io/IOException;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/player/h;->a:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lcom/zykj/sketch/core/player/h;->b:Ljava/io/IOException;

    invoke-static {v0, v1}, Lcom/zykj/sketch/core/player/SketchPlayerView;->l(Lkotlin/jvm/functions/Function1;Ljava/io/IOException;)V

    return-void
.end method
