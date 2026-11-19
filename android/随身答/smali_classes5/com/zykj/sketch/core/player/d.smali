.class public final synthetic Lcom/zykj/sketch/core/player/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lkotlin/jvm/functions/Function1;

.field public final synthetic b:Ljava/io/FileNotFoundException;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Ljava/io/FileNotFoundException;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/sketch/core/player/d;->a:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lcom/zykj/sketch/core/player/d;->b:Ljava/io/FileNotFoundException;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/player/d;->a:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lcom/zykj/sketch/core/player/d;->b:Ljava/io/FileNotFoundException;

    invoke-static {v0, v1}, Lcom/zykj/sketch/core/player/SketchPlayerView;->c(Lkotlin/jvm/functions/Function1;Ljava/io/FileNotFoundException;)V

    return-void
.end method
