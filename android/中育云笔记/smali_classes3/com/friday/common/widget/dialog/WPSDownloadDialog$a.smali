.class public final Lcom/friday/common/widget/dialog/WPSDownloadDialog$a;
.super Lh7/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/common/widget/dialog/WPSDownloadDialog;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lcom/friday/common/widget/dialog/WPSDownloadDialog;


# direct methods
.method public constructor <init>(Lcom/friday/common/widget/dialog/WPSDownloadDialog;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/common/widget/dialog/WPSDownloadDialog$a;->b:Lcom/friday/common/widget/dialog/WPSDownloadDialog;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lh7/a;-><init>(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(Lcom/lzy/okgo/model/Progress;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/friday/common/widget/dialog/WPSDownloadDialog$a;->b:Lcom/friday/common/widget/dialog/WPSDownloadDialog;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/friday/common/widget/dialog/WPSDownloadDialog;->r(Lcom/friday/common/widget/dialog/WPSDownloadDialog;)Lcom/friday/common/databinding/DialogDownloadWpsBinding;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    const-string p1, "dataBinding"

    .line 10
    .line 11
    invoke-static {p1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    :cond_0
    iget-object p1, p1, Lcom/friday/common/databinding/DialogDownloadWpsBinding;->c:Landroidx/cardview/widget/CardView;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-virtual {p1, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public b(Lcom/lzy/okgo/model/Progress;)V
    .locals 3

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/common/widget/dialog/WPSDownloadDialog$a;->b:Lcom/friday/common/widget/dialog/WPSDownloadDialog;

    .line 4
    .line 5
    invoke-static {v0}, Lcom/friday/common/widget/dialog/WPSDownloadDialog;->r(Lcom/friday/common/widget/dialog/WPSDownloadDialog;)Lcom/friday/common/databinding/DialogDownloadWpsBinding;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const-string v0, "dataBinding"

    .line 12
    .line 13
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    :cond_0
    iget-object v0, v0, Lcom/friday/common/databinding/DialogDownloadWpsBinding;->e:Landroid/widget/TextView;

    .line 18
    .line 19
    sget-object v1, Lkotlin/jvm/internal/c0;->a:Lkotlin/jvm/internal/c0;

    .line 20
    .line 21
    iget p1, p1, Lcom/lzy/okgo/model/Progress;->h:F

    .line 22
    .line 23
    const/16 v1, 0x64

    .line 24
    .line 25
    int-to-float v1, v1

    .line 26
    mul-float/2addr p1, v1

    .line 27
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    const/4 v1, 0x1

    .line 36
    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    const-string v1, "%.0f"

    .line 41
    .line 42
    invoke-static {v1, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    const-string v1, "format(...)"

    .line 47
    .line 48
    invoke-static {p1, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    new-instance v1, Ljava/lang/StringBuilder;

    .line 52
    .line 53
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 54
    .line 55
    .line 56
    const-string v2, "\u4e0b\u8f7d\u4e2d"

    .line 57
    .line 58
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    const-string p1, "%"

    .line 65
    .line 66
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 74
    .line 75
    .line 76
    :cond_1
    return-void
.end method

.method public bridge synthetic c(Ljava/lang/Object;Lcom/lzy/okgo/model/Progress;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/io/File;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/friday/common/widget/dialog/WPSDownloadDialog$a;->e(Ljava/io/File;Lcom/lzy/okgo/model/Progress;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public d(Lcom/lzy/okgo/model/Progress;)V
    .locals 3

    .line 1
    const-string p1, "\u4e0b\u8f7d\u51fa\u9519\uff0c\u8bf7\u91cd\u8bd5"

    .line 2
    .line 3
    invoke-static {p1}, Lz1/b;->i(Ljava/lang/CharSequence;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/friday/common/widget/dialog/WPSDownloadDialog$a;->b:Lcom/friday/common/widget/dialog/WPSDownloadDialog;

    .line 7
    .line 8
    invoke-static {p1}, Lcom/friday/common/widget/dialog/WPSDownloadDialog;->r(Lcom/friday/common/widget/dialog/WPSDownloadDialog;)Lcom/friday/common/databinding/DialogDownloadWpsBinding;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    const/4 v0, 0x0

    .line 13
    const-string v1, "dataBinding"

    .line 14
    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    invoke-static {v1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    move-object p1, v0

    .line 21
    :cond_0
    iget-object p1, p1, Lcom/friday/common/databinding/DialogDownloadWpsBinding;->e:Landroid/widget/TextView;

    .line 22
    .line 23
    const-string v2, "\u4e0b\u8f7d\u5e76\u5b89\u88c5"

    .line 24
    .line 25
    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 26
    .line 27
    .line 28
    iget-object p1, p0, Lcom/friday/common/widget/dialog/WPSDownloadDialog$a;->b:Lcom/friday/common/widget/dialog/WPSDownloadDialog;

    .line 29
    .line 30
    invoke-static {p1}, Lcom/friday/common/widget/dialog/WPSDownloadDialog;->r(Lcom/friday/common/widget/dialog/WPSDownloadDialog;)Lcom/friday/common/databinding/DialogDownloadWpsBinding;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    if-nez p1, :cond_1

    .line 35
    .line 36
    invoke-static {v1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    move-object v0, p1

    .line 41
    :goto_0
    iget-object p1, v0, Lcom/friday/common/databinding/DialogDownloadWpsBinding;->c:Landroidx/cardview/widget/CardView;

    .line 42
    .line 43
    const/4 v0, 0x1

    .line 44
    invoke-virtual {p1, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public e(Ljava/io/File;Lcom/lzy/okgo/model/Progress;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/blankj/utilcode/util/AppUtils;->installApp(Ljava/io/File;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lcom/friday/common/widget/dialog/WPSDownloadDialog$a;->b:Lcom/friday/common/widget/dialog/WPSDownloadDialog;

    .line 5
    .line 6
    invoke-static {p1}, Lcom/friday/common/widget/dialog/WPSDownloadDialog;->r(Lcom/friday/common/widget/dialog/WPSDownloadDialog;)Lcom/friday/common/databinding/DialogDownloadWpsBinding;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    const-string p1, "dataBinding"

    .line 13
    .line 14
    invoke-static {p1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    :cond_0
    iget-object p1, p1, Lcom/friday/common/databinding/DialogDownloadWpsBinding;->e:Landroid/widget/TextView;

    .line 19
    .line 20
    const-string p2, "\u4e0b\u8f7d\u4e2d100%"

    .line 21
    .line 22
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 23
    .line 24
    .line 25
    iget-object p1, p0, Lcom/friday/common/widget/dialog/WPSDownloadDialog$a;->b:Lcom/friday/common/widget/dialog/WPSDownloadDialog;

    .line 26
    .line 27
    invoke-virtual {p1}, Landroidx/fragment/app/DialogFragment;->dismissAllowingStateLoss()V

    .line 28
    .line 29
    .line 30
    return-void
.end method
