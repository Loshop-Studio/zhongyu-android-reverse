.class public Lg4/b;
.super Lg4/a;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public p:Lg4/c;


# direct methods
.method public constructor <init>(Lj4/a;)V
    .locals 1

    .line 1
    iget-object v0, p1, Lj4/a;->C:Landroid/content/Context;

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lg4/a;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lg4/a;->e:Lj4/a;

    .line 7
    .line 8
    iget-object p1, p1, Lj4/a;->C:Landroid/content/Context;

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Lg4/b;->y(Landroid/content/Context;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public A()V
    .locals 3

    .line 1
    iget-object v0, p0, Lg4/a;->e:Lj4/a;

    .line 2
    .line 3
    iget-object v0, v0, Lj4/a;->a:Lk4/c;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    :try_start_0
    sget-object v0, Lg4/c;->y:Ljava/text/DateFormat;

    .line 8
    .line 9
    iget-object v1, p0, Lg4/b;->p:Lg4/c;

    .line 10
    .line 11
    invoke-virtual {v1}, Lg4/c;->o()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget-object v1, p0, Lg4/a;->e:Lj4/a;

    .line 20
    .line 21
    iget-object v1, v1, Lj4/a;->a:Lk4/c;

    .line 22
    .line 23
    iget-object v2, p0, Lg4/a;->l:Landroid/view/View;

    .line 24
    .line 25
    invoke-interface {v1, v0, v2}, Lk4/c;->a(Ljava/util/Date;Landroid/view/View;)V
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :catch_0
    move-exception v0

    .line 30
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 31
    .line 32
    .line 33
    :cond_0
    return-void
.end method

.method public final B()V
    .locals 3

    .line 1
    iget-object v0, p0, Lg4/b;->p:Lg4/c;

    .line 2
    .line 3
    iget-object v1, p0, Lg4/a;->e:Lj4/a;

    .line 4
    .line 5
    iget-object v2, v1, Lj4/a;->h:Ljava/util/Calendar;

    .line 6
    .line 7
    iget-object v1, v1, Lj4/a;->i:Ljava/util/Calendar;

    .line 8
    .line 9
    invoke-virtual {v0, v2, v1}, Lg4/c;->E(Ljava/util/Calendar;Ljava/util/Calendar;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lg4/b;->x()V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final C()V
    .locals 2

    .line 1
    iget-object v0, p0, Lg4/b;->p:Lg4/c;

    .line 2
    .line 3
    iget-object v1, p0, Lg4/a;->e:Lj4/a;

    .line 4
    .line 5
    iget v1, v1, Lj4/a;->j:I

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lg4/c;->H(I)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lg4/b;->p:Lg4/c;

    .line 11
    .line 12
    iget-object v1, p0, Lg4/a;->e:Lj4/a;

    .line 13
    .line 14
    iget v1, v1, Lj4/a;->k:I

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Lg4/c;->x(I)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final D()V
    .locals 14

    .line 1
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lg4/a;->e:Lj4/a;

    .line 6
    .line 7
    iget-object v1, v1, Lj4/a;->g:Ljava/util/Calendar;

    .line 8
    .line 9
    const/16 v2, 0xd

    .line 10
    .line 11
    const/16 v3, 0xc

    .line 12
    .line 13
    const/16 v4, 0xb

    .line 14
    .line 15
    const/4 v5, 0x5

    .line 16
    const/4 v6, 0x2

    .line 17
    const/4 v7, 0x1

    .line 18
    if-nez v1, :cond_0

    .line 19
    .line 20
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 21
    .line 22
    .line 23
    move-result-wide v8

    .line 24
    invoke-virtual {v0, v8, v9}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v7}, Ljava/util/Calendar;->get(I)I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    invoke-virtual {v0, v6}, Ljava/util/Calendar;->get(I)I

    .line 32
    .line 33
    .line 34
    move-result v6

    .line 35
    invoke-virtual {v0, v5}, Ljava/util/Calendar;->get(I)I

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    invoke-virtual {v0, v4}, Ljava/util/Calendar;->get(I)I

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    invoke-virtual {v0, v3}, Ljava/util/Calendar;->get(I)I

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    invoke-virtual {v0, v2}, Ljava/util/Calendar;->get(I)I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    :goto_0
    move v13, v0

    .line 52
    move v8, v1

    .line 53
    move v12, v3

    .line 54
    move v11, v4

    .line 55
    move v10, v5

    .line 56
    move v9, v6

    .line 57
    goto :goto_1

    .line 58
    :cond_0
    invoke-virtual {v1, v7}, Ljava/util/Calendar;->get(I)I

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    iget-object v0, p0, Lg4/a;->e:Lj4/a;

    .line 63
    .line 64
    iget-object v0, v0, Lj4/a;->g:Ljava/util/Calendar;

    .line 65
    .line 66
    invoke-virtual {v0, v6}, Ljava/util/Calendar;->get(I)I

    .line 67
    .line 68
    .line 69
    move-result v6

    .line 70
    iget-object v0, p0, Lg4/a;->e:Lj4/a;

    .line 71
    .line 72
    iget-object v0, v0, Lj4/a;->g:Ljava/util/Calendar;

    .line 73
    .line 74
    invoke-virtual {v0, v5}, Ljava/util/Calendar;->get(I)I

    .line 75
    .line 76
    .line 77
    move-result v5

    .line 78
    iget-object v0, p0, Lg4/a;->e:Lj4/a;

    .line 79
    .line 80
    iget-object v0, v0, Lj4/a;->g:Ljava/util/Calendar;

    .line 81
    .line 82
    invoke-virtual {v0, v4}, Ljava/util/Calendar;->get(I)I

    .line 83
    .line 84
    .line 85
    move-result v4

    .line 86
    iget-object v0, p0, Lg4/a;->e:Lj4/a;

    .line 87
    .line 88
    iget-object v0, v0, Lj4/a;->g:Ljava/util/Calendar;

    .line 89
    .line 90
    invoke-virtual {v0, v3}, Ljava/util/Calendar;->get(I)I

    .line 91
    .line 92
    .line 93
    move-result v3

    .line 94
    iget-object v0, p0, Lg4/a;->e:Lj4/a;

    .line 95
    .line 96
    iget-object v0, v0, Lj4/a;->g:Ljava/util/Calendar;

    .line 97
    .line 98
    invoke-virtual {v0, v2}, Ljava/util/Calendar;->get(I)I

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    goto :goto_0

    .line 103
    :goto_1
    iget-object v7, p0, Lg4/b;->p:Lg4/c;

    .line 104
    .line 105
    invoke-virtual/range {v7 .. v13}, Lg4/c;->D(IIIIII)V

    .line 106
    .line 107
    .line 108
    return-void
.end method

.method public o()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lg4/a;->e:Lj4/a;

    .line 2
    .line 3
    iget-boolean v0, v0, Lj4/a;->T:Z

    .line 4
    .line 5
    return v0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Ljava/lang/String;

    .line 6
    .line 7
    const-string v0, "submit"

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, Lg4/b;->A()V

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-virtual {p0}, Lg4/a;->f()V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final x()V
    .locals 4

    .line 1
    iget-object v0, p0, Lg4/a;->e:Lj4/a;

    .line 2
    .line 3
    iget-object v1, v0, Lj4/a;->h:Ljava/util/Calendar;

    .line 4
    .line 5
    if-eqz v1, :cond_1

    .line 6
    .line 7
    iget-object v2, v0, Lj4/a;->i:Ljava/util/Calendar;

    .line 8
    .line 9
    if-eqz v2, :cond_1

    .line 10
    .line 11
    iget-object v0, v0, Lj4/a;->g:Ljava/util/Calendar;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 16
    .line 17
    .line 18
    move-result-wide v0

    .line 19
    iget-object v2, p0, Lg4/a;->e:Lj4/a;

    .line 20
    .line 21
    iget-object v2, v2, Lj4/a;->h:Ljava/util/Calendar;

    .line 22
    .line 23
    invoke-virtual {v2}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 24
    .line 25
    .line 26
    move-result-wide v2

    .line 27
    cmp-long v0, v0, v2

    .line 28
    .line 29
    if-ltz v0, :cond_0

    .line 30
    .line 31
    iget-object v0, p0, Lg4/a;->e:Lj4/a;

    .line 32
    .line 33
    iget-object v0, v0, Lj4/a;->g:Ljava/util/Calendar;

    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 36
    .line 37
    .line 38
    move-result-wide v0

    .line 39
    iget-object v2, p0, Lg4/a;->e:Lj4/a;

    .line 40
    .line 41
    iget-object v2, v2, Lj4/a;->i:Ljava/util/Calendar;

    .line 42
    .line 43
    invoke-virtual {v2}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 44
    .line 45
    .line 46
    move-result-wide v2

    .line 47
    cmp-long v0, v0, v2

    .line 48
    .line 49
    if-lez v0, :cond_3

    .line 50
    .line 51
    :cond_0
    iget-object v0, p0, Lg4/a;->e:Lj4/a;

    .line 52
    .line 53
    iget-object v1, v0, Lj4/a;->h:Ljava/util/Calendar;

    .line 54
    .line 55
    iput-object v1, v0, Lj4/a;->g:Ljava/util/Calendar;

    .line 56
    .line 57
    return-void

    .line 58
    :cond_1
    if-eqz v1, :cond_2

    .line 59
    .line 60
    iput-object v1, v0, Lj4/a;->g:Ljava/util/Calendar;

    .line 61
    .line 62
    return-void

    .line 63
    :cond_2
    iget-object v1, v0, Lj4/a;->i:Ljava/util/Calendar;

    .line 64
    .line 65
    if-eqz v1, :cond_3

    .line 66
    .line 67
    iput-object v1, v0, Lj4/a;->g:Ljava/util/Calendar;

    .line 68
    .line 69
    :cond_3
    return-void
.end method

.method public final y(Landroid/content/Context;)V
    .locals 6

    .line 1
    invoke-virtual {p0}, Lg4/a;->r()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lg4/a;->n()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lg4/a;->m()V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lg4/a;->e:Lj4/a;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lg4/b;->o()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sget v1, Lcom/xuexiang/xui/R$layout;->xui_layout_picker_view_time_dialog:I

    .line 26
    .line 27
    iget-object v2, p0, Lg4/a;->b:Landroid/view/ViewGroup;

    .line 28
    .line 29
    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    sget v1, Lcom/xuexiang/xui/R$layout;->xui_layout_picker_view_time:I

    .line 38
    .line 39
    iget-object v2, p0, Lg4/a;->b:Landroid/view/ViewGroup;

    .line 40
    .line 41
    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 42
    .line 43
    .line 44
    :goto_0
    sget v0, Lcom/xuexiang/xui/R$id;->tvTitle:I

    .line 45
    .line 46
    invoke-virtual {p0, v0}, Lg4/a;->i(I)Landroid/view/View;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    check-cast v0, Landroid/widget/TextView;

    .line 51
    .line 52
    sget v1, Lcom/xuexiang/xui/R$id;->ll_content:I

    .line 53
    .line 54
    invoke-virtual {p0, v1}, Lg4/a;->i(I)Landroid/view/View;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    check-cast v1, Landroid/widget/LinearLayout;

    .line 59
    .line 60
    sget v2, Lcom/xuexiang/xui/R$id;->btnSubmit:I

    .line 61
    .line 62
    invoke-virtual {p0, v2}, Lg4/a;->i(I)Landroid/view/View;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    check-cast v2, Landroid/widget/Button;

    .line 67
    .line 68
    sget v3, Lcom/xuexiang/xui/R$id;->btnCancel:I

    .line 69
    .line 70
    invoke-virtual {p0, v3}, Lg4/a;->i(I)Landroid/view/View;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    check-cast v3, Landroid/widget/Button;

    .line 75
    .line 76
    const-string v4, "submit"

    .line 77
    .line 78
    invoke-virtual {v2, v4}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    const-string v4, "cancel"

    .line 82
    .line 83
    invoke-virtual {v3, v4}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v2, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v3, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 90
    .line 91
    .line 92
    iget-object v4, p0, Lg4/a;->e:Lj4/a;

    .line 93
    .line 94
    iget-object v4, v4, Lj4/a;->D:Ljava/lang/String;

    .line 95
    .line 96
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 97
    .line 98
    .line 99
    move-result v4

    .line 100
    if-eqz v4, :cond_1

    .line 101
    .line 102
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 103
    .line 104
    .line 105
    move-result-object v4

    .line 106
    sget v5, Lcom/xuexiang/xui/R$string;->xui_picker_view_submit:I

    .line 107
    .line 108
    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v4

    .line 112
    goto :goto_1

    .line 113
    :cond_1
    iget-object v4, p0, Lg4/a;->e:Lj4/a;

    .line 114
    .line 115
    iget-object v4, v4, Lj4/a;->D:Ljava/lang/String;

    .line 116
    .line 117
    :goto_1
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 118
    .line 119
    .line 120
    iget-object v4, p0, Lg4/a;->e:Lj4/a;

    .line 121
    .line 122
    iget-object v4, v4, Lj4/a;->E:Ljava/lang/String;

    .line 123
    .line 124
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 125
    .line 126
    .line 127
    move-result v4

    .line 128
    if-eqz v4, :cond_2

    .line 129
    .line 130
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    sget v4, Lcom/xuexiang/xui/R$string;->xui_picker_view_cancel:I

    .line 135
    .line 136
    invoke-virtual {p1, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    goto :goto_2

    .line 141
    :cond_2
    iget-object p1, p0, Lg4/a;->e:Lj4/a;

    .line 142
    .line 143
    iget-object p1, p1, Lj4/a;->E:Ljava/lang/String;

    .line 144
    .line 145
    :goto_2
    invoke-virtual {v3, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 146
    .line 147
    .line 148
    iget-object p1, p0, Lg4/a;->e:Lj4/a;

    .line 149
    .line 150
    iget-object p1, p1, Lj4/a;->F:Ljava/lang/String;

    .line 151
    .line 152
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 153
    .line 154
    .line 155
    move-result p1

    .line 156
    if-eqz p1, :cond_3

    .line 157
    .line 158
    const-string p1, ""

    .line 159
    .line 160
    goto :goto_3

    .line 161
    :cond_3
    iget-object p1, p0, Lg4/a;->e:Lj4/a;

    .line 162
    .line 163
    iget-object p1, p1, Lj4/a;->F:Ljava/lang/String;

    .line 164
    .line 165
    :goto_3
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 166
    .line 167
    .line 168
    iget-object p1, p0, Lg4/a;->e:Lj4/a;

    .line 169
    .line 170
    iget p1, p1, Lj4/a;->G:I

    .line 171
    .line 172
    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 173
    .line 174
    .line 175
    iget-object p1, p0, Lg4/a;->e:Lj4/a;

    .line 176
    .line 177
    iget p1, p1, Lj4/a;->H:I

    .line 178
    .line 179
    invoke-virtual {v3, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 180
    .line 181
    .line 182
    iget-object p1, p0, Lg4/a;->e:Lj4/a;

    .line 183
    .line 184
    iget p1, p1, Lj4/a;->I:I

    .line 185
    .line 186
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {p0}, Lg4/b;->o()Z

    .line 190
    .line 191
    .line 192
    move-result p1

    .line 193
    if-eqz p1, :cond_4

    .line 194
    .line 195
    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 196
    .line 197
    .line 198
    move-result-object p1

    .line 199
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object p1

    .line 203
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 204
    .line 205
    .line 206
    move-result p1

    .line 207
    if-eqz p1, :cond_4

    .line 208
    .line 209
    const/16 p1, 0x8

    .line 210
    .line 211
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 212
    .line 213
    .line 214
    :cond_4
    iget-object p1, p0, Lg4/a;->e:Lj4/a;

    .line 215
    .line 216
    iget p1, p1, Lj4/a;->K:I

    .line 217
    .line 218
    invoke-virtual {v1, p1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 219
    .line 220
    .line 221
    iget-object p1, p0, Lg4/a;->e:Lj4/a;

    .line 222
    .line 223
    iget p1, p1, Lj4/a;->L:I

    .line 224
    .line 225
    int-to-float p1, p1

    .line 226
    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 227
    .line 228
    .line 229
    iget-object p1, p0, Lg4/a;->e:Lj4/a;

    .line 230
    .line 231
    iget p1, p1, Lj4/a;->L:I

    .line 232
    .line 233
    int-to-float p1, p1

    .line 234
    invoke-virtual {v3, p1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 235
    .line 236
    .line 237
    iget-object p1, p0, Lg4/a;->e:Lj4/a;

    .line 238
    .line 239
    iget p1, p1, Lj4/a;->M:I

    .line 240
    .line 241
    int-to-float p1, p1

    .line 242
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 243
    .line 244
    .line 245
    sget p1, Lcom/xuexiang/xui/R$id;->time_picker:I

    .line 246
    .line 247
    invoke-virtual {p0, p1}, Lg4/a;->i(I)Landroid/view/View;

    .line 248
    .line 249
    .line 250
    move-result-object p1

    .line 251
    check-cast p1, Landroid/widget/LinearLayout;

    .line 252
    .line 253
    iget-object v0, p0, Lg4/a;->e:Lj4/a;

    .line 254
    .line 255
    iget v0, v0, Lj4/a;->J:I

    .line 256
    .line 257
    invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 258
    .line 259
    .line 260
    invoke-virtual {p0, p1}, Lg4/b;->z(Landroid/widget/LinearLayout;)V

    .line 261
    .line 262
    .line 263
    return-void
.end method

.method public final z(Landroid/widget/LinearLayout;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Lg4/c;

    .line 4
    .line 5
    iget-object v2, v0, Lg4/a;->e:Lj4/a;

    .line 6
    .line 7
    iget-object v3, v2, Lj4/a;->f:[Z

    .line 8
    .line 9
    iget v4, v2, Lj4/a;->B:I

    .line 10
    .line 11
    iget v2, v2, Lj4/a;->N:I

    .line 12
    .line 13
    move-object/from16 v5, p1

    .line 14
    .line 15
    invoke-direct {v1, v5, v3, v4, v2}, Lg4/c;-><init>(Landroid/view/View;[ZII)V

    .line 16
    .line 17
    .line 18
    iput-object v1, v0, Lg4/b;->p:Lg4/c;

    .line 19
    .line 20
    iget-object v1, v0, Lg4/a;->e:Lj4/a;

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    iget-object v1, v0, Lg4/b;->p:Lg4/c;

    .line 26
    .line 27
    iget-object v2, v0, Lg4/a;->e:Lj4/a;

    .line 28
    .line 29
    iget-boolean v2, v2, Lj4/a;->m:Z

    .line 30
    .line 31
    invoke-virtual {v1, v2}, Lg4/c;->C(Z)V

    .line 32
    .line 33
    .line 34
    iget-object v1, v0, Lg4/a;->e:Lj4/a;

    .line 35
    .line 36
    iget v2, v1, Lj4/a;->j:I

    .line 37
    .line 38
    if-eqz v2, :cond_0

    .line 39
    .line 40
    iget v1, v1, Lj4/a;->k:I

    .line 41
    .line 42
    if-eqz v1, :cond_0

    .line 43
    .line 44
    if-gt v2, v1, :cond_0

    .line 45
    .line 46
    invoke-virtual {v0}, Lg4/b;->C()V

    .line 47
    .line 48
    .line 49
    :cond_0
    iget-object v1, v0, Lg4/a;->e:Lj4/a;

    .line 50
    .line 51
    iget-object v2, v1, Lj4/a;->h:Ljava/util/Calendar;

    .line 52
    .line 53
    if-eqz v2, :cond_2

    .line 54
    .line 55
    iget-object v3, v1, Lj4/a;->i:Ljava/util/Calendar;

    .line 56
    .line 57
    if-eqz v3, :cond_2

    .line 58
    .line 59
    invoke-virtual {v2}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 60
    .line 61
    .line 62
    move-result-wide v1

    .line 63
    iget-object v3, v0, Lg4/a;->e:Lj4/a;

    .line 64
    .line 65
    iget-object v3, v3, Lj4/a;->i:Ljava/util/Calendar;

    .line 66
    .line 67
    invoke-virtual {v3}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 68
    .line 69
    .line 70
    move-result-wide v3

    .line 71
    cmp-long v1, v1, v3

    .line 72
    .line 73
    if-gtz v1, :cond_1

    .line 74
    .line 75
    invoke-virtual {v0}, Lg4/b;->B()V

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_1
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 80
    .line 81
    const-string v2, "startDate can\'t be later than endDate"

    .line 82
    .line 83
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    throw v1

    .line 87
    :cond_2
    const/4 v3, 0x1

    .line 88
    if-eqz v2, :cond_4

    .line 89
    .line 90
    invoke-virtual {v2, v3}, Ljava/util/Calendar;->get(I)I

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    const/16 v2, 0x76c

    .line 95
    .line 96
    if-lt v1, v2, :cond_3

    .line 97
    .line 98
    invoke-virtual {v0}, Lg4/b;->B()V

    .line 99
    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_3
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 103
    .line 104
    const-string v2, "The startDate can not as early as 1900"

    .line 105
    .line 106
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    throw v1

    .line 110
    :cond_4
    iget-object v1, v1, Lj4/a;->i:Ljava/util/Calendar;

    .line 111
    .line 112
    if-eqz v1, :cond_6

    .line 113
    .line 114
    invoke-virtual {v1, v3}, Ljava/util/Calendar;->get(I)I

    .line 115
    .line 116
    .line 117
    move-result v1

    .line 118
    const/16 v2, 0x834

    .line 119
    .line 120
    if-gt v1, v2, :cond_5

    .line 121
    .line 122
    invoke-virtual {v0}, Lg4/b;->B()V

    .line 123
    .line 124
    .line 125
    goto :goto_0

    .line 126
    :cond_5
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 127
    .line 128
    const-string v2, "The endDate should not be later than 2100"

    .line 129
    .line 130
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    throw v1

    .line 134
    :cond_6
    invoke-virtual {v0}, Lg4/b;->B()V

    .line 135
    .line 136
    .line 137
    :goto_0
    invoke-virtual {v0}, Lg4/b;->D()V

    .line 138
    .line 139
    .line 140
    iget-object v3, v0, Lg4/b;->p:Lg4/c;

    .line 141
    .line 142
    iget-object v1, v0, Lg4/a;->e:Lj4/a;

    .line 143
    .line 144
    iget-object v4, v1, Lj4/a;->n:Ljava/lang/String;

    .line 145
    .line 146
    iget-object v5, v1, Lj4/a;->o:Ljava/lang/String;

    .line 147
    .line 148
    iget-object v6, v1, Lj4/a;->p:Ljava/lang/String;

    .line 149
    .line 150
    iget-object v7, v1, Lj4/a;->q:Ljava/lang/String;

    .line 151
    .line 152
    iget-object v8, v1, Lj4/a;->r:Ljava/lang/String;

    .line 153
    .line 154
    iget-object v9, v1, Lj4/a;->s:Ljava/lang/String;

    .line 155
    .line 156
    invoke-virtual/range {v3 .. v9}, Lg4/c;->y(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    iget-object v10, v0, Lg4/b;->p:Lg4/c;

    .line 160
    .line 161
    iget-object v1, v0, Lg4/a;->e:Lj4/a;

    .line 162
    .line 163
    iget v11, v1, Lj4/a;->t:I

    .line 164
    .line 165
    iget v12, v1, Lj4/a;->u:I

    .line 166
    .line 167
    iget v13, v1, Lj4/a;->v:I

    .line 168
    .line 169
    iget v14, v1, Lj4/a;->w:I

    .line 170
    .line 171
    iget v15, v1, Lj4/a;->x:I

    .line 172
    .line 173
    iget v1, v1, Lj4/a;->y:I

    .line 174
    .line 175
    move/from16 v16, v1

    .line 176
    .line 177
    invoke-virtual/range {v10 .. v16}, Lg4/c;->M(IIIIII)V

    .line 178
    .line 179
    .line 180
    iget-object v1, v0, Lg4/a;->e:Lj4/a;

    .line 181
    .line 182
    iget-boolean v1, v1, Lj4/a;->U:Z

    .line 183
    .line 184
    invoke-virtual {v0, v1}, Lg4/a;->t(Z)Lg4/a;

    .line 185
    .line 186
    .line 187
    iget-object v1, v0, Lg4/b;->p:Lg4/c;

    .line 188
    .line 189
    iget-object v2, v0, Lg4/a;->e:Lj4/a;

    .line 190
    .line 191
    iget-boolean v2, v2, Lj4/a;->l:Z

    .line 192
    .line 193
    invoke-virtual {v1, v2}, Lg4/c;->s(Z)V

    .line 194
    .line 195
    .line 196
    iget-object v1, v0, Lg4/b;->p:Lg4/c;

    .line 197
    .line 198
    iget-object v2, v0, Lg4/a;->e:Lj4/a;

    .line 199
    .line 200
    iget v2, v2, Lj4/a;->Q:I

    .line 201
    .line 202
    invoke-virtual {v1, v2}, Lg4/c;->u(I)V

    .line 203
    .line 204
    .line 205
    iget-object v1, v0, Lg4/b;->p:Lg4/c;

    .line 206
    .line 207
    iget-object v2, v0, Lg4/a;->e:Lj4/a;

    .line 208
    .line 209
    iget-object v2, v2, Lj4/a;->X:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$DividerType;

    .line 210
    .line 211
    invoke-virtual {v1, v2}, Lg4/c;->w(Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$DividerType;)V

    .line 212
    .line 213
    .line 214
    iget-object v1, v0, Lg4/b;->p:Lg4/c;

    .line 215
    .line 216
    iget-object v2, v0, Lg4/a;->e:Lj4/a;

    .line 217
    .line 218
    iget v2, v2, Lj4/a;->S:F

    .line 219
    .line 220
    invoke-virtual {v1, v2}, Lg4/c;->A(F)V

    .line 221
    .line 222
    .line 223
    iget-object v1, v0, Lg4/b;->p:Lg4/c;

    .line 224
    .line 225
    iget-object v2, v0, Lg4/a;->e:Lj4/a;

    .line 226
    .line 227
    iget v2, v2, Lj4/a;->O:I

    .line 228
    .line 229
    invoke-virtual {v1, v2}, Lg4/c;->L(I)V

    .line 230
    .line 231
    .line 232
    iget-object v1, v0, Lg4/b;->p:Lg4/c;

    .line 233
    .line 234
    iget-object v2, v0, Lg4/a;->e:Lj4/a;

    .line 235
    .line 236
    iget v2, v2, Lj4/a;->P:I

    .line 237
    .line 238
    invoke-virtual {v1, v2}, Lg4/c;->J(I)V

    .line 239
    .line 240
    .line 241
    iget-object v1, v0, Lg4/b;->p:Lg4/c;

    .line 242
    .line 243
    iget-object v2, v0, Lg4/a;->e:Lj4/a;

    .line 244
    .line 245
    iget-boolean v2, v2, Lj4/a;->V:Z

    .line 246
    .line 247
    invoke-virtual {v1, v2}, Lg4/c;->p(Z)V

    .line 248
    .line 249
    .line 250
    return-void
.end method
