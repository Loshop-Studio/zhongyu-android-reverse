.class public abstract Lgb/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a([Ljava/lang/Long;Lhd/l;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lgb/b;->f([Ljava/lang/Long;Lhd/l;Landroid/view/View;)V

    return-void
.end method

.method public static final b(Landroid/text/SpannableStringBuilder;ILjava/lang/String;Ljava/lang/String;Lhd/a;)V
    .locals 7

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "content"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "spanContent"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "onClick"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const/4 v5, 0x6

    .line 22
    const/4 v6, 0x0

    .line 23
    const/4 v3, 0x0

    .line 24
    const/4 v4, 0x0

    .line 25
    move-object v1, p2

    .line 26
    move-object v2, p3

    .line 27
    invoke-static/range {v1 .. v6}, Lqd/c0;->f0(Ljava/lang/CharSequence;Ljava/lang/String;IZILjava/lang/Object;)I

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    if-gez p2, :cond_0

    .line 32
    .line 33
    return-void

    .line 34
    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 35
    .line 36
    .line 37
    move-result p3

    .line 38
    add-int/2addr p3, p2

    .line 39
    new-instance v0, Lhb/a;

    .line 40
    .line 41
    invoke-direct {v0, p1, p4}, Lhb/a;-><init>(ILhd/a;)V

    .line 42
    .line 43
    .line 44
    const/16 p1, 0x21

    .line 45
    .line 46
    invoke-virtual {p0, v0, p2, p3, p1}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public static final c(Landroid/widget/TextView;IF)V
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0, p1, p2, p2}, Lgb/b;->d(Landroid/widget/TextView;IFF)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static final d(Landroid/widget/TextView;IFF)V
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-static {v0, p1}, Landroidx/core/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    float-to-int p2, p2

    .line 17
    float-to-int p3, p3

    .line 18
    const/4 v0, 0x0

    .line 19
    invoke-virtual {p1, v0, v0, p2, p3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 20
    .line 21
    .line 22
    :cond_0
    const/4 p2, 0x0

    .line 23
    invoke-virtual {p0, p1, p2, p2, p2}, Landroid/widget/TextView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public static final e(Landroid/view/View;Lhd/l;)V
    .locals 2

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-wide/16 v0, 0x0

    .line 7
    .line 8
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    filled-new-array {v0, v0}, [Ljava/lang/Long;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    new-instance v1, Lgb/a;

    .line 17
    .line 18
    invoke-direct {v1, v0, p1}, Lgb/a;-><init>([Ljava/lang/Long;Lhd/l;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public static final f([Ljava/lang/Long;Lhd/l;Landroid/view/View;)V
    .locals 6

    .line 1
    const-string v0, "$mHits"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    array-length v0, p0

    .line 7
    const/4 v1, 0x1

    .line 8
    sub-int/2addr v0, v1

    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-static {p0, v1, p0, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 11
    .line 12
    .line 13
    array-length v0, p0

    .line 14
    sub-int/2addr v0, v1

    .line 15
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 16
    .line 17
    .line 18
    move-result-wide v3

    .line 19
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    aput-object v1, p0, v0

    .line 24
    .line 25
    aget-object p0, p0, v2

    .line 26
    .line 27
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 28
    .line 29
    .line 30
    move-result-wide v0

    .line 31
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 32
    .line 33
    .line 34
    move-result-wide v2

    .line 35
    const/16 p0, 0x1f4

    .line 36
    .line 37
    int-to-long v4, p0

    .line 38
    sub-long/2addr v2, v4

    .line 39
    cmp-long p0, v0, v2

    .line 40
    .line 41
    if-gez p0, :cond_0

    .line 42
    .line 43
    if-eqz p1, :cond_0

    .line 44
    .line 45
    const-string p0, "it"

    .line 46
    .line 47
    invoke-static {p2, p0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    invoke-interface {p1, p2}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    :cond_0
    return-void
.end method
