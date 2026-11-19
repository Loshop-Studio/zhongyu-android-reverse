.class public final Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# instance fields
.field public c:Z

.field public d:Z

.field public e:Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;

.field public f:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public g:Landroid/widget/ImageView;

.field public h:Landroid/widget/ImageView;

.field public i:Landroid/graphics/Bitmap;

.field public j:Landroid/widget/ImageView;

.field public k:Landroid/widget/ImageView;

.field public l:Landroid/widget/ImageView;

.field public m:Landroid/widget/ImageView;

.field public n:Landroid/widget/ImageView;

.field public o:Landroidx/constraintlayout/widget/Group;

.field public p:Lcom/google/android/material/tabs/TabLayout;

.field public q:Landroid/view/View;

.field public r:Landroid/view/View;

.field public s:Landroid/widget/ImageView;

.field public t:Landroidx/cardview/widget/CardView;

.field public u:Landroid/widget/TextView;

.field public v:Landroid/widget/TextView;

.field public w:Landroid/widget/TextView;

.field public x:I

.field public y:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 7
    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    iput-boolean p1, p0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->c:Z

    .line 11
    .line 12
    iput-boolean p1, p0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->d:Z

    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->A()V

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x4

    .line 18
    iput v0, p0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->x:I

    .line 19
    .line 20
    iput p1, p0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->y:I

    .line 21
    .line 22
    return-void
.end method

.method public static final B(Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;Landroid/widget/TextView;Landroid/view/View;)V
    .locals 1

    .line 1
    iget p2, p0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->x:I

    .line 2
    .line 3
    const/4 v0, 0x3

    .line 4
    if-gt v0, p2, :cond_0

    .line 5
    .line 6
    const/16 v0, 0x9

    .line 7
    .line 8
    if-ge p2, v0, :cond_0

    .line 9
    .line 10
    add-int/lit8 p2, p2, -0x1

    .line 11
    .line 12
    iput p2, p0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->x:I

    .line 13
    .line 14
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method public static final C(Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;Landroid/widget/TextView;Landroid/view/View;)V
    .locals 1

    .line 1
    iget p2, p0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->x:I

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    if-gt v0, p2, :cond_0

    .line 5
    .line 6
    const/16 v0, 0x8

    .line 7
    .line 8
    if-ge p2, v0, :cond_0

    .line 9
    .line 10
    add-int/lit8 p2, p2, 0x1

    .line 11
    .line 12
    iput p2, p0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->x:I

    .line 13
    .line 14
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method public static final D(Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;Landroid/view/View;)V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p1, v0}, Landroid/view/View;->setSelected(Z)V

    .line 3
    .line 4
    .line 5
    iget-object p1, p0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->v:Landroid/widget/TextView;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setSelected(Z)V

    .line 11
    .line 12
    .line 13
    :cond_0
    iput-boolean v0, p0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->d:Z

    .line 14
    .line 15
    return-void
.end method

.method public static final E(Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;Landroid/view/View;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p1, v0}, Landroid/view/View;->setSelected(Z)V

    .line 3
    .line 4
    .line 5
    iget-object p1, p0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->u:Landroid/widget/TextView;

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setSelected(Z)V

    .line 11
    .line 12
    .line 13
    :cond_0
    iput-boolean v0, p0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->d:Z

    .line 14
    .line 15
    return-void
.end method

.method public static final F(Landroid/view/View;)V
    .locals 0

    .line 1
    sget-object p0, Ld3/a;->a:Ld3/a;

    .line 2
    .line 3
    invoke-virtual {p0}, Ld3/a;->a()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static final G(Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->x()V

    .line 2
    .line 3
    .line 4
    sget-object p0, Lk2/v;->a:Lk2/v$a;

    .line 5
    .line 6
    const-string p1, "Test"

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lk2/v$a;->a(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public static final H(Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;Landroid/widget/TextView;Landroid/view/View;)V
    .locals 1

    .line 1
    iget p2, p0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->y:I

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    if-gt v0, p2, :cond_0

    .line 5
    .line 6
    const/16 v0, 0xb

    .line 7
    .line 8
    if-ge p2, v0, :cond_0

    .line 9
    .line 10
    add-int/lit8 p2, p2, -0x1

    .line 11
    .line 12
    iput p2, p0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->y:I

    .line 13
    .line 14
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method public static final I(Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;Landroid/widget/TextView;Landroid/view/View;)V
    .locals 2

    .line 1
    iget p2, p0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->y:I

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-gt v0, p2, :cond_0

    .line 5
    .line 6
    const/16 v1, 0xa

    .line 7
    .line 8
    if-ge p2, v1, :cond_0

    .line 9
    .line 10
    add-int/2addr p2, v0

    .line 11
    iput p2, p0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->y:I

    .line 12
    .line 13
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public static final J(Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;Landroid/view/View;)V
    .locals 2

    .line 1
    const-class p1, Lcom/friday/common/activity/PusherService;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/blankj/utilcode/util/ServiceUtils;->isServiceRunning(Ljava/lang/Class;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    sget-object p0, Lcom/friday/lecture/floatwindow/homework/b;->d:Lcom/friday/lecture/floatwindow/homework/b$a;

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/friday/lecture/floatwindow/homework/b$a;->a()Lcom/friday/lecture/floatwindow/homework/b;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {p0}, Lcom/friday/lecture/floatwindow/homework/b;->g()V

    .line 16
    .line 17
    .line 18
    const-string p0, "key_screen_capture"

    .line 19
    .line 20
    invoke-static {p0}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/String;)Lcom/jeremyliao/liveeventbus/core/Observable;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    const/4 p1, 0x0

    .line 25
    const-wide/16 v0, 0x64

    .line 26
    .line 27
    invoke-interface {p0, p1, v0, v1}, Lcom/jeremyliao/liveeventbus/core/Observable;->postDelay(Ljava/lang/Object;J)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-static {p0}, Lk2/k;->k(Landroid/content/Context;)Lk2/k;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    const-string p1, "\u622a\u56fe\u5931\u8d25\uff0c\u8bf7\u7a0d\u540e\u91cd\u8bd5"

    .line 40
    .line 41
    invoke-virtual {p0, p1}, Lk2/k;->n(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public static final K(Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->e:Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;

    .line 2
    .line 3
    const/16 v0, 0x8

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-object p1, p0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->f:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 11
    .line 12
    if-eqz p1, :cond_1

    .line 13
    .line 14
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 15
    .line 16
    .line 17
    :cond_1
    iget-object p1, p0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->e:Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;

    .line 18
    .line 19
    if-eqz p1, :cond_2

    .line 20
    .line 21
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->getCroppedImage()Landroid/graphics/Bitmap;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    goto :goto_0

    .line 26
    :cond_2
    const/4 p1, 0x0

    .line 27
    :goto_0
    iput-object p1, p0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->i:Landroid/graphics/Bitmap;

    .line 28
    .line 29
    iget-object v1, p0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->m:Landroid/widget/ImageView;

    .line 30
    .line 31
    if-eqz v1, :cond_3

    .line 32
    .line 33
    invoke-virtual {v1, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 34
    .line 35
    .line 36
    :cond_3
    iget-object p1, p0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->n:Landroid/widget/ImageView;

    .line 37
    .line 38
    if-eqz p1, :cond_4

    .line 39
    .line 40
    const/4 v1, 0x0

    .line 41
    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 42
    .line 43
    .line 44
    :cond_4
    iget-object p0, p0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->w:Landroid/widget/TextView;

    .line 45
    .line 46
    if-eqz p0, :cond_5

    .line 47
    .line 48
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 49
    .line 50
    .line 51
    :cond_5
    return-void
.end method

.method public static final L(Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->e:Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;

    .line 2
    .line 3
    const/16 v0, 0x8

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-object p1, p0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->f:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 11
    .line 12
    if-eqz p1, :cond_1

    .line 13
    .line 14
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 15
    .line 16
    .line 17
    :cond_1
    iget-object p0, p0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->o:Landroidx/constraintlayout/widget/Group;

    .line 18
    .line 19
    if-eqz p0, :cond_2

    .line 20
    .line 21
    const/4 p1, 0x0

    .line 22
    invoke-virtual {p0, p1}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 23
    .line 24
    .line 25
    :cond_2
    return-void
.end method

.method public static final M(Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;Landroid/view/View;)V
    .locals 1

    .line 1
    sget-object p1, Lcom/friday/lecture/floatwindow/homework/b;->d:Lcom/friday/lecture/floatwindow/homework/b$a;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/friday/lecture/floatwindow/homework/b$a;->a()Lcom/friday/lecture/floatwindow/homework/b;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1}, Lcom/friday/lecture/floatwindow/homework/b;->g()V

    .line 8
    .line 9
    .line 10
    invoke-static {}, Lcom/blankj/utilcode/util/ActivityUtils;->getTopActivity()Landroid/app/Activity;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-static {p1}, Lk6/f;->a(Landroid/app/Activity;)Lk6/f;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-static {}, Ll6/d;->c()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    invoke-virtual {p1, v0}, Lk6/f;->d(I)Lk6/e;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    const/4 v0, 0x1

    .line 27
    invoke-virtual {p1, v0}, Lk6/e;->d(I)Lk6/e;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    const/4 v0, 0x0

    .line 32
    invoke-virtual {p1, v0}, Lk6/e;->b(Z)Lk6/e;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-static {}, Lk2/r;->g()Lk2/r;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {p1, v0}, Lk6/e;->c(Ln6/a;)Lk6/e;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    new-instance v0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout$initView$8$1;

    .line 45
    .line 46
    invoke-direct {v0, p0}, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout$initView$8$1;-><init>(Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1, v0}, Lk6/e;->a(Lq6/l;)V

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method public static final N(Landroid/view/View;)V
    .locals 1

    .line 1
    const-string p0, "CAMERA"

    .line 2
    .line 3
    filled-new-array {p0}, [Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-static {p0}, Lcom/blankj/utilcode/util/PermissionUtils;->permission([Ljava/lang/String;)Lcom/blankj/utilcode/util/PermissionUtils;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    new-instance v0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout$b;

    .line 12
    .line 13
    invoke-direct {v0}, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout$b;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v0}, Lcom/blankj/utilcode/util/PermissionUtils;->callback(Lcom/blankj/utilcode/util/PermissionUtils$SimpleCallback;)Lcom/blankj/utilcode/util/PermissionUtils;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {p0}, Lcom/blankj/utilcode/util/PermissionUtils;->request()V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public static final O(Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->m:Landroid/widget/ImageView;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 7
    .line 8
    .line 9
    :cond_0
    iget-object p1, p0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->n:Landroid/widget/ImageView;

    .line 10
    .line 11
    if-eqz p1, :cond_1

    .line 12
    .line 13
    const/16 v1, 0x8

    .line 14
    .line 15
    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 16
    .line 17
    .line 18
    :cond_1
    iget-object p1, p0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->o:Landroidx/constraintlayout/widget/Group;

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    if-eqz p1, :cond_2

    .line 22
    .line 23
    invoke-virtual {p1, v1}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 24
    .line 25
    .line 26
    :cond_2
    iget-object p1, p0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->w:Landroid/widget/TextView;

    .line 27
    .line 28
    if-eqz p1, :cond_3

    .line 29
    .line 30
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 31
    .line 32
    .line 33
    :cond_3
    iput-object v0, p0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->i:Landroid/graphics/Bitmap;

    .line 34
    .line 35
    return-void
.end method

.method public static synthetic a(Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;Landroid/widget/TextView;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->C(Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;Landroid/widget/TextView;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic b(Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;Landroid/widget/TextView;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->B(Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;Landroid/widget/TextView;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic c(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->F(Landroid/view/View;)V

    return-void
.end method

.method public static synthetic d(Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->O(Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic e(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->N(Landroid/view/View;)V

    return-void
.end method

.method public static synthetic f(Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->M(Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic g(Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->K(Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic h(Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->E(Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic i(Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->J(Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic j(Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;Landroid/widget/TextView;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->I(Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;Landroid/widget/TextView;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic k(Landroid/graphics/Bitmap;Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->z(Landroid/graphics/Bitmap;Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;)V

    return-void
.end method

.method public static synthetic l(Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->D(Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic m(Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;Landroid/widget/TextView;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->H(Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;Landroid/widget/TextView;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic n(Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->G(Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic o(Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->L(Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;Landroid/view/View;)V

    return-void
.end method

.method public static final synthetic p(Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;)Landroid/graphics/Bitmap;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->i:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic q(Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;)Landroid/view/View;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->r:Landroid/view/View;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic r(Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;)Landroid/view/View;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->q:Landroid/view/View;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic s(Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->x:I

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic t(Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->y:I

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic u(Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->d:Z

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic v(Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->c:Z

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic w(Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->c:Z

    .line 2
    .line 3
    return-void
.end method

.method public static final z(Landroid/graphics/Bitmap;Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;)V
    .locals 2

    .line 1
    if-eqz p0, :cond_3

    .line 2
    .line 3
    iget-object v0, p1, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->e:Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 9
    .line 10
    .line 11
    :cond_0
    iget-object v0, p1, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->e:Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {v0, p0}, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 16
    .line 17
    .line 18
    :cond_1
    iget-object p0, p1, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->o:Landroidx/constraintlayout/widget/Group;

    .line 19
    .line 20
    if-eqz p0, :cond_2

    .line 21
    .line 22
    const/16 v0, 0x8

    .line 23
    .line 24
    invoke-virtual {p0, v0}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 25
    .line 26
    .line 27
    :cond_2
    iget-object p0, p1, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->f:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 28
    .line 29
    if-eqz p0, :cond_3

    .line 30
    .line 31
    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 32
    .line 33
    .line 34
    :cond_3
    sget-object p0, Lcom/friday/lecture/floatwindow/homework/b;->d:Lcom/friday/lecture/floatwindow/homework/b$a;

    .line 35
    .line 36
    invoke-virtual {p0}, Lcom/friday/lecture/floatwindow/homework/b$a;->a()Lcom/friday/lecture/floatwindow/homework/b;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-virtual {p0}, Lcom/friday/lecture/floatwindow/homework/b;->i()V

    .line 41
    .line 42
    .line 43
    return-void
.end method


# virtual methods
.method public final A()V
    .locals 8

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget v1, Lcom/friday/lecture/R$layout;->window_lecture_homework:I

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 13
    .line 14
    .line 15
    sget v0, Lcom/friday/lecture/R$id;->iv_capture:I

    .line 16
    .line 17
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Landroid/widget/ImageView;

    .line 22
    .line 23
    iput-object v0, p0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->j:Landroid/widget/ImageView;

    .line 24
    .line 25
    sget v0, Lcom/friday/lecture/R$id;->iv_photograph:I

    .line 26
    .line 27
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, Landroid/widget/ImageView;

    .line 32
    .line 33
    iput-object v0, p0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->k:Landroid/widget/ImageView;

    .line 34
    .line 35
    sget v0, Lcom/friday/lecture/R$id;->iv_homework:I

    .line 36
    .line 37
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    check-cast v0, Landroid/widget/ImageView;

    .line 42
    .line 43
    iput-object v0, p0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->m:Landroid/widget/ImageView;

    .line 44
    .line 45
    sget v0, Lcom/friday/lecture/R$id;->iv_delete:I

    .line 46
    .line 47
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    check-cast v0, Landroid/widget/ImageView;

    .line 52
    .line 53
    iput-object v0, p0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->n:Landroid/widget/ImageView;

    .line 54
    .line 55
    sget v0, Lcom/friday/lecture/R$id;->iv_photo_album:I

    .line 56
    .line 57
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    check-cast v0, Landroid/widget/ImageView;

    .line 62
    .line 63
    iput-object v0, p0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->l:Landroid/widget/ImageView;

    .line 64
    .line 65
    sget v0, Lcom/friday/lecture/R$id;->group_get_image:I

    .line 66
    .line 67
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    check-cast v0, Landroidx/constraintlayout/widget/Group;

    .line 72
    .line 73
    iput-object v0, p0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->o:Landroidx/constraintlayout/widget/Group;

    .line 74
    .line 75
    sget v0, Lcom/friday/lecture/R$id;->tab_layout:I

    .line 76
    .line 77
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    check-cast v0, Lcom/google/android/material/tabs/TabLayout;

    .line 82
    .line 83
    iput-object v0, p0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->p:Lcom/google/android/material/tabs/TabLayout;

    .line 84
    .line 85
    sget v0, Lcom/friday/lecture/R$id;->layout_subjective:I

    .line 86
    .line 87
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    iput-object v0, p0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->q:Landroid/view/View;

    .line 92
    .line 93
    sget v0, Lcom/friday/lecture/R$id;->layout_objective:I

    .line 94
    .line 95
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    iput-object v0, p0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->r:Landroid/view/View;

    .line 100
    .line 101
    sget v0, Lcom/friday/lecture/R$id;->iv_close:I

    .line 102
    .line 103
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    check-cast v0, Landroid/widget/ImageView;

    .line 108
    .line 109
    iput-object v0, p0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->s:Landroid/widget/ImageView;

    .line 110
    .line 111
    sget v0, Lcom/friday/lecture/R$id;->cv_arrange:I

    .line 112
    .line 113
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    check-cast v0, Landroidx/cardview/widget/CardView;

    .line 118
    .line 119
    iput-object v0, p0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->t:Landroidx/cardview/widget/CardView;

    .line 120
    .line 121
    sget v0, Lcom/friday/lecture/R$id;->tv_single_option:I

    .line 122
    .line 123
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    check-cast v0, Landroid/widget/TextView;

    .line 128
    .line 129
    iput-object v0, p0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->u:Landroid/widget/TextView;

    .line 130
    .line 131
    sget v0, Lcom/friday/lecture/R$id;->tv_multi_options:I

    .line 132
    .line 133
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    check-cast v0, Landroid/widget/TextView;

    .line 138
    .line 139
    iput-object v0, p0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->v:Landroid/widget/TextView;

    .line 140
    .line 141
    sget v0, Lcom/friday/lecture/R$id;->tv_tips:I

    .line 142
    .line 143
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    check-cast v0, Landroid/widget/TextView;

    .line 148
    .line 149
    iput-object v0, p0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->w:Landroid/widget/TextView;

    .line 150
    .line 151
    sget v0, Lcom/friday/lecture/R$id;->iv_screen_capture:I

    .line 152
    .line 153
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    check-cast v0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;

    .line 158
    .line 159
    iput-object v0, p0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->e:Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;

    .line 160
    .line 161
    sget v0, Lcom/friday/lecture/R$id;->ll_crop:I

    .line 162
    .line 163
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 168
    .line 169
    iput-object v0, p0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->f:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 170
    .line 171
    sget v0, Lcom/friday/lecture/R$id;->iv_cancel:I

    .line 172
    .line 173
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    check-cast v0, Landroid/widget/ImageView;

    .line 178
    .line 179
    iput-object v0, p0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->g:Landroid/widget/ImageView;

    .line 180
    .line 181
    sget v0, Lcom/friday/lecture/R$id;->iv_ensure:I

    .line 182
    .line 183
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    check-cast v0, Landroid/widget/ImageView;

    .line 188
    .line 189
    iput-object v0, p0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->h:Landroid/widget/ImageView;

    .line 190
    .line 191
    sget v0, Lcom/friday/lecture/R$id;->iv_minus_option:I

    .line 192
    .line 193
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    check-cast v0, Landroid/widget/ImageView;

    .line 198
    .line 199
    sget v1, Lcom/friday/lecture/R$id;->iv_plus_option:I

    .line 200
    .line 201
    invoke-virtual {p0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 202
    .line 203
    .line 204
    move-result-object v1

    .line 205
    check-cast v1, Landroid/widget/ImageView;

    .line 206
    .line 207
    sget v2, Lcom/friday/lecture/R$id;->iv_minus_question:I

    .line 208
    .line 209
    invoke-virtual {p0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 210
    .line 211
    .line 212
    move-result-object v2

    .line 213
    check-cast v2, Landroid/widget/ImageView;

    .line 214
    .line 215
    sget v3, Lcom/friday/lecture/R$id;->iv_plus_question:I

    .line 216
    .line 217
    invoke-virtual {p0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 218
    .line 219
    .line 220
    move-result-object v3

    .line 221
    check-cast v3, Landroid/widget/ImageView;

    .line 222
    .line 223
    sget v4, Lcom/friday/lecture/R$id;->tv_option_count:I

    .line 224
    .line 225
    invoke-virtual {p0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 226
    .line 227
    .line 228
    move-result-object v4

    .line 229
    check-cast v4, Landroid/widget/TextView;

    .line 230
    .line 231
    sget v5, Lcom/friday/lecture/R$id;->tv_question_count:I

    .line 232
    .line 233
    invoke-virtual {p0, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 234
    .line 235
    .line 236
    move-result-object v5

    .line 237
    check-cast v5, Landroid/widget/TextView;

    .line 238
    .line 239
    iget-object v6, p0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->u:Landroid/widget/TextView;

    .line 240
    .line 241
    if-eqz v6, :cond_0

    .line 242
    .line 243
    const/4 v7, 0x1

    .line 244
    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setSelected(Z)V

    .line 245
    .line 246
    .line 247
    :cond_0
    new-instance v6, Lf3/a;

    .line 248
    .line 249
    invoke-direct {v6, p0, v4}, Lf3/a;-><init>(Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;Landroid/widget/TextView;)V

    .line 250
    .line 251
    .line 252
    invoke-virtual {v0, v6}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 253
    .line 254
    .line 255
    new-instance v0, Lf3/k;

    .line 256
    .line 257
    invoke-direct {v0, p0, v4}, Lf3/k;-><init>(Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;Landroid/widget/TextView;)V

    .line 258
    .line 259
    .line 260
    invoke-virtual {v1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 261
    .line 262
    .line 263
    new-instance v0, Lf3/l;

    .line 264
    .line 265
    invoke-direct {v0, p0, v5}, Lf3/l;-><init>(Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;Landroid/widget/TextView;)V

    .line 266
    .line 267
    .line 268
    invoke-virtual {v2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 269
    .line 270
    .line 271
    new-instance v0, Lf3/m;

    .line 272
    .line 273
    invoke-direct {v0, p0, v5}, Lf3/m;-><init>(Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;Landroid/widget/TextView;)V

    .line 274
    .line 275
    .line 276
    invoke-virtual {v3, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 277
    .line 278
    .line 279
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->j:Landroid/widget/ImageView;

    .line 280
    .line 281
    if-eqz v0, :cond_1

    .line 282
    .line 283
    new-instance v1, Lf3/n;

    .line 284
    .line 285
    invoke-direct {v1, p0}, Lf3/n;-><init>(Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;)V

    .line 286
    .line 287
    .line 288
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 289
    .line 290
    .line 291
    :cond_1
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->h:Landroid/widget/ImageView;

    .line 292
    .line 293
    if-eqz v0, :cond_2

    .line 294
    .line 295
    new-instance v1, Lf3/o;

    .line 296
    .line 297
    invoke-direct {v1, p0}, Lf3/o;-><init>(Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;)V

    .line 298
    .line 299
    .line 300
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 301
    .line 302
    .line 303
    :cond_2
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->g:Landroid/widget/ImageView;

    .line 304
    .line 305
    if-eqz v0, :cond_3

    .line 306
    .line 307
    new-instance v1, Lf3/b;

    .line 308
    .line 309
    invoke-direct {v1, p0}, Lf3/b;-><init>(Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;)V

    .line 310
    .line 311
    .line 312
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 313
    .line 314
    .line 315
    :cond_3
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->l:Landroid/widget/ImageView;

    .line 316
    .line 317
    if-eqz v0, :cond_4

    .line 318
    .line 319
    new-instance v1, Lf3/c;

    .line 320
    .line 321
    invoke-direct {v1, p0}, Lf3/c;-><init>(Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;)V

    .line 322
    .line 323
    .line 324
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 325
    .line 326
    .line 327
    :cond_4
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->k:Landroid/widget/ImageView;

    .line 328
    .line 329
    if-eqz v0, :cond_5

    .line 330
    .line 331
    new-instance v1, Lf3/d;

    .line 332
    .line 333
    invoke-direct {v1}, Lf3/d;-><init>()V

    .line 334
    .line 335
    .line 336
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 337
    .line 338
    .line 339
    :cond_5
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->n:Landroid/widget/ImageView;

    .line 340
    .line 341
    if-eqz v0, :cond_6

    .line 342
    .line 343
    new-instance v1, Lf3/e;

    .line 344
    .line 345
    invoke-direct {v1, p0}, Lf3/e;-><init>(Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;)V

    .line 346
    .line 347
    .line 348
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 349
    .line 350
    .line 351
    :cond_6
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->p:Lcom/google/android/material/tabs/TabLayout;

    .line 352
    .line 353
    if-eqz v0, :cond_7

    .line 354
    .line 355
    new-instance v1, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout$a;

    .line 356
    .line 357
    invoke-direct {v1, p0}, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout$a;-><init>(Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;)V

    .line 358
    .line 359
    .line 360
    invoke-virtual {v0, v1}, Lcom/google/android/material/tabs/TabLayout;->addOnTabSelectedListener(Lcom/google/android/material/tabs/TabLayout$OnTabSelectedListener;)V

    .line 361
    .line 362
    .line 363
    :cond_7
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->u:Landroid/widget/TextView;

    .line 364
    .line 365
    if-eqz v0, :cond_8

    .line 366
    .line 367
    new-instance v1, Lf3/g;

    .line 368
    .line 369
    invoke-direct {v1, p0}, Lf3/g;-><init>(Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;)V

    .line 370
    .line 371
    .line 372
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 373
    .line 374
    .line 375
    :cond_8
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->v:Landroid/widget/TextView;

    .line 376
    .line 377
    if-eqz v0, :cond_9

    .line 378
    .line 379
    new-instance v1, Lf3/h;

    .line 380
    .line 381
    invoke-direct {v1, p0}, Lf3/h;-><init>(Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;)V

    .line 382
    .line 383
    .line 384
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 385
    .line 386
    .line 387
    :cond_9
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->s:Landroid/widget/ImageView;

    .line 388
    .line 389
    if-eqz v0, :cond_a

    .line 390
    .line 391
    new-instance v1, Lf3/i;

    .line 392
    .line 393
    invoke-direct {v1}, Lf3/i;-><init>()V

    .line 394
    .line 395
    .line 396
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 397
    .line 398
    .line 399
    :cond_a
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->t:Landroidx/cardview/widget/CardView;

    .line 400
    .line 401
    new-instance v1, Lf3/j;

    .line 402
    .line 403
    invoke-direct {v1, p0}, Lf3/j;-><init>(Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;)V

    .line 404
    .line 405
    .line 406
    const-wide/16 v2, 0x1388

    .line 407
    .line 408
    invoke-static {v0, v2, v3, v1}, Lcom/blankj/utilcode/util/ClickUtils;->applySingleDebouncing(Landroid/view/View;JLandroid/view/View$OnClickListener;)V

    .line 409
    .line 410
    .line 411
    return-void
.end method

.method public final x()V
    .locals 7

    .line 1
    invoke-static {}, Lcom/blankj/utilcode/util/NetworkUtils;->isWifiConnected()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {}, Lkotlinx/coroutines/d;->b()Lsd/i0;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-static {}, Lsd/r0;->b()Lsd/e0;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    new-instance v4, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout$arrangeTask$1;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-direct {v4, p0, v0}, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout$arrangeTask$1;-><init>(Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;Lvc/c;)V

    .line 19
    .line 20
    .line 21
    const/4 v5, 0x2

    .line 22
    const/4 v6, 0x0

    .line 23
    const/4 v3, 0x0

    .line 24
    invoke-static/range {v1 .. v6}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    const-string v0, "\u7f51\u7edc\u672a\u8fde\u63a5"

    .line 29
    .line 30
    invoke-static {v0}, Lz1/b;->i(Ljava/lang/CharSequence;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public final y(Landroid/graphics/Bitmap;)V
    .locals 1

    .line 1
    new-instance v0, Lf3/f;

    .line 2
    .line 3
    invoke-direct {v0, p1, p0}, Lf3/f;-><init>(Landroid/graphics/Bitmap;Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Lcom/blankj/utilcode/util/ThreadUtils;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method
