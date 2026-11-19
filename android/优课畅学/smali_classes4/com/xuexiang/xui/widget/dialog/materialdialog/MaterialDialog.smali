.class public Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;
.super Ly1/a;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lcom/xuexiang/xui/widget/dialog/materialdialog/a$c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;,
        Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$DialogException;,
        Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$h;,
        Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$i;,
        Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$ListType;
    }
.end annotation


# instance fields
.field public final c:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

.field public final d:Landroid/os/Handler;

.field public e:Landroid/widget/ImageView;

.field public f:Landroid/widget/TextView;

.field public g:Landroid/widget/TextView;

.field public h:Landroid/widget/EditText;

.field public i:Landroidx/recyclerview/widget/RecyclerView;

.field public j:Landroid/view/View;

.field public k:Landroid/widget/FrameLayout;

.field public l:Landroid/widget/ProgressBar;

.field public m:Landroid/widget/TextView;

.field public n:Landroid/widget/TextView;

.field public o:Landroid/widget/TextView;

.field public p:Landroid/widget/CheckBox;

.field public q:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

.field public r:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

.field public s:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

.field public t:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$ListType;

.field public u:Ljava/util/List;


# direct methods
.method public constructor <init>(Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;)V
    .locals 2

    .line 1
    iget-object v0, p1, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->a:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/b;->c(Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-direct {p0, v0, v1}, Ly1/a;-><init>(Landroid/content/Context;I)V

    .line 8
    .line 9
    .line 10
    new-instance v0, Landroid/os/Handler;

    .line 11
    .line 12
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->d:Landroid/os/Handler;

    .line 20
    .line 21
    iput-object p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 22
    .line 23
    iget-object v0, p1, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->a:Landroid/content/Context;

    .line 24
    .line 25
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-static {p1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/b;->b(Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;)I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    const/4 v1, 0x0

    .line 34
    invoke-virtual {v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    check-cast p1, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;

    .line 39
    .line 40
    iput-object p1, p0, Ly1/a;->a:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;

    .line 41
    .line 42
    invoke-static {p0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/b;->d(Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;)V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public static synthetic d(Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->w()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public a(Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;Landroid/view/View;ILjava/lang/CharSequence;Z)Z
    .locals 3

    .line 1
    invoke-virtual {p2}, Landroid/view/View;->isEnabled()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 p4, 0x0

    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    return p4

    .line 9
    :cond_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->t:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$ListType;

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    if-eqz p1, :cond_c

    .line 13
    .line 14
    sget-object v1, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$ListType;->a:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$ListType;

    .line 15
    .line 16
    if-ne p1, v1, :cond_1

    .line 17
    .line 18
    goto/16 :goto_1

    .line 19
    .line 20
    :cond_1
    sget-object p5, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$ListType;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$ListType;

    .line 21
    .line 22
    if-ne p1, p5, :cond_8

    .line 23
    .line 24
    sget p1, Lcom/xuexiang/xui/R$id;->md_control:I

    .line 25
    .line 26
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    check-cast p1, Landroid/widget/CheckBox;

    .line 31
    .line 32
    invoke-virtual {p1}, Landroid/view/View;->isEnabled()Z

    .line 33
    .line 34
    .line 35
    move-result p2

    .line 36
    if-nez p2, :cond_2

    .line 37
    .line 38
    return p4

    .line 39
    :cond_2
    iget-object p2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->u:Ljava/util/List;

    .line 40
    .line 41
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 42
    .line 43
    .line 44
    move-result-object p5

    .line 45
    invoke-interface {p2, p5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result p2

    .line 49
    if-nez p2, :cond_5

    .line 50
    .line 51
    iget-object p2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->u:Ljava/util/List;

    .line 52
    .line 53
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 54
    .line 55
    .line 56
    move-result-object p4

    .line 57
    invoke-interface {p2, p4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    iget-object p2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 61
    .line 62
    iget-boolean p2, p2, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->D:Z

    .line 63
    .line 64
    if-eqz p2, :cond_4

    .line 65
    .line 66
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->q()Z

    .line 67
    .line 68
    .line 69
    move-result p2

    .line 70
    if-eqz p2, :cond_3

    .line 71
    .line 72
    invoke-virtual {p1, v0}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 73
    .line 74
    .line 75
    goto/16 :goto_2

    .line 76
    .line 77
    :cond_3
    iget-object p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->u:Ljava/util/List;

    .line 78
    .line 79
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    invoke-interface {p1, p2}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    goto/16 :goto_2

    .line 87
    .line 88
    :cond_4
    invoke-virtual {p1, v0}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 89
    .line 90
    .line 91
    goto/16 :goto_2

    .line 92
    .line 93
    :cond_5
    iget-object p2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->u:Ljava/util/List;

    .line 94
    .line 95
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 96
    .line 97
    .line 98
    move-result-object p5

    .line 99
    invoke-interface {p2, p5}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    iget-object p2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 103
    .line 104
    iget-boolean p2, p2, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->D:Z

    .line 105
    .line 106
    if-eqz p2, :cond_7

    .line 107
    .line 108
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->q()Z

    .line 109
    .line 110
    .line 111
    move-result p2

    .line 112
    if-eqz p2, :cond_6

    .line 113
    .line 114
    invoke-virtual {p1, p4}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 115
    .line 116
    .line 117
    goto/16 :goto_2

    .line 118
    .line 119
    :cond_6
    iget-object p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->u:Ljava/util/List;

    .line 120
    .line 121
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 122
    .line 123
    .line 124
    move-result-object p2

    .line 125
    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    goto/16 :goto_2

    .line 129
    .line 130
    :cond_7
    invoke-virtual {p1, p4}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 131
    .line 132
    .line 133
    goto :goto_2

    .line 134
    :cond_8
    sget-object p5, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$ListType;->b:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$ListType;

    .line 135
    .line 136
    if-ne p1, p5, :cond_f

    .line 137
    .line 138
    sget p1, Lcom/xuexiang/xui/R$id;->md_control:I

    .line 139
    .line 140
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    check-cast p1, Landroid/widget/RadioButton;

    .line 145
    .line 146
    invoke-virtual {p1}, Landroid/view/View;->isEnabled()Z

    .line 147
    .line 148
    .line 149
    move-result p5

    .line 150
    if-nez p5, :cond_9

    .line 151
    .line 152
    return p4

    .line 153
    :cond_9
    iget-object p5, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 154
    .line 155
    iget v1, p5, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->K:I

    .line 156
    .line 157
    iget-boolean v2, p5, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->N:Z

    .line 158
    .line 159
    if-eqz v2, :cond_a

    .line 160
    .line 161
    iget-object v2, p5, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->m:Ljava/lang/CharSequence;

    .line 162
    .line 163
    if-nez v2, :cond_a

    .line 164
    .line 165
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->dismiss()V

    .line 166
    .line 167
    .line 168
    iget-object p5, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 169
    .line 170
    iput p3, p5, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->K:I

    .line 171
    .line 172
    invoke-virtual {p0, p2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->r(Landroid/view/View;)Z

    .line 173
    .line 174
    .line 175
    goto :goto_0

    .line 176
    :cond_a
    iget-boolean p4, p5, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->E:Z

    .line 177
    .line 178
    if-eqz p4, :cond_b

    .line 179
    .line 180
    iput p3, p5, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->K:I

    .line 181
    .line 182
    invoke-virtual {p0, p2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->r(Landroid/view/View;)Z

    .line 183
    .line 184
    .line 185
    move-result p4

    .line 186
    iget-object p2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 187
    .line 188
    iput v1, p2, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->K:I

    .line 189
    .line 190
    goto :goto_0

    .line 191
    :cond_b
    move p4, v0

    .line 192
    :goto_0
    if-eqz p4, :cond_f

    .line 193
    .line 194
    iget-object p2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 195
    .line 196
    iput p3, p2, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->K:I

    .line 197
    .line 198
    invoke-virtual {p1, v0}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 199
    .line 200
    .line 201
    iget-object p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 202
    .line 203
    iget-object p1, p1, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->T:Landroidx/recyclerview/widget/RecyclerView$Adapter;

    .line 204
    .line 205
    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemChanged(I)V

    .line 206
    .line 207
    .line 208
    iget-object p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 209
    .line 210
    iget-object p1, p1, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->T:Landroidx/recyclerview/widget/RecyclerView$Adapter;

    .line 211
    .line 212
    invoke-virtual {p1, p3}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemChanged(I)V

    .line 213
    .line 214
    .line 215
    goto :goto_2

    .line 216
    :cond_c
    :goto_1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 217
    .line 218
    iget-boolean p1, p1, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->N:Z

    .line 219
    .line 220
    if-eqz p1, :cond_d

    .line 221
    .line 222
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->dismiss()V

    .line 223
    .line 224
    .line 225
    :cond_d
    if-nez p5, :cond_e

    .line 226
    .line 227
    iget-object p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 228
    .line 229
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 230
    .line 231
    .line 232
    :cond_e
    if-eqz p5, :cond_f

    .line 233
    .line 234
    iget-object p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 235
    .line 236
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 237
    .line 238
    .line 239
    :cond_f
    :goto_2
    return v0
.end method

.method public dismiss()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->h:Landroid/widget/EditText;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 6
    .line 7
    invoke-virtual {p0, p0, v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->n(Landroid/content/DialogInterface;Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-super {p0}, Landroid/app/Dialog;->dismiss()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final e()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->i:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    new-instance v1, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$a;

    .line 11
    .line 12
    invoke-direct {v1, p0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$a;-><init>(Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final f(Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;)Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;
    .locals 1

    .line 1
    sget-object v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->a:[I

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    aget p1, v0, p1

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    if-eq p1, v0, :cond_1

    .line 11
    .line 12
    const/4 v0, 0x2

    .line 13
    if-eq p1, v0, :cond_0

    .line 14
    .line 15
    iget-object p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->q:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 16
    .line 17
    return-object p1

    .line 18
    :cond_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->s:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 19
    .line 20
    return-object p1

    .line 21
    :cond_1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->r:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 22
    .line 23
    return-object p1
.end method

.method public bridge synthetic findViewById(I)Landroid/view/View;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Ly1/a;->findViewById(I)Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public final g()Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 2
    .line 3
    return-object v0
.end method

.method public h(Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;Z)Landroid/graphics/drawable/Drawable;
    .locals 0

    .line 1
    if-eqz p2, :cond_2

    .line 2
    .line 3
    iget-object p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 4
    .line 5
    iget p2, p1, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->H0:I

    .line 6
    .line 7
    if-eqz p2, :cond_0

    .line 8
    .line 9
    iget-object p1, p1, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->a:Landroid/content/Context;

    .line 10
    .line 11
    invoke-static {p1, p2}, Lcom/xuexiang/xui/utils/e;->h(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1

    .line 16
    :cond_0
    iget-object p1, p1, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->a:Landroid/content/Context;

    .line 17
    .line 18
    sget p2, Lcom/xuexiang/xui/R$attr;->md_btn_stacked_selector:I

    .line 19
    .line 20
    invoke-static {p1, p2}, Lcom/xuexiang/xui/utils/g;->q(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    if-eqz p1, :cond_1

    .line 25
    .line 26
    return-object p1

    .line 27
    :cond_1
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    sget p2, Lcom/xuexiang/xui/R$attr;->md_btn_stacked_selector:I

    .line 32
    .line 33
    invoke-static {p1, p2}, Lcom/xuexiang/xui/utils/g;->q(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    return-object p1

    .line 38
    :cond_2
    sget-object p2, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->a:[I

    .line 39
    .line 40
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    aget p1, p2, p1

    .line 45
    .line 46
    const/4 p2, 0x1

    .line 47
    if-eq p1, p2, :cond_8

    .line 48
    .line 49
    const/4 p2, 0x2

    .line 50
    if-eq p1, p2, :cond_5

    .line 51
    .line 52
    iget-object p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 53
    .line 54
    iget p2, p1, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->I0:I

    .line 55
    .line 56
    if-eqz p2, :cond_3

    .line 57
    .line 58
    iget-object p1, p1, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->a:Landroid/content/Context;

    .line 59
    .line 60
    invoke-static {p1, p2}, Lcom/xuexiang/xui/utils/e;->h(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    return-object p1

    .line 65
    :cond_3
    iget-object p1, p1, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->a:Landroid/content/Context;

    .line 66
    .line 67
    sget p2, Lcom/xuexiang/xui/R$attr;->md_btn_positive_selector:I

    .line 68
    .line 69
    invoke-static {p1, p2}, Lcom/xuexiang/xui/utils/g;->q(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    if-eqz p1, :cond_4

    .line 74
    .line 75
    return-object p1

    .line 76
    :cond_4
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    sget p2, Lcom/xuexiang/xui/R$attr;->md_btn_positive_selector:I

    .line 81
    .line 82
    invoke-static {p1, p2}, Lcom/xuexiang/xui/utils/g;->q(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    iget-object p2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 87
    .line 88
    iget p2, p2, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->h:I

    .line 89
    .line 90
    invoke-static {p1, p2}, La2/a;->a(Landroid/graphics/drawable/Drawable;I)V

    .line 91
    .line 92
    .line 93
    return-object p1

    .line 94
    :cond_5
    iget-object p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 95
    .line 96
    iget p2, p1, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->K0:I

    .line 97
    .line 98
    if-eqz p2, :cond_6

    .line 99
    .line 100
    iget-object p1, p1, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->a:Landroid/content/Context;

    .line 101
    .line 102
    invoke-static {p1, p2}, Lcom/xuexiang/xui/utils/e;->h(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    return-object p1

    .line 107
    :cond_6
    iget-object p1, p1, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->a:Landroid/content/Context;

    .line 108
    .line 109
    sget p2, Lcom/xuexiang/xui/R$attr;->md_btn_negative_selector:I

    .line 110
    .line 111
    invoke-static {p1, p2}, Lcom/xuexiang/xui/utils/g;->q(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    if-eqz p1, :cond_7

    .line 116
    .line 117
    return-object p1

    .line 118
    :cond_7
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    sget p2, Lcom/xuexiang/xui/R$attr;->md_btn_negative_selector:I

    .line 123
    .line 124
    invoke-static {p1, p2}, Lcom/xuexiang/xui/utils/g;->q(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    iget-object p2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 129
    .line 130
    iget p2, p2, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->h:I

    .line 131
    .line 132
    invoke-static {p1, p2}, La2/a;->a(Landroid/graphics/drawable/Drawable;I)V

    .line 133
    .line 134
    .line 135
    return-object p1

    .line 136
    :cond_8
    iget-object p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 137
    .line 138
    iget p2, p1, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->J0:I

    .line 139
    .line 140
    if-eqz p2, :cond_9

    .line 141
    .line 142
    iget-object p1, p1, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->a:Landroid/content/Context;

    .line 143
    .line 144
    invoke-static {p1, p2}, Lcom/xuexiang/xui/utils/e;->h(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    return-object p1

    .line 149
    :cond_9
    iget-object p1, p1, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->a:Landroid/content/Context;

    .line 150
    .line 151
    sget p2, Lcom/xuexiang/xui/R$attr;->md_btn_neutral_selector:I

    .line 152
    .line 153
    invoke-static {p1, p2}, Lcom/xuexiang/xui/utils/g;->q(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    if-eqz p1, :cond_a

    .line 158
    .line 159
    return-object p1

    .line 160
    :cond_a
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    sget p2, Lcom/xuexiang/xui/R$attr;->md_btn_neutral_selector:I

    .line 165
    .line 166
    invoke-static {p1, p2}, Lcom/xuexiang/xui/utils/g;->q(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    iget-object p2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 171
    .line 172
    iget p2, p2, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->h:I

    .line 173
    .line 174
    invoke-static {p1, p2}, La2/a;->a(Landroid/graphics/drawable/Drawable;I)V

    .line 175
    .line 176
    .line 177
    return-object p1
.end method

.method public final i()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->l:Landroid/widget/ProgressBar;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, -0x1

    .line 6
    return v0

    .line 7
    :cond_0
    invoke-virtual {v0}, Landroid/widget/ProgressBar;->getProgress()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method

.method public final j()Landroid/widget/EditText;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->h:Landroid/widget/EditText;

    .line 2
    .line 3
    return-object v0
.end method

.method public final k()Landroid/graphics/drawable/Drawable;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 2
    .line 3
    iget v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->G0:I

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget-object v0, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->a:Landroid/content/Context;

    .line 8
    .line 9
    invoke-static {v0, v1}, Lcom/xuexiang/xui/utils/e;->h(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0

    .line 14
    :cond_0
    iget-object v0, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->a:Landroid/content/Context;

    .line 15
    .line 16
    sget v1, Lcom/xuexiang/xui/R$attr;->md_list_selector:I

    .line 17
    .line 18
    invoke-static {v0, v1}, Lcom/xuexiang/xui/utils/g;->q(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    return-object v0

    .line 25
    :cond_1
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    sget v1, Lcom/xuexiang/xui/R$attr;->md_list_selector:I

    .line 30
    .line 31
    invoke-static {v0, v1}, Lcom/xuexiang/xui/utils/g;->q(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    return-object v0
.end method

.method public final l()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->l:Landroid/widget/ProgressBar;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, -0x1

    .line 6
    return v0

    .line 7
    :cond_0
    invoke-virtual {v0}, Landroid/widget/ProgressBar;->getMax()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method

.method public final m()Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Ly1/a;->a:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;

    .line 2
    .line 3
    return-object v0
.end method

.method public final n(Landroid/content/DialogInterface;Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;)V
    .locals 1

    .line 1
    check-cast p1, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->j()Landroid/widget/EditText;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_0
    invoke-virtual {p2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->m()Landroid/content/Context;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    const-string v0, "input_method"

    .line 15
    .line 16
    invoke-virtual {p2, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    check-cast p2, Landroid/view/inputmethod/InputMethodManager;

    .line 21
    .line 22
    if-eqz p2, :cond_2

    .line 23
    .line 24
    invoke-virtual {p1}, Landroid/app/Dialog;->getCurrentFocus()Landroid/view/View;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    invoke-virtual {v0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    goto :goto_0

    .line 35
    :cond_1
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->m()Landroid/view/View;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-virtual {p1}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    :goto_0
    if-eqz p1, :cond_2

    .line 44
    .line 45
    const/4 v0, 0x0

    .line 46
    invoke-virtual {p2, p1, v0}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 47
    .line 48
    .line 49
    :cond_2
    :goto_1
    return-void
.end method

.method public o(IZ)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->o:Landroid/widget/TextView;

    .line 2
    .line 3
    if-eqz v0, :cond_8

    .line 4
    .line 5
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 6
    .line 7
    iget v1, v1, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->p0:I

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-lez v1, :cond_0

    .line 11
    .line 12
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    iget-object v4, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 21
    .line 22
    iget v4, v4, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->p0:I

    .line 23
    .line 24
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    filled-new-array {v3, v4}, [Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    const-string v4, "%d/%d"

    .line 33
    .line 34
    invoke-static {v1, v4, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 39
    .line 40
    .line 41
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->o:Landroid/widget/TextView;

    .line 42
    .line 43
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    const/16 v1, 0x8

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 50
    .line 51
    .line 52
    :goto_0
    const/4 v0, 0x1

    .line 53
    if-eqz p2, :cond_1

    .line 54
    .line 55
    if-eqz p1, :cond_3

    .line 56
    .line 57
    :cond_1
    iget-object p2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 58
    .line 59
    iget v1, p2, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->p0:I

    .line 60
    .line 61
    if-lez v1, :cond_2

    .line 62
    .line 63
    if-gt p1, v1, :cond_3

    .line 64
    .line 65
    :cond_2
    iget p2, p2, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->o0:I

    .line 66
    .line 67
    if-ge p1, p2, :cond_4

    .line 68
    .line 69
    :cond_3
    move v2, v0

    .line 70
    :cond_4
    iget-object p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 71
    .line 72
    if-eqz v2, :cond_5

    .line 73
    .line 74
    iget p1, p1, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->q0:I

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_5
    iget p1, p1, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->j:I

    .line 78
    .line 79
    :goto_1
    iget-object p2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 80
    .line 81
    if-eqz v2, :cond_6

    .line 82
    .line 83
    iget p2, p2, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->q0:I

    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_6
    iget p2, p2, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->t:I

    .line 87
    .line 88
    :goto_2
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 89
    .line 90
    iget v1, v1, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->p0:I

    .line 91
    .line 92
    if-lez v1, :cond_7

    .line 93
    .line 94
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->o:Landroid/widget/TextView;

    .line 95
    .line 96
    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 97
    .line 98
    .line 99
    :cond_7
    iget-object p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->h:Landroid/widget/EditText;

    .line 100
    .line 101
    invoke-static {p1, p2}, Lz1/b;->e(Landroid/widget/EditText;I)V

    .line 102
    .line 103
    .line 104
    sget-object p1, Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;->a:Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;

    .line 105
    .line 106
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->f(Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;)Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    xor-int/lit8 p2, v2, 0x1

    .line 111
    .line 112
    invoke-virtual {p1, p2}, Landroid/view/View;->setEnabled(Z)V

    .line 113
    .line 114
    .line 115
    :cond_8
    return-void
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;

    .line 6
    .line 7
    sget-object v1, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->a:[I

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    aget v1, v1, v2

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    if-eq v1, v2, :cond_7

    .line 17
    .line 18
    const/4 v2, 0x2

    .line 19
    if-eq v1, v2, :cond_5

    .line 20
    .line 21
    const/4 v2, 0x3

    .line 22
    if-eq v1, v2, :cond_0

    .line 23
    .line 24
    goto/16 :goto_0

    .line 25
    .line 26
    :cond_0
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 32
    .line 33
    iget-object v1, v1, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->z:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$i;

    .line 34
    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    invoke-interface {v1, p0, v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$i;->a(Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;)V

    .line 38
    .line 39
    .line 40
    :cond_1
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 41
    .line 42
    iget-boolean v1, v1, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->E:Z

    .line 43
    .line 44
    if-nez v1, :cond_2

    .line 45
    .line 46
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->r(Landroid/view/View;)Z

    .line 47
    .line 48
    .line 49
    :cond_2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 50
    .line 51
    iget-boolean p1, p1, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->D:Z

    .line 52
    .line 53
    if-nez p1, :cond_3

    .line 54
    .line 55
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->q()Z

    .line 56
    .line 57
    .line 58
    :cond_3
    iget-object p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 59
    .line 60
    iget-object v1, p1, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->k0:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$h;

    .line 61
    .line 62
    if-eqz v1, :cond_4

    .line 63
    .line 64
    iget-object v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->h:Landroid/widget/EditText;

    .line 65
    .line 66
    if-eqz v2, :cond_4

    .line 67
    .line 68
    iget-boolean p1, p1, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->n0:Z

    .line 69
    .line 70
    if-nez p1, :cond_4

    .line 71
    .line 72
    invoke-virtual {v2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-interface {v1, p0, p1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$h;->a(Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;Ljava/lang/CharSequence;)V

    .line 77
    .line 78
    .line 79
    :cond_4
    iget-object p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 80
    .line 81
    iget-boolean p1, p1, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->N:Z

    .line 82
    .line 83
    if-eqz p1, :cond_9

    .line 84
    .line 85
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->dismiss()V

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_5
    iget-object p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 90
    .line 91
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    iget-object p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 95
    .line 96
    iget-object p1, p1, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->A:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$i;

    .line 97
    .line 98
    if-eqz p1, :cond_6

    .line 99
    .line 100
    invoke-interface {p1, p0, v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$i;->a(Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;)V

    .line 101
    .line 102
    .line 103
    :cond_6
    iget-object p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 104
    .line 105
    iget-boolean p1, p1, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->N:Z

    .line 106
    .line 107
    if-eqz p1, :cond_9

    .line 108
    .line 109
    invoke-virtual {p0}, Landroid/app/Dialog;->cancel()V

    .line 110
    .line 111
    .line 112
    goto :goto_0

    .line 113
    :cond_7
    iget-object p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 114
    .line 115
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    iget-object p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 119
    .line 120
    iget-object p1, p1, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->B:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$i;

    .line 121
    .line 122
    if-eqz p1, :cond_8

    .line 123
    .line 124
    invoke-interface {p1, p0, v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$i;->a(Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;)V

    .line 125
    .line 126
    .line 127
    :cond_8
    iget-object p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 128
    .line 129
    iget-boolean p1, p1, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->N:Z

    .line 130
    .line 131
    if-eqz p1, :cond_9

    .line 132
    .line 133
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->dismiss()V

    .line 134
    .line 135
    .line 136
    :cond_9
    :goto_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 137
    .line 138
    iget-object p1, p1, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->C:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$i;

    .line 139
    .line 140
    if-eqz p1, :cond_a

    .line 141
    .line 142
    invoke-interface {p1, p0, v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$i;->a(Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;)V

    .line 143
    .line 144
    .line 145
    :cond_a
    return-void
.end method

.method public final onShow(Landroid/content/DialogInterface;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->h:Landroid/widget/EditText;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 6
    .line 7
    invoke-virtual {p0, p0, v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->v(Landroid/content/DialogInterface;Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->h:Landroid/widget/EditText;

    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-lez v0, :cond_0

    .line 21
    .line 22
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->h:Landroid/widget/EditText;

    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setSelection(I)V

    .line 33
    .line 34
    .line 35
    :cond_0
    invoke-super {p0, p1}, Ly1/a;->onShow(Landroid/content/DialogInterface;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public bridge synthetic onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 0

    .line 1
    invoke-super {p0, p1}, Ly1/a;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

.method public final p()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->i:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 7
    .line 8
    iget-object v0, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->l:Ljava/util/ArrayList;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_2

    .line 17
    .line 18
    :cond_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 19
    .line 20
    iget-object v0, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->T:Landroidx/recyclerview/widget/RecyclerView$Adapter;

    .line 21
    .line 22
    if-nez v0, :cond_2

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 26
    .line 27
    iget-object v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->U:Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    .line 28
    .line 29
    if-nez v1, :cond_3

    .line 30
    .line 31
    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 32
    .line 33
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-direct {v1, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 38
    .line 39
    .line 40
    iput-object v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->U:Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    .line 41
    .line 42
    :cond_3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->i:Landroidx/recyclerview/widget/RecyclerView;

    .line 43
    .line 44
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    if-nez v0, :cond_4

    .line 49
    .line 50
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->i:Landroidx/recyclerview/widget/RecyclerView;

    .line 51
    .line 52
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 53
    .line 54
    iget-object v1, v1, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->U:Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    .line 55
    .line 56
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 57
    .line 58
    .line 59
    :cond_4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->i:Landroidx/recyclerview/widget/RecyclerView;

    .line 60
    .line 61
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 62
    .line 63
    iget-object v1, v1, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->T:Landroidx/recyclerview/widget/RecyclerView$Adapter;

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 66
    .line 67
    .line 68
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->t:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$ListType;

    .line 69
    .line 70
    if-eqz v0, :cond_5

    .line 71
    .line 72
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 73
    .line 74
    iget-object v0, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->T:Landroidx/recyclerview/widget/RecyclerView$Adapter;

    .line 75
    .line 76
    check-cast v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/a;

    .line 77
    .line 78
    invoke-virtual {v0, p0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/a;->h(Lcom/xuexiang/xui/widget/dialog/materialdialog/a$c;)V

    .line 79
    .line 80
    .line 81
    :cond_5
    :goto_0
    return-void
.end method

.method public final q()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    return v0
.end method

.method public final r(Landroid/view/View;)Z
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    return p1
.end method

.method public s()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->h:Landroid/widget/EditText;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    new-instance v1, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$d;

    .line 7
    .line 8
    invoke-direct {v1, p0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$d;-><init>(Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public bridge synthetic setContentView(I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Ly1/a;->setContentView(I)V

    return-void
.end method

.method public bridge synthetic setContentView(Landroid/view/View;)V
    .locals 0

    .line 2
    invoke-super {p0, p1}, Ly1/a;->setContentView(Landroid/view/View;)V

    return-void
.end method

.method public bridge synthetic setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    .line 3
    invoke-super {p0, p1, p2}, Ly1/a;->setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public final setTitle(I)V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    iget-object v0, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->a:Landroid/content/Context;

    invoke-virtual {v0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->setTitle(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final setTitle(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->f:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public show()V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 2
    .line 3
    iget-boolean v0, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->L0:Z

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    new-instance v1, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$b;

    .line 12
    .line 13
    invoke-direct {v1, p0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$b;-><init>(Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;)V

    .line 14
    .line 15
    .line 16
    invoke-static {v0, v1}, Lcom/xuexiang/xui/utils/f;->c(Landroid/view/Window;Lcom/xuexiang/xui/utils/f$a;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->w()V
    :try_end_0
    .catch Landroid/view/WindowManager$BadTokenException; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :catch_0
    new-instance v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$DialogException;

    .line 25
    .line 26
    const-string v1, "Bad window token, you cannot show a dialog before an Activity is created or after it\'s hidden."

    .line 27
    .line 28
    invoke-direct {v0, v1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$DialogException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw v0
.end method

.method public final t(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 2
    .line 3
    iget v0, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->g0:I

    .line 4
    .line 5
    const/4 v1, -0x2

    .line 6
    if-gt v0, v1, :cond_0

    .line 7
    .line 8
    const-string p1, "MaterialDialog"

    .line 9
    .line 10
    const-string v0, "Calling setProgress(int) on an indeterminate progress dialog has no effect!"

    .line 11
    .line 12
    invoke-static {p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->l:Landroid/widget/ProgressBar;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->d:Landroid/os/Handler;

    .line 22
    .line 23
    new-instance v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$c;

    .line 24
    .line 25
    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$c;-><init>(Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public final u(Landroid/widget/TextView;Landroid/graphics/Typeface;)V
    .locals 1

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    invoke-virtual {p1}, Landroid/widget/TextView;->getPaintFlags()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    or-int/lit16 v0, v0, 0x80

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setPaintFlags(I)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final v(Landroid/content/DialogInterface;Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;)V
    .locals 2

    .line 1
    check-cast p1, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->j()Landroid/widget/EditText;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->j()Landroid/widget/EditText;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    new-instance v1, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$e;

    .line 15
    .line 16
    invoke-direct {v1, p0, p1, p2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$e;-><init>(Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final w()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/app/Dialog;->show()V

    .line 2
    .line 3
    .line 4
    return-void
.end method
