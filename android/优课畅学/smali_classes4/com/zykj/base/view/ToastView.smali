.class public final Lcom/zykj/base/view/ToastView;
.super Landroid/view/View;
.source "SourceFile"


# instance fields
.field public a:Lcom/kunminx/architecture/ui/callback/ProtectedUnPeekLiveData;

.field public final b:Landroidx/lifecycle/Observer;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 7
    .line 8
    .line 9
    new-instance p2, Lb3/a;

    .line 10
    .line 11
    invoke-direct {p2, p1}, Lb3/a;-><init>(Landroid/content/Context;)V

    .line 12
    .line 13
    .line 14
    iput-object p2, p0, Lcom/zykj/base/view/ToastView;->b:Landroidx/lifecycle/Observer;

    .line 15
    .line 16
    return-void
.end method

.method public static synthetic a(Landroid/content/Context;Lcom/zykj/base/bean/toast/ToastMessage;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/base/view/ToastView;->b(Landroid/content/Context;Lcom/zykj/base/bean/toast/ToastMessage;)V

    return-void
.end method

.method public static final b(Landroid/content/Context;Lcom/zykj/base/bean/toast/ToastMessage;)V
    .locals 2

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/zykj/base/bean/toast/ToastMessage;->getMessage()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const-string v0, ""

    .line 14
    .line 15
    :goto_0
    invoke-virtual {p1}, Lcom/zykj/base/bean/toast/ToastMessage;->getMessageResId()Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    const-string p0, "getString(...)"

    .line 30
    .line 31
    invoke-static {v0, p0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    :cond_1
    instance-of p0, p1, Lcom/zykj/base/bean/toast/ToastInfoMessage;

    .line 35
    .line 36
    if-eqz p0, :cond_2

    .line 37
    .line 38
    sget-object p0, Lcom/zykj/base/utils/XToastUtils;->INSTANCE:Lcom/zykj/base/utils/XToastUtils;

    .line 39
    .line 40
    invoke-virtual {p0, v0}, Lcom/zykj/base/utils/XToastUtils;->info(Ljava/lang/CharSequence;)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_2
    instance-of p0, p1, Lcom/zykj/base/bean/toast/ToastWarnMessage;

    .line 45
    .line 46
    if-eqz p0, :cond_3

    .line 47
    .line 48
    sget-object p0, Lcom/zykj/base/utils/XToastUtils;->INSTANCE:Lcom/zykj/base/utils/XToastUtils;

    .line 49
    .line 50
    invoke-virtual {p0, v0}, Lcom/zykj/base/utils/XToastUtils;->info(Ljava/lang/CharSequence;)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :cond_3
    instance-of p0, p1, Lcom/zykj/base/bean/toast/ToastErrorMessage;

    .line 55
    .line 56
    if-eqz p0, :cond_4

    .line 57
    .line 58
    sget-object p0, Lcom/zykj/base/utils/XToastUtils;->INSTANCE:Lcom/zykj/base/utils/XToastUtils;

    .line 59
    .line 60
    invoke-virtual {p0, v0}, Lcom/zykj/base/utils/XToastUtils;->error(Ljava/lang/CharSequence;)V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :cond_4
    instance-of p0, p1, Lcom/zykj/base/bean/toast/ToastErrorCodeMessage;

    .line 65
    .line 66
    if-eqz p0, :cond_5

    .line 67
    .line 68
    sget-object p0, Lcom/zykj/base/utils/XToastUtils;->INSTANCE:Lcom/zykj/base/utils/XToastUtils;

    .line 69
    .line 70
    check-cast p1, Lcom/zykj/base/bean/toast/ToastErrorCodeMessage;

    .line 71
    .line 72
    invoke-virtual {p1}, Lcom/zykj/base/bean/toast/ToastErrorCodeMessage;->getErrorInfo()Lcom/zykj/lib/error/code/ErrorCodeInfo;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-virtual {p1}, Lcom/zykj/lib/error/code/ErrorCodeInfo;->getCode()I

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    new-instance v1, Ljava/lang/StringBuilder;

    .line 81
    .line 82
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    const-string p1, " "

    .line 89
    .line 90
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    invoke-virtual {p0, p1}, Lcom/zykj/base/utils/XToastUtils;->error(Ljava/lang/CharSequence;)V

    .line 101
    .line 102
    .line 103
    return-void

    .line 104
    :cond_5
    instance-of p0, p1, Lcom/zykj/base/bean/toast/ToastSuccessMessage;

    .line 105
    .line 106
    if-eqz p0, :cond_6

    .line 107
    .line 108
    sget-object p0, Lcom/zykj/base/utils/XToastUtils;->INSTANCE:Lcom/zykj/base/utils/XToastUtils;

    .line 109
    .line 110
    invoke-virtual {p0, v0}, Lcom/zykj/base/utils/XToastUtils;->success(Ljava/lang/CharSequence;)V

    .line 111
    .line 112
    .line 113
    return-void

    .line 114
    :cond_6
    sget-object p0, Lcom/zykj/base/utils/XToastUtils;->INSTANCE:Lcom/zykj/base/utils/XToastUtils;

    .line 115
    .line 116
    invoke-virtual {p0, v0}, Lcom/zykj/base/utils/XToastUtils;->info(Ljava/lang/CharSequence;)V

    .line 117
    .line 118
    .line 119
    return-void
.end method


# virtual methods
.method public final getToastLiveData()Lcom/kunminx/architecture/ui/callback/ProtectedUnPeekLiveData;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/kunminx/architecture/ui/callback/ProtectedUnPeekLiveData<",
            "Lcom/zykj/base/bean/toast/ToastMessage;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/base/view/ToastView;->a:Lcom/kunminx/architecture/ui/callback/ProtectedUnPeekLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final setToastLiveData(Lcom/kunminx/architecture/ui/callback/ProtectedUnPeekLiveData;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kunminx/architecture/ui/callback/ProtectedUnPeekLiveData<",
            "Lcom/zykj/base/bean/toast/ToastMessage;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/base/view/ToastView;->a:Lcom/kunminx/architecture/ui/callback/ProtectedUnPeekLiveData;

    .line 2
    .line 3
    invoke-static {p0}, Landroidx/lifecycle/ViewTreeLifecycleOwner;->get(Landroid/view/View;)Landroidx/lifecycle/LifecycleOwner;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    iget-object v1, p0, Lcom/zykj/base/view/ToastView;->b:Landroidx/lifecycle/Observer;

    .line 12
    .line 13
    invoke-virtual {p1, v0, v1}, Lcom/kunminx/architecture/ui/callback/ProtectedUnPeekLiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method
