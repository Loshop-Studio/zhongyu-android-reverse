.class public final synthetic Ll4/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ll4/i;


# direct methods
.method public synthetic constructor <init>(Ll4/i;I)V
    .locals 0

    .line 1
    iput p2, p0, Ll4/h;->a:I

    iput-object p1, p0, Ll4/h;->b:Ll4/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 10

    .line 1
    iget p1, p0, Ll4/h;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Ll4/h;->b:Ll4/i;

    .line 7
    .line 8
    iget-object v0, p1, Ll4/i;->b:Lcom/zykj/mistake/databinding/DialogMistakeTagAddBinding;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    const-string v2, "mBinding"

    .line 12
    .line 13
    if-eqz v0, :cond_8

    .line 14
    .line 15
    iget-object v0, v0, Lcom/zykj/mistake/databinding/DialogMistakeTagAddBinding;->a:Landroid/widget/EditText;

    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    const/4 v4, 0x1

    .line 30
    sub-int/2addr v3, v4

    .line 31
    const/4 v5, 0x0

    .line 32
    move v6, v5

    .line 33
    move v7, v6

    .line 34
    :goto_0
    if-gt v6, v3, :cond_5

    .line 35
    .line 36
    if-nez v7, :cond_0

    .line 37
    .line 38
    move v8, v6

    .line 39
    goto :goto_1

    .line 40
    :cond_0
    move v8, v3

    .line 41
    :goto_1
    invoke-virtual {v0, v8}, Ljava/lang/String;->charAt(I)C

    .line 42
    .line 43
    .line 44
    move-result v8

    .line 45
    const/16 v9, 0x20

    .line 46
    .line 47
    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->i(II)I

    .line 48
    .line 49
    .line 50
    move-result v8

    .line 51
    if-gtz v8, :cond_1

    .line 52
    .line 53
    move v8, v4

    .line 54
    goto :goto_2

    .line 55
    :cond_1
    move v8, v5

    .line 56
    :goto_2
    if-nez v7, :cond_3

    .line 57
    .line 58
    if-nez v8, :cond_2

    .line 59
    .line 60
    move v7, v4

    .line 61
    goto :goto_0

    .line 62
    :cond_2
    add-int/lit8 v6, v6, 0x1

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_3
    if-nez v8, :cond_4

    .line 66
    .line 67
    goto :goto_3

    .line 68
    :cond_4
    add-int/lit8 v3, v3, -0x1

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_5
    :goto_3
    add-int/2addr v3, v4

    .line 72
    invoke-virtual {v0, v6, v3}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    if-nez v3, :cond_6

    .line 85
    .line 86
    iget-object v3, p1, Ll4/i;->c:Lr6/c;

    .line 87
    .line 88
    invoke-interface {v3, v0}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    :cond_6
    iget-object v0, p1, Ll4/i;->b:Lcom/zykj/mistake/databinding/DialogMistakeTagAddBinding;

    .line 92
    .line 93
    if-eqz v0, :cond_7

    .line 94
    .line 95
    iget-object v0, v0, Lcom/zykj/mistake/databinding/DialogMistakeTagAddBinding;->a:Landroid/widget/EditText;

    .line 96
    .line 97
    invoke-static {}, Landroid/text/Editable$Factory;->getInstance()Landroid/text/Editable$Factory;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    const-string v2, ""

    .line 102
    .line 103
    invoke-virtual {v1, v2}, Landroid/text/Editable$Factory;->newEditable(Ljava/lang/CharSequence;)Landroid/text/Editable;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    .line 111
    .line 112
    .line 113
    return-void

    .line 114
    :cond_7
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    throw v1

    .line 118
    :cond_8
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    throw v1

    .line 122
    :pswitch_0
    iget-object p1, p0, Ll4/h;->b:Ll4/i;

    .line 123
    .line 124
    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    .line 125
    .line 126
    .line 127
    return-void

    .line 128
    nop

    .line 129
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
