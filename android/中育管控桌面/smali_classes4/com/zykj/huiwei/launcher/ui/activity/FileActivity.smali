.class public final Lcom/zykj/huiwei/launcher/ui/activity/FileActivity;
.super Lcom/zykj/huiwei/launcher/base/CommonActivity;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/huiwei/launcher/ui/activity/PdfFragment$b;


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/huiwei/launcher/ui/activity/FileActivity$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/zykj/huiwei/launcher/base/CommonActivity<",
        "Lcom/zykj/huiwei/launcher/databinding/DiscoveryActivityFileBinding;",
        ">;",
        "Lcom/zykj/huiwei/launcher/ui/activity/PdfFragment$b;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u0000  2\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0010B\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u001a\u0010\u000c\u001a\u00020\u000b2\u0008\u0010\n\u001a\u0004\u0018\u00010\tH\u0094@\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0017\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0019R\u0016\u0010\u000e\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u001aR\u0016\u0010\u000f\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001aR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001e\u00a8\u0006!"
    }
    d2 = {
        "Lcom/zykj/huiwei/launcher/ui/activity/FileActivity;",
        "Lcom/zykj/huiwei/launcher/base/CommonActivity;",
        "Lcom/zykj/huiwei/launcher/databinding/DiscoveryActivityFileBinding;",
        "Lcom/zykj/huiwei/launcher/ui/activity/PdfFragment$b;",
        "<init>",
        "()V",
        "",
        "layoutId",
        "()I",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "",
        "initView",
        "(Landroid/os/Bundle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "currentPage",
        "totalPage",
        "a",
        "(II)V",
        "",
        "localPath",
        "urlPath",
        "p",
        "(Ljava/lang/String;Ljava/lang/String;)V",
        "paramString",
        "q",
        "(Ljava/lang/String;)Ljava/lang/String;",
        "I",
        "b",
        "Lcom/zykj/huiwei/launcher/ui/activity/PdfFragment;",
        "c",
        "Lcom/zykj/huiwei/launcher/ui/activity/PdfFragment;",
        "pdfFragment",
        "d",
        "app_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nFileActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileActivity.kt\ncom/zykj/huiwei/launcher/ui/activity/FileActivity\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,149:1\n257#2,2:150\n*S KotlinDebug\n*F\n+ 1 FileActivity.kt\ncom/zykj/huiwei/launcher/ui/activity/FileActivity\n*L\n82#1:150,2\n*E\n"
    }
.end annotation


# static fields
.field public static final d:Lcom/zykj/huiwei/launcher/ui/activity/FileActivity$a;

.field public static final e:I


# instance fields
.field public a:I

.field public b:I

.field public c:Lcom/zykj/huiwei/launcher/ui/activity/PdfFragment;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/huiwei/launcher/ui/activity/FileActivity$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/huiwei/launcher/ui/activity/FileActivity$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/zykj/huiwei/launcher/ui/activity/FileActivity;->d:Lcom/zykj/huiwei/launcher/ui/activity/FileActivity$a;

    const/16 v0, 0x8

    sput v0, Lcom/zykj/huiwei/launcher/ui/activity/FileActivity;->e:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/huiwei/launcher/base/CommonActivity;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic l(Lcom/zykj/huiwei/launcher/ui/activity/FileActivity;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/huiwei/launcher/ui/activity/FileActivity;->t(Lcom/zykj/huiwei/launcher/ui/activity/FileActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic m(Lcom/zykj/huiwei/launcher/ui/activity/FileActivity;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/huiwei/launcher/ui/activity/FileActivity;->u(Lcom/zykj/huiwei/launcher/ui/activity/FileActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic n(Lcom/zykj/huiwei/launcher/ui/activity/FileActivity;Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/zykj/huiwei/launcher/ui/activity/FileActivity;->s(Lcom/zykj/huiwei/launcher/ui/activity/FileActivity;Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z

    move-result p0

    return p0
.end method

.method public static synthetic o(Lcom/zykj/huiwei/launcher/ui/activity/FileActivity;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/huiwei/launcher/ui/activity/FileActivity;->r(Lcom/zykj/huiwei/launcher/ui/activity/FileActivity;Landroid/view/View;)V

    return-void
.end method

.method public static final r(Lcom/zykj/huiwei/launcher/ui/activity/FileActivity;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final s(Lcom/zykj/huiwei/launcher/ui/activity/FileActivity;Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .locals 4

    .line 1
    const/4 p1, 0x2

    .line 2
    if-ne p2, p1, :cond_6

    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/zykj/base/BaseActivity;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, Lcom/zykj/huiwei/launcher/databinding/DiscoveryActivityFileBinding;

    .line 9
    .line 10
    iget-object p1, p1, Lcom/zykj/huiwei/launcher/databinding/DiscoveryActivityFileBinding;->pdfPage:Lcom/zykj/huiwei/launcher/databinding/DiscoveryIncludePdfPageBinding;

    .line 11
    .line 12
    iget-object p1, p1, Lcom/zykj/huiwei/launcher/databinding/DiscoveryIncludePdfPageBinding;->etPage:Landroidx/appcompat/widget/AppCompatEditText;

    .line 13
    .line 14
    invoke-virtual {p1}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {p0}, Lcom/zykj/base/BaseActivity;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    check-cast p2, Lcom/zykj/huiwei/launcher/databinding/DiscoveryActivityFileBinding;

    .line 27
    .line 28
    iget-object p2, p2, Lcom/zykj/huiwei/launcher/databinding/DiscoveryActivityFileBinding;->pdfPage:Lcom/zykj/huiwei/launcher/databinding/DiscoveryIncludePdfPageBinding;

    .line 29
    .line 30
    iget-object p2, p2, Lcom/zykj/huiwei/launcher/databinding/DiscoveryIncludePdfPageBinding;->etPage:Landroidx/appcompat/widget/AppCompatEditText;

    .line 31
    .line 32
    invoke-virtual {p2}, Landroid/widget/TextView;->length()I

    .line 33
    .line 34
    .line 35
    move-result p2

    .line 36
    const/4 p3, 0x1

    .line 37
    if-nez p2, :cond_0

    .line 38
    .line 39
    move p1, p3

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 42
    .line 43
    .line 44
    move-result-wide v0

    .line 45
    const-wide/32 v2, 0x7fffffff

    .line 46
    .line 47
    .line 48
    cmp-long p2, v0, v2

    .line 49
    .line 50
    if-lez p2, :cond_1

    .line 51
    .line 52
    const p1, 0x7fffffff

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    :goto_0
    if-nez p1, :cond_2

    .line 61
    .line 62
    move p1, p3

    .line 63
    goto :goto_1

    .line 64
    :cond_2
    iget p2, p0, Lcom/zykj/huiwei/launcher/ui/activity/FileActivity;->b:I

    .line 65
    .line 66
    if-le p1, p2, :cond_3

    .line 67
    .line 68
    move p1, p2

    .line 69
    :cond_3
    :goto_1
    iput p1, p0, Lcom/zykj/huiwei/launcher/ui/activity/FileActivity;->a:I

    .line 70
    .line 71
    if-ge p1, p3, :cond_4

    .line 72
    .line 73
    iput p3, p0, Lcom/zykj/huiwei/launcher/ui/activity/FileActivity;->a:I

    .line 74
    .line 75
    :cond_4
    iget-object p1, p0, Lcom/zykj/huiwei/launcher/ui/activity/FileActivity;->c:Lcom/zykj/huiwei/launcher/ui/activity/PdfFragment;

    .line 76
    .line 77
    if-eqz p1, :cond_5

    .line 78
    .line 79
    iget p2, p0, Lcom/zykj/huiwei/launcher/ui/activity/FileActivity;->a:I

    .line 80
    .line 81
    sub-int/2addr p2, p3

    .line 82
    invoke-virtual {p1, p2}, Lcom/zykj/huiwei/launcher/ui/activity/PdfFragment;->y(I)V

    .line 83
    .line 84
    .line 85
    :cond_5
    invoke-virtual {p0}, Lcom/zykj/base/BaseActivity;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    check-cast p1, Lcom/zykj/huiwei/launcher/databinding/DiscoveryActivityFileBinding;

    .line 90
    .line 91
    iget-object p1, p1, Lcom/zykj/huiwei/launcher/databinding/DiscoveryActivityFileBinding;->pdfPage:Lcom/zykj/huiwei/launcher/databinding/DiscoveryIncludePdfPageBinding;

    .line 92
    .line 93
    iget-object p1, p1, Lcom/zykj/huiwei/launcher/databinding/DiscoveryIncludePdfPageBinding;->etPage:Landroidx/appcompat/widget/AppCompatEditText;

    .line 94
    .line 95
    invoke-virtual {p1}, Landroid/view/View;->clearFocus()V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p0}, Lcom/zykj/base/BaseActivity;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    check-cast p0, Lcom/zykj/huiwei/launcher/databinding/DiscoveryActivityFileBinding;

    .line 103
    .line 104
    iget-object p0, p0, Lcom/zykj/huiwei/launcher/databinding/DiscoveryActivityFileBinding;->pdfPage:Lcom/zykj/huiwei/launcher/databinding/DiscoveryIncludePdfPageBinding;

    .line 105
    .line 106
    iget-object p0, p0, Lcom/zykj/huiwei/launcher/databinding/DiscoveryIncludePdfPageBinding;->etPage:Landroidx/appcompat/widget/AppCompatEditText;

    .line 107
    .line 108
    invoke-static {p0}, Lcom/xuexiang/xui/utils/d;->d(Landroid/view/View;)V

    .line 109
    .line 110
    .line 111
    :cond_6
    const/4 p0, 0x0

    .line 112
    return p0
.end method

.method public static final t(Lcom/zykj/huiwei/launcher/ui/activity/FileActivity;Landroid/view/View;)V
    .locals 1

    .line 1
    iget p1, p0, Lcom/zykj/huiwei/launcher/ui/activity/FileActivity;->a:I

    .line 2
    .line 3
    add-int/lit8 v0, p1, -0x1

    .line 4
    .line 5
    iput v0, p0, Lcom/zykj/huiwei/launcher/ui/activity/FileActivity;->a:I

    .line 6
    .line 7
    iget-object p0, p0, Lcom/zykj/huiwei/launcher/ui/activity/FileActivity;->c:Lcom/zykj/huiwei/launcher/ui/activity/PdfFragment;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    add-int/lit8 p1, p1, -0x2

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lcom/zykj/huiwei/launcher/ui/activity/PdfFragment;->y(I)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public static final u(Lcom/zykj/huiwei/launcher/ui/activity/FileActivity;Landroid/view/View;)V
    .locals 1

    .line 1
    iget p1, p0, Lcom/zykj/huiwei/launcher/ui/activity/FileActivity;->a:I

    .line 2
    .line 3
    add-int/lit8 v0, p1, 0x1

    .line 4
    .line 5
    iput v0, p0, Lcom/zykj/huiwei/launcher/ui/activity/FileActivity;->a:I

    .line 6
    .line 7
    iget-object p0, p0, Lcom/zykj/huiwei/launcher/ui/activity/FileActivity;->c:Lcom/zykj/huiwei/launcher/ui/activity/PdfFragment;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Lcom/zykj/huiwei/launcher/ui/activity/PdfFragment;->y(I)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method


# virtual methods
.method public a(II)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/zykj/base/BaseActivity;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/zykj/huiwei/launcher/databinding/DiscoveryActivityFileBinding;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/zykj/huiwei/launcher/databinding/DiscoveryActivityFileBinding;->pdfPage:Lcom/zykj/huiwei/launcher/databinding/DiscoveryIncludePdfPageBinding;

    .line 8
    .line 9
    iget-object v0, v0, Lcom/zykj/huiwei/launcher/databinding/DiscoveryIncludePdfPageBinding;->etPage:Landroidx/appcompat/widget/AppCompatEditText;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/view/View;->clearFocus()V

    .line 12
    .line 13
    .line 14
    iput p1, p0, Lcom/zykj/huiwei/launcher/ui/activity/FileActivity;->a:I

    .line 15
    .line 16
    iput p2, p0, Lcom/zykj/huiwei/launcher/ui/activity/FileActivity;->b:I

    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/zykj/base/BaseActivity;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Lcom/zykj/huiwei/launcher/databinding/DiscoveryActivityFileBinding;

    .line 23
    .line 24
    iget-object v0, v0, Lcom/zykj/huiwei/launcher/databinding/DiscoveryActivityFileBinding;->pdfPage:Lcom/zykj/huiwei/launcher/databinding/DiscoveryIncludePdfPageBinding;

    .line 25
    .line 26
    iget-object v0, v0, Lcom/zykj/huiwei/launcher/databinding/DiscoveryIncludePdfPageBinding;->etPage:Landroidx/appcompat/widget/AppCompatEditText;

    .line 27
    .line 28
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Lcom/zykj/base/BaseActivity;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    check-cast v0, Lcom/zykj/huiwei/launcher/databinding/DiscoveryActivityFileBinding;

    .line 40
    .line 41
    iget-object v0, v0, Lcom/zykj/huiwei/launcher/databinding/DiscoveryActivityFileBinding;->pdfPage:Lcom/zykj/huiwei/launcher/databinding/DiscoveryIncludePdfPageBinding;

    .line 42
    .line 43
    iget-object v0, v0, Lcom/zykj/huiwei/launcher/databinding/DiscoveryIncludePdfPageBinding;->etPage:Landroidx/appcompat/widget/AppCompatEditText;

    .line 44
    .line 45
    invoke-virtual {p0}, Lcom/zykj/base/BaseActivity;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    check-cast v1, Lcom/zykj/huiwei/launcher/databinding/DiscoveryActivityFileBinding;

    .line 50
    .line 51
    iget-object v1, v1, Lcom/zykj/huiwei/launcher/databinding/DiscoveryActivityFileBinding;->pdfPage:Lcom/zykj/huiwei/launcher/databinding/DiscoveryIncludePdfPageBinding;

    .line 52
    .line 53
    iget-object v1, v1, Lcom/zykj/huiwei/launcher/databinding/DiscoveryIncludePdfPageBinding;->etPage:Landroidx/appcompat/widget/AppCompatEditText;

    .line 54
    .line 55
    invoke-virtual {v1}, Landroid/widget/TextView;->length()I

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setSelection(I)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, Lcom/zykj/base/BaseActivity;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    check-cast v0, Lcom/zykj/huiwei/launcher/databinding/DiscoveryActivityFileBinding;

    .line 67
    .line 68
    iget-object v0, v0, Lcom/zykj/huiwei/launcher/databinding/DiscoveryActivityFileBinding;->pdfPage:Lcom/zykj/huiwei/launcher/databinding/DiscoveryIncludePdfPageBinding;

    .line 69
    .line 70
    iget-object v0, v0, Lcom/zykj/huiwei/launcher/databinding/DiscoveryIncludePdfPageBinding;->tvTotalPage:Landroid/widget/TextView;

    .line 71
    .line 72
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 77
    .line 78
    .line 79
    if-lez p2, :cond_2

    .line 80
    .line 81
    invoke-virtual {p0}, Lcom/zykj/base/BaseActivity;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    check-cast v0, Lcom/zykj/huiwei/launcher/databinding/DiscoveryActivityFileBinding;

    .line 86
    .line 87
    iget-object v0, v0, Lcom/zykj/huiwei/launcher/databinding/DiscoveryActivityFileBinding;->pdfPage:Lcom/zykj/huiwei/launcher/databinding/DiscoveryIncludePdfPageBinding;

    .line 88
    .line 89
    iget-object v0, v0, Lcom/zykj/huiwei/launcher/databinding/DiscoveryIncludePdfPageBinding;->ivPrev:Landroidx/appcompat/widget/AppCompatImageView;

    .line 90
    .line 91
    const/4 v1, 0x0

    .line 92
    const/4 v2, 0x1

    .line 93
    if-le p1, v2, :cond_0

    .line 94
    .line 95
    move v3, v2

    .line 96
    goto :goto_0

    .line 97
    :cond_0
    move v3, v1

    .line 98
    :goto_0
    invoke-virtual {v0, v3}, Landroid/view/View;->setEnabled(Z)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p0}, Lcom/zykj/base/BaseActivity;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    check-cast v0, Lcom/zykj/huiwei/launcher/databinding/DiscoveryActivityFileBinding;

    .line 106
    .line 107
    iget-object v0, v0, Lcom/zykj/huiwei/launcher/databinding/DiscoveryActivityFileBinding;->pdfPage:Lcom/zykj/huiwei/launcher/databinding/DiscoveryIncludePdfPageBinding;

    .line 108
    .line 109
    iget-object v0, v0, Lcom/zykj/huiwei/launcher/databinding/DiscoveryIncludePdfPageBinding;->ivNext:Landroidx/appcompat/widget/AppCompatImageView;

    .line 110
    .line 111
    if-ge p1, p2, :cond_1

    .line 112
    .line 113
    move v1, v2

    .line 114
    :cond_1
    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 115
    .line 116
    .line 117
    :cond_2
    return-void
.end method

.method public initView(Landroid/os/Bundle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/zykj/base/BaseActivity;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/huiwei/launcher/databinding/DiscoveryActivityFileBinding;

    .line 6
    .line 7
    iget-object p1, p1, Lcom/zykj/huiwei/launcher/databinding/DiscoveryActivityFileBinding;->titleBar:Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 8
    .line 9
    new-instance p2, Lz3/b;

    .line 10
    .line 11
    invoke-direct {p2, p0}, Lz3/b;-><init>(Lcom/zykj/huiwei/launcher/ui/activity/FileActivity;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->h(Landroid/view/View$OnClickListener;)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const-string p2, "file_path"

    .line 22
    .line 23
    invoke-virtual {p1, p2}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    const/4 v0, 0x0

    .line 28
    if-eqz p1, :cond_0

    .line 29
    .line 30
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {p1, p2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    move-object p1, v0

    .line 40
    :goto_0
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    const-string v1, "url_path"

    .line 45
    .line 46
    invoke-virtual {p2, v1}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    .line 47
    .line 48
    .line 49
    move-result p2

    .line 50
    if-eqz p2, :cond_1

    .line 51
    .line 52
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    invoke-virtual {p2, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    :cond_1
    const/4 p2, 0x0

    .line 61
    if-eqz p1, :cond_5

    .line 62
    .line 63
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    if-nez v1, :cond_2

    .line 68
    .line 69
    goto/16 :goto_2

    .line 70
    .line 71
    :cond_2
    if-eqz v0, :cond_4

    .line 72
    .line 73
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    if-nez v1, :cond_3

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_3
    invoke-virtual {p0}, Lcom/zykj/base/BaseActivity;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    check-cast v1, Lcom/zykj/huiwei/launcher/databinding/DiscoveryActivityFileBinding;

    .line 85
    .line 86
    iget-object v1, v1, Lcom/zykj/huiwei/launcher/databinding/DiscoveryActivityFileBinding;->pdfPage:Lcom/zykj/huiwei/launcher/databinding/DiscoveryIncludePdfPageBinding;

    .line 87
    .line 88
    iget-object v1, v1, Lcom/zykj/huiwei/launcher/databinding/DiscoveryIncludePdfPageBinding;->etPage:Landroidx/appcompat/widget/AppCompatEditText;

    .line 89
    .line 90
    new-instance v2, Lz3/c;

    .line 91
    .line 92
    invoke-direct {v2, p0}, Lz3/c;-><init>(Lcom/zykj/huiwei/launcher/ui/activity/FileActivity;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p0}, Lcom/zykj/base/BaseActivity;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    check-cast v1, Lcom/zykj/huiwei/launcher/databinding/DiscoveryActivityFileBinding;

    .line 103
    .line 104
    iget-object v1, v1, Lcom/zykj/huiwei/launcher/databinding/DiscoveryActivityFileBinding;->pdfPage:Lcom/zykj/huiwei/launcher/databinding/DiscoveryIncludePdfPageBinding;

    .line 105
    .line 106
    iget-object v1, v1, Lcom/zykj/huiwei/launcher/databinding/DiscoveryIncludePdfPageBinding;->etPage:Landroidx/appcompat/widget/AppCompatEditText;

    .line 107
    .line 108
    invoke-virtual {v1}, Landroid/view/View;->clearFocus()V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p0}, Lcom/zykj/base/BaseActivity;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    check-cast v1, Lcom/zykj/huiwei/launcher/databinding/DiscoveryActivityFileBinding;

    .line 116
    .line 117
    iget-object v1, v1, Lcom/zykj/huiwei/launcher/databinding/DiscoveryActivityFileBinding;->pdfPage:Lcom/zykj/huiwei/launcher/databinding/DiscoveryIncludePdfPageBinding;

    .line 118
    .line 119
    iget-object v1, v1, Lcom/zykj/huiwei/launcher/databinding/DiscoveryIncludePdfPageBinding;->ivPrev:Landroidx/appcompat/widget/AppCompatImageView;

    .line 120
    .line 121
    invoke-virtual {v1, p2}, Landroid/view/View;->setEnabled(Z)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {p0}, Lcom/zykj/base/BaseActivity;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    check-cast v1, Lcom/zykj/huiwei/launcher/databinding/DiscoveryActivityFileBinding;

    .line 129
    .line 130
    iget-object v1, v1, Lcom/zykj/huiwei/launcher/databinding/DiscoveryActivityFileBinding;->pdfPage:Lcom/zykj/huiwei/launcher/databinding/DiscoveryIncludePdfPageBinding;

    .line 131
    .line 132
    iget-object v1, v1, Lcom/zykj/huiwei/launcher/databinding/DiscoveryIncludePdfPageBinding;->ivNext:Landroidx/appcompat/widget/AppCompatImageView;

    .line 133
    .line 134
    invoke-virtual {v1, p2}, Landroid/view/View;->setEnabled(Z)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {p0}, Lcom/zykj/base/BaseActivity;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 138
    .line 139
    .line 140
    move-result-object p2

    .line 141
    check-cast p2, Lcom/zykj/huiwei/launcher/databinding/DiscoveryActivityFileBinding;

    .line 142
    .line 143
    iget-object p2, p2, Lcom/zykj/huiwei/launcher/databinding/DiscoveryActivityFileBinding;->pdfPage:Lcom/zykj/huiwei/launcher/databinding/DiscoveryIncludePdfPageBinding;

    .line 144
    .line 145
    iget-object p2, p2, Lcom/zykj/huiwei/launcher/databinding/DiscoveryIncludePdfPageBinding;->ivPrev:Landroidx/appcompat/widget/AppCompatImageView;

    .line 146
    .line 147
    new-instance v1, Lz3/d;

    .line 148
    .line 149
    invoke-direct {v1, p0}, Lz3/d;-><init>(Lcom/zykj/huiwei/launcher/ui/activity/FileActivity;)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {p2, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {p0}, Lcom/zykj/base/BaseActivity;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 156
    .line 157
    .line 158
    move-result-object p2

    .line 159
    check-cast p2, Lcom/zykj/huiwei/launcher/databinding/DiscoveryActivityFileBinding;

    .line 160
    .line 161
    iget-object p2, p2, Lcom/zykj/huiwei/launcher/databinding/DiscoveryActivityFileBinding;->pdfPage:Lcom/zykj/huiwei/launcher/databinding/DiscoveryIncludePdfPageBinding;

    .line 162
    .line 163
    iget-object p2, p2, Lcom/zykj/huiwei/launcher/databinding/DiscoveryIncludePdfPageBinding;->ivNext:Landroidx/appcompat/widget/AppCompatImageView;

    .line 164
    .line 165
    new-instance v1, Lz3/e;

    .line 166
    .line 167
    invoke-direct {v1, p0}, Lz3/e;-><init>(Lcom/zykj/huiwei/launcher/ui/activity/FileActivity;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {p2, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {p0, p1, v0}, Lcom/zykj/huiwei/launcher/ui/activity/FileActivity;->p(Ljava/lang/String;Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 177
    .line 178
    return-object p1

    .line 179
    :cond_4
    :goto_1
    const-string p1, "\u6587\u4ef6\u7f51\u7edc\u5730\u5740\u4e0d\u5b58\u5728"

    .line 180
    .line 181
    new-array p2, p2, [Ljava/lang/Object;

    .line 182
    .line 183
    invoke-static {p1, p2}, Lcom/blankj/utilcode/util/ToastUtils;->r(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 187
    .line 188
    .line 189
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 190
    .line 191
    return-object p1

    .line 192
    :cond_5
    :goto_2
    const-string p1, "\u6587\u4ef6\u4e0d\u5b58\u5728"

    .line 193
    .line 194
    new-array p2, p2, [Ljava/lang/Object;

    .line 195
    .line 196
    invoke-static {p1, p2}, Lcom/blankj/utilcode/util/ToastUtils;->r(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 200
    .line 201
    .line 202
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 203
    .line 204
    return-object p1
.end method

.method public layoutId()I
    .locals 1

    # RE layout layout/discovery_activity_file (0x7f0c0034), APK res/zM.xml
    const v0, 0x7f0c0034

    return v0
.end method

.method public final p(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/huiwei/launcher/ui/activity/FileActivity;->q(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_2

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    const v3, 0x7f090155

    .line 13
    .line 14
    .line 15
    sparse-switch v2, :sswitch_data_0

    .line 16
    .line 17
    .line 18
    goto/16 :goto_0

    .line 19
    .line 20
    :sswitch_0
    const-string v2, "jpeg"

    .line 21
    .line 22
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-nez v2, :cond_1

    .line 27
    .line 28
    goto/16 :goto_0

    .line 29
    .line 30
    :sswitch_1
    const-string v2, "png"

    .line 31
    .line 32
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-nez v2, :cond_1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :sswitch_2
    const-string v2, "pdf"

    .line 40
    .line 41
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-nez v2, :cond_0

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/base/BaseActivity;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    check-cast v0, Lcom/zykj/huiwei/launcher/databinding/DiscoveryActivityFileBinding;

    .line 53
    .line 54
    iget-object v0, v0, Lcom/zykj/huiwei/launcher/databinding/DiscoveryActivityFileBinding;->pdfPage:Lcom/zykj/huiwei/launcher/databinding/DiscoveryIncludePdfPageBinding;

    .line 55
    .line 56
    iget-object v0, v0, Lcom/zykj/huiwei/launcher/databinding/DiscoveryIncludePdfPageBinding;->content:Landroid/widget/LinearLayout;

    .line 57
    .line 58
    const-string v2, "content"

    .line 59
    .line 60
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 64
    .line 65
    .line 66
    sget-object v0, Lcom/zykj/huiwei/launcher/ui/activity/PdfFragment;->g:Lcom/zykj/huiwei/launcher/ui/activity/PdfFragment$a;

    .line 67
    .line 68
    invoke-virtual {v0, p1, p2}, Lcom/zykj/huiwei/launcher/ui/activity/PdfFragment$a;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/zykj/huiwei/launcher/ui/activity/PdfFragment;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/ui/activity/FileActivity;->c:Lcom/zykj/huiwei/launcher/ui/activity/PdfFragment;

    .line 73
    .line 74
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-virtual {p1}, Landroidx/fragment/app/FragmentManager;->beginTransaction()Landroidx/fragment/app/FragmentTransaction;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    iget-object p2, p0, Lcom/zykj/huiwei/launcher/ui/activity/FileActivity;->c:Lcom/zykj/huiwei/launcher/ui/activity/PdfFragment;

    .line 83
    .line 84
    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p1, v3, p2}, Landroidx/fragment/app/FragmentTransaction;->replace(ILandroidx/fragment/app/Fragment;)Landroidx/fragment/app/FragmentTransaction;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-virtual {p1}, Landroidx/fragment/app/FragmentTransaction;->commitNowAllowingStateLoss()V

    .line 92
    .line 93
    .line 94
    return-void

    .line 95
    :sswitch_3
    const-string v2, "jpg"

    .line 96
    .line 97
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    if-nez v2, :cond_1

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :sswitch_4
    const-string v2, "gif"

    .line 105
    .line 106
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v2

    .line 110
    if-nez v2, :cond_1

    .line 111
    .line 112
    goto :goto_0

    .line 113
    :sswitch_5
    const-string v2, "bmp"

    .line 114
    .line 115
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result v2

    .line 119
    if-nez v2, :cond_1

    .line 120
    .line 121
    goto :goto_0

    .line 122
    :cond_1
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->beginTransaction()Landroidx/fragment/app/FragmentTransaction;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    sget-object v1, Lcom/zykj/huiwei/launcher/ui/activity/ImageFragment;->c:Lcom/zykj/huiwei/launcher/ui/activity/ImageFragment$a;

    .line 131
    .line 132
    invoke-virtual {v1, p1, p2}, Lcom/zykj/huiwei/launcher/ui/activity/ImageFragment$a;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/zykj/huiwei/launcher/ui/activity/ImageFragment;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    invoke-virtual {v0, v3, p1}, Landroidx/fragment/app/FragmentTransaction;->replace(ILandroidx/fragment/app/Fragment;)Landroidx/fragment/app/FragmentTransaction;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    invoke-virtual {p1}, Landroidx/fragment/app/FragmentTransaction;->commitNowAllowingStateLoss()V

    .line 141
    .line 142
    .line 143
    return-void

    .line 144
    :cond_2
    :goto_0
    new-instance p1, Ljava/lang/StringBuilder;

    .line 145
    .line 146
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 147
    .line 148
    .line 149
    const-string p2, "\u4e0d\u652f\u6301\u7684\u6587\u4ef6\u7c7b\u578b:"

    .line 150
    .line 151
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    new-array p2, v1, [Ljava/lang/Object;

    .line 162
    .line 163
    invoke-static {p1, p2}, Lcom/blankj/utilcode/util/ToastUtils;->r(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 167
    .line 168
    .line 169
    return-void

    .line 170
    nop

    .line 171
    :sswitch_data_0
    .sparse-switch
        0x17d85 -> :sswitch_5
        0x18fc4 -> :sswitch_4
        0x19be1 -> :sswitch_3
        0x1b0f2 -> :sswitch_2
        0x1b229 -> :sswitch_1
        0x31e068 -> :sswitch_0
    .end sparse-switch
.end method

.method public final q(Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v5, 0x6

    .line 9
    const/4 v6, 0x0

    .line 10
    const/16 v2, 0x2e

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    const/4 v4, 0x0

    .line 14
    move-object v1, p1

    .line 15
    invoke-static/range {v1 .. v6}, Lkotlin/text/StringsKt;->lastIndexOf$default(Ljava/lang/CharSequence;CIZILjava/lang/Object;)I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    const/4 v0, -0x1

    .line 20
    if-gt p1, v0, :cond_1

    .line 21
    .line 22
    :goto_0
    const-string p1, ""

    .line 23
    .line 24
    return-object p1

    .line 25
    :cond_1
    add-int/lit8 p1, p1, 0x1

    .line 26
    .line 27
    invoke-virtual {v1, p1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    const-string v0, "substring(...)"

    .line 32
    .line 33
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    return-object p1
.end method
