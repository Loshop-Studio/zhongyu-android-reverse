.class public final synthetic Lcom/zykj/merge/sketch/view/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/zykj/merge/sketch/view/OldSketchProxyView;

.field public final synthetic b:Lkotlin/jvm/functions/Function1;

.field public final synthetic c:Ljava/lang/Exception;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/merge/sketch/view/OldSketchProxyView;Lkotlin/jvm/functions/Function1;Ljava/lang/Exception;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/merge/sketch/view/k;->a:Lcom/zykj/merge/sketch/view/OldSketchProxyView;

    iput-object p2, p0, Lcom/zykj/merge/sketch/view/k;->b:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lcom/zykj/merge/sketch/view/k;->c:Ljava/lang/Exception;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/k;->a:Lcom/zykj/merge/sketch/view/OldSketchProxyView;

    iget-object v1, p0, Lcom/zykj/merge/sketch/view/k;->b:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lcom/zykj/merge/sketch/view/k;->c:Ljava/lang/Exception;

    invoke-static {v0, v1, v2}, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->h(Lcom/zykj/merge/sketch/view/OldSketchProxyView;Lkotlin/jvm/functions/Function1;Ljava/lang/Exception;)V

    return-void
.end method
