.class public Lcom/zykj/video/play/view/TCPointSeekBar$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/video/play/view/TCPointSeekBar;->i(Lcom/zykj/video/play/view/TCPointSeekBar$f;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/zykj/video/play/view/TCPointSeekBar$g;

.field public final synthetic b:I

.field public final synthetic c:Lcom/zykj/video/play/view/TCPointSeekBar;


# direct methods
.method public constructor <init>(Lcom/zykj/video/play/view/TCPointSeekBar;Lcom/zykj/video/play/view/TCPointSeekBar$g;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/video/play/view/TCPointSeekBar$c;->c:Lcom/zykj/video/play/view/TCPointSeekBar;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/video/play/view/TCPointSeekBar$c;->a:Lcom/zykj/video/play/view/TCPointSeekBar$g;

    .line 4
    .line 5
    iput p3, p0, Lcom/zykj/video/play/view/TCPointSeekBar$c;->b:I

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/zykj/video/play/view/TCPointSeekBar$c;->c:Lcom/zykj/video/play/view/TCPointSeekBar;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/zykj/video/play/view/TCPointSeekBar;->h(Lcom/zykj/video/play/view/TCPointSeekBar;)Lcom/zykj/video/play/view/TCPointSeekBar$e;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, Lcom/zykj/video/play/view/TCPointSeekBar$c;->c:Lcom/zykj/video/play/view/TCPointSeekBar;

    .line 10
    .line 11
    invoke-static {p1}, Lcom/zykj/video/play/view/TCPointSeekBar;->h(Lcom/zykj/video/play/view/TCPointSeekBar;)Lcom/zykj/video/play/view/TCPointSeekBar$e;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iget-object v0, p0, Lcom/zykj/video/play/view/TCPointSeekBar$c;->a:Lcom/zykj/video/play/view/TCPointSeekBar$g;

    .line 16
    .line 17
    iget v1, p0, Lcom/zykj/video/play/view/TCPointSeekBar$c;->b:I

    .line 18
    .line 19
    invoke-interface {p1, v0, v1}, Lcom/zykj/video/play/view/TCPointSeekBar$e;->h(Landroid/view/View;I)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
.end method
