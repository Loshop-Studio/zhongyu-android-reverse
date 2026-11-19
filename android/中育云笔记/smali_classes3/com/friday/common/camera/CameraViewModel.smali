.class public final Lcom/friday/common/camera/CameraViewModel;
.super Landroidx/lifecycle/ViewModel;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# instance fields
.field public final a:Lvd/k;

.field public b:F

.field public final c:Lvd/k;

.field public final d:Lvd/p;

.field public e:Landroid/graphics/Bitmap;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Landroidx/lifecycle/ViewModel;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x7

    .line 7
    invoke-static {v0, v0, v1, v2, v1}, Lvd/q;->b(IILkotlinx/coroutines/channels/BufferOverflow;ILjava/lang/Object;)Lvd/k;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    iput-object v3, p0, Lcom/friday/common/camera/CameraViewModel;->a:Lvd/k;

    .line 12
    .line 13
    const/high16 v3, 0x3f800000    # 1.0f

    .line 14
    .line 15
    iput v3, p0, Lcom/friday/common/camera/CameraViewModel;->b:F

    .line 16
    .line 17
    invoke-static {v0, v0, v1, v2, v1}, Lvd/q;->b(IILkotlinx/coroutines/channels/BufferOverflow;ILjava/lang/Object;)Lvd/k;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iput-object v0, p0, Lcom/friday/common/camera/CameraViewModel;->c:Lvd/k;

    .line 22
    .line 23
    iput-object v0, p0, Lcom/friday/common/camera/CameraViewModel;->d:Lvd/p;

    .line 24
    .line 25
    return-void
.end method

.method public static final synthetic a(Lcom/friday/common/camera/CameraViewModel;)Lvd/k;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/common/camera/CameraViewModel;->c:Lvd/k;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public final b()V
    .locals 6

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lsd/i0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v3, Lcom/friday/common/camera/CameraViewModel$cancelInCropPage$1;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v3, p0, v1}, Lcom/friday/common/camera/CameraViewModel$cancelInCropPage$1;-><init>(Lcom/friday/common/camera/CameraViewModel;Lvc/c;)V

    .line 9
    .line 10
    .line 11
    const/4 v4, 0x3

    .line 12
    const/4 v5, 0x0

    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-static/range {v0 .. v5}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final c()Lvd/k;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/common/camera/CameraViewModel;->a:Lvd/k;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d()Lvd/p;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/common/camera/CameraViewModel;->d:Lvd/p;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/friday/common/camera/CameraViewModel;->b:F

    .line 2
    .line 3
    return v0
.end method

.method public final f(Landroid/graphics/Bitmap;)V
    .locals 1

    .line 1
    const-string v0, "bitmap"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/friday/common/camera/CameraViewModel;->e:Landroid/graphics/Bitmap;

    .line 7
    .line 8
    return-void
.end method

.method public final g(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/friday/common/camera/CameraViewModel;->b:F

    .line 2
    .line 3
    return-void
.end method

.method public final h(FF)V
    .locals 6

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lsd/i0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v3, Lcom/friday/common/camera/CameraViewModel$updateAutoFocus$1;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v3, p0, p1, p2, v1}, Lcom/friday/common/camera/CameraViewModel$updateAutoFocus$1;-><init>(Lcom/friday/common/camera/CameraViewModel;FFLvc/c;)V

    .line 9
    .line 10
    .line 11
    const/4 v4, 0x3

    .line 12
    const/4 v5, 0x0

    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-static/range {v0 .. v5}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 15
    .line 16
    .line 17
    return-void
.end method
