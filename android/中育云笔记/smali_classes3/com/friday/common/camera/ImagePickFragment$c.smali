.class public final Lcom/friday/common/camera/ImagePickFragment$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/common/camera/ImagePickFragment;->D()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic c:Lcom/friday/common/camera/ImagePickFragment;

.field public final synthetic d:Landroid/view/ScaleGestureDetector;


# direct methods
.method public constructor <init>(Lcom/friday/common/camera/ImagePickFragment;Landroid/view/ScaleGestureDetector;)V
    .locals 0

    iput-object p1, p0, Lcom/friday/common/camera/ImagePickFragment$c;->c:Lcom/friday/common/camera/ImagePickFragment;

    iput-object p2, p0, Lcom/friday/common/camera/ImagePickFragment$c;->d:Landroid/view/ScaleGestureDetector;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 4

    .line 1
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 v0, 0x1

    .line 6
    if-nez p1, :cond_2

    .line 7
    .line 8
    iget-object p1, p0, Lcom/friday/common/camera/ImagePickFragment$c;->c:Lcom/friday/common/camera/ImagePickFragment;

    .line 9
    .line 10
    invoke-static {p1}, Lcom/friday/common/camera/ImagePickFragment;->z(Lcom/friday/common/camera/ImagePickFragment;)Lcom/friday/common/databinding/FragmentImagePickBinding;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    const/4 v1, 0x0

    .line 15
    const-string v2, "mBindView"

    .line 16
    .line 17
    if-nez p1, :cond_0

    .line 18
    .line 19
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    move-object p1, v1

    .line 23
    :cond_0
    iget-object p1, p1, Lcom/friday/common/databinding/FragmentImagePickBinding;->f:Landroidx/cardview/widget/CardView;

    .line 24
    .line 25
    const-string v3, "cvZoomValue"

    .line 26
    .line 27
    invoke-static {p1, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    const/4 v3, 0x0

    .line 31
    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 32
    .line 33
    .line 34
    iget-object p1, p0, Lcom/friday/common/camera/ImagePickFragment$c;->c:Lcom/friday/common/camera/ImagePickFragment;

    .line 35
    .line 36
    invoke-static {p1}, Lcom/friday/common/camera/ImagePickFragment;->z(Lcom/friday/common/camera/ImagePickFragment;)Lcom/friday/common/databinding/FragmentImagePickBinding;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    if-nez p1, :cond_1

    .line 41
    .line 42
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    move-object v1, p1

    .line 47
    :goto_0
    iget-object p1, v1, Lcom/friday/common/databinding/FragmentImagePickBinding;->g:Lcom/friday/common/camera/ZoomControlView;

    .line 48
    .line 49
    const-string v1, "dbView"

    .line 50
    .line 51
    invoke-static {p1, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    const/16 v1, 0x8

    .line 55
    .line 56
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 57
    .line 58
    .line 59
    iget-object p1, p0, Lcom/friday/common/camera/ImagePickFragment$c;->c:Lcom/friday/common/camera/ImagePickFragment;

    .line 60
    .line 61
    invoke-static {p1}, Lcom/friday/common/camera/ImagePickFragment;->C(Lcom/friday/common/camera/ImagePickFragment;)V

    .line 62
    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_2
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    if-ne p1, v0, :cond_3

    .line 70
    .line 71
    iget-object p1, p0, Lcom/friday/common/camera/ImagePickFragment$c;->c:Lcom/friday/common/camera/ImagePickFragment;

    .line 72
    .line 73
    invoke-static {p1}, Lcom/friday/common/camera/ImagePickFragment;->A(Lcom/friday/common/camera/ImagePickFragment;)Lcom/friday/common/camera/CameraViewModel;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    invoke-virtual {p1, v1, v2}, Lcom/friday/common/camera/CameraViewModel;->h(FF)V

    .line 86
    .line 87
    .line 88
    :cond_3
    :goto_1
    iget-object p1, p0, Lcom/friday/common/camera/ImagePickFragment$c;->d:Landroid/view/ScaleGestureDetector;

    .line 89
    .line 90
    invoke-virtual {p1, p2}, Landroid/view/ScaleGestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 91
    .line 92
    .line 93
    return v0
.end method
