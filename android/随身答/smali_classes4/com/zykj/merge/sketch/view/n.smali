.class public final synthetic Lcom/zykj/merge/sketch/view/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/zykj/merge/sketch/view/OldSketchProxyView;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lkotlin/jvm/functions/Function1;

.field public final synthetic d:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/merge/sketch/view/OldSketchProxyView;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/merge/sketch/view/n;->a:Lcom/zykj/merge/sketch/view/OldSketchProxyView;

    iput-object p2, p0, Lcom/zykj/merge/sketch/view/n;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/zykj/merge/sketch/view/n;->c:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Lcom/zykj/merge/sketch/view/n;->d:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/n;->a:Lcom/zykj/merge/sketch/view/OldSketchProxyView;

    iget-object v1, p0, Lcom/zykj/merge/sketch/view/n;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/zykj/merge/sketch/view/n;->c:Lkotlin/jvm/functions/Function1;

    iget-object v3, p0, Lcom/zykj/merge/sketch/view/n;->d:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, v2, v3}, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->i(Lcom/zykj/merge/sketch/view/OldSketchProxyView;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method
