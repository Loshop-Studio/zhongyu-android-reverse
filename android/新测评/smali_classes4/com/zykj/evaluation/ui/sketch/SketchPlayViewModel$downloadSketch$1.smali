.class public final Lcom/zykj/evaluation/ui/sketch/SketchPlayViewModel$downloadSketch$1;
.super Lz1/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/evaluation/ui/sketch/SketchPlayViewModel;->p(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/zykj/evaluation/ui/sketch/SketchPlayViewModel;


# direct methods
.method public constructor <init>(Lcom/zykj/evaluation/ui/sketch/SketchPlayViewModel;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/evaluation/ui/sketch/SketchPlayViewModel$downloadSketch$1;->a:Lcom/zykj/evaluation/ui/sketch/SketchPlayViewModel;

    .line 2
    .line 3
    invoke-direct {p0}, Lz1/a;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public h(Lcom/liulishuo/okdownload/a;)V
    .locals 1

    .line 1
    const-string v0, "task"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/zykj/evaluation/ui/sketch/SketchPlayViewModel$downloadSketch$1;->a:Lcom/zykj/evaluation/ui/sketch/SketchPlayViewModel;

    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/zykj/evaluation/base/BaseViewModel;->k()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public k(Lcom/liulishuo/okdownload/a;Lcom/liulishuo/okdownload/core/cause/EndCause;Ljava/lang/Exception;)V
    .locals 9

    .line 1
    const-string p3, "task"

    .line 2
    .line 3
    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p3, "cause"

    .line 7
    .line 8
    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/liulishuo/okdownload/a;->l()Ljava/io/File;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    sget-object p3, Lcom/liulishuo/okdownload/core/cause/EndCause;->a:Lcom/liulishuo/okdownload/core/cause/EndCause;

    .line 16
    .line 17
    if-ne p2, p3, :cond_0

    .line 18
    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    iget-object v0, p0, Lcom/zykj/evaluation/ui/sketch/SketchPlayViewModel$downloadSketch$1;->a:Lcom/zykj/evaluation/ui/sketch/SketchPlayViewModel;

    .line 22
    .line 23
    new-instance v3, Lcom/zykj/evaluation/ui/sketch/SketchPlayViewModel$downloadSketch$1$taskEnd$1;

    .line 24
    .line 25
    const/4 p2, 0x0

    .line 26
    invoke-direct {v3, p2}, Lcom/zykj/evaluation/ui/sketch/SketchPlayViewModel$downloadSketch$1$taskEnd$1;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 27
    .line 28
    .line 29
    new-instance v4, Lcom/zykj/evaluation/ui/sketch/SketchPlayViewModel$downloadSketch$1$taskEnd$2;

    .line 30
    .line 31
    iget-object p3, p0, Lcom/zykj/evaluation/ui/sketch/SketchPlayViewModel$downloadSketch$1;->a:Lcom/zykj/evaluation/ui/sketch/SketchPlayViewModel;

    .line 32
    .line 33
    invoke-direct {v4, p3, p2}, Lcom/zykj/evaluation/ui/sketch/SketchPlayViewModel$downloadSketch$1$taskEnd$2;-><init>(Lcom/zykj/evaluation/ui/sketch/SketchPlayViewModel;Lkotlin/coroutines/Continuation;)V

    .line 34
    .line 35
    .line 36
    new-instance v6, Lcom/zykj/evaluation/ui/sketch/SketchPlayViewModel$downloadSketch$1$taskEnd$3;

    .line 37
    .line 38
    iget-object p3, p0, Lcom/zykj/evaluation/ui/sketch/SketchPlayViewModel$downloadSketch$1;->a:Lcom/zykj/evaluation/ui/sketch/SketchPlayViewModel;

    .line 39
    .line 40
    invoke-direct {v6, p3, p1, p2}, Lcom/zykj/evaluation/ui/sketch/SketchPlayViewModel$downloadSketch$1$taskEnd$3;-><init>(Lcom/zykj/evaluation/ui/sketch/SketchPlayViewModel;Ljava/io/File;Lkotlin/coroutines/Continuation;)V

    .line 41
    .line 42
    .line 43
    const/16 v7, 0x13

    .line 44
    .line 45
    const/4 v8, 0x0

    .line 46
    const/4 v1, 0x0

    .line 47
    const/4 v2, 0x0

    .line 48
    const/4 v5, 0x0

    .line 49
    invoke-static/range {v0 .. v8}, Lcom/zykj/evaluation/base/BaseViewModel;->f(Lcom/zykj/evaluation/base/BaseViewModel;Ljava/lang/String;Lcom/zykj/evaluation/base/a;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_0
    sget-object p1, Lcom/zykj/base/utils/XToastUtils;->INSTANCE:Lcom/zykj/base/utils/XToastUtils;

    .line 54
    .line 55
    const-string p2, "\u5fae\u8bfe\u4e0b\u8f7d\u5931\u8d25"

    .line 56
    .line 57
    invoke-virtual {p1, p2}, Lcom/zykj/base/utils/XToastUtils;->error(Ljava/lang/CharSequence;)V

    .line 58
    .line 59
    .line 60
    iget-object p1, p0, Lcom/zykj/evaluation/ui/sketch/SketchPlayViewModel$downloadSketch$1;->a:Lcom/zykj/evaluation/ui/sketch/SketchPlayViewModel;

    .line 61
    .line 62
    invoke-virtual {p1}, Lcom/zykj/evaluation/base/BaseViewModel;->c()V

    .line 63
    .line 64
    .line 65
    return-void
.end method
