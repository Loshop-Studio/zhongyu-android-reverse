.class public Lcom/xw/repo/BubbleSeekBar;
.super Landroid/view/View;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xw/repo/BubbleSeekBar$TextPosition;
    }
.end annotation


# static fields
.field public static final synthetic o0:I


# instance fields
.field public final A:J

.field public final B:Z

.field public final C:J

.field public final D:Z

.field public final E:Z

.field public F:I

.field public final G:I

.field public final H:I

.field public final I:F

.field public final J:F

.field public K:F

.field public L:F

.field public M:F

.field public N:Z

.field public final O:I

.field public P:Z

.field public Q:Landroid/util/SparseArray;

.field public R:F

.field public S:Z

.field public T:F

.field public U:F

.field public final V:Landroid/graphics/Paint;

.field public final W:Landroid/graphics/Rect;

.field public final a:F

.field public final b:F

.field public c:F

.field public final c0:Landroid/view/WindowManager;

.field public final d:Z

.field public final d0:Lw3/d;

.field public final e:I

.field public final e0:I

.field public final f:I

.field public f0:F

.field public final g:I

.field public g0:F

.field public final h:I

.field public h0:F

.field public i:I

.field public final i0:Landroid/view/WindowManager$LayoutParams;

.field public j:I

.field public final j0:[I

.field public k:I

.field public k0:Z

.field public final l:I

.field public l0:F

.field public final m:Z

.field public m0:Lw3/a;

.field public final n:Z

.field public n0:F

.field public final o:Z

.field public final p:I

.field public final q:I

.field public final r:I

.field public final s:I

.field public t:Z

.field public final u:I

.field public final v:I

.field public final w:Z

.field public final x:Z

.field public final y:Z

.field public final z:Z


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
    .locals 11

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 v0, -0x1

    .line 4
    iput v0, p0, Lcom/xw/repo/BubbleSeekBar;->r:I

    .line 5
    new-instance v1, Landroid/util/SparseArray;

    invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V

    iput-object v1, p0, Lcom/xw/repo/BubbleSeekBar;->Q:Landroid/util/SparseArray;

    const/4 v1, 0x2

    .line 6
    new-array v2, v1, [I

    iput-object v2, p0, Lcom/xw/repo/BubbleSeekBar;->j0:[I

    const/4 v2, 0x1

    .line 7
    iput-boolean v2, p0, Lcom/xw/repo/BubbleSeekBar;->k0:Z

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

    iput p3, p0, Lcom/xw/repo/BubbleSeekBar;->a:F

    .line 10
    sget p3, Lcom/xw/repo/bubbleseekbar/R$styleable;->BubbleSeekBar_bsb_max:I

    const/high16 v5, 0x42c80000    # 100.0f

    invoke-virtual {p2, p3, v5}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result p3

    iput p3, p0, Lcom/xw/repo/BubbleSeekBar;->b:F

    .line 11
    sget p3, Lcom/xw/repo/bubbleseekbar/R$styleable;->BubbleSeekBar_bsb_progress:I

    iget v6, p0, Lcom/xw/repo/BubbleSeekBar;->a:F

    invoke-virtual {p2, p3, v6}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result p3

    iput p3, p0, Lcom/xw/repo/BubbleSeekBar;->c:F

    .line 12
    sget p3, Lcom/xw/repo/bubbleseekbar/R$styleable;->BubbleSeekBar_bsb_is_float_type:I

    invoke-virtual {p2, p3, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p3

    iput-boolean p3, p0, Lcom/xw/repo/BubbleSeekBar;->d:Z

    .line 13
    sget p3, Lcom/xw/repo/bubbleseekbar/R$styleable;->BubbleSeekBar_bsb_track_size:I

    invoke-static {v1}, Lw3/g;->a(I)I

    move-result v6

    invoke-virtual {p2, p3, v6}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p3

    iput p3, p0, Lcom/xw/repo/BubbleSeekBar;->e:I

    .line 14
    sget v6, Lcom/xw/repo/bubbleseekbar/R$styleable;->BubbleSeekBar_bsb_second_track_size:I

    .line 15
    invoke-static {v1}, Lw3/g;->a(I)I

    move-result v7

    add-int/2addr v7, p3

    .line 16
    invoke-virtual {p2, v6, v7}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v6

    iput v6, p0, Lcom/xw/repo/BubbleSeekBar;->f:I

    .line 17
    sget v7, Lcom/xw/repo/bubbleseekbar/R$styleable;->BubbleSeekBar_bsb_thumb_radius:I

    .line 18
    invoke-static {v1}, Lw3/g;->a(I)I

    move-result v8

    add-int/2addr v8, v6

    .line 19
    invoke-virtual {p2, v7, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v6

    iput v6, p0, Lcom/xw/repo/BubbleSeekBar;->g:I

    .line 20
    sget v6, Lcom/xw/repo/bubbleseekbar/R$styleable;->BubbleSeekBar_bsb_thumb_radius_on_dragging:I

    iget v7, p0, Lcom/xw/repo/BubbleSeekBar;->f:I

    mul-int/2addr v7, v1

    invoke-virtual {p2, v6, v7}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v6

    iput v6, p0, Lcom/xw/repo/BubbleSeekBar;->h:I

    .line 21
    sget v6, Lcom/xw/repo/bubbleseekbar/R$styleable;->BubbleSeekBar_bsb_section_count:I

    const/16 v7, 0xa

    invoke-virtual {p2, v6, v7}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v6

    iput v6, p0, Lcom/xw/repo/BubbleSeekBar;->l:I

    .line 22
    sget v6, Lcom/xw/repo/bubbleseekbar/R$styleable;->BubbleSeekBar_bsb_track_color:I

    sget v8, Lcom/xw/repo/bubbleseekbar/R$color;->colorPrimary:I

    .line 23
    invoke-static {p1, v8}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v8

    .line 24
    invoke-virtual {p2, v6, v8}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v6

    iput v6, p0, Lcom/xw/repo/BubbleSeekBar;->i:I

    .line 25
    sget v6, Lcom/xw/repo/bubbleseekbar/R$styleable;->BubbleSeekBar_bsb_second_track_color:I

    sget v8, Lcom/xw/repo/bubbleseekbar/R$color;->colorAccent:I

    .line 26
    invoke-static {p1, v8}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v8

    .line 27
    invoke-virtual {p2, v6, v8}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v6

    iput v6, p0, Lcom/xw/repo/BubbleSeekBar;->j:I

    .line 28
    sget v8, Lcom/xw/repo/bubbleseekbar/R$styleable;->BubbleSeekBar_bsb_thumb_color:I

    invoke-virtual {p2, v8, v6}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v6

    iput v6, p0, Lcom/xw/repo/BubbleSeekBar;->k:I

    .line 29
    sget v6, Lcom/xw/repo/bubbleseekbar/R$styleable;->BubbleSeekBar_bsb_show_section_text:I

    invoke-virtual {p2, v6, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v6

    iput-boolean v6, p0, Lcom/xw/repo/BubbleSeekBar;->o:Z

    .line 30
    sget v6, Lcom/xw/repo/bubbleseekbar/R$styleable;->BubbleSeekBar_bsb_section_text_size:I

    const/16 v8, 0xe

    int-to-float v9, v8

    .line 31
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v10

    invoke-virtual {v10}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v10

    .line 32
    invoke-static {v1, v9, v10}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v10

    float-to-int v10, v10

    .line 33
    invoke-virtual {p2, v6, v10}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v6

    iput v6, p0, Lcom/xw/repo/BubbleSeekBar;->p:I

    .line 34
    sget v6, Lcom/xw/repo/bubbleseekbar/R$styleable;->BubbleSeekBar_bsb_section_text_color:I

    iget v10, p0, Lcom/xw/repo/BubbleSeekBar;->i:I

    invoke-virtual {p2, v6, v10}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v6

    iput v6, p0, Lcom/xw/repo/BubbleSeekBar;->q:I

    .line 35
    sget v6, Lcom/xw/repo/bubbleseekbar/R$styleable;->BubbleSeekBar_bsb_seek_step_section:I

    invoke-virtual {p2, v6, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v6

    iput-boolean v6, p0, Lcom/xw/repo/BubbleSeekBar;->y:Z

    .line 36
    sget v6, Lcom/xw/repo/bubbleseekbar/R$styleable;->BubbleSeekBar_bsb_seek_by_section:I

    invoke-virtual {p2, v6, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v6

    iput-boolean v6, p0, Lcom/xw/repo/BubbleSeekBar;->z:Z

    .line 37
    sget v6, Lcom/xw/repo/bubbleseekbar/R$styleable;->BubbleSeekBar_bsb_section_text_position:I

    invoke-virtual {p2, v6, v0}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v6

    if-nez v6, :cond_0

    .line 38
    iput v4, p0, Lcom/xw/repo/BubbleSeekBar;->r:I

    goto :goto_0

    :cond_0
    if-ne v6, v2, :cond_1

    .line 39
    iput v2, p0, Lcom/xw/repo/BubbleSeekBar;->r:I

    goto :goto_0

    :cond_1
    if-ne v6, v1, :cond_2

    .line 40
    iput v1, p0, Lcom/xw/repo/BubbleSeekBar;->r:I

    goto :goto_0

    .line 41
    :cond_2
    iput v0, p0, Lcom/xw/repo/BubbleSeekBar;->r:I

    .line 42
    :goto_0
    sget v6, Lcom/xw/repo/bubbleseekbar/R$styleable;->BubbleSeekBar_bsb_section_text_interval:I

    invoke-virtual {p2, v6, v2}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v6

    iput v6, p0, Lcom/xw/repo/BubbleSeekBar;->s:I

    .line 43
    sget v6, Lcom/xw/repo/bubbleseekbar/R$styleable;->BubbleSeekBar_bsb_show_thumb_text:I

    invoke-virtual {p2, v6, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v6

    iput-boolean v6, p0, Lcom/xw/repo/BubbleSeekBar;->t:Z

    .line 44
    sget v6, Lcom/xw/repo/bubbleseekbar/R$styleable;->BubbleSeekBar_bsb_thumb_text_size:I

    .line 45
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v10

    invoke-virtual {v10}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v10

    .line 46
    invoke-static {v1, v9, v10}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v10

    float-to-int v10, v10

    .line 47
    invoke-virtual {p2, v6, v10}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v6

    iput v6, p0, Lcom/xw/repo/BubbleSeekBar;->u:I

    .line 48
    sget v6, Lcom/xw/repo/bubbleseekbar/R$styleable;->BubbleSeekBar_bsb_thumb_text_color:I

    iget v10, p0, Lcom/xw/repo/BubbleSeekBar;->j:I

    invoke-virtual {p2, v6, v10}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v6

    iput v6, p0, Lcom/xw/repo/BubbleSeekBar;->v:I

    .line 49
    sget v6, Lcom/xw/repo/bubbleseekbar/R$styleable;->BubbleSeekBar_bsb_bubble_color:I

    iget v10, p0, Lcom/xw/repo/BubbleSeekBar;->j:I

    invoke-virtual {p2, v6, v10}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v6

    iput v6, p0, Lcom/xw/repo/BubbleSeekBar;->F:I

    .line 50
    sget v6, Lcom/xw/repo/bubbleseekbar/R$styleable;->BubbleSeekBar_bsb_bubble_text_size:I

    .line 51
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v10

    invoke-virtual {v10}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v10

    .line 52
    invoke-static {v1, v9, v10}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v9

    float-to-int v9, v9

    .line 53
    invoke-virtual {p2, v6, v9}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v6

    iput v6, p0, Lcom/xw/repo/BubbleSeekBar;->G:I

    .line 54
    sget v6, Lcom/xw/repo/bubbleseekbar/R$styleable;->BubbleSeekBar_bsb_bubble_text_color:I

    invoke-virtual {p2, v6, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v6

    iput v6, p0, Lcom/xw/repo/BubbleSeekBar;->H:I

    .line 55
    sget v6, Lcom/xw/repo/bubbleseekbar/R$styleable;->BubbleSeekBar_bsb_show_section_mark:I

    invoke-virtual {p2, v6, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v6

    iput-boolean v6, p0, Lcom/xw/repo/BubbleSeekBar;->m:Z

    .line 56
    sget v6, Lcom/xw/repo/bubbleseekbar/R$styleable;->BubbleSeekBar_bsb_auto_adjust_section_mark:I

    invoke-virtual {p2, v6, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v6

    iput-boolean v6, p0, Lcom/xw/repo/BubbleSeekBar;->n:Z

    .line 57
    sget v6, Lcom/xw/repo/bubbleseekbar/R$styleable;->BubbleSeekBar_bsb_show_progress_in_float:I

    invoke-virtual {p2, v6, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v6

    iput-boolean v6, p0, Lcom/xw/repo/BubbleSeekBar;->w:Z

    .line 58
    sget v6, Lcom/xw/repo/bubbleseekbar/R$styleable;->BubbleSeekBar_bsb_anim_duration:I

    invoke-virtual {p2, v6, v0}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v6

    if-gez v6, :cond_3

    const-wide/16 v9, 0xc8

    goto :goto_1

    :cond_3
    int-to-long v9, v6

    .line 59
    :goto_1
    iput-wide v9, p0, Lcom/xw/repo/BubbleSeekBar;->A:J

    .line 60
    sget v6, Lcom/xw/repo/bubbleseekbar/R$styleable;->BubbleSeekBar_bsb_touch_to_seek:I

    invoke-virtual {p2, v6, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v6

    iput-boolean v6, p0, Lcom/xw/repo/BubbleSeekBar;->x:Z

    .line 61
    sget v6, Lcom/xw/repo/bubbleseekbar/R$styleable;->BubbleSeekBar_bsb_always_show_bubble:I

    invoke-virtual {p2, v6, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v6

    iput-boolean v6, p0, Lcom/xw/repo/BubbleSeekBar;->B:Z

    .line 62
    sget v6, Lcom/xw/repo/bubbleseekbar/R$styleable;->BubbleSeekBar_bsb_always_show_bubble_delay:I

    invoke-virtual {p2, v6, v4}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v6

    if-gez v6, :cond_4

    const-wide/16 v9, 0x0

    goto :goto_2

    :cond_4
    int-to-long v9, v6

    .line 63
    :goto_2
    iput-wide v9, p0, Lcom/xw/repo/BubbleSeekBar;->C:J

    .line 64
    sget v6, Lcom/xw/repo/bubbleseekbar/R$styleable;->BubbleSeekBar_bsb_hide_bubble:I

    invoke-virtual {p2, v6, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v6

    iput-boolean v6, p0, Lcom/xw/repo/BubbleSeekBar;->D:Z

    .line 65
    sget v6, Lcom/xw/repo/bubbleseekbar/R$styleable;->BubbleSeekBar_bsb_rtl:I

    invoke-virtual {p2, v6, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v6

    iput-boolean v6, p0, Lcom/xw/repo/BubbleSeekBar;->E:Z

    .line 66
    sget v6, Lcom/xw/repo/bubbleseekbar/R$styleable;->BubbleSeekBar_android_enabled:I

    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    move-result v9

    invoke-virtual {p2, v6, v9}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v6

    invoke-virtual {p0, v6}, Landroid/view/View;->setEnabled(Z)V

    .line 67
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 68
    new-instance p2, Landroid/graphics/Paint;

    invoke-direct {p2}, Landroid/graphics/Paint;-><init>()V

    iput-object p2, p0, Lcom/xw/repo/BubbleSeekBar;->V:Landroid/graphics/Paint;

    .line 69
    invoke-virtual {p2, v2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 70
    sget-object v6, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    invoke-virtual {p2, v6}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 71
    sget-object v6, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {p2, v6}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 72
    new-instance p2, Landroid/graphics/Rect;

    invoke-direct {p2}, Landroid/graphics/Rect;-><init>()V

    iput-object p2, p0, Lcom/xw/repo/BubbleSeekBar;->W:Landroid/graphics/Rect;

    .line 73
    invoke-static {v1}, Lw3/g;->a(I)I

    move-result p2

    iput p2, p0, Lcom/xw/repo/BubbleSeekBar;->O:I

    .line 74
    iget p2, p0, Lcom/xw/repo/BubbleSeekBar;->a:F

    iget v6, p0, Lcom/xw/repo/BubbleSeekBar;->b:F

    cmpl-float p2, p2, v6

    if-nez p2, :cond_5

    .line 75
    iput v3, p0, Lcom/xw/repo/BubbleSeekBar;->a:F

    .line 76
    iput v5, p0, Lcom/xw/repo/BubbleSeekBar;->b:F

    .line 77
    :cond_5
    iget p2, p0, Lcom/xw/repo/BubbleSeekBar;->a:F

    iget v3, p0, Lcom/xw/repo/BubbleSeekBar;->b:F

    cmpl-float v5, p2, v3

    if-lez v5, :cond_6

    .line 78
    iput p2, p0, Lcom/xw/repo/BubbleSeekBar;->b:F

    .line 79
    iput v3, p0, Lcom/xw/repo/BubbleSeekBar;->a:F

    .line 80
    :cond_6
    iget p2, p0, Lcom/xw/repo/BubbleSeekBar;->c:F

    iget v3, p0, Lcom/xw/repo/BubbleSeekBar;->a:F

    cmpg-float p2, p2, v3

    if-gez p2, :cond_7

    .line 81
    iput v3, p0, Lcom/xw/repo/BubbleSeekBar;->c:F

    .line 82
    :cond_7
    iget p2, p0, Lcom/xw/repo/BubbleSeekBar;->c:F

    iget v3, p0, Lcom/xw/repo/BubbleSeekBar;->b:F

    cmpl-float p2, p2, v3

    if-lez p2, :cond_8

    .line 83
    iput v3, p0, Lcom/xw/repo/BubbleSeekBar;->c:F

    .line 84
    :cond_8
    iget p2, p0, Lcom/xw/repo/BubbleSeekBar;->f:I

    if-ge p2, p3, :cond_9

    .line 85
    invoke-static {v1}, Lw3/g;->a(I)I

    move-result p2

    add-int/2addr p2, p3

    iput p2, p0, Lcom/xw/repo/BubbleSeekBar;->f:I

    .line 86
    :cond_9
    iget p2, p0, Lcom/xw/repo/BubbleSeekBar;->g:I

    iget p3, p0, Lcom/xw/repo/BubbleSeekBar;->f:I

    if-gt p2, p3, :cond_a

    .line 87
    invoke-static {v1}, Lw3/g;->a(I)I

    move-result p2

    add-int/2addr p2, p3

    iput p2, p0, Lcom/xw/repo/BubbleSeekBar;->g:I

    .line 88
    :cond_a
    iget p2, p0, Lcom/xw/repo/BubbleSeekBar;->h:I

    iget p3, p0, Lcom/xw/repo/BubbleSeekBar;->f:I

    if-gt p2, p3, :cond_b

    mul-int/2addr p3, v1

    .line 89
    iput p3, p0, Lcom/xw/repo/BubbleSeekBar;->h:I

    .line 90
    :cond_b
    iget p2, p0, Lcom/xw/repo/BubbleSeekBar;->l:I

    if-gtz p2, :cond_c

    .line 91
    iput v7, p0, Lcom/xw/repo/BubbleSeekBar;->l:I

    .line 92
    :cond_c
    iget p2, p0, Lcom/xw/repo/BubbleSeekBar;->b:F

    iget p3, p0, Lcom/xw/repo/BubbleSeekBar;->a:F

    sub-float/2addr p2, p3

    iput p2, p0, Lcom/xw/repo/BubbleSeekBar;->I:F

    .line 93
    iget p3, p0, Lcom/xw/repo/BubbleSeekBar;->l:I

    int-to-float v3, p3

    div-float/2addr p2, v3

    iput p2, p0, Lcom/xw/repo/BubbleSeekBar;->J:F

    const/high16 v3, 0x3f800000    # 1.0f

    cmpg-float p2, p2, v3

    if-gez p2, :cond_d

    .line 94
    iput-boolean v2, p0, Lcom/xw/repo/BubbleSeekBar;->d:Z

    .line 95
    :cond_d
    iget-boolean p2, p0, Lcom/xw/repo/BubbleSeekBar;->d:Z

    if-eqz p2, :cond_e

    .line 96
    iput-boolean v2, p0, Lcom/xw/repo/BubbleSeekBar;->w:Z

    .line 97
    :cond_e
    iget p2, p0, Lcom/xw/repo/BubbleSeekBar;->r:I

    if-eq p2, v0, :cond_f

    .line 98
    iput-boolean v2, p0, Lcom/xw/repo/BubbleSeekBar;->o:Z

    .line 99
    :cond_f
    iget-boolean v3, p0, Lcom/xw/repo/BubbleSeekBar;->o:Z

    if-eqz v3, :cond_11

    if-ne p2, v0, :cond_10

    .line 100
    iput v4, p0, Lcom/xw/repo/BubbleSeekBar;->r:I

    .line 101
    :cond_10
    iget p2, p0, Lcom/xw/repo/BubbleSeekBar;->r:I

    if-ne p2, v1, :cond_11

    .line 102
    iput-boolean v2, p0, Lcom/xw/repo/BubbleSeekBar;->m:Z

    .line 103
    :cond_11
    iget p2, p0, Lcom/xw/repo/BubbleSeekBar;->s:I

    if-ge p2, v2, :cond_12

    .line 104
    iput v2, p0, Lcom/xw/repo/BubbleSeekBar;->s:I

    .line 105
    :cond_12
    iget p2, p0, Lcom/xw/repo/BubbleSeekBar;->r:I

    if-ne p2, v1, :cond_13

    move p2, v2

    goto :goto_3

    :cond_13
    move p2, v4

    .line 106
    :goto_3
    iget v0, p0, Lcom/xw/repo/BubbleSeekBar;->s:I

    if-le v0, v2, :cond_14

    rem-int/2addr p3, v1

    if-nez p3, :cond_14

    move p3, v2

    goto :goto_4

    :cond_14
    move p3, v4

    :goto_4
    move v0, v4

    .line 107
    :goto_5
    iget v3, p0, Lcom/xw/repo/BubbleSeekBar;->l:I

    if-gt v0, v3, :cond_1b

    .line 108
    iget-boolean v5, p0, Lcom/xw/repo/BubbleSeekBar;->E:Z

    if-eqz v5, :cond_15

    iget v6, p0, Lcom/xw/repo/BubbleSeekBar;->b:F

    iget v7, p0, Lcom/xw/repo/BubbleSeekBar;->J:F

    int-to-float v9, v0

    mul-float/2addr v7, v9

    sub-float/2addr v6, v7

    goto :goto_6

    :cond_15
    iget v6, p0, Lcom/xw/repo/BubbleSeekBar;->a:F

    iget v7, p0, Lcom/xw/repo/BubbleSeekBar;->J:F

    int-to-float v9, v0

    mul-float/2addr v7, v9

    add-float/2addr v6, v7

    :goto_6
    if-eqz p2, :cond_17

    if-eqz p3, :cond_18

    .line 109
    iget v3, p0, Lcom/xw/repo/BubbleSeekBar;->s:I

    rem-int v3, v0, v3

    if-nez v3, :cond_1a

    if-eqz v5, :cond_16

    .line 110
    iget v3, p0, Lcom/xw/repo/BubbleSeekBar;->b:F

    iget v5, p0, Lcom/xw/repo/BubbleSeekBar;->J:F

    int-to-float v6, v0

    mul-float/2addr v5, v6

    sub-float/2addr v3, v5

    move v6, v3

    goto :goto_7

    :cond_16
    iget v3, p0, Lcom/xw/repo/BubbleSeekBar;->a:F

    iget v5, p0, Lcom/xw/repo/BubbleSeekBar;->J:F

    int-to-float v6, v0

    mul-float/2addr v5, v6

    add-float/2addr v5, v3

    move v6, v5

    goto :goto_7

    :cond_17
    if-eqz v0, :cond_18

    if-eq v0, v3, :cond_18

    goto :goto_9

    .line 111
    :cond_18
    :goto_7
    iget-object v3, p0, Lcom/xw/repo/BubbleSeekBar;->Q:Landroid/util/SparseArray;

    iget-boolean v5, p0, Lcom/xw/repo/BubbleSeekBar;->d:Z

    if-eqz v5, :cond_19

    invoke-static {v6}, Lcom/xw/repo/BubbleSeekBar;->e(F)Ljava/lang/String;

    move-result-object v5

    goto :goto_8

    :cond_19
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    float-to-int v6, v6

    const-string v7, ""

    .line 112
    invoke-static {v5, v7, v6}, Landroid/support/v4/media/f;->o(Ljava/lang/StringBuilder;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v5

    .line 113
    :goto_8
    invoke-virtual {v3, v0, v5}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    :cond_1a
    :goto_9
    add-int/lit8 v0, v0, 0x1

    goto :goto_5

    .line 114
    :cond_1b
    iget-boolean p2, p0, Lcom/xw/repo/BubbleSeekBar;->y:Z

    if-eqz p2, :cond_1c

    .line 115
    iput-boolean v4, p0, Lcom/xw/repo/BubbleSeekBar;->z:Z

    .line 116
    iput-boolean v4, p0, Lcom/xw/repo/BubbleSeekBar;->n:Z

    .line 117
    :cond_1c
    iget-boolean p2, p0, Lcom/xw/repo/BubbleSeekBar;->n:Z

    if-eqz p2, :cond_1d

    iget-boolean p2, p0, Lcom/xw/repo/BubbleSeekBar;->m:Z

    if-nez p2, :cond_1d

    .line 118
    iput-boolean v4, p0, Lcom/xw/repo/BubbleSeekBar;->n:Z

    .line 119
    :cond_1d
    iget-boolean p2, p0, Lcom/xw/repo/BubbleSeekBar;->z:Z

    if-eqz p2, :cond_1f

    .line 120
    iget p2, p0, Lcom/xw/repo/BubbleSeekBar;->a:F

    iput p2, p0, Lcom/xw/repo/BubbleSeekBar;->l0:F

    .line 121
    iget p3, p0, Lcom/xw/repo/BubbleSeekBar;->c:F

    cmpl-float p2, p3, p2

    if-eqz p2, :cond_1e

    .line 122
    iget p2, p0, Lcom/xw/repo/BubbleSeekBar;->J:F

    iput p2, p0, Lcom/xw/repo/BubbleSeekBar;->l0:F

    .line 123
    :cond_1e
    iput-boolean v2, p0, Lcom/xw/repo/BubbleSeekBar;->m:Z

    .line 124
    iput-boolean v2, p0, Lcom/xw/repo/BubbleSeekBar;->n:Z

    .line 125
    :cond_1f
    iget-boolean p2, p0, Lcom/xw/repo/BubbleSeekBar;->D:Z

    if-eqz p2, :cond_20

    .line 126
    iput-boolean v4, p0, Lcom/xw/repo/BubbleSeekBar;->B:Z

    .line 127
    :cond_20
    iget-boolean p2, p0, Lcom/xw/repo/BubbleSeekBar;->B:Z

    if-eqz p2, :cond_21

    .line 128
    iget p2, p0, Lcom/xw/repo/BubbleSeekBar;->c:F

    invoke-virtual {p0, p2}, Lcom/xw/repo/BubbleSeekBar;->setProgress(F)V

    .line 129
    :cond_21
    iget-boolean p2, p0, Lcom/xw/repo/BubbleSeekBar;->d:Z

    if-nez p2, :cond_23

    iget-boolean p2, p0, Lcom/xw/repo/BubbleSeekBar;->z:Z

    if-nez p2, :cond_23

    iget-boolean p2, p0, Lcom/xw/repo/BubbleSeekBar;->o:Z

    if-eqz p2, :cond_22

    iget p2, p0, Lcom/xw/repo/BubbleSeekBar;->r:I

    if-ne p2, v1, :cond_22

    goto :goto_a

    :cond_22
    iget p2, p0, Lcom/xw/repo/BubbleSeekBar;->u:I

    goto :goto_b

    :cond_23
    :goto_a
    iget p2, p0, Lcom/xw/repo/BubbleSeekBar;->p:I

    :goto_b
    iput p2, p0, Lcom/xw/repo/BubbleSeekBar;->u:I

    .line 130
    iget-boolean p2, p0, Lcom/xw/repo/BubbleSeekBar;->D:Z

    if-eqz p2, :cond_24

    return-void

    .line 131
    :cond_24
    const-string p2, "window"

    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/view/WindowManager;

    iput-object p2, p0, Lcom/xw/repo/BubbleSeekBar;->c0:Landroid/view/WindowManager;

    .line 132
    new-instance p2, Lw3/d;

    invoke-direct {p2, p0, p1}, Lw3/d;-><init>(Lcom/xw/repo/BubbleSeekBar;Landroid/content/Context;)V

    iput-object p2, p0, Lcom/xw/repo/BubbleSeekBar;->d0:Lw3/d;

    .line 133
    iget-boolean p1, p0, Lcom/xw/repo/BubbleSeekBar;->w:Z

    if-eqz p1, :cond_25

    .line 134
    invoke-virtual {p0}, Lcom/xw/repo/BubbleSeekBar;->getProgressFloat()F

    move-result p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object p1

    goto :goto_c

    :cond_25
    invoke-virtual {p0}, Lcom/xw/repo/BubbleSeekBar;->getProgress()I

    move-result p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    .line 135
    :goto_c
    invoke-virtual {p2, p1}, Lw3/d;->a(Ljava/lang/String;)V

    .line 136
    new-instance p1, Landroid/view/WindowManager$LayoutParams;

    invoke-direct {p1}, Landroid/view/WindowManager$LayoutParams;-><init>()V

    iput-object p1, p0, Lcom/xw/repo/BubbleSeekBar;->i0:Landroid/view/WindowManager$LayoutParams;

    const p2, 0x800033

    .line 137
    iput p2, p1, Landroid/view/WindowManager$LayoutParams;->gravity:I

    const/4 p2, -0x2

    .line 138
    iput p2, p1, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 139
    iput p2, p1, Landroid/view/WindowManager$LayoutParams;->height:I

    const/4 p2, -0x3

    .line 140
    iput p2, p1, Landroid/view/WindowManager$LayoutParams;->format:I

    const p2, 0x80028

    .line 141
    iput p2, p1, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 142
    invoke-static {}, Lw3/g;->b()Z

    move-result p2

    if-nez p2, :cond_27

    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p3, 0x19

    if-lt p2, p3, :cond_26

    goto :goto_d

    :cond_26
    const/16 p2, 0x7d5

    .line 143
    iput p2, p1, Landroid/view/WindowManager$LayoutParams;->type:I

    goto :goto_e

    .line 144
    :cond_27
    :goto_d
    iput v1, p1, Landroid/view/WindowManager$LayoutParams;->type:I

    .line 145
    :goto_e
    iget p1, p0, Lcom/xw/repo/BubbleSeekBar;->O:I

    iget-object p2, p0, Lcom/xw/repo/BubbleSeekBar;->W:Landroid/graphics/Rect;

    iget-boolean p3, p0, Lcom/xw/repo/BubbleSeekBar;->E:Z

    iget-object v0, p0, Lcom/xw/repo/BubbleSeekBar;->V:Landroid/graphics/Paint;

    iget v1, p0, Lcom/xw/repo/BubbleSeekBar;->G:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 146
    iget-boolean v1, p0, Lcom/xw/repo/BubbleSeekBar;->w:Z

    if-eqz v1, :cond_29

    if-eqz p3, :cond_28

    .line 147
    iget v1, p0, Lcom/xw/repo/BubbleSeekBar;->b:F

    goto :goto_f

    :cond_28
    iget v1, p0, Lcom/xw/repo/BubbleSeekBar;->a:F

    :goto_f
    invoke-static {v1}, Lcom/xw/repo/BubbleSeekBar;->e(F)Ljava/lang/String;

    move-result-object v1

    goto :goto_10

    :cond_29
    if-eqz p3, :cond_2b

    .line 148
    iget-boolean v1, p0, Lcom/xw/repo/BubbleSeekBar;->d:Z

    if-eqz v1, :cond_2a

    iget v1, p0, Lcom/xw/repo/BubbleSeekBar;->b:F

    invoke-static {v1}, Lcom/xw/repo/BubbleSeekBar;->e(F)Ljava/lang/String;

    move-result-object v1

    goto :goto_10

    :cond_2a
    iget v1, p0, Lcom/xw/repo/BubbleSeekBar;->b:F

    float-to-int v1, v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_10

    .line 149
    :cond_2b
    iget-boolean v1, p0, Lcom/xw/repo/BubbleSeekBar;->d:Z

    if-eqz v1, :cond_2c

    iget v1, p0, Lcom/xw/repo/BubbleSeekBar;->a:F

    invoke-static {v1}, Lcom/xw/repo/BubbleSeekBar;->e(F)Ljava/lang/String;

    move-result-object v1

    goto :goto_10

    :cond_2c
    iget v1, p0, Lcom/xw/repo/BubbleSeekBar;->a:F

    float-to-int v1, v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    .line 150
    :goto_10
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    invoke-virtual {v0, v1, v4, v3, p2}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 151
    invoke-virtual {p2}, Landroid/graphics/Rect;->width()I

    move-result v1

    mul-int/lit8 v3, p1, 0x2

    add-int/2addr v1, v3

    shr-int/2addr v1, v2

    .line 152
    iget-boolean v5, p0, Lcom/xw/repo/BubbleSeekBar;->w:Z

    if-eqz v5, :cond_2e

    if-eqz p3, :cond_2d

    .line 153
    iget p3, p0, Lcom/xw/repo/BubbleSeekBar;->a:F

    goto :goto_11

    :cond_2d
    iget p3, p0, Lcom/xw/repo/BubbleSeekBar;->b:F

    :goto_11
    invoke-static {p3}, Lcom/xw/repo/BubbleSeekBar;->e(F)Ljava/lang/String;

    move-result-object p3

    goto :goto_12

    :cond_2e
    if-eqz p3, :cond_30

    .line 154
    iget-boolean p3, p0, Lcom/xw/repo/BubbleSeekBar;->d:Z

    if-eqz p3, :cond_2f

    iget p3, p0, Lcom/xw/repo/BubbleSeekBar;->a:F

    invoke-static {p3}, Lcom/xw/repo/BubbleSeekBar;->e(F)Ljava/lang/String;

    move-result-object p3

    goto :goto_12

    :cond_2f
    iget p3, p0, Lcom/xw/repo/BubbleSeekBar;->a:F

    float-to-int p3, p3

    invoke-static {p3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p3

    goto :goto_12

    .line 155
    :cond_30
    iget-boolean p3, p0, Lcom/xw/repo/BubbleSeekBar;->d:Z

    if-eqz p3, :cond_31

    iget p3, p0, Lcom/xw/repo/BubbleSeekBar;->b:F

    invoke-static {p3}, Lcom/xw/repo/BubbleSeekBar;->e(F)Ljava/lang/String;

    move-result-object p3

    goto :goto_12

    :cond_31
    iget p3, p0, Lcom/xw/repo/BubbleSeekBar;->b:F

    float-to-int p3, p3

    invoke-static {p3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p3

    .line 156
    :goto_12
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result v5

    invoke-virtual {v0, p3, v4, v5, p2}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 157
    invoke-virtual {p2}, Landroid/graphics/Rect;->width()I

    move-result p2

    add-int/2addr p2, v3

    shr-int/2addr p2, v2

    .line 158
    invoke-static {v8}, Lw3/g;->a(I)I

    move-result p3

    iput p3, p0, Lcom/xw/repo/BubbleSeekBar;->e0:I

    .line 159
    invoke-static {v1, p2}, Ljava/lang/Math;->max(II)I

    move-result p2

    invoke-static {p3, p2}, Ljava/lang/Math;->max(II)I

    move-result p2

    add-int/2addr p2, p1

    .line 160
    iput p2, p0, Lcom/xw/repo/BubbleSeekBar;->e0:I

    return-void
.end method

.method public static e(F)Ljava/lang/String;
    .locals 2

    .line 1
    float-to-double v0, p0

    .line 2
    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(D)Ljava/math/BigDecimal;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    const/4 v0, 0x1

    .line 7
    const/4 v1, 0x4

    .line 8
    invoke-virtual {p0, v0, v1}, Ljava/math/BigDecimal;->setScale(II)Ljava/math/BigDecimal;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/math/BigDecimal;->floatValue()F

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    invoke-static {p0}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method


# virtual methods
.method public final a()V
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
    iget v4, p0, Lcom/xw/repo/BubbleSeekBar;->l:I

    .line 6
    .line 7
    if-gt v2, v4, :cond_1

    .line 8
    .line 9
    int-to-float v3, v2

    .line 10
    iget v4, p0, Lcom/xw/repo/BubbleSeekBar;->M:F

    .line 11
    .line 12
    mul-float/2addr v3, v4

    .line 13
    iget v5, p0, Lcom/xw/repo/BubbleSeekBar;->T:F

    .line 14
    .line 15
    add-float/2addr v3, v5

    .line 16
    iget v5, p0, Lcom/xw/repo/BubbleSeekBar;->K:F

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
    iget v4, p0, Lcom/xw/repo/BubbleSeekBar;->K:F

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
    iget v8, p0, Lcom/xw/repo/BubbleSeekBar;->K:F

    .line 64
    .line 65
    sub-float v9, v8, v3

    .line 66
    .line 67
    iget v10, p0, Lcom/xw/repo/BubbleSeekBar;->M:F

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
    iget v3, p0, Lcom/xw/repo/BubbleSeekBar;->T:F

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
    new-instance v3, Lcom/xuexiang/xui/widget/button/f;

    .line 113
    .line 114
    const/4 v8, 0x5

    .line 115
    invoke-direct {v3, p0, v8}, Lcom/xuexiang/xui/widget/button/f;-><init>(Ljava/lang/Object;I)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v2, v3}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 119
    .line 120
    .line 121
    goto :goto_4

    .line 122
    :cond_4
    const/4 v2, 0x0

    .line 123
    :goto_4
    iget-boolean v3, p0, Lcom/xw/repo/BubbleSeekBar;->D:Z

    .line 124
    .line 125
    iget-wide v8, p0, Lcom/xw/repo/BubbleSeekBar;->A:J

    .line 126
    .line 127
    if-eqz v3, :cond_5

    .line 128
    .line 129
    if-nez v4, :cond_8

    .line 130
    .line 131
    invoke-virtual {v5, v8, v9}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    new-array v3, v6, [Landroid/animation/Animator;

    .line 136
    .line 137
    aput-object v2, v3, v1

    .line 138
    .line 139
    invoke-virtual {v0, v3}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 140
    .line 141
    .line 142
    goto :goto_5

    .line 143
    :cond_5
    iget-boolean v3, p0, Lcom/xw/repo/BubbleSeekBar;->B:Z

    .line 144
    .line 145
    if-eqz v3, :cond_6

    .line 146
    .line 147
    const/high16 v0, 0x3f800000    # 1.0f

    .line 148
    .line 149
    :cond_6
    new-array v3, v6, [F

    .line 150
    .line 151
    aput v0, v3, v1

    .line 152
    .line 153
    iget-object v0, p0, Lcom/xw/repo/BubbleSeekBar;->d0:Lw3/d;

    .line 154
    .line 155
    sget-object v10, Landroid/view/View;->ALPHA:Landroid/util/Property;

    .line 156
    .line 157
    invoke-static {v0, v10, v3}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    if-eqz v4, :cond_7

    .line 162
    .line 163
    invoke-virtual {v5, v8, v9}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    invoke-virtual {v1, v0}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 168
    .line 169
    .line 170
    goto :goto_5

    .line 171
    :cond_7
    invoke-virtual {v5, v8, v9}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    .line 172
    .line 173
    .line 174
    move-result-object v3

    .line 175
    new-array v4, v7, [Landroid/animation/Animator;

    .line 176
    .line 177
    aput-object v2, v4, v1

    .line 178
    .line 179
    aput-object v0, v4, v6

    .line 180
    .line 181
    invoke-virtual {v3, v4}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 182
    .line 183
    .line 184
    :cond_8
    :goto_5
    new-instance v0, Lw3/c;

    .line 185
    .line 186
    invoke-direct {v0, p0, v6}, Lw3/c;-><init>(Lcom/xw/repo/BubbleSeekBar;I)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v5, v0}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v5}, Landroid/animation/AnimatorSet;->start()V

    .line 193
    .line 194
    .line 195
    return-void
.end method

.method public final b(F)F
    .locals 4

    .line 1
    iget v0, p0, Lcom/xw/repo/BubbleSeekBar;->T:F

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
    iget v0, p0, Lcom/xw/repo/BubbleSeekBar;->U:F

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
    iget v2, p0, Lcom/xw/repo/BubbleSeekBar;->l:I

    .line 18
    .line 19
    if-gt v1, v2, :cond_3

    .line 20
    .line 21
    int-to-float v0, v1

    .line 22
    iget v2, p0, Lcom/xw/repo/BubbleSeekBar;->M:F

    .line 23
    .line 24
    mul-float/2addr v0, v2

    .line 25
    iget v3, p0, Lcom/xw/repo/BubbleSeekBar;->T:F

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
    iget v2, p0, Lcom/xw/repo/BubbleSeekBar;->M:F

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
    iget v0, p0, Lcom/xw/repo/BubbleSeekBar;->T:F

    .line 59
    .line 60
    add-float/2addr p1, v0

    .line 61
    return p1
.end method

.method public final c()F
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/xw/repo/BubbleSeekBar;->E:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Lcom/xw/repo/BubbleSeekBar;->f0:F

    .line 6
    .line 7
    iget v1, p0, Lcom/xw/repo/BubbleSeekBar;->L:F

    .line 8
    .line 9
    iget v2, p0, Lcom/xw/repo/BubbleSeekBar;->c:F

    .line 10
    .line 11
    iget v3, p0, Lcom/xw/repo/BubbleSeekBar;->a:F

    .line 12
    .line 13
    sub-float/2addr v2, v3

    .line 14
    mul-float/2addr v2, v1

    .line 15
    iget v1, p0, Lcom/xw/repo/BubbleSeekBar;->I:F

    .line 16
    .line 17
    div-float/2addr v2, v1

    .line 18
    sub-float/2addr v0, v2

    .line 19
    return v0

    .line 20
    :cond_0
    iget v0, p0, Lcom/xw/repo/BubbleSeekBar;->f0:F

    .line 21
    .line 22
    iget v1, p0, Lcom/xw/repo/BubbleSeekBar;->L:F

    .line 23
    .line 24
    iget v2, p0, Lcom/xw/repo/BubbleSeekBar;->c:F

    .line 25
    .line 26
    iget v3, p0, Lcom/xw/repo/BubbleSeekBar;->a:F

    .line 27
    .line 28
    sub-float/2addr v2, v3

    .line 29
    mul-float/2addr v2, v1

    .line 30
    iget v1, p0, Lcom/xw/repo/BubbleSeekBar;->I:F

    .line 31
    .line 32
    div-float/2addr v2, v1

    .line 33
    add-float/2addr v2, v0

    .line 34
    return v2
.end method

.method public final d()F
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/xw/repo/BubbleSeekBar;->E:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Lcom/xw/repo/BubbleSeekBar;->U:F

    .line 6
    .line 7
    iget v1, p0, Lcom/xw/repo/BubbleSeekBar;->K:F

    .line 8
    .line 9
    sub-float/2addr v0, v1

    .line 10
    iget v1, p0, Lcom/xw/repo/BubbleSeekBar;->I:F

    .line 11
    .line 12
    mul-float/2addr v0, v1

    .line 13
    iget v1, p0, Lcom/xw/repo/BubbleSeekBar;->L:F

    .line 14
    .line 15
    div-float/2addr v0, v1

    .line 16
    iget v1, p0, Lcom/xw/repo/BubbleSeekBar;->a:F

    .line 17
    .line 18
    :goto_0
    add-float/2addr v0, v1

    .line 19
    return v0

    .line 20
    :cond_0
    iget v0, p0, Lcom/xw/repo/BubbleSeekBar;->K:F

    .line 21
    .line 22
    iget v1, p0, Lcom/xw/repo/BubbleSeekBar;->T:F

    .line 23
    .line 24
    sub-float/2addr v0, v1

    .line 25
    iget v1, p0, Lcom/xw/repo/BubbleSeekBar;->I:F

    .line 26
    .line 27
    mul-float/2addr v0, v1

    .line 28
    iget v1, p0, Lcom/xw/repo/BubbleSeekBar;->L:F

    .line 29
    .line 30
    div-float/2addr v0, v1

    .line 31
    iget v1, p0, Lcom/xw/repo/BubbleSeekBar;->a:F

    .line 32
    .line 33
    goto :goto_0
.end method

.method public final f()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xw/repo/BubbleSeekBar;->d0:Lw3/d;

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
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    iget-object v1, p0, Lcom/xw/repo/BubbleSeekBar;->c0:Landroid/view/WindowManager;

    .line 18
    .line 19
    invoke-interface {v1, v0}, Landroid/view/WindowManager;->removeViewImmediate(Landroid/view/View;)V

    .line 20
    .line 21
    .line 22
    :cond_1
    :goto_0
    return-void
.end method

.method public final g()F
    .locals 6

    .line 1
    iget v0, p0, Lcom/xw/repo/BubbleSeekBar;->c:F

    .line 2
    .line 3
    iget-boolean v1, p0, Lcom/xw/repo/BubbleSeekBar;->z:Z

    .line 4
    .line 5
    if-eqz v1, :cond_7

    .line 6
    .line 7
    iget-boolean v1, p0, Lcom/xw/repo/BubbleSeekBar;->S:Z

    .line 8
    .line 9
    if-eqz v1, :cond_7

    .line 10
    .line 11
    iget v1, p0, Lcom/xw/repo/BubbleSeekBar;->J:F

    .line 12
    .line 13
    const/high16 v2, 0x40000000    # 2.0f

    .line 14
    .line 15
    div-float/2addr v1, v2

    .line 16
    iget-boolean v2, p0, Lcom/xw/repo/BubbleSeekBar;->x:Z

    .line 17
    .line 18
    if-eqz v2, :cond_3

    .line 19
    .line 20
    iget v2, p0, Lcom/xw/repo/BubbleSeekBar;->a:F

    .line 21
    .line 22
    cmpl-float v2, v0, v2

    .line 23
    .line 24
    if-eqz v2, :cond_7

    .line 25
    .line 26
    iget v2, p0, Lcom/xw/repo/BubbleSeekBar;->b:F

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
    iget v3, p0, Lcom/xw/repo/BubbleSeekBar;->l:I

    .line 35
    .line 36
    if-gt v2, v3, :cond_3

    .line 37
    .line 38
    int-to-float v3, v2

    .line 39
    iget v4, p0, Lcom/xw/repo/BubbleSeekBar;->J:F

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
    add-float/2addr v4, v3

    .line 47
    cmpl-float v5, v4, v0

    .line 48
    .line 49
    if-ltz v5, :cond_2

    .line 50
    .line 51
    add-float/2addr v1, v3

    .line 52
    cmpl-float v0, v1, v0

    .line 53
    .line 54
    if-lez v0, :cond_1

    .line 55
    .line 56
    return v3

    .line 57
    :cond_1
    return v4

    .line 58
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_3
    iget v2, p0, Lcom/xw/repo/BubbleSeekBar;->l0:F

    .line 62
    .line 63
    cmpl-float v3, v0, v2

    .line 64
    .line 65
    if-ltz v3, :cond_4

    .line 66
    .line 67
    add-float/2addr v1, v2

    .line 68
    cmpl-float v0, v0, v1

    .line 69
    .line 70
    if-ltz v0, :cond_5

    .line 71
    .line 72
    iget v0, p0, Lcom/xw/repo/BubbleSeekBar;->J:F

    .line 73
    .line 74
    add-float/2addr v2, v0

    .line 75
    iput v2, p0, Lcom/xw/repo/BubbleSeekBar;->l0:F

    .line 76
    .line 77
    return v2

    .line 78
    :cond_4
    sub-float v1, v2, v1

    .line 79
    .line 80
    cmpl-float v0, v0, v1

    .line 81
    .line 82
    if-ltz v0, :cond_6

    .line 83
    .line 84
    :cond_5
    return v2

    .line 85
    :cond_6
    iget v0, p0, Lcom/xw/repo/BubbleSeekBar;->J:F

    .line 86
    .line 87
    sub-float/2addr v2, v0

    .line 88
    iput v2, p0, Lcom/xw/repo/BubbleSeekBar;->l0:F

    .line 89
    .line 90
    return v2

    .line 91
    :cond_7
    :goto_1
    return v0
.end method

.method public getConfigBuilder()Lw3/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xw/repo/BubbleSeekBar;->m0:Lw3/a;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lw3/a;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/xw/repo/BubbleSeekBar;->m0:Lw3/a;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lcom/xw/repo/BubbleSeekBar;->m0:Lw3/a;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lcom/xw/repo/BubbleSeekBar;->m0:Lw3/a;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lcom/xw/repo/BubbleSeekBar;->m0:Lw3/a;

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Lcom/xw/repo/BubbleSeekBar;->m0:Lw3/a;

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Lcom/xw/repo/BubbleSeekBar;->m0:Lw3/a;

    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, Lcom/xw/repo/BubbleSeekBar;->m0:Lw3/a;

    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    iget-object v0, p0, Lcom/xw/repo/BubbleSeekBar;->m0:Lw3/a;

    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    iget-object v0, p0, Lcom/xw/repo/BubbleSeekBar;->m0:Lw3/a;

    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    iget-object v0, p0, Lcom/xw/repo/BubbleSeekBar;->m0:Lw3/a;

    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    iget-object v0, p0, Lcom/xw/repo/BubbleSeekBar;->m0:Lw3/a;

    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    iget-object v0, p0, Lcom/xw/repo/BubbleSeekBar;->m0:Lw3/a;

    .line 63
    .line 64
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    iget-object v0, p0, Lcom/xw/repo/BubbleSeekBar;->m0:Lw3/a;

    .line 68
    .line 69
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    iget-object v0, p0, Lcom/xw/repo/BubbleSeekBar;->m0:Lw3/a;

    .line 73
    .line 74
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    iget-object v0, p0, Lcom/xw/repo/BubbleSeekBar;->m0:Lw3/a;

    .line 78
    .line 79
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    iget-object v0, p0, Lcom/xw/repo/BubbleSeekBar;->m0:Lw3/a;

    .line 83
    .line 84
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    iget-object v0, p0, Lcom/xw/repo/BubbleSeekBar;->m0:Lw3/a;

    .line 88
    .line 89
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    iget-object v0, p0, Lcom/xw/repo/BubbleSeekBar;->m0:Lw3/a;

    .line 93
    .line 94
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    iget-object v0, p0, Lcom/xw/repo/BubbleSeekBar;->m0:Lw3/a;

    .line 98
    .line 99
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    iget-object v0, p0, Lcom/xw/repo/BubbleSeekBar;->m0:Lw3/a;

    .line 103
    .line 104
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    iget-object v0, p0, Lcom/xw/repo/BubbleSeekBar;->m0:Lw3/a;

    .line 108
    .line 109
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    iget-object v0, p0, Lcom/xw/repo/BubbleSeekBar;->m0:Lw3/a;

    .line 113
    .line 114
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    iget-object v0, p0, Lcom/xw/repo/BubbleSeekBar;->m0:Lw3/a;

    .line 118
    .line 119
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    iget-object v0, p0, Lcom/xw/repo/BubbleSeekBar;->m0:Lw3/a;

    .line 123
    .line 124
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    iget-object v0, p0, Lcom/xw/repo/BubbleSeekBar;->m0:Lw3/a;

    .line 128
    .line 129
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    iget-object v0, p0, Lcom/xw/repo/BubbleSeekBar;->m0:Lw3/a;

    .line 133
    .line 134
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    iget-object v0, p0, Lcom/xw/repo/BubbleSeekBar;->m0:Lw3/a;

    .line 138
    .line 139
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    iget-object v0, p0, Lcom/xw/repo/BubbleSeekBar;->m0:Lw3/a;

    .line 143
    .line 144
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 145
    .line 146
    .line 147
    iget-object v0, p0, Lcom/xw/repo/BubbleSeekBar;->m0:Lw3/a;

    .line 148
    .line 149
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    iget-object v0, p0, Lcom/xw/repo/BubbleSeekBar;->m0:Lw3/a;

    .line 153
    .line 154
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    iget-object v0, p0, Lcom/xw/repo/BubbleSeekBar;->m0:Lw3/a;

    .line 158
    .line 159
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 160
    .line 161
    .line 162
    iget-object v0, p0, Lcom/xw/repo/BubbleSeekBar;->m0:Lw3/a;

    .line 163
    .line 164
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    iget-object v0, p0, Lcom/xw/repo/BubbleSeekBar;->m0:Lw3/a;

    .line 168
    .line 169
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 170
    .line 171
    .line 172
    iget-object v0, p0, Lcom/xw/repo/BubbleSeekBar;->m0:Lw3/a;

    .line 173
    .line 174
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    iget-object v0, p0, Lcom/xw/repo/BubbleSeekBar;->m0:Lw3/a;

    .line 178
    .line 179
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    iget-object v0, p0, Lcom/xw/repo/BubbleSeekBar;->m0:Lw3/a;

    .line 183
    .line 184
    return-object v0
.end method

.method public getMax()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/xw/repo/BubbleSeekBar;->b:F

    .line 2
    .line 3
    return v0
.end method

.method public getMin()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/xw/repo/BubbleSeekBar;->a:F

    .line 2
    .line 3
    return v0
.end method

.method public getOnProgressChangedListener()Lw3/f;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public getProgress()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/xw/repo/BubbleSeekBar;->g()F

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
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/xw/repo/BubbleSeekBar;->g()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    float-to-double v0, v0

    .line 6
    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(D)Ljava/math/BigDecimal;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const/4 v1, 0x1

    .line 11
    const/4 v2, 0x4

    .line 12
    invoke-virtual {v0, v1, v2}, Ljava/math/BigDecimal;->setScale(II)Ljava/math/BigDecimal;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Ljava/math/BigDecimal;->floatValue()F

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    return v0
.end method

.method public final h()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/xw/repo/BubbleSeekBar;->d0:Lw3/d;

    .line 2
    .line 3
    if-eqz v0, :cond_3

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    goto :goto_2

    .line 12
    :cond_0
    iget v1, p0, Lcom/xw/repo/BubbleSeekBar;->h0:F

    .line 13
    .line 14
    const/high16 v2, 0x3f000000    # 0.5f

    .line 15
    .line 16
    add-float/2addr v1, v2

    .line 17
    float-to-int v1, v1

    .line 18
    iget-object v3, p0, Lcom/xw/repo/BubbleSeekBar;->i0:Landroid/view/WindowManager$LayoutParams;

    .line 19
    .line 20
    iput v1, v3, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 21
    .line 22
    iget v1, p0, Lcom/xw/repo/BubbleSeekBar;->g0:F

    .line 23
    .line 24
    add-float/2addr v1, v2

    .line 25
    float-to-int v1, v1

    .line 26
    iput v1, v3, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    .line 30
    .line 31
    .line 32
    const/4 v1, 0x0

    .line 33
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    const/high16 v2, 0x3f800000    # 1.0f

    .line 41
    .line 42
    invoke-virtual {v1, v2}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    iget-boolean v2, p0, Lcom/xw/repo/BubbleSeekBar;->x:Z

    .line 47
    .line 48
    if-eqz v2, :cond_1

    .line 49
    .line 50
    const-wide/16 v2, 0x0

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    iget-wide v2, p0, Lcom/xw/repo/BubbleSeekBar;->A:J

    .line 54
    .line 55
    :goto_0
    invoke-virtual {v1, v2, v3}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    new-instance v2, Lw3/c;

    .line 60
    .line 61
    const/4 v3, 0x2

    .line 62
    invoke-direct {v2, p0, v3}, Lw3/c;-><init>(Lcom/xw/repo/BubbleSeekBar;I)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1, v2}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-virtual {v1}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 70
    .line 71
    .line 72
    iget-boolean v1, p0, Lcom/xw/repo/BubbleSeekBar;->w:Z

    .line 73
    .line 74
    if-eqz v1, :cond_2

    .line 75
    .line 76
    invoke-virtual {p0}, Lcom/xw/repo/BubbleSeekBar;->getProgressFloat()F

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    invoke-static {v1}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    goto :goto_1

    .line 85
    :cond_2
    invoke-virtual {p0}, Lcom/xw/repo/BubbleSeekBar;->getProgress()I

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    :goto_1
    invoke-virtual {v0, v1}, Lw3/d;->a(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    :cond_3
    :goto_2
    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/xw/repo/BubbleSeekBar;->f()V

    .line 2
    .line 3
    .line 4
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 20

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
    iget v5, v0, Lcom/xw/repo/BubbleSeekBar;->h:I

    .line 28
    .line 29
    add-int/2addr v4, v5

    .line 30
    int-to-float v4, v4

    .line 31
    iget-boolean v5, v0, Lcom/xw/repo/BubbleSeekBar;->o:Z

    .line 32
    .line 33
    iget v6, v0, Lcom/xw/repo/BubbleSeekBar;->p:I

    .line 34
    .line 35
    iget v7, v0, Lcom/xw/repo/BubbleSeekBar;->q:I

    .line 36
    .line 37
    const/16 v8, 0xa

    .line 38
    .line 39
    const-string v9, "0123456789"

    .line 40
    .line 41
    const/high16 v10, 0x40000000    # 2.0f

    .line 42
    .line 43
    iget v11, v0, Lcom/xw/repo/BubbleSeekBar;->O:I

    .line 44
    .line 45
    const/4 v12, 0x1

    .line 46
    const/4 v13, 0x0

    .line 47
    iget-object v14, v0, Lcom/xw/repo/BubbleSeekBar;->W:Landroid/graphics/Rect;

    .line 48
    .line 49
    iget-object v15, v0, Lcom/xw/repo/BubbleSeekBar;->V:Landroid/graphics/Paint;

    .line 50
    .line 51
    if-eqz v5, :cond_3

    .line 52
    .line 53
    invoke-virtual {v15, v7}, Landroid/graphics/Paint;->setColor(I)V

    .line 54
    .line 55
    .line 56
    int-to-float v5, v6

    .line 57
    invoke-virtual {v15, v5}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v15, v9, v13, v8, v14}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 61
    .line 62
    .line 63
    iget v5, v0, Lcom/xw/repo/BubbleSeekBar;->r:I

    .line 64
    .line 65
    if-nez v5, :cond_0

    .line 66
    .line 67
    invoke-virtual {v14}, Landroid/graphics/Rect;->height()I

    .line 68
    .line 69
    .line 70
    move-result v5

    .line 71
    int-to-float v5, v5

    .line 72
    div-float/2addr v5, v10

    .line 73
    add-float/2addr v5, v4

    .line 74
    move/from16 v16, v10

    .line 75
    .line 76
    iget-object v10, v0, Lcom/xw/repo/BubbleSeekBar;->Q:Landroid/util/SparseArray;

    .line 77
    .line 78
    invoke-virtual {v10, v13}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v10

    .line 82
    check-cast v10, Ljava/lang/String;

    .line 83
    .line 84
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    .line 85
    .line 86
    .line 87
    move-result v8

    .line 88
    invoke-virtual {v15, v10, v13, v8, v14}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v14}, Landroid/graphics/Rect;->width()I

    .line 92
    .line 93
    .line 94
    move-result v8

    .line 95
    int-to-float v8, v8

    .line 96
    div-float v8, v8, v16

    .line 97
    .line 98
    add-float/2addr v8, v2

    .line 99
    invoke-virtual {v1, v10, v8, v5, v15}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v14}, Landroid/graphics/Rect;->width()I

    .line 103
    .line 104
    .line 105
    move-result v8

    .line 106
    add-int/2addr v8, v11

    .line 107
    int-to-float v8, v8

    .line 108
    add-float/2addr v2, v8

    .line 109
    iget-object v8, v0, Lcom/xw/repo/BubbleSeekBar;->Q:Landroid/util/SparseArray;

    .line 110
    .line 111
    iget v10, v0, Lcom/xw/repo/BubbleSeekBar;->l:I

    .line 112
    .line 113
    invoke-virtual {v8, v10}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v8

    .line 117
    check-cast v8, Ljava/lang/String;

    .line 118
    .line 119
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 120
    .line 121
    .line 122
    move-result v10

    .line 123
    invoke-virtual {v15, v8, v13, v10, v14}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v14}, Landroid/graphics/Rect;->width()I

    .line 127
    .line 128
    .line 129
    move-result v10

    .line 130
    int-to-float v10, v10

    .line 131
    const/high16 v17, 0x3f000000    # 0.5f

    .line 132
    .line 133
    add-float v10, v10, v17

    .line 134
    .line 135
    div-float v10, v10, v16

    .line 136
    .line 137
    sub-float v10, v3, v10

    .line 138
    .line 139
    invoke-virtual {v1, v8, v10, v5, v15}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v14}, Landroid/graphics/Rect;->width()I

    .line 143
    .line 144
    .line 145
    move-result v5

    .line 146
    add-int/2addr v5, v11

    .line 147
    int-to-float v5, v5

    .line 148
    sub-float/2addr v3, v5

    .line 149
    goto :goto_0

    .line 150
    :cond_0
    move/from16 v16, v10

    .line 151
    .line 152
    if-lt v5, v12, :cond_4

    .line 153
    .line 154
    iget v2, v0, Lcom/xw/repo/BubbleSeekBar;->h:I

    .line 155
    .line 156
    int-to-float v2, v2

    .line 157
    add-float/2addr v2, v4

    .line 158
    int-to-float v3, v11

    .line 159
    add-float/2addr v2, v3

    .line 160
    iget-object v3, v0, Lcom/xw/repo/BubbleSeekBar;->Q:Landroid/util/SparseArray;

    .line 161
    .line 162
    invoke-virtual {v3, v13}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v3

    .line 166
    check-cast v3, Ljava/lang/String;

    .line 167
    .line 168
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 169
    .line 170
    .line 171
    move-result v5

    .line 172
    invoke-virtual {v15, v3, v13, v5, v14}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v14}, Landroid/graphics/Rect;->height()I

    .line 176
    .line 177
    .line 178
    move-result v5

    .line 179
    int-to-float v5, v5

    .line 180
    add-float/2addr v2, v5

    .line 181
    iget v5, v0, Lcom/xw/repo/BubbleSeekBar;->T:F

    .line 182
    .line 183
    iget v8, v0, Lcom/xw/repo/BubbleSeekBar;->r:I

    .line 184
    .line 185
    if-ne v8, v12, :cond_1

    .line 186
    .line 187
    invoke-virtual {v1, v3, v5, v2, v15}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 188
    .line 189
    .line 190
    :cond_1
    iget-object v3, v0, Lcom/xw/repo/BubbleSeekBar;->Q:Landroid/util/SparseArray;

    .line 191
    .line 192
    iget v8, v0, Lcom/xw/repo/BubbleSeekBar;->l:I

    .line 193
    .line 194
    invoke-virtual {v3, v8}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v3

    .line 198
    check-cast v3, Ljava/lang/String;

    .line 199
    .line 200
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 201
    .line 202
    .line 203
    move-result v8

    .line 204
    invoke-virtual {v15, v3, v13, v8, v14}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 205
    .line 206
    .line 207
    iget v8, v0, Lcom/xw/repo/BubbleSeekBar;->U:F

    .line 208
    .line 209
    iget v10, v0, Lcom/xw/repo/BubbleSeekBar;->r:I

    .line 210
    .line 211
    if-ne v10, v12, :cond_2

    .line 212
    .line 213
    invoke-virtual {v1, v3, v8, v2, v15}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 214
    .line 215
    .line 216
    :cond_2
    move v2, v5

    .line 217
    move v3, v8

    .line 218
    goto :goto_0

    .line 219
    :cond_3
    move/from16 v16, v10

    .line 220
    .line 221
    iget-boolean v5, v0, Lcom/xw/repo/BubbleSeekBar;->t:Z

    .line 222
    .line 223
    if-eqz v5, :cond_4

    .line 224
    .line 225
    iget v5, v0, Lcom/xw/repo/BubbleSeekBar;->r:I

    .line 226
    .line 227
    const/4 v8, -0x1

    .line 228
    if-ne v5, v8, :cond_4

    .line 229
    .line 230
    iget v2, v0, Lcom/xw/repo/BubbleSeekBar;->T:F

    .line 231
    .line 232
    iget v3, v0, Lcom/xw/repo/BubbleSeekBar;->U:F

    .line 233
    .line 234
    :cond_4
    :goto_0
    iget-boolean v5, v0, Lcom/xw/repo/BubbleSeekBar;->o:Z

    .line 235
    .line 236
    if-nez v5, :cond_5

    .line 237
    .line 238
    iget-boolean v8, v0, Lcom/xw/repo/BubbleSeekBar;->t:Z

    .line 239
    .line 240
    if-eqz v8, :cond_6

    .line 241
    .line 242
    :cond_5
    iget v8, v0, Lcom/xw/repo/BubbleSeekBar;->r:I

    .line 243
    .line 244
    if-nez v8, :cond_7

    .line 245
    .line 246
    :cond_6
    iget v8, v0, Lcom/xw/repo/BubbleSeekBar;->h:I

    .line 247
    .line 248
    int-to-float v8, v8

    .line 249
    add-float/2addr v2, v8

    .line 250
    sub-float/2addr v3, v8

    .line 251
    :cond_7
    move v8, v2

    .line 252
    move v2, v3

    .line 253
    const/4 v3, 0x2

    .line 254
    if-eqz v5, :cond_8

    .line 255
    .line 256
    iget v5, v0, Lcom/xw/repo/BubbleSeekBar;->r:I

    .line 257
    .line 258
    if-ne v5, v3, :cond_8

    .line 259
    .line 260
    move v5, v12

    .line 261
    goto :goto_1

    .line 262
    :cond_8
    move v5, v13

    .line 263
    :goto_1
    iget-boolean v10, v0, Lcom/xw/repo/BubbleSeekBar;->E:Z

    .line 264
    .line 265
    move/from16 v17, v3

    .line 266
    .line 267
    if-nez v5, :cond_b

    .line 268
    .line 269
    iget-boolean v3, v0, Lcom/xw/repo/BubbleSeekBar;->m:Z

    .line 270
    .line 271
    if-eqz v3, :cond_9

    .line 272
    .line 273
    goto :goto_2

    .line 274
    :cond_9
    move/from16 v17, v2

    .line 275
    .line 276
    :cond_a
    move/from16 v19, v4

    .line 277
    .line 278
    goto/16 :goto_9

    .line 279
    .line 280
    :cond_b
    :goto_2
    int-to-float v3, v6

    .line 281
    invoke-virtual {v15, v3}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 282
    .line 283
    .line 284
    const/16 v3, 0xa

    .line 285
    .line 286
    invoke-virtual {v15, v9, v13, v3, v14}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 287
    .line 288
    .line 289
    invoke-virtual {v14}, Landroid/graphics/Rect;->height()I

    .line 290
    .line 291
    .line 292
    move-result v3

    .line 293
    int-to-float v3, v3

    .line 294
    add-float/2addr v3, v4

    .line 295
    iget v6, v0, Lcom/xw/repo/BubbleSeekBar;->h:I

    .line 296
    .line 297
    int-to-float v12, v6

    .line 298
    add-float/2addr v3, v12

    .line 299
    int-to-float v12, v11

    .line 300
    add-float/2addr v3, v12

    .line 301
    invoke-static/range {v17 .. v17}, Lw3/g;->a(I)I

    .line 302
    .line 303
    .line 304
    move-result v12

    .line 305
    sub-int/2addr v6, v12

    .line 306
    int-to-float v6, v6

    .line 307
    div-float v6, v6, v16

    .line 308
    .line 309
    if-eqz v10, :cond_c

    .line 310
    .line 311
    iget v12, v0, Lcom/xw/repo/BubbleSeekBar;->U:F

    .line 312
    .line 313
    iget v13, v0, Lcom/xw/repo/BubbleSeekBar;->L:F

    .line 314
    .line 315
    move/from16 v17, v2

    .line 316
    .line 317
    iget v2, v0, Lcom/xw/repo/BubbleSeekBar;->I:F

    .line 318
    .line 319
    div-float/2addr v13, v2

    .line 320
    iget v2, v0, Lcom/xw/repo/BubbleSeekBar;->c:F

    .line 321
    .line 322
    move/from16 v18, v2

    .line 323
    .line 324
    iget v2, v0, Lcom/xw/repo/BubbleSeekBar;->a:F

    .line 325
    .line 326
    sub-float v2, v18, v2

    .line 327
    .line 328
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 329
    .line 330
    .line 331
    move-result v2

    .line 332
    mul-float/2addr v2, v13

    .line 333
    sub-float/2addr v12, v2

    .line 334
    goto :goto_3

    .line 335
    :cond_c
    move/from16 v17, v2

    .line 336
    .line 337
    iget v2, v0, Lcom/xw/repo/BubbleSeekBar;->T:F

    .line 338
    .line 339
    iget v12, v0, Lcom/xw/repo/BubbleSeekBar;->L:F

    .line 340
    .line 341
    iget v13, v0, Lcom/xw/repo/BubbleSeekBar;->I:F

    .line 342
    .line 343
    div-float/2addr v12, v13

    .line 344
    iget v13, v0, Lcom/xw/repo/BubbleSeekBar;->c:F

    .line 345
    .line 346
    move/from16 v18, v2

    .line 347
    .line 348
    iget v2, v0, Lcom/xw/repo/BubbleSeekBar;->a:F

    .line 349
    .line 350
    sub-float/2addr v13, v2

    .line 351
    invoke-static {v13}, Ljava/lang/Math;->abs(F)F

    .line 352
    .line 353
    .line 354
    move-result v2

    .line 355
    mul-float/2addr v2, v12

    .line 356
    add-float v12, v2, v18

    .line 357
    .line 358
    :goto_3
    const/4 v2, 0x0

    .line 359
    :goto_4
    iget v13, v0, Lcom/xw/repo/BubbleSeekBar;->l:I

    .line 360
    .line 361
    if-gt v2, v13, :cond_a

    .line 362
    .line 363
    int-to-float v13, v2

    .line 364
    move/from16 v18, v5

    .line 365
    .line 366
    iget v5, v0, Lcom/xw/repo/BubbleSeekBar;->M:F

    .line 367
    .line 368
    mul-float/2addr v13, v5

    .line 369
    add-float/2addr v13, v8

    .line 370
    if-eqz v10, :cond_e

    .line 371
    .line 372
    cmpg-float v5, v13, v12

    .line 373
    .line 374
    if-gtz v5, :cond_d

    .line 375
    .line 376
    iget v5, v0, Lcom/xw/repo/BubbleSeekBar;->i:I

    .line 377
    .line 378
    goto :goto_5

    .line 379
    :cond_d
    iget v5, v0, Lcom/xw/repo/BubbleSeekBar;->j:I

    .line 380
    .line 381
    :goto_5
    invoke-virtual {v15, v5}, Landroid/graphics/Paint;->setColor(I)V

    .line 382
    .line 383
    .line 384
    goto :goto_7

    .line 385
    :cond_e
    cmpg-float v5, v13, v12

    .line 386
    .line 387
    if-gtz v5, :cond_f

    .line 388
    .line 389
    iget v5, v0, Lcom/xw/repo/BubbleSeekBar;->j:I

    .line 390
    .line 391
    goto :goto_6

    .line 392
    :cond_f
    iget v5, v0, Lcom/xw/repo/BubbleSeekBar;->i:I

    .line 393
    .line 394
    :goto_6
    invoke-virtual {v15, v5}, Landroid/graphics/Paint;->setColor(I)V

    .line 395
    .line 396
    .line 397
    :goto_7
    invoke-virtual {v1, v13, v4, v6, v15}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 398
    .line 399
    .line 400
    if-eqz v18, :cond_10

    .line 401
    .line 402
    invoke-virtual {v15, v7}, Landroid/graphics/Paint;->setColor(I)V

    .line 403
    .line 404
    .line 405
    iget-object v5, v0, Lcom/xw/repo/BubbleSeekBar;->Q:Landroid/util/SparseArray;

    .line 406
    .line 407
    move/from16 v19, v4

    .line 408
    .line 409
    const/4 v4, 0x0

    .line 410
    invoke-virtual {v5, v2, v4}, Landroid/util/SparseArray;->get(ILjava/lang/Object;)Ljava/lang/Object;

    .line 411
    .line 412
    .line 413
    move-result-object v4

    .line 414
    if-eqz v4, :cond_11

    .line 415
    .line 416
    iget-object v4, v0, Lcom/xw/repo/BubbleSeekBar;->Q:Landroid/util/SparseArray;

    .line 417
    .line 418
    invoke-virtual {v4, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 419
    .line 420
    .line 421
    move-result-object v4

    .line 422
    check-cast v4, Ljava/lang/String;

    .line 423
    .line 424
    invoke-virtual {v1, v4, v13, v3, v15}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 425
    .line 426
    .line 427
    goto :goto_8

    .line 428
    :cond_10
    move/from16 v19, v4

    .line 429
    .line 430
    :cond_11
    :goto_8
    add-int/lit8 v2, v2, 0x1

    .line 431
    .line 432
    move/from16 v5, v18

    .line 433
    .line 434
    move/from16 v4, v19

    .line 435
    .line 436
    goto :goto_4

    .line 437
    :goto_9
    iget-boolean v2, v0, Lcom/xw/repo/BubbleSeekBar;->N:Z

    .line 438
    .line 439
    if-eqz v2, :cond_12

    .line 440
    .line 441
    iget-boolean v3, v0, Lcom/xw/repo/BubbleSeekBar;->B:Z

    .line 442
    .line 443
    if-eqz v3, :cond_14

    .line 444
    .line 445
    :cond_12
    if-eqz v10, :cond_13

    .line 446
    .line 447
    iget v3, v0, Lcom/xw/repo/BubbleSeekBar;->L:F

    .line 448
    .line 449
    iget v4, v0, Lcom/xw/repo/BubbleSeekBar;->I:F

    .line 450
    .line 451
    div-float/2addr v3, v4

    .line 452
    iget v4, v0, Lcom/xw/repo/BubbleSeekBar;->c:F

    .line 453
    .line 454
    iget v5, v0, Lcom/xw/repo/BubbleSeekBar;->a:F

    .line 455
    .line 456
    sub-float/2addr v4, v5

    .line 457
    mul-float/2addr v4, v3

    .line 458
    sub-float v3, v17, v4

    .line 459
    .line 460
    iput v3, v0, Lcom/xw/repo/BubbleSeekBar;->K:F

    .line 461
    .line 462
    goto :goto_a

    .line 463
    :cond_13
    iget v3, v0, Lcom/xw/repo/BubbleSeekBar;->L:F

    .line 464
    .line 465
    iget v4, v0, Lcom/xw/repo/BubbleSeekBar;->I:F

    .line 466
    .line 467
    div-float/2addr v3, v4

    .line 468
    iget v4, v0, Lcom/xw/repo/BubbleSeekBar;->c:F

    .line 469
    .line 470
    iget v5, v0, Lcom/xw/repo/BubbleSeekBar;->a:F

    .line 471
    .line 472
    invoke-static {v4, v5, v3, v8}, Landroid/support/v4/media/f;->b(FFFF)F

    .line 473
    .line 474
    .line 475
    move-result v3

    .line 476
    iput v3, v0, Lcom/xw/repo/BubbleSeekBar;->K:F

    .line 477
    .line 478
    :cond_14
    :goto_a
    iget-boolean v3, v0, Lcom/xw/repo/BubbleSeekBar;->t:Z

    .line 479
    .line 480
    if-eqz v3, :cond_17

    .line 481
    .line 482
    if-nez v2, :cond_17

    .line 483
    .line 484
    iget-boolean v2, v0, Lcom/xw/repo/BubbleSeekBar;->k0:Z

    .line 485
    .line 486
    if-eqz v2, :cond_17

    .line 487
    .line 488
    iget v2, v0, Lcom/xw/repo/BubbleSeekBar;->v:I

    .line 489
    .line 490
    invoke-virtual {v15, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 491
    .line 492
    .line 493
    iget v2, v0, Lcom/xw/repo/BubbleSeekBar;->u:I

    .line 494
    .line 495
    int-to-float v2, v2

    .line 496
    invoke-virtual {v15, v2}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 497
    .line 498
    .line 499
    const/4 v2, 0x0

    .line 500
    const/16 v3, 0xa

    .line 501
    .line 502
    invoke-virtual {v15, v9, v2, v3, v14}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 503
    .line 504
    .line 505
    invoke-virtual {v14}, Landroid/graphics/Rect;->height()I

    .line 506
    .line 507
    .line 508
    move-result v2

    .line 509
    int-to-float v2, v2

    .line 510
    add-float v4, v19, v2

    .line 511
    .line 512
    iget v2, v0, Lcom/xw/repo/BubbleSeekBar;->h:I

    .line 513
    .line 514
    int-to-float v2, v2

    .line 515
    add-float/2addr v4, v2

    .line 516
    int-to-float v2, v11

    .line 517
    add-float/2addr v4, v2

    .line 518
    iget-boolean v2, v0, Lcom/xw/repo/BubbleSeekBar;->d:Z

    .line 519
    .line 520
    if-nez v2, :cond_16

    .line 521
    .line 522
    iget-boolean v2, v0, Lcom/xw/repo/BubbleSeekBar;->w:Z

    .line 523
    .line 524
    if-eqz v2, :cond_15

    .line 525
    .line 526
    iget v2, v0, Lcom/xw/repo/BubbleSeekBar;->r:I

    .line 527
    .line 528
    const/4 v3, 0x1

    .line 529
    if-ne v2, v3, :cond_15

    .line 530
    .line 531
    iget v2, v0, Lcom/xw/repo/BubbleSeekBar;->c:F

    .line 532
    .line 533
    iget v3, v0, Lcom/xw/repo/BubbleSeekBar;->a:F

    .line 534
    .line 535
    cmpl-float v3, v2, v3

    .line 536
    .line 537
    if-eqz v3, :cond_15

    .line 538
    .line 539
    iget v3, v0, Lcom/xw/repo/BubbleSeekBar;->b:F

    .line 540
    .line 541
    cmpl-float v2, v2, v3

    .line 542
    .line 543
    if-eqz v2, :cond_15

    .line 544
    .line 545
    goto :goto_b

    .line 546
    :cond_15
    invoke-virtual {v0}, Lcom/xw/repo/BubbleSeekBar;->getProgress()I

    .line 547
    .line 548
    .line 549
    move-result v2

    .line 550
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 551
    .line 552
    .line 553
    move-result-object v2

    .line 554
    iget v3, v0, Lcom/xw/repo/BubbleSeekBar;->K:F

    .line 555
    .line 556
    invoke-virtual {v1, v2, v3, v4, v15}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 557
    .line 558
    .line 559
    goto :goto_c

    .line 560
    :cond_16
    :goto_b
    invoke-virtual {v0}, Lcom/xw/repo/BubbleSeekBar;->getProgressFloat()F

    .line 561
    .line 562
    .line 563
    move-result v2

    .line 564
    invoke-static {v2}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    .line 565
    .line 566
    .line 567
    move-result-object v2

    .line 568
    iget v3, v0, Lcom/xw/repo/BubbleSeekBar;->K:F

    .line 569
    .line 570
    invoke-virtual {v1, v2, v3, v4, v15}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 571
    .line 572
    .line 573
    :cond_17
    :goto_c
    iget v2, v0, Lcom/xw/repo/BubbleSeekBar;->j:I

    .line 574
    .line 575
    invoke-virtual {v15, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 576
    .line 577
    .line 578
    iget v2, v0, Lcom/xw/repo/BubbleSeekBar;->f:I

    .line 579
    .line 580
    int-to-float v2, v2

    .line 581
    invoke-virtual {v15, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 582
    .line 583
    .line 584
    if-eqz v10, :cond_18

    .line 585
    .line 586
    iget v4, v0, Lcom/xw/repo/BubbleSeekBar;->K:F

    .line 587
    .line 588
    move/from16 v5, v19

    .line 589
    .line 590
    move-object v6, v15

    .line 591
    move/from16 v2, v17

    .line 592
    .line 593
    move/from16 v3, v19

    .line 594
    .line 595
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 596
    .line 597
    .line 598
    move v2, v8

    .line 599
    goto :goto_d

    .line 600
    :cond_18
    move-object v6, v15

    .line 601
    move/from16 v3, v19

    .line 602
    .line 603
    iget v4, v0, Lcom/xw/repo/BubbleSeekBar;->K:F

    .line 604
    .line 605
    move v5, v3

    .line 606
    move-object/from16 v1, p1

    .line 607
    .line 608
    move v2, v8

    .line 609
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 610
    .line 611
    .line 612
    :goto_d
    iget v1, v0, Lcom/xw/repo/BubbleSeekBar;->i:I

    .line 613
    .line 614
    invoke-virtual {v6, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 615
    .line 616
    .line 617
    iget v1, v0, Lcom/xw/repo/BubbleSeekBar;->e:I

    .line 618
    .line 619
    int-to-float v1, v1

    .line 620
    invoke-virtual {v6, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 621
    .line 622
    .line 623
    if-eqz v10, :cond_19

    .line 624
    .line 625
    move v4, v2

    .line 626
    iget v2, v0, Lcom/xw/repo/BubbleSeekBar;->K:F

    .line 627
    .line 628
    move v5, v3

    .line 629
    move-object/from16 v1, p1

    .line 630
    .line 631
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 632
    .line 633
    .line 634
    goto :goto_e

    .line 635
    :cond_19
    iget v2, v0, Lcom/xw/repo/BubbleSeekBar;->K:F

    .line 636
    .line 637
    move v5, v3

    .line 638
    move-object/from16 v1, p1

    .line 639
    .line 640
    move/from16 v4, v17

    .line 641
    .line 642
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 643
    .line 644
    .line 645
    :goto_e
    iget v2, v0, Lcom/xw/repo/BubbleSeekBar;->k:I

    .line 646
    .line 647
    invoke-virtual {v6, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 648
    .line 649
    .line 650
    iget v2, v0, Lcom/xw/repo/BubbleSeekBar;->K:F

    .line 651
    .line 652
    iget-boolean v4, v0, Lcom/xw/repo/BubbleSeekBar;->N:Z

    .line 653
    .line 654
    if-eqz v4, :cond_1a

    .line 655
    .line 656
    iget v4, v0, Lcom/xw/repo/BubbleSeekBar;->h:I

    .line 657
    .line 658
    :goto_f
    int-to-float v4, v4

    .line 659
    goto :goto_10

    .line 660
    :cond_1a
    iget v4, v0, Lcom/xw/repo/BubbleSeekBar;->g:I

    .line 661
    .line 662
    goto :goto_f

    .line 663
    :goto_10
    invoke-virtual {v1, v2, v3, v4, v6}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 664
    .line 665
    .line 666
    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 1

    .line 1
    invoke-super/range {p0 .. p5}, Landroid/view/View;->onLayout(ZIIII)V

    .line 2
    .line 3
    .line 4
    move-object p1, p0

    .line 5
    iget-boolean p2, p1, Lcom/xw/repo/BubbleSeekBar;->D:Z

    .line 6
    .line 7
    if-nez p2, :cond_3

    .line 8
    .line 9
    iget-object p2, p1, Lcom/xw/repo/BubbleSeekBar;->j0:[I

    .line 10
    .line 11
    invoke-virtual {p0, p2}, Landroid/view/View;->getLocationInWindow([I)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 15
    .line 16
    .line 17
    move-result-object p3

    .line 18
    instance-of p4, p3, Landroid/view/View;

    .line 19
    .line 20
    const/4 p5, 0x0

    .line 21
    if-eqz p4, :cond_0

    .line 22
    .line 23
    check-cast p3, Landroid/view/View;

    .line 24
    .line 25
    invoke-virtual {p3}, Landroid/view/View;->getMeasuredWidth()I

    .line 26
    .line 27
    .line 28
    move-result p4

    .line 29
    if-lez p4, :cond_0

    .line 30
    .line 31
    aget p4, p2, p5

    .line 32
    .line 33
    invoke-virtual {p3}, Landroid/view/View;->getMeasuredWidth()I

    .line 34
    .line 35
    .line 36
    move-result p3

    .line 37
    rem-int/2addr p4, p3

    .line 38
    aput p4, p2, p5

    .line 39
    .line 40
    :cond_0
    iget-boolean p3, p1, Lcom/xw/repo/BubbleSeekBar;->E:Z

    .line 41
    .line 42
    const/high16 p4, 0x40000000    # 2.0f

    .line 43
    .line 44
    iget-object v0, p1, Lcom/xw/repo/BubbleSeekBar;->d0:Lw3/d;

    .line 45
    .line 46
    if-eqz p3, :cond_1

    .line 47
    .line 48
    aget p3, p2, p5

    .line 49
    .line 50
    int-to-float p3, p3

    .line 51
    iget p5, p1, Lcom/xw/repo/BubbleSeekBar;->U:F

    .line 52
    .line 53
    add-float/2addr p3, p5

    .line 54
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    .line 55
    .line 56
    .line 57
    move-result p5

    .line 58
    int-to-float p5, p5

    .line 59
    div-float/2addr p5, p4

    .line 60
    sub-float/2addr p3, p5

    .line 61
    iput p3, p1, Lcom/xw/repo/BubbleSeekBar;->f0:F

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_1
    aget p3, p2, p5

    .line 65
    .line 66
    int-to-float p3, p3

    .line 67
    iget p5, p1, Lcom/xw/repo/BubbleSeekBar;->T:F

    .line 68
    .line 69
    add-float/2addr p3, p5

    .line 70
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    .line 71
    .line 72
    .line 73
    move-result p5

    .line 74
    int-to-float p5, p5

    .line 75
    div-float/2addr p5, p4

    .line 76
    sub-float/2addr p3, p5

    .line 77
    iput p3, p1, Lcom/xw/repo/BubbleSeekBar;->f0:F

    .line 78
    .line 79
    :goto_0
    invoke-virtual {p0}, Lcom/xw/repo/BubbleSeekBar;->c()F

    .line 80
    .line 81
    .line 82
    move-result p3

    .line 83
    iput p3, p1, Lcom/xw/repo/BubbleSeekBar;->h0:F

    .line 84
    .line 85
    const/4 p3, 0x1

    .line 86
    aget p2, p2, p3

    .line 87
    .line 88
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    .line 89
    .line 90
    .line 91
    move-result p3

    .line 92
    sub-int/2addr p2, p3

    .line 93
    int-to-float p2, p2

    .line 94
    iput p2, p1, Lcom/xw/repo/BubbleSeekBar;->g0:F

    .line 95
    .line 96
    const/16 p3, 0x18

    .line 97
    .line 98
    invoke-static {p3}, Lw3/g;->a(I)I

    .line 99
    .line 100
    .line 101
    move-result p3

    .line 102
    int-to-float p3, p3

    .line 103
    sub-float/2addr p2, p3

    .line 104
    iput p2, p1, Lcom/xw/repo/BubbleSeekBar;->g0:F

    .line 105
    .line 106
    invoke-static {}, Lw3/g;->b()Z

    .line 107
    .line 108
    .line 109
    move-result p2

    .line 110
    if-eqz p2, :cond_2

    .line 111
    .line 112
    iget p2, p1, Lcom/xw/repo/BubbleSeekBar;->g0:F

    .line 113
    .line 114
    const/4 p3, 0x4

    .line 115
    invoke-static {p3}, Lw3/g;->a(I)I

    .line 116
    .line 117
    .line 118
    move-result p3

    .line 119
    int-to-float p3, p3

    .line 120
    sub-float/2addr p2, p3

    .line 121
    iput p2, p1, Lcom/xw/repo/BubbleSeekBar;->g0:F

    .line 122
    .line 123
    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 124
    .line 125
    .line 126
    move-result-object p2

    .line 127
    instance-of p3, p2, Landroid/app/Activity;

    .line 128
    .line 129
    if-eqz p3, :cond_3

    .line 130
    .line 131
    check-cast p2, Landroid/app/Activity;

    .line 132
    .line 133
    invoke-virtual {p2}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 134
    .line 135
    .line 136
    move-result-object p2

    .line 137
    if-eqz p2, :cond_3

    .line 138
    .line 139
    invoke-virtual {p2}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    .line 140
    .line 141
    .line 142
    move-result-object p2

    .line 143
    iget p2, p2, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 144
    .line 145
    and-int/lit16 p2, p2, 0x400

    .line 146
    .line 147
    if-eqz p2, :cond_3

    .line 148
    .line 149
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 150
    .line 151
    .line 152
    move-result-object p2

    .line 153
    const-string p3, "dimen"

    .line 154
    .line 155
    const-string p4, "android"

    .line 156
    .line 157
    const-string p5, "status_bar_height"

    .line 158
    .line 159
    invoke-virtual {p2, p5, p3, p4}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 160
    .line 161
    .line 162
    move-result p3

    .line 163
    iget p4, p1, Lcom/xw/repo/BubbleSeekBar;->g0:F

    .line 164
    .line 165
    invoke-virtual {p2, p3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 166
    .line 167
    .line 168
    move-result p2

    .line 169
    int-to-float p2, p2

    .line 170
    add-float/2addr p4, p2

    .line 171
    iput p4, p1, Lcom/xw/repo/BubbleSeekBar;->g0:F

    .line 172
    .line 173
    :cond_3
    return-void
.end method

.method public final onMeasure(II)V
    .locals 8

    .line 1
    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/xw/repo/BubbleSeekBar;->h:I

    .line 5
    .line 6
    mul-int/lit8 v0, v0, 0x2

    .line 7
    .line 8
    iget-boolean v1, p0, Lcom/xw/repo/BubbleSeekBar;->t:Z

    .line 9
    .line 10
    const-string v2, "j"

    .line 11
    .line 12
    const/4 v3, 0x1

    .line 13
    const/4 v4, 0x0

    .line 14
    iget-object v5, p0, Lcom/xw/repo/BubbleSeekBar;->V:Landroid/graphics/Paint;

    .line 15
    .line 16
    iget-object v6, p0, Lcom/xw/repo/BubbleSeekBar;->W:Landroid/graphics/Rect;

    .line 17
    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    iget v1, p0, Lcom/xw/repo/BubbleSeekBar;->u:I

    .line 21
    .line 22
    int-to-float v1, v1

    .line 23
    invoke-virtual {v5, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v5, v2, v4, v3, v6}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v6}, Landroid/graphics/Rect;->height()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    add-int/2addr v0, v1

    .line 34
    :cond_0
    iget-boolean v1, p0, Lcom/xw/repo/BubbleSeekBar;->o:Z

    .line 35
    .line 36
    iget v7, p0, Lcom/xw/repo/BubbleSeekBar;->p:I

    .line 37
    .line 38
    if-eqz v1, :cond_1

    .line 39
    .line 40
    iget v1, p0, Lcom/xw/repo/BubbleSeekBar;->r:I

    .line 41
    .line 42
    if-lt v1, v3, :cond_1

    .line 43
    .line 44
    int-to-float v1, v7

    .line 45
    invoke-virtual {v5, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v5, v2, v4, v3, v6}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 49
    .line 50
    .line 51
    iget v1, p0, Lcom/xw/repo/BubbleSeekBar;->h:I

    .line 52
    .line 53
    mul-int/lit8 v1, v1, 0x2

    .line 54
    .line 55
    invoke-virtual {v6}, Landroid/graphics/Rect;->height()I

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    add-int/2addr v2, v1

    .line 60
    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    :cond_1
    iget v1, p0, Lcom/xw/repo/BubbleSeekBar;->O:I

    .line 65
    .line 66
    mul-int/lit8 v2, v1, 0x2

    .line 67
    .line 68
    add-int/2addr v2, v0

    .line 69
    const/16 v0, 0xb4

    .line 70
    .line 71
    invoke-static {v0}, Lw3/g;->a(I)I

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    invoke-static {v0, p1}, Landroid/view/View;->resolveSize(II)I

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    invoke-virtual {p0, v0, v2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    iget v2, p0, Lcom/xw/repo/BubbleSeekBar;->h:I

    .line 87
    .line 88
    add-int/2addr v0, v2

    .line 89
    int-to-float v0, v0

    .line 90
    iput v0, p0, Lcom/xw/repo/BubbleSeekBar;->T:F

    .line 91
    .line 92
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 97
    .line 98
    .line 99
    move-result v2

    .line 100
    sub-int/2addr v0, v2

    .line 101
    iget v2, p0, Lcom/xw/repo/BubbleSeekBar;->h:I

    .line 102
    .line 103
    sub-int/2addr v0, v2

    .line 104
    int-to-float v0, v0

    .line 105
    iput v0, p0, Lcom/xw/repo/BubbleSeekBar;->U:F

    .line 106
    .line 107
    iget-boolean v0, p0, Lcom/xw/repo/BubbleSeekBar;->o:Z

    .line 108
    .line 109
    const/high16 v2, 0x40000000    # 2.0f

    .line 110
    .line 111
    if-eqz v0, :cond_3

    .line 112
    .line 113
    int-to-float v0, v7

    .line 114
    invoke-virtual {v5, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 115
    .line 116
    .line 117
    iget v0, p0, Lcom/xw/repo/BubbleSeekBar;->r:I

    .line 118
    .line 119
    if-nez v0, :cond_2

    .line 120
    .line 121
    iget-object v0, p0, Lcom/xw/repo/BubbleSeekBar;->Q:Landroid/util/SparseArray;

    .line 122
    .line 123
    invoke-virtual {v0, v4}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    check-cast v0, Ljava/lang/String;

    .line 128
    .line 129
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 130
    .line 131
    .line 132
    move-result v2

    .line 133
    invoke-virtual {v5, v0, v4, v2, v6}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 134
    .line 135
    .line 136
    iget v0, p0, Lcom/xw/repo/BubbleSeekBar;->T:F

    .line 137
    .line 138
    invoke-virtual {v6}, Landroid/graphics/Rect;->width()I

    .line 139
    .line 140
    .line 141
    move-result v2

    .line 142
    add-int/2addr v2, v1

    .line 143
    int-to-float v2, v2

    .line 144
    add-float/2addr v0, v2

    .line 145
    iput v0, p0, Lcom/xw/repo/BubbleSeekBar;->T:F

    .line 146
    .line 147
    iget-object v0, p0, Lcom/xw/repo/BubbleSeekBar;->Q:Landroid/util/SparseArray;

    .line 148
    .line 149
    iget v2, p0, Lcom/xw/repo/BubbleSeekBar;->l:I

    .line 150
    .line 151
    invoke-virtual {v0, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    check-cast v0, Ljava/lang/String;

    .line 156
    .line 157
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 158
    .line 159
    .line 160
    move-result v2

    .line 161
    invoke-virtual {v5, v0, v4, v2, v6}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 162
    .line 163
    .line 164
    iget v0, p0, Lcom/xw/repo/BubbleSeekBar;->U:F

    .line 165
    .line 166
    invoke-virtual {v6}, Landroid/graphics/Rect;->width()I

    .line 167
    .line 168
    .line 169
    move-result v2

    .line 170
    add-int/2addr v2, v1

    .line 171
    int-to-float v1, v2

    .line 172
    sub-float/2addr v0, v1

    .line 173
    iput v0, p0, Lcom/xw/repo/BubbleSeekBar;->U:F

    .line 174
    .line 175
    goto/16 :goto_0

    .line 176
    .line 177
    :cond_2
    if-lt v0, v3, :cond_4

    .line 178
    .line 179
    iget-object v0, p0, Lcom/xw/repo/BubbleSeekBar;->Q:Landroid/util/SparseArray;

    .line 180
    .line 181
    invoke-virtual {v0, v4}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    check-cast v0, Ljava/lang/String;

    .line 186
    .line 187
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 188
    .line 189
    .line 190
    move-result v3

    .line 191
    invoke-virtual {v5, v0, v4, v3, v6}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 192
    .line 193
    .line 194
    iget v0, p0, Lcom/xw/repo/BubbleSeekBar;->h:I

    .line 195
    .line 196
    int-to-float v0, v0

    .line 197
    invoke-virtual {v6}, Landroid/graphics/Rect;->width()I

    .line 198
    .line 199
    .line 200
    move-result v3

    .line 201
    int-to-float v3, v3

    .line 202
    div-float/2addr v3, v2

    .line 203
    invoke-static {v0, v3}, Ljava/lang/Math;->max(FF)F

    .line 204
    .line 205
    .line 206
    move-result v0

    .line 207
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 208
    .line 209
    .line 210
    move-result v3

    .line 211
    int-to-float v3, v3

    .line 212
    add-float/2addr v3, v0

    .line 213
    int-to-float v0, v1

    .line 214
    add-float/2addr v3, v0

    .line 215
    iput v3, p0, Lcom/xw/repo/BubbleSeekBar;->T:F

    .line 216
    .line 217
    iget-object v0, p0, Lcom/xw/repo/BubbleSeekBar;->Q:Landroid/util/SparseArray;

    .line 218
    .line 219
    iget v3, p0, Lcom/xw/repo/BubbleSeekBar;->l:I

    .line 220
    .line 221
    invoke-virtual {v0, v3}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    check-cast v0, Ljava/lang/String;

    .line 226
    .line 227
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 228
    .line 229
    .line 230
    move-result v3

    .line 231
    invoke-virtual {v5, v0, v4, v3, v6}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 232
    .line 233
    .line 234
    iget v0, p0, Lcom/xw/repo/BubbleSeekBar;->h:I

    .line 235
    .line 236
    int-to-float v0, v0

    .line 237
    invoke-virtual {v6}, Landroid/graphics/Rect;->width()I

    .line 238
    .line 239
    .line 240
    move-result v3

    .line 241
    int-to-float v3, v3

    .line 242
    div-float/2addr v3, v2

    .line 243
    invoke-static {v0, v3}, Ljava/lang/Math;->max(FF)F

    .line 244
    .line 245
    .line 246
    move-result v0

    .line 247
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 248
    .line 249
    .line 250
    move-result v2

    .line 251
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 252
    .line 253
    .line 254
    move-result v3

    .line 255
    sub-int/2addr v2, v3

    .line 256
    int-to-float v2, v2

    .line 257
    sub-float/2addr v2, v0

    .line 258
    int-to-float v0, v1

    .line 259
    sub-float/2addr v2, v0

    .line 260
    iput v2, p0, Lcom/xw/repo/BubbleSeekBar;->U:F

    .line 261
    .line 262
    goto :goto_0

    .line 263
    :cond_3
    iget-boolean v0, p0, Lcom/xw/repo/BubbleSeekBar;->t:Z

    .line 264
    .line 265
    if-eqz v0, :cond_4

    .line 266
    .line 267
    iget v0, p0, Lcom/xw/repo/BubbleSeekBar;->r:I

    .line 268
    .line 269
    const/4 v3, -0x1

    .line 270
    if-ne v0, v3, :cond_4

    .line 271
    .line 272
    iget v0, p0, Lcom/xw/repo/BubbleSeekBar;->u:I

    .line 273
    .line 274
    int-to-float v0, v0

    .line 275
    invoke-virtual {v5, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 276
    .line 277
    .line 278
    iget-object v0, p0, Lcom/xw/repo/BubbleSeekBar;->Q:Landroid/util/SparseArray;

    .line 279
    .line 280
    invoke-virtual {v0, v4}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object v0

    .line 284
    check-cast v0, Ljava/lang/String;

    .line 285
    .line 286
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 287
    .line 288
    .line 289
    move-result v3

    .line 290
    invoke-virtual {v5, v0, v4, v3, v6}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 291
    .line 292
    .line 293
    iget v0, p0, Lcom/xw/repo/BubbleSeekBar;->h:I

    .line 294
    .line 295
    int-to-float v0, v0

    .line 296
    invoke-virtual {v6}, Landroid/graphics/Rect;->width()I

    .line 297
    .line 298
    .line 299
    move-result v3

    .line 300
    int-to-float v3, v3

    .line 301
    div-float/2addr v3, v2

    .line 302
    invoke-static {v0, v3}, Ljava/lang/Math;->max(FF)F

    .line 303
    .line 304
    .line 305
    move-result v0

    .line 306
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 307
    .line 308
    .line 309
    move-result v3

    .line 310
    int-to-float v3, v3

    .line 311
    add-float/2addr v3, v0

    .line 312
    int-to-float v0, v1

    .line 313
    add-float/2addr v3, v0

    .line 314
    iput v3, p0, Lcom/xw/repo/BubbleSeekBar;->T:F

    .line 315
    .line 316
    iget-object v0, p0, Lcom/xw/repo/BubbleSeekBar;->Q:Landroid/util/SparseArray;

    .line 317
    .line 318
    iget v3, p0, Lcom/xw/repo/BubbleSeekBar;->l:I

    .line 319
    .line 320
    invoke-virtual {v0, v3}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    move-result-object v0

    .line 324
    check-cast v0, Ljava/lang/String;

    .line 325
    .line 326
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 327
    .line 328
    .line 329
    move-result v3

    .line 330
    invoke-virtual {v5, v0, v4, v3, v6}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 331
    .line 332
    .line 333
    iget v0, p0, Lcom/xw/repo/BubbleSeekBar;->h:I

    .line 334
    .line 335
    int-to-float v0, v0

    .line 336
    invoke-virtual {v6}, Landroid/graphics/Rect;->width()I

    .line 337
    .line 338
    .line 339
    move-result v3

    .line 340
    int-to-float v3, v3

    .line 341
    div-float/2addr v3, v2

    .line 342
    invoke-static {v0, v3}, Ljava/lang/Math;->max(FF)F

    .line 343
    .line 344
    .line 345
    move-result v0

    .line 346
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 347
    .line 348
    .line 349
    move-result v2

    .line 350
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 351
    .line 352
    .line 353
    move-result v3

    .line 354
    sub-int/2addr v2, v3

    .line 355
    int-to-float v2, v2

    .line 356
    sub-float/2addr v2, v0

    .line 357
    int-to-float v0, v1

    .line 358
    sub-float/2addr v2, v0

    .line 359
    iput v2, p0, Lcom/xw/repo/BubbleSeekBar;->U:F

    .line 360
    .line 361
    :cond_4
    :goto_0
    iget v0, p0, Lcom/xw/repo/BubbleSeekBar;->U:F

    .line 362
    .line 363
    iget v1, p0, Lcom/xw/repo/BubbleSeekBar;->T:F

    .line 364
    .line 365
    sub-float/2addr v0, v1

    .line 366
    iput v0, p0, Lcom/xw/repo/BubbleSeekBar;->L:F

    .line 367
    .line 368
    const/high16 v1, 0x3f800000    # 1.0f

    .line 369
    .line 370
    mul-float/2addr v0, v1

    .line 371
    iget v1, p0, Lcom/xw/repo/BubbleSeekBar;->l:I

    .line 372
    .line 373
    int-to-float v1, v1

    .line 374
    div-float/2addr v0, v1

    .line 375
    iput v0, p0, Lcom/xw/repo/BubbleSeekBar;->M:F

    .line 376
    .line 377
    iget-boolean v0, p0, Lcom/xw/repo/BubbleSeekBar;->D:Z

    .line 378
    .line 379
    if-nez v0, :cond_5

    .line 380
    .line 381
    iget-object v0, p0, Lcom/xw/repo/BubbleSeekBar;->d0:Lw3/d;

    .line 382
    .line 383
    invoke-virtual {v0, p1, p2}, Landroid/view/View;->measure(II)V

    .line 384
    .line 385
    .line 386
    :cond_5
    return-void
.end method

.method public final onRestoreInstanceState(Landroid/os/Parcelable;)V
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
    iput v0, p0, Lcom/xw/repo/BubbleSeekBar;->c:F

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
    iget-object p1, p0, Lcom/xw/repo/BubbleSeekBar;->d0:Lw3/d;

    .line 25
    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    iget-boolean v0, p0, Lcom/xw/repo/BubbleSeekBar;->w:Z

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
    invoke-virtual {p1, v0}, Lw3/d;->a(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    :cond_1
    iget p1, p0, Lcom/xw/repo/BubbleSeekBar;->c:F

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

.method public final onSaveInstanceState()Landroid/os/Parcelable;
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
    iget v2, p0, Lcom/xw/repo/BubbleSeekBar;->c:F

    .line 18
    .line 19
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 20
    .line 21
    .line 22
    return-object v0
.end method

.method public final onSizeChanged(IIII)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Lw3/b;

    .line 5
    .line 6
    const/4 p2, 0x0

    .line 7
    invoke-direct {p1, p0, p2}, Lw3/b;-><init>(Lcom/xw/repo/BubbleSeekBar;I)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 9

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-boolean v1, p0, Lcom/xw/repo/BubbleSeekBar;->y:Z

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    iget-boolean v3, p0, Lcom/xw/repo/BubbleSeekBar;->D:Z

    .line 9
    .line 10
    iget-boolean v4, p0, Lcom/xw/repo/BubbleSeekBar;->x:Z

    .line 11
    .line 12
    const/4 v5, 0x1

    .line 13
    if-eqz v0, :cond_c

    .line 14
    .line 15
    if-eq v0, v5, :cond_6

    .line 16
    .line 17
    const/4 v6, 0x2

    .line 18
    if-eq v0, v6, :cond_0

    .line 19
    .line 20
    const/4 v1, 0x3

    .line 21
    if-eq v0, v1, :cond_6

    .line 22
    .line 23
    goto/16 :goto_8

    .line 24
    .line 25
    :cond_0
    iget-boolean v0, p0, Lcom/xw/repo/BubbleSeekBar;->N:Z

    .line 26
    .line 27
    if-eqz v0, :cond_1b

    .line 28
    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    invoke-virtual {p0, v0}, Lcom/xw/repo/BubbleSeekBar;->b(F)F

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    iget v1, p0, Lcom/xw/repo/BubbleSeekBar;->R:F

    .line 40
    .line 41
    cmpl-float v1, v0, v1

    .line 42
    .line 43
    if-eqz v1, :cond_1b

    .line 44
    .line 45
    iput v0, p0, Lcom/xw/repo/BubbleSeekBar;->R:F

    .line 46
    .line 47
    iput v0, p0, Lcom/xw/repo/BubbleSeekBar;->K:F

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    iget v1, p0, Lcom/xw/repo/BubbleSeekBar;->n0:F

    .line 55
    .line 56
    add-float/2addr v0, v1

    .line 57
    iput v0, p0, Lcom/xw/repo/BubbleSeekBar;->K:F

    .line 58
    .line 59
    iget v1, p0, Lcom/xw/repo/BubbleSeekBar;->T:F

    .line 60
    .line 61
    cmpg-float v0, v0, v1

    .line 62
    .line 63
    if-gez v0, :cond_2

    .line 64
    .line 65
    iput v1, p0, Lcom/xw/repo/BubbleSeekBar;->K:F

    .line 66
    .line 67
    :cond_2
    iget v0, p0, Lcom/xw/repo/BubbleSeekBar;->K:F

    .line 68
    .line 69
    iget v1, p0, Lcom/xw/repo/BubbleSeekBar;->U:F

    .line 70
    .line 71
    cmpl-float v0, v0, v1

    .line 72
    .line 73
    if-lez v0, :cond_3

    .line 74
    .line 75
    iput v1, p0, Lcom/xw/repo/BubbleSeekBar;->K:F

    .line 76
    .line 77
    :cond_3
    :goto_0
    invoke-virtual {p0}, Lcom/xw/repo/BubbleSeekBar;->d()F

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    iput v0, p0, Lcom/xw/repo/BubbleSeekBar;->c:F

    .line 82
    .line 83
    if-nez v3, :cond_5

    .line 84
    .line 85
    iget-object v0, p0, Lcom/xw/repo/BubbleSeekBar;->d0:Lw3/d;

    .line 86
    .line 87
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    if-eqz v1, :cond_5

    .line 92
    .line 93
    invoke-virtual {p0}, Lcom/xw/repo/BubbleSeekBar;->c()F

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    iput v1, p0, Lcom/xw/repo/BubbleSeekBar;->h0:F

    .line 98
    .line 99
    const/high16 v3, 0x3f000000    # 0.5f

    .line 100
    .line 101
    add-float/2addr v1, v3

    .line 102
    float-to-int v1, v1

    .line 103
    iget-object v3, p0, Lcom/xw/repo/BubbleSeekBar;->i0:Landroid/view/WindowManager$LayoutParams;

    .line 104
    .line 105
    iput v1, v3, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 106
    .line 107
    iget-object v1, p0, Lcom/xw/repo/BubbleSeekBar;->c0:Landroid/view/WindowManager;

    .line 108
    .line 109
    invoke-interface {v1, v0, v3}, Landroid/view/ViewManager;->updateViewLayout(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 110
    .line 111
    .line 112
    iget-boolean v1, p0, Lcom/xw/repo/BubbleSeekBar;->w:Z

    .line 113
    .line 114
    if-eqz v1, :cond_4

    .line 115
    .line 116
    invoke-virtual {p0}, Lcom/xw/repo/BubbleSeekBar;->getProgressFloat()F

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    invoke-static {v1}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    goto :goto_1

    .line 125
    :cond_4
    invoke-virtual {p0}, Lcom/xw/repo/BubbleSeekBar;->getProgress()I

    .line 126
    .line 127
    .line 128
    move-result v1

    .line 129
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    :goto_1
    invoke-virtual {v0, v1}, Lw3/d;->a(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    goto :goto_2

    .line 137
    :cond_5
    invoke-virtual {p0}, Lcom/xw/repo/BubbleSeekBar;->g()F

    .line 138
    .line 139
    .line 140
    :goto_2
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 141
    .line 142
    .line 143
    goto/16 :goto_8

    .line 144
    .line 145
    :cond_6
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    invoke-interface {v0, v2}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 150
    .line 151
    .line 152
    iget-boolean v0, p0, Lcom/xw/repo/BubbleSeekBar;->n:Z

    .line 153
    .line 154
    iget-wide v6, p0, Lcom/xw/repo/BubbleSeekBar;->A:J

    .line 155
    .line 156
    if-eqz v0, :cond_8

    .line 157
    .line 158
    if-eqz v4, :cond_7

    .line 159
    .line 160
    new-instance v0, Lw3/b;

    .line 161
    .line 162
    const/4 v1, 0x1

    .line 163
    invoke-direct {v0, p0, v1}, Lw3/b;-><init>(Lcom/xw/repo/BubbleSeekBar;I)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {p0, v0, v6, v7}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 167
    .line 168
    .line 169
    goto/16 :goto_8

    .line 170
    .line 171
    :cond_7
    invoke-virtual {p0}, Lcom/xw/repo/BubbleSeekBar;->a()V

    .line 172
    .line 173
    .line 174
    goto/16 :goto_8

    .line 175
    .line 176
    :cond_8
    iget-boolean v0, p0, Lcom/xw/repo/BubbleSeekBar;->N:Z

    .line 177
    .line 178
    if-nez v0, :cond_9

    .line 179
    .line 180
    if-eqz v4, :cond_1b

    .line 181
    .line 182
    :cond_9
    if-eqz v3, :cond_b

    .line 183
    .line 184
    invoke-virtual {p0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    invoke-virtual {v0, v6, v7}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    iget-boolean v1, p0, Lcom/xw/repo/BubbleSeekBar;->N:Z

    .line 193
    .line 194
    if-nez v1, :cond_a

    .line 195
    .line 196
    if-eqz v4, :cond_a

    .line 197
    .line 198
    const-wide/16 v6, 0x12c

    .line 199
    .line 200
    goto :goto_3

    .line 201
    :cond_a
    const-wide/16 v6, 0x0

    .line 202
    .line 203
    :goto_3
    invoke-virtual {v0, v6, v7}, Landroid/view/ViewPropertyAnimator;->setStartDelay(J)Landroid/view/ViewPropertyAnimator;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    new-instance v1, Lw3/c;

    .line 208
    .line 209
    const/4 v3, 0x0

    .line 210
    invoke-direct {v1, p0, v3}, Lw3/c;-><init>(Lcom/xw/repo/BubbleSeekBar;I)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 218
    .line 219
    .line 220
    goto/16 :goto_8

    .line 221
    .line 222
    :cond_b
    new-instance v0, Lw3/b;

    .line 223
    .line 224
    const/4 v1, 0x2

    .line 225
    invoke-direct {v0, p0, v1}, Lw3/b;-><init>(Lcom/xw/repo/BubbleSeekBar;I)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {p0, v0, v6, v7}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 229
    .line 230
    .line 231
    goto/16 :goto_8

    .line 232
    .line 233
    :cond_c
    invoke-super {p0}, Landroid/view/View;->performClick()Z

    .line 234
    .line 235
    .line 236
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 237
    .line 238
    .line 239
    move-result-object v0

    .line 240
    invoke-interface {v0, v5}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    .line 244
    .line 245
    .line 246
    move-result v0

    .line 247
    if-nez v0, :cond_e

    .line 248
    .line 249
    :cond_d
    move v0, v2

    .line 250
    goto :goto_5

    .line 251
    :cond_e
    iget v0, p0, Lcom/xw/repo/BubbleSeekBar;->L:F

    .line 252
    .line 253
    iget v6, p0, Lcom/xw/repo/BubbleSeekBar;->I:F

    .line 254
    .line 255
    div-float/2addr v0, v6

    .line 256
    iget v6, p0, Lcom/xw/repo/BubbleSeekBar;->c:F

    .line 257
    .line 258
    iget v7, p0, Lcom/xw/repo/BubbleSeekBar;->a:F

    .line 259
    .line 260
    sub-float/2addr v6, v7

    .line 261
    mul-float/2addr v6, v0

    .line 262
    iget-boolean v0, p0, Lcom/xw/repo/BubbleSeekBar;->E:Z

    .line 263
    .line 264
    if-eqz v0, :cond_f

    .line 265
    .line 266
    iget v0, p0, Lcom/xw/repo/BubbleSeekBar;->U:F

    .line 267
    .line 268
    sub-float/2addr v0, v6

    .line 269
    goto :goto_4

    .line 270
    :cond_f
    iget v0, p0, Lcom/xw/repo/BubbleSeekBar;->T:F

    .line 271
    .line 272
    add-float/2addr v0, v6

    .line 273
    :goto_4
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 274
    .line 275
    .line 276
    move-result v6

    .line 277
    int-to-float v6, v6

    .line 278
    const/high16 v7, 0x40000000    # 2.0f

    .line 279
    .line 280
    div-float/2addr v6, v7

    .line 281
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 282
    .line 283
    .line 284
    move-result v7

    .line 285
    sub-float/2addr v7, v0

    .line 286
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 287
    .line 288
    .line 289
    move-result v8

    .line 290
    sub-float/2addr v8, v0

    .line 291
    mul-float/2addr v8, v7

    .line 292
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 293
    .line 294
    .line 295
    move-result v0

    .line 296
    sub-float/2addr v0, v6

    .line 297
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 298
    .line 299
    .line 300
    move-result v7

    .line 301
    sub-float/2addr v7, v6

    .line 302
    mul-float/2addr v7, v0

    .line 303
    add-float/2addr v7, v8

    .line 304
    iget v0, p0, Lcom/xw/repo/BubbleSeekBar;->T:F

    .line 305
    .line 306
    const/16 v6, 0x8

    .line 307
    .line 308
    invoke-static {v6}, Lw3/g;->a(I)I

    .line 309
    .line 310
    .line 311
    move-result v8

    .line 312
    int-to-float v8, v8

    .line 313
    add-float/2addr v0, v8

    .line 314
    iget v8, p0, Lcom/xw/repo/BubbleSeekBar;->T:F

    .line 315
    .line 316
    invoke-static {v6}, Lw3/g;->a(I)I

    .line 317
    .line 318
    .line 319
    move-result v6

    .line 320
    int-to-float v6, v6

    .line 321
    add-float/2addr v8, v6

    .line 322
    mul-float/2addr v8, v0

    .line 323
    cmpg-float v0, v7, v8

    .line 324
    .line 325
    if-gtz v0, :cond_d

    .line 326
    .line 327
    move v0, v5

    .line 328
    :goto_5
    iput-boolean v0, p0, Lcom/xw/repo/BubbleSeekBar;->N:Z

    .line 329
    .line 330
    if-eqz v0, :cond_13

    .line 331
    .line 332
    iget-boolean v0, p0, Lcom/xw/repo/BubbleSeekBar;->z:Z

    .line 333
    .line 334
    if-eqz v0, :cond_10

    .line 335
    .line 336
    iget-boolean v0, p0, Lcom/xw/repo/BubbleSeekBar;->S:Z

    .line 337
    .line 338
    if-nez v0, :cond_10

    .line 339
    .line 340
    iput-boolean v5, p0, Lcom/xw/repo/BubbleSeekBar;->S:Z

    .line 341
    .line 342
    :cond_10
    iget-boolean v0, p0, Lcom/xw/repo/BubbleSeekBar;->B:Z

    .line 343
    .line 344
    if-eqz v0, :cond_11

    .line 345
    .line 346
    iget-boolean v0, p0, Lcom/xw/repo/BubbleSeekBar;->P:Z

    .line 347
    .line 348
    if-nez v0, :cond_11

    .line 349
    .line 350
    iput-boolean v5, p0, Lcom/xw/repo/BubbleSeekBar;->P:Z

    .line 351
    .line 352
    :cond_11
    if-nez v3, :cond_12

    .line 353
    .line 354
    invoke-virtual {p0}, Lcom/xw/repo/BubbleSeekBar;->h()V

    .line 355
    .line 356
    .line 357
    :cond_12
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 358
    .line 359
    .line 360
    goto/16 :goto_7

    .line 361
    .line 362
    :cond_13
    if-eqz v4, :cond_1a

    .line 363
    .line 364
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    .line 365
    .line 366
    .line 367
    move-result v0

    .line 368
    if-eqz v0, :cond_1a

    .line 369
    .line 370
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 371
    .line 372
    .line 373
    move-result v0

    .line 374
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 375
    .line 376
    .line 377
    move-result v6

    .line 378
    int-to-float v6, v6

    .line 379
    cmpl-float v0, v0, v6

    .line 380
    .line 381
    if-ltz v0, :cond_1a

    .line 382
    .line 383
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 384
    .line 385
    .line 386
    move-result v0

    .line 387
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 388
    .line 389
    .line 390
    move-result v6

    .line 391
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 392
    .line 393
    .line 394
    move-result v7

    .line 395
    sub-int/2addr v6, v7

    .line 396
    int-to-float v6, v6

    .line 397
    cmpg-float v0, v0, v6

    .line 398
    .line 399
    if-gtz v0, :cond_1a

    .line 400
    .line 401
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 402
    .line 403
    .line 404
    move-result v0

    .line 405
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 406
    .line 407
    .line 408
    move-result v6

    .line 409
    int-to-float v6, v6

    .line 410
    cmpl-float v0, v0, v6

    .line 411
    .line 412
    if-ltz v0, :cond_1a

    .line 413
    .line 414
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 415
    .line 416
    .line 417
    move-result v0

    .line 418
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 419
    .line 420
    .line 421
    move-result v6

    .line 422
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 423
    .line 424
    .line 425
    move-result v7

    .line 426
    sub-int/2addr v6, v7

    .line 427
    int-to-float v6, v6

    .line 428
    cmpg-float v0, v0, v6

    .line 429
    .line 430
    if-gtz v0, :cond_1a

    .line 431
    .line 432
    iput-boolean v5, p0, Lcom/xw/repo/BubbleSeekBar;->N:Z

    .line 433
    .line 434
    iget-boolean v0, p0, Lcom/xw/repo/BubbleSeekBar;->z:Z

    .line 435
    .line 436
    if-eqz v0, :cond_14

    .line 437
    .line 438
    iget-boolean v0, p0, Lcom/xw/repo/BubbleSeekBar;->S:Z

    .line 439
    .line 440
    if-nez v0, :cond_14

    .line 441
    .line 442
    iput-boolean v5, p0, Lcom/xw/repo/BubbleSeekBar;->S:Z

    .line 443
    .line 444
    :cond_14
    iget-boolean v0, p0, Lcom/xw/repo/BubbleSeekBar;->B:Z

    .line 445
    .line 446
    if-eqz v0, :cond_15

    .line 447
    .line 448
    invoke-virtual {p0}, Lcom/xw/repo/BubbleSeekBar;->f()V

    .line 449
    .line 450
    .line 451
    iput-boolean v5, p0, Lcom/xw/repo/BubbleSeekBar;->P:Z

    .line 452
    .line 453
    :cond_15
    if-eqz v1, :cond_16

    .line 454
    .line 455
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 456
    .line 457
    .line 458
    move-result v0

    .line 459
    invoke-virtual {p0, v0}, Lcom/xw/repo/BubbleSeekBar;->b(F)F

    .line 460
    .line 461
    .line 462
    move-result v0

    .line 463
    iput v0, p0, Lcom/xw/repo/BubbleSeekBar;->R:F

    .line 464
    .line 465
    iput v0, p0, Lcom/xw/repo/BubbleSeekBar;->K:F

    .line 466
    .line 467
    goto :goto_6

    .line 468
    :cond_16
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 469
    .line 470
    .line 471
    move-result v0

    .line 472
    iput v0, p0, Lcom/xw/repo/BubbleSeekBar;->K:F

    .line 473
    .line 474
    iget v1, p0, Lcom/xw/repo/BubbleSeekBar;->T:F

    .line 475
    .line 476
    cmpg-float v0, v0, v1

    .line 477
    .line 478
    if-gez v0, :cond_17

    .line 479
    .line 480
    iput v1, p0, Lcom/xw/repo/BubbleSeekBar;->K:F

    .line 481
    .line 482
    :cond_17
    iget v0, p0, Lcom/xw/repo/BubbleSeekBar;->K:F

    .line 483
    .line 484
    iget v1, p0, Lcom/xw/repo/BubbleSeekBar;->U:F

    .line 485
    .line 486
    cmpl-float v0, v0, v1

    .line 487
    .line 488
    if-lez v0, :cond_18

    .line 489
    .line 490
    iput v1, p0, Lcom/xw/repo/BubbleSeekBar;->K:F

    .line 491
    .line 492
    :cond_18
    :goto_6
    invoke-virtual {p0}, Lcom/xw/repo/BubbleSeekBar;->d()F

    .line 493
    .line 494
    .line 495
    move-result v0

    .line 496
    iput v0, p0, Lcom/xw/repo/BubbleSeekBar;->c:F

    .line 497
    .line 498
    if-nez v3, :cond_19

    .line 499
    .line 500
    invoke-virtual {p0}, Lcom/xw/repo/BubbleSeekBar;->c()F

    .line 501
    .line 502
    .line 503
    move-result v0

    .line 504
    iput v0, p0, Lcom/xw/repo/BubbleSeekBar;->h0:F

    .line 505
    .line 506
    invoke-virtual {p0}, Lcom/xw/repo/BubbleSeekBar;->h()V

    .line 507
    .line 508
    .line 509
    :cond_19
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 510
    .line 511
    .line 512
    :cond_1a
    :goto_7
    iget v0, p0, Lcom/xw/repo/BubbleSeekBar;->K:F

    .line 513
    .line 514
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 515
    .line 516
    .line 517
    move-result v1

    .line 518
    sub-float/2addr v0, v1

    .line 519
    iput v0, p0, Lcom/xw/repo/BubbleSeekBar;->n0:F

    .line 520
    .line 521
    :cond_1b
    :goto_8
    iget-boolean v0, p0, Lcom/xw/repo/BubbleSeekBar;->N:Z

    .line 522
    .line 523
    if-nez v0, :cond_1d

    .line 524
    .line 525
    if-nez v4, :cond_1d

    .line 526
    .line 527
    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 528
    .line 529
    .line 530
    move-result p1

    .line 531
    if-eqz p1, :cond_1c

    .line 532
    .line 533
    goto :goto_9

    .line 534
    :cond_1c
    return v2

    .line 535
    :cond_1d
    :goto_9
    return v5
.end method

.method public final onVisibilityChanged(Landroid/view/View;I)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/xw/repo/BubbleSeekBar;->D:Z

    .line 2
    .line 3
    if-nez v0, :cond_3

    .line 4
    .line 5
    iget-boolean v0, p0, Lcom/xw/repo/BubbleSeekBar;->B:Z

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
    invoke-virtual {p0}, Lcom/xw/repo/BubbleSeekBar;->f()V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    iget-boolean v0, p0, Lcom/xw/repo/BubbleSeekBar;->P:Z

    .line 17
    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/xw/repo/BubbleSeekBar;->h()V

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

.method public setBubbleColor(I)V
    .locals 1
    .param p1    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param

    .line 1
    iget v0, p0, Lcom/xw/repo/BubbleSeekBar;->F:I

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput p1, p0, Lcom/xw/repo/BubbleSeekBar;->F:I

    .line 6
    .line 7
    iget-object p1, p0, Lcom/xw/repo/BubbleSeekBar;->d0:Lw3/d;

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

.method public setCustomSectionTextArray(Lw3/e;)V
    .locals 3
    .param p1    # Lw3/e;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-interface {p1}, Lw3/e;->a()Landroid/util/SparseArray;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lcom/xw/repo/BubbleSeekBar;->Q:Landroid/util/SparseArray;

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    move v0, p1

    .line 9
    :goto_0
    iget v1, p0, Lcom/xw/repo/BubbleSeekBar;->l:I

    .line 10
    .line 11
    if-gt v0, v1, :cond_1

    .line 12
    .line 13
    iget-object v1, p0, Lcom/xw/repo/BubbleSeekBar;->Q:Landroid/util/SparseArray;

    .line 14
    .line 15
    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    if-nez v1, :cond_0

    .line 20
    .line 21
    iget-object v1, p0, Lcom/xw/repo/BubbleSeekBar;->Q:Landroid/util/SparseArray;

    .line 22
    .line 23
    const-string v2, ""

    .line 24
    .line 25
    invoke-virtual {v1, v0, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    iput-boolean p1, p0, Lcom/xw/repo/BubbleSeekBar;->t:Z

    .line 32
    .line 33
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public setOnProgressChangedListener(Lw3/f;)V
    .locals 0

    .line 1
    return-void
.end method

.method public setProgress(F)V
    .locals 2

    .line 1
    iput p1, p0, Lcom/xw/repo/BubbleSeekBar;->c:F

    .line 2
    .line 3
    iget-boolean p1, p0, Lcom/xw/repo/BubbleSeekBar;->D:Z

    .line 4
    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/xw/repo/BubbleSeekBar;->c()F

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    iput p1, p0, Lcom/xw/repo/BubbleSeekBar;->h0:F

    .line 12
    .line 13
    :cond_0
    iget-boolean p1, p0, Lcom/xw/repo/BubbleSeekBar;->B:Z

    .line 14
    .line 15
    if-eqz p1, :cond_1

    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/xw/repo/BubbleSeekBar;->f()V

    .line 18
    .line 19
    .line 20
    new-instance p1, Lw3/b;

    .line 21
    .line 22
    const/4 v0, 0x3

    .line 23
    invoke-direct {p1, p0, v0}, Lw3/b;-><init>(Lcom/xw/repo/BubbleSeekBar;I)V

    .line 24
    .line 25
    .line 26
    iget-wide v0, p0, Lcom/xw/repo/BubbleSeekBar;->C:J

    .line 27
    .line 28
    invoke-virtual {p0, p1, v0, v1}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 29
    .line 30
    .line 31
    :cond_1
    iget-boolean p1, p0, Lcom/xw/repo/BubbleSeekBar;->z:Z

    .line 32
    .line 33
    if-eqz p1, :cond_2

    .line 34
    .line 35
    const/4 p1, 0x0

    .line 36
    iput-boolean p1, p0, Lcom/xw/repo/BubbleSeekBar;->S:Z

    .line 37
    .line 38
    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public setSecondTrackColor(I)V
    .locals 1
    .param p1    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param

    .line 1
    iget v0, p0, Lcom/xw/repo/BubbleSeekBar;->j:I

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput p1, p0, Lcom/xw/repo/BubbleSeekBar;->j:I

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

.method public setTrackColor(I)V
    .locals 1
    .param p1    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param

    .line 1
    iget v0, p0, Lcom/xw/repo/BubbleSeekBar;->i:I

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput p1, p0, Lcom/xw/repo/BubbleSeekBar;->i:I

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method
