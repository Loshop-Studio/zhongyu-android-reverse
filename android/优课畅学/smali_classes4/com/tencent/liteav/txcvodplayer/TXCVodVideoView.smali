.class public Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$a;
    }
.end annotation


# instance fields
.field private A:I

.field private B:Ljava/lang/String;

.field private C:F

.field private D:Lcom/tencent/liteav/txcvodplayer/a/a;

.field private E:Lcom/tencent/liteav/txcvodplayer/a/b;

.field private F:J

.field private G:Z

.field private H:I

.field private I:F

.field private J:F

.field private K:Z

.field private L:I

.field private M:Z

.field private N:Lcom/tencent/liteav/txcvodplayer/b;

.field private O:Lcom/tencent/ijk/media/player/IMediaPlayer$OnCompletionListener;

.field private P:Lcom/tencent/ijk/media/player/IMediaPlayer$OnInfoListener;

.field private Q:I

.field private R:Lcom/tencent/ijk/media/player/IMediaPlayer$OnErrorListener;

.field private S:Lcom/tencent/ijk/media/player/IMediaPlayer$OnHevcVideoDecoderErrorListener;

.field private T:Lcom/tencent/ijk/media/player/IMediaPlayer$OnVideoDecoderErrorListener;

.field private U:Lcom/tencent/ijk/media/player/IMediaPlayer$OnBufferingUpdateListener;

.field private V:Lcom/tencent/ijk/media/player/IMediaPlayer$OnSeekCompleteListener;

.field private W:Lcom/tencent/ijk/media/player/IMediaPlayer$OnTimedTextListener;

.field protected a:Z

.field private aa:Lcom/tencent/ijk/media/player/IjkMediaPlayer$OnNativeInvokeListener;

.field private ab:Lcom/tencent/ijk/media/player/IMediaPlayer$OnHLSKeyErrorListener;

.field private ac:I

.field private ad:Lcom/tencent/liteav/txcvodplayer/e;

.field private ae:Landroid/os/Handler;

.field private af:Z

.field protected b:Z

.field protected c:Z

.field protected final d:I

.field e:Lcom/tencent/ijk/media/player/IMediaPlayer$OnVideoSizeChangedListener;

.field f:Lcom/tencent/ijk/media/player/IMediaPlayer$OnPreparedListener;

.field g:Lcom/tencent/liteav/txcvodplayer/a$a;

.field private h:Ljava/lang/String;

.field private i:Landroid/net/Uri;

.field private j:I

.field private k:I

.field private l:Lcom/tencent/liteav/txcvodplayer/a$b;

.field private m:Lcom/tencent/ijk/media/player/IMediaPlayer;

.field private n:I

.field private o:I

.field private p:I

.field private q:I

.field private r:I

.field private s:I

.field private t:I

.field private u:I

.field private v:I

.field private w:Landroid/content/Context;

.field private x:Lcom/tencent/liteav/txcvodplayer/d;

.field private y:Lcom/tencent/liteav/txcvodplayer/a;

.field private z:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    .line 1
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 2
    const-string v0, "TXCVodVideoView"

    iput-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->h:Ljava/lang/String;

    const/4 v0, 0x0

    .line 3
    iput v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->j:I

    .line 4
    iput v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->k:I

    const/4 v1, 0x0

    .line 5
    iput-object v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->l:Lcom/tencent/liteav/txcvodplayer/a$b;

    .line 6
    iput-object v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->m:Lcom/tencent/ijk/media/player/IMediaPlayer;

    const/4 v1, 0x1

    .line 7
    iput-boolean v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a:Z

    const/high16 v2, 0x3f800000    # 1.0f

    .line 8
    iput v2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->C:F

    .line 9
    invoke-static {}, Lcom/tencent/liteav/txcvodplayer/a/b;->a()Lcom/tencent/liteav/txcvodplayer/a/b;

    move-result-object v3

    iput-object v3, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->E:Lcom/tencent/liteav/txcvodplayer/a/b;

    .line 10
    iput-boolean v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->b:Z

    .line 11
    iput-boolean v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c:Z

    .line 12
    iput v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->d:I

    .line 13
    iput-boolean v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->G:Z

    const/4 v1, -0x1

    .line 14
    iput v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->H:I

    .line 15
    iput v2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->I:F

    .line 16
    iput v2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->J:F

    .line 17
    iput-boolean v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->K:Z

    .line 18
    new-instance v1, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$9;

    invoke-direct {v1, p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$9;-><init>(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)V

    iput-object v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->e:Lcom/tencent/ijk/media/player/IMediaPlayer$OnVideoSizeChangedListener;

    .line 19
    new-instance v1, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$10;

    invoke-direct {v1, p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$10;-><init>(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)V

    iput-object v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->f:Lcom/tencent/ijk/media/player/IMediaPlayer$OnPreparedListener;

    .line 20
    new-instance v1, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$11;

    invoke-direct {v1, p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$11;-><init>(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)V

    iput-object v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->O:Lcom/tencent/ijk/media/player/IMediaPlayer$OnCompletionListener;

    .line 21
    new-instance v1, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$12;

    invoke-direct {v1, p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$12;-><init>(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)V

    iput-object v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->P:Lcom/tencent/ijk/media/player/IMediaPlayer$OnInfoListener;

    .line 22
    new-instance v1, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$13;

    invoke-direct {v1, p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$13;-><init>(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)V

    iput-object v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->R:Lcom/tencent/ijk/media/player/IMediaPlayer$OnErrorListener;

    .line 23
    new-instance v1, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$14;

    invoke-direct {v1, p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$14;-><init>(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)V

    iput-object v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->S:Lcom/tencent/ijk/media/player/IMediaPlayer$OnHevcVideoDecoderErrorListener;

    .line 24
    new-instance v1, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$15;

    invoke-direct {v1, p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$15;-><init>(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)V

    iput-object v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->T:Lcom/tencent/ijk/media/player/IMediaPlayer$OnVideoDecoderErrorListener;

    .line 25
    new-instance v1, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$2;

    invoke-direct {v1, p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$2;-><init>(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)V

    iput-object v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->U:Lcom/tencent/ijk/media/player/IMediaPlayer$OnBufferingUpdateListener;

    .line 26
    new-instance v1, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$3;

    invoke-direct {v1, p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$3;-><init>(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)V

    iput-object v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->V:Lcom/tencent/ijk/media/player/IMediaPlayer$OnSeekCompleteListener;

    .line 27
    new-instance v1, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$4;

    invoke-direct {v1, p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$4;-><init>(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)V

    iput-object v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->W:Lcom/tencent/ijk/media/player/IMediaPlayer$OnTimedTextListener;

    .line 28
    new-instance v1, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$5;

    invoke-direct {v1, p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$5;-><init>(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)V

    iput-object v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->aa:Lcom/tencent/ijk/media/player/IjkMediaPlayer$OnNativeInvokeListener;

    .line 29
    new-instance v1, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$6;

    invoke-direct {v1, p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$6;-><init>(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)V

    iput-object v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->ab:Lcom/tencent/ijk/media/player/IMediaPlayer$OnHLSKeyErrorListener;

    .line 30
    new-instance v1, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$7;

    invoke-direct {v1, p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$7;-><init>(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)V

    iput-object v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->g:Lcom/tencent/liteav/txcvodplayer/a$a;

    .line 31
    iput v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->ac:I

    .line 32
    iput-boolean v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->af:Z

    .line 33
    invoke-direct {p0, p1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    .line 34
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 35
    const-string p2, "TXCVodVideoView"

    iput-object p2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->h:Ljava/lang/String;

    const/4 p2, 0x0

    .line 36
    iput p2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->j:I

    .line 37
    iput p2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->k:I

    const/4 v0, 0x0

    .line 38
    iput-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->l:Lcom/tencent/liteav/txcvodplayer/a$b;

    .line 39
    iput-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->m:Lcom/tencent/ijk/media/player/IMediaPlayer;

    const/4 v0, 0x1

    .line 40
    iput-boolean v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a:Z

    const/high16 v1, 0x3f800000    # 1.0f

    .line 41
    iput v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->C:F

    .line 42
    invoke-static {}, Lcom/tencent/liteav/txcvodplayer/a/b;->a()Lcom/tencent/liteav/txcvodplayer/a/b;

    move-result-object v2

    iput-object v2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->E:Lcom/tencent/liteav/txcvodplayer/a/b;

    .line 43
    iput-boolean v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->b:Z

    .line 44
    iput-boolean v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c:Z

    .line 45
    iput p2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->d:I

    .line 46
    iput-boolean p2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->G:Z

    const/4 v0, -0x1

    .line 47
    iput v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->H:I

    .line 48
    iput v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->I:F

    .line 49
    iput v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->J:F

    .line 50
    iput-boolean p2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->K:Z

    .line 51
    new-instance v0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$9;

    invoke-direct {v0, p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$9;-><init>(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)V

    iput-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->e:Lcom/tencent/ijk/media/player/IMediaPlayer$OnVideoSizeChangedListener;

    .line 52
    new-instance v0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$10;

    invoke-direct {v0, p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$10;-><init>(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)V

    iput-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->f:Lcom/tencent/ijk/media/player/IMediaPlayer$OnPreparedListener;

    .line 53
    new-instance v0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$11;

    invoke-direct {v0, p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$11;-><init>(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)V

    iput-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->O:Lcom/tencent/ijk/media/player/IMediaPlayer$OnCompletionListener;

    .line 54
    new-instance v0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$12;

    invoke-direct {v0, p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$12;-><init>(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)V

    iput-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->P:Lcom/tencent/ijk/media/player/IMediaPlayer$OnInfoListener;

    .line 55
    new-instance v0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$13;

    invoke-direct {v0, p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$13;-><init>(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)V

    iput-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->R:Lcom/tencent/ijk/media/player/IMediaPlayer$OnErrorListener;

    .line 56
    new-instance v0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$14;

    invoke-direct {v0, p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$14;-><init>(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)V

    iput-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->S:Lcom/tencent/ijk/media/player/IMediaPlayer$OnHevcVideoDecoderErrorListener;

    .line 57
    new-instance v0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$15;

    invoke-direct {v0, p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$15;-><init>(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)V

    iput-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->T:Lcom/tencent/ijk/media/player/IMediaPlayer$OnVideoDecoderErrorListener;

    .line 58
    new-instance v0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$2;

    invoke-direct {v0, p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$2;-><init>(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)V

    iput-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->U:Lcom/tencent/ijk/media/player/IMediaPlayer$OnBufferingUpdateListener;

    .line 59
    new-instance v0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$3;

    invoke-direct {v0, p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$3;-><init>(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)V

    iput-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->V:Lcom/tencent/ijk/media/player/IMediaPlayer$OnSeekCompleteListener;

    .line 60
    new-instance v0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$4;

    invoke-direct {v0, p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$4;-><init>(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)V

    iput-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->W:Lcom/tencent/ijk/media/player/IMediaPlayer$OnTimedTextListener;

    .line 61
    new-instance v0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$5;

    invoke-direct {v0, p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$5;-><init>(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)V

    iput-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->aa:Lcom/tencent/ijk/media/player/IjkMediaPlayer$OnNativeInvokeListener;

    .line 62
    new-instance v0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$6;

    invoke-direct {v0, p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$6;-><init>(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)V

    iput-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->ab:Lcom/tencent/ijk/media/player/IMediaPlayer$OnHLSKeyErrorListener;

    .line 63
    new-instance v0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$7;

    invoke-direct {v0, p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$7;-><init>(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)V

    iput-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->g:Lcom/tencent/liteav/txcvodplayer/a$a;

    .line 64
    iput p2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->ac:I

    .line 65
    iput-boolean p2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->af:Z

    .line 66
    invoke-direct {p0, p1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .line 67
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 68
    const-string p2, "TXCVodVideoView"

    iput-object p2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->h:Ljava/lang/String;

    const/4 p2, 0x0

    .line 69
    iput p2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->j:I

    .line 70
    iput p2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->k:I

    const/4 p3, 0x0

    .line 71
    iput-object p3, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->l:Lcom/tencent/liteav/txcvodplayer/a$b;

    .line 72
    iput-object p3, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->m:Lcom/tencent/ijk/media/player/IMediaPlayer;

    const/4 p3, 0x1

    .line 73
    iput-boolean p3, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a:Z

    const/high16 v0, 0x3f800000    # 1.0f

    .line 74
    iput v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->C:F

    .line 75
    invoke-static {}, Lcom/tencent/liteav/txcvodplayer/a/b;->a()Lcom/tencent/liteav/txcvodplayer/a/b;

    move-result-object v1

    iput-object v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->E:Lcom/tencent/liteav/txcvodplayer/a/b;

    .line 76
    iput-boolean p3, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->b:Z

    .line 77
    iput-boolean p3, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c:Z

    .line 78
    iput p2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->d:I

    .line 79
    iput-boolean p2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->G:Z

    const/4 p3, -0x1

    .line 80
    iput p3, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->H:I

    .line 81
    iput v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->I:F

    .line 82
    iput v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->J:F

    .line 83
    iput-boolean p2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->K:Z

    .line 84
    new-instance p3, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$9;

    invoke-direct {p3, p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$9;-><init>(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)V

    iput-object p3, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->e:Lcom/tencent/ijk/media/player/IMediaPlayer$OnVideoSizeChangedListener;

    .line 85
    new-instance p3, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$10;

    invoke-direct {p3, p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$10;-><init>(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)V

    iput-object p3, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->f:Lcom/tencent/ijk/media/player/IMediaPlayer$OnPreparedListener;

    .line 86
    new-instance p3, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$11;

    invoke-direct {p3, p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$11;-><init>(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)V

    iput-object p3, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->O:Lcom/tencent/ijk/media/player/IMediaPlayer$OnCompletionListener;

    .line 87
    new-instance p3, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$12;

    invoke-direct {p3, p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$12;-><init>(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)V

    iput-object p3, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->P:Lcom/tencent/ijk/media/player/IMediaPlayer$OnInfoListener;

    .line 88
    new-instance p3, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$13;

    invoke-direct {p3, p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$13;-><init>(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)V

    iput-object p3, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->R:Lcom/tencent/ijk/media/player/IMediaPlayer$OnErrorListener;

    .line 89
    new-instance p3, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$14;

    invoke-direct {p3, p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$14;-><init>(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)V

    iput-object p3, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->S:Lcom/tencent/ijk/media/player/IMediaPlayer$OnHevcVideoDecoderErrorListener;

    .line 90
    new-instance p3, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$15;

    invoke-direct {p3, p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$15;-><init>(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)V

    iput-object p3, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->T:Lcom/tencent/ijk/media/player/IMediaPlayer$OnVideoDecoderErrorListener;

    .line 91
    new-instance p3, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$2;

    invoke-direct {p3, p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$2;-><init>(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)V

    iput-object p3, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->U:Lcom/tencent/ijk/media/player/IMediaPlayer$OnBufferingUpdateListener;

    .line 92
    new-instance p3, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$3;

    invoke-direct {p3, p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$3;-><init>(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)V

    iput-object p3, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->V:Lcom/tencent/ijk/media/player/IMediaPlayer$OnSeekCompleteListener;

    .line 93
    new-instance p3, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$4;

    invoke-direct {p3, p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$4;-><init>(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)V

    iput-object p3, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->W:Lcom/tencent/ijk/media/player/IMediaPlayer$OnTimedTextListener;

    .line 94
    new-instance p3, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$5;

    invoke-direct {p3, p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$5;-><init>(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)V

    iput-object p3, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->aa:Lcom/tencent/ijk/media/player/IjkMediaPlayer$OnNativeInvokeListener;

    .line 95
    new-instance p3, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$6;

    invoke-direct {p3, p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$6;-><init>(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)V

    iput-object p3, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->ab:Lcom/tencent/ijk/media/player/IMediaPlayer$OnHLSKeyErrorListener;

    .line 96
    new-instance p3, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$7;

    invoke-direct {p3, p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$7;-><init>(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)V

    iput-object p3, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->g:Lcom/tencent/liteav/txcvodplayer/a$a;

    .line 97
    iput p2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->ac:I

    .line 98
    iput-boolean p2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->af:Z

    .line 99
    invoke-direct {p0, p1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(Landroid/content/Context;)V

    return-void
.end method

.method public static synthetic a(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->n:I

    return p1
.end method

.method public static synthetic a(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;J)J
    .locals 0

    .line 2
    iput-wide p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->F:J

    return-wide p1
.end method

.method public static synthetic a(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;Lcom/tencent/ijk/media/player/IMediaPlayer;)Lcom/tencent/ijk/media/player/IMediaPlayer;
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->m:Lcom/tencent/ijk/media/player/IMediaPlayer;

    return-object p1
.end method

.method public static synthetic a(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;Lcom/tencent/liteav/txcvodplayer/a$b;)Lcom/tencent/liteav/txcvodplayer/a$b;
    .locals 0

    .line 4
    iput-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->l:Lcom/tencent/liteav/txcvodplayer/a$b;

    return-object p1
.end method

.method public static synthetic a(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)Lcom/tencent/liteav/txcvodplayer/a;
    .locals 0

    .line 5
    iget-object p0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->y:Lcom/tencent/liteav/txcvodplayer/a;

    return-object p0
.end method

.method public static synthetic a(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 6
    iput-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->B:Ljava/lang/String;

    return-object p1
.end method

.method private a(ILjava/lang/String;Ljava/lang/String;)V
    .locals 5

    const/16 v0, 0x83a

    const/16 v1, -0x900

    if-eq p1, v1, :cond_0

    if-ne p1, v0, :cond_1

    .line 51
    :cond_0
    iget-boolean v2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->af:Z

    if-eqz v2, :cond_1

    return-void

    .line 52
    :cond_1
    new-instance v2, Landroid/os/Message;

    invoke-direct {v2}, Landroid/os/Message;-><init>()V

    const/16 v3, 0x65

    .line 53
    iput v3, v2, Landroid/os/Message;->what:I

    .line 54
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 55
    iput p1, v2, Landroid/os/Message;->arg1:I

    .line 56
    const-string v4, "description"

    invoke-virtual {v3, v4, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    invoke-virtual {v2, v3}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 58
    iget-object p2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->ae:Landroid/os/Handler;

    if-eqz p2, :cond_2

    .line 59
    invoke-virtual {p2, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    :cond_2
    const/16 p2, 0x7e2

    if-eq p1, p2, :cond_4

    const/16 p2, 0x7e0

    if-ne p1, p2, :cond_3

    goto :goto_0

    .line 60
    :cond_3
    iget-object p2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->h:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "sendSimpleEvent "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-static {p2, p3}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    :cond_4
    :goto_0
    if-eq p1, v1, :cond_6

    if-ne p1, v0, :cond_5

    goto :goto_1

    :cond_5
    const/4 p1, 0x0

    goto :goto_2

    :cond_6
    :goto_1
    const/4 p1, 0x1

    .line 61
    :goto_2
    iput-boolean p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->af:Z

    return-void
.end method

.method private a(Landroid/content/Context;)V
    .locals 1

    .line 10
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->w:Landroid/content/Context;

    .line 11
    new-instance p1, Lcom/tencent/liteav/txcvodplayer/d;

    invoke-direct {p1}, Lcom/tencent/liteav/txcvodplayer/d;-><init>()V

    iput-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->x:Lcom/tencent/liteav/txcvodplayer/d;

    .line 12
    invoke-direct {p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->i()V

    const/4 p1, 0x0

    .line 13
    iput p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->n:I

    .line 14
    iput p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->o:I

    const/4 v0, 0x1

    .line 15
    invoke-virtual {p0, v0}, Landroid/view/View;->setFocusable(Z)V

    .line 16
    invoke-virtual {p0, v0}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 17
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 18
    iput p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->j:I

    .line 19
    iput p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->k:I

    .line 20
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 21
    new-instance v0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$a;

    invoke-direct {v0, p0, p1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$a;-><init>(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->ae:Landroid/os/Handler;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 22
    iput-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->ae:Landroid/os/Handler;

    .line 23
    :goto_0
    new-instance p1, Lcom/tencent/liteav/txcvodplayer/b;

    invoke-direct {p1}, Lcom/tencent/liteav/txcvodplayer/b;-><init>()V

    iput-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->N:Lcom/tencent/liteav/txcvodplayer/b;

    return-void
.end method

.method private a(Lcom/tencent/ijk/media/player/IMediaPlayer;Lcom/tencent/liteav/txcvodplayer/a$b;)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    :cond_0
    if-nez p2, :cond_1

    const/4 p2, 0x0

    .line 24
    invoke-interface {p1, p2}, Lcom/tencent/ijk/media/player/IMediaPlayer;->setDisplay(Landroid/view/SurfaceHolder;)V

    return-void

    .line 25
    :cond_1
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->h:Ljava/lang/String;

    const-string v1, "bindSurfaceHolder"

    invoke-static {v0, v1}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 26
    invoke-interface {p2, p1}, Lcom/tencent/liteav/txcvodplayer/a$b;->a(Lcom/tencent/ijk/media/player/IMediaPlayer;)V

    return-void
.end method

.method public static synthetic a(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 7
    invoke-direct {p0, p1, p2, p3}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic a(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;Lcom/tencent/ijk/media/player/IMediaPlayer;Lcom/tencent/liteav/txcvodplayer/a$b;)V
    .locals 0

    .line 8
    invoke-direct {p0, p1, p2}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(Lcom/tencent/ijk/media/player/IMediaPlayer;Lcom/tencent/liteav/txcvodplayer/a$b;)V

    return-void
.end method

.method public static synthetic a(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;Z)Z
    .locals 0

    .line 9
    iput-boolean p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->M:Z

    return p1
.end method

.method public static synthetic b(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->o:I

    return p0
.end method

.method public static synthetic b(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;I)I
    .locals 0

    .line 2
    iput p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->o:I

    return p1
.end method

.method public static synthetic b(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;Z)Z
    .locals 0

    .line 3
    iput-boolean p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->G:Z

    return p1
.end method

.method public static synthetic c(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->n:I

    return p0
.end method

.method public static synthetic c(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;I)I
    .locals 0

    .line 2
    iput p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->z:I

    return p1
.end method

.method public static synthetic d(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->z:I

    return p0
.end method

.method public static synthetic d(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;I)I
    .locals 0

    .line 2
    iput p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->A:I

    return p1
.end method

.method public static synthetic e(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->A:I

    return p0
.end method

.method public static synthetic e(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;I)I
    .locals 0

    .line 2
    iput p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->k:I

    return p1
.end method

.method public static synthetic f(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->j:I

    return p1
.end method

.method public static synthetic f(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)Landroid/os/Handler;
    .locals 0

    .line 2
    iget-object p0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->ae:Landroid/os/Handler;

    return-object p0
.end method

.method private f()Z
    .locals 16
    .annotation build Landroid/annotation/TargetApi;
        value = 0x17
    .end annotation

    move-object/from16 v1, p0

    .line 3
    iget-object v0, v1, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->h:Ljava/lang/String;

    const-string v2, "openVideo"

    invoke-static {v0, v2}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    iget-object v0, v1, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->i:Landroid/net/Uri;

    const/4 v2, 0x0

    if-nez v0, :cond_0

    return v2

    .line 5
    :cond_0
    invoke-virtual {v1, v2}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(Z)V

    .line 6
    iget-boolean v0, v1, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->b:Z

    const/4 v3, 0x3

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz v0, :cond_1

    .line 7
    iget-object v0, v1, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->w:Landroid/content/Context;

    const-string v6, "audio"

    invoke-virtual {v0, v6}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/media/AudioManager;

    .line 8
    invoke-virtual {v0, v4, v3, v5}, Landroid/media/AudioManager;->requestAudioFocus(Landroid/media/AudioManager$OnAudioFocusChangeListener;II)I

    .line 9
    :cond_1
    :try_start_0
    iget-object v0, v1, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->i:Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    .line 10
    const-string v7, "/"

    invoke-virtual {v0, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_3

    .line 11
    new-instance v7, Ljava/io/File;

    invoke-direct {v7, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 12
    invoke-virtual {v7}, Ljava/io/File;->exists()Z

    move-result v7

    if-eqz v7, :cond_2

    goto :goto_1

    .line 13
    :cond_2
    new-instance v0, Ljava/io/FileNotFoundException;

    invoke-direct {v0}, Ljava/io/FileNotFoundException;-><init>()V

    throw v0

    :catch_0
    move-exception v0

    goto/16 :goto_8

    :catch_1
    move v4, v5

    :goto_0
    const/4 v8, -0x1

    goto/16 :goto_9

    .line 14
    :cond_3
    :goto_1
    iget-object v7, v1, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->i:Landroid/net/Uri;

    if-eqz v7, :cond_e

    .line 15
    new-instance v7, Lcom/tencent/ijk/media/player/IjkMediaPlayer;

    new-instance v8, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$8;

    invoke-direct {v8, v1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$8;-><init>(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)V

    invoke-direct {v7, v8}, Lcom/tencent/ijk/media/player/IjkMediaPlayer;-><init>(Lcom/tencent/ijk/media/player/IjkLibLoader;)V

    .line 16
    invoke-static {v3}, Lcom/tencent/ijk/media/player/IjkMediaPlayer;->native_setLogLevel(I)V

    .line 17
    iget-object v8, v1, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->aa:Lcom/tencent/ijk/media/player/IjkMediaPlayer$OnNativeInvokeListener;

    invoke-virtual {v7, v8}, Lcom/tencent/ijk/media/player/IjkMediaPlayer;->setOnNativeInvokeListener(Lcom/tencent/ijk/media/player/IjkMediaPlayer$OnNativeInvokeListener;)V

    .line 18
    iget-object v8, v1, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->x:Lcom/tencent/liteav/txcvodplayer/d;

    iget-boolean v8, v8, Lcom/tencent/liteav/txcvodplayer/d;->d:Z
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-string v9, "mediacodec"

    const-wide/16 v10, 0x1

    const-wide/16 v12, 0x0

    const/4 v14, 0x4

    if-eqz v8, :cond_4

    .line 19
    :try_start_1
    invoke-virtual {v7, v14, v9, v10, v11}, Lcom/tencent/ijk/media/player/IjkMediaPlayer;->setOption(ILjava/lang/String;J)V

    .line 20
    const-string v8, "mediacodec-hevc"

    invoke-virtual {v7, v14, v8, v10, v11}, Lcom/tencent/ijk/media/player/IjkMediaPlayer;->setOption(ILjava/lang/String;J)V

    goto :goto_2

    .line 21
    :cond_4
    invoke-virtual {v7, v14, v9, v12, v13}, Lcom/tencent/ijk/media/player/IjkMediaPlayer;->setOption(ILjava/lang/String;J)V

    .line 22
    :goto_2
    iget-object v8, v1, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->h:Ljava/lang/String;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v15, "ijk mediacodec "

    invoke-virtual {v9, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v15, v1, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->x:Lcom/tencent/liteav/txcvodplayer/d;

    iget-boolean v15, v15, Lcom/tencent/liteav/txcvodplayer/d;->d:Z

    invoke-virtual {v9, v15}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    const-string v8, "mediacodec-auto-rotate"

    invoke-virtual {v7, v14, v8, v12, v13}, Lcom/tencent/ijk/media/player/IjkMediaPlayer;->setOption(ILjava/lang/String;J)V

    .line 24
    const-string v8, "mediacodec-handle-resolution-change"

    invoke-virtual {v7, v14, v8, v12, v13}, Lcom/tencent/ijk/media/player/IjkMediaPlayer;->setOption(ILjava/lang/String;J)V

    .line 25
    const-string v8, "opensles"

    invoke-virtual {v7, v14, v8, v12, v13}, Lcom/tencent/ijk/media/player/IjkMediaPlayer;->setOption(ILjava/lang/String;J)V

    .line 26
    const-string v8, "overlay-format"

    const-wide/32 v3, 0x32335652

    invoke-virtual {v7, v14, v8, v3, v4}, Lcom/tencent/ijk/media/player/IjkMediaPlayer;->setOption(ILjava/lang/String;J)V

    .line 27
    const-string v3, "framedrop"

    invoke-virtual {v7, v14, v3, v10, v11}, Lcom/tencent/ijk/media/player/IjkMediaPlayer;->setOption(ILjava/lang/String;J)V

    .line 28
    const-string v3, "soundtouch"

    invoke-virtual {v7, v14, v3, v10, v11}, Lcom/tencent/ijk/media/player/IjkMediaPlayer;->setOption(ILjava/lang/String;J)V

    .line 29
    const-string v3, "max-fps"
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    const-wide/16 v5, 0x1e

    :try_start_2
    invoke-virtual {v7, v14, v3, v5, v6}, Lcom/tencent/ijk/media/player/IjkMediaPlayer;->setOption(ILjava/lang/String;J)V

    .line 30
    iget-boolean v3, v1, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c:Z
    :try_end_2
    .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    const-string v5, "start-on-prepared"

    if-eqz v3, :cond_5

    :try_start_3
    iget v3, v1, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->k:I

    if-eq v3, v14, :cond_5

    .line 31
    invoke-virtual {v7, v14, v5, v10, v11}, Lcom/tencent/ijk/media/player/IjkMediaPlayer;->setOption(ILjava/lang/String;J)V

    goto :goto_3

    :catch_2
    const/4 v4, 0x1

    goto/16 :goto_0

    .line 32
    :cond_5
    invoke-virtual {v7, v14, v5, v12, v13}, Lcom/tencent/ijk/media/player/IjkMediaPlayer;->setOption(ILjava/lang/String;J)V

    .line 33
    :goto_3
    const-string v3, "load-on-prepared"

    invoke-virtual {v7, v14, v3, v10, v11}, Lcom/tencent/ijk/media/player/IjkMediaPlayer;->setOption(ILjava/lang/String;J)V

    .line 34
    const-string v3, "http-detect-range-support"

    const/4 v4, 0x1

    invoke-virtual {v7, v4, v3, v12, v13}, Lcom/tencent/ijk/media/player/IjkMediaPlayer;->setOption(ILjava/lang/String;J)V

    .line 35
    const-string v3, "skip_loop_filter"

    const/4 v5, 0x2

    invoke-virtual {v7, v5, v3, v12, v13}, Lcom/tencent/ijk/media/player/IjkMediaPlayer;->setOption(ILjava/lang/String;J)V

    .line 36
    const-string v3, "skip_frame"

    invoke-virtual {v7, v5, v3, v12, v13}, Lcom/tencent/ijk/media/player/IjkMediaPlayer;->setOption(ILjava/lang/String;J)V

    .line 37
    const-string v3, "timeout"

    iget-object v5, v1, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->x:Lcom/tencent/liteav/txcvodplayer/d;

    iget v5, v5, Lcom/tencent/liteav/txcvodplayer/d;->c:F

    const/high16 v6, 0x447a0000    # 1000.0f

    mul-float/2addr v5, v6

    mul-float/2addr v5, v6

    float-to-int v5, v5

    int-to-long v5, v5

    const/4 v4, 0x1

    invoke-virtual {v7, v4, v3, v5, v6}, Lcom/tencent/ijk/media/player/IjkMediaPlayer;->setOption(ILjava/lang/String;J)V

    .line 38
    const-string v3, "reconnect"

    invoke-virtual {v7, v4, v3, v10, v11}, Lcom/tencent/ijk/media/player/IjkMediaPlayer;->setOption(ILjava/lang/String;J)V

    .line 39
    const-string v3, "analyzeduration"

    const-wide/32 v5, 0x55d4a80

    invoke-virtual {v7, v4, v3, v5, v6}, Lcom/tencent/ijk/media/player/IjkMediaPlayer;->setOption(ILjava/lang/String;J)V

    .line 40
    const-string v3, "enable-accurate-seek"

    iget-object v5, v1, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->x:Lcom/tencent/liteav/txcvodplayer/d;

    iget-boolean v5, v5, Lcom/tencent/liteav/txcvodplayer/d;->i:Z

    if-eqz v5, :cond_6

    move-wide v5, v10

    goto :goto_4

    :cond_6
    move-wide v5, v12

    :goto_4
    invoke-virtual {v7, v14, v3, v5, v6}, Lcom/tencent/ijk/media/player/IjkMediaPlayer;->setOption(ILjava/lang/String;J)V

    .line 41
    const-string v3, "disable-bitrate-sync"

    iget-object v5, v1, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->x:Lcom/tencent/liteav/txcvodplayer/d;

    iget-boolean v5, v5, Lcom/tencent/liteav/txcvodplayer/d;->j:Z

    if-eqz v5, :cond_7

    move-wide v10, v12

    :cond_7
    invoke-virtual {v7, v14, v3, v10, v11}, Lcom/tencent/ijk/media/player/IjkMediaPlayer;->setOption(ILjava/lang/String;J)V

    .line 42
    const-string v3, "dns_cache_timeout"

    const/4 v4, 0x1

    invoke-virtual {v7, v4, v3, v12, v13}, Lcom/tencent/ijk/media/player/IjkMediaPlayer;->setOption(ILjava/lang/String;J)V

    .line 43
    const-string v3, "cache_max_capacity"

    const-wide/32 v5, 0x7fffffff

    invoke-virtual {v7, v4, v3, v5, v6}, Lcom/tencent/ijk/media/player/IjkMediaPlayer;->setOption(ILjava/lang/String;J)V

    .line 44
    iget v3, v1, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->u:I

    if-lez v3, :cond_8

    .line 45
    const-string v5, "seek-at-start"

    int-to-long v10, v3

    invoke-virtual {v7, v14, v5, v10, v11}, Lcom/tencent/ijk/media/player/IjkMediaPlayer;->setOption(ILjava/lang/String;J)V

    .line 46
    iget-object v3, v1, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->h:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "ijk start time "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v6, v1, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->u:I

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v3, v5}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 47
    :cond_8
    iget-object v3, v1, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->x:Lcom/tencent/liteav/txcvodplayer/d;

    iget v3, v3, Lcom/tencent/liteav/txcvodplayer/d;->m:I

    if-lez v3, :cond_9

    .line 48
    const-string v5, "max-buffer-size"

    const/high16 v6, 0x100000

    mul-int/2addr v3, v6

    int-to-long v10, v3

    invoke-virtual {v7, v14, v5, v10, v11}, Lcom/tencent/ijk/media/player/IjkMediaPlayer;->setOption(ILjava/lang/String;J)V

    .line 49
    iget-object v3, v1, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->h:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "ijk max buffer size "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v6, v1, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->x:Lcom/tencent/liteav/txcvodplayer/d;

    iget v6, v6, Lcom/tencent/liteav/txcvodplayer/d;->m:I

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v3, v5}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 50
    :cond_9
    iget-object v3, v1, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->x:Lcom/tencent/liteav/txcvodplayer/d;

    iget-object v3, v3, Lcom/tencent/liteav/txcvodplayer/d;->h:Ljava/util/Map;

    if-eqz v3, :cond_c

    .line 51
    invoke-interface {v3}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const/4 v15, 0x0

    :goto_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_b

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;
    :try_end_3
    .catch Ljava/io/FileNotFoundException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 52
    const-string v6, "%s: %s"

    if-nez v15, :cond_a

    .line 53
    :try_start_4
    iget-object v10, v1, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->x:Lcom/tencent/liteav/txcvodplayer/d;

    iget-object v10, v10, Lcom/tencent/liteav/txcvodplayer/d;->h:Ljava/util/Map;

    invoke-interface {v10, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    filled-new-array {v5, v10}, [Ljava/lang/Object;

    move-result-object v5

    invoke-static {v6, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    :goto_6
    move-object v15, v5

    goto :goto_5

    .line 54
    :cond_a
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v11, "\r\n"

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v11, v1, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->x:Lcom/tencent/liteav/txcvodplayer/d;

    iget-object v11, v11, Lcom/tencent/liteav/txcvodplayer/d;->h:Ljava/util/Map;

    invoke-interface {v11, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    filled-new-array {v5, v11}, [Ljava/lang/Object;

    move-result-object v5

    invoke-static {v6, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    goto :goto_6

    .line 55
    :cond_b
    const-string v3, "headers"

    const/4 v4, 0x1

    invoke-virtual {v7, v4, v3, v15}, Lcom/tencent/ijk/media/player/IjkMediaPlayer;->setOption(ILjava/lang/String;Ljava/lang/String;)V

    .line 56
    :cond_c
    iget v3, v1, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->L:I

    invoke-virtual {v7, v3}, Lcom/tencent/ijk/media/player/IjkMediaPlayer;->setBitrateIndex(I)V

    const/4 v3, 0x5

    .line 57
    invoke-static {v3}, Lcom/tencent/ijk/media/player/IjkMediaPlayer;->native_setLogLevel(I)V

    .line 58
    iget-object v3, v1, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->x:Lcom/tencent/liteav/txcvodplayer/d;

    iget-object v3, v3, Lcom/tencent/liteav/txcvodplayer/d;->e:Ljava/lang/String;

    if-eqz v3, :cond_f

    iget-object v3, v1, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->E:Lcom/tencent/liteav/txcvodplayer/a/b;

    invoke-virtual {v3, v0}, Lcom/tencent/liteav/txcvodplayer/a/b;->e(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_f

    .line 59
    iget-object v3, v1, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->E:Lcom/tencent/liteav/txcvodplayer/a/b;

    iget-object v5, v1, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->x:Lcom/tencent/liteav/txcvodplayer/d;

    iget-object v5, v5, Lcom/tencent/liteav/txcvodplayer/d;->e:Ljava/lang/String;

    invoke-virtual {v3, v5}, Lcom/tencent/liteav/txcvodplayer/a/b;->b(Ljava/lang/String;)V

    .line 60
    iget-object v3, v1, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->E:Lcom/tencent/liteav/txcvodplayer/a/b;

    iget-object v5, v1, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->x:Lcom/tencent/liteav/txcvodplayer/d;

    iget v5, v5, Lcom/tencent/liteav/txcvodplayer/d;->f:I

    invoke-virtual {v3, v5}, Lcom/tencent/liteav/txcvodplayer/a/b;->a(I)V

    .line 61
    iget-object v3, v1, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->E:Lcom/tencent/liteav/txcvodplayer/a/b;

    invoke-virtual {v3, v0}, Lcom/tencent/liteav/txcvodplayer/a/b;->d(Ljava/lang/String;)Lcom/tencent/liteav/txcvodplayer/a/a;

    move-result-object v3

    iput-object v3, v1, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->D:Lcom/tencent/liteav/txcvodplayer/a/a;

    if-eqz v3, :cond_f

    .line 62
    invoke-virtual {v3}, Lcom/tencent/liteav/txcvodplayer/a/a;->a()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_d

    .line 63
    const-string v0, "cache_file_path"

    iget-object v3, v1, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->D:Lcom/tencent/liteav/txcvodplayer/a/a;

    invoke-virtual {v3}, Lcom/tencent/liteav/txcvodplayer/a/a;->a()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    invoke-virtual {v7, v4, v0, v3}, Lcom/tencent/ijk/media/player/IjkMediaPlayer;->setOption(ILjava/lang/String;Ljava/lang/String;)V

    .line 64
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ijkio:cache:ffio:"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v1, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->i:Landroid/net/Uri;

    invoke-virtual {v3}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_7

    .line 65
    :cond_d
    iget-object v3, v1, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->D:Lcom/tencent/liteav/txcvodplayer/a/a;

    invoke-virtual {v3}, Lcom/tencent/liteav/txcvodplayer/a/a;->b()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_f

    .line 66
    const-string v0, "cache_db_path"

    iget-object v3, v1, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->D:Lcom/tencent/liteav/txcvodplayer/a/a;

    invoke-virtual {v3}, Lcom/tencent/liteav/txcvodplayer/a/a;->b()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    invoke-virtual {v7, v4, v0, v3}, Lcom/tencent/ijk/media/player/IjkMediaPlayer;->setOption(ILjava/lang/String;Ljava/lang/String;)V

    .line 67
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ijkhlscache:"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v1, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->i:Landroid/net/Uri;

    invoke-virtual {v3}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_7

    :cond_e
    const/4 v7, 0x0

    .line 68
    :cond_f
    :goto_7
    iget-object v3, v1, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->h:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "ijk media player "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v3, v5}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 69
    new-instance v3, Lcom/tencent/ijk/media/player/TextureMediaPlayer;

    invoke-direct {v3, v7}, Lcom/tencent/ijk/media/player/TextureMediaPlayer;-><init>(Lcom/tencent/ijk/media/player/IMediaPlayer;)V

    iput-object v3, v1, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->m:Lcom/tencent/ijk/media/player/IMediaPlayer;

    .line 70
    invoke-interface {v3, v0}, Lcom/tencent/ijk/media/player/IMediaPlayer;->setDataSource(Ljava/lang/String;)V

    .line 71
    iget-object v0, v1, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->m:Lcom/tencent/ijk/media/player/IMediaPlayer;

    iget-object v3, v1, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->f:Lcom/tencent/ijk/media/player/IMediaPlayer$OnPreparedListener;

    invoke-interface {v0, v3}, Lcom/tencent/ijk/media/player/IMediaPlayer;->setOnPreparedListener(Lcom/tencent/ijk/media/player/IMediaPlayer$OnPreparedListener;)V

    .line 72
    iget-object v0, v1, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->m:Lcom/tencent/ijk/media/player/IMediaPlayer;

    iget-object v3, v1, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->e:Lcom/tencent/ijk/media/player/IMediaPlayer$OnVideoSizeChangedListener;

    invoke-interface {v0, v3}, Lcom/tencent/ijk/media/player/IMediaPlayer;->setOnVideoSizeChangedListener(Lcom/tencent/ijk/media/player/IMediaPlayer$OnVideoSizeChangedListener;)V

    .line 73
    iget-object v0, v1, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->m:Lcom/tencent/ijk/media/player/IMediaPlayer;

    iget-object v3, v1, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->O:Lcom/tencent/ijk/media/player/IMediaPlayer$OnCompletionListener;

    invoke-interface {v0, v3}, Lcom/tencent/ijk/media/player/IMediaPlayer;->setOnCompletionListener(Lcom/tencent/ijk/media/player/IMediaPlayer$OnCompletionListener;)V

    .line 74
    iget-object v0, v1, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->m:Lcom/tencent/ijk/media/player/IMediaPlayer;

    iget-object v3, v1, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->R:Lcom/tencent/ijk/media/player/IMediaPlayer$OnErrorListener;

    invoke-interface {v0, v3}, Lcom/tencent/ijk/media/player/IMediaPlayer;->setOnErrorListener(Lcom/tencent/ijk/media/player/IMediaPlayer$OnErrorListener;)V

    .line 75
    iget-object v0, v1, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->m:Lcom/tencent/ijk/media/player/IMediaPlayer;

    iget-object v3, v1, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->P:Lcom/tencent/ijk/media/player/IMediaPlayer$OnInfoListener;

    invoke-interface {v0, v3}, Lcom/tencent/ijk/media/player/IMediaPlayer;->setOnInfoListener(Lcom/tencent/ijk/media/player/IMediaPlayer$OnInfoListener;)V

    .line 76
    iget-object v0, v1, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->m:Lcom/tencent/ijk/media/player/IMediaPlayer;

    iget-object v3, v1, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->U:Lcom/tencent/ijk/media/player/IMediaPlayer$OnBufferingUpdateListener;

    invoke-interface {v0, v3}, Lcom/tencent/ijk/media/player/IMediaPlayer;->setOnBufferingUpdateListener(Lcom/tencent/ijk/media/player/IMediaPlayer$OnBufferingUpdateListener;)V

    .line 77
    iget-object v0, v1, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->m:Lcom/tencent/ijk/media/player/IMediaPlayer;

    iget-object v3, v1, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->V:Lcom/tencent/ijk/media/player/IMediaPlayer$OnSeekCompleteListener;

    invoke-interface {v0, v3}, Lcom/tencent/ijk/media/player/IMediaPlayer;->setOnSeekCompleteListener(Lcom/tencent/ijk/media/player/IMediaPlayer$OnSeekCompleteListener;)V

    .line 78
    iget-object v0, v1, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->m:Lcom/tencent/ijk/media/player/IMediaPlayer;

    iget-object v3, v1, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->W:Lcom/tencent/ijk/media/player/IMediaPlayer$OnTimedTextListener;

    invoke-interface {v0, v3}, Lcom/tencent/ijk/media/player/IMediaPlayer;->setOnTimedTextListener(Lcom/tencent/ijk/media/player/IMediaPlayer$OnTimedTextListener;)V

    .line 79
    iget-object v0, v1, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->m:Lcom/tencent/ijk/media/player/IMediaPlayer;

    iget-object v3, v1, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->ab:Lcom/tencent/ijk/media/player/IMediaPlayer$OnHLSKeyErrorListener;

    invoke-interface {v0, v3}, Lcom/tencent/ijk/media/player/IMediaPlayer;->setOnHLSKeyErrorListener(Lcom/tencent/ijk/media/player/IMediaPlayer$OnHLSKeyErrorListener;)V

    .line 80
    iget-object v0, v1, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->m:Lcom/tencent/ijk/media/player/IMediaPlayer;

    iget-object v3, v1, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->S:Lcom/tencent/ijk/media/player/IMediaPlayer$OnHevcVideoDecoderErrorListener;

    invoke-interface {v0, v3}, Lcom/tencent/ijk/media/player/IMediaPlayer;->setOnHevcVideoDecoderErrorListener(Lcom/tencent/ijk/media/player/IMediaPlayer$OnHevcVideoDecoderErrorListener;)V

    .line 81
    iget-object v0, v1, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->m:Lcom/tencent/ijk/media/player/IMediaPlayer;

    iget-object v3, v1, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->T:Lcom/tencent/ijk/media/player/IMediaPlayer$OnVideoDecoderErrorListener;

    invoke-interface {v0, v3}, Lcom/tencent/ijk/media/player/IMediaPlayer;->setOnVideoDecoderErrorListener(Lcom/tencent/ijk/media/player/IMediaPlayer$OnVideoDecoderErrorListener;)V

    .line 82
    iput v2, v1, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->t:I

    .line 83
    iget-object v0, v1, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->m:Lcom/tencent/ijk/media/player/IMediaPlayer;

    iget-object v3, v1, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->l:Lcom/tencent/liteav/txcvodplayer/a$b;

    invoke-direct {v1, v0, v3}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(Lcom/tencent/ijk/media/player/IMediaPlayer;Lcom/tencent/liteav/txcvodplayer/a$b;)V

    .line 84
    iget-object v0, v1, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->m:Lcom/tencent/ijk/media/player/IMediaPlayer;

    const/4 v9, 0x3

    invoke-interface {v0, v9}, Lcom/tencent/ijk/media/player/IMediaPlayer;->setAudioStreamType(I)V

    .line 85
    iget-object v0, v1, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->m:Lcom/tencent/ijk/media/player/IMediaPlayer;

    const/4 v4, 0x1

    invoke-interface {v0, v4}, Lcom/tencent/ijk/media/player/IMediaPlayer;->setScreenOnWhilePlaying(Z)V

    .line 86
    iget-object v0, v1, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->m:Lcom/tencent/ijk/media/player/IMediaPlayer;

    invoke-interface {v0}, Lcom/tencent/ijk/media/player/IMediaPlayer;->prepareAsync()V

    .line 87
    iget-object v0, v1, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->m:Lcom/tencent/ijk/media/player/IMediaPlayer;

    iget v3, v1, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->I:F

    iget v5, v1, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->J:F

    invoke-interface {v0, v3, v5}, Lcom/tencent/ijk/media/player/IMediaPlayer;->setVolume(FF)V

    .line 88
    iget-boolean v0, v1, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->K:Z

    invoke-virtual {v1, v0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->setMute(Z)V

    .line 89
    iget-object v0, v1, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->N:Lcom/tencent/liteav/txcvodplayer/b;

    if-eqz v0, :cond_10

    .line 90
    iget-object v3, v1, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->m:Lcom/tencent/ijk/media/player/IMediaPlayer;

    invoke-virtual {v0, v3}, Lcom/tencent/liteav/txcvodplayer/b;->a(Lcom/tencent/ijk/media/player/IMediaPlayer;)V

    :cond_10
    const/4 v4, 0x1

    .line 91
    iput v4, v1, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->j:I
    :try_end_4
    .catch Ljava/io/FileNotFoundException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    const/4 v4, 0x1

    goto :goto_a

    .line 92
    :goto_8
    iget-object v3, v1, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->h:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v8, -0x1

    .line 93
    iput v8, v1, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->j:I

    .line 94
    iput v8, v1, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->k:I

    .line 95
    iget-object v0, v1, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->R:Lcom/tencent/ijk/media/player/IMediaPlayer$OnErrorListener;

    iget-object v3, v1, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->m:Lcom/tencent/ijk/media/player/IMediaPlayer;

    const/4 v4, 0x1

    invoke-interface {v0, v3, v4, v2}, Lcom/tencent/ijk/media/player/IMediaPlayer$OnErrorListener;->onError(Lcom/tencent/ijk/media/player/IMediaPlayer;II)Z

    goto :goto_a

    .line 96
    :goto_9
    iput v8, v1, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->j:I

    .line 97
    iput v8, v1, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->k:I

    .line 98
    iget-object v0, v1, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->R:Lcom/tencent/ijk/media/player/IMediaPlayer$OnErrorListener;

    iget-object v2, v1, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->m:Lcom/tencent/ijk/media/player/IMediaPlayer;

    const/16 v3, -0x3ec

    const/16 v5, -0x8ff

    invoke-interface {v0, v2, v3, v5}, Lcom/tencent/ijk/media/player/IMediaPlayer$OnErrorListener;->onError(Lcom/tencent/ijk/media/player/IMediaPlayer;II)Z

    :goto_a
    return v4
.end method

.method public static synthetic g(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->j:I

    return p0
.end method

.method public static synthetic g(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;I)I
    .locals 0

    .line 2
    iput p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->u:I

    return p1
.end method

.method private g()V
    .locals 2

    .line 3
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->h:Ljava/lang/String;

    const-string v1, "replay"

    invoke-static {v0, v1}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    iget v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->u:I

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->m:Lcom/tencent/ijk/media/player/IMediaPlayer;

    if-eqz v0, :cond_0

    .line 5
    iget v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->v:I

    if-lez v1, :cond_0

    .line 6
    invoke-interface {v0}, Lcom/tencent/ijk/media/player/IMediaPlayer;->getCurrentPosition()J

    move-result-wide v0

    long-to-int v0, v0

    iput v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->u:I

    .line 7
    :cond_0
    invoke-direct {p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->f()Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x0

    .line 8
    invoke-virtual {p0, v0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(Z)V

    :cond_1
    return-void
.end method

.method public static synthetic h(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->p:I

    return p0
.end method

.method public static synthetic h(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;I)I
    .locals 0

    .line 2
    iput p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->s:I

    return p1
.end method

.method private h()Z
    .locals 2

    .line 3
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->m:Lcom/tencent/ijk/media/player/IMediaPlayer;

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->j:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static synthetic i(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->q:I

    return p0
.end method

.method public static synthetic i(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;I)I
    .locals 0

    .line 2
    iput p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->r:I

    return p1
.end method

.method private i()V
    .locals 1

    const/4 v0, 0x0

    .line 3
    invoke-virtual {p0, v0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->setRender(I)V

    return-void
.end method

.method public static synthetic j(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->k:I

    return p0
.end method

.method public static synthetic j(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;I)I
    .locals 0

    .line 2
    iput p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->Q:I

    return p1
.end method

.method public static synthetic k(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->t:I

    return p1
.end method

.method public static synthetic k(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)Ljava/lang/String;
    .locals 0

    .line 2
    iget-object p0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->h:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic l(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->p:I

    return p1
.end method

.method public static synthetic l(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)Z
    .locals 0

    .line 2
    iget-boolean p0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->M:Z

    return p0
.end method

.method public static synthetic m(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)F
    .locals 0

    .line 1
    iget p0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->C:F

    return p0
.end method

.method public static synthetic m(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;I)I
    .locals 0

    .line 2
    iput p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->q:I

    return p1
.end method

.method public static synthetic n(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)Landroid/net/Uri;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->i:Landroid/net/Uri;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic o(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->s:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic p(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->r:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic q(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->F:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public static synthetic r(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)I
    .locals 2

    .line 1
    iget v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->Q:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    iput v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->Q:I

    .line 6
    .line 7
    return v0
.end method

.method public static synthetic s(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)Lcom/tencent/liteav/txcvodplayer/d;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->x:Lcom/tencent/liteav/txcvodplayer/d;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic t(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->g()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic u(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->H:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic v(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)Lcom/tencent/ijk/media/player/IMediaPlayer;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->m:Lcom/tencent/ijk/media/player/IMediaPlayer;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic w(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)Z
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->f()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic x(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)Lcom/tencent/liteav/txcvodplayer/e;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->ad:Lcom/tencent/liteav/txcvodplayer/e;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 27
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->m:Lcom/tencent/ijk/media/player/IMediaPlayer;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 28
    invoke-interface {v0, v1}, Lcom/tencent/ijk/media/player/IMediaPlayer;->setDisplay(Landroid/view/SurfaceHolder;)V

    :cond_0
    return-void
.end method

.method public a(I)V
    .locals 3

    .line 40
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->h:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "seek to "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 41
    invoke-virtual {p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->getUrlPathExtention()Ljava/lang/String;

    move-result-object v0

    const-string v1, "m3u8"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 42
    invoke-virtual {p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->getDuration()I

    move-result v0

    add-int/lit16 v0, v0, -0x3e8

    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result p1

    :cond_0
    if-gez p1, :cond_1

    goto :goto_1

    .line 43
    :cond_1
    invoke-direct {p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->h()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 44
    invoke-virtual {p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->getDuration()I

    move-result v0

    if-le p1, v0, :cond_2

    .line 45
    invoke-virtual {p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->getDuration()I

    move-result p1

    .line 46
    :cond_2
    iget-boolean v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->G:Z

    if-eqz v0, :cond_3

    .line 47
    iput p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->H:I

    goto :goto_0

    :cond_3
    const/4 v0, -0x1

    .line 48
    iput v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->H:I

    .line 49
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->m:Lcom/tencent/ijk/media/player/IMediaPlayer;

    int-to-long v1, p1

    invoke-interface {v0, v1, v2}, Lcom/tencent/ijk/media/player/IMediaPlayer;->seekTo(J)V

    :goto_0
    const/4 p1, 0x1

    .line 50
    iput-boolean p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->G:Z

    :cond_4
    :goto_1
    return-void
.end method

.method public a(Z)V
    .locals 3

    .line 29
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->m:Lcom/tencent/ijk/media/player/IMediaPlayer;

    if-eqz v0, :cond_1

    .line 30
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->h:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "release player "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->m:Lcom/tencent/ijk/media/player/IMediaPlayer;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->m:Lcom/tencent/ijk/media/player/IMediaPlayer;

    invoke-interface {v0}, Lcom/tencent/ijk/media/player/IMediaPlayer;->release()V

    const/4 v0, 0x0

    .line 32
    iput-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->m:Lcom/tencent/ijk/media/player/IMediaPlayer;

    const/4 v1, 0x0

    .line 33
    iput v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->j:I

    if-eqz p1, :cond_0

    .line 34
    iput v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->k:I

    .line 35
    iput v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->n:I

    .line 36
    iput v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->o:I

    .line 37
    :cond_0
    iget-boolean p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->b:Z

    if-eqz p1, :cond_1

    .line 38
    iget-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->w:Landroid/content/Context;

    const-string v1, "audio"

    invoke-virtual {p1, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/media/AudioManager;

    .line 39
    invoke-virtual {p1, v0}, Landroid/media/AudioManager;->abandonAudioFocus(Landroid/media/AudioManager$OnAudioFocusChangeListener;)I

    :cond_1
    return-void
.end method

.method public b()V
    .locals 4

    .line 4
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->h:Ljava/lang/String;

    const-string v1, "start"

    invoke-static {v0, v1}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 5
    invoke-direct {p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->h()Z

    move-result v0

    const/4 v1, 0x3

    if-eqz v0, :cond_0

    .line 6
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->m:Lcom/tencent/ijk/media/player/IMediaPlayer;

    invoke-interface {v0}, Lcom/tencent/ijk/media/player/IMediaPlayer;->start()V

    .line 7
    iget v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->j:I

    if-eq v0, v1, :cond_0

    iget-boolean v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->G:Z

    if-nez v0, :cond_0

    .line 8
    iput v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->j:I

    .line 9
    const-string v0, "Playback started"

    const-string v2, "playing"

    const/16 v3, 0x7d4

    invoke-direct {p0, v3, v0, v2}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 10
    :cond_0
    iput v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->k:I

    return-void
.end method

.method public b(Z)Z
    .locals 1

    .line 11
    iget v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->j:I

    if-nez v0, :cond_0

    .line 12
    iput-boolean p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->b:Z

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public c()V
    .locals 5

    .line 3
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->m:Lcom/tencent/ijk/media/player/IMediaPlayer;

    if-eqz v0, :cond_3

    .line 4
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->D:Lcom/tencent/liteav/txcvodplayer/a/a;

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    .line 5
    invoke-virtual {p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->getDuration()I

    move-result v0

    if-gtz v0, :cond_0

    .line 6
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->E:Lcom/tencent/liteav/txcvodplayer/a/b;

    iget-object v3, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->D:Lcom/tencent/liteav/txcvodplayer/a/a;

    invoke-virtual {v3}, Lcom/tencent/liteav/txcvodplayer/a/a;->d()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    invoke-virtual {v0, v3, v4}, Lcom/tencent/liteav/txcvodplayer/a/b;->a(Ljava/lang/String;Z)V

    goto :goto_0

    .line 7
    :cond_0
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->E:Lcom/tencent/liteav/txcvodplayer/a/b;

    iget-object v3, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->D:Lcom/tencent/liteav/txcvodplayer/a/a;

    invoke-virtual {v3}, Lcom/tencent/liteav/txcvodplayer/a/a;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3, v2}, Lcom/tencent/liteav/txcvodplayer/a/b;->a(Ljava/lang/String;Z)V

    .line 8
    :goto_0
    iput-object v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->D:Lcom/tencent/liteav/txcvodplayer/a/a;

    .line 9
    :cond_1
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->m:Lcom/tencent/ijk/media/player/IMediaPlayer;

    invoke-interface {v0}, Lcom/tencent/ijk/media/player/IMediaPlayer;->stop()V

    .line 10
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->m:Lcom/tencent/ijk/media/player/IMediaPlayer;

    invoke-interface {v0}, Lcom/tencent/ijk/media/player/IMediaPlayer;->release()V

    .line 11
    iput-object v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->m:Lcom/tencent/ijk/media/player/IMediaPlayer;

    .line 12
    iput-object v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->i:Landroid/net/Uri;

    .line 13
    iput v2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->n:I

    .line 14
    iput v2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->o:I

    const/high16 v0, 0x3f800000    # 1.0f

    .line 15
    iput v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->C:F

    .line 16
    iput-boolean v2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->G:Z

    const/4 v0, -0x1

    .line 17
    iput v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->H:I

    .line 18
    iput v2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->j:I

    .line 19
    iput v2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->k:I

    .line 20
    iput-boolean v2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->M:Z

    .line 21
    iput v2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->L:I

    .line 22
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->N:Lcom/tencent/liteav/txcvodplayer/b;

    if-eqz v0, :cond_2

    .line 23
    invoke-virtual {v0, v1}, Lcom/tencent/liteav/txcvodplayer/b;->a(Lcom/tencent/ijk/media/player/IMediaPlayer;)V

    .line 24
    :cond_2
    iget-boolean v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->b:Z

    if-eqz v0, :cond_3

    .line 25
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->w:Landroid/content/Context;

    const-string v2, "audio"

    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/media/AudioManager;

    .line 26
    invoke-virtual {v0, v1}, Landroid/media/AudioManager;->abandonAudioFocus(Landroid/media/AudioManager$OnAudioFocusChangeListener;)I

    .line 27
    :cond_3
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->ae:Landroid/os/Handler;

    if-eqz v0, :cond_4

    const/16 v1, 0x66

    .line 28
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 29
    :cond_4
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->h:Ljava/lang/String;

    const-string v1, "stop"

    invoke-static {v0, v1}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public d()V
    .locals 3

    const/4 v0, 0x4

    .line 3
    iput v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->k:I

    .line 4
    iget-object v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->h:Ljava/lang/String;

    const-string v2, "pause"

    invoke-static {v1, v2}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 5
    invoke-direct {p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->h()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 6
    iget-object v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->m:Lcom/tencent/ijk/media/player/IMediaPlayer;

    invoke-interface {v1}, Lcom/tencent/ijk/media/player/IMediaPlayer;->isPlaying()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 7
    iget-object v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->m:Lcom/tencent/ijk/media/player/IMediaPlayer;

    invoke-interface {v1}, Lcom/tencent/ijk/media/player/IMediaPlayer;->pause()V

    .line 8
    iput v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->j:I

    :cond_0
    return-void
.end method

.method public e()Z
    .locals 2

    .line 3
    invoke-direct {p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->m:Lcom/tencent/ijk/media/player/IMediaPlayer;

    invoke-interface {v0}, Lcom/tencent/ijk/media/player/IMediaPlayer;->isPlaying()Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->j:I

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public getBitrateIndex()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->m:Lcom/tencent/ijk/media/player/IMediaPlayer;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/tencent/ijk/media/player/IMediaPlayer;->getBitrateIndex()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    iget v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->L:I

    .line 11
    .line 12
    return v0
.end method

.method public getBufferDuration()I
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->m:Lcom/tencent/ijk/media/player/IMediaPlayer;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->getUnwrappedMediaPlayer()Lcom/tencent/ijk/media/player/IMediaPlayer;

    .line 6
    .line 7
    .line 8
    iget v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->t:I

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->getDuration()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    mul-int/2addr v0, v1

    .line 15
    div-int/lit8 v0, v0, 0x64

    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->getCurrentPosition()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-ge v0, v1, :cond_0

    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->getCurrentPosition()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    :cond_0
    invoke-virtual {p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->getDuration()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    sub-int/2addr v1, v0

    .line 32
    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    const/16 v2, 0x3e8

    .line 37
    .line 38
    if-ge v1, v2, :cond_1

    .line 39
    .line 40
    invoke-virtual {p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->getDuration()I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    :cond_1
    return v0

    .line 45
    :cond_2
    const/4 v0, 0x0

    .line 46
    return v0
.end method

.method public getCurrentPosition()I
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->G:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->H:I

    .line 6
    .line 7
    if-ltz v0, :cond_0

    .line 8
    .line 9
    return v0

    .line 10
    :cond_0
    iget v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->u:I

    .line 11
    .line 12
    if-lez v0, :cond_1

    .line 13
    .line 14
    return v0

    .line 15
    :cond_1
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->m:Lcom/tencent/ijk/media/player/IMediaPlayer;

    .line 16
    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    invoke-interface {v0}, Lcom/tencent/ijk/media/player/IMediaPlayer;->getCurrentPosition()J

    .line 20
    .line 21
    .line 22
    move-result-wide v0

    .line 23
    long-to-int v0, v0

    .line 24
    return v0

    .line 25
    :cond_2
    const/4 v0, 0x0

    .line 26
    return v0
.end method

.method public getDuration()I
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->m:Lcom/tencent/ijk/media/player/IMediaPlayer;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->v:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-ge v1, v2, :cond_0

    .line 9
    .line 10
    invoke-interface {v0}, Lcom/tencent/ijk/media/player/IMediaPlayer;->getDuration()J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    long-to-int v0, v0

    .line 15
    iput v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->v:I

    .line 16
    .line 17
    :cond_0
    iget v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->v:I

    .line 18
    .line 19
    return v0
.end method

.method public getMediaInfo()Lcom/tencent/ijk/media/player/MediaInfo;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->m:Lcom/tencent/ijk/media/player/IMediaPlayer;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return-object v0

    .line 7
    :cond_0
    invoke-interface {v0}, Lcom/tencent/ijk/media/player/IMediaPlayer;->getMediaInfo()Lcom/tencent/ijk/media/player/MediaInfo;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public getMetaRotationDegree()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->s:I

    .line 2
    .line 3
    return v0
.end method

.method public getPlayerType()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getServerIp()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->B:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getSupportedBitrates()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/tencent/ijk/media/player/IjkBitrateItem;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->m:Lcom/tencent/ijk/media/player/IMediaPlayer;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/tencent/ijk/media/player/IMediaPlayer;->getSupportedBitrates()Ljava/util/ArrayList;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public getUnwrappedMediaPlayer()Lcom/tencent/ijk/media/player/IMediaPlayer;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->m:Lcom/tencent/ijk/media/player/IMediaPlayer;

    .line 2
    .line 3
    instance-of v1, v0, Lcom/tencent/ijk/media/player/TextureMediaPlayer;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Lcom/tencent/ijk/media/player/TextureMediaPlayer;

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/tencent/ijk/media/player/TextureMediaPlayer;->getBackEndMediaPlayer()Lcom/tencent/ijk/media/player/IMediaPlayer;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    :cond_0
    return-object v0
.end method

.method public getUrlPathExtention()Ljava/lang/String;
    .locals 3
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->i:Landroid/net/Uri;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->i:Landroid/net/Uri;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const-string v1, "."

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    add-int/lit8 v1, v1, 0x1

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    return-object v0

    .line 34
    :cond_0
    const-string v0, ""

    .line 35
    .line 36
    return-object v0
.end method

.method public getVideoHeight()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->o:I

    .line 2
    .line 3
    return v0
.end method

.method public getVideoRotationDegree()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->r:I

    .line 2
    .line 3
    return v0
.end method

.method public getVideoWidth()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->n:I

    .line 2
    .line 3
    return v0
.end method

.method public setAutoPlay(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c:Z

    .line 2
    .line 3
    return-void
.end method

.method public setAutoRotate(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a:Z

    .line 2
    .line 3
    return-void
.end method

.method public setBitrateIndex(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->h:Ljava/lang/String;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    const-string v2, "setBitrateIndex "

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-static {v0, v1}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iget v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->L:I

    .line 24
    .line 25
    if-ne v0, p1, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    iput p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->L:I

    .line 29
    .line 30
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->m:Lcom/tencent/ijk/media/player/IMediaPlayer;

    .line 31
    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    iget-object v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->x:Lcom/tencent/liteav/txcvodplayer/d;

    .line 35
    .line 36
    iget-boolean v1, v1, Lcom/tencent/liteav/txcvodplayer/d;->j:Z

    .line 37
    .line 38
    if-eqz v1, :cond_1

    .line 39
    .line 40
    invoke-interface {v0, p1}, Lcom/tencent/ijk/media/player/IMediaPlayer;->setBitrateIndex(I)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_1
    invoke-direct {p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->g()V

    .line 45
    .line 46
    .line 47
    :cond_2
    :goto_0
    return-void
.end method

.method public setConfig(Lcom/tencent/liteav/txcvodplayer/d;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iput-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->x:Lcom/tencent/liteav/txcvodplayer/d;

    .line 4
    .line 5
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->E:Lcom/tencent/liteav/txcvodplayer/a/b;

    .line 6
    .line 7
    iget-object p1, p1, Lcom/tencent/liteav/txcvodplayer/d;->k:Ljava/lang/String;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lcom/tencent/liteav/txcvodplayer/a/b;->a(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public setListener(Lcom/tencent/liteav/txcvodplayer/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->ad:Lcom/tencent/liteav/txcvodplayer/e;

    .line 2
    .line 3
    return-void
.end method

.method public setMute(Z)V
    .locals 2

    .line 1
    iput-boolean p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->K:Z

    .line 2
    .line 3
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->m:Lcom/tencent/ijk/media/player/IMediaPlayer;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    if-eqz p1, :cond_1

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    invoke-interface {v0, p1, p1}, Lcom/tencent/ijk/media/player/IMediaPlayer;->setVolume(FF)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_1
    iget p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->I:F

    .line 16
    .line 17
    iget v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->J:F

    .line 18
    .line 19
    invoke-interface {v0, p1, v1}, Lcom/tencent/ijk/media/player/IMediaPlayer;->setVolume(FF)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public setPlayerType(I)V
    .locals 0

    return-void
.end method

.method public setRate(F)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->h:Ljava/lang/String;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    const-string v2, "setRate "

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-static {v0, v1}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->m:Lcom/tencent/ijk/media/player/IMediaPlayer;

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    invoke-interface {v0, p1}, Lcom/tencent/ijk/media/player/IMediaPlayer;->setRate(F)V

    .line 28
    .line 29
    .line 30
    :cond_0
    iput p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->C:F

    .line 31
    .line 32
    return-void
.end method

.method public setRender(I)V
    .locals 3

    .line 1
    if-eqz p1, :cond_3

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eq p1, v0, :cond_2

    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    if-eq p1, v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->h:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    const-string v2, "invalid render %d\n"

    .line 24
    .line 25
    invoke-static {v1, v2, p1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-static {v0, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_0
    new-instance p1, Lcom/tencent/liteav/txcvodplayer/TextureRenderView;

    .line 34
    .line 35
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->w:Landroid/content/Context;

    .line 36
    .line 37
    invoke-direct {p1, v0}, Lcom/tencent/liteav/txcvodplayer/TextureRenderView;-><init>(Landroid/content/Context;)V

    .line 38
    .line 39
    .line 40
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->m:Lcom/tencent/ijk/media/player/IMediaPlayer;

    .line 41
    .line 42
    if-eqz v0, :cond_1

    .line 43
    .line 44
    invoke-virtual {p1}, Lcom/tencent/liteav/txcvodplayer/TextureRenderView;->getSurfaceHolder()Lcom/tencent/liteav/txcvodplayer/a$b;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iget-object v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->m:Lcom/tencent/ijk/media/player/IMediaPlayer;

    .line 49
    .line 50
    invoke-interface {v0, v1}, Lcom/tencent/liteav/txcvodplayer/a$b;->a(Lcom/tencent/ijk/media/player/IMediaPlayer;)V

    .line 51
    .line 52
    .line 53
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->m:Lcom/tencent/ijk/media/player/IMediaPlayer;

    .line 54
    .line 55
    invoke-interface {v0}, Lcom/tencent/ijk/media/player/IMediaPlayer;->getVideoWidth()I

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    iget-object v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->m:Lcom/tencent/ijk/media/player/IMediaPlayer;

    .line 60
    .line 61
    invoke-interface {v1}, Lcom/tencent/ijk/media/player/IMediaPlayer;->getVideoHeight()I

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    invoke-virtual {p1, v0, v1}, Lcom/tencent/liteav/txcvodplayer/TextureRenderView;->setVideoSize(II)V

    .line 66
    .line 67
    .line 68
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->m:Lcom/tencent/ijk/media/player/IMediaPlayer;

    .line 69
    .line 70
    invoke-interface {v0}, Lcom/tencent/ijk/media/player/IMediaPlayer;->getVideoSarNum()I

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    iget-object v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->m:Lcom/tencent/ijk/media/player/IMediaPlayer;

    .line 75
    .line 76
    invoke-interface {v1}, Lcom/tencent/ijk/media/player/IMediaPlayer;->getVideoSarDen()I

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    invoke-virtual {p1, v0, v1}, Lcom/tencent/liteav/txcvodplayer/TextureRenderView;->setVideoSampleAspectRatio(II)V

    .line 81
    .line 82
    .line 83
    iget v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->ac:I

    .line 84
    .line 85
    invoke-virtual {p1, v0}, Lcom/tencent/liteav/txcvodplayer/TextureRenderView;->setAspectRatio(I)V

    .line 86
    .line 87
    .line 88
    :cond_1
    invoke-virtual {p0, p1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->setRenderView(Lcom/tencent/liteav/txcvodplayer/a;)V

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    :cond_2
    new-instance p1, Lcom/tencent/liteav/txcvodplayer/SurfaceRenderView;

    .line 93
    .line 94
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->w:Landroid/content/Context;

    .line 95
    .line 96
    invoke-direct {p1, v0}, Lcom/tencent/liteav/txcvodplayer/SurfaceRenderView;-><init>(Landroid/content/Context;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p0, p1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->setRenderView(Lcom/tencent/liteav/txcvodplayer/a;)V

    .line 100
    .line 101
    .line 102
    return-void

    .line 103
    :cond_3
    const/4 p1, 0x0

    .line 104
    invoke-virtual {p0, p1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->setRenderView(Lcom/tencent/liteav/txcvodplayer/a;)V

    .line 105
    .line 106
    .line 107
    return-void
.end method

.method public setRenderMode(I)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->ac:I

    .line 2
    .line 3
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->y:Lcom/tencent/liteav/txcvodplayer/a;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v0, p1}, Lcom/tencent/liteav/txcvodplayer/a;->setAspectRatio(I)V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->y:Lcom/tencent/liteav/txcvodplayer/a;

    .line 11
    .line 12
    if-eqz p1, :cond_1

    .line 13
    .line 14
    iget v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->r:I

    .line 15
    .line 16
    invoke-interface {p1, v0}, Lcom/tencent/liteav/txcvodplayer/a;->setVideoRotation(I)V

    .line 17
    .line 18
    .line 19
    :cond_1
    return-void
.end method

.method public setRenderSurface(Landroid/view/Surface;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$1;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$1;-><init>(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;Landroid/view/Surface;)V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->l:Lcom/tencent/liteav/txcvodplayer/a$b;

    .line 7
    .line 8
    iget-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->m:Lcom/tencent/ijk/media/player/IMediaPlayer;

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    invoke-direct {p0, p1, v0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(Lcom/tencent/ijk/media/player/IMediaPlayer;Lcom/tencent/liteav/txcvodplayer/a$b;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public setRenderView(Lcom/tencent/liteav/txcvodplayer/a;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->h:Ljava/lang/String;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    const-string v2, "setRenderView "

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-static {v0, v1}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->y:Lcom/tencent/liteav/txcvodplayer/a;

    .line 24
    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->m:Lcom/tencent/ijk/media/player/IMediaPlayer;

    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    invoke-interface {v0, v1}, Lcom/tencent/ijk/media/player/IMediaPlayer;->setDisplay(Landroid/view/SurfaceHolder;)V

    .line 33
    .line 34
    .line 35
    :cond_0
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->y:Lcom/tencent/liteav/txcvodplayer/a;

    .line 36
    .line 37
    invoke-interface {v0}, Lcom/tencent/liteav/txcvodplayer/a;->getView()Landroid/view/View;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    iget-object v2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->y:Lcom/tencent/liteav/txcvodplayer/a;

    .line 42
    .line 43
    iget-object v3, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->g:Lcom/tencent/liteav/txcvodplayer/a$a;

    .line 44
    .line 45
    invoke-interface {v2, v3}, Lcom/tencent/liteav/txcvodplayer/a;->removeRenderCallback(Lcom/tencent/liteav/txcvodplayer/a$a;)V

    .line 46
    .line 47
    .line 48
    iput-object v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->y:Lcom/tencent/liteav/txcvodplayer/a;

    .line 49
    .line 50
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    if-ne v1, p0, :cond_1

    .line 55
    .line 56
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 57
    .line 58
    .line 59
    :cond_1
    if-nez p1, :cond_2

    .line 60
    .line 61
    return-void

    .line 62
    :cond_2
    iput-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->y:Lcom/tencent/liteav/txcvodplayer/a;

    .line 63
    .line 64
    iget v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->ac:I

    .line 65
    .line 66
    invoke-interface {p1, v0}, Lcom/tencent/liteav/txcvodplayer/a;->setAspectRatio(I)V

    .line 67
    .line 68
    .line 69
    iget v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->n:I

    .line 70
    .line 71
    if-lez v0, :cond_3

    .line 72
    .line 73
    iget v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->o:I

    .line 74
    .line 75
    if-lez v1, :cond_3

    .line 76
    .line 77
    invoke-interface {p1, v0, v1}, Lcom/tencent/liteav/txcvodplayer/a;->setVideoSize(II)V

    .line 78
    .line 79
    .line 80
    :cond_3
    iget v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->z:I

    .line 81
    .line 82
    if-lez v0, :cond_4

    .line 83
    .line 84
    iget v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->A:I

    .line 85
    .line 86
    if-lez v1, :cond_4

    .line 87
    .line 88
    invoke-interface {p1, v0, v1}, Lcom/tencent/liteav/txcvodplayer/a;->setVideoSampleAspectRatio(II)V

    .line 89
    .line 90
    .line 91
    :cond_4
    iget-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->y:Lcom/tencent/liteav/txcvodplayer/a;

    .line 92
    .line 93
    invoke-interface {p1}, Lcom/tencent/liteav/txcvodplayer/a;->getView()Landroid/view/View;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 98
    .line 99
    const/16 v1, 0x11

    .line 100
    .line 101
    const/4 v2, -0x2

    .line 102
    invoke-direct {v0, v2, v2, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    if-nez v0, :cond_5

    .line 113
    .line 114
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 115
    .line 116
    .line 117
    :cond_5
    iget-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->y:Lcom/tencent/liteav/txcvodplayer/a;

    .line 118
    .line 119
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->g:Lcom/tencent/liteav/txcvodplayer/a$a;

    .line 120
    .line 121
    invoke-interface {p1, v0}, Lcom/tencent/liteav/txcvodplayer/a;->addRenderCallback(Lcom/tencent/liteav/txcvodplayer/a$a;)V

    .line 122
    .line 123
    .line 124
    iget-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->y:Lcom/tencent/liteav/txcvodplayer/a;

    .line 125
    .line 126
    iget v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->r:I

    .line 127
    .line 128
    invoke-interface {p1, v0}, Lcom/tencent/liteav/txcvodplayer/a;->setVideoRotation(I)V

    .line 129
    .line 130
    .line 131
    return-void
.end method

.method public setStartTime(F)V
    .locals 1

    .line 1
    const/high16 v0, 0x447a0000    # 1000.0f

    .line 2
    .line 3
    mul-float/2addr p1, v0

    .line 4
    float-to-int p1, p1

    .line 5
    iput p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->u:I

    .line 6
    .line 7
    return-void
.end method

.method public setTextureRenderView(Lcom/tencent/liteav/txcvodplayer/TextureRenderView;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->h:Ljava/lang/String;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    const-string v2, "setTextureRenderView "

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-static {v0, v1}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->m:Lcom/tencent/ijk/media/player/IMediaPlayer;

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    invoke-virtual {p1}, Lcom/tencent/liteav/txcvodplayer/TextureRenderView;->getSurfaceHolder()Lcom/tencent/liteav/txcvodplayer/a$b;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iget-object v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->m:Lcom/tencent/ijk/media/player/IMediaPlayer;

    .line 32
    .line 33
    invoke-interface {v0, v1}, Lcom/tencent/liteav/txcvodplayer/a$b;->a(Lcom/tencent/ijk/media/player/IMediaPlayer;)V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->m:Lcom/tencent/ijk/media/player/IMediaPlayer;

    .line 37
    .line 38
    invoke-interface {v0}, Lcom/tencent/ijk/media/player/IMediaPlayer;->getVideoWidth()I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    iget-object v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->m:Lcom/tencent/ijk/media/player/IMediaPlayer;

    .line 43
    .line 44
    invoke-interface {v1}, Lcom/tencent/ijk/media/player/IMediaPlayer;->getVideoHeight()I

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    invoke-virtual {p1, v0, v1}, Lcom/tencent/liteav/txcvodplayer/TextureRenderView;->setVideoSize(II)V

    .line 49
    .line 50
    .line 51
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->m:Lcom/tencent/ijk/media/player/IMediaPlayer;

    .line 52
    .line 53
    invoke-interface {v0}, Lcom/tencent/ijk/media/player/IMediaPlayer;->getVideoSarNum()I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    iget-object v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->m:Lcom/tencent/ijk/media/player/IMediaPlayer;

    .line 58
    .line 59
    invoke-interface {v1}, Lcom/tencent/ijk/media/player/IMediaPlayer;->getVideoSarDen()I

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    invoke-virtual {p1, v0, v1}, Lcom/tencent/liteav/txcvodplayer/TextureRenderView;->setVideoSampleAspectRatio(II)V

    .line 64
    .line 65
    .line 66
    iget v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->ac:I

    .line 67
    .line 68
    invoke-virtual {p1, v0}, Lcom/tencent/liteav/txcvodplayer/TextureRenderView;->setAspectRatio(I)V

    .line 69
    .line 70
    .line 71
    :cond_0
    invoke-virtual {p0, p1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->setRenderView(Lcom/tencent/liteav/txcvodplayer/a;)V

    .line 72
    .line 73
    .line 74
    return-void
.end method

.method public setVideoPath(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->setVideoURI(Landroid/net/Uri;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setVideoRotationDegree(I)V
    .locals 3

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    const/16 v0, 0x5a

    .line 4
    .line 5
    if-eq p1, v0, :cond_1

    .line 6
    .line 7
    const/16 v0, 0xb4

    .line 8
    .line 9
    if-eq p1, v0, :cond_1

    .line 10
    .line 11
    const/16 v0, 0x10e

    .line 12
    .line 13
    if-eq p1, v0, :cond_1

    .line 14
    .line 15
    const/16 v0, 0x168

    .line 16
    .line 17
    if-eq p1, v0, :cond_0

    .line 18
    .line 19
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->h:Ljava/lang/String;

    .line 20
    .line 21
    new-instance v1, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 24
    .line 25
    .line 26
    const-string v2, "not support degree "

    .line 27
    .line 28
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-static {v0, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_0
    const/4 p1, 0x0

    .line 43
    :cond_1
    iput p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->r:I

    .line 44
    .line 45
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->y:Lcom/tencent/liteav/txcvodplayer/a;

    .line 46
    .line 47
    if-eqz v0, :cond_2

    .line 48
    .line 49
    invoke-interface {v0, p1}, Lcom/tencent/liteav/txcvodplayer/a;->setVideoRotation(I)V

    .line 50
    .line 51
    .line 52
    :cond_2
    iget-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->y:Lcom/tencent/liteav/txcvodplayer/a;

    .line 53
    .line 54
    if-eqz p1, :cond_3

    .line 55
    .line 56
    iget v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->ac:I

    .line 57
    .line 58
    invoke-interface {p1, v0}, Lcom/tencent/liteav/txcvodplayer/a;->setAspectRatio(I)V

    .line 59
    .line 60
    .line 61
    :cond_3
    return-void
.end method

.method public setVideoURI(Landroid/net/Uri;)V
    .locals 3

    .line 1
    iput-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->i:Landroid/net/Uri;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    iput v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->v:I

    .line 5
    .line 6
    iput v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->Q:I

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->B:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->h:Ljava/lang/String;

    .line 12
    .line 13
    new-instance v1, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 16
    .line 17
    .line 18
    const-string v2, "setVideoURI "

    .line 19
    .line 20
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-static {v0, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-direct {p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->f()Z

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public setVolume(I)V
    .locals 1

    .line 1
    int-to-float p1, p1

    .line 2
    const/high16 v0, 0x42c80000    # 100.0f

    .line 3
    .line 4
    div-float/2addr p1, v0

    .line 5
    iput p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->I:F

    .line 6
    .line 7
    iput p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->J:F

    .line 8
    .line 9
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->m:Lcom/tencent/ijk/media/player/IMediaPlayer;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-interface {v0, p1, p1}, Lcom/tencent/ijk/media/player/IMediaPlayer;->setVolume(FF)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method
