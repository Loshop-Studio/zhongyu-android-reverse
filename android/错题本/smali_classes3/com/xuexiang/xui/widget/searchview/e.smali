.class public final Lcom/xuexiang/xui/widget/searchview/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/text/TextWatcher;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/xuexiang/xui/widget/searchview/e;->a:I

    iput-object p1, p0, Lcom/xuexiang/xui/widget/searchview/e;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a(Landroid/text/Editable;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final b(Landroid/text/Editable;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final c(Ljava/lang/CharSequence;III)V
    .locals 0

    .line 1
    return-void
.end method

.method private final d(Ljava/lang/CharSequence;III)V
    .locals 0

    .line 1
    return-void
.end method

.method private final e(Ljava/lang/CharSequence;III)V
    .locals 0

    .line 1
    return-void
.end method

.method private final f(Ljava/lang/CharSequence;III)V
    .locals 0

    .line 1
    return-void
.end method

.method private final g(Ljava/lang/CharSequence;III)V
    .locals 0

    .line 1
    return-void
.end method

.method private final h(Ljava/lang/CharSequence;III)V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 7

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/searchview/e;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :pswitch_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/e;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-nez v1, :cond_1

    .line 20
    .line 21
    const-string v1, ""

    .line 22
    .line 23
    invoke-virtual {p1, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    const/4 v2, 0x0

    .line 28
    :goto_0
    array-length v3, p1

    .line 29
    if-ge v2, v3, :cond_1

    .line 30
    .line 31
    iget v3, v0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->c:I

    .line 32
    .line 33
    if-le v2, v3, :cond_0

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_0
    aget-object v3, p1, v2

    .line 37
    .line 38
    invoke-static {v0, v3}, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->b(Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    iget-object v3, v0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->b:Lcom/xuexiang/xui/widget/edittext/verify/PwdEditText;

    .line 42
    .line 43
    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 44
    .line 45
    .line 46
    add-int/lit8 v2, v2, 0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    :goto_1
    return-void

    .line 50
    :pswitch_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/e;->b:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;

    .line 53
    .line 54
    iget-object v1, v0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->a:Landroid/widget/EditText;

    .line 55
    .line 56
    invoke-virtual {v1}, Landroid/widget/TextView;->getSelectionStart()I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    iget-object v2, v0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->a:Landroid/widget/EditText;

    .line 61
    .line 62
    invoke-virtual {v2}, Landroid/widget/TextView;->getSelectionEnd()I

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    iget-object v3, v0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->a:Landroid/widget/EditText;

    .line 67
    .line 68
    iget-object v4, v0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->o:Lcom/xuexiang/xui/widget/searchview/e;

    .line 69
    .line 70
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->removeTextChangedListener(Landroid/text/TextWatcher;)V

    .line 71
    .line 72
    .line 73
    iget-boolean v3, v0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->f:Z

    .line 74
    .line 75
    if-eqz v3, :cond_3

    .line 76
    .line 77
    :goto_2
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    if-eqz v3, :cond_2

    .line 82
    .line 83
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 84
    .line 85
    .line 86
    move-result v3

    .line 87
    goto :goto_3

    .line 88
    :cond_2
    const/4 v3, 0x0

    .line 89
    :goto_3
    iget v4, v0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->c:I

    .line 90
    .line 91
    if-le v3, v4, :cond_4

    .line 92
    .line 93
    add-int/lit8 v3, v1, -0x1

    .line 94
    .line 95
    invoke-interface {p1, v3, v2}, Landroid/text/Editable;->delete(II)Landroid/text/Editable;

    .line 96
    .line 97
    .line 98
    add-int/lit8 v1, v1, -0x1

    .line 99
    .line 100
    add-int/lit8 v2, v2, -0x1

    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_3
    :goto_4
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    invoke-static {v3}, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->a(Ljava/lang/String;)J

    .line 108
    .line 109
    .line 110
    move-result-wide v3

    .line 111
    iget v5, v0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->c:I

    .line 112
    .line 113
    int-to-long v5, v5

    .line 114
    cmp-long v3, v3, v5

    .line 115
    .line 116
    if-lez v3, :cond_4

    .line 117
    .line 118
    add-int/lit8 v3, v1, -0x1

    .line 119
    .line 120
    invoke-interface {p1, v3, v2}, Landroid/text/Editable;->delete(II)Landroid/text/Editable;

    .line 121
    .line 122
    .line 123
    add-int/lit8 v1, v1, -0x1

    .line 124
    .line 125
    add-int/lit8 v2, v2, -0x1

    .line 126
    .line 127
    goto :goto_4

    .line 128
    :cond_4
    iget-object p1, v0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->a:Landroid/widget/EditText;

    .line 129
    .line 130
    invoke-virtual {p1, v1}, Landroid/widget/EditText;->setSelection(I)V

    .line 131
    .line 132
    .line 133
    iget-object p1, v0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->a:Landroid/widget/EditText;

    .line 134
    .line 135
    iget-object v1, v0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->o:Lcom/xuexiang/xui/widget/searchview/e;

    .line 136
    .line 137
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->b()V

    .line 141
    .line 142
    .line 143
    :pswitch_2
    return-void

    .line 144
    nop

    .line 145
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .line 1
    iget p1, p0, Lcom/xuexiang/xui/widget/searchview/e;->a:I

    return-void
.end method

.method public final onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .line 1
    iget p2, p0, Lcom/xuexiang/xui/widget/searchview/e;->a:I

    .line 2
    .line 3
    packed-switch p2, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/xuexiang/xui/widget/searchview/e;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Ls3/c;

    .line 9
    .line 10
    invoke-virtual {p1}, Ls3/c;->a()V

    .line 11
    .line 12
    .line 13
    :pswitch_0
    return-void

    .line 14
    :pswitch_1
    iget-object p2, p0, Lcom/xuexiang/xui/widget/searchview/e;->b:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p2, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;

    .line 17
    .line 18
    iput-object p1, p2, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->k:Ljava/lang/CharSequence;

    .line 19
    .line 20
    iget-object p3, p2, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->l:Landroid/widget/ListAdapter;

    .line 21
    .line 22
    if-eqz p3, :cond_0

    .line 23
    .line 24
    instance-of p4, p3, Landroid/widget/Filterable;

    .line 25
    .line 26
    if-eqz p4, :cond_0

    .line 27
    .line 28
    check-cast p3, Landroid/widget/Filterable;

    .line 29
    .line 30
    invoke-interface {p3}, Landroid/widget/Filterable;->getFilter()Landroid/widget/Filter;

    .line 31
    .line 32
    .line 33
    move-result-object p3

    .line 34
    invoke-virtual {p3, p1, p2}, Landroid/widget/Filter;->filter(Ljava/lang/CharSequence;Landroid/widget/Filter$FilterListener;)V

    .line 35
    .line 36
    .line 37
    :cond_0
    iget-object p3, p2, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->f:Landroid/widget/EditText;

    .line 38
    .line 39
    invoke-virtual {p3}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 40
    .line 41
    .line 42
    move-result-object p3

    .line 43
    iput-object p3, p2, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->k:Ljava/lang/CharSequence;

    .line 44
    .line 45
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 46
    .line 47
    .line 48
    move-result p3

    .line 49
    if-nez p3, :cond_1

    .line 50
    .line 51
    iget-object p3, p2, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->i:Landroid/widget/ImageButton;

    .line 52
    .line 53
    const/4 p4, 0x0

    .line 54
    invoke-virtual {p3, p4}, Landroid/view/View;->setVisibility(I)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p2, p4}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->g(Z)V

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_1
    iget-object p3, p2, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->i:Landroid/widget/ImageButton;

    .line 62
    .line 63
    const/16 p4, 0x8

    .line 64
    .line 65
    invoke-virtual {p3, p4}, Landroid/view/View;->setVisibility(I)V

    .line 66
    .line 67
    .line 68
    const/4 p3, 0x1

    .line 69
    invoke-virtual {p2, p3}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->g(Z)V

    .line 70
    .line 71
    .line 72
    :goto_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    nop

    .line 77
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
