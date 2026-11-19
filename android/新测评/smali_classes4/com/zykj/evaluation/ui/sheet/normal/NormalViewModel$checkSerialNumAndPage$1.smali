.class final Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$checkSerialNumAndPage$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->F0(Landroid/graphics/Bitmap;Ljava/util/List;Landroid/graphics/Bitmap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.zykj.evaluation.ui.sheet.normal.NormalViewModel"
    f = "NormalViewModel.kt"
    i = {
        0x0,
        0x0,
        0x0,
        0x0
    }
    l = {
        0x3c3
    }
    m = "checkSerialNumAndPage"
    n = {
        "bitmap",
        "points",
        "previewBitmap",
        "result"
    }
    s = {
        "L$0",
        "L$1",
        "L$2",
        "L$3"
    }
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public synthetic e:Ljava/lang/Object;

.field public final synthetic f:Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;

.field public g:I


# direct methods
.method public constructor <init>(Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$checkSerialNumAndPage$1;->f:Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$checkSerialNumAndPage$1;->e:Ljava/lang/Object;

    iget p1, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$checkSerialNumAndPage$1;->g:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$checkSerialNumAndPage$1;->g:I

    iget-object p1, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$checkSerialNumAndPage$1;->f:Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;

    const/4 v0, 0x0

    invoke-static {p1, v0, v0, v0, p0}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->Z(Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;Landroid/graphics/Bitmap;Ljava/util/List;Landroid/graphics/Bitmap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
