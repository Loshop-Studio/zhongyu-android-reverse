.class public final Le7/o0;
.super Landroid/widget/RelativeLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le7/o0$a;
    }
.end annotation


# static fields
.field public static final g:Le7/o0$a;

.field public static final h:I


# instance fields
.field public final a:Landroid/webkit/WebView;

.field public b:Ljava/lang/String;

.field public c:I

.field public d:I

.field public e:I

.field public f:Lkotlin/jvm/functions/Function1;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Le7/o0$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Le7/o0$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Le7/o0;->g:Le7/o0$a;

    .line 8
    .line 9
    const/16 v0, 0x8

    .line 10
    .line 11
    sput v0, Le7/o0;->h:I

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 3
    new-instance p2, Landroid/webkit/WebView;

    invoke-direct {p2, p1}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Le7/o0;->a:Landroid/webkit/WebView;

    .line 4
    const-string p1, ""

    iput-object p1, p0, Le7/o0;->b:Ljava/lang/String;

    const/16 p1, 0x96

    .line 5
    iput p1, p0, Le7/o0;->c:I

    const/16 p1, 0x32

    .line 6
    iput p1, p0, Le7/o0;->d:I

    .line 7
    new-instance p1, Le7/m0;

    invoke-direct {p1, p0}, Le7/m0;-><init>(Le7/o0;)V

    invoke-virtual {p0, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    .line 1
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Le7/o0;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static synthetic a(Le7/o0;)V
    .locals 0

    .line 1
    invoke-static {p0}, Le7/o0;->c(Le7/o0;)V

    return-void
.end method

.method public static synthetic b(Landroid/view/View;)Z
    .locals 0

    .line 1
    invoke-static {p0}, Le7/o0;->f(Landroid/view/View;)Z

    move-result p0

    return p0
.end method

.method public static final c(Le7/o0;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Le7/o0;->e()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic d(Le7/o0;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Le7/o0;->b:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final f(Landroid/view/View;)Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method


# virtual methods
.method public final e()V
    .locals 4

    .line 1
    iget-object v0, p0, Le7/o0;->a:Landroid/webkit/WebView;

    .line 2
    .line 3
    new-instance v1, Landroid/widget/RelativeLayout$LayoutParams;

    .line 4
    .line 5
    const/4 v2, -0x1

    .line 6
    invoke-direct {v1, v2, v2}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Le7/o0;->a:Landroid/webkit/WebView;

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 15
    .line 16
    .line 17
    sget-object v0, Lp7/d;->b:Lp7/d;

    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    const-string v2, "getContext(...)"

    .line 24
    .line 25
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const-string v2, "STEM_SCALE_OFFSET"

    .line 29
    .line 30
    const/4 v3, 0x0

    .line 31
    invoke-virtual {v0, v1, v2, v3}, Lp7/d;->b(Landroid/content/Context;Ljava/lang/String;I)I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    iput v0, p0, Le7/o0;->e:I

    .line 36
    .line 37
    iget-object v1, p0, Le7/o0;->a:Landroid/webkit/WebView;

    .line 38
    .line 39
    iget v2, p0, Le7/o0;->c:I

    .line 40
    .line 41
    add-int/2addr v2, v0

    .line 42
    invoke-virtual {v1, v2}, Landroid/webkit/WebView;->setInitialScale(I)V

    .line 43
    .line 44
    .line 45
    iget-object v0, p0, Le7/o0;->a:Landroid/webkit/WebView;

    .line 46
    .line 47
    new-instance v1, Le7/n0;

    .line 48
    .line 49
    invoke-direct {v1}, Le7/n0;-><init>()V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 53
    .line 54
    .line 55
    iget-object v0, p0, Le7/o0;->a:Landroid/webkit/WebView;

    .line 56
    .line 57
    invoke-virtual {v0, v3}, Landroid/view/View;->setVerticalScrollBarEnabled(Z)V

    .line 58
    .line 59
    .line 60
    iget-object v0, p0, Le7/o0;->a:Landroid/webkit/WebView;

    .line 61
    .line 62
    invoke-virtual {v0, v3}, Landroid/view/View;->setHorizontalScrollBarEnabled(Z)V

    .line 63
    .line 64
    .line 65
    iget-object v0, p0, Le7/o0;->a:Landroid/webkit/WebView;

    .line 66
    .line 67
    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    const/4 v1, 0x1

    .line 72
    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 73
    .line 74
    .line 75
    iget-object v0, p0, Le7/o0;->a:Landroid/webkit/WebView;

    .line 76
    .line 77
    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-virtual {v0, v3}, Landroid/webkit/WebSettings;->setMixedContentMode(I)V

    .line 82
    .line 83
    .line 84
    iget-object v0, p0, Le7/o0;->a:Landroid/webkit/WebView;

    .line 85
    .line 86
    new-instance v1, Le7/o0$b;

    .line 87
    .line 88
    invoke-direct {v1, p0}, Le7/o0$b;-><init>(Le7/o0;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 92
    .line 93
    .line 94
    return-void
.end method

.method public final g(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "url"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Le7/o0;->a:Landroid/webkit/WebView;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/webkit/WebView;->clearView()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Le7/o0;->a:Landroid/webkit/WebView;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Le7/o0;->b:Ljava/lang/String;

    .line 17
    .line 18
    return-void
.end method

.method public final getPageFinishListener()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Landroid/webkit/WebView;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le7/o0;->f:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getWebView()Landroid/webkit/WebView;
    .locals 1

    .line 1
    iget-object v0, p0, Le7/o0;->a:Landroid/webkit/WebView;

    .line 2
    .line 3
    return-object v0
.end method

.method public final setPageFinishListener(Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroid/webkit/WebView;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Le7/o0;->f:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    return-void
.end method
