.class public final synthetic Lh4/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/zykj/paint/render/SketchViewer;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/paint/render/SketchViewer;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh4/b;->a:Lcom/zykj/paint/render/SketchViewer;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lh4/b;->a:Lcom/zykj/paint/render/SketchViewer;

    invoke-static {v0}, Lcom/zykj/paint/render/SketchViewer;->a(Lcom/zykj/paint/render/SketchViewer;)V

    return-void
.end method
