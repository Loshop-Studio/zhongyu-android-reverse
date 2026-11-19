.class public final Lf2/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lf2/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lf2/c;

    .line 2
    .line 3
    invoke-direct {v0}, Lf2/c;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lf2/c;->a:Lf2/c;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic a(Landroid/view/View;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lf2/c;->c(Landroid/view/View;Landroid/view/View;)V

    return-void
.end method

.method public static final c(Landroid/view/View;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->hasFocus()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-static {p0}, Lcom/blankj/utilcode/util/KeyboardUtils;->showSoftInput(Landroid/view/View;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method


# virtual methods
.method public final varargs b([Landroid/view/View;)V
    .locals 4

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    array-length v0, p1

    .line 7
    const/4 v1, 0x0

    .line 8
    :goto_0
    if-ge v1, v0, :cond_1

    .line 9
    .line 10
    aget-object v2, p1, v1

    .line 11
    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    const/4 v3, 0x1

    .line 15
    invoke-virtual {v2, v3}, Landroid/view/View;->setFocusable(Z)V

    .line 16
    .line 17
    .line 18
    :cond_0
    new-instance v3, Lf2/b;

    .line 19
    .line 20
    invoke-direct {v3, v2}, Lf2/b;-><init>(Landroid/view/View;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v2, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 24
    .line 25
    .line 26
    add-int/lit8 v1, v1, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    return-void
.end method

.method public final d()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final e()Z
    .locals 1

    .line 1
    invoke-static {}, Lcom/blankj/utilcode/util/NetworkUtils;->isWifiConnected()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public final f(Lcom/google/android/material/textfield/TextInputEditText;Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "et"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "error"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setError(Ljava/lang/CharSequence;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    .line 15
    .line 16
    .line 17
    return-void
.end method
