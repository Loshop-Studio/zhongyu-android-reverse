.class public final Lcom/zykj/base/ext/BindingAdaptersKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0008\u0010\u0000\u001a\u0004\u0018\u00010\u0003H\u0007\u001a\u0016\u0010\u0004\u001a\u00020\u0001*\u00020\u00022\u0008\u0010\u0000\u001a\u0004\u0018\u00010\u0003H\u0007\u001a\u0016\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0008\u0010\u0000\u001a\u0004\u0018\u00010\u0003H\u0007\u001a\u001c\u0010\u0006\u001a\u00020\u0001*\u00020\u00072\u000e\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\tH\u0007\u001a\u001b\u0010\n\u001a\u00020\u0001*\u00020\u00072\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u000cH\u0007\u00a2\u0006\u0002\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "netUrl",
        "",
        "Landroid/widget/ImageView;",
        "",
        "netUrlHeader",
        "netUrlSnapshot",
        "onClick",
        "Landroid/view/View;",
        "listener",
        "Lkotlin/Function0;",
        "visibleOrGone",
        "isVisible",
        "",
        "(Landroid/view/View;Ljava/lang/Boolean;)V",
        "base_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic a([Ljava/lang/Long;Lkotlin/jvm/functions/Function0;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/base/ext/BindingAdaptersKt;->b([Ljava/lang/Long;Lkotlin/jvm/functions/Function0;Landroid/view/View;)V

    return-void
.end method

.method public static final b([Ljava/lang/Long;Lkotlin/jvm/functions/Function0;Landroid/view/View;)V
    .locals 6

    .line 1
    const-string p2, "$mHits"

    .line 2
    .line 3
    invoke-static {p0, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    array-length p2, p0

    .line 7
    const/4 v0, 0x1

    .line 8
    sub-int/2addr p2, v0

    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-static {p0, v0, p0, v1, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 11
    .line 12
    .line 13
    array-length p2, p0

    .line 14
    sub-int/2addr p2, v0

    .line 15
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 16
    .line 17
    .line 18
    move-result-wide v2

    .line 19
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    aput-object v0, p0, p2

    .line 24
    .line 25
    aget-object p0, p0, v1

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
    if-gez p0, :cond_1

    .line 42
    .line 43
    if-nez p1, :cond_0

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    :cond_1
    :goto_0
    return-void
.end method

.method public static final netUrl(Landroid/widget/ImageView;Ljava/lang/String;)V
    .locals 1
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .annotation runtime Landroidx/databinding/BindingAdapter;
        value = {
            "netUrl"
        }
    .end annotation

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Lcom/bumptech/glide/b;->u(Landroid/view/View;)Lcom/bumptech/glide/f;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0, p1}, Lcom/bumptech/glide/f;->r(Ljava/lang/String;)Lcom/bumptech/glide/e;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p1, p0}, Lcom/bumptech/glide/e;->u0(Landroid/widget/ImageView;)Lb1/i;

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public static final netUrlHeader(Landroid/widget/ImageView;Ljava/lang/String;)V
    .locals 2
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .annotation runtime Landroidx/databinding/BindingAdapter;
        value = {
            "netUrlHeader"
        }
    .end annotation

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Lcom/bumptech/glide/b;->u(Landroid/view/View;)Lcom/bumptech/glide/f;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0, p1}, Lcom/bumptech/glide/f;->r(Ljava/lang/String;)Lcom/bumptech/glide/e;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    new-instance v0, La1/d;

    .line 15
    .line 16
    invoke-direct {v0}, La1/d;-><init>()V

    .line 17
    .line 18
    .line 19
    sget v1, Lcom/zykj/base/R$mipmap;->icon_personal:I

    .line 20
    .line 21
    invoke-virtual {v0, v1}, La1/a;->V(I)La1/a;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, La1/d;

    .line 26
    .line 27
    invoke-virtual {v0}, La1/a;->f()La1/a;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {p1, v0}, Lcom/bumptech/glide/e;->k0(La1/a;)Lcom/bumptech/glide/e;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {p1, p0}, Lcom/bumptech/glide/e;->u0(Landroid/widget/ImageView;)Lb1/i;

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public static final netUrlSnapshot(Landroid/widget/ImageView;Ljava/lang/String;)V
    .locals 1
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .annotation runtime Landroidx/databinding/BindingAdapter;
        value = {
            "netUrlSnapshot"
        }
    .end annotation

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Lcom/bumptech/glide/b;->u(Landroid/view/View;)Lcom/bumptech/glide/f;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0, p1}, Lcom/bumptech/glide/f;->r(Ljava/lang/String;)Lcom/bumptech/glide/e;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p1}, La1/a;->e()La1/a;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Lcom/bumptech/glide/e;

    .line 19
    .line 20
    const v0, 0x3dcccccd    # 0.1f

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, v0}, Lcom/bumptech/glide/e;->B0(F)Lcom/bumptech/glide/e;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {p1, p0}, Lcom/bumptech/glide/e;->u0(Landroid/widget/ImageView;)Lb1/i;

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public static final onClick(Landroid/view/View;Lkotlin/jvm/functions/Function0;)V
    .locals 2
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .annotation runtime Landroidx/databinding/BindingAdapter;
        value = {
            "onClick"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

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
    new-instance v1, Lu4/a;

    .line 17
    .line 18
    invoke-direct {v1, v0, p1}, Lu4/a;-><init>([Ljava/lang/Long;Lkotlin/jvm/functions/Function0;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public static final visibleOrGone(Landroid/view/View;Ljava/lang/Boolean;)V
    .locals 1
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .annotation runtime Landroidx/databinding/BindingAdapter;
        value = {
            "visibleOrGone"
        }
    .end annotation

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-eqz p1, :cond_1

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/16 p1, 0x8

    .line 17
    .line 18
    :goto_0
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 19
    .line 20
    .line 21
    :cond_1
    return-void
.end method
