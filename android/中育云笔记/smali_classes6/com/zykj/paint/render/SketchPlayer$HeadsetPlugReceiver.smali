.class public Lcom/zykj/paint/render/SketchPlayer$HeadsetPlugReceiver;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/paint/render/SketchPlayer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "HeadsetPlugReceiver"
.end annotation


# instance fields
.field private audioManager:Landroid/media/AudioManager;

.field final synthetic this$0:Lcom/zykj/paint/render/SketchPlayer;


# direct methods
.method public constructor <init>(Lcom/zykj/paint/render/SketchPlayer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/paint/render/SketchPlayer$HeadsetPlugReceiver;->this$0:Lcom/zykj/paint/render/SketchPlayer;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    .line 1
    const-string v0, "audio"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Landroid/media/AudioManager;

    .line 8
    .line 9
    iput-object p1, p0, Lcom/zykj/paint/render/SketchPlayer$HeadsetPlugReceiver;->audioManager:Landroid/media/AudioManager;

    .line 10
    .line 11
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const-string v0, "android.intent.action.HEADSET_PLUG"

    .line 16
    .line 17
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-eqz p1, :cond_1

    .line 22
    .line 23
    const-string p1, "state"

    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    invoke-virtual {p2, p1, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    const/4 p2, 0x1

    .line 31
    if-nez p1, :cond_0

    .line 32
    .line 33
    iget-object p1, p0, Lcom/zykj/paint/render/SketchPlayer$HeadsetPlugReceiver;->audioManager:Landroid/media/AudioManager;

    .line 34
    .line 35
    invoke-virtual {p1, p2}, Landroid/media/AudioManager;->setSpeakerphoneOn(Z)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_0
    if-ne p1, p2, :cond_1

    .line 40
    .line 41
    iget-object p1, p0, Lcom/zykj/paint/render/SketchPlayer$HeadsetPlugReceiver;->audioManager:Landroid/media/AudioManager;

    .line 42
    .line 43
    invoke-virtual {p1, v0}, Landroid/media/AudioManager;->setSpeakerphoneOn(Z)V

    .line 44
    .line 45
    .line 46
    :cond_1
    return-void
.end method
