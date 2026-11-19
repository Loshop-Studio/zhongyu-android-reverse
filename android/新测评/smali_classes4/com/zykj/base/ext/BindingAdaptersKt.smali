.class public final Lcom/zykj/base/ext/BindingAdaptersKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a#\u0010\u0004\u001a\u00020\u0002*\u00020\u00002\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001H\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u001a\u001d\u0010\u0008\u001a\u00020\u0002*\u00020\u00002\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a\u001d\u0010\u000c\u001a\u00020\u0002*\u00020\n2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000bH\u0007\u00a2\u0006\u0004\u0008\u000c\u0010\r\u001a\u001d\u0010\u000e\u001a\u00020\u0002*\u00020\n2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000bH\u0007\u00a2\u0006\u0004\u0008\u000e\u0010\r\u001a\u001d\u0010\u000f\u001a\u00020\u0002*\u00020\n2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000bH\u0007\u00a2\u0006\u0004\u0008\u000f\u0010\r\u001a%\u0010\u0014\u001a\u00020\u0002*\u00020\u00102\u0010\u0008\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011H\u0007\u00a2\u0006\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Landroid/view/View;",
        "Lkotlin/Function0;",
        "",
        "listener",
        "onClick",
        "(Landroid/view/View;Lkotlin/jvm/functions/Function0;)V",
        "",
        "isVisible",
        "visibleOrGone",
        "(Landroid/view/View;Ljava/lang/Boolean;)V",
        "Landroid/widget/ImageView;",
        "",
        "netUrl",
        "(Landroid/widget/ImageView;Ljava/lang/String;)V",
        "netUrlSnapshot",
        "netUrlHeader",
        "Le4/a;",
        "Lcom/kunminx/architecture/ui/callback/ProtectedUnPeekLiveData;",
        "Lcom/zykj/base/bean/toast/ToastMessage;",
        "toastLiveData",
        "bindLiveData",
        "(Le4/a;Lcom/kunminx/architecture/ui/callback/ProtectedUnPeekLiveData;)V",
        "base_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic a(Lkotlin/jvm/functions/Function0;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/base/ext/BindingAdaptersKt;->b(Lkotlin/jvm/functions/Function0;Landroid/view/View;)V

    return-void
.end method

.method public static final b(Lkotlin/jvm/functions/Function0;Landroid/view/View;)V
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    :cond_0
    return-void
.end method

.method public static final bindLiveData(Le4/a;Lcom/kunminx/architecture/ui/callback/ProtectedUnPeekLiveData;)V
    .locals 0
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .annotation runtime Landroidx/databinding/BindingAdapter;
        requireAll = false
        value = {
            "message"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le4/a;",
            "Lcom/kunminx/architecture/ui/callback/ProtectedUnPeekLiveData<",
            "Lcom/zykj/base/bean/toast/ToastMessage;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string p1, "<this>"

    .line 2
    .line 3
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 p0, 0x0

    .line 7
    throw p0
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
    invoke-static {p0}, Lcom/bumptech/glide/b;->u(Landroid/view/View;)Lcom/bumptech/glide/h;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0, p1}, Lcom/bumptech/glide/h;->s(Ljava/lang/String;)Lcom/bumptech/glide/g;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p1, p0}, Lcom/bumptech/glide/g;->w0(Landroid/widget/ImageView;)Lf1/i;

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
    invoke-static {p0}, Lcom/bumptech/glide/b;->u(Landroid/view/View;)Lcom/bumptech/glide/h;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0, p1}, Lcom/bumptech/glide/h;->s(Ljava/lang/String;)Lcom/bumptech/glide/g;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    new-instance v0, Le1/d;

    .line 15
    .line 16
    invoke-direct {v0}, Le1/d;-><init>()V

    .line 17
    .line 18
    .line 19
    sget v1, Lcom/zykj/base/R$mipmap;->icon_personal:I

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Le1/a;->X(I)Le1/a;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Le1/d;

    .line 26
    .line 27
    invoke-virtual {v0}, Le1/a;->e()Le1/a;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {p1, v0}, Lcom/bumptech/glide/g;->m0(Le1/a;)Lcom/bumptech/glide/g;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {p1, p0}, Lcom/bumptech/glide/g;->w0(Landroid/widget/ImageView;)Lf1/i;

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
    invoke-static {p0}, Lcom/bumptech/glide/b;->u(Landroid/view/View;)Lcom/bumptech/glide/h;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0, p1}, Lcom/bumptech/glide/h;->s(Ljava/lang/String;)Lcom/bumptech/glide/g;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p1}, Le1/a;->d()Le1/a;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Lcom/bumptech/glide/g;

    .line 19
    .line 20
    const v0, 0x3dcccccd    # 0.1f

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, v0}, Lcom/bumptech/glide/g;->D0(F)Lcom/bumptech/glide/g;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {p1, p0}, Lcom/bumptech/glide/g;->w0(Landroid/widget/ImageView;)Lf1/i;

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public static final onClick(Landroid/view/View;Lkotlin/jvm/functions/Function0;)V
    .locals 3
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
    new-instance v0, Ld4/a;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Ld4/a;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 9
    .line 10
    .line 11
    const-wide/16 v1, 0x1f4

    .line 12
    .line 13
    invoke-static {p0, v1, v2, v0}, Lcom/blankj/utilcode/util/ClickUtils;->applySingleDebouncing(Landroid/view/View;JLandroid/view/View$OnClickListener;)V

    .line 14
    .line 15
    .line 16
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
