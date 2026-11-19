.class public final synthetic Landroidx/navigation/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/c;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/navigation/a;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Landroidx/navigation/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lp4/b;

    .line 7
    .line 8
    const-string v0, "it"

    .line 9
    .line 10
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    iget-object p1, p1, Lp4/b;->a:Ljava/lang/String;

    .line 14
    .line 15
    return-object p1

    .line 16
    :pswitch_0
    check-cast p1, Lcom/zykj/mistake/feature/ask/y;

    .line 17
    .line 18
    const-string v0, "it"

    .line 19
    .line 20
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iget-object p1, p1, Lcom/zykj/mistake/feature/ask/y;->a:Ljava/lang/String;

    .line 24
    .line 25
    return-object p1

    .line 26
    :pswitch_1
    check-cast p1, Lcom/zykj/mistake/feature/ask/y;

    .line 27
    .line 28
    const-string v0, "it"

    .line 29
    .line 30
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    iget-object p1, p1, Lcom/zykj/mistake/feature/ask/y;->a:Ljava/lang/String;

    .line 34
    .line 35
    return-object p1

    .line 36
    :pswitch_2
    check-cast p1, Lcom/zykj/mistake/feature/ask/y;

    .line 37
    .line 38
    const-string v0, "it"

    .line 39
    .line 40
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    iget-object p1, p1, Lcom/zykj/mistake/feature/ask/y;->a:Ljava/lang/String;

    .line 44
    .line 45
    return-object p1

    .line 46
    :pswitch_3
    check-cast p1, Lcoil3/compose/i;

    .line 47
    .line 48
    return-object p1

    .line 49
    :pswitch_4
    check-cast p1, Ljava/util/List;

    .line 50
    .line 51
    invoke-static {p1}, Landroidx/savedstate/serialization/SavedStateConfig_androidKt;->a(Ljava/util/List;)Li7/b;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    return-object p1

    .line 56
    :pswitch_5
    check-cast p1, Landroidx/navigation/NavDestination;

    .line 57
    .line 58
    invoke-static {p1}, Landroidx/navigation/internal/NavGraphImpl;->a(Landroidx/navigation/NavDestination;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    return-object p1

    .line 63
    :pswitch_6
    check-cast p1, Landroidx/navigation/NavOptionsBuilder;

    .line 64
    .line 65
    invoke-static {p1}, Landroidx/navigation/internal/NavControllerImpl;->l(Landroidx/navigation/NavOptionsBuilder;)Ld6/s;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    return-object p1

    .line 70
    :pswitch_7
    check-cast p1, Landroidx/navigation/NavBackStackEntry;

    .line 71
    .line 72
    invoke-static {p1}, Landroidx/navigation/internal/NavControllerImpl;->e(Landroidx/navigation/NavBackStackEntry;)Ld6/s;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    return-object p1

    .line 77
    :pswitch_8
    check-cast p1, Landroidx/navigation/NavDestination;

    .line 78
    .line 79
    invoke-static {p1}, Landroidx/navigation/internal/NavControllerImpl;->m(Landroidx/navigation/NavDestination;)I

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    return-object p1

    .line 88
    :pswitch_9
    check-cast p1, Landroidx/navigation/NavDestination;

    .line 89
    .line 90
    invoke-static {p1}, Landroidx/navigation/internal/NavControllerImpl;->k(Landroidx/navigation/NavDestination;)Landroidx/navigation/NavDestination;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    return-object p1

    .line 95
    :pswitch_a
    check-cast p1, Landroidx/navigation/NavDestination;

    .line 96
    .line 97
    invoke-static {p1}, Landroidx/navigation/internal/NavControllerImpl;->j(Landroidx/navigation/NavDestination;)Landroidx/navigation/NavDestination;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    return-object p1

    .line 102
    :pswitch_b
    check-cast p1, Landroidx/navigation/NavBackStackEntry;

    .line 103
    .line 104
    invoke-static {p1}, Landroidx/navigation/internal/NavControllerImpl;->d(Landroidx/navigation/NavBackStackEntry;)Ld6/s;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    return-object p1

    .line 109
    :pswitch_c
    check-cast p1, Landroidx/lifecycle/viewmodel/CreationExtras;

    .line 110
    .line 111
    invoke-static {p1}, Landroidx/navigation/internal/NavBackStackEntryImpl;->a(Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/navigation/internal/NavBackStackEntryImpl$SavedStateViewModel;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    return-object p1

    .line 116
    :pswitch_d
    check-cast p1, Landroidx/navigation/NavOptionsBuilder;

    .line 117
    .line 118
    invoke-static {p1}, Landroidx/navigation/Navigator;->a(Landroidx/navigation/NavOptionsBuilder;)Ld6/s;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    return-object p1

    .line 123
    :pswitch_e
    check-cast p1, Landroid/view/View;

    .line 124
    .line 125
    invoke-static {p1}, Landroidx/navigation/Navigation;->b(Landroid/view/View;)Landroidx/navigation/NavController;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    return-object p1

    .line 130
    :pswitch_f
    check-cast p1, Landroid/view/View;

    .line 131
    .line 132
    invoke-static {p1}, Landroidx/navigation/Navigation;->a(Landroid/view/View;)Landroid/view/View;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    return-object p1

    .line 137
    :pswitch_10
    check-cast p1, Landroidx/navigation/PopUpToBuilder;

    .line 138
    .line 139
    invoke-static {p1}, Landroidx/navigation/NavOptionsBuilder;->a(Landroidx/navigation/PopUpToBuilder;)Ld6/s;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    return-object p1

    .line 144
    :pswitch_11
    check-cast p1, Landroidx/navigation/PopUpToBuilder;

    .line 145
    .line 146
    invoke-static {p1}, Landroidx/navigation/NavOptionsBuilder;->b(Landroidx/navigation/PopUpToBuilder;)Ld6/s;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    return-object p1

    .line 151
    :pswitch_12
    check-cast p1, Landroidx/navigation/PopUpToBuilder;

    .line 152
    .line 153
    invoke-static {p1}, Landroidx/navigation/NavOptionsBuilder;->c(Landroidx/navigation/PopUpToBuilder;)Ld6/s;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    return-object p1

    .line 158
    :pswitch_13
    check-cast p1, Landroidx/navigation/NavDestination;

    .line 159
    .line 160
    invoke-static {p1}, Landroidx/navigation/NavGraphBuilder;->a(Landroidx/navigation/NavDestination;)Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    return-object p1

    .line 165
    :pswitch_14
    check-cast p1, Landroidx/navigation/NavDestination;

    .line 166
    .line 167
    invoke-static {p1}, Landroidx/navigation/NavGraph$Companion;->a(Landroidx/navigation/NavDestination;)Landroidx/navigation/NavDestination;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    return-object p1

    .line 172
    :pswitch_15
    check-cast p1, Landroidx/navigation/NavDestination;

    .line 173
    .line 174
    invoke-static {p1}, Landroidx/navigation/NavDestination$Companion;->a(Landroidx/navigation/NavDestination;)Landroidx/navigation/NavDestination;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    return-object p1

    .line 179
    :pswitch_16
    check-cast p1, Landroid/content/Context;

    .line 180
    .line 181
    invoke-static {p1}, Landroidx/navigation/NavDeepLinkBuilder;->a(Landroid/content/Context;)Landroid/app/Activity;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    return-object p1

    .line 186
    :pswitch_17
    check-cast p1, Landroid/content/Context;

    .line 187
    .line 188
    invoke-static {p1}, Landroidx/navigation/NavDeepLinkBuilder;->b(Landroid/content/Context;)Landroid/content/Context;

    .line 189
    .line 190
    .line 191
    move-result-object p1

    .line 192
    return-object p1

    .line 193
    :pswitch_18
    check-cast p1, Landroidx/lifecycle/viewmodel/CreationExtras;

    .line 194
    .line 195
    invoke-static {p1}, Landroidx/navigation/NavControllerViewModelKt;->a(Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/navigation/NavControllerViewModel;

    .line 196
    .line 197
    .line 198
    move-result-object p1

    .line 199
    return-object p1

    .line 200
    :pswitch_19
    check-cast p1, Landroid/content/Context;

    .line 201
    .line 202
    invoke-static {p1}, Landroidx/navigation/NavController;->a(Landroid/content/Context;)Landroid/content/Context;

    .line 203
    .line 204
    .line 205
    move-result-object p1

    .line 206
    return-object p1

    .line 207
    :pswitch_1a
    check-cast p1, Landroidx/navigation/PopUpToBuilder;

    .line 208
    .line 209
    invoke-static {p1}, Landroidx/navigation/NavController;->d(Landroidx/navigation/PopUpToBuilder;)Ld6/s;

    .line 210
    .line 211
    .line 212
    move-result-object p1

    .line 213
    return-object p1

    .line 214
    :pswitch_1b
    check-cast p1, Landroidx/navigation/AnimBuilder;

    .line 215
    .line 216
    invoke-static {p1}, Landroidx/navigation/NavController;->f(Landroidx/navigation/AnimBuilder;)Ld6/s;

    .line 217
    .line 218
    .line 219
    move-result-object p1

    .line 220
    return-object p1

    .line 221
    :pswitch_1c
    check-cast p1, Landroid/content/Context;

    .line 222
    .line 223
    invoke-static {p1}, Landroidx/navigation/ActivityNavigator;->c(Landroid/content/Context;)Landroid/content/Context;

    .line 224
    .line 225
    .line 226
    move-result-object p1

    .line 227
    return-object p1

    .line 228
    nop

    .line 229
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
