.class public Lcom/xw/repo/BubbleSeekBar;
.super Landroid/view/View;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xw/repo/BubbleSeekBar$i;,
        Lcom/xw/repo/BubbleSeekBar$j;,
        Lcom/xw/repo/BubbleSeekBar$k;
    }
.end annotation


# instance fields
.field public A:Z

.field public B:Z

.field public C:J

.field public D:Z

.field public E:J

.field public F:Z

.field public G:Z

.field public H:I

.field public I:I

.field public J:I

.field public K:F

.field public L:F

.field public M:F

.field public N:F

.field public O:F

.field public P:Z

.field public Q:I

.field public R:Z

.field public S:Landroid/util/SparseArray;

.field public T:F

.field public U:Z

.field public V:F

.field public W:F

.field public c:F

.field public d:F

.field public e:F

.field public e0:Landroid/graphics/Paint;

.field public f:Z

.field public f0:Landroid/graphics/Rect;

.field public g:I

.field public g0:Landroid/view/WindowManager;

.field public h:I

.field public h0:Lcom/xw/repo/BubbleSeekBar$i;

.field public i:I

.field public i0:I

.field public j:I

.field public j0:F

.field public k:I

.field public k0:F

.field public l:I

.field public l0:F

.field public m:I

.field public m0:Landroid/view/WindowManager$LayoutParams;

.field public n:I

.field public n0:[I

.field public o:Z

.field public o0:Z

.field public p:Z

.field public p0:F

.field public q:Z

.field public q0:Lp9/a;

.field public r:I

.field public r0:F

.field public s:I

.field public t:I

.field public u:I

.field public v:Z

.field public w:I

.field public x:I

.field public y:Z

.field public z:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/xw/repo/BubbleSeekBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lcom/xw/repo/BubbleSeekBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 7

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 v0, -0x1

    .line 4
    iput v0, p0, Lcom/xw/repo/BubbleSeekBar;->t:I

    .line 5
    new-instance v1, Landroid/util/SparseArray;

    invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V

    iput-object v1, p0, Lcom/xw/repo/BubbleSeekBar;->S:Landroid/util/SparseArray;

    const/4 v1, 0x2

    .line 6
    new-array v2, v1, [I

    iput-object v2, p0, Lcom/xw/repo/BubbleSeekBar;->n0:[I

    const/4 v2, 0x1

    .line 7
    iput-boolean v2, p0, Lcom/xw/repo/BubbleSeekBar;->o0:Z

    .line 8
    sget-object v3, Lcom/xw/repo/bubbleseekbar/R$styleable;->BubbleSeekBar:[I

    const/4 v4, 0x0

    invoke-virtual {p1, p2, v3, p3, v4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p2

    .line 9
    sget p3, Lcom/xw/repo/bubbleseekbar/R$styleable;->BubbleSeekBar_bsb_min:I

    const/4 v3, 0x0

    invoke-virtual {p2, p3, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result p3

    iput p3, p0, Lcom/xw/repo/BubbleSeekBar;->c:F

    .line 10
    sget p3, Lcom/xw/repo/bubbleseekbar/R$styleable;->BubbleSeekBar_bsb_max:I

    const/high16 v3, 0x42c80000    # 100.0f

    invoke-virtual {p2, p3, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result p3

    iput p3, p0, Lcom/xw/repo/BubbleSeekBar;->d:F

    .line 11
    sget p3, Lcom/xw/repo/bubbleseekbar/R$styleable;->BubbleSeekBar_bsb_progress:I

    iget v3, p0, Lcom/xw/repo/BubbleSeekBar;->c:F

    invoke-virtual {p2, p3, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result p3

    iput p3, p0, Lcom/xw/repo/BubbleSeekBar;->e:F

    .line 12
    sget p3, Lcom/xw/repo/bubbleseekbar/R$styleable;->BubbleSeekBar_bsb_is_float_type:I

    invoke-virtual {p2, p3, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p3

    iput-boolean p3, p0, Lcom/xw/repo/BubbleSeekBar;->f:Z

    .line 13
    sget p3, Lcom/xw/repo/bubbleseekbar/R$styleable;->BubbleSeekBar_bsb_track_size:I

    invoke-static {v1}, Lp9/b;->a(I)I

    move-result v3

    invoke-virtual {p2, p3, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p3

    iput p3, p0, Lcom/xw/repo/BubbleSeekBar;->g:I

    .line 14
    sget v3, Lcom/xw/repo/bubbleseekbar/R$styleable;->BubbleSeekBar_bsb_second_track_size:I

    .line 15
    invoke-static {v1}, Lp9/b;->a(I)I

    move-result v5

    add-int/2addr p3, v5

    .line 16
    invoke-virtual {p2, v3, p3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p3

    iput p3, p0, Lcom/xw/repo/BubbleSeekBar;->h:I

    .line 17
    sget v3, Lcom/xw/repo/bubbleseekbar/R$styleable;->BubbleSeekBar_bsb_thumb_radius:I

    .line 18
    invoke-static {v1}, Lp9/b;->a(I)I

    move-result v5

    add-int/2addr p3, v5

    .line 19
    invoke-virtual {p2, v3, p3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p3

    iput p3, p0, Lcom/xw/repo/BubbleSeekBar;->i:I

    .line 20
    sget p3, Lcom/xw/repo/bubbleseekbar/R$styleable;->BubbleSeekBar_bsb_thumb_radius_on_dragging:I

    iget v3, p0, Lcom/xw/repo/BubbleSeekBar;->h:I

    mul-int/2addr v3, v1

    invoke-virtual {p2, p3, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p3

    iput p3, p0, Lcom/xw/repo/BubbleSeekBar;->j:I

    .line 21
    sget p3, Lcom/xw/repo/bubbleseekbar/R$styleable;->BubbleSeekBar_bsb_section_count:I

    const/16 v3, 0xa

    invoke-virtual {p2, p3, v3}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result p3

    iput p3, p0, Lcom/xw/repo/BubbleSeekBar;->n:I

    .line 22
    sget p3, Lcom/xw/repo/bubbleseekbar/R$styleable;->BubbleSeekBar_bsb_track_color:I

    sget v3, Lcom/xw/repo/bubbleseekbar/R$color;->colorPrimary:I

    .line 23
    invoke-static {p1, v3}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v3

    .line 24
    invoke-virtual {p2, p3, v3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p3

    iput p3, p0, Lcom/xw/repo/BubbleSeekBar;->k:I

    .line 25
    sget p3, Lcom/xw/repo/bubbleseekbar/R$styleable;->BubbleSeekBar_bsb_second_track_color:I

    sget v3, Lcom/xw/repo/bubbleseekbar/R$color;->colorAccent:I

    .line 26
    invoke-static {p1, v3}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v3

    .line 27
    invoke-virtual {p2, p3, v3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p3

    iput p3, p0, Lcom/xw/repo/BubbleSeekBar;->l:I

    .line 28
    sget v3, Lcom/xw/repo/bubbleseekbar/R$styleable;->BubbleSeekBar_bsb_thumb_color:I

    invoke-virtual {p2, v3, p3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p3

    iput p3, p0, Lcom/xw/repo/BubbleSeekBar;->m:I

    .line 29
    sget p3, Lcom/xw/repo/bubbleseekbar/R$styleable;->BubbleSeekBar_bsb_show_section_text:I

    invoke-virtual {p2, p3, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p3

    iput-boolean p3, p0, Lcom/xw/repo/BubbleSeekBar;->q:Z

    .line 30
    sget p3, Lcom/xw/repo/bubbleseekbar/R$styleable;->BubbleSeekBar_bsb_section_text_size:I

    const/16 v3, 0xe

    invoke-static {v3}, Lp9/b;->c(I)I

    move-result v5

    invoke-virtual {p2, p3, v5}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p3

    iput p3, p0, Lcom/xw/repo/BubbleSeekBar;->r:I

    .line 31
    sget p3, Lcom/xw/repo/bubbleseekbar/R$styleable;->BubbleSeekBar_bsb_section_text_color:I

    iget v5, p0, Lcom/xw/repo/BubbleSeekBar;->k:I

    invoke-virtual {p2, p3, v5}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p3

    iput p3, p0, Lcom/xw/repo/BubbleSeekBar;->s:I

    .line 32
    sget p3, Lcom/xw/repo/bubbleseekbar/R$styleable;->BubbleSeekBar_bsb_seek_step_section:I

    invoke-virtual {p2, p3, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p3

    iput-boolean p3, p0, Lcom/xw/repo/BubbleSeekBar;->A:Z

    .line 33
    sget p3, Lcom/xw/repo/bubbleseekbar/R$styleable;->BubbleSeekBar_bsb_seek_by_section:I

    invoke-virtual {p2, p3, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p3

    iput-boolean p3, p0, Lcom/xw/repo/BubbleSeekBar;->B:Z

    .line 34
    sget p3, Lcom/xw/repo/bubbleseekbar/R$styleable;->BubbleSeekBar_bsb_section_text_position:I

    invoke-virtual {p2, p3, v0}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result p3

    if-nez p3, :cond_0

    .line 35
    iput v4, p0, Lcom/xw/repo/BubbleSeekBar;->t:I

    goto :goto_0

    :cond_0
    if-ne p3, v2, :cond_1

    .line 36
    iput v2, p0, Lcom/xw/repo/BubbleSeekBar;->t:I

    goto :goto_0

    :cond_1
    if-ne p3, v1, :cond_2

    .line 37
    iput v1, p0, Lcom/xw/repo/BubbleSeekBar;->t:I

    goto :goto_0

    .line 38
    :cond_2
    iput v0, p0, Lcom/xw/repo/BubbleSeekBar;->t:I

    .line 39
    :goto_0
    sget p3, Lcom/xw/repo/bubbleseekbar/R$styleable;->BubbleSeekBar_bsb_section_text_interval:I

    invoke-virtual {p2, p3, v2}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result p3

    iput p3, p0, Lcom/xw/repo/BubbleSeekBar;->u:I

    .line 40
    sget p3, Lcom/xw/repo/bubbleseekbar/R$styleable;->BubbleSeekBar_bsb_show_thumb_text:I

    invoke-virtual {p2, p3, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p3

    iput-boolean p3, p0, Lcom/xw/repo/BubbleSeekBar;->v:Z

    .line 41
    sget p3, Lcom/xw/repo/bubbleseekbar/R$styleable;->BubbleSeekBar_bsb_thumb_text_size:I

    invoke-static {v3}, Lp9/b;->c(I)I

    move-result v5

    invoke-virtual {p2, p3, v5}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p3

    iput p3, p0, Lcom/xw/repo/BubbleSeekBar;->w:I

    .line 42
    sget p3, Lcom/xw/repo/bubbleseekbar/R$styleable;->BubbleSeekBar_bsb_thumb_text_color:I

    iget v5, p0, Lcom/xw/repo/BubbleSeekBar;->l:I

    invoke-virtual {p2, p3, v5}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p3

    iput p3, p0, Lcom/xw/repo/BubbleSeekBar;->x:I

    .line 43
    sget p3, Lcom/xw/repo/bubbleseekbar/R$styleable;->BubbleSeekBar_bsb_bubble_color:I

    iget v5, p0, Lcom/xw/repo/BubbleSeekBar;->l:I

    invoke-virtual {p2, p3, v5}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p3

    iput p3, p0, Lcom/xw/repo/BubbleSeekBar;->H:I

    .line 44
    sget p3, Lcom/xw/repo/bubbleseekbar/R$styleable;->BubbleSeekBar_bsb_bubble_text_size:I

    invoke-static {v3}, Lp9/b;->c(I)I

    move-result v3

    invoke-virtual {p2, p3, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p3

    iput p3, p0, Lcom/xw/repo/BubbleSeekBar;->I:I

    .line 45
    sget p3, Lcom/xw/repo/bubbleseekbar/R$styleable;->BubbleSeekBar_bsb_bubble_text_color:I

    invoke-virtual {p2, p3, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p3

    iput p3, p0, Lcom/xw/repo/BubbleSeekBar;->J:I

    .line 46
    sget p3, Lcom/xw/repo/bubbleseekbar/R$styleable;->BubbleSeekBar_bsb_show_section_mark:I

    invoke-virtual {p2, p3, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p3

    iput-boolean p3, p0, Lcom/xw/repo/BubbleSeekBar;->o:Z

    .line 47
    sget p3, Lcom/xw/repo/bubbleseekbar/R$styleable;->BubbleSeekBar_bsb_auto_adjust_section_mark:I

    invoke-virtual {p2, p3, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p3

    iput-boolean p3, p0, Lcom/xw/repo/BubbleSeekBar;->p:Z

    .line 48
    sget p3, Lcom/xw/repo/bubbleseekbar/R$styleable;->BubbleSeekBar_bsb_show_progress_in_float:I

    invoke-virtual {p2, p3, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p3

    iput-boolean p3, p0, Lcom/xw/repo/BubbleSeekBar;->y:Z

    .line 49
    sget p3, Lcom/xw/repo/bubbleseekbar/R$styleable;->BubbleSeekBar_bsb_anim_duration:I

    invoke-virtual {p2, p3, v0}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result p3

    if-gez p3, :cond_3

    const-wide/16 v5, 0xc8

    goto :goto_1

    :cond_3
    int-to-long v5, p3

    .line 50
    :goto_1
    iput-wide v5, p0, Lcom/xw/repo/BubbleSeekBar;->C:J

    .line 51
    sget p3, Lcom/xw/repo/bubbleseekbar/R$styleable;->BubbleSeekBar_bsb_touch_to_seek:I

    invoke-virtual {p2, p3, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p3

    iput-boolean p3, p0, Lcom/xw/repo/BubbleSeekBar;->z:Z

    .line 52
    sget p3, Lcom/xw/repo/bubbleseekbar/R$styleable;->BubbleSeekBar_bsb_always_show_bubble:I

    invoke-virtual {p2, p3, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p3

    iput-boolean p3, p0, Lcom/xw/repo/BubbleSeekBar;->D:Z

    .line 53
    sget p3, Lcom/xw/repo/bubbleseekbar/R$styleable;->BubbleSeekBar_bsb_always_show_bubble_delay:I

    invoke-virtual {p2, p3, v4}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result p3

    if-gez p3, :cond_4

    const-wide/16 v5, 0x0

    goto :goto_2

    :cond_4
    int-to-long v5, p3

    .line 54
    :goto_2
    iput-wide v5, p0, Lcom/xw/repo/BubbleSeekBar;->E:J

    .line 55
    sget p3, Lcom/xw/repo/bubbleseekbar/R$styleable;->BubbleSeekBar_bsb_hide_bubble:I

    invoke-virtual {p2, p3, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p3

    iput-boolean p3, p0, Lcom/xw/repo/BubbleSeekBar;->F:Z

    .line 56
    sget p3, Lcom/xw/repo/bubbleseekbar/R$styleable;->BubbleSeekBar_bsb_rtl:I

    invoke-virtual {p2, p3, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p3

    iput-boolean p3, p0, Lcom/xw/repo/BubbleSeekBar;->G:Z

    .line 57
    sget p3, Lcom/xw/repo/bubbleseekbar/R$styleable;->BubbleSeekBar_android_enabled:I

    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    move-result v0

    invoke-virtual {p2, p3, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p3

    invoke-virtual {p0, p3}, Landroid/view/View;->setEnabled(Z)V

    .line 58
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 59
    new-instance p2, Landroid/graphics/Paint;

    invoke-direct {p2}, Landroid/graphics/Paint;-><init>()V

    iput-object p2, p0, Lcom/xw/repo/BubbleSeekBar;->e0:Landroid/graphics/Paint;

    .line 60
    invoke-virtual {p2, v2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 61
    iget-object p2, p0, Lcom/xw/repo/BubbleSeekBar;->e0:Landroid/graphics/Paint;

    sget-object p3, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    invoke-virtual {p2, p3}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 62
    iget-object p2, p0, Lcom/xw/repo/BubbleSeekBar;->e0:Landroid/graphics/Paint;

    sget-object p3, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {p2, p3}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 63
    new-instance p2, Landroid/graphics/Rect;

    invoke-direct {p2}, Landroid/graphics/Rect;-><init>()V

    iput-object p2, p0, Lcom/xw/repo/BubbleSeekBar;->f0:Landroid/graphics/Rect;

    .line 64
    invoke-static {v1}, Lp9/b;->a(I)I

    move-result p2

    iput p2, p0, Lcom/xw/repo/BubbleSeekBar;->Q:I

    .line 65
    invoke-virtual {p0}, Lcom/xw/repo/BubbleSeekBar;->H()V

    .line 66
    iget-boolean p2, p0, Lcom/xw/repo/BubbleSeekBar;->F:Z

    if-eqz p2, :cond_5

    return-void

    .line 67
    :cond_5
    const-string p2, "window"

    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/view/WindowManager;

    iput-object p2, p0, Lcom/xw/repo/BubbleSeekBar;->g0:Landroid/view/WindowManager;

    .line 68
    new-instance p2, Lcom/xw/repo/BubbleSeekBar$i;

    invoke-direct {p2, p0, p1}, Lcom/xw/repo/BubbleSeekBar$i;-><init>(Lcom/xw/repo/BubbleSeekBar;Landroid/content/Context;)V

    iput-object p2, p0, Lcom/xw/repo/BubbleSeekBar;->h0:Lcom/xw/repo/BubbleSeekBar$i;

    .line 69
    iget-boolean p1, p0, Lcom/xw/repo/BubbleSeekBar;->y:Z

    if-eqz p1, :cond_6

    .line 70
    invoke-virtual {p0}, Lcom/xw/repo/BubbleSeekBar;->getProgressFloat()F

    move-result p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object p1

    goto :goto_3

    :cond_6
    invoke-virtual {p0}, Lcom/xw/repo/BubbleSeekBar;->getProgress()I

    move-result p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    .line 71
    :goto_3
    invoke-virtual {p2, p1}, Lcom/xw/repo/BubbleSeekBar$i;->a(Ljava/lang/String;)V

    .line 72
    new-instance p1, Landroid/view/WindowManager$LayoutParams;

    invoke-direct {p1}, Landroid/view/WindowManager$LayoutParams;-><init>()V

    iput-object p1, p0, Lcom/xw/repo/BubbleSeekBar;->m0:Landroid/view/WindowManager$LayoutParams;

    const p2, 0x800033

    .line 73
    iput p2, p1, Landroid/view/WindowManager$LayoutParams;->gravity:I

    const/4 p2, -0x2

    .line 74
    iput p2, p1, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 75
    iput p2, p1, Landroid/view/WindowManager$LayoutParams;->height:I

    const/4 p2, -0x3

    .line 76
    iput p2, p1, Landroid/view/WindowManager$LayoutParams;->format:I

    const p2, 0x80028

    .line 77
    iput p2, p1, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 78
    invoke-static {}, Lp9/b;->b()Z

    move-result p1

    if-nez p1, :cond_8

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p2, 0x19

    if-lt p1, p2, :cond_7

    goto :goto_4

    .line 79
    :cond_7
    iget-object p1, p0, Lcom/xw/repo/BubbleSeekBar;->m0:Landroid/view/WindowManager$LayoutParams;

    const/16 p2, 0x7d5

    iput p2, p1, Landroid/view/WindowManager$LayoutParams;->type:I

    goto :goto_5

    .line 80
    :cond_8
    :goto_4
    iget-object p1, p0, Lcom/xw/repo/BubbleSeekBar;->m0:Landroid/view/WindowManager$LayoutParams;

    iput v1, p1, Landroid/view/WindowManager$LayoutParams;->type:I

    .line 81
    :goto_5
    invoke-virtual {p0}, Lcom/xw/repo/BubbleSeekBar;->D()V

    return-void
.end method

.method public static synthetic a(Lcom/xw/repo/BubbleSeekBar;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/xw/repo/BubbleSeekBar;->o0:Z

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic b(Lcom/xw/repo/BubbleSeekBar;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/xw/repo/BubbleSeekBar;->z()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic c(Lcom/xw/repo/BubbleSeekBar;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/xw/repo/BubbleSeekBar;->F:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic d(Lcom/xw/repo/BubbleSeekBar;)F
    .locals 0

    .line 1
    iget p0, p0, Lcom/xw/repo/BubbleSeekBar;->l0:F

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic e(Lcom/xw/repo/BubbleSeekBar;F)F
    .locals 0

    .line 1
    iput p1, p0, Lcom/xw/repo/BubbleSeekBar;->l0:F

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic f(Lcom/xw/repo/BubbleSeekBar;)F
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/xw/repo/BubbleSeekBar;->B()F

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic g(Lcom/xw/repo/BubbleSeekBar;)Landroid/view/WindowManager$LayoutParams;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/xw/repo/BubbleSeekBar;->m0:Landroid/view/WindowManager$LayoutParams;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic h(Lcom/xw/repo/BubbleSeekBar;)Landroid/view/WindowManager;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/xw/repo/BubbleSeekBar;->g0:Landroid/view/WindowManager;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic i(Lcom/xw/repo/BubbleSeekBar;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/xw/repo/BubbleSeekBar;->y:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic j(Lcom/xw/repo/BubbleSeekBar;)F
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/xw/repo/BubbleSeekBar;->M()F

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic k(Lcom/xw/repo/BubbleSeekBar;)Lcom/xw/repo/BubbleSeekBar$k;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    return-object p0
.end method

.method public static synthetic l(Lcom/xw/repo/BubbleSeekBar;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/xw/repo/BubbleSeekBar;->N()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic m(Lcom/xw/repo/BubbleSeekBar;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/xw/repo/BubbleSeekBar;->R:Z

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic n(Lcom/xw/repo/BubbleSeekBar;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/xw/repo/BubbleSeekBar;->i0:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic o(Lcom/xw/repo/BubbleSeekBar;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/xw/repo/BubbleSeekBar;->P:Z

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic p(Lcom/xw/repo/BubbleSeekBar;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/xw/repo/BubbleSeekBar;->H:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic q(Lcom/xw/repo/BubbleSeekBar;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/xw/repo/BubbleSeekBar;->I:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic r(Lcom/xw/repo/BubbleSeekBar;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/xw/repo/BubbleSeekBar;->J:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic s(Lcom/xw/repo/BubbleSeekBar;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/xw/repo/BubbleSeekBar;->D:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic t(Lcom/xw/repo/BubbleSeekBar;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/xw/repo/BubbleSeekBar;->G()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic u(Lcom/xw/repo/BubbleSeekBar;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/xw/repo/BubbleSeekBar;->C:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public static synthetic v(Lcom/xw/repo/BubbleSeekBar;)Lcom/xw/repo/BubbleSeekBar$i;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/xw/repo/BubbleSeekBar;->h0:Lcom/xw/repo/BubbleSeekBar$i;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic w(Lcom/xw/repo/BubbleSeekBar;F)F
    .locals 0

    .line 1
    iput p1, p0, Lcom/xw/repo/BubbleSeekBar;->M:F

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic x(Lcom/xw/repo/BubbleSeekBar;F)F
    .locals 0

    .line 1
    iput p1, p0, Lcom/xw/repo/BubbleSeekBar;->e:F

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic y(Lcom/xw/repo/BubbleSeekBar;)F
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/xw/repo/BubbleSeekBar;->C()F

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method


# virtual methods
.method public final A(F)F
    .locals 4

    .line 1
    iget v0, p0, Lcom/xw/repo/BubbleSeekBar;->V:F

    .line 2
    .line 3
    cmpg-float v1, p1, v0

    .line 4
    .line 5
    if-gtz v1, :cond_0

    .line 6
    .line 7
    return v0

    .line 8
    :cond_0
    iget v0, p0, Lcom/xw/repo/BubbleSeekBar;->W:F

    .line 9
    .line 10
    cmpl-float v1, p1, v0

    .line 11
    .line 12
    if-ltz v1, :cond_1

    .line 13
    .line 14
    return v0

    .line 15
    :cond_1
    const/4 v0, 0x0

    .line 16
    const/4 v1, 0x0

    .line 17
    :goto_0
    iget v2, p0, Lcom/xw/repo/BubbleSeekBar;->n:I

    .line 18
    .line 19
    if-gt v1, v2, :cond_3

    .line 20
    .line 21
    int-to-float v0, v1

    .line 22
    iget v2, p0, Lcom/xw/repo/BubbleSeekBar;->O:F

    .line 23
    .line 24
    mul-float/2addr v0, v2

    .line 25
    iget v3, p0, Lcom/xw/repo/BubbleSeekBar;->V:F

    .line 26
    .line 27
    add-float/2addr v0, v3

    .line 28
    cmpg-float v3, v0, p1

    .line 29
    .line 30
    if-gtz v3, :cond_2

    .line 31
    .line 32
    sub-float v3, p1, v0

    .line 33
    .line 34
    cmpg-float v2, v3, v2

    .line 35
    .line 36
    if-gtz v2, :cond_2

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_3
    :goto_1
    sub-float/2addr p1, v0

    .line 43
    iget v2, p0, Lcom/xw/repo/BubbleSeekBar;->O:F

    .line 44
    .line 45
    const/high16 v3, 0x40000000    # 2.0f

    .line 46
    .line 47
    div-float v3, v2, v3

    .line 48
    .line 49
    cmpg-float p1, p1, v3

    .line 50
    .line 51
    if-gtz p1, :cond_4

    .line 52
    .line 53
    return v0

    .line 54
    :cond_4
    add-int/lit8 v1, v1, 0x1

    .line 55
    .line 56
    int-to-float p1, v1

    .line 57
    mul-float/2addr p1, v2

    .line 58
    iget v0, p0, Lcom/xw/repo/BubbleSeekBar;->V:F

    .line 59
    .line 60
    add-float/2addr p1, v0

    .line 61
    return p1
.end method

.method public final B()F
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/xw/repo/BubbleSeekBar;->G:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Lcom/xw/repo/BubbleSeekBar;->j0:F

    .line 6
    .line 7
    iget v1, p0, Lcom/xw/repo/BubbleSeekBar;->N:F

    .line 8
    .line 9
    iget v2, p0, Lcom/xw/repo/BubbleSeekBar;->e:F

    .line 10
    .line 11
    iget v3, p0, Lcom/xw/repo/BubbleSeekBar;->c:F

    .line 12
    .line 13
    sub-float/2addr v2, v3

    .line 14
    mul-float/2addr v1, v2

    .line 15
    iget v2, p0, Lcom/xw/repo/BubbleSeekBar;->K:F

    .line 16
    .line 17
    div-float/2addr v1, v2

    .line 18
    sub-float/2addr v0, v1

    .line 19
    return v0

    .line 20
    :cond_0
    iget v0, p0, Lcom/xw/repo/BubbleSeekBar;->j0:F

    .line 21
    .line 22
    iget v1, p0, Lcom/xw/repo/BubbleSeekBar;->N:F

    .line 23
    .line 24
    iget v2, p0, Lcom/xw/repo/BubbleSeekBar;->e:F

    .line 25
    .line 26
    iget v3, p0, Lcom/xw/repo/BubbleSeekBar;->c:F

    .line 27
    .line 28
    sub-float/2addr v2, v3

    .line 29
    mul-float/2addr v1, v2

    .line 30
    iget v2, p0, Lcom/xw/repo/BubbleSeekBar;->K:F

    .line 31
    .line 32
    div-float/2addr v1, v2

    .line 33
    add-float/2addr v0, v1

    .line 34
    return v0
.end method

.method public final C()F
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/xw/repo/BubbleSeekBar;->G:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Lcom/xw/repo/BubbleSeekBar;->W:F

    .line 6
    .line 7
    iget v1, p0, Lcom/xw/repo/BubbleSeekBar;->M:F

    .line 8
    .line 9
    sub-float/2addr v0, v1

    .line 10
    iget v1, p0, Lcom/xw/repo/BubbleSeekBar;->K:F

    .line 11
    .line 12
    mul-float/2addr v0, v1

    .line 13
    iget v1, p0, Lcom/xw/repo/BubbleSeekBar;->N:F

    .line 14
    .line 15
    div-float/2addr v0, v1

    .line 16
    iget v1, p0, Lcom/xw/repo/BubbleSeekBar;->c:F

    .line 17
    .line 18
    :goto_0
    add-float/2addr v0, v1

    .line 19
    return v0

    .line 20
    :cond_0
    iget v0, p0, Lcom/xw/repo/BubbleSeekBar;->M:F

    .line 21
    .line 22
    iget v1, p0, Lcom/xw/repo/BubbleSeekBar;->V:F

    .line 23
    .line 24
    sub-float/2addr v0, v1

    .line 25
    iget v1, p0, Lcom/xw/repo/BubbleSeekBar;->K:F

    .line 26
    .line 27
    mul-float/2addr v0, v1

    .line 28
    iget v1, p0, Lcom/xw/repo/BubbleSeekBar;->N:F

    .line 29
    .line 30
    div-float/2addr v0, v1

    .line 31
    iget v1, p0, Lcom/xw/repo/BubbleSeekBar;->c:F

    .line 32
    .line 33
    goto :goto_0
.end method

.method public final D()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/xw/repo/BubbleSeekBar;->e0:Landroid/graphics/Paint;

    .line 2
    .line 3
    iget v1, p0, Lcom/xw/repo/BubbleSeekBar;->I:I

    .line 4
    .line 5
    int-to-float v1, v1

    .line 6
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 7
    .line 8
    .line 9
    iget-boolean v0, p0, Lcom/xw/repo/BubbleSeekBar;->y:Z

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-boolean v0, p0, Lcom/xw/repo/BubbleSeekBar;->G:Z

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget v0, p0, Lcom/xw/repo/BubbleSeekBar;->d:F

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    iget v0, p0, Lcom/xw/repo/BubbleSeekBar;->c:F

    .line 21
    .line 22
    :goto_0
    invoke-virtual {p0, v0}, Lcom/xw/repo/BubbleSeekBar;->E(F)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    iget-boolean v0, p0, Lcom/xw/repo/BubbleSeekBar;->G:Z

    .line 28
    .line 29
    if-eqz v0, :cond_3

    .line 30
    .line 31
    iget-boolean v0, p0, Lcom/xw/repo/BubbleSeekBar;->f:Z

    .line 32
    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    iget v0, p0, Lcom/xw/repo/BubbleSeekBar;->d:F

    .line 36
    .line 37
    invoke-virtual {p0, v0}, Lcom/xw/repo/BubbleSeekBar;->E(F)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    goto :goto_1

    .line 42
    :cond_2
    iget v0, p0, Lcom/xw/repo/BubbleSeekBar;->d:F

    .line 43
    .line 44
    float-to-int v0, v0

    .line 45
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    goto :goto_1

    .line 50
    :cond_3
    iget-boolean v0, p0, Lcom/xw/repo/BubbleSeekBar;->f:Z

    .line 51
    .line 52
    if-eqz v0, :cond_4

    .line 53
    .line 54
    iget v0, p0, Lcom/xw/repo/BubbleSeekBar;->c:F

    .line 55
    .line 56
    invoke-virtual {p0, v0}, Lcom/xw/repo/BubbleSeekBar;->E(F)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    goto :goto_1

    .line 61
    :cond_4
    iget v0, p0, Lcom/xw/repo/BubbleSeekBar;->c:F

    .line 62
    .line 63
    float-to-int v0, v0

    .line 64
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    :goto_1
    iget-object v1, p0, Lcom/xw/repo/BubbleSeekBar;->e0:Landroid/graphics/Paint;

    .line 69
    .line 70
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    iget-object v3, p0, Lcom/xw/repo/BubbleSeekBar;->f0:Landroid/graphics/Rect;

    .line 75
    .line 76
    const/4 v4, 0x0

    .line 77
    invoke-virtual {v1, v0, v4, v2, v3}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 78
    .line 79
    .line 80
    iget-object v0, p0, Lcom/xw/repo/BubbleSeekBar;->f0:Landroid/graphics/Rect;

    .line 81
    .line 82
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    iget v1, p0, Lcom/xw/repo/BubbleSeekBar;->Q:I

    .line 87
    .line 88
    mul-int/lit8 v1, v1, 0x2

    .line 89
    .line 90
    add-int/2addr v0, v1

    .line 91
    shr-int/lit8 v0, v0, 0x1

    .line 92
    .line 93
    iget-boolean v1, p0, Lcom/xw/repo/BubbleSeekBar;->y:Z

    .line 94
    .line 95
    if-eqz v1, :cond_6

    .line 96
    .line 97
    iget-boolean v1, p0, Lcom/xw/repo/BubbleSeekBar;->G:Z

    .line 98
    .line 99
    if-eqz v1, :cond_5

    .line 100
    .line 101
    iget v1, p0, Lcom/xw/repo/BubbleSeekBar;->c:F

    .line 102
    .line 103
    goto :goto_2

    .line 104
    :cond_5
    iget v1, p0, Lcom/xw/repo/BubbleSeekBar;->d:F

    .line 105
    .line 106
    :goto_2
    invoke-virtual {p0, v1}, Lcom/xw/repo/BubbleSeekBar;->E(F)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    goto :goto_3

    .line 111
    :cond_6
    iget-boolean v1, p0, Lcom/xw/repo/BubbleSeekBar;->G:Z

    .line 112
    .line 113
    if-eqz v1, :cond_8

    .line 114
    .line 115
    iget-boolean v1, p0, Lcom/xw/repo/BubbleSeekBar;->f:Z

    .line 116
    .line 117
    if-eqz v1, :cond_7

    .line 118
    .line 119
    iget v1, p0, Lcom/xw/repo/BubbleSeekBar;->c:F

    .line 120
    .line 121
    invoke-virtual {p0, v1}, Lcom/xw/repo/BubbleSeekBar;->E(F)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    goto :goto_3

    .line 126
    :cond_7
    iget v1, p0, Lcom/xw/repo/BubbleSeekBar;->c:F

    .line 127
    .line 128
    float-to-int v1, v1

    .line 129
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    goto :goto_3

    .line 134
    :cond_8
    iget-boolean v1, p0, Lcom/xw/repo/BubbleSeekBar;->f:Z

    .line 135
    .line 136
    if-eqz v1, :cond_9

    .line 137
    .line 138
    iget v1, p0, Lcom/xw/repo/BubbleSeekBar;->d:F

    .line 139
    .line 140
    invoke-virtual {p0, v1}, Lcom/xw/repo/BubbleSeekBar;->E(F)Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    goto :goto_3

    .line 145
    :cond_9
    iget v1, p0, Lcom/xw/repo/BubbleSeekBar;->d:F

    .line 146
    .line 147
    float-to-int v1, v1

    .line 148
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    :goto_3
    iget-object v2, p0, Lcom/xw/repo/BubbleSeekBar;->e0:Landroid/graphics/Paint;

    .line 153
    .line 154
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 155
    .line 156
    .line 157
    move-result v3

    .line 158
    iget-object v5, p0, Lcom/xw/repo/BubbleSeekBar;->f0:Landroid/graphics/Rect;

    .line 159
    .line 160
    invoke-virtual {v2, v1, v4, v3, v5}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 161
    .line 162
    .line 163
    iget-object v1, p0, Lcom/xw/repo/BubbleSeekBar;->f0:Landroid/graphics/Rect;

    .line 164
    .line 165
    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    .line 166
    .line 167
    .line 168
    move-result v1

    .line 169
    iget v2, p0, Lcom/xw/repo/BubbleSeekBar;->Q:I

    .line 170
    .line 171
    mul-int/lit8 v2, v2, 0x2

    .line 172
    .line 173
    add-int/2addr v1, v2

    .line 174
    shr-int/lit8 v1, v1, 0x1

    .line 175
    .line 176
    const/16 v2, 0xe

    .line 177
    .line 178
    invoke-static {v2}, Lp9/b;->a(I)I

    .line 179
    .line 180
    .line 181
    move-result v2

    .line 182
    iput v2, p0, Lcom/xw/repo/BubbleSeekBar;->i0:I

    .line 183
    .line 184
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 185
    .line 186
    .line 187
    move-result v0

    .line 188
    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    .line 189
    .line 190
    .line 191
    move-result v0

    .line 192
    iget v1, p0, Lcom/xw/repo/BubbleSeekBar;->Q:I

    .line 193
    .line 194
    add-int/2addr v0, v1

    .line 195
    iput v0, p0, Lcom/xw/repo/BubbleSeekBar;->i0:I

    .line 196
    .line 197
    return-void
.end method

.method public final E(F)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/xw/repo/BubbleSeekBar;->F(F)F

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-static {p1}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public final F(F)F
    .locals 2

    .line 1
    float-to-double v0, p1

    .line 2
    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(D)Ljava/math/BigDecimal;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    const/4 v0, 0x1

    .line 7
    const/4 v1, 0x4

    .line 8
    invoke-virtual {p1, v0, v1}, Ljava/math/BigDecimal;->setScale(II)Ljava/math/BigDecimal;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1}, Ljava/math/BigDecimal;->floatValue()F

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    return p1
.end method

.method public final G()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xw/repo/BubbleSeekBar;->h0:Lcom/xw/repo/BubbleSeekBar$i;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const/16 v1, 0x8

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/xw/repo/BubbleSeekBar;->h0:Lcom/xw/repo/BubbleSeekBar$i;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    iget-object v0, p0, Lcom/xw/repo/BubbleSeekBar;->g0:Landroid/view/WindowManager;

    .line 20
    .line 21
    iget-object v1, p0, Lcom/xw/repo/BubbleSeekBar;->h0:Lcom/xw/repo/BubbleSeekBar$i;

    .line 22
    .line 23
    invoke-interface {v0, v1}, Landroid/view/WindowManager;->removeViewImmediate(Landroid/view/View;)V

    .line 24
    .line 25
    .line 26
    :cond_1
    :goto_0
    return-void
.end method

.method public final H()V
    .locals 6

    .line 1
    iget v0, p0, Lcom/xw/repo/BubbleSeekBar;->c:F

    .line 2
    .line 3
    iget v1, p0, Lcom/xw/repo/BubbleSeekBar;->d:F

    .line 4
    .line 5
    cmpl-float v0, v0, v1

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput v0, p0, Lcom/xw/repo/BubbleSeekBar;->c:F

    .line 11
    .line 12
    const/high16 v0, 0x42c80000    # 100.0f

    .line 13
    .line 14
    iput v0, p0, Lcom/xw/repo/BubbleSeekBar;->d:F

    .line 15
    .line 16
    :cond_0
    iget v0, p0, Lcom/xw/repo/BubbleSeekBar;->c:F

    .line 17
    .line 18
    iget v1, p0, Lcom/xw/repo/BubbleSeekBar;->d:F

    .line 19
    .line 20
    cmpl-float v2, v0, v1

    .line 21
    .line 22
    if-lez v2, :cond_1

    .line 23
    .line 24
    iput v0, p0, Lcom/xw/repo/BubbleSeekBar;->d:F

    .line 25
    .line 26
    iput v1, p0, Lcom/xw/repo/BubbleSeekBar;->c:F

    .line 27
    .line 28
    :cond_1
    iget v0, p0, Lcom/xw/repo/BubbleSeekBar;->e:F

    .line 29
    .line 30
    iget v1, p0, Lcom/xw/repo/BubbleSeekBar;->c:F

    .line 31
    .line 32
    cmpg-float v0, v0, v1

    .line 33
    .line 34
    if-gez v0, :cond_2

    .line 35
    .line 36
    iput v1, p0, Lcom/xw/repo/BubbleSeekBar;->e:F

    .line 37
    .line 38
    :cond_2
    iget v0, p0, Lcom/xw/repo/BubbleSeekBar;->e:F

    .line 39
    .line 40
    iget v1, p0, Lcom/xw/repo/BubbleSeekBar;->d:F

    .line 41
    .line 42
    cmpl-float v0, v0, v1

    .line 43
    .line 44
    if-lez v0, :cond_3

    .line 45
    .line 46
    iput v1, p0, Lcom/xw/repo/BubbleSeekBar;->e:F

    .line 47
    .line 48
    :cond_3
    iget v0, p0, Lcom/xw/repo/BubbleSeekBar;->h:I

    .line 49
    .line 50
    iget v1, p0, Lcom/xw/repo/BubbleSeekBar;->g:I

    .line 51
    .line 52
    const/4 v2, 0x2

    .line 53
    if-ge v0, v1, :cond_4

    .line 54
    .line 55
    invoke-static {v2}, Lp9/b;->a(I)I

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    add-int/2addr v1, v0

    .line 60
    iput v1, p0, Lcom/xw/repo/BubbleSeekBar;->h:I

    .line 61
    .line 62
    :cond_4
    iget v0, p0, Lcom/xw/repo/BubbleSeekBar;->i:I

    .line 63
    .line 64
    iget v1, p0, Lcom/xw/repo/BubbleSeekBar;->h:I

    .line 65
    .line 66
    if-gt v0, v1, :cond_5

    .line 67
    .line 68
    invoke-static {v2}, Lp9/b;->a(I)I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    add-int/2addr v1, v0

    .line 73
    iput v1, p0, Lcom/xw/repo/BubbleSeekBar;->i:I

    .line 74
    .line 75
    :cond_5
    iget v0, p0, Lcom/xw/repo/BubbleSeekBar;->j:I

    .line 76
    .line 77
    iget v1, p0, Lcom/xw/repo/BubbleSeekBar;->h:I

    .line 78
    .line 79
    if-gt v0, v1, :cond_6

    .line 80
    .line 81
    mul-int/2addr v1, v2

    .line 82
    iput v1, p0, Lcom/xw/repo/BubbleSeekBar;->j:I

    .line 83
    .line 84
    :cond_6
    iget v0, p0, Lcom/xw/repo/BubbleSeekBar;->n:I

    .line 85
    .line 86
    if-gtz v0, :cond_7

    .line 87
    .line 88
    const/16 v0, 0xa

    .line 89
    .line 90
    iput v0, p0, Lcom/xw/repo/BubbleSeekBar;->n:I

    .line 91
    .line 92
    :cond_7
    iget v0, p0, Lcom/xw/repo/BubbleSeekBar;->d:F

    .line 93
    .line 94
    iget v1, p0, Lcom/xw/repo/BubbleSeekBar;->c:F

    .line 95
    .line 96
    sub-float/2addr v0, v1

    .line 97
    iput v0, p0, Lcom/xw/repo/BubbleSeekBar;->K:F

    .line 98
    .line 99
    iget v1, p0, Lcom/xw/repo/BubbleSeekBar;->n:I

    .line 100
    .line 101
    int-to-float v1, v1

    .line 102
    div-float/2addr v0, v1

    .line 103
    iput v0, p0, Lcom/xw/repo/BubbleSeekBar;->L:F

    .line 104
    .line 105
    const/high16 v1, 0x3f800000    # 1.0f

    .line 106
    .line 107
    cmpg-float v0, v0, v1

    .line 108
    .line 109
    const/4 v1, 0x1

    .line 110
    if-gez v0, :cond_8

    .line 111
    .line 112
    iput-boolean v1, p0, Lcom/xw/repo/BubbleSeekBar;->f:Z

    .line 113
    .line 114
    :cond_8
    iget-boolean v0, p0, Lcom/xw/repo/BubbleSeekBar;->f:Z

    .line 115
    .line 116
    if-eqz v0, :cond_9

    .line 117
    .line 118
    iput-boolean v1, p0, Lcom/xw/repo/BubbleSeekBar;->y:Z

    .line 119
    .line 120
    :cond_9
    iget v0, p0, Lcom/xw/repo/BubbleSeekBar;->t:I

    .line 121
    .line 122
    const/4 v3, -0x1

    .line 123
    if-eq v0, v3, :cond_a

    .line 124
    .line 125
    iput-boolean v1, p0, Lcom/xw/repo/BubbleSeekBar;->q:Z

    .line 126
    .line 127
    :cond_a
    iget-boolean v4, p0, Lcom/xw/repo/BubbleSeekBar;->q:Z

    .line 128
    .line 129
    const/4 v5, 0x0

    .line 130
    if-eqz v4, :cond_c

    .line 131
    .line 132
    if-ne v0, v3, :cond_b

    .line 133
    .line 134
    iput v5, p0, Lcom/xw/repo/BubbleSeekBar;->t:I

    .line 135
    .line 136
    :cond_b
    iget v0, p0, Lcom/xw/repo/BubbleSeekBar;->t:I

    .line 137
    .line 138
    if-ne v0, v2, :cond_c

    .line 139
    .line 140
    iput-boolean v1, p0, Lcom/xw/repo/BubbleSeekBar;->o:Z

    .line 141
    .line 142
    :cond_c
    iget v0, p0, Lcom/xw/repo/BubbleSeekBar;->u:I

    .line 143
    .line 144
    if-ge v0, v1, :cond_d

    .line 145
    .line 146
    iput v1, p0, Lcom/xw/repo/BubbleSeekBar;->u:I

    .line 147
    .line 148
    :cond_d
    invoke-virtual {p0}, Lcom/xw/repo/BubbleSeekBar;->I()V

    .line 149
    .line 150
    .line 151
    iget-boolean v0, p0, Lcom/xw/repo/BubbleSeekBar;->A:Z

    .line 152
    .line 153
    if-eqz v0, :cond_e

    .line 154
    .line 155
    iput-boolean v5, p0, Lcom/xw/repo/BubbleSeekBar;->B:Z

    .line 156
    .line 157
    iput-boolean v5, p0, Lcom/xw/repo/BubbleSeekBar;->p:Z

    .line 158
    .line 159
    :cond_e
    iget-boolean v0, p0, Lcom/xw/repo/BubbleSeekBar;->p:Z

    .line 160
    .line 161
    if-eqz v0, :cond_f

    .line 162
    .line 163
    iget-boolean v0, p0, Lcom/xw/repo/BubbleSeekBar;->o:Z

    .line 164
    .line 165
    if-nez v0, :cond_f

    .line 166
    .line 167
    iput-boolean v5, p0, Lcom/xw/repo/BubbleSeekBar;->p:Z

    .line 168
    .line 169
    :cond_f
    iget-boolean v0, p0, Lcom/xw/repo/BubbleSeekBar;->B:Z

    .line 170
    .line 171
    if-eqz v0, :cond_11

    .line 172
    .line 173
    iget v0, p0, Lcom/xw/repo/BubbleSeekBar;->c:F

    .line 174
    .line 175
    iput v0, p0, Lcom/xw/repo/BubbleSeekBar;->p0:F

    .line 176
    .line 177
    iget v3, p0, Lcom/xw/repo/BubbleSeekBar;->e:F

    .line 178
    .line 179
    cmpl-float v0, v3, v0

    .line 180
    .line 181
    if-eqz v0, :cond_10

    .line 182
    .line 183
    iget v0, p0, Lcom/xw/repo/BubbleSeekBar;->L:F

    .line 184
    .line 185
    iput v0, p0, Lcom/xw/repo/BubbleSeekBar;->p0:F

    .line 186
    .line 187
    :cond_10
    iput-boolean v1, p0, Lcom/xw/repo/BubbleSeekBar;->o:Z

    .line 188
    .line 189
    iput-boolean v1, p0, Lcom/xw/repo/BubbleSeekBar;->p:Z

    .line 190
    .line 191
    :cond_11
    iget-boolean v0, p0, Lcom/xw/repo/BubbleSeekBar;->F:Z

    .line 192
    .line 193
    if-eqz v0, :cond_12

    .line 194
    .line 195
    iput-boolean v5, p0, Lcom/xw/repo/BubbleSeekBar;->D:Z

    .line 196
    .line 197
    :cond_12
    iget-boolean v0, p0, Lcom/xw/repo/BubbleSeekBar;->D:Z

    .line 198
    .line 199
    if-eqz v0, :cond_13

    .line 200
    .line 201
    iget v0, p0, Lcom/xw/repo/BubbleSeekBar;->e:F

    .line 202
    .line 203
    invoke-virtual {p0, v0}, Lcom/xw/repo/BubbleSeekBar;->setProgress(F)V

    .line 204
    .line 205
    .line 206
    :cond_13
    iget-boolean v0, p0, Lcom/xw/repo/BubbleSeekBar;->f:Z

    .line 207
    .line 208
    if-nez v0, :cond_15

    .line 209
    .line 210
    iget-boolean v0, p0, Lcom/xw/repo/BubbleSeekBar;->B:Z

    .line 211
    .line 212
    if-nez v0, :cond_15

    .line 213
    .line 214
    iget-boolean v0, p0, Lcom/xw/repo/BubbleSeekBar;->q:Z

    .line 215
    .line 216
    if-eqz v0, :cond_14

    .line 217
    .line 218
    iget v0, p0, Lcom/xw/repo/BubbleSeekBar;->t:I

    .line 219
    .line 220
    if-ne v0, v2, :cond_14

    .line 221
    .line 222
    goto :goto_0

    .line 223
    :cond_14
    iget v0, p0, Lcom/xw/repo/BubbleSeekBar;->w:I

    .line 224
    .line 225
    goto :goto_1

    .line 226
    :cond_15
    :goto_0
    iget v0, p0, Lcom/xw/repo/BubbleSeekBar;->r:I

    .line 227
    .line 228
    :goto_1
    iput v0, p0, Lcom/xw/repo/BubbleSeekBar;->w:I

    .line 229
    .line 230
    return-void
.end method

.method public final I()V
    .locals 8

    .line 1
    iget v0, p0, Lcom/xw/repo/BubbleSeekBar;->t:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x2

    .line 6
    if-ne v0, v3, :cond_0

    .line 7
    .line 8
    move v0, v2

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move v0, v1

    .line 11
    :goto_0
    iget v4, p0, Lcom/xw/repo/BubbleSeekBar;->u:I

    .line 12
    .line 13
    if-le v4, v2, :cond_1

    .line 14
    .line 15
    iget v4, p0, Lcom/xw/repo/BubbleSeekBar;->n:I

    .line 16
    .line 17
    rem-int/2addr v4, v3

    .line 18
    if-nez v4, :cond_1

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_1
    move v2, v1

    .line 22
    :goto_1
    iget v3, p0, Lcom/xw/repo/BubbleSeekBar;->n:I

    .line 23
    .line 24
    if-gt v1, v3, :cond_8

    .line 25
    .line 26
    iget-boolean v4, p0, Lcom/xw/repo/BubbleSeekBar;->G:Z

    .line 27
    .line 28
    if-eqz v4, :cond_2

    .line 29
    .line 30
    iget v5, p0, Lcom/xw/repo/BubbleSeekBar;->d:F

    .line 31
    .line 32
    iget v6, p0, Lcom/xw/repo/BubbleSeekBar;->L:F

    .line 33
    .line 34
    int-to-float v7, v1

    .line 35
    mul-float/2addr v6, v7

    .line 36
    sub-float/2addr v5, v6

    .line 37
    goto :goto_2

    .line 38
    :cond_2
    iget v5, p0, Lcom/xw/repo/BubbleSeekBar;->c:F

    .line 39
    .line 40
    iget v6, p0, Lcom/xw/repo/BubbleSeekBar;->L:F

    .line 41
    .line 42
    int-to-float v7, v1

    .line 43
    mul-float/2addr v6, v7

    .line 44
    add-float/2addr v5, v6

    .line 45
    :goto_2
    if-eqz v0, :cond_4

    .line 46
    .line 47
    if-eqz v2, :cond_5

    .line 48
    .line 49
    iget v3, p0, Lcom/xw/repo/BubbleSeekBar;->u:I

    .line 50
    .line 51
    rem-int v3, v1, v3

    .line 52
    .line 53
    if-nez v3, :cond_7

    .line 54
    .line 55
    if-eqz v4, :cond_3

    .line 56
    .line 57
    iget v3, p0, Lcom/xw/repo/BubbleSeekBar;->d:F

    .line 58
    .line 59
    iget v4, p0, Lcom/xw/repo/BubbleSeekBar;->L:F

    .line 60
    .line 61
    int-to-float v5, v1

    .line 62
    mul-float/2addr v4, v5

    .line 63
    sub-float/2addr v3, v4

    .line 64
    :goto_3
    move v5, v3

    .line 65
    goto :goto_4

    .line 66
    :cond_3
    iget v3, p0, Lcom/xw/repo/BubbleSeekBar;->c:F

    .line 67
    .line 68
    iget v4, p0, Lcom/xw/repo/BubbleSeekBar;->L:F

    .line 69
    .line 70
    int-to-float v5, v1

    .line 71
    mul-float/2addr v4, v5

    .line 72
    add-float/2addr v3, v4

    .line 73
    goto :goto_3

    .line 74
    :cond_4
    if-eqz v1, :cond_5

    .line 75
    .line 76
    if-eq v1, v3, :cond_5

    .line 77
    .line 78
    goto :goto_6

    .line 79
    :cond_5
    :goto_4
    iget-object v3, p0, Lcom/xw/repo/BubbleSeekBar;->S:Landroid/util/SparseArray;

    .line 80
    .line 81
    iget-boolean v4, p0, Lcom/xw/repo/BubbleSeekBar;->f:Z

    .line 82
    .line 83
    if-eqz v4, :cond_6

    .line 84
    .line 85
    invoke-virtual {p0, v5}, Lcom/xw/repo/BubbleSeekBar;->E(F)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    goto :goto_5

    .line 90
    :cond_6
    new-instance v4, Ljava/lang/StringBuilder;

    .line 91
    .line 92
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 93
    .line 94
    .line 95
    float-to-int v5, v5

    .line 96
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    const-string v5, ""

    .line 100
    .line 101
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v4

    .line 108
    :goto_5
    invoke-virtual {v3, v1, v4}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    :cond_7
    :goto_6
    add-int/lit8 v1, v1, 0x1

    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_8
    return-void
.end method

.method public final J(Landroid/view/MotionEvent;)Z
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    iget v0, p0, Lcom/xw/repo/BubbleSeekBar;->N:F

    .line 10
    .line 11
    iget v2, p0, Lcom/xw/repo/BubbleSeekBar;->K:F

    .line 12
    .line 13
    div-float/2addr v0, v2

    .line 14
    iget v2, p0, Lcom/xw/repo/BubbleSeekBar;->e:F

    .line 15
    .line 16
    iget v3, p0, Lcom/xw/repo/BubbleSeekBar;->c:F

    .line 17
    .line 18
    sub-float/2addr v2, v3

    .line 19
    mul-float/2addr v0, v2

    .line 20
    iget-boolean v2, p0, Lcom/xw/repo/BubbleSeekBar;->G:Z

    .line 21
    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    iget v2, p0, Lcom/xw/repo/BubbleSeekBar;->W:F

    .line 25
    .line 26
    sub-float/2addr v2, v0

    .line 27
    goto :goto_0

    .line 28
    :cond_1
    iget v2, p0, Lcom/xw/repo/BubbleSeekBar;->V:F

    .line 29
    .line 30
    add-float/2addr v2, v0

    .line 31
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    int-to-float v0, v0

    .line 36
    const/high16 v3, 0x40000000    # 2.0f

    .line 37
    .line 38
    div-float/2addr v0, v3

    .line 39
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    sub-float/2addr v3, v2

    .line 44
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    sub-float/2addr v4, v2

    .line 49
    mul-float/2addr v3, v4

    .line 50
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    sub-float/2addr v2, v0

    .line 55
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    sub-float/2addr p1, v0

    .line 60
    mul-float/2addr v2, p1

    .line 61
    add-float/2addr v3, v2

    .line 62
    iget p1, p0, Lcom/xw/repo/BubbleSeekBar;->V:F

    .line 63
    .line 64
    const/16 v0, 0x8

    .line 65
    .line 66
    invoke-static {v0}, Lp9/b;->a(I)I

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    int-to-float v2, v2

    .line 71
    add-float/2addr p1, v2

    .line 72
    iget v2, p0, Lcom/xw/repo/BubbleSeekBar;->V:F

    .line 73
    .line 74
    invoke-static {v0}, Lp9/b;->a(I)I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    int-to-float v0, v0

    .line 79
    add-float/2addr v2, v0

    .line 80
    mul-float/2addr p1, v2

    .line 81
    cmpg-float p1, v3, p1

    .line 82
    .line 83
    if-gtz p1, :cond_2

    .line 84
    .line 85
    const/4 p1, 0x1

    .line 86
    return p1

    .line 87
    :cond_2
    return v1
.end method

.method public final K(Landroid/view/MotionEvent;)Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    int-to-float v1, v1

    .line 16
    cmpl-float v0, v0, v1

    .line 17
    .line 18
    if-ltz v0, :cond_0

    .line 19
    .line 20
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    sub-int/2addr v1, v2

    .line 33
    int-to-float v1, v1

    .line 34
    cmpg-float v0, v0, v1

    .line 35
    .line 36
    if-gtz v0, :cond_0

    .line 37
    .line 38
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    int-to-float v1, v1

    .line 47
    cmpl-float v0, v0, v1

    .line 48
    .line 49
    if-ltz v0, :cond_0

    .line 50
    .line 51
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    sub-int/2addr v0, v1

    .line 64
    int-to-float v0, v0

    .line 65
    cmpg-float p1, p1, v0

    .line 66
    .line 67
    if-gtz p1, :cond_0

    .line 68
    .line 69
    const/4 p1, 0x1

    .line 70
    return p1

    .line 71
    :cond_0
    const/4 p1, 0x0

    .line 72
    return p1
.end method

.method public final L()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/xw/repo/BubbleSeekBar;->n0:[I

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/view/View;->getLocationInWindow([I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    instance-of v1, v0, Landroid/view/View;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    check-cast v0, Landroid/view/View;

    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-lez v1, :cond_0

    .line 22
    .line 23
    iget-object v1, p0, Lcom/xw/repo/BubbleSeekBar;->n0:[I

    .line 24
    .line 25
    aget v3, v1, v2

    .line 26
    .line 27
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    rem-int/2addr v3, v0

    .line 32
    aput v3, v1, v2

    .line 33
    .line 34
    :cond_0
    iget-boolean v0, p0, Lcom/xw/repo/BubbleSeekBar;->G:Z

    .line 35
    .line 36
    const/high16 v1, 0x40000000    # 2.0f

    .line 37
    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    iget-object v0, p0, Lcom/xw/repo/BubbleSeekBar;->n0:[I

    .line 41
    .line 42
    aget v0, v0, v2

    .line 43
    .line 44
    int-to-float v0, v0

    .line 45
    iget v2, p0, Lcom/xw/repo/BubbleSeekBar;->W:F

    .line 46
    .line 47
    add-float/2addr v0, v2

    .line 48
    iget-object v2, p0, Lcom/xw/repo/BubbleSeekBar;->h0:Lcom/xw/repo/BubbleSeekBar$i;

    .line 49
    .line 50
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredWidth()I

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    int-to-float v2, v2

    .line 55
    div-float/2addr v2, v1

    .line 56
    sub-float/2addr v0, v2

    .line 57
    iput v0, p0, Lcom/xw/repo/BubbleSeekBar;->j0:F

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_1
    iget-object v0, p0, Lcom/xw/repo/BubbleSeekBar;->n0:[I

    .line 61
    .line 62
    aget v0, v0, v2

    .line 63
    .line 64
    int-to-float v0, v0

    .line 65
    iget v2, p0, Lcom/xw/repo/BubbleSeekBar;->V:F

    .line 66
    .line 67
    add-float/2addr v0, v2

    .line 68
    iget-object v2, p0, Lcom/xw/repo/BubbleSeekBar;->h0:Lcom/xw/repo/BubbleSeekBar$i;

    .line 69
    .line 70
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredWidth()I

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    int-to-float v2, v2

    .line 75
    div-float/2addr v2, v1

    .line 76
    sub-float/2addr v0, v2

    .line 77
    iput v0, p0, Lcom/xw/repo/BubbleSeekBar;->j0:F

    .line 78
    .line 79
    :goto_0
    invoke-virtual {p0}, Lcom/xw/repo/BubbleSeekBar;->B()F

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    iput v0, p0, Lcom/xw/repo/BubbleSeekBar;->l0:F

    .line 84
    .line 85
    iget-object v0, p0, Lcom/xw/repo/BubbleSeekBar;->n0:[I

    .line 86
    .line 87
    const/4 v1, 0x1

    .line 88
    aget v0, v0, v1

    .line 89
    .line 90
    iget-object v1, p0, Lcom/xw/repo/BubbleSeekBar;->h0:Lcom/xw/repo/BubbleSeekBar$i;

    .line 91
    .line 92
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    sub-int/2addr v0, v1

    .line 97
    int-to-float v0, v0

    .line 98
    iput v0, p0, Lcom/xw/repo/BubbleSeekBar;->k0:F

    .line 99
    .line 100
    const/16 v1, 0x18

    .line 101
    .line 102
    invoke-static {v1}, Lp9/b;->a(I)I

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    int-to-float v1, v1

    .line 107
    sub-float/2addr v0, v1

    .line 108
    iput v0, p0, Lcom/xw/repo/BubbleSeekBar;->k0:F

    .line 109
    .line 110
    invoke-static {}, Lp9/b;->b()Z

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    if-eqz v0, :cond_2

    .line 115
    .line 116
    iget v0, p0, Lcom/xw/repo/BubbleSeekBar;->k0:F

    .line 117
    .line 118
    const/4 v1, 0x4

    .line 119
    invoke-static {v1}, Lp9/b;->a(I)I

    .line 120
    .line 121
    .line 122
    move-result v1

    .line 123
    int-to-float v1, v1

    .line 124
    sub-float/2addr v0, v1

    .line 125
    iput v0, p0, Lcom/xw/repo/BubbleSeekBar;->k0:F

    .line 126
    .line 127
    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    instance-of v1, v0, Landroid/app/Activity;

    .line 132
    .line 133
    if-eqz v1, :cond_3

    .line 134
    .line 135
    check-cast v0, Landroid/app/Activity;

    .line 136
    .line 137
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    if-eqz v0, :cond_3

    .line 142
    .line 143
    invoke-virtual {v0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    iget v0, v0, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 148
    .line 149
    and-int/lit16 v0, v0, 0x400

    .line 150
    .line 151
    if-eqz v0, :cond_3

    .line 152
    .line 153
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    const-string v1, "dimen"

    .line 158
    .line 159
    const-string v2, "android"

    .line 160
    .line 161
    const-string v3, "status_bar_height"

    .line 162
    .line 163
    invoke-virtual {v0, v3, v1, v2}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 164
    .line 165
    .line 166
    move-result v1

    .line 167
    iget v2, p0, Lcom/xw/repo/BubbleSeekBar;->k0:F

    .line 168
    .line 169
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 170
    .line 171
    .line 172
    move-result v0

    .line 173
    int-to-float v0, v0

    .line 174
    add-float/2addr v2, v0

    .line 175
    iput v2, p0, Lcom/xw/repo/BubbleSeekBar;->k0:F

    .line 176
    .line 177
    :cond_3
    return-void
.end method

.method public final M()F
    .locals 6

    .line 1
    iget v0, p0, Lcom/xw/repo/BubbleSeekBar;->e:F

    .line 2
    .line 3
    iget-boolean v1, p0, Lcom/xw/repo/BubbleSeekBar;->B:Z

    .line 4
    .line 5
    if-eqz v1, :cond_7

    .line 6
    .line 7
    iget-boolean v1, p0, Lcom/xw/repo/BubbleSeekBar;->U:Z

    .line 8
    .line 9
    if-eqz v1, :cond_7

    .line 10
    .line 11
    iget v1, p0, Lcom/xw/repo/BubbleSeekBar;->L:F

    .line 12
    .line 13
    const/high16 v2, 0x40000000    # 2.0f

    .line 14
    .line 15
    div-float/2addr v1, v2

    .line 16
    iget-boolean v2, p0, Lcom/xw/repo/BubbleSeekBar;->z:Z

    .line 17
    .line 18
    if-eqz v2, :cond_3

    .line 19
    .line 20
    iget v2, p0, Lcom/xw/repo/BubbleSeekBar;->c:F

    .line 21
    .line 22
    cmpl-float v2, v0, v2

    .line 23
    .line 24
    if-eqz v2, :cond_7

    .line 25
    .line 26
    iget v2, p0, Lcom/xw/repo/BubbleSeekBar;->d:F

    .line 27
    .line 28
    cmpl-float v2, v0, v2

    .line 29
    .line 30
    if-nez v2, :cond_0

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_0
    const/4 v2, 0x0

    .line 34
    :goto_0
    iget v3, p0, Lcom/xw/repo/BubbleSeekBar;->n:I

    .line 35
    .line 36
    if-gt v2, v3, :cond_3

    .line 37
    .line 38
    int-to-float v3, v2

    .line 39
    iget v4, p0, Lcom/xw/repo/BubbleSeekBar;->L:F

    .line 40
    .line 41
    mul-float/2addr v3, v4

    .line 42
    cmpg-float v5, v3, v0

    .line 43
    .line 44
    if-gez v5, :cond_2

    .line 45
    .line 46
    add-float v5, v3, v4

    .line 47
    .line 48
    cmpl-float v5, v5, v0

    .line 49
    .line 50
    if-ltz v5, :cond_2

    .line 51
    .line 52
    add-float/2addr v1, v3

    .line 53
    cmpl-float v0, v1, v0

    .line 54
    .line 55
    if-lez v0, :cond_1

    .line 56
    .line 57
    return v3

    .line 58
    :cond_1
    add-float/2addr v3, v4

    .line 59
    return v3

    .line 60
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_3
    iget v2, p0, Lcom/xw/repo/BubbleSeekBar;->p0:F

    .line 64
    .line 65
    cmpl-float v3, v0, v2

    .line 66
    .line 67
    if-ltz v3, :cond_4

    .line 68
    .line 69
    add-float/2addr v1, v2

    .line 70
    cmpl-float v0, v0, v1

    .line 71
    .line 72
    if-ltz v0, :cond_5

    .line 73
    .line 74
    iget v0, p0, Lcom/xw/repo/BubbleSeekBar;->L:F

    .line 75
    .line 76
    add-float/2addr v2, v0

    .line 77
    iput v2, p0, Lcom/xw/repo/BubbleSeekBar;->p0:F

    .line 78
    .line 79
    return v2

    .line 80
    :cond_4
    sub-float v1, v2, v1

    .line 81
    .line 82
    cmpl-float v0, v0, v1

    .line 83
    .line 84
    if-ltz v0, :cond_6

    .line 85
    .line 86
    :cond_5
    return v2

    .line 87
    :cond_6
    iget v0, p0, Lcom/xw/repo/BubbleSeekBar;->L:F

    .line 88
    .line 89
    sub-float/2addr v2, v0

    .line 90
    iput v2, p0, Lcom/xw/repo/BubbleSeekBar;->p0:F

    .line 91
    .line 92
    return v2

    .line 93
    :cond_7
    :goto_1
    return v0
.end method

.method public final N()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/xw/repo/BubbleSeekBar;->h0:Lcom/xw/repo/BubbleSeekBar$i;

    .line 2
    .line 3
    if-eqz v0, :cond_3

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_2

    .line 12
    :cond_0
    iget-object v0, p0, Lcom/xw/repo/BubbleSeekBar;->m0:Landroid/view/WindowManager$LayoutParams;

    .line 13
    .line 14
    iget v1, p0, Lcom/xw/repo/BubbleSeekBar;->l0:F

    .line 15
    .line 16
    const/high16 v2, 0x3f000000    # 0.5f

    .line 17
    .line 18
    add-float/2addr v1, v2

    .line 19
    float-to-int v1, v1

    .line 20
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 21
    .line 22
    iget v1, p0, Lcom/xw/repo/BubbleSeekBar;->k0:F

    .line 23
    .line 24
    add-float/2addr v1, v2

    .line 25
    float-to-int v1, v1

    .line 26
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 27
    .line 28
    iget-object v0, p0, Lcom/xw/repo/BubbleSeekBar;->h0:Lcom/xw/repo/BubbleSeekBar$i;

    .line 29
    .line 30
    const/4 v1, 0x0

    .line 31
    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Lcom/xw/repo/BubbleSeekBar;->h0:Lcom/xw/repo/BubbleSeekBar$i;

    .line 35
    .line 36
    const/4 v1, 0x0

    .line 37
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 38
    .line 39
    .line 40
    iget-object v0, p0, Lcom/xw/repo/BubbleSeekBar;->h0:Lcom/xw/repo/BubbleSeekBar$i;

    .line 41
    .line 42
    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    const/high16 v1, 0x3f800000    # 1.0f

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    iget-boolean v1, p0, Lcom/xw/repo/BubbleSeekBar;->z:Z

    .line 53
    .line 54
    if-eqz v1, :cond_1

    .line 55
    .line 56
    const-wide/16 v1, 0x0

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    iget-wide v1, p0, Lcom/xw/repo/BubbleSeekBar;->C:J

    .line 60
    .line 61
    :goto_0
    invoke-virtual {v0, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    new-instance v1, Lcom/xw/repo/BubbleSeekBar$g;

    .line 66
    .line 67
    invoke-direct {v1, p0}, Lcom/xw/repo/BubbleSeekBar$g;-><init>(Lcom/xw/repo/BubbleSeekBar;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 75
    .line 76
    .line 77
    iget-object v0, p0, Lcom/xw/repo/BubbleSeekBar;->h0:Lcom/xw/repo/BubbleSeekBar$i;

    .line 78
    .line 79
    iget-boolean v1, p0, Lcom/xw/repo/BubbleSeekBar;->y:Z

    .line 80
    .line 81
    if-eqz v1, :cond_2

    .line 82
    .line 83
    invoke-virtual {p0}, Lcom/xw/repo/BubbleSeekBar;->getProgressFloat()F

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    invoke-static {v1}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    goto :goto_1

    .line 92
    :cond_2
    invoke-virtual {p0}, Lcom/xw/repo/BubbleSeekBar;->getProgress()I

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    :goto_1
    invoke-virtual {v0, v1}, Lcom/xw/repo/BubbleSeekBar$i;->a(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    :cond_3
    :goto_2
    return-void
.end method

.method public getConfigBuilder()Lp9/a;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/xw/repo/BubbleSeekBar;->q0:Lp9/a;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lp9/a;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Lp9/a;-><init>(Lcom/xw/repo/BubbleSeekBar;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/xw/repo/BubbleSeekBar;->q0:Lp9/a;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lcom/xw/repo/BubbleSeekBar;->q0:Lp9/a;

    .line 13
    .line 14
    iget v1, p0, Lcom/xw/repo/BubbleSeekBar;->c:F

    .line 15
    .line 16
    iput v1, v0, Lp9/a;->a:F

    .line 17
    .line 18
    iget v1, p0, Lcom/xw/repo/BubbleSeekBar;->d:F

    .line 19
    .line 20
    iput v1, v0, Lp9/a;->b:F

    .line 21
    .line 22
    iget v1, p0, Lcom/xw/repo/BubbleSeekBar;->e:F

    .line 23
    .line 24
    iput v1, v0, Lp9/a;->c:F

    .line 25
    .line 26
    iget-boolean v1, p0, Lcom/xw/repo/BubbleSeekBar;->f:Z

    .line 27
    .line 28
    iput-boolean v1, v0, Lp9/a;->d:Z

    .line 29
    .line 30
    iget v1, p0, Lcom/xw/repo/BubbleSeekBar;->g:I

    .line 31
    .line 32
    iput v1, v0, Lp9/a;->e:I

    .line 33
    .line 34
    iget v1, p0, Lcom/xw/repo/BubbleSeekBar;->h:I

    .line 35
    .line 36
    iput v1, v0, Lp9/a;->f:I

    .line 37
    .line 38
    iget v1, p0, Lcom/xw/repo/BubbleSeekBar;->i:I

    .line 39
    .line 40
    iput v1, v0, Lp9/a;->g:I

    .line 41
    .line 42
    iget v1, p0, Lcom/xw/repo/BubbleSeekBar;->j:I

    .line 43
    .line 44
    iput v1, v0, Lp9/a;->h:I

    .line 45
    .line 46
    iget v1, p0, Lcom/xw/repo/BubbleSeekBar;->k:I

    .line 47
    .line 48
    iput v1, v0, Lp9/a;->i:I

    .line 49
    .line 50
    iget v1, p0, Lcom/xw/repo/BubbleSeekBar;->l:I

    .line 51
    .line 52
    iput v1, v0, Lp9/a;->j:I

    .line 53
    .line 54
    iget v1, p0, Lcom/xw/repo/BubbleSeekBar;->m:I

    .line 55
    .line 56
    iput v1, v0, Lp9/a;->k:I

    .line 57
    .line 58
    iget v1, p0, Lcom/xw/repo/BubbleSeekBar;->n:I

    .line 59
    .line 60
    iput v1, v0, Lp9/a;->l:I

    .line 61
    .line 62
    iget-boolean v1, p0, Lcom/xw/repo/BubbleSeekBar;->o:Z

    .line 63
    .line 64
    iput-boolean v1, v0, Lp9/a;->m:Z

    .line 65
    .line 66
    iget-boolean v1, p0, Lcom/xw/repo/BubbleSeekBar;->p:Z

    .line 67
    .line 68
    iput-boolean v1, v0, Lp9/a;->n:Z

    .line 69
    .line 70
    iget-boolean v1, p0, Lcom/xw/repo/BubbleSeekBar;->q:Z

    .line 71
    .line 72
    iput-boolean v1, v0, Lp9/a;->o:Z

    .line 73
    .line 74
    iget v1, p0, Lcom/xw/repo/BubbleSeekBar;->r:I

    .line 75
    .line 76
    iput v1, v0, Lp9/a;->p:I

    .line 77
    .line 78
    iget v1, p0, Lcom/xw/repo/BubbleSeekBar;->s:I

    .line 79
    .line 80
    iput v1, v0, Lp9/a;->q:I

    .line 81
    .line 82
    iget v1, p0, Lcom/xw/repo/BubbleSeekBar;->t:I

    .line 83
    .line 84
    iput v1, v0, Lp9/a;->r:I

    .line 85
    .line 86
    iget v1, p0, Lcom/xw/repo/BubbleSeekBar;->u:I

    .line 87
    .line 88
    iput v1, v0, Lp9/a;->s:I

    .line 89
    .line 90
    iget-boolean v1, p0, Lcom/xw/repo/BubbleSeekBar;->v:Z

    .line 91
    .line 92
    iput-boolean v1, v0, Lp9/a;->t:Z

    .line 93
    .line 94
    iget v1, p0, Lcom/xw/repo/BubbleSeekBar;->w:I

    .line 95
    .line 96
    iput v1, v0, Lp9/a;->u:I

    .line 97
    .line 98
    iget v1, p0, Lcom/xw/repo/BubbleSeekBar;->x:I

    .line 99
    .line 100
    iput v1, v0, Lp9/a;->v:I

    .line 101
    .line 102
    iget-boolean v1, p0, Lcom/xw/repo/BubbleSeekBar;->y:Z

    .line 103
    .line 104
    iput-boolean v1, v0, Lp9/a;->w:Z

    .line 105
    .line 106
    iget-wide v1, p0, Lcom/xw/repo/BubbleSeekBar;->C:J

    .line 107
    .line 108
    iput-wide v1, v0, Lp9/a;->x:J

    .line 109
    .line 110
    iget-boolean v1, p0, Lcom/xw/repo/BubbleSeekBar;->z:Z

    .line 111
    .line 112
    iput-boolean v1, v0, Lp9/a;->y:Z

    .line 113
    .line 114
    iget-boolean v1, p0, Lcom/xw/repo/BubbleSeekBar;->A:Z

    .line 115
    .line 116
    iput-boolean v1, v0, Lp9/a;->z:Z

    .line 117
    .line 118
    iget-boolean v1, p0, Lcom/xw/repo/BubbleSeekBar;->B:Z

    .line 119
    .line 120
    iput-boolean v1, v0, Lp9/a;->A:Z

    .line 121
    .line 122
    iget v1, p0, Lcom/xw/repo/BubbleSeekBar;->H:I

    .line 123
    .line 124
    iput v1, v0, Lp9/a;->B:I

    .line 125
    .line 126
    iget v1, p0, Lcom/xw/repo/BubbleSeekBar;->I:I

    .line 127
    .line 128
    iput v1, v0, Lp9/a;->C:I

    .line 129
    .line 130
    iget v1, p0, Lcom/xw/repo/BubbleSeekBar;->J:I

    .line 131
    .line 132
    iput v1, v0, Lp9/a;->D:I

    .line 133
    .line 134
    iget-boolean v1, p0, Lcom/xw/repo/BubbleSeekBar;->D:Z

    .line 135
    .line 136
    iput-boolean v1, v0, Lp9/a;->E:Z

    .line 137
    .line 138
    iget-wide v1, p0, Lcom/xw/repo/BubbleSeekBar;->E:J

    .line 139
    .line 140
    iput-wide v1, v0, Lp9/a;->F:J

    .line 141
    .line 142
    iget-boolean v1, p0, Lcom/xw/repo/BubbleSeekBar;->F:Z

    .line 143
    .line 144
    iput-boolean v1, v0, Lp9/a;->G:Z

    .line 145
    .line 146
    iget-boolean v1, p0, Lcom/xw/repo/BubbleSeekBar;->G:Z

    .line 147
    .line 148
    iput-boolean v1, v0, Lp9/a;->H:Z

    .line 149
    .line 150
    return-object v0
.end method

.method public getMax()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/xw/repo/BubbleSeekBar;->d:F

    .line 2
    .line 3
    return v0
.end method

.method public getMin()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/xw/repo/BubbleSeekBar;->c:F

    .line 2
    .line 3
    return v0
.end method

.method public getOnProgressChangedListener()Lcom/xw/repo/BubbleSeekBar$k;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getProgress()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/xw/repo/BubbleSeekBar;->M()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public getProgressFloat()F
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/xw/repo/BubbleSeekBar;->M()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0, v0}, Lcom/xw/repo/BubbleSeekBar;->F(F)F

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public onDetachedFromWindow()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/xw/repo/BubbleSeekBar;->G()V

    .line 2
    .line 3
    .line 4
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-super/range {p0 .. p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    int-to-float v2, v2

    .line 13
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    invoke-virtual {v0}, Landroid/view/View;->getPaddingRight()I

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    sub-int/2addr v3, v4

    .line 22
    int-to-float v3, v3

    .line 23
    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    iget v5, v0, Lcom/xw/repo/BubbleSeekBar;->j:I

    .line 28
    .line 29
    add-int/2addr v4, v5

    .line 30
    int-to-float v4, v4

    .line 31
    iget-boolean v5, v0, Lcom/xw/repo/BubbleSeekBar;->q:Z

    .line 32
    .line 33
    const/16 v6, 0xa

    .line 34
    .line 35
    const-string v7, "0123456789"

    .line 36
    .line 37
    const/high16 v8, 0x40000000    # 2.0f

    .line 38
    .line 39
    const/4 v9, 0x1

    .line 40
    const/4 v10, 0x0

    .line 41
    if-eqz v5, :cond_3

    .line 42
    .line 43
    iget-object v5, v0, Lcom/xw/repo/BubbleSeekBar;->e0:Landroid/graphics/Paint;

    .line 44
    .line 45
    iget v11, v0, Lcom/xw/repo/BubbleSeekBar;->s:I

    .line 46
    .line 47
    invoke-virtual {v5, v11}, Landroid/graphics/Paint;->setColor(I)V

    .line 48
    .line 49
    .line 50
    iget-object v5, v0, Lcom/xw/repo/BubbleSeekBar;->e0:Landroid/graphics/Paint;

    .line 51
    .line 52
    iget v11, v0, Lcom/xw/repo/BubbleSeekBar;->r:I

    .line 53
    .line 54
    int-to-float v11, v11

    .line 55
    invoke-virtual {v5, v11}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 56
    .line 57
    .line 58
    iget-object v5, v0, Lcom/xw/repo/BubbleSeekBar;->e0:Landroid/graphics/Paint;

    .line 59
    .line 60
    iget-object v11, v0, Lcom/xw/repo/BubbleSeekBar;->f0:Landroid/graphics/Rect;

    .line 61
    .line 62
    invoke-virtual {v5, v7, v10, v6, v11}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 63
    .line 64
    .line 65
    iget v5, v0, Lcom/xw/repo/BubbleSeekBar;->t:I

    .line 66
    .line 67
    if-nez v5, :cond_0

    .line 68
    .line 69
    iget-object v5, v0, Lcom/xw/repo/BubbleSeekBar;->f0:Landroid/graphics/Rect;

    .line 70
    .line 71
    invoke-virtual {v5}, Landroid/graphics/Rect;->height()I

    .line 72
    .line 73
    .line 74
    move-result v5

    .line 75
    int-to-float v5, v5

    .line 76
    div-float/2addr v5, v8

    .line 77
    add-float/2addr v5, v4

    .line 78
    iget-object v11, v0, Lcom/xw/repo/BubbleSeekBar;->S:Landroid/util/SparseArray;

    .line 79
    .line 80
    invoke-virtual {v11, v10}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v11

    .line 84
    check-cast v11, Ljava/lang/String;

    .line 85
    .line 86
    iget-object v12, v0, Lcom/xw/repo/BubbleSeekBar;->e0:Landroid/graphics/Paint;

    .line 87
    .line 88
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 89
    .line 90
    .line 91
    move-result v13

    .line 92
    iget-object v14, v0, Lcom/xw/repo/BubbleSeekBar;->f0:Landroid/graphics/Rect;

    .line 93
    .line 94
    invoke-virtual {v12, v11, v10, v13, v14}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 95
    .line 96
    .line 97
    iget-object v12, v0, Lcom/xw/repo/BubbleSeekBar;->f0:Landroid/graphics/Rect;

    .line 98
    .line 99
    invoke-virtual {v12}, Landroid/graphics/Rect;->width()I

    .line 100
    .line 101
    .line 102
    move-result v12

    .line 103
    int-to-float v12, v12

    .line 104
    div-float/2addr v12, v8

    .line 105
    add-float/2addr v12, v2

    .line 106
    iget-object v13, v0, Lcom/xw/repo/BubbleSeekBar;->e0:Landroid/graphics/Paint;

    .line 107
    .line 108
    invoke-virtual {v1, v11, v12, v5, v13}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 109
    .line 110
    .line 111
    iget-object v11, v0, Lcom/xw/repo/BubbleSeekBar;->f0:Landroid/graphics/Rect;

    .line 112
    .line 113
    invoke-virtual {v11}, Landroid/graphics/Rect;->width()I

    .line 114
    .line 115
    .line 116
    move-result v11

    .line 117
    iget v12, v0, Lcom/xw/repo/BubbleSeekBar;->Q:I

    .line 118
    .line 119
    add-int/2addr v11, v12

    .line 120
    int-to-float v11, v11

    .line 121
    add-float/2addr v2, v11

    .line 122
    iget-object v11, v0, Lcom/xw/repo/BubbleSeekBar;->S:Landroid/util/SparseArray;

    .line 123
    .line 124
    iget v12, v0, Lcom/xw/repo/BubbleSeekBar;->n:I

    .line 125
    .line 126
    invoke-virtual {v11, v12}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v11

    .line 130
    check-cast v11, Ljava/lang/String;

    .line 131
    .line 132
    iget-object v12, v0, Lcom/xw/repo/BubbleSeekBar;->e0:Landroid/graphics/Paint;

    .line 133
    .line 134
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 135
    .line 136
    .line 137
    move-result v13

    .line 138
    iget-object v14, v0, Lcom/xw/repo/BubbleSeekBar;->f0:Landroid/graphics/Rect;

    .line 139
    .line 140
    invoke-virtual {v12, v11, v10, v13, v14}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 141
    .line 142
    .line 143
    iget-object v12, v0, Lcom/xw/repo/BubbleSeekBar;->f0:Landroid/graphics/Rect;

    .line 144
    .line 145
    invoke-virtual {v12}, Landroid/graphics/Rect;->width()I

    .line 146
    .line 147
    .line 148
    move-result v12

    .line 149
    int-to-float v12, v12

    .line 150
    const/high16 v13, 0x3f000000    # 0.5f

    .line 151
    .line 152
    add-float/2addr v12, v13

    .line 153
    div-float/2addr v12, v8

    .line 154
    sub-float v12, v3, v12

    .line 155
    .line 156
    iget-object v13, v0, Lcom/xw/repo/BubbleSeekBar;->e0:Landroid/graphics/Paint;

    .line 157
    .line 158
    invoke-virtual {v1, v11, v12, v5, v13}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 159
    .line 160
    .line 161
    iget-object v5, v0, Lcom/xw/repo/BubbleSeekBar;->f0:Landroid/graphics/Rect;

    .line 162
    .line 163
    invoke-virtual {v5}, Landroid/graphics/Rect;->width()I

    .line 164
    .line 165
    .line 166
    move-result v5

    .line 167
    iget v11, v0, Lcom/xw/repo/BubbleSeekBar;->Q:I

    .line 168
    .line 169
    add-int/2addr v5, v11

    .line 170
    int-to-float v5, v5

    .line 171
    sub-float/2addr v3, v5

    .line 172
    goto :goto_0

    .line 173
    :cond_0
    if-lt v5, v9, :cond_4

    .line 174
    .line 175
    iget v2, v0, Lcom/xw/repo/BubbleSeekBar;->j:I

    .line 176
    .line 177
    int-to-float v2, v2

    .line 178
    add-float/2addr v2, v4

    .line 179
    iget v3, v0, Lcom/xw/repo/BubbleSeekBar;->Q:I

    .line 180
    .line 181
    int-to-float v3, v3

    .line 182
    add-float/2addr v2, v3

    .line 183
    iget-object v3, v0, Lcom/xw/repo/BubbleSeekBar;->S:Landroid/util/SparseArray;

    .line 184
    .line 185
    invoke-virtual {v3, v10}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v3

    .line 189
    check-cast v3, Ljava/lang/String;

    .line 190
    .line 191
    iget-object v5, v0, Lcom/xw/repo/BubbleSeekBar;->e0:Landroid/graphics/Paint;

    .line 192
    .line 193
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 194
    .line 195
    .line 196
    move-result v11

    .line 197
    iget-object v12, v0, Lcom/xw/repo/BubbleSeekBar;->f0:Landroid/graphics/Rect;

    .line 198
    .line 199
    invoke-virtual {v5, v3, v10, v11, v12}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 200
    .line 201
    .line 202
    iget-object v5, v0, Lcom/xw/repo/BubbleSeekBar;->f0:Landroid/graphics/Rect;

    .line 203
    .line 204
    invoke-virtual {v5}, Landroid/graphics/Rect;->height()I

    .line 205
    .line 206
    .line 207
    move-result v5

    .line 208
    int-to-float v5, v5

    .line 209
    add-float/2addr v2, v5

    .line 210
    iget v5, v0, Lcom/xw/repo/BubbleSeekBar;->V:F

    .line 211
    .line 212
    iget v11, v0, Lcom/xw/repo/BubbleSeekBar;->t:I

    .line 213
    .line 214
    if-ne v11, v9, :cond_1

    .line 215
    .line 216
    iget-object v11, v0, Lcom/xw/repo/BubbleSeekBar;->e0:Landroid/graphics/Paint;

    .line 217
    .line 218
    invoke-virtual {v1, v3, v5, v2, v11}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 219
    .line 220
    .line 221
    :cond_1
    iget-object v3, v0, Lcom/xw/repo/BubbleSeekBar;->S:Landroid/util/SparseArray;

    .line 222
    .line 223
    iget v11, v0, Lcom/xw/repo/BubbleSeekBar;->n:I

    .line 224
    .line 225
    invoke-virtual {v3, v11}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v3

    .line 229
    check-cast v3, Ljava/lang/String;

    .line 230
    .line 231
    iget-object v11, v0, Lcom/xw/repo/BubbleSeekBar;->e0:Landroid/graphics/Paint;

    .line 232
    .line 233
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 234
    .line 235
    .line 236
    move-result v12

    .line 237
    iget-object v13, v0, Lcom/xw/repo/BubbleSeekBar;->f0:Landroid/graphics/Rect;

    .line 238
    .line 239
    invoke-virtual {v11, v3, v10, v12, v13}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 240
    .line 241
    .line 242
    iget v11, v0, Lcom/xw/repo/BubbleSeekBar;->W:F

    .line 243
    .line 244
    iget v12, v0, Lcom/xw/repo/BubbleSeekBar;->t:I

    .line 245
    .line 246
    if-ne v12, v9, :cond_2

    .line 247
    .line 248
    iget-object v12, v0, Lcom/xw/repo/BubbleSeekBar;->e0:Landroid/graphics/Paint;

    .line 249
    .line 250
    invoke-virtual {v1, v3, v11, v2, v12}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 251
    .line 252
    .line 253
    :cond_2
    move v2, v5

    .line 254
    move v3, v11

    .line 255
    goto :goto_0

    .line 256
    :cond_3
    iget-boolean v5, v0, Lcom/xw/repo/BubbleSeekBar;->v:Z

    .line 257
    .line 258
    if-eqz v5, :cond_4

    .line 259
    .line 260
    iget v5, v0, Lcom/xw/repo/BubbleSeekBar;->t:I

    .line 261
    .line 262
    const/4 v11, -0x1

    .line 263
    if-ne v5, v11, :cond_4

    .line 264
    .line 265
    iget v2, v0, Lcom/xw/repo/BubbleSeekBar;->V:F

    .line 266
    .line 267
    iget v3, v0, Lcom/xw/repo/BubbleSeekBar;->W:F

    .line 268
    .line 269
    :cond_4
    :goto_0
    iget-boolean v5, v0, Lcom/xw/repo/BubbleSeekBar;->q:Z

    .line 270
    .line 271
    if-nez v5, :cond_5

    .line 272
    .line 273
    iget-boolean v11, v0, Lcom/xw/repo/BubbleSeekBar;->v:Z

    .line 274
    .line 275
    if-eqz v11, :cond_6

    .line 276
    .line 277
    :cond_5
    iget v11, v0, Lcom/xw/repo/BubbleSeekBar;->t:I

    .line 278
    .line 279
    if-nez v11, :cond_7

    .line 280
    .line 281
    :cond_6
    iget v11, v0, Lcom/xw/repo/BubbleSeekBar;->j:I

    .line 282
    .line 283
    int-to-float v12, v11

    .line 284
    add-float/2addr v2, v12

    .line 285
    int-to-float v11, v11

    .line 286
    sub-float/2addr v3, v11

    .line 287
    :cond_7
    move v11, v2

    .line 288
    move v2, v3

    .line 289
    const/4 v3, 0x2

    .line 290
    if-eqz v5, :cond_8

    .line 291
    .line 292
    iget v5, v0, Lcom/xw/repo/BubbleSeekBar;->t:I

    .line 293
    .line 294
    if-ne v5, v3, :cond_8

    .line 295
    .line 296
    move v5, v9

    .line 297
    goto :goto_1

    .line 298
    :cond_8
    move v5, v10

    .line 299
    :goto_1
    if-nez v5, :cond_9

    .line 300
    .line 301
    iget-boolean v12, v0, Lcom/xw/repo/BubbleSeekBar;->o:Z

    .line 302
    .line 303
    if-eqz v12, :cond_f

    .line 304
    .line 305
    :cond_9
    iget-object v12, v0, Lcom/xw/repo/BubbleSeekBar;->e0:Landroid/graphics/Paint;

    .line 306
    .line 307
    iget v13, v0, Lcom/xw/repo/BubbleSeekBar;->r:I

    .line 308
    .line 309
    int-to-float v13, v13

    .line 310
    invoke-virtual {v12, v13}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 311
    .line 312
    .line 313
    iget-object v12, v0, Lcom/xw/repo/BubbleSeekBar;->e0:Landroid/graphics/Paint;

    .line 314
    .line 315
    iget-object v13, v0, Lcom/xw/repo/BubbleSeekBar;->f0:Landroid/graphics/Rect;

    .line 316
    .line 317
    invoke-virtual {v12, v7, v10, v6, v13}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 318
    .line 319
    .line 320
    iget-object v12, v0, Lcom/xw/repo/BubbleSeekBar;->f0:Landroid/graphics/Rect;

    .line 321
    .line 322
    invoke-virtual {v12}, Landroid/graphics/Rect;->height()I

    .line 323
    .line 324
    .line 325
    move-result v12

    .line 326
    int-to-float v12, v12

    .line 327
    add-float/2addr v12, v4

    .line 328
    iget v13, v0, Lcom/xw/repo/BubbleSeekBar;->j:I

    .line 329
    .line 330
    int-to-float v14, v13

    .line 331
    add-float/2addr v12, v14

    .line 332
    iget v14, v0, Lcom/xw/repo/BubbleSeekBar;->Q:I

    .line 333
    .line 334
    int-to-float v14, v14

    .line 335
    add-float/2addr v12, v14

    .line 336
    invoke-static {v3}, Lp9/b;->a(I)I

    .line 337
    .line 338
    .line 339
    move-result v3

    .line 340
    sub-int/2addr v13, v3

    .line 341
    int-to-float v3, v13

    .line 342
    div-float/2addr v3, v8

    .line 343
    iget-boolean v8, v0, Lcom/xw/repo/BubbleSeekBar;->G:Z

    .line 344
    .line 345
    if-eqz v8, :cond_a

    .line 346
    .line 347
    iget v8, v0, Lcom/xw/repo/BubbleSeekBar;->W:F

    .line 348
    .line 349
    iget v13, v0, Lcom/xw/repo/BubbleSeekBar;->N:F

    .line 350
    .line 351
    iget v14, v0, Lcom/xw/repo/BubbleSeekBar;->K:F

    .line 352
    .line 353
    div-float/2addr v13, v14

    .line 354
    iget v14, v0, Lcom/xw/repo/BubbleSeekBar;->e:F

    .line 355
    .line 356
    iget v15, v0, Lcom/xw/repo/BubbleSeekBar;->c:F

    .line 357
    .line 358
    sub-float/2addr v14, v15

    .line 359
    invoke-static {v14}, Ljava/lang/Math;->abs(F)F

    .line 360
    .line 361
    .line 362
    move-result v14

    .line 363
    mul-float/2addr v13, v14

    .line 364
    sub-float/2addr v8, v13

    .line 365
    goto :goto_2

    .line 366
    :cond_a
    iget v8, v0, Lcom/xw/repo/BubbleSeekBar;->V:F

    .line 367
    .line 368
    iget v13, v0, Lcom/xw/repo/BubbleSeekBar;->N:F

    .line 369
    .line 370
    iget v14, v0, Lcom/xw/repo/BubbleSeekBar;->K:F

    .line 371
    .line 372
    div-float/2addr v13, v14

    .line 373
    iget v14, v0, Lcom/xw/repo/BubbleSeekBar;->e:F

    .line 374
    .line 375
    iget v15, v0, Lcom/xw/repo/BubbleSeekBar;->c:F

    .line 376
    .line 377
    sub-float/2addr v14, v15

    .line 378
    invoke-static {v14}, Ljava/lang/Math;->abs(F)F

    .line 379
    .line 380
    .line 381
    move-result v14

    .line 382
    mul-float/2addr v13, v14

    .line 383
    add-float/2addr v8, v13

    .line 384
    :goto_2
    move v13, v10

    .line 385
    :goto_3
    iget v14, v0, Lcom/xw/repo/BubbleSeekBar;->n:I

    .line 386
    .line 387
    if-gt v13, v14, :cond_f

    .line 388
    .line 389
    int-to-float v14, v13

    .line 390
    iget v15, v0, Lcom/xw/repo/BubbleSeekBar;->O:F

    .line 391
    .line 392
    mul-float/2addr v14, v15

    .line 393
    add-float/2addr v14, v11

    .line 394
    iget-boolean v15, v0, Lcom/xw/repo/BubbleSeekBar;->G:Z

    .line 395
    .line 396
    if-eqz v15, :cond_c

    .line 397
    .line 398
    iget-object v15, v0, Lcom/xw/repo/BubbleSeekBar;->e0:Landroid/graphics/Paint;

    .line 399
    .line 400
    cmpg-float v16, v14, v8

    .line 401
    .line 402
    if-gtz v16, :cond_b

    .line 403
    .line 404
    iget v9, v0, Lcom/xw/repo/BubbleSeekBar;->k:I

    .line 405
    .line 406
    goto :goto_4

    .line 407
    :cond_b
    iget v9, v0, Lcom/xw/repo/BubbleSeekBar;->l:I

    .line 408
    .line 409
    :goto_4
    invoke-virtual {v15, v9}, Landroid/graphics/Paint;->setColor(I)V

    .line 410
    .line 411
    .line 412
    goto :goto_6

    .line 413
    :cond_c
    iget-object v9, v0, Lcom/xw/repo/BubbleSeekBar;->e0:Landroid/graphics/Paint;

    .line 414
    .line 415
    cmpg-float v15, v14, v8

    .line 416
    .line 417
    if-gtz v15, :cond_d

    .line 418
    .line 419
    iget v15, v0, Lcom/xw/repo/BubbleSeekBar;->l:I

    .line 420
    .line 421
    goto :goto_5

    .line 422
    :cond_d
    iget v15, v0, Lcom/xw/repo/BubbleSeekBar;->k:I

    .line 423
    .line 424
    :goto_5
    invoke-virtual {v9, v15}, Landroid/graphics/Paint;->setColor(I)V

    .line 425
    .line 426
    .line 427
    :goto_6
    iget-object v9, v0, Lcom/xw/repo/BubbleSeekBar;->e0:Landroid/graphics/Paint;

    .line 428
    .line 429
    invoke-virtual {v1, v14, v4, v3, v9}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 430
    .line 431
    .line 432
    if-eqz v5, :cond_e

    .line 433
    .line 434
    iget-object v9, v0, Lcom/xw/repo/BubbleSeekBar;->e0:Landroid/graphics/Paint;

    .line 435
    .line 436
    iget v15, v0, Lcom/xw/repo/BubbleSeekBar;->s:I

    .line 437
    .line 438
    invoke-virtual {v9, v15}, Landroid/graphics/Paint;->setColor(I)V

    .line 439
    .line 440
    .line 441
    iget-object v9, v0, Lcom/xw/repo/BubbleSeekBar;->S:Landroid/util/SparseArray;

    .line 442
    .line 443
    const/4 v15, 0x0

    .line 444
    invoke-virtual {v9, v13, v15}, Landroid/util/SparseArray;->get(ILjava/lang/Object;)Ljava/lang/Object;

    .line 445
    .line 446
    .line 447
    move-result-object v9

    .line 448
    if-eqz v9, :cond_e

    .line 449
    .line 450
    iget-object v9, v0, Lcom/xw/repo/BubbleSeekBar;->S:Landroid/util/SparseArray;

    .line 451
    .line 452
    invoke-virtual {v9, v13}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 453
    .line 454
    .line 455
    move-result-object v9

    .line 456
    check-cast v9, Ljava/lang/String;

    .line 457
    .line 458
    iget-object v15, v0, Lcom/xw/repo/BubbleSeekBar;->e0:Landroid/graphics/Paint;

    .line 459
    .line 460
    invoke-virtual {v1, v9, v14, v12, v15}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 461
    .line 462
    .line 463
    :cond_e
    add-int/lit8 v13, v13, 0x1

    .line 464
    .line 465
    const/4 v9, 0x1

    .line 466
    goto :goto_3

    .line 467
    :cond_f
    iget-boolean v3, v0, Lcom/xw/repo/BubbleSeekBar;->P:Z

    .line 468
    .line 469
    if-eqz v3, :cond_10

    .line 470
    .line 471
    iget-boolean v5, v0, Lcom/xw/repo/BubbleSeekBar;->D:Z

    .line 472
    .line 473
    if-eqz v5, :cond_12

    .line 474
    .line 475
    :cond_10
    iget-boolean v5, v0, Lcom/xw/repo/BubbleSeekBar;->G:Z

    .line 476
    .line 477
    if-eqz v5, :cond_11

    .line 478
    .line 479
    iget v5, v0, Lcom/xw/repo/BubbleSeekBar;->N:F

    .line 480
    .line 481
    iget v8, v0, Lcom/xw/repo/BubbleSeekBar;->K:F

    .line 482
    .line 483
    div-float/2addr v5, v8

    .line 484
    iget v8, v0, Lcom/xw/repo/BubbleSeekBar;->e:F

    .line 485
    .line 486
    iget v9, v0, Lcom/xw/repo/BubbleSeekBar;->c:F

    .line 487
    .line 488
    sub-float/2addr v8, v9

    .line 489
    mul-float/2addr v5, v8

    .line 490
    sub-float v5, v2, v5

    .line 491
    .line 492
    iput v5, v0, Lcom/xw/repo/BubbleSeekBar;->M:F

    .line 493
    .line 494
    goto :goto_7

    .line 495
    :cond_11
    iget v5, v0, Lcom/xw/repo/BubbleSeekBar;->N:F

    .line 496
    .line 497
    iget v8, v0, Lcom/xw/repo/BubbleSeekBar;->K:F

    .line 498
    .line 499
    div-float/2addr v5, v8

    .line 500
    iget v8, v0, Lcom/xw/repo/BubbleSeekBar;->e:F

    .line 501
    .line 502
    iget v9, v0, Lcom/xw/repo/BubbleSeekBar;->c:F

    .line 503
    .line 504
    sub-float/2addr v8, v9

    .line 505
    mul-float/2addr v5, v8

    .line 506
    add-float/2addr v5, v11

    .line 507
    iput v5, v0, Lcom/xw/repo/BubbleSeekBar;->M:F

    .line 508
    .line 509
    :cond_12
    :goto_7
    iget-boolean v5, v0, Lcom/xw/repo/BubbleSeekBar;->v:Z

    .line 510
    .line 511
    if-eqz v5, :cond_15

    .line 512
    .line 513
    if-nez v3, :cond_15

    .line 514
    .line 515
    iget-boolean v3, v0, Lcom/xw/repo/BubbleSeekBar;->o0:Z

    .line 516
    .line 517
    if-eqz v3, :cond_15

    .line 518
    .line 519
    iget-object v3, v0, Lcom/xw/repo/BubbleSeekBar;->e0:Landroid/graphics/Paint;

    .line 520
    .line 521
    iget v5, v0, Lcom/xw/repo/BubbleSeekBar;->x:I

    .line 522
    .line 523
    invoke-virtual {v3, v5}, Landroid/graphics/Paint;->setColor(I)V

    .line 524
    .line 525
    .line 526
    iget-object v3, v0, Lcom/xw/repo/BubbleSeekBar;->e0:Landroid/graphics/Paint;

    .line 527
    .line 528
    iget v5, v0, Lcom/xw/repo/BubbleSeekBar;->w:I

    .line 529
    .line 530
    int-to-float v5, v5

    .line 531
    invoke-virtual {v3, v5}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 532
    .line 533
    .line 534
    iget-object v3, v0, Lcom/xw/repo/BubbleSeekBar;->e0:Landroid/graphics/Paint;

    .line 535
    .line 536
    iget-object v5, v0, Lcom/xw/repo/BubbleSeekBar;->f0:Landroid/graphics/Rect;

    .line 537
    .line 538
    invoke-virtual {v3, v7, v10, v6, v5}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 539
    .line 540
    .line 541
    iget-object v3, v0, Lcom/xw/repo/BubbleSeekBar;->f0:Landroid/graphics/Rect;

    .line 542
    .line 543
    invoke-virtual {v3}, Landroid/graphics/Rect;->height()I

    .line 544
    .line 545
    .line 546
    move-result v3

    .line 547
    int-to-float v3, v3

    .line 548
    add-float/2addr v3, v4

    .line 549
    iget v5, v0, Lcom/xw/repo/BubbleSeekBar;->j:I

    .line 550
    .line 551
    int-to-float v5, v5

    .line 552
    add-float/2addr v3, v5

    .line 553
    iget v5, v0, Lcom/xw/repo/BubbleSeekBar;->Q:I

    .line 554
    .line 555
    int-to-float v5, v5

    .line 556
    add-float/2addr v3, v5

    .line 557
    iget-boolean v5, v0, Lcom/xw/repo/BubbleSeekBar;->f:Z

    .line 558
    .line 559
    if-nez v5, :cond_14

    .line 560
    .line 561
    iget-boolean v5, v0, Lcom/xw/repo/BubbleSeekBar;->y:Z

    .line 562
    .line 563
    if-eqz v5, :cond_13

    .line 564
    .line 565
    iget v5, v0, Lcom/xw/repo/BubbleSeekBar;->t:I

    .line 566
    .line 567
    const/4 v6, 0x1

    .line 568
    if-ne v5, v6, :cond_13

    .line 569
    .line 570
    iget v5, v0, Lcom/xw/repo/BubbleSeekBar;->e:F

    .line 571
    .line 572
    iget v6, v0, Lcom/xw/repo/BubbleSeekBar;->c:F

    .line 573
    .line 574
    cmpl-float v6, v5, v6

    .line 575
    .line 576
    if-eqz v6, :cond_13

    .line 577
    .line 578
    iget v6, v0, Lcom/xw/repo/BubbleSeekBar;->d:F

    .line 579
    .line 580
    cmpl-float v5, v5, v6

    .line 581
    .line 582
    if-eqz v5, :cond_13

    .line 583
    .line 584
    goto :goto_8

    .line 585
    :cond_13
    invoke-virtual {v0}, Lcom/xw/repo/BubbleSeekBar;->getProgress()I

    .line 586
    .line 587
    .line 588
    move-result v5

    .line 589
    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 590
    .line 591
    .line 592
    move-result-object v5

    .line 593
    iget v6, v0, Lcom/xw/repo/BubbleSeekBar;->M:F

    .line 594
    .line 595
    iget-object v7, v0, Lcom/xw/repo/BubbleSeekBar;->e0:Landroid/graphics/Paint;

    .line 596
    .line 597
    invoke-virtual {v1, v5, v6, v3, v7}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 598
    .line 599
    .line 600
    goto :goto_9

    .line 601
    :cond_14
    :goto_8
    invoke-virtual {v0}, Lcom/xw/repo/BubbleSeekBar;->getProgressFloat()F

    .line 602
    .line 603
    .line 604
    move-result v5

    .line 605
    invoke-static {v5}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    .line 606
    .line 607
    .line 608
    move-result-object v5

    .line 609
    iget v6, v0, Lcom/xw/repo/BubbleSeekBar;->M:F

    .line 610
    .line 611
    iget-object v7, v0, Lcom/xw/repo/BubbleSeekBar;->e0:Landroid/graphics/Paint;

    .line 612
    .line 613
    invoke-virtual {v1, v5, v6, v3, v7}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 614
    .line 615
    .line 616
    :cond_15
    :goto_9
    iget-object v3, v0, Lcom/xw/repo/BubbleSeekBar;->e0:Landroid/graphics/Paint;

    .line 617
    .line 618
    iget v5, v0, Lcom/xw/repo/BubbleSeekBar;->l:I

    .line 619
    .line 620
    invoke-virtual {v3, v5}, Landroid/graphics/Paint;->setColor(I)V

    .line 621
    .line 622
    .line 623
    iget-object v3, v0, Lcom/xw/repo/BubbleSeekBar;->e0:Landroid/graphics/Paint;

    .line 624
    .line 625
    iget v5, v0, Lcom/xw/repo/BubbleSeekBar;->h:I

    .line 626
    .line 627
    int-to-float v5, v5

    .line 628
    invoke-virtual {v3, v5}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 629
    .line 630
    .line 631
    iget-boolean v3, v0, Lcom/xw/repo/BubbleSeekBar;->G:Z

    .line 632
    .line 633
    if-eqz v3, :cond_16

    .line 634
    .line 635
    move v3, v4

    .line 636
    iget v4, v0, Lcom/xw/repo/BubbleSeekBar;->M:F

    .line 637
    .line 638
    iget-object v6, v0, Lcom/xw/repo/BubbleSeekBar;->e0:Landroid/graphics/Paint;

    .line 639
    .line 640
    move v5, v3

    .line 641
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 642
    .line 643
    .line 644
    move v7, v2

    .line 645
    move v2, v11

    .line 646
    goto :goto_a

    .line 647
    :cond_16
    move v7, v2

    .line 648
    move v3, v4

    .line 649
    iget v4, v0, Lcom/xw/repo/BubbleSeekBar;->M:F

    .line 650
    .line 651
    iget-object v6, v0, Lcom/xw/repo/BubbleSeekBar;->e0:Landroid/graphics/Paint;

    .line 652
    .line 653
    move v5, v3

    .line 654
    move-object/from16 v1, p1

    .line 655
    .line 656
    move v2, v11

    .line 657
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 658
    .line 659
    .line 660
    :goto_a
    iget-object v1, v0, Lcom/xw/repo/BubbleSeekBar;->e0:Landroid/graphics/Paint;

    .line 661
    .line 662
    iget v4, v0, Lcom/xw/repo/BubbleSeekBar;->k:I

    .line 663
    .line 664
    invoke-virtual {v1, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 665
    .line 666
    .line 667
    iget-object v1, v0, Lcom/xw/repo/BubbleSeekBar;->e0:Landroid/graphics/Paint;

    .line 668
    .line 669
    iget v4, v0, Lcom/xw/repo/BubbleSeekBar;->g:I

    .line 670
    .line 671
    int-to-float v4, v4

    .line 672
    invoke-virtual {v1, v4}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 673
    .line 674
    .line 675
    iget-boolean v1, v0, Lcom/xw/repo/BubbleSeekBar;->G:Z

    .line 676
    .line 677
    if-eqz v1, :cond_17

    .line 678
    .line 679
    move v4, v2

    .line 680
    iget v2, v0, Lcom/xw/repo/BubbleSeekBar;->M:F

    .line 681
    .line 682
    iget-object v6, v0, Lcom/xw/repo/BubbleSeekBar;->e0:Landroid/graphics/Paint;

    .line 683
    .line 684
    move v5, v3

    .line 685
    move-object/from16 v1, p1

    .line 686
    .line 687
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 688
    .line 689
    .line 690
    goto :goto_b

    .line 691
    :cond_17
    iget v2, v0, Lcom/xw/repo/BubbleSeekBar;->M:F

    .line 692
    .line 693
    iget-object v6, v0, Lcom/xw/repo/BubbleSeekBar;->e0:Landroid/graphics/Paint;

    .line 694
    .line 695
    move v5, v3

    .line 696
    move-object/from16 v1, p1

    .line 697
    .line 698
    move v4, v7

    .line 699
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 700
    .line 701
    .line 702
    :goto_b
    iget-object v2, v0, Lcom/xw/repo/BubbleSeekBar;->e0:Landroid/graphics/Paint;

    .line 703
    .line 704
    iget v4, v0, Lcom/xw/repo/BubbleSeekBar;->m:I

    .line 705
    .line 706
    invoke-virtual {v2, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 707
    .line 708
    .line 709
    iget v2, v0, Lcom/xw/repo/BubbleSeekBar;->M:F

    .line 710
    .line 711
    iget-boolean v4, v0, Lcom/xw/repo/BubbleSeekBar;->P:Z

    .line 712
    .line 713
    if-eqz v4, :cond_18

    .line 714
    .line 715
    iget v4, v0, Lcom/xw/repo/BubbleSeekBar;->j:I

    .line 716
    .line 717
    :goto_c
    int-to-float v4, v4

    .line 718
    goto :goto_d

    .line 719
    :cond_18
    iget v4, v0, Lcom/xw/repo/BubbleSeekBar;->i:I

    .line 720
    .line 721
    goto :goto_c

    .line 722
    :goto_d
    iget-object v5, v0, Lcom/xw/repo/BubbleSeekBar;->e0:Landroid/graphics/Paint;

    .line 723
    .line 724
    invoke-virtual {v1, v2, v3, v4, v5}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 725
    .line 726
    .line 727
    return-void
.end method

.method public onLayout(ZIIII)V
    .locals 0

    .line 1
    invoke-super/range {p0 .. p5}, Landroid/view/View;->onLayout(ZIIII)V

    .line 2
    .line 3
    .line 4
    move-object p1, p0

    .line 5
    iget-boolean p2, p1, Lcom/xw/repo/BubbleSeekBar;->F:Z

    .line 6
    .line 7
    if-nez p2, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/xw/repo/BubbleSeekBar;->L()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public onMeasure(II)V
    .locals 6

    .line 1
    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/xw/repo/BubbleSeekBar;->j:I

    .line 5
    .line 6
    mul-int/lit8 v0, v0, 0x2

    .line 7
    .line 8
    iget-boolean v1, p0, Lcom/xw/repo/BubbleSeekBar;->v:Z

    .line 9
    .line 10
    const-string v2, "j"

    .line 11
    .line 12
    const/4 v3, 0x1

    .line 13
    const/4 v4, 0x0

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    iget-object v1, p0, Lcom/xw/repo/BubbleSeekBar;->e0:Landroid/graphics/Paint;

    .line 17
    .line 18
    iget v5, p0, Lcom/xw/repo/BubbleSeekBar;->w:I

    .line 19
    .line 20
    int-to-float v5, v5

    .line 21
    invoke-virtual {v1, v5}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, Lcom/xw/repo/BubbleSeekBar;->e0:Landroid/graphics/Paint;

    .line 25
    .line 26
    iget-object v5, p0, Lcom/xw/repo/BubbleSeekBar;->f0:Landroid/graphics/Rect;

    .line 27
    .line 28
    invoke-virtual {v1, v2, v4, v3, v5}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 29
    .line 30
    .line 31
    iget-object v1, p0, Lcom/xw/repo/BubbleSeekBar;->f0:Landroid/graphics/Rect;

    .line 32
    .line 33
    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    add-int/2addr v0, v1

    .line 38
    :cond_0
    iget-boolean v1, p0, Lcom/xw/repo/BubbleSeekBar;->q:Z

    .line 39
    .line 40
    if-eqz v1, :cond_1

    .line 41
    .line 42
    iget v1, p0, Lcom/xw/repo/BubbleSeekBar;->t:I

    .line 43
    .line 44
    if-lt v1, v3, :cond_1

    .line 45
    .line 46
    iget-object v1, p0, Lcom/xw/repo/BubbleSeekBar;->e0:Landroid/graphics/Paint;

    .line 47
    .line 48
    iget v5, p0, Lcom/xw/repo/BubbleSeekBar;->r:I

    .line 49
    .line 50
    int-to-float v5, v5

    .line 51
    invoke-virtual {v1, v5}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 52
    .line 53
    .line 54
    iget-object v1, p0, Lcom/xw/repo/BubbleSeekBar;->e0:Landroid/graphics/Paint;

    .line 55
    .line 56
    iget-object v5, p0, Lcom/xw/repo/BubbleSeekBar;->f0:Landroid/graphics/Rect;

    .line 57
    .line 58
    invoke-virtual {v1, v2, v4, v3, v5}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 59
    .line 60
    .line 61
    iget v1, p0, Lcom/xw/repo/BubbleSeekBar;->j:I

    .line 62
    .line 63
    mul-int/lit8 v1, v1, 0x2

    .line 64
    .line 65
    iget-object v2, p0, Lcom/xw/repo/BubbleSeekBar;->f0:Landroid/graphics/Rect;

    .line 66
    .line 67
    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    add-int/2addr v1, v2

    .line 72
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    :cond_1
    iget v1, p0, Lcom/xw/repo/BubbleSeekBar;->Q:I

    .line 77
    .line 78
    mul-int/lit8 v1, v1, 0x2

    .line 79
    .line 80
    add-int/2addr v0, v1

    .line 81
    const/16 v1, 0xb4

    .line 82
    .line 83
    invoke-static {v1}, Lp9/b;->a(I)I

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    invoke-static {v1, p1}, Landroid/view/View;->resolveSize(II)I

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    invoke-virtual {p0, v1, v0}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    iget v1, p0, Lcom/xw/repo/BubbleSeekBar;->j:I

    .line 99
    .line 100
    add-int/2addr v0, v1

    .line 101
    int-to-float v0, v0

    .line 102
    iput v0, p0, Lcom/xw/repo/BubbleSeekBar;->V:F

    .line 103
    .line 104
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    sub-int/2addr v0, v1

    .line 113
    iget v1, p0, Lcom/xw/repo/BubbleSeekBar;->j:I

    .line 114
    .line 115
    sub-int/2addr v0, v1

    .line 116
    int-to-float v0, v0

    .line 117
    iput v0, p0, Lcom/xw/repo/BubbleSeekBar;->W:F

    .line 118
    .line 119
    iget-boolean v0, p0, Lcom/xw/repo/BubbleSeekBar;->q:Z

    .line 120
    .line 121
    const/high16 v1, 0x40000000    # 2.0f

    .line 122
    .line 123
    if-eqz v0, :cond_3

    .line 124
    .line 125
    iget-object v0, p0, Lcom/xw/repo/BubbleSeekBar;->e0:Landroid/graphics/Paint;

    .line 126
    .line 127
    iget v2, p0, Lcom/xw/repo/BubbleSeekBar;->r:I

    .line 128
    .line 129
    int-to-float v2, v2

    .line 130
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 131
    .line 132
    .line 133
    iget v0, p0, Lcom/xw/repo/BubbleSeekBar;->t:I

    .line 134
    .line 135
    if-nez v0, :cond_2

    .line 136
    .line 137
    iget-object v0, p0, Lcom/xw/repo/BubbleSeekBar;->S:Landroid/util/SparseArray;

    .line 138
    .line 139
    invoke-virtual {v0, v4}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    check-cast v0, Ljava/lang/String;

    .line 144
    .line 145
    iget-object v1, p0, Lcom/xw/repo/BubbleSeekBar;->e0:Landroid/graphics/Paint;

    .line 146
    .line 147
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 148
    .line 149
    .line 150
    move-result v2

    .line 151
    iget-object v3, p0, Lcom/xw/repo/BubbleSeekBar;->f0:Landroid/graphics/Rect;

    .line 152
    .line 153
    invoke-virtual {v1, v0, v4, v2, v3}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 154
    .line 155
    .line 156
    iget v0, p0, Lcom/xw/repo/BubbleSeekBar;->V:F

    .line 157
    .line 158
    iget-object v1, p0, Lcom/xw/repo/BubbleSeekBar;->f0:Landroid/graphics/Rect;

    .line 159
    .line 160
    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    .line 161
    .line 162
    .line 163
    move-result v1

    .line 164
    iget v2, p0, Lcom/xw/repo/BubbleSeekBar;->Q:I

    .line 165
    .line 166
    add-int/2addr v1, v2

    .line 167
    int-to-float v1, v1

    .line 168
    add-float/2addr v0, v1

    .line 169
    iput v0, p0, Lcom/xw/repo/BubbleSeekBar;->V:F

    .line 170
    .line 171
    iget-object v0, p0, Lcom/xw/repo/BubbleSeekBar;->S:Landroid/util/SparseArray;

    .line 172
    .line 173
    iget v1, p0, Lcom/xw/repo/BubbleSeekBar;->n:I

    .line 174
    .line 175
    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    check-cast v0, Ljava/lang/String;

    .line 180
    .line 181
    iget-object v1, p0, Lcom/xw/repo/BubbleSeekBar;->e0:Landroid/graphics/Paint;

    .line 182
    .line 183
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 184
    .line 185
    .line 186
    move-result v2

    .line 187
    iget-object v3, p0, Lcom/xw/repo/BubbleSeekBar;->f0:Landroid/graphics/Rect;

    .line 188
    .line 189
    invoke-virtual {v1, v0, v4, v2, v3}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 190
    .line 191
    .line 192
    iget v0, p0, Lcom/xw/repo/BubbleSeekBar;->W:F

    .line 193
    .line 194
    iget-object v1, p0, Lcom/xw/repo/BubbleSeekBar;->f0:Landroid/graphics/Rect;

    .line 195
    .line 196
    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    .line 197
    .line 198
    .line 199
    move-result v1

    .line 200
    iget v2, p0, Lcom/xw/repo/BubbleSeekBar;->Q:I

    .line 201
    .line 202
    add-int/2addr v1, v2

    .line 203
    int-to-float v1, v1

    .line 204
    sub-float/2addr v0, v1

    .line 205
    iput v0, p0, Lcom/xw/repo/BubbleSeekBar;->W:F

    .line 206
    .line 207
    goto/16 :goto_0

    .line 208
    .line 209
    :cond_2
    if-lt v0, v3, :cond_4

    .line 210
    .line 211
    iget-object v0, p0, Lcom/xw/repo/BubbleSeekBar;->S:Landroid/util/SparseArray;

    .line 212
    .line 213
    invoke-virtual {v0, v4}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    check-cast v0, Ljava/lang/String;

    .line 218
    .line 219
    iget-object v2, p0, Lcom/xw/repo/BubbleSeekBar;->e0:Landroid/graphics/Paint;

    .line 220
    .line 221
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 222
    .line 223
    .line 224
    move-result v3

    .line 225
    iget-object v5, p0, Lcom/xw/repo/BubbleSeekBar;->f0:Landroid/graphics/Rect;

    .line 226
    .line 227
    invoke-virtual {v2, v0, v4, v3, v5}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 228
    .line 229
    .line 230
    iget v0, p0, Lcom/xw/repo/BubbleSeekBar;->j:I

    .line 231
    .line 232
    int-to-float v0, v0

    .line 233
    iget-object v2, p0, Lcom/xw/repo/BubbleSeekBar;->f0:Landroid/graphics/Rect;

    .line 234
    .line 235
    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    .line 236
    .line 237
    .line 238
    move-result v2

    .line 239
    int-to-float v2, v2

    .line 240
    div-float/2addr v2, v1

    .line 241
    invoke-static {v0, v2}, Ljava/lang/Math;->max(FF)F

    .line 242
    .line 243
    .line 244
    move-result v0

    .line 245
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 246
    .line 247
    .line 248
    move-result v2

    .line 249
    int-to-float v2, v2

    .line 250
    add-float/2addr v2, v0

    .line 251
    iget v0, p0, Lcom/xw/repo/BubbleSeekBar;->Q:I

    .line 252
    .line 253
    int-to-float v0, v0

    .line 254
    add-float/2addr v2, v0

    .line 255
    iput v2, p0, Lcom/xw/repo/BubbleSeekBar;->V:F

    .line 256
    .line 257
    iget-object v0, p0, Lcom/xw/repo/BubbleSeekBar;->S:Landroid/util/SparseArray;

    .line 258
    .line 259
    iget v2, p0, Lcom/xw/repo/BubbleSeekBar;->n:I

    .line 260
    .line 261
    invoke-virtual {v0, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    check-cast v0, Ljava/lang/String;

    .line 266
    .line 267
    iget-object v2, p0, Lcom/xw/repo/BubbleSeekBar;->e0:Landroid/graphics/Paint;

    .line 268
    .line 269
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 270
    .line 271
    .line 272
    move-result v3

    .line 273
    iget-object v5, p0, Lcom/xw/repo/BubbleSeekBar;->f0:Landroid/graphics/Rect;

    .line 274
    .line 275
    invoke-virtual {v2, v0, v4, v3, v5}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 276
    .line 277
    .line 278
    iget v0, p0, Lcom/xw/repo/BubbleSeekBar;->j:I

    .line 279
    .line 280
    int-to-float v0, v0

    .line 281
    iget-object v2, p0, Lcom/xw/repo/BubbleSeekBar;->f0:Landroid/graphics/Rect;

    .line 282
    .line 283
    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    .line 284
    .line 285
    .line 286
    move-result v2

    .line 287
    int-to-float v2, v2

    .line 288
    div-float/2addr v2, v1

    .line 289
    invoke-static {v0, v2}, Ljava/lang/Math;->max(FF)F

    .line 290
    .line 291
    .line 292
    move-result v0

    .line 293
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 294
    .line 295
    .line 296
    move-result v1

    .line 297
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 298
    .line 299
    .line 300
    move-result v2

    .line 301
    sub-int/2addr v1, v2

    .line 302
    int-to-float v1, v1

    .line 303
    sub-float/2addr v1, v0

    .line 304
    iget v0, p0, Lcom/xw/repo/BubbleSeekBar;->Q:I

    .line 305
    .line 306
    int-to-float v0, v0

    .line 307
    sub-float/2addr v1, v0

    .line 308
    iput v1, p0, Lcom/xw/repo/BubbleSeekBar;->W:F

    .line 309
    .line 310
    goto :goto_0

    .line 311
    :cond_3
    iget-boolean v0, p0, Lcom/xw/repo/BubbleSeekBar;->v:Z

    .line 312
    .line 313
    if-eqz v0, :cond_4

    .line 314
    .line 315
    iget v0, p0, Lcom/xw/repo/BubbleSeekBar;->t:I

    .line 316
    .line 317
    const/4 v2, -0x1

    .line 318
    if-ne v0, v2, :cond_4

    .line 319
    .line 320
    iget-object v0, p0, Lcom/xw/repo/BubbleSeekBar;->e0:Landroid/graphics/Paint;

    .line 321
    .line 322
    iget v2, p0, Lcom/xw/repo/BubbleSeekBar;->w:I

    .line 323
    .line 324
    int-to-float v2, v2

    .line 325
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 326
    .line 327
    .line 328
    iget-object v0, p0, Lcom/xw/repo/BubbleSeekBar;->S:Landroid/util/SparseArray;

    .line 329
    .line 330
    invoke-virtual {v0, v4}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    move-result-object v0

    .line 334
    check-cast v0, Ljava/lang/String;

    .line 335
    .line 336
    iget-object v2, p0, Lcom/xw/repo/BubbleSeekBar;->e0:Landroid/graphics/Paint;

    .line 337
    .line 338
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 339
    .line 340
    .line 341
    move-result v3

    .line 342
    iget-object v5, p0, Lcom/xw/repo/BubbleSeekBar;->f0:Landroid/graphics/Rect;

    .line 343
    .line 344
    invoke-virtual {v2, v0, v4, v3, v5}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 345
    .line 346
    .line 347
    iget v0, p0, Lcom/xw/repo/BubbleSeekBar;->j:I

    .line 348
    .line 349
    int-to-float v0, v0

    .line 350
    iget-object v2, p0, Lcom/xw/repo/BubbleSeekBar;->f0:Landroid/graphics/Rect;

    .line 351
    .line 352
    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    .line 353
    .line 354
    .line 355
    move-result v2

    .line 356
    int-to-float v2, v2

    .line 357
    div-float/2addr v2, v1

    .line 358
    invoke-static {v0, v2}, Ljava/lang/Math;->max(FF)F

    .line 359
    .line 360
    .line 361
    move-result v0

    .line 362
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 363
    .line 364
    .line 365
    move-result v2

    .line 366
    int-to-float v2, v2

    .line 367
    add-float/2addr v2, v0

    .line 368
    iget v0, p0, Lcom/xw/repo/BubbleSeekBar;->Q:I

    .line 369
    .line 370
    int-to-float v0, v0

    .line 371
    add-float/2addr v2, v0

    .line 372
    iput v2, p0, Lcom/xw/repo/BubbleSeekBar;->V:F

    .line 373
    .line 374
    iget-object v0, p0, Lcom/xw/repo/BubbleSeekBar;->S:Landroid/util/SparseArray;

    .line 375
    .line 376
    iget v2, p0, Lcom/xw/repo/BubbleSeekBar;->n:I

    .line 377
    .line 378
    invoke-virtual {v0, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 379
    .line 380
    .line 381
    move-result-object v0

    .line 382
    check-cast v0, Ljava/lang/String;

    .line 383
    .line 384
    iget-object v2, p0, Lcom/xw/repo/BubbleSeekBar;->e0:Landroid/graphics/Paint;

    .line 385
    .line 386
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 387
    .line 388
    .line 389
    move-result v3

    .line 390
    iget-object v5, p0, Lcom/xw/repo/BubbleSeekBar;->f0:Landroid/graphics/Rect;

    .line 391
    .line 392
    invoke-virtual {v2, v0, v4, v3, v5}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 393
    .line 394
    .line 395
    iget v0, p0, Lcom/xw/repo/BubbleSeekBar;->j:I

    .line 396
    .line 397
    int-to-float v0, v0

    .line 398
    iget-object v2, p0, Lcom/xw/repo/BubbleSeekBar;->f0:Landroid/graphics/Rect;

    .line 399
    .line 400
    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    .line 401
    .line 402
    .line 403
    move-result v2

    .line 404
    int-to-float v2, v2

    .line 405
    div-float/2addr v2, v1

    .line 406
    invoke-static {v0, v2}, Ljava/lang/Math;->max(FF)F

    .line 407
    .line 408
    .line 409
    move-result v0

    .line 410
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 411
    .line 412
    .line 413
    move-result v1

    .line 414
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 415
    .line 416
    .line 417
    move-result v2

    .line 418
    sub-int/2addr v1, v2

    .line 419
    int-to-float v1, v1

    .line 420
    sub-float/2addr v1, v0

    .line 421
    iget v0, p0, Lcom/xw/repo/BubbleSeekBar;->Q:I

    .line 422
    .line 423
    int-to-float v0, v0

    .line 424
    sub-float/2addr v1, v0

    .line 425
    iput v1, p0, Lcom/xw/repo/BubbleSeekBar;->W:F

    .line 426
    .line 427
    :cond_4
    :goto_0
    iget v0, p0, Lcom/xw/repo/BubbleSeekBar;->W:F

    .line 428
    .line 429
    iget v1, p0, Lcom/xw/repo/BubbleSeekBar;->V:F

    .line 430
    .line 431
    sub-float/2addr v0, v1

    .line 432
    iput v0, p0, Lcom/xw/repo/BubbleSeekBar;->N:F

    .line 433
    .line 434
    const/high16 v1, 0x3f800000    # 1.0f

    .line 435
    .line 436
    mul-float/2addr v0, v1

    .line 437
    iget v1, p0, Lcom/xw/repo/BubbleSeekBar;->n:I

    .line 438
    .line 439
    int-to-float v1, v1

    .line 440
    div-float/2addr v0, v1

    .line 441
    iput v0, p0, Lcom/xw/repo/BubbleSeekBar;->O:F

    .line 442
    .line 443
    iget-boolean v0, p0, Lcom/xw/repo/BubbleSeekBar;->F:Z

    .line 444
    .line 445
    if-nez v0, :cond_5

    .line 446
    .line 447
    iget-object v0, p0, Lcom/xw/repo/BubbleSeekBar;->h0:Lcom/xw/repo/BubbleSeekBar$i;

    .line 448
    .line 449
    invoke-virtual {v0, p1, p2}, Landroid/view/View;->measure(II)V

    .line 450
    .line 451
    .line 452
    :cond_5
    return-void
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    .line 1
    instance-of v0, p1, Landroid/os/Bundle;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    check-cast p1, Landroid/os/Bundle;

    .line 6
    .line 7
    const-string v0, "progress"

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iput v0, p0, Lcom/xw/repo/BubbleSeekBar;->e:F

    .line 14
    .line 15
    const-string v0, "save_instance"

    .line 16
    .line 17
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-super {p0, p1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 22
    .line 23
    .line 24
    iget-object p1, p0, Lcom/xw/repo/BubbleSeekBar;->h0:Lcom/xw/repo/BubbleSeekBar$i;

    .line 25
    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    iget-boolean v0, p0, Lcom/xw/repo/BubbleSeekBar;->y:Z

    .line 29
    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    invoke-virtual {p0}, Lcom/xw/repo/BubbleSeekBar;->getProgressFloat()F

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    invoke-static {v0}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    invoke-virtual {p0}, Lcom/xw/repo/BubbleSeekBar;->getProgress()I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    :goto_0
    invoke-virtual {p1, v0}, Lcom/xw/repo/BubbleSeekBar$i;->a(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    :cond_1
    iget p1, p0, Lcom/xw/repo/BubbleSeekBar;->e:F

    .line 53
    .line 54
    invoke-virtual {p0, p1}, Lcom/xw/repo/BubbleSeekBar;->setProgress(F)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :cond_2
    invoke-super {p0, p1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .locals 3

    .line 1
    new-instance v0, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "save_instance"

    .line 7
    .line 8
    invoke-super {p0}, Landroid/view/View;->onSaveInstanceState()Landroid/os/Parcelable;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 13
    .line 14
    .line 15
    const-string v1, "progress"

    .line 16
    .line 17
    iget v2, p0, Lcom/xw/repo/BubbleSeekBar;->e:F

    .line 18
    .line 19
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 20
    .line 21
    .line 22
    return-object v0
.end method

.method public onSizeChanged(IIII)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Lcom/xw/repo/BubbleSeekBar$a;

    .line 5
    .line 6
    invoke-direct {p1, p0}, Lcom/xw/repo/BubbleSeekBar$a;-><init>(Lcom/xw/repo/BubbleSeekBar;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 5

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    if-eqz v0, :cond_c

    .line 8
    .line 9
    if-eq v0, v2, :cond_6

    .line 10
    .line 11
    const/4 v3, 0x2

    .line 12
    if-eq v0, v3, :cond_0

    .line 13
    .line 14
    const/4 v3, 0x3

    .line 15
    if-eq v0, v3, :cond_6

    .line 16
    .line 17
    goto/16 :goto_6

    .line 18
    .line 19
    :cond_0
    iget-boolean v0, p0, Lcom/xw/repo/BubbleSeekBar;->P:Z

    .line 20
    .line 21
    if-eqz v0, :cond_18

    .line 22
    .line 23
    iget-boolean v0, p0, Lcom/xw/repo/BubbleSeekBar;->A:Z

    .line 24
    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    invoke-virtual {p0, v0}, Lcom/xw/repo/BubbleSeekBar;->A(F)F

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    iget v3, p0, Lcom/xw/repo/BubbleSeekBar;->T:F

    .line 36
    .line 37
    cmpl-float v3, v0, v3

    .line 38
    .line 39
    if-eqz v3, :cond_18

    .line 40
    .line 41
    iput v0, p0, Lcom/xw/repo/BubbleSeekBar;->T:F

    .line 42
    .line 43
    iput v0, p0, Lcom/xw/repo/BubbleSeekBar;->M:F

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    iget v3, p0, Lcom/xw/repo/BubbleSeekBar;->r0:F

    .line 51
    .line 52
    add-float/2addr v0, v3

    .line 53
    iput v0, p0, Lcom/xw/repo/BubbleSeekBar;->M:F

    .line 54
    .line 55
    iget v3, p0, Lcom/xw/repo/BubbleSeekBar;->V:F

    .line 56
    .line 57
    cmpg-float v0, v0, v3

    .line 58
    .line 59
    if-gez v0, :cond_2

    .line 60
    .line 61
    iput v3, p0, Lcom/xw/repo/BubbleSeekBar;->M:F

    .line 62
    .line 63
    :cond_2
    iget v0, p0, Lcom/xw/repo/BubbleSeekBar;->M:F

    .line 64
    .line 65
    iget v3, p0, Lcom/xw/repo/BubbleSeekBar;->W:F

    .line 66
    .line 67
    cmpl-float v0, v0, v3

    .line 68
    .line 69
    if-lez v0, :cond_3

    .line 70
    .line 71
    iput v3, p0, Lcom/xw/repo/BubbleSeekBar;->M:F

    .line 72
    .line 73
    :cond_3
    :goto_0
    invoke-virtual {p0}, Lcom/xw/repo/BubbleSeekBar;->C()F

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    iput v0, p0, Lcom/xw/repo/BubbleSeekBar;->e:F

    .line 78
    .line 79
    iget-boolean v0, p0, Lcom/xw/repo/BubbleSeekBar;->F:Z

    .line 80
    .line 81
    if-nez v0, :cond_5

    .line 82
    .line 83
    iget-object v0, p0, Lcom/xw/repo/BubbleSeekBar;->h0:Lcom/xw/repo/BubbleSeekBar$i;

    .line 84
    .line 85
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    if-eqz v0, :cond_5

    .line 90
    .line 91
    invoke-virtual {p0}, Lcom/xw/repo/BubbleSeekBar;->B()F

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    iput v0, p0, Lcom/xw/repo/BubbleSeekBar;->l0:F

    .line 96
    .line 97
    iget-object v3, p0, Lcom/xw/repo/BubbleSeekBar;->m0:Landroid/view/WindowManager$LayoutParams;

    .line 98
    .line 99
    const/high16 v4, 0x3f000000    # 0.5f

    .line 100
    .line 101
    add-float/2addr v0, v4

    .line 102
    float-to-int v0, v0

    .line 103
    iput v0, v3, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 104
    .line 105
    iget-object v0, p0, Lcom/xw/repo/BubbleSeekBar;->g0:Landroid/view/WindowManager;

    .line 106
    .line 107
    iget-object v4, p0, Lcom/xw/repo/BubbleSeekBar;->h0:Lcom/xw/repo/BubbleSeekBar$i;

    .line 108
    .line 109
    invoke-interface {v0, v4, v3}, Landroid/view/ViewManager;->updateViewLayout(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 110
    .line 111
    .line 112
    iget-object v0, p0, Lcom/xw/repo/BubbleSeekBar;->h0:Lcom/xw/repo/BubbleSeekBar$i;

    .line 113
    .line 114
    iget-boolean v3, p0, Lcom/xw/repo/BubbleSeekBar;->y:Z

    .line 115
    .line 116
    if-eqz v3, :cond_4

    .line 117
    .line 118
    invoke-virtual {p0}, Lcom/xw/repo/BubbleSeekBar;->getProgressFloat()F

    .line 119
    .line 120
    .line 121
    move-result v3

    .line 122
    invoke-static {v3}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    goto :goto_1

    .line 127
    :cond_4
    invoke-virtual {p0}, Lcom/xw/repo/BubbleSeekBar;->getProgress()I

    .line 128
    .line 129
    .line 130
    move-result v3

    .line 131
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v3

    .line 135
    :goto_1
    invoke-virtual {v0, v3}, Lcom/xw/repo/BubbleSeekBar$i;->a(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    goto :goto_2

    .line 139
    :cond_5
    invoke-virtual {p0}, Lcom/xw/repo/BubbleSeekBar;->M()F

    .line 140
    .line 141
    .line 142
    :goto_2
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 143
    .line 144
    .line 145
    goto/16 :goto_6

    .line 146
    .line 147
    :cond_6
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    invoke-interface {v0, v1}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 152
    .line 153
    .line 154
    iget-boolean v0, p0, Lcom/xw/repo/BubbleSeekBar;->p:Z

    .line 155
    .line 156
    if-eqz v0, :cond_8

    .line 157
    .line 158
    iget-boolean v0, p0, Lcom/xw/repo/BubbleSeekBar;->z:Z

    .line 159
    .line 160
    if-eqz v0, :cond_7

    .line 161
    .line 162
    new-instance v0, Lcom/xw/repo/BubbleSeekBar$b;

    .line 163
    .line 164
    invoke-direct {v0, p0}, Lcom/xw/repo/BubbleSeekBar$b;-><init>(Lcom/xw/repo/BubbleSeekBar;)V

    .line 165
    .line 166
    .line 167
    iget-wide v3, p0, Lcom/xw/repo/BubbleSeekBar;->C:J

    .line 168
    .line 169
    invoke-virtual {p0, v0, v3, v4}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 170
    .line 171
    .line 172
    goto/16 :goto_6

    .line 173
    .line 174
    :cond_7
    invoke-virtual {p0}, Lcom/xw/repo/BubbleSeekBar;->z()V

    .line 175
    .line 176
    .line 177
    goto/16 :goto_6

    .line 178
    .line 179
    :cond_8
    iget-boolean v0, p0, Lcom/xw/repo/BubbleSeekBar;->P:Z

    .line 180
    .line 181
    if-nez v0, :cond_9

    .line 182
    .line 183
    iget-boolean v0, p0, Lcom/xw/repo/BubbleSeekBar;->z:Z

    .line 184
    .line 185
    if-eqz v0, :cond_18

    .line 186
    .line 187
    :cond_9
    iget-boolean v0, p0, Lcom/xw/repo/BubbleSeekBar;->F:Z

    .line 188
    .line 189
    if-eqz v0, :cond_b

    .line 190
    .line 191
    invoke-virtual {p0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    iget-wide v3, p0, Lcom/xw/repo/BubbleSeekBar;->C:J

    .line 196
    .line 197
    invoke-virtual {v0, v3, v4}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    iget-boolean v3, p0, Lcom/xw/repo/BubbleSeekBar;->P:Z

    .line 202
    .line 203
    if-nez v3, :cond_a

    .line 204
    .line 205
    iget-boolean v3, p0, Lcom/xw/repo/BubbleSeekBar;->z:Z

    .line 206
    .line 207
    if-eqz v3, :cond_a

    .line 208
    .line 209
    const-wide/16 v3, 0x12c

    .line 210
    .line 211
    goto :goto_3

    .line 212
    :cond_a
    const-wide/16 v3, 0x0

    .line 213
    .line 214
    :goto_3
    invoke-virtual {v0, v3, v4}, Landroid/view/ViewPropertyAnimator;->setStartDelay(J)Landroid/view/ViewPropertyAnimator;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    new-instance v3, Lcom/xw/repo/BubbleSeekBar$c;

    .line 219
    .line 220
    invoke-direct {v3, p0}, Lcom/xw/repo/BubbleSeekBar$c;-><init>(Lcom/xw/repo/BubbleSeekBar;)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v0, v3}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 228
    .line 229
    .line 230
    goto/16 :goto_6

    .line 231
    .line 232
    :cond_b
    new-instance v0, Lcom/xw/repo/BubbleSeekBar$d;

    .line 233
    .line 234
    invoke-direct {v0, p0}, Lcom/xw/repo/BubbleSeekBar$d;-><init>(Lcom/xw/repo/BubbleSeekBar;)V

    .line 235
    .line 236
    .line 237
    iget-wide v3, p0, Lcom/xw/repo/BubbleSeekBar;->C:J

    .line 238
    .line 239
    invoke-virtual {p0, v0, v3, v4}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 240
    .line 241
    .line 242
    goto/16 :goto_6

    .line 243
    .line 244
    :cond_c
    invoke-virtual {p0}, Lcom/xw/repo/BubbleSeekBar;->performClick()Z

    .line 245
    .line 246
    .line 247
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    invoke-interface {v0, v2}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 252
    .line 253
    .line 254
    invoke-virtual {p0, p1}, Lcom/xw/repo/BubbleSeekBar;->J(Landroid/view/MotionEvent;)Z

    .line 255
    .line 256
    .line 257
    move-result v0

    .line 258
    iput-boolean v0, p0, Lcom/xw/repo/BubbleSeekBar;->P:Z

    .line 259
    .line 260
    if-eqz v0, :cond_10

    .line 261
    .line 262
    iget-boolean v0, p0, Lcom/xw/repo/BubbleSeekBar;->B:Z

    .line 263
    .line 264
    if-eqz v0, :cond_d

    .line 265
    .line 266
    iget-boolean v0, p0, Lcom/xw/repo/BubbleSeekBar;->U:Z

    .line 267
    .line 268
    if-nez v0, :cond_d

    .line 269
    .line 270
    iput-boolean v2, p0, Lcom/xw/repo/BubbleSeekBar;->U:Z

    .line 271
    .line 272
    :cond_d
    iget-boolean v0, p0, Lcom/xw/repo/BubbleSeekBar;->D:Z

    .line 273
    .line 274
    if-eqz v0, :cond_e

    .line 275
    .line 276
    iget-boolean v0, p0, Lcom/xw/repo/BubbleSeekBar;->R:Z

    .line 277
    .line 278
    if-nez v0, :cond_e

    .line 279
    .line 280
    iput-boolean v2, p0, Lcom/xw/repo/BubbleSeekBar;->R:Z

    .line 281
    .line 282
    :cond_e
    iget-boolean v0, p0, Lcom/xw/repo/BubbleSeekBar;->F:Z

    .line 283
    .line 284
    if-nez v0, :cond_f

    .line 285
    .line 286
    invoke-virtual {p0}, Lcom/xw/repo/BubbleSeekBar;->N()V

    .line 287
    .line 288
    .line 289
    :cond_f
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 290
    .line 291
    .line 292
    goto :goto_5

    .line 293
    :cond_10
    iget-boolean v0, p0, Lcom/xw/repo/BubbleSeekBar;->z:Z

    .line 294
    .line 295
    if-eqz v0, :cond_17

    .line 296
    .line 297
    invoke-virtual {p0, p1}, Lcom/xw/repo/BubbleSeekBar;->K(Landroid/view/MotionEvent;)Z

    .line 298
    .line 299
    .line 300
    move-result v0

    .line 301
    if-eqz v0, :cond_17

    .line 302
    .line 303
    iput-boolean v2, p0, Lcom/xw/repo/BubbleSeekBar;->P:Z

    .line 304
    .line 305
    iget-boolean v0, p0, Lcom/xw/repo/BubbleSeekBar;->B:Z

    .line 306
    .line 307
    if-eqz v0, :cond_11

    .line 308
    .line 309
    iget-boolean v0, p0, Lcom/xw/repo/BubbleSeekBar;->U:Z

    .line 310
    .line 311
    if-nez v0, :cond_11

    .line 312
    .line 313
    iput-boolean v2, p0, Lcom/xw/repo/BubbleSeekBar;->U:Z

    .line 314
    .line 315
    :cond_11
    iget-boolean v0, p0, Lcom/xw/repo/BubbleSeekBar;->D:Z

    .line 316
    .line 317
    if-eqz v0, :cond_12

    .line 318
    .line 319
    invoke-virtual {p0}, Lcom/xw/repo/BubbleSeekBar;->G()V

    .line 320
    .line 321
    .line 322
    iput-boolean v2, p0, Lcom/xw/repo/BubbleSeekBar;->R:Z

    .line 323
    .line 324
    :cond_12
    iget-boolean v0, p0, Lcom/xw/repo/BubbleSeekBar;->A:Z

    .line 325
    .line 326
    if-eqz v0, :cond_13

    .line 327
    .line 328
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 329
    .line 330
    .line 331
    move-result v0

    .line 332
    invoke-virtual {p0, v0}, Lcom/xw/repo/BubbleSeekBar;->A(F)F

    .line 333
    .line 334
    .line 335
    move-result v0

    .line 336
    iput v0, p0, Lcom/xw/repo/BubbleSeekBar;->T:F

    .line 337
    .line 338
    iput v0, p0, Lcom/xw/repo/BubbleSeekBar;->M:F

    .line 339
    .line 340
    goto :goto_4

    .line 341
    :cond_13
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 342
    .line 343
    .line 344
    move-result v0

    .line 345
    iput v0, p0, Lcom/xw/repo/BubbleSeekBar;->M:F

    .line 346
    .line 347
    iget v3, p0, Lcom/xw/repo/BubbleSeekBar;->V:F

    .line 348
    .line 349
    cmpg-float v0, v0, v3

    .line 350
    .line 351
    if-gez v0, :cond_14

    .line 352
    .line 353
    iput v3, p0, Lcom/xw/repo/BubbleSeekBar;->M:F

    .line 354
    .line 355
    :cond_14
    iget v0, p0, Lcom/xw/repo/BubbleSeekBar;->M:F

    .line 356
    .line 357
    iget v3, p0, Lcom/xw/repo/BubbleSeekBar;->W:F

    .line 358
    .line 359
    cmpl-float v0, v0, v3

    .line 360
    .line 361
    if-lez v0, :cond_15

    .line 362
    .line 363
    iput v3, p0, Lcom/xw/repo/BubbleSeekBar;->M:F

    .line 364
    .line 365
    :cond_15
    :goto_4
    invoke-virtual {p0}, Lcom/xw/repo/BubbleSeekBar;->C()F

    .line 366
    .line 367
    .line 368
    move-result v0

    .line 369
    iput v0, p0, Lcom/xw/repo/BubbleSeekBar;->e:F

    .line 370
    .line 371
    iget-boolean v0, p0, Lcom/xw/repo/BubbleSeekBar;->F:Z

    .line 372
    .line 373
    if-nez v0, :cond_16

    .line 374
    .line 375
    invoke-virtual {p0}, Lcom/xw/repo/BubbleSeekBar;->B()F

    .line 376
    .line 377
    .line 378
    move-result v0

    .line 379
    iput v0, p0, Lcom/xw/repo/BubbleSeekBar;->l0:F

    .line 380
    .line 381
    invoke-virtual {p0}, Lcom/xw/repo/BubbleSeekBar;->N()V

    .line 382
    .line 383
    .line 384
    :cond_16
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 385
    .line 386
    .line 387
    :cond_17
    :goto_5
    iget v0, p0, Lcom/xw/repo/BubbleSeekBar;->M:F

    .line 388
    .line 389
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 390
    .line 391
    .line 392
    move-result v3

    .line 393
    sub-float/2addr v0, v3

    .line 394
    iput v0, p0, Lcom/xw/repo/BubbleSeekBar;->r0:F

    .line 395
    .line 396
    :cond_18
    :goto_6
    iget-boolean v0, p0, Lcom/xw/repo/BubbleSeekBar;->P:Z

    .line 397
    .line 398
    if-nez v0, :cond_1a

    .line 399
    .line 400
    iget-boolean v0, p0, Lcom/xw/repo/BubbleSeekBar;->z:Z

    .line 401
    .line 402
    if-nez v0, :cond_1a

    .line 403
    .line 404
    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 405
    .line 406
    .line 407
    move-result p1

    .line 408
    if-eqz p1, :cond_19

    .line 409
    .line 410
    goto :goto_7

    .line 411
    :cond_19
    return v1

    .line 412
    :cond_1a
    :goto_7
    return v2
.end method

.method public onVisibilityChanged(Landroid/view/View;I)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/xw/repo/BubbleSeekBar;->F:Z

    .line 2
    .line 3
    if-nez v0, :cond_3

    .line 4
    .line 5
    iget-boolean v0, p0, Lcom/xw/repo/BubbleSeekBar;->D:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_0
    if-eqz p2, :cond_1

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/xw/repo/BubbleSeekBar;->G()V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    iget-boolean v0, p0, Lcom/xw/repo/BubbleSeekBar;->R:Z

    .line 17
    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/xw/repo/BubbleSeekBar;->N()V

    .line 21
    .line 22
    .line 23
    :cond_2
    :goto_0
    invoke-super {p0, p1, p2}, Landroid/view/View;->onVisibilityChanged(Landroid/view/View;I)V

    .line 24
    .line 25
    .line 26
    :cond_3
    :goto_1
    return-void
.end method

.method public performClick()Z
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/view/View;->performClick()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public setBubbleColor(I)V
    .locals 1
    .param p1    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param

    .line 1
    iget v0, p0, Lcom/xw/repo/BubbleSeekBar;->H:I

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput p1, p0, Lcom/xw/repo/BubbleSeekBar;->H:I

    .line 6
    .line 7
    iget-object p1, p0, Lcom/xw/repo/BubbleSeekBar;->h0:Lcom/xw/repo/BubbleSeekBar$i;

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public setCustomSectionTextArray(Lcom/xw/repo/BubbleSeekBar$j;)V
    .locals 3
    .param p1    # Lcom/xw/repo/BubbleSeekBar$j;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iget v0, p0, Lcom/xw/repo/BubbleSeekBar;->n:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/xw/repo/BubbleSeekBar;->S:Landroid/util/SparseArray;

    .line 4
    .line 5
    invoke-interface {p1, v0, v1}, Lcom/xw/repo/BubbleSeekBar$j;->a(ILandroid/util/SparseArray;)Landroid/util/SparseArray;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iput-object p1, p0, Lcom/xw/repo/BubbleSeekBar;->S:Landroid/util/SparseArray;

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    move v0, p1

    .line 13
    :goto_0
    iget v1, p0, Lcom/xw/repo/BubbleSeekBar;->n:I

    .line 14
    .line 15
    if-gt v0, v1, :cond_1

    .line 16
    .line 17
    iget-object v1, p0, Lcom/xw/repo/BubbleSeekBar;->S:Landroid/util/SparseArray;

    .line 18
    .line 19
    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    if-nez v1, :cond_0

    .line 24
    .line 25
    iget-object v1, p0, Lcom/xw/repo/BubbleSeekBar;->S:Landroid/util/SparseArray;

    .line 26
    .line 27
    const-string v2, ""

    .line 28
    .line 29
    invoke-virtual {v1, v0, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    iput-boolean p1, p0, Lcom/xw/repo/BubbleSeekBar;->v:Z

    .line 36
    .line 37
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public setOnProgressChangedListener(Lcom/xw/repo/BubbleSeekBar$k;)V
    .locals 0

    return-void
.end method

.method public setProgress(F)V
    .locals 2

    .line 1
    iput p1, p0, Lcom/xw/repo/BubbleSeekBar;->e:F

    .line 2
    .line 3
    iget-boolean p1, p0, Lcom/xw/repo/BubbleSeekBar;->F:Z

    .line 4
    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/xw/repo/BubbleSeekBar;->B()F

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    iput p1, p0, Lcom/xw/repo/BubbleSeekBar;->l0:F

    .line 12
    .line 13
    :cond_0
    iget-boolean p1, p0, Lcom/xw/repo/BubbleSeekBar;->D:Z

    .line 14
    .line 15
    if-eqz p1, :cond_1

    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/xw/repo/BubbleSeekBar;->G()V

    .line 18
    .line 19
    .line 20
    new-instance p1, Lcom/xw/repo/BubbleSeekBar$h;

    .line 21
    .line 22
    invoke-direct {p1, p0}, Lcom/xw/repo/BubbleSeekBar$h;-><init>(Lcom/xw/repo/BubbleSeekBar;)V

    .line 23
    .line 24
    .line 25
    iget-wide v0, p0, Lcom/xw/repo/BubbleSeekBar;->E:J

    .line 26
    .line 27
    invoke-virtual {p0, p1, v0, v1}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 28
    .line 29
    .line 30
    :cond_1
    iget-boolean p1, p0, Lcom/xw/repo/BubbleSeekBar;->B:Z

    .line 31
    .line 32
    if-eqz p1, :cond_2

    .line 33
    .line 34
    const/4 p1, 0x0

    .line 35
    iput-boolean p1, p0, Lcom/xw/repo/BubbleSeekBar;->U:Z

    .line 36
    .line 37
    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public setSecondTrackColor(I)V
    .locals 1
    .param p1    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param

    .line 1
    iget v0, p0, Lcom/xw/repo/BubbleSeekBar;->l:I

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput p1, p0, Lcom/xw/repo/BubbleSeekBar;->l:I

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public setThumbColor(I)V
    .locals 1
    .param p1    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param

    .line 1
    iget v0, p0, Lcom/xw/repo/BubbleSeekBar;->m:I

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput p1, p0, Lcom/xw/repo/BubbleSeekBar;->m:I

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public setTrackColor(I)V
    .locals 1
    .param p1    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param

    .line 1
    iget v0, p0, Lcom/xw/repo/BubbleSeekBar;->k:I

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput p1, p0, Lcom/xw/repo/BubbleSeekBar;->k:I

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public final z()V
    .locals 12

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    move v3, v0

    .line 4
    move v2, v1

    .line 5
    :goto_0
    iget v4, p0, Lcom/xw/repo/BubbleSeekBar;->n:I

    .line 6
    .line 7
    if-gt v2, v4, :cond_1

    .line 8
    .line 9
    int-to-float v3, v2

    .line 10
    iget v4, p0, Lcom/xw/repo/BubbleSeekBar;->O:F

    .line 11
    .line 12
    mul-float/2addr v3, v4

    .line 13
    iget v5, p0, Lcom/xw/repo/BubbleSeekBar;->V:F

    .line 14
    .line 15
    add-float/2addr v3, v5

    .line 16
    iget v5, p0, Lcom/xw/repo/BubbleSeekBar;->M:F

    .line 17
    .line 18
    cmpg-float v6, v3, v5

    .line 19
    .line 20
    if-gtz v6, :cond_0

    .line 21
    .line 22
    sub-float/2addr v5, v3

    .line 23
    cmpg-float v4, v5, v4

    .line 24
    .line 25
    if-gtz v4, :cond_0

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    :goto_1
    iget v4, p0, Lcom/xw/repo/BubbleSeekBar;->M:F

    .line 32
    .line 33
    float-to-double v4, v4

    .line 34
    invoke-static {v4, v5}, Ljava/math/BigDecimal;->valueOf(D)Ljava/math/BigDecimal;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    const/4 v5, 0x4

    .line 39
    const/4 v6, 0x1

    .line 40
    invoke-virtual {v4, v6, v5}, Ljava/math/BigDecimal;->setScale(II)Ljava/math/BigDecimal;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    invoke-virtual {v4}, Ljava/math/BigDecimal;->floatValue()F

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    cmpl-float v4, v4, v3

    .line 49
    .line 50
    if-nez v4, :cond_2

    .line 51
    .line 52
    move v4, v6

    .line 53
    goto :goto_2

    .line 54
    :cond_2
    move v4, v1

    .line 55
    :goto_2
    new-instance v5, Landroid/animation/AnimatorSet;

    .line 56
    .line 57
    invoke-direct {v5}, Landroid/animation/AnimatorSet;-><init>()V

    .line 58
    .line 59
    .line 60
    const/4 v7, 0x2

    .line 61
    if-nez v4, :cond_4

    .line 62
    .line 63
    iget v8, p0, Lcom/xw/repo/BubbleSeekBar;->M:F

    .line 64
    .line 65
    sub-float v9, v8, v3

    .line 66
    .line 67
    iget v10, p0, Lcom/xw/repo/BubbleSeekBar;->O:F

    .line 68
    .line 69
    const/high16 v11, 0x40000000    # 2.0f

    .line 70
    .line 71
    div-float v11, v10, v11

    .line 72
    .line 73
    cmpg-float v9, v9, v11

    .line 74
    .line 75
    if-gtz v9, :cond_3

    .line 76
    .line 77
    new-array v2, v7, [F

    .line 78
    .line 79
    aput v8, v2, v1

    .line 80
    .line 81
    aput v3, v2, v6

    .line 82
    .line 83
    invoke-static {v2}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    goto :goto_3

    .line 88
    :cond_3
    add-int/2addr v2, v6

    .line 89
    int-to-float v2, v2

    .line 90
    mul-float/2addr v2, v10

    .line 91
    iget v3, p0, Lcom/xw/repo/BubbleSeekBar;->V:F

    .line 92
    .line 93
    add-float/2addr v2, v3

    .line 94
    new-array v3, v7, [F

    .line 95
    .line 96
    aput v8, v3, v1

    .line 97
    .line 98
    aput v2, v3, v6

    .line 99
    .line 100
    invoke-static {v3}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    :goto_3
    new-instance v3, Landroid/view/animation/LinearInterpolator;

    .line 105
    .line 106
    invoke-direct {v3}, Landroid/view/animation/LinearInterpolator;-><init>()V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v2, v3}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 110
    .line 111
    .line 112
    new-instance v3, Lcom/xw/repo/BubbleSeekBar$e;

    .line 113
    .line 114
    invoke-direct {v3, p0}, Lcom/xw/repo/BubbleSeekBar$e;-><init>(Lcom/xw/repo/BubbleSeekBar;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v2, v3}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 118
    .line 119
    .line 120
    goto :goto_4

    .line 121
    :cond_4
    const/4 v2, 0x0

    .line 122
    :goto_4
    iget-boolean v3, p0, Lcom/xw/repo/BubbleSeekBar;->F:Z

    .line 123
    .line 124
    if-eqz v3, :cond_5

    .line 125
    .line 126
    if-nez v4, :cond_8

    .line 127
    .line 128
    iget-wide v3, p0, Lcom/xw/repo/BubbleSeekBar;->C:J

    .line 129
    .line 130
    invoke-virtual {v5, v3, v4}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    new-array v3, v6, [Landroid/animation/Animator;

    .line 135
    .line 136
    aput-object v2, v3, v1

    .line 137
    .line 138
    invoke-virtual {v0, v3}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 139
    .line 140
    .line 141
    goto :goto_5

    .line 142
    :cond_5
    iget-object v3, p0, Lcom/xw/repo/BubbleSeekBar;->h0:Lcom/xw/repo/BubbleSeekBar$i;

    .line 143
    .line 144
    iget-boolean v8, p0, Lcom/xw/repo/BubbleSeekBar;->D:Z

    .line 145
    .line 146
    if-eqz v8, :cond_6

    .line 147
    .line 148
    const/high16 v0, 0x3f800000    # 1.0f

    .line 149
    .line 150
    :cond_6
    new-array v8, v6, [F

    .line 151
    .line 152
    aput v0, v8, v1

    .line 153
    .line 154
    sget-object v0, Landroid/view/View;->ALPHA:Landroid/util/Property;

    .line 155
    .line 156
    invoke-static {v3, v0, v8}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    if-eqz v4, :cond_7

    .line 161
    .line 162
    iget-wide v1, p0, Lcom/xw/repo/BubbleSeekBar;->C:J

    .line 163
    .line 164
    invoke-virtual {v5, v1, v2}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    invoke-virtual {v1, v0}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 169
    .line 170
    .line 171
    goto :goto_5

    .line 172
    :cond_7
    iget-wide v3, p0, Lcom/xw/repo/BubbleSeekBar;->C:J

    .line 173
    .line 174
    invoke-virtual {v5, v3, v4}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    .line 175
    .line 176
    .line 177
    move-result-object v3

    .line 178
    new-array v4, v7, [Landroid/animation/Animator;

    .line 179
    .line 180
    aput-object v2, v4, v1

    .line 181
    .line 182
    aput-object v0, v4, v6

    .line 183
    .line 184
    invoke-virtual {v3, v4}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 185
    .line 186
    .line 187
    :cond_8
    :goto_5
    new-instance v0, Lcom/xw/repo/BubbleSeekBar$f;

    .line 188
    .line 189
    invoke-direct {v0, p0}, Lcom/xw/repo/BubbleSeekBar$f;-><init>(Lcom/xw/repo/BubbleSeekBar;)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v5, v0}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v5}, Landroid/animation/AnimatorSet;->start()V

    .line 196
    .line 197
    .line 198
    return-void
.end method
