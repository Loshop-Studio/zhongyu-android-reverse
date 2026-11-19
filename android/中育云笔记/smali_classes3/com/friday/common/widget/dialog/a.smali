.class public final Lcom/friday/common/widget/dialog/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/friday/common/widget/dialog/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/friday/common/widget/dialog/a;

    invoke-direct {v0}, Lcom/friday/common/widget/dialog/a;-><init>()V

    sput-object v0, Lcom/friday/common/widget/dialog/a;->a:Lcom/friday/common/widget/dialog/a;

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

.method public static final A(Lcom/friday/common/databinding/DialogWithEditTextBinding;Lhd/l;Landroid/app/Dialog;Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p3, p0, Lcom/friday/common/databinding/DialogWithEditTextBinding;->f:Lcom/zykj/view/widget/LimitEditText;

    .line 2
    .line 3
    invoke-virtual {p3}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    .line 4
    .line 5
    .line 6
    move-result-object p3

    .line 7
    invoke-static {p3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p3

    .line 11
    invoke-static {p3}, Lcom/blankj/utilcode/util/StringUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object p0, p0, Lcom/friday/common/databinding/DialogWithEditTextBinding;->f:Lcom/zykj/view/widget/LimitEditText;

    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/widget/TextView;->getHint()Ljava/lang/CharSequence;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p3

    .line 27
    :cond_0
    invoke-static {p3}, Lqd/c0;->h0(Ljava/lang/CharSequence;)Z

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    if-eqz p0, :cond_1

    .line 32
    .line 33
    const-string p0, "\u6587\u4ef6\u540d\u4e0d\u80fd\u4e3a\u7a7a"

    .line 34
    .line 35
    invoke-static {p0}, Lz1/b;->i(Ljava/lang/CharSequence;)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_1
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    const/16 v0, 0x14

    .line 44
    .line 45
    if-le p0, v0, :cond_2

    .line 46
    .line 47
    sget p0, Lcom/friday/common/R$string;->name_length_limit:I

    .line 48
    .line 49
    invoke-static {p0}, Lz1/b;->h(I)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_2
    new-instance p0, Lkotlin/text/Regex;

    .line 54
    .line 55
    const-string v0, "^([\\u4e00-\\u9fa5a-zA-Z0-9\"\\s\\.\\/\\\u201c\\\u201d\\_\\\uff08\\\uff09\\(\\)\\\u3010\\\u3011])+$"

    .line 56
    .line 57
    invoke-direct {p0, v0}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0, p3}, Lkotlin/text/Regex;->g(Ljava/lang/CharSequence;)Z

    .line 61
    .line 62
    .line 63
    move-result p0

    .line 64
    if-nez p0, :cond_3

    .line 65
    .line 66
    sget p0, Lcom/friday/common/R$string;->name_content_rule:I

    .line 67
    .line 68
    invoke-static {p0}, Lz1/b;->h(I)V

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :cond_3
    :try_start_0
    invoke-interface {p1, p3}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    invoke-virtual {p2}, Landroid/app/Dialog;->dismiss()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :catch_0
    move-exception p0

    .line 80
    sget p1, Lcom/friday/common/R$string;->create_invoke_error:I

    .line 81
    .line 82
    invoke-static {p1}, Lz1/b;->h(I)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 86
    .line 87
    .line 88
    return-void
.end method

.method public static final C(Lhd/a;Landroid/content/Context;)Landroid/app/Dialog;
    .locals 6

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroid/app/Dialog;

    .line 7
    .line 8
    sget v1, Lcom/friday/common/R$style;->remind_dialog_theme:I

    .line 9
    .line 10
    invoke-direct {v0, p1, v1}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 11
    .line 12
    .line 13
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    sget v1, Lcom/friday/common/R$layout;->dialog_with_edit_text:I

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    const/4 v3, 0x0

    .line 21
    invoke-virtual {p1, v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    const-string v1, "inflate(...)"

    .line 26
    .line 27
    invoke-static {p1, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-static {p1}, Landroidx/databinding/DataBindingUtil;->bind(Landroid/view/View;)Landroidx/databinding/ViewDataBinding;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-static {v1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    check-cast v1, Lcom/friday/common/databinding/DialogWithEditTextBinding;

    .line 38
    .line 39
    iget-object v2, v1, Lcom/friday/common/databinding/DialogWithEditTextBinding;->g:Landroid/widget/TextView;

    .line 40
    .line 41
    const/4 v3, 0x4

    .line 42
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 43
    .line 44
    .line 45
    iget-object v2, v1, Lcom/friday/common/databinding/DialogWithEditTextBinding;->c:Landroid/widget/LinearLayout;

    .line 46
    .line 47
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 48
    .line 49
    .line 50
    iget-object v2, v1, Lcom/friday/common/databinding/DialogWithEditTextBinding;->h:Landroid/widget/TextView;

    .line 51
    .line 52
    sget v4, Lcom/friday/common/R$string;->delete_note_hint:I

    .line 53
    .line 54
    invoke-static {v4}, Lz1/b;->f(I)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 59
    .line 60
    .line 61
    iget-object v2, v1, Lcom/friday/common/databinding/DialogWithEditTextBinding;->f:Lcom/zykj/view/widget/LimitEditText;

    .line 62
    .line 63
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 64
    .line 65
    .line 66
    iget-object v2, v1, Lcom/friday/common/databinding/DialogWithEditTextBinding;->e:Landroid/widget/TextView;

    .line 67
    .line 68
    sget v3, Lcom/friday/common/R$string;->delete:I

    .line 69
    .line 70
    invoke-static {v3}, Lz1/b;->f(I)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 75
    .line 76
    .line 77
    iget-object v2, v1, Lcom/friday/common/databinding/DialogWithEditTextBinding;->e:Landroid/widget/TextView;

    .line 78
    .line 79
    const-string v3, "mBtnPositive"

    .line 80
    .line 81
    invoke-static {v2, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    new-instance v3, Ll2/m;

    .line 85
    .line 86
    invoke-direct {v3, p0, v0}, Ll2/m;-><init>(Lhd/a;Landroid/app/Dialog;)V

    .line 87
    .line 88
    .line 89
    const-wide/16 v4, 0x3e8

    .line 90
    .line 91
    invoke-static {v2, v4, v5, v3}, Lz1/b;->l(Landroid/view/View;JLandroid/view/View$OnClickListener;)V

    .line 92
    .line 93
    .line 94
    iget-object p0, v1, Lcom/friday/common/databinding/DialogWithEditTextBinding;->d:Landroid/widget/TextView;

    .line 95
    .line 96
    const-string v1, "mBtnNegative"

    .line 97
    .line 98
    invoke-static {p0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    new-instance v1, Ll2/n;

    .line 102
    .line 103
    invoke-direct {v1, v0}, Ll2/n;-><init>(Landroid/app/Dialog;)V

    .line 104
    .line 105
    .line 106
    invoke-static {p0, v4, v5, v1}, Lz1/b;->l(Landroid/view/View;JLandroid/view/View$OnClickListener;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0, p1}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 110
    .line 111
    .line 112
    return-object v0
.end method

.method public static final D(Lhd/a;Landroid/app/Dialog;Landroid/view/View;)V
    .locals 0

    .line 1
    :try_start_0
    invoke-interface {p0}, Lhd/a;->invoke()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    .line 6
    .line 7
    return-void

    .line 8
    :catch_0
    move-exception p0

    .line 9
    sget p1, Lcom/friday/common/R$string;->delete_error:I

    .line 10
    .line 11
    invoke-static {p1}, Lz1/b;->h(I)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public static final E(Landroid/app/Dialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final G(Lhd/a;Landroid/content/Context;)Landroid/app/Dialog;
    .locals 6

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroid/app/Dialog;

    .line 7
    .line 8
    sget v1, Lcom/friday/common/R$style;->remind_dialog_theme:I

    .line 9
    .line 10
    invoke-direct {v0, p1, v1}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 11
    .line 12
    .line 13
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    sget v1, Lcom/friday/common/R$layout;->dialog_with_edit_text:I

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    const/4 v3, 0x0

    .line 21
    invoke-virtual {p1, v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    const-string v1, "inflate(...)"

    .line 26
    .line 27
    invoke-static {p1, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-static {p1}, Landroidx/databinding/DataBindingUtil;->bind(Landroid/view/View;)Landroidx/databinding/ViewDataBinding;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-static {v1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    check-cast v1, Lcom/friday/common/databinding/DialogWithEditTextBinding;

    .line 38
    .line 39
    iget-object v2, v1, Lcom/friday/common/databinding/DialogWithEditTextBinding;->g:Landroid/widget/TextView;

    .line 40
    .line 41
    const/4 v3, 0x4

    .line 42
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 43
    .line 44
    .line 45
    iget-object v2, v1, Lcom/friday/common/databinding/DialogWithEditTextBinding;->c:Landroid/widget/LinearLayout;

    .line 46
    .line 47
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 48
    .line 49
    .line 50
    iget-object v2, v1, Lcom/friday/common/databinding/DialogWithEditTextBinding;->h:Landroid/widget/TextView;

    .line 51
    .line 52
    sget v4, Lcom/friday/common/R$string;->delete_complete_note_hint:I

    .line 53
    .line 54
    invoke-static {v4}, Lz1/b;->f(I)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 59
    .line 60
    .line 61
    iget-object v2, v1, Lcom/friday/common/databinding/DialogWithEditTextBinding;->f:Lcom/zykj/view/widget/LimitEditText;

    .line 62
    .line 63
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 64
    .line 65
    .line 66
    iget-object v2, v1, Lcom/friday/common/databinding/DialogWithEditTextBinding;->e:Landroid/widget/TextView;

    .line 67
    .line 68
    sget v3, Lcom/friday/common/R$string;->delete_complete:I

    .line 69
    .line 70
    invoke-static {v3}, Lz1/b;->f(I)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 75
    .line 76
    .line 77
    iget-object v2, v1, Lcom/friday/common/databinding/DialogWithEditTextBinding;->e:Landroid/widget/TextView;

    .line 78
    .line 79
    const-string v3, "mBtnPositive"

    .line 80
    .line 81
    invoke-static {v2, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    new-instance v3, Ll2/d;

    .line 85
    .line 86
    invoke-direct {v3, p0, v0}, Ll2/d;-><init>(Lhd/a;Landroid/app/Dialog;)V

    .line 87
    .line 88
    .line 89
    const-wide/16 v4, 0x3e8

    .line 90
    .line 91
    invoke-static {v2, v4, v5, v3}, Lz1/b;->l(Landroid/view/View;JLandroid/view/View$OnClickListener;)V

    .line 92
    .line 93
    .line 94
    iget-object p0, v1, Lcom/friday/common/databinding/DialogWithEditTextBinding;->d:Landroid/widget/TextView;

    .line 95
    .line 96
    const-string v1, "mBtnNegative"

    .line 97
    .line 98
    invoke-static {p0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    new-instance v1, Ll2/e;

    .line 102
    .line 103
    invoke-direct {v1, v0}, Ll2/e;-><init>(Landroid/app/Dialog;)V

    .line 104
    .line 105
    .line 106
    invoke-static {p0, v4, v5, v1}, Lz1/b;->l(Landroid/view/View;JLandroid/view/View$OnClickListener;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0, p1}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 110
    .line 111
    .line 112
    return-object v0
.end method

.method public static final H(Landroid/app/Dialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final I(Lhd/a;Landroid/app/Dialog;Landroid/view/View;)V
    .locals 0

    .line 1
    :try_start_0
    invoke-interface {p0}, Lhd/a;->invoke()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    .line 6
    .line 7
    return-void

    .line 8
    :catch_0
    move-exception p0

    .line 9
    sget p1, Lcom/friday/common/R$string;->delete_error:I

    .line 10
    .line 11
    invoke-static {p1}, Lz1/b;->h(I)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public static final K(Ljava/lang/String;Landroid/content/Context;)Landroid/app/Dialog;
    .locals 2

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroid/app/ProgressDialog;

    .line 7
    .line 8
    sget v1, Lcom/friday/common/R$style;->base_dialog:I

    .line 9
    .line 10
    invoke-direct {v0, p1, v1}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;I)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p0}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public static final M(Ljava/lang/String;Ljava/lang/String;Lhd/l;Landroid/content/Context;)Landroid/app/Dialog;
    .locals 4

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroid/app/Dialog;

    .line 7
    .line 8
    sget v1, Lcom/friday/common/R$style;->remind_dialog_theme:I

    .line 9
    .line 10
    invoke-direct {v0, p3, v1}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 11
    .line 12
    .line 13
    invoke-static {p3}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 14
    .line 15
    .line 16
    move-result-object p3

    .line 17
    sget v1, Lcom/friday/common/R$layout;->dialog_with_edit_text:I

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    const/4 v3, 0x0

    .line 21
    invoke-virtual {p3, v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 22
    .line 23
    .line 24
    move-result-object p3

    .line 25
    const-string v1, "inflate(...)"

    .line 26
    .line 27
    invoke-static {p3, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-static {p3}, Landroidx/databinding/DataBindingUtil;->bind(Landroid/view/View;)Landroidx/databinding/ViewDataBinding;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-static {v1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    check-cast v1, Lcom/friday/common/databinding/DialogWithEditTextBinding;

    .line 38
    .line 39
    iget-object v2, v1, Lcom/friday/common/databinding/DialogWithEditTextBinding;->h:Landroid/widget/TextView;

    .line 40
    .line 41
    const/4 v3, 0x4

    .line 42
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 43
    .line 44
    .line 45
    iget-object v2, v1, Lcom/friday/common/databinding/DialogWithEditTextBinding;->g:Landroid/widget/TextView;

    .line 46
    .line 47
    const-string v3, "0"

    .line 48
    .line 49
    invoke-static {v3, p0}, Lcom/blankj/utilcode/util/StringUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    if-eqz p0, :cond_0

    .line 54
    .line 55
    sget p0, Lcom/friday/common/R$string;->folder_name:I

    .line 56
    .line 57
    invoke-static {p0}, Lz1/b;->f(I)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    goto :goto_0

    .line 62
    :cond_0
    const-string p0, "\u6587\u4ef6\u540d\u79f0"

    .line 63
    .line 64
    :goto_0
    invoke-virtual {v2, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 65
    .line 66
    .line 67
    iget-object p0, v1, Lcom/friday/common/databinding/DialogWithEditTextBinding;->f:Lcom/zykj/view/widget/LimitEditText;

    .line 68
    .line 69
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    invoke-virtual {p0, p1}, Landroid/widget/EditText;->setSelection(I)V

    .line 77
    .line 78
    .line 79
    new-instance p1, Ll2/r;

    .line 80
    .line 81
    invoke-direct {p1}, Ll2/r;-><init>()V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 85
    .line 86
    .line 87
    iget-object p0, v1, Lcom/friday/common/databinding/DialogWithEditTextBinding;->e:Landroid/widget/TextView;

    .line 88
    .line 89
    sget p1, Lcom/friday/common/R$string;->finish:I

    .line 90
    .line 91
    invoke-static {p1}, Lz1/b;->f(I)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 96
    .line 97
    .line 98
    iget-object p0, v1, Lcom/friday/common/databinding/DialogWithEditTextBinding;->d:Landroid/widget/TextView;

    .line 99
    .line 100
    new-instance p1, Ll2/b;

    .line 101
    .line 102
    invoke-direct {p1, v0}, Ll2/b;-><init>(Landroid/app/Dialog;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {p0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 106
    .line 107
    .line 108
    iget-object p0, v1, Lcom/friday/common/databinding/DialogWithEditTextBinding;->e:Landroid/widget/TextView;

    .line 109
    .line 110
    new-instance p1, Ll2/c;

    .line 111
    .line 112
    invoke-direct {p1, v1, v0, p2}, Ll2/c;-><init>(Lcom/friday/common/databinding/DialogWithEditTextBinding;Landroid/app/Dialog;Lhd/l;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v0, p3}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 119
    .line 120
    .line 121
    return-object v0
.end method

.method public static final N(Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    if-eqz p2, :cond_0

    .line 3
    .line 4
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    const/16 p2, 0x42

    .line 9
    .line 10
    if-ne p1, p2, :cond_0

    .line 11
    .line 12
    const/4 p0, 0x1

    .line 13
    :cond_0
    return p0
.end method

.method public static final O(Landroid/app/Dialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final P(Lcom/friday/common/databinding/DialogWithEditTextBinding;Landroid/app/Dialog;Lhd/l;Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/friday/common/databinding/DialogWithEditTextBinding;->f:Lcom/zykj/view/widget/LimitEditText;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-static {p0}, Lcom/blankj/utilcode/util/StringUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 12
    .line 13
    .line 14
    move-result p3

    .line 15
    if-eqz p3, :cond_0

    .line 16
    .line 17
    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    new-instance p3, Lkotlin/text/Regex;

    .line 22
    .line 23
    const-string v0, "^([\\u4e00-\\u9fa5a-zA-Z0-9\"\\s\\.\\/\\\u201c\\\u201d\\_\\\uff08\\\uff09\\(\\)\\\u3010\\\u3011])+$"

    .line 24
    .line 25
    invoke-direct {p3, v0}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p3, p0}, Lkotlin/text/Regex;->g(Ljava/lang/CharSequence;)Z

    .line 29
    .line 30
    .line 31
    move-result p3

    .line 32
    if-nez p3, :cond_1

    .line 33
    .line 34
    sget p0, Lcom/friday/common/R$string;->name_content_rule:I

    .line 35
    .line 36
    invoke-static {p0}, Lz1/b;->h(I)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_1
    invoke-static {p0}, Lqd/c0;->h0(Ljava/lang/CharSequence;)Z

    .line 41
    .line 42
    .line 43
    move-result p3

    .line 44
    if-eqz p3, :cond_2

    .line 45
    .line 46
    const-string p0, "\u6587\u4ef6\u540d\u4e0d\u80fd\u4e3a\u7a7a"

    .line 47
    .line 48
    invoke-static {p0}, Lz1/b;->i(Ljava/lang/CharSequence;)V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :cond_2
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 53
    .line 54
    .line 55
    move-result p3

    .line 56
    const/16 v0, 0x14

    .line 57
    .line 58
    if-le p3, v0, :cond_3

    .line 59
    .line 60
    sget p0, Lcom/friday/common/R$string;->name_length_limit:I

    .line 61
    .line 62
    invoke-static {p0}, Lz1/b;->h(I)V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :cond_3
    invoke-interface {p2, p0}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    .line 70
    .line 71
    .line 72
    return-void
.end method

.method public static synthetic a(Lhd/a;Landroid/app/Dialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/friday/common/widget/dialog/a;->D(Lhd/a;Landroid/app/Dialog;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic b(Ljava/lang/String;Landroid/content/Context;)Landroid/app/Dialog;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/common/widget/dialog/a;->K(Ljava/lang/String;Landroid/content/Context;)Landroid/app/Dialog;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/friday/common/widget/dialog/a;->y(Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z

    move-result p0

    return p0
.end method

.method public static synthetic d(Lhd/a;Landroid/content/Context;)Landroid/app/Dialog;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/common/widget/dialog/a;->G(Lhd/a;Landroid/content/Context;)Landroid/app/Dialog;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Ljava/lang/String;Ljava/lang/String;Lhd/l;Landroid/content/Context;)Landroid/app/Dialog;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/friday/common/widget/dialog/a;->M(Ljava/lang/String;Ljava/lang/String;Lhd/l;Landroid/content/Context;)Landroid/app/Dialog;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Landroid/app/Dialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/common/widget/dialog/a;->z(Landroid/app/Dialog;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic g(Lhd/a;Landroid/app/Dialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/friday/common/widget/dialog/a;->I(Lhd/a;Landroid/app/Dialog;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic h(Landroid/app/Dialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/common/widget/dialog/a;->v(Landroid/app/Dialog;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic i(Landroid/app/Dialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/common/widget/dialog/a;->O(Landroid/app/Dialog;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic j(Landroid/app/Dialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/common/widget/dialog/a;->H(Landroid/app/Dialog;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic k(Lhd/a;Landroid/app/Dialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/friday/common/widget/dialog/a;->u(Lhd/a;Landroid/app/Dialog;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic l(Lcom/friday/common/databinding/DialogWithEditTextBinding;Landroid/app/Dialog;Lhd/l;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/friday/common/widget/dialog/a;->P(Lcom/friday/common/databinding/DialogWithEditTextBinding;Landroid/app/Dialog;Lhd/l;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic m(Landroid/app/Dialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/common/widget/dialog/a;->E(Landroid/app/Dialog;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic n(ZLhd/a;Landroid/content/Context;)Landroid/app/Dialog;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/friday/common/widget/dialog/a;->t(ZLhd/a;Landroid/content/Context;)Landroid/app/Dialog;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o(Lcom/friday/common/databinding/DialogWithEditTextBinding;Lhd/l;Landroid/app/Dialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/friday/common/widget/dialog/a;->A(Lcom/friday/common/databinding/DialogWithEditTextBinding;Lhd/l;Landroid/app/Dialog;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic p(Lhd/a;Landroid/content/Context;)Landroid/app/Dialog;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/common/widget/dialog/a;->C(Lhd/a;Landroid/content/Context;)Landroid/app/Dialog;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic q(Ljava/lang/String;Lhd/l;Landroid/content/Context;)Landroid/app/Dialog;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/friday/common/widget/dialog/a;->x(Ljava/lang/String;Lhd/l;Landroid/content/Context;)Landroid/app/Dialog;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic r(Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/friday/common/widget/dialog/a;->N(Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z

    move-result p0

    return p0
.end method

.method public static final t(ZLhd/a;Landroid/content/Context;)Landroid/app/Dialog;
    .locals 4

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroid/app/Dialog;

    .line 7
    .line 8
    sget v1, Lcom/friday/common/R$style;->remind_dialog_theme:I

    .line 9
    .line 10
    invoke-direct {v0, p2, v1}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 11
    .line 12
    .line 13
    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    sget v1, Lcom/friday/common/R$layout;->dialog_with_edit_text:I

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    const/4 v3, 0x0

    .line 21
    invoke-virtual {p2, v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    const-string v1, "inflate(...)"

    .line 26
    .line 27
    invoke-static {p2, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-static {p2}, Landroidx/databinding/DataBindingUtil;->bind(Landroid/view/View;)Landroidx/databinding/ViewDataBinding;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-static {v1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    check-cast v1, Lcom/friday/common/databinding/DialogWithEditTextBinding;

    .line 38
    .line 39
    iget-object v2, v1, Lcom/friday/common/databinding/DialogWithEditTextBinding;->g:Landroid/widget/TextView;

    .line 40
    .line 41
    const/4 v3, 0x4

    .line 42
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 43
    .line 44
    .line 45
    iget-object v2, v1, Lcom/friday/common/databinding/DialogWithEditTextBinding;->c:Landroid/widget/LinearLayout;

    .line 46
    .line 47
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 48
    .line 49
    .line 50
    if-eqz p0, :cond_0

    .line 51
    .line 52
    iget-object p0, v1, Lcom/friday/common/databinding/DialogWithEditTextBinding;->h:Landroid/widget/TextView;

    .line 53
    .line 54
    sget v2, Lcom/friday/common/R$string;->is_clear:I

    .line 55
    .line 56
    invoke-static {v2}, Lz1/b;->f(I)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-virtual {p0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 61
    .line 62
    .line 63
    iget-object p0, v1, Lcom/friday/common/databinding/DialogWithEditTextBinding;->e:Landroid/widget/TextView;

    .line 64
    .line 65
    sget v2, Lcom/friday/common/R$string;->confirm:I

    .line 66
    .line 67
    invoke-static {v2}, Lz1/b;->f(I)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    invoke-virtual {p0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_0
    iget-object p0, v1, Lcom/friday/common/databinding/DialogWithEditTextBinding;->h:Landroid/widget/TextView;

    .line 76
    .line 77
    sget v2, Lcom/friday/common/R$string;->logout_app_hint:I

    .line 78
    .line 79
    invoke-static {v2}, Lz1/b;->f(I)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    invoke-virtual {p0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 84
    .line 85
    .line 86
    iget-object p0, v1, Lcom/friday/common/databinding/DialogWithEditTextBinding;->e:Landroid/widget/TextView;

    .line 87
    .line 88
    sget v2, Lcom/friday/common/R$string;->exit:I

    .line 89
    .line 90
    invoke-static {v2}, Lz1/b;->f(I)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    invoke-virtual {p0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 95
    .line 96
    .line 97
    :goto_0
    iget-object p0, v1, Lcom/friday/common/databinding/DialogWithEditTextBinding;->f:Lcom/zykj/view/widget/LimitEditText;

    .line 98
    .line 99
    invoke-virtual {p0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 100
    .line 101
    .line 102
    iget-object p0, v1, Lcom/friday/common/databinding/DialogWithEditTextBinding;->e:Landroid/widget/TextView;

    .line 103
    .line 104
    new-instance v2, Ll2/p;

    .line 105
    .line 106
    invoke-direct {v2, p1, v0}, Ll2/p;-><init>(Lhd/a;Landroid/app/Dialog;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 110
    .line 111
    .line 112
    iget-object p0, v1, Lcom/friday/common/databinding/DialogWithEditTextBinding;->d:Landroid/widget/TextView;

    .line 113
    .line 114
    new-instance p1, Ll2/q;

    .line 115
    .line 116
    invoke-direct {p1, v0}, Ll2/q;-><init>(Landroid/app/Dialog;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {p0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0, p2}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 123
    .line 124
    .line 125
    return-object v0
.end method

.method public static final u(Lhd/a;Landroid/app/Dialog;Landroid/view/View;)V
    .locals 0

    .line 1
    :try_start_0
    invoke-interface {p0}, Lhd/a;->invoke()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    .line 6
    .line 7
    return-void

    .line 8
    :catch_0
    move-exception p0

    .line 9
    sget p1, Lcom/friday/common/R$string;->delete_error:I

    .line 10
    .line 11
    invoke-static {p1}, Lz1/b;->h(I)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public static final v(Landroid/app/Dialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final x(Ljava/lang/String;Lhd/l;Landroid/content/Context;)Landroid/app/Dialog;
    .locals 4

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroid/app/Dialog;

    .line 7
    .line 8
    sget v1, Lcom/friday/common/R$style;->remind_dialog_theme:I

    .line 9
    .line 10
    invoke-direct {v0, p2, v1}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 11
    .line 12
    .line 13
    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    sget v1, Lcom/friday/common/R$layout;->dialog_with_edit_text:I

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    const/4 v3, 0x0

    .line 21
    invoke-virtual {p2, v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    const-string v1, "inflate(...)"

    .line 26
    .line 27
    invoke-static {p2, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-static {p2}, Landroidx/databinding/DataBindingUtil;->bind(Landroid/view/View;)Landroidx/databinding/ViewDataBinding;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-static {v1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    check-cast v1, Lcom/friday/common/databinding/DialogWithEditTextBinding;

    .line 38
    .line 39
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    const/16 v3, 0x30

    .line 44
    .line 45
    if-eq v2, v3, :cond_4

    .line 46
    .line 47
    const/16 v3, 0x31

    .line 48
    .line 49
    if-eq v2, v3, :cond_2

    .line 50
    .line 51
    const/16 v3, 0x36

    .line 52
    .line 53
    if-eq v2, v3, :cond_0

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    const-string v2, "6"

    .line 57
    .line 58
    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    if-nez p0, :cond_1

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_1
    const-string p0, "\u65b0\u5efa\u6587\u672c"

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_2
    const-string v2, "1"

    .line 69
    .line 70
    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result p0

    .line 74
    if-nez p0, :cond_3

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_3
    sget p0, Lcom/friday/common/R$string;->create_new_note:I

    .line 78
    .line 79
    invoke-static {p0}, Lz1/b;->f(I)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    goto :goto_1

    .line 84
    :cond_4
    const-string v2, "0"

    .line 85
    .line 86
    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result p0

    .line 90
    if-nez p0, :cond_5

    .line 91
    .line 92
    :goto_0
    const-string p0, ""

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_5
    sget p0, Lcom/friday/common/R$string;->create_new_folder:I

    .line 96
    .line 97
    invoke-static {p0}, Lz1/b;->f(I)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    :goto_1
    iget-object v2, v1, Lcom/friday/common/databinding/DialogWithEditTextBinding;->h:Landroid/widget/TextView;

    .line 102
    .line 103
    const/16 v3, 0x8

    .line 104
    .line 105
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 106
    .line 107
    .line 108
    iget-object v2, v1, Lcom/friday/common/databinding/DialogWithEditTextBinding;->g:Landroid/widget/TextView;

    .line 109
    .line 110
    invoke-virtual {v2, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 111
    .line 112
    .line 113
    iget-object v2, v1, Lcom/friday/common/databinding/DialogWithEditTextBinding;->f:Lcom/zykj/view/widget/LimitEditText;

    .line 114
    .line 115
    invoke-virtual {v2, p0}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    .line 116
    .line 117
    .line 118
    new-instance p0, Ll2/g;

    .line 119
    .line 120
    invoke-direct {p0}, Ll2/g;-><init>()V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v2, p0}, Landroid/widget/TextView;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 124
    .line 125
    .line 126
    iget-object p0, v1, Lcom/friday/common/databinding/DialogWithEditTextBinding;->e:Landroid/widget/TextView;

    .line 127
    .line 128
    sget v2, Lcom/friday/common/R$string;->confirm:I

    .line 129
    .line 130
    invoke-static {v2}, Lz1/b;->f(I)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    invoke-virtual {p0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 135
    .line 136
    .line 137
    iget-object p0, v1, Lcom/friday/common/databinding/DialogWithEditTextBinding;->d:Landroid/widget/TextView;

    .line 138
    .line 139
    new-instance v2, Ll2/h;

    .line 140
    .line 141
    invoke-direct {v2, v0}, Ll2/h;-><init>(Landroid/app/Dialog;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {p0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 145
    .line 146
    .line 147
    iget-object p0, v1, Lcom/friday/common/databinding/DialogWithEditTextBinding;->e:Landroid/widget/TextView;

    .line 148
    .line 149
    new-instance v2, Ll2/i;

    .line 150
    .line 151
    invoke-direct {v2, v1, p1, v0}, Ll2/i;-><init>(Lcom/friday/common/databinding/DialogWithEditTextBinding;Lhd/l;Landroid/app/Dialog;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {p0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v0, p2}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 158
    .line 159
    .line 160
    return-object v0
.end method

.method public static final y(Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    if-eqz p2, :cond_0

    .line 3
    .line 4
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    const/16 p2, 0x42

    .line 9
    .line 10
    if-ne p1, p2, :cond_0

    .line 11
    .line 12
    const/4 p0, 0x1

    .line 13
    :cond_0
    return p0
.end method

.method public static final z(Landroid/app/Dialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final B(Lhd/a;)Lcom/friday/common/widget/dialog/BaseDialog;
    .locals 7

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lcom/friday/common/widget/dialog/BaseDialog;->e:Lcom/friday/common/widget/dialog/BaseDialog$a;

    .line 7
    .line 8
    new-instance v4, Ll2/j;

    .line 9
    .line 10
    invoke-direct {v4, p1}, Ll2/j;-><init>(Lhd/a;)V

    .line 11
    .line 12
    .line 13
    const/4 v5, 0x2

    .line 14
    const/4 v6, 0x0

    .line 15
    const/4 v2, 0x1

    .line 16
    const/4 v3, 0x0

    .line 17
    invoke-static/range {v1 .. v6}, Lcom/friday/common/widget/dialog/BaseDialog$a;->b(Lcom/friday/common/widget/dialog/BaseDialog$a;ZFLhd/l;ILjava/lang/Object;)Lcom/friday/common/widget/dialog/BaseDialog;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    return-object p1
.end method

.method public final F(Lhd/a;)Lcom/friday/common/widget/dialog/BaseDialog;
    .locals 7

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lcom/friday/common/widget/dialog/BaseDialog;->e:Lcom/friday/common/widget/dialog/BaseDialog$a;

    .line 7
    .line 8
    new-instance v4, Ll2/l;

    .line 9
    .line 10
    invoke-direct {v4, p1}, Ll2/l;-><init>(Lhd/a;)V

    .line 11
    .line 12
    .line 13
    const/4 v5, 0x2

    .line 14
    const/4 v6, 0x0

    .line 15
    const/4 v2, 0x1

    .line 16
    const/4 v3, 0x0

    .line 17
    invoke-static/range {v1 .. v6}, Lcom/friday/common/widget/dialog/BaseDialog$a;->b(Lcom/friday/common/widget/dialog/BaseDialog$a;ZFLhd/l;ILjava/lang/Object;)Lcom/friday/common/widget/dialog/BaseDialog;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    return-object p1
.end method

.method public final J(ZLjava/lang/String;)Lcom/friday/common/widget/dialog/BaseDialog;
    .locals 7

    .line 1
    const-string v0, "message"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lcom/friday/common/widget/dialog/BaseDialog;->e:Lcom/friday/common/widget/dialog/BaseDialog$a;

    .line 7
    .line 8
    new-instance v4, Ll2/a;

    .line 9
    .line 10
    invoke-direct {v4, p2}, Ll2/a;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const/4 v5, 0x2

    .line 14
    const/4 v6, 0x0

    .line 15
    const/4 v3, 0x0

    .line 16
    move v2, p1

    .line 17
    invoke-static/range {v1 .. v6}, Lcom/friday/common/widget/dialog/BaseDialog$a;->b(Lcom/friday/common/widget/dialog/BaseDialog$a;ZFLhd/l;ILjava/lang/Object;)Lcom/friday/common/widget/dialog/BaseDialog;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    return-object p1
.end method

.method public final L(Ljava/lang/String;Ljava/lang/String;Lhd/l;)Lcom/friday/common/widget/dialog/BaseDialog;
    .locals 7

    .line 1
    const-string v0, "type"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "oldName"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "listener"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    sget-object v1, Lcom/friday/common/widget/dialog/BaseDialog;->e:Lcom/friday/common/widget/dialog/BaseDialog$a;

    .line 17
    .line 18
    new-instance v4, Ll2/k;

    .line 19
    .line 20
    invoke-direct {v4, p1, p2, p3}, Ll2/k;-><init>(Ljava/lang/String;Ljava/lang/String;Lhd/l;)V

    .line 21
    .line 22
    .line 23
    const/4 v5, 0x2

    .line 24
    const/4 v6, 0x0

    .line 25
    const/4 v2, 0x1

    .line 26
    const/4 v3, 0x0

    .line 27
    invoke-static/range {v1 .. v6}, Lcom/friday/common/widget/dialog/BaseDialog$a;->b(Lcom/friday/common/widget/dialog/BaseDialog$a;ZFLhd/l;ILjava/lang/Object;)Lcom/friday/common/widget/dialog/BaseDialog;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    return-object p1
.end method

.method public final s(ZLhd/a;)Lcom/friday/common/widget/dialog/BaseDialog;
    .locals 7

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lcom/friday/common/widget/dialog/BaseDialog;->e:Lcom/friday/common/widget/dialog/BaseDialog$a;

    .line 7
    .line 8
    new-instance v4, Ll2/o;

    .line 9
    .line 10
    invoke-direct {v4, p1, p2}, Ll2/o;-><init>(ZLhd/a;)V

    .line 11
    .line 12
    .line 13
    const/4 v5, 0x2

    .line 14
    const/4 v6, 0x0

    .line 15
    const/4 v2, 0x1

    .line 16
    const/4 v3, 0x0

    .line 17
    invoke-static/range {v1 .. v6}, Lcom/friday/common/widget/dialog/BaseDialog$a;->b(Lcom/friday/common/widget/dialog/BaseDialog$a;ZFLhd/l;ILjava/lang/Object;)Lcom/friday/common/widget/dialog/BaseDialog;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    return-object p1
.end method

.method public final w(Ljava/lang/String;Lhd/l;)Lcom/friday/common/widget/dialog/BaseDialog;
    .locals 7

    .line 1
    const-string v0, "type"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "listener"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object v1, Lcom/friday/common/widget/dialog/BaseDialog;->e:Lcom/friday/common/widget/dialog/BaseDialog$a;

    .line 12
    .line 13
    new-instance v4, Ll2/f;

    .line 14
    .line 15
    invoke-direct {v4, p1, p2}, Ll2/f;-><init>(Ljava/lang/String;Lhd/l;)V

    .line 16
    .line 17
    .line 18
    const/4 v5, 0x2

    .line 19
    const/4 v6, 0x0

    .line 20
    const/4 v2, 0x1

    .line 21
    const/4 v3, 0x0

    .line 22
    invoke-static/range {v1 .. v6}, Lcom/friday/common/widget/dialog/BaseDialog$a;->b(Lcom/friday/common/widget/dialog/BaseDialog$a;ZFLhd/l;ILjava/lang/Object;)Lcom/friday/common/widget/dialog/BaseDialog;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    return-object p1
.end method
