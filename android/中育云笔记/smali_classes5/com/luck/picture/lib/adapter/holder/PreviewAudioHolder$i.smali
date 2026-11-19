.class public Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder$i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/SeekBar$OnSeekBarChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->a(Lcom/luck/picture/lib/entity/LocalMedia;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic c:Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;


# direct methods
.method public constructor <init>(Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder$i;->c:Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onProgressChanged(Landroid/widget/SeekBar;IZ)V
    .locals 0

    .line 1
    if-eqz p3, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 4
    .line 5
    .line 6
    iget-object p3, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder$i;->c:Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;

    .line 7
    .line 8
    invoke-static {p3, p2}, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->u(Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;I)V

    .line 9
    .line 10
    .line 11
    iget-object p2, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder$i;->c:Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;

    .line 12
    .line 13
    invoke-static {p2}, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->m(Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;)Landroid/media/MediaPlayer;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    invoke-virtual {p2}, Landroid/media/MediaPlayer;->isPlaying()Z

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    if-eqz p2, :cond_0

    .line 22
    .line 23
    iget-object p2, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder$i;->c:Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;

    .line 24
    .line 25
    invoke-static {p2}, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->m(Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;)Landroid/media/MediaPlayer;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    invoke-virtual {p1}, Landroid/widget/ProgressBar;->getProgress()I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    invoke-virtual {p2, p1}, Landroid/media/MediaPlayer;->seekTo(I)V

    .line 34
    .line 35
    .line 36
    :cond_0
    return-void
.end method

.method public onStartTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 0

    return-void
.end method

.method public onStopTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 0

    return-void
.end method
