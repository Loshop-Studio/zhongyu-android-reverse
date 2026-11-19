.class Lcom/zykj/paint/render/SketchPlayer$4;
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
    iput-object p1, p0, Lcom/zykj/paint/render/SketchPlayer$4;->this$0:Lcom/zykj/paint/render/SketchPlayer;

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
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/zykj/paint/render/SketchPlayer$4;->this$0:Lcom/zykj/paint/render/SketchPlayer;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/zykj/paint/render/SketchPlayer;->access$700(Lcom/zykj/paint/render/SketchPlayer;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {p1, v0}, Lcom/zykj/paint/render/SketchPlayer;->access$800(Lcom/zykj/paint/render/SketchPlayer;Ljava/util/List;)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    const-string v1, "totalTime--->>>"

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    const-string v1, "SketchPlayer"

    .line 29
    .line 30
    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 31
    .line 32
    .line 33
    if-lez p1, :cond_1

    .line 34
    .line 35
    iget-object p1, p0, Lcom/zykj/paint/render/SketchPlayer$4;->this$0:Lcom/zykj/paint/render/SketchPlayer;

    .line 36
    .line 37
    invoke-static {p1}, Lcom/zykj/paint/render/SketchPlayer;->access$000(Lcom/zykj/paint/render/SketchPlayer;)Lcom/zykj/paint/player/PlayActionListener;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    if-eqz p1, :cond_1

    .line 42
    .line 43
    iget-object p1, p0, Lcom/zykj/paint/render/SketchPlayer$4;->this$0:Lcom/zykj/paint/render/SketchPlayer;

    .line 44
    .line 45
    invoke-static {p1}, Lcom/zykj/paint/render/SketchPlayer;->access$200(Lcom/zykj/paint/render/SketchPlayer;)Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    if-eqz p1, :cond_0

    .line 50
    .line 51
    iget-object p1, p0, Lcom/zykj/paint/render/SketchPlayer$4;->this$0:Lcom/zykj/paint/render/SketchPlayer;

    .line 52
    .line 53
    invoke-virtual {p1}, Lcom/zykj/paint/render/SketchPlayer;->resumePlayer()V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :cond_0
    iget-object p1, p0, Lcom/zykj/paint/render/SketchPlayer$4;->this$0:Lcom/zykj/paint/render/SketchPlayer;

    .line 58
    .line 59
    invoke-virtual {p1}, Lcom/zykj/paint/render/SketchPlayer;->pausePlayer()V

    .line 60
    .line 61
    .line 62
    :cond_1
    return-void
.end method
