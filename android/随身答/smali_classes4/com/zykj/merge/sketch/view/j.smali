.class public final synthetic Lcom/zykj/merge/sketch/view/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/zykj/merge/sketch/view/OldSketchProxyView;

.field public final synthetic b:Lkotlin/jvm/functions/Function1;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/merge/sketch/view/OldSketchProxyView;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/merge/sketch/view/j;->a:Lcom/zykj/merge/sketch/view/OldSketchProxyView;

    iput-object p2, p0, Lcom/zykj/merge/sketch/view/j;->b:Lkotlin/jvm/functions/Function1;

    iput p3, p0, Lcom/zykj/merge/sketch/view/j;->c:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/j;->a:Lcom/zykj/merge/sketch/view/OldSketchProxyView;

    iget-object v1, p0, Lcom/zykj/merge/sketch/view/j;->b:Lkotlin/jvm/functions/Function1;

    iget v2, p0, Lcom/zykj/merge/sketch/view/j;->c:I

    invoke-static {v0, v1, v2}, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->c(Lcom/zykj/merge/sketch/view/OldSketchProxyView;Lkotlin/jvm/functions/Function1;I)V

    return-void
.end method
