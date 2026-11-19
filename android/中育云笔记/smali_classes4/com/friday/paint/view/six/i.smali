.class public abstract Lcom/friday/paint/view/six/i;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Lkotlin/jvm/internal/Ref$LongRef;Lhd/l;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/friday/paint/view/six/i;->c(Lkotlin/jvm/internal/Ref$LongRef;Lhd/l;Landroid/view/View;)V

    return-void
.end method

.method public static final b(Landroid/view/View;Lhd/l;)V
    .locals 2

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lkotlin/jvm/internal/Ref$LongRef;

    .line 7
    .line 8
    invoke-direct {v0}, Lkotlin/jvm/internal/Ref$LongRef;-><init>()V

    .line 9
    .line 10
    .line 11
    new-instance v1, Ld4/r0;

    .line 12
    .line 13
    invoke-direct {v1, v0, p1}, Ld4/r0;-><init>(Lkotlin/jvm/internal/Ref$LongRef;Lhd/l;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public static final c(Lkotlin/jvm/internal/Ref$LongRef;Lhd/l;Landroid/view/View;)V
    .locals 4

    .line 1
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iget-wide v2, p0, Lkotlin/jvm/internal/Ref$LongRef;->c:J

    .line 6
    .line 7
    sub-long/2addr v0, v2

    .line 8
    const-wide/16 v2, 0x3e8

    .line 9
    .line 10
    cmp-long v0, v0, v2

    .line 11
    .line 12
    if-lez v0, :cond_1

    .line 13
    .line 14
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 15
    .line 16
    .line 17
    move-result-wide v0

    .line 18
    iput-wide v0, p0, Lkotlin/jvm/internal/Ref$LongRef;->c:J

    .line 19
    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    invoke-static {p2}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    invoke-interface {p1, p2}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    :cond_0
    return-void

    .line 29
    :cond_1
    const/4 p0, 0x0

    .line 30
    new-array p0, p0, [Ljava/lang/Object;

    .line 31
    .line 32
    const-string p1, "\u8bf7\u52ff\u8fde\u7eed\u64cd\u4f5c\uff0c\u7a0d\u540e\u91cd\u8bd5"

    .line 33
    .line 34
    invoke-static {p1, p0}, Lcom/blankj/utilcode/util/ToastUtils;->showShort(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method
