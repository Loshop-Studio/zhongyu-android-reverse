.class public Lcom/zykj/video/play/view/TCVodMoreView$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/SeekBar$OnSeekBarChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/video/play/view/TCVodMoreView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/zykj/video/play/view/TCVodMoreView;


# direct methods
.method public constructor <init>(Lcom/zykj/video/play/view/TCVodMoreView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/video/play/view/TCVodMoreView$b;->a:Lcom/zykj/video/play/view/TCVodMoreView;

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
    iget-object p1, p0, Lcom/zykj/video/play/view/TCVodMoreView$b;->a:Lcom/zykj/video/play/view/TCVodMoreView;

    .line 2
    .line 3
    invoke-static {p1, p2}, Lcom/zykj/video/play/view/TCVodMoreView;->b(Lcom/zykj/video/play/view/TCVodMoreView;I)V

    .line 4
    .line 5
    .line 6
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
