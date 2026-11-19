.class public final Lcom/zykj/view/board/crop/BlackboardCropFragment$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/view/widget/DoubleSeekBar$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/view/board/crop/BlackboardCropFragment;->s()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/zykj/view/board/crop/BlackboardCropFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/view/board/crop/BlackboardCropFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment$c;->a:Lcom/zykj/view/board/crop/BlackboardCropFragment;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(Lcom/zykj/view/widget/DoubleSeekBar;)V
    .locals 1

    .line 1
    const-string v0, "seekBar"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment$c;->a:Lcom/zykj/view/board/crop/BlackboardCropFragment;

    .line 7
    .line 8
    invoke-static {v0}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->m(Lcom/zykj/view/board/crop/BlackboardCropFragment;)Lz4/a;

    .line 9
    .line 10
    .line 11
    const-string v0, "cropManager"

    .line 12
    .line 13
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Lcom/zykj/view/widget/DoubleSeekBar;->getMaskProgress()F

    .line 17
    .line 18
    .line 19
    const/4 p1, 0x0

    .line 20
    throw p1
.end method

.method public b(Lcom/zykj/view/widget/DoubleSeekBar;F)V
    .locals 0

    .line 1
    const-string p2, "seekBar"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public c(Lcom/zykj/view/widget/DoubleSeekBar;)V
    .locals 2

    .line 1
    const-string v0, "seekBar"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment$c;->a:Lcom/zykj/view/board/crop/BlackboardCropFragment;

    .line 7
    .line 8
    invoke-static {p1}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->p(Lcom/zykj/view/board/crop/BlackboardCropFragment;)Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    const/4 v0, 0x0

    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    invoke-virtual {p1}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->status()Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move-object p1, v0

    .line 21
    :goto_0
    sget-object v1, Lcom/zykj/merge/sketch/constant/PlayStatus;->RECORD_START:Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 22
    .line 23
    if-eq p1, v1, :cond_2

    .line 24
    .line 25
    iget-object p1, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment$c;->a:Lcom/zykj/view/board/crop/BlackboardCropFragment;

    .line 26
    .line 27
    invoke-static {p1}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->p(Lcom/zykj/view/board/crop/BlackboardCropFragment;)Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    if-eqz p1, :cond_1

    .line 32
    .line 33
    invoke-virtual {p1}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->status()Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    :cond_1
    sget-object p1, Lcom/zykj/merge/sketch/constant/PlayStatus;->RECORD_RESUME:Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 38
    .line 39
    if-ne v0, p1, :cond_3

    .line 40
    .line 41
    :cond_2
    iget-object p1, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment$c;->a:Lcom/zykj/view/board/crop/BlackboardCropFragment;

    .line 42
    .line 43
    invoke-static {p1}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->p(Lcom/zykj/view/board/crop/BlackboardCropFragment;)Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    if-eqz p1, :cond_3

    .line 48
    .line 49
    invoke-virtual {p1}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->pause()V

    .line 50
    .line 51
    .line 52
    :cond_3
    return-void
.end method
