.class public final synthetic Lcom/zykj/sketch/core/player/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lkotlin/jvm/functions/Function1;

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/sketch/core/player/j;->a:Lkotlin/jvm/functions/Function1;

    iput p2, p0, Lcom/zykj/sketch/core/player/j;->b:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/player/j;->a:Lkotlin/jvm/functions/Function1;

    iget v1, p0, Lcom/zykj/sketch/core/player/j;->b:I

    invoke-static {v0, v1}, Lcom/zykj/sketch/core/player/SketchPlayerView;->e(Lkotlin/jvm/functions/Function1;I)V

    return-void
.end method
