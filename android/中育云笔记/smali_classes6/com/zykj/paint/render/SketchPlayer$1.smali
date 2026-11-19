.class Lcom/zykj/paint/render/SketchPlayer$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/paint/render/SketchPlayer;->init(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/zykj/paint/render/SketchPlayer;


# direct methods
.method public constructor <init>(Lcom/zykj/paint/render/SketchPlayer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/paint/render/SketchPlayer$1;->this$0:Lcom/zykj/paint/render/SketchPlayer;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/zykj/paint/render/SketchPlayer$1;->this$0:Lcom/zykj/paint/render/SketchPlayer;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/zykj/paint/render/SketchPlayer;->access$000(Lcom/zykj/paint/render/SketchPlayer;)Lcom/zykj/paint/player/PlayActionListener;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {p1}, Lcom/zykj/paint/player/PlayActionListener;->onRerecord()V

    .line 8
    .line 9
    .line 10
    return-void
.end method
