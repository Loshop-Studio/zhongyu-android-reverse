.class public final synthetic Lcom/zykj/merge/sketch/view/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lkotlin/jvm/functions/Function1;

.field public final synthetic b:Lcom/zykj/merge/sketch/view/OldSketchProxyView;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lcom/zykj/merge/sketch/view/OldSketchProxyView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/merge/sketch/view/g;->a:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lcom/zykj/merge/sketch/view/g;->b:Lcom/zykj/merge/sketch/view/OldSketchProxyView;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/g;->a:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lcom/zykj/merge/sketch/view/g;->b:Lcom/zykj/merge/sketch/view/OldSketchProxyView;

    invoke-static {v0, v1}, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->g(Lkotlin/jvm/functions/Function1;Lcom/zykj/merge/sketch/view/OldSketchProxyView;)V

    return-void
.end method
