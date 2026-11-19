.class public final synthetic Lcom/zykj/view/widget/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/zykj/view/widget/SketchProgressView;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/view/widget/SketchProgressView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/view/widget/b;->a:Lcom/zykj/view/widget/SketchProgressView;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/widget/b;->a:Lcom/zykj/view/widget/SketchProgressView;

    invoke-static {v0}, Lcom/zykj/view/widget/SketchProgressView$showView$1;->c(Lcom/zykj/view/widget/SketchProgressView;)V

    return-void
.end method
