.class public Lcom/zykj/video/play/SuperPlayerView;
.super Landroid/widget/RelativeLayout;
.source "SourceFile"

# interfaces
.implements Lcom/tencent/rtmp/ITXVodPlayListener;
.implements Lcom/tencent/rtmp/ITXLivePlayListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/video/play/SuperPlayerView$f;,
        Lcom/zykj/video/play/SuperPlayerView$PLAYER_TYPE;
    }
.end annotation


# instance fields
.field public A:I

.field public B:J

.field public C:J

.field public D:J

.field public E:Z

.field public F:Z

.field public G:Z

.field public H:Z

.field public I:Z

.field public J:Lcom/zykj/video/play/SuperPlayerView$PLAYER_TYPE;

.field public K:F

.field public L:Lk5/c;

.field public final a:I

.field public b:Landroid/content/Context;

.field public c:Landroid/view/ViewGroup;

.field public d:Lcom/tencent/rtmp/ui/TXCloudVideoView;

.field public e:Lcom/zykj/video/play/controller/TCControllerFullScreen;

.field public f:Lcom/zykj/video/play/controller/TCControllerWindow;

.field public g:Lcom/zykj/video/play/controller/TCControllerFloat;

.field public h:Lcom/zykj/video/play/view/TCDanmuView;

.field public i:Landroid/view/ViewGroup$LayoutParams;

.field public j:Landroid/view/ViewGroup$LayoutParams;

.field public k:Landroid/widget/RelativeLayout$LayoutParams;

.field public l:Landroid/widget/RelativeLayout$LayoutParams;

.field public m:Landroid/view/WindowManager;

.field public n:Landroid/view/WindowManager$LayoutParams;

.field public o:Lcom/zykj/video/play/b;

.field public p:Lm5/b;

.field public q:Lcom/tencent/rtmp/TXVodPlayer;

.field public r:Lcom/tencent/rtmp/TXVodPlayConfig;

.field public s:Lcom/tencent/rtmp/TXLivePlayer;

.field public t:Lcom/tencent/rtmp/TXLivePlayConfig;

.field public u:Lcom/zykj/video/play/SuperPlayerView$f;

.field public v:Ln5/c;

.field public w:Ljava/lang/String;

.field public x:I

.field public y:I

.field public z:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2
    .line 3
    .line 4
    const/16 p2, 0x18

    .line 5
    .line 6
    iput p2, p0, Lcom/zykj/video/play/SuperPlayerView;->a:I

    .line 7
    .line 8
    const/4 p2, 0x2

    .line 9
    iput p2, p0, Lcom/zykj/video/play/SuperPlayerView;->y:I

    .line 10
    .line 11
    const/4 p2, 0x1

    .line 12
    iput p2, p0, Lcom/zykj/video/play/SuperPlayerView;->z:I

    .line 13
    .line 14
    const-wide/16 v0, -0x1

    .line 15
    .line 16
    iput-wide v0, p0, Lcom/zykj/video/play/SuperPlayerView;->B:J

    .line 17
    .line 18
    iput-wide v0, p0, Lcom/zykj/video/play/SuperPlayerView;->C:J

    .line 19
    .line 20
    const/4 p2, 0x0

    .line 21
    iput-boolean p2, p0, Lcom/zykj/video/play/SuperPlayerView;->I:Z

    .line 22
    .line 23
    sget-object p2, Lcom/zykj/video/play/SuperPlayerView$PLAYER_TYPE;->a:Lcom/zykj/video/play/SuperPlayerView$PLAYER_TYPE;

    .line 24
    .line 25
    iput-object p2, p0, Lcom/zykj/video/play/SuperPlayerView;->J:Lcom/zykj/video/play/SuperPlayerView$PLAYER_TYPE;

    .line 26
    .line 27
    const/high16 p2, 0x3f800000    # 1.0f

    .line 28
    .line 29
    iput p2, p0, Lcom/zykj/video/play/SuperPlayerView;->K:F

    .line 30
    .line 31
    new-instance p2, Lcom/zykj/video/play/SuperPlayerView$c;

    .line 32
    .line 33
    invoke-direct {p2, p0}, Lcom/zykj/video/play/SuperPlayerView$c;-><init>(Lcom/zykj/video/play/SuperPlayerView;)V

    .line 34
    .line 35
    .line 36
    iput-object p2, p0, Lcom/zykj/video/play/SuperPlayerView;->L:Lk5/c;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, Lcom/zykj/video/play/SuperPlayerView;->b0(Landroid/content/Context;)V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public static synthetic A(Lcom/zykj/video/play/SuperPlayerView;)Ln5/c;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/video/play/SuperPlayerView;->v:Ln5/c;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic B(Lcom/zykj/video/play/SuperPlayerView;I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/video/play/SuperPlayerView;->v0(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic C(Lcom/zykj/video/play/SuperPlayerView;J)J
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/zykj/video/play/SuperPlayerView;->C:J

    .line 2
    .line 3
    return-wide p1
.end method

.method public static synthetic D(Lcom/zykj/video/play/SuperPlayerView;)Lcom/zykj/video/play/SuperPlayerView$PLAYER_TYPE;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/video/play/SuperPlayerView;->J:Lcom/zykj/video/play/SuperPlayerView$PLAYER_TYPE;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic E(Lcom/zykj/video/play/SuperPlayerView;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/video/play/SuperPlayerView;->w:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic F(Lcom/zykj/video/play/SuperPlayerView;Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/video/play/SuperPlayerView;->g0(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic G(Lcom/zykj/video/play/SuperPlayerView;)Lcom/zykj/video/play/b;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/video/play/SuperPlayerView;->o:Lcom/zykj/video/play/b;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic H(Lcom/zykj/video/play/SuperPlayerView;Lcom/zykj/video/play/b;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/video/play/SuperPlayerView;->j0(Lcom/zykj/video/play/b;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic I(Lcom/zykj/video/play/SuperPlayerView;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/video/play/SuperPlayerView;->t0(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic J(Lcom/zykj/video/play/SuperPlayerView;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/video/play/SuperPlayerView;->k0(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic K(Lcom/zykj/video/play/SuperPlayerView;)Lcom/zykj/video/play/view/TCDanmuView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/video/play/SuperPlayerView;->h:Lcom/zykj/video/play/view/TCDanmuView;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic L(Lcom/zykj/video/play/SuperPlayerView;Landroid/graphics/Bitmap;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/video/play/SuperPlayerView;->s0(Landroid/graphics/Bitmap;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic M(Lcom/zykj/video/play/SuperPlayerView;)Lcom/tencent/rtmp/ui/TXCloudVideoView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/video/play/SuperPlayerView;->d:Lcom/tencent/rtmp/ui/TXCloudVideoView;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic N(Lcom/zykj/video/play/SuperPlayerView;)F
    .locals 0

    .line 1
    iget p0, p0, Lcom/zykj/video/play/SuperPlayerView;->K:F

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic O(Lcom/zykj/video/play/SuperPlayerView;F)F
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/video/play/SuperPlayerView;->K:F

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic P(Lcom/zykj/video/play/SuperPlayerView;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/video/play/SuperPlayerView;->H:Z

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic Q(Lcom/zykj/video/play/SuperPlayerView;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/zykj/video/play/SuperPlayerView;->A:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic R(Lcom/zykj/video/play/SuperPlayerView;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/video/play/SuperPlayerView;->A:I

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic S(Lcom/zykj/video/play/SuperPlayerView;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/video/play/SuperPlayerView;->u0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic T(Lcom/zykj/video/play/SuperPlayerView;Lcom/zykj/video/play/b;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/video/play/SuperPlayerView;->h0(Lcom/zykj/video/play/b;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic U(Lcom/zykj/video/play/SuperPlayerView;)Lcom/tencent/rtmp/TXVodPlayer;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/video/play/SuperPlayerView;->q:Lcom/tencent/rtmp/TXVodPlayer;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic V(Lcom/zykj/video/play/SuperPlayerView;)Lm5/b;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/video/play/SuperPlayerView;->p:Lm5/b;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic W(Lcom/zykj/video/play/SuperPlayerView;Lm5/b;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/video/play/SuperPlayerView;->i0(Lm5/b;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic X(Lcom/zykj/video/play/SuperPlayerView;I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/video/play/SuperPlayerView;->w0(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic Y(Lcom/zykj/video/play/SuperPlayerView;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/video/play/SuperPlayerView;->x0(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic a(Lcom/zykj/video/play/SuperPlayerView;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/zykj/video/play/SuperPlayerView;->y:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic b(Lcom/zykj/video/play/SuperPlayerView;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/video/play/SuperPlayerView;->y:I

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic c(Lcom/zykj/video/play/SuperPlayerView;)Landroid/view/ViewGroup$LayoutParams;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/video/play/SuperPlayerView;->i:Landroid/view/ViewGroup$LayoutParams;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic d(Lcom/zykj/video/play/SuperPlayerView;JJ)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/zykj/video/play/SuperPlayerView;->y0(JJ)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic e(Lcom/zykj/video/play/SuperPlayerView;Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/video/play/SuperPlayerView;->i:Landroid/view/ViewGroup$LayoutParams;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic f(Lcom/zykj/video/play/SuperPlayerView;)Lcom/zykj/video/play/controller/TCControllerFullScreen;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/video/play/SuperPlayerView;->e:Lcom/zykj/video/play/controller/TCControllerFullScreen;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic g(Lcom/zykj/video/play/SuperPlayerView;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/zykj/video/play/SuperPlayerView;->I:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic h(Lcom/zykj/video/play/SuperPlayerView;Z)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/video/play/SuperPlayerView;->Z(Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic i(Lcom/zykj/video/play/SuperPlayerView;)Lcom/zykj/video/play/controller/TCControllerWindow;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/video/play/SuperPlayerView;->f:Lcom/zykj/video/play/controller/TCControllerWindow;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic j(Lcom/zykj/video/play/SuperPlayerView;)Lcom/zykj/video/play/controller/TCControllerFloat;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/video/play/SuperPlayerView;->g:Lcom/zykj/video/play/controller/TCControllerFloat;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic k(Lcom/zykj/video/play/SuperPlayerView;)Landroid/widget/RelativeLayout$LayoutParams;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/video/play/SuperPlayerView;->l:Landroid/widget/RelativeLayout$LayoutParams;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic l(Lcom/zykj/video/play/SuperPlayerView;I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/video/play/SuperPlayerView;->r0(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic m(Lcom/zykj/video/play/SuperPlayerView;)Lcom/zykj/video/play/SuperPlayerView$f;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/video/play/SuperPlayerView;->u:Lcom/zykj/video/play/SuperPlayerView$f;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic n(Lcom/zykj/video/play/SuperPlayerView;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/video/play/SuperPlayerView;->b:Landroid/content/Context;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic o(Lcom/zykj/video/play/SuperPlayerView;)Landroid/view/ViewGroup$LayoutParams;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/video/play/SuperPlayerView;->j:Landroid/view/ViewGroup$LayoutParams;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic p(Lcom/zykj/video/play/SuperPlayerView;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/video/play/SuperPlayerView;->f0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic q(Lcom/zykj/video/play/SuperPlayerView;Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/video/play/SuperPlayerView;->j:Landroid/view/ViewGroup$LayoutParams;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic r(Lcom/zykj/video/play/SuperPlayerView;)Landroid/view/WindowManager;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/video/play/SuperPlayerView;->m:Landroid/view/WindowManager;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic s(Lcom/zykj/video/play/SuperPlayerView;Landroid/view/WindowManager;)Landroid/view/WindowManager;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/video/play/SuperPlayerView;->m:Landroid/view/WindowManager;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic t(Lcom/zykj/video/play/SuperPlayerView;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/zykj/video/play/SuperPlayerView;->x:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic u(Lcom/zykj/video/play/SuperPlayerView;)Lcom/tencent/rtmp/TXLivePlayer;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/video/play/SuperPlayerView;->s:Lcom/tencent/rtmp/TXLivePlayer;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic v(Lcom/zykj/video/play/SuperPlayerView;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/video/play/SuperPlayerView;->q0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic w(Lcom/zykj/video/play/SuperPlayerView;)Landroid/widget/RelativeLayout$LayoutParams;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/video/play/SuperPlayerView;->k:Landroid/widget/RelativeLayout$LayoutParams;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic x(Lcom/zykj/video/play/SuperPlayerView;)Landroid/view/WindowManager$LayoutParams;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/video/play/SuperPlayerView;->n:Landroid/view/WindowManager$LayoutParams;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic y(Lcom/zykj/video/play/SuperPlayerView;Landroid/view/WindowManager$LayoutParams;)Landroid/view/WindowManager$LayoutParams;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/video/play/SuperPlayerView;->n:Landroid/view/WindowManager$LayoutParams;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic z(Lcom/zykj/video/play/SuperPlayerView;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/zykj/video/play/SuperPlayerView;->z:I

    .line 2
    .line 3
    return p0
.end method


# virtual methods
.method public final Z(Z)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v0, v0, Landroid/app/Activity;

    .line 6
    .line 7
    if-eqz v0, :cond_3

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Landroid/app/Activity;

    .line 14
    .line 15
    if-eqz p1, :cond_1

    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    if-nez p1, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/16 v0, 0x1006

    .line 29
    .line 30
    invoke-virtual {p1, v0}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_1
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    if-nez p1, :cond_2

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    const/4 v0, 0x0

    .line 46
    invoke-virtual {p1, v0}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 47
    .line 48
    .line 49
    :cond_3
    :goto_0
    return-void
.end method

.method public final a0(Landroid/content/Context;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView;->s:Lcom/tencent/rtmp/TXLivePlayer;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    new-instance v0, Lcom/tencent/rtmp/TXLivePlayer;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Lcom/tencent/rtmp/TXLivePlayer;-><init>(Landroid/content/Context;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lcom/zykj/video/play/SuperPlayerView;->s:Lcom/tencent/rtmp/TXLivePlayer;

    .line 12
    .line 13
    invoke-static {}, Lcom/zykj/video/play/a;->a()Lcom/zykj/video/play/a;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    new-instance v0, Lcom/tencent/rtmp/TXLivePlayConfig;

    .line 18
    .line 19
    invoke-direct {v0}, Lcom/tencent/rtmp/TXLivePlayConfig;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Lcom/zykj/video/play/SuperPlayerView;->t:Lcom/tencent/rtmp/TXLivePlayConfig;

    .line 23
    .line 24
    iget-object v1, p0, Lcom/zykj/video/play/SuperPlayerView;->s:Lcom/tencent/rtmp/TXLivePlayer;

    .line 25
    .line 26
    invoke-virtual {v1, v0}, Lcom/tencent/rtmp/TXLivePlayer;->setConfig(Lcom/tencent/rtmp/TXLivePlayConfig;)V

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView;->s:Lcom/tencent/rtmp/TXLivePlayer;

    .line 30
    .line 31
    iget v1, p1, Lcom/zykj/video/play/a;->d:I

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Lcom/tencent/rtmp/TXLivePlayer;->setRenderMode(I)V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView;->s:Lcom/tencent/rtmp/TXLivePlayer;

    .line 37
    .line 38
    const/4 v1, 0x0

    .line 39
    invoke-virtual {v0, v1}, Lcom/tencent/rtmp/TXLivePlayer;->setRenderRotation(I)V

    .line 40
    .line 41
    .line 42
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView;->s:Lcom/tencent/rtmp/TXLivePlayer;

    .line 43
    .line 44
    invoke-virtual {v0, p0}, Lcom/tencent/rtmp/TXLivePlayer;->setPlayListener(Lcom/tencent/rtmp/ITXLivePlayListener;)V

    .line 45
    .line 46
    .line 47
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView;->s:Lcom/tencent/rtmp/TXLivePlayer;

    .line 48
    .line 49
    iget-boolean p1, p1, Lcom/zykj/video/play/a;->c:Z

    .line 50
    .line 51
    invoke-virtual {v0, p1}, Lcom/tencent/rtmp/TXLivePlayer;->enableHardwareDecode(Z)Z

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public final b0(Landroid/content/Context;)V
    .locals 3

    .line 1
    iput-object p1, p0, Lcom/zykj/video/play/SuperPlayerView;->b:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget v1, Lcom/zykj/video/play/R$layout;->superplayer_vod_view:I

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Landroid/view/ViewGroup;

    .line 15
    .line 16
    iput-object v0, p0, Lcom/zykj/video/play/SuperPlayerView;->c:Landroid/view/ViewGroup;

    .line 17
    .line 18
    sget v1, Lcom/zykj/video/play/R$id;->superplayer_cloud_video_view:I

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, Lcom/tencent/rtmp/ui/TXCloudVideoView;

    .line 25
    .line 26
    iput-object v0, p0, Lcom/zykj/video/play/SuperPlayerView;->d:Lcom/tencent/rtmp/ui/TXCloudVideoView;

    .line 27
    .line 28
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView;->c:Landroid/view/ViewGroup;

    .line 29
    .line 30
    sget v1, Lcom/zykj/video/play/R$id;->superplayer_controller_large:I

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    check-cast v0, Lcom/zykj/video/play/controller/TCControllerFullScreen;

    .line 37
    .line 38
    iput-object v0, p0, Lcom/zykj/video/play/SuperPlayerView;->e:Lcom/zykj/video/play/controller/TCControllerFullScreen;

    .line 39
    .line 40
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView;->c:Landroid/view/ViewGroup;

    .line 41
    .line 42
    sget v1, Lcom/zykj/video/play/R$id;->superplayer_controller_small:I

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    check-cast v0, Lcom/zykj/video/play/controller/TCControllerWindow;

    .line 49
    .line 50
    iput-object v0, p0, Lcom/zykj/video/play/SuperPlayerView;->f:Lcom/zykj/video/play/controller/TCControllerWindow;

    .line 51
    .line 52
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView;->c:Landroid/view/ViewGroup;

    .line 53
    .line 54
    sget v1, Lcom/zykj/video/play/R$id;->superplayer_controller_float:I

    .line 55
    .line 56
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    check-cast v0, Lcom/zykj/video/play/controller/TCControllerFloat;

    .line 61
    .line 62
    iput-object v0, p0, Lcom/zykj/video/play/SuperPlayerView;->g:Lcom/zykj/video/play/controller/TCControllerFloat;

    .line 63
    .line 64
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView;->c:Landroid/view/ViewGroup;

    .line 65
    .line 66
    sget v1, Lcom/zykj/video/play/R$id;->superplayer_danmuku_view:I

    .line 67
    .line 68
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    check-cast v0, Lcom/zykj/video/play/view/TCDanmuView;

    .line 73
    .line 74
    iput-object v0, p0, Lcom/zykj/video/play/SuperPlayerView;->h:Lcom/zykj/video/play/view/TCDanmuView;

    .line 75
    .line 76
    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    .line 77
    .line 78
    const/4 v1, -0x1

    .line 79
    invoke-direct {v0, v1, v1}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 80
    .line 81
    .line 82
    iput-object v0, p0, Lcom/zykj/video/play/SuperPlayerView;->k:Landroid/widget/RelativeLayout$LayoutParams;

    .line 83
    .line 84
    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    .line 85
    .line 86
    invoke-direct {v0, v1, v1}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 87
    .line 88
    .line 89
    iput-object v0, p0, Lcom/zykj/video/play/SuperPlayerView;->l:Landroid/widget/RelativeLayout$LayoutParams;

    .line 90
    .line 91
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView;->e:Lcom/zykj/video/play/controller/TCControllerFullScreen;

    .line 92
    .line 93
    iget-object v1, p0, Lcom/zykj/video/play/SuperPlayerView;->L:Lk5/c;

    .line 94
    .line 95
    invoke-virtual {v0, v1}, Lcom/zykj/video/play/controller/TCControllerFullScreen;->setCallback(Lk5/c;)V

    .line 96
    .line 97
    .line 98
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView;->f:Lcom/zykj/video/play/controller/TCControllerWindow;

    .line 99
    .line 100
    iget-object v1, p0, Lcom/zykj/video/play/SuperPlayerView;->L:Lk5/c;

    .line 101
    .line 102
    invoke-virtual {v0, v1}, Lcom/zykj/video/play/controller/TCControllerWindow;->setCallback(Lk5/c;)V

    .line 103
    .line 104
    .line 105
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView;->g:Lcom/zykj/video/play/controller/TCControllerFloat;

    .line 106
    .line 107
    iget-object v1, p0, Lcom/zykj/video/play/SuperPlayerView;->L:Lk5/c;

    .line 108
    .line 109
    invoke-virtual {v0, v1}, Lcom/zykj/video/play/controller/TCControllerFloat;->setCallback(Lk5/c;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {p0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 113
    .line 114
    .line 115
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView;->c:Landroid/view/ViewGroup;

    .line 116
    .line 117
    iget-object v1, p0, Lcom/zykj/video/play/SuperPlayerView;->h:Lcom/zykj/video/play/view/TCDanmuView;

    .line 118
    .line 119
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 120
    .line 121
    .line 122
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView;->c:Landroid/view/ViewGroup;

    .line 123
    .line 124
    iget-object v1, p0, Lcom/zykj/video/play/SuperPlayerView;->d:Lcom/tencent/rtmp/ui/TXCloudVideoView;

    .line 125
    .line 126
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 127
    .line 128
    .line 129
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView;->c:Landroid/view/ViewGroup;

    .line 130
    .line 131
    iget-object v1, p0, Lcom/zykj/video/play/SuperPlayerView;->f:Lcom/zykj/video/play/controller/TCControllerWindow;

    .line 132
    .line 133
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 134
    .line 135
    .line 136
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView;->c:Landroid/view/ViewGroup;

    .line 137
    .line 138
    iget-object v1, p0, Lcom/zykj/video/play/SuperPlayerView;->e:Lcom/zykj/video/play/controller/TCControllerFullScreen;

    .line 139
    .line 140
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 141
    .line 142
    .line 143
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView;->c:Landroid/view/ViewGroup;

    .line 144
    .line 145
    iget-object v1, p0, Lcom/zykj/video/play/SuperPlayerView;->g:Lcom/zykj/video/play/controller/TCControllerFloat;

    .line 146
    .line 147
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 148
    .line 149
    .line 150
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView;->d:Lcom/tencent/rtmp/ui/TXCloudVideoView;

    .line 151
    .line 152
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 153
    .line 154
    .line 155
    iget v0, p0, Lcom/zykj/video/play/SuperPlayerView;->y:I

    .line 156
    .line 157
    const/4 v1, 0x2

    .line 158
    if-ne v0, v1, :cond_0

    .line 159
    .line 160
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView;->e:Lcom/zykj/video/play/controller/TCControllerFullScreen;

    .line 161
    .line 162
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 163
    .line 164
    .line 165
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView;->e:Lcom/zykj/video/play/controller/TCControllerFullScreen;

    .line 166
    .line 167
    invoke-virtual {v0}, Lcom/zykj/video/play/controller/TCControllerFullScreen;->hide()V

    .line 168
    .line 169
    .line 170
    goto :goto_0

    .line 171
    :cond_0
    const/4 v1, 0x1

    .line 172
    if-ne v0, v1, :cond_1

    .line 173
    .line 174
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView;->f:Lcom/zykj/video/play/controller/TCControllerWindow;

    .line 175
    .line 176
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 177
    .line 178
    .line 179
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView;->f:Lcom/zykj/video/play/controller/TCControllerWindow;

    .line 180
    .line 181
    invoke-virtual {v0}, Lcom/zykj/video/play/controller/TCControllerWindow;->hide()V

    .line 182
    .line 183
    .line 184
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView;->h:Lcom/zykj/video/play/view/TCDanmuView;

    .line 185
    .line 186
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 187
    .line 188
    .line 189
    new-instance v0, Lcom/zykj/video/play/SuperPlayerView$a;

    .line 190
    .line 191
    invoke-direct {v0, p0}, Lcom/zykj/video/play/SuperPlayerView$a;-><init>(Lcom/zykj/video/play/SuperPlayerView;)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {p0, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 195
    .line 196
    .line 197
    invoke-static {}, Ll5/b;->a()Ll5/b;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    invoke-virtual {v0, p1}, Ll5/b;->b(Landroid/content/Context;)V

    .line 202
    .line 203
    .line 204
    invoke-static {}, Ll5/b;->a()Ll5/b;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    invoke-virtual {v0, p1}, Ll5/b;->c(Landroid/content/Context;)V

    .line 209
    .line 210
    .line 211
    return-void
.end method

.method public final c0(Landroid/content/Context;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView;->q:Lcom/tencent/rtmp/TXVodPlayer;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    new-instance v0, Lcom/tencent/rtmp/TXVodPlayer;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Lcom/tencent/rtmp/TXVodPlayer;-><init>(Landroid/content/Context;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lcom/zykj/video/play/SuperPlayerView;->q:Lcom/tencent/rtmp/TXVodPlayer;

    .line 12
    .line 13
    invoke-static {}, Lcom/zykj/video/play/a;->a()Lcom/zykj/video/play/a;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    new-instance v1, Lcom/tencent/rtmp/TXVodPlayConfig;

    .line 18
    .line 19
    invoke-direct {v1}, Lcom/tencent/rtmp/TXVodPlayConfig;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object v1, p0, Lcom/zykj/video/play/SuperPlayerView;->r:Lcom/tencent/rtmp/TXVodPlayConfig;

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    invoke-virtual {p1, v1}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    if-eqz p1, :cond_1

    .line 30
    .line 31
    iget-object v1, p0, Lcom/zykj/video/play/SuperPlayerView;->r:Lcom/tencent/rtmp/TXVodPlayConfig;

    .line 32
    .line 33
    new-instance v2, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string p1, "/txcache"

    .line 46
    .line 47
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-virtual {v1, p1}, Lcom/tencent/rtmp/TXVodPlayConfig;->setCacheFolderPath(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    :cond_1
    iget-object p1, p0, Lcom/zykj/video/play/SuperPlayerView;->r:Lcom/tencent/rtmp/TXVodPlayConfig;

    .line 58
    .line 59
    iget v1, v0, Lcom/zykj/video/play/a;->e:I

    .line 60
    .line 61
    invoke-virtual {p1, v1}, Lcom/tencent/rtmp/TXVodPlayConfig;->setMaxCacheItems(I)V

    .line 62
    .line 63
    .line 64
    iget-object p1, p0, Lcom/zykj/video/play/SuperPlayerView;->q:Lcom/tencent/rtmp/TXVodPlayer;

    .line 65
    .line 66
    iget-object v1, p0, Lcom/zykj/video/play/SuperPlayerView;->r:Lcom/tencent/rtmp/TXVodPlayConfig;

    .line 67
    .line 68
    invoke-virtual {p1, v1}, Lcom/tencent/rtmp/TXVodPlayer;->setConfig(Lcom/tencent/rtmp/TXVodPlayConfig;)V

    .line 69
    .line 70
    .line 71
    iget-object p1, p0, Lcom/zykj/video/play/SuperPlayerView;->q:Lcom/tencent/rtmp/TXVodPlayer;

    .line 72
    .line 73
    iget v1, v0, Lcom/zykj/video/play/a;->d:I

    .line 74
    .line 75
    invoke-virtual {p1, v1}, Lcom/tencent/rtmp/TXVodPlayer;->setRenderMode(I)V

    .line 76
    .line 77
    .line 78
    iget-object p1, p0, Lcom/zykj/video/play/SuperPlayerView;->q:Lcom/tencent/rtmp/TXVodPlayer;

    .line 79
    .line 80
    invoke-virtual {p1, p0}, Lcom/tencent/rtmp/TXVodPlayer;->setVodListener(Lcom/tencent/rtmp/ITXVodPlayListener;)V

    .line 81
    .line 82
    .line 83
    iget-object p1, p0, Lcom/zykj/video/play/SuperPlayerView;->q:Lcom/tencent/rtmp/TXVodPlayer;

    .line 84
    .line 85
    iget-boolean v0, v0, Lcom/zykj/video/play/a;->c:Z

    .line 86
    .line 87
    invoke-virtual {p1, v0}, Lcom/tencent/rtmp/TXVodPlayer;->enableHardwareDecode(Z)Z

    .line 88
    .line 89
    .line 90
    return-void
.end method

.method public d0()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView;->h:Lcom/zykj/video/play/view/TCDanmuView;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lg9/b;->n()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView;->h:Lcom/zykj/video/play/view/TCDanmuView;

    .line 12
    .line 13
    invoke-virtual {v0}, Lg9/b;->q()V

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/video/play/SuperPlayerView;->f0()V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public e0()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView;->h:Lcom/zykj/video/play/view/TCDanmuView;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lg9/b;->n()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView;->h:Lcom/zykj/video/play/view/TCDanmuView;

    .line 12
    .line 13
    invoke-virtual {v0}, Lg9/b;->m()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView;->h:Lcom/zykj/video/play/view/TCDanmuView;

    .line 20
    .line 21
    invoke-virtual {v0}, Lg9/b;->w()V

    .line 22
    .line 23
    .line 24
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/video/play/SuperPlayerView;->q0()V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final f0()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/zykj/video/play/SuperPlayerView;->x:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView;->q:Lcom/tencent/rtmp/TXVodPlayer;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/tencent/rtmp/TXVodPlayer;->pause()V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public finalize()V
    .locals 2

    .line 1
    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    .line 2
    .line 3
    .line 4
    :try_start_0
    invoke-virtual {p0}, Lcom/zykj/video/play/SuperPlayerView;->m0()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    .line 7
    return-void

    .line 8
    :catchall_0
    move-exception v0

    .line 9
    const-string v1, "SuperPlayerView"

    .line 10
    .line 11
    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {v1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final g0(Ljava/lang/String;I)V
    .locals 3

    .line 1
    iput-object p1, p0, Lcom/zykj/video/play/SuperPlayerView;->w:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView;->s:Lcom/tencent/rtmp/TXLivePlayer;

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {v0, p0}, Lcom/tencent/rtmp/TXLivePlayer;->setPlayListener(Lcom/tencent/rtmp/ITXLivePlayListener;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView;->s:Lcom/tencent/rtmp/TXLivePlayer;

    .line 11
    .line 12
    invoke-virtual {v0, p1, p2}, Lcom/tencent/rtmp/TXLivePlayer;->startPlay(Ljava/lang/String;I)I

    .line 13
    .line 14
    .line 15
    move-result p2

    .line 16
    const-string v0, "SuperPlayerView"

    .line 17
    .line 18
    if-eqz p2, :cond_0

    .line 19
    .line 20
    new-instance v1, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 23
    .line 24
    .line 25
    const-string v2, "playLiveURL videoURL:"

    .line 26
    .line 27
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string p1, ",result:"

    .line 34
    .line 35
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-static {v0, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_0
    const/4 p1, 0x1

    .line 50
    iput p1, p0, Lcom/zykj/video/play/SuperPlayerView;->z:I

    .line 51
    .line 52
    sget-object p1, Lcom/zykj/video/play/SuperPlayerView$PLAYER_TYPE;->c:Lcom/zykj/video/play/SuperPlayerView$PLAYER_TYPE;

    .line 53
    .line 54
    iput-object p1, p0, Lcom/zykj/video/play/SuperPlayerView;->J:Lcom/zykj/video/play/SuperPlayerView$PLAYER_TYPE;

    .line 55
    .line 56
    new-instance p1, Ljava/lang/StringBuilder;

    .line 57
    .line 58
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 59
    .line 60
    .line 61
    const-string p2, "playLiveURL mCurrentPlayState:"

    .line 62
    .line 63
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    iget p2, p0, Lcom/zykj/video/play/SuperPlayerView;->z:I

    .line 67
    .line 68
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-static {v0, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    :cond_1
    return-void
.end method

.method public getPlayMode()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/video/play/SuperPlayerView;->y:I

    .line 2
    .line 3
    return v0
.end method

.method public getPlayState()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/video/play/SuperPlayerView;->z:I

    .line 2
    .line 3
    return v0
.end method

.method public final h0(Lcom/zykj/video/play/b;)V
    .locals 2

    .line 1
    iget-object v0, p1, Lcom/zykj/video/play/b;->c:Ljava/util/List;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    :goto_0
    iget-object v1, p1, Lcom/zykj/video/play/b;->c:Ljava/util/List;

    .line 13
    .line 14
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-ge v0, v1, :cond_2

    .line 19
    .line 20
    iget v1, p1, Lcom/zykj/video/play/b;->d:I

    .line 21
    .line 22
    if-ne v0, v1, :cond_0

    .line 23
    .line 24
    iget-object v1, p1, Lcom/zykj/video/play/b;->c:Ljava/util/List;

    .line 25
    .line 26
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, Lcom/zykj/video/play/b$a;

    .line 31
    .line 32
    iget-object v1, v1, Lcom/zykj/video/play/b$a;->b:Ljava/lang/String;

    .line 33
    .line 34
    invoke-virtual {p0, v1}, Lcom/zykj/video/play/SuperPlayerView;->k0(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    iget-object v0, p1, Lcom/zykj/video/play/b;->b:Ljava/lang/String;

    .line 41
    .line 42
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-nez v0, :cond_2

    .line 47
    .line 48
    iget-object p1, p1, Lcom/zykj/video/play/b;->b:Ljava/lang/String;

    .line 49
    .line 50
    invoke-virtual {p0, p1}, Lcom/zykj/video/play/SuperPlayerView;->k0(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    :cond_2
    return-void
.end method

.method public final i0(Lm5/b;)V
    .locals 2

    .line 1
    invoke-interface {p1}, Lm5/b;->getUrl()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0, v0}, Lcom/zykj/video/play/SuperPlayerView;->k0(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {p1}, Lm5/b;->f()Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object v1, p0, Lcom/zykj/video/play/SuperPlayerView;->e:Lcom/zykj/video/play/controller/TCControllerFullScreen;

    .line 15
    .line 16
    invoke-virtual {v1, v0}, Lcom/zykj/video/play/controller/TCControllerFullScreen;->setVideoQualityList(Ljava/util/List;)V

    .line 17
    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    iput-boolean v0, p0, Lcom/zykj/video/play/SuperPlayerView;->E:Z

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v0, 0x1

    .line 24
    iput-boolean v0, p0, Lcom/zykj/video/play/SuperPlayerView;->E:Z

    .line 25
    .line 26
    :goto_0
    invoke-interface {p1}, Lm5/b;->c()Lj5/g;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    if-eqz p1, :cond_1

    .line 31
    .line 32
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView;->e:Lcom/zykj/video/play/controller/TCControllerFullScreen;

    .line 33
    .line 34
    invoke-virtual {v0, p1}, Lcom/zykj/video/play/controller/TCControllerFullScreen;->U(Lj5/g;)V

    .line 35
    .line 36
    .line 37
    :cond_1
    return-void
.end method

.method public final j0(Lcom/zykj/video/play/b;)V
    .locals 7

    .line 1
    iget-object v0, p1, Lcom/zykj/video/play/b;->b:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "//"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    add-int/lit8 v1, v1, 0x2

    .line 10
    .line 11
    const-string v2, "."

    .line 12
    .line 13
    invoke-virtual {v0, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    invoke-virtual {v0, v1, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-static {}, Lcom/zykj/video/play/a;->a()Lcom/zykj/video/play/a;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    iget-object v3, v3, Lcom/zykj/video/play/a;->f:Ljava/lang/String;

    .line 26
    .line 27
    const-string v4, "/"

    .line 28
    .line 29
    invoke-virtual {v0, v4}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    const/4 v5, 0x1

    .line 34
    add-int/2addr v4, v5

    .line 35
    invoke-virtual {v0, v2}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    invoke-virtual {v0, v4, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    iget p1, p1, Lcom/zykj/video/play/b;->a:I

    .line 44
    .line 45
    new-instance v4, Ljava/lang/StringBuilder;

    .line 46
    .line 47
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 48
    .line 49
    .line 50
    const-string v6, "bizid:"

    .line 51
    .line 52
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    const-string v6, ",streamid:"

    .line 59
    .line 60
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    const-string v2, ",appid:"

    .line 67
    .line 68
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    const-string v2, "SuperPlayerView"

    .line 79
    .line 80
    invoke-static {v2, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0, v0, v5}, Lcom/zykj/video/play/SuperPlayerView;->g0(Ljava/lang/String;I)V

    .line 84
    .line 85
    .line 86
    :try_start_0
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 91
    .line 92
    .line 93
    move-result p1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 94
    goto :goto_0

    .line 95
    :catch_0
    move-exception p1

    .line 96
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 97
    .line 98
    .line 99
    new-instance p1, Ljava/lang/StringBuilder;

    .line 100
    .line 101
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 102
    .line 103
    .line 104
    const-string v0, "playTimeShiftLiveURL: bizidNum \u9519\u8bef = "

    .line 105
    .line 106
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    invoke-static {v2, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    const/4 p1, -0x1

    .line 120
    :goto_0
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView;->s:Lcom/tencent/rtmp/TXLivePlayer;

    .line 121
    .line 122
    invoke-virtual {v0, v3, p1}, Lcom/tencent/rtmp/TXLivePlayer;->prepareLiveSeek(Ljava/lang/String;I)I

    .line 123
    .line 124
    .line 125
    return-void
.end method

.method public final k0(Ljava/lang/String;)V
    .locals 5

    .line 1
    if-eqz p1, :cond_5

    .line 2
    .line 3
    const-string v0, ""

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto/16 :goto_1

    .line 12
    .line 13
    :cond_0
    iput-object p1, p0, Lcom/zykj/video/play/SuperPlayerView;->w:Ljava/lang/String;

    .line 14
    .line 15
    const-string v0, ".m3u8"

    .line 16
    .line 17
    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    const/4 v1, 0x1

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    iput-boolean v1, p0, Lcom/zykj/video/play/SuperPlayerView;->E:Z

    .line 25
    .line 26
    :cond_1
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView;->q:Lcom/tencent/rtmp/TXVodPlayer;

    .line 27
    .line 28
    const/4 v2, 0x0

    .line 29
    if-eqz v0, :cond_4

    .line 30
    .line 31
    iput-boolean v2, p0, Lcom/zykj/video/play/SuperPlayerView;->G:Z

    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    invoke-virtual {v0, v3}, Lcom/tencent/rtmp/TXVodPlayer;->setStartTime(F)V

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView;->q:Lcom/tencent/rtmp/TXVodPlayer;

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Lcom/tencent/rtmp/TXVodPlayer;->setAutoPlay(Z)V

    .line 40
    .line 41
    .line 42
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView;->q:Lcom/tencent/rtmp/TXVodPlayer;

    .line 43
    .line 44
    invoke-virtual {v0, p0}, Lcom/tencent/rtmp/TXVodPlayer;->setVodListener(Lcom/tencent/rtmp/ITXVodPlayListener;)V

    .line 45
    .line 46
    .line 47
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView;->p:Lm5/b;

    .line 48
    .line 49
    const-string v3, "SuperPlayerView"

    .line 50
    .line 51
    if-eqz v0, :cond_2

    .line 52
    .line 53
    invoke-interface {v0}, Lm5/b;->a()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    if-eqz v0, :cond_2

    .line 58
    .line 59
    new-instance v0, Ljava/lang/StringBuilder;

    .line 60
    .line 61
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 62
    .line 63
    .line 64
    const-string v4, "TOKEN: "

    .line 65
    .line 66
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    iget-object v4, p0, Lcom/zykj/video/play/SuperPlayerView;->p:Lm5/b;

    .line 70
    .line 71
    invoke-interface {v4}, Lm5/b;->a()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-static {v3, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView;->q:Lcom/tencent/rtmp/TXVodPlayer;

    .line 86
    .line 87
    iget-object v4, p0, Lcom/zykj/video/play/SuperPlayerView;->p:Lm5/b;

    .line 88
    .line 89
    invoke-interface {v4}, Lm5/b;->a()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v4

    .line 93
    invoke-virtual {v0, v4}, Lcom/tencent/rtmp/TXVodPlayer;->setToken(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_2
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView;->q:Lcom/tencent/rtmp/TXVodPlayer;

    .line 98
    .line 99
    const/4 v4, 0x0

    .line 100
    invoke-virtual {v0, v4}, Lcom/tencent/rtmp/TXVodPlayer;->setToken(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    :goto_0
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView;->q:Lcom/tencent/rtmp/TXVodPlayer;

    .line 104
    .line 105
    invoke-virtual {v0, p1}, Lcom/tencent/rtmp/TXVodPlayer;->startPlay(Ljava/lang/String;)I

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    if-nez p1, :cond_4

    .line 110
    .line 111
    iput v1, p0, Lcom/zykj/video/play/SuperPlayerView;->z:I

    .line 112
    .line 113
    sget-object p1, Lcom/zykj/video/play/SuperPlayerView$PLAYER_TYPE;->b:Lcom/zykj/video/play/SuperPlayerView$PLAYER_TYPE;

    .line 114
    .line 115
    iput-object p1, p0, Lcom/zykj/video/play/SuperPlayerView;->J:Lcom/zykj/video/play/SuperPlayerView$PLAYER_TYPE;

    .line 116
    .line 117
    iget-object p1, p0, Lcom/zykj/video/play/SuperPlayerView;->h:Lcom/zykj/video/play/view/TCDanmuView;

    .line 118
    .line 119
    if-eqz p1, :cond_3

    .line 120
    .line 121
    invoke-virtual {p1}, Lg9/b;->n()Z

    .line 122
    .line 123
    .line 124
    move-result p1

    .line 125
    if-eqz p1, :cond_3

    .line 126
    .line 127
    iget-object p1, p0, Lcom/zykj/video/play/SuperPlayerView;->h:Lcom/zykj/video/play/view/TCDanmuView;

    .line 128
    .line 129
    invoke-virtual {p1}, Lg9/b;->m()Z

    .line 130
    .line 131
    .line 132
    move-result p1

    .line 133
    if-eqz p1, :cond_3

    .line 134
    .line 135
    iget-object p1, p0, Lcom/zykj/video/play/SuperPlayerView;->h:Lcom/zykj/video/play/view/TCDanmuView;

    .line 136
    .line 137
    invoke-virtual {p1}, Lg9/b;->w()V

    .line 138
    .line 139
    .line 140
    :cond_3
    new-instance p1, Ljava/lang/StringBuilder;

    .line 141
    .line 142
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 143
    .line 144
    .line 145
    const-string v0, "playVodURL mCurrentPlayState:"

    .line 146
    .line 147
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    iget v0, p0, Lcom/zykj/video/play/SuperPlayerView;->z:I

    .line 151
    .line 152
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    invoke-static {v3, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    :cond_4
    iput-boolean v2, p0, Lcom/zykj/video/play/SuperPlayerView;->F:Z

    .line 163
    .line 164
    :cond_5
    :goto_1
    return-void
.end method

.method public l0(Lcom/zykj/video/play/b;)V
    .locals 10

    .line 1
    iput-object p1, p0, Lcom/zykj/video/play/SuperPlayerView;->o:Lcom/zykj/video/play/b;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/zykj/video/play/SuperPlayerView;->u0()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {p0, v0}, Lcom/zykj/video/play/SuperPlayerView;->a0(Landroid/content/Context;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {p0, v0}, Lcom/zykj/video/play/SuperPlayerView;->c0(Landroid/content/Context;)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView;->e:Lcom/zykj/video/play/controller/TCControllerFullScreen;

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    invoke-virtual {v0, v1}, Lcom/zykj/video/play/controller/TCControllerFullScreen;->O(Lj5/b;)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView;->e:Lcom/zykj/video/play/controller/TCControllerFullScreen;

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Lcom/zykj/video/play/controller/TCControllerFullScreen;->P(Ljava/util/List;)V

    .line 29
    .line 30
    .line 31
    new-instance v0, Lm5/d;

    .line 32
    .line 33
    invoke-direct {v0}, Lm5/d;-><init>()V

    .line 34
    .line 35
    .line 36
    iget v2, p1, Lcom/zykj/video/play/b;->a:I

    .line 37
    .line 38
    iput v2, v0, Lm5/d;->a:I

    .line 39
    .line 40
    iget-object v2, p1, Lcom/zykj/video/play/b;->e:Li5/a;

    .line 41
    .line 42
    if-eqz v2, :cond_0

    .line 43
    .line 44
    iget-object v3, v2, Li5/a;->a:Ljava/lang/String;

    .line 45
    .line 46
    iput-object v3, v0, Lm5/d;->b:Ljava/lang/String;

    .line 47
    .line 48
    iput-object v2, v0, Lm5/d;->c:Li5/a;

    .line 49
    .line 50
    new-instance v2, Lm5/g;

    .line 51
    .line 52
    invoke-direct {v2, v0}, Lm5/g;-><init>(Lm5/d;)V

    .line 53
    .line 54
    .line 55
    iput-object v2, p0, Lcom/zykj/video/play/SuperPlayerView;->p:Lm5/b;

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_0
    iput-object v1, p0, Lcom/zykj/video/play/SuperPlayerView;->p:Lm5/b;

    .line 59
    .line 60
    :goto_0
    iget-object v0, p1, Lcom/zykj/video/play/b;->e:Li5/a;

    .line 61
    .line 62
    if-nez v0, :cond_b

    .line 63
    .line 64
    new-instance v0, Ljava/util/ArrayList;

    .line 65
    .line 66
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 67
    .line 68
    .line 69
    iget-object v2, p1, Lcom/zykj/video/play/b;->c:Ljava/util/List;

    .line 70
    .line 71
    const/4 v3, 0x0

    .line 72
    if-eqz v2, :cond_3

    .line 73
    .line 74
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    if-nez v2, :cond_3

    .line 79
    .line 80
    iget-object v2, p1, Lcom/zykj/video/play/b;->c:Ljava/util/List;

    .line 81
    .line 82
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    move v4, v3

    .line 87
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 88
    .line 89
    .line 90
    move-result v5

    .line 91
    if-eqz v5, :cond_2

    .line 92
    .line 93
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v5

    .line 97
    check-cast v5, Lcom/zykj/video/play/b$a;

    .line 98
    .line 99
    iget v6, p1, Lcom/zykj/video/play/b;->d:I

    .line 100
    .line 101
    if-ne v4, v6, :cond_1

    .line 102
    .line 103
    iget-object v1, v5, Lcom/zykj/video/play/b$a;->b:Ljava/lang/String;

    .line 104
    .line 105
    :cond_1
    new-instance v6, Lj5/g;

    .line 106
    .line 107
    add-int/lit8 v7, v4, 0x1

    .line 108
    .line 109
    iget-object v8, v5, Lcom/zykj/video/play/b$a;->a:Ljava/lang/String;

    .line 110
    .line 111
    iget-object v5, v5, Lcom/zykj/video/play/b$a;->b:Ljava/lang/String;

    .line 112
    .line 113
    invoke-direct {v6, v4, v8, v5}, Lj5/g;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    invoke-interface {v0, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move v4, v7

    .line 120
    goto :goto_1

    .line 121
    :cond_2
    iget v2, p1, Lcom/zykj/video/play/b;->d:I

    .line 122
    .line 123
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    check-cast v2, Lj5/g;

    .line 128
    .line 129
    goto :goto_2

    .line 130
    :cond_3
    iget-object v2, p1, Lcom/zykj/video/play/b;->b:Ljava/lang/String;

    .line 131
    .line 132
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 133
    .line 134
    .line 135
    move-result v2

    .line 136
    if-nez v2, :cond_4

    .line 137
    .line 138
    iget-object v2, p1, Lcom/zykj/video/play/b;->b:Ljava/lang/String;

    .line 139
    .line 140
    move-object v9, v2

    .line 141
    move-object v2, v1

    .line 142
    move-object v1, v9

    .line 143
    goto :goto_2

    .line 144
    :cond_4
    move-object v2, v1

    .line 145
    :goto_2
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 146
    .line 147
    .line 148
    move-result v4

    .line 149
    if-eqz v4, :cond_5

    .line 150
    .line 151
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    const-string v0, "\u64ad\u653e\u89c6\u9891\u5931\u8d25\uff0c\u64ad\u653e\u8fde\u63a5\u4e3a\u7a7a"

    .line 156
    .line 157
    invoke-static {p1, v0, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 162
    .line 163
    .line 164
    return-void

    .line 165
    :cond_5
    invoke-static {v1}, Ln5/e;->b(Ljava/lang/String;)Z

    .line 166
    .line 167
    .line 168
    move-result v4

    .line 169
    if-eqz v4, :cond_6

    .line 170
    .line 171
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 172
    .line 173
    .line 174
    move-result-wide v4

    .line 175
    iput-wide v4, p0, Lcom/zykj/video/play/SuperPlayerView;->B:J

    .line 176
    .line 177
    iget-object v4, p0, Lcom/zykj/video/play/SuperPlayerView;->s:Lcom/tencent/rtmp/TXLivePlayer;

    .line 178
    .line 179
    iget-object v5, p0, Lcom/zykj/video/play/SuperPlayerView;->d:Lcom/tencent/rtmp/ui/TXCloudVideoView;

    .line 180
    .line 181
    invoke-virtual {v4, v5}, Lcom/tencent/rtmp/TXLivePlayer;->setPlayerView(Lcom/tencent/rtmp/ui/TXCloudVideoView;)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {p0, v1, v3}, Lcom/zykj/video/play/SuperPlayerView;->g0(Ljava/lang/String;I)V

    .line 185
    .line 186
    .line 187
    goto :goto_3

    .line 188
    :cond_6
    invoke-static {v1}, Ln5/e;->a(Ljava/lang/String;)Z

    .line 189
    .line 190
    .line 191
    move-result v3

    .line 192
    if-eqz v3, :cond_7

    .line 193
    .line 194
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 195
    .line 196
    .line 197
    move-result-wide v3

    .line 198
    iput-wide v3, p0, Lcom/zykj/video/play/SuperPlayerView;->B:J

    .line 199
    .line 200
    iget-object v3, p0, Lcom/zykj/video/play/SuperPlayerView;->s:Lcom/tencent/rtmp/TXLivePlayer;

    .line 201
    .line 202
    iget-object v4, p0, Lcom/zykj/video/play/SuperPlayerView;->d:Lcom/tencent/rtmp/ui/TXCloudVideoView;

    .line 203
    .line 204
    invoke-virtual {v3, v4}, Lcom/tencent/rtmp/TXLivePlayer;->setPlayerView(Lcom/tencent/rtmp/ui/TXCloudVideoView;)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {p0, p1}, Lcom/zykj/video/play/SuperPlayerView;->j0(Lcom/zykj/video/play/b;)V

    .line 208
    .line 209
    .line 210
    iget-object v3, p1, Lcom/zykj/video/play/b;->c:Ljava/util/List;

    .line 211
    .line 212
    if-eqz v3, :cond_8

    .line 213
    .line 214
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 215
    .line 216
    .line 217
    move-result v3

    .line 218
    if-nez v3, :cond_8

    .line 219
    .line 220
    invoke-virtual {p0, v1}, Lcom/zykj/video/play/SuperPlayerView;->t0(Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    goto :goto_3

    .line 224
    :cond_7
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 225
    .line 226
    .line 227
    move-result-wide v3

    .line 228
    iput-wide v3, p0, Lcom/zykj/video/play/SuperPlayerView;->C:J

    .line 229
    .line 230
    iget-object v3, p0, Lcom/zykj/video/play/SuperPlayerView;->q:Lcom/tencent/rtmp/TXVodPlayer;

    .line 231
    .line 232
    iget-object v4, p0, Lcom/zykj/video/play/SuperPlayerView;->d:Lcom/tencent/rtmp/ui/TXCloudVideoView;

    .line 233
    .line 234
    invoke-virtual {v3, v4}, Lcom/tencent/rtmp/TXVodPlayer;->setPlayerView(Lcom/tencent/rtmp/ui/TXCloudVideoView;)V

    .line 235
    .line 236
    .line 237
    invoke-virtual {p0, v1}, Lcom/zykj/video/play/SuperPlayerView;->k0(Ljava/lang/String;)V

    .line 238
    .line 239
    .line 240
    :cond_8
    :goto_3
    invoke-static {v1}, Ln5/e;->b(Ljava/lang/String;)Z

    .line 241
    .line 242
    .line 243
    move-result v3

    .line 244
    if-nez v3, :cond_a

    .line 245
    .line 246
    invoke-static {v1}, Ln5/e;->a(Ljava/lang/String;)Z

    .line 247
    .line 248
    .line 249
    move-result v1

    .line 250
    if-eqz v1, :cond_9

    .line 251
    .line 252
    goto :goto_4

    .line 253
    :cond_9
    const/4 v1, 0x1

    .line 254
    goto :goto_5

    .line 255
    :cond_a
    :goto_4
    const/4 v1, 0x2

    .line 256
    :goto_5
    invoke-virtual {p0, v1}, Lcom/zykj/video/play/SuperPlayerView;->w0(I)V

    .line 257
    .line 258
    .line 259
    iget-object p1, p1, Lcom/zykj/video/play/b;->f:Ljava/lang/String;

    .line 260
    .line 261
    invoke-virtual {p0, p1}, Lcom/zykj/video/play/SuperPlayerView;->x0(Ljava/lang/String;)V

    .line 262
    .line 263
    .line 264
    const-wide/16 v3, 0x0

    .line 265
    .line 266
    invoke-virtual {p0, v3, v4, v3, v4}, Lcom/zykj/video/play/SuperPlayerView;->y0(JJ)V

    .line 267
    .line 268
    .line 269
    iget-object p1, p0, Lcom/zykj/video/play/SuperPlayerView;->e:Lcom/zykj/video/play/controller/TCControllerFullScreen;

    .line 270
    .line 271
    invoke-virtual {p1, v0}, Lcom/zykj/video/play/controller/TCControllerFullScreen;->setVideoQualityList(Ljava/util/List;)V

    .line 272
    .line 273
    .line 274
    iget-object p1, p0, Lcom/zykj/video/play/SuperPlayerView;->e:Lcom/zykj/video/play/controller/TCControllerFullScreen;

    .line 275
    .line 276
    invoke-virtual {p1, v2}, Lcom/zykj/video/play/controller/TCControllerFullScreen;->U(Lj5/g;)V

    .line 277
    .line 278
    .line 279
    return-void

    .line 280
    :cond_b
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView;->p:Lm5/b;

    .line 281
    .line 282
    new-instance v1, Lcom/zykj/video/play/SuperPlayerView$b;

    .line 283
    .line 284
    invoke-direct {v1, p0, p1}, Lcom/zykj/video/play/SuperPlayerView$b;-><init>(Lcom/zykj/video/play/SuperPlayerView;Lcom/zykj/video/play/b;)V

    .line 285
    .line 286
    .line 287
    invoke-interface {v0, v1}, Lm5/b;->g(Lm5/c;)V

    .line 288
    .line 289
    .line 290
    return-void
.end method

.method public m0()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView;->f:Lcom/zykj/video/play/controller/TCControllerWindow;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/video/play/controller/TCControllerWindow;->v()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView;->e:Lcom/zykj/video/play/controller/TCControllerFullScreen;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/zykj/video/play/controller/TCControllerFullScreen;->C()V

    .line 13
    .line 14
    .line 15
    :cond_1
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView;->g:Lcom/zykj/video/play/controller/TCControllerFloat;

    .line 16
    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    invoke-virtual {v0}, Lcom/zykj/video/play/controller/TCControllerFloat;->b()V

    .line 20
    .line 21
    .line 22
    :cond_2
    return-void
.end method

.method public final n0()V
    .locals 9

    .line 1
    iget-wide v0, p0, Lcom/zykj/video/play/SuperPlayerView;->B:J

    .line 2
    .line 3
    const-wide/16 v2, -0x1

    .line 4
    .line 5
    cmp-long v0, v0, v2

    .line 6
    .line 7
    const-wide/16 v4, 0x3e8

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    iget-wide v6, p0, Lcom/zykj/video/play/SuperPlayerView;->B:J

    .line 16
    .line 17
    sub-long/2addr v0, v6

    .line 18
    div-long/2addr v0, v4

    .line 19
    invoke-static {}, Ll5/b;->a()Ll5/b;

    .line 20
    .line 21
    .line 22
    move-result-object v6

    .line 23
    const-string v7, "superlive"

    .line 24
    .line 25
    const/4 v8, 0x0

    .line 26
    invoke-virtual {v6, v7, v0, v1, v8}, Ll5/b;->d(Ljava/lang/String;JI)V

    .line 27
    .line 28
    .line 29
    iput-wide v2, p0, Lcom/zykj/video/play/SuperPlayerView;->B:J

    .line 30
    .line 31
    :cond_0
    iget-wide v0, p0, Lcom/zykj/video/play/SuperPlayerView;->C:J

    .line 32
    .line 33
    cmp-long v0, v0, v2

    .line 34
    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 38
    .line 39
    .line 40
    move-result-wide v0

    .line 41
    iget-wide v6, p0, Lcom/zykj/video/play/SuperPlayerView;->C:J

    .line 42
    .line 43
    sub-long/2addr v0, v6

    .line 44
    div-long/2addr v0, v4

    .line 45
    invoke-static {}, Ll5/b;->a()Ll5/b;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    const-string v5, "supervod"

    .line 50
    .line 51
    iget-boolean v6, p0, Lcom/zykj/video/play/SuperPlayerView;->F:Z

    .line 52
    .line 53
    invoke-virtual {v4, v5, v0, v1, v6}, Ll5/b;->d(Ljava/lang/String;JI)V

    .line 54
    .line 55
    .line 56
    iput-wide v2, p0, Lcom/zykj/video/play/SuperPlayerView;->C:J

    .line 57
    .line 58
    :cond_1
    return-void
.end method

.method public o0(I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p1, v0, :cond_0

    .line 3
    .line 4
    iget-object p1, p0, Lcom/zykj/video/play/SuperPlayerView;->L:Lk5/c;

    .line 5
    .line 6
    if-eqz p1, :cond_2

    .line 7
    .line 8
    invoke-interface {p1, v0}, Lk5/c;->j(I)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    const/4 v0, 0x3

    .line 13
    if-ne p1, v0, :cond_2

    .line 14
    .line 15
    iget-object p1, p0, Lcom/zykj/video/play/SuperPlayerView;->u:Lcom/zykj/video/play/SuperPlayerView$f;

    .line 16
    .line 17
    if-eqz p1, :cond_1

    .line 18
    .line 19
    invoke-interface {p1}, Lcom/zykj/video/play/SuperPlayerView$f;->c()V

    .line 20
    .line 21
    .line 22
    :cond_1
    iget-object p1, p0, Lcom/zykj/video/play/SuperPlayerView;->L:Lk5/c;

    .line 23
    .line 24
    if-eqz p1, :cond_2

    .line 25
    .line 26
    invoke-interface {p1, v0}, Lk5/c;->j(I)V

    .line 27
    .line 28
    .line 29
    :cond_2
    return-void
.end method

.method public onNetStatus(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    return-void
.end method

.method public onNetStatus(Lcom/tencent/rtmp/TXVodPlayer;Landroid/os/Bundle;)V
    .locals 0

    .line 2
    return-void
.end method

.method public onPlayEvent(ILandroid/os/Bundle;)V
    .locals 6

    const/16 v0, 0x7d5

    .line 34
    const-string v1, "EVT_MSG"

    if-eq p1, v0, :cond_0

    .line 35
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "TXLivePlayer onPlayEvent event: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 36
    const-string v2, "SuperPlayerView"

    invoke-static {v2, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    const/16 v0, -0x903

    const/4 v2, 0x0

    if-eq p1, v0, :cond_8

    const/4 v0, 0x3

    const/16 v3, -0x8fd

    const/4 v4, 0x1

    if-eq p1, v3, :cond_5

    const/16 v5, 0x7dd

    if-eq p1, v5, :cond_4

    const/16 v5, 0x7df

    if-eq p1, v5, :cond_3

    packed-switch p1, :pswitch_data_0

    goto :goto_1

    .line 37
    :pswitch_0
    invoke-virtual {p0, v0}, Lcom/zykj/video/play/SuperPlayerView;->v0(I)V

    .line 38
    iget-object p1, p0, Lcom/zykj/video/play/SuperPlayerView;->v:Ln5/c;

    if-eqz p1, :cond_2

    .line 39
    invoke-virtual {p1}, Ln5/c;->h()V

    return-void

    .line 40
    :pswitch_1
    const-string p1, "EVT_PLAY_PROGRESS_MS"

    invoke-virtual {p2, p1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result p1

    int-to-long v0, p1

    .line 41
    iget-wide v2, p0, Lcom/zykj/video/play/SuperPlayerView;->D:J

    cmp-long p2, v0, v2

    if-lez p2, :cond_1

    goto :goto_0

    :cond_1
    move-wide v0, v2

    :goto_0
    iput-wide v0, p0, Lcom/zykj/video/play/SuperPlayerView;->D:J

    .line 42
    div-int/lit16 p1, p1, 0x3e8

    int-to-long p1, p1

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    invoke-virtual {p0, p1, p2, v0, v1}, Lcom/zykj/video/play/SuperPlayerView;->y0(JJ)V

    return-void

    .line 43
    :pswitch_2
    invoke-virtual {p0, v4}, Lcom/zykj/video/play/SuperPlayerView;->v0(I)V

    .line 44
    iget-object p1, p0, Lcom/zykj/video/play/SuperPlayerView;->v:Ln5/c;

    if-eqz p1, :cond_2

    .line 45
    invoke-virtual {p1}, Ln5/c;->i()V

    :cond_2
    :goto_1
    return-void

    .line 46
    :cond_3
    iget-object p1, p0, Lcom/zykj/video/play/SuperPlayerView;->b:Landroid/content/Context;

    const-string p2, "\u6e05\u6670\u5ea6\u5207\u6362\u6210\u529f"

    invoke-static {p1, p2, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    return-void

    .line 47
    :cond_4
    invoke-virtual {p0, v4}, Lcom/zykj/video/play/SuperPlayerView;->v0(I)V

    return-void

    .line 48
    :cond_5
    :pswitch_3
    iget v5, p0, Lcom/zykj/video/play/SuperPlayerView;->x:I

    if-ne v5, v0, :cond_6

    .line 49
    iget-object p1, p0, Lcom/zykj/video/play/SuperPlayerView;->L:Lk5/c;

    invoke-interface {p1}, Lk5/c;->e()V

    .line 50
    iget-object p1, p0, Lcom/zykj/video/play/SuperPlayerView;->b:Landroid/content/Context;

    const-string p2, "\u65f6\u79fb\u5931\u8d25,\u8fd4\u56de\u76f4\u64ad"

    invoke-static {p1, p2, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 51
    invoke-virtual {p0, v4}, Lcom/zykj/video/play/SuperPlayerView;->v0(I)V

    return-void

    .line 52
    :cond_6
    invoke-virtual {p0}, Lcom/zykj/video/play/SuperPlayerView;->u0()V

    const/4 v0, 0x4

    .line 53
    invoke-virtual {p0, v0}, Lcom/zykj/video/play/SuperPlayerView;->v0(I)V

    if-ne p1, v3, :cond_7

    .line 54
    iget-object p1, p0, Lcom/zykj/video/play/SuperPlayerView;->b:Landroid/content/Context;

    const-string p2, "\u7f51\u7edc\u4e0d\u7ed9\u529b,\u70b9\u51fb\u91cd\u8bd5"

    invoke-static {p1, p2, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    return-void

    .line 55
    :cond_7
    iget-object p1, p0, Lcom/zykj/video/play/SuperPlayerView;->b:Landroid/content/Context;

    invoke-virtual {p2, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    return-void

    .line 56
    :cond_8
    iget-object p1, p0, Lcom/zykj/video/play/SuperPlayerView;->b:Landroid/content/Context;

    const-string p2, "\u6e05\u6670\u5ea6\u5207\u6362\u5931\u8d25"

    invoke-static {p1, p2, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x7d4
        :pswitch_2
        :pswitch_1
        :pswitch_3
        :pswitch_0
    .end packed-switch
.end method

.method public onPlayEvent(Lcom/tencent/rtmp/TXVodPlayer;ILandroid/os/Bundle;)V
    .locals 9

    const/16 p1, 0x7d5

    .line 1
    const-string v0, "SuperPlayerView"

    const-string v1, "EVT_MSG"

    if-eq p2, p1, :cond_0

    .line 2
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "TXVodPlayer onPlayEvent event: "

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", "

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 3
    invoke-static {v0, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    const/16 p1, 0x7dd

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq p2, p1, :cond_1

    packed-switch p2, :pswitch_data_0

    goto/16 :goto_3

    :pswitch_0
    const/4 p1, 0x4

    .line 4
    invoke-virtual {p0, p1}, Lcom/zykj/video/play/SuperPlayerView;->v0(I)V

    goto/16 :goto_3

    .line 5
    :pswitch_1
    const-string p1, "EVT_PLAY_PROGRESS_MS"

    invoke-virtual {p3, p1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result p1

    .line 6
    const-string v0, "EVT_PLAY_DURATION_MS"

    invoke-virtual {p3, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v0

    .line 7
    div-int/lit16 p1, p1, 0x3e8

    int-to-long v4, p1

    div-int/lit16 v0, v0, 0x3e8

    int-to-long v6, v0

    invoke-virtual {p0, v4, v5, v6, v7}, Lcom/zykj/video/play/SuperPlayerView;->y0(JJ)V

    goto/16 :goto_3

    .line 8
    :pswitch_2
    invoke-virtual {p0, v3}, Lcom/zykj/video/play/SuperPlayerView;->v0(I)V

    goto/16 :goto_3

    .line 9
    :pswitch_3
    iget-boolean p1, p0, Lcom/zykj/video/play/SuperPlayerView;->H:Z

    if-eqz p1, :cond_7

    .line 10
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "seek pos:"

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v4, p0, Lcom/zykj/video/play/SuperPlayerView;->A:I

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    iget-object p1, p0, Lcom/zykj/video/play/SuperPlayerView;->L:Lk5/c;

    iget v0, p0, Lcom/zykj/video/play/SuperPlayerView;->A:I

    invoke-interface {p1, v0}, Lk5/c;->k(I)V

    .line 12
    iput-boolean v2, p0, Lcom/zykj/video/play/SuperPlayerView;->H:Z

    goto/16 :goto_3

    .line 13
    :cond_1
    iget-object p1, p0, Lcom/zykj/video/play/SuperPlayerView;->f:Lcom/zykj/video/play/controller/TCControllerWindow;

    invoke-virtual {p1}, Lcom/zykj/video/play/controller/TCControllerWindow;->s()V

    .line 14
    invoke-virtual {p0, v3}, Lcom/zykj/video/play/SuperPlayerView;->v0(I)V

    .line 15
    iget-boolean p1, p0, Lcom/zykj/video/play/SuperPlayerView;->E:Z

    if-eqz p1, :cond_7

    .line 16
    iget-object p1, p0, Lcom/zykj/video/play/SuperPlayerView;->q:Lcom/tencent/rtmp/TXVodPlayer;

    invoke-virtual {p1}, Lcom/tencent/rtmp/TXVodPlayer;->getSupportedBitrates()Ljava/util/ArrayList;

    move-result-object p1

    if-eqz p1, :cond_8

    .line 17
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_2

    goto/16 :goto_4

    .line 18
    :cond_2
    invoke-static {p1}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 19
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 20
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v4

    .line 21
    iget-object v5, p0, Lcom/zykj/video/play/SuperPlayerView;->p:Lm5/b;

    if-eqz v5, :cond_3

    invoke-interface {v5}, Lm5/b;->e()Ljava/util/List;

    move-result-object v5

    goto :goto_0

    :cond_3
    const/4 v5, 0x0

    :goto_0
    move v6, v2

    :goto_1
    if-ge v6, v4, :cond_5

    .line 22
    invoke-interface {p1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/tencent/rtmp/TXBitrateItem;

    if-eqz v5, :cond_4

    .line 23
    iget-object v8, p0, Lcom/zykj/video/play/SuperPlayerView;->p:Lm5/b;

    invoke-interface {v8}, Lm5/b;->e()Ljava/util/List;

    move-result-object v8

    invoke-static {v7, v8}, Ln5/g;->b(Lcom/tencent/rtmp/TXBitrateItem;Ljava/util/List;)Lj5/g;

    move-result-object v7

    goto :goto_2

    .line 24
    :cond_4
    invoke-static {v7, v6}, Ln5/g;->a(Lcom/tencent/rtmp/TXBitrateItem;I)Lj5/g;

    move-result-object v7

    .line 25
    :goto_2
    invoke-interface {v0, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 26
    :cond_5
    iget-boolean v4, p0, Lcom/zykj/video/play/SuperPlayerView;->G:Z

    if-nez v4, :cond_6

    .line 27
    iget-object v4, p0, Lcom/zykj/video/play/SuperPlayerView;->q:Lcom/tencent/rtmp/TXVodPlayer;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v5

    sub-int/2addr v5, v3

    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/tencent/rtmp/TXBitrateItem;

    iget p1, p1, Lcom/tencent/rtmp/TXBitrateItem;->index:I

    invoke-virtual {v4, p1}, Lcom/tencent/rtmp/TXVodPlayer;->setBitrateIndex(I)V

    .line 28
    iget-object p1, p0, Lcom/zykj/video/play/SuperPlayerView;->e:Lcom/zykj/video/play/controller/TCControllerFullScreen;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v4

    sub-int/2addr v4, v3

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lj5/g;

    invoke-virtual {p1, v4}, Lcom/zykj/video/play/controller/TCControllerFullScreen;->U(Lj5/g;)V

    .line 29
    iput-boolean v3, p0, Lcom/zykj/video/play/SuperPlayerView;->G:Z

    .line 30
    :cond_6
    iget-object p1, p0, Lcom/zykj/video/play/SuperPlayerView;->e:Lcom/zykj/video/play/controller/TCControllerFullScreen;

    invoke-virtual {p1, v0}, Lcom/zykj/video/play/controller/TCControllerFullScreen;->setVideoQualityList(Ljava/util/List;)V

    :cond_7
    :goto_3
    if-gez p2, :cond_8

    .line 31
    iget-object p1, p0, Lcom/zykj/video/play/SuperPlayerView;->q:Lcom/tencent/rtmp/TXVodPlayer;

    invoke-virtual {p1, v3}, Lcom/tencent/rtmp/TXVodPlayer;->stopPlay(Z)I

    const/4 p1, 0x2

    .line 32
    invoke-virtual {p0, p1}, Lcom/zykj/video/play/SuperPlayerView;->v0(I)V

    .line 33
    iget-object p1, p0, Lcom/zykj/video/play/SuperPlayerView;->b:Landroid/content/Context;

    invoke-virtual {p3, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    :cond_8
    :goto_4
    return-void

    :pswitch_data_0
    .packed-switch 0x7d3
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public p0()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView;->h:Lcom/zykj/video/play/view/TCDanmuView;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/video/play/view/TCDanmuView;->u()V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lcom/zykj/video/play/SuperPlayerView;->h:Lcom/zykj/video/play/view/TCDanmuView;

    .line 10
    .line 11
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/video/play/SuperPlayerView;->u0()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final q0()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/zykj/video/play/SuperPlayerView;->x:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView;->q:Lcom/tencent/rtmp/TXVodPlayer;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/tencent/rtmp/TXVodPlayer;->resume()V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public final r0(I)V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eq p1, v0, :cond_1

    .line 3
    .line 4
    const/4 v1, 0x2

    .line 5
    if-eq p1, v1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object p1, p0, Lcom/zykj/video/play/SuperPlayerView;->b:Landroid/content/Context;

    .line 9
    .line 10
    check-cast p1, Landroid/app/Activity;

    .line 11
    .line 12
    invoke-virtual {p1, v0}, Landroid/app/Activity;->setRequestedOrientation(I)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_1
    iget-object p1, p0, Lcom/zykj/video/play/SuperPlayerView;->b:Landroid/content/Context;

    .line 17
    .line 18
    check-cast p1, Landroid/app/Activity;

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    invoke-virtual {p1, v0}, Landroid/app/Activity;->setRequestedOrientation(I)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public final s0(Landroid/graphics/Bitmap;)V
    .locals 5

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    new-instance v0, Landroid/widget/PopupWindow;

    .line 5
    .line 6
    iget-object v1, p0, Lcom/zykj/video/play/SuperPlayerView;->b:Landroid/content/Context;

    .line 7
    .line 8
    invoke-direct {v0, v1}, Landroid/widget/PopupWindow;-><init>(Landroid/content/Context;)V

    .line 9
    .line 10
    .line 11
    const/4 v1, -0x2

    .line 12
    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setWidth(I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setHeight(I)V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lcom/zykj/video/play/SuperPlayerView;->b:Landroid/content/Context;

    .line 19
    .line 20
    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    sget v2, Lcom/zykj/video/play/R$layout;->superplayer_layout_new_vod_snap:I

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    invoke-virtual {v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    sget v2, Lcom/zykj/video/play/R$id;->superplayer_iv_snap:I

    .line 32
    .line 33
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    check-cast v2, Landroid/widget/ImageView;

    .line 38
    .line 39
    invoke-virtual {v2, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V

    .line 43
    .line 44
    .line 45
    const/4 v1, 0x1

    .line 46
    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setOutsideTouchable(Z)V

    .line 47
    .line 48
    .line 49
    iget-object v1, p0, Lcom/zykj/video/play/SuperPlayerView;->c:Landroid/view/ViewGroup;

    .line 50
    .line 51
    const/16 v2, 0x708

    .line 52
    .line 53
    const/16 v3, 0x12c

    .line 54
    .line 55
    const/16 v4, 0x30

    .line 56
    .line 57
    invoke-virtual {v0, v1, v4, v2, v3}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V

    .line 58
    .line 59
    .line 60
    new-instance v1, Lcom/zykj/video/play/SuperPlayerView$d;

    .line 61
    .line 62
    invoke-direct {v1, p0, p1}, Lcom/zykj/video/play/SuperPlayerView$d;-><init>(Lcom/zykj/video/play/SuperPlayerView;Landroid/graphics/Bitmap;)V

    .line 63
    .line 64
    .line 65
    invoke-static {v1}, Landroid/os/AsyncTask;->execute(Ljava/lang/Runnable;)V

    .line 66
    .line 67
    .line 68
    new-instance p1, Lcom/zykj/video/play/SuperPlayerView$e;

    .line 69
    .line 70
    invoke-direct {p1, p0, v0}, Lcom/zykj/video/play/SuperPlayerView$e;-><init>(Lcom/zykj/video/play/SuperPlayerView;Landroid/widget/PopupWindow;)V

    .line 71
    .line 72
    .line 73
    const-wide/16 v0, 0xbb8

    .line 74
    .line 75
    invoke-virtual {p0, p1, v0, v1}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 76
    .line 77
    .line 78
    return-void
.end method

.method public setPlayerViewCallback(Lcom/zykj/video/play/SuperPlayerView$f;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/video/play/SuperPlayerView;->u:Lcom/zykj/video/play/SuperPlayerView$f;

    .line 2
    .line 3
    return-void
.end method

.method public final t0(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView;->t:Lcom/tencent/rtmp/TXLivePlayConfig;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Lcom/tencent/rtmp/TXLivePlayConfig;->setAutoAdjustCacheTime(Z)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView;->t:Lcom/tencent/rtmp/TXLivePlayConfig;

    .line 8
    .line 9
    const/high16 v1, 0x40a00000    # 5.0f

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lcom/tencent/rtmp/TXLivePlayConfig;->setMaxAutoAdjustCacheTime(F)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView;->t:Lcom/tencent/rtmp/TXLivePlayConfig;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Lcom/tencent/rtmp/TXLivePlayConfig;->setMinAutoAdjustCacheTime(F)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView;->s:Lcom/tencent/rtmp/TXLivePlayer;

    .line 20
    .line 21
    iget-object v1, p0, Lcom/zykj/video/play/SuperPlayerView;->t:Lcom/tencent/rtmp/TXLivePlayConfig;

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Lcom/tencent/rtmp/TXLivePlayer;->setConfig(Lcom/tencent/rtmp/TXLivePlayConfig;)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView;->v:Ln5/c;

    .line 27
    .line 28
    if-nez v0, :cond_0

    .line 29
    .line 30
    new-instance v0, Ln5/c;

    .line 31
    .line 32
    iget-object v1, p0, Lcom/zykj/video/play/SuperPlayerView;->b:Landroid/content/Context;

    .line 33
    .line 34
    invoke-direct {v0, v1}, Ln5/c;-><init>(Landroid/content/Context;)V

    .line 35
    .line 36
    .line 37
    iput-object v0, p0, Lcom/zykj/video/play/SuperPlayerView;->v:Ln5/c;

    .line 38
    .line 39
    :cond_0
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView;->v:Ln5/c;

    .line 40
    .line 41
    iget-object v1, p0, Lcom/zykj/video/play/SuperPlayerView;->s:Lcom/tencent/rtmp/TXLivePlayer;

    .line 42
    .line 43
    invoke-virtual {v0, p1, v1}, Ln5/c;->k(Ljava/lang/String;Lcom/tencent/rtmp/TXLivePlayer;)V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public final u0()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView;->q:Lcom/tencent/rtmp/TXVodPlayer;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0, v2}, Lcom/tencent/rtmp/TXVodPlayer;->setVodListener(Lcom/tencent/rtmp/ITXVodPlayListener;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView;->q:Lcom/tencent/rtmp/TXVodPlayer;

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lcom/tencent/rtmp/TXVodPlayer;->stopPlay(Z)I

    .line 13
    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView;->s:Lcom/tencent/rtmp/TXLivePlayer;

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    invoke-virtual {v0, v2}, Lcom/tencent/rtmp/TXLivePlayer;->setPlayListener(Lcom/tencent/rtmp/ITXLivePlayListener;)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView;->s:Lcom/tencent/rtmp/TXLivePlayer;

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Lcom/tencent/rtmp/TXLivePlayer;->stopPlay(Z)I

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView;->d:Lcom/tencent/rtmp/ui/TXCloudVideoView;

    .line 28
    .line 29
    invoke-virtual {v0}, Lcom/tencent/rtmp/ui/TXCloudVideoView;->removeVideoView()V

    .line 30
    .line 31
    .line 32
    :cond_1
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView;->v:Ln5/c;

    .line 33
    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    invoke-virtual {v0}, Ln5/c;->l()V

    .line 37
    .line 38
    .line 39
    :cond_2
    const/4 v0, 0x2

    .line 40
    iput v0, p0, Lcom/zykj/video/play/SuperPlayerView;->z:I

    .line 41
    .line 42
    new-instance v0, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 45
    .line 46
    .line 47
    const-string v1, "stopPlay mCurrentPlayState:"

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    iget v1, p0, Lcom/zykj/video/play/SuperPlayerView;->z:I

    .line 53
    .line 54
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    const-string v1, "SuperPlayerView"

    .line 62
    .line 63
    invoke-static {v1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0}, Lcom/zykj/video/play/SuperPlayerView;->n0()V

    .line 67
    .line 68
    .line 69
    return-void
.end method

.method public final v0(I)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/zykj/video/play/SuperPlayerView;->z:I

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView;->f:Lcom/zykj/video/play/controller/TCControllerWindow;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/zykj/video/play/controller/TCControllerWindow;->B(I)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView;->e:Lcom/zykj/video/play/controller/TCControllerFullScreen;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lcom/zykj/video/play/controller/TCControllerFullScreen;->Q(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final w0(I)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/zykj/video/play/SuperPlayerView;->x:I

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView;->f:Lcom/zykj/video/play/controller/TCControllerWindow;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/zykj/video/play/controller/TCControllerWindow;->C(I)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView;->e:Lcom/zykj/video/play/controller/TCControllerFullScreen;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lcom/zykj/video/play/controller/TCControllerFullScreen;->R(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final x0(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView;->f:Lcom/zykj/video/play/controller/TCControllerWindow;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/zykj/video/play/controller/TCControllerWindow;->D(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView;->e:Lcom/zykj/video/play/controller/TCControllerFullScreen;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lcom/zykj/video/play/controller/TCControllerFullScreen;->S(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final y0(JJ)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView;->f:Lcom/zykj/video/play/controller/TCControllerWindow;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/zykj/video/play/controller/TCControllerWindow;->E(JJ)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView;->e:Lcom/zykj/video/play/controller/TCControllerFullScreen;

    .line 7
    .line 8
    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/zykj/video/play/controller/TCControllerFullScreen;->T(JJ)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
